package p009a3;

import android.os.Bundle;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p029b3.C2503a;
import p029b3.C2504b;
import p223i.AbstractC20170a;

/* renamed from: a3.c */
/* loaded from: classes2.dex */
public final class C0098c extends AbstractC20170a {

    /* renamed from: A */
    public String f466A;

    /* renamed from: A0 */
    public boolean f467A0;

    /* renamed from: B */
    public String f468B;

    /* renamed from: B0 */
    public String f469B0;

    /* renamed from: C */
    public String f470C;

    /* renamed from: C0 */
    public String f471C0;

    /* renamed from: D */
    public String f472D;

    /* renamed from: E */
    public String f473E;

    /* renamed from: F */
    public String f474F;

    /* renamed from: G */
    public String f475G;

    /* renamed from: H */
    public String f476H;

    /* renamed from: I */
    public String f477I;

    /* renamed from: J */
    public String f478J;

    /* renamed from: K */
    public String f479K;

    /* renamed from: L */
    public String f480L;

    /* renamed from: M */
    public String f481M;

    /* renamed from: N */
    public String f482N;

    /* renamed from: O */
    public ArrayList f483O;

    /* renamed from: P */
    public ArrayList f484P;

    /* renamed from: Q */
    public ArrayList f485Q;

    /* renamed from: R */
    public ArrayList f486R;

    /* renamed from: S */
    public ArrayList f487S;

    /* renamed from: T */
    public ArrayList f488T;

    /* renamed from: U */
    public ArrayList f489U;

    /* renamed from: V */
    public ArrayList f490V;

    /* renamed from: W */
    public String f491W;

    /* renamed from: X */
    public String f492X;

    /* renamed from: Y */
    public String f493Y;

    /* renamed from: Z */
    public C2504b f494Z;

    /* renamed from: a */
    public String f495a;

    /* renamed from: a0 */
    public String f496a0;

    /* renamed from: b */
    public String f497b;

    /* renamed from: b0 */
    public C2503a f498b0;

    /* renamed from: c */
    public String f499c;

    /* renamed from: c0 */
    public boolean f500c0;

    /* renamed from: d */
    public String f501d;

    /* renamed from: d0 */
    public boolean f502d0;

    /* renamed from: e */
    public String f503e;

    /* renamed from: e0 */
    public boolean f504e0;

    /* renamed from: f */
    public String f505f;

    /* renamed from: f0 */
    public long f506f0;

    /* renamed from: g */
    public String f507g;

    /* renamed from: g0 */
    public String f508g0;

    /* renamed from: h */
    public String f509h;

    /* renamed from: h0 */
    public boolean f510h0;

    /* renamed from: i */
    public String f511i;

    /* renamed from: i0 */
    public String f512i0;

    /* renamed from: j */
    public String f513j;

    /* renamed from: j0 */
    public String f514j0;

    /* renamed from: k */
    public String f515k;

    /* renamed from: k0 */
    public String f516k0;

    /* renamed from: l */
    public String f517l;

    /* renamed from: l0 */
    public String f518l0;

    /* renamed from: m */
    public String f519m;

    /* renamed from: m0 */
    public String f520m0;

    /* renamed from: n */
    public String f521n;

    /* renamed from: n0 */
    public boolean f522n0;

    /* renamed from: o */
    public ArrayList f523o;

    /* renamed from: o0 */
    public boolean f524o0;

    /* renamed from: p */
    public float f525p;

    /* renamed from: p0 */
    public String f526p0;

    /* renamed from: q */
    public String f527q;

    /* renamed from: q0 */
    public int f528q0;

    /* renamed from: r */
    public String f529r;

    /* renamed from: r0 */
    public String f530r0;

    /* renamed from: s */
    public String f531s;

    /* renamed from: s0 */
    public String f532s0;

    /* renamed from: t */
    public String f533t;

    /* renamed from: t0 */
    public String f534t0;

    /* renamed from: u */
    public String f535u;

    /* renamed from: u0 */
    public String f536u0;

    /* renamed from: v */
    public String f537v;

    /* renamed from: v0 */
    public String f538v0;

    /* renamed from: w */
    public long f539w;

    /* renamed from: w0 */
    public boolean f540w0;

    /* renamed from: x */
    public long f541x;

    /* renamed from: x0 */
    public String f542x0;

    /* renamed from: y */
    public String f543y;

    /* renamed from: y0 */
    public Bundle f544y0;

    /* renamed from: z */
    public String f545z;

    /* renamed from: z0 */
    public boolean f546z0;

