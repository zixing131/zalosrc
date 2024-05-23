package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
abstract class sh3 {
    /* renamed from: a */
    public static void m26307a(vn3 vn3Var) {
        tr3.m26727k(m26309c(vn3Var.m27321J().m21775K()));
        m26308b(vn3Var.m27321J().m21776L());
        if (vn3Var.m27322M() != 2) {
            df3.m21369c(vn3Var.m27320F().m25493I());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m26308b(int i11) {
        int i12 = i11 - 2;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(io3.m23311a(i11))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    /* renamed from: c */
    public static int m26309c(int i11) {
        int i12 = i11 - 2;
        if (i12 != 2) {
            if (i12 == 3) {
                return 2;
            }
            if (i12 == 4) {
                return 3;
            }
            throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(go3.m22496a(i11))));
        }
        return 1;
    }

    /* renamed from: d */
    public static int m26310d(int i11) {
        int i12 = i11 - 2;
        int i13 = 1;
        if (i12 != 1) {
            i13 = 2;
            if (i12 != 2) {
                if (i12 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(mn3.m24649a(i11))));
            }
        }
        return i13;
    }
}
