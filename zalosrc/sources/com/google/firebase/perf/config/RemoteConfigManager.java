package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.firebase.AbstractC6596l;
import com.google.firebase.C6576e;
import com.google.firebase.remoteconfig.C6714a;
import com.google.firebase.remoteconfig.C6716c;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p015a9.InterfaceC0662b;
import p319l9.C22152a;
import p342m6.InterfaceC22880f;
import p342m6.InterfaceC22882g;
import p476r9.C25699g;
import p541u9.InterfaceC27202j;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, InterfaceC27202j> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final C6685x cache;
    private final Executor executor;
    private C6714a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private InterfaceC0662b firebaseRemoteConfigProvider;
    private static final C22152a logger = C22152a.m115524e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(C6685x.m34120e(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    static long getInitialStartupMillis() {
        AbstractC6596l abstractC6596l = (AbstractC6596l) C6576e.m33601k().m33611i(AbstractC6596l.class);
        if (abstractC6596l != null) {
            return abstractC6596l.mo33459c();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private InterfaceC27202j getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            InterfaceC27202j interfaceC27202j = this.allRcConfigMap.get(str);
            if (interfaceC27202j.mo34511h() == 2) {
                logger.m115526b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", interfaceC27202j.mo34507a(), str);
                return interfaceC27202j;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j11) {
        return j11 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j11) {
        return j11 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m34030xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.m34316h());
    }

    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m34031xc904e814(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.m34315g().mo117577f(this.executor, new InterfaceC22882g() { // from class: com.google.firebase.perf.config.y
            public /* synthetic */ C6686y() {
            }

            @Override // p342m6.InterfaceC22882g
            public final void onSuccess(Object obj) {
                RemoteConfigManager.this.m34030xc904e813((Boolean) obj);
            }
        }).mo117575d(this.executor, new InterfaceC22880f() { // from class: com.google.firebase.perf.config.z
            public /* synthetic */ C6687z() {
            }

            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
                RemoteConfigManager.this.m34031xc904e814(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.m34316h());
        }
        if (shouldFetchAndActivateRemoteConfigValues()) {
            triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public C25699g getBoolean(String str) {
        if (str == null) {
            logger.m115525a("The key to get Remote Config boolean value is null.");
            return C25699g.m132609a();
        }
        InterfaceC27202j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C25699g.m132611e(Boolean.valueOf(remoteConfigValue.mo34510d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo34507a().isEmpty()) {
                    logger.m115526b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo34507a(), str);
                }
            }
        }
        return C25699g.m132609a();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C25699g getFloat(String str) {
        if (str == null) {
            logger.m115525a("The key to get Remote Config float value is null.");
            return C25699g.m132609a();
        }
        InterfaceC27202j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C25699g.m132611e(Float.valueOf(Double.valueOf(remoteConfigValue.mo34509c()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo34507a().isEmpty()) {
                    logger.m115526b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo34507a(), str);
                }
            }
        }
        return C25699g.m132609a();
    }

    public C25699g getLong(String str) {
        if (str == null) {
            logger.m115525a("The key to get Remote Config long value is null.");
            return C25699g.m132609a();
        }
        InterfaceC27202j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C25699g.m132611e(Long.valueOf(remoteConfigValue.mo34508b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo34507a().isEmpty()) {
                    logger.m115526b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo34507a(), str);
                }
            }
        }
        return C25699g.m132609a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t7) {
        Object obj;
        InterfaceC27202j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t7 instanceof Boolean) {
                    obj = Boolean.valueOf(remoteConfigValue.mo34510d());
                } else if (t7 instanceof Float) {
                    obj = Float.valueOf(Double.valueOf(remoteConfigValue.mo34509c()).floatValue());
                } else {
                    if (!(t7 instanceof Long) && !(t7 instanceof Integer)) {
                        if (t7 instanceof String) {
                            obj = remoteConfigValue.mo34507a();
                        } else {
                            T t11 = (T) remoteConfigValue.mo34507a();
                            try {
                                logger.m115526b("No matching type found for the defaultValue: '%s', using String.", t7);
                                return t11;
                            } catch (IllegalArgumentException unused) {
                                t7 = t11;
                                if (!remoteConfigValue.mo34507a().isEmpty()) {
                                    logger.m115526b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo34507a(), str);
                                    return t7;
                                }
                                return t7;
                            }
                        }
                    }
                    obj = Long.valueOf(remoteConfigValue.mo34508b());
                }
                return obj;
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            return t7;
        }
    }

    public C25699g getString(String str) {
        if (str == null) {
            logger.m115525a("The key to get Remote Config String value is null.");
            return C25699g.m132609a();
        }
        InterfaceC27202j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return C25699g.m132611e(remoteConfigValue.mo34507a());
        }
        return C25699g.m132609a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        InterfaceC0662b interfaceC0662b;
        C6716c c6716c;
        if (this.firebaseRemoteConfig == null && (interfaceC0662b = this.firebaseRemoteConfigProvider) != null && (c6716c = (C6716c) interfaceC0662b.get()) != null) {
            this.firebaseRemoteConfig = c6716c.m34332d(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        C6714a c6714a = this.firebaseRemoteConfig;
        if (c6714a == null || c6714a.m34317i().mo34500a() == 1) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(InterfaceC0662b interfaceC0662b) {
        this.firebaseRemoteConfigProvider = interfaceC0662b;
    }

    protected void syncConfigValues(Map<String, InterfaceC27202j> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        C6665d m34079e = C6665d.m34079e();
        InterfaceC27202j interfaceC27202j = this.allRcConfigMap.get(m34079e.mo34080c());
        if (interfaceC27202j != null) {
            try {
                this.cache.m34130m(m34079e.mo34078a(), interfaceC27202j.mo34510d());
                return;
            } catch (Exception unused) {
                logger.m115525a("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.m115525a("ExperimentTTID remote config flag does not exist.");
    }

    RemoteConfigManager(C6685x c6685x, Executor executor, C6714a c6714a, long j11, long j12) {
        ConcurrentHashMap<String, InterfaceC27202j> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = c6685x;
        this.executor = executor;
        this.firebaseRemoteConfig = c6714a;
        if (c6714a == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>((Map<? extends String, ? extends InterfaceC27202j>) c6714a.m34316h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j12;
        this.appStartConfigFetchDelayInMs = j11;
    }
}
