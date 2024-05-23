package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class pe4 implements yg4 {

    /* renamed from: p */
    protected final yg4[] f26190p;

    public pe4(yg4[] yg4VarArr) {
        this.f26190p = yg4VarArr;
    }

    @Override // com.google.android.gms.internal.ads.yg4
    /* renamed from: a */
    public final boolean mo21704a(long j11) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z11 = false;
            for (yg4 yg4Var : this.f26190p) {
                long zzc2 = yg4Var.zzc();
                if (zzc2 != Long.MIN_VALUE && zzc2 <= j11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (zzc2 == zzc || z12) {
                    z11 |= yg4Var.mo21704a(j11);
                }
            }
            z13 |= z11;
        } while (z11);
        return z13;
    }

    @Override // com.google.android.gms.internal.ads.yg4
    /* renamed from: g */
    public final void mo21706g(long j11) {
        for (yg4 yg4Var : this.f26190p) {
            yg4Var.mo21706g(j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg4
    public final long zzb() {
        long j11 = Long.MAX_VALUE;
        for (yg4 yg4Var : this.f26190p) {
            long zzb = yg4Var.zzb();
            if (zzb != Long.MIN_VALUE) {
                j11 = Math.min(j11, zzb);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.yg4
    public final long zzc() {
        long j11 = Long.MAX_VALUE;
        for (yg4 yg4Var : this.f26190p) {
            long zzc = yg4Var.zzc();
            if (zzc != Long.MIN_VALUE) {
                j11 = Math.min(j11, zzc);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.yg4
    public final boolean zzp() {
        for (yg4 yg4Var : this.f26190p) {
            if (yg4Var.zzp()) {
                return true;
            }
        }
        return false;
    }
}
