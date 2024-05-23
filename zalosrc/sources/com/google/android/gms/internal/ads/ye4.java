package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ye4 implements ef4, df4 {

    /* renamed from: p */
    public final gf4 f30915p;

    /* renamed from: q */
    private final long f30916q;

    /* renamed from: r */
    private if4 f30917r;

    /* renamed from: s */
    private ef4 f30918s;

    /* renamed from: t */
    private df4 f30919t;

    /* renamed from: u */
    private long f30920u = -9223372036854775807L;

    /* renamed from: v */
    private final jj4 f30921v;

    public ye4(gf4 gf4Var, jj4 jj4Var, long j11, byte[] bArr) {
        this.f30915p = gf4Var;
        this.f30921v = jj4Var;
        this.f30916q = j11;
    }

    /* renamed from: p */
    private final long m28192p(long j11) {
        long j12 = this.f30920u;
        return j12 != -9223372036854775807L ? j12 : j11;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: a */
    public final boolean mo21704a(long j11) {
        ef4 ef4Var = this.f30918s;
        if (ef4Var != null && ef4Var.mo21704a(j11)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: b */
    public final long mo21705b(ui4[] ui4VarArr, boolean[] zArr, vg4[] vg4VarArr, boolean[] zArr2, long j11) {
        long j12;
        long j13 = this.f30920u;
        if (j13 != -9223372036854775807L && j11 == this.f30916q) {
            this.f30920u = -9223372036854775807L;
            j12 = j13;
        } else {
            j12 = j11;
        }
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        return ef4Var.mo21705b(ui4VarArr, zArr, vg4VarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.xg4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo21937c(yg4 yg4Var) {
        df4 df4Var = this.f30919t;
        int i11 = g92.f20474a;
        df4Var.mo21937c(this);
    }

    @Override // com.google.android.gms.internal.ads.df4
    /* renamed from: d */
    public final void mo21382d(ef4 ef4Var) {
        df4 df4Var = this.f30919t;
        int i11 = g92.f20474a;
        df4Var.mo21382d(this);
    }

    /* renamed from: e */
    public final long m28193e() {
        return this.f30920u;
    }

    /* renamed from: f */
    public final long m28194f() {
        return this.f30916q;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: g */
    public final void mo21706g(long j11) {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        ef4Var.mo21706g(j11);
    }

    /* renamed from: h */
    public final void m28195h(gf4 gf4Var) {
        long m28192p = m28192p(this.f30916q);
        if4 if4Var = this.f30917r;
        if4Var.getClass();
        ef4 mo20508j = if4Var.mo20508j(gf4Var, this.f30921v, m28192p);
        this.f30918s = mo20508j;
        if (this.f30919t != null) {
            mo20508j.mo21710n(this, m28192p);
        }
    }

    /* renamed from: i */
    public final void m28196i(long j11) {
        this.f30920u = j11;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: j */
    public final long mo21707j(long j11) {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        return ef4Var.mo21707j(j11);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: k */
    public final long mo21708k(long j11, f44 f44Var) {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        return ef4Var.mo21708k(j11, f44Var);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: l */
    public final void mo21709l(long j11, boolean z11) {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        ef4Var.mo21709l(j11, false);
    }

    /* renamed from: m */
    public final void m28197m() {
        ef4 ef4Var = this.f30918s;
        if (ef4Var != null) {
            if4 if4Var = this.f30917r;
            if4Var.getClass();
            if4Var.mo20506d(ef4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: n */
    public final void mo21710n(df4 df4Var, long j11) {
        this.f30919t = df4Var;
        ef4 ef4Var = this.f30918s;
        if (ef4Var != null) {
            ef4Var.mo21710n(this, m28192p(this.f30916q));
        }
    }

    /* renamed from: o */
    public final void m28198o(if4 if4Var) {
        boolean z11;
        if (this.f30917r == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        this.f30917r = if4Var;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzb() {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        return ef4Var.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzc() {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        return ef4Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final long zzd() {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        return ef4Var.zzd();
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final dh4 zzh() {
        ef4 ef4Var = this.f30918s;
        int i11 = g92.f20474a;
        return ef4Var.zzh();
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final void zzk() {
        ef4 ef4Var = this.f30918s;
        if (ef4Var != null) {
            ef4Var.zzk();
            return;
        }
        if4 if4Var = this.f30917r;
        if (if4Var != null) {
            if4Var.mo20507g();
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final boolean zzp() {
        ef4 ef4Var = this.f30918s;
        if (ef4Var != null && ef4Var.zzp()) {
            return true;
        }
        return false;
    }
}
