package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class je4 implements vg4 {

    /* renamed from: a */
    public final vg4 f22794a;

    /* renamed from: b */
    private boolean f22795b;

    /* renamed from: c */
    final /* synthetic */ ke4 f22796c;

    public je4(ke4 ke4Var, vg4 vg4Var) {
        this.f22796c = ke4Var;
        this.f22794a = vg4Var;
    }

    @Override // com.google.android.gms.internal.ads.vg4
    /* renamed from: a */
    public final int mo21713a(long j11) {
        if (this.f22796c.m23935f()) {
            return -3;
        }
        return this.f22794a.mo21713a(j11);
    }

    @Override // com.google.android.gms.internal.ads.vg4
    /* renamed from: b */
    public final int mo21714b(h34 h34Var, il3 il3Var, int i11) {
        if (this.f22796c.m23935f()) {
            return -3;
        }
        if (this.f22795b) {
            il3Var.m22005c(4);
            return -4;
        }
        int mo21714b = this.f22794a.mo21714b(h34Var, il3Var, i11);
        if (mo21714b == -5) {
            C4671k3 c4671k3 = h34Var.f21525a;
            c4671k3.getClass();
            int i12 = c4671k3.f23083B;
            int i13 = 0;
            if (i12 == 0) {
                if (c4671k3.f23084C != 0) {
                    i12 = 0;
                }
                return -5;
            }
            if (this.f22796c.f23301t == Long.MIN_VALUE) {
                i13 = c4671k3.f23084C;
            }
            C5004t1 m23809b = c4671k3.m23809b();
            m23809b.m26501c(i12);
            m23809b.m26503d(i13);
            h34Var.f21525a = m23809b.m26529y();
            return -5;
        }
        ke4 ke4Var = this.f22796c;
        long j11 = ke4Var.f23301t;
        if (j11 != Long.MIN_VALUE && ((mo21714b == -4 && il3Var.f22219e >= j11) || (mo21714b == -3 && ke4Var.zzb() == Long.MIN_VALUE && !il3Var.f22218d))) {
            il3Var.mo20090b();
            il3Var.m22005c(4);
            this.f22795b = true;
            return -4;
        }
        return mo21714b;
    }

    /* renamed from: c */
    public final void m23609c() {
        this.f22795b = false;
    }

    @Override // com.google.android.gms.internal.ads.vg4
    public final void zzd() {
        this.f22794a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.vg4
    public final boolean zze() {
        if (!this.f22796c.m23935f() && this.f22794a.zze()) {
            return true;
        }
        return false;
    }
}
