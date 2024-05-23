package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.h */
/* loaded from: classes2.dex */
public abstract class AbstractC4557h {

    /* renamed from: a */
    public static final byte[] f21470a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f21471b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f21472c = new Object();

    /* renamed from: d */
    private static int[] f21473d = new int[10];

    /* renamed from: a */
    public static int m22649a(byte[] bArr, int i11, int i12, boolean[] zArr) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i13 = i12 - i11;
        boolean z14 = false;
        if (i13 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            m22653e(zArr);
            return i11 - 3;
        }
        if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            m22653e(zArr);
            return i11 - 2;
        }
        if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            m22653e(zArr);
            return i11 - 1;
        }
        int i14 = i12 - 1;
        int i15 = i11 + 2;
        while (i15 < i14) {
            byte b11 = bArr[i15];
            if ((b11 & 254) == 0) {
                int i16 = i15 - 2;
                if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && b11 == 1) {
                    m22653e(zArr);
                    return i16;
                }
                i15 = i16;
            }
            i15 += 3;
        }
        if (i13 <= 2 ? !(i13 != 2 ? !zArr[1] || bArr[i14] != 1 : !zArr[2] || bArr[i12 - 2] != 0 || bArr[i14] != 1) : !(bArr[i12 - 3] != 0 || bArr[i12 - 2] != 0 || bArr[i14] != 1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr[0] = z12;
        if (i13 <= 1 ? !(!zArr[2] || bArr[i14] != 0) : !(bArr[i12 - 2] != 0 || bArr[i14] != 0)) {
            z13 = true;
        } else {
            z13 = false;
        }
        zArr[1] = z13;
        if (bArr[i14] == 0) {
            z14 = true;
        }
        zArr[2] = z14;
        return i12;
    }

    /* renamed from: b */
    public static int m22650b(byte[] bArr, int i11) {
        int i12;
        synchronized (f21472c) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                while (true) {
                    if (i13 < i11 - 2) {
                        try {
                            if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 3) {
                                break;
                            }
                            i13++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        i13 = i11;
                        break;
                    }
                }
                if (i13 < i11) {
                    int[] iArr = f21473d;
                    int length = iArr.length;
                    if (length <= i14) {
                        f21473d = Arrays.copyOf(iArr, length + length);
                    }
                    f21473d[i14] = i13;
                    i13 += 3;
                    i14++;
                }
            }
            i12 = i11 - i14;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = f21473d[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i21 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i21] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i12 - i16);
        }
        return i12;
    }

    /* renamed from: c */
    public static C4483f m22651c(byte[] bArr, int i11, int i12) {
        C4630j c4630j = new C4630j(bArr, 4, i12);
        int m23491c = c4630j.m23491c();
        int m23491c2 = c4630j.m23491c();
        c4630j.m23492d();
        return new C4483f(m23491c, m23491c2, c4630j.m23494f());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4520g m22652d(byte[] bArr, int i11, int i12) {
        int m23491c;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int m23491c2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z13;
        boolean m23494f;
        float f11;
        int m23489a;
        int i21;
        C4630j c4630j = new C4630j(bArr, i11, i12);
        int m23489a2 = c4630j.m23489a(8);
        int m23489a3 = c4630j.m23489a(8);
        int m23489a4 = c4630j.m23489a(8);
        int m23491c3 = c4630j.m23491c();
        int i22 = 1;
        if (m23489a2 != 100 && m23489a2 != 110 && m23489a2 != 122 && m23489a2 != 244 && m23489a2 != 44 && m23489a2 != 83 && m23489a2 != 86 && m23489a2 != 118 && m23489a2 != 128) {
            if (m23489a2 == 138) {
                m23489a2 = 138;
            } else {
                m23491c = 1;
                z12 = false;
                int m23491c4 = c4630j.m23491c() + 4;
                m23491c2 = c4630j.m23491c();
                if (m23491c2 != 0) {
                    i16 = m23489a2;
                    i17 = m23489a3;
                    i18 = m23491c2;
                    i19 = c4630j.m23491c() + 4;
                } else {
                    if (m23491c2 == 1) {
                        boolean m23494f2 = c4630j.m23494f();
                        c4630j.m23490b();
                        c4630j.m23490b();
                        i16 = m23489a2;
                        long m23491c5 = c4630j.m23491c();
                        i17 = m23489a3;
                        for (int i23 = 0; i23 < m23491c5; i23++) {
                            c4630j.m23491c();
                        }
                        z13 = m23494f2;
                        i18 = 1;
                        i19 = 0;
                        int m23491c6 = c4630j.m23491c();
                        c4630j.m23492d();
                        int m23491c7 = c4630j.m23491c() + 1;
                        int m23491c8 = c4630j.m23491c();
                        m23494f = c4630j.m23494f();
                        int i24 = 2 - (m23494f ? 1 : 0);
                        int i25 = (m23491c8 + 1) * i24;
                        if (!m23494f) {
                            c4630j.m23492d();
                        }
                        c4630j.m23492d();
                        int i26 = m23491c7 * 16;
                        int i27 = i25 * 16;
                        if (c4630j.m23494f()) {
                            int m23491c9 = c4630j.m23491c();
                            int m23491c10 = c4630j.m23491c();
                            int m23491c11 = c4630j.m23491c();
                            int m23491c12 = c4630j.m23491c();
                            if (m23491c != 0) {
                                if (m23491c == 3) {
                                    i21 = 1;
                                } else {
                                    i21 = 2;
                                }
                                if (m23491c == 1) {
                                    i22 = 2;
                                }
                                i24 *= i22;
                                i22 = i21;
                            }
                            i26 -= (m23491c9 + m23491c10) * i22;
                            i27 -= (m23491c11 + m23491c12) * i24;
                        }
                        int i28 = i26;
                        int i29 = i27;
                        if (c4630j.m23494f() && c4630j.m23494f()) {
                            m23489a = c4630j.m23489a(8);
                            if (m23489a != 255) {
                                int m23489a5 = c4630j.m23489a(16);
                                int m23489a6 = c4630j.m23489a(16);
                                if (m23489a5 != 0 && m23489a6 != 0) {
                                    f11 = m23489a5 / m23489a6;
                                }
                            } else if (m23489a < 17) {
                                f11 = f21471b[m23489a];
                            } else {
                                lr1.m24356e("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + m23489a);
                            }
                            return new C4520g(i16, i17, m23489a4, m23491c3, m23491c6, i28, i29, f11, z12, m23494f, m23491c4, i18, i19, z13);
                        }
                        f11 = 1.0f;
                        return new C4520g(i16, i17, m23489a4, m23491c3, m23491c6, i28, i29, f11, z12, m23494f, m23491c4, i18, i19, z13);
                    }
                    i16 = m23489a2;
                    i17 = m23489a3;
                    i18 = m23491c2;
                    i19 = 0;
                }
                z13 = false;
                int m23491c62 = c4630j.m23491c();
                c4630j.m23492d();
                int m23491c72 = c4630j.m23491c() + 1;
                int m23491c82 = c4630j.m23491c();
                m23494f = c4630j.m23494f();
                int i242 = 2 - (m23494f ? 1 : 0);
                int i252 = (m23491c82 + 1) * i242;
                if (!m23494f) {
                }
                c4630j.m23492d();
                int i262 = m23491c72 * 16;
                int i272 = i252 * 16;
                if (c4630j.m23494f()) {
                }
                int i282 = i262;
                int i292 = i272;
                if (c4630j.m23494f()) {
                    m23489a = c4630j.m23489a(8);
                    if (m23489a != 255) {
                    }
                    return new C4520g(i16, i17, m23489a4, m23491c3, m23491c62, i282, i292, f11, z12, m23494f, m23491c4, i18, i19, z13);
                }
                f11 = 1.0f;
                return new C4520g(i16, i17, m23489a4, m23491c3, m23491c62, i282, i292, f11, z12, m23494f, m23491c4, i18, i19, z13);
            }
        }
        m23491c = c4630j.m23491c();
        if (m23491c == 3) {
            z11 = c4630j.m23494f();
            i13 = 3;
        } else {
            i13 = m23491c;
            z11 = false;
        }
        c4630j.m23491c();
        c4630j.m23491c();
        c4630j.m23492d();
        if (c4630j.m23494f()) {
            if (i13 != 3) {
                i14 = 8;
            } else {
                i14 = 12;
            }
            for (int i31 = 0; i31 < i14; i31++) {
                if (c4630j.m23494f()) {
                    if (i31 < 6) {
                        i15 = 16;
                    } else {
                        i15 = 64;
                    }
                    int i32 = 8;
                    int i33 = 8;
                    for (int i34 = 0; i34 < i15; i34++) {
                        if (i32 != 0) {
                            i32 = ((i33 + c4630j.m23490b()) + 256) % 256;
                        }
                        if (i32 != 0) {
                            i33 = i32;
                        }
                    }
                }
            }
        }
        z12 = z11;
        int m23491c42 = c4630j.m23491c() + 4;
        m23491c2 = c4630j.m23491c();
        if (m23491c2 != 0) {
        }
        z13 = false;
        int m23491c622 = c4630j.m23491c();
        c4630j.m23492d();
        int m23491c722 = c4630j.m23491c() + 1;
        int m23491c822 = c4630j.m23491c();
        m23494f = c4630j.m23494f();
        int i2422 = 2 - (m23494f ? 1 : 0);
        int i2522 = (m23491c822 + 1) * i2422;
        if (!m23494f) {
        }
        c4630j.m23492d();
        int i2622 = m23491c722 * 16;
        int i2722 = i2522 * 16;
        if (c4630j.m23494f()) {
        }
        int i2822 = i2622;
        int i2922 = i2722;
        if (c4630j.m23494f()) {
        }
        f11 = 1.0f;
        return new C4520g(i16, i17, m23489a4, m23491c3, m23491c622, i2822, i2922, f11, z12, m23494f, m23491c42, i18, i19, z13);
    }

    /* renamed from: e */
    public static void m22653e(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
