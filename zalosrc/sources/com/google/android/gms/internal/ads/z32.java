package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes2.dex */
final class z32 implements dh1 {

    /* renamed from: a */
    private Message f31334a;

    /* renamed from: b */
    private a52 f31335b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ z32(z22 z22Var) {
    }

    /* renamed from: c */
    private final void m28428c() {
        this.f31334a = null;
        this.f31335b = null;
        a52.m19999i(this);
    }

    /* renamed from: a */
    public final z32 m28429a(Message message, a52 a52Var) {
        this.f31334a = message;
        this.f31335b = a52Var;
        return this;
    }

    /* renamed from: b */
    public final boolean m28430b(Handler handler) {
        Message message = this.f31334a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m28428c();
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.dh1
    public final void zza() {
        Message message = this.f31334a;
        message.getClass();
        message.sendToTarget();
        m28428c();
    }
}
