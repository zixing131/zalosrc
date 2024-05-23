package bo;

import android.text.TextUtils;
import com.zing.zalo.zinstant.C17244x0;
import lk0.InterfaceC22508f;
import org.json.JSONObject;

/* renamed from: bo.y1 */
/* loaded from: classes4.dex */
public class C3060y1 {

    /* renamed from: a */
    public C3011n1 f12367a;

    /* renamed from: b */
    public String f12368b;

    /* renamed from: c */
    public int f12369c;

    /* renamed from: d */
    public C17244x0 f12370d;

    public C3060y1(JSONObject jSONObject) {
        C3011n1 c3011n1;
        if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("decor_info");
                if (optJSONObject != null) {
                    c3011n1 = new C3011n1(optJSONObject);
                } else {
                    c3011n1 = null;
                }
                this.f12367a = c3011n1;
                this.f12368b = jSONObject.optString("feed_memory_id");
                this.f12369c = jSONObject.optInt("feed_memory_type");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("zinstant_feed_info");
                this.f12370d = optJSONObject2 != null ? new C17244x0(31, optJSONObject2) : null;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String m14709a() {
        return this.f12368b;
    }

    /* renamed from: b */
    public InterfaceC22508f m14710b() {
        C17244x0 c17244x0 = this.f12370d;
        if (c17244x0 != null) {
            return c17244x0.m92064b();
        }
        return null;
    }

    /* renamed from: c */
    public JSONObject m14711c() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            C3011n1 c3011n1 = this.f12367a;
            JSONObject jSONObject3 = null;
            if (c3011n1 != null) {
                jSONObject = c3011n1.m14428a();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("decor_info", jSONObject);
            if (!TextUtils.isEmpty(this.f12368b)) {
                jSONObject2.put("feed_memory_id", this.f12368b);
            }
            jSONObject2.put("feed_memory_type", this.f12369c);
            C17244x0 c17244x0 = this.f12370d;
            if (c17244x0 != null) {
                jSONObject3 = c17244x0.m92066d();
            }
            jSONObject2.put("zinstant_feed_info", jSONObject3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject2;
    }
}
