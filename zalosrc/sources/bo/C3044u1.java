package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.u1 */
/* loaded from: classes4.dex */
public class C3044u1 {

    /* renamed from: a */
    public long f12269a;

    /* renamed from: b */
    public int f12270b;

    /* renamed from: c */
    public String f12271c;

    /* renamed from: d */
    public int f12272d;

    /* renamed from: e */
    public C3040t1 f12273e;

    public C3044u1(JSONObject jSONObject) {
        C3040t1 c3040t1;
        this.f12271c = "";
        if (jSONObject != null) {
            try {
                this.f12269a = jSONObject.optLong("effect_id");
                this.f12270b = jSONObject.optInt("background_color");
                this.f12271c = jSONObject.optString("background_url");
                this.f12272d = jSONObject.optInt("overlay_color");
                JSONObject optJSONObject = jSONObject.optJSONObject("decor_frame");
                if (optJSONObject != null) {
                    c3040t1 = new C3040t1(optJSONObject);
                } else {
                    c3040t1 = null;
                }
                this.f12273e = c3040t1;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14630a() {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("effect_id", this.f12269a);
            jSONObject2.put("background_color", this.f12270b);
            if (!TextUtils.isEmpty(this.f12271c)) {
                str = this.f12271c;
            } else {
                str = "";
            }
            jSONObject2.put("background_url", str);
            jSONObject2.put("overlay_color", this.f12272d);
            C3040t1 c3040t1 = this.f12273e;
            if (c3040t1 != null) {
                jSONObject = c3040t1.m14615a();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("decor_frame", jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject2;
    }
}
