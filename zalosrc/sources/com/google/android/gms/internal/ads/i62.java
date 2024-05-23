package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class i62 extends h62 {

    /* renamed from: a */
    private final vs0 f22088a;

    /* renamed from: b */
    private final f71 f22089b;

    /* renamed from: c */
    private final r82 f22090c;

    /* renamed from: d */
    private final nd1 f22091d;

    /* renamed from: e */
    private final bi1 f22092e;

    /* renamed from: f */
    private final na1 f22093f;

    /* renamed from: g */
    private final ViewGroup f22094g;

    /* renamed from: h */
    private final vc1 f22095h;

    public i62(vs0 vs0Var, f71 f71Var, r82 r82Var, nd1 nd1Var, bi1 bi1Var, na1 na1Var, ViewGroup viewGroup, vc1 vc1Var) {
        this.f22088a = vs0Var;
        this.f22089b = f71Var;
        this.f22090c = r82Var;
        this.f22091d = nd1Var;
        this.f22092e = bi1Var;
        this.f22093f = na1Var;
        this.f22094g = viewGroup;
        this.f22095h = vc1Var;
    }

    @Override // com.google.android.gms.internal.ads.h62
    /* renamed from: c */
    protected final tc3 mo21953c(dr2 dr2Var, Bundle bundle) {
        o21 mo22597i = this.f22088a.mo22597i();
        f71 f71Var = this.f22089b;
        f71Var.m21961f(dr2Var);
        f71Var.m21959d(bundle);
        mo22597i.mo20258o(f71Var.m21962g());
        mo22597i.mo20255f(this.f22091d);
        mo22597i.mo20256j(this.f22090c);
        mo22597i.mo20253c(this.f22092e);
        mo22597i.mo20257n(new m31(this.f22093f, this.f22095h));
        mo22597i.mo20254d(new o11(this.f22094g));
        a51 mo21156d = mo22597i.zzj().mo21156d();
        return mo21156d.m19995h(mo21156d.m19996i());
    }
}
