package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ud */
/* loaded from: classes2.dex */
final class C5053ud implements InterfaceC4351be {

    /* renamed from: a */
    final /* synthetic */ Activity f28832a;

    /* renamed from: b */
    final /* synthetic */ Bundle f28833b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5053ud(C4387ce c4387ce, Activity activity, Bundle bundle) {
        this.f28832a = activity;
        this.f28833b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351be
    /* renamed from: a */
    public final void mo20096a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f28832a, this.f28833b);
    }
}
