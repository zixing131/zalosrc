package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class rf3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ sf3 f27201b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf3(sf3 sf3Var, Class cls) {
        super(cls);
        this.f27201b = sf3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        hm3 hm3Var = (hm3) zv3Var;
        dm3 m21751G = em3.m21751G();
        m21751G.m21491q(mt3.m24726I(ms3.m24706a(hm3Var.m22975F())));
        m21751G.m21492r(hm3Var.m22976J());
        m21751G.m21493s(0);
        return (em3) m21751G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return hm3.m22972I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", sf3.m26297k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", sf3.m26297k(16, 16, 3));
        hashMap.put("AES256_EAX", sf3.m26297k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", sf3.m26297k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
        hm3 hm3Var = (hm3) zv3Var;
        os3.m25255a(hm3Var.m22975F());
        if (hm3Var.m22976J().m24336F() != 12 && hm3Var.m22976J().m24336F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
