package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.wd */
/* loaded from: classes2.dex */
final class C5128wd implements InterfaceC4351be {

    /* renamed from: a */
    final /* synthetic */ Activity f29890a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5128wd(C4387ce c4387ce, Activity activity) {
        this.f29890a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351be
    /* renamed from: a */
    public final void mo20096a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f29890a);
    }
}
