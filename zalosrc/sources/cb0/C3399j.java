package cb0;

import ag0.AbstractC0837p0;
import cb0.C3399j;
import com.zing.zalo.AbstractC8020f0;
import dg0.AbstractC17930e;
import en0.InterfaceC18505l;
import he0.InterfaceC20026a;
import hu.C20128b;
import java.util.concurrent.Future;
import je0.C21230a;
import je0.C21232c;
import je0.InterfaceC21231b;
import mm0.AbstractC23350e;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p213hl.C20086b;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p371nv.C23952g;
import p664y.AbstractC30228a;
import pm0.C24848g0;
import za0.C31747a;

/* renamed from: cb0.j */
/* loaded from: classes6.dex */
public class C3399j extends AbstractC19962a implements InterfaceC3390a {

    /* renamed from: z */
    protected static final String f14345z = "j";

    /* renamed from: t */
    private final C20086b f14346t;

    /* renamed from: u */
    private C21232c f14347u;

    /* renamed from: v */
    private final C21230a f14348v;

    /* renamed from: w */
    private Future f14349w;

    /* renamed from: x */
    private boolean f14350x;

    /* renamed from: y */
    private long f14351y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cb0.j$a */
    /* loaded from: classes6.dex */
    public class a implements InterfaceC21231b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m17101c(long j11, long j12, long j13, long j14, long j15) {
            long j16;
            if (!((InterfaceC3391b) C3399j.this.m103742Dp()).mo78963ru()) {
                return;
            }
            boolean z11 = true;
            C3399j.this.f14350x = true;
            C3399j c3399j = C3399j.this;
            if (j12 < 0) {
                j16 = 0;
            } else {
                j16 = j12;
            }
            c3399j.m17097bq(j11, j16, j13, j14, j15);
            InterfaceC3391b interfaceC3391b = (InterfaceC3391b) C3399j.this.m103742Dp();
            if (j12 <= 0 || C3399j.this.f14346t.m104435f().isEmpty()) {
                z11 = false;
            }
            interfaceC3391b.mo17080tC(z11);
        }

