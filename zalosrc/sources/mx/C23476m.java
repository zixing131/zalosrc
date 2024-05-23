package mx;

import android.text.TextUtils;
import org.json.JSONObject;
import p171fx.AbstractC19164e;

/* renamed from: mx.m */
/* loaded from: classes.dex */
public class C23476m {

    /* renamed from: a */
    private boolean f114002a;

    /* renamed from: b */
    private boolean f114003b;

    /* renamed from: c */
    private boolean f114004c;

    private C23476m(boolean z11, boolean z12, boolean z13) {
        this.f114002a = z11;
        this.f114003b = z12;
        this.f114004c = z13;
    }

    /* renamed from: d */
    public static boolean m123246d() {
        return false;
    }

    /* renamed from: e */
    public static boolean m123247e() {
        if (AbstractC19164e.m100528n() && AbstractC19164e.m100530p()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m123248f() {
        if (m123246d() && AbstractC19164e.m100528n()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static C23476m m123249g(String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            if (TextUtils.isEmpty(str)) {
                return new C23476m(false, false, true);
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("tracking");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("upload");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("block_canary");
            if (optJSONObject.optInt("enable", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (optJSONObject2.optInt("enable", 0) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (optJSONObject3.optInt("enable", 1) == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            return new C23476m(z11, z12, z13);
        } catch (Exception e11) {
            e11.printStackTrace();
            return new C23476m(false, false, true);
        }
    }

    /* renamed from: a */
    public boolean m123250a() {
        return this.f114004c;
    }

    /* renamed from: b */
    public boolean m123251b() {
        return this.f114002a;
    }

    /* renamed from: c */
    public boolean m123252c() {
        return this.f114003b;
    }
}
