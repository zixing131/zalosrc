package bp0;

import af0.AbstractC0777e;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.Toast;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.service.ZaloBackgroundService;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import gp0.C19577z;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import ko0.C21786a;
import lo0.AbstractC22588a;
import lo0.AbstractC22605i0;
import lo0.C22589a0;
import lo0.C22590b;
import lo0.C22591b0;
import lo0.C22593c0;
import lo0.C22595d0;
import lo0.C22596e;
import lo0.C22597e0;
import lo0.C22599f0;
import lo0.C22601g0;
import lo0.C22603h0;
import lo0.C22606j;
import lo0.C22607j0;
import lo0.C22608k;
import lo0.C22610l;
import lo0.C22611l0;
import lo0.C22612m;
import lo0.C22613m0;
import lo0.C22614n;
import lo0.C22615n0;
import lo0.C22616o;
import lo0.C22617o0;
import lo0.C22618p;
import lo0.C22619p0;
import lo0.C22620q;
import lo0.C22622r;
import lo0.C22624s;
import lo0.C22629w;
import lo0.C22630x;
import lo0.C22631y;
import lo0.C22632z;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23204s0;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p127eb.C18373b;
import p142ey.C18644n;
import p161fg.C18922m;
import p173fz.C19172a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import ro0.C25942f;
import s00.AbstractC26080o;
import th.AbstractC26681b;
import vg.C28203u6;
import zl0.AbstractC32232i;
import zm.voip.p721ui.incall.GroupCallActivity;
import zm.voip.p721ui.incall.ZmInCallActivity;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32257b4;
import zm.voip.service.C32328p3;

/* renamed from: bp0.i0 */
/* loaded from: classes7.dex */
public abstract class AbstractC3096i0 {

    /* renamed from: a */
    public static Toast f13157a = null;

    /* renamed from: b */
    static String f13158b = null;

    /* renamed from: c */
    public static volatile boolean f13159c = false;

    /* renamed from: d */
    public static volatile boolean f13160d = false;

    /* renamed from: e */
    public static volatile boolean f13161e = false;

    /* renamed from: f */
    public static volatile boolean f13162f = false;

    /* renamed from: g */
    public static volatile boolean f13163g = false;

    /* renamed from: h */
    public static volatile boolean f13164h = false;

    /* renamed from: i */
    public static volatile boolean f13165i = false;

    /* renamed from: j */
    public static volatile boolean f13166j = false;

    /* renamed from: k */
    public static volatile int f13167k = 0;

    /* renamed from: l */
    public static volatile boolean f13168l = false;

    /* renamed from: m */
    public static volatile boolean f13169m = false;

    /* renamed from: n */
    public static volatile boolean f13170n = false;

    /* renamed from: o */
    public static volatile boolean f13171o = false;

    /* renamed from: p */
    public static volatile boolean f13172p = false;

    /* renamed from: q */
    public static volatile boolean f13173q = false;

    /* renamed from: r */
    public static volatile int f13174r;

    /* renamed from: A */
    public static String m15477A(boolean z11, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (z11 && !TextUtils.isEmpty(str)) {
            sb2 = new StringBuilder(str);
        } else {
            List<C25942f> m102407a0 = C19577z.m102341J().m102407a0();
            if (m102407a0 == null || m102407a0.size() == 0) {
                m102407a0 = C32328p3.m156358e().m156362c().m116905o();
            }
            for (C25942f c25942f : m102407a0) {
                if (c25942f.m133661k() != C19577z.m102341J().m102388Q() && !TextUtils.isEmpty(c25942f.m133656f())) {
                    sb2.append(c25942f.m133656f());
                    sb2.append(", ");
                }
            }
            if (sb2.length() > 2) {
                sb2.delete(sb2.length() - 2, sb2.length());
            }
        }
        return sb2.toString();
    }

