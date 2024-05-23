package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class m62 extends h62 {

    /* renamed from: a */
    private final vs0 f24410a;

    /* renamed from: b */
    private final f71 f24411b;

    /* renamed from: c */
    private final nd1 f24412c;

    public m62(vs0 vs0Var, f71 f71Var, nd1 nd1Var) {
        this.f24410a = vs0Var;
        this.f24411b = f71Var;
        this.f24412c = nd1Var;
    }

    @Override // com.google.android.gms.internal.ads.h62
    /* renamed from: c */
    protected final tc3 mo21953c(dr2 dr2Var, Bundle bundle) {
        rp1 mo22601m = this.f24410a.mo22601m();
        f71 f71Var = this.f24411b;
        f71Var.m21961f(dr2Var);
        f71Var.m21959d(bundle);
        mo22601m.mo25027a(f71Var.m21962g());
        mo22601m.mo25028b(this.f24412c);
        a51 zzb = mo22601m.zze().zzb();
        return zzb.m19995h(zzb.m19996i());
    }
}
