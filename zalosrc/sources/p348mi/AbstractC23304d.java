package p348mi;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import bo.C2953b3;
import bo.C3003l3;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalocore.CoreUtility;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23006a0;
import me0.AbstractC23088h5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18639i;
import p142ey.C18644n;
import p207he.C20011e;
import p304ks.C21919e;
import p304ks.C21927m;
import p716zh.C31838a5;
import p716zh.C31862c;
import p716zh.C32035n7;
import p716zh.C32079q8;
import p716zh.C32099s0;
import p716zh.C32192y9;
import p716zh.C32206z9;
import pe0.AbstractC24743a;
import ph.C24753f;
import r30.AbstractC25638h;
import r30.C25637g;
import r30.C25639i;
import vg.C28011a4;
import vg.C28209v3;

/* renamed from: mi.d */
/* loaded from: classes.dex */
public abstract class AbstractC23304d {

    /* renamed from: A1 */
    public static int f113255A1;

    /* renamed from: A2 */
    public static final AtomicBoolean f113256A2;

    /* renamed from: B1 */
    public static boolean f113259B1;

    /* renamed from: B2 */
    public static ArrayList f113260B2;

    /* renamed from: C1 */
    public static boolean f113263C1;

    /* renamed from: C2 */
    public static final Map f113264C2;

    /* renamed from: D1 */
    public static int f113267D1;

    /* renamed from: D2 */
    public static AtomicBoolean f113268D2;

    /* renamed from: E1 */
    public static int f113271E1;

    /* renamed from: E2 */
    public static Bundle f113272E2;

    /* renamed from: F1 */
    public static int f113275F1;

    /* renamed from: F2 */
    public static boolean f113276F2;

    /* renamed from: G1 */
    public static boolean f113279G1;

    /* renamed from: G2 */
    public static C31862c f113280G2;

    /* renamed from: H1 */
    public static int f113283H1;

    /* renamed from: H2 */
    public static C31862c f113284H2;

    /* renamed from: I1 */
    public static long f113287I1;

    /* renamed from: I2 */
    public static Map f113288I2;

    /* renamed from: J1 */
    public static ArrayList f113291J1;

    /* renamed from: J2 */
    public static boolean f113292J2;

    /* renamed from: K1 */
    public static volatile boolean f113295K1;

    /* renamed from: K2 */
    public static boolean f113296K2;

    /* renamed from: L */
    public static C18635e f113297L;

    /* renamed from: L1 */
    public static int f113299L1;

    /* renamed from: L2 */
    public static boolean f113300L2;

    /* renamed from: M1 */
    public static boolean f113303M1;

    /* renamed from: M2 */
    public static C28209v3 f113304M2;

    /* renamed from: N1 */
    public static int f113307N1;

    /* renamed from: N2 */
    public static C28209v3 f113308N2;

    /* renamed from: O1 */
    public static boolean f113311O1;

    /* renamed from: O2 */
    public static final float[] f113312O2;

    /* renamed from: P */
    public static C18635e f113313P;

    /* renamed from: P1 */
    public static boolean f113315P1;

    /* renamed from: P2 */
    public static int[] f113316P2;

    /* renamed from: Q1 */
    public static boolean f113319Q1;

    /* renamed from: Q2 */
    public static String[] f113320Q2;

    /* renamed from: R1 */
    public static int f113323R1;

    /* renamed from: R2 */
    public static List f113324R2;

    /* renamed from: S1 */
    public static boolean f113327S1;

    /* renamed from: S2 */
    public static int[] f113328S2;

    /* renamed from: T */
    public static int f113329T;

    /* renamed from: T1 */
    public static int f113331T1;

    /* renamed from: T2 */
    public static int[] f113332T2;

    /* renamed from: U1 */
    public static boolean f113335U1;

    /* renamed from: U2 */
    public static String f113336U2;

    /* renamed from: V1 */
    public static boolean f113339V1;

    /* renamed from: V2 */
    public static int f113340V2;

    /* renamed from: W1 */
    public static int f113343W1;

    /* renamed from: W2 */
    public static int f113344W2;

    /* renamed from: X1 */
    public static boolean f113347X1;

    /* renamed from: X2 */
    private static final List f113348X2;

    /* renamed from: Y1 */
    public static boolean f113351Y1;

    /* renamed from: Y2 */
    private static boolean f113352Y2;

    /* renamed from: Z1 */
    public static int f113355Z1;

    /* renamed from: Z2 */
    public static long f113356Z2;

    /* renamed from: a2 */
    public static boolean f113360a2;

    /* renamed from: a3 */
    public static Set f113361a3;

    /* renamed from: b2 */
    public static boolean f113365b2;

    /* renamed from: b3 */
    public static int f113366b3;

