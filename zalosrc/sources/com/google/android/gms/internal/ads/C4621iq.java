package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p664y.AbstractC30228a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.iq */
/* loaded from: classes2.dex */
public final class C4621iq implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    private Activity f22258p;

    /* renamed from: q */
    private Context f22259q;

    /* renamed from: w */
    private Runnable f22265w;

    /* renamed from: y */
    private long f22267y;

    /* renamed from: r */
    private final Object f22260r = new Object();

    /* renamed from: s */
    private boolean f22261s = true;

    /* renamed from: t */
    private boolean f22262t = false;

    /* renamed from: u */
    private final List f22263u = new ArrayList();

    /* renamed from: v */
    private final List f22264v = new ArrayList();

    /* renamed from: x */
    private boolean f22266x = false;

    /* renamed from: k */
    private final void m23322k(Activity activity) {
        synchronized (this.f22260r) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.f22258p = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final Activity m23323a() {
        return this.f22258p;
    }

    /* renamed from: b */
    public final Context m23324b() {
        return this.f22259q;
    }

    /* renamed from: f */
    public final void m23325f(InterfaceC4657jq interfaceC4657jq) {
        synchronized (this.f22260r) {
            this.f22263u.add(interfaceC4657jq);
        }
    }

    /* renamed from: g */
    public final void m23326g(Application application, Context context) {
        if (!this.f22266x) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m23322k((Activity) context);
            }
            this.f22259q = application;
            this.f22267y = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21052M0)).longValue();
            this.f22266x = true;
        }
    }

    /* renamed from: h */
    public final void m23327h(InterfaceC4657jq interfaceC4657jq) {
        synchronized (this.f22260r) {
            this.f22263u.remove(interfaceC4657jq);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f22260r) {
            try {
                Activity activity2 = this.f22258p;
                if (activity2 != null) {
                    if (activity2.equals(activity)) {
                        this.f22258p = null;
                    }
                    Iterator it = this.f22264v.iterator();
                    while (it.hasNext()) {
                        AbstractC30228a.m149044a(it.next());
                        try {
                            throw null;
                            break;
                        } catch (Exception e11) {
                            zzt.zzo().m22945t(e11, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                            yk0.zzh("", e11);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m23322k(activity);
        synchronized (this.f22260r) {
            Iterator it = this.f22264v.iterator();
            while (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                try {
                    throw null;
                    break;
                } catch (Exception e11) {
                    zzt.zzo().m22945t(e11, "AppActivityTracker.ActivityListener.onActivityPaused");
                    yk0.zzh("", e11);
                }
            }
        }
        this.f22262t = true;
        Runnable runnable = this.f22265w;
        if (runnable != null) {
            zzs.zza.removeCallbacks(runnable);
        }
        m23 m23Var = zzs.zza;
        RunnableC4584hq runnableC4584hq = new RunnableC4584hq(this);
        this.f22265w = runnableC4584hq;
        m23Var.postDelayed(runnableC4584hq, this.f22267y);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m23322k(activity);
        this.f22262t = false;
        boolean z11 = !this.f22261s;
        this.f22261s = true;
        Runnable runnable = this.f22265w;
        if (runnable != null) {
            zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.f22260r) {
            Iterator it = this.f22264v.iterator();
            while (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                try {
                    throw null;
                    break;
                } catch (Exception e11) {
                    zzt.zzo().m22945t(e11, "AppActivityTracker.ActivityListener.onActivityResumed");
                    yk0.zzh("", e11);
                }
            }
            if (z11) {
                Iterator it2 = this.f22263u.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC4657jq) it2.next()).zza(true);
                    } catch (Exception e12) {
                        yk0.zzh("", e12);
                    }
                }
            } else {
                yk0.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m23322k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
