package com.zing.zalo.control;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C18009w0;
import dj.C18013y0;
import ge.C19409a;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23008a2;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p394oj.C24280f;
import p471r3.C25630b;
import p588vw.C28652r;
import p716zh.C32098s;
import vg.C28203u6;

/* renamed from: com.zing.zalo.control.b */
/* loaded from: classes3.dex */
public class C7904b {

    /* renamed from: A */
    public List f42713A;

    /* renamed from: B */
    public long f42714B;

    /* renamed from: C */
    public String f42715C;

    /* renamed from: D */
    public String f42716D;

    /* renamed from: E */
    public long f42717E;

    /* renamed from: F */
    public long f42718F;

    /* renamed from: G */
    public InviteContactProfile f42719G;

    /* renamed from: H */
    public InviteContactProfile f42720H;

    /* renamed from: I */
    public int f42721I;

    /* renamed from: J */
    public String f42722J;

    /* renamed from: K */
    public String f42723K;

    /* renamed from: L */
    public a f42724L;

    /* renamed from: M */
    public int f42725M;

    /* renamed from: N */
    public boolean f42726N;

    /* renamed from: O */
    private String f42727O;

    /* renamed from: P */
    CharSequence f42728P;

    /* renamed from: a */
    public int f42729a;

    /* renamed from: b */
    public int f42730b;

    /* renamed from: c */
    public String f42731c;

    /* renamed from: d */
    public long f42732d;

    /* renamed from: e */
    public long f42733e;

    /* renamed from: f */
    public String f42734f;

    /* renamed from: g */
    public int f42735g;

    /* renamed from: h */
    public String f42736h;

    /* renamed from: i */
    public String f42737i;

    /* renamed from: j */
    public String f42738j;

    /* renamed from: k */
    public String f42739k;

    /* renamed from: l */
    public String f42740l;

    /* renamed from: m */
    public String f42741m;

    /* renamed from: n */
    public int f42742n;

    /* renamed from: o */
    public String f42743o;

    /* renamed from: p */
    public String f42744p;

    /* renamed from: q */
    public String f42745q;

    /* renamed from: r */
    public int f42746r;

    /* renamed from: s */
    public MessageId f42747s;

    /* renamed from: t */
    public String f42748t;

    /* renamed from: u */
    public String f42749u;

    /* renamed from: v */
    public String f42750v;

    /* renamed from: w */
    public String f42751w;

    /* renamed from: x */
    public int f42752x;

    /* renamed from: y */
    public String f42753y;

    /* renamed from: z */
    public String f42754z;

    /* renamed from: com.zing.zalo.control.b$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public C19409a f42755a;

        /* renamed from: b */
        public String f42756b;

        public a() {
        }

