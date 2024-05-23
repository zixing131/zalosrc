package ls;

import org.json.JSONObject;

/* renamed from: ls.c */
/* loaded from: classes4.dex */
public class C22643c {

    /* renamed from: a */
    public int f111045a = 0;

    /* renamed from: b */
    public int f111046b = 0;

    /* renamed from: c */
    public int f111047c = 0;

    /* renamed from: d */
    public int f111048d = 1;

    /* renamed from: e */
    public int f111049e = 0;

    /* renamed from: a */
    public static C22643c m117217a(JSONObject jSONObject) {
        int i11;
        int i12;
        int i13;
        if (jSONObject != null && !jSONObject.isNull("data")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            C22643c c22643c = new C22643c();
            if (jSONObject2.isNull("isRequested")) {
                i11 = 0;
            } else {
                i11 = jSONObject2.getInt("isRequested");
            }
            c22643c.f111045a = i11;
            if (jSONObject2.isNull("isFriend")) {
                i12 = 0;
            } else {
                i12 = jSONObject2.getInt("isFriend");
            }
            c22643c.f111046b = i12;
            if (jSONObject2.isNull("isRequesting")) {
                i13 = 0;
            } else {
                i13 = jSONObject2.getInt("isRequesting");
            }
            c22643c.f111047c = i13;
            c22643c.f111048d = jSONObject2.optInt("addFriendPrivacy", 1);
            c22643c.f111049e = jSONObject2.optInt("ranking", 0);
            return c22643c;
        }
        return null;
    }
}
