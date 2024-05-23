package dj;

import hu.AbstractC20130d;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p716zh.C31868c5;

/* renamed from: dj.t0 */
/* loaded from: classes3.dex */
public class C18002t0 extends C17969i0 {

    /* renamed from: B */
    public C31868c5 f91181B;

    /* renamed from: C */
    public String f91182C;

    /* renamed from: D */
    public String f91183D;

    /* renamed from: E */
    public boolean f91184E;

    /* renamed from: F */
    private String f91185F;

    public C18002t0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        m95714i();
    }

    /* renamed from: g */
    public static String m95713g(double d11, double d12, String str, String str2, boolean z11) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append("\"longitude\":");
        sb2.append(JSONObject.quote("" + d11));
        sb2.append(",");
        sb2.append("\"latitude\":");
        sb2.append(JSONObject.quote("" + d12));
        sb2.append(",");
        sb2.append("\"appId\":");
        sb2.append(JSONObject.quote("" + str));
        sb2.append(",");
        sb2.append("\"srcId\":");
        sb2.append(JSONObject.quote(str2));
        sb2.append(",");
        sb2.append("\"isUserLocation\":");
        if (z11) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: i */
    private void m95714i() {
        try {
            this.f91181B = new C31868c5();
            JSONObject jSONObject = new JSONObject(this.f91017v);
            this.f91181B.m153172d(jSONObject.optDouble("longitude"));
            this.f91181B.m153171c(jSONObject.optDouble("latitude"));
            this.f91182C = jSONObject.optString("srcId", "");
            this.f91183D = jSONObject.optString("appId", "");
            int optInt = jSONObject.optInt("isUserLocation");
            boolean z11 = true;
            if (optInt != 1) {
                z11 = false;
            }
            this.f91184E = z11;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatRichContentLocation", e11);
        }
    }

    /* renamed from: h */
    public String m95715h(boolean z11) {
        if (this.f91185F == null && this.f91181B != null) {
            this.f91185F = AbstractC20130d.m104819A(z11) + (this.f91181B.m153170b() + "_" + this.f91181B.m153169a());
        }
        return this.f91185F;
    }

    public C18002t0(JSONObject jSONObject) {
        super(jSONObject);
        m95714i();
    }
}
