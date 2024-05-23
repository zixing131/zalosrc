package p163fl;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gl.C19478b;
import gl.InterfaceC19477a;
import p405ov.C24561c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: fl.a */
/* loaded from: classes3.dex */
public final class C18989a {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f94798b;

    /* renamed from: a */
    private final InterfaceC19477a f94799a;

    /* renamed from: fl.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f94800q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18989a mo12V4() {
            return c.f94801a.m99712a();
        }
    }

    /* renamed from: fl.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18989a m99711a() {
            return (C18989a) C18989a.f94798b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fl.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f94801a = new c();

        /* renamed from: b */
        private static final C18989a f94802b = new C18989a(new C19478b());

        private c() {
        }

        /* renamed from: a */
        public final C18989a m99712a() {
            return f94802b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f94800q);
        f94798b = m129210a;
    }

    public C18989a(InterfaceC19477a interfaceC19477a) {
        AbstractC19074t.m100208f(interfaceC19477a, "localDataSource");
        this.f94799a = interfaceC19477a;
    }

    /* renamed from: d */
    public static final C18989a m99697d() {
        return Companion.m99711a();
    }

    /* renamed from: b */
    public final void m99698b() {
        C24561c.m127942b("SMLStorageRepository", "clearAllMemCache()");
    }

    /* renamed from: c */
    public final void m99699c() {
    }

    /* renamed from: e */
    public final int m99700e() {
        return this.f94799a.mo101830b();
    }

    /* renamed from: f */
    public final long m99701f() {
        return this.f94799a.mo101838j();
    }

    /* renamed from: g */
    public final long m99702g() {
        return this.f94799a.mo101835g();
    }

    /* renamed from: h */
    public final boolean m99703h() {
        return this.f94799a.mo101829a();
    }

    /* renamed from: i */
    public final boolean m99704i() {
        return this.f94799a.mo101836h();
    }

    /* renamed from: j */
    public final void m99705j(boolean z11) {
        this.f94799a.mo101837i(z11);
    }

    /* renamed from: k */
    public final void m99706k(boolean z11) {
        this.f94799a.mo101831c(z11);
    }

    /* renamed from: l */
    public final void m99707l(int i11) {
        this.f94799a.mo101832d(i11);
    }

    /* renamed from: m */
    public final void m99708m(long j11) {
        this.f94799a.mo101834f(j11);
    }

    /* renamed from: n */
    public final void m99709n(long j11) {
        this.f94799a.mo101833e(j11);
    }
}
