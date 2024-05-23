package com.google.android.gms.internal.ads;

import p665y0.C30239a;

/* loaded from: classes2.dex */
public final class tl1 implements q81 {

    /* renamed from: p */
    private final vj1 f28425p;

    /* renamed from: q */
    private final ak1 f28426q;

    public tl1(vj1 vj1Var, ak1 ak1Var) {
        this.f28425p = vj1Var;
        this.f28426q = ak1Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        vj1 vj1Var = this.f28425p;
        if (vj1Var.m27262c0() == null) {
            return;
        }
        zq0 m27256Y = vj1Var.m27256Y();
        zq0 m27257Z = vj1Var.m27257Z();
        if (m27256Y == null) {
            if (m27257Z == null) {
                m27256Y = null;
            } else {
                m27256Y = m27257Z;
            }
        }
        if (this.f28426q.mo20164d() && m27256Y != null) {
            m27256Y.mo23552V("onSdkImpression", new C30239a());
        }
    }
}
