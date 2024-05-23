package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class pg3 extends qg3 {
    public pg3(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.qg3
    /* renamed from: a */
    public final int mo25462a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.qg3
    /* renamed from: b */
    public final int[] mo25463b(int[] iArr, int i11) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            mg3.m24564b(iArr2, this.f26771a);
            iArr2[12] = i11;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
