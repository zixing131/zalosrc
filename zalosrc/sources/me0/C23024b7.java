package me0;

import ai.C0862b;
import ai.InterfaceC0861a;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.C0943w;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.zinstant.C17244x0;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19310b1;
import ga0.C19322f1;
import ga0.C19325g1;
import ga0.InterfaceC19305a;
import gw.C19669z;
import is.C20795g;
import j30.C20912a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p055ce.C3445n;
import p142ey.C18644n;
import p173fz.C19172a;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p398oo.C24380u;
import p445qe.C25244a;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p578vk.AbstractC28275a;
import p612wk.AbstractC29069a;
import p716zh.C31901e8;
import p716zh.C31973j5;
import p716zh.C32058p1;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qh0.C25287a;
import qm0.AbstractC25368s;
import sd.C26231b;
import th.C26680a;
import tk.InterfaceC26722a;
import vg.C28203u6;

/* renamed from: me0.b7 */
/* loaded from: classes4.dex */
public final class C23024b7 {

    /* renamed from: a */
    public static final C23024b7 f111993a = new C23024b7();

    /* renamed from: b */
    private static final Map f111994b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public static boolean f111995c = true;

    /* renamed from: d */
    private static final Map f111996d;

    /* renamed from: e */
    private static boolean f111997e;

    /* renamed from: f */
    private static final InterfaceC18510q f111998f;

