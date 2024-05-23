package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.bm */
/* loaded from: classes2.dex */
public final class C4359bm implements InterfaceC4543gm, InterfaceC4687kj, InterfaceC5063un, InterfaceC4877pm {

    /* renamed from: D */
    private InterfaceC4506fm f17867D;

    /* renamed from: E */
    private InterfaceC4911qj f17868E;

    /* renamed from: F */
    private boolean f17869F;

    /* renamed from: G */
    private boolean f17870G;

    /* renamed from: H */
    private boolean f17871H;

    /* renamed from: I */
    private boolean f17872I;

    /* renamed from: J */
    private int f17873J;

    /* renamed from: K */
    private C5137wm f17874K;

    /* renamed from: L */
    private long f17875L;

    /* renamed from: M */
    private boolean[] f17876M;

    /* renamed from: N */
    private boolean[] f17877N;

    /* renamed from: O */
    private boolean f17878O;

    /* renamed from: Q */
    private long f17880Q;

    /* renamed from: S */
    private int f17882S;

    /* renamed from: T */
    private boolean f17883T;

    /* renamed from: U */
    private boolean f17884U;

    /* renamed from: V */
    private final C4915qn f17885V;

    /* renamed from: p */
    private final Uri f17886p;

    /* renamed from: q */
    private final InterfaceC4840on f17887q;

    /* renamed from: r */
    private final int f17888r;

    /* renamed from: s */
    private final Handler f17889s;

    /* renamed from: t */
    private final InterfaceC4395cm f17890t;

    /* renamed from: u */
    private final InterfaceC4580hm f17891u;

    /* renamed from: v */
    private final long f17892v;

    /* renamed from: x */
    private final C5247zl f17894x;

    /* renamed from: w */
    private final C5249zn f17893w = new C5249zn("Loader:ExtractorMediaPeriod");

    /* renamed from: y */
    private final C4434do f17895y = new C4434do();

    /* renamed from: z */
    private final Runnable f17896z = new RunnableC5061ul(this);

    /* renamed from: A */
    private final Runnable f17864A = new RunnableC5098vl(this);

    /* renamed from: B */
    private final Handler f17865B = new Handler();

    /* renamed from: R */
    private long f17881R = -9223372036854775807L;

    /* renamed from: C */
    private final SparseArray f17866C = new SparseArray();

    /* renamed from: P */
    private long f17879P = -1;

    public C4359bm(Uri uri, InterfaceC4840on interfaceC4840on, InterfaceC4614ij[] interfaceC4614ijArr, int i11, Handler handler, InterfaceC4395cm interfaceC4395cm, InterfaceC4580hm interfaceC4580hm, C4915qn c4915qn, String str, int i12, byte[] bArr) {
        this.f17886p = uri;
        this.f17887q = interfaceC4840on;
        this.f17888r = i11;
        this.f17889s = handler;
        this.f17890t = interfaceC4395cm;
        this.f17891u = interfaceC4580hm;
        this.f17885V = c4915qn;
        this.f17892v = i12;
        this.f17894x = new C5247zl(interfaceC4614ijArr, this);
    }

