package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class xf3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ yf3 f30441b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf3(yf3 yf3Var, Class cls) {
        super(cls);
        this.f30441b = yf3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        tm3 m27005G = um3.m27005G();
        m27005G.m26628q(mt3.m24726I(ms3.m24706a(((xm3) zv3Var).m27941F())));
        m27005G.m26629r(0);
        return (um3) m27005G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return xm3.m27939I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", yf3.m28200l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", yf3.m28200l(16, 3));
        hashMap.put("AES256_GCM_SIV", yf3.m28200l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", yf3.m28200l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* synthetic */ void mo20117d(zv3 zv3Var) {
        os3.m25255a(((xm3) zv3Var).m27941F());
    }
}
