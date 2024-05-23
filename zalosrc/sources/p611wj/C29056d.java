package p611wj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: wj.d */
/* loaded from: classes3.dex */
public final class C29056d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f134609a;

    /* renamed from: b */
    private final int f134610b;

    /* renamed from: c */
    private final int f134611c;

    /* renamed from: d */
    private final String f134612d;

    /* renamed from: e */
    private final String f134613e;

    /* renamed from: f */
    private final double f134614f;

    /* renamed from: g */
    private final double f134615g;

    /* renamed from: h */
    private final String f134616h;

    /* renamed from: i */
    private final String f134617i;

    /* renamed from: wj.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29056d(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        String optString = jSONObject.optString("locationUrl");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f134609a = optString;
        this.f134610b = jSONObject.optInt("width");
        this.f134611c = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("locationName");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f134612d = optString2;
        String optString3 = jSONObject.optString("locationAddress");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f134613e = optString3;
        this.f134614f = jSONObject.optDouble("lat");
        this.f134615g = jSONObject.optDouble("lon");
        String optString4 = jSONObject.optString("appID");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        this.f134616h = optString4;
        String optString5 = jSONObject.optString("locationID");
        AbstractC19074t.m100207e(optString5, "optString(...)");
        this.f134617i = optString5;
    }

    /* renamed from: a */
    public final String m145113a() {
        return this.f134616h;
    }

    /* renamed from: b */
    public final double m145114b() {
        return this.f134614f;
    }

    /* renamed from: c */
    public final String m145115c() {
        return this.f134613e;
    }

    /* renamed from: d */
    public final String m145116d() {
        return this.f134617i;
    }

    /* renamed from: e */
    public final String m145117e() {
        return this.f134612d;
    }

    /* renamed from: f */
    public final String m145118f() {
        return this.f134609a;
    }

    /* renamed from: g */
    public final double m145119g() {
        return this.f134615g;
    }

    /* renamed from: h */
    public final JSONObject m145120h() {
        JSONObject jSONObject = new JSONObject();
        if (this.f134609a.length() > 0) {
            jSONObject.put("locationUrl", this.f134609a);
        }
        if (this.f134612d.length() > 0) {
            jSONObject.put("locationName", this.f134612d);
        }
        if (this.f134613e.length() > 0) {
            jSONObject.put("locationAddress", this.f134613e);
        }
        if (this.f134616h.length() > 0) {
            jSONObject.put("appID", this.f134616h);
        }
        if (this.f134617i.length() > 0) {
            jSONObject.put("locationID", this.f134617i);
        }
        int i11 = this.f134610b;
        if (i11 > 0) {
            jSONObject.put("width", i11);
        }
        int i12 = this.f134611c;
        if (i12 > 0) {
            jSONObject.put("height", i12);
        }
        double d11 = this.f134614f;
        if (d11 > 0.0d) {
            jSONObject.put("lat", d11);
        }
        double d12 = this.f134615g;
        if (d12 > 0.0d) {
            jSONObject.put("lon", d12);
        }
        return jSONObject;
    }
}
