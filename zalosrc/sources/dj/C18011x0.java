package dj;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: dj.x0 */
/* loaded from: classes3.dex */
public class C18011x0 extends C18005u0 {

    /* renamed from: K */
    public String f91248K;

    /* renamed from: L */
    public long f91249L;

    public C18011x0() {
    }

    @Override // dj.C18005u0
    /* renamed from: g */
    public JSONObject mo95717g() {
        JSONObject mo95717g = super.mo95717g();
        try {
            mo95717g.put("pollId", this.f91248K);
            mo95717g.put("pollVer", this.f91249L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return mo95717g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dj.C18005u0
    /* renamed from: i */
    public void mo95718i() {
        super.mo95718i();
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                this.f91248K = jSONObject.optString("pollId");
                if (jSONObject.has("pollVer")) {
                    this.f91249L = jSONObject.optLong("pollVer");
                } else {
                    this.f91249L = jSONObject.optLong("pollVersion");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C18011x0(JSONObject jSONObject) {
        super(jSONObject);
    }

    public C18011x0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
    }
}
