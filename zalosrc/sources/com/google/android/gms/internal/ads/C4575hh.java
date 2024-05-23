package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.hh */
/* loaded from: classes2.dex */
public final class C4575hh implements Handler.Callback, InterfaceC4506fm, InterfaceC4618in, InterfaceC4580hm {

    /* renamed from: A */
    private C4722lh f21709A;

    /* renamed from: B */
    private InterfaceC4760mh f21710B;

    /* renamed from: C */
    private InterfaceC4508fo f21711C;

    /* renamed from: D */
    private InterfaceC4617im f21712D;

    /* renamed from: E */
    private InterfaceC4760mh[] f21713E;

    /* renamed from: F */
    private boolean f21714F;

    /* renamed from: G */
    private boolean f21715G;

    /* renamed from: H */
    private boolean f21716H;

    /* renamed from: I */
    private boolean f21717I;

    /* renamed from: L */
    private int f21720L;

    /* renamed from: M */
    private int f21721M;

    /* renamed from: N */
    private long f21722N;

    /* renamed from: O */
    private int f21723O;

    /* renamed from: P */
    private C4501fh f21724P;

    /* renamed from: Q */
    private long f21725Q;

    /* renamed from: R */
    private C4427dh f21726R;

    /* renamed from: S */
    private C4427dh f21727S;

    /* renamed from: T */
    private C4427dh f21728T;

    /* renamed from: U */
    private AbstractC4983sh f21729U;

    /* renamed from: V */
    private boolean f21730V;

    /* renamed from: W */
    private boolean f21731W;

    /* renamed from: X */
    private int f21732X;

    /* renamed from: Y */
    private volatile int f21733Y;

    /* renamed from: Z */
    private volatile int f21734Z;

    /* renamed from: a0 */
    private final co0 f21735a0;

    /* renamed from: p */
    private final InterfaceC4760mh[] f21736p;

    /* renamed from: r */
    private final AbstractC4654jn f21738r;

    /* renamed from: s */
    private final C4767mo f21739s;

    /* renamed from: t */
    private final Handler f21740t;

    /* renamed from: u */
    private final HandlerThread f21741u;

    /* renamed from: v */
    private final Handler f21742v;

    /* renamed from: w */
    private final InterfaceC5242zg f21743w;

    /* renamed from: x */
    private final C4946rh f21744x;

    /* renamed from: y */
    private final C4909qh f21745y;

    /* renamed from: z */
    private C4464eh f21746z;

    /* renamed from: K */
    private int f21719K = 0;

    /* renamed from: J */
    private int f21718J = 1;

    /* renamed from: q */
    private final InterfaceC4797nh[] f21737q = new InterfaceC4797nh[2];

