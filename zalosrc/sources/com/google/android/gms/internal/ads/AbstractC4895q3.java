package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.q3 */
/* loaded from: classes2.dex */
public abstract class AbstractC4895q3 {

    /* renamed from: a */
    private static final byte[] f26612a = g92.m22308B("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:            r2 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:            if (r3 != 13) goto L92;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m25634a(C4524g3 c4524g3) {
        x02 x02Var = c4524g3.f20375b;
        x02Var.m27775f(8);
        zzbq zzbqVar = null;
        zzbq zzbqVar2 = null;
        while (x02Var.m27778i() >= 8) {
            int m27780k = x02Var.m27780k();
            int m27782m = x02Var.m27782m();
            int m27782m2 = x02Var.m27782m();
            if (m27782m2 == 1835365473) {
                x02Var.m27775f(m27780k);
                int i11 = m27780k + m27782m;
                x02Var.m27776g(8);
                m25637d(x02Var);
                while (true) {
                    if (x02Var.m27780k() >= i11) {
                        break;
                    }
                    int m27780k2 = x02Var.m27780k();
                    int m27782m3 = x02Var.m27782m();
                    if (x02Var.m27782m() == 1768715124) {
                        x02Var.m27775f(m27780k2);
                        int i12 = m27780k2 + m27782m3;
                        x02Var.m27776g(8);
                        ArrayList arrayList = new ArrayList();
                        while (x02Var.m27780k() < i12) {
                            zzbp m27819a = AbstractC5155x3.m27819a(x02Var);
                            if (m27819a != null) {
                                arrayList.add(m27819a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbqVar = new zzbq(arrayList);
                        }
                    } else {
                        x02Var.m27775f(m27780k2 + m27782m3);
                    }
                }
            } else if (m27782m2 == 1936553057) {
                x02Var.m27775f(m27780k);
                int i13 = m27780k + m27782m;
                x02Var.m27776g(12);
                while (true) {
                    if (x02Var.m27780k() >= i13) {
                        break;
                    }
                    int m27780k3 = x02Var.m27780k();
                    int m27782m4 = x02Var.m27782m();
                    if (x02Var.m27782m() == 1935766900) {
                        if (m27782m4 >= 14) {
                            x02Var.m27776g(5);
                            int m27788s = x02Var.m27788s();
                            float f11 = 120.0f;
                            if (m27788s == 12) {
                                if (m27788s == 12) {
                                    f11 = 240.0f;
                                }
                            }
                            x02Var.m27776g(1);
                            zzbqVar2 = new zzbq(-9223372036854775807L, new zzadw(f11, x02Var.m27788s()));
                        }
                    } else {
                        x02Var.m27775f(m27780k3 + m27782m4);
                    }
                }
                zzbqVar2 = null;
            }
            x02Var.m27775f(m27780k + m27782m);
        }
        return Pair.create(zzbqVar, zzbqVar2);
    }

    /* renamed from: b */
    public static zzbq m25635b(C4487f3 c4487f3) {
        zzadq zzadqVar;
        C4524g3 m21871d = c4487f3.m21871d(1751411826);
        C4524g3 m21871d2 = c4487f3.m21871d(1801812339);
        C4524g3 m21871d3 = c4487f3.m21871d(1768715124);
        if (m21871d == null || m21871d2 == null || m21871d3 == null || m25640g(m21871d.f20375b) != 1835299937) {
            return null;
        }
        x02 x02Var = m21871d2.f20375b;
        x02Var.m27775f(12);
        int m27782m = x02Var.m27782m();
        String[] strArr = new String[m27782m];
        for (int i11 = 0; i11 < m27782m; i11++) {
            int m27782m2 = x02Var.m27782m();
            x02Var.m27776g(4);
            strArr[i11] = x02Var.m27767F(m27782m2 - 8, w43.f29782c);
        }
        x02 x02Var2 = m21871d3.f20375b;
        x02Var2.m27775f(8);
        ArrayList arrayList = new ArrayList();
        while (x02Var2.m27778i() > 8) {
            int m27780k = x02Var2.m27780k();
            int m27782m3 = x02Var2.m27782m();
            int m27782m4 = x02Var2.m27782m() - 1;
            if (m27782m4 >= 0 && m27782m4 < m27782m) {
                String str = strArr[m27782m4];
                int i12 = m27780k + m27782m3;
                String[] strArr2 = AbstractC5155x3.f30313a;
                while (true) {
                    int m27780k2 = x02Var2.m27780k();
                    if (m27780k2 < i12) {
                        int m27782m5 = x02Var2.m27782m();
                        if (x02Var2.m27782m() == 1684108385) {
                            int m27782m6 = x02Var2.m27782m();
                            int m27782m7 = x02Var2.m27782m();
                            int i13 = m27782m5 - 16;
                            byte[] bArr = new byte[i13];
                            x02Var2.m27771b(bArr, 0, i13);
                            zzadqVar = new zzadq(str, bArr, m27782m7, m27782m6);
                            break;
                        }
                        x02Var2.m27775f(m27780k2 + m27782m5);
                    } else {
                        zzadqVar = null;
                        break;
                    }
                }
                if (zzadqVar != null) {
                    arrayList.add(zzadqVar);
                }
            } else {
                lr1.m24356e("AtomParsers", "Skipped metadata with unknown key index: " + m27782m4);
            }
            x02Var2.m27775f(m27780k + m27782m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x00b8, code lost:            if (r7 == 0) goto L697;     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0685, code lost:            if (r1 != 3) goto L1000;     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x076b, code lost:            if (r25 == null) goto L1044;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0ac8 A[ADDED_TO_REGION, LOOP:13: B:220:0x0ac8->B:223:0x0ad2, LOOP_START, PHI: r22
  0x0ac8: PHI (r22v12 int) = (r22v11 int), (r22v13 int) binds: [B:219:0x0ac6, B:223:0x0ad2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0ac1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0bb1  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m25636c(C4487f3 c4487f3, ym4 ym4Var, long j11, zzx zzxVar, boolean z11, boolean z12, y43 y43Var) {
        int i11;
        long j12;
        int i12;
        long j13;
        int i13;
        int i14;
        int m27782m;
        int i15;
        C4745m3 c4745m3;
        ArrayList arrayList;
        String str;
        C4487f3 c4487f32;
        C4487f3 m21870c;
        long[] jArr;
        long[] jArr2;
        C4525g4 c4525g4;
        int i16;
        y43 y43Var2;
        Pair m25641h;
        String str2;
        int i17;
        C4487f3 c4487f33;
        C4857p3 c4857p3;
        Pair pair;
        String str3;
        x02 x02Var;
        C4745m3 c4745m32;
        zzx zzxVar2;
        int i18;
        String str4;
        int i19;
        int i21;
        int i22;
        int i23;
        float f11;
        C4745m3 c4745m33;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        C4745m3 c4745m34;
        long j14;
        long j15;
        int i31;
        int i32;
        int i33;
        boolean z13;
        int i34;
        boolean z14;
        int i35;
        int i36;
        float f12;
        C4745m3 c4745m35;
        byte[] bArr;
        boolean z15;
        byte[] bArr2;
        String str5;
        byte[] bArr3;
        String str6;
        List list;
        String str7;
        String str8;
        int i37;
        int i38;
        c83 c83Var;
        long j16;
        long j17;
        C4525g4 c4525g42;
        ArrayList arrayList2;
        InterfaceC4708l3 c4820o3;
        C4524g3 c4524g3;
        boolean z16;
        int i39;
        int i41;
        int i42;
        int zza;
        int[] iArr;
        int i43;
        int i44;
        int i45;
        long j18;
        int i46;
        boolean z17;
        int i47;
        int i48;
        int i49;
        int i51;
        C4525g4 c4525g43;
        int i52;
        long[] jArr3;
        int[] iArr2;
        int i53;
        long j19;
        int[] iArr3;
        long[] jArr4;
        long[] jArr5;
        int[] iArr4;
        long j21;
        int i54;
        int i55;
        int i56;
        int i57;
        C4598i3 c4598i3;
        int i58;
        long[] jArr6;
        int i59;
        C4635j4 c4635j4;
        int[] iArr5;
        int[] iArr6;
        int i61;
        int i62;
        int i63;
        long[] jArr7;
        int i64;
        int i65;
        C4635j4 c4635j42;
        C4487f3 c4487f34 = c4487f3;
        zzx zzxVar3 = zzxVar;
        ArrayList arrayList3 = new ArrayList();
        int i66 = 0;
        while (i66 < c4487f34.f19945d.size()) {
            C4487f3 c4487f35 = (C4487f3) c4487f34.f19945d.get(i66);
            if (c4487f35.f21515a != 1953653099) {
                arrayList2 = arrayList3;
                i11 = i66;
            } else {
                C4524g3 m21871d = c4487f34.m21871d(1836476516);
                m21871d.getClass();
                C4487f3 m21870c2 = c4487f35.m21870c(1835297121);
                m21870c2.getClass();
                C4524g3 m21871d2 = m21870c2.m21871d(1751411826);
                m21871d2.getClass();
                int m25638e = m25638e(m25640g(m21871d2.f20375b));
                i11 = i66;
                if (m25638e == -1) {
                    y43Var2 = y43Var;
                    str = "AtomParsers";
                    c4487f32 = c4487f35;
                    arrayList = arrayList3;
                } else {
                    C4524g3 m21871d3 = c4487f35.m21871d(1953196132);
                    m21871d3.getClass();
                    x02 x02Var2 = m21871d3.f20375b;
                    x02Var2.m27775f(8);
                    int m22689a = AbstractC4561h3.m22689a(x02Var2.m27782m());
                    x02Var2.m27776g(m22689a == 0 ? 8 : 16);
                    int m27782m2 = x02Var2.m27782m();
                    x02Var2.m27776g(4);
                    int m27780k = x02Var2.m27780k();
                    int i67 = m22689a != 0 ? 8 : 4;
                    int i68 = 0;
                    while (true) {
                        if (i68 < i67) {
                            if (x02Var2.m27777h()[m27780k + i68] != -1) {
                                j12 = m22689a == 0 ? x02Var2.m27762A() : x02Var2.m27763B();
                            } else {
                                i68++;
                            }
                        } else {
                            x02Var2.m27776g(i67);
                            break;
                        }
                    }
                    j12 = -9223372036854775807L;
                    x02Var2.m27776g(16);
                    int m27782m3 = x02Var2.m27782m();
                    int m27782m4 = x02Var2.m27782m();
                    x02Var2.m27776g(4);
                    int m27782m5 = x02Var2.m27782m();
                    int m27782m6 = x02Var2.m27782m();
                    int i69 = 65536;
                    String str9 = "AtomParsers";
                    if (m27782m3 == 0) {
                        if (m27782m4 == 65536) {
                            if (m27782m5 != -65536) {
                                m27782m4 = 65536;
                            } else if (m27782m6 == 0) {
                                i12 = 90;
                                C4857p3 c4857p32 = new C4857p3(m27782m2, j12, i12);
                                if (j11 == -9223372036854775807L) {
                                    j17 = c4857p32.f26047b;
                                    j13 = j17;
                                } else {
                                    j13 = j11;
                                }
                                x02 x02Var3 = m21871d.f20375b;
                                x02Var3.m27775f(8);
                                x02Var3.m27776g(AbstractC4561h3.m22689a(x02Var3.m27782m()) == 0 ? 8 : 16);
                                long m27762A = x02Var3.m27762A();
                                long m22346g0 = j13 != -9223372036854775807L ? g92.m22346g0(j13, 1000000L, m27762A) : -9223372036854775807L;
                                C4487f3 m21870c3 = m21870c2.m21870c(1835626086);
                                m21870c3.getClass();
                                C4487f3 m21870c4 = m21870c3.m21870c(1937007212);
                                m21870c4.getClass();
                                C4524g3 m21871d4 = m21870c2.m21871d(1835296868);
                                m21871d4.getClass();
                                Pair m25642i = m25642i(m21871d4.f20375b);
                                C4524g3 m21871d5 = m21870c4.m21871d(1937011556);
                                m21871d5.getClass();
                                x02 x02Var4 = m21871d5.f20375b;
                                i13 = c4857p32.f26046a;
                                i14 = c4857p32.f26048c;
                                String str10 = (String) m25642i.second;
                                x02Var4.m27775f(12);
                                m27782m = x02Var4.m27782m();
                                C4745m3 c4745m36 = new C4745m3(m27782m);
                                i15 = 0;
                                while (i15 < m27782m) {
                                    ArrayList arrayList4 = arrayList3;
                                    int m27780k2 = x02Var4.m27780k();
                                    int m27782m7 = x02Var4.m27782m();
                                    nm4.m24964b(m27782m7 > 0, "childAtomSize must be positive");
                                    int m27782m8 = x02Var4.m27782m();
                                    int i71 = m27782m;
                                    if (m27782m8 == 1635148593 || m27782m8 == 1635148595 || m27782m8 == 1701733238 || m27782m8 == 1831958048 || m27782m8 == 1836070006 || m27782m8 == 1752589105 || m27782m8 == 1751479857 || m27782m8 == 1932670515 || m27782m8 == 1211250227 || m27782m8 == 1987063864 || m27782m8 == 1987063865 || m27782m8 == 1635135537 || m27782m8 == 1685479798 || m27782m8 == 1685479729 || m27782m8 == 1685481573 || m27782m8 == 1685481521) {
                                        C4745m3 c4745m37 = c4745m36;
                                        str2 = str10;
                                        int i72 = i14;
                                        int i73 = i13;
                                        i17 = m25638e;
                                        c4487f33 = c4487f35;
                                        c4857p3 = c4857p32;
                                        pair = m25642i;
                                        str3 = str9;
                                        x02Var = x02Var4;
                                        x02Var.m27775f(m27780k2 + 16);
                                        x02Var.m27776g(16);
                                        int m27792w = x02Var.m27792w();
                                        int m27792w2 = x02Var.m27792w();
                                        x02Var.m27776g(50);
                                        int m27780k3 = x02Var.m27780k();
                                        if (m27782m8 == 1701733238) {
                                            Pair m25643j = m25643j(x02Var, m27780k2, m27782m7);
                                            if (m25643j != null) {
                                                int intValue = ((Integer) m25643j.first).intValue();
                                                if (zzxVar3 == null) {
                                                    c4745m32 = c4745m37;
                                                    zzxVar2 = null;
                                                } else {
                                                    zzxVar2 = zzxVar3.m28836b(((C4562h4) m25643j.second).f21528b);
                                                    c4745m32 = c4745m37;
                                                }
                                                c4745m32.f24353a[i15] = (C4562h4) m25643j.second;
                                                m27782m8 = intValue;
                                            } else {
                                                c4745m32 = c4745m37;
                                                zzxVar2 = zzxVar3;
                                                m27782m8 = 1701733238;
                                            }
                                            x02Var.m27775f(m27780k3);
                                        } else {
                                            c4745m32 = c4745m37;
                                            zzxVar2 = zzxVar3;
                                        }
                                        if (m27782m8 == 1831958048) {
                                            int i74 = m27782m8;
                                            str4 = "video/mpeg";
                                            i18 = i74;
                                        } else {
                                            i18 = 1211250227;
                                            if (m27782m8 == 1211250227) {
                                                str4 = "video/3gpp";
                                            } else {
                                                i18 = m27782m8;
                                                str4 = null;
                                            }
                                        }
                                        i19 = i15;
                                        int i75 = m27780k3;
                                        zzx zzxVar4 = zzxVar2;
                                        String str11 = null;
                                        float f13 = 1.0f;
                                        int i76 = -1;
                                        byte[] bArr4 = null;
                                        int i77 = -1;
                                        int i78 = -1;
                                        int i79 = -1;
                                        ByteBuffer byteBuffer = null;
                                        C4634j3 c4634j3 = null;
                                        List list2 = null;
                                        String str12 = str4;
                                        boolean z18 = false;
                                        while (true) {
                                            if (i75 - m27780k2 >= m27782m7) {
                                                i21 = m27782m7;
                                                i22 = m27792w;
                                                i23 = m27792w2;
                                                f11 = f13;
                                                c4745m33 = c4745m32;
                                                i24 = i76;
                                                break;
                                            }
                                            x02Var.m27775f(i75);
                                            int m27780k4 = x02Var.m27780k();
                                            int m27782m9 = x02Var.m27782m();
                                            if (m27782m9 == 0) {
                                                i24 = i76;
                                                if (x02Var.m27780k() - m27780k2 == m27782m7) {
                                                    i21 = m27782m7;
                                                    i22 = m27792w;
                                                    i23 = m27792w2;
                                                    f11 = f13;
                                                    c4745m33 = c4745m32;
                                                    break;
                                                }
                                                i31 = 0;
                                            } else {
                                                i24 = i76;
                                                i31 = m27782m9;
                                            }
                                            if (i31 > 0) {
                                                i32 = m27782m7;
                                                i33 = m27780k2;
                                                z13 = true;
                                            } else {
                                                i32 = m27782m7;
                                                i33 = m27780k2;
                                                z13 = false;
                                            }
                                            nm4.m24964b(z13, "childAtomSize must be positive");
                                            int m27782m10 = x02Var.m27782m();
                                            if (m27782m10 == 1635148611) {
                                                nm4.m24964b(str12 == null, null);
                                                x02Var.m27775f(m27780k4 + 8);
                                                nl4 m24946a = nl4.m24946a(x02Var);
                                                list = m24946a.f25239a;
                                                c4745m32.f24355c = m24946a.f25240b;
                                                if (!z18) {
                                                    f13 = m24946a.f25243e;
                                                }
                                                str7 = m24946a.f25244f;
                                                str12 = "video/avc";
                                            } else if (m27782m10 == 1752589123) {
                                                nm4.m24964b(str12 == null, null);
                                                x02Var.m27775f(m27780k4 + 8);
                                                zm4 m28552a = zm4.m28552a(x02Var);
                                                list = m28552a.f31591a;
                                                c4745m32.f24355c = m28552a.f31592b;
                                                if (!z18) {
                                                    f13 = m28552a.f31593c;
                                                }
                                                str7 = m28552a.f31594d;
                                                str12 = "video/hevc";
                                            } else {
                                                if (m27782m10 == 1685480259 || m27782m10 == 1685485123) {
                                                    i34 = i18;
                                                    z14 = z18;
                                                    i35 = m27792w;
                                                    i36 = m27792w2;
                                                    f12 = f13;
                                                    c4745m35 = c4745m32;
                                                    bArr = bArr4;
                                                    fm4 m22085a = fm4.m22085a(x02Var);
                                                    if (m22085a != null) {
                                                        str11 = m22085a.f20194a;
                                                        str12 = "video/dolby-vision";
                                                    }
                                                } else {
                                                    if (m27782m10 == 1987076931) {
                                                        nm4.m24964b(str12 == null, null);
                                                        str6 = i18 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                    } else if (m27782m10 == 1635135811) {
                                                        nm4.m24964b(str12 == null, null);
                                                        str6 = "video/av01";
                                                    } else if (m27782m10 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = m25645l();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(x02Var.m27768G());
                                                        byteBuffer2.putShort(x02Var.m27768G());
                                                        byteBuffer = byteBuffer2;
                                                        i34 = i18;
                                                        i35 = m27792w;
                                                        i36 = m27792w2;
                                                        c4745m35 = c4745m32;
                                                        i75 += i31;
                                                        m27782m7 = i32;
                                                        i76 = i24;
                                                        m27780k2 = i33;
                                                        i18 = i34;
                                                        c4745m32 = c4745m35;
                                                        m27792w2 = i36;
                                                        m27792w = i35;
                                                    } else {
                                                        if (m27782m10 == 1835295606) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = m25645l();
                                                            }
                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                            short m27768G = x02Var.m27768G();
                                                            short m27768G2 = x02Var.m27768G();
                                                            i34 = i18;
                                                            short m27768G3 = x02Var.m27768G();
                                                            z14 = z18;
                                                            short m27768G4 = x02Var.m27768G();
                                                            c4745m35 = c4745m32;
                                                            short m27768G5 = x02Var.m27768G();
                                                            bArr = bArr4;
                                                            short m27768G6 = x02Var.m27768G();
                                                            f12 = f13;
                                                            short m27768G7 = x02Var.m27768G();
                                                            i36 = m27792w2;
                                                            short m27768G8 = x02Var.m27768G();
                                                            long m27762A2 = x02Var.m27762A();
                                                            long m27762A3 = x02Var.m27762A();
                                                            i35 = m27792w;
                                                            byteBuffer3.position(1);
                                                            byteBuffer3.putShort(m27768G5);
                                                            byteBuffer3.putShort(m27768G6);
                                                            byteBuffer3.putShort(m27768G);
                                                            byteBuffer3.putShort(m27768G2);
                                                            byteBuffer3.putShort(m27768G3);
                                                            byteBuffer3.putShort(m27768G4);
                                                            byteBuffer3.putShort(m27768G7);
                                                            byteBuffer3.putShort(m27768G8);
                                                            byteBuffer3.putShort((short) (m27762A2 / 10000));
                                                            byteBuffer3.putShort((short) (m27762A3 / 10000));
                                                            byteBuffer = byteBuffer3;
                                                        } else {
                                                            i34 = i18;
                                                            z14 = z18;
                                                            i35 = m27792w;
                                                            i36 = m27792w2;
                                                            f12 = f13;
                                                            c4745m35 = c4745m32;
                                                            bArr = bArr4;
                                                            if (m27782m10 == 1681012275) {
                                                                nm4.m24964b(str12 == null, null);
                                                                str12 = "video/3gpp";
                                                            } else if (m27782m10 == 1702061171) {
                                                                nm4.m24964b(str12 == null, null);
                                                                C4634j3 m25644k = m25644k(x02Var, m27780k4);
                                                                str5 = m25644k.f22604a;
                                                                bArr3 = m25644k.f22605b;
                                                                c4634j3 = m25644k;
                                                                str12 = str5;
                                                                list2 = bArr3 != null ? c83.m20833x(bArr3) : list2;
                                                            } else if (m27782m10 == 1885434736) {
                                                                x02Var.m27775f(m27780k4 + 8);
                                                                f13 = x02Var.m27791v() / x02Var.m27791v();
                                                                bArr4 = bArr;
                                                                z18 = true;
                                                                i75 += i31;
                                                                m27782m7 = i32;
                                                                i76 = i24;
                                                                m27780k2 = i33;
                                                                i18 = i34;
                                                                c4745m32 = c4745m35;
                                                                m27792w2 = i36;
                                                                m27792w = i35;
                                                            } else if (m27782m10 == 1937126244) {
                                                                int i81 = m27780k4 + 8;
                                                                while (true) {
                                                                    if (i81 - m27780k4 >= i31) {
                                                                        bArr2 = null;
                                                                        break;
                                                                    }
                                                                    x02Var.m27775f(i81);
                                                                    int m27782m11 = x02Var.m27782m();
                                                                    if (x02Var.m27782m() == 1886547818) {
                                                                        bArr2 = Arrays.copyOfRange(x02Var.m27777h(), i81, m27782m11 + i81);
                                                                        break;
                                                                    }
                                                                    i81 += m27782m11;
                                                                }
                                                                bArr4 = bArr2;
                                                                z18 = z14;
                                                                f13 = f12;
                                                                i75 += i31;
                                                                m27782m7 = i32;
                                                                i76 = i24;
                                                                m27780k2 = i33;
                                                                i18 = i34;
                                                                c4745m32 = c4745m35;
                                                                m27792w2 = i36;
                                                                m27792w = i35;
                                                            } else if (m27782m10 == 1936995172) {
                                                                int m27788s = x02Var.m27788s();
                                                                int i82 = 3;
                                                                x02Var.m27776g(3);
                                                                if (m27788s == 0) {
                                                                    int m27788s2 = x02Var.m27788s();
                                                                    if (m27788s2 == 0) {
                                                                        i82 = 0;
                                                                    } else if (m27788s2 == 1) {
                                                                        i82 = 1;
                                                                    } else if (m27788s2 == 2) {
                                                                        i82 = 2;
                                                                    }
                                                                    i24 = i82;
                                                                }
                                                                i82 = i24;
                                                                i24 = i82;
                                                            } else if (m27782m10 == 1668246642) {
                                                                int m27782m12 = x02Var.m27782m();
                                                                if (m27782m12 != 1852009592 && m27782m12 != 1852009571) {
                                                                    lr1.m24356e(str3, "Unsupported color type: ".concat(AbstractC4561h3.m22690b(m27782m12)));
                                                                } else {
                                                                    int m27792w3 = x02Var.m27792w();
                                                                    int m27792w4 = x02Var.m27792w();
                                                                    x02Var.m27776g(2);
                                                                    if (i31 == 19) {
                                                                        z15 = (x02Var.m27788s() & 128) != 0;
                                                                        i31 = 19;
                                                                    } else {
                                                                        z15 = false;
                                                                    }
                                                                    int m26272a = sc4.m26272a(m27792w3);
                                                                    int i83 = true != z15 ? 2 : 1;
                                                                    i79 = m26272a;
                                                                    i77 = sc4.m26273b(m27792w4);
                                                                    i78 = i83;
                                                                }
                                                            }
                                                        }
                                                        z18 = z14;
                                                        bArr4 = bArr;
                                                        f13 = f12;
                                                        i75 += i31;
                                                        m27782m7 = i32;
                                                        i76 = i24;
                                                        m27780k2 = i33;
                                                        i18 = i34;
                                                        c4745m32 = c4745m35;
                                                        m27792w2 = i36;
                                                        m27792w = i35;
                                                    }
                                                    str12 = str6;
                                                    i34 = i18;
                                                    i35 = m27792w;
                                                    i36 = m27792w2;
                                                    c4745m35 = c4745m32;
                                                    i75 += i31;
                                                    m27782m7 = i32;
                                                    i76 = i24;
                                                    m27780k2 = i33;
                                                    i18 = i34;
                                                    c4745m32 = c4745m35;
                                                    m27792w2 = i36;
                                                    m27792w = i35;
                                                }
                                                z18 = z14;
                                                bArr4 = bArr;
                                                f13 = f12;
                                                i75 += i31;
                                                m27782m7 = i32;
                                                i76 = i24;
                                                m27780k2 = i33;
                                                i18 = i34;
                                                c4745m32 = c4745m35;
                                                m27792w2 = i36;
                                                m27792w = i35;
                                            }
                                            list2 = list;
                                            i34 = i18;
                                            i35 = m27792w;
                                            i36 = m27792w2;
                                            c4745m35 = c4745m32;
                                            str11 = str7;
                                            i75 += i31;
                                            m27782m7 = i32;
                                            i76 = i24;
                                            m27780k2 = i33;
                                            i18 = i34;
                                            c4745m32 = c4745m35;
                                            m27792w2 = i36;
                                            m27792w = i35;
                                        }
                                        byte[] bArr5 = bArr4;
                                        i25 = m27780k2;
                                        if (str12 == null) {
                                            i27 = i72;
                                            i26 = i73;
                                            c4745m34 = c4745m33;
                                        } else {
                                            C5004t1 c5004t1 = new C5004t1();
                                            i26 = i73;
                                            c5004t1.m26509g(i26);
                                            c5004t1.m26523s(str12);
                                            c5004t1.m26508f0(str11);
                                            c5004t1.m26528x(i22);
                                            c5004t1.m26507f(i23);
                                            c5004t1.m26520p(f11);
                                            i27 = i72;
                                            c5004t1.m26522r(i27);
                                            c5004t1.m26521q(bArr5);
                                            c5004t1.m26526v(i24);
                                            c5004t1.m26513i(list2);
                                            c5004t1.m26500b(zzxVar4);
                                            int i84 = i79;
                                            if (i84 == -1) {
                                                i29 = i78;
                                                i28 = i77;
                                                if (i29 == -1) {
                                                    if (i28 == -1) {
                                                    }
                                                }
                                            } else {
                                                i28 = i77;
                                                i29 = i78;
                                            }
                                            c5004t1.m26510g0(new sc4(i84, i29, i28, byteBuffer != null ? byteBuffer.array() : null));
                                            if (c4634j3 != null) {
                                                j14 = c4634j3.f22606c;
                                                c5004t1.m26504d0(ha3.m22774c(j14));
                                                j15 = c4634j3.f22607d;
                                                c5004t1.m26519o(ha3.m22774c(j15));
                                            }
                                            c4745m34 = c4745m33;
                                            c4745m34.f24354b = c5004t1.m26529y();
                                        }
                                    } else if (m27782m8 == 1836069985 || m27782m8 == 1701733217 || m27782m8 == 1633889587 || m27782m8 == 1700998451 || m27782m8 == 1633889588 || m27782m8 == 1835823201 || m27782m8 == 1685353315 || m27782m8 == 1685353317 || m27782m8 == 1685353320 || m27782m8 == 1685353324 || m27782m8 == 1685353336 || m27782m8 == 1935764850 || m27782m8 == 1935767394 || m27782m8 == 1819304813 || m27782m8 == 1936684916 || m27782m8 == 1953984371 || m27782m8 == 778924082 || m27782m8 == 778924083 || m27782m8 == 1835557169 || m27782m8 == 1835560241 || m27782m8 == 1634492771 || m27782m8 == 1634492791 || m27782m8 == 1970037111 || m27782m8 == 1332770163 || m27782m8 == 1716281667) {
                                        int i85 = i14;
                                        int i86 = m25638e;
                                        C4745m3 c4745m38 = c4745m36;
                                        str2 = str10;
                                        c4857p3 = c4857p32;
                                        pair = m25642i;
                                        str3 = str9;
                                        i17 = i86;
                                        x02Var = x02Var4;
                                        c4487f33 = c4487f35;
                                        m25646m(x02Var4, m27782m8, m27780k2, m27782m7, i13, str2, z12, zzxVar, c4745m38, i15);
                                        i21 = m27782m7;
                                        i25 = m27780k2;
                                        c4745m34 = c4745m38;
                                        i27 = i85;
                                        i26 = i13;
                                        i19 = i15;
                                    } else {
                                        if (m27782m8 == 1414810956 || m27782m8 == 1954034535 || m27782m8 == 2004251764 || m27782m8 == 1937010800 || m27782m8 == 1664495672) {
                                            x02Var4.m27775f(m27780k2 + 16);
                                            if (m27782m8 == 1414810956) {
                                                str8 = "application/ttml+xml";
                                            } else {
                                                if (m27782m8 == 1954034535) {
                                                    int i87 = m27782m7 - 16;
                                                    byte[] bArr6 = new byte[i87];
                                                    x02Var4.m27771b(bArr6, 0, i87);
                                                    i37 = i14;
                                                    i38 = m25638e;
                                                    j16 = Long.MAX_VALUE;
                                                    c83Var = c83.m20833x(bArr6);
                                                    str8 = "application/x-quicktime-tx3g";
                                                } else if (m27782m8 == 2004251764) {
                                                    str8 = "application/x-mp4-vtt";
                                                } else if (m27782m8 == 1937010800) {
                                                    str8 = "application/ttml+xml";
                                                    i37 = i14;
                                                    i38 = m25638e;
                                                    c83Var = null;
                                                    j16 = 0;
                                                } else {
                                                    c4745m36.f24356d = 1;
                                                    str8 = "application/x-mp4-cea-608";
                                                }
                                                C5004t1 c5004t12 = new C5004t1();
                                                c5004t12.m26509g(i13);
                                                c5004t12.m26523s(str8);
                                                c5004t12.m26515k(str10);
                                                c5004t12.m26527w(j16);
                                                c5004t12.m26513i(c83Var);
                                                c4745m36.f24354b = c5004t12.m26529y();
                                                i19 = i15;
                                                i21 = m27782m7;
                                                c4745m34 = c4745m36;
                                                str2 = str10;
                                                i26 = i13;
                                                c4487f33 = c4487f35;
                                                i25 = m27780k2;
                                                c4857p3 = c4857p32;
                                                pair = m25642i;
                                                i17 = i38;
                                                str3 = str9;
                                                i27 = i37;
                                            }
                                            i37 = i14;
                                            i38 = m25638e;
                                            j16 = Long.MAX_VALUE;
                                            c83Var = null;
                                            C5004t1 c5004t122 = new C5004t1();
                                            c5004t122.m26509g(i13);
                                            c5004t122.m26523s(str8);
                                            c5004t122.m26515k(str10);
                                            c5004t122.m26527w(j16);
                                            c5004t122.m26513i(c83Var);
                                            c4745m36.f24354b = c5004t122.m26529y();
                                            i19 = i15;
                                            i21 = m27782m7;
                                            c4745m34 = c4745m36;
                                            str2 = str10;
                                            i26 = i13;
                                            c4487f33 = c4487f35;
                                            i25 = m27780k2;
                                            c4857p3 = c4857p32;
                                            pair = m25642i;
                                            i17 = i38;
                                            str3 = str9;
                                            i27 = i37;
                                        } else {
                                            if (m27782m8 == 1835365492) {
                                                m25647n(x02Var4, 1835365492, m27780k2, i13, c4745m36);
                                            } else if (m27782m8 == 1667329389) {
                                                C5004t1 c5004t13 = new C5004t1();
                                                c5004t13.m26509g(i13);
                                                c5004t13.m26523s("application/x-camera-motion");
                                                c4745m36.f24354b = c5004t13.m26529y();
                                            }
                                            i19 = i15;
                                            i21 = m27782m7;
                                            c4745m34 = c4745m36;
                                            str2 = str10;
                                            i27 = i14;
                                            i26 = i13;
                                            i17 = m25638e;
                                            c4487f33 = c4487f35;
                                            i25 = m27780k2;
                                            c4857p3 = c4857p32;
                                            pair = m25642i;
                                            str3 = str9;
                                        }
                                        x02Var = x02Var4;
                                    }
                                    x02Var.m27775f(i25 + i21);
                                    i15 = i19 + 1;
                                    zzxVar3 = zzxVar;
                                    i13 = i26;
                                    i14 = i27;
                                    c4745m36 = c4745m34;
                                    x02Var4 = x02Var;
                                    str9 = str3;
                                    str10 = str2;
                                    m25638e = i17;
                                    m25642i = pair;
                                    c4857p32 = c4857p3;
                                    m27782m = i71;
                                    arrayList3 = arrayList4;
                                    c4487f35 = c4487f33;
                                }
                                c4745m3 = c4745m36;
                                int i88 = m25638e;
                                arrayList = arrayList3;
                                C4857p3 c4857p33 = c4857p32;
                                Pair pair2 = m25642i;
                                str = str9;
                                c4487f32 = c4487f35;
                                m21870c = c4487f32.m21870c(1701082227);
                                if (m21870c != null || (m25641h = m25641h(m21870c)) == null) {
                                    jArr = null;
                                    jArr2 = null;
                                } else {
                                    jArr = (long[]) m25641h.first;
                                    jArr2 = (long[]) m25641h.second;
                                }
                                if (c4745m3.f24354b == null) {
                                    y43Var2 = y43Var;
                                } else {
                                    i16 = c4857p33.f26046a;
                                    c4525g4 = new C4525g4(i16, i88, ((Long) pair2.first).longValue(), m27762A, m22346g0, c4745m3.f24354b, c4745m3.f24356d, c4745m3.f24353a, c4745m3.f24355c, jArr, jArr2);
                                    y43Var2 = y43Var;
                                    c4525g42 = (C4525g4) y43Var2.apply(c4525g4);
                                    if (c4525g42 == null) {
                                        C4487f3 m21870c5 = c4487f32.m21870c(1835297121);
                                        m21870c5.getClass();
                                        C4487f3 m21870c6 = m21870c5.m21870c(1835626086);
                                        m21870c6.getClass();
                                        C4487f3 m21870c7 = m21870c6.m21870c(1937007212);
                                        m21870c7.getClass();
                                        C4524g3 m21871d6 = m21870c7.m21871d(1937011578);
                                        if (m21871d6 != null) {
                                            c4820o3 = new C4783n3(m21871d6, c4525g42.f20392f);
                                        } else {
                                            C4524g3 m21871d7 = m21870c7.m21871d(1937013298);
                                            if (m21871d7 != null) {
                                                c4820o3 = new C4820o3(m21871d7);
                                            } else {
                                                throw zzbu.m28711a("Track has no sample table size information", null);
                                            }
                                        }
                                        int zzb = c4820o3.zzb();
                                        if (zzb == 0) {
                                            c4635j4 = new C4635j4(c4525g42, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                        } else {
                                            C4524g3 m21871d8 = m21870c7.m21871d(1937007471);
                                            if (m21871d8 == null) {
                                                C4524g3 m21871d9 = m21870c7.m21871d(1668232756);
                                                m21871d9.getClass();
                                                c4524g3 = m21871d9;
                                                z16 = true;
                                            } else {
                                                c4524g3 = m21871d8;
                                                z16 = false;
                                            }
                                            x02 x02Var5 = c4524g3.f20375b;
                                            C4524g3 m21871d10 = m21870c7.m21871d(1937011555);
                                            m21871d10.getClass();
                                            x02 x02Var6 = m21871d10.f20375b;
                                            C4524g3 m21871d11 = m21870c7.m21871d(1937011827);
                                            m21871d11.getClass();
                                            x02 x02Var7 = m21871d11.f20375b;
                                            C4524g3 m21871d12 = m21870c7.m21871d(1937011571);
                                            x02 x02Var8 = m21871d12 != null ? m21871d12.f20375b : null;
                                            C4524g3 m21871d13 = m21870c7.m21871d(1668576371);
                                            x02 x02Var9 = m21871d13 != null ? m21871d13.f20375b : null;
                                            C4598i3 c4598i32 = new C4598i3(x02Var6, x02Var5, z16);
                                            x02Var7.m27775f(12);
                                            int m27791v = x02Var7.m27791v() - 1;
                                            int m27791v2 = x02Var7.m27791v();
                                            int m27791v3 = x02Var7.m27791v();
                                            if (x02Var9 != null) {
                                                x02Var9.m27775f(12);
                                                i39 = x02Var9.m27791v();
                                            } else {
                                                i39 = 0;
                                            }
                                            if (x02Var8 != null) {
                                                x02Var8.m27775f(12);
                                                i41 = x02Var8.m27791v();
                                                if (i41 > 0) {
                                                    i42 = x02Var8.m27791v() - 1;
                                                    zza = c4820o3.zza();
                                                    String str13 = c4525g42.f20392f.f23099l;
                                                    if (zza != -1 && (("audio/raw".equals(str13) || "audio/g711-mlaw".equals(str13) || "audio/g711-alaw".equals(str13)) && m27791v == 0)) {
                                                        if (i39 == 0 || i41 != 0) {
                                                            m27791v = 0;
                                                        } else {
                                                            int i89 = c4598i32.f22024a;
                                                            long[] jArr8 = new long[i89];
                                                            int[] iArr7 = new int[i89];
                                                            while (c4598i32.m23118a()) {
                                                                int i91 = c4598i32.f22025b;
                                                                jArr8[i91] = c4598i32.f22027d;
                                                                iArr7[i91] = c4598i32.f22026c;
                                                            }
                                                            long j22 = m27791v3;
                                                            int i92 = 8192 / zza;
                                                            int i93 = 0;
                                                            for (int i94 = 0; i94 < i89; i94++) {
                                                                i93 += g92.m22321O(iArr7[i94], i92);
                                                            }
                                                            long[] jArr9 = new long[i93];
                                                            iArr4 = new int[i93];
                                                            long[] jArr10 = new long[i93];
                                                            int[] iArr8 = new int[i93];
                                                            int i95 = 0;
                                                            int i96 = 0;
                                                            int i97 = 0;
                                                            int i98 = 0;
                                                            while (i95 < i89) {
                                                                int i99 = iArr7[i95];
                                                                long j23 = jArr8[i95];
                                                                int i100 = i89;
                                                                int i101 = i99;
                                                                while (i101 > 0) {
                                                                    int min = Math.min(i92, i101);
                                                                    jArr9[i98] = j23;
                                                                    long[] jArr11 = jArr8;
                                                                    int i102 = zza * min;
                                                                    iArr4[i98] = i102;
                                                                    i97 = Math.max(i97, i102);
                                                                    jArr10[i98] = i96 * j22;
                                                                    iArr8[i98] = 1;
                                                                    j23 += iArr4[i98];
                                                                    i96 += min;
                                                                    i101 -= min;
                                                                    i98++;
                                                                    iArr7 = iArr7;
                                                                    jArr8 = jArr11;
                                                                    zza = zza;
                                                                }
                                                                i95++;
                                                                i89 = i100;
                                                                jArr8 = jArr8;
                                                            }
                                                            long j24 = j22 * i96;
                                                            c4525g43 = c4525g42;
                                                            j19 = j24;
                                                            jArr4 = jArr10;
                                                            i44 = i97;
                                                            iArr3 = iArr8;
                                                            jArr5 = jArr9;
                                                            long m22346g02 = g92.m22346g0(j19, 1000000L, c4525g43.f20389c);
                                                            jArr6 = c4525g43.f20394h;
                                                            if (jArr6 == null) {
                                                                g92.m22360r(jArr4, 1000000L, c4525g43.f20389c);
                                                                c4635j4 = new C4635j4(c4525g43, jArr5, iArr4, i44, jArr4, iArr3, m22346g02);
                                                            } else {
                                                                if (jArr6.length == 1 && c4525g43.f20388b == 1 && jArr4.length >= 2) {
                                                                    long[] jArr12 = c4525g43.f20395i;
                                                                    jArr12.getClass();
                                                                    long j25 = jArr12[0];
                                                                    long m22346g03 = j25 + g92.m22346g0(jArr6[0], c4525g43.f20389c, c4525g43.f20390d);
                                                                    if (m25648o(jArr4, j19, j25, m22346g03)) {
                                                                        long m22346g04 = g92.m22346g0(j25 - jArr4[0], c4525g43.f20392f.f23113z, c4525g43.f20389c);
                                                                        long m22346g05 = g92.m22346g0(j19 - m22346g03, c4525g43.f20392f.f23113z, c4525g43.f20389c);
                                                                        if (m22346g04 == 0) {
                                                                            if (m22346g05 != 0) {
                                                                                m22346g04 = 0;
                                                                            }
                                                                        }
                                                                        if (m22346g04 <= 2147483647L && m22346g05 <= 2147483647L) {
                                                                            ym4Var.f31039a = (int) m22346g04;
                                                                            ym4Var.f31040b = (int) m22346g05;
                                                                            g92.m22360r(jArr4, 1000000L, c4525g43.f20389c);
                                                                            c4635j42 = new C4635j4(c4525g43, jArr5, iArr4, i44, jArr4, iArr3, g92.m22346g0(c4525g43.f20394h[0], 1000000L, c4525g43.f20390d));
                                                                            c4635j4 = c4635j42;
                                                                        }
                                                                    }
                                                                }
                                                                long[] jArr13 = c4525g43.f20394h;
                                                                int length = jArr13.length;
                                                                if (length == 1) {
                                                                    if (jArr13[0] == 0) {
                                                                        long[] jArr14 = c4525g43.f20395i;
                                                                        jArr14.getClass();
                                                                        long j26 = jArr14[0];
                                                                        for (int i103 = 0; i103 < jArr4.length; i103++) {
                                                                            jArr4[i103] = g92.m22346g0(jArr4[i103] - j26, 1000000L, c4525g43.f20389c);
                                                                        }
                                                                        c4635j42 = new C4635j4(c4525g43, jArr5, iArr4, i44, jArr4, iArr3, g92.m22346g0(j19 - j26, 1000000L, c4525g43.f20389c));
                                                                        c4635j4 = c4635j42;
                                                                    } else {
                                                                        length = 1;
                                                                    }
                                                                }
                                                                boolean z19 = c4525g43.f20388b == 1;
                                                                int[] iArr9 = new int[length];
                                                                int[] iArr10 = new int[length];
                                                                long[] jArr15 = c4525g43.f20395i;
                                                                jArr15.getClass();
                                                                int i104 = 0;
                                                                int i105 = 0;
                                                                int i106 = 0;
                                                                boolean z21 = false;
                                                                while (true) {
                                                                    long[] jArr16 = c4525g43.f20394h;
                                                                    i59 = i44;
                                                                    if (i106 >= jArr16.length) {
                                                                        break;
                                                                    }
                                                                    int[] iArr11 = iArr4;
                                                                    long j27 = jArr15[i106];
                                                                    if (j27 != -1) {
                                                                        i63 = zzb;
                                                                        boolean z22 = z21;
                                                                        jArr7 = jArr5;
                                                                        long m22346g06 = g92.m22346g0(jArr16[i106], c4525g43.f20389c, c4525g43.f20390d);
                                                                        int i107 = 1;
                                                                        iArr9[i106] = g92.m22320N(jArr4, j27, true, true);
                                                                        iArr10[i106] = g92.m22318L(jArr4, j27 + m22346g06, z19, false);
                                                                        while (true) {
                                                                            i64 = iArr9[i106];
                                                                            i65 = iArr10[i106];
                                                                            if (i64 >= i65 || (iArr3[i64] & i107) != 0) {
                                                                                break;
                                                                            }
                                                                            iArr9[i106] = i64 + 1;
                                                                            i107 = 1;
                                                                        }
                                                                        i104 += i65 - i64;
                                                                        z21 = z22 | (i105 != i64);
                                                                        i105 = i65;
                                                                    } else {
                                                                        i63 = zzb;
                                                                        jArr7 = jArr5;
                                                                    }
                                                                    i106++;
                                                                    i44 = i59;
                                                                    iArr4 = iArr11;
                                                                    zzb = i63;
                                                                    jArr5 = jArr7;
                                                                }
                                                                long[] jArr17 = jArr5;
                                                                int[] iArr12 = iArr4;
                                                                boolean z23 = z21 | (i104 != zzb);
                                                                long[] jArr18 = z23 ? new long[i104] : jArr17;
                                                                int[] iArr13 = z23 ? new int[i104] : iArr12;
                                                                int i108 = true == z23 ? 0 : i59;
                                                                int[] iArr14 = z23 ? new int[i104] : iArr3;
                                                                long[] jArr19 = new long[i104];
                                                                int i109 = i108;
                                                                int i110 = 0;
                                                                int i111 = 0;
                                                                long j28 = 0;
                                                                while (i111 < c4525g43.f20394h.length) {
                                                                    long j29 = c4525g43.f20395i[i111];
                                                                    int i112 = iArr9[i111];
                                                                    int i113 = iArr10[i111];
                                                                    if (z23) {
                                                                        int i114 = i113 - i112;
                                                                        iArr5 = iArr9;
                                                                        System.arraycopy(jArr17, i112, jArr18, i110, i114);
                                                                        iArr6 = iArr12;
                                                                        System.arraycopy(iArr6, i112, iArr13, i110, i114);
                                                                        System.arraycopy(iArr3, i112, iArr14, i110, i114);
                                                                    } else {
                                                                        iArr5 = iArr9;
                                                                        iArr6 = iArr12;
                                                                    }
                                                                    while (i112 < i113) {
                                                                        long[] jArr20 = jArr18;
                                                                        int i115 = i113;
                                                                        long[] jArr21 = jArr4;
                                                                        int[] iArr15 = iArr14;
                                                                        int i116 = i109;
                                                                        jArr19[i110] = g92.m22346g0(j28, 1000000L, c4525g43.f20390d) + g92.m22346g0(Math.max(0L, jArr4[i112] - j29), 1000000L, c4525g43.f20389c);
                                                                        if (z23) {
                                                                            i61 = i116;
                                                                            if (iArr13[i110] > i61) {
                                                                                i62 = iArr6[i112];
                                                                                i110++;
                                                                                i112++;
                                                                                i109 = i62;
                                                                                jArr18 = jArr20;
                                                                                jArr4 = jArr21;
                                                                                i113 = i115;
                                                                                iArr14 = iArr15;
                                                                            }
                                                                        } else {
                                                                            i61 = i116;
                                                                        }
                                                                        i62 = i61;
                                                                        i110++;
                                                                        i112++;
                                                                        i109 = i62;
                                                                        jArr18 = jArr20;
                                                                        jArr4 = jArr21;
                                                                        i113 = i115;
                                                                        iArr14 = iArr15;
                                                                    }
                                                                    j28 += c4525g43.f20394h[i111];
                                                                    i111++;
                                                                    i109 = i109;
                                                                    jArr18 = jArr18;
                                                                    jArr4 = jArr4;
                                                                    iArr14 = iArr14;
                                                                    iArr12 = iArr6;
                                                                    iArr9 = iArr5;
                                                                }
                                                                c4635j4 = new C4635j4(c4525g43, jArr18, iArr13, i109, jArr19, iArr14, g92.m22346g0(j28, 1000000L, c4525g43.f20390d));
                                                            }
                                                        }
                                                    }
                                                    long[] jArr22 = new long[zzb];
                                                    iArr = new int[zzb];
                                                    long[] jArr23 = new long[zzb];
                                                    i43 = i41;
                                                    int[] iArr16 = new int[zzb];
                                                    int i117 = m27791v3;
                                                    int i118 = i39;
                                                    int i119 = m27791v2;
                                                    i44 = 0;
                                                    int i120 = 0;
                                                    i45 = 0;
                                                    int i121 = 0;
                                                    j18 = 0;
                                                    long j31 = 0;
                                                    int i122 = m27791v;
                                                    i46 = 0;
                                                    while (true) {
                                                        if (i46 < zzb) {
                                                            break;
                                                        }
                                                        j21 = j18;
                                                        boolean z24 = true;
                                                        while (true) {
                                                            if (i45 != 0) {
                                                                i54 = zzb;
                                                                i55 = i120;
                                                                i56 = i42;
                                                                i57 = i45;
                                                                break;
                                                            }
                                                            z24 = c4598i32.m23118a();
                                                            if (!z24) {
                                                                i54 = zzb;
                                                                i55 = i120;
                                                                i56 = i42;
                                                                i57 = 0;
                                                                break;
                                                            }
                                                            int i123 = i120;
                                                            long j32 = c4598i32.f22027d;
                                                            i45 = c4598i32.f22026c;
                                                            j21 = j32;
                                                            i120 = i123;
                                                            i42 = i42;
                                                            zzb = zzb;
                                                        }
                                                        if (!z24) {
                                                            lr1.m24356e(str, "Unexpected end of chunk data");
                                                            jArr22 = Arrays.copyOf(jArr22, i46);
                                                            iArr = Arrays.copyOf(iArr, i46);
                                                            jArr23 = Arrays.copyOf(jArr23, i46);
                                                            iArr16 = Arrays.copyOf(iArr16, i46);
                                                            zzb = i46;
                                                            i120 = i55;
                                                            break;
                                                        }
                                                        if (x02Var9 != null) {
                                                            i120 = i55;
                                                            while (true) {
                                                                if (i121 != 0) {
                                                                    break;
                                                                }
                                                                if (i118 <= 0) {
                                                                    i121 = 0;
                                                                    break;
                                                                }
                                                                i121 = x02Var9.m27791v();
                                                                i120 = x02Var9.m27782m();
                                                                i118--;
                                                            }
                                                            i121--;
                                                        } else {
                                                            i120 = i55;
                                                        }
                                                        jArr22[i46] = j21;
                                                        int zzc = c4820o3.zzc();
                                                        iArr[i46] = zzc;
                                                        if (zzc > i44) {
                                                            i58 = zzc;
                                                            c4598i3 = c4598i32;
                                                        } else {
                                                            c4598i3 = c4598i32;
                                                            i58 = i44;
                                                        }
                                                        jArr23[i46] = j31 + i120;
                                                        iArr16[i46] = x02Var8 == null ? 1 : 0;
                                                        int i124 = i56;
                                                        if (i46 == i124) {
                                                            iArr16[i46] = 1;
                                                            i43--;
                                                            if (i43 > 0) {
                                                                x02Var8.getClass();
                                                                i124 = x02Var8.m27791v() - 1;
                                                            }
                                                        }
                                                        x02 x02Var10 = x02Var8;
                                                        int i125 = i124;
                                                        j31 += i117;
                                                        int i126 = i119 - 1;
                                                        if (i126 != 0) {
                                                            i119 = i126;
                                                        } else if (i122 > 0) {
                                                            i122--;
                                                            i119 = x02Var7.m27791v();
                                                            i117 = x02Var7.m27782m();
                                                        } else {
                                                            i119 = 0;
                                                        }
                                                        long j33 = j21 + iArr[i46];
                                                        i46++;
                                                        int i127 = i58;
                                                        i45 = i57 - 1;
                                                        zzb = i54;
                                                        C4598i3 c4598i33 = c4598i3;
                                                        i42 = i125;
                                                        i44 = i127;
                                                        c4598i32 = c4598i33;
                                                        x02Var8 = x02Var10;
                                                        j18 = j33;
                                                    }
                                                    long j34 = j31 + i120;
                                                    if (x02Var9 != null) {
                                                        while (i118 > 0) {
                                                            if (x02Var9.m27791v() != 0) {
                                                                z17 = false;
                                                                break;
                                                            }
                                                            x02Var9.m27782m();
                                                            i118--;
                                                        }
                                                    }
                                                    z17 = true;
                                                    if (i43 == 0) {
                                                        i47 = i122;
                                                        i48 = i43;
                                                        i49 = i119;
                                                        i51 = i45;
                                                        c4525g43 = c4525g42;
                                                        i52 = i121;
                                                    } else if (i119 != 0) {
                                                        i47 = i122;
                                                        i49 = i119;
                                                        i51 = i45;
                                                        c4525g43 = c4525g42;
                                                        i52 = i121;
                                                        i48 = 0;
                                                    } else if (i45 != 0) {
                                                        i47 = i122;
                                                        i51 = i45;
                                                        c4525g43 = c4525g42;
                                                        i52 = i121;
                                                        i48 = 0;
                                                        i49 = 0;
                                                    } else if (i122 == 0) {
                                                        if (i121 != 0) {
                                                            jArr3 = jArr22;
                                                            c4525g43 = c4525g42;
                                                            i52 = i121;
                                                            i48 = 0;
                                                            i49 = 0;
                                                            i51 = 0;
                                                            i47 = 0;
                                                        } else if (z17) {
                                                            jArr3 = jArr22;
                                                            i53 = zzb;
                                                            iArr2 = iArr;
                                                            c4525g43 = c4525g42;
                                                            j19 = j34;
                                                            iArr3 = iArr16;
                                                            jArr4 = jArr23;
                                                            jArr5 = jArr3;
                                                            zzb = i53;
                                                            iArr4 = iArr2;
                                                            long m22346g022 = g92.m22346g0(j19, 1000000L, c4525g43.f20389c);
                                                            jArr6 = c4525g43.f20394h;
                                                            if (jArr6 == null) {
                                                            }
                                                        } else {
                                                            jArr3 = jArr22;
                                                            c4525g43 = c4525g42;
                                                            z17 = false;
                                                            i48 = 0;
                                                            i49 = 0;
                                                            i51 = 0;
                                                            i47 = 0;
                                                            i52 = 0;
                                                        }
                                                        int i128 = c4525g43.f20387a;
                                                        i53 = zzb;
                                                        String str14 = true != z17 ? ", ctts invalid" : "";
                                                        StringBuilder sb2 = new StringBuilder();
                                                        iArr2 = iArr;
                                                        sb2.append("Inconsistent stbl box for track ");
                                                        sb2.append(i128);
                                                        sb2.append(": remainingSynchronizationSamples ");
                                                        sb2.append(i48);
                                                        sb2.append(", remainingSamplesAtTimestampDelta ");
                                                        sb2.append(i49);
                                                        sb2.append(", remainingSamplesInChunk ");
                                                        sb2.append(i51);
                                                        sb2.append(", remainingTimestampDeltaChanges ");
                                                        sb2.append(i47);
                                                        sb2.append(", remainingSamplesAtTimestampOffset ");
                                                        sb2.append(i52);
                                                        sb2.append(str14);
                                                        lr1.m24356e(str, sb2.toString());
                                                        j19 = j34;
                                                        iArr3 = iArr16;
                                                        jArr4 = jArr23;
                                                        jArr5 = jArr3;
                                                        zzb = i53;
                                                        iArr4 = iArr2;
                                                        long m22346g0222 = g92.m22346g0(j19, 1000000L, c4525g43.f20389c);
                                                        jArr6 = c4525g43.f20394h;
                                                        if (jArr6 == null) {
                                                        }
                                                    } else {
                                                        i47 = i122;
                                                        c4525g43 = c4525g42;
                                                        i52 = i121;
                                                        i48 = 0;
                                                        i49 = 0;
                                                        i51 = 0;
                                                    }
                                                    jArr3 = jArr22;
                                                    int i1282 = c4525g43.f20387a;
                                                    i53 = zzb;
                                                    if (true != z17) {
                                                    }
                                                    StringBuilder sb22 = new StringBuilder();
                                                    iArr2 = iArr;
                                                    sb22.append("Inconsistent stbl box for track ");
                                                    sb22.append(i1282);
                                                    sb22.append(": remainingSynchronizationSamples ");
                                                    sb22.append(i48);
                                                    sb22.append(", remainingSamplesAtTimestampDelta ");
                                                    sb22.append(i49);
                                                    sb22.append(", remainingSamplesInChunk ");
                                                    sb22.append(i51);
                                                    sb22.append(", remainingTimestampDeltaChanges ");
                                                    sb22.append(i47);
                                                    sb22.append(", remainingSamplesAtTimestampOffset ");
                                                    sb22.append(i52);
                                                    sb22.append(str14);
                                                    lr1.m24356e(str, sb22.toString());
                                                    j19 = j34;
                                                    iArr3 = iArr16;
                                                    jArr4 = jArr23;
                                                    jArr5 = jArr3;
                                                    zzb = i53;
                                                    iArr4 = iArr2;
                                                    long m22346g02222 = g92.m22346g0(j19, 1000000L, c4525g43.f20389c);
                                                    jArr6 = c4525g43.f20394h;
                                                    if (jArr6 == null) {
                                                    }
                                                } else {
                                                    x02Var8 = null;
                                                }
                                            } else {
                                                i41 = 0;
                                            }
                                            i42 = -1;
                                            zza = c4820o3.zza();
                                            String str132 = c4525g42.f20392f.f23099l;
                                            if (zza != -1) {
                                                if (i39 == 0) {
                                                }
                                                m27791v = 0;
                                            }
                                            long[] jArr222 = new long[zzb];
                                            iArr = new int[zzb];
                                            long[] jArr232 = new long[zzb];
                                            i43 = i41;
                                            int[] iArr162 = new int[zzb];
                                            int i1172 = m27791v3;
                                            int i1182 = i39;
                                            int i1192 = m27791v2;
                                            i44 = 0;
                                            int i1202 = 0;
                                            i45 = 0;
                                            int i1212 = 0;
                                            j18 = 0;
                                            long j312 = 0;
                                            int i1222 = m27791v;
                                            i46 = 0;
                                            while (true) {
                                                if (i46 < zzb) {
                                                }
                                                long j332 = j21 + iArr[i46];
                                                i46++;
                                                int i1272 = i58;
                                                i45 = i57 - 1;
                                                zzb = i54;
                                                C4598i3 c4598i332 = c4598i3;
                                                i42 = i125;
                                                i44 = i1272;
                                                c4598i32 = c4598i332;
                                                x02Var8 = x02Var10;
                                                j18 = j332;
                                            }
                                            long j342 = j312 + i1202;
                                            if (x02Var9 != null) {
                                            }
                                            z17 = true;
                                            if (i43 == 0) {
                                            }
                                            jArr3 = jArr222;
                                            int i12822 = c4525g43.f20387a;
                                            i53 = zzb;
                                            if (true != z17) {
                                            }
                                            StringBuilder sb222 = new StringBuilder();
                                            iArr2 = iArr;
                                            sb222.append("Inconsistent stbl box for track ");
                                            sb222.append(i12822);
                                            sb222.append(": remainingSynchronizationSamples ");
                                            sb222.append(i48);
                                            sb222.append(", remainingSamplesAtTimestampDelta ");
                                            sb222.append(i49);
                                            sb222.append(", remainingSamplesInChunk ");
                                            sb222.append(i51);
                                            sb222.append(", remainingTimestampDeltaChanges ");
                                            sb222.append(i47);
                                            sb222.append(", remainingSamplesAtTimestampOffset ");
                                            sb222.append(i52);
                                            sb222.append(str14);
                                            lr1.m24356e(str, sb222.toString());
                                            j19 = j342;
                                            iArr3 = iArr162;
                                            jArr4 = jArr232;
                                            jArr5 = jArr3;
                                            zzb = i53;
                                            iArr4 = iArr2;
                                            long m22346g022222 = g92.m22346g0(j19, 1000000L, c4525g43.f20389c);
                                            jArr6 = c4525g43.f20394h;
                                            if (jArr6 == null) {
                                            }
                                        }
                                        arrayList2 = arrayList;
                                        arrayList2.add(c4635j4);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                }
                            } else {
                                m27782m4 = 65536;
                                m27782m5 = -65536;
                            }
                        }
                        m27782m3 = 0;
                    }
                    if (m27782m3 == 0) {
                        if (m27782m4 == -65536) {
                            if (m27782m5 != 65536) {
                                i69 = m27782m5;
                            } else if (m27782m6 == 0) {
                                i12 = 270;
                                C4857p3 c4857p322 = new C4857p3(m27782m2, j12, i12);
                                if (j11 == -9223372036854775807L) {
                                }
                                x02 x02Var32 = m21871d.f20375b;
                                x02Var32.m27775f(8);
                                x02Var32.m27776g(AbstractC4561h3.m22689a(x02Var32.m27782m()) == 0 ? 8 : 16);
                                long m27762A4 = x02Var32.m27762A();
                                if (j13 != -9223372036854775807L) {
                                }
                                C4487f3 m21870c32 = m21870c2.m21870c(1835626086);
                                m21870c32.getClass();
                                C4487f3 m21870c42 = m21870c32.m21870c(1937007212);
                                m21870c42.getClass();
                                C4524g3 m21871d42 = m21870c2.m21871d(1835296868);
                                m21871d42.getClass();
                                Pair m25642i2 = m25642i(m21871d42.f20375b);
                                C4524g3 m21871d52 = m21870c42.m21871d(1937011556);
                                m21871d52.getClass();
                                x02 x02Var42 = m21871d52.f20375b;
                                i13 = c4857p322.f26046a;
                                i14 = c4857p322.f26048c;
                                String str102 = (String) m25642i2.second;
                                x02Var42.m27775f(12);
                                m27782m = x02Var42.m27782m();
                                C4745m3 c4745m362 = new C4745m3(m27782m);
                                i15 = 0;
                                while (i15 < m27782m) {
                                }
                                c4745m3 = c4745m362;
                                int i882 = m25638e;
                                arrayList = arrayList3;
                                C4857p3 c4857p332 = c4857p322;
                                Pair pair22 = m25642i2;
                                str = str9;
                                c4487f32 = c4487f35;
                                m21870c = c4487f32.m21870c(1701082227);
                                if (m21870c != null) {
                                }
                                jArr = null;
                                jArr2 = null;
                                if (c4745m3.f24354b == null) {
                                }
                            }
                            m27782m4 = -65536;
                        } else {
                            i69 = m27782m5;
                        }
                        m27782m3 = 0;
                    } else {
                        i69 = m27782m5;
                    }
                    i12 = (m27782m3 == -65536 && m27782m4 == 0 && i69 == 0 && m27782m6 == -65536) ? 180 : 0;
                    C4857p3 c4857p3222 = new C4857p3(m27782m2, j12, i12);
                    if (j11 == -9223372036854775807L) {
                    }
                    x02 x02Var322 = m21871d.f20375b;
                    x02Var322.m27775f(8);
                    x02Var322.m27776g(AbstractC4561h3.m22689a(x02Var322.m27782m()) == 0 ? 8 : 16);
                    long m27762A42 = x02Var322.m27762A();
                    if (j13 != -9223372036854775807L) {
                    }
                    C4487f3 m21870c322 = m21870c2.m21870c(1835626086);
                    m21870c322.getClass();
                    C4487f3 m21870c422 = m21870c322.m21870c(1937007212);
                    m21870c422.getClass();
                    C4524g3 m21871d422 = m21870c2.m21871d(1835296868);
                    m21871d422.getClass();
                    Pair m25642i22 = m25642i(m21871d422.f20375b);
                    C4524g3 m21871d522 = m21870c422.m21871d(1937011556);
                    m21871d522.getClass();
                    x02 x02Var422 = m21871d522.f20375b;
                    i13 = c4857p3222.f26046a;
                    i14 = c4857p3222.f26048c;
                    String str1022 = (String) m25642i22.second;
                    x02Var422.m27775f(12);
                    m27782m = x02Var422.m27782m();
                    C4745m3 c4745m3622 = new C4745m3(m27782m);
                    i15 = 0;
                    while (i15 < m27782m) {
                    }
                    c4745m3 = c4745m3622;
                    int i8822 = m25638e;
                    arrayList = arrayList3;
                    C4857p3 c4857p3322 = c4857p3222;
                    Pair pair222 = m25642i22;
                    str = str9;
                    c4487f32 = c4487f35;
                    m21870c = c4487f32.m21870c(1701082227);
                    if (m21870c != null) {
                    }
                    jArr = null;
                    jArr2 = null;
                    if (c4745m3.f24354b == null) {
                    }
                }
                c4525g4 = null;
                c4525g42 = (C4525g4) y43Var2.apply(c4525g4);
                if (c4525g42 == null) {
                }
            }
            i66 = i11 + 1;
            zzxVar3 = zzxVar;
            arrayList3 = arrayList2;
            c4487f34 = c4487f3;
        }
        return arrayList3;
    }

    /* renamed from: d */
    public static void m25637d(x02 x02Var) {
        int m27780k = x02Var.m27780k();
        x02Var.m27776g(4);
        if (x02Var.m27782m() != 1751411826) {
            m27780k += 4;
        }
        x02Var.m27775f(m27780k);
    }

    /* renamed from: e */
    private static int m25638e(int i11) {
        if (i11 == 1936684398) {
            return 1;
        }
        if (i11 == 1986618469) {
            return 2;
        }
        if (i11 == 1952807028 || i11 == 1935832172 || i11 == 1937072756 || i11 == 1668047728) {
            return 3;
        }
        return i11 == 1835365473 ? 5 : -1;
    }

    /* renamed from: f */
    private static int m25639f(x02 x02Var) {
        int m27788s = x02Var.m27788s();
        int i11 = m27788s & 127;
        while ((m27788s & 128) == 128) {
            m27788s = x02Var.m27788s();
            i11 = (i11 << 7) | (m27788s & 127);
        }
        return i11;
    }

    /* renamed from: g */
    private static int m25640g(x02 x02Var) {
        x02Var.m27775f(16);
        return x02Var.m27782m();
    }

    /* renamed from: h */
    private static Pair m25641h(C4487f3 c4487f3) {
        long m27762A;
        long m27782m;
        C4524g3 m21871d = c4487f3.m21871d(1701606260);
        if (m21871d == null) {
            return null;
        }
        x02 x02Var = m21871d.f20375b;
        x02Var.m27775f(8);
        int m22689a = AbstractC4561h3.m22689a(x02Var.m27782m());
        int m27791v = x02Var.m27791v();
        long[] jArr = new long[m27791v];
        long[] jArr2 = new long[m27791v];
        for (int i11 = 0; i11 < m27791v; i11++) {
            if (m22689a == 1) {
                m27762A = x02Var.m27763B();
            } else {
                m27762A = x02Var.m27762A();
            }
            jArr[i11] = m27762A;
            if (m22689a == 1) {
                m27782m = x02Var.m27795z();
            } else {
                m27782m = x02Var.m27782m();
            }
            jArr2[i11] = m27782m;
            if (x02Var.m27768G() == 1) {
                x02Var.m27776g(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: i */
    private static Pair m25642i(x02 x02Var) {
        int i11;
        int i12 = 8;
        x02Var.m27775f(8);
        int m22689a = AbstractC4561h3.m22689a(x02Var.m27782m());
        if (m22689a == 0) {
            i11 = 8;
        } else {
            i11 = 16;
        }
        x02Var.m27776g(i11);
        long m27762A = x02Var.m27762A();
        if (m22689a == 0) {
            i12 = 4;
        }
        x02Var.m27776g(i12);
        int m27792w = x02Var.m27792w();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) (((m27792w >> 10) & 31) + 96));
        sb2.append((char) (((m27792w >> 5) & 31) + 96));
        sb2.append((char) ((m27792w & 31) + 96));
        return Pair.create(Long.valueOf(m27762A), sb2.toString());
    }

    /* renamed from: j */
    private static Pair m25643j(x02 x02Var, int i11, int i12) {
        boolean z11;
        boolean z12;
        boolean z13;
        Integer num;
        C4562h4 c4562h4;
        Pair create;
        int i13;
        int i14;
        boolean z14;
        byte[] bArr;
        int m27780k = x02Var.m27780k();
        while (m27780k - i11 < i12) {
            x02Var.m27775f(m27780k);
            int m27782m = x02Var.m27782m();
            boolean z15 = true;
            if (m27782m > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            nm4.m24964b(z11, "childAtomSize must be positive");
            if (x02Var.m27782m() == 1936289382) {
                int i15 = m27780k + 8;
                int i16 = -1;
                int i17 = 0;
                String str = null;
                Integer num2 = null;
                while (i15 - m27780k < m27782m) {
                    x02Var.m27775f(i15);
                    int m27782m2 = x02Var.m27782m();
                    int m27782m3 = x02Var.m27782m();
                    if (m27782m3 == 1718775137) {
                        num2 = Integer.valueOf(x02Var.m27782m());
                    } else if (m27782m3 == 1935894637) {
                        x02Var.m27776g(4);
                        str = x02Var.m27767F(4, w43.f29782c);
                    } else if (m27782m3 == 1935894633) {
                        i16 = i15;
                        i17 = m27782m2;
                    }
                    i15 += m27782m2;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    nm4.m24964b(z12, "frma atom is mandatory");
                    if (i16 != -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    nm4.m24964b(z13, "schi atom is mandatory");
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 < i17) {
                            x02Var.m27775f(i18);
                            int m27782m4 = x02Var.m27782m();
                            if (x02Var.m27782m() == 1952804451) {
                                int m27782m5 = x02Var.m27782m();
                                x02Var.m27776g(1);
                                if (AbstractC4561h3.m22689a(m27782m5) == 0) {
                                    x02Var.m27776g(1);
                                    i13 = 0;
                                    i14 = 0;
                                } else {
                                    int m27788s = x02Var.m27788s();
                                    int i19 = (m27788s & 240) >> 4;
                                    i13 = m27788s & 15;
                                    i14 = i19;
                                }
                                if (x02Var.m27788s() == 1) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int m27788s2 = x02Var.m27788s();
                                byte[] bArr2 = new byte[16];
                                x02Var.m27771b(bArr2, 0, 16);
                                if (z14 && m27788s2 == 0) {
                                    int m27788s3 = x02Var.m27788s();
                                    byte[] bArr3 = new byte[m27788s3];
                                    x02Var.m27771b(bArr3, 0, m27788s3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                c4562h4 = new C4562h4(z14, str, m27788s2, bArr2, i14, i13, bArr);
                            } else {
                                i18 += m27782m4;
                            }
                        } else {
                            num = num2;
                            c4562h4 = null;
                            break;
                        }
                    }
                    if (c4562h4 == null) {
                        z15 = false;
                    }
                    nm4.m24964b(z15, "tenc atom is mandatory");
                    int i21 = g92.f20474a;
                    create = Pair.create(num, c4562h4);
                }
                if (create != null) {
                    return create;
                }
            }
            m27780k += m27782m;
        }
        return null;
    }

    /* renamed from: k */
    private static C4634j3 m25644k(x02 x02Var, int i11) {
        long j11;
        long j12;
        x02Var.m27775f(i11 + 12);
        x02Var.m27776g(1);
        m25639f(x02Var);
        x02Var.m27776g(2);
        int m27788s = x02Var.m27788s();
        if ((m27788s & 128) != 0) {
            x02Var.m27776g(2);
        }
        if ((m27788s & 64) != 0) {
            x02Var.m27776g(x02Var.m27788s());
        }
        if ((m27788s & 32) != 0) {
            x02Var.m27776g(2);
        }
        x02Var.m27776g(1);
        m25639f(x02Var);
        String m23846d = k70.m23846d(x02Var.m27788s());
        if (!"audio/mpeg".equals(m23846d) && !"audio/vnd.dts".equals(m23846d) && !"audio/vnd.dts.hd".equals(m23846d)) {
            x02Var.m27776g(4);
            long m27762A = x02Var.m27762A();
            long m27762A2 = x02Var.m27762A();
            x02Var.m27776g(1);
            int m25639f = m25639f(x02Var);
            byte[] bArr = new byte[m25639f];
            x02Var.m27771b(bArr, 0, m25639f);
            if (m27762A2 <= 0) {
                j11 = -1;
            } else {
                j11 = m27762A2;
            }
            if (m27762A > 0) {
                j12 = m27762A;
            } else {
                j12 = -1;
            }
            return new C4634j3(m23846d, bArr, j11, j12);
        }
        return new C4634j3(m23846d, null, -1L, -1L);
    }

    /* renamed from: l */
    private static ByteBuffer m25645l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m25646m(x02 x02Var, int i11, int i12, int i13, int i14, String str, boolean z11, zzx zzxVar, C4745m3 c4745m3, int i15) {
        int i16;
        int m27789t;
        int m27782m;
        int i17;
        String str2;
        String str3;
        int i18;
        long j11;
        long j12;
        int i19;
        int i21;
        int i22;
        byte[] bArr;
        int i23;
        String str4;
        boolean z12;
        boolean z13;
        int i24 = i12;
        int i25 = i13;
        zzx zzxVar2 = zzxVar;
        x02Var.m27775f(i24 + 16);
        if (z11) {
            i16 = x02Var.m27792w();
            x02Var.m27776g(6);
        } else {
            x02Var.m27776g(8);
            i16 = 0;
        }
        if (i16 == 0 || i16 == 1) {
            int m27792w = x02Var.m27792w();
            x02Var.m27776g(6);
            m27789t = x02Var.m27789t();
            x02Var.m27775f(x02Var.m27780k() - 4);
            m27782m = x02Var.m27782m();
            if (i16 == 1) {
                x02Var.m27776g(16);
            }
            i17 = m27792w;
        } else {
            if (i16 != 2) {
                return;
            }
            x02Var.m27776g(16);
            m27789t = (int) Math.round(Double.longBitsToDouble(x02Var.m27795z()));
            i17 = x02Var.m27791v();
            x02Var.m27776g(20);
            m27782m = 0;
        }
        int m27780k = x02Var.m27780k();
        int i26 = 1701733217;
        int i27 = i11;
        if (i27 == 1701733217) {
            Pair m25643j = m25643j(x02Var, i24, i25);
            if (m25643j != null) {
                i26 = ((Integer) m25643j.first).intValue();
                zzxVar2 = zzxVar2 == null ? null : zzxVar2.m28836b(((C4562h4) m25643j.second).f21528b);
                c4745m3.f24353a[i15] = (C4562h4) m25643j.second;
            }
            x02Var.m27775f(m27780k);
            i27 = i26;
        }
        if (i27 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i27 == 1700998451) {
            str2 = "audio/eac3";
        } else {
            if (i27 == 1633889588) {
                str3 = "audio/ac4";
                i18 = -1;
                String str5 = str3;
                C4634j3 c4634j3 = null;
                String str6 = null;
                List list = null;
                while (m27780k - i24 < i25) {
                    x02Var.m27775f(m27780k);
                    int m27782m2 = x02Var.m27782m();
                    String str7 = "childAtomSize must be positive";
                    nm4.m24964b(m27782m2 > 0, "childAtomSize must be positive");
                    int m27782m3 = x02Var.m27782m();
                    if (m27782m3 == 1835557187) {
                        int i28 = m27782m2 - 13;
                        byte[] bArr2 = new byte[i28];
                        x02Var.m27775f(m27780k + 13);
                        x02Var.m27771b(bArr2, 0, i28);
                        list = c83.m20833x(bArr2);
                        i19 = i18;
                    } else {
                        if (m27782m3 == 1702061171) {
                            i19 = i18;
                            i21 = m27780k;
                            i22 = -1;
                        } else if (z11 && m27782m3 == 2002876005) {
                            int m27780k2 = x02Var.m27780k();
                            if (m27780k2 >= m27780k) {
                                i23 = m27780k2;
                                str4 = null;
                                z12 = true;
                            } else {
                                i23 = m27780k2;
                                str4 = null;
                                z12 = false;
                            }
                            nm4.m24964b(z12, str4);
                            i21 = i23;
                            while (true) {
                                if (i21 - m27780k >= m27782m2) {
                                    i19 = i18;
                                    i22 = -1;
                                    i21 = -1;
                                    break;
                                }
                                x02Var.m27775f(i21);
                                int m27782m4 = x02Var.m27782m();
                                if (m27782m4 > 0) {
                                    i19 = i18;
                                    z13 = true;
                                } else {
                                    i19 = i18;
                                    z13 = false;
                                }
                                nm4.m24964b(z13, str7);
                                String str8 = str7;
                                if (x02Var.m27782m() == 1702061171) {
                                    i22 = -1;
                                    break;
                                } else {
                                    i21 += m27782m4;
                                    i18 = i19;
                                    str7 = str8;
                                }
                            }
                        } else {
                            i19 = i18;
                            if (m27782m3 == 1684103987) {
                                x02Var.m27775f(m27780k + 8);
                                c4745m3.f24354b = jl4.m23640c(x02Var, Integer.toString(i14), str, zzxVar2);
                            } else if (m27782m3 == 1684366131) {
                                x02Var.m27775f(m27780k + 8);
                                c4745m3.f24354b = jl4.m23641d(x02Var, Integer.toString(i14), str, zzxVar2);
                            } else if (m27782m3 == 1684103988) {
                                x02Var.m27775f(m27780k + 8);
                                String num = Integer.toString(i14);
                                int i29 = ml4.f24648b;
                                x02Var.m27776g(1);
                                int i31 = 1 != ((x02Var.m27788s() & 32) >> 5) ? 44100 : 48000;
                                C5004t1 c5004t1 = new C5004t1();
                                c5004t1.m26511h(num);
                                c5004t1.m26523s("audio/ac4");
                                c5004t1.m26506e0(2);
                                c5004t1.m26524t(i31);
                                c5004t1.m26500b(zzxVar2);
                                c5004t1.m26515k(str);
                                c4745m3.f24354b = c5004t1.m26529y();
                            } else if (m27782m3 == 1684892784) {
                                if (m27782m <= 0) {
                                    throw zzbu.m28711a("Invalid sample rate for Dolby TrueHD MLP stream: " + m27782m, null);
                                }
                                m27789t = m27782m;
                                i17 = 2;
                            } else if (m27782m3 == 1684305011) {
                                C5004t1 c5004t12 = new C5004t1();
                                c5004t12.m26509g(i14);
                                c5004t12.m26523s(str5);
                                c5004t12.m26506e0(i17);
                                c5004t12.m26524t(m27789t);
                                c5004t12.m26500b(zzxVar2);
                                c5004t12.m26515k(str);
                                c4745m3.f24354b = c5004t12.m26529y();
                            } else if (m27782m3 == 1682927731) {
                                int i32 = m27782m2 - 8;
                                byte[] bArr3 = f26612a;
                                byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i32);
                                x02Var.m27775f(m27780k + 8);
                                x02Var.m27771b(copyOf, bArr3.length, i32);
                                list = AbstractC4594i.m23082a(copyOf);
                            } else {
                                if (m27782m3 == 1684425825) {
                                    byte[] bArr4 = new byte[m27782m2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    x02Var.m27775f(m27780k + 12);
                                    x02Var.m27771b(bArr4, 4, m27782m2 - 12);
                                    list = c83.m20833x(bArr4);
                                } else if (m27782m3 == 1634492771) {
                                    int i33 = m27782m2 - 12;
                                    byte[] bArr5 = new byte[i33];
                                    x02Var.m27775f(m27780k + 12);
                                    x02Var.m27771b(bArr5, 0, i33);
                                    x02 x02Var2 = new x02(bArr5);
                                    x02Var2.m27775f(9);
                                    int m27788s = x02Var2.m27788s();
                                    x02Var2.m27775f(20);
                                    Pair create = Pair.create(Integer.valueOf(x02Var2.m27791v()), Integer.valueOf(m27788s));
                                    int intValue = ((Integer) create.first).intValue();
                                    int intValue2 = ((Integer) create.second).intValue();
                                    list = c83.m20833x(bArr5);
                                    m27789t = intValue;
                                    i17 = intValue2;
                                    m27780k += m27782m2;
                                    i24 = i12;
                                    i25 = i13;
                                    i18 = i19;
                                }
                                m27780k += m27782m2;
                                i24 = i12;
                                i25 = i13;
                                i18 = i19;
                            }
                        }
                        if (i21 != i22) {
                            c4634j3 = m25644k(x02Var, i21);
                            str5 = c4634j3.f22604a;
                            bArr = c4634j3.f22605b;
                            if (bArr != null) {
                                if ("audio/mp4a-latm".equals(str5)) {
                                    fl4 m22466a = gl4.m22466a(bArr);
                                    m27789t = m22466a.f20186a;
                                    i17 = m22466a.f20187b;
                                    str6 = m22466a.f20188c;
                                }
                                list = c83.m20833x(bArr);
                            }
                        }
                        m27780k += m27782m2;
                        i24 = i12;
                        i25 = i13;
                        i18 = i19;
                    }
                    m27780k += m27782m2;
                    i24 = i12;
                    i25 = i13;
                    i18 = i19;
                }
                int i34 = i18;
                if (c4745m3.f24354b != null || str5 == null) {
                    return;
                }
                C5004t1 c5004t13 = new C5004t1();
                c5004t13.m26509g(i14);
                c5004t13.m26523s(str5);
                c5004t13.m26508f0(str6);
                c5004t13.m26506e0(i17);
                c5004t13.m26524t(m27789t);
                c5004t13.m26518n(i34);
                c5004t13.m26513i(list);
                c5004t13.m26500b(zzxVar2);
                c5004t13.m26515k(str);
                if (c4634j3 != null) {
                    j11 = c4634j3.f22606c;
                    c5004t13.m26504d0(ha3.m22774c(j11));
                    j12 = c4634j3.f22607d;
                    c5004t13.m26519o(ha3.m22774c(j12));
                }
                c4745m3.f24354b = c5004t13.m26529y();
                return;
            }
            if (i27 == 1685353315) {
                str2 = "audio/vnd.dts";
            } else if (i27 == 1685353320 || i27 == 1685353324) {
                str2 = "audio/vnd.dts.hd";
            } else if (i27 == 1685353317) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            } else if (i27 == 1685353336) {
                str2 = "audio/vnd.dts.uhd;profile=p2";
            } else if (i27 == 1935764850) {
                str2 = "audio/3gpp";
            } else {
                if (i27 != 1935767394) {
                    str3 = "audio/raw";
                    if (i27 == 1819304813 || i27 == 1936684916) {
                        i18 = 2;
                    } else if (i27 == 1953984371) {
                        i18 = 268435456;
                    } else if (i27 == 778924082 || i27 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i27 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i27 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i27 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i27 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i27 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i27 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i27 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i27 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else {
                        i18 = -1;
                        str3 = null;
                    }
                    String str52 = str3;
                    C4634j3 c4634j32 = null;
                    String str62 = null;
                    List list2 = null;
                    while (m27780k - i24 < i25) {
                    }
                    int i342 = i18;
                    if (c4745m3.f24354b != null) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = "audio/amr-wb";
            }
        }
        str3 = str2;
        i18 = -1;
        String str522 = str3;
        C4634j3 c4634j322 = null;
        String str622 = null;
        List list22 = null;
        while (m27780k - i24 < i25) {
        }
        int i3422 = i18;
        if (c4745m3.f24354b != null) {
        }
    }

    /* renamed from: n */
    private static void m25647n(x02 x02Var, int i11, int i12, int i13, C4745m3 c4745m3) {
        x02Var.m27775f(i12 + 16);
        x02Var.m27765D((char) 0);
        String m27765D = x02Var.m27765D((char) 0);
        if (m27765D != null) {
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26509g(i13);
            c5004t1.m26523s(m27765D);
            c4745m3.f24354b = c5004t1.m26529y();
        }
    }

    /* renamed from: o */
    private static boolean m25648o(long[] jArr, long j11, long j12, long j13) {
        int length = jArr.length;
        int i11 = length - 1;
        int m22322P = g92.m22322P(4, 0, i11);
        int m22322P2 = g92.m22322P(length - 4, 0, i11);
        if (jArr[0] > j12 || j12 >= jArr[m22322P] || jArr[m22322P2] >= j13 || j13 > j11) {
            return false;
        }
        return true;
    }
}
