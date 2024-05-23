package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.yd */
/* loaded from: classes2.dex */
final class C5202yd implements InterfaceC4351be {

    /* renamed from: a */
    final /* synthetic */ Activity f30908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5202yd(C4387ce c4387ce, Activity activity) {
        this.f30908a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351be
    /* renamed from: a */
    public final void mo20096a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f30908a);
    }
}
