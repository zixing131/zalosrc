package ha0;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ai.C0862b;
import ai.InterfaceC0861a;
import am.AbstractC0924m0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTrackingLogPanelLayout;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ga0.C19322f1;
import ga0.C19325g1;
import gw.C19669z;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.C23024b7;
import on0.AbstractC24344y;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.AbstractC3552t;
import p056cj.C3549q;
import p056cj.C3551s;
import p142ey.C18644n;
import p461qu.AbstractC25495a;
import p578vk.AbstractC28275a;
import p578vk.C28278d;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;
import p716zh.C32178x9;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25332a0;
import tk.C26724c;
import tk.InterfaceC26722a;
import uk.C27286b;

/* renamed from: ha0.h */
/* loaded from: classes6.dex */
public final class C19955h {

    /* renamed from: a */
    public static final C19955h f98250a = new C19955h();

    private C19955h() {
    }

    /* renamed from: A */
    private final void m103704A(C19325g1 c19325g1) {
        if (c19325g1.m101211f().length() == 0) {
            c19325g1.m101232p0("0");
            c19325g1.m101218i0("0");
            c19325g1.m101216h0("1");
            return;
        }
        if (AbstractC19074t.m100204b(c19325g1.m101211f(), c19325g1.m101213g()) && !AbstractC19074t.m100204b(c19325g1.m101215h(), c19325g1.m101213g())) {
            c19325g1.m101208d0(c19325g1.m101213g());
            c19325g1.m101216h0("2");
        }
        if (!AbstractC19074t.m100204b(c19325g1.m101223l(), "1")) {
            c19325g1.m101218i0(c19325g1.m101223l());
            c19325g1.m101216h0("1");
        } else {
            c19325g1.m101218i0("1");
        }
        if (!AbstractC19074t.m100204b(c19325g1.m101241u(), "0") && !AbstractC19074t.m100204b(c19325g1.m101241u(), c19325g1.m101225m())) {
            c19325g1.m101218i0("3");
        }
        c19325g1.m101232p0(c19325g1.m101225m());
    }

    /* renamed from: B */
    private final int m103705B(InterfaceC26722a interfaceC26722a, C19325g1 c19325g1, int i11) {
        boolean z11 = interfaceC26722a instanceof AbstractC29069a;
        if (z11 && AbstractC19074t.m100204b(m103718k(c19325g1), "1")) {
            return ((AbstractC29069a) interfaceC26722a).m145138a().m137449f();
        }
        if (z11) {
            return ((AbstractC29069a) interfaceC26722a).m145138a().m137447d();
        }
        return i11;
    }

    /* renamed from: C */
    private final String m103706C(InterfaceC26722a interfaceC26722a, C19325g1 c19325g1) {
        int i11;
        if ((interfaceC26722a instanceof AbstractC29069a.o) && AbstractC29069a.Companion.m145171a(((AbstractC29069a.o) interfaceC26722a).m145200g(), 32768)) {
            i11 = AbstractC8020f0.str_search_global_section_highlight;
        } else {
            boolean z11 = interfaceC26722a instanceof AbstractC29069a;
            if (z11 && AbstractC19074t.m100204b(m103718k(c19325g1), "1")) {
                i11 = ((AbstractC29069a) interfaceC26722a).m145138a().m137450g();
            } else if (z11) {
                i11 = ((AbstractC29069a) interfaceC26722a).m145138a().m137451h();
            } else {
                i11 = 0;
            }
        }
        if (i11 == AbstractC8020f0.str_search_global_section_hidden_conversation) {
            return "1";
        }
        if (i11 == AbstractC8020f0.str_title_find_friend_phone) {
            return "2";
        }
        if (i11 == AbstractC8020f0.str_title_find_friend_username) {
            return "3";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_highlight) {
            return "4";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_people) {
            return "5";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_util || i11 == AbstractC8020f0.str_search_global_section_feature) {
            return "6";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_group) {
            return "7";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_oa) {
            return "8";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_stranger) {
            return "9";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_maybe_you_want_to_search) {
            return "10";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_setting) {
            return "11";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_mini_program) {
            return "12";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_followed_oa) {
            return "13";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_contacted_stranger) {
            return "14";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_discover_oa) {
            return "15";
        }
        if (i11 == AbstractC8020f0.str_search_global_section_discover_stranger) {
            return "16";
        }
        if (i11 == AbstractC29076h.x.f134837b.m145259a()) {
            return "22";
        }
        if (i11 == AbstractC29080l.c.f134883b.m145312a()) {
            return "17";
        }
        if (i11 == AbstractC29080l.g.f134887b.m145312a()) {
            return "18";
        }
        if (i11 == AbstractC29080l.e.f134885b.m145312a()) {
            return "19";
        }
        if (i11 == AbstractC29080l.f.f134886b.m145312a()) {
            return "20";
        }
        if (i11 == AbstractC29080l.d.f134884b.m145312a()) {
            return "21";
        }
        return "0";
    }

