package n00;

import ae.C0766k;
import ai.C0862b;
import ai.InterfaceC0861a;
import android.text.SpannableStringBuilder;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import ga0.C19322f1;
import ga0.C19357r0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23006a0;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23139m1;
import me0.C23282z6;
import mm0.AbstractC23350e;
import n00.C23512f;
import o00.C23975a;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.C21927m;
import p612wk.AbstractC29072d;
import p716zh.C31853b5;
import pm0.C24848g0;
import pm0.C24860q;
import qe0.AbstractC25251g;
import qm0.AbstractC25356m;
import qm0.AbstractC25376w;
import sk.AbstractC26305f;
import sk.C26302c;
import sk.C26303d;
import sk.EnumC26306g;
import tk.C26725d;

/* renamed from: n00.d */
/* loaded from: classes4.dex */
public final class C23510d extends AbstractC23514h {

    /* renamed from: t */
    private final byte f114157t;

    /* renamed from: u */
    private final HashMap f114158u;

    /* renamed from: v */
    private final C23512f.a f114159v;

    /* renamed from: w */
    private final List f114160w;

    /* renamed from: x */
    private final long f114161x;

    /* renamed from: n00.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C26302c f114163r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18505l f114164s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C26302c c26302c, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f114163r = c26302c;
            this.f114164s = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m123404a(Object obj) {
            if (!C23510d.this.isCancelled() && obj != null) {
                C26725d m135410k = this.f114163r.m135410k();
                C23510d c23510d = C23510d.this;
                synchronized (m135410k) {
                    m135410k.m137457d(obj);
                    m135410k.m137458e(c23510d.m123420l());
                    m135410k.m137459f(System.currentTimeMillis());
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
            this.f114164s.mo205i9(obj);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m123404a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: n00.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f114165a;

        public b(InterfaceC18505l interfaceC18505l) {
            this.f114165a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            this.f114165a.mo205i9(obj);
        }
    }

    /* renamed from: n00.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f114166a;

        public c(InterfaceC18505l interfaceC18505l) {
            this.f114166a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            this.f114166a.mo205i9(null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* renamed from: n00.d$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19059j0 f114168r;

        /* renamed from: s */
        final /* synthetic */ boolean[] f114169s;

        /* renamed from: t */
        final /* synthetic */ int f114170t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f114171u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C19059j0 c19059j0, boolean[] zArr, int i11, InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f114168r = c19059j0;
            this.f114169s = zArr;
            this.f114170t = i11;
            this.f114171u = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m123405a(Object obj) {
            if (C23510d.this.isCancelled()) {
                return;
            }
            this.f114168r.f94941p = obj;
            this.f114169s[this.f114170t] = true;
            this.f114171u.mo12V4();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m123405a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: n00.d$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19059j0 f114173r;

        /* renamed from: s */
        final /* synthetic */ boolean[] f114174s;

        /* renamed from: t */
        final /* synthetic */ int f114175t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f114176u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C19059j0 c19059j0, boolean[] zArr, int i11, InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f114173r = c19059j0;
            this.f114174s = zArr;
            this.f114175t = i11;
            this.f114176u = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m123406a(List list) {
            AbstractC19074t.m100208f(list, "it");
            if (C23510d.this.isCancelled()) {
                return;
            }
            this.f114173r.f94941p = list;
            this.f114174s[this.f114175t] = true;
            this.f114176u.mo12V4();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m123406a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: n00.d$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean[] f114177q;

        /* renamed from: r */
        final /* synthetic */ C19059j0 f114178r;

        /* renamed from: s */
        final /* synthetic */ C23510d f114179s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f114180t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean[] zArr, C19059j0 c19059j0, C23510d c23510d, C19059j0 c19059j02) {
            super(0);
            this.f114177q = zArr;
            this.f114178r = c19059j0;
            this.f114179s = c23510d;
            this.f114180t = c19059j02;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m123407a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m123407a() {
            for (boolean z11 : this.f114177q) {
                if (!z11) {
                    return;
                }
            }
            Object obj = this.f114178r.f94941p;
            if (obj != null) {
                this.f114179s.m123399t(obj, (List) this.f114180t.f94941p);
            } else {
                this.f114179s.m123398s();
            }
        }
    }

    public /* synthetic */ C23510d(InterfaceC18319c interfaceC18319c, String str, byte b11, HashMap hashMap, C23512f.a aVar, List list, long j11, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, str, b11, hashMap, aVar, list, (i11 & 64) != 0 ? System.currentTimeMillis() : j11);
    }

