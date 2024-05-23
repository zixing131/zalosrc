package c30;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23309i;
import p609wh.AbstractC29039u0;

/* renamed from: c30.i */
/* loaded from: classes5.dex */
public class C3245i {

    /* renamed from: a */
    public String f13853a;

    /* renamed from: b */
    public int f13854b;

    /* renamed from: c */
    private String f13855c;

    /* renamed from: d */
    public String f13856d;

    /* renamed from: e */
    public int f13857e;

    /* renamed from: f */
    public String f13858f;

    /* renamed from: g */
    public String f13859g;

    /* renamed from: h */
    public String f13860h;

    /* renamed from: i */
    public String f13861i;

    /* renamed from: j */
    public long f13862j;

    /* renamed from: k */
    public int f13863k;

    /* renamed from: l */
    public String f13864l;

    /* renamed from: m */
    public String f13865m;

    /* renamed from: n */
    public int f13866n;

    /* renamed from: o */
    public String f13867o;

    /* renamed from: p */
    public int f13868p;

    /* renamed from: q */
    public int f13869q;

    /* renamed from: r */
    public int f13870r;

    /* renamed from: s */
    public int f13871s;

    /* renamed from: t */
    public int f13872t;

    /* renamed from: u */
    public int f13873u;

    /* renamed from: v */
    public String f13874v;

    /* renamed from: w */
    public int f13875w;

    public C3245i() {
        this.f13853a = "";
        this.f13854b = 0;
        this.f13855c = "";
        this.f13856d = "";
        this.f13857e = 0;
        this.f13858f = "";
        this.f13859g = "";
        this.f13860h = "";
        this.f13861i = "";
        this.f13862j = 0L;
        this.f13863k = 0;
        this.f13864l = "";
        this.f13865m = "";
        this.f13866n = 0;
        this.f13867o = "";
        this.f13868p = 0;
        this.f13869q = 0;
        this.f13870r = 0;
        this.f13871s = 0;
        this.f13872t = -1;
        this.f13873u = 1;
        this.f13874v = "";
        this.f13875w = -1;
        this.f13853a = !TextUtils.isEmpty(CoreUtility.f89233i) ? CoreUtility.f89233i : "";
        this.f13854b = 0;
        this.f13855c = "";
        this.f13856d = "";
        this.f13857e = 0;
        this.f13858f = "";
        this.f13859g = "";
        this.f13860h = "";
        this.f13861i = "";
        this.f13867o = "";
        this.f13868p = 0;
        this.f13869q = 0;
        this.f13870r = 0;
        this.f13871s = 1;
        this.f13872t = -1;
        this.f13873u = 1;
        this.f13874v = "";
        this.f13866n = 0;
        this.f13862j = 0L;
    }

    /* renamed from: h */
    public static String m16458h(int i11, int i12) {
        String str = "";
        try {
            str = ((AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_STICKER_DOWNLOAD_URL) + "session_key=" + CoreUtility.f89232h) + "&cid=" + i11) + "&size=" + i12;
            return str + "&is_new=1";
        } catch (Exception e11) {
            e11.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public boolean m16459a() {
        return this.f13866n == 0;
    }

    /* renamed from: b */
    public boolean m16460b() {
        return this.f13873u == 1;
    }

    /* renamed from: c */
    public String m16461c() {
        return "{\"id\":" + this.f13854b + ",\"name\":" + JSONObject.quote("" + this.f13855c) + ",\"desc\":" + JSONObject.quote("" + this.f13856d) + ",\"isFree\":" + this.f13857e + ",\"iconUrl\":" + JSONObject.quote("" + this.f13858f) + ",\"iconPreview\":" + JSONObject.quote("" + this.f13859g) + ",\"thumbUrl\":" + JSONObject.quote("" + this.f13860h) + ",\"totalImage\":" + this.f13868p + ",\"group\":" + this.f13869q + ",\"version\":" + this.f13871s + ",\"permission\":" + this.f13873u + ",\"is_hidden\":" + this.f13866n + ",\"thumbImg\":" + JSONObject.quote("" + this.f13874v) + ",\"expireTime\":" + this.f13862j + "}";
    }

    /* renamed from: d */
    public String m16462d() {
        return this.f13858f;
    }

    /* renamed from: e */
    public int m16463e() {
        return this.f13854b;
    }

    /* renamed from: f */
    public String m16464f() {
        if (this.f13855c.equals("LOCAL_DEFINE_NAME_CATE")) {
            int i11 = this.f13854b;
            if (i11 == 0) {
                return MainApplication.getAppContext().getString(AbstractC8020f0.str_stickercategory_default_name);
            }
            if (i11 != -2 && i11 != -3 && i11 != -10) {
                return "";
            }
            return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_title_emoji_recent);
        }
        return this.f13855c;
    }

    /* renamed from: g */
    public int m16465g() {
        if (this.f13854b == 0) {
            return AbstractC23309i.m121861ea();
        }
        return this.f13872t;
    }

    /* renamed from: i */
    public int m16466i() {
        return this.f13868p;
    }

    /* renamed from: j */
    public long m16467j() {
        return this.f13871s;
    }

    /* renamed from: k */
    public void m16468k(String str) {
        this.f13855c = str;
    }

