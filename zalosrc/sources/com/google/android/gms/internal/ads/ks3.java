package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class ks3 implements oe3 {

    /* renamed from: a */
    private final cl3 f23469a;

    /* renamed from: b */
    private final int f23470b;

    public ks3(cl3 cl3Var, int i11) {
        this.f23469a = cl3Var;
        this.f23470b = i11;
        if (i11 >= 10) {
            cl3Var.mo20934a(new byte[0], i11);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.ads.oe3
    /* renamed from: a */
    public final void mo24026a(byte[] bArr, byte[] bArr2) {
        if (jr3.m23727b(mo24027b(bArr2), bArr)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.ads.oe3
    /* renamed from: b */
    public final byte[] mo24027b(byte[] bArr) {
        return this.f23469a.mo20934a(bArr, this.f23470b);
    }
}
