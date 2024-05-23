package dj;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: dj.s0 */
/* loaded from: classes3.dex */
public class C17999s0 extends C17969i0 {

    /* renamed from: B */
    public boolean f91168B;

    /* renamed from: C */
    public String f91169C;

    /* renamed from: D */
    public int f91170D;

    /* renamed from: E */
    public int f91171E;

    /* renamed from: F */
    public String f91172F;

    /* renamed from: G */
    public String f91173G;

    public C17999s0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91168B = false;
        m95710h();
    }

    /* renamed from: h */
    private void m95710h() {
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                if (jSONObject.has("streamUrlPlayback")) {
                    this.f91169C = jSONObject.getString("streamUrlPlayback");
                }
                if (jSONObject.has("streamUrlLive")) {
                    this.f91172F = jSONObject.getString("streamUrlLive");
                }
                if (jSONObject.has("thumbWidth")) {
                    this.f91170D = jSONObject.getInt("thumbWidth");
                }
                if (jSONObject.has("thumbHeight")) {
                    this.f91171E = jSONObject.getInt("thumbHeight");
                }
                if (jSONObject.has("streamId")) {
                    this.f91173G = jSONObject.optString("streamId");
                }
                if (jSONObject.has("isLiveEnded")) {
                    boolean z11 = true;
                    if (jSONObject.getInt("isLiveEnded") != 1) {
                        z11 = false;
                    }
                    this.f91168B = z11;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public String m95711g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("streamUrlPlayback", this.f91169C);
            jSONObject.put("streamUrlLive", this.f91172F);
            jSONObject.put("thumbWidth", this.f91170D);
            jSONObject.put("thumbHeight", this.f91171E);
            jSONObject.put("streamId", this.f91173G);
            jSONObject.put("isLiveEnded", this.f91168B ? 1 : 0);
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public void m95712i(boolean z11) {
        this.f91168B = z11;
        this.f91017v = m95711g();
    }

    public C17999s0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91168B = false;
        m95710h();
    }
}
