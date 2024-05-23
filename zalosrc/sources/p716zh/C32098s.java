package p716zh;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C18013y0;
import ho0.AbstractC20110a;
import ig0.AbstractC20550a;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.C23307g;
import p560uw.EnumC27376c;
import p611wj.C29057e;
import tj.C26713e;

/* renamed from: zh.s */
/* loaded from: classes3.dex */
public class C32098s {

    /* renamed from: A */
    public long f147943A;

    /* renamed from: B */
    public long f147944B;

    /* renamed from: C */
    public long f147945C;

    /* renamed from: D */
    private String f147946D;

    /* renamed from: E */
    private String f147947E;

    /* renamed from: F */
    private String f147948F;

    /* renamed from: G */
    private String f147949G;

    /* renamed from: H */
    private EnumC27376c f147950H;

    /* renamed from: a */
    public String f147951a;

    /* renamed from: b */
    public String f147952b;

    /* renamed from: c */
    public String f147953c;

    /* renamed from: d */
    public String f147954d;

    /* renamed from: e */
    public int f147955e;

    /* renamed from: f */
    public int f147956f;

    /* renamed from: g */
    public String f147957g;

    /* renamed from: h */
    public String f147958h;

    /* renamed from: i */
    public String f147959i;

    /* renamed from: j */
    public String f147960j;

    /* renamed from: k */
    public String f147961k;

    /* renamed from: l */
    public C32107s8 f147962l;

    /* renamed from: m */
    public String f147963m;

    /* renamed from: n */
    public long f147964n;

    /* renamed from: o */
    public C32121t8 f147965o;

    /* renamed from: p */
    public C23307g f147966p;

    /* renamed from: q */
    public int f147967q;

    /* renamed from: r */
    public C26713e f147968r;

    /* renamed from: s */
    public String f147969s;

    /* renamed from: t */
    public int f147970t;

    /* renamed from: u */
    public int f147971u;

    /* renamed from: v */
    public int f147972v;

    /* renamed from: w */
    public String f147973w;

    /* renamed from: x */
    public String f147974x;

    /* renamed from: y */
    public a f147975y;

    /* renamed from: z */
    public boolean f147976z;

    /* renamed from: zh.s$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f147977a;

        /* renamed from: b */
        public long f147978b;

        /* renamed from: c */
        public long f147979c;

        public a(String str, long j11, long j12) {
            this.f147977a = str;
            this.f147978b = j11;
            this.f147979c = j12;
        }

