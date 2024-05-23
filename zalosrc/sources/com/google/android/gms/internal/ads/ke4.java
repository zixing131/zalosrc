package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ke4 implements ef4, df4 {

    /* renamed from: p */
    public final ef4 f23297p;

    /* renamed from: q */
    private df4 f23298q;

    /* renamed from: r */
    private je4[] f23299r = new je4[0];

    /* renamed from: s */
    private long f23300s = 0;

    /* renamed from: t */
    long f23301t;

    public ke4(ef4 ef4Var, boolean z11, long j11, long j12) {
        this.f23297p = ef4Var;
        this.f23301t = j12;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: a */
    public final boolean mo21704a(long j11) {
        return this.f23297p.mo21704a(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:            if (r4 > r7) goto L24;     */
    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo21705b(ui4[] ui4VarArr, boolean[] zArr, vg4[] vg4VarArr, boolean[] zArr2, long j11) {
        long j12;
        int length = vg4VarArr.length;
        this.f23299r = new je4[length];
        vg4[] vg4VarArr2 = new vg4[length];
        int i11 = 0;
        while (true) {
            vg4 vg4Var = null;
            if (i11 >= vg4VarArr.length) {
                break;
            }
            je4[] je4VarArr = this.f23299r;
            je4 je4Var = (je4) vg4VarArr[i11];
            je4VarArr[i11] = je4Var;
            if (je4Var != null) {
                vg4Var = je4Var.f22794a;
            }
            vg4VarArr2[i11] = vg4Var;
            i11++;
        }
        long mo21705b = this.f23297p.mo21705b(ui4VarArr, zArr, vg4VarArr2, zArr2, j11);
        if (m23935f() && j11 == 0) {
            j12 = 0;
        } else {
            j12 = j11;
        }
        this.f23300s = -9223372036854775807L;
        boolean z11 = true;
        if (mo21705b != j12) {
            if (mo21705b >= 0) {
                long j13 = this.f23301t;
                if (j13 != Long.MIN_VALUE) {
                }
            }
            z11 = false;
        }
        v71.m27175f(z11);
        for (int i12 = 0; i12 < vg4VarArr.length; i12++) {
            vg4 vg4Var2 = vg4VarArr2[i12];
            if (vg4Var2 == null) {
                this.f23299r[i12] = null;
            } else {
                je4[] je4VarArr2 = this.f23299r;
                je4 je4Var2 = je4VarArr2[i12];
                if (je4Var2 == null || je4Var2.f22794a != vg4Var2) {
                    je4VarArr2[i12] = new je4(this, vg4Var2);
                }
            }
            vg4VarArr[i12] = this.f23299r[i12];
        }
        return mo21705b;
    }

    @Override // com.google.android.gms.internal.ads.xg4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo21937c(yg4 yg4Var) {
        df4 df4Var = this.f23298q;
        df4Var.getClass();
        df4Var.mo21937c(this);
    }

    @Override // com.google.android.gms.internal.ads.df4
    /* renamed from: d */
    public final void mo21382d(ef4 ef4Var) {
        df4 df4Var = this.f23298q;
        df4Var.getClass();
        df4Var.mo21382d(this);
    }

    /* renamed from: e */
    public final void m23934e(long j11, long j12) {
        this.f23301t = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean m23935f() {
        return this.f23300s != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: g */
    public final void mo21706g(long j11) {
        this.f23297p.mo21706g(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:            if (r0 > r8) goto L17;     */
    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo21707j(long j11) {
        this.f23300s = -9223372036854775807L;
        boolean z11 = false;
        for (je4 je4Var : this.f23299r) {
            if (je4Var != null) {
                je4Var.m23609c();
            }
        }
        long mo21707j = this.f23297p.mo21707j(j11);
        if (mo21707j != j11) {
            if (mo21707j >= 0) {
                long j12 = this.f23301t;
                if (j12 != Long.MIN_VALUE) {
                }
            }
            v71.m27175f(z11);
            return mo21707j;
        }
        z11 = true;
        v71.m27175f(z11);
        return mo21707j;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: k */
    public final long mo21708k(long j11, f44 f44Var) {
        long j12;
        if (j11 == 0) {
            return 0L;
        }
        long m22336b0 = g92.m22336b0(f44Var.f20009a, 0L, j11);
        long j13 = f44Var.f20010b;
        long j14 = this.f23301t;
        if (j14 == Long.MIN_VALUE) {
            j12 = Long.MAX_VALUE;
        } else {
            j12 = j14 - j11;
        }
        long m22336b02 = g92.m22336b0(j13, 0L, j12);
        if (m22336b0 != f44Var.f20009a || m22336b02 != f44Var.f20010b) {
            f44Var = new f44(m22336b0, m22336b02);
        }
        return this.f23297p.mo21708k(j11, f44Var);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: l */
    public final void mo21709l(long j11, boolean z11) {
        this.f23297p.mo21709l(j11, false);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: n */
    public final void mo21710n(df4 df4Var, long j11) {
        this.f23298q = df4Var;
        this.f23297p.mo21710n(this, j11);
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzb() {
        long zzb = this.f23297p.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j11 = this.f23301t;
            if (j11 == Long.MIN_VALUE || zzb < j11) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzc() {
        long zzc = this.f23297p.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j11 = this.f23301t;
            if (j11 == Long.MIN_VALUE || zzc < j11) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final long zzd() {
        boolean z11;
        if (m23935f()) {
            long j11 = this.f23300s;
            this.f23300s = -9223372036854775807L;
            long zzd = zzd();
            if (zzd != -9223372036854775807L) {
                return zzd;
            }
            return j11;
        }
        long zzd2 = this.f23297p.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z12 = false;
        if (zzd2 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        long j12 = this.f23301t;
        if (j12 == Long.MIN_VALUE || zzd2 <= j12) {
            z12 = true;
        }
        v71.m27175f(z12);
        return zzd2;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final dh4 zzh() {
        return this.f23297p.zzh();
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final void zzk() {
        this.f23297p.zzk();
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final boolean zzp() {
        return this.f23297p.zzp();
    }
}
