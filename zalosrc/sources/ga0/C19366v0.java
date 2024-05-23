package ga0;

import am.C0943w;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.core.util.C1483e;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.searchglobal.SearchGlobalView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23212s8;
import me0.C23272y6;
import on0.AbstractC24341v;
import p056cj.AbstractC3552t;
import p056cj.C3548p;
import p056cj.C3549q;
import p056cj.C3551s;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p461qu.AbstractC25495a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29075g;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;
import p612wk.C29071c;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import vg.C28203u6;

/* renamed from: ga0.v0 */
/* loaded from: classes6.dex */
public final class C19366v0 extends AbstractC19358r1 {

    /* renamed from: t */
    private final HashMap f96185t;

    /* renamed from: u */
    private final AbstractC29069a.f f96186u;

    /* renamed from: v */
    private final C29071c f96187v;

    /* renamed from: w */
    private final InterfaceC24854k f96188w;

    /* renamed from: x */
    private final InterfaceC24854k f96189x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.v0$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f96190q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_compact_message_see_more);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.v0$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f96191q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(C23212s8.m119606n(AbstractC21196a.TextColor1));
        }
    }

    public /* synthetic */ C19366v0(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap, AbstractC29069a.f fVar, C29071c c29071c, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, str, hashMap, (i11 & 8) != 0 ? null : fVar, (i11 & 16) != 0 ? new C29071c(0, true) : c29071c);
    }

    /* renamed from: m */
    private final void m101462m(AbstractC29069a.a aVar) {
        C3549q c3549q;
        int i11;
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        boolean m127120J4;
        boolean m127120J5;
        boolean m127120J6;
        boolean m127120J7;
        boolean m127120J8;
        boolean m127120J9;
        boolean m127120J10;
        boolean m127120J11;
        if (aVar.m145140d().length() == 0 || aVar.m145150n().length() == 0) {
            C23024b7.f111993a.m118058U(aVar, aVar.m145143g());
        }
        AbstractC3552t m18034a = aVar.m145142f().m18034a();
        if (m18034a instanceof C3549q) {
            c3549q = (C3549q) m18034a;
        } else {
            c3549q = null;
        }
        if (c3549q != null && c3549q.m18039b() == null) {
            int i12 = -1;
            if (c3549q.m18038a().length() > 0) {
                String lowerCase = c3549q.m18038a().toLowerCase(Locale.ROOT);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                m127120J = AbstractC24341v.m127120J(lowerCase, "flv", false, 2, null);
                if (!m127120J) {
                    m127120J2 = AbstractC24341v.m127120J(lowerCase, "ogg", false, 2, null);
                    if (!m127120J2) {
                        m127120J3 = AbstractC24341v.m127120J(lowerCase, "mov", false, 2, null);
                        if (!m127120J3) {
                            m127120J4 = AbstractC24341v.m127120J(lowerCase, "mpg", false, 2, null);
                            if (!m127120J4) {
                                m127120J5 = AbstractC24341v.m127120J(lowerCase, "mkv", false, 2, null);
                                if (!m127120J5) {
                                    m127120J6 = AbstractC24341v.m127120J(lowerCase, "avi", false, 2, null);
                                    if (!m127120J6) {
                                        m127120J7 = AbstractC24341v.m127120J(lowerCase, "asf", false, 2, null);
                                        if (!m127120J7) {
                                            m127120J8 = AbstractC24341v.m127120J(lowerCase, "wmv", false, 2, null);
                                            if (!m127120J8) {
                                                m127120J9 = AbstractC24341v.m127120J(lowerCase, "mp4", false, 2, null);
                                                if (!m127120J9) {
                                                    m127120J10 = AbstractC24341v.m127120J(lowerCase, "3gp", false, 2, null);
                                                    if (!m127120J10) {
                                                        m127120J11 = AbstractC24341v.m127120J(lowerCase, "pdf", false, 2, null);
                                                        if (m127120J11) {
                                                            i12 = 1;
                                                        }
                                                        i11 = Integer.valueOf(i12);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i12 = 0;
                i11 = Integer.valueOf(i12);
            } else {
                i11 = -1;
            }
            c3549q.m18044g(i11);
        }
    }

    /* renamed from: n */
    private final String m101463n() {
        return (String) this.f96188w.getValue();
    }

    /* renamed from: o */
    private final int m101464o() {
        return ((Number) this.f96189x.getValue()).intValue();
    }

    /* renamed from: p */
    private final void m101465p(AbstractC29069a.a aVar, ArrayList arrayList) {
        C3551s c3551s;
        C3549q c3549q;
        String str;
        AbstractC3552t m18035b = aVar.m145142f().m18035b();
        SpannableString spannableString = null;
        if (m18035b instanceof C3551s) {
            c3551s = (C3551s) m18035b;
        } else {
            c3551s = null;
        }
        if (c3551s != null) {
            String m18050e = c3551s.m18050e();
            if (m18050e.length() == 0) {
                m18050e = c3551s.m18051f();
            }
            aVar.m145158v(m101466q(m18050e, arrayList, 7));
            aVar.m145159w(m101467r(this, c3551s.m18048c(), arrayList, 0, 4, null));
        }
        AbstractC3552t m18034a = aVar.m145142f().m18034a();
        if (m18034a instanceof C3549q) {
            c3549q = (C3549q) m18034a;
        } else {
            c3549q = null;
        }
        if (c3549q != null) {
            aVar.m145156t(m101466q(c3549q.m18040c(), arrayList, 7));
        }
        if (aVar.m145142f().m18036c() > 1) {
            if (aVar.m145142f().m18036c() > 99) {
                str = "99+ " + m101463n();
            } else {
                str = aVar.m145142f().m18036c() + " " + m101463n();
            }
            SpannableString spannableString2 = new SpannableString(str);
            AbstractC23217t2.m119664p(spannableString2, 0, str.length() - m101463n().length(), m101464o(), 7, 33);
            spannableString = spannableString2;
        }
        aVar.m145157u(spannableString);
    }

    /* renamed from: q */
    private final CharSequence m101466q(String str, ArrayList arrayList, int i11) {
        return new SpannableStringBuilder(AbstractC23217t2.m119653e(str, arrayList, SearchGlobalView.Companion.m73192a(), i11));
    }

    /* renamed from: r */
    static /* synthetic */ CharSequence m101467r(C19366v0 c19366v0, String str, ArrayList arrayList, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return c19366v0.m101466q(str, arrayList, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0227 A[Catch: Exception -> 0x0251, TryCatch #4 {Exception -> 0x0251, blocks: (B:77:0x0262, B:121:0x0221, B:123:0x0227, B:125:0x023f, B:127:0x0245, B:131:0x0256), top: B:76:0x0262 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032d  */
    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        String str;
        String str2;
        AbstractC29069a.f fVar;
        String str3;
        List m131187O0;
        String str4;
        String m18055d;
        boolean z11;
        ContactProfile m141798e;
        C24848g0 c24848g0;
        ContactProfile m98552o;
        String str5;
        String m127113C;
        Iterator it;
        String str6;
        String str7;
        String str8;
        C18316b c18316b;
        String str9 = "ACTION_SEARCH_TASK_RESULT_SET_DATA";
        String str10 = "ACTION_SEARCH_TASK_RESULT_ADD_DATA";
        if (isCancelled()) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
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
        this.f96187v.m145238b();
        if (this.f96187v.m145238b() != 0) {
            AbstractC29076h.q qVar = AbstractC29076h.q.f134831b;
            String m101455l = m101455l();
            ArrayList arrayList = new ArrayList();
            AbstractC29072d.c cVar = AbstractC29072d.c.f134805a;
            C29071c c29071c = this.f96187v;
            AbstractC29069a.f fVar2 = this.f96186u;
            if (fVar2 == null) {
                fVar2 = c19325g1.m101247x().m145291s().mo145251y0();
            }
            mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_ADD_DATA", AbstractC29075g.m145257d(qVar, m101455l, arrayList, cVar, c29071c, fVar2), null, null, 12, null));
        } else if (this.f96187v.m145238b() == 0 && this.f96186u != null) {
            mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", AbstractC29075g.m145257d(AbstractC29076h.q.f134831b, m101455l(), new ArrayList(), AbstractC29072d.c.f134805a, this.f96187v, this.f96186u), null, null, 12, null));
        }
        AbstractC29069a.f fVar3 = this.f96186u;
        if (fVar3 == null) {
            AbstractC29069a.f mo145251y0 = c19325g1.m101247x().m145291s().mo145251y0();
            if (c19325g1.m101207d() == AbstractC29080l.g.f134887b.m145312a()) {
                fVar3 = mo145251y0.m145176b();
            } else {
                fVar3 = mo145251y0.m145177c();
            }
        }
        boolean m101196V = c19325g1.m101196V();
        ArrayList arrayList2 = new ArrayList();
        try {
            C1483e m119969D = AbstractC23262x6.m119969D(m101455l());
            if (m119969D == null || isCancelled()) {
                return;
            }
            Object obj2 = m119969D.f6374a;
            AbstractC19074t.m100207e(obj2, "first");
            m131187O0 = AbstractC25332a0.m131187O0(C23272y6.m120049g((String) obj2, fVar3, this.f96187v.m145238b(), 125, this).m120055a());
            if (isCancelled()) {
                return;
            }
            C29071c m101098g = C19318e0.Companion.m101098g(this.f96187v, m131187O0, 100, 25);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            C19059j0 c19059j0 = new C19059j0();
            Iterator it2 = m131187O0.iterator();
            String str11 = "";
            String str12 = "";
            String str13 = str12;
            boolean z12 = false;
            while (it2.hasNext()) {
                C3548p c3548p = (C3548p) it2.next();
                if (isCancelled()) {
                    return;
                }
                if (c3548p.m18037d().m18055d().length() != 0) {
                    try {
                        try {
                            try {
                                try {
                                    if (fVar3.m145179e() != null) {
                                        m18055d = c3548p.m18037d().m18056e();
                                        if (m18055d == null) {
                                        }
                                        c19059j0.f94941p = m18055d;
                                        if (fVar3.m145179e() == null || (!C21927m.m114302u().m114345m(c3548p.m18037d().m18055d()) && this.f96185t.containsKey(c3548p.m18037d().m18055d()))) {
                                            if (fVar3.m145179e() != null && AbstractC25495a.m132079d((String) c19059j0.f94941p)) {
                                                C31973j5 m4472f = C0943w.m4462l().m4472f(AbstractC25495a.m132088m((String) c19059j0.f94941p));
                                                if (m4472f == null || (str7 = m4472f.m153793y()) == null) {
                                                    str7 = str11;
                                                }
                                                if (m4472f == null || (str8 = m4472f.m153756e()) == null) {
                                                    str8 = str11;
                                                }
                                                z11 = m101196V;
                                                str = str9;
                                                str13 = str8;
                                                str12 = str7;
                                            } else if (fVar3.m145179e() == null || !m101196V || (m98552o = C18644n.m98531l().m98552o((String) c19059j0.f94941p)) == null || m98552o.f42382U0 != 0) {
                                                z11 = m101196V;
                                                str = str9;
                                                m141798e = C28203u6.m141798e(C28203u6.f131407a, (String) c19059j0.f94941p, null, 2, null);
                                                if (m141798e == null) {
                                                    str12 = m141798e.m40383Q(true, false);
                                                    AbstractC19074t.m100207e(str12, "getDpnPhoneContact(...)");
                                                    String str14 = m141798e.f42446v;
                                                    AbstractC19074t.m100207e(str14, "avt");
                                                    if (!m141798e.m40359B0() && !m141798e.m40372J0() && !AbstractC25495a.m132086k(m141798e.f42434r)) {
                                                        z12 = false;
                                                        c24848g0 = C24848g0.f119245a;
                                                        str13 = str14;
                                                    }
                                                    z12 = true;
                                                    c24848g0 = C24848g0.f119245a;
                                                    str13 = str14;
                                                } else {
                                                    c24848g0 = null;
                                                }
                                                if (c24848g0 == null) {
                                                    str12 = str11;
                                                    str13 = str12;
                                                }
                                                str5 = str10;
                                                long m18057f = c3548p.m18037d().m18057f();
                                                str2 = str5;
                                                m127113C = AbstractC24341v.m127113C(c3548p.m18037d().m18054c(), '\n', ' ', false, 4, null);
                                                it = it2;
                                                str6 = str11;
                                                fVar = fVar3;
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC23217t2.m119653e(m127113C, (ArrayList) m119969D.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                                                String m119254h = AbstractC23160o0.m119254h(m18057f, calendar, calendar2);
                                                AbstractC19074t.m100207e(m119254h, "formatSearchGlobalItemTimeChatConversation(...)");
                                                AbstractC29069a.a aVar = new AbstractC29069a.a(3072, c3548p, m18057f, str12, spannableStringBuilder, str13, m119254h, (String) c19059j0.f94941p, z12);
                                                m101462m(aVar);
                                                Object obj3 = m119969D.f6375b;
                                                AbstractC19074t.m100207e(obj3, "second");
                                                m101465p(aVar, (ArrayList) obj3);
                                                arrayList2.add(aVar);
                                                m101196V = z11;
                                                str9 = str;
                                                str10 = str2;
                                                it2 = it;
                                                str11 = str6;
                                                fVar3 = fVar;
                                            }
                                            z12 = false;
                                            str5 = str10;
                                            long m18057f2 = c3548p.m18037d().m18057f();
                                            str2 = str5;
                                            m127113C = AbstractC24341v.m127113C(c3548p.m18037d().m18054c(), '\n', ' ', false, 4, null);
                                            it = it2;
                                            str6 = str11;
                                            fVar = fVar3;
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AbstractC23217t2.m119653e(m127113C, (ArrayList) m119969D.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                                            String m119254h2 = AbstractC23160o0.m119254h(m18057f2, calendar, calendar2);
                                            AbstractC19074t.m100207e(m119254h2, "formatSearchGlobalItemTimeChatConversation(...)");
                                            AbstractC29069a.a aVar2 = new AbstractC29069a.a(3072, c3548p, m18057f2, str12, spannableStringBuilder2, str13, m119254h2, (String) c19059j0.f94941p, z12);
                                            m101462m(aVar2);
                                            Object obj32 = m119969D.f6375b;
                                            AbstractC19074t.m100207e(obj32, "second");
                                            m101465p(aVar2, (ArrayList) obj32);
                                            arrayList2.add(aVar2);
                                            m101196V = z11;
                                            str9 = str;
                                            str10 = str2;
                                            it2 = it;
                                            str11 = str6;
                                            fVar3 = fVar;
                                        }
                                    }
                                    SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(AbstractC23217t2.m119653e(m127113C, (ArrayList) m119969D.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                                    String m119254h22 = AbstractC23160o0.m119254h(m18057f2, calendar, calendar2);
                                    AbstractC19074t.m100207e(m119254h22, "formatSearchGlobalItemTimeChatConversation(...)");
                                    AbstractC29069a.a aVar22 = new AbstractC29069a.a(3072, c3548p, m18057f2, str12, spannableStringBuilder22, str13, m119254h22, (String) c19059j0.f94941p, z12);
                                    m101462m(aVar22);
                                    Object obj322 = m119969D.f6375b;
                                    AbstractC19074t.m100207e(obj322, "second");
                                    m101465p(aVar22, (ArrayList) obj322);
                                    arrayList2.add(aVar22);
                                    m101196V = z11;
                                    str9 = str;
                                    str10 = str2;
                                    it2 = it;
                                    str11 = str6;
                                    fVar3 = fVar;
                                } catch (Exception e11) {
                                    e = e11;
                                    e.printStackTrace();
                                    if (isCancelled()) {
                                    }
                                }
                                m127113C = AbstractC24341v.m127113C(c3548p.m18037d().m18054c(), '\n', ' ', false, 4, null);
                                it = it2;
                                str6 = str11;
                                fVar = fVar3;
                            } catch (Exception e12) {
                                e = e12;
                                fVar = fVar3;
                                e.printStackTrace();
                                if (isCancelled()) {
                                    return;
                                }
                                if (this.f96187v.m145238b() > 0) {
                                    str3 = str2;
                                } else {
                                    str3 = str;
                                }
                                mo205i9(new C18316b(str3, AbstractC29075g.m145257d(AbstractC29076h.q.f134831b, m101455l(), new ArrayList(), AbstractC29072d.a.f134803a, this.f96187v, fVar), null, null, 12, null));
                                return;
                            }
                            long m18057f22 = c3548p.m18037d().m18057f();
                            str2 = str5;
                        } catch (Exception e13) {
                            e = e13;
                            str2 = str5;
                        }
                        str5 = str10;
                    } catch (Exception e14) {
                        e = e14;
                        str2 = str10;
                        fVar = fVar3;
                        e.printStackTrace();
                        if (isCancelled()) {
                        }
                    }
                    m18055d = c3548p.m18037d().m18055d();
                    c19059j0.f94941p = m18055d;
                    if (fVar3.m145179e() == null) {
                    }
                    if (fVar3.m145179e() != null) {
                    }
                    if (fVar3.m145179e() == null) {
                    }
                    z11 = m101196V;
                    str = str9;
                    m141798e = C28203u6.m141798e(C28203u6.f131407a, (String) c19059j0.f94941p, null, 2, null);
                    if (m141798e == null) {
                    }
                    if (c24848g0 == null) {
                    }
                }
                z11 = m101196V;
                str = str9;
                str2 = str10;
                fVar = fVar3;
                it = it2;
                str6 = str11;
                m101196V = z11;
                str9 = str;
                str10 = str2;
                it2 = it;
                str11 = str6;
                fVar3 = fVar;
            }
            str = str9;
            str2 = str10;
            fVar = fVar3;
            if (isCancelled()) {
                return;
            }
            if (this.f96187v.m145238b() > 0) {
                str4 = str2;
            } else {
                str4 = str;
            }
            mo205i9(new C18316b(str4, AbstractC29075g.m145257d(AbstractC29076h.q.f134831b, m101455l(), arrayList2, AbstractC29072d.d.f134806a, m101098g, fVar), null, null, 12, null));
        } catch (Exception e15) {
            e = e15;
            str = str9;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19366v0(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap, AbstractC29069a.f fVar, C29071c c29071c) {
        super(interfaceC18319c, str);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "uidExistThreadChatMap");
        AbstractC19074t.m100208f(c29071c, "paginationData");
        this.f96185t = hashMap;
        this.f96186u = fVar;
        this.f96187v = c29071c;
        m129210a = AbstractC24856m.m129210a(a.f96190q);
        this.f96188w = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f96191q);
        this.f96189x = m129210a2;
    }
}
