package vg;

import org.json.JSONObject;

/* renamed from: vg.x3 */
/* loaded from: classes3.dex */
public class C28227x3 {

    /* renamed from: a */
    public int f131648a;

    /* renamed from: b */
    public int f131649b;

    public C28227x3(int i11, int i12) {
        this.f131648a = i11;
        this.f131649b = i12;
    }

    /* renamed from: a */
    public float m142185a() {
        if (m142186b()) {
            return (this.f131648a * 1.0f) / this.f131649b;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public boolean m142186b() {
        return this.f131648a > 0 && this.f131649b > 0;
    }

    /* renamed from: c */
    public JSONObject m142187c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", this.f131648a);
            jSONObject.put("height", this.f131649b);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C28227x3(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f131648a = jSONObject.optInt("width");
            this.f131649b = jSONObject.optInt("height");
        }
    }
}
