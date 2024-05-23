package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xk */
/* loaded from: classes2.dex */
abstract class AbstractC5172xk {

    /* renamed from: a */
    private static final int[] f30489a = {AbstractC4916qo.m25831g("isom"), AbstractC4916qo.m25831g("iso2"), AbstractC4916qo.m25831g("iso3"), AbstractC4916qo.m25831g("iso4"), AbstractC4916qo.m25831g("iso5"), AbstractC4916qo.m25831g("iso6"), AbstractC4916qo.m25831g("avc1"), AbstractC4916qo.m25831g("hvc1"), AbstractC4916qo.m25831g("hev1"), AbstractC4916qo.m25831g("mp41"), AbstractC4916qo.m25831g("mp42"), AbstractC4916qo.m25831g("3g2a"), AbstractC4916qo.m25831g("3g2b"), AbstractC4916qo.m25831g("3gr6"), AbstractC4916qo.m25831g("3gs6"), AbstractC4916qo.m25831g("3ge6"), AbstractC4916qo.m25831g("3gg6"), AbstractC4916qo.m25831g("M4V "), AbstractC4916qo.m25831g("M4A "), AbstractC4916qo.m25831g("f4v "), AbstractC4916qo.m25831g("kddi"), AbstractC4916qo.m25831g("M4VP"), AbstractC4916qo.m25831g("qt  "), AbstractC4916qo.m25831g("MSNV")};

    /* renamed from: a */
    public static boolean m27895a(C4577hj c4577hj) {
        return m27897c(c4577hj, true);
    }

    /* renamed from: b */
    public static boolean m27896b(C4577hj c4577hj) {
        return m27897c(c4577hj, false);
    }

    /* renamed from: c */
    private static boolean m27897c(C4577hj c4577hj, boolean z11) {
        boolean z12;
        long j11;
        int i11;
        long m22916c = c4577hj.m22916c();
        if (m22916c == -1 || m22916c > 4096) {
            m22916c = 4096;
        }
        int i12 = (int) m22916c;
        C4655jo c4655jo = new C4655jo(64);
        int i13 = 0;
        boolean z13 = false;
        while (i13 < i12) {
            c4655jo.m23683s(8);
            c4577hj.m22920g(c4655jo.f22891a, 0, 8, false);
            long m23677m = c4655jo.m23677m();
            int m23669e = c4655jo.m23669e();
            if (m23677m == 1) {
                c4577hj.m22920g(c4655jo.f22891a, 8, 8, false);
                i11 = 16;
                c4655jo.m23685u(16);
                j11 = c4655jo.m23678n();
            } else {
                j11 = m23677m;
                i11 = 8;
            }
            long j12 = i11;
            if (j11 < j12) {
                return false;
            }
            i13 += i11;
            if (m23669e != AbstractC4541gk.f20625C) {
                if (m23669e == AbstractC4541gk.f20643L || m23669e == AbstractC4541gk.f20647N) {
                    z12 = true;
                    break;
                }
                if ((i13 + j11) - j12 >= i12) {
                    break;
                }
                int i14 = (int) (j11 - j12);
                i13 += i14;
                if (m23669e == AbstractC4541gk.f20663b) {
                    if (i14 < 8) {
                        return false;
                    }
                    c4655jo.m23683s(i14);
                    c4577hj.m22920g(c4655jo.f22891a, 0, i14, false);
                    int i15 = i14 >> 2;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (i16 == 1) {
                            c4655jo.m23687w(4);
                        } else {
                            int m23669e2 = c4655jo.m23669e();
                            if ((m23669e2 >>> 8) != AbstractC4916qo.m25831g("3gp")) {
                                int[] iArr = f30489a;
                                int length = iArr.length;
                                for (int i17 = 0; i17 < 24; i17++) {
                                    if (iArr[i17] != m23669e2) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i14 != 0) {
                    c4577hj.m22919f(i14, false);
                }
            }
        }
        z12 = false;
        if (!z13 || z11 != z12) {
            return false;
        }
        return true;
    }
}
