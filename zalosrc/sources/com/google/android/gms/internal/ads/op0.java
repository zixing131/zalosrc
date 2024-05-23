package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class op0 extends kp0 {
    public op0(fn0 fn0Var) {
        super(fn0Var);
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: i */
    public final void mo23993i() {
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: s */
    public final boolean mo24003s(String str) {
        String m26104g = rk0.m26104g(str);
        fn0 fn0Var = (fn0) this.f23423r.get();
        if (fn0Var != null && m26104g != null) {
            fn0Var.mo22097q(m26104g, this);
        }
        yk0.zzj("VideoStreamNoopCache is doing nothing.");
        m23994j(str, m26104g, "noop", "Noop cache is a noop.");
        return false;
    }
}