    /* renamed from: me0.b7$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        public static final a f111999q = new a();

        a() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m118076a((Spannable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m118076a(Spannable spannable, int i11, int i12) {
            AbstractC19074t.m100208f(spannable, "spannable");
            AbstractC23217t2.m119664p(spannable, i11, i12, C23212s8.m119606n(AbstractC16781w.SearchGlobalKeywordSearch), 0, 33);
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f111996d = synchronizedMap;
        f111997e = true;
        f111998f = a.f111999q;
    }

    private C23024b7() {
    }

    /* renamed from: A */
    private final boolean m118029A() {
        if (AbstractC23306f.m120676j().m128396M() && !AbstractC3489d.m17513u()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static final boolean m118030B(int i11) {
        if (i11 != 3) {
            if (i11 != 11) {
                if (i11 != 48) {
                    if (i11 != 86) {
                        if (i11 != 89) {
                            if (i11 != 119) {
                                if (i11 != 123) {
                                    if (i11 != 79) {
                                        if (i11 != 80) {
                                            if (i11 != 106) {
                                                if (i11 != 107) {
                                                    switch (i11) {
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                            return f111993a.m118032D();
                                                        default:
                                                            switch (i11) {
                                                                case 93:
                                                                    return !AbstractC23304d.f113347X1;
                                                                case 94:
                                                                    return !C25244a.m130639q();
                                                                case 95:
                                                                    if (f111993a.m118053z()) {
                                                                        return true;
                                                                    }
                                                                    break;
                                                                default:
                                                                    switch (i11) {
                                                                        case 113:
                                                                            return !C24380u.f117739a.m127512e();
                                                                        case 114:
                                                                            if (C26680a.m137023g() == 1) {
                                                                                return false;
                                                                            }
                                                                            return true;
                                                                        case 115:
                                                                            if (C19172a.m100608s("features@setting@account@verify_link", null, 2, null).length() != 0) {
                                                                                return false;
                                                                            }
                                                                            return true;
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    return !AbstractC0924m0.m3194Kc();
                                                }
                                            } else {
                                                return !AbstractC23306f.m120562A().m2526U();
                                            }
                                        } else if (AbstractC23309i.m122194n3() == 0) {
                                            return true;
                                        }
                                    } else if (!C20912a.Companion.m109411a().m109406m()) {
                                        return true;
                                    }
                                } else {
                                    return AbstractC3489d.m17505m();
                                }
                            } else {
                                return !C26231b.m134867m();
                            }
                        } else if (AbstractC0924m0.m3530W0() != 1) {
                            return true;
                        }
                    } else if (!AbstractC0924m0.m4016ma()) {
                        return true;
                    }
                } else if (!AbstractC23309i.m121234Ng() || !AbstractC23309i.m121529Vf()) {
                    return true;
                }
            } else if (!AbstractC23309i.m121529Vf()) {
                return true;
            }
        } else if (f111993a.m118029A()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static final boolean m118031C(int i11, boolean z11) {
        if (z11) {
            if (f111997e) {
                f111996d.clear();
            }
            Map map = f111996d;
            Boolean bool = (Boolean) map.get(Integer.valueOf(i11));
            if (bool == null) {
                boolean m118030B = m118030B(i11);
                map.put(Integer.valueOf(i11), Boolean.valueOf(m118030B));
                return m118030B;
            }
            return bool.booleanValue();
        }
        return m118030B(i11);
    }

    /* renamed from: D */
    private final boolean m118032D() {
        return !C3445n.m17340a();
    }

    /* renamed from: E */
    private final boolean m118033E(ContactProfile contactProfile) {
        if (!C18644n.m98531l().m98558u(contactProfile.f42434r) && !contactProfile.m40374K0() && (AbstractC25495a.m132081f(contactProfile.f42434r) || !C23139m1.f112256a.m118801s(contactProfile))) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    private final List m118034F(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String str2 = (String) jSONArray.get(i11);
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: G */
    public static final String[] m118035G(String str) {
        AbstractC19074t.m100208f(str, "org");
        String[] m119968C = AbstractC23262x6.m119968C(str);
        AbstractC19074t.m100207e(m119968C, "preprocessKeyStrLegacy(...)");
        return m119968C;
    }

    /* renamed from: H */
    public static final String[] m118036H(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "org");
        String[] m119972G = AbstractC23262x6.m119972G(str, z11);
        AbstractC19074t.m100207e(m119972G, "preprocessSearchStrLegacy(...)");
        return m119972G;
    }

    /* renamed from: I */
    private final void m118037I() {
        f111994b.clear();
        List<ContactProfile> m103199P = C19669z.Companion.m103232a().m103199P();
        long currentTimeMillis = System.currentTimeMillis();
        for (ContactProfile contactProfile : m103199P) {
            C23024b7 c23024b7 = f111993a;
            if (c23024b7.m118033E(contactProfile)) {
                Map map = f111994b;
                AbstractC19074t.m100207e(map, "mapUidToInteractionScore");
                map.put(contactProfile.f42434r, Integer.valueOf(c23024b7.m118039K(contactProfile.m40402e0(), currentTimeMillis)));
            }
        }
        f111995c = false;
    }

    /* renamed from: J */
    public static final float m118038J(String str, String str2, List list, long j11, int i11, StringBuilder sb2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(list, "arrNamesHit");
        return AbstractC23262x6.m119976K(str, str2, list, j11, i11, sb2) + m118040L(str);
    }

    /* renamed from: K */
    private final int m118039K(long j11, long j12) {
        long j13 = j12 - j11;
        if (!C19322f1.f95950a.m101156m() || j11 <= 0) {
            return 0;
        }
        if (j13 <= 86400000) {
            return 3500;
        }
        if (j13 <= 259200000) {
            return 3000;
        }
        if (j13 > 604800000) {
            return 0;
        }
        return 2500;
    }

    /* renamed from: L */
    public static final int m118040L(String str) {
        if (f111995c) {
            f111993a.m118037I();
        }
        Integer num = (Integer) f111994b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: M */
    private final float m118041M(String str, String str2, InterfaceC0861a interfaceC0861a, List list, List list2, int i11) {
        AbstractC23262x6.m119994g(str, str2, interfaceC0861a, list, list2, i11);
        return interfaceC0861a.mo2479d();
    }

    /* renamed from: N */
    public static final int m118042N(long j11) {
        if (j11 <= 14400000) {
            return 100;
        }
        if (j11 <= 86400000) {
            return 80;
        }
        if (j11 <= 259200000) {
            return 60;
        }
        if (j11 <= 604800000) {
            return 40;
        }
        if (j11 <= 2592000000L) {
            return 20;
        }
        return j11 <= 7776000000L ? 10 : 0;
    }

    /* renamed from: O */
    public static final void m118043O(String str, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12, Map map, ArrayList arrayList3, boolean z13, boolean z14, boolean z15, InterfaceC19305a interfaceC19305a) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(arrayList, "orgList");
        AbstractC19074t.m100208f(arrayList2, "desList");
        AbstractC19074t.m100208f(map, "mapUidMsgItemList");
        AbstractC19074t.m100208f(arrayList3, "arrNamesHit");
        AbstractC23262x6.m119978M(str, arrayList, arrayList2, z11, z12, map, arrayList3, z13, z14, z15, interfaceC19305a);
    }

    /* renamed from: T */
    private final String m118044T(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: a */
    public static final void m118045a() {
        f111994b.clear();
        f111995c = true;
    }

    /* renamed from: b */
    public static final String m118046b(int i11) {
        return "setting_" + i11;
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC29069a.a0 m118047d(C23024b7 c23024b7, List list, C17244x0 c17244x0, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return c23024b7.m118059c(list, c17244x0, i11);
    }

    /* renamed from: i */
    public static final String m118048i(JSONObject jSONObject) {
        int i11;
        String str;
        AbstractC19074t.m100208f(jSONObject, "data");
        if (jSONObject.has("timeout")) {
            i11 = jSONObject.optInt("timeout");
        } else {
            i11 = 0;
        }
        if (jSONObject.has("rules")) {
            str = AbstractC23059e9.m118338q(jSONObject.getJSONObject("rules"));
            AbstractC19074t.m100207e(str, "getStringJsonObjectByZaloLanguage(...)");
        } else {
            str = "";
        }
        if (str.length() == 0 || i11 == 0) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_searching_phone_numbers_too_many_times_in, AbstractC23136l9.m118743r0(AbstractC8020f0.str_one_day), "00:00");
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            return m118746s0;
        }
        String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_searching_phone_numbers_too_many_times_in, str, AbstractC23160o0.m119212P0(new Date(System.currentTimeMillis() + (i11 * 1000)).getTime(), true));
        AbstractC19074t.m100207e(m118746s02, "getString(...)");
        return m118746s02;
    }

    /* renamed from: j */
    public static final void m118049j(List list, List list2, String str, List list3, int i11) {
        AbstractC19074t.m100208f(list, "srcList");
        AbstractC19074t.m100208f(list2, "desList");
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(list3, "recentClickList");
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0861a interfaceC0861a = (InterfaceC0861a) it.next();
            float m118041M = f111993a.m118041M(str, C23139m1.f112256a.m118800q(interfaceC0861a), interfaceC0861a, interfaceC0861a.mo2482h(), arrayList, i11);
            if (m118041M > 0.0f) {
                String mo2478b = interfaceC0861a.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                interfaceC0861a.mo2483i(m118041M + m118038J(mo2478b, null, list3, currentTimeMillis, i11, null));
                list2.add(interfaceC0861a);
            }
        }
    }

    /* renamed from: n */
    public static /* synthetic */ ContactProfile m118050n(C23024b7 c23024b7, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c23024b7.m118065l(str, z11);
    }

    /* renamed from: q */
    public static /* synthetic */ AbstractC29069a.z m118051q(C23024b7 c23024b7, AbstractC29069a.z zVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = zVar.m145234d().m145165c().size();
        }
        return c23024b7.m118068p(zVar, i11);
    }

    /* renamed from: y */
    private final void m118052y(String str) {
        if (!C19322f1.f95950a.m101132G() || str.length() == 0) {
            return;
        }
        List<String> m118071t = m118071t();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        for (String str2 : m118071t) {
            if (arrayList.size() < 5 && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        m118055Q(arrayList);
    }

    /* renamed from: z */
    private final boolean m118053z() {
        if ((!AbstractC0924m0.m4254u9() && !AbstractC0924m0.m4341x9()) || AbstractC3489d.m17513u()) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final void m118054P(String str, List list, List list2, int i11, InterfaceC19305a interfaceC19305a) {
        AbstractC23262x6.m119985T(str, list, list2, i11, interfaceC19305a);
    }

    /* renamed from: Q */
    public final void m118055Q(List list) {
        AbstractC19074t.m100208f(list, "list");
        AbstractC0924m0.m3349Pm(m118044T(list));
    }

    /* renamed from: R */
    public final void m118056R(List list) {
        Object m129218b;
        AbstractC19074t.m100208f(list, "value");
        try {
            C24861r.a aVar = C24861r.f119264q;
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            m129218b = C24861r.m129218b(jSONArray.toString());
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        AbstractC0924m0.m3407Rm((String) m129218b);
    }

    /* renamed from: S */
    public final Spannable m118057S(CharSequence charSequence, List list, InterfaceC18510q interfaceC18510q) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(list, "highlightPairList");
        AbstractC19074t.m100208f(interfaceC18510q, "setSpan");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int size = list.size();
        for (int i11 = 0; i11 < size - 1; i11 += 2) {
            if (((Number) list.get(i11)).intValue() >= 0) {
                int i12 = i11 + 1;
                if (((Number) list.get(i12)).intValue() > ((Number) list.get(i11)).intValue()) {
                    interfaceC18510q.mo45599Hr(spannableStringBuilder, list.get(i11), list.get(i12));
                }
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: U */
    public final void m118058U(AbstractC29069a.a aVar, String str) {
        AbstractC19074t.m100208f(aVar, "contactToUpdate");
        AbstractC19074t.m100208f(str, "uidToFind");
        AbstractC23262x6.m119987V(aVar, str);
    }

    /* renamed from: c */
    public final AbstractC29069a.a0 m118059c(List list, C17244x0 c17244x0, int i11) {
        int i12;
        Object m129218b;
        AbstractC19074t.m100208f(list, "data");
        AbstractC19074t.m100208f(c17244x0, "zinstantApiInfo");
        if (i11 == list.size()) {
            i12 = -1;
        } else {
            i12 = i11;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C24861r.a aVar = C24861r.f119264q;
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC29069a.m mVar = (AbstractC29069a.m) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", mVar.m145192b().mo2478b());
                jSONObject2.put("title", mVar.m145192b().m2489o());
                jSONObject2.put("description", mVar.m145192b().m2485k());
                jSONObject2.put("icon", mVar.m145192b().m2477a());
                jSONObject2.put("click_action", "action.globalsearch.search_result.miniapp");
                jSONObject2.put("click_data", "{ \"uid\": " + mVar.m145192b().mo2478b() + " }");
                if (mVar.m145192b().m2489o() instanceof Spanned) {
                    List m119656h = AbstractC23217t2.m119656h((Spanned) mVar.m145192b().m2489o());
                    AbstractC19074t.m100207e(m119656h, "getAllHighlightSpanRanges(...)");
                    if (!m119656h.isEmpty()) {
                        jSONObject2.put("title_highlight_data", new JSONArray((Collection) m119656h));
                    }
                }
                if (mVar.m145192b().m2485k() instanceof Spanned) {
                    List m119656h2 = AbstractC23217t2.m119656h((Spanned) mVar.m145192b().m2485k());
                    AbstractC19074t.m100207e(m119656h2, "getAllHighlightSpanRanges(...)");
                    if (!m119656h2.isEmpty()) {
                        jSONObject2.put("description_highlight_data", new JSONArray((Collection) m119656h2));
                    }
                }
                jSONArray.put(jSONObject2);
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("miniapps", jSONArray);
            jSONObject.put("limit_show", i12);
            m129218b = C24861r.m129218b(jSONObject);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        String str = null;
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        JSONObject jSONObject3 = (JSONObject) m129218b;
        if (jSONObject3 != null) {
            str = jSONObject3.toString();
        }
        return new AbstractC29069a.a0(list, c17244x0, "js.action.globalsearch", str, jSONObject3, i11);
    }

    /* renamed from: e */
    public final void m118060e() {
        List m131502j;
        m131502j = AbstractC25368s.m131502j();
        m118055Q(m131502j);
    }

    /* renamed from: f */
    public final void m118061f() {
        m118056R(new ArrayList());
    }

    /* renamed from: g */
    public final void m118062g(String str) {
        AbstractC19074t.m100208f(str, "query");
        List<String> m118071t = m118071t();
        ArrayList arrayList = new ArrayList();
        for (String str2 : m118071t) {
            if (!AbstractC19074t.m100204b(str2, str)) {
                arrayList.add(str2);
            }
        }
        m118055Q(arrayList);
    }

    /* renamed from: h */
    public final void m118063h(String str) {
        AbstractC19074t.m100208f(str, "uid");
        List m118072u = m118072u();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m118072u) {
            if (!AbstractC19074t.m100204b((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        m118056R(arrayList);
    }

    /* renamed from: k */
    public final InterfaceC18510q m118064k() {
        return f111998f;
    }

    /* renamed from: l */
    public final ContactProfile m118065l(String str, boolean z11) {
        boolean m127120J;
        C31901e8 m2800f;
        C32058p1 m132048j;
        Conversation m103202S;
        ContactProfile m40996I;
        AbstractC19074t.m100208f(str, "uid");
        ContactProfile contactProfile = null;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            ContactProfile.m40356w(m141798e);
        } else {
            m141798e = null;
        }
        if (m141798e == null && (m103202S = C19669z.Companion.m103232a().m103202S(str)) != null && (m40996I = m103202S.m40996I()) != null) {
            m141798e = ContactProfile.m40356w(m40996I);
        }
        ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(str);
        if (m153138j != null) {
            if (m141798e == null) {
                m141798e = ContactProfile.m40356w(m153138j);
            }
            if (m141798e != null) {
                m141798e.f42352K0 = m153138j.f42447v0;
            }
            if (m141798e != null) {
                m141798e.f42436r1 = m153138j.f42436r1;
            }
        }
        if (m141798e == null) {
            if (AbstractC25495a.m132079d(str)) {
                C31973j5 m4472f = C0943w.f3447a.m4472f(str);
                if (m4472f != null) {
                    contactProfile = new ContactProfile("group_" + m4472f.m153781r());
                    contactProfile.f42437s = m4472f.m153793y();
                } else {
                    C25489b c25489b = C25489b.f122105a;
                    if (c25489b.m132046f(str) && (m132048j = c25489b.m132048j(str)) != null) {
                        contactProfile = m132048j.m154667a();
                    }
                }
            } else if (AbstractC25495a.m132084i(str)) {
                contactProfile = new ContactProfile("-2");
                contactProfile.mo2476e(AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg));
                contactProfile.f42446v = "https://res-zalo.zadn.vn/upload/media/2018/4/19/ava_stranger_1524105999293.png";
            } else if (AbstractC25495a.m132081f(str)) {
                contactProfile = new ContactProfile("-8");
                contactProfile.mo2476e(AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title));
            } else {
                if (z11) {
                    m127120J = AbstractC24341v.m127120J(str, "/", false, 2, null);
                    if (m127120J) {
                        String substring = str.substring(1);
                        AbstractC19074t.m100207e(substring, "substring(...)");
                        if (substring.length() > 0 && (m2800f = AbstractC0906d0.m2800f(MainApplication.Companion.m35500c(), substring)) != null) {
                            contactProfile = new ContactProfile(str);
                            contactProfile.f42455y = m2800f.m153297j();
                            contactProfile.f42437s = m2800f.m153295h();
                            contactProfile.f42446v = C23302b.f113247a.m120521a();
                        }
                    }
                }
                if (AbstractC25495a.m132087l(str)) {
                    contactProfile = C23139m1.f112256a.m118797j();
                }
            }
            return contactProfile;
        }
        return m141798e;
    }

    /* renamed from: m */
    public final ContactProfile m118066m(InterfaceC26722a interfaceC26722a) {
        AbstractC19074t.m100208f(interfaceC26722a, "<this>");
        if (interfaceC26722a instanceof AbstractC28275a.c) {
            InterfaceC0861a m142475c = ((AbstractC28275a.c) interfaceC26722a).m142475c();
            if (!(m142475c instanceof ContactProfile)) {
                return null;
            }
            return (ContactProfile) m142475c;
        }
        if (interfaceC26722a instanceof AbstractC29069a.o) {
            InterfaceC0861a m145198e = ((AbstractC29069a.o) interfaceC26722a).m145198e();
            if (!(m145198e instanceof ContactProfile)) {
                return null;
            }
            return (ContactProfile) m145198e;
        }
        if (interfaceC26722a instanceof AbstractC29069a.k) {
            return ((AbstractC29069a.k) interfaceC26722a).m145188d().f147411b;
        }
        if (!(interfaceC26722a instanceof AbstractC29069a.a)) {
            return null;
        }
        return new ContactProfile(((AbstractC29069a.a) interfaceC26722a).m145142f().m18037d().m18055d());
    }

    /* renamed from: o */
    public final InterfaceC0861a m118067o(InterfaceC26722a interfaceC26722a) {
        AbstractC19074t.m100208f(interfaceC26722a, "<this>");
        if (interfaceC26722a instanceof AbstractC29069a.o) {
            return ((AbstractC29069a.o) interfaceC26722a).m145198e();
        }
        if (interfaceC26722a instanceof AbstractC29069a.k) {
            return ((AbstractC29069a.k) interfaceC26722a).m145188d().f147411b;
        }
        if (interfaceC26722a instanceof AbstractC29069a.v) {
            return ((AbstractC29069a.v) interfaceC26722a).m145222b();
        }
        if (interfaceC26722a instanceof AbstractC29069a.m) {
            return ((AbstractC29069a.m) interfaceC26722a).m145192b();
        }
        if (interfaceC26722a instanceof AbstractC28275a.c) {
            return ((AbstractC28275a.c) interfaceC26722a).m142475c();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final AbstractC29069a.z m118068p(AbstractC29069a.z zVar, int i11) {
        int i12;
        String str;
        AbstractC19074t.m100208f(zVar, "<this>");
        if (i11 != zVar.m145234d().m145166d()) {
            int min = Math.min(i11, zVar.m145234d().m145165c().size());
            if (min == zVar.m145234d().m145165c().size()) {
                i12 = -1;
            } else {
                i12 = min;
            }
            JSONObject m145169g = zVar.m145234d().m145169g();
            String str2 = null;
            if (m145169g != null) {
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    m145169g.put("limit_show", i12);
                    str = C24861r.m129218b(m145169g.toString());
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    str = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                if (!C24861r.m129223g(str)) {
                    str2 = str;
                }
                str2 = str2;
            }
            String str3 = str2;
            if (str3 != null) {
                return new AbstractC29069a.z(zVar.m145193c(), zVar.m145192b(), AbstractC29069a.a0.m145163b(zVar.m145234d(), null, null, null, str3, null, min, 23, null));
            }
            return zVar;
        }
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0862b m118069r() {
        String m108522a;
        Object m129218b;
        Object m129218b2;
        String str;
        JSONObject optJSONObject;
        C0862b c0862b;
        C20795g c20795g = C20795g.f102172a;
        c20795g.m108502f();
        C20795g.c m108500d = c20795g.m108500d();
        Object obj = null;
        if (m108500d == null || (m108522a = m108500d.m108522a()) == null) {
            return null;
        }
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(new JSONObject(m108522a));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        JSONObject jSONObject = (JSONObject) m129218b;
        if (jSONObject == null) {
            return null;
        }
        try {
            String m130861e = C25287a.f121271a.m130861e();
            if (m130861e.length() > 0) {
                jSONObject.put("mpUrl", m130861e);
            } else {
                m130861e = jSONObject.optString("mpUrl");
            }
            str = m130861e;
            AbstractC19074t.m100205c(str);
        } catch (Throwable th3) {
            C24861r.a aVar3 = C24861r.f119264q;
            m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
        }
        if (str.length() != 0 && (optJSONObject = jSONObject.optJSONObject("mpInfo")) != null) {
            AbstractC19074t.m100205c(optJSONObject);
            String optString = optJSONObject.optString("appId");
            if (optString != null) {
                AbstractC19074t.m100205c(optString);
                String optString2 = optJSONObject.optString("appName", "");
                String optString3 = optJSONObject.optString("appAvtUrl", "");
                String optString4 = optJSONObject.optString("appVersion", "");
                optJSONObject.optString("appQRUrl", "");
                String optString5 = optJSONObject.optString("appDesc", "");
                AbstractC19074t.m100205c(optString2);
                AbstractC19074t.m100205c(optString3);
                AbstractC19074t.m100205c(optString4);
                AbstractC19074t.m100205c(optString5);
                c0862b = new C0862b(optString, str, optString2, optString3, optString4, new String[0], optString5, jSONObject);
                m129218b2 = C24861r.m129218b(c0862b);
                if (!C24861r.m129223g(m129218b2)) {
                    obj = m129218b2;
                }
                return (C0862b) obj;
            }
        }
        c0862b = null;
        m129218b2 = C24861r.m129218b(c0862b);
        if (!C24861r.m129223g(m129218b2)) {
        }
        return (C0862b) obj;
    }

    /* renamed from: s */
    public final InterfaceC0861a m118070s(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        C19322f1 c19322f1 = C19322f1.f95950a;
        if (AbstractC19074t.m100204b(c19322f1.m101149f(), str)) {
            return c19322f1.m101148e();
        }
        if (AbstractC19074t.m100204b(str, "-1000001") && !c19322f1.m101165v()) {
            return null;
        }
        return m118065l(str, z11);
    }

    /* renamed from: t */
    public final List m118071t() {
        String m3563X4 = AbstractC0924m0.m3563X4();
        AbstractC19074t.m100207e(m3563X4, "getSearchGlobalHistoryQuery(...)");
        return m118034F(m3563X4);
    }

    /* renamed from: u */
    public final List m118072u() {
        Object m129218b;
        String m3592Y4 = AbstractC0924m0.m3592Y4();
        ArrayList arrayList = new ArrayList();
        if (m3592Y4 != null) {
            try {
                C24861r.a aVar = C24861r.f119264q;
                JSONArray jSONArray = new JSONArray(m3592Y4);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String str = (String) jSONArray.get(i11);
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                m129218b = C24861r.m129218b(C24848g0.f119245a);
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            C24861r.m129217a(m129218b);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0862b m118073v() {
        String m108522a;
        Object m129218b;
        Object m129218b2;
        JSONObject optJSONObject;
        C0862b c0862b;
        C20795g c20795g = C20795g.f102172a;
        c20795g.m108502f();
        C20795g.c m108500d = c20795g.m108500d();
        Object obj = null;
        if (m108500d == null || (m108522a = m108500d.m108522a()) == null) {
            return null;
        }
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(new JSONObject(m108522a));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        JSONObject jSONObject = (JSONObject) m129218b;
        if (jSONObject == null) {
            return null;
        }
        try {
            optJSONObject = jSONObject.optJSONObject("mpInfo");
        } catch (Throwable th3) {
            C24861r.a aVar3 = C24861r.f119264q;
            m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
        }
        if (optJSONObject != null) {
            AbstractC19074t.m100205c(optJSONObject);
            String optString = jSONObject.optString("mpUrl");
            if (optString != null) {
                AbstractC19074t.m100205c(optString);
                String optString2 = optJSONObject.optString("appId");
                if (optString2 != null) {
                    AbstractC19074t.m100205c(optString2);
                    String optString3 = optJSONObject.optString("appName", "");
                    String optString4 = optJSONObject.optString("appAvtUrl", "");
                    String optString5 = optJSONObject.optString("appVersion", "");
                    optJSONObject.optString("appQRUrl", "");
                    String optString6 = optJSONObject.optString("appDesc", "");
                    AbstractC19074t.m100205c(optString3);
                    AbstractC19074t.m100205c(optString4);
                    AbstractC19074t.m100205c(optString5);
                    AbstractC19074t.m100205c(optString6);
                    c0862b = new C0862b(optString2, optString, optString3, optString4, optString5, new String[0], optString6, jSONObject);
                    m129218b2 = C24861r.m129218b(c0862b);
                    if (!C24861r.m129223g(m129218b2)) {
                        obj = m129218b2;
                    }
                    return (C0862b) obj;
                }
            }
        }
        c0862b = null;
        m129218b2 = C24861r.m129218b(c0862b);
        if (!C24861r.m129223g(m129218b2)) {
        }
        return (C0862b) obj;
    }

    /* renamed from: w */
    public final void m118074w(List list, List list2, long j11, int i11, StringBuilder sb2) {
        AbstractC19074t.m100208f(list, "list");
        AbstractC19074t.m100208f(list2, "arrNamesHit");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0861a interfaceC0861a = (InterfaceC0861a) it.next();
            String mo2478b = interfaceC0861a.mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            interfaceC0861a.mo2483i(interfaceC0861a.mo2479d() + m118038J(mo2478b, interfaceC0861a.mo2475c(), list2, j11, i11, sb2));
        }
    }

    /* renamed from: x */
    public final void m118075x(C19325g1 c19325g1) {
        AbstractC19074t.m100208f(c19325g1, "sessionData");
        String m101211f = c19325g1.m101211f();
        if (AbstractC19074t.m100204b(c19325g1.m101177D(), "10") && C19322f1.f95950a.m101127A() != 0) {
            C19310b1.m101066j(m101211f);
        } else {
            m118052y(m101211f);
        }
    }
}