    /* renamed from: c */
    public static String[] f113367c;

    /* renamed from: c0 */
    public static ContactProfile f113368c0;

    /* renamed from: c2 */
    public static boolean f113370c2;

    /* renamed from: c3 */
    public static List f113371c3;

    /* renamed from: d0 */
    public static ContactProfile f113373d0;

    /* renamed from: d2 */
    public static boolean f113375d2;

    /* renamed from: d3 */
    public static float f113376d3;

    /* renamed from: e2 */
    public static int f113380e2;

    /* renamed from: f2 */
    public static int f113384f2;

    /* renamed from: g2 */
    public static boolean f113388g2;

    /* renamed from: h2 */
    public static int f113392h2;

    /* renamed from: i2 */
    public static String f113396i2;

    /* renamed from: j2 */
    public static C3003l3 f113400j2;

    /* renamed from: k2 */
    public static C32192y9 f113404k2;

    /* renamed from: l2 */
    public static boolean f113408l2;

    /* renamed from: m2 */
    public static C32206z9 f113412m2;

    /* renamed from: n2 */
    public static C2953b3 f113416n2;

    /* renamed from: o2 */
    public static boolean f113420o2;

    /* renamed from: p2 */
    public static boolean f113424p2;

    /* renamed from: q2 */
    private static C32099s0 f113428q2;

    /* renamed from: r2 */
    public static int f113432r2;

    /* renamed from: s2 */
    public static boolean f113436s2;

    /* renamed from: t2 */
    public static boolean f113440t2;

    /* renamed from: u2 */
    public static int f113444u2;

    /* renamed from: v2 */
    public static final Map f113448v2;

    /* renamed from: w1 */
    public static final boolean f113451w1;

    /* renamed from: w2 */
    public static boolean f113452w2;

    /* renamed from: x1 */
    public static AtomicInteger f113455x1;

    /* renamed from: x2 */
    public static int f113456x2;

    /* renamed from: y1 */
    public static boolean f113459y1;

    /* renamed from: y2 */
    private static C32079q8 f113460y2;

    /* renamed from: z1 */
    public static boolean f113463z1;

    /* renamed from: z2 */
    private static boolean f113464z2;

    /* renamed from: a */
    public static AtomicInteger f113357a = new AtomicInteger(0);

    /* renamed from: b */
    public static final AtomicBoolean f113362b = new AtomicBoolean(false);

    /* renamed from: d */
    public static C18639i f113372d = new C18639i();

    /* renamed from: e */
    public static String f113377e = "";

    /* renamed from: f */
    public static long f113381f = -1;

    /* renamed from: g */
    public static boolean f113385g = false;

    /* renamed from: h */
    private static int f113389h = 0;

    /* renamed from: i */
    private static final long[] f113393i = {60000, 120000, 180000, 240000, 300000, 600000, 900000};

    /* renamed from: j */
    public static final long[] f113397j = {10000, 15000, 20000, 25000, 30000, 60000, 300000};

    /* renamed from: k */
    public static final Map f113401k = new HashMap();

    /* renamed from: l */
    public static final Map f113405l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public static final Map f113409m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public static final ArrayList f113413n = new ArrayList();

    /* renamed from: o */
    public static final Map f113417o = Collections.synchronizedMap(new HashMap());

    /* renamed from: p */
    public static final Map f113421p = Collections.synchronizedMap(new HashMap());

    /* renamed from: q */
    public static final Map f113425q = Collections.synchronizedMap(new HashMap());

    /* renamed from: r */
    public static final Map f113429r = Collections.synchronizedMap(new HashMap());

    /* renamed from: s */
    public static final Map f113433s = Collections.synchronizedMap(new HashMap());

    /* renamed from: t */
    public static ArrayList f113437t = null;

    /* renamed from: u */
    public static Set f113441u = null;

    /* renamed from: v */
    public static long f113445v = 0;

    /* renamed from: w */
    public static final Object f113449w = new Object();

    /* renamed from: x */
    public static C21919e f113453x = null;

    /* renamed from: y */
    public static String f113457y = null;

    /* renamed from: z */
    public static final Map f113461z = Collections.synchronizedMap(new HashMap());

    /* renamed from: A */
    public static ArrayList f113253A = null;

    /* renamed from: B */
    public static ArrayList f113257B = null;

    /* renamed from: C */
    public static final ArrayList f113261C = new ArrayList();

    /* renamed from: D */
    public static final SparseArray f113265D = new SparseArray();

    /* renamed from: E */
    public static final ArrayList f113269E = new ArrayList();

    /* renamed from: F */
    public static final ArrayList f113273F = new ArrayList();

    /* renamed from: G */
    public static ArrayList f113277G = new ArrayList();

