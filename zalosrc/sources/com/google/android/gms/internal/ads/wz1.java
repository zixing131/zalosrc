package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class wz1 {

    /* renamed from: a */
    public byte[] f30280a;

    /* renamed from: b */
    private int f30281b;

    /* renamed from: c */
    private int f30282c;

    /* renamed from: d */
    private int f30283d;

    public wz1(byte[] bArr, int i11) {
        this.f30280a = bArr;
        this.f30283d = i11;
    }

    /* renamed from: m */
    private final void m27743m() {
        int i11;
        int i12 = this.f30281b;
        boolean z11 = false;
        if (i12 >= 0 && (i12 < (i11 = this.f30283d) || (i12 == i11 && this.f30282c == 0))) {
            z11 = true;
        }
        v71.m27175f(z11);
    }

    /* renamed from: a */
    public final int m27744a() {
        return ((this.f30283d - this.f30281b) * 8) - this.f30282c;
    }

    /* renamed from: b */
    public final int m27745b() {
        return (this.f30281b * 8) + this.f30282c;
    }

    /* renamed from: c */
    public final int m27746c(int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        this.f30282c += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f30282c;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f30282c = i14;
            byte[] bArr = this.f30280a;
            int i15 = this.f30281b;
            this.f30281b = i15 + 1;
            i13 |= (bArr[i15] & 255) << i14;
        }
        byte[] bArr2 = this.f30280a;
        int i16 = this.f30281b;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f30282c = 0;
            this.f30281b = i16 + 1;
        }
        m27743m();
        return i17;
    }

    /* renamed from: d */
    public final void m27747d() {
        if (this.f30282c == 0) {
            return;
        }
        this.f30282c = 0;
        this.f30281b++;
        m27743m();
    }

    /* renamed from: e */
    public final void m27748e(int i11, int i12) {
        int i13 = i11 & 16383;
        int min = Math.min(8 - this.f30282c, 14);
        int i14 = this.f30282c;
        int i15 = (8 - i14) - min;
        byte[] bArr = this.f30280a;
        int i16 = this.f30281b;
        byte b11 = (byte) (((65280 >> i14) | ((1 << i15) - 1)) & bArr[i16]);
        bArr[i16] = b11;
        int i17 = 14 - min;
        bArr[i16] = (byte) (b11 | ((i13 >>> i17) << i15));
        int i18 = i16 + 1;
        while (i17 > 8) {
            i17 -= 8;
            this.f30280a[i18] = (byte) (i13 >>> i17);
            i18++;
        }
        byte[] bArr2 = this.f30280a;
        byte b12 = (byte) (bArr2[i18] & ((1 << r0) - 1));
        bArr2[i18] = b12;
        bArr2[i18] = (byte) (((i13 & ((1 << i17) - 1)) << (8 - i17)) | b12);
        m27753j(14);
        m27743m();
    }

    /* renamed from: f */
    public final void m27749f(byte[] bArr, int i11, int i12) {
        int i13 = i12 >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr2 = this.f30280a;
            int i15 = this.f30281b;
            int i16 = i15 + 1;
            this.f30281b = i16;
            byte b11 = bArr2[i15];
            int i17 = this.f30282c;
            byte b12 = (byte) (b11 << i17);
            bArr[i14] = b12;
            bArr[i14] = (byte) (((255 & bArr2[i16]) >> (8 - i17)) | b12);
        }
        int i18 = i12 & 7;
        if (i18 == 0) {
            return;
        }
        byte b13 = (byte) (bArr[i13] & (255 >> i18));
        bArr[i13] = b13;
        int i19 = this.f30282c;
        if (i19 + i18 > 8) {
            byte[] bArr3 = this.f30280a;
            int i21 = this.f30281b;
            this.f30281b = i21 + 1;
            b13 = (byte) (b13 | ((bArr3[i21] & 255) << i19));
            bArr[i13] = b13;
            i19 -= 8;
        }
        int i22 = i19 + i18;
        this.f30282c = i22;
        byte[] bArr4 = this.f30280a;
        int i23 = this.f30281b;
        bArr[i13] = (byte) (((byte) (((255 & bArr4[i23]) >> (8 - i22)) << (8 - i18))) | b13);
        if (i22 == 8) {
            this.f30282c = 0;
            this.f30281b = i23 + 1;
        }
        m27743m();
    }

    /* renamed from: g */
    public final void m27750g(byte[] bArr, int i11) {
        this.f30280a = bArr;
        this.f30281b = 0;
        this.f30282c = 0;
        this.f30283d = i11;
    }

    /* renamed from: h */
    public final void m27751h(int i11) {
        int i12 = i11 / 8;
        this.f30281b = i12;
        this.f30282c = i11 - (i12 * 8);
        m27743m();
    }

    /* renamed from: i */
    public final void m27752i() {
        int i11 = this.f30282c + 1;
        this.f30282c = i11;
        if (i11 == 8) {
            this.f30282c = 0;
            this.f30281b++;
        }
        m27743m();
    }

    /* renamed from: j */
    public final void m27753j(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f30281b + i12;
        this.f30281b = i13;
        int i14 = this.f30282c + (i11 - (i12 * 8));
        this.f30282c = i14;
        if (i14 > 7) {
            this.f30281b = i13 + 1;
            this.f30282c = i14 - 8;
        }
        m27743m();
    }

    /* renamed from: k */
    public final void m27754k(int i11) {
        boolean z11;
        if (this.f30282c == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        this.f30281b += i11;
        m27743m();
    }

    /* renamed from: l */
    public final boolean m27755l() {
        boolean z11;
        if ((this.f30280a[this.f30281b] & (128 >> this.f30282c)) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m27752i();
        return z11;
    }

    public wz1() {
        this.f30280a = g92.f20479f;
    }
}
