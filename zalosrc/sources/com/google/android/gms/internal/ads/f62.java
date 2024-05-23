package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class f62 extends h62 {

    /* renamed from: a */
    private final vs0 f20040a;

    /* renamed from: b */
    private final bi1 f20041b;

    /* renamed from: c */
    private final f71 f20042c;

    /* renamed from: d */
    private final nd1 f20043d;

    public f62(vs0 vs0Var, bi1 bi1Var, f71 f71Var, nd1 nd1Var) {
        this.f20040a = vs0Var;
        this.f20041b = bi1Var;
        this.f20042c = f71Var;
        this.f20043d = nd1Var;
    }

    @Override // com.google.android.gms.internal.ads.h62
    /* renamed from: c */
    protected final tc3 mo21953c(dr2 dr2Var, Bundle bundle) {
        gi1 mo22600l = this.f20040a.mo22600l();
        f71 f71Var = this.f20042c;
        f71Var.m21961f(dr2Var);
        f71Var.m21959d(bundle);
        mo22600l.mo20240e(f71Var.m21962g());
        mo22600l.mo20241h(this.f20043d);
        mo22600l.mo20238c(this.f20041b);
        mo22600l.mo20239d(new o11(null));
        a51 mo21060a = mo22600l.zzg().mo21060a();
        return mo21060a.m19995h(mo21060a.m19996i());
    }
}
