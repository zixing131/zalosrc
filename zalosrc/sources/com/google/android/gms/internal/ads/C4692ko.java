package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ko */
/* loaded from: classes2.dex */
public final class C4692ko {

    /* renamed from: a */
    private final byte[] f23409a;

    /* renamed from: b */
    private final int f23410b;

    /* renamed from: c */
    private int f23411c;

    /* renamed from: d */
    private int f23412d = 0;

    public C4692ko(byte[] bArr, int i11, int i12) {
        this.f23409a = bArr;
        this.f23411c = i11;
        this.f23410b = i12;
        m23978g();
    }

    /* renamed from: f */
    private final int m23977f() {
        int i11 = 0;
        int i12 = 0;
        while (!m23984e()) {
            i12++;
        }
        int i13 = (1 << i12) - 1;
        if (i12 > 0) {
            i11 = m23980a(i12);
        }
        return i13 + i11;
    }

    /* renamed from: g */
    private final void m23978g() {
        int i11;
        int i12;
        int i13 = this.f23411c;
        boolean z11 = false;
        if (i13 >= 0 && (i11 = this.f23412d) >= 0 && i11 < 8 && (i13 < (i12 = this.f23410b) || (i13 == i12 && i11 == 0))) {
            z11 = true;
        }
        AbstractC4361bo.m20613e(z11);
    }

    /* renamed from: h */
    private final boolean m23979h(int i11) {
        if (i11 >= 2 && i11 < this.f23410b) {
            byte[] bArr = this.f23409a;
            if (bArr[i11] == 3 && bArr[i11 - 2] == 0 && bArr[i11 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public final int m23980a(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i11 >> 3;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            if (m23979h(this.f23411c + 1)) {
                i14 = this.f23411c + 2;
            } else {
                i14 = this.f23411c + 1;
            }
            int i19 = this.f23412d;
            if (i19 != 0) {
                byte[] bArr = this.f23409a;
                i15 = ((bArr[i14] & 255) >>> (8 - i19)) | ((bArr[this.f23411c] & 255) << i19);
            } else {
                i15 = this.f23409a[this.f23411c];
            }
            i11 -= 8;
            i17 |= (255 & i15) << i11;
            this.f23411c = i14;
        }
        if (i11 > 0) {
            int i21 = this.f23412d + i11;
            byte b11 = (byte) (255 >> (8 - i11));
            if (m23979h(this.f23411c + 1)) {
                i12 = this.f23411c + 2;
            } else {
                i12 = this.f23411c + 1;
            }
            if (i21 > 8) {
                byte[] bArr2 = this.f23409a;
                i13 = (b11 & (((255 & bArr2[i12]) >> (16 - i21)) | ((bArr2[this.f23411c] & 255) << (i21 - 8)))) | i17;
                this.f23411c = i12;
            } else {
                i13 = (b11 & ((255 & this.f23409a[this.f23411c]) >> (8 - i21))) | i17;
                if (i21 == 8) {
                    this.f23411c = i12;
                }
            }
            i17 = i13;
            this.f23412d = i21 % 8;
        }
        m23978g();
        return i17;
    }

    /* renamed from: b */
    public final int m23981b() {
        int i11;
        int m23977f = m23977f();
        if (m23977f % 2 == 0) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        return i11 * ((m23977f + 1) / 2);
    }

    /* renamed from: c */
    public final int m23982c() {
        return m23977f();
    }

    /* renamed from: d */
    public final void m23983d(int i11) {
        int i12 = this.f23411c;
        int i13 = (i11 >> 3) + i12;
        this.f23411c = i13;
        int i14 = this.f23412d + (i11 & 7);
        this.f23412d = i14;
        if (i14 > 7) {
            this.f23411c = i13 + 1;
            this.f23412d = i14 - 8;
        }
        while (true) {
            i12++;
            if (i12 <= this.f23411c) {
                if (m23979h(i12)) {
                    this.f23411c++;
                    i12 += 2;
                }
            } else {
                m23978g();
                return;
            }
        }
    }

    /* renamed from: e */
    public final boolean m23984e() {
        if (m23980a(1) == 1) {
            return true;
        }
        return false;
    }
}
