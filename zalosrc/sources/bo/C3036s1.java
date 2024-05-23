package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.s1 */
/* loaded from: classes4.dex */
public class C3036s1 {

    /* renamed from: a */
    public String f12234a;

    /* renamed from: b */
    public String f12235b;

    public C3036s1(JSONObject jSONObject) {
        this.f12234a = "";
        this.f12235b = "";
        if (jSONObject != null) {
            try {
                this.f12234a = jSONObject.optString("title_vi");
                this.f12235b = jSONObject.optString("title_en");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14613a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = "";
            if (TextUtils.isEmpty(this.f12234a)) {
                str = "";
            } else {
                str = this.f12234a;
            }
            jSONObject.put("title_vi", str);
            if (!TextUtils.isEmpty(this.f12235b)) {
                str2 = this.f12235b;
            }
            jSONObject.put("title_en", str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
