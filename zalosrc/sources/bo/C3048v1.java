package bo;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONObject;

/* renamed from: bo.v1 */
/* loaded from: classes4.dex */
public class C3048v1 {

    /* renamed from: a */
    public int f12293a;

    /* renamed from: b */
    public int f12294b;

    public C3048v1(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f12293a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                this.f12294b = jSONObject.optInt("id");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14633a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f12293a);
            jSONObject.put("id", this.f12294b);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
