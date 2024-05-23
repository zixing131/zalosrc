package ga0;

import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29073e;
import p612wk.AbstractC29080l;
import p612wk.C29070b;
import p612wk.C29071c;
import p612wk.C29077i;

/* renamed from: ga0.e0 */
/* loaded from: classes6.dex */
public final class C19318e0 extends AbstractC19358r1 {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private final C18316b f95927t;

    /* renamed from: u */
    private final HashMap f95928u;

    /* renamed from: ga0.e0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        private final C29071c m101091c(AbstractC29073e abstractC29073e) {
            if (abstractC29073e instanceof AbstractC29073e.f) {
                return ((AbstractC29073e.f) abstractC29073e).mo145252c();
            }
            return null;
        }

        /* renamed from: d */
        private final boolean m101092d(AbstractC29073e abstractC29073e) {
            C29071c m101091c = m101091c(abstractC29073e);
            if (m101091c != null) {
                return m101091c.m145237a();
            }
            return true;
        }

        /* renamed from: i */
        private final boolean m101093i(AbstractC29073e abstractC29073e) {
            if (AbstractC19074t.m100204b(abstractC29073e.m145245h(), AbstractC29072d.d.f134806a) && abstractC29073e.m145242e().size() > 0 && !m101092d(abstractC29073e)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C29071c m101094a(C29071c c29071c) {
            AbstractC19074t.m100208f(c29071c, "<this>");
            return new C29071c(c29071c.m145238b(), c29071c.m145237a());
        }

        /* renamed from: b */
        public final void m101095b(C29071c c29071c, C29071c c29071c2) {
            AbstractC19074t.m100208f(c29071c, "<this>");
            AbstractC19074t.m100208f(c29071c2, "paginationData");
            c29071c.m145240d(c29071c2.m145238b());
            c29071c.m145239c(c29071c2.m145237a());
        }

        /* renamed from: e */
        public final boolean m101096e(C29077i c29077i, AbstractC29080l abstractC29080l) {
            AbstractC19074t.m100208f(c29077i, "<this>");
            AbstractC19074t.m100208f(abstractC29080l, "tabType");
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.c.f134883b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.d.f134884b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.a.f134882b)) {
                return true;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.g.f134887b)) {
                return m101092d(c29077i.m145291s());
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.e.f134885b)) {
                return m101092d(c29077i.m145279g());
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.f.f134886b)) {
                return m101092d(c29077i.m145287o());
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.h.f134888b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.i.f134889b)) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: f */
        public final boolean m101097f(AbstractC29080l abstractC29080l) {
            AbstractC19074t.m100208f(abstractC29080l, "<this>");
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.c.f134883b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.d.f134884b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.a.f134882b)) {
                return false;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.g.f134887b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.e.f134885b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.f.f134886b)) {
                return true;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.h.f134888b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.i.f134889b)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: g */
        public final C29071c m101098g(C29071c c29071c, List list, int i11, int i12) {
            boolean z11;
            AbstractC19074t.m100208f(c29071c, "inputPaginationData");
            AbstractC19074t.m100208f(list, "list");
            int m145238b = c29071c.m145238b() + Math.min(i11, list.size());
            if (list.size() != i12 + i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            C29071c c29071c2 = new C29071c(m145238b, z11);
            if (!c29071c2.m145237a()) {
                list.subList(i11, list.size()).clear();
            }
            return c29071c2;
        }

        /* renamed from: h */
        public final boolean m101099h(C29077i c29077i, AbstractC29080l abstractC29080l) {
            AbstractC19074t.m100208f(c29077i, "<this>");
            AbstractC19074t.m100208f(abstractC29080l, "tabType");
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.c.f134883b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.d.f134884b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.a.f134882b)) {
                return false;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.g.f134887b)) {
                if (!m101093i(c29077i.m145291s())) {
                    return false;
                }
                return true;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.e.f134885b)) {
                return m101093i(c29077i.m145279g());
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.f.f134886b)) {
                return m101093i(c29077i.m145287o());
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.h.f134888b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.i.f134889b)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19318e0(InterfaceC18319c interfaceC18319c, C18316b c18316b, String str, HashMap hashMap) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "uidExistThreadChatMap");
        this.f95927t = c18316b;
        this.f95928u = hashMap;
    }

    /* renamed from: m */
    private final void m101089m(C19325g1 c19325g1, AbstractC29080l abstractC29080l) {
        C29071c c29071c;
        if (!AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.c.f134883b) && !AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.d.f134884b) && !AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.a.f134882b)) {
            C29071c c29071c2 = null;
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.g.f134887b)) {
                synchronized (c19325g1.m101247x().m145291s()) {
                    if (Companion.m101099h(c19325g1.m101247x(), abstractC29080l)) {
                        c19325g1.m101247x().m145291s().m145247j(AbstractC29072d.c.f134805a);
                        c29071c2 = c19325g1.m101247x().m145291s().mo145252c();
                    }
                    c29071c = c29071c2;
                }
                if (c29071c != null) {
                    if (C19322f1.f95950a.m101158o()) {
                        new C19366v0(this, m101455l(), this.f95928u, c19325g1.m101247x().m145291s().mo145251y0(), c29071c).m101441i();
                        return;
                    } else {
                        new C19331i1(this, m101455l(), this.f95928u, c29071c).m101441i();
                        return;
                    }
                }
                return;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.e.f134885b)) {
                synchronized (c19325g1.m101247x().m145279g()) {
                    if (Companion.m101099h(c19325g1.m101247x(), abstractC29080l)) {
                        c19325g1.m101247x().m145279g().m145247j(AbstractC29072d.c.f134805a);
                        c29071c2 = c19325g1.m101247x().m145279g().mo145252c();
                    }
                }
                if (c29071c2 != null) {
                    new C19313c1(this, m101455l(), this.f95928u, c29071c2).m101441i();
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.f.f134886b)) {
                synchronized (c19325g1.m101247x().m145287o()) {
                    a aVar = Companion;
                    if (aVar.m101099h(c19325g1.m101247x(), abstractC29080l)) {
                        c19325g1.m101247x().m145287o().m145247j(AbstractC29072d.c.f134805a);
                        c29071c2 = aVar.m101094a(c19325g1.m101247x().m145287o().mo145252c());
                    }
                }
                if (c29071c2 != null) {
                    new C19328h1(this, m101455l(), this.f95928u, c29071c2).m101441i();
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.h.f134888b) || AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.i.f134889b)) {
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: n */
    private final void m101090n(C19325g1 c19325g1, AbstractC29080l abstractC29080l, AbstractC29069a.f fVar) {
        C19319e1 c19319e1;
        if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.g.f134887b) && C19322f1.f95950a.m101158o()) {
            c19325g1.m101247x().m145291s().m145247j(AbstractC29072d.c.f134805a);
            String m101455l = m101455l();
            HashMap hashMap = this.f95928u;
            if (fVar == null) {
                fVar = c19325g1.m101247x().m145291s().mo145251y0().m145177c();
            }
            C19366v0 c19366v0 = new C19366v0(this, m101455l, hashMap, fVar, null, 16, null);
            InterfaceC18319c m101438e = m101438e();
            if (m101438e instanceof C19319e1) {
                c19319e1 = (C19319e1) m101438e;
            } else {
                c19319e1 = null;
            }
            if (c19319e1 != null) {
                C19366v0 m101105n = c19319e1.m101105n();
                if (m101105n != null) {
                    m101105n.m101436c();
                }
                c19319e1.m101107t(c19366v0);
            }
            c19366v0.m101441i();
        }
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        C18316b c18316b;
        if (isCancelled()) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
        AbstractC29069a.f fVar = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        } else {
            c19325g1 = null;
        }
        if (c19325g1 == null) {
            return;
        }
        String m97246b = this.f95927t.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "ACTION_HANDLE_LOAD_MORE")) {
            if ((this.f95927t.m97245a() instanceof C29070b) && (this.f95927t.m97247c() instanceof AbstractC29080l)) {
                m101089m(c19325g1, (AbstractC29080l) this.f95927t.m97247c());
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(m97246b, "ACTION_HANDLE_TAB_RELOAD") && (this.f95927t.m97247c() instanceof AbstractC29080l)) {
            AbstractC29080l abstractC29080l = (AbstractC29080l) this.f95927t.m97247c();
            Object m97245a = this.f95927t.m97245a();
            if (m97245a instanceof AbstractC29069a.f) {
                fVar = (AbstractC29069a.f) m97245a;
            }
            m101090n(c19325g1, abstractC29080l, fVar);
        }
    }
}
