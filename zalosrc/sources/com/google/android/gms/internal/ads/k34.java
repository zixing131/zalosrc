package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k34 {

    /* renamed from: a */
    public final ef4 f23125a;

    /* renamed from: b */
    public final Object f23126b;

    /* renamed from: c */
    public final vg4[] f23127c;

    /* renamed from: d */
    public boolean f23128d;

    /* renamed from: e */
    public boolean f23129e;

    /* renamed from: f */
    public l34 f23130f;

    /* renamed from: g */
    public boolean f23131g;

    /* renamed from: h */
    private final boolean[] f23132h;

    /* renamed from: i */
    private final d44[] f23133i;

    /* renamed from: j */
    private final aj4 f23134j;

    /* renamed from: k */
    private final u34 f23135k;

    /* renamed from: l */
    private k34 f23136l;

    /* renamed from: m */
    private dh4 f23137m;

    /* renamed from: n */
    private bj4 f23138n;

    /* renamed from: o */
    private long f23139o;

    public k34(d44[] d44VarArr, long j11, aj4 aj4Var, jj4 jj4Var, u34 u34Var, l34 l34Var, bj4 bj4Var, byte[] bArr) {
        this.f23133i = d44VarArr;
        this.f23139o = j11;
        this.f23134j = aj4Var;
        this.f23135k = u34Var;
        gf4 gf4Var = l34Var.f23712a;
        this.f23126b = gf4Var.f20363a;
        this.f23130f = l34Var;
        this.f23137m = dh4.f19249d;
        this.f23138n = bj4Var;
        this.f23127c = new vg4[2];
        this.f23132h = new boolean[2];
        long j12 = l34Var.f23713b;
        long j13 = l34Var.f23715d;
        ef4 m26857n = u34Var.m26857n(gf4Var, jj4Var, j12);
        this.f23125a = j13 != -9223372036854775807L ? new ke4(m26857n, true, 0L, j13) : m26857n;
    }

    /* renamed from: s */
    private final void m23812s() {
        if (m23814u()) {
            int i11 = 0;
            while (true) {
                bj4 bj4Var = this.f23138n;
                if (i11 < bj4Var.f17771a) {
                    bj4Var.m20532b(i11);
                    ui4 ui4Var = this.f23138n.f17773c[i11];
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private final void m23813t() {
        if (m23814u()) {
            int i11 = 0;
            while (true) {
                bj4 bj4Var = this.f23138n;
                if (i11 < bj4Var.f17771a) {
                    bj4Var.m20532b(i11);
                    ui4 ui4Var = this.f23138n.f17773c[i11];
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final boolean m23814u() {
        return this.f23136l == null;
    }

    /* renamed from: a */
    public final long m23815a(bj4 bj4Var, long j11, boolean z11) {
        return m23816b(bj4Var, j11, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long m23816b(bj4 bj4Var, long j11, boolean z11, boolean[] zArr) {
        boolean z12;
        int i11 = 0;
        while (true) {
            boolean z13 = true;
            if (i11 >= bj4Var.f17771a) {
                break;
            }
            boolean[] zArr2 = this.f23132h;
            if (z11 || !bj4Var.m20531a(this.f23138n, i11)) {
                z13 = false;
            }
            zArr2[i11] = z13;
            i11++;
        }
        int i12 = 0;
        while (true) {
            d44[] d44VarArr = this.f23133i;
            if (i12 >= 2) {
                break;
            }
            d44VarArr[i12].zzb();
            i12++;
        }
        m23812s();
        this.f23138n = bj4Var;
        m23813t();
        long mo21705b = this.f23125a.mo21705b(bj4Var.f17773c, this.f23132h, this.f23127c, zArr, j11);
        int i13 = 0;
        while (true) {
            d44[] d44VarArr2 = this.f23133i;
            if (i13 >= 2) {
                break;
            }
            d44VarArr2[i13].zzb();
            i13++;
        }
        this.f23129e = false;
        int i14 = 0;
        while (true) {
            vg4[] vg4VarArr = this.f23127c;
            if (i14 < 2) {
                if (vg4VarArr[i14] != null) {
                    v71.m27175f(bj4Var.m20532b(i14));
                    this.f23133i[i14].zzb();
                    this.f23129e = true;
                } else {
                    if (bj4Var.f17773c[i14] == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    v71.m27175f(z12);
                }
                i14++;
            } else {
                return mo21705b;
            }
        }
    }

    /* renamed from: c */
    public final long m23817c() {
        long j11;
        if (!this.f23128d) {
            return this.f23130f.f23713b;
        }
        if (this.f23129e) {
            j11 = this.f23125a.zzb();
        } else {
            j11 = Long.MIN_VALUE;
        }
        if (j11 == Long.MIN_VALUE) {
            return this.f23130f.f23716e;
        }
        return j11;
    }

    /* renamed from: d */
    public final long m23818d() {
        if (!this.f23128d) {
            return 0L;
        }
        return this.f23125a.zzc();
    }

    /* renamed from: e */
    public final long m23819e() {
        return this.f23139o;
    }

    /* renamed from: f */
    public final long m23820f() {
        return this.f23130f.f23713b + this.f23139o;
    }

    /* renamed from: g */
    public final k34 m23821g() {
        return this.f23136l;
    }

    /* renamed from: h */
    public final dh4 m23822h() {
        return this.f23137m;
    }

    /* renamed from: i */
    public final bj4 m23823i() {
        return this.f23138n;
    }

    /* renamed from: j */
    public final bj4 m23824j(float f11, mr0 mr0Var) {
        bj4 mo20140d = this.f23134j.mo20140d(this.f23133i, this.f23137m, this.f23130f.f23712a, mr0Var);
        for (ui4 ui4Var : mo20140d.f17773c) {
        }
        return mo20140d;
    }

    /* renamed from: k */
    public final void m23825k(long j11) {
        v71.m27175f(m23814u());
        this.f23125a.mo21704a(j11 - this.f23139o);
    }

    /* renamed from: l */
    public final void m23826l(float f11, mr0 mr0Var) {
        this.f23128d = true;
        this.f23137m = this.f23125a.zzh();
        bj4 m23824j = m23824j(f11, mr0Var);
        l34 l34Var = this.f23130f;
        long j11 = l34Var.f23713b;
        long j12 = l34Var.f23716e;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long m23815a = m23815a(m23824j, j11, false);
        long j13 = this.f23139o;
        l34 l34Var2 = this.f23130f;
        this.f23139o = j13 + (l34Var2.f23713b - m23815a);
        this.f23130f = l34Var2.m24111b(m23815a);
    }

    /* renamed from: m */
    public final void m23827m(long j11) {
        v71.m27175f(m23814u());
        if (this.f23128d) {
            this.f23125a.mo21706g(j11 - this.f23139o);
        }
    }

    /* renamed from: n */
    public final void m23828n() {
        m23812s();
        u34 u34Var = this.f23135k;
        ef4 ef4Var = this.f23125a;
        try {
            if (ef4Var instanceof ke4) {
                u34Var.m26851h(((ke4) ef4Var).f23297p);
            } else {
                u34Var.m26851h(ef4Var);
            }
        } catch (RuntimeException e11) {
            lr1.m24354c("MediaPeriodHolder", "Period release failed.", e11);
        }
    }

    /* renamed from: o */
    public final void m23829o(k34 k34Var) {
        if (k34Var == this.f23136l) {
            return;
        }
        m23812s();
        this.f23136l = k34Var;
        m23813t();
    }

    /* renamed from: p */
    public final void m23830p(long j11) {
        this.f23139o = 1000000000000L;
    }

    /* renamed from: q */
    public final void m23831q() {
        ef4 ef4Var = this.f23125a;
        if (ef4Var instanceof ke4) {
            long j11 = this.f23130f.f23715d;
            if (j11 == -9223372036854775807L) {
                j11 = Long.MIN_VALUE;
            }
            ((ke4) ef4Var).m23934e(0L, j11);
        }
    }

    /* renamed from: r */
    public final boolean m23832r() {
        if (!this.f23128d) {
            return false;
        }
        if (this.f23129e && this.f23125a.zzb() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }
}
