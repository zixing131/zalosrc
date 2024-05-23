package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.bq */
/* loaded from: classes2.dex */
final class C4363bq implements InterfaceC4399cq {

    /* renamed from: a */
    final /* synthetic */ Activity f17949a;

    public C4363bq(C4436dq c4436dq, Activity activity) {
        this.f17949a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4399cq
    /* renamed from: a */
    public final void mo20220a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f17949a);
    }
}
