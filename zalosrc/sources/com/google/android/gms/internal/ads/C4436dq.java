package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.dq */
/* loaded from: classes2.dex */
final class C4436dq implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    private final Application f19385p;

    /* renamed from: q */
    private final WeakReference f19386q;

    /* renamed from: r */
    private boolean f19387r = false;

    public C4436dq(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f19386q = new WeakReference(activityLifecycleCallbacks);
        this.f19385p = application;
    }

    /* renamed from: a */
    protected final void m21531a(InterfaceC4399cq interfaceC4399cq) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f19386q.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC4399cq.mo20220a(activityLifecycleCallbacks);
            } else if (!this.f19387r) {
                this.f19385p.unregisterActivityLifecycleCallbacks(this);
                this.f19387r = true;
            }
        } catch (Exception e11) {
            yk0.zzh("Error while dispatching lifecycle callback.", e11);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m21531a(new C5065up(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m21531a(new C4363bq(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m21531a(new C5177xp(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m21531a(new C5140wp(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m21531a(new C4326aq(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m21531a(new C5102vp(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m21531a(new C5214yp(this, activity));
    }
}
