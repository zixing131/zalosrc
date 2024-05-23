package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.np */
/* loaded from: classes2.dex */
public final class C4805np extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ViewOnAttachStateChangeListenerC4917qp f25280a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4805np(ViewOnAttachStateChangeListenerC4917qp viewOnAttachStateChangeListenerC4917qp) {
        this.f25280a = viewOnAttachStateChangeListenerC4917qp;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f25280a.m25845j(3);
    }
}
