package p611wj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: wj.a */
/* loaded from: classes3.dex */
public final class C29053a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f134595a;

    /* renamed from: b */
    private String f134596b;

    /* renamed from: c */
    private String f134597c;

    /* renamed from: d */
    private String f134598d;

    /* renamed from: wj.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29053a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jObj");
        String optString = jSONObject.optString("iconUrl");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f134595a = optString;
        String optString2 = jSONObject.optString("title");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f134596b = optString2;
        String optString3 = jSONObject.optString("actionType");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f134597c = optString3;
        String optString4 = jSONObject.optString("actionData");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        this.f134598d = optString4;
    }

    /* renamed from: a */
    public final String m145096a() {
        return this.f134598d;
    }

    /* renamed from: b */
    public final String m145097b() {
        return this.f134597c;
    }

    /* renamed from: c */
    public final String m145098c() {
        return this.f134595a;
    }

    /* renamed from: d */
    public final String m145099d() {
        return this.f134596b;
    }

    /* renamed from: e */
    public final JSONObject m145100e() {
        JSONObject jSONObject = new JSONObject();
        if (this.f134595a.length() > 0) {
            jSONObject.put("iconUrl", this.f134595a);
        }
        if (this.f134596b.length() > 0) {
            jSONObject.put("title", this.f134596b);
        }
        if (this.f134597c.length() > 0) {
            jSONObject.put("actionType", this.f134597c);
        }
        if (this.f134598d.length() > 0) {
            jSONObject.put("actionData", this.f134598d);
        }
        return jSONObject;
    }
}
