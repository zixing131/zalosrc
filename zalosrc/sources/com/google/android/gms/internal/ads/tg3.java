package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class tg3 extends qg3 {
    public tg3(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.qg3
    /* renamed from: a */
    final int mo25462a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.qg3
    /* renamed from: b */
    final int[] mo25463b(int[] iArr, int i11) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            mg3.m24564b(r0, this.f26771a);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            mg3.m24565c(iArr3);
            mg3.m24564b(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i11;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
