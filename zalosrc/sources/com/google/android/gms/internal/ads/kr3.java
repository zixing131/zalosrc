package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class kr3 implements pd3 {

    /* renamed from: a */
    private final rg3 f23464a;

    public kr3(byte[] bArr) {
        this.f23464a = new rg3(bArr);
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: a */
    public final byte[] mo22153a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            return this.f23464a.m26302c(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: b */
    public final byte[] mo22154b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] m24706a = ms3.m24706a(12);
        allocate.put(m24706a);
        this.f23464a.m26301b(allocate, m24706a, bArr, bArr2);
        return allocate.array();
    }
}
