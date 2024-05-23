package gw;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import nh0.InterfaceC23792b;
import p019aj.C0872f;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: gw.t0 */
/* loaded from: classes4.dex */
public final class C19658t0 {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f97531c;

    /* renamed from: a */
    private final C0872f f97532a;

    /* renamed from: b */
    private final InterfaceC23792b f97533b;

    /* renamed from: gw.t0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f97534q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19658t0 mo12V4() {
            return c.f97535a.m103090a();
        }
    }

    /* renamed from: gw.t0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19658t0 m103089a() {
            return (C19658t0) C19658t0.f97531c.getValue();
        }
    }

    /* renamed from: gw.t0$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f97535a = new c();

        /* renamed from: b */
        private static final C19658t0 f97536b;

        static {
            C0872f m120562A = AbstractC23306f.m120562A();
            AbstractC19074t.m100207e(m120562A, "provideChatRepo(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f97536b = new C19658t0(m120562A, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C19658t0 m103090a() {
            return f97536b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f97534q);
        f97531c = m129210a;
    }

    public C19658t0(C0872f c0872f, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f97532a = c0872f;
        this.f97533b = interfaceC23792b;
    }

    /* renamed from: d */
    public static final C19658t0 m103085d() {
        return Companion.m103089a();
    }

    /* renamed from: b */
    public final synchronized String m103086b() {
        return String.valueOf(m103087c());
    }

    /* renamed from: c */
    public final synchronized long m103087c() {
        long mo124310e = this.f97533b.mo124310e();
        if (!this.f97532a.m2528W()) {
            return mo124310e;
        }
        long m2567z = this.f97532a.m2567z();
        if (mo124310e <= m2567z) {
            mo124310e = 1 + m2567z;
        }
        this.f97532a.m2554p0(mo124310e);
        return mo124310e;
    }
}
