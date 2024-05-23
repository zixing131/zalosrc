package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.vp */
/* loaded from: classes2.dex */
final class C5102vp implements InterfaceC4399cq {

    /* renamed from: a */
    final /* synthetic */ Activity f29424a;

    public C5102vp(C4436dq c4436dq, Activity activity) {
        this.f29424a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4399cq
    /* renamed from: a */
    public final void mo20220a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f29424a);
    }
}
