package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ef3 {

    /* renamed from: a */
    public static final Charset f19620a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static cq3 m21702a(xp3 xp3Var) {
        zp3 m20986F = cq3.m20986F();
        m20986F.m28586r(xp3Var.m27973G());
        for (wp3 wp3Var : xp3Var.m27974L()) {
            aq3 m20645F = bq3.m20645F();
            m20645F.m20222r(wp3Var.m27684G().m23718J());
            m20645F.m20224u(wp3Var.m27686M());
            m20645F.m20223s(wp3Var.m27687N());
            m20645F.m20221q(wp3Var.m27683F());
            m20986F.m28585q((bq3) m20645F.m25898n());
        }
        return (cq3) m20986F.m25898n();
    }

    /* renamed from: b */
    public static void m21703b(xp3 xp3Var) {
        boolean z11;
        int m27973G = xp3Var.m27973G();
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = true;
        for (wp3 wp3Var : xp3Var.m27974L()) {
            if (wp3Var.m27686M() == 3) {
                if (wp3Var.m27685L()) {
                    if (wp3Var.m27687N() != 2) {
                        if (wp3Var.m27686M() != 2) {
                            if (wp3Var.m27683F() == m27973G) {
                                if (!z12) {
                                    z12 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (wp3Var.m27684G().m23719M() != 5) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            z13 &= z11;
                            i11++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(wp3Var.m27683F())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(wp3Var.m27683F())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(wp3Var.m27683F())));
                }
            }
        }
        if (i11 != 0) {
            if (!z12 && !z13) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
