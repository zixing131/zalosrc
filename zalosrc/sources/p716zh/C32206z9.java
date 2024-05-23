package p716zh;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: zh.z9 */
/* loaded from: classes3.dex */
public class C32206z9 {

    /* renamed from: A */
    public int f148553A;

    /* renamed from: B */
    public int f148554B;

    /* renamed from: a */
    public int f148555a;

    /* renamed from: b */
    public int f148556b;

    /* renamed from: c */
    public String f148557c;

    /* renamed from: d */
    public String f148558d;

    /* renamed from: e */
    public long f148559e;

    /* renamed from: f */
    public long f148560f;

    /* renamed from: g */
    public long f148561g;

    /* renamed from: h */
    public int f148562h;

    /* renamed from: i */
    public int f148563i;

    /* renamed from: j */
    public int f148564j;

    /* renamed from: k */
    public int f148565k;

    /* renamed from: l */
    public int f148566l;

    /* renamed from: m */
    public int f148567m;

    /* renamed from: n */
    public int f148568n;

    /* renamed from: o */
    public double f148569o;

    /* renamed from: p */
    public String f148570p;

    /* renamed from: q */
    public String f148571q;

    /* renamed from: r */
    public String f148572r;

    /* renamed from: s */
    public String f148573s;

    /* renamed from: t */
    public String f148574t;

    /* renamed from: u */
    public String f148575u;

    /* renamed from: v */
    public boolean f148576v;

    /* renamed from: w */
    public String f148577w;

    /* renamed from: x */
    public int f148578x;

    /* renamed from: y */
    public float f148579y;

    /* renamed from: z */
    public boolean f148580z;

