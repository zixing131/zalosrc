package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class ch3 extends zi3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ch3() {
        super(an3.class, new ah3(vd3.class));
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new bh3(this, dn3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return an3.m20189I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        an3 an3Var = (an3) zv3Var;
        os3.m25256b(an3Var.m20192F(), 0);
        if (an3Var.m20193J().mo22168p() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + an3Var.m20193J().mo22168p() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 3;
    }
}
