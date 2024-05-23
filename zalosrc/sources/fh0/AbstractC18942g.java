package fh0;

import am.AbstractC0924m0;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import hh0.AbstractC20064b;
import hh0.C20063a;
import ho0.AbstractC20110a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.zalo.startuphelper.AbstractC23000d;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p221hy.C20166b;
import p327lm.C22522b;
import p327lm.C22523c;
import p327lm.C22528h;

/* renamed from: fh0.g */
/* loaded from: classes.dex */
public abstract class AbstractC18942g {

    /* renamed from: a */
    private static String f94473a = null;

    /* renamed from: b */
    private static volatile boolean f94474b = false;

    /* renamed from: c */
    private static Application f94475c;

    /* renamed from: d */
    private static long f94476d;

    /* renamed from: c */
    private static void m99247c() {
        Application application;
        if (!f94474b && (application = f94475c) != null) {
            m99251g(application);
        }
    }

    /* renamed from: d */
    public static Intent m99248d(Context context, Map map) {
        try {
            AbstractC20110a.m104542k(8, "createOpenAppNotificationDataIntent: %s", new JSONObject(map));
            if (AbstractC23000d.m117851i(context, map)) {
                return AbstractC23000d.m117847e(context, map, false);
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: e */
    public static String m99249e() {
        try {
            m99247c();
            String m116537e = C22528h.m116533g().m116537e();
            if (!TextUtils.isEmpty(m116537e)) {
                return m116537e;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicReference atomicReference = new AtomicReference(null);
            C22528h.m116533g().m116538f(new C22523c.a() { // from class: fh0.e
                @Override // p327lm.C22523c.a
                /* renamed from: a */
                public final void mo99243a(String str) {
                    AbstractC18942g.m99254j(atomicReference, atomicBoolean, str);
                }
            });
            synchronized (atomicBoolean) {
                if (!atomicBoolean.get() && Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
                    try {
                        atomicBoolean.wait(3000L);
                    } catch (InterruptedException e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
            }
            AbstractC20110a.m104542k(8, "getDeviceId - %s", atomicReference.get());
            if (atomicReference.get() != null) {
                return (String) atomicReference.get();
            }
            return "";
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
            return "";
        }
    }

    /* renamed from: f */
    public static String m99250f() {
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            AbstractC20110a.m104542k(8, "getPreloadedValue - cache %s", f94473a);
            String str = f94473a;
            if (str != null) {
                return str;
            }
            m99247c();
            AbstractC20110a.m104542k(8, "getPreloadedValue - read from sdk", new Object[0]);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C22528h.m116533g().m116541j(CoreUtility.getAppContext(), new AbstractC20064b.b() { // from class: fh0.f
                @Override // hh0.AbstractC20064b.b
                /* renamed from: a */
                public final void mo99244a(boolean z11, String str2) {
                    AbstractC18942g.m99255k(currentTimeMillis, atomicBoolean, z11, str2);
                }
            });
            synchronized (atomicBoolean) {
                if (!atomicBoolean.get() && Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
                    try {
                        atomicBoolean.wait(3000L);
                    } catch (InterruptedException e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
            }
            String str2 = f94473a;
            if (str2 != null) {
                return str2;
            }
            return "unknown";
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
            return "unknown";
        }
    }

    /* renamed from: g */
    public static synchronized void m99251g(Application application) {
        synchronized (AbstractC18942g.class) {
            try {
                try {
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                if (f94474b) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC18939d.m99241b(application);
                AbstractC18939d.m99240a(false);
                C22528h.m116533g().m116540i(application, "");
                C22523c.m116498g().m116509l(application, new C22522b(application), "");
                long m3917j1 = AbstractC0924m0.m3917j1();
                if (m3917j1 <= 0) {
                    m3917j1 = Long.parseLong(C20063a.m104236e(application.getApplicationContext()));
                    AbstractC0924m0.m3373Qh(m3917j1);
                }
                C20063a.m104250s(application.getApplicationContext(), m3917j1);
                AbstractC20110a.m104542k(8, "initZaloSdk: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                f94474b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public static boolean m99252h(Context context, Map map) {
        try {
            AbstractC20110a.m104542k(8, "isOpenAppNotificationData: %s", new JSONObject(map));
            boolean m117851i = AbstractC23000d.m117851i(context, map);
            AbstractC20110a.m104542k(8, "isOpenAppNotificationData: %s", String.valueOf(m117851i));
            return m117851i;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m99253i() {
        String m99250f = m99250f();
        AbstractC20110a.m104542k(8, "isPreloadedDevice: " + m99250f, new Object[0]);
        if ("unknown".equals(m99250f) || TextUtils.isEmpty(m99250f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m99254j(AtomicReference atomicReference, AtomicBoolean atomicBoolean, String str) {
        atomicReference.set(str);
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
            atomicBoolean.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m99255k(long j11, AtomicBoolean atomicBoolean, boolean z11, String str) {
        AbstractC20110a.m104542k(8, "getPreloadedValue onResult: %s - %s in %d(ms)", String.valueOf(z11), str, Long.valueOf(System.currentTimeMillis() - j11));
        if (z11) {
            f94473a = str;
        } else {
            f94473a = "unknown";
        }
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
            atomicBoolean.notifyAll();
        }
    }

    /* renamed from: l */
    public static void m99256l(Context context, Map map) {
        try {
            AbstractC20110a.m104542k(8, "logReceiveOpenAppNotification: %s", new JSONObject(map));
            AbstractC23000d.m117847e(context, map, true);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: m */
    public static void m99257m(Context context) {
        try {
            AbstractC23000d.m117855m(context);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n */
    public static void m99258n(Intent intent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            m99247c();
            if (!m99253i()) {
                AbstractC20110a.m104542k(8, "onStartupViewShow: not init on preloaded device", new Object[0]);
                return;
            }
            AbstractC20110a.m104542k(8, "onStartupViewShow", new Object[0]);
            if (intent != null) {
                if (AbstractC23000d.m117852j(CoreUtility.getAppContext(), intent)) {
                    AbstractC20110a.m104542k(8, "onStartupViewShow setOpenAppSource", new Object[0]);
                    AbstractC23000d.m117858p(CoreUtility.getAppContext(), intent);
                } else {
                    AbstractC20110a.m104542k(8, "onStartupViewShow sendEventOpenApp", new Object[0]);
                    AbstractC23000d.m117856n(CoreUtility.getAppContext(), null);
                    AbstractC20110a.m104543l("ZaloSdkWrapper").mo104548a("sendEventOpenApp ... firstTimeOpenApp ... %s", Long.valueOf(C20063a.m104238g(CoreUtility.getAppContext())));
                }
            } else {
                AbstractC20110a.m104542k(8, "onStartupViewShow null intentStart", new Object[0]);
            }
            AbstractC20110a.m104542k(8, "onStartupViewShow: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: o */
    public static void m99259o(Application application) {
        f94475c = application;
    }

    /* renamed from: p */
    public static void m99260p(Context context, String str) {
        try {
            m99247c();
            AbstractC20110a.m104542k(8, "setFirebaseTokenToSdk: " + str, new Object[0]);
            AbstractC23000d.m117857o(context, str);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: q */
    public static void m99261q(Context context) {
        try {
            if (!m99253i()) {
                AbstractC20110a.m104542k(8, "not wakeup on non-preloaded device", new Object[0]);
                return;
            }
            if (Math.abs(SystemClock.uptimeMillis() - f94476d) < 300000) {
                return;
            }
            AbstractC20110a.m104542k(8, "wakeupOtherZAApps on preloaded device", new Object[0]);
            AbstractC23000d.m117854l(context);
            f94476d = SystemClock.uptimeMillis();
            String m105151c = C20166b.Companion.m105162b().m105151c(context);
            if (!TextUtils.isEmpty(m105151c)) {
                AbstractC23000d.m117857o(context, m105151c);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
