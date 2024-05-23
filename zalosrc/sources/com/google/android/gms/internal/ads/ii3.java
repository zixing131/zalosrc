package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ii3 extends oj3 {
    public ii3() {
        super(dp3.class, gp3.class, new fi3(wd3.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* bridge */ /* synthetic */ xi3 m23269k(int i11, int i12, int i13, int i14) {
        zo3 m20211F = ap3.m20211F();
        m20211F.m28580s(i11);
        m20211F.m28579r(i12);
        m20211F.m28578q(i13);
        ap3 ap3Var = (ap3) m20211F.m25898n();
        wo3 m27961F = xo3.m27961F();
        m27961F.m27671q(ap3Var);
        return new xi3((xo3) m27961F.m25898n(), i14);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new gi3(this, xo3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return dp3.m21523I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        dp3 dp3Var = (dp3) zv3Var;
        if (!dp3Var.m21529K().m24737j()) {
            if (dp3Var.m21530O()) {
                os3.m25256b(dp3Var.m21527F(), 0);
                li3.m24297a(dp3Var.m21528J().m22506G());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 4;
    }
}
