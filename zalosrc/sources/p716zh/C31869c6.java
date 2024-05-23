package p716zh;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.C23307g;

/* renamed from: zh.c6 */
/* loaded from: classes3.dex */
public class C31869c6 {

    /* renamed from: a */
    public int f146355a;

    /* renamed from: b */
    public long f146356b;

    /* renamed from: c */
    public String f146357c;

    /* renamed from: d */
    public C32107s8 f146358d;

    /* renamed from: e */
    public String f146359e;

    /* renamed from: f */
    public long f146360f;

    /* renamed from: g */
    public C32121t8 f146361g;

    /* renamed from: h */
    public C23307g f146362h;

    public C31869c6() {
    }

    /* renamed from: a */
    public boolean m153173a() {
        if (this.f146355a == 4 && !TextUtils.isEmpty(this.f146359e) && this.f146356b > 0 && !TextUtils.isEmpty(this.f146357c)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public JSONObject m153174b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f146355a);
            jSONObject.put("arid", this.f146356b);
            jSONObject.put("id", this.f146357c);
            if (!TextUtils.isEmpty(this.f146359e)) {
                jSONObject.put("redirect_url", this.f146359e);
            }
            jSONObject.put("video_duration", this.f146360f);
            C32107s8 c32107s8 = this.f146358d;
            if (c32107s8 != null) {
                jSONObject.put("owner", c32107s8.m154982a());
            }
            C32121t8 c32121t8 = this.f146361g;
            if (c32121t8 != null) {
                jSONObject.put("params", c32121t8.m155022a());
            }
            C23307g c23307g = this.f146362h;
            if (c23307g != null) {
                jSONObject.put("dimen", c23307g.m120735a());
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C31869c6(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f146355a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
        this.f146356b = jSONObject.optLong("arid");
        this.f146357c = jSONObject.optString("id");
        this.f146359e = jSONObject.optString("redirect_url");
        this.f146360f = jSONObject.optLong("video_duration");
        JSONObject optJSONObject = jSONObject.optJSONObject("owner");
        if (optJSONObject != null) {
            this.f146358d = new C32107s8(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
        if (optJSONObject2 != null) {
            this.f146361g = new C32121t8(optJSONObject2);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("dimen");
        if (optJSONObject3 != null) {
            this.f146362h = new C23307g(optJSONObject3);
        }
    }
}
