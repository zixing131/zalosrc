package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zh3 implements wd3 {

    /* renamed from: a */
    private final di3 f31511a;

    /* renamed from: b */
    private final bi3 f31512b;

    /* renamed from: c */
    private final xh3 f31513c;

    /* renamed from: d */
    private final wh3 f31514d;

    private zh3(di3 di3Var, bi3 bi3Var, wh3 wh3Var, xh3 xh3Var, int i11, byte[] bArr) {
        this.f31511a = di3Var;
        this.f31512b = bi3Var;
        this.f31514d = wh3Var;
        this.f31513c = xh3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static zh3 m28512a(dp3 dp3Var) {
        di3 m25473a;
        if (dp3Var.m21530O()) {
            if (dp3Var.m21528J().m22508P()) {
                if (!dp3Var.m21529K().m24737j()) {
                    ap3 m22506G = dp3Var.m21528J().m22506G();
                    bi3 m21724b = ei3.m21724b(m22506G);
                    wh3 m21725c = ei3.m21725c(m22506G);
                    xh3 m21723a = ei3.m21723a(m22506G);
                    int m20219K = m22506G.m20219K();
                    int i11 = 1;
                    if (m20219K - 2 == 1) {
                        int m20219K2 = dp3Var.m21528J().m22506G().m20219K() - 2;
                        if (m20219K2 != 1) {
                            if (m20219K2 != 2 && m20219K2 != 3 && m20219K2 != 4) {
                                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                            }
                            byte[] m24738k = dp3Var.m21529K().m24738k();
                            byte[] m24738k2 = dp3Var.m21528J().m22507L().m24738k();
                            int m20219K3 = dp3Var.m21528J().m22506G().m20219K() - 2;
                            if (m20219K3 != 2) {
                                if (m20219K3 != 3) {
                                    if (m20219K3 == 4) {
                                        i11 = 3;
                                    } else {
                                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                    }
                                } else {
                                    i11 = 2;
                                }
                            }
                            m25473a = ni3.m24929a(m24738k, m24738k2, i11);
                        } else {
                            m25473a = pi3.m25473a(dp3Var.m21529K().m24738k());
                        }
                        return new zh3(m25473a, m21724b, m21725c, m21723a, 32, null);
                    }
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(uo3.m27027a(m20219K)));
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }
}
