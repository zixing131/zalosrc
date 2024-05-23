package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class rf4 implements ui4 {

    /* renamed from: a */
    private final ui4 f27202a;

    /* renamed from: b */
    private final jt0 f27203b;

    public rf4(ui4 ui4Var, jt0 jt0Var) {
        this.f27202a = ui4Var;
        this.f27203b = jt0Var;
    }

    @Override // com.google.android.gms.internal.ads.yi4
    /* renamed from: a */
    public final int mo23616a(int i11) {
        return this.f27202a.mo23616a(0);
    }

    @Override // com.google.android.gms.internal.ads.yi4
    /* renamed from: c */
    public final C4671k3 mo23617c(int i11) {
        return this.f27202a.mo23617c(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf4)) {
            return false;
        }
        rf4 rf4Var = (rf4) obj;
        if (this.f27202a.equals(rf4Var.f27202a) && this.f27203b.equals(rf4Var.f27203b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f27203b.hashCode() + 527) * 31) + this.f27202a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final int zzb(int i11) {
        return this.f27202a.zzb(i11);
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final int zzc() {
        return this.f27202a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final jt0 zze() {
        return this.f27203b;
    }
}
