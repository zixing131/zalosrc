package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class sa3 implements Runnable {

    /* renamed from: p */
    final ma3 f27605p;

    /* renamed from: q */
    final tc3 f27606q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sa3(ma3 ma3Var, tc3 tc3Var) {
        this.f27605p = ma3Var;
        this.f27606q = tc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object m24511i;
        na3 na3Var;
        obj = this.f27605p.f24455p;
        if (obj == this) {
            m24511i = ma3.m24511i(this.f27606q);
            na3Var = ma3.f24453u;
            if (na3Var.mo24880f(this.f27605p, this, m24511i)) {
                ma3.m24507B(this.f27605p);
            }
        }
    }
}
