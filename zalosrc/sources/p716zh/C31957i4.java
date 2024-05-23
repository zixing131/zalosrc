package p716zh;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.i4 */
/* loaded from: classes3.dex */
public class C31957i4 {

    /* renamed from: a */
    public int f146863a;

    /* renamed from: b */
    public int f146864b;

    /* renamed from: c */
    public int f146865c;

    /* renamed from: f */
    public boolean f146868f;

    /* renamed from: d */
    public String f146866d = "";

    /* renamed from: e */
    public String f146867e = "";

    /* renamed from: g */
    public String f146869g = "";

    /* renamed from: a */
    public JSONObject m153656a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", this.f146863a);
            jSONObject.put("num", this.f146864b);
            jSONObject.put("uniq", this.f146865c);
            jSONObject.put("first", this.f146866d);
            jSONObject.put("last", this.f146869g);
            jSONObject.put("most", this.f146867e);
            jSONObject.put("text", !this.f146868f ? 1 : 0);
            return jSONObject;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
