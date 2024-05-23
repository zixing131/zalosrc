package ck;

import org.json.JSONObject;

/* renamed from: ck.g */
/* loaded from: classes3.dex */
public class C3566g {

    /* renamed from: a */
    public String f15118a;

    /* renamed from: b */
    public String f15119b;

    /* renamed from: c */
    public String f15120c;

    /* renamed from: d */
    public String f15121d;

    /* renamed from: e */
    public long f15122e;

    /* renamed from: f */
    public int f15123f;

    public C3566g() {
        this.f15118a = "";
        this.f15119b = "";
        this.f15120c = "";
        this.f15121d = "";
        this.f15122e = 0L;
        this.f15123f = 0;
    }

    /* renamed from: a */
    public JSONObject m18122a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", this.f15118a);
            jSONObject.put("uid_friend", this.f15119b);
            jSONObject.put("name", this.f15120c);
            jSONObject.put("phone", this.f15121d);
            jSONObject.put("time_delete", this.f15122e);
            jSONObject.put("state", this.f15123f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C3566g(JSONObject jSONObject) {
        this.f15118a = "";
        this.f15119b = "";
        this.f15120c = "";
        this.f15121d = "";
        this.f15122e = 0L;
        this.f15123f = 0;
        this.f15118a = jSONObject.optString("uid", "");
        this.f15119b = jSONObject.optString("uid_friend", "");
        this.f15120c = jSONObject.optString("name", "");
        this.f15121d = jSONObject.optString("phone", "");
        this.f15122e = jSONObject.optLong("time_delete", 0L);
        this.f15123f = jSONObject.optInt("state", 0);
    }
}
