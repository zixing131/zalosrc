package cr;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: cr.a */
/* loaded from: classes4.dex */
public final class C17566a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f89479a;

    /* renamed from: b */
    private final String f89480b;

    /* renamed from: c */
    private final String f89481c;

    /* renamed from: d */
    private final String f89482d;

    /* renamed from: e */
    private final String f89483e;

    /* renamed from: f */
    private final String f89484f;

    /* renamed from: g */
    private final String f89485g;

    /* renamed from: h */
    private final String f89486h;

    /* renamed from: i */
    private final String f89487i;

    /* renamed from: j */
    private final String f89488j;

    /* renamed from: k */
    private final String f89489k;

    /* renamed from: l */
    private final String f89490l;

    /* renamed from: m */
    private final String f89491m;

    /* renamed from: n */
    private final int f89492n;

    /* renamed from: o */
    private final int f89493o;

    /* renamed from: p */
    private final int f89494p;

    /* renamed from: q */
    private final String f89495q;

    /* renamed from: r */
    private int f89496r;

    /* renamed from: cr.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17566a m93548a(JSONObject jSONObject) {
            int i11;
            int i12;
            String str;
            AbstractC19074t.m100208f(jSONObject, "json");
            JSONObject optJSONObject = jSONObject.optJSONObject("trackAds");
            int optInt = jSONObject.optInt("adsType");
            String optString = jSONObject.optString("id");
            AbstractC19074t.m100207e(optString, "optString(...)");
            String optString2 = jSONObject.optString("uid");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            String optString3 = jSONObject.optString("dpn");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            String optString4 = jSONObject.optString("avt");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            String optString5 = jSONObject.optString("subTitle");
            AbstractC19074t.m100207e(optString5, "optString(...)");
            String optString6 = jSONObject.optString("headerAction");
            AbstractC19074t.m100207e(optString6, "optString(...)");
            String optString7 = jSONObject.optString("headerData");
            AbstractC19074t.m100207e(optString7, "optString(...)");
            String optString8 = jSONObject.optString("thumb");
            AbstractC19074t.m100207e(optString8, "optString(...)");
            String optString9 = jSONObject.optString("caption");
            AbstractC19074t.m100207e(optString9, "optString(...)");
            String optString10 = jSONObject.optString("btnLabel");
            AbstractC19074t.m100207e(optString10, "optString(...)");
            String optString11 = jSONObject.optString("btnAction");
            AbstractC19074t.m100207e(optString11, "optString(...)");
            String optString12 = jSONObject.optString("btnData");
            AbstractC19074t.m100207e(optString12, "optString(...)");
            int optInt2 = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            if (optJSONObject != null) {
                i11 = optJSONObject.optInt("campid", -1);
            } else {
                i11 = -1;
            }
            if (optJSONObject != null) {
                i12 = optJSONObject.optInt("srcidx", 0);
            } else {
                i12 = 0;
            }
            if (optJSONObject != null) {
                str = optJSONObject.optString("distribute_id", "");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            return new C17566a(optInt, optString, optString2, optString3, optString4, optString5, optString6, optString7, optString8, optString9, optString10, optString11, optString12, optInt2, i11, i12, str, jSONObject.optInt("pos"));
        }
    }

    public C17566a(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i12, int i13, int i14, String str13, int i15) {
        AbstractC19074t.m100208f(str, "adsId");
        AbstractC19074t.m100208f(str2, "uid");
        AbstractC19074t.m100208f(str3, "dpn");
        AbstractC19074t.m100208f(str4, "avt");
        AbstractC19074t.m100208f(str5, "subTitle");
        AbstractC19074t.m100208f(str6, "headerActionType");
        AbstractC19074t.m100208f(str7, "headerActionData");
        AbstractC19074t.m100208f(str8, "thumb");
        AbstractC19074t.m100208f(str9, "caption");
        AbstractC19074t.m100208f(str10, "ctaLabel");
        AbstractC19074t.m100208f(str11, "ctaActionType");
        AbstractC19074t.m100208f(str12, "ctaActionData");
        AbstractC19074t.m100208f(str13, "distributeId");
        this.f89479a = i11;
        this.f89480b = str;
        this.f89481c = str2;
        this.f89482d = str3;
        this.f89483e = str4;
        this.f89484f = str5;
        this.f89485g = str6;
        this.f89486h = str7;
        this.f89487i = str8;
        this.f89488j = str9;
        this.f89489k = str10;
        this.f89490l = str11;
        this.f89491m = str12;
        this.f89492n = i12;
        this.f89493o = i13;
        this.f89494p = i14;
        this.f89495q = str13;
        this.f89496r = i15;
    }

    /* renamed from: a */
    public final String m93530a() {
        return this.f89480b;
    }

    /* renamed from: b */
    public final int m93531b() {
        return this.f89479a;
    }

    /* renamed from: c */
    public final String m93532c() {
        return this.f89483e;
    }

    /* renamed from: d */
    public final int m93533d() {
        return this.f89493o;
    }

    /* renamed from: e */
    public final String m93534e() {
        return this.f89491m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17566a)) {
            return false;
        }
        C17566a c17566a = (C17566a) obj;
        return this.f89479a == c17566a.f89479a && AbstractC19074t.m100204b(this.f89480b, c17566a.f89480b) && AbstractC19074t.m100204b(this.f89481c, c17566a.f89481c) && AbstractC19074t.m100204b(this.f89482d, c17566a.f89482d) && AbstractC19074t.m100204b(this.f89483e, c17566a.f89483e) && AbstractC19074t.m100204b(this.f89484f, c17566a.f89484f) && AbstractC19074t.m100204b(this.f89485g, c17566a.f89485g) && AbstractC19074t.m100204b(this.f89486h, c17566a.f89486h) && AbstractC19074t.m100204b(this.f89487i, c17566a.f89487i) && AbstractC19074t.m100204b(this.f89488j, c17566a.f89488j) && AbstractC19074t.m100204b(this.f89489k, c17566a.f89489k) && AbstractC19074t.m100204b(this.f89490l, c17566a.f89490l) && AbstractC19074t.m100204b(this.f89491m, c17566a.f89491m) && this.f89492n == c17566a.f89492n && this.f89493o == c17566a.f89493o && this.f89494p == c17566a.f89494p && AbstractC19074t.m100204b(this.f89495q, c17566a.f89495q) && this.f89496r == c17566a.f89496r;
    }

    /* renamed from: f */
    public final String m93535f() {
        return this.f89490l;
    }

    /* renamed from: g */
    public final String m93536g() {
        return this.f89489k;
    }

    /* renamed from: h */
    public final String m93537h() {
        return this.f89495q;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f89479a * 31) + this.f89480b.hashCode()) * 31) + this.f89481c.hashCode()) * 31) + this.f89482d.hashCode()) * 31) + this.f89483e.hashCode()) * 31) + this.f89484f.hashCode()) * 31) + this.f89485g.hashCode()) * 31) + this.f89486h.hashCode()) * 31) + this.f89487i.hashCode()) * 31) + this.f89488j.hashCode()) * 31) + this.f89489k.hashCode()) * 31) + this.f89490l.hashCode()) * 31) + this.f89491m.hashCode()) * 31) + this.f89492n) * 31) + this.f89493o) * 31) + this.f89494p) * 31) + this.f89495q.hashCode()) * 31) + this.f89496r;
    }

    /* renamed from: i */
    public final String m93538i() {
        return this.f89482d;
    }

    /* renamed from: j */
    public final String m93539j() {
        return this.f89486h;
    }

    /* renamed from: k */
    public final String m93540k() {
        return this.f89485g;
    }

    /* renamed from: l */
    public final int m93541l() {
        return this.f89496r;
    }

    /* renamed from: m */
    public final int m93542m() {
        return this.f89494p;
    }

    /* renamed from: n */
    public final String m93543n() {
        return this.f89484f;
    }

    /* renamed from: o */
    public final String m93544o() {
        return this.f89487i;
    }

    /* renamed from: p */
    public final int m93545p() {
        return this.f89492n;
    }

    /* renamed from: q */
    public final String m93546q() {
        if (this.f89488j.length() > 90) {
            String substring = this.f89488j.substring(0, 89);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring + "...";
        }
        return this.f89488j;
    }

    /* renamed from: r */
    public final String m93547r() {
        return this.f89481c;
    }

    public String toString() {
        return "StoryAdsItem(adsType=" + this.f89479a + ", adsId=" + this.f89480b + ", uid=" + this.f89481c + ", dpn=" + this.f89482d + ", avt=" + this.f89483e + ", subTitle=" + this.f89484f + ", headerActionType=" + this.f89485g + ", headerActionData=" + this.f89486h + ", thumb=" + this.f89487i + ", caption=" + this.f89488j + ", ctaLabel=" + this.f89489k + ", ctaActionType=" + this.f89490l + ", ctaActionData=" + this.f89491m + ", trackType=" + this.f89492n + ", campId=" + this.f89493o + ", srcIdx=" + this.f89494p + ", distributeId=" + this.f89495q + ", position=" + this.f89496r + ")";
    }
}
