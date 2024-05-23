package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class uf3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ vf3 f28847b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf3(vf3 vf3Var, Class cls) {
        super(cls);
        this.f28847b = vf3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        nm3 m25216G = om3.m25216G();
        m25216G.m24961q(mt3.m24726I(ms3.m24706a(((rm3) zv3Var).m26134F())));
        m25216G.m24962r(0);
        return (om3) m25216G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return rm3.m26132I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", vf3.m27217k(16, 1));
        hashMap.put("AES128_GCM_RAW", vf3.m27217k(16, 3));
        hashMap.put("AES256_GCM", vf3.m27217k(32, 1));
        hashMap.put("AES256_GCM_RAW", vf3.m27217k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* synthetic */ void mo20117d(zv3 zv3Var) {
        os3.m25255a(((rm3) zv3Var).m26134F());
    }
}
