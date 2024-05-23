package d60;

import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0943w;
import b40.C2526d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ws.C29210k;

/* renamed from: d60.c */
/* loaded from: classes5.dex */
public final class C17794c {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static final InterfaceC24854k f89987f;

    /* renamed from: b */
    private int f89989b;

    /* renamed from: e */
    private boolean f89992e;

    /* renamed from: a */
    private final InterfaceC29232g f89988a = AbstractC29233h.m145990a(d.f89996q);

    /* renamed from: c */
    private final Set f89990c = new HashSet();

    /* renamed from: d */
    private final Map f89991d = new HashMap();

    /* renamed from: d60.c$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f89993q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C17794c mo12V4() {
            return c.f89994a.m93980a();
        }
    }

    /* renamed from: d60.c$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17794c m93979a() {
            return (C17794c) C17794c.f89987f.getValue();
        }
    }

    /* renamed from: d60.c$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f89994a = new c();

        /* renamed from: b */
        private static final C17794c f89995b = new C17794c();

        private c() {
        }

        /* renamed from: a */
        public final C17794c m93980a() {
            return f89995b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d60.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f89996q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC0924m0.m4009m3());
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f89993q);
        f89987f = m129210a;
    }

    /* renamed from: b */
    private final String m93964b(String str, String str2) {
        return str + "_" + str2;
    }

    /* renamed from: c */
    private final int m93965c() {
        return ((Number) this.f89988a.getValue()).intValue();
    }

    /* renamed from: d */
    private final boolean m93966d() {
        if (this.f89989b >= m93965c()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final void m93967e() {
        this.f89989b++;
    }

    /* renamed from: f */
    private final boolean m93968f() {
        return this.f89989b == 0;
    }

    /* renamed from: j */
    private final void m93969j(String str, String str2, C17798g c17798g) {
        String m2076E = C0815e1.m2076E(str2, str);
        AbstractC19074t.m100207e(m2076E, "getThreadIdParamActionLogV2ChatCore(...)");
        c17798g.m94027o(m2076E);
        C0815e1.m2075D().m2100V(new C23648e(1, "", 1, "load_msg_csc", str2, c17798g.m94028p()), false);
    }

    /* renamed from: k */
    private final boolean m93970k(String str) {
        C31973j5 m4472f;
        if (AbstractC25495a.m132078c(str)) {
            return true;
        }
        if (AbstractC25495a.m132079d(str) && (m4472f = C0943w.f3447a.m4472f(str)) != null && m4472f.m153732O() >= 200) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m93971g(String str) {
        AbstractC19074t.m100208f(str, "threadID");
        for (C17798g c17798g : new ArrayList(this.f89991d.values())) {
            if (c17798g.m94013a() && AbstractC19074t.m100204b(c17798g.m94014b(), str) && c17798g.m94015c()) {
                c17798g.m94026n(false);
                C29210k m145896a = C29210k.Companion.m145896a();
                AbstractC19074t.m100205c(c17798g);
                m145896a.m145850U(str, c17798g);
                m93969j(c17798g.m94014b(), C2526d.f10270a.m12733y(c17798g.m94014b()), c17798g);
                m93967e();
            }
        }
    }

    /* renamed from: h */
    public final void m93972h(List list) {
        AbstractC19074t.m100208f(list, "offlineThreads");
        if (!this.f89992e) {
            this.f89992e = true;
            for (C17798g c17798g : new ArrayList(this.f89991d.values())) {
                if (c17798g.m94013a() && !list.contains(c17798g.m94014b()) && c17798g.m94015c()) {
                    c17798g.m94026n(false);
                    String m94014b = c17798g.m94014b();
                    String m12733y = C2526d.f10270a.m12733y(c17798g.m94014b());
                    AbstractC19074t.m100205c(c17798g);
                    m93969j(m94014b, m12733y, c17798g);
                    m93967e();
                }
            }
        }
    }

    /* renamed from: i */
    public final void m93973i() {
        this.f89988a.reset();
        this.f89992e = false;
    }

    /* renamed from: l */
    public final void m93974l(String str, String str2) {
        AbstractC19074t.m100208f(str, "threadID");
        AbstractC19074t.m100208f(str2, "viewID");
        if (m93966d() || this.f89990c.contains(str)) {
            return;
        }
        C17798g c17798g = new C17798g();
        c17798g.m94025m(System.currentTimeMillis());
        c17798g.m94016d(m93968f());
        this.f89991d.put(m93964b(str, str2), c17798g);
        this.f89990c.add(str);
    }

    /* renamed from: m */
    public final void m93975m(String str, String str2) {
        C17798g c17798g;
        AbstractC19074t.m100208f(str, "threadID");
        AbstractC19074t.m100208f(str2, "viewID");
        if (!m93966d() && (c17798g = (C17798g) this.f89991d.get(m93964b(str, str2))) != null) {
            c17798g.m94017e(System.currentTimeMillis());
        }
    }

    /* renamed from: n */
    public final void m93976n(String str, String str2, String str3, boolean z11) {
        AbstractC19074t.m100208f(str, "threadID");
        AbstractC19074t.m100208f(str2, "viewID");
        AbstractC19074t.m100208f(str3, "logChatType");
        if (m93966d()) {
            return;
        }
        C17798g c17798g = (C17798g) this.f89991d.get(m93964b(str, str2));
        if (c17798g != null) {
            c17798g.m94024l(System.currentTimeMillis());
            if (AbstractC25495a.m132079d(str) || AbstractC25495a.m132078c(str)) {
                c17798g.m94023k(z11 ? 1 : 0);
                C29210k.Companion.m145896a().m145850U(str, c17798g);
            }
            if (c17798g.m94015c()) {
                if (m93970k(str)) {
                    if (this.f89992e) {
                        m93969j(str, str3, c17798g);
                    } else {
                        c17798g.m94026n(true);
                    }
                } else {
                    m93969j(str, str3, c17798g);
                }
            }
        }
        m93967e();
    }

    /* renamed from: o */
    public final void m93977o(String str, String str2, boolean z11) {
        C17798g c17798g;
        AbstractC19074t.m100208f(str, "threadID");
        AbstractC19074t.m100208f(str2, "viewID");
        if (!m93966d() && (c17798g = (C17798g) this.f89991d.get(m93964b(str, str2))) != null) {
            c17798g.m94021i(System.currentTimeMillis());
            c17798g.m94019g(z11);
        }
    }
}
