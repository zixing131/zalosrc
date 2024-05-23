package p646xi;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import p682yi.C30993h;
import p682yi.InterfaceC30986a;
import p717zi.C32214b;
import p717zi.InterfaceC32213a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: xi.a */
/* loaded from: classes3.dex */
public final class C29669a {
    public static final a Companion = new a(null);

    /* renamed from: h */
    private static volatile C29669a f136975h;

    /* renamed from: a */
    private final InterfaceC30986a f136976a;

    /* renamed from: b */
    private final InterfaceC32213a f136977b;

    /* renamed from: c */
    private int f136978c;

    /* renamed from: d */
    private int f136979d;

    /* renamed from: e */
    private int f136980e;

    /* renamed from: f */
    private final InterfaceC24854k f136981f;

    /* renamed from: g */
    private final InterfaceC24854k f136982g;

    /* renamed from: xi.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29669a m147509a() {
            C29669a c29669a = C29669a.f136975h;
            if (c29669a == null) {
                synchronized (this) {
                    c29669a = new C29669a(new C30993h(), new C32214b());
                    C29669a.f136975h = c29669a;
                }
            }
            return c29669a;
        }
    }

    /* renamed from: xi.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C29669a.this.f136976a.mo150631h();
        }
    }

    /* renamed from: xi.a$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C29669a.this.f136976a.mo150640q();
        }
    }

    public C29669a(InterfaceC30986a interfaceC30986a, InterfaceC32213a interfaceC32213a) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC30986a, "cameraDataSource");
        AbstractC19074t.m100208f(interfaceC32213a, "cameraApiHelper");
        this.f136976a = interfaceC30986a;
        this.f136977b = interfaceC32213a;
        this.f136978c = -1;
        this.f136979d = -1;
        this.f136980e = Integer.MIN_VALUE;
        m129210a = AbstractC24856m.m129210a(new c());
        this.f136981f = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new b());
        this.f136982g = m129210a2;
    }

    /* renamed from: m */
    public static final C29669a m147490m() {
        return Companion.m147509a();
    }

    /* renamed from: d */
    public final List m147491d() {
        return (List) this.f136982g.getValue();
    }

    /* renamed from: e */
    public final List m147492e() {
        return (List) this.f136981f.getValue();
    }

    /* renamed from: f */
    public final int m147493f() {
        return this.f136976a.mo150633j();
    }

    /* renamed from: g */
    public final int[] m147494g() {
        return this.f136976a.mo150625b();
    }

    /* renamed from: h */
    public final int m147495h() {
        return this.f136976a.mo150629f();
    }

    /* renamed from: i */
    public final int m147496i() {
        return this.f136976a.mo150630g();
    }

    /* renamed from: j */
    public final int m147497j() {
        if (this.f136979d == -1) {
            this.f136979d = this.f136976a.mo150635l();
        }
        return this.f136979d;
    }

    /* renamed from: k */
    public final int[] m147498k() {
        return this.f136976a.mo150636m();
    }

    /* renamed from: l */
    public final int m147499l() {
        if (this.f136978c == -1) {
            this.f136978c = this.f136976a.mo150638o();
        }
        return this.f136978c;
    }

    /* renamed from: n */
    public final int m147500n() {
        if (this.f136980e == Integer.MIN_VALUE) {
            this.f136980e = this.f136976a.mo150641r();
        }
        return this.f136980e;
    }

    /* renamed from: o */
    public final boolean m147501o() {
        return this.f136976a.mo150637n();
    }

    /* renamed from: p */
    public final boolean m147502p() {
        return this.f136976a.mo150627d();
    }

    /* renamed from: q */
    public final void m147503q() {
        this.f136976a.mo150624a();
    }

    /* renamed from: r */
    public final void m147504r() {
        this.f136976a.mo150632i();
    }

    /* renamed from: s */
    public final void m147505s(int i11) {
        this.f136976a.mo150628e(i11);
    }

    /* renamed from: t */
    public final void m147506t(int i11) {
        this.f136976a.mo150639p(i11);
    }

    /* renamed from: u */
    public final void m147507u(int i11) {
        this.f136976a.mo150626c(i11);
    }

    /* renamed from: v */
    public final void m147508v(int i11) {
        this.f136978c = i11;
        this.f136976a.mo150634k(i11);
    }
}
