package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q34 implements qf4, ec4 {

    /* renamed from: a */
    private final s34 f26617a;

    /* renamed from: b */
    private pf4 f26618b;

    /* renamed from: c */
    private dc4 f26619c;

    /* renamed from: d */
    final /* synthetic */ u34 f26620d;

    public q34(u34 u34Var, s34 s34Var) {
        pf4 pf4Var;
        dc4 dc4Var;
        this.f26620d = u34Var;
        pf4Var = u34Var.f28740f;
        this.f26618b = pf4Var;
        dc4Var = u34Var.f28741g;
        this.f26619c = dc4Var;
        this.f26617a = s34Var;
    }

    /* renamed from: h */
    private final boolean m25652h(int i11, gf4 gf4Var) {
        pf4 pf4Var;
        dc4 dc4Var;
        gf4 gf4Var2 = null;
        if (gf4Var != null) {
            s34 s34Var = this.f26617a;
            int i12 = 0;
            while (true) {
                if (i12 >= s34Var.f27517c.size()) {
                    break;
                }
                if (((gf4) s34Var.f27517c.get(i12)).f20366d == gf4Var.f20366d) {
                    gf4Var2 = gf4Var.m22434c(Pair.create(s34Var.f27516b, gf4Var.f20363a));
                    break;
                }
                i12++;
            }
            if (gf4Var2 == null) {
                return false;
            }
        }
        int i13 = i11 + this.f26617a.f27518d;
        pf4 pf4Var2 = this.f26618b;
        if (pf4Var2.f26205a != i13 || !g92.m22362t(pf4Var2.f26206b, gf4Var2)) {
            pf4Var = this.f26620d.f28740f;
            this.f26618b = pf4Var.m25441a(i13, gf4Var2, 0L);
        }
        dc4 dc4Var2 = this.f26619c;
        if (dc4Var2.f19175a != i13 || !g92.m22362t(dc4Var2.f19176b, gf4Var2)) {
            dc4Var = this.f26620d.f28741g;
            this.f26619c = dc4Var.m21345a(i13, gf4Var2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: C */
    public final void mo24555C(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var) {
        if (m25652h(i11, gf4Var)) {
            this.f26618b.m25447g(we4Var, cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: G */
    public final void mo24556G(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var) {
        if (m25652h(i11, gf4Var)) {
            this.f26618b.m25451k(we4Var, cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: H */
    public final void mo24557H(int i11, gf4 gf4Var, cf4 cf4Var) {
        if (m25652h(i11, gf4Var)) {
            this.f26618b.m25443c(cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: L */
    public final void mo24558L(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var) {
        if (m25652h(i11, gf4Var)) {
            this.f26618b.m25445e(we4Var, cf4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: z */
    public final void mo24559z(int i11, gf4 gf4Var, we4 we4Var, cf4 cf4Var, IOException iOException, boolean z11) {
        if (m25652h(i11, gf4Var)) {
            this.f26618b.m25449i(we4Var, cf4Var, iOException, z11);
        }
    }
}
