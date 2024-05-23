package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.yp */
/* loaded from: classes2.dex */
final class C5214yp implements InterfaceC4399cq {

    /* renamed from: a */
    final /* synthetic */ Activity f31057a;

    public C5214yp(C4436dq c4436dq, Activity activity) {
        this.f31057a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4399cq
    /* renamed from: a */
    public final void mo20220a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f31057a);
    }
}
