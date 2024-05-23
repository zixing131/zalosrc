package ck;

import org.json.JSONObject;

/* renamed from: ck.e */
/* loaded from: classes3.dex */
public class C3564e {

    /* renamed from: a */
    private String f15101a;

    /* renamed from: b */
    private String f15102b;

    /* renamed from: c */
    private String f15103c;

    /* renamed from: d */
    private String f15104d;

    /* renamed from: e */
    private double f15105e;

    /* renamed from: f */
    private double f15106f;

    public C3564e(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject2;
        double d11;
        if (jSONObject != null) {
            try {
                if (jSONObject.isNull("name")) {
                    str = "";
                } else {
                    str = jSONObject.getString("name");
                }
                this.f15101a = str;
                if (jSONObject.isNull("thumburl")) {
                    str2 = "";
                } else {
                    str2 = jSONObject.getString("thumburl");
                }
                this.f15102b = str2;
                if (jSONObject.isNull("address")) {
                    str3 = "";
                } else {
                    str3 = jSONObject.getString("address");
                }
                this.f15103c = str3;
                this.f15104d = jSONObject.isNull("workingtime") ? "" : jSONObject.getString("workingtime");
                if (!jSONObject.isNull("locations")) {
                    jSONObject2 = jSONObject.getJSONObject("locations");
                } else {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    if (!jSONObject2.isNull("lon")) {
                        d11 = jSONObject2.getDouble("lon");
                    } else {
                        d11 = 0.0d;
                    }
                    this.f15105e = d11;
                    this.f15106f = jSONObject2.isNull("lat") ? 0.0d : jSONObject2.getDouble("lat");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String m18106a() {
        return this.f15103c;
    }

    /* renamed from: b */
    public double m18107b() {
        return this.f15106f;
    }

    /* renamed from: c */
    public double m18108c() {
        return this.f15105e;
    }

    /* renamed from: d */
    public String m18109d() {
        return this.f15101a;
    }

    /* renamed from: e */
    public String m18110e() {
        return this.f15102b;
    }

    /* renamed from: f */
    public String m18111f() {
        return this.f15104d;
    }
}
