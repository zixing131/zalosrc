package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.up */
/* loaded from: classes2.dex */
final class C5065up implements InterfaceC4399cq {

    /* renamed from: a */
    final /* synthetic */ Activity f29011a;

    /* renamed from: b */
    final /* synthetic */ Bundle f29012b;

    public C5065up(C4436dq c4436dq, Activity activity, Bundle bundle) {
        this.f29011a = activity;
        this.f29012b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4399cq
    /* renamed from: a */
    public final void mo20220a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f29011a, this.f29012b);
    }
}
