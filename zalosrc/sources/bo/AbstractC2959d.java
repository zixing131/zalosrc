package bo;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import vg.C28227x3;

/* renamed from: bo.d */
/* loaded from: classes4.dex */
public abstract class AbstractC2959d {

    /* renamed from: a */
    private String f11671a;

    /* renamed from: b */
    private String f11672b;

    /* renamed from: c */
    private String f11673c;

    /* renamed from: d */
    private C28227x3 f11674d;

    public AbstractC2959d(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f11671a = "";
        this.f11672b = "";
        this.f11673c = "";
        String optString = jSONObject.optString("thumb");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f11672b = optString;
        String optString2 = jSONObject.optString("origin");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f11673c = optString2;
        JSONObject optJSONObject = jSONObject.optJSONObject("dimension");
        if (optJSONObject != null) {
            this.f11674d = new C28227x3(optJSONObject);
        }
    }

    /* renamed from: a */
    public final C28227x3 m14010a() {
        return this.f11674d;
    }

    /* renamed from: b */
    public final String m14011b() {
        return this.f11673c;
    }

    /* renamed from: c */
    public final String m14012c() {
        return this.f11672b;
    }

    /* renamed from: d */
    public final String m14013d() {
        return this.f11671a;
    }

    /* renamed from: e */
    public final void m14014e(C28227x3 c28227x3) {
        this.f11674d = c28227x3;
    }

    /* renamed from: f */
    public final void m14015f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11673c = str;
    }

    /* renamed from: g */
    public final void m14016g(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11672b = str;
    }

    /* renamed from: h */
    public final void m14017h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11671a = str;
    }

    /* renamed from: i */
    public abstract JSONObject mo14018i();
}
