package com.zing.zalo.p077ui.chattag;

import ag0.C0815e1;
import b40.C2526d;
import com.zing.zalo.common.chat.label.C7860a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p130eh.C18431b;
import p132ej.C18445g;
import p132ej.C18451m;
import p162fh.C18932a;
import p162fh.C18935d;
import p361nb.C23648e;
import pm0.AbstractC24856m;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;

/* renamed from: com.zing.zalo.ui.chattag.a */
/* loaded from: classes5.dex */
public final class C11837a {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static final C11837a f61615e = b.f61620a.m65785a();

    /* renamed from: a */
    private long f61616a;

    /* renamed from: b */
    private int f61617b;

    /* renamed from: c */
    private final ArrayList f61618c = new ArrayList();

    /* renamed from: d */
    private int f61619d;

    /* renamed from: com.zing.zalo.ui.chattag.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11837a m65784a() {
            return C11837a.f61615e;
        }
    }

    /* renamed from: com.zing.zalo.ui.chattag.a$b */
    /* loaded from: classes5.dex */
    private static final class b {

        /* renamed from: a */
        public static final b f61620a = new b();

        /* renamed from: b */
        private static final InterfaceC24854k f61621b;

        /* renamed from: com.zing.zalo.ui.chattag.a$b$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f61622q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11837a mo12V4() {
                return new C11837a();
            }
        }

        static {
            InterfaceC24854k m129210a;
            m129210a = AbstractC24856m.m129210a(a.f61622q);
            f61621b = m129210a;
        }

        private b() {
        }

        /* renamed from: a */
        public final C11837a m65785a() {
            return (C11837a) f61621b.getValue();
        }
    }

