package gn;

import ag0.AbstractC0837p0;
import c30.C3245i;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gn.C19516c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p248iy.AbstractC20887g;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: gn.b */
/* loaded from: classes3.dex */
public final class C19515b {
    public static final b Companion = new b(null);

    /* renamed from: d */
    private static final InterfaceC24854k f96869d;

    /* renamed from: a */
    private final InterfaceC24854k f96870a;

    /* renamed from: b */
    private final InterfaceC24854k f96871b;

    /* renamed from: c */
    private final e f96872c;

    /* renamed from: gn.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f96873q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19515b mo12V4() {
            return c.f96874a.m102007a();
        }
    }

    /* renamed from: gn.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19515b m102006a() {
            return (C19515b) C19515b.f96869d.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gn.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f96874a = new c();

        /* renamed from: b */
        private static final C19515b f96875b = new C19515b();

        private c() {
        }

        /* renamed from: a */
        public final C19515b m102007a() {
            return f96875b;
        }
    }

    /* renamed from: gn.b$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f96876q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            return Collections.synchronizedMap(new HashMap());
        }
    }

    /* renamed from: gn.b$e */
    /* loaded from: classes3.dex */
    public static final class e implements C19516c.b {
        e() {
        }

        @Override // gn.C19516c.b
        /* renamed from: a */
        public void mo102009a(int i11) {
            C19515b.this.m101995h().remove(Integer.valueOf(i11));
            C19515b.this.m101997k(i11);
            C19515b.this.m101999o();
        }
    }

    /* renamed from: gn.b$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f96878q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap mo12V4() {
            return new ConcurrentHashMap();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f96873q);
        f96869d = m129210a;
    }

    public C19515b() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f96876q);
        this.f96870a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(f.f96878q);
        this.f96871b = m129210a2;
        this.f96872c = new e();
    }

    /* renamed from: f */
    private final Map m101994f() {
        return (Map) this.f96870a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final Map m101995h() {
        return (Map) this.f96871b.getValue();
    }

    /* renamed from: i */
    public static final C19515b m101996i() {
        return Companion.m102006a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m101997k(int i11) {
        String str;
        C19516c c19516c = (C19516c) m101994f().remove(Integer.valueOf(i11));
        if (i11 == 39) {
            if (c19516c != null) {
                str = "successfull";
            } else {
                str = "failed";
            }
            AbstractC20887g.m109230h(1000000, "remove 39 off queue " + str);
        }
    }

    /* renamed from: n */
    private final void m101998n(C19516c c19516c) {
        Map m101994f = m101994f();
        AbstractC19074t.m100207e(m101994f, "<get-downloadQueue>(...)");
        m101994f.put(Integer.valueOf(c19516c.m102013c().m16463e()), c19516c);
        if (c19516c.m102013c().m16463e() == 39) {
            AbstractC20887g.m109230h(1000000, "add queue");
        }
        m101999o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m101999o() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gn.a
            @Override // java.lang.Runnable
            public final void run() {
                C19515b.m102000p(C19515b.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m102000p(C19515b c19515b) {
        AbstractC19074t.m100208f(c19515b, "this$0");
        Map m101994f = c19515b.m101994f();
        AbstractC19074t.m100207e(m101994f, "<get-downloadQueue>(...)");
        synchronized (m101994f) {
            try {
                if (!c19515b.m101994f().isEmpty() && !(!c19515b.m101995h().isEmpty())) {
                    Object next = c19515b.m101994f().values().iterator().next();
                    AbstractC19074t.m100207e(next, "next(...)");
                    c19515b.m101995h().put(Integer.valueOf(((C19516c) next).m102013c().f13854b), Integer.valueOf(((C19516c) next).m102013c().f13854b));
                    ((C19516c) next).m102014d(c19515b.f96872c);
                    if (((C19516c) next).m102013c().f13854b == 39) {
                        AbstractC20887g.m109230h(1000000, "start 172 on next task");
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    ((C19516c) next).m102017g();
                }
            } finally {
            }
        }
    }

    /* renamed from: g */
    public final C19516c m102001g(int i11) {
        return (C19516c) m101994f().get(Integer.valueOf(i11));
    }

    /* renamed from: j */
    public final boolean m102002j(int i11) {
        return m101995h().containsKey(Integer.valueOf(i11));
    }

    /* renamed from: l */
    public final void m102003l(C3245i c3245i, int i11, int i12, int i13, C19516c.c cVar) {
        AbstractC19074t.m100208f(c3245i, "curCate");
        int i14 = c3245i.f13854b;
        if (i14 < 0) {
            return;
        }
        if (i14 == 39) {
            AbstractC20887g.m109230h(1000000, "check is in queue");
        }
        if (m102001g(c3245i.f13854b) != null) {
            return;
        }
        C19516c c19516c = new C19516c(c3245i, i11, i12, i13);
        c19516c.m102015e(cVar);
        m101998n(c19516c);
    }

    /* renamed from: m */
    public final void m102004m(C3245i c3245i, int i11, C19516c.c cVar) {
        AbstractC19074t.m100208f(c3245i, "curCate");
        m102003l(c3245i, i11, 0, -1, cVar);
    }
}
