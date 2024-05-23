package ge;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ge.o */
/* loaded from: classes3.dex */
public class C19423o {

    /* renamed from: a */
    public int f96364a;

    /* renamed from: b */
    public String f96365b;

    /* renamed from: c */
    public String f96366c;

    /* renamed from: d */
    public String f96367d;

    public C19423o(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("uid");
        String optString = jSONObject.optString("dpn");
        String optString2 = jSONObject.optString("avt");
        String optString3 = jSONObject.optString("desc");
        this.f96364a = optInt;
        this.f96365b = optString;
        this.f96366c = optString2;
        this.f96367d = optString3;
    }

    /* renamed from: a */
    public JSONObject m101568a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", this.f96364a);
            jSONObject.put("dpn", this.f96365b);
            jSONObject.put("avt", this.f96366c);
            jSONObject.put("desc", this.f96367d);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
