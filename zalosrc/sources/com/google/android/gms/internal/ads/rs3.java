package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class rs3 implements pd3 {

    /* renamed from: a */
    private final ug3 f27373a;

    public rs3(byte[] bArr) {
        this.f27373a = new ug3(bArr);
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: a */
    public final byte[] mo22153a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            return this.f27373a.m26302c(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: b */
    public final byte[] mo22154b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] m24706a = ms3.m24706a(24);
        allocate.put(m24706a);
        this.f27373a.m26301b(allocate, m24706a, bArr, bArr2);
        return allocate.array();
    }
}
