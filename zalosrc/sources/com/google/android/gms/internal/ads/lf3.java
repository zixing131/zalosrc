package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class lf3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ mf3 f23905b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf3(mf3 mf3Var, Class cls) {
        super(cls);
        this.f23905b = mf3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        sl3 sl3Var = (sl3) zv3Var;
        new pf3();
        vl3 m25176g = of3.m25176g(sl3Var.m26356I());
        zv3 mo20114a = new lk3().mo20513a().mo20114a(sl3Var.m26357J());
        ol3 m25479G = pl3.m25479G();
        m25479G.m25208q(m25176g);
        m25479G.m25209r((mo3) mo20114a);
        m25479G.m25210s(0);
        return (pl3) m25479G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return sl3.m26353H(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", mf3.m24561k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", mf3.m24561k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", mf3.m24561k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", mf3.m24561k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
        sl3 sl3Var = (sl3) zv3Var;
        ((of3) new pf3().mo20513a()).mo20117d(sl3Var.m26356I());
        new lk3().mo20513a().mo20117d(sl3Var.m26357J());
        os3.m25255a(sl3Var.m26356I().m28239F());
    }
}
