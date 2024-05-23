package bo;

import org.json.JSONObject;

/* renamed from: bo.c2 */
/* loaded from: classes4.dex */
public class C2957c2 {

    /* renamed from: a */
    public long f11666a;

    /* renamed from: b */
    public long f11667b;

    public C2957c2(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f11666a = jSONObject.optLong("from");
                this.f11667b = jSONObject.optLong("to");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14003a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f11666a);
            jSONObject.put("to", this.f11667b);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
