package ua;

import p603wa.C28859a;
import p603wa.C28861c;
import va.C27953a;
import va.C27954b;

/* renamed from: ua.c */
/* loaded from: classes3.dex */
public abstract class AbstractC27209c {

    /* renamed from: a */
    private static final int[] f127933a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m139280a(C27953a c27953a, int i11, int i12) {
        int i13;
        int[] iArr = new int[i12];
        int m140886g = c27953a.m140886g() / i11;
        for (int i14 = 0; i14 < m140886g; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                if (c27953a.m140885f((i14 * i11) + i16)) {
                    i13 = 1 << ((i11 - i16) - 1);
                } else {
                    i13 = 0;
                }
                i15 |= i13;
            }
            iArr[i14] = i15;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m139281b(C27954b c27954b, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int i14 = i11 - i13;
            int i15 = i14;
            while (true) {
                int i16 = i11 + i13;
                if (i15 <= i16) {
                    c27954b.m140893h(i15, i14);
                    c27954b.m140893h(i15, i16);
                    c27954b.m140893h(i14, i15);
                    c27954b.m140893h(i16, i15);
                    i15++;
                }
            }
        }
        int i17 = i11 - i12;
        c27954b.m140893h(i17, i17);
        int i18 = i17 + 1;
        c27954b.m140893h(i18, i17);
        c27954b.m140893h(i17, i18);
        int i19 = i11 + i12;
        c27954b.m140893h(i19, i17);
        c27954b.m140893h(i19, i18);
        c27954b.m140893h(i19, i19 - 1);
    }

    /* renamed from: c */
    private static void m139282c(C27954b c27954b, boolean z11, int i11, C27953a c27953a) {
        int i12 = i11 / 2;
        int i13 = 0;
        if (z11) {
            while (i13 < 7) {
                int i14 = (i12 - 3) + i13;
                if (c27953a.m140885f(i13)) {
                    c27954b.m140893h(i14, i12 - 5);
                }
                if (c27953a.m140885f(i13 + 7)) {
                    c27954b.m140893h(i12 + 5, i14);
                }
                if (c27953a.m140885f(20 - i13)) {
                    c27954b.m140893h(i14, i12 + 5);
                }
                if (c27953a.m140885f(27 - i13)) {
                    c27954b.m140893h(i12 - 5, i14);
                }
                i13++;
            }
            return;
        }
        while (i13 < 10) {
            int i15 = (i12 - 5) + i13 + (i13 / 5);
            if (c27953a.m140885f(i13)) {
                c27954b.m140893h(i15, i12 - 7);
            }
            if (c27953a.m140885f(i13 + 10)) {
                c27954b.m140893h(i12 + 7, i15);
            }
            if (c27953a.m140885f(29 - i13)) {
                c27954b.m140893h(i15, i12 + 7);
            }
            if (c27953a.m140885f(39 - i13)) {
                c27954b.m140893h(i12 - 7, i15);
            }
            i13++;
        }
    }

