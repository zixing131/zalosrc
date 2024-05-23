package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.n1 */
/* loaded from: classes4.dex */
public class C3011n1 {

    /* renamed from: a */
    public String f11985a;

    /* renamed from: b */
    public C3016o1 f11986b;

    /* renamed from: c */
    public C3016o1 f11987c;

    public C3011n1(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f11985a = jSONObject.optString("title");
                JSONObject optJSONObject = jSONObject.optJSONObject("decor_light");
                if (optJSONObject != null) {
                    this.f11986b = new C3016o1(optJSONObject);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("decor_dark");
                if (optJSONObject2 != null) {
                    this.f11987c = new C3016o1(optJSONObject2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14428a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11985a)) {
                str = this.f11985a;
            } else {
                str = "";
            }
            jSONObject.put("title", str);
            C3016o1 c3016o1 = this.f11986b;
            if (c3016o1 != null) {
                jSONObject.put("decor_light", c3016o1.m14433a());
            }
            C3016o1 c3016o12 = this.f11987c;
            if (c3016o12 != null) {
                jSONObject.put("decor_dark", c3016o12.m14433a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
