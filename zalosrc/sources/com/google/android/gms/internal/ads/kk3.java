package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class kk3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ lk3 f23362b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk3(lk3 lk3Var, Class cls) {
        super(cls);
        this.f23362b = lk3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        po3 po3Var = (po3) zv3Var;
        ko3 m24654G = mo3.m24654G();
        m24654G.m23987s(0);
        m24654G.m23986r(po3Var.m25501K());
        m24654G.m23985q(mt3.m24726I(ms3.m24706a(po3Var.m25500F())));
        return (mo3) m24654G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return po3.m25497J(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", lk3.m24324m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", lk3.m24324m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", lk3.m24324m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", lk3.m24324m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", lk3.m24324m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", lk3.m24324m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", lk3.m24324m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", lk3.m24324m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", lk3.m24324m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", lk3.m24324m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
        po3 po3Var = (po3) zv3Var;
        if (po3Var.m25500F() >= 16) {
            lk3.m24325n(po3Var.m25501K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
