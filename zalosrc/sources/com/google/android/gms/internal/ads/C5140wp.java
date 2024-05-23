package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.wp */
/* loaded from: classes2.dex */
final class C5140wp implements InterfaceC4399cq {

    /* renamed from: a */
    final /* synthetic */ Activity f30052a;

    public C5140wp(C4436dq c4436dq, Activity activity) {
        this.f30052a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4399cq
    /* renamed from: a */
    public final void mo20220a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f30052a);
    }
}
