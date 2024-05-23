package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tc4 extends Handler {

    /* renamed from: a */
    final /* synthetic */ wc4 f28286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc4(wc4 wc4Var, Looper looper) {
        super(looper);
        this.f28286a = wc4Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        wc4.m27590a(this.f28286a, message);
    }
}
