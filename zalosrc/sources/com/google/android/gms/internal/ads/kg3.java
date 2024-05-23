package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class kg3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ lg3 f23314b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg3(lg3 lg3Var, Class cls) {
        super(cls);
        this.f23314b = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        wq3 m27978G = xq3.m27978G();
        m27978G.m27694r(0);
        m27978G.m27693q(mt3.m24726I(ms3.m24706a(32)));
        return (xq3) m27978G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return ar3.m20229H(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new xi3(ar3.m20228G(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new xi3(ar3.m20228G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
    }
}
