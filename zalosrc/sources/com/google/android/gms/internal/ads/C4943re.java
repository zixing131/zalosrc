package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.re */
/* loaded from: classes2.dex */
public final class C4943re extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ViewOnAttachStateChangeListenerC4980se f27171a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4943re(ViewOnAttachStateChangeListenerC4980se viewOnAttachStateChangeListenerC4980se) {
        this.f27171a = viewOnAttachStateChangeListenerC4980se;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f27171a.m26280f();
    }
}
