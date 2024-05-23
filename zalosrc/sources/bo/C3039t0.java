package bo;

import org.json.JSONException;
import org.json.JSONObject;
import p726zr.C32546b;

/* renamed from: bo.t0 */
/* loaded from: classes4.dex */
public class C3039t0 {

    /* renamed from: a */
    public int f12243a = 0;

    /* renamed from: b */
    public int f12244b = 0;

    /* renamed from: c */
    public int f12245c = 0;

    /* renamed from: d */
    public C3051w0 f12246d;

    /* renamed from: e */
    public C32546b f12247e;

    /* renamed from: a */
    public JSONObject m14614a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("numcmt", this.f12243a);
            jSONObject.put("numlike", this.f12244b);
            jSONObject.put("hide_bottom_bar", this.f12245c);
            C3051w0 c3051w0 = this.f12246d;
            if (c3051w0 != null) {
                jSONObject.put("recently_liked", c3051w0.m14638b());
            }
            C32546b c32546b = this.f12247e;
            if (c32546b != null) {
                jSONObject.put("reaction_info", c32546b.m157608d());
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