        @Override // je0.InterfaceC21231b
        /* renamed from: a */
        public void mo17102a(final long j11, long j12, final long j13, final long j14, boolean z11, final long j15) {
            long m104439j = C3399j.this.f14346t.m104439j();
            final long m104438i = C3399j.this.f14346t.m104438i() - m104439j;
            C23952g.m125345j("Tool Storage", "last totalConversationData: " + C3399j.this.f14346t.m104438i() + ". sizeToBeSubtracted: " + m104439j + ". newTotalConversationDataSize: " + m104438i);
            ((InterfaceC3391b) C3399j.this.m103742Dp()).mo70710wy(new Runnable() { // from class: cb0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C3399j.a.this.m17101c(j11, m104438i, j13, j14, j15);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cb0.j$b */
    /* loaded from: classes6.dex */
    public class b implements InterfaceC20026a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m17104d() {
            ((InterfaceC3391b) C3399j.this.m103742Dp()).mo59032jx(AbstractC8020f0.str_storage_usage_and_cache_type_cache_clear_success);
            ((InterfaceC3391b) C3399j.this.m103742Dp()).mo49315c4();
            AbstractC23306f.m120564A1().m105693b();
        }

        @Override // he0.InterfaceC20026a
        /* renamed from: a */
        public void mo17105a() {
            ((InterfaceC3391b) C3399j.this.m103742Dp()).mo70710wy(new Runnable() { // from class: cb0.k
                @Override // java.lang.Runnable
                public final void run() {
                    C3399j.b.this.m17104d();
                }
            });
            C3399j.this.mo17067t8(false, false, true);
        }

        @Override // he0.InterfaceC20026a
        /* renamed from: b */
        public void mo17106b() {
        }
    }

    public C3399j(InterfaceC3391b interfaceC3391b, C20086b c20086b, C21232c c21232c, C21230a c21230a) {
        super(interfaceC3391b);
        this.f14350x = false;
        this.f14351y = System.currentTimeMillis();
        this.f14346t = c20086b;
        this.f14347u = c21232c;
        this.f14348v = c21230a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sp */
    public /* synthetic */ void m17091Sp(long j11, long j12, long j13, long j14) {
        long j15;
        if (j12 < 0) {
            j15 = 0;
        } else {
            j15 = j12;
        }
        m17097bq(j11, j15, j13, j14, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Tp */
    public /* synthetic */ void m17092Tp() {
        while (this.f14346t.m104436g() != this.f14346t.m104440k()) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e11) {
                AbstractC23350e.m122776f(f14345z, e11);
            }
        }
        this.f14346t.m104449t(false);
        final long m104438i = this.f14346t.m104438i() - this.f14346t.m104439j();
        final long m104437h = this.f14346t.m104437h();
        final long m104764k = C20128b.m104764k();
        final long m104766m = C20128b.m104766m();
        C23952g.m125345j("Tool Storage", " loadInfoUsageAndCache totalDeviceStorage: " + m104766m + " bytes.");
        ((InterfaceC3391b) m103742Dp()).mo70710wy(new Runnable() { // from class: cb0.f
            @Override // java.lang.Runnable
            public final void run() {
                C3399j.this.m17091Sp(m104437h, m104438i, m104764k, m104766m);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wp */
    public /* synthetic */ void m17093Wp() {
        C21232c c21232c = this.f14347u;
        if (c21232c == null) {
            return;
        }
        c21232c.m101508a(new C21232c.d(new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xp */
    public /* synthetic */ C24848g0 m17094Xp(Integer num) {
        ((InterfaceC3391b) m103742Dp()).mo17081te(num.intValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Yp */
    public /* synthetic */ void m17095Yp() {
        C23952g.m125345j("Tool Storage", " onConfirmClearCache");
        ((InterfaceC3391b) m103742Dp()).mo17073L5();
        ((InterfaceC3391b) m103742Dp()).mo46829Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zp */
    public /* synthetic */ void m17096Zp() {
        if (this.f14346t.m104434e().isEmpty()) {
            return;
        }
        ((InterfaceC3391b) m103742Dp()).mo70710wy(new Runnable() { // from class: cb0.h
            @Override // java.lang.Runnable
            public final void run() {
                C3399j.this.m17095Yp();
            }
        });
        AbstractC23647d.m123897g("711222");
        C31747a.m152713l(this.f14346t.m104437h());
        this.f14348v.m101508a(new C21230a.a(new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bq */
    public void m17097bq(long j11, long j12, long j13, long j14, long j15) {
        C23952g.m125345j("Tool Storage", " presentData totalConversationDataSize: " + j12 + " bytes.");
        ((InterfaceC3391b) m103742Dp()).mo17074M8(j12);
        ((InterfaceC3391b) m103742Dp()).mo17076Wo(j11);
        long j16 = j11 + j12;
        ((InterfaceC3391b) m103742Dp()).mo17071Iz(j16);
        long j17 = (j14 - j13) - j16;
        ((InterfaceC3391b) m103742Dp()).mo17077bH(j17);
        ((InterfaceC3391b) m103742Dp()).mo17079nf(j13);
        ((InterfaceC3391b) m103742Dp()).mo17069D9(j16, ((float) j16) / ((float) j14), j17, j13);
        if (j11 >= 1024.0d) {
            ((InterfaceC3391b) m103742Dp()).mo17070Fh(true);
        }
        if (j12 > 0 && !this.f14346t.m104435f().isEmpty()) {
            ((InterfaceC3391b) m103742Dp()).mo17080tC(true);
        }
        if (j15 != -1) {
            C31747a.m152715n(j15, j14, j13, j16, j11, j12, j17);
        }
    }

    /* renamed from: cq */
    private void m17098cq() {
        C31747a.m152720s();
        AbstractC23647d.m123897g("711227");
    }

    @Override // cb0.InterfaceC3390a
    /* renamed from: Dm */
    public void mo17064Dm() {
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: cb0.g
            @Override // java.lang.Runnable
            public final void run() {
                C3399j.this.m17096Zp();
            }
        });
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
        Future future = this.f14349w;
        if (future != null) {
            future.cancel(true);
        }
        C21232c c21232c = this.f14347u;
        if (c21232c != null) {
            c21232c.m110025g();
            this.f14347u = null;
        }
        if (!this.f14350x) {
            C31747a.m152716o(System.currentTimeMillis() - this.f14351y);
        }
    }

    @Override // cb0.InterfaceC3390a
    /* renamed from: Kh */
    public void mo17065Kh() {
        ((InterfaceC3391b) m103742Dp()).mo17075Mf(this.f14346t.m104438i(), this.f14346t.m104437h());
        AbstractC23647d.m123897g("711224");
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public /* bridge */ /* synthetic */ void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        AbstractC30228a.m149044a(interfaceC19969h);
        m17099aq(null, interfaceC19968g);
    }

    @Override // cb0.InterfaceC3390a
    /* renamed from: Rk */
    public void mo17066Rk() {
        ((InterfaceC3391b) m103742Dp()).mo17072JA();
        AbstractC23647d.m123897g("711223");
    }

    /* renamed from: aq */
    public void m17099aq(AbstractC3405p abstractC3405p, InterfaceC19968g interfaceC19968g) {
        m17098cq();
        AbstractC23306f.m120564A1().m105695d(new InterfaceC18505l() { // from class: cb0.e
            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m17094Xp;
                m17094Xp = C3399j.this.m17094Xp((Integer) obj);
                return m17094Xp;
            }
        });
    }

    @Override // cb0.InterfaceC3390a
    /* renamed from: t8 */
    public void mo17067t8(boolean z11, boolean z12, boolean z13) {
        if (z11 && m103742Dp() != null) {
            C23952g.m125345j("Tool Storage", " loadInfoUsageAndCache");
            ((InterfaceC3391b) m103742Dp()).mo17073L5();
        }
        if (z12) {
            this.f14346t.m104449t(true);
            this.f14349w = AbstractC17930e.m94545d().mo94528b(new Runnable() { // from class: cb0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3399j.this.m17092Tp();
                }
            });
        } else {
            AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: cb0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C3399j.this.m17093Wp();
                }
            });
        }
    }

    @Override // cb0.InterfaceC3390a
    /* renamed from: u4 */
    public void mo17068u4() {
        ((InterfaceC3391b) m103742Dp()).mo17078jI();
        AbstractC23647d.m123897g("711221");
    }
}
