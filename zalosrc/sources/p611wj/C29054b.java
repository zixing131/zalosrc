package p611wj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: wj.b */
/* loaded from: classes3.dex */
public final class C29054b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f134599a;

    /* renamed from: b */
    private final int f134600b;

    /* renamed from: c */
    private final int f134601c;

    /* renamed from: d */
    private final String f134602d;

    /* renamed from: e */
    private final String f134603e;

    /* renamed from: wj.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29054b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        String optString = jSONObject.optString("thumbUrl");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f134599a = optString;
        this.f134600b = jSONObject.optInt("width");
        this.f134601c = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("actionType");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f134602d = optString2;
        String optString3 = jSONObject.optString("actionData");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f134603e = optString3;
    }

    /* renamed from: a */
    public final String m145101a() {
        return this.f134603e;
    }

    /* renamed from: b */
    public final String m145102b() {
        return this.f134602d;
    }

    /* renamed from: c */
    public final int m145103c() {
        return this.f134601c;
    }

    /* renamed from: d */
    public final String m145104d() {
        return this.f134599a;
    }

    /* renamed from: e */
    public final int m145105e() {
        return this.f134600b;
    }

    /* renamed from: f */
    public final JSONObject m145106f() {
        JSONObject jSONObject = new JSONObject();
        if (this.f134599a.length() > 0) {
            jSONObject.put("thumbUrl", this.f134599a);
        }
        if (this.f134602d.length() > 0) {
            jSONObject.put("actionType", this.f134602d);
        }
        if (this.f134603e.length() > 0) {
            jSONObject.put("actionData", this.f134603e);
        }
        int i11 = this.f134600b;
        if (i11 > 0) {
            jSONObject.put("width", i11);
        }
        int i12 = this.f134601c;
        if (i12 > 0) {
            jSONObject.put("height", i12);
        }
        return jSONObject;
    }
}
