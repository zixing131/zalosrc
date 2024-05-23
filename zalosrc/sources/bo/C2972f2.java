package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.f2 */
/* loaded from: classes4.dex */
public class C2972f2 {

    /* renamed from: a */
    public String f11743a;

    /* renamed from: b */
    public String f11744b;

    /* renamed from: c */
    public String f11745c;

    /* renamed from: d */
    public String f11746d;

    /* renamed from: e */
    public String f11747e;

    /* renamed from: f */
    public String f11748f;

    /* renamed from: g */
    public String f11749g;

    /* renamed from: h */
    public String f11750h;

    /* renamed from: i */
    public long f11751i;

    /* renamed from: j */
    public long f11752j;

    /* renamed from: k */
    public boolean f11753k;

    /* renamed from: l */
    public boolean f11754l;

    /* renamed from: m */
    public boolean f11755m;

    public C2972f2(JSONObject jSONObject) {
        this.f11743a = "";
        this.f11744b = "";
        this.f11745c = "";
        this.f11746d = "";
        this.f11747e = "";
        this.f11748f = "";
        this.f11749g = "";
        this.f11750h = "";
        if (jSONObject != null) {
            this.f11743a = jSONObject.optString("titleVi");
            this.f11744b = jSONObject.optString("titleEn");
            this.f11745c = jSONObject.optString("desVi");
            this.f11746d = jSONObject.optString("desEn");
            this.f11747e = jSONObject.optString("thumb");
            this.f11748f = jSONObject.optString("icon");
            this.f11749g = jSONObject.optString("titleTimelineVi");
            this.f11750h = jSONObject.optString("titleTimelineEn");
            this.f11751i = jSONObject.optLong("reddotExpireTime");
            this.f11752j = jSONObject.optLong("createTime");
            this.f11753k = jSONObject.optBoolean("enableAnim");
            this.f11754l = jSONObject.optBoolean("isRead", false);
            this.f11755m = jSONObject.optBoolean("isTabMeRead", false);
        }
    }

    /* renamed from: a */
    public boolean m14062a() {
        if (!TextUtils.isEmpty(this.f11743a) && !TextUtils.isEmpty(this.f11744b) && !TextUtils.isEmpty(this.f11745c) && !TextUtils.isEmpty(this.f11746d) && !TextUtils.isEmpty(this.f11747e) && !TextUtils.isEmpty(this.f11748f) && !TextUtils.isEmpty(this.f11749g) && !TextUtils.isEmpty(this.f11750h)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m14063b() {
        if (this.f11752j > 0 && this.f11751i > 0 && System.currentTimeMillis() - this.f11752j <= this.f11751i) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m14064c() {
        return this.f11754l;
    }

    /* renamed from: d */
    public boolean m14065d() {
        return this.f11755m;
    }

    /* renamed from: e */
    public JSONObject m14066e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONObject jSONObject = new JSONObject();
        try {
            String str8 = "";
            if (TextUtils.isEmpty(this.f11743a)) {
                str = "";
            } else {
                str = this.f11743a;
            }
            jSONObject.put("titleVi", str);
            if (TextUtils.isEmpty(this.f11744b)) {
                str2 = "";
            } else {
                str2 = this.f11744b;
            }
            jSONObject.put("titleEn", str2);
            if (TextUtils.isEmpty(this.f11745c)) {
                str3 = "";
            } else {
                str3 = this.f11745c;
            }
            jSONObject.put("desVi", str3);
            if (TextUtils.isEmpty(this.f11746d)) {
                str4 = "";
            } else {
                str4 = this.f11746d;
            }
            jSONObject.put("desEn", str4);
            if (TextUtils.isEmpty(this.f11747e)) {
                str5 = "";
            } else {
                str5 = this.f11747e;
            }
            jSONObject.put("thumb", str5);
            if (TextUtils.isEmpty(this.f11748f)) {
                str6 = "";
            } else {
                str6 = this.f11748f;
            }
            jSONObject.put("icon", str6);
            if (TextUtils.isEmpty(this.f11749g)) {
                str7 = "";
            } else {
                str7 = this.f11749g;
            }
            jSONObject.put("titleTimelineVi", str7);
            if (!TextUtils.isEmpty(this.f11750h)) {
                str8 = this.f11750h;
            }
            jSONObject.put("titleTimelineEn", str8);
            jSONObject.put("reddotExpireTime", this.f11751i);
            jSONObject.put("createTime", this.f11752j);
            jSONObject.put("enableAnim", this.f11753k);
            jSONObject.put("isRead", this.f11754l);
            jSONObject.put("isTabMeRead", this.f11755m);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: f */
    public String m14067f() {
        return m14066e().toString();
    }
}
