package p055ce;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: ce.a */
/* loaded from: classes3.dex */
public final class C3432a {

    /* renamed from: b */
    private static boolean f14403b;

    /* renamed from: c */
    private static boolean f14404c;

    /* renamed from: m */
    private static boolean f14414m;

    /* renamed from: a */
    public static final C3432a f14402a = new C3432a();

    /* renamed from: d */
    private static final HashMap f14405d = new HashMap();

    /* renamed from: e */
    private static C3443l f14406e = new C3443l();

    /* renamed from: f */
    private static String f14407f = "https://h5-biz.zalo.me";

    /* renamed from: g */
    private static String f14408g = "https://h5-biz.zalo.me/packages";

    /* renamed from: h */
    private static String f14409h = "https://h5-biz.zalo.me";

    /* renamed from: i */
    private static String f14410i = "https://h5-biz.zalo.me";

    /* renamed from: j */
    private static String f14411j = "https://h5-biz.zalo.me";

    /* renamed from: k */
    private static String f14412k = "https://h5-biz.zalo.me";

    /* renamed from: l */
    private static String f14413l = "https://h5-biz.zalo.me";

    /* renamed from: ce.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f14415a;

        /* renamed from: b */
        private final String f14416b;

        public a(int i11, String str) {
            AbstractC19074t.m100208f(str, "name");
            this.f14415a = i11;
            this.f14416b = str;
        }

        /* renamed from: a */
        public final String m17247a() {
            return this.f14416b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14415a == aVar.f14415a && AbstractC19074t.m100204b(this.f14416b, aVar.f14416b);
        }

        public int hashCode() {
            return (this.f14415a * 31) + this.f14416b.hashCode();
        }

        public String toString() {
            return "Package(id=" + this.f14415a + ", name=" + this.f14416b + ")";
        }
    }

    private C3432a() {
    }

    /* renamed from: a */
    public final void m17232a() {
        synchronized (this) {
            f14403b = false;
            f14404c = false;
            f14405d.clear();
            f14406e = new C3443l();
            f14407f = "";
            f14409h = "";
            f14410i = "";
            f14411j = "";
            f14412k = "";
            f14408g = "";
            f14414m = false;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: b */
    public final String m17233b() {
        if (!f14403b) {
            m17245n();
        }
        return f14409h;
    }

    /* renamed from: c */
    public final boolean m17234c() {
        if (!f14403b) {
            m17245n();
        }
        return f14404c;
    }

    /* renamed from: d */
    public final boolean m17235d() {
        return f14414m;
    }

    /* renamed from: e */
    public final String m17236e() {
        if (!f14403b) {
            m17245n();
        }
        return f14408g;
    }

    /* renamed from: f */
    public final String m17237f() {
        if (!f14403b) {
            m17245n();
        }
        return f14407f;
    }

    /* renamed from: g */
    public final String m17238g() {
        if (!f14403b) {
            m17245n();
        }
        return f14410i;
    }

    /* renamed from: h */
    public final String m17239h() {
        if (!f14403b) {
            m17245n();
        }
        return f14411j;
    }

    /* renamed from: i */
    public final a m17240i(int i11) {
        if (!f14403b) {
            m17245n();
        }
        return (a) f14405d.get(Integer.valueOf(i11));
    }

    /* renamed from: j */
    public final C3443l m17241j() {
        return f14406e;
    }

    /* renamed from: k */
    public final String m17242k() {
        if (!f14403b) {
            m17245n();
        }
        return f14413l;
    }

    /* renamed from: l */
    public final String m17243l() {
        if (!f14403b) {
            m17245n();
        }
        return f14412k;
    }

    /* renamed from: m */
    public final void m17244m(JSONObject jSONObject) {
        boolean z11;
        if (jSONObject == null) {
            return;
        }
        synchronized (this) {
            try {
                if (jSONObject.optInt("enable", 0) >= 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f14404c = z11;
                String optString = jSONObject.optString("info_url", "https://h5-biz.zalo.me");
                AbstractC19074t.m100207e(optString, "optString(...)");
                f14407f = optString;
                String optString2 = jSONObject.optString("edit_url", "https://h5-biz.zalo.me");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                f14409h = optString2;
                String optString3 = jSONObject.optString("intro_url", "https://h5-biz.zalo.me");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                f14410i = optString3;
                String optString4 = jSONObject.optString("landingpage_url", "https://h5-biz.zalo.me");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                f14411j = optString4;
                String optString5 = jSONObject.optString("shortlink_info_url", "https://h5-biz.zalo.me");
                AbstractC19074t.m100207e(optString5, "optString(...)");
                f14412k = optString5;
                String optString6 = jSONObject.optString("reachlimitfriend_info_url", "https://h5-biz.zalo.me");
                AbstractC19074t.m100207e(optString6, "optString(...)");
                f14413l = optString6;
                String optString7 = jSONObject.optString("iap_url", "https://h5-biz.zalo.me/packages");
                AbstractC19074t.m100207e(optString7, "optString(...)");
                f14408g = optString7;
                JSONArray optJSONArray = jSONObject.optJSONArray("packages");
                if (optJSONArray != null) {
                    AbstractC19074t.m100205c(optJSONArray);
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        int optInt = jSONObject2.optInt("id", -1);
                        String optString8 = jSONObject2.optString("name", "");
                        if (optInt >= 0) {
                            Integer valueOf = Integer.valueOf(optInt);
                            HashMap hashMap = f14405d;
                            AbstractC19074t.m100205c(optString8);
                            hashMap.put(valueOf, new a(optInt, optString8));
                        }
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("packages_config");
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    f14406e.m17310i(optJSONObject);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("extra");
                if (optJSONObject2 != null) {
                    AbstractC19074t.m100205c(optJSONObject2);
                    f14406e.m17311j(optJSONObject2);
                }
                f14403b = true;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public final void m17245n() {
        JSONObject jSONObject;
        try {
            String m4389z = AbstractC0924m0.m4389z();
            if (m4389z == null) {
                m4389z = "";
            }
            if (m4389z.length() > 0) {
                jSONObject = new JSONObject(m4389z);
            } else {
                jSONObject = new JSONObject();
            }
            m17244m(jSONObject);
            f14403b = true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o */
    public final void m17246o(JSONObject jSONObject) {
        String str;
        m17244m(jSONObject);
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        AbstractC0924m0.m3870he(str);
    }
}
