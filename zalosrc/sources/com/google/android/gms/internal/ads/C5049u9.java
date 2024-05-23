package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* renamed from: com.google.android.gms.internal.ads.u9 */
/* loaded from: classes2.dex */
public final class C5049u9 extends tz3 implements Closeable {

    /* renamed from: x */
    private static final b04 f28793x = b04.m20367b(C5049u9.class);

    public C5049u9(uz3 uz3Var, InterfaceC5012t9 interfaceC5012t9) {
        m26808h(uz3Var, uz3Var.zzc(), interfaceC5012t9);
    }

    @Override // com.google.android.gms.internal.ads.tz3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.tz3
    public final String toString() {
        String obj = this.f28670q.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
