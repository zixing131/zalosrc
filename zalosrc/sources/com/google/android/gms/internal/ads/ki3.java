package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ki3 extends zi3 {
    public ki3() {
        super(gp3.class, new ji3(xd3.class));
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return gp3.m22501K(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        gp3 gp3Var = (gp3) zv3Var;
        os3.m25256b(gp3Var.m22505F(), 0);
        if (gp3Var.m22508P()) {
            li3.m24297a(gp3Var.m22506G());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 5;
    }
}