        /* renamed from: a */
        public JSONObject m154950a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sellerId", this.f147977a);
                jSONObject.put("catalogId", this.f147978b);
                jSONObject.put("productId", this.f147979c);
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
            return jSONObject;
        }
    }

    public C32098s(String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, String str7, int i13, int i14, int i15, String str8, String str9) {
        this(str2, str3, str4, i11, i12, str5, str6, str7, i13, i14, i15, str8, str9);
        this.f147951a = str;
    }

    /* renamed from: a */
    public static C18013y0 m154929a(C29057e c29057e) {
        try {
            String m145124d = c29057e.m145124d();
            String m145127g = c29057e.m145127g();
            String m145122b = c29057e.m145122b();
            String m145125e = c29057e.m145125e();
            String m145123c = c29057e.m145123c();
            String m145121a = c29057e.m145121a();
            String m145126f = c29057e.m145126f();
            C18013y0 c18013y0 = new C18013y0("", 0, m145127g, m145122b, "", "recommened.link", "");
            C32098s c32098s = new C32098s(m145124d, m145125e, m145123c, "", 3, 3, m145121a, "0", m145126f, 0, 0, 0, "", "");
            c18013y0.f91251B = c32098s;
            c18013y0.f91017v = c32098s.m154935e();
            return c18013y0;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e3 A[Catch: Exception -> 0x0041, TryCatch #2 {Exception -> 0x0041, blocks: (B:3:0x0030, B:6:0x003c, B:7:0x0046, B:9:0x004c, B:10:0x0055, B:12:0x0061, B:13:0x0068, B:15:0x006e, B:16:0x0075, B:18:0x007b, B:19:0x0082, B:21:0x0088, B:22:0x0091, B:25:0x00a9, B:27:0x00af, B:28:0x00b6, B:30:0x00bc, B:31:0x00c3, B:33:0x00c9, B:34:0x00d0, B:36:0x00d6, B:37:0x00dd, B:39:0x00e3, B:40:0x00ea, B:42:0x00f0, B:43:0x00f7, B:45:0x00fd, B:46:0x0104, B:48:0x010a, B:50:0x011c, B:51:0x011e, B:53:0x0124, B:54:0x012b, B:56:0x0131, B:57:0x013b, B:59:0x0141, B:60:0x0145, B:62:0x014d, B:63:0x0161, B:65:0x0167, B:66:0x0177, B:67:0x01c2, B:70:0x01ca, B:72:0x01d4, B:73:0x01e6, B:75:0x01ec, B:76:0x01f5, B:78:0x0204, B:79:0x020f, B:81:0x0217, B:82:0x0222, B:84:0x022a, B:85:0x0235, B:87:0x023d, B:89:0x0249, B:90:0x024b, B:94:0x029e, B:96:0x02a4, B:98:0x02aa, B:102:0x02b1, B:104:0x02e3, B:106:0x02ed, B:107:0x02f1, B:128:0x028f), top: B:2:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a4 A[Catch: Exception -> 0x0041, TryCatch #2 {Exception -> 0x0041, blocks: (B:3:0x0030, B:6:0x003c, B:7:0x0046, B:9:0x004c, B:10:0x0055, B:12:0x0061, B:13:0x0068, B:15:0x006e, B:16:0x0075, B:18:0x007b, B:19:0x0082, B:21:0x0088, B:22:0x0091, B:25:0x00a9, B:27:0x00af, B:28:0x00b6, B:30:0x00bc, B:31:0x00c3, B:33:0x00c9, B:34:0x00d0, B:36:0x00d6, B:37:0x00dd, B:39:0x00e3, B:40:0x00ea, B:42:0x00f0, B:43:0x00f7, B:45:0x00fd, B:46:0x0104, B:48:0x010a, B:50:0x011c, B:51:0x011e, B:53:0x0124, B:54:0x012b, B:56:0x0131, B:57:0x013b, B:59:0x0141, B:60:0x0145, B:62:0x014d, B:63:0x0161, B:65:0x0167, B:66:0x0177, B:67:0x01c2, B:70:0x01ca, B:72:0x01d4, B:73:0x01e6, B:75:0x01ec, B:76:0x01f5, B:78:0x0204, B:79:0x020f, B:81:0x0217, B:82:0x0222, B:84:0x022a, B:85:0x0235, B:87:0x023d, B:89:0x0249, B:90:0x024b, B:94:0x029e, B:96:0x02a4, B:98:0x02aa, B:102:0x02b1, B:104:0x02e3, B:106:0x02ed, B:107:0x02f1, B:128:0x028f), top: B:2:0x0030 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18013y0 m154930o(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C32121t8 c32121t8;
        C23307g c23307g;
        a aVar;
        C32107s8 c32107s8;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        long j11;
        int i11;
        int i12;
        a aVar2;
        C26713e c26713e;
        int i13;
        int i14;
        int i15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        JSONObject jSONObject2;
        String str21;
        String str22;
        String str23;
        String str24;
        int i16;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        C32107s8 c32107s82;
        String str30;
        String str31;
        int i17;
        int i18;
        String str32;
        C32121t8 c32121t82;
        C32121t8 c32121t83;
        C23307g c23307g2;
        try {
            String str33 = "";
            if (!jSONObject.has("title")) {
                str = "";
            } else {
                str = AbstractC18069a.m96089h(jSONObject, "title");
            }
            if (!jSONObject.has("thumb")) {
                str2 = "";
            } else {
                str2 = AbstractC18069a.m96089h(jSONObject, "thumb");
            }
            String m96089h = AbstractC18069a.m96089h(jSONObject, "zalo_video_thumb");
            if (!jSONObject.has("href")) {
                str3 = "";
            } else {
                str3 = AbstractC18069a.m96089h(jSONObject, "href");
            }
            if (!jSONObject.has("desc")) {
                str4 = "";
            } else {
                str4 = AbstractC18069a.m96089h(jSONObject, "desc");
            }
            if (!jSONObject.has("src")) {
                str5 = "";
            } else {
                str5 = AbstractC18069a.m96089h(jSONObject, "src");
            }
            if (!jSONObject.has("stream_icon")) {
                str6 = "";
            } else {
                str6 = AbstractC18069a.m96089h(jSONObject, "stream_icon");
            }
            String m96089h2 = AbstractC18069a.m96089h(jSONObject, "local_path_thumb_link");
            String str34 = str4;
            JSONObject optJSONObject = jSONObject.optJSONObject("media");
            long j12 = 0;
            if (optJSONObject != null) {
                if (!optJSONObject.has("mediaTitle")) {
                    str23 = "";
                } else {
                    str23 = AbstractC18069a.m96089h(optJSONObject, "mediaTitle");
                }
                if (!optJSONObject.has("streamUrl")) {
                    str24 = "";
                } else {
                    str24 = AbstractC18069a.m96089h(optJSONObject, "streamUrl");
                }
                if (optJSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                    i16 = AbstractC18069a.m96085d(optJSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                } else {
                    i16 = 0;
                }
                if (!optJSONObject.has("artist")) {
                    str25 = "";
                } else {
                    str25 = AbstractC18069a.m96089h(optJSONObject, "artist");
                }
                if (!optJSONObject.has("artist_desc")) {
                    str26 = "";
                } else {
                    str26 = AbstractC18069a.m96089h(optJSONObject, "artist_desc");
                }
                if (!optJSONObject.has("count")) {
                    str27 = "";
                } else {
                    str27 = AbstractC18069a.m96089h(optJSONObject, "count");
                }
                if (!optJSONObject.has("id")) {
                    str28 = "";
                } else {
                    str28 = AbstractC18069a.m96089h(optJSONObject, "id");
                }
                if (optJSONObject.has("owner")) {
                    str29 = str28;
                    c32107s82 = new C32107s8(optJSONObject.optJSONObject("owner"));
                } else {
                    str29 = str28;
                    c32107s82 = null;
                }
                if (c32107s82 != null) {
                    c32107s82.f148013c = str5;
                }
                if (!optJSONObject.has("redirect_url")) {
                    str30 = "";
                } else {
                    str30 = AbstractC18069a.m96089h(optJSONObject, "redirect_url");
                }
                if (!optJSONObject.has("video_duration")) {
                    str31 = "arid";
                    i17 = 0;
                } else {
                    i17 = AbstractC18069a.m96085d(optJSONObject, "video_duration");
                    str31 = "arid";
                }
                if (optJSONObject.has(str31)) {
                    j12 = AbstractC18069a.m96087f(optJSONObject, str31);
                }
                if (optJSONObject.has("params")) {
                    i18 = i17;
                    c32121t82 = new C32121t8(optJSONObject.optJSONObject("params"));
                    str32 = "dimen";
                } else {
                    i18 = i17;
                    str32 = "dimen";
                    c32121t82 = null;
                }
                if (optJSONObject.has(str32)) {
                    c32121t83 = c32121t82;
                    c23307g2 = new C23307g(optJSONObject.optJSONObject(str32));
                } else {
                    c32121t83 = c32121t82;
                    c23307g2 = null;
                }
                a m154931p = m154931p(optJSONObject);
                C23307g c23307g3 = c23307g2;
                String optString = optJSONObject.optString("brand_name");
                String optString2 = optJSONObject.optString("avatar");
                str15 = str27;
                str9 = str26;
                str14 = str25;
                i12 = i16;
                str7 = str30;
                aVar = m154931p;
                c32121t8 = c32121t83;
                c23307g = c23307g3;
                str12 = optString2;
                str10 = str23;
                i11 = i18;
                str8 = str29;
                str11 = optString;
                str13 = str24;
                c32107s8 = c32107s82;
                j11 = j12;
            } else {
                c32121t8 = null;
                c23307g = null;
                aVar = null;
                c32107s8 = null;
                str7 = "";
                str8 = str7;
                str9 = str8;
                str10 = str9;
                str11 = str10;
                str12 = str11;
                str13 = str12;
                str14 = str13;
                str15 = str14;
                j11 = 0;
                i11 = 0;
                i12 = 0;
            }
            if (TextUtils.isEmpty(str10)) {
                str10 = str;
            }
            String str35 = str9;
            if (jSONObject.has("footerv2")) {
                aVar2 = aVar;
                c26713e = new C26713e(AbstractC18069a.m96091j(jSONObject, "footerv2"));
            } else {
                aVar2 = aVar;
                c26713e = null;
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                i13 = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            } else {
                i13 = 0;
            }
            int m96086e = AbstractC18069a.m96086e(jSONObject, "tType", 1);
            if (jSONObject.has("tWidth")) {
                i14 = AbstractC18069a.m96085d(jSONObject, "tWidth");
            } else {
                i14 = 0;
            }
            if (jSONObject.has("tHeight")) {
                i15 = AbstractC18069a.m96085d(jSONObject, "tHeight");
            } else {
                i15 = 0;
            }
            if (!jSONObject.has("icon")) {
                str16 = "";
            } else {
                str16 = AbstractC18069a.m96089h(jSONObject, "icon");
            }
            if (!jSONObject.has("errorMap")) {
                str17 = "";
            } else {
                str17 = AbstractC18069a.m96089h(jSONObject, "errorMap");
            }
            if (c32107s8 != null) {
                c32107s8.f148013c = str5;
            }
            if (!TextUtils.isEmpty(str17)) {
                try {
                    jSONObject2 = new JSONObject(str17);
                } catch (Exception e11) {
                    e = e11;
                    str18 = str34;
                }
                if (jSONObject2.has("3")) {
                    return null;
                }
                if (jSONObject2.has("0")) {
                    str10 = "";
                }
                if (jSONObject2.has("1")) {
                    str21 = "";
                } else {
                    str21 = str34;
                }
                try {
                    if (!jSONObject2.has("2")) {
                        str33 = str2;
                    }
                    str19 = str21;
                    str20 = str10;
                    str22 = str33;
                } catch (Exception e12) {
                    e = e12;
                    str18 = str21;
                    AbstractC20110a.m104539h(e);
                    str19 = str18;
                    str20 = str10;
                    str22 = str2;
                    if (!TextUtils.isEmpty(str20)) {
                    }
                    C18013y0 c18013y0 = new C18013y0(str, 0, str22, str3, str19, "recommened.link", "");
                    C32098s c32098s = new C32098s(str5, str20, str13, i13, i12, str14, str15, str6, m96086e, i14, i15, str16, str17);
                    c18013y0.f91251B = c32098s;
                    c32098s.f147963m = str8;
                    c32098s.f147962l = c32107s8;
                    c32098s.f147964n = j11;
                    c32098s.f147967q = i11;
                    c32098s.f147951a = str7;
                    c32098s.f147969s = str3;
                    c32098s.f147965o = c32121t8;
                    c32098s.f147966p = c23307g;
                    c32098s.f147968r = c26713e;
                    c32098s.f147946D = m96089h2;
                    if (!TextUtils.isEmpty(str3)) {
                    }
                    C32098s c32098s2 = c18013y0.f91251B;
                    c32098s2.f147975y = aVar2;
                    c32098s2.f147947E = m96089h;
                    c32098s2.f147948F = str11;
                    c32098s2.f147958h = str35;
                    c32098s2.f147949G = str12;
                    c18013y0.f91017v = c32098s2.m154935e();
                    return c18013y0;
                }
                if (!TextUtils.isEmpty(str20) && TextUtils.isEmpty(str19) && TextUtils.isEmpty(str22)) {
                    return null;
                }
                C18013y0 c18013y02 = new C18013y0(str, 0, str22, str3, str19, "recommened.link", "");
                C32098s c32098s3 = new C32098s(str5, str20, str13, i13, i12, str14, str15, str6, m96086e, i14, i15, str16, str17);
                c18013y02.f91251B = c32098s3;
                c32098s3.f147963m = str8;
                c32098s3.f147962l = c32107s8;
                c32098s3.f147964n = j11;
                c32098s3.f147967q = i11;
                c32098s3.f147951a = str7;
                c32098s3.f147969s = str3;
                c32098s3.f147965o = c32121t8;
                c32098s3.f147966p = c23307g;
                c32098s3.f147968r = c26713e;
                c32098s3.f147946D = m96089h2;
                if (!TextUtils.isEmpty(str3)) {
                    String m106804a = AbstractC20550a.m106804a(str3);
                    if (!TextUtils.isEmpty(m106804a)) {
                        c18013y02.f91251B.f147961k = m106804a;
                    }
                }
                C32098s c32098s22 = c18013y02.f91251B;
                c32098s22.f147975y = aVar2;
                c32098s22.f147947E = m96089h;
                c32098s22.f147948F = str11;
                c32098s22.f147958h = str35;
                c32098s22.f147949G = str12;
                c18013y02.f91017v = c32098s22.m154935e();
                return c18013y02;
            }
            str20 = str10;
            str19 = str34;
            str22 = str2;
            if (!TextUtils.isEmpty(str20)) {
            }
            C18013y0 c18013y022 = new C18013y0(str, 0, str22, str3, str19, "recommened.link", "");
            C32098s c32098s32 = new C32098s(str5, str20, str13, i13, i12, str14, str15, str6, m96086e, i14, i15, str16, str17);
            c18013y022.f91251B = c32098s32;
            c32098s32.f147963m = str8;
            c32098s32.f147962l = c32107s8;
            c32098s32.f147964n = j11;
            c32098s32.f147967q = i11;
            c32098s32.f147951a = str7;
            c32098s32.f147969s = str3;
            c32098s32.f147965o = c32121t8;
            c32098s32.f147966p = c23307g;
            c32098s32.f147968r = c26713e;
            c32098s32.f147946D = m96089h2;
            if (!TextUtils.isEmpty(str3)) {
            }
            C32098s c32098s222 = c18013y022.f91251B;
            c32098s222.f147975y = aVar2;
            c32098s222.f147947E = m96089h;
            c32098s222.f147948F = str11;
            c32098s222.f147958h = str35;
            c32098s222.f147949G = str12;
            c18013y022.f91017v = c32098s222.m154935e();
            return c18013y022;
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
            return null;
        }
    }

    /* renamed from: p */
    public static a m154931p(JSONObject jSONObject) {
        try {
            JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "productCatalogInfo");
            if (m96091j != null) {
                return new a(AbstractC18069a.m96089h(m96091j, "sellerId"), AbstractC18069a.m96087f(m96091j, "catalogId"), AbstractC18069a.m96087f(m96091j, "productId"));
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: b */
    public String m154932b() {
        return this.f147949G;
    }

    /* renamed from: c */
    public String m154933c() {
        return this.f147948F;
    }

    /* renamed from: d */
    public String m154934d() {
        return this.f147946D;
    }

    /* renamed from: e */
    public String m154935e() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(this.f147951a)) {
                str = "";
            } else {
                str = this.f147951a;
            }
            jSONObject.put("redirect_url", str);
            String str2 = this.f147952b;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("src", str2);
            String str3 = this.f147953c;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("mediaTitle", str3);
            String str4 = this.f147954d;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("streamUrl", str4);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f147955e);
            jSONObject.put("linkType", this.f147956f);
            String str5 = this.f147957g;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("artist", str5);
            if (!this.f147958h.isEmpty()) {
                jSONObject.put("artist_desc", this.f147958h);
            }
            String str6 = this.f147959i;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("count", str6);
            String str7 = this.f147960j;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("stream_icon", str7);
            String str8 = this.f147963m;
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("mediaId", str8);
            jSONObject.put("video_duration", this.f147967q);
            jSONObject.put("arid", this.f147964n);
            jSONObject.put("href", this.f147969s);
            C32107s8 c32107s8 = this.f147962l;
            if (c32107s8 != null) {
                jSONObject.put("owner", c32107s8.m154982a());
            }
            C32121t8 c32121t8 = this.f147965o;
            if (c32121t8 != null) {
                jSONObject.put("params", c32121t8.m155022a());
            }
            C23307g c23307g = this.f147966p;
            if (c23307g != null) {
                jSONObject.put("dimen", c23307g.m120735a());
            }
            C26713e c26713e = this.f147968r;
            if (c26713e != null) {
                jSONObject.put("footerv2", c26713e.m137363h());
            }
            a aVar = this.f147975y;
            if (aVar != null) {
                jSONObject.put("productCatalogInfo", aVar.m154950a());
            }
            jSONObject.put("tType", this.f147970t);
            jSONObject.put("tWidth", this.f147971u);
            jSONObject.put("tHeight", this.f147972v);
            if (!TextUtils.isEmpty(this.f147973w)) {
                jSONObject.put("icon", this.f147973w);
            }
            if (!TextUtils.isEmpty(this.f147974x)) {
                jSONObject.put("errorMap", this.f147974x);
            }
            if (!TextUtils.isEmpty(this.f147947E)) {
                jSONObject.put("zalo_video_thumb", this.f147947E);
            }
            if (!TextUtils.isEmpty(this.f147948F)) {
                jSONObject.put("brand_name", this.f147948F);
            }
            if (!TextUtils.isEmpty(this.f147949G)) {
                jSONObject.put("avatar", this.f147949G);
            }
            if (!TextUtils.isEmpty(this.f147946D)) {
                jSONObject.put("local_path_thumb_link", this.f147946D);
            }
            jSONObject.put("thumb_src_type", this.f147950H.m140280c());
            return jSONObject.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: f */
    public String m154936f() {
        return this.f147947E;
    }

    /* renamed from: g */
    public EnumC27376c m154937g() {
        return this.f147950H;
    }

    /* renamed from: h */
    public boolean m154938h() {
        if (this.f147956f == 4 && !TextUtils.isEmpty(this.f147951a) && this.f147964n > 0 && !TextUtils.isEmpty(this.f147963m)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m154939i() {
        int i11 = this.f147956f;
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4;
    }

    /* renamed from: j */
    public boolean m154940j() {
        int i11 = this.f147956f;
        return i11 == 7 || i11 == 8;
    }

    /* renamed from: k */
    public boolean m154941k() {
        if (this.f147956f == 11 && ((!TextUtils.isEmpty(this.f147957g) || !TextUtils.isEmpty(this.f147958h)) && !TextUtils.isEmpty(this.f147949G))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m154942l() {
        if (!m154943m() && !m154944n()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m154943m() {
        return this.f147956f == 11;
    }

    /* renamed from: n */
    public boolean m154944n() {
        return this.f147956f == 10;
    }

    /* renamed from: q */
    public void m154945q(String str) {
        this.f147949G = str;
    }

    /* renamed from: r */
    public void m154946r(String str) {
        this.f147948F = str;
    }

    /* renamed from: s */
    public void m154947s(String str) {
        this.f147946D = str;
    }

    /* renamed from: t */
    public void m154948t(String str) {
        this.f147947E = str;
    }

    /* renamed from: u */
    public void m154949u(EnumC27376c enumC27376c) {
        this.f147950H = enumC27376c;
    }

    public C32098s(String str, String str2, String str3, int i11, int i12, String str4, String str5, String str6, int i13, int i14, int i15, String str7, String str8) {
        this.f147958h = "";
        this.f147961k = "";
        this.f147976z = false;
        this.f147943A = 0L;
        this.f147944B = 0L;
        this.f147945C = 0L;
        this.f147946D = "";
        this.f147947E = "";
        this.f147948F = "";
        this.f147949G = "";
        this.f147950H = EnumC27376c.f128982q;
        this.f147952b = str;
        this.f147953c = str2;
        this.f147954d = str3;
        this.f147955e = i12;
        this.f147956f = i11;
        this.f147957g = str4;
        this.f147959i = str5;
        this.f147960j = str6;
        this.f147970t = i13;
        this.f147971u = i14;
        this.f147972v = i15;
        this.f147973w = str7;
        this.f147974x = str8;
    }

    public C32098s(JSONObject jSONObject) {
        this.f147958h = "";
        this.f147961k = "";
        this.f147976z = false;
        this.f147943A = 0L;
        this.f147944B = 0L;
        this.f147945C = 0L;
        this.f147946D = "";
        this.f147947E = "";
        this.f147948F = "";
        this.f147949G = "";
        EnumC27376c enumC27376c = EnumC27376c.f128982q;
        this.f147950H = enumC27376c;
        try {
            if (jSONObject.has("redirect_url")) {
                this.f147951a = AbstractC18069a.m96089h(jSONObject, "redirect_url");
            }
            if (jSONObject.has("src")) {
                this.f147952b = AbstractC18069a.m96089h(jSONObject, "src");
            }
            if (jSONObject.has("mediaTitle")) {
                this.f147953c = AbstractC18069a.m96089h(jSONObject, "mediaTitle");
            }
            if (jSONObject.has("streamUrl")) {
                this.f147954d = AbstractC18069a.m96089h(jSONObject, "streamUrl");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                this.f147955e = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            if (jSONObject.has("artist")) {
                this.f147957g = AbstractC18069a.m96089h(jSONObject, "artist");
            }
            if (jSONObject.has("artist_desc")) {
                this.f147958h = AbstractC18069a.m96089h(jSONObject, "artist_desc");
            }
            if (jSONObject.has("count")) {
                this.f147959i = AbstractC18069a.m96089h(jSONObject, "count");
            }
            if (jSONObject.has("stream_icon")) {
                this.f147960j = AbstractC18069a.m96089h(jSONObject, "stream_icon");
            }
            if (jSONObject.has("mediaId")) {
                this.f147963m = AbstractC18069a.m96089h(jSONObject, "mediaId");
            }
            if (jSONObject.has("owner")) {
                this.f147962l = new C32107s8(jSONObject.optJSONObject("owner"));
            }
            if (jSONObject.has("params")) {
                this.f147965o = new C32121t8(jSONObject.optJSONObject("params"));
            }
            if (jSONObject.has("dimen")) {
                this.f147966p = new C23307g(jSONObject.optJSONObject("dimen"));
            }
            if (jSONObject.has("video_duration")) {
                this.f147967q = AbstractC18069a.m96085d(jSONObject, "video_duration");
            }
            if (jSONObject.has("arid")) {
                this.f147964n = AbstractC18069a.m96087f(jSONObject, "arid");
            }
            if (jSONObject.has("href")) {
                this.f147969s = AbstractC18069a.m96089h(jSONObject, "href");
            }
            if (jSONObject.has("footerv2")) {
                this.f147968r = new C26713e(AbstractC18069a.m96091j(jSONObject, "footerv2"));
            }
            if (jSONObject.has("linkType")) {
                this.f147956f = AbstractC18069a.m96085d(jSONObject, "linkType");
            } else {
                this.f147956f = this.f147955e;
            }
            if (jSONObject.has("tType")) {
                this.f147970t = AbstractC18069a.m96085d(jSONObject, "tType");
            } else {
                this.f147970t = 1;
            }
            if (jSONObject.has("tWidth")) {
                this.f147971u = AbstractC18069a.m96085d(jSONObject, "tWidth");
            }
            if (jSONObject.has("tHeight")) {
                this.f147972v = AbstractC18069a.m96085d(jSONObject, "tHeight");
            }
            if (jSONObject.has("icon")) {
                this.f147973w = AbstractC18069a.m96089h(jSONObject, "icon");
            }
            if (jSONObject.has("errorMap")) {
                this.f147974x = AbstractC18069a.m96089h(jSONObject, "errorMap");
            }
            if (m154940j()) {
                this.f147975y = m154931p(jSONObject);
            }
            if (jSONObject.has("zalo_video_thumb")) {
                this.f147947E = AbstractC18069a.m96089h(jSONObject, "zalo_video_thumb");
            }
            if (jSONObject.has("brand_name")) {
                this.f147948F = AbstractC18069a.m96089h(jSONObject, "brand_name");
            }
            if (jSONObject.has("avatar")) {
                this.f147949G = AbstractC18069a.m96089h(jSONObject, "avatar");
            }
            if (jSONObject.has("local_path_thumb_link")) {
                this.f147946D = AbstractC18069a.m96089h(jSONObject, "local_path_thumb_link");
            }
            if (jSONObject.has("thumb_src_type")) {
                if (AbstractC18069a.m96085d(jSONObject, "thumb_src_type") != enumC27376c.m140280c()) {
                    enumC27376c = EnumC27376c.f128983r;
                }
                this.f147950H = enumC27376c;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
