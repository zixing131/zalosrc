package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class me4 implements qf4, ec4 {

    /* renamed from: a */
    private final Object f24493a;

    /* renamed from: b */
    private pf4 f24494b;

    /* renamed from: c */
    private dc4 f24495c;

    /* renamed from: d */
    final /* synthetic */ oe4 f24496d;

    public me4(oe4 oe4Var, Object obj) {
        this.f24496d = oe4Var;
        this.f24494b = oe4Var.m22810r(null);
        this.f24495c = oe4Var.m22808p(null);
        this.f24493a = obj;
    }

    /* renamed from: h */
    private final boolean m24554h(int i11, gf4 gf4Var) {
        gf4 gf4Var2;
        if (gf4Var != null) {
            gf4Var2 = this.f24496d.mo20511z(this.f24493a, gf4Var);
            if (gf4Var2 == null) {
                return false;
            }
        } else {
            gf4Var2 = null;
        }
        pf4 pf4Var = this.f24494b;
        if (pf4Var.f26205a != i11 || !g92.m22362t(pf4Var.f26206b, gf4Var2)) {
            this.f24494b = this.f24496d.m22811s(i11, gf4Var2, 0L);
        }
        dc4 dc4Var = this.f24495c;
        if (dc4Var.f19175a != i11 || !g92.m22362t(dc4Var.f19176b, gf4Var2)) {
            this.f24495c = this.f24496d.m22809q(i11, gf4Var2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: C */
    public final void mo24555C(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var) {
        if (m24554h(i11, gf4Var)) {
            this.f24494b.m25447g(we4Var, cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: G */
    public final void mo24556G(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var) {
        if (m24554h(i11, gf4Var)) {
            this.f24494b.m25451k(we4Var, cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: H */
    public final void mo24557H(int i11, gf4 gf4Var, cf4 cf4Var) {
        if (m24554h(i11, gf4Var)) {
            this.f24494b.m25443c(cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: L */
    public final void mo24558L(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var) {
        if (m24554h(i11, gf4Var)) {
            this.f24494b.m25445e(we4Var, cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: z */
    public final void mo24559z(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var, IOException iOException, boolean z11) {
        if (m24554h(i11, gf4Var)) {
            this.f24494b.m25449i(we4Var, cf4Var, iOException, z11);
        }
    }
}
