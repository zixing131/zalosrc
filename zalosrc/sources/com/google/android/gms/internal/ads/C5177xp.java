package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.xp */
/* loaded from: classes2.dex */
final class C5177xp implements InterfaceC4399cq {

    /* renamed from: a */
    final /* synthetic */ Activity f30563a;

    public C5177xp(C4436dq c4436dq, Activity activity) {
        this.f30563a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4399cq
    /* renamed from: a */
    public final void mo20220a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f30563a);
    }
}
