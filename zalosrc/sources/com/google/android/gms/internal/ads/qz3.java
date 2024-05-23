package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class qz3 extends tz3 implements InterfaceC5123w9 {

    /* renamed from: x */
    InterfaceC5161x9 f27009x;

    /* renamed from: y */
    protected final String f27010y = "moov";

    public qz3(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5123w9
    /* renamed from: a */
    public final void mo25622a(uz3 uz3Var, ByteBuffer byteBuffer, long j11, InterfaceC5012t9 interfaceC5012t9) {
        uz3Var.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f28670q = uz3Var;
        this.f28672s = uz3Var.zzb();
        uz3Var.mo26636j(uz3Var.zzb() + j11);
        this.f28673t = uz3Var.zzb();
        this.f28669p = interfaceC5012t9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5123w9
    /* renamed from: c */
    public final void mo25623c(InterfaceC5161x9 interfaceC5161x9) {
        this.f27009x = interfaceC5161x9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5123w9
    public final String zza() {
        return this.f27010y;
    }
}
