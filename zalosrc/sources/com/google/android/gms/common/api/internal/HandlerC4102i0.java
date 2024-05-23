package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p504s5.HandlerC26145m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* loaded from: classes2.dex */
public final class HandlerC4102i0 extends HandlerC26145m {

    /* renamed from: a */
    final /* synthetic */ C4105j0 f16352a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4102i0(C4105j0 c4105j0, Looper looper) {
        super(looper);
        this.f16352a = c4105j0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown message id: ");
                sb2.append(i11);
                return;
            }
            throw ((RuntimeException) message.obj);
        }
        ((AbstractC4099h0) message.obj).m19442b(this.f16352a);
    }
}
