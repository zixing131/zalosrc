package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes.dex */
public final class C5639v2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    final /* synthetic */ C5656w2 f32850p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5639v2(C5656w2 c5656w2) {
        this.f32850p = c5656w2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f32850p.m29820l(new C5503n2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f32850p.m29820l(new C5622u2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f32850p.m29820l(new C5571r2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f32850p.m29820l(new C5537p2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        this.f32850p.m29820l(new C5605t2(this, activity, binderC5315c1));
        Bundle m28963N = binderC5315c1.m28963N(50L);
        if (m28963N != null) {
            bundle.putAll(m28963N);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f32850p.m29820l(new C5520o2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f32850p.m29820l(new C5588s2(this, activity));
    }
}