    /* renamed from: p */
    private final void m123395p(List list, String str, int i11) {
        ContactProfile contactProfile;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            contactProfile = null;
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((InterfaceC0861a) obj).mo2478b(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC0861a interfaceC0861a = (InterfaceC0861a) obj;
        if (interfaceC0861a != null) {
            if (interfaceC0861a instanceof ContactProfile) {
                contactProfile = (ContactProfile) interfaceC0861a;
            }
            if (contactProfile != null) {
                contactProfile.f42352K0 = i11;
                contactProfile.f42447v0 = i11;
            }
        }
    }

    /* renamed from: q */
    private final void m123396q(InterfaceC18505l interfaceC18505l) {
        Object obj;
        C26302c c26302c;
        C18316b c18316b;
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C26302c) {
            c26302c = (C26302c) obj;
        } else {
            c26302c = null;
        }
        if (c26302c == null) {
            return;
        }
        C26725d m135410k = c26302c.m135410k();
        if (m135410k.m137455b().contentEquals(m123420l()) && Math.abs(m135410k.m137456c() - System.currentTimeMillis()) <= 10000) {
            interfaceC18505l.mo205i9(m135410k.m137454a());
            return;
        }
        m135410k.m137457d(null);
        m135410k.m137459f(0L);
        m135410k.m137458e("");
        m123397r(m123420l(), AbstractC23006a0.m117905e(), 1, 50, this.f114157t, new a(c26302c, interfaceC18505l));
    }

    /* renamed from: r */
    private final void m123397r(String str, int i11, int i12, int i13, int i14, InterfaceC18505l interfaceC18505l) {
        if (C23975a.f116042a.m125471a(str)) {
            C0766k c0766k = new C0766k();
            AbstractC25251g.m130681a(c0766k, new b(interfaceC18505l));
            AbstractC25251g.m130681a(c0766k, new c(interfaceC18505l));
            c0766k.mo1677ka(str, i11, i12, i13, i14, 87);
            return;
        }
        interfaceC18505l.mo205i9(new Object());
    }

    /* renamed from: s */
    public final void m123398s() {
        EnumC26306g enumC26306g = EnumC26306g.f124953q;
        String m123420l = m123420l();
        ArrayList arrayList = new ArrayList();
        AbstractC29072d.a aVar = AbstractC29072d.a.f134803a;
        mo205i9(new C18316b("ACTION_SEARCH_DISCOVERY_TASK_RESULT_SET_DATA", AbstractC26305f.m135430a(new C26303d(enumC26306g, m123420l, arrayList, aVar), new C26303d(EnumC26306g.f124954r, m123420l(), this.f114159v.m123416a(), aVar), new C26303d(EnumC26306g.f124955s, m123420l(), this.f114159v.m123417b(), aVar)), null, null, 12, null));
    }

    /* renamed from: t */
    public final void m123399t(Object obj, List list) {
        m101437d().mo2040a(new Runnable() { // from class: n00.c

            /* renamed from: p */
            public final /* synthetic */ Object f114154p;

            /* renamed from: q */
            public final /* synthetic */ C23510d f114155q;

            /* renamed from: r */
            public final /* synthetic */ List f114156r;

            public /* synthetic */ RunnableC23509c(Object obj2, C23510d this, List list2) {
                r1 = obj2;
                r2 = this;
                r3 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C23510d.m123400u(r1, r2, r3);
            }
        });
    }

