package p107dq;

import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dq.j */
/* loaded from: classes4.dex */
public final class C18054j {

    /* renamed from: a */
    private String f91352a;

    /* renamed from: b */
    private String f91353b;

    public C18054j(String str, String str2) {
        AbstractC19074t.m100208f(str, "thumbLightMode");
        AbstractC19074t.m100208f(str2, "thumbDarkMode");
        this.f91352a = str;
        this.f91353b = str2;
    }

    /* renamed from: a */
    public final String m95947a() {
        return this.f91353b;
    }

    /* renamed from: b */
    public final String m95948b() {
        return this.f91352a;
    }

    /* renamed from: c */
    public final JSONObject m95949c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("l", this.f91352a);
            jSONObject.put("d", this.f91353b);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    public C18054j(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("l")) {
                    this.f91352a = jSONObject.optString("l");
                }
                if (jSONObject.has("d")) {
                    this.f91353b = jSONObject.optString("d");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }
}
