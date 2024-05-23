package c30;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import am.C0927o;
import c30.C3233c;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.LinkedHashMap;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p038bl.C2834f;
import p394oj.C24280f;
import p471r3.C25630b;
import p485rj.C25811c;
import p588vw.C28644j;
import pm0.C24848g0;
import vg.C28020b3;

/* renamed from: c30.c */
/* loaded from: classes5.dex */
public final class C3233c {

    /* renamed from: b */
    private static C3245i f13806b;

    /* renamed from: d */
    private static boolean f13808d;

    /* renamed from: a */
    public static final C3233c f13805a = new C3233c();

    /* renamed from: c */
    private static final LinkedHashMap f13807c = new LinkedHashMap();

    /* renamed from: c30.c$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC20094a {
        a() {
        }

        /* renamed from: d */
        public static final void m16430d(Object obj) {
            AbstractC19074t.m100208f(obj, "$o");
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        AbstractC0924m0.m3438So(System.currentTimeMillis() + (optJSONObject.optInt("expired_time") * 1000));
                        long optLong = optJSONObject.optLong("version");
                        C3229a c3229a = C3229a.f13790a;
                        if (optLong > c3229a.m16393g()) {
                            c3229a.m16401p(optLong);
                            C3233c c3233c = C3233c.f13805a;
                            c3233c.m16422g(optJSONObject);
                            C28644j.m143226P(c3233c.m16424d().f13854b);
                            C2834f.f11325a.m13686e();
                            AbstractC0924m0.m3079Gd(optJSONObject.toString());
                        }
                    }
                } catch (Exception e11) {
                    AbstractC0924m0.m3438So(System.currentTimeMillis() + 3600000);
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            } finally {
                C3233c.f13805a.m16427h(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() == 50001) {
                AbstractC0924m0.m3438So(System.currentTimeMillis() + 300000);
            } else {
                AbstractC0924m0.m3438So(System.currentTimeMillis() + 3600000);
            }
            C3233c.f13805a.m16427h(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c30.b

                /* renamed from: p */
                public final /* synthetic */ Object f13800p;

                public /* synthetic */ RunnableC3231b(Object obj2) {
                    r1 = obj2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3233c.a.m16430d(r1);
                }
            });
        }
    }

    private C3233c() {
    }

    /* renamed from: c */
    private final C3245i m16421c() {
        C3245i c3245i = new C3245i();
        c3245i.f13854b = -10;
        c3245i.m16468k(C3229a.f13790a.m16388b());
        return c3245i;
    }

    /* renamed from: g */
    public final void m16422g(JSONObject jSONObject) {
        JSONArray jSONArray;
        LinkedHashMap linkedHashMap = f13807c;
        synchronized (linkedHashMap) {
            try {
                linkedHashMap.clear();
                JSONArray optJSONArray = jSONObject.optJSONArray("stickers");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    int i11 = 0;
                    while (i11 < length) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            AbstractC19074t.m100205c(optJSONObject);
                            int optInt = optJSONObject.optInt("id");
                            String optString = optJSONObject.optString("thumb");
                            int optInt2 = optJSONObject.optInt("width");
                            int optInt3 = optJSONObject.optInt("height");
                            int optInt4 = optJSONObject.optInt("rootCateId");
                            C3251l c3251l = new C3251l(2);
                            C25630b c25630b = new C25630b();
                            c25630b.m132405O(optInt);
                            c25630b.m132404N(-10);
                            AbstractC19074t.m100205c(optString);
                            c25630b.m132428f0(optString);
                            c25630b.m132407Q(C28020b3.f130648a.m141209z(optString));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(optInt);
                            jSONArray = optJSONArray;
                            C25811c c25811c = new C25811c("", optString, optInt2, optInt3, sb2.toString(), null, 1, optInt4, optInt);
                            c25811c.m133100l(new C24280f(optString, optInt2, optInt3, ""));
                            c3251l.m16521k(c25811c);
                            c3251l.m16522l(c25630b);
                            f13807c.put(c3251l.m16512b(), c3251l);
                        } else {
                            jSONArray = optJSONArray;
                        }
                        i11++;
                        optJSONArray = jSONArray;
                    }
                }
                C3233c c3233c = f13805a;
                c3233c.m16424d().f13868p = f13807c.size();
                c3233c.m16424d().f13875w = -1;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m16423b() {
        f13806b = null;
        C3229a.f13790a.m16397k();
    }

    /* renamed from: d */
    public final C3245i m16424d() {
        C3245i c3245i = f13806b;
        if (c3245i == null) {
            C3245i m16421c = m16421c();
            f13806b = m16421c;
            return m16421c;
        }
        return c3245i;
    }

    /* renamed from: e */
    public final void m16425e() {
        if (!f13808d && C23055e5.m118272g(false)) {
            f13808d = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a());
            c0766k.mo1775x6(1);
        }
    }

    /* renamed from: f */
    public final LinkedHashMap m16426f() {
        String m3765e;
        try {
            m3765e = AbstractC0924m0.m3765e();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (m3765e != null && m3765e.length() != 0) {
            m16422g(new JSONObject(m3765e));
            return f13807c;
        }
        LinkedHashMap linkedHashMap = f13807c;
        synchronized (linkedHashMap) {
            linkedHashMap.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        m16424d().f13868p = 0;
        return f13807c;
    }

    /* renamed from: h */
    public final void m16427h(boolean z11) {
        f13808d = z11;
    }

    /* renamed from: i */
    public final void m16428i(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        if (jSONObject.optLong("version") > C3229a.f13790a.m16393g()) {
            AbstractC0924m0.m3438So(System.currentTimeMillis());
            m16425e();
        }
    }
}