    /* renamed from: u */
    public static final void m123400u(Object obj, C23510d c23510d, List list) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        AbstractC19074t.m100208f(obj, "$oasMiniAppResult");
        AbstractC19074t.m100208f(c23510d, "this$0");
        try {
            JSONArray jSONArray2 = null;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("data");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                jSONArray = jSONObject2.optJSONArray("oaSearchRS");
            } else {
                jSONArray = null;
            }
            if (jSONObject2 != null) {
                jSONArray2 = jSONObject2.optJSONArray("miniAppRS");
            }
            if (c23510d.isCancelled()) {
                return;
            }
            C24860q m123402x = c23510d.m123402x(jSONArray);
            List list2 = (List) m123402x.m129215c();
            List list3 = (List) m123402x.m129216d();
            if (c23510d.isCancelled()) {
                return;
            }
            List m123401w = c23510d.m123401w(jSONArray2);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    if (!c23510d.f114158u.containsKey(contactProfile.f42434r)) {
                        HashMap hashMap = c23510d.f114158u;
                        String str = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str, "uid");
                        String str2 = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str2, "uid");
                        hashMap.put(str, str2);
                        list3.add(contactProfile);
                    }
                }
            }
            if (c23510d.isCancelled()) {
                return;
            }
            EnumC26306g enumC26306g = EnumC26306g.f124953q;
            String m123420l = c23510d.m123420l();
            AbstractC29072d.d dVar = AbstractC29072d.d.f134806a;
            c23510d.mo205i9(new C18316b("ACTION_SEARCH_DISCOVERY_TASK_RESULT_SET_DATA", AbstractC26305f.m135430a(new C26303d(enumC26306g, m123420l, m123401w, dVar), new C26303d(EnumC26306g.f124954r, c23510d.m123420l(), list2, dVar), new C26303d(EnumC26306g.f124955s, c23510d.m123420l(), list3, dVar)), null, null, 12, null));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            if (c23510d.isCancelled()) {
                return;
            }
            c23510d.m123398s();
        }
    }

    /* renamed from: w */
    private final List m123401w(JSONArray jSONArray) {
        List m123418c = this.f114159v.m123418c();
        if (C19322f1.f95950a.m101159p()) {
            List<C0862b> m123403y = m123403y(jSONArray);
            HashSet hashSet = new HashSet();
            for (C0862b c0862b : m123403y) {
                if (!hashSet.contains(c0862b.mo2478b())) {
                    m123418c.add(c0862b);
                    hashSet.add(c0862b.mo2478b());
                }
            }
        }
        return m123418c;
    }

    /* renamed from: x */
    private final C24860q m123402x(JSONArray jSONArray) {
        String str;
        int i11;
        int i12;
        ContactProfile contactProfile;
        ArrayList arrayList;
        CharSequence m127168X0;
        String obj;
        List m131320c;
        JSONArray jSONArray2 = jSONArray;
        String str2 = "dpn";
        List m123417b = this.f114159v.m123417b();
        List m123416a = this.f114159v.m123416a();
        if (jSONArray2 != null && jSONArray.length() > 0) {
            C31853b5 m114357s = C21927m.m114302u().m114357s();
            String[] m118488a = C23282z6.m120367c(m123420l(), 4096).m118488a();
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArray.length();
            int i13 = 0;
            while (i13 < length) {
                if (isCancelled()) {
                    return new C24860q(m123416a, m123417b);
                }
                try {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i13);
                    String optString = jSONObject.optString("uid");
                    int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    if (this.f114158u.containsKey(optString)) {
                        AbstractC19074t.m100205c(optString);
                        m123395p(m123417b, optString, optInt);
                        m123395p(m123416a, optString, optInt);
                        str = str2;
                        i11 = i13;
                        i12 = length;
                    } else {
                        HashMap hashMap = this.f114158u;
                        AbstractC19074t.m100205c(optString);
                        hashMap.put(optString, optString);
                        String optString2 = jSONObject.optString("desc");
                        i12 = length;
                        try {
                            contactProfile = new ContactProfile(optString);
                            contactProfile.f42441t0 = jSONObject.optBoolean("is_fan");
                            contactProfile.f42446v = jSONObject.optString("avt");
                            contactProfile.f42438s0 = jSONObject.optInt("ttf");
                            contactProfile.f42437s = jSONObject.optString(str2);
                            contactProfile.f42444u0 = jSONObject.optBoolean("chatable");
                            contactProfile.f42447v0 = optInt;
                            contactProfile.f42352K0 = optInt;
                            contactProfile.f42453x0 = jSONObject.optInt("group_msg", 1);
                            contactProfile.f42392X1 = i13;
                            arrayList2.clear();
                            arrayList = new ArrayList();
                            String str3 = contactProfile.f42437s;
                            AbstractC19074t.m100207e(str3, str2);
                            m127168X0 = AbstractC24342w.m127168X0(str3);
                            obj = m127168X0.toString();
                            i11 = i13;
                            str = str2;
                        } catch (Exception e11) {
                            e = e11;
                            str = str2;
                            i11 = i13;
                            e.printStackTrace();
                            i13 = i11 + 1;
                            jSONArray2 = jSONArray;
                            length = i12;
                            str2 = str;
                        }
                        try {
                            AbstractC23262x6.m119994g(m123420l(), obj, contactProfile, arrayList2, arrayList, 0);
                            String str4 = contactProfile.f42434r;
                            AbstractC19074t.m100207e(str4, "uid");
                            contactProfile.f42387W = C23024b7.m118038J(str4, obj, this.f114160w, this.f114161x, 0, null) + 1.0f;
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                contactProfile.f42399a1.add(Integer.valueOf(((Number) it.next()).intValue()));
                            }
                            arrayList2.clear();
                            m131320c = AbstractC25356m.m131320c(m118488a);
                            contactProfile.f42436r1 = AbstractC23217t2.m119655g(optString2, m131320c, 0);
                            if (m114357s.m153137g(contactProfile.f42434r)) {
                                m123416a.add(contactProfile);
                            } else {
                                m123417b.add(contactProfile);
                            }
                        } catch (Exception e12) {
                            e = e12;
                            e.printStackTrace();
                            i13 = i11 + 1;
                            jSONArray2 = jSONArray;
                            length = i12;
                            str2 = str;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    str = str2;
                    i11 = i13;
                    i12 = length;
                }
                i13 = i11 + 1;
                jSONArray2 = jSONArray;
                length = i12;
                str2 = str;
            }
            C23139m1 c23139m1 = C23139m1.f112256a;
            AbstractC25376w.m131534w(m123416a, c23139m1.m118798l());
            AbstractC25376w.m131534w(m123417b, c23139m1.m118798l());
        }
        return new C24860q(m123416a, m123417b);
    }

    /* renamed from: y */
    private final List m123403y(JSONArray jSONArray) {
        String str;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        List m131320c;
        List m131320c2;
        JSONArray jSONArray2 = jSONArray;
        String str2 = "findMatchWordFromArrKeyWord(...)";
        ArrayList arrayList = new ArrayList();
        if (jSONArray2 != null && jSONArray.length() > 0) {
            String[] m118488a = C23282z6.m120367c(m123420l(), 4096).m118488a();
            int length = jSONArray.length();
            int i11 = 0;
            while (i11 < length) {
                if (isCancelled()) {
                    return arrayList;
                }
                try {
                    jSONObject = jSONArray2.getJSONObject(i11);
                    optJSONObject = jSONObject.optJSONObject("mpInfo");
                } catch (Exception e11) {
                    e = e11;
                    str = str2;
                }
                if (optJSONObject == null) {
                    return arrayList;
                }
                String optString = jSONObject.optString("mpUrl");
                if (optString == null) {
                    return arrayList;
                }
                String optString2 = optJSONObject.optString("appId");
                if (optString2 == null) {
                    return arrayList;
                }
                String optString3 = optJSONObject.optString("appName", "");
                String optString4 = optJSONObject.optString("appAvtUrl", "");
                String optString5 = optJSONObject.optString("appVersion", "");
                optJSONObject.optString("appQRUrl", "");
                String optString6 = optJSONObject.optString("appDesc", "");
                m131320c = AbstractC25356m.m131320c(m118488a);
                try {
                    SpannableStringBuilder m119655g = AbstractC23217t2.m119655g(optString3, m131320c, 0);
                    AbstractC19074t.m100207e(m119655g, str2);
                    m131320c2 = AbstractC25356m.m131320c(m118488a);
                    SpannableStringBuilder m119655g2 = AbstractC23217t2.m119655g(optString6, m131320c2, 0);
                    AbstractC19074t.m100207e(m119655g2, str2);
                    AbstractC19074t.m100205c(optString4);
                    AbstractC19074t.m100205c(optString5);
                    str = str2;
                    try {
                        C0862b c0862b = new C0862b(optString2, optString, m119655g, optString4, optString5, new String[0], m119655g2, jSONObject);
                        c0862b.mo2483i(C23024b7.m118038J(c0862b.mo2478b(), c0862b.mo2475c(), this.f114160w, this.f114161x, 0, null) + 1.0f);
                        arrayList.add(c0862b);
                    } catch (Exception e12) {
                        e = e12;
                        AbstractC23350e.m122778h(e);
                        i11++;
                        jSONArray2 = jSONArray;
                        str2 = str;
                    }
                } catch (Exception e13) {
                    e = e13;
                    str = str2;
                }
                i11++;
                jSONArray2 = jSONArray;
                str2 = str;
            }
        }
        return arrayList;
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        if (isCancelled()) {
            return;
        }
        C19059j0 c19059j0 = new C19059j0();
        C19059j0 c19059j02 = new C19059j0();
        boolean[] zArr = {false, false};
        f fVar = new f(zArr, c19059j0, this, c19059j02);
        m123396q(new d(c19059j0, zArr, 0, fVar));
        C19357r0.m101447f(4, new e(c19059j02, zArr, 1, fVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23510d(InterfaceC18319c interfaceC18319c, String str, byte b11, HashMap hashMap, C23512f.a aVar, List list, long j11) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "mapUidContact");
        AbstractC19074t.m100208f(aVar, "resultSearchLocal");
        AbstractC19074t.m100208f(list, "listRecentClickData");
        this.f114157t = b11;
        this.f114158u = hashMap;
        this.f114159v = aVar;
        this.f114160w = list;
        this.f114161x = j11;
    }
}
