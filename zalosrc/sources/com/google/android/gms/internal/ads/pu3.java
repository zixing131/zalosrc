package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class pu3 implements c44, d44 {

    /* renamed from: a */
    private final int f26338a;

    /* renamed from: c */
    private e44 f26340c;

    /* renamed from: d */
    private int f26341d;

    /* renamed from: e */
    private i94 f26342e;

    /* renamed from: f */
    private int f26343f;

    /* renamed from: g */
    private vg4 f26344g;

    /* renamed from: h */
    private C4671k3[] f26345h;

    /* renamed from: i */
    private long f26346i;

    /* renamed from: k */
    private boolean f26348k;

    /* renamed from: l */
    private boolean f26349l;

    /* renamed from: b */
    private final h34 f26339b = new h34();

    /* renamed from: j */
    private long f26347j = Long.MIN_VALUE;

    public pu3(int i11) {
        this.f26338a = i11;
    }

    /* renamed from: q */
    private final void m25545q(long j11, boolean z11) {
        this.f26348k = false;
        this.f26347j = j11;
        mo22074z(j11, z11);
    }

    /* renamed from: A */
    protected abstract void mo22044A();

    /* renamed from: B */
    protected abstract void mo22045B();

    /* renamed from: C */
    protected abstract void mo22046C();

    /* renamed from: D */
    protected abstract void mo23912D(C4671k3[] c4671k3Arr, long j11, long j12);

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: a */
    public final void mo20797a(long j11) {
        m25545q(j11, false);
    }

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: b */
    public final void mo20798b() {
        boolean z11;
        if (this.f26343f == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        this.f26343f = 1;
        mo22046C();
    }

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: e */
    public final boolean mo20801e() {
        return this.f26347j == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: f */
    public final void mo20802f(C4671k3[] c4671k3Arr, vg4 vg4Var, long j11, long j12) {
        v71.m27175f(!this.f26348k);
        this.f26344g = vg4Var;
        if (this.f26347j == Long.MIN_VALUE) {
            this.f26347j = j11;
        }
        this.f26345h = c4671k3Arr;
        this.f26346i = j12;
        mo23912D(c4671k3Arr, j11, j12);
    }

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: i */
    public final boolean mo20803i() {
        return this.f26348k;
    }

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: k */
    public final void mo20804k(int i11, i94 i94Var) {
        this.f26341d = i11;
        this.f26342e = i94Var;
    }

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: l */
    public final void mo20805l(e44 e44Var, C4671k3[] c4671k3Arr, vg4 vg4Var, long j11, boolean z11, boolean z12, long j12, long j13) {
        boolean z13;
        if (this.f26343f == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        v71.m27175f(z13);
        this.f26340c = e44Var;
        this.f26343f = 1;
        mo22072y(z11, z12);
        mo20802f(c4671k3Arr, vg4Var, j12, j13);
        m25545q(j11, z11);
    }

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: n */
    public final int mo20807n() {
        return this.f26343f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean m25546o() {
        if (mo20801e()) {
            return this.f26348k;
        }
        vg4 vg4Var = this.f26344g;
        vg4Var.getClass();
        return vg4Var.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final C4671k3[] m25547p() {
        C4671k3[] c4671k3Arr = this.f26345h;
        c4671k3Arr.getClass();
        return c4671k3Arr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final int m25548r(h34 h34Var, il3 il3Var, int i11) {
        vg4 vg4Var = this.f26344g;
        vg4Var.getClass();
        int mo21714b = vg4Var.mo21714b(h34Var, il3Var, i11);
        if (mo21714b == -4) {
            if (il3Var.m22009g()) {
                this.f26347j = Long.MIN_VALUE;
                if (this.f26348k) {
                    return -4;
                }
                return -3;
            }
            long j11 = il3Var.f22219e + this.f26346i;
            il3Var.f22219e = j11;
            this.f26347j = Math.max(this.f26347j, j11);
        } else if (mo21714b == -5) {
            C4671k3 c4671k3 = h34Var.f21525a;
            c4671k3.getClass();
            long j12 = c4671k3.f23103p;
            if (j12 != Long.MAX_VALUE) {
                C5004t1 m23809b = c4671k3.m23809b();
                m23809b.m26527w(j12 + this.f26346i);
                h34Var.f21525a = m23809b.m26529y();
                return -5;
            }
        }
        return mo21714b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final zzha m25549s(Throwable th2, C4671k3 c4671k3, boolean z11, int i11) {
        int i12;
        if (c4671k3 != null && !this.f26349l) {
            this.f26349l = true;
            try {
                int mo21264g = mo21264g(c4671k3) & 7;
                this.f26349l = false;
                i12 = mo21264g;
            } catch (zzha unused) {
                this.f26349l = false;
            } catch (Throwable th3) {
                this.f26349l = false;
                throw th3;
            }
            return zzha.m28830b(th2, mo20800d(), this.f26341d, c4671k3, i12, z11, i11);
        }
        i12 = 4;
        return zzha.m28830b(th2, mo20800d(), this.f26341d, c4671k3, i12, z11, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final int m25550t(long j11) {
        vg4 vg4Var = this.f26344g;
        vg4Var.getClass();
        return vg4Var.mo21713a(j11 - this.f26346i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final h34 m25551u() {
        h34 h34Var = this.f26339b;
        h34Var.f21526b = null;
        h34Var.f21525a = null;
        return h34Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final e44 m25552v() {
        e44 e44Var = this.f26340c;
        e44Var.getClass();
        return e44Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final i94 m25553w() {
        i94 i94Var = this.f26342e;
        i94Var.getClass();
        return i94Var;
    }

    /* renamed from: x */
    protected abstract void mo22071x();

    /* renamed from: y */
    protected abstract void mo22072y(boolean z11, boolean z12);

    /* renamed from: z */
    protected abstract void mo22074z(long j11, boolean z11);

    @Override // com.google.android.gms.internal.ads.c44
    public final void zzA() {
        boolean z11;
        if (this.f26343f == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        h34 h34Var = this.f26339b;
        h34Var.f21526b = null;
        h34Var.f21525a = null;
        mo22044A();
    }

    @Override // com.google.android.gms.internal.ads.c44
    public final void zzC() {
        this.f26348k = true;
    }

    @Override // com.google.android.gms.internal.ads.c44
    public final void zzE() {
        boolean z11 = true;
        if (this.f26343f != 1) {
            z11 = false;
        }
        v71.m27175f(z11);
        this.f26343f = 2;
        mo22045B();
    }

    @Override // com.google.android.gms.internal.ads.c44, com.google.android.gms.internal.ads.d44
    public final int zzb() {
        return this.f26338a;
    }

    @Override // com.google.android.gms.internal.ads.c44
    public final long zzf() {
        return this.f26347j;
    }

    @Override // com.google.android.gms.internal.ads.c44
    public j34 zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.c44
    public final d44 zzj() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.c44
    public final vg4 zzm() {
        return this.f26344g;
    }

    @Override // com.google.android.gms.internal.ads.c44
    public final void zzn() {
        boolean z11 = true;
        if (this.f26343f != 1) {
            z11 = false;
        }
        v71.m27175f(z11);
        h34 h34Var = this.f26339b;
        h34Var.f21526b = null;
        h34Var.f21525a = null;
        this.f26343f = 0;
        this.f26344g = null;
        this.f26345h = null;
        this.f26348k = false;
        mo22071x();
    }

    @Override // com.google.android.gms.internal.ads.c44
    public final void zzr() {
        vg4 vg4Var = this.f26344g;
        vg4Var.getClass();
        vg4Var.zzd();
    }
}