        public a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f42755a = new C19409a(jSONObject.optJSONObject("attend"));
        }

        /* renamed from: a */
        public JSONObject m40781a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("attend", this.f42755a.m101524a());
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    public C7904b(int i11) {
        this.f42730b = -14540254;
        this.f42735g = 0;
        this.f42744p = "";
        this.f42746r = 0;
        this.f42752x = 1;
        this.f42753y = "";
        this.f42725M = 0;
        this.f42726N = false;
        this.f42727O = null;
        this.f42729a = i11;
    }

    /* renamed from: a */
    private void m40763a() {
        if (!TextUtils.isEmpty(this.f42744p) && !TextUtils.isEmpty(this.f42737i)) {
            this.f42737i = AbstractC23008a2.m117937f(this.f42737i, this.f42744p);
        }
    }

    /* renamed from: b */
    public JSONObject m40764b() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            int i11 = this.f42729a;
            String str3 = "0";
            String str4 = "";
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    jSONObject.put("title", this.f42736h);
                                } else {
                                    jSONObject.put("title", this.f42736h);
                                    jSONObject.put("albumId", this.f42714B);
                                }
                            } else {
                                jSONObject.put("title", this.f42736h);
                                a aVar = this.f42724L;
                                if (aVar != null) {
                                    jSONObject.put("eventId", aVar.f42756b);
                                }
                                jSONObject.put("extra", this.f42749u);
                            }
                        } else {
                            jSONObject.put("pollId", this.f42722J);
                            jSONObject.put("title", this.f42736h);
                        }
                    } else {
                        jSONObject.put("title", this.f42736h);
                        jSONObject.put("thumb", this.f42737i);
                        jSONObject.put("msg_type", this.f42746r);
                        if (this.f42747s == null) {
                            str2 = "0";
                        } else {
                            str2 = this.f42747s.m41045i() + "";
                        }
                        jSONObject.put("client_msg_id", str2);
                        if (this.f42747s != null) {
                            str3 = this.f42747s.m41047k() + "";
                        }
                        jSONObject.put("global_msg_id", str3);
                        jSONObject.put("extra", this.f42749u);
                        jSONObject.put("senderName", this.f42751w);
                        jSONObject.put("senderUid", this.f42750v);
                    }
                } else {
                    jSONObject.put("title", this.f42736h);
                    jSONObject.put("thumb", this.f42737i);
                    jSONObject.put("src", this.f42739k);
                    jSONObject.put("href", this.f42738j);
                    jSONObject.put("redirect_url", this.f42740l);
                    jSONObject.put("streamUrl", this.f42741m);
                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f42742n);
                    jSONObject.put("artist", this.f42743o);
                    if (!TextUtils.isEmpty(this.f42745q)) {
                        str4 = this.f42745q;
                    }
                    jSONObject.put("stream_icon", str4);
                    jSONObject.put("linkCaption", this.f42716D);
                }
            } else {
                jSONObject.put("title", this.f42736h);
                if (this.f42747s == null) {
                    str = "0";
                } else {
                    str = this.f42747s.m41045i() + "";
                }
                jSONObject.put("client_msg_id", str);
                if (this.f42747s != null) {
                    str3 = this.f42747s.m41047k() + "";
                }
                jSONObject.put("global_msg_id", str3);
                jSONObject.put("senderName", this.f42751w);
                jSONObject.put("senderUid", this.f42750v);
                jSONObject.put("extra", this.f42749u);
            }
            if (!this.f42744p.isEmpty()) {
                jSONObject.put("convertible", this.f42744p);
                if (!TextUtils.isEmpty(this.f42737i)) {
                    jSONObject.put("thumb", AbstractC23008a2.m117937f(this.f42737i, this.f42744p));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public String m40765c() {
        InviteContactProfile inviteContactProfile = this.f42719G;
        if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
            ContactProfile m141811g = C28203u6.f131407a.m141811g(this.f42719G.f42434r);
            if (m141811g != null) {
                return m141811g.m40383Q(true, false);
            }
            InviteContactProfile inviteContactProfile2 = this.f42719G;
            return AbstractC21935u.m114542i(inviteContactProfile2.f42434r, inviteContactProfile2.f42437s);
        }
        return "";
    }

    /* renamed from: d */
    public String m40766d() {
        String str = this.f42748t;
        if (str != null && !"".equals(str) && AbstractC23041d2.m118194A(this.f42748t)) {
            return this.f42748t;
        }
        return this.f42737i;
    }

    /* renamed from: e */
    public String m40767e() {
        if (!TextUtils.isEmpty(this.f42750v)) {
            ContactProfile m141811g = C28203u6.f131407a.m141811g(this.f42750v);
            if (m141811g != null) {
                return m141811g.m40383Q(true, false);
            }
            return AbstractC21935u.m114542i(this.f42750v, this.f42751w);
        }
        return "";
    }

    /* renamed from: f */
    public String m40768f() {
        try {
            String trim = this.f42736h.trim();
            if (!TextUtils.isEmpty(this.f42743o)) {
                return trim + " - " + this.f42743o.trim();
            }
            return trim;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public String m40769g() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            int i11 = this.f42729a;
            String str2 = "";
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                jSONObject.put("title", this.f42736h);
                            } else {
                                jSONObject.put("title", this.f42736h);
                                jSONObject.put("albumId", this.f42714B);
                            }
                        } else {
                            jSONObject.put("title", this.f42736h);
                            a aVar = this.f42724L;
                            if (aVar != null && !TextUtils.isEmpty(aVar.f42756b)) {
                                jSONObject.put("eventId", this.f42724L.f42756b);
                            }
                        }
                    } else {
                        jSONObject.put("pollId", this.f42722J);
                        jSONObject.put("title", this.f42736h);
                    }
                } else {
                    jSONObject.put("title", this.f42736h);
                    jSONObject.put("thumb", this.f42737i);
                    jSONObject.put("msg_type", this.f42746r);
                    String str3 = "0";
                    if (this.f42747s == null) {
                        str = "0";
                    } else {
                        str = this.f42747s.m41045i() + "";
                    }
                    jSONObject.put("client_msg_id", str);
                    if (this.f42747s != null) {
                        str3 = this.f42747s.m41047k() + "";
                    }
                    jSONObject.put("global_msg_id", str3);
                    jSONObject.put("extra", this.f42749u);
                    jSONObject.put("senderName", this.f42751w);
                    jSONObject.put("senderUid", this.f42750v);
                }
            } else {
                jSONObject.put("title", this.f42736h);
                jSONObject.put("thumb", this.f42737i);
                jSONObject.put("src", this.f42739k);
                jSONObject.put("href", this.f42738j);
                jSONObject.put("redirect_url", this.f42740l);
                jSONObject.put("streamUrl", this.f42741m);
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f42742n);
                jSONObject.put("artist", this.f42743o);
                if (!TextUtils.isEmpty(this.f42745q)) {
                    str2 = this.f42745q;
                }
                jSONObject.put("stream_icon", str2);
                jSONObject.put("linkCaption", this.f42716D);
            }
            if (!this.f42744p.isEmpty()) {
                jSONObject.put("convertible", this.f42744p);
                if (!TextUtils.isEmpty(this.f42737i)) {
                    jSONObject.put("thumb", AbstractC23008a2.m117937f(this.f42737i, this.f42744p));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: h */
    public String m40770h() {
        return this.f42729a == 1 ? this.f42716D : this.f42736h;
    }

    /* renamed from: i */
    public String m40771i() {
        if (this.f42723K == null) {
            this.f42723K = AbstractC23244v8.m119760x(m40770h());
        }
        return this.f42723K;
    }

    /* renamed from: j */
    public JSONObject m40772j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0", m40764b().toString());
            if (!TextUtils.isEmpty(this.f42734f)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("repeatRule", this.f42734f);
                jSONObject.put("1", jSONObject2.toString());
            }
            int i11 = this.f42729a;
            if (i11 == 4 || (i11 == 0 && this.f42732d > 0)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("calendarType", this.f42735g);
                jSONObject3.put("startTime", this.f42732d);
                jSONObject3.put("endTime", this.f42733e);
                jSONObject3.put("allDay", this.f42725M);
                jSONObject.put("3", jSONObject3.toString());
            }
            if (!TextUtils.isEmpty(this.f42731c)) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("emoji", this.f42731c);
                jSONObject.put("4", jSONObject4.toString());
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("topicType", this.f42729a);
            jSONObject.put("6", jSONObject5.toString());
            a aVar = this.f42724L;
            if (aVar != null && aVar.f42755a != null) {
                jSONObject.put("7", aVar.m40781a());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2 A[Catch: Exception -> 0x0019, TryCatch #3 {Exception -> 0x0019, blocks: (B:7:0x0008, B:15:0x0015, B:17:0x001c, B:34:0x0041, B:35:0x0051, B:37:0x0059, B:39:0x006e, B:50:0x00c2, B:52:0x00ca, B:56:0x00bf, B:57:0x00e1, B:59:0x00e9, B:61:0x00fb, B:62:0x0111, B:65:0x011b, B:67:0x0121, B:69:0x0127, B:70:0x012d, B:71:0x013a, B:73:0x014c, B:75:0x0156, B:77:0x015e, B:78:0x0164, B:80:0x016a, B:81:0x0133, B:82:0x017e, B:83:0x018a, B:84:0x0196, B:95:0x01af, B:88:0x01ca, B:90:0x01d2, B:86:0x01bf, B:98:0x01bc, B:99:0x01e8, B:101:0x01fa, B:102:0x0210, B:119:0x0264, B:120:0x026f, B:121:0x027a, B:123:0x027e, B:125:0x0291, B:127:0x029b, B:129:0x02a1, B:130:0x0286, B:131:0x02b4, B:132:0x02b7, B:92:0x019e, B:41:0x007e, B:43:0x0084, B:45:0x0091, B:48:0x009c), top: B:6:0x0008, inners: #1, #2 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m40773k() {
        int i11;
        String string;
        String string2;
        String string3;
        Context appContext;
        int i12;
        ContactProfile m98552o;
        String str = "";
        if (this.f42727O == null) {
            try {
                i11 = this.f42729a;
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                this.f42727O = str;
                return this.f42727O;
            }
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        str = this.f42736h;
                    }
                } else {
                    int i13 = this.f42746r;
                    if (i13 != 1) {
                        if (i13 != 46) {
                            if (i13 != 49) {
                                if (i13 != 52) {
                                    if (i13 != 31) {
                                        if (i13 != 32) {
                                            if (i13 != 43) {
                                                if (i13 != 44) {
                                                    switch (i13) {
                                                        case 36:
                                                            str = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_sticker);
                                                            break;
                                                        case 37:
                                                            str = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_doodle);
                                                            break;
                                                        case 38:
                                                            if (!TextUtils.isEmpty(this.f42749u)) {
                                                                JSONObject jSONObject = new JSONObject(this.f42749u);
                                                                String optString = jSONObject.optString("action");
                                                                if (TextUtils.equals("recommened.link", optString)) {
                                                                    str = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_link);
                                                                    String optString2 = jSONObject.optString("params");
                                                                    try {
                                                                        if (!TextUtils.isEmpty(optString2)) {
                                                                            JSONObject jSONObject2 = new JSONObject(optString2);
                                                                            if (jSONObject2.optInt("linkType") != 10) {
                                                                                if (jSONObject2.optInt("linkType") == 11) {
                                                                                }
                                                                            }
                                                                            str = "[" + jSONObject2.optString("brand_name", AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_video)) + "]";
                                                                        }
                                                                    } catch (Exception e12) {
                                                                        AbstractC23350e.m122778h(e12);
                                                                    }
                                                                    if (!TextUtils.isEmpty(this.f42754z)) {
                                                                        string2 = str + " " + this.f42754z;
                                                                        break;
                                                                    }
                                                                } else if (TextUtils.equals("recommened.stickerset", optString)) {
                                                                    str = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_sticker_set);
                                                                    if (!TextUtils.isEmpty(this.f42754z)) {
                                                                        str = str + " " + this.f42754z;
                                                                        break;
                                                                    }
                                                                } else if (TextUtils.equals("recommened.user", optString) || TextUtils.equals("recommened.vip", optString)) {
                                                                    if (TextUtils.equals("recommened.vip", optString)) {
                                                                        appContext = MainApplication.getAppContext();
                                                                        i12 = AbstractC8020f0.str_reply_msg_oa;
                                                                    } else {
                                                                        appContext = MainApplication.getAppContext();
                                                                        i12 = AbstractC8020f0.str_reply_msg_contact;
                                                                    }
                                                                    str = appContext.getString(i12);
                                                                    String optString3 = jSONObject.optString("dpn");
                                                                    String optString4 = jSONObject.optString("uid");
                                                                    if (!TextUtils.isEmpty(optString4) && (m98552o = C18644n.m98531l().m98552o(optString4)) != null && !optString4.equals(CoreUtility.f89233i)) {
                                                                        optString3 = AbstractC21935u.m114539f(m98552o.f42455y, optString4, optString3);
                                                                    }
                                                                    if (!TextUtils.isEmpty(optString3)) {
                                                                        str = str + " " + optString3;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            str = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_bubble_unsupport_message);
                                                            break;
                                                    }
                                                } else {
                                                    if (!TextUtils.isEmpty(this.f42749u)) {
                                                        try {
                                                        } catch (Exception e13) {
                                                            e13.printStackTrace();
                                                        }
                                                        if (new JSONObject(this.f42749u).optInt("msgBubbleLayoutType") == 1003) {
                                                            string3 = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_gif);
                                                            str = string3;
                                                            if (!TextUtils.isEmpty(this.f42754z)) {
                                                                str = str + " " + this.f42754z;
                                                            }
                                                        }
                                                    }
                                                    string3 = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_video);
                                                    str = string3;
                                                    if (!TextUtils.isEmpty(this.f42754z)) {
                                                    }
                                                }
                                            } else {
                                                str = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_location);
                                                if (!TextUtils.isEmpty(this.f42754z)) {
                                                    str = str + " " + this.f42754z;
                                                }
                                            }
                                        } else {
                                            string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_photo);
                                            try {
                                                if (!TextUtils.isEmpty(this.f42754z)) {
                                                    string2 = string2 + " " + this.f42754z;
                                                }
                                                if (!TextUtils.isEmpty(this.f42749u)) {
                                                    try {
                                                        if (!TextUtils.isEmpty(new JSONObject(this.f42749u).optString("webpUrl", ""))) {
                                                            string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_sticker);
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                str = string2;
                                                e = e14;
                                                e.printStackTrace();
                                                this.f42727O = str;
                                                return this.f42727O;
                                            }
                                        }
                                        str = string2;
                                    } else {
                                        str = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_voice);
                                    }
                                }
                            } else {
                                str = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_gif);
                            }
                        } else {
                            if (this.f42752x == 2) {
                                string = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_folder);
                            } else {
                                string = MainApplication.getAppContext().getString(AbstractC8020f0.str_reply_msg_file);
                            }
                            str = string;
                            String str2 = this.f42754z;
                            if (!TextUtils.isEmpty(this.f42749u) && !TextUtils.isEmpty(str2)) {
                                str = str + " " + str2;
                            }
                        }
                    }
                    str = this.f42754z;
                }
                this.f42727O = str;
            }
            str = this.f42754z;
            this.f42727O = str;
        }
        return this.f42727O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence] */
    /* renamed from: l */
    public CharSequence m40774l() {
        boolean z11;
        if (this.f42728P == null) {
            int i11 = this.f42729a;
            if (i11 != 4 && i11 != 0 && i11 != 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            String m40773k = m40773k();
            String str = m40773k;
            if (z11) {
                str = C28652r.m143349v().m143357H(m40773k);
            }
            this.f42728P = str;
        }
        return this.f42728P;
    }

    /* renamed from: m */
    public void m40775m() {
        JSONArray optJSONArray;
        int i11;
        int lastIndexOf;
        this.f42754z = this.f42736h;
        try {
            int i12 = this.f42729a;
            if (i12 != 0 && i12 != 4 && (i11 = this.f42746r) != 1 && i11 != 32 && i11 != 38) {
                if (i11 == 46) {
                    if (!TextUtils.isEmpty(this.f42749u)) {
                        JSONObject jSONObject = new JSONObject(this.f42749u);
                        this.f42753y = jSONObject.getString("fileExt");
                        String optString = jSONObject.optString("fdata");
                        if (!TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            if (jSONObject2.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                                this.f42752x = jSONObject2.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                            }
                            if (this.f42752x == 2 && (lastIndexOf = this.f42736h.lastIndexOf(this.f42753y)) > 0 && this.f42753y.length() + lastIndexOf == this.f42736h.length()) {
                                this.f42754z = this.f42736h.substring(0, lastIndexOf - 1);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i11 == 52 && !TextUtils.isEmpty(this.f42749u)) {
                    this.f42754z = AbstractC19646n0.m102890F(new JSONObject(this.f42749u), -1);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.f42749u) && (optJSONArray = new JSONObject(this.f42749u).optJSONArray("mentions")) != null) {
                List m40857g = new C7907e(optJSONArray).m40857g();
                this.f42713A = m40857g;
                this.f42754z = AbstractC19620d0.m102674K(m40857g, this.f42736h);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public boolean m40776n() {
        if (System.currentTimeMillis() - this.f42717E <= 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m40777o() {
        InviteContactProfile inviteContactProfile = this.f42719G;
        if (inviteContactProfile != null && CoreUtility.f89233i.equals(inviteContactProfile.f42434r)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m40778p() {
        int i11 = this.f42729a;
        if (i11 != 1 && i11 != 0 && i11 != 3 && i11 != 4 && i11 != 5) {
            if (i11 == 2) {
                int i12 = this.f42746r;
                if (i12 != 1 && i12 != 46 && i12 != 49 && i12 != 52 && i12 != 31 && i12 != 32 && i12 != 43 && i12 != 44) {
                    switch (i12) {
                    }
                }
            }
            return false;
        }
        if (this.f42721I == 0) {
            return true;
        }
        long j11 = this.f42732d;
        if (j11 <= Long.MIN_VALUE || j11 - C23793c.m124316k().mo124311f() > 15000) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m40779q() {
        if (this.f42729a == 2) {
            int i11 = this.f42746r;
            if (i11 != 1) {
                if (i11 != 32) {
                    if (i11 == 38 && !TextUtils.isEmpty(this.f42749u)) {
                        try {
                            if (TextUtils.equals("recommened.link", new JSONObject(this.f42749u).optString("action"))) {
                                return true;
                            }
                            return false;
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                            return false;
                        }
                    }
                    return false;
                }
                if (TextUtils.isEmpty(this.f42754z)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public JSONObject m40780r() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f42715C);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f42729a);
            jSONObject.put("color", this.f42730b);
            jSONObject.put("emoji", this.f42731c);
            jSONObject.put("createTime", this.f42717E);
            jSONObject.put("editTime", this.f42718F);
            jSONObject.put("startTime", this.f42732d);
            jSONObject.put("endTime", this.f42733e);
            jSONObject.put("repeatRule", this.f42734f);
            jSONObject.put("calendarType", this.f42735g);
            jSONObject.put("hideWhenExpire", this.f42721I);
            if (this.f42719G != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", this.f42719G.f42434r);
                jSONObject2.put("dpn", this.f42719G.f42437s);
                jSONObject2.put("avt", this.f42719G.f42446v);
                jSONObject.put("creator", jSONObject2);
            }
            if (this.f42720H != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("uid", this.f42720H.f42434r);
                jSONObject3.put("dpn", this.f42720H.f42437s);
                jSONObject3.put("avt", this.f42720H.f42446v);
                jSONObject.put("editor", jSONObject3);
            }
            jSONObject.put("params", m40769g());
            jSONObject.put("properties", m40772j());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x002b, B:6:0x0051, B:7:0x0068, B:9:0x0070, B:10:0x0083, B:13:0x00bb, B:15:0x00c1, B:17:0x00cb, B:18:0x00dd, B:20:0x00e3, B:22:0x00ed, B:34:0x0105, B:35:0x0217, B:36:0x010d, B:37:0x011d, B:39:0x0127, B:40:0x012e, B:41:0x0140, B:42:0x0154, B:44:0x0190, B:46:0x01a3, B:47:0x01a6, B:48:0x01f1, B:49:0x0222, B:51:0x0228, B:53:0x0232, B:54:0x023f, B:56:0x0247, B:58:0x0251, B:59:0x026e, B:61:0x0276, B:63:0x0282, B:64:0x028f, B:66:0x0297, B:68:0x02a3, B:70:0x02b1, B:71:0x02b4, B:73:0x03e6, B:78:0x02be, B:80:0x02f3, B:92:0x0311, B:93:0x0319, B:94:0x0329, B:96:0x0333, B:97:0x033a, B:98:0x034c, B:99:0x0360, B:100:0x0395, B:101:0x03e0), top: B:2:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0228 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x002b, B:6:0x0051, B:7:0x0068, B:9:0x0070, B:10:0x0083, B:13:0x00bb, B:15:0x00c1, B:17:0x00cb, B:18:0x00dd, B:20:0x00e3, B:22:0x00ed, B:34:0x0105, B:35:0x0217, B:36:0x010d, B:37:0x011d, B:39:0x0127, B:40:0x012e, B:41:0x0140, B:42:0x0154, B:44:0x0190, B:46:0x01a3, B:47:0x01a6, B:48:0x01f1, B:49:0x0222, B:51:0x0228, B:53:0x0232, B:54:0x023f, B:56:0x0247, B:58:0x0251, B:59:0x026e, B:61:0x0276, B:63:0x0282, B:64:0x028f, B:66:0x0297, B:68:0x02a3, B:70:0x02b1, B:71:0x02b4, B:73:0x03e6, B:78:0x02be, B:80:0x02f3, B:92:0x0311, B:93:0x0319, B:94:0x0329, B:96:0x0333, B:97:0x033a, B:98:0x034c, B:99:0x0360, B:100:0x0395, B:101:0x03e0), top: B:2:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0247 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x002b, B:6:0x0051, B:7:0x0068, B:9:0x0070, B:10:0x0083, B:13:0x00bb, B:15:0x00c1, B:17:0x00cb, B:18:0x00dd, B:20:0x00e3, B:22:0x00ed, B:34:0x0105, B:35:0x0217, B:36:0x010d, B:37:0x011d, B:39:0x0127, B:40:0x012e, B:41:0x0140, B:42:0x0154, B:44:0x0190, B:46:0x01a3, B:47:0x01a6, B:48:0x01f1, B:49:0x0222, B:51:0x0228, B:53:0x0232, B:54:0x023f, B:56:0x0247, B:58:0x0251, B:59:0x026e, B:61:0x0276, B:63:0x0282, B:64:0x028f, B:66:0x0297, B:68:0x02a3, B:70:0x02b1, B:71:0x02b4, B:73:0x03e6, B:78:0x02be, B:80:0x02f3, B:92:0x0311, B:93:0x0319, B:94:0x0329, B:96:0x0333, B:97:0x033a, B:98:0x034c, B:99:0x0360, B:100:0x0395, B:101:0x03e0), top: B:2:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0276 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x002b, B:6:0x0051, B:7:0x0068, B:9:0x0070, B:10:0x0083, B:13:0x00bb, B:15:0x00c1, B:17:0x00cb, B:18:0x00dd, B:20:0x00e3, B:22:0x00ed, B:34:0x0105, B:35:0x0217, B:36:0x010d, B:37:0x011d, B:39:0x0127, B:40:0x012e, B:41:0x0140, B:42:0x0154, B:44:0x0190, B:46:0x01a3, B:47:0x01a6, B:48:0x01f1, B:49:0x0222, B:51:0x0228, B:53:0x0232, B:54:0x023f, B:56:0x0247, B:58:0x0251, B:59:0x026e, B:61:0x0276, B:63:0x0282, B:64:0x028f, B:66:0x0297, B:68:0x02a3, B:70:0x02b1, B:71:0x02b4, B:73:0x03e6, B:78:0x02be, B:80:0x02f3, B:92:0x0311, B:93:0x0319, B:94:0x0329, B:96:0x0333, B:97:0x033a, B:98:0x034c, B:99:0x0360, B:100:0x0395, B:101:0x03e0), top: B:2:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0297 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x002b, B:6:0x0051, B:7:0x0068, B:9:0x0070, B:10:0x0083, B:13:0x00bb, B:15:0x00c1, B:17:0x00cb, B:18:0x00dd, B:20:0x00e3, B:22:0x00ed, B:34:0x0105, B:35:0x0217, B:36:0x010d, B:37:0x011d, B:39:0x0127, B:40:0x012e, B:41:0x0140, B:42:0x0154, B:44:0x0190, B:46:0x01a3, B:47:0x01a6, B:48:0x01f1, B:49:0x0222, B:51:0x0228, B:53:0x0232, B:54:0x023f, B:56:0x0247, B:58:0x0251, B:59:0x026e, B:61:0x0276, B:63:0x0282, B:64:0x028f, B:66:0x0297, B:68:0x02a3, B:70:0x02b1, B:71:0x02b4, B:73:0x03e6, B:78:0x02be, B:80:0x02f3, B:92:0x0311, B:93:0x0319, B:94:0x0329, B:96:0x0333, B:97:0x033a, B:98:0x034c, B:99:0x0360, B:100:0x0395, B:101:0x03e0), top: B:2:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7904b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        String str2;
        String str3;
        this.f42730b = -14540254;
        this.f42735g = 0;
        this.f42744p = "";
        this.f42746r = 0;
        this.f42752x = 1;
        this.f42753y = "";
        this.f42725M = 0;
        this.f42726N = false;
        this.f42727O = null;
        try {
            this.f42715C = jSONObject.optString("id");
            this.f42717E = jSONObject.optLong("createTime");
            this.f42718F = jSONObject.optLong("editTime");
            JSONObject optJSONObject = jSONObject.optJSONObject("creator");
            if (optJSONObject != null) {
                this.f42719G = new InviteContactProfile(optJSONObject.optString("uid"), optJSONObject.optString("avt"), optJSONObject.optString("dpn"));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("editor");
            if (optJSONObject2 != null) {
                this.f42720H = new InviteContactProfile(optJSONObject2.optString("uid"), optJSONObject2.optString("avt"), optJSONObject2.optString("dpn"));
            }
            this.f42730b = jSONObject.optInt("color");
            this.f42721I = jSONObject.optInt("hideWhenExpire", 0);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("properties");
            if (optJSONObject3 != null) {
                if (optJSONObject3.has("6")) {
                    String optString = optJSONObject3.optString("6");
                    if (!TextUtils.isEmpty(optString)) {
                        str3 = "repeatRule";
                        this.f42729a = new JSONObject(optString).optInt("topicType");
                        if (optJSONObject3.has("0")) {
                            String optString2 = optJSONObject3.optString("0");
                            if (!TextUtils.isEmpty(optString2)) {
                                JSONObject jSONObject3 = new JSONObject(optString2);
                                int i11 = this.f42729a;
                                if (i11 == 0) {
                                    this.f42736h = jSONObject3.optString("title");
                                    String optString3 = jSONObject3.optString("client_msg_id");
                                    String optString4 = jSONObject3.optString("global_msg_id");
                                    this.f42751w = jSONObject3.optString("senderName");
                                    String optString5 = jSONObject3.optString("senderUid");
                                    this.f42750v = optString5;
                                    this.f42747s = MessageId.m41038e(optString3, optString4, str, optString5);
                                    this.f42749u = jSONObject3.optString("extra");
                                } else if (i11 == 1) {
                                    this.f42736h = jSONObject3.optString("title");
                                    this.f42737i = jSONObject3.optString("thumb");
                                    this.f42739k = jSONObject3.optString("src");
                                    this.f42738j = jSONObject3.optString("href");
                                    this.f42740l = jSONObject3.optString("redirect_url");
                                    this.f42741m = jSONObject3.optString("streamUrl");
                                    this.f42742n = jSONObject3.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                    this.f42743o = jSONObject3.optString("artist");
                                    this.f42745q = jSONObject3.optString("stream_icon");
                                    this.f42716D = jSONObject3.optString("linkCaption");
                                } else if (i11 == 2) {
                                    this.f42736h = jSONObject3.optString("title");
                                    this.f42737i = jSONObject3.optString("thumb");
                                    this.f42746r = jSONObject3.optInt("msg_type");
                                    String optString6 = jSONObject3.optString("client_msg_id");
                                    String optString7 = jSONObject3.optString("global_msg_id");
                                    this.f42749u = jSONObject3.optString("extra");
                                    this.f42751w = jSONObject3.optString("senderName");
                                    String optString8 = jSONObject3.optString("senderUid");
                                    this.f42750v = optString8;
                                    this.f42747s = MessageId.m41038e(optString6, optString7, str, optString8);
                                    if (!TextUtils.isEmpty(this.f42749u)) {
                                        String optString9 = new JSONObject(this.f42749u).optString("thumbWebpUrl", "");
                                        if (!TextUtils.isEmpty(optString9)) {
                                            this.f42737i = optString9;
                                        }
                                    }
                                } else if (i11 == 3) {
                                    this.f42722J = jSONObject3.optString("pollId");
                                    this.f42736h = jSONObject3.optString("title");
                                    this.f42731c = "📊";
                                } else if (i11 == 4) {
                                    this.f42736h = jSONObject3.optString("title");
                                    if (this.f42724L == null) {
                                        this.f42724L = new a();
                                    }
                                    this.f42724L.f42756b = jSONObject3.optString("eventId");
                                    this.f42749u = jSONObject3.optString("extra");
                                } else if (i11 != 5) {
                                    this.f42736h = jSONObject3.optString("title");
                                } else {
                                    this.f42736h = jSONObject3.optString("title");
                                    this.f42714B = jSONObject3.optLong("albumId");
                                }
                                this.f42744p = jSONObject3.optString("convertible", "");
                                m40763a();
                            }
                        }
                        if (optJSONObject3.has("1")) {
                            String optString10 = optJSONObject3.optString("1");
                            if (!TextUtils.isEmpty(optString10)) {
                                this.f42734f = new JSONObject(optString10).optString(str3);
                            }
                        }
                        if (optJSONObject3.has("3")) {
                            String optString11 = optJSONObject3.optString("3");
                            if (!TextUtils.isEmpty(optString11)) {
                                JSONObject jSONObject4 = new JSONObject(optString11);
                                this.f42735g = jSONObject4.optInt("calendarType");
                                this.f42732d = jSONObject4.optLong("startTime");
                                this.f42725M = jSONObject4.optInt("allDay");
                            }
                        }
                        if (optJSONObject3.has("4")) {
                            String optString12 = optJSONObject3.optString("4");
                            if (!TextUtils.isEmpty(optString12)) {
                                this.f42731c = new JSONObject(optString12).optString("emoji");
                            }
                        }
                        if (optJSONObject3.has("7")) {
                            String optString13 = optJSONObject3.optString("7");
                            if (!TextUtils.isEmpty(optString13)) {
                                a aVar = new a(new JSONObject(optString13));
                                a aVar2 = this.f42724L;
                                if (aVar2 == null) {
                                    this.f42724L = aVar;
                                } else {
                                    aVar2.f42755a = aVar.f42755a;
                                }
                            }
                        }
                        jSONObject2 = jSONObject;
                        str2 = "";
                    }
                }
                str3 = "repeatRule";
                if (optJSONObject3.has("0")) {
                }
                if (optJSONObject3.has("1")) {
                }
                if (optJSONObject3.has("3")) {
                }
                if (optJSONObject3.has("4")) {
                }
                if (optJSONObject3.has("7")) {
                }
                jSONObject2 = jSONObject;
                str2 = "";
            } else {
                jSONObject2 = jSONObject;
                str2 = "";
                this.f42729a = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                this.f42731c = jSONObject2.optString("emoji");
                this.f42732d = jSONObject2.optLong("startTime");
                this.f42735g = jSONObject2.optInt("calendarType");
                this.f42734f = jSONObject2.optString("repeatRule");
                if (jSONObject2.has("params")) {
                    JSONObject jSONObject5 = new JSONObject(jSONObject2.optString("params"));
                    int i12 = this.f42729a;
                    if (i12 == 0) {
                        this.f42736h = jSONObject5.optString("title");
                    } else if (i12 == 1) {
                        this.f42736h = jSONObject5.optString("title");
                        this.f42737i = jSONObject5.optString("thumb");
                        this.f42739k = jSONObject5.optString("src");
                        this.f42738j = jSONObject5.optString("href");
                        this.f42740l = jSONObject5.optString("redirect_url");
                        this.f42741m = jSONObject5.optString("streamUrl");
                        this.f42742n = jSONObject5.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                        this.f42743o = jSONObject5.optString("artist");
                        this.f42745q = jSONObject5.optString("stream_icon");
                        this.f42716D = jSONObject5.optString("linkCaption");
                    } else if (i12 == 2) {
                        this.f42736h = jSONObject5.optString("title");
                        this.f42737i = jSONObject5.optString("thumb");
                        this.f42746r = jSONObject5.optInt("msg_type");
                        String optString14 = jSONObject5.optString("client_msg_id");
                        String optString15 = jSONObject5.optString("global_msg_id");
                        this.f42749u = jSONObject5.optString("extra");
                        this.f42751w = jSONObject5.optString("senderName");
                        String optString16 = jSONObject5.optString("senderUid");
                        this.f42750v = optString16;
                        this.f42747s = MessageId.m41038e(optString14, optString15, str, optString16);
                    } else if (i12 == 3) {
                        this.f42722J = jSONObject5.optString("pollId");
                        this.f42736h = jSONObject5.optString("title");
                        this.f42731c = "📊";
                    } else if (i12 == 4) {
                        this.f42736h = jSONObject5.optString("title");
                        if (this.f42724L == null) {
                            this.f42724L = new a();
                        }
                        this.f42724L.f42756b = jSONObject5.optString("eventId");
                        this.f42749u = jSONObject5.optString("extra");
                    } else if (i12 != 5) {
                        this.f42736h = jSONObject5.optString("title");
                    } else {
                        this.f42736h = jSONObject5.optString("title");
                        this.f42714B = jSONObject5.optLong("albumId");
                    }
                }
            }
            m40775m();
            this.f42744p = jSONObject2.optString("convertible", str2);
            m40763a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C7904b(C17945a0 c17945a0) {
        String str;
        C25630b m95397g;
        C24280f m95742G;
        this.f42735g = 0;
        str = "";
        this.f42744p = "";
        this.f42746r = 0;
        this.f42752x = 1;
        this.f42753y = "";
        this.f42725M = 0;
        this.f42726N = false;
        this.f42727O = null;
        try {
            this.f42729a = 2;
            this.f42731c = "📎";
            this.f42730b = -14540254;
            this.f42732d = -1L;
            this.f42747s = c17945a0.m95029V3();
            String m94854B4 = c17945a0.m94854B4();
            this.f42751w = m94854B4;
            if (TextUtils.isEmpty(m94854B4)) {
                this.f42751w = AbstractC23304d.f113368c0.f42437s;
            }
            this.f42750v = c17945a0.m94862C4();
            int m95041W4 = c17945a0.m95041W4();
            if (m95041W4 == 0) {
                this.f42746r = 1;
                this.f42731c = "📌";
                this.f42736h = c17945a0.m95019U3();
                if (c17945a0.m95011T3() != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mentions", c17945a0.m95011T3().m40862m());
                    this.f42749u = jSONObject.toString();
                }
            } else if (m95041W4 == 6) {
                this.f42746r = 31;
            } else if (m95041W4 == 10) {
                this.f42746r = 36;
                if ((c17945a0.m94929K2() instanceof C17949b1) && (m95397g = ((C17949b1) c17945a0.m94929K2()).m95397g()) != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, m95397g.m132434l());
                        jSONObject2.put("id", m95397g.m132429g());
                        jSONObject2.put("catId", m95397g.m132427f());
                        this.f42749u = jSONObject2.toString();
                        this.f42737i = C25630b.m132391I(m95397g) ? m95397g.m132444v() : "";
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } else if (m95041W4 == 12) {
                this.f42746r = 38;
                this.f42731c = "🔗";
                C17969i0 m94929K2 = c17945a0.m94929K2();
                this.f42736h = c17945a0.m94929K2().f91011p;
                if (c17945a0.m95026V0()) {
                    this.f42737i = c17945a0.m94929K2().f91013r;
                    this.f42748t = c17945a0.m94983Q3();
                }
                JSONObject jSONObject3 = new JSONObject();
                String str2 = c17945a0.m94929K2().f91016u;
                jSONObject3.put("action", str2);
                if (TextUtils.equals("recommened.link", str2)) {
                    if (m94929K2 instanceof C18013y0) {
                        C18013y0 c18013y0 = (C18013y0) m94929K2;
                        String str3 = m94929K2.f91011p;
                        String m95796i = c18013y0.m95796i();
                        if (!TextUtils.isEmpty(str3)) {
                            this.f42736h = str3;
                            if (c17945a0.m95011T3() != null) {
                                jSONObject3.put("mentions", c17945a0.m95011T3().m40862m());
                            }
                        } else if (!TextUtils.isEmpty(m95796i)) {
                            this.f42736h = m95796i;
                        }
                        C32098s c32098s = c18013y0.f91251B;
                        if (c32098s != null) {
                            if (TextUtils.isEmpty(c32098s.f147969s) && !TextUtils.isEmpty(c18013y0.f91014s)) {
                                c18013y0.f91251B.f147969s = c18013y0.f91014s;
                            }
                            jSONObject3.put("params", c18013y0.f91251B.m154935e());
                        }
                    }
                } else if (TextUtils.equals("recommened.user", str2) || TextUtils.equals("recommened.vip", str2)) {
                    jSONObject3.put("dpn", m94929K2.f91011p);
                    jSONObject3.put("uid", m94929K2.f91017v);
                }
                this.f42749u = jSONObject3.toString();
            } else if (m95041W4 == 31) {
                this.f42746r = 32;
                C17969i0 m94929K22 = c17945a0.m94929K2();
                if (!TextUtils.isEmpty(this.f42737i)) {
                    this.f42737i = m94929K22.f91013r;
                } else {
                    this.f42737i = m94929K22.f91014s;
                }
                JSONObject jSONObject4 = new JSONObject();
                if ((m94929K22 instanceof C18009w0) && (m95742G = ((C18009w0) m94929K22).m95742G()) != null) {
                    jSONObject4.put("webpUrl", m95742G.f117261a);
                    jSONObject4.put("thumbWebpUrl", m95742G.f117264d);
                }
                this.f42749u = jSONObject4.toString();
            } else if (m95041W4 == 2) {
                this.f42746r = 37;
                this.f42737i = c17945a0.m94929K2().f91014s;
            } else if (m95041W4 == 3 || m95041W4 == 4) {
                this.f42746r = 32;
                this.f42731c = "🖼️";
                C17969i0 m94929K23 = c17945a0.m94929K2();
                this.f42736h = m94929K23.f91011p;
                if (!TextUtils.isEmpty(this.f42737i)) {
                    this.f42737i = m94929K23.f91013r;
                } else {
                    this.f42737i = m94929K23.f91014s;
                }
                if (c17945a0.m95011T3() != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("mentions", c17945a0.m95011T3().m40862m());
                    this.f42749u = jSONObject5.toString();
                }
                this.f42748t = c17945a0.m94983Q3();
                this.f42744p = AbstractC23008a2.m117934c(m94929K23);
                m40763a();
            } else if (m95041W4 == 18) {
                this.f42746r = 43;
                this.f42731c = "📍";
                if (!TextUtils.isEmpty(c17945a0.m94929K2().f91011p)) {
                    this.f42736h = c17945a0.m94929K2().f91011p;
                } else {
                    this.f42736h = c17945a0.m94929K2().f91015t;
                }
            } else if (m95041W4 != 19) {
                switch (m95041W4) {
                    case 22:
                        this.f42746r = 46;
                        this.f42736h = c17945a0.m94929K2().f91011p;
                        this.f42749u = c17945a0.m94929K2().f91017v;
                        this.f42748t = c17945a0.m95266u2();
                        break;
                    case 23:
                        this.f42746r = 49;
                        this.f42731c = "🖼️";
                        this.f42737i = c17945a0.m94929K2().f91013r;
                        break;
                    case 24:
                        this.f42746r = 52;
                        if (c17945a0.m94929K2() instanceof C17967h1) {
                            C17967h1 c17967h1 = (C17967h1) c17945a0.m94929K2();
                            this.f42736h = c17967h1.m95579j();
                            this.f42749u = c17967h1.f90987M.toString();
                            break;
                        }
                        break;
                }
            } else {
                this.f42746r = 44;
                this.f42731c = "🎥";
                if (c17945a0.m94929K2().f91011p != null) {
                    str = c17945a0.m94929K2().f91011p;
                }
                this.f42736h = str;
                this.f42737i = c17945a0.m94929K2().f91013r;
                if (c17945a0.m95288w8()) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("msgBubbleLayoutType", ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                    this.f42749u = jSONObject6.toString();
                }
                this.f42748t = c17945a0.m95266u2();
            }
            m40775m();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
