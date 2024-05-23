package ga0;

import ai.C0862b;
import ai.InterfaceC0861a;
import am.C0943w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me0.AbstractC23136l9;
import me0.C23024b7;
import me0.C23139m1;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;
import p578vk.AbstractC28275a;
import p612wk.AbstractC29076h;
import p716zh.C31853b5;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;
import tk.C26724c;
import uk.C27285a;
import uk.C27286b;

/* renamed from: ga0.h0 */
/* loaded from: classes6.dex */
public final class C19327h0 extends AbstractRunnableC19355q1 {

    /* renamed from: s */
    private final String f96038s;

    /* renamed from: t */
    private final C18316b f96039t;

    /* renamed from: u */
    private final InterfaceC24854k f96040u;

    /* renamed from: ga0.h0$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f96041q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118742r(12.0f));
        }
    }

    /* renamed from: ga0.h0$b */
    /* loaded from: classes6.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(((AbstractC28275a.d) obj).m142476d().toString(), ((AbstractC28275a.d) obj2).m142476d().toString());
            return m135478b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19327h0(InterfaceC18319c interfaceC18319c, String str, C18316b c18316b) {
        super(interfaceC18319c);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        this.f96038s = str;
        this.f96039t = c18316b;
        m129210a = AbstractC24856m.m129210a(a.f96041q);
        this.f96040u = m129210a;
    }

    /* renamed from: m */
    private final void m101258m(C27286b c27286b, List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0861a interfaceC0861a = (InterfaceC0861a) it.next();
            list2.add(m101267w(interfaceC0861a, AbstractC28275a.j.c.f131920a, c27286b.m139688f().contains(interfaceC0861a.mo2478b())));
        }
    }

    /* renamed from: n */
    private final void m101259n(C27286b c27286b) {
        List<String> m131185M0;
        List m131185M02;
        Object obj;
        if (c27286b.m139690h()) {
            return;
        }
        m101264s(c27286b);
        List m139687e = c27286b.m139687e();
        synchronized (m139687e) {
            try {
                ArrayList<AbstractC28275a.d> arrayList = new ArrayList();
                m131185M0 = AbstractC25332a0.m131185M0(c27286b.m139684b());
                for (String str : m131185M0) {
                    InterfaceC0861a m118070s = C23024b7.f111993a.m118070s(str, false);
                    if (m118070s == null) {
                        Iterator it = c27286b.m139683a().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (AbstractC19074t.m100204b(((InterfaceC0861a) next).mo2478b(), str)) {
                                    obj = next;
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        m118070s = (InterfaceC0861a) obj;
                    }
                    if (m118070s != null) {
                        arrayList.add(m101267w(m118070s, AbstractC28275a.j.a.f131918a, true));
                    }
                }
                m139687e.clear();
                m139687e.addAll(arrayList);
                c27286b.m139688f().clear();
                for (AbstractC28275a.d dVar : arrayList) {
                    Set m139688f = c27286b.m139688f();
                    String mo2478b = dVar.m142475c().mo2478b();
                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                    m139688f.add(mo2478b);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c27286b.m139695m(true);
        m131185M02 = AbstractC25332a0.m131185M0(c27286b.m139687e());
        m101265t(new C27285a(m131185M02, true, true));
    }

    /* renamed from: o */
    private final void m101260o(C27286b c27286b, List list, List list2, AbstractC29076h abstractC29076h) {
        if (list2.isEmpty()) {
            return;
        }
        if (!list.isEmpty()) {
            list.add(new AbstractC28275a.r(abstractC29076h.m145259a()));
        }
        String m118743r0 = AbstractC23136l9.m118743r0(abstractC29076h.m145259a());
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        list.add(new AbstractC28275a.k(m118743r0, AbstractC28275a.f.e.f131907a, m101261p(), m101261p()));
        if (list2.size() > 3 && !AbstractC19074t.m100204b(c27286b.m139693k().get(abstractC29076h), Boolean.TRUE)) {
            list.add(list2.get(0));
            list.add(list2.get(1));
            list.add(list2.get(2));
            if (list2.size() > 3) {
                list.add(new AbstractC28275a.o(abstractC29076h));
                return;
            }
            return;
        }
        list.addAll(list2);
    }

    /* renamed from: p */
    private final int m101261p() {
        return ((Number) this.f96040u.getValue()).intValue();
    }

    /* renamed from: q */
    private final void m101262q(C27286b c27286b) {
        List m131185M0;
        m101264s(c27286b);
        m131185M0 = AbstractC25332a0.m131185M0(c27286b.m139683a());
        Iterator it = m131185M0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0861a) it.next()).mo2482h().clear();
        }
        ArrayList<AbstractC28275a.d> arrayList = new ArrayList();
        m101258m(c27286b, m131185M0, arrayList);
        if (arrayList.size() > 1) {
            AbstractC25376w.m131534w(arrayList, new b());
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (AbstractC28275a.d dVar : arrayList) {
            C26724c c26724c = C26724c.f126750a;
            if (c26724c.m137453a(dVar.m142477e(), 2)) {
                arrayList2.add(dVar);
            } else if (c26724c.m137453a(dVar.m142477e(), 4)) {
                arrayList3.add(dVar);
            } else if (c26724c.m137453a(dVar.m142477e(), 16)) {
                arrayList4.add(dVar);
            } else if (c26724c.m137453a(dVar.m142477e(), 8)) {
                arrayList5.add(dVar);
            } else if (c26724c.m137453a(dVar.m142477e(), 4194304)) {
                arrayList5.add(dVar);
            }
        }
        m101268x(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        m101260o(c27286b, arrayList6, arrayList5, AbstractC29076h.z.f134839b);
        m101260o(c27286b, arrayList6, arrayList4, AbstractC29076h.k.f134825b);
        m101260o(c27286b, arrayList6, arrayList3, AbstractC29076h.i.f134823b);
        m101260o(c27286b, arrayList6, arrayList2, AbstractC29076h.h.f134822b);
        m101265t(new C27285a(arrayList6, false, !c27286b.m139692j()));
    }

    /* renamed from: r */
    private final void m101263r(C27286b c27286b) {
        List m131185M0;
        m101264s(c27286b);
        ArrayList arrayList = new ArrayList();
        m131185M0 = AbstractC25332a0.m131185M0(c27286b.m139683a());
        C23024b7.m118049j(m131185M0, arrayList, this.f96038s, c27286b.m139686d().m101459b(this.f96038s), 0);
        List arrayList2 = new ArrayList();
        m101258m(c27286b, arrayList, arrayList2);
        if (arrayList2.isEmpty()) {
            arrayList2 = AbstractC25368s.m131506n(AbstractC28275a.e.a.f131900c);
        }
        m101265t(new C27285a(arrayList2, false, false));
    }

    /* renamed from: s */
    private final void m101264s(C27286b c27286b) {
        boolean z11;
        int m131511r;
        List m131187O0;
        if (c27286b.m139691i()) {
            String m122303q0 = AbstractC23309i.m122303q0();
            if (m122303q0 != null && m122303q0.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z12 = !z11;
            List m139683a = c27286b.m139683a();
            synchronized (m139683a) {
                try {
                    m139683a.clear();
                    C18635e m98553p = C18644n.m98531l().m98553p();
                    AbstractC19074t.m100207e(m98553p, "getZaloList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : m98553p) {
                        if (!C23139m1.f112256a.m118802t(z12, ((ContactProfile) obj).f42434r)) {
                            arrayList.add(obj);
                        }
                    }
                    m139683a.addAll(arrayList);
                    ArrayList m4474h = C0943w.f3447a.m4474h();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : m4474h) {
                        if (!C23139m1.f112256a.m118802t(z12, AbstractC25495a.m132076a(((C31973j5) obj2).m153781r()))) {
                            arrayList2.add(obj2);
                        }
                    }
                    m131511r = AbstractC25370t.m131511r(arrayList2, 10);
                    ArrayList arrayList3 = new ArrayList(m131511r);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(C23139m1.f112256a.m118803u((C31973j5) it.next()));
                    }
                    m139683a.addAll(arrayList3);
                    C31853b5 m114357s = C21927m.m114302u().m114357s();
                    AbstractC19074t.m100207e(m114357s, "getFollowList(...)");
                    m131187O0 = AbstractC25332a0.m131187O0(m114357s);
                    ArrayList<ContactProfile> arrayList4 = new ArrayList();
                    for (Object obj3 : m131187O0) {
                        if (!AbstractC19074t.m100204b(((ContactProfile) obj3).f42434r, "322967126")) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (ContactProfile contactProfile : arrayList4) {
                        C23024b7 c23024b7 = C23024b7.f111993a;
                        String str = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str, "uid");
                        InterfaceC0861a m118070s = c23024b7.m118070s(str, false);
                        if (m118070s != null) {
                            arrayList5.add(m118070s);
                        }
                    }
                    m139683a.addAll(arrayList5);
                    ContactProfile contactProfile2 = new ContactProfile("-2");
                    contactProfile2.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg);
                    contactProfile2.f42446v = "https://res-zalo.zadn.vn/upload/media/2018/4/19/ava_stranger_1524105999293.png";
                    m139683a.add(contactProfile2);
                    ContactProfile contactProfile3 = new ContactProfile("-8");
                    contactProfile3.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title);
                    m139683a.add(contactProfile3);
                    ContactProfile m118050n = C23024b7.m118050n(C23024b7.f111993a, "204278670", false, 2, null);
                    if (m118050n == null) {
                        m118050n = new ContactProfile("204278670");
                        m118050n.f42437s = AbstractC21935u.m114547n();
                        m118050n.f42446v = AbstractC23304d.f113377e;
                    }
                    m139683a.add(m118050n);
                    C19322f1 c19322f1 = C19322f1.f95950a;
                    C0862b m101148e = c19322f1.m101148e();
                    if (m101148e != null) {
                        m139683a.add(m101148e);
                    }
                    if (c19322f1.m101165v()) {
                        m139683a.add(C23139m1.f112256a.m118797j());
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c27286b.m139697o(false);
        }
    }

    /* renamed from: t */
    private final void m101265t(final C27285a c27285a) {
        AbstractC19444a.m101695c(new Runnable() { // from class: ga0.g0
            @Override // java.lang.Runnable
            public final void run() {
                C19327h0.m101266u(C19327h0.this, c27285a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m101266u(C19327h0 c19327h0, C27285a c27285a) {
        AbstractC19074t.m100208f(c19327h0, "this$0");
        AbstractC19074t.m100208f(c27285a, "$dataItemList");
        InterfaceC18319c m101438e = c19327h0.m101438e();
        if (m101438e != null) {
        }
    }

    /* renamed from: w */
    private final AbstractC28275a.d m101267w(InterfaceC0861a interfaceC0861a, AbstractC28275a.j jVar, boolean z11) {
        int i11;
        if (interfaceC0861a instanceof C0862b) {
            i11 = 4194304;
        } else if (interfaceC0861a instanceof ContactProfile) {
            i11 = C19372y0.Companion.m101487c((ContactProfile) interfaceC0861a, 0);
        } else {
            i11 = 0;
        }
        C23139m1 c23139m1 = C23139m1.f112256a;
        CharSequence m118800q = c23139m1.m118800q(interfaceC0861a);
        if (!interfaceC0861a.mo2482h().isEmpty()) {
            C23024b7 c23024b7 = C23024b7.f111993a;
            m118800q = c23024b7.m118057S(m118800q, interfaceC0861a.mo2482h(), c23024b7.m118064k());
        }
        return new AbstractC28275a.d(interfaceC0861a, m118800q, c23139m1.m118799p(interfaceC0861a), jVar, i11, z11, null, 64, null);
    }

    /* renamed from: x */
    private final void m101268x(List list) {
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (AbstractC25495a.m132087l(((AbstractC28275a.d) list.get(i11)).m142475c().mo2478b())) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 > 1 && list.size() > 2) {
            list.add(1, (AbstractC28275a.d) list.remove(i11));
        }
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C27286b c27286b;
        boolean z11;
        C18316b c18316b;
        InterfaceC18319c m101438e = m101438e();
        String str = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetPickerState", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C27286b) {
            c27286b = (C27286b) obj;
        } else {
            c27286b = null;
        }
        if (c27286b == null) {
            return;
        }
        C18316b c18316b2 = this.f96039t;
        if (c18316b2 != null) {
            str = c18316b2.m97246b();
        }
        if (str == null || AbstractC19074t.m100204b(str, "Search.Task.ReloadPreState")) {
            m101259n(c27286b);
            if (this.f96038s.length() == 0) {
                m101262q(c27286b);
            } else {
                m101263r(c27286b);
            }
            if (this.f96038s.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c27286b.m139698p(z11);
        }
    }

    public /* synthetic */ C19327h0(InterfaceC18319c interfaceC18319c, String str, C18316b c18316b, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, str, (i11 & 4) != 0 ? null : c18316b);
    }
}
