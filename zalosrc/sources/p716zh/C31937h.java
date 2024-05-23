package p716zh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: zh.h */
/* loaded from: classes3.dex */
public class C31937h {

    /* renamed from: a */
    private int f146738a;

    /* renamed from: b */
    private int f146739b;

    /* renamed from: c */
    private long f146740c;

    /* renamed from: d */
    private long f146741d;

    /* renamed from: e */
    private int f146742e;

    /* renamed from: f */
    private int f146743f;

    /* renamed from: g */
    private String f146744g;

    /* renamed from: h */
    private String f146745h;

    /* renamed from: i */
    private String f146746i;

    /* renamed from: j */
    private String f146747j;

    /* renamed from: k */
    private String f146748k;

    /* renamed from: l */
    public String f146749l;

    /* renamed from: m */
    private String f146750m;

    /* renamed from: n */
    private int f146751n;

    /* renamed from: o */
    private int f146752o;

    /* renamed from: p */
    private int f146753p;

    /* renamed from: q */
    private String f146754q;

    /* renamed from: r */
    private long f146755r;

    /* renamed from: s */
    private String f146756s;

    /* renamed from: t */
    public String f146757t;

    public C31937h(JSONObject jSONObject) {
        int i11;
        int i12;
        long j11;
        long j12;
        int i13;
        int i14;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i15;
        int i16;
        int i17;
        String str7;
        long j13;
        this.f146740c = 0L;
        this.f146741d = 0L;
        this.f146749l = "";
        this.f146751n = 0;
        this.f146752o = -1;
        this.f146753p = 0;
        this.f146754q = "";
        this.f146755r = 0L;
        try {
            if (!jSONObject.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                i11 = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            } else {
                i11 = -1;
            }
            this.f146738a = i11;
            if (!jSONObject.isNull("ClearType")) {
                i12 = jSONObject.getInt("ClearType");
            } else {
                i12 = -1;
            }
            this.f146739b = i12;
            if (!jSONObject.isNull("duration")) {
                j11 = jSONObject.getLong("duration");
            } else {
                j11 = 0;
            }
            this.f146740c = j11;
            if (!jSONObject.isNull("clickcloseDuration")) {
                j12 = jSONObject.getLong("clickcloseDuration");
            } else {
                j12 = 0;
            }
            this.f146741d = j12;
            if (!jSONObject.isNull("del")) {
                i13 = jSONObject.getInt("del");
            } else {
                i13 = 0;
            }
            this.f146742e = i13;
            if (!jSONObject.isNull("clickclose")) {
                i14 = jSONObject.getInt("clickclose");
            } else {
                i14 = 0;
            }
            this.f146743f = i14;
            if (jSONObject.isNull("title")) {
                str = "";
            } else {
                str = jSONObject.getString("title");
            }
            this.f146744g = str;
            if (jSONObject.isNull("href")) {
                str2 = "";
            } else {
                str2 = jSONObject.getString("href");
            }
            this.f146745h = str2;
            if (jSONObject.isNull("thumb")) {
                str3 = "";
            } else {
                str3 = jSONObject.getString("thumb");
            }
            this.f146746i = str3;
            if (jSONObject.isNull("desc")) {
                str4 = "";
            } else {
                str4 = jSONObject.getString("desc");
            }
            this.f146747j = str4;
            if (jSONObject.isNull("params")) {
                str5 = "";
            } else {
                str5 = jSONObject.getString("params");
            }
            this.f146748k = str5;
            this.f146749l = jSONObject.optString("banner", "");
            if (jSONObject.isNull("owner")) {
                str6 = "";
            } else {
                str6 = jSONObject.getString("owner");
            }
            this.f146750m = str6;
            if (!jSONObject.isNull("showNotify")) {
                i15 = jSONObject.getInt("showNotify");
            } else {
                i15 = 0;
            }
            this.f146751n = i15;
            if (!jSONObject.isNull("startIndex")) {
                i16 = jSONObject.getInt("startIndex");
            } else {
                i16 = -1;
            }
            this.f146752o = i16;
            if (!jSONObject.isNull("minItemCount")) {
                i17 = jSONObject.getInt("minItemCount");
            } else {
                i17 = 0;
            }
            this.f146753p = i17;
            if (jSONObject.isNull("btnCap")) {
                str7 = "";
            } else {
                str7 = jSONObject.getString("btnCap");
            }
            this.f146754q = str7;
            if (!jSONObject.isNull("timestampFloatingPos")) {
                j13 = jSONObject.getLong("timestampFloatingPos");
            } else {
                j13 = 0;
            }
            this.f146755r = j13;
            this.f146756s = jSONObject.optString("app_referrer");
            this.f146757t = jSONObject.optString("distributeId");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("", e11);
        }
    }

