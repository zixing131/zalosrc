package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import p504s5.HandlerC26145m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.f */
/* loaded from: classes2.dex */
public final class HandlerC4156f extends HandlerC26145m {

    /* renamed from: a */
    private final Context f16508a;

    /* renamed from: b */
    final /* synthetic */ C4070a f16509b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HandlerC4156f(C4070a c4070a, Context context) {
        super(r1);
        Looper myLooper;
        this.f16509b = c4070a;
        if (Looper.myLooper() == null) {
            myLooper = Looper.getMainLooper();
        } else {
            myLooper = Looper.myLooper();
        }
        this.f16508a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i11);
        } else {
            int mo19200i = this.f16509b.mo19200i(this.f16508a);
            if (this.f16509b.mo19202m(mo19200i)) {
                this.f16509b.m19206r(this.f16508a, mo19200i);
            }
        }
    }
}