    public C3245i(int i11, String str, String str2, int i12, String str3, String str4, String str5, String str6, int i13, int i14, int i15, int i16, int i17, String str7, int i18, int i19, String str8, long j11) {
        this.f13853a = "";
        this.f13854b = 0;
        this.f13855c = "";
        this.f13856d = "";
        this.f13857e = 0;
        this.f13858f = "";
        this.f13859g = "";
        this.f13860h = "";
        this.f13861i = "";
        this.f13862j = 0L;
        this.f13863k = 0;
        this.f13864l = "";
        this.f13865m = "";
        this.f13866n = 0;
        this.f13867o = "";
        this.f13868p = 0;
        this.f13869q = 0;
        this.f13870r = 0;
        this.f13871s = 0;
        this.f13872t = -1;
        int i21 = 1;
        this.f13873u = 1;
        this.f13874v = "";
        this.f13875w = -1;
        try {
            this.f13853a = TextUtils.isEmpty(CoreUtility.f89233i) ? "" : CoreUtility.f89233i;
            this.f13854b = i11;
            this.f13855c = str;
            this.f13856d = str2;
            this.f13857e = i12;
            this.f13858f = str3;
            this.f13859g = str4;
            this.f13860h = str5;
            this.f13861i = str6;
            this.f13867o = str7;
            this.f13868p = i13;
            this.f13869q = i14;
            this.f13870r = i15;
            if (i16 > 0) {
                i21 = i16;
            }
            this.f13871s = i21;
            this.f13872t = i17;
            this.f13873u = i18;
            this.f13874v = str8;
            this.f13862j = j11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C3245i(JSONObject jSONObject) {
        this.f13853a = "";
        this.f13854b = 0;
        this.f13855c = "";
        this.f13856d = "";
        this.f13857e = 0;
        this.f13858f = "";
        this.f13859g = "";
        this.f13860h = "";
        this.f13861i = "";
        this.f13862j = 0L;
        this.f13863k = 0;
        this.f13864l = "";
        this.f13865m = "";
        this.f13866n = 0;
        this.f13867o = "";
        this.f13868p = 0;
        this.f13869q = 0;
        this.f13870r = 0;
        this.f13871s = 0;
        this.f13872t = -1;
        this.f13873u = 1;
        this.f13874v = "";
        this.f13875w = -1;
        try {
            this.f13853a = !TextUtils.isEmpty(CoreUtility.f89233i) ? CoreUtility.f89233i : "";
            this.f13854b = 0;
            this.f13855c = "";
            this.f13856d = "";
            this.f13857e = 0;
            this.f13858f = "";
            this.f13859g = "";
            this.f13860h = "";
            this.f13861i = "";
            this.f13867o = "";
            this.f13868p = 0;
            this.f13869q = 0;
            this.f13870r = 0;
            this.f13871s = 1;
            this.f13872t = -1;
            this.f13873u = 1;
            this.f13874v = "";
            this.f13866n = 0;
            this.f13862j = 0L;
            this.f13863k = 0;
            this.f13864l = "";
            this.f13865m = "";
            if (jSONObject.has("id")) {
                this.f13854b = AbstractC18069a.m96085d(jSONObject, "id");
            }
            if (jSONObject.has("name")) {
                this.f13855c = AbstractC18069a.m96089h(jSONObject, "name");
            }
            if (jSONObject.has("desc")) {
                this.f13856d = AbstractC18069a.m96089h(jSONObject, "desc");
            }
            if (jSONObject.has("iconUrl")) {
                this.f13858f = AbstractC18069a.m96089h(jSONObject, "iconUrl");
            }
            if (jSONObject.has("thumbPromote")) {
                this.f13865m = AbstractC18069a.m96089h(jSONObject, "thumbPromote");
            }
            if (jSONObject.has("iconPreview")) {
                this.f13859g = AbstractC18069a.m96089h(jSONObject, "iconPreview");
            }
            if (jSONObject.has("thumbUrl")) {
                this.f13860h = AbstractC18069a.m96089h(jSONObject, "thumbUrl");
            }
            if (jSONObject.has("source")) {
                this.f13861i = AbstractC18069a.m96089h(jSONObject, "source");
            }
            if (jSONObject.has("sourceUrl")) {
                this.f13867o = AbstractC18069a.m96089h(jSONObject, "sourceUrl");
            }
            if (jSONObject.has("totalImage")) {
                this.f13868p = AbstractC18069a.m96085d(jSONObject, "totalImage");
            }
            if (jSONObject.has("group")) {
                this.f13869q = AbstractC18069a.m96085d(jSONObject, "group");
            }
            if (jSONObject.has("status")) {
                this.f13870r = AbstractC18069a.m96085d(jSONObject, "status");
            }
            if (jSONObject.has("version")) {
                int m96085d = AbstractC18069a.m96085d(jSONObject, "version");
                this.f13871s = m96085d;
                if (m96085d <= 0) {
                    this.f13871s = 1;
                }
            }
            if (jSONObject.has("permission")) {
                this.f13873u = jSONObject.getInt("permission");
            }
            if (jSONObject.has("is_hidden")) {
                this.f13866n = jSONObject.getInt("is_hidden");
            }
            if (jSONObject.has("thumbImg")) {
                this.f13874v = jSONObject.getString("thumbImg");
            }
            if (jSONObject.has("expireTime")) {
                this.f13862j = AbstractC18069a.m96087f(jSONObject, "expireTime");
            }
            if (jSONObject.has("layoutType")) {
                this.f13863k = AbstractC18069a.m96085d(jSONObject, "layoutType");
            }
            if (jSONObject.has("stickerPromote")) {
                JSONArray m96090i = AbstractC18069a.m96090i(jSONObject, "stickerPromote");
                this.f13864l = m96090i != null ? m96090i.toString() : "";
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
