package p716zh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.t5 */
/* loaded from: classes3.dex */
public class C32118t5 {

    /* renamed from: a */
    public String f148055a;

    /* renamed from: b */
    public String f148056b;

    /* renamed from: c */
    public boolean f148057c;

    public C32118t5(String str, String str2, boolean z11) {
        this.f148055a = str;
        this.f148056b = str2;
        this.f148057c = z11;
    }

    /* renamed from: a */
    public JSONObject m155008a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
            jSONObject.put("uid", this.f148055a);
            jSONObject.put("dpn", this.f148056b);
            jSONObject.put("ignoreNickname", this.f148057c ? 1 : 0);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
