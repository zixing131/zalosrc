package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.xd */
/* loaded from: classes2.dex */
final class C5165xd implements InterfaceC4351be {

    /* renamed from: a */
    final /* synthetic */ Activity f30426a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5165xd(C4387ce c4387ce, Activity activity) {
        this.f30426a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351be
    /* renamed from: a */
    public final void mo20096a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f30426a);
    }
}
