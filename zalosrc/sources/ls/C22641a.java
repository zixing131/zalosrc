package ls;

import au.AbstractC2347g;
import com.zing.zalo.control.ContactProfile;
import org.json.JSONObject;
import p304ks.AbstractC21935u;

/* renamed from: ls.a */
/* loaded from: classes4.dex */
public class C22641a {

    /* renamed from: a */
    public String f111034a;

    /* renamed from: b */
    public String f111035b;

    /* renamed from: c */
    public String f111036c;

    /* renamed from: d */
    public String f111037d;

    /* renamed from: e */
    public int f111038e;

    /* renamed from: f */
    public long f111039f;

    /* renamed from: g */
    public String f111040g;

    /* renamed from: h */
    public boolean f111041h;

    public C22641a(JSONObject jSONObject) {
        this.f111034a = jSONObject.optString("userId");
        this.f111035b = jSONObject.optString("username", "");
        this.f111036c = jSONObject.optString("displayName", "");
        this.f111037d = jSONObject.optString("avatar", "");
        this.f111038e = jSONObject.optInt("gender", 0);
        this.f111039f = jSONObject.optLong("dob", 0L);
        this.f111040g = jSONObject.optString("phoneNumber", "");
        this.f111041h = jSONObject.optString("isFr").equals("1");
    }

    /* renamed from: a */
    public ContactProfile m117215a() {
        ContactProfile contactProfile = new ContactProfile();
        contactProfile.f42434r = this.f111034a;
        contactProfile.f42437s = this.f111036c;
        contactProfile.f42443u = this.f111035b;
        contactProfile.f42446v = this.f111037d;
        contactProfile.f42449w = this.f111038e;
        contactProfile.f42452x = String.valueOf(this.f111039f);
        contactProfile.f42455y = this.f111040g;
        contactProfile.m40423p1(this.f111041h);
        return contactProfile;
    }

    /* renamed from: b */
    public String m117216b() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("{");
            sb2.append("\"userId\":");
            sb2.append(JSONObject.quote(this.f111034a));
            sb2.append(",");
            sb2.append("\"username\":");
            sb2.append(JSONObject.quote(this.f111035b));
            sb2.append(",");
            sb2.append("\"displayName\":");
            sb2.append(JSONObject.quote(this.f111036c));
            sb2.append(",");
            sb2.append("\"avatar\":");
            sb2.append(JSONObject.quote(this.f111037d));
            sb2.append(",");
            sb2.append("\"gender\":");
            sb2.append(JSONObject.quote("" + this.f111038e));
            sb2.append(",");
            sb2.append("\"dob\":");
            sb2.append(JSONObject.quote("" + this.f111039f));
            sb2.append(",");
            sb2.append("\"phoneNumber\":");
            sb2.append(JSONObject.quote(this.f111040g));
            sb2.append(",");
            sb2.append("\"isFr\":");
            if (this.f111041h) {
                str = "1";
            } else {
                str = "0";
            }
            sb2.append(JSONObject.quote(str));
            sb2.append("}");
        } catch (Exception unused) {
        }
        return sb2.toString();
    }

    public C22641a(String str) {
        this.f111034a = str;
    }

    public C22641a(ContactProfile contactProfile) {
        this.f111034a = contactProfile.f42434r;
        this.f111035b = contactProfile.f42443u;
        this.f111036c = contactProfile.f42437s;
        this.f111037d = contactProfile.f42446v;
        this.f111038e = contactProfile.f42449w;
        this.f111039f = AbstractC2347g.m12316b(contactProfile.f42452x, 0L);
        this.f111040g = contactProfile.f42455y;
        this.f111041h = AbstractC21935u.m114552s(false, contactProfile.f42434r);
    }
}
