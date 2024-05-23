package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class sf3 extends zi3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public sf3() {
        super(em3.class, new qf3(pd3.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* bridge */ /* synthetic */ xi3 m26297k(int i11, int i12, int i13) {
        gm3 m22970G = hm3.m22970G();
        m22970G.m22475q(i11);
        km3 m24332G = lm3.m24332G();
        m24332G.m23959q(16);
        m22970G.m22476r((lm3) m24332G.m25898n());
        return new xi3((hm3) m22970G.m25898n(), i13);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new rf3(this, hm3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return em3.m21753I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        em3 em3Var = (em3) zv3Var;
        os3.m25256b(em3Var.m21757F(), 0);
        os3.m25255a(em3Var.m21759K().mo22168p());
        if (em3Var.m21758J().m24336F() != 12 && em3Var.m21758J().m24336F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 3;
    }
}
