package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f4 */
/* loaded from: classes2.dex */
abstract class AbstractC4488f4 {

    /* renamed from: a */
    private static final int[] f19992a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m21938a(km4 km4Var) {
        return m21940c(km4Var, true, false);
    }

    /* renamed from: b */
    public static boolean m21939b(km4 km4Var, boolean z11) {
        return m21940c(km4Var, false, false);
    }

    /* renamed from: c */
    private static boolean m21940c(km4 km4Var, boolean z11, boolean z12) {
        boolean z13;
        long j11;
        int i11;
        long zzd = km4Var.zzd();
        long j12 = 4096;
        long j13 = -1;
        if (zzd != -1 && zzd <= 4096) {
            j12 = zzd;
        }
        int i12 = (int) j12;
        x02 x02Var = new x02(64);
        boolean z14 = false;
        int i13 = 0;
        boolean z15 = false;
        while (i13 < i12) {
            x02Var.m27772c(8);
            if (!km4Var.mo23963f(x02Var.m27777h(), z14 ? 1 : 0, 8, true)) {
                break;
            }
            long m27762A = x02Var.m27762A();
            int m27782m = x02Var.m27782m();
            if (m27762A == 1) {
                km4Var.mo23966j(x02Var.m27777h(), 8, 8);
                i11 = 16;
                x02Var.m27774e(16);
                j11 = x02Var.m27795z();
            } else {
                if (m27762A == 0) {
                    long zzd2 = km4Var.zzd();
                    if (zzd2 != j13) {
                        m27762A = (zzd2 - km4Var.zze()) + 8;
                    }
                }
                j11 = m27762A;
                i11 = 8;
            }
            long j14 = i11;
            if (j11 < j14) {
                return z14;
            }
            i13 += i11;
            if (m27782m == 1836019574) {
                i12 += (int) j11;
                if (zzd != -1 && i12 > zzd) {
                    i12 = (int) zzd;
                }
                j13 = -1;
            } else {
                if (m27782m == 1836019558 || m27782m == 1836475768) {
                    z13 = true;
                    break;
                }
                if ((i13 + j11) - j14 >= i12) {
                    break;
                }
                int i14 = (int) (j11 - j14);
                i13 += i14;
                if (m27782m == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    x02Var.m27772c(i14);
                    km4Var.mo23966j(x02Var.m27777h(), 0, i14);
                    int i15 = i14 >> 2;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (i16 == 1) {
                            x02Var.m27776g(4);
                        } else {
                            int m27782m2 = x02Var.m27782m();
                            if ((m27782m2 >>> 8) != 3368816) {
                                if (m27782m2 == 1751476579) {
                                    m27782m2 = 1751476579;
                                }
                                int[] iArr = f19992a;
                                for (int i17 = 0; i17 < 29; i17++) {
                                    if (iArr[i17] != m27782m2) {
                                    }
                                }
                            }
                            z15 = true;
                            break;
                        }
                    }
                    if (!z15) {
                        return false;
                    }
                } else if (i14 != 0) {
                    km4Var.mo23960b(i14);
                }
                j13 = -1;
                z14 = false;
            }
        }
        z13 = false;
        if (z15 && z11 == z13) {
            return true;
        }
        return false;
    }
}
