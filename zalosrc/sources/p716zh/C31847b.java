package p716zh;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.b */
/* loaded from: classes3.dex */
public class C31847b {

    /* renamed from: a */
    public int f146214a;

    /* renamed from: b */
    public int f146215b;

    /* renamed from: c */
    public int f146216c;

    /* renamed from: d */
    public int f146217d;

    /* renamed from: e */
    public long f146218e;

    /* renamed from: f */
    public long f146219f;

    public C31847b() {
        this.f146214a = -1;
        this.f146215b = -1;
        this.f146216c = -1;
        this.f146217d = -1;
        this.f146218e = -1L;
        this.f146219f = -1L;
    }

    /* renamed from: a */
    public String m153089a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCloseFriend", this.f146214a);
            jSONObject.put("isFriend", this.f146215b);
            jSONObject.put("friendBirthday", this.f146216c);
            jSONObject.put("chatGender", this.f146217d);
            jSONObject.put("startTime", this.f146218e);
            jSONObject.put("endTime", this.f146219f);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    public C31847b(JSONObject jSONObject) {
        this.f146214a = -1;
        this.f146215b = -1;
        this.f146216c = -1;
        this.f146217d = -1;
        this.f146218e = -1L;
        this.f146219f = -1L;
        if (jSONObject != null) {
            this.f146214a = jSONObject.optInt("isCloseFriend", -1);
            this.f146215b = jSONObject.optInt("isFriend", -1);
            this.f146216c = jSONObject.optInt("friendBirthday", -1);
            this.f146217d = jSONObject.optInt("chatGender", -1);
            this.f146218e = jSONObject.optLong("startTime", -1L);
            this.f146219f = jSONObject.optLong("endTime", -1L);
        }
    }
}
