package p716zh;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.t8 */
/* loaded from: classes3.dex */
public class C32121t8 {

    /* renamed from: a */
    public boolean f148090a;

    public C32121t8(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f148090a = jSONObject.optInt("autoplay", 0) == 1;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m155022a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("autoplay", this.f148090a ? 1 : 0);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
