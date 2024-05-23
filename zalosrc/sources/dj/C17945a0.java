package dj;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0807c;
import ag0.C0810d;
import ag0.C0814e0;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import b40.AbstractC2531f0;
import b40.C2526d;
import b40.C2544s;
import b40.C2549x;
import be.C2775d;
import be0.C2779d;
import be0.C2780e;
import bo.C3000l0;
import bz.C3162g;
import cg.AbstractC3460h;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.C7908f;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.C7940a;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.media.pojo.VideoMessageParams;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p062db.C7966k;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo;
import com.zing.zalo.p077ui.widget.C13703p0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.social.controls.MsgInfoSpan;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dj.C17945a0;
import eg0.C18427b;
import gg0.AbstractC19444a;
import gu.AbstractC19601a;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import gw.C19610a;
import gw.C19666x0;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20128b;
import hu.C20131e;
import im.C20612c;
import im.C20614e;
import im.C20620k;
import in.AbstractC20631e;
import in.C20627a;
import in.C20629c;
import in.InterfaceC20633g;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k30.C21459a;
import l30.C22021e0;
import l30.C22033k0;
import lc.EnumC22425a;
import lk0.C22504b;
import mc.C22981a;
import me0.AbstractC23008a2;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23059e9;
import me0.AbstractC23121k5;
import me0.AbstractC23136l9;
import me0.AbstractC23143m5;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23161o1;
import me0.AbstractC23165o5;
import me0.AbstractC23170p;
import me0.AbstractC23204s0;
import me0.AbstractC23214t;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23244v8;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import me0.AbstractC23280z4;
import me0.C23055e5;
import me0.C23164o4;
import mg.C23288a;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mw.AbstractC23463h;
import nh0.C23793c;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import og0.EnumC24253d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0872f;
import p056cj.C3533a;
import p056cj.C3535c;
import p056cj.C3538f;
import p056cj.C3541i;
import p111du.AbstractC18069a;
import p128ed.C18390e;
import p142ey.C18638h;
import p164fn.C19028b;
import p164fn.EnumC19029c;
import p164fn.EnumC19038l;
import p164fn.InterfaceC19030d;
import p173fz.C19172a;
import p212hj.AbstractC20071b;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p263jc.C21216s;
import p268ji.C21270p;
import p279jw.C21373a;
import p296kc.C21654a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p325lj.C22498e;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p354n3.AbstractC23529b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p386ob.EnumC24190a;
import p386ob.EnumC24193d;
import p390of.EnumC24245a;
import p392oh.C24265l;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p405ov.C24559a;
import p423pi.C24759a;
import p461qu.AbstractC25495a;
import p462qv.C25496a;
import p471r3.C25630b;
import p495rx.C25994h;
import p511sw.InterfaceC26392a;
import p511sw.InterfaceC26396e;
import p559uv.C27373c;
import p560uw.EnumC27374a;
import p560uw.EnumC27376c;
import p588vw.C28644j;
import p613wl.C29086b;
import p645xh.C29628e;
import p698yz.AbstractC31111g;
import p716zh.AbstractC31990k7;
import p716zh.AbstractC32201z4;
import p716zh.C31845ac;
import p716zh.C31852b4;
import p716zh.C31867c4;
import p716zh.C31890dc;
import p716zh.C31897e4;
import p716zh.C31912f4;
import p716zh.C31943h5;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C31980jc;
import p716zh.C31986k3;
import p716zh.C32005l7;
import p716zh.C32012m;
import p716zh.C32027n;
import p716zh.C32034n6;
import p716zh.C32042o;
import p716zh.C32063p6;
import p716zh.C32090r5;
import p716zh.C32094r9;
import p716zh.C32098s;
import p716zh.C32123ta;
import p716zh.C32163w8;
import p716zh.C32204z7;
import pj0.InterfaceC24775a;
import pm.C24832c;
import qd0.C25239f;
import qd0.C25240g;
import qd0.EnumC25241h;
import qd0.EnumC25242i;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25739e;
import rd0.C25740f;
import rd0.C25741g;
import rd0.C25745k;
import sd0.C26232a;
import su.AbstractC26389c;
import sx.C26399a;
import td0.C26638a;
import td0.C26639b;
import th.AbstractC26687h;
import th.AbstractC26689j;
import tj.C26709a;
import tj.C26713e;
import tv.AbstractC26897a;
import v50.C27870vb;
import ve.AbstractC27985d;
import vg.AbstractC28207v1;
import vg.C28023b6;
import vg.C28071g4;
import vg.C28164q3;
import vg.C28203u6;
import w30.C28719g;
import w50.C28770b;
import yd0.C30912e;

/* renamed from: dj.a0 */
/* loaded from: classes3.dex */
public class C17945a0 implements Serializable, C22033k0.h, InterfaceC26396e {

    /* renamed from: E2 */
    protected static String f90587E2 = "a0";

    /* renamed from: F2 */
    public static long f90588F2 = 120000;

    /* renamed from: G2 */
    public static TextPaint f90589G2;

    /* renamed from: H2 */
    public static TextPaint f90590H2;

    /* renamed from: I2 */
    public static TextPaint f90591I2;

    /* renamed from: J2 */
    public static AbstractC23214t.a f90592J2;

    /* renamed from: K2 */
    public static TextPaint f90593K2;

    /* renamed from: L2 */
    public static AbstractC23214t.a f90594L2;

    /* renamed from: M2 */
    public static AbstractC23214t.a f90595M2;

    /* renamed from: N2 */
    public static TextPaint f90596N2;

    /* renamed from: O2 */
    public static AbstractC23214t.a f90597O2;

    /* renamed from: A */
    private long f90598A;

    /* renamed from: A0 */
    EnumC22425a f90599A0;

    /* renamed from: A1 */
    private int f90600A1;

    /* renamed from: A2 */
    C23528a f90601A2;

    /* renamed from: B */
    private long f90602B;

    /* renamed from: B0 */
    private volatile EnumC19038l f90603B0;

    /* renamed from: B1 */
    private boolean f90604B1;

    /* renamed from: B2 */
    C3977j f90605B2;

    /* renamed from: C */
    private long f90606C;

    /* renamed from: C0 */
    volatile boolean f90607C0;

    /* renamed from: C1 */
    private String f90608C1;

    /* renamed from: C2 */
    private boolean f90609C2;

    /* renamed from: D */
    private String f90610D;

    /* renamed from: D0 */
    C17970i1 f90611D0;

    /* renamed from: D1 */
    private int f90612D1;

    /* renamed from: D2 */
    final Object f90613D2;

    /* renamed from: E */
    private int f90614E;

    /* renamed from: E0 */
    ArrayList f90615E0;

    /* renamed from: E1 */
    private long f90616E1;

    /* renamed from: F */
    private String f90617F;

    /* renamed from: F0 */
    private C17969i0 f90618F0;

    /* renamed from: F1 */
    private boolean f90619F1;

    /* renamed from: G */
    private int f90620G;

    /* renamed from: G0 */
    private int f90621G0;

    /* renamed from: G1 */
    private C31897e4 f90622G1;

    /* renamed from: H */
    private boolean f90623H;

    /* renamed from: H0 */
    private C7940a f90624H0;

    /* renamed from: H1 */
    private boolean f90625H1;

    /* renamed from: I */
    private int f90626I;

    /* renamed from: I0 */
    private C26709a f90627I0;

    /* renamed from: I1 */
    private int f90628I1;

    /* renamed from: J */
    private int f90629J;

    /* renamed from: J0 */
    private boolean f90630J0;

    /* renamed from: J1 */
    private AbstractC2531f0 f90631J1;

    /* renamed from: K */
    private C3541i f90632K;

    /* renamed from: K0 */
    private long f90633K0;

    /* renamed from: K1 */
    private String f90634K1;

    /* renamed from: L */
    private boolean f90635L;

    /* renamed from: L0 */
    private boolean f90636L0;

    /* renamed from: L1 */
    private boolean f90637L1;

    /* renamed from: M */
    private boolean f90638M;

    /* renamed from: M0 */
    private boolean f90639M0;

    /* renamed from: M1 */
    private boolean f90640M1;

    /* renamed from: N */
    private long f90641N;

    /* renamed from: N0 */
    boolean f90642N0;

    /* renamed from: N1 */
    private long f90643N1;

    /* renamed from: O */
    private int f90644O;

    /* renamed from: O0 */
    boolean f90645O0;

    /* renamed from: O1 */
    private int f90646O1;

    /* renamed from: P */
    private C7908f f90647P;

    /* renamed from: P0 */
    boolean f90648P0;

    /* renamed from: P1 */
    private boolean f90649P1;

    /* renamed from: Q */
    private long f90650Q;

    /* renamed from: Q0 */
    boolean f90651Q0;

    /* renamed from: Q1 */
    private boolean f90652Q1;

    /* renamed from: R */
    private boolean f90653R;

    /* renamed from: R0 */
    private C17997r1 f90654R0;

    /* renamed from: R1 */
    private boolean f90655R1;

    /* renamed from: S */
    private String f90656S;

    /* renamed from: S0 */
    C7907e f90657S0;

    /* renamed from: S1 */
    private boolean f90658S1;

    /* renamed from: T */
    private C32012m f90659T;

    /* renamed from: T0 */
    boolean f90660T0;

    /* renamed from: T1 */
    private C17988o1 f90661T1;

    /* renamed from: U */
    byte f90662U;

    /* renamed from: U0 */
    private ArrayList f90663U0;

    /* renamed from: U1 */
    private final AtomicReference f90664U1;

    /* renamed from: V */
    int f90665V;

    /* renamed from: V0 */
    private ArrayList f90666V0;

    /* renamed from: V1 */
    public boolean f90667V1;

    /* renamed from: W */
    int f90668W;

    /* renamed from: W0 */
    private C17979l1 f90669W0;

    /* renamed from: W1 */
    private final AtomicBoolean f90670W1;

    /* renamed from: X */
    int f90671X;

    /* renamed from: X0 */
    private C17994q1 f90672X0;

    /* renamed from: X1 */
    private EnumC24253d f90673X1;

    /* renamed from: Y */
    int f90674Y;

    /* renamed from: Y0 */
    private C17976k1 f90675Y0;

    /* renamed from: Y1 */
    private boolean f90676Y1;

    /* renamed from: Z */
    private final AtomicBoolean f90677Z;

    /* renamed from: Z0 */
    private C26713e f90678Z0;

    /* renamed from: Z1 */
    private AtomicBoolean f90679Z1;

    /* renamed from: a0 */
    private boolean f90680a0;

    /* renamed from: a1 */
    private long f90681a1;

    /* renamed from: a2 */
    private boolean f90682a2;

    /* renamed from: b0 */
    private boolean f90683b0;

    /* renamed from: b1 */
    private List f90684b1;

    /* renamed from: b2 */
    private boolean f90685b2;

    /* renamed from: c0 */
    private boolean f90686c0;

    /* renamed from: c1 */
    private ArrayList f90687c1;

    /* renamed from: c2 */
    private final AbstractC0939u f90688c2;

    /* renamed from: d0 */
    C17966h0 f90689d0;

    /* renamed from: d1 */
    private int f90690d1;

    /* renamed from: d2 */
    int f90691d2;

    /* renamed from: e0 */
    private int f90692e0;

    /* renamed from: e1 */
    private String f90693e1;

    /* renamed from: e2 */
    String f90694e2;

    /* renamed from: f0 */
    private boolean f90695f0;

    /* renamed from: f1 */
    volatile C32090r5.c f90696f1;

    /* renamed from: f2 */
    C22981a f90697f2;

    /* renamed from: g0 */
    private boolean f90698g0;

    /* renamed from: g1 */
    private boolean f90699g1;

    /* renamed from: g2 */
    private final Object f90700g2;

    /* renamed from: h0 */
    private boolean f90701h0;

    /* renamed from: h1 */
    private C26399a f90702h1;

    /* renamed from: h2 */
    private WeakReference f90703h2;

    /* renamed from: i0 */
    InterfaceC20098e f90704i0;

    /* renamed from: i1 */
    private String f90705i1;

    /* renamed from: i2 */
    private boolean f90706i2;

    /* renamed from: j0 */
    private InterfaceC24232j f90707j0;

    /* renamed from: j1 */
    private String f90708j1;

    /* renamed from: j2 */
    boolean f90709j2;

    /* renamed from: k0 */
    private C25240g.a f90710k0;

    /* renamed from: k1 */
    private int f90711k1;

    /* renamed from: k2 */
    InterfaceC7761b.c f90712k2;

    /* renamed from: l0 */
    private InterfaceC24232j f90713l0;

    /* renamed from: l1 */
    private long f90714l1;

    /* renamed from: l2 */
    final List f90715l2;

    /* renamed from: m0 */
    private C2775d f90716m0;

    /* renamed from: m1 */
    private int f90717m1;

    /* renamed from: m2 */
    private boolean f90718m2;

    /* renamed from: n0 */
    private C24230h f90719n0;

    /* renamed from: n1 */
    private C18000s1 f90720n1;

    /* renamed from: n2 */
    private boolean f90721n2;

    /* renamed from: o0 */
    private C24230h f90722o0;

    /* renamed from: o1 */
    private int f90723o1;

    /* renamed from: o2 */
    private boolean f90724o2;

    /* renamed from: p */
    private int f90725p;

    /* renamed from: p0 */
    private C25240g f90726p0;

    /* renamed from: p1 */
    private long f90727p1;

    /* renamed from: p2 */
    public TextPaint f90728p2;

    /* renamed from: q */
    private MessageId f90729q;

    /* renamed from: q0 */
    private boolean f90730q0;

    /* renamed from: q1 */
    private boolean f90731q1;

    /* renamed from: q2 */
    AbstractC23214t.a f90732q2;

    /* renamed from: r */
    private String f90733r;

    /* renamed from: r0 */
    private C32094r9 f90734r0;

    /* renamed from: r1 */
    private boolean f90735r1;

    /* renamed from: r2 */
    AbstractC23214t.a f90736r2;

    /* renamed from: s */
    private String f90737s;

    /* renamed from: s0 */
    private C25496a f90738s0;

    /* renamed from: s1 */
    C28164q3.a f90739s1;

    /* renamed from: s2 */
    public boolean f90740s2;

    /* renamed from: t */
    private long f90741t;

    /* renamed from: t0 */
    private long f90742t0;

    /* renamed from: t1 */
    private boolean f90743t1;

    /* renamed from: t2 */
    public C31944h6.b f90744t2;

    /* renamed from: u */
    private String f90745u;

    /* renamed from: u0 */
    private long f90746u0;

    /* renamed from: u1 */
    private C28770b f90747u1;

    /* renamed from: u2 */
    public boolean f90748u2;

    /* renamed from: v */
    private String f90749v;

    /* renamed from: v0 */
    private boolean f90750v0;

    /* renamed from: v1 */
    private long f90751v1;

    /* renamed from: v2 */
    boolean f90752v2;

    /* renamed from: w */
    private String f90753w;

    /* renamed from: w0 */
    AtomicInteger f90754w0;

    /* renamed from: w1 */
    private int f90755w1;

    /* renamed from: w2 */
    boolean f90756w2;

    /* renamed from: x */
    private String f90757x;

    /* renamed from: x0 */
    int f90758x0;

    /* renamed from: x1 */
    private boolean f90759x1;

    /* renamed from: x2 */
    int f90760x2;

    /* renamed from: y */
    private volatile String f90761y;

    /* renamed from: y0 */
    int f90762y0;

    /* renamed from: y1 */
    private boolean f90763y1;

    /* renamed from: y2 */
    public boolean f90764y2;

    /* renamed from: z */
    private long f90765z;

    /* renamed from: z0 */
    int f90766z0;

    /* renamed from: z1 */
    private boolean f90767z1;

    /* renamed from: z2 */
    public boolean f90768z2;

    /* renamed from: dj.a0$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        /* renamed from: e */
        public /* synthetic */ void m95322e() {
            try {
                if (C17945a0.this.m95089b4() != 3 && C17945a0.this.m95089b4() != 4) {
                    C17945a0.this.m95016Ta(2);
                }
                C23744a.m124114c().m124116d(32, C17945a0.this.f90693e1);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            C17945a0.this.f90706i2 = false;
        }

        /* renamed from: f */
        public /* synthetic */ void m95323f() {
            try {
                if (C17945a0.this.m95089b4() != 3 && C17945a0.this.m95089b4() != 4) {
                    C17945a0.this.m95016Ta(0);
                }
                C23744a.m124114c().m124116d(32, C17945a0.this.f90693e1);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            C17945a0.this.f90706i2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.z
                public /* synthetic */ RunnableC18014z() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.a.this.m95323f();
                }
            }));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.y
                public /* synthetic */ RunnableC18012y() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.a.this.m95322e();
                }
            }));
        }
    }

    /* renamed from: dj.a0$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC24775a {
        b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m95326d() {
            C17945a0.this.m95193lc(0);
            C17945a0.this.m95319zc(2);
            C17945a0.this.f90637L1 = false;
            C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
        }

        /* renamed from: e */
        public /* synthetic */ void m95327e(C22504b c22504b) {
            try {
                C17967h1 c17967h1 = (C17967h1) C17945a0.this.f90618F0;
                JSONObject jSONObject = new JSONObject(c17967h1.f91017v);
                if (c17967h1.f91002b0 == 2) {
                    jSONObject.put("bubbleItem", c22504b.mo116351a());
                } else {
                    jSONObject.put("item", c22504b.mo116351a());
                }
                jSONObject.put("zdataState", 1);
                ((C17967h1) C17945a0.this.f90618F0).m95591w(jSONObject);
                ((C17967h1) C17945a0.this.f90618F0).m95588t();
                C7956b m41474B = C7956b.m41474B();
                C17945a0 c17945a0 = C17945a0.this;
                m41474B.m41513J0(c17945a0, c17945a0.f90618F0);
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
            C17945a0.this.f90637L1 = false;
            C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.c0
                public /* synthetic */ RunnableC17951c0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.b.this.m95326d();
                }
            }));
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: f */
        public void onSuccess(C22504b c22504b) {
            C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.b0

                /* renamed from: q */
                public final /* synthetic */ C22504b f90861q;

                public /* synthetic */ RunnableC17948b0(C22504b c22504b2) {
                    r2 = c22504b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.b.this.m95327e(r2);
                }
            }));
        }
    }

    /* renamed from: dj.a0$c */
    /* loaded from: classes3.dex */
    public class c implements C18638h.a {

        /* renamed from: a */
        final /* synthetic */ C18013y0 f90771a;

        c(C18013y0 c18013y0) {
            this.f90771a = c18013y0;
        }

        @Override // p142ey.C18638h.a
        /* renamed from: a */
        public void mo95329a(String str, int i11, String str2) {
            C17945a0.this.f90640M1 = false;
            AbstractC23350e.m122774d(C17945a0.f90587E2, str2);
        }

        @Override // p142ey.C18638h.a
        /* renamed from: b */
        public void mo95330b(String str, String str2, String str3) {
            this.f90771a.m95797k(str2, str3);
            C7956b.m41474B().m41515K0(C17945a0.this, this.f90771a);
            C17945a0.this.f90640M1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.a0$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC7761b.c {
        d() {
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: a */
        public void mo39571a(int i11) {
            C17966h0 c17966h0 = C17945a0.this.f90689d0;
            if (c17966h0 != null) {
                c17966h0.m95566s(i11);
            }
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: b */
        public void mo39572b(InterfaceC7761b interfaceC7761b) {
            if (interfaceC7761b != null) {
                try {
                    AbstractC20110a.m104543l("[Message]").mo104556o(8, "VideoCompress onError: %d, errorCode=%s, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), interfaceC7761b.mo39541e(), Long.valueOf(System.currentTimeMillis()));
                    if (interfaceC7761b.mo39541e() != EnumC24245a.f117101B) {
                        C17945a0.this.m95193lc(0);
                        C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
                    }
                    C17945a0.this.m95115e1();
                    C0815e1.m2075D().m2111i(interfaceC7761b);
                    if (C17945a0.this.f90734r0 != null) {
                        long mo124319c = C23793c.m124316k().mo124319c() - C17945a0.this.f90606C;
                        C17945a0.this.f90734r0.m154891h0(mo124319c);
                        C17945a0.this.f90734r0.m154867R((C23793c.m124316k().mo124319c() - C17945a0.this.f90602B) - mo124319c);
                        C17945a0.this.m94670I0(EnumC24193d.f116766r);
                    }
                    if (interfaceC7761b.mo39541e() == EnumC24245a.f117100A) {
                        ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            C17945a0.this.f90645O0 = false;
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: c */
        public void mo39573c(InterfaceC7761b interfaceC7761b) {
            C17945a0.this.f90606C = C23793c.m124316k().mo124319c();
            AbstractC20110a.m104543l("[Message]").mo104556o(8, "VideoCompress onStartProcessing: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: d */
        public void mo39574d(InterfaceC7761b interfaceC7761b, String str) {
            try {
                AbstractC20110a.m104543l("[Message]").mo104556o(8, "VideoCompress onFinished: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
                if (C17945a0.this.f90734r0 != null) {
                    long mo124319c = C23793c.m124316k().mo124319c() - C17945a0.this.f90606C;
                    C17945a0.this.f90734r0.m154891h0(mo124319c);
                    C17945a0.this.f90734r0.m154867R((C23793c.m124316k().mo124319c() - C17945a0.this.f90602B) - mo124319c);
                }
                ((C17961f1) C17945a0.this.f90618F0).m95473c0(str);
                ((C17961f1) C17945a0.this.f90618F0).m95507v0(0);
                C17945a0.this.m94843z9(str, true);
                C17945a0.this.m95115e1();
                C17945a0.this.m95111d9();
                C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
                C0815e1.m2075D().m2111i(interfaceC7761b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C17945a0.this.f90645O0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.a0$e */
    /* loaded from: classes3.dex */
    public class e extends AbstractC0939u {
        e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C3533a c3533a = new C3533a(C17945a0.this);
                c3533a.m17929x(1);
                C7959d.m41638d1().m41756V1(c3533a);
                C19666x0.m103098j().m103112n(c3533a);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C17945a0.f90587E2, e11);
            }
        }
    }

    /* renamed from: dj.a0$f */
    /* loaded from: classes3.dex */
    public class f extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ boolean f90775l1;

        /* renamed from: m1 */
        final /* synthetic */ SensitiveData f90776m1;

        f(boolean z11, SensitiveData sensitiveData) {
            this.f90775l1 = z11;
            this.f90776m1 = sensitiveData;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            File m123576h = AbstractC23529b.m123576h(MainApplication.getAppContext(), str);
            if (c3979l != null && c3979l.m18839c() != null && c3979l.m18839c().getWidth() > 0 && c3979l.m18839c().getHeight() > 0 && m123576h != null && m123576h.exists()) {
                C17945a0.this.m95056X9(m123576h.getPath(), "", this.f90775l1, false, this.f90776m1);
                return;
            }
            C17945a0 c17945a0 = C17945a0.this;
            c17945a0.f90764y2 = false;
            c17945a0.m94687Lb(this.f90775l1, c23995f.m125657h(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.a0$g */
    /* loaded from: classes3.dex */
    public class g extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ boolean f90778l1;

        /* renamed from: m1 */
        final /* synthetic */ SensitiveData f90779m1;

        g(boolean z11, SensitiveData sensitiveData) {
            this.f90778l1 = z11;
            this.f90779m1 = sensitiveData;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            File m123576h = AbstractC23529b.m123576h(MainApplication.getAppContext(), str);
            if (c3979l != null && c3979l.m18839c() != null && c3979l.m18839c().getWidth() > 0 && c3979l.m18839c().getHeight() > 0 && m123576h != null && m123576h.exists()) {
                C17945a0.this.m95056X9(m123576h.getPath(), "", this.f90778l1, false, this.f90779m1);
                return;
            }
            C17945a0 c17945a0 = C17945a0.this;
            c17945a0.f90764y2 = false;
            c17945a0.m95231q2(this.f90778l1, this.f90779m1);
        }
    }

    /* renamed from: dj.a0$h */
    /* loaded from: classes3.dex */
    public class h implements C32204z7.h {

        /* renamed from: a */
        final /* synthetic */ boolean f90781a;

        h(boolean z11) {
            this.f90781a = z11;
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: a */
        public void mo64439a(String str, int i11) {
            C17945a0.this.m95243r9(str, i11);
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: b */
        public void mo64440b(String str, C18013y0 c18013y0) {
            try {
                if (!this.f90781a) {
                    if (C17945a0.this.f90744t2.f146792e != 1) {
                    }
                    C17945a0.this.m95253s9(c18013y0);
                }
                C17945a0 c17945a0 = C17945a0.this;
                if ((c17945a0.f90744t2.f146792e != 4 || (c17945a0.m94721U6() && !C17945a0.this.m94812t8())) && ((!C17945a0.this.m95032V6() || !C17945a0.this.m94768j7()) && ((C17945a0.this.m95032V6() || C17945a0.this.f90744t2.f146792e != 1) && !C17945a0.this.m94889F6()))) {
                    C17945a0.this.m95236q9();
                    return;
                }
                C17945a0.this.m95253s9(c18013y0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: c */
        public void mo64441c(String str, String str2) {
        }
    }

    /* renamed from: dj.a0$i */
    /* loaded from: classes3.dex */
    public class i implements C32204z7.h {
        i() {
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: a */
        public void mo64439a(String str, int i11) {
            C17945a0.this.m95243r9(str, i11);
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: b */
        public void mo64440b(String str, C18013y0 c18013y0) {
            try {
                C17945a0.this.m95253s9(c18013y0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: c */
        public void mo64441c(String str, String str2) {
        }
    }

    /* renamed from: dj.a0$j */
    /* loaded from: classes3.dex */
    public class j implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ String f90784a;

        /* renamed from: b */
        final /* synthetic */ boolean f90785b;

        j(String str, boolean z11) {
            this.f90784a = str;
            this.f90785b = z11;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            C17966h0 c17966h0 = C17945a0.this.f90689d0;
            if (c17966h0 != null) {
                c17966h0.m95564p((int) j11);
            }
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return false;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return EnumC24298a.f117300s;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            boolean z11;
            try {
                C17945a0.this.f90735r1 = false;
                if (C24302e.m126891j(i11)) {
                    C17945a0.this.m95272uc();
                    C2549x.f10397a.m12853g("csc", C17945a0.this);
                } else {
                    C17945a0.this.f90607C0 = true;
                    if (this.f90785b && C17945a0.this.f90691d2 != 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C17945a0.this.m95138fc(true, false, z11, this.f90784a, false);
                    C2549x.f10397a.m12853g("csc", C17945a0.this);
                }
                C17945a0.this.m95068Z0();
                C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            boolean z11;
            Bitmap m117961l;
            try {
                if (AbstractC23041d2.m118194A(str2) && AbstractC19646n0.m102927R0(str2) == 3) {
                    boolean m119958q = AbstractC23258x2.m119958q(str2);
                    if (!m119958q && (m117961l = AbstractC23009a3.m117961l(str2)) != null) {
                        if (!m117961l.isRecycled()) {
                            m117961l.recycle();
                        }
                    } else if (!m119958q) {
                        C17945a0.this.f90607C0 = true;
                        C17945a0 c17945a0 = C17945a0.this;
                        if (c17945a0.f90691d2 != 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c17945a0.m95138fc(true, false, z11, this.f90784a, false);
                        C2549x.f10397a.m12853g("csc", C17945a0.this);
                        C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
                    }
                    C17945a0.this.m94934Ka(str2);
                    C17945a0.this.f90735r1 = false;
                    if (C17945a0.this.m95032V6()) {
                        if (C17945a0.this.m95107d3() != 5) {
                            C17945a0.this.m95165ic(5, true);
                        }
                    } else if (C17945a0.this.m95107d3() != 5) {
                        C17945a0.this.m95165ic(5, true);
                    }
                    C17945a0 c17945a02 = C17945a0.this;
                    c17945a02.m95114dc(c17945a02.m95249s4());
                    C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
                }
                C17945a0.this.m95068Z0();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.a0$k */
    /* loaded from: classes3.dex */
    public class k implements InterfaceC20098e {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20098e f90787a;

        k(InterfaceC20098e interfaceC20098e) {
            this.f90787a = interfaceC20098e;
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            C17945a0.this.m94824v5(c20096c);
            InterfaceC20098e interfaceC20098e = this.f90787a;
            if (interfaceC20098e != null) {
                interfaceC20098e.mo2128a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            JSONObject jSONObject;
            try {
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = new JSONObject(obj.toString());
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                C17945a0.this.m94838y5(new C25741g(jSONObject2.optString("org"), jSONObject2.optString("thumb"), jSONObject2.optString("m4a"), jSONObject2.optLong("fileSize")));
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
            InterfaceC20098e interfaceC20098e = this.f90787a;
            if (interfaceC20098e != null) {
                interfaceC20098e.mo2129b(obj);
            }
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
            C17945a0.this.m94819u9((int) j11);
        }
    }

    /* renamed from: dj.a0$l */
    /* loaded from: classes3.dex */
    public class l implements AbstractC20631e.c {

        /* renamed from: a */
        final /* synthetic */ C21216s f90789a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f90790b;

        /* renamed from: c */
        final /* synthetic */ boolean f90791c;

        l(C21216s c21216s, C17945a0 c17945a0, boolean z11) {
            this.f90789a = c21216s;
            this.f90790b = c17945a0;
            this.f90791c = z11;
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: a */
        public void mo95331a(int i11) {
            this.f90790b.m95094bb(i11);
            this.f90789a.m109876d1(i11);
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: b */
        public String mo95332b(String str, int i11) {
            Object obj;
            Object obj2;
            try {
                if (mo95336f(i11)) {
                    return C31944h6.m153539e(str, "a-");
                }
                return str;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C17945a0.f90587E2, e11);
                try {
                    C17945a0 m109884k0 = this.f90789a.m109884k0(C17945a0.this);
                    C17945a0 m109890r0 = this.f90789a.m109890r0(C17945a0.this);
                    MessageId m95029V3 = C17945a0.this.m95029V3();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error modify auto download domain: ");
                    sb2.append(i11);
                    sb2.append(" ");
                    sb2.append(m95029V3.m41044h());
                    sb2.append(" ");
                    sb2.append(m95029V3.m41046j());
                    sb2.append(" ");
                    sb2.append(m95029V3.m41048l());
                    sb2.append(" ");
                    sb2.append(m95029V3.m41050n());
                    sb2.append(" ");
                    sb2.append(C17945a0.this.f90614E);
                    sb2.append(" ");
                    sb2.append(C17945a0.this.f90761y);
                    sb2.append(" ");
                    if (m109884k0 != null) {
                        obj = Integer.valueOf(m109884k0.f90599A0.m115861c());
                    } else {
                        obj = "not in mem";
                    }
                    sb2.append(obj);
                    sb2.append(" ");
                    if (m109890r0 != null) {
                        obj2 = Integer.valueOf(m109890r0.f90599A0.m115861c());
                    } else {
                        obj2 = "not in db";
                    }
                    sb2.append(obj2);
                    AbstractC20110a.m104542k(8, sb2.toString(), new Object[0]);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                return str;
            }
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: c */
        public boolean mo95333c() {
            return this.f90789a.m109874Z0(C17945a0.this);
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: d */
        public boolean mo95334d() {
            return this.f90789a.m109869V0();
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: e */
        public void mo95335e(Map map, int i11) {
            if (mo95336f(i11)) {
                this.f90789a.m109893v(map, C17945a0.this);
            }
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: f */
        public boolean mo95336f(int i11) {
            if (this.f90791c && this.f90789a.m109886m0().m128635A() && i11 != 1) {
                return true;
            }
            return false;
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: g */
        public int mo95337g(int i11, int i12) {
            if (i12 != 1) {
                return i11;
            }
            if (i11 != 26025) {
                switch (i11) {
                    case 26017:
                        return 26000;
                    case 26018:
                        break;
                    case 26019:
                        return 26012;
                    case 26020:
                        return 26002;
                    default:
                        return i11;
                }
            }
            return 100012;
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: h */
        public boolean mo95338h() {
            return this.f90789a.m109868U0(this.f90790b);
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: i */
        public boolean mo95339i() {
            return this.f90789a.m109855I(this.f90790b);
        }

        @Override // in.AbstractC20631e.c
        /* renamed from: j */
        public boolean mo95340j() {
            return this.f90789a.m109870W0(this.f90790b);
        }
    }

    /* renamed from: dj.a0$m */
    /* loaded from: classes3.dex */
    public class m implements C22981a.b {

        /* renamed from: a */
        final /* synthetic */ C21216s f90793a;

        /* renamed from: b */
        final /* synthetic */ String f90794b;

        /* renamed from: c */
        final /* synthetic */ boolean f90795c;

        /* renamed from: d */
        final /* synthetic */ C19028b f90796d;

        m(C21216s c21216s, String str, boolean z11, C19028b c19028b) {
            this.f90793a = c21216s;
            this.f90794b = str;
            this.f90795c = z11;
            this.f90796d = c19028b;
        }

        @Override // mc.C22981a.b
        /* renamed from: a */
        public void mo95341a(String str, boolean z11) {
            C21270p.a aVar;
            C17945a0.this.m95256sc(str, false);
            if (z11) {
                aVar = C21270p.a.f103626s;
            } else {
                aVar = C21270p.a.f103625r;
            }
            this.f90793a.m109879g1(this.f90794b, C17945a0.this, aVar);
            if (!z11) {
                this.f90793a.m109894v1(C17945a0.this, str);
            }
            C17945a0.this.m94745c2();
            C17945a0 c17945a0 = C17945a0.this;
            if (c17945a0.f90764y2) {
                c17945a0.m95093ba(c17945a0.m94983Q3(), "", C17945a0.this.f90768z2, true, new SensitiveData("gallery_save_video_detail", "video_download"));
                C17945a0.this.f90768z2 = false;
            }
            C17966h0 c17966h0 = C17945a0.this.f90689d0;
            if (c17966h0 != null) {
                c17966h0.m95570x(100);
            }
            C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
            C17945a0.this.m94737a1(true, true, false, true);
            C17945a0 c17945a02 = C17945a0.this;
            c17945a02.m95140g2(str, c17945a02.f90604B1);
            C17945a0.this.m95183l2();
        }

        @Override // mc.C22981a.b
        /* renamed from: b */
        public void mo95342b(int i11) {
            boolean z11;
            C17945a0 c17945a0 = C17945a0.this;
            C22981a c22981a = c17945a0.f90697f2;
            if (i11 == 9 && c22981a != null) {
                c22981a.m117741L();
                return;
            }
            boolean m95302y1 = c17945a0.m95302y1(i11);
            boolean m145324j = C29086b.m145324j(C17945a0.this);
            C21216s m120652d = AbstractC23306f.m120652d();
            boolean m109864R0 = m120652d.m109864R0(C17945a0.this);
            if ((m95302y1 || m109864R0) && !m145324j && C17945a0.this.m94634A1()) {
                C17945a0 c17945a02 = C17945a0.this;
                if (c17945a02.f90691d2 != 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c17945a02.m95138fc(m95302y1, false, z11, this.f90794b, true);
            } else {
                if (m95302y1 && this.f90795c) {
                    String m145319d = C29086b.m145319d(C17945a0.this.f90729q);
                    if (!TextUtils.isEmpty(m145319d)) {
                        C17945a0.this.f90677Z.set(false);
                        C17945a0 c17945a03 = C17945a0.this;
                        c17945a03.m94962Nb(this.f90796d, m145319d, false, c17945a03.f90604B1);
                        return;
                    }
                }
                C17945a0.this.m95165ic(3, true);
                m120652d.m109882i1(this.f90794b, C17945a0.this);
            }
            C17945a0.this.m94745c2();
            C17945a0 c17945a04 = C17945a0.this;
            c17945a04.m95190l9(c17945a04.f90768z2, 8, null);
            C17945a0.this.m94737a1(true, true, false, true);
            C17945a0 c17945a05 = C17945a0.this;
            c17945a05.f90764y2 = false;
            c17945a05.f90768z2 = false;
            c17945a05.m95116e2(c17945a05.f90604B1);
            C17945a0.this.m95175k2();
        }
    }

    /* renamed from: dj.a0$n */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class n {

        /* renamed from: a */
        static final /* synthetic */ int[] f90798a;

        static {
            int[] iArr = new int[EnumC19029c.values().length];
            f90798a = iArr;
            try {
                iArr[EnumC19029c.f94851q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90798a[EnumC19029c.f94852r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90798a[EnumC19029c.f94855u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90798a[EnumC19029c.f94856v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90798a[EnumC19029c.f94859y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90798a[EnumC19029c.f94858x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90798a[EnumC19029c.f94857w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: dj.a0$o */
    /* loaded from: classes3.dex */
    public class o implements InterfaceC24232j {
        o() {
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C17945a0.this.m94838y5(bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C17945a0.this.m94824v5(aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
            C17945a0.this.m94819u9((int) j11);
        }
    }

    /* renamed from: dj.a0$p */
    /* loaded from: classes3.dex */
    public class p implements InterfaceC24232j {
        p() {
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C17945a0.this.m94811t5(bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C17945a0.this.m94808s5(aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
            C17966h0 c17966h0 = C17945a0.this.f90689d0;
            if (c17966h0 != null) {
                c17966h0.m95568v((int) j11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.a0$q */
    /* loaded from: classes3.dex */
    public class q extends AbstractC0939u {
        q() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C17945a0.this.m94698O9();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.a0$r */
    /* loaded from: classes3.dex */
    public class r extends AbstractC0939u {
        r() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.m41638d1().m41683A0(C17945a0.this.mo95039W2(), C17945a0.this.m95029V3().m41045i());
        }
    }

    /* renamed from: dj.a0$s */
    /* loaded from: classes3.dex */
    public class s implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20633g f90803a;

        s(InterfaceC20633g interfaceC20633g) {
            this.f90803a = interfaceC20633g;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            this.f90803a.mo62757a(str, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return false;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return EnumC24298a.f117300s;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            this.f90803a.mo62758b("", 3);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            this.f90803a.mo62759c("", str2, false);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return 1;
        }
    }

    /* renamed from: dj.a0$t */
    /* loaded from: classes3.dex */
    public class t implements InterfaceC20633g {

        /* renamed from: a */
        final /* synthetic */ C19028b f90805a;

        /* renamed from: b */
        final /* synthetic */ C21216s f90806b;

        /* renamed from: c */
        final /* synthetic */ String f90807c;

        /* renamed from: d */
        final /* synthetic */ boolean f90808d;

        t(C19028b c19028b, C21216s c21216s, String str, boolean z11) {
            this.f90805a = c19028b;
            this.f90806b = c21216s;
            this.f90807c = str;
            this.f90808d = z11;
        }

        @Override // in.InterfaceC20633g
        /* renamed from: a */
        public void mo62757a(String str, long j11) {
            C17945a0 c17945a0 = C17945a0.this;
            C17966h0 c17966h0 = c17945a0.f90689d0;
            if (c17966h0 != null) {
                c17966h0.m95565q((int) j11, this.f90808d, c17945a0.f90604B1);
            }
        }

        @Override // in.InterfaceC20633g
        /* renamed from: b */
        public void mo62758b(String str, int i11) {
            C17945a0 c17945a0 = C17945a0.this;
            c17945a0.m94792p9(i11, this.f90805a, this.f90807c, c17945a0.f90604B1);
        }

        @Override // in.InterfaceC20633g
        /* renamed from: c */
        public void mo62759c(String str, String str2, boolean z11) {
            C17945a0 c17945a0 = C17945a0.this;
            c17945a0.m94788o9(str2, z11, this.f90805a, this.f90806b, this.f90807c, c17945a0.f90604B1);
        }
    }

    /* renamed from: dj.a0$u */
    /* loaded from: classes3.dex */
    public class u extends AbstractC0939u {
        u() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                try {
                    String m119744h = AbstractC23244v8.m119744h(C23164o4.m119328j().m119331g(C17945a0.this.f90761y, 30, 30));
                    if (m119744h != null && m119744h.getBytes(StandardCharsets.UTF_8).length > AbstractC26689j.m137117z()) {
                        m119744h = AbstractC23244v8.m119744h(C23164o4.m119328j().m119331g(C17945a0.this.f90761y, 24, 24));
                    }
                    if (m119744h == null || m119744h.isEmpty() || m119744h.getBytes(StandardCharsets.UTF_8).length > AbstractC26689j.m137117z()) {
                        C17945a0.this.f90638M = true;
                    } else {
                        C17945a0.this.m94943La(new C3541i(m119744h));
                    }
                } catch (Exception e11) {
                    C17945a0.this.f90638M = true;
                    AbstractC20110a.m104539h(e11);
                }
                C17945a0.this.f90635L = false;
                C17945a0.this.f90641N = -1L;
            } catch (Throwable th2) {
                C17945a0.this.f90635L = false;
                C17945a0.this.f90641N = -1L;
                throw th2;
            }
        }
    }

    /* renamed from: dj.a0$v */
    /* loaded from: classes3.dex */
    public class v implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f90811a;

        /* renamed from: b */
        final /* synthetic */ long f90812b;

        /* renamed from: c */
        final /* synthetic */ int f90813c;

        v(List list, long j11, int i11) {
            this.f90811a = list;
            this.f90812b = j11;
            this.f90813c = i11;
        }

        /* renamed from: f */
        public /* synthetic */ void m95346f(int i11) {
            int i12;
            C17945a0 clone = C17945a0.this.clone();
            clone.m94851Ab(i11);
            if (C17945a0.this.m95219o8()) {
                new C0766k().mo1474L4(C17945a0.this.mo95039W2(), clone);
                return;
            }
            if (C17945a0.this.m95091b6()) {
                ArrayList arrayList = new ArrayList();
                C19610a m102633j = C19610a.m102633j();
                if (C17945a0.this.m94847A6()) {
                    i12 = 3;
                } else {
                    i12 = 1;
                }
                arrayList.add(m102633j.m102638h(clone, i12));
                new C0766k().mo1648gb(arrayList, true, C17945a0.this.m95170j6());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0023, B:10:0x0044, B:11:0x0061, B:13:0x0078, B:15:0x0080, B:17:0x009b, B:19:0x00bd, B:21:0x00c5, B:23:0x00cd, B:24:0x00dc, B:26:0x00e4, B:27:0x00f3, B:29:0x00fb, B:30:0x0119, B:32:0x0121, B:33:0x0126, B:38:0x0088, B:39:0x004a, B:41:0x0053, B:43:0x005c, B:44:0x0015), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cd A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0023, B:10:0x0044, B:11:0x0061, B:13:0x0078, B:15:0x0080, B:17:0x009b, B:19:0x00bd, B:21:0x00c5, B:23:0x00cd, B:24:0x00dc, B:26:0x00e4, B:27:0x00f3, B:29:0x00fb, B:30:0x0119, B:32:0x0121, B:33:0x0126, B:38:0x0088, B:39:0x004a, B:41:0x0053, B:43:0x005c, B:44:0x0015), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0023, B:10:0x0044, B:11:0x0061, B:13:0x0078, B:15:0x0080, B:17:0x009b, B:19:0x00bd, B:21:0x00c5, B:23:0x00cd, B:24:0x00dc, B:26:0x00e4, B:27:0x00f3, B:29:0x00fb, B:30:0x0119, B:32:0x0121, B:33:0x0126, B:38:0x0088, B:39:0x004a, B:41:0x0053, B:43:0x005c, B:44:0x0015), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0023, B:10:0x0044, B:11:0x0061, B:13:0x0078, B:15:0x0080, B:17:0x009b, B:19:0x00bd, B:21:0x00c5, B:23:0x00cd, B:24:0x00dc, B:26:0x00e4, B:27:0x00f3, B:29:0x00fb, B:30:0x0119, B:32:0x0121, B:33:0x0126, B:38:0x0088, B:39:0x004a, B:41:0x0053, B:43:0x005c, B:44:0x0015), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0121 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0023, B:10:0x0044, B:11:0x0061, B:13:0x0078, B:15:0x0080, B:17:0x009b, B:19:0x00bd, B:21:0x00c5, B:23:0x00cd, B:24:0x00dc, B:26:0x00e4, B:27:0x00f3, B:29:0x00fb, B:30:0x0119, B:32:0x0121, B:33:0x0126, B:38:0x0088, B:39:0x004a, B:41:0x0053, B:43:0x005c, B:44:0x0015), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x004a A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0023, B:10:0x0044, B:11:0x0061, B:13:0x0078, B:15:0x0080, B:17:0x009b, B:19:0x00bd, B:21:0x00c5, B:23:0x00cd, B:24:0x00dc, B:26:0x00e4, B:27:0x00f3, B:29:0x00fb, B:30:0x0119, B:32:0x0121, B:33:0x0126, B:38:0x0088, B:39:0x004a, B:41:0x0053, B:43:0x005c, B:44:0x0015), top: B:2:0x0001 }] */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m95347g(int i11, List list, long j11) {
            try {
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                C17945a0 c17945a0 = C17945a0.this;
                EnumC24193d enumC24193d = EnumC24193d.f116769u;
                c17945a0.m94670I0(enumC24193d);
                C17945a0.this.m94666H0(enumC24193d);
            }
            if (!C17945a0.this.m95219o8()) {
                if (C17945a0.this.m95091b6()) {
                }
                C24559a.m127933c("[Message]", String.format("send message success: %d", Long.valueOf(C17945a0.this.m95029V3().m41045i())));
                if (list == null) {
                    C17945a0.this.m95263t9(list, true);
                } else if (C17945a0.this.m95089b4() != 3 && C17945a0.this.m95089b4() != 4) {
                    C17945a0.this.m95193lc(2);
                }
                C23744a.m124114c().m124116d(8, C17945a0.this);
                if (!C17945a0.this.m94871D7() || (C17945a0.this.m95306y8() && !C17945a0.this.m95288w8())) {
                    C23744a.m124114c().m124116d(71, C17945a0.this, Boolean.TRUE);
                }
                C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
                if (C17945a0.this.m94889F6() && C21373a.f104231a.m110802n()) {
                    if (C17945a0.this.m94976P6()) {
                        C23744a.m124114c().m124116d(6023, C17945a0.this);
                    }
                    if (AbstractC23463h.m123190r(C17945a0.this)) {
                        C23744a.m124114c().m124116d(6052, C17945a0.this);
                    }
                }
                if (C17945a0.this.f90734r0 != null) {
                    C17945a0.this.f90734r0.m154909r0(C23793c.m124316k().mo124319c() - j11);
                    C17945a0 c17945a02 = C17945a0.this;
                    EnumC24193d enumC24193d2 = EnumC24193d.f116765q;
                    c17945a02.m94670I0(enumC24193d2);
                    C17945a0.this.m94666H0(enumC24193d2);
                }
                if (C19172a.m100600k("features@parse_message_detail.enable_tracking", 1) != 0) {
                    C17945a0.this.m94662G0();
                }
                C17945a0.this.m94649D1(true);
                C17945a0.this.f90706i2 = false;
            }
            AbstractC17930e.m94545d().mo94531e(new Runnable() { // from class: dj.f0

                /* renamed from: q */
                public final /* synthetic */ int f90916q;

                public /* synthetic */ RunnableC17960f0(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.v.this.m95346f(r2);
                }
            }, 1000L);
            C24559a.m127933c("[Message]", String.format("send message success: %d", Long.valueOf(C17945a0.this.m95029V3().m41045i())));
            if (list == null) {
            }
            C23744a.m124114c().m124116d(8, C17945a0.this);
            if (!C17945a0.this.m94871D7()) {
            }
            C23744a.m124114c().m124116d(71, C17945a0.this, Boolean.TRUE);
            C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
            if (C17945a0.this.m94889F6()) {
                if (C17945a0.this.m94976P6()) {
                }
                if (AbstractC23463h.m123190r(C17945a0.this)) {
                }
            }
            if (C17945a0.this.f90734r0 != null) {
            }
            if (C19172a.m100600k("features@parse_message_detail.enable_tracking", 1) != 0) {
            }
            C17945a0.this.m94649D1(true);
            C17945a0.this.f90706i2 = false;
        }

        /* renamed from: h */
        public /* synthetic */ void m95348h(List list, int i11, long j11) {
            AbstractC2531f0 abstractC2531f0;
            try {
                try {
                    try {
                        C24559a.m127933c("[Message]", String.format("send message failed: %d", Long.valueOf(C17945a0.this.m95029V3().m41045i())));
                        if (list != null) {
                            C17945a0 c17945a0 = C17945a0.this;
                            if (i11 != 0) {
                                abstractC2531f0 = AbstractC2531f0.c.f10295b;
                            } else {
                                abstractC2531f0 = AbstractC2531f0.f.f10298b;
                            }
                            c17945a0.f90631J1 = abstractC2531f0;
                            C17945a0.this.m95263t9(list, false);
                        } else if (C17945a0.this.m95089b4() != 3 && C17945a0.this.m95089b4() != 4) {
                            C17945a0.this.m95193lc(0);
                        }
                        C23744a.m124114c().m124116d(6, C17945a0.this.m95029V3(), C17945a0.this.f90737s);
                        C17945a0.this.m94649D1(false);
                        C17945a0.this.f90706i2 = false;
                        if (C17945a0.this.f90734r0 != null) {
                            C17945a0.this.f90734r0.m154909r0(C23793c.m124316k().mo124319c() - j11);
                            C17945a0 c17945a02 = C17945a0.this;
                            EnumC24193d enumC24193d = EnumC24193d.f116769u;
                            c17945a02.m94670I0(enumC24193d);
                            C17945a0.this.m94666H0(enumC24193d);
                        }
                        if (C17945a0.this.m95089b4() == 1 && !C17945a0.this.m95219o8()) {
                            C0814e0.m2071q(C17945a0.this, null);
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                        C17945a0.this.f90706i2 = false;
                        if (C17945a0.this.f90734r0 != null) {
                            C17945a0.this.f90734r0.m154909r0(C23793c.m124316k().mo124319c() - j11);
                            C17945a0 c17945a03 = C17945a0.this;
                            EnumC24193d enumC24193d2 = EnumC24193d.f116769u;
                            c17945a03.m94670I0(enumC24193d2);
                            C17945a0.this.m94666H0(enumC24193d2);
                        }
                        if (C17945a0.this.m95089b4() == 1 && !C17945a0.this.m95219o8()) {
                            C0814e0.m2071q(C17945a0.this, null);
                        }
                    }
                } catch (Throwable th2) {
                    C17945a0.this.f90706i2 = false;
                    if (C17945a0.this.f90734r0 != null) {
                        C17945a0.this.f90734r0.m154909r0(C23793c.m124316k().mo124319c() - j11);
                        C17945a0 c17945a04 = C17945a0.this;
                        EnumC24193d enumC24193d3 = EnumC24193d.f116769u;
                        c17945a04.m94670I0(enumC24193d3);
                        C17945a0.this.m94666H0(enumC24193d3);
                    }
                    try {
                        if (C17945a0.this.m95089b4() == 1 && !C17945a0.this.m95219o8()) {
                            C0814e0.m2071q(C17945a0.this, null);
                        }
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                    throw th2;
                }
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0034 A[ADDED_TO_REGION] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            JSONObject jSONObject;
            int optInt;
            boolean m94651D5;
            String m104490b = c20096c.m104490b();
            if (!TextUtils.isEmpty(m104490b)) {
                try {
                    jSONObject = new JSONObject(m104490b);
                    z11 = jSONObject.optBoolean("should_retry");
                } catch (JSONException e11) {
                    e = e11;
                    z11 = false;
                }
                try {
                    optInt = jSONObject.optInt("e2ee_encrypt_error");
                } catch (JSONException e12) {
                    e = e12;
                    AbstractC23350e.m122776f(C17945a0.f90587E2, e);
                    optInt = 0;
                    if (C17945a0.this.f90676Y1) {
                    }
                    if (!C17945a0.this.m95170j6()) {
                    }
                    if (C17945a0.this.m95170j6()) {
                    }
                    C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.d0

                        /* renamed from: q */
                        public final /* synthetic */ List f90885q;

                        /* renamed from: r */
                        public final /* synthetic */ int f90886r;

                        /* renamed from: s */
                        public final /* synthetic */ long f90887s;

                        public /* synthetic */ RunnableC17954d0(List list, int optInt2, long j11) {
                            r2 = list;
                            r3 = optInt2;
                            r4 = j11;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C17945a0.v.this.m95348h(r2, r3, r4);
                        }
                    }));
                }
                if (C17945a0.this.f90676Y1 && z11) {
                    C24559a.m127933c("[Message]", String.format("send message failed | AUTO RETRY: %d", Long.valueOf(C17945a0.this.m95029V3().m41045i())));
                    C17945a0.this.f90676Y1 = true;
                    C17945a0.this.f90706i2 = false;
                    return;
                }
                if (!C17945a0.this.m95170j6() && !C17945a0.this.m94847A6() && AbstractC0924m0.m3190K8()) {
                    C23744a.m124114c().m124116d(154, C17945a0.this.f90737s);
                } else if (C17945a0.this.m95170j6() && !C17945a0.this.m94847A6() && AbstractC0924m0.m3452T9() && z11) {
                    m94651D5 = C17945a0.this.m94651D5();
                    C24559a.m127933c("[E2EE]", "sendMessageToFriend onErrorData: SEND NON-E2EE MESSAGE | e2ee_encrypt_error=" + optInt2 + " | " + C17945a0.this.f90729q + " | hasE2eeUrl=" + m94651D5);
                    C17945a0.this.m94902H1();
                    C17945a0.this.f90706i2 = false;
                    if (!m94651D5) {
                        C17945a0.this.m94882Eb("");
                        C17945a0.this.m94892Fb("");
                        return;
                    }
                    return;
                }
                C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.d0

                    /* renamed from: q */
                    public final /* synthetic */ List f90885q;

                    /* renamed from: r */
                    public final /* synthetic */ int f90886r;

                    /* renamed from: s */
                    public final /* synthetic */ long f90887s;

                    public /* synthetic */ RunnableC17954d0(List list, int optInt2, long j11) {
                        r2 = list;
                        r3 = optInt2;
                        r4 = j11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17945a0.v.this.m95348h(r2, r3, r4);
                    }
                }));
            }
            z11 = false;
            optInt2 = 0;
            if (C17945a0.this.f90676Y1) {
            }
            if (!C17945a0.this.m95170j6()) {
            }
            if (C17945a0.this.m95170j6()) {
                m94651D5 = C17945a0.this.m94651D5();
                C24559a.m127933c("[E2EE]", "sendMessageToFriend onErrorData: SEND NON-E2EE MESSAGE | e2ee_encrypt_error=" + optInt2 + " | " + C17945a0.this.f90729q + " | hasE2eeUrl=" + m94651D5);
                C17945a0.this.m94902H1();
                C17945a0.this.f90706i2 = false;
                if (!m94651D5) {
                }
            }
            C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.d0

                /* renamed from: q */
                public final /* synthetic */ List f90885q;

                /* renamed from: r */
                public final /* synthetic */ int f90886r;

                /* renamed from: s */
                public final /* synthetic */ long f90887s;

                public /* synthetic */ RunnableC17954d0(List list, int optInt2, long j11) {
                    r2 = list;
                    r3 = optInt2;
                    r4 = j11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.v.this.m95348h(r2, r3, r4);
                }
            }));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C23288a.f113033a.mo13474a(new C18427b(C17945a0.this.f90737s, new Runnable() { // from class: dj.e0

                /* renamed from: q */
                public final /* synthetic */ int f90897q;

                /* renamed from: r */
                public final /* synthetic */ List f90898r;

                /* renamed from: s */
                public final /* synthetic */ long f90899s;

                public /* synthetic */ RunnableC17957e0(int i11, List list, long j11) {
                    r2 = i11;
                    r3 = list;
                    r4 = j11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.v.this.m95347g(r2, r3, r4);
                }
            }));
        }
    }

    /* renamed from: dj.a0$w */
    /* loaded from: classes3.dex */
    public static class w {

        /* renamed from: G */
        private C7908f f90821G;

        /* renamed from: I */
        private C32012m f90823I;

        /* renamed from: M */
        private String f90827M;

        /* renamed from: N */
        private C31897e4 f90828N;

        /* renamed from: P */
        private boolean f90830P;

        /* renamed from: a */
        private MessageId f90832a;

        /* renamed from: b */
        private String f90833b;

        /* renamed from: c */
        private String f90834c;

        /* renamed from: e */
        private int f90836e;

        /* renamed from: i */
        private C32094r9 f90840i;

        /* renamed from: k */
        private C7907e f90842k;

        /* renamed from: l */
        private C17997r1 f90843l;

        /* renamed from: m */
        private long f90844m;

        /* renamed from: n */
        private C17979l1 f90845n;

        /* renamed from: o */
        private C17994q1 f90846o;

        /* renamed from: p */
        private C17976k1 f90847p;

        /* renamed from: r */
        private C26713e f90849r;

        /* renamed from: t */
        private C3541i f90851t;

        /* renamed from: d */
        private long f90835d = -1;

        /* renamed from: f */
        private long f90837f = -1;

        /* renamed from: g */
        private String f90838g = "";

        /* renamed from: h */
        private C17969i0 f90839h = null;

        /* renamed from: j */
        private long f90841j = 0;

        /* renamed from: q */
        private String f90848q = "";

        /* renamed from: s */
        private String f90850s = "";

        /* renamed from: u */
        private long f90852u = 0;

        /* renamed from: v */
        private int f90853v = -1;

        /* renamed from: w */
        private int f90854w = 1;

        /* renamed from: x */
        private String f90855x = "";

        /* renamed from: y */
        private String f90856y = "";

        /* renamed from: z */
        private C26399a f90857z = new C26399a();

        /* renamed from: A */
        private int f90815A = -1;

        /* renamed from: B */
        private int f90816B = 0;

        /* renamed from: C */
        private boolean f90817C = false;

        /* renamed from: D */
        private int f90818D = 0;

        /* renamed from: E */
        private int f90819E = -1;

        /* renamed from: F */
        private int f90820F = -1;

        /* renamed from: H */
        private String f90822H = "";

        /* renamed from: J */
        private String f90824J = "";

        /* renamed from: K */
        private long f90825K = 0;

        /* renamed from: L */
        private int f90826L = 1;

        /* renamed from: O */
        private boolean f90829O = false;

        /* renamed from: Q */
        private boolean f90831Q = false;

        public w(MessageId messageId, int i11) {
            this.f90832a = messageId;
            this.f90833b = messageId.m41048l();
            this.f90834c = messageId.m41050n();
            this.f90836e = i11;
        }

        /* renamed from: A */
        public w m95349A(String str) {
            this.f90827M = str;
            return this;
        }

        /* renamed from: B */
        public w m95350B(C17994q1 c17994q1) {
            this.f90846o = c17994q1;
            return this;
        }

        /* renamed from: C */
        public w m95351C(C17997r1 c17997r1) {
            this.f90843l = c17997r1;
            if (c17997r1 != null) {
                this.f90844m = c17997r1.m95689f().m41045i();
            }
            return this;
        }

        /* renamed from: D */
        public w m95352D(long j11) {
            this.f90835d = j11;
            return this;
        }

        /* renamed from: E */
        public w m95353E(C32094r9 c32094r9) {
            this.f90840i = c32094r9;
            return this;
        }

        /* renamed from: F */
        public w m95354F(String str) {
            this.f90850s = str;
            return this;
        }

        /* renamed from: G */
        public w m95355G(int i11) {
            this.f90815A = i11;
            return this;
        }

        /* renamed from: H */
        public w m95356H(int i11) {
            this.f90820F = i11;
            return this;
        }

        /* renamed from: I */
        public w m95357I(long j11) {
            this.f90841j = j11;
            return this;
        }

        /* renamed from: J */
        public w m95358J(String str) {
            this.f90824J = str;
            return this;
        }

        /* renamed from: K */
        public w m95359K(long j11) {
            this.f90837f = j11;
            return this;
        }

        /* renamed from: L */
        public w m95360L(C7908f c7908f) {
            this.f90821G = c7908f;
            return this;
        }

        /* renamed from: M */
        public w m95361M(long j11) {
            this.f90852u = j11;
            return this;
        }

        /* renamed from: N */
        public w m95362N(int i11) {
            this.f90836e = i11;
            return this;
        }

        /* renamed from: O */
        public w m95363O(String str) {
            this.f90856y = str;
            return this;
        }

        /* renamed from: P */
        public w m95364P(String str) {
            this.f90855x = str;
            return this;
        }

        /* renamed from: a */
        public C17945a0 m95365a() {
            C17945a0 c17945a0 = new C17945a0(this.f90832a, this.f90836e);
            if (this.f90837f == -1) {
                this.f90837f = AbstractC23306f.m120599M0().m103087c();
            }
            c17945a0.m95281vb(this.f90837f);
            c17945a0.m95173jb(this.f90834c);
            c17945a0.m94961Na(this.f90838g);
            c17945a0.m95066Ya(this.f90833b);
            c17945a0.m95137fb(this.f90835d);
            c17945a0.m95191la(this.f90839h);
            c17945a0.m94867Cb(this.f90840i);
            c17945a0.m95229pb(this.f90841j);
            c17945a0.m94952Ma(this.f90842k);
            c17945a0.m95113db(this.f90843l);
            c17945a0.m95201ma(this.f90844m);
            c17945a0.m94989Qa(this.f90845n);
            c17945a0.m95103cb(this.f90846o);
            c17945a0.m94979Pa(this.f90847p);
            c17945a0.m94934Ka(this.f90848q);
            c17945a0.m95008Sa(this.f90849r);
            c17945a0.m95164ib(this.f90850s);
            c17945a0.m94943La(this.f90851t);
            c17945a0.m95016Ta(this.f90853v);
            c17945a0.m95264ta(this.f90816B);
            c17945a0.m95318zb(this.f90852u);
            c17945a0.m95046Wa(this.f90854w);
            c17945a0.m95271ub(this.f90817C);
            c17945a0.m94926Ja(this.f90818D);
            c17945a0.m95076Za(this.f90819E);
            c17945a0.m95221ob(this.f90820F);
            c17945a0.m95290wb(this.f90821G);
            c17945a0.m95202mb(this.f90815A);
            c17945a0.m95299xa(this.f90822H);
            c17945a0.m95181ka(this.f90823I);
            c17945a0.m94882Eb(this.f90856y);
            c17945a0.m94892Fb(this.f90855x);
            c17945a0.m95145ga(this.f90857z);
            c17945a0.m95255sb(this.f90824J);
            c17945a0.m95057Xa(this.f90825K);
            c17945a0.m95210na(this.f90826L);
            c17945a0.m95289wa(this.f90828N);
            c17945a0.m95265tb(this.f90829O);
            c17945a0.m94873Da(this.f90830P);
            c17945a0.m95085ab(this.f90827M);
            c17945a0.m94881Ea(this.f90831Q);
            return c17945a0;
        }

        /* renamed from: b */
        public w m95366b(C26399a c26399a) {
            this.f90857z = c26399a;
            return this;
        }

        /* renamed from: c */
        public w m95367c(C32012m c32012m) {
            this.f90823I = c32012m;
            return this;
        }

        /* renamed from: d */
        public w m95368d(C17969i0 c17969i0) {
            this.f90839h = c17969i0;
            return this;
        }

        /* renamed from: e */
        public w m95369e(long j11) {
            this.f90844m = j11;
            return this;
        }

        /* renamed from: f */
        public w m95370f(int i11) {
            this.f90826L = i11;
            return this;
        }

        /* renamed from: g */
        public w m95371g(int i11) {
            this.f90816B = i11;
            return this;
        }

        /* renamed from: h */
        public w m95372h(C31897e4 c31897e4) {
            this.f90828N = c31897e4;
            return this;
        }

        /* renamed from: i */
        public w m95373i(String str) {
            this.f90822H = str;
            return this;
        }

        /* renamed from: j */
        public w m95374j(boolean z11) {
            this.f90830P = z11;
            return this;
        }

        /* renamed from: k */
        public w m95375k(boolean z11) {
            this.f90831Q = z11;
            return this;
        }

        /* renamed from: l */
        public w m95376l(boolean z11) {
            this.f90829O = z11;
            return this;
        }

        /* renamed from: m */
        public w m95377m(boolean z11) {
            this.f90817C = z11;
            return this;
        }

        /* renamed from: n */
        public w m95378n(int i11) {
            this.f90818D = i11;
            return this;
        }

        /* renamed from: o */
        public w m95379o(String str) {
            this.f90848q = str;
            return this;
        }

        /* renamed from: p */
        public w m95380p(C3541i c3541i) {
            this.f90851t = c3541i;
            return this;
        }

        /* renamed from: q */
        public w m95381q(C7907e c7907e) {
            this.f90842k = c7907e;
            return this;
        }

        /* renamed from: r */
        public w m95382r(String str) {
            this.f90838g = str;
            return this;
        }

        /* renamed from: s */
        public w m95383s(C26713e c26713e) {
            this.f90849r = c26713e;
            return this;
        }

        /* renamed from: t */
        public w m95384t(C17976k1 c17976k1) {
            this.f90847p = c17976k1;
            return this;
        }

        /* renamed from: u */
        public w m95385u(C17979l1 c17979l1) {
            if (c17979l1 != null) {
                this.f90845n = c17979l1;
            }
            return this;
        }

        /* renamed from: v */
        public w m95386v(int i11) {
            this.f90853v = i11;
            return this;
        }

        /* renamed from: w */
        public w m95387w(int i11) {
            this.f90854w = i11;
            return this;
        }

        /* renamed from: x */
        public w m95388x(long j11) {
            this.f90825K = j11;
            return this;
        }

        /* renamed from: y */
        public w m95389y(String str) {
            this.f90833b = str;
            return this;
        }

        /* renamed from: z */
        public w m95390z(int i11) {
            this.f90819E = i11;
            return this;
        }
    }

    /* renamed from: dj.a0$x */
    /* loaded from: classes3.dex */
    public interface x {
        /* renamed from: G */
        void mo61268G(int i11, MessageId messageId);

        /* renamed from: H */
        void mo61269H(MessageId messageId, boolean z11);

        /* renamed from: m */
        void mo61273m(int i11, MessageId messageId);

        /* renamed from: s */
        void mo61274s(MessageId messageId, String str, boolean z11);
    }

    /* renamed from: dj.a0$y */
    /* loaded from: classes3.dex */
    public interface y {
        /* renamed from: a */
        void mo66752a();

        /* renamed from: b */
        void mo66753b();
    }

    /* synthetic */ C17945a0(MessageId messageId, int i11, AbstractC17963g0 abstractC17963g0) {
        this(messageId, i11);
    }

    /* renamed from: A1 */
    public boolean m94634A1() {
        if (!AbstractC23306f.m120633X1().m89807v() || !AbstractC23306f.m120691m2().m2466q()) {
            return true;
        }
        return C24302e.m126897u();
    }

    /* renamed from: A5 */
    private void m94635A5(AbstractC25751q abstractC25751q) {
        C24230h c24230h;
        if (abstractC25751q instanceof C25740f) {
            C25740f c25740f = (C25740f) abstractC25751q;
            String m132863b = c25740f.m132863b();
            this.f90753w = m132863b;
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                c17969i0.f91014s = m132863b;
                if (c17969i0 instanceof C17961f1) {
                    C17961f1 c17961f1 = (C17961f1) c17969i0;
                    c17961f1.m95486k0(null);
                    if (m94889F6()) {
                        c17961f1.m95509w0(c25740f.m132862a());
                        c17961f1.m95449D0();
                    }
                    C32094r9 c32094r9 = this.f90734r0;
                    if (c32094r9 != null && (c24230h = this.f90722o0) != null) {
                        c32094r9.m154913t0(c24230h.m126487E());
                        this.f90734r0.m154907p0(this.f90722o0.m126485D());
                        this.f90734r0.m154873X(this.f90722o0.m126528v());
                        this.f90734r0.m154868S(this.f90722o0.m126519q());
                        this.f90734r0.m154885e0(this.f90722o0.m126479A());
                        this.f90734r0.m154921x0(this.f90722o0.m126492I());
                        if (!c17961f1.m95464R()) {
                            this.f90734r0.m154881c0(this.f90722o0.m126525t());
                        }
                    }
                }
                C7956b.m41474B().m41513J0(this, this.f90618F0);
            }
        }
    }

    /* renamed from: A9 */
    private void m94636A9(JSONObject jSONObject) {
        int i11;
        int i12;
        JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "property");
        if (m96091j == null) {
            return;
        }
        C17979l1 c17979l1 = new C17979l1();
        this.f90669W0 = c17979l1;
        int i13 = -1;
        if (m96091j.has("size")) {
            i11 = m96091j.optInt("size");
        } else {
            i11 = -1;
        }
        c17979l1.f91058a = i11;
        C17979l1 c17979l12 = this.f90669W0;
        if (m96091j.has("color")) {
            i12 = m96091j.optInt("color");
        } else {
            i12 = -1;
        }
        c17979l12.f91059b = i12;
        C17979l1 c17979l13 = this.f90669W0;
        if (m96091j.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
            i13 = m96091j.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        }
        c17979l13.f91060c = i13;
        if (m94871D7() && this.f90669W0.f91060c == 3) {
            this.f90614E = 31;
        }
        this.f90669W0.m95624f(m96091j.optString("ext"));
    }

    /* renamed from: B1 */
    private void m94639B1(String str) {
        if (this.f90649P1) {
            this.f90649P1 = false;
            String m120300L = AbstractC23280z4.m120300L(str, AbstractC23041d2.m118212k(str), true, null);
            if (AbstractC23254w8.m119859g(m120300L)) {
                m120300L = new C20556f(m120300L).m106843p();
            }
            if (m120300L != null && !m120300L.isEmpty()) {
                ToastUtils.showMess(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_message_download_finished), m120300L));
            } else {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_notification_download_complete));
            }
        }
    }

    /* renamed from: B7 */
    private boolean m94640B7() {
        if (!C23055e5.m118271f()) {
            m95193lc(1);
            C0814e0.m2056b(this);
            C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            return true;
        }
        if (AbstractC23238v2.m119727l()) {
            return false;
        }
        m95193lc(0);
        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
        return true;
    }

    /* renamed from: B9 */
    private void m94641B9(String str, boolean z11) {
        C17969i0 c17969i0;
        if (!this.f90648P0 && (c17969i0 = this.f90618F0) != null && (c17969i0 instanceof C17961f1)) {
            this.f90648P0 = true;
            C27373c c27373c = new C27373c();
            c27373c.m140250e0(str);
            if (AbstractC26897a.m138620f(c27373c)) {
                C17961f1 c17961f1 = (C17961f1) this.f90618F0;
                if (c17961f1.m95448D() <= 0) {
                    c17961f1.m95503t0(c27373c.m140218C());
                }
                c17961f1.m95443A0(c27373c.m140221F());
                if (c17961f1.m95446C() <= 0) {
                    c17961f1.m95501s0(c27373c.m140217B());
                }
                c17961f1.m95498q0(c27373c.m140272z());
                c17961f1.m95507v0(c27373c.m140265s());
                if (z11 || c17961f1.m95508w() <= 0) {
                    c17961f1.m95490m0(c27373c.m140255i());
                }
                c17961f1.m95492n0(c27373c.m140255i());
                c17961f1.m95488l0(c27373c.m140270x());
                c17961f1.m95484j0(c27373c.m140269w());
                c17961f1.m95496p0(c27373c.m140271y());
                c17961f1.m95505u0(c27373c.m140219D());
                c17961f1.m95499r0(c27373c.m140216A());
                c17961f1.m95472b0(c27373c.m140249e());
                c17961f1.m95471a0(c27373c.m140247d());
                c17961f1.m95494o0(c27373c.m140256j());
                c17961f1.m95509w0(c27373c.m140257k());
            }
            this.f90648P0 = false;
        }
    }

    /* renamed from: C1 */
    private boolean m94644C1(int i11, boolean z11) {
        return i11 == 8 && z11;
    }

    /* renamed from: C7 */
    private boolean m94645C7(long j11) {
        C32094r9 c32094r9 = this.f90734r0;
        if (c32094r9 == null || j11 - this.f90742t0 < 0 || c32094r9.m154854E() < 0 || this.f90734r0.m154850A() < 0 || this.f90734r0.m154910s() < 0 || this.f90734r0.m154855F() < 0 || this.f90734r0.m154851B() < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C9 */
    private void m94646C9(boolean z11, String str) {
        if (m95276v6()) {
            this.f90694e2 = AbstractC23041d2.m118212k(str);
            if (z11 && !AbstractC21935u.m114550q(this.f90737s)) {
                C28023b6.m141250h0().m141393w1(m94852B2(), m95029V3().m41044h(), m95150h4(), m95232q3(), m95060Y2());
            }
        }
    }

    /* renamed from: D1 */
    public void m94649D1(boolean z11) {
        C30912e.c cVar;
        try {
            int m95089b4 = m95089b4();
            if (z11 && (m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4)) {
                cVar = C30912e.c.C33052c.f142557a;
            } else if (!z11) {
                cVar = C30912e.c.a.f142555a;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                AbstractC23306f.m120623U0().m101500a(new C30912e.d(mo95039W2(), this, m94846A4(), cVar));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: D2 */
    private boolean m94650D2(String str, String str2) {
        File file = new File(str);
        File file2 = new File(AbstractC23204s0.m119558i(), file.getName());
        AbstractC3460h.m17441i(str2, file2, 480, ((C17961f1) this.f90618F0).m95462P());
        if (file2.exists() && file2.length() > 0) {
            AbstractC23238v2.m119718c(file2, file);
            return file.exists();
        }
        return false;
    }

    /* renamed from: D5 */
    public boolean m94651D5() {
        if (!TextUtils.isEmpty(this.f90753w) && C31986k3.f147083a.m154109S1(this.f90753w)) {
            return true;
        }
        return false;
    }

    /* renamed from: D9 */
    private boolean m94652D9() {
        C17978l0 c17978l0;
        if (this.f90643N1 > 0 && System.currentTimeMillis() - this.f90643N1 >= 1000) {
            return true;
        }
        if (this.f90640M1) {
            return false;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C18013y0) {
            C18013y0 c18013y0 = (C18013y0) c17969i0;
            if (this.f90643N1 < 0 && ((c18013y0.f91016u.equals("recommened.vip") || c18013y0.f91016u.equals("recommened.user")) && ((c17978l0 = c18013y0.f91253D) == null || c17978l0.f91056d.isEmpty()))) {
                this.f90640M1 = true;
                this.f90643N1 = System.currentTimeMillis();
                C18638h.m98500f().m98507i(c18013y0.f91017v, new c(c18013y0));
                return false;
            }
        }
        return true;
    }

    /* renamed from: E6 */
    private boolean m94655E6() {
        return m94960N7();
    }

    /* renamed from: E8 */
    private boolean m94656E8() {
        int i11;
        if (m94872D8() && ((i11 = this.f90725p) == 4 || i11 == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: E9 */
    private boolean m94657E9() {
        C18013y0 c18013y0;
        C32098s c32098s;
        if (m94696O7() && !(!TextUtils.isEmpty(this.f90749v)) && !this.f90695f0) {
            C17969i0 c17969i0 = this.f90618F0;
            if ((c17969i0 instanceof C18013y0) && (c32098s = (c18013y0 = (C18013y0) c17969i0).f91251B) != null && !TextUtils.isEmpty(c32098s.m154934d())) {
                m95047Wb(c18013y0.f91013r);
                return false;
            }
        }
        return true;
    }

    /* renamed from: F8 */
    public /* synthetic */ void m94659F8(long j11) {
        m94819u9((int) j11);
    }

    /* renamed from: F9 */
    private boolean m94660F9() {
        C17979l1 c17979l1 = this.f90669W0;
        if ((c17979l1 != null && !c17979l1.f91067j) || !m94768j7()) {
            return true;
        }
        return false;
    }

    /* renamed from: G0 */
    public void m94662G0() {
        C32063p6 c32063p6;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        long j11;
        long j12;
        String str3;
        String str4;
        if (m94750d7() || m94960N7()) {
            C17979l1 c17979l1 = this.f90669W0;
            if (c17979l1 != null) {
                c32063p6 = c17979l1.f91072o;
            } else {
                c32063p6 = null;
            }
            if (c32063p6 == null) {
                c32063p6 = new C32063p6();
            }
            if (m94960N7() && (TextUtils.isEmpty(this.f90618F0.f91011p) || TextUtils.isEmpty(C31944h6.m153548n(this.f90618F0.f91011p)))) {
                z11 = true;
            } else {
                z11 = false;
            }
            String str5 = "";
            if (!m95170j6()) {
                if (m94960N7()) {
                    if (!TextUtils.isEmpty(this.f90618F0.f91011p)) {
                        str5 = C31944h6.m153548n(this.f90618F0.f91011p);
                        str4 = str5;
                    } else {
                        str4 = this.f90618F0.f91014s;
                    }
                    str3 = this.f90618F0.f91014s;
                    boolean isEmpty = TextUtils.isEmpty(str5);
                    str5 = str4;
                    z11 = isEmpty;
                } else if (!m94750d7()) {
                    str3 = "";
                } else {
                    str5 = C31944h6.m153548n(this.f90745u);
                    str3 = "";
                }
                if (!TextUtils.isEmpty(str5) && C32204z7.m155260j().m155272o(str5)) {
                    str3 = C32204z7.m155260j().m155271l(str5);
                } else if (C32204z7.m155260j().m155273p(str5)) {
                    str3 = str5;
                }
                if (TextUtils.equals(str5, str3)) {
                    str3 = "1";
                }
                z12 = z11;
                str2 = str3;
                str = str5;
            } else {
                z12 = z11;
                str = "";
                str2 = str;
            }
            if (m94696O7() && !this.f90761y.isEmpty()) {
                j11 = AbstractC23041d2.m118224w(this.f90761y);
            } else {
                j11 = 0;
            }
            C2526d c2526d = C2526d.f10270a;
            String mo95039W2 = mo95039W2();
            int m140278c = c32063p6.m154680d().m140278c();
            boolean m154678b = c32063p6.m154678b();
            boolean m154679c = c32063p6.m154679c();
            EnumC27374a m95097c4 = m95097c4();
            int m154677a = c32063p6.m154677a();
            boolean m95170j6 = m95170j6();
            if (c32063p6.m154679c()) {
                j12 = c32063p6.m154681e();
            } else {
                j12 = 0;
            }
            c2526d.m12677F0(mo95039W2, m140278c, m154678b, m154679c, m95097c4, m154677a, m95170j6, str, str2, j12, j11, c32063p6.m154682f(), z12);
        }
    }

    /* renamed from: G8 */
    public /* synthetic */ void m94663G8() {
        try {
            C7956b.m41474B().m41511I0(this);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /* renamed from: G9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m94664G9() {
        boolean z11;
        String str;
        boolean z12;
        String m94947M4;
        C32094r9 c32094r9;
        C32094r9 c32094r92;
        C17990p0 c17990p0 = (C17990p0) this.f90618F0;
        boolean z13 = !TextUtils.isEmpty(this.f90753w);
        if (c17990p0 != null && ((AbstractC31990k7.m154231l(c17990p0.f91115D) || (m95276v6() && !TextUtils.isEmpty(c17990p0.f91119H))) && TextUtils.isEmpty(this.f90749v) && !this.f90695f0 && !this.f90698g0)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f90698g0 && (c32094r92 = this.f90734r0) != null) {
            c32094r92.m154888g().add(Integer.valueOf(EnumC24193d.f116771w.m126133c()));
        }
        if (this.f90695f0 && (c32094r9 = this.f90734r0) != null) {
            c32094r9.m154888g().add(Integer.valueOf(EnumC24193d.f116768t.m126133c()));
        }
        if (this.f90689d0 == null) {
            this.f90689d0 = new C17966h0(this);
        }
        if (z13) {
            this.f90689d0.m95571y(100);
        }
        if (z11) {
            this.f90689d0.m95572z(100);
        }
        if (z13 && z11) {
            return true;
        }
        String str2 = "";
        if (c17990p0 == null) {
            str = "";
        } else {
            if (TextUtils.isEmpty(c17990p0.f91114C)) {
                try {
                    if (AbstractC23041d2.m118194A(this.f90761y)) {
                        c17990p0.f91114C = AbstractC26389c.m135988d(this.f90761y);
                        c17990p0.m95671m();
                        C7956b.m41474B().m41513J0(this, this.f90618F0);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            String str3 = c17990p0.f91118G;
            str = c17990p0.f91119H;
            boolean m95170j6 = m95170j6();
            C31986k3 c31986k3 = C31986k3.f147083a;
            if (m95170j6 != c31986k3.m154109S1(str3)) {
                str3 = "";
            }
            if (m95170j6() != c31986k3.m154109S1(str)) {
                str = "";
            }
            str2 = str3;
        }
        if (!z13 && !this.f90680a0) {
            if (TextUtils.isEmpty(str2) && (TextUtils.isEmpty(this.f90761y) || !AbstractC23041d2.m118194A(this.f90761y))) {
                C32094r9 c32094r93 = this.f90734r0;
                if (c32094r93 != null) {
                    c32094r93.m154888g().add(Integer.valueOf(EnumC24193d.f116766r.m126133c()));
                }
                m94805rb();
                m94666H0(EnumC24193d.f116766r);
            } else {
                z12 = m95025Ub(str2);
                if (m95089b4() == 1 && !z11 && !this.f90683b0 && !this.f90709j2) {
                    m94947M4 = m94947M4();
                    if (TextUtils.isEmpty(m94947M4)) {
                        if (AbstractC23041d2.m118194A(m94947M4)) {
                            m95047Wb(str);
                            if (c17990p0.f91120I <= 0 || c17990p0.f91121J <= 0) {
                                try {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeFile(m94947M4, options);
                                    c17990p0.f91120I = options.outWidth;
                                    c17990p0.f91121J = options.outHeight;
                                    if (AbstractC31990k7.m154228i(c17990p0.f91115D)) {
                                        c17990p0.f91122K = AbstractC3460h.m17442j(m94983Q3());
                                    }
                                    c17990p0.f91116E = m94947M4;
                                    c17990p0.m95671m();
                                    C23744a.m124114c().m124116d(5, this.f90737s);
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                            }
                        } else {
                            m94844A2(m94947M4);
                        }
                    } else {
                        this.f90695f0 = true;
                    }
                }
                return z12;
            }
        }
        z12 = false;
        if (m95089b4() == 1) {
            m94947M4 = m94947M4();
            if (TextUtils.isEmpty(m94947M4)) {
            }
        }
        return z12;
    }

    /* renamed from: H0 */
    public void m94666H0(EnumC24193d enumC24193d) {
        boolean z11;
        if (m95276v6() && this.f90734r0 != null) {
            long mo124319c = C23793c.m124316k().mo124319c();
            if (m94645C7(mo124319c)) {
                return;
            }
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C17990p0) {
                C17990p0 c17990p0 = (C17990p0) c17969i0;
                this.f90734r0.m154881c0(c17990p0.f91113B);
                if (this.f90734r0.m154902n() == 0) {
                    this.f90734r0.m154883d0(c17990p0.f91127P);
                }
                this.f90734r0.m154871V(c17990p0.f91115D);
            }
            this.f90734r0.m154870U(m94797q6(MainApplication.m35475j0()));
            C32094r9 c32094r9 = this.f90734r0;
            EnumC24193d enumC24193d2 = EnumC24193d.f116765q;
            if (enumC24193d == enumC24193d2) {
                z11 = true;
            } else {
                z11 = false;
            }
            c32094r9.m154887f0(z11);
            if (enumC24193d != enumC24193d2) {
                this.f90734r0.m154888g().add(Integer.valueOf(enumC24193d.m126133c()));
            }
            this.f90734r0.m154917v0(mo124319c - this.f90742t0);
            this.f90734r0.m154865P(this.f90729q.m41044h());
            this.f90734r0.m154866Q(m95170j6());
            C0815e1.m2075D().m2108f(this.f90734r0, m94847A6());
        }
    }

    /* renamed from: H8 */
    public /* synthetic */ void m94667H8() {
        try {
            try {
                AbstractC31111g.m151125f(this);
                if (m95022U7()) {
                    C2549x.f10397a.m12853g("csc", this);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            this.f90609C2 = false;
        }
    }

    /* renamed from: H9 */
    private boolean m94668H9() {
        C31944h6.b bVar;
        C17979l1 c17979l1 = this.f90669W0;
        if (c17979l1 == null || !c17979l1.f91067j || (bVar = this.f90744t2) == null || bVar.f146792e != 4 || !m94812t8()) {
            return true;
        }
        m95257t1();
        return false;
    }

    /* renamed from: I0 */
    public void m94670I0(EnumC24193d enumC24193d) {
        EnumC24190a enumC24190a;
        boolean z11;
        int i11;
        long j11;
        if (m95276v6()) {
            return;
        }
        long mo124319c = C23793c.m124316k().mo124319c();
        if (!m94645C7(mo124319c) && this.f90734r0 != null) {
            int i12 = this.f90614E;
            if (i12 == 3) {
                enumC24190a = EnumC24190a.f116750q;
            } else if (i12 == 4) {
                enumC24190a = EnumC24190a.f116751r;
            } else if (m94870D6()) {
                enumC24190a = EnumC24190a.f116753t;
            } else {
                enumC24190a = EnumC24190a.f116752s;
            }
            this.f90734r0.m154919w0(enumC24190a);
            this.f90734r0.m154870U(m94797q6(MainApplication.m35475j0()));
            this.f90734r0.m154917v0(mo124319c - this.f90742t0);
            C32094r9 c32094r9 = this.f90734r0;
            boolean z12 = true;
            int i13 = 0;
            if (enumC24193d == EnumC24193d.f116765q) {
                z11 = true;
            } else {
                z11 = false;
            }
            c32094r9.m154887f0(z11);
            this.f90734r0.m154872W(enumC24193d);
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C18009w0) {
                i11 = ((C18009w0) c17969i0).m95788v();
                j11 = ((C18009w0) this.f90618F0).m95777m();
                i13 = ((C18009w0) this.f90618F0).m95779n();
                this.f90734r0.m154883d0(((C18009w0) this.f90618F0).f91239d0);
            } else if (c17969i0 instanceof C17961f1) {
                i11 = ((C17961f1) c17969i0).m95493o();
                j11 = ((C17961f1) this.f90618F0).m95487l();
                int m95489m = ((C17961f1) this.f90618F0).m95489m();
                this.f90734r0.m154883d0(((C17961f1) this.f90618F0).f90956o0);
                C32094r9 c32094r92 = this.f90734r0;
                if (c32094r92.m154910s() != 0) {
                    z12 = false;
                }
                c32094r92.m154864O(z12);
                i13 = m95489m;
            } else {
                i11 = -1;
                j11 = 0;
            }
            this.f90734r0.m154879b0(i11);
            this.f90734r0.m154875Z(j11);
            this.f90734r0.m154877a0(i13);
            this.f90734r0.m154866Q(m95170j6());
            this.f90734r0.m154865P(this.f90729q.m41044h());
            if (this.f90734r0.m154906p() == null) {
                this.f90734r0.m154889g0(C32094r9.m154848q(C31986k3.f147083a.m154105P1(this.f90729q.m41048l())));
            }
            C0815e1.m2075D().m2101W(this.f90734r0, m94847A6());
            C2526d.f10270a.m12711g(j11, this.f90734r0, m94847A6());
        }
    }

    /* renamed from: I8 */
    public /* synthetic */ boolean m94671I8(int i11) {
        if (m95302y1(i11) && C18390e.m97410q()) {
            return true;
        }
        return false;
    }

    /* renamed from: I9 */
    private boolean m94672I9() {
        String str;
        String str2;
        if (!this.f90651Q0) {
            AbstractC20110a.m104543l("[Message]").mo104556o(8, "prepareSendVideo %s, path=%s", m95029V3().m41044h(), this.f90761y);
            this.f90651Q0 = true;
        }
        boolean z11 = !TextUtils.isEmpty(this.f90753w);
        boolean z12 = !TextUtils.isEmpty(this.f90749v);
        if (this.f90689d0 == null) {
            this.f90689d0 = new C17966h0(this);
        }
        if (z11) {
            this.f90689d0.m95571y(100);
        }
        if (z12) {
            this.f90689d0.m95572z(100);
        }
        if (z11 && z12) {
            return true;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (!(c17969i0 instanceof C17961f1)) {
            str = "";
            str2 = str;
        } else {
            C17961f1 c17961f1 = (C17961f1) c17969i0;
            String mo95470a = c17961f1.mo95470a();
            str2 = c17961f1.m95500s();
            boolean m95170j6 = m95170j6();
            C31986k3 c31986k3 = C31986k3.f147083a;
            if (m95170j6 != c31986k3.m154109S1(mo95470a)) {
                str = "";
            } else {
                str = mo95470a;
            }
            if (m95170j6() != c31986k3.m154109S1(str2)) {
                str2 = "";
            }
            if (TextUtils.isEmpty(this.f90761y) && !TextUtils.isEmpty(c17961f1.mo95470a())) {
                String m102933T0 = AbstractC19646n0.m102933T0(this);
                if (ZMediaPlayer.cloneVideoFromCache(ZMediaPlayerSettings.getVideoConfig(0), ZMediaPlayerSettings.getCacheDir(0), c17961f1.mo95470a(), m102933T0)) {
                    if (new File(m102933T0).exists()) {
                        this.f90761y = m102933T0;
                        C7956b.m41474B().m41569z0(this, this.f90761y);
                    }
                } else {
                    C20556f c20556f = new C20556f(m94756g5(c17961f1.mo95470a()));
                    if (c20556f.m106830b() && c20556f.m106845r() > 0) {
                        try {
                            C20556f c20556f2 = new C20556f(m102933T0);
                            AbstractC23238v2.m119716a(c20556f, c20556f2);
                            if (c20556f2.m106830b()) {
                                this.f90761y = m102933T0;
                                C7956b.m41474B().m41569z0(this, this.f90761y);
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                            try {
                                if (!AbstractC23227u1.m119701a(e11)) {
                                    if ((e11 instanceof IOException) && !AbstractC23238v2.m119726k()) {
                                    }
                                }
                                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                                m94805rb();
                            } catch (Exception e12) {
                                AbstractC20110a.m104539h(e12);
                            }
                        }
                    }
                }
            }
            if (!this.f90648P0 && c17961f1.m95502t() <= 0 && !TextUtils.isEmpty(this.f90761y)) {
                m94843z9(this.f90761y, false);
                m94680K5();
            }
        }
        if (this.f90695f0 && z11) {
            m94804r5();
        } else {
            if (!this.f90683b0 && !z12) {
                if (!AbstractC23041d2.m118194A(m94947M4())) {
                    m94860C2(true);
                }
                if (TextUtils.isEmpty(str2) && !AbstractC23041d2.m118194A(m94947M4())) {
                    m94805rb();
                } else {
                    m95047Wb(str2);
                }
            }
            if (m95089b4() != 0 && !this.f90680a0 && !z11) {
                if (!TextUtils.isEmpty(str) && !this.f90701h0) {
                    m95025Ub(str);
                } else {
                    if (m95288w8() && TextUtils.isEmpty(this.f90761y)) {
                        if (this.f90739s1 == null) {
                            String m95485k = ((C17961f1) this.f90618F0).m95485k();
                            if (!TextUtils.isEmpty(m95485k) && new C20556f(m95485k).m106830b()) {
                                this.f90739s1 = new C28164q3.a(m95485k, AbstractC19646n0.m102930S0(m95485k));
                                C28164q3.m141691e().m141693b(this.f90739s1);
                            } else {
                                m94805rb();
                                return false;
                            }
                        }
                        C28164q3.a aVar = this.f90739s1;
                        if (aVar.f131256c) {
                            if (aVar.f131257d) {
                                m94934Ka(aVar.f131255b);
                                C7956b.m41474B().m41569z0(this, this.f90761y);
                                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                            } else {
                                if (aVar.f131258e == 601) {
                                    ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                                }
                                m94805rb();
                            }
                        }
                        return false;
                    }
                    if ((!m95288w8() || !AbstractC23309i.m121830dh()) && m95297x7()) {
                        m95067Yb();
                        return false;
                    }
                    String m95177k5 = m95177k5();
                    if (!TextUtils.isEmpty(m95177k5) && AbstractC23041d2.m118194A(m95177k5) && AbstractC23041d2.m118224w(m95177k5) > 0) {
                        C17966h0 c17966h0 = this.f90689d0;
                        if (c17966h0 != null && c17966h0.m95559j() > 0) {
                            this.f90689d0.m95566s(100);
                        }
                        m95025Ub("");
                    } else {
                        AbstractC20110a.m104543l("[Message]").mo104556o(8, "prepareSendVideo %s, video not existed", m95029V3().m41044h());
                        m94805rb();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: Ib */
    private boolean m94673Ib(AbstractC23214t.a aVar) {
        if (aVar != null && aVar.f112486e >= ChatRow.f57233h6) {
            return true;
        }
        return false;
    }

    /* renamed from: J5 */
    private void m94675J5() {
        int i11 = this.f90766z0 + 1;
        this.f90766z0 = i11;
        m95300xb(i11);
        AbstractC23306f.m120652d().m109892u1(this, this.f90766z0);
    }

    /* renamed from: J8 */
    public /* synthetic */ void m94676J8() {
        C7956b.m41474B().m41556r0(this, CoreUtility.f89233i);
    }

    /* renamed from: J9 */
    private boolean m94677J9() {
        boolean z11;
        String m104840K0;
        C17969i0 c17969i0 = this.f90618F0;
        if ((c17969i0 instanceof C17964g1) && ((C17964g1) c17969i0).m95530g() <= 0) {
            m95309yc();
            z11 = false;
        } else {
            z11 = true;
        }
        String str = this.f90761y;
        if (str.startsWith(C3162g.f13363a.m15935u())) {
            if (!mo95039W2().isEmpty()) {
                m104840K0 = C20131e.f99303a.m104978w(mo95039W2());
            } else {
                m104840K0 = AbstractC20130d.m104840K0();
            }
            try {
                File file = new File(str);
                String str2 = m104840K0 + file.getName();
                if (!file.renameTo(new File(str2)) || TextUtils.isEmpty(str2)) {
                    return false;
                }
                this.f90761y = str2;
                C7956b.m41474B().m41569z0(this, str2);
                return false;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                m94798qb();
                return false;
            }
        }
        return z11;
    }

    /* renamed from: Jb */
    private boolean m94678Jb(int i11, boolean z11) {
        if (i11 != 5 && !m95302y1(i11) && !m94644C1(i11, z11)) {
            return true;
        }
        return false;
    }

    /* renamed from: K5 */
    private void m94680K5() {
        C20612c c20612c;
        int i11;
        long m95508w;
        boolean z11;
        C17976k1 c17976k1 = this.f90675Y0;
        if (c17976k1 != null && (c20612c = c17976k1.f91048b) != null) {
            C20620k m107299w = c20612c.m107299w();
            if (m107299w != null) {
                i11 = m107299w.m107339j();
            } else {
                i11 = -1;
            }
            C17961f1 c17961f1 = (C17961f1) this.f90618F0;
            if (m107299w != null) {
                m95508w = Math.max(m107299w.m107342m(), c17961f1.m95508w() / 1000);
            } else {
                m95508w = c17961f1.m95508w() / 1000;
            }
            c20612c.m107264F(C20620k.m107330a().m107370u(c17961f1.m95456J()).m107356g(c17961f1.m95514z()).m107363n(this.f90761y).m107353d("mp4").m107366q(c17961f1.m95506v()).m107365p(c17961f1.m95502t()).m107367r(c17961f1.m95512y()).m107369t(c17961f1.m95450E()).m107368s(c17961f1.m95444B()).m107359j(i11).m107364o(m95508w).m107350a());
            if (c17961f1.m95464R() && !c17961f1.m95463Q()) {
                z11 = true;
            } else {
                z11 = false;
            }
            c20612c.m107272N(z11);
            String m107293q = c20612c.m107293q();
            if (AbstractC19646n0.m103007n1(this.f90737s)) {
                m107293q = C20614e.m107303a(m107293q);
            }
            this.f90675Y0.m95616a(m107293q);
        }
    }

    /* renamed from: K8 */
    public /* synthetic */ void m94681K8(boolean z11, boolean z12, ArrayList arrayList) {
        if (z11) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f90663U0.add(new SuggestionTimeSpan((SuggestionTimeSpan) arrayList.get(i11)));
            }
        }
        if (z12) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                this.f90666V0.add(new SuggestionTimeSpan((SuggestionTimeSpan) arrayList.get(i12)));
            }
        }
        if (this.f90663U0.size() > 0 || this.f90666V0.size() > 0) {
            m94951M9();
            C23744a.m124114c().m124116d(3, this.f90737s);
            if (this.f90733r.equals(CoreUtility.f89233i) && this.f90663U0.size() > 0) {
                if (m94847A6()) {
                    AbstractC23647d.m123897g("77709013");
                } else {
                    AbstractC23647d.m123897g("77709012");
                }
            }
            if (this.f90733r.equals(CoreUtility.f89233i) && this.f90666V0.size() > 0) {
                if (m94847A6()) {
                    AbstractC23647d.m123897g("77709015");
                } else {
                    AbstractC23647d.m123897g("77709014");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:            if (r4 != 23) goto L241;     */
    /* renamed from: K9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m94682K9() {
        boolean z11;
        String str;
        String str2;
        AbstractC2531f0 abstractC2531f0;
        String str3;
        String str4;
        if (this.f90658S1) {
            return false;
        }
        if (!this.f90652Q1 && (m95142g6() || m94762i1())) {
            return false;
        }
        C31897e4 c31897e4 = this.f90622G1;
        if (c31897e4 != null && c31897e4.m153279t()) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.f90614E;
        if (i11 != 0) {
            if (i11 != 6) {
                if (i11 != 12) {
                    if (i11 != 29 && i11 != 31 && i11 != 2) {
                        if (i11 != 3 && i11 != 4) {
                            if (i11 != 18) {
                                if (i11 != 19) {
                                    if (i11 == 22) {
                                        if (!z11 && !m94664G9()) {
                                            return false;
                                        }
                                    }
                                } else if (!z11 && !m94672I9()) {
                                    return false;
                                }
                            } else {
                                this.f90753w = "";
                                this.f90749v = "";
                            }
                        } else if (this.f90680a0 || (!z11 && !m94686L9())) {
                            return false;
                        }
                    }
                    if (this.f90680a0 || (!z11 && !m95025Ub(""))) {
                        return false;
                    }
                } else if (!m94652D9() || !m94657E9()) {
                    return false;
                }
            } else if (this.f90680a0 || (!z11 && (!m94677J9() || !m95025Ub("")))) {
                return false;
            }
        } else if (!m94660F9() || !m94668H9()) {
            return false;
        }
        C31897e4 c31897e42 = this.f90622G1;
        if (c31897e42 != null) {
            List m153268i = c31897e42.m153268i();
            C31986k3 c31986k3 = C31986k3.f147083a;
            int m154135n0 = c31986k3.m154135n0(this.f90737s, m153268i);
            if (m154135n0 == 0) {
                if (z11) {
                    abstractC2531f0 = AbstractC2531f0.d.f10296b;
                } else {
                    abstractC2531f0 = AbstractC2531f0.f.f10298b;
                }
                this.f90631J1 = abstractC2531f0;
                if (!AbstractC25495a.m132079d(this.f90737s) && !z11) {
                    if (!c31986k3.m154152z1(this.f90737s) && AbstractC23306f.m120562A().m2518K(this.f90737s) < AbstractC0924m0.m3153J0()) {
                        C24559a.m127933c("[E2EE]", "prepareSendingMessage: RETRY SENDING | SESSION INVALID | " + this.f90729q);
                        return false;
                    }
                    if (c31986k3.m154152z1(this.f90737s)) {
                        this.f90631J1 = AbstractC2531f0.a.f10293b;
                    }
                    if (AbstractC0924m0.m3190K8()) {
                        C23744a m124114c = C23744a.m124114c();
                        String str5 = this.f90737s;
                        m124114c.m124116d(154, str5, str5, -1);
                    } else if (AbstractC0924m0.m3452T9()) {
                        boolean m94651D5 = m94651D5();
                        C24559a.m127933c("[E2EE]", "prepareSendingMessage: SEND NON-E2EE MESSAGE | SESSION INVALID | " + this.f90729q + " | hasE2eeUrl=" + m94651D5);
                        m94902H1();
                        if (!m94847A6()) {
                            str3 = "1";
                        } else {
                            str3 = "2";
                        }
                        if (!m94847A6()) {
                            str4 = "";
                        } else {
                            str4 = this.f90737s;
                        }
                        C2544s.m12803r(this.f90737s, str4, "", -1, this.f90634K1, str3, this.f90631J1, this.f90729q.m41045i(), 0);
                        if (m94651D5) {
                            m94882Eb("");
                            m94892Fb("");
                            return false;
                        }
                    }
                }
                C24559a.m127933c("[E2EE]", "prepareSendingMessage: MESSAGE NOT SENDING | SESSION INVALID | " + this.f90729q + " | hasE2eeUrl=" + m94651D5());
                m95263t9(m153268i, false);
                return false;
            }
            if ((m154135n0 != 4 || m94847A6()) && m154135n0 != 6) {
                return false;
            }
            if (this.f90622G1.m153276q()) {
                this.f90622G1.m153262b(this.f90737s);
                if (!this.f90622G1.m153272m()) {
                    this.f90631J1 = AbstractC2531f0.a.f10293b;
                    if (AbstractC0924m0.m3190K8() && !m94847A6()) {
                        C23744a.m124114c().m124116d(154, this.f90737s);
                    } else if (AbstractC0924m0.m3452T9() && !m94847A6() && !m94651D5()) {
                        boolean m94651D52 = m94651D5();
                        C24559a.m127933c("[E2EE]", "prepareSendingMessage: SEND NON-E2EE MESSAGE | NO SENDING CLIENT | " + this.f90729q + " | hasE2eeUrl=" + m94651D52);
                        m94902H1();
                        if (!m94847A6()) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        if (!m94847A6()) {
                            str2 = "";
                        } else {
                            str2 = this.f90737s;
                        }
                        C2544s.m12803r(this.f90737s, str2, "", -1, this.f90634K1, str, this.f90631J1, this.f90729q.m41045i(), 0);
                        if (m94651D52) {
                            m94882Eb("");
                            m94892Fb("");
                            return false;
                        }
                    }
                    C24559a.m127933c("[E2EE]", "prepareSendingMessage: MESSAGE NOT SENDING | NO SENDING CLIENT | " + this.f90729q + " | hasE2eeUrl=" + m94651D5());
                    m95263t9(m153268i, false);
                    return false;
                }
            } else if (!this.f90622G1.m153272m()) {
                return false;
            }
            return m95246s1();
        }
        if (!m94651D5()) {
            return true;
        }
        C24559a.m127933c("E2EE", "Non-e2ee message has encrypted URL, try re-uploading | " + this.f90729q);
        m94882Eb("");
        m94892Fb("");
        return false;
    }

    /* renamed from: Kb */
    private void m94683Kb(int i11, boolean z11) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 5) {
                    if (i11 != 7) {
                        if (i11 != 8) {
                            return;
                        }
                    } else {
                        if (z11) {
                            if (m95276v6()) {
                                AbstractC31111g.m151140u(AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_file_rolled));
                                return;
                            } else if (m95306y8()) {
                                AbstractC31111g.m151140u(AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_video_rolled));
                                return;
                            } else {
                                if (m94871D7()) {
                                    AbstractC31111g.m151140u(AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_photo_rolled));
                                    return;
                                }
                                return;
                            }
                        }
                        if (m95276v6()) {
                            if (m95302y1(i11)) {
                                AbstractC31111g.m151140u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_roll_file_error));
                                return;
                            } else {
                                AbstractC31111g.m151140u(AbstractC23136l9.m118743r0(AbstractC8020f0.error_file_notfound));
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    AbstractC31111g.m151140u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_full_sdcard_more_descriptive));
                    return;
                }
            }
            AbstractC31111g.m151140u(null);
            return;
        }
        AbstractC31111g.m151140u(AbstractC23136l9.m118743r0(AbstractC8020f0.error_file_notfound));
    }

    /* renamed from: L8 */
    public /* synthetic */ void m94685L8() {
        C7956b.m41474B().m41507F0(this);
    }

    /* renamed from: L9 */
    private boolean m94686L9() {
        boolean z11;
        String m95737B;
        String str;
        boolean z12 = true;
        if (m95185l4() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m94757g9 = m94757g9();
        if (z11 && !m94757g9) {
            return true;
        }
        if (m94757g9 && !this.f90635L) {
            m94713Sb();
        }
        if (!z11 && !m95242r8()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C18009w0) {
                C18009w0 c18009w0 = (C18009w0) c17969i0;
                if (this.f90614E != 4) {
                    z12 = false;
                }
                if (z12) {
                    m95737B = c18009w0.m95782p();
                } else {
                    m95737B = c18009w0.m95737B();
                }
                String str2 = "";
                if (!m95170j6() || !z12) {
                    str = "";
                } else {
                    str = c18009w0.m95737B();
                }
                if (!TextUtils.isEmpty(m95737B) && m95170j6() != C31986k3.f147083a.m154109S1(m95737B)) {
                    m95737B = "";
                } else {
                    str2 = str;
                }
                m95036Vb(m95737B, str2);
            }
        }
        return false;
    }

    /* renamed from: Lb */
    public void m94687Lb(boolean z11, int i11, String str) {
        if (i11 == -101) {
            m95190l9(z11, 0, null);
            return;
        }
        if (!AbstractC23238v2.m119726k()) {
            m95190l9(z11, 5, new Exception("code: " + i11 + " - url: " + str));
            return;
        }
        m95190l9(z11, 2, new Exception("code: " + i11 + " - url: " + str));
    }

    /* renamed from: M0 */
    private boolean m94689M0(boolean z11) {
        if (z11 && m94871D7() && AbstractC19646n0.m102999l1()) {
            return true;
        }
        return false;
    }

    /* renamed from: M8 */
    public /* synthetic */ void m94690M8() {
        try {
            if (!m95219o8() && !m95091b6() && !m95098c6()) {
                C7956b.m41474B().m41554q0(this, CoreUtility.f89233i);
                C7961f.m42643z().m42653s(this, true);
                if (equals(AbstractC23306f.m120584H0().m2603B(this.f90737s))) {
                    C7959d.m41638d1().m41737P3(this.f90737s, this.f90614E, this.f90745u);
                }
                m94782n2();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N4 */
    private String m94692N4() {
        return C20131e.f99303a.m104938U() + AbstractC23352g.m122788d(m94862C4() + this.f90729q.m41044h()) + ".jpg";
    }

    /* renamed from: N8 */
    public /* synthetic */ void m94693N8() {
        try {
            if (!m95219o8() && !m95091b6() && !m95098c6()) {
                C7956b.m41474B().m41505D0(this, CoreUtility.f89233i);
                if (equals(AbstractC23306f.m120584H0().m2603B(this.f90737s))) {
                    C7959d.m41638d1().m41741Q3(this.f90737s, this.f90614E);
                }
                m94782n2();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N9 */
    private void m94694N9(EnumC19029c enumC19029c, C19028b c19028b, String str, String str2, boolean z11) {
        switch (n.f90798a[enumC19029c.ordinal()]) {
            case 1:
            case 2:
                m94763i2(EnumC19029c.f94854t);
                m95140g2(str, z11);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                m94763i2(enumC19029c);
                m95116e2(z11);
                return;
            case 7:
                m94792p9(7, c19028b, str2, z11);
                return;
            default:
                return;
        }
    }

    /* renamed from: O7 */
    private boolean m94696O7() {
        C32098s c32098s;
        if (!m94960N7()) {
            return false;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (!(c17969i0 instanceof C18013y0) || (c32098s = ((C18013y0) c17969i0).f91251B) == null || c32098s.m154937g() != EnumC27376c.f128983r) {
            return false;
        }
        return true;
    }

    /* renamed from: O8 */
    public /* synthetic */ void m94697O8() {
        C7956b.m41474B().m41507F0(this);
    }

    /* renamed from: O9 */
    public void m94698O9() {
        if (m94802r1()) {
            return;
        }
        AbstractC23306f.m120652d().m109880h0(this, this.f90604B1);
    }

    /* renamed from: Oa */
    private void m94699Oa(String str, String str2, String str3, String str4) {
        this.f90729q = MessageId.m41036c(str, str2, str3, str4);
    }

    /* renamed from: P1 */
    public static C17945a0 m94701P1(String str, int i11, C17997r1 c17997r1) {
        return new w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), i11).m95351C(c17997r1).m95365a();
    }

    /* renamed from: P8 */
    public /* synthetic */ void m94702P8() {
        C7956b.m41474B().m41507F0(this);
    }

    /* renamed from: Q1 */
    public static C17945a0 m94704Q1(C25630b c25630b, C17997r1 c17997r1, String str) {
        return new w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 10).m95368d(new C17949b1(c25630b)).m95351C(c17997r1).m95365a();
    }

    /* renamed from: Q8 */
    public /* synthetic */ void m94705Q8(String str, C18013y0 c18013y0) {
        try {
            C7956b.m41474B().m41526R0(this, m95029V3(), this.f90614E, this.f90618F0);
            List m41565x = C7956b.m41474B().m41565x(m95029V3());
            if (m41565x.size() > 0) {
                for (int i11 = 0; i11 < m41565x.size(); i11++) {
                    C17945a0 c17945a0 = (C17945a0) m41565x.get(i11);
                    if (c17945a0 != null && c17945a0.m95275v4() != null && c17945a0.m95275v4().m95687d() != 38 && m95135f9(c17945a0.m95275v4().m95689f())) {
                        c17945a0.m95275v4().m95700q(38);
                        c17945a0.m95275v4().m95699p(str);
                        c17945a0.m95275v4().m95702s(c18013y0);
                        C7956b.m41474B().m41511I0(c17945a0);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Qb */
    private void m94706Qb(InterfaceC20633g interfaceC20633g) {
        C24302e.m126895s().m126906o(this, new s(interfaceC20633g));
    }

    /* renamed from: R1 */
    private C20627a.a m94708R1() {
        return new C20627a.a() { // from class: dj.g
            public /* synthetic */ C17962g() {
            }

            @Override // in.C20627a.a
            /* renamed from: a */
            public final boolean mo95516a(int i11) {
                boolean m94671I8;
                m94671I8 = C17945a0.this.m94671I8(i11);
                return m94671I8;
            }
        };
    }

    /* renamed from: R8 */
    public /* synthetic */ void m94709R8() {
        String str;
        if (equals(AbstractC23306f.m120584H0().m2603B(this.f90737s))) {
            if ("recommened.link".equals(this.f90618F0.f91016u)) {
                String str2 = this.f90618F0.f91011p;
                if (TextUtils.isEmpty(str2)) {
                    C17969i0 c17969i0 = this.f90618F0;
                    if (((C18013y0) c17969i0).f91251B != null) {
                        str2 = ((C18013y0) c17969i0).f91251B.f147953c;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_type_msg_link, str2);
                } else {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_recommend_link_default);
                }
            } else if ("recommened.user".equals(this.f90618F0.f91016u)) {
                str = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_contact, this.f90618F0.f91011p);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C7959d.m41638d1().m41737P3(this.f90737s, this.f90614E, str);
            } else {
                C7959d.m41638d1().m41741Q3(this.f90737s, this.f90614E);
            }
        }
    }

    /* renamed from: S1 */
    private InterfaceC20633g m94711S1(C19028b c19028b, C21216s c21216s, String str, boolean z11) {
        return new t(c19028b, c21216s, str, z11);
    }

    /* renamed from: S8 */
    public /* synthetic */ void m94712S8(boolean z11, boolean z12, String str, String str2, boolean z13, SensitiveData sensitiveData) {
        int i11;
        String str3;
        long j11;
        String m120305Q;
        String str4;
        try {
            try {
                i11 = 6;
            } catch (Exception e11) {
                e11.printStackTrace();
                m95190l9(z11, 1, e11);
                this.f90764y2 = false;
                if (!m95276v6()) {
                    return;
                }
            }
            if (!AbstractC23034c6.m118118E()) {
                m95190l9(z11, 6, null);
                this.f90764y2 = false;
                if (m95276v6()) {
                    AbstractC32201z4.m155250k(m95029V3().m41045i());
                    return;
                }
                return;
            }
            synchronized (C32090r5.m154810i()) {
                try {
                    if (z12) {
                        if (str.isEmpty()) {
                            str4 = m94767j4();
                        } else {
                            str4 = str;
                        }
                        m120305Q = AbstractC23280z4.m120304P(str2, str4, true, z13, true, sensitiveData);
                    } else {
                        if (str.isEmpty()) {
                            str3 = m94760h5();
                        } else {
                            str3 = str;
                        }
                        C17969i0 c17969i0 = this.f90618F0;
                        if (c17969i0 != null && (c17969i0 instanceof C17961f1)) {
                            j11 = ((C17961f1) c17969i0).m95508w();
                        } else {
                            j11 = 0;
                        }
                        m120305Q = AbstractC23280z4.m120305Q(str2, str3, j11, z13, true, sensitiveData);
                    }
                    if (!TextUtils.isEmpty(m120305Q)) {
                        m94779m9(Boolean.valueOf(z11));
                    } else {
                        if (!AbstractC23238v2.m119726k()) {
                            i11 = 5;
                        }
                        m95190l9(z11, i11, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f90764y2 = false;
            if (!m95276v6()) {
                return;
            }
            AbstractC32201z4.m155250k(m95029V3().m41045i());
        } catch (Throwable th3) {
            this.f90764y2 = false;
            if (m95276v6()) {
                AbstractC32201z4.m155250k(m95029V3().m41045i());
            }
            throw th3;
        }
    }

    /* renamed from: Sb */
    private void m94713Sb() {
        this.f90638M = false;
        this.f90635L = true;
        this.f90641N = System.currentTimeMillis();
        C0807c.m2042b(new u());
    }

    /* renamed from: T2 */
    private String m94715T2(String str) {
        return AbstractC20130d.m104871f0() + AbstractC23352g.m122788d(str) + AbstractC23041d2.m118220s(str);
    }

    /* renamed from: T8 */
    public /* synthetic */ void m94716T8(boolean z11, SensitiveData sensitiveData) {
        if (!m95075Z7()) {
            if (z11) {
                ToastUtils.showMess(true, MainApplication.getAppContext().getString(AbstractC8020f0.str_can_not_react));
            }
            m95190l9(false, 0, null);
            m95116e2(true);
            m95175k2();
            return;
        }
        try {
            if (this.f90764y2) {
                return;
            }
            String m102945X0 = AbstractC19646n0.m102945X0(this);
            if (m102945X0.isEmpty()) {
                m95190l9(z11, 3, null);
                m95116e2(true);
                m95175k2();
                return;
            }
            this.f90764y2 = true;
            C20556f c20556f = new C20556f(m102945X0);
            if (m102945X0.startsWith(C20131e.m104920n0()) && c20556f.m106830b() && c20556f.m106845r() > 0) {
                m95140g2(m102945X0, true);
                m95183l2();
                m95093ba(m102945X0, "", z11, true, sensitiveData);
            } else {
                this.f90768z2 = z11;
                AbstractC23306f.m120652d().m109854F(CoreUtility.f89233i, this);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f90764y2 = false;
            this.f90768z2 = false;
            m95190l9(z11, 1, e11);
            m95116e2(true);
            m95175k2();
        }
    }

    /* renamed from: T9 */
    private void m94717T9() {
        this.f90604B1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* renamed from: U1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC23214t.a m94719U1(String str, int i11, boolean z11, boolean z12, TextPaint textPaint) {
        String str2;
        ArrayList arrayList;
        int i12;
        float f11;
        C17969i0 c17969i0;
        C31890dc c31890dc;
        List list;
        String str3;
        C7907e c7907e = this.f90657S0;
        List list2 = null;
        if (c7907e != null && c7907e.m40861l() > 0 && !TextUtils.isEmpty(str)) {
            C7907e c7907e2 = this.f90657S0;
            if (c7907e2.f42789b && c7907e2.m40853c()) {
                C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.b
                    public /* synthetic */ RunnableC17947b() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17945a0.this.m94676J8();
                    }
                }));
            }
            List m40857g = this.f90657S0.m40857g();
            C17969i0 c17969i02 = this.f90618F0;
            if (c17969i02 instanceof C18015z0) {
                list = ((C18015z0) c17969i02).f91255B;
            } else {
                list = null;
            }
            if (m94847A6()) {
                str3 = this.f90737s;
            } else {
                str3 = "";
            }
            String m102676M = AbstractC19620d0.m102676M(m40857g, str, str3, this.f90663U0, this.f90666V0, list);
            arrayList = AbstractC19620d0.m102673J(m40857g, m102676M);
            str2 = m102676M;
        } else {
            str2 = str;
            arrayList = null;
        }
        C17979l1 c17979l1 = this.f90669W0;
        int i13 = 0;
        if (c17979l1 != null) {
            int i14 = c17979l1.f91058a;
            if (i14 > 0) {
                i13 = i14;
            }
            if (c17979l1.m95620b() == 4 && (c31890dc = this.f90669W0.f91066i) != null && c31890dc.f146495a != 0) {
                int textSize = (int) textPaint.getTextSize();
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                f11 = (AbstractC23136l9.m118742r(c31890dc.f146502h) * C13778s1.m76962c()) - ((int) (fontMetrics.descent - fontMetrics.ascent));
                i12 = textSize;
                c17969i0 = this.f90618F0;
                if (c17969i0 instanceof C18015z0) {
                    list2 = ((C18015z0) c17969i0).f91255B;
                }
                return AbstractC23214t.m119616c(str2, textPaint, i11, ChatRow.f57233h6, !z11, z12, null, AbstractC11531v0.m62222Y2(), arrayList, this.f90663U0, list2, i12, 1.0f, f11);
            }
            i12 = i13;
        } else {
            i12 = 0;
        }
        f11 = 0.0f;
        c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C18015z0) {
        }
        return AbstractC23214t.m119616c(str2, textPaint, i11, ChatRow.f57233h6, !z11, z12, null, AbstractC11531v0.m62222Y2(), arrayList, this.f90663U0, list2, i12, 1.0f, f11);
    }

    /* renamed from: U2 */
    private int m94720U2(C19028b c19028b) {
        int i11;
        if (m94871D7()) {
            if (c19028b.m100092b()) {
                return 26017;
            }
            return 26000;
        }
        if (m95306y8()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null && (c17969i0 instanceof C17961f1) && ((C17961f1) c17969i0).m95461O()) {
                i11 = 26025;
            } else {
                i11 = 26018;
            }
            if (!c19028b.m100092b()) {
                return 100012;
            }
            return i11;
        }
        if (m95276v6()) {
            if (c19028b.m100092b()) {
                return 26020;
            }
            return 26002;
        }
        if (m95314z6()) {
            return 99997;
        }
        if (m95316z8()) {
            if (c19028b.m100092b()) {
                return 26019;
            }
            return 26012;
        }
        return -1;
    }

    /* renamed from: U6 */
    public boolean m94721U6() {
        if (this.f90733r == CoreUtility.f89233i && !this.f90623H) {
            return true;
        }
        return false;
    }

    /* renamed from: U8 */
    public /* synthetic */ void m94722U8(int i11, String str, Boolean bool) {
        boolean z11;
        String str2;
        String str3;
        try {
            if (!m95316z8()) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
                return;
            }
            String str4 = this.f90761y;
            String m95534l = ((C17964g1) this.f90618F0).m95534l();
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(m95534l)) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
                return;
            }
            if (!TextUtils.isEmpty(str4) && AbstractC23041d2.m118194A(str4)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str2 = str4.substring(str4.lastIndexOf("/") + 1, str4.lastIndexOf("."));
            } else {
                str2 = "";
            }
            if (AbstractC32201z4.m155246g(str2)) {
                str3 = str2 + AbstractC23041d2.m118220s(m95534l);
            } else {
                str3 = AbstractC32201z4.m155243d(this.f90765z) + AbstractC23041d2.m118220s(m95534l);
            }
            MessageId messageId = this.f90729q;
            if (!z11) {
                C2526d.f10270a.m12729v(messageId, i11, "csc_msgmenu", str);
                m94803r2();
            } else {
                String m120300L = AbstractC23280z4.m120300L(str4, str3, true, null);
                if (AbstractC23254w8.m119859g(m120300L)) {
                    m120300L = new C20556f(m120300L).m106843p();
                }
                if (bool.booleanValue()) {
                    if (m120300L != null && !m120300L.isEmpty()) {
                        ToastUtils.showMess(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_message_download_finished), m120300L));
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_notification_download_complete));
                    }
                }
                C2526d.f10270a.m12689M(this, i11, "csc_msgmenu", str);
            }
            C23744a.m124114c().m124116d(6, messageId);
        } catch (Exception e11) {
            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: V8 */
    public static /* synthetic */ void m94724V8() {
        C28719g.f133214a.m143843M(true);
    }

    /* renamed from: W8 */
    public /* synthetic */ void m94726W8(int i11, boolean z11) {
        C7956b.m41474B().m41522O0(this, -1, i11, false);
        if (z11) {
            C7959d.m41638d1().m41712I3(this, -1, i11);
        }
    }

    /* renamed from: X8 */
    public /* synthetic */ void m94728X8(int i11, boolean z11) {
        C7956b.m41474B().m41522O0(this, i11, -1, z11);
        C7959d.m41638d1().m41712I3(this, i11, -1);
    }

    /* renamed from: Y0 */
    private boolean m94730Y0() {
        return m94872D8();
    }

    /* renamed from: Y8 */
    public /* synthetic */ void m94731Y8() {
        C7956b.m41474B().m41513J0(this, this.f90618F0);
    }

    /* renamed from: Y9 */
    private void m94732Y9(C19028b c19028b) {
        if (c19028b.m100093c() || c19028b.m100094d()) {
            this.f90746u0 = C23793c.m124316k().mo124319c();
        }
    }

    /* renamed from: Z8 */
    public /* synthetic */ void m94734Z8(boolean z11, String str) {
        try {
            m95165ic(5, true);
            if (z11) {
                String str2 = this.f90737s;
                C17969i0 c17969i0 = this.f90618F0;
                m94740ac(str2, "", ((C17955d1) c17969i0).f90891E, ((C17955d1) c17969i0).f90888B, ((C17955d1) c17969i0).f90890D);
            }
            ((C21216s) C21216s.Companion.m122672a()).m109896x1(str, this);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Z9 */
    private void m94735Z9(String str, String str2, boolean z11, boolean z12, boolean z13, SensitiveData sensitiveData) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: dj.h

            /* renamed from: q */
            public final /* synthetic */ boolean f90969q;

            /* renamed from: r */
            public final /* synthetic */ boolean f90970r;

            /* renamed from: s */
            public final /* synthetic */ String f90971s;

            /* renamed from: t */
            public final /* synthetic */ String f90972t;

            /* renamed from: u */
            public final /* synthetic */ boolean f90973u;

            /* renamed from: v */
            public final /* synthetic */ SensitiveData f90974v;

            public /* synthetic */ RunnableC17965h(boolean z122, boolean z112, String str22, String str3, boolean z132, SensitiveData sensitiveData2) {
                r2 = z122;
                r3 = z112;
                r4 = str22;
                r5 = str3;
                r6 = z132;
                r7 = sensitiveData2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17945a0.this.m94712S8(r2, r3, r4, r5, r6, r7);
            }
        });
    }

    /* renamed from: a1 */
    public void m94737a1(boolean z11, boolean z12, boolean z13, boolean z14) {
        try {
            C17966h0 c17966h0 = this.f90689d0;
            if (c17966h0 != null && z14) {
                c17966h0.m95561m();
            }
            this.f90677Z.set(false);
            C20629c.m107448k().m107452f(m95293x2(), m95029V3().toString());
            C24302e.m126895s().m126903i(mo95039W2(), m94862C4(), m95029V3());
            synchronized (this.f90700g2) {
                try {
                    C22981a c22981a = this.f90697f2;
                    if (c22981a != null) {
                        if (z13) {
                            c22981a.m117747S();
                        }
                        this.f90697f2.mo107421i(true);
                    }
                    this.f90697f2 = null;
                } finally {
                }
            }
            if (z11) {
                AbstractC32201z4.m155250k(m95029V3().m41045i());
            }
            if (z12) {
                m94717T9();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a4 */
    private String m94738a4(boolean z11) {
        String str;
        String str2;
        if (m94960N7()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C18013y0) {
                C32098s c32098s = ((C18013y0) c17969i0).f91251B;
                String str3 = "";
                if (c32098s != null && (str2 = c32098s.f147953c) != null) {
                    str3 = str2;
                }
                if (z11) {
                    str = m94764i4(c17969i0.f91011p);
                } else {
                    str = c17969i0.f91011p;
                }
                String str4 = str3 + " " + str;
                if (!TextUtils.isEmpty(str4)) {
                    return AbstractC23136l9.m118746s0(AbstractC8020f0.str_type_msg_link, str4);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a9 */
    public /* synthetic */ void m94739a9(int i11) {
        m95301xc(i11);
        this.f90670W1.set(false);
        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
    }

    /* renamed from: ac */
    private void m94740ac(String str, String str2, String str3, String str4, int i11) {
        try {
            if (!m94889F6()) {
                C3538f c3538f = new C3538f();
                c3538f.f14927c = str3;
                c3538f.f14925a = str4;
                c3538f.f14930f = i11;
                c3538f.f14931g = str2;
                C7960e.m41971c6().m42201M7(c3538f, str);
                AbstractC23306f.m120562A().m2535e0(this.f90737s);
                C23744a.m124114c().m124116d(38, this.f90737s, Boolean.TRUE);
            } else {
                AbstractC23306f.m120562A().m2535e0(this.f90737s);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b8 */
    private boolean m94742b8() {
        C17969i0 c17969i0 = this.f90618F0;
        if ((c17969i0 instanceof C18009w0) && ((C18009w0) c17969i0).m95745J()) {
            return true;
        }
        return false;
    }

    /* renamed from: b9 */
    public /* synthetic */ void m94743b9(String str) {
        int m40114X = C7853b.m40052a0().m40114X(str);
        if (m40114X > 0) {
            AbstractC19444a.m101695c(new Runnable() { // from class: dj.n

                /* renamed from: q */
                public final /* synthetic */ int f91078q;

                public /* synthetic */ RunnableC17983n(int m40114X2) {
                    r2 = m40114X2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.this.m94739a9(r2);
                }
            });
        } else {
            this.f90670W1.set(false);
        }
    }

    /* renamed from: c2 */
    public void m94745c2() {
        if (this.f90735r1 && m94784n7()) {
            this.f90735r1 = false;
        }
    }

    /* renamed from: c3 */
    private EnumC19029c m94746c3(int i11) {
        if (i11 != -6) {
            if (i11 != 5 && i11 != 6) {
                return EnumC19029c.f94855u;
            }
            return EnumC19029c.f94859y;
        }
        return EnumC19029c.f94856v;
    }

    /* renamed from: c5 */
    private String m94747c5() {
        Object obj = this.f90618F0;
        if (obj instanceof InterfaceC17973j1) {
            return ((InterfaceC17973j1) obj).mo95470a();
        }
        return "";
    }

    /* renamed from: d5 */
    private String m94749d5() {
        String m95293x2 = m95293x2();
        if (m95293x2.isEmpty()) {
            return m94747c5();
        }
        return m95293x2;
    }

    /* renamed from: d7 */
    private boolean m94750d7() {
        C31944h6.b bVar = this.f90744t2;
        if (bVar != null && bVar.f146792e == 1 && bVar.f146788a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: ea */
    private void m94752ea() {
        List list;
        if (!this.f90706i2 && !m95219o8()) {
            try {
                long mo124319c = C23793c.m124316k().mo124319c();
                C31897e4 c31897e4 = this.f90622G1;
                if (c31897e4 != null) {
                    list = c31897e4.m153268i();
                } else {
                    list = null;
                }
                if (this.f90622G1 != null) {
                    if (!(!list.isEmpty())) {
                        return;
                    }
                } else if (m95089b4() != 1) {
                    return;
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new v(list, mo124319c, m95041W4()));
                C24559a.m127933c("[Message]", String.format("send message: %d", Long.valueOf(m95029V3().m41045i())));
                this.f90706i2 = true;
                c0766k.mo1734s6(this.f90737s, this, list);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: g3 */
    private String m94755g3() {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f90733r);
        if (m141809c != null && !TextUtils.isEmpty(m141809c.f42437s)) {
            String m40383Q = m141809c.m40383Q(true, false);
            if (TextUtils.isEmpty(m40383Q)) {
                return m141809c.f42437s;
            }
            return m40383Q;
        }
        return this.f90610D;
    }

    /* renamed from: g5 */
    private String m94756g5(String str) {
        return AbstractC20130d.m104904x0().getAbsolutePath() + File.separator + AbstractC23352g.m122788d(str) + ".mp4";
    }

    /* renamed from: g9 */
    private boolean m94757g9() {
        if (AbstractC26689j.m137117z() <= 0 || this.f90638M || m94983Q3().isEmpty() || m94888F5()) {
            return false;
        }
        if (this.f90641N != -1 && System.currentTimeMillis() - this.f90641N > 500) {
            return false;
        }
        return true;
    }

    /* renamed from: h1 */
    private C20627a.a m94759h1() {
        if (m94871D7()) {
            return m94708R1();
        }
        return null;
    }

    /* renamed from: h5 */
    private String m94760h5() {
        return "VIDEO_DOWNLOAD_" + m95028V2() + "_" + System.currentTimeMillis() + ".mp4";
    }

    /* renamed from: i1 */
    private boolean m94762i1() {
        if (TextUtils.isEmpty(this.f90753w) && m95154h9()) {
            String m94747c5 = m94747c5();
            if (!TextUtils.isEmpty(m94747c5)) {
                boolean m95170j6 = m95170j6();
                C31986k3 c31986k3 = C31986k3.f147083a;
                if (m95170j6 != c31986k3.m154109S1(m94747c5) || ((!c31986k3.m154109S1(m94747c5) && c31986k3.m154121a2(this.f90737s) && c31986k3.m154098K2(this.f90737s)) || (TextUtils.isEmpty(this.f90761y) && m94871D7()))) {
                    m94980Pb(C19028b.Companion.m100099a(C19028b.b.f94846s, true, false), false);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i2 */
    private void m94763i2(EnumC19029c enumC19029c) {
        C25496a c25496a;
        WeakReference weakReference = this.f90703h2;
        if (weakReference == null) {
            return;
        }
        InterfaceC19030d interfaceC19030d = (InterfaceC19030d) weakReference.get();
        if (this.f90746u0 > 0 && (c25496a = this.f90738s0) != null) {
            c25496a.m132095e(Math.max(C23793c.m124316k().mo124319c() - this.f90746u0, 0L));
        }
        if (interfaceC19030d != null) {
            interfaceC19030d.mo43099y(this.f90729q, enumC19029c);
        }
        this.f90703h2 = null;
    }

    /* renamed from: i4 */
    private String m94764i4(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        C7907e c7907e = this.f90657S0;
        if (c7907e == null) {
            return str;
        }
        List m40857g = c7907e.m40857g();
        if (m94847A6()) {
            str2 = this.f90737s;
        } else {
            str2 = "";
        }
        return AbstractC19620d0.m102675L(m40857g, str, str2);
    }

    /* renamed from: i9 */
    public static C17945a0 m94765i9(String str, String str2, int i11) {
        w m95375k = new w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str2, CoreUtility.f89233i), i11).m95375k(true);
        if (AbstractC19646n0.m103031t1(i11)) {
            m95375k.m95368d(new C18009w0(str, "", "", "", 0, 0));
        } else if (AbstractC19646n0.m102995k1(i11)) {
            m95375k.m95368d(new C17981m0(str, 0, 0));
        } else {
            m95375k.m95382r(str);
        }
        if (AbstractC19656s0.m103053B(i11)) {
            m95375k.m95353E(new C32094r9()).m95357I(C23793c.m124316k().mo124319c());
        }
        C17945a0 m95365a = m95375k.m95365a();
        m95365a.m94951M9();
        return m95365a;
    }

    /* renamed from: j4 */
    private String m94767j4() {
        return "IMG_" + m95028V2() + "_" + System.currentTimeMillis() + ".jpg";
    }

    /* renamed from: j7 */
    public boolean m94768j7() {
        C31944h6.b bVar = this.f90744t2;
        if (bVar != null && bVar.f146792e == 1 && AbstractC0924m0.m3481U9() && C23793c.m124316k().mo124314i() - this.f90765z <= AbstractC0924m0.m3980l4()) {
            return true;
        }
        return false;
    }

    /* renamed from: j9 */
    public static C17945a0 m94769j9(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                MessageId m41038e = MessageId.m41038e("", jSONObject.getString("id"), jSONObject.getString("uid"), "");
                if (m41038e == null) {
                    return null;
                }
                return new w(m41038e, jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE)).m95382r(jSONObject.getString("msg")).m95354F(jSONObject.getString("senderName")).m95388x(jSONObject.getLong("notifyTTL")).m95365a();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: k1 */
    private boolean m94771k1(C19028b c19028b, boolean z11) {
        if (!z11 && m94818u6()) {
            if (c19028b.m100094d()) {
                m94793pa();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k3 */
    private String m94772k3(boolean z11) {
        boolean m154110T1 = C31986k3.f147083a.m154110T1();
        if (z11) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_waiting_e2ee_decrypted_failed);
        }
        if (!m154110T1 && m95032V6()) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_decrypted_failed_incognito_sender);
        }
        if (!m154110T1 && !m95032V6()) {
            String m94755g3 = m94755g3();
            if (TextUtils.isEmpty(m94755g3)) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_decrypted_failed_incognito_sender);
            }
            return AbstractC23136l9.m118746s0(AbstractC8020f0.str_e2ee_decrypted_failed_incognito, m94755g3);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_unable_e2ee_decrypted_failed);
    }

    /* renamed from: k9 */
    public static C17945a0 m94773k9(String str, String str2) {
        MessageId m41036c = MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str2, CoreUtility.f89233i);
        C17945a0 m95365a = new w(m41036c, 6).m95382r(str).m95379o(str).m95368d(new C17964g1("", 0, "", "", "", "", "")).m95386v(1).m95365a();
        m95365a.m94951M9();
        return m95365a;
    }

    /* renamed from: kc */
    private void m94774kc(EnumC19029c enumC19029c, C19028b c19028b) {
        if (this.f90734r0 != null && this.f90746u0 != 0) {
            long mo124319c = C23793c.m124316k().mo124319c() - this.f90746u0;
            if (m95276v6() && c19028b.m100093c()) {
                this.f90734r0.m154895j0(mo124319c);
            } else {
                this.f90734r0.m154897k0(mo124319c);
            }
            if (enumC19029c != EnumC19029c.f94854t) {
                if (m95276v6() && c19028b.m100093c()) {
                    this.f90734r0.m154888g().add(Integer.valueOf(EnumC24193d.f116770v.m126133c()));
                }
                m94670I0(EnumC24193d.f116770v);
            }
        }
    }

    /* renamed from: l1 */
    private boolean m94776l1(C19028b c19028b, String str, String str2, boolean z11) {
        if (AbstractC23041d2.m118194A(str)) {
            m94788o9(str, false, c19028b, AbstractC23306f.m120652d(), str2, z11);
            return true;
        }
        return false;
    }

    /* renamed from: m1 */
    private boolean m94778m1() {
        if (!C24302e.m126898v() && ((m94871D7() || m95120e6() || m95306y8() || m95276v6() || m95316z8() || m94960N7()) && AbstractC31111g.m151135p(this))) {
            return true;
        }
        return false;
    }

    /* renamed from: m9 */
    private void m94779m9(Boolean bool) {
        if (this.f90696f1 != null) {
            this.f90696f1.mo154830b(m95029V3().m41045i());
        }
        if (bool.booleanValue()) {
            ToastUtils.m89266n(AbstractC8020f0.str_msg_already_save_in, new Object[0]);
        }
    }

    /* renamed from: n1 */
    private boolean m94781n1(C19028b c19028b) {
        if (c19028b.m100092b()) {
            C24759a m109886m0 = AbstractC23306f.m120652d().m109886m0();
            long m111034b = C21459a.m111034b(C20128b.m104760g());
            if (m111034b < m109886m0.m128658t()) {
                C21654a.m111577d("Check storage limit: Avail=" + m111034b + ", limit=" + m109886m0.m128658t() + " ---> FAILED");
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: n2 */
    private void m94782n2() {
        C17945a0 m2636s = AbstractC23306f.m120584H0().m2636s(this.f90729q);
        if (m2636s != null && m2636s != this) {
            m2636s.m95101c9(this, false);
        }
    }

    /* renamed from: n5 */
    private String m94783n5(String str) {
        return C20131e.f99303a.m104978w(this.f90737s) + AbstractC32201z4.m155243d(this.f90765z) + AbstractC23041d2.m118220s(str);
    }

    /* renamed from: n7 */
    private boolean m94784n7() {
        if (!m95276v6() && !m95306y8() && !m95031V5() && m95133f7()) {
            return true;
        }
        return false;
    }

    /* renamed from: o1 */
    private EnumC25241h m94786o1() {
        EnumC25242i enumC25242i;
        C25739e m130609z;
        String str;
        String str2;
        this.f90686c0 = false;
        EnumC25241h enumC25241h = EnumC25241h.f121059p;
        try {
            if (m94871D7() && !this.f90706i2) {
                if (this.f90614E == 4) {
                    enumC25242i = EnumC25242i.f121067q;
                } else {
                    enumC25242i = EnumC25242i.f121066p;
                }
                if (this.f90726p0 == null) {
                    this.f90726p0 = C25239f.f121027a.m130558h(this.f90761y, enumC25242i, this.f90737s, m95170j6());
                }
                C25240g c25240g = this.f90726p0;
                if (c25240g != null) {
                    EnumC25241h m130601r = c25240g.m130601r();
                    EnumC25241h enumC25241h2 = EnumC25241h.f121061r;
                    if (m130601r == enumC25241h2) {
                        C25240g m130559k = C25239f.f121027a.m130559k(this.f90761y, enumC25242i, this.f90737s, m95170j6());
                        this.f90726p0 = m130559k;
                        if (m130559k != null && (m130609z = m130559k.m130609z()) != null && TextUtils.equals(this.f90726p0.m130599p(), this.f90737s)) {
                            String m132861h = m130609z.m132861h();
                            String m132859f = m130609z.m132859f();
                            String m132857d = m130609z.m132857d();
                            File m130597n = this.f90726p0.m130597n();
                            if (!m130597n.exists()) {
                                str = "";
                            } else {
                                C26639b.m136739C("[ChatContent] instantLocalCacheFile = " + m130597n.getPath());
                                str = AbstractC20130d.m104874i0() + m130597n.getName();
                                File file = new File(str);
                                long mo124319c = C23793c.m124316k().mo124319c();
                                AbstractC23238v2.m119718c(m130597n, file);
                                C32094r9 c32094r9 = this.f90734r0;
                                if (c32094r9 != null) {
                                    c32094r9.m154903n0(C23793c.m124316k().mo124319c() - mo124319c);
                                }
                            }
                            C23307g c23307g = new C23307g(m130609z.m132858e());
                            if (!TextUtils.isEmpty(m132861h) && AbstractC23041d2.m118194A(str)) {
                                this.f90753w = m132861h;
                                this.f90749v = m132859f;
                                C17969i0 c17969i0 = this.f90618F0;
                                if (c17969i0 != null) {
                                    c17969i0.f91014s = m132861h;
                                    c17969i0.f91013r = m132859f;
                                    if (c17969i0 instanceof C18009w0) {
                                        C18009w0 c18009w0 = (C18009w0) c17969i0;
                                        if (this.f90614E != 4) {
                                            m132857d = "";
                                        }
                                        c18009w0.m95780n0(m132857d, c23307g.f113474a, c23307g.f113475b);
                                    }
                                } else {
                                    String str3 = this.f90749v;
                                    String str4 = this.f90753w;
                                    if (this.f90614E != 4) {
                                        str2 = "";
                                    } else {
                                        str2 = m132857d;
                                    }
                                    this.f90618F0 = new C18009w0("", str3, str4, str2, c23307g.f113474a, c23307g.f113475b);
                                }
                                if (!TextUtils.equals(this.f90761y, str)) {
                                    m94934Ka(str);
                                    C7956b.m41474B().m41569z0(this, m95249s4());
                                }
                                C17969i0 c17969i02 = this.f90618F0;
                                if (c17969i02 instanceof C18009w0) {
                                    C18009w0 c18009w02 = (C18009w0) c17969i02;
                                    c18009w02.f91021z = m130609z.m132854a();
                                    c18009w02.m95758X(AbstractC23008a2.m117937f(c18009w02.mo95598f(), c18009w02.f91021z));
                                    if (m94889F6()) {
                                        c18009w02.m95765e0(m130609z.m132860g());
                                        c18009w02.m95757W(m130609z.m132856c());
                                        c18009w02.m95752R(m130609z.m132855b());
                                    }
                                    c18009w02.m95778m0();
                                }
                                C7956b.m41474B().m41513J0(this, this.f90618F0);
                                return enumC25241h2;
                            }
                            return enumC25241h;
                        }
                        return enumC25241h;
                    }
                    EnumC25241h m130601r2 = this.f90726p0.m130601r();
                    EnumC25241h enumC25241h3 = EnumC25241h.f121060q;
                    if (m130601r2 == enumC25241h3) {
                        this.f90686c0 = true;
                        if (this.f90710k0 == null) {
                            C17950c c17950c = new C25240g.a() { // from class: dj.c
                                public /* synthetic */ C17950c() {
                                }

                                @Override // qd0.C25240g.a
                                /* renamed from: a */
                                public final void mo95407a(long j11) {
                                    C17945a0.this.m94659F8(j11);
                                }
                            };
                            this.f90710k0 = c17950c;
                            this.f90726p0.m130578I(c17950c);
                            C25239f.f121027a.m130565u(this.f90726p0, m94869D4());
                        }
                        this.f90710k0.mo95407a(this.f90726p0.m130592i());
                        return enumC25241h3;
                    }
                    C25239f.f121027a.m130563q(this.f90761y, enumC25242i, this.f90737s, m95170j6());
                    return enumC25241h;
                }
                return enumC25241h;
            }
            return enumC25241h;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            EnumC25241h enumC25241h4 = EnumC25241h.f121059p;
            this.f90686c0 = false;
            return enumC25241h4;
        }
    }

    /* renamed from: o3 */
    private String m94787o3() {
        return AbstractC20130d.m104849P() + AbstractC19646n0.m102974f0(this, true);
    }

    /* renamed from: o9 */
    public void m94788o9(String str, boolean z11, C19028b c19028b, C21216s c21216s, String str2, boolean z12) {
        boolean z13;
        boolean z14;
        boolean m118194A;
        C21270p.a aVar;
        C21270p.a aVar2;
        boolean z15;
        boolean z16;
        boolean z17;
        C19028b.b m100091a;
        String str3;
        String str4;
        if (!c19028b.m100093c() && !c19028b.m100094d()) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean m100097g = c19028b.m100097g();
        if (z13 && !m100097g) {
            z14 = true;
        } else {
            z14 = false;
        }
        try {
            try {
                m118194A = AbstractC23041d2.m118194A(str);
                if (z11) {
                    aVar = C21270p.a.f103626s;
                } else {
                    aVar = C21270p.a.f103625r;
                }
                aVar2 = aVar;
                if (z13 && m118194A && AbstractC19646n0.m102927R0(str) == 6) {
                    C0872f m120562A = AbstractC23306f.m120562A();
                    if ((z12 || m120562A.m2531Z()) && !m120562A.m2524S(this)) {
                        m120562A.m2542j(this);
                    }
                }
                if (m118194A && m95314z6()) {
                    C28071g4.m141535a().m141536b(m95029V3().m41044h() + "", str);
                }
                if (this.f90691d2 != 1 && z13) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                EnumC19029c enumC19029c = EnumC19029c.f94855u;
                m94763i2(enumC19029c);
                m94774kc(enumC19029c, c19028b);
                this.f90752v2 = false;
                m94737a1(true, z12, false, true);
            }
            if (m95276v6()) {
                m95147gc(str, m100097g, z14);
                if (z12) {
                    C17969i0 c17969i0 = this.f90618F0;
                    if (c17969i0 instanceof C17990p0) {
                        ((C17990p0) c17969i0).f91117F = false;
                    }
                }
                if (z12 && !AbstractC21935u.m114550q(this.f90737s)) {
                    C28023b6.m141250h0().m141371p1(new ContactProfile(this.f90737s), m94852B2(), m95029V3().m41044h(), m95259t3(), m95232q3(), m95238r3());
                }
                EnumC19029c enumC19029c2 = EnumC19029c.f94854t;
                m94774kc(enumC19029c2, c19028b);
                m94763i2(enumC19029c2);
                m95106d2(z12, c19028b.m100095e());
                this.f90751v1 = System.currentTimeMillis();
                c21216s.m109879g1(str2, this, aVar2);
                if (z12) {
                    C2526d.f10270a.m12691O(this, this.f90756w2, false, true);
                }
                if (!z11) {
                    c21216s.m109894v1(this, str);
                }
            } else if (m95031V5()) {
                m94763i2(EnumC19029c.f94854t);
                m95256sc(str, z14);
                String str5 = this.f90737s;
                C17969i0 c17969i02 = this.f90618F0;
                m94740ac(str5, str, ((C17955d1) c17969i02).f90891E, ((C17955d1) c17969i02).f90888B, ((C17955d1) c17969i02).f90890D);
                c21216s.m109879g1(str2, this, aVar2);
                if (!z11) {
                    c21216s.m109894v1(this, str);
                }
            } else if (m118194A && AbstractC19646n0.m102927R0(str) == 3) {
                boolean m119956o = AbstractC23258x2.m119956o(new File(str));
                if (!m119956o) {
                    Bitmap m117964o = AbstractC23009a3.m117964o(str, 400);
                    boolean m119365w = AbstractC23170p.m119365w(m117964o);
                    if (m117964o != null && !m117964o.isRecycled()) {
                        m117964o.recycle();
                    }
                    m119956o = m119365w;
                }
                if (m119956o) {
                    if ((!C21927m.m114302u().m114345m(this.f90737s) || TextUtils.isEmpty(AbstractC23309i.m122303q0())) && AbstractC23059e9.m118329h() && !AbstractC23165o5.m119333b() && AbstractC23309i.m120896Eb() != 3) {
                        C28023b6.m141250h0().m141332b0(this.f90737s, m95029V3(), str);
                    }
                    EnumC19029c enumC19029c3 = EnumC19029c.f94854t;
                    m94763i2(enumC19029c3);
                    m94774kc(enumC19029c3, c19028b);
                    m95256sc(str, z14);
                    if (m94847A6()) {
                        if (this.f90691d2 == 1) {
                            str4 = "9001440004";
                        } else {
                            str4 = "9001440003";
                        }
                        AbstractC23647d.m123897g(str4);
                    } else {
                        if (this.f90691d2 == 1) {
                            str3 = "9001440002";
                        } else {
                            str3 = "9001440001";
                        }
                        AbstractC23647d.m123897g(str3);
                    }
                    c21216s.m109879g1(str2, this, aVar2);
                    z16 = false;
                } else {
                    this.f90754w0.getAndIncrement();
                    if (m95006S7()) {
                        z16 = true;
                    } else {
                        EnumC19029c enumC19029c4 = EnumC19029c.f94855u;
                        m94763i2(enumC19029c4);
                        m94774kc(enumC19029c4, c19028b);
                        if (c19028b.m100094d()) {
                            m94793pa();
                        }
                        m95165ic(3, true);
                        z16 = false;
                    }
                    AbstractC23041d2.m118208g(str);
                }
                if (!z11) {
                    c21216s.m109894v1(this, str);
                }
                if (z16 && m100097g) {
                    if (c19028b.m100092b() && !z15) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c19028b.m100092b()) {
                        m94675J5();
                    }
                    if (z17) {
                        this.f90603B0 = EnumC19038l.f94903p;
                        this.f90754w0.set(0);
                    }
                    m94737a1(false, false, false, false);
                    if (z17) {
                        m100091a = C19028b.b.f94843p;
                    } else {
                        m100091a = c19028b.m100091a();
                    }
                    m94980Pb(C19028b.Companion.m100099a(m100091a, c19028b.m100097g(), false), z12);
                    m95140g2(str, z12);
                }
            } else {
                EnumC19029c enumC19029c5 = EnumC19029c.f94854t;
                m94763i2(enumC19029c5);
                m94774kc(enumC19029c5, c19028b);
                m95256sc(str, z14);
                c21216s.m109879g1(str2, this, aVar2);
                if (!z11) {
                    c21216s.m109894v1(this, str);
                }
                if (m95316z8()) {
                    if (c19028b.m100095e()) {
                        C23744a.m124114c().m124116d(89, this.f90737s, this);
                    }
                    m94639B1(str);
                }
            }
            C17966h0 c17966h0 = this.f90689d0;
            if (c17966h0 != null) {
                c17966h0.m95570x(100);
            }
            m94745c2();
            m94737a1(true, z12, false, false);
            C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            m95140g2(str, z12);
        } catch (Throwable th2) {
            m95140g2(str, z12);
            throw th2;
        }
    }

    /* renamed from: oc */
    private void m94789oc(int i11) {
        C24230h c24230h;
        EnumC24193d enumC24193d;
        C32094r9 c32094r9 = this.f90734r0;
        if (c32094r9 != null && (c24230h = this.f90722o0) != null) {
            if (i11 != 18002 && i11 != 19006) {
                enumC24193d = EnumC24193d.f116767s;
            } else {
                enumC24193d = EnumC24193d.f116766r;
            }
            c32094r9.m154913t0(c24230h.m126487E());
            this.f90734r0.m154907p0(this.f90722o0.m126485D());
            this.f90734r0.m154873X(this.f90722o0.m126528v());
            this.f90734r0.m154874Y(this.f90722o0.m126530w());
            this.f90734r0.m154868S(this.f90722o0.m126519q());
            this.f90734r0.m154885e0(this.f90722o0.m126479A());
            this.f90734r0.m154921x0(this.f90722o0.m126492I());
            if (m94871D7()) {
                this.f90734r0.m154864O(!this.f90722o0.m126493L());
                this.f90734r0.m154891h0(this.f90722o0.m126481B());
                this.f90734r0.m154893i0(this.f90722o0.m126483C());
            }
            if (m95306y8()) {
                C17969i0 c17969i0 = this.f90618F0;
                if ((c17969i0 instanceof C17961f1) && !((C17961f1) c17969i0).m95464R()) {
                    this.f90734r0.m154881c0(this.f90722o0.m126525t());
                }
            }
            if (i11 != -13 || !m95306y8()) {
                m94670I0(enumC24193d);
            }
            m94666H0(enumC24193d);
        }
    }

    /* renamed from: p1 */
    private boolean m94791p1(C19028b c19028b, String str, String str2, boolean z11) {
        if (str.isEmpty()) {
            m95138fc(false, true, c19028b.m100092b(), str2, true);
            if (c19028b.m100094d()) {
                m94793pa();
                return true;
            }
            if (z11 && m95276v6() && !AbstractC21935u.m114550q(this.f90737s)) {
                C28023b6.m141250h0().m141369o1(m94852B2(), m95029V3().m41044h(), m95150h4(), m95232q3());
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: p9 */
    public void m94792p9(int i11, C19028b c19028b, String str, boolean z11) {
        boolean z12;
        boolean z13;
        EnumC19029c enumC19029c;
        boolean z14;
        boolean z15;
        boolean z16;
        EnumC19029c m94746c3;
        C19028b.b m100091a;
        boolean m100097g = c19028b.m100097g();
        if (!c19028b.m100094d() && !c19028b.m100093c()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m95302y1(i11) && m94634A1()) {
            z13 = true;
        } else {
            z13 = false;
        }
        try {
            try {
                if (this.f90691d2 != 1 && z12) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z12 && m95316z8()) {
                    AbstractC23306f.m120562A().m2546l(mo95039W2());
                    C23744a.m124114c().m124116d(124, new Object[0]);
                }
                this.f90754w0.getAndIncrement();
                if (m94678Jb(i11, c19028b.m100092b()) && m95006S7() && !c19028b.m100093c()) {
                    z15 = false;
                    z16 = true;
                } else {
                    if (m94689M0(z13)) {
                        AbstractC23306f.m120652d().m109879g1(str, this, null);
                        z15 = true;
                    } else {
                        if (c19028b.m100094d()) {
                            this.f90655R1 = z13;
                        }
                        m95138fc(z13, false, z14, str, true);
                        if (m95276v6()) {
                            if (z11) {
                                if (!m94960N7()) {
                                    m94683Kb(i11, c19028b.m100094d());
                                }
                                if (z13) {
                                    C28023b6.m141250h0().m141301M(m95029V3().m41044h());
                                } else if (!AbstractC21935u.m114550q(this.f90737s)) {
                                    C28023b6.m141250h0().m141369o1(m94852B2(), m95029V3().m41044h(), m95150h4(), m95232q3());
                                }
                                C2526d.f10270a.m12691O(this, this.f90756w2, false, false);
                            } else {
                                C28023b6.m141250h0().m141301M(m95029V3().m41044h());
                                this.f90603B0 = EnumC19038l.f94903p;
                            }
                        } else if (!c19028b.m100092b() && !c19028b.m100093c() && !c19028b.m100096f() && !m94960N7()) {
                            m94683Kb(i11, c19028b.m100094d());
                        }
                        if (z13) {
                            C2549x.f10397a.m12853g("csc", this);
                        }
                        z15 = false;
                    }
                    if (m94644C1(i11, c19028b.m100092b())) {
                        AbstractC23306f.m120652d().m109881i0(this.f90612D1);
                    }
                    z16 = false;
                }
                if ((z16 && m100097g) || (z12 && z15)) {
                    if (z14 && !z15) {
                        m94675J5();
                    }
                    m94737a1(false, false, false, false);
                    if (z16) {
                        if (c19028b.m100092b() && !z14) {
                            m100091a = C19028b.b.f94843p;
                        } else {
                            m100091a = c19028b.m100091a();
                        }
                        m94980Pb(C19028b.Companion.m100099a(m100091a, c19028b.m100097g(), c19028b.m100095e()), z11);
                    } else {
                        m94953Mb(z14);
                    }
                } else {
                    if (z13) {
                        m94746c3 = EnumC19029c.f94857w;
                    } else {
                        m94746c3 = m94746c3(i11);
                    }
                    m94763i2(m94746c3);
                    m94774kc(m94746c3, c19028b);
                    if (c19028b.m100094d()) {
                        m94793pa();
                    }
                    m94745c2();
                    m94737a1(true, z11, false, true);
                    C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                }
            } catch (Exception e11) {
                if (z13) {
                    enumC19029c = EnumC19029c.f94857w;
                } else {
                    enumC19029c = EnumC19029c.f94855u;
                }
                m94763i2(enumC19029c);
                m94774kc(enumC19029c, c19028b);
                if (c19028b.m100094d()) {
                    m94793pa();
                }
                m94737a1(true, z11, false, true);
                AbstractC20110a.m104539h(e11);
            }
            m95116e2(z11);
        } catch (Throwable th2) {
            m95116e2(z11);
            throw th2;
        }
    }

    /* renamed from: pa */
    private void m94793pa() {
        this.f90658S1 = true;
        m94798qb();
        m94666H0(EnumC24193d.f116772x);
    }

    /* renamed from: q1 */
    private boolean m94795q1(C19028b c19028b, boolean z11) {
        if (!c19028b.m100092b() && !C23055e5.m118271f()) {
            if (z11) {
                m95165ic(4, !m95276v6());
                m94920J1();
            }
            return true;
        }
        return false;
    }

    /* renamed from: q5 */
    private int m94796q5(String str) {
        if (AbstractC25495a.m132079d(str)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: q6 */
    private boolean m94797q6(long j11) {
        C32094r9 c32094r9 = this.f90734r0;
        if (c32094r9 != null && c32094r9.m154924z() > 0) {
            long m154853D = this.f90742t0 - this.f90734r0.m154853D();
            long m154924z = this.f90734r0.m154924z() + m154853D;
            if (j11 >= m154853D && j11 <= m154924z) {
                return true;
            }
        }
        if (j11 >= this.f90742t0) {
            return true;
        }
        return false;
    }

    /* renamed from: qb */
    private void m94798qb() {
        m95193lc(0);
    }

    /* renamed from: qc */
    private void m94799qc() {
        C17969i0 c17969i0 = this.f90618F0;
        C17244x0 c17244x0 = ((C17967h1) c17969i0).f90998X;
        if (((C17967h1) c17969i0).f90999Y == 1) {
            m94752ea();
            return;
        }
        if (!m95151h6()) {
            try {
                this.f90637L1 = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("receiver", AbstractC25495a.m132089n(mo95039W2()));
                jSONObject.put("chatType", m94796q5(mo95039W2()));
                AbstractC17148f0.m91686e(c17244x0, jSONObject, new b());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: r1 */
    private boolean m94802r1() {
        if (m95031V5()) {
            if (this.f90765z < AbstractC23306f.m120562A().m2565w(this.f90737s)) {
                m94813tc(false);
                return true;
            }
            if (((C17955d1) this.f90618F0).f90888B.equals("0")) {
                m94813tc(true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: r2 */
    private void m94803r2() {
        C17964g1 c17964g1 = (C17964g1) this.f90618F0;
        if (!m95032V6() && c17964g1.m95532i()) {
            if (!AbstractC23238v2.m119726k()) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                return;
            }
            if (C23055e5.m118272g(true)) {
                this.f90604B1 = true;
                this.f90649P1 = true;
                m95165ic(4, true);
                m95023U9();
                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                return;
            }
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.str_roll_file_error, new Object[0]);
    }

    /* renamed from: r5 */
    private void m94804r5() {
        AbstractC20110a.m104543l("[Message]").mo104556o(8, "handleThumbUploadError %s", m95029V3().m41044h());
        int i11 = this.f90692e0;
        if (i11 != 0) {
            if (i11 != -17 && i11 != -18 && i11 != -19 && i11 != -20 && i11 != -69) {
                if (i11 != 19001 && i11 != 19002 && i11 != 18004 && i11 != 19004 && i11 != 18002) {
                    m94798qb();
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_toast_error_invalidImage, new Object[0]);
                    m94798qb();
                }
            } else {
                m94798qb();
            }
        } else {
            m94798qb();
        }
        this.f90695f0 = false;
        m94670I0(EnumC24193d.f116768t);
        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
    }

    /* renamed from: rb */
    private void m94805rb() {
        m94798qb();
        m95096c1();
        if (m95306y8()) {
            m94670I0(EnumC24193d.f116766r);
        }
        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
    }

    /* renamed from: s5 */
    public void m94808s5(C20096c c20096c) {
        C24230h c24230h;
        try {
            int i11 = 0;
            C24559a.m127933c("[Message]", String.format("upload thumb failed: %d", Long.valueOf(m95029V3().m41045i())));
            this.f90749v = "";
            this.f90683b0 = false;
            if (c20096c != null) {
                i11 = c20096c.m104491c();
            }
            this.f90692e0 = i11;
            this.f90695f0 = true;
            if (m94696O7() && !TextUtils.isEmpty(m94983Q3())) {
                m94934Ka("");
                C7956b.m41474B().m41569z0(this, m95249s4());
            }
            C32094r9 c32094r9 = this.f90734r0;
            if (c32094r9 != null && (c24230h = this.f90719n0) != null) {
                c32094r9.m154908q0(c24230h.m126485D());
                this.f90734r0.m154915u0(this.f90719n0.m126487E());
                this.f90734r0.m154874Y(this.f90719n0.m126528v());
                this.f90734r0.m154869T(this.f90719n0.m126519q());
                this.f90734r0.m154872W(EnumC24193d.f116768t);
            }
            m95105d1();
        } catch (Exception e11) {
            AbstractC20110a.m104536e(e11);
        }
    }

    /* renamed from: t5 */
    public void m94811t5(AbstractC25751q abstractC25751q) {
        C24230h c24230h;
        try {
            C24559a.m127933c("[Message]", String.format("upload thumb success: %d", Long.valueOf(m95029V3().m41045i())));
            if (abstractC25751q instanceof C25739e) {
                C25739e c25739e = (C25739e) abstractC25751q;
                this.f90692e0 = 0;
                this.f90749v = c25739e.m132861h();
                if (m95306y8()) {
                    C17969i0 c17969i0 = this.f90618F0;
                    if (c17969i0 != null) {
                        c17969i0.f91013r = this.f90749v;
                    } else {
                        this.f90618F0 = new C17961f1("", 0, this.f90749v, "", "", "", null, null);
                    }
                    if (m94889F6()) {
                        C17969i0 c17969i02 = this.f90618F0;
                        if (c17969i02 instanceof C17961f1) {
                            ((C17961f1) c17969i02).m95513y0(c25739e.m132860g());
                            ((C17961f1) this.f90618F0).m95449D0();
                        }
                    }
                    C7956b.m41474B().m41513J0(this, this.f90618F0);
                } else if (m95276v6()) {
                    C23307g c23307g = new C23307g(c25739e.m132858e());
                    C17969i0 c17969i03 = this.f90618F0;
                    if (c17969i03 != null) {
                        c17969i03.f91013r = this.f90749v;
                    } else {
                        this.f90618F0 = new C17990p0("", 0, this.f90749v, "", "", "", "");
                    }
                    C17969i0 c17969i04 = this.f90618F0;
                    if (c17969i04 instanceof C17990p0) {
                        C17990p0 c17990p0 = (C17990p0) c17969i04;
                        c17990p0.f91120I = c23307g.f113474a;
                        c17990p0.f91121J = c23307g.f113475b;
                        c17990p0.f91126O = c25739e.m132860g();
                        c17990p0.m95671m();
                    }
                    C7956b.m41474B().m41513J0(this, this.f90618F0);
                } else if (m94960N7()) {
                    C17969i0 c17969i05 = this.f90618F0;
                    if (c17969i05 instanceof C18013y0) {
                        c17969i05.f91013r = this.f90749v;
                        C7956b.m41474B().m41515K0(this, this.f90618F0);
                        m94934Ka(this.f90719n0.m126532x());
                        C7956b.m41474B().m41569z0(this, m95249s4());
                    }
                }
                if ("null".equals(this.f90749v) || "-2".equals(this.f90749v)) {
                    m94808s5(new C20096c(502, AbstractC20095b.f98832d));
                    AbstractC20110a.m104543l("Upload").mo104552e(new Exception("Upload_thumb_null: " + this.f90749v));
                }
                C32094r9 c32094r9 = this.f90734r0;
                if (c32094r9 != null && (c24230h = this.f90719n0) != null) {
                    c32094r9.m154908q0(c24230h.m126485D());
                    this.f90734r0.m154915u0(this.f90719n0.m126487E());
                    this.f90734r0.m154874Y(this.f90719n0.m126528v());
                    this.f90734r0.m154869T(this.f90719n0.m126519q());
                }
                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            C32094r9 c32094r92 = this.f90734r0;
            if (c32094r92 != null) {
                c32094r92.m154872W(EnumC24193d.f116768t);
            }
        }
        this.f90683b0 = false;
    }

    /* renamed from: t8 */
    public boolean m94812t8() {
        if (AbstractC23306f.m120579F1().mo124314i() - this.f90765z < AbstractC0924m0.m3980l4()) {
            return true;
        }
        return false;
    }

    /* renamed from: tc */
    private void m94813tc(boolean z11) {
        C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.r

            /* renamed from: q */
            public final /* synthetic */ boolean f91145q;

            /* renamed from: r */
            public final /* synthetic */ String f91146r;

            public /* synthetic */ RunnableC17995r(boolean z112, String str) {
                r2 = z112;
                r3 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17945a0.this.m94734Z8(r2, r3);
            }
        }));
    }

    /* renamed from: u1 */
    private AbstractC23214t.a m94816u1(AbstractC23214t.a aVar, int i11, TextPaint textPaint) {
        if (aVar != null && aVar.f112484c.getPaint() == textPaint) {
            if (aVar.f112486e == i11 || (aVar.f112485d < i11 && aVar.f112484c.getLineCount() == 1)) {
                return aVar;
            }
            return null;
        }
        return null;
    }

    /* renamed from: u5 */
    private void m94817u5(AbstractC25751q abstractC25751q) {
        if (abstractC25751q instanceof C25739e) {
            C25739e c25739e = (C25739e) abstractC25751q;
            this.f90753w = c25739e.m132861h();
            String m132859f = c25739e.m132859f();
            this.f90749v = m132859f;
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                c17969i0.f91014s = this.f90753w;
                c17969i0.f91013r = m132859f;
            } else {
                C23307g c23307g = new C23307g(c25739e.m132858e());
                this.f90618F0 = new C17981m0("", this.f90749v, this.f90753w, c23307g.f113474a, c23307g.f113475b);
            }
            if (m94889F6()) {
                C17969i0 c17969i02 = this.f90618F0;
                if (c17969i02 instanceof C17981m0) {
                    ((C17981m0) c17969i02).f91076D = c25739e.m132855b();
                    ((C17981m0) this.f90618F0).m95628i();
                }
            }
            C7956b.m41474B().m41515K0(this, this.f90618F0);
        }
    }

    /* renamed from: u6 */
    private boolean m94818u6() {
        EnumC24229g m95072Z4;
        long m95159i5;
        if ((!m95276v6() && !m95306y8()) || (m95072Z4 = m95072Z4()) == null) {
            return false;
        }
        if (m95276v6()) {
            m95159i5 = m95238r3();
        } else {
            m95159i5 = m95159i5();
        }
        if (m95159i5 <= C26639b.m136746e(m95072Z4)) {
            return false;
        }
        return true;
    }

    /* renamed from: u9 */
    public void m94819u9(int i11) {
        C17966h0 c17966h0 = this.f90689d0;
        if (c17966h0 != null) {
            c17966h0.m95567t(i11);
        }
    }

    /* renamed from: ua */
    private void m94820ua(InterfaceC19030d interfaceC19030d) {
        if (interfaceC19030d != null) {
            this.f90703h2 = new WeakReference(interfaceC19030d);
        } else {
            this.f90703h2 = null;
        }
    }

    /* renamed from: v1 */
    private EnumC19029c m94823v1(C19028b c19028b, String str, String str2, String str3, boolean z11) {
        boolean z12;
        if (this.f90703h2 == null && !c19028b.m100094d()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m94802r1()) {
            return EnumC19029c.f94852r;
        }
        if (m94776l1(c19028b, str, str3, z11)) {
            return EnumC19029c.f94851q;
        }
        if (m94778m1()) {
            return EnumC19029c.f94857w;
        }
        if (m94791p1(c19028b, str2, str3, z11)) {
            return EnumC19029c.f94855u;
        }
        if (m94771k1(c19028b, z12)) {
            return EnumC19029c.f94856v;
        }
        if (m94781n1(c19028b)) {
            return EnumC19029c.f94859y;
        }
        if (m94795q1(c19028b, z12)) {
            return EnumC19029c.f94858x;
        }
        return EnumC19029c.f94853s;
    }

    /* renamed from: v5 */
    public void m94824v5(C20096c c20096c) {
        String str;
        int i11;
        try {
            C24559a.m127933c("[Message]", String.format("upload failed: %d", Long.valueOf(m95029V3().m41045i())));
            this.f90753w = "";
            if (!m95306y8() && !m95276v6()) {
                this.f90749v = "";
            }
            this.f90680a0 = false;
            if (c20096c == null) {
                str = "";
                i11 = 0;
            } else {
                i11 = c20096c.m104491c();
                str = c20096c.m104492d();
            }
            if (i11 != -17 && i11 != -18 && i11 != -19 && i11 != -20 && i11 != -69) {
                if (i11 != 19001 && i11 != 19002 && i11 != 18002) {
                    if (i11 != 18004 && i11 != 19004) {
                        if (i11 == 19006 && m95306y8()) {
                            m94798qb();
                        } else if (i11 == 601) {
                            ToastUtils.showMess(str);
                            m94798qb();
                        } else if (i11 == -13 && m95306y8()) {
                            this.f90701h0 = true;
                        } else {
                            m94798qb();
                        }
                        m95096c1();
                        m94789oc(i11);
                        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                    }
                    ToastUtils.m89266n(AbstractC8020f0.str_toast_error_invalidImage, new Object[0]);
                    m94798qb();
                    m95096c1();
                    m94789oc(i11);
                    C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                }
                if (m95306y8()) {
                    ToastUtils.m89266n(AbstractC8020f0.str_toast_warningUploadVideo, Integer.valueOf(AbstractC26689j.m137115x(0)));
                } else if (m95276v6()) {
                    ToastUtils.m89266n(AbstractC8020f0.str_toast_upload_file_too_big, Integer.valueOf(AbstractC23309i.m121231Nd()));
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_toast_warningUploadImg, new Object[0]);
                }
                m94798qb();
                m95096c1();
                m94789oc(i11);
                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            }
            m94798qb();
            m95096c1();
            m94789oc(i11);
            C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: vc */
    private void m94825vc(boolean z11, int i11) {
        int i12;
        if (this.f90625H1) {
            return;
        }
        this.f90625H1 = true;
        this.f90628I1 = i11;
        if (this.f90622G1 == null) {
            this.f90622G1 = new C31897e4();
        }
        if (!z11) {
            i12 = -2;
        } else {
            C31867c4.a aVar = C31867c4.Companion;
            if (aVar.m153167c(i11)) {
                i12 = -4;
            } else if (aVar.m153168d(i11) && m94847A6()) {
                i12 = -6;
            } else if (aVar.m153166b(i11)) {
                i12 = -1;
            } else {
                i12 = -5;
            }
        }
        this.f90622G1.m153282x(i12);
        if (!m94847A6() && !m95198m6() && !m94933K7() && z11 && C31867c4.Companion.m153165a(i11)) {
            this.f90614E = 51;
            this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_waiting_e2ee_decrypted_failed);
        } else {
            m95291wc();
        }
        this.f90618F0 = null;
    }

    /* renamed from: w5 */
    private void m94828w5(AbstractC25751q abstractC25751q) {
        C24230h c24230h;
        if (abstractC25751q instanceof C25745k) {
            C25745k c25745k = (C25745k) abstractC25751q;
            String m132872b = c25745k.m132872b();
            this.f90753w = m132872b;
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                c17969i0.f91014s = m132872b;
            } else {
                this.f90618F0 = new C17990p0("", 0, this.f90749v, this.f90753w, "", "", "");
            }
            if (m94889F6()) {
                C17969i0 c17969i02 = this.f90618F0;
                if (c17969i02 instanceof C17990p0) {
                    ((C17990p0) c17969i02).f91113B = c25745k.m132871a();
                    ((C17990p0) this.f90618F0).m95671m();
                }
            }
            C32094r9 c32094r9 = this.f90734r0;
            if (c32094r9 != null && (c24230h = this.f90722o0) != null) {
                c32094r9.m154913t0(c24230h.m126487E());
                this.f90734r0.m154907p0(this.f90722o0.m126485D());
                this.f90734r0.m154868S(this.f90722o0.m126519q());
                this.f90734r0.m154885e0(this.f90722o0.m126479A());
                this.f90734r0.m154921x0(this.f90722o0.m126492I());
            }
            C7956b.m41474B().m41515K0(this, this.f90618F0);
        }
    }

    /* renamed from: w9 */
    private void m94829w9(JSONObject jSONObject, AbstractC18007v0 abstractC18007v0) {
        C32005l7 c32005l7;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            abstractC18007v0.f91202D.clear();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                try {
                    c32005l7 = new C32005l7(optJSONArray.getJSONObject(i11));
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    c32005l7 = null;
                }
                abstractC18007v0.f91202D.add(c32005l7);
            }
        }
        if (jSONObject.optJSONArray("highLightsV2") != null) {
            abstractC18007v0.f91200B = AbstractC19646n0.m102925Q1(jSONObject);
            abstractC18007v0.f91201C = new C7907e();
        }
        String m102928R1 = AbstractC19646n0.m102928R1(jSONObject, abstractC18007v0.f91200B, abstractC18007v0.f91201C, -1);
        if (!TextUtils.isEmpty(m102928R1)) {
            this.f90745u = m102928R1;
        }
        if (jSONObject.has("iconUrl")) {
            abstractC18007v0.f91205G = jSONObject.optString("iconUrl");
        }
    }

    /* renamed from: x5 */
    private void m94832x5(AbstractC25751q abstractC25751q) {
        C24230h c24230h;
        if (abstractC25751q instanceof C25739e) {
            C25739e c25739e = (C25739e) abstractC25751q;
            this.f90753w = c25739e.m132861h();
            this.f90749v = c25739e.m132859f();
            String m132857d = c25739e.m132857d();
            C23307g c23307g = new C23307g(c25739e.m132858e());
            String m126532x = this.f90722o0.m126532x();
            if (!TextUtils.isEmpty(m126532x) && !TextUtils.equals(m126532x, this.f90761y)) {
                C26639b.m136739C("[ChatContent] uploadItemOutputPath = " + m126532x);
                m94934Ka(m126532x);
                C7956b.m41474B().m41569z0(this, m95249s4());
            }
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                c17969i0.f91014s = this.f90753w;
                c17969i0.f91013r = this.f90749v;
                if (c17969i0 instanceof C18009w0) {
                    ((C18009w0) c17969i0).m95780n0(m132857d, c23307g.f113474a, c23307g.f113475b);
                }
            } else {
                this.f90618F0 = new C18009w0("", this.f90753w, this.f90749v, m132857d, c23307g.f113474a, c23307g.f113475b);
            }
            C32094r9 c32094r9 = this.f90734r0;
            if (c32094r9 != null && (c24230h = this.f90722o0) != null) {
                c32094r9.m154913t0(c24230h.m126487E());
                this.f90734r0.m154907p0(this.f90722o0.m126485D());
                this.f90734r0.m154873X(this.f90722o0.m126528v());
                this.f90734r0.m154874Y(this.f90722o0.m126530w());
                this.f90734r0.m154891h0(this.f90722o0.m126481B());
                this.f90734r0.m154893i0(this.f90722o0.m126483C());
                this.f90734r0.m154881c0(this.f90722o0.m126525t());
                this.f90734r0.m154868S(this.f90722o0.m126519q());
                this.f90734r0.m154885e0(this.f90722o0.m126479A());
                this.f90734r0.m154864O(!this.f90722o0.m126493L());
                this.f90734r0.m154921x0(this.f90722o0.m126492I());
            }
            C17969i0 c17969i02 = this.f90618F0;
            if (c17969i02 instanceof C18009w0) {
                C18009w0 c18009w0 = (C18009w0) c17969i02;
                c17969i02.f91021z = c25739e.m132854a();
                if (m94889F6()) {
                    c18009w0.m95752R(c25739e.m132855b());
                    c18009w0.m95757W(c25739e.m132856c());
                    c18009w0.m95765e0(c25739e.m132860g());
                }
                c18009w0.m95778m0();
            }
            C7956b.m41474B().m41513J0(this, this.f90618F0);
        }
    }

    /* renamed from: x9 */
    private int m94833x9(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("extra_data")) {
            return -1;
        }
        JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "extra_data");
        if (!m96091j.has("layoutType")) {
            return -1;
        }
        try {
            return m96091j.getInt("layoutType");
        } catch (JSONException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* renamed from: y2 */
    private String m94836y2(String str) {
        return m95029V3() + "_" + str;
    }

    /* renamed from: y3 */
    private String m94837y3(String str) {
        return AbstractC20130d.m104874i0() + AbstractC23352g.m122788d(str + m95028V2());
    }

    /* renamed from: y5 */
    public void m94838y5(AbstractC25751q abstractC25751q) {
        try {
            C24559a.m127933c("[Message]", String.format("upload success: %d", Long.valueOf(m95029V3().m41045i())));
            int i11 = this.f90614E;
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    if (i11 != 6) {
                        if (i11 != 19) {
                            if (i11 != 22) {
                                if (i11 != 29) {
                                    if (i11 != 31) {
                                    }
                                } else {
                                    m94842z5(abstractC25751q);
                                }
                            } else {
                                m94828w5(abstractC25751q);
                            }
                        } else {
                            m94635A5(abstractC25751q);
                        }
                    } else {
                        m94855B5(abstractC25751q);
                    }
                }
                m94832x5(abstractC25751q);
            } else {
                m94817u5(abstractC25751q);
            }
            if (TextUtils.isEmpty(this.f90753w) || "null".equals(this.f90753w) || "-2".equals(this.f90753w)) {
                m94824v5(new C20096c(502, AbstractC20095b.f98832d));
                AbstractC20110a.m104543l("Upload").mo104552e(new Exception("Upload_url_null: " + this.f90753w));
            }
            C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        this.f90680a0 = false;
    }

    /* renamed from: y9 */
    private void m94839y9(String str) {
        C32204z7.m155260j().m155276w(str, new i(), false, 2);
    }

    /* renamed from: z5 */
    private void m94842z5(AbstractC25751q abstractC25751q) {
        if (abstractC25751q instanceof C25739e) {
            C25739e c25739e = (C25739e) abstractC25751q;
            this.f90753w = c25739e.m132861h();
            this.f90749v = c25739e.m132859f();
            C17969i0 c17969i0 = this.f90618F0;
            ((C17955d1) c17969i0).f90891E = this.f90753w;
            c17969i0.f91017v = ((C17955d1) c17969i0).m95415h();
            C7956b.m41474B().m41515K0(this, this.f90618F0);
            String m126532x = this.f90722o0.m126532x();
            if (!TextUtils.isEmpty(m126532x) && !TextUtils.equals(m126532x, this.f90761y) && C32034n6.m154497s().m154506t(m126532x)) {
                AbstractC23041d2.m118208g(m126532x);
            }
        }
    }

    /* renamed from: z9 */
    public void m94843z9(String str, boolean z11) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m94641B9(str, z11);
            ((C17961f1) this.f90618F0).m95449D0();
            C7956b.m41474B().m41513J0(this, this.f90618F0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:2:0x0000, B:6:0x0007, B:9:0x000c, B:11:0x0017, B:13:0x001d, B:16:0x0025, B:18:0x0033, B:22:0x0041, B:24:0x0055, B:26:0x0063, B:27:0x008e, B:29:0x006a, B:31:0x007e, B:32:0x0086, B:34:0x009f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:2:0x0000, B:6:0x0007, B:9:0x000c, B:11:0x0017, B:13:0x001d, B:16:0x0025, B:18:0x0033, B:22:0x0041, B:24:0x0055, B:26:0x0063, B:27:0x008e, B:29:0x006a, B:31:0x007e, B:32:0x0086, B:34:0x009f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:2:0x0000, B:6:0x0007, B:9:0x000c, B:11:0x0017, B:13:0x001d, B:16:0x0025, B:18:0x0033, B:22:0x0041, B:24:0x0055, B:26:0x0063, B:27:0x008e, B:29:0x006a, B:31:0x007e, B:32:0x0086, B:34:0x009f), top: B:1:0x0000 }] */
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m94844A2(String str) {
        int i11;
        Bitmap m154221b;
        C32094r9 c32094r9;
        try {
            C17990p0 c17990p0 = (C17990p0) this.f90618F0;
            if (c17990p0 == null || this.f90709j2) {
                return;
            }
            this.f90709j2 = true;
            if (!TextUtils.isEmpty(this.f90761y) && !TextUtils.isEmpty(str) && !AbstractC23041d2.m118194A(str)) {
                int m62210V2 = AbstractC11531v0.m62210V2(null);
                if (!AbstractC31990k7.m154226g(c17990p0.f91115D) && !AbstractC31990k7.m154228i(c17990p0.f91115D)) {
                    i11 = m62210V2;
                    long mo124319c = C23793c.m124316k().mo124319c();
                    m154221b = AbstractC31990k7.m154221b(this.f90761y, c17990p0.f91115D, m62210V2, i11, str);
                    c32094r9 = this.f90734r0;
                    if (c32094r9 != null) {
                        c32094r9.m154901m0(C23793c.m124316k().mo124319c() - mo124319c);
                    }
                    if (m154221b != null) {
                        c17990p0.f91116E = "";
                        this.f90698g0 = true;
                    } else {
                        c17990p0.f91120I = m154221b.getWidth();
                        c17990p0.f91121J = m154221b.getHeight();
                        if (AbstractC31990k7.m154228i(c17990p0.f91115D)) {
                            c17990p0.f91122K = AbstractC3460h.m17442j(this.f90761y);
                        }
                        c17990p0.m95671m();
                        c17990p0.f91116E = str;
                        m154221b.recycle();
                    }
                    C23744a.m124114c().m124116d(5, this.f90737s);
                    this.f90709j2 = false;
                    return;
                }
                i11 = 0;
                long mo124319c2 = C23793c.m124316k().mo124319c();
                m154221b = AbstractC31990k7.m154221b(this.f90761y, c17990p0.f91115D, m62210V2, i11, str);
                c32094r9 = this.f90734r0;
                if (c32094r9 != null) {
                }
                if (m154221b != null) {
                }
                C23744a.m124114c().m124116d(5, this.f90737s);
                this.f90709j2 = false;
                return;
            }
            this.f90698g0 = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A3 */
    public List m94845A3() {
        return this.f90684b1;
    }

    /* renamed from: A4 */
    public String m94846A4() {
        return this.f90634K1;
    }

    /* renamed from: A6 */
    public boolean m94847A6() {
        String str = this.f90737s;
        if (str != null && AbstractC25495a.m132079d(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: A7 */
    public boolean m94848A7() {
        String str;
        if (m94977P7()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                str = c17969i0.f91016u;
            } else {
                str = "";
            }
            return TextUtils.equals("recommened.calltime", str);
        }
        return false;
    }

    /* renamed from: A8 */
    public boolean m94849A8() {
        EnumC24253d enumC24253d = this.f90673X1;
        if (enumC24253d != EnumC24253d.f117154q && enumC24253d != EnumC24253d.f117155r && enumC24253d != EnumC24253d.f117156s) {
            return false;
        }
        return true;
    }

    /* renamed from: Aa */
    public void m94850Aa(List list) {
        this.f90684b1 = list;
    }

    /* renamed from: Ab */
    public void m94851Ab(int i11) {
        this.f90614E = i11;
    }

    /* renamed from: B2 */
    public int m94852B2() {
        if (this.f90760x2 == 0) {
            this.f90760x2 = AbstractC23121k5.m118603a(m95029V3().m41045i());
        }
        return this.f90760x2;
    }

    /* renamed from: B3 */
    public String m94853B3() {
        if (m94847A6()) {
            return AbstractC25495a.m132088m(this.f90737s);
        }
        return "";
    }

    /* renamed from: B4 */
    public String m94854B4() {
        return this.f90610D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:            if (r0 != false) goto L40;     */
    /* renamed from: B5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m94855B5(AbstractC25751q abstractC25751q) {
        boolean z11;
        if (abstractC25751q instanceof C25741g) {
            C25741g c25741g = (C25741g) abstractC25751q;
            this.f90753w = c25741g.m132867d();
            this.f90749v = c25741g.m132866c();
            String m132865b = c25741g.m132865b();
            long m132864a = c25741g.m132864a();
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                c17969i0.f91014s = this.f90753w;
                c17969i0.f91013r = this.f90749v;
            } else {
                this.f90618F0 = new C17964g1("", 0, this.f90749v, this.f90753w, "", "", "");
            }
            C17969i0 c17969i02 = this.f90618F0;
            if (c17969i02 instanceof C17964g1) {
                C17964g1 c17964g1 = (C17964g1) c17969i02;
                if (!TextUtils.isEmpty(m132865b)) {
                    c17964g1.m95521B(m132865b);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (m94889F6()) {
                    c17964g1.m95545x(m132864a);
                }
                c17964g1.m95529J();
            }
            C7956b.m41474B().m41515K0(this, this.f90618F0);
        }
    }

    /* renamed from: B6 */
    public boolean m94856B6() {
        String str;
        if (m94977P7()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                str = c17969i0.f91016u;
            } else {
                str = "";
            }
            return TextUtils.equals("recommened.groupcall", str);
        }
        return false;
    }

    /* renamed from: B8 */
    public boolean m94857B8() {
        C32098s c32098s;
        if (!m94977P7() || m94929K2() == null) {
            return false;
        }
        if (m94929K2() instanceof C18013y0) {
            c32098s = ((C18013y0) m94929K2()).f91251B;
        } else {
            c32098s = null;
        }
        if (c32098s == null || !c32098s.m154942l()) {
            return false;
        }
        return true;
    }

    /* renamed from: Ba */
    public void m94858Ba(C32090r5.c cVar) {
        this.f90696f1 = cVar;
    }

    /* renamed from: Bb */
    public void m94859Bb(x xVar) {
        Iterator it = this.f90715l2.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == xVar) {
                return;
            }
        }
        this.f90715l2.add(new WeakReference(xVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0211 A[Catch: Exception -> 0x0231, TryCatch #7 {Exception -> 0x0231, blocks: (B:81:0x01f6, B:83:0x0211, B:85:0x0217, B:87:0x0221, B:88:0x0233, B:92:0x0249, B:94:0x024f), top: B:80:0x01f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /* renamed from: C2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m94860C2(boolean z11) {
        Throwable th2;
        boolean z12;
        Exception e11;
        if (this.f90709j2) {
            return;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (!(c17969i0 instanceof C17961f1)) {
            return;
        }
        String str = "";
        C17961f1 c17961f1 = (C17961f1) c17969i0;
        try {
            this.f90709j2 = true;
            str = m94947M4();
            if (TextUtils.isEmpty(str)) {
                str = AbstractC27985d.m140996m(AbstractC23352g.m122788d(m95029V3().m41044h()));
                if (AbstractC23041d2.m118194A(str)) {
                    try {
                        AbstractC20110a.m104543l("[Message]").mo104556o(8, "generateVideoThumb %s, success = %s", m95029V3().m41044h(), Boolean.TRUE);
                        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, m94947M4())) {
                            c17961f1.m95511x0(str);
                            c17961f1.m95449D0();
                            C7956b.m41474B().m41513J0(this, this.f90618F0);
                        }
                        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                    this.f90709j2 = false;
                    return;
                }
            }
            String m94983Q3 = m94983Q3();
            if (TextUtils.isEmpty(m94983Q3) && m95288w8()) {
                m94983Q3 = c17961f1.m95485k();
            }
            if (!TextUtils.isEmpty(m94983Q3) && !c17961f1.m95463Q()) {
                z12 = m94650D2(str, m94983Q3);
            } else {
                z12 = false;
            }
            if (!z12) {
                try {
                    try {
                        if (!TextUtils.isEmpty(c17961f1.m95483j())) {
                            m94983Q3 = c17961f1.m95483j();
                            z12 = m94650D2(str, m94983Q3);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            AbstractC20110a.m104543l("[Message]").mo104556o(8, "generateVideoThumb %s, success = %s", m95029V3().m41044h(), Boolean.valueOf(z12));
                            if (!z12) {
                                if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, m94947M4())) {
                                    c17961f1.m95511x0(str);
                                    c17961f1.m95449D0();
                                    C7956b.m41474B().m41513J0(this, this.f90618F0);
                                }
                                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                            } else if (z11 && !AbstractC23238v2.m119726k()) {
                                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                            }
                        } catch (Exception e13) {
                            AbstractC20110a.m104539h(e13);
                        }
                        this.f90709j2 = false;
                        throw th2;
                    }
                } catch (Exception e14) {
                    e = e14;
                    AbstractC20110a.m104539h(e);
                    try {
                        AbstractC20110a.m104543l("[Message]").mo104556o(8, "generateVideoThumb %s, success = %s", m95029V3().m41044h(), Boolean.valueOf(z12));
                        if (z12) {
                            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, m94947M4())) {
                                c17961f1.m95511x0(str);
                                c17961f1.m95449D0();
                                C7956b.m41474B().m41513J0(this, this.f90618F0);
                            }
                            C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                        } else if (z11 && !AbstractC23238v2.m119726k()) {
                            ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                        }
                    } catch (Exception e15) {
                        e11 = e15;
                        AbstractC20110a.m104539h(e11);
                        this.f90709j2 = false;
                    }
                    this.f90709j2 = false;
                }
            }
            if (!z12 && !TextUtils.isEmpty(c17961f1.m95500s())) {
                String m95500s = c17961f1.m95500s();
                File m123576h = AbstractC23529b.m123576h(MainApplication.getAppContext(), m95500s);
                if (!C23999j.m125690I2(m95500s) && m123576h != null && m123576h.exists() && m123576h.length() > 0) {
                    AbstractC23238v2.m119717b(m123576h, new File(str));
                    z12 = true;
                }
            }
            if (!z12 && c17961f1.m95504u() != null && c17961f1.m95504u().f48276p == 2) {
                z12 = m94650D2(str, m94983Q3);
            }
        } catch (Exception e16) {
            e = e16;
            z12 = false;
        } catch (Throwable th4) {
            th2 = th4;
            z12 = false;
            AbstractC20110a.m104543l("[Message]").mo104556o(8, "generateVideoThumb %s, success = %s", m95029V3().m41044h(), Boolean.valueOf(z12));
            if (!z12) {
            }
            this.f90709j2 = false;
            throw th2;
        }
        try {
            AbstractC20110a.m104543l("[Message]").mo104556o(8, "generateVideoThumb %s, success = %s", m95029V3().m41044h(), Boolean.valueOf(z12));
            if (z12) {
                if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, m94947M4())) {
                    c17961f1.m95511x0(str);
                    c17961f1.m95449D0();
                    C7956b.m41474B().m41513J0(this, this.f90618F0);
                }
                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            } else if (z11 && !AbstractC23238v2.m119726k()) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            }
        } catch (Exception e17) {
            e11 = e17;
            AbstractC20110a.m104539h(e11);
            this.f90709j2 = false;
        }
        this.f90709j2 = false;
    }

    /* renamed from: C3 */
    public ArrayList m94861C3() {
        return this.f90687c1;
    }

    /* renamed from: C4 */
    public String m94862C4() {
        return this.f90733r;
    }

    /* renamed from: C5 */
    boolean m94863C5() {
        C17979l1 c17979l1 = this.f90669W0;
        if (c17979l1 == null) {
            return false;
        }
        if (c17979l1.f91058a > 0) {
            return true;
        }
        if (c17979l1.m95620b() == 4 && this.f90669W0.f91066i != null) {
            return true;
        }
        if (this.f90669W0.m95620b() == 0 || this.f90669W0.m95620b() == 4) {
            return false;
        }
        return true;
    }

    /* renamed from: C6 */
    public boolean m94864C6() {
        if (!m94871D7()) {
            return false;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (!(c17969i0 instanceof C18009w0) || TextUtils.isEmpty(c17969i0.mo95598f())) {
            return false;
        }
        return true;
    }

    /* renamed from: C8 */
    public boolean m94865C8() {
        if (m94872D8()) {
            C17969i0 c17969i0 = this.f90618F0;
            if ((c17969i0 instanceof C17967h1) && ((C17967h1) c17969i0).f91002b0 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ca */
    public void m94866Ca(ArrayList arrayList) {
        this.f90687c1 = arrayList;
    }

    /* renamed from: Cb */
    public void m94867Cb(C32094r9 c32094r9) {
        this.f90734r0 = c32094r9;
    }

    /* renamed from: D3 */
    public String m94868D3() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C18009w0) {
                return c17969i0.mo95598f();
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return this.f90753w;
        }
    }

    /* renamed from: D4 */
    public long m94869D4() {
        C3535c m2634q;
        try {
            if (m95032V6() && C32163w8.m155135a().f148288a && (m2634q = AbstractC23306f.m120584H0().m2634q(this.f90737s)) != null) {
                List m17941F0 = m2634q.m17941F0();
                int size = m17941F0.size() - 1;
                boolean z11 = false;
                long j11 = 0;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((C17945a0) m17941F0.get(size)).equals(this)) {
                        if (z11) {
                            m95192lb(Math.min(C32163w8.m155135a().f148290c, Math.max(0L, j11 - this.f90765z) + C32163w8.m155135a().f148289b));
                        } else {
                            m95192lb(C32163w8.m155135a().f148290c);
                        }
                    } else {
                        if (!((C17945a0) m17941F0.get(size)).m95032V6() && !((C17945a0) m17941F0.get(size)).m95219o8()) {
                            j11 = ((C17945a0) m17941F0.get(size)).f90765z;
                            z11 = true;
                        }
                        size--;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m95306y8() && this.f90645O0) {
            return 1800000 - (C23793c.m124316k().mo124314i() - this.f90765z);
        }
        return this.f90727p1 - (C23793c.m124316k().mo124314i() - this.f90765z);
    }

    /* renamed from: D6 */
    public boolean m94870D6() {
        if (m95306y8() && !m95288w8()) {
            C17969i0 c17969i0 = this.f90618F0;
            if ((c17969i0 instanceof C17961f1) && ((C17961f1) c17969i0).m95465S()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D7 */
    public boolean m94871D7() {
        int i11 = this.f90614E;
        return i11 == 3 || i11 == 4;
    }

    /* renamed from: D8 */
    public boolean m94872D8() {
        return this.f90614E == 24;
    }

    /* renamed from: Da */
    public void m94873Da(boolean z11) {
        this.f90699g1 = z11;
    }

    /* renamed from: Db */
    public void m94874Db(boolean z11) {
        this.f90680a0 = z11;
    }

    /* renamed from: E1 */
    public void m94875E1() {
        C25240g c25240g;
        C24230h c24230h;
        C24230h c24230h2;
        if (m95044W7() || m95242r8() || m94907H6() || m95252s8()) {
            long m41045i = m95029V3().m41045i();
            long m94869D4 = m94869D4();
            if (m95044W7()) {
                C29628e.m147249E0().m93401c0(m41045i, m94869D4);
            }
            if (m95242r8() && (c24230h2 = this.f90722o0) != null) {
                C24226d.m126400X(c24230h2, m94869D4);
            }
            if (m95252s8() && (c24230h = this.f90719n0) != null) {
                C24226d.m126400X(c24230h, m94869D4);
            }
            if (m94907H6() && (c25240g = this.f90726p0) != null) {
                C25239f.f121027a.m130565u(c25240g, m94869D4);
            }
        }
    }

    /* renamed from: E2 */
    public C26399a m94876E2() {
        return this.f90702h1;
    }

    /* renamed from: E3 */
    public boolean m94877E3() {
        return this.f90699g1;
    }

    /* renamed from: E4 */
    public EnumC19038l m94878E4() {
        return this.f90603B0;
    }

    /* renamed from: E5 */
    public boolean m94879E5() {
        return this.f90650Q > 0;
    }

    /* renamed from: E7 */
    public boolean m94880E7() {
        if (m95107d3() == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: Ea */
    public void m94881Ea(boolean z11) {
        this.f90759x1 = z11;
    }

    /* renamed from: Eb */
    public void m94882Eb(String str) {
        this.f90753w = str;
    }

    /* renamed from: F0 */
    public void m94883F0(long j11) {
        synchronized (this.f90613D2) {
            try {
                if (this.f90687c1 == null) {
                    this.f90687c1 = new ArrayList();
                }
                for (int i11 = 0; i11 < this.f90687c1.size(); i11++) {
                    if (((Long) this.f90687c1.get(i11)).longValue() == j11) {
                        return;
                    }
                }
                this.f90687c1.add(Long.valueOf(j11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: F1 */
    public void m94884F1() {
        boolean z11;
        boolean z12;
        boolean z13;
        if (!m95219o8() && !m95091b6() && !m95306y8()) {
            if (!m95276v6() || this.f90604B1) {
                int m95107d3 = m95107d3();
                if (m95107d3 != 4 && (m95107d3 != 3 || !AbstractC23306f.m120691m2().m2466q() || this.f90679Z1.getAndSet(true))) {
                    if (m95107d3 == 2 && !m95276v6()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!m95142g6() && m94917I7() && !m95090b5().isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (m94960N7() && m95107d3 == 3 && this.f90682a2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z11 || z12 || z13) {
                        if (z13) {
                            this.f90682a2 = false;
                        }
                        m95165ic(4, true);
                        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                    } else {
                        return;
                    }
                }
                C0807c.m2043c(this.f90688c2);
            }
        }
    }

    /* renamed from: F2 */
    public boolean m94885F2() {
        return this.f90653R;
    }

    /* renamed from: F3 */
    public int m94886F3() {
        String mo95039W2;
        if (m94847A6()) {
            mo95039W2 = m94853B3();
        } else {
            mo95039W2 = mo95039W2();
        }
        return Integer.parseInt(mo95039W2);
    }

    /* renamed from: F4 */
    public int m94887F4() {
        return this.f90600A1;
    }

    /* renamed from: F5 */
    public boolean m94888F5() {
        C3541i c3541i = this.f90632K;
        if (c3541i != null && c3541i.m18002c()) {
            return true;
        }
        return false;
    }

    /* renamed from: F6 */
    public boolean m94889F6() {
        return AbstractC25495a.m132078c(this.f90737s);
    }

    /* renamed from: F7 */
    public boolean m94890F7() {
        return this.f90614E == 31;
    }

    /* renamed from: Fa */
    public void m94891Fa(boolean z11) {
        this.f90604B1 = z11;
    }

    /* renamed from: Fb */
    public void m94892Fb(String str) {
        this.f90749v = str;
    }

    /* renamed from: G1 */
    public boolean m94893G1(String str) {
        if (m94925J7().booleanValue()) {
            return true;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C17990p0) {
            return AbstractC26389c.m135985a(str, ((C17990p0) c17969i0).f91114C);
        }
        return false;
    }

    /* renamed from: G2 */
    public C17985n1 m94894G2(boolean z11) {
        if (this.f90689d0 == null) {
            this.f90689d0 = new C17966h0(this);
        }
        return this.f90689d0.m95556e(z11);
    }

    /* renamed from: G3 */
    public boolean m94895G3() {
        return this.f90604B1;
    }

    /* renamed from: G4 */
    public byte m94896G4() {
        return this.f90662U;
    }

    /* renamed from: G5 */
    public boolean m94897G5() {
        C32027n c32027n;
        C17994q1 c17994q1 = this.f90672X0;
        if (c17994q1 != null && (c32027n = c17994q1.f91143e) != null && c32027n.m154479t()) {
            return true;
        }
        return false;
    }

    /* renamed from: G6 */
    public boolean m94898G6() {
        C17994q1 c17994q1;
        C32027n c32027n;
        if (m94889F6() && (c17994q1 = this.f90672X0) != null && (c32027n = c17994q1.f91143e) != null && c32027n.m154478s() && !this.f90672X0.f91143e.m154462c().equals(this.f90737s)) {
            return true;
        }
        return false;
    }

    /* renamed from: G7 */
    public boolean m94899G7() {
        return this.f90614E == 26;
    }

    /* renamed from: Ga */
    public void m94900Ga(boolean z11) {
        this.f90685b2 = z11;
    }

    /* renamed from: Gb */
    public void m94901Gb(y yVar) {
        this.f90664U1.set(yVar);
    }

    /* renamed from: H1 */
    public void m94902H1() {
        this.f90622G1 = null;
        C7956b.m41474B().m41556r0(this, CoreUtility.f89233i);
    }

    /* renamed from: H2 */
    public boolean m94903H2() {
        return this.f90743t1;
    }

    /* renamed from: H3 */
    public boolean m94904H3() {
        return this.f90685b2;
    }

    /* renamed from: H4 */
    public int m94905H4() {
        return this.f90644O;
    }

    /* renamed from: H5 */
    public boolean m94906H5() {
        if (!m94871D7() && !m95120e6() && !m95316z8() && !m95306y8() && !m95276v6() && !m94872D8() && !m94960N7()) {
            return false;
        }
        return true;
    }

    /* renamed from: H6 */
    public boolean m94907H6() {
        return this.f90686c0;
    }

    /* renamed from: H7 */
    public boolean m94908H7() {
        C17969i0 c17969i0;
        String str;
        if (this.f90614E == 0 && (c17969i0 = this.f90618F0) != null && (str = c17969i0.f91016u) != null && TextUtils.equals(str, "rtf")) {
            C17969i0 c17969i02 = this.f90618F0;
            if ((c17969i02 instanceof C18015z0) && ((C18015z0) c17969i02).m95799g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ha */
    public void m94909Ha(boolean z11) {
        this.f90767z1 = z11;
    }

    /* renamed from: Hb */
    public void m94910Hb(EnumC24253d enumC24253d) {
        this.f90673X1 = enumC24253d;
    }

    /* renamed from: I1 */
    public void m94911I1() {
        this.f90745u = "";
        m94882Eb("");
        m94892Fb("");
    }

    /* renamed from: I2 */
    public C32012m m94912I2() {
        return this.f90659T;
    }

    /* renamed from: I3 */
    public boolean m94913I3() {
        return this.f90767z1;
    }

    /* renamed from: I4 */
    public long m94914I4() {
        if (!m95100c8()) {
            return -1L;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C17949b1) {
            return ((C17949b1) c17969i0).m95398h();
        }
        if (!(c17969i0 instanceof C17958e1)) {
            return -1L;
        }
        return ((C17958e1) c17969i0).m95424m();
    }

    /* renamed from: I5 */
    public void m94915I5() {
        this.f90652Q1 = true;
    }

    /* renamed from: I6 */
    public boolean m94916I6() {
        if ((m95276v6() && m95238r3() > ((C21216s) C21216s.Companion.m122672a()).m109886m0().m128647i() * 1048576) || (m95306y8() && m95159i5() > ((C21216s) C21216s.Companion.m122672a()).m109886m0().m128648j() * 1048576)) {
            return true;
        }
        return false;
    }

    /* renamed from: I7 */
    public boolean m94917I7() {
        if (!this.f90735r1 || this.f90636L0 || m95022U7() || m94959N6()) {
            return false;
        }
        return true;
    }

    /* renamed from: Ia */
    public void m94918Ia(ArrayList arrayList) {
        this.f90615E0 = arrayList;
    }

    /* renamed from: J0 */
    public String m94919J0() {
        if (m95187l6()) {
            C31986k3 c31986k3 = C31986k3.f147083a;
            if (c31986k3.m154132k0(this.f90733r, this.f90725p, m94974P4())) {
                try {
                    return c31986k3.m154116Y0(1, this.f90737s, this.f90733r, this.f90725p);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("E2EE", e11);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    /* renamed from: J1 */
    public void m94920J1() {
        try {
            if (m95276v6()) {
                C28023b6.m141250h0().m141301M(m95029V3().m41044h());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J2 */
    public String m94921J2() {
        String str;
        C32012m c32012m = this.f90659T;
        if (c32012m != null && (str = c32012m.f147324r) != null) {
            return str;
        }
        return "";
    }

    /* renamed from: J3 */
    public ArrayList m94922J3() {
        return this.f90615E0;
    }

    /* renamed from: J4 */
    public String m94923J4() {
        return this.f90693e1;
    }

    /* renamed from: J6 */
    public boolean m94924J6() {
        return this.f90646O1 == 3;
    }

    /* renamed from: J7 */
    public Boolean m94925J7() {
        return Boolean.valueOf(m95090b5().contains("https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo"));
    }

    /* renamed from: Ja */
    public void m94926Ja(int i11) {
        this.f90646O1 = i11;
    }

    /* renamed from: K0 */
    public boolean m94927K0() {
        int i11;
        if (m95033V7()) {
            return false;
        }
        if (m94935L0() || (i11 = this.f90614E) == 0) {
            return true;
        }
        if (i11 == 12 && !m94857B8() && m94929K2() != null && m94929K2().f91016u != null) {
            String str = m94929K2().f91016u;
            if (str.equals("recommened.link") || str.equals("recommened.user")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K1 */
    public void m94928K1() {
        m95096c1();
        m95068Z0();
        m95086b1();
        if (m95276v6()) {
            m94920J1();
        }
    }

    /* renamed from: K2 */
    public C17969i0 m94929K2() {
        return this.f90618F0;
    }

    /* renamed from: K3 */
    public C28770b m94930K3() {
        return this.f90747u1;
    }

    /* renamed from: K4 */
    TextPaint m94931K4() {
        if (this.f90728p2 == null) {
            m94968O5();
        }
        return this.f90728p2;
    }

    /* renamed from: K6 */
    public boolean m94932K6() {
        return this.f90646O1 == 1;
    }

    /* renamed from: K7 */
    public boolean m94933K7() {
        C31897e4 c31897e4 = this.f90622G1;
        if (c31897e4 != null && c31897e4.m153278s()) {
            return true;
        }
        return false;
    }

    /* renamed from: Ka */
    public void m94934Ka(String str) {
        this.f90761y = str;
    }

    /* renamed from: L0 */
    public boolean m94935L0() {
        int i11 = this.f90614E;
        return (i11 == 2 || i11 == 3 || i11 == 4) && Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: L1 */
    public C17945a0 clone() {
        return new w(this.f90729q, this.f90614E).m95352D(this.f90741t).m95359K(this.f90765z).m95382r(this.f90745u).m95389y(this.f90737s).m95368d(this.f90618F0).m95353E(this.f90734r0).m95357I(this.f90742t0).m95381q(this.f90657S0).m95351C(this.f90654R0).m95369e(this.f90681a1).m95385u(this.f90669W0).m95350B(this.f90672X0).m95384t(this.f90675Y0).m95379o(this.f90761y).m95383s(this.f90678Z0).m95354F(this.f90610D).m95380p(this.f90632K).m95386v(this.f90626I).m95361M(this.f90650Q).m95387w(this.f90620G).m95388x(this.f90714l1).m95370f(this.f90717m1).m95363O(this.f90753w).m95364P(this.f90749v).m95366b(this.f90702h1).m95371g(this.f90629J).m95377m(this.f90750v0).m95378n(this.f90646O1).m95372h(this.f90622G1).m95376l(this.f90623H).m95390z(this.f90725p).m95356H(this.f90644O).m95373i(this.f90656S).m95367c(this.f90659T).m95358J(this.f90693e1).m95355G(this.f90600A1).m95374j(this.f90699g1).m95349A(this.f90705i1).m95375k(this.f90759x1).m95360L(this.f90647P).m95365a();
    }

    /* renamed from: L2 */
    public long m94937L2() {
        return this.f90681a1;
    }

    /* renamed from: L3 */
    public int m94938L3() {
        return this.f90646O1;
    }

    /* renamed from: L4 */
    public String m94939L4(boolean z11) {
        C17969i0 c17969i0;
        try {
            int i11 = this.f90614E;
            if (i11 != 0) {
                if (i11 != 12) {
                    if ((i11 == 19 || i11 == 3 || i11 == 4) && !m94969O6() && (c17969i0 = this.f90618F0) != null) {
                        if (z11) {
                            return m94764i4(c17969i0.f91011p);
                        }
                        return c17969i0.f91011p;
                    }
                    return null;
                }
                return m94738a4(z11);
            }
            if (z11) {
                return m94764i4(this.f90745u);
            }
            return this.f90745u;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: L5 */
    public AbstractC23214t.a m94940L5(boolean z11, int i11) {
        AbstractC23214t.a aVar;
        String str;
        if (f90593K2 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f90593K2 = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
            f90593K2.setTextSize(AbstractC23136l9.m118742r(12.0f));
            f90593K2.setColor(AbstractC11531v0.m62143G3());
        }
        List list = null;
        if (z11) {
            aVar = f90594L2;
        } else if (m95032V6()) {
            aVar = f90595M2;
        } else {
            aVar = null;
        }
        boolean m154110T1 = C31986k3.f147083a.m154110T1();
        AbstractC23214t.a m94816u1 = m94816u1(aVar, i11, f90593K2);
        if (m94816u1 == null) {
            String m94772k3 = m94772k3(z11);
            if (m154110T1) {
                if (m94847A6()) {
                    str = AbstractC23306f.m120583H().m110204g().f110091z;
                } else {
                    C22498e m110204g = AbstractC23306f.m120583H().m110204g();
                    if (z11) {
                        str = m110204g.f110090y;
                    } else {
                        str = m110204g.f110089x;
                    }
                }
                MsgInfoSpan msgInfoSpan = new MsgInfoSpan(AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.cM1), AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more), "action.open.inapp", str);
                msgInfoSpan.f54797v = true;
                list = Collections.singletonList(msgInfoSpan);
            }
            m94816u1 = AbstractC23214t.m119617d(m94772k3, f90593K2, i11, 0, null, list, true);
            if ((m154110T1 || m95032V6() || z11) && m94673Ib(m94816u1)) {
                if (z11) {
                    f90594L2 = m94816u1;
                } else {
                    f90595M2 = m94816u1;
                }
            }
        }
        return m94816u1;
    }

    /* renamed from: L6 */
    public boolean m94941L6() {
        return this.f90614E == 32;
    }

    /* renamed from: L7 */
    public boolean m94942L7() {
        C17969i0 c17969i0;
        if (m94977P7() && (c17969i0 = this.f90618F0) != null && (TextUtils.equals(c17969i0.f91016u, "recommened.user") || TextUtils.equals(this.f90618F0.f91016u, "recommened.vip"))) {
            return true;
        }
        return false;
    }

    /* renamed from: La */
    public void m94943La(C3541i c3541i) {
        this.f90632K = c3541i;
    }

    @Override // java.lang.Comparable
    /* renamed from: M1 */
    public int compareTo(InterfaceC26392a interfaceC26392a) {
        return Long.compare(mo95213o(), interfaceC26392a.mo95213o());
    }

    /* renamed from: M2 */
    public String m94945M2() {
        C17969i0 c17969i0;
        if (!m95306y8() || (c17969i0 = this.f90618F0) == null) {
            return "";
        }
        return ((C17961f1) c17969i0).m95483j();
    }

    /* renamed from: M3 */
    public ArrayList m94946M3() {
        return this.f90663U0;
    }

    /* renamed from: M4 */
    public String m94947M4() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                if (c17969i0 instanceof C17961f1) {
                    return ((C17961f1) c17969i0).m95455I();
                }
                if (c17969i0 instanceof C17990p0) {
                    return ((C17990p0) c17969i0).m95666g();
                }
                if ((c17969i0 instanceof C18013y0) && ((C18013y0) c17969i0).f91251B != null) {
                    return ((C18013y0) c17969i0).f91251B.m154934d();
                }
                return "";
            }
            return "";
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f90587E2, e11);
            return "";
        }
    }

    /* renamed from: M5 */
    public AbstractC23214t.a m94948M5(int i11) {
        if (f90596N2 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f90596N2 = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
            f90596N2.setTextSize(AbstractC23136l9.m118742r(14.0f));
            f90596N2.setColor(AbstractC11531v0.m62226Z2());
        }
        AbstractC23214t.a m94816u1 = m94816u1(f90597O2, i11, f90596N2);
        if (m94816u1 == null) {
            m94816u1 = AbstractC23214t.m119622i(f90596N2, i11);
            if (m94673Ib(m94816u1)) {
                f90597O2 = m94816u1;
            }
        }
        return m94816u1;
    }

    /* renamed from: M6 */
    public boolean m94949M6() {
        return this.f90614E == 18;
    }

    /* renamed from: M7 */
    public boolean m94950M7() {
        C17969i0 c17969i0;
        String str;
        if (!m94977P7() || (c17969i0 = this.f90618F0) == null || (str = c17969i0.f91016u) == null || !str.equals("recommened.msg.game")) {
            return false;
        }
        return true;
    }

    /* renamed from: M9 */
    public void m94951M9() {
        String str;
        C17967h1 c17967h1;
        JSONObject jSONObject;
        String m118743r0;
        C17969i0 c17969i0;
        String str2;
        if (AbstractC19646n0.f97515a.get()) {
            return;
        }
        try {
            m95034V9();
            if (m95178k6()) {
                m94940L5(m95187l6(), AbstractC11531v0.m62214W2());
                return;
            }
            int i11 = this.f90614E;
            if (i11 != 0) {
                if (i11 != 12) {
                    if (i11 != 24) {
                        if (i11 != 26 && i11 != 29) {
                            if (i11 != 33 && i11 != 36) {
                                if (i11 != 20) {
                                    if (i11 == 21 && (c17969i0 = this.f90618F0) != null && (c17969i0 instanceof C17984n0)) {
                                        C17984n0 c17984n0 = (C17984n0) c17969i0;
                                        if (m94847A6()) {
                                            str2 = this.f90737s;
                                        } else {
                                            str2 = "";
                                        }
                                        c17984n0.m95632g(str2);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                if (m95219o8()) {
                                    m118743r0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_bubble_undo_sent_message);
                                } else {
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_delete_message);
                                }
                                C17969i0 c17969i02 = this.f90618F0;
                                if (c17969i02 instanceof C17958e1) {
                                    String m95420i = ((C17958e1) c17969i02).m95420i();
                                    if (!TextUtils.isEmpty(m95420i)) {
                                        m118743r0 = m95420i;
                                    }
                                }
                                m95004S5(m118743r0, AbstractC11531v0.m62214W2());
                                return;
                            }
                        }
                        C17969i0 c17969i03 = this.f90618F0;
                        if (c17969i03 != null && c17969i03.f91016u.equals("msginfo.actionlist")) {
                            AbstractC18007v0 abstractC18007v0 = (C18005u0) this.f90618F0;
                            m94829w9(new JSONObject(abstractC18007v0.f91017v), abstractC18007v0);
                        }
                        m94958N5(this.f90745u, ChatRowMsgInfo.getMaxMsgInfoWidth());
                        return;
                    }
                    C17969i0 c17969i04 = this.f90618F0;
                    if (c17969i04 instanceof C17967h1) {
                        ((C17967h1) c17969i04).m95589u(this);
                    }
                    C17969i0 c17969i05 = this.f90618F0;
                    if ((c17969i05 instanceof C17967h1) && (jSONObject = (c17967h1 = (C17967h1) c17969i05).f90987M) != null) {
                        m94829w9(jSONObject, c17967h1);
                        m94958N5(this.f90745u, ChatRowMsgInfo.getMaxMsgInfoWidth());
                        return;
                    }
                    return;
                }
                C17969i0 c17969i06 = this.f90618F0;
                if (c17969i06 != null && (str = c17969i06.f91016u) != null) {
                    if (str.equals("recommened.link")) {
                        m94985Q5(this.f90618F0.f91011p, AbstractC11531v0.m62214W2(), false, true);
                        return;
                    }
                    if (this.f90618F0.f91016u.equals("recommened.user")) {
                        C17969i0 c17969i07 = this.f90618F0;
                        if ((c17969i07 instanceof C18013y0) && ((C18013y0) c17969i07).f91253D != null && !TextUtils.isEmpty(((C18013y0) c17969i07).f91253D.f91054b)) {
                            m94985Q5(((C18013y0) this.f90618F0).f91253D.f91054b, AbstractC11531v0.m62214W2(), false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            m94975P5(this.f90745u, AbstractC11531v0.m62214W2(), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ma */
    public void m94952Ma(C7907e c7907e) {
        this.f90657S0 = c7907e;
    }

    /* renamed from: Mb */
    public void m94953Mb(boolean z11) {
        if ((z11 || C23055e5.m118271f()) && this.f90677Z.compareAndSet(false, true)) {
            if (this.f90689d0 == null) {
                this.f90689d0 = new C17966h0(this);
            }
            C24302e.m126895s().m126904m(this, new j(CoreUtility.f89233i, z11));
            AbstractC20887g.m109245w(18850);
        }
    }

    /* renamed from: N0 */
    public boolean m94954N0() {
        char c11;
        C17969i0 c17969i0;
        boolean z11;
        C17969i0 c17969i02;
        try {
            if (!m95033V7() && !m94959N6()) {
                int i11 = this.f90614E;
                if (i11 != 0) {
                    if (i11 != 6) {
                        if (i11 != 10) {
                            if (i11 != 12) {
                                if (i11 != 31) {
                                    if (i11 != 2 && i11 != 3 && i11 != 4) {
                                        if (i11 != 18) {
                                            if (i11 != 19) {
                                                if (i11 != 22) {
                                                    if (i11 != 23 || (c17969i02 = this.f90618F0) == null || TextUtils.isEmpty(c17969i02.f91014s)) {
                                                        return false;
                                                    }
                                                } else if (m95032V6()) {
                                                    if (!m95180k8() && ((c17969i0 = this.f90618F0) == null || TextUtils.isEmpty(c17969i0.f91014s))) {
                                                        z11 = false;
                                                        if (!z11 && m94889F6() && (this.f90618F0 instanceof C17990p0)) {
                                                            if (!AbstractC23041d2.m118194A(this.f90761y) && AbstractC26687h.m137062c(this, (C17990p0) this.f90618F0)) {
                                                                return false;
                                                            }
                                                        } else {
                                                            return z11;
                                                        }
                                                    }
                                                    z11 = true;
                                                    if (!z11) {
                                                    }
                                                    return z11;
                                                }
                                            } else {
                                                C17969i0 c17969i03 = this.f90618F0;
                                                if (c17969i03 == null || TextUtils.isEmpty(c17969i03.f91014s) || TextUtils.isEmpty(this.f90618F0.f91013r)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                C17969i0 c17969i04 = this.f90618F0;
                                if (c17969i04 == null) {
                                    return false;
                                }
                                String str = c17969i04.f91016u;
                                if (TextUtils.isEmpty(str)) {
                                    return false;
                                }
                                switch (str.hashCode()) {
                                    case -999310090:
                                        if (str.equals("recommened.vip")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -914139583:
                                        if (str.equals("recommened.link")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -913862126:
                                        if (str.equals("recommened.user")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 1012294412:
                                        if (str.equals("recommened.stickerset")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    default:
                                        c11 = 65535;
                                        break;
                                }
                                if (c11 != 0 && c11 != 1) {
                                    if (c11 != 2 && c11 != 3) {
                                        return false;
                                    }
                                } else {
                                    C17969i0 c17969i05 = this.f90618F0;
                                    if (c17969i05 == null || TextUtils.isEmpty(c17969i05.f91017v)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                    C17969i0 c17969i06 = this.f90618F0;
                    if (c17969i06 == null || TextUtils.isEmpty(c17969i06.f91014s) || !AbstractC23041d2.m118194A(this.f90761y)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: N1 */
    public boolean m94955N1() {
        C7907e c7907e;
        if (this.f90654R0 == null && (((c7907e = this.f90657S0) == null || !c7907e.m40858h()) && !m94942L7())) {
            return false;
        }
        return true;
    }

    /* renamed from: N2 */
    public int m94956N2() {
        return this.f90717m1;
    }

    /* renamed from: N3 */
    public ArrayList m94957N3() {
        return this.f90666V0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x0035, B:10:0x0047, B:12:0x004d, B:17:0x0073, B:18:0x0077, B:19:0x0085, B:75:0x01e0, B:77:0x01e6, B:100:0x007e, B:102:0x0053, B:104:0x0057, B:106:0x0060, B:108:0x0068), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #1 {Exception -> 0x0032, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x0035, B:10:0x0047, B:12:0x004d, B:17:0x0073, B:18:0x0077, B:19:0x0085, B:75:0x01e0, B:77:0x01e6, B:100:0x007e, B:102:0x0053, B:104:0x0057, B:106:0x0060, B:108:0x0068), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007c  */
    /* renamed from: N5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC23214t.a m94958N5(String str, int i11) {
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        AbstractC23214t.a m94816u1;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C7907e.a aVar;
        String str3;
        ArrayList arrayList3;
        String str4;
        List list;
        int i15;
        MsgInfoSpan msgInfoSpan;
        ArrayList arrayList4;
        String str5 = str;
        AbstractC23214t.a aVar2 = null;
        r3 = null;
        ArrayList arrayList5 = null;
        aVar2 = null;
        aVar2 = null;
        if (!TextUtils.isEmpty(str) && i11 > 0) {
            try {
                if (f90590H2 == null) {
                    C13704p1 c13704p1 = new C13704p1(1);
                    f90590H2 = c13704p1;
                    c13704p1.setTypeface(Typeface.DEFAULT);
                    f90590H2.linkColor = AbstractC11531v0.m62222Y2();
                    f90590H2.setColor(AbstractC11531v0.m62226Z2());
                }
                f90590H2.setTextSize(AbstractC23136l9.m118742r(12.0f));
                C17969i0 c17969i0 = this.f90618F0;
                if (c17969i0 instanceof AbstractC18007v0) {
                    AbstractC18007v0 abstractC18007v0 = (AbstractC18007v0) c17969i0;
                    ArrayList arrayList6 = abstractC18007v0.f91203E;
                    if ((arrayList6 != null && arrayList6.size() > 0) || ((arrayList4 = abstractC18007v0.f91204F) != null && arrayList4.size() > 0)) {
                        z11 = true;
                        z12 = false;
                        if (z11) {
                        }
                        i12 = i11 - (i13 + i14);
                        m94816u1 = m94816u1(this.f90732q2, i12, f90590H2);
                        if (m94816u1 == null) {
                        }
                    } else if (!TextUtils.isEmpty(abstractC18007v0.f91205G) || abstractC18007v0.f91207I > 0) {
                        z11 = false;
                        z12 = true;
                        if (z11) {
                            i13 = ChatRowMsgInfo.f58154j8;
                            i14 = C13703p0.f70894r;
                        } else if (z12) {
                            i13 = ChatRowMsgInfo.f58154j8;
                            i14 = ChatRowMsgInfo.f58155k8;
                        } else {
                            i12 = i11;
                            m94816u1 = m94816u1(this.f90732q2, i12, f90590H2);
                            if (m94816u1 == null) {
                                return m94816u1;
                            }
                            try {
                                C17969i0 c17969i02 = this.f90618F0;
                                if (c17969i02 != null) {
                                    if (c17969i02 instanceof AbstractC18007v0) {
                                        AbstractC18007v0 abstractC18007v02 = (AbstractC18007v0) c17969i02;
                                        if (abstractC18007v02.f91202D.size() > 0) {
                                            arrayList3 = new ArrayList();
                                            for (C32005l7 c32005l7 : abstractC18007v02.f91202D) {
                                                if (!TextUtils.isEmpty(c32005l7.f147272c) && AbstractC28207v1.m141992i1(c32005l7.f147270a)) {
                                                    MsgInfoSpan msgInfoSpan2 = new MsgInfoSpan(c32005l7.f147273d, c32005l7.f147272c, c32005l7.f147270a, c32005l7.f147271b);
                                                    msgInfoSpan2.f54798w = abstractC18007v02.f91207I;
                                                    arrayList3.add(msgInfoSpan2);
                                                }
                                            }
                                        } else {
                                            arrayList3 = null;
                                        }
                                        C7907e c7907e = abstractC18007v02.f91201C;
                                        if (c7907e != null && c7907e.m40856f().size() > 0) {
                                            arrayList5 = new ArrayList();
                                            List m40857g = abstractC18007v02.f91201C.m40857g();
                                            if (!m94847A6()) {
                                                str4 = "";
                                            } else {
                                                str4 = this.f90737s;
                                            }
                                            str5 = AbstractC19620d0.m102678O(m40857g, str5, str4);
                                            int i16 = 0;
                                            while (i16 < m40857g.size()) {
                                                C7907e.a aVar3 = (C7907e.a) m40857g.get(i16);
                                                if (aVar3 != null && (i15 = aVar3.f42795e) >= 0 && i15 + aVar3.f42794d <= str5.length()) {
                                                    if (aVar3.f42792b > 0) {
                                                        int m62153I3 = AbstractC11531v0.m62153I3();
                                                        StringBuilder sb2 = new StringBuilder();
                                                        list = m40857g;
                                                        sb2.append(aVar3.f42792b);
                                                        sb2.append("");
                                                        msgInfoSpan = new MsgInfoSpan(m62153I3, "", "action.open.profile", sb2.toString());
                                                    } else {
                                                        list = m40857g;
                                                        msgInfoSpan = new MsgInfoSpan(AbstractC11531v0.m62153I3(), "", "", "");
                                                    }
                                                    int i17 = aVar3.f42795e;
                                                    msgInfoSpan.f54795t = i17;
                                                    msgInfoSpan.f54796u = i17 + aVar3.f42794d;
                                                    msgInfoSpan.f54797v = true;
                                                    arrayList5.add(msgInfoSpan);
                                                } else {
                                                    list = m40857g;
                                                }
                                                i16++;
                                                m40857g = list;
                                            }
                                        }
                                        arrayList = arrayList5;
                                        arrayList2 = arrayList3;
                                        str2 = str5;
                                    } else if ((c17969i02 instanceof C17955d1) && (aVar = ((C17955d1) c17969i02).f90892F) != null) {
                                        ArrayList arrayList7 = new ArrayList();
                                        arrayList7.add(aVar);
                                        if (!m94847A6()) {
                                            str3 = "";
                                        } else {
                                            str3 = this.f90737s;
                                        }
                                        String m102678O = AbstractC19620d0.m102678O(arrayList7, str5, str3);
                                        ArrayList arrayList8 = new ArrayList();
                                        int i18 = aVar.f42795e;
                                        if (i18 >= 0 && i18 + aVar.f42794d <= m102678O.length()) {
                                            MsgInfoSpan msgInfoSpan3 = new MsgInfoSpan(AbstractC11531v0.m62153I3(), "", "action.open.profile", aVar.f42792b + "");
                                            int i19 = aVar.f42795e;
                                            msgInfoSpan3.f54795t = i19;
                                            msgInfoSpan3.f54796u = i19 + aVar.f42794d;
                                            msgInfoSpan3.f54797v = true;
                                            arrayList8.add(msgInfoSpan3);
                                        }
                                        str2 = m102678O;
                                        arrayList2 = null;
                                        arrayList = arrayList8;
                                    }
                                    aVar2 = AbstractC23214t.m119617d(str2, f90590H2, i12, 0, arrayList, arrayList2, false);
                                    if (m94673Ib(aVar2)) {
                                        this.f90732q2 = aVar2;
                                    }
                                }
                                str2 = str5;
                                arrayList = null;
                                arrayList2 = null;
                                aVar2 = AbstractC23214t.m119617d(str2, f90590H2, i12, 0, arrayList, arrayList2, false);
                                if (m94673Ib(aVar2)) {
                                }
                            } catch (Exception e11) {
                                e = e11;
                                aVar2 = m94816u1;
                                AbstractC23350e.m122778h(e);
                                return aVar2;
                            }
                        }
                        i12 = i11 - (i13 + i14);
                        m94816u1 = m94816u1(this.f90732q2, i12, f90590H2);
                        if (m94816u1 == null) {
                        }
                    }
                }
                z11 = false;
                z12 = false;
                if (z11) {
                }
                i12 = i11 - (i13 + i14);
                m94816u1 = m94816u1(this.f90732q2, i12, f90590H2);
                if (m94816u1 == null) {
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return aVar2;
    }

    /* renamed from: N6 */
    public boolean m94959N6() {
        return this.f90629J == 8;
    }

    /* renamed from: N7 */
    public boolean m94960N7() {
        C17969i0 c17969i0;
        String str;
        if (!m94977P7() || (c17969i0 = this.f90618F0) == null || (str = c17969i0.f91016u) == null || !str.equals("recommened.link")) {
            return false;
        }
        return true;
    }

    /* renamed from: Na */
    public void m94961Na(String str) {
        this.f90745u = str;
        m94951M9();
    }

    /* renamed from: Nb */
    public void m94962Nb(C19028b c19028b, String str, boolean z11, boolean z12) {
        int i11;
        long m107481q;
        int i12;
        String str2 = CoreUtility.f89233i;
        if (TextUtils.isEmpty(str)) {
            m95138fc(false, true, c19028b.m100092b(), str2, true);
            m95116e2(z12);
            return;
        }
        if (this.f90677Z.compareAndSet(false, true)) {
            synchronized (this.f90700g2) {
                try {
                    C21216s m120652d = AbstractC23306f.m120652d();
                    this.f90608C1 = m94836y2(str);
                    C22981a c22981a = new C22981a();
                    this.f90697f2 = c22981a;
                    c22981a.m117746R(m95169j5(str));
                    this.f90697f2.m117745Q(new m(m120652d, str2, z11, c19028b));
                    if (c19028b.m100092b()) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    this.f90691d2 = i11;
                    this.f90697f2.m107484G(m94964O1(this, m120652d, false));
                    if (this.f90754w0.get() == 0) {
                        m107481q = m94974P4();
                    } else {
                        m107481q = AbstractC20631e.m107481q();
                    }
                    long j11 = m107481q;
                    if (m94847A6()) {
                        i12 = 5;
                    } else {
                        i12 = 0;
                    }
                    this.f90697f2.m107489o(this.f90691d2, j11, this.f90612D1, this.f90616E1, this.f90608C1, str, i12 + "");
                } finally {
                }
            }
        }
    }

    /* renamed from: O0 */
    public boolean m94963O0() {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m95033V7()) {
            return false;
        }
        int i11 = this.f90614E;
        if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 6) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 == null || TextUtils.isEmpty(c17969i0.f91014s)) {
                return false;
            }
            C28770b c28770b = this.f90747u1;
            if (c28770b != null) {
                if (!c28770b.m143918k()) {
                    return false;
                }
            }
            return true;
        }
        return m94954N0();
    }

    /* renamed from: O1 */
    public AbstractC20631e.c m94964O1(C17945a0 c17945a0, C21216s c21216s, boolean z11) {
        return new l(c21216s, c17945a0, z11);
    }

    /* renamed from: O2 */
    public String m94965O2() {
        if (this.f90674Y == 1) {
            return m94967O4();
        }
        return AbstractC23160o0.m119304y(m94991R2());
    }

    /* renamed from: O3 */
    public String m94966O3() {
        return AbstractC23041d2.m118216o(m94983Q3());
    }

    /* renamed from: O4 */
    public String m94967O4() {
        return AbstractC23160o0.m119192F0(m94991R2());
    }

    /* renamed from: O5 */
    void m94968O5() {
        TextPaint textPaint = f90589G2;
        if (textPaint == null || textPaint.getColor() == 0) {
            C13704p1 c13704p1 = new C13704p1(1);
            f90589G2 = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
            f90589G2.setTextSize(AbstractC23136l9.m118742r(16.0f));
            f90589G2.linkColor = AbstractC11531v0.m62222Y2();
            f90589G2.setColor(AbstractC11531v0.m62226Z2());
            C24559a.m127933c("SettingTheme", "Init default text paint ChatContent");
        }
        if (this.f90728p2 == null) {
            if (m94863C5()) {
                this.f90728p2 = m95311z2();
            } else {
                this.f90728p2 = f90589G2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* renamed from: O6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m94969O6() {
        boolean z11;
        boolean z12;
        C17969i0 c17969i0;
        boolean z13;
        if (m94871D7()) {
            C17969i0 c17969i02 = this.f90618F0;
            if ((c17969i02 instanceof C18009w0) && ((C18009w0) c17969i02).m95743H()) {
                z11 = true;
                if (m95306y8()) {
                    C17969i0 c17969i03 = this.f90618F0;
                    if ((c17969i03 instanceof C17961f1) && ((C17961f1) c17969i03).m95460N()) {
                        z12 = true;
                        if (!m95219o8() || m95091b6()) {
                            c17969i0 = this.f90618F0;
                            if ((c17969i0 instanceof C17958e1) && ((C17958e1) c17969i0).m95431t()) {
                                z13 = true;
                                if (z11 && !z12 && !z13) {
                                    return false;
                                }
                                return true;
                            }
                        }
                        z13 = false;
                        if (z11) {
                        }
                        return true;
                    }
                }
                z12 = false;
                if (!m95219o8()) {
                }
                c17969i0 = this.f90618F0;
                if (c17969i0 instanceof C17958e1) {
                    z13 = true;
                    if (z11) {
                    }
                    return true;
                }
                z13 = false;
                if (z11) {
                }
                return true;
            }
        }
        z11 = false;
        if (m95306y8()) {
        }
        z12 = false;
        if (!m95219o8()) {
        }
        c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C17958e1) {
        }
        z13 = false;
        if (z11) {
        }
        return true;
    }

    /* renamed from: Ob */
    public void m94970Ob(C19028b c19028b, boolean z11) {
        m94962Nb(c19028b, m95293x2(), true, z11);
    }

    /* renamed from: P0 */
    public boolean m94971P0() {
        if (m95033V7()) {
            return false;
        }
        if (m94872D8()) {
            return ((C17967h1) this.f90618F0).f90988N;
        }
        return m94981Q0();
    }

    /* renamed from: P2 */
    public C26709a m94972P2() {
        return this.f90627I0;
    }

    /* renamed from: P3 */
    public String m94973P3() {
        C32042o.f147549a.m154588d(this.f90737s);
        return this.f90761y;
    }

    /* renamed from: P4 */
    public long m94974P4() {
        return this.f90765z;
    }

    /* renamed from: P5 */
    public AbstractC23214t.a m94975P5(String str, int i11, boolean z11) {
        return m94985Q5(str, i11, z11, true);
    }

    /* renamed from: P6 */
    public boolean m94976P6() {
        if (!m94871D7() && ((!m95306y8() || m95288w8()) && !m95276v6() && !m94960N7())) {
            return false;
        }
        return true;
    }

    /* renamed from: P7 */
    public boolean m94977P7() {
        return this.f90614E == 12;
    }

    /* renamed from: P9 */
    public void m94978P9() {
        C28770b c28770b = this.f90747u1;
        if (c28770b != null) {
            c28770b.m143926s(m94917I7());
        }
    }

    /* renamed from: Pa */
    public void m94979Pa(C17976k1 c17976k1) {
        this.f90675Y0 = c17976k1;
    }

    /* renamed from: Pb */
    public void m94980Pb(C19028b c19028b, boolean z11) {
        boolean z12;
        boolean z13;
        String str;
        int i11;
        long m107481q;
        boolean z14;
        C21216s m120652d = AbstractC23306f.m120652d();
        if (!c19028b.m100094d() && !c19028b.m100093c()) {
            z12 = true;
        } else {
            z12 = false;
        }
        String str2 = CoreUtility.f89233i;
        String m94749d5 = m94749d5();
        String m95088b3 = m95088b3(Boolean.valueOf(z12));
        EnumC19029c m94823v1 = m94823v1(c19028b, m95088b3, m94749d5, str2, z11);
        if (m94823v1 != EnumC19029c.f94853s) {
            m94694N9(m94823v1, c19028b, m95088b3, str2, z11);
            return;
        }
        if (this.f90677Z.compareAndSet(false, true)) {
            if (this.f90689d0 == null) {
                this.f90689d0 = new C17966h0(this);
            }
            InterfaceC20633g m94711S1 = m94711S1(c19028b, m120652d, str2, z12);
            if (C24832c.m129122b(this)) {
                m94706Qb(m94711S1);
                return;
            }
            this.f90608C1 = m94836y2(m94749d5);
            int m94720U2 = m94720U2(c19028b);
            if (!m94871D7() && !m95120e6()) {
                z13 = false;
            } else {
                z13 = true;
            }
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C17990p0) {
                str = ((C17990p0) c17969i0).f91114C;
            } else {
                str = "";
            }
            String str3 = str;
            C20627a.a m94759h1 = m94759h1();
            m94646C9(z11, m95088b3);
            m94732Y9(c19028b);
            if (c19028b.m100092b()) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            this.f90691d2 = i11;
            if (this.f90754w0.get() == 0) {
                m107481q = m94974P4();
            } else {
                m107481q = AbstractC20631e.m107481q();
            }
            long j11 = m107481q;
            C20629c m107448k = C20629c.m107448k();
            MessageId messageId = this.f90729q;
            String messageId2 = messageId.toString();
            if (m94720U2 != -1) {
                z14 = true;
            } else {
                z14 = false;
            }
            m107448k.m107455o(messageId, m94749d5, m95088b3, messageId2, m94711S1, z14, m94720U2, this.f90691d2, j11, this.f90612D1, this.f90616E1, m94964O1(this, m120652d, true), m94759h1, z13, str3);
        }
    }

    /* renamed from: Q0 */
    public boolean m94981Q0() {
        try {
            if (m95032V6() && !m95180k8() && !m95065Y7()) {
                return false;
            }
            int m95041W4 = m95041W4();
            if (m95041W4 != 0) {
                if (m95041W4 != 6 && m95041W4 != 10) {
                    if (m95041W4 != 12) {
                        if (m95041W4 != 2 && m95041W4 != 3 && m95041W4 != 4 && m95041W4 != 18 && m95041W4 != 19 && m95041W4 != 31 && m95041W4 != 32) {
                            switch (m95041W4) {
                                case 22:
                                case 23:
                                    break;
                                case 24:
                                    C17969i0 c17969i0 = this.f90618F0;
                                    if (!(c17969i0 instanceof C17967h1) || ((C17967h1) c17969i0).f91002b0 != 2) {
                                        return false;
                                    }
                                    return true;
                                default:
                                    return false;
                            }
                        }
                    } else {
                        String str = this.f90618F0.f91016u;
                        if (!"recommened.link".equals(str) && !"recommened.stickerset".equals(str) && !"recommened.user".equals(str) && !"recommened.vip".equals(str)) {
                            return false;
                        }
                        return true;
                    }
                }
                return true;
            }
            return !TextUtils.isEmpty(this.f90745u);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: Q2 */
    public int m94982Q2() {
        C17966h0 c17966h0 = this.f90689d0;
        if (c17966h0 != null) {
            return c17966h0.m95557f();
        }
        return 0;
    }

    /* renamed from: Q3 */
    public String m94983Q3() {
        return this.f90761y;
    }

    /* renamed from: Q4 */
    public String m94984Q4() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                return c17969i0.f91011p;
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return this.f90753w;
        }
    }

    /* renamed from: Q5 */
    public AbstractC23214t.a m94985Q5(String str, int i11, boolean z11, boolean z12) {
        return m94994R5(str, i11, z11, z12, m94931K4());
    }

    /* renamed from: Q6 */
    public boolean m94986Q6() {
        C7907e c7907e;
        try {
            if (!CoreUtility.f89233i.equals(this.f90733r) && (c7907e = this.f90657S0) != null) {
                if (c7907e.m40859i()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: Q7 */
    public boolean m94987Q7() {
        return !m95032V6();
    }

    /* renamed from: Q9 */
    public void m94988Q9() {
        C17969i0 c17969i0;
        JSONArray m96090i;
        try {
            if (this.f90614E == 0 && !TextUtils.isEmpty(this.f90745u) && this.f90745u.contains("\u0000")) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                for (int i12 = 0; i12 < this.f90745u.length(); i12++) {
                    char charAt = this.f90745u.charAt(i12);
                    if (charAt == 0) {
                        C7907e c7907e = this.f90657S0;
                        if (c7907e != null && c7907e.m40861l() > 0) {
                            for (int i13 = 0; i13 < this.f90657S0.m40861l(); i13++) {
                                C7907e.a m40855e = this.f90657S0.m40855e(i13);
                                int i14 = m40855e.f42795e;
                                int i15 = i12 - i11;
                                if (i14 > i15) {
                                    m40855e.f42795e = i14 - 1;
                                } else {
                                    int i16 = m40855e.f42794d;
                                    if (i14 + i16 > i15) {
                                        m40855e.f42794d = i16 - 1;
                                    }
                                }
                            }
                        }
                        if (m94908H7()) {
                            try {
                                JSONObject jSONObject = new JSONObject(this.f90618F0.f91017v);
                                JSONArray optJSONArray = jSONObject.optJSONArray("styles");
                                if (optJSONArray != null) {
                                    JSONArray jSONArray = new JSONArray();
                                    int i17 = 0;
                                    while (i17 < optJSONArray.length()) {
                                        JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                                        int optInt = optJSONObject.optInt("start");
                                        int optInt2 = optJSONObject.optInt("len");
                                        JSONArray jSONArray2 = optJSONArray;
                                        int i18 = i12 - i11;
                                        if (optInt > i18) {
                                            optJSONObject.put("start", optInt - 1);
                                        } else if (optInt + optInt2 > i18) {
                                            optJSONObject.put("len", optInt2 - 1);
                                        }
                                        jSONArray.put(optJSONObject);
                                        i17++;
                                        optJSONArray = jSONArray2;
                                    }
                                    jSONObject.put("styles", jSONArray);
                                    this.f90618F0.f91017v = jSONObject.toString();
                                    ((C18015z0) this.f90618F0).m95800h();
                                }
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                        }
                        i11++;
                    } else {
                        sb2.append(charAt);
                    }
                }
                this.f90745u = sb2.toString();
            }
            int i19 = this.f90614E;
            if ((i19 == 3 || i19 == 4 || i19 == 19 || m94960N7()) && (c17969i0 = this.f90618F0) != null && !TextUtils.isEmpty(c17969i0.f91011p) && this.f90618F0.f91011p.contains("\u0000")) {
                StringBuilder sb3 = new StringBuilder();
                int i21 = 0;
                for (int i22 = 0; i22 < this.f90618F0.f91011p.length(); i22++) {
                    char charAt2 = this.f90618F0.f91011p.charAt(i22);
                    if (charAt2 == 0) {
                        C7907e c7907e2 = this.f90657S0;
                        if (c7907e2 != null && c7907e2.m40861l() > 0) {
                            for (int i23 = 0; i23 < this.f90657S0.m40861l(); i23++) {
                                C7907e.a m40855e2 = this.f90657S0.m40855e(i23);
                                int i24 = m40855e2.f42795e;
                                int i25 = i22 - i21;
                                if (i24 > i25) {
                                    m40855e2.f42795e = i24 - 1;
                                } else {
                                    int i26 = m40855e2.f42794d;
                                    if (i24 + i26 > i25) {
                                        m40855e2.f42794d = i26 - 1;
                                    }
                                }
                            }
                        }
                        i21++;
                    } else {
                        sb3.append(charAt2);
                    }
                }
                this.f90618F0.f91011p = sb3.toString();
            }
            C17997r1 c17997r1 = this.f90654R0;
            if (c17997r1 != null && c17997r1.m95687d() == 1 && !TextUtils.isEmpty(this.f90654R0.m95688e()) && this.f90654R0.m95688e().contains("\u0000")) {
                StringBuilder sb4 = new StringBuilder();
                int i27 = 0;
                for (int i28 = 0; i28 < this.f90654R0.m95688e().length(); i28++) {
                    char charAt3 = this.f90654R0.m95688e().charAt(i28);
                    if (charAt3 == 0) {
                        try {
                            if (!TextUtils.isEmpty(this.f90654R0.m95686c())) {
                                JSONObject jSONObject2 = new JSONObject(this.f90654R0.m95686c());
                                if (jSONObject2.has("mentions") && (m96090i = AbstractC18069a.m96090i(jSONObject2, "mentions")) != null && m96090i.length() > 0) {
                                    JSONArray jSONArray3 = new JSONArray();
                                    for (int i29 = 0; i29 < m96090i.length(); i29++) {
                                        JSONObject optJSONObject2 = m96090i.optJSONObject(i29);
                                        int optInt3 = optJSONObject2.optInt("pos");
                                        int optInt4 = optJSONObject2.optInt("len");
                                        int i31 = i28 - i27;
                                        if (optInt3 > i31) {
                                            optJSONObject2.put("pos", optInt3 - 1);
                                        } else if (optInt3 + optInt4 > i31) {
                                            optJSONObject2.put("len", optInt4 - 1);
                                        }
                                        jSONArray3.put(optJSONObject2);
                                    }
                                    jSONObject2.put("mentions", jSONArray3);
                                    this.f90654R0.m95699p(jSONObject2.toString());
                                    this.f90654R0.m95697n();
                                }
                            }
                        } catch (Exception e12) {
                            AbstractC20110a.m104539h(e12);
                        }
                        i27++;
                    } else {
                        sb4.append(charAt3);
                    }
                }
                this.f90654R0.m95701r(sb4.toString());
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    /* renamed from: Qa */
    public void m94989Qa(C17979l1 c17979l1) {
        this.f90669W0 = c17979l1;
    }

    /* renamed from: R0 */
    public boolean m94990R0() {
        int i11 = this.f90614E;
        if (i11 == 15) {
            return false;
        }
        if (i11 != 24) {
            if (i11 == 26 || i11 == 35 || i11 == 45 || i11 == 20 || i11 == 21 || i11 == 29 || i11 == 30) {
                return false;
            }
            return true;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (!(c17969i0 instanceof C17967h1) || ((C17967h1) c17969i0).f91002b0 != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: R2 */
    public long m94991R2() {
        return this.f90765z;
    }

    /* renamed from: R3 */
    public String m94992R3() {
        return C2526d.f10270a.m12733y(mo95039W2());
    }

    /* renamed from: R4 */
    public C7908f m94993R4() {
        return this.f90647P;
    }

    /* renamed from: R5 */
    public AbstractC23214t.a m94994R5(String str, int i11, boolean z11, boolean z12, TextPaint textPaint) {
        AbstractC23214t.a aVar;
        AbstractC23214t.a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (z11) {
                aVar2 = m94816u1(this.f90736r2, i11, textPaint);
                if (aVar2 == null && (aVar = this.f90732q2) != null && !aVar.f112492k) {
                    aVar2 = m94816u1(aVar, i11, textPaint);
                }
                if (aVar2 == null) {
                    aVar2 = m94719U1(str, i11, true, z12, textPaint);
                }
                if (m94673Ib(aVar2)) {
                    this.f90736r2 = aVar2;
                }
            } else {
                aVar2 = m94816u1(this.f90732q2, i11, textPaint);
                if (aVar2 == null) {
                    aVar2 = m94719U1(str, i11, false, z12, textPaint);
                }
                if (m94673Ib(aVar2)) {
                    this.f90732q2 = aVar2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (aVar2 != null) {
            this.f90744t2 = aVar2.f112490i;
            this.f90740s2 = aVar2.f112491j;
        }
        return aVar2;
    }

    /* renamed from: R6 */
    public boolean m94995R6() {
        C7907e c7907e = this.f90657S0;
        if (c7907e != null && c7907e.m40860j()) {
            return true;
        }
        return false;
    }

    /* renamed from: R7 */
    public boolean m94996R7() {
        C28770b c28770b = this.f90747u1;
        if (c28770b != null && !c28770b.m143918k() && this.f90747u1.m143920m()) {
            return true;
        }
        return false;
    }

    /* renamed from: R9 */
    public void m94997R9(x xVar) {
        for (WeakReference weakReference : this.f90715l2) {
            if (weakReference.get() == xVar) {
                this.f90715l2.remove(weakReference);
                return;
            }
        }
    }

    /* renamed from: Ra */
    public void m94998Ra(boolean z11) {
        this.f90763y1 = z11;
    }

    /* renamed from: Rb */
    public void m94999Rb(InterfaceC19030d interfaceC19030d) {
        m94820ua(interfaceC19030d);
        this.f90738s0 = new C25496a();
        m94980Pb(C19028b.Companion.m100099a(C19028b.b.f94845r, false, false), false);
    }

    /* renamed from: S0 */
    public boolean m95000S0() {
        if (m95032V6()) {
            return false;
        }
        if (m95170j6()) {
            if (!m95208n8() && !m94960N7()) {
                return false;
            }
            return true;
        }
        if (!m95208n8() && !m94960N7() && !m94871D7() && !m95316z8() && !m95306y8()) {
            return false;
        }
        return true;
    }

    /* renamed from: S2 */
    public int m95001S2() {
        C17966h0 c17966h0 = this.f90689d0;
        if (c17966h0 != null) {
            return c17966h0.m95558h();
        }
        return 0;
    }

    /* renamed from: S3 */
    public C3541i m95002S3() {
        return this.f90632K;
    }

    /* renamed from: S4 */
    public int m95003S4() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 == null || !(c17969i0 instanceof C17990p0)) {
                return 0;
            }
            return ((C17990p0) c17969i0).f91125N;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: S5 */
    public AbstractC23214t.a m95004S5(String str, int i11) {
        AbstractC23214t.a m119616c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f90591I2 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f90591I2 = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
            f90591I2.setColor(AbstractC11531v0.m62143G3());
            f90591I2.setTextSize(AbstractC23136l9.m118742r(16.0f));
        }
        AbstractC23214t.a m94816u1 = m94816u1(this.f90732q2, i11, f90591I2);
        if (m94816u1 != null) {
            return m94816u1;
        }
        boolean equals = TextUtils.equals(str, AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_undo_sent_message));
        if (!equals || (m119616c = f90592J2) == null) {
            m119616c = AbstractC23214t.m119616c(str, f90591I2, i11, ChatRow.f57233h6, true, false, null, AbstractC11531v0.m62222Y2(), null, null, null, 0, 1.0f, 0.0f);
        }
        this.f90732q2 = m119616c;
        if (equals && m94673Ib(m119616c)) {
            f90592J2 = this.f90732q2;
        }
        return m119616c;
    }

    /* renamed from: S6 */
    public boolean m95005S6() {
        return this.f90725p == 3;
    }

    /* renamed from: S7 */
    public boolean m95006S7() {
        if (this.f90754w0.get() <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: S9 */
    public void m95007S9() {
        this.f90765z = AbstractC23306f.m120599M0().m103087c();
    }

    /* renamed from: Sa */
    public void m95008Sa(C26713e c26713e) {
        this.f90678Z0 = c26713e;
    }

    /* renamed from: T0 */
    public boolean m95009T0() {
        return !m95178k6();
    }

    /* renamed from: T1 */
    public void m95010T1(String str, boolean z11) {
        C31897e4 c31897e4;
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.f90622G1 = new C31897e4(new JSONObject(str), z11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                if (this.f90622G1 == null) {
                    c31897e4 = new C31897e4();
                } else {
                    return;
                }
            }
            if (this.f90622G1 == null) {
                c31897e4 = new C31897e4();
                this.f90622G1 = c31897e4;
            }
        } catch (Throwable th2) {
            if (this.f90622G1 == null) {
                this.f90622G1 = new C31897e4();
            }
            throw th2;
        }
    }

    /* renamed from: T3 */
    public C7907e m95011T3() {
        return this.f90657S0;
    }

    /* renamed from: T4 */
    public int m95012T4() {
        return this.f90766z0;
    }

    /* renamed from: T5 */
    public boolean m95013T5() {
        return this.f90614E == -101;
    }

    /* renamed from: T6 */
    public boolean m95014T6() {
        int i11 = this.f90725p;
        return i11 == 0 || i11 == 1 || i11 == 2;
    }

    /* renamed from: T7 */
    public boolean m95015T7() {
        return this.f90614E == 15;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* renamed from: Ta */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m95016Ta(int i11) {
        long j11;
        String str;
        String str2;
        this.f90626I = i11;
        if (i11 == 0) {
            if (m95072Z4() != null && !this.f90730q0 && !TextUtils.isEmpty(m94983Q3())) {
                C26232a.m134877a().m134880c(m95080a5(), m95072Z4().m126452c(), this.f90737s);
            }
            if (m94871D7() || (m95306y8() && !m95288w8())) {
                if (m94871D7()) {
                    C17969i0 c17969i0 = this.f90618F0;
                    if (c17969i0 instanceof C18009w0) {
                        j11 = ((C18009w0) c17969i0).m95768h();
                        if (j11 > 0) {
                            C23744a.m124114c().m124116d(71, this, Boolean.FALSE);
                        }
                    }
                }
                C17969i0 c17969i02 = this.f90618F0;
                if (c17969i02 instanceof C17961f1) {
                    j11 = ((C17961f1) c17969i02).m95477g();
                } else {
                    j11 = 0;
                }
                if (j11 > 0) {
                }
            }
            if (m95170j6() && this.f90631J1 != null) {
                if (m94847A6()) {
                    str = "2";
                } else {
                    str = "1";
                }
                String str3 = str;
                if (m94847A6()) {
                    str2 = this.f90737s;
                } else {
                    str2 = "";
                }
                C2544s.m12803r(this.f90737s, str2, "", -1, this.f90634K1, str3, this.f90631J1, this.f90729q.m41045i(), 0);
                return;
            }
            return;
        }
        if (i11 == 2 && m95072Z4() != null && !this.f90730q0 && !TextUtils.isEmpty(m94983Q3())) {
            C26232a.m134877a().m134881d(m95080a5(), m95072Z4().m126452c(), this.f90737s);
        }
    }

    /* renamed from: Tb */
    public void m95017Tb() {
        this.f90603B0 = EnumC19038l.f94904q;
        AbstractC23647d.m123897g("900098");
        m94980Pb(C19028b.Companion.m100099a(C19028b.b.f94844q, true, false), false);
    }

    /* renamed from: U0 */
    public boolean m95018U0() {
        C17979l1 c17979l1 = this.f90669W0;
        if (c17979l1 != null && c17979l1.m95621c() != null && this.f90669W0.m95621c().m154989d()) {
            return true;
        }
        return false;
    }

    /* renamed from: U3 */
    public String m95019U3() {
        return this.f90745u;
    }

    /* renamed from: U4 */
    public EnumC22425a m95020U4() {
        return this.f90599A0;
    }

    /* renamed from: U5 */
    public boolean m95021U5() {
        if (this.f90642N0 && m95029V3().m41047k() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U7 */
    public boolean m95022U7() {
        if (m94880E7()) {
            return true;
        }
        if (m95188l7() && !m94871D7()) {
            return true;
        }
        return false;
    }

    /* renamed from: U9 */
    public void m95023U9() {
        this.f90754w0.set(0);
        this.f90758x0 = 0;
        this.f90762y0 = 0;
    }

    /* renamed from: Ua */
    public void m95024Ua(boolean z11) {
        this.f90721n2 = z11;
    }

    /* renamed from: Ub */
    boolean m95025Ub(String str) {
        return m95036Vb(str, "");
    }

    /* renamed from: V0 */
    public boolean m95026V0() {
        if (m94960N7() && !m95188l7() && !m94880E7() && m95097c4() != EnumC27374a.f128966s) {
            return true;
        }
        return false;
    }

    /* renamed from: V1 */
    public C17945a0 m95027V1() {
        String m41044h;
        C31897e4 c31897e4 = this.f90622G1;
        if (c31897e4 != null && c31897e4.m153274o()) {
            m41044h = AbstractC23306f.m120599M0().m103086b();
        } else {
            m41044h = m95029V3().m41044h();
        }
        if (TextUtils.isEmpty(m41044h)) {
            m41044h = AbstractC23306f.m120599M0().m103086b();
        }
        w m95380p = new w(MessageId.m41036c(m41044h, "", this.f90737s, this.f90733r), this.f90614E).m95382r(this.f90745u).m95368d(this.f90618F0).m95351C(this.f90654R0).m95379o(this.f90761y).m95369e(this.f90681a1).m95385u(this.f90669W0).m95384t(this.f90675Y0).m95350B(this.f90672X0).m95383s(this.f90678Z0).m95381q(this.f90657S0).m95354F(this.f90610D).m95380p(this.f90632K);
        String m95090b5 = m95090b5();
        String m95131f5 = m95131f5();
        if ((!TextUtils.isEmpty(m95090b5) || !TextUtils.isEmpty(m95131f5)) && !m95234q7() && !m94696O7()) {
            m95380p.m95363O(m95090b5);
            m95380p.m95364P(m95131f5);
        }
        C17945a0 m95365a = m95380p.m95365a();
        m94951M9();
        return m95365a;
    }

    /* renamed from: V2 */
    String m95028V2() {
        return m95029V3().m41044h();
    }

    /* renamed from: V3 */
    public MessageId m95029V3() {
        return this.f90729q;
    }

    /* renamed from: V4 */
    public long m95030V4() {
        return this.f90650Q;
    }

    /* renamed from: V5 */
    public boolean m95031V5() {
        return this.f90614E == 29;
    }

    /* renamed from: V6 */
    public boolean m95032V6() {
        String str = this.f90733r;
        if (str != null && str.equals(CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* renamed from: V7 */
    public boolean m95033V7() {
        if (m94655E6()) {
            return false;
        }
        return m95022U7();
    }

    /* renamed from: V9 */
    public void m95034V9() {
        m95123e9();
        this.f90732q2 = null;
        this.f90736r2 = null;
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C17958e1) {
            ((C17958e1) c17969i0).m95419g();
        }
    }

    /* renamed from: Va */
    public void m95035Va(boolean z11) {
        this.f90724o2 = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0065, code lost:            if ((!r0) != false) goto L170;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0003, B:7:0x000a, B:9:0x0012, B:11:0x0018, B:15:0x0068, B:17:0x006c, B:19:0x0070, B:20:0x0072, B:22:0x0078, B:24:0x0080, B:25:0x0095, B:27:0x009d, B:29:0x00a1, B:31:0x0133, B:33:0x0137, B:35:0x0158, B:37:0x015d, B:38:0x015f, B:40:0x0163, B:42:0x0167, B:44:0x016d, B:45:0x0174, B:47:0x017c, B:48:0x037e, B:50:0x0389, B:51:0x03c4, B:52:0x0198, B:54:0x019d, B:56:0x01ab, B:58:0x01c4, B:59:0x01af, B:60:0x01d8, B:62:0x01de, B:64:0x01ec, B:66:0x0205, B:67:0x01f0, B:68:0x0219, B:70:0x021f, B:72:0x022d, B:74:0x0246, B:75:0x0231, B:76:0x025a, B:78:0x025f, B:80:0x0263, B:82:0x026d, B:84:0x0277, B:86:0x027d, B:88:0x0286, B:91:0x02a7, B:92:0x0294, B:93:0x0283, B:94:0x02bb, B:96:0x02c1, B:98:0x02d1, B:99:0x02ed, B:100:0x0309, B:102:0x030f, B:104:0x0319, B:106:0x0320, B:108:0x032a, B:109:0x0345, B:110:0x031d, B:111:0x035e, B:113:0x0364, B:115:0x0022, B:117:0x0028, B:120:0x002f, B:122:0x0035, B:125:0x0044, B:126:0x004e, B:128:0x0050, B:130:0x0056, B:132:0x005c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0003, B:7:0x000a, B:9:0x0012, B:11:0x0018, B:15:0x0068, B:17:0x006c, B:19:0x0070, B:20:0x0072, B:22:0x0078, B:24:0x0080, B:25:0x0095, B:27:0x009d, B:29:0x00a1, B:31:0x0133, B:33:0x0137, B:35:0x0158, B:37:0x015d, B:38:0x015f, B:40:0x0163, B:42:0x0167, B:44:0x016d, B:45:0x0174, B:47:0x017c, B:48:0x037e, B:50:0x0389, B:51:0x03c4, B:52:0x0198, B:54:0x019d, B:56:0x01ab, B:58:0x01c4, B:59:0x01af, B:60:0x01d8, B:62:0x01de, B:64:0x01ec, B:66:0x0205, B:67:0x01f0, B:68:0x0219, B:70:0x021f, B:72:0x022d, B:74:0x0246, B:75:0x0231, B:76:0x025a, B:78:0x025f, B:80:0x0263, B:82:0x026d, B:84:0x0277, B:86:0x027d, B:88:0x0286, B:91:0x02a7, B:92:0x0294, B:93:0x0283, B:94:0x02bb, B:96:0x02c1, B:98:0x02d1, B:99:0x02ed, B:100:0x0309, B:102:0x030f, B:104:0x0319, B:106:0x0320, B:108:0x032a, B:109:0x0345, B:110:0x031d, B:111:0x035e, B:113:0x0364, B:115:0x0022, B:117:0x0028, B:120:0x002f, B:122:0x0035, B:125:0x0044, B:126:0x004e, B:128:0x0050, B:130:0x0056, B:132:0x005c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0003, B:7:0x000a, B:9:0x0012, B:11:0x0018, B:15:0x0068, B:17:0x006c, B:19:0x0070, B:20:0x0072, B:22:0x0078, B:24:0x0080, B:25:0x0095, B:27:0x009d, B:29:0x00a1, B:31:0x0133, B:33:0x0137, B:35:0x0158, B:37:0x015d, B:38:0x015f, B:40:0x0163, B:42:0x0167, B:44:0x016d, B:45:0x0174, B:47:0x017c, B:48:0x037e, B:50:0x0389, B:51:0x03c4, B:52:0x0198, B:54:0x019d, B:56:0x01ab, B:58:0x01c4, B:59:0x01af, B:60:0x01d8, B:62:0x01de, B:64:0x01ec, B:66:0x0205, B:67:0x01f0, B:68:0x0219, B:70:0x021f, B:72:0x022d, B:74:0x0246, B:75:0x0231, B:76:0x025a, B:78:0x025f, B:80:0x0263, B:82:0x026d, B:84:0x0277, B:86:0x027d, B:88:0x0286, B:91:0x02a7, B:92:0x0294, B:93:0x0283, B:94:0x02bb, B:96:0x02c1, B:98:0x02d1, B:99:0x02ed, B:100:0x0309, B:102:0x030f, B:104:0x0319, B:106:0x0320, B:108:0x032a, B:109:0x0345, B:110:0x031d, B:111:0x035e, B:113:0x0364, B:115:0x0022, B:117:0x0028, B:120:0x002f, B:122:0x0035, B:125:0x0044, B:126:0x004e, B:128:0x0050, B:130:0x0056, B:132:0x005c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0003, B:7:0x000a, B:9:0x0012, B:11:0x0018, B:15:0x0068, B:17:0x006c, B:19:0x0070, B:20:0x0072, B:22:0x0078, B:24:0x0080, B:25:0x0095, B:27:0x009d, B:29:0x00a1, B:31:0x0133, B:33:0x0137, B:35:0x0158, B:37:0x015d, B:38:0x015f, B:40:0x0163, B:42:0x0167, B:44:0x016d, B:45:0x0174, B:47:0x017c, B:48:0x037e, B:50:0x0389, B:51:0x03c4, B:52:0x0198, B:54:0x019d, B:56:0x01ab, B:58:0x01c4, B:59:0x01af, B:60:0x01d8, B:62:0x01de, B:64:0x01ec, B:66:0x0205, B:67:0x01f0, B:68:0x0219, B:70:0x021f, B:72:0x022d, B:74:0x0246, B:75:0x0231, B:76:0x025a, B:78:0x025f, B:80:0x0263, B:82:0x026d, B:84:0x0277, B:86:0x027d, B:88:0x0286, B:91:0x02a7, B:92:0x0294, B:93:0x0283, B:94:0x02bb, B:96:0x02c1, B:98:0x02d1, B:99:0x02ed, B:100:0x0309, B:102:0x030f, B:104:0x0319, B:106:0x0320, B:108:0x032a, B:109:0x0345, B:110:0x031d, B:111:0x035e, B:113:0x0364, B:115:0x0022, B:117:0x0028, B:120:0x002f, B:122:0x0035, B:125:0x0044, B:126:0x004e, B:128:0x0050, B:130:0x0056, B:132:0x005c), top: B:2:0x0003 }] */
    /* renamed from: Vb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m95036Vb(String str, String str2) {
        boolean equals;
        EnumC25241h m94786o1;
        EnumC24229g enumC24229g;
        String str3;
        String m136747f;
        String m136747f2;
        String m136747f3;
        String m136747f4;
        try {
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (m94640B7()) {
            return false;
        }
        if (m94871D7()) {
            if (m95185l4() == 2 && !m94757g9()) {
                return true;
            }
            if (!this.f90680a0 && this.f90706i2) {
                this.f90706i2 = false;
            }
            if (m95072Z4() != null && !TextUtils.isEmpty(this.f90761y)) {
                C26232a.m134877a().m134879b(m95080a5(), m95072Z4().m126452c(), this.f90737s);
            }
            m94786o1 = m94786o1();
            if (m94786o1 == EnumC25241h.f121061r) {
                C32094r9 c32094r9 = this.f90734r0;
                if (c32094r9 != null) {
                    c32094r9.m154905o0(this.f90726p0.m130604u());
                    this.f90734r0.m154911s0(this.f90742t0 - this.f90726p0.m130607x());
                    this.f90734r0.m154907p0(this.f90726p0.m130605v());
                    this.f90734r0.m154913t0(this.f90726p0.m130606w());
                    this.f90734r0.m154891h0(this.f90726p0.m130603t());
                    this.f90734r0.m154893i0(this.f90726p0.m130602s());
                    this.f90734r0.m154873X(this.f90726p0.m130594k());
                    this.f90734r0.m154874Y(this.f90726p0.m130595l());
                    this.f90734r0.m154881c0(this.f90726p0.m130596m());
                    this.f90734r0.m154885e0(this.f90726p0.m130600q());
                    this.f90734r0.m154868S(this.f90726p0.m130593j());
                    this.f90734r0.m154864O(!this.f90726p0.m130572C());
                    this.f90734r0.m154921x0(this.f90726p0.m130571B());
                }
                return true;
            }
            if (m94786o1 == EnumC25241h.f121060q) {
                C26639b.m136739C("ChatPhoto: waiting for instant upload: " + this.f90761y + "; ownerId=" + this.f90737s);
                return false;
            }
            File file = null;
            if (m94786o1 == EnumC25241h.f121059p) {
                this.f90726p0 = null;
            }
            if (!this.f90680a0 && !this.f90706i2) {
                this.f90680a0 = true;
                if (this.f90689d0 == null) {
                    this.f90689d0 = new C17966h0(this);
                }
                this.f90722o0 = null;
                if (m95120e6()) {
                    this.f90722o0 = C24226d.m126397S(m95080a5(), EnumC24229g.f116991y, this.f90761y, "", str, m94869D4(), m95170j6());
                } else if (this.f90614E == 3) {
                    int m95080a5 = m95080a5();
                    EnumC24229g enumC24229g2 = EnumC24229g.f116983q;
                    String str4 = this.f90761y;
                    if (m94742b8()) {
                        m136747f4 = this.f90761y;
                    } else {
                        m136747f4 = C26639b.m136747f(this.f90761y, this.f90729q.m41044h(), m95072Z4(), m95170j6());
                    }
                    this.f90722o0 = C24226d.m126398T(m95080a5, enumC24229g2, str4, m136747f4, str, str2, m94869D4(), m95170j6());
                } else if (m94890F7()) {
                    int m95080a52 = m95080a5();
                    EnumC24229g enumC24229g3 = EnumC24229g.f116978Q;
                    String str5 = this.f90761y;
                    if (m94742b8()) {
                        m136747f3 = this.f90761y;
                    } else {
                        m136747f3 = C26639b.m136747f(this.f90761y, this.f90729q.m41044h(), m95072Z4(), m95170j6());
                    }
                    this.f90722o0 = C24226d.m126398T(m95080a52, enumC24229g3, str5, m136747f3, str, str2, m94869D4(), m95170j6());
                } else if (m95031V5()) {
                    int m95080a53 = m95080a5();
                    EnumC24229g enumC24229g4 = EnumC24229g.f116979R;
                    String str6 = this.f90761y;
                    if (m94742b8()) {
                        m136747f2 = this.f90761y;
                    } else {
                        m136747f2 = C26639b.m136747f(this.f90761y, this.f90729q.m41044h(), m95072Z4(), m95170j6());
                    }
                    this.f90722o0 = C24226d.m126398T(m95080a53, enumC24229g4, str6, m136747f2, str, str2, m94869D4(), m95170j6());
                } else if (this.f90614E == 4) {
                    C17969i0 c17969i0 = this.f90618F0;
                    if (c17969i0 != null) {
                        String mo95598f = c17969i0.mo95598f();
                        if (!TextUtils.isEmpty(mo95598f)) {
                            file = AbstractC23529b.m123576h(AbstractC3972e.m18812y(), mo95598f);
                        }
                    }
                    if (file != null && !m94742b8()) {
                        str3 = file.getPath();
                    } else {
                        str3 = this.f90761y;
                    }
                    String str7 = str3;
                    int m95080a54 = m95080a5();
                    EnumC24229g enumC24229g5 = EnumC24229g.f116984r;
                    if (m94742b8()) {
                        m136747f = str7;
                    } else {
                        m136747f = C26639b.m136747f(str7, this.f90729q.m41044h(), m95072Z4(), m95170j6());
                    }
                    this.f90722o0 = C24226d.m126398T(m95080a54, enumC24229g5, str7, m136747f, str, str2, m94869D4(), m95170j6());
                } else if (m95316z8()) {
                    if (!m94966O3().toLowerCase().equals("amr")) {
                        this.f90722o0 = C24226d.m126397S(m95080a5(), EnumC24229g.f116971J, this.f90761y, "", str, m94869D4(), m95170j6());
                    } else {
                        this.f90722o0 = C24226d.m126397S(m95080a5(), EnumC24229g.f116966E, this.f90761y, "", str, m94869D4(), m95170j6());
                    }
                } else if (m95306y8()) {
                    C17961f1 c17961f1 = (C17961f1) this.f90618F0;
                    if (m94870D6()) {
                        enumC24229g = EnumC24229g.f116976O;
                    } else {
                        enumC24229g = EnumC24229g.f116962A;
                    }
                    EnumC24229g enumC24229g6 = enumC24229g;
                    if (!TextUtils.isEmpty(c17961f1.m95483j())) {
                        this.f90722o0 = C24226d.m126397S(m95080a5(), enumC24229g6, c17961f1.m95483j(), "", str, m94869D4(), m95170j6());
                    } else {
                        this.f90722o0 = C24226d.m126397S(m95080a5(), enumC24229g6, this.f90761y, "", str, m94869D4(), m95170j6());
                    }
                } else if (m95276v6()) {
                    this.f90722o0 = C24226d.m126397S(m95080a5(), EnumC24229g.f116968G, this.f90761y, "", str, m94869D4(), m95170j6());
                }
                this.f90707j0 = new o();
                if (this.f90722o0 != null) {
                    C24559a.m127933c("[Message]", String.format("startUpload: %d, uploadID: %d", Long.valueOf(m95029V3().m41045i()), Integer.valueOf(this.f90722o0.m126521r())));
                    this.f90722o0.m126505h(this.f90707j0);
                    this.f90722o0.m126482B0(this.f90737s);
                    C24226d.m126402Z(this.f90722o0);
                } else {
                    m94824v5(C26638a.f126094a.m136734c());
                }
            }
            return false;
        }
        if (m94890F7()) {
            if (m95185l4() == 2) {
                return true;
            }
            if (!this.f90680a0) {
                this.f90706i2 = false;
            }
            if (m95072Z4() != null) {
                C26232a.m134877a().m134879b(m95080a5(), m95072Z4().m126452c(), this.f90737s);
            }
            m94786o1 = m94786o1();
            if (m94786o1 == EnumC25241h.f121061r) {
            }
        } else if (m95031V5()) {
            if (((C17955d1) this.f90618F0).f90888B.equals("0")) {
                return true;
            }
            equals = TextUtils.isEmpty(((C17955d1) this.f90618F0).f90891E);
        } else {
            if (!m95306y8() && !m95276v6()) {
                equals = "".equals(this.f90753w);
            }
            if (!this.f90680a0) {
            }
            if (m95072Z4() != null) {
            }
            m94786o1 = m94786o1();
            if (m94786o1 == EnumC25241h.f121061r) {
            }
        }
    }

    /* renamed from: W0 */
    public boolean m95037W0() {
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C17967h1) {
            return ((C17967h1) c17969i0).f90989O;
        }
        return false;
    }

    /* renamed from: W1 */
    public void m95038W1(String str, boolean z11) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (z11) {
                    this.f90661T1 = new C17988o1(new JSONObject(str));
                } else {
                    this.f90661T1 = new C17988o1(new JSONArray(str), this.f90729q.m41046j());
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // p511sw.InterfaceC26392a
    /* renamed from: W2 */
    public String mo95039W2() {
        return m95029V3().m41048l();
    }

    /* renamed from: W3 */
    public C17976k1 m95040W3() {
        return this.f90675Y0;
    }

    /* renamed from: W4 */
    public int m95041W4() {
        return this.f90614E;
    }

    /* renamed from: W5 */
    public boolean m95042W5() {
        String str;
        if (!m94977P7()) {
            return false;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 != null) {
            str = c17969i0.f91016u;
        } else {
            str = "";
        }
        if (!TextUtils.equals("recommened.calltime", str) && !TextUtils.equals("recommened.misscall", str)) {
            return false;
        }
        return true;
    }

    /* renamed from: W6 */
    public boolean m95043W6() {
        if (m95032V6() && !m95180k8()) {
            return true;
        }
        return false;
    }

    /* renamed from: W7 */
    public boolean m95044W7() {
        return this.f90706i2;
    }

    /* renamed from: W9 */
    public void m95045W9(C28770b c28770b) {
        if (this.f90747u1 == null) {
            this.f90747u1 = new C28770b();
        }
        this.f90747u1.m143917j(c28770b);
    }

    /* renamed from: Wa */
    public void m95046Wa(int i11) {
        this.f90620G = i11;
    }

    /* renamed from: Wb */
    public void m95047Wb(String str) {
        String str2;
        try {
            if (!m94640B7() && !(!this.f90749v.isEmpty()) && !this.f90683b0 && !this.f90706i2) {
                if (m95306y8()) {
                    C26639b.m136739C("start upload video thumb");
                } else if (m95276v6()) {
                    C26639b.m136739C("start upload file thumb");
                } else {
                    C26639b.m136739C("start upload link thumb");
                }
                this.f90683b0 = true;
                if (this.f90689d0 == null) {
                    this.f90689d0 = new C17966h0(this);
                }
                if (this.f90668W <= 0) {
                    this.f90668W = new Random().nextInt(Integer.MAX_VALUE);
                }
                String m94947M4 = m94947M4();
                if (m94960N7()) {
                    str2 = m94692N4();
                } else {
                    str2 = m94947M4;
                }
                this.f90719n0 = C24226d.m126397S(this.f90668W, EnumC24229g.f116980S, m94947M4, str2, str, m94869D4(), m95170j6());
                this.f90713l0 = new p();
                this.f90692e0 = 0;
                this.f90695f0 = false;
                if (!m95306y8() && !m95276v6() && !m94960N7()) {
                    this.f90719n0 = null;
                    m94808s5(new C20096c(502, AbstractC23161o1.m119318c(502, "")));
                    return;
                }
                C24559a.m127933c("[Message]", String.format("startUpload thumb: %d, uploadID: %d", Long.valueOf(m95029V3().m41045i()), Integer.valueOf(this.f90719n0.m126521r())));
                this.f90719n0.m126505h(this.f90713l0);
                this.f90719n0.m126482B0(this.f90737s);
                C24226d.m126402Z(this.f90719n0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104536e(e11);
        }
    }

    /* renamed from: X0 */
    public boolean m95048X0() {
        if (m95032V6() && m95099c7()) {
            if (m95171j8()) {
                return AbstractC19646n0.m102880B1(this);
            }
            return AbstractC19646n0.m102883C1(this);
        }
        return false;
    }

    /* renamed from: X1 */
    public void m95049X1() {
        C31897e4 c31897e4 = new C31897e4();
        this.f90622G1 = c31897e4;
        c31897e4.m153262b(this.f90737s);
    }

    /* renamed from: X2 */
    public C25496a m95050X2() {
        return this.f90738s0;
    }

    /* renamed from: X3 */
    public C17979l1 m95051X3() {
        return this.f90669W0;
    }

    /* renamed from: X4 */
    public C7940a m95052X4() {
        return this.f90624H0;
    }

    /* renamed from: X5 */
    public boolean m95053X5() {
        if (this.f90630J0 && System.currentTimeMillis() - this.f90633K0 <= f90588F2) {
            return true;
        }
        return false;
    }

    /* renamed from: X6 */
    public boolean m95054X6() {
        if (m95032V6() && !m95180k8() && this.f90626I == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: X7 */
    public boolean m95055X7() {
        if (!m95044W7() && !m95242r8() && !m94907H6() && !m95252s8() && !m95151h6()) {
            return false;
        }
        return true;
    }

    /* renamed from: X9 */
    public void m95056X9(String str, String str2, boolean z11, boolean z12, SensitiveData sensitiveData) {
        m94735Z9(str, str2, true, z11, z12, sensitiveData);
    }

    /* renamed from: Xa */
    public void m95057Xa(long j11) {
        this.f90714l1 = j11;
    }

    /* renamed from: Xb */
    public void m95058Xb(boolean z11, boolean z12, InterfaceC20098e interfaceC20098e) {
        try {
            if (m94640B7()) {
                return;
            }
            this.f90730q0 = true;
            if (!"".equals(this.f90753w)) {
                return;
            }
            if (!this.f90680a0 && this.f90761y != null) {
                this.f90680a0 = true;
                this.f90704i0 = new k(interfaceC20098e);
                if (m95316z8()) {
                    C2775d c2775d = new C2775d(m95080a5(), 0L, z12);
                    this.f90716m0 = c2775d;
                    c2775d.m13379h(this.f90704i0);
                    this.f90716m0.m13381j(this.f90737s, z11, m94966O3().toLowerCase());
                } else {
                    this.f90704i0.mo2128a(C26638a.f126094a.m136734c());
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Y1 */
    public void m95059Y1() {
        try {
            if (this.f90618F0 instanceof C17961f1) {
                File file = new File(((C17961f1) this.f90618F0).m95483j());
                if (file.exists() && file.length() == 0) {
                    file.delete();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Y2 */
    public String m95060Y2() {
        C31973j5 c31973j5;
        try {
            ContactProfile contactProfile = new ContactProfile(this.f90737s);
            if (contactProfile.m40374K0()) {
                String[] split = contactProfile.f42434r.split("_");
                if (split != null && split.length > 0) {
                    c31973j5 = C0943w.f3447a.m4472f(split[split.length - 1]);
                } else {
                    c31973j5 = null;
                }
                if (c31973j5 == null || TextUtils.isEmpty(c31973j5.m153793y())) {
                    return "";
                }
                return MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_owner_info_group, c31973j5.m153793y());
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f90737s);
            if (m141809c == null || TextUtils.isEmpty(m141809c.f42437s)) {
                return "";
            }
            return MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_owner_info, m141809c.m40383Q(true, false));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: Y3 */
    public String m95061Y3() {
        return this.f90729q + "_" + this.f90614E;
    }

    /* renamed from: Y4 */
    public C2775d m95062Y4() {
        return this.f90716m0;
    }

    /* renamed from: Y5 */
    public boolean m95063Y5() {
        if (!m94871D7() && !m95120e6() && !m95306y8() && !m95276v6() && !m95316z8()) {
            return false;
        }
        return true;
    }

    /* renamed from: Y6 */
    public boolean m95064Y6() {
        return this.f90763y1;
    }

    /* renamed from: Y7 */
    public boolean m95065Y7() {
        if (m95089b4() != 3 && m95089b4() != 4 && m95089b4() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: Ya */
    public void m95066Ya(String str) {
        this.f90737s = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* renamed from: Yb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m95067Yb() {
        String m40383Q;
        String str;
        boolean z11;
        VideoMessageParams videoMessageParams;
        boolean z12;
        boolean z13;
        C32094r9 c32094r9;
        if (this.f90645O0) {
            return;
        }
        boolean z14 = true;
        AbstractC20110a.m104543l("[Message]").mo104556o(8, "VideoCompress startVideoBlendService %s", m95029V3().m41044h());
        this.f90602B = C23793c.m124316k().mo124319c();
        C17961f1 c17961f1 = (C17961f1) this.f90618F0;
        VideoBlendingParam m95504u = c17961f1.m95504u();
        if (!TextUtils.isEmpty(this.f90761y) && AbstractC23041d2.m118194A(this.f90761y)) {
            this.f90645O0 = true;
            ContactProfile m103046y0 = AbstractC19646n0.m103046y0(this);
            String str2 = this.f90737s;
            if (m103046y0 == null) {
                m40383Q = "";
            } else {
                m40383Q = m103046y0.m40383Q(true, false);
            }
            if (m103046y0 == null) {
                str = "";
            } else {
                str = m103046y0.f42446v;
            }
            VideoMessageParams videoMessageParams2 = new VideoMessageParams(str2, m40383Q, str, m95029V3().m41045i());
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                if (C21927m.m114302u().m114345m(this.f90737s)) {
                    z11 = true;
                    boolean m95465S = c17961f1.m95465S();
                    if (m95504u == null) {
                        m95504u = new VideoBlendingParam();
                        m95504u.f48277q = m94983Q3();
                        m95504u.f48280t = "";
                        m95504u.f48258J = true;
                        m95504u.f48260L = true;
                        m95504u.f48250B = c17961f1.m95452F();
                        m95504u.f48274Z = AbstractC26689j.m137106o(m95465S ? 1 : 0);
                        m95504u.f48275a0 = AbstractC26689j.m137088O(m95465S ? 1 : 0);
                        m95504u.f48284x = m95504u.f48274Z.m40328a();
                    }
                    m95504u.f48282v = c17961f1.m95456J();
                    m95504u.f48283w = c17961f1.m95514z();
                    m95504u.f48285y = AbstractC26689j.m137083J(m95465S ? 1 : 0);
                    m95504u.f48286z = AbstractC26689j.m137107p(m95465S ? 1 : 0);
                    m95504u.f48249A = AbstractC26689j.m137077D(m95465S ? 1 : 0);
                    m95504u.f48255G = (int) c17961f1.m95508w();
                    m95504u.f48256H = c17961f1.m95455I();
                    m95504u.f48257I = c17961f1.m95463Q();
                    if (z11) {
                        videoMessageParams = videoMessageParams2;
                    } else {
                        videoMessageParams = null;
                    }
                    C7760a.f41634a.mo39564b(videoMessageParams2.f48290s, AbstractC20130d.m104828E0(), m95504u, this.f90712k2, 0, videoMessageParams);
                    if (m95504u.f48264P != 0 && m95504u.f48265Q == 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    boolean z15 = m95504u.f48258J;
                    if (!m95504u.f48260L && !m95504u.f48259K) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 || (!z15 && !z13)) {
                        z14 = false;
                    }
                    c17961f1.m95478g0(z14);
                    c32094r9 = this.f90734r0;
                    if (c32094r9 != null) {
                        c32094r9.m154881c0(AbstractC23041d2.m118224w(this.f90761y));
                    }
                    m94680K5();
                    return;
                }
            }
            z11 = false;
            boolean m95465S2 = c17961f1.m95465S();
            if (m95504u == null) {
            }
            m95504u.f48282v = c17961f1.m95456J();
            m95504u.f48283w = c17961f1.m95514z();
            m95504u.f48285y = AbstractC26689j.m137083J(m95465S2 ? 1 : 0);
            m95504u.f48286z = AbstractC26689j.m137107p(m95465S2 ? 1 : 0);
            m95504u.f48249A = AbstractC26689j.m137077D(m95465S2 ? 1 : 0);
            m95504u.f48255G = (int) c17961f1.m95508w();
            m95504u.f48256H = c17961f1.m95455I();
            m95504u.f48257I = c17961f1.m95463Q();
            if (z11) {
            }
            C7760a.f41634a.mo39564b(videoMessageParams2.f48290s, AbstractC20130d.m104828E0(), m95504u, this.f90712k2, 0, videoMessageParams);
            if (m95504u.f48264P != 0) {
            }
            z12 = true;
            boolean z152 = m95504u.f48258J;
            if (!m95504u.f48260L) {
            }
            z13 = false;
            if (!z12) {
            }
            z14 = false;
            c17961f1.m95478g0(z14);
            c32094r9 = this.f90734r0;
            if (c32094r9 != null) {
            }
            m94680K5();
            return;
        }
        m94805rb();
    }

    /* renamed from: Z0 */
    public void m95068Z0() {
        m94737a1(true, true, true, true);
    }

    /* renamed from: Z1 */
    public void m95069Z1() {
        if (m95054X6()) {
            C0810d.m2053b(new r());
        }
    }

    /* renamed from: Z2 */
    public long m95070Z2() {
        return this.f90616E1;
    }

    /* renamed from: Z3 */
    public C26713e m95071Z3() {
        return this.f90678Z0;
    }

    /* renamed from: Z4 */
    public EnumC24229g m95072Z4() {
        if (m95120e6()) {
            return EnumC24229g.f116991y;
        }
        if (m95041W4() == 3) {
            return EnumC24229g.f116983q;
        }
        if (m94890F7()) {
            return EnumC24229g.f116978Q;
        }
        if (m95031V5()) {
            return EnumC24229g.f116979R;
        }
        if (m95041W4() == 4) {
            return EnumC24229g.f116984r;
        }
        if (m95316z8()) {
            if (m94966O3().toLowerCase().equals("amr")) {
                return EnumC24229g.f116966E;
            }
            return EnumC24229g.f116971J;
        }
        if (m94870D6()) {
            return EnumC24229g.f116976O;
        }
        if (m95306y8()) {
            return EnumC24229g.f116962A;
        }
        if (m95276v6()) {
            return EnumC24229g.f116968G;
        }
        return null;
    }

    /* renamed from: Z5 */
    public boolean m95073Z5() {
        return this.f90645O0;
    }

    /* renamed from: Z6 */
    public boolean m95074Z6() {
        String str;
        if (m94977P7()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null) {
                str = c17969i0.f91016u;
            } else {
                str = "";
            }
            return TextUtils.equals("recommened.misscall", str);
        }
        return false;
    }

    /* renamed from: Z7 */
    public boolean m95075Z7() {
        if (!m95043W6()) {
            return true;
        }
        if (m95089b4() != 1 && m95089b4() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Za */
    public void m95076Za(int i11) {
        this.f90725p = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x000c, B:7:0x001e, B:9:0x0024, B:11:0x0036, B:13:0x0048, B:18:0x0050, B:20:0x0056, B:22:0x008d, B:24:0x009f, B:29:0x0016), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x000c, B:7:0x001e, B:9:0x0024, B:11:0x0036, B:13:0x0048, B:18:0x0050, B:20:0x0056, B:22:0x008d, B:24:0x009f, B:29:0x0016), top: B:1:0x0000 }] */
    /* renamed from: Zb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m95077Zb() {
        try {
            String m95061Y3 = m95061Y3();
            C28719g c28719g = C28719g.f133214a;
            if (!c28719g.m143845u(m95061Y3)) {
                if (c28719g.m143844t(m95061Y3)) {
                }
                if (!m95316z8()) {
                    if (Objects.equals(C7853b.m40052a0().m40103Q(), m94983Q3()) && Objects.equals(m95029V3(), C7853b.m40052a0().m40122c0())) {
                        C7853b.m40052a0().m40136j1();
                        return;
                    }
                    return;
                }
                if (m95110d8()) {
                    if (Objects.equals(C7853b.m40052a0().m40103Q(), C28644j.m143233Y().m143290W(((C17949b1) this.f90618F0).m95397g().m132429g() + "").m132435m()) && Objects.equals(m95029V3(), C7853b.m40052a0().m40122c0())) {
                        C7853b.m40052a0().m40136j1();
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: dj.d
                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.m94724V8();
                }
            });
            if (!m95316z8()) {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: a2 */
    public void m95078a2(boolean z11, boolean z12) {
        if (AbstractC23143m5.m118819g(this.f90745u)) {
            C32204z7.m155260j().m155275v(this.f90745u, new C32204z7.i() { // from class: dj.l

                /* renamed from: b */
                public final /* synthetic */ boolean f91051b;

                /* renamed from: c */
                public final /* synthetic */ boolean f91052c;

                public /* synthetic */ C17977l(boolean z112, boolean z122) {
                    r2 = z112;
                    r3 = z122;
                }

                @Override // p716zh.C32204z7.i
                /* renamed from: a */
                public final void mo95617a(ArrayList arrayList) {
                    C17945a0.this.m94681K8(r2, r3, arrayList);
                }
            });
        }
    }

    /* renamed from: a3 */
    public int m95079a3() {
        return this.f90612D1;
    }

    /* renamed from: a5 */
    public int m95080a5() {
        if (m94871D7() && m95185l4() == 1) {
            if (this.f90671X <= 0) {
                this.f90671X = new Random().nextInt(Integer.MAX_VALUE);
            }
            return this.f90671X;
        }
        if (this.f90665V <= 0) {
            this.f90665V = new Random().nextInt(Integer.MAX_VALUE);
        }
        return this.f90665V;
    }

    /* renamed from: a6 */
    public boolean m95081a6() {
        return this.f90717m1 == 1;
    }

    /* renamed from: a7 */
    public boolean m95082a7() {
        String str;
        if (!m94977P7()) {
            return false;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 != null) {
            str = c17969i0.f91016u;
        } else {
            str = "";
        }
        if (!TextUtils.equals("recommened.misscall", str)) {
            return false;
        }
        C17969i0 c17969i02 = this.f90618F0;
        if (!(c17969i02 instanceof C18013y0) || ((C18013y0) c17969i02).f91252C.f91042e) {
            return false;
        }
        return true;
    }

    /* renamed from: a8 */
    public boolean m95083a8() {
        return this.f90723o1 == 0;
    }

    /* renamed from: aa */
    public void m95084aa(boolean z11, SensitiveData sensitiveData) {
        C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.j

            /* renamed from: q */
            public final /* synthetic */ boolean f91032q;

            /* renamed from: r */
            public final /* synthetic */ SensitiveData f91033r;

            public /* synthetic */ RunnableC17971j(boolean z112, SensitiveData sensitiveData2) {
                r2 = z112;
                r3 = sensitiveData2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17945a0.this.m94716T8(r2, r3);
            }
        }));
    }

    /* renamed from: ab */
    public void m95085ab(String str) {
        this.f90705i1 = str;
    }

    @Override // l30.C22033k0.h
    /* renamed from: b */
    public String mo17216b() {
        C32123ta c32123ta;
        C17994q1 c17994q1 = this.f90672X0;
        if (c17994q1 != null && (c32123ta = c17994q1.f91142d) != null) {
            return c32123ta.f148136g;
        }
        return "";
    }

    /* renamed from: b1 */
    public void m95086b1() {
        if (this.f90706i2) {
            this.f90706i2 = false;
            C29628e.m147249E0().m93379G(m95029V3().m41045i());
        }
    }

    /* renamed from: b2 */
    public void m95087b2() {
        C17979l1 c17979l1;
        if (m95208n8() && (c17979l1 = this.f90669W0) != null && c17979l1.f91068k == EnumC27374a.f128964q) {
            EnumC27374a m153546l = C31944h6.m153546l(this.f90745u);
            if (m153546l != EnumC27374a.f128968u && m153546l != EnumC27374a.f128967t) {
                this.f90669W0.f91068k = EnumC27374a.f128965r;
            } else {
                this.f90669W0.f91068k = m153546l;
                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            }
            C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.x
                public /* synthetic */ RunnableC18010x() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.this.m94685L8();
                }
            }));
        }
    }

    /* renamed from: b3 */
    public String m95088b3(Boolean bool) {
        String m95283w2;
        String m94749d5 = m94749d5();
        if (m94871D7()) {
            return m95176k4(m94749d5);
        }
        if (m95306y8()) {
            if (!bool.booleanValue() && m94916I6()) {
                return m94756g5(m94749d5);
            }
            return m95169j5(m94749d5);
        }
        if (m95276v6()) {
            if (!bool.booleanValue() && m94916I6()) {
                m95283w2 = m94787o3();
            } else {
                m95283w2 = m95283w2(false, true);
            }
            return AbstractC32201z4.m155241b(m95029V3().m41045i(), m95283w2);
        }
        if (m95314z6()) {
            return m94837y3(m94749d5);
        }
        if (m95031V5()) {
            return C20131e.f99303a.m104953g() + ((C17955d1) this.f90618F0).m95414g();
        }
        if (m95316z8()) {
            return AbstractC32201z4.m155241b(m95029V3().m41045i(), m94783n5(m94749d5));
        }
        if (m95120e6()) {
            return AbstractC20130d.m104871f0() + AbstractC23352g.m122788d(m94749d5) + AbstractC23041d2.m118220s(m94749d5);
        }
        if (m94960N7()) {
            return m94692N4();
        }
        return AbstractC20130d.m104823C() + AbstractC23352g.m122788d(m94749d5) + AbstractC23041d2.m118220s(m94749d5);
    }

    /* renamed from: b4 */
    public int m95089b4() {
        if (m95032V6()) {
            int i11 = this.f90626I;
            if (i11 == 2 || i11 == 3) {
                if (m94847A6()) {
                    if (((C2780e.b) AbstractC23306f.m120649c0().m101509a(new C2780e.a(m94853B3(), m95029V3()))).m13396a().size() > 0) {
                        return 4;
                    }
                } else if (AbstractC23306f.m120606O1().m102759P(this)) {
                    return 4;
                }
            }
            if (this.f90626I == 2) {
                if (m94847A6()) {
                    if (((C2779d.b) AbstractC23306f.m120645b0().m101509a(new C2779d.a(m94853B3(), m95029V3()))).m13392a().size() > 0) {
                        return 3;
                    }
                } else if (AbstractC23306f.m120606O1().m102754L(this)) {
                    return 3;
                }
            }
        }
        return this.f90626I;
    }

    /* renamed from: b5 */
    public String m95090b5() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null && !TextUtils.isEmpty(c17969i0.f91014s)) {
                return this.f90618F0.f91014s;
            }
            return this.f90753w;
        } catch (Exception e11) {
            e11.printStackTrace();
            return this.f90753w;
        }
    }

    /* renamed from: b6 */
    public boolean m95091b6() {
        return this.f90614E == 33;
    }

    /* renamed from: b7 */
    public boolean m95092b7() {
        if (m95180k8() && m95032V6() && m95005S6()) {
            return true;
        }
        return false;
    }

    /* renamed from: ba */
    public void m95093ba(String str, String str2, boolean z11, boolean z12, SensitiveData sensitiveData) {
        m94735Z9(str, str2, false, z11, z12, sensitiveData);
    }

    /* renamed from: bb */
    public void m95094bb(int i11) {
        this.f90691d2 = i11;
    }

    /* renamed from: bc */
    public JSONObject m95095bc() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg", this.f90745u);
            jSONObject.put("id", m95029V3().m41046j());
            jSONObject.put("uid", this.f90737s);
            jSONObject.put("senderName", this.f90610D);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f90614E);
            jSONObject.put("notifyTTL", this.f90714l1);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // l30.C22033k0.h
    /* renamed from: c */
    public String mo17217c() {
        C32123ta c32123ta;
        ContactProfile m141809c;
        C17994q1 c17994q1 = this.f90672X0;
        if (c17994q1 != null && (c32123ta = c17994q1.f91142d) != null && (m141809c = C28203u6.f131407a.m141809c(c32123ta.f148136g)) != null) {
            return AbstractC21935u.m114542i(m141809c.f42434r, m141809c.f42437s);
        }
        return "";
    }

    /* renamed from: c1 */
    public void m95096c1() {
        C17966h0 c17966h0 = this.f90689d0;
        if (c17966h0 != null) {
            c17966h0.m95562n();
        }
        C2775d c2775d = this.f90716m0;
        if (c2775d != null) {
            c2775d.m13375d();
        }
        C24230h c24230h = this.f90722o0;
        if (c24230h != null) {
            C24226d.m126388J(c24230h);
        }
        this.f90716m0 = null;
        this.f90704i0 = null;
        this.f90707j0 = null;
        this.f90680a0 = false;
        m95105d1();
        m95115e1();
    }

    /* renamed from: c4 */
    public EnumC27374a m95097c4() {
        C17979l1 c17979l1 = this.f90669W0;
        if (c17979l1 != null) {
            return c17979l1.f91068k;
        }
        return EnumC27374a.f128964q;
    }

    /* renamed from: c6 */
    public boolean m95098c6() {
        return this.f90636L0;
    }

    /* renamed from: c7 */
    public boolean m95099c7() {
        if (m95277v7() && this.f90626I != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c8 */
    public boolean m95100c8() {
        boolean z11;
        boolean z12;
        if (m95110d8() && (this.f90618F0 instanceof C17949b1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m95219o8() || m95091b6()) {
            C17969i0 c17969i0 = this.f90618F0;
            if ((c17969i0 instanceof C17958e1) && ((C17958e1) c17969i0).m95425n() == 10) {
                z12 = true;
                if (z11 && !z12) {
                    return false;
                }
                return true;
            }
        }
        z12 = false;
        if (z11) {
        }
        return true;
    }

    /* renamed from: c9 */
    public boolean m95101c9(C17945a0 c17945a0, boolean z11) {
        if (m95178k6() && !m95219o8() && !m95091b6() && !m95098c6()) {
            if (!c17945a0.m95178k6()) {
                this.f90614E = c17945a0.f90614E;
                this.f90626I = c17945a0.f90626I;
                this.f90629J = c17945a0.f90629J;
                this.f90745u = c17945a0.f90745u;
                this.f90618F0 = c17945a0.f90618F0;
                this.f90654R0 = c17945a0.f90654R0;
                this.f90672X0 = c17945a0.f90672X0;
                this.f90678Z0 = c17945a0.f90678Z0;
                this.f90669W0 = c17945a0.f90669W0;
                this.f90657S0 = c17945a0.f90657S0;
                this.f90632K = c17945a0.f90632K;
                this.f90622G1 = c17945a0.f90622G1;
                this.f90717m1 = 0;
                if (m95133f7()) {
                    m95264ta(2);
                } else {
                    m95264ta(0);
                }
                if (z11) {
                    C23288a.f113033a.mo13474a(new C18427b(mo95039W2(), 5, new Runnable() { // from class: dj.o
                        public /* synthetic */ RunnableC17986o() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C17945a0.this.m94690M8();
                        }
                    }));
                }
                return true;
            }
            if (this.f90614E != 52) {
                this.f90614E = 52;
                this.f90745u = c17945a0.f90745u;
                this.f90622G1 = c17945a0.f90622G1;
                C23288a.f113033a.mo13474a(new C18427b(mo95039W2(), 5, new Runnable() { // from class: dj.p
                    public /* synthetic */ RunnableC17989p() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17945a0.this.m94693N8();
                    }
                }));
                C23744a.m124114c().m124116d(4, this.f90737s);
            }
        }
        return false;
    }

    /* renamed from: ca */
    public void m95102ca(int i11, String str, Boolean bool) {
        C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.a

            /* renamed from: q */
            public final /* synthetic */ int f90584q;

            /* renamed from: r */
            public final /* synthetic */ String f90585r;

            /* renamed from: s */
            public final /* synthetic */ Boolean f90586s;

            public /* synthetic */ RunnableC17944a(int i112, String str2, Boolean bool2) {
                r2 = i112;
                r3 = str2;
                r4 = bool2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17945a0.this.m94722U8(r2, r3, r4);
            }
        }));
    }

    /* renamed from: cb */
    public void m95103cb(C17994q1 c17994q1) {
        this.f90672X0 = c17994q1;
    }

    /* renamed from: cc */
    public String m95104cc() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChatContent{msgID=");
        sb2.append(this.f90729q);
        sb2.append(", type=");
        sb2.append(this.f90614E);
        String str3 = "";
        if (m94983Q3().isEmpty()) {
            str = "";
        } else {
            str = ", localPath='" + m94983Q3() + '\'';
        }
        sb2.append(str);
        if (m94947M4().isEmpty()) {
            str2 = "";
        } else {
            str2 = ", thumbLocalPath='" + m94947M4() + '\'';
        }
        sb2.append(str2);
        if (!m94945M2().isEmpty()) {
            str3 = ", compressedVideoPath='" + m94945M2() + '\'';
        }
        sb2.append(str3);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // l30.C22033k0.h
    /* renamed from: d */
    public String mo17218d() {
        C32123ta c32123ta;
        C17994q1 c17994q1 = this.f90672X0;
        if (c17994q1 != null && (c32123ta = c17994q1.f91142d) != null) {
            return c32123ta.f148138h;
        }
        return "";
    }

    /* renamed from: d1 */
    public void m95105d1() {
        C17966h0 c17966h0 = this.f90689d0;
        if (c17966h0 != null) {
            c17966h0.m95563o();
        }
        this.f90683b0 = false;
        C24230h c24230h = this.f90719n0;
        if (c24230h != null) {
            C24226d.m126388J(c24230h);
        }
        this.f90719n0 = null;
        this.f90713l0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:            if (r5 == false) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:            if (r14 == false) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:            com.zing.zalo.p077ui.widget.FileDownloadBannerView.f69220v = r12;        p363nh.C23744a.m124114c().m124116d(89, r12.f90737s, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:            if (r12.f90603B0 != p164fn.EnumC19038l.f94904q) goto L111;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:            r12.f90603B0 = p164fn.EnumC19038l.f94905r;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:            if (r13 == false) goto L105;     */
    /* renamed from: d2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m95106d2(boolean z11, boolean z12) {
        String str;
        boolean z13;
        boolean z14;
        boolean z15;
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C17990p0) {
            C17990p0 c17990p0 = (C17990p0) c17969i0;
            String str2 = c17990p0.f91115D;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c17990p0.m95667h());
            if (!str2.isEmpty()) {
                str = "." + str2;
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            if (!AbstractC31990k7.m154226g(str2) && !AbstractC31990k7.m154225f(str2)) {
                z13 = false;
            } else {
                z13 = true;
            }
            boolean m154228i = AbstractC31990k7.m154228i(str2);
            if (TextUtils.isEmpty(c17990p0.f91013r) && TextUtils.isEmpty(c17990p0.f91116E)) {
                z14 = false;
            } else {
                z14 = true;
            }
            if ((z13 || m154228i) && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f90752v2) {
                this.f90752v2 = false;
                if (z14 && z13) {
                    m95056X9(m94983Q3(), sb3, true, false, new SensitiveData("gallery_save_photo_detail", "photo_download"));
                } else if (z14 && m154228i) {
                    m95093ba(m94983Q3(), sb3, true, false, new SensitiveData("gallery_save_video_detail", "video_download"));
                } else if (!AbstractC23254w8.m119859g(m94983Q3())) {
                    String m120300L = AbstractC23280z4.m120300L(m94983Q3(), sb3, true, null);
                    if (AbstractC23254w8.m119859g(m120300L)) {
                        m120300L = new C20556f(m120300L).m106843p();
                    }
                    if (m120300L != null && !m120300L.isEmpty()) {
                        ToastUtils.showMess(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_message_download_finished), m120300L));
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_notification_download_complete));
                    }
                } else {
                    ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_notification_download_complete));
                }
            }
        }
    }

    /* renamed from: d3 */
    public int m95107d3() {
        return this.f90629J;
    }

    /* renamed from: d4 */
    public int m95108d4() {
        return this.f90723o1;
    }

    /* renamed from: d6 */
    public boolean m95109d6() {
        return this.f90614E == 45;
    }

    /* renamed from: d8 */
    public boolean m95110d8() {
        return this.f90614E == 10;
    }

    /* renamed from: d9 */
    public void m95111d9() {
        m95024Ua(true);
        m95035Va(true);
    }

    /* renamed from: da */
    public void m95112da() {
        try {
            if (!this.f90706i2 && !m95219o8() && m95089b4() == 1) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a());
                this.f90706i2 = true;
                c0766k.mo1421E8(this.f90737s, this, this.f90693e1);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f90706i2 = false;
        }
    }

    /* renamed from: db */
    public void m95113db(C17997r1 c17997r1) {
        this.f90654R0 = c17997r1;
    }

    /* renamed from: dc */
    public void m95114dc(String str) {
        C7956b.m41474B().m41569z0(this, str);
    }

    @Override // l30.C22033k0.h
    /* renamed from: e */
    public void mo17219e(boolean z11) {
        this.f90639M0 = z11;
    }

    /* renamed from: e1 */
    public void m95115e1() {
        this.f90648P0 = false;
        this.f90645O0 = false;
        C7760a.f41634a.mo39563a(m95029V3().m41045i());
    }

    /* renamed from: e2 */
    public void m95116e2(boolean z11) {
        try {
            if (!this.f90715l2.isEmpty()) {
                Iterator it = this.f90715l2.iterator();
                while (it.hasNext()) {
                    x xVar = (x) ((WeakReference) it.next()).get();
                    if (xVar != null) {
                        xVar.mo61269H(m95029V3(), z11);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e3 */
    public String m95117e3() {
        return this.f90608C1;
    }

    /* renamed from: e4 */
    public int m95118e4() {
        return this.f90620G;
    }

    /* renamed from: e5 */
    public String m95119e5() {
        return this.f90757x;
    }

    /* renamed from: e6 */
    public boolean m95120e6() {
        return this.f90614E == 2;
    }

    /* renamed from: e7 */
    public boolean m95121e7() {
        if ((m95032V6() && !m95180k8() && m95199m7()) || this.f90629J == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: e8 */
    public boolean m95122e8() {
        return this.f90614E == 35;
    }

    /* renamed from: e9 */
    public void m95123e9() {
        this.f90718m2 = true;
        this.f90728p2 = null;
        m95111d9();
    }

    /* renamed from: eb */
    public void m95124eb(C17970i1 c17970i1) {
        this.f90611D0 = c17970i1;
    }

    /* renamed from: ec */
    public void m95125ec(String str) {
        C7956b.m41474B().m41501A0(this, str);
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof C17945a0) || !this.f90729q.equals(((C17945a0) obj).f90729q))) {
            return false;
        }
        return true;
    }

    @Override // p511sw.InterfaceC26396e
    /* renamed from: f */
    public int mo95126f() {
        if (!m94969O6()) {
            return 0;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C18009w0) {
            return ((C18009w0) c17969i0).m95779n();
        }
        if (c17969i0 instanceof C17961f1) {
            return ((C17961f1) c17969i0).m95489m();
        }
        if (!(c17969i0 instanceof C17958e1)) {
            return 0;
        }
        return ((C17958e1) c17969i0).m95423l();
    }

    /* renamed from: f1 */
    public Boolean m95127f1() {
        if (!AbstractC20631e.Companion.m107517t(this.f90608C1)) {
            return Boolean.FALSE;
        }
        m94737a1(true, true, true, true);
        return Boolean.TRUE;
    }

    /* renamed from: f2 */
    public void m95128f2(int i11) {
        try {
            if (!this.f90715l2.isEmpty()) {
                Iterator it = this.f90715l2.iterator();
                while (it.hasNext()) {
                    x xVar = (x) ((WeakReference) it.next()).get();
                    if (xVar != null) {
                        xVar.mo61268G(i11, m95029V3());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f3 */
    public long m95129f3() {
        return this.f90751v1;
    }

    /* renamed from: f4 */
    public String m95130f4() {
        return this.f90708j1;
    }

    /* renamed from: f5 */
    public String m95131f5() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null && !TextUtils.isEmpty(c17969i0.f91013r)) {
                return this.f90618F0.f91013r;
            }
            return this.f90749v;
        } catch (Exception e11) {
            e11.printStackTrace();
            return this.f90749v;
        }
    }

    /* renamed from: f6 */
    public boolean m95132f6() {
        int i11 = this.f90629J;
        return i11 == 3 || i11 == 6 || i11 == 7;
    }

    /* renamed from: f7 */
    public boolean m95133f7() {
        if (!m95316z8() && !m94871D7() && !m95276v6() && !m95306y8() && !m95120e6() && !m95314z6() && !m95031V5() && (!m94960N7() || TextUtils.isEmpty(m95131f5()))) {
            return false;
        }
        return true;
    }

    /* renamed from: f8 */
    public boolean m95134f8() {
        if (!m95316z8() && !m95276v6() && !m94871D7() && !m95306y8() && !m95120e6() && !m95031V5() && (!m94696O7() || TextUtils.isEmpty(m95131f5()))) {
            return false;
        }
        return true;
    }

    /* renamed from: f9 */
    public boolean m95135f9(MessageId messageId) {
        return this.f90729q.equals(messageId);
    }

    /* renamed from: fa */
    public void m95136fa() {
        try {
            C0824j.m2153b(new e());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f90587E2, e11);
        }
    }

    /* renamed from: fb */
    public void m95137fb(long j11) {
        this.f90741t = j11;
    }

    /* renamed from: fc */
    public void m95138fc(boolean z11, boolean z12, boolean z13, String str, boolean z14) {
        boolean z15;
        int i11;
        if (!z11 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z13 && !z15) {
            m95023U9();
        } else {
            if (m94871D7() && z11) {
                m95272uc();
            } else {
                if (z11) {
                    i11 = 6;
                } else {
                    i11 = 3;
                }
                m95165ic(i11, true);
            }
            if (z15 && z14) {
                AbstractC23306f.m120652d().m109879g1(str, this, null);
            }
        }
        if (z11) {
            m95203mc();
        }
    }

    @Override // l30.C22033k0.h
    /* renamed from: g */
    public String mo17220g() {
        return m95029V3().m41044h();
    }

    /* renamed from: g1 */
    public boolean m95139g1() {
        C17979l1 c17979l1 = this.f90669W0;
        if ((c17979l1 != null && c17979l1.m95621c() != null && !this.f90669W0.m95621c().m154990e()) || this.f90655R1) {
            return true;
        }
        return false;
    }

    /* renamed from: g2 */
    public void m95140g2(String str, boolean z11) {
        try {
            if (!this.f90715l2.isEmpty()) {
                Iterator it = this.f90715l2.iterator();
                while (it.hasNext()) {
                    x xVar = (x) ((WeakReference) it.next()).get();
                    if (xVar != null) {
                        xVar.mo61274s(m95029V3(), str, z11);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g4 */
    public long m95141g4() {
        return this.f90714l1;
    }

    /* renamed from: g6 */
    public boolean m95142g6() {
        return this.f90677Z.get();
    }

    /* renamed from: g7 */
    public boolean m95143g7() {
        if (this.f90629J != 4 && (!m94996R7() || (!m95121e7() && (this.f90626I != 6 || m95022U7())))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:            if (((dj.C17967h1) r0).m95586r() != false) goto L80;     */
    /* renamed from: g8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m95144g8() {
        C17979l1 c17979l1;
        if (!C24265l.m126676s().m126681C()) {
            return false;
        }
        if ((!m94871D7() || ((c17979l1 = this.f90669W0) != null && c17979l1.f91060c == 3)) && !m94942L7() && !m94949M6() && !m94941L6() && !m95316z8() && !m95306y8() && !m95314z6() && !m95208n8() && !m95120e6() && !m95276v6()) {
            if (m94872D8()) {
                C17969i0 c17969i0 = this.f90618F0;
                if (c17969i0 instanceof C17967h1) {
                }
            }
            if (!m94960N7()) {
                return false;
            }
        }
        return !m95033V7();
    }

    /* renamed from: ga */
    public void m95145ga(C26399a c26399a) {
        this.f90702h1 = c26399a;
    }

    /* renamed from: gb */
    public void m95146gb(long j11) {
        if (j11 > 0) {
            this.f90598A = j11;
        }
    }

    /* renamed from: gc */
    public boolean m95147gc(String str, boolean z11, boolean z12) {
        return m95157hc(str, z11, true, z12);
    }

    @Override // p511sw.InterfaceC26392a
    public Object getItemId() {
        return this.f90729q;
    }

    @Override // l30.C22033k0.h
    /* renamed from: h */
    public boolean mo17221h() {
        return this.f90639M0;
    }

    /* renamed from: h2 */
    public void m95148h2(int i11) {
        InterfaceC19030d interfaceC19030d;
        try {
            WeakReference weakReference = this.f90703h2;
            if (weakReference != null && (interfaceC19030d = (InterfaceC19030d) weakReference.get()) != null) {
                interfaceC19030d.mo43098u(this.f90729q, i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h3 */
    public int m95149h3() {
        return this.f90628I1;
    }

    /* renamed from: h4 */
    public PendingIntent m95150h4() {
        String str;
        AbstractC23059e9.m118318G(3);
        Context appContext = MainApplication.getAppContext();
        String str2 = this.f90737s;
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str2);
        String str3 = "";
        if (m141809c == null) {
            str = "";
        } else {
            String str4 = m141809c.f42437s;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = m141809c.f42446v;
            if (str5 != null) {
                str3 = str5;
            }
            str = str3;
            str3 = str4;
        }
        ContactProfile contactProfile = new ContactProfile(str2);
        contactProfile.f42437s = str3;
        contactProfile.f42446v = str;
        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140781h(m95029V3()).m140776b();
        m140776b.putBoolean("fromNotification", true);
        m140776b.putString("uidNotif", str2);
        m140776b.putString("dpnNotif", str3);
        m140776b.putString("avtNotif", str);
        return PendingIntent.getActivity(appContext, m94852B2(), AbstractC23152n3.m119002J(m140776b), AbstractC19601a.m102572b(134217728));
    }

    /* renamed from: h6 */
    public boolean m95151h6() {
        return this.f90637L1;
    }

    /* renamed from: h7 */
    public boolean m95152h7() {
        return this.f90626I == 1;
    }

    /* renamed from: h8 */
    public boolean m95153h8() {
        if (!m94871D7() && !m95316z8() && !m95314z6() && !m95120e6() && !m95031V5() && !m94872D8()) {
            return false;
        }
        return true;
    }

    /* renamed from: h9 */
    public boolean m95154h9() {
        if (m95234q7() && !m95240r6()) {
            return true;
        }
        return false;
    }

    /* renamed from: ha */
    public void m95155ha(boolean z11) {
        this.f90642N0 = z11;
    }

    /* renamed from: hb */
    public void m95156hb(String str) {
        this.f90634K1 = str;
    }

    /* renamed from: hc */
    public boolean m95157hc(String str, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        C28770b c28770b = this.f90747u1;
        if (c28770b != null) {
            c28770b.m143925r(true);
        }
        if (!z11 && TextUtils.equals(str, m94983Q3())) {
            z14 = false;
        } else {
            m94934Ka(str);
            m95125ec(str);
            z14 = true;
        }
        if (m95276v6() && !z13 && (m95107d3() != 5 || z11)) {
            m95165ic(5, true);
        }
        return z14;
    }

    @Override // l30.C22033k0.h
    /* renamed from: i */
    public boolean mo17222i() {
        return false;
    }

    /* renamed from: i3 */
    public int m95158i3() {
        C31897e4 c31897e4 = this.f90622G1;
        if (c31897e4 != null) {
            return c31897e4.m153263d();
        }
        return 0;
    }

    /* renamed from: i5 */
    public long m95159i5() {
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 != null && (c17969i0 instanceof C17961f1)) {
            return ((C17961f1) c17969i0).m95453G();
        }
        return 0L;
    }

    /* renamed from: i6 */
    public boolean m95160i6() {
        return this.f90759x1;
    }

    /* renamed from: i7 */
    public boolean m95161i7() {
        return this.f90614E == 20;
    }

    /* renamed from: i8 */
    public boolean m95162i8() {
        if (!m95063Y5() && !m95298x8()) {
            return false;
        }
        return true;
    }

    /* renamed from: ia */
    public void m95163ia(boolean z11) {
        this.f90653R = z11;
    }

    /* renamed from: ib */
    public void m95164ib(String str) {
        this.f90610D = str;
    }

    /* renamed from: ic */
    public void m95165ic(int i11, boolean z11) {
        m95264ta(i11);
        C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.w

            /* renamed from: q */
            public final /* synthetic */ int f91209q;

            /* renamed from: r */
            public final /* synthetic */ boolean f91210r;

            public /* synthetic */ RunnableC18008w(int i112, boolean z112) {
                r2 = i112;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17945a0.this.m94726W8(r2, r3);
            }
        }));
    }

    @Override // l30.C22033k0.h
    /* renamed from: j */
    public C32123ta mo17223j() {
        List list = C22021e0.f108432p;
        if (!list.isEmpty() && ((C31980jc) list.get(0)).f147031x.size() > 0) {
            return (C32123ta) ((C31980jc) list.get(0)).f147031x.get(0);
        }
        return null;
    }

    /* renamed from: j1 */
    public void m95166j1(C28770b c28770b) {
        boolean z11;
        try {
            if (AbstractC23309i.m120938Fg() && !m95022U7()) {
                if ((!m94871D7() || !this.f90607C0) && m94784n7()) {
                    if (m94871D7() && m95188l7()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (m95032V6()) {
                        if (m95107d3() != 3) {
                            if (!m95180k8()) {
                                if (TextUtils.isEmpty(m95090b5())) {
                                    return;
                                }
                            } else if (m95107d3() != 5 && !z11) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (m95107d3() != 5 && !z11) {
                        return;
                    }
                    if (TextUtils.isEmpty(this.f90761y) || ((c28770b != null && !c28770b.m143918k()) || (c28770b == null && !AbstractC23041d2.m118194A(this.f90761y)))) {
                        this.f90735r1 = true;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j2 */
    public void m95167j2(int i11) {
        try {
            if (!this.f90715l2.isEmpty()) {
                Iterator it = this.f90715l2.iterator();
                while (it.hasNext()) {
                    x xVar = (x) ((WeakReference) it.next()).get();
                    if (xVar != null) {
                        xVar.mo61273m(i11, m95029V3());
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j3 */
    public int m95168j3() {
        C31897e4 c31897e4 = this.f90622G1;
        if (c31897e4 != null) {
            return c31897e4.m153264e();
        }
        return 0;
    }

    /* renamed from: j5 */
    public String m95169j5(String str) {
        return C20131e.f99303a.m104955h(this.f90737s) + AbstractC23352g.m122788d(str + m95028V2()) + ".mp4";
    }

    /* renamed from: j6 */
    public boolean m95170j6() {
        return this.f90622G1 != null;
    }

    /* renamed from: j8 */
    public boolean m95171j8() {
        return false;
    }

    /* renamed from: ja */
    public void m95172ja(boolean z11) {
        this.f90743t1 = z11;
    }

    /* renamed from: jb */
    public void m95173jb(String str) {
        this.f90733r = str;
    }

    /* renamed from: jc */
    void m95174jc() {
        try {
            if (this.f90618F0 instanceof C18002t0) {
                String m122307q4 = AbstractC23309i.m122307q4();
                String str = ((C18002t0) this.f90618F0).f91183D;
                if (!TextUtils.isEmpty(str) && !str.equals(m122307q4)) {
                    AbstractC23309i.m120872Do(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k2 */
    public void m95175k2() {
        y yVar = (y) this.f90664U1.get();
        if (yVar != null) {
            yVar.mo66752a();
        }
    }

    /* renamed from: k4 */
    public String m95176k4(String str) {
        return C32042o.f147549a.m154589e(this.f90737s, m95029V3(), str);
    }

    /* renamed from: k5 */
    public String m95177k5() {
        if (!m95306y8()) {
            return "";
        }
        String m94945M2 = m94945M2();
        if (!TextUtils.isEmpty(m94945M2) && AbstractC23041d2.m118194A(m94945M2)) {
            return m94945M2;
        }
        return m94983Q3();
    }

    /* renamed from: k6 */
    public boolean m95178k6() {
        int i11 = this.f90614E;
        return i11 == 52 || i11 == 51;
    }

    /* renamed from: k7 */
    public boolean m95179k7() {
        return C25994h.f124017a.m133919h(mo95039W2()).m133972y(this);
    }

    /* renamed from: k8 */
    public boolean m95180k8() {
        return this.f90623H;
    }

    /* renamed from: ka */
    public void m95181ka(C32012m c32012m) {
        this.f90659T = c32012m;
    }

    /* renamed from: kb */
    public void m95182kb(boolean z11) {
        this.f90706i2 = z11;
    }

    /* renamed from: l2 */
    public void m95183l2() {
        y yVar = (y) this.f90664U1.get();
        if (yVar != null) {
            yVar.mo66753b();
        }
    }

    /* renamed from: l3 */
    public C31897e4 m95184l3() {
        return this.f90622G1;
    }

    /* renamed from: l4 */
    int m95185l4() {
        boolean z11;
        try {
            C18009w0 c18009w0 = (C18009w0) this.f90618F0;
            boolean z12 = !TextUtils.isEmpty(this.f90753w);
            if (!TextUtils.isEmpty(c18009w0.m95740E()) && AbstractC23041d2.m118194A(c18009w0.m95740E())) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = !TextUtils.isEmpty(c18009w0.m95741F());
            if (!z12) {
                return 0;
            }
            if (!z11 || z13) {
                return 2;
            }
            return 1;
        } catch (Exception e11) {
            e11.printStackTrace();
            if (!TextUtils.isEmpty(this.f90753w)) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: l5 */
    public int m95186l5() {
        if (AbstractC25495a.m132079d(this.f90737s)) {
            return 5;
        }
        return 0;
    }

    /* renamed from: l6 */
    public boolean m95187l6() {
        return this.f90614E == 51;
    }

    /* renamed from: l7 */
    public boolean m95188l7() {
        return this.f90629J == 6;
    }

    /* renamed from: l8 */
    public boolean m95189l8() {
        return this.f90750v0;
    }

    /* renamed from: l9 */
    public void m95190l9(boolean z11, int i11, Exception exc) {
        if (this.f90696f1 != null) {
            this.f90696f1.mo154829a(m95029V3().m41045i());
        }
        if (z11) {
            if (i11 == 5) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            } else if (i11 == 7) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_picker_storage_permission_deny_desc));
                i11 = 0;
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
        }
        C24559a.m127931a(i11, exc);
    }

    /* renamed from: la */
    public void m95191la(C17969i0 c17969i0) {
        this.f90618F0 = c17969i0;
    }

    /* renamed from: lb */
    public void m95192lb(long j11) {
        this.f90727p1 = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:            if (r6 != 1) goto L22;     */
    /* renamed from: lc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m95193lc(int i11) {
        boolean z11;
        if (m95054X6() || m95207n6()) {
            z11 = true;
        }
        z11 = false;
        m95016Ta(i11);
        C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.q

            /* renamed from: q */
            public final /* synthetic */ int f91132q;

            /* renamed from: r */
            public final /* synthetic */ boolean f91133r;

            public /* synthetic */ RunnableC17992q(int i112, boolean z112) {
                r2 = i112;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17945a0.this.m94728X8(r2, r3);
            }
        }));
    }

    @Override // l30.C22033k0.h
    /* renamed from: m */
    public boolean mo17224m() {
        return false;
    }

    /* renamed from: m2 */
    public void m95194m2(String str, boolean z11) {
        String str2;
        boolean z12;
        boolean z13;
        C17990p0 c17990p0 = (C17990p0) this.f90618F0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c17990p0.m95667h());
        String str3 = "";
        if (c17990p0.f91115D.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + c17990p0.f91115D;
        }
        sb2.append(str2);
        String sb3 = sb2.toString();
        String str4 = c17990p0.f91115D;
        if (!AbstractC31990k7.m154226g(str4) && !AbstractC31990k7.m154225f(str4)) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean m154228i = AbstractC31990k7.m154228i(str4);
        if (TextUtils.isEmpty(c17990p0.f91013r) && TextUtils.isEmpty(c17990p0.f91116E)) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13 && z12) {
            m95056X9(str, sb3, z11, true, new SensitiveData("gallery_save_media_from_popup_csc", "comm_csc"));
            return;
        }
        if (z13 && m154228i) {
            m95093ba(str, sb3, z11, true, new SensitiveData("gallery_save_media_from_popup_csc", "comm_csc"));
            return;
        }
        try {
            String m120300L = AbstractC23280z4.m120300L(str, sb3, true, new SensitiveData("gallery_save_photo_detail", "photo_download"));
            if (AbstractC23254w8.m119859g(m120300L)) {
                str3 = new C20556f(m120300L).m106843p();
            } else {
                str3 = m120300L;
            }
            if (m94893G1(m120300L)) {
                if (z11) {
                    if (str3 != null && !str3.isEmpty()) {
                        ToastUtils.showMess(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_message_download_finished), str3));
                        return;
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.browser_download_notification_download_complete));
                        return;
                    }
                }
                return;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        AbstractC23041d2.m118208g(str3);
        if (z11) {
            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
        }
    }

    /* renamed from: m3 */
    public String m95195m3() {
        String str = "";
        if (!m95306y8()) {
            return "";
        }
        String m102945X0 = AbstractC19646n0.m102945X0(this);
        if (!TextUtils.isEmpty(m102945X0)) {
            C20556f c20556f = new C20556f(m102945X0);
            if (c20556f.m106830b() && c20556f.m106845r() > 0 && c20556f.m106842o() != null) {
                str = c20556f.m106842o();
            }
        }
        if (TextUtils.isEmpty(str)) {
            C20556f c20556f2 = new C20556f(m94756g5(m102945X0));
            if (c20556f2.m106830b() && c20556f2.m106845r() > 0) {
                if (c20556f2.m106842o() != null) {
                    return c20556f2.m106842o();
                }
                return str;
            }
            if (ZMediaPlayer.cacheValidate(ZMediaPlayerSettings.getCacheDir(0), m102945X0) > 0) {
                return ZMediaPlayerSettings.getCacheDir(0) + AbstractC23352g.m122788d(m102945X0);
            }
            return str;
        }
        return str;
    }

    /* renamed from: m4 */
    public int m95196m4() {
        return this.f90725p;
    }

    /* renamed from: m5 */
    public String m95197m5() {
        if (!m95306y8()) {
            return "";
        }
        String m102945X0 = AbstractC19646n0.m102945X0(this);
        if (TextUtils.isEmpty(m102945X0) || ZMediaPlayer.cacheValidate(ZMediaPlayerSettings.getCacheDir(0), m102945X0) <= 0) {
            return "";
        }
        return ZMediaPlayerSettings.getCacheDir(0) + AbstractC23352g.m122788d(m102945X0);
    }

    /* renamed from: m6 */
    public boolean m95198m6() {
        C31897e4 c31897e4 = this.f90622G1;
        if (c31897e4 != null && c31897e4.m153277r()) {
            return true;
        }
        return false;
    }

    /* renamed from: m7 */
    public boolean m95199m7() {
        int i11 = this.f90626I;
        return i11 == 3 || i11 == 4 || i11 == 2;
    }

    /* renamed from: m8 */
    public boolean m95200m8() {
        return this.f90614E == 41;
    }

    /* renamed from: ma */
    public void m95201ma(long j11) {
        this.f90681a1 = j11;
    }

    /* renamed from: mb */
    public void m95202mb(int i11) {
        this.f90600A1 = i11;
    }

    /* renamed from: mc */
    public void m95203mc() {
        String str;
        if (m94871D7()) {
            C17969i0 c17969i0 = this.f90618F0;
            if ((c17969i0 instanceof C18009w0) && !TextUtils.isEmpty(((C18009w0) c17969i0).m95791y())) {
                if (m94880E7()) {
                    str = "";
                } else {
                    str = null;
                }
                m95212nc(str, null, false);
            }
        }
    }

    @Override // p511sw.InterfaceC26396e
    /* renamed from: n */
    public long mo95204n() {
        if (!m94969O6()) {
            return -1L;
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C18009w0) {
            return ((C18009w0) c17969i0).m95777m();
        }
        if (c17969i0 instanceof C17961f1) {
            return ((C17961f1) c17969i0).m95487l();
        }
        if (!(c17969i0 instanceof C17958e1)) {
            return -1L;
        }
        return ((C17958e1) c17969i0).m95422k();
    }

    /* renamed from: n3 */
    public C3000l0 m95205n3() {
        C17969i0 c17969i0 = this.f90618F0;
        if ((c17969i0 instanceof C17987o0) && ((C17987o0) c17969i0).m95659g() != null) {
            return ((C17987o0) this.f90618F0).m95659g();
        }
        C17994q1 c17994q1 = this.f90672X0;
        if (c17994q1 != null) {
            return c17994q1.f91141c;
        }
        return null;
    }

    /* renamed from: n4 */
    public String m95206n4() {
        return this.f90705i1;
    }

    /* renamed from: n6 */
    public boolean m95207n6() {
        C31897e4 c31897e4 = this.f90622G1;
        if (c31897e4 != null && c31897e4.m153280u()) {
            return true;
        }
        return false;
    }

    /* renamed from: n8 */
    public boolean m95208n8() {
        return this.f90614E == 0;
    }

    /* renamed from: n9 */
    public void m95209n9(int i11) {
        C28023b6.m141250h0().m141374q2(m94852B2(), m95029V3().m41044h(), m95150h4(), m95060Y2(), m95232q3(), i11);
    }

    /* renamed from: na */
    public void m95210na(int i11) {
        this.f90717m1 = i11;
    }

    /* renamed from: nb */
    public void m95211nb(byte b11) {
        this.f90662U = b11;
    }

    /* renamed from: nc */
    public void m95212nc(String str, PointF pointF, boolean z11) {
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 instanceof C18009w0) {
            C18009w0 c18009w0 = (C18009w0) c17969i0;
            if (pointF != null) {
                c18009w0.m95749O(pointF.x);
                c18009w0.m95750P(pointF.y);
            }
            c18009w0.m95761a0(str);
            c18009w0.m95756V(z11);
            c18009w0.m95778m0();
            if (AbstractC19444a.m101693a()) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: dj.t
                    public /* synthetic */ RunnableC18001t() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17945a0.this.m94731Y8();
                    }
                });
            } else {
                C7956b.m41474B().m41513J0(this, this.f90618F0);
            }
            C23744a.m124114c().m124116d(2, this.f90737s);
        }
    }

    @Override // p511sw.InterfaceC26392a
    /* renamed from: o */
    public long mo95213o() {
        return this.f90765z;
    }

    /* renamed from: o2 */
    public void m95214o2(boolean z11, boolean z12) {
        int i11;
        this.f90752v2 = z11;
        this.f90756w2 = z12;
        try {
            if (m95032V6()) {
                if (m95276v6()) {
                    if (m95276v6() && m95089b4() == 1) {
                        return;
                    }
                    if (!AbstractC23238v2.m119726k()) {
                        ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                        return;
                    }
                    if (AbstractC26687h.m137062c(this, (C17990p0) this.f90618F0)) {
                        ToastUtils.m89266n(AbstractC8020f0.str_roll_file_error, new Object[0]);
                        C2526d.f10270a.m12691O(this, this.f90756w2, false, false);
                        return;
                    } else {
                        if (C23055e5.m118272g(true)) {
                            this.f90604B1 = true;
                            m95023U9();
                            m95165ic(4, true);
                            C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (!AbstractC23238v2.m119726k()) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                return;
            }
            if (AbstractC26687h.m137062c(this, (C17990p0) this.f90618F0)) {
                ToastUtils.m89266n(AbstractC8020f0.str_roll_file_error, new Object[0]);
                C2526d.f10270a.m12691O(this, this.f90756w2, false, false);
                return;
            }
            if (m95142g6() && this.f90603B0 == EnumC19038l.f94904q) {
                if (m95276v6() && !AbstractC21935u.m114550q(this.f90737s)) {
                    C17966h0 c17966h0 = this.f90689d0;
                    if (c17966h0 != null) {
                        i11 = c17966h0.m95560k();
                    } else {
                        i11 = 0;
                    }
                    m95209n9(i11);
                }
                m95068Z0();
            }
            this.f90603B0 = EnumC19038l.f94903p;
            if (C23055e5.m118272g(true)) {
                this.f90604B1 = true;
                m95023U9();
                m95165ic(4, true);
                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            }
        } catch (Exception e11) {
            this.f90752v2 = false;
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: o4 */
    public int m95215o4() {
        return this.f90691d2;
    }

    /* renamed from: o5 */
    public EnumC24253d m95216o5() {
        return this.f90673X1;
    }

    /* renamed from: o6 */
    public boolean m95217o6() {
        return this.f90614E == 27;
    }

    /* renamed from: o7 */
    public boolean m95218o7() {
        if (this.f90650Q > 0 && m95260t4() < 3000) {
            return true;
        }
        return false;
    }

    /* renamed from: o8 */
    public boolean m95219o8() {
        return this.f90614E == 36;
    }

    /* renamed from: oa */
    public void m95220oa(boolean z11) {
        this.f90636L0 = z11;
    }

    /* renamed from: ob */
    public void m95221ob(int i11) {
        this.f90644O = i11;
    }

    /* renamed from: p2 */
    public void m95222p2(boolean z11, SensitiveData sensitiveData) {
        try {
            if (this.f90764y2) {
                return;
            }
            String str = "";
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null && (c17969i0 instanceof C18009w0)) {
                str = c17969i0.mo95598f();
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                this.f90764y2 = true;
                File m123576h = AbstractC23529b.m123576h(MainApplication.getAppContext(), str2);
                if (m123576h != null && m123576h.exists() && m123576h.length() > 0) {
                    m95056X9(m123576h.getPath(), "", z11, false, sensitiveData);
                    return;
                }
                if (this.f90605B2 == null) {
                    this.f90605B2 = new C3977j(MainApplication.getAppContext());
                }
                if (this.f90601A2 == null) {
                    this.f90601A2 = new C23528a(MainApplication.getAppContext());
                }
                ((C23528a) this.f90601A2.m123612r(this.f90605B2)).m123584H(str2, false, true, 0, 0, new g(z11, sensitiveData));
                return;
            }
            this.f90764y2 = false;
            m95231q2(z11, sensitiveData);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f90764y2 = false;
            m95190l9(z11, 1, e11);
        }
    }

    /* renamed from: p3 */
    public String m95223p3() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 == null || !(c17969i0 instanceof C17990p0)) {
                return "";
            }
            return ((C17990p0) c17969i0).f91115D;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: p4 */
    public C17988o1 m95224p4() {
        return this.f90661T1;
    }

    /* renamed from: p5 */
    public String m95225p5(C22504b c22504b) {
        if (((this.f90618F0 instanceof C17967h1) && !(!((C17967h1) r0).f91001a0)) || c22504b == null) {
            return "";
        }
        return AbstractC20130d.m104843M() + CoreUtility.f89233i + "_" + this.f90737s + "_" + m95029V3().m41042C() + "_" + c22504b.f110129c;
    }

    /* renamed from: p6 */
    public boolean m95226p6() {
        return this.f90614E == 21;
    }

    /* renamed from: p7 */
    public boolean m95227p7() {
        if (this.f90650Q > 0 && C23793c.m124316k().mo124314i() - this.f90765z > this.f90650Q) {
            return true;
        }
        return false;
    }

    /* renamed from: p8 */
    public boolean m95228p8() {
        return this.f90614E == 10000;
    }

    /* renamed from: pb */
    public void m95229pb(long j11) {
        this.f90742t0 = j11;
    }

    /* renamed from: pc */
    public void m95230pc() {
        if (m95032V6()) {
            int i11 = this.f90626I;
            if ((i11 == 1 || (i11 != 0 && m95207n6())) && !m95044W7() && !m95242r8() && m94682K9()) {
                int i12 = this.f90614E;
                if (i12 != 19) {
                    if (i12 != 24) {
                        switch (i12) {
                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                            case 42:
                            case 43:
                                m95112da();
                                return;
                            default:
                                m94752ea();
                                return;
                        }
                    }
                    m94799qc();
                    return;
                }
                m94752ea();
                m95115e1();
            }
        }
    }

    @Override // l30.C22033k0.h
    /* renamed from: q */
    public void mo17227q() {
    }

    /* renamed from: q2 */
    public void m95231q2(boolean z11, SensitiveData sensitiveData) {
        try {
            if (this.f90764y2) {
                return;
            }
            if (TextUtils.isEmpty(this.f90761y)) {
                String str = "";
                C17969i0 c17969i0 = this.f90618F0;
                if (c17969i0 != null) {
                    str = c17969i0.f91014s;
                }
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    this.f90764y2 = true;
                    File m123576h = AbstractC23529b.m123576h(MainApplication.getAppContext(), str2);
                    if (m123576h != null && m123576h.exists() && m123576h.length() > 0) {
                        m95056X9(m123576h.getPath(), "", z11, false, sensitiveData);
                        return;
                    }
                    if (this.f90605B2 == null) {
                        this.f90605B2 = new C3977j(MainApplication.getAppContext());
                    }
                    if (this.f90601A2 == null) {
                        this.f90601A2 = new C23528a(MainApplication.getAppContext());
                    }
                    ((C23528a) this.f90601A2.m123612r(this.f90605B2)).m123584H(str2, false, true, 0, 0, new f(z11, sensitiveData));
                    return;
                }
                m95190l9(z11, 3, null);
                this.f90764y2 = false;
                return;
            }
            if (AbstractC23041d2.m118194A(this.f90761y)) {
                m95056X9(this.f90761y, "", z11, false, sensitiveData);
            } else {
                m95190l9(z11, 4, null);
                this.f90764y2 = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f90764y2 = false;
            if (z11) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
            }
        }
    }

    /* renamed from: q3 */
    public String m95232q3() {
        String str = this.f90694e2;
        if (TextUtils.isEmpty(str)) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C17990p0) {
                return c17969i0.f91011p;
            }
            return str;
        }
        return str;
    }

    /* renamed from: q4 */
    public C18000s1 m95233q4() {
        return this.f90720n1;
    }

    /* renamed from: q7 */
    public boolean m95234q7() {
        if (!m94871D7() && !m95120e6() && !m95316z8() && !m95276v6() && !m95288w8() && !m95306y8()) {
            return false;
        }
        return true;
    }

    /* renamed from: q8 */
    public boolean m95235q8() {
        if (!m95032V6() && m95089b4() != 4) {
            return true;
        }
        return false;
    }

    /* renamed from: q9 */
    public void m95236q9() {
        try {
            if (m95219o8()) {
                return;
            }
            if (this.f90669W0 == null) {
                this.f90669W0 = new C17979l1();
            }
            if (m95170j6()) {
                this.f90669W0.f91067j = false;
            } else {
                this.f90669W0.f91067j = true;
            }
            C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.k
                public /* synthetic */ RunnableC17974k() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.this.m94697O8();
                }
            }));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: qa */
    public void m95237qa(C25496a c25496a) {
        this.f90738s0 = c25496a;
    }

    /* renamed from: r3 */
    public long m95238r3() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 == null || !(c17969i0 instanceof C17990p0)) {
                return 0L;
            }
            return ((C17990p0) c17969i0).f91113B;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: r4 */
    public C17994q1 m95239r4() {
        return this.f90672X0;
    }

    /* renamed from: r6 */
    public boolean m95240r6() {
        if (m95288w8()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C17961f1) {
                String m95485k = ((C17961f1) c17969i0).m95485k();
                if (!TextUtils.isEmpty(m95485k) && AbstractC23041d2.m118194A(m95485k)) {
                    return true;
                }
            }
        } else if (m95306y8()) {
            String m102945X0 = AbstractC19646n0.m102945X0(this);
            if (!TextUtils.isEmpty(m102945X0)) {
                C20556f c20556f = new C20556f(m102945X0);
                if (c20556f.m106830b() && c20556f.m106845r() > 0) {
                    return true;
                }
                C20556f c20556f2 = new C20556f(m94756g5(m102945X0));
                if ((c20556f2.m106830b() && c20556f2.m106845r() > 0) || ZMediaPlayer.cacheValidate(ZMediaPlayerSettings.getCacheDir(0), m102945X0) > 0) {
                    return true;
                }
            }
        }
        if (TextUtils.isEmpty(m94983Q3()) || !AbstractC23041d2.m118194A(m94983Q3())) {
            return false;
        }
        return true;
    }

    /* renamed from: r7 */
    public boolean m95241r7() {
        int i11 = this.f90614E;
        if (i11 != 0 && i11 != 6 && i11 != 10 && i11 != 12 && i11 != 31 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 18 && i11 != 19) {
            switch (i11) {
                case 22:
                case 23:
                    break;
                case 24:
                    return !m94656E8();
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: r8 */
    public boolean m95242r8() {
        return this.f90680a0;
    }

    /* renamed from: r9 */
    public void m95243r9(String str, int i11) {
        try {
            if (!m95219o8() && !m95091b6()) {
                if (i11 == -2) {
                    this.f90731q1 = false;
                    return;
                }
                if (i11 == 1 || i11 == -1) {
                    if (this.f90669W0 == null) {
                        this.f90669W0 = new C17979l1();
                    }
                    int i12 = this.f90744t2.f146792e;
                    if (i12 == 4) {
                        if (i11 == -1) {
                            this.f90669W0.f91067j = false;
                        }
                    } else if (i12 == 1) {
                        if (!m95170j6() && !C32204z7.m155260j().m155273p(str)) {
                            this.f90669W0.f91067j = true;
                            this.f90731q1 = false;
                        }
                        this.f90669W0.f91067j = false;
                    }
                    C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.u
                        public /* synthetic */ RunnableC18004u() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C17945a0.this.m94702P8();
                        }
                    }));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ra */
    public void m95244ra(long j11) {
        this.f90616E1 = j11;
    }

    /* renamed from: rc */
    public void m95245rc(EnumC19038l enumC19038l) {
        this.f90603B0 = enumC19038l;
    }

    /* renamed from: s1 */
    public boolean m95246s1() {
        boolean z11;
        C18013y0 c18013y0;
        if (!m94955N1()) {
            return true;
        }
        C7907e c7907e = this.f90657S0;
        if (c7907e != null && c7907e.m40858h() && !((Boolean) this.f90657S0.m40854d().first).booleanValue()) {
            z11 = false;
        } else {
            z11 = true;
        }
        C17997r1 c17997r1 = this.f90654R0;
        if (c17997r1 != null) {
            if (!TextUtils.isEmpty(c17997r1.m95693j()) && TextUtils.isEmpty(this.f90654R0.m95691h())) {
                String m153509l = C31943h5.f146766a.m153509l(this.f90654R0.m95693j(), true);
                if (!TextUtils.isEmpty(m153509l)) {
                    this.f90654R0.m95703t(m153509l);
                } else {
                    z11 = false;
                }
            }
            if (this.f90654R0.m95690g() != null && this.f90654R0.m95690g().f91018w != null) {
                Pair m40854d = this.f90654R0.m95690g().f91018w.m40854d();
                boolean booleanValue = ((Boolean) m40854d.first).booleanValue();
                boolean booleanValue2 = ((Boolean) m40854d.second).booleanValue();
                if (!booleanValue) {
                    z11 = false;
                } else if (booleanValue2) {
                    C17997r1 c17997r12 = this.f90654R0;
                    c17997r12.m95699p(c17997r12.m95690g().mo95393c());
                }
            }
        }
        if (m94942L7()) {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 instanceof C18013y0) {
                c18013y0 = (C18013y0) c17969i0;
            } else {
                C17969i0 c17969i02 = this.f90618F0;
                c18013y0 = new C18013y0(c17969i02.f91011p, c17969i02.f91012q, c17969i02.f91013r, c17969i02.f91014s, c17969i02.f91015t, c17969i02.f91016u, c17969i02.f91017v);
                this.f90618F0 = c18013y0;
            }
            C17978l0 c17978l0 = c18013y0.f91253D;
            if (c17978l0 == null) {
                c17978l0 = new C17978l0(null);
                c18013y0.f91253D = c17978l0;
            }
            if (!TextUtils.isEmpty(c18013y0.f91017v) && TextUtils.isEmpty(c17978l0.f91055c)) {
                String m153509l2 = C31943h5.f146766a.m153509l(c18013y0.f91017v, true);
                if (!TextUtils.isEmpty(m153509l2)) {
                    c17978l0.f91055c = m153509l2;
                    c18013y0.f91015t = c17978l0.m95618a();
                } else {
                    return false;
                }
            }
        }
        return z11;
    }

    /* renamed from: s2 */
    public void m95247s2() {
        this.f90633K0 = System.currentTimeMillis();
        this.f90630J0 = true;
    }

    /* renamed from: s3 */
    public int m95248s3() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 == null || !(c17969i0 instanceof C17990p0)) {
                return 1;
            }
            return ((C17990p0) c17969i0).f91123L;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 1;
        }
    }

    /* renamed from: s4 */
    public String m95249s4() {
        int indexOf;
        if (!TextUtils.isEmpty(this.f90761y) && m95153h8() && (indexOf = this.f90761y.indexOf("/zalo/")) != -1 && AbstractC20130d.m104852Q0(this.f90761y)) {
            return this.f90761y.substring(indexOf + 1);
        }
        return this.f90761y;
    }

    /* renamed from: s6 */
    public boolean m95250s6() {
        C17979l1 c17979l1;
        if (this.f90626I == 0 && (c17979l1 = this.f90669W0) != null && c17979l1.m95621c() != null && this.f90669W0.m95621c().m154998n() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: s7 */
    public boolean m95251s7() {
        int i11 = this.f90614E;
        return i11 == 0 || i11 == 10 || i11 == 23 || i11 == 31;
    }

    /* renamed from: s8 */
    public boolean m95252s8() {
        return this.f90683b0;
    }

    /* renamed from: s9 */
    public void m95253s9(C18013y0 c18013y0) {
        C3535c m2634q;
        C17978l0 c17978l0;
        try {
            if (!m95219o8() && !m95091b6()) {
                if ("recommened.link".equals(c18013y0.f91016u)) {
                    c18013y0.f91011p = this.f90745u;
                }
                if ("recommened.user".equals(c18013y0.f91016u) && (c17978l0 = c18013y0.f91253D) != null) {
                    c17978l0.f91054b = this.f90745u;
                    c18013y0.f91015t = c17978l0.m95618a();
                }
                this.f90614E = 12;
                this.f90618F0 = c18013y0;
                C32098s c32098s = c18013y0.f91251B;
                if (c32098s != null) {
                    this.f90678Z0 = c32098s.f147968r;
                }
                String mo95393c = c18013y0.mo95393c();
                if (!TextUtils.isEmpty(this.f90737s) && (m2634q = AbstractC23306f.m120584H0().m2634q(this.f90737s)) != null) {
                    synchronized (m2634q) {
                        try {
                            List m17941F0 = m2634q.m17941F0();
                            for (int i11 = 0; i11 < m17941F0.size(); i11++) {
                                C17945a0 c17945a0 = (C17945a0) m17941F0.get(i11);
                                if (c17945a0 != null && c17945a0.m95275v4() != null && m95135f9(c17945a0.m95275v4().m95689f())) {
                                    c17945a0.m95275v4().m95700q(38);
                                    c17945a0.m95275v4().m95699p(mo95393c);
                                    c17945a0.m95275v4().m95702s(c18013y0);
                                }
                            }
                        } finally {
                        }
                    }
                }
                C23288a c23288a = C23288a.f113033a;
                c23288a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.e

                    /* renamed from: q */
                    public final /* synthetic */ String f90894q;

                    /* renamed from: r */
                    public final /* synthetic */ C18013y0 f90895r;

                    public /* synthetic */ RunnableC17956e(String mo95393c2, C18013y0 c18013y02) {
                        r2 = mo95393c2;
                        r3 = c18013y02;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17945a0.this.m94705Q8(r2, r3);
                    }
                }));
                c23288a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.f
                    public /* synthetic */ RunnableC17959f() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17945a0.this.m94709R8();
                    }
                }));
                C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sa */
    public void m95254sa(int i11) {
        this.f90612D1 = i11;
    }

    /* renamed from: sb */
    public void m95255sb(String str) {
        this.f90693e1 = str;
    }

    /* renamed from: sc */
    public void m95256sc(String str, boolean z11) {
        if (z11) {
            m94934Ka(str);
            m95114dc(m95249s4());
        } else {
            m94934Ka(str);
            m95264ta(5);
            C7956b.m41474B().m41509G0(this, -1, 5, m95249s4());
        }
    }

    /* renamed from: t1 */
    public void m95257t1() {
        C17979l1 c17979l1;
        if (m95208n8() && m95089b4() != 0 && this.f90744t2 != null && (c17979l1 = this.f90669W0) != null && c17979l1.f91067j) {
            if (m95287w7() && this.f90744t2.f146792e == 1) {
                return;
            }
            boolean m3481U9 = AbstractC0924m0.m3481U9();
            if (this.f90744t2.f146792e == 1 && m3481U9) {
                C17994q1 c17994q1 = this.f90672X0;
                if (c17994q1 != null && c17994q1.f91139a != 3) {
                    return;
                }
            } else if ((m95089b4() == 1 && this.f90744t2.f146792e != 4) || this.f90672X0 != null) {
                return;
            }
            if (this.f90654R0 != null || this.f90731q1) {
                return;
            }
            this.f90731q1 = true;
            h hVar = new h(m3481U9);
            int i11 = this.f90744t2.f146792e;
            if (i11 == 4) {
                C32204z7.m155260j().m155274u(this.f90744t2.f146791d, true, hVar);
                return;
            }
            if (i11 == 1) {
                String str = this.f90745u;
                if (str != null && !str.isEmpty()) {
                    String m153548n = C31944h6.m153548n(this.f90745u);
                    if (!m153548n.isEmpty()) {
                        if (C31944h6.m153545k(this.f90745u.substring(this.f90745u.indexOf(m153548n) + m153548n.length()))) {
                            this.f90669W0.f91067j = false;
                        }
                    }
                }
                if (this.f90669W0.f91067j) {
                    if (m95054X6()) {
                        C32204z7.m155260j().m155277x(this.f90744t2.f146788a, false, false, 1, hVar);
                    } else if (!m95170j6() && AbstractC23309i.m121227N9() != 0) {
                        m94839y9(this.f90744t2.f146788a);
                    }
                }
            }
        }
    }

    /* renamed from: t2 */
    public void m95258t2() {
        this.f90748u2 = true;
        C23744a.m124114c().m124116d(6, m95029V3(), this.f90737s);
    }

    /* renamed from: t3 */
    public PendingIntent m95259t3() {
        PendingIntent m95150h4;
        try {
            if (!TextUtils.isEmpty(this.f90761y) && AbstractC23041d2.m118194A(this.f90761y) && !AbstractC23152n3.m119069t(new C20556f(this.f90761y))) {
                m95150h4 = C28023b6.m141261q0(this.f90761y);
            } else {
                m95150h4 = m95150h4();
            }
            return m95150h4;
        } catch (Exception e11) {
            e11.printStackTrace();
            return m95150h4();
        }
    }

    /* renamed from: t4 */
    public long m95260t4() {
        return this.f90650Q - (C23793c.m124316k().mo124314i() - this.f90765z);
    }

    /* renamed from: t6 */
    public boolean m95261t6() {
        return this.f90614E == 34;
    }

    /* renamed from: t7 */
    public boolean m95262t7() {
        if (!m95161i7() && !m95031V5() && !m95122e8() && !m95226p6() && !m94899G7()) {
            return true;
        }
        return false;
    }

    /* renamed from: t9 */
    public void m95263t9(List list, boolean z11) {
        if (this.f90622G1 != null) {
            Iterator it = list.iterator();
            boolean z12 = false;
            while (true) {
                int i11 = 2;
                if (!it.hasNext()) {
                    break;
                }
                C31852b4 c31852b4 = (C31852b4) it.next();
                C31912f4 m153266g = this.f90622G1.m153266g(c31852b4);
                if (m153266g != null && m153266g.m153370c() != 5 && m153266g.m153370c() != 4 && m153266g.m153370c() != 3) {
                    C31897e4 c31897e4 = this.f90622G1;
                    if (z11) {
                        i11 = 3;
                    }
                    z12 |= c31897e4.m153284z(c31852b4, i11);
                }
            }
            if (z12) {
                C7956b.m41474B().m41556r0(this, CoreUtility.f89233i);
            }
            int m95089b4 = m95089b4();
            if (m95089b4 != 3 && m95089b4 != 4) {
                if (!this.f90622G1.m153273n() && !this.f90622G1.m153274o()) {
                    m95193lc(0);
                } else {
                    m95193lc(2);
                }
            } else if (z12) {
                C7959d.m41638d1().m41683A0(this.f90737s, this.f90729q.m41045i());
            }
            if (this.f90622G1.m153267h() != null) {
                AbstractC19444a.m101695c(new Runnable() { // from class: dj.i
                    public /* synthetic */ RunnableC17968i() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17945a0.this.m95230pc();
                    }
                });
            }
        }
    }

    /* renamed from: ta */
    public void m95264ta(int i11) {
        this.f90629J = i11;
    }

    /* renamed from: tb */
    public void m95265tb(boolean z11) {
        this.f90623H = z11;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChatContent{");
        String str3 = "";
        if (this.f90745u.isEmpty()) {
            str = "";
        } else {
            str = "msg='" + AbstractC23244v8.m119737a(this.f90745u, 20) + "', ";
        }
        sb2.append(str);
        sb2.append("msgID=");
        sb2.append(this.f90729q);
        sb2.append(", timestamp=");
        sb2.append(this.f90765z);
        if (this.f90737s.isEmpty()) {
            str2 = "";
        } else {
            str2 = ", ownerId='" + this.f90737s + '\'';
        }
        sb2.append(str2);
        if (!this.f90733r.isEmpty()) {
            str3 = ", senderUid='" + this.f90733r + '\'';
        }
        sb2.append(str3);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u2 */
    public String m95266u2() {
        String str;
        String str2;
        if (m94871D7()) {
            String m94983Q3 = m94983Q3();
            if (TextUtils.isEmpty(m94983Q3) && m95032V6()) {
                String str3 = this.f90618F0.f91014s;
                if (TextUtils.isEmpty(str3)) {
                    C17969i0 c17969i0 = this.f90618F0;
                    if (c17969i0 instanceof C18009w0) {
                        return ((C18009w0) c17969i0).m95737B();
                    }
                    return str3;
                }
                return str3;
            }
            return m94983Q3;
        }
        if (m95306y8()) {
            if (m95032V6()) {
                if (!this.f90767z1 && !TextUtils.isEmpty(m94947M4())) {
                    str2 = m94947M4();
                } else {
                    str2 = this.f90618F0.f91013r;
                }
                if (TextUtils.isEmpty(str2)) {
                    C17969i0 c17969i02 = this.f90618F0;
                    if (c17969i02 instanceof C17961f1) {
                        str2 = ((C17961f1) c17969i02).m95500s();
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    C17969i0 c17969i03 = this.f90618F0;
                    if ((c17969i03 instanceof C17961f1) && !((C17961f1) c17969i03).m95463Q()) {
                        return ((C17961f1) this.f90618F0).m95454H();
                    }
                    return str2;
                }
                return str2;
            }
            return this.f90618F0.f91013r;
        }
        if (m95276v6()) {
            C17969i0 c17969i04 = this.f90618F0;
            if (c17969i04 instanceof C17990p0) {
                if (!this.f90767z1 && !TextUtils.isEmpty(((C17990p0) c17969i04).f91116E)) {
                    str = ((C17990p0) this.f90618F0).f91116E;
                } else {
                    str = this.f90618F0.f91013r;
                }
                if (TextUtils.isEmpty(str)) {
                    return ((C17990p0) this.f90618F0).f91119H;
                }
                return str;
            }
        } else if (m94960N7() && (this.f90618F0 instanceof C18013y0)) {
            if (!this.f90767z1 && !TextUtils.isEmpty(m94983Q3())) {
                return m94983Q3();
            }
            return this.f90618F0.f91013r;
        }
        return "";
    }

    /* renamed from: u3 */
    public String m95267u3() {
        return this.f90656S;
    }

    /* renamed from: u4 */
    public float m95268u4() {
        if (this.f90650Q < 0) {
            return 0.0f;
        }
        return ((float) m95260t4()) / ((float) this.f90650Q);
    }

    /* renamed from: u7 */
    public boolean m95269u7() {
        if (!m95042W5() && !m94941L6() && !m95298x8()) {
            return false;
        }
        return true;
    }

    /* renamed from: u8 */
    public boolean m95270u8() {
        int i11 = this.f90626I;
        if (i11 != 2 && i11 != 3 && i11 != 4 && m94869D4() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: ub */
    public void m95271ub(boolean z11) {
        this.f90750v0 = z11;
    }

    /* renamed from: uc */
    public void m95272uc() {
        m95165ic(7, true);
        m95203mc();
    }

    /* renamed from: v2 */
    public void m95273v2(String str) {
        this.f90608C1 = m94836y2(str);
    }

    /* renamed from: v3 */
    public int m95274v3() {
        return this.f90711k1;
    }

    /* renamed from: v4 */
    public C17997r1 m95275v4() {
        return this.f90654R0;
    }

    /* renamed from: v6 */
    public boolean m95276v6() {
        return this.f90614E == 22;
    }

    /* renamed from: v7 */
    public boolean m95277v7() {
        int i11 = this.f90614E;
        if (i11 != 12) {
            if (i11 != 24) {
                if (i11 == 26 || i11 == 36 || i11 == 33 || i11 == 34) {
                    return false;
                }
                return true;
            }
            return m95037W0();
        }
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 != null) {
            if (TextUtils.equals(c17969i0.f91016u, "recommened.calltime") || TextUtils.equals(this.f90618F0.f91016u, "recommened.misscall")) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: v8 */
    public boolean m95278v8() {
        if (!m95162i8()) {
            return false;
        }
        if (this.f90673X1 == EnumC24253d.f117154q && !AbstractC0924m0.m4401zb()) {
            return true;
        }
        if (this.f90673X1 == EnumC24253d.f117155r && !AbstractC0924m0.m2903Ab()) {
            return true;
        }
        if (m94889F6() || this.f90673X1 != EnumC24253d.f117156s || AbstractC0924m0.m2932Bb()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x0914, code lost:            r27.f90618F0 = new dj.C17958e1(r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:341:?, code lost:            return;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:14:0x003e, B:16:0x0053, B:19:0x0060, B:21:0x006d, B:23:0x0077, B:24:0x008a, B:27:0x0086, B:29:0x0069), top: B:13:0x003e, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029e A[Catch: Exception -> 0x028d, TryCatch #1 {Exception -> 0x028d, blocks: (B:42:0x0298, B:44:0x029e, B:46:0x02b3, B:48:0x02bb, B:50:0x02c4, B:55:0x02ce, B:57:0x02d4, B:59:0x02e9, B:61:0x02ef, B:63:0x0310, B:64:0x0314, B:66:0x0323, B:68:0x0329, B:72:0x0331, B:74:0x0337, B:76:0x0352, B:78:0x035a, B:82:0x0364, B:85:0x036c, B:94:0x0393, B:100:0x0396, B:102:0x03a9, B:104:0x03af, B:106:0x03cb, B:107:0x03d4, B:110:0x03e0, B:112:0x03d0, B:113:0x03eb, B:115:0x03f1, B:117:0x040a, B:119:0x0413, B:121:0x0424, B:126:0x042d, B:128:0x0433, B:130:0x0444, B:133:0x044c, B:135:0x046b, B:137:0x0475, B:139:0x047b, B:141:0x0487, B:145:0x049f, B:147:0x04a5, B:149:0x04b2, B:151:0x04c8, B:154:0x04e8, B:156:0x04fe, B:159:0x051a, B:161:0x0520, B:163:0x0531, B:165:0x0537, B:167:0x0540, B:169:0x0546, B:171:0x0550, B:174:0x0585, B:176:0x058b, B:178:0x0594, B:180:0x059a, B:182:0x05ab, B:185:0x05b7, B:188:0x05bf, B:190:0x05c9, B:192:0x05e5, B:194:0x05ee, B:195:0x05f1, B:197:0x05fd, B:199:0x0613, B:201:0x061c, B:202:0x061f, B:204:0x062b, B:206:0x0641, B:208:0x064a, B:209:0x064d, B:211:0x0659, B:213:0x0661, B:215:0x0670, B:217:0x0686, B:218:0x0691, B:220:0x069a, B:222:0x06ab, B:224:0x06b1, B:226:0x06ba, B:228:0x06c0, B:230:0x06c9, B:232:0x06cf, B:234:0x06e0, B:236:0x06e4, B:238:0x06ec, B:240:0x06f4, B:242:0x0703, B:244:0x070c, B:246:0x0716, B:248:0x072e, B:250:0x073a, B:252:0x0748, B:254:0x0752, B:256:0x075c, B:257:0x0766, B:259:0x077a, B:261:0x0786, B:263:0x078c, B:265:0x0795, B:267:0x079b, B:269:0x07a3, B:270:0x07aa, B:273:0x07b2, B:275:0x07d0, B:277:0x07a6, B:278:0x07f1, B:280:0x07fb, B:282:0x0804, B:283:0x080a, B:285:0x0810, B:286:0x0823, B:288:0x081d, B:290:0x0827, B:292:0x0833, B:294:0x084b, B:296:0x0857, B:298:0x085d, B:299:0x0862, B:301:0x0860, B:302:0x086a, B:304:0x0876, B:306:0x0880, B:308:0x088c, B:310:0x0896, B:312:0x08a2, B:316:0x08ac, B:318:0x08b2, B:320:0x08bb, B:322:0x08c1, B:324:0x08ca, B:326:0x08d0, B:328:0x08d9, B:330:0x08df, B:332:0x08f4, B:334:0x08fa, B:337:0x0901, B:340:0x0914, B:428:0x0289, B:88:0x0372, B:90:0x037c), top: B:427:0x0289, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ce A[Catch: Exception -> 0x028d, TryCatch #1 {Exception -> 0x028d, blocks: (B:42:0x0298, B:44:0x029e, B:46:0x02b3, B:48:0x02bb, B:50:0x02c4, B:55:0x02ce, B:57:0x02d4, B:59:0x02e9, B:61:0x02ef, B:63:0x0310, B:64:0x0314, B:66:0x0323, B:68:0x0329, B:72:0x0331, B:74:0x0337, B:76:0x0352, B:78:0x035a, B:82:0x0364, B:85:0x036c, B:94:0x0393, B:100:0x0396, B:102:0x03a9, B:104:0x03af, B:106:0x03cb, B:107:0x03d4, B:110:0x03e0, B:112:0x03d0, B:113:0x03eb, B:115:0x03f1, B:117:0x040a, B:119:0x0413, B:121:0x0424, B:126:0x042d, B:128:0x0433, B:130:0x0444, B:133:0x044c, B:135:0x046b, B:137:0x0475, B:139:0x047b, B:141:0x0487, B:145:0x049f, B:147:0x04a5, B:149:0x04b2, B:151:0x04c8, B:154:0x04e8, B:156:0x04fe, B:159:0x051a, B:161:0x0520, B:163:0x0531, B:165:0x0537, B:167:0x0540, B:169:0x0546, B:171:0x0550, B:174:0x0585, B:176:0x058b, B:178:0x0594, B:180:0x059a, B:182:0x05ab, B:185:0x05b7, B:188:0x05bf, B:190:0x05c9, B:192:0x05e5, B:194:0x05ee, B:195:0x05f1, B:197:0x05fd, B:199:0x0613, B:201:0x061c, B:202:0x061f, B:204:0x062b, B:206:0x0641, B:208:0x064a, B:209:0x064d, B:211:0x0659, B:213:0x0661, B:215:0x0670, B:217:0x0686, B:218:0x0691, B:220:0x069a, B:222:0x06ab, B:224:0x06b1, B:226:0x06ba, B:228:0x06c0, B:230:0x06c9, B:232:0x06cf, B:234:0x06e0, B:236:0x06e4, B:238:0x06ec, B:240:0x06f4, B:242:0x0703, B:244:0x070c, B:246:0x0716, B:248:0x072e, B:250:0x073a, B:252:0x0748, B:254:0x0752, B:256:0x075c, B:257:0x0766, B:259:0x077a, B:261:0x0786, B:263:0x078c, B:265:0x0795, B:267:0x079b, B:269:0x07a3, B:270:0x07aa, B:273:0x07b2, B:275:0x07d0, B:277:0x07a6, B:278:0x07f1, B:280:0x07fb, B:282:0x0804, B:283:0x080a, B:285:0x0810, B:286:0x0823, B:288:0x081d, B:290:0x0827, B:292:0x0833, B:294:0x084b, B:296:0x0857, B:298:0x085d, B:299:0x0862, B:301:0x0860, B:302:0x086a, B:304:0x0876, B:306:0x0880, B:308:0x088c, B:310:0x0896, B:312:0x08a2, B:316:0x08ac, B:318:0x08b2, B:320:0x08bb, B:322:0x08c1, B:324:0x08ca, B:326:0x08d0, B:328:0x08d9, B:330:0x08df, B:332:0x08f4, B:334:0x08fa, B:337:0x0901, B:340:0x0914, B:428:0x0289, B:88:0x0372, B:90:0x037c), top: B:427:0x0289, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* renamed from: v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m95279v9(String str, int i11, boolean z11, boolean z12, int i12) {
        String str2;
        ?? r17;
        String str3;
        String str4;
        C17978l0 c17978l0;
        C17970i1 c17970i1;
        int i13 = i11;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str2 = "";
        try {
            if (i13 == 15) {
                if (m95015T7()) {
                    JSONArray jSONArray = new JSONArray(str);
                    this.f90615E0 = new ArrayList();
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        try {
                            c17970i1 = new C17970i1(jSONArray.getJSONObject(i14));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (!c17970i1.m95607i().equals("l.a.header.only") && !c17970i1.m95607i().equals("l.a.header.full")) {
                            this.f90615E0.add(c17970i1);
                            if (i14 == 0) {
                                this.f90745u = TextUtils.isEmpty(c17970i1.m95606h()) ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_link), "") : c17970i1.m95606h();
                            }
                        }
                        this.f90611D0 = c17970i1;
                        if (i14 == 0) {
                        }
                    }
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z12) {
                try {
                    r17 = m94656E8();
                    try {
                        if (r17 == 0) {
                            String optString = jSONObject.optString("title");
                            if (TextUtils.isEmpty(optString)) {
                                r17 = "extInfo";
                                str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                                str4 = "catId";
                            } else {
                                C31986k3 c31986k3 = C31986k3.f147083a;
                                String str5 = this.f90737s;
                                r17 = "extInfo";
                                try {
                                    String str6 = this.f90733r;
                                    str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                                    str4 = "catId";
                                    C31867c4 m154091H0 = c31986k3.m154091H0(optString, str5, str6, i12, this.f90765z);
                                    String str7 = (String) m154091H0.m153163a();
                                    if (str7 == null) {
                                        m94825vc(true, m154091H0.m153164b());
                                        return;
                                    } else {
                                        jSONObject.put("title", str7);
                                        r17 = r17;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                                    str4 = "catId";
                                    try {
                                        AbstractC20110a.m104539h(e);
                                        if (m95120e6()) {
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        i13 = i11;
                                        AbstractC20110a.m104540i(e, "ChatRichContent failed: " + this.f90614E + " originalType: " + i13, new Object[0]);
                                    }
                                }
                            }
                            String optString2 = jSONObject.optString("href");
                            if (!TextUtils.isEmpty(optString2)) {
                                C31867c4 m154097K0 = C31986k3.f147083a.m154097K0(optString2, this.f90737s, this.f90733r, i12, this.f90765z);
                                String str8 = (String) m154097K0.m153163a();
                                if (str8 == null) {
                                    m94825vc(true, m154097K0.m153164b());
                                    return;
                                }
                                jSONObject.put("href", str8);
                            }
                            String optString3 = jSONObject.optString("thumb");
                            if (!TextUtils.isEmpty(optString3)) {
                                C31867c4 m154097K02 = C31986k3.f147083a.m154097K0(optString3, this.f90737s, this.f90733r, i12, this.f90765z);
                                String str9 = (String) m154097K02.m153163a();
                                if (str9 == null) {
                                    m94825vc(true, m154097K02.m153164b());
                                    return;
                                }
                                jSONObject.put("thumb", str9);
                            }
                            String optString4 = jSONObject.optString("description");
                            if (!TextUtils.isEmpty(optString4)) {
                                C31867c4 m154091H02 = C31986k3.f147083a.m154091H0(optString4, this.f90737s, this.f90733r, i12, this.f90765z);
                                String str10 = (String) m154091H02.m153163a();
                                if (str10 == null) {
                                    m94825vc(true, m154091H02.m153164b());
                                    return;
                                }
                                jSONObject.put("description", str10);
                            }
                            String optString5 = jSONObject.optString("params");
                            String optString6 = jSONObject.optString("action");
                            if (m94847A6() && m94977P7() && (TextUtils.equals(optString6, "recommened.user") || TextUtils.equals(optString6, "recommened.vip"))) {
                                jSONObject.put("params", "");
                            } else if (!TextUtils.isEmpty(optString5)) {
                                C31867c4 m154091H03 = C31986k3.f147083a.m154091H0(optString5, this.f90737s, this.f90733r, i12, this.f90765z);
                                String str11 = (String) m154091H03.m153163a();
                                if (str11 == null) {
                                    m94825vc(true, m154091H03.m153164b());
                                    return;
                                }
                                jSONObject.put("params", str11);
                            }
                        } else {
                            r17 = "extInfo";
                            str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                            str4 = "catId";
                            String optString7 = jSONObject.optString("params");
                            JSONObject jSONObject2 = !TextUtils.isEmpty(optString7) ? new JSONObject(optString7) : null;
                            List<String> m96092k = jSONObject2 != null ? AbstractC18069a.m96092k(jSONObject2.optJSONArray("encrypted")) : null;
                            if (m96092k != null && !m96092k.isEmpty()) {
                                ArrayList arrayList = new ArrayList(m96092k.size());
                                for (String str12 : m96092k) {
                                    if (!TextUtils.isEmpty(str12)) {
                                        C31867c4 m154091H04 = C31986k3.f147083a.m154091H0(str12, this.f90737s, this.f90733r, i12, this.f90765z);
                                        if (m154091H04.m153163a() != null) {
                                            arrayList.add((String) m154091H04.m153163a());
                                        } else {
                                            m94825vc(true, m154091H04.m153164b());
                                            return;
                                        }
                                    } else {
                                        arrayList.add("");
                                    }
                                }
                                if (arrayList.size() == m96092k.size()) {
                                    jSONObject2.put("decrypted", new JSONArray((Collection) arrayList));
                                    jSONObject.put("params", jSONObject2.toString());
                                } else {
                                    m94825vc(true, -1);
                                    return;
                                }
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        AbstractC20110a.m104539h(e);
                        if (m95120e6()) {
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    r17 = "extInfo";
                }
            } else {
                r17 = "extInfo";
                str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                str4 = "catId";
            }
            if (m95120e6()) {
                C17981m0 c17981m0 = new C17981m0(jSONObject);
                this.f90618F0 = c17981m0;
                this.f90753w = c17981m0.f91014s;
                this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_doodle);
                if (z11 && !TextUtils.isEmpty(this.f90753w) && AbstractC19646n0.m102927R0(this.f90753w) == 2) {
                    this.f90761y = m94715T2(this.f90753w);
                    return;
                }
                return;
            }
            if (m95298x8()) {
                C17999s0 c17999s0 = new C17999s0(jSONObject);
                this.f90618F0 = c17999s0;
                this.f90753w = c17999s0.f91014s;
                this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_livestream);
                return;
            }
            if (m94871D7()) {
                AbstractC19646n0.m102968d2(jSONObject);
                C18009w0 c18009w0 = new C18009w0(jSONObject);
                this.f90618F0 = c18009w0;
                String str13 = c18009w0.f91014s;
                this.f90753w = str13;
                this.f90749v = str13;
                this.f90757x = c18009w0.f91013r;
                int i15 = AbstractC8020f0.str_type_msg_photo;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(c18009w0.f91011p) ? "" : this.f90618F0.f91011p;
                this.f90745u = AbstractC23136l9.m118746s0(i15, objArr);
                String m95293x2 = m95293x2();
                if (!z11 || TextUtils.isEmpty(m95293x2)) {
                    return;
                }
                this.f90761y = m95176k4(m95293x2);
                return;
            }
            if (m94890F7()) {
                C18009w0 c18009w02 = new C18009w0(jSONObject);
                this.f90618F0 = c18009w02;
                String str14 = c18009w02.f91014s;
                this.f90753w = str14;
                this.f90749v = str14;
                this.f90757x = c18009w02.f91013r;
                this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker);
                if (!z11 || TextUtils.isEmpty(this.f90753w)) {
                    return;
                }
                this.f90761y = m95176k4(this.f90753w);
                return;
            }
            if (m95306y8()) {
                if (z11 && jSONObject.has("params")) {
                    try {
                        String m96089h = AbstractC18069a.m96089h(jSONObject, "params");
                        if (!TextUtils.isEmpty(m96089h)) {
                            JSONObject jSONObject3 = new JSONObject(m96089h);
                            jSONObject3.remove("video_thumb_local_path");
                            jSONObject.remove("params");
                            jSONObject.put("params", jSONObject3.toString());
                        }
                    } catch (Exception e16) {
                        AbstractC20110a.m104539h(e16);
                    }
                }
                C17961f1 c17961f1 = new C17961f1(jSONObject);
                this.f90618F0 = c17961f1;
                this.f90753w = c17961f1.f91014s;
                String str15 = c17961f1.f91013r;
                this.f90749v = str15;
                this.f90757x = str15;
                return;
            }
            if (m94949M6()) {
                C18002t0 c18002t0 = new C18002t0(jSONObject);
                this.f90618F0 = c18002t0;
                this.f90753w = c18002t0.f91014s;
                this.f90749v = c18002t0.f91013r;
                m95174jc();
                String str16 = !TextUtils.isEmpty(this.f90618F0.f91011p) ? this.f90618F0.f91011p : this.f90618F0.f91015t;
                int i16 = AbstractC8020f0.str_type_msg_location;
                Object[] objArr2 = new Object[1];
                objArr2[0] = TextUtils.isEmpty(str16) ? "" : str16;
                this.f90745u = AbstractC23136l9.m118746s0(i16, objArr2);
                return;
            }
            if (m94941L6()) {
                this.f90618F0 = new C17996r0(jSONObject);
                this.f90745u = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_type_msg_live_location_v2);
                if (z11) {
                    C17969i0 c17969i0 = this.f90618F0;
                    if (((C17996r0) c17969i0).f91151F) {
                        return;
                    }
                    ((C17996r0) c17969i0).f91151F = true;
                    ((C17996r0) c17969i0).m95683k();
                    if (m95032V6()) {
                        C8967m.m47867E().m47940u(this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (m95316z8()) {
                this.f90618F0 = new C17964g1(jSONObject);
                this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_voice);
                return;
            }
            if (m95226p6()) {
                this.f90618F0 = new C17984n0(jSONObject);
                this.f90745u = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_ecard);
                if (!TextUtils.isEmpty(((C17984n0) this.f90618F0).f91083F)) {
                    this.f90745u = ((C17984n0) this.f90618F0).f91083F;
                    return;
                }
                if (m94932K6()) {
                    String str17 = ((C17984n0) this.f90618F0).f91079B;
                    if (TextUtils.isEmpty(str17)) {
                        return;
                    }
                    this.f90745u += " " + str17;
                    return;
                }
                return;
            }
            if (m95276v6()) {
                C17990p0 c17990p0 = new C17990p0(jSONObject);
                this.f90618F0 = c17990p0;
                if (c17990p0.m95670k()) {
                    this.f90745u = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_folder);
                    if (TextUtils.isEmpty(this.f90618F0.f91011p)) {
                        return;
                    }
                    this.f90745u += " " + ((C17990p0) this.f90618F0).m95667h();
                    return;
                }
                this.f90745u = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_file);
                if (TextUtils.isEmpty(this.f90618F0.f91011p)) {
                    return;
                }
                this.f90745u += " " + this.f90618F0.f91011p;
                return;
            }
            if (m95314z6()) {
                this.f90618F0 = new C17993q0(jSONObject);
                this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_gif);
                return;
            }
            if (m95031V5()) {
                this.f90618F0 = new C17955d1(jSONObject);
                if (z11) {
                    return;
                }
                if (m95032V6()) {
                    this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.chat_theme_changed_by_me);
                    return;
                }
                String m94755g3 = m94755g3();
                ((C17955d1) this.f90618F0).f90892F = new C7907e.a(Long.parseLong(this.f90733r), 0, m94755g3.length());
                C17969i0 c17969i02 = this.f90618F0;
                c17969i02.f91017v = ((C17955d1) c17969i02).m95415h();
                this.f90745u = AbstractC23136l9.m118746s0(AbstractC8020f0.chat_theme_changed_by_friend, m94755g3);
                return;
            }
            if (m95161i7()) {
                this.f90618F0 = new C18005u0(jSONObject);
                return;
            }
            if (m94872D8()) {
                C17967h1 c17967h1 = new C17967h1(jSONObject);
                this.f90618F0 = c17967h1;
                if (TextUtils.isEmpty(c17967h1.m95579j())) {
                    return;
                }
                this.f90745u = ((C17967h1) this.f90618F0).m95579j();
                return;
            }
            if (m95110d8()) {
                if (z12) {
                    String optString8 = jSONObject.optString("id");
                    if (!TextUtils.isEmpty(optString8)) {
                        C31867c4 m154094J0 = C31986k3.f147083a.m154094J0(optString8, this.f90737s, this.f90733r, i12, this.f90765z);
                        Integer num = (Integer) m154094J0.m153163a();
                        if (num == null) {
                            m94825vc(true, m154094J0.m153164b());
                            return;
                        }
                        jSONObject.put("id", num);
                    }
                    String str18 = str4;
                    String optString9 = jSONObject.optString(str18);
                    if (!TextUtils.isEmpty(optString9)) {
                        C31867c4 m154094J02 = C31986k3.f147083a.m154094J0(optString9, this.f90737s, this.f90733r, i12, this.f90765z);
                        Integer num2 = (Integer) m154094J02.m153163a();
                        if (num2 == null) {
                            m94825vc(true, m154094J02.m153164b());
                            return;
                        }
                        jSONObject.put(str18, num2);
                    }
                    String str19 = str3;
                    String optString10 = jSONObject.optString(str19);
                    if (!TextUtils.isEmpty(optString10)) {
                        C31867c4 m154094J03 = C31986k3.f147083a.m154094J0(optString10, this.f90737s, this.f90733r, i12, this.f90765z);
                        Integer num3 = (Integer) m154094J03.m153163a();
                        if (num3 == null) {
                            m94825vc(true, m154094J03.m153164b());
                            return;
                        }
                        jSONObject.put(str19, num3);
                    }
                    String str20 = r17;
                    String optString11 = jSONObject.optString(str20);
                    if (!TextUtils.isEmpty(optString11) && !optString11.equals("null")) {
                        JSONObject jSONObject4 = new JSONObject(optString11);
                        String optString12 = jSONObject4.optString("params");
                        if (!TextUtils.isEmpty(optString12)) {
                            C31867c4 m154091H05 = C31986k3.f147083a.m154091H0(optString12, this.f90737s, this.f90733r, i12, this.f90765z);
                            String str21 = (String) m154091H05.m153163a();
                            if (str21 != null) {
                                jSONObject4.put("params", str21);
                                jSONObject.put(str20, jSONObject4.toString());
                            } else {
                                m94825vc(true, m154091H05.m153164b());
                                return;
                            }
                        }
                    }
                }
                this.f90618F0 = new C17949b1(jSONObject);
                this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker);
                return;
            }
            if (m95013T5()) {
                this.f90627I0 = new C26709a(jSONObject);
                return;
            }
            if (m95208n8()) {
                this.f90618F0 = new C18015z0(jSONObject);
                return;
            }
            if (m94977P7()) {
                C18013y0 c18013y0 = new C18013y0(jSONObject);
                this.f90618F0 = c18013y0;
                this.f90753w = c18013y0.f91014s;
                this.f90749v = c18013y0.f91013r;
                if (z12 && (c17978l0 = c18013y0.f91253D) != null && TextUtils.isEmpty(c18013y0.f91017v) && !TextUtils.isEmpty(c17978l0.f91055c)) {
                    String m153506h = C31943h5.f146766a.m153506h(c17978l0.f91055c, true, true);
                    if (!TextUtils.isEmpty(m153506h)) {
                        this.f90618F0.f91017v = m153506h;
                        jSONObject.put("params", m153506h);
                    }
                }
                if (z11) {
                    return;
                }
                if (TextUtils.equals(this.f90618F0.f91016u, "recommened.vip")) {
                    this.f90745u = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_contact), this.f90618F0.f91011p);
                    return;
                }
                if (this.f90618F0.f91016u.equals("recommened.misscall")) {
                    C17969i0 c17969i03 = this.f90618F0;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_missCall);
                    c17969i03.f91011p = m118743r0;
                    this.f90745u = m118743r0;
                    return;
                }
                if (TextUtils.equals(this.f90618F0.f91016u, "recommened.user")) {
                    if (!TextUtils.isEmpty(this.f90618F0.f91017v)) {
                        C17969i0 c17969i04 = this.f90618F0;
                        str2 = AbstractC21935u.m114542i(c17969i04.f91017v, c17969i04.f91011p);
                    }
                    this.f90745u = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_contact), str2);
                    return;
                }
                if (TextUtils.equals(this.f90618F0.f91016u, "recommened.link")) {
                    C17969i0 c17969i05 = this.f90618F0;
                    C32098s c32098s = c17969i05 instanceof C18013y0 ? ((C18013y0) c17969i05).f91251B : null;
                    if (c32098s != null && c32098s.m154942l()) {
                        String str22 = !TextUtils.isEmpty(c32098s.f147953c) ? c32098s.f147953c : this.f90618F0.f91011p;
                        if (TextUtils.isEmpty(str22)) {
                            this.f90745u = "[" + AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_video) + "]";
                            return;
                        }
                        this.f90745u = "[" + AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_video) + "] " + str22;
                        return;
                    }
                    String str23 = this.f90618F0.f91011p;
                    if (TextUtils.isEmpty(str23)) {
                        C17969i0 c17969i06 = this.f90618F0;
                        if (((C18013y0) c17969i06).f91251B != null) {
                            str23 = ((C18013y0) c17969i06).f91251B.f147953c;
                        }
                    }
                    this.f90745u = !TextUtils.isEmpty(str23) ? AbstractC23136l9.m118746s0(AbstractC8020f0.str_type_msg_link, str23) : AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_recommend_link_default);
                    return;
                }
                if (TextUtils.equals(this.f90618F0.f91016u, "recommened.stickerset")) {
                    this.f90745u = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker_set), this.f90618F0.f91011p);
                    return;
                }
                if (TextUtils.equals(this.f90618F0.f91016u, "recommened.calltime")) {
                    this.f90745u = AbstractC23136l9.m118743r0(m95032V6() ? AbstractC8020f0.str_msg_has_called : AbstractC8020f0.str_msg_has_received_call);
                    return;
                }
                if (TextUtils.equals(this.f90618F0.f91016u, "recommened.game")) {
                    this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_recommend_game_set);
                    return;
                } else if (TextUtils.equals(this.f90618F0.f91016u, "recommened.msg.game")) {
                    this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_recommend_game_set);
                    return;
                } else {
                    if (TextUtils.equals(this.f90618F0.f91016u, "recommened.groupcall")) {
                        this.f90745u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_ongoing_status);
                        return;
                    }
                    return;
                }
            }
            if (m95122e8()) {
                this.f90618F0 = new C17952c1(jSONObject);
                return;
            }
            if (m94899G7()) {
                this.f90618F0 = new C18011x0(jSONObject);
                return;
            }
            if (m95109d6()) {
                this.f90618F0 = new C17946a1(jSONObject);
                return;
            }
            if (m95261t6()) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("params", jSONObject.toString());
                this.f90618F0 = new C17987o0(jSONObject5);
                return;
            }
            if (!m95219o8() && !m95091b6()) {
                C17969i0 c17969i07 = new C17969i0(jSONObject);
                this.f90618F0 = c17969i07;
                this.f90753w = c17969i07.f91014s;
                this.f90749v = c17969i07.f91013r;
                return;
            }
            if (i11 == 36) {
                this.f90624H0 = new C7940a(jSONObject, this.f90737s);
                return;
            }
            if (i11 != 3 && i11 != 4 && i11 != 31) {
                if (i11 != 19) {
                    if (i11 == 10) {
                        C17958e1 m95416h = C17958e1.m95416h(new C17949b1(jSONObject).m95398h());
                        this.f90618F0 = m95416h;
                        m95416h.m95418A();
                        return;
                    }
                    return;
                }
                C17961f1 c17961f12 = new C17961f1(jSONObject);
                if (c17961f12.m95460N()) {
                    C17958e1 c17958e1 = new C17958e1(19, c17961f12.m95460N(), c17961f12.m95487l(), c17961f12.m95489m(), c17961f12.m95493o());
                    this.f90618F0 = c17958e1;
                    c17958e1.m95418A();
                    return;
                }
                return;
            }
            C18009w0 c18009w03 = new C18009w0(jSONObject);
            if (c18009w03.m95743H()) {
                C17958e1 c17958e12 = new C17958e1(3, c18009w03.m95743H(), c18009w03.m95777m(), c18009w03.m95779n(), c18009w03.m95788v());
                this.f90618F0 = c17958e12;
                c17958e12.m95418A();
            }
        } catch (Exception e17) {
            e = e17;
            AbstractC20110a.m104540i(e, "ChatRichContent failed: " + this.f90614E + " originalType: " + i13, new Object[0]);
        }
    }

    /* renamed from: va */
    public void m95280va(long j11) {
        this.f90751v1 = j11;
    }

    /* renamed from: vb */
    public void m95281vb(long j11) {
        this.f90765z = j11;
    }

    /* renamed from: w1 */
    public void m95282w1() {
        C17997r1 c17997r1 = this.f90654R0;
        if (c17997r1 != null && c17997r1.m95698o()) {
            this.f90654R0.m95700q(-1);
            C23288a.f113033a.mo13474a(new C18427b(this.f90737s, new Runnable() { // from class: dj.m
                public /* synthetic */ RunnableC17980m() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.this.m94663G8();
                }
            }));
        }
    }

    /* renamed from: w2 */
    public String m95283w2(boolean z11, boolean z12) {
        if (z12) {
            return C20131e.f99303a.m104975u(this.f90737s) + AbstractC19646n0.m102974f0(this, false);
        }
        if (Build.VERSION.SDK_INT < 29) {
            return AbstractC20130d.m104855S() + AbstractC19646n0.m102974f0(this, z11);
        }
        return AbstractC20130d.f99272c + File.separator + AbstractC19646n0.m102974f0(this, z11);
    }

    /* renamed from: w3 */
    public String m95284w3() {
        return AbstractC23160o0.m119276o0(m94991R2());
    }

    /* renamed from: w4 */
    public C17970i1 m95285w4() {
        return this.f90611D0;
    }

    /* renamed from: w6 */
    public boolean m95286w6() {
        return this.f90711k1 == 1;
    }

    /* renamed from: w7 */
    public boolean m95287w7() {
        EnumC27374a enumC27374a;
        C17979l1 c17979l1 = this.f90669W0;
        if (c17979l1 != null && ((enumC27374a = c17979l1.f91068k) == EnumC27374a.f128967t || enumC27374a == EnumC27374a.f128968u)) {
            return true;
        }
        return false;
    }

    /* renamed from: w8 */
    public boolean m95288w8() {
        C17979l1 c17979l1 = this.f90669W0;
        if (c17979l1 != null && c17979l1.f91060c == 1003) {
            return true;
        }
        return false;
    }

    /* renamed from: wa */
    public void m95289wa(C31897e4 c31897e4) {
        this.f90622G1 = c31897e4;
    }

    /* renamed from: wb */
    public void m95290wb(C7908f c7908f) {
        this.f90647P = c7908f;
    }

    /* renamed from: wc */
    public void m95291wc() {
        if (this.f90614E != 52) {
            this.f90614E = 52;
            this.f90745u = m94772k3(false);
        }
    }

    /* renamed from: x1 */
    public void m95292x1() {
        try {
            if (this.f90718m2) {
                m94951M9();
                this.f90718m2 = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f90718m2 = false;
        }
    }

    /* renamed from: x2 */
    public String m95293x2() {
        String m95090b5 = m95090b5();
        if (m94871D7()) {
            return AbstractC3972e.m18759P(m95090b5());
        }
        if (m95031V5()) {
            C17955d1 c17955d1 = (C17955d1) this.f90618F0;
            if (c17955d1 != null) {
                return c17955d1.f90891E;
            }
            return m95090b5;
        }
        if (m95316z8()) {
            C17964g1 c17964g1 = (C17964g1) this.f90618F0;
            if (c17964g1 != null && !TextUtils.isEmpty(c17964g1.m95534l())) {
                return c17964g1.m95534l();
            }
            return m95090b5;
        }
        if (m94960N7()) {
            if (!TextUtils.isEmpty(m95131f5())) {
                return AbstractC3972e.m18759P(m95131f5());
            }
            return "";
        }
        return m95090b5;
    }

    /* renamed from: x3 */
    public int m95294x3() {
        return this.f90621G0;
    }

    /* renamed from: x4 */
    public int m95295x4() {
        return this.f90755w1;
    }

    /* renamed from: x6 */
    public boolean m95296x6() {
        return this.f90718m2;
    }

    /* renamed from: x7 */
    boolean m95297x7() {
        try {
            C17969i0 c17969i0 = this.f90618F0;
            if (c17969i0 != null && (c17969i0 instanceof C17961f1)) {
                C17961f1 c17961f1 = (C17961f1) c17969i0;
                if (!TextUtils.isEmpty(c17961f1.m95483j()) && new File(c17961f1.m95483j()).exists()) {
                    return false;
                }
                if (c17961f1.m95459M() && !c17961f1.m95463Q()) {
                    return false;
                }
                if (!c17961f1.m95464R() && !c17961f1.m95463Q() && !c17961f1.m95466T()) {
                    boolean m95465S = c17961f1.m95465S();
                    return AbstractC3460h.m17452t(m95465S ? 1 : 0, c17961f1.m95448D(), c17961f1.m95446C(), c17961f1.m95512y(), c17961f1.m95502t(), c17961f1.m95479h(), c17961f1.m95506v(), c17961f1.m95450E(), c17961f1.m95444B(), c17961f1.m95510x());
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: x8 */
    public boolean m95298x8() {
        return this.f90614E == 25;
    }

    /* renamed from: xa */
    public void m95299xa(String str) {
        this.f90656S = str;
    }

    /* renamed from: xb */
    public void m95300xb(int i11) {
        this.f90766z0 = i11;
    }

    /* renamed from: xc */
    public void m95301xc(int i11) {
        C17969i0 c17969i0 = this.f90618F0;
        if (c17969i0 != null && (c17969i0 instanceof C17964g1)) {
            C17964g1 c17964g1 = (C17964g1) c17969i0;
            if (c17964g1.m95530g() != i11) {
                c17964g1.m95544w(i11);
                c17964g1.m95529J();
                C7956b.m41474B().m41515K0(this, c17964g1);
            }
        }
    }

    /* renamed from: y1 */
    public boolean m95302y1(int i11) {
        if ((i11 == 7 || i11 == 404) && !AbstractC19646n0.m103038v1(this.f90755w1, this.f90765z)) {
            return true;
        }
        return false;
    }

    /* renamed from: y4 */
    public long m95303y4() {
        return this.f90741t;
    }

    /* renamed from: y6 */
    public boolean m95304y6() {
        return this.f90644O == 5;
    }

    /* renamed from: y7 */
    public boolean m95305y7() {
        return this.f90721n2;
    }

    /* renamed from: y8 */
    public boolean m95306y8() {
        return this.f90614E == 19;
    }

    /* renamed from: ya */
    public void m95307ya(int i11) {
        this.f90621G0 = i11;
    }

    /* renamed from: yb */
    public void m95308yb(EnumC22425a enumC22425a) {
        this.f90599A0 = enumC22425a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: dj.s.<init>(dj.a0, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: yc */
    public void m95309yc() {
        /*
            r4 = this;
            dj.i0 r0 = r4.f90618F0
            if (r0 == 0) goto L28
            boolean r1 = r0 instanceof dj.C17964g1
            if (r1 == 0) goto L28
            dj.g1 r0 = (dj.C17964g1) r0
            java.lang.String r1 = r4.f90761y
            int r0 = r0.m95530g()
            if (r0 > 0) goto L28
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f90670W1
            r2 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 == 0) goto L28
            ag0.b1 r0 = ag0.AbstractC0837p0.m2225f()
            dj.s r2 = new dj.s
            r2.<init>()
            r0.mo2040a(r2)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C17945a0.m95309yc():void");
    }

    /* renamed from: z1 */
    public void m95310z1() {
        if (m95022U7() || this.f90609C2 || m95142g6() || !AbstractC31111g.m151135p(this)) {
            return;
        }
        if (m95306y8() || m95276v6()) {
            this.f90609C2 = true;
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: dj.v
                public /* synthetic */ RunnableC18006v() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17945a0.this.m94667H8();
                }
            });
        }
    }

    /* renamed from: z2 */
    TextPaint m95311z2() {
        C31890dc c31890dc;
        C13704p1 c13704p1 = new C13704p1(1);
        c13704p1.setTypeface(Typeface.DEFAULT);
        ((TextPaint) c13704p1).linkColor = AbstractC11531v0.m62222Y2();
        c13704p1.setColor(AbstractC11531v0.m62226Z2());
        int i11 = this.f90669W0.f91058a;
        float m118712h = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 16.0f);
        if (i11 > 0) {
            m118712h = (m118712h * i11) / 100.0f;
        }
        float m62206U2 = AbstractC11531v0.m62206U2() - (ChatRow.f57203M5 * 2);
        if (m118712h > m62206U2) {
            m118712h = m62206U2;
        }
        c13704p1.m76614d(m118712h, false);
        int m95620b = this.f90669W0.m95620b();
        if (m95620b != 1) {
            if (m95620b != 2) {
                if (m95620b != 3) {
                    if (m95620b == 4 && (c31890dc = this.f90669W0.f91066i) != null) {
                        c13704p1.setColor(c31890dc.m153237b());
                        c13704p1.m76614d(AbstractC23136l9.m118712h(MainApplication.getAppContext(), this.f90669W0.f91066i.f146497c), false);
                        Typeface m153062r0 = C31845ac.m152996J().m153062r0(this.f90669W0.f91066i.f146495a, this.f90669W0.f91066i.m153243k());
                        if (m153062r0 != null) {
                            c13704p1.setTypeface(m153062r0);
                        }
                    }
                } else {
                    c13704p1.setFlags(c13704p1.getFlags() | 8);
                }
            } else {
                c13704p1.setTextSkewX(-0.25f);
            }
        } else {
            c13704p1.setFlags(c13704p1.getFlags() | 32);
        }
        return c13704p1;
    }

    /* renamed from: z3 */
    public int m95312z3() {
        return this.f90690d1;
    }

    /* renamed from: z4 */
    public long m95313z4() {
        long j11 = this.f90598A;
        return j11 > 0 ? j11 : this.f90765z;
    }

    /* renamed from: z6 */
    public boolean m95314z6() {
        return this.f90614E == 23;
    }

    /* renamed from: z7 */
    public boolean m95315z7() {
        return this.f90724o2;
    }

    /* renamed from: z8 */
    public boolean m95316z8() {
        return this.f90614E == 6;
    }

    /* renamed from: za */
    public void m95317za(int i11) {
        this.f90690d1 = i11;
    }

    /* renamed from: zb */
    public void m95318zb(long j11) {
        this.f90650Q = j11;
    }

    /* renamed from: zc */
    public void m95319zc(int i11) {
        try {
            JSONObject jSONObject = new JSONObject(this.f90618F0.f91017v);
            jSONObject.put("zdataState", i11);
            ((C17967h1) this.f90618F0).m95591w(jSONObject);
            ((C17967h1) this.f90618F0).f90999Y = i11;
            C7956b.m41474B().m41513J0(this, this.f90618F0);
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    private C17945a0(MessageId messageId, int i11) {
        this.f90725p = -1;
        this.f90733r = "";
        this.f90737s = "";
        this.f90741t = -1L;
        this.f90745u = "";
        this.f90749v = "";
        this.f90753w = "";
        this.f90757x = "";
        this.f90761y = "";
        this.f90598A = 0L;
        this.f90610D = "";
        this.f90614E = 0;
        this.f90617F = "";
        this.f90620G = 1;
        this.f90623H = false;
        this.f90626I = -1;
        this.f90629J = 0;
        this.f90635L = false;
        this.f90638M = false;
        this.f90641N = -1L;
        this.f90644O = -1;
        this.f90647P = null;
        this.f90650Q = 0L;
        this.f90653R = false;
        this.f90656S = "";
        this.f90662U = (byte) 3;
        this.f90665V = 0;
        this.f90668W = 0;
        this.f90671X = 0;
        this.f90674Y = 0;
        this.f90677Z = new AtomicBoolean(false);
        this.f90680a0 = false;
        this.f90683b0 = false;
        this.f90686c0 = false;
        this.f90695f0 = false;
        this.f90698g0 = false;
        this.f90701h0 = false;
        this.f90730q0 = false;
        this.f90742t0 = 0L;
        this.f90746u0 = 0L;
        this.f90750v0 = false;
        this.f90754w0 = new AtomicInteger(0);
        this.f90758x0 = 0;
        this.f90762y0 = 0;
        this.f90766z0 = 0;
        this.f90599A0 = EnumC22425a.f109727r;
        this.f90603B0 = EnumC19038l.f94903p;
        this.f90607C0 = false;
        this.f90621G0 = -1;
        this.f90630J0 = false;
        this.f90636L0 = false;
        this.f90645O0 = false;
        this.f90648P0 = false;
        this.f90651Q0 = false;
        this.f90660T0 = false;
        this.f90663U0 = new ArrayList();
        this.f90666V0 = new ArrayList();
        this.f90693e1 = "";
        this.f90702h1 = new C26399a();
        this.f90708j1 = "";
        this.f90711k1 = 0;
        this.f90714l1 = 0L;
        this.f90717m1 = 1;
        this.f90723o1 = 0;
        this.f90727p1 = C32163w8.m155135a().f148289b;
        this.f90735r1 = false;
        this.f90743t1 = true;
        this.f90755w1 = 1;
        this.f90759x1 = false;
        this.f90763y1 = false;
        this.f90767z1 = false;
        this.f90600A1 = -1;
        this.f90604B1 = false;
        this.f90608C1 = "";
        this.f90612D1 = 0;
        this.f90616E1 = 0L;
        this.f90619F1 = false;
        this.f90625H1 = false;
        this.f90628I1 = 0;
        this.f90631J1 = null;
        this.f90634K1 = "chat_send";
        this.f90637L1 = false;
        this.f90640M1 = false;
        this.f90643N1 = -1L;
        this.f90646O1 = 0;
        this.f90649P1 = false;
        this.f90652Q1 = false;
        this.f90655R1 = false;
        this.f90658S1 = false;
        this.f90664U1 = new AtomicReference();
        this.f90667V1 = false;
        this.f90670W1 = new AtomicBoolean(false);
        this.f90673X1 = EnumC24253d.f117153p;
        this.f90676Y1 = false;
        this.f90679Z1 = new AtomicBoolean(false);
        this.f90682a2 = true;
        this.f90685b2 = false;
        this.f90688c2 = new q();
        this.f90700g2 = new Object();
        this.f90706i2 = false;
        this.f90712k2 = new d();
        this.f90715l2 = new ArrayList();
        this.f90718m2 = false;
        this.f90721n2 = false;
        this.f90724o2 = false;
        this.f90748u2 = false;
        this.f90752v2 = false;
        this.f90756w2 = false;
        this.f90760x2 = 0;
        this.f90609C2 = false;
        this.f90613D2 = new Object();
        this.f90729q = messageId;
        this.f90614E = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x05d8 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05f0 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0601 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0615 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0629 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x064c A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x065f A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0650 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0687 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06bc A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0733 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x074a A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0754 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0793 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x079e A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07b2 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07c5 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07ea A[Catch: Exception -> 0x0177, TRY_LEAVE, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0744 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ce A[Catch: Exception -> 0x0177, TRY_ENTER, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f7 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0303 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0314 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0357 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:3:0x0165, B:5:0x016b, B:7:0x0172, B:8:0x017c, B:11:0x018e, B:13:0x0194, B:15:0x019a, B:17:0x01a1, B:18:0x01a5, B:20:0x01b1, B:21:0x01b4, B:23:0x01de, B:24:0x01e4, B:26:0x01ea, B:27:0x01f0, B:29:0x020d, B:30:0x0216, B:32:0x021c, B:33:0x0222, B:35:0x022a, B:36:0x0232, B:38:0x023a, B:40:0x024a, B:42:0x0256, B:44:0x025d, B:46:0x0264, B:49:0x026f, B:51:0x027d, B:53:0x028c, B:55:0x0290, B:57:0x0298, B:59:0x02bc, B:60:0x02c8, B:63:0x02ce, B:64:0x02f1, B:66:0x02f7, B:67:0x02fb, B:69:0x0303, B:70:0x030b, B:72:0x0314, B:73:0x032f, B:75:0x0333, B:77:0x033b, B:79:0x0343, B:81:0x0349, B:82:0x0351, B:84:0x0357, B:86:0x035d, B:89:0x0367, B:91:0x0371, B:93:0x037b, B:95:0x03a1, B:98:0x0427, B:99:0x03ab, B:101:0x03bf, B:103:0x03c9, B:105:0x03e8, B:107:0x03f8, B:110:0x0400, B:115:0x0415, B:120:0x0440, B:122:0x044b, B:124:0x0453, B:127:0x045d, B:129:0x047a, B:131:0x049c, B:132:0x04ad, B:134:0x04b3, B:136:0x04d1, B:137:0x04da, B:138:0x04dd, B:140:0x04e3, B:142:0x0503, B:143:0x0571, B:145:0x0577, B:147:0x0597, B:148:0x05a0, B:149:0x05a6, B:151:0x05b0, B:152:0x05bd, B:154:0x05c5, B:156:0x05cd, B:161:0x05d8, B:162:0x05e0, B:164:0x05e4, B:166:0x05ec, B:168:0x05f0, B:169:0x05f7, B:171:0x0601, B:172:0x0609, B:174:0x0615, B:175:0x061d, B:177:0x0629, B:178:0x062f, B:182:0x063c, B:184:0x0640, B:186:0x0646, B:188:0x064c, B:190:0x0653, B:192:0x065f, B:194:0x0667, B:196:0x0650, B:197:0x066f, B:200:0x0675, B:202:0x067d, B:205:0x0687, B:207:0x0691, B:209:0x06a7, B:210:0x06b0, B:211:0x06b3, B:213:0x06bc, B:216:0x06ef, B:217:0x06f1, B:219:0x06f7, B:220:0x06ff, B:222:0x0711, B:223:0x0718, B:225:0x0720, B:227:0x0726, B:228:0x072d, B:230:0x0733, B:232:0x0739, B:233:0x0746, B:235:0x074a, B:238:0x0754, B:240:0x075e, B:242:0x0774, B:244:0x077a, B:245:0x078a, B:246:0x0793, B:247:0x079a, B:249:0x079e, B:251:0x07a6, B:253:0x07b2, B:254:0x07ba, B:256:0x07c5, B:258:0x07c9, B:260:0x07cf, B:262:0x07db, B:263:0x07de, B:265:0x07ea, B:270:0x0744, B:272:0x050e, B:273:0x0528, B:275:0x0532, B:277:0x0552, B:279:0x0562, B:280:0x0569, B:281:0x04a5, B:287:0x0287, B:291:0x017a), top: B:2:0x0165 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C17945a0(JSONObject jSONObject, int i11, String str, int i12, boolean z11) {
        String str2;
        JSONObject jSONObject2;
        String str3;
        String str4;
        int optInt;
        String str5;
        String str6;
        String str7;
        long j11;
        long j12;
        String optString;
        JSONObject optJSONObject;
        JSONObject m96091j;
        JSONObject optJSONObject2;
        JSONObject m96091j2;
        String str8;
        String str9;
        JSONArray m96090i;
        int i13;
        JSONArray jSONArray;
        String str10;
        String str11;
        String str12;
        String str13;
        JSONObject m96091j3;
        String str14 = "ownerId";
        String str15 = "gOwnerId";
        this.f90725p = -1;
        this.f90733r = "";
        this.f90737s = "";
        this.f90741t = -1L;
        this.f90745u = "";
        this.f90749v = "";
        this.f90753w = "";
        this.f90757x = "";
        this.f90761y = "";
        this.f90598A = 0L;
        this.f90610D = "";
        this.f90614E = 0;
        this.f90617F = "";
        this.f90620G = 1;
        this.f90623H = false;
        this.f90626I = -1;
        this.f90629J = 0;
        this.f90635L = false;
        this.f90638M = false;
        this.f90641N = -1L;
        this.f90644O = -1;
        this.f90647P = null;
        this.f90650Q = 0L;
        this.f90653R = false;
        this.f90656S = "";
        this.f90662U = (byte) 3;
        this.f90665V = 0;
        this.f90668W = 0;
        this.f90671X = 0;
        this.f90674Y = 0;
        this.f90677Z = new AtomicBoolean(false);
        this.f90680a0 = false;
        this.f90683b0 = false;
        this.f90686c0 = false;
        this.f90695f0 = false;
        this.f90698g0 = false;
        this.f90701h0 = false;
        this.f90730q0 = false;
        this.f90742t0 = 0L;
        this.f90746u0 = 0L;
        this.f90750v0 = false;
        this.f90754w0 = new AtomicInteger(0);
        this.f90758x0 = 0;
        this.f90762y0 = 0;
        this.f90766z0 = 0;
        this.f90599A0 = EnumC22425a.f109727r;
        this.f90603B0 = EnumC19038l.f94903p;
        this.f90607C0 = false;
        this.f90621G0 = -1;
        this.f90630J0 = false;
        this.f90636L0 = false;
        this.f90645O0 = false;
        this.f90648P0 = false;
        this.f90651Q0 = false;
        this.f90660T0 = false;
        this.f90663U0 = new ArrayList();
        this.f90666V0 = new ArrayList();
        this.f90693e1 = "";
        this.f90702h1 = new C26399a();
        this.f90708j1 = "";
        this.f90711k1 = 0;
        this.f90714l1 = 0L;
        this.f90717m1 = 1;
        this.f90723o1 = 0;
        this.f90727p1 = C32163w8.m155135a().f148289b;
        this.f90735r1 = false;
        this.f90743t1 = true;
        this.f90755w1 = 1;
        this.f90759x1 = false;
        this.f90763y1 = false;
        this.f90767z1 = false;
        this.f90600A1 = -1;
        this.f90604B1 = false;
        String str16 = "";
        this.f90608C1 = str16;
        this.f90612D1 = 0;
        this.f90616E1 = 0L;
        this.f90619F1 = false;
        this.f90625H1 = false;
        this.f90628I1 = 0;
        this.f90631J1 = null;
        this.f90634K1 = "chat_send";
        this.f90637L1 = false;
        this.f90640M1 = false;
        this.f90643N1 = -1L;
        this.f90646O1 = 0;
        this.f90649P1 = false;
        this.f90652Q1 = false;
        this.f90655R1 = false;
        this.f90658S1 = false;
        this.f90664U1 = new AtomicReference();
        this.f90667V1 = false;
        this.f90670W1 = new AtomicBoolean(false);
        this.f90673X1 = EnumC24253d.f117153p;
        this.f90676Y1 = false;
        this.f90679Z1 = new AtomicBoolean(false);
        this.f90682a2 = true;
        this.f90685b2 = false;
        this.f90688c2 = new q();
        this.f90700g2 = new Object();
        this.f90706i2 = false;
        this.f90712k2 = new d();
        this.f90715l2 = new ArrayList();
        this.f90718m2 = false;
        this.f90721n2 = false;
        this.f90724o2 = false;
        this.f90748u2 = false;
        this.f90752v2 = false;
        this.f90756w2 = false;
        this.f90760x2 = 0;
        this.f90609C2 = false;
        this.f90613D2 = new Object();
        try {
            if (jSONObject.has("del") && jSONObject.getInt("del") == 1) {
                this.f90614E = 36;
            } else {
                this.f90614E = i11;
            }
            this.f90646O1 = jSONObject.optInt("layoutType", 0);
            if (m94871D7() && (m96091j3 = AbstractC18069a.m96091j(jSONObject, "property")) != null && m96091j3.has(ZinstantMetaConstant.IMPRESSION_META_TYPE) && m96091j3.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) == 3) {
                this.f90614E = 31;
            }
            if (jSONObject.optString("fromU").equals(CoreUtility.f89233i)) {
                this.f90623H = true;
            }
            m95016Ta(3);
            this.f90610D = jSONObject.getString("fromD");
            this.f90733r = jSONObject.getString("fromU");
            this.f90745u = jSONObject.getString("msg");
            this.f90765z = jSONObject.getLong("ts");
            long optLong = jSONObject.optLong("id");
            String valueOf = optLong > 0 ? String.valueOf(optLong) : str16;
            String string = jSONObject.has("cliMsgId") ? jSONObject.getString("cliMsgId") : str16;
            String m103054C = AbstractC19656s0.m103054C(CoreUtility.f89233i, jSONObject, str, i12, this.f90733r);
            this.f90737s = m103054C;
            m94699Oa(string, valueOf, m103054C, this.f90733r);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("paramsExt");
            if (optJSONObject3 != null) {
                this.f90725p = optJSONObject3.optInt("platformType", -1);
            }
            if (!jSONObject.isNull("srcType")) {
                this.f90644O = jSONObject.getInt("srcType");
            }
            if (!jSONObject.isNull("ttl")) {
                this.f90650Q = jSONObject.getLong("ttl");
            }
            if (jSONObject.has("quickReply")) {
                m95038W1(jSONObject.getJSONArray("quickReply").toString(), false);
            }
            if (z11) {
                m95010T1(jSONObject.optString("e2ee"), false);
            }
            if (z11 && m95158i3() > 1) {
                m94825vc(false, -1);
            }
            boolean z12 = z11 && !m94656E8();
            String optString2 = jSONObject.optString("footer", str16);
            this.f90656S = optString2;
            if (TextUtils.isEmpty(optString2)) {
                this.f90659T = null;
            } else {
                this.f90659T = new C32012m(this.f90656S);
            }
            if (z12 && !this.f90625H1 && !TextUtils.isEmpty(this.f90745u)) {
                C31867c4 m154091H0 = C31986k3.f147083a.m154091H0(this.f90745u, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                String str17 = (String) m154091H0.m153163a();
                this.f90745u = str17;
                if (str17 == null) {
                    this.f90745u = str16;
                    m94825vc(true, m154091H0.m153164b());
                    if (this.f90625H1) {
                        String optString3 = jSONObject.optString("attach");
                        int i14 = this.f90725p;
                        str2 = "property";
                        jSONObject2 = optJSONObject3;
                        str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                        str4 = "attach";
                        m95279v9(optString3, i11, false, z11, i14);
                    } else {
                        str2 = "property";
                        jSONObject2 = optJSONObject3;
                        str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                        str4 = "attach";
                    }
                    if (m95133f7()) {
                        m95264ta(2);
                    }
                    if (!jSONObject.isNull("notify")) {
                        this.f90620G = jSONObject.getInt("notify");
                    }
                    optInt = jSONObject.optInt("topOut", -1);
                    if (optInt != -1) {
                        this.f90647P = new C7908f(this.f90644O, optInt, jSONObject.optLong("topOutTimeOut"), jSONObject.optLong("topOutImprTimeOut"));
                    }
                    if (!this.f90625H1 && jSONObject.has("mentions") && (m96090i = AbstractC18069a.m96090i(jSONObject, "mentions")) != null && m96090i.length() > 0) {
                        this.f90657S0 = new C7907e();
                        i13 = 0;
                        while (i13 < m96090i.length()) {
                            JSONObject jSONObject3 = m96090i.getJSONObject(i13);
                            if (z12) {
                                int optInt2 = jSONObject3.optInt(str3);
                                if (optInt2 == 0) {
                                    String optString4 = jSONObject3.optString("uid");
                                    if (TextUtils.isEmpty(optString4)) {
                                        jSONArray = m96090i;
                                    } else {
                                        jSONArray = m96090i;
                                        if (!TextUtils.equals(optString4, "0")) {
                                            str12 = str3;
                                            str10 = str15;
                                            str11 = str16;
                                            C31867c4 m154094J0 = C31986k3.f147083a.m154094J0(optString4, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                            Integer num = (Integer) m154094J0.m153163a();
                                            if (num == null) {
                                                m94825vc(true, m154094J0.m153164b());
                                            } else {
                                                jSONObject3.put("uid", num);
                                                jSONObject3.remove("gUid");
                                            }
                                        }
                                    }
                                    str10 = str15;
                                    str11 = str16;
                                    str12 = str3;
                                    String optString5 = jSONObject3.optString("gUid");
                                    if (!TextUtils.isEmpty(optString5)) {
                                        str13 = str14;
                                        C31867c4 m154091H02 = C31986k3.f147083a.m154091H0(optString5, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                        String str18 = (String) m154091H02.m153163a();
                                        if (str18 != null) {
                                            String m153506h = C31943h5.f146766a.m153506h(str18, true, true);
                                            jSONObject3.put("gUid", str18);
                                            if (!TextUtils.isEmpty(m153506h)) {
                                                jSONObject3.put("uid", Integer.parseInt(m153506h));
                                            }
                                        } else {
                                            m94825vc(true, m154091H02.m153164b());
                                        }
                                    }
                                } else {
                                    jSONArray = m96090i;
                                    str10 = str15;
                                    str11 = str16;
                                    str12 = str3;
                                    str13 = str14;
                                    if (optInt2 == 1) {
                                        jSONObject3.remove("gUid");
                                        jSONObject3.put("uid", "-1");
                                    }
                                }
                                this.f90657S0.m40852b(new C7907e.a(jSONObject3));
                                i13++;
                                m96090i = jSONArray;
                                str14 = str13;
                                str15 = str10;
                                str16 = str11;
                                str3 = str12;
                            } else {
                                jSONArray = m96090i;
                                str10 = str15;
                                str11 = str16;
                                str12 = str3;
                            }
                            str13 = str14;
                            this.f90657S0.m40852b(new C7907e.a(jSONObject3));
                            i13++;
                            m96090i = jSONArray;
                            str14 = str13;
                            str15 = str10;
                            str16 = str11;
                            str3 = str12;
                        }
                    }
                    String str19 = str15;
                    str5 = str16;
                    str6 = str3;
                    String str20 = str14;
                    if (this.f90625H1 && jSONObject.has("quote") && (m96091j2 = AbstractC18069a.m96091j(jSONObject, "quote")) != null) {
                        if (z12) {
                            String optString6 = m96091j2.optString("msg");
                            String optString7 = m96091j2.optString(str4);
                            String optString8 = m96091j2.optString(str20);
                            String optString9 = m96091j2.optString("fromD");
                            String optString10 = m96091j2.optString(str19);
                            if (TextUtils.isEmpty(optString6)) {
                                str8 = optString9;
                                str9 = str19;
                            } else {
                                str8 = optString9;
                                str9 = str19;
                                C31867c4 m154091H03 = C31986k3.f147083a.m154091H0(optString6, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                String str21 = (String) m154091H03.m153163a();
                                if (str21 == null) {
                                    m94825vc(true, m154091H03.m153164b());
                                } else {
                                    m96091j2.put("msg", str21);
                                }
                            }
                            if (!TextUtils.isEmpty(optString7)) {
                                C31867c4 m154091H04 = C31986k3.f147083a.m154091H0(optString7, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                String str22 = (String) m154091H04.m153163a();
                                if (str22 == null) {
                                    m94825vc(true, m154091H04.m153164b());
                                } else {
                                    m96091j2.put(str4, str22);
                                }
                            }
                            if (!TextUtils.isEmpty(optString8)) {
                                C31867c4 m154094J02 = C31986k3.f147083a.m154094J0(optString8, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                Integer num2 = (Integer) m154094J02.m153163a();
                                if (num2 == null) {
                                    m94825vc(true, m154094J02.m153164b());
                                    str7 = str5;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(num2);
                                    str7 = str5;
                                    sb2.append(str7);
                                    m96091j2.put(str20, sb2.toString());
                                    m96091j2.put(str9, str7);
                                }
                            } else {
                                String str23 = str9;
                                str7 = str5;
                                if (!TextUtils.isEmpty(optString10)) {
                                    C31867c4 m154091H05 = C31986k3.f147083a.m154091H0(optString10, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                    String str24 = (String) m154091H05.m153163a();
                                    if (str24 != null) {
                                        m96091j2.put(str23, str24);
                                        String m153506h2 = C31943h5.f146766a.m153506h(str24, true, true);
                                        if (!TextUtils.isEmpty(m153506h2)) {
                                            m96091j2.put(str20, m153506h2);
                                            m96091j2.put(str23, str7);
                                        }
                                    } else {
                                        m94825vc(true, m154091H05.m153164b());
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(str8)) {
                                C31867c4 m154091H06 = C31986k3.f147083a.m154091H0(str8, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                String str25 = (String) m154091H06.m153163a();
                                if (str25 == null) {
                                    m94825vc(true, m154091H06.m153164b());
                                } else {
                                    m96091j2.put("fromD", str25);
                                }
                            }
                        } else {
                            str7 = str5;
                        }
                        C17997r1 m95685b = C17997r1.m95685b(m96091j2, this.f90737s);
                        this.f90654R0 = m95685b;
                        if (m95685b != null) {
                            this.f90681a1 = m95685b.m95689f().m41045i();
                        }
                    } else {
                        str7 = str5;
                    }
                    if (!jSONObject.has("snap") && AbstractC18069a.m96091j(jSONObject, "snap") != null) {
                        this.f90614E = 10000;
                        return;
                    }
                    if (i11 == 41) {
                        this.f90693e1 = jSONObject.optString("streamId");
                    }
                    if (!this.f90625H1 && (optJSONObject2 = jSONObject.optJSONObject(str2)) != null) {
                        if (this.f90669W0 == null) {
                            this.f90669W0 = new C17979l1();
                        }
                        this.f90669W0.f91058a = !optJSONObject2.has("size") ? optJSONObject2.optInt("size") : -1;
                        this.f90669W0.f91059b = !optJSONObject2.has("color") ? optJSONObject2.optInt("color") : -1;
                        this.f90669W0.f91060c = !optJSONObject2.has(str6) ? optJSONObject2.optInt(str6) : -1;
                        this.f90669W0.m95624f(optJSONObject2.optString("ext"));
                    }
                    if (!this.f90625H1 && m95306y8()) {
                        int i15 = !m95288w8() ? AbstractC8020f0.str_type_msg_gif_with_caption : AbstractC8020f0.str_type_msg_video;
                        Object[] objArr = new Object[1];
                        objArr[0] = TextUtils.isEmpty(this.f90618F0.f91011p) ? this.f90618F0.f91011p : str7;
                        this.f90745u = AbstractC23136l9.m118746s0(i15, objArr);
                    }
                    if (!this.f90625H1 && jSONObject.has("reference") && (m96091j = AbstractC18069a.m96091j(jSONObject, "reference")) != null) {
                        if (z12) {
                            String optString11 = m96091j.optString("data");
                            if (!TextUtils.isEmpty(optString11)) {
                                C31867c4 m154091H07 = C31986k3.f147083a.m154091H0(optString11, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                String str26 = (String) m154091H07.m153163a();
                                if (str26 == null) {
                                    m94825vc(true, m154091H07.m153164b());
                                } else {
                                    m96091j.put("data", str26);
                                }
                            }
                        }
                        this.f90672X0 = new C17994q1(m96091j);
                    }
                    if (jSONObject2 == null) {
                        JSONObject jSONObject4 = jSONObject2;
                        this.f90705i1 = jSONObject4.optString("previewTxt", str7);
                        this.f90708j1 = jSONObject4.optString("notifyTxt", str7);
                        this.f90711k1 = jSONObject4.optInt("forceNotify", 0);
                        j11 = 0;
                        this.f90714l1 = jSONObject4.optLong("notifyTTL", 0L);
                        int optInt3 = jSONObject4.optInt("notifBhvr", 0);
                        this.f90723o1 = optInt3;
                        if (optInt3 != 0 && optInt3 != 1) {
                            this.f90723o1 = 0;
                        }
                        if (AbstractC23309i.m122564x2() == 1) {
                            this.f90717m1 = jSONObject4.optInt("countUnread", 1);
                        }
                        this.f90714l1 = jSONObject4.optInt("notifyTTL", 0);
                        if (jSONObject4.optJSONObject("richContentNotif") != null) {
                            this.f90720n1 = new C18000s1(jSONObject4);
                        }
                        if (this.f90745u.isEmpty() && m94730Y0()) {
                            this.f90745u = this.f90705i1;
                        }
                    } else {
                        j11 = 0;
                    }
                    j12 = this.f90650Q;
                    if (j12 > j11) {
                        long j13 = this.f90714l1;
                        if (j13 > j11) {
                            this.f90714l1 = Math.min(j13, j12);
                            if (!this.f90625H1 && (optJSONObject = jSONObject.optJSONObject("footerv2")) != null) {
                                if (!z12) {
                                    String optString12 = optJSONObject.optString("data");
                                    if (!TextUtils.isEmpty(optString12)) {
                                        C31867c4 m154091H08 = C31986k3.f147083a.m154091H0(optString12, this.f90737s, this.f90733r, this.f90725p, this.f90765z);
                                        String str27 = (String) m154091H08.m153163a();
                                        if (str27 != null) {
                                            if (!str27.isEmpty()) {
                                                optJSONObject.put("data", new JSONObject(str27));
                                                this.f90678Z0 = new C26713e(optJSONObject);
                                            }
                                        } else {
                                            m94825vc(true, m154091H08.m153164b());
                                        }
                                    }
                                } else {
                                    this.f90678Z0 = new C26713e(optJSONObject);
                                }
                            }
                            if (!this.f90625H1 && jSONObject.has("previewThumb")) {
                                optString = jSONObject.optString("previewThumb");
                                if (!optString.isEmpty()) {
                                    m94943La(new C3541i(optString));
                                }
                            }
                            this.f90600A1 = jSONObject.optInt("at", -1);
                            if (z11 && !this.f90625H1 && m94871D7() && !C31986k3.f147083a.m154109S1(m95090b5())) {
                                C24559a.m127934d();
                            }
                            if (C11318b.m60507e().m60520o(this.f90737s)) {
                                this.f90743t1 = false;
                                return;
                            }
                            return;
                        }
                    }
                    if (j12 > j11) {
                        this.f90714l1 = j12;
                    }
                    if (!this.f90625H1) {
                        if (!z12) {
                        }
                    }
                    if (!this.f90625H1) {
                        optString = jSONObject.optString("previewThumb");
                        if (!optString.isEmpty()) {
                        }
                    }
                    this.f90600A1 = jSONObject.optInt("at", -1);
                    if (z11) {
                        C24559a.m127934d();
                    }
                    if (C11318b.m60507e().m60520o(this.f90737s)) {
                    }
                }
            }
            if (this.f90625H1) {
            }
            if (m95133f7()) {
            }
            if (!jSONObject.isNull("notify")) {
            }
            optInt = jSONObject.optInt("topOut", -1);
            if (optInt != -1) {
            }
            if (!this.f90625H1) {
                this.f90657S0 = new C7907e();
                i13 = 0;
                while (i13 < m96090i.length()) {
                }
            }
            String str192 = str15;
            str5 = str16;
            str6 = str3;
            String str202 = str14;
            if (this.f90625H1) {
            }
            str7 = str5;
            if (!jSONObject.has("snap")) {
            }
            if (i11 == 41) {
            }
            if (!this.f90625H1) {
                if (this.f90669W0 == null) {
                }
                this.f90669W0.f91058a = !optJSONObject2.has("size") ? optJSONObject2.optInt("size") : -1;
                this.f90669W0.f91059b = !optJSONObject2.has("color") ? optJSONObject2.optInt("color") : -1;
                this.f90669W0.f91060c = !optJSONObject2.has(str6) ? optJSONObject2.optInt(str6) : -1;
                this.f90669W0.m95624f(optJSONObject2.optString("ext"));
            }
            if (!this.f90625H1) {
                if (!m95288w8()) {
                }
                Object[] objArr2 = new Object[1];
                objArr2[0] = TextUtils.isEmpty(this.f90618F0.f91011p) ? this.f90618F0.f91011p : str7;
                this.f90745u = AbstractC23136l9.m118746s0(i15, objArr2);
            }
            if (!this.f90625H1) {
                if (z12) {
                }
                this.f90672X0 = new C17994q1(m96091j);
            }
            if (jSONObject2 == null) {
            }
            j12 = this.f90650Q;
            if (j12 > j11) {
            }
            if (j12 > j11) {
            }
            if (!this.f90625H1) {
            }
            if (!this.f90625H1) {
            }
            this.f90600A1 = jSONObject.optInt("at", -1);
            if (z11) {
            }
            if (C11318b.m60507e().m60520o(this.f90737s)) {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l("ChatContent").mo104552e(e11);
        }
    }

    public C17945a0(C7966k c7966k, int i11, long j11) {
        this.f90725p = -1;
        this.f90733r = "";
        this.f90737s = "";
        this.f90741t = -1L;
        this.f90745u = "";
        this.f90749v = "";
        this.f90753w = "";
        this.f90757x = "";
        this.f90761y = "";
        this.f90598A = 0L;
        this.f90610D = "";
        this.f90614E = 0;
        this.f90617F = "";
        this.f90620G = 1;
        this.f90623H = false;
        this.f90626I = -1;
        this.f90629J = 0;
        this.f90635L = false;
        this.f90638M = false;
        this.f90641N = -1L;
        this.f90644O = -1;
        this.f90647P = null;
        this.f90650Q = 0L;
        this.f90653R = false;
        this.f90656S = "";
        this.f90662U = (byte) 3;
        this.f90665V = 0;
        this.f90668W = 0;
        this.f90671X = 0;
        this.f90674Y = 0;
        this.f90677Z = new AtomicBoolean(false);
        this.f90680a0 = false;
        this.f90683b0 = false;
        this.f90686c0 = false;
        this.f90695f0 = false;
        this.f90698g0 = false;
        this.f90701h0 = false;
        this.f90730q0 = false;
        this.f90742t0 = 0L;
        this.f90746u0 = 0L;
        this.f90750v0 = false;
        this.f90754w0 = new AtomicInteger(0);
        this.f90758x0 = 0;
        this.f90762y0 = 0;
        this.f90766z0 = 0;
        this.f90599A0 = EnumC22425a.f109727r;
        this.f90603B0 = EnumC19038l.f94903p;
        this.f90607C0 = false;
        this.f90621G0 = -1;
        this.f90630J0 = false;
        this.f90636L0 = false;
        this.f90645O0 = false;
        this.f90648P0 = false;
        this.f90651Q0 = false;
        this.f90660T0 = false;
        this.f90663U0 = new ArrayList();
        this.f90666V0 = new ArrayList();
        this.f90693e1 = "";
        this.f90702h1 = new C26399a();
        this.f90708j1 = "";
        this.f90711k1 = 0;
        this.f90714l1 = 0L;
        this.f90717m1 = 1;
        this.f90723o1 = 0;
        this.f90727p1 = C32163w8.m155135a().f148289b;
        this.f90735r1 = false;
        this.f90743t1 = true;
        this.f90755w1 = 1;
        this.f90759x1 = false;
        this.f90763y1 = false;
        this.f90767z1 = false;
        this.f90600A1 = -1;
        this.f90604B1 = false;
        this.f90608C1 = "";
        this.f90612D1 = 0;
        this.f90616E1 = 0L;
        this.f90619F1 = false;
        this.f90625H1 = false;
        this.f90628I1 = 0;
        this.f90631J1 = null;
        this.f90634K1 = "chat_send";
        this.f90637L1 = false;
        this.f90640M1 = false;
        this.f90643N1 = -1L;
        this.f90646O1 = 0;
        this.f90649P1 = false;
        this.f90652Q1 = false;
        this.f90655R1 = false;
        this.f90658S1 = false;
        this.f90664U1 = new AtomicReference();
        this.f90667V1 = false;
        this.f90670W1 = new AtomicBoolean(false);
        this.f90673X1 = EnumC24253d.f117153p;
        this.f90676Y1 = false;
        this.f90679Z1 = new AtomicBoolean(false);
        this.f90682a2 = true;
        this.f90685b2 = false;
        this.f90688c2 = new q();
        this.f90700g2 = new Object();
        this.f90706i2 = false;
        this.f90712k2 = new d();
        this.f90715l2 = new ArrayList();
        this.f90718m2 = false;
        this.f90721n2 = false;
        this.f90724o2 = false;
        this.f90748u2 = false;
        this.f90752v2 = false;
        this.f90756w2 = false;
        this.f90760x2 = 0;
        this.f90609C2 = false;
        this.f90613D2 = new Object();
        try {
            if (i11 == 1) {
                this.f90737s = "group_" + c7966k.getString(c7966k.getColumnIndex("ownerId"));
            } else {
                this.f90737s = c7966k.getString(c7966k.getColumnIndex("ownerId"));
            }
            this.f90733r = c7966k.getString(c7966k.getColumnIndex("fromId"));
            this.f90610D = c7966k.getString(c7966k.getColumnIndex("fromName"));
            m94699Oa(c7966k.getString(c7966k.getColumnIndex("cliMsgId")), c7966k.getString(c7966k.getColumnIndex("globalMsgId")), this.f90737s, this.f90733r);
            long j12 = c7966k.getLong(c7966k.getColumnIndex("ts"));
            this.f90765z = j12 > j11 ? j11 : j12;
            this.f90650Q = c7966k.getLong(c7966k.getColumnIndex("ttl"));
            this.f90614E = AbstractC20071b.Companion.m104324c(c7966k.getString(c7966k.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE)), null);
            this.f90745u = c7966k.getString(c7966k.getColumnIndex("msg"));
            if (m95032V6()) {
                this.f90626I = 2;
            } else {
                this.f90626I = 4;
            }
            String string = c7966k.getString(c7966k.getColumnIndex("attach"));
            JSONObject jSONObject = TextUtils.isEmpty(string) ? null : new JSONObject(string);
            if (jSONObject != null) {
                String m96089h = AbstractC18069a.m96089h(jSONObject, "attach");
                this.f90646O1 = m94833x9(jSONObject);
                m95279v9(m96089h, this.f90614E, true, false, 0);
                JSONArray m96090i = AbstractC18069a.m96090i(jSONObject, "mentions");
                if (m96090i != null && m96090i.length() > 0) {
                    this.f90657S0 = new C7907e();
                    for (int i12 = 0; i12 < m96090i.length(); i12++) {
                        this.f90657S0.m40852b(new C7907e.a(m96090i.getJSONObject(i12)));
                    }
                }
                JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "quote");
                if (m96091j != null) {
                    C17997r1 m95685b = C17997r1.m95685b(m96091j, this.f90737s);
                    this.f90654R0 = m95685b;
                    if (m95685b != null) {
                        this.f90681a1 = m95685b.m95689f().m41045i();
                    }
                }
                if (AbstractC18069a.m96091j(jSONObject, "snap") != null) {
                    this.f90614E = 10000;
                }
                m94636A9(jSONObject);
                JSONObject m96091j2 = AbstractC18069a.m96091j(jSONObject, "reference");
                if (m96091j2 != null) {
                    this.f90672X0 = new C17994q1(m96091j2);
                }
                JSONObject m96091j3 = AbstractC18069a.m96091j(jSONObject, "footerv2");
                if (m96091j3 != null) {
                    this.f90678Z0 = new C26713e(m96091j3);
                }
                JSONObject m96091j4 = AbstractC18069a.m96091j(jSONObject, "e2ee");
                if (m96091j4 != null) {
                    try {
                        this.f90622G1 = new C31897e4(m96091j4, true);
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
            if (m95133f7()) {
                m95264ta(2);
            }
        } catch (JSONException e12) {
            AbstractC23350e.m122783m(e12);
        }
    }
}
