package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.q1 */
/* loaded from: classes4.dex */
public class C3026q1 {

    /* renamed from: a */
    public String f12190a;

    /* renamed from: b */
    public String f12191b;

    /* renamed from: c */
    public String f12192c;

    /* renamed from: d */
    public String f12193d;

    public C3026q1(JSONObject jSONObject) {
        this.f12190a = "";
        this.f12191b = "";
        this.f12192c = "";
        this.f12193d = "";
        if (jSONObject != null) {
            try {
                this.f12190a = jSONObject.optString("title_vi");
                this.f12191b = jSONObject.optString("title_en");
                this.f12192c = jSONObject.optString("action_type");
                this.f12193d = jSONObject.optString("action_data");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14576a() {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            String str4 = "";
            if (TextUtils.isEmpty(this.f12190a)) {
                str = "";
            } else {
                str = this.f12190a;
            }
            jSONObject.put("title_vi", str);
            if (TextUtils.isEmpty(this.f12191b)) {
                str2 = "";
            } else {
                str2 = this.f12191b;
            }
            jSONObject.put("title_en", str2);
            if (TextUtils.isEmpty(this.f12192c)) {
                str3 = "";
            } else {
                str3 = this.f12192c;
            }
            jSONObject.put("action_type", str3);
            if (!TextUtils.isEmpty(this.f12193d)) {
                str4 = this.f12193d;
            }
            jSONObject.put("action_data", str4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
