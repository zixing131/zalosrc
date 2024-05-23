package dj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: dj.p1 */
/* loaded from: classes3.dex */
public final class C17991p1 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f91128a;

    /* renamed from: b */
    private String f91129b;

    /* renamed from: c */
    private String f91130c;

    /* renamed from: dj.p1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17991p1 m95676a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("actionType");
            String optString3 = jSONObject.optString("actionData");
            AbstractC19074t.m100205c(optString);
            AbstractC19074t.m100205c(optString2);
            AbstractC19074t.m100205c(optString3);
            return new C17991p1(optString, optString2, optString3);
        }
    }

    public C17991p1(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "actionType");
        AbstractC19074t.m100208f(str3, "actionData");
        this.f91128a = str;
        this.f91129b = str2;
        this.f91130c = str3;
    }

    /* renamed from: a */
    public final String m95672a() {
        return this.f91130c;
    }

    /* renamed from: b */
    public final String m95673b() {
        return this.f91129b;
    }

    /* renamed from: c */
    public final String m95674c() {
        return this.f91128a;
    }

    /* renamed from: d */
    public final JSONObject m95675d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.f91128a);
        jSONObject.put("actionType", this.f91129b);
        jSONObject.put("actionData", this.f91130c);
        return jSONObject;
    }
}
