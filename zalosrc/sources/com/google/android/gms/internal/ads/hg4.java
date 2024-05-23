package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s00.AbstractC26080o;

/* loaded from: classes2.dex */
public final class hg4 implements ef4, mm4, pj4, uj4, tg4 {

    /* renamed from: a0 */
    private static final Map f21670a0;

    /* renamed from: b0 */
    private static final C4671k3 f21671b0;

    /* renamed from: C */
    private df4 f21674C;

    /* renamed from: D */
    private zzacm f21675D;

    /* renamed from: G */
    private boolean f21678G;

    /* renamed from: H */
    private boolean f21679H;

    /* renamed from: I */
    private boolean f21680I;

    /* renamed from: J */
    private gg4 f21681J;

    /* renamed from: K */
    private InterfaceC4779n f21682K;

    /* renamed from: M */
    private boolean f21684M;

    /* renamed from: O */
    private boolean f21686O;

    /* renamed from: P */
    private boolean f21687P;

    /* renamed from: Q */
    private int f21688Q;

    /* renamed from: R */
    private boolean f21689R;

    /* renamed from: S */
    private long f21690S;

    /* renamed from: U */
    private boolean f21692U;

    /* renamed from: V */
    private int f21693V;

    /* renamed from: W */
    private boolean f21694W;

    /* renamed from: X */
    private boolean f21695X;

    /* renamed from: Y */
    private final nj4 f21696Y;

    /* renamed from: Z */
    private final jj4 f21697Z;

    /* renamed from: p */
    private final Uri f21698p;

    /* renamed from: q */
    private final qj2 f21699q;

    /* renamed from: r */
    private final jc4 f21700r;

    /* renamed from: s */
    private final pf4 f21701s;

    /* renamed from: t */
    private final dc4 f21702t;

    /* renamed from: u */
    private final dg4 f21703u;

    /* renamed from: v */
    private final long f21704v;

    /* renamed from: x */
    private final xf4 f21706x;

    /* renamed from: w */
    private final wj4 f21705w = new wj4("ProgressiveMediaPeriod");

    /* renamed from: y */
    private final ya1 f21707y = new ya1(w81.f29846a);

