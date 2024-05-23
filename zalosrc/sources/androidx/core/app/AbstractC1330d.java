package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1330d {

    /* renamed from: a */
    protected static final Class f5896a;

    /* renamed from: b */
    protected static final Field f5897b;

    /* renamed from: c */
    protected static final Field f5898c;

    /* renamed from: d */
    protected static final Method f5899d;

    /* renamed from: e */
    protected static final Method f5900e;

    /* renamed from: f */
    protected static final Method f5901f;

    /* renamed from: g */
    private static final Handler f5902g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.d$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ d f5903p;

        /* renamed from: q */
        final /* synthetic */ Object f5904q;

        a(d dVar, Object obj) {
            this.f5903p = dVar;
            this.f5904q = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5903p.f5909p = this.f5904q;
        }
    }

    /* renamed from: androidx.core.app.d$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Application f5905p;

        /* renamed from: q */
        final /* synthetic */ d f5906q;

        b(Application application, d dVar) {
            this.f5905p = application;
            this.f5906q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5905p.unregisterActivityLifecycleCallbacks(this.f5906q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.d$c */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Object f5907p;

        /* renamed from: q */
        final /* synthetic */ Object f5908q;

        c(Object obj, Object obj2) {
            this.f5907p = obj;
            this.f5908q = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC1330d.f5899d;
                if (method != null) {
                    method.invoke(this.f5907p, this.f5908q, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC1330d.f5900e.invoke(this.f5907p, this.f5908q, Boolean.FALSE);
                }
            } catch (RuntimeException e11) {
                if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                    throw e11;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: androidx.core.app.d$d */
    /* loaded from: classes2.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: p */
        Object f5909p;

        /* renamed from: q */
        private Activity f5910q;

        /* renamed from: r */
        private final int f5911r;

        /* renamed from: s */
        private boolean f5912s = false;

        /* renamed from: t */
        private boolean f5913t = false;

        /* renamed from: u */
        private boolean f5914u = false;

        d(Activity activity) {
            this.f5910q = activity;
            this.f5911r = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f5910q == activity) {
                this.f5910q = null;
                this.f5913t = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f5913t && !this.f5914u && !this.f5912s && AbstractC1330d.m6676h(this.f5909p, this.f5911r, activity)) {
                this.f5914u = true;
                this.f5909p = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f5910q == activity) {
                this.f5912s = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class m6669a = m6669a();
        f5896a = m6669a;
        f5897b = m6670b();
        f5898c = m6674f();
        f5899d = m6672d(m6669a);
        f5900e = m6671c(m6669a);
        f5901f = m6673e(m6669a);
    }

    /* renamed from: a */
    private static Class m6669a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m6670b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m6671c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m6672d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m6673e(Class cls) {
        if (m6675g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m6674f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m6675g() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 == 26 || i11 == 27;
    }

    /* renamed from: h */
    protected static boolean m6676h(Object obj, int i11, Activity activity) {
        try {
            Object obj2 = f5898c.get(activity);
            if (obj2 == obj && activity.hashCode() == i11) {
                f5902g.postAtFrontOfQueue(new c(f5897b.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m6677i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m6675g() && f5901f == null) {
            return false;
        }
        if (f5900e == null && f5899d == null) {
            return false;
        }
        try {
            Object obj2 = f5898c.get(activity);
            if (obj2 == null || (obj = f5897b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f5902g;
            handler.post(new a(dVar, obj2));
            try {
                if (m6675g()) {
                    Method method = f5901f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th2) {
                f5902g.post(new b(application, dVar));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
