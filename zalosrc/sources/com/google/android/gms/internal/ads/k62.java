package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class k62 extends h62 {

    /* renamed from: a */
    private final vs0 f23159a;

    /* renamed from: b */
    private final f71 f23160b;

    /* renamed from: c */
    private final r82 f23161c;

    /* renamed from: d */
    private final nd1 f23162d;

    public k62(vs0 vs0Var, f71 f71Var, r82 r82Var, nd1 nd1Var) {
        this.f23159a = vs0Var;
        this.f23160b = f71Var;
        this.f23161c = r82Var;
        this.f23162d = nd1Var;
    }

    @Override // com.google.android.gms.internal.ads.h62
    /* renamed from: c */
    protected final tc3 mo21953c(dr2 dr2Var, Bundle bundle) {
        kh1 mo22599k = this.f23159a.mo22599k();
        f71 f71Var = this.f23160b;
        f71Var.m21961f(dr2Var);
        f71Var.m21959d(bundle);
        mo22599k.mo23949g(f71Var.m21962g());
        mo22599k.mo23950i(this.f23162d);
        mo22599k.mo23951k(this.f23161c);
        a51 mo20305a = mo22599k.zzf().mo20305a();
        return mo20305a.m19995h(mo20305a.m19996i());
    }
}
