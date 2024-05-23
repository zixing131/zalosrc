package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class lg3 extends zi3 {
    public lg3() {
        super(xq3.class, new jg3(pd3.class));
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new kg3(this, ar3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return xq3.m27980I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        xq3 xq3Var = (xq3) zv3Var;
        os3.m25256b(xq3Var.m27983F(), 0);
        if (xq3Var.m27984J().mo22168p() == 32) {
        } else {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 3;
    }
}
