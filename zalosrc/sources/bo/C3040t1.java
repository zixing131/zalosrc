package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.t1 */
/* loaded from: classes4.dex */
public class C3040t1 {

    /* renamed from: a */
    public String f12248a;

    /* renamed from: b */
    public String f12249b;

    public C3040t1(JSONObject jSONObject) {
        this.f12248a = "";
        this.f12249b = "";
        if (jSONObject != null) {
            try {
                this.f12248a = jSONObject.optString("top");
                this.f12249b = jSONObject.optString("bottom");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14615a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = "";
            if (TextUtils.isEmpty(this.f12248a)) {
                str = "";
            } else {
                str = this.f12248a;
            }
            jSONObject.put("top", str);
            if (!TextUtils.isEmpty(this.f12249b)) {
                str2 = this.f12249b;
            }
            jSONObject.put("bottom", str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