    /* renamed from: H */
    public static ArrayList f113281H = new ArrayList();

    /* renamed from: I */
    public static final Map f113285I = new HashMap();

    /* renamed from: J */
    public static ArrayList f113289J = new ArrayList();

    /* renamed from: K */
    public static List f113293K = Collections.synchronizedList(new ArrayList());

    /* renamed from: M */
    public static final Object f113301M = new Object();

    /* renamed from: N */
    public static long f113305N = 0;

    /* renamed from: O */
    public static String f113309O = "";

    /* renamed from: Q */
    public static final Object f113317Q = new Object();

    /* renamed from: R */
    public static final Map f113321R = Collections.synchronizedMap(new HashMap());

    /* renamed from: S */
    public static final Map f113325S = new HashMap();

    /* renamed from: U */
    public static long f113333U = -1;

    /* renamed from: V */
    public static boolean f113337V = false;

    /* renamed from: W */
    public static int f113341W = 0;

    /* renamed from: X */
    public static long f113345X = 0;

    /* renamed from: Y */
    public static long f113349Y = 0;

    /* renamed from: Z */
    public static int f113353Z = 0;

    /* renamed from: a0 */
    public static boolean f113358a0 = false;

    /* renamed from: b0 */
    public static long f113363b0 = 0;

    /* renamed from: e0 */
    public static final List f113378e0 = new ArrayList();

    /* renamed from: f0 */
    public static final AtomicBoolean f113382f0 = new AtomicBoolean(false);

    /* renamed from: g0 */
    public static SparseIntArray f113386g0 = new SparseIntArray();

    /* renamed from: h0 */
    public static String f113390h0 = null;

    /* renamed from: i0 */
    public static String f113394i0 = null;

    /* renamed from: j0 */
    public static String f113398j0 = null;

    /* renamed from: k0 */
    public static String f113402k0 = null;

    /* renamed from: l0 */
    public static String f113406l0 = null;

    /* renamed from: m0 */
    public static String f113410m0 = null;

    /* renamed from: n0 */
    public static int f113414n0 = 123217;

    /* renamed from: o0 */
    public static int f113418o0 = 123206;

    /* renamed from: p0 */
    public static String f113422p0 = null;

    /* renamed from: q0 */
    public static String f113426q0 = null;

    /* renamed from: r0 */
    public static String f113430r0 = null;

    /* renamed from: s0 */
    public static String f113434s0 = null;

    /* renamed from: t0 */
    public static String f113438t0 = "";

    /* renamed from: u0 */
    public static String f113442u0 = "";

    /* renamed from: v0 */
    public static String f113446v0 = "";

    /* renamed from: w0 */
    public static String f113450w0 = "";

    /* renamed from: x0 */
    public static String f113454x0 = "";

    /* renamed from: y0 */
    public static String f113458y0 = "";

    /* renamed from: z0 */
    public static String f113462z0 = "";

    /* renamed from: A0 */
    public static boolean f113254A0 = false;

    /* renamed from: B0 */
    public static boolean f113258B0 = false;

    /* renamed from: C0 */
    public static String f113262C0 = null;

    /* renamed from: D0 */
    public static boolean f113266D0 = false;

    /* renamed from: E0 */
    public static boolean f113270E0 = false;

    /* renamed from: F0 */
    public static boolean f113274F0 = false;

    /* renamed from: G0 */
    public static String f113278G0 = "";

    /* renamed from: H0 */
    public static boolean f113282H0 = false;

    /* renamed from: I0 */
    public static boolean f113286I0 = false;

    /* renamed from: J0 */
    public static boolean f113290J0 = false;

    /* renamed from: K0 */
    public static boolean f113294K0 = false;

    /* renamed from: L0 */
    public static String f113298L0 = "";

    /* renamed from: M0 */
    public static String f113302M0 = "";

    /* renamed from: N0 */
    public static int f113306N0 = 0;

    /* renamed from: O0 */
    public static long f113310O0 = 0;

    /* renamed from: P0 */
    public static int f113314P0 = 0;

    /* renamed from: Q0 */
    public static long f113318Q0 = 0;

    /* renamed from: R0 */
    public static long f113322R0 = 0;

    /* renamed from: S0 */
    public static long f113326S0 = 0;

    /* renamed from: T0 */
    public static volatile boolean f113330T0 = true;

    /* renamed from: U0 */
    public static boolean f113334U0 = true;

    /* renamed from: V0 */
    public static volatile boolean f113338V0 = false;

    /* renamed from: W0 */
    public static volatile long f113342W0 = 0;

    /* renamed from: X0 */
    public static int f113346X0 = 0;

    /* renamed from: Y0 */
    public static long f113350Y0 = 0;

