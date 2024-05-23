package gw;

import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7959d;
import dg0.AbstractC17930e;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gw.C19666x0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ln0.AbstractC22543l;
import mg.C23288a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p019aj.C0876j;
import p056cj.C3533a;
import p348mi.AbstractC23306f;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* renamed from: gw.x0 */
/* loaded from: classes4.dex */
public final class C19666x0 {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f97545e;

    /* renamed from: a */
    private final C0876j f97546a;

    /* renamed from: b */
    private final List f97547b;

    /* renamed from: c */
    private final Map f97548c;

    /* renamed from: d */
    private final Map f97549d;

    /* renamed from: gw.x0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f97550q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19666x0 mo12V4() {
            return c.f97551a.m103118a();
        }
    }

    /* renamed from: gw.x0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19666x0 m103117a() {
            return (C19666x0) C19666x0.f97545e.getValue();
        }
    }

    /* renamed from: gw.x0$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f97551a = new c();

        /* renamed from: b */
        private static final C19666x0 f97552b;

        static {
            C0876j m120584H0 = AbstractC23306f.m120584H0();
            AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
            f97552b = new C19666x0(m120584H0);
        }

        private c() {
        }

        /* renamed from: a */
        public final C19666x0 m103118a() {
            return f97552b;
        }
    }

    /* renamed from: gw.x0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C3533a f97553a;

        d(C3533a c3533a) {
            this.f97553a = c3533a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41756V1(this.f97553a);
        }
    }

    /* renamed from: gw.x0$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ C3533a f97555b;

        e(C3533a c3533a) {
            this.f97555b = c3533a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList m131500h;
            C19666x0 c19666x0 = C19666x0.this;
            m131500h = AbstractC25368s.m131500h(this.f97555b);
            c19666x0.m103115u(m131500h);
            C19666x0.this.m103112n(this.f97555b);
        }
    }

    /* renamed from: gw.x0$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C19059j0 f97556a;

        f(C19059j0 c19059j0) {
            this.f97556a = c19059j0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41756V1((C3533a) this.f97556a.f94941p);
        }
    }

    /* renamed from: gw.x0$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ C3533a f97558b;

        g(C3533a c3533a) {
            this.f97558b = c3533a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList m131500h;
            try {
                C19666x0 c19666x0 = C19666x0.this;
                m131500h = AbstractC25368s.m131500h(this.f97558b);
                c19666x0.m103115u(m131500h);
                C19666x0.this.m103112n(this.f97558b);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: gw.x0$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f97559a;

        /* renamed from: b */
        final /* synthetic */ C19666x0 f97560b;

        /* renamed from: gw.x0$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C3533a f97561a;

            a(C3533a c3533a) {
                this.f97561a = c3533a;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7959d.Companion.m41850e().m41736P2(this.f97561a.m17912g());
            }
        }

        /* renamed from: gw.x0$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C3533a f97562a;

            b(C3533a c3533a) {
                this.f97562a = c3533a;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7959d m41850e = C7959d.Companion.m41850e();
                C3533a c3533a = this.f97562a;
                AbstractC19074t.m100207e(c3533a, "$ackStatus");
                m41850e.m41756V1(c3533a);
            }
        }

        h(ArrayList arrayList, C19666x0 c19666x0) {
            this.f97559a = arrayList;
            this.f97560b = c19666x0;
        }

        /* renamed from: d */
        public static final void m103120d(C19666x0 c19666x0, ArrayList arrayList) {
            AbstractC19074t.m100208f(c19666x0, "this$0");
            AbstractC19074t.m100208f(arrayList, "$ackSeenList");
            c19666x0.m103113o(arrayList);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C24559a.m127933c("SendSeenManager", "sendSeenToServer(): " + c20096c);
            Iterator it = this.f97559a.iterator();
            while (it.hasNext()) {
                C3533a c3533a = (C3533a) it.next();
                if (c3533a.m17919n() != 0) {
                    c3533a.m17929x(0);
                    C0824j.m2153b(new b(c3533a));
                }
            }
            AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: gw.y0

                /* renamed from: q */
                public final /* synthetic */ ArrayList f97565q;

                public /* synthetic */ RunnableC19668y0(ArrayList arrayList) {
                    r2 = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19666x0.h.m103120d(C19666x0.this, r2);
                }
            }, 5000L);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C24559a.m127933c("SendSeenManager", "sendSeenToServer(): Successfully!");
            Iterator it = this.f97559a.iterator();
            while (it.hasNext()) {
                C3533a c3533a = (C3533a) it.next();
                c3533a.m17929x(2);
                C0824j.m2153b(new a(c3533a));
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f97550q);
        f97545e = m129210a;
    }

    public C19666x0(C0876j c0876j) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        this.f97546a = c0876j;
        this.f97547b = new ArrayList();
        this.f97548c = new TreeMap();
        this.f97549d = new HashMap();
    }

    /* renamed from: f */
    public static final void m103096f(String str, C19666x0 c19666x0, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(c19666x0, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        C3533a m41837x1 = C7959d.Companion.m41850e().m41837x1(str);
        c19666x0.f97549d.put(str, Boolean.FALSE);
        c19666x0.f97548c.put(str, m41837x1);
        c19666x0.m103104s(str, c17945a0);
    }

    /* renamed from: i */
    private final synchronized void m103097i() {
        int m116584g;
        boolean z11;
        try {
            m116584g = AbstractC22543l.m116584g(this.f97547b.size(), 50);
            if (this.f97547b.size() >= 50) {
                z11 = true;
            } else {
                z11 = false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            do {
                C3533a m103101m = m103101m();
                if (m103101m != null) {
                    if (m103101m.m17906a()) {
                        arrayList2.add(m103101m);
                    } else {
                        arrayList.add(m103101m);
                    }
                }
            } while (arrayList.size() + arrayList2.size() < m116584g);
            if (!arrayList.isEmpty()) {
                m103115u(arrayList);
                m103105t(arrayList, false);
            }
            if (!arrayList2.isEmpty()) {
                m103115u(arrayList2);
                m103105t(arrayList2, true);
            }
            if (z11) {
                m103102q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    public static final C19666x0 m103098j() {
        return Companion.m103117a();
    }

    /* renamed from: k */
    private final boolean m103099k(C3533a c3533a) {
        if (c3533a.m17919n() == 1 || c3533a.m17919n() == 0 || c3533a.m17919n() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final boolean m103100l() {
        return this.f97547b.isEmpty();
    }

    /* renamed from: m */
    private final synchronized C3533a m103101m() {
        Object m131206f0;
        C3533a c3533a;
        m131206f0 = AbstractC25332a0.m131206f0(this.f97547b);
        c3533a = (C3533a) m131206f0;
        if (c3533a != null) {
            this.f97547b.remove(c3533a);
        } else {
            c3533a = null;
        }
        return c3533a;
    }

    /* renamed from: q */
    private final void m103102q() {
        AbstractC17930e.Companion.m94551d().mo94529c("SEND_SEEN_STATUS", new Runnable() { // from class: gw.w0
            public /* synthetic */ RunnableC19664w0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19666x0.m103103r(C19666x0.this);
            }
        }, 2000L);
    }

    /* renamed from: r */
    public static final void m103103r(C19666x0 c19666x0) {
        AbstractC19074t.m100208f(c19666x0, "this$0");
        c19666x0.m103106v();
    }

    /* renamed from: s */
    private final void m103104s(String str, C17945a0 c17945a0) {
        C3533a c3533a = (C3533a) this.f97548c.get(str);
        if (c3533a != null && c3533a.m17919n() == 3) {
            try {
                C3533a m2606G = AbstractC23306f.m120584H0().m2606G(str);
                if (m2606G != null && c3533a.m17912g() < m2606G.m17912g()) {
                    try {
                        m2606G.m17929x(3);
                        c3533a = m2606G;
                    } catch (Exception e11) {
                        e = e11;
                        c3533a = m2606G;
                        AbstractC23350e.m122778h(e);
                        C0824j.m2153b(new g(c3533a));
                    }
                }
                if (c17945a0.m95029V3().m41053q() && !c17945a0.m95180k8() && c3533a.m17912g() < c17945a0.m95029V3().m41047k()) {
                    m2606G = new C3533a(c17945a0);
                    m2606G.m17929x(3);
                    c3533a = m2606G;
                }
                this.f97548c.put(str, c3533a);
            } catch (Exception e12) {
                e = e12;
            }
            C0824j.m2153b(new g(c3533a));
        }
    }

    /* renamed from: t */
    private final void m103105t(ArrayList arrayList, boolean z11) {
        C24559a.m127933c("SendSeenManager", "sendSeenToServer(). From group: " + z11 + ", ACK list contains " + arrayList.size() + " msg, MsgList: " + arrayList);
        this.f97546a.m2619W(arrayList, z11, new h(arrayList, this));
    }

    /* renamed from: v */
    private final void m103106v() {
        if (m103100l()) {
            return;
        }
        if (!C29628e.m147249E0().m93432x()) {
            if (!C29628e.m147249E0().m93433y()) {
                AbstractC29633j.m147365n();
                m103107w(2000L);
            }
            m103107w(3000L);
            m103102q();
            return;
        }
        m103097i();
    }

    /* renamed from: w */
    private final void m103107w(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SendSeenManager", e11);
        }
    }

    /* renamed from: d */
    public final void m103108d(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            if (!TextUtils.isEmpty(mo95039W2) && !AbstractC25495a.m132079d(mo95039W2)) {
                C3533a c3533a = (C3533a) this.f97548c.get(mo95039W2);
                if (c3533a != null && c3533a.m17919n() == 3) {
                    return;
                }
                C3533a c3533a2 = new C3533a(c17945a0);
                c3533a2.m17929x(3);
                this.f97548c.put(mo95039W2, c3533a2);
                C0824j.m2153b(new d(c3533a2));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public final void m103109e(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "message");
        if (this.f97548c.containsKey(str)) {
            m103104s(str, c17945a0);
            return;
        }
        Object obj = this.f97549d.get(str);
        Boolean bool = Boolean.TRUE;
        if (AbstractC19074t.m100204b(obj, bool)) {
            return;
        }
        this.f97549d.put(str, bool);
        AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: gw.v0

            /* renamed from: p */
            public final /* synthetic */ String f97540p;

            /* renamed from: q */
            public final /* synthetic */ C19666x0 f97541q;

            /* renamed from: r */
            public final /* synthetic */ C17945a0 f97542r;

            public /* synthetic */ RunnableC19662v0(String str2, C19666x0 this, C17945a0 c17945a02) {
                r1 = str2;
                r2 = this;
                r3 = c17945a02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19666x0.m103096f(r1, r2, r3);
            }
        }, 2, null);
    }

    /* renamed from: g */
    public final void m103110g(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C3533a m2606G = this.f97546a.m2606G(str);
        if (m2606G != null && m2606G.m17919n() == 3) {
            if (!m2606G.m17906a()) {
                this.f97548c.put(str, m2606G);
            }
            C0824j.m2153b(new e(m2606G));
        }
    }

    /* renamed from: h */
    public final void m103111h(String str, long j11) {
        boolean m127149O;
        C19059j0 c19059j0;
        AbstractC19074t.m100208f(str, "uid");
        if (!AbstractC25495a.m132079d(str)) {
            m127149O = AbstractC24342w.m127149O(str, "-", false, 2, null);
            if (!m127149O) {
                C19059j0 c19059j02 = new C19059j0();
                Object obj = this.f97548c.get(str);
                c19059j02.f94941p = obj;
                if (obj != null) {
                    ((C3533a) obj).m17929x(2);
                    c19059j0 = c19059j02;
                } else {
                    C3533a c3533a = new C3533a(0L, j11, 0L, str, 0L, 0, 0, 0);
                    c19059j02.f94941p = c3533a;
                    c3533a.m17929x(2);
                    c19059j0 = c19059j02;
                    this.f97548c.put(str, c19059j02.f94941p);
                }
                C0824j.m2153b(new f(c19059j0));
            }
        }
    }

    /* renamed from: n */
    public final synchronized void m103112n(C3533a c3533a) {
        AbstractC19074t.m100208f(c3533a, "request");
        this.f97547b.add(c3533a);
        m103102q();
    }

    /* renamed from: o */
    public final synchronized void m103113o(List list) {
        AbstractC19074t.m100208f(list, "request");
        this.f97547b.addAll(list);
        m103102q();
    }

    /* renamed from: p */
    public final void m103114p() {
        List<C3533a> m41722L0 = C7959d.Companion.m41850e().m41722L0();
        for (C3533a c3533a : m41722L0) {
            if (!c3533a.m17906a()) {
                C3533a c3533a2 = (C3533a) this.f97548c.get(c3533a.m17915j());
                if (c3533a2 == null) {
                    this.f97548c.put(c3533a.m17915j(), c3533a);
                } else if (c3533a.m17912g() > c3533a2.m17912g()) {
                    this.f97548c.put(c3533a.m17915j(), c3533a);
                }
            }
        }
        if (!m41722L0.isEmpty()) {
            m103113o(m41722L0);
        }
    }

    /* renamed from: u */
    public final void m103115u(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "ackSeenList");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C3533a c3533a = (C3533a) obj;
            if (!m103099k(c3533a)) {
                c3533a.m17929x(1);
                C7959d.a aVar = C7959d.Companion;
                aVar.m41850e().m41756V1(c3533a);
                C3533a m2606G = this.f97546a.m2606G(c3533a.m17915j());
                if (m2606G != null && m2606G.m17912g() == c3533a.m17912g()) {
                    this.f97546a.m2617U(c3533a.m17915j(), c3533a);
                    aVar.m41850e().m41826s3(c3533a.m17915j(), c3533a);
                }
            }
        }
    }
}
