package ga0;

import com.zing.zalo.AbstractC8020f0;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p578vk.AbstractC28275a;
import p578vk.C28276b;
import p578vk.C28277c;
import p578vk.C28278d;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: ga0.f0 */
/* loaded from: classes6.dex */
public final class C19321f0 extends AbstractRunnableC19355q1 {

    /* renamed from: s */
    private final C18316b f95937s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19321f0(InterfaceC18319c interfaceC18319c, C18316b c18316b) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        this.f95937s = c18316b;
    }

    /* renamed from: l */
    private final void m101109l(C28278d c28278d, C28277c c28277c) {
        m101115r(c28278d, c28277c);
        m101111n(c28278d);
    }

    /* renamed from: m */
    private final void m101110m(C28276b c28276b) {
        m101440g(new C18316b("Search.PreState.SubmitList", c28276b, null, null, 12, null));
    }

    /* renamed from: n */
    private final void m101111n(C28278d c28278d) {
        C28276b m101113p;
        if (c28278d.m142518f() != null) {
            m101113p = m101114q(c28278d);
        } else if (c28278d.m142521i()) {
            m101113p = m101112o(c28278d);
        } else {
            m101113p = m101113p(c28278d);
        }
        m101110m(m101113p);
    }

    /* renamed from: o */
    private final C28276b m101112o(C28278d c28278d) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        C19322f1 c19322f1 = C19322f1.f95950a;
        if (c19322f1.m101168y()) {
            arrayList.add(new AbstractC28275a.x(c19322f1.m101133H(), AbstractC28275a.y.c.f131940b));
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_search_history);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList2.add(new AbstractC28275a.k(m118743r0, AbstractC28275a.f.e.f131907a, m118742r, m118742r));
        arrayList2.add(new AbstractC28275a.x(C19322f1.m101117F(), AbstractC28275a.y.a.f131938b));
        synchronized (c28278d.m142513a()) {
            try {
                if (C19322f1.m101117F() && (!c28278d.m142513a().isEmpty())) {
                    for (AbstractC28275a abstractC28275a : c28278d.m142513a()) {
                        m101116s(abstractC28275a, AbstractC28275a.j.b.f131919a);
                        arrayList2.add(abstractC28275a);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(new AbstractC28275a.s(AbstractC28275a.y.b.f131939b.m142506a()));
        }
        C19322f1 c19322f12 = C19322f1.f95950a;
        arrayList2.add(new AbstractC28275a.x(c19322f12.m101132G(), AbstractC28275a.y.b.f131939b));
        synchronized (c28278d.m142514b()) {
            try {
                if (c19322f12.m101132G() && (!c28278d.m142514b().isEmpty())) {
                    for (AbstractC28275a abstractC28275a2 : c28278d.m142514b()) {
                        m101116s(abstractC28275a2, AbstractC28275a.j.b.f131919a);
                        arrayList2.add(abstractC28275a2);
                    }
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (c28278d.m142516d()) {
        }
        if ((!arrayList.isEmpty()) && (!arrayList2.isEmpty())) {
            arrayList.add(new AbstractC28275a.r(AbstractC8020f0.str_label_search_history));
        }
        arrayList.addAll(arrayList2);
        return new C28276b(arrayList);
    }

    /* renamed from: p */
    private final C28276b m101113p(C28278d c28278d) {
        List m131187O0;
        int i11;
        boolean z11;
        Object obj;
        Object obj2;
        int m131511r;
        ArrayList arrayList = new ArrayList();
        int m118742r = AbstractC23136l9.m118742r(4.0f);
        int m118742r2 = AbstractC23136l9.m118742r(8.0f);
        int m118742r3 = AbstractC23136l9.m118742r(12.0f);
        m131187O0 = AbstractC25332a0.m131187O0(c28278d.m142519g());
        List list = m131187O0;
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        synchronized (c28278d.m142513a()) {
            try {
                if (C19322f1.m101117F() && (!c28278d.m142513a().isEmpty())) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(new AbstractC28275a.t(AbstractC8020f0.str_search_global_pre_state_searched_contacts));
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_pre_state_searched_contacts);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    arrayList.add(new AbstractC28275a.k(m118743r0, AbstractC28275a.f.e.f131907a, m118742r3, m118742r));
                    List<AbstractC28275a> m142513a = c28278d.m142513a();
                    m131511r = AbstractC25370t.m131511r(m142513a, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    for (AbstractC28275a abstractC28275a : m142513a) {
                        m101116s(abstractC28275a, AbstractC28275a.j.a.f131918a);
                        arrayList2.add(abstractC28275a);
                    }
                    i11 = m118742r2;
                    z11 = false;
                    arrayList.add(new AbstractC28275a.i(arrayList2, AbstractC28275a.l.a.f131925a, m118742r2, 0, m118742r2, m118742r2, false, 64, null));
                    c28278d.m142515c()[0] = true;
                } else {
                    i11 = m118742r2;
                    z11 = false;
                    c28278d.m142515c()[0] = false;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (c28278d.m142516d()) {
            try {
                if (C19322f1.f95950a.m101163t()) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(new AbstractC28275a.p(AbstractC8020f0.str_search_global_pre_state_quick_access));
                    }
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_pre_state_quick_access);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    arrayList.add(new AbstractC28275a.k(m118743r02, AbstractC28275a.f.e.f131907a, m118742r3, m118742r3));
                    ArrayList arrayList3 = new ArrayList();
                    for (AbstractC28275a abstractC28275a2 : c28278d.m142516d()) {
                        m101116s(abstractC28275a2, AbstractC28275a.j.a.f131918a);
                        arrayList3.add(abstractC28275a2);
                    }
                    if (arrayList3.size() < 4) {
                        obj2 = AbstractC28275a.v.f131933c;
                    } else {
                        obj2 = AbstractC28275a.w.f131934c;
                    }
                    arrayList3.add(obj2);
                    AbstractC28275a.l.b bVar = AbstractC28275a.l.b.f131926a;
                    boolean m142522j = c28278d.m142522j();
                    c28278d.m142524l(z11);
                    C24848g0 c24848g02 = C24848g0.f119245a;
                    arrayList.add(new AbstractC28275a.i(arrayList3, bVar, i11, 0, i11, i11, m142522j));
                    c28278d.m142515c()[2] = true;
                } else {
                    c28278d.m142515c()[2] = z11;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (c28278d.m142514b()) {
            try {
                if (C19322f1.f95950a.m101132G() && (!c28278d.m142514b().isEmpty())) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(new AbstractC28275a.p(AbstractC8020f0.str_search_global_pre_state_searched_queries));
                    }
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_pre_state_searched_queries);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    arrayList.add(new AbstractC28275a.k(m118743r03, AbstractC28275a.f.e.f131907a, m118742r3, m118742r3));
                    for (AbstractC28275a abstractC28275a3 : c28278d.m142514b()) {
                        m101116s(abstractC28275a3, AbstractC28275a.j.c.f131920a);
                        arrayList.add(abstractC28275a3);
                    }
                    c28278d.m142515c()[1] = true;
                } else {
                    c28278d.m142515c()[1] = z11;
                }
                C24848g0 c24848g03 = C24848g0.f119245a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (arrayList.isEmpty()) {
            if (!C19322f1.m101117F() && !C19322f1.f95950a.m101132G()) {
                obj = AbstractC28275a.e.c.f131902c;
            } else {
                obj = AbstractC28275a.e.b.f131901c;
            }
            arrayList.add(obj);
        }
        arrayList.add(new AbstractC28275a.p(AbstractC8020f0.str_search_global_pre_state_edit_search_history));
        arrayList.add(AbstractC28275a.m.f131927a);
        return new C28276b(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:            r2 = qm0.AbstractC25366r.m131496e(r2);     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C28276b m101114q(C28278d c28278d) {
        List m131502j;
        AbstractC28275a.a0 m142518f = c28278d.m142518f();
        if (m142518f == null || m131502j == null) {
            m131502j = AbstractC25368s.m131502j();
        }
        return new C28276b(m131502j);
    }

    /* renamed from: r */
    private final void m101115r(C28278d c28278d, C28277c c28277c) {
        Object obj;
        List m101180F;
        C18316b c18316b;
        List m142519g = c28278d.m142519g();
        synchronized (m142519g) {
            try {
                m142519g.clear();
                InterfaceC18319c m101438e = m101438e();
                C19325g1 c19325g1 = null;
                if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
                    obj = c18316b.m97245a();
                } else {
                    obj = null;
                }
                if (obj instanceof C19325g1) {
                    c19325g1 = (C19325g1) obj;
                }
                if (c19325g1 != null && (m101180F = c19325g1.m101180F()) != null) {
                    m142519g.addAll(m101180F);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        List m142513a = c28278d.m142513a();
        synchronized (m142513a) {
            m142513a.clear();
            m142513a.addAll(c28277c.m142509a());
        }
        List m142514b = c28278d.m142514b();
        synchronized (m142514b) {
            m142514b.clear();
            m142514b.addAll(c28277c.m142510b());
        }
        List<AbstractC28275a> m142516d = c28278d.m142516d();
        synchronized (m142516d) {
            try {
                m142516d.clear();
                m142516d.addAll(c28277c.m142511c());
                c28278d.m142517e().clear();
                for (AbstractC28275a abstractC28275a : m142516d) {
                    if (abstractC28275a instanceof AbstractC28275a.b) {
                        List m142517e = c28278d.m142517e();
                        String mo2478b = ((AbstractC28275a.b) abstractC28275a).m142475c().mo2478b();
                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                        m142517e.add(mo2478b);
                    }
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        c28278d.m142525m(c28277c.m142512d());
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C18316b c18316b;
        if (isCancelled()) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
        C19325g1 c19325g1 = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        }
        if (c19325g1 == null) {
            return;
        }
        C28278d m101243v = c19325g1.m101243v();
        String m97246b = this.f95937s.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "Search.Task.HandlePreStateSetData")) {
            if (this.f95937s.m97245a() instanceof C28277c) {
                m101109l(m101243v, (C28277c) this.f95937s.m97245a());
            }
        } else if (AbstractC19074t.m100204b(m97246b, "Search.Task.HandlePreStateRefreshData")) {
            m101111n(m101243v);
        }
    }

    /* renamed from: s */
    public final void m101116s(AbstractC28275a abstractC28275a, AbstractC28275a.j jVar) {
        AbstractC19074t.m100208f(abstractC28275a, "<this>");
        if (abstractC28275a instanceof AbstractC28275a.b) {
            AbstractC28275a.b bVar = (AbstractC28275a.b) abstractC28275a;
            if (jVar == null) {
                jVar = AbstractC28275a.j.a.f131918a;
            }
            bVar.m142472g(jVar);
            return;
        }
        if (abstractC28275a instanceof AbstractC28275a.h) {
            AbstractC28275a.h hVar = (AbstractC28275a.h) abstractC28275a;
            if (jVar == null) {
                jVar = AbstractC28275a.j.a.f131918a;
            }
            hVar.m142486d(jVar);
        }
    }
}
