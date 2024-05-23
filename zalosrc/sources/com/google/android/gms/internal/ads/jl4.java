package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class jl4 {

    /* renamed from: a */
    private static final int[] f22866a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f22867b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f22868c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f22869d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f22870e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f22871f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g */
    public static final /* synthetic */ int f22872g = 0;

    /* renamed from: a */
    public static int m23638a(ByteBuffer byteBuffer) {
        int i11 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i11 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return f22866a[i11] * 256;
        }
        return 1536;
    }

    /* renamed from: b */
    public static int m23639b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i11 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i11 + i11;
        }
        byte b11 = bArr[4];
        return m23643f((b11 & 192) >> 6, b11 & 63);
    }

    /* renamed from: c */
    public static C4671k3 m23640c(x02 x02Var, String str, String str2, zzx zzxVar) {
        int i11 = f22867b[(x02Var.m27788s() & 192) >> 6];
        int m27788s = x02Var.m27788s();
        int i12 = f22869d[(m27788s & 56) >> 3];
        if ((m27788s & 4) != 0) {
            i12++;
        }
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26511h(str);
        c5004t1.m26523s("audio/ac3");
        c5004t1.m26506e0(i12);
        c5004t1.m26524t(i11);
        c5004t1.m26500b(zzxVar);
        c5004t1.m26515k(str2);
        return c5004t1.m26529y();
    }

    /* renamed from: d */
    public static C4671k3 m23641d(x02 x02Var, String str, String str2, zzx zzxVar) {
        String str3;
        x02Var.m27776g(2);
        int i11 = f22867b[(x02Var.m27788s() & 192) >> 6];
        int m27788s = x02Var.m27788s();
        int i12 = f22869d[(m27788s & 14) >> 1];
        if ((m27788s & 1) != 0) {
            i12++;
        }
        if (((x02Var.m27788s() & 30) >> 1) > 0 && (2 & x02Var.m27788s()) != 0) {
            i12 += 2;
        }
        if (x02Var.m27778i() > 0 && (x02Var.m27788s() & 1) != 0) {
            str3 = "audio/eac3-joc";
        } else {
            str3 = "audio/eac3";
        }
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26511h(str);
        c5004t1.m26523s(str3);
        c5004t1.m26506e0(i12);
        c5004t1.m26524t(i11);
        c5004t1.m26500b(zzxVar);
        c5004t1.m26515k(str2);
        return c5004t1.m26529y();
    }

    /* renamed from: e */
    public static il4 m23642e(wz1 wz1Var) {
        String str;
        int i11;
        String str2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int m27746c;
        int i17;
        int i18;
        int i19;
        int i21;
        String str3;
        int i22;
        int m27745b = wz1Var.m27745b();
        wz1Var.m27753j(40);
        int m27746c2 = wz1Var.m27746c(5);
        wz1Var.m27751h(m27745b);
        int i23 = -1;
        if (m27746c2 > 10) {
            wz1Var.m27753j(16);
            int m27746c3 = wz1Var.m27746c(2);
            if (m27746c3 != 0) {
                if (m27746c3 != 1) {
                    if (m27746c3 == 2) {
                        i23 = 2;
                    }
                } else {
                    i23 = 1;
                }
            } else {
                i23 = 0;
            }
            wz1Var.m27753j(3);
            int m27746c4 = wz1Var.m27746c(11) + 1;
            int i24 = m27746c4 + m27746c4;
            int m27746c5 = wz1Var.m27746c(2);
            if (m27746c5 == 3) {
                i18 = f22868c[wz1Var.m27746c(2)];
                m27746c = 3;
                i17 = 6;
            } else {
                m27746c = wz1Var.m27746c(2);
                i17 = f22866a[m27746c];
                i18 = f22867b[m27746c5];
            }
            int i25 = i17 * 256;
            int m27746c6 = wz1Var.m27746c(3);
            boolean m27755l = wz1Var.m27755l();
            int i26 = f22869d[m27746c6] + (m27755l ? 1 : 0);
            wz1Var.m27753j(10);
            if (wz1Var.m27755l()) {
                wz1Var.m27753j(8);
            }
            if (m27746c6 == 0) {
                wz1Var.m27753j(5);
                if (wz1Var.m27755l()) {
                    wz1Var.m27753j(8);
                }
                i19 = 0;
                m27746c6 = 0;
            } else {
                i19 = m27746c6;
            }
            if (i23 == 1) {
                if (wz1Var.m27755l()) {
                    wz1Var.m27753j(16);
                }
                i21 = 1;
            } else {
                i21 = i23;
            }
            if (wz1Var.m27755l()) {
                if (i19 > 2) {
                    wz1Var.m27753j(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    wz1Var.m27753j(6);
                }
                if ((i19 & 4) != 0) {
                    wz1Var.m27753j(6);
                }
                if (m27755l && wz1Var.m27755l()) {
                    wz1Var.m27753j(5);
                }
                if (i21 == 0) {
                    if (wz1Var.m27755l()) {
                        wz1Var.m27753j(6);
                    }
                    if (i19 == 0 && wz1Var.m27755l()) {
                        wz1Var.m27753j(6);
                    }
                    if (wz1Var.m27755l()) {
                        wz1Var.m27753j(6);
                    }
                    int m27746c7 = wz1Var.m27746c(2);
                    if (m27746c7 == 1) {
                        wz1Var.m27753j(5);
                    } else if (m27746c7 == 2) {
                        wz1Var.m27753j(12);
                    } else if (m27746c7 == 3) {
                        int m27746c8 = wz1Var.m27746c(5);
                        if (wz1Var.m27755l()) {
                            wz1Var.m27753j(5);
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(4);
                            }
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(4);
                            }
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(4);
                            }
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(4);
                            }
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(4);
                            }
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(4);
                            }
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(4);
                            }
                            if (wz1Var.m27755l()) {
                                if (wz1Var.m27755l()) {
                                    wz1Var.m27753j(4);
                                }
                                if (wz1Var.m27755l()) {
                                    wz1Var.m27753j(4);
                                }
                            }
                        }
                        if (wz1Var.m27755l()) {
                            wz1Var.m27753j(5);
                            if (wz1Var.m27755l()) {
                                wz1Var.m27753j(7);
                                if (wz1Var.m27755l()) {
                                    wz1Var.m27753j(8);
                                    wz1Var.m27753j((m27746c8 + 2) * 8);
                                    wz1Var.m27747d();
                                }
                            }
                        }
                        wz1Var.m27753j((m27746c8 + 2) * 8);
                        wz1Var.m27747d();
                    }
                    if (i19 < 2) {
                        if (wz1Var.m27755l()) {
                            wz1Var.m27753j(14);
                        }
                        if (m27746c6 == 0 && wz1Var.m27755l()) {
                            wz1Var.m27753j(14);
                        }
                    }
                    if (wz1Var.m27755l()) {
                        if (m27746c == 0) {
                            wz1Var.m27753j(5);
                            i21 = 0;
                            m27746c = 0;
                        } else {
                            for (int i27 = 0; i27 < i17; i27++) {
                                if (wz1Var.m27755l()) {
                                    wz1Var.m27753j(5);
                                }
                            }
                        }
                    }
                    i21 = 0;
                }
            }
            if (wz1Var.m27755l()) {
                wz1Var.m27753j(5);
                if (i19 == 2) {
                    wz1Var.m27753j(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    wz1Var.m27753j(2);
                }
                if (wz1Var.m27755l()) {
                    i22 = 8;
                    wz1Var.m27753j(8);
                } else {
                    i22 = 8;
                }
                if (i19 == 0 && wz1Var.m27755l()) {
                    wz1Var.m27753j(i22);
                }
                if (m27746c5 < 3) {
                    wz1Var.m27752i();
                }
            }
            if (i21 == 0 && m27746c != 3) {
                wz1Var.m27752i();
            }
            if (i21 == 2 && (m27746c == 3 || wz1Var.m27755l())) {
                wz1Var.m27753j(6);
            }
            if (wz1Var.m27755l() && wz1Var.m27746c(6) == 1 && wz1Var.m27746c(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i15 = i23;
            i12 = i24;
            i16 = i25;
            i13 = i18;
            i14 = i26;
        } else {
            wz1Var.m27753j(32);
            int m27746c9 = wz1Var.m27746c(2);
            if (m27746c9 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            int m23643f = m23643f(m27746c9, wz1Var.m27746c(6));
            wz1Var.m27753j(8);
            int m27746c10 = wz1Var.m27746c(3);
            if ((m27746c10 & 1) != 0 && m27746c10 != 1) {
                wz1Var.m27753j(2);
            }
            if ((m27746c10 & 4) != 0) {
                wz1Var.m27753j(2);
            }
            if (m27746c10 == 2) {
                wz1Var.m27753j(2);
            }
            if (m27746c9 < 3) {
                i11 = f22867b[m27746c9];
            } else {
                i11 = -1;
            }
            str2 = str;
            i12 = m23643f;
            i13 = i11;
            i14 = f22869d[m27746c10] + (wz1Var.m27755l() ? 1 : 0);
            i15 = -1;
            i16 = 1536;
        }
        return new il4(str2, i15, i14, i13, i12, i16, null);
    }

    /* renamed from: f */
    private static int m23643f(int i11, int i12) {
        int i13 = i12 / 2;
        if (i11 >= 0 && i11 < 3 && i12 >= 0 && i13 < 19) {
            int i14 = f22867b[i11];
            if (i14 == 44100) {
                int i15 = f22871f[i13] + (i12 & 1);
                return i15 + i15;
            }
            int i16 = f22870e[i13];
            if (i14 == 32000) {
                return i16 * 6;
            }
            return i16 * 4;
        }
        return -1;
    }
}