    /* renamed from: D */
    private final void m103707D(int i11, int i12, int i13, String... strArr) {
        C0815e1.m2075D().m2099U(i11, i12, i13, (String[]) Arrays.copyOf(strArr, strArr.length));
        SearchGlobalTrackingLogPanelLayout.Companion.m73464c(new AbstractC29069a.x(i11, i12, i13, strArr));
    }

    /* renamed from: h */
    private final String m103715h(InterfaceC26722a interfaceC26722a) {
        C3551s c3551s;
        C3549q c3549q;
        String str;
        if (interfaceC26722a instanceof AbstractC29069a.o) {
            return ((AbstractC29069a.o) interfaceC26722a).m145201h().toString();
        }
        if (interfaceC26722a instanceof AbstractC29069a.v) {
            return String.valueOf(((AbstractC29069a.v) interfaceC26722a).m145224d());
        }
        if (interfaceC26722a instanceof AbstractC29069a.m) {
            return ((AbstractC29069a.m) interfaceC26722a).m145192b().m2489o().toString();
        }
        if (interfaceC26722a instanceof AbstractC28275a.b) {
            return ((AbstractC28275a.b) interfaceC26722a).m142476d().toString();
        }
        if (interfaceC26722a instanceof AbstractC29069a.a) {
            StringBuilder sb2 = new StringBuilder();
            AbstractC29069a.a aVar = (AbstractC29069a.a) interfaceC26722a;
            AbstractC3552t m18034a = aVar.m145142f().m18034a();
            String str2 = null;
            if (m18034a != null) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                if (m18034a instanceof C3549q) {
                    c3549q = (C3549q) m18034a;
                } else {
                    c3549q = null;
                }
                if (c3549q != null) {
                    str = c3549q.m18040c();
                } else {
                    str = null;
                }
                sb2.append(str);
            }
            AbstractC3552t m18035b = aVar.m145142f().m18035b();
            if (m18035b != null) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                if (m18035b instanceof C3551s) {
                    c3551s = (C3551s) m18035b;
                } else {
                    c3551s = null;
                }
                if (c3551s != null) {
                    str2 = c3551s.m18047b();
                }
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            AbstractC19074t.m100205c(sb3);
            return sb3;
        }
        return "";
    }

    /* renamed from: i */
    private final int m103716i(InterfaceC26722a interfaceC26722a) {
        char m127205d1;
        if (interfaceC26722a instanceof AbstractC28275a.b) {
            InterfaceC0861a m142475c = ((AbstractC28275a.b) interfaceC26722a).m142475c();
            if (AbstractC25495a.m132081f(m142475c.mo2478b()) || AbstractC25495a.m132084i(m142475c.mo2478b()) || AbstractC25495a.m132078c(m142475c.mo2478b()) || AbstractC25495a.m132087l(m142475c.mo2478b())) {
                return 5;
            }
            if (!AbstractC25495a.m132079d(m142475c.mo2478b())) {
                if (!(m142475c instanceof ContactProfile) || !((ContactProfile) m142475c).m40387S0()) {
                    if (!C18644n.m98531l().m98558u(m142475c.mo2478b())) {
                        if (!AbstractC23063f2.m118360l(m142475c.mo2478b())) {
                            if (!AbstractC23063f2.m118359k(m142475c.mo2478b())) {
                                if (!(m142475c instanceof C0862b)) {
                                    String mo2478b = m142475c.mo2478b();
                                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                                    m127205d1 = AbstractC24344y.m127205d1(mo2478b);
                                    if (!Character.isDigit(m127205d1)) {
                                        return 6;
                                    }
                                    return 0;
                                }
                                return 12;
                            }
                            return 7;
                        }
                        return 8;
                    }
                    return 1;
                }
                return 2;
            }
            return 3;
        }
        if (interfaceC26722a instanceof AbstractC29069a.o) {
            AbstractC29069a.o oVar = (AbstractC29069a.o) interfaceC26722a;
            if (AbstractC29069a.Companion.m145171a(oVar.m145200g(), 8)) {
                return 5;
            }
            if ((oVar.m145200g() & 2) == 0) {
                if (!AbstractC23063f2.m118360l(oVar.m145198e().mo2478b())) {
                    if (!AbstractC23063f2.m118359k(oVar.m145198e().mo2478b())) {
                        if ((oVar.m145200g() & 32) == 0) {
                            if ((oVar.m145200g() & 4) == 0) {
                                if ((oVar.m145200g() & 16) != 0) {
                                    return 2;
                                }
                            }
                            return 3;
                        }
                        return 6;
                    }
                    return 7;
                }
                return 8;
            }
            return 1;
        }
        if ((interfaceC26722a instanceof AbstractC29069a.k) || (interfaceC26722a instanceof AbstractC29069a.a)) {
            return 4;
        }
        if (interfaceC26722a instanceof AbstractC29069a.e) {
            return 9;
        }
        if (interfaceC26722a instanceof AbstractC29069a.j) {
            return 10;
        }
        if (!(interfaceC26722a instanceof AbstractC29069a.m)) {
            if (interfaceC26722a instanceof AbstractC29069a.v) {
                return 11;
            }
        }
        return 12;
        return 0;
    }

    /* renamed from: j */
    private final int m103717j(C19325g1 c19325g1) {
        if (c19325g1.m101247x().m145291s().mo145251y0().m145178d() != 15) {
            return 1;
        }
        return 0;
    }

    /* renamed from: k */
    private final String m103718k(C19325g1 c19325g1) {
        if (c19325g1.m101247x().m145291s().mo145251y0().m145179e() != null) {
            return "9";
        }
        int m101207d = c19325g1.m101207d();
        if (m101207d == AbstractC8020f0.str_search_global_tab_all) {
            return "1";
        }
        if (m101207d == AbstractC8020f0.str_search_global_tab_contact) {
            return "2";
        }
        if (m101207d == AbstractC8020f0.str_search_global_tab_message) {
            return "5";
        }
        if (m101207d == AbstractC8020f0.str_search_global_tab_file) {
            return "6";
        }
        if (m101207d == AbstractC8020f0.str_search_global_tab_link) {
            return "7";
        }
        if (m101207d == AbstractC8020f0.str_search_global_tab_discover) {
            return "8";
        }
        return "0";
    }

    /* renamed from: l */
    private final String m103719l(InterfaceC0861a interfaceC0861a) {
        if (AbstractC19074t.m100204b(interfaceC0861a.mo2478b(), "-8")) {
            return "MediaBoxUid";
        }
        if (AbstractC19074t.m100204b(interfaceC0861a.mo2478b(), "-2")) {
            return "MessagesFromStrangersUid";
        }
        if (interfaceC0861a instanceof C0862b) {
            return ((C0862b) interfaceC0861a).m2487m();
        }
        if (interfaceC0861a instanceof C32178x9) {
            return String.valueOf(((C32178x9) interfaceC0861a).f148384r);
        }
        if (AbstractC25495a.m132079d(interfaceC0861a.mo2478b())) {
            return AbstractC25495a.m132088m(interfaceC0861a.mo2478b());
        }
        String mo2478b = interfaceC0861a.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        return mo2478b;
    }

    /* renamed from: n */
    public static final void m103720n(C19325g1 c19325g1) {
        Object m129218b;
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        try {
            C24861r.a aVar = C24861r.f119264q;
            C19955h c19955h = f98250a;
            String m103718k = c19955h.m103718k(c19325g1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tab_id", m103718k);
            jSONObject.put("session_id", String.valueOf(c19325g1.m101251z()));
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c19955h.m103707D(3, 13, 33, "1", c19325g1.m101201a(), c19325g1.m101211f(), String.valueOf(System.currentTimeMillis() - c19325g1.m101251z()), jSONObject2, "", "", "");
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* renamed from: p */
    public static final void m103721p(C19325g1 c19325g1) {
        Object m129218b;
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        C19955h c19955h = f98250a;
        try {
            C24861r.a aVar = C24861r.f119264q;
            c19955h.m103704A(c19325g1);
            String m101211f = c19325g1.m101211f();
            if (m101211f.length() != 0) {
                C28278d m101243v = c19325g1.m101243v();
                String m101225m = c19325g1.m101225m();
                String m103718k = c19955h.m103718k(c19325g1);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("session_id", String.valueOf(c19325g1.m101251z()));
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "let(...)");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("searched_contacts", m101243v.m142515c()[0] ? 1 : 0);
                jSONObject3.put("searched_queries", m101243v.m142515c()[1] ? 1 : 0);
                jSONObject3.put("quick_access", m101243v.m142515c()[2] ? 1 : 0);
                String jSONObject4 = jSONObject3.toString();
                AbstractC19074t.m100207e(jSONObject4, "let(...)");
                c19955h.m103707D(3, 11, 33, "1", m101225m, m101211f, m103718k, jSONObject2, jSONObject4, "", "");
            }
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* renamed from: r */
    public static final void m103722r(C19325g1 c19325g1, String str, String str2) {
        Object m129218b;
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        AbstractC19074t.m100208f(str, "$position");
        AbstractC19074t.m100208f(str2, "$openSourceAction");
        C19955h c19955h = f98250a;
        try {
            C24861r.a aVar = C24861r.f119264q;
            long m4251u6 = AbstractC0924m0.m4251u6();
            if (m4251u6 > 0) {
                m4251u6 = System.currentTimeMillis() - m4251u6;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", String.valueOf(c19325g1.m101251z()));
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c19955h.m103707D(3, 10, 33, "1", str, str2, String.valueOf(m4251u6), jSONObject2, "", "", "");
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:2|3|(1:5)(2:82|(1:84)(2:85|(1:87)(2:88|(1:90)(28:(2:92|(26:94|(1:96)|97|7|(1:9)(2:72|(1:74)(2:75|(1:77)(2:78|(1:80)(1:81))))|(2:65|(1:67)(2:68|(1:70)(1:71)))|13|(1:15)|16|17|(1:19)(2:61|(1:63)(1:64))|20|(1:22)(1:60)|23|24|(1:26)(1:56)|27|28|(1:30)|31|(3:33|(1:35)(1:37)|36)|38|39|(2:41|(1:43)(2:44|(1:46)(2:47|(1:49)(1:50))))|51|53))|98|97|7|(0)(0)|(1:11)|65|(0)(0)|13|(0)|16|17|(0)(0)|20|(0)(0)|23|24|(0)(0)|27|28|(0)|31|(0)|38|39|(0)|51|53))))|6|7|(0)(0)|(0)|65|(0)(0)|13|(0)|16|17|(0)(0)|20|(0)(0)|23|24|(0)(0)|27|28|(0)|31|(0)|38|39|(0)|51|53) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ab, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b4, code lost:            r3 = pm0.C24861r.f119264q;        r0 = pm0.C24861r.m129218b(pm0.AbstractC24862s.m129227a(r0));     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x010b A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015a A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0189 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a2 A[Catch: all -> 0x01ab, TryCatch #0 {all -> 0x01ab, blocks: (B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:23:0x019a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01db A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021c A[Catch: Exception -> 0x0043, TRY_ENTER, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b0 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:3:0x0012, B:5:0x0036, B:6:0x0041, B:7:0x00ac, B:9:0x00b0, B:11:0x010b, B:13:0x013b, B:15:0x015a, B:16:0x0163, B:20:0x0183, B:22:0x0189, B:28:0x01be, B:31:0x01c7, B:33:0x01db, B:36:0x01fb, B:38:0x020a, B:41:0x021c, B:44:0x0223, B:47:0x0229, B:51:0x0232, B:59:0x01b4, B:60:0x018e, B:61:0x0179, B:64:0x017f, B:65:0x0111, B:67:0x0115, B:68:0x0125, B:70:0x0129, B:72:0x00c0, B:74:0x00c4, B:75:0x00d8, B:77:0x00dc, B:78:0x00f0, B:80:0x00f4, B:82:0x0046, B:84:0x004a, B:85:0x005a, B:87:0x005e, B:88:0x006e, B:90:0x0072, B:92:0x0084, B:94:0x0099, B:96:0x00a3, B:24:0x019a, B:26:0x01a2, B:27:0x01af), top: B:2:0x0012, inners: #0 }] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m103723t(C19325g1 c19325g1, InterfaceC26722a interfaceC26722a, int i11, int i12) {
        long j11;
        long j12;
        long m41008l;
        Long l11;
        String str;
        String m103718k;
        String m101225m;
        int size;
        Object m129218b;
        int i13;
        String str2;
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        AbstractC19074t.m100208f(interfaceC26722a, "$dataItem");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String m101211f = c19325g1.m101211f();
            C19955h c19955h = f98250a;
            int m103716i = c19955h.m103716i(interfaceC26722a);
            int m103705B = c19955h.m103705B(interfaceC26722a, c19325g1, i11);
            long m101251z = currentTimeMillis - c19325g1.m101251z();
            InterfaceC0861a m118067o = C23024b7.f111993a.m118067o(interfaceC26722a);
            if (interfaceC26722a instanceof AbstractC29069a.k) {
                m41008l = ((AbstractC29069a.k) interfaceC26722a).m145188d().f147411b.f42330D;
            } else if (interfaceC26722a instanceof AbstractC29069a.e) {
                m41008l = ((AbstractC29069a.e) interfaceC26722a).m145174b().m40599m().m95313z4();
            } else if (interfaceC26722a instanceof AbstractC29069a.j) {
                m41008l = ((AbstractC29069a.j) interfaceC26722a).m145186b().m40599m().m95313z4();
            } else if (interfaceC26722a instanceof AbstractC29069a.a) {
                m41008l = ((AbstractC29069a.a) interfaceC26722a).m145142f().m18037d().m18057f();
            } else {
                if (m118067o != null) {
                    C19669z m103232a = C19669z.Companion.m103232a();
                    String mo2478b = m118067o.mo2478b();
                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                    Conversation m103202S = m103232a.m103202S(mo2478b);
                    if (m103202S != null) {
                        j11 = 0;
                        if (m103202S.m41008l() > 0) {
                            m41008l = m103202S.m41008l();
                        }
                        j12 = j11;
                        if (interfaceC26722a instanceof AbstractC29069a.k) {
                            l11 = Long.valueOf(((AbstractC29069a.k) interfaceC26722a).m145188d().f147411b.f42330D);
                        } else if (interfaceC26722a instanceof AbstractC29069a.e) {
                            l11 = Long.valueOf(((AbstractC29069a.e) interfaceC26722a).m145174b().m40599m().m95313z4());
                        } else if (interfaceC26722a instanceof AbstractC29069a.j) {
                            l11 = Long.valueOf(((AbstractC29069a.j) interfaceC26722a).m145186b().m40599m().m95313z4());
                        } else if (interfaceC26722a instanceof AbstractC29069a.a) {
                            l11 = Long.valueOf(((AbstractC29069a.a) interfaceC26722a).m145142f().m18037d().m18057f());
                        } else {
                            l11 = null;
                        }
                        if (m118067o != null || (str = c19955h.m103719l(m118067o)) == null) {
                            if (interfaceC26722a instanceof AbstractC29069a.e) {
                                str = ((AbstractC29069a.e) interfaceC26722a).m145174b().m40599m().m94862C4();
                            } else if (interfaceC26722a instanceof AbstractC29069a.j) {
                                str = ((AbstractC29069a.j) interfaceC26722a).m145186b().m40599m().m94862C4();
                            } else {
                                str = "";
                            }
                        }
                        m103718k = c19955h.m103718k(c19325g1);
                        String m103706C = c19955h.m103706C(interfaceC26722a, c19325g1);
                        int m103717j = c19955h.m103717j(c19325g1);
                        long j13 = j12;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("uid", str);
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, m103716i);
                        if (l11 != null) {
                            jSONObject.put("msg_time", l11.longValue());
                        }
                        jSONObject.put("session_id", String.valueOf(c19325g1.m101251z()));
                        String str3 = "6";
                        if (interfaceC26722a instanceof AbstractC28275a.g) {
                            m101225m = "5";
                        } else if (interfaceC26722a instanceof AbstractC28275a.n) {
                            m101225m = "6";
                        } else {
                            m101225m = c19325g1.m101225m();
                        }
                        if (!AbstractC19074t.m100204b(m103718k, "9")) {
                            size = c19325g1.m101209e();
                        } else {
                            size = c19325g1.m101247x().m145265C().size();
                        }
                        C24861r.a aVar = C24861r.f119264q;
                        if (!AbstractC19074t.m100204b(m103718k, "9")) {
                            str2 = AbstractC23136l9.m118743r0(c19325g1.m101207d());
                        } else {
                            str2 = "SubScreen";
                        }
                        m129218b = C24861r.m129218b(str2);
                        if (C24861r.m129223g(m129218b)) {
                            m129218b = "Unknown";
                        }
                        AbstractC19074t.m100207e(m129218b, "getOrDefault(...)");
                        String str4 = (String) m129218b;
                        JSONObject jSONObject2 = new JSONObject();
                        if (interfaceC26722a instanceof AbstractC29069a) {
                            jSONObject2.put("item_index", m103705B);
                            jSONObject2.put("tab_index", size);
                            jSONObject2.put("tab_name", str4);
                            jSONObject2.put("tab_id", m103718k);
                            jSONObject2.put("section_id", m103706C);
                            if (size > 0) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            jSONObject2.put("is_more", i13);
                            jSONObject2.put("is_filter", m103717j);
                            jSONObject2.put("tap_type", i12);
                        }
                        C19955h c19955h2 = f98250a;
                        jSONObject2.put("content", c19955h2.m103715h(interfaceC26722a));
                        if (!(interfaceC26722a instanceof AbstractC29069a.s)) {
                            if (interfaceC26722a instanceof AbstractC29069a) {
                                str3 = "3";
                            } else if (interfaceC26722a instanceof AbstractC28275a.g) {
                                str3 = "1";
                            } else if (interfaceC26722a instanceof AbstractC28275a.n) {
                                str3 = "7";
                            } else {
                                str3 = "0";
                            }
                        }
                        String jSONObject3 = jSONObject.toString();
                        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                        String jSONObject4 = jSONObject2.toString();
                        AbstractC19074t.m100207e(jSONObject4, "toString(...)");
                        c19955h2.m103707D(3, 12, 33, "1", m101211f, m101225m, str3, jSONObject3, jSONObject4, String.valueOf(m101251z), String.valueOf(j13));
                    }
                }
                j11 = 0;
                j12 = j11;
                if (interfaceC26722a instanceof AbstractC29069a.k) {
                }
                if (m118067o != null) {
                }
                if (interfaceC26722a instanceof AbstractC29069a.e) {
                }
                m103718k = c19955h.m103718k(c19325g1);
                String m103706C2 = c19955h.m103706C(interfaceC26722a, c19325g1);
                int m103717j2 = c19955h.m103717j(c19325g1);
                long j132 = j12;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("uid", str);
                jSONObject5.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, m103716i);
                if (l11 != null) {
                }
                jSONObject5.put("session_id", String.valueOf(c19325g1.m101251z()));
                String str32 = "6";
                if (interfaceC26722a instanceof AbstractC28275a.g) {
                }
                if (!AbstractC19074t.m100204b(m103718k, "9")) {
                }
                C24861r.a aVar2 = C24861r.f119264q;
                if (!AbstractC19074t.m100204b(m103718k, "9")) {
                }
                m129218b = C24861r.m129218b(str2);
                if (C24861r.m129223g(m129218b)) {
                }
                AbstractC19074t.m100207e(m129218b, "getOrDefault(...)");
                String str42 = (String) m129218b;
                JSONObject jSONObject22 = new JSONObject();
                if (interfaceC26722a instanceof AbstractC29069a) {
                }
                C19955h c19955h22 = f98250a;
                jSONObject22.put("content", c19955h22.m103715h(interfaceC26722a));
                if (!(interfaceC26722a instanceof AbstractC29069a.s)) {
                }
                String jSONObject32 = jSONObject5.toString();
                AbstractC19074t.m100207e(jSONObject32, "toString(...)");
                String jSONObject42 = jSONObject22.toString();
                AbstractC19074t.m100207e(jSONObject42, "toString(...)");
                c19955h22.m103707D(3, 12, 33, "1", m101211f, m101225m, str32, jSONObject32, jSONObject42, String.valueOf(m101251z), String.valueOf(j132));
            }
            j12 = currentTimeMillis - m41008l;
            if (interfaceC26722a instanceof AbstractC29069a.k) {
            }
            if (m118067o != null) {
            }
            if (interfaceC26722a instanceof AbstractC29069a.e) {
            }
            m103718k = c19955h.m103718k(c19325g1);
            String m103706C22 = c19955h.m103706C(interfaceC26722a, c19325g1);
            int m103717j22 = c19955h.m103717j(c19325g1);
            long j1322 = j12;
            JSONObject jSONObject52 = new JSONObject();
            jSONObject52.put("uid", str);
            jSONObject52.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, m103716i);
            if (l11 != null) {
            }
            jSONObject52.put("session_id", String.valueOf(c19325g1.m101251z()));
            String str322 = "6";
            if (interfaceC26722a instanceof AbstractC28275a.g) {
            }
            if (!AbstractC19074t.m100204b(m103718k, "9")) {
            }
            C24861r.a aVar22 = C24861r.f119264q;
            if (!AbstractC19074t.m100204b(m103718k, "9")) {
            }
            m129218b = C24861r.m129218b(str2);
            if (C24861r.m129223g(m129218b)) {
            }
            AbstractC19074t.m100207e(m129218b, "getOrDefault(...)");
            String str422 = (String) m129218b;
            JSONObject jSONObject222 = new JSONObject();
            if (interfaceC26722a instanceof AbstractC29069a) {
            }
            C19955h c19955h222 = f98250a;
            jSONObject222.put("content", c19955h222.m103715h(interfaceC26722a));
            if (!(interfaceC26722a instanceof AbstractC29069a.s)) {
            }
            String jSONObject322 = jSONObject52.toString();
            AbstractC19074t.m100207e(jSONObject322, "toString(...)");
            String jSONObject422 = jSONObject222.toString();
            AbstractC19074t.m100207e(jSONObject422, "toString(...)");
            c19955h222.m103707D(3, 12, 33, "1", m101211f, m101225m, str322, jSONObject322, jSONObject422, String.valueOf(m101251z), String.valueOf(j1322));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public static final void m103724v(C19325g1 c19325g1, String str) {
        Object m129218b;
        int size;
        Object m129218b2;
        String str2;
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        AbstractC19074t.m100208f(str, "$outputType");
        try {
            C24861r.a aVar = C24861r.f119264q;
            long currentTimeMillis = System.currentTimeMillis();
            String m101211f = c19325g1.m101211f();
            long m101251z = currentTimeMillis - c19325g1.m101251z();
            String m103718k = f98250a.m103718k(c19325g1);
            if (!AbstractC19074t.m100204b(m103718k, "9")) {
                size = c19325g1.m101209e();
            } else {
                size = c19325g1.m101247x().m145265C().size();
            }
            try {
                if (!AbstractC19074t.m100204b(m103718k, "9")) {
                    str2 = AbstractC23136l9.m118743r0(c19325g1.m101207d());
                } else {
                    str2 = "SubScreen";
                }
                m129218b2 = C24861r.m129218b(str2);
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b2)) {
                m129218b2 = "Unknown";
            }
            AbstractC19074t.m100207e(m129218b2, "getOrDefault(...)");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", String.valueOf(c19325g1.m101251z()));
            jSONObject.put("tab_id", m103718k);
            jSONObject.put("tab_index", size);
            jSONObject.put("tab_name", (String) m129218b2);
            C19955h c19955h = f98250a;
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c19955h.m103707D(3, 12, 33, "1", m101211f, c19325g1.m101225m(), str, jSONObject2, "", String.valueOf(m101251z), "");
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th3) {
            C24861r.a aVar3 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th3));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* renamed from: x */
    public static final void m103725x(InterfaceC26722a interfaceC26722a, C19325g1 c19325g1, String str) {
        String str2;
        AbstractC19074t.m100208f(interfaceC26722a, "$contact");
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        AbstractC19074t.m100208f(str, "$outputType");
        try {
            C19955h c19955h = f98250a;
            int m103716i = c19955h.m103716i(interfaceC26722a);
            JSONObject jSONObject = new JSONObject();
            InterfaceC0861a m118067o = C23024b7.f111993a.m118067o(interfaceC26722a);
            if (m118067o != null) {
                str2 = c19955h.m103719l(m118067o);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                jSONObject.put("uid", str2);
            }
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, m103716i);
            jSONObject.put("session_id", String.valueOf(c19325g1.m101251z()));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("item_index", interfaceC26722a);
            jSONObject2.put("tab_index", 0);
            jSONObject2.put("is_more", 0);
            String jSONObject3 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            String jSONObject4 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject4, "toString(...)");
            String jSONObject5 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject5, "toString(...)");
            c19955h.m103707D(3, 14, 33, "1", str, jSONObject3, jSONObject4, jSONObject5, "", "", "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    public static final void m103726z(C28278d c28278d, String str, String str2, C27286b c27286b) {
        String str3;
        String str4;
        List<AbstractC28275a.d> m131185M0;
        int i11;
        int i12;
        AbstractC19074t.m100208f(str, "$param2");
        AbstractC19074t.m100208f(str2, "$param3");
        C19955h c19955h = f98250a;
        try {
            C24861r.a aVar = C24861r.f119264q;
            int i13 = 4;
            if (c28278d != null && AbstractC19074t.m100204b(str, "1") && AbstractC19074t.m100204b(str2, "1")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("save_searched_contacts", C19322f1.m101117F() ? 1 : 0);
                C19322f1 c19322f1 = C19322f1.f95950a;
                jSONObject.put("save_searched_queries", c19322f1.m101132G() ? 1 : 0);
                if (!c19322f1.m101168y()) {
                    i12 = 2;
                } else if (c19322f1.m101133H()) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                jSONObject.put("show_quick_access", i12);
                str4 = jSONObject.toString();
                AbstractC19074t.m100207e(str4, "run(...)");
                str3 = "";
            } else if (c27286b == null || !AbstractC19074t.m100204b(str, "2")) {
                str3 = "";
                str4 = str3;
            } else {
                JSONArray jSONArray = new JSONArray();
                m131185M0 = AbstractC25332a0.m131185M0(c27286b.m139687e());
                for (AbstractC28275a.d dVar : m131185M0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c19955h.m103719l(dVar.m142475c()));
                    C26724c c26724c = C26724c.f126750a;
                    if (c26724c.m137453a(dVar.m142477e(), 2)) {
                        i11 = 1;
                    } else if (c26724c.m137453a(dVar.m142477e(), i13)) {
                        i11 = 2;
                    } else if (c26724c.m137453a(dVar.m142477e(), 16)) {
                        i11 = 3;
                    } else if (c26724c.m137453a(dVar.m142477e(), 4194304)) {
                        i11 = 5;
                    } else if (c26724c.m137453a(dVar.m142477e(), 8)) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
                    jSONArray.put(jSONObject2);
                    i13 = 4;
                }
                str3 = jSONArray.toString();
                AbstractC19074t.m100207e(str3, "toString(...)");
                str4 = "";
            }
            c19955h.m103707D(3, 15, 33, "1", str, str2, str3, str4, "", "", "");
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /* renamed from: m */
    public final void m103727m(C19325g1 c19325g1) {
        AbstractC19074t.m100208f(c19325g1, "sessionData");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ha0.d
            public /* synthetic */ RunnableC19951d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19955h.m103720n(C19325g1.this);
            }
        });
    }

    /* renamed from: o */
    public final void m103728o(C19325g1 c19325g1) {
        AbstractC19074t.m100208f(c19325g1, "sessionData");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ha0.g
            public /* synthetic */ RunnableC19954g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19955h.m103721p(C19325g1.this);
            }
        });
    }

    /* renamed from: q */
    public final void m103729q(C19325g1 c19325g1, String str, String str2) {
        AbstractC19074t.m100208f(c19325g1, "sessionData");
        AbstractC19074t.m100208f(str, "position");
        AbstractC19074t.m100208f(str2, "openSourceAction");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ha0.b

            /* renamed from: q */
            public final /* synthetic */ String f98237q;

            /* renamed from: r */
            public final /* synthetic */ String f98238r;

            public /* synthetic */ RunnableC19949b(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19955h.m103722r(C19325g1.this, r2, r3);
            }
        });
    }

    /* renamed from: s */
    public final void m103730s(C19325g1 c19325g1, InterfaceC26722a interfaceC26722a, int i11, int i12) {
        AbstractC19074t.m100208f(c19325g1, "sessionData");
        AbstractC19074t.m100208f(interfaceC26722a, "dataItem");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ha0.c

            /* renamed from: q */
            public final /* synthetic */ InterfaceC26722a f98240q;

            /* renamed from: r */
            public final /* synthetic */ int f98241r;

            /* renamed from: s */
            public final /* synthetic */ int f98242s;

            public /* synthetic */ RunnableC19950c(InterfaceC26722a interfaceC26722a2, int i112, int i122) {
                r2 = interfaceC26722a2;
                r3 = i112;
                r4 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19955h.m103723t(C19325g1.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: u */
    public final void m103731u(C19325g1 c19325g1, String str) {
        AbstractC19074t.m100208f(c19325g1, "sessionData");
        AbstractC19074t.m100208f(str, "outputType");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ha0.f

            /* renamed from: q */
            public final /* synthetic */ String f98248q;

            public /* synthetic */ RunnableC19953f(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19955h.m103724v(C19325g1.this, r2);
            }
        });
    }

    /* renamed from: w */
    public final void m103732w(C19325g1 c19325g1, InterfaceC26722a interfaceC26722a, String str) {
        AbstractC19074t.m100208f(c19325g1, "sessionData");
        AbstractC19074t.m100208f(interfaceC26722a, "contact");
        AbstractC19074t.m100208f(str, "outputType");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ha0.e

            /* renamed from: q */
            public final /* synthetic */ C19325g1 f98245q;

            /* renamed from: r */
            public final /* synthetic */ String f98246r;

            public /* synthetic */ RunnableC19952e(C19325g1 c19325g12, String str2) {
                r2 = c19325g12;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19955h.m103725x(InterfaceC26722a.this, r2, r3);
            }
        });
    }

    /* renamed from: y */
    public final void m103733y(C28278d c28278d, C27286b c27286b, String str, String str2) {
        AbstractC19074t.m100208f(str, "param2");
        AbstractC19074t.m100208f(str2, "param3");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ha0.a

            /* renamed from: q */
            public final /* synthetic */ String f98233q;

            /* renamed from: r */
            public final /* synthetic */ String f98234r;

            /* renamed from: s */
            public final /* synthetic */ C27286b f98235s;

            public /* synthetic */ RunnableC19948a(String str3, String str22, C27286b c27286b2) {
                r2 = str3;
                r3 = str22;
                r4 = c27286b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19955h.m103726z(C28278d.this, r2, r3, r4);
            }
        });
    }
}
