package nz;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: nz.b */
/* loaded from: classes4.dex */
public final class C23965b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f115981a;

    /* renamed from: b */
    private String f115982b;

    /* renamed from: c */
    private String f115983c;

    /* renamed from: d */
    private String f115984d;

    /* renamed from: e */
    private String f115985e;

    /* renamed from: f */
    private String f115986f;

    /* renamed from: g */
    private String f115987g;

    /* renamed from: h */
    private String f115988h;

    /* renamed from: i */
    private String f115989i;

    /* renamed from: j */
    private String f115990j;

    /* renamed from: k */
    private String f115991k;

    /* renamed from: l */
    private String f115992l;

    /* renamed from: m */
    private String f115993m;

    /* renamed from: n */
    private String f115994n;

    /* renamed from: o */
    private String f115995o;

    /* renamed from: p */
    private String f115996p;

    /* renamed from: q */
    private String f115997q;

    /* renamed from: nz.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C23965b() {
        this.f115981a = "";
        this.f115982b = "";
        this.f115983c = "";
        this.f115984d = "";
        this.f115985e = "";
        this.f115986f = "";
        this.f115987g = "";
        this.f115988h = "";
        this.f115989i = "";
        this.f115990j = "";
        this.f115991k = "";
        this.f115992l = "";
        this.f115993m = "";
        this.f115994n = "";
        this.f115995o = "";
        this.f115996p = "";
        this.f115997q = "";
    }

    /* renamed from: a */
    public final String m125406a() {
        return this.f115981a;
    }

    /* renamed from: b */
    public final String m125407b() {
        return this.f115991k;
    }

    /* renamed from: c */
    public final String m125408c() {
        return this.f115990j;
    }

    /* renamed from: d */
    public final String m125409d() {
        return this.f115994n;
    }

    /* renamed from: e */
    public final String m125410e() {
        return this.f115993m;
    }

    /* renamed from: f */
    public final String m125411f() {
        return this.f115988h;
    }

    /* renamed from: g */
    public final String m125412g() {
        return this.f115987g;
    }

    /* renamed from: h */
    public final String m125413h() {
        return this.f115982b;
    }

    /* renamed from: i */
    public final String m125414i() {
        return this.f115997q;
    }

    /* renamed from: j */
    public final String m125415j() {
        return this.f115995o;
    }

    /* renamed from: k */
    public final String m125416k() {
        return this.f115996p;
    }

    /* renamed from: l */
    public final String m125417l() {
        return this.f115986f;
    }

    /* renamed from: m */
    public final String m125418m() {
        return this.f115985e;
    }

    /* renamed from: n */
    public final String m125419n() {
        return this.f115984d;
    }

    /* renamed from: o */
    public final String m125420o() {
        return this.f115983c;
    }

    public C23965b(JSONObject jSONObject) {
        this();
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("action", "");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f115981a = optString;
        String optString2 = jSONObject.optString("level", "");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f115982b = optString2;
        JSONObject optJSONObject = jSONObject.optJSONObject("title");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("before");
            if (optJSONObject2 != null) {
                AbstractC19074t.m100205c(optJSONObject2);
                String optString3 = optJSONObject2.optString("vi", "");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                this.f115983c = optString3;
                String optString4 = optJSONObject2.optString("en", "");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                this.f115984d = optString4;
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("after");
            if (optJSONObject3 != null) {
                AbstractC19074t.m100205c(optJSONObject3);
                String optString5 = optJSONObject3.optString("vi", "");
                AbstractC19074t.m100207e(optString5, "optString(...)");
                this.f115985e = optString5;
                String optString6 = optJSONObject3.optString("en", "");
                AbstractC19074t.m100207e(optString6, "optString(...)");
                this.f115986f = optString6;
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("confirm_box");
        if (optJSONObject4 != null) {
            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("desc");
            if (optJSONObject5 != null) {
                AbstractC19074t.m100205c(optJSONObject5);
                String optString7 = optJSONObject5.optString("vi", "");
                AbstractC19074t.m100207e(optString7, "optString(...)");
                this.f115987g = optString7;
                String optString8 = optJSONObject5.optString("en", "");
                AbstractC19074t.m100207e(optString8, "optString(...)");
                this.f115988h = optString8;
            }
            JSONArray optJSONArray = optJSONObject4.optJSONArray("cta");
            if (optJSONArray != null) {
                AbstractC19074t.m100205c(optJSONArray);
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject optJSONObject6 = optJSONArray.optJSONObject(i11);
                    if (optJSONObject6 != null) {
                        AbstractC19074t.m100205c(optJSONObject6);
                        String optString9 = optJSONObject6.optString("action", "");
                        if (AbstractC19074t.m100204b(optString9, "confirm")) {
                            String optString10 = optJSONObject6.optString("action", "");
                            AbstractC19074t.m100207e(optString10, "optString(...)");
                            this.f115989i = optString10;
                            String optString11 = optJSONObject6.optString("vi", "");
                            AbstractC19074t.m100207e(optString11, "optString(...)");
                            this.f115990j = optString11;
                            String optString12 = optJSONObject6.optString("en", "");
                            AbstractC19074t.m100207e(optString12, "optString(...)");
                            this.f115991k = optString12;
                        } else if (AbstractC19074t.m100204b(optString9, "deny")) {
                            String optString13 = optJSONObject6.optString("action", "");
                            AbstractC19074t.m100207e(optString13, "optString(...)");
                            this.f115992l = optString13;
                            String optString14 = optJSONObject6.optString("vi", "");
                            AbstractC19074t.m100207e(optString14, "optString(...)");
                            this.f115993m = optString14;
                            String optString15 = optJSONObject6.optString("en", "");
                            AbstractC19074t.m100207e(optString15, "optString(...)");
                            this.f115994n = optString15;
                        }
                    }
                }
            }
            JSONObject optJSONObject7 = optJSONObject4.optJSONObject("option");
            if (optJSONObject7 != null) {
                AbstractC19074t.m100205c(optJSONObject7);
                String optString16 = optJSONObject7.optString("name");
                AbstractC19074t.m100207e(optString16, "optString(...)");
                this.f115995o = optString16;
                String optString17 = optJSONObject7.optString("vi");
                AbstractC19074t.m100207e(optString17, "optString(...)");
                this.f115996p = optString17;
                String optString18 = optJSONObject7.optString("en");
                AbstractC19074t.m100207e(optString18, "optString(...)");
                this.f115997q = optString18;
            }
        }
    }
}
