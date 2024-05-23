package p550ul;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ul.b */
/* loaded from: classes3.dex */
public final class C27296b {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f128406a;

    /* renamed from: ul.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f128407q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27296b mo12V4() {
            return c.f128408a.m139713a();
        }
    }

    /* renamed from: ul.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C27296b m139712a() {
            return (C27296b) C27296b.f128406a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ul.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f128408a = new c();

        /* renamed from: b */
        private static final C27296b f128409b = new C27296b();

        private c() {
        }

        /* renamed from: a */
        public final C27296b m139713a() {
            return f128409b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f128407q);
        f128406a = m129210a;
    }

    /* renamed from: b */
    public final void m139710b(int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMsg");
        EnumC27295a.Companion.m139708a(i11).m139707d(i11, str);
    }
}