    /* renamed from: A0 */
    static void m15478A0(C22608k c22608k, JSONObject jSONObject) {
        try {
            if (jSONObject.has("receiverId")) {
                c22608k.m116949g(jSONObject.getInt("receiverId"));
            }
            if (jSONObject.has("ts")) {
                c22608k.m116951i(jSONObject.getInt("ts"));
            }
            if (jSONObject.has("id")) {
                c22608k.m116947e(jSONObject.getInt("id"));
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                c22608k.m116952j(jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE));
            }
            if (jSONObject.has("data")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.get("data").toString());
                if (jSONObject2.has("Sticker_id")) {
                    c22608k.m116950h(jSONObject2.getInt("Sticker_id"));
                }
                if (jSONObject2.has("Cate_id")) {
                    c22608k.m116948f(jSONObject2.getInt("Cate_id"));
                }
                if (jSONObject2.has("sticker_type")) {
                    c22608k.m116952j(jSONObject2.getInt("sticker_type"));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    public static File m15479B(Context context) {
        if (AbstractC3082b0.m15426h() && context != null) {
            return m15481C(context);
        }
        return null;
    }

    /* renamed from: B0 */
    static void m15480B0(C22614n c22614n, JSONObject jSONObject) {
        try {
            if (jSONObject.has("id")) {
                c22614n.f110754c = jSONObject.getInt("id");
            }
            if (jSONObject.has("reveiverId")) {
                c22614n.f110755d = jSONObject.getInt("reveiverId");
            }
            if (jSONObject.has("status")) {
                c22614n.f110756e = jSONObject.getInt("status");
            }
            if (jSONObject.has("codec")) {
                c22614n.f110757f = jSONObject.getString("codec");
            }
            if (jSONObject.has("extendData")) {
                c22614n.f110758g = jSONObject.getString("extendData");
            }
            if (jSONObject.has("platform")) {
                c22614n.f110759h = jSONObject.getInt("platform");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: C */
    public static File m15481C(Context context) {
        File m15485E = m15485E(context);
        if (m15485E != null) {
            return new File(m15485E.getAbsoluteFile() + File.separator + "callLog.txt");
        }
        return null;
    }

    /* renamed from: C0 */
    static void m15482C0(C22618p c22618p, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject2;
        if (c22618p == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("id")) {
                str = "supportCallBusy";
                c22618p.f110780Q = jSONObject.getInt("id");
            } else {
                str = "supportCallBusy";
            }
            if (jSONObject.has("ts")) {
                str2 = "id";
                str3 = "extraInfo";
                c22618p.f110781R = jSONObject.getLong("ts");
            } else {
                str2 = "id";
                str3 = "extraInfo";
            }
            if (jSONObject.has("Dname")) {
                c22618p.f110782S = jSONObject.getString("Dname");
            }
            if (jSONObject.has("avatar")) {
                c22618p.f110783T = jSONObject.getString("avatar");
            }
            if (jSONObject.has("sessId")) {
                c22618p.f110786W = jSONObject.getString("sessId");
            }
            if (jSONObject.has("rtpSerIp")) {
                c22618p.f110787X = jSONObject.getString("rtpSerIp");
            }
            if (jSONObject.has("rtpIP")) {
                c22618p.f110788Y = jSONObject.getString("rtpIP");
            }
            if (jSONObject.has("protocol")) {
                c22618p.f110789Z = jSONObject.getInt("protocol");
            }
            if (jSONObject.has("codec")) {
                c22618p.f110790a0 = jSONObject.getString("codec");
            }
            if (jSONObject.has("rtcpIP")) {
                c22618p.f110791b0 = jSONObject.getString("rtcpIP");
            }
            if (jSONObject.has("extendData")) {
                c22618p.f110792c0 = jSONObject.getString("extendData");
            }
            boolean z11 = true;
            try {
                if (!TextUtils.isEmpty(c22618p.f110792c0)) {
                    JSONObject jSONObject3 = new JSONObject(c22618p.f110792c0);
                    if (jSONObject3.has("callType")) {
                        c22618p.f110796g0 = jSONObject3.getInt("callType") == 1;
                    }
                    if (jSONObject3.has(str3) && (jSONObject2 = jSONObject3.getJSONObject(str3)) != null) {
                        c22618p.f110536P.f123693a = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
                        c22618p.f110536P.f123694b = jSONObject2.optInt(str2);
                        c22618p.f110536P.f123695c = jSONObject2.optString("avatar");
                        c22618p.f110536P.f123696d = jSONObject2.optString("name");
                    }
                    String str4 = str;
                    if (jSONObject3.has(str4)) {
                        c22618p.f110797h0 = jSONObject3.getInt(str4) == 1;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            if (jSONObject.has("showIncomingBefore")) {
                c22618p.f110793d0 = jSONObject.getInt("showIncomingBefore") == 1;
            }
            if (jSONObject.has("checkExpire")) {
                c22618p.f110794e0 = jSONObject.getInt("checkExpire");
            }
            if (jSONObject.has("platform")) {
                c22618p.f110795f0 = jSONObject.getInt("platform");
            }
            if (jSONObject.has("authenNoDelay")) {
                c22618p.f110800k0 = jSONObject.getInt("authenNoDelay");
            }
            if (jSONObject.has("parallelInit")) {
                c22618p.f110801l0 = jSONObject.getInt("parallelInit") == 1;
            }
            if (jSONObject.has("withOA")) {
                c22618p.f110803n0 = jSONObject.optBoolean("withOA", false);
            }
            if (jSONObject.has("displaySelfView")) {
                c22618p.f110804o0 = jSONObject.optInt("displaySelfView", 1);
            }
            c22618p.f110532L = jSONObject.optInt("enableSwitchCamera", 1);
            c22618p.f110533M = jSONObject.optInt("enableOffCamera", 1);
            c22618p.f110534N = jSONObject.optInt("displayZInstantView", 0);
            if (jSONObject.has("showDtmf")) {
                c22618p.f110805p0 = jSONObject.optBoolean("showDtmf", false);
            }
            if (jSONObject.has("OAType")) {
                if (jSONObject.optInt("OAType") != 1) {
                    z11 = false;
                }
                c22618p.f110806q0 = z11;
            }
            if (jSONObject.has("pingInterval")) {
                c22618p.f110802m0 = jSONObject.getInt("pingInterval");
            }
            if (!jSONObject.isNull("reason")) {
                c22618p.f110807r0 = jSONObject.getString("reason");
            }
            if (!jSONObject.isNull("enableA2V")) {
                c22618p.f110808s0 = jSONObject.optBoolean("enableA2V");
            }
            c22618p.f110785V = jSONObject.optString("msg");
            c22618p.f110784U = jSONObject.optInt("status", 0);
            m15492H0(c22618p, jSONObject);
            m15500L0(c22618p, jSONObject);
            m15498K0(c22618p, jSONObject);
            m15567u0(c22618p, jSONObject);
            m15553n0(c22618p, jSONObject);
            m15490G0(c22618p, jSONObject);
            m15565t0(c22618p, jSONObject);
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: D */
    public static String m15483D(Context context, String str, String str2, String str3) {
        File m15485E = m15485E(context);
        if (m15485E != null) {
            return m15485E.getAbsoluteFile() + File.separator + (str + "_" + str2 + "_" + str3).toString();
        }
        return "";
    }

    /* renamed from: D0 */
    static void m15484D0(C22620q c22620q, JSONObject jSONObject) {
        String str;
        boolean z11;
        if (c22620q != null && jSONObject != null) {
            try {
                if (jSONObject.has("id")) {
                    str = "withOA";
                    c22620q.f110818Q = jSONObject.getInt("id");
                } else {
                    str = "withOA";
                }
                if (jSONObject.has("status")) {
                    c22620q.f110820S = jSONObject.getInt("status");
                }
                if (jSONObject.has("toId")) {
                    c22620q.f110819R = jSONObject.getInt("toId");
                }
                if (jSONObject.has("msg")) {
                    c22620q.f110821T = jSONObject.getString("msg");
                }
                if (jSONObject.has("msgBubble")) {
                    c22620q.f110823V = jSONObject.getString("msgBubble");
                }
                if (jSONObject.has("protocol")) {
                    c22620q.f110822U = jSONObject.getInt("protocol");
                }
                if (jSONObject.has("sessId")) {
                    c22620q.f110824W = jSONObject.getString("sessId");
                }
                if (jSONObject.has("pingInterval")) {
                    c22620q.f110825X = jSONObject.getInt("pingInterval");
                }
                m15492H0(c22620q, jSONObject);
                m15500L0(c22620q, jSONObject);
                m15498K0(c22620q, jSONObject);
                m15567u0(c22620q, jSONObject);
                m15553n0(c22620q, jSONObject);
                m15490G0(c22620q, jSONObject);
                if (jSONObject.has("changeZRTP")) {
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("changeZRTP");
                        if (jSONObject2 != null && jSONObject2.has("enable")) {
                            c22620q.f110826Y = jSONObject2.getInt("enable");
                        }
                    } catch (Exception unused) {
                        AbstractC3082b0.m15422d("VoipUtils", "parseJSONChangeZRTPForVoiceRequestCall error");
                    }
                }
                if (jSONObject.has("extraInfo")) {
                    try {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("extraInfo");
                        if (jSONObject3 != null) {
                            c22620q.f110551q = jSONObject3.toString();
                            c22620q.f110536P.f123693a = jSONObject3.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
                            c22620q.f110536P.f123694b = jSONObject3.optInt("id");
                            c22620q.f110536P.f123695c = jSONObject3.optString("avatar");
                            c22620q.f110536P.f123696d = jSONObject3.optString("name");
                        }
                    } catch (Exception unused2) {
                        AbstractC3082b0.m15422d("VoipUtils", "parseJSONExtraForVoiceRequestCall error");
                    }
                }
                m15565t0(c22620q, jSONObject);
                if (jSONObject.has("timeoutNotRingring")) {
                    c22620q.f110827Z = jSONObject.getInt("timeoutNotRingring");
                }
                if (jSONObject.has("timeoutRinging")) {
                    c22620q.f110828a0 = jSONObject.getInt("timeoutRinging");
                }
                String str2 = str;
                if (jSONObject.has(str2)) {
                    c22620q.f110829b0 = jSONObject.optBoolean(str2, false);
                }
                if (jSONObject.has("showDtmf")) {
                    c22620q.f110830c0 = jSONObject.optBoolean("showDtmf", false);
                }
                if (jSONObject.has("OAType")) {
                    if (jSONObject.optInt("OAType", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c22620q.f110831d0 = z11;
                }
                if (!jSONObject.isNull("reason")) {
                    c22620q.f110832e0 = jSONObject.optString("reason");
                }
                if (!jSONObject.isNull("Dname")) {
                    c22620q.f110833f0 = jSONObject.optString("Dname");
                }
                if (!jSONObject.isNull("avatar")) {
                    c22620q.f110834g0 = jSONObject.optString("avatar");
                }
                if (!jSONObject.isNull("ringBackTone")) {
                    c22620q.f110835h0 = jSONObject.optInt("ringBackTone");
                }
                if (!jSONObject.isNull("enableA2V")) {
                    c22620q.f110836i0 = jSONObject.optBoolean("enableA2V", false);
                }
                if (!jSONObject.isNull("displaySelfView")) {
                    c22620q.f110837j0 = jSONObject.optInt("displaySelfView", 1);
                }
                c22620q.f110532L = jSONObject.optInt("enableSwitchCamera", 1);
                c22620q.f110533M = jSONObject.optInt("enableOffCamera", 1);
                c22620q.f110534N = jSONObject.optInt("displayZInstantView", 0);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: E */
    public static File m15485E(Context context) {
        return m15503N(context, "logs", false);
    }

    /* renamed from: E0 */
    static void m15486E0(C22612m c22612m, JSONObject jSONObject) {
        try {
            if (jSONObject.has("receiverId")) {
                c22612m.m116961g(jSONObject.getInt("receiverId"));
            }
            if (jSONObject.has("ts")) {
                c22612m.m116962h(jSONObject.getInt("ts"));
            }
            if (jSONObject.has("id")) {
                c22612m.m116959e(jSONObject.getInt("id"));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("ZInstantData");
            if (optJSONObject != null) {
                c22612m.m116960f(optJSONObject);
            }
            c22612m.m116963i(jSONObject.optInt("ZInstantId"));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: F */
    public static String m15487F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC23204s0.m119552c(null));
        String str = File.separator;
        sb2.append(str);
        sb2.append(m15497K());
        sb2.append(str);
        sb2.append("imagecache");
        return sb2.toString();
    }

    /* renamed from: F0 */
    static void m15488F0(C22610l c22610l, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("zinstant");
            if (optJSONObject != null) {
                c22610l.m116954b(optJSONObject);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: G */
    public static File m15489G(Context context) {
        return m15503N(context, "record", false);
    }

    /* renamed from: G0 */
    static void m15490G0(AbstractC22588a abstractC22588a, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("servers")) {
            try {
                abstractC22588a.f110535O = jSONObject.getString("servers");
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("VoipUtils", "parseJSONServersForVoiceRequestMsg error = " + e11.toString());
            }
        }
    }

    /* renamed from: H */
    public static String m15491H(Context context, String str) {
        File m15493I = m15493I(context);
        if (m15493I != null) {
            return m15493I.getAbsoluteFile() + File.separator + str.toString();
        }
        return "";
    }

    /* renamed from: H0 */
    static void m15492H0(AbstractC22588a abstractC22588a, JSONObject jSONObject) {
        boolean z11;
        if (jSONObject != null && jSONObject.has("settings")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                if (jSONObject2 != null) {
                    abstractC22588a.f110549o = jSONObject2;
                    if (jSONObject2.has("logDebug")) {
                        abstractC22588a.f110546l = jSONObject2.getInt("logDebug");
                    }
                    boolean z12 = false;
                    if (jSONObject2.has("supportCallBusy")) {
                        if (jSONObject2.getInt("supportCallBusy") == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        abstractC22588a.f110547m = z11;
                    }
                    if (jSONObject2.has("supportResumeCall")) {
                        if (jSONObject2.getInt("supportResumeCall") == 1) {
                            z12 = true;
                        }
                        abstractC22588a.f110548n = z12;
                    }
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("VoipUtils", "parseJSONSettingForVoiceRequestMsg error = " + e11.toString());
            }
        }
    }

    /* renamed from: I */
    public static File m15493I(Context context) {
        return m15503N(context, "record_nw", false);
    }

    /* renamed from: I0 */
    static void m15494I0(C22617o0 c22617o0, JSONObject jSONObject) {
        try {
            if (jSONObject.has("id")) {
                c22617o0.f110770c = jSONObject.getInt("id");
            }
            if (jSONObject.has("config")) {
                c22617o0.f110775h = jSONObject.getString("config");
            }
            if (jSONObject.has("status")) {
                c22617o0.f110777j = jSONObject.getInt("status");
            }
            if (jSONObject.has("needACK")) {
                c22617o0.f110778k = jSONObject.getInt("needACK");
            }
            if (jSONObject.has("msg")) {
                c22617o0.f110779l = jSONObject.optString("msg");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public static String m15495J() {
        return C19172a.m100606q("features@voip@display_rbt@url");
    }

    /* renamed from: J0 */
    static void m15496J0(C22619p0 c22619p0, JSONObject jSONObject) {
        try {
            if (jSONObject.has("id")) {
                c22619p0.f110809c = jSONObject.getInt("id");
            }
            if (jSONObject.has("zrtcConfig")) {
                c22619p0.f110814h = jSONObject.getString("zrtcConfig");
            }
            if (jSONObject.has("status")) {
                c22619p0.f110816j = jSONObject.getInt("status");
            }
            if (jSONObject.has("needACK")) {
                c22619p0.f110817k = jSONObject.getInt("needACK");
            }
            if (jSONObject.has("clientSetting")) {
                c22619p0.f110815i = jSONObject.getString("clientSetting");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K */
    public static String m15497K() {
        return "zalo" + File.separator + "voip";
    }

    /* renamed from: K0 */
    static void m15498K0(AbstractC22588a abstractC22588a, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("video")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("video");
                if (jSONObject2 != null && jSONObject2.has("enable")) {
                    abstractC22588a.f110531K = jSONObject2.getInt("enable");
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("VoipUtils", "parseJSONVideoForVoiceRequestMsg error = " + e11.toString());
            }
        }
    }

    /* renamed from: L */
    static File m15499L(Context context, boolean z11) {
        try {
            File file = new File(AbstractC23204s0.m119552c(null));
            if (!file.canWrite() || z11) {
                file = context.getCacheDir();
            }
            if (!file.canWrite()) {
                return null;
            }
            File file2 = new File(file.getAbsolutePath() + File.separator + m15497K());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: L0 */
    static void m15500L0(AbstractC22588a abstractC22588a, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("zrtc_config")) {
            try {
                abstractC22588a.f110550p = jSONObject.getJSONObject("zrtc_config");
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("VoipUtils", "parseJSONSettingForVoiceRequestMsg error = " + e11);
            }
        }
    }

    /* renamed from: M */
    public static String m15501M(JSONObject jSONObject) {
        try {
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: M0 */
    public static void m15502M0(C22601g0 c22601g0, JSONObject jSONObject) {
        boolean z11;
        try {
            if (c22601g0.f110711c == 0) {
                JSONArray optJSONArray = jSONObject.optJSONArray("toId");
                if (optJSONArray != null) {
                    c22601g0.f110681d = optJSONArray.toString();
                }
                c22601g0.f110686i = jSONObject.optString("msg");
                c22601g0.f110693p = jSONObject.optString("msg");
                c22601g0.f110684g = jSONObject.optInt("maxUsers");
                c22601g0.f110685h = jSONObject.optInt("groupId");
                c22601g0.f110683f = jSONObject.optInt("hostCall");
                c22601g0.f110692o = jSONObject.optInt("fromId");
                c22601g0.f110682e = jSONObject.optInt("id");
                c22601g0.f110695r = jSONObject.optLong("ts");
                c22601g0.f110694q = jSONObject.optJSONObject("failedId");
                c22601g0.f110696s = jSONObject.optInt("gridMaxUser");
                c22601g0.f110690m = jSONObject.optInt("noResetIfChangeOutput");
                if (jSONObject.has("callSetting")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("callSetting");
                    c22601g0.f110687j = jSONObject2.toString();
                    boolean z12 = false;
                    if (jSONObject2.optInt("showDebugInfo") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c22601g0.f110689l = z11;
                    c22601g0.f110688k = jSONObject2.optString("session");
                    if (jSONObject2.optInt("logDebug") == 1) {
                        z12 = true;
                    }
                    c22601g0.f110691n = z12;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N */
    static File m15503N(Context context, String str, boolean z11) {
        File m15499L = m15499L(context, z11);
        if (m15499L != null) {
            File file = new File(m15499L.getAbsoluteFile() + File.separator + str);
            file.mkdirs();
            return file;
        }
        return null;
    }

    /* renamed from: N0 */
    public static void m15504N0(C22603h0 c22603h0, JSONObject jSONObject) {
        boolean z11;
        try {
            int optInt = jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            c22603h0.f110704f = optInt;
            if (optInt == 0) {
                c22603h0.f110702d = jSONObject.optInt("callId");
                c22603h0.f110703e = jSONObject.optInt("hostCall");
                c22603h0.f110705g = jSONObject.optInt("userId");
                if (jSONObject.has("partnerInfo")) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("partnerInfo");
                        int length = jSONArray.length();
                        c22603h0.f110706h = new C25942f[length];
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            c22603h0.f110706h[i11] = new C25942f();
                            if (jSONObject2.has("userId")) {
                                int i12 = jSONObject2.getInt("userId");
                                C25942f c25942f = c22603h0.f110706h[i11];
                                if (c22603h0.f110703e == i12) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                c25942f.m133668r(z11);
                                c22603h0.f110706h[i11].m133675y(i12);
                            }
                            if (jSONObject2.has("callState")) {
                                c22603h0.f110706h[i11].m133673w(jSONObject2.getInt("callState"));
                            }
                            if (jSONObject2.has("audioState")) {
                                c22603h0.f110706h[i11].m133666p(jSONObject2.getInt("audioState"));
                            }
                            if (jSONObject2.has("videoState")) {
                                c22603h0.f110706h[i11].m133676z(jSONObject2.getInt("videoState"));
                            }
                            if (jSONObject2.has("lastActivate")) {
                                c22603h0.f110706h[i11].m133669s(jSONObject2.getLong("lastActivate"));
                            }
                            if (jSONObject2.has("timeJoinCall")) {
                                c22603h0.f110706h[i11].m133674x(jSONObject2.getLong("timeJoinCall"));
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: O */
    public static boolean m15505O() {
        return f13159c;
    }

    /* renamed from: O0 */
    public static void m15506O0(C22607j0 c22607j0, JSONObject jSONObject) {
        try {
            c22607j0.f110715d = jSONObject.optInt("id");
            c22607j0.f110716e = jSONObject.optLong("ts");
            c22607j0.f110717f = jSONObject.optString("receiverId");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public static Boolean m15507P(Context context) {
        boolean z11;
        if (AbstractC3108t.m15712a(context, new String[]{"android.permission.CAMERA"}) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    /* renamed from: P0 */
    public static AbstractC22605i0 m15508P0(String str, int i11) {
        AbstractC22605i0 c22599f0;
        JSONObject jSONObject;
        AbstractC22605i0 abstractC22605i0 = null;
        try {
            if (i11 == 460) {
                c22599f0 = new C22603h0();
            } else if (i11 == 450) {
                c22599f0 = new C22601g0();
            } else if (i11 == 470) {
                c22599f0 = new C22630x();
            } else if (i11 == 465) {
                c22599f0 = new C22595d0();
            } else if (i11 == 452) {
                c22599f0 = new C22607j0();
            } else if (i11 == 453) {
                c22599f0 = new C22589a0();
            } else if (i11 == 454) {
                c22599f0 = new C22631y();
            } else if (i11 == 455) {
                c22599f0 = new C22591b0();
            } else if (i11 == 4511) {
                c22599f0 = new C22597e0();
            } else if (i11 == 462) {
                c22599f0 = new C22632z();
            } else if (i11 == 471) {
                c22599f0 = new C22593c0();
            } else if (i11 == 457) {
                c22599f0 = new C22599f0();
            } else {
                AbstractC3082b0.m15421c("DUNGNN", "NOT SUPPORT CMD GROUP_CALL !!");
                return null;
            }
            abstractC22605i0 = c22599f0;
            jSONObject = new JSONObject(str);
            abstractC22605i0.f110709a = jSONObject.getInt("error_code");
            abstractC22605i0.f110710b = jSONObject.getString("error_message");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (jSONObject.has("data") && !jSONObject.isNull("data")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                if (optJSONObject.has("status")) {
                    abstractC22605i0.f110711c = optJSONObject.getInt("status");
                }
                AbstractC3082b0.m15421c("VoipUtils", "status: " + abstractC22605i0.f110711c + " data: " + optJSONObject.toString());
                if (i11 == 460) {
                    m15504N0((C22603h0) abstractC22605i0, optJSONObject);
                } else if (i11 == 450) {
                    m15502M0((C22601g0) abstractC22605i0, optJSONObject);
                } else if (i11 == 470) {
                    m15535e0((C22630x) abstractC22605i0, optJSONObject);
                } else if (i11 == 465) {
                    m15551m0((C22595d0) abstractC22605i0, optJSONObject);
                } else if (i11 == 452) {
                    m15506O0((C22607j0) abstractC22605i0, optJSONObject);
                } else if (i11 == 453) {
                    m15541h0((C22589a0) abstractC22605i0, optJSONObject);
                } else if (i11 == 454) {
                    m15537f0((C22631y) abstractC22605i0, optJSONObject);
                } else if (i11 == 455) {
                    m15543i0((C22591b0) abstractC22605i0, optJSONObject);
                } else if (i11 == 4511) {
                    m15547k0((C22597e0) abstractC22605i0, optJSONObject);
                } else if (i11 == 462) {
                    m15539g0((C22632z) abstractC22605i0, optJSONObject);
                } else if (i11 == 471) {
                    m15545j0((C22593c0) abstractC22605i0, optJSONObject);
                } else if (i11 == 457) {
                    m15549l0((C22599f0) abstractC22605i0, optJSONObject);
                }
            }
            return abstractC22605i0;
        }
        return abstractC22605i0;
    }

    /* renamed from: Q */
    public static boolean m15509Q() {
        if (Build.VERSION.SDK_INT < 31 && !m15511R() && AbstractC26681b.f126360e) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    public static void m15510Q0(boolean z11) {
        f13161e = z11;
    }

    /* renamed from: R */
    public static boolean m15511R() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= AbstractC23304d.f113307N1 && i11 >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: R0 */
    public static void m15512R0(boolean z11) {
        f13162f = z11;
    }

    /* renamed from: S */
    public static boolean m15513S() {
        return f13161e;
    }

    /* renamed from: S0 */
    private static void m15514S0(Context context, String str, int i11) {
        AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: bp0.e0

            /* renamed from: p */
            public final /* synthetic */ String f13147p;

            /* renamed from: q */
            public final /* synthetic */ Context f13148q;

            /* renamed from: r */
            public final /* synthetic */ int f13149r;

            public /* synthetic */ RunnableC3088e0(String str2, Context context2, int i112) {
                r1 = str2;
                r2 = context2;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3096i0.m15524Y(r1, r2, r3);
            }
        });
    }

    /* renamed from: T */
    public static boolean m15515T() {
        return f13162f;
    }

    /* renamed from: T0 */
    public static void m15516T0(int i11) {
        m15514S0(m15574y(), m15574y().getResources().getString(i11), 1);
    }

    /* renamed from: U */
    public static /* synthetic */ void m15517U(boolean z11) {
        try {
            Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloBackgroundService.class);
            intent.setAction("com.zing.zalo.intent.action.PICK_SERVICE");
            intent.putExtra("EXTRA_START_FOREGROUND_CALL", z11);
            MainApplication.getAppContext().startService(intent);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoipUtils", "checkToStartZaloService: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: U0 */
    public static void m15518U0(String str) {
        m15514S0(m15574y(), str, 1);
    }

    /* renamed from: V */
    public static /* synthetic */ void m15519V() {
        m15558q(m15570w(), 3);
        m15558q(m15568v(), 3);
    }

    /* renamed from: V0 */
    public static void m15520V0(int i11) {
        m15514S0(m15574y(), m15574y().getResources().getString(i11), 0);
    }

    /* renamed from: W */
    public static /* synthetic */ int m15521W(File file, File file2) {
        return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
    }

    /* renamed from: W0 */
    public static void m15522W0(String str) {
        m15514S0(m15574y(), str, 0);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m15524Y(String str, Context context, int i11) {
        Toast toast = f13157a;
        if (toast != null) {
            toast.cancel();
        }
        if (str != null && str.equals(f13158b)) {
            Toast makeText = Toast.makeText(context, str, i11);
            f13157a = makeText;
            makeText.show();
        } else {
            f13158b = str;
            Toast makeText2 = Toast.makeText(context, str, i11);
            f13157a = makeText2;
            makeText2.show();
        }
    }

    /* renamed from: Z */
    public static void m15525Z() {
        try {
            NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84876S);
            C18373b.f92745c = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public static int m15527a0(int i11, int i12) {
        return i11 > i12 ? i11 : i12;
    }

    /* renamed from: b0 */
    public static int m15529b0(int i11, int i12) {
        return i11 < i12 ? i11 : i12;
    }

    /* renamed from: c0 */
    public static Intent m15531c0() {
        Intent intent = new Intent(m15574y(), (Class<?>) ZmInCallActivity.class);
        intent.setFlags(805306368);
        return intent;
    }

    /* renamed from: d0 */
    public static Intent m15533d0() {
        Intent intent = new Intent(m15574y(), (Class<?>) GroupCallActivity.class);
        intent.setFlags(805306368);
        return intent;
    }

    /* renamed from: e0 */
    public static void m15535e0(C22630x c22630x, JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        try {
            if (c22630x.f110711c == 0) {
                c22630x.f110977e = jSONObject.optInt("receiverId");
                if (jSONObject.has("toId")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("toId");
                    int length = jSONArray.length();
                    c22630x.f110976d = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = jSONArray.getInt(i11);
                        c22630x.f110976d[i11] = i12;
                        if (i12 == c22630x.f110977e) {
                            c22630x.f110982j = true;
                        }
                    }
                }
                c22630x.f110981i = jSONObject.optInt("hostCall");
                c22630x.f110979g = jSONObject.optInt("groupId");
                c22630x.f110980h = jSONObject.optInt("id");
                c22630x.f110983k = jSONObject.optJSONObject("failedId");
                c22630x.f110986n = jSONObject.optString("fromAvatar");
                c22630x.f110985m = jSONObject.optString("fromName");
                c22630x.f110984l = jSONObject.optInt("fromId");
                c22630x.f110987o = jSONObject.optInt("addType");
                if (jSONObject.has("partnerInfo")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("partnerInfo");
                    int length2 = jSONArray2.length();
                    c22630x.f110978f = new C25942f[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i13);
                        int optInt = jSONObject2.optInt("userId");
                        ContactProfile m98552o = C18644n.m98531l().m98552o("" + optInt);
                        if (m98552o == null) {
                            m98552o = C28203u6.f131407a.m141809c("" + optInt);
                        }
                        String m118085e = AbstractC23028c0.m118085e(m98552o, true, AbstractC8020f0.str_me);
                        c22630x.f110978f[i13] = new C25942f();
                        c22630x.f110978f[i13].m133675y(optInt);
                        C25942f c25942f = c22630x.f110978f[i13];
                        if (TextUtils.isEmpty(m118085e)) {
                            m118085e = jSONObject2.optString("name");
                        }
                        c25942f.m133670t(m118085e);
                        c22630x.f110978f[i13].m133667q(jSONObject2.optString("avatar"));
                        C25942f c25942f2 = c22630x.f110978f[i13];
                        if (c22630x.f110981i == optInt) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c25942f2.m133668r(z11);
                        C25942f c25942f3 = c22630x.f110978f[i13];
                        if (jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c25942f3.m133671u(z12);
                        if (jSONObject2.has("ownerId")) {
                            c22630x.f110978f[i13].m133672v(jSONObject2.optInt("ownerId"));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static boolean m15536f() {
        if (AbstractC23034c6.m118130P(m15574y()) && AbstractC23309i.m121627Y2() && AbstractC23309i.m121776c2() == 1 && !C32257b4.m155726m().m155737l().m117038K0() && (((C32257b4.m155726m().m155737l().m117047N0() && C32257b4.m155726m().m155737l().m117126k0()) || C32328p3.m156358e().m156362c().m116854J()) && m15511R())) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public static void m15537f0(C22631y c22631y, JSONObject jSONObject) {
        try {
            c22631y.f110989e = jSONObject.optInt("hostCall");
            c22631y.f110991g = jSONObject.optInt("fromId");
            c22631y.f110988d = jSONObject.optInt("callId");
            c22631y.f110990f = jSONObject.optLong("ts");
            c22631y.f110994j = jSONObject.optInt("audioState");
            c22631y.f110995k = jSONObject.optInt("videoState");
            try {
                if (jSONObject.has("partnerInfo")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("partnerInfo");
                    int length = jSONArray.length();
                    c22631y.f110992h = new C25942f[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        c22631y.f110992h[i11] = new C25942f();
                        if (jSONObject2.has("userId")) {
                            c22631y.f110992h[i11].m133675y(jSONObject2.getInt("userId"));
                        }
                        if (jSONObject2.has("callState")) {
                            c22631y.f110992h[i11].m133673w(jSONObject2.getInt("callState"));
                        }
                        if (jSONObject2.has("audioState")) {
                            c22631y.f110992h[i11].m133666p(jSONObject2.getInt("audioState"));
                        }
                        if (jSONObject2.has("videoState")) {
                            c22631y.f110992h[i11].m133676z(jSONObject2.getInt("videoState"));
                        }
                        if (jSONObject2.has("lastActivate")) {
                            c22631y.f110992h[i11].m133669s(jSONObject2.getLong("lastActivate"));
                        }
                        if (jSONObject2.has("joinCall")) {
                            c22631y.f110992h[i11].m133674x(jSONObject2.getLong("joinCall"));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: g */
    public static boolean m15538g() {
        if (m15509Q() && AbstractC23309i.m121627Y2() && AbstractC23309i.m121776c2() == 1 && AbstractC23034c6.m118126L(m15574y())) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public static void m15539g0(C22632z c22632z, JSONObject jSONObject) {
        try {
            c22632z.f110996d = jSONObject.optInt("callId");
            c22632z.f110997e = jSONObject.optInt("userId");
            c22632z.f110998f = jSONObject.optInt("audioState");
            c22632z.f110999g = jSONObject.optInt("videoState");
            c22632z.f111000h = jSONObject.optInt("callState");
            c22632z.f111001i = jSONObject.optLong("timeJoinCall");
            c22632z.f111002j = jSONObject.optLong("lastActivate");
            c22632z.f111003k = jSONObject.optInt("hostCall");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static boolean m15540h() {
        if (!ZaloLauncherActivity.m57091m6() && ((!C18922m.m99141t().m99164y() || !AbstractC32232i.m155459g(m15574y())) && !ZaloBubbleActivity.m57017B5())) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    public static void m15541h0(C22589a0 c22589a0, JSONObject jSONObject) {
        try {
            c22589a0.f110562e = jSONObject.optInt("hostCall");
            c22589a0.f110561d = jSONObject.optInt("id");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public static void m15542i(String str) {
        Toast toast;
        if (str != null) {
            try {
                if (str.equals(f13158b) && (toast = f13157a) != null) {
                    toast.cancel();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: i0 */
    public static void m15543i0(C22591b0 c22591b0, JSONObject jSONObject) {
        try {
            c22591b0.f110572e = jSONObject.optInt("hostCall");
            c22591b0.f110573f = jSONObject.optInt("fromId");
            c22591b0.f110571d = jSONObject.optInt("id");
            c22591b0.f110574g = jSONObject.optLong("ts");
            c22591b0.f110575h = jSONObject.optInt("reason", -1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static boolean m15544j(C22622r c22622r) {
        if (c22622r.f110866a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public static void m15545j0(C22593c0 c22593c0, JSONObject jSONObject) {
        try {
            c22593c0.f110623d = jSONObject.optInt("id");
            c22593c0.f110624e = jSONObject.optInt("hostCall");
            c22593c0.f110625f = jSONObject.optInt("fromId");
            c22593c0.f110626g = jSONObject.optString("config", "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static boolean m15546k(AbstractC22605i0 abstractC22605i0) {
        if (abstractC22605i0.f110709a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    public static void m15547k0(C22597e0 c22597e0, JSONObject jSONObject) {
        try {
            c22597e0.f110656h = jSONObject.optInt("hostCall");
            c22597e0.f110653e = jSONObject.optInt("protocol");
            c22597e0.f110655g = jSONObject.optInt("id");
            c22597e0.f110654f = jSONObject.optInt("groupId");
            c22597e0.f110657i = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_INTERVAL, AbstractC26080o.a.f124275b);
            c22597e0.f110658j = jSONObject.optInt("pingTimeout", 45000);
            if (jSONObject.has("toId")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("toId");
                    int length = jSONArray.length();
                    c22597e0.f110652d = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        c22597e0.f110652d[i11] = jSONArray.getInt(i11);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: l */
    public static boolean m15548l(boolean z11) {
        if (!ZaloBackgroundService.m50458i(MainApplication.getAppContext())) {
            AbstractC0777e.m1935a("voip checkStartForegroundService");
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: bp0.d0

                /* renamed from: p */
                public final /* synthetic */ boolean f13146p;

                public /* synthetic */ RunnableC3086d0(boolean z112) {
                    r1 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3096i0.m15517U(r1);
                }
            });
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public static void m15549l0(C22599f0 c22599f0, JSONObject jSONObject) {
        JSONArray jSONArray;
        int i11;
        String str;
        String str2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str3 = "videoState";
        String str4 = "audioState";
        try {
            if (!jSONObject.isNull("msg")) {
                c22599f0.f110666g = jSONObject.getString("msg");
            }
            c22599f0.f110671l = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_INTERVAL, AbstractC26080o.a.f124275b);
            c22599f0.f110672m = jSONObject.optInt("pingTimeout", 450000);
            c22599f0.f110664e = jSONObject.optInt("hostCall");
            c22599f0.f110663d = jSONObject.optInt("id");
            c22599f0.f110665f = jSONObject.optInt("userId");
            c22599f0.f110676q = jSONObject.optInt("gridMaxUser");
            String str5 = "ownerId";
            String str6 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
            c22599f0.f110675p = jSONObject.optLong("ts");
            c22599f0.f110677r = jSONObject.optInt("noResetIfChangeOutput");
            if (jSONObject.has("callSetting")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("callSetting");
                c22599f0.f110667h = jSONObject2.toString();
                if (jSONObject2.optInt("showDebugInfo") == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c22599f0.f110673n = z13;
                c22599f0.f110668i = jSONObject2.optString("session");
                if (jSONObject2.optInt("logDebug") == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c22599f0.f110674o = z14;
            }
            if (jSONObject.has("partnerInfo")) {
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("partnerInfo");
                    JSONArray jSONArray3 = new JSONArray();
                    int length = jSONArray2.length();
                    c22599f0.f110669j = new C25942f[length];
                    int i12 = 0;
                    while (i12 < length) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                        c22599f0.f110669j[i12] = new C25942f();
                        if (jSONObject3.has("userId")) {
                            int i13 = jSONObject3.getInt("userId");
                            jSONArray = jSONArray2;
                            C25942f c25942f = c22599f0.f110669j[i12];
                            i11 = length;
                            if (c22599f0.f110664e == i13) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            c25942f.m133668r(z12);
                            c22599f0.f110669j[i12].m133675y(i13);
                            jSONArray3.put(i13);
                        } else {
                            jSONArray = jSONArray2;
                            i11 = length;
                        }
                        if (jSONObject3.has("avatar")) {
                            c22599f0.f110669j[i12].m133667q(jSONObject3.getString("avatar"));
                        }
                        if (jSONObject3.has("name")) {
                            c22599f0.f110669j[i12].m133670t(jSONObject3.getString("name"));
                        }
                        if (jSONObject3.has("callState")) {
                            c22599f0.f110669j[i12].m133673w(jSONObject3.getInt("callState"));
                        }
                        if (jSONObject3.has(str4)) {
                            c22599f0.f110669j[i12].m133666p(jSONObject3.getInt(str4));
                        }
                        if (jSONObject3.has(str3)) {
                            c22599f0.f110669j[i12].m133676z(jSONObject3.getInt(str3));
                        }
                        if (jSONObject3.has("lastActivate")) {
                            str = str3;
                            str2 = str4;
                            c22599f0.f110669j[i12].m133669s(jSONObject3.getLong("lastActivate"));
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        if (jSONObject3.has("timeJoinCall")) {
                            c22599f0.f110669j[i12].m133674x(jSONObject3.getLong("timeJoinCall"));
                        }
                        String str7 = str6;
                        if (jSONObject3.has(str7)) {
                            C25942f c25942f2 = c22599f0.f110669j[i12];
                            str6 = str7;
                            if (jSONObject3.optInt(str7) == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c25942f2.m133671u(z11);
                        } else {
                            str6 = str7;
                        }
                        String str8 = str5;
                        if (jSONObject3.has(str8)) {
                            c22599f0.f110669j[i12].m133672v(jSONObject3.optInt(str8));
                        }
                        i12++;
                        jSONArray2 = jSONArray;
                        str5 = str8;
                        str3 = str;
                        str4 = str2;
                        length = i11;
                    }
                    c22599f0.f110670k = jSONArray3.toString();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m15550m() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: bp0.g0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3096i0.m15519V();
            }
        });
    }

    /* renamed from: m0 */
    public static void m15551m0(C22595d0 c22595d0, JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            int i11 = c22595d0.f110711c;
            boolean z14 = true;
            if (i11 == 0 || i11 == 1) {
                c22595d0.f110634k = jSONObject.optInt("maxUsers", 10);
                c22595d0.f110631h = jSONObject.optInt("groupId");
                c22595d0.f110635l = jSONObject.optInt("platform");
                c22595d0.f110627d = jSONObject.optInt("callType");
                c22595d0.f110633j = jSONObject.optInt("id");
                c22595d0.f110637n = jSONObject.optString("settings");
                c22595d0.f110629f = jSONObject.optString("groupAvatar");
                c22595d0.f110630g = jSONObject.optString("groupName");
                c22595d0.f110632i = jSONObject.optInt("hostCall");
                c22595d0.f110638o = jSONObject.optLong("ts");
                c22595d0.f110644u = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_INTERVAL, AbstractC26080o.a.f124275b);
                c22595d0.f110645v = jSONObject.optInt("pingTimeout", 45000);
                c22595d0.f110647x = jSONObject.optInt("checkExpire", 45000);
                c22595d0.f110640q = jSONObject.optInt("gridMaxUser");
                c22595d0.f110648y = jSONObject.optInt("noResetIfChangeOutput");
                if (jSONObject.has("partnerInfo")) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("partnerInfo");
                        JSONArray jSONArray2 = new JSONArray();
                        int length = jSONArray.length();
                        c22595d0.f110646w = new C25942f[length];
                        for (int i12 = 0; i12 < length; i12++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                            int optInt = jSONObject2.optInt("userId");
                            ContactProfile m98552o = C18644n.m98531l().m98552o("" + optInt);
                            if (m98552o == null) {
                                m98552o = C28203u6.f131407a.m141809c("" + optInt);
                            }
                            String m118085e = AbstractC23028c0.m118085e(m98552o, true, AbstractC8020f0.str_me);
                            jSONArray2.put(optInt);
                            c22595d0.f110646w[i12] = new C25942f();
                            c22595d0.f110646w[i12].m133675y(optInt);
                            C25942f c25942f = c22595d0.f110646w[i12];
                            if (TextUtils.isEmpty(m118085e)) {
                                m118085e = jSONObject2.optString("name");
                            }
                            c25942f.m133670t(m118085e);
                            c22595d0.f110646w[i12].m133667q(jSONObject2.optString("avatar"));
                            C25942f c25942f2 = c22595d0.f110646w[i12];
                            if (c22595d0.f110632i == optInt) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c25942f2.m133668r(z11);
                            C25942f c25942f3 = c22595d0.f110646w[i12];
                            if (jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) == 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            c25942f3.m133671u(z12);
                            if (jSONObject2.has("ownerId")) {
                                c22595d0.f110646w[i12].m133672v(jSONObject2.optInt("ownerId"));
                            }
                            c22595d0.f110646w[i12].m133673w(2);
                        }
                        c22595d0.f110639p = jSONArray2.toString();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (jSONObject.has("callSetting")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("callSetting");
                    c22595d0.f110641r = jSONObject3.toString();
                    if (jSONObject3.optInt("showDebugInfo") == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c22595d0.f110642s = z13;
                    c22595d0.f110636m = jSONObject3.optString("session");
                    if (jSONObject3.optInt("logDebug") != 1) {
                        z14 = false;
                    }
                    c22595d0.f110643t = z14;
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: n */
    public static void m15552n() {
        try {
            if (Build.VERSION.SDK_INT < 31) {
                m15574y().sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n0 */
    static void m15553n0(AbstractC22588a abstractC22588a, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("fec")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("fec");
                if (jSONObject2 != null && jSONObject2.has("enable")) {
                    abstractC22588a.f110545k = jSONObject2.getInt("enable");
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("VoipUtils", "parseJSONFECForVoiceRequestMsg error = " + e11.toString());
            }
        }
    }

    /* renamed from: o */
    public static String m15554o(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", str);
            return jSONObject.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: o0 */
    public static C21786a m15555o0(String str) {
        C21786a c21786a = new C21786a();
        if (str.isEmpty()) {
            return c21786a;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c21786a.m112436e(jSONObject.optString("title_eng"));
            c21786a.m112437f(jSONObject.optString("title"));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(jSONObject.optString("sugg_list"));
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                C21786a.a aVar = new C21786a.a();
                aVar.m112440c(jSONObject2.optInt("Cate_id"));
                aVar.m112442e(jSONObject2.optInt("Sticker_id"));
                aVar.m112443f(jSONObject2.optInt("sticker_type"));
                aVar.m112441d(jSONObject2.optInt("order"));
                arrayList.add(aVar);
            }
            c21786a.m112435d(arrayList);
            return c21786a;
        } catch (Exception e11) {
            e11.printStackTrace();
            return c21786a;
        }
    }

    /* renamed from: p */
    public static void m15556p(String str, int i11) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            for (File file2 : file.listFiles()) {
                if (file2.lastModified() + i11 < System.currentTimeMillis() && file2.exists() && !file2.delete()) {
                    AbstractC3082b0.m15421c("VoipUtils", "Couldn't delete file " + file2.getName());
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: p0 */
    static void m15557p0(C22611l0 c22611l0, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("status")) {
                c22611l0.f110737d = jSONObject.getInt("status");
            }
            if (jSONObject.has("receiverId")) {
                c22611l0.f110736c = jSONObject.getInt("receiverId");
            }
            if (jSONObject.has("zone")) {
                c22611l0.f110738e = jSONObject.getInt("zone");
            }
            if (jSONObject.has("requestId")) {
                c22611l0.f110739f = jSONObject.getInt("requestId");
            }
            if (jSONObject.has("ts")) {
                c22611l0.f110740g = jSONObject.getLong("ts");
            }
            if (jSONObject.has("checkExpire")) {
                c22611l0.f110741h = jSONObject.getInt("checkExpire");
            }
            c22611l0.f110742i = jSONObject.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: q */
    static void m15558q(String str, int i11) {
        if (i11 < 0) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles.length <= i11) {
                    return;
                }
                Arrays.sort(listFiles, new Comparator() { // from class: bp0.h0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m15521W;
                        m15521W = AbstractC3096i0.m15521W((File) obj, (File) obj2);
                        return m15521W;
                    }
                });
                int i12 = 0;
                for (int i13 = 0; i13 < listFiles.length; i13++) {
                    if (!listFiles[i13].isHidden() && listFiles[i13].isFile() && (i12 = i12 + 1) > i11 && !listFiles[i13].delete()) {
                        AbstractC3082b0.m15421c("VoipUtils", "deleteFileByLastModified Couldn't delete file " + listFiles[i13].getName());
                    }
                }
            }
        } catch (Exception unused) {
            AbstractC3082b0.m15422d("VoipUtils", "delteFileByLastModify failed");
        }
    }

    /* renamed from: q0 */
    static void m15559q0(C22613m0 c22613m0, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("receiverId")) {
                c22613m0.f110749c = jSONObject.getInt("receiverId");
            }
            if (jSONObject.has("callId")) {
                c22613m0.f110750d = jSONObject.getInt("callId");
            }
            if (jSONObject.has("ts")) {
                c22613m0.f110751e = jSONObject.getLong("ts");
            }
            if (jSONObject.has("checkExpire")) {
                c22613m0.f110752f = jSONObject.getInt("checkExpire");
            }
            c22613m0.f110753g = jSONObject.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r */
    public static void m15560r(Context context) {
        try {
            File m15481C = m15481C(context);
            if (m15481C != null && m15481C.exists() && !m15481C.delete()) {
                AbstractC3082b0.m15421c("VoipUtils", "deleteJavaLogsFile couldn't delete file " + m15481C.getName());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r0 */
    static void m15561r0(C22615n0 c22615n0, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("receiverId")) {
                c22615n0.f110760c = jSONObject.getInt("receiverId");
            }
            if (jSONObject.has("id")) {
                c22615n0.f110761d = jSONObject.getInt("id");
            }
            if (jSONObject.has("ts")) {
                c22615n0.f110762e = jSONObject.getLong("ts");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                c22615n0.f110763f = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            if (jSONObject.has("extraData")) {
                c22615n0.f110764g = jSONObject.getString("extraData");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: s */
    public static void m15562s() {
        try {
            File file = new File(m15487F());
            if (file.exists() && file.isDirectory()) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: bp0.f0

                    /* renamed from: p */
                    public final /* synthetic */ File f13150p;

                    public /* synthetic */ RunnableC3090f0(File file2) {
                        r1 = file2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC23041d2.m118211j(r1);
                    }
                });
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122778h(th2);
        }
    }

    /* renamed from: s0 */
    static void m15563s0(C22629w c22629w, JSONObject jSONObject) {
        try {
            if (jSONObject.has("id")) {
                c22629w.f110972c = jSONObject.getInt("id");
            }
            if (jSONObject.has("receiverId")) {
                c22629w.f110973d = jSONObject.getInt("receiverId");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                c22629w.f110974e = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            if (jSONObject.has("data")) {
                c22629w.f110975f = jSONObject.toString();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public static Boolean m15564t() {
        return Boolean.valueOf(!TextUtils.isEmpty(m15495J()));
    }

    /* renamed from: t0 */
    static void m15565t0(AbstractC22588a abstractC22588a, JSONObject jSONObject) {
        JSONArray jSONArray;
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            if (jSONObject.has("showDebugInfo")) {
                if (jSONObject.getInt("showDebugInfo") == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                abstractC22588a.f110552r = z13;
            }
            if (jSONObject.has("maxRetry402")) {
                abstractC22588a.f110554t = jSONObject.getInt("maxRetry402");
            }
            if (jSONObject.has("maxRetry408")) {
                abstractC22588a.f110555u = jSONObject.getInt("maxRetry408");
            }
            if (jSONObject.has("maxRetry409")) {
                abstractC22588a.f110556v = jSONObject.getInt("maxRetry409");
            }
            if (jSONObject.has("maxRetry416")) {
                abstractC22588a.f110557w = jSONObject.getInt("maxRetry416");
            }
            if (jSONObject.has("maxRetry407")) {
                abstractC22588a.f110558x = jSONObject.getInt("maxRetry407");
            }
            if (jSONObject.has("retryDelayTime")) {
                long j11 = jSONObject.getInt("retryDelayTime");
                abstractC22588a.f110559y = j11;
                if (j11 < 0) {
                    abstractC22588a.f110559y = 0L;
                }
            }
            if (jSONObject.has("forceEgl10")) {
                if (!AbstractC3103o.m15620i() && jSONObject.optInt("forceEgl10") == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                abstractC22588a.f110560z = z12;
            }
            if (jSONObject.has("enableRecord")) {
                if (jSONObject.optInt("enableRecord") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                abstractC22588a.f110553s = z11;
            }
            if (jSONObject.has("audioManagerMode")) {
                abstractC22588a.f110521A = jSONObject.optInt("audioManagerMode", -1);
            }
            if (jSONObject.has("noResetIfChangeOutput")) {
                abstractC22588a.f110522B = jSONObject.optInt("noResetIfChangeOutput", 0);
            }
            if (jSONObject.has("deviceSampleRate")) {
                abstractC22588a.f110523C = jSONObject.optInt("deviceSampleRate", 0);
            }
            if (jSONObject.has("traceError")) {
                abstractC22588a.f110525E = jSONObject.getInt("traceError");
            }
            if (jSONObject.has("encodeSlow") && (jSONArray = jSONObject.getJSONArray("encodeSlow")) != null && jSONArray.length() >= 4) {
                abstractC22588a.f110526F = jSONArray.getInt(0);
                abstractC22588a.f110527G = jSONArray.getInt(1);
                abstractC22588a.f110528H = jSONArray.getString(2);
                abstractC22588a.f110529I = jSONArray.getInt(3);
            }
            if (jSONObject.has("theme")) {
                abstractC22588a.f110530J = jSONObject.optJSONObject("theme");
            }
            if (jSONObject.has("ts")) {
                abstractC22588a.f110524D = jSONObject.optLong("ts", 0L);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("VoipUtils", "parseJSONGeneralForVoiceRequestMsg error = " + e11.toString());
        }
    }

    /* renamed from: u */
    public static String m15566u(String str) {
        Date date = new Date();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(DateFormat.format("yy-MM-dd_kkmmss", date));
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* renamed from: u0 */
    static void m15567u0(AbstractC22588a abstractC22588a, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("rating")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("rating");
                if (jSONObject2 != null) {
                    if (jSONObject2.has("show")) {
                        abstractC22588a.f110537c = jSONObject2.getInt("show");
                    }
                    if (jSONObject2.has("feedbackThreshold")) {
                        abstractC22588a.f110538d = jSONObject2.getInt("feedbackThreshold");
                    }
                    if (jSONObject2.has("durationMin")) {
                        abstractC22588a.f110540f = jSONObject2.getInt("durationMin");
                    }
                    if (jSONObject2.has("durationMax")) {
                        abstractC22588a.f110541g = jSONObject2.getInt("durationMax");
                    }
                    if (jSONObject2.has("ratingDurMin")) {
                        abstractC22588a.f110542h = jSONObject2.getInt("ratingDurMin");
                    }
                    if (jSONObject2.has("ratingDurMax")) {
                        abstractC22588a.f110543i = jSONObject2.getInt("ratingDurMax");
                    }
                    if (jSONObject2.has("feedback")) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("feedback");
                        if (abstractC22588a.f110539e == null) {
                            abstractC22588a.f110539e = new LinkedHashMap();
                        }
                        if (jSONArray != null && jSONArray.length() > 0) {
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                                if (jSONObject3 != null && jSONObject3.has("id") && jSONObject3.has("title")) {
                                    abstractC22588a.f110539e.put(Integer.valueOf(jSONObject3.getInt("id")), jSONObject3.getString("title"));
                                }
                            }
                        }
                    }
                    if (jSONObject2.has("status")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("status");
                        if (abstractC22588a.f110544j == null) {
                            abstractC22588a.f110544j = new HashSet();
                        }
                        if (jSONArray2 != null && jSONArray2.length() > 0) {
                            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                                try {
                                    abstractC22588a.f110544j.add(Integer.valueOf(jSONArray2.getInt(i12)));
                                } catch (Exception e11) {
                                    AbstractC20110a.m104539h(e11);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC3082b0.m15422d("VoipUtils", "parseJSONRatingForVoiceRequestMsg error = " + e12.toString());
            }
        }
    }

    /* renamed from: v */
    public static String m15568v() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC23204s0.m119552c(null));
        String str = File.separator;
        sb2.append(str);
        sb2.append(m15497K());
        sb2.append(str);
        sb2.append("groupCall");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x012e A[Catch: Exception -> 0x0136, TryCatch #0 {Exception -> 0x0136, blocks: (B:6:0x00ec, B:19:0x0118, B:21:0x011e, B:24:0x0126, B:27:0x012e, B:29:0x013b, B:32:0x0147, B:37:0x0157, B:39:0x0165, B:56:0x018f, B:69:0x01ad, B:72:0x01b9, B:75:0x01c4, B:78:0x01cf, B:81:0x01da, B:84:0x01e5, B:87:0x01f0, B:88:0x01f7, B:89:0x01fe, B:90:0x0205, B:91:0x020c, B:92:0x0213), top: B:5:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C22622r m15569v0(String str, int i11, boolean z11) {
        C22622r c22616o;
        C22622r c22614n;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        try {
            if (i11 == 401) {
                c22614n = new C22620q();
            } else if (i11 == 402) {
                c22614n = new C22618p();
            } else if (i11 == 403) {
                c22614n = new C22614n();
            } else {
                if (i11 != 417 && i11 != 418 && i11 != 419) {
                    if (i11 != 425 && i11 != 426 && i11 != 427) {
                        if (i11 == 407) {
                            c22616o = new C22624s();
                        } else if (i11 == 428) {
                            c22616o = new C22613m0();
                        } else if (i11 != 440 && i11 != 441) {
                            if (i11 != 405 && i11 != 409 && i11 != 411 && i11 != 413 && i11 != 408 && i11 != 415) {
                                if (i11 != 421 && i11 != 443) {
                                    if (i11 == 412) {
                                        c22616o = new C22617o0();
                                    } else if (i11 == 447) {
                                        c22616o = new C22619p0();
                                    } else if (i11 == 432) {
                                        c22616o = new C22629w();
                                    } else if (i11 == 444) {
                                        c22616o = new C22608k();
                                    } else if (i11 == 448) {
                                        c22616o = new C22606j();
                                    } else if (i11 == 449) {
                                        c22616o = new C22612m();
                                    } else if (i11 == 4491) {
                                        c22616o = new C22610l();
                                    } else {
                                        c22616o = new C22622r();
                                    }
                                } else {
                                    c22616o = new C22596e();
                                }
                            } else {
                                c22616o = new C22590b();
                            }
                        } else {
                            c22616o = new C22615n0();
                        }
                    } else {
                        c22616o = new C22611l0();
                    }
                } else {
                    c22616o = new C22616o();
                }
                jSONObject = new JSONObject(str);
                c22616o.f110866a = jSONObject.getInt("error_code");
                c22616o.f110867b = jSONObject.getString("error_message");
                if (z11 && (i11 == 402 || i11 == 405 || i11 == 419 || i11 == 409 || i11 == 407 || i11 == 408 || i11 == 421)) {
                    return c22616o;
                }
                if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    if (i11 != 401) {
                        m15484D0((C22620q) c22616o, optJSONObject);
                    } else if (i11 == 402) {
                        m15482C0((C22618p) c22616o, optJSONObject);
                    } else if (i11 == 403) {
                        m15480B0((C22614n) c22616o, optJSONObject);
                    } else {
                        if (i11 != 418 && i11 != 419) {
                            if (i11 == 407) {
                                C22624s c22624s = (C22624s) c22616o;
                                m15573x0(c22624s, optJSONObject);
                                if (optJSONObject.has("extraData")) {
                                    c22624s.f110868k = optJSONObject.optString("extraData");
                                }
                            } else {
                                if (i11 != 405 && i11 != 409 && i11 != 411 && i11 != 413 && i11 != 408 && i11 != 415) {
                                    if (i11 != 425 && i11 != 426 && i11 != 427) {
                                        if (i11 == 428) {
                                            m15559q0((C22613m0) c22616o, optJSONObject);
                                        } else {
                                            if (i11 != 440 && i11 != 441) {
                                                if (i11 != 421 && i11 != 443) {
                                                    if (i11 == 412) {
                                                        m15494I0((C22617o0) c22616o, optJSONObject);
                                                    } else if (i11 == 447) {
                                                        m15496J0((C22619p0) c22616o, optJSONObject);
                                                    } else if (i11 == 432) {
                                                        m15563s0((C22629w) c22616o, optJSONObject);
                                                    } else if (i11 == 444) {
                                                        m15478A0((C22608k) c22616o, optJSONObject);
                                                    } else if (i11 == 448) {
                                                        m15571w0((C22606j) c22616o, optJSONObject);
                                                    } else if (i11 == 449) {
                                                        m15486E0((C22612m) c22616o, optJSONObject);
                                                    } else if (i11 == 4491) {
                                                        m15488F0((C22610l) c22616o, optJSONObject);
                                                    }
                                                }
                                                m15575y0((C22596e) c22616o, optJSONObject);
                                            }
                                            m15561r0((C22615n0) c22616o, optJSONObject);
                                        }
                                    }
                                    m15557p0((C22611l0) c22616o, optJSONObject);
                                }
                                m15573x0((C22590b) c22616o, optJSONObject);
                            }
                        }
                        m15577z0((C22616o) c22616o, optJSONObject, i11);
                    }
                }
                return c22616o;
            }
            jSONObject = new JSONObject(str);
            c22616o.f110866a = jSONObject.getInt("error_code");
            c22616o.f110867b = jSONObject.getString("error_message");
            if (z11) {
            }
            if (jSONObject.has("data")) {
                if (i11 != 401) {
                }
            }
            return c22616o;
        } catch (Exception e11) {
            e11.printStackTrace();
            return c22616o;
        }
        c22616o = c22614n;
    }

    /* renamed from: w */
    public static String m15570w() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC23204s0.m119552c(null));
        String str = File.separator;
        sb2.append(str);
        sb2.append(m15497K());
        sb2.append(str);
        sb2.append("logs");
        return sb2.toString();
    }

    /* renamed from: w0 */
    static void m15571w0(C22606j c22606j, JSONObject jSONObject) {
        try {
            c22606j.m116940d(jSONObject.optInt("id"));
            c22606j.m116942f(jSONObject.optInt("err_type"));
            c22606j.m116941e(jSONObject.optInt("err_code"));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: x */
    public static String m15572x() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC23204s0.m119552c(null));
        String str = File.separator;
        sb2.append(str);
        sb2.append(m15497K());
        sb2.append(str);
        sb2.append("spectrum");
        return sb2.toString();
    }

    /* renamed from: x0 */
    static void m15573x0(C22590b c22590b, JSONObject jSONObject) {
        try {
            if (jSONObject.has("id")) {
                c22590b.f110563c = jSONObject.getInt("id");
            }
            if (jSONObject.has("receiverId")) {
                c22590b.f110564d = jSONObject.getInt("receiverId");
            }
            if (jSONObject.has("ts")) {
                c22590b.f110565e = jSONObject.getLong("ts");
            }
            if (jSONObject.has("status")) {
                c22590b.f110566f = jSONObject.getInt("status");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                c22590b.f110567g = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            if (jSONObject.has("needACK")) {
                c22590b.f110568h = jSONObject.optInt("needACK");
            }
            if (jSONObject.has("checkExpire")) {
                c22590b.f110569i = jSONObject.optInt("checkExpire");
            }
            if (jSONObject.has("noNoti")) {
                c22590b.f110570j = jSONObject.optInt("noNoti");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: y */
    public static Context m15574y() {
        return MainApplication.getAppContext();
    }

    /* renamed from: y0 */
    static void m15575y0(C22596e c22596e, JSONObject jSONObject) {
        try {
            if (jSONObject.has("id")) {
                c22596e.f110650d = jSONObject.getInt("id");
            }
            if (jSONObject.has("reason")) {
                c22596e.f110649c = jSONObject.getInt("reason");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                c22596e.f110651e = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: z */
    public static int m15576z(int i11, boolean z11) {
        int i12 = i11 * 10;
        return z11 ? i12 + 1 : i12;
    }

    /* renamed from: z0 */
    static void m15577z0(C22616o c22616o, JSONObject jSONObject, int i11) {
        JSONArray jSONArray;
        try {
            if (jSONObject.has("id")) {
                c22616o.m116969f(jSONObject.getInt("id"));
            }
            if (jSONObject.has("sessId")) {
                c22616o.m116972i(jSONObject.getString("sessId"));
            }
            if (i11 == 418) {
                if (jSONObject.has("callerId")) {
                    c22616o.m116973j(jSONObject.getInt("callerId"));
                }
                if (jSONObject.has("servers") && (jSONArray = jSONObject.getJSONArray("servers")) != null && jSONArray.length() > 0) {
                    if (c22616o.m116966c() == null) {
                        c22616o.m116971h(new LinkedList());
                    }
                    if (c22616o.m116965b() == null) {
                        c22616o.m116970g(new LinkedList());
                    }
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                        if (jSONObject2 != null && jSONObject2.has("rtpaddr") && jSONObject2.has("rtcpaddr")) {
                            String string = jSONObject2.getString("rtpaddr");
                            String string2 = jSONObject2.getString("rtcpaddr");
                            if (string != null && string.length() > 0 && string2 != null && string2.length() > 0) {
                                c22616o.m116966c().add(string);
                                c22616o.m116965b().add(string2);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i11 == 419) {
                if (jSONObject.has("calleeId")) {
                    c22616o.m116973j(jSONObject.getInt("calleeId"));
                }
                if (c22616o.m116966c() == null) {
                    c22616o.m116971h(new LinkedList());
                }
                if (c22616o.m116965b() == null) {
                    c22616o.m116970g(new LinkedList());
                }
                if (jSONObject.has("rtpIP")) {
                    c22616o.m116966c().add(jSONObject.getString("rtpIP"));
                }
                if (jSONObject.has("rtcpIP")) {
                    c22616o.m116965b().add(jSONObject.getString("rtcpIP"));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
