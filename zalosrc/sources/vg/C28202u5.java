package vg;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: vg.u5 */
/* loaded from: classes3.dex */
public class C28202u5 {

    /* renamed from: a */
    public int f131403a;

    /* renamed from: b */
    public String f131404b;

    /* renamed from: c */
    public int f131405c;

    /* renamed from: d */
    public boolean f131406d = true;

    public C28202u5(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f131404b = jSONObject.optString("kw").toLowerCase();
            this.f131403a = jSONObject.optInt("effectId");
            this.f131405c = jSONObject.optInt("color");
        }
    }

    /* renamed from: a */
    public boolean m141796a() {
        if (!TextUtils.isEmpty(this.f131404b) && this.f131403a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public JSONObject m141797b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f131404b;
            if (str == null) {
                str = "";
            }
            jSONObject.put("kw", str);
            jSONObject.put("effectId", this.f131403a);
            jSONObject.put("color", this.f131405c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
