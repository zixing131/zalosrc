package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class wb3 extends jb3 {

    /* renamed from: E */
    private vb3 f29875E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wb3(x73 x73Var, boolean z11, Executor executor, Callable callable) {
        super(x73Var, z11, false);
        this.f29875E = new ub3(this, callable, executor);
        m23590R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static /* synthetic */ vb3 m27587V(wb3 wb3Var, vb3 vb3Var) {
        wb3Var.f29875E = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jb3
    /* renamed from: P */
    final void mo23588P(int i11, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.jb3
    /* renamed from: Q */
    final void mo23589Q() {
        vb3 vb3Var = this.f29875E;
        if (vb3Var != null) {
            vb3Var.m27200i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.jb3
    /* renamed from: U */
    public final void mo23593U(int i11) {
        super.mo23593U(i11);
        if (i11 == 1) {
            this.f29875E = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: t */
    protected final void mo24525t() {
        vb3 vb3Var = this.f29875E;
        if (vb3Var != null) {
            vb3Var.m26271g();
        }
    }
}