    /* renamed from: z */
    private final Runnable f21708z = new Runnable() { // from class: com.google.android.gms.internal.ads.yf4
        public /* synthetic */ yf4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hg4.this.m22822B();
        }
    };

    /* renamed from: A */
    private final Runnable f21672A = new Runnable() { // from class: com.google.android.gms.internal.ads.zf4
        public /* synthetic */ zf4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hg4.this.m22849q();
        }
    };

    /* renamed from: B */
    private final Handler f21673B = g92.m22339d(null);

    /* renamed from: F */
    private fg4[] f21677F = new fg4[0];

    /* renamed from: E */
    private ug4[] f21676E = new ug4[0];

    /* renamed from: T */
    private long f21691T = -9223372036854775807L;

    /* renamed from: L */
    private long f21683L = -9223372036854775807L;

    /* renamed from: N */
    private int f21685N = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f21670a0 = Collections.unmodifiableMap(hashMap);
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26511h("icy");
        c5004t1.m26523s("application/x-icy");
        f21671b0 = c5004t1.m26529y();
    }

    public hg4(Uri uri, qj2 qj2Var, xf4 xf4Var, jc4 jc4Var, dc4 dc4Var, nj4 nj4Var, pf4 pf4Var, dg4 dg4Var, jj4 jj4Var, String str, int i11, byte[] bArr) {
        this.f21698p = uri;
        this.f21699q = qj2Var;
        this.f21700r = jc4Var;
        this.f21702t = dc4Var;
        this.f21696Y = nj4Var;
        this.f21701s = pf4Var;
        this.f21703u = dg4Var;
        this.f21697Z = jj4Var;
        this.f21704v = i11;
        this.f21706x = xf4Var;
    }

    /* renamed from: A */
    private final void m22821A() {
        v71.m27175f(this.f21679H);
        this.f21681J.getClass();
        this.f21682K.getClass();
    }

    /* renamed from: B */
    public final void m22822B() {
        boolean z11;
        zzbq m28709c;
        int i11;
        if (!this.f21695X && !this.f21679H && this.f21678G && this.f21682K != null) {
            for (ug4 ug4Var : this.f21676E) {
                if (ug4Var.m26958x() == null) {
                    return;
                }
            }
            this.f21707y.m28165c();
            int length = this.f21676E.length;
            jt0[] jt0VarArr = new jt0[length];
            boolean[] zArr = new boolean[length];
            for (int i12 = 0; i12 < length; i12++) {
                C4671k3 m26958x = this.f21676E[i12].m26958x();
                m26958x.getClass();
                String str = m26958x.f23099l;
                boolean m23849g = k70.m23849g(str);
                if (m23849g || k70.m23850h(str)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zArr[i12] = z11;
                this.f21680I = z11 | this.f21680I;
                zzacm zzacmVar = this.f21675D;
                if (zzacmVar != null) {
                    if (m23849g || this.f21677F[i12].f20112b) {
                        zzbq zzbqVar = m26958x.f23097j;
                        if (zzbqVar == null) {
                            m28709c = new zzbq(-9223372036854775807L, zzacmVar);
                        } else {
                            m28709c = zzbqVar.m28709c(zzacmVar);
                        }
                        C5004t1 m23809b = m26958x.m23809b();
                        m23809b.m26517m(m28709c);
                        m26958x = m23809b.m26529y();
                    }
                    if (m23849g && m26958x.f23093f == -1 && m26958x.f23094g == -1 && (i11 = zzacmVar.f31757p) != -1) {
                        C5004t1 m23809b2 = m26958x.m23809b();
                        m23809b2.m26504d0(i11);
                        m26958x = m23809b2.m26529y();
                    }
                }
                jt0VarArr[i12] = new jt0(Integer.toString(i12), m26958x.m23810c(this.f21700r.mo21985b(m26958x)));
            }
            this.f21681J = new gg4(new dh4(jt0VarArr), zArr);
            this.f21679H = true;
            df4 df4Var = this.f21674C;
            df4Var.getClass();
            df4Var.mo21382d(this);
        }
    }

    /* renamed from: C */
    private final void m22823C(int i11) {
        m22821A();
        gg4 gg4Var = this.f21681J;
        boolean[] zArr = gg4Var.f20583d;
        if (!zArr[i11]) {
            C4671k3 m23747b = gg4Var.f20580a.m21393b(i11).m23747b(0);
            this.f21701s.m25444d(k70.m23844b(m23747b.f23099l), m23747b, 0, null, this.f21690S);
            zArr[i11] = true;
        }
    }

    /* renamed from: D */
    private final void m22824D(int i11) {
        m22821A();
        boolean[] zArr = this.f21681J.f20581b;
        if (this.f21692U && zArr[i11] && !this.f21676E[i11].m26951J(false)) {
            this.f21691T = 0L;
            this.f21692U = false;
            this.f21687P = true;
            this.f21690S = 0L;
            this.f21693V = 0;
            for (ug4 ug4Var : this.f21676E) {
                ug4Var.m26946E(false);
            }
            df4 df4Var = this.f21674C;
            df4Var.getClass();
            df4Var.mo21937c(this);
        }
    }

    /* renamed from: E */
    private final void m22825E() {
        wo2 wo2Var;
        long j11;
        long j12;
        cg4 cg4Var = new cg4(this, this.f21698p, this.f21699q, this.f21706x, this, this.f21707y);
        if (this.f21679H) {
            v71.m27175f(m22826F());
            long j13 = this.f21683L;
            if (j13 != -9223372036854775807L && this.f21691T > j13) {
                this.f21694W = true;
                this.f21691T = -9223372036854775807L;
                return;
            }
            InterfaceC4779n interfaceC4779n = this.f21682K;
            interfaceC4779n.getClass();
            cg4.m20876f(cg4Var, interfaceC4779n.mo20362b(this.f21691T).f23656a.f25386b, this.f21691T);
            for (ug4 ug4Var : this.f21676E) {
                ug4Var.m26947F(this.f21691T);
            }
            this.f21691T = -9223372036854775807L;
        }
        this.f21693V = m22838x();
        long m27632a = this.f21705w.m27632a(cg4Var, this, nj4.m24933a(this.f21685N));
        wo2Var = cg4Var.f18401k;
        pf4 pf4Var = this.f21701s;
        j11 = cg4Var.f18391a;
        we4 we4Var = new we4(j11, wo2Var, wo2Var.f30043a, Collections.emptyMap(), m27632a, 0L, 0L);
        j12 = cg4Var.f18400j;
        pf4Var.m25452l(we4Var, 1, -1, null, 0, null, j12, this.f21683L);
    }

    /* renamed from: F */
    private final boolean m22826F() {
        return this.f21691T != -9223372036854775807L;
    }

    /* renamed from: G */
    private final boolean m22827G() {
        return this.f21687P || m22826F();
    }

    /* renamed from: x */
    private final int m22838x() {
        int i11 = 0;
        for (ug4 ug4Var : this.f21676E) {
            i11 += ug4Var.m26955u();
        }
        return i11;
    }

    /* renamed from: y */
    public final long m22839y(boolean z11) {
        long j11 = Long.MIN_VALUE;
        int i11 = 0;
        while (true) {
            ug4[] ug4VarArr = this.f21676E;
            if (i11 < ug4VarArr.length) {
                if (!z11) {
                    gg4 gg4Var = this.f21681J;
                    gg4Var.getClass();
                    if (!gg4Var.f20582c[i11]) {
                        i11++;
                    }
                }
                j11 = Math.max(j11, ug4VarArr[i11].m26957w());
                i11++;
            } else {
                return j11;
            }
        }
    }

    /* renamed from: z */
    private final InterfaceC4928r m22840z(fg4 fg4Var) {
        int length = this.f21676E.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (fg4Var.equals(this.f21677F[i11])) {
                return this.f21676E[i11];
            }
        }
        jj4 jj4Var = this.f21697Z;
        jc4 jc4Var = this.f21700r;
        dc4 dc4Var = this.f21702t;
        jc4Var.getClass();
        ug4 ug4Var = new ug4(jj4Var, jc4Var, dc4Var, null);
        ug4Var.m26948G(this);
        int i12 = length + 1;
        fg4[] fg4VarArr = (fg4[]) Arrays.copyOf(this.f21677F, i12);
        fg4VarArr[length] = fg4Var;
        this.f21677F = (fg4[]) g92.m22310D(fg4VarArr);
        ug4[] ug4VarArr = (ug4[]) Arrays.copyOf(this.f21676E, i12);
        ug4VarArr[length] = ug4Var;
        this.f21676E = (ug4[]) g92.m22310D(ug4VarArr);
        return ug4Var;
    }

    /* renamed from: H */
    public final int m22841H(int i11, h34 h34Var, il3 il3Var, int i12) {
        if (m22827G()) {
            return -3;
        }
        m22823C(i11);
        int m26956v = this.f21676E[i11].m26956v(h34Var, il3Var, i12, this.f21694W);
        if (m26956v == -3) {
            m22824D(i11);
        }
        return m26956v;
    }

    /* renamed from: I */
    public final int m22842I(int i11, long j11) {
        if (m22827G()) {
            return 0;
        }
        m22823C(i11);
        ug4 ug4Var = this.f21676E[i11];
        int m26954t = ug4Var.m26954t(j11, this.f21694W);
        ug4Var.m26949H(m26954t);
        if (m26954t == 0) {
            m22824D(i11);
            return 0;
        }
        return m26954t;
    }

    /* renamed from: N */
    public final InterfaceC4928r m22843N() {
        return m22840z(new fg4(0, true));
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: a */
    public final boolean mo21704a(long j11) {
        if (!this.f21694W && !this.f21705w.m27637k() && !this.f21692U) {
            if (!this.f21679H || this.f21688Q != 0) {
                boolean m28167e = this.f21707y.m28167e();
                if (!this.f21705w.m27638l()) {
                    m22825E();
                    return true;
                }
                return m28167e;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:            if (r2 == 0) goto L98;     */
    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo21705b(ui4[] ui4VarArr, boolean[] zArr, vg4[] vg4VarArr, boolean[] zArr2, long j11) {
        boolean z11;
        ui4 ui4Var;
        boolean z12;
        boolean z13;
        int i11;
        m22821A();
        gg4 gg4Var = this.f21681J;
        dh4 dh4Var = gg4Var.f20580a;
        boolean[] zArr3 = gg4Var.f20582c;
        int i12 = this.f21688Q;
        int i13 = 0;
        for (int i14 = 0; i14 < ui4VarArr.length; i14++) {
            vg4 vg4Var = vg4VarArr[i14];
            if (vg4Var != null && (ui4VarArr[i14] == null || !zArr[i14])) {
                i11 = ((eg4) vg4Var).f19623a;
                v71.m27175f(zArr3[i11]);
                this.f21688Q--;
                zArr3[i11] = false;
                vg4VarArr[i14] = null;
            }
        }
        if (!this.f21686O) {
            if (j11 == 0) {
                j11 = 0;
                z11 = false;
            }
            z11 = true;
        }
        for (int i15 = 0; i15 < ui4VarArr.length; i15++) {
            if (vg4VarArr[i15] == null && (ui4Var = ui4VarArr[i15]) != null) {
                if (ui4Var.zzc() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                v71.m27175f(z12);
                if (ui4Var.mo23616a(0) == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                v71.m27175f(z13);
                int m21392a = dh4Var.m21392a(ui4Var.zze());
                v71.m27175f(!zArr3[m21392a]);
                this.f21688Q++;
                zArr3[m21392a] = true;
                vg4VarArr[i15] = new eg4(this, m21392a);
                zArr2[i15] = true;
                if (!z11) {
                    ug4 ug4Var = this.f21676E[m21392a];
                    if (!ug4Var.m26952K(j11, true) && ug4Var.m26953s() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
        }
        if (this.f21688Q == 0) {
            this.f21692U = false;
            this.f21687P = false;
            if (this.f21705w.m27638l()) {
                ug4[] ug4VarArr = this.f21676E;
                int length = ug4VarArr.length;
                while (i13 < length) {
                    ug4VarArr[i13].m26960z();
                    i13++;
                }
                this.f21705w.m27633g();
            } else {
                for (ug4 ug4Var2 : this.f21676E) {
                    ug4Var2.m26946E(false);
                }
            }
        } else if (z11) {
            j11 = mo21707j(j11);
            while (i13 < vg4VarArr.length) {
                if (vg4VarArr[i13] != null) {
                    zArr2[i13] = true;
                }
                i13++;
            }
        }
        this.f21686O = true;
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    @Override // com.google.android.gms.internal.ads.pj4
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ rj4 mo22844c(tj4 tj4Var, long j11, long j12, IOException iOException, int i11) {
        cb3 cb3Var;
        long j13;
        wo2 wo2Var;
        long j14;
        long j15;
        boolean z11;
        rj4 m27627b;
        InterfaceC4779n interfaceC4779n;
        boolean z12;
        long j16;
        long unused;
        cg4 cg4Var = (cg4) tj4Var;
        cb3Var = cg4Var.f18393c;
        j13 = cg4Var.f18391a;
        wo2Var = cg4Var.f18401k;
        we4 we4Var = new we4(j13, wo2Var, cb3Var.m20856l(), cb3Var.m20857m(), j11, j12, cb3Var.m20855k());
        j14 = cg4Var.f18400j;
        Throwable th2 = new oj4(we4Var, new cf4(1, -1, null, 0, null, g92.m22352j0(j14), g92.m22352j0(this.f21683L)), iOException, i11).f25665c;
        if (!(th2 instanceof zzbu) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof zzfp) && !(th2 instanceof zzwv)) {
            while (th2 != null) {
                if (!(th2 instanceof zzey) || ((zzey) th2).f32099p != 2008) {
                    th2 = th2.getCause();
                }
            }
            j15 = Math.min((r3.f25666d - 1) * 1000, AbstractC26080o.a.f124275b);
            if (j15 != -9223372036854775807L) {
                m27627b = wj4.f29949g;
            } else {
                int m22838x = m22838x();
                if (m22838x > this.f21693V) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!this.f21689R && ((interfaceC4779n = this.f21682K) == null || interfaceC4779n.zze() == -9223372036854775807L)) {
                    boolean z13 = this.f21679H;
                    if (z13 && !m22827G()) {
                        this.f21692U = true;
                        m27627b = wj4.f29948f;
                    } else {
                        this.f21687P = z13;
                        this.f21690S = 0L;
                        this.f21693V = 0;
                        for (ug4 ug4Var : this.f21676E) {
                            ug4Var.m26946E(false);
                        }
                        cg4.m20876f(cg4Var, 0L, 0L);
                    }
                } else {
                    this.f21693V = m22838x;
                }
                m27627b = wj4.m27627b(z11, j15);
            }
            z12 = !m27627b.m26094c();
            pf4 pf4Var = this.f21701s;
            j16 = cg4Var.f18400j;
            pf4Var.m25450j(we4Var, 1, -1, null, 0, null, j16, this.f21683L, iOException, z12);
            if (z12) {
                unused = cg4Var.f18391a;
            }
            return m27627b;
        }
        j15 = -9223372036854775807L;
        if (j15 != -9223372036854775807L) {
        }
        z12 = !m27627b.m26094c();
        pf4 pf4Var2 = this.f21701s;
        j16 = cg4Var.f18400j;
        pf4Var2.m25450j(we4Var, 1, -1, null, 0, null, j16, this.f21683L, iOException, z12);
        if (z12) {
        }
        return m27627b;
    }

    @Override // com.google.android.gms.internal.ads.uj4
    /* renamed from: d */
    public final void mo22845d() {
        for (ug4 ug4Var : this.f21676E) {
            ug4Var.m26945D();
        }
        this.f21706x.zze();
    }

    @Override // com.google.android.gms.internal.ads.pj4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo22846e(tj4 tj4Var, long j11, long j12) {
        cb3 cb3Var;
        long j13;
        wo2 wo2Var;
        long j14;
        InterfaceC4779n interfaceC4779n;
        long j15;
        long unused;
        if (this.f21683L == -9223372036854775807L && (interfaceC4779n = this.f21682K) != null) {
            boolean zzh = interfaceC4779n.zzh();
            long m22839y = m22839y(true);
            if (m22839y == Long.MIN_VALUE) {
                j15 = 0;
            } else {
                j15 = m22839y + 10000;
            }
            this.f21683L = j15;
            this.f21703u.mo21385c(j15, zzh, this.f21684M);
        }
        cg4 cg4Var = (cg4) tj4Var;
        cb3Var = cg4Var.f18393c;
        j13 = cg4Var.f18391a;
        wo2Var = cg4Var.f18401k;
        we4 we4Var = new we4(j13, wo2Var, cb3Var.m20856l(), cb3Var.m20857m(), j11, j12, cb3Var.m20855k());
        unused = cg4Var.f18391a;
        pf4 pf4Var = this.f21701s;
        j14 = cg4Var.f18400j;
        pf4Var.m25448h(we4Var, 1, -1, null, 0, null, j14, this.f21683L);
        this.f21694W = true;
        df4 df4Var = this.f21674C;
        df4Var.getClass();
        df4Var.mo21937c(this);
    }

    @Override // com.google.android.gms.internal.ads.mm4
    /* renamed from: f */
    public final void mo21603f(InterfaceC4779n interfaceC4779n) {
        this.f21673B.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bg4

            /* renamed from: q */
            public final /* synthetic */ InterfaceC4779n f17744q;

            public /* synthetic */ bg4(InterfaceC4779n interfaceC4779n2) {
                r2 = interfaceC4779n2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hg4.this.m22851s(r2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: g */
    public final void mo21706g(long j11) {
    }

    @Override // com.google.android.gms.internal.ads.tg4
    /* renamed from: h */
    public final void mo22847h(C4671k3 c4671k3) {
        this.f21673B.post(this.f21708z);
    }

    @Override // com.google.android.gms.internal.ads.mm4
    /* renamed from: i */
    public final InterfaceC4928r mo21604i(int i11, int i12) {
        return m22840z(new fg4(i11, false));
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: j */
    public final long mo21707j(long j11) {
        m22821A();
        boolean[] zArr = this.f21681J.f20581b;
        if (true != this.f21682K.zzh()) {
            j11 = 0;
        }
        this.f21687P = false;
        this.f21690S = j11;
        if (m22826F()) {
            this.f21691T = j11;
            return j11;
        }
        if (this.f21685N != 7) {
            int length = this.f21676E.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (this.f21676E[i11].m26952K(j11, false) || (!zArr[i11] && this.f21680I)) {
                }
            }
            return j11;
        }
        this.f21692U = false;
        this.f21691T = j11;
        this.f21694W = false;
        wj4 wj4Var = this.f21705w;
        if (wj4Var.m27638l()) {
            for (ug4 ug4Var : this.f21676E) {
                ug4Var.m26960z();
            }
            this.f21705w.m27633g();
        } else {
            wj4Var.m27634h();
            for (ug4 ug4Var2 : this.f21676E) {
                ug4Var2.m26946E(false);
            }
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: k */
    public final long mo21708k(long j11, f44 f44Var) {
        long j12;
        boolean z11;
        m22821A();
        if (!this.f21682K.zzh()) {
            return 0L;
        }
        C4704l mo20362b = this.f21682K.mo20362b(j11);
        long j13 = mo20362b.f23656a.f25385a;
        long j14 = mo20362b.f23657b.f25385a;
        long j15 = f44Var.f20009a;
        if (j15 == 0) {
            if (f44Var.f20010b == 0) {
                return j11;
            }
            j12 = 0;
        } else {
            j12 = j15;
        }
        long m22348h0 = g92.m22348h0(j11, j12, Long.MIN_VALUE);
        long m22334a0 = g92.m22334a0(j11, f44Var.f20010b, Long.MAX_VALUE);
        boolean z12 = true;
        if (m22348h0 <= j13 && j13 <= m22334a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m22348h0 > j14 || j14 > m22334a0) {
            z12 = false;
        }
        if (z11 && z12) {
            if (Math.abs(j13 - j11) > Math.abs(j14 - j11)) {
                return j14;
            }
        } else if (!z11) {
            if (z12) {
                return j14;
            }
            return m22348h0;
        }
        return j13;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: l */
    public final void mo21709l(long j11, boolean z11) {
        m22821A();
        if (m22826F()) {
            return;
        }
        boolean[] zArr = this.f21681J.f20582c;
        int length = this.f21676E.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f21676E[i11].m26959y(j11, false, zArr[i11]);
        }
    }

    @Override // com.google.android.gms.internal.ads.pj4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo22848m(tj4 tj4Var, long j11, long j12, boolean z11) {
        cb3 cb3Var;
        long j13;
        wo2 wo2Var;
        long j14;
        long unused;
        cg4 cg4Var = (cg4) tj4Var;
        cb3Var = cg4Var.f18393c;
        j13 = cg4Var.f18391a;
        wo2Var = cg4Var.f18401k;
        we4 we4Var = new we4(j13, wo2Var, cb3Var.m20856l(), cb3Var.m20857m(), j11, j12, cb3Var.m20855k());
        unused = cg4Var.f18391a;
        pf4 pf4Var = this.f21701s;
        j14 = cg4Var.f18400j;
        pf4Var.m25446f(we4Var, 1, -1, null, 0, null, j14, this.f21683L);
        if (!z11) {
            for (ug4 ug4Var : this.f21676E) {
                ug4Var.m26946E(false);
            }
            if (this.f21688Q > 0) {
                df4 df4Var = this.f21674C;
                df4Var.getClass();
                df4Var.mo21937c(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: n */
    public final void mo21710n(df4 df4Var, long j11) {
        this.f21674C = df4Var;
        this.f21707y.m28167e();
        m22825E();
    }

    /* renamed from: q */
    public final /* synthetic */ void m22849q() {
        if (!this.f21695X) {
            df4 df4Var = this.f21674C;
            df4Var.getClass();
            df4Var.mo21937c(this);
        }
    }

    /* renamed from: r */
    public final /* synthetic */ void m22850r() {
        this.f21689R = true;
    }

    /* renamed from: s */
    public final /* synthetic */ void m22851s(InterfaceC4779n interfaceC4779n) {
        InterfaceC4779n c4741m;
        if (this.f21675D == null) {
            c4741m = interfaceC4779n;
        } else {
            c4741m = new C4741m(-9223372036854775807L, 0L);
        }
        this.f21682K = c4741m;
        this.f21683L = interfaceC4779n.zze();
        boolean z11 = false;
        int i11 = 1;
        if (!this.f21689R && interfaceC4779n.zze() == -9223372036854775807L) {
            z11 = true;
        }
        this.f21684M = z11;
        if (true == z11) {
            i11 = 7;
        }
        this.f21685N = i11;
        this.f21703u.mo21385c(this.f21683L, interfaceC4779n.zzh(), this.f21684M);
        if (!this.f21679H) {
            m22822B();
        }
    }

    /* renamed from: t */
    final void m22852t() {
        this.f21705w.m27635i(nj4.m24933a(this.f21685N));
    }

    /* renamed from: u */
    public final void m22853u(int i11) {
        this.f21676E[i11].m26943B();
        m22852t();
    }

    /* renamed from: v */
    public final void m22854v() {
        if (this.f21679H) {
            for (ug4 ug4Var : this.f21676E) {
                ug4Var.m26944C();
            }
        }
        this.f21705w.m27636j(this);
        this.f21673B.removeCallbacksAndMessages(null);
        this.f21674C = null;
        this.f21695X = true;
    }

    /* renamed from: w */
    public final boolean m22855w(int i11) {
        if (!m22827G() && this.f21676E[i11].m26951J(this.f21694W)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mm4
    public final void zzC() {
        this.f21678G = true;
        this.f21673B.post(this.f21708z);
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzb() {
        long j11;
        m22821A();
        if (this.f21694W || this.f21688Q == 0) {
            return Long.MIN_VALUE;
        }
        if (m22826F()) {
            return this.f21691T;
        }
        if (this.f21680I) {
            int length = this.f21676E.length;
            j11 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                gg4 gg4Var = this.f21681J;
                if (gg4Var.f20581b[i11] && gg4Var.f20582c[i11] && !this.f21676E[i11].m26950I()) {
                    j11 = Math.min(j11, this.f21676E[i11].m26957w());
                }
            }
        } else {
            j11 = Long.MAX_VALUE;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = m22839y(false);
        }
        if (j11 == Long.MIN_VALUE) {
            return this.f21690S;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final long zzd() {
        if (this.f21687P) {
            if (this.f21694W || m22838x() > this.f21693V) {
                this.f21687P = false;
                return this.f21690S;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final dh4 zzh() {
        m22821A();
        return this.f21681J.f20580a;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final void zzk() {
        m22852t();
        if (this.f21694W && !this.f21679H) {
            throw zzbu.m28711a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final boolean zzp() {
        return this.f21705w.m27638l() && this.f21707y.m28166d();
    }
}
