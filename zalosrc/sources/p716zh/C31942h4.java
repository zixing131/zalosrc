package p716zh;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import org.json.JSONObject;

/* renamed from: zh.h4 */
/* loaded from: classes3.dex */
public class C31942h4 {

    /* renamed from: a */
    public String f146760a;

    /* renamed from: b */
    public String f146761b;

    /* renamed from: c */
    public int f146762c;

    /* renamed from: d */
    public float f146763d;

    /* renamed from: e */
    public float f146764e;

    /* renamed from: f */
    public float f146765f;

    public C31942h4(JSONObject jSONObject) {
        int i11;
        String str;
        if (jSONObject != null) {
            try {
                this.f146760a = jSONObject.optString("url_res");
                if (!jSONObject.isNull("anchorType")) {
                    i11 = jSONObject.getInt("anchorType");
                } else {
                    i11 = 1;
                }
                this.f146762c = i11;
                if (!jSONObject.isNull("scaleType")) {
                    str = jSONObject.getString("scaleType");
                } else {
                    str = Image.SCALE_TYPE_NONE;
                }
                this.f146761b = str;
                this.f146763d = (float) jSONObject.optDouble("translateX");
                this.f146764e = (float) jSONObject.optDouble("translateY");
                this.f146765f = (float) jSONObject.optDouble("scale");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m153496a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f146760a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("url_res", str);
            jSONObject.put("anchorType", this.f146762c);
            String str2 = this.f146761b;
            if (str2 == null) {
                str2 = Image.SCALE_TYPE_NONE;
            }
            jSONObject.put("scaleType", str2);
            jSONObject.put("translateX", this.f146763d);
            jSONObject.put("translateY", this.f146764e);
            jSONObject.put("scale", this.f146765f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