    /* renamed from: Z0 */
    public static boolean f113354Z0 = false;

    /* renamed from: a1 */
    public static boolean f113359a1 = false;

    /* renamed from: b1 */
    public static boolean f113364b1 = false;

    /* renamed from: c1 */
    public static boolean f113369c1 = false;

    /* renamed from: d1 */
    public static boolean f113374d1 = false;

    /* renamed from: e1 */
    public static boolean f113379e1 = false;

    /* renamed from: f1 */
    public static boolean f113383f1 = false;

    /* renamed from: g1 */
    public static long f113387g1 = 0;

    /* renamed from: h1 */
    public static int f113391h1 = 0;

    /* renamed from: i1 */
    public static long f113395i1 = 60000;

    /* renamed from: j1 */
    public static long f113399j1 = 0;

    /* renamed from: k1 */
    public static boolean f113403k1 = false;

    /* renamed from: l1 */
    public static int f113407l1 = 0;

    /* renamed from: m1 */
    public static AtomicBoolean f113411m1 = new AtomicBoolean(false);

    /* renamed from: n1 */
    public static boolean f113415n1 = false;

    /* renamed from: o1 */
    public static boolean f113419o1 = false;

    /* renamed from: p1 */
    public static final Object f113423p1 = new Object();

    /* renamed from: q1 */
    public static final AtomicBoolean f113427q1 = new AtomicBoolean(false);

    /* renamed from: r1 */
    public static final AtomicBoolean f113431r1 = new AtomicBoolean(false);

    /* renamed from: s1 */
    public static final AtomicBoolean f113435s1 = new AtomicBoolean(false);

    /* renamed from: t1 */
    public static final AtomicBoolean f113439t1 = new AtomicBoolean(false);

    /* renamed from: u1 */
    public static final AtomicBoolean f113443u1 = new AtomicBoolean(false);

    /* renamed from: v1 */
    public static volatile boolean f113447v1 = false;

    static {
        boolean z11;
        if (AbstractC23006a0.m117911h(MainApplication.getAppContext()) >= 192) {
            z11 = true;
        } else {
            z11 = false;
        }
        f113451w1 = z11;
        f113455x1 = new AtomicInteger(0);
        f113459y1 = false;
        f113463z1 = true;
        f113255A1 = 86400000;
        f113259B1 = false;
        f113263C1 = false;
        f113271E1 = 0;
        f113275F1 = 0;
        f113279G1 = false;
        f113283H1 = 900000;
        f113287I1 = 900000;
        f113291J1 = new ArrayList();
        f113295K1 = true;
        f113299L1 = 100;
        f113303M1 = true;
        f113307N1 = 31;
        f113311O1 = false;
        f113315P1 = true;
        f113319Q1 = true;
        f113323R1 = 45000;
        f113327S1 = false;
        f113331T1 = 0;
        f113335U1 = false;
        f113339V1 = false;
        f113343W1 = 0;
        f113347X1 = false;
        f113351Y1 = false;
        f113355Z1 = 100;
        f113360a2 = false;
        f113365b2 = false;
        f113370c2 = false;
        f113375d2 = false;
        f113380e2 = 1;
        f113384f2 = 0;
        f113388g2 = false;
        f113392h2 = 100;
        f113396i2 = "";
        f113400j2 = null;
        f113408l2 = true;
        f113420o2 = false;
        f113424p2 = false;
        f113428q2 = new C32099s0();
        f113432r2 = 3;
        f113436s2 = false;
        f113444u2 = -1000;
        f113448v2 = Collections.synchronizedMap(new HashMap());
        f113452w2 = false;
        f113456x2 = 0;
        f113464z2 = false;
        f113256A2 = new AtomicBoolean(false);
        f113260B2 = new ArrayList();
        f113264C2 = Collections.synchronizedMap(new HashMap());
        f113268D2 = new AtomicBoolean(false);
        f113272E2 = null;
        f113276F2 = false;
        f113288I2 = Collections.synchronizedMap(new HashMap());
        f113292J2 = false;
        f113296K2 = false;
        f113300L2 = false;
        f113304M2 = null;
        f113308N2 = null;
        f113312O2 = new float[]{0.875f, 1.0f, 1.121f, 1.25f};
        f113316P2 = new int[]{5, 0, 3};
        f113320Q2 = new String[]{"/-heart", ":>", "/-strong"};
        f113328S2 = new int[]{-11819806, -1332663, -1412199, -12857665, -8751398, -1341850, -3836452, -7485364};
        f113332T2 = new int[]{-869053559, -867353317, -870230962, -866894478, -865449655, -868330691};
        f113336U2 = "{\"groupId\":22573549,\"type\":1,\"title\":\"30 tháng 4\",\"tmpAlbumId\": 12,\"content\":[{\"thumbUrl\":\"http://t.f5.group.zp.zdn.vn/240/4629399615666123981/0b02687fb67a5824016b.jpg\",\"layout\":{\"top\":0,\"left\":0,\"right\":105,\"bottom\":105,\"contentMode\":0,\"layoutId\":0},\"subType\":\"photo\"}],\"isSelected\":false}";
        f113340V2 = 50;
        f113344W2 = 1000;
        f113348X2 = new ArrayList();
        f113352Y2 = false;
        f113356Z2 = 0L;
        f113361a3 = new LinkedHashSet();
        f113366b3 = 0;
        f113376d3 = 1.92f;
    }

