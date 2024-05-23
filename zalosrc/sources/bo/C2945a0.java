package bo;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: bo.a0 */
/* loaded from: classes4.dex */
public class C2945a0 {

    /* renamed from: a */
    private int f11630a;

    /* renamed from: b */
    private int f11631b;

    /* renamed from: c */
    private C2950b0 f11632c;

    private C2945a0() {
    }

    /* renamed from: a */
    public static C2945a0 m13940a(int i11, int i12, C2950b0 c2950b0) {
        C2945a0 c2945a0 = new C2945a0();
        c2945a0.f11630a = i11;
        c2945a0.f11631b = i12;
        c2945a0.f11632c = c2950b0;
        return c2945a0;
    }

    /* renamed from: b */
    public static C2945a0 m13941b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return m13940a(jSONObject.optInt("id", 0), jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0), C2950b0.m13970b(jSONObject.optJSONObject("attach")));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C2950b0 m13942c() {
        return this.f11632c;
    }

    /* renamed from: d */
    public int m13943d() {
        return this.f11630a;
    }

    /* renamed from: e */
    public int m13944e() {
        return this.f11631b;
    }

    /* renamed from: f */
    public boolean m13945f() {
        if (m13944e() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m13946g() {
        if (m13944e() == 0) {
            return true;
        }
        return false;
    }
}
