package sx;

import android.text.TextUtils;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C18013y0;
import java.net.URI;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.C23307g;
import p560uw.EnumC27376c;
import p716zh.C31869c6;
import p716zh.C32098s;
import p716zh.C32107s8;
import p716zh.C32121t8;
import tj.C26713e;

/* renamed from: sx.g */
/* loaded from: classes4.dex */
public class C26405g {

    /* renamed from: A */
    public C32098s.a f125471A;

    /* renamed from: B */
    public String f125472B;

    /* renamed from: C */
    public String f125473C;

    /* renamed from: D */
    public String f125474D;

    /* renamed from: E */
    public boolean f125475E;

    /* renamed from: F */
    public EnumC27376c f125476F;

    /* renamed from: G */
    public String f125477G;

    /* renamed from: a */
    public String f125478a;

    /* renamed from: b */
    public String f125479b;

    /* renamed from: c */
    public String f125480c;

    /* renamed from: d */
    public String f125481d;

    /* renamed from: e */
    public String f125482e;

    /* renamed from: f */
    public String f125483f;

    /* renamed from: g */
    public String f125484g;

    /* renamed from: h */
    public String f125485h;

    /* renamed from: i */
    public String f125486i;

    /* renamed from: j */
    public String f125487j;

    /* renamed from: k */
    public int f125488k;

    /* renamed from: l */
    public String f125489l;

    /* renamed from: m */
    public String f125490m;

    /* renamed from: n */
    public C26713e f125491n;

    /* renamed from: o */
    public int f125492o;

    /* renamed from: p */
    public int f125493p;

    /* renamed from: q */
    public int f125494q;

    /* renamed from: r */
    public String f125495r;

    /* renamed from: s */
    public String f125496s;

    /* renamed from: t */
    public int f125497t;

    /* renamed from: u */
    public C32107s8 f125498u;

    /* renamed from: v */
    public String f125499v;

    /* renamed from: w */
    public long f125500w;

    /* renamed from: x */
    public C32121t8 f125501x;

    /* renamed from: y */
    public C23307g f125502y;

    /* renamed from: z */
    public int f125503z;

    public C26405g() {
        this.f125486i = "";
        this.f125472B = "";
        this.f125473C = "";
        this.f125474D = "";
        this.f125475E = false;
        this.f125476F = EnumC27376c.f128982q;
        this.f125477G = "";
    }

    /* renamed from: b */
    public static C26405g m136174b(JSONObject jSONObject) {
        return new C26405g().m136175a(jSONObject);
    }

