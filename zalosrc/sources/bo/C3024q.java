package bo;

import org.json.JSONObject;

/* renamed from: bo.q */
/* loaded from: classes4.dex */
public class C3024q {

    /* renamed from: a */
    public int f12089a;

    /* renamed from: b */
    public String f12090b;

    /* renamed from: c */
    public String f12091c;

    public C3024q(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f12089a = jSONObject.optInt("color_overlap", -1);
            this.f12090b = jSONObject.optString("avatar_url");
            this.f12091c = jSONObject.optString("bio");
        }
    }

    /* renamed from: a */
    public JSONObject m14563a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("color_overlap", this.f12089a);
            jSONObject.put("avatar_url", this.f12090b);
            jSONObject.put("bio", this.f12091c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
