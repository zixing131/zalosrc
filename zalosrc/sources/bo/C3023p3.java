package bo;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.C23030c2;
import nh0.C23793c;
import on0.AbstractC24341v;
import org.json.JSONObject;

/* renamed from: bo.p3 */
/* loaded from: classes4.dex */
public final class C3023p3 {

    /* renamed from: a */
    private final String f12076a;

    /* renamed from: b */
    private final String f12077b;

    /* renamed from: c */
    private final String f12078c;

    /* renamed from: d */
    private final String f12079d;

    /* renamed from: e */
    private final String f12080e;

    /* renamed from: f */
    private String f12081f;

    /* renamed from: g */
    private final String f12082g;

    /* renamed from: h */
    private final String f12083h;

    /* renamed from: i */
    private final int f12084i;

    /* renamed from: j */
    private long f12085j;

    /* renamed from: k */
    private final int f12086k;

    /* renamed from: l */
    private final int f12087l;

    /* renamed from: m */
    private final int f12088m;

    public C3023p3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, long j11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(str, "zShortVideoId");
        AbstractC19074t.m100208f(str2, "creatorAvt");
        AbstractC19074t.m100208f(str3, "creatorName");
        AbstractC19074t.m100208f(str4, "thumb");
        AbstractC19074t.m100208f(str5, "originalUrl");
        AbstractC19074t.m100208f(str6, "redirectedUrl");
        AbstractC19074t.m100208f(str7, "zVideoBrandIcon");
        AbstractC19074t.m100208f(str8, "zVideoBrandName");
        this.f12076a = str;
        this.f12077b = str2;
        this.f12078c = str3;
        this.f12079d = str4;
        this.f12080e = str5;
        this.f12081f = str6;
        this.f12082g = str7;
        this.f12083h = str8;
        this.f12084i = i11;
        this.f12085j = j11;
        this.f12086k = i12;
        this.f12087l = i13;
        this.f12088m = i14;
    }

    /* renamed from: a */
    public final C3023p3 m14545a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, long j11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(str, "zShortVideoId");
        AbstractC19074t.m100208f(str2, "creatorAvt");
        AbstractC19074t.m100208f(str3, "creatorName");
        AbstractC19074t.m100208f(str4, "thumb");
        AbstractC19074t.m100208f(str5, "originalUrl");
        AbstractC19074t.m100208f(str6, "redirectedUrl");
        AbstractC19074t.m100208f(str7, "zVideoBrandIcon");
        AbstractC19074t.m100208f(str8, "zVideoBrandName");
        return new C3023p3(str, str2, str3, str4, str5, str6, str7, str8, i11, j11, i12, i13, i14);
    }

    /* renamed from: c */
    public final int m14546c() {
        return this.f12084i;
    }

    /* renamed from: d */
    public final String m14547d() {
        return this.f12077b;
    }

    /* renamed from: e */
    public final String m14548e() {
        return this.f12078c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3023p3)) {
            return false;
        }
        C3023p3 c3023p3 = (C3023p3) obj;
        if (!AbstractC19074t.m100204b(this.f12076a, c3023p3.f12076a) || !AbstractC19074t.m100204b(this.f12077b, c3023p3.f12077b) || !AbstractC19074t.m100204b(this.f12078c, c3023p3.f12078c) || !AbstractC19074t.m100204b(this.f12079d, c3023p3.f12079d) || !AbstractC19074t.m100204b(this.f12080e, c3023p3.f12080e) || !AbstractC19074t.m100204b(this.f12081f, c3023p3.f12081f) || !AbstractC19074t.m100204b(this.f12082g, c3023p3.f12082g) || !AbstractC19074t.m100204b(this.f12083h, c3023p3.f12083h) || this.f12087l != c3023p3.f12087l || this.f12088m != c3023p3.f12088m) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int m14549f() {
        return this.f12088m;
    }

    /* renamed from: g */
    public final String m14550g() {
        return this.f12080e;
    }

    /* renamed from: h */
    public final String m14551h() {
        return this.f12081f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f12076a.hashCode() * 31) + this.f12077b.hashCode()) * 31) + this.f12078c.hashCode()) * 31) + this.f12079d.hashCode()) * 31) + this.f12080e.hashCode()) * 31) + this.f12081f.hashCode()) * 31) + this.f12082g.hashCode()) * 31) + this.f12083h.hashCode()) * 31) + this.f12087l) * 31) + this.f12088m;
    }

    /* renamed from: i */
    public final String m14552i() {
        return this.f12079d;
    }

    /* renamed from: j */
    public final int m14553j() {
        return this.f12087l;
    }

    /* renamed from: k */
    public final String m14554k() {
        return this.f12076a;
    }

    /* renamed from: l */
    public final String m14555l() {
        return this.f12082g;
    }

    /* renamed from: m */
    public final String m14556m() {
        return this.f12083h;
    }

    /* renamed from: n */
    public final boolean m14557n() {
        if (this.f12085j != -1 && C23793c.Companion.m124321a().mo124311f() - this.f12085j <= this.f12086k * 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m14558o() {
        boolean m127128x;
        boolean m127128x2;
        boolean m127128x3;
        boolean m127128x4;
        boolean m127128x5;
        m127128x = AbstractC24341v.m127128x(this.f12076a);
        if (!m127128x) {
            m127128x2 = AbstractC24341v.m127128x(this.f12077b);
            if (!m127128x2) {
                m127128x3 = AbstractC24341v.m127128x(this.f12078c);
                if (!m127128x3) {
                    m127128x4 = AbstractC24341v.m127128x(this.f12079d);
                    if (!m127128x4) {
                        m127128x5 = AbstractC24341v.m127128x(this.f12080e);
                        if (!m127128x5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m14559p(long j11) {
        this.f12085j = j11;
    }

    /* renamed from: q */
    public final void m14560q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f12081f = str;
    }

    /* renamed from: r */
    public final JSONObject m14561r() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("zvid", this.f12076a);
        jSONObject.put("creator_avt", this.f12077b);
        jSONObject.put("creator_name", this.f12078c);
        jSONObject.put("thumb", this.f12079d);
        jSONObject.put("video_url", this.f12080e);
        jSONObject.put("redirected_url", this.f12081f);
        jSONObject.put("brand_icon", this.f12082g);
        jSONObject.put("brand_name", this.f12083h);
        jSONObject.put("autoplay_time", this.f12084i);
        jSONObject.put("last_fetch_success", this.f12085j);
        jSONObject.put("expired_time", this.f12086k);
        jSONObject.put("width", this.f12087l);
        jSONObject.put("height", this.f12088m);
        return jSONObject;
    }

    /* renamed from: s */
    public final void m14562s(String str) {
        AbstractC19074t.m100208f(str, "redirectedUrl");
        this.f12081f = str;
    }

    public String toString() {
        return "ZShortVideoAttachment(zShortVideoId=" + this.f12076a + ", creatorAvt=" + this.f12077b + ", creatorName=" + this.f12078c + ", thumb=" + this.f12079d + ", originalUrl=" + this.f12080e + ", redirectedUrl=" + this.f12081f + ", zVideoBrandIcon=" + this.f12082g + ", zVideoBrandName=" + this.f12083h + ", autoPlayTime=" + this.f12084i + ", lastFetchSuccessTime=" + this.f12085j + ", expireTime=" + this.f12086k + ", width=" + this.f12087l + ", height=" + this.f12088m + ")";
    }

    public /* synthetic */ C3023p3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, long j11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? "" : str3, (i15 & 8) != 0 ? "" : str4, (i15 & 16) != 0 ? "" : str5, (i15 & 32) != 0 ? "" : str6, (i15 & 64) != 0 ? "" : str7, (i15 & 128) == 0 ? str8 : "", (i15 & 256) != 0 ? -1 : i11, (i15 & 512) != 0 ? -1L : j11, (i15 & 1024) != 0 ? 3600 : i12, (i15 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0 : i13, (i15 & 4096) == 0 ? i14 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3023p3(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, C23030c2.Companion.m118104c(jSONObject.optInt("autoplay_time", -1)), jSONObject.optLong("last_fetch_success", -1L), jSONObject.optInt("expired_time"), jSONObject.optInt("width"), jSONObject.optInt("height"));
        AbstractC19074t.m100208f(jSONObject, "json");
        String optString = jSONObject.optString("zvid");
        AbstractC19074t.m100207e(optString, "optString(...)");
        String optString2 = jSONObject.optString("creator_avt");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        String optString3 = jSONObject.optString("creator_name");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        String optString4 = jSONObject.optString("thumb");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        String optString5 = jSONObject.optString("video_url");
        AbstractC19074t.m100207e(optString5, "optString(...)");
        String optString6 = jSONObject.optString("redirected_url");
        AbstractC19074t.m100207e(optString6, "optString(...)");
        String optString7 = jSONObject.optString("brand_icon");
        AbstractC19074t.m100207e(optString7, "optString(...)");
        String optString8 = jSONObject.optString("brand_name");
        AbstractC19074t.m100207e(optString8, "optString(...)");
    }
}
