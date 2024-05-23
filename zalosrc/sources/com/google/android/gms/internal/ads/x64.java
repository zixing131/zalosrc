package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class x64 implements r44 {

    /* renamed from: a */
    private final w81 f30368a;

    /* renamed from: b */
    private final ho0 f30369b;

    /* renamed from: c */
    private final jq0 f30370c;

    /* renamed from: d */
    private final w64 f30371d;

    /* renamed from: e */
    private final SparseArray f30372e;

    /* renamed from: f */
    private jo1 f30373f;

    /* renamed from: g */
    private jk0 f30374g;

    /* renamed from: h */
    private di1 f30375h;

    /* renamed from: i */
    private boolean f30376i;

    public x64(w81 w81Var) {
        w81Var.getClass();
        this.f30368a = w81Var;
        this.f30373f = new jo1(g92.m22341e(), w81Var, new hm1() { // from class: com.google.android.gms.internal.ads.b54
            @Override // com.google.android.gms.internal.ads.hm1
            /* renamed from: a */
            public final void mo20402a(Object obj, C4336b c4336b) {
            }
        });
        ho0 ho0Var = new ho0();
        this.f30369b = ho0Var;
        this.f30370c = new jq0();
        this.f30371d = new w64(ho0Var);
        this.f30372e = new SparseArray();
    }

    /* renamed from: Z */
    public static /* synthetic */ void m27845Z(x64 x64Var) {
        final s44 m27851X = x64Var.m27851X();
        x64Var.m27854b0(m27851X, 1028, new gl1() { // from class: com.google.android.gms.internal.ads.s54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
        x64Var.f30373f.m23693e();
    }

    /* renamed from: c0 */
    private final s44 m27846c0(gf4 gf4Var) {
        mr0 m27555a;
        this.f30374g.getClass();
        if (gf4Var == null) {
            m27555a = null;
        } else {
            m27555a = this.f30371d.m27555a(gf4Var);
        }
        if (gf4Var != null && m27555a != null) {
            return m27852Y(m27555a, m27555a.mo23650n(gf4Var.f20363a, this.f30369b).f21855c, gf4Var);
        }
        int zzf = this.f30374g.zzf();
        mr0 zzn = this.f30374g.zzn();
        if (zzf >= zzn.mo20107c()) {
            zzn = mr0.f24725a;
        }
        return m27852Y(zzn, zzf, null);
    }

    /* renamed from: d0 */
    private final s44 m27847d0(int i11, gf4 gf4Var) {
        jk0 jk0Var = this.f30374g;
        jk0Var.getClass();
        if (gf4Var != null) {
            if (this.f30371d.m27555a(gf4Var) != null) {
                return m27846c0(gf4Var);
            }
            return m27852Y(mr0.f24725a, i11, gf4Var);
        }
        mr0 zzn = jk0Var.zzn();
        if (i11 >= zzn.mo20107c()) {
            zzn = mr0.f24725a;
        }
        return m27852Y(zzn, i11, null);
    }

    /* renamed from: e0 */
    private final s44 m27848e0() {
        return m27846c0(this.f30371d.m27558d());
    }

    /* renamed from: f0 */
    private final s44 m27849f0() {
        return m27846c0(this.f30371d.m27559e());
    }

    /* renamed from: g0 */
    private final s44 m27850g0(zzbw zzbwVar) {
        g10 g10Var;
        if ((zzbwVar instanceof zzha) && (g10Var = ((zzha) zzbwVar).f32144x) != null) {
            return m27846c0(new gf4(g10Var));
        }
        return m27851X();
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: A */
    public final void mo25958A(final long j11) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1010, new gl1(j11) { // from class: com.google.android.gms.internal.ads.n64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: B */
    public final void mo25959B(final C4671k3 c4671k3, final lw3 lw3Var) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1009, new gl1() { // from class: com.google.android.gms.internal.ads.k64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21305f(s44.this, c4671k3, lw3Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: C */
    public final void mo24555C(int i11, gf4 gf4Var, final we4 we4Var, final cf4 cf4Var) {
        final s44 m27847d0 = m27847d0(i11, gf4Var);
        m27854b0(m27847d0, 1001, new gl1() { // from class: com.google.android.gms.internal.ads.h64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: D */
    public final void mo23247D(final int i11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 4, new gl1() { // from class: com.google.android.gms.internal.ads.f64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21315y(s44.this, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: E */
    public final void mo25960E(final int i11, final long j11) {
        final s44 m27848e0 = m27848e0();
        m27854b0(m27848e0, 1018, new gl1() { // from class: com.google.android.gms.internal.ads.u54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21313v(s44.this, i11, j11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: F */
    public final void mo23248F(final kc0 kc0Var) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 12, new gl1() { // from class: com.google.android.gms.internal.ads.a54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: G */
    public final void mo24556G(int i11, gf4 gf4Var, final we4 we4Var, final cf4 cf4Var) {
        final s44 m27847d0 = m27847d0(i11, gf4Var);
        m27854b0(m27847d0, 1000, new gl1() { // from class: com.google.android.gms.internal.ads.a64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: H */
    public final void mo24557H(int i11, gf4 gf4Var, final cf4 cf4Var) {
        final s44 m27847d0 = m27847d0(i11, gf4Var);
        m27854b0(m27847d0, 1004, new gl1() { // from class: com.google.android.gms.internal.ads.e54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21302c(s44.this, cf4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: I */
    public final void mo23249I(final boolean z11, final int i11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 5, new gl1(z11, i11) { // from class: com.google.android.gms.internal.ads.b64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: J */
    public final void mo23250J(final zzbw zzbwVar) {
        final s44 m27850g0 = m27850g0(zzbwVar);
        m27854b0(m27850g0, 10, new gl1() { // from class: com.google.android.gms.internal.ads.i64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: K */
    public final void mo25961K(final lv3 lv3Var) {
        final s44 m27848e0 = m27848e0();
        m27854b0(m27848e0, 1020, new gl1() { // from class: com.google.android.gms.internal.ads.q64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21311s(s44.this, lv3Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: L */
    public final void mo24558L(int i11, gf4 gf4Var, final we4 we4Var, final cf4 cf4Var) {
        final s44 m27847d0 = m27847d0(i11, gf4Var);
        m27854b0(m27847d0, ZAbstractBase.ZVU_BLEND_PERCENTAGE, new gl1() { // from class: com.google.android.gms.internal.ads.w54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: M */
    public final void mo23251M(final C4330au c4330au, final int i11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 1, new gl1(c4330au, i11) { // from class: com.google.android.gms.internal.ads.g64

            /* renamed from: b */
            public final /* synthetic */ C4330au f20438b;

            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: N */
    public final void mo23252N(final vf4 vf4Var) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 29, new gl1() { // from class: com.google.android.gms.internal.ads.l54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: O */
    public final void mo23253O(final zzbw zzbwVar) {
        final s44 m27850g0 = m27850g0(zzbwVar);
        m27854b0(m27850g0, 10, new gl1() { // from class: com.google.android.gms.internal.ads.x54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21312t(s44.this, zzbwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: P */
    public final void mo23254P(final jg0 jg0Var) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 13, new gl1() { // from class: com.google.android.gms.internal.ads.k54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: Q */
    public final void mo23255Q(final boolean z11, final int i11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, -1, new gl1(z11, i11) { // from class: com.google.android.gms.internal.ads.v44
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: R */
    public final void mo25962R(final int i11, final long j11, final long j12) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1011, new gl1(i11, j11, j12) { // from class: com.google.android.gms.internal.ads.y44
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: S */
    public final void mo23256S(mr0 mr0Var, final int i11) {
        w64 w64Var = this.f30371d;
        jk0 jk0Var = this.f30374g;
        jk0Var.getClass();
        w64Var.m27562i(jk0Var);
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 0, new gl1(i11) { // from class: com.google.android.gms.internal.ads.t54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hj4
    /* renamed from: T */
    public final void mo22924T(final int i11, final long j11, final long j12) {
        final s44 m27846c0 = m27846c0(this.f30371d.m27557c());
        m27854b0(m27846c0, 1006, new gl1() { // from class: com.google.android.gms.internal.ads.g54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21306h(s44.this, i11, j11, j12);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: U */
    public final void mo25963U(final jk0 jk0Var, Looper looper) {
        c83 c83Var;
        boolean z11 = true;
        if (this.f30374g != null) {
            c83Var = this.f30371d.f29835b;
            if (!c83Var.isEmpty()) {
                z11 = false;
            }
        }
        v71.m27175f(z11);
        jk0Var.getClass();
        this.f30374g = jk0Var;
        this.f30375h = this.f30368a.mo27578a(looper, null);
        this.f30373f = this.f30373f.m23689a(looper, new hm1() { // from class: com.google.android.gms.internal.ads.p54
            @Override // com.google.android.gms.internal.ads.hm1
            /* renamed from: a */
            public final void mo20402a(Object obj, C4336b c4336b) {
                x64.this.m27853a0(jk0Var, (u44) obj, c4336b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: V */
    public final void mo25964V(final Object obj, final long j11) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 26, new gl1() { // from class: com.google.android.gms.internal.ads.r64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj2) {
                ((u44) obj2).mo21309l(s44.this, obj, j11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: W */
    public final void mo25965W(u44 u44Var) {
        this.f30373f.m23690b(u44Var);
    }

    /* renamed from: X */
    protected final s44 m27851X() {
        return m27846c0(this.f30371d.m27556b());
    }

    /* renamed from: Y */
    protected final s44 m27852Y(mr0 mr0Var, int i11, gf4 gf4Var) {
        gf4 gf4Var2;
        boolean z11 = true;
        if (true == mr0Var.m24700o()) {
            gf4Var2 = null;
        } else {
            gf4Var2 = gf4Var;
        }
        long zza = this.f30368a.zza();
        if (!mr0Var.equals(this.f30374g.zzn()) || i11 != this.f30374g.zzf()) {
            z11 = false;
        }
        long j11 = 0;
        if (gf4Var2 != null && gf4Var2.m22262b()) {
            if (z11 && this.f30374g.zzd() == gf4Var2.f20364b && this.f30374g.zze() == gf4Var2.f20365c) {
                j11 = this.f30374g.zzl();
            }
        } else if (z11) {
            j11 = this.f30374g.zzk();
        } else if (!mr0Var.m24700o()) {
            long j12 = mr0Var.mo20109e(i11, this.f30370c, 0L).f22940k;
            j11 = g92.m22352j0(0L);
        }
        return new s44(zza, mr0Var, i11, gf4Var2, j11, this.f30374g.zzn(), this.f30374g.zzf(), this.f30371d.m27556b(), this.f30374g.zzl(), this.f30374g.zzm());
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: a */
    public final void mo25966a(final lv3 lv3Var) {
        final s44 m27848e0 = m27848e0();
        m27854b0(m27848e0, 1013, new gl1() { // from class: com.google.android.gms.internal.ads.l64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final /* synthetic */ void m27853a0(jk0 jk0Var, u44 u44Var, C4336b c4336b) {
        u44Var.mo21300a(jk0Var, new t44(c4336b, this.f30372e));
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: b */
    public final void mo25967b(final Exception exc) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1030, new gl1() { // from class: com.google.android.gms.internal.ads.f54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    /* renamed from: b0 */
    protected final void m27854b0(s44 s44Var, int i11, gl1 gl1Var) {
        this.f30372e.put(i11, s44Var);
        jo1 jo1Var = this.f30373f;
        jo1Var.m23692d(i11, gl1Var);
        jo1Var.m23691c();
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: c */
    public final void mo25968c(final String str, final long j11, final long j12) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1016, new gl1(str, j12, j11) { // from class: com.google.android.gms.internal.ads.q54

            /* renamed from: b */
            public final /* synthetic */ String f26652b;

            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: d */
    public final void mo25969d(final C4671k3 c4671k3, final lw3 lw3Var) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1017, new gl1() { // from class: com.google.android.gms.internal.ads.w44
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21308k(s44.this, c4671k3, lw3Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: e */
    public final void mo25970e(u44 u44Var) {
        this.f30373f.m23694f(u44Var);
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: f */
    public final void mo25971f(final String str) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1019, new gl1() { // from class: com.google.android.gms.internal.ads.x44
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: g */
    public final void mo25972g(final lv3 lv3Var) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1007, new gl1() { // from class: com.google.android.gms.internal.ads.z54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: h */
    public final void mo23257h(final boolean z11) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 23, new gl1(z11) { // from class: com.google.android.gms.internal.ads.d64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: i */
    public final void mo25973i(final long j11, final int i11) {
        final s44 m27848e0 = m27848e0();
        m27854b0(m27848e0, 1021, new gl1(j11, i11) { // from class: com.google.android.gms.internal.ads.i54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: j */
    public final void mo25974j(List list, gf4 gf4Var) {
        w64 w64Var = this.f30371d;
        jk0 jk0Var = this.f30374g;
        jk0Var.getClass();
        w64Var.m27561h(list, gf4Var, jk0Var);
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: k */
    public final void mo25975k(final Exception exc) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1014, new gl1() { // from class: com.google.android.gms.internal.ads.h54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: l */
    public final void mo25976l(final Exception exc) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1029, new gl1() { // from class: com.google.android.gms.internal.ads.n54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: m */
    public final void mo25977m(final lv3 lv3Var) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1015, new gl1() { // from class: com.google.android.gms.internal.ads.v54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: n */
    public final void mo23258n(final int i11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 6, new gl1(i11) { // from class: com.google.android.gms.internal.ads.t64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: o */
    public final void mo25978o(final String str, final long j11, final long j12) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1008, new gl1(str, j12, j11) { // from class: com.google.android.gms.internal.ads.y54

            /* renamed from: b */
            public final /* synthetic */ String f30812b;

            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    /* renamed from: p */
    public final void mo25979p() {
        di1 di1Var = this.f30375h;
        v71.m27171b(di1Var);
        di1Var.mo20005e(new Runnable() { // from class: com.google.android.gms.internal.ads.m64
            @Override // java.lang.Runnable
            public final void run() {
                x64.m27845Z(x64.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: q */
    public final void mo23259q(final boolean z11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 7, new gl1(z11) { // from class: com.google.android.gms.internal.ads.c64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: r */
    public final void mo23260r(final int i11, final int i12) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 24, new gl1(i11, i12) { // from class: com.google.android.gms.internal.ads.s64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: s */
    public final void mo23261s(final s41 s41Var) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 25, new gl1() { // from class: com.google.android.gms.internal.ads.p64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                s44 s44Var = s44.this;
                s41 s41Var2 = s41Var;
                ((u44) obj).mo21310q(s44Var, s41Var2);
                int i11 = s41Var2.f27529a;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: t */
    public final void mo23262t(final q21 q21Var) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 2, new gl1() { // from class: com.google.android.gms.internal.ads.m54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: u */
    public final void mo23263u(final boolean z11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 3, new gl1(z11) { // from class: com.google.android.gms.internal.ads.u64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: v */
    public final void mo23264v(final float f11) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 22, new gl1(f11) { // from class: com.google.android.gms.internal.ads.z44
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: w */
    public final void mo23265w(final f00 f00Var) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 14, new gl1() { // from class: com.google.android.gms.internal.ads.j64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: x */
    public final void mo23266x(final jj0 jj0Var, final jj0 jj0Var2, final int i11) {
        if (i11 == 1) {
            this.f30376i = false;
            i11 = 1;
        }
        w64 w64Var = this.f30371d;
        jk0 jk0Var = this.f30374g;
        jk0Var.getClass();
        w64Var.m27560g(jk0Var);
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 11, new gl1() { // from class: com.google.android.gms.internal.ads.j54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                u44 u44Var = (u44) obj;
                u44Var.mo21307j(s44.this, jj0Var, jj0Var2, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    /* renamed from: y */
    public final void mo23267y(final int i11, final boolean z11) {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, 30, new gl1(i11, z11) { // from class: com.google.android.gms.internal.ads.o54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qf4
    /* renamed from: z */
    public final void mo24559z(int i11, gf4 gf4Var, final we4 we4Var, final cf4 cf4Var, final IOException iOException, final boolean z11) {
        final s44 m27847d0 = m27847d0(i11, gf4Var);
        m27854b0(m27847d0, ZAbstractBase.ZVU_BLEND_GEN_THUMB, new gl1() { // from class: com.google.android.gms.internal.ads.r54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((u44) obj).mo21314w(s44.this, we4Var, cf4Var, iOException, z11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    public final void zzA(final String str) {
        final s44 m27849f0 = m27849f0();
        m27854b0(m27849f0, 1012, new gl1() { // from class: com.google.android.gms.internal.ads.v64
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ih0
    public final void zzp() {
        final s44 m27851X = m27851X();
        m27854b0(m27851X, -1, new gl1() { // from class: com.google.android.gms.internal.ads.c54
            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r44
    public final void zzx() {
        if (!this.f30376i) {
            final s44 m27851X = m27851X();
            this.f30376i = true;
            m27854b0(m27851X, -1, new gl1() { // from class: com.google.android.gms.internal.ads.o64
                @Override // com.google.android.gms.internal.ads.gl1
                public final void zza(Object obj) {
                }
            });
        }
    }
}
