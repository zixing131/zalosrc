package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class ag3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ bg3 f17029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag3(bg3 bg3Var, Class cls) {
        super(cls);
        this.f17029b = bg3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        fn3 m22486G = gn3.m22486G();
        m22486G.m22102r(0);
        m22486G.m22101q(mt3.m24726I(ms3.m24706a(32)));
        return (gn3) m22486G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return jn3.m23664H(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new xi3(jn3.m23663G(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new xi3(jn3.m23663G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
    }
}