    /* renamed from: m */
    private final int m20572m() {
        int size = this.f17866C.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((C4914qm) this.f17866C.valueAt(i12)).m25799e();
        }
        return i11;
    }

    /* renamed from: n */
    private final long m20573n() {
        int size = this.f17866C.size();
        long j11 = Long.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            j11 = Math.max(j11, ((C4914qm) this.f17866C.valueAt(i11)).m25801g());
        }
        return j11;
    }

    /* renamed from: o */
    private final void m20574o(C5210yl c5210yl) {
        long j11;
        if (this.f17879P == -1) {
            j11 = c5210yl.f31000i;
            this.f17879P = j11;
        }
    }

    /* renamed from: p */
    private final void m20575p() {
        InterfaceC4911qj interfaceC4911qj;
        C5210yl c5210yl = new C5210yl(this, this.f17886p, this.f17887q, this.f17894x, this.f17895y);
        if (this.f17870G) {
            AbstractC4361bo.m20613e(m20576q());
            long j11 = this.f17875L;
            if (j11 != -9223372036854775807L && this.f17881R >= j11) {
                this.f17883T = true;
                this.f17881R = -9223372036854775807L;
                return;
            } else {
                c5210yl.m28224b(this.f17868E.mo22451a(this.f17881R), this.f17881R);
                this.f17881R = -9223372036854775807L;
            }
        }
        this.f17882S = m20572m();
        int i11 = this.f17888r;
        if (i11 == -1) {
            if (!this.f17870G || this.f17879P != -1 || ((interfaceC4911qj = this.f17868E) != null && interfaceC4911qj.zza() != -9223372036854775807L)) {
                i11 = 3;
            } else {
                i11 = 6;
            }
        }
        this.f17893w.m28557a(c5210yl, this, i11);
    }

    /* renamed from: q */
    private final boolean m20576q() {
        return this.f17881R != -9223372036854775807L;
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m20583y(C4359bm c4359bm) {
        if (!c4359bm.f17884U && !c4359bm.f17870G && c4359bm.f17868E != null && c4359bm.f17869F) {
            int size = c4359bm.f17866C.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((C4914qm) c4359bm.f17866C.valueAt(i11)).m25802h() == null) {
                    return;
                }
            }
            c4359bm.f17895y.m21513b();
            C5099vm[] c5099vmArr = new C5099vm[size];
            c4359bm.f17877N = new boolean[size];
            c4359bm.f17876M = new boolean[size];
            c4359bm.f17875L = c4359bm.f17868E.zza();
            int i12 = 0;
            while (true) {
                boolean z11 = true;
                if (i12 < size) {
                    zzasw m25802h = ((C4914qm) c4359bm.f17866C.valueAt(i12)).m25802h();
                    c5099vmArr[i12] = new C5099vm(m25802h);
                    String str = m25802h.f31836u;
                    if (!AbstractC4545go.m22494b(str) && !AbstractC4545go.m22493a(str)) {
                        z11 = false;
                    }
                    c4359bm.f17877N[i12] = z11;
                    c4359bm.f17878O = z11 | c4359bm.f17878O;
                    i12++;
                } else {
                    c4359bm.f17874K = new C5137wm(c5099vmArr);
                    c4359bm.f17870G = true;
                    c4359bm.f17891u.mo21748b(new C5062um(c4359bm.f17875L, c4359bm.f17868E.zzc()), null);
                    c4359bm.f17867D.mo22084f(c4359bm);
                    return;
                }
            }
        }
    }

    /* renamed from: A */
    public final void m20584A() {
        this.f17893w.m28560h(new RunnableC5136wl(this, this.f17894x));
        this.f17865B.removeCallbacksAndMessages(null);
        this.f17884U = true;
    }

    /* renamed from: B */
    public final void m20585B(int i11, long j11) {
        C4914qm c4914qm = (C4914qm) this.f17866C.valueAt(i11);
        if (this.f17883T && j11 > c4914qm.m25801g()) {
            c4914qm.m25806l();
        } else {
            c4914qm.m25808n(j11, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm, com.google.android.gms.internal.ads.InterfaceC5025tm
    /* renamed from: a */
    public final boolean mo20586a(long j11) {
        if (!this.f17883T) {
            if (!this.f17870G || this.f17873J != 0) {
                boolean m21514c = this.f17895y.m21514c();
                if (!this.f17893w.m28561i()) {
                    m20575p();
                    return true;
                }
                return m21514c;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4687kj
    /* renamed from: b */
    public final void mo20587b(InterfaceC4911qj interfaceC4911qj) {
        this.f17868E = interfaceC4911qj;
        this.f17865B.post(this.f17896z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:            if (r1 != false) goto L115;     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo20588c(AbstractC5248zm[] abstractC5248zmArr, boolean[] zArr, InterfaceC4951rm[] interfaceC4951rmArr, boolean[] zArr2, long j11) {
        AbstractC5248zm abstractC5248zm;
        boolean z11;
        int i11;
        AbstractC4361bo.m20613e(this.f17870G);
        for (int i12 = 0; i12 < abstractC5248zmArr.length; i12++) {
            InterfaceC4951rm interfaceC4951rm = interfaceC4951rmArr[i12];
            if (interfaceC4951rm != null && (abstractC5248zmArr[i12] == null || !zArr[i12])) {
                i11 = ((C4322am) interfaceC4951rm).f17179a;
                AbstractC4361bo.m20613e(this.f17876M[i11]);
                this.f17873J--;
                this.f17876M[i11] = false;
                ((C4914qm) this.f17866C.valueAt(i11)).m25803i();
                interfaceC4951rmArr[i12] = null;
            }
        }
        boolean z12 = false;
        for (int i13 = 0; i13 < abstractC5248zmArr.length; i13++) {
            if (interfaceC4951rmArr[i13] == null && (abstractC5248zm = abstractC5248zmArr[i13]) != null) {
                abstractC5248zm.m28544b();
                if (abstractC5248zm.m28543a(0) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC4361bo.m20613e(z11);
                int m27654a = this.f17874K.m27654a(abstractC5248zm.m28546d());
                AbstractC4361bo.m20613e(!this.f17876M[m27654a]);
                this.f17873J++;
                this.f17876M[m27654a] = true;
                interfaceC4951rmArr[i13] = new C4322am(this, m27654a);
                zArr2[i13] = true;
                z12 = true;
            }
        }
        if (!this.f17871H) {
            int size = this.f17866C.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (!this.f17876M[i14]) {
                    ((C4914qm) this.f17866C.valueAt(i14)).m25803i();
                }
            }
        }
        if (this.f17873J == 0) {
            this.f17872I = false;
            C5249zn c5249zn = this.f17893w;
            if (c5249zn.m28561i()) {
                c5249zn.m28558f();
            }
        } else if (!this.f17871H) {
            if (j11 == 0) {
                j11 = 0;
            }
            j11 = mo20590e(j11);
            for (int i15 = 0; i15 < interfaceC4951rmArr.length; i15++) {
                if (interfaceC4951rmArr[i15] != null) {
                    zArr2[i15] = true;
                }
            }
        }
        this.f17871H = true;
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: d */
    public final void mo20589d(InterfaceC4506fm interfaceC4506fm, long j11) {
        this.f17867D = interfaceC4506fm;
        this.f17895y.m21514c();
        m20575p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: e */
    public final long mo20590e(long j11) {
        if (true != this.f17868E.zzc()) {
            j11 = 0;
        }
        this.f17880Q = j11;
        int size = this.f17866C.size();
        boolean m20576q = true ^ m20576q();
        int i11 = 0;
        while (true) {
            if (m20576q) {
                if (i11 >= size) {
                    break;
                }
                if (this.f17876M[i11]) {
                    m20576q = ((C4914qm) this.f17866C.valueAt(i11)).m25808n(j11, false);
                }
                i11++;
            } else {
                this.f17881R = j11;
                this.f17883T = false;
                C5249zn c5249zn = this.f17893w;
                if (c5249zn.m28561i()) {
                    c5249zn.m28558f();
                } else {
                    for (int i12 = 0; i12 < size; i12++) {
                        ((C4914qm) this.f17866C.valueAt(i12)).m25804j(this.f17876M[i12]);
                    }
                }
            }
        }
        this.f17872I = false;
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4687kj
    /* renamed from: f */
    public final InterfaceC4985sj mo20591f(int i11, int i12) {
        C4914qm c4914qm = (C4914qm) this.f17866C.get(i11);
        if (c4914qm == null) {
            C4914qm c4914qm2 = new C4914qm(this.f17885V, null);
            c4914qm2.m25805k(this);
            this.f17866C.put(i11, c4914qm2);
            return c4914qm2;
        }
        return c4914qm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4877pm
    /* renamed from: g */
    public final void mo20592g(zzasw zzaswVar) {
        this.f17865B.post(this.f17896z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063un
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo20593h(InterfaceC5138wn interfaceC5138wn, long j11, long j12, boolean z11) {
        m20574o((C5210yl) interfaceC5138wn);
        if (!z11 && this.f17873J > 0) {
            int size = this.f17866C.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((C4914qm) this.f17866C.valueAt(i11)).m25804j(this.f17876M[i11]);
            }
            this.f17867D.mo22891g(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063un
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo20594i(InterfaceC5138wn interfaceC5138wn, long j11, long j12) {
        long j13;
        m20574o((C5210yl) interfaceC5138wn);
        this.f17883T = true;
        if (this.f17875L == -9223372036854775807L) {
            long m20573n = m20573n();
            if (m20573n == Long.MIN_VALUE) {
                j13 = 0;
            } else {
                j13 = m20573n + 10000;
            }
            this.f17875L = j13;
            this.f17891u.mo21748b(new C5062um(j13, this.f17868E.zzc()), null);
        }
        this.f17867D.mo22891g(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: j */
    public final void mo20595j(long j11) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063un
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ int mo20596k(InterfaceC5138wn interfaceC5138wn, long j11, long j12, IOException iOException) {
        InterfaceC4911qj interfaceC4911qj;
        boolean z11;
        C5210yl c5210yl = (C5210yl) interfaceC5138wn;
        m20574o(c5210yl);
        Handler handler = this.f17889s;
        if (handler != null) {
            handler.post(new RunnableC5173xl(this, iOException));
        }
        if (iOException instanceof zzayu) {
            return 3;
        }
        int m20572m = m20572m();
        int i11 = this.f17882S;
        if (this.f17879P == -1 && ((interfaceC4911qj = this.f17868E) == null || interfaceC4911qj.zza() == -9223372036854775807L)) {
            this.f17880Q = 0L;
            this.f17872I = this.f17870G;
            int size = this.f17866C.size();
            for (int i12 = 0; i12 < size; i12++) {
                C4914qm c4914qm = (C4914qm) this.f17866C.valueAt(i12);
                if (!this.f17870G || this.f17876M[i12]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c4914qm.m25804j(z11);
            }
            c5210yl.m28224b(0L, 0L);
        }
        this.f17882S = m20572m();
        if (m20572m > i11) {
            return 1;
        }
        return 0;
    }

    /* renamed from: l */
    public final boolean m20597l(int i11) {
        if (this.f17883T) {
            return true;
        }
        if (!m20576q() && ((C4914qm) this.f17866C.valueAt(i11)).m25807m()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final int m20598r(int i11, C4648jh c4648jh, C4392cj c4392cj, boolean z11) {
        if (!this.f17872I && !m20576q()) {
            return ((C4914qm) this.f17866C.valueAt(i11)).m25800f(c4648jh, c4392cj, z11, this.f17883T, this.f17880Q);
        }
        return -3;
    }

    /* renamed from: z */
    public final void m20599z() {
        this.f17893w.m28559g(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm, com.google.android.gms.internal.ads.InterfaceC5025tm
    public final long zza() {
        if (this.f17873J == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4687kj
    public final void zzb() {
        this.f17869F = true;
        this.f17865B.post(this.f17896z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final long zzg() {
        long m20573n;
        if (this.f17883T) {
            return Long.MIN_VALUE;
        }
        if (m20576q()) {
            return this.f17881R;
        }
        if (this.f17878O) {
            int size = this.f17866C.size();
            m20573n = Long.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f17877N[i11]) {
                    m20573n = Math.min(m20573n, ((C4914qm) this.f17866C.valueAt(i11)).m25801g());
                }
            }
        } else {
            m20573n = m20573n();
        }
        if (m20573n == Long.MIN_VALUE) {
            return this.f17880Q;
        }
        return m20573n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final long zzh() {
        if (!this.f17872I) {
            return -9223372036854775807L;
        }
        this.f17872I = false;
        return this.f17880Q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final C5137wm zzn() {
        return this.f17874K;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final void zzs() {
        this.f17893w.m28559g(Integer.MIN_VALUE);
    }
}
