package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class sf4 implements ef4, df4 {

    /* renamed from: p */
    private final ef4 f27665p;

    /* renamed from: q */
    private final long f27666q;

    /* renamed from: r */
    private df4 f27667r;

    public sf4(ef4 ef4Var, long j11) {
        this.f27665p = ef4Var;
        this.f27666q = j11;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: a */
    public final boolean mo21704a(long j11) {
        return this.f27665p.mo21704a(j11 - this.f27666q);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: b */
    public final long mo21705b(ui4[] ui4VarArr, boolean[] zArr, vg4[] vg4VarArr, boolean[] zArr2, long j11) {
        vg4[] vg4VarArr2 = new vg4[vg4VarArr.length];
        int i11 = 0;
        while (true) {
            vg4 vg4Var = null;
            if (i11 >= vg4VarArr.length) {
                break;
            }
            tf4 tf4Var = (tf4) vg4VarArr[i11];
            if (tf4Var != null) {
                vg4Var = tf4Var.m26610c();
            }
            vg4VarArr2[i11] = vg4Var;
            i11++;
        }
        long mo21705b = this.f27665p.mo21705b(ui4VarArr, zArr, vg4VarArr2, zArr2, j11 - this.f27666q);
        for (int i12 = 0; i12 < vg4VarArr.length; i12++) {
            vg4 vg4Var2 = vg4VarArr2[i12];
            if (vg4Var2 == null) {
                vg4VarArr[i12] = null;
            } else {
                vg4 vg4Var3 = vg4VarArr[i12];
                if (vg4Var3 == null || ((tf4) vg4Var3).m26610c() != vg4Var2) {
                    vg4VarArr[i12] = new tf4(vg4Var2, this.f27666q);
                }
            }
        }
        return mo21705b + this.f27666q;
    }

    @Override // com.google.android.gms.internal.ads.xg4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo21937c(yg4 yg4Var) {
        df4 df4Var = this.f27667r;
        df4Var.getClass();
        df4Var.mo21937c(this);
    }

    @Override // com.google.android.gms.internal.ads.df4
    /* renamed from: d */
    public final void mo21382d(ef4 ef4Var) {
        df4 df4Var = this.f27667r;
        df4Var.getClass();
        df4Var.mo21382d(this);
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: g */
    public final void mo21706g(long j11) {
        this.f27665p.mo21706g(j11 - this.f27666q);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: j */
    public final long mo21707j(long j11) {
        return this.f27665p.mo21707j(j11 - this.f27666q) + this.f27666q;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: k */
    public final long mo21708k(long j11, f44 f44Var) {
        return this.f27665p.mo21708k(j11 - this.f27666q, f44Var) + this.f27666q;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: l */
    public final void mo21709l(long j11, boolean z11) {
        this.f27665p.mo21709l(j11 - this.f27666q, false);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: n */
    public final void mo21710n(df4 df4Var, long j11) {
        this.f27667r = df4Var;
        this.f27665p.mo21710n(this, j11 - this.f27666q);
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzb() {
        long zzb = this.f27665p.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.f27666q;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzc() {
        long zzc = this.f27665p.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.f27666q;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final long zzd() {
        long zzd = this.f27665p.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.f27666q;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final dh4 zzh() {
        return this.f27665p.zzh();
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final void zzk() {
        this.f27665p.zzk();
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final boolean zzp() {
        return this.f27665p.zzp();
    }
}
