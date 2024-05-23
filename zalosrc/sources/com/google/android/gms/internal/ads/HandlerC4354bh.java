package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.bh */
/* loaded from: classes2.dex */
public final class HandlerC4354bh extends Handler {

    /* renamed from: a */
    final /* synthetic */ C4390ch f17745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4354bh(C4390ch c4390ch, Looper looper) {
        super(looper);
        this.f17745a = c4390ch;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f17745a.m20880b(message);
    }
}
