package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p229i5.AbstractC20295p;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C4077a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: t */
    private static final ComponentCallbacks2C4077a f16230t = new ComponentCallbacks2C4077a();

    /* renamed from: p */
    private final AtomicBoolean f16231p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicBoolean f16232q = new AtomicBoolean();

    /* renamed from: r */
    private final ArrayList f16233r = new ArrayList();

    /* renamed from: s */
    private boolean f16234s = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo19304a(boolean z11);
    }

    private ComponentCallbacks2C4077a() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C4077a m19298b() {
        return f16230t;
    }

    /* renamed from: c */
    public static void m19299c(Application application) {
        ComponentCallbacks2C4077a componentCallbacks2C4077a = f16230t;
        synchronized (componentCallbacks2C4077a) {
            try {
                if (!componentCallbacks2C4077a.f16234s) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C4077a);
                    application.registerComponentCallbacks(componentCallbacks2C4077a);
                    componentCallbacks2C4077a.f16234s = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    private final void m19300f(boolean z11) {
        synchronized (f16230t) {
            try {
                Iterator it = this.f16233r.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo19304a(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public void m19301a(a aVar) {
        synchronized (f16230t) {
            this.f16233r.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m19302d() {
        return this.f16231p.get();
    }

    /* renamed from: e */
    public boolean m19303e(boolean z11) {
        if (!this.f16232q.get()) {
            if (AbstractC20295p.m105948b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f16232q.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f16231p.set(true);
                }
            } else {
                return z11;
            }
        }
        return m19302d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f16231p.compareAndSet(true, false);
        this.f16232q.set(true);
        if (compareAndSet) {
            m19300f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f16231p.compareAndSet(true, false);
        this.f16232q.set(true);
        if (compareAndSet) {
            m19300f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        if (i11 == 20 && this.f16231p.compareAndSet(false, true)) {
            this.f16232q.set(true);
            m19300f(true);
        }
    }
}
