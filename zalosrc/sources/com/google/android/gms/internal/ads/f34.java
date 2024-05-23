package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p664y.AbstractC30228a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f34 implements Handler.Callback, df4, zi4, t34, a04, w34 {

    /* renamed from: A */
    private final ho0 f19951A;

    /* renamed from: B */
    private final long f19952B;

    /* renamed from: C */
    private final z04 f19953C;

    /* renamed from: D */
    private final ArrayList f19954D;

    /* renamed from: E */
    private final w81 f19955E;

    /* renamed from: F */
    private final n34 f19956F;

    /* renamed from: G */
    private final u34 f19957G;

    /* renamed from: H */
    private final long f19958H;

    /* renamed from: I */
    private f44 f19959I;

    /* renamed from: J */
    private v34 f19960J;

    /* renamed from: K */
    private d34 f19961K;

    /* renamed from: L */
    private boolean f19962L;

    /* renamed from: N */
    private boolean f19964N;

    /* renamed from: O */
    private boolean f19965O;

    /* renamed from: P */
    private boolean f19966P;

    /* renamed from: S */
    private boolean f19969S;

    /* renamed from: T */
    private boolean f19970T;

    /* renamed from: U */
    private boolean f19971U;

    /* renamed from: V */
    private int f19972V;

    /* renamed from: W */
    private e34 f19973W;

    /* renamed from: X */
    private long f19974X;

    /* renamed from: Y */
    private int f19975Y;

    /* renamed from: Z */
    private boolean f19976Z;

    /* renamed from: a0 */
    private zzha f19977a0;

    /* renamed from: c0 */
    private final x14 f19979c0;

    /* renamed from: d0 */
    private final yx3 f19980d0;

    /* renamed from: p */
    private final c44[] f19981p;

    /* renamed from: q */
    private final Set f19982q;

    /* renamed from: r */
    private final d44[] f19983r;

    /* renamed from: s */
    private final aj4 f19984s;

    /* renamed from: t */
    private final bj4 f19985t;

    /* renamed from: u */
    private final i34 f19986u;

    /* renamed from: v */
    private final ij4 f19987v;

    /* renamed from: w */
    private final di1 f19988w;

    /* renamed from: x */
    private final HandlerThread f19989x;

    /* renamed from: y */
    private final Looper f19990y;

    /* renamed from: z */
    private final jq0 f19991z;

    /* renamed from: Q */
    private int f19967Q = 0;

    /* renamed from: R */
    private boolean f19968R = false;

    /* renamed from: M */
    private boolean f19963M = false;

    /* renamed from: b0 */
    private long f19978b0 = -9223372036854775807L;

    public f34(c44[] c44VarArr, aj4 aj4Var, bj4 bj4Var, i34 i34Var, ij4 ij4Var, int i11, boolean z11, r44 r44Var, f44 f44Var, yx3 yx3Var, long j11, boolean z12, Looper looper, w81 w81Var, x14 x14Var, i94 i94Var, byte[] bArr) {
        this.f19979c0 = x14Var;
        this.f19981p = c44VarArr;
        this.f19984s = aj4Var;
        this.f19985t = bj4Var;
        this.f19986u = i34Var;
        this.f19987v = ij4Var;
        this.f19959I = f44Var;
        this.f19980d0 = yx3Var;
        this.f19958H = j11;
        this.f19955E = w81Var;
        this.f19952B = i34Var.zza();
        i34Var.zzf();
        v34 m27153g = v34.m27153g(bj4Var);
        this.f19960J = m27153g;
        this.f19961K = new d34(m27153g);
        int length = c44VarArr.length;
        this.f19983r = new d44[2];
        for (int i12 = 0; i12 < 2; i12++) {
            c44VarArr[i12].mo20804k(i12, i94Var);
            this.f19983r[i12] = c44VarArr[i12].zzj();
        }
        this.f19953C = new z04(this, w81Var);
        this.f19954D = new ArrayList();
        this.f19982q = Collections.newSetFromMap(new IdentityHashMap());
        this.f19991z = new jq0();
        this.f19951A = new ho0();
        aj4Var.m20143g(this, ij4Var);
        this.f19976Z = true;
        Handler handler = new Handler(looper);
        this.f19956F = new n34(r44Var, handler);
        this.f19957G = new u34(this, r44Var, handler, i94Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f19989x = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f19990y = looper2;
        this.f19988w = w81Var.mo27578a(looper2, this);
    }

    /* renamed from: A */
    private final void m21879A() {
        boolean z11;
        k34 m24824f = this.f19956F.m24824f();
        if (this.f19966P || (m24824f != null && m24824f.f23125a.zzp())) {
            z11 = true;
        } else {
            z11 = false;
        }
        v34 v34Var = this.f19960J;
        if (z11 != v34Var.f29170g) {
            this.f19960J = new v34(v34Var.f29164a, v34Var.f29165b, v34Var.f29166c, v34Var.f29167d, v34Var.f29168e, v34Var.f29169f, z11, v34Var.f29171h, v34Var.f29172i, v34Var.f29173j, v34Var.f29174k, v34Var.f29175l, v34Var.f29176m, v34Var.f29177n, v34Var.f29179p, v34Var.f29180q, v34Var.f29181r, v34Var.f29178o);
        }
    }

    /* renamed from: B */
    private final void m21880B(dh4 dh4Var, bj4 bj4Var) {
        this.f19986u.mo23121c(this.f19981p, dh4Var, bj4Var.f17773c);
    }

    /* renamed from: C */
    private final void m21881C() {
        long j11;
        boolean z11;
        k34 m24825g = this.f19956F.m24825g();
        if (m24825g == null) {
            return;
        }
        if (m24825g.f23128d) {
            j11 = m24825g.f23125a.zzd();
        } else {
            j11 = -9223372036854775807L;
        }
        if (j11 != -9223372036854775807L) {
            m21918q(j11);
            if (j11 != this.f19960J.f29181r) {
                v34 v34Var = this.f19960J;
                this.f19960J = m21910i0(v34Var.f29165b, j11, v34Var.f29166c, j11, true, 5);
            }
        } else {
            z04 z04Var = this.f19953C;
            if (m24825g != this.f19956F.m24826h()) {
                z11 = true;
            } else {
                z11 = false;
            }
            long m28415a = z04Var.m28415a(z11);
            this.f19974X = m28415a;
            long m23819e = m28415a - m24825g.m23819e();
            long j12 = this.f19960J.f29181r;
            if (!this.f19954D.isEmpty() && !this.f19960J.f29165b.m22262b()) {
                if (this.f19976Z) {
                    this.f19976Z = false;
                }
                v34 v34Var2 = this.f19960J;
                v34Var2.f29164a.mo20105a(v34Var2.f29165b.f20363a);
                int min = Math.min(this.f19975Y, this.f19954D.size());
                if (min > 0) {
                    AbstractC30228a.m149044a(this.f19954D.get(min - 1));
                }
                if (min < this.f19954D.size()) {
                    AbstractC30228a.m149044a(this.f19954D.get(min));
                }
                this.f19975Y = min;
            }
            this.f19960J.f29181r = m23819e;
        }
        this.f19960J.f29179p = this.f19956F.m24824f().m23817c();
        this.f19960J.f29180q = m21899c0();
        v34 v34Var3 = this.f19960J;
        if (v34Var3.f29175l && v34Var3.f29168e == 3 && m21889K(v34Var3.f29164a, v34Var3.f29165b)) {
            v34 v34Var4 = this.f19960J;
            if (v34Var4.f29177n.f23210a == 1.0f) {
                float m28382a = this.f19980d0.m28382a(m21898b0(v34Var4.f29164a, v34Var4.f29165b.f20363a, v34Var4.f29181r), m21899c0());
                if (this.f19953C.zzc().f23210a != m28382a) {
                    this.f19953C.mo23127j(new kc0(m28382a, this.f19960J.f29177n.f23211b));
                    m21913l(this.f19960J.f29177n, this.f19953C.zzc().f23210a, false, false);
                }
            }
        }
    }

    /* renamed from: D */
    private final void m21882D(mr0 mr0Var, gf4 gf4Var, mr0 mr0Var2, gf4 gf4Var2, long j11) {
        Object obj;
        kc0 kc0Var;
        if (!m21889K(mr0Var, gf4Var)) {
            if (gf4Var.m22262b()) {
                kc0Var = kc0.f23208d;
            } else {
                kc0Var = this.f19960J.f29177n;
            }
            if (!this.f19953C.zzc().equals(kc0Var)) {
                this.f19953C.mo23127j(kc0Var);
                return;
            }
            return;
        }
        mr0Var.mo20109e(mr0Var.mo23650n(gf4Var.f20363a, this.f19951A).f21855c, this.f19991z, 0L);
        yx3 yx3Var = this.f19980d0;
        C4688kk c4688kk = this.f19991z.f22938i;
        int i11 = g92.f20474a;
        yx3Var.m28385d(c4688kk);
        if (j11 != -9223372036854775807L) {
            this.f19980d0.m28386e(m21898b0(mr0Var, gf4Var.f20363a, j11));
            return;
        }
        Object obj2 = this.f19991z.f22930a;
        if (!mr0Var2.m24700o()) {
            obj = mr0Var2.mo20109e(mr0Var2.mo23650n(gf4Var2.f20363a, this.f19951A).f21855c, this.f19991z, 0L).f22930a;
        } else {
            obj = null;
        }
        if (!g92.m22362t(obj, obj2)) {
            this.f19980d0.m28386e(-9223372036854775807L);
        }
    }

    /* renamed from: E */
    private final synchronized void m21883E(a63 a63Var, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j11;
        boolean z11 = false;
        while (!Boolean.valueOf(((x24) a63Var).f30312p.f19962L).booleanValue() && j11 > 0) {
            try {
                wait(j11);
            } catch (InterruptedException unused) {
                z11 = true;
            }
            j11 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: F */
    private final boolean m21884F() {
        k34 m24824f = this.f19956F.m24824f();
        if (m24824f == null || m24824f.m23818d() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m21885G(c44 c44Var) {
        if (c44Var.mo20807n() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private final boolean m21886H() {
        k34 m24825g = this.f19956F.m24825g();
        long j11 = m24825g.f23130f.f23716e;
        if (!m24825g.f23128d) {
            return false;
        }
        if (j11 != -9223372036854775807L && this.f19960J.f29181r >= j11 && m21888J()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private static boolean m21887I(v34 v34Var, ho0 ho0Var) {
        gf4 gf4Var = v34Var.f29165b;
        mr0 mr0Var = v34Var.f29164a;
        if (!mr0Var.m24700o() && !mr0Var.mo23650n(gf4Var.f20363a, ho0Var).f21858f) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    private final boolean m21888J() {
        v34 v34Var = this.f19960J;
        if (v34Var.f29175l && v34Var.f29176m == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private final boolean m21889K(mr0 mr0Var, gf4 gf4Var) {
        if (!gf4Var.m22262b() && !mr0Var.m24700o()) {
            mr0Var.mo20109e(mr0Var.mo23650n(gf4Var.f20363a, this.f19951A).f21855c, this.f19991z, 0L);
            if (this.f19991z.m23721b()) {
                jq0 jq0Var = this.f19991z;
                if (jq0Var.f22936g && jq0Var.f22933d != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: L */
    private static C4671k3[] m21890L(ui4 ui4Var) {
        int i11;
        if (ui4Var != null) {
            i11 = ui4Var.zzc();
        } else {
            i11 = 0;
        }
        C4671k3[] c4671k3Arr = new C4671k3[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            c4671k3Arr[i12] = ui4Var.mo23617c(i12);
        }
        return c4671k3Arr;
    }

    /* renamed from: M */
    private static final void m21891M(y34 y34Var) {
        y34Var.m28117j();
        try {
            y34Var.m28110c().mo22066h(y34Var.m28108a(), y34Var.m28114g());
        } finally {
            y34Var.m28115h(true);
        }
    }

    /* renamed from: N */
    private static final void m21892N(c44 c44Var) {
        if (c44Var.mo20807n() == 2) {
            c44Var.mo20798b();
        }
    }

    /* renamed from: O */
    private static final void m21893O(c44 c44Var, long j11) {
        c44Var.zzC();
    }

    /* renamed from: S */
    static Object m21895S(jq0 jq0Var, ho0 ho0Var, int i11, boolean z11, Object obj, mr0 mr0Var, mr0 mr0Var2) {
        int mo20105a = mr0Var.mo20105a(obj);
        int mo20106b = mr0Var.mo20106b();
        int i12 = 0;
        int i13 = mo20105a;
        int i14 = -1;
        while (true) {
            if (i12 >= mo20106b || i14 != -1) {
                break;
            }
            i13 = mr0Var.m24697i(i13, ho0Var, jq0Var, i11, z11);
            if (i13 == -1) {
                i14 = -1;
                break;
            }
            i14 = mr0Var2.mo20105a(mr0Var.mo20110f(i13));
            i12++;
        }
        if (i14 == -1) {
            return null;
        }
        return mr0Var2.mo20110f(i14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static final /* synthetic */ void m21897a0(y34 y34Var) {
        try {
            m21891M(y34Var);
        } catch (zzha e11) {
            lr1.m24354c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: b0 */
    private final long m21898b0(mr0 mr0Var, Object obj, long j11) {
        mr0Var.mo20109e(mr0Var.mo23650n(obj, this.f19951A).f21855c, this.f19991z, 0L);
        jq0 jq0Var = this.f19991z;
        if (jq0Var.f22933d != -9223372036854775807L && jq0Var.m23721b()) {
            jq0 jq0Var2 = this.f19991z;
            if (jq0Var2.f22936g) {
                return g92.m22344f0(g92.m22340d0(jq0Var2.f22934e) - this.f19991z.f22933d) - j11;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c0 */
    private final long m21899c0() {
        return m21900d0(this.f19960J.f29179p);
    }

    /* renamed from: d0 */
    private final long m21900d0(long j11) {
        k34 m24824f = this.f19956F.m24824f();
        if (m24824f == null) {
            return 0L;
        }
        return Math.max(0L, j11 - (this.f19974X - m24824f.m23819e()));
    }

    /* renamed from: e */
    private final void m21901e(c44 c44Var) {
        if (!m21885G(c44Var)) {
            return;
        }
        this.f19953C.m28416b(c44Var);
        m21892N(c44Var);
        c44Var.zzn();
        this.f19972V--;
    }

    /* renamed from: e0 */
    private final long m21902e0(gf4 gf4Var, long j11, boolean z11) {
        boolean z12;
        if (this.f19956F.m24825g() != this.f19956F.m24826h()) {
            z12 = true;
        } else {
            z12 = false;
        }
        return m21904f0(gf4Var, j11, z12, z11);
    }

    /* renamed from: f */
    private final void m21903f() {
        int length = this.f19981p.length;
        m21905g(new boolean[2]);
    }

    /* renamed from: f0 */
    private final long m21904f0(gf4 gf4Var, long j11, boolean z11, boolean z12) {
        m21927z();
        this.f19965O = false;
        if (z12 || this.f19960J.f29168e == 3) {
            m21924w(2);
        }
        k34 m24825g = this.f19956F.m24825g();
        k34 k34Var = m24825g;
        while (k34Var != null && !gf4Var.equals(k34Var.f23130f.f23712a)) {
            k34Var = k34Var.m23821g();
        }
        if (z11 || m24825g != k34Var || (k34Var != null && k34Var.m23819e() + j11 < 0)) {
            c44[] c44VarArr = this.f19981p;
            int length = c44VarArr.length;
            for (int i11 = 0; i11 < 2; i11++) {
                m21901e(c44VarArr[i11]);
            }
            if (k34Var != null) {
                while (this.f19956F.m24825g() != k34Var) {
                    this.f19956F.m24822d();
                }
                this.f19956F.m24834p(k34Var);
                k34Var.m23830p(1000000000000L);
                m21903f();
            }
        }
        if (k34Var != null) {
            this.f19956F.m24834p(k34Var);
            if (!k34Var.f23128d) {
                k34Var.f23130f = k34Var.f23130f.m24111b(j11);
            } else if (k34Var.f23129e) {
                j11 = k34Var.f23125a.mo21707j(j11);
                k34Var.f23125a.mo21709l(j11 - this.f19952B, false);
            }
            m21918q(j11);
            m21914m();
        } else {
            this.f19956F.m24830l();
            m21918q(j11);
        }
        m21909i(false);
        this.f19988w.mo20006f(2);
        return j11;
    }

    /* renamed from: g */
    private final void m21905g(boolean[] zArr) {
        boolean z11;
        boolean z12;
        boolean z13;
        k34 m24826h = this.f19956F.m24826h();
        bj4 m23823i = m24826h.m23823i();
        int i11 = 0;
        while (true) {
            int length = this.f19981p.length;
            if (i11 >= 2) {
                break;
            }
            if (!m23823i.m20532b(i11) && this.f19982q.remove(this.f19981p[i11])) {
                this.f19981p[i11].zzA();
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            int length2 = this.f19981p.length;
            if (i12 < 2) {
                if (m23823i.m20532b(i12)) {
                    boolean z14 = zArr[i12];
                    c44 c44Var = this.f19981p[i12];
                    if (!m21885G(c44Var)) {
                        k34 m24826h2 = this.f19956F.m24826h();
                        if (m24826h2 == this.f19956F.m24825g()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        bj4 m23823i2 = m24826h2.m23823i();
                        e44 e44Var = m23823i2.f17772b[i12];
                        C4671k3[] m21890L = m21890L(m23823i2.f17773c[i12]);
                        if (m21888J() && this.f19960J.f29168e == 3) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z14 && z12) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        this.f19972V++;
                        this.f19982q.add(c44Var);
                        c44Var.mo20805l(e44Var, m21890L, m24826h2.f23127c[i12], this.f19974X, z13, z11, m24826h2.m23820f(), m24826h2.m23819e());
                        c44Var.mo22066h(11, new z24(this));
                        this.f19953C.m28417c(c44Var);
                        if (z12) {
                            c44Var.zzE();
                        }
                    }
                }
                i12++;
            } else {
                m24826h.f23131g = true;
                return;
            }
        }
    }

    /* renamed from: g0 */
    private final Pair m21906g0(mr0 mr0Var) {
        long j11 = 0;
        if (mr0Var.m24700o()) {
            return Pair.create(v34.m27154h(), 0L);
        }
        Pair m24698l = mr0Var.m24698l(this.f19991z, this.f19951A, mr0Var.mo23646g(this.f19968R), -9223372036854775807L);
        gf4 m24829k = this.f19956F.m24829k(mr0Var, m24698l.first, 0L);
        long longValue = ((Long) m24698l.second).longValue();
        if (m24829k.m22262b()) {
            mr0Var.mo23650n(m24829k.f20363a, this.f19951A);
            if (m24829k.f20365c == this.f19951A.m22983e(m24829k.f20364b)) {
                this.f19951A.m22987i();
            }
        } else {
            j11 = longValue;
        }
        return Pair.create(m24829k, Long.valueOf(j11));
    }

    /* renamed from: h */
    private final void m21907h(IOException iOException, int i11) {
        zzha m28831c = zzha.m28831c(iOException, i11);
        k34 m24825g = this.f19956F.m24825g();
        if (m24825g != null) {
            m28831c = m28831c.m28833a(m24825g.f23130f.f23712a);
        }
        lr1.m24354c("ExoPlayerImplInternal", "Playback error", m28831c);
        m21926y(false, false);
        this.f19960J = this.f19960J.m27158d(m28831c);
    }

    /* renamed from: h0 */
    private static Pair m21908h0(mr0 mr0Var, e34 e34Var, boolean z11, int i11, boolean z12, jq0 jq0Var, ho0 ho0Var) {
        mr0 mr0Var2;
        Pair m24698l;
        mr0 mr0Var3 = e34Var.f19503a;
        if (mr0Var.m24700o()) {
            return null;
        }
        if (true == mr0Var3.m24700o()) {
            mr0Var2 = mr0Var;
        } else {
            mr0Var2 = mr0Var3;
        }
        try {
            m24698l = mr0Var2.m24698l(jq0Var, ho0Var, e34Var.f19504b, e34Var.f19505c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (mr0Var.equals(mr0Var2)) {
            return m24698l;
        }
        if (mr0Var.mo20105a(m24698l.first) != -1) {
            if (mr0Var2.mo23650n(m24698l.first, ho0Var).f21858f && mr0Var2.mo20109e(ho0Var.f21855c, jq0Var, 0L).f22942m == mr0Var2.mo20105a(m24698l.first)) {
                return mr0Var.m24698l(jq0Var, ho0Var, mr0Var.mo23650n(m24698l.first, ho0Var).f21855c, e34Var.f19505c);
            }
            return m24698l;
        }
        Object m21895S = m21895S(jq0Var, ho0Var, i11, z12, m24698l.first, mr0Var2, mr0Var);
        if (m21895S != null) {
            return mr0Var.m24698l(jq0Var, ho0Var, mr0Var.mo23650n(m21895S, ho0Var).f21855c, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: i */
    private final void m21909i(boolean z11) {
        gf4 gf4Var;
        long m23817c;
        k34 m24824f = this.f19956F.m24824f();
        if (m24824f == null) {
            gf4Var = this.f19960J.f29165b;
        } else {
            gf4Var = m24824f.f23130f.f23712a;
        }
        boolean z12 = !this.f19960J.f29174k.equals(gf4Var);
        if (z12) {
            this.f19960J = this.f19960J.m27155a(gf4Var);
        }
        v34 v34Var = this.f19960J;
        if (m24824f == null) {
            m23817c = v34Var.f29181r;
        } else {
            m23817c = m24824f.m23817c();
        }
        v34Var.f29179p = m23817c;
        this.f19960J.f29180q = m21899c0();
        if ((z12 || z11) && m24824f != null && m24824f.f23128d) {
            m21880B(m24824f.m23822h(), m24824f.m23823i());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final v34 m21910i0(gf4 gf4Var, long j11, long j12, long j13, boolean z11, int i11) {
        boolean z12;
        List list;
        dh4 dh4Var;
        bj4 bj4Var;
        c83 m20832w;
        if (this.f19976Z || j11 != this.f19960J.f29181r || !gf4Var.equals(this.f19960J.f29165b)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f19976Z = z12;
        m21917p();
        v34 v34Var = this.f19960J;
        dh4 dh4Var2 = v34Var.f29171h;
        bj4 bj4Var2 = v34Var.f29172i;
        List list2 = v34Var.f29173j;
        if (this.f19957G.m26852i()) {
            k34 m24825g = this.f19956F.m24825g();
            if (m24825g == null) {
                dh4Var2 = dh4.f19249d;
            } else {
                dh4Var2 = m24825g.m23822h();
            }
            if (m24825g == null) {
                bj4Var2 = this.f19985t;
            } else {
                bj4Var2 = m24825g.m23823i();
            }
            ui4[] ui4VarArr = bj4Var2.f17773c;
            z73 z73Var = new z73();
            boolean z13 = false;
            for (ui4 ui4Var : ui4VarArr) {
                if (ui4Var != null) {
                    zzbq zzbqVar = ui4Var.mo23617c(0).f23097j;
                    if (zzbqVar == null) {
                        z73Var.m28452f(new zzbq(-9223372036854775807L, new zzbp[0]));
                    } else {
                        z73Var.m28452f(zzbqVar);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                m20832w = z73Var.m28454h();
            } else {
                m20832w = c83.m20832w();
            }
            if (m24825g != null) {
                l34 l34Var = m24825g.f23130f;
                if (l34Var.f23714c != j12) {
                    m24825g.f23130f = l34Var.m24110a(j12);
                }
            }
            list = m20832w;
        } else {
            if (!gf4Var.equals(this.f19960J.f29165b)) {
                dh4Var = dh4.f19249d;
                bj4Var = this.f19985t;
                list = c83.m20832w();
                if (z11) {
                    this.f19961K.m21261d(i11);
                }
                return this.f19960J.m27156b(gf4Var, j11, j12, j13, m21899c0(), dh4Var, bj4Var, list);
            }
            list = list2;
        }
        dh4Var = dh4Var2;
        bj4Var = bj4Var2;
        if (z11) {
        }
        return this.f19960J.m27156b(gf4Var, j11, j12, j13, m21899c0(), dh4Var, bj4Var, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0371 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03be  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.ho0] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.mr0] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.internal.ads.mr0] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m21911j(mr0 mr0Var, boolean z11) {
        long j11;
        gf4 gf4Var;
        n34 n34Var;
        int i11;
        Object obj;
        long j12;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        long j13;
        gf4 m24829k;
        int i15;
        boolean z16;
        boolean z17;
        ?? r13;
        gf4 gf4Var2;
        boolean z18;
        boolean z19;
        f34 f34Var;
        long j14;
        boolean z21;
        int i16;
        boolean z22;
        int i17;
        boolean z23;
        boolean z24;
        boolean z25;
        long j15;
        boolean z26;
        boolean z27;
        e34 e34Var;
        Object obj2;
        boolean z28;
        long j16;
        boolean z29;
        boolean z31;
        long j17;
        v34 v34Var = this.f19960J;
        e34 e34Var2 = this.f19973W;
        n34 n34Var2 = this.f19956F;
        int i18 = this.f19967Q;
        boolean z32 = this.f19968R;
        jq0 jq0Var = this.f19991z;
        ?? r14 = this.f19951A;
        long j18 = -9223372036854775807L;
        boolean z33 = true;
        if (mr0Var.m24700o()) {
            gf4Var2 = v34.m27154h();
            f34Var = this;
            r13 = -9223372036854775807;
            z18 = false;
            z21 = true;
            z19 = false;
            j14 = 0;
        } else {
            gf4 gf4Var3 = v34Var.f29165b;
            Object obj3 = gf4Var3.f20363a;
            boolean m21887I = m21887I(v34Var, r14);
            if (!v34Var.f29165b.m22262b() && !m21887I) {
                j11 = v34Var.f29181r;
            } else {
                j11 = v34Var.f29166c;
            }
            long j19 = j11;
            if (e34Var2 != null) {
                gf4Var = gf4Var3;
                n34Var = n34Var2;
                i11 = -1;
                Pair m21908h0 = m21908h0(mr0Var, e34Var2, true, i18, z32, jq0Var, r14);
                if (m21908h0 == null) {
                    i17 = mr0Var.mo23646g(z32);
                    j12 = j19;
                    z15 = true;
                    z23 = false;
                    z24 = false;
                } else {
                    if (e34Var2.f19505c == -9223372036854775807L) {
                        i17 = mr0Var.mo23650n(m21908h0.first, r14).f21855c;
                        j12 = j19;
                        z22 = false;
                    } else {
                        obj3 = m21908h0.first;
                        j12 = ((Long) m21908h0.second).longValue();
                        z22 = true;
                        i17 = -1;
                    }
                    if (v34Var.f29168e == 4) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    z24 = z22;
                    z15 = false;
                }
                z12 = z23;
                i12 = i17;
                z14 = z24;
            } else {
                gf4Var = gf4Var3;
                n34Var = n34Var2;
                i11 = -1;
                if (v34Var.f29164a.m24700o()) {
                    i13 = mr0Var.mo23646g(z32);
                } else if (mr0Var.mo20105a(obj3) == -1) {
                    Object m21895S = m21895S(jq0Var, r14, i18, z32, obj3, v34Var.f29164a, mr0Var);
                    if (m21895S == null) {
                        i14 = mr0Var.mo23646g(z32);
                        z15 = true;
                    } else {
                        i14 = mr0Var.mo23650n(m21895S, r14).f21855c;
                        z15 = false;
                    }
                    i12 = i14;
                    j12 = j19;
                    z12 = false;
                    z14 = false;
                } else if (j19 == -9223372036854775807L) {
                    i13 = mr0Var.mo23650n(obj3, r14).f21855c;
                } else if (m21887I) {
                    v34Var.f29164a.mo23650n(gf4Var.f20363a, r14);
                    if (v34Var.f29164a.mo20109e(r14.f21855c, jq0Var, 0L).f22942m == v34Var.f29164a.mo20105a(gf4Var.f20363a)) {
                        Pair m24698l = mr0Var.m24698l(jq0Var, r14, mr0Var.mo23650n(obj3, r14).f21855c, j19);
                        obj3 = m24698l.first;
                        j12 = ((Long) m24698l.second).longValue();
                    } else {
                        j12 = j19;
                    }
                    obj = obj3;
                    i12 = -1;
                    z12 = false;
                    z13 = false;
                    z14 = true;
                    if (i12 == i11) {
                        Pair m24698l2 = mr0Var.m24698l(jq0Var, r14, i12, -9223372036854775807L);
                        obj = m24698l2.first;
                        j13 = ((Long) m24698l2.second).longValue();
                        j12 = -9223372036854775807L;
                    } else {
                        j13 = j12;
                    }
                    m24829k = n34Var.m24829k(mr0Var, obj, j13);
                    i15 = m24829k.f20367e;
                    if (i15 != i11 || ((i16 = gf4Var.f20367e) != i11 && i15 >= i16)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!gf4Var.f20363a.equals(obj) && !gf4Var.m22262b() && !m24829k.m22262b() && z16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    ho0 mo23650n = mr0Var.mo23650n(obj, r14);
                    if (!m21887I && j19 == j12 && gf4Var.f20363a.equals(m24829k.f20363a)) {
                        if (gf4Var.m22262b()) {
                            mo23650n.m22990l(gf4Var.f20364b);
                        }
                        if (m24829k.m22262b()) {
                            mo23650n.m22990l(m24829k.f20364b);
                        }
                    }
                    if (true == z17) {
                        m24829k = gf4Var;
                    }
                    if (m24829k.m22262b()) {
                        if (m24829k.equals(gf4Var)) {
                            j13 = v34Var.f29181r;
                        } else {
                            mr0Var.mo23650n(m24829k.f20363a, r14);
                            if (m24829k.f20365c == r14.m22983e(m24829k.f20364b)) {
                                r14.m22987i();
                            }
                            j13 = 0;
                        }
                    }
                    r13 = j12;
                    gf4Var2 = m24829k;
                    z18 = z12;
                    z33 = z13;
                    z19 = z14;
                    f34Var = this;
                    j14 = j13;
                    z21 = true;
                } else {
                    obj = obj3;
                    j12 = j19;
                    i12 = -1;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    if (i12 == i11) {
                    }
                    m24829k = n34Var.m24829k(mr0Var, obj, j13);
                    i15 = m24829k.f20367e;
                    if (i15 != i11) {
                    }
                    z16 = true;
                    if (!gf4Var.f20363a.equals(obj)) {
                    }
                    z17 = false;
                    ho0 mo23650n2 = mr0Var.mo23650n(obj, r14);
                    if (!m21887I) {
                        if (gf4Var.m22262b()) {
                        }
                        if (m24829k.m22262b()) {
                        }
                    }
                    if (true == z17) {
                    }
                    if (m24829k.m22262b()) {
                    }
                    r13 = j12;
                    gf4Var2 = m24829k;
                    z18 = z12;
                    z33 = z13;
                    z19 = z14;
                    f34Var = this;
                    j14 = j13;
                    z21 = true;
                }
                i12 = i13;
                obj = obj3;
                j12 = j19;
                z12 = false;
                z13 = false;
                z14 = false;
                if (i12 == i11) {
                }
                m24829k = n34Var.m24829k(mr0Var, obj, j13);
                i15 = m24829k.f20367e;
                if (i15 != i11) {
                }
                z16 = true;
                if (!gf4Var.f20363a.equals(obj)) {
                }
                z17 = false;
                ho0 mo23650n22 = mr0Var.mo23650n(obj, r14);
                if (!m21887I) {
                }
                if (true == z17) {
                }
                if (m24829k.m22262b()) {
                }
                r13 = j12;
                gf4Var2 = m24829k;
                z18 = z12;
                z33 = z13;
                z19 = z14;
                f34Var = this;
                j14 = j13;
                z21 = true;
            }
            Object obj4 = obj3;
            z13 = z15;
            obj = obj4;
            if (i12 == i11) {
            }
            m24829k = n34Var.m24829k(mr0Var, obj, j13);
            i15 = m24829k.f20367e;
            if (i15 != i11) {
            }
            z16 = true;
            if (!gf4Var.f20363a.equals(obj)) {
            }
            z17 = false;
            ho0 mo23650n222 = mr0Var.mo23650n(obj, r14);
            if (!m21887I) {
            }
            if (true == z17) {
            }
            if (m24829k.m22262b()) {
            }
            r13 = j12;
            gf4Var2 = m24829k;
            z18 = z12;
            z33 = z13;
            z19 = z14;
            f34Var = this;
            j14 = j13;
            z21 = true;
        }
        if (!f34Var.f19960J.f29165b.equals(gf4Var2) || j14 != f34Var.f19960J.f29181r) {
            z25 = true;
        } else {
            z25 = false;
        }
        int i19 = 3;
        if (z33) {
            try {
                if (f34Var.f19960J.f29168e != z21) {
                    try {
                        f34Var.m21924w(4);
                    } catch (Throwable th2) {
                        th = th2;
                        j15 = r13;
                        e34Var = null;
                        z27 = false;
                        z26 = true;
                        v34 v34Var2 = f34Var.f19960J;
                        mr0 mr0Var2 = v34Var2.f29164a;
                        gf4 gf4Var4 = v34Var2.f29165b;
                        if (z26 == z19) {
                        }
                        e34 e34Var3 = e34Var;
                        m21882D(mr0Var, gf4Var2, mr0Var2, gf4Var4, j18);
                        if (!z25) {
                        }
                        v34 v34Var3 = f34Var.f19960J;
                        obj2 = v34Var3.f29165b.f20363a;
                        mr0 mr0Var3 = v34Var3.f29164a;
                        if (!z25) {
                        }
                        z28 = false;
                        long j21 = f34Var.f19960J.f29167d;
                        if (mr0Var.mo20105a(obj2) == -1) {
                        }
                        f34Var.f19960J = m21910i0(gf4Var2, j14, j15, j21, z28, i19);
                        m21917p();
                        f34Var.m21919r(mr0Var, f34Var.f19960J.f29164a);
                        f34Var.f19960J = f34Var.f19960J.m27160f(mr0Var);
                        if (!mr0Var.m24700o()) {
                        }
                        f34Var.m21909i(z27);
                        throw th;
                    }
                }
                f34Var.m21916o(false, false, false, z21);
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            if (!z25) {
                try {
                    n34 n34Var3 = f34Var.f19956F;
                    long j22 = f34Var.f19974X;
                    k34 m24826h = n34Var3.m24826h();
                    if (m24826h == null) {
                        j15 = r13;
                        j16 = 0;
                    } else {
                        long m23819e = m24826h.m23819e();
                        if (!m24826h.f23128d) {
                            j15 = r13;
                            j16 = m23819e;
                        } else {
                            j16 = m23819e;
                            int i21 = 0;
                            r13 = r13;
                            while (true) {
                                c44[] c44VarArr = f34Var.f19981p;
                                j15 = r13;
                                try {
                                    int length = c44VarArr.length;
                                    if (i21 >= 2) {
                                        break;
                                    }
                                    try {
                                        if (m21885G(c44VarArr[i21]) && f34Var.f19981p[i21].zzm() == m24826h.f23127c[i21]) {
                                            long zzf = f34Var.f19981p[i21].zzf();
                                            if (zzf == Long.MIN_VALUE) {
                                                j16 = Long.MIN_VALUE;
                                                break;
                                            }
                                            j16 = Math.max(zzf, j16);
                                        }
                                        i21++;
                                        r13 = j15;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        e34Var = null;
                                        z27 = false;
                                        z26 = true;
                                        v34 v34Var22 = f34Var.f19960J;
                                        mr0 mr0Var22 = v34Var22.f29164a;
                                        gf4 gf4Var42 = v34Var22.f29165b;
                                        if (z26 == z19) {
                                        }
                                        e34 e34Var32 = e34Var;
                                        m21882D(mr0Var, gf4Var2, mr0Var22, gf4Var42, j18);
                                        if (!z25) {
                                        }
                                        v34 v34Var32 = f34Var.f19960J;
                                        obj2 = v34Var32.f29165b.f20363a;
                                        mr0 mr0Var32 = v34Var32.f29164a;
                                        if (!z25) {
                                        }
                                        z28 = false;
                                        long j212 = f34Var.f19960J.f29167d;
                                        if (mr0Var.mo20105a(obj2) == -1) {
                                        }
                                        f34Var.f19960J = m21910i0(gf4Var2, j14, j15, j212, z28, i19);
                                        m21917p();
                                        f34Var.m21919r(mr0Var, f34Var.f19960J.f29164a);
                                        f34Var.f19960J = f34Var.f19960J.m27160f(mr0Var);
                                        if (!mr0Var.m24700o()) {
                                        }
                                        f34Var.m21909i(z27);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r13 = 0;
                                    r14 = 1;
                                    e34Var = null;
                                    z27 = r13;
                                    z26 = r14;
                                    v34 v34Var222 = f34Var.f19960J;
                                    mr0 mr0Var222 = v34Var222.f29164a;
                                    gf4 gf4Var422 = v34Var222.f29165b;
                                    if (z26 == z19) {
                                        j18 = j14;
                                    }
                                    e34 e34Var322 = e34Var;
                                    m21882D(mr0Var, gf4Var2, mr0Var222, gf4Var422, j18);
                                    if (!z25 || j15 != f34Var.f19960J.f29166c) {
                                        v34 v34Var322 = f34Var.f19960J;
                                        obj2 = v34Var322.f29165b.f20363a;
                                        mr0 mr0Var322 = v34Var322.f29164a;
                                        if (!z25 && z11 && !mr0Var322.m24700o() && !mr0Var322.mo23650n(obj2, f34Var.f19951A).f21858f) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        long j2122 = f34Var.f19960J.f29167d;
                                        if (mr0Var.mo20105a(obj2) == -1) {
                                            i19 = 4;
                                        }
                                        f34Var.f19960J = m21910i0(gf4Var2, j14, j15, j2122, z28, i19);
                                    }
                                    m21917p();
                                    f34Var.m21919r(mr0Var, f34Var.f19960J.f29164a);
                                    f34Var.f19960J = f34Var.f19960J.m27160f(mr0Var);
                                    if (!mr0Var.m24700o()) {
                                        f34Var.f19973W = e34Var322;
                                    }
                                    f34Var.m21909i(z27);
                                    throw th;
                                }
                            }
                        }
                    }
                    z29 = false;
                    z31 = true;
                    if (!n34Var3.m24836r(mr0Var, j22, j16)) {
                        f34Var.m21921t(false);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    j15 = r13;
                }
            } else {
                j15 = r13;
                z29 = false;
                z31 = true;
                if (!mr0Var.m24700o()) {
                    for (k34 m24825g = f34Var.f19956F.m24825g(); m24825g != null; m24825g = m24825g.m23821g()) {
                        if (m24825g.f23130f.f23712a.equals(gf4Var2)) {
                            m24825g.f23130f = f34Var.f19956F.m24828j(mr0Var, m24825g.f23130f);
                            m24825g.m23831q();
                        }
                    }
                    j14 = f34Var.m21902e0(gf4Var2, j14, z18);
                }
            }
            v34 v34Var4 = f34Var.f19960J;
            mr0 mr0Var4 = v34Var4.f29164a;
            gf4 gf4Var5 = v34Var4.f29165b;
            if (z31 != z19) {
                j17 = -9223372036854775807L;
            } else {
                j17 = j14;
            }
            m21882D(mr0Var, gf4Var2, mr0Var4, gf4Var5, j17);
            if (z25 || j15 != f34Var.f19960J.f29166c) {
                v34 v34Var5 = f34Var.f19960J;
                Object obj5 = v34Var5.f29165b.f20363a;
                mr0 mr0Var5 = v34Var5.f29164a;
                if (!z25 || !z11 || mr0Var5.m24700o() || mr0Var5.mo23650n(obj5, f34Var.f19951A).f21858f) {
                    z31 = false;
                }
                long j23 = f34Var.f19960J.f29167d;
                if (mr0Var.mo20105a(obj5) == -1) {
                    i19 = 4;
                }
                f34Var.f19960J = m21910i0(gf4Var2, j14, j15, j23, z31, i19);
            }
            m21917p();
            f34Var.m21919r(mr0Var, f34Var.f19960J.f29164a);
            f34Var.f19960J = f34Var.f19960J.m27160f(mr0Var);
            if (!mr0Var.m24700o()) {
                f34Var.f19973W = null;
            }
            f34Var.m21909i(z29);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: k */
    private final void m21912k(kc0 kc0Var, boolean z11) {
        m21913l(kc0Var, kc0Var.f23210a, true, z11);
    }

    /* renamed from: l */
    private final void m21913l(kc0 kc0Var, float f11, boolean z11, boolean z12) {
        int i11;
        f34 f34Var = this;
        if (z11) {
            if (z12) {
                f34Var.f19961K.m21258a(1);
            }
            v34 v34Var = f34Var.f19960J;
            f34Var = this;
            f34Var.f19960J = new v34(v34Var.f29164a, v34Var.f29165b, v34Var.f29166c, v34Var.f29167d, v34Var.f29168e, v34Var.f29169f, v34Var.f29170g, v34Var.f29171h, v34Var.f29172i, v34Var.f29173j, v34Var.f29174k, v34Var.f29175l, v34Var.f29176m, kc0Var, v34Var.f29179p, v34Var.f29180q, v34Var.f29181r, v34Var.f29178o);
        }
        float f12 = kc0Var.f23210a;
        k34 m24825g = f34Var.f19956F.m24825g();
        while (true) {
            i11 = 0;
            if (m24825g == null) {
                break;
            }
            ui4[] ui4VarArr = m24825g.m23823i().f17773c;
            int length = ui4VarArr.length;
            while (i11 < length) {
                ui4 ui4Var = ui4VarArr[i11];
                i11++;
            }
            m24825g = m24825g.m23821g();
        }
        c44[] c44VarArr = f34Var.f19981p;
        int length2 = c44VarArr.length;
        while (i11 < 2) {
            c44 c44Var = c44VarArr[i11];
            if (c44Var != null) {
                c44Var.mo20799c(f11, kc0Var.f23210a);
            }
            i11++;
        }
    }

    /* renamed from: m */
    private final void m21914m() {
        long m23819e;
        long j11;
        boolean mo23120b;
        if (!m21884F()) {
            mo23120b = false;
        } else {
            k34 m24824f = this.f19956F.m24824f();
            long m21900d0 = m21900d0(m24824f.m23818d());
            if (m24824f == this.f19956F.m24825g()) {
                m23819e = this.f19974X;
                j11 = m24824f.m23819e();
            } else {
                m23819e = this.f19974X - m24824f.m23819e();
                j11 = m24824f.f23130f.f23713b;
            }
            mo23120b = this.f19986u.mo23120b(m23819e - j11, m21900d0, this.f19953C.zzc().f23210a);
        }
        this.f19966P = mo23120b;
        if (mo23120b) {
            this.f19956F.m24824f().m23825k(this.f19974X);
        }
        m21879A();
    }

    /* renamed from: n */
    private final void m21915n() {
        boolean z11;
        this.f19961K.m21260c(this.f19960J);
        z11 = this.f19961K.f19072a;
        if (z11) {
            x14 x14Var = this.f19979c0;
            x14Var.f30301a.m27512u(this.f19961K);
            this.f19961K = new d34(this.f19960J);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m21916o(boolean z11, boolean z12, boolean z13, boolean z14) {
        long j11;
        gf4 gf4Var;
        long j12;
        long j13;
        boolean z15;
        dh4 dh4Var;
        bj4 bj4Var;
        List list;
        this.f19988w.zze(2);
        zzha zzhaVar = null;
        this.f19977a0 = null;
        this.f19965O = false;
        this.f19953C.m28420f();
        this.f19974X = 1000000000000L;
        c44[] c44VarArr = this.f19981p;
        int length = c44VarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                m21901e(c44VarArr[i11]);
            } catch (zzha | RuntimeException e11) {
                lr1.m24354c("ExoPlayerImplInternal", "Disable failed.", e11);
            }
        }
        if (z11) {
            c44[] c44VarArr2 = this.f19981p;
            int length2 = c44VarArr2.length;
            for (int i12 = 0; i12 < 2; i12++) {
                c44 c44Var = c44VarArr2[i12];
                if (this.f19982q.remove(c44Var)) {
                    try {
                        c44Var.zzA();
                    } catch (RuntimeException e12) {
                        lr1.m24354c("ExoPlayerImplInternal", "Reset failed.", e12);
                    }
                }
            }
        }
        this.f19972V = 0;
        v34 v34Var = this.f19960J;
        gf4 gf4Var2 = v34Var.f29165b;
        long j14 = v34Var.f29181r;
        if (!this.f19960J.f29165b.m22262b() && !m21887I(this.f19960J, this.f19951A)) {
            j11 = this.f19960J.f29181r;
        } else {
            j11 = this.f19960J.f29166c;
        }
        if (z12) {
            this.f19973W = null;
            Pair m21906g0 = m21906g0(this.f19960J.f29164a);
            gf4Var2 = (gf4) m21906g0.first;
            j14 = ((Long) m21906g0.second).longValue();
            j11 = -9223372036854775807L;
            if (!gf4Var2.equals(this.f19960J.f29165b)) {
                z15 = true;
                gf4Var = gf4Var2;
                j12 = j14;
                j13 = -9223372036854775807L;
                this.f19956F.m24830l();
                this.f19966P = false;
                v34 v34Var2 = this.f19960J;
                mr0 mr0Var = v34Var2.f29164a;
                int i13 = v34Var2.f29168e;
                if (!z14) {
                    zzhaVar = v34Var2.f29169f;
                }
                zzha zzhaVar2 = zzhaVar;
                if (!z15) {
                    dh4Var = dh4.f19249d;
                } else {
                    dh4Var = v34Var2.f29171h;
                }
                dh4 dh4Var2 = dh4Var;
                if (!z15) {
                    bj4Var = this.f19985t;
                } else {
                    bj4Var = v34Var2.f29172i;
                }
                bj4 bj4Var2 = bj4Var;
                if (!z15) {
                    list = c83.m20832w();
                } else {
                    list = v34Var2.f29173j;
                }
                List list2 = list;
                v34 v34Var3 = this.f19960J;
                this.f19960J = new v34(mr0Var, gf4Var, j13, j12, i13, zzhaVar2, false, dh4Var2, bj4Var2, list2, gf4Var, v34Var3.f29175l, v34Var3.f29176m, v34Var3.f29177n, j12, 0L, j12, false);
                if (!z13) {
                    this.f19957G.m26850g();
                    return;
                }
                return;
            }
        }
        gf4Var = gf4Var2;
        j12 = j14;
        j13 = j11;
        z15 = false;
        this.f19956F.m24830l();
        this.f19966P = false;
        v34 v34Var22 = this.f19960J;
        mr0 mr0Var2 = v34Var22.f29164a;
        int i132 = v34Var22.f29168e;
        if (!z14) {
        }
        zzha zzhaVar22 = zzhaVar;
        if (!z15) {
        }
        dh4 dh4Var22 = dh4Var;
        if (!z15) {
        }
        bj4 bj4Var22 = bj4Var;
        if (!z15) {
        }
        List list22 = list;
        v34 v34Var32 = this.f19960J;
        this.f19960J = new v34(mr0Var2, gf4Var, j13, j12, i132, zzhaVar22, false, dh4Var22, bj4Var22, list22, gf4Var, v34Var32.f29175l, v34Var32.f29176m, v34Var32.f29177n, j12, 0L, j12, false);
        if (!z13) {
        }
    }

    /* renamed from: p */
    private final void m21917p() {
        k34 m24825g = this.f19956F.m24825g();
        boolean z11 = false;
        if (m24825g != null && m24825g.f23130f.f23719h && this.f19963M) {
            z11 = true;
        }
        this.f19964N = z11;
    }

    /* renamed from: q */
    private final void m21918q(long j11) {
        long m23819e;
        k34 m24825g = this.f19956F.m24825g();
        if (m24825g == null) {
            m23819e = 1000000000000L;
        } else {
            m23819e = m24825g.m23819e();
        }
        long j12 = j11 + m23819e;
        this.f19974X = j12;
        this.f19953C.m28418d(j12);
        c44[] c44VarArr = this.f19981p;
        int length = c44VarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            c44 c44Var = c44VarArr[i11];
            if (m21885G(c44Var)) {
                c44Var.mo20797a(this.f19974X);
            }
        }
        for (k34 m24825g2 = this.f19956F.m24825g(); m24825g2 != null; m24825g2 = m24825g2.m23821g()) {
            for (ui4 ui4Var : m24825g2.m23823i().f17773c) {
            }
        }
    }

    /* renamed from: r */
    private final void m21919r(mr0 mr0Var, mr0 mr0Var2) {
        if (mr0Var.m24700o() && mr0Var2.m24700o()) {
            return;
        }
        int size = this.f19954D.size() - 1;
        if (size < 0) {
            Collections.sort(this.f19954D);
        } else {
            AbstractC30228a.m149044a(this.f19954D.get(size));
            throw null;
        }
    }

    /* renamed from: s */
    private final void m21920s(long j11, long j12) {
        this.f19988w.mo20008h(2, j11 + j12);
    }

    /* renamed from: t */
    private final void m21921t(boolean z11) {
        gf4 gf4Var = this.f19956F.m24825g().f23130f.f23712a;
        long m21904f0 = m21904f0(gf4Var, this.f19960J.f29181r, true, false);
        if (m21904f0 != this.f19960J.f29181r) {
            v34 v34Var = this.f19960J;
            this.f19960J = m21910i0(gf4Var, m21904f0, v34Var.f29166c, v34Var.f29167d, z11, 5);
        }
    }

    /* renamed from: u */
    private final void m21922u(y34 y34Var) {
        if (y34Var.m28109b() == this.f19990y) {
            m21891M(y34Var);
            int i11 = this.f19960J.f29168e;
            if (i11 != 3 && i11 != 2) {
                return;
            }
            this.f19988w.mo20006f(2);
            return;
        }
        this.f19988w.mo20002b(15, y34Var).zza();
    }

    /* renamed from: v */
    private final void m21923v(boolean z11, int i11, boolean z12, int i12) {
        this.f19961K.m21258a(z12 ? 1 : 0);
        this.f19961K.m21259b(i12);
        this.f19960J = this.f19960J.m27157c(z11, i11);
        this.f19965O = false;
        for (k34 m24825g = this.f19956F.m24825g(); m24825g != null; m24825g = m24825g.m23821g()) {
            for (ui4 ui4Var : m24825g.m23823i().f17773c) {
            }
        }
        if (!m21888J()) {
            m21927z();
            m21881C();
            return;
        }
        int i13 = this.f19960J.f29168e;
        if (i13 == 3) {
            m21925x();
            this.f19988w.mo20006f(2);
        } else if (i13 == 2) {
            this.f19988w.mo20006f(2);
        }
    }

    /* renamed from: w */
    private final void m21924w(int i11) {
        v34 v34Var = this.f19960J;
        if (v34Var.f29168e != i11) {
            if (i11 != 2) {
                this.f19978b0 = -9223372036854775807L;
            }
            this.f19960J = v34Var.m27159e(i11);
        }
    }

    /* renamed from: x */
    private final void m21925x() {
        this.f19965O = false;
        this.f19953C.m28419e();
        c44[] c44VarArr = this.f19981p;
        int length = c44VarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            c44 c44Var = c44VarArr[i11];
            if (m21885G(c44Var)) {
                c44Var.zzE();
            }
        }
    }

    /* renamed from: y */
    private final void m21926y(boolean z11, boolean z12) {
        boolean z13;
        if (z11 || !this.f19969S) {
            z13 = true;
        } else {
            z13 = false;
        }
        m21916o(z13, false, true, false);
        this.f19961K.m21258a(z12 ? 1 : 0);
        this.f19986u.zzd();
        m21924w(1);
    }

    /* renamed from: z */
    private final void m21927z() {
        this.f19953C.m28420f();
        c44[] c44VarArr = this.f19981p;
        int length = c44VarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            c44 c44Var = c44VarArr[i11];
            if (m21885G(c44Var)) {
                m21892N(c44Var);
            }
        }
    }

    /* renamed from: P */
    public final Looper m21928P() {
        return this.f19990y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final /* synthetic */ Boolean m21929R() {
        return Boolean.valueOf(this.f19962L);
    }

    /* renamed from: U */
    public final void m21930U() {
        this.f19988w.mo20001a(0).zza();
    }

    /* renamed from: V */
    public final void m21931V(mr0 mr0Var, int i11, long j11) {
        this.f19988w.mo20002b(3, new e34(mr0Var, i11, j11)).zza();
    }

    /* renamed from: W */
    public final void m21932W(boolean z11, int i11) {
        this.f19988w.mo20007g(1, z11 ? 1 : 0, i11).zza();
    }

    /* renamed from: X */
    public final void m21933X() {
        this.f19988w.mo20001a(6).zza();
    }

    /* renamed from: Y */
    public final synchronized boolean m21934Y() {
        if (!this.f19962L && this.f19989x.isAlive()) {
            this.f19988w.mo20006f(7);
            m21883E(new x24(this), this.f19958H);
            return this.f19962L;
        }
        return true;
    }

    /* renamed from: Z */
    public final void m21935Z(List list, int i11, long j11, zg4 zg4Var) {
        this.f19988w.mo20002b(17, new b34(list, zg4Var, i11, j11, null, null)).zza();
    }

    @Override // com.google.android.gms.internal.ads.a04
    /* renamed from: a */
    public final void mo19944a(kc0 kc0Var) {
        this.f19988w.mo20002b(16, kc0Var).zza();
    }

    @Override // com.google.android.gms.internal.ads.w34
    /* renamed from: b */
    public final synchronized void mo21936b(y34 y34Var) {
        if (!this.f19962L && this.f19989x.isAlive()) {
            this.f19988w.mo20002b(14, y34Var).zza();
            return;
        }
        lr1.m24356e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        y34Var.m28115h(false);
    }

    @Override // com.google.android.gms.internal.ads.xg4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo21937c(yg4 yg4Var) {
        this.f19988w.mo20002b(9, (ef4) yg4Var).zza();
    }

    @Override // com.google.android.gms.internal.ads.df4
    /* renamed from: d */
    public final void mo21382d(ef4 ef4Var) {
        this.f19988w.mo20002b(8, ef4Var).zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:495:0x091a, code lost:            if (r53.f19986u.mo23119a(m21899c0(), r53.f19953C.zzc().f23210a, r53.f19965O, r37) == false) goto L478;     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x093d, code lost:            if (r2 == false) goto L486;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06ed A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0734 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0762 A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0780 A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x09e9 A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09f6 A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a05 A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a67 A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0928 A[Catch: RuntimeException -> 0x001b, IOException -> 0x001f, zzrk -> 0x0023, zzey -> 0x0027, zzbu -> 0x002b, zzpi -> 0x002f, zzha -> 0x0033, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x0037, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:25:0x0059, B:27:0x0062, B:29:0x0070, B:31:0x0077, B:32:0x0081, B:33:0x0094, B:34:0x00ac, B:35:0x00b6, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00db, B:42:0x00ea, B:43:0x0106, B:44:0x0119, B:45:0x0122, B:47:0x0134, B:48:0x0140, B:49:0x0150, B:50:0x0159, B:53:0x0160, B:55:0x0168, B:57:0x016c, B:59:0x0172, B:61:0x017a, B:63:0x0182, B:65:0x0185, B:70:0x018a, B:79:0x0197, B:81:0x0198, B:84:0x019f, B:86:0x01ad, B:87:0x01b0, B:89:0x01b5, B:91:0x01c5, B:92:0x01c8, B:93:0x01cd, B:95:0x01e4, B:97:0x01e8, B:99:0x01f6, B:102:0x0200, B:104:0x0205, B:106:0x020b, B:147:0x0213, B:109:0x021b, B:111:0x0241, B:114:0x024a, B:116:0x026c, B:117:0x026f, B:118:0x0275, B:120:0x027a, B:122:0x028a, B:124:0x0290, B:127:0x0294, B:129:0x0298, B:126:0x029d, B:134:0x02a2, B:136:0x02c5, B:138:0x02cf, B:140:0x02a7, B:142:0x02b1, B:155:0x02dc, B:157:0x02e8, B:158:0x02f4, B:160:0x0300, B:162:0x0328, B:163:0x0348, B:164:0x034d, B:165:0x035f, B:174:0x036a, B:175:0x036b, B:176:0x0372, B:177:0x037a, B:178:0x038f, B:180:0x03bb, B:188:0x04e4, B:189:0x04a9, B:215:0x04a5, B:229:0x04f5, B:230:0x0505, B:243:0x03de, B:246:0x03f1, B:248:0x0401, B:250:0x0418, B:252:0x0422, B:259:0x0506, B:261:0x051b, B:263:0x0529, B:265:0x0538, B:267:0x0544, B:269:0x0573, B:270:0x0578, B:271:0x057c, B:273:0x0580, B:274:0x058d, B:277:0x06c6, B:279:0x06ce, B:281:0x06d6, B:284:0x06db, B:285:0x06e7, B:287:0x06ed, B:289:0x06f5, B:295:0x0706, B:297:0x070c, B:299:0x0726, B:301:0x072c, B:294:0x0731, B:308:0x0736, B:310:0x073a, B:312:0x0740, B:314:0x0744, B:316:0x074c, B:318:0x0752, B:320:0x075c, B:323:0x0762, B:324:0x0765, B:326:0x076e, B:328:0x0780, B:330:0x0788, B:332:0x0790, B:336:0x0799, B:341:0x07bd, B:346:0x07c9, B:348:0x07d3, B:349:0x07da, B:351:0x07ec, B:352:0x0802, B:354:0x0808, B:358:0x0853, B:359:0x0811, B:361:0x0818, B:364:0x0821, B:366:0x082b, B:371:0x0838, B:373:0x083e, B:380:0x0850, B:388:0x0862, B:390:0x0868, B:394:0x0875, B:396:0x087d, B:398:0x0881, B:399:0x088c, B:401:0x0892, B:402:0x0971, B:405:0x0979, B:407:0x097e, B:409:0x0986, B:411:0x0994, B:413:0x099b, B:417:0x099f, B:419:0x09a5, B:421:0x09ae, B:423:0x09b4, B:425:0x09bf, B:426:0x09e3, B:428:0x09e9, B:431:0x09f2, B:433:0x09f6, B:437:0x09ff, B:439:0x0a05, B:441:0x0a63, B:443:0x0a67, B:450:0x0a7b, B:452:0x0a7f, B:453:0x0a8a, B:455:0x0a87, B:459:0x09c6, B:462:0x09d4, B:463:0x09db, B:464:0x09dc, B:465:0x089b, B:467:0x08a2, B:469:0x08a6, B:472:0x091c, B:474:0x0928, B:477:0x08b2, B:479:0x08b6, B:481:0x08c8, B:482:0x08d6, B:484:0x08e2, B:487:0x08eb, B:489:0x08f5, B:494:0x0900, B:499:0x092c, B:501:0x0932, B:503:0x0936, B:506:0x093f, B:508:0x094d, B:510:0x0955, B:512:0x095f, B:514:0x0964, B:516:0x0969, B:517:0x096e, B:519:0x085b, B:525:0x059a, B:527:0x05a0, B:529:0x05a9, B:532:0x05b4, B:534:0x05ba, B:537:0x05c8, B:540:0x05ce, B:542:0x05d6, B:546:0x05d9, B:548:0x05e1, B:550:0x05ef, B:552:0x0622, B:554:0x062c, B:557:0x0637, B:559:0x063f, B:561:0x0642, B:565:0x0646, B:567:0x064c, B:569:0x0656, B:571:0x0660, B:573:0x0671, B:577:0x0677, B:576:0x0682, B:583:0x0685, B:585:0x068b, B:588:0x0690, B:590:0x0696, B:592:0x069e, B:594:0x06a4, B:596:0x06aa, B:600:0x06b8, B:601:0x06c0, B:603:0x06c3, B:609:0x058a, B:611:0x0a8f, B:614:0x0a96, B:616:0x0a9e, B:619:0x0abc), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.ij4, com.google.android.gms.internal.ads.dc3] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z11;
        k34 m24826h;
        long j11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        v34 v34Var;
        boolean z15;
        boolean z16;
        long j12;
        int i12;
        k34 m24826h2;
        boolean z17;
        k34 m24825g;
        k34 m23821g;
        k34 m24822d;
        boolean z18;
        int i13;
        l34 m24827i;
        long j13;
        gf4 gf4Var;
        boolean z19;
        long j14;
        long j15;
        Throwable th2;
        Throwable th3;
        boolean z21;
        long j16;
        long j17;
        long m21902e0;
        v34 v34Var2;
        int i14;
        v34 m21910i0;
        int i15;
        int i16;
        List list;
        zg4 zg4Var;
        List list2;
        zg4 zg4Var2;
        int i17;
        long j18;
        List list3;
        zg4 zg4Var3;
        try {
            try {
                int i18 = -1;
                switch (message.what) {
                    case 0:
                        this.f19961K.m21258a(1);
                        m21916o(false, false, false, true);
                        this.f19986u.zzb();
                        m21924w(true != this.f19960J.f29164a.m24700o() ? 2 : 4);
                        this.f19957G.m26849f(this.f19987v);
                        this.f19988w.mo20006f(2);
                        break;
                    case 1:
                        m21923v(message.arg1 != 0, message.arg2, true, 1);
                        break;
                    case 2:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f19988w.zze(2);
                        if (this.f19960J.f29164a.m24700o() || !this.f19957G.m26852i()) {
                            j11 = uptimeMillis;
                            i11 = 3;
                        } else {
                            this.f19956F.m24832n(this.f19974X);
                            if (this.f19956F.m24835q() && (m24827i = this.f19956F.m24827i(this.f19974X, this.f19960J)) != null) {
                                k34 m24839u = this.f19956F.m24839u(this.f19983r, this.f19984s, this.f19986u.zzi(), this.f19957G, m24827i, this.f19985t);
                                m24839u.f23125a.mo21710n(this, m24827i.f23713b);
                                if (this.f19956F.m24825g() == m24839u) {
                                    m21918q(m24827i.f23713b);
                                }
                                m21909i(false);
                            }
                            if (this.f19966P) {
                                this.f19966P = m21884F();
                                m21879A();
                            } else {
                                m21914m();
                            }
                            k34 m24826h3 = this.f19956F.m24826h();
                            if (m24826h3 != null) {
                                if (m24826h3.m23821g() != null && !this.f19964N) {
                                    k34 m24826h4 = this.f19956F.m24826h();
                                    if (m24826h4.f23128d) {
                                        int i19 = 0;
                                        while (true) {
                                            c44[] c44VarArr = this.f19981p;
                                            int length = c44VarArr.length;
                                            if (i19 < 2) {
                                                c44 c44Var = c44VarArr[i19];
                                                vg4 vg4Var = m24826h4.f23127c[i19];
                                                if (c44Var.zzm() == vg4Var) {
                                                    if (vg4Var == null || c44Var.mo20801e()) {
                                                        i19++;
                                                    } else {
                                                        m24826h4.m23821g();
                                                        boolean z22 = m24826h4.f23130f.f23717f;
                                                    }
                                                }
                                            } else if (m24826h3.m23821g().f23128d || this.f19974X >= m24826h3.m23821g().m23820f()) {
                                                bj4 m23823i = m24826h3.m23823i();
                                                k34 m24823e = this.f19956F.m24823e();
                                                bj4 m23823i2 = m24823e.m23823i();
                                                mr0 mr0Var = this.f19960J.f29164a;
                                                j11 = uptimeMillis;
                                                m21882D(mr0Var, m24823e.f23130f.f23712a, mr0Var, m24826h3.f23130f.f23712a, -9223372036854775807L);
                                                if (!m24823e.f23128d || m24823e.f23125a.zzd() == -9223372036854775807L) {
                                                    int i21 = 0;
                                                    while (true) {
                                                        int length2 = this.f19981p.length;
                                                        if (i21 < 2) {
                                                            boolean m20532b = m23823i.m20532b(i21);
                                                            boolean m20532b2 = m23823i2.m20532b(i21);
                                                            if (m20532b && !this.f19981p[i21].mo20803i()) {
                                                                this.f19983r[i21].zzb();
                                                                e44 e44Var = m23823i.f17772b[i21];
                                                                e44 e44Var2 = m23823i2.f17772b[i21];
                                                                if (!m20532b2 || !e44Var2.equals(e44Var)) {
                                                                    m21893O(this.f19981p[i21], m24823e.m23820f());
                                                                }
                                                            }
                                                            i21++;
                                                        }
                                                    }
                                                } else {
                                                    long m23820f = m24823e.m23820f();
                                                    c44[] c44VarArr2 = this.f19981p;
                                                    int length3 = c44VarArr2.length;
                                                    for (int i22 = 0; i22 < 2; i22++) {
                                                        c44 c44Var2 = c44VarArr2[i22];
                                                        if (c44Var2.zzm() != null) {
                                                            m21893O(c44Var2, m23820f);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    j11 = uptimeMillis;
                                    if (m24826h3.f23130f.f23720i || this.f19964N) {
                                        int i23 = 0;
                                        while (true) {
                                            c44[] c44VarArr3 = this.f19981p;
                                            int length4 = c44VarArr3.length;
                                            if (i23 < 2) {
                                                c44 c44Var3 = c44VarArr3[i23];
                                                vg4 vg4Var2 = m24826h3.f23127c[i23];
                                                if (vg4Var2 != null && c44Var3.zzm() == vg4Var2 && c44Var3.mo20801e()) {
                                                    long j19 = m24826h3.f23130f.f23716e;
                                                    m21893O(c44Var3, (j19 == -9223372036854775807L || j19 == Long.MIN_VALUE) ? -9223372036854775807L : m24826h3.m23819e() + j19);
                                                }
                                                i23++;
                                            }
                                        }
                                    }
                                }
                                m24826h2 = this.f19956F.m24826h();
                                if (m24826h2 != null && this.f19956F.m24825g() != m24826h2 && !m24826h2.f23131g) {
                                    k34 m24826h5 = this.f19956F.m24826h();
                                    bj4 m23823i3 = m24826h5.m23823i();
                                    i13 = 0;
                                    boolean z23 = false;
                                    while (true) {
                                        c44[] c44VarArr4 = this.f19981p;
                                        int length5 = c44VarArr4.length;
                                        if (i13 >= 2) {
                                            c44 c44Var4 = c44VarArr4[i13];
                                            if (m21885G(c44Var4)) {
                                                vg4 zzm = c44Var4.zzm();
                                                vg4 vg4Var3 = m24826h5.f23127c[i13];
                                                if (!m23823i3.m20532b(i13) || zzm != vg4Var3) {
                                                    if (!c44Var4.mo20803i()) {
                                                        c44Var4.mo20802f(m21890L(m23823i3.f17773c[i13]), m24826h5.f23127c[i13], m24826h5.m23820f(), m24826h5.m23819e());
                                                    } else if (c44Var4.zzM()) {
                                                        m21901e(c44Var4);
                                                    } else {
                                                        z23 = true;
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else if (!z23) {
                                            m21903f();
                                        }
                                    }
                                }
                                z17 = false;
                                while (m21888J() && !this.f19964N && (m24825g = this.f19956F.m24825g()) != null && (m23821g = m24825g.m23821g()) != null && this.f19974X >= m23821g.m23820f() && m23821g.f23131g) {
                                    if (z17) {
                                        m21915n();
                                    }
                                    m24822d = this.f19956F.m24822d();
                                    m24822d.getClass();
                                    if (this.f19960J.f29165b.f20363a.equals(m24822d.f23130f.f23712a.f20363a)) {
                                        gf4 gf4Var2 = this.f19960J.f29165b;
                                        if (gf4Var2.f20364b == i18) {
                                            gf4 gf4Var3 = m24822d.f23130f.f23712a;
                                            if (gf4Var3.f20364b == i18 && gf4Var2.f20367e != gf4Var3.f20367e) {
                                                z18 = true;
                                                l34 l34Var = m24822d.f23130f;
                                                gf4 gf4Var4 = l34Var.f23712a;
                                                long j21 = l34Var.f23713b;
                                                this.f19960J = m21910i0(gf4Var4, j21, l34Var.f23714c, j21, !z18, 0);
                                                m21917p();
                                                m21881C();
                                                z17 = true;
                                                i18 = -1;
                                            }
                                        }
                                    }
                                    z18 = false;
                                    l34 l34Var2 = m24822d.f23130f;
                                    gf4 gf4Var42 = l34Var2.f23712a;
                                    long j212 = l34Var2.f23713b;
                                    this.f19960J = m21910i0(gf4Var42, j212, l34Var2.f23714c, j212, !z18, 0);
                                    m21917p();
                                    m21881C();
                                    z17 = true;
                                    i18 = -1;
                                }
                                i11 = 3;
                            }
                            j11 = uptimeMillis;
                            m24826h2 = this.f19956F.m24826h();
                            if (m24826h2 != null) {
                                k34 m24826h52 = this.f19956F.m24826h();
                                bj4 m23823i32 = m24826h52.m23823i();
                                i13 = 0;
                                boolean z232 = false;
                                while (true) {
                                    c44[] c44VarArr42 = this.f19981p;
                                    int length52 = c44VarArr42.length;
                                    if (i13 >= 2) {
                                    }
                                    i13++;
                                }
                            }
                            z17 = false;
                            while (m21888J()) {
                                if (z17) {
                                }
                                m24822d = this.f19956F.m24822d();
                                m24822d.getClass();
                                if (this.f19960J.f29165b.f20363a.equals(m24822d.f23130f.f23712a.f20363a)) {
                                }
                                z18 = false;
                                l34 l34Var22 = m24822d.f23130f;
                                gf4 gf4Var422 = l34Var22.f23712a;
                                long j2122 = l34Var22.f23713b;
                                this.f19960J = m21910i0(gf4Var422, j2122, l34Var22.f23714c, j2122, !z18, 0);
                                m21917p();
                                m21881C();
                                z17 = true;
                                i18 = -1;
                            }
                            i11 = 3;
                        }
                        int i24 = this.f19960J.f29168e;
                        if (i24 != 1 && i24 != 4) {
                            k34 m24825g2 = this.f19956F.m24825g();
                            if (m24825g2 == null) {
                                m21920s(j11, 10L);
                                break;
                            } else {
                                long j22 = j11;
                                int i25 = g92.f20474a;
                                Trace.beginSection("doSomeWork");
                                m21881C();
                                if (m24825g2.f23128d) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                    m24825g2.f23125a.mo21709l(this.f19960J.f29181r - this.f19952B, false);
                                    z12 = true;
                                    z13 = true;
                                    int i26 = 0;
                                    while (true) {
                                        c44[] c44VarArr5 = this.f19981p;
                                        int length6 = c44VarArr5.length;
                                        if (i26 < 2) {
                                            c44 c44Var5 = c44VarArr5[i26];
                                            if (m21885G(c44Var5)) {
                                                c44Var5.mo20806m(this.f19974X, elapsedRealtime);
                                                z13 = z13 && c44Var5.zzM();
                                                vg4 vg4Var4 = m24825g2.f23127c[i26];
                                                vg4 zzm2 = c44Var5.zzm();
                                                boolean z24 = vg4Var4 != zzm2 || (vg4Var4 == zzm2 && c44Var5.mo20801e()) || c44Var5.zzN() || c44Var5.zzM();
                                                z12 = z12 && z24;
                                                if (!z24) {
                                                    c44Var5.zzr();
                                                }
                                            }
                                            i26++;
                                        }
                                    }
                                } else {
                                    m24825g2.f23125a.zzk();
                                    z12 = true;
                                    z13 = true;
                                }
                                long j23 = m24825g2.f23130f.f23716e;
                                if (z13 && m24825g2.f23128d && (j23 == -9223372036854775807L || j23 <= this.f19960J.f29181r)) {
                                    if (this.f19964N) {
                                        this.f19964N = false;
                                        m21923v(false, this.f19960J.f29176m, false, 5);
                                    }
                                    if (m24825g2.f23130f.f23720i) {
                                        m21924w(4);
                                        m21927z();
                                        int i27 = 2;
                                        if (this.f19960J.f29168e == 2) {
                                            int i28 = 0;
                                            while (true) {
                                                c44[] c44VarArr6 = this.f19981p;
                                                int length7 = c44VarArr6.length;
                                                if (i28 < i27) {
                                                    if (m21885G(c44VarArr6[i28]) && this.f19981p[i28].zzm() == m24825g2.f23127c[i28]) {
                                                        this.f19981p[i28].zzr();
                                                    }
                                                    i28++;
                                                    i27 = 2;
                                                } else {
                                                    v34 v34Var3 = this.f19960J;
                                                    if (!v34Var3.f29170g && v34Var3.f29180q < 500000 && m21884F()) {
                                                        if (this.f19978b0 == -9223372036854775807L) {
                                                            this.f19978b0 = SystemClock.elapsedRealtime();
                                                        } else if (SystemClock.elapsedRealtime() - this.f19978b0 >= 4000) {
                                                            throw new IllegalStateException("Playback stuck buffering and not loading");
                                                        }
                                                        boolean z25 = !m21888J() && this.f19960J.f29168e == i11;
                                                        z14 = !this.f19971U && this.f19970T && z25;
                                                        v34Var = this.f19960J;
                                                        if (v34Var.f29178o == z14) {
                                                            j12 = j22;
                                                            z15 = z25;
                                                            z16 = z14;
                                                            this.f19960J = new v34(v34Var.f29164a, v34Var.f29165b, v34Var.f29166c, v34Var.f29167d, v34Var.f29168e, v34Var.f29169f, v34Var.f29170g, v34Var.f29171h, v34Var.f29172i, v34Var.f29173j, v34Var.f29174k, v34Var.f29175l, v34Var.f29176m, v34Var.f29177n, v34Var.f29179p, v34Var.f29180q, v34Var.f29181r, z16);
                                                        } else {
                                                            z15 = z25;
                                                            z16 = z14;
                                                            j12 = j22;
                                                        }
                                                        this.f19970T = false;
                                                        if (!z16 && (i12 = this.f19960J.f29168e) != 4) {
                                                            if (!z15 || i12 == 2) {
                                                                m21920s(j12, 10L);
                                                            } else if (i12 == 3 && this.f19972V != 0) {
                                                                m21920s(j12, 1000L);
                                                            }
                                                            Trace.endSection();
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        this.f19978b0 = -9223372036854775807L;
                                        if (m21888J()) {
                                        }
                                        if (this.f19971U) {
                                        }
                                        v34Var = this.f19960J;
                                        if (v34Var.f29178o == z14) {
                                        }
                                        this.f19970T = false;
                                        if (!z16) {
                                            if (z15) {
                                            }
                                            m21920s(j12, 10L);
                                            Trace.endSection();
                                        }
                                    }
                                }
                                v34 v34Var4 = this.f19960J;
                                if (v34Var4.f29168e == 2) {
                                    if (this.f19972V == 0) {
                                        if (m21886H()) {
                                            m21924w(i11);
                                            this.f19977a0 = null;
                                            if (m21888J()) {
                                                m21925x();
                                            }
                                        }
                                    } else if (z12) {
                                        if (v34Var4.f29170g) {
                                            long m28383b = m21889K(v34Var4.f29164a, this.f19956F.m24825g().f23130f.f23712a) ? this.f19980d0.m28383b() : -9223372036854775807L;
                                            k34 m24824f = this.f19956F.m24824f();
                                            boolean z26 = m24824f.m23832r() && m24824f.f23130f.f23720i;
                                            boolean z27 = m24824f.f23130f.f23712a.m22262b() && !m24824f.f23128d;
                                            if (!z26) {
                                                if (!z27) {
                                                    break;
                                                }
                                            }
                                        }
                                        m21924w(i11);
                                        this.f19977a0 = null;
                                        if (m21888J()) {
                                        }
                                    }
                                    int i272 = 2;
                                    if (this.f19960J.f29168e == 2) {
                                    }
                                    this.f19978b0 = -9223372036854775807L;
                                    if (m21888J()) {
                                    }
                                    if (this.f19971U) {
                                    }
                                    v34Var = this.f19960J;
                                    if (v34Var.f29178o == z14) {
                                    }
                                    this.f19970T = false;
                                    if (!z16) {
                                    }
                                }
                                if (this.f19960J.f29168e == i11) {
                                    if (this.f19972V == 0) {
                                        if (!m21886H()) {
                                            this.f19965O = m21888J();
                                            m21924w(2);
                                            if (this.f19965O) {
                                                for (k34 m24825g3 = this.f19956F.m24825g(); m24825g3 != null; m24825g3 = m24825g3.m23821g()) {
                                                    for (ui4 ui4Var : m24825g3.m23823i().f17773c) {
                                                    }
                                                }
                                                this.f19980d0.m28384c();
                                            }
                                            m21927z();
                                        }
                                    }
                                }
                                int i2722 = 2;
                                if (this.f19960J.f29168e == 2) {
                                }
                                this.f19978b0 = -9223372036854775807L;
                                if (m21888J()) {
                                }
                                if (this.f19971U) {
                                }
                                v34Var = this.f19960J;
                                if (v34Var.f29178o == z14) {
                                }
                                this.f19970T = false;
                                if (!z16) {
                                }
                            }
                        }
                        break;
                    case 3:
                        e34 e34Var = (e34) message.obj;
                        this.f19961K.m21258a(1);
                        Pair m21908h0 = m21908h0(this.f19960J.f29164a, e34Var, true, this.f19967Q, this.f19968R, this.f19991z, this.f19951A);
                        if (m21908h0 == null) {
                            Pair m21906g0 = m21906g0(this.f19960J.f29164a);
                            gf4Var = (gf4) m21906g0.first;
                            long longValue = ((Long) m21906g0.second).longValue();
                            j13 = -9223372036854775807L;
                            z19 = !this.f19960J.f29164a.m24700o();
                            j14 = longValue;
                        } else {
                            Object obj = m21908h0.first;
                            long longValue2 = ((Long) m21908h0.second).longValue();
                            j13 = e34Var.f19505c == -9223372036854775807L ? -9223372036854775807L : longValue2;
                            gf4 m24829k = this.f19956F.m24829k(this.f19960J.f29164a, obj, longValue2);
                            if (m24829k.m22262b()) {
                                this.f19960J.f29164a.mo23650n(m24829k.f20363a, this.f19951A);
                                if (this.f19951A.m22983e(m24829k.f20364b) == m24829k.f20365c) {
                                    this.f19951A.m22987i();
                                }
                                gf4Var = m24829k;
                                j14 = 0;
                                z19 = true;
                            } else {
                                gf4Var = m24829k;
                                z19 = e34Var.f19505c == -9223372036854775807L;
                                j14 = longValue2;
                            }
                        }
                        try {
                            try {
                                if (this.f19960J.f29164a.m24700o()) {
                                    this.f19973W = e34Var;
                                } else if (m21908h0 == null) {
                                    if (this.f19960J.f29168e != 1) {
                                        m21924w(4);
                                    }
                                    m21916o(false, true, false, true);
                                } else {
                                    try {
                                        if (gf4Var.equals(this.f19960J.f29165b)) {
                                            k34 m24825g4 = this.f19956F.m24825g();
                                            j17 = (m24825g4 == null || !m24825g4.f23128d || j14 == 0) ? j14 : m24825g4.f23125a.mo21708k(j14, this.f19959I);
                                            j15 = j13;
                                            try {
                                                if (g92.m22352j0(j17) == g92.m22352j0(this.f19960J.f29181r) && ((i14 = (v34Var2 = this.f19960J).f29168e) == 2 || i14 == 3)) {
                                                    long j24 = v34Var2.f29181r;
                                                    m21910i0 = m21910i0(gf4Var, j24, j15, j24, z19, 2);
                                                    this.f19960J = m21910i0;
                                                    break;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                th2 = th;
                                                th3 = th2;
                                                z21 = z19;
                                                j16 = j14;
                                                this.f19960J = m21910i0(gf4Var, j16, j15, j16, z21, 2);
                                                throw th3;
                                            }
                                        } else {
                                            j15 = j13;
                                            j17 = j14;
                                        }
                                        v34 v34Var5 = this.f19960J;
                                        mr0 mr0Var2 = v34Var5.f29164a;
                                        m21882D(mr0Var2, gf4Var, mr0Var2, v34Var5.f29165b, j15);
                                        m21910i0 = m21910i0(gf4Var, m21902e0, j15, m21902e0, z19, 2);
                                        this.f19960J = m21910i0;
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                        z21 = z19;
                                        j16 = m21902e0;
                                        this.f19960J = m21910i0(gf4Var, j16, j15, j16, z21, 2);
                                        throw th3;
                                    }
                                    m21902e0 = m21902e0(gf4Var, j17, this.f19960J.f29168e == 4);
                                    z19 |= j14 != m21902e0;
                                }
                                j15 = j13;
                                m21902e0 = j14;
                                m21910i0 = m21910i0(gf4Var, m21902e0, j15, m21902e0, z19, 2);
                                this.f19960J = m21910i0;
                            } catch (Throwable th6) {
                                th2 = th6;
                                j15 = j13;
                                th3 = th2;
                                z21 = z19;
                                j16 = j14;
                                this.f19960J = m21910i0(gf4Var, j16, j15, j16, z21, 2);
                                throw th3;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j15 = j13;
                        }
                        break;
                    case 4:
                        this.f19953C.mo23127j((kc0) message.obj);
                        m21912k(this.f19953C.zzc(), true);
                        break;
                    case 5:
                        this.f19959I = (f44) message.obj;
                        break;
                    case 6:
                        m21926y(false, true);
                        break;
                    case 7:
                        m21916o(true, false, true, false);
                        this.f19986u.zzc();
                        m21924w(1);
                        this.f19989x.quit();
                        synchronized (this) {
                            this.f19962L = true;
                            notifyAll();
                        }
                        return true;
                    case 8:
                        if (this.f19956F.m24833o((ef4) message.obj)) {
                            k34 m24824f2 = this.f19956F.m24824f();
                            m24824f2.m23826l(this.f19953C.zzc().f23210a, this.f19960J.f29164a);
                            m21880B(m24824f2.m23822h(), m24824f2.m23823i());
                            if (m24824f2 == this.f19956F.m24825g()) {
                                m21918q(m24824f2.f23130f.f23713b);
                                m21903f();
                                v34 v34Var6 = this.f19960J;
                                gf4 gf4Var5 = v34Var6.f29165b;
                                long j25 = m24824f2.f23130f.f23713b;
                                this.f19960J = m21910i0(gf4Var5, j25, v34Var6.f29166c, j25, false, 5);
                            }
                            m21914m();
                            break;
                        }
                        break;
                    case 9:
                        if (this.f19956F.m24833o((ef4) message.obj)) {
                            this.f19956F.m24832n(this.f19974X);
                            m21914m();
                            break;
                        }
                        break;
                    case 10:
                        float f11 = this.f19953C.zzc().f23210a;
                        k34 m24825g5 = this.f19956F.m24825g();
                        k34 m24826h6 = this.f19956F.m24826h();
                        boolean z28 = true;
                        while (m24825g5 != null && m24825g5.f23128d) {
                            bj4 m23824j = m24825g5.m23824j(f11, this.f19960J.f29164a);
                            bj4 m23823i4 = m24825g5.m23823i();
                            if (m23823i4 != null && m23823i4.f17773c.length == m23824j.f17773c.length) {
                                for (int i29 = 0; i29 < m23824j.f17773c.length; i29++) {
                                    if (m23824j.m20531a(m23823i4, i29)) {
                                    }
                                }
                                z28 &= m24825g5 != m24826h6;
                                m24825g5 = m24825g5.m23821g();
                            }
                            if (z28) {
                                k34 m24825g6 = this.f19956F.m24825g();
                                boolean m24834p = this.f19956F.m24834p(m24825g6);
                                int length8 = this.f19981p.length;
                                boolean[] zArr = new boolean[2];
                                long m23816b = m24825g6.m23816b(m23824j, this.f19960J.f29181r, m24834p, zArr);
                                v34 v34Var7 = this.f19960J;
                                boolean z29 = (v34Var7.f29168e == 4 || m23816b == v34Var7.f29181r) ? false : true;
                                v34 v34Var8 = this.f19960J;
                                i15 = 2;
                                k34 k34Var = m24825g6;
                                this.f19960J = m21910i0(v34Var8.f29165b, m23816b, v34Var8.f29166c, v34Var8.f29167d, z29, 5);
                                if (z29) {
                                    m21918q(m23816b);
                                }
                                int length9 = this.f19981p.length;
                                boolean[] zArr2 = new boolean[2];
                                int i31 = 0;
                                while (true) {
                                    c44[] c44VarArr7 = this.f19981p;
                                    int length10 = c44VarArr7.length;
                                    if (i31 < 2) {
                                        c44 c44Var6 = c44VarArr7[i31];
                                        boolean m21885G = m21885G(c44Var6);
                                        zArr2[i31] = m21885G;
                                        k34 k34Var2 = k34Var;
                                        vg4 vg4Var5 = k34Var2.f23127c[i31];
                                        if (m21885G) {
                                            if (vg4Var5 != c44Var6.zzm()) {
                                                m21901e(c44Var6);
                                            } else if (zArr[i31]) {
                                                c44Var6.mo20797a(this.f19974X);
                                            }
                                        }
                                        i31++;
                                        k34Var = k34Var2;
                                    } else {
                                        m21905g(zArr2);
                                    }
                                }
                            } else {
                                i15 = 2;
                                this.f19956F.m24834p(m24825g5);
                                if (m24825g5.f23128d) {
                                    m24825g5.m23815a(m23824j, Math.max(m24825g5.f23130f.f23713b, this.f19974X - m24825g5.m23819e()), false);
                                }
                            }
                            m21909i(true);
                            if (this.f19960J.f29168e != 4) {
                                m21914m();
                                m21881C();
                                this.f19988w.mo20006f(i15);
                                break;
                            }
                        }
                        break;
                    case 11:
                        int i32 = message.arg1;
                        this.f19967Q = i32;
                        if (!this.f19956F.m24837s(this.f19960J.f29164a, i32)) {
                            m21921t(true);
                        }
                        m21909i(false);
                        break;
                    case 12:
                        boolean z31 = message.arg1 != 0;
                        this.f19968R = z31;
                        if (!this.f19956F.m24838t(this.f19960J.f29164a, z31)) {
                            m21921t(true);
                        }
                        m21909i(false);
                        break;
                    case 13:
                        boolean z32 = message.arg1 != 0;
                        AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                        if (this.f19969S != z32) {
                            this.f19969S = z32;
                            if (!z32) {
                                c44[] c44VarArr8 = this.f19981p;
                                int length11 = c44VarArr8.length;
                                for (int i33 = 0; i33 < 2; i33++) {
                                    c44 c44Var7 = c44VarArr8[i33];
                                    if (!m21885G(c44Var7) && this.f19982q.remove(c44Var7)) {
                                        c44Var7.zzA();
                                    }
                                }
                            }
                        }
                        if (atomicBoolean != null) {
                            synchronized (this) {
                                atomicBoolean.set(true);
                                notifyAll();
                            }
                            break;
                        }
                        break;
                    case 14:
                        m21922u((y34) message.obj);
                        break;
                    case 15:
                        final y34 y34Var = (y34) message.obj;
                        Looper m28109b = y34Var.m28109b();
                        if (!m28109b.getThread().isAlive()) {
                            lr1.m24356e("TAG", "Trying to send message on a dead thread.");
                            y34Var.m28115h(false);
                            break;
                        } else {
                            this.f19955E.mo27578a(m28109b, null).mo20005e(new Runnable() { // from class: com.google.android.gms.internal.ads.y24
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f34.m21897a0(y34Var);
                                }
                            });
                            break;
                        }
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        m21912k((kc0) message.obj, false);
                        break;
                    case 17:
                        b34 b34Var = (b34) message.obj;
                        this.f19961K.m21258a(1);
                        i16 = b34Var.f17525b;
                        if (i16 != -1) {
                            list2 = b34Var.f17524a;
                            zg4Var2 = b34Var.f17527d;
                            z34 z34Var = new z34(list2, zg4Var2, null);
                            i17 = b34Var.f17525b;
                            j18 = b34Var.f17526c;
                            this.f19973W = new e34(z34Var, i17, j18);
                        }
                        u34 u34Var = this.f19957G;
                        list = b34Var.f17524a;
                        zg4Var = b34Var.f17527d;
                        m21911j(u34Var.m26855l(list, zg4Var), false);
                        break;
                    case 18:
                        b34 b34Var2 = (b34) message.obj;
                        int i34 = message.arg1;
                        this.f19961K.m21258a(1);
                        u34 u34Var2 = this.f19957G;
                        if (i34 == -1) {
                            i34 = u34Var2.m26846a();
                        }
                        list3 = b34Var2.f17524a;
                        zg4Var3 = b34Var2.f17527d;
                        m21911j(u34Var2.m26853j(i34, list3, zg4Var3), false);
                        break;
                    case 19:
                        AbstractC30228a.m149044a(message.obj);
                        this.f19961K.m21258a(1);
                        throw null;
                    case 20:
                        int i35 = message.arg1;
                        int i36 = message.arg2;
                        zg4 zg4Var4 = (zg4) message.obj;
                        this.f19961K.m21258a(1);
                        m21911j(this.f19957G.m26854k(i35, i36, zg4Var4), false);
                        break;
                    case 21:
                        zg4 zg4Var5 = (zg4) message.obj;
                        this.f19961K.m21258a(1);
                        m21911j(this.f19957G.m26856m(zg4Var5), false);
                        break;
                    case 22:
                        m21911j(this.f19957G.m26847b(), true);
                        break;
                    case 23:
                        this.f19963M = message.arg1 != 0;
                        m21917p();
                        if (this.f19964N && this.f19956F.m24826h() != this.f19956F.m24825g()) {
                            m21921t(true);
                            m21909i(false);
                            break;
                        }
                        break;
                    case 24:
                        boolean z33 = message.arg1 == 1;
                        if (z33 != this.f19971U) {
                            this.f19971U = z33;
                            if (!z33 && this.f19960J.f29178o) {
                                this.f19988w.mo20006f(2);
                                break;
                            }
                        }
                        break;
                    case 25:
                        m21921t(true);
                        break;
                    default:
                        return false;
                }
            } catch (zzbu e11) {
                m21907h(e11, e11.f31926q == 1 ? true != e11.f31925p ? 3003 : 3001 : 1000);
            } catch (zzey e12) {
                m21907h(e12, e12.f32099p);
            } catch (zzha e13) {
                zzha zzhaVar = e13;
                if (zzhaVar.f32139s == 1 && (m24826h = this.f19956F.m24826h()) != null) {
                    zzhaVar = zzhaVar.m28833a(m24826h.f23130f.f23712a);
                }
                if (zzhaVar.f32145y && this.f19977a0 == null) {
                    lr1.m24357f("ExoPlayerImplInternal", "Recoverable renderer error", zzhaVar);
                    this.f19977a0 = zzhaVar;
                    di1 di1Var = this.f19988w;
                    di1Var.mo20004d(di1Var.mo20002b(25, zzhaVar));
                } else {
                    zzha zzhaVar2 = this.f19977a0;
                    if (zzhaVar2 != null) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzhaVar2, zzhaVar);
                        } catch (Exception unused) {
                        }
                        zzhaVar = this.f19977a0;
                    }
                    lr1.m24354c("ExoPlayerImplInternal", "Playback error", zzhaVar);
                    z11 = true;
                    m21926y(true, false);
                    this.f19960J = this.f19960J.m27158d(zzhaVar);
                }
            } catch (zzpi e14) {
                m21907h(e14, e14.f32153p);
            } catch (zzrk e15) {
                m21907h(e15, ZAbstractBase.ZVU_BLEND_PERCENTAGE);
            } catch (IOException e16) {
                m21907h(e16, ZAbstractBase.ZVU_PROCESS_FLUSH);
            }
        } catch (RuntimeException e17) {
            zzha m28832d = zzha.m28832d(e17, ((e17 instanceof IllegalStateException) || (e17 instanceof IllegalArgumentException)) ? 1004 : 1000);
            lr1.m24354c("ExoPlayerImplInternal", "Playback error", m28832d);
            m21926y(true, false);
            this.f19960J = this.f19960J.m27158d(m28832d);
        }
        z11 = true;
        m21915n();
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.t34
    public final void zzh() {
        this.f19988w.mo20006f(22);
    }

    @Override // com.google.android.gms.internal.ads.zi4
    public final void zzj() {
        this.f19988w.mo20006f(10);
    }
}
