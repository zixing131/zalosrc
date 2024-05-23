package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.r1 */
/* loaded from: classes4.dex */
public class C3031r1 {

    /* renamed from: a */
    public String f12216a;

    /* renamed from: b */
    public String f12217b;

    public C3031r1(JSONObject jSONObject) {
        this.f12216a = "";
        this.f12217b = "";
        if (jSONObject != null) {
            try {
                this.f12216a = jSONObject.optString("desc_vi");
                this.f12217b = jSONObject.optString("desc_en");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14586a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = "";
            if (TextUtils.isEmpty(this.f12216a)) {
                str = "";
            } else {
                str = this.f12216a;
            }
            jSONObject.put("desc_vi", str);
            if (!TextUtils.isEmpty(this.f12217b)) {
                str2 = this.f12217b;
            }
            jSONObject.put("desc_en", str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
