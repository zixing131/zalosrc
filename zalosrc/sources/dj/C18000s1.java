package dj;

import org.json.JSONObject;

/* renamed from: dj.s1 */
/* loaded from: classes3.dex */
public class C18000s1 {

    /* renamed from: a */
    public int f91174a;

    /* renamed from: b */
    public String f91175b;

    /* renamed from: c */
    public String f91176c;

    /* renamed from: d */
    public String f91177d;

    /* renamed from: e */
    public String f91178e;

    /* renamed from: f */
    public String f91179f;

    public C18000s1(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("richContentNotif");
            if (optJSONObject != null) {
                this.f91174a = optJSONObject.optInt("notifType", 0);
                this.f91175b = optJSONObject.optString("celsius");
                this.f91177d = optJSONObject.optString("title");
                this.f91178e = optJSONObject.optString("dateTime");
                this.f91179f = optJSONObject.optString("description");
                this.f91176c = optJSONObject.optString("icon");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
