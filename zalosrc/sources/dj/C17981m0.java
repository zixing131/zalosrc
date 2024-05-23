package dj;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dj.m0 */
/* loaded from: classes3.dex */
public class C17981m0 extends C17969i0 {

    /* renamed from: B */
    public int f91074B;

    /* renamed from: C */
    public int f91075C;

    /* renamed from: D */
    public long f91076D;

    public C17981m0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91074B = 0;
        this.f91075C = 0;
        m95626h();
    }

    /* renamed from: h */
    private void m95626h() {
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                this.f91074B = jSONObject.optInt("width");
                this.f91075C = jSONObject.optInt("height");
                this.f91076D = jSONObject.optLong("fileSize");
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public String m95627g() {
        try {
            if (this.f91074B > 0 && this.f91075C > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", this.f91074B);
                jSONObject.put("height", this.f91075C);
                long j11 = this.f91076D;
                if (j11 > 0) {
                    jSONObject.put("fileSize", j11);
                }
                return jSONObject.toString();
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public void m95628i() {
        this.f91017v = m95627g();
    }

    public C17981m0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91074B = 0;
        this.f91075C = 0;
        m95626h();
    }

    public C17981m0(String str, int i11, int i12) {
        this(str, 0, "", "", "", "", "");
        this.f91074B = i11;
        this.f91075C = i12;
        m95628i();
    }

    public C17981m0(String str, String str2, String str3, int i11, int i12) {
        this(str, 0, str2, str3, "", "", "");
        this.f91074B = i11;
        this.f91075C = i12;
        m95628i();
    }
}
