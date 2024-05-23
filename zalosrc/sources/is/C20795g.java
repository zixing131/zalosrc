package is;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vg.AbstractC28025b8;

/* renamed from: is.g */
/* loaded from: classes4.dex */
public final class C20795g {

    /* renamed from: a */
    public static final C20795g f102172a;

    /* renamed from: b */
    private static boolean f102173b;

    /* renamed from: c */
    private static String f102174c;

    /* renamed from: d */
    private static b f102175d;

    /* renamed from: e */
    private static a f102176e;

    /* renamed from: f */
    private static boolean f102177f;

    /* renamed from: g */
    private static c f102178g;

    /* renamed from: is.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f102179a = true;

        /* renamed from: b */
        private boolean f102180b = true;

        /* renamed from: c */
        private boolean f102181c = true;

        /* renamed from: d */
        private boolean f102182d = true;

        /* renamed from: e */
        private boolean f102183e;

        /* renamed from: f */
        private boolean f102184f;

        /* renamed from: g */
        private boolean f102185g;

        /* renamed from: h */
        private boolean f102186h;

        /* renamed from: a */
        public final boolean m108505a() {
            return this.f102184f;
        }

        /* renamed from: b */
        public final boolean m108506b() {
            return this.f102183e;
        }

        /* renamed from: c */
        public final boolean m108507c() {
            return this.f102180b;
        }

        /* renamed from: d */
        public final boolean m108508d() {
            return this.f102181c;
        }

        /* renamed from: e */
        public final boolean m108509e() {
            return this.f102182d;
        }

        /* renamed from: f */
        public final boolean m108510f() {
            return this.f102179a;
        }

        /* renamed from: g */
        public final boolean m108511g() {
            return this.f102185g;
        }

        /* renamed from: h */
        public final boolean m108512h() {
            return this.f102186h;
        }

        /* renamed from: i */
        public final void m108513i(boolean z11) {
            this.f102183e = z11;
        }

        /* renamed from: j */
        public final void m108514j(boolean z11) {
            this.f102180b = z11;
        }

        /* renamed from: k */
        public final void m108515k(boolean z11) {
            this.f102181c = z11;
        }

        /* renamed from: l */
        public final void m108516l(boolean z11) {
            this.f102182d = z11;
        }

        /* renamed from: m */
        public final void m108517m(boolean z11) {
            this.f102179a = z11;
        }

        /* renamed from: n */
        public final void m108518n(boolean z11) {
            this.f102185g = z11;
        }

