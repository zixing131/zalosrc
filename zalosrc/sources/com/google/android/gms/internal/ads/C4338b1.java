package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b1 */
/* loaded from: classes2.dex */
final class C4338b1 extends xm4 {

    /* renamed from: b */
    private final long f17506b;

    public C4338b1(km4 km4Var, long j11) {
        super(km4Var);
        boolean z11;
        if (km4Var.zzf() >= j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        this.f17506b = j11;
    }

    @Override // com.google.android.gms.internal.ads.xm4, com.google.android.gms.internal.ads.km4
    public final long zzd() {
        return super.zzd() - this.f17506b;
    }

    @Override // com.google.android.gms.internal.ads.xm4, com.google.android.gms.internal.ads.km4
    public final long zze() {
        return super.zze() - this.f17506b;
    }

    @Override // com.google.android.gms.internal.ads.xm4, com.google.android.gms.internal.ads.km4
    public final long zzf() {
        return super.zzf() - this.f17506b;
    }
}
