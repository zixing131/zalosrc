package ga0;

import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.C19669z;
import ha0.C19955h;
import me0.C23024b7;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p578vk.AbstractC28275a;
import p604wb.C28905e;
import p612wk.AbstractC29069a;
import p716zh.C31874cb;
import p716zh.C31973j5;
import p716zh.C32002l4;
import pm0.C24848g0;
import tk.InterfaceC26722a;
import v50.C27870vb;
import vg.C28203u6;

/* renamed from: ga0.d0 */
/* loaded from: classes6.dex */
public final class C19315d0 extends AbstractRunnableC19355q1 {

    /* renamed from: s */
    private final String f95914s;

    /* renamed from: t */
    private final InterfaceC26722a f95915t;

    /* renamed from: u */
    private final int f95916u;

    /* renamed from: v */
    private final boolean f95917v;

    /* renamed from: ga0.d0$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f95918a;

        /* renamed from: b */
        final /* synthetic */ C19325g1 f95919b;

        /* renamed from: c */
        final /* synthetic */ C19315d0 f95920c;

        a(ContactProfile contactProfile, C19325g1 c19325g1, C19315d0 c19315d0) {
            this.f95918a = contactProfile;
            this.f95919b = c19325g1;
            this.f95920c = c19315d0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42230P7(this.f95918a.f42434r, System.currentTimeMillis());
            C7960e.m41971c6().m42211N7(this.f95918a.f42434r, System.currentTimeMillis());
            if (C28203u6.m141798e(C28203u6.f131407a, this.f95918a.f42434r, null, 2, null) == null) {
                C7960e m41971c6 = C7960e.m41971c6();
                ContactProfile contactProfile = this.f95918a;
                m41971c6.m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
            }
            C23024b7.f111993a.m118075x(this.f95919b);
            this.f95920c.m101086o();
        }
    }

    /* renamed from: ga0.d0$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ C19325g1 f95922b;

        /* renamed from: c */
        final /* synthetic */ ContactProfile f95923c;

        /* renamed from: d */
        final /* synthetic */ String f95924d;

        b(C19325g1 c19325g1, ContactProfile contactProfile, String str) {
            this.f95922b = c19325g1;
            this.f95923c = contactProfile;
            this.f95924d = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            if (!(C19315d0.this.m101088n() instanceof AbstractC29069a.l) && !(C19315d0.this.m101088n() instanceof AbstractC28275a.n)) {
                if (AbstractC19074t.m100204b(this.f95922b.m101177D(), "10") && C19322f1.f95950a.m101127A() != 0) {
                    C19310b1.m101067k(this.f95923c);
                } else {
                    C7960e.m41971c6().m42230P7(this.f95923c.f42434r, System.currentTimeMillis());
                }
                C7960e.m41971c6().m42211N7(this.f95923c.f42434r, System.currentTimeMillis());
                if (!this.f95923c.m40374K0() && C28203u6.m141798e(C28203u6.f131407a, this.f95923c.f42434r, null, 2, null) == null) {
                    C7960e m41971c6 = C7960e.m41971c6();
                    ContactProfile contactProfile = this.f95923c;
                    m41971c6.m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
                }
                C7960e m41971c62 = C7960e.m41971c6();
                String str = this.f95924d;
                ContactProfile contactProfile2 = this.f95923c;
                m41971c62.m42423i8(str, contactProfile2.f42434r, contactProfile2.m40383Q(true, false), this.f95923c.f42365O1);
            }
            if (!(C19315d0.this.m101088n() instanceof AbstractC28275a.n)) {
                C23024b7.f111993a.m118075x(this.f95922b);
            }
            C19315d0.this.m101086o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19315d0(InterfaceC18319c interfaceC18319c, String str, InterfaceC26722a interfaceC26722a, int i11, boolean z11) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(interfaceC26722a, "item");
        this.f95914s = str;
        this.f95915t = interfaceC26722a;
        this.f95916u = i11;
        this.f95917v = z11;
    }

    /* renamed from: o */
    public final void m101086o() {
        AbstractC19444a.m101694b(new Runnable() { // from class: ga0.c0
            public /* synthetic */ RunnableC19312c0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19315d0.m101087p(C19315d0.this);
            }
        }, 125L);
    }

    /* renamed from: p */
    public static final void m101087p(C19315d0 c19315d0) {
        AbstractC19074t.m100208f(c19315d0, "this$0");
        c19315d0.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* renamed from: n */
    public final InterfaceC26722a m101088n() {
        return this.f95915t;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x05f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0348  */
    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        CharSequence m127168X0;
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        String str;
        String str2;
        String str3;
        String str4;
        int i11;
        Object obj;
        Integer num;
        boolean z11;
        MessageId m41065d;
        MessageId m41065d2;
        C18316b c18316b;
        m127168X0 = AbstractC24342w.m127168X0(this.f95914s);
        String obj2 = m127168X0.toString();
        C23024b7 c23024b7 = C23024b7.f111993a;
        ContactProfile m118066m = c23024b7.m118066m(this.f95915t);
        if (m118066m == null) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
        C19325g1 c19325g1 = (C19325g1) ((m101438e == null || (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) == null) ? null : c18316b.m97245a());
        if (c19325g1 == null) {
            return;
        }
        boolean z12 = (c19325g1.m101221k().length() > 0 && this.f95914s.length() == 4 && AbstractC19074t.m100204b(c19325g1.m101221k(), AbstractC23352g.m122788d(this.f95914s))) ? false : true;
        String str5 = m118066m.f42434r;
        AbstractC19074t.m100207e(str5, "uid");
        m127120J = AbstractC24341v.m127120J(str5, "@devtool:52s1kx:", false, 2, null);
        if (m127120J) {
            m101440g(new C18316b("ACTION_OPEN_OPEN_DEV_TOOL", m118066m.f42437s, m118066m.f42434r, null, 8, null));
        } else if (AbstractC19074t.m100204b(m118066m.f42434r, "-11")) {
            m101440g(new C18316b("ACTION_OPEN_SEARCH_FIELD", m118066m, null, null, 12, null));
        } else if (AbstractC25495a.m132081f(m118066m.f42434r)) {
            m101440g(new C18316b("ACTION_OPEN_OA_VIEW", null, null, null, 14, null));
            if (!(this.f95915t instanceof AbstractC28275a.n)) {
                C7960e.m41971c6().m42230P7(m118066m.f42434r, System.currentTimeMillis());
                C7960e.m41971c6().m42211N7(m118066m.f42434r, System.currentTimeMillis());
                C7960e.m41971c6().m42423i8(obj2, m118066m.f42434r, m118066m.m40383Q(true, false), m118066m.f42365O1);
                c23024b7.m118075x(c19325g1);
                m101086o();
            }
        } else if (AbstractC25495a.m132084i(m118066m.f42434r)) {
            m101440g(new C18316b("ACTION_OPEN_STRANGER_BOX_VIEW", null, null, null, 14, null));
            if (!(this.f95915t instanceof AbstractC28275a.n)) {
                C7960e.m41971c6().m42230P7(m118066m.f42434r, System.currentTimeMillis());
                C7960e.m41971c6().m42211N7(m118066m.f42434r, System.currentTimeMillis());
                C7960e.m41971c6().m42423i8(obj2, m118066m.f42434r, m118066m.m40383Q(true, false), m118066m.f42365O1);
                c23024b7.m118075x(c19325g1);
                m101086o();
            }
        } else if (AbstractC25495a.m132087l(m118066m.f42434r)) {
            String str6 = this.f95915t instanceof AbstractC28275a.n ? "quick_access_search" : "";
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str6);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("item_index", this.f95916u);
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject2.put("info", jSONObject3);
            jSONObject.put("source", jSONObject2);
            m101440g(new C18316b("ACTION_OPEN_ZALO_VIDEO", jSONObject.toString(), null, null, 12, null));
        } else {
            String str7 = m118066m.f42434r;
            AbstractC19074t.m100207e(str7, "uid");
            m127120J2 = AbstractC24341v.m127120J(str7, "-", false, 2, null);
            if (!m127120J2) {
                String str8 = m118066m.f42434r;
                AbstractC19074t.m100207e(str8, "uid");
                m127120J3 = AbstractC24341v.m127120J(str8, "/", false, 2, null);
                if (!m127120J3) {
                    InterfaceC26722a interfaceC26722a = this.f95915t;
                    if (interfaceC26722a instanceof AbstractC29069a.o) {
                        AbstractC29069a.b bVar = AbstractC29069a.Companion;
                        if (bVar.m145171a(((AbstractC29069a.o) interfaceC26722a).m145200g(), 134217728) || bVar.m145171a(((AbstractC29069a.o) this.f95915t).m145200g(), 268435456)) {
                            if (AbstractC19074t.m100204b(m118066m.f42434r, CoreUtility.f89233i)) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                                bundle.putBoolean("fromChat", false);
                                m101440g(new C18316b("ACTION_OPEN_MY_INFO_VIEW", bundle, null, null, 12, null));
                            } else {
                                if (!C21927m.m114302u().m114345m(m118066m.f42434r) && !(this.f95915t instanceof AbstractC29069a.l)) {
                                    C0824j.m2153b(new a(m118066m, c19325g1, this));
                                }
                                if (C18644n.m98531l().m98558u(m118066m.f42434r)) {
                                    int i12 = m118066m.f42373R0;
                                    if (i12 <= 0) {
                                        i12 = C21927m.m114302u().m114307E(m118066m.f42434r);
                                    }
                                    TrackingSource trackingSource = new TrackingSource(i12);
                                    trackingSource.m40677a("sourceView", 11);
                                    C21927m.m114302u().m114330e0(m118066m.f42434r, trackingSource);
                                    Intent intent = new Intent();
                                    String mo2478b = m118066m.mo2478b();
                                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                                    Bundle m140776b = new C27870vb(mo2478b).m140780g(m118066m).m140776b();
                                    intent.putExtras(m140776b);
                                    m140776b.putInt("extra_global_search_click_count", c19325g1.m101237s());
                                    m101440g(new C18316b("ACTION_OPEN_CHAT_VIEW", m140776b, m118066m, Boolean.FALSE));
                                } else {
                                    C31874cb c31874cb = new C31874cb();
                                    c31874cb.f146385a = m118066m.f42434r;
                                    c31874cb.f146394j = m118066m.f42455y;
                                    c31874cb.f146386b = m118066m.f42458z;
                                    c31874cb.f146387c = m118066m.f42437s;
                                    c31874cb.f146391g = m118066m.f42453x0;
                                    c31874cb.f146390f = m118066m.f42352K0;
                                    c31874cb.f146396l = m118066m.m40378N();
                                    c31874cb.f146393i = m118066m.f42446v;
                                    c31874cb.f146398n = m118066m.f42330D;
                                    c31874cb.f146395k = m118066m.f42449w;
                                    c31874cb.f146388d = m118066m.f42398a0;
                                    c31874cb.f146399o = m118066m.f42376S0;
                                    c31874cb.f146392h = m118066m.f42443u;
                                    c31874cb.f146406v = m118066m.f42329C1;
                                    c31874cb.f146407w = m118066m.f42332D1;
                                    c31874cb.f146389e = m118066m.f42373R0;
                                    m101440g(new C18316b("ACTION_VIEW_PROFILE_FRIEND_SUGGEST", c31874cb, null, null, 12, null));
                                }
                            }
                        }
                    }
                    InterfaceC18319c m101438e2 = m101438e();
                    if (m101438e2 != null) {
                        i11 = 33554432;
                        str = "getUid(...)";
                        str2 = "extra_global_search_click_count";
                        str3 = "ACTION_OPEN_CHAT_VIEW";
                        str4 = "sourceView";
                        C18316b c18316b2 = (C18316b) m101438e2.mo205i9(new C18316b("ACTION_GET_SEARCH_GLOBAL_CURRENT_MODE", m118066m, null, null, 12, null));
                        if (c18316b2 != null) {
                            obj = c18316b2.m97245a();
                            num = (Integer) obj;
                            if (num != null) {
                                return;
                            }
                            int intValue = num.intValue();
                            if (obj2.length() > 0 || intValue == 0) {
                                InterfaceC26722a interfaceC26722a2 = this.f95915t;
                                if (interfaceC26722a2 instanceof AbstractC29069a.o) {
                                    AbstractC29069a.b bVar2 = AbstractC29069a.Companion;
                                    if (bVar2.m145171a(((AbstractC29069a.o) interfaceC26722a2).m145200g(), 1) && bVar2.m145171a(((AbstractC29069a.o) this.f95915t).m145200g(), i11)) {
                                        z11 = true;
                                        if (!C21927m.m114302u().m114345m(m118066m.f42434r) && !z11) {
                                            C0824j.m2153b(new b(c19325g1, m118066m, obj2));
                                        }
                                    }
                                }
                                z11 = false;
                                if (!C21927m.m114302u().m114345m(m118066m.f42434r)) {
                                    C0824j.m2153b(new b(c19325g1, m118066m, obj2));
                                }
                            }
                            if (m118066m.m40374K0()) {
                                String m132088m = AbstractC25495a.m132088m(m118066m.f42434r);
                                C31973j5 m4472f = C0943w.f3447a.m4472f(m132088m);
                                Bundle bundle2 = new Bundle();
                                if (m4472f != null) {
                                    bundle2.putString("groupId", m4472f.m153781r());
                                    bundle2.putString("groupName", m4472f.m153793y());
                                    m118066m.f42437s = m4472f.m153793y();
                                    m118066m.f42446v = m4472f.m153756e();
                                } else {
                                    bundle2.putString("groupId", m132088m);
                                    bundle2.putString("groupName", m118066m.f42437s);
                                }
                                InterfaceC26722a interfaceC26722a3 = this.f95915t;
                                boolean z13 = interfaceC26722a3 instanceof AbstractC29069a.l;
                                if (z13) {
                                    if (interfaceC26722a3 instanceof AbstractC29069a.k) {
                                        m41065d2 = ((AbstractC29069a.k) interfaceC26722a3).m145189e();
                                    } else {
                                        m41065d2 = interfaceC26722a3 instanceof AbstractC29069a.a ? MessageId.Companion.m41065d(((AbstractC29069a.a) interfaceC26722a3).m145142f().m18037d().m18052a(), ((AbstractC29069a.a) this.f95915t).m145142f().m18037d().m18053b(), ((AbstractC29069a.a) this.f95915t).m145142f().m18037d().m18055d(), ((AbstractC29069a.a) this.f95915t).m145142f().m18037d().m18056e()) : null;
                                    }
                                    if (m41065d2 != null) {
                                        bundle2.putParcelable("STR_EXTRA_JUMP_TO_MESSAGE_ID", m41065d2);
                                    }
                                    bundle2.putString("search_message", this.f95914s);
                                }
                                bundle2.putBoolean("extra_dismiss_show_code", !z12);
                                bundle2.putInt(str2, c19325g1.m101237s());
                                m118066m.f42428p = 1;
                                String mo2478b2 = m118066m.mo2478b();
                                AbstractC19074t.m100207e(mo2478b2, str);
                                bundle2.putAll(new C27870vb(mo2478b2).m140780g(m118066m).m140776b());
                                m101440g(new C18316b(str3, bundle2, m118066m, Boolean.valueOf(z13)));
                            } else {
                                String str9 = str;
                                String str10 = str2;
                                String str11 = str3;
                                boolean z14 = (C21927m.m114302u().m114318P(m118066m.f42434r) || m118066m.m40387S0() || AbstractC21935u.m114518H(m118066m.f42434r) || AbstractC23304d.f113417o.containsKey(m118066m.f42434r)) && !AbstractC25495a.m132086k(m118066m.f42434r);
                                if (z14 && m118066m.f42350J1 != -1) {
                                    C28905e.m144373n().m144399u(String.valueOf(m118066m.f42350J1), 20, 96, m118066m.f42376S0, System.currentTimeMillis(), m118066m.f42422m0);
                                }
                                if (z14 && !C21927m.m114302u().m114318P(m118066m.f42434r) && !C19669z.f97573U.containsKey(m118066m.f42434r)) {
                                    try {
                                        TrackingSource trackingSource2 = new TrackingSource(273);
                                        trackingSource2.m40677a(str4, 11);
                                        int i13 = m118066m.f42350J1;
                                        if (i13 != -1) {
                                            trackingSource2.m40677a("campaignId", Integer.valueOf(i13));
                                            trackingSource2.m40677a("srcId", Integer.valueOf(m118066m.f42376S0));
                                            trackingSource2.m40677a("tracking_src", m118066m.f42422m0);
                                        }
                                        C21927m.m114302u().m114330e0(m118066m.f42434r, trackingSource2);
                                        m101440g(new C18316b("ACTION_OPEN_PROFILE", new C26365a.b(m118066m.f42434r, C32002l4.Companion.m154287a(8)).m135761t(true).m135738E(!(this.f95915t instanceof AbstractC29069a.o) ? 33554432 : -1).m135743b(), null, null, 12, null));
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                } else {
                                    Intent intent2 = new Intent();
                                    String mo2478b3 = m118066m.mo2478b();
                                    AbstractC19074t.m100207e(mo2478b3, str9);
                                    Bundle m140776b2 = new C27870vb(mo2478b3).m140780g(m118066m).m140776b();
                                    intent2.putExtras(m140776b2);
                                    InterfaceC26722a interfaceC26722a4 = this.f95915t;
                                    boolean z15 = interfaceC26722a4 instanceof AbstractC29069a.l;
                                    if (z15) {
                                        if (interfaceC26722a4 instanceof AbstractC29069a.k) {
                                            m41065d = ((AbstractC29069a.k) interfaceC26722a4).m145189e();
                                        } else {
                                            m41065d = interfaceC26722a4 instanceof AbstractC29069a.a ? MessageId.Companion.m41065d(((AbstractC29069a.a) interfaceC26722a4).m145142f().m18037d().m18052a(), ((AbstractC29069a.a) this.f95915t).m145142f().m18037d().m18053b(), ((AbstractC29069a.a) this.f95915t).m145142f().m18037d().m18055d(), ((AbstractC29069a.a) this.f95915t).m145142f().m18037d().m18056e()) : null;
                                        }
                                        if (m41065d != null) {
                                            m140776b2.putParcelable("STR_EXTRA_JUMP_TO_MESSAGE_ID", m41065d);
                                        }
                                        m140776b2.putString("search_message", this.f95914s);
                                    }
                                    m140776b2.putBoolean("extra_dismiss_show_code", !z12);
                                    m140776b2.putInt(str10, c19325g1.m101237s());
                                    m101440g(new C18316b(str11, m140776b2, m118066m, Boolean.valueOf(z15)));
                                }
                            }
                        }
                    } else {
                        str = "getUid(...)";
                        str2 = "extra_global_search_click_count";
                        str3 = "ACTION_OPEN_CHAT_VIEW";
                        str4 = "sourceView";
                        i11 = 33554432;
                    }
                    obj = null;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                }
            }
        }
        C19955h.f98250a.m103730s(c19325g1, this.f95915t, this.f95916u, 1);
        m101440g(new C18316b("Search.HideIme", null, null, null, 14, null));
    }
}
