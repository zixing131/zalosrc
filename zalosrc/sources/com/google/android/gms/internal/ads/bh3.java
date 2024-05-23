package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class bh3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ ch3 f17750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh3(ch3 ch3Var, Class cls) {
        super(cls);
        this.f17750b = ch3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        zm3 m20187G = an3.m20187G();
        m20187G.m28550q(mt3.m24726I(ms3.m24706a(((dn3) zv3Var).m21511F())));
        m20187G.m28551r(0);
        return (an3) m20187G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return dn3.m21509I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        cn3 m21507G = dn3.m21507G();
        m21507G.m20960q(64);
        hashMap.put("AES256_SIV", new xi3((dn3) m21507G.m25898n(), 1));
        cn3 m21507G2 = dn3.m21507G();
        m21507G2.m20960q(64);
        hashMap.put("AES256_SIV_RAW", new xi3((dn3) m21507G2.m25898n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
        dn3 dn3Var = (dn3) zv3Var;
        if (dn3Var.m21511F() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + dn3Var.m21511F() + ". Valid keys must have 64 bytes.");
    }
}
