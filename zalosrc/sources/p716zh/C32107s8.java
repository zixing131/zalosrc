package p716zh;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.s8 */
/* loaded from: classes3.dex */
public class C32107s8 {

    /* renamed from: a */
    public long f148011a;

    /* renamed from: b */
    public String f148012b;

    /* renamed from: c */
    public String f148013c;

    public C32107s8(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f148011a = jSONObject.optLong("id");
                this.f148012b = jSONObject.optString("avt");
                this.f148013c = jSONObject.optString("dispname");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m154982a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f148011a);
            String str = this.f148012b;
            if (str != null) {
                jSONObject.put("avt", str);
            }
            String str2 = this.f148013c;
            if (str2 != null) {
                jSONObject.put("dispname", str2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
