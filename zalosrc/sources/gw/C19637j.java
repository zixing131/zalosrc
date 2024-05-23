package gw;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0826k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import ag0.C0843s0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.text.TextUtils;
import android.util.Pair;
import au.AbstractC2368q0;
import bi.C2806e;
import bo.C3000l0;
import bo.C3003l3;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import ee0.C18419a;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23174p3;
import me0.AbstractC23262x6;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import nh0.C23793c;
import o70.C24099q0;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p055ce.AbstractC3439h;
import p055ce.C3432a;
import p132ej.C18446h;
import p161fg.C18922m;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p459qs.C25490c;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p692ys.C31070a;
import p716zh.C31943h5;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32020m7;
import p716zh.C32076q5;
import pm0.C24848g0;
import tn.C26761p;
import tn.C26767v;
import vg.C28203u6;

/* renamed from: gw.j */
/* loaded from: classes4.dex */
public final class C19637j {

    /* renamed from: A */
    public static Comparator f97459A;

    /* renamed from: B */
    private static boolean f97460B;

    /* renamed from: C */
    private static long f97461C;

    /* renamed from: D */
    private static InterfaceC0765j f97462D;

    /* renamed from: E */
    private static boolean f97463E;

    /* renamed from: F */
    private static LinkAttachment f97464F;

    /* renamed from: G */
    private static final d f97465G;

    /* renamed from: a */
    public static final C19637j f97466a = new C19637j();

    /* renamed from: b */
    private static final String f97467b;

    /* renamed from: c */
    private static int f97468c;

    /* renamed from: d */
    private static long f97469d;

    /* renamed from: e */
    private static ArrayList f97470e;

    /* renamed from: f */
    private static boolean f97471f;

    /* renamed from: g */
    private static boolean f97472g;

    /* renamed from: h */
    private static String f97473h;

    /* renamed from: i */
    private static int f97474i;

    /* renamed from: j */
    private static InterfaceC0765j f97475j;

    /* renamed from: k */
    private static int f97476k;

    /* renamed from: l */
    private static C31070a f97477l;

    /* renamed from: m */
    private static String f97478m;

    /* renamed from: n */
    private static ArrayList f97479n;

    /* renamed from: o */
    private static ArrayList f97480o;

    /* renamed from: p */
    private static boolean f97481p;

    /* renamed from: q */
    private static boolean f97482q;

    /* renamed from: r */
    private static final HashSet f97483r;

    /* renamed from: s */
    private static final HashMap f97484s;

    /* renamed from: t */
    private static final HashMap f97485t;

    /* renamed from: u */
    private static int f97486u;

    /* renamed from: v */
    private static ArrayList f97487v;

    /* renamed from: w */
    private static Map f97488w;

    /* renamed from: x */
    public static Comparator f97489x;

    /* renamed from: y */
    public static Comparator f97490y;

    /* renamed from: z */
    public static Comparator f97491z;

    /* renamed from: gw.j$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo75322a(boolean z11, C31973j5 c31973j5);
    }

    /* renamed from: gw.j$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f97492a;

        /* renamed from: b */
        final /* synthetic */ boolean f97493b;

