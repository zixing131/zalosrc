package bo;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import lk0.InterfaceC22508f;
import org.json.JSONObject;

/* renamed from: bo.w1 */
/* loaded from: classes4.dex */
public class C3052w1 {

    /* renamed from: a */
    public C3048v1 f12302a;

    /* renamed from: b */
    public int f12303b;

    /* renamed from: c */
    public C3044u1 f12304c;

    /* renamed from: d */
    public C3021p1 f12305d;

    public C3052w1(JSONObject jSONObject) {
        C3048v1 c3048v1;
        C3044u1 c3044u1;
        if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("event_info");
                if (optJSONObject != null) {
                    c3048v1 = new C3048v1(optJSONObject);
                } else {
                    c3048v1 = null;
                }
                this.f12302a = c3048v1;
                this.f12303b = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("decor_bg_info");
                if (optJSONObject2 != null) {
                    c3044u1 = new C3044u1(optJSONObject2);
                } else {
                    c3044u1 = null;
                }
                this.f12304c = c3044u1;
                JSONObject optJSONObject3 = jSONObject.optJSONObject("content");
                this.f12305d = optJSONObject3 != null ? new C3021p1(optJSONObject3) : null;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public InterfaceC22508f m14639a() {
        C3021p1 c3021p1;
        if (this.f12303b != 1 || (c3021p1 = this.f12305d) == null) {
            return null;
        }
        return c3021p1.m14540b();
    }

    /* renamed from: b */
    public String m14640b() {
        int i11 = this.f12303b;
        if (i11 == 0) {
            if (this.f12302a == null) {
                return "intro_";
            }
            return "intro_" + this.f12302a.f12293a + "" + this.f12302a.f12294b + "";
        }
        if (i11 == 1) {
            C3021p1 c3021p1 = this.f12305d;
            if (c3021p1 == null) {
                return "";
            }
            return c3021p1.m14539a();
        }
        if (i11 != 2) {
            return "";
        }
        return "outro_";
    }

    /* renamed from: c */
    public boolean m14641c() {
        C3021p1 c3021p1;
        int i11 = this.f12303b;
        if (i11 == 0 || i11 == 2) {
            return true;
        }
        if (i11 == 1 && (c3021p1 = this.f12305d) != null && c3021p1.m14541c()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public JSONObject m14642d() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            C3048v1 c3048v1 = this.f12302a;
            JSONObject jSONObject4 = null;
            if (c3048v1 != null) {
                jSONObject = c3048v1.m14633a();
            } else {
                jSONObject = null;
            }
            jSONObject3.put("event_info", jSONObject);
            jSONObject3.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f12303b);
            C3044u1 c3044u1 = this.f12304c;
            if (c3044u1 != null) {
                jSONObject2 = c3044u1.m14630a();
            } else {
                jSONObject2 = null;
            }
            jSONObject3.put("decor_bg_info", jSONObject2);
            C3021p1 c3021p1 = this.f12305d;
            if (c3021p1 != null) {
                jSONObject4 = c3021p1.m14542d();
            }
            jSONObject3.put("content", jSONObject4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject3;
    }
}
