package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p229i5.AbstractC20284e;

/* loaded from: classes2.dex */
public final class dj0 {

    /* renamed from: a */
    private final AtomicReference f19259a = new AtomicReference(null);

    /* renamed from: b */
    private final Object f19260b = new Object();

    /* renamed from: c */
    private String f19261c = null;

    /* renamed from: d */
    private String f19262d = null;

    /* renamed from: e */
    final AtomicBoolean f19263e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f19264f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference f19265g = new AtomicReference(null);

    /* renamed from: h */
    private final AtomicReference f19266h = new AtomicReference(null);

    /* renamed from: i */
    private final ConcurrentMap f19267i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference f19268j = new AtomicReference(null);

    /* renamed from: k */
    private final BlockingQueue f19269k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    private final Object f19270l = new Object();

    /* renamed from: A */
    static final boolean m21395A(Context context) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21237f0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m19918a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21247g0)).intValue()) {
            return false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21257h0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: B */
    private final Object m21396B(String str, Object obj, bj0 bj0Var) {
        synchronized (this.f19268j) {
            try {
                if (((rs0) this.f19268j.get()) != null) {
                    try {
                        return bj0Var.mo20529a((rs0) this.f19268j.get());
                    } catch (Exception unused) {
                        m21402c(str, false);
                    }
                }
                return obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: C */
    private final Object m21397C(String str, Context context) {
        if (!m21404e(context, "com.google.android.gms.measurement.AppMeasurement", this.f19265g, true)) {
            return null;
        }
        try {
            return m21398D(context, str).invoke(this.f19265g.get(), new Object[0]);
        } catch (Exception unused) {
            m21402c(str, true);
            return null;
        }
    }

    /* renamed from: D */
    private final Method m21398D(Context context, String str) {
        Method method = (Method) this.f19267i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f19267i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m21402c(str, false);
            return null;
        }
    }

    /* renamed from: E */
    private final ExecutorService m21399E() {
        ExecutorService threadPoolExecutor;
        if (this.f19259a.get() == null) {
            if (AbstractC20284e.m105912a()) {
                threadPoolExecutor = l23.m24108a().mo23117c(((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21227e0)).intValue(), new aj0(this), 2);
            } else {
                AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21227e0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzay.zzc().m21823b(abstractC5184xw)).intValue(), ((Integer) zzay.zzc().m21823b(abstractC5184xw)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new aj0(this));
            }
            mi0.m24604a(this.f19259a, null, threadPoolExecutor);
        }
        return (ExecutorService) this.f19259a.get();
    }

    /* renamed from: a */
    private final void m21400a(Context context, String str, String str2) {
        if (m21404e(context, "com.google.android.gms.measurement.AppMeasurement", this.f19265g, true)) {
            Method method = (Method) this.f19267i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f19267i.put(str2, method);
                } catch (Exception unused) {
                    m21402c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f19265g.get(), str);
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                m21402c(str2, false);
            }
        }
    }

    /* renamed from: b */
    private final void m21401b(Context context, String str, String str2, Bundle bundle) {
        if (m21425z(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e11) {
                yk0.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e11);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m21395A(context)) {
                m21403d("logEventInternal", new cj0() { // from class: com.google.android.gms.internal.ads.pi0

                    /* renamed from: a */
                    public final /* synthetic */ String f26225a;

                    /* renamed from: b */
                    public final /* synthetic */ Bundle f26226b;

                    public /* synthetic */ pi0(String str3, Bundle bundle22) {
                        r1 = str3;
                        r2 = bundle22;
                    }

                    @Override // com.google.android.gms.internal.ads.cj0
                    /* renamed from: a */
                    public final void mo20909a(rs0 rs0Var) {
                        rs0Var.mo24176l4("am", r1, r2);
                    }
                });
                return;
            }
            if (m21404e(context, "com.google.android.gms.measurement.AppMeasurement", this.f19265g, true)) {
                Method method = (Method) this.f19267i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f19267i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m21402c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f19265g.get(), "am", str3, bundle22);
                } catch (Exception unused2) {
                    m21402c("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m21402c(String str, boolean z11) {
        if (!this.f19263e.get()) {
            yk0.zzj("Invoke Firebase method " + str + " error.");
            if (z11) {
                yk0.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f19263e.set(true);
            }
        }
    }

    /* renamed from: d */
    private final void m21403d(String str, cj0 cj0Var) {
        synchronized (this.f19268j) {
            try {
                FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.qi0

                    /* renamed from: q */
                    public final /* synthetic */ cj0 f26792q;

                    /* renamed from: r */
                    public final /* synthetic */ String f26793r;

                    public /* synthetic */ qi0(cj0 cj0Var2, String str2) {
                        r2 = cj0Var2;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dj0.this.m21414o(r2, r3);
                    }
                }, null);
                if (this.f19268j.get() != null) {
                    futureTask.run();
                } else {
                    this.f19269k.offer(futureTask);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    private final boolean m21404e(Context context, String str, AtomicReference atomicReference, boolean z11) {
        if (atomicReference.get() == null) {
            try {
                mi0.m24604a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                m21402c("getInstance", z11);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m21405f(Context context) {
        if (!m21425z(context)) {
            return null;
        }
        if (m21395A(context)) {
            Long l11 = (Long) m21396B("getAdEventId", null, ri0.f27226a);
            if (l11 == null) {
                return null;
            }
            return Long.toString(l11.longValue());
        }
        Object m21397C = m21397C("generateEventId", context);
        if (m21397C == null) {
            return null;
        }
        return m21397C.toString();
    }

    /* renamed from: g */
    public final String m21406g(Context context) {
        if (!m21425z(context)) {
            return null;
        }
        synchronized (this.f19260b) {
            try {
                String str = this.f19262d;
                if (str != null) {
                    return str;
                }
                if (m21395A(context)) {
                    this.f19262d = (String) m21396B("getAppIdOrigin", this.f19262d, vi0.f29322a);
                } else {
                    this.f19262d = "fa";
                }
                return this.f19262d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final String m21407h(Context context) {
        if (!m21425z(context)) {
            return null;
        }
        long longValue = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21217d0)).longValue();
        if (m21395A(context)) {
            try {
                if (longValue < 0) {
                    return (String) m21396B("getAppInstanceId", null, wi0.f29931a);
                }
                return (String) m21399E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.xi0
                    public /* synthetic */ xi0() {
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return dj0.this.m21410k();
                    }
                }).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (longValue < 0) {
            return (String) m21397C("getAppInstanceId", context);
        }
        try {
            return (String) m21399E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.yi0

                /* renamed from: b */
                public final /* synthetic */ Context f30960b;

                public /* synthetic */ yi0(Context context2) {
                    r2 = context2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return dj0.this.m21411l(r2);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    /* renamed from: i */
    public final String m21408i(Context context) {
        if (!m21425z(context)) {
            return "";
        }
        if (m21395A(context)) {
            return (String) m21396B("getCurrentScreenNameOrScreenClass", "", si0.f27703a);
        }
        if (!m21404e(context, "com.google.android.gms.measurement.AppMeasurement", this.f19265g, true)) {
            return "";
        }
        try {
            String str = (String) m21398D(context, "getCurrentScreenName").invoke(this.f19265g.get(), new Object[0]);
            if (str == null) {
                str = (String) m21398D(context, "getCurrentScreenClass").invoke(this.f19265g.get(), new Object[0]);
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Exception unused) {
            m21402c("getCurrentScreenName", false);
            return "";
        }
    }

    /* renamed from: j */
    public final String m21409j(Context context) {
        if (!m21425z(context)) {
            return null;
        }
        synchronized (this.f19260b) {
            try {
                String str = this.f19261c;
                if (str != null) {
                    return str;
                }
                if (m21395A(context)) {
                    this.f19261c = (String) m21396B("getGmpAppId", this.f19261c, oi0.f25647a);
                } else {
                    this.f19261c = (String) m21397C("getGmpAppId", context);
                }
                return this.f19261c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final /* synthetic */ String m21410k() {
        return (String) m21396B("getAppInstanceId", null, wi0.f29931a);
    }

    /* renamed from: l */
    public final /* synthetic */ String m21411l(Context context) {
        return (String) m21397C("getAppInstanceId", context);
    }

    /* renamed from: m */
    public final void m21412m(Context context, String str) {
        if (!m21425z(context)) {
            return;
        }
        if (m21395A(context)) {
            m21403d("beginAdUnitExposure", new cj0() { // from class: com.google.android.gms.internal.ads.ni0

                /* renamed from: a */
                public final /* synthetic */ String f25200a;

                public /* synthetic */ ni0(String str2) {
                    r1 = str2;
                }

                @Override // com.google.android.gms.internal.ads.cj0
                /* renamed from: a */
                public final void mo20909a(rs0 rs0Var) {
                    rs0Var.mo24180x(r1);
                }
            });
        } else {
            m21400a(context, str2, "beginAdUnitExposure");
        }
    }

    /* renamed from: n */
    public final void m21413n(Context context, String str) {
        if (!m21425z(context)) {
            return;
        }
        if (m21395A(context)) {
            m21403d("endAdUnitExposure", new cj0() { // from class: com.google.android.gms.internal.ads.ui0

                /* renamed from: a */
                public final /* synthetic */ String f28920a;

                public /* synthetic */ ui0(String str2) {
                    r1 = str2;
                }

                @Override // com.google.android.gms.internal.ads.cj0
                /* renamed from: a */
                public final void mo20909a(rs0 rs0Var) {
                    rs0Var.zzn(r1);
                }
            });
        } else {
            m21400a(context, str2, "endAdUnitExposure");
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void m21414o(cj0 cj0Var, String str) {
        if (((rs0) this.f19268j.get()) != null) {
            try {
                cj0Var.mo20909a((rs0) this.f19268j.get());
            } catch (Exception unused) {
                m21402c(str, false);
            }
        }
    }

    /* renamed from: p */
    public final void m21415p(Context context, String str) {
        m21401b(context, "_aa", str, null);
    }

    /* renamed from: q */
    public final void m21416q(Context context, String str) {
        m21401b(context, "_aq", str, null);
    }

    /* renamed from: r */
    public final void m21417r(Context context, String str) {
        m21401b(context, "_ac", str, null);
    }

    /* renamed from: s */
    public final void m21418s(Context context, String str) {
        m21401b(context, "_ai", str, null);
    }

    /* renamed from: t */
    public final void m21419t(Context context, String str, String str2, String str3, int i11) {
        if (!m21425z(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i11);
        m21401b(context, "_ar", str, bundle);
        zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i11);
    }

    /* renamed from: u */
    public final void m21420u(Context context, zzl zzlVar) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21287k0)).booleanValue() && m21425z(context) && m21395A(context)) {
            synchronized (this.f19270l) {
            }
        }
    }

    /* renamed from: v */
    public final void m21421v(Context context, zzez zzezVar) {
        ej0.m21727d(context).mo21729b().m21719d(zzezVar);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21287k0)).booleanValue() && m21425z(context) && m21395A(context)) {
            synchronized (this.f19270l) {
            }
        }
    }

    /* renamed from: w */
    public final void m21422w(Bundle bundle) {
        m21403d("setConsent", new cj0() { // from class: com.google.android.gms.internal.ads.zi0

            /* renamed from: a */
            public final /* synthetic */ Bundle f31517a;

            public /* synthetic */ zi0(Bundle bundle2) {
                r1 = bundle2;
            }

            @Override // com.google.android.gms.internal.ads.cj0
            /* renamed from: a */
            public final void mo20909a(rs0 rs0Var) {
                rs0Var.mo24174P(r1);
            }
        });
    }

    /* renamed from: x */
    public final void m21423x(Context context, String str) {
        if (!m21425z(context) || !(context instanceof Activity)) {
            return;
        }
        if (m21395A(context)) {
            m21403d("setScreenName", new cj0() { // from class: com.google.android.gms.internal.ads.ti0

                /* renamed from: a */
                public final /* synthetic */ Context f28374a;

                /* renamed from: b */
                public final /* synthetic */ String f28375b;

                public /* synthetic */ ti0(Context context2, String str2) {
                    r1 = context2;
                    r2 = str2;
                }

                @Override // com.google.android.gms.internal.ads.cj0
                /* renamed from: a */
                public final void mo20909a(rs0 rs0Var) {
                    Context context2 = r1;
                    rs0Var.mo24181x1(BinderC4273d.m19913I3(context2), r2, context2.getPackageName());
                }
            });
            return;
        }
        if (m21404e(context2, "com.google.firebase.analytics.FirebaseAnalytics", this.f19266h, false)) {
            Method method = (Method) this.f19267i.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context2.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.f19267i.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    m21402c("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f19266h.get(), (Activity) context2, str2, context2.getPackageName());
            } catch (Exception unused2) {
                m21402c("setCurrentScreen", false);
            }
        }
    }

    /* renamed from: y */
    public final boolean m21424y() {
        synchronized (this.f19270l) {
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m21425z(Context context) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21168Y)).booleanValue() && !this.f19263e.get()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21267i0)).booleanValue()) {
                return true;
            }
            if (this.f19264f.get() == -1) {
                zzaw.zzb();
                if (!rk0.m26110t(context, AbstractC4150d.f16480a)) {
                    zzaw.zzb();
                    if (rk0.m26111u(context)) {
                        yk0.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f19264f.set(0);
                    }
                }
                this.f19264f.set(1);
            }
            if (this.f19264f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
