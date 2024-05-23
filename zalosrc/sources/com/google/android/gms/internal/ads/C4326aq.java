package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.aq */
/* loaded from: classes2.dex */
final class C4326aq implements InterfaceC4399cq {

    /* renamed from: a */
    final /* synthetic */ Activity f17223a;

    /* renamed from: b */
    final /* synthetic */ Bundle f17224b;

    public C4326aq(C4436dq c4436dq, Activity activity, Bundle bundle) {
        this.f17223a = activity;
        this.f17224b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4399cq
    /* renamed from: a */
    public final void mo20220a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f17223a, this.f17224b);
    }
}
