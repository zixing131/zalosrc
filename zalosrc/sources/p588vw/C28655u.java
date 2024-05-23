package p588vw;

import java.util.Objects;
import org.json.JSONObject;

/* renamed from: vw.u */
/* loaded from: classes.dex */
public class C28655u {

    /* renamed from: a */
    public String f132863a;

    /* renamed from: b */
    public String f132864b;

    /* renamed from: c */
    public String f132865c;

    /* renamed from: d */
    public int f132866d;

    /* renamed from: f */
    public boolean f132868f;

    /* renamed from: g */
    public boolean f132869g;

    /* renamed from: e */
    public boolean f132867e = true;

    /* renamed from: h */
    public boolean f132870h = false;

    /* renamed from: i */
    public boolean f132871i = false;

    /* renamed from: j */
    public boolean f132872j = false;

    public C28655u(String str, String str2, String str3, int i11, boolean z11, boolean z12) {
        this.f132863a = str;
        this.f132864b = str2;
        this.f132865c = str3;
        this.f132866d = i11;
        this.f132868f = z11;
        this.f132869g = z12;
    }

    /* renamed from: a */
    public String m143390a() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("{");
            sb2.append("\"country\":");
            sb2.append(JSONObject.quote(this.f132863a));
            sb2.append(",");
            sb2.append("\"isocountrycodes\":");
            sb2.append(JSONObject.quote(this.f132864b));
            sb2.append(",");
            sb2.append("\"countrycode\":");
            sb2.append(JSONObject.quote(this.f132865c));
            sb2.append(",");
            sb2.append("\"position\":");
            sb2.append(JSONObject.quote("" + this.f132866d));
            sb2.append(",");
            sb2.append("\"isEnable\":");
            String str3 = "0";
            if (!this.f132867e) {
                str = "0";
            } else {
                str = "1";
            }
            sb2.append(JSONObject.quote(str));
            sb2.append(",");
            sb2.append("\"isSupportSMS\":");
            if (!this.f132868f) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            sb2.append(JSONObject.quote(str2));
            sb2.append(",");
            sb2.append("\"isSupportVoiceActivate\":");
            if (this.f132869g) {
                str3 = "1";
            }
            sb2.append(JSONObject.quote(str3));
            sb2.append("}");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public String m143391b() {
        return "+" + this.f132865c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28655u)) {
            return false;
        }
        C28655u c28655u = (C28655u) obj;
        if (Objects.equals(c28655u.f132863a, this.f132863a) && Objects.equals(c28655u.f132864b, this.f132864b) && Objects.equals(c28655u.f132865c, this.f132865c)) {
            return true;
        }
        return false;
    }

    public C28655u(JSONObject jSONObject) {
        this.f132863a = "";
        this.f132864b = "";
        this.f132865c = "";
        this.f132866d = 0;
        this.f132868f = true;
        this.f132869g = false;
        this.f132863a = jSONObject.optString("country", "");
        this.f132864b = jSONObject.optString("isocountrycodes", "");
        this.f132865c = jSONObject.optString("countrycode", "");
        this.f132866d = jSONObject.optInt("country", 0);
        this.f132868f = jSONObject.optInt("isSupportSMS") == 1;
        this.f132869g = jSONObject.optInt("isSupportVoiceActivate", 0) == 1;
    }
}
