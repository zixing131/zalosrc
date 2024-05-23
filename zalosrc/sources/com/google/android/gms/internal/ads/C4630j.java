package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j */
/* loaded from: classes2.dex */
public final class C4630j {

    /* renamed from: a */
    private byte[] f22577a;

    /* renamed from: b */
    private int f22578b;

    /* renamed from: c */
    private int f22579c;

    /* renamed from: d */
    private int f22580d = 0;

    public C4630j(byte[] bArr, int i11, int i12) {
        this.f22577a = bArr;
        this.f22579c = i11;
        this.f22578b = i12;
        m23487h();
    }

    /* renamed from: g */
    private final int m23486g() {
        int i11 = 0;
        int i12 = 0;
        while (!m23494f()) {
            i12++;
        }
        int i13 = (1 << i12) - 1;
        if (i12 > 0) {
            i11 = m23489a(i12);
        }
        return i13 + i11;
    }

    /* renamed from: h */
    private final void m23487h() {
        int i11;
        int i12 = this.f22579c;
        boolean z11 = false;
        if (i12 >= 0 && (i12 < (i11 = this.f22578b) || (i12 == i11 && this.f22580d == 0))) {
            z11 = true;
        }
        v71.m27175f(z11);
    }

    /* renamed from: i */
    private final boolean m23488i(int i11) {
        if (i11 >= 2 && i11 < this.f22578b) {
            byte[] bArr = this.f22577a;
            if (bArr[i11] == 3 && bArr[i11 - 2] == 0 && bArr[i11 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public final int m23489a(int i11) {
        int i12;
        int i13;
        this.f22580d += i11;
        int i14 = 0;
        while (true) {
            i12 = this.f22580d;
            i13 = 2;
            if (i12 <= 8) {
                break;
            }
            int i15 = i12 - 8;
            this.f22580d = i15;
            byte[] bArr = this.f22577a;
            int i16 = this.f22579c;
            i14 |= (bArr[i16] & 255) << i15;
            if (true != m23488i(i16 + 1)) {
                i13 = 1;
            }
            this.f22579c = i16 + i13;
        }
        byte[] bArr2 = this.f22577a;
        int i17 = this.f22579c;
        int i18 = ((-1) >>> (32 - i11)) & (i14 | ((bArr2[i17] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f22580d = 0;
            if (true != m23488i(i17 + 1)) {
                i13 = 1;
            }
            this.f22579c = i17 + i13;
        }
        m23487h();
        return i18;
    }

    /* renamed from: b */
    public final int m23490b() {
        int i11;
        int m23486g = m23486g();
        if (m23486g % 2 == 0) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        return i11 * ((m23486g + 1) / 2);
    }

    /* renamed from: c */
    public final int m23491c() {
        return m23486g();
    }

    /* renamed from: d */
    public final void m23492d() {
        int i11 = 1;
        int i12 = this.f22580d + 1;
        this.f22580d = i12;
        if (i12 == 8) {
            this.f22580d = 0;
            int i13 = this.f22579c;
            if (true == m23488i(i13 + 1)) {
                i11 = 2;
            }
            this.f22579c = i13 + i11;
        }
        m23487h();
    }

    /* renamed from: e */
    public final void m23493e(int i11) {
        int i12 = this.f22579c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        this.f22579c = i14;
        int i15 = this.f22580d + (i11 - (i13 * 8));
        this.f22580d = i15;
        if (i15 > 7) {
            this.f22579c = i14 + 1;
            this.f22580d = i15 - 8;
        }
        while (true) {
            i12++;
            if (i12 <= this.f22579c) {
                if (m23488i(i12)) {
                    this.f22579c++;
                    i12 += 2;
                }
            } else {
                m23487h();
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean m23494f() {
        boolean z11;
        if ((this.f22577a[this.f22579c] & (128 >> this.f22580d)) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m23492d();
        return z11;
    }
}
