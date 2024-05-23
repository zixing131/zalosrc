package il;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p271jl.C21284b;
import p271jl.InterfaceC21283a;
import p301kl.C21757a;
import p301kl.C21758b;
import p326ll.C22512c;
import p326ll.InterfaceC22510a;
import p405ov.C24561c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: il.a */
/* loaded from: classes.dex */
public final class C20604a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f101341c;

    /* renamed from: a */
    private final InterfaceC21283a f101342a;

    /* renamed from: b */
    private final InterfaceC22510a f101343b;

    /* renamed from: il.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f101344q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20604a mo12V4() {
            return c.f101345a.m107240a();
        }
    }

    /* renamed from: il.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20604a m107239a() {
            return (C20604a) C20604a.f101341c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: il.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f101345a = new c();

        /* renamed from: b */
        private static final C20604a f101346b = new C20604a(new C21284b(), new C22512c());

        private c() {
        }

        /* renamed from: a */
        public final C20604a m107240a() {
            return f101346b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f101344q);
        f101341c = m129210a;
    }

    public C20604a(InterfaceC21283a interfaceC21283a, InterfaceC22510a interfaceC22510a) {
        AbstractC19074t.m100208f(interfaceC21283a, "localDataSource");
        AbstractC19074t.m100208f(interfaceC22510a, "apiHelper");
        this.f101342a = interfaceC21283a;
        this.f101343b = interfaceC22510a;
    }

    /* renamed from: f */
    public static final C20604a m107231f() {
        return Companion.m107239a();
    }

    /* renamed from: b */
    public final void m107232b() {
        C24561c.m127942b("SMLTransferMsgRepository", "clearAllMemCache()");
    }

    /* renamed from: c */
    public final void m107233c(boolean z11, String str, String str2, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "syncSession");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f101343b.mo116396d(z11, str, str2, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: d */
    public final void m107234d(int i11, String str, String str2, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "publicKey");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f101343b.mo116395c(i11, str, str2, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: e */
    public final void m107235e() {
    }

    /* renamed from: g */
    public final void m107236g(C21758b c21758b, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c21758b, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f101343b.mo116394b(c21758b, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: h */
    public final void m107237h(C21757a c21757a, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c21757a, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f101343b.mo116393a(c21757a, interfaceC18505l, interfaceC18509p);
    }
}