    /* renamed from: b */
    public static String m153480b(C31937h c31937h) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("{");
            sb2.append(JSONObject.quote("duration"));
            sb2.append(":");
            sb2.append(c31937h.f146740c);
            sb2.append(",");
            sb2.append(JSONObject.quote("title"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146744g));
            sb2.append(",");
            sb2.append(JSONObject.quote("desc"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146747j));
            sb2.append(",");
            sb2.append(JSONObject.quote("clickclose"));
            sb2.append(":");
            sb2.append(c31937h.f146743f);
            sb2.append(",");
            sb2.append(JSONObject.quote("owner"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146750m));
            sb2.append(",");
            sb2.append(JSONObject.quote("showNotify"));
            sb2.append(":");
            sb2.append(c31937h.f146751n);
            sb2.append(",");
            sb2.append(JSONObject.quote("del"));
            sb2.append(":");
            sb2.append(c31937h.f146742e);
            sb2.append(",");
            sb2.append(JSONObject.quote("params"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146748k));
            sb2.append(",");
            sb2.append(JSONObject.quote("banner"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146748k));
            sb2.append(",");
            sb2.append(JSONObject.quote("clickcloseDuration"));
            sb2.append(":");
            sb2.append(c31937h.f146741d);
            sb2.append(",");
            sb2.append(JSONObject.quote(ZinstantMetaConstant.IMPRESSION_META_TYPE));
            sb2.append(":");
            sb2.append(c31937h.f146738a);
            sb2.append(",");
            sb2.append(JSONObject.quote("href"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146745h));
            sb2.append(",");
            sb2.append(JSONObject.quote("thumb"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146746i));
            sb2.append(",");
            sb2.append(JSONObject.quote("startIndex"));
            sb2.append(":");
            sb2.append(c31937h.f146752o);
            sb2.append(",");
            sb2.append(JSONObject.quote("minItemCount"));
            sb2.append(":");
            sb2.append(c31937h.f146753p);
            sb2.append(",");
            sb2.append(JSONObject.quote("btnCap"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146754q));
            sb2.append(",");
            sb2.append(JSONObject.quote("timestampFloatingPos"));
            sb2.append(":");
            sb2.append(c31937h.f146755r);
            sb2.append(",");
            sb2.append(JSONObject.quote("ClearType"));
            sb2.append(":");
            sb2.append(c31937h.f146739b);
            sb2.append(",");
            sb2.append(JSONObject.quote("app_referrer"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146756s));
            sb2.append(",");
            sb2.append(JSONObject.quote("distributeId"));
            sb2.append(":");
            sb2.append(JSONObject.quote(c31937h.f146757t));
            sb2.append("}");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public String m153481a() {
        return this.f146756s;
    }

    /* renamed from: c */
    public int m153482c() {
        return this.f146739b;
    }

    /* renamed from: d */
    public long m153483d() {
        return this.f146741d;
    }

    /* renamed from: e */
    public int m153484e() {
        return this.f146743f;
    }

    /* renamed from: f */
    public int m153485f() {
        return this.f146742e;
    }

    /* renamed from: g */
    public String m153486g() {
        return this.f146747j;
    }

    /* renamed from: h */
    public long m153487h() {
        return this.f146740c;
    }

    /* renamed from: i */
    public String m153488i() {
        return this.f146745h;
    }

    /* renamed from: j */
    public int m153489j() {
        return this.f146753p;
    }

    /* renamed from: k */
    public String m153490k() {
        return this.f146750m;
    }

    /* renamed from: l */
    public String m153491l() {
        return this.f146748k;
    }

    /* renamed from: m */
    public int m153492m() {
        return this.f146751n;
    }

    /* renamed from: n */
    public String m153493n() {
        return this.f146746i;
    }

    /* renamed from: o */
    public String m153494o() {
        return this.f146744g;
    }

    /* renamed from: p */
    public int m153495p() {
        return this.f146738a;
    }
}
