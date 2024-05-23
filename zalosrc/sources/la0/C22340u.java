package la0;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: la0.u */
/* loaded from: classes6.dex */
public final class C22340u {

    /* renamed from: a */
    private int f109531a;

    /* renamed from: b */
    private int f109532b;

    /* renamed from: c */
    private int f109533c;

    /* renamed from: d */
    private int f109534d;

    /* renamed from: e */
    private String f109535e;

    /* renamed from: f */
    private String f109536f;

    public C22340u(int i11, int i12) {
        this.f109535e = "";
        this.f109536f = "";
        this.f109531a = i11;
        this.f109532b = i12;
    }

    /* renamed from: a */
    public final String m115788a() {
        return this.f109536f;
    }

    /* renamed from: b */
    public final int m115789b() {
        return this.f109534d;
    }

    /* renamed from: c */
    public final int m115790c() {
        return this.f109531a;
    }

    /* renamed from: d */
    public final int m115791d() {
        return this.f109533c;
    }

    /* renamed from: e */
    public final String m115792e() {
        return this.f109535e;
    }

    /* renamed from: f */
    public final int m115793f() {
        return this.f109532b;
    }

    /* renamed from: g */
    public final void m115794g(int i11) {
        this.f109531a = i11;
    }

    public C22340u(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f109531a = -1;
        this.f109535e = "";
        this.f109536f = "";
        this.f109531a = jSONObject.optInt("highlightId", -1);
        this.f109532b = jSONObject.optInt("highlightType", 0);
        this.f109533c = jSONObject.optInt("timeout", 0);
        this.f109534d = jSONObject.optInt("dismissType", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("tooltip");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("title", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f109535e = optString;
            String optString2 = optJSONObject.optString("desc", "");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f109536f = optString2;
        }
    }
}
