package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class sm4 {
    /* renamed from: a */
    public static int m26365a(x02 x02Var, int i11) {
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
                return x02Var.m27788s() + 1;
            case 7:
                return x02Var.m27792w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i11 - 8);
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static long m26366b(km4 km4Var, wm4 wm4Var) {
        int i11;
        km4Var.zzj();
        yl4 yl4Var = (yl4) km4Var;
        boolean z11 = true;
        yl4Var.m28247k(1, false);
        byte[] bArr = new byte[1];
        yl4Var.mo23963f(bArr, 0, 1, false);
        int i12 = bArr[0] & 1;
        yl4Var.m28247k(2, false);
        if (1 != i12) {
            i11 = 6;
        } else {
            i11 = 7;
        }
        x02 x02Var = new x02(i11);
        x02Var.m27774e(nm4.m24963a(km4Var, x02Var.m27777h(), 0, i11));
        km4Var.zzj();
        rm4 rm4Var = new rm4();
        if (1 != i12) {
            z11 = false;
        }
        if (m26368d(x02Var, wm4Var, z11, rm4Var)) {
            return rm4Var.f27301a;
        }
        throw zzbu.m28711a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:            if (r7 != r18.f30020f) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:            if ((r17.m27788s() * 1000) == r3) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:            if (r4 == r3) goto L50;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m26367c(x02 x02Var, wm4 wm4Var, int i11, rm4 rm4Var) {
        boolean z11;
        int m26365a;
        int m27780k = x02Var.m27780k();
        long m27762A = x02Var.m27762A();
        long j11 = m27762A >>> 16;
        if (j11 != i11) {
            return false;
        }
        if ((j11 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (int) ((m27762A >> 12) & 15);
        int i13 = (int) ((m27762A >> 8) & 15);
        int i14 = (int) (15 & (m27762A >> 4));
        int i15 = (int) ((m27762A >> 1) & 7);
        long j12 = m27762A & 1;
        if (i14 > 7 ? !(i14 > 10 || wm4Var.f30021g != 2) : i14 == wm4Var.f30021g - 1) {
            if ((i15 == 0 || i15 == wm4Var.f30023i) && j12 != 1 && m26368d(x02Var, wm4Var, z11, rm4Var) && (m26365a = m26365a(x02Var, i12)) != -1 && m26365a <= wm4Var.f30016b) {
                int i16 = wm4Var.f30019e;
                if (i13 != 0) {
                    if (i13 > 11) {
                        if (i13 != 12) {
                            if (i13 <= 14) {
                                int m27792w = x02Var.m27792w();
                                if (i13 == 14) {
                                    m27792w *= 10;
                                }
                            }
                        }
                    }
                }
                if (x02Var.m27788s() == g92.m22324R(x02Var.m27777h(), m27780k, x02Var.m27780k() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m26368d(x02 x02Var, wm4 wm4Var, boolean z11, rm4 rm4Var) {
        try {
            long m27764C = x02Var.m27764C();
            if (!z11) {
                m27764C *= wm4Var.f30016b;
            }
            rm4Var.f27301a = m27764C;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