    /* renamed from: c */
    public static int m440c(double d11) {
        int i11 = (int) ((d11 * 100.0d) / 5.0d);
        if (i11 > 100) {
            return 100;
        }
        return i11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:18|(21:20|21|(17:23|(1:157)(3:27|(2:30|28)|31)|32|(1:156)(3:36|(2:39|37)|40)|41|(1:155)(3:45|(2:48|46)|49)|50|(1:154)(3:54|(2:57|55)|58)|59|(1:153)(3:63|(2:66|64)|67)|68|(1:152)(3:72|(2:75|73)|76)|77|(1:151)(3:81|(2:84|82)|85)|86|(3:90|(2:93|91)|94)|95)(1:158)|96|(5:98|(1:100)(1:149)|101|(1:103)(1:148)|104)(1:150)|105|(2:107|(17:109|(2:112|110)|113|114|115|117|118|(3:139|140|(1:142)(9:143|121|122|123|(1:125)|126|(1:131)|133|134))|120|121|122|123|(0)|126|(2:129|131)|133|134)(1:145))(1:147)|146|115|117|118|(0)|120|121|122|123|(0)|126|(0)|133|134)|159|21|(0)(0)|96|(0)(0)|105|(0)(0)|146|115|117|118|(0)|120|121|122|123|(0)|126|(0)|133|134) */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04be A[Catch: Exception -> 0x067c, TryCatch #0 {Exception -> 0x067c, blocks: (B:6:0x000a, B:8:0x006b, B:11:0x0074, B:13:0x007a, B:15:0x008a, B:18:0x0104, B:21:0x012f, B:23:0x01c4, B:25:0x0231, B:28:0x023c, B:30:0x0242, B:32:0x0254, B:34:0x0261, B:37:0x026a, B:39:0x0270, B:41:0x0280, B:43:0x028d, B:46:0x0296, B:48:0x029c, B:50:0x02ac, B:52:0x02b9, B:55:0x02c2, B:57:0x02c8, B:59:0x02d8, B:61:0x02e5, B:64:0x02ee, B:66:0x02f4, B:68:0x0304, B:70:0x0311, B:73:0x031a, B:75:0x0320, B:77:0x0330, B:79:0x033d, B:82:0x0346, B:84:0x034c, B:86:0x035c, B:88:0x0369, B:91:0x0370, B:93:0x0376, B:96:0x03d8, B:98:0x03e2, B:100:0x041e, B:101:0x043b, B:103:0x0443, B:104:0x0475, B:105:0x04b6, B:107:0x04be, B:109:0x04cd, B:110:0x04d6, B:112:0x04dc, B:114:0x04f4, B:115:0x0521, B:160:0x010c, B:162:0x0114, B:164:0x011a, B:166:0x0122), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0612 A[Catch: Exception -> 0x067a, TryCatch #1 {Exception -> 0x067a, blocks: (B:118:0x0526, B:123:0x0570, B:125:0x0612, B:126:0x0618, B:129:0x0670, B:131:0x0676, B:138:0x056c, B:140:0x0558, B:143:0x055f, B:121:0x0567), top: B:117:0x0526, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x066e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0558 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c4 A[Catch: Exception -> 0x067c, TryCatch #0 {Exception -> 0x067c, blocks: (B:6:0x000a, B:8:0x006b, B:11:0x0074, B:13:0x007a, B:15:0x008a, B:18:0x0104, B:21:0x012f, B:23:0x01c4, B:25:0x0231, B:28:0x023c, B:30:0x0242, B:32:0x0254, B:34:0x0261, B:37:0x026a, B:39:0x0270, B:41:0x0280, B:43:0x028d, B:46:0x0296, B:48:0x029c, B:50:0x02ac, B:52:0x02b9, B:55:0x02c2, B:57:0x02c8, B:59:0x02d8, B:61:0x02e5, B:64:0x02ee, B:66:0x02f4, B:68:0x0304, B:70:0x0311, B:73:0x031a, B:75:0x0320, B:77:0x0330, B:79:0x033d, B:82:0x0346, B:84:0x034c, B:86:0x035c, B:88:0x0369, B:91:0x0370, B:93:0x0376, B:96:0x03d8, B:98:0x03e2, B:100:0x041e, B:101:0x043b, B:103:0x0443, B:104:0x0475, B:105:0x04b6, B:107:0x04be, B:109:0x04cd, B:110:0x04d6, B:112:0x04dc, B:114:0x04f4, B:115:0x0521, B:160:0x010c, B:162:0x0114, B:164:0x011a, B:166:0x0122), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e2 A[Catch: Exception -> 0x067c, TryCatch #0 {Exception -> 0x067c, blocks: (B:6:0x000a, B:8:0x006b, B:11:0x0074, B:13:0x007a, B:15:0x008a, B:18:0x0104, B:21:0x012f, B:23:0x01c4, B:25:0x0231, B:28:0x023c, B:30:0x0242, B:32:0x0254, B:34:0x0261, B:37:0x026a, B:39:0x0270, B:41:0x0280, B:43:0x028d, B:46:0x0296, B:48:0x029c, B:50:0x02ac, B:52:0x02b9, B:55:0x02c2, B:57:0x02c8, B:59:0x02d8, B:61:0x02e5, B:64:0x02ee, B:66:0x02f4, B:68:0x0304, B:70:0x0311, B:73:0x031a, B:75:0x0320, B:77:0x0330, B:79:0x033d, B:82:0x0346, B:84:0x034c, B:86:0x035c, B:88:0x0369, B:91:0x0370, B:93:0x0376, B:96:0x03d8, B:98:0x03e2, B:100:0x041e, B:101:0x043b, B:103:0x0443, B:104:0x0475, B:105:0x04b6, B:107:0x04be, B:109:0x04cd, B:110:0x04d6, B:112:0x04dc, B:114:0x04f4, B:115:0x0521, B:160:0x010c, B:162:0x0114, B:164:0x011a, B:166:0x0122), top: B:5:0x000a }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0098c m441d(String str, JSONObject jSONObject) {
        String str2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        JSONObject optJSONObject3;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        boolean z11;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        boolean z12;
        int i11;
        JSONObject optJSONObject4;
        String str30;
        String str31;
        String str32;
        Bundle bundle;
        float parseFloat;
        int i12;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        boolean z13;
        String str39;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("id");
                String optString2 = jSONObject.optString("title");
                String optString3 = jSONObject.optString("displayInfo");
                String optString4 = jSONObject.optString("action");
                String optString5 = jSONObject.optString("actionType");
                String optString6 = jSONObject.optString("clickTo");
                String optString7 = jSONObject.optString("actionTo");
                String optString8 = jSONObject.optString("tokenId");
                String optString9 = jSONObject.optString("jumpTarget");
                String optString10 = jSONObject.optString("logoBannerFile");
                String optString11 = jSONObject.optString("portraitCoverUrl");
                String optString12 = jSONObject.optString("landscapeCoverUrl");
                String optString13 = jSONObject.optString("thumbBannerFile");
                ArrayList arrayList15 = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("expandBanner");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    str2 = optString9;
                } else {
                    str2 = optString9;
                    for (int i13 = 0; i13 < optJSONArray.length(); i13++) {
                        arrayList15.add(optJSONArray.get(i13).toString());
                    }
                }
                String optString14 = jSONObject.optString("rating");
                String optString15 = jSONObject.optString("promotion");
                String optString16 = jSONObject.optString("appName");
                String optString17 = jSONObject.optString("appCaption");
                String optString18 = jSONObject.optString("appDescription");
                String optString19 = jSONObject.optString("contextString");
                String optString20 = jSONObject.optString("kind");
                long optLong = jSONObject.optLong("adTime");
                long currentTimeMillis = System.currentTimeMillis() + jSONObject.optLong("adExpired");
                String optString21 = jSONObject.optString("appStore");
                String optString22 = jSONObject.optString("adPackage");
                String optString23 = jSONObject.optString("vastLink");
                String optString24 = jSONObject.optString("daastLink");
                if (optString20.equals("audio")) {
                    if (optString24.equals("")) {
                        optString24 = optString23;
                        boolean optBoolean = jSONObject.optBoolean("mute", false);
                        boolean optBoolean2 = jSONObject.optBoolean("autoPlay", false);
                        boolean optBoolean3 = jSONObject.optBoolean("allowSkip", false);
                        String str40 = optString23;
                        long optLong2 = jSONObject.optLong("skipAfter", 0L);
                        String optString25 = jSONObject.optString("videoMode");
                        boolean optBoolean4 = jSONObject.optBoolean("appFlyer");
                        String optString26 = jSONObject.optString("contentScheme");
                        optJSONObject = jSONObject.optJSONObject("metaData");
                        String optString27 = jSONObject.optString("excludeOr");
                        String optString28 = jSONObject.optString("excludeAnd");
                        String optString29 = jSONObject.optString("includeOr");
                        String optString30 = jSONObject.optString("includeAnd");
                        String str41 = optString24;
                        boolean optBoolean5 = jSONObject.optBoolean("clickable", true);
                        boolean optBoolean6 = jSONObject.optBoolean("isAdtimaVideo", true);
                        boolean optBoolean7 = jSONObject.optBoolean("isAdBackup", false);
                        String optString31 = jSONObject.optString("zipAdKind");
                        String optString32 = jSONObject.optString("imgFormat");
                        optJSONObject2 = jSONObject.optJSONObject("tracking");
                        if (optJSONObject2 == null) {
                            str3 = optString31;
                            String optString33 = optJSONObject2.optString("request");
                            String optString34 = optJSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                            String optString35 = optJSONObject2.optString("nonServing");
                            String optString36 = optJSONObject2.optString("activeView");
                            String optString37 = optJSONObject2.optString(ZinstantMetaConstant.IMPRESSION_META_NAME);
                            String optString38 = optJSONObject2.optString("click");
                            String optString39 = optJSONObject2.optString("action");
                            String optString40 = optJSONObject2.optString("conversion");
                            String optString41 = optJSONObject2.optString("feedback");
                            String optString42 = optJSONObject2.optString("bidClient");
                            String optString43 = optJSONObject2.optString("performance");
                            String optString44 = optJSONObject2.optString("viewableImp");
                            ArrayList arrayList16 = new ArrayList();
                            JSONArray optJSONArray2 = optJSONObject2.optJSONArray("creativeView");
                            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                                str4 = optString30;
                                str5 = optString29;
                            } else {
                                str4 = optString30;
                                str5 = optString29;
                                for (int i14 = 0; i14 < optJSONArray2.length(); i14++) {
                                    arrayList16.add(optJSONArray2.get(i14).toString());
                                }
                            }
                            ArrayList arrayList17 = new ArrayList();
                            JSONArray optJSONArray3 = optJSONObject2.optJSONArray("firstQuatile");
                            if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                                arrayList9 = arrayList16;
                            } else {
                                arrayList9 = arrayList16;
                                for (int i15 = 0; i15 < optJSONArray3.length(); i15++) {
                                    arrayList17.add(optJSONArray3.get(i15).toString());
                                }
                            }
                            ArrayList arrayList18 = new ArrayList();
                            JSONArray optJSONArray4 = optJSONObject2.optJSONArray("midpoint");
                            if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                                arrayList10 = arrayList17;
                            } else {
                                arrayList10 = arrayList17;
                                for (int i16 = 0; i16 < optJSONArray4.length(); i16++) {
                                    arrayList18.add(optJSONArray4.get(i16).toString());
                                }
                            }
                            ArrayList arrayList19 = new ArrayList();
                            JSONArray optJSONArray5 = optJSONObject2.optJSONArray("thirdQuatile");
                            if (optJSONArray5 == null || optJSONArray5.length() <= 0) {
                                arrayList11 = arrayList18;
                            } else {
                                arrayList11 = arrayList18;
                                for (int i17 = 0; i17 < optJSONArray5.length(); i17++) {
                                    arrayList19.add(optJSONArray5.get(i17).toString());
                                }
                            }
                            ArrayList arrayList20 = new ArrayList();
                            JSONArray optJSONArray6 = optJSONObject2.optJSONArray("complete");
                            if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                                arrayList12 = arrayList19;
                            } else {
                                arrayList12 = arrayList19;
                                for (int i18 = 0; i18 < optJSONArray6.length(); i18++) {
                                    arrayList20.add(optJSONArray6.get(i18).toString());
                                }
                            }
                            ArrayList arrayList21 = new ArrayList();
                            JSONArray optJSONArray7 = optJSONObject2.optJSONArray("progress");
                            if (optJSONArray7 == null || optJSONArray7.length() <= 0) {
                                arrayList13 = arrayList20;
                            } else {
                                arrayList13 = arrayList20;
                                for (int i19 = 0; i19 < optJSONArray7.length(); i19++) {
                                    arrayList21.add(optJSONArray7.get(i19).toString());
                                }
                            }
                            ArrayList arrayList22 = new ArrayList();
                            JSONArray optJSONArray8 = optJSONObject2.optJSONArray("thirdpartyImpression");
                            if (optJSONArray8 == null || optJSONArray8.length() <= 0) {
                                arrayList14 = arrayList21;
                            } else {
                                arrayList14 = arrayList21;
                                for (int i21 = 0; i21 < optJSONArray8.length(); i21++) {
                                    arrayList22.add(optJSONArray8.get(i21).toString());
                                }
                            }
                            ArrayList arrayList23 = new ArrayList();
                            JSONArray optJSONArray9 = optJSONObject2.optJSONArray("thirdpartyClick");
                            if (optJSONArray9 != null && optJSONArray9.length() > 0) {
                                for (int i22 = 0; i22 < optJSONArray9.length(); i22++) {
                                    arrayList23.add(optJSONArray9.get(i22).toString());
                                }
                            }
                            arrayList8 = arrayList23;
                            str7 = optString33;
                            str8 = optString34;
                            str6 = optString35;
                            str9 = optString36;
                            str12 = optString39;
                            str13 = optString40;
                            str14 = optString41;
                            str15 = optString42;
                            str16 = optString43;
                            str17 = optString44;
                            str11 = optString38;
                            arrayList6 = arrayList9;
                            arrayList4 = arrayList11;
                            arrayList3 = arrayList12;
                            arrayList2 = arrayList13;
                            arrayList7 = arrayList14;
                            arrayList = arrayList22;
                            str10 = optString37;
                            arrayList5 = arrayList10;
                        } else {
                            str3 = optString31;
                            str4 = optString30;
                            str5 = optString29;
                            str6 = "";
                            str7 = str6;
                            str8 = str7;
                            str9 = str8;
                            str10 = str9;
                            str11 = str10;
                            str12 = str11;
                            str13 = str12;
                            str14 = str13;
                            str15 = str14;
                            str16 = str15;
                            str17 = str16;
                            arrayList = null;
                            arrayList2 = null;
                            arrayList3 = null;
                            arrayList4 = null;
                            arrayList5 = null;
                            arrayList6 = null;
                            arrayList7 = null;
                            arrayList8 = null;
                        }
                        optJSONObject3 = jSONObject.optJSONObject("ext");
                        String str42 = str9;
                        if (optJSONObject3 == null) {
                            str18 = str6;
                            String optString45 = optJSONObject3.optString("token", null);
                            String optString46 = optJSONObject3.optString("oaid", null);
                            String optString47 = optJSONObject3.optString("data", null);
                            boolean optBoolean8 = optJSONObject3.optBoolean("addClickTag", false);
                            String optString48 = optJSONObject3.optString("price", null);
                            int optInt = optJSONObject3.optInt("adTemplate", -1);
                            JSONObject optJSONObject5 = optJSONObject3.optJSONObject("preloadTarget");
                            if (optJSONObject5 != null) {
                                i12 = optInt;
                                str19 = str8;
                                String optString49 = optJSONObject5.optString("include", null);
                                str34 = optJSONObject5.optString("exclude", null);
                                str33 = optString49;
                            } else {
                                str19 = str8;
                                i12 = optInt;
                                str33 = null;
                                str34 = null;
                            }
                            JSONObject optJSONObject6 = optJSONObject3.optJSONObject("omPartner");
                            if (optJSONObject6 != null) {
                                str35 = str33;
                                str36 = str34;
                                z13 = optJSONObject6.optBoolean("omEnable", false);
                                String optString50 = optJSONObject6.optString("verificationParameters", null);
                                str39 = optJSONObject6.optString("vendorKey", null);
                                str38 = optJSONObject6.optString("verificationScriptUrl", null);
                                str37 = optString50;
                            } else {
                                str35 = str33;
                                str36 = str34;
                                str37 = null;
                                str38 = null;
                                z13 = false;
                                str39 = null;
                            }
                            String str43 = str37;
                            str29 = optJSONObject3.optString("scenario", null);
                            str28 = str38;
                            z12 = z13;
                            i11 = i12;
                            str21 = optString45;
                            str20 = optString46;
                            str22 = optString47;
                            z11 = optBoolean8;
                            str23 = optString48;
                            str24 = str35;
                            str25 = str36;
                            str26 = str43;
                            str27 = str39;
                        } else {
                            str18 = str6;
                            str19 = str8;
                            str20 = null;
                            str21 = null;
                            str22 = null;
                            str23 = null;
                            z11 = false;
                            str24 = null;
                            str25 = null;
                            str26 = null;
                            str27 = null;
                            str28 = null;
                            str29 = null;
                            z12 = false;
                            i11 = -1;
                        }
                        optJSONObject4 = jSONObject.optJSONObject("ladi_trck");
                        if (optJSONObject4 == null) {
                            str32 = str22;
                            String optString51 = optJSONObject4.optString("domain", null);
                            JSONObject optJSONObject7 = optJSONObject4.optJSONObject("cookie");
                            if (optJSONObject7 != null) {
                                Bundle bundle2 = new Bundle();
                                Iterator<String> keys = optJSONObject7.keys();
                                while (keys.hasNext()) {
                                    String str44 = str20;
                                    String next = keys.next();
                                    bundle2.putString(next, optJSONObject7.optString(next));
                                    str21 = str21;
                                    str20 = str44;
                                }
                                str30 = str20;
                                str31 = str21;
                                bundle2.putString("domain", optString51);
                                bundle2.putString("sameSite", "none");
                                bundle2.putString("partition", "none");
                                bundle2.putString("path", "/");
                                bundle2.putString("isSecure", "TRUE");
                                bundle = bundle2;
                                C0098c c0098c = new C0098c();
                                c0098c.f495a = optString;
                                c0098c.f497b = str;
                                c0098c.f499c = optString2;
                                c0098c.f501d = optString3;
                                c0098c.f503e = optString4;
                                c0098c.f505f = optString5;
                                c0098c.f507g = optString6;
                                c0098c.f509h = optString7;
                                c0098c.f511i = optString8;
                                c0098c.f513j = str2;
                                c0098c.f515k = optString10;
                                c0098c.f517l = optString11;
                                c0098c.f519m = optString12;
                                c0098c.f523o = arrayList15;
                                c0098c.f521n = optString13;
                                if (optString14 != null) {
                                    try {
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                    if (optString14.length() != 0) {
                                        parseFloat = Float.parseFloat(optString14);
                                        c0098c.f525p = parseFloat;
                                        c0098c.f527q = optString15;
                                        c0098c.f529r = optString16;
                                        c0098c.f531s = optString17;
                                        c0098c.f533t = optString18;
                                        c0098c.f535u = optString19;
                                        c0098c.f539w = optLong;
                                        c0098c.f541x = currentTimeMillis;
                                        c0098c.f491W = optString21;
                                        c0098c.f492X = optString22;
                                        c0098c.f543y = optString27;
                                        c0098c.f545z = optString28;
                                        c0098c.f466A = str5;
                                        c0098c.f468B = str4;
                                        c0098c.f470C = str7;
                                        c0098c.f472D = str19;
                                        c0098c.f473E = str18;
                                        c0098c.f474F = str42;
                                        c0098c.f475G = str10;
                                        c0098c.f476H = str11;
                                        c0098c.f477I = str12;
                                        c0098c.f478J = str13;
                                        c0098c.f479K = str14;
                                        c0098c.f480L = str15;
                                        c0098c.f481M = str16;
                                        c0098c.f482N = str17;
                                        c0098c.f483O = arrayList6;
                                        c0098c.f484P = arrayList5;
                                        c0098c.f485Q = arrayList4;
                                        c0098c.f486R = arrayList3;
                                        c0098c.f487S = arrayList2;
                                        c0098c.f488T = arrayList7;
                                        c0098c.f490V = arrayList;
                                        c0098c.f489U = arrayList8;
                                        c0098c.f493Y = str41;
                                        c0098c.f496a0 = str40;
                                        c0098c.f500c0 = optBoolean;
                                        c0098c.f502d0 = optBoolean2;
                                        c0098c.f504e0 = optBoolean3;
                                        c0098c.f506f0 = optLong2;
                                        c0098c.f508g0 = optString25;
                                        c0098c.f510h0 = optBoolean4;
                                        c0098c.f512i0 = optString26;
                                        if (optJSONObject != null) {
                                            c0098c.f514j0 = optJSONObject.toString();
                                        }
                                        c0098c.f516k0 = str31;
                                        c0098c.f518l0 = str30;
                                        c0098c.f520m0 = str32;
                                        c0098c.f522n0 = optBoolean5;
                                        c0098c.f524o0 = z11;
                                        c0098c.f546z0 = optBoolean6;
                                        c0098c.f469B0 = str3;
                                        c0098c.f471C0 = optString32;
                                        c0098c.f467A0 = optBoolean7;
                                        c0098c.f526p0 = str23;
                                        c0098c.f528q0 = i11;
                                        c0098c.f530r0 = str24;
                                        c0098c.f532s0 = str25;
                                        c0098c.f540w0 = z12;
                                        c0098c.f534t0 = str26;
                                        c0098c.f536u0 = str27;
                                        c0098c.f538v0 = str28;
                                        c0098c.f542x0 = str29;
                                        c0098c.f544y0 = bundle;
                                        c0098c.f537v = optString20;
                                        if (optString20.equals("native") && str41 != null && str41.length() != 0) {
                                            c0098c.f537v = "rich";
                                        }
                                        return c0098c;
                                    }
                                }
                                parseFloat = 0.0f;
                                c0098c.f525p = parseFloat;
                                c0098c.f527q = optString15;
                                c0098c.f529r = optString16;
                                c0098c.f531s = optString17;
                                c0098c.f533t = optString18;
                                c0098c.f535u = optString19;
                                c0098c.f539w = optLong;
                                c0098c.f541x = currentTimeMillis;
                                c0098c.f491W = optString21;
                                c0098c.f492X = optString22;
                                c0098c.f543y = optString27;
                                c0098c.f545z = optString28;
                                c0098c.f466A = str5;
                                c0098c.f468B = str4;
                                c0098c.f470C = str7;
                                c0098c.f472D = str19;
                                c0098c.f473E = str18;
                                c0098c.f474F = str42;
                                c0098c.f475G = str10;
                                c0098c.f476H = str11;
                                c0098c.f477I = str12;
                                c0098c.f478J = str13;
                                c0098c.f479K = str14;
                                c0098c.f480L = str15;
                                c0098c.f481M = str16;
                                c0098c.f482N = str17;
                                c0098c.f483O = arrayList6;
                                c0098c.f484P = arrayList5;
                                c0098c.f485Q = arrayList4;
                                c0098c.f486R = arrayList3;
                                c0098c.f487S = arrayList2;
                                c0098c.f488T = arrayList7;
                                c0098c.f490V = arrayList;
                                c0098c.f489U = arrayList8;
                                c0098c.f493Y = str41;
                                c0098c.f496a0 = str40;
                                c0098c.f500c0 = optBoolean;
                                c0098c.f502d0 = optBoolean2;
                                c0098c.f504e0 = optBoolean3;
                                c0098c.f506f0 = optLong2;
                                c0098c.f508g0 = optString25;
                                c0098c.f510h0 = optBoolean4;
                                c0098c.f512i0 = optString26;
                                if (optJSONObject != null) {
                                }
                                c0098c.f516k0 = str31;
                                c0098c.f518l0 = str30;
                                c0098c.f520m0 = str32;
                                c0098c.f522n0 = optBoolean5;
                                c0098c.f524o0 = z11;
                                c0098c.f546z0 = optBoolean6;
                                c0098c.f469B0 = str3;
                                c0098c.f471C0 = optString32;
                                c0098c.f467A0 = optBoolean7;
                                c0098c.f526p0 = str23;
                                c0098c.f528q0 = i11;
                                c0098c.f530r0 = str24;
                                c0098c.f532s0 = str25;
                                c0098c.f540w0 = z12;
                                c0098c.f534t0 = str26;
                                c0098c.f536u0 = str27;
                                c0098c.f538v0 = str28;
                                c0098c.f542x0 = str29;
                                c0098c.f544y0 = bundle;
                                c0098c.f537v = optString20;
                                if (optString20.equals("native")) {
                                    c0098c.f537v = "rich";
                                }
                                return c0098c;
                            }
                            str30 = str20;
                            str31 = str21;
                        } else {
                            str30 = str20;
                            str31 = str21;
                            str32 = str22;
                        }
                        bundle = null;
                        C0098c c0098c2 = new C0098c();
                        c0098c2.f495a = optString;
                        c0098c2.f497b = str;
                        c0098c2.f499c = optString2;
                        c0098c2.f501d = optString3;
                        c0098c2.f503e = optString4;
                        c0098c2.f505f = optString5;
                        c0098c2.f507g = optString6;
                        c0098c2.f509h = optString7;
                        c0098c2.f511i = optString8;
                        c0098c2.f513j = str2;
                        c0098c2.f515k = optString10;
                        c0098c2.f517l = optString11;
                        c0098c2.f519m = optString12;
                        c0098c2.f523o = arrayList15;
                        c0098c2.f521n = optString13;
                        if (optString14 != null) {
                        }
                        parseFloat = 0.0f;
                        c0098c2.f525p = parseFloat;
                        c0098c2.f527q = optString15;
                        c0098c2.f529r = optString16;
                        c0098c2.f531s = optString17;
                        c0098c2.f533t = optString18;
                        c0098c2.f535u = optString19;
                        c0098c2.f539w = optLong;
                        c0098c2.f541x = currentTimeMillis;
                        c0098c2.f491W = optString21;
                        c0098c2.f492X = optString22;
                        c0098c2.f543y = optString27;
                        c0098c2.f545z = optString28;
                        c0098c2.f466A = str5;
                        c0098c2.f468B = str4;
                        c0098c2.f470C = str7;
                        c0098c2.f472D = str19;
                        c0098c2.f473E = str18;
                        c0098c2.f474F = str42;
                        c0098c2.f475G = str10;
                        c0098c2.f476H = str11;
                        c0098c2.f477I = str12;
                        c0098c2.f478J = str13;
                        c0098c2.f479K = str14;
                        c0098c2.f480L = str15;
                        c0098c2.f481M = str16;
                        c0098c2.f482N = str17;
                        c0098c2.f483O = arrayList6;
                        c0098c2.f484P = arrayList5;
                        c0098c2.f485Q = arrayList4;
                        c0098c2.f486R = arrayList3;
                        c0098c2.f487S = arrayList2;
                        c0098c2.f488T = arrayList7;
                        c0098c2.f490V = arrayList;
                        c0098c2.f489U = arrayList8;
                        c0098c2.f493Y = str41;
                        c0098c2.f496a0 = str40;
                        c0098c2.f500c0 = optBoolean;
                        c0098c2.f502d0 = optBoolean2;
                        c0098c2.f504e0 = optBoolean3;
                        c0098c2.f506f0 = optLong2;
                        c0098c2.f508g0 = optString25;
                        c0098c2.f510h0 = optBoolean4;
                        c0098c2.f512i0 = optString26;
                        if (optJSONObject != null) {
                        }
                        c0098c2.f516k0 = str31;
                        c0098c2.f518l0 = str30;
                        c0098c2.f520m0 = str32;
                        c0098c2.f522n0 = optBoolean5;
                        c0098c2.f524o0 = z11;
                        c0098c2.f546z0 = optBoolean6;
                        c0098c2.f469B0 = str3;
                        c0098c2.f471C0 = optString32;
                        c0098c2.f467A0 = optBoolean7;
                        c0098c2.f526p0 = str23;
                        c0098c2.f528q0 = i11;
                        c0098c2.f530r0 = str24;
                        c0098c2.f532s0 = str25;
                        c0098c2.f540w0 = z12;
                        c0098c2.f534t0 = str26;
                        c0098c2.f536u0 = str27;
                        c0098c2.f538v0 = str28;
                        c0098c2.f542x0 = str29;
                        c0098c2.f544y0 = bundle;
                        c0098c2.f537v = optString20;
                        if (optString20.equals("native")) {
                        }
                        return c0098c2;
                    }
                    optString23 = optString24;
                    optString24 = optString23;
                    boolean optBoolean9 = jSONObject.optBoolean("mute", false);
                    boolean optBoolean22 = jSONObject.optBoolean("autoPlay", false);
                    boolean optBoolean32 = jSONObject.optBoolean("allowSkip", false);
                    String str402 = optString23;
                    long optLong22 = jSONObject.optLong("skipAfter", 0L);
                    String optString252 = jSONObject.optString("videoMode");
                    boolean optBoolean42 = jSONObject.optBoolean("appFlyer");
                    String optString262 = jSONObject.optString("contentScheme");
                    optJSONObject = jSONObject.optJSONObject("metaData");
                    String optString272 = jSONObject.optString("excludeOr");
                    String optString282 = jSONObject.optString("excludeAnd");
                    String optString292 = jSONObject.optString("includeOr");
                    String optString302 = jSONObject.optString("includeAnd");
                    String str412 = optString24;
                    boolean optBoolean52 = jSONObject.optBoolean("clickable", true);
                    boolean optBoolean62 = jSONObject.optBoolean("isAdtimaVideo", true);
                    boolean optBoolean72 = jSONObject.optBoolean("isAdBackup", false);
                    String optString312 = jSONObject.optString("zipAdKind");
                    String optString322 = jSONObject.optString("imgFormat");
                    optJSONObject2 = jSONObject.optJSONObject("tracking");
                    if (optJSONObject2 == null) {
                    }
                    optJSONObject3 = jSONObject.optJSONObject("ext");
                    String str422 = str9;
                    if (optJSONObject3 == null) {
                    }
                    optJSONObject4 = jSONObject.optJSONObject("ladi_trck");
                    if (optJSONObject4 == null) {
                    }
                    bundle = null;
                    C0098c c0098c22 = new C0098c();
                    c0098c22.f495a = optString;
                    c0098c22.f497b = str;
                    c0098c22.f499c = optString2;
                    c0098c22.f501d = optString3;
                    c0098c22.f503e = optString4;
                    c0098c22.f505f = optString5;
                    c0098c22.f507g = optString6;
                    c0098c22.f509h = optString7;
                    c0098c22.f511i = optString8;
                    c0098c22.f513j = str2;
                    c0098c22.f515k = optString10;
                    c0098c22.f517l = optString11;
                    c0098c22.f519m = optString12;
                    c0098c22.f523o = arrayList15;
                    c0098c22.f521n = optString13;
                    if (optString14 != null) {
                    }
                    parseFloat = 0.0f;
                    c0098c22.f525p = parseFloat;
                    c0098c22.f527q = optString15;
                    c0098c22.f529r = optString16;
                    c0098c22.f531s = optString17;
                    c0098c22.f533t = optString18;
                    c0098c22.f535u = optString19;
                    c0098c22.f539w = optLong;
                    c0098c22.f541x = currentTimeMillis;
                    c0098c22.f491W = optString21;
                    c0098c22.f492X = optString22;
                    c0098c22.f543y = optString272;
                    c0098c22.f545z = optString282;
                    c0098c22.f466A = str5;
                    c0098c22.f468B = str4;
                    c0098c22.f470C = str7;
                    c0098c22.f472D = str19;
                    c0098c22.f473E = str18;
                    c0098c22.f474F = str422;
                    c0098c22.f475G = str10;
                    c0098c22.f476H = str11;
                    c0098c22.f477I = str12;
                    c0098c22.f478J = str13;
                    c0098c22.f479K = str14;
                    c0098c22.f480L = str15;
                    c0098c22.f481M = str16;
                    c0098c22.f482N = str17;
                    c0098c22.f483O = arrayList6;
                    c0098c22.f484P = arrayList5;
                    c0098c22.f485Q = arrayList4;
                    c0098c22.f486R = arrayList3;
                    c0098c22.f487S = arrayList2;
                    c0098c22.f488T = arrayList7;
                    c0098c22.f490V = arrayList;
                    c0098c22.f489U = arrayList8;
                    c0098c22.f493Y = str412;
                    c0098c22.f496a0 = str402;
                    c0098c22.f500c0 = optBoolean9;
                    c0098c22.f502d0 = optBoolean22;
                    c0098c22.f504e0 = optBoolean32;
                    c0098c22.f506f0 = optLong22;
                    c0098c22.f508g0 = optString252;
                    c0098c22.f510h0 = optBoolean42;
                    c0098c22.f512i0 = optString262;
                    if (optJSONObject != null) {
                    }
                    c0098c22.f516k0 = str31;
                    c0098c22.f518l0 = str30;
                    c0098c22.f520m0 = str32;
                    c0098c22.f522n0 = optBoolean52;
                    c0098c22.f524o0 = z11;
                    c0098c22.f546z0 = optBoolean62;
                    c0098c22.f469B0 = str3;
                    c0098c22.f471C0 = optString322;
                    c0098c22.f467A0 = optBoolean72;
                    c0098c22.f526p0 = str23;
                    c0098c22.f528q0 = i11;
                    c0098c22.f530r0 = str24;
                    c0098c22.f532s0 = str25;
                    c0098c22.f540w0 = z12;
                    c0098c22.f534t0 = str26;
                    c0098c22.f536u0 = str27;
                    c0098c22.f538v0 = str28;
                    c0098c22.f542x0 = str29;
                    c0098c22.f544y0 = bundle;
                    c0098c22.f537v = optString20;
                    if (optString20.equals("native")) {
                    }
                    return c0098c22;
                }
                if ((optString20.equals("video") || optString20.equals("rich") || optString20.equals("endcard")) && optString23.equals("")) {
                    optString23 = optString24;
                    boolean optBoolean92 = jSONObject.optBoolean("mute", false);
                    boolean optBoolean222 = jSONObject.optBoolean("autoPlay", false);
                    boolean optBoolean322 = jSONObject.optBoolean("allowSkip", false);
                    String str4022 = optString23;
                    long optLong222 = jSONObject.optLong("skipAfter", 0L);
                    String optString2522 = jSONObject.optString("videoMode");
                    boolean optBoolean422 = jSONObject.optBoolean("appFlyer");
                    String optString2622 = jSONObject.optString("contentScheme");
                    optJSONObject = jSONObject.optJSONObject("metaData");
                    String optString2722 = jSONObject.optString("excludeOr");
                    String optString2822 = jSONObject.optString("excludeAnd");
                    String optString2922 = jSONObject.optString("includeOr");
                    String optString3022 = jSONObject.optString("includeAnd");
                    String str4122 = optString24;
                    boolean optBoolean522 = jSONObject.optBoolean("clickable", true);
                    boolean optBoolean622 = jSONObject.optBoolean("isAdtimaVideo", true);
                    boolean optBoolean722 = jSONObject.optBoolean("isAdBackup", false);
                    String optString3122 = jSONObject.optString("zipAdKind");
                    String optString3222 = jSONObject.optString("imgFormat");
                    optJSONObject2 = jSONObject.optJSONObject("tracking");
                    if (optJSONObject2 == null) {
                    }
                    optJSONObject3 = jSONObject.optJSONObject("ext");
                    String str4222 = str9;
                    if (optJSONObject3 == null) {
                    }
                    optJSONObject4 = jSONObject.optJSONObject("ladi_trck");
                    if (optJSONObject4 == null) {
                    }
                    bundle = null;
                    C0098c c0098c222 = new C0098c();
                    c0098c222.f495a = optString;
                    c0098c222.f497b = str;
                    c0098c222.f499c = optString2;
                    c0098c222.f501d = optString3;
                    c0098c222.f503e = optString4;
                    c0098c222.f505f = optString5;
                    c0098c222.f507g = optString6;
                    c0098c222.f509h = optString7;
                    c0098c222.f511i = optString8;
                    c0098c222.f513j = str2;
                    c0098c222.f515k = optString10;
                    c0098c222.f517l = optString11;
                    c0098c222.f519m = optString12;
                    c0098c222.f523o = arrayList15;
                    c0098c222.f521n = optString13;
                    if (optString14 != null) {
                    }
                    parseFloat = 0.0f;
                    c0098c222.f525p = parseFloat;
                    c0098c222.f527q = optString15;
                    c0098c222.f529r = optString16;
                    c0098c222.f531s = optString17;
                    c0098c222.f533t = optString18;
                    c0098c222.f535u = optString19;
                    c0098c222.f539w = optLong;
                    c0098c222.f541x = currentTimeMillis;
                    c0098c222.f491W = optString21;
                    c0098c222.f492X = optString22;
                    c0098c222.f543y = optString2722;
                    c0098c222.f545z = optString2822;
                    c0098c222.f466A = str5;
                    c0098c222.f468B = str4;
                    c0098c222.f470C = str7;
                    c0098c222.f472D = str19;
                    c0098c222.f473E = str18;
                    c0098c222.f474F = str4222;
                    c0098c222.f475G = str10;
                    c0098c222.f476H = str11;
                    c0098c222.f477I = str12;
                    c0098c222.f478J = str13;
                    c0098c222.f479K = str14;
                    c0098c222.f480L = str15;
                    c0098c222.f481M = str16;
                    c0098c222.f482N = str17;
                    c0098c222.f483O = arrayList6;
                    c0098c222.f484P = arrayList5;
                    c0098c222.f485Q = arrayList4;
                    c0098c222.f486R = arrayList3;
                    c0098c222.f487S = arrayList2;
                    c0098c222.f488T = arrayList7;
                    c0098c222.f490V = arrayList;
                    c0098c222.f489U = arrayList8;
                    c0098c222.f493Y = str4122;
                    c0098c222.f496a0 = str4022;
                    c0098c222.f500c0 = optBoolean92;
                    c0098c222.f502d0 = optBoolean222;
                    c0098c222.f504e0 = optBoolean322;
                    c0098c222.f506f0 = optLong222;
                    c0098c222.f508g0 = optString2522;
                    c0098c222.f510h0 = optBoolean422;
                    c0098c222.f512i0 = optString2622;
                    if (optJSONObject != null) {
                    }
                    c0098c222.f516k0 = str31;
                    c0098c222.f518l0 = str30;
                    c0098c222.f520m0 = str32;
                    c0098c222.f522n0 = optBoolean522;
                    c0098c222.f524o0 = z11;
                    c0098c222.f546z0 = optBoolean622;
                    c0098c222.f469B0 = str3;
                    c0098c222.f471C0 = optString3222;
                    c0098c222.f467A0 = optBoolean722;
                    c0098c222.f526p0 = str23;
                    c0098c222.f528q0 = i11;
                    c0098c222.f530r0 = str24;
                    c0098c222.f532s0 = str25;
                    c0098c222.f540w0 = z12;
                    c0098c222.f534t0 = str26;
                    c0098c222.f536u0 = str27;
                    c0098c222.f538v0 = str28;
                    c0098c222.f542x0 = str29;
                    c0098c222.f544y0 = bundle;
                    c0098c222.f537v = optString20;
                    if (optString20.equals("native")) {
                    }
                    return c0098c222;
                }
                optString23 = optString24;
                optString24 = optString23;
                boolean optBoolean922 = jSONObject.optBoolean("mute", false);
                boolean optBoolean2222 = jSONObject.optBoolean("autoPlay", false);
                boolean optBoolean3222 = jSONObject.optBoolean("allowSkip", false);
                String str40222 = optString23;
                long optLong2222 = jSONObject.optLong("skipAfter", 0L);
                String optString25222 = jSONObject.optString("videoMode");
                boolean optBoolean4222 = jSONObject.optBoolean("appFlyer");
                String optString26222 = jSONObject.optString("contentScheme");
                optJSONObject = jSONObject.optJSONObject("metaData");
                String optString27222 = jSONObject.optString("excludeOr");
                String optString28222 = jSONObject.optString("excludeAnd");
                String optString29222 = jSONObject.optString("includeOr");
                String optString30222 = jSONObject.optString("includeAnd");
                String str41222 = optString24;
                boolean optBoolean5222 = jSONObject.optBoolean("clickable", true);
                boolean optBoolean6222 = jSONObject.optBoolean("isAdtimaVideo", true);
                boolean optBoolean7222 = jSONObject.optBoolean("isAdBackup", false);
                String optString31222 = jSONObject.optString("zipAdKind");
                String optString32222 = jSONObject.optString("imgFormat");
                optJSONObject2 = jSONObject.optJSONObject("tracking");
                if (optJSONObject2 == null) {
                }
                optJSONObject3 = jSONObject.optJSONObject("ext");
                String str42222 = str9;
                if (optJSONObject3 == null) {
                }
                optJSONObject4 = jSONObject.optJSONObject("ladi_trck");
                if (optJSONObject4 == null) {
                }
                bundle = null;
                C0098c c0098c2222 = new C0098c();
                c0098c2222.f495a = optString;
                c0098c2222.f497b = str;
                c0098c2222.f499c = optString2;
                c0098c2222.f501d = optString3;
                c0098c2222.f503e = optString4;
                c0098c2222.f505f = optString5;
                c0098c2222.f507g = optString6;
                c0098c2222.f509h = optString7;
                c0098c2222.f511i = optString8;
                c0098c2222.f513j = str2;
                c0098c2222.f515k = optString10;
                c0098c2222.f517l = optString11;
                c0098c2222.f519m = optString12;
                c0098c2222.f523o = arrayList15;
                c0098c2222.f521n = optString13;
                if (optString14 != null) {
                }
                parseFloat = 0.0f;
                c0098c2222.f525p = parseFloat;
                c0098c2222.f527q = optString15;
                c0098c2222.f529r = optString16;
                c0098c2222.f531s = optString17;
                c0098c2222.f533t = optString18;
                c0098c2222.f535u = optString19;
                c0098c2222.f539w = optLong;
                c0098c2222.f541x = currentTimeMillis;
                c0098c2222.f491W = optString21;
                c0098c2222.f492X = optString22;
                c0098c2222.f543y = optString27222;
                c0098c2222.f545z = optString28222;
                c0098c2222.f466A = str5;
                c0098c2222.f468B = str4;
                c0098c2222.f470C = str7;
                c0098c2222.f472D = str19;
                c0098c2222.f473E = str18;
                c0098c2222.f474F = str42222;
                c0098c2222.f475G = str10;
                c0098c2222.f476H = str11;
                c0098c2222.f477I = str12;
                c0098c2222.f478J = str13;
                c0098c2222.f479K = str14;
                c0098c2222.f480L = str15;
                c0098c2222.f481M = str16;
                c0098c2222.f482N = str17;
                c0098c2222.f483O = arrayList6;
                c0098c2222.f484P = arrayList5;
                c0098c2222.f485Q = arrayList4;
                c0098c2222.f486R = arrayList3;
                c0098c2222.f487S = arrayList2;
                c0098c2222.f488T = arrayList7;
                c0098c2222.f490V = arrayList;
                c0098c2222.f489U = arrayList8;
                c0098c2222.f493Y = str41222;
                c0098c2222.f496a0 = str40222;
                c0098c2222.f500c0 = optBoolean922;
                c0098c2222.f502d0 = optBoolean2222;
                c0098c2222.f504e0 = optBoolean3222;
                c0098c2222.f506f0 = optLong2222;
                c0098c2222.f508g0 = optString25222;
                c0098c2222.f510h0 = optBoolean4222;
                c0098c2222.f512i0 = optString26222;
                if (optJSONObject != null) {
                }
                c0098c2222.f516k0 = str31;
                c0098c2222.f518l0 = str30;
                c0098c2222.f520m0 = str32;
                c0098c2222.f522n0 = optBoolean5222;
                c0098c2222.f524o0 = z11;
                c0098c2222.f546z0 = optBoolean6222;
                c0098c2222.f469B0 = str3;
                c0098c2222.f471C0 = optString32222;
                c0098c2222.f467A0 = optBoolean7222;
                c0098c2222.f526p0 = str23;
                c0098c2222.f528q0 = i11;
                c0098c2222.f530r0 = str24;
                c0098c2222.f532s0 = str25;
                c0098c2222.f540w0 = z12;
                c0098c2222.f534t0 = str26;
                c0098c2222.f536u0 = str27;
                c0098c2222.f538v0 = str28;
                c0098c2222.f542x0 = str29;
                c0098c2222.f544y0 = bundle;
                c0098c2222.f537v = optString20;
                if (optString20.equals("native")) {
                }
                return c0098c2222;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:16|(22:18|19|(4:21|(2:24|22)|25|26)(1:97)|27|(4:29|(2:32|30)|33|34)(1:96)|35|(4:37|(2:40|38)|41|42)(1:95)|43|(4:45|(2:48|46)|49|50)(1:94)|51|(4:53|(2:56|54)|57|58)(1:93)|59|(4:61|(2:64|62)|65|66)(1:92)|67|(4:69|(2:72|70)|73|74)(1:91)|75|(3:77|(2:80|78)|81)(1:90)|82|84|85|86|87)|98|19|(0)(0)|27|(0)(0)|35|(0)(0)|43|(0)(0)|51|(0)(0)|59|(0)(0)|67|(0)(0)|75|(0)(0)|82|84|85|86|87) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0286 A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b7 A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e0 A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0309 A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0332 A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x035b A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0384 A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ad A[Catch: Exception -> 0x04ef, TryCatch #0 {Exception -> 0x04ef, blocks: (B:6:0x0004, B:8:0x0062, B:9:0x006c, B:11:0x0072, B:13:0x0085, B:16:0x00f5, B:19:0x0122, B:21:0x0286, B:22:0x0292, B:24:0x0298, B:27:0x02af, B:29:0x02b7, B:30:0x02bf, B:32:0x02c5, B:35:0x02d8, B:37:0x02e0, B:38:0x02e8, B:40:0x02ee, B:43:0x0301, B:45:0x0309, B:46:0x0311, B:48:0x0317, B:51:0x032a, B:53:0x0332, B:54:0x033a, B:56:0x0340, B:59:0x0353, B:61:0x035b, B:62:0x0363, B:64:0x0369, B:67:0x037c, B:69:0x0384, B:70:0x038c, B:72:0x0392, B:75:0x03a5, B:77:0x03ad, B:78:0x03b3, B:80:0x03b9, B:82:0x03c8, B:99:0x00fd, B:101:0x0105, B:103:0x010d, B:105:0x0115), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a8  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0098c m442g(JSONObject jSONObject) {
        String str;
        String str2;
        ArrayList arrayList;
        JSONArray optJSONArray;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList2;
        JSONArray optJSONArray2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        JSONArray optJSONArray3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        JSONArray optJSONArray4;
        ArrayList arrayList7;
        ArrayList arrayList8;
        JSONArray optJSONArray5;
        ArrayList arrayList9;
        ArrayList arrayList10;
        JSONArray optJSONArray6;
        ArrayList arrayList11;
        ArrayList arrayList12;
        JSONArray optJSONArray7;
        ArrayList arrayList13;
        ArrayList arrayList14;
        JSONArray optJSONArray8;
        ArrayList arrayList15;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("id");
                String optString2 = jSONObject.optString("adNetwork");
                String optString3 = jSONObject.optString("title");
                String optString4 = jSONObject.optString("displayInfo");
                String optString5 = jSONObject.optString("actionText");
                String optString6 = jSONObject.optString("actionType");
                String optString7 = jSONObject.optString("clickTo");
                String optString8 = jSONObject.optString("actionTo");
                String optString9 = jSONObject.optString("tokenId");
                String optString10 = jSONObject.optString("jumpTarget");
                String optString11 = jSONObject.optString("logoBannerFile");
                String optString12 = jSONObject.optString("portraitCoverUrl");
                String optString13 = jSONObject.optString("landscapeCoverUrl");
                String optString14 = jSONObject.optString("thumbBannerFile");
                JSONArray optJSONArray9 = jSONObject.optJSONArray("expandBanner");
                if (optJSONArray9 != null) {
                    arrayList = new ArrayList();
                    str = optString12;
                    str2 = optString13;
                    for (int i11 = 0; i11 < optJSONArray9.length(); i11++) {
                        arrayList.add(optJSONArray9.get(i11).toString());
                    }
                } else {
                    str = optString12;
                    str2 = optString13;
                    arrayList = null;
                }
                String optString15 = jSONObject.optString("rating");
                String optString16 = jSONObject.optString("promotion");
                String optString17 = jSONObject.optString("appName");
                String optString18 = jSONObject.optString("appCaption");
                String optString19 = jSONObject.optString("appDescription");
                String optString20 = jSONObject.optString("contextString");
                String optString21 = jSONObject.optString("kind");
                long optLong = jSONObject.optLong("adTime");
                long optLong2 = jSONObject.optLong("adExpired");
                String optString22 = jSONObject.optString("appStore");
                String optString23 = jSONObject.optString("adPackage");
                String optString24 = jSONObject.optString("vastLink");
                String optString25 = jSONObject.optString("daastLink");
                ArrayList arrayList16 = arrayList;
                if (optString21.equals("audio")) {
                    if (optString25.equals("")) {
                        optString25 = optString24;
                        boolean optBoolean = jSONObject.optBoolean("mute");
                        boolean optBoolean2 = jSONObject.optBoolean("autoPlay", false);
                        boolean optBoolean3 = jSONObject.optBoolean("allowSkip", false);
                        String str6 = optString25;
                        String str7 = optString24;
                        long optLong3 = jSONObject.optLong("skipAfter", 0L);
                        String optString26 = jSONObject.optString("videoMode");
                        boolean optBoolean4 = jSONObject.optBoolean("appFlyer", false);
                        String optString27 = jSONObject.optString("contentScheme", null);
                        String optString28 = jSONObject.optString("metaData");
                        String optString29 = jSONObject.optString("excludeOr");
                        String optString30 = jSONObject.optString("excludeAnd");
                        String optString31 = jSONObject.optString("includeOr");
                        String optString32 = jSONObject.optString("includeAnd");
                        String optString33 = jSONObject.optString("request");
                        String optString34 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                        String optString35 = jSONObject.optString("nonServing");
                        String optString36 = jSONObject.optString("activeView");
                        String optString37 = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_NAME);
                        String optString38 = jSONObject.optString("click");
                        String optString39 = jSONObject.optString("action");
                        String optString40 = jSONObject.optString("conversion");
                        String optString41 = jSONObject.optString("feedback");
                        String optString42 = jSONObject.optString("bidClient");
                        String optString43 = jSONObject.optString("performance");
                        String optString44 = jSONObject.optString("viewableImp");
                        String optString45 = jSONObject.optString("followToken");
                        String optString46 = jSONObject.optString("followOAId");
                        String optString47 = jSONObject.optString("followData");
                        boolean optBoolean5 = jSONObject.optBoolean("clickable", true);
                        boolean optBoolean6 = jSONObject.optBoolean("addClickTag", false);
                        String optString48 = jSONObject.optString("price", null);
                        int optInt = jSONObject.optInt("adTemplate", -1);
                        String optString49 = jSONObject.optString("include", null);
                        String optString50 = jSONObject.optString("exclude", null);
                        boolean optBoolean7 = jSONObject.optBoolean("isAdtimaVideo", true);
                        boolean optBoolean8 = jSONObject.optBoolean("isAdBackup", false);
                        String optString51 = jSONObject.optString("zipAdKind");
                        String optString52 = jSONObject.optString("imgFormat");
                        boolean optBoolean9 = jSONObject.optBoolean("omEnable", false);
                        String optString53 = jSONObject.optString("verificationParameters", null);
                        String optString54 = jSONObject.optString("vendorKey", null);
                        String optString55 = jSONObject.optString("verificationScriptUrl", null);
                        String optString56 = jSONObject.optString("scenario", null);
                        optJSONArray = jSONObject.optJSONArray("creativeView");
                        if (optJSONArray == null) {
                            str5 = optString56;
                            ArrayList arrayList17 = new ArrayList();
                            str3 = optString30;
                            str4 = optString29;
                            for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                                arrayList17.add(optJSONArray.get(i12).toString());
                            }
                            arrayList2 = arrayList17;
                        } else {
                            str3 = optString30;
                            str4 = optString29;
                            str5 = optString56;
                            arrayList2 = null;
                        }
                        optJSONArray2 = jSONObject.optJSONArray("firstQuatile");
                        if (optJSONArray2 == null) {
                            ArrayList arrayList18 = new ArrayList();
                            arrayList3 = arrayList2;
                            for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                                arrayList18.add(optJSONArray2.get(i13).toString());
                            }
                            arrayList4 = arrayList18;
                        } else {
                            arrayList3 = arrayList2;
                            arrayList4 = null;
                        }
                        optJSONArray3 = jSONObject.optJSONArray("midpoint");
                        if (optJSONArray3 == null) {
                            ArrayList arrayList19 = new ArrayList();
                            arrayList5 = arrayList4;
                            for (int i14 = 0; i14 < optJSONArray3.length(); i14++) {
                                arrayList19.add(optJSONArray3.get(i14).toString());
                            }
                            arrayList6 = arrayList19;
                        } else {
                            arrayList5 = arrayList4;
                            arrayList6 = null;
                        }
                        optJSONArray4 = jSONObject.optJSONArray("thirdQuatile");
                        if (optJSONArray4 == null) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList7 = arrayList6;
                            for (int i15 = 0; i15 < optJSONArray4.length(); i15++) {
                                arrayList20.add(optJSONArray4.get(i15).toString());
                            }
                            arrayList8 = arrayList20;
                        } else {
                            arrayList7 = arrayList6;
                            arrayList8 = null;
                        }
                        optJSONArray5 = jSONObject.optJSONArray("complete");
                        if (optJSONArray5 == null) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList9 = arrayList8;
                            for (int i16 = 0; i16 < optJSONArray5.length(); i16++) {
                                arrayList21.add(optJSONArray5.get(i16).toString());
                            }
                            arrayList10 = arrayList21;
                        } else {
                            arrayList9 = arrayList8;
                            arrayList10 = null;
                        }
                        optJSONArray6 = jSONObject.optJSONArray("progress");
                        if (optJSONArray6 == null) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList11 = arrayList10;
                            for (int i17 = 0; i17 < optJSONArray6.length(); i17++) {
                                arrayList22.add(optJSONArray6.get(i17).toString());
                            }
                            arrayList12 = arrayList22;
                        } else {
                            arrayList11 = arrayList10;
                            arrayList12 = null;
                        }
                        optJSONArray7 = jSONObject.optJSONArray("trackThirdImpression");
                        if (optJSONArray7 == null) {
                            ArrayList arrayList23 = new ArrayList();
                            arrayList13 = arrayList12;
                            for (int i18 = 0; i18 < optJSONArray7.length(); i18++) {
                                arrayList23.add(optJSONArray7.get(i18).toString());
                            }
                            arrayList14 = arrayList23;
                        } else {
                            arrayList13 = arrayList12;
                            arrayList14 = null;
                        }
                        optJSONArray8 = jSONObject.optJSONArray("trackThirdClick");
                        if (optJSONArray8 == null) {
                            arrayList15 = new ArrayList();
                            for (int i19 = 0; i19 < optJSONArray8.length(); i19++) {
                                arrayList15.add(optJSONArray8.get(i19).toString());
                            }
                        } else {
                            arrayList15 = null;
                        }
                        C0098c c0098c = new C0098c();
                        c0098c.f495a = optString;
                        c0098c.f497b = optString2;
                        c0098c.f499c = optString3;
                        c0098c.f501d = optString4;
                        c0098c.f503e = optString5;
                        c0098c.f505f = optString6;
                        c0098c.f507g = optString7;
                        c0098c.f509h = optString8;
                        c0098c.f511i = optString9;
                        c0098c.f513j = optString10;
                        c0098c.f515k = optString11;
                        c0098c.f517l = str;
                        c0098c.f519m = str2;
                        c0098c.f521n = optString14;
                        c0098c.f523o = arrayList16;
                        c0098c.f525p = Float.parseFloat(optString15);
                        c0098c.f527q = optString16;
                        c0098c.f529r = optString17;
                        c0098c.f531s = optString18;
                        c0098c.f533t = optString19;
                        c0098c.f535u = optString20;
                        c0098c.f537v = optString21;
                        c0098c.f539w = optLong;
                        c0098c.f541x = optLong2;
                        c0098c.f491W = optString22;
                        c0098c.f492X = optString23;
                        c0098c.f543y = str4;
                        c0098c.f545z = str3;
                        c0098c.f466A = optString31;
                        c0098c.f468B = optString32;
                        c0098c.f470C = optString33;
                        c0098c.f472D = optString34;
                        c0098c.f473E = optString35;
                        c0098c.f474F = optString36;
                        c0098c.f475G = optString37;
                        c0098c.f476H = optString38;
                        c0098c.f477I = optString39;
                        c0098c.f478J = optString40;
                        c0098c.f479K = optString41;
                        c0098c.f480L = optString42;
                        c0098c.f481M = optString43;
                        c0098c.f482N = optString44;
                        c0098c.f483O = arrayList3;
                        c0098c.f484P = arrayList5;
                        c0098c.f485Q = arrayList7;
                        c0098c.f486R = arrayList9;
                        c0098c.f487S = arrayList11;
                        c0098c.f488T = arrayList13;
                        c0098c.f490V = arrayList14;
                        c0098c.f489U = arrayList15;
                        c0098c.f493Y = str6;
                        c0098c.f496a0 = str7;
                        c0098c.f500c0 = optBoolean;
                        c0098c.f502d0 = optBoolean2;
                        c0098c.f504e0 = optBoolean3;
                        c0098c.f506f0 = optLong3;
                        c0098c.f508g0 = optString26;
                        c0098c.f510h0 = optBoolean4;
                        c0098c.f512i0 = optString27;
                        c0098c.f514j0 = optString28;
                        c0098c.f516k0 = optString45;
                        c0098c.f518l0 = optString46;
                        c0098c.f520m0 = optString47;
                        c0098c.f522n0 = optBoolean5;
                        c0098c.f524o0 = optBoolean6;
                        c0098c.f526p0 = optString48;
                        c0098c.f528q0 = optInt;
                        c0098c.f546z0 = optBoolean7;
                        c0098c.f467A0 = optBoolean8;
                        c0098c.f469B0 = optString51;
                        c0098c.f471C0 = optString52;
                        c0098c.f530r0 = optString49;
                        c0098c.f532s0 = optString50;
                        c0098c.f540w0 = optBoolean9;
                        c0098c.f534t0 = optString53;
                        c0098c.f536u0 = optString54;
                        c0098c.f538v0 = optString55;
                        c0098c.f542x0 = str5;
                        return c0098c;
                    }
                    optString24 = optString25;
                    optString25 = optString24;
                    boolean optBoolean10 = jSONObject.optBoolean("mute");
                    boolean optBoolean22 = jSONObject.optBoolean("autoPlay", false);
                    boolean optBoolean32 = jSONObject.optBoolean("allowSkip", false);
                    String str62 = optString25;
                    String str72 = optString24;
                    long optLong32 = jSONObject.optLong("skipAfter", 0L);
                    String optString262 = jSONObject.optString("videoMode");
                    boolean optBoolean42 = jSONObject.optBoolean("appFlyer", false);
                    String optString272 = jSONObject.optString("contentScheme", null);
                    String optString282 = jSONObject.optString("metaData");
                    String optString292 = jSONObject.optString("excludeOr");
                    String optString302 = jSONObject.optString("excludeAnd");
                    String optString312 = jSONObject.optString("includeOr");
                    String optString322 = jSONObject.optString("includeAnd");
                    String optString332 = jSONObject.optString("request");
                    String optString342 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                    String optString352 = jSONObject.optString("nonServing");
                    String optString362 = jSONObject.optString("activeView");
                    String optString372 = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_NAME);
                    String optString382 = jSONObject.optString("click");
                    String optString392 = jSONObject.optString("action");
                    String optString402 = jSONObject.optString("conversion");
                    String optString412 = jSONObject.optString("feedback");
                    String optString422 = jSONObject.optString("bidClient");
                    String optString432 = jSONObject.optString("performance");
                    String optString442 = jSONObject.optString("viewableImp");
                    String optString452 = jSONObject.optString("followToken");
                    String optString462 = jSONObject.optString("followOAId");
                    String optString472 = jSONObject.optString("followData");
                    boolean optBoolean52 = jSONObject.optBoolean("clickable", true);
                    boolean optBoolean62 = jSONObject.optBoolean("addClickTag", false);
                    String optString482 = jSONObject.optString("price", null);
                    int optInt2 = jSONObject.optInt("adTemplate", -1);
                    String optString492 = jSONObject.optString("include", null);
                    String optString502 = jSONObject.optString("exclude", null);
                    boolean optBoolean72 = jSONObject.optBoolean("isAdtimaVideo", true);
                    boolean optBoolean82 = jSONObject.optBoolean("isAdBackup", false);
                    String optString512 = jSONObject.optString("zipAdKind");
                    String optString522 = jSONObject.optString("imgFormat");
                    boolean optBoolean92 = jSONObject.optBoolean("omEnable", false);
                    String optString532 = jSONObject.optString("verificationParameters", null);
                    String optString542 = jSONObject.optString("vendorKey", null);
                    String optString552 = jSONObject.optString("verificationScriptUrl", null);
                    String optString562 = jSONObject.optString("scenario", null);
                    optJSONArray = jSONObject.optJSONArray("creativeView");
                    if (optJSONArray == null) {
                    }
                    optJSONArray2 = jSONObject.optJSONArray("firstQuatile");
                    if (optJSONArray2 == null) {
                    }
                    optJSONArray3 = jSONObject.optJSONArray("midpoint");
                    if (optJSONArray3 == null) {
                    }
                    optJSONArray4 = jSONObject.optJSONArray("thirdQuatile");
                    if (optJSONArray4 == null) {
                    }
                    optJSONArray5 = jSONObject.optJSONArray("complete");
                    if (optJSONArray5 == null) {
                    }
                    optJSONArray6 = jSONObject.optJSONArray("progress");
                    if (optJSONArray6 == null) {
                    }
                    optJSONArray7 = jSONObject.optJSONArray("trackThirdImpression");
                    if (optJSONArray7 == null) {
                    }
                    optJSONArray8 = jSONObject.optJSONArray("trackThirdClick");
                    if (optJSONArray8 == null) {
                    }
                    C0098c c0098c2 = new C0098c();
                    c0098c2.f495a = optString;
                    c0098c2.f497b = optString2;
                    c0098c2.f499c = optString3;
                    c0098c2.f501d = optString4;
                    c0098c2.f503e = optString5;
                    c0098c2.f505f = optString6;
                    c0098c2.f507g = optString7;
                    c0098c2.f509h = optString8;
                    c0098c2.f511i = optString9;
                    c0098c2.f513j = optString10;
                    c0098c2.f515k = optString11;
                    c0098c2.f517l = str;
                    c0098c2.f519m = str2;
                    c0098c2.f521n = optString14;
                    c0098c2.f523o = arrayList16;
                    c0098c2.f525p = Float.parseFloat(optString15);
                    c0098c2.f527q = optString16;
                    c0098c2.f529r = optString17;
                    c0098c2.f531s = optString18;
                    c0098c2.f533t = optString19;
                    c0098c2.f535u = optString20;
                    c0098c2.f537v = optString21;
                    c0098c2.f539w = optLong;
                    c0098c2.f541x = optLong2;
                    c0098c2.f491W = optString22;
                    c0098c2.f492X = optString23;
                    c0098c2.f543y = str4;
                    c0098c2.f545z = str3;
                    c0098c2.f466A = optString312;
                    c0098c2.f468B = optString322;
                    c0098c2.f470C = optString332;
                    c0098c2.f472D = optString342;
                    c0098c2.f473E = optString352;
                    c0098c2.f474F = optString362;
                    c0098c2.f475G = optString372;
                    c0098c2.f476H = optString382;
                    c0098c2.f477I = optString392;
                    c0098c2.f478J = optString402;
                    c0098c2.f479K = optString412;
                    c0098c2.f480L = optString422;
                    c0098c2.f481M = optString432;
                    c0098c2.f482N = optString442;
                    c0098c2.f483O = arrayList3;
                    c0098c2.f484P = arrayList5;
                    c0098c2.f485Q = arrayList7;
                    c0098c2.f486R = arrayList9;
                    c0098c2.f487S = arrayList11;
                    c0098c2.f488T = arrayList13;
                    c0098c2.f490V = arrayList14;
                    c0098c2.f489U = arrayList15;
                    c0098c2.f493Y = str62;
                    c0098c2.f496a0 = str72;
                    c0098c2.f500c0 = optBoolean10;
                    c0098c2.f502d0 = optBoolean22;
                    c0098c2.f504e0 = optBoolean32;
                    c0098c2.f506f0 = optLong32;
                    c0098c2.f508g0 = optString262;
                    c0098c2.f510h0 = optBoolean42;
                    c0098c2.f512i0 = optString272;
                    c0098c2.f514j0 = optString282;
                    c0098c2.f516k0 = optString452;
                    c0098c2.f518l0 = optString462;
                    c0098c2.f520m0 = optString472;
                    c0098c2.f522n0 = optBoolean52;
                    c0098c2.f524o0 = optBoolean62;
                    c0098c2.f526p0 = optString482;
                    c0098c2.f528q0 = optInt2;
                    c0098c2.f546z0 = optBoolean72;
                    c0098c2.f467A0 = optBoolean82;
                    c0098c2.f469B0 = optString512;
                    c0098c2.f471C0 = optString522;
                    c0098c2.f530r0 = optString492;
                    c0098c2.f532s0 = optString502;
                    c0098c2.f540w0 = optBoolean92;
                    c0098c2.f534t0 = optString532;
                    c0098c2.f536u0 = optString542;
                    c0098c2.f538v0 = optString552;
                    c0098c2.f542x0 = str5;
                    return c0098c2;
                }
                if ((optString21.equals("video") || optString21.equals("rich") || optString21.equals("endcard")) && optString24.equals("")) {
                    optString24 = optString25;
                    boolean optBoolean102 = jSONObject.optBoolean("mute");
                    boolean optBoolean222 = jSONObject.optBoolean("autoPlay", false);
                    boolean optBoolean322 = jSONObject.optBoolean("allowSkip", false);
                    String str622 = optString25;
                    String str722 = optString24;
                    long optLong322 = jSONObject.optLong("skipAfter", 0L);
                    String optString2622 = jSONObject.optString("videoMode");
                    boolean optBoolean422 = jSONObject.optBoolean("appFlyer", false);
                    String optString2722 = jSONObject.optString("contentScheme", null);
                    String optString2822 = jSONObject.optString("metaData");
                    String optString2922 = jSONObject.optString("excludeOr");
                    String optString3022 = jSONObject.optString("excludeAnd");
                    String optString3122 = jSONObject.optString("includeOr");
                    String optString3222 = jSONObject.optString("includeAnd");
                    String optString3322 = jSONObject.optString("request");
                    String optString3422 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                    String optString3522 = jSONObject.optString("nonServing");
                    String optString3622 = jSONObject.optString("activeView");
                    String optString3722 = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_NAME);
                    String optString3822 = jSONObject.optString("click");
                    String optString3922 = jSONObject.optString("action");
                    String optString4022 = jSONObject.optString("conversion");
                    String optString4122 = jSONObject.optString("feedback");
                    String optString4222 = jSONObject.optString("bidClient");
                    String optString4322 = jSONObject.optString("performance");
                    String optString4422 = jSONObject.optString("viewableImp");
                    String optString4522 = jSONObject.optString("followToken");
                    String optString4622 = jSONObject.optString("followOAId");
                    String optString4722 = jSONObject.optString("followData");
                    boolean optBoolean522 = jSONObject.optBoolean("clickable", true);
                    boolean optBoolean622 = jSONObject.optBoolean("addClickTag", false);
                    String optString4822 = jSONObject.optString("price", null);
                    int optInt22 = jSONObject.optInt("adTemplate", -1);
                    String optString4922 = jSONObject.optString("include", null);
                    String optString5022 = jSONObject.optString("exclude", null);
                    boolean optBoolean722 = jSONObject.optBoolean("isAdtimaVideo", true);
                    boolean optBoolean822 = jSONObject.optBoolean("isAdBackup", false);
                    String optString5122 = jSONObject.optString("zipAdKind");
                    String optString5222 = jSONObject.optString("imgFormat");
                    boolean optBoolean922 = jSONObject.optBoolean("omEnable", false);
                    String optString5322 = jSONObject.optString("verificationParameters", null);
                    String optString5422 = jSONObject.optString("vendorKey", null);
                    String optString5522 = jSONObject.optString("verificationScriptUrl", null);
                    String optString5622 = jSONObject.optString("scenario", null);
                    optJSONArray = jSONObject.optJSONArray("creativeView");
                    if (optJSONArray == null) {
                    }
                    optJSONArray2 = jSONObject.optJSONArray("firstQuatile");
                    if (optJSONArray2 == null) {
                    }
                    optJSONArray3 = jSONObject.optJSONArray("midpoint");
                    if (optJSONArray3 == null) {
                    }
                    optJSONArray4 = jSONObject.optJSONArray("thirdQuatile");
                    if (optJSONArray4 == null) {
                    }
                    optJSONArray5 = jSONObject.optJSONArray("complete");
                    if (optJSONArray5 == null) {
                    }
                    optJSONArray6 = jSONObject.optJSONArray("progress");
                    if (optJSONArray6 == null) {
                    }
                    optJSONArray7 = jSONObject.optJSONArray("trackThirdImpression");
                    if (optJSONArray7 == null) {
                    }
                    optJSONArray8 = jSONObject.optJSONArray("trackThirdClick");
                    if (optJSONArray8 == null) {
                    }
                    C0098c c0098c22 = new C0098c();
                    c0098c22.f495a = optString;
                    c0098c22.f497b = optString2;
                    c0098c22.f499c = optString3;
                    c0098c22.f501d = optString4;
                    c0098c22.f503e = optString5;
                    c0098c22.f505f = optString6;
                    c0098c22.f507g = optString7;
                    c0098c22.f509h = optString8;
                    c0098c22.f511i = optString9;
                    c0098c22.f513j = optString10;
                    c0098c22.f515k = optString11;
                    c0098c22.f517l = str;
                    c0098c22.f519m = str2;
                    c0098c22.f521n = optString14;
                    c0098c22.f523o = arrayList16;
                    c0098c22.f525p = Float.parseFloat(optString15);
                    c0098c22.f527q = optString16;
                    c0098c22.f529r = optString17;
                    c0098c22.f531s = optString18;
                    c0098c22.f533t = optString19;
                    c0098c22.f535u = optString20;
                    c0098c22.f537v = optString21;
                    c0098c22.f539w = optLong;
                    c0098c22.f541x = optLong2;
                    c0098c22.f491W = optString22;
                    c0098c22.f492X = optString23;
                    c0098c22.f543y = str4;
                    c0098c22.f545z = str3;
                    c0098c22.f466A = optString3122;
                    c0098c22.f468B = optString3222;
                    c0098c22.f470C = optString3322;
                    c0098c22.f472D = optString3422;
                    c0098c22.f473E = optString3522;
                    c0098c22.f474F = optString3622;
                    c0098c22.f475G = optString3722;
                    c0098c22.f476H = optString3822;
                    c0098c22.f477I = optString3922;
                    c0098c22.f478J = optString4022;
                    c0098c22.f479K = optString4122;
                    c0098c22.f480L = optString4222;
                    c0098c22.f481M = optString4322;
                    c0098c22.f482N = optString4422;
                    c0098c22.f483O = arrayList3;
                    c0098c22.f484P = arrayList5;
                    c0098c22.f485Q = arrayList7;
                    c0098c22.f486R = arrayList9;
                    c0098c22.f487S = arrayList11;
                    c0098c22.f488T = arrayList13;
                    c0098c22.f490V = arrayList14;
                    c0098c22.f489U = arrayList15;
                    c0098c22.f493Y = str622;
                    c0098c22.f496a0 = str722;
                    c0098c22.f500c0 = optBoolean102;
                    c0098c22.f502d0 = optBoolean222;
                    c0098c22.f504e0 = optBoolean322;
                    c0098c22.f506f0 = optLong322;
                    c0098c22.f508g0 = optString2622;
                    c0098c22.f510h0 = optBoolean422;
                    c0098c22.f512i0 = optString2722;
                    c0098c22.f514j0 = optString2822;
                    c0098c22.f516k0 = optString4522;
                    c0098c22.f518l0 = optString4622;
                    c0098c22.f520m0 = optString4722;
                    c0098c22.f522n0 = optBoolean522;
                    c0098c22.f524o0 = optBoolean622;
                    c0098c22.f526p0 = optString4822;
                    c0098c22.f528q0 = optInt22;
                    c0098c22.f546z0 = optBoolean722;
                    c0098c22.f467A0 = optBoolean822;
                    c0098c22.f469B0 = optString5122;
                    c0098c22.f471C0 = optString5222;
                    c0098c22.f530r0 = optString4922;
                    c0098c22.f532s0 = optString5022;
                    c0098c22.f540w0 = optBoolean922;
                    c0098c22.f534t0 = optString5322;
                    c0098c22.f536u0 = optString5422;
                    c0098c22.f538v0 = optString5522;
                    c0098c22.f542x0 = str5;
                    return c0098c22;
                }
                optString24 = optString25;
                optString25 = optString24;
                boolean optBoolean1022 = jSONObject.optBoolean("mute");
                boolean optBoolean2222 = jSONObject.optBoolean("autoPlay", false);
                boolean optBoolean3222 = jSONObject.optBoolean("allowSkip", false);
                String str6222 = optString25;
                String str7222 = optString24;
                long optLong3222 = jSONObject.optLong("skipAfter", 0L);
                String optString26222 = jSONObject.optString("videoMode");
                boolean optBoolean4222 = jSONObject.optBoolean("appFlyer", false);
                String optString27222 = jSONObject.optString("contentScheme", null);
                String optString28222 = jSONObject.optString("metaData");
                String optString29222 = jSONObject.optString("excludeOr");
                String optString30222 = jSONObject.optString("excludeAnd");
                String optString31222 = jSONObject.optString("includeOr");
                String optString32222 = jSONObject.optString("includeAnd");
                String optString33222 = jSONObject.optString("request");
                String optString34222 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                String optString35222 = jSONObject.optString("nonServing");
                String optString36222 = jSONObject.optString("activeView");
                String optString37222 = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_NAME);
                String optString38222 = jSONObject.optString("click");
                String optString39222 = jSONObject.optString("action");
                String optString40222 = jSONObject.optString("conversion");
                String optString41222 = jSONObject.optString("feedback");
                String optString42222 = jSONObject.optString("bidClient");
                String optString43222 = jSONObject.optString("performance");
                String optString44222 = jSONObject.optString("viewableImp");
                String optString45222 = jSONObject.optString("followToken");
                String optString46222 = jSONObject.optString("followOAId");
                String optString47222 = jSONObject.optString("followData");
                boolean optBoolean5222 = jSONObject.optBoolean("clickable", true);
                boolean optBoolean6222 = jSONObject.optBoolean("addClickTag", false);
                String optString48222 = jSONObject.optString("price", null);
                int optInt222 = jSONObject.optInt("adTemplate", -1);
                String optString49222 = jSONObject.optString("include", null);
                String optString50222 = jSONObject.optString("exclude", null);
                boolean optBoolean7222 = jSONObject.optBoolean("isAdtimaVideo", true);
                boolean optBoolean8222 = jSONObject.optBoolean("isAdBackup", false);
                String optString51222 = jSONObject.optString("zipAdKind");
                String optString52222 = jSONObject.optString("imgFormat");
                boolean optBoolean9222 = jSONObject.optBoolean("omEnable", false);
                String optString53222 = jSONObject.optString("verificationParameters", null);
                String optString54222 = jSONObject.optString("vendorKey", null);
                String optString55222 = jSONObject.optString("verificationScriptUrl", null);
                String optString56222 = jSONObject.optString("scenario", null);
                optJSONArray = jSONObject.optJSONArray("creativeView");
                if (optJSONArray == null) {
                }
                optJSONArray2 = jSONObject.optJSONArray("firstQuatile");
                if (optJSONArray2 == null) {
                }
                optJSONArray3 = jSONObject.optJSONArray("midpoint");
                if (optJSONArray3 == null) {
                }
                optJSONArray4 = jSONObject.optJSONArray("thirdQuatile");
                if (optJSONArray4 == null) {
                }
                optJSONArray5 = jSONObject.optJSONArray("complete");
                if (optJSONArray5 == null) {
                }
                optJSONArray6 = jSONObject.optJSONArray("progress");
                if (optJSONArray6 == null) {
                }
                optJSONArray7 = jSONObject.optJSONArray("trackThirdImpression");
                if (optJSONArray7 == null) {
                }
                optJSONArray8 = jSONObject.optJSONArray("trackThirdClick");
                if (optJSONArray8 == null) {
                }
                C0098c c0098c222 = new C0098c();
                c0098c222.f495a = optString;
                c0098c222.f497b = optString2;
                c0098c222.f499c = optString3;
                c0098c222.f501d = optString4;
                c0098c222.f503e = optString5;
                c0098c222.f505f = optString6;
                c0098c222.f507g = optString7;
                c0098c222.f509h = optString8;
                c0098c222.f511i = optString9;
                c0098c222.f513j = optString10;
                c0098c222.f515k = optString11;
                c0098c222.f517l = str;
                c0098c222.f519m = str2;
                c0098c222.f521n = optString14;
                c0098c222.f523o = arrayList16;
                c0098c222.f525p = Float.parseFloat(optString15);
                c0098c222.f527q = optString16;
                c0098c222.f529r = optString17;
                c0098c222.f531s = optString18;
                c0098c222.f533t = optString19;
                c0098c222.f535u = optString20;
                c0098c222.f537v = optString21;
                c0098c222.f539w = optLong;
                c0098c222.f541x = optLong2;
                c0098c222.f491W = optString22;
                c0098c222.f492X = optString23;
                c0098c222.f543y = str4;
                c0098c222.f545z = str3;
                c0098c222.f466A = optString31222;
                c0098c222.f468B = optString32222;
                c0098c222.f470C = optString33222;
                c0098c222.f472D = optString34222;
                c0098c222.f473E = optString35222;
                c0098c222.f474F = optString36222;
                c0098c222.f475G = optString37222;
                c0098c222.f476H = optString38222;
                c0098c222.f477I = optString39222;
                c0098c222.f478J = optString40222;
                c0098c222.f479K = optString41222;
                c0098c222.f480L = optString42222;
                c0098c222.f481M = optString43222;
                c0098c222.f482N = optString44222;
                c0098c222.f483O = arrayList3;
                c0098c222.f484P = arrayList5;
                c0098c222.f485Q = arrayList7;
                c0098c222.f486R = arrayList9;
                c0098c222.f487S = arrayList11;
                c0098c222.f488T = arrayList13;
                c0098c222.f490V = arrayList14;
                c0098c222.f489U = arrayList15;
                c0098c222.f493Y = str6222;
                c0098c222.f496a0 = str7222;
                c0098c222.f500c0 = optBoolean1022;
                c0098c222.f502d0 = optBoolean2222;
                c0098c222.f504e0 = optBoolean3222;
                c0098c222.f506f0 = optLong3222;
                c0098c222.f508g0 = optString26222;
                c0098c222.f510h0 = optBoolean4222;
                c0098c222.f512i0 = optString27222;
                c0098c222.f514j0 = optString28222;
                c0098c222.f516k0 = optString45222;
                c0098c222.f518l0 = optString46222;
                c0098c222.f520m0 = optString47222;
                c0098c222.f522n0 = optBoolean5222;
                c0098c222.f524o0 = optBoolean6222;
                c0098c222.f526p0 = optString48222;
                c0098c222.f528q0 = optInt222;
                c0098c222.f546z0 = optBoolean7222;
                c0098c222.f467A0 = optBoolean8222;
                c0098c222.f469B0 = optString51222;
                c0098c222.f471C0 = optString52222;
                c0098c222.f530r0 = optString49222;
                c0098c222.f532s0 = optString50222;
                c0098c222.f540w0 = optBoolean9222;
                c0098c222.f534t0 = optString53222;
                c0098c222.f536u0 = optString54222;
                c0098c222.f538v0 = optString55222;
                c0098c222.f542x0 = str5;
                return c0098c222;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: a */
    protected Object mo433a(JSONObject jSONObject) {
        return m442g(jSONObject);
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: b */
    protected JSONObject mo434b() {
        return m446i();
    }

    /* renamed from: e */
    public boolean m443e(String str) {
        try {
            String str2 = this.f532s0;
            if (str2 == null || str2.trim().length() == 0) {
                return false;
            }
            String[] split = this.f532s0.split(",");
            if (split.length != 0) {
                for (String str3 : split) {
                    if (str3.trim().equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0098c clone() {
        return (C0098c) super.clone();
    }

    /* renamed from: h */
    public boolean m445h(String str) {
        try {
            String str2 = this.f530r0;
            if (str2 == null || str2.trim().length() == 0) {
                return false;
            }
            String[] split = this.f530r0.split(",");
            if (split.length != 0) {
                for (String str3 : split) {
                    if (str3.trim().equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public JSONObject m446i() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f495a);
                jSONObject.put("adNetwork", this.f497b);
                jSONObject.put("title", this.f499c);
                jSONObject.put("displayInfo", this.f501d);
                jSONObject.put("actionText", this.f503e);
                jSONObject.put("actionType", this.f505f);
                jSONObject.put("clickTo", this.f507g);
                jSONObject.put("actionTo", this.f509h);
                jSONObject.put("tokenId", this.f511i);
                jSONObject.put("jumpTarget", this.f513j);
                jSONObject.put("logoBannerFile", this.f515k);
                jSONObject.put("portraitCoverUrl", this.f517l);
                jSONObject.put("landscapeCoverUrl", this.f519m);
                jSONObject.put("thumbBannerFile", this.f521n);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = this.f523o;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i11 = 0; i11 < this.f523o.size(); i11++) {
                        jSONArray.put(this.f523o.get(i11));
                    }
                }
                jSONObject.put("expandBanner", jSONArray);
                jSONObject.put("rating", String.valueOf(this.f525p));
                jSONObject.put("promotion", this.f527q);
                jSONObject.put("appName", this.f529r);
                jSONObject.put("appCaption", this.f531s);
                jSONObject.put("appDescription", this.f533t);
                jSONObject.put("contextString", this.f535u);
                jSONObject.put("kind", this.f537v);
                jSONObject.put("adTime", this.f539w);
                jSONObject.put("adExpired", this.f541x);
                jSONObject.put("request", this.f470C);
                jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, this.f472D);
                jSONObject.put("nonServing", this.f473E);
                jSONObject.put("activeView", this.f474F);
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_NAME, this.f475G);
                jSONObject.put("click", this.f476H);
                jSONObject.put("action", this.f477I);
                jSONObject.put("conversion", this.f478J);
                jSONObject.put("feedback", this.f479K);
                jSONObject.put("bidClient", this.f480L);
                jSONObject.put("performance", this.f481M);
                jSONObject.put("viewableImp", this.f482N);
                jSONObject.put("appStore", this.f491W);
                jSONObject.put("adPackage", this.f492X);
                jSONObject.put("vastLink", this.f493Y);
                jSONObject.put("daastLink", this.f496a0);
                jSONObject.put("mute", this.f500c0);
                jSONObject.put("autoPlay", this.f502d0);
                jSONObject.put("allowSkip", this.f504e0);
                jSONObject.put("skipAfter", this.f506f0);
                jSONObject.put("videoMode", this.f508g0);
                jSONObject.put("appFlyer", this.f510h0);
                jSONObject.put("contentScheme", this.f512i0);
                jSONObject.put("metaData", this.f514j0);
                jSONObject.put("excludeOr", this.f543y);
                jSONObject.put("excludeAnd", this.f545z);
                jSONObject.put("includeOr", this.f466A);
                jSONObject.put("includeAnd", this.f468B);
                jSONObject.put("followToken", this.f516k0);
                jSONObject.put("followOAId", this.f518l0);
                jSONObject.put("followData", this.f520m0);
                jSONObject.put("clickable", this.f522n0);
                jSONObject.put("addClickTag", this.f524o0);
                jSONObject.put("price", this.f526p0);
                jSONObject.put("adTemplate", this.f528q0);
                jSONObject.put("isAdtimaVideo", this.f546z0);
                jSONObject.put("zipAdKind", this.f469B0);
                jSONObject.put("isAdBackup", this.f467A0);
                jSONObject.put("imgFormat", this.f471C0);
                jSONObject.put("include", this.f530r0);
                jSONObject.put("exclude", this.f532s0);
                jSONObject.put("omEnable", this.f540w0);
                jSONObject.put("verificationParameters", this.f534t0);
                jSONObject.put("vendorKey", this.f536u0);
                jSONObject.put("verificationScriptUrl", this.f538v0);
                jSONObject.put("scenario", this.f542x0);
                jSONObject.put("bundleCookie", this.f544y0);
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList2 = this.f483O;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    for (int i12 = 0; i12 < this.f483O.size(); i12++) {
                        jSONArray2.put(this.f483O.get(i12));
                    }
                }
                jSONObject.put("creativeView", jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                ArrayList arrayList3 = this.f484P;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    for (int i13 = 0; i13 < this.f484P.size(); i13++) {
                        jSONArray3.put(this.f484P.get(i13));
                    }
                }
                jSONObject.put("firstQuatile", jSONArray3);
                JSONArray jSONArray4 = new JSONArray();
                ArrayList arrayList4 = this.f485Q;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    for (int i14 = 0; i14 < this.f485Q.size(); i14++) {
                        jSONArray4.put(this.f485Q.get(i14));
                    }
                }
                jSONObject.put("midpoint", jSONArray4);
                JSONArray jSONArray5 = new JSONArray();
                ArrayList arrayList5 = this.f486R;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    for (int i15 = 0; i15 < this.f486R.size(); i15++) {
                        jSONArray5.put(this.f486R.get(i15));
                    }
                }
                jSONObject.put("thirdQuatile", jSONArray5);
                JSONArray jSONArray6 = new JSONArray();
                ArrayList arrayList6 = this.f487S;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    for (int i16 = 0; i16 < this.f487S.size(); i16++) {
                        jSONArray6.put(this.f487S.get(i16));
                    }
                }
                jSONObject.put("complete", jSONArray6);
                JSONArray jSONArray7 = new JSONArray();
                ArrayList arrayList7 = this.f488T;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    for (int i17 = 0; i17 < this.f488T.size(); i17++) {
                        jSONArray7.put(this.f488T.get(i17));
                    }
                }
                jSONObject.put("progress", jSONArray7);
                JSONArray jSONArray8 = new JSONArray();
                ArrayList arrayList8 = this.f490V;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    for (int i18 = 0; i18 < this.f490V.size(); i18++) {
                        jSONArray8.put(this.f490V.get(i18));
                    }
                }
                jSONObject.put("trackThirdImpression", jSONArray8);
                JSONArray jSONArray9 = new JSONArray();
                ArrayList arrayList9 = this.f489U;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    for (int i19 = 0; i19 < this.f489U.size(); i19++) {
                        jSONArray9.put(this.f489U.get(i19));
                    }
                }
                jSONObject.put("trackThirdClick", jSONArray9);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
