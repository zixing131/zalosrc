package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ur3 implements pd3 {

    /* renamed from: a */
    private final gs3 f29035a;

    /* renamed from: b */
    private final oe3 f29036b;

    /* renamed from: c */
    private final int f29037c;

    public ur3(gs3 gs3Var, oe3 oe3Var, int i11) {
        this.f29035a = gs3Var;
        this.f29036b = oe3Var;
        this.f29037c = i11;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: a */
    public final byte[] mo22153a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.f29037c;
        if (length >= i11) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i11);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f29037c, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f29036b.mo24026a(copyOfRange2, jr3.m23728c(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f29035a.mo20992a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: b */
    public final byte[] mo22154b(byte[] bArr, byte[] bArr2) {
        byte[] mo20993b = this.f29035a.mo20993b(bArr);
        return jr3.m23728c(mo20993b, this.f29036b.mo24027b(jr3.m23728c(bArr2, mo20993b, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
