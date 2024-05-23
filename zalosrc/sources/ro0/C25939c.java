package ro0;

import bp0.AbstractC3082b0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ro0.c */
/* loaded from: classes7.dex */
public class C25939c {

    /* renamed from: a */
    public int f123682a = 0;

    /* renamed from: b */
    public int f123683b = 0;

    /* renamed from: c */
    public int f123684c = 300;

    /* renamed from: d */
    public int f123685d = -1;

    /* renamed from: e */
    public boolean f123686e = true;

    /* renamed from: f */
    public int f123687f = -1;

    /* renamed from: g */
    public boolean f123688g = true;

    /* renamed from: h */
    public int f123689h = -1;

    /* renamed from: i */
    public int f123690i = -1;

    /* renamed from: j */
    public int f123691j = -1;

    /* renamed from: k */
    public boolean f123692k = true;

    /* renamed from: a */
    public String m133649a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("audioLossPercent", this.f123682a);
            jSONObject.put("videoLossPercent", this.f123683b);
            jSONObject.put("videoBitrate", this.f123684c);
            jSONObject.put("videoEncodeFps", this.f123685d);
            jSONObject.put("videoNack", this.f123686e);
            jSONObject.put("encodeRes", this.f123687f);
            jSONObject.put("audioNack", this.f123688g);
            jSONObject.put("audioBitrate", this.f123689h);
            jSONObject.put("audioSampleRate", this.f123690i);
            jSONObject.put("audioChannel", this.f123691j);
            jSONObject.put("enableBwEstimate", this.f123692k);
            return jSONObject.toString();
        } catch (JSONException e11) {
            AbstractC3082b0.m15422d("DevConfig", e11.getMessage());
            return "";
        }
    }
}