    /* renamed from: d */
    public static C27207a m139283d(byte[] bArr, int i11, int i12) {
        boolean z11;
        int i13;
        C27953a c27953a;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C27953a m139294a = new C27210d(bArr).m139294a();
        int m140886g = ((m139294a.m140886g() * i11) / 100) + 11;
        int m140886g2 = m139294a.m140886g() + m140886g;
        int i21 = 32;
        int i22 = 0;
        if (i12 != 0) {
            if (i12 < 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            i15 = Math.abs(i12);
            if (z12) {
                i21 = 4;
            }
            if (i15 <= i21) {
                i16 = m139288i(i15, z12);
                i14 = f127933a[i15];
                int i23 = i16 - (i16 % i14);
                c27953a = m139287h(m139294a, i14);
                if (c27953a.m140886g() + m140886g <= i23) {
                    if (z12 && c27953a.m140886g() > i14 * 64) {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                } else {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i12)));
            }
        } else {
            C27953a c27953a2 = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 <= 32) {
                if (i24 <= 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i13 = i24 + 1;
                } else {
                    i13 = i24;
                }
                int m139288i = m139288i(i13, z11);
                if (m140886g2 <= m139288i) {
                    if (c27953a2 == null || i25 != f127933a[i13]) {
                        int i26 = f127933a[i13];
                        i25 = i26;
                        c27953a2 = m139287h(m139294a, i26);
                    }
                    int i27 = m139288i - (m139288i % i25);
                    if ((!z11 || c27953a2.m140886g() <= i25 * 64) && c27953a2.m140886g() + m140886g <= i27) {
                        c27953a = c27953a2;
                        i14 = i25;
                        z12 = z11;
                        i15 = i13;
                        i16 = m139288i;
                    }
                }
                i24++;
                i22 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C27953a m139284e = m139284e(c27953a, i16, i14);
        int m140886g3 = c27953a.m140886g() / i14;
        C27953a m139285f = m139285f(z12, i15, m140886g3);
        if (z12) {
            i17 = 11;
        } else {
            i17 = 14;
        }
        int i28 = i17 + (i15 * 4);
        int[] iArr = new int[i28];
        int i29 = 2;
        if (z12) {
            for (int i31 = 0; i31 < i28; i31++) {
                iArr[i31] = i31;
            }
            i18 = i28;
        } else {
            int i32 = i28 / 2;
            i18 = i28 + 1 + (((i32 - 1) / 15) * 2);
            int i33 = i18 / 2;
            for (int i34 = 0; i34 < i32; i34++) {
                iArr[(i32 - i34) - 1] = (i33 - r15) - 1;
                iArr[i32 + i34] = (i34 / 15) + i34 + i33 + 1;
            }
        }
        C27954b c27954b = new C27954b(i18);
        int i35 = 0;
        int i36 = 0;
        while (i35 < i15) {
            int i37 = (i15 - i35) * 4;
            if (z12) {
                i19 = 9;
            } else {
                i19 = 12;
            }
            int i38 = i37 + i19;
            int i39 = 0;
            while (i39 < i38) {
                int i41 = i39 * 2;
                while (i22 < i29) {
                    if (m139284e.m140885f(i36 + i41 + i22)) {
                        int i42 = i35 * 2;
                        c27954b.m140893h(iArr[i42 + i22], iArr[i42 + i39]);
                    }
                    if (m139284e.m140885f((i38 * 2) + i36 + i41 + i22)) {
                        int i43 = i35 * 2;
                        c27954b.m140893h(iArr[i43 + i39], iArr[((i28 - 1) - i43) - i22]);
                    }
                    if (m139284e.m140885f((i38 * 4) + i36 + i41 + i22)) {
                        int i44 = (i28 - 1) - (i35 * 2);
                        c27954b.m140893h(iArr[i44 - i22], iArr[i44 - i39]);
                    }
                    if (m139284e.m140885f((i38 * 6) + i36 + i41 + i22)) {
                        int i45 = i35 * 2;
                        c27954b.m140893h(iArr[((i28 - 1) - i45) - i39], iArr[i45 + i22]);
                    }
                    i22++;
                    i29 = 2;
                }
                i39++;
                i22 = 0;
                i29 = 2;
            }
            i36 += i38 * 8;
            i35++;
            i22 = 0;
            i29 = 2;
        }
        m139282c(c27954b, z12, i18, m139285f);
        if (z12) {
            m139281b(c27954b, i18 / 2, 5);
        } else {
            int i46 = i18 / 2;
            m139281b(c27954b, i46, 7);
            int i47 = 0;
            int i48 = 0;
            while (i47 < (i28 / 2) - 1) {
                for (int i49 = i46 & 1; i49 < i18; i49 += 2) {
                    int i51 = i46 - i48;
                    c27954b.m140893h(i51, i49);
                    int i52 = i46 + i48;
                    c27954b.m140893h(i52, i49);
                    c27954b.m140893h(i49, i51);
                    c27954b.m140893h(i49, i52);
                }
                i47 += 15;
                i48 += 16;
            }
        }
        C27207a c27207a = new C27207a();
        c27207a.m139275c(z12);
        c27207a.m139278f(i18);
        c27207a.m139276d(i15);
        c27207a.m139274b(m140886g3);
        c27207a.m139277e(c27954b);
        return c27207a;
    }

    /* renamed from: e */
    private static C27953a m139284e(C27953a c27953a, int i11, int i12) {
        int m140886g = c27953a.m140886g() / i12;
        C28861c c28861c = new C28861c(m139286g(i12));
        int i13 = i11 / i12;
        int[] m139280a = m139280a(c27953a, i12, i13);
        c28861c.m144301b(m139280a, i13 - m140886g);
        C27953a c27953a2 = new C27953a();
        c27953a2.m140883b(0, i11 % i12);
        for (int i14 : m139280a) {
            c27953a2.m140883b(i14, i12);
        }
        return c27953a2;
    }

    /* renamed from: f */
    static C27953a m139285f(boolean z11, int i11, int i12) {
        C27953a c27953a = new C27953a();
        if (z11) {
            c27953a.m140883b(i11 - 1, 2);
            c27953a.m140883b(i12 - 1, 6);
            return m139284e(c27953a, 28, 4);
        }
        c27953a.m140883b(i11 - 1, 5);
        c27953a.m140883b(i12 - 1, 11);
        return m139284e(c27953a, 40, 4);
    }

    /* renamed from: g */
    private static C28859a m139286g(int i11) {
        if (i11 != 4) {
            if (i11 != 6) {
                if (i11 != 8) {
                    if (i11 != 10) {
                        if (i11 == 12) {
                            return C28859a.f133661h;
                        }
                        throw new IllegalArgumentException("Unsupported word size " + i11);
                    }
                    return C28859a.f133662i;
                }
                return C28859a.f133667n;
            }
            return C28859a.f133663j;
        }
        return C28859a.f133664k;
    }

    /* renamed from: h */
    static C27953a m139287h(C27953a c27953a, int i11) {
        C27953a c27953a2 = new C27953a();
        int m140886g = c27953a.m140886g();
        int i12 = (1 << i11) - 2;
        int i13 = 0;
        while (i13 < m140886g) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = i13 + i15;
                if (i16 >= m140886g || c27953a.m140885f(i16)) {
                    i14 |= 1 << ((i11 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                c27953a2.m140883b(i17, i11);
            } else if (i17 == 0) {
                c27953a2.m140883b(i14 | 1, i11);
            } else {
                c27953a2.m140883b(i14, i11);
                i13 += i11;
            }
            i13--;
            i13 += i11;
        }
        return c27953a2;
    }

    /* renamed from: i */
    private static int m139288i(int i11, boolean z11) {
        return ((z11 ? 88 : 112) + (i11 * 16)) * i11;
    }
}
