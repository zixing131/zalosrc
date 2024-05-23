package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.w1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5115w1 {

    /* renamed from: a */
    public static final InterfaceC5041u1 f29650a = new InterfaceC5041u1() { // from class: com.google.android.gms.internal.ads.s1
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzbq m27444a(byte[] bArr, int i11, InterfaceC5041u1 interfaceC5041u1, C4522g1 c4522g1) {
        boolean z11;
        C5078v1 c5078v1;
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList = new ArrayList();
        x02 x02Var = new x02(bArr, i11);
        boolean z13 = false;
        int i19 = 10;
        if (x02Var.m27778i() < 10) {
            lr1.m24356e("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int m27790u = x02Var.m27790u();
            if (m27790u != 4801587) {
                lr1.m24356e("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(m27790u)))));
            } else {
                int m27788s = x02Var.m27788s();
                x02Var.m27776g(1);
                int m27788s2 = x02Var.m27788s();
                int m27787r = x02Var.m27787r();
                if (m27788s == 2) {
                    if ((m27788s2 & 64) != 0) {
                        lr1.m24356e("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    if (m27788s >= 4 && (m27788s2 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c5078v1 = new C5078v1(m27788s, z11, m27787r);
                } else {
                    if (m27788s == 3) {
                        if ((m27788s2 & 64) != 0) {
                            int m27782m = x02Var.m27782m();
                            x02Var.m27776g(m27782m);
                            m27787r -= m27782m + 4;
                        }
                    } else if (m27788s == 4) {
                        if ((m27788s2 & 64) != 0) {
                            int m27787r2 = x02Var.m27787r();
                            x02Var.m27776g(m27787r2 - 4);
                            m27787r -= m27787r2;
                        }
                        if ((m27788s2 & 16) != 0) {
                            m27787r -= 10;
                        }
                    } else {
                        lr1.m24356e("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + m27788s);
                    }
                    if (m27788s >= 4) {
                    }
                    z11 = false;
                    c5078v1 = new C5078v1(m27788s, z11, m27787r);
                }
                if (c5078v1 != null) {
                    return null;
                }
                int m27780k = x02Var.m27780k();
                i12 = c5078v1.f29111a;
                if (i12 == 2) {
                    i19 = 6;
                }
                i13 = c5078v1.f29113c;
                z12 = c5078v1.f29112b;
                if (z12) {
                    i18 = c5078v1.f29113c;
                    i13 = m27448e(x02Var, i18);
                }
                x02Var.m27774e(m27780k + i13);
                i14 = c5078v1.f29111a;
                if (!m27453j(x02Var, i14, i19, false)) {
                    i16 = c5078v1.f29111a;
                    if (i16 != 4 || !m27453j(x02Var, 4, i19, true)) {
                        i17 = c5078v1.f29111a;
                        lr1.m24356e("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + i17);
                        return null;
                    }
                    z13 = true;
                }
                while (x02Var.m27778i() >= i19) {
                    i15 = c5078v1.f29111a;
                    zzadd m27449f = m27449f(i15, x02Var, z13, i19, interfaceC5041u1);
                    if (m27449f != null) {
                        arrayList.add(m27449f);
                    }
                }
                return new zzbq(arrayList);
            }
        }
        c5078v1 = null;
        if (c5078v1 != null) {
        }
    }

    /* renamed from: b */
    private static int m27445b(int i11) {
        return (i11 == 0 || i11 == 3) ? 1 : 2;
    }

    /* renamed from: c */
    private static int m27446c(byte[] bArr, int i11, int i12) {
        int m27447d = m27447d(bArr, i11);
        if (i12 == 0 || i12 == 3) {
            return m27447d;
        }
        while (true) {
            int length = bArr.length;
            if (m27447d < length - 1) {
                if ((m27447d - i11) % 2 == 0 && bArr[m27447d + 1] == 0) {
                    return m27447d;
                }
                m27447d = m27447d(bArr, m27447d + 1);
            } else {
                return length;
            }
        }
    }

    /* renamed from: d */
    private static int m27447d(byte[] bArr, int i11) {
        while (true) {
            int length = bArr.length;
            if (i11 < length) {
                if (bArr[i11] == 0) {
                    return i11;
                }
                i11++;
            } else {
                return length;
            }
        }
    }

    /* renamed from: e */
    private static int m27448e(x02 x02Var, int i11) {
        byte[] m27777h = x02Var.m27777h();
        int m27780k = x02Var.m27780k();
        int i12 = m27780k;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < m27780k + i11) {
                if ((m27777h[i12] & 255) == 255 && m27777h[i13] == 0) {
                    System.arraycopy(m27777h, i12 + 2, m27777h, i13, (i11 - (i12 - m27780k)) - 2);
                    i11--;
                }
                i12 = i13;
            } else {
                return i11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x028d, code lost:            if (r9 == 67) goto L153;     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x030a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:233:0x0308 */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0520  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzadd m27449f(int i11, x02 x02Var, boolean z11, int i12, InterfaceC5041u1 interfaceC5041u1) {
        int m27790u;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        boolean z14;
        String str;
        int i15;
        int i16;
        String str2;
        int i17;
        String str3;
        int i18;
        int i19;
        int i21;
        zzadd zzacsVar;
        int m27447d;
        String m25656a;
        zzadd zzadjVar;
        int m27788s = x02Var.m27788s();
        int m27788s2 = x02Var.m27788s();
        int m27788s3 = x02Var.m27788s();
        int m27788s4 = i11 >= 3 ? x02Var.m27788s() : 0;
        if (i11 == 4) {
            m27790u = x02Var.m27791v();
            if (!z11) {
                m27790u = ((m27790u >> 24) << 21) | (m27790u & 255) | (((m27790u >> 8) & 255) << 7) | (((m27790u >> 16) & 255) << 14);
            }
        } else if (i11 == 3) {
            m27790u = x02Var.m27791v();
        } else {
            m27790u = x02Var.m27790u();
        }
        int m27792w = i11 >= 3 ? x02Var.m27792w() : 0;
        zzadd zzaddVar = null;
        if (m27788s == 0 && m27788s2 == 0 && m27788s3 == 0 && m27788s4 == 0 && m27790u == 0 && m27792w == 0) {
            x02Var.m27775f(x02Var.m27781l());
            return null;
        }
        int m27780k = x02Var.m27780k() + m27790u;
        if (m27780k > x02Var.m27781l()) {
            lr1.m24356e("Id3Decoder", "Frame size exceeds remaining tag data");
            x02Var.m27775f(x02Var.m27781l());
            return null;
        }
        if (interfaceC5041u1 != null) {
            x02Var.m27775f(m27780k);
            return null;
        }
        if (i11 == 3) {
            i13 = (m27792w & 128) != 0 ? 1 : 0;
            boolean z15 = (m27792w & 64) != 0;
            z12 = (m27792w & 32) != 0;
            z13 = z15;
            z14 = false;
            i14 = i13;
        } else if (i11 == 4) {
            boolean z16 = (m27792w & 64) != 0;
            i14 = (m27792w & 8) != 0 ? 1 : 0;
            z13 = (m27792w & 4) != 0;
            z14 = (m27792w & 2) != 0;
            int i22 = m27792w & 1;
            z12 = z16;
            i13 = i22;
        } else {
            i13 = 0;
            z12 = false;
            i14 = 0;
            z13 = false;
            z14 = false;
        }
        if (i14 == 0 && !z13) {
            if (z12) {
                m27790u--;
                x02Var.m27776g(1);
            }
            if (i13 != 0) {
                m27790u -= 4;
                x02Var.m27776g(4);
            }
            if (z14) {
                m27790u = m27448e(x02Var, m27790u);
            }
            try {
                try {
                    try {
                        if (m27788s == 84 && m27788s2 == 88 && m27788s3 == 88 && (i11 == 2 || m27788s4 == 88)) {
                            if (m27790u > 0) {
                                int m27788s5 = x02Var.m27788s();
                                String m27451h = m27451h(m27788s5);
                                int i23 = m27790u - 1;
                                byte[] bArr = new byte[i23];
                                x02Var.m27771b(bArr, 0, i23);
                                int m27446c = m27446c(bArr, 0, m27788s5);
                                String str4 = new String(bArr, 0, m27446c, m27451h);
                                int m27445b = m27446c + m27445b(m27788s5);
                                zzadjVar = new zzadl("TXXX", str4, m27450g(bArr, m27445b, m27446c(bArr, m27445b, m27788s5), m27451h));
                                zzaddVar = zzadjVar;
                            }
                            i17 = m27788s;
                            i21 = m27788s2;
                            i19 = m27788s3;
                            str3 = "Id3Decoder";
                            i18 = m27788s4;
                            i16 = m27780k;
                            if (zzaddVar == null) {
                            }
                            x02Var.m27775f(i16);
                            return zzaddVar;
                        }
                        if (m27788s == 84) {
                            String m27452i = m27452i(i11, 84, m27788s2, m27788s3, m27788s4);
                            if (m27790u > 0) {
                                int m27788s6 = x02Var.m27788s();
                                String m27451h2 = m27451h(m27788s6);
                                int i24 = m27790u - 1;
                                byte[] bArr2 = new byte[i24];
                                x02Var.m27771b(bArr2, 0, i24);
                                zzadjVar = new zzadl(m27452i, null, new String(bArr2, 0, m27446c(bArr2, 0, m27788s6), m27451h2));
                                zzaddVar = zzadjVar;
                                i17 = m27788s;
                                i21 = m27788s2;
                                i19 = m27788s3;
                                str3 = "Id3Decoder";
                                i18 = m27788s4;
                                i16 = m27780k;
                                if (zzaddVar == null) {
                                }
                                x02Var.m27775f(i16);
                                return zzaddVar;
                            }
                            i17 = m27788s;
                            i21 = m27788s2;
                            i19 = m27788s3;
                            str3 = "Id3Decoder";
                            i18 = m27788s4;
                            i16 = m27780k;
                            if (zzaddVar == null) {
                                try {
                                    str = str3;
                                } catch (UnsupportedEncodingException unused) {
                                    str = str3;
                                }
                                try {
                                    lr1.m24356e(str, "Failed to decode frame: id=" + m27452i(i11, i17, i21, i19, i18) + ", frameSize=" + m27790u);
                                } catch (UnsupportedEncodingException unused2) {
                                    m27780k = i16;
                                    lr1.m24356e(str, "Unsupported character encoding");
                                    x02Var.m27775f(m27780k);
                                    return null;
                                }
                            }
                            x02Var.m27775f(i16);
                            return zzaddVar;
                        }
                        if (m27788s != 87) {
                            i15 = m27788s;
                        } else {
                            if (m27788s2 == 88 && m27788s3 == 88 && (i11 == 2 || m27788s4 == 88)) {
                                if (m27790u > 0) {
                                    int m27788s7 = x02Var.m27788s();
                                    String m27451h3 = m27451h(m27788s7);
                                    int i25 = m27790u - 1;
                                    byte[] bArr3 = new byte[i25];
                                    x02Var.m27771b(bArr3, 0, i25);
                                    int m27446c2 = m27446c(bArr3, 0, m27788s7);
                                    String str5 = new String(bArr3, 0, m27446c2, m27451h3);
                                    int m27445b2 = m27446c2 + m27445b(m27788s7);
                                    zzadjVar = new zzadn("WXXX", str5, m27450g(bArr3, m27445b2, m27447d(bArr3, m27445b2), "ISO-8859-1"));
                                    zzaddVar = zzadjVar;
                                }
                                i17 = m27788s;
                                i21 = m27788s2;
                                i19 = m27788s3;
                                str3 = "Id3Decoder";
                                i18 = m27788s4;
                                i16 = m27780k;
                                if (zzaddVar == null) {
                                }
                                x02Var.m27775f(i16);
                                return zzaddVar;
                            }
                            i15 = 87;
                        }
                        if (i15 == 87) {
                            String m27452i2 = m27452i(i11, 87, m27788s2, m27788s3, m27788s4);
                            byte[] bArr4 = new byte[m27790u];
                            x02Var.m27771b(bArr4, 0, m27790u);
                            zzadjVar = new zzadn(m27452i2, null, new String(bArr4, 0, m27447d(bArr4, 0), "ISO-8859-1"));
                        } else {
                            if (i15 == 80) {
                                if (m27788s2 == 82 && m27788s3 == 73 && m27788s4 == 86) {
                                    byte[] bArr5 = new byte[m27790u];
                                    x02Var.m27771b(bArr5, 0, m27790u);
                                    int m27447d2 = m27447d(bArr5, 0);
                                    zzadjVar = new zzadj(new String(bArr5, 0, m27447d2, "ISO-8859-1"), m27454k(bArr5, m27447d2 + 1, m27790u));
                                } else {
                                    i15 = 80;
                                }
                            }
                            try {
                            } catch (UnsupportedEncodingException unused3) {
                                str = "Id3Decoder";
                                m27780k = i16;
                                lr1.m24356e(str, "Unsupported character encoding");
                                x02Var.m27775f(m27780k);
                                return null;
                            }
                            try {
                                if (i15 != 71) {
                                    i16 = m27780k;
                                } else if (m27788s2 == 69 && m27788s3 == 79 && (m27788s4 == 66 || i11 == 2)) {
                                    try {
                                        int m27788s8 = x02Var.m27788s();
                                        String m27451h4 = m27451h(m27788s8);
                                        int i26 = m27790u - 1;
                                        byte[] bArr6 = new byte[i26];
                                        x02Var.m27771b(bArr6, 0, i26);
                                        int m27447d3 = m27447d(bArr6, 0);
                                        i16 = m27780k;
                                        String str6 = new String(bArr6, 0, m27447d3, "ISO-8859-1");
                                        int i27 = m27447d3 + 1;
                                        int m27446c3 = m27446c(bArr6, i27, m27788s8);
                                        String m27450g = m27450g(bArr6, i27, m27446c3, m27451h4);
                                        int m27445b3 = m27446c3 + m27445b(m27788s8);
                                        int m27446c4 = m27446c(bArr6, m27445b3, m27788s8);
                                        zzadd zzacyVar = new zzacy(str6, m27450g, m27450g(bArr6, m27445b3, m27446c4, m27451h4), m27454k(bArr6, m27446c4 + m27445b(m27788s8), i26));
                                        i17 = m27788s;
                                        i21 = m27788s2;
                                        i19 = m27788s3;
                                        str3 = "Id3Decoder";
                                        zzaddVar = zzacyVar;
                                        i18 = m27788s4;
                                        if (zzaddVar == null) {
                                        }
                                        x02Var.m27775f(i16);
                                        return zzaddVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } else {
                                    i16 = m27780k;
                                    i15 = 71;
                                }
                                if (i11 == 2) {
                                    if (i15 == 80 && m27788s2 == 73 && m27788s3 == 67) {
                                        int m27788s9 = x02Var.m27788s();
                                        String m27451h5 = m27451h(m27788s9);
                                        int i28 = m27790u - 1;
                                        byte[] bArr7 = new byte[i28];
                                        x02Var.m27771b(bArr7, 0, i28);
                                        if (i11 == 2) {
                                            m25656a = "image/".concat(String.valueOf(q43.m25656a(new String(bArr7, 0, 3, "ISO-8859-1"))));
                                            if ("image/jpg".equals(m25656a)) {
                                                m25656a = "image/jpeg";
                                            }
                                            m27447d = 2;
                                        } else {
                                            m27447d = m27447d(bArr7, 0);
                                            m25656a = q43.m25656a(new String(bArr7, 0, m27447d, "ISO-8859-1"));
                                            if (m25656a.indexOf(47) == -1) {
                                                m25656a = "image/".concat(m25656a);
                                            }
                                        }
                                        int i29 = bArr7[m27447d + 1] & 255;
                                        int i31 = m27447d + 2;
                                        int m27446c5 = m27446c(bArr7, i31, m27788s9);
                                        str3 = "Id3Decoder";
                                        i17 = m27788s;
                                        zzacsVar = new zzaco(m25656a, new String(bArr7, i31, m27446c5 - i31, m27451h5), i29, m27454k(bArr7, m27446c5 + m27445b(m27788s9), i28));
                                        zzaddVar = zzacsVar;
                                        i21 = m27788s2;
                                        i19 = m27788s3;
                                        i18 = m27788s4;
                                    }
                                    i17 = m27788s;
                                    str3 = "Id3Decoder";
                                    if (i15 != 67 && m27788s2 == 79 && m27788s3 == 77 && (m27788s4 == 77 || i11 == 2)) {
                                        if (m27790u < 4) {
                                            i21 = m27788s2;
                                            i19 = m27788s3;
                                            i18 = m27788s4;
                                            zzaddVar = null;
                                        } else {
                                            int m27788s10 = x02Var.m27788s();
                                            String m27451h6 = m27451h(m27788s10);
                                            byte[] bArr8 = new byte[3];
                                            x02Var.m27771b(bArr8, 0, 3);
                                            String str7 = new String(bArr8, 0, 3);
                                            int i32 = m27790u - 4;
                                            byte[] bArr9 = new byte[i32];
                                            x02Var.m27771b(bArr9, 0, i32);
                                            int m27446c6 = m27446c(bArr9, 0, m27788s10);
                                            String str8 = new String(bArr9, 0, m27446c6, m27451h6);
                                            int m27445b4 = m27446c6 + m27445b(m27788s10);
                                            zzacsVar = new zzacw(str7, str8, m27450g(bArr9, m27445b4, m27446c(bArr9, m27445b4, m27788s10), m27451h6));
                                            zzaddVar = zzacsVar;
                                            i21 = m27788s2;
                                            i19 = m27788s3;
                                            i18 = m27788s4;
                                        }
                                    } else if (i15 != 67 && m27788s2 == 72 && m27788s3 == 65 && m27788s4 == 80) {
                                        int m27780k2 = x02Var.m27780k();
                                        int m27447d4 = m27447d(x02Var.m27777h(), m27780k2);
                                        String str9 = new String(x02Var.m27777h(), m27780k2, m27447d4 - m27780k2, "ISO-8859-1");
                                        x02Var.m27775f(m27447d4 + 1);
                                        int m27782m = x02Var.m27782m();
                                        int m27782m2 = x02Var.m27782m();
                                        long m27762A = x02Var.m27762A();
                                        if (m27762A == 4294967295L) {
                                            m27762A = -1;
                                        }
                                        long j11 = m27762A;
                                        long m27762A2 = x02Var.m27762A();
                                        if (m27762A2 == 4294967295L) {
                                            m27762A2 = -1;
                                        }
                                        long j12 = m27762A2;
                                        ArrayList arrayList = new ArrayList();
                                        int i33 = m27780k2 + m27790u;
                                        while (x02Var.m27780k() < i33) {
                                            zzadd m27449f = m27449f(i11, x02Var, z11, i12, null);
                                            if (m27449f != null) {
                                                arrayList.add(m27449f);
                                            }
                                        }
                                        zzacsVar = new zzacs(str9, m27782m, m27782m2, j11, j12, (zzadd[]) arrayList.toArray(new zzadd[0]));
                                        zzaddVar = zzacsVar;
                                        i21 = m27788s2;
                                        i19 = m27788s3;
                                        i18 = m27788s4;
                                    } else if (i15 != 67 && m27788s2 == 84 && m27788s3 == 79 && m27788s4 == 67) {
                                        int m27780k3 = x02Var.m27780k();
                                        int m27447d5 = m27447d(x02Var.m27777h(), m27780k3);
                                        String str10 = new String(x02Var.m27777h(), m27780k3, m27447d5 - m27780k3, "ISO-8859-1");
                                        x02Var.m27775f(m27447d5 + 1);
                                        int m27788s11 = x02Var.m27788s();
                                        boolean z17 = (m27788s11 & 2) != 0;
                                        int i34 = m27788s11 & 1;
                                        int m27788s12 = x02Var.m27788s();
                                        String[] strArr = new String[m27788s12];
                                        int i35 = 0;
                                        while (i35 < m27788s12) {
                                            int m27780k4 = x02Var.m27780k();
                                            int i36 = m27788s12;
                                            int m27447d6 = m27447d(x02Var.m27777h(), m27780k4);
                                            strArr[i35] = new String(x02Var.m27777h(), m27780k4, m27447d6 - m27780k4, "ISO-8859-1");
                                            x02Var.m27775f(m27447d6 + 1);
                                            i35++;
                                            m27788s12 = i36;
                                            m27788s4 = m27788s4;
                                            m27788s3 = m27788s3;
                                            m27788s2 = m27788s2;
                                        }
                                        int i37 = m27788s2;
                                        int i38 = m27788s3;
                                        int i39 = m27788s4;
                                        ArrayList arrayList2 = new ArrayList();
                                        int i41 = m27780k3 + m27790u;
                                        while (x02Var.m27780k() < i41) {
                                            zzadd m27449f2 = m27449f(i11, x02Var, z11, i12, null);
                                            if (m27449f2 != null) {
                                                arrayList2.add(m27449f2);
                                            }
                                        }
                                        zzaddVar = new zzacu(str10, z17, 1 == i34, strArr, (zzadd[]) arrayList2.toArray(new zzadd[0]));
                                        i18 = i39;
                                        i19 = i38;
                                        i21 = i37;
                                    } else {
                                        int i42 = m27788s4;
                                        if (i15 != 77) {
                                            i21 = m27788s2;
                                            if (i21 == 76) {
                                                i19 = m27788s3;
                                                i18 = i42;
                                                if (i19 == 76 && i18 == 84) {
                                                    int m27792w2 = x02Var.m27792w();
                                                    int m27790u2 = x02Var.m27790u();
                                                    int m27790u3 = x02Var.m27790u();
                                                    int m27788s13 = x02Var.m27788s();
                                                    int m27788s14 = x02Var.m27788s();
                                                    wz1 wz1Var = new wz1();
                                                    wz1Var.m27750g(x02Var.m27777h(), x02Var.m27781l());
                                                    wz1Var.m27751h(x02Var.m27780k() * 8);
                                                    int i43 = ((m27790u - 10) * 8) / (m27788s13 + m27788s14);
                                                    int[] iArr = new int[i43];
                                                    int[] iArr2 = new int[i43];
                                                    for (int i44 = 0; i44 < i43; i44++) {
                                                        int m27746c = wz1Var.m27746c(m27788s13);
                                                        int m27746c2 = wz1Var.m27746c(m27788s14);
                                                        iArr[i44] = m27746c;
                                                        iArr2[i44] = m27746c2;
                                                    }
                                                    zzaddVar = new zzadh(m27792w2, m27790u2, m27790u3, iArr, iArr2);
                                                }
                                            } else {
                                                i18 = i42;
                                                i19 = m27788s3;
                                            }
                                        } else {
                                            i18 = i42;
                                            i19 = m27788s3;
                                            i21 = m27788s2;
                                        }
                                        String m27452i3 = m27452i(i11, i15, i21, i19, i18);
                                        byte[] bArr10 = new byte[m27790u];
                                        x02Var.m27771b(bArr10, 0, m27790u);
                                        zzaddVar = new zzacq(m27452i3, bArr10);
                                    }
                                } else {
                                    if (i15 == 65) {
                                        if (m27788s2 == 80) {
                                            if (m27788s3 == 73) {
                                            }
                                        }
                                    }
                                    i17 = m27788s;
                                    str3 = "Id3Decoder";
                                    if (i15 != 67) {
                                    }
                                    if (i15 != 67) {
                                    }
                                    if (i15 != 67) {
                                    }
                                    int i422 = m27788s4;
                                    if (i15 != 77) {
                                    }
                                    String m27452i32 = m27452i(i11, i15, i21, i19, i18);
                                    byte[] bArr102 = new byte[m27790u];
                                    x02Var.m27771b(bArr102, 0, m27790u);
                                    zzaddVar = new zzacq(m27452i32, bArr102);
                                }
                                if (zzaddVar == null) {
                                }
                                x02Var.m27775f(i16);
                                return zzaddVar;
                            } catch (UnsupportedEncodingException unused4) {
                                m27780k = i16;
                                str = str2;
                                lr1.m24356e(str, "Unsupported character encoding");
                                x02Var.m27775f(m27780k);
                                return null;
                            }
                        }
                        zzaddVar = zzadjVar;
                        i17 = m27788s;
                        i21 = m27788s2;
                        i19 = m27788s3;
                        str3 = "Id3Decoder";
                        i18 = m27788s4;
                        i16 = m27780k;
                        if (zzaddVar == null) {
                        }
                        x02Var.m27775f(i16);
                        return zzaddVar;
                    } catch (UnsupportedEncodingException unused5) {
                        str = "Id3Decoder";
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                m27780k = i16;
            }
            th = th4;
            m27780k = i16;
            x02Var.m27775f(m27780k);
            throw th;
        }
        lr1.m24356e("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        x02Var.m27775f(m27780k);
        return null;
    }

    /* renamed from: g */
    private static String m27450g(byte[] bArr, int i11, int i12, String str) {
        if (i12 > i11 && i12 <= bArr.length) {
            return new String(bArr, i11, i12 - i11, str);
        }
        return "";
    }

    /* renamed from: h */
    private static String m27451h(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: i */
    private static String m27452i(int i11, int i12, int i13, int i14, int i15) {
        if (i11 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:            if ((r10 & 128) != 0) goto L44;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m27453j(x02 x02Var, int i11, int i12, boolean z11) {
        int m27790u;
        long m27790u2;
        int i13;
        int i14;
        int m27780k = x02Var.m27780k();
        while (true) {
            try {
                int i15 = 1;
                if (x02Var.m27778i() >= i12) {
                    if (i11 >= 3) {
                        m27790u = x02Var.m27782m();
                        m27790u2 = x02Var.m27762A();
                        i13 = x02Var.m27792w();
                    } else {
                        m27790u = x02Var.m27790u();
                        m27790u2 = x02Var.m27790u();
                        i13 = 0;
                    }
                    if (m27790u == 0 && m27790u2 == 0 && i13 == 0) {
                        x02Var.m27775f(m27780k);
                        return true;
                    }
                    if (i11 == 4 && !z11) {
                        if ((8421504 & m27790u2) != 0) {
                            x02Var.m27775f(m27780k);
                            return false;
                        }
                        m27790u2 = ((m27790u2 >> 24) << 21) | ((255 & (m27790u2 >> 16)) << 14) | (m27790u2 & 255) | (((m27790u2 >> 8) & 255) << 7);
                    }
                    if (i11 == 4) {
                        if ((i13 & 64) == 0) {
                            i15 = 0;
                        }
                        int i16 = i15;
                        i15 = i13 & 1;
                        i14 = i16;
                    } else {
                        if (i11 == 3) {
                            if ((i13 & 32) != 0) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                        } else {
                            i14 = 0;
                        }
                        i15 = 0;
                    }
                    if (i15 != 0) {
                        i14 += 4;
                    }
                    if (m27790u2 < i14) {
                        x02Var.m27775f(m27780k);
                        return false;
                    }
                    if (x02Var.m27778i() < m27790u2) {
                        x02Var.m27775f(m27780k);
                        return false;
                    }
                    x02Var.m27776g((int) m27790u2);
                } else {
                    x02Var.m27775f(m27780k);
                    return true;
                }
            } catch (Throwable th2) {
                x02Var.m27775f(m27780k);
                throw th2;
            }
        }
    }

    /* renamed from: k */
    private static byte[] m27454k(byte[] bArr, int i11, int i12) {
        if (i12 <= i11) {
            return g92.f20479f;
        }
        return Arrays.copyOfRange(bArr, i11, i12);
    }
}
