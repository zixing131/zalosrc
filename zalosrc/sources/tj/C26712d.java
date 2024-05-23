package tj;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nh0.C23793c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tj.d */
/* loaded from: classes3.dex */
public final class C26712d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f126660a;

    /* renamed from: b */
    private String f126661b;

    /* renamed from: c */
    private int f126662c;

    /* renamed from: d */
    private String f126663d;

    /* renamed from: e */
    private String f126664e;

    /* renamed from: f */
    private long f126665f;

    /* renamed from: g */
    private long f126666g;

    /* renamed from: h */
    private String f126667h;

    /* renamed from: i */
    private String f126668i;

    /* renamed from: j */
    private String f126669j;

    /* renamed from: k */
    private String f126670k;

    /* renamed from: l */
    private String f126671l;

    /* renamed from: m */
    private int f126672m;

    /* renamed from: n */
    private int f126673n;

    /* renamed from: o */
    private int f126674o;

    /* renamed from: tj.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26712d() {
        this.f126662c = -1;
        this.f126663d = "";
        this.f126664e = "";
        this.f126667h = "";
        this.f126668i = "";
        this.f126669j = "";
        this.f126670k = "";
        this.f126671l = "";
        this.f126672m = 3;
        this.f126673n = 3;
    }

    /* renamed from: a */
    public final String m137333a() {
        return this.f126669j;
    }

    /* renamed from: b */
    public final String m137334b() {
        return this.f126668i;
    }

    /* renamed from: c */
    public final String m137335c() {
        return this.f126667h;
    }

    /* renamed from: d */
    public final String m137336d() {
        return this.f126664e;
    }

    /* renamed from: e */
    public final String m137337e() {
        return this.f126671l;
    }

    /* renamed from: f */
    public final String m137338f() {
        return this.f126670k;
    }

    /* renamed from: g */
    public final String m137339g() {
        return this.f126661b;
    }

    /* renamed from: h */
    public final int m137340h() {
        return this.f126674o;
    }

    /* renamed from: i */
    public final int m137341i() {
        return this.f126672m;
    }

    /* renamed from: j */
    public final int m137342j() {
        return this.f126673n;
    }

    /* renamed from: k */
    public final String m137343k() {
        return this.f126663d;
    }

    /* renamed from: l */
    public final int m137344l() {
        return this.f126660a;
    }

    /* renamed from: m */
    public final boolean m137345m() {
        return this.f126660a == 4;
    }

    /* renamed from: n */
    public final boolean m137346n() {
        int i11 = this.f126660a;
        return i11 == 0 || i11 == 1 || i11 == 3 || i11 == 4;
    }

    /* renamed from: o */
    public final boolean m137347o() {
        int i11 = this.f126660a;
        return i11 == 2 || i11 == 4;
    }

    /* renamed from: p */
    public final boolean m137348p() {
        long j11 = this.f126665f;
        if (j11 < 0) {
            return false;
        }
        long j12 = this.f126666g;
        if (j12 < 0 || j11 > j12) {
            return false;
        }
        long mo124314i = C23793c.Companion.m124321a().mo124314i();
        long j13 = this.f126665f;
        if (j13 != 0 && j13 > mo124314i) {
            return false;
        }
        long j14 = this.f126666g;
        if (j14 != 0 && mo124314i > j14) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m137349q() {
        int i11 = this.f126660a;
        return i11 == 3 || i11 == 4;
    }

    /* renamed from: r */
    public final void m137350r(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f126669j = str;
    }

    /* renamed from: s */
    public final void m137351s(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f126668i = str;
    }

    /* renamed from: t */
    public final void m137352t(int i11) {
        this.f126674o = i11;
    }

    /* renamed from: u */
    public final void m137353u(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f126663d = str;
    }

    /* renamed from: v */
    public final void m137354v(int i11) {
        this.f126660a = i11;
    }

    /* renamed from: w */
    public final JSONObject m137355w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f126660a);
            jSONObject.put("icon", this.f126661b);
            jSONObject.put("title", this.f126663d);
            jSONObject.put("des", this.f126664e);
            jSONObject.put("startTime", this.f126665f);
            jSONObject.put("endTime", this.f126666g);
            jSONObject.put("buttonTitle", this.f126667h);
            jSONObject.put("actionType", this.f126668i);
            jSONObject.put("actionData", this.f126669j);
            String str = this.f126670k;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("fAcType", str);
            String str3 = this.f126671l;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("fAcData", str2);
            jSONObject.put("msgSrc", this.f126672m);
            jSONObject.put("msgType", this.f126673n);
            jSONObject.put("iconType", this.f126674o);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C26712d(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        this.f126662c = -1;
        this.f126663d = "";
        this.f126664e = "";
        this.f126667h = "";
        this.f126668i = "";
        this.f126669j = "";
        this.f126670k = "";
        this.f126671l = "";
        this.f126672m = 3;
        this.f126673n = 3;
        try {
            this.f126660a = jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) : -1;
            this.f126661b = jSONObject.optString("icon");
            String optString = jSONObject.optString("title");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f126663d = optString;
            String optString2 = jSONObject.optString("des");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f126664e = optString2;
            this.f126665f = jSONObject.optLong("startTime");
            this.f126666g = jSONObject.optLong("endTime");
            String optString3 = jSONObject.optString("buttonTitle");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f126667h = optString3;
            String optString4 = jSONObject.optString("actionType");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            this.f126668i = optString4;
            String optString5 = jSONObject.optString("actionData");
            AbstractC19074t.m100207e(optString5, "optString(...)");
            this.f126669j = optString5;
            this.f126670k = jSONObject.optString("fAcType");
            this.f126671l = jSONObject.optString("fAcData");
            this.f126672m = jSONObject.optInt("msgSrc", 3);
            this.f126673n = jSONObject.optInt("msgType", 3);
            this.f126674o = jSONObject.optInt("iconType", 0);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
