package p320ld;

import ag0.AbstractC0837p0;
import bg0.C2797c;
import bg0.InterfaceC2798d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import nh0.C23793c;
import p297kd.C21690e;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p421pc.C24720a;
import p421pc.C24721b;
import p484ri.C25806c;
import sc.C26220b;
import si.C26263i;

/* renamed from: ld.h */
/* loaded from: classes3.dex */
public final class C22436h {

    /* renamed from: b */
    private static volatile boolean f109761b;

    /* renamed from: c */
    private static volatile boolean f109762c;

    /* renamed from: d */
    private static volatile boolean f109763d;

    /* renamed from: f */
    private static final C25806c f109765f;

    /* renamed from: g */
    private static final C24720a f109766g;

    /* renamed from: a */
    public static final C22436h f109760a = new C22436h();

    /* renamed from: e */
    private static final InterfaceC2798d f109764e = new C2797c(AbstractC0837p0.Companion.m2237f());

    /* renamed from: ld.h$a */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: p */
        private final int f109767p;

        public a(int i11) {
            this.f109767p = i11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:            r4 = p320ld.C22436h.f109760a;        r0.mo104548a("pre isEnableRemindBanner=" + r4.m115922r(), new java.lang.Object[0]);        r5 = r4.m115922r();        p320ld.C22436h.f109761b = r4.m115893I();     */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:            if (r5 == false) goto L90;     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:            if (r4.m115922r() != false) goto L90;     */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:            r4.m115905k();     */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:            r0.mo104548a("after isEnableRemindBanner=" + r4.m115922r(), new java.lang.Object[0]);     */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0050, code lost:            if (r1.m115923s() != false) goto L77;     */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:2:0x0000, B:6:0x0007, B:22:0x0113, B:27:0x006d, B:29:0x0096, B:31:0x009c, B:32:0x009f, B:34:0x00bb, B:36:0x00e8, B:38:0x00f0, B:40:0x00f6, B:41:0x00f9, B:43:0x0039, B:45:0x0045, B:47:0x0054), top: B:1:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z11;
            boolean z12;
            try {
                if (!C22436h.f109763d) {
                    return;
                }
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                aVar.mo104548a("RunnableCheckChanged: trigger from " + this.f109767p, new Object[0]);
                int i11 = this.f109767p;
                boolean z13 = true;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    z11 = false;
                                    z13 = false;
                                    z12 = false;
                                    if (!z13 && !z11) {
                                        if (!z12) {
                                            C22436h.f109760a.m115910x();
                                        }
                                        return;
                                    }
                                    if (z11) {
                                        C22436h c22436h = C22436h.f109760a;
                                        aVar.mo104548a("pre isEnableRemindIcon=" + c22436h.m115923s(), new Object[0]);
                                        boolean m115923s = c22436h.m115923s();
                                        C22436h.f109762c = c22436h.m115894J();
                                        if (c22436h.m115923s()) {
                                            C26220b.m134827j("On remind reddot restore", null, 2, null);
                                        }
                                        if (m115923s && !c22436h.m115923s()) {
                                            c22436h.m115906m();
                                        }
                                        aVar.mo104548a("after isEnableRemindIcon=" + c22436h.m115923s(), new Object[0]);
                                    }
                                    C22436h.f109760a.m115910x();
                                }
                            } else {
                                C22436h.f109760a.m115913E();
                                z11 = true;
                            }
                        } else {
                            C22436h c22436h2 = C22436h.f109760a;
                            z13 = c22436h2.m115922r();
                        }
                        z11 = false;
                        z12 = false;
                        if (!z13) {
                            if (!z12) {
                            }
                        }
                        if (z11) {
                        }
                        C22436h.f109760a.m115910x();
                    }
                    C22436h.f109765f.m133027F();
                    z11 = C22436h.f109760a.m115923s();
                    z13 = false;
                    z12 = true;
                    if (!z13) {
                    }
                    if (z11) {
                    }
                    C22436h.f109760a.m115910x();
                }
                z11 = true;
                z12 = false;
                if (!z13) {
                }
                if (z11) {
                }
                C22436h.f109760a.m115910x();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    static {
        C25806c m120692n = AbstractC23306f.m120692n();
        AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
        f109765f = m120692n;
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        f109766g = m120676j;
    }

    private C22436h() {
    }

    /* renamed from: B */
    public static /* synthetic */ void m115891B(C22436h c22436h, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        c22436h.m115911A(i11, z11);
    }

    /* renamed from: D */
    public static final void m115892D() {
        AbstractC23306f.m120692n().m133027F();
        f109765f.m133038S(0);
        f109760a.m115911A(3, false);
    }

    /* renamed from: I */
    public final boolean m115893I() {
        boolean z11;
        boolean m128438c = C24721b.f118742a.m128438c();
        long m133057s = f109765f.m133057s();
        if (m133057s > 0 && C22447s.m116045l0(C26263i.m135058w(), true)) {
            z11 = true;
        } else {
            z11 = false;
        }
        C26220b.m134827j("Remind restore banner: " + m128438c + "," + C23793c.Companion.m124321a().mo124314i() + "," + m133057s, null, 2, null);
        if (!m128438c || !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public final boolean m115894J() {
        C26220b.m134827j("Remind restore icon: " + f109761b + "," + C23793c.Companion.m124321a().mo124314i() + "," + f109765f.m133061w() + "," + C24721b.f118742a.m128436a(), null, 2, null);
        if (m115908u()) {
            return true;
        }
        return m115909v();
    }

    /* renamed from: k */
    public final void m115905k() {
        f109765f.m133027F();
    }

    /* renamed from: m */
    public final void m115906m() {
        m115913E();
    }

    /* renamed from: t */
    private final boolean m115907t() {
        if (f109765f.m133061w() < 1) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private final boolean m115908u() {
        if (f109761b) {
            C25806c c25806c = f109765f;
            if (c25806c.m133057s() != 0 && C23793c.Companion.m124321a().mo124314i() - c25806c.m133057s() >= C24721b.f118742a.m128436a() * 1000 && m115907t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    private final boolean m115909v() {
        C21690e m133053o;
        if (!m115907t() || !C22447s.m116047m0(C26263i.m135058w(), false, 2, null) || (m133053o = f109765f.m133053o()) == null || m133053o.m143172f() || !C22438j.m115948p(m133053o.f105269f) || !m133053o.m111869G() || m133053o.mo96995c() || m133053o.m143168a() == 0 || C23793c.Companion.m124321a().mo124311f() - m133053o.m143168a() < C24721b.f118742a.m128436a() * 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final void m115910x() {
        try {
            C23744a.Companion.m124119a().m124116d(6024, new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: A */
    public final void m115911A(int i11, boolean z11) {
        if (!f109763d) {
            return;
        }
        a aVar = new a(i11);
        if (z11) {
            f109764e.mo13474a(aVar);
        } else {
            aVar.run();
        }
    }

    /* renamed from: C */
    public final void m115912C() {
        f109764e.mo13474a(new Runnable() { // from class: ld.g
            @Override // java.lang.Runnable
            public final void run() {
                C22436h.m115892D();
            }
        });
    }

    /* renamed from: E */
    public final void m115913E() {
        if (m115907t()) {
            f109765f.m133038S(1);
        }
    }

    /* renamed from: F */
    public final void m115914F() {
        if (f109761b) {
            f109761b = false;
            m115891B(this, 2, false, 2, null);
        }
    }

    /* renamed from: G */
    public final void m115915G() {
        if (f109762c) {
            f109762c = false;
            m115891B(this, 4, false, 2, null);
        }
    }

    /* renamed from: H */
    public final int m115916H() {
        return C24721b.f118742a.m128437b();
    }

    /* renamed from: l */
    public final void m115917l() {
        f109761b = false;
        f109762c = false;
    }

    /* renamed from: n */
    public final InterfaceC2798d m115918n() {
        return f109764e;
    }

    /* renamed from: o */
    public final void m115919o() {
        m115917l();
        f109763d = false;
    }

    /* renamed from: p */
    public final void m115920p() {
        if (C22447s.m116047m0(C26263i.m135058w(), false, 2, null) && AbstractC23306f.m120692n().m133057s() == 0 && !AbstractC23306f.m120676j().m128401R()) {
            C26220b.m134827j("Reset quota banner restore", null, 2, null);
            AbstractC23306f.m120692n().m133035O(C23793c.Companion.m124321a().mo124314i());
        }
        m115921q();
    }

    /* renamed from: q */
    public final void m115921q() {
        C24721b.f118742a.m128440e(f109766g.m128418m());
        f109763d = true;
        m115891B(this, 1, false, 2, null);
    }

    /* renamed from: r */
    public final boolean m115922r() {
        return f109761b;
    }

    /* renamed from: s */
    public final boolean m115923s() {
        return f109762c;
    }

    /* renamed from: w */
    public final boolean m115924w() {
        return C24721b.f118742a.m128439d();
    }

    /* renamed from: y */
    public final void m115925y() {
        m115915G();
    }

    /* renamed from: z */
    public final void m115926z(int i11) {
        m115891B(this, i11, false, 2, null);
    }
}
