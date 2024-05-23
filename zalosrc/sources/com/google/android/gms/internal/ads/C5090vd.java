package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.vd */
/* loaded from: classes2.dex */
final class C5090vd implements InterfaceC4351be {

    /* renamed from: a */
    final /* synthetic */ Activity f29277a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5090vd(C4387ce c4387ce, Activity activity) {
        this.f29277a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351be
    /* renamed from: a */
    public final void mo20096a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f29277a);
    }
}
