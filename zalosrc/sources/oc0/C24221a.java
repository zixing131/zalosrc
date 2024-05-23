package oc0;

import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: oc0.a */
/* loaded from: classes6.dex */
public final class C24221a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f116908a;

    /* renamed from: b */
    private int f116909b;

    /* renamed from: c */
    private int f116910c;

    /* renamed from: d */
    private String f116911d;

    /* renamed from: e */
    private boolean f116912e;

    /* renamed from: f */
    private final List f116913f;

    /* renamed from: g */
    private String f116914g;

    /* renamed from: h */
    private boolean f116915h;

    /* renamed from: i */
    private final List f116916i;

    /* renamed from: j */
    private boolean f116917j;

    /* renamed from: k */
    private String f116918k;

    /* renamed from: l */
    private boolean f116919l;

    /* renamed from: m */
    private boolean f116920m;

    /* renamed from: n */
    private boolean f116921n;

    /* renamed from: o */
    private String f116922o;

    /* renamed from: p */
    private boolean f116923p;

    /* renamed from: q */
    private boolean f116924q;

    /* renamed from: r */
    private boolean f116925r;

    /* renamed from: s */
    private String f116926s;

    /* renamed from: t */
    private boolean f116927t;

    /* renamed from: u */
    private boolean f116928u;

    /* renamed from: v */
    private boolean f116929v;

    /* renamed from: w */
    private boolean f116930w;

    /* renamed from: x */
    private boolean f116931x;

    /* renamed from: y */
    private boolean f116932y;

    /* renamed from: oc0.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24221a() {
        this.f116909b = 5;
        this.f116910c = 2;
        this.f116911d = "";
        this.f116913f = new ArrayList();
        this.f116914g = "";
        this.f116916i = new ArrayList();
        this.f116918k = "";
        this.f116922o = "";
        this.f116926s = "";
        this.f116929v = true;
        this.f116930w = true;
    }

    /* renamed from: A */
    private final void m126324A(JSONObject jSONObject) {
        boolean z11;
        JSONObject optJSONObject = jSONObject.optJSONObject("group");
        if (optJSONObject == null) {
            return;
        }
        String optString = optJSONObject.optString("title");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f116922o = optString;
        boolean z12 = false;
        if (optJSONObject.optInt("showTitle", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f116923p = z11;
        if (optJSONObject.optInt("showList", 0) == 1) {
            z12 = true;
        }
        this.f116924q = z12;
    }

    /* renamed from: B */
    private final void m126325B(JSONObject jSONObject) {
        boolean z11;
        JSONObject optJSONObject = jSONObject.optJSONObject("recent");
        if (optJSONObject == null) {
            return;
        }
        String optString = optJSONObject.optString("title");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f116918k = optString;
        boolean z12 = false;
        if (optJSONObject.optInt("showTitle", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f116919l = z11;
        if (optJSONObject.optInt("showList", 0) == 1) {
            z12 = true;
        }
        this.f116920m = z12;
    }

    /* renamed from: C */
    private final void m126326C(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("suggestion");
        if (optJSONObject == null) {
            return;
        }
        String optString = optJSONObject.optString("title");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f116914g = optString;
        boolean z11 = true;
        if (optJSONObject.optInt("showTitle", 0) != 1) {
            z11 = false;
        }
        this.f116915h = z11;
        JSONArray optJSONArray = optJSONObject.optJSONArray("list");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                if (optJSONObject2 != null) {
                    ContactProfile contactProfile = new ContactProfile(optJSONObject2.optString("uid"));
                    contactProfile.f42437s = optJSONObject2.optString("dpn");
                    contactProfile.f42446v = optJSONObject2.optString("avt");
                    this.f116916i.add(contactProfile);
                }
            }
        }
    }

    /* renamed from: y */
    private final void m126327y(JSONObject jSONObject) {
        boolean z11;
        JSONObject optJSONObject = jSONObject.optJSONObject("contact");
        if (optJSONObject == null) {
            return;
        }
        String optString = optJSONObject.optString("title");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f116926s = optString;
        boolean z12 = false;
        if (optJSONObject.optInt("showTitle", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f116927t = z11;
        if (optJSONObject.optInt("showList", 0) == 1) {
            z12 = true;
        }
        this.f116928u = z12;
    }

    /* renamed from: z */
    private final void m126328z(JSONObject jSONObject) {
        boolean z11;
        JSONObject optJSONObject = jSONObject.optJSONObject("destinations");
        if (optJSONObject == null) {
            return;
        }
        String optString = optJSONObject.optString("title");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f116911d = optString;
        if (optJSONObject.optInt("showTitle", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f116912e = z11;
        JSONArray optJSONArray = optJSONObject.optJSONArray("list");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                int optInt = optJSONArray.optInt(i11);
                if (optInt != 1) {
                    if (optInt != 2) {
                        if (optInt == 3) {
                            this.f116913f.add(new ContactProfile("-3"));
                        }
                    } else {
                        this.f116913f.add(new ContactProfile("-2"));
                    }
                } else {
                    this.f116913f.add(new ContactProfile("-1"));
                }
            }
        }
    }

    /* renamed from: D */
    public final void m126329D(int i11) {
        this.f116910c = i11;
    }

    /* renamed from: E */
    public final void m126330E(boolean z11) {
        this.f116908a = z11;
    }

    /* renamed from: F */
    public final void m126331F(boolean z11) {
        this.f116931x = z11;
    }

    /* renamed from: G */
    public final void m126332G(boolean z11) {
        this.f116930w = z11;
    }

    /* renamed from: H */
    public final void m126333H(boolean z11) {
        this.f116929v = z11;
    }

    /* renamed from: I */
    public final void m126334I(boolean z11) {
        this.f116925r = z11;
    }

    /* renamed from: J */
    public final void m126335J(boolean z11) {
        this.f116921n = z11;
    }

    /* renamed from: K */
    public final void m126336K(boolean z11) {
        this.f116917j = z11;
    }

    /* renamed from: L */
    public final void m126337L(boolean z11) {
        this.f116920m = z11;
    }

    /* renamed from: M */
    public final void m126338M(boolean z11) {
        this.f116928u = z11;
    }

    /* renamed from: N */
    public final void m126339N(boolean z11) {
        this.f116924q = z11;
    }

    /* renamed from: O */
    public final void m126340O(boolean z11) {
        this.f116927t = z11;
    }

    /* renamed from: P */
    public final void m126341P(boolean z11) {
        this.f116912e = z11;
    }

    /* renamed from: Q */
    public final void m126342Q(boolean z11) {
        this.f116923p = z11;
    }

    /* renamed from: R */
    public final void m126343R(boolean z11) {
        this.f116919l = z11;
    }

    /* renamed from: S */
    public final void m126344S(boolean z11) {
        this.f116915h = z11;
    }

    /* renamed from: T */
    public final void m126345T(boolean z11) {
        this.f116932y = z11;
    }

    /* renamed from: U */
    public final void m126346U(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f116926s = str;
    }

    /* renamed from: V */
    public final void m126347V(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f116911d = str;
    }

    /* renamed from: W */
    public final void m126348W(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f116922o = str;
    }

    /* renamed from: X */
    public final void m126349X(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f116918k = str;
    }

    /* renamed from: Y */
    public final void m126350Y(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f116914g = str;
    }

    /* renamed from: a */
    public final int m126351a() {
        return this.f116910c;
    }

    /* renamed from: b */
    public final List m126352b() {
        return this.f116913f;
    }

    /* renamed from: c */
    public final List m126353c() {
        return this.f116916i;
    }

    /* renamed from: d */
    public final int m126354d() {
        return this.f116909b;
    }

    /* renamed from: e */
    public final String m126355e() {
        return this.f116926s;
    }

    /* renamed from: f */
    public final String m126356f() {
        return this.f116911d;
    }

    /* renamed from: g */
    public final String m126357g() {
        return this.f116922o;
    }

    /* renamed from: h */
    public final String m126358h() {
        return this.f116918k;
    }

    /* renamed from: i */
    public final String m126359i() {
        return this.f116914g;
    }

    /* renamed from: j */
    public final boolean m126360j() {
        return this.f116908a;
    }

    /* renamed from: k */
    public final boolean m126361k() {
        return this.f116931x;
    }

    /* renamed from: l */
    public final boolean m126362l() {
        return this.f116929v;
    }

    /* renamed from: m */
    public final boolean m126363m() {
        return this.f116925r;
    }

    /* renamed from: n */
    public final boolean m126364n() {
        return this.f116921n;
    }

    /* renamed from: o */
    public final boolean m126365o() {
        return this.f116917j;
    }

    /* renamed from: p */
    public final boolean m126366p() {
        return this.f116920m;
    }

    /* renamed from: q */
    public final boolean m126367q() {
        return this.f116928u;
    }

    /* renamed from: r */
    public final boolean m126368r() {
        return this.f116924q;
    }

    /* renamed from: s */
    public final boolean m126369s() {
        return this.f116927t;
    }

    /* renamed from: t */
    public final boolean m126370t() {
        return this.f116912e;
    }

    /* renamed from: u */
    public final boolean m126371u() {
        return this.f116923p;
    }

    /* renamed from: v */
    public final boolean m126372v() {
        return this.f116919l;
    }

    /* renamed from: w */
    public final boolean m126373w() {
        return this.f116915h;
    }

    /* renamed from: x */
    public final boolean m126374x() {
        return this.f116932y;
    }

    public C24221a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f116909b = 5;
        this.f116910c = 2;
        this.f116911d = "";
        this.f116913f = new ArrayList();
        this.f116914g = "";
        this.f116916i = new ArrayList();
        this.f116918k = "";
        this.f116922o = "";
        this.f116926s = "";
        boolean z11 = true;
        this.f116929v = true;
        this.f116930w = true;
        try {
            this.f116909b = jSONObject.optInt("numSection", 5);
            if (jSONObject.optInt("multiSelect", 0) != 1) {
                z11 = false;
            }
            this.f116908a = z11;
            this.f116910c = jSONObject.optInt("gender", 2);
            m126328z(jSONObject);
            m126326C(jSONObject);
            m126325B(jSONObject);
            m126324A(jSONObject);
            m126327y(jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
