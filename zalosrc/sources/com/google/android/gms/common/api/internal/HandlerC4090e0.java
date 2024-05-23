package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p504s5.HandlerC26145m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* loaded from: classes2.dex */
public final class HandlerC4090e0 extends HandlerC26145m {

    /* renamed from: a */
    final /* synthetic */ C4096g0 f16294a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4090e0(C4096g0 c4096g0, Looper looper) {
        super(looper);
        this.f16294a = c4096g0;
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
            C4096g0.m19419u(this.f16294a);
            return;
        }
        C4096g0.m19420v(this.f16294a);
    }
}
