package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ro */
/* loaded from: classes2.dex */
public final class C4953ro {

    /* renamed from: a */
    public final List f27327a;

    /* renamed from: b */
    public final int f27328b;

    /* renamed from: c */
    public final float f27329c;

    private C4953ro(List list, int i11, int i12, int i13, float f11) {
        this.f27327a = list;
        this.f27328b = i11;
        this.f27329c = f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[Catch: ArrayIndexOutOfBoundsException -> 0x002a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002a, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002d, B:11:0x0034, B:15:0x0042, B:37:0x00de, B:39:0x00e7, B:40:0x0106, B:42:0x0120, B:43:0x0123, B:45:0x0130, B:48:0x0150, B:54:0x014d, B:56:0x0158, B:58:0x015e, B:60:0x0164, B:62:0x016c, B:65:0x0178, B:68:0x0181, B:69:0x0186, B:71:0x019c, B:75:0x00ed, B:76:0x00fb, B:78:0x0100, B:80:0x0090, B:82:0x0096, B:83:0x009c, B:89:0x00b5, B:97:0x00cc, B:101:0x00d8, B:104:0x00db, B:111:0x01a3, B:112:0x01a8), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: ArrayIndexOutOfBoundsException -> 0x002a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002a, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002d, B:11:0x0034, B:15:0x0042, B:37:0x00de, B:39:0x00e7, B:40:0x0106, B:42:0x0120, B:43:0x0123, B:45:0x0130, B:48:0x0150, B:54:0x014d, B:56:0x0158, B:58:0x015e, B:60:0x0164, B:62:0x016c, B:65:0x0178, B:68:0x0181, B:69:0x0186, B:71:0x019c, B:75:0x00ed, B:76:0x00fb, B:78:0x0100, B:80:0x0090, B:82:0x0096, B:83:0x009c, B:89:0x00b5, B:97:0x00cc, B:101:0x00d8, B:104:0x00db, B:111:0x01a3, B:112:0x01a8), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130 A[Catch: ArrayIndexOutOfBoundsException -> 0x002a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002a, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002d, B:11:0x0034, B:15:0x0042, B:37:0x00de, B:39:0x00e7, B:40:0x0106, B:42:0x0120, B:43:0x0123, B:45:0x0130, B:48:0x0150, B:54:0x014d, B:56:0x0158, B:58:0x015e, B:60:0x0164, B:62:0x016c, B:65:0x0178, B:68:0x0181, B:69:0x0186, B:71:0x019c, B:75:0x00ed, B:76:0x00fb, B:78:0x0100, B:80:0x0090, B:82:0x0096, B:83:0x009c, B:89:0x00b5, B:97:0x00cc, B:101:0x00d8, B:104:0x00db, B:111:0x01a3, B:112:0x01a8), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c A[Catch: ArrayIndexOutOfBoundsException -> 0x002a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002a, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002d, B:11:0x0034, B:15:0x0042, B:37:0x00de, B:39:0x00e7, B:40:0x0106, B:42:0x0120, B:43:0x0123, B:45:0x0130, B:48:0x0150, B:54:0x014d, B:56:0x0158, B:58:0x015e, B:60:0x0164, B:62:0x016c, B:65:0x0178, B:68:0x0181, B:69:0x0186, B:71:0x019c, B:75:0x00ed, B:76:0x00fb, B:78:0x0100, B:80:0x0090, B:82:0x0096, B:83:0x009c, B:89:0x00b5, B:97:0x00cc, B:101:0x00d8, B:104:0x00db, B:111:0x01a3, B:112:0x01a8), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4953ro m26146a(C4655jo c4655jo) {
        int i11;
        int i12;
        float f11;
        int m23982c;
        int i13;
        int i14;
        int i15;
        int m23982c2;
        boolean m23984e;
        int m23980a;
        int i16;
        try {
            c4655jo.m23687w(4);
            int i17 = 1;
            int m23671g = (c4655jo.m23671g() & 3) + 1;
            if (m23671g != 3) {
                ArrayList arrayList = new ArrayList();
                int m23671g2 = c4655jo.m23671g() & 31;
                for (int i18 = 0; i18 < m23671g2; i18++) {
                    arrayList.add(m26147b(c4655jo));
                }
                int m23671g3 = c4655jo.m23671g();
                for (int i19 = 0; i19 < m23671g3; i19++) {
                    arrayList.add(m26147b(c4655jo));
                }
                float f12 = 1.0f;
                if (m23671g2 > 0) {
                    C4692ko c4692ko = new C4692ko((byte[]) arrayList.get(0), m23671g, ((byte[]) arrayList.get(0)).length);
                    c4692ko.m23983d(8);
                    int m23980a2 = c4692ko.m23980a(8);
                    c4692ko.m23983d(16);
                    c4692ko.m23982c();
                    if (m23980a2 != 100 && m23980a2 != 110 && m23980a2 != 122 && m23980a2 != 244 && m23980a2 != 44 && m23980a2 != 83 && m23980a2 != 86 && m23980a2 != 118 && m23980a2 != 128 && m23980a2 != 138) {
                        m23982c = 1;
                        c4692ko.m23982c();
                        m23982c2 = c4692ko.m23982c();
                        if (m23982c2 != 0) {
                            c4692ko.m23982c();
                        } else if (m23982c2 == 1) {
                            c4692ko.m23984e();
                            c4692ko.m23981b();
                            c4692ko.m23981b();
                            long m23982c3 = c4692ko.m23982c();
                            for (int i21 = 0; i21 < m23982c3; i21++) {
                                c4692ko.m23982c();
                            }
                        }
                        c4692ko.m23982c();
                        c4692ko.m23983d(1);
                        int m23982c4 = c4692ko.m23982c() + 1;
                        int m23982c5 = c4692ko.m23982c() + 1;
                        m23984e = c4692ko.m23984e();
                        int i22 = 2 - (m23984e ? 1 : 0);
                        int i23 = m23982c5 * i22;
                        if (!m23984e) {
                            c4692ko.m23983d(1);
                        }
                        c4692ko.m23983d(1);
                        int i24 = m23982c4 * 16;
                        int i25 = i23 * 16;
                        if (c4692ko.m23984e()) {
                            int m23982c6 = c4692ko.m23982c();
                            int m23982c7 = c4692ko.m23982c();
                            int m23982c8 = c4692ko.m23982c();
                            int m23982c9 = c4692ko.m23982c();
                            if (m23982c != 0) {
                                if (m23982c == 3) {
                                    i16 = 1;
                                } else {
                                    i16 = 2;
                                }
                                if (m23982c == 1) {
                                    i17 = 2;
                                }
                                i22 *= i17;
                                i17 = i16;
                            }
                            i24 -= (m23982c6 + m23982c7) * i17;
                            i25 -= (m23982c8 + m23982c9) * i22;
                        }
                        if (c4692ko.m23984e() && c4692ko.m23984e()) {
                            m23980a = c4692ko.m23980a(8);
                            if (m23980a != 255) {
                                int m23980a3 = c4692ko.m23980a(16);
                                int m23980a4 = c4692ko.m23980a(16);
                                if (m23980a3 != 0 && m23980a4 != 0) {
                                    f12 = m23980a3 / m23980a4;
                                }
                            } else if (m23980a < 17) {
                                f12 = AbstractC4582ho.f21850b[m23980a];
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unexpected aspect_ratio_idc value: ");
                                sb2.append(m23980a);
                            }
                        }
                        f11 = f12;
                        i11 = i24;
                        i12 = i25;
                    }
                    m23982c = c4692ko.m23982c();
                    if (m23982c == 3) {
                        c4692ko.m23984e();
                        i13 = 3;
                    } else {
                        i13 = m23982c;
                    }
                    c4692ko.m23982c();
                    c4692ko.m23982c();
                    c4692ko.m23983d(1);
                    if (c4692ko.m23984e()) {
                        if (i13 != 3) {
                            i14 = 8;
                        } else {
                            i14 = 12;
                        }
                        for (int i26 = 0; i26 < i14; i26++) {
                            if (c4692ko.m23984e()) {
                                if (i26 < 6) {
                                    i15 = 16;
                                } else {
                                    i15 = 64;
                                }
                                int i27 = 8;
                                int i28 = 8;
                                for (int i29 = 0; i29 < i15; i29++) {
                                    if (i27 != 0) {
                                        i27 = ((c4692ko.m23981b() + i28) + 256) % 256;
                                    }
                                    if (i27 != 0) {
                                        i28 = i27;
                                    }
                                }
                            }
                        }
                    }
                    c4692ko.m23982c();
                    m23982c2 = c4692ko.m23982c();
                    if (m23982c2 != 0) {
                    }
                    c4692ko.m23982c();
                    c4692ko.m23983d(1);
                    int m23982c42 = c4692ko.m23982c() + 1;
                    int m23982c52 = c4692ko.m23982c() + 1;
                    m23984e = c4692ko.m23984e();
                    int i222 = 2 - (m23984e ? 1 : 0);
                    int i232 = m23982c52 * i222;
                    if (!m23984e) {
                    }
                    c4692ko.m23983d(1);
                    int i242 = m23982c42 * 16;
                    int i252 = i232 * 16;
                    if (c4692ko.m23984e()) {
                    }
                    if (c4692ko.m23984e()) {
                        m23980a = c4692ko.m23980a(8);
                        if (m23980a != 255) {
                        }
                    }
                    f11 = f12;
                    i11 = i242;
                    i12 = i252;
                } else {
                    i11 = -1;
                    i12 = -1;
                    f11 = 1.0f;
                }
                return new C4953ro(arrayList, m23671g, i11, i12, f11);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new zzasz("Error parsing AVC config", e11);
        }
    }

    /* renamed from: b */
    private static byte[] m26147b(C4655jo c4655jo) {
        int m23674j = c4655jo.m23674j();
        int m23667c = c4655jo.m23667c();
        c4655jo.m23687w(m23674j);
        return AbstractC4397co.m20962b(c4655jo.f22891a, m23667c, m23674j);
    }
}