    /* renamed from: a */
    public C26405g m136175a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("title")) {
                this.f125478a = AbstractC18069a.m96089h(jSONObject, "title");
            }
            if (jSONObject.has("src")) {
                this.f125482e = AbstractC18069a.m96089h(jSONObject, "src");
            }
            if (jSONObject.has("thumb")) {
                this.f125480c = AbstractC18069a.m96089h(jSONObject, "thumb");
            }
            this.f125472B = AbstractC18069a.m96089h(jSONObject, "zalo_video_thumb");
            if (jSONObject.has("href")) {
                this.f125481d = AbstractC18069a.m96089h(jSONObject, "href");
            }
            if (jSONObject.has("desc")) {
                this.f125479b = AbstractC18069a.m96089h(jSONObject, "desc");
            }
            if (jSONObject.has("media")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("media");
                if (jSONObject2.has("mediaTitle")) {
                    this.f125484g = AbstractC18069a.m96089h(jSONObject2, "mediaTitle");
                }
                if (jSONObject2.has("streamUrl")) {
                    this.f125487j = AbstractC18069a.m96089h(jSONObject2, "streamUrl");
                }
                if (jSONObject2.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                    this.f125488k = AbstractC18069a.m96085d(jSONObject2, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                }
                if (jSONObject2.has("artist")) {
                    this.f125485h = AbstractC18069a.m96089h(jSONObject2, "artist");
                }
                if (jSONObject2.has("artist_desc")) {
                    this.f125486i = AbstractC18069a.m96089h(jSONObject2, "artist_desc");
                }
                if (jSONObject2.has("count")) {
                    this.f125483f = AbstractC18069a.m96089h(jSONObject2, "count");
                }
                if (jSONObject2.has("id")) {
                    this.f125499v = AbstractC18069a.m96089h(jSONObject2, "id");
                }
                if (jSONObject2.has("owner")) {
                    this.f125498u = new C32107s8(jSONObject2.optJSONObject("owner"));
                }
                C32107s8 c32107s8 = this.f125498u;
                if (c32107s8 != null) {
                    c32107s8.f148013c = this.f125482e;
                }
                if (jSONObject2.has("redirect_url")) {
                    this.f125490m = AbstractC18069a.m96089h(jSONObject2, "redirect_url");
                }
                if (jSONObject2.has("video_duration")) {
                    this.f125503z = AbstractC18069a.m96085d(jSONObject2, "video_duration");
                }
                if (jSONObject2.has("arid")) {
                    this.f125500w = AbstractC18069a.m96087f(jSONObject2, "arid");
                }
                if (jSONObject2.has("params")) {
                    this.f125501x = new C32121t8(jSONObject2.optJSONObject("params"));
                }
                if (jSONObject2.has("dimen")) {
                    this.f125502y = new C23307g(jSONObject2.optJSONObject("dimen"));
                }
                this.f125471A = C32098s.m154931p(jSONObject2);
                this.f125473C = jSONObject2.optString("brand_name");
                this.f125474D = jSONObject2.optString("avatar");
            }
            if (TextUtils.isEmpty(this.f125484g)) {
                this.f125484g = this.f125478a;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(this.f125484g) && TextUtils.isEmpty(this.f125479b) && TextUtils.isEmpty(this.f125480c)) {
            return null;
        }
        if (jSONObject.has("footerv2")) {
            this.f125491n = new C26713e(AbstractC18069a.m96091j(jSONObject, "footerv2"));
        }
        if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
            this.f125497t = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        } else {
            this.f125497t = this.f125488k;
        }
        if (jSONObject.has("tType")) {
            this.f125492o = AbstractC18069a.m96085d(jSONObject, "tType");
        }
        if (jSONObject.has("tWidth")) {
            this.f125493p = AbstractC18069a.m96085d(jSONObject, "tWidth");
        }
        if (jSONObject.has("tHeight")) {
            this.f125494q = AbstractC18069a.m96085d(jSONObject, "tHeight");
        }
        if (jSONObject.has("icon")) {
            this.f125495r = AbstractC18069a.m96089h(jSONObject, "icon");
        }
        if (jSONObject.has("errorMap")) {
            this.f125496s = AbstractC18069a.m96089h(jSONObject, "errorMap");
        }
        return this;
    }

    /* renamed from: c */
    public String m136176c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", this.f125478a);
            jSONObject.put("src", this.f125482e);
            jSONObject.put("thumb", this.f125480c);
            jSONObject.put("href", this.f125481d);
            jSONObject.put("desc", this.f125479b);
            if (this.f125488k > 0 && !TextUtils.isEmpty(this.f125484g)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("mediaTitle", this.f125484g);
                jSONObject2.put("streamUrl", this.f125487j);
                jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f125488k);
                jSONObject2.put("artist", this.f125485h);
                jSONObject2.put("artist_desc", this.f125486i);
                jSONObject2.put("count", this.f125483f);
                jSONObject2.put("id", this.f125499v);
                jSONObject2.put("redirect_url", this.f125490m);
                C32107s8 c32107s8 = this.f125498u;
                if (c32107s8 != null) {
                    jSONObject2.put("owner", c32107s8.m154982a());
                }
                jSONObject2.put("video_duration", this.f125503z);
                jSONObject2.put("arid", this.f125500w);
                C32121t8 c32121t8 = this.f125501x;
                if (c32121t8 != null) {
                    jSONObject2.put("params", c32121t8.m155022a());
                }
                C23307g c23307g = this.f125502y;
                if (c23307g != null) {
                    jSONObject2.put("dimen", c23307g.m120735a());
                }
                C32098s.a aVar = this.f125471A;
                if (aVar != null) {
                    jSONObject2.put("productCatalogInfo", aVar.m154950a());
                }
                if (!TextUtils.isEmpty(this.f125473C)) {
                    jSONObject2.put("brand_name", this.f125473C);
                }
                if (!TextUtils.isEmpty(this.f125474D)) {
                    jSONObject2.put("avatar", this.f125474D);
                }
                jSONObject.put("media", jSONObject2);
            }
            C26713e c26713e = this.f125491n;
            if (c26713e != null) {
                jSONObject.put("footerv2", c26713e.m137363h().toString());
            }
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f125497t);
            jSONObject.put("tType", this.f125492o);
            jSONObject.put("tWidth", this.f125493p);
            jSONObject.put("tHeight", this.f125494q);
            if (!TextUtils.isEmpty(this.f125495r)) {
                jSONObject.put("icon", this.f125495r);
            }
            if (!TextUtils.isEmpty(this.f125496s)) {
                jSONObject.put("errorMap", this.f125496s);
            }
            jSONObject.put("zalo_video_thumb", this.f125472B);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    public C26405g(C18013y0 c18013y0, boolean z11) {
        this.f125486i = "";
        this.f125472B = "";
        this.f125473C = "";
        this.f125474D = "";
        this.f125475E = false;
        this.f125476F = EnumC27376c.f128982q;
        this.f125477G = "";
        try {
            this.f125479b = c18013y0.f91015t;
            this.f125480c = c18013y0.f91013r;
            this.f125481d = c18013y0.f91014s;
            if (z11) {
                this.f125478a = c18013y0.f91011p;
            }
            C32098s c32098s = c18013y0.f91251B;
            if (c32098s != null) {
                this.f125482e = c32098s.f147952b;
                this.f125483f = c32098s.f147959i;
                this.f125484g = c32098s.f147953c;
                this.f125485h = c32098s.f147957g;
                this.f125486i = c32098s.f147958h;
                this.f125487j = c32098s.f147954d;
                this.f125488k = c32098s.f147956f;
                this.f125489l = c32098s.f147960j;
                this.f125490m = c32098s.f147951a;
                this.f125499v = c32098s.f147963m;
                this.f125498u = c32098s.f147962l;
                this.f125503z = c32098s.f147967q;
                this.f125500w = c32098s.f147964n;
                this.f125501x = c32098s.f147965o;
                this.f125502y = c32098s.f147966p;
                this.f125471A = c32098s.f147975y;
                this.f125492o = c32098s.f147970t;
                this.f125493p = c32098s.f147971u;
                this.f125494q = c32098s.f147972v;
                this.f125495r = c32098s.f147973w;
                this.f125496s = c32098s.f147974x;
                this.f125472B = c32098s.m154936f();
                this.f125473C = c18013y0.f91251B.m154933c();
                this.f125474D = c18013y0.f91251B.m154932b();
                if (!c18013y0.f91251B.m154940j() && TextUtils.isEmpty(this.f125478a)) {
                    this.f125478a = this.f125484g;
                }
                C32098s c32098s2 = c18013y0.f91251B;
                this.f125475E = c32098s2.f147976z;
                this.f125476F = c32098s2.m154937g();
                this.f125477G = c18013y0.f91251B.m154934d();
                return;
            }
            String str = c18013y0.f91011p;
            this.f125478a = str;
            this.f125484g = str;
            this.f125488k = 0;
            try {
                URI uri = new URI(this.f125481d);
                if (TextUtils.isEmpty(uri.getHost())) {
                    return;
                }
                this.f125482e = uri.getHost();
            } catch (Exception unused) {
                this.f125482e = "";
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C26405g(LinkAttachment linkAttachment) {
        this.f125486i = "";
        this.f125472B = "";
        this.f125473C = "";
        this.f125474D = "";
        this.f125475E = false;
        this.f125476F = EnumC27376c.f128982q;
        this.f125477G = "";
        String str = linkAttachment.f42625q;
        this.f125478a = str;
        this.f125482e = linkAttachment.f42628t;
        this.f125481d = linkAttachment.f42624p;
        this.f125479b = linkAttachment.f42627s;
        this.f125480c = linkAttachment.f42626r;
        this.f125488k = 0;
        this.f125484g = str;
        C31869c6 c31869c6 = linkAttachment.f42630v;
        if (c31869c6 != null) {
            this.f125488k = c31869c6.f146355a;
            this.f125490m = c31869c6.f146359e;
            this.f125498u = c31869c6.f146358d;
            this.f125499v = c31869c6.f146357c;
            this.f125500w = c31869c6.f146356b;
            this.f125501x = c31869c6.f146361g;
            this.f125502y = c31869c6.f146362h;
            this.f125503z = (int) c31869c6.f146360f;
        }
    }
}