        b(String str, boolean z11) {
            this.f97492a = str;
            this.f97493b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            c20096c.m104492d();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                if (jSONObject.optInt("enable") == 1) {
                    String optString = jSONObject.optString("link");
                    C0943w c0943w = C0943w.f3447a;
                    C31973j5 m4472f = c0943w.m4472f(this.f97492a);
                    if (m4472f != null) {
                        AbstractC19074t.m100205c(optString);
                        m4472f.m153714E0(optString);
                    }
                    c0943w.m4483w(m4472f);
                    if (this.f97493b) {
                        C19637j.f97466a.m102839V(optString);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: gw.j$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f97494a;

        c(String str) {
            this.f97494a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                C19637j.f97466a.m102851i0(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C19637j c19637j = C19637j.f97466a;
                c19637j.m102851i0(false);
                c19637j.m102853j0(new LinkAttachment(((JSONObject) obj).getJSONObject("data")));
                C3000l0 m14278x = C3000l0.m14278x(this.f97494a, c19637j.m102823C(), null, new C3003l3(), null, new PrivacyInfo(), null, null, "");
                m14278x.f11869R = MainApplication.Companion.m35500c().getString(AbstractC8020f0.profile_today);
                m14278x.f11868Q = false;
                String jSONObject = AbstractC20826v0.m108827p(m14278x).toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                C7960e.m41971c6().m42073B7(AbstractC23304d.f113368c0.f42434r, m14278x.f11895q, jSONObject, m14278x.m14339j0(), m14278x.m14341k0());
                C26767v.m137782d().m137783a(m14278x);
                C26761p.m137741q().m137753F(m14278x);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: gw.j$d */
    /* loaded from: classes4.dex */
    public static final class d implements C23744a.c {
        d() {
        }

        @Override // p363nh.C23744a.c
        /* renamed from: x */
        public void mo17795x(int i11, Object... objArr) {
            C31973j5 m4472f;
            AbstractC19074t.m100208f(objArr, "args");
            if (i11 == 152) {
                try {
                    String valueOf = String.valueOf(objArr[0]);
                    if (!AbstractC25495a.m132079d(valueOf) || (m4472f = C0943w.f3447a.m4472f(valueOf)) == null) {
                        return;
                    }
                    C0843s0.m2286r().m2294e(new AbstractC0826k.a(m4472f.m153781r(), 9));
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: gw.j$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C18419a f97495a;

        /* renamed from: b */
        final /* synthetic */ String f97496b;

        /* renamed from: c */
        final /* synthetic */ a f97497c;

        e(C18419a c18419a, String str, a aVar) {
            this.f97495a = c18419a;
            this.f97496b = str;
            this.f97497c = aVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C18419a c18419a = this.f97495a;
            String str = this.f97496b;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            c18419a.m101508a(new C18419a.b.a(str, m104491c, m104492d));
            this.f97497c.mo75322a(false, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    C19637j c19637j = C19637j.f97466a;
                    AbstractC19074t.m100205c(jSONObject2);
                    Pair m102835R = c19637j.m102835R(jSONObject2);
                    C31973j5 c31973j5 = (C31973j5) m102835R.first;
                    C32076q5 c32076q5 = (C32076q5) m102835R.second;
                    C18419a c18419a = this.f97495a;
                    String str = this.f97496b;
                    AbstractC19074t.m100205c(c31973j5);
                    AbstractC19074t.m100205c(c32076q5);
                    c18419a.m101508a(new C18419a.b.C32815b(str, c31973j5, c32076q5, jSONObject2));
                    this.f97497c.mo75322a(true, c31973j5);
                    return;
                }
                this.f97497c.mo75322a(false, null);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: gw.j$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f97498a;

        f(long j11) {
            this.f97498a = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                C19637j c19637j = C19637j.f97466a;
                AbstractC23350e.m122774d(c19637j.m102830K(), "getGroupListFromServer onErrorData: " + c20096c.m104490b());
                c19637j.m102832M();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C19637j c19637j = C19637j.f97466a;
                AbstractC23350e.m122774d(c19637j.m102830K(), "GET GROUP LIST time: " + (System.currentTimeMillis() - this.f97498a));
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.isNull("data") && jSONObject.isNull("error_code")) {
                    c19637j.m102832M();
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                JSONArray optJSONArray = jSONObject2.optJSONArray("data");
                if (optJSONArray != null) {
                    if (c19637j.m102864r() == 1) {
                        c19637j.m102824E().clear();
                        c19637j.m102862q().clear();
                        c19637j.m102829J().clear();
                    }
                    for (int length = optJSONArray.length() - 1; -1 < length; length--) {
                        try {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(length);
                            C19637j c19637j2 = C19637j.f97466a;
                            AbstractC19074t.m100205c(jSONObject3);
                            Pair m102835R = c19637j2.m102835R(jSONObject3);
                            C31973j5 c31973j5 = (C31973j5) m102835R.first;
                            C32076q5 c32076q5 = (C32076q5) m102835R.second;
                            String m153781r = c31973j5.m153781r();
                            if (!c19637j2.m102862q().containsKey(m153781r)) {
                                c19637j2.m102862q().put(m153781r, m153781r);
                                c19637j2.m102824E().add(new Pair(c31973j5, c32076q5));
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                    }
                }
                C19637j c19637j3 = C19637j.f97466a;
                c19637j3.m102830K();
                int size = c19637j3.m102824E().size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getGroupList size: ");
                sb2.append(size);
                c19637j3.m102843b0(jSONObject2.optBoolean("hasMoreList"));
                String optString = jSONObject2.optString("lastGroupId");
                AbstractC19074t.m100207e(optString, "optString(...)");
                c19637j3.m102848g0(optString);
                if (c19637j3.m102864r() == 1) {
                    if (jSONObject2.has("expireTime")) {
                        AbstractC23309i.m122141lp(jSONObject2.optLong("expireTime"));
                    }
                    AbstractC19074t.m100205c(jSONObject2);
                    c19637j3.m102836S(jSONObject2);
                    jSONObject2.remove("data");
                    AbstractC23309i.m121279Oo(jSONObject2.toString());
                }
                if (c19637j3.m102861p()) {
                    c19637j3.m102844c0(c19637j3.m102864r() + 1);
                    Thread.sleep(10L);
                    AbstractC23350e.m122774d(c19637j3.m102830K(), "getGroupListFromServer: curPage " + c19637j3.m102864r() + "   lastGroupId: " + c19637j3.m102821A());
                    c19637j3.m102866s().mo1666j6(c19637j3.m102864r(), c19637j3.m102821A(), 0);
                } else {
                    if (!c19637j3.m102824E().isEmpty()) {
                        C0943w.f3447a.m4478p(c19637j3.m102824E());
                    } else {
                        C0943w.f3447a.m4469c();
                    }
                    AbstractC23309i.m121171Lr(System.currentTimeMillis());
                    c19637j3.m102840X();
                    if (AbstractC0924m0.m3106Hb()) {
                        C31986k3 c31986k3 = C31986k3.f147083a;
                        String str = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str, "currentUserUid");
                        c31986k3.m154085B0(str);
                    }
                    c19637j3.m102845d0(false);
                }
                c19637j3.m102857l0(0);
                AbstractC0924m0.m4147ql(false);
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
                C19637j.f97466a.m102832M();
            }
        }
    }

    /* renamed from: gw.j$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f97499a;

        /* renamed from: b */
        final /* synthetic */ String f97500b;

        g(String str, String str2) {
            this.f97499a = str;
            this.f97500b = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C31943h5.f146766a.m153511o(this.f97499a, this.f97500b);
        }
    }

    /* renamed from: gw.j$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ JSONObject f97501a;

        h(JSONObject jSONObject) {
            this.f97501a = jSONObject;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            Iterator<String> keys = this.f97501a.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = this.f97501a.optString(next);
                if (optString != null && optString.length() != 0) {
                    C31943h5.f146766a.m153511o(next, optString);
                }
            }
        }
    }

    /* renamed from: gw.j$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC20094a {
        i() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C19637j c19637j = C19637j.f97466a;
            c19637j.m102846e0(false);
            AbstractC23350e.m122774d(c19637j.m102830K(), "ERROR updateOnlineList");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray optJSONArray;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    if (jSONObject.isNull("data")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    C19637j c19637j = C19637j.f97466a;
                    synchronized (c19637j.m102826G()) {
                        try {
                            c19637j.m102826G().clear();
                            if (!jSONObject2.isNull("onlines") && (optJSONArray = jSONObject2.optJSONArray("onlines")) != null) {
                                int length = optJSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    C19637j.f97466a.m102826G().add(optJSONArray.getJSONObject(i11).optString("userId"));
                                }
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C19637j.f97484s.clear();
                    C23744a.Companion.m124119a().m124116d(59, new Object[0]);
                } catch (Exception e11) {
                    C19637j c19637j2 = C19637j.f97466a;
                    AbstractC23350e.m122774d(c19637j2.m102830K(), e11.toString());
                    c19637j2.m102846e0(false);
                }
            } finally {
                C19637j.f97466a.m102846e0(false);
            }
        }
    }

    static {
        String simpleName = C19637j.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f97467b = simpleName;
        f97470e = new ArrayList();
        f97472g = true;
        f97473h = "0";
        f97474i = 1;
        f97475j = new C0766k();
        f97479n = new ArrayList();
        f97483r = new HashSet();
        f97484s = new HashMap();
        f97485t = new HashMap();
        f97487v = new ArrayList();
        f97488w = new HashMap();
        f97489x = new Comparator() { // from class: gw.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m102817o0;
                m102817o0 = C19637j.m102817o0((C32020m7) obj, (C32020m7) obj2);
                return m102817o0;
            }
        };
        f97490y = new Comparator() { // from class: gw.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m102818p0;
                m102818p0 = C19637j.m102818p0((C32020m7) obj, (C32020m7) obj2);
                return m102818p0;
            }
        };
        f97491z = new Comparator() { // from class: gw.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m102816n0;
                m102816n0 = C19637j.m102816n0((C32020m7) obj, (C32020m7) obj2);
                return m102816n0;
            }
        };
        f97459A = new Comparator() { // from class: gw.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m102815m0;
                m102815m0 = C19637j.m102815m0((C32020m7) obj, (C32020m7) obj2);
                return m102815m0;
            }
        };
        d dVar = new d();
        f97465G = dVar;
        C23744a.Companion.m124119a().m124115b(dVar, 152);
    }

    private C19637j() {
    }

    /* renamed from: D */
    public static final ArrayList m102802D(C31973j5 c31973j5, int i11) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(c31973j5, "group");
        synchronized (c31973j5) {
            arrayList = new ArrayList(c31973j5.m153767k());
        }
        ArrayList arrayList2 = new ArrayList(i11);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size && arrayList2.size() < i11; i12++) {
            if (AbstractC21935u.m114556w((String) arrayList.get(i12))) {
                arrayList2.add(arrayList.get(i12));
            }
        }
        return arrayList2;
    }

    /* renamed from: N */
    public static final void m102803N(C31973j5 c31973j5) {
        ArrayList arrayList;
        int i11;
        boolean z11;
        ContactProfile m141798e;
        ContactProfile m141798e2;
        AbstractC19074t.m100208f(c31973j5, "group");
        synchronized (c31973j5) {
            arrayList = new ArrayList(c31973j5.m153767k());
        }
        if (AbstractC23309i.m122268p2() && c31973j5.m153716G() == 0) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            String str = CoreUtility.f89233i;
            if (size >= 2) {
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!AbstractC19074t.m100204b(str, str2) && (m141798e2 = C28203u6.m141798e(C28203u6.f131407a, str2, null, 2, null)) != null) {
                        if (i12 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(m141798e2.m40383Q(true, false));
                        i12++;
                    }
                    if (i12 == 3) {
                        break;
                    }
                }
                if (size == 2 && arrayList.contains(str)) {
                    sb2.append(", ");
                    sb2.append(AbstractC23304d.f113368c0.f42437s);
                }
            } else {
                String str3 = AbstractC23304d.f113368c0.f42437s;
                if (size == 1 && !AbstractC19074t.m100204b(str, (String) arrayList.get(0)) && (m141798e = C28203u6.m141798e(C28203u6.f131407a, (String) arrayList.get(0), null, 2, null)) != null) {
                    str3 = m141798e.m40383Q(true, false);
                }
                sb2.append(MainApplication.Companion.m35500c().getString(AbstractC8020f0.group_title));
                sb2.append(": ");
                sb2.append(str3);
            }
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            c31973j5.m153721I0(sb3);
        }
        String m120002o = AbstractC23262x6.m120002o(c31973j5.m153793y());
        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
        int length = m120002o.length() - 1;
        int i13 = 0;
        boolean z12 = false;
        while (i13 <= length) {
            if (!z12) {
                i11 = i13;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(m120002o.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i13++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        c31973j5.m153741S0(m120002o.subSequence(i13, length + 1).toString());
    }

    /* renamed from: O */
    private final boolean m102804O(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C31973j5 m40388T = ((C32020m7) obj).f147411b.m40388T(true);
            if (m40388T != null && m40388T.m153742T()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public static final void m102805W(String str) {
        f97466a.m102859n(str, MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_caption_feed_create_group));
    }

    /* renamed from: Y */
    public static final void m102806Y() {
        try {
            if (!f97482q) {
                String m122566x4 = AbstractC23309i.m122566x4();
                if (!TextUtils.isEmpty(m122566x4)) {
                    f97466a.m102836S(new JSONObject(m122566x4));
                }
                f97482q = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        C0943w c0943w = C0943w.f3447a;
        List<C31973j5> m4475i = c0943w.m4475i();
        if (m4475i.isEmpty()) {
            m4475i = c0943w.m4474h();
        }
        AbstractC23309i.m122565x3();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        Map m103209W = C19669z.Companion.m103232a().m103209W();
        for (C31973j5 c31973j5 : m4475i) {
            String m153781r = c31973j5.m153781r();
            if (!hashMap.containsKey(m153781r)) {
                hashMap.put(m153781r, m153781r);
                if (z11) {
                    if (C21927m.m114302u().m114345m("group_" + c31973j5.m153781r())) {
                    }
                }
                C32020m7 c32020m7 = new C32020m7(1);
                ContactProfile contactProfile = new ContactProfile(1, c31973j5.m153781r());
                c32020m7.f147411b = contactProfile;
                contactProfile.f42437s = c31973j5.m153793y();
                contactProfile.f42440t = c31973j5.m153795z();
                if (m103209W.containsKey(m153781r)) {
                    contactProfile.m40409i1((C18446h) m103209W.get(m153781r));
                }
                arrayList.add(c32020m7);
            }
        }
        f97470e = arrayList;
        if (!f97481p) {
            f97481p = true;
            f97466a.m102863q0();
        }
        C23744a.Companion.m124119a().m124116d(36, new Object[0]);
        f97466a.m102850i(0);
    }

    /* renamed from: m0 */
    public static final int m102815m0(C32020m7 c32020m7, C32020m7 c32020m72) {
        char c11;
        AbstractC19074t.m100208f(c32020m7, "object2");
        AbstractC19074t.m100208f(c32020m72, "object1");
        C31973j5 m40388T = c32020m72.f147411b.m40388T(false);
        C31973j5 m40388T2 = c32020m7.f147411b.m40388T(false);
        if (m40388T == null) {
            return -1;
        }
        if (m40388T2 == null) {
            return 1;
        }
        char c12 = 2;
        if (m40388T.m153778p0()) {
            c11 = 3;
        } else if (m40388T.m153743U()) {
            c11 = 2;
        } else {
            c11 = 1;
        }
        if (m40388T2.m153778p0()) {
            c12 = 3;
        } else if (!m40388T2.m153743U()) {
            c12 = 1;
        }
        if (c11 > c12) {
            return 1;
        }
        if (c11 < c12) {
            return -1;
        }
        int i11 = c32020m72.f147410a;
        if (i11 != 1 && c32020m7.f147410a != 1) {
            return AbstractC2368q0.m12386a(c32020m7.f147411b.f42437s, c32020m72.f147411b.f42437s);
        }
        if (i11 != 1) {
            return -1;
        }
        if (c32020m7.f147410a != 1) {
            return 1;
        }
        return C18446h.Companion.m97763b(c32020m72.f147411b.m40392W(), c32020m7.f147411b.m40392W());
    }

    /* renamed from: n0 */
    public static final int m102816n0(C32020m7 c32020m7, C32020m7 c32020m72) {
        AbstractC19074t.m100208f(c32020m7, "object2");
        AbstractC19074t.m100208f(c32020m72, "object1");
        C31973j5 m40388T = c32020m72.f147411b.m40388T(false);
        C31973j5 m40388T2 = c32020m7.f147411b.m40388T(false);
        if (m40388T == null) {
            return -1;
        }
        if (m40388T2 == null) {
            return 1;
        }
        if (m40388T.m153716G() != 0 && m40388T2.m153716G() != 0) {
            if (AbstractC2368q0.m12386a(c32020m7.f147411b.f42437s, c32020m72.f147411b.f42437s) != 0) {
                return AbstractC2368q0.m12386a(c32020m7.f147411b.f42437s, c32020m72.f147411b.f42437s);
            }
            int i11 = c32020m72.f147410a;
            if (i11 != 1 && c32020m7.f147410a != 1) {
                return 0;
            }
            if (i11 != 1) {
                return -1;
            }
            if (c32020m7.f147410a != 1) {
                return 1;
            }
            return C18446h.Companion.m97763b(c32020m72.f147411b.m40392W(), c32020m7.f147411b.m40392W());
        }
        if (m40388T.m153716G() != 0) {
            return 1;
        }
        if (m40388T2.m153716G() != 0) {
            return -1;
        }
        return AbstractC2368q0.m12386a(c32020m7.f147411b.f42437s, c32020m72.f147411b.f42437s);
    }

    /* renamed from: o0 */
    public static final int m102817o0(C32020m7 c32020m7, C32020m7 c32020m72) {
        C31973j5 m40388T = c32020m72.f147411b.m40388T(false);
        C31973j5 m40388T2 = c32020m7.f147411b.m40388T(false);
        if (m40388T == null) {
            return -1;
        }
        if (m40388T2 == null) {
            return 1;
        }
        int i11 = c32020m72.f147410a;
        if (i11 != 1 && c32020m7.f147410a != 1) {
            return AbstractC2368q0.m12386a(c32020m7.f147411b.f42437s, c32020m72.f147411b.f42437s);
        }
        if (i11 != 1) {
            return -1;
        }
        if (c32020m7.f147410a != 1) {
            return 1;
        }
        return C18446h.Companion.m97763b(c32020m72.f147411b.m40392W(), c32020m7.f147411b.m40392W());
    }

    /* renamed from: p0 */
    public static final int m102818p0(C32020m7 c32020m7, C32020m7 c32020m72) {
        AbstractC19074t.m100208f(c32020m7, "object2");
        AbstractC19074t.m100208f(c32020m72, "object1");
        C31973j5 m40388T = c32020m72.f147411b.m40388T(false);
        C31973j5 m40388T2 = c32020m7.f147411b.m40388T(false);
        if (m40388T == null) {
            return -1;
        }
        if (m40388T2 == null) {
            return 1;
        }
        int i11 = c32020m72.f147410a;
        if (i11 != 28 && c32020m7.f147410a != 28) {
            return AbstractC2368q0.m12386a(c32020m7.f147411b.f42437s, c32020m72.f147411b.f42437s);
        }
        if (i11 != 28) {
            return -1;
        }
        if (c32020m7.f147410a != 28) {
            return 1;
        }
        return C18446h.Companion.m97763b(c32020m72.f147411b.m40392W(), c32020m7.f147411b.m40392W());
    }

    /* renamed from: u */
    public static final int m102819u(C32020m7 c32020m7, C32020m7 c32020m72) {
        int m127121q;
        C31973j5 m40388T = c32020m72.f147411b.m40388T(false);
        C31973j5 m40388T2 = c32020m7.f147411b.m40388T(false);
        if (m40388T == null) {
            return -1;
        }
        if (m40388T2 == null) {
            return 1;
        }
        if (c32020m72.f147411b.m40392W() == null && c32020m7.f147411b.m40392W() == null) {
            m127121q = AbstractC24341v.m127121q(m40388T2.m153795z(), m40388T.m153795z(), true);
            return m127121q;
        }
        return C18446h.Companion.m97763b(c32020m72.f147411b.m40392W(), c32020m7.f147411b.m40392W());
    }

    /* renamed from: y */
    private final void m102820y(int i11) {
        try {
            if (f97471f) {
                return;
            }
            f97471f = true;
            f97475j.mo1704o8(new f(System.currentTimeMillis()));
            AbstractC23350e.m122774d(f97467b, "getGroupListFromServer: curPage " + f97474i + "   lastGroupId: " + f97473h);
            f97475j.mo1666j6(f97474i, f97473h, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m102832M();
        }
    }

    /* renamed from: A */
    public final String m102821A() {
        return f97473h;
    }

    /* renamed from: B */
    public final long m102822B() {
        return f97469d;
    }

    /* renamed from: C */
    public final LinkAttachment m102823C() {
        return f97464F;
    }

    /* renamed from: E */
    public final ArrayList m102824E() {
        return f97487v;
    }

    /* renamed from: F */
    public final int m102825F() {
        return f97468c;
    }

    /* renamed from: G */
    public final HashSet m102826G() {
        return f97483r;
    }

    /* renamed from: H */
    public final int m102827H(String str) {
        C31973j5 m4472f = C0943w.f3447a.m4472f(str);
        if (m4472f != null) {
            return m4472f.m153713E();
        }
        return 0;
    }

    /* renamed from: I */
    public final int m102828I() {
        return f97486u;
    }

    /* renamed from: J */
    public final ArrayList m102829J() {
        return f97479n;
    }

    /* renamed from: K */
    public final String m102830K() {
        return f97467b;
    }

    /* renamed from: L */
    public final int m102831L() {
        return C3432a.f14402a.m17241j().m17304c().m17318a(AbstractC3439h.m17280n());
    }

    /* renamed from: M */
    public final void m102832M() {
        int i11 = f97476k + 1;
        f97476k = i11;
        AbstractC23350e.m122774d(f97467b, "handleRetryGetGroupList: curPage " + i11);
        AbstractC23309i.m122141lp(AbstractC23160o0.m119261j0(f97476k, 15000L));
        f97472g = false;
        AbstractC23309i.m121171Lr(System.currentTimeMillis());
        f97471f = false;
        AbstractC0924m0.m4147ql(true);
    }

    /* renamed from: P */
    public final boolean m102833P(C31973j5 c31973j5) {
        boolean z11 = false;
        if (c31973j5 == null) {
            return false;
        }
        HashMap hashMap = f97484s;
        if (hashMap.containsKey(c31973j5.m153781r())) {
            Boolean bool = (Boolean) hashMap.get(c31973j5.m153781r());
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        if (f97483r.isEmpty()) {
            hashMap.put(c31973j5.m153781r(), Boolean.FALSE);
            return false;
        }
        C32076q5 m4476k = C0943w.f3447a.m4476k(c31973j5.m153781r());
        if (m4476k != null) {
            Iterator it = m4476k.m154718g().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (f97483r.contains((String) it.next()) && (i11 = i11 + 1) == 2) {
                    z11 = true;
                    break;
                }
            }
        }
        f97484s.put(c31973j5.m153781r(), Boolean.valueOf(z11));
        return z11;
    }

    /* renamed from: Q */
    public final boolean m102834Q() {
        if (C0943w.f3447a.m4475i().size() < m102831L()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final Pair m102835R(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "item");
        C31973j5 c31973j5 = new C31973j5(jSONObject);
        ArrayList<C31973j5.b> arrayList = new ArrayList();
        arrayList.addAll(c31973j5.m153754d());
        arrayList.addAll(c31973j5.m153760g());
        for (C31973j5.b bVar : arrayList) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, bVar.m153802d(), null, 2, null);
            if (m141798e == null || TextUtils.isEmpty(m141798e.f42437s) || TextUtils.isEmpty(m141798e.f42446v) || !TextUtils.equals(m141798e.f42446v, bVar.m153799a()) || !TextUtils.equals(m141798e.f42437s, bVar.m153800b()) || m141798e.f42352K0 != bVar.m153801c()) {
                ContactProfile contactProfile = new ContactProfile(bVar.m153802d());
                contactProfile.f42437s = bVar.m153800b();
                contactProfile.f42446v = bVar.m153799a();
                contactProfile.f42330D = System.currentTimeMillis();
                contactProfile.f42352K0 = bVar.m153801c();
                C7960e.m41971c6().m42221O7(contactProfile, false);
            }
        }
        String m153781r = c31973j5.m153781r();
        C32076q5 m4476k = C0943w.f3447a.m4476k(m153781r);
        if (m4476k == null) {
            m4476k = new C32076q5(m153781r);
        }
        m4476k.m154726o(c31973j5, jSONObject);
        if (c31973j5.m153732O() == 0) {
            c31973j5.m153731N0(m4476k.m154717f());
            AbstractC23350e.m122778h(new Exception("parseGroupData - Invalid totalMember"));
            AbstractC23350e.m122777g("parseGroupData- Invalid totalMember, gId:" + c31973j5.m153781r() + ", fullMemberCount:" + c31973j5.m153732O(), new Object[0]);
        }
        m102803N(c31973j5);
        return new Pair(c31973j5, m4476k);
    }

    /* renamed from: S */
    public final void m102836S(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsData");
        try {
            f97478m = "";
            f97479n.clear();
            JSONObject optJSONObject = jSONObject.optJSONObject("suggestGroup");
            if (optJSONObject != null) {
                f97478m = optJSONObject.optString("label");
                JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        C31070a c31070a = new C31070a(optJSONArray.getJSONObject(i11));
                        if (!TextUtils.isEmpty(c31070a.f143230c) && !TextUtils.equals("null", c31070a.f143230c)) {
                            C32020m7 c32020m7 = new C32020m7(15);
                            c32020m7.f147418i = c31070a;
                            f97479n.add(c32020m7);
                        }
                    }
                }
            }
            f97477l = null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
            if (optJSONObject2 != null) {
                f97477l = new C31070a(optJSONObject2);
            }
            f97480o = null;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("contentFirst");
            if (optJSONArray2 != null) {
                f97480o = new ArrayList();
                int length2 = optJSONArray2.length();
                C32020m7 c32020m72 = null;
                for (int i12 = 0; i12 < length2; i12++) {
                    Object obj = optJSONArray2.get(i12);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (new C31070a(jSONObject2).m150973a()) {
                        if (c32020m72 == null) {
                            c32020m72 = new C32020m7(21);
                            c32020m72.f147417h = new ArrayList();
                            ArrayList arrayList = f97480o;
                            AbstractC19074t.m100205c(arrayList);
                            arrayList.add(c32020m72);
                        }
                        c32020m72.f147417h.add(new C31070a(jSONObject2));
                    }
                    if (c32020m72 != null && c32020m72.f147417h.size() == 4) {
                        c32020m72 = null;
                    }
                }
                ArrayList arrayList2 = f97480o;
                AbstractC19074t.m100205c(arrayList2);
                if (arrayList2.size() > 0) {
                    ArrayList arrayList3 = f97480o;
                    AbstractC19074t.m100205c(arrayList3);
                    ((C32020m7) arrayList3.get(0)).f147416g = true;
                    ArrayList arrayList4 = f97480o;
                    AbstractC19074t.m100205c(arrayList4);
                    ArrayList arrayList5 = f97480o;
                    AbstractC19074t.m100205c(arrayList5);
                    ((C32020m7) arrayList4.get(arrayList5.size() - 1)).f147415f = true;
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: T */
    public final void m102837T(String str, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(jSONObject, "miniProfileJS");
        String optString = jSONObject.optString("globalId");
        if (optString == null || optString.length() == 0) {
            return;
        }
        C0824j.m2153b(new g(str, optString));
    }

    /* renamed from: U */
    public final void m102838U(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("mapGlobalIds")) == null) {
            return;
        }
        C0824j.m2153b(new h(optJSONObject));
    }

    /* renamed from: V */
    public final void m102839V(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: gw.g

            /* renamed from: p */
            public final /* synthetic */ String f97428p;

            public /* synthetic */ RunnableC19628g(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19637j.m102805W(r1);
            }
        }, 5000L);
    }

    /* renamed from: X */
    public final void m102840X() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gw.i
            @Override // java.lang.Runnable
            public final void run() {
                C19637j.m102806Y();
            }
        });
    }

    /* renamed from: Z */
    public final void m102841Z(String str) {
        try {
            for (C31973j5 c31973j5 : C0943w.f3447a.m4475i()) {
                C32076q5 m4476k = C0943w.f3447a.m4476k(c31973j5.m153781r());
                if (c31973j5.m153716G() == 0 && m4476k != null && m4476k.m154725n(str)) {
                    m102803N(c31973j5);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: a0 */
    public final void m102842a0(String str) {
        AbstractC19074t.m100208f(str, "id");
        int size = f97479n.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = f97479n.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C31070a c31070a = ((C32020m7) obj).f147418i;
            if (c31070a != null && AbstractC19074t.m100204b(c31070a.f143228a, str)) {
                f97479n.remove(i11);
                break;
            }
        }
        try {
            String m122566x4 = AbstractC23309i.m122566x4();
            if (TextUtils.isEmpty(m122566x4)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(m122566x4);
            JSONObject optJSONObject = jSONObject.optJSONObject("suggestGroup");
            if (optJSONObject != null) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                JSONArray jSONArray = new JSONArray();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                        if (!AbstractC19074t.m100204b(jSONObject2.optString("id"), str)) {
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
                optJSONObject.put("list", jSONArray);
                jSONObject.put("suggestGroup", optJSONObject);
            }
            AbstractC23309i.m121279Oo(jSONObject.toString());
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b0 */
    public final void m102843b0(boolean z11) {
        f97472g = z11;
    }

    /* renamed from: c0 */
    public final void m102844c0(int i11) {
        f97474i = i11;
    }

    /* renamed from: d0 */
    public final void m102845d0(boolean z11) {
        f97471f = z11;
    }

    /* renamed from: e0 */
    public final void m102846e0(boolean z11) {
        f97460B = z11;
    }

    /* renamed from: f0 */
    public final void m102847f0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "groupId");
        f97485t.put(str, Boolean.valueOf(z11));
    }

    /* renamed from: g0 */
    public final void m102848g0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f97473h = str;
    }

    /* renamed from: h0 */
    public final void m102849h0(long j11) {
        f97469d = j11;
    }

    /* renamed from: i */
    public final boolean m102850i(int i11) {
        if (!f97471f && System.currentTimeMillis() - AbstractC23309i.m122198n7() > AbstractC23309i.m121333Q4()) {
            f97474i = 1;
            f97473h = "0";
            m102820y(i11);
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final void m102851i0(boolean z11) {
        f97463E = z11;
    }

    /* renamed from: j */
    public final void m102852j() {
        f97476k = 0;
        f97481p = false;
        f97470e.clear();
        f97477l = null;
        f97480o = null;
        f97478m = "";
        f97479n.clear();
        f97484s.clear();
        f97474i = 1;
        f97473h = "0";
        AbstractC23309i.m121171Lr(0L);
        AbstractC23309i.m122184mu(0);
        C25490c.m132054j().m132061g();
    }

    /* renamed from: j0 */
    public final void m102853j0(LinkAttachment linkAttachment) {
        f97464F = linkAttachment;
    }

    /* renamed from: k */
    public final void m102854k(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        int size = f97470e.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = f97470e.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C32020m7 c32020m7 = (C32020m7) obj;
            ContactProfile contactProfile = c32020m7.f147411b;
            if (contactProfile != null && AbstractC19074t.m100204b(contactProfile.f42434r, str)) {
                c32020m7.f147411b.m40409i1(null);
                return;
            }
        }
    }

    /* renamed from: k0 */
    public final void m102855k0(int i11) {
        f97468c = i11;
    }

    /* renamed from: l */
    public final void m102856l(String str, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(str, z11));
            c0766k.mo1411D6(str, false);
        }
    }

    /* renamed from: l0 */
    public final void m102857l0(int i11) {
        f97476k = i11;
    }

    /* renamed from: m */
    public final void m102858m(String str) {
        AbstractC19074t.m100208f(str, "uId");
        int size = f97470e.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = f97470e.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            ContactProfile contactProfile = ((C32020m7) obj).f147411b;
            if (contactProfile != null) {
                if (AbstractC19074t.m100204b(contactProfile.f42434r, "group_" + str)) {
                    f97470e.remove(i11);
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public final void m102859n(String str, String str2) {
        if (!f97463E && str != null && str.length() != 0) {
            try {
                C0766k c0766k = new C0766k();
                f97463E = true;
                c0766k.mo1704o8(new c(str2));
                c0766k.mo1793z8(str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: o */
    public final List m102860o(C32076q5 c32076q5) {
        AbstractC19074t.m100208f(c32076q5, "groupMemberInfo");
        ArrayList arrayList = new ArrayList();
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String m154720i = c32076q5.m154720i();
            if (m154720i != null) {
                linkedHashSet.add(m154720i);
            }
            linkedHashSet.addAll(c32076q5.m154718g());
            if (linkedHashSet.size() > 4 && linkedHashSet.contains(CoreUtility.f89233i)) {
                linkedHashSet.remove(CoreUtility.f89233i);
            }
            arrayList.addAll(linkedHashSet);
            if (arrayList.size() > 4) {
                List subList = arrayList.subList(0, 4);
                AbstractC19074t.m100207e(subList, "subList(...)");
                return subList;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: p */
    public final boolean m102861p() {
        return f97472g;
    }

    /* renamed from: q */
    public final Map m102862q() {
        return f97488w;
    }

    /* renamed from: q0 */
    public final void m102863q0() {
        ZaloView zaloView;
        C17487o0 mo35579p;
        try {
            if (!f97460B && AbstractC23309i.m121308Pg() && !TextUtils.isEmpty(CoreUtility.f89233i) && System.currentTimeMillis() - f97461C > 60000 && MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.Companion.m125984a().m125967h() && MainTabView.m67645lM() != null) {
                InterfaceC27218a m92676n2 = MainTabView.m67645lM().m92676n2();
                if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                    zaloView = mo35579p.m93012K0();
                } else {
                    zaloView = null;
                }
                if ((zaloView instanceof MainTabView) && AbstractC23349d.m122770h() && !AbstractC23174p3.m119378c()) {
                    if (f97462D == null) {
                        f97462D = new C0766k();
                    }
                    InterfaceC0765j interfaceC0765j = f97462D;
                    AbstractC19074t.m100205c(interfaceC0765j);
                    interfaceC0765j.mo1704o8(new i());
                    f97460B = true;
                    InterfaceC0765j interfaceC0765j2 = f97462D;
                    AbstractC19074t.m100205c(interfaceC0765j2);
                    interfaceC0765j2.mo1598a9();
                    f97461C = System.currentTimeMillis();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r */
    public final int m102864r() {
        return f97474i;
    }

    /* renamed from: r0 */
    public final void m102865r0(String str, int i11) {
        if (str == null) {
            return;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        C0943w.f3447a.m4485y(str, i11);
    }

    /* renamed from: s */
    public final InterfaceC0765j m102866s() {
        return f97475j;
    }

    /* renamed from: s0 */
    public final void m102867s0(int i11) {
        f97486u = i11;
        AbstractC23309i.m121205Mo(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01e5  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedList m102868t(String str, String str2) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        String m118746s0;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str3 = str;
        int i21 = 1;
        boolean z14 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        Map m103209W = C19669z.Companion.m103232a().m103209W();
        LinkedList linkedList = new LinkedList();
        for (C31973j5 c31973j5 : C0943w.f3447a.m4475i()) {
            if (z14) {
                if (C21927m.m114302u().m114345m("group_" + c31973j5.m153781r())) {
                }
            }
            C32076q5 m4476k = C0943w.f3447a.m4476k(c31973j5.m153781r());
            if (m4476k != null && m4476k.m154725n(str3)) {
                C32020m7 c32020m7 = new C32020m7(27);
                ContactProfile contactProfile = new ContactProfile(i21, c31973j5.m153781r());
                c32020m7.f147413d = c31973j5;
                contactProfile.f42437s = c31973j5.m153793y();
                contactProfile.f42440t = c31973j5.m153795z();
                boolean m153778p0 = c31973j5.m153778p0();
                boolean m153747Y = c31973j5.m153747Y();
                if (!m153778p0) {
                    z11 = c31973j5.m153743U();
                    AbstractC19074t.m100205c(str);
                    z12 = c31973j5.m153780q0(str3);
                } else {
                    z11 = false;
                    z12 = false;
                }
                if (!z12) {
                    AbstractC19074t.m100205c(str);
                    z13 = m4476k.m154723l(str3);
                } else {
                    z13 = false;
                }
                if ((m153778p0 || z11) && !z12 && !z13) {
                    if (m153747Y) {
                        i11 = AbstractC8020f0.str_community_in_common_desc1;
                    } else {
                        i11 = AbstractC8020f0.str_group_in_common_desc1;
                    }
                    Object[] objArr = new Object[1];
                    if (m153778p0) {
                        if (m153747Y) {
                            i12 = AbstractC8020f0.str_community_owner_role;
                        } else {
                            i12 = AbstractC8020f0.str_owner_role;
                        }
                    } else if (m153747Y) {
                        i12 = AbstractC8020f0.str_community_admin_role;
                    } else {
                        i12 = AbstractC8020f0.str_admin_role;
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(i12);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    Locale locale = Locale.getDefault();
                    AbstractC19074t.m100207e(locale, "getDefault(...)");
                    String lowerCase = m118743r0.toLowerCase(locale);
                    AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                    objArr[0] = lowerCase;
                    m118746s0 = AbstractC23136l9.m118746s0(i11, objArr);
                } else if ((z12 || z13) && !m153778p0 && !z11) {
                    if (m153747Y) {
                        i13 = AbstractC8020f0.str_community_in_common_desc2;
                    } else {
                        i13 = AbstractC8020f0.str_group_in_common_desc2;
                    }
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = str2;
                    if (z12) {
                        if (m153747Y) {
                            i14 = AbstractC8020f0.str_community_owner_role;
                        } else {
                            i14 = AbstractC8020f0.str_owner_role;
                        }
                    } else if (m153747Y) {
                        i14 = AbstractC8020f0.str_community_admin_role;
                    } else {
                        i14 = AbstractC8020f0.str_admin_role;
                    }
                    String m118743r02 = AbstractC23136l9.m118743r0(i14);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    Locale locale2 = Locale.getDefault();
                    AbstractC19074t.m100207e(locale2, "getDefault(...)");
                    String lowerCase2 = m118743r02.toLowerCase(locale2);
                    AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
                    objArr2[1] = lowerCase2;
                    m118746s0 = AbstractC23136l9.m118746s0(i13, objArr2);
                } else if (z11 && z13) {
                    if (m153747Y) {
                        i19 = AbstractC8020f0.str_community_in_common_desc3;
                    } else {
                        i19 = AbstractC8020f0.str_group_in_common_desc3;
                    }
                    m118746s0 = AbstractC23136l9.m118743r0(i19);
                } else if ((!m153778p0 && !z11) || (!z13 && !z12)) {
                    m118746s0 = "";
                } else {
                    if (m153747Y) {
                        i15 = AbstractC8020f0.str_community_in_common_desc1;
                    } else {
                        i15 = AbstractC8020f0.str_group_in_common_desc1;
                    }
                    Object[] objArr3 = new Object[1];
                    if (m153778p0) {
                        if (m153747Y) {
                            i16 = AbstractC8020f0.str_community_owner_role;
                        } else {
                            i16 = AbstractC8020f0.str_owner_role;
                        }
                    } else if (m153747Y) {
                        i16 = AbstractC8020f0.str_community_admin_role;
                    } else {
                        i16 = AbstractC8020f0.str_admin_role;
                    }
                    String m118743r03 = AbstractC23136l9.m118743r0(i16);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    Locale locale3 = Locale.getDefault();
                    AbstractC19074t.m100207e(locale3, "getDefault(...)");
                    String lowerCase3 = m118743r03.toLowerCase(locale3);
                    AbstractC19074t.m100207e(lowerCase3, "toLowerCase(...)");
                    objArr3[0] = lowerCase3;
                    String m118746s02 = AbstractC23136l9.m118746s0(i15, objArr3);
                    if (m153747Y) {
                        i17 = AbstractC8020f0.str_community_in_common_desc2;
                    } else {
                        i17 = AbstractC8020f0.str_group_in_common_desc2;
                    }
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = str2;
                    if (z12) {
                        if (m153747Y) {
                            i18 = AbstractC8020f0.str_community_owner_role;
                        } else {
                            i18 = AbstractC8020f0.str_owner_role;
                        }
                    } else if (m153747Y) {
                        i18 = AbstractC8020f0.str_community_admin_role;
                    } else {
                        i18 = AbstractC8020f0.str_admin_role;
                    }
                    String m118743r04 = AbstractC23136l9.m118743r0(i18);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    Locale locale4 = Locale.getDefault();
                    AbstractC19074t.m100207e(locale4, "getDefault(...)");
                    String lowerCase4 = m118743r04.toLowerCase(locale4);
                    AbstractC19074t.m100207e(lowerCase4, "toLowerCase(...)");
                    objArr4[1] = lowerCase4;
                    m118746s0 = m118746s02 + "\n" + AbstractC23136l9.m118746s0(i17, objArr4);
                    contactProfile.m40401d1(m118746s0);
                    if (m103209W.containsKey(c31973j5.m153781r())) {
                        contactProfile.m40409i1((C18446h) m103209W.get(c31973j5.m153781r()));
                    }
                    c32020m7.f147411b = contactProfile;
                    linkedList.add(c32020m7);
                    str3 = str;
                    i21 = 1;
                }
                contactProfile.m40401d1(m118746s0);
                if (m103209W.containsKey(c31973j5.m153781r())) {
                }
                c32020m7.f147411b = contactProfile;
                linkedList.add(c32020m7);
                str3 = str;
                i21 = 1;
            } else {
                str3 = str;
            }
        }
        Collections.sort(linkedList, new Comparator() { // from class: gw.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m102819u;
                m102819u = C19637j.m102819u((C32020m7) obj, (C32020m7) obj2);
                return m102819u;
            }
        });
        return linkedList;
    }

    /* renamed from: v */
    public final int m102869v(String str) {
        boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        int i11 = 0;
        for (C31973j5 c31973j5 : C0943w.f3447a.m4475i()) {
            if (z11) {
                if (C21927m.m114302u().m114345m("group_" + c31973j5.m153781r())) {
                }
            }
            C32076q5 m4476k = C0943w.f3447a.m4476k(c31973j5.m153781r());
            if (m4476k != null && m4476k.m154725n(str)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: w */
    public final void m102870w(String str, a aVar) {
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(aVar, "listener");
        C0766k c0766k = new C0766k();
        C0943w c0943w = C0943w.f3447a;
        C18922m m99141t = C18922m.m99141t();
        AbstractC19074t.m100207e(m99141t, "getInstance(...)");
        c0766k.mo1704o8(new e(new C18419a(c0943w, this, m99141t, C7959d.Companion.m41850e(), C23744a.Companion.m124119a()), str, aVar));
        c0766k.mo1680l6(str, 0);
    }

    /* renamed from: x */
    public final ArrayList m102871x() {
        return f97470e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e4, code lost:            if (r4 != 3) goto L276;     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205 A[Catch: all -> 0x0078, TryCatch #2 {all -> 0x0078, blocks: (B:28:0x0067, B:30:0x006d, B:31:0x007b, B:33:0x007f, B:35:0x0087, B:37:0x008d, B:39:0x0091, B:40:0x00b9, B:42:0x00c7, B:44:0x00d8, B:46:0x00de, B:48:0x00e1, B:52:0x00e4, B:54:0x00ea, B:56:0x00f2, B:57:0x0108, B:59:0x010f, B:62:0x0124, B:64:0x0128, B:66:0x0130, B:68:0x0135, B:70:0x0133, B:74:0x013b, B:76:0x013f, B:77:0x0145, B:78:0x0162, B:80:0x0168, B:83:0x0172, B:86:0x017a, B:88:0x0184, B:91:0x0195, B:98:0x01a2, B:100:0x01ab, B:102:0x01c2, B:104:0x01d3, B:107:0x01d6, B:114:0x01fe, B:116:0x0205, B:120:0x021a, B:124:0x021f, B:128:0x025b, B:129:0x028e, B:131:0x0297, B:133:0x029b, B:135:0x02b9, B:137:0x02c1, B:139:0x02c7, B:140:0x02ea, B:145:0x02a3, B:146:0x0268, B:147:0x0275, B:148:0x0282, B:149:0x01e7, B:156:0x01fb, B:152:0x01ef, B:153:0x01f5, B:157:0x009c, B:159:0x00a7, B:161:0x00b0, B:162:0x00b4), top: B:27:0x0067, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0282 A[Catch: all -> 0x0078, TryCatch #2 {all -> 0x0078, blocks: (B:28:0x0067, B:30:0x006d, B:31:0x007b, B:33:0x007f, B:35:0x0087, B:37:0x008d, B:39:0x0091, B:40:0x00b9, B:42:0x00c7, B:44:0x00d8, B:46:0x00de, B:48:0x00e1, B:52:0x00e4, B:54:0x00ea, B:56:0x00f2, B:57:0x0108, B:59:0x010f, B:62:0x0124, B:64:0x0128, B:66:0x0130, B:68:0x0135, B:70:0x0133, B:74:0x013b, B:76:0x013f, B:77:0x0145, B:78:0x0162, B:80:0x0168, B:83:0x0172, B:86:0x017a, B:88:0x0184, B:91:0x0195, B:98:0x01a2, B:100:0x01ab, B:102:0x01c2, B:104:0x01d3, B:107:0x01d6, B:114:0x01fe, B:116:0x0205, B:120:0x021a, B:124:0x021f, B:128:0x025b, B:129:0x028e, B:131:0x0297, B:133:0x029b, B:135:0x02b9, B:137:0x02c1, B:139:0x02c7, B:140:0x02ea, B:145:0x02a3, B:146:0x0268, B:147:0x0275, B:148:0x0282, B:149:0x01e7, B:156:0x01fb, B:152:0x01ef, B:153:0x01f5, B:157:0x009c, B:159:0x00a7, B:161:0x00b0, B:162:0x00b4), top: B:27:0x0067, inners: #0 }] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m102872z() {
        C31070a c31070a;
        int size;
        int i11;
        MainApplication.C6895a c6895a;
        int i12;
        C2806e c2806e;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        ArrayList arrayList = new ArrayList();
        List m103200Q = C19669z.Companion.m103232a().m103200Q();
        int size2 = m103200Q.size();
        for (int i13 = 0; i13 < size2; i13++) {
            try {
                ContactProfile m40996I = ((Conversation) m103200Q.get(i13)).m40996I();
                if (!TextUtils.isEmpty(m40996I.f42434r)) {
                    String str = m40996I.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    if ((!z14 || !C21927m.m114302u().m114345m(str)) && m40996I.m40374K0()) {
                        C32020m7 c32020m7 = new C32020m7(1);
                        c32020m7.f147411b = m40996I;
                        arrayList.add(c32020m7);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        synchronized (arrayList) {
            try {
                if (AbstractC23309i.m120813C2()) {
                    arrayList2.add(new C32020m7(36));
                }
                if (f97481p && f97470e.isEmpty() && arrayList.isEmpty() && !f97471f) {
                    arrayList2.add(new C32020m7(17));
                } else {
                    C32020m7 c32020m72 = new C32020m7(16);
                    C31070a c31070a2 = f97477l;
                    if (c31070a2 != null) {
                        AbstractC19074t.m100205c(c31070a2);
                        if (c31070a2.m150973a()) {
                            c31070a = f97477l;
                            c32020m72.f147418i = c31070a;
                            arrayList2.add(c32020m72);
                        }
                    }
                    c31070a = null;
                    c32020m72.f147418i = c31070a;
                    arrayList2.add(c32020m72);
                }
                ArrayList arrayList3 = new ArrayList();
                int size3 = f97479n.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    Object obj = f97479n.get(i14);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    C32020m7 c32020m73 = (C32020m7) obj;
                    C31070a c31070a3 = c32020m73.f147418i;
                    if (c31070a3 != null && c31070a3.m150973a()) {
                        arrayList3.add(c32020m73);
                    }
                }
                if (arrayList3.size() > 0) {
                    if (!TextUtils.isEmpty(f97478m)) {
                        C32020m7 c32020m74 = new C32020m7(6);
                        ContactProfile contactProfile = new ContactProfile("suggestFriend");
                        contactProfile.f42437s = f97478m;
                        c32020m74.f147411b = contactProfile;
                        arrayList2.add(c32020m74);
                    }
                    int size4 = arrayList3.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        Object obj2 = arrayList3.get(i15);
                        AbstractC19074t.m100207e(obj2, "get(...)");
                        C32020m7 c32020m75 = (C32020m7) obj2;
                        if (i15 == arrayList3.size() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c32020m75.f147415f = z13;
                        if (z13) {
                            if (f97470e.size() > 0) {
                                c32020m75.f147416g = true;
                            }
                        } else {
                            c32020m75.f147416g = false;
                        }
                        arrayList2.add(c32020m75);
                    }
                }
                ArrayList arrayList4 = f97480o;
                if (arrayList4 != null) {
                    AbstractC19074t.m100205c(arrayList4);
                    arrayList2.addAll(arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                HashSet hashSet = new HashSet();
                long mo124311f = C23793c.Companion.m124321a().mo124311f() - 259200000;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C32020m7 c32020m76 = (C32020m7) it.next();
                    if (c32020m76.f147410a == 1 && c32020m76.f147411b.m40374K0()) {
                        if (c32020m76.f147411b.m40402e0() < mo124311f && f97466a.m102833P(c32020m76.f147411b.m40388T(false))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c32020m76.f147427r = z12;
                        arrayList5.add(c32020m76);
                        hashSet.add(c32020m76.f147411b.f42434r);
                    }
                }
                int size5 = f97470e.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    Object obj3 = f97470e.get(i16);
                    AbstractC19074t.m100207e(obj3, "get(...)");
                    C32020m7 c32020m77 = (C32020m7) obj3;
                    if (!hashSet.contains(c32020m77.f147411b.f42434r)) {
                        c32020m77.f147427r = f97466a.m102833P(c32020m77.f147411b.m40388T(false));
                        arrayList5.add(c32020m77);
                    }
                }
                int m122492v4 = AbstractC23309i.m122492v4();
                f97486u = m122492v4;
                try {
                } catch (Exception e12) {
                    AbstractC23350e.m122778h(e12);
                }
                if (m122492v4 != 0) {
                    if (m122492v4 != 1) {
                        if (m122492v4 == 2) {
                            Collections.sort(arrayList5, f97459A);
                        }
                    } else {
                        Collections.sort(arrayList5, f97491z);
                    }
                    size = arrayList5.size();
                    for (i11 = 0; i11 < size; i11++) {
                        Object obj4 = arrayList5.get(i11);
                        AbstractC19074t.m100207e(obj4, "get(...)");
                        C32020m7 c32020m78 = (C32020m7) obj4;
                        if (i11 == arrayList5.size() - 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c32020m78.f147415f = z11;
                    }
                    C32020m7 c32020m79 = new C32020m7(7);
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    c6895a = MainApplication.Companion;
                    String string = c6895a.m35500c().getString(AbstractC8020f0.title_section_my_group_list);
                    AbstractC19074t.m100207e(string, "getString(...)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(arrayList5.size())}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    c32020m79.f147428s = format;
                    i12 = f97486u;
                    if (i12 == 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                c32020m79.f147429t = c6895a.m35500c().getString(AbstractC8020f0.str_item_menu_filter);
                            } else {
                                c32020m79.f147429t = c6895a.m35500c().getString(AbstractC8020f0.str_sort_by_group_recent_activity);
                            }
                        } else {
                            c32020m79.f147429t = c6895a.m35500c().getString(AbstractC8020f0.str_sort_by_group_manage);
                        }
                    } else {
                        c32020m79.f147429t = c6895a.m35500c().getString(AbstractC8020f0.str_sort_by_group_name);
                    }
                    arrayList2.add(c32020m79);
                    if (arrayList5.size() != 0 || (f97486u == 2 && !f97466a.m102804O(arrayList5))) {
                        C32020m7 c32020m710 = new C32020m7(19);
                        c32020m710.f147428s = c6895a.m35500c().getString(AbstractC8020f0.str_msg_not_manage_any_group);
                        arrayList2.add(c32020m710);
                    }
                    c2806e = C2806e.f11255a;
                    if (c2806e.m13582g() > 0 && AbstractC23309i.m120961G2()) {
                        C32020m7 c32020m711 = new C32020m7(35);
                        ContactProfile contactProfile2 = new ContactProfile();
                        contactProfile2.f42375S = 35;
                        contactProfile2.f42434r = "-1000000";
                        contactProfile2.m40409i1(new C18446h(c2806e.m13576a()));
                        c32020m711.f147411b = contactProfile2;
                        arrayList2.add(c32020m711);
                    }
                    arrayList2.addAll(arrayList5);
                }
                Collections.sort(arrayList5, f97489x);
                size = arrayList5.size();
                while (i11 < size) {
                }
                C32020m7 c32020m792 = new C32020m7(7);
                C19067n0 c19067n02 = C19067n0.f94947a;
                c6895a = MainApplication.Companion;
                String string2 = c6895a.m35500c().getString(AbstractC8020f0.title_section_my_group_list);
                AbstractC19074t.m100207e(string2, "getString(...)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(arrayList5.size())}, 1));
                AbstractC19074t.m100207e(format2, "format(...)");
                c32020m792.f147428s = format2;
                i12 = f97486u;
                if (i12 == 1) {
                }
                arrayList2.add(c32020m792);
                if (arrayList5.size() != 0) {
                }
                C32020m7 c32020m7102 = new C32020m7(19);
                c32020m7102.f147428s = c6895a.m35500c().getString(AbstractC8020f0.str_msg_not_manage_any_group);
                arrayList2.add(c32020m7102);
                c2806e = C2806e.f11255a;
                if (c2806e.m13582g() > 0) {
                    C32020m7 c32020m7112 = new C32020m7(35);
                    ContactProfile contactProfile22 = new ContactProfile();
                    contactProfile22.f42375S = 35;
                    contactProfile22.f42434r = "-1000000";
                    contactProfile22.m40409i1(new C18446h(c2806e.m13576a()));
                    c32020m7112.f147411b = contactProfile22;
                    arrayList2.add(c32020m7112);
                }
                arrayList2.addAll(arrayList5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList2;
    }
}