    public C32206z9(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        this.f148559e = -1L;
        this.f148560f = -1L;
        this.f148561g = -1L;
        this.f148562h = -1;
        this.f148563i = -1;
        this.f148564j = -1;
        this.f148565k = -1;
        this.f148566l = -1;
        this.f148567m = -1;
        this.f148568n = -1;
        this.f148569o = -1.0d;
        this.f148576v = false;
        this.f148553A = 0;
        this.f148554B = 1;
        try {
            if (jSONObject.has("id")) {
                this.f148555a = AbstractC18069a.m96085d(jSONObject, "id");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                this.f148556b = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            if (jSONObject.has("title")) {
                this.f148557c = AbstractC18069a.m96089h(jSONObject, "title");
            }
            if (jSONObject.has("urlPopup")) {
                this.f148558d = AbstractC18069a.m96089h(jSONObject, "urlPopup");
            }
            if (jSONObject.has("startedTime")) {
                this.f148559e = AbstractC18069a.m96087f(jSONObject, "startedTime");
            }
            if (jSONObject.has("endTime")) {
                this.f148560f = AbstractC18069a.m96087f(jSONObject, "endTime");
            }
            if (jSONObject.has("intervalTime")) {
                this.f148561g = AbstractC18069a.m96087f(jSONObject, "intervalTime");
            }
            if (jSONObject.has("showTime") && (optJSONObject3 = jSONObject.optJSONObject("showTime")) != null) {
                if (optJSONObject3.has("showTimeStart")) {
                    this.f148562h = AbstractC18069a.m96085d(optJSONObject3, "showTimeStart");
                }
                if (optJSONObject3.has("showTimeEnd")) {
                    this.f148563i = AbstractC18069a.m96085d(optJSONObject3, "showTimeEnd");
                }
            }
            if (jSONObject.has("clientVersionShow") && (optJSONObject2 = jSONObject.optJSONObject("clientVersionShow")) != null) {
                if (optJSONObject2.has("minClientVersion")) {
                    this.f148564j = AbstractC18069a.m96085d(optJSONObject2, "minClientVersion");
                }
                if (optJSONObject2.has("maxClientVersion")) {
                    this.f148565k = AbstractC18069a.m96085d(optJSONObject2, "maxClientVersion");
                }
            }
            if (jSONObject.has("networkShow")) {
                this.f148566l = AbstractC18069a.m96085d(jSONObject, "networkShow");
            }
            if (jSONObject.has("memoryShow")) {
                this.f148567m = AbstractC18069a.m96085d(jSONObject, "memoryShow");
            }
            if (jSONObject.has("buttonBottom") && (optJSONObject = jSONObject.optJSONObject("buttonBottom")) != null) {
                if (optJSONObject.has("clickclose")) {
                    this.f148568n = AbstractC18069a.m96085d(optJSONObject, "clickclose");
                }
                if (optJSONObject.has("clickcloseDuration")) {
                    this.f148569o = AbstractC18069a.m96084c(optJSONObject, "clickcloseDuration");
                }
                if (optJSONObject.has("btnCap")) {
                    this.f148571q = AbstractC18069a.m96089h(optJSONObject, "btnCap");
                }
                if (optJSONObject.has("actionId")) {
                    this.f148572r = AbstractC18069a.m96089h(optJSONObject, "actionId");
                }
                if (optJSONObject.has("params")) {
                    String m96089h = AbstractC18069a.m96089h(optJSONObject, "params");
                    this.f148573s = m96089h;
                    if (!TextUtils.isEmpty(m96089h)) {
                        JSONObject jSONObject3 = new JSONObject(this.f148573s);
                        if (!jSONObject3.isNull("data")) {
                            jSONObject2 = jSONObject3.getJSONObject("data");
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            this.f148574t = jSONObject2.optString("android");
                            this.f148575u = jSONObject2.optString("checksumAPK");
                        }
                    }
                }
                this.f148570p = optJSONObject.optString("btnCloseCap", "");
            }
            if (jSONObject.has("hasCloseButton")) {
                this.f148576v = AbstractC18069a.m96083b(jSONObject, "hasCloseButton");
            }
            if (jSONObject.has("fallbackMessage")) {
                this.f148577w = AbstractC18069a.m96089h(jSONObject, "fallbackMessage");
            }
            if (jSONObject.has("downloadConfig")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("downloadConfig");
                if (jSONObject4.has("sizePerDown")) {
                    this.f148578x = AbstractC18069a.m96085d(jSONObject4, "sizePerDown");
                }
                if (jSONObject4.has("splitTime")) {
                    this.f148579y = (float) AbstractC18069a.m96084c(jSONObject4, "splitTime");
                }
            }
            if (jSONObject.has("downloadCompleted")) {
                this.f148580z = AbstractC18069a.m96083b(jSONObject, "downloadCompleted");
            }
            if (jSONObject.has("retryCount")) {
                this.f148553A = AbstractC18069a.m96085d(jSONObject, "retryCount");
            }
            if (jSONObject.has("maxRetryCount")) {
                this.f148554B = AbstractC18069a.m96085d(jSONObject, "maxRetryCount");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f148555a);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f148556b);
            jSONObject.put("title", this.f148557c);
            jSONObject.put("urlPopup", this.f148558d);
            jSONObject.put("startedTime", this.f148559e);
            jSONObject.put("endTime", this.f148560f);
            jSONObject.put("intervalTime", this.f148561g);
            if (this.f148562h > 0 && this.f148563i > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("showTimeStart", this.f148562h);
                jSONObject2.put("showTimeEnd", this.f148563i);
                jSONObject.put("showTime", jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("minClientVersion", this.f148564j);
            jSONObject3.put("maxClientVersion", this.f148565k);
            jSONObject.put("clientVersionShow", jSONObject3);
            jSONObject.put("networkShow", this.f148566l);
            jSONObject.put("memoryShow", this.f148567m);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("clickclose", this.f148568n);
            jSONObject4.put("clickcloseDuration", this.f148569o);
            jSONObject4.put("btnCap", this.f148571q);
            jSONObject4.put("actionId", this.f148572r);
            jSONObject4.put("params", this.f148573s);
            jSONObject4.put("btnCloseCap", this.f148570p);
            jSONObject.put("buttonBottom", jSONObject4);
            jSONObject.put("hasCloseButton", this.f148576v);
            jSONObject.put("fallbackMessage", this.f148577w);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("sizePerDown", this.f148578x);
            jSONObject5.put("splitTime", this.f148579y);
            jSONObject.put("downloadConfig", jSONObject5);
            jSONObject.put("downloadCompleted", this.f148580z);
            jSONObject.put("retryCount", this.f148553A);
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
