package dj;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: dj.l0 */
/* loaded from: classes3.dex */
public class C17978l0 {

    /* renamed from: a */
    public String f91053a;

    /* renamed from: b */
    public String f91054b;

    /* renamed from: c */
    public String f91055c;

    /* renamed from: d */
    public String f91056d;

    /* renamed from: e */
    public String f91057e;

    public C17978l0(JSONObject jSONObject) {
        this.f91053a = "";
        this.f91054b = "";
        this.f91055c = "";
        this.f91056d = "";
        this.f91057e = "";
        if (jSONObject != null) {
            try {
                this.f91053a = jSONObject.optString("phone");
                this.f91054b = jSONObject.optString("caption");
                this.f91055c = jSONObject.optString("gUid");
                this.f91056d = jSONObject.optString("qrCodeUrl");
                this.f91057e = jSONObject.optString("oaShortLink");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String m95618a() {
        try {
            if (TextUtils.isEmpty(this.f91053a) && TextUtils.isEmpty(this.f91054b) && TextUtils.isEmpty(this.f91055c)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.f91053a)) {
                jSONObject.put("phone", this.f91053a);
            }
            if (!TextUtils.isEmpty(this.f91054b)) {
                jSONObject.put("caption", this.f91054b);
            }
            if (!TextUtils.isEmpty(this.f91055c)) {
                jSONObject.put("gUid", this.f91055c);
            }
            if (!TextUtils.isEmpty(this.f91056d)) {
                jSONObject.put("qrCodeUrl", this.f91056d);
            }
            if (!TextUtils.isEmpty(this.f91057e)) {
                jSONObject.put("oaShortLink", this.f91057e);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
