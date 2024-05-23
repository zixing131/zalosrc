package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class bk3 extends yi3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bk3(ck3 ck3Var, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        jl3 jl3Var = (jl3) zv3Var;
        el3 m22075G = fl3.m22075G();
        m22075G.m21746s(0);
        m22075G.m21744q(mt3.m24726I(ms3.m24706a(jl3Var.m23636F())));
        m22075G.m21745r(jl3Var.m23637J());
        return (fl3) m22075G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return jl3.m23633I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hl3 m23631G = jl3.m23631G();
        m23631G.m22968q(32);
        ll3 m24623G = ml3.m24623G();
        m24623G.m24328q(16);
        m23631G.m22969r((ml3) m24623G.m25898n());
        hashMap.put("AES_CMAC", new xi3((jl3) m23631G.m25898n(), 1));
        hl3 m23631G2 = jl3.m23631G();
        m23631G2.m22968q(32);
        ll3 m24623G2 = ml3.m24623G();
        m24623G2.m24328q(16);
        m23631G2.m22969r((ml3) m24623G2.m25898n());
        hashMap.put("AES256_CMAC", new xi3((jl3) m23631G2.m25898n(), 1));
        hl3 m23631G3 = jl3.m23631G();
        m23631G3.m22968q(32);
        ll3 m24623G3 = ml3.m24623G();
        m24623G3.m24328q(16);
        m23631G3.m22969r((ml3) m24623G3.m25898n());
        hashMap.put("AES256_CMAC_RAW", new xi3((jl3) m23631G3.m25898n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
        jl3 jl3Var = (jl3) zv3Var;
        ck3.m20916m(jl3Var.m23637J());
        ck3.m20917n(jl3Var.m23636F());
    }
}
