package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.io */
/* loaded from: classes2.dex */
public final class C4619io {

    /* renamed from: a */
    public byte[] f22238a;

    /* renamed from: b */
    private int f22239b;

    /* renamed from: c */
    private int f22240c;

    /* renamed from: d */
    private int f22241d;

    public C4619io(byte[] bArr, int i11) {
        this.f22238a = bArr;
        this.f22241d = i11;
    }

    /* renamed from: a */
    public final int m23310a(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i11 >> 3;
        boolean z11 = false;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = this.f22240c;
            if (i19 != 0) {
                byte[] bArr = this.f22238a;
                int i21 = this.f22239b;
                i15 = ((bArr[i21 + 1] & 255) >>> (8 - i19)) | ((bArr[i21] & 255) << i19);
            } else {
                i15 = this.f22238a[this.f22239b];
            }
            i11 -= 8;
            i17 |= (255 & i15) << i11;
            this.f22239b++;
        }
        if (i11 > 0) {
            int i22 = this.f22240c + i11;
            byte b11 = (byte) (255 >> (8 - i11));
            if (i22 > 8) {
                byte[] bArr2 = this.f22238a;
                int i23 = this.f22239b;
                int i24 = i23 + 1;
                i14 = (b11 & (((255 & bArr2[i24]) >> (16 - i22)) | ((bArr2[i23] & 255) << (i22 - 8)))) | i17;
                this.f22239b = i24;
            } else {
                byte[] bArr3 = this.f22238a;
                int i25 = this.f22239b;
                i14 = (b11 & ((255 & bArr3[i25]) >> (8 - i22))) | i17;
                if (i22 == 8) {
                    this.f22239b = i25 + 1;
                }
            }
            i17 = i14;
            this.f22240c = i22 % 8;
        }
        int i26 = this.f22239b;
        if (i26 >= 0 && (i12 = this.f22240c) >= 0 && (i26 < (i13 = this.f22241d) || (i26 == i13 && i12 == 0))) {
            z11 = true;
        }
        AbstractC4361bo.m20613e(z11);
        return i17;
    }
}
