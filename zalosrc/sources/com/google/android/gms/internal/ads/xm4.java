package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class xm4 implements km4 {

    /* renamed from: a */
    private final km4 f30542a;

    public xm4(km4 km4Var) {
        this.f30542a = km4Var;
    }

    @Override // com.google.android.gms.internal.ads.km4, com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        return this.f30542a.mo19942a(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: b */
    public final void mo23960b(int i11) {
        ((yl4) this.f30542a).m28247k(i11, false);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: c */
    public final int mo23961c(int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: e */
    public final boolean mo23962e(byte[] bArr, int i11, int i12, boolean z11) {
        return this.f30542a.mo23962e(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: f */
    public final boolean mo23963f(byte[] bArr, int i11, int i12, boolean z11) {
        return this.f30542a.mo23963f(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: h */
    public final int mo23964h(byte[] bArr, int i11, int i12) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: i */
    public final void mo23965i(byte[] bArr, int i11, int i12) {
        ((yl4) this.f30542a).mo23962e(bArr, i11, i12, false);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: j */
    public final void mo23966j(byte[] bArr, int i11, int i12) {
        ((yl4) this.f30542a).mo23963f(bArr, i11, i12, false);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: n */
    public final void mo23967n(int i11) {
        ((yl4) this.f30542a).m28248l(i11, false);
    }

    @Override // com.google.android.gms.internal.ads.km4
    public long zzd() {
        return this.f30542a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.km4
    public long zze() {
        return this.f30542a.zze();
    }

    @Override // com.google.android.gms.internal.ads.km4
    public long zzf() {
        return this.f30542a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.km4
    public final void zzj() {
        this.f30542a.zzj();
    }
}
