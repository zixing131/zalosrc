package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ae */
/* loaded from: classes2.dex */
final class C4314ae implements InterfaceC4351be {

    /* renamed from: a */
    final /* synthetic */ Activity f17011a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4314ae(C4387ce c4387ce, Activity activity) {
        this.f17011a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351be
    /* renamed from: a */
    public final void mo20096a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f17011a);
    }
}