    public C4575hh(InterfaceC4760mh[] interfaceC4760mhArr, AbstractC4654jn abstractC4654jn, co0 co0Var, boolean z11, int i11, Handler handler, C4464eh c4464eh, InterfaceC5242zg interfaceC5242zg, byte[] bArr) {
        this.f21736p = interfaceC4760mhArr;
        this.f21738r = abstractC4654jn;
        this.f21735a0 = co0Var;
        this.f21715G = z11;
        this.f21742v = handler;
        this.f21746z = c4464eh;
        this.f21743w = interfaceC5242zg;
        for (int i12 = 0; i12 < 2; i12++) {
            interfaceC4760mhArr[i12].mo24569l(i12);
            this.f21737q[i12] = interfaceC4760mhArr[i12].zzf();
        }
        this.f21739s = new C4767mo();
        this.f21713E = new InterfaceC4760mh[0];
        this.f21744x = new C4946rh();
        this.f21745y = new C4909qh();
        abstractC4654jn.m23658c(this);
        this.f21709A = C4722lh.f23914d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f21741u = handlerThread;
        handlerThread.start();
        this.f21740t = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: K */
    private final int m22856K(int i11, AbstractC4983sh abstractC4983sh, AbstractC4983sh abstractC4983sh2) {
        int mo25465b = abstractC4983sh.mo25465b();
        int i12 = -1;
        for (int i13 = 0; i13 < mo25465b && i12 == -1; i13++) {
            i11 = abstractC4983sh.m26304f(i11, this.f21745y, this.f21744x, this.f21719K);
            i12 = abstractC4983sh2.mo25464a(abstractC4983sh.mo25467d(i11, this.f21745y, true).f26777b);
        }
        return i12;
    }

    /* renamed from: L */
    private final long m22857L(int i11, long j11) {
        C4427dh c4427dh;
        m22875p();
        this.f21716H = false;
        m22872m(2);
        C4427dh c4427dh2 = this.f21728T;
        if (c4427dh2 == null) {
            C4427dh c4427dh3 = this.f21726R;
            if (c4427dh3 != null) {
                c4427dh3.m21388c();
            }
            c4427dh = null;
        } else {
            c4427dh = null;
            while (c4427dh2 != null) {
                if (c4427dh2.f19221g == i11 && c4427dh2.f19224j) {
                    c4427dh = c4427dh2;
                } else {
                    c4427dh2.m21388c();
                }
                c4427dh2 = c4427dh2.f19226l;
            }
        }
        C4427dh c4427dh4 = this.f21728T;
        if (c4427dh4 != c4427dh || c4427dh4 != this.f21727S) {
            for (InterfaceC4760mh interfaceC4760mh : this.f21713E) {
                interfaceC4760mh.zzj();
            }
            this.f21713E = new InterfaceC4760mh[0];
            this.f21711C = null;
            this.f21710B = null;
            this.f21728T = null;
        }
        if (c4427dh != null) {
            c4427dh.f19226l = null;
            this.f21726R = c4427dh;
            this.f21727S = c4427dh;
            m22871l(c4427dh);
            C4427dh c4427dh5 = this.f21728T;
            if (c4427dh5.f19225k) {
                j11 = c4427dh5.f19215a.mo20590e(j11);
            }
            m22868i(j11);
            m22864c();
        } else {
            this.f21726R = null;
            this.f21727S = null;
            this.f21728T = null;
            m22868i(j11);
        }
        this.f21740t.sendEmptyMessage(2);
        return j11;
    }

    /* renamed from: M */
    private final Pair m22858M(int i11, long j11) {
        return m22859N(this.f21729U, 0, -9223372036854775807L);
    }

    /* renamed from: N */
    private final Pair m22859N(AbstractC4983sh abstractC4983sh, int i11, long j11) {
        return m22860O(abstractC4983sh, 0, j11, 0L);
    }

    /* renamed from: O */
    private final Pair m22860O(AbstractC4983sh abstractC4983sh, int i11, long j11, long j12) {
        AbstractC4361bo.m20609a(0, 0, abstractC4983sh.mo25466c());
        abstractC4983sh.mo25468e(0, this.f21744x, false, j12);
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        long j13 = abstractC4983sh.mo25467d(0, this.f21745y, false).f26778c;
        return Pair.create(0, Long.valueOf(j11));
    }

    /* renamed from: P */
    private final Pair m22861P(C4501fh c4501fh) {
        AbstractC4983sh abstractC4983sh = c4501fh.f20113a;
        if (abstractC4983sh.m26306h()) {
            abstractC4983sh = this.f21729U;
        }
        try {
            Pair m22859N = m22859N(abstractC4983sh, 0, c4501fh.f20115c);
            AbstractC4983sh abstractC4983sh2 = this.f21729U;
            if (abstractC4983sh2 == abstractC4983sh) {
                return m22859N;
            }
            if (abstractC4983sh2.mo25464a(abstractC4983sh.mo25467d(((Integer) m22859N.first).intValue(), this.f21745y, true).f26777b) != -1) {
                return Pair.create(0, (Long) m22859N.second);
            }
            if (m22856K(((Integer) m22859N.first).intValue(), abstractC4983sh, this.f21729U) != -1) {
                this.f21729U.mo25467d(0, this.f21745y, false);
                return m22858M(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzasy(this.f21729U, 0, c4501fh.f20115c);
        }
    }

    /* renamed from: Q */
    private final void m22862Q(boolean[] zArr, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        this.f21713E = new InterfaceC4760mh[i11];
        int i13 = 0;
        int i14 = 0;
        while (i13 < 2) {
            InterfaceC4760mh interfaceC4760mh = this.f21736p[i13];
            AbstractC5248zm m22977a = this.f21728T.f19227m.f23389b.m22977a(i13);
            if (m22977a != null) {
                int i15 = i14 + 1;
                this.f21713E[i14] = interfaceC4760mh;
                if (interfaceC4760mh.zzb() == 0) {
                    C4834oh c4834oh = this.f21728T.f19227m.f23391d[i13];
                    if (this.f21715G && this.f21718J == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!zArr[i13] && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m22977a.m28544b();
                    zzasw[] zzaswVarArr = new zzasw[1];
                    for (int i16 = 0; i16 <= 0; i16++) {
                        zzaswVarArr[i16] = m22977a.m28545c(i16);
                    }
                    C4427dh c4427dh = this.f21728T;
                    i12 = i13;
                    interfaceC4760mh.mo24572r(c4834oh, zzaswVarArr, c4427dh.f19218d[i13], this.f21725Q, z12, c4427dh.f19220f - c4427dh.f19222h);
                    InterfaceC4508fo zzi = interfaceC4760mh.zzi();
                    if (zzi != null) {
                        if (this.f21711C == null) {
                            this.f21711C = zzi;
                            this.f21710B = interfaceC4760mh;
                            zzi.mo22105q(this.f21709A);
                        } else {
                            throw zzasi.m28678c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z11) {
                        interfaceC4760mh.mo24568k();
                    }
                } else {
                    i12 = i13;
                }
                i14 = i15;
            } else {
                i12 = i13;
            }
            i13 = i12 + 1;
        }
    }

    /* renamed from: a */
    private final void m22863a(Object obj, int i11) {
        this.f21746z = new C4464eh(0, 0L);
        m22866e(obj, i11);
        this.f21746z = new C4464eh(0, -9223372036854775807L);
        m22872m(4);
        m22867h(false);
    }

    /* renamed from: c */
    private final void m22864c() {
        long zza;
        C4427dh c4427dh = this.f21726R;
        if (!c4427dh.f19224j) {
            zza = 0;
        } else {
            zza = c4427dh.f19215a.zza();
        }
        if (zza == Long.MIN_VALUE) {
            m22870k(false);
            return;
        }
        C4427dh c4427dh2 = this.f21726R;
        long j11 = this.f21725Q - (c4427dh2.f19220f - c4427dh2.f19222h);
        boolean m20974j = this.f21735a0.m20974j(zza - j11);
        m22870k(m20974j);
        if (m20974j) {
            this.f21726R.f19215a.mo20586a(j11);
        }
    }

    /* renamed from: d */
    private final void m22865d() {
        C4427dh c4427dh = this.f21726R;
        if (c4427dh != null && !c4427dh.f19224j) {
            C4427dh c4427dh2 = this.f21727S;
            if (c4427dh2 == null || c4427dh2.f19226l == c4427dh) {
                for (InterfaceC4760mh interfaceC4760mh : this.f21713E) {
                    if (!interfaceC4760mh.zzA()) {
                        return;
                    }
                }
                this.f21726R.f19215a.zzs();
            }
        }
    }

    /* renamed from: e */
    private final void m22866e(Object obj, int i11) {
        this.f21742v.obtainMessage(6, new C4538gh(this.f21729U, obj, this.f21746z, i11)).sendToTarget();
    }

    /* renamed from: h */
    private final void m22867h(boolean z11) {
        this.f21740t.removeMessages(2);
        this.f21716H = false;
        this.f21739s.m24652c();
        this.f21711C = null;
        this.f21710B = null;
        this.f21725Q = 60000000L;
        for (InterfaceC4760mh interfaceC4760mh : this.f21713E) {
            try {
                m22879t(interfaceC4760mh);
                interfaceC4760mh.zzj();
            } catch (zzasi | RuntimeException unused) {
            }
        }
        this.f21713E = new InterfaceC4760mh[0];
        C4427dh c4427dh = this.f21728T;
        if (c4427dh == null) {
            c4427dh = this.f21726R;
        }
        m22880u(c4427dh);
        this.f21726R = null;
        this.f21727S = null;
        this.f21728T = null;
        m22870k(false);
        if (z11) {
            InterfaceC4617im interfaceC4617im = this.f21712D;
            if (interfaceC4617im != null) {
                interfaceC4617im.zzd();
                this.f21712D = null;
            }
            this.f21729U = null;
        }
    }

    /* renamed from: i */
    private final void m22868i(long j11) {
        long j12;
        C4427dh c4427dh = this.f21728T;
        if (c4427dh == null) {
            j12 = j11 + 60000000;
        } else {
            j12 = j11 + (c4427dh.f19220f - c4427dh.f19222h);
        }
        this.f21725Q = j12;
        this.f21739s.m24650a(j12);
        for (InterfaceC4760mh interfaceC4760mh : this.f21713E) {
            interfaceC4760mh.mo24571o(this.f21725Q);
        }
    }

    /* renamed from: j */
    private final void m22869j(long j11, long j12) {
        this.f21740t.removeMessages(2);
        long elapsedRealtime = (j11 + j12) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f21740t.sendEmptyMessage(2);
        } else {
            this.f21740t.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: k */
    private final void m22870k(boolean z11) {
        if (this.f21717I != z11) {
            this.f21717I = z11;
            this.f21742v.obtainMessage(2, z11 ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: l */
    private final void m22871l(C4427dh c4427dh) {
        boolean z11;
        if (this.f21728T == c4427dh) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            InterfaceC4760mh interfaceC4760mh = this.f21736p[i12];
            if (interfaceC4760mh.zzb() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zArr[i12] = z11;
            AbstractC5248zm m22977a = c4427dh.f19227m.f23389b.m22977a(i12);
            if (m22977a != null) {
                i11++;
            }
            if (zArr[i12] && (m22977a == null || (interfaceC4760mh.zzB() && interfaceC4760mh.zzh() == this.f21728T.f19218d[i12]))) {
                if (interfaceC4760mh == this.f21710B) {
                    this.f21739s.m24653d(this.f21711C);
                    this.f21711C = null;
                    this.f21710B = null;
                }
                m22879t(interfaceC4760mh);
                interfaceC4760mh.zzj();
            }
        }
        this.f21728T = c4427dh;
        this.f21742v.obtainMessage(3, c4427dh.f19227m).sendToTarget();
        m22862Q(zArr, i11);
    }

    /* renamed from: m */
    private final void m22872m(int i11) {
        if (this.f21718J != i11) {
            this.f21718J = i11;
            this.f21742v.obtainMessage(1, i11, 0).sendToTarget();
        }
    }

    /* renamed from: n */
    private final void m22873n() {
        this.f21716H = false;
        this.f21739s.m24651b();
        for (InterfaceC4760mh interfaceC4760mh : this.f21713E) {
            interfaceC4760mh.mo24568k();
        }
    }

    /* renamed from: o */
    private final void m22874o() {
        m22867h(true);
        this.f21735a0.m20967c();
        m22872m(1);
    }

    /* renamed from: p */
    private final void m22875p() {
        this.f21739s.m24652c();
        for (InterfaceC4760mh interfaceC4760mh : this.f21713E) {
            m22879t(interfaceC4760mh);
        }
    }

    /* renamed from: q */
    private final void m22876q() {
        long zzg;
        C4427dh c4427dh = this.f21728T;
        if (c4427dh == null) {
            return;
        }
        long zzh = c4427dh.f19215a.zzh();
        if (zzh != -9223372036854775807L) {
            m22868i(zzh);
        } else {
            InterfaceC4760mh interfaceC4760mh = this.f21710B;
            if (interfaceC4760mh != null && !interfaceC4760mh.zzE()) {
                long mo22104m = this.f21711C.mo22104m();
                this.f21725Q = mo22104m;
                this.f21739s.m24650a(mo22104m);
            } else {
                this.f21725Q = this.f21739s.mo22104m();
            }
            C4427dh c4427dh2 = this.f21728T;
            zzh = this.f21725Q - (c4427dh2.f19220f - c4427dh2.f19222h);
        }
        this.f21746z.f19627c = zzh;
        this.f21722N = SystemClock.elapsedRealtime() * 1000;
        if (this.f21713E.length == 0) {
            zzg = Long.MIN_VALUE;
        } else {
            zzg = this.f21728T.f19215a.zzg();
        }
        C4464eh c4464eh = this.f21746z;
        if (zzg == Long.MIN_VALUE) {
            zzg = this.f21729U.mo25467d(this.f21728T.f19221g, this.f21745y, false).f26778c;
        }
        c4464eh.f19628d = zzg;
    }

    /* renamed from: r */
    private final boolean m22877r(int i11) {
        this.f21729U.mo25467d(i11, this.f21745y, false);
        this.f21729U.m26305g(0, this.f21744x, false);
        if (this.f21729U.m26304f(i11, this.f21745y, this.f21744x, this.f21719K) != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private final boolean m22878s(long j11) {
        if (j11 == -9223372036854775807L || this.f21746z.f19627c < j11) {
            return true;
        }
        C4427dh c4427dh = this.f21728T.f19226l;
        if (c4427dh != null && c4427dh.f19224j) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private static final void m22879t(InterfaceC4760mh interfaceC4760mh) {
        if (interfaceC4760mh.zzb() == 2) {
            interfaceC4760mh.zzz();
        }
    }

    /* renamed from: u */
    private static final void m22880u(C4427dh c4427dh) {
        while (c4427dh != null) {
            c4427dh.m21388c();
            c4427dh = c4427dh.f19226l;
        }
    }

    /* renamed from: A */
    public final synchronized void m22881A() {
        if (this.f21714F) {
            return;
        }
        this.f21740t.sendEmptyMessage(6);
        while (!this.f21714F) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f21741u.quit();
    }

    /* renamed from: B */
    public final void m22882B(AbstractC4983sh abstractC4983sh, int i11, long j11) {
        this.f21740t.obtainMessage(3, new C4501fh(abstractC4983sh, 0, j11)).sendToTarget();
    }

    /* renamed from: C */
    public final void m22883C(C5205yg... c5205ygArr) {
        if (this.f21714F) {
            return;
        }
        this.f21720L++;
        this.f21740t.obtainMessage(11, c5205ygArr).sendToTarget();
    }

    /* renamed from: D */
    public final void m22884D(int i11) {
        this.f21734Z = i11;
    }

    /* renamed from: E */
    public final void m22885E(int i11) {
        this.f21733Y = i11;
    }

    /* renamed from: F */
    public final void m22886F(boolean z11) {
        this.f21740t.obtainMessage(1, z11 ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: G */
    public final void m22887G() {
        this.f21740t.sendEmptyMessage(5);
    }

    /* renamed from: H */
    public final synchronized boolean m22888H(C5205yg... c5205ygArr) {
        int i11;
        if (this.f21714F) {
            return true;
        }
        int i12 = this.f21720L;
        this.f21720L = i12 + 1;
        this.f21740t.obtainMessage(11, c5205ygArr).sendToTarget();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f21732X;
        long j12 = elapsedRealtime + j11;
        while (true) {
            i11 = this.f21721M;
            if (i11 > i12 || j11 <= 0) {
                break;
            }
            try {
                wait(j11);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            j11 = j12 - SystemClock.elapsedRealtime();
        }
        if (i12 < i11) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final boolean m22889I() {
        return this.f21731W && this.f21732X > 0;
    }

    /* renamed from: J */
    public final synchronized boolean m22890J() {
        if (this.f21714F) {
            return true;
        }
        this.f21740t.sendEmptyMessage(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f21732X;
        long j12 = elapsedRealtime + j11;
        while (true) {
            if (!this.f21714F) {
                if (j11 <= 0) {
                    break;
                }
                try {
                    wait(j11);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                j11 = j12 - SystemClock.elapsedRealtime();
            } else {
                this.f21741u.quit();
                break;
            }
        }
        return this.f21714F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4580hm
    /* renamed from: b */
    public final void mo21748b(AbstractC4983sh abstractC4983sh, Object obj) {
        this.f21740t.obtainMessage(7, Pair.create(abstractC4983sh, null)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4506fm
    /* renamed from: f */
    public final void mo22084f(InterfaceC4543gm interfaceC4543gm) {
        this.f21740t.obtainMessage(8, interfaceC4543gm).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4988sm
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo22891g(InterfaceC5025tm interfaceC5025tm) {
        this.f21740t.obtainMessage(9, (InterfaceC4543gm) interfaceC5025tm).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:            m22880u(r12);        r2.f19226l = null;     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027b A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027f A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0284 A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07aa A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0572 A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x058c A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, LOOP:9: B:413:0x058c->B:417:0x059c, LOOP_START, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0506 A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0562 A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0527 A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x050d A[Catch: RuntimeException -> 0x0024, IOException -> 0x0028, zzasi -> 0x002f, TryCatch #4 {RuntimeException -> 0x0024, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:15:0x003a, B:18:0x0041, B:21:0x0048, B:22:0x0054, B:25:0x005a, B:27:0x005e, B:30:0x0065, B:34:0x006d, B:40:0x007c, B:41:0x0081, B:43:0x008b, B:45:0x008f, B:47:0x0093, B:48:0x00a4, B:51:0x00aa, B:56:0x00ae, B:66:0x00cf, B:75:0x00dd, B:78:0x00de, B:82:0x00e8, B:87:0x00ec, B:88:0x00ed, B:92:0x00f4, B:94:0x00fa, B:105:0x0102, B:108:0x010b, B:110:0x012a, B:111:0x0131, B:113:0x0137, B:116:0x0144, B:118:0x014e, B:120:0x0152, B:122:0x0158, B:125:0x015e, B:126:0x0165, B:127:0x0169, B:130:0x0170, B:132:0x0174, B:129:0x0179, B:138:0x017c, B:139:0x01b0, B:141:0x018b, B:143:0x0191, B:145:0x0197, B:147:0x019f, B:96:0x01bc, B:100:0x01c3, B:152:0x01c9, B:154:0x01d1, B:156:0x01d5, B:158:0x01d9, B:160:0x01e1, B:163:0x01e6, B:165:0x01f7, B:166:0x0205, B:168:0x0209, B:170:0x0219, B:172:0x021d, B:174:0x022b, B:176:0x0230, B:177:0x0277, B:179:0x027b, B:181:0x027f, B:182:0x0284, B:184:0x028e, B:186:0x0298, B:187:0x029d, B:188:0x02c5, B:190:0x02c9, B:194:0x02d4, B:198:0x02d7, B:199:0x02e7, B:202:0x02f6, B:204:0x02fc, B:206:0x030d, B:208:0x0311, B:210:0x031f, B:212:0x0331, B:216:0x0340, B:221:0x0345, B:223:0x0359, B:222:0x0360, B:227:0x0248, B:229:0x0250, B:231:0x0256, B:232:0x025b, B:234:0x0364, B:235:0x036f, B:244:0x037a, B:245:0x037b, B:247:0x037f, B:249:0x0387, B:250:0x0391, B:252:0x038c, B:253:0x039d, B:255:0x03a5, B:257:0x03ae, B:259:0x03b4, B:260:0x03d2, B:263:0x03db, B:270:0x03fd, B:271:0x040a, B:277:0x041d, B:282:0x042c, B:283:0x043c, B:285:0x043d, B:287:0x0447, B:288:0x067d, B:290:0x0683, B:293:0x068e, B:295:0x06ab, B:297:0x06b6, B:300:0x06bf, B:302:0x06c5, B:306:0x06d0, B:311:0x06da, B:318:0x06e1, B:319:0x06e4, B:321:0x06e8, B:323:0x06f4, B:324:0x0707, B:328:0x0720, B:330:0x0728, B:332:0x072e, B:333:0x07c8, B:335:0x07cd, B:337:0x07d2, B:339:0x07da, B:341:0x07de, B:343:0x07e8, B:345:0x07ec, B:346:0x07f2, B:347:0x080f, B:349:0x07e3, B:351:0x07f6, B:353:0x07fb, B:355:0x07ff, B:356:0x0805, B:358:0x0809, B:359:0x0737, B:361:0x073c, B:364:0x0743, B:366:0x074b, B:369:0x075a, B:372:0x07a3, B:374:0x07aa, B:375:0x0762, B:376:0x076e, B:378:0x0772, B:381:0x0788, B:382:0x074e, B:383:0x079c, B:388:0x07b1, B:392:0x07bd, B:393:0x07b7, B:394:0x0450, B:396:0x0454, B:397:0x0494, B:399:0x049c, B:401:0x056e, B:403:0x0572, B:406:0x0579, B:408:0x057d, B:410:0x0581, B:411:0x0588, B:413:0x058c, B:415:0x0592, B:417:0x059c, B:419:0x05c3, B:423:0x05ca, B:425:0x05d6, B:427:0x05dc, B:429:0x05e2, B:431:0x05e5, B:438:0x05eb, B:441:0x05fd, B:445:0x0603, B:449:0x0606, B:451:0x060c, B:453:0x0610, B:455:0x061f, B:459:0x0678, B:462:0x0635, B:464:0x0639, B:466:0x063f, B:468:0x064f, B:470:0x0655, B:472:0x065d, B:474:0x0666, B:476:0x0675, B:481:0x0585, B:482:0x04a2, B:484:0x04a6, B:486:0x0502, B:488:0x0506, B:490:0x0520, B:493:0x052c, B:495:0x0562, B:496:0x0564, B:497:0x0527, B:498:0x050d, B:499:0x04ae, B:502:0x04bf, B:504:0x04f1, B:505:0x0459, B:507:0x045f, B:509:0x0465, B:511:0x0473, B:513:0x0477, B:516:0x0488, B:517:0x0815, B:520:0x081c, B:522:0x0822, B:525:0x082a, B:527:0x082f, B:530:0x083c, B:532:0x0843, B:534:0x0859, B:535:0x0865), top: B:2:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z11;
        int i11;
        IOException iOException;
        boolean z12;
        int i12;
        zzasi zzasiVar;
        boolean z13;
        int m26304f;
        long j11;
        int i13;
        C4427dh c4427dh;
        C4427dh c4427dh2;
        C4427dh c4427dh3;
        long j12;
        C4427dh c4427dh4;
        int i14;
        C4427dh c4427dh5;
        long zzg;
        boolean m20975k;
        long j13;
        long j14;
        boolean z14;
        int i15;
        int i16;
        Message obtainMessage;
        int i17;
        C4427dh c4427dh6;
        boolean z15;
        C4427dh c4427dh7;
        boolean z16;
        int i18;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        C4427dh c4427dh8;
        int i19;
        boolean z23;
        boolean z24;
        int i21 = 1;
        try {
            try {
                long j15 = 0;
                int i22 = 0;
                try {
                    switch (message.what) {
                        case 0:
                            InterfaceC4617im interfaceC4617im = (InterfaceC4617im) message.obj;
                            int i23 = message.arg1;
                            this.f21742v.sendEmptyMessage(0);
                            m22867h(true);
                            this.f21735a0.m20965a();
                            if (i23 != 0) {
                                this.f21746z = new C4464eh(0, -9223372036854775807L);
                            }
                            this.f21712D = interfaceC4617im;
                            interfaceC4617im.mo21749c(this.f21743w, true, this);
                            m22872m(2);
                            this.f21740t.sendEmptyMessage(2);
                            return true;
                        case 1:
                            if (message.arg1 != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            this.f21716H = false;
                            this.f21715G = z13;
                            if (!z13) {
                                m22875p();
                                m22876q();
                            } else {
                                int i24 = this.f21718J;
                                if (i24 == 3) {
                                    m22873n();
                                    this.f21740t.sendEmptyMessage(2);
                                } else if (i24 == 2) {
                                    this.f21740t.sendEmptyMessage(2);
                                }
                            }
                            return true;
                        case 2:
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.f21729U == null) {
                                this.f21712D.zza();
                                j11 = elapsedRealtime;
                            } else {
                                C4427dh c4427dh9 = this.f21726R;
                                if (c4427dh9 == null) {
                                    m26304f = this.f21746z.f19625a;
                                } else {
                                    int i25 = c4427dh9.f19221g;
                                    if (!c4427dh9.f19223i) {
                                        if (c4427dh9.m21389d()) {
                                            if (this.f21729U.mo25467d(i25, this.f21745y, false).f26778c != -9223372036854775807L) {
                                                C4427dh c4427dh10 = this.f21728T;
                                                if (c4427dh10 != null) {
                                                    if (this.f21726R.f19217c - c4427dh10.f19217c != 100) {
                                                    }
                                                }
                                                m26304f = this.f21729U.m26304f(i25, this.f21745y, this.f21744x, this.f21719K);
                                            }
                                        }
                                    }
                                    j11 = elapsedRealtime;
                                    i13 = 2;
                                    c4427dh = this.f21726R;
                                    if (c4427dh != null && !c4427dh.m21389d()) {
                                        if (this.f21726R != null && !this.f21717I) {
                                            m22864c();
                                        }
                                        if (this.f21728T != null) {
                                            while (true) {
                                                C4427dh c4427dh11 = this.f21728T;
                                                c4427dh2 = this.f21727S;
                                                if (c4427dh11 != c4427dh2 && this.f21725Q >= c4427dh11.f19226l.f19220f) {
                                                    c4427dh11.m21388c();
                                                    m22871l(this.f21728T.f19226l);
                                                    C4427dh c4427dh12 = this.f21728T;
                                                    this.f21746z = new C4464eh(c4427dh12.f19221g, c4427dh12.f19222h);
                                                    m22876q();
                                                    this.f21742v.obtainMessage(5, this.f21746z).sendToTarget();
                                                }
                                            }
                                            if (c4427dh2.f19223i) {
                                                for (int i26 = 0; i26 < i13; i26++) {
                                                    InterfaceC4760mh interfaceC4760mh = this.f21736p[i26];
                                                    InterfaceC4951rm interfaceC4951rm = this.f21727S.f19218d[i26];
                                                    if (interfaceC4951rm != null && interfaceC4760mh.zzh() == interfaceC4951rm && interfaceC4760mh.zzA()) {
                                                        interfaceC4760mh.zzv();
                                                    }
                                                }
                                            } else {
                                                int i27 = 0;
                                                while (true) {
                                                    if (i27 < i13) {
                                                        InterfaceC4760mh interfaceC4760mh2 = this.f21736p[i27];
                                                        InterfaceC4951rm interfaceC4951rm2 = this.f21727S.f19218d[i27];
                                                        if (interfaceC4760mh2.zzh() == interfaceC4951rm2 && (interfaceC4951rm2 == null || interfaceC4760mh2.zzA())) {
                                                            i27++;
                                                        }
                                                    } else {
                                                        C4427dh c4427dh13 = this.f21727S;
                                                        C4427dh c4427dh14 = c4427dh13.f19226l;
                                                        if (c4427dh14 != null && c4427dh14.f19224j) {
                                                            C4691kn c4691kn = c4427dh13.f19227m;
                                                            this.f21727S = c4427dh14;
                                                            C4691kn c4691kn2 = c4427dh14.f19227m;
                                                            long zzh = c4427dh14.f19215a.zzh();
                                                            int i28 = 0;
                                                            while (i28 < i13) {
                                                                InterfaceC4760mh interfaceC4760mh3 = this.f21736p[i28];
                                                                if (c4691kn.f23389b.m22977a(i28) != null) {
                                                                    if (zzh != -9223372036854775807L) {
                                                                        interfaceC4760mh3.zzv();
                                                                    } else if (!interfaceC4760mh3.zzB()) {
                                                                        AbstractC5248zm m22977a = c4691kn2.f23389b.m22977a(i28);
                                                                        C4834oh c4834oh = c4691kn.f23391d[i28];
                                                                        C4834oh c4834oh2 = c4691kn2.f23391d[i28];
                                                                        if (m22977a != null && c4834oh2.equals(c4834oh)) {
                                                                            m22977a.m28544b();
                                                                            zzasw[] zzaswVarArr = new zzasw[i21];
                                                                            for (int i29 = 0; i29 <= 0; i29++) {
                                                                                zzaswVarArr[i29] = m22977a.m28545c(i29);
                                                                            }
                                                                            C4427dh c4427dh15 = this.f21727S;
                                                                            interfaceC4760mh3.mo24570n(zzaswVarArr, c4427dh15.f19218d[i28], c4427dh15.f19220f - c4427dh15.f19222h);
                                                                        } else {
                                                                            interfaceC4760mh3.zzv();
                                                                        }
                                                                    }
                                                                }
                                                                i28++;
                                                                i21 = 1;
                                                                i13 = 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m22870k(false);
                                    if (this.f21728T != null) {
                                    }
                                }
                                if (m26304f >= this.f21729U.mo25465b()) {
                                    this.f21712D.zza();
                                    j11 = elapsedRealtime;
                                    i13 = 2;
                                    c4427dh = this.f21726R;
                                    if (c4427dh != null) {
                                        if (this.f21726R != null) {
                                            m22864c();
                                        }
                                        if (this.f21728T != null) {
                                        }
                                    }
                                    m22870k(false);
                                    if (this.f21728T != null) {
                                    }
                                } else {
                                    if (this.f21726R == null) {
                                        j15 = this.f21746z.f19627c;
                                    } else {
                                        this.f21729U.mo25467d(m26304f, this.f21745y, false);
                                        this.f21729U.m26305g(0, this.f21744x, false);
                                        if (m26304f == 0) {
                                            C4427dh c4427dh16 = this.f21726R;
                                            j11 = elapsedRealtime;
                                            i13 = 2;
                                            Pair m22860O = m22860O(this.f21729U, 0, -9223372036854775807L, Math.max(0L, ((c4427dh16.f19220f - c4427dh16.f19222h) + this.f21729U.mo25467d(c4427dh16.f19221g, this.f21745y, false).f26778c) - this.f21725Q));
                                            if (m22860O != null) {
                                                int intValue = ((Integer) m22860O.first).intValue();
                                                j15 = ((Long) m22860O.second).longValue();
                                                m26304f = intValue;
                                                c4427dh3 = this.f21726R;
                                                if (c4427dh3 != null) {
                                                    j12 = 60000000 + j15;
                                                } else {
                                                    j12 = (c4427dh3.f19220f - c4427dh3.f19222h) + this.f21729U.mo25467d(c4427dh3.f19221g, this.f21745y, false).f26778c;
                                                }
                                                long j16 = j12;
                                                c4427dh4 = this.f21726R;
                                                if (c4427dh4 != null) {
                                                    i14 = 0;
                                                } else {
                                                    i14 = c4427dh4.f19217c + 1;
                                                }
                                                boolean m22877r = m22877r(m26304f);
                                                this.f21729U.mo25467d(m26304f, this.f21745y, true);
                                                C4427dh c4427dh17 = new C4427dh(this.f21736p, this.f21737q, j16, this.f21738r, this.f21735a0, this.f21712D, this.f21745y.f26777b, i14, m26304f, m22877r, j15, null);
                                                c4427dh5 = this.f21726R;
                                                if (c4427dh5 != null) {
                                                    c4427dh5.f19226l = c4427dh17;
                                                }
                                                this.f21726R = c4427dh17;
                                                c4427dh17.f19215a.mo20589d(this, j15);
                                                m22870k(true);
                                            }
                                            c4427dh = this.f21726R;
                                            if (c4427dh != null) {
                                            }
                                            m22870k(false);
                                            if (this.f21728T != null) {
                                            }
                                        }
                                    }
                                    j11 = elapsedRealtime;
                                    i13 = 2;
                                    c4427dh3 = this.f21726R;
                                    if (c4427dh3 != null) {
                                    }
                                    long j162 = j12;
                                    c4427dh4 = this.f21726R;
                                    if (c4427dh4 != null) {
                                    }
                                    boolean m22877r2 = m22877r(m26304f);
                                    this.f21729U.mo25467d(m26304f, this.f21745y, true);
                                    C4427dh c4427dh172 = new C4427dh(this.f21736p, this.f21737q, j162, this.f21738r, this.f21735a0, this.f21712D, this.f21745y.f26777b, i14, m26304f, m22877r2, j15, null);
                                    c4427dh5 = this.f21726R;
                                    if (c4427dh5 != null) {
                                    }
                                    this.f21726R = c4427dh172;
                                    c4427dh172.f19215a.mo20589d(this, j15);
                                    m22870k(true);
                                    c4427dh = this.f21726R;
                                    if (c4427dh != null) {
                                    }
                                    m22870k(false);
                                    if (this.f21728T != null) {
                                    }
                                }
                            }
                            if (this.f21728T == null) {
                                m22865d();
                                m22869j(j11, 10L);
                            } else {
                                long j17 = j11;
                                AbstractC4841oo.m25224a("doSomeWork");
                                m22876q();
                                this.f21728T.f19215a.mo20595j(this.f21746z.f19627c);
                                boolean z25 = true;
                                boolean z26 = true;
                                for (InterfaceC4760mh interfaceC4760mh4 : this.f21713E) {
                                    interfaceC4760mh4.mo21477p(this.f21725Q, this.f21722N);
                                    if (z26 && interfaceC4760mh4.zzE()) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    if (interfaceC4760mh4.mo21474b() || interfaceC4760mh4.zzE()) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        interfaceC4760mh4.zzm();
                                    }
                                    if (z25 && z14) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                }
                                if (!z25) {
                                    m22865d();
                                }
                                InterfaceC4508fo interfaceC4508fo = this.f21711C;
                                if (interfaceC4508fo != null) {
                                    C4722lh mo22103h = interfaceC4508fo.mo22103h();
                                    if (!mo22103h.equals(this.f21709A)) {
                                        this.f21709A = mo22103h;
                                        this.f21739s.m24653d(this.f21711C);
                                        this.f21742v.obtainMessage(7, mo22103h).sendToTarget();
                                    }
                                }
                                long j18 = this.f21729U.mo25467d(this.f21728T.f19221g, this.f21745y, false).f26778c;
                                if (z26 && ((j18 == -9223372036854775807L || j18 <= this.f21746z.f19627c) && this.f21728T.f19223i)) {
                                    m22872m(4);
                                    m22875p();
                                } else {
                                    int i31 = this.f21718J;
                                    if (i31 == 2) {
                                        if (this.f21713E.length > 0) {
                                            if (z25) {
                                                boolean z27 = this.f21716H;
                                                C4427dh c4427dh18 = this.f21726R;
                                                if (!c4427dh18.f19224j) {
                                                    zzg = c4427dh18.f19222h;
                                                } else {
                                                    zzg = c4427dh18.f19215a.zzg();
                                                }
                                                if (zzg == Long.MIN_VALUE) {
                                                    C4427dh c4427dh19 = this.f21726R;
                                                    if (!c4427dh19.f19223i) {
                                                        zzg = this.f21729U.mo25467d(c4427dh19.f19221g, this.f21745y, false).f26778c;
                                                    }
                                                    m22872m(3);
                                                    if (this.f21715G) {
                                                        m22873n();
                                                    }
                                                }
                                                if (this.f21730V) {
                                                    co0 co0Var = this.f21735a0;
                                                    long j19 = this.f21746z.f19628d;
                                                    C4427dh c4427dh20 = this.f21726R;
                                                    m20975k = co0Var.m20975k(j19 - (this.f21725Q - (c4427dh20.f19220f - c4427dh20.f19222h)), z27);
                                                } else {
                                                    co0 co0Var2 = this.f21735a0;
                                                    C4427dh c4427dh21 = this.f21726R;
                                                    m20975k = co0Var2.m20975k(zzg - (this.f21725Q - (c4427dh21.f19220f - c4427dh21.f19222h)), z27);
                                                }
                                                if (m20975k) {
                                                    m22872m(3);
                                                    if (this.f21715G) {
                                                    }
                                                }
                                            }
                                        } else if (m22878s(j18)) {
                                            m22872m(3);
                                            if (this.f21715G) {
                                            }
                                        }
                                    } else if (i31 == 3) {
                                        if (this.f21713E.length <= 0) {
                                            z25 = m22878s(j18);
                                        }
                                        if (!z25) {
                                            this.f21716H = this.f21715G;
                                            m22872m(2);
                                            m22875p();
                                        }
                                    }
                                }
                                if (this.f21718J == 2) {
                                    InterfaceC4760mh[] interfaceC4760mhArr = this.f21713E;
                                    int length = interfaceC4760mhArr.length;
                                    while (i22 < length) {
                                        interfaceC4760mhArr[i22].zzm();
                                        i22++;
                                    }
                                }
                                if ((this.f21715G && this.f21718J == 3) || this.f21718J == 2) {
                                    if (this.f21733Y > 0) {
                                        j14 = this.f21733Y;
                                    } else {
                                        j14 = 10;
                                    }
                                    m22869j(j17, j14);
                                } else if (this.f21713E.length != 0) {
                                    if (this.f21734Z > 0) {
                                        j13 = this.f21734Z;
                                    } else {
                                        j13 = 1000;
                                    }
                                    m22869j(j17, j13);
                                } else {
                                    this.f21740t.removeMessages(2);
                                }
                                AbstractC4841oo.m25225b();
                            }
                            return true;
                        case 3:
                            C4501fh c4501fh = (C4501fh) message.obj;
                            if (this.f21729U == null) {
                                this.f21723O++;
                                this.f21724P = c4501fh;
                            } else {
                                Pair m22861P = m22861P(c4501fh);
                                if (m22861P == null) {
                                    C4464eh c4464eh = new C4464eh(0, 0L);
                                    this.f21746z = c4464eh;
                                    this.f21742v.obtainMessage(4, 1, 0, c4464eh).sendToTarget();
                                    this.f21746z = new C4464eh(0, -9223372036854775807L);
                                    m22872m(4);
                                    m22867h(false);
                                } else {
                                    if (c4501fh.f20115c == -9223372036854775807L) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    int intValue2 = ((Integer) m22861P.first).intValue();
                                    long longValue = ((Long) m22861P.second).longValue();
                                    try {
                                        C4464eh c4464eh2 = this.f21746z;
                                        if (intValue2 == c4464eh2.f19625a && longValue / 1000 == c4464eh2.f19627c / 1000) {
                                            C4464eh c4464eh3 = new C4464eh(intValue2, longValue);
                                            this.f21746z = c4464eh3;
                                            obtainMessage = this.f21742v.obtainMessage(4, i15, 0, c4464eh3);
                                        } else {
                                            long m22857L = m22857L(intValue2, longValue);
                                            if (longValue != m22857L) {
                                                i16 = 1;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i32 = i15 | i16;
                                            C4464eh c4464eh4 = new C4464eh(intValue2, m22857L);
                                            this.f21746z = c4464eh4;
                                            obtainMessage = this.f21742v.obtainMessage(4, i32, 0, c4464eh4);
                                        }
                                        obtainMessage.sendToTarget();
                                    } catch (Throwable th2) {
                                        C4464eh c4464eh5 = new C4464eh(intValue2, longValue);
                                        this.f21746z = c4464eh5;
                                        this.f21742v.obtainMessage(4, i15, 0, c4464eh5).sendToTarget();
                                        throw th2;
                                    }
                                }
                            }
                            return true;
                        case 4:
                            C4722lh c4722lh = (C4722lh) message.obj;
                            InterfaceC4508fo interfaceC4508fo2 = this.f21711C;
                            if (interfaceC4508fo2 != null) {
                                c4722lh = interfaceC4508fo2.mo22105q(c4722lh);
                            } else {
                                this.f21739s.mo22105q(c4722lh);
                            }
                            this.f21709A = c4722lh;
                            this.f21742v.obtainMessage(7, c4722lh).sendToTarget();
                            return true;
                        case 5:
                            m22874o();
                            return true;
                        case 6:
                            m22867h(true);
                            this.f21735a0.m20966b();
                            m22872m(1);
                            synchronized (this) {
                                this.f21714F = true;
                                notifyAll();
                            }
                            return true;
                        case 7:
                            Pair pair = (Pair) message.obj;
                            AbstractC4983sh abstractC4983sh = this.f21729U;
                            AbstractC4983sh abstractC4983sh2 = (AbstractC4983sh) pair.first;
                            this.f21729U = abstractC4983sh2;
                            Object obj = pair.second;
                            if (abstractC4983sh == null) {
                                if (this.f21723O > 0) {
                                    Pair m22861P2 = m22861P(this.f21724P);
                                    i17 = this.f21723O;
                                    this.f21723O = 0;
                                    this.f21724P = null;
                                    if (m22861P2 == null) {
                                        m22863a(obj, i17);
                                    } else {
                                        this.f21746z = new C4464eh(((Integer) m22861P2.first).intValue(), ((Long) m22861P2.second).longValue());
                                        c4427dh6 = this.f21728T;
                                        if (c4427dh6 == null) {
                                            c4427dh6 = this.f21726R;
                                        }
                                        if (c4427dh6 != null) {
                                            m22866e(obj, i17);
                                        } else {
                                            int mo25464a = this.f21729U.mo25464a(c4427dh6.f19216b);
                                            if (mo25464a == -1) {
                                                if (m22856K(c4427dh6.f19221g, abstractC4983sh, this.f21729U) == -1) {
                                                    m22863a(obj, i17);
                                                } else {
                                                    this.f21729U.mo25467d(0, this.f21745y, false);
                                                    Pair m22858M = m22858M(0, -9223372036854775807L);
                                                    int intValue3 = ((Integer) m22858M.first).intValue();
                                                    long longValue2 = ((Long) m22858M.second).longValue();
                                                    this.f21729U.mo25467d(intValue3, this.f21745y, true);
                                                    Object obj2 = this.f21745y.f26777b;
                                                    c4427dh6.f19221g = -1;
                                                    while (true) {
                                                        c4427dh6 = c4427dh6.f19226l;
                                                        if (c4427dh6 != null) {
                                                            if (true != c4427dh6.f19216b.equals(obj2)) {
                                                                i18 = -1;
                                                            } else {
                                                                i18 = intValue3;
                                                            }
                                                            c4427dh6.f19221g = i18;
                                                        } else {
                                                            this.f21746z = new C4464eh(intValue3, m22857L(intValue3, longValue2));
                                                            m22866e(obj, i17);
                                                        }
                                                    }
                                                }
                                            } else {
                                                boolean m22877r3 = m22877r(0);
                                                c4427dh6.f19221g = 0;
                                                c4427dh6.f19223i = m22877r3;
                                                if (c4427dh6 == this.f21727S) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                C4464eh c4464eh6 = this.f21746z;
                                                if (c4464eh6.f19625a != 0) {
                                                    C4464eh c4464eh7 = new C4464eh(0, c4464eh6.f19626b);
                                                    c4464eh7.f19627c = c4464eh6.f19627c;
                                                    c4464eh7.f19628d = c4464eh6.f19628d;
                                                    this.f21746z = c4464eh7;
                                                }
                                                while (true) {
                                                    c4427dh7 = c4427dh6.f19226l;
                                                    if (c4427dh7 != null) {
                                                        mo25464a = this.f21729U.m26304f(mo25464a, this.f21745y, this.f21744x, this.f21719K);
                                                        if (mo25464a != -1 && c4427dh7.f19216b.equals(this.f21729U.mo25467d(mo25464a, this.f21745y, true).f26777b)) {
                                                            boolean m22877r4 = m22877r(mo25464a);
                                                            c4427dh7.f19221g = mo25464a;
                                                            c4427dh7.f19223i = m22877r4;
                                                            if (c4427dh7 == this.f21727S) {
                                                                z16 = true;
                                                            } else {
                                                                z16 = false;
                                                            }
                                                            z15 |= z16;
                                                            c4427dh6 = c4427dh7;
                                                        }
                                                    }
                                                }
                                                if (!z15) {
                                                    int i33 = this.f21728T.f19221g;
                                                    this.f21746z = new C4464eh(i33, m22857L(i33, this.f21746z.f19627c));
                                                } else {
                                                    this.f21726R = c4427dh6;
                                                    c4427dh6.f19226l = null;
                                                    m22880u(c4427dh7);
                                                }
                                                m22866e(obj, i17);
                                            }
                                        }
                                    }
                                } else if (this.f21746z.f19626b == -9223372036854775807L) {
                                    if (abstractC4983sh2.m26306h()) {
                                        m22863a(obj, 0);
                                    } else {
                                        Pair m22858M2 = m22858M(0, -9223372036854775807L);
                                        this.f21746z = new C4464eh(((Integer) m22858M2.first).intValue(), ((Long) m22858M2.second).longValue());
                                    }
                                }
                                return true;
                            }
                            i17 = 0;
                            c4427dh6 = this.f21728T;
                            if (c4427dh6 == null) {
                            }
                            if (c4427dh6 != null) {
                            }
                            return true;
                        case 8:
                            InterfaceC4543gm interfaceC4543gm = (InterfaceC4543gm) message.obj;
                            C4427dh c4427dh22 = this.f21726R;
                            if (c4427dh22 != null && c4427dh22.f19215a == interfaceC4543gm) {
                                c4427dh22.f19224j = true;
                                c4427dh22.m21390e();
                                c4427dh22.f19222h = c4427dh22.m21386a(c4427dh22.f19222h, false);
                                if (this.f21728T == null) {
                                    C4427dh c4427dh23 = this.f21726R;
                                    this.f21727S = c4427dh23;
                                    m22868i(c4427dh23.f19222h);
                                    m22871l(this.f21727S);
                                }
                                m22864c();
                            }
                            return true;
                        case 9:
                            InterfaceC4543gm interfaceC4543gm2 = (InterfaceC4543gm) message.obj;
                            C4427dh c4427dh24 = this.f21726R;
                            if (c4427dh24 != null && c4427dh24.f19215a == interfaceC4543gm2) {
                                m22864c();
                            }
                            return true;
                        case 10:
                            C4427dh c4427dh25 = this.f21728T;
                            if (c4427dh25 != null) {
                                boolean z28 = true;
                                while (true) {
                                    if (c4427dh25 != null && c4427dh25.f19224j) {
                                        if (c4427dh25.m21390e()) {
                                            if (z28) {
                                                C4427dh c4427dh26 = this.f21727S;
                                                C4427dh c4427dh27 = this.f21728T;
                                                if (c4427dh26 != c4427dh27) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                m22880u(c4427dh27.f19226l);
                                                C4427dh c4427dh28 = this.f21728T;
                                                c4427dh28.f19226l = null;
                                                this.f21726R = c4427dh28;
                                                this.f21727S = c4427dh28;
                                                boolean[] zArr = new boolean[2];
                                                long m21387b = c4427dh28.m21387b(this.f21746z.f19627c, z17, zArr);
                                                if (m21387b != this.f21746z.f19627c) {
                                                    this.f21746z.f19627c = m21387b;
                                                    m22868i(m21387b);
                                                }
                                                boolean[] zArr2 = new boolean[2];
                                                int i34 = 0;
                                                for (int i35 = 0; i35 < 2; i35++) {
                                                    InterfaceC4760mh interfaceC4760mh5 = this.f21736p[i35];
                                                    if (interfaceC4760mh5.zzb() != 0) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    zArr2[i35] = z18;
                                                    InterfaceC4951rm interfaceC4951rm3 = this.f21728T.f19218d[i35];
                                                    if (interfaceC4951rm3 != null) {
                                                        i34++;
                                                    }
                                                    if (z18) {
                                                        if (interfaceC4951rm3 != interfaceC4760mh5.zzh()) {
                                                            if (interfaceC4760mh5 == this.f21710B) {
                                                                if (interfaceC4951rm3 == null) {
                                                                    this.f21739s.m24653d(this.f21711C);
                                                                }
                                                                this.f21711C = null;
                                                                this.f21710B = null;
                                                            }
                                                            m22879t(interfaceC4760mh5);
                                                            interfaceC4760mh5.zzj();
                                                        } else if (zArr[i35]) {
                                                            interfaceC4760mh5.mo24571o(this.f21725Q);
                                                        }
                                                    }
                                                }
                                                this.f21742v.obtainMessage(3, c4427dh25.f19227m).sendToTarget();
                                                m22862Q(zArr2, i34);
                                            } else {
                                                this.f21726R = c4427dh25;
                                                for (C4427dh c4427dh29 = c4427dh25.f19226l; c4427dh29 != null; c4427dh29 = c4427dh29.f19226l) {
                                                    c4427dh29.m21388c();
                                                }
                                                C4427dh c4427dh30 = this.f21726R;
                                                c4427dh30.f19226l = null;
                                                if (c4427dh30.f19224j) {
                                                    long j21 = c4427dh30.f19222h;
                                                    this.f21726R.m21386a(Math.max(j21, this.f21725Q - (c4427dh30.f19220f - j21)), false);
                                                }
                                            }
                                            m22864c();
                                            m22876q();
                                            this.f21740t.sendEmptyMessage(2);
                                        } else {
                                            if (c4427dh25 == this.f21727S) {
                                                z19 = false;
                                            } else {
                                                z19 = true;
                                            }
                                            z28 &= z19;
                                            c4427dh25 = c4427dh25.f19226l;
                                        }
                                    }
                                }
                            }
                            return true;
                        case 11:
                            C5205yg[] c5205ygArr = (C5205yg[]) message.obj;
                            try {
                                int length2 = c5205ygArr.length;
                                while (i22 < length2) {
                                    C5205yg c5205yg = c5205ygArr[i22];
                                    c5205yg.f30925a.mo25714c(c5205yg.f30926b, c5205yg.f30927c);
                                    i22++;
                                }
                                if (this.f21712D != null) {
                                    this.f21740t.sendEmptyMessage(2);
                                }
                                synchronized (this) {
                                    this.f21721M++;
                                    notifyAll();
                                }
                                return true;
                            } catch (Throwable th3) {
                                synchronized (this) {
                                    this.f21721M++;
                                    notifyAll();
                                    throw th3;
                                }
                            }
                        case 12:
                            int i36 = message.arg1;
                            this.f21719K = i36;
                            C4427dh c4427dh31 = this.f21728T;
                            if (c4427dh31 == null) {
                                c4427dh31 = this.f21726R;
                            }
                            if (c4427dh31 != null) {
                                if (c4427dh31 == this.f21727S) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (c4427dh31 == this.f21726R) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                int m26304f2 = this.f21729U.m26304f(c4427dh31.f19221g, this.f21745y, this.f21744x, i36);
                                while (true) {
                                    C4427dh c4427dh32 = c4427dh31.f19226l;
                                    if (c4427dh32 != null && m26304f2 != -1 && (i19 = c4427dh32.f19221g) == m26304f2) {
                                        if (c4427dh32 == this.f21727S) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        z21 |= z23;
                                        if (c4427dh32 == this.f21726R) {
                                            z24 = true;
                                        } else {
                                            z24 = false;
                                        }
                                        z22 |= z24;
                                        m26304f2 = this.f21729U.m26304f(i19, this.f21745y, this.f21744x, i36);
                                        c4427dh31 = c4427dh32;
                                    }
                                }
                                c4427dh31.f19223i = m22877r(c4427dh31.f19221g);
                                if (!z22) {
                                    this.f21726R = c4427dh31;
                                }
                                if (!z21 && (c4427dh8 = this.f21728T) != null) {
                                    int i37 = c4427dh8.f19221g;
                                    this.f21746z = new C4464eh(i37, m22857L(i37, this.f21746z.f19627c));
                                }
                                if (this.f21718J == 4 && i36 != 0) {
                                    m22872m(2);
                                }
                            }
                            return true;
                        default:
                            return false;
                    }
                } catch (zzasi e11) {
                    zzasiVar = e11;
                    z12 = true;
                    i12 = 8;
                    this.f21742v.obtainMessage(i12, zzasiVar).sendToTarget();
                    m22874o();
                    return z12;
                } catch (IOException e12) {
                    iOException = e12;
                    z11 = true;
                    i11 = 8;
                    this.f21742v.obtainMessage(i11, zzasi.m28677b(iOException)).sendToTarget();
                    m22874o();
                    return z11;
                }
            } catch (zzasi e13) {
                z12 = true;
                i12 = 8;
                zzasiVar = e13;
            } catch (IOException e14) {
                z11 = true;
                i11 = 8;
                iOException = e14;
            }
        } catch (RuntimeException e15) {
            this.f21742v.obtainMessage(8, zzasi.m28678c(e15)).sendToTarget();
            m22874o();
            return true;
        }
    }

    /* renamed from: v */
    public final synchronized void m22892v(C5205yg... c5205ygArr) {
        if (this.f21714F) {
            return;
        }
        int i11 = this.f21720L;
        this.f21720L = i11 + 1;
        this.f21740t.obtainMessage(11, c5205ygArr).sendToTarget();
        while (this.f21721M <= i11) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: w */
    public final void m22893w() {
        this.f21730V = true;
    }

    /* renamed from: x */
    public final void m22894x(int i11) {
        this.f21732X = i11;
    }

    /* renamed from: y */
    public final void m22895y() {
        this.f21731W = true;
    }

    /* renamed from: z */
    public final void m22896z(InterfaceC4617im interfaceC4617im, boolean z11) {
        this.f21740t.obtainMessage(0, 1, 0, interfaceC4617im).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618in
    public final void zzh() {
        this.f21740t.sendEmptyMessage(10);
    }
}
