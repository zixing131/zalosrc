package ga0;

import ag0.InterfaceC0806b1;
import ai.C0862b;
import ai.InterfaceC0861a;
import am.AbstractC0924m0;
import am.C0943w;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zinstant.C17244x0;
import dg0.AbstractC17930e;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import ga0.C19348o0;
import ha0.C19955h;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ln0.AbstractC22543l;
import me0.C23024b7;
import me0.C23139m1;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p131ei.C18434b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p578vk.AbstractC28275a;
import p578vk.C28277c;
import p716zh.C31862c;
import p716zh.C31973j5;
import p716zh.C32093r8;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: ga0.o0 */
/* loaded from: classes6.dex */
public final class C19348o0 extends AbstractRunnableC19355q1 {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private static boolean f96100t = true;

    /* renamed from: s */
    private final C18316b f96101s;

    /* renamed from: ga0.o0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ga0.o0$b */
    /* loaded from: classes6.dex */
    public static final class b implements C18434b.e {

        /* renamed from: b */
        final /* synthetic */ C19325g1 f96103b;

        /* renamed from: c */
        final /* synthetic */ C19051f0 f96104c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18494a f96105d;

        b(C19325g1 c19325g1, C19051f0 c19051f0, InterfaceC18494a interfaceC18494a) {
            this.f96103b = c19325g1;
            this.f96104c = c19051f0;
            this.f96105d = interfaceC18494a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m101389c(int i11, C31862c c31862c, C19348o0 c19348o0, C19325g1 c19325g1, C19051f0 c19051f0, InterfaceC18494a interfaceC18494a) {
            List m131506n;
            List<C31862c> list;
            Object m129218b;
            AbstractC19074t.m100208f(c19348o0, "this$0");
            AbstractC19074t.m100208f(c19325g1, "$this_checkUpdateQuickAction");
            AbstractC19074t.m100208f(c19051f0, "$isCalled");
            AbstractC19074t.m100208f(interfaceC18494a, "$actionEnd");
            if (i11 == 30) {
                if (c31862c != null) {
                    try {
                        m131506n = AbstractC25368s.m131506n(c31862c);
                        if (m131506n == null) {
                        }
                        if (c19348o0.m101373C(m131506n) && (!m131506n.isEmpty() || !c19325g1.m101180F().isEmpty())) {
                            c19325g1.m101180F().clear();
                            list = (List) AbstractC23304d.f113288I2.get(30);
                            if (list != null) {
                                try {
                                    C24861r.a aVar = C24861r.f119264q;
                                    for (C31862c c31862c2 : list) {
                                        List m101180F = c19325g1.m101180F();
                                        AbstractC19074t.m100205c(c31862c2);
                                        m101180F.add(new AbstractC28275a.z(c31862c2));
                                    }
                                    m129218b = C24861r.m129218b(C24848g0.f119245a);
                                } catch (Throwable th2) {
                                    C24861r.a aVar2 = C24861r.f119264q;
                                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                                }
                                C24861r.m129217a(m129218b);
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                m131506n = new ArrayList();
                if (c19348o0.m101373C(m131506n)) {
                    c19325g1.m101180F().clear();
                    list = (List) AbstractC23304d.f113288I2.get(30);
                    if (list != null) {
                    }
                }
            }
            c19051f0.f94928p = true;
            interfaceC18494a.mo12V4();
        }

        @Override // p131ei.C18434b.e
        /* renamed from: a */
        public void mo64321a(final int i11, final C31862c c31862c) {
            InterfaceC0806b1 m101437d = C19348o0.this.m101437d();
            final C19348o0 c19348o0 = C19348o0.this;
            final C19325g1 c19325g1 = this.f96103b;
            final C19051f0 c19051f0 = this.f96104c;
            final InterfaceC18494a interfaceC18494a = this.f96105d;
            m101437d.mo2040a(new Runnable() { // from class: ga0.p0
                @Override // java.lang.Runnable
                public final void run() {
                    C19348o0.b.m101389c(i11, c31862c, c19348o0, c19325g1, c19051f0, interfaceC18494a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.o0$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ List f96107r;

        /* renamed from: s */
        final /* synthetic */ List f96108s;

        /* renamed from: t */
        final /* synthetic */ List f96109t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, List list2, List list3) {
            super(0);
            this.f96107r = list;
            this.f96108s = list2;
            this.f96109t = list3;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m101390a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m101390a() {
            C19348o0.this.m101381s(new C28277c(this.f96107r, this.f96108s, this.f96109t, null, 8, null));
        }
    }

    /* renamed from: ga0.o0$d */
    /* loaded from: classes6.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((ContactProfile) obj2).f42423m1), Long.valueOf(((ContactProfile) obj).f42423m1));
            return m135478b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19348o0(InterfaceC18319c interfaceC18319c, C18316b c18316b) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        this.f96101s = c18316b;
    }

    /* renamed from: A */
    private final void m101371A(C19325g1 c19325g1, AbstractC28275a.f fVar, boolean z11) {
        InterfaceC18319c m101438e;
        boolean z12 = true;
        if (AbstractC19074t.m100204b(fVar, AbstractC28275a.f.a.f131903a)) {
            f96100t = true;
            C7960e.m41971c6().m42237Q();
            C19955h.f98250a.m103733y(c19325g1.m101243v(), null, "1", "3");
        } else if (AbstractC19074t.m100204b(fVar, AbstractC28275a.f.b.f131904a)) {
            C23024b7.f111993a.m118060e();
            C19955h.f98250a.m103733y(c19325g1.m101243v(), null, "1", "4");
        } else if (AbstractC19074t.m100204b(fVar, AbstractC28275a.f.c.f131905a)) {
            C23024b7.f111993a.m118061f();
        } else if (AbstractC19074t.m100204b(fVar, AbstractC28275a.f.d.f131906a) || AbstractC19074t.m100204b(fVar, AbstractC28275a.f.e.f131907a)) {
            z12 = false;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z12) {
            m101382t(c19325g1);
        }
        if (z12 && z11 && (m101438e = m101438e()) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101372B(C19325g1 c19325g1, AbstractC28275a.y yVar, boolean z11, boolean z12) {
        InterfaceC18319c m101438e;
        boolean z13 = false;
        if (AbstractC19074t.m100204b(yVar, AbstractC28275a.y.a.f131938b)) {
            if (C19322f1.m101117F() != z11) {
                C19322f1.m101123Y(z11);
                AbstractC0924m0.m3436Sm(z11);
                z13 = true;
            }
            if (z13) {
                m101382t(c19325g1);
            }
            if (z13 && z12 && (m101438e = m101438e()) != null) {
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(yVar, AbstractC28275a.y.b.f131939b)) {
            C19322f1 c19322f1 = C19322f1.f95950a;
            if (c19322f1.m101132G() != z11) {
                c19322f1.m101145Z(z11);
                AbstractC0924m0.m3465Tm(z11);
                z13 = true;
            }
            if (z13) {
            }
            if (z13) {
                return;
            } else {
                return;
            }
        }
        if (AbstractC19074t.m100204b(yVar, AbstractC28275a.y.c.f131940b)) {
            C19322f1 c19322f12 = C19322f1.f95950a;
            if (c19322f12.m101133H() != z11) {
                c19322f12.m101146a0(z11);
                AbstractC0924m0.m4179rn(z11);
                z13 = true;
            }
            if (z13) {
            }
            if (z13) {
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final boolean m101373C(List list) {
        if (!m101377o(list)) {
            Map map = AbstractC23304d.f113288I2;
            AbstractC19074t.m100207e(map, "sDestTypeToQuickActionItems");
            map.put(30, Collections.synchronizedList(list));
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final boolean m101377o(List list) {
        try {
            List list2 = (List) AbstractC23304d.f113288I2.get(30);
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                C31862c c31862c = (C31862c) obj;
                if (list.get(i11) != c31862c || ((C31862c) list.get(i11)).m153154f() || ((C31862c) list.get(i11)).f146331x < c31862c.f146331x || ((C31862c) list.get(i11)).f146332y) {
                    return false;
                }
                i11 = i12;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: p */
    private final void m101378p(List list) {
        if (AbstractC0924m0.m3338Pb() && C19322f1.f95950a.m101164u()) {
            AbstractC0924m0.m3320Om(false);
            list.add("-1000001");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:            if (r5 != (-1)) goto L23;     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101379q(C19325g1 c19325g1, final InterfaceC18494a interfaceC18494a) {
        final C19051f0 c19051f0 = new C19051f0();
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: ga0.n0
            @Override // java.lang.Runnable
            public final void run() {
                C19348o0.m101380r(C19051f0.this, interfaceC18494a);
            }
        }, 350L);
        try {
            List<C31862c> list = (List) AbstractC23304d.f113288I2.get(30);
            if (!c19325g1.m101243v().m142521i()) {
                if (!c19325g1.m101191Q() && list != null && !list.isEmpty()) {
                    int i11 = 0;
                    for (C31862c c31862c : list) {
                        if (!c31862c.m153154f() && !c31862c.f146332y) {
                            i11++;
                        }
                    }
                }
                C18434b.Companion.m97695b().m97686o(30, null, new b(c19325g1, c19051f0, interfaceC18494a));
                return;
            }
            List m101180F = c19325g1.m101180F();
            synchronized (m101180F) {
                try {
                    m101180F.clear();
                    if (list != null) {
                        for (C31862c c31862c2 : list) {
                            AbstractC19074t.m100205c(c31862c2);
                            m101180F.add(new AbstractC28275a.z(c31862c2));
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            c19051f0.f94928p = true;
            interfaceC18494a.mo12V4();
        } catch (Exception e11) {
            e11.printStackTrace();
            c19051f0.f94928p = true;
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m101380r(C19051f0 c19051f0, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c19051f0, "$isCalled");
        AbstractC19074t.m100208f(interfaceC18494a, "$actionEnd");
        if (!c19051f0.f94928p) {
            c19051f0.f94928p = true;
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m101381s(C28277c c28277c) {
        new C19321f0(this, new C18316b("Search.Task.HandlePreStateSetData", c28277c, null, null, 12, null)).m101441i();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d5  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101382t(C19325g1 c19325g1) {
        List m131185M0;
        List m131185M02;
        Object m129218b;
        Object m129218b2;
        Throwable m129221e;
        Object obj;
        C17244x0 c17244x0;
        List m131502j;
        List m131502j2;
        List m131502j3;
        String m101128B;
        Object m129218b3;
        C17244x0 c17244x02;
        int m131511r;
        boolean z11;
        CharSequence m127168X0;
        if (C19322f1.f95950a.m101127A() == 1 && AbstractC19074t.m100204b(c19325g1.m101177D(), "10")) {
            C19310b1 c19310b1 = C19310b1.f95897a;
            c19310b1.m101079n();
            m131185M0 = AbstractC25332a0.m131185M0(c19310b1.m101076h());
            ArrayList<AbstractC28275a.g> arrayList = new ArrayList();
            m131185M02 = AbstractC25332a0.m131185M0(c19310b1.m101077i());
            Iterator it = m131185M02.iterator();
            while (it.hasNext()) {
                ContactProfile m118050n = C23024b7.m118050n(C23024b7.f111993a, (String) it.next(), false, 2, null);
                if (m118050n != null) {
                    String m40383Q = m118050n.m40383Q(true, false);
                    AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                    m127168X0 = AbstractC24342w.m127168X0(m40383Q);
                    String obj2 = m127168X0.toString();
                    String str = m118050n.f42446v;
                    AbstractC19074t.m100207e(str, "avt");
                    arrayList.add(new AbstractC28275a.g(m118050n, obj2, str, null, null, null, 56, null));
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                C24861r.a aVar = C24861r.f119264q;
                JSONObject jSONObject2 = new JSONObject();
                C19310b1 c19310b12 = C19310b1.f95897a;
                jSONObject2.put("save_keywords", c19310b12.m101074f());
                jSONObject2.put("save_oas", c19310b12.m101075g());
                jSONObject2.put("search_keywords", new JSONArray((Collection) m131185M0));
                m131511r = AbstractC25370t.m131511r(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                for (AbstractC28275a.g gVar : arrayList) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", gVar.m142475c().mo2478b());
                    jSONObject3.put("click_action", "action.globalsearch.prestate.click_oa");
                    jSONObject3.put("click_data", "{\"uid\": " + gVar.m142475c().mo2478b() + "}");
                    jSONObject3.put("title", gVar.m142476d());
                    jSONObject3.put("icon", gVar.m142474b());
                    ContactProfile m118066m = C23024b7.f111993a.m118066m(gVar);
                    if (m118066m == null || (!m118066m.m40359B0() && !m118066m.m40372J0() && !AbstractC25495a.m132086k(m118066m.f42434r))) {
                        z11 = false;
                        jSONObject3.put("verify", z11);
                        arrayList2.add(jSONObject3);
                    }
                    z11 = true;
                    jSONObject3.put("verify", z11);
                    arrayList2.add(jSONObject3);
                }
                jSONObject2.put("search_oas", new JSONArray((Collection) arrayList2));
                C24848g0 c24848g0 = C24848g0.f119245a;
                jSONObject.put("pre_state", jSONObject2);
                m129218b = C24861r.m129218b(jSONObject.toString());
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b)) {
                m129218b = null;
            }
            String str2 = (String) m129218b;
            try {
                m101128B = C19322f1.f95950a.m101128B();
                if (m101128B.length() <= 0) {
                    m101128B = null;
                }
            } catch (Throwable th3) {
                C24861r.a aVar3 = C24861r.f119264q;
                m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
            }
            if (m101128B != null) {
                try {
                    m129218b3 = C24861r.m129218b(new JSONObject(m101128B));
                } catch (Throwable th4) {
                    C24861r.a aVar4 = C24861r.f119264q;
                    m129218b3 = C24861r.m129218b(AbstractC24862s.m129227a(th4));
                }
                if (C24861r.m129223g(m129218b3)) {
                    m129218b3 = null;
                }
                JSONObject jSONObject4 = (JSONObject) m129218b3;
                if (jSONObject4 != null) {
                    c17244x02 = new C17244x0(47, jSONObject4);
                    if (c17244x02.m92065c()) {
                        m129218b2 = C24861r.m129218b(c17244x02);
                        m129221e = C24861r.m129221e(m129218b2);
                        if (m129221e != null) {
                            AbstractC20110a.f98889a.mo104552e(m129221e);
                        }
                        if (!C24861r.m129223g(m129218b2)) {
                            obj = null;
                        } else {
                            obj = m129218b2;
                        }
                        c17244x0 = (C17244x0) obj;
                        if (c17244x0 != null) {
                            m131502j = AbstractC25368s.m131502j();
                            m131502j2 = AbstractC25368s.m131502j();
                            m131502j3 = AbstractC25368s.m131502j();
                            m101381s(new C28277c(m131502j, m131502j2, m131502j3, new AbstractC28275a.a0(c17244x0, "js.action.globalsearch", str2, m131185M0, arrayList)));
                            return;
                        }
                    }
                }
            }
            c17244x02 = null;
            m129218b2 = C24861r.m129218b(c17244x02);
            m129221e = C24861r.m129221e(m129218b2);
            if (m129221e != null) {
            }
            if (!C24861r.m129223g(m129218b2)) {
            }
            c17244x0 = (C17244x0) obj;
            if (c17244x0 != null) {
            }
        }
        m101386y(c19325g1, new c(m101383u(c19325g1), m101384w(), m101385x(c19325g1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[Catch: Exception -> 0x0013, TryCatch #1 {Exception -> 0x0013, blocks: (B:3:0x0005, B:5:0x000e, B:8:0x001f, B:10:0x0027, B:11:0x002e, B:13:0x0036, B:14:0x003d, B:15:0x004f, B:18:0x0057, B:39:0x00a0, B:42:0x00a4, B:44:0x00af, B:46:0x00c4, B:49:0x00d5, B:51:0x00e2, B:53:0x0181, B:54:0x0114, B:56:0x011e, B:58:0x0133, B:60:0x0124, B:61:0x0152, B:65:0x0187, B:71:0x0016, B:20:0x005d, B:25:0x0074, B:27:0x0080, B:28:0x008d, B:31:0x0097, B:35:0x0085), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[Catch: Exception -> 0x0013, TryCatch #1 {Exception -> 0x0013, blocks: (B:3:0x0005, B:5:0x000e, B:8:0x001f, B:10:0x0027, B:11:0x002e, B:13:0x0036, B:14:0x003d, B:15:0x004f, B:18:0x0057, B:39:0x00a0, B:42:0x00a4, B:44:0x00af, B:46:0x00c4, B:49:0x00d5, B:51:0x00e2, B:53:0x0181, B:54:0x0114, B:56:0x011e, B:58:0x0133, B:60:0x0124, B:61:0x0152, B:65:0x0187, B:71:0x0016, B:20:0x005d, B:25:0x0074, B:27:0x0080, B:28:0x008d, B:31:0x0097, B:35:0x0085), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[Catch: Exception -> 0x0013, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0013, blocks: (B:3:0x0005, B:5:0x000e, B:8:0x001f, B:10:0x0027, B:11:0x002e, B:13:0x0036, B:14:0x003d, B:15:0x004f, B:18:0x0057, B:39:0x00a0, B:42:0x00a4, B:44:0x00af, B:46:0x00c4, B:49:0x00d5, B:51:0x00e2, B:53:0x0181, B:54:0x0114, B:56:0x011e, B:58:0x0133, B:60:0x0124, B:61:0x0152, B:65:0x0187, B:71:0x0016, B:20:0x005d, B:25:0x0074, B:27:0x0080, B:28:0x008d, B:31:0x0097, B:35:0x0085), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[Catch: Exception -> 0x0013, TryCatch #1 {Exception -> 0x0013, blocks: (B:3:0x0005, B:5:0x000e, B:8:0x001f, B:10:0x0027, B:11:0x002e, B:13:0x0036, B:14:0x003d, B:15:0x004f, B:18:0x0057, B:39:0x00a0, B:42:0x00a4, B:44:0x00af, B:46:0x00c4, B:49:0x00d5, B:51:0x00e2, B:53:0x0181, B:54:0x0114, B:56:0x011e, B:58:0x0133, B:60:0x0124, B:61:0x0152, B:65:0x0187, B:71:0x0016, B:20:0x005d, B:25:0x0074, B:27:0x0080, B:28:0x008d, B:31:0x0097, B:35:0x0085), top: B:2:0x0005, inners: #0 }] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m101383u(C19325g1 c19325g1) {
        Map map;
        ArrayList arrayList;
        int m116584g;
        CharSequence m127168X0;
        CharSequence m127168X02;
        String obj;
        long j11;
        ArrayList arrayList2 = new ArrayList();
        try {
            map = AbstractC23304d.f113421p;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!map.isEmpty()) {
            if (f96100t) {
            }
            if (AbstractC23304d.f113425q.isEmpty()) {
                C7960e.m41971c6().m42188L5();
            }
            if (AbstractC23304d.f113429r.isEmpty()) {
                C7960e.m41971c6().m42368d6();
            }
            arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : map.entrySet()) {
                try {
                    C23024b7 c23024b7 = C23024b7.f111993a;
                    String str = ((C32093r8) entry.getValue()).f147884a;
                    AbstractC19074t.m100207e(str, "uid");
                    ContactProfile m118065l = c23024b7.m118065l(str, c19325g1.m101249y());
                    if (m118065l != null) {
                        C32093r8 c32093r8 = (C32093r8) AbstractC23304d.f113421p.get(m118065l.f42434r);
                        if (c32093r8 != null) {
                            j11 = c32093r8.f147885b;
                        } else {
                            j11 = ((C32093r8) entry.getValue()).f147885b;
                        }
                        m118065l.f42423m1 = j11;
                        if (!hashSet.contains(m118065l.f42434r)) {
                            hashSet.add(m118065l.f42434r);
                            arrayList.add(m118065l);
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            arrayList2.clear();
            if (!arrayList.isEmpty()) {
                AbstractC25376w.m131534w(arrayList, new d());
                int size = arrayList.size();
                m116584g = AbstractC22543l.m116584g(size, 10);
                for (int i11 = 0; i11 < m116584g; i11++) {
                    ContactProfile contactProfile = (ContactProfile) arrayList.get(i11);
                    if (contactProfile.m40374K0()) {
                        C25489b c25489b = C25489b.f122105a;
                        String str2 = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str2, "uid");
                        if (c25489b.m132046f(str2)) {
                            String str3 = contactProfile.f42437s;
                            AbstractC19074t.m100207e(str3, "dpn");
                            String str4 = contactProfile.f42446v;
                            AbstractC19074t.m100207e(str4, "avt");
                            String str5 = contactProfile.f42434r;
                            AbstractC19074t.m100207e(str5, "uid");
                            arrayList2.add(new AbstractC28275a.g(contactProfile, str3, str4, null, c25489b.m132048j(str5), null, 40, null));
                        } else {
                            C31973j5 m4472f = C0943w.f3447a.m4472f(contactProfile.f42434r);
                            if (m4472f == null || (obj = m4472f.m153793y()) == null) {
                                String m40383Q = contactProfile.m40383Q(true, false);
                                AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                                m127168X02 = AbstractC24342w.m127168X0(m40383Q);
                                obj = m127168X02.toString();
                            }
                            String str6 = contactProfile.f42446v;
                            AbstractC19074t.m100207e(str6, "avt");
                            arrayList2.add(new AbstractC28275a.g(contactProfile, obj, str6, null, null, null, 56, null));
                        }
                    } else {
                        String m40383Q2 = contactProfile.m40383Q(true, false);
                        AbstractC19074t.m100207e(m40383Q2, "getDpnPhoneContact(...)");
                        m127168X0 = AbstractC24342w.m127168X0(m40383Q2);
                        String obj2 = m127168X0.toString();
                        String str7 = contactProfile.f42446v;
                        AbstractC19074t.m100207e(str7, "avt");
                        arrayList2.add(new AbstractC28275a.g(contactProfile, obj2, str7, null, null, null, 56, null));
                    }
                }
                while (m116584g < size) {
                    C7960e.m41971c6().m42376e4(((ContactProfile) arrayList.get(m116584g)).f42434r);
                    m116584g++;
                }
            }
            return arrayList2;
        }
        f96100t = false;
        C7960e.m41971c6().m42151I6();
        if (AbstractC23304d.f113425q.isEmpty()) {
        }
        if (AbstractC23304d.f113429r.isEmpty()) {
        }
        arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        while (r5.hasNext()) {
        }
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
        }
        return arrayList2;
    }

    /* renamed from: w */
    private final List m101384w() {
        int m116580c;
        int m116584g;
        int m131511r;
        List m118071t = C23024b7.f111993a.m118071t();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m118071t) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        m116580c = AbstractC22543l.m116580c(0, 5);
        m116584g = AbstractC22543l.m116584g(m116580c, size);
        ArrayList<String> arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < m116584g; i11++) {
            arrayList2.add(arrayList.get(i11));
        }
        C23024b7.f111993a.m118055Q(arrayList2);
        m131511r = AbstractC25370t.m131511r(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(m131511r);
        for (String str : arrayList2) {
            arrayList3.add(new AbstractC28275a.h(str, str, null, 4, null));
        }
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:3:0x0009, B:5:0x0017, B:7:0x0022, B:9:0x002a, B:11:0x0030, B:12:0x003a, B:14:0x0044, B:15:0x0070, B:17:0x007f, B:21:0x0089, B:22:0x008f, B:24:0x0095, B:66:0x019e, B:73:0x0048, B:75:0x004e, B:77:0x005e, B:26:0x009b, B:31:0x00a1, B:34:0x00ad, B:36:0x00b5, B:38:0x00c2, B:41:0x00cf, B:43:0x00df, B:44:0x010f, B:46:0x0117, B:50:0x0133, B:51:0x0120, B:52:0x014b, B:55:0x0199, B:59:0x0176, B:61:0x017a), top: B:2:0x0009, inners: #0 }] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m101385x(C19325g1 c19325g1) {
        List<String> m118072u;
        HashSet hashSet;
        String m122303q0;
        boolean z11;
        InterfaceC0861a m118070s;
        CharSequence m127168X0;
        CharSequence m127168X02;
        String obj;
        String m101149f;
        ArrayList arrayList = new ArrayList();
        try {
            C23024b7 c23024b7 = C23024b7.f111993a;
            List m118072u2 = c23024b7.m118072u();
            if (m118072u2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                if (AbstractC0924m0.m3367Qb()) {
                    C19322f1 c19322f1 = C19322f1.f95950a;
                    if (c19322f1.m101162s() && (m101149f = c19322f1.m101149f()) != null) {
                        AbstractC0924m0.m3378Qm(false);
                        arrayList2.add(m101149f);
                    }
                }
                m101378p(arrayList2);
                if (!arrayList2.isEmpty()) {
                    c23024b7.m118056R(arrayList2);
                }
            } else if (m118072u2.size() == 1 && AbstractC19074t.m100204b(m118072u2.get(0), C19322f1.f95950a.m101149f())) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(m118072u2.get(0));
                m101378p(arrayList3);
                c23024b7.m118056R(arrayList3);
            }
            m118072u = c23024b7.m118072u();
            hashSet = new HashSet();
            m122303q0 = AbstractC23309i.m122303q0();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (m122303q0 != null && m122303q0.length() != 0) {
            z11 = true;
            for (String str : m118072u) {
                try {
                    if (!hashSet.contains(str) && (m118070s = C23024b7.f111993a.m118070s(str, c19325g1.m101249y())) != null) {
                        hashSet.add(str);
                        AbstractC28275a.n nVar = null;
                        if (m118070s instanceof ContactProfile) {
                            if (!C23139m1.f112256a.m118802t(z11, ((ContactProfile) m118070s).f42434r)) {
                                if (((ContactProfile) m118070s).m40374K0()) {
                                    C25489b c25489b = C25489b.f122105a;
                                    String str2 = ((ContactProfile) m118070s).f42434r;
                                    AbstractC19074t.m100207e(str2, "uid");
                                    if (c25489b.m132046f(str2)) {
                                        String str3 = ((ContactProfile) m118070s).f42437s;
                                        AbstractC19074t.m100207e(str3, "dpn");
                                        String str4 = ((ContactProfile) m118070s).f42446v;
                                        AbstractC19074t.m100207e(str4, "avt");
                                        String str5 = ((ContactProfile) m118070s).f42434r;
                                        AbstractC19074t.m100207e(str5, "uid");
                                        nVar = new AbstractC28275a.n(m118070s, str3, str4, null, c25489b.m132048j(str5), null, 40, null);
                                    } else {
                                        C31973j5 m4472f = C0943w.f3447a.m4472f(str);
                                        if (m4472f != null) {
                                            obj = m4472f.m153793y();
                                            if (obj == null) {
                                            }
                                            String str6 = obj;
                                            String str7 = ((ContactProfile) m118070s).f42446v;
                                            AbstractC19074t.m100207e(str7, "avt");
                                            nVar = new AbstractC28275a.n(m118070s, str6, str7, null, null, null, 56, null);
                                        }
                                        String m40383Q = ((ContactProfile) m118070s).m40383Q(true, false);
                                        AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                                        m127168X02 = AbstractC24342w.m127168X0(m40383Q);
                                        obj = m127168X02.toString();
                                        String str62 = obj;
                                        String str72 = ((ContactProfile) m118070s).f42446v;
                                        AbstractC19074t.m100207e(str72, "avt");
                                        nVar = new AbstractC28275a.n(m118070s, str62, str72, null, null, null, 56, null);
                                    }
                                } else {
                                    String m40383Q2 = ((ContactProfile) m118070s).m40383Q(true, false);
                                    AbstractC19074t.m100207e(m40383Q2, "getDpnPhoneContact(...)");
                                    m127168X0 = AbstractC24342w.m127168X0(m40383Q2);
                                    String obj2 = m127168X0.toString();
                                    String str8 = ((ContactProfile) m118070s).f42446v;
                                    AbstractC19074t.m100207e(str8, "avt");
                                    nVar = new AbstractC28275a.n(m118070s, obj2, str8, null, null, null, 56, null);
                                }
                            }
                        } else if (m118070s instanceof C0862b) {
                            nVar = new AbstractC28275a.n(m118070s, ((C0862b) m118070s).m2489o(), ((C0862b) m118070s).m2477a(), null, null, null, 56, null);
                        }
                        if (nVar != null) {
                            arrayList.add(nVar);
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            return arrayList;
        }
        z11 = false;
        while (r8.hasNext()) {
        }
        return arrayList;
    }

    /* renamed from: y */
    private final void m101386y(C19325g1 c19325g1, InterfaceC18494a interfaceC18494a) {
        m101379q(c19325g1, interfaceC18494a);
    }

    /* renamed from: z */
    private final void m101387z(C19325g1 c19325g1, AbstractC28275a abstractC28275a, boolean z11) {
        InterfaceC18319c m101438e;
        boolean z12 = true;
        if (abstractC28275a instanceof AbstractC28275a.g) {
            C7960e.m41971c6().m42376e4(((AbstractC28275a.g) abstractC28275a).m142475c().mo2478b());
            C19955h.f98250a.m103732w(c19325g1, abstractC28275a, "1");
        } else if (abstractC28275a instanceof AbstractC28275a.h) {
            C23024b7.f111993a.m118062g(((AbstractC28275a.h) abstractC28275a).m142483a());
        } else if (abstractC28275a instanceof AbstractC28275a.n) {
            C23024b7 c23024b7 = C23024b7.f111993a;
            String mo2478b = ((AbstractC28275a.n) abstractC28275a).m142475c().mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            c23024b7.m118063h(mo2478b);
        } else {
            z12 = false;
        }
        if (z12) {
            m101382t(c19325g1);
        }
        if (z12 && z11 && (m101438e = m101438e()) != null) {
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
        Boolean bool = null;
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
        C19322f1.f95950a.m101144W();
        String m97246b = this.f96101s.m97246b();
        int hashCode = m97246b.hashCode();
        if (hashCode != -1065280022) {
            if (hashCode != 477088458) {
                if (hashCode == 1065584878 && m97246b.equals("Search.Task.UpdatePreStateSettingFunction")) {
                    Object m97245a = this.f96101s.m97245a();
                    boolean z11 = false;
                    if (m97245a instanceof AbstractC28275a.f) {
                        AbstractC28275a.f fVar = (AbstractC28275a.f) this.f96101s.m97245a();
                        Object m97247c = this.f96101s.m97247c();
                        if (m97247c instanceof Boolean) {
                            bool = (Boolean) m97247c;
                        }
                        if (bool != null) {
                            z11 = bool.booleanValue();
                        }
                        m101371A(c19325g1, fVar, z11);
                        return;
                    }
                    if (m97245a instanceof AbstractC28275a) {
                        AbstractC28275a abstractC28275a = (AbstractC28275a) this.f96101s.m97245a();
                        Object m97247c2 = this.f96101s.m97247c();
                        if (m97247c2 instanceof Boolean) {
                            bool = (Boolean) m97247c2;
                        }
                        if (bool != null) {
                            z11 = bool.booleanValue();
                        }
                        m101387z(c19325g1, abstractC28275a, z11);
                        return;
                    }
                    return;
                }
                return;
            }
            if (m97246b.equals("Search.Task.ReloadPreState")) {
                m101382t(c19325g1);
                return;
            }
            return;
        }
        if (m97246b.equals("Search.Task.UpdatePreStateSettingToggle") && (this.f96101s.m97245a() instanceof AbstractC28275a.x) && (this.f96101s.m97247c() instanceof Boolean) && (this.f96101s.m97248d() instanceof Boolean)) {
            m101372B(c19325g1, ((AbstractC28275a.x) this.f96101s.m97245a()).m142504a(), ((Boolean) this.f96101s.m97247c()).booleanValue(), ((Boolean) this.f96101s.m97248d()).booleanValue());
        }
    }

    public /* synthetic */ C19348o0(InterfaceC18319c interfaceC18319c, C18316b c18316b, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, (i11 & 2) != 0 ? new C18316b("Search.Task.ReloadPreState", null, null, null, 14, null) : c18316b);
    }
}
