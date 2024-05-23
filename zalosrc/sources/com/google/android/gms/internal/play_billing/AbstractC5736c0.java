package com.google.android.gms.internal.play_billing;

import p664y.AbstractC30228a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5736c0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m30183a(byte[] bArr, int i11, C5729b0 c5729b0) {
        int m30190h = m30190h(bArr, i11, c5729b0);
        int i12 = c5729b0.f33237a;
        if (i12 >= 0) {
            if (i12 <= bArr.length - m30190h) {
                if (i12 == 0) {
                    c5729b0.f33239c = AbstractC5803n0.f33371q;
                    return m30190h;
                }
                c5729b0.f33239c = AbstractC5803n0.m30372s(bArr, m30190h, i12);
                return m30190h + i12;
            }
            throw zzff.m30588g();
        }
        throw zzff.m30586d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m30184b(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m30185c(InterfaceC5835s2 interfaceC5835s2, byte[] bArr, int i11, int i12, int i13, C5729b0 c5729b0) {
        Object zze = interfaceC5835s2.zze();
        int m30194l = m30194l(zze, interfaceC5835s2, bArr, i11, i12, i13, c5729b0);
        interfaceC5835s2.mo30352a(zze);
        c5729b0.f33239c = zze;
        return m30194l;
    }

    /* renamed from: d */
    static int m30186d(InterfaceC5835s2 interfaceC5835s2, byte[] bArr, int i11, int i12, C5729b0 c5729b0) {
        Object zze = interfaceC5835s2.zze();
        int m30195m = m30195m(zze, interfaceC5835s2, bArr, i11, i12, c5729b0);
        interfaceC5835s2.mo30352a(zze);
        c5729b0.f33239c = zze;
        return m30195m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m30187e(InterfaceC5835s2 interfaceC5835s2, int i11, byte[] bArr, int i12, int i13, InterfaceC5798m1 interfaceC5798m1, C5729b0 c5729b0) {
        int m30186d = m30186d(interfaceC5835s2, bArr, i12, i13, c5729b0);
        interfaceC5798m1.add(c5729b0.f33239c);
        while (m30186d < i13) {
            int m30190h = m30190h(bArr, m30186d, c5729b0);
            if (i11 != c5729b0.f33237a) {
                break;
            }
            m30186d = m30186d(interfaceC5835s2, bArr, m30190h, i13, c5729b0);
            interfaceC5798m1.add(c5729b0.f33239c);
        }
        return m30186d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m30188f(byte[] bArr, int i11, InterfaceC5798m1 interfaceC5798m1, C5729b0 c5729b0) {
        AbstractC30228a.m149044a(interfaceC5798m1);
        int m30190h = m30190h(bArr, i11, c5729b0);
        int i12 = c5729b0.f33237a + m30190h;
        if (m30190h >= i12) {
            if (m30190h == i12) {
                return m30190h;
            }
            throw zzff.m30588g();
        }
        m30190h(bArr, m30190h, c5729b0);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m30189g(int i11, byte[] bArr, int i12, int i13, C5871y2 c5871y2, C5729b0 c5729b0) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                c5871y2.m30578j(i11, Integer.valueOf(m30184b(bArr, i12)));
                                return i12 + 4;
                            }
                            throw zzff.m30584b();
                        }
                        int i15 = (i11 & (-8)) | 4;
                        C5871y2 m30570f = C5871y2.m30570f();
                        int i16 = 0;
                        while (true) {
                            if (i12 >= i13) {
                                break;
                            }
                            int m30190h = m30190h(bArr, i12, c5729b0);
                            int i17 = c5729b0.f33237a;
                            i16 = i17;
                            if (i17 != i15) {
                                int m30189g = m30189g(i16, bArr, m30190h, i13, m30570f, c5729b0);
                                i16 = i17;
                                i12 = m30189g;
                            } else {
                                i12 = m30190h;
                                break;
                            }
                        }
                        if (i12 <= i13 && i16 == i15) {
                            c5871y2.m30578j(i11, m30570f);
                            return i12;
                        }
                        throw zzff.m30587e();
                    }
                    int m30190h2 = m30190h(bArr, i12, c5729b0);
                    int i18 = c5729b0.f33237a;
                    if (i18 >= 0) {
                        if (i18 <= bArr.length - m30190h2) {
                            if (i18 == 0) {
                                c5871y2.m30578j(i11, AbstractC5803n0.f33371q);
                            } else {
                                c5871y2.m30578j(i11, AbstractC5803n0.m30372s(bArr, m30190h2, i18));
                            }
                            return m30190h2 + i18;
                        }
                        throw zzff.m30588g();
                    }
                    throw zzff.m30586d();
                }
                c5871y2.m30578j(i11, Long.valueOf(m30196n(bArr, i12)));
                return i12 + 8;
            }
            int m30193k = m30193k(bArr, i12, c5729b0);
            c5871y2.m30578j(i11, Long.valueOf(c5729b0.f33238b));
            return m30193k;
        }
        throw zzff.m30584b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m30190h(byte[] bArr, int i11, C5729b0 c5729b0) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            c5729b0.f33237a = b11;
            return i12;
        }
        return m30191i(b11, bArr, i12, c5729b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m30191i(int i11, byte[] bArr, int i12, C5729b0 c5729b0) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            c5729b0.f33237a = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            c5729b0.f33237a = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            c5729b0.f33237a = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            c5729b0.f33237a = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] < 0) {
                i21 = i23;
            } else {
                c5729b0.f33237a = i22;
                return i23;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m30192j(int i11, byte[] bArr, int i12, int i13, InterfaceC5798m1 interfaceC5798m1, C5729b0 c5729b0) {
        AbstractC30228a.m149044a(interfaceC5798m1);
        m30190h(bArr, i12, c5729b0);
        int i14 = c5729b0.f33237a;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m30193k(byte[] bArr, int i11, C5729b0 c5729b0) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            c5729b0.f33238b = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            i14 += 7;
            j12 |= (r10 & Byte.MAX_VALUE) << i14;
            b11 = bArr[i13];
            i13 = i15;
        }
        c5729b0.f33238b = j12;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m30194l(Object obj, InterfaceC5835s2 interfaceC5835s2, byte[] bArr, int i11, int i12, int i13, C5729b0 c5729b0) {
        int m30358v = ((C5793l2) interfaceC5835s2).m30358v(obj, bArr, i11, i12, i13, c5729b0);
        c5729b0.f33239c = obj;
        return m30358v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m30195m(Object obj, InterfaceC5835s2 interfaceC5835s2, byte[] bArr, int i11, int i12, C5729b0 c5729b0) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = m30191i(i14, bArr, i13, c5729b0);
            i14 = c5729b0.f33237a;
        }
        int i15 = i13;
        if (i14 >= 0 && i14 <= i12 - i15) {
            int i16 = i14 + i15;
            interfaceC5835s2.mo30357f(obj, bArr, i15, i16, c5729b0);
            c5729b0.f33239c = obj;
            return i16;
        }
        throw zzff.m30588g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m30196n(byte[] bArr, int i11) {
        return (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48) | ((bArr[i11 + 7] & 255) << 56);
    }
}
