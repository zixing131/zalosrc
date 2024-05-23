package ck;

import org.json.JSONObject;

/* renamed from: ck.f */
/* loaded from: classes3.dex */
public class C3565f {

    /* renamed from: a */
    private boolean f15107a;

    /* renamed from: b */
    private String f15108b;

    /* renamed from: c */
    private String f15109c;

    /* renamed from: d */
    private String f15110d;

    /* renamed from: e */
    private String f15111e;

    /* renamed from: f */
    private String f15112f;

    /* renamed from: g */
    private String f15113g;

    /* renamed from: h */
    private long f15114h;

    /* renamed from: i */
    private long f15115i;

    /* renamed from: j */
    private float f15116j;

    /* renamed from: k */
    private float f15117k;

    public C3565f(JSONObject jSONObject) {
        try {
            if (jSONObject.has("isOA")) {
                this.f15107a = jSONObject.getBoolean("isOA");
            }
            if (jSONObject.has("icon")) {
                this.f15108b = jSONObject.getString("icon");
            }
            if (jSONObject.has("distance")) {
                this.f15109c = jSONObject.getString("distance");
            }
            if (jSONObject.has("avatar")) {
                this.f15110d = jSONObject.getString("avatar");
            }
            if (jSONObject.has("displayName")) {
                this.f15111e = jSONObject.getString("displayName");
            }
            if (jSONObject.has("address")) {
                this.f15112f = jSONObject.getString("address");
            }
            if (jSONObject.has("status")) {
                this.f15113g = jSONObject.getString("status");
            }
            if (jSONObject.has("placeId")) {
                this.f15114h = jSONObject.getLong("placeId");
            }
            if (jSONObject.has("oaid")) {
                this.f15115i = jSONObject.getLong("oaid");
            }
            if (jSONObject.has("lat")) {
                this.f15116j = (float) jSONObject.getDouble("lat");
            }
            if (jSONObject.has("lon")) {
                this.f15117k = (float) jSONObject.getDouble("lon");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public String m18112a() {
        return this.f15112f;
    }

    /* renamed from: b */
    public String m18113b() {
        return this.f15110d;
    }

    /* renamed from: c */
    public String m18114c() {
        return this.f15111e;
    }

    /* renamed from: d */
    public String m18115d() {
        return this.f15109c;
    }

    /* renamed from: e */
    public String m18116e() {
        return this.f15108b;
    }

    /* renamed from: f */
    public float m18117f() {
        return this.f15116j;
    }

    /* renamed from: g */
    public float m18118g() {
        return this.f15117k;
    }

    /* renamed from: h */
    public long m18119h() {
        return this.f15115i;
    }

    /* renamed from: i */
    public String m18120i() {
        return this.f15113g;
    }

    /* renamed from: j */
    public boolean m18121j() {
        return this.f15107a;
    }
}
