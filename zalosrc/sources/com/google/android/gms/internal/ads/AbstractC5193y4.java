package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.y4 */
/* loaded from: classes2.dex */
public abstract class AbstractC5193y4 {

    /* renamed from: b */
    private InterfaceC4928r f30745b;

    /* renamed from: c */
    private mm4 f30746c;

    /* renamed from: d */
    private InterfaceC5007t4 f30747d;

    /* renamed from: e */
    private long f30748e;

    /* renamed from: f */
    private long f30749f;

    /* renamed from: g */
    private long f30750g;

    /* renamed from: h */
    private int f30751h;

    /* renamed from: i */
    private int f30752i;

    /* renamed from: k */
    private long f30754k;

    /* renamed from: l */
    private boolean f30755l;

    /* renamed from: m */
    private boolean f30756m;

    /* renamed from: a */
    private final C4933r4 f30744a = new C4933r4();

    /* renamed from: j */
    private C5081v4 f30753j = new C5081v4();

    /* renamed from: a */
    protected abstract long mo19983a(x02 x02Var);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19984b(boolean z11) {
        int i11;
        if (z11) {
            this.f30753j = new C5081v4();
            this.f30749f = 0L;
            i11 = 0;
        } else {
            i11 = 1;
        }
        this.f30751h = i11;
        this.f30748e = -1L;
        this.f30750g = 0L;
    }

    /* renamed from: c */
    protected abstract boolean mo19985c(x02 x02Var, long j11, C5081v4 c5081v4);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m28118d(km4 km4Var, C4667k c4667k) {
        boolean z11;
        v71.m27171b(this.f30745b);
        int i11 = g92.f20474a;
        int i12 = this.f30751h;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    return -1;
                }
                long mo24457a = this.f30747d.mo24457a(km4Var);
                if (mo24457a >= 0) {
                    c4667k.f23035a = mo24457a;
                    return 1;
                }
                if (mo24457a < -1) {
                    mo19986h(-(mo24457a + 2));
                }
                if (!this.f30755l) {
                    InterfaceC4779n zze = this.f30747d.zze();
                    v71.m27171b(zze);
                    this.f30746c.mo21603f(zze);
                    this.f30755l = true;
                }
                if (this.f30754k <= 0 && !this.f30744a.m25954e(km4Var)) {
                    this.f30751h = 3;
                    return -1;
                }
                this.f30754k = 0L;
                x02 m25950a = this.f30744a.m25950a();
                long mo19983a = mo19983a(m25950a);
                if (mo19983a >= 0) {
                    long j11 = this.f30750g;
                    if (j11 + mo19983a >= this.f30748e) {
                        long m28119e = m28119e(j11);
                        AbstractC4853p.m25366b(this.f30745b, m25950a, m25950a.m27781l());
                        this.f30745b.mo23302f(m28119e, 1, m25950a.m27781l(), 0, null);
                        this.f30748e = -1L;
                    }
                }
                this.f30750g += mo19983a;
                return 0;
            }
            ((yl4) km4Var).m28248l((int) this.f30749f, false);
            this.f30751h = 2;
            return 0;
        }
        while (this.f30744a.m25954e(km4Var)) {
            long zzf = km4Var.zzf();
            long j12 = this.f30749f;
            this.f30754k = zzf - j12;
            if (mo19985c(this.f30744a.m25950a(), j12, this.f30753j)) {
                this.f30749f = km4Var.zzf();
            } else {
                C4671k3 c4671k3 = this.f30753j.f29182a;
                this.f30752i = c4671k3.f23113z;
                if (!this.f30756m) {
                    this.f30745b.mo23300d(c4671k3);
                    this.f30756m = true;
                }
                InterfaceC5007t4 interfaceC5007t4 = this.f30753j.f29183b;
                if (interfaceC5007t4 != null) {
                    this.f30747d = interfaceC5007t4;
                } else if (km4Var.zzd() == -1) {
                    this.f30747d = new C5156x4(null);
                } else {
                    C4970s4 m25951b = this.f30744a.m25951b();
                    if ((m25951b.f27520a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f30747d = new C4746m4(this, this.f30749f, km4Var.zzd(), m25951b.f27523d + m25951b.f27524e, m25951b.f27521b, z11);
                }
                this.f30751h = 2;
                this.f30744a.m25953d();
                return 0;
            }
        }
        this.f30751h = 3;
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final long m28119e(long j11) {
        return (j11 * 1000000) / this.f30752i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final long m28120f(long j11) {
        return (this.f30752i * j11) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m28121g(mm4 mm4Var, InterfaceC4928r interfaceC4928r) {
        this.f30746c = mm4Var;
        this.f30745b = interfaceC4928r;
        mo19984b(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo19986h(long j11) {
        this.f30750g = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m28122i(long j11, long j12) {
        this.f30744a.m25952c();
        if (j11 == 0) {
            mo19984b(!this.f30755l);
            return;
        }
        if (this.f30751h != 0) {
            long m28120f = m28120f(j12);
            this.f30748e = m28120f;
            InterfaceC5007t4 interfaceC5007t4 = this.f30747d;
            int i11 = g92.f20474a;
            interfaceC5007t4.mo24458b(m28120f);
            this.f30751h = 2;
        }
    }
}
