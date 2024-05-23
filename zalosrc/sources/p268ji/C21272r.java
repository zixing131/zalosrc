package p268ji;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import nh0.InterfaceC23792b;
import p268ji.C21270p;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23310j;
import p348mi.C23311k;
import p348mi.C23312l;

/* renamed from: ji.r */
/* loaded from: classes3.dex */
public final class C21272r {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC23792b f103636a;

    /* renamed from: b */
    private int f103637b;

    /* renamed from: c */
    private boolean f103638c;

    /* renamed from: d */
    private boolean f103639d;

    /* renamed from: e */
    private C23311k f103640e;

    /* renamed from: f */
    private C23312l f103641f;

    /* renamed from: ji.r$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC23310j {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ji.r$a$a */
        /* loaded from: classes3.dex */
        public static final class C32851a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32851a f103642q = new C32851a();

            C32851a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final C21272r mo12V4() {
                return new C21272r(null);
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(C32851a.f103642q);
        }
    }

    public /* synthetic */ C21272r(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    private final boolean m110172a(C23312l c23312l) {
        if (c23312l.m122684b().length() > 0 && c23312l.m122687e() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m110173b() {
        this.f103639d = false;
        this.f103637b = -1;
        this.f103638c = false;
    }

    /* renamed from: c */
    public final int m110174c() {
        return this.f103637b;
    }

    /* renamed from: d */
    public final C23311k m110175d() {
        C23311k c23311k = this.f103640e;
        if (c23311k != null) {
            return c23311k;
        }
        AbstractC19074t.m100223u("trackingLogSearchAndSendStickerPanelData");
        return null;
    }

    /* renamed from: e */
    public final void m110176e() {
        C23312l c23312l = this.f103641f;
        if (c23312l == null) {
            AbstractC19074t.m100223u("trackingLogUsingTrendingTabData");
            c23312l = null;
        }
        c23312l.m122688f();
    }

    /* renamed from: f */
    public final void m110177f() {
        m110185n();
        this.f103640e = new C23311k();
        this.f103641f = new C23312l();
        this.f103639d = true;
    }

    /* renamed from: g */
    public final boolean m110178g() {
        return this.f103639d;
    }

    /* renamed from: h */
    public final void m110179h() {
        C23312l c23312l = this.f103641f;
        if (c23312l == null) {
            AbstractC19074t.m100223u("trackingLogUsingTrendingTabData");
            c23312l = null;
        }
        c23312l.m122683a(this.f103636a.mo124314i());
    }

    /* renamed from: i */
    public final void m110180i(boolean z11) {
        this.f103638c = z11;
    }

    /* renamed from: j */
    public final void m110181j(int i11) {
        this.f103637b = i11;
    }

    /* renamed from: k */
    public final void m110182k() {
        C23312l c23312l = this.f103641f;
        if (c23312l == null) {
            AbstractC19074t.m100223u("trackingLogUsingTrendingTabData");
            c23312l = null;
        }
        c23312l.m122689g(this.f103636a.mo124314i());
    }

    /* renamed from: l */
    public final void m110183l() {
        C23311k m110175d = m110175d();
        if (m110175d.m122678f() == -1) {
            m110175d.m122682j(this.f103636a.mo124314i());
            m110175d.m122680h(this.f103636a.mo124314i() - m110175d.m122678f());
        }
    }

    /* renamed from: m */
    public final void m110184m() {
        m110175d().m122682j(this.f103636a.mo124314i());
    }

    /* renamed from: n */
    public final void m110185n() {
        if (this.f103639d) {
            C23311k m110175d = m110175d();
            if (m110175d.m122673a().length() == 0) {
                m110175d.m122673a().put(4);
            }
            C21270p.b bVar = C21270p.Companion;
            C21270p m110161b = bVar.m110161b();
            long m122678f = m110175d.m122678f();
            long m122674b = m110175d.m122674b();
            int m122677e = m110175d.m122677e();
            String jSONArray = m110175d.m122673a().toString();
            AbstractC19074t.m100207e(jSONArray, "toString(...)");
            m110161b.m110150W(m122678f, m122674b, m122677e, jSONArray, m110175d.m122676d(), m110175d.m122675c(), AbstractC23304d.f113261C.size());
            C23312l c23312l = this.f103641f;
            if (c23312l == null) {
                AbstractC19074t.m100223u("trackingLogUsingTrendingTabData");
                c23312l = null;
            }
            if (m110172a(c23312l)) {
                bVar.m110161b().m110155e0(c23312l.m122684b(), c23312l.m122687e(), c23312l.m122686d(), c23312l.m122685c());
            }
            m110173b();
        }
    }

    private C21272r() {
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        this.f103636a = m120579F1;
        this.f103637b = -1;
    }
}
