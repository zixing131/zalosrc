package r00;

import com.zing.zalo.zinstant.C17244x0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: r00.a */
/* loaded from: classes4.dex */
public final class C25596a {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private static volatile C25596a f122377t;

    /* renamed from: a */
    private long f122378a;

    /* renamed from: b */
    private int f122379b;

    /* renamed from: d */
    private long f122381d;

    /* renamed from: e */
    private long f122382e;

    /* renamed from: f */
    private long f122383f;

    /* renamed from: g */
    private long f122384g;

    /* renamed from: h */
    private long f122385h;

    /* renamed from: i */
    private int f122386i;

    /* renamed from: l */
    private int f122389l;

    /* renamed from: m */
    private long f122390m;

    /* renamed from: n */
    private boolean f122391n;

    /* renamed from: o */
    private boolean f122392o;

    /* renamed from: p */
    private boolean f122393p;

    /* renamed from: q */
    private boolean f122394q;

    /* renamed from: r */
    private C17244x0 f122395r;

    /* renamed from: s */
    private boolean f122396s;

    /* renamed from: c */
    private String f122380c = "";

    /* renamed from: j */
    private String f122387j = "";

    /* renamed from: k */
    private String f122388k = "";

    /* renamed from: r00.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25596a m132219a() {
            C25596a c25596a = C25596a.f122377t;
            if (c25596a == null) {
                synchronized (this) {
                    c25596a = new C25596a();
                    C25596a.f122377t = c25596a;
                }
            }
            return c25596a;
        }
    }

    /* renamed from: c */
    private final void m132204c() {
        this.f122378a = 0L;
        this.f122379b = 0;
        this.f122380c = "";
        this.f122381d = 0L;
        this.f122382e = 0L;
        this.f122383f = 0L;
        this.f122384g = 0L;
        this.f122385h = 0L;
        this.f122386i = 0;
        this.f122387j = "";
        this.f122388k = "";
        this.f122389l = 0;
        this.f122390m = 0L;
        this.f122391n = false;
        this.f122392o = false;
        this.f122393p = false;
        this.f122394q = false;
        this.f122395r = null;
    }

    /* renamed from: g */
    public static final C25596a m132205g() {
        return Companion.m132219a();
    }

    /* renamed from: d */
    public final boolean m132206d() {
        return this.f122394q;
    }

    /* renamed from: e */
    public final boolean m132207e() {
        return this.f122392o;
    }

    /* renamed from: f */
    public final boolean m132208f() {
        return this.f122391n;
    }

    /* renamed from: h */
    public final long m132209h() {
        return this.f122378a;
    }

    /* renamed from: i */
    public final long m132210i() {
        return this.f122382e;
    }

    /* renamed from: j */
    public final long m132211j() {
        return this.f122383f;
    }

    /* renamed from: k */
    public final long m132212k() {
        return this.f122385h;
    }

    /* renamed from: l */
    public final long m132213l() {
        return this.f122381d;
    }

    /* renamed from: m */
    public final int m132214m() {
        return this.f122386i;
    }

    /* renamed from: n */
    public final int m132215n() {
        return this.f122379b;
    }

    /* renamed from: o */
    public final String m132216o() {
        return this.f122380c;
    }

    /* renamed from: p */
    public final C17244x0 m132217p() {
        return this.f122395r;
    }

    /* renamed from: q */
    public final void m132218q(JSONObject jSONObject) {
        C17244x0 c17244x0;
        if (jSONObject != null && jSONObject.length() != 0) {
            this.f122396s = true;
            this.f122378a = jSONObject.optLong("last_modified");
            this.f122379b = jSONObject.optInt("version_code");
            String optString = jSONObject.optString("version_name");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f122380c = optString;
            this.f122381d = jSONObject.optLong("release_time");
            this.f122386i = jSONObject.optInt("use_inapp_update");
            JSONObject optJSONObject = jSONObject.optJSONObject("whatnews");
            if (optJSONObject != null) {
                this.f122391n = true;
                this.f122390m = optJSONObject.optLong("last_modified");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("zinstant");
                if (optJSONObject2 != null && optJSONObject2.length() != 0) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("ZInstantAPIInfo");
                    if (optJSONObject3 == null) {
                        c17244x0 = new C17244x0(35, optJSONObject2);
                    } else {
                        c17244x0 = new C17244x0(35, optJSONObject3);
                    }
                    this.f122395r = c17244x0;
                } else {
                    this.f122395r = null;
                }
            } else {
                this.f122391n = false;
                this.f122395r = null;
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("remind_notification");
            if (optJSONObject4 != null) {
                this.f122392o = true;
                this.f122382e = optJSONObject4.optLong("min_outdate_time");
                this.f122383f = optJSONObject4.optLong("strong_outdate_time");
                this.f122384g = optJSONObject4.optLong("strong_outdate_repeat_time");
            } else {
                this.f122392o = false;
                this.f122382e = 0L;
                this.f122383f = 0L;
                this.f122384g = 0L;
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("reddot_for_update");
            if (optJSONObject5 != null) {
                this.f122394q = true;
                this.f122385h = optJSONObject5.optLong("min_outdate_time");
            } else {
                this.f122394q = false;
                this.f122385h = 0L;
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("direct_update");
            if (optJSONObject6 != null) {
                this.f122393p = true;
                String optString2 = optJSONObject6.optString("download_link");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f122387j = optString2;
                String optString3 = optJSONObject6.optString("md5_checksum");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                this.f122388k = optString3;
                this.f122389l = optJSONObject6.optInt("file_length");
                return;
            }
            this.f122393p = false;
            this.f122387j = "";
            this.f122388k = "";
            this.f122389l = 0;
            return;
        }
        if (this.f122396s) {
            m132204c();
        }
    }
}
