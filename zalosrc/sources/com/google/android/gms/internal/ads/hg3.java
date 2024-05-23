package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class hg3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ ig3 f21669b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg3(ig3 ig3Var, Class cls) {
        super(cls);
        this.f21669b = ig3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        kq3 m24344G = lq3.m24344G();
        m24344G.m24020q((pq3) zv3Var);
        m24344G.m24021r(0);
        return (lq3) m24344G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return pq3.m25526H(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20117d(zv3 zv3Var) {
        pq3 pq3Var = (pq3) zv3Var;
        if (!pq3Var.m25527I().isEmpty() && pq3Var.m25528J()) {
        } else {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
