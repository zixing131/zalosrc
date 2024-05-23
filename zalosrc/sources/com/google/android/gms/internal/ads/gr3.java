package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class gr3 implements pd3 {

    /* renamed from: a */
    private final og3 f20803a;

    public gr3(byte[] bArr) {
        if (yg3.m28203a(2)) {
            this.f20803a = new og3(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: a */
    public final byte[] mo22153a(byte[] bArr, byte[] bArr2) {
        return this.f20803a.m25179a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: b */
    public final byte[] mo22154b(byte[] bArr, byte[] bArr2) {
        return this.f20803a.m25180b(ms3.m24706a(12), bArr, bArr2);
    }
}
