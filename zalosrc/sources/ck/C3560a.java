package ck;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONObject;

/* renamed from: ck.a */
/* loaded from: classes3.dex */
public class C3560a {

    /* renamed from: a */
    private int f15067a;

    /* renamed from: b */
    private String f15068b;

    /* renamed from: c */
    private String f15069c;

    /* renamed from: d */
    public String f15070d;

    /* renamed from: e */
    public int f15071e;

    /* renamed from: f */
    public int f15072f;

    /* renamed from: g */
    public String f15073g;

    /* renamed from: h */
    public int f15074h;

    /* renamed from: i */
    public String f15075i;

    /* renamed from: j */
    public String f15076j;

    /* renamed from: k */
    public long f15077k;

    /* renamed from: l */
    public int f15078l;

    public C3560a() {
        this.f15071e = 0;
    }

    /* renamed from: a */
    public String m18087a() {
        return this.f15069c;
    }

    /* renamed from: b */
    public String m18088b() {
        return this.f15068b;
    }

    /* renamed from: c */
    public void m18089c(String str) {
        this.f15069c = str;
    }

    /* renamed from: d */
    public void m18090d(String str) {
        this.f15068b = str;
    }

    /* renamed from: e */
    public void m18091e(int i11) {
        this.f15067a = i11;
    }

    /* renamed from: f */
    public JSONObject m18092f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f15067a);
            jSONObject.put("title", this.f15068b);
            jSONObject.put("msg", this.f15069c);
            jSONObject.put("lockAccountToken", this.f15070d);
            jSONObject.put("lockType", this.f15071e);
            jSONObject.put("countDown", this.f15074h);
            jSONObject.put("smsGateway", this.f15072f);
            jSONObject.put("smsSend", this.f15073g);
            jSONObject.put("phoneNumber", this.f15075i);
            jSONObject.put("token", this.f15076j);
            jSONObject.put("timeout", this.f15077k);
            jSONObject.put("showDisablePasswordOption", this.f15078l);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C3560a(JSONObject jSONObject) {
        this.f15071e = 0;
        if (jSONObject != null) {
            try {
                this.f15067a = !jSONObject.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) : 0;
                this.f15068b = !jSONObject.isNull("title") ? jSONObject.getString("title") : "";
                this.f15069c = !jSONObject.isNull("msg") ? jSONObject.getString("msg") : "";
                this.f15070d = !jSONObject.isNull("lockAccountToken") ? jSONObject.getString("lockAccountToken") : "";
                this.f15071e = !jSONObject.isNull("lockType") ? jSONObject.getInt("lockType") : 0;
                this.f15074h = jSONObject.optInt("countDown", 10);
                this.f15072f = jSONObject.optInt("smsGateway", 0);
                this.f15073g = jSONObject.optString("smsSend", "");
                this.f15075i = jSONObject.optString("phoneNumber", "");
                this.f15076j = jSONObject.optString("token", "");
                this.f15077k = jSONObject.optLong("timeout", 0L);
                this.f15078l = jSONObject.optInt("showDisablePasswordOption", 1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
