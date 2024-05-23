package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ce */
/* loaded from: classes2.dex */
public final class C4387ce implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    private final Application f18375p;

    /* renamed from: q */
    private final WeakReference f18376q;

    /* renamed from: r */
    private boolean f18377r = false;

    public C4387ce(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f18376q = new WeakReference(activityLifecycleCallbacks);
        this.f18375p = application;
    }

    /* renamed from: a */
    protected final void m20865a(InterfaceC4351be interfaceC4351be) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f18376q.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC4351be.mo20096a(activityLifecycleCallbacks);
            } else if (!this.f18377r) {
                this.f18375p.unregisterActivityLifecycleCallbacks(this);
                this.f18377r = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m20865a(new C5053ud(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m20865a(new C4314ae(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m20865a(new C5165xd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m20865a(new C5128wd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m20865a(new C5239zd(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m20865a(new C5090vd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m20865a(new C5202yd(this, activity));
    }
}
