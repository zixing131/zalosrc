package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l8 */
/* loaded from: classes.dex */
public abstract class AbstractC5475l8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m29404a(byte[] bArr, int i11, C5458k8 c5458k8) {
        int m29413j = m29413j(bArr, i11, c5458k8);
        int i12 = c5458k8.f32457a;
        if (i12 >= 0) {
            if (i12 <= bArr.length - m29413j) {
                if (i12 == 0) {
                    c5458k8.f32459c = AbstractC5679x8.f32911q;
                    return m29413j;
                }
                c5458k8.f32459c = AbstractC5679x8.m30021s(bArr, m29413j, i12);
                return m29413j + i12;
            }
            throw zzll.m30122f();
        }
        throw zzll.m30120d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m29405b(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m29406c(InterfaceC5393gb interfaceC5393gb, byte[] bArr, int i11, int i12, int i13, C5458k8 c5458k8) {
        Object zze = interfaceC5393gb.zze();
        int m29417n = m29417n(zze, interfaceC5393gb, bArr, i11, i12, i13, c5458k8);
        interfaceC5393gb.mo29155a(zze);
        c5458k8.f32459c = zze;
        return m29417n;
    }

    /* renamed from: d */
    static int m29407d(InterfaceC5393gb interfaceC5393gb, byte[] bArr, int i11, int i12, C5458k8 c5458k8) {
        Object zze = interfaceC5393gb.zze();
        int m29418o = m29418o(zze, interfaceC5393gb, bArr, i11, i12, c5458k8);
        interfaceC5393gb.mo29155a(zze);
        c5458k8.f32459c = zze;
        return m29418o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m29408e(InterfaceC5393gb interfaceC5393gb, int i11, byte[] bArr, int i12, int i13, InterfaceC5714z9 interfaceC5714z9, C5458k8 c5458k8) {
        int m29407d = m29407d(interfaceC5393gb, bArr, i12, i13, c5458k8);
        interfaceC5714z9.add(c5458k8.f32459c);
        while (m29407d < i13) {
            int m29413j = m29413j(bArr, m29407d, c5458k8);
            if (i11 != c5458k8.f32457a) {
                break;
            }
            m29407d = m29407d(interfaceC5393gb, bArr, m29413j, i13, c5458k8);
            interfaceC5714z9.add(c5458k8.f32459c);
        }
        return m29407d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m29409f(byte[] bArr, int i11, InterfaceC5714z9 interfaceC5714z9, C5458k8 c5458k8) {
        C5629u9 c5629u9 = (C5629u9) interfaceC5714z9;
        int m29413j = m29413j(bArr, i11, c5458k8);
        int i12 = c5458k8.f32457a + m29413j;
        while (m29413j < i12) {
            m29413j = m29413j(bArr, m29413j, c5458k8);
            c5629u9.m29686f(c5458k8.f32457a);
        }
        if (m29413j == i12) {
            return m29413j;
        }
        throw zzll.m30122f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m29410g(byte[] bArr, int i11, C5458k8 c5458k8) {
        int m29413j = m29413j(bArr, i11, c5458k8);
        int i12 = c5458k8.f32457a;
        if (i12 >= 0) {
            if (i12 == 0) {
                c5458k8.f32459c = "";
                return m29413j;
            }
            c5458k8.f32459c = new String(bArr, m29413j, i12, AbstractC5290aa.f32257b);
            return m29413j + i12;
        }
        throw zzll.m30120d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m29411h(byte[] bArr, int i11, C5458k8 c5458k8) {
        int m29413j = m29413j(bArr, i11, c5458k8);
        int i12 = c5458k8.f32457a;
        if (i12 >= 0) {
            if (i12 == 0) {
                c5458k8.f32459c = "";
                return m29413j;
            }
            int i13 = AbstractC5292ac.f32263b;
            int length = bArr.length;
            if ((((length - m29413j) - i12) | m29413j | i12) >= 0) {
                int i14 = m29413j + i12;
                char[] cArr = new char[i12];
                int i15 = 0;
                while (m29413j < i14) {
                    byte b11 = bArr[m29413j];
                    if (!AbstractC5665wb.m29986d(b11)) {
                        break;
                    }
                    m29413j++;
                    cArr[i15] = (char) b11;
                    i15++;
                }
                while (m29413j < i14) {
                    int i16 = m29413j + 1;
                    byte b12 = bArr[m29413j];
                    if (AbstractC5665wb.m29986d(b12)) {
                        cArr[i15] = (char) b12;
                        i15++;
                        m29413j = i16;
                        while (m29413j < i14) {
                            byte b13 = bArr[m29413j];
                            if (AbstractC5665wb.m29986d(b13)) {
                                m29413j++;
                                cArr[i15] = (char) b13;
                                i15++;
                            }
                        }
                    } else if (b12 < -32) {
                        if (i16 < i14) {
                            m29413j += 2;
                            AbstractC5665wb.m29985c(b12, bArr[i16], cArr, i15);
                            i15++;
                        } else {
                            throw zzll.m30119c();
                        }
                    } else if (b12 < -16) {
                        if (i16 < i14 - 1) {
                            int i17 = m29413j + 2;
                            m29413j += 3;
                            AbstractC5665wb.m29984b(b12, bArr[i16], bArr[i17], cArr, i15);
                            i15++;
                        } else {
                            throw zzll.m30119c();
                        }
                    } else if (i16 < i14 - 2) {
                        byte b14 = bArr[i16];
                        int i18 = m29413j + 3;
                        byte b15 = bArr[m29413j + 2];
                        m29413j += 4;
                        AbstractC5665wb.m29983a(b12, b14, b15, bArr[i18], cArr, i15);
                        i15 += 2;
                    } else {
                        throw zzll.m30119c();
                    }
                }
                c5458k8.f32459c = new String(cArr, 0, i15);
                return i14;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m29413j), Integer.valueOf(i12)));
        }
        throw zzll.m30120d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m29412i(int i11, byte[] bArr, int i12, int i13, C5495mb c5495mb, C5458k8 c5458k8) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                c5495mb.m29451j(i11, Integer.valueOf(m29405b(bArr, i12)));
                                return i12 + 4;
                            }
                            throw zzll.m30118b();
                        }
                        int i15 = (i11 & (-8)) | 4;
                        C5495mb m29443f = C5495mb.m29443f();
                        int i16 = 0;
                        while (true) {
                            if (i12 >= i13) {
                                break;
                            }
                            int m29413j = m29413j(bArr, i12, c5458k8);
                            int i17 = c5458k8.f32457a;
                            i16 = i17;
                            if (i17 != i15) {
                                int m29412i = m29412i(i16, bArr, m29413j, i13, m29443f, c5458k8);
                                i16 = i17;
                                i12 = m29412i;
                            } else {
                                i12 = m29413j;
                                break;
                            }
                        }
                        if (i12 <= i13 && i16 == i15) {
                            c5495mb.m29451j(i11, m29443f);
                            return i12;
                        }
                        throw zzll.m30121e();
                    }
                    int m29413j2 = m29413j(bArr, i12, c5458k8);
                    int i18 = c5458k8.f32457a;
                    if (i18 >= 0) {
                        if (i18 <= bArr.length - m29413j2) {
                            if (i18 == 0) {
                                c5495mb.m29451j(i11, AbstractC5679x8.f32911q);
                            } else {
                                c5495mb.m29451j(i11, AbstractC5679x8.m30021s(bArr, m29413j2, i18));
                            }
                            return m29413j2 + i18;
                        }
                        throw zzll.m30122f();
                    }
                    throw zzll.m30120d();
                }
                c5495mb.m29451j(i11, Long.valueOf(m29419p(bArr, i12)));
                return i12 + 8;
            }
            int m29416m = m29416m(bArr, i12, c5458k8);
            c5495mb.m29451j(i11, Long.valueOf(c5458k8.f32458b));
            return m29416m;
        }
        throw zzll.m30118b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m29413j(byte[] bArr, int i11, C5458k8 c5458k8) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            c5458k8.f32457a = b11;
            return i12;
        }
        return m29414k(b11, bArr, i12, c5458k8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m29414k(int i11, byte[] bArr, int i12, C5458k8 c5458k8) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            c5458k8.f32457a = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            c5458k8.f32457a = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            c5458k8.f32457a = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            c5458k8.f32457a = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] < 0) {
                i21 = i23;
            } else {
                c5458k8.f32457a = i22;
                return i23;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m29415l(int i11, byte[] bArr, int i12, int i13, InterfaceC5714z9 interfaceC5714z9, C5458k8 c5458k8) {
        C5629u9 c5629u9 = (C5629u9) interfaceC5714z9;
        int m29413j = m29413j(bArr, i12, c5458k8);
        c5629u9.m29686f(c5458k8.f32457a);
        while (m29413j < i13) {
            int m29413j2 = m29413j(bArr, m29413j, c5458k8);
            if (i11 != c5458k8.f32457a) {
                break;
            }
            m29413j = m29413j(bArr, m29413j2, c5458k8);
            c5629u9.m29686f(c5458k8.f32457a);
        }
        return m29413j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m29416m(byte[] bArr, int i11, C5458k8 c5458k8) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            c5458k8.f32458b = j11;
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
        c5458k8.f32458b = j12;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m29417n(Object obj, InterfaceC5393gb interfaceC5393gb, byte[] bArr, int i11, int i12, int i13, C5458k8 c5458k8) {
        int m30086C = ((C5698ya) interfaceC5393gb).m30086C(obj, bArr, i11, i12, i13, c5458k8);
        c5458k8.f32459c = obj;
        return m30086C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m29418o(Object obj, InterfaceC5393gb interfaceC5393gb, byte[] bArr, int i11, int i12, C5458k8 c5458k8) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = m29414k(i14, bArr, i13, c5458k8);
            i14 = c5458k8.f32457a;
        }
        int i15 = i13;
        if (i14 >= 0 && i14 <= i12 - i15) {
            int i16 = i14 + i15;
            interfaceC5393gb.mo29160f(obj, bArr, i15, i16, c5458k8);
            c5458k8.f32459c = obj;
            return i16;
        }
        throw zzll.m30122f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static long m29419p(byte[] bArr, int i11) {
        return (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48) | ((bArr[i11 + 7] & 255) << 56);
    }
}
