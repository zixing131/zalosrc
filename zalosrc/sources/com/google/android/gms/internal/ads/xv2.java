package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class xv2 implements rv2 {

    /* renamed from: a */
    private final cw2 f30640a;

    /* renamed from: b */
    private final zv2 f30641b;

    /* renamed from: c */
    private final ov2 f30642c;

    public xv2(ov2 ov2Var, cw2 cw2Var, zv2 zv2Var, byte[] bArr) {
        this.f30642c = ov2Var;
        this.f30640a = cw2Var;
        this.f30641b = zv2Var;
    }

    @Override // com.google.android.gms.internal.ads.rv2
    /* renamed from: a */
    public final void mo22194a(qv2 qv2Var) {
        this.f30642c.m25335b(mo22195b(qv2Var));
    }

    @Override // com.google.android.gms.internal.ads.rv2
    /* renamed from: b */
    public final String mo22195b(qv2 qv2Var) {
        cw2 cw2Var = this.f30640a;
        Map m25914j = qv2Var.m25914j();
        this.f30641b.m28645a(m25914j);
        return cw2Var.m21185a(m25914j);
    }
}