    /* renamed from: c */
    private final List m65771c(int i11, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof C18445g) {
                it.remove();
            }
        }
        C18431b m40271O = C7860a.Companion.m40303b().m40271O(i11);
        if (m40271O != null) {
            C18445g c18445g = new C18445g(m40271O);
            AbstractC19074t.m100206d(list, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.chat.model.tabmessage.ConversationFilter>");
            ((ArrayList) list).add(0, c18445g);
        }
        return C19669z.Companion.m103232a().m103218d0(list);
    }

    /* renamed from: d */
    private final JSONObject m65772d(List list, List list2, List list3) {
        int size = list.size();
        int size2 = list2.size();
        int size3 = list3.size();
        JSONObject jSONObject = new JSONObject();
        if (C18932a.f94442a.m99182f()) {
            jSONObject.put("focus", size2);
            jSONObject.put("other", size3);
        } else {
            jSONObject.put("all", size);
        }
        return jSONObject;
    }

    /* renamed from: e */
    private final C24860q m65773e(List list) {
        Iterator it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            C18451m c18451m = (C18451m) it.next();
            if (c18451m.mo97722d()) {
                i11++;
            } else if (c18451m.mo97725h()) {
                i12++;
            }
        }
        return new C24860q(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: f */
    private final JSONObject m65774f(List list, List list2, List list3) {
        C24860q m65773e = m65773e(list);
        C24860q m65773e2 = m65773e(list2);
        C24860q m65773e3 = m65773e(list3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("normal_unread", ((Number) m65773e.m129215c()).intValue() + ((Number) m65773e2.m129215c()).intValue() + ((Number) m65773e3.m129215c()).intValue());
        jSONObject.put("mark_as_unread", ((Number) m65773e.m129216d()).intValue() + ((Number) m65773e2.m129216d()).intValue() + ((Number) m65773e3.m129216d()).intValue());
        return jSONObject;
    }

    /* renamed from: b */
    public final void m65775b(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(20).m123923p("chat_select_filter_label").m123924q(1).m123925r(str), false);
    }

    /* renamed from: g */
    public final boolean m65776g() {
        return this.f61619d != 0;
    }

    /* renamed from: h */
    public final void m65777h(int i11, List list) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(list, "currentFilterList");
        m131500h = AbstractC25368s.m131500h(String.valueOf(i11));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (C18932a.f94442a.m99182f()) {
            List list2 = list;
            arrayList2.addAll(m65771c(0, new ArrayList(list2)));
            arrayList3.addAll(m65771c(1, new ArrayList(list2)));
        } else {
            arrayList.addAll(C19669z.Companion.m103232a().m103218d0(list));
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m131500h.add(String.valueOf(C18935d.Companion.m99234a().m99230r().size()));
                }
            } else {
                m131500h.add(m65774f(arrayList, arrayList2, arrayList3).toString());
            }
        } else {
            m131500h.add(m65774f(arrayList, arrayList2, arrayList3).toString());
        }
        m131500h.add(m65772d(arrayList, arrayList2, arrayList3).toString());
        C23648e m123925r = C23648e.Companion.m123929a().m123927t(20).m123923p("chat_apply_filter").m123924q(0).m123925r("chats_list");
        String[] strArr = (String[]) m131500h.toArray(new String[0]);
        C0815e1.m2075D().m2100V(m123925r.m123926s((String[]) Arrays.copyOf(strArr, strArr.length)), false);
    }

    /* renamed from: i */
    public final void m65778i(int i11) {
        this.f61617b = i11;
    }

    /* renamed from: j */
    public final void m65779j(int i11, boolean z11) {
        if (i11 == 0) {
            if (this.f61616a > 0) {
                m65780k(z11);
            }
        } else if (this.f61616a == 0) {
            this.f61616a = System.currentTimeMillis();
        }
        this.f61619d = i11;
    }

    /* renamed from: k */
    public final void m65780k(boolean z11) {
        ArrayList m131500h;
        String str;
        m131500h = AbstractC25368s.m131500h(String.valueOf(this.f61619d));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (C18932a.f94442a.m99182f()) {
            arrayList2.addAll(m65771c(0, new ArrayList(this.f61618c)));
            arrayList3.addAll(m65771c(1, new ArrayList(this.f61618c)));
        } else {
            arrayList.addAll(C19669z.Companion.m103232a().m103218d0(this.f61618c));
        }
        int i11 = this.f61619d;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m131500h.add(String.valueOf(C18935d.Companion.m99234a().m99230r().size()));
                }
            } else {
                m131500h.add(m65774f(arrayList, arrayList2, arrayList3).toString());
            }
        } else {
            m131500h.add(m65774f(arrayList, arrayList2, arrayList3).toString());
        }
        m131500h.add(String.valueOf(System.currentTimeMillis() - this.f61616a));
        if (z11) {
            str = "1";
        } else {
            str = "0";
        }
        m131500h.add(str);
        C23648e m123925r = C23648e.Companion.m123929a().m123927t(20).m123923p("chat_reset_filter").m123924q(0).m123925r("chats_list");
        String[] strArr = (String[]) m131500h.toArray(new String[0]);
        C0815e1.m2075D().m2100V(m123925r.m123926s((String[]) Arrays.copyOf(strArr, strArr.length)), false);
        this.f61616a = 0L;
        this.f61618c.clear();
    }

    /* renamed from: l */
    public final void m65781l(int i11, int i12, String str) {
        String m12674A;
        String str2;
        AbstractC19074t.m100208f(str, "uid");
        if (i11 != 0) {
            if (AbstractC19074t.m100204b(str, "-2")) {
                m12674A = "6";
            } else {
                m12674A = C2526d.f10270a.m12674A(str);
            }
            if (C18932a.f94442a.m99182f()) {
                if (i12 != 0) {
                    if (i12 == 1) {
                        str2 = "chat_other_tab";
                    }
                } else {
                    str2 = "chat_focus_tab";
                }
                C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(20).m123923p("open_csc_from_filter").m123924q(0).m123925r(str2).m123926s(String.valueOf(i11), m12674A), false);
            }
            str2 = "chats_list";
            C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(20).m123923p("open_csc_from_filter").m123924q(0).m123925r(str2).m123926s(String.valueOf(i11), m12674A), false);
        }
    }

    /* renamed from: m */
    public final void m65782m() {
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(20).m123923p("chat_open_filter").m123924q(0).m123925r("chats_list"), false);
    }

    /* renamed from: n */
    public final void m65783n(List list) {
        AbstractC19074t.m100208f(list, "filterList");
        this.f61618c.clear();
        this.f61618c.addAll(list);
    }
}
