package dj;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: dj.q0 */
/* loaded from: classes3.dex */
public class C17993q0 extends C17969i0 {

    /* renamed from: B */
    public int f91134B;

    /* renamed from: C */
    public int f91135C;

    /* renamed from: D */
    public String f91136D;

    /* renamed from: E */
    public boolean f91137E;

    /* renamed from: F */
    public String f91138F;

    public C17993q0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91134B = 0;
        this.f91135C = 0;
        this.f91136D = "";
        this.f91137E = true;
        this.f91138F = "";
        m95677g();
    }

    /* renamed from: g */
    private void m95677g() {
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                boolean z11 = false;
                this.f91134B = jSONObject.optInt("width", 0);
                this.f91135C = jSONObject.optInt("height", 0);
                this.f91136D = jSONObject.optString("small", "").trim();
                if (jSONObject.optInt("fileValid", 0) == 1) {
                    z11 = true;
                }
                this.f91137E = z11;
                this.f91138F = jSONObject.optString("contentId", "");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C17993q0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91134B = 0;
        this.f91135C = 0;
        this.f91136D = "";
        this.f91137E = true;
        this.f91138F = "";
        m95677g();
    }
}
