package p611wj;

import org.json.JSONObject;

/* renamed from: wj.g */
/* loaded from: classes3.dex */
public class C29059g {

    /* renamed from: a */
    public String f134631a;

    /* renamed from: b */
    public String f134632b;

    public C29059g(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("kw_view")) {
                    this.f134631a = jSONObject.getString("kw_view");
                }
                if (jSONObject.has("kw_search")) {
                    this.f134632b = jSONObject.getString("kw_search");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
