package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x02 {

    /* renamed from: a */
    private byte[] f30293a;

    /* renamed from: b */
    private int f30294b;

    /* renamed from: c */
    private int f30295c;

    public x02(byte[] bArr, int i11) {
        this.f30293a = bArr;
        this.f30295c = i11;
    }

    /* renamed from: A */
    public final long m27762A() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        int i12 = i11 + 3;
        byte b13 = bArr[i11 + 2];
        this.f30294b = i11 + 4;
        return ((b12 & 255) << 16) | ((b11 & 255) << 24) | ((b13 & 255) << 8) | (bArr[i12] & 255);
    }

    /* renamed from: B */
    public final long m27763B() {
        long m27795z = m27795z();
        if (m27795z >= 0) {
            return m27795z;
        }
        throw new IllegalStateException("Top bit not zero: " + m27795z);
    }

    /* renamed from: C */
    public final long m27764C() {
        int i11;
        int i12;
        long j11 = this.f30293a[this.f30294b];
        int i13 = 7;
        while (true) {
            i11 = 0;
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j11) != 0) {
                i13--;
            } else if (i13 < 6) {
                j11 &= r7 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        if (i11 != 0) {
            for (i12 = 1; i12 < i11; i12++) {
                if ((this.f30293a[this.f30294b + i12] & 192) == 128) {
                    j11 = (j11 << 6) | (r2 & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j11);
                }
            }
            this.f30294b += i11;
            return j11;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j11);
    }

    /* renamed from: D */
    public final String m27765D(char c11) {
        int i11 = this.f30295c;
        int i12 = this.f30294b;
        if (i11 - i12 != 0) {
            while (i12 < this.f30295c && this.f30293a[i12] != 0) {
                i12++;
            }
            byte[] bArr = this.f30293a;
            int i13 = this.f30294b;
            String m22351j = g92.m22351j(bArr, i13, i12 - i13);
            this.f30294b = i12;
            if (i12 < this.f30295c) {
                this.f30294b = i12 + 1;
            }
            return m22351j;
        }
        return null;
    }

    /* renamed from: E */
    public final String m27766E(int i11) {
        int i12;
        if (i11 == 0) {
            return "";
        }
        int i13 = this.f30294b;
        int i14 = (i13 + i11) - 1;
        if (i14 < this.f30295c && this.f30293a[i14] == 0) {
            i12 = i11 - 1;
        } else {
            i12 = i11;
        }
        String m22351j = g92.m22351j(this.f30293a, i13, i12);
        this.f30294b += i11;
        return m22351j;
    }

    /* renamed from: F */
    public final String m27767F(int i11, Charset charset) {
        byte[] bArr = this.f30293a;
        int i12 = this.f30294b;
        String str = new String(bArr, i12, i11, charset);
        this.f30294b = i12 + i11;
        return str;
    }

    /* renamed from: G */
    public final short m27768G() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        this.f30294b = i11 + 2;
        return (short) ((bArr[i11 + 1] & 255) | ((b11 & 255) << 8));
    }

    /* renamed from: H */
    public final void m27769H(int i11) {
        byte[] bArr = this.f30293a;
        if (i11 > bArr.length) {
            this.f30293a = Arrays.copyOf(bArr, i11);
        }
    }

    /* renamed from: a */
    public final void m27770a(wz1 wz1Var, int i11) {
        m27771b(wz1Var.f30280a, 0, i11);
        wz1Var.m27751h(0);
    }

    /* renamed from: b */
    public final void m27771b(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f30293a, this.f30294b, bArr, i11, i12);
        this.f30294b += i12;
    }

    /* renamed from: c */
    public final void m27772c(int i11) {
        byte[] bArr = this.f30293a;
        if (bArr.length < i11) {
            bArr = new byte[i11];
        }
        m27773d(bArr, i11);
    }

    /* renamed from: d */
    public final void m27773d(byte[] bArr, int i11) {
        this.f30293a = bArr;
        this.f30295c = i11;
        this.f30294b = 0;
    }

    /* renamed from: e */
    public final void m27774e(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= this.f30293a.length) {
            z11 = true;
        }
        v71.m27173d(z11);
        this.f30295c = i11;
    }

    /* renamed from: f */
    public final void m27775f(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= this.f30295c) {
            z11 = true;
        }
        v71.m27173d(z11);
        this.f30294b = i11;
    }

    /* renamed from: g */
    public final void m27776g(int i11) {
        m27775f(this.f30294b + i11);
    }

    /* renamed from: h */
    public final byte[] m27777h() {
        return this.f30293a;
    }

    /* renamed from: i */
    public final int m27778i() {
        return this.f30295c - this.f30294b;
    }

    /* renamed from: j */
    public final int m27779j() {
        return this.f30293a.length;
    }

    /* renamed from: k */
    public final int m27780k() {
        return this.f30294b;
    }

    /* renamed from: l */
    public final int m27781l() {
        return this.f30295c;
    }

    /* renamed from: m */
    public final int m27782m() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        byte b13 = bArr[i11 + 2];
        this.f30294b = i11 + 4;
        return (bArr[i11 + 3] & 255) | ((b11 & 255) << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8);
    }

    /* renamed from: n */
    public final int m27783n() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        this.f30294b = i11 + 3;
        return (bArr[i11 + 2] & 255) | (((b11 & 255) << 24) >> 8) | ((b12 & 255) << 8);
    }

    /* renamed from: o */
    public final int m27784o() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        byte b13 = bArr[i11 + 2];
        this.f30294b = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (b11 & 255) | ((b12 & 255) << 8) | ((b13 & 255) << 16);
    }

    /* renamed from: p */
    public final int m27785p() {
        int m27784o = m27784o();
        if (m27784o >= 0) {
            return m27784o;
        }
        throw new IllegalStateException("Top bit not zero: " + m27784o);
    }

    /* renamed from: q */
    public final int m27786q() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        this.f30294b = i11 + 2;
        return ((bArr[i11 + 1] & 255) << 8) | (b11 & 255);
    }

    /* renamed from: r */
    public final int m27787r() {
        return (m27788s() << 21) | (m27788s() << 14) | (m27788s() << 7) | m27788s();
    }

    /* renamed from: s */
    public final int m27788s() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        this.f30294b = i11 + 1;
        return bArr[i11] & 255;
    }

    /* renamed from: t */
    public final int m27789t() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        this.f30294b = i11 + 4;
        return (b12 & 255) | ((b11 & 255) << 8);
    }

    /* renamed from: u */
    public final int m27790u() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        this.f30294b = i11 + 3;
        return (bArr[i11 + 2] & 255) | ((b11 & 255) << 16) | ((b12 & 255) << 8);
    }

    /* renamed from: v */
    public final int m27791v() {
        int m27782m = m27782m();
        if (m27782m >= 0) {
            return m27782m;
        }
        throw new IllegalStateException("Top bit not zero: " + m27782m);
    }

    /* renamed from: w */
    public final int m27792w() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        this.f30294b = i11 + 2;
        return (bArr[i11 + 1] & 255) | ((b11 & 255) << 8);
    }

    /* renamed from: x */
    public final long m27793x() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        byte b13 = bArr[i11 + 2];
        byte b14 = bArr[i11 + 3];
        byte b15 = bArr[i11 + 4];
        byte b16 = bArr[i11 + 5];
        int i12 = i11 + 7;
        byte b17 = bArr[i11 + 6];
        this.f30294b = i11 + 8;
        return ((b12 & 255) << 8) | (b11 & 255) | ((b13 & 255) << 16) | ((b14 & 255) << 24) | ((b15 & 255) << 32) | ((b16 & 255) << 40) | ((b17 & 255) << 48) | ((bArr[i12] & 255) << 56);
    }

    /* renamed from: y */
    public final long m27794y() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        int i12 = i11 + 3;
        byte b13 = bArr[i11 + 2];
        this.f30294b = i11 + 4;
        return ((b12 & 255) << 8) | (b11 & 255) | ((b13 & 255) << 16) | ((bArr[i12] & 255) << 24);
    }

    /* renamed from: z */
    public final long m27795z() {
        byte[] bArr = this.f30293a;
        int i11 = this.f30294b;
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        byte b13 = bArr[i11 + 2];
        byte b14 = bArr[i11 + 3];
        byte b15 = bArr[i11 + 4];
        byte b16 = bArr[i11 + 5];
        int i12 = i11 + 7;
        byte b17 = bArr[i11 + 6];
        this.f30294b = i11 + 8;
        return ((b12 & 255) << 48) | ((b11 & 255) << 56) | ((b13 & 255) << 40) | ((b14 & 255) << 32) | ((b15 & 255) << 24) | ((b16 & 255) << 16) | ((b17 & 255) << 8) | (bArr[i12] & 255);
    }

    public x02() {
        this.f30293a = g92.f20479f;
    }

    public x02(int i11) {
        this.f30293a = new byte[i11];
        this.f30295c = i11;
    }

    public x02(byte[] bArr) {
        this.f30293a = bArr;
        this.f30295c = bArr.length;
    }
}