    /* renamed from: A */
    public static void m120529A(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        String jSONObject2 = jSONObject.toString();
        if (!jSONObject2.isEmpty()) {
            AbstractC0924m0.m4032mq(jSONObject2);
            boolean z25 = false;
            if (jSONObject.optInt("enable_new_ui_btn_callback", 1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            f113463z1 = z11;
            f113255A1 = jSONObject.optInt("timeout_hide_btn_callback", 24) * 3600000;
            if (jSONObject.optInt("enable_unstable_connecting", 0) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            f113259B1 = z12;
            if (jSONObject.optInt("stranger_call_setting_v2", 0) == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            f113263C1 = z13;
            f113267D1 = jSONObject.optInt("feature_ringtone", 0);
            f113271E1 = jSONObject.optInt("limit_member_in_groupcall_entry_group_attachment", 0);
            f113275F1 = jSONObject.optInt("limit_save_file_record_nw_data", 6);
            if (jSONObject.optInt("enable_setting_send_record_network_data", 0) == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            f113279G1 = z14;
            f113299L1 = jSONObject.optInt("limit_retry_count_406", 100);
            if (jSONObject.optInt("enable_update_after_send_406", 1) == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            f113303M1 = z15;
            f113307N1 = jSONObject.optInt("android_version_apply_pip", 31);
            f113287I1 = jSONObject.optLong("groupcall_ping_interval", f113283H1);
            if (jSONObject.optInt("log_for_native_call", 0) == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            f113311O1 = z16;
            f113331T1 = jSONObject.optInt("groupcall_scroll_tip", 0);
            if (jSONObject.optInt("enable_restart_cam_android_12", 1) == 1) {
                z17 = true;
            } else {
                z17 = false;
            }
            f113319Q1 = z17;
            C20011e.f98374a.m103843d(jSONObject.optString("entrypoint_off"));
            if (jSONObject.optInt("enable_beta_ringtone_label", 0) == 1) {
                z18 = true;
            } else {
                z18 = false;
            }
            f113335U1 = z18;
            if (jSONObject.optInt("enable_item_base_on_system_ringtone_v2", 0) == 1) {
                z19 = true;
            } else {
                z19 = false;
            }
            f113339V1 = z19;
            f113343W1 = jSONObject.optInt("interval_check_expired_ringtone", 0);
            if (jSONObject.optInt("enable_request_nearby_devices_permission_for_call", 1) == 1) {
                z21 = true;
            } else {
                z21 = false;
            }
            f113315P1 = z21;
            if (jSONObject.optInt("call_notif_setting", 0) == 1) {
                z22 = true;
            } else {
                z22 = false;
            }
            f113347X1 = z22;
            if (jSONObject.optInt("call_notif_rm", 0) == 1) {
                z23 = true;
            } else {
                z23 = false;
            }
            f113351Y1 = z23;
            f113355Z1 = jSONObject.optInt("call_mute_limit", 100);
            if (jSONObject.optInt("call_notif_banner", 0) == 1) {
                z24 = true;
            } else {
                z24 = false;
            }
            f113360a2 = z24;
            f113323R1 = jSONObject.optInt("timeout_handshake", 45000);
            f113380e2 = jSONObject.optInt("rbt_handshake_info", 1);
            int optInt = jSONObject.optInt("rbt_call_finish_info", 0);
            f113384f2 = optInt;
            if (optInt < 0 || optInt > 2) {
                f113384f2 = 0;
            }
            if (jSONObject.optInt("device_error_toast", 0) == 1) {
                z25 = true;
            }
            f113388g2 = z25;
        }
        f113459y1 = true;
    }

    /* renamed from: b */
    public static void m120531b() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        if (f113459y1) {
            return;
        }
        String m4163r7 = AbstractC0924m0.m4163r7();
        if (!m4163r7.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(m4163r7);
                boolean z25 = false;
                if (jSONObject.optInt("enable_new_ui_btn_callback", 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f113463z1 = z11;
                f113255A1 = jSONObject.optInt("timeout_hide_btn_callback", 24) * 3600000;
                if (jSONObject.optInt("enable_unstable_connecting", 0) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f113259B1 = z12;
                if (jSONObject.optInt("stranger_call_setting_v2", 0) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f113263C1 = z13;
                f113267D1 = jSONObject.optInt("feature_ringtone", 0);
                f113271E1 = jSONObject.optInt("limit_member_in_groupcall_entry_group_attachment", 0);
                f113275F1 = jSONObject.optInt("limit_save_file_record_nw_data", 6);
                if (jSONObject.optInt("enable_setting_send_record_network_data", 0) == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                f113279G1 = z14;
                f113299L1 = jSONObject.optInt("limit_retry_count_406", 100);
                if (jSONObject.optInt("enable_update_after_send_406", 1) == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                f113303M1 = z15;
                f113307N1 = jSONObject.optInt("android_version_apply_pip", 31);
                f113287I1 = jSONObject.optLong("groupcall_ping_interval", f113283H1);
                if (jSONObject.optInt("log_for_native_call", 0) == 1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                f113311O1 = z16;
                f113331T1 = jSONObject.optInt("groupcall_scroll_tip", 0);
                C20011e.f98374a.m103843d(jSONObject.optString("entrypoint_off"));
                if (jSONObject.optInt("enable_beta_ringtone_label", 0) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                f113335U1 = z17;
                if (jSONObject.optInt("enable_item_base_on_system_ringtone_v2", 0) == 1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                f113339V1 = z18;
                f113343W1 = jSONObject.optInt("interval_check_expired_ringtone", 0);
                if (jSONObject.optInt("enable_request_nearby_devices_permission_for_call", 1) == 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                f113315P1 = z19;
                if (jSONObject.optInt("enable_restart_cam_android_12", 1) == 1) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                f113319Q1 = z21;
                if (jSONObject.optInt("call_notif_setting", 0) == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                f113347X1 = z22;
                if (jSONObject.optInt("call_notif_rm", 0) == 1) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                f113351Y1 = z23;
                f113355Z1 = jSONObject.optInt("call_mute_limit", 100);
                if (jSONObject.optInt("call_notif_banner", 0) == 1) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                f113360a2 = z24;
                f113323R1 = jSONObject.optInt("timeout_handshake", 45000);
                f113380e2 = jSONObject.optInt("rbt_handshake_info", 1);
                int optInt = jSONObject.optInt("rbt_call_finish_info", 0);
                f113384f2 = optInt;
                if (optInt < 0 || optInt > 2) {
                    f113384f2 = 0;
                }
                if (jSONObject.optInt("device_error_toast", 0) == 1) {
                    z25 = true;
                }
                f113388g2 = z25;
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        f113459y1 = true;
    }

    /* renamed from: c */
    public static void m120532c() {
        List list = f113348X2;
        synchronized (list) {
            list.clear();
        }
    }

    /* renamed from: d */
    public static void m120533d() {
        try {
            f113256A2.set(false);
            C28011a4.m141160b().m141162c().clear();
            C21927m.m114302u().m114351p().clear();
            C18644n.m98531l().m98551n().set(false);
            C18644n.m98531l().m98550m().set(false);
            C21927m.m114302u().m114312J().clear();
            C21927m.m114302u().m114367y().clear();
            C21927m.m114302u().m114369z().clear();
            CoreUtility.f89233i = "";
            CoreUtility.f89232h = "";
            f113418o0 = 123207;
            f113387g1 = 0L;
            AbstractC24743a.m128499a();
            f113253A = null;
            f113257B = null;
            f113350Y0 = 0L;
            f113341W = 0;
            f113337V = false;
            C21927m.m114302u().m114357s().clear();
            C21927m.m114302u().f107811o.set(false);
            f113386g0.clear();
            C21927m.m114302u().m114308F().clear();
            Map map = f113417o;
            synchronized (map) {
                map.clear();
            }
            Map map2 = f113421p;
            synchronized (map2) {
                map2.clear();
            }
            Map map3 = f113429r;
            synchronized (map3) {
                map3.clear();
            }
            Map map4 = f113433s;
            synchronized (map4) {
                map4.clear();
            }
            f113435s1.set(false);
            synchronized (f113293K) {
                f113293K.clear();
            }
            synchronized (C21927m.m114302u().m114358t()) {
                C21927m.m114302u().m114358t().clear();
                C19669z.f97568P.set(false);
            }
            C21919e c21919e = f113453x;
            if (c21919e != null) {
                c21919e.m114262a();
                f113453x = null;
            }
            f113457y = null;
            synchronized (C21927m.f107775T) {
                C21927m.f107775T.clear();
            }
            f113268D2.set(false);
            f113272E2 = null;
            f113356Z2 = 0L;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m120534e() {
        try {
            if (MainApplication.getAppContext() != null) {
                AbstractC23309i.m121148L4();
                if (f113368c0 == null) {
                    String m121675Zd = AbstractC23309i.m121675Zd();
                    if (!TextUtils.isEmpty(m121675Zd)) {
                        f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
                    }
                }
                if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                    m120535f();
                    return;
                }
                return;
            }
            AbstractC20110a.m104545n("doGetCurrentInfo null application context", new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static void m120535f() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: mi.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23304d.m120545p();
            }
        });
    }

    /* renamed from: g */
    public static C32099s0 m120536g() {
        if (f113428q2 == null) {
            f113428q2 = new C32099s0();
        }
        return f113428q2;
    }

    /* renamed from: h */
    public static List m120537h() {
        ArrayList arrayList;
        List list = f113348X2;
        synchronized (list) {
            try {
                if (!f113352Y2) {
                    m120547r();
                }
                arrayList = new ArrayList(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m120538i() {
        try {
            float parseFloat = Float.parseFloat(AbstractC23309i.m121592X4());
            if (parseFloat <= 0.0f) {
                parseFloat = 1.92f;
            }
            f113376d3 = parseFloat;
        } catch (Exception e11) {
            e11.printStackTrace();
            f113376d3 = 1.92f;
        }
    }

    /* renamed from: j */
    public static List m120539j() {
        if (f113324R2 == null) {
            f113324R2 = new ArrayList();
            int i11 = 0;
            while (true) {
                int[] iArr = f113316P2;
                if (i11 >= iArr.length) {
                    break;
                }
                f113324R2.add(C24753f.m128590d(iArr[i11], f113320Q2[i11]));
                i11++;
            }
        }
        return f113324R2;
    }

    /* renamed from: k */
    public static synchronized C32079q8 m120540k() {
        C32079q8 c32079q8;
        synchronized (AbstractC23304d.class) {
            try {
                if (!f113464z2) {
                    m120549t();
                    f113464z2 = true;
                }
                c32079q8 = f113460y2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c32079q8;
    }

    /* renamed from: l */
    public static long m120541l() {
        int i11 = f113389h;
        long[] jArr = f113393i;
        if (i11 >= jArr.length - 1) {
            f113389h = 0;
        }
        return jArr[f113389h];
    }

    /* renamed from: m */
    public static long m120542m(int i11) {
        int length;
        try {
            long[] jArr = f113397j;
            if (jArr.length <= 0 || (length = i11 % jArr.length) >= jArr.length) {
                return 10000L;
            }
            return jArr[length];
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 10000L;
        }
    }

    /* renamed from: n */
    public static void m120543n() {
        f113389h++;
    }

    /* renamed from: o */
    public static boolean m120544o() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[Catch: Exception -> 0x0017, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0002, B:5:0x000c, B:8:0x001d, B:10:0x0037, B:13:0x0048, B:15:0x004f, B:17:0x0073, B:41:0x0113, B:62:0x011e, B:57:0x0110, B:63:0x0121, B:64:0x0141, B:71:0x015b, B:76:0x015e, B:73:0x0158, B:80:0x001a, B:68:0x0149, B:21:0x007b, B:23:0x0087, B:25:0x008d, B:31:0x00a7, B:33:0x00ab, B:35:0x00b1, B:37:0x00b9, B:39:0x00bc, B:46:0x00e8, B:48:0x00ee, B:49:0x00f3), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m120545p() {
        int size;
        try {
            if (C25637g.m132489q().m132463g() <= 0) {
                if (C25639i.m132496q().m132463g() > 0) {
                }
                f113337V = AbstractC0924m0.m3866ha();
                f113341W = AbstractC23309i.m120857D9(MainApplication.getAppContext());
                ArrayList arrayList = new ArrayList();
                if (f113341W >= 0) {
                    String m121782c8 = AbstractC23309i.m121782c8();
                    long m121489Uc = AbstractC23309i.m121489Uc();
                    long j11 = 0;
                    if (m121489Uc == 0) {
                        m121489Uc = 259200000;
                    }
                    if (!TextUtils.isEmpty(m121782c8)) {
                        C21927m.m114302u().m114367y().clear();
                        ArrayList arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(m121782c8, ",")));
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!arrayList2.isEmpty()) {
                            int size2 = arrayList2.size();
                            long j12 = 0;
                            int i11 = 0;
                            while (i11 < size2) {
                                try {
                                    String str = (String) arrayList2.get(i11);
                                    if (!TextUtils.isEmpty(str) && str.contains("_")) {
                                        String[] split = TextUtils.split(str, "_");
                                        long parseLong = Long.parseLong(split[1]);
                                        String str2 = split[0];
                                        if (j12 == j11 || (parseLong > j11 && j12 > parseLong)) {
                                            j12 = parseLong;
                                        }
                                        if (split.length != 2 && (!ZaloListView.m86977gN() || split.length <= 2)) {
                                            if (split.length > 2) {
                                                arrayList.add(split[0]);
                                                C21927m.m114302u().m114367y().add(new C32035n7(split[0], Long.parseLong(split[1]), Long.parseLong(split[2])));
                                            }
                                        } else {
                                            if (parseLong > 0 && currentTimeMillis - parseLong >= m121489Uc) {
                                                arrayList.add(split[0]);
                                            }
                                            C21927m.m114302u().m114367y().add(new C32035n7(split[0], Long.parseLong(split[1]), 0L));
                                        }
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                i11++;
                                j11 = 0;
                            }
                            if (j12 > j11) {
                                f113349Y = j12;
                            }
                        }
                    } else {
                        f113337V = false;
                        f113341W = 0;
                        C21927m.m114302u().m114367y().clear();
                        AbstractC23309i.m122370ru(MainApplication.getAppContext(), f113341W);
                        AbstractC23309i.m120913Es("");
                        AbstractC0924m0.m3693bh(false);
                    }
                }
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    try {
                        C21927m.m114302u().m114350o0((String) arrayList.get(size));
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                AbstractC23088h5.m118431l();
                C18644n.m98524E();
            }
            AbstractC25638h.m132493c();
            f113337V = AbstractC0924m0.m3866ha();
            f113341W = AbstractC23309i.m120857D9(MainApplication.getAppContext());
            ArrayList arrayList3 = new ArrayList();
            if (f113341W >= 0) {
            }
            while (size >= 0) {
            }
            AbstractC23088h5.m118431l();
            C18644n.m98524E();
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: q */
    public static synchronized void m120546q() {
        synchronized (AbstractC23304d.class) {
            try {
                String m122002i0 = AbstractC23309i.m122002i0();
                if (!TextUtils.isEmpty(m122002i0)) {
                    f113428q2 = new C32099s0(new JSONObject(m122002i0));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: r */
    public static void m120547r() {
        try {
            List list = f113348X2;
            synchronized (list) {
                try {
                    list.clear();
                    String m121032I = AbstractC23309i.m121032I();
                    if (!TextUtils.isEmpty(m121032I)) {
                        JSONArray jSONArray = new JSONArray(m121032I);
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            f113348X2.add(new C31838a5(jSONArray.getJSONObject(i11)));
                        }
                    }
                    f113352Y2 = true;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: s */
    public static void m120548s() {
        try {
            String m121707a8 = AbstractC23309i.m121707a8();
            if (!TextUtils.isEmpty(m121707a8)) {
                f113371c3 = new ArrayList();
                JSONArray jSONArray = new JSONArray(m121707a8);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    f113371c3.add(jSONArray.getString(i11));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public static void m120549t() {
        String m121228Na = AbstractC23309i.m121228Na();
        if (!TextUtils.isEmpty(m121228Na)) {
            f113460y2 = new C32079q8(m121228Na);
        }
        f113464z2 = true;
    }

    /* renamed from: u */
    public static synchronized void m120550u() {
        synchronized (AbstractC23304d.class) {
            try {
                f113416n2 = null;
                String m122277pb = AbstractC23309i.m122277pb();
                if (!TextUtils.isEmpty(m122277pb)) {
                    f113416n2 = new C2953b3(new JSONObject(m122277pb));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: v */
    public static synchronized void m120551v() {
        synchronized (AbstractC23304d.class) {
            try {
                f113404k2 = null;
                String m121303Pb = AbstractC23309i.m121303Pb();
                if (!TextUtils.isEmpty(m121303Pb)) {
                    f113404k2 = new C32192y9(new JSONObject(m121303Pb));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    public static synchronized void m120552w() {
        synchronized (AbstractC23304d.class) {
            try {
                f113412m2 = null;
                String m121562Wb = AbstractC23309i.m121562Wb();
                if (!TextUtils.isEmpty(m121562Wb)) {
                    f113412m2 = new C32206z9(new JSONObject(m121562Wb));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: x */
    public static boolean m120553x() {
        Bundle bundle;
        if (f113268D2.get() && (bundle = f113272E2) != null && bundle.containsKey("uri")) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static void m120554y() {
        f113389h = 0;
    }

    /* renamed from: z */
    public static void m120555z(float f11) {
        try {
            if (f113376d3 != f11 && f11 > 0.0f) {
                f113376d3 = f11;
                AbstractC23309i.m122402sp(String.valueOf(f11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
