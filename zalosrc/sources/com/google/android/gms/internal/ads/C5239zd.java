package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.zd */
/* loaded from: classes2.dex */
final class C5239zd implements InterfaceC4351be {

    /* renamed from: a */
    final /* synthetic */ Activity f31467a;

    /* renamed from: b */
    final /* synthetic */ Bundle f31468b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5239zd(C4387ce c4387ce, Activity activity, Bundle bundle) {
        this.f31467a = activity;
        this.f31468b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351be
    /* renamed from: a */
    public final void mo20096a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f31467a, this.f31468b);
    }
}
