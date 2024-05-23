package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jo */
/* loaded from: classes2.dex */
public final class C4655jo {

    /* renamed from: a */
    public byte[] f22891a;

    /* renamed from: b */
    private int f22892b;

    /* renamed from: c */
    private int f22893c;

    public C4655jo() {
    }

    public C4655jo(int i11) {
        this.f22891a = new byte[i11];
        this.f22893c = i11;
    }

    /* renamed from: a */
    public final int m23665a() {
        return this.f22893c - this.f22892b;
    }

    /* renamed from: b */
    public final int m23666b() {
        byte[] bArr = this.f22891a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final int m23667c() {
        return this.f22892b;
    }

    /* renamed from: d */
    public final int m23668d() {
        return this.f22893c;
    }

    /* renamed from: e */
    public final int m23669e() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        byte b13 = bArr[i11 + 2];
        this.f22892b = i11 + 4;
        return (bArr[i11 + 3] & 255) | ((b11 & 255) << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8);
    }

    /* renamed from: f */
    public final int m23670f() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        this.f22892b = i11 + 2;
        return ((bArr[i11 + 1] & 255) << 8) | (b11 & 255);
    }

    /* renamed from: g */
    public final int m23671g() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        this.f22892b = i11 + 1;
        return bArr[i11] & 255;
    }

    /* renamed from: h */
    public final int m23672h() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        this.f22892b = i11 + 4;
        return (b12 & 255) | ((b11 & 255) << 8);
    }

    /* renamed from: i */
    public final int m23673i() {
        int m23669e = m23669e();
        if (m23669e >= 0) {
            return m23669e;
        }
        throw new IllegalStateException("Top bit not zero: " + m23669e);
    }

    /* renamed from: j */
    public final int m23674j() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        this.f22892b = i11 + 2;
        return (bArr[i11 + 1] & 255) | ((b11 & 255) << 8);
    }

    /* renamed from: k */
    public final long m23675k() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        int i12 = i11 + 3;
        byte b13 = bArr[i11 + 2];
        this.f22892b = i11 + 4;
        return ((b12 & 255) << 8) | (b11 & 255) | ((b13 & 255) << 16) | ((bArr[i12] & 255) << 24);
    }

    /* renamed from: l */
    public final long m23676l() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        byte b13 = bArr[i11 + 2];
        byte b14 = bArr[i11 + 3];
        byte b15 = bArr[i11 + 4];
        byte b16 = bArr[i11 + 5];
        int i12 = i11 + 7;
        byte b17 = bArr[i11 + 6];
        this.f22892b = i11 + 8;
        return ((b12 & 255) << 48) | ((b11 & 255) << 56) | ((b13 & 255) << 40) | ((b14 & 255) << 32) | ((b15 & 255) << 24) | ((b16 & 255) << 16) | ((b17 & 255) << 8) | (bArr[i12] & 255);
    }

    /* renamed from: m */
    public final long m23677m() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        int i12 = i11 + 3;
        byte b13 = bArr[i11 + 2];
        this.f22892b = i11 + 4;
        return ((b12 & 255) << 16) | ((b11 & 255) << 24) | ((b13 & 255) << 8) | (bArr[i12] & 255);
    }

    /* renamed from: n */
    public final long m23678n() {
        long m23676l = m23676l();
        if (m23676l >= 0) {
            return m23676l;
        }
        throw new IllegalStateException("Top bit not zero: " + m23676l);
    }

    /* renamed from: o */
    public final String m23679o(int i11) {
        if (i11 == 0) {
            return "";
        }
        int i12 = this.f22892b;
        int i13 = i12 + i11;
        int i14 = i13 - 1;
        if (i14 < this.f22893c && this.f22891a[i14] == 0) {
            i11--;
        }
        String str = new String(this.f22891a, i12, i11);
        this.f22892b = i13;
        return str;
    }

    /* renamed from: p */
    public final short m23680p() {
        byte[] bArr = this.f22891a;
        int i11 = this.f22892b;
        byte b11 = bArr[i11];
        this.f22892b = i11 + 2;
        return (short) ((bArr[i11 + 1] & 255) | ((b11 & 255) << 8));
    }

    /* renamed from: q */
    public final void m23681q(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f22891a, this.f22892b, bArr, i11, i12);
        this.f22892b += i12;
    }

    /* renamed from: r */
    public final void m23682r() {
        this.f22892b = 0;
        this.f22893c = 0;
    }

    /* renamed from: s */
    public final void m23683s(int i11) {
        byte[] bArr;
        if (m23666b() < i11) {
            bArr = new byte[i11];
        } else {
            bArr = this.f22891a;
        }
        m23684t(bArr, i11);
    }

    /* renamed from: t */
    public final void m23684t(byte[] bArr, int i11) {
        this.f22891a = bArr;
        this.f22893c = i11;
        this.f22892b = 0;
    }

    /* renamed from: u */
    public final void m23685u(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= this.f22891a.length) {
            z11 = true;
        }
        AbstractC4361bo.m20611c(z11);
        this.f22893c = i11;
    }

    /* renamed from: v */
    public final void m23686v(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= this.f22893c) {
            z11 = true;
        }
        AbstractC4361bo.m20611c(z11);
        this.f22892b = i11;
    }

    /* renamed from: w */
    public final void m23687w(int i11) {
        m23686v(this.f22892b + i11);
    }

    public C4655jo(byte[] bArr) {
        this.f22891a = bArr;
        this.f22893c = bArr.length;
    }
}
