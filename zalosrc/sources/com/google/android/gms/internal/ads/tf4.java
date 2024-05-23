package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class tf4 implements vg4 {

    /* renamed from: a */
    private final vg4 f28311a;

    /* renamed from: b */
    private final long f28312b;

    public tf4(vg4 vg4Var, long j11) {
        this.f28311a = vg4Var;
        this.f28312b = j11;
    }

    @Override // com.google.android.gms.internal.ads.vg4
    /* renamed from: a */
    public final int mo21713a(long j11) {
        return this.f28311a.mo21713a(j11 - this.f28312b);
    }

    @Override // com.google.android.gms.internal.ads.vg4
    /* renamed from: b */
    public final int mo21714b(h34 h34Var, il3 il3Var, int i11) {
        int mo21714b = this.f28311a.mo21714b(h34Var, il3Var, i11);
        if (mo21714b == -4) {
            il3Var.f22219e = Math.max(0L, il3Var.f22219e + this.f28312b);
            return -4;
        }
        return mo21714b;
    }

    /* renamed from: c */
    public final vg4 m26610c() {
        return this.f28311a;
    }

    @Override // com.google.android.gms.internal.ads.vg4
    public final void zzd() {
        this.f28311a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.vg4
    public final boolean zze() {
        return this.f28311a.zze();
    }
}
