package p716zh;

import com.zing.zalo.control.ContactProfile;
import org.json.JSONObject;

/* renamed from: zh.gb */
/* loaded from: classes3.dex */
public class C31934gb {

    /* renamed from: a */
    public String f146729a;

    /* renamed from: b */
    public String f146730b;

    /* renamed from: c */
    public int f146731c;

    /* renamed from: d */
    public String f146732d;

    /* renamed from: e */
    public String f146733e;

    /* renamed from: f */
    public String f146734f;

    public C31934gb(String str, String str2, int i11) {
        this.f146729a = str;
        this.f146730b = str2;
        this.f146731c = i11;
    }

    /* renamed from: a */
    public ContactProfile m153478a() {
        ContactProfile contactProfile = new ContactProfile();
        contactProfile.f42434r = this.f146729a;
        contactProfile.f42455y = this.f146730b;
        contactProfile.f42437s = this.f146732d;
        contactProfile.f42446v = this.f146733e;
        contactProfile.f42460z1 = this.f146734f;
        return contactProfile;
    }

    public C31934gb(String str, String str2, String str3, String str4, String str5) {
        this.f146729a = str;
        this.f146730b = str2;
        this.f146732d = str3;
        this.f146733e = str4;
        this.f146734f = str5;
    }

    public C31934gb(ContactProfile contactProfile) {
        this.f146729a = contactProfile.f42434r;
        this.f146730b = contactProfile.f42455y;
        this.f146732d = contactProfile.f42437s;
        this.f146733e = contactProfile.f42446v;
        this.f146734f = contactProfile.f42460z1;
        this.f146731c = contactProfile.f42428p;
    }

    public C31934gb(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f146729a = !jSONObject.isNull("uid") ? jSONObject.optString("uid") : "";
                this.f146730b = !jSONObject.isNull("phone") ? jSONObject.optString("phone") : "";
                this.f146733e = !jSONObject.isNull("avatar") ? jSONObject.optString("avatar") : "";
                this.f146732d = !jSONObject.isNull("displayName") ? jSONObject.optString("displayName") : "";
                this.f146734f = jSONObject.isNull("username") ? "" : jSONObject.optString("username");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
