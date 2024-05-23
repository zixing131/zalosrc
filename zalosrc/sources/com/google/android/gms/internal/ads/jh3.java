package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class jh3 extends oj3 {

    /* renamed from: e */
    private static final byte[] f22823e = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public jh3() {
        super(yn3.class, bo3.class, new hh3(wd3.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* bridge */ /* synthetic */ xi3 m23615l(int i11, int i12, int i13, ie3 ie3Var, byte[] bArr, int i14) {
        rn3 m26370F = sn3.m26370F();
        do3 m21768F = eo3.m21768F();
        int i15 = 4;
        m21768F.m21517r(4);
        m21768F.m21518s(5);
        m21768F.m21516q(mt3.m24726I(bArr));
        eo3 eo3Var = (eo3) m21768F.m25898n();
        op3 m25504F = pp3.m25504F();
        m25504F.m25242q(ie3Var.m23236b());
        m25504F.m25243r(mt3.m24726I(ie3Var.m23237c()));
        int m23238d = ie3Var.m23238d() - 1;
        if (m23238d != 0) {
            if (m23238d != 1) {
                if (m23238d != 2) {
                    i15 = 6;
                } else {
                    i15 = 5;
                }
            }
        } else {
            i15 = 3;
        }
        m25504F.m25244s(i15);
        pp3 pp3Var = (pp3) m25504F.m25898n();
        on3 m25489F = pn3.m25489F();
        m25489F.m25223q(pp3Var);
        pn3 pn3Var = (pn3) m25489F.m25898n();
        un3 m27314G = vn3.m27314G();
        m27314G.m27014r(eo3Var);
        m27314G.m27013q(pn3Var);
        m27314G.m27015s(i13);
        m26370F.m26145q((vn3) m27314G.m25898n());
        return new xi3((sn3) m26370F.m25898n(), i14);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new ih3(this, sn3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return yn3.m28276I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        yn3 yn3Var = (yn3) zv3Var;
        if (!yn3Var.m28282K().m24737j()) {
            os3.m25256b(yn3Var.m28280F(), 0);
            sh3.m26307a(yn3Var.m28281J().m20635G());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 4;
    }
}