        /* renamed from: o */
        public final void m108519o(boolean z11) {
            this.f102186h = z11;
        }
    }

    /* renamed from: is.g$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f102187a;

        /* renamed from: b */
        private final String f102188b;

        public b(String str, String str2) {
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
            this.f102187a = str;
            this.f102188b = str2;
        }

        /* renamed from: a */
        public final String m108520a() {
            return this.f102188b;
        }

        /* renamed from: b */
        public final String m108521b() {
            return this.f102187a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f102187a, bVar.f102187a) && AbstractC19074t.m100204b(this.f102188b, bVar.f102188b);
        }

        public int hashCode() {
            return (this.f102187a.hashCode() * 31) + this.f102188b.hashCode();
        }

        public String toString() {
            return "MyOAInfo(actionType=" + this.f102187a + ", actionData=" + this.f102188b + ")";
        }
    }

    /* renamed from: is.g$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final int f102189a;

        /* renamed from: b */
        private final String f102190b;

        /* renamed from: c */
        private final String f102191c;

        /* renamed from: d */
        private final String f102192d;

        public c(int i11, String str, String str2, String str3) {
            AbstractC19074t.m100208f(str, "urlQRWallet");
            AbstractC19074t.m100208f(str2, "actionType");
            AbstractC19074t.m100208f(str3, "actionData");
            this.f102189a = i11;
            this.f102190b = str;
            this.f102191c = str2;
            this.f102192d = str3;
        }

        /* renamed from: a */
        public final String m108522a() {
            return this.f102192d;
        }

        /* renamed from: b */
        public final String m108523b() {
            return this.f102191c;
        }

        /* renamed from: c */
        public final int m108524c() {
            return this.f102189a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f102189a == cVar.f102189a && AbstractC19074t.m100204b(this.f102190b, cVar.f102190b) && AbstractC19074t.m100204b(this.f102191c, cVar.f102191c) && AbstractC19074t.m100204b(this.f102192d, cVar.f102192d);
        }

        public int hashCode() {
            return (((((this.f102189a * 31) + this.f102190b.hashCode()) * 31) + this.f102191c.hashCode()) * 31) + this.f102192d.hashCode();
        }

        public String toString() {
            return "QRWalletInfo(itemQRWallet=" + this.f102189a + ", urlQRWallet=" + this.f102190b + ", actionType=" + this.f102191c + ", actionData=" + this.f102192d + ")";
        }
    }

    static {
        C20795g c20795g = new C20795g();
        f102172a = c20795g;
        f102174c = "https://h5.zdn.vn/zapps/220259427665569271/";
        f102176e = new a();
        String m3616Z = AbstractC0924m0.m3616Z();
        if (m3616Z == null) {
            m3616Z = "";
        }
        c20795g.m108503h(m3616Z, false);
    }

    private C20795g() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(1:15)(1:74)|16|(9:18|19|20|(1:22)|23|(1:25)|26|27|(18:(1:30)(1:66)|31|(14:33|34|35|(1:37)|38|(1:40)|41|(1:43)(1:63)|(1:45)(1:62)|(1:61)(1:50)|51|(2:(1:57)|58)|59|60)|65|34|35|(0)|38|(0)|41|(0)(0)|(0)(0)|(0)|61|51|(0)|59|60)(16:(15:68|34|35|(0)|38|(0)|41|(0)(0)|(0)(0)|(0)|61|51|(0)|59|60)|65|34|35|(0)|38|(0)|41|(0)(0)|(0)(0)|(0)|61|51|(0)|59|60))|73|19|20|(0)|23|(0)|26|27|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0066, code lost:            r12 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007d, code lost:            r8 = pm0.C24861r.f119264q;        r12 = pm0.C24861r.m129218b(pm0.AbstractC24862s.m129227a(r12));     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0072  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m108496g(JSONObject jSONObject, boolean z11) {
        JSONObject jSONObject2;
        int i11;
        Object m129218b;
        Throwable m129221e;
        Object m129218b2;
        Throwable m129221e2;
        JSONObject jSONObject3;
        String str;
        String str2;
        c cVar;
        JSONObject optJSONObject;
        Object obj;
        String optString;
        Object obj2;
        if (f102177f) {
            return;
        }
        String str3 = null;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject("enable_items");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            i11 = jSONObject2.optInt("qr_wallet", 1);
        } else {
            i11 = 1;
        }
        try {
            C24861r.a aVar = C24861r.f119264q;
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (z11) {
            if (jSONObject != null) {
                obj2 = jSONObject.remove("urlQRWallet");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                optString = (String) obj2;
                m129218b = C24861r.m129218b(optString);
                m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                    m129221e.printStackTrace();
                }
                if (C24861r.m129223g(m129218b)) {
                    m129218b = null;
                }
                String str4 = (String) m129218b;
                if (!z11) {
                    if (jSONObject != null) {
                        obj = jSONObject.remove("qrWalletInfo");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof JSONObject) {
                        optJSONObject = (JSONObject) obj;
                        m129218b2 = C24861r.m129218b(optJSONObject);
                        m129221e2 = C24861r.m129221e(m129218b2);
                        if (m129221e2 != null) {
                            m129221e2.printStackTrace();
                        }
                        if (C24861r.m129223g(m129218b2)) {
                            m129218b2 = null;
                        }
                        jSONObject3 = (JSONObject) m129218b2;
                        if (jSONObject3 == null) {
                            str = jSONObject3.optString("actionType");
                        } else {
                            str = null;
                        }
                        if (jSONObject3 == null) {
                            str2 = jSONObject3.optString("actionData");
                        } else {
                            str2 = null;
                        }
                        if (str4 == null && jSONObject3 != null && str != null && str2 != null) {
                            cVar = new c(i11, str4, str, str2);
                        } else {
                            cVar = null;
                        }
                        f102178g = cVar;
                        if (z11) {
                            if (str4 != null && jSONObject3 != null && str != null && str2 != null) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("urlQRWallet", str4);
                                jSONObject4.put("qrWalletInfo", jSONObject3);
                                jSONObject4.put("enable_items", new JSONObject().put("qr_wallet", i11));
                                str3 = jSONObject4.toString();
                            }
                            AbstractC0924m0.m3196Ke(str3);
                        }
                        f102177f = true;
                        return;
                    }
                    optJSONObject = null;
                    m129218b2 = C24861r.m129218b(optJSONObject);
                    m129221e2 = C24861r.m129221e(m129218b2);
                    if (m129221e2 != null) {
                    }
                    if (C24861r.m129223g(m129218b2)) {
                    }
                    jSONObject3 = (JSONObject) m129218b2;
                    if (jSONObject3 == null) {
                    }
                    if (jSONObject3 == null) {
                    }
                    if (str4 == null) {
                    }
                    cVar = null;
                    f102178g = cVar;
                    if (z11) {
                    }
                    f102177f = true;
                    return;
                }
                if (jSONObject != null) {
                    optJSONObject = jSONObject.optJSONObject("qrWalletInfo");
                    m129218b2 = C24861r.m129218b(optJSONObject);
                    m129221e2 = C24861r.m129221e(m129218b2);
                    if (m129221e2 != null) {
                    }
                    if (C24861r.m129223g(m129218b2)) {
                    }
                    jSONObject3 = (JSONObject) m129218b2;
                    if (jSONObject3 == null) {
                    }
                    if (jSONObject3 == null) {
                    }
                    if (str4 == null) {
                    }
                    cVar = null;
                    f102178g = cVar;
                    if (z11) {
                    }
                    f102177f = true;
                    return;
                }
                optJSONObject = null;
                m129218b2 = C24861r.m129218b(optJSONObject);
                m129221e2 = C24861r.m129221e(m129218b2);
                if (m129221e2 != null) {
                }
                if (C24861r.m129223g(m129218b2)) {
                }
                jSONObject3 = (JSONObject) m129218b2;
                if (jSONObject3 == null) {
                }
                if (jSONObject3 == null) {
                }
                if (str4 == null) {
                }
                cVar = null;
                f102178g = cVar;
                if (z11) {
                }
                f102177f = true;
                return;
            }
            optString = null;
            m129218b = C24861r.m129218b(optString);
            m129221e = C24861r.m129221e(m129218b);
            if (m129221e != null) {
            }
            if (C24861r.m129223g(m129218b)) {
            }
            String str42 = (String) m129218b;
            if (!z11) {
            }
        } else {
            if (jSONObject != null) {
                optString = jSONObject.optString("urlQRWallet");
                m129218b = C24861r.m129218b(optString);
                m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                }
                if (C24861r.m129223g(m129218b)) {
                }
                String str422 = (String) m129218b;
                if (!z11) {
                }
            }
            optString = null;
            m129218b = C24861r.m129218b(optString);
            m129221e = C24861r.m129221e(m129218b);
            if (m129221e != null) {
            }
            if (C24861r.m129223g(m129218b)) {
            }
            String str4222 = (String) m129218b;
            if (!z11) {
            }
        }
    }

    /* renamed from: a */
    public final a m108497a() {
        return f102176e;
    }

    /* renamed from: b */
    public final boolean m108498b() {
        return f102173b;
    }

    /* renamed from: c */
    public final b m108499c() {
        return f102175d;
    }

    /* renamed from: d */
    public final c m108500d() {
        return f102178g;
    }

    /* renamed from: e */
    public final List m108501e() {
        ArrayList arrayList = new ArrayList();
        for (EnumC20799i enumC20799i : EnumC20799i.Companion.m108531a()) {
            arrayList.add("tip.tabme.new_feature." + enumC20799i.m108530d());
            arrayList.add("tip.tabme.critical_issue." + enumC20799i.m108530d());
        }
        ArrayList m141457m = AbstractC28025b8.m141457m((String[]) arrayList.toArray(new String[0]));
        AbstractC19074t.m100207e(m141457m, "getPromoteNotiInfoList(...)");
        return m141457m;
    }

    /* renamed from: f */
    public final void m108502f() {
        JSONObject jSONObject;
        String m3646a0 = AbstractC0924m0.m3646a0();
        try {
            C24861r.a aVar = C24861r.f119264q;
            C20795g c20795g = f102172a;
            if (m3646a0 != null && m3646a0.length() != 0) {
                jSONObject = new JSONObject(m3646a0);
                c20795g.m108496g(jSONObject, false);
                C24861r.m129218b(C24848g0.f119245a);
            }
            jSONObject = null;
            c20795g.m108496g(jSONObject, false);
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /* renamed from: h */
    public final void m108503h(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "str");
        try {
            if (str.length() > 0) {
                m108504i(new JSONObject(str), z11);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: i */
    public final void m108504i(JSONObject jSONObject, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        if (jSONObject == null) {
            return;
        }
        try {
            String optString = jSONObject.optString("urlOA", "https://h5.zdn.vn/zapps/220259427665569271/");
            AbstractC19074t.m100207e(optString, "optString(...)");
            f102174c = optString;
            if (jSONObject.optInt("enable_tabme", 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            f102173b = z12;
            JSONObject optJSONObject = jSONObject.optJSONObject("enable_items");
            if (optJSONObject != null) {
                a aVar = f102176e;
                if (optJSONObject.optInt("storage", 1) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                aVar.m108517m(z13);
                if (optJSONObject.optInt("my_oa", 1) == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                aVar.m108514j(z14);
                if (optJSONObject.optInt("my_qr", 1) == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                aVar.m108515k(z15);
                if (optJSONObject.optInt("qr_wallet", 1) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                aVar.m108516l(z16);
                if (optJSONObject.optInt("ba_tool", 1) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                aVar.m108513i(z17);
                if (optJSONObject.optInt("local_storage_manage", 0) == 1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                aVar.m108518n(z18);
                if (optJSONObject.optInt("zcloud", 0) == 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                aVar.m108519o(z19);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("myOAInfo");
            if (optJSONObject2 != null) {
                String optString2 = optJSONObject2.optString("actionType");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                String optString3 = optJSONObject2.optString("actionData");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                f102175d = new b(optString2, optString3);
            }
            if (z11) {
                f102177f = false;
                m108496g(jSONObject, true);
                AbstractC0924m0.m3167Je(jSONObject.toString());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
