package dj;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import ig0.AbstractC20550a;
import org.json.JSONException;
import org.json.JSONObject;
import p716zh.C32098s;

/* renamed from: dj.y0 */
/* loaded from: classes3.dex */
public class C18013y0 extends C17969i0 {

    /* renamed from: B */
    public C32098s f91251B;

    /* renamed from: C */
    public C17975k0 f91252C;

    /* renamed from: D */
    public C17978l0 f91253D;

    public C18013y0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        m95794j();
    }

    /* renamed from: h */
    public static C18013y0 m95793h(String str, String str2, int i11, String str3, String str4, String str5, String str6) {
        C32098s c32098s = new C32098s("", str2, str, "", 0, 0, "", "", "", 1, 0, 0, str6, "");
        if (!TextUtils.isEmpty(str4)) {
            String m106804a = AbstractC20550a.m106804a(str4);
            if (!TextUtils.isEmpty(m106804a)) {
                c32098s.f147961k = m106804a;
                c32098s.f147956f = 2;
            }
        }
        C18013y0 c18013y0 = new C18013y0(str, i11, str3, str4, str5, "recommened.link", c32098s.m154935e());
        c18013y0.f91251B = c32098s;
        return c18013y0;
    }

    /* renamed from: j */
    private void m95794j() {
        char c11;
        try {
            String str = this.f91016u;
            switch (str.hashCode()) {
                case -2138772447:
                    if (str.equals("recommened.misscall")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1103456014:
                    if (str.equals("recommened.calltime")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -999310090:
                    if (str.equals("recommened.vip")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -914139583:
                    if (str.equals("recommened.link")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -913862126:
                    if (str.equals("recommened.user")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -302954634:
                    if (str.equals("recommened.groupcall")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            if (c11 != 0) {
                if (c11 != 1 && c11 != 2 && c11 != 3) {
                    if ((c11 == 4 || c11 == 5) && !TextUtils.isEmpty(this.f91015t)) {
                        try {
                            this.f91253D = new C17978l0(new JSONObject(this.f91015t));
                            return;
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(this.f91017v)) {
                    this.f91252C = new C17975k0(new JSONObject(this.f91017v));
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.f91017v)) {
                this.f91251B = new C32098s(new JSONObject(this.f91017v));
                if (!TextUtils.isEmpty(this.f91014s)) {
                    String m106804a = AbstractC20550a.m106804a(this.f91014s);
                    if (!TextUtils.isEmpty(m106804a)) {
                        this.f91251B.f147961k = m106804a;
                    }
                }
            }
        } catch (JSONException e12) {
            e12.printStackTrace();
        }
    }

    @Override // dj.C17969i0
    /* renamed from: f */
    public String mo95598f() {
        C32098s c32098s = this.f91251B;
        if (c32098s != null && c32098s.f147956f == 5) {
            return this.f91014s;
        }
        return super.mo95598f();
    }

    /* renamed from: g */
    public C18013y0 m95795g() {
        C18013y0 c18013y0 = new C18013y0(this.f91011p, this.f91012q, this.f91013r, this.f91014s, this.f91015t, this.f91016u, this.f91017v);
        c18013y0.f91251B = this.f91251B;
        return c18013y0;
    }

    /* renamed from: i */
    public String m95796i() {
        try {
            C32098s c32098s = this.f91251B;
            if (c32098s == null || TextUtils.isEmpty(c32098s.f147953c)) {
                return "";
            }
            return this.f91251B.f147953c;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: k */
    public void m95797k(String str, String str2) {
        String str3;
        if (this.f91253D == null) {
            this.f91253D = new C17978l0(null);
        }
        C17978l0 c17978l0 = this.f91253D;
        c17978l0.f91056d = str;
        if (str2 != null) {
            c17978l0.f91057e = str2;
        }
        try {
            if (this.f91015t.isEmpty()) {
                str3 = "{}";
            } else {
                str3 = this.f91015t;
            }
            JSONObject jSONObject = new JSONObject(str3);
            jSONObject.put("qrCodeUrl", str);
            jSONObject.put("oaShortLink", str2);
            this.f91015t = jSONObject.toString();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public String toString() {
        return "ChatRichContentRecommend{title='" + this.f91011p + "', href='" + this.f91014s + "', description='" + this.f91015t + "'}";
    }

    public C18013y0(JSONObject jSONObject) {
        super(jSONObject);
        m95794j();
    }
}
