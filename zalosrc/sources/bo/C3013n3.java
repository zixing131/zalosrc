package bo;

import org.json.JSONObject;
import p716zh.C31890dc;

/* renamed from: bo.n3 */
/* loaded from: classes4.dex */
public class C3013n3 {

    /* renamed from: a */
    public float f11989a;

    /* renamed from: b */
    public int f11990b;

    /* renamed from: c */
    public int f11991c;

    /* renamed from: d */
    public int f11992d;

    /* renamed from: e */
    public int f11993e;

    /* renamed from: f */
    public int f11994f;

    public C3013n3(float f11, int i11, int i12, int i13, int i14) {
        this.f11989a = 1.0f;
        this.f11990b = C31890dc.f146488H;
        int i15 = C31890dc.f146485E;
        this.f11994f = 12;
        this.f11989a = f11;
        this.f11990b = i11;
        this.f11991c = i12;
        this.f11992d = i13;
        this.f11993e = i14;
    }

    /* renamed from: a */
    public boolean m14430a() {
        return this.f11989a > 0.0f && !((this.f11992d == 0 && this.f11991c == 0) || this.f11990b == this.f11991c);
    }

    /* renamed from: b */
    public JSONObject m14431b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ratio", this.f11989a);
            jSONObject.put("text_color", this.f11990b);
            jSONObject.put("bg_color", this.f11991c);
            jSONObject.put("align", this.f11992d);
            jSONObject.put("type_bg_render", this.f11993e);
            jSONObject.put("typo_type", this.f11994f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C3013n3(JSONObject jSONObject) {
        this.f11989a = 1.0f;
        int i11 = C31890dc.f146488H;
        this.f11990b = i11;
        int i12 = C31890dc.f146490J;
        this.f11991c = i12;
        this.f11992d = 0;
        this.f11993e = 0;
        this.f11994f = 12;
        if (jSONObject != null) {
            try {
                this.f11989a = jSONObject.isNull("ratio") ? 1.0f : (float) jSONObject.getDouble("ratio");
                this.f11990b = jSONObject.isNull("text_color") ? i11 : jSONObject.getInt("text_color");
                this.f11991c = jSONObject.isNull("bg_color") ? i12 : jSONObject.getInt("bg_color");
                this.f11992d = !jSONObject.isNull("align") ? jSONObject.getInt("align") : 0;
                this.f11993e = jSONObject.isNull("type_bg_render") ? 0 : jSONObject.getInt("type_bg_render");
                this.f11994f = jSONObject.isNull("typo_type") ? 12 : jSONObject.getInt("typo_type");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
