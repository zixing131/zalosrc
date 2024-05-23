package com.zing.zalo.p077ui.chat.chatrow;

import ag0.C0814e0;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import au.C2343e;
import be0.C2784i;
import bi0.AbstractC2807a;
import ch0.AbstractC3489d;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.widget.C13574c3;
import com.zing.zalo.p077ui.widget.C13646i;
import com.zing.zalo.p077ui.widget.C13658k;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13804v0;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.p077ui.widget.recyclerview.SwipeItemListView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicontrol.C16625n;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C17024o0;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17985n1;
import dj.C17990p0;
import dj.C17994q1;
import dj.C17997r1;
import eg0.C18427b;
import en0.InterfaceC18494a;
import gg0.AbstractC19444a;
import gw.AbstractC19620d0;
import gw.AbstractC19656s0;
import gw.C19639k;
import gw.C19660u0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jb0.C21197a;
import l30.AbstractC22055v0;
import lb0.C22405g;
import me0.AbstractC23006a0;
import me0.AbstractC23028c0;
import me0.AbstractC23118k2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p105dn.EnumC18030a;
import p142ey.C18644n;
import p185gc.AbstractC19378b;
import p279jw.C21373a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p392oh.C24261h;
import p392oh.C24265l;
import p402os.C24548c;
import p409oz.C24585b;
import p471r3.C25630b;
import p588vw.C28644j;
import p604wb.C28905e;
import p641xd.C29583g;
import p656xs.AbstractC30201b;
import p698yz.AbstractC31111g;
import p716zh.C31903ea;
import p716zh.C31943h5;
import p716zh.C31973j5;
import p716zh.C32012m;
import p716zh.C32119t6;
import p716zh.C32123ta;
import ph.C24751d;
import pm0.C24865v;
import th.AbstractC26682c;
import tj.C26712d;
import tj.C26713e;
import vg.AbstractC28236y3;
import vg.AbstractRunnableC28185s6;
import vg.C28020b3;
import vg.C28203u6;
import vg.C28227x3;
import w50.C28769a;
import w50.C28770b;
import w50.C28771c;
import x50.C29383a;
import x50.C29384b;
import x50.C29385c;
import y60.C30799a;

/* loaded from: classes5.dex */
public abstract class ChatRow extends ChatRowBase implements InterfaceC11475g0, C28770b.a, AbstractRunnableC28185s6.b, C17985n1.c {

    /* renamed from: A5 */
    protected static final float f57179A5;

    /* renamed from: A6 */
    protected static C13704p1 f57180A6 = null;

    /* renamed from: B5 */
    protected static final float[] f57181B5;

    /* renamed from: B6 */
    protected static Paint f57182B6 = null;

    /* renamed from: C5 */
    protected static final float[] f57183C5;

    /* renamed from: C6 */
    protected static TextPaint f57184C6 = null;

    /* renamed from: D5 */
    protected static final float[] f57185D5;

    /* renamed from: D6 */
    protected static Paint.FontMetricsInt f57186D6 = null;

    /* renamed from: E5 */
    protected static final float[] f57187E5;

    /* renamed from: E6 */
    private static Paint f57188E6 = null;

    /* renamed from: F5 */
    public static final int f57189F5;

    /* renamed from: F6 */
    private static Paint f57190F6 = null;

    /* renamed from: G5 */
    public static final int f57191G5;

    /* renamed from: G6 */
    private static int f57192G6 = 0;

    /* renamed from: H5 */
    public static final int f57193H5;

    /* renamed from: H6 */
    static C13704p1 f57194H6 = null;

    /* renamed from: I5 */
    public static final int f57195I5;

    /* renamed from: I6 */
    public static final int f57196I6;

    /* renamed from: J5 */
    public static final int f57197J5;

    /* renamed from: J6 */
    public static final int f57198J6;

    /* renamed from: K5 */
    public static final int f57199K5;

    /* renamed from: K6 */
    protected static String f57200K6 = null;

    /* renamed from: L5 */
    public static final int f57201L5;

    /* renamed from: L6 */
    protected static final int f57202L6;

    /* renamed from: M5 */
    public static final int f57203M5;

    /* renamed from: M6 */
    static C13704p1 f57204M6 = null;

    /* renamed from: N5 */
    protected static final int f57205N5;

    /* renamed from: N6 */
    static C13704p1 f57206N6 = null;

    /* renamed from: O5 */
    protected static final int f57207O5;

    /* renamed from: O6 */
    static Paint f57208O6 = null;

    /* renamed from: P5 */
    protected static final int f57209P5;

    /* renamed from: P6 */
    static Paint f57210P6 = null;

    /* renamed from: Q5 */
    public static final int f57211Q5;

    /* renamed from: Q6 */
    static C13704p1 f57212Q6 = null;

    /* renamed from: R5 */
    protected static final int f57213R5;

    /* renamed from: R6 */
    private static final int f57214R6;

    /* renamed from: S5 */
    protected static final int f57215S5;

    /* renamed from: S6 */
    protected static Paint f57216S6 = null;

    /* renamed from: T5 */
    public static final int f57217T5;

    /* renamed from: T6 */
    static Paint f57218T6 = null;

    /* renamed from: U5 */
    private static final int f57219U5;

    /* renamed from: U6 */
    static final int f57220U6;

    /* renamed from: V5 */
    private static final int f57221V5;

    /* renamed from: W5 */
    protected static final int f57222W5;

    /* renamed from: X5 */
    public static final int f57223X5;

    /* renamed from: Y5 */
    public static final int f57224Y5;

    /* renamed from: Z5 */
    public static final int f57225Z5;

    /* renamed from: a6 */
    private static int f57226a6 = 0;

    /* renamed from: b6 */
    private static int f57227b6 = 0;

    /* renamed from: c6 */
    private static int f57228c6 = 0;

    /* renamed from: d6 */
    private static Paint f57229d6 = null;

    /* renamed from: e6 */
    static int f57230e6 = 0;

    /* renamed from: f6 */
    protected static final int f57231f6;

    /* renamed from: g6 */
    protected static final int f57232g6;

    /* renamed from: h6 */
    public static int f57233h6 = 0;

    /* renamed from: i6 */
    public static int f57234i6 = 0;

    /* renamed from: j6 */
    protected static int f57235j6 = 0;

    /* renamed from: k6 */
    protected static int f57236k6 = 0;

    /* renamed from: l6 */
    public static int f57237l6 = 0;

    /* renamed from: m6 */
    protected static int f57238m6 = 0;

    /* renamed from: n6 */
    public static int f57239n6 = 0;

    /* renamed from: o6 */
    private static final int f57240o6;

    /* renamed from: p6 */
    protected static int f57241p6 = 0;

    /* renamed from: q6 */
    protected static final int f57242q6;

    /* renamed from: r6 */
    protected static TextPaint f57243r6 = null;

    /* renamed from: s6 */
    protected static Paint f57244s6 = null;

    /* renamed from: t6 */
    protected static TextPaint f57245t6 = null;

    /* renamed from: u6 */
    protected static Paint.FontMetricsInt f57246u6 = null;

    /* renamed from: v5 */
    public static boolean f57247v5 = false;

    /* renamed from: v6 */
    protected static float f57248v6 = 0.0f;

    /* renamed from: w5 */
    public static boolean f57249w5 = false;

    /* renamed from: w6 */
    static final int f57250w6;

    /* renamed from: x5 */
    protected static TextPaint f57251x5;

    /* renamed from: x6 */
    static final int f57252x6;

    /* renamed from: y5 */
    protected static Paint f57253y5;

    /* renamed from: y6 */
    static final float f57254y6;

    /* renamed from: z5 */
    protected static Paint f57255z5;

    /* renamed from: z6 */
    protected static C13704p1 f57256z6;

    /* renamed from: A */
    protected C28771c f57257A;

    /* renamed from: A0 */
    int f57258A0;

    /* renamed from: A1 */
    protected boolean f57259A1;

    /* renamed from: A2 */
    int f57260A2;

    /* renamed from: A3 */
    protected boolean f57261A3;

    /* renamed from: A4 */
    boolean f57262A4;

    /* renamed from: B */
    protected C17945a0 f57263B;

    /* renamed from: B0 */
    int f57264B0;

    /* renamed from: B1 */
    boolean f57265B1;

    /* renamed from: B2 */
    RectF f57266B2;

    /* renamed from: B3 */
    protected boolean f57267B3;

    /* renamed from: B4 */
    C28770b f57268B4;

    /* renamed from: C */
    protected C28769a f57269C;

    /* renamed from: C0 */
    int f57270C0;

    /* renamed from: C1 */
    protected boolean f57271C1;

    /* renamed from: C2 */
    int f57272C2;

    /* renamed from: C3 */
    protected int f57273C3;

    /* renamed from: C4 */
    private C26713e f57274C4;

    /* renamed from: D */
    protected C23528a f57275D;

    /* renamed from: D0 */
    int f57276D0;

    /* renamed from: D1 */
    protected boolean f57277D1;

    /* renamed from: D2 */
    int f57278D2;

    /* renamed from: D3 */
    private C29384b f57279D3;

    /* renamed from: D4 */
    private List f57280D4;

    /* renamed from: E */
    protected boolean f57281E;

    /* renamed from: E0 */
    int f57282E0;

    /* renamed from: E1 */
    protected int f57283E1;

    /* renamed from: E2 */
    int f57284E2;

    /* renamed from: E3 */
    private C29384b f57285E3;

    /* renamed from: E4 */
    private List f57286E4;

    /* renamed from: F */
    protected TextPaint f57287F;

    /* renamed from: F0 */
    int f57288F0;

    /* renamed from: F1 */
    protected int f57289F1;

    /* renamed from: F2 */
    int f57290F2;

    /* renamed from: F3 */
    private boolean f57291F3;

    /* renamed from: F4 */
    protected boolean f57292F4;

    /* renamed from: G */
    int f57293G;

    /* renamed from: G0 */
    int f57294G0;

    /* renamed from: G1 */
    protected boolean f57295G1;

    /* renamed from: G2 */
    float f57296G2;

    /* renamed from: G3 */
    private C29383a f57297G3;

    /* renamed from: G4 */
    protected boolean f57298G4;

    /* renamed from: H */
    int f57299H;

    /* renamed from: H0 */
    int f57300H0;

    /* renamed from: H1 */
    protected int f57301H1;

    /* renamed from: H2 */
    C3977j f57302H2;

    /* renamed from: H3 */
    StaticLayout f57303H3;

    /* renamed from: H4 */
    private int f57304H4;

    /* renamed from: I */
    int f57305I;

    /* renamed from: I0 */
    boolean f57306I0;

    /* renamed from: I1 */
    protected int f57307I1;

    /* renamed from: I2 */
    Drawable f57308I2;

    /* renamed from: I3 */
    int f57309I3;

    /* renamed from: I4 */
    private int f57310I4;

    /* renamed from: J */
    int f57311J;

    /* renamed from: J0 */
    boolean f57312J0;

    /* renamed from: J1 */
    protected boolean f57313J1;

    /* renamed from: J2 */
    Drawable f57314J2;

    /* renamed from: J3 */
    int f57315J3;

    /* renamed from: J4 */
    private boolean f57316J4;

    /* renamed from: K */
    int f57317K;

    /* renamed from: K0 */
    boolean f57318K0;

    /* renamed from: K1 */
    protected boolean f57319K1;

    /* renamed from: K2 */
    boolean f57320K2;

    /* renamed from: K3 */
    int f57321K3;

    /* renamed from: K4 */
    private boolean f57322K4;

    /* renamed from: L */
    int f57323L;

    /* renamed from: L0 */
    boolean f57324L0;

    /* renamed from: L1 */
    protected boolean f57325L1;

    /* renamed from: L2 */
    MessageId f57326L2;

    /* renamed from: L3 */
    int f57327L3;

    /* renamed from: L4 */
    protected boolean f57328L4;

    /* renamed from: M */
    int f57329M;

    /* renamed from: M0 */
    boolean f57330M0;

    /* renamed from: M1 */
    protected C13574c3 f57331M1;

    /* renamed from: M2 */
    int f57332M2;

    /* renamed from: M3 */
    boolean f57333M3;

    /* renamed from: M4 */
    protected boolean f57334M4;

    /* renamed from: N */
    int f57335N;

    /* renamed from: N0 */
    boolean f57336N0;

    /* renamed from: N1 */
    protected boolean f57337N1;

    /* renamed from: N2 */
    int f57338N2;

    /* renamed from: N3 */
    String f57339N3;

    /* renamed from: N4 */
    protected boolean f57340N4;

    /* renamed from: O */
    int f57341O;

    /* renamed from: O0 */
    boolean f57342O0;

    /* renamed from: O1 */
    protected boolean f57343O1;

    /* renamed from: O2 */
    int f57344O2;

    /* renamed from: O3 */
    String f57345O3;

    /* renamed from: O4 */
    protected boolean f57346O4;

    /* renamed from: P */
    int f57347P;

    /* renamed from: P0 */
    boolean f57348P0;

    /* renamed from: P1 */
    public long f57349P1;

    /* renamed from: P2 */
    int f57350P2;

    /* renamed from: P3 */
    String f57351P3;

    /* renamed from: P4 */
    protected boolean f57352P4;

    /* renamed from: Q */
    int f57353Q;

    /* renamed from: Q0 */
    boolean f57354Q0;

    /* renamed from: Q1 */
    float f57355Q1;

    /* renamed from: Q2 */
    int f57356Q2;

    /* renamed from: Q3 */
    boolean f57357Q3;

    /* renamed from: Q4 */
    protected int f57358Q4;

    /* renamed from: R */
    int f57359R;

    /* renamed from: R0 */
    boolean f57360R0;

    /* renamed from: R1 */
    protected int f57361R1;

    /* renamed from: R2 */
    int f57362R2;

    /* renamed from: R3 */
    int f57363R3;

    /* renamed from: R4 */
    protected int f57364R4;

    /* renamed from: S */
    int f57365S;

    /* renamed from: S0 */
    private boolean f57366S0;

    /* renamed from: S1 */
    protected int f57367S1;

    /* renamed from: S2 */
    int f57368S2;

    /* renamed from: S3 */
    int f57369S3;

    /* renamed from: S4 */
    private C17024o0 f57370S4;

    /* renamed from: T */
    int f57371T;

    /* renamed from: T0 */
    Drawable f57372T0;

    /* renamed from: T1 */
    protected boolean f57373T1;

    /* renamed from: T2 */
    int f57374T2;

    /* renamed from: T3 */
    float f57375T3;

    /* renamed from: T4 */
    private C21197a f57376T4;

    /* renamed from: U */
    int f57377U;

    /* renamed from: U0 */
    Map f57378U0;

    /* renamed from: U1 */
    protected boolean f57379U1;

    /* renamed from: U2 */
    int f57380U2;

    /* renamed from: U3 */
    StaticLayout f57381U3;

    /* renamed from: U4 */
    protected boolean f57382U4;

    /* renamed from: V */
    int f57383V;

    /* renamed from: V0 */
    Map f57384V0;

    /* renamed from: V1 */
    protected String f57385V1;

    /* renamed from: V2 */
    int f57386V2;

    /* renamed from: V3 */
    int f57387V3;

    /* renamed from: V4 */
    boolean f57388V4;

    /* renamed from: W */
    int f57389W;

    /* renamed from: W0 */
    Map f57390W0;

    /* renamed from: W1 */
    protected int f57391W1;

    /* renamed from: W2 */
    boolean f57392W2;

    /* renamed from: W3 */
    int f57393W3;

    /* renamed from: W4 */
    boolean f57394W4;

    /* renamed from: X0 */
    List f57395X0;

    /* renamed from: X1 */
    protected int f57396X1;

    /* renamed from: X2 */
    public int f57397X2;

    /* renamed from: X3 */
    int f57398X3;

    /* renamed from: X4 */
    protected int f57399X4;

    /* renamed from: Y0 */
    List f57400Y0;

    /* renamed from: Y1 */
    protected int f57401Y1;

    /* renamed from: Y2 */
    public int f57402Y2;

    /* renamed from: Y3 */
    StaticLayout f57403Y3;

    /* renamed from: Y4 */
    protected C16625n f57404Y4;

    /* renamed from: Z0 */
    int f57405Z0;

    /* renamed from: Z1 */
    private boolean f57406Z1;

    /* renamed from: Z2 */
    public int f57407Z2;

    /* renamed from: Z3 */
    int f57408Z3;

    /* renamed from: Z4 */
    protected Point f57409Z4;

    /* renamed from: a0 */
    int f57410a0;

    /* renamed from: a1 */
    Drawable f57411a1;

    /* renamed from: a2 */
    protected boolean f57412a2;

    /* renamed from: a3 */
    public boolean f57413a3;

    /* renamed from: a4 */
    int f57414a4;

    /* renamed from: a5 */
    protected C17985n1 f57415a5;

    /* renamed from: b0 */
    int f57416b0;

    /* renamed from: b1 */
    C16640q2 f57417b1;

    /* renamed from: b2 */
    protected boolean f57418b2;

    /* renamed from: b3 */
    protected boolean f57419b3;

    /* renamed from: b4 */
    int f57420b4;

    /* renamed from: b5 */
    C28227x3 f57421b5;

    /* renamed from: c0 */
    int f57422c0;

    /* renamed from: c1 */
    String f57423c1;

    /* renamed from: c2 */
    protected boolean f57424c2;

    /* renamed from: c3 */
    protected boolean f57425c3;

    /* renamed from: c4 */
    int f57426c4;

    /* renamed from: c5 */
    boolean f57427c5;

    /* renamed from: d0 */
    int f57428d0;

    /* renamed from: d1 */
    boolean f57429d1;

    /* renamed from: d2 */
    protected int f57430d2;

    /* renamed from: d3 */
    protected boolean f57431d3;

    /* renamed from: d4 */
    int f57432d4;

    /* renamed from: d5 */
    boolean f57433d5;

    /* renamed from: e0 */
    boolean f57434e0;

    /* renamed from: e1 */
    protected int f57435e1;

    /* renamed from: e2 */
    protected int f57436e2;

    /* renamed from: e3 */
    protected RectF f57437e3;

    /* renamed from: e4 */
    int f57438e4;

    /* renamed from: e5 */
    List f57439e5;

    /* renamed from: f0 */
    boolean f57440f0;

    /* renamed from: f1 */
    protected int f57441f1;

    /* renamed from: f2 */
    protected RectF f57442f2;

    /* renamed from: f3 */
    private int f57443f3;

    /* renamed from: f4 */
    int f57444f4;

    /* renamed from: f5 */
    boolean f57445f5;

    /* renamed from: g0 */
    int f57446g0;

    /* renamed from: g1 */
    protected boolean f57447g1;

    /* renamed from: g2 */
    String f57448g2;

    /* renamed from: g3 */
    private int f57449g3;

    /* renamed from: g4 */
    int f57450g4;

    /* renamed from: g5 */
    float f57451g5;

    /* renamed from: h0 */
    int f57452h0;

    /* renamed from: h1 */
    protected boolean f57453h1;

    /* renamed from: h2 */
    private boolean f57454h2;

    /* renamed from: h3 */
    private int f57455h3;

    /* renamed from: h4 */
    int f57456h4;

    /* renamed from: h5 */
    float f57457h5;

    /* renamed from: i0 */
    int f57458i0;

    /* renamed from: i1 */
    protected boolean f57459i1;

    /* renamed from: i2 */
    Rect f57460i2;

    /* renamed from: i3 */
    protected String f57461i3;

    /* renamed from: i4 */
    final int f57462i4;

    /* renamed from: i5 */
    ValueAnimator f57463i5;

    /* renamed from: j0 */
    int f57464j0;

    /* renamed from: j1 */
    boolean f57465j1;

    /* renamed from: j2 */
    int f57466j2;

    /* renamed from: j3 */
    protected int f57467j3;

    /* renamed from: j4 */
    C3977j f57468j4;

    /* renamed from: j5 */
    ValueAnimator f57469j5;

    /* renamed from: k0 */
    int f57470k0;

    /* renamed from: k1 */
    protected boolean f57471k1;

    /* renamed from: k2 */
    int f57472k2;

    /* renamed from: k3 */
    protected int f57473k3;

    /* renamed from: k4 */
    C13658k f57474k4;

    /* renamed from: k5 */
    long f57475k5;

    /* renamed from: l0 */
    int f57476l0;

    /* renamed from: l1 */
    protected int f57477l1;

    /* renamed from: l2 */
    int f57478l2;

    /* renamed from: l3 */
    protected int f57479l3;

    /* renamed from: l4 */
    boolean f57480l4;

    /* renamed from: l5 */
    long f57481l5;

    /* renamed from: m0 */
    int f57482m0;

    /* renamed from: m1 */
    protected int f57483m1;

    /* renamed from: m2 */
    int f57484m2;

    /* renamed from: m3 */
    protected int f57485m3;

    /* renamed from: m4 */
    C13804v0 f57486m4;

    /* renamed from: m5 */
    int f57487m5;

    /* renamed from: n0 */
    int f57488n0;

    /* renamed from: n1 */
    protected StaticLayout f57489n1;

    /* renamed from: n2 */
    RectF f57490n2;

    /* renamed from: n3 */
    protected Drawable f57491n3;

    /* renamed from: n4 */
    int f57492n4;

    /* renamed from: n5 */
    boolean f57493n5;

    /* renamed from: o0 */
    int f57494o0;

    /* renamed from: o1 */
    protected String f57495o1;

    /* renamed from: o2 */
    int f57496o2;

    /* renamed from: o3 */
    protected int f57497o3;

    /* renamed from: o4 */
    int f57498o4;

    /* renamed from: o5 */
    Paint f57499o5;

    /* renamed from: p0 */
    int f57500p0;

    /* renamed from: p1 */
    protected boolean f57501p1;

    /* renamed from: p2 */
    int f57502p2;

    /* renamed from: p3 */
    boolean f57503p3;

    /* renamed from: p4 */
    boolean f57504p4;

    /* renamed from: p5 */
    Paint f57505p5;

    /* renamed from: q0 */
    int f57506q0;

    /* renamed from: q1 */
    protected boolean f57507q1;

    /* renamed from: q2 */
    private boolean f57508q2;

    /* renamed from: q3 */
    int f57509q3;

    /* renamed from: q4 */
    int f57510q4;

    /* renamed from: q5 */
    Paint f57511q5;

    /* renamed from: r0 */
    int f57512r0;

    /* renamed from: r1 */
    protected int f57513r1;

    /* renamed from: r2 */
    protected C29385c f57514r2;

    /* renamed from: r3 */
    int f57515r3;

    /* renamed from: r4 */
    int f57516r4;

    /* renamed from: r5 */
    int f57517r5;

    /* renamed from: s0 */
    int f57518s0;

    /* renamed from: s1 */
    protected int f57519s1;

    /* renamed from: s2 */
    private String f57520s2;

    /* renamed from: s3 */
    int f57521s3;

    /* renamed from: s4 */
    protected boolean f57522s4;

    /* renamed from: s5 */
    boolean f57523s5;

    /* renamed from: t0 */
    int f57524t0;

    /* renamed from: t1 */
    RectF f57525t1;

    /* renamed from: t2 */
    boolean f57526t2;

    /* renamed from: t3 */
    int f57527t3;

    /* renamed from: t4 */
    protected C22405g f57528t4;

    /* renamed from: t5 */
    PathEffect f57529t5;

    /* renamed from: u0 */
    int f57530u0;

    /* renamed from: u1 */
    protected int f57531u1;

    /* renamed from: u2 */
    C17997r1 f57532u2;

    /* renamed from: u3 */
    protected boolean f57533u3;

    /* renamed from: u4 */
    boolean f57534u4;

    /* renamed from: u5 */
    C13646i.b f57535u5;

    /* renamed from: v0 */
    int f57536v0;

    /* renamed from: v1 */
    protected boolean f57537v1;

    /* renamed from: v2 */
    int f57538v2;

    /* renamed from: v3 */
    boolean f57539v3;

    /* renamed from: v4 */
    boolean f57540v4;

    /* renamed from: w0 */
    int f57541w0;

    /* renamed from: w1 */
    protected int f57542w1;

    /* renamed from: w2 */
    boolean f57543w2;

    /* renamed from: w3 */
    boolean f57544w3;

    /* renamed from: w4 */
    int f57545w4;

    /* renamed from: x0 */
    int f57546x0;

    /* renamed from: x1 */
    protected int f57547x1;

    /* renamed from: x2 */
    StaticLayout f57548x2;

    /* renamed from: x3 */
    private InterfaceC11530v f57549x3;

    /* renamed from: x4 */
    int f57550x4;

    /* renamed from: y0 */
    int f57551y0;

    /* renamed from: y1 */
    protected int f57552y1;

    /* renamed from: y2 */
    StaticLayout f57553y2;

    /* renamed from: y3 */
    protected InterfaceC11339n f57554y3;

    /* renamed from: y4 */
    RectF f57555y4;

    /* renamed from: z0 */
    int f57556z0;

    /* renamed from: z1 */
    protected int f57557z1;

    /* renamed from: z2 */
    int f57558z2;

    /* renamed from: z3 */
    C3977j f57559z3;

    /* renamed from: z4 */
    public ChatRow f57560z4;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$a */
    /* loaded from: classes5.dex */
    public class C11326a extends C23999j {
        C11326a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (!str.equals(ChatRow.this.f57351P3)) {
                    return;
                }
                C3977j c3977j = ChatRow.this.f57468j4;
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null) {
                    ChatRow.this.f57357Q3 = true;
                    Bitmap m18839c = c3979l.m18839c();
                    if (m18839c != null) {
                        if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                            ChatRow.this.f57474k4.m76334m(m18839c, true);
                            ChatRow.this.invalidate();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$b */
    /* loaded from: classes5.dex */
    public class C11327b implements C22405g.c {
        C11327b() {
        }

        @Override // lb0.C22405g.c
        /* renamed from: a */
        public void mo61132a() {
            if (ChatRow.this.getParent() instanceof View) {
                ((View) ChatRow.this.getParent()).invalidate();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$c */
    /* loaded from: classes5.dex */
    public class C11328c implements C13574c3.a {

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$c$a */
        /* loaded from: classes5.dex */
        public class a extends AbstractRunnableC28185s6 {

            /* renamed from: z */
            final /* synthetic */ C17945a0 f57565z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractRunnableC28185s6.b bVar, List list, int i11, C17945a0 c17945a0) {
                super(bVar, list, i11);
                this.f57565z = c17945a0;
            }

            /* renamed from: h */
            public /* synthetic */ void m61136h(C17945a0 c17945a0) {
                if (c17945a0 == ChatRow.this.f57263B) {
                    c17945a0.m95111d9();
                    ChatRow.this.m61119v3(false);
                }
            }

            @Override // vg.AbstractRunnableC28185s6
            /* renamed from: c */
            public void mo61137c(ArrayList arrayList) {
                super.mo61137c(arrayList);
                if (arrayList != null && arrayList.size() > 0 && arrayList.get(0) != null) {
                    ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.q

                        /* renamed from: q */
                        public final /* synthetic */ C17945a0 f59362q;

                        public /* synthetic */ RunnableC11514q(C17945a0 c17945a0) {
                            r2 = c17945a0;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatRow.C11328c.a.this.m61136h(r2);
                        }
                    });
                }
            }
        }

        C11328c() {
        }

        @Override // com.zing.zalo.p077ui.widget.C13574c3.a
        /* renamed from: a */
        public void mo61133a(String str) {
            new a(ChatRow.this, Collections.singletonList(str), 1001, ChatRow.this.f57263B).m141750b();
        }

        @Override // com.zing.zalo.p077ui.widget.C13574c3.a
        /* renamed from: b */
        public void mo61134b(int i11, int i12, int i13, int i14) {
            ChatRow.this.f57560z4.invalidate(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$d */
    /* loaded from: classes5.dex */
    public class C11329d implements C13646i.b {
        C11329d() {
        }

        @Override // com.zing.zalo.p077ui.widget.C13646i.b
        /* renamed from: a */
        public void mo60887a(String str, String str2, int i11) {
            ChatRow chatRow = ChatRow.this;
            if (chatRow.f57263B != null) {
                chatRow.getDelegate().mo62076b4(str, str2, i11, ChatRow.this.f57263B);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$e */
    /* loaded from: classes5.dex */
    public class C11330e implements AbstractC19378b.a {
        C11330e() {
        }

        /* renamed from: c */
        public /* synthetic */ void m61139c(C2784i.b bVar) {
            C17945a0 m13413a = bVar.m13413a();
            ChatRow chatRow = ChatRow.this;
            if (m13413a == chatRow.f57263B) {
                chatRow.m61119v3(true);
            }
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: d */
        public void onSuccess(C2784i.b bVar) {
            if (bVar.m13413a() != null) {
                ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.p

                    /* renamed from: q */
                    public final /* synthetic */ C2784i.b f59356q;

                    public /* synthetic */ RunnableC11510p(C2784i.b bVar2) {
                        r2 = bVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatRow.C11330e.this.m61139c(r2);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$f */
    /* loaded from: classes5.dex */
    public class C11331f extends AbstractRunnableC28185s6 {

        /* renamed from: A */
        final /* synthetic */ C28769a f57568A;

        /* renamed from: z */
        final /* synthetic */ C17945a0 f57570z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11331f(AbstractRunnableC28185s6.b bVar, List list, int i11, C17945a0 c17945a0, C28769a c28769a) {
            super(bVar, list, i11);
            this.f57570z = c17945a0;
            this.f57568A = c28769a;
        }

        /* renamed from: h */
        public /* synthetic */ void m61142h(C17945a0 c17945a0, C28769a c28769a) {
            if (c17945a0 == ChatRow.this.f57263B) {
                c17945a0.m95111d9();
                c28769a.f133323s = 0L;
                ChatRow.this.m61119v3(false);
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            super.mo61137c(arrayList);
            if (arrayList != null && arrayList.size() > 0 && arrayList.get(0) != null) {
                ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.r

                    /* renamed from: q */
                    public final /* synthetic */ C17945a0 f59369q;

                    /* renamed from: r */
                    public final /* synthetic */ C28769a f59370r;

                    public /* synthetic */ RunnableC11518r(C17945a0 c17945a0, C28769a c28769a) {
                        r2 = c17945a0;
                        r3 = c28769a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatRow.C11331f.this.m61142h(r2, r3);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$g */
    /* loaded from: classes5.dex */
    public class C11332g extends AnimatorListenerAdapter {
        C11332g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ChatRow chatRow = ChatRow.this;
            chatRow.f57445f5 = false;
            if (chatRow.f57400Y0.size() > 9) {
                ChatRow.this.f57366S0 = true;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$h */
    /* loaded from: classes5.dex */
    public class C11333h extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ MessageId f57572l1;

        C11333h(MessageId messageId) {
            this.f57572l1 = messageId;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (this.f57572l1.equals(ChatRow.this.f57263B.m95029V3())) {
                    if (c3979l != null && c3979l.m18839c() != null) {
                        ChatRow.this.f57302H2.setImageInfo(c3979l, false);
                        ChatRow.this.f57308I2 = new BitmapDrawable(ChatRow.this.f57560z4.getResources(), c3979l.m18839c());
                        ChatRow.this.m60914U0(0);
                    }
                    ChatRow.this.invalidate();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$i */
    /* loaded from: classes5.dex */
    public class C11334i extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ MessageId f57574a;

        C11334i(MessageId messageId) {
            this.f57574a = messageId;
        }

        @Override // vg.C28020b3.b
        /* renamed from: a */
        public void mo36247a(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
            if (this.f57574a.equals(ChatRow.this.f57263B.m95029V3())) {
                ChatRow.this.invalidate();
            }
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            if (this.f57574a.equals(ChatRow.this.f57263B.m95029V3())) {
                if (c3979l.m18839c() != null) {
                    ChatRow.this.f57308I2 = new BitmapDrawable(ChatRow.this.f57560z4.getResources(), c3979l.m18839c());
                    ChatRow.this.m60914U0(1);
                }
                ChatRow.this.invalidate();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$j */
    /* loaded from: classes5.dex */
    public class C11335j extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ MessageId f57576l1;

        C11335j(MessageId messageId) {
            this.f57576l1 = messageId;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRow chatRow = ChatRow.this;
                if (chatRow.f57263B != null && chatRow.f57526t2 && chatRow.f57320K2 && Objects.equals(this.f57576l1, chatRow.f57326L2) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    C3977j c3977j = ChatRow.this.f57302H2;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    ChatRow.this.f57308I2 = new BitmapDrawable(ChatRow.this.f57560z4.getResources(), c3979l.m18839c());
                    ChatRow.this.m60914U0(1);
                    ChatRow.this.f57560z4.invalidate();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatRow", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$k */
    /* loaded from: classes5.dex */
    public class C11336k extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ C17945a0 f57579z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11336k(AbstractRunnableC28185s6.b bVar, List list, int i11, C17945a0 c17945a0) {
            super(bVar, list, i11);
            this.f57579z = c17945a0;
        }

        /* renamed from: h */
        public /* synthetic */ void m61144h(C17945a0 c17945a0) {
            if (c17945a0 == ChatRow.this.f57263B) {
                c17945a0.m95111d9();
                ChatRow.this.m61119v3(false);
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            super.mo61137c(arrayList);
            if (arrayList != null && arrayList.size() > 0) {
                ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.s

                    /* renamed from: q */
                    public final /* synthetic */ C17945a0 f59375q;

                    public /* synthetic */ RunnableC11521s(C17945a0 c17945a0) {
                        r2 = c17945a0;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatRow.C11336k.this.m61144h(r2);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$l */
    /* loaded from: classes5.dex */
    public class C11337l extends C23999j {
        C11337l() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRow chatRow = ChatRow.this;
                if (chatRow.f57263B != null && TextUtils.equals(str, chatRow.f57423c1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        ChatRow chatRow2 = ChatRow.this;
                        chatRow2.f57372T0 = chatRow2.f57411a1;
                        ChatRow chatRow3 = ChatRow.this;
                        ChatRow chatRow4 = chatRow3.f57560z4;
                        int i11 = chatRow3.f57435e1;
                        int i12 = chatRow3.f57441f1;
                        int i13 = ChatRow.f57230e6;
                        chatRow4.invalidate(i11, i12, i11 + i13, i13 + i12);
                    }
                    ChatRow chatRow5 = ChatRow.this;
                    chatRow5.f57429d1 = true;
                    C3977j c3977j = chatRow5.f57559z3;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    if (c23995f.m125666q() == 4) {
                        ChatRow.this.f57372T0 = new BitmapDrawable(ChatRow.this.f57560z4.getResources(), c3979l.m18839c());
                    } else {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(ChatRow.this.f57560z4.getResources(), c3979l.m18839c());
                        ChatRow chatRow6 = ChatRow.this;
                        chatRow6.f57372T0 = new TransitionDrawable(new Drawable[]{chatRow6.f57411a1, bitmapDrawable});
                        ChatRow chatRow7 = ChatRow.this;
                        chatRow7.f57372T0.setCallback(chatRow7);
                        ((TransitionDrawable) ChatRow.this.f57372T0).setCrossFadeEnabled(true);
                        ((TransitionDrawable) ChatRow.this.f57372T0).startTransition(100);
                    }
                    ChatRow chatRow32 = ChatRow.this;
                    ChatRow chatRow42 = chatRow32.f57560z4;
                    int i112 = chatRow32.f57435e1;
                    int i122 = chatRow32.f57441f1;
                    int i132 = ChatRow.f57230e6;
                    chatRow42.invalidate(i112, i122, i112 + i132, i132 + i122);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$m */
    /* loaded from: classes5.dex */
    public class C11338m extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f57581l1;

        /* renamed from: m1 */
        final /* synthetic */ ContactProfile f57582m1;

        C11338m(String str, ContactProfile contactProfile) {
            this.f57581l1 = str;
            this.f57582m1 = contactProfile;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:            r8 = r7.getBounds();     */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (ChatRow.this.f57263B != null && TextUtils.equals(str, this.f57581l1)) {
                    Drawable drawable = (Drawable) ChatRow.this.f57378U0.get(this.f57582m1.mo2478b());
                    ChatRow.this.f57378U0.remove(this.f57582m1.mo2478b());
                    ChatRow chatRow = ChatRow.this;
                    int i11 = chatRow.f57467j3;
                    int i12 = chatRow.f57473k3;
                    int i13 = ChatRow.f57209P5;
                    int i14 = ChatRow.f57225Z5;
                    Rect rect = new Rect(i11, i12, (i13 * 2) + (i14 * 9) + 16 + i11, (i13 * 2) + i12 + i14);
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        ChatRow.this.f57378U0.put(this.f57582m1.mo2478b(), ChatRow.this.f57411a1);
                        ChatRow.this.f57560z4.invalidate(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    if (c23995f.m125666q() == 4) {
                        ChatRow.this.f57378U0.put(this.f57582m1.mo2478b(), new BitmapDrawable(ChatRow.this.f57560z4.getResources(), c3979l.m18839c()));
                    } else {
                        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{ChatRow.this.f57411a1, new BitmapDrawable(ChatRow.this.f57560z4.getResources(), c3979l.m18839c())});
                        transitionDrawable.setCallback(ChatRow.this);
                        transitionDrawable.setCrossFadeEnabled(true);
                        transitionDrawable.startTransition(100);
                        ChatRow.this.f57378U0.put(this.f57582m1.mo2478b(), transitionDrawable);
                    }
                    ChatRow.this.f57560z4.invalidate(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRow$n */
    /* loaded from: classes5.dex */
    public interface InterfaceC11339n {
        /* renamed from: A */
        boolean mo61145A(String str, MessageId messageId);

        /* renamed from: P0 */
        void mo61146P0(ChatRow chatRow);

        /* renamed from: Q0 */
        void mo61147Q0();

        /* renamed from: a */
        void mo61148a(String str, MessageId messageId);

        /* renamed from: b */
        void mo61149b(ChatRow chatRow);

        /* renamed from: i0 */
        void mo61150i0();

        /* renamed from: j */
        void mo61151j(C7853b.b bVar);

        /* renamed from: k */
        void mo61152k();

        /* renamed from: m */
        void mo61153m(C7853b.d dVar);

        /* renamed from: z */
        boolean mo61154z(C17945a0 c17945a0);
    }

    static {
        float m118742r = AbstractC23136l9.m118742r(9.0f);
        f57179A5 = m118742r;
        f57181B5 = new float[]{f57179A5, f57179A5, f57179A5, f57179A5, f57179A5, f57179A5, f57179A5, f57179A5};
        f57183C5 = new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r};
        f57185D5 = new float[]{m118742r, m118742r, m118742r, m118742r, f57179A5, f57179A5, f57179A5, f57179A5};
        f57187E5 = new float[]{f57179A5, f57179A5, f57179A5, f57179A5, m118742r, m118742r, m118742r, m118742r};
        f57189F5 = AbstractC23136l9.m118742r(6.0f);
        f57191G5 = AbstractC23136l9.m118742r(5.0f);
        f57193H5 = AbstractC23136l9.m118742r(10.0f);
        f57195I5 = AbstractC23136l9.m118742r(3.0f);
        f57197J5 = AbstractC23136l9.m118742r(10.0f);
        f57199K5 = AbstractC23136l9.m118742r(13.0f);
        f57201L5 = AbstractC23136l9.m118742r(10.0f);
        f57203M5 = AbstractC23136l9.m118742r(10.0f);
        f57205N5 = AbstractC23136l9.m118742r(4.0f);
        f57207O5 = AbstractC23136l9.m118742r(14.0f);
        f57209P5 = AbstractC23136l9.m118742r(4.0f);
        f57211Q5 = AbstractC23136l9.m118742r(16.0f);
        f57213R5 = AbstractC23136l9.m118742r(1.5f);
        f57215S5 = AbstractC23136l9.m118742r(0.5f);
        f57217T5 = AbstractC23136l9.m118742r(26.0f);
        f57219U5 = AbstractC23136l9.m118742r(10.0f);
        f57221V5 = AbstractC23136l9.m118742r(16.0f);
        f57222W5 = AbstractC23222t7.f112528I;
        f57223X5 = AbstractC23136l9.m118742r(36.0f);
        f57224Y5 = AbstractC23136l9.m118742r(40.0f);
        f57225Z5 = AbstractC23136l9.m118742r(20.0f);
        f57226a6 = 255;
        f57227b6 = 255;
        f57228c6 = 255;
        f57230e6 = AbstractC23136l9.m118742r(28.0f);
        f57231f6 = AbstractC23136l9.m118742r(12.0f);
        f57232g6 = AbstractC23136l9.m118742r(16.0f);
        f57233h6 = AbstractC23136l9.m118742r(60.0f);
        f57234i6 = AbstractC23136l9.m118742r(150.0f);
        f57235j6 = AbstractC23136l9.m118742r(12.0f);
        int m118742r2 = AbstractC23136l9.m118742r(6.0f);
        f57236k6 = m118742r2;
        int i11 = f57230e6;
        int i12 = f57235j6;
        f57237l6 = i11 + i12 + m118742r2;
        f57238m6 = i11 + i12 + m118742r2;
        f57239n6 = AbstractC23136l9.m118742r(16.0f);
        f57240o6 = AbstractC23136l9.m118742r(110.0f);
        f57242q6 = AbstractC23136l9.m118742r(11.0f);
        f57248v6 = AbstractC23136l9.m118742r(20.0f);
        f57250w6 = AbstractC23136l9.m118742r(32.0f);
        int m118742r3 = AbstractC23136l9.m118742r(3.0f);
        f57252x6 = m118742r3;
        f57254y6 = m118742r3 / 2.0f;
        f57196I6 = AbstractC23136l9.m118742r(110.0f);
        f57198J6 = AbstractC23136l9.m118742r(100.0f);
        f57200K6 = "";
        f57202L6 = AbstractC23136l9.m118742r(16.0f);
        f57214R6 = AbstractC23136l9.m118742r(110.0f);
        f57220U6 = AbstractC23136l9.m118742r(2.0f);
    }

    public ChatRow(Context context) {
        this(context, null);
    }

    /* renamed from: A2 */
    private C28227x3 m60899A2(int i11, int i12, C28227x3 c28227x3) {
        C28227x3 mo60952C2 = mo60952C2(i11, i12, getTempDimension());
        int min = Math.min(i12, Math.max(mo60952C2.f131648a, i11));
        this.f57422c0 = min;
        this.f57428d0 = mo60952C2.f131649b;
        int i13 = 0;
        int max = Math.max(0, min);
        int i14 = this.f57428d0;
        C28227x3 mo60959E2 = mo60959E2(max, i11, i12, getTempDimension());
        int i15 = mo60959E2.f131648a;
        this.f57383V = i15;
        this.f57389W = mo60959E2.f131649b;
        int max2 = Math.max(max, i15);
        int i16 = i14 + this.f57389W;
        C28227x3 mo61130z2 = mo61130z2(max2, i11, i12, getTempDimension());
        this.f57410a0 = mo61130z2.f131648a;
        int i17 = mo61130z2.f131649b;
        this.f57416b0 = i17;
        if (i17 <= 0) {
            i13 = getDefaultBubblePaddingBottom();
        }
        int max3 = Math.max(max2, this.f57410a0);
        int i18 = i16 + this.f57416b0 + i13;
        c28227x3.f131648a = max3;
        c28227x3.f131649b = i18;
        return c28227x3;
    }

    /* renamed from: B1 */
    private boolean m60901B1() {
        C17945a0 mo62038F4 = this.f57549x3.mo62038F4();
        if (!this.f57263B.equals(mo62038F4) && mo62038F4 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B3 */
    private void m60902B3(C17945a0 c17945a0, C28769a c28769a) {
        String str;
        if (c17945a0.m95032V6()) {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            c28769a.f133320p = contactProfile.f42446v;
            c28769a.f133305a = contactProfile.f42437s;
            return;
        }
        if (mo61011R() || mo60989M(c17945a0, c28769a)) {
            long mo124319c = C23793c.m124316k().mo124319c();
            if ((TextUtils.isEmpty(c28769a.f133305a) || mo124319c - c28769a.f133323s > 5000) && c17945a0.m95041W4() != -2 && c17945a0.m95041W4() != -1 && c17945a0.m95041W4() != -3 && c17945a0.m95041W4() != -4 && c17945a0.m95041W4() != -5) {
                c28769a.f133323s = mo124319c;
                ContactProfile m141811g = C28203u6.f131407a.m141811g(c17945a0.m94862C4());
                if (m141811g == null) {
                    m141811g = new ContactProfile(c17945a0.m94862C4());
                    m141811g.f42437s = c17945a0.m94854B4();
                    new C11331f(this, Collections.singletonList(c17945a0.m94862C4()), 1050, c17945a0, c28769a).m141750b();
                }
                String m40383Q = m141811g.m40383Q(true, false);
                if (m40383Q != null) {
                    str = m40383Q.replace("\n", " ").trim();
                } else {
                    str = "";
                }
                if (c17945a0.m94847A6()) {
                    str = AbstractC23184q2.m119453k(c17945a0.m94862C4(), str, c17945a0.mo95039W2());
                    c28769a.f133306b = Boolean.valueOf(AbstractC30201b.m148949b(C0943w.m4462l().m4473g(c17945a0.mo95039W2()), m141811g));
                }
                c28769a.f133305a = str;
                c28769a.f133320p = m141811g.f42446v;
            }
        }
    }

    /* renamed from: D3 */
    private void m60905D3() {
        if (AbstractC23304d.m120544o()) {
            C32012m m94912I2 = this.f57263B.m94912I2();
            if (m94912I2 != null) {
                this.f57545w4 = m94912I2.f147327u;
                this.f57550x4 = m94912I2.f147328v;
            } else {
                this.f57545w4 = -1;
                this.f57550x4 = -1;
            }
        }
    }

    /* renamed from: E0 */
    private void m60906E0(Canvas canvas, String str, Drawable drawable, int i11, int i12, boolean z11, boolean z12) {
        int i13 = f57225Z5;
        int i14 = i11 + i13;
        int i15 = i12 + i13;
        if (this.f57445f5 && !this.f57337N1) {
            float f11 = this.f57451g5;
            if (!this.f57384V0.containsKey(str)) {
                f11 = this.f57457h5;
            }
            if (!str.isEmpty()) {
                if (z12) {
                    i14 = (int) ((i11 + (i13 * 2)) - (f11 * i13));
                    i11 = (int) ((i11 + i13) - (i13 * f11));
                }
                if (z11) {
                    drawable.setAlpha((int) ((1.0f - this.f57451g5) * 255.0f));
                }
            } else if (!this.f57366S0) {
                drawable.setAlpha((int) (this.f57451g5 * 255.0f));
            }
        }
        if (this.f57343O1) {
            drawable.setAlpha((int) (this.f57355Q1 * 255.0f));
        }
        drawable.setBounds(i11, i12, i14, i15);
        drawable.draw(canvas);
        f57229d6.setAlpha((int) (this.f57355Q1 * 255.0f));
        canvas.drawCircle(((i14 + i11) * 1.0f) / 2.0f, ((i15 + i12) * 1.0f) / 2.0f, (i13 * 1.0f) / 2.0f, f57229d6);
        this.f57395X0.add(drawable);
        if (!this.f57445f5 && !str.isEmpty() && !this.f57384V0.containsKey(str)) {
            this.f57384V0.put(str, drawable);
        }
    }

    /* renamed from: F0 */
    private void m60907F0(Canvas canvas) {
        String str;
        boolean z11;
        int i11 = this.f57536v0 - f57225Z5;
        int i12 = this.f57497o3;
        int min = Math.min(this.f57400Y0.size(), 9);
        for (int size = this.f57400Y0.size() - 1; size >= this.f57400Y0.size() - min; size--) {
            if (size < this.f57400Y0.size() && size >= 0) {
                String str2 = (String) this.f57400Y0.get(size);
                Drawable drawable = (Drawable) this.f57378U0.get(str2);
                if (drawable != null) {
                    if (this.f57400Y0.size() > 9 && size == this.f57400Y0.size() - min) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m60906E0(canvas, str2, drawable, i11, i12, z11, true);
                    i11 -= f57225Z5 + 2;
                }
            }
        }
        int i13 = i11 + f57225Z5 + 2;
        if (this.f57400Y0.size() > 9) {
            if (!this.f57366S0) {
                List list = this.f57400Y0;
                String str3 = (String) list.get((list.size() - min) - 1);
                Drawable drawable2 = (Drawable) this.f57378U0.get(str3);
                if (drawable2 != null) {
                    m60906E0(canvas, str3, drawable2, i13, i12, true, false);
                }
            }
            int size2 = this.f57400Y0.size() - 8;
            if (size2 < 100) {
                str = size2 + "+";
            } else {
                str = "99+";
            }
            C16640q2.a aVar = (C16640q2.a) C16640q2.m88404a();
            aVar.f83904h = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.clear_blue);
            aVar.mo88409c();
            m60906E0(canvas, "", aVar.mo88412f(str, C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor)), i13, i12, false, false);
        }
    }

    /* renamed from: F2 */
    private void m60908F2(C17945a0 c17945a0) {
        this.f57293G = 0;
        int mo60974I2 = mo60974I2();
        this.f57299H = mo60974I2;
        int bubbleMarginTop = this.f57293G + mo60974I2 + getBubbleMarginTop();
        this.f57293G = bubbleMarginTop;
        C28227x3 mo60969H2 = mo60969H2(bubbleMarginTop, getTempDimension());
        this.f57329M = mo60969H2.f131648a;
        int i11 = mo60969H2.f131649b;
        this.f57335N = i11;
        this.f57293G += i11 + getBubbleMarginBottom();
        int m60966G2 = m60966G2();
        this.f57305I = m60966G2;
        this.f57293G += m60966G2;
    }

    /* renamed from: M2 */
    private void m60909M2() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = this.f57435e1;
        int i14 = this.f57441f1;
        int i15 = i11 + i13;
        int i16 = f57230e6;
        getDelegate().mo62072Z3(this.f57263B.m94862C4(), new Rect(i11 + i13, i12 + i14, i15 + i16, i12 + i14 + i16));
    }

    /* renamed from: N1 */
    private boolean m60910N1() {
        if ((getParent() instanceof SwipeItemListView) && ((SwipeItemListView) getParent()).m76921I2(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: Q1 */
    private boolean m60911Q1() {
        List list;
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m95089b4() == 4 && (list = this.f57400Y0) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: T1 */
    public /* synthetic */ void m60912T1() {
        m61119v3(true);
    }

    /* renamed from: T3 */
    private void m60913T3(long j11) {
        if (this.f57490n2 == null) {
            this.f57490n2 = new RectF();
        }
        if (this.f57460i2 == null) {
            this.f57460i2 = new Rect();
        }
        String m119278p = AbstractC23160o0.m119278p(j11);
        if (!TextUtils.isEmpty(m119278p)) {
            if (!TextUtils.equals(this.f57448g2, m119278p)) {
                this.f57448g2 = m119278p;
                f57245t6.getTextBounds(m119278p, 0, m119278p.length(), this.f57460i2);
                this.f57490n2.set(f57179A5, f57179A5, this.f57460i2.width() + (f57189F5 * 2), this.f57460i2.height() + (f57195I5 * 2));
                return;
            }
            return;
        }
        this.f57448g2 = "";
        RectF rectF = this.f57490n2;
        rectF.top = f57179A5;
        rectF.bottom = f57179A5;
    }

    /* renamed from: U0 */
    public void m60914U0(int i11) {
        Drawable drawable = this.f57308I2;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && this.f57308I2.getIntrinsicHeight() != 0) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        int i12 = f57250w6;
                        float max = Math.max(i12 / this.f57308I2.getIntrinsicWidth(), i12 / this.f57308I2.getIntrinsicHeight());
                        this.f57380U2 = (int) (this.f57308I2.getIntrinsicWidth() * max);
                        int intrinsicHeight = (int) (max * this.f57308I2.getIntrinsicHeight());
                        this.f57386V2 = intrinsicHeight;
                        this.f57368S2 = (i12 - this.f57380U2) / 2;
                        this.f57374T2 = (i12 - intrinsicHeight) / 2;
                        return;
                    }
                    return;
                }
                int i13 = f57250w6;
                float min = Math.min(i13 / this.f57308I2.getIntrinsicWidth(), i13 / this.f57308I2.getIntrinsicHeight());
                this.f57380U2 = (int) (this.f57308I2.getIntrinsicWidth() * min);
                int intrinsicHeight2 = (int) (min * this.f57308I2.getIntrinsicHeight());
                this.f57386V2 = intrinsicHeight2;
                this.f57368S2 = (i13 - this.f57380U2) / 2;
                this.f57374T2 = (i13 - intrinsicHeight2) / 2;
                return;
            }
            this.f57380U2 = (int) (this.f57308I2.getIntrinsicWidth() * 1.0f);
            int intrinsicHeight3 = (int) (this.f57308I2.getIntrinsicHeight() * 1.0f);
            this.f57386V2 = intrinsicHeight3;
            int i14 = f57250w6;
            this.f57368S2 = (i14 - this.f57380U2) / 2;
            this.f57374T2 = (i14 - intrinsicHeight3) / 2;
        }
    }

    /* renamed from: U1 */
    public /* synthetic */ Object m60915U1(boolean z11) {
        if (z11) {
            ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.n
                public /* synthetic */ RunnableC11502n() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRow.this.m60912T1();
                }
            });
            return null;
        }
        return null;
    }

    /* renamed from: V0 */
    private boolean m60916V0() {
        if (this.f57263B != null) {
            C31973j5 m4473g = C0943w.m4462l().m4473g(this.f57263B.m94853B3());
            if (m4473g != null) {
                if (!m4473g.m153764i0() || m4473g.m153742T()) {
                    return true;
                }
                return false;
            }
            if (!C18644n.m98531l().m98558u(this.f57263B.mo95039W2())) {
                return !C29583g.f136521a.m146999m(this.f57263B.mo95039W2());
            }
        }
        return true;
    }

    /* renamed from: V1 */
    public /* synthetic */ void m60917V1() {
        C7956b.m41474B().m41556r0(this.f57263B, CoreUtility.f89233i);
    }

    /* renamed from: W1 */
    public /* synthetic */ void m60918W1() {
        if (AbstractC19444a.m101693a()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    /* renamed from: X1 */
    public /* synthetic */ void m60919X1() {
        m61119v3(false);
    }

    /* renamed from: Y1 */
    public /* synthetic */ void m60920Y1(ValueAnimator valueAnimator) {
        this.f57451g5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f57457h5 == -1.0f) {
            postInvalidate();
        }
    }

    /* renamed from: Z1 */
    public /* synthetic */ void m60921Z1(ValueAnimator valueAnimator) {
        this.f57457h5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    /* renamed from: a0 */
    private boolean m60922a0() {
        ContactProfile m141811g;
        if (this.f57439e5.size() != 0) {
            for (ContactProfile contactProfile : this.f57439e5) {
                if (contactProfile != null && contactProfile.f42446v != null && (m141811g = C28203u6.f131407a.m141811g(contactProfile.mo2478b())) != null && !TextUtils.equals(m141811g.f42446v, contactProfile.f42446v)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a2 */
    public /* synthetic */ void m60923a2(C17945a0 c17945a0, String str, int i11, boolean z11, C3979l c3979l) {
        if (c3979l != null) {
            try {
                if (c17945a0 == this.f57263B) {
                    this.f57351P3 = C31903ea.f146582a.m153342g(str, i11, 1);
                    if (!z11) {
                        this.f57263B.m95111d9();
                        C23744a.m124114c().m124116d(6, this.f57263B.m95029V3(), this.f57263B.mo95039W2());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b0 */
    private void m60924b0(C17945a0 c17945a0) {
        boolean z11;
        this.f57334M4 = this.f57549x3.mo62063S(c17945a0);
        this.f57340N4 = this.f57549x3.mo62084h0(c17945a0);
        if (getBubbleStyle() != 1 && this.f57549x3.mo62101s4() == 1 && !this.f57549x3.mo62086i0() && (this.f57334M4 || this.f57340N4)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57346O4 = z11;
        if (z11) {
            if (this.f57370S4 == null) {
                C17024o0 c17024o0 = new C17024o0(getContext(), new C17024o0.a() { // from class: com.zing.zalo.ui.chat.chatrow.g
                    public /* synthetic */ C11474g() {
                    }

                    @Override // com.zing.zalo.zdesign.component.C17024o0.a
                    /* renamed from: a */
                    public final void mo61929a() {
                        ChatRow.this.invalidate();
                    }
                });
                this.f57370S4 = c17024o0;
                c17024o0.m91137A(true);
                C17024o0 c17024o02 = this.f57370S4;
                int i11 = f57222W5;
                c17024o02.m91149M(i11 / 2, i11 / 2);
            }
            if (this.f57376T4 == null) {
                C21197a c21197a = new C21197a(this);
                this.f57376T4 = c21197a;
                c21197a.m109766i(500L);
                this.f57376T4.m109763e(AbstractC11531v0.m62148H3(), 2);
            }
        }
        C21197a c21197a2 = this.f57376T4;
        if (c21197a2 != null) {
            if (this.f57340N4) {
                c21197a2.m109767j();
            } else {
                c21197a2.m109768k();
            }
        }
    }

    /* renamed from: d0 */
    private void m60925d0(C17945a0 c17945a0, boolean z11) {
        if (c17945a0 != null && c17945a0.m95162i8() && !c17945a0.m95142g6() && !c17945a0.m95242r8()) {
            AbstractC3489d.m17517y(c17945a0, new InterfaceC18494a() { // from class: com.zing.zalo.ui.chat.chatrow.h

                /* renamed from: q */
                public final /* synthetic */ boolean f59138q;

                public /* synthetic */ C11478h(boolean z112) {
                    r2 = z112;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    Object m60915U1;
                    m60915U1 = ChatRow.this.m60915U1(r2);
                    return m60915U1;
                }
            });
        }
    }

    /* renamed from: f0 */
    private void m60926f0() {
        this.f57400Y0.clear();
        this.f57439e5.clear();
        this.f57384V0.clear();
        this.f57378U0.clear();
        this.f57445f5 = false;
    }

    private String getCurrentTimeText() {
        if (getDelegate().mo62101s4() == 2) {
            return this.f57263B.m95284w3();
        }
        return this.f57263B.m94967O4();
    }

    private String getMsgFooterTalkText() {
        String str = "";
        try {
            if (this.f57412a2 && this.f57385V1 != null) {
                str = ("" + this.f57385V1) + "\n";
            }
            if (this.f57425c3 && !TextUtils.isEmpty(this.f57461i3)) {
                return (str + this.f57461i3) + "\n";
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    private String getMsgHeaderTalkText() {
        String str;
        Exception e11;
        CharSequence charSequence = "";
        try {
            if (!this.f57508q2 || this.f57514r2 == null) {
                str = "";
            } else {
                str = "" + this.f57514r2.m146544f();
                try {
                    str = str + "\n";
                } catch (Exception e12) {
                    e11 = e12;
                    e11.printStackTrace();
                    return str;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            StaticLayout staticLayout = this.f57489n1;
            if (staticLayout != null) {
                charSequence = staticLayout.getText();
            }
            sb2.append((Object) charSequence);
            return sb2.toString();
        } catch (Exception e13) {
            str = "";
            e11 = e13;
        }
    }

    private Drawable getRefBackgroundDrawable() {
        C30799a m62193R1 = AbstractC11531v0.m62193R1();
        int i11 = 0;
        if (mo61124x1()) {
            if (this.f57263B.m94987Q7()) {
                if (m61099p1()) {
                    i11 = 4;
                }
                m62193R1.m149863a(1, i11 | 8);
            } else {
                if (m61099p1()) {
                    i11 = 4;
                }
                m62193R1.m149863a(1, i11 | 9);
            }
        } else if (this.f57263B.m94987Q7()) {
            if (this.f57480l4) {
                i11 = 4;
            }
            m62193R1.m149863a(1, i11);
        } else {
            if (this.f57480l4) {
                i11 = 4;
            }
            m62193R1.m149863a(1, i11 | 1);
        }
        return m62193R1;
    }

    public static int getReplyBubbleSpacingLeft() {
        return f57238m6;
    }

    private C28227x3 getTempDimension() {
        C28227x3 c28227x3 = this.f57421b5;
        c28227x3.f131649b = 0;
        c28227x3.f131648a = 0;
        return c28227x3;
    }

    /* renamed from: j0 */
    private StaticLayout m60927j0(String str, int i11) {
        CharSequence ellipsize = TextUtils.ellipsize(str, getSenderTextPaint(), i11, TextUtils.TruncateAt.END);
        StaticLayout staticLayout = this.f57489n1;
        if (staticLayout != null && staticLayout.getText().equals(ellipsize) && this.f57489n1.getWidth() == i11) {
            return this.f57489n1;
        }
        return AbstractC23214t.m119625l(ellipsize, getSenderTextPaint(), i11, 1);
    }

    /* renamed from: r1 */
    private boolean m60928r1() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.equals(this.f57549x3.mo62038F4())) {
            return true;
        }
        return false;
    }

    /* renamed from: r3 */
    private void m60929r3() {
        if (!this.f57337N1 || !this.f57493n5) {
            this.f57451g5 = -1.0f;
            this.f57457h5 = -1.0f;
            ValueAnimator valueAnimator = this.f57463i5;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.f57463i5.cancel();
            }
            ValueAnimator valueAnimator2 = this.f57469j5;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
                this.f57469j5.cancel();
            }
            if (this.f57445f5 && !this.f57337N1) {
                this.f57451g5 = f57179A5;
                if (this.f57463i5 == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f57179A5, 1.0f);
                    this.f57463i5 = ofFloat;
                    ofFloat.setDuration(this.f57475k5);
                    this.f57463i5.setInterpolator(new LinearInterpolator());
                }
                this.f57463i5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.chat.chatrow.i
                    public /* synthetic */ C11482i() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatRow.this.m60920Y1(valueAnimator3);
                    }
                });
                this.f57463i5.start();
                if (this.f57469j5 == null) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f57179A5, 1.0f);
                    this.f57469j5 = ofFloat2;
                    ofFloat2.setDuration(this.f57475k5);
                    this.f57469j5.setStartDelay(this.f57481l5);
                    this.f57469j5.setInterpolator(new OvershootInterpolator());
                }
                this.f57469j5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.chat.chatrow.j
                    public /* synthetic */ C11486j() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatRow.this.m60921Z1(valueAnimator3);
                    }
                });
                this.f57469j5.addListener(new C11332g());
                this.f57469j5.start();
                return;
            }
            invalidate();
        }
    }

    /* renamed from: s1 */
    private boolean m60930s1(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.equals(this.f57549x3.mo62038F4())) {
            return true;
        }
        return false;
    }

    /* renamed from: s2 */
    private void m60931s2(C17997r1 c17997r1) {
        try {
            if (this.f57526t2 && this.f57320K2) {
                if (this.f57302H2 == null) {
                    this.f57302H2 = new C3977j(getContext());
                }
                m60942y3();
                int m95687d = c17997r1.m95687d();
                if (m95687d == 36) {
                    m60936v2(c17997r1);
                    return;
                }
                if (m95687d == 43) {
                    this.f57308I2 = AbstractC11531v0.m62331u3();
                    return;
                }
                if (m95687d == 31) {
                    this.f57308I2 = AbstractC11531v0.m62341w3();
                } else if (m95687d == 46) {
                    m60932t2(c17997r1);
                } else {
                    m60938w2(c17997r1);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: t2 */
    private void m60932t2(C17997r1 c17997r1) {
        if (c17997r1.m95690g() != null && (c17997r1.m95690g() instanceof C17990p0)) {
            C17990p0 c17990p0 = (C17990p0) c17997r1.m95690g();
            String str = c17990p0.f91115D;
            if (c17990p0.m95670k()) {
                this.f57308I2 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_folder);
            } else {
                Drawable m142197h = AbstractC28236y3.m142197h(getContext(), str);
                if (m142197h != null) {
                    this.f57308I2 = m142197h;
                }
            }
            m60914U0(0);
        }
    }

    /* renamed from: u2 */
    private void m60934u2(C17997r1 c17997r1) {
        int m95687d = c17997r1.m95687d();
        if (m95687d == 32) {
            this.f57308I2 = AbstractC11531v0.m62113A3();
        } else if (m95687d == 44) {
            this.f57308I2 = AbstractC11531v0.m62118B3();
        }
        m60914U0(-1);
    }

    /* renamed from: v2 */
    private void m60936v2(C17997r1 c17997r1) {
        if (c17997r1.m95694k() == null) {
            return;
        }
        if (m60973I1() && !AbstractC24006q.m125853Z1(c17997r1.m95694k().m132446x()) && !C28020b3.f130648a.m141181D(c17997r1.m95694k())) {
            return;
        }
        c17997r1.m95706w(C28644j.m143233Y().m143282P0(c17997r1.m95694k()));
        C25630b m95694k = c17997r1.m95694k();
        if (m95694k.m132448z()) {
            Bitmap m141206w = C28020b3.f130648a.m141206w(m95694k);
            if (m141206w != null) {
                this.f57308I2 = new BitmapDrawable(m141206w);
                return;
            }
            return;
        }
        MessageId m95029V3 = this.f57263B.m95029V3();
        if (C25630b.m132391I(m95694k)) {
            ((C23528a) this.f57275D.m123612r(this.f57302H2)).m123579C(m95694k.m132444v(), C23278z2.m120068F(), new C11333h(m95029V3));
        } else {
            C28020b3.f130648a.m141182F(this.f57302H2, this.f57275D, m95694k, null, false, new C11334i(m95029V3));
        }
    }

    /* renamed from: w2 */
    private void m60938w2(C17997r1 c17997r1) {
        String str;
        String str2;
        MessageId m95689f = c17997r1.m95689f();
        C17945a0 m2636s = AbstractC23306f.m120584H0().m2636s(m95689f);
        if (m2636s != null && m2636s.m94959N6()) {
            m60934u2(c17997r1);
            return;
        }
        if (AbstractC31111g.m151137r(c17997r1)) {
            m60934u2(c17997r1);
            return;
        }
        int m95687d = c17997r1.m95687d();
        if (m95687d != 32) {
            if (m95687d != 44 && m95687d != 49) {
                if (m95687d != 37) {
                    if (m95687d == 38) {
                        if (m2636s != null) {
                            if (m2636s.m95026V0()) {
                                if (!TextUtils.isEmpty(m2636s.m94983Q3())) {
                                    str2 = m2636s.m94983Q3();
                                } else if (c17997r1.m95690g() != null) {
                                    str2 = c17997r1.m95690g().f91013r;
                                }
                            } else {
                                this.f57320K2 = false;
                            }
                        } else if (c17997r1.m95690g() != null) {
                            str2 = c17997r1.m95690g().f91013r;
                        }
                    }
                    str2 = "";
                } else if (m2636s != null && !TextUtils.isEmpty(m2636s.m94983Q3())) {
                    str2 = m2636s.m94983Q3();
                } else {
                    if (c17997r1.m95690g() != null) {
                        str2 = c17997r1.m95690g().f91014s;
                    }
                    str2 = "";
                }
            } else {
                if (c17997r1.m95690g() != null) {
                    str = c17997r1.m95690g().f91013r;
                    if (TextUtils.isEmpty(str)) {
                        str2 = c17997r1.m95690g().f91014s;
                    }
                    str2 = str;
                }
                str2 = "";
            }
        } else if (m2636s != null && !TextUtils.isEmpty(m2636s.m94983Q3())) {
            str2 = m2636s.m94983Q3();
        } else {
            if (c17997r1.m95690g() != null) {
                str = c17997r1.m95690g().f91013r;
                if (TextUtils.isEmpty(str)) {
                    str2 = c17997r1.m95690g().f91014s;
                }
                str2 = str;
            }
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (!m60988L3() && !C23999j.m125696L2(str2, C23278z2.m120122e())) {
            return;
        }
        C11335j c11335j = new C11335j(m95689f);
        c11335j.m125611h1(26000, 0);
        ((C23528a) this.f57275D.m123612r(this.f57302H2)).m123579C(str2, C23278z2.m120122e(), c11335j);
    }

    /* renamed from: x3 */
    public static void m60940x3() {
        Paint paint = f57218T6;
        if (paint != null) {
            paint.setColor(C23212s8.m119606n(AbstractC16781w.BubbleChatBackgroundSearchHighlight));
        }
        ChatRowHasCaption.Companion.m61435c();
        ChatRowText.Companion.m61689c();
    }

    /* renamed from: y3 */
    private void m60942y3() {
        if (this.f57314J2 == null) {
            this.f57314J2 = C23278z2.m120122e().f116261b;
        }
        this.f57308I2 = this.f57314J2;
        int i11 = f57250w6;
        this.f57380U2 = i11;
        this.f57386V2 = i11;
        this.f57368S2 = 0;
        this.f57374T2 = 0;
    }

    /* renamed from: z0 */
    private void m60944z0(Canvas canvas) {
        int i11;
        int i12;
        if (AbstractC23304d.m120544o()) {
            String str = "";
            if (AbstractC23304d.m120544o() && (this.f57550x4 != -1 || this.f57545w4 != -1)) {
                if (!TextUtils.isEmpty("")) {
                    str = "|";
                }
                str = str + C19639k.f97504a.m102873a(this.f57545w4, this.f57550x4);
            }
            if (!TextUtils.isEmpty(str)) {
                if (f57212Q6 == null) {
                    C13704p1 c13704p1 = new C13704p1(1);
                    f57212Q6 = c13704p1;
                    c13704p1.setColor(-1);
                    f57212Q6.setTextSize(AbstractC23136l9.m118759w1(10));
                    f57212Q6.setTypeface(Typeface.DEFAULT_BOLD);
                    Paint paint = new Paint(1);
                    f57210P6 = paint;
                    paint.setStyle(Paint.Style.FILL);
                    f57210P6.setColor(-14960915);
                }
                int m118742r = AbstractC23136l9.m118742r(3.0f);
                int m118764y0 = AbstractC23136l9.m118764y0(f57212Q6, str);
                int m118761x0 = AbstractC23136l9.m118761x0(f57212Q6, str);
                int i13 = this.f57541w0;
                int i14 = m118742r * 2;
                int i15 = (i13 - m118761x0) - i14;
                if (this.f57263B.m94987Q7()) {
                    i11 = this.f57536v0 + m118742r;
                    i12 = m118764y0 + i11 + i14;
                } else {
                    int i16 = this.f57530u0 - m118742r;
                    i11 = (i16 - m118764y0) - i14;
                    i12 = i16;
                }
                this.f57555y4.set(i11, i15, i12, i13);
                canvas.drawRoundRect(this.f57555y4, AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(4.0f), f57210P6);
                canvas.drawText(str, i11 + m118742r, this.f57541w0 - m118742r, f57212Q6);
            }
        }
    }

    /* renamed from: A0 */
    protected void m60945A0(Canvas canvas) {
        float f11 = this.f57509q3;
        int i11 = this.f57521s3;
        canvas.drawLine(f11, i11, this.f57515r3, i11, f57255z5);
        if (this.f57303H3 != null) {
            canvas.save();
            canvas.translate(this.f57309I3, this.f57315J3);
            this.f57303H3.draw(canvas);
            canvas.restore();
        }
        AbstractC28236y3.m142204o(AbstractC11531v0.m62340w2(), this.f57327L3, this.f57321K3).draw(canvas);
    }

    /* renamed from: A1 */
    protected boolean mo60946A1() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && !c17945a0.m95219o8() && !this.f57263B.m95091b6()) {
            return true;
        }
        return false;
    }

    /* renamed from: A3 */
    public void mo60947A3() {
        this.f57306I0 = false;
        this.f57312J0 = false;
        this.f57318K0 = false;
        this.f57324L0 = false;
        this.f57330M0 = false;
        this.f57336N0 = false;
        this.f57342O0 = false;
        this.f57348P0 = false;
        this.f57354Q0 = false;
        this.f57360R0 = false;
        this.f57465j1 = false;
        this.f57534u4 = false;
        this.f57540v4 = false;
        this.f57265B1 = false;
        this.f57277D1 = false;
        this.f57313J1 = false;
        this.f57539v3 = false;
        this.f57544w3 = false;
        this.f57316J4 = false;
        this.f57322K4 = false;
        this.f57480l4 = false;
        this.f57392W2 = false;
        this.f57503p3 = false;
        this.f57325L1 = false;
        this.f57352P4 = false;
    }

    /* renamed from: B0 */
    public boolean m60948B0(Canvas canvas) {
        int i11;
        if (mo61124x1() && m61127y1()) {
            int i12 = this.f57524t0;
            if (this.f57333M3) {
                i12 = this.f57456h4;
            }
            if (this.f57508q2) {
                i11 = f57195I5;
            } else if (this.f57501p1 && !this.f57507q1) {
                i11 = f57195I5;
            } else if (!this.f57261A3 && !this.f57267B3) {
                if (this.f57262A4) {
                    i11 = f57193H5;
                } else {
                    i11 = f57195I5;
                }
            } else {
                i11 = f57195I5;
            }
            canvas.drawRect(getLeft(), getTop() + Math.max(i12 - i11, 0), getLeft() + getWidth(), getTop() + getHeight(), f57218T6);
        }
        return false;
    }

    /* renamed from: B2 */
    public C28227x3 mo60949B2(boolean z11, int i11, C28227x3 c28227x3) {
        int i12;
        Drawable m62123C3;
        int i13 = 0;
        if (this.f57346O4) {
            int i14 = f57222W5;
            int i15 = f57203M5;
            i13 = Math.max(0, i14 + i15);
            i12 = i14 + i15;
        } else {
            i12 = 0;
        }
        if (m61121w1()) {
            int intrinsicWidth = AbstractC11531v0.m62280k2().getIntrinsicWidth();
            int i16 = f57203M5;
            i13 = Math.max(i13, intrinsicWidth + i16);
            i12 += AbstractC11531v0.m62280k2().getIntrinsicHeight() + i16;
        }
        if (m60968H1() && (m62123C3 = AbstractC11531v0.m62123C3()) != null) {
            int intrinsicWidth2 = m62123C3.getIntrinsicWidth();
            int i17 = f57203M5;
            i13 = Math.max(i13, intrinsicWidth2 + i17);
            i12 += m62123C3.getIntrinsicHeight() + i17;
        }
        if (m61118v1()) {
            int intrinsicWidth3 = AbstractC11531v0.m62250e2().getIntrinsicWidth();
            int i18 = f57203M5;
            i13 += intrinsicWidth3 + i18;
            i12 += AbstractC11531v0.m62250e2().getIntrinsicHeight() + i18;
        }
        if (m60965G1() && !mo60962F1()) {
            int intrinsicWidth4 = AbstractC11531v0.m62346x3().getIntrinsicWidth();
            int i19 = f57203M5;
            i13 += intrinsicWidth4 + i19;
            i12 += AbstractC11531v0.m62346x3().getIntrinsicHeight() + i19;
        }
        c28227x3.f131648a = i13;
        c28227x3.f131649b = i12;
        return c28227x3;
    }

    /* renamed from: C0 */
    public void mo60950C0(Canvas canvas) {
        C16625n c16625n = this.f57404Y4;
        if (c16625n != null) {
            c16625n.m88397a(canvas);
        }
    }

    /* renamed from: C1 */
    public boolean mo60951C1() {
        C17985n1 c17985n1 = this.f57415a5;
        if (c17985n1 != null && c17985n1.m95643m()) {
            return true;
        }
        return false;
    }

    /* renamed from: C2 */
    protected abstract C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3);

    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        String str;
        float f11;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        this.f57263B = c17945a0;
        c17945a0.m95292x1();
        this.f57269C = this.f57549x3.mo62079c4(c17945a0.m95029V3());
        this.f57397X2 = c17945a0.m95041W4();
        this.f57402Y2 = c17945a0.m95089b4();
        this.f57407Z2 = c17945a0.m95107d3();
        this.f57413a3 = c28769a.f133312h;
        this.f57423c1 = c28769a.f133320p;
        this.f57262A4 = c28769a.f133311g;
        this.f57261A3 = c28769a.f133316l;
        this.f57267B3 = c28769a.f133317m;
        this.f57291F3 = c28769a.f133318n;
        boolean z19 = false;
        if (getDelegate().mo62101s4() == 1 && c28769a.f133309e) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57508q2 = z12;
        if (z12) {
            str = c17945a0.m94965O2();
        } else {
            str = "";
        }
        this.f57520s2 = str;
        this.f57447g1 = mo60989M(c17945a0, c28769a);
        this.f57459i1 = mo61018S1(c17945a0, c28769a);
        if (this.f57447g1 && getDelegate().mo62102t4() != EnumC18030a.GROUP) {
            this.f57453h1 = AbstractC22055v0.m115116F(c17945a0.m94862C4(), getDelegate().mo62071Y3());
        }
        this.f57343O1 = m60901B1();
        if (m60978J1()) {
            f11 = f57179A5;
        } else {
            f11 = 1.0f;
        }
        this.f57355Q1 = f11;
        this.f57337N1 = m60928r1();
        if (c17945a0.m95030V4() > 0 && c17945a0.m95262t7()) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f57454h2 = z13;
        if (mo61011R()) {
            this.f57495o1 = c28769a.f133305a;
            if (c17945a0.m94847A6() && !c17945a0.m95032V6() && c28769a.f133311g && !TextUtils.isEmpty(this.f57495o1) && !c17945a0.m95298x8()) {
                z17 = true;
            } else {
                z17 = false;
            }
            this.f57501p1 = z17;
            if (z17 && c28769a.f133306b.booleanValue()) {
                z18 = true;
            } else {
                z18 = false;
            }
            this.f57537v1 = z18;
        }
        this.f57394W4 = c17945a0.m95178k6();
        mo61020S3(c17945a0, true);
        if (AbstractC23309i.m122080k3() == 1) {
            m61010Q3(this.f57257A.m143954n());
        }
        this.f57431d3 = m60911Q1();
        setupReaction(c17945a0);
        m61037Z();
        m60963F3();
        if (c17945a0.m94912I2() != null && !TextUtils.isEmpty(c17945a0.m94912I2().f147324r) && getDelegate().mo62101s4() != 3) {
            this.f57533u3 = true;
        }
        C26713e m95071Z3 = c17945a0.m95071Z3();
        this.f57274C4 = m95071Z3;
        if (m95071Z3 != null && mo60946A1() && getDelegate().mo62101s4() != 3) {
            m60960E3(c17945a0, this.f57274C4);
            List list = this.f57280D4;
            if (list != null && list.size() > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f57292F4 = z15;
            List list2 = this.f57286E4;
            if (list2 != null && list2.size() > 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f57298G4 = z16;
        }
        if (C21373a.f104231a.m110802n() && c17945a0.m94898G6()) {
            C28771c c28771c = this.f57257A;
            if (c28771c != null && c28771c.m143958r() != 0 && this.f57257A.m143958r() != 3) {
                z14 = false;
            } else {
                z14 = true;
            }
            this.f57319K1 = z14;
            m60980J3();
        }
        this.f57295G1 = mo61053e0();
        String m94939L4 = c17945a0.m94939L4(false);
        if (m94939L4 != null && !m94939L4.trim().isEmpty()) {
            z19 = true;
        }
        this.f57328L4 = z19;
        C17985n1 c17985n1 = this.f57415a5;
        if (mo60997O()) {
            this.f57415a5 = c17945a0.m94894G2(mo60991M1());
            if (mo60951C1()) {
                mo61035Y0();
                this.f57415a5.m95651u(this);
            } else {
                this.f57415a5.m95651u(null);
            }
        }
        if (c17985n1 != null && c17985n1 != this.f57415a5) {
            c17985n1.m95651u(null);
        }
    }

    /* renamed from: D0 */
    protected void m60954D0(Canvas canvas) {
        C22405g c22405g = this.f57528t4;
        if (c22405g != null) {
            c22405g.m115829d(canvas);
        }
    }

    /* renamed from: D1 */
    public boolean m60955D1(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m95051X3() != null && C32119t6.m155009c().m155014e(c17945a0.m95051X3().f91062e) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D2 */
    protected int m60956D2(boolean z11, int i11) {
        if (this.f57447g1 || this.f57459i1) {
            return f57235j6 + f57230e6 + f57236k6;
        }
        return 0;
    }

    /* renamed from: E */
    public void mo60957E(C22405g c22405g, C17945a0 c17945a0) {
        c22405g.m115822G(C24261h.m126630v().m126650x(c17945a0.m95029V3()));
    }

    /* renamed from: E1 */
    boolean m60958E1() {
        try {
            if (this.f57560z4.getTop() + this.f57528t4.m115839n() > ((View) this.f57560z4.getParent()).getHeight()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: E2 */
    public C28227x3 mo60959E2(int i11, int i12, int i13, C28227x3 c28227x3) {
        int defaultBubblePaddingTop;
        int i14;
        int i15;
        int bubblePaddingLeft = getBubblePaddingLeft();
        int bubblePaddingRight = getBubblePaddingRight();
        int i16 = 0;
        if (this.f57501p1 && mo61001O3()) {
            if (this.f57537v1) {
                i15 = f57191G5 + f57232g6;
            } else {
                i15 = 0;
            }
            StaticLayout m60927j0 = m60927j0(this.f57495o1, ((i11 - bubblePaddingLeft) - bubblePaddingRight) - i15);
            this.f57489n1 = m60927j0;
            this.f57483m1 = (int) m60927j0.getLineWidth(0);
            this.f57477l1 = this.f57489n1.getHeight();
            i14 = Math.max(0, this.f57483m1 + i15 + bubblePaddingLeft + bubblePaddingRight);
            int i17 = f57230e6;
            int i18 = this.f57477l1;
            defaultBubblePaddingTop = ((i17 - i18) / 2) + i18 + AbstractC23136l9.m118742r(8.0f);
        } else {
            defaultBubblePaddingTop = getDefaultBubblePaddingTop();
            i14 = 0;
        }
        if (this.f57526t2) {
            m61070i0(this.f57532u2, (i13 - bubblePaddingLeft) - bubblePaddingRight);
            i14 = Math.max(i14, this.f57278D2 + bubblePaddingLeft + bubblePaddingRight);
            defaultBubblePaddingTop += this.f57272C2;
        }
        if (this.f57319K1 && this.f57331M1 != null) {
            if (this instanceof ChatRowHasCaption) {
                i16 = ((ChatRowHasCaption) this).mo61198j4(getBubbleMaxWidth());
            } else if (this instanceof ChatRowMultiPhotos) {
                i16 = Math.max(((ChatRowMultiPhotos) this).getPhotoWidth(), getBubbleMinWidth());
            }
            if (i16 <= 0) {
                i16 = getBubbleMaxWidth();
            }
            Size m76060w = this.f57331M1.m76060w(getDefaultBubblePaddingTop(), i16);
            i14 = Math.max(i14, m76060w.getWidth());
            defaultBubblePaddingTop += m76060w.getHeight();
        }
        c28227x3.f131648a = i14;
        c28227x3.f131649b = defaultBubblePaddingTop;
        return c28227x3;
    }

    /* renamed from: E3 */
    protected void m60960E3(C17945a0 c17945a0, C26713e c26713e) {
        List m137358c = c26713e.m137358c();
        ActionLogChatLocation.FooterLogData footerLogData = new ActionLogChatLocation.FooterLogData(c17945a0.m95029V3(), c26713e.m137360e());
        if (c26713e.m137362g() && !m137358c.isEmpty()) {
            this.f57280D4 = new ArrayList();
            this.f57286E4 = new ArrayList();
            for (int i11 = 0; i11 < m137358c.size(); i11++) {
                if (((C26712d) m137358c.get(i11)).m137348p() && AbstractC23214t.m119615b(c17945a0, (C26712d) m137358c.get(i11))) {
                    if (((C26712d) m137358c.get(i11)).m137346n() && mo61112t1()) {
                        C13646i c13646i = new C13646i(this, (C26712d) m137358c.get(i11), footerLogData);
                        c13646i.m76261m(this.f57535u5);
                        this.f57280D4.add(c13646i);
                    } else if (((C26712d) m137358c.get(i11)).m137347o()) {
                        C13646i c13646i2 = new C13646i(this, (C26712d) m137358c.get(i11), footerLogData);
                        c13646i2.m76261m(this.f57535u5);
                        this.f57286E4.add(c13646i2);
                    }
                }
                if (i11 == 0 && ((C26712d) m137358c.get(i11)).m137344l() == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: F */
    protected boolean mo60961F() {
        return true;
    }

    /* renamed from: F1 */
    public boolean mo60962F1() {
        return false;
    }

    /* renamed from: F3 */
    protected void m60963F3() {
        int i11;
        C17994q1 m95239r4 = this.f57263B.m95239r4();
        if (!this.f57263B.m95219o8() && m95239r4 != null && !TextUtils.isEmpty(m95239r4.f91140b) && m95239r4.f91139a == 1 && m95239r4.f91142d != null) {
            this.f57333M3 = true;
            this.f57504p4 = true;
            if (this.f57263B.m94987Q7()) {
                i11 = AbstractC8020f0.str_ref_text_received;
            } else {
                i11 = AbstractC8020f0.str_ref_text_sent;
            }
            this.f57339N3 = AbstractC23136l9.m118743r0(i11);
            this.f57345O3 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ref_time), AbstractC23160o0.m119192F0(m95239r4.f91142d.f148150p));
            if (m95239r4.f91142d.m155070J()) {
                this.f57351P3 = "";
                C32123ta c32123ta = m95239r4.f91142d;
                String str = c32123ta.f148115R;
                int i12 = c32123ta.f148116S;
                C24003n m120133j = C23278z2.m120133j(getContext(), AbstractC23006a0.m117930z(), 1.0f);
                C31903ea c31903ea = C31903ea.f146582a;
                c31903ea.m153346k(str, i12, m95239r4.f91142d.f148117T, m120133j, 1, new C31903ea.b() { // from class: com.zing.zalo.ui.chat.chatrow.k

                    /* renamed from: b */
                    public final /* synthetic */ C17945a0 f59290b;

                    /* renamed from: c */
                    public final /* synthetic */ String f59291c;

                    /* renamed from: d */
                    public final /* synthetic */ int f59292d;

                    /* renamed from: e */
                    public final /* synthetic */ boolean f59293e;

                    public /* synthetic */ C11490k(C17945a0 c17945a0, String str2, int i122, boolean z11) {
                        r2 = c17945a0;
                        r3 = str2;
                        r4 = i122;
                        r5 = z11;
                    }

                    @Override // p716zh.C31903ea.b
                    /* renamed from: a */
                    public final void mo46919a(C3979l c3979l) {
                        ChatRow.this.m60923a2(r2, r3, r4, r5, c3979l);
                    }
                });
                return;
            }
            this.f57351P3 = m95239r4.f91142d.f148146l;
        }
    }

    /* renamed from: G0 */
    protected void m60964G0(Canvas canvas) {
        int i11;
        if (mo61002P()) {
            boolean mo61129z1 = mo61129z1();
            int i12 = 255;
            if (mo61129z1) {
                i11 = 255;
            } else {
                i11 = 0;
            }
            if (getSelectionCheckedChangeAnimTime() > 0) {
                long currentTimeMillis = System.currentTimeMillis() - getSelectionCheckedChangeAnimTime();
                if (currentTimeMillis > 200) {
                    mo61131z3();
                } else {
                    float f11 = ((float) currentTimeMillis) / 200.0f;
                    if (!mo61129z1) {
                        f11 = 1.0f - f11;
                    }
                    i11 = (int) (f11 * 255.0f);
                }
                invalidate();
            }
            C28769a c28769a = this.f57269C;
            if (c28769a != null && c28769a.f133304B > 0) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C28769a c28769a2 = this.f57269C;
                long j11 = currentTimeMillis2 - c28769a2.f133304B;
                if (j11 < 200) {
                    float f12 = ((float) j11) / 200.0f;
                    i12 = (int) (255 * f12);
                    i11 = (int) (i11 * f12);
                } else {
                    c28769a2.f133304B = 0L;
                }
                invalidate();
            }
            int selectionCheckBoxLeft = getSelectionCheckBoxLeft();
            int selectionCheckBoxTop = getSelectionCheckBoxTop();
            if (i12 != 0) {
                Drawable m62213W1 = AbstractC11531v0.m62213W1();
                int i13 = f57217T5;
                m62213W1.setBounds(selectionCheckBoxLeft, selectionCheckBoxTop, selectionCheckBoxLeft + i13, i13 + selectionCheckBoxTop);
                m62213W1.setAlpha(i12);
                m62213W1.draw(canvas);
            }
            if (i11 != 0) {
                Drawable m62209V1 = AbstractC11531v0.m62209V1();
                int i14 = f57217T5;
                m62209V1.setBounds(selectionCheckBoxLeft, selectionCheckBoxTop, selectionCheckBoxLeft + i14, i14 + selectionCheckBoxTop);
                m62209V1.setAlpha(i11);
                m62209V1.draw(canvas);
            }
        }
    }

    /* renamed from: G1 */
    public boolean m60965G1() {
        return this.f57259A1;
    }

    /* renamed from: G2 */
    protected int m60966G2() {
        return 0;
    }

    /* renamed from: H0 */
    protected void m60967H0(Canvas canvas, boolean z11) {
        C17945a0 c17945a0;
        C17945a0 c17945a02;
        Drawable m62122C2;
        int m62163K3;
        if (!TextUtils.isEmpty(this.f57385V1)) {
            Drawable drawable = null;
            if (z11) {
                if (m61016S() && (c17945a02 = this.f57263B) != null) {
                    if (c17945a02.m95032V6()) {
                        m62122C2 = AbstractC11531v0.m62117B2(this.f57263B.m95268u4());
                    } else {
                        m62122C2 = AbstractC11531v0.m62122C2(this.f57263B.m95268u4());
                    }
                    drawable = m62122C2;
                    TextPaint textPaint = f57243r6;
                    if (this.f57263B.m95032V6()) {
                        m62163K3 = AbstractC11531v0.m62158J3();
                    } else {
                        m62163K3 = AbstractC11531v0.m62163K3();
                    }
                    textPaint.setColor(m62163K3);
                } else {
                    f57243r6.setColor(AbstractC11531v0.m62246d3());
                }
                canvas.drawText(this.f57385V1, this.f57391W1, this.f57396X1, f57243r6);
            } else {
                canvas.save();
                canvas.translate(this.f57430d2, this.f57436e2);
                RectF rectF = this.f57442f2;
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f57442f2.height() / 2.0f, f57244s6);
                canvas.restore();
                if (m61016S() && (c17945a0 = this.f57263B) != null) {
                    drawable = AbstractC11531v0.m62127D2(c17945a0.m95268u4());
                }
                canvas.drawText(this.f57385V1, this.f57391W1, this.f57396X1, f57245t6);
            }
            if (drawable != null) {
                int i11 = this.f57478l2;
                int i12 = this.f57484m2;
                int i13 = f57221V5;
                drawable.setBounds(i11, i12, i11 + i13, i13 + i12);
                drawable.draw(canvas);
            }
        }
    }

    /* renamed from: H1 */
    public boolean m60968H1() {
        if (getBubbleStyle() == 1 || getDelegate().mo62101s4() == 3 || this.f57549x3.mo62086i0() || this.f57271C1) {
            return false;
        }
        return this.f57295G1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* renamed from: H2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected C28227x3 mo60969H2(int i11, C28227x3 c28227x3) {
        boolean z11;
        int bubbleMinWidth = getBubbleMinWidth();
        int bubbleMaxWidth = getBubbleMaxWidth();
        C28227x3 m60899A2 = m60899A2(bubbleMinWidth, bubbleMaxWidth, getTempDimension());
        int i12 = m60899A2.f131648a;
        this.f57371T = i12;
        this.f57377U = m60899A2.f131649b;
        int max = Math.max(0, i12);
        int i13 = this.f57377U;
        if (mo60961F()) {
            C28227x3 mo61125x2 = mo61125x2(this.f57371T, bubbleMinWidth, bubbleMaxWidth, getTempDimension());
            int i14 = mo61125x2.f131648a;
            this.f57341O = i14;
            this.f57347P = mo61125x2.f131649b;
            max = Math.max(max, i14);
            i13 += this.f57347P;
            if (mo60985L0() && this.f57371T < max) {
                this.f57371T = max;
                z11 = true;
                if (!this.f57522s4) {
                    this.f57359R = m60979J2(this.f57371T, bubbleMinWidth, bubbleMaxWidth);
                    if (!m60982K1()) {
                        i13 += AbstractC26682c.f126381a / 2;
                    }
                    i13 += AbstractC26682c.f126383c;
                } else {
                    this.f57359R = 0;
                }
                if (!mo60971I()) {
                    C28227x3 mo61128y2 = mo61128y2(this.f57371T, bubbleMinWidth, bubbleMaxWidth, getTempDimension());
                    int i15 = mo61128y2.f131648a;
                    this.f57353Q = i15;
                    this.f57365S = mo61128y2.f131649b;
                    max = Math.max(max, i15);
                    i13 += this.f57365S;
                    if (mo60985L0() && this.f57371T < max) {
                        this.f57371T = max;
                        z11 = true;
                    }
                } else {
                    this.f57353Q = 0;
                    this.f57365S = 0;
                }
                if (z11) {
                    int i16 = this.f57371T;
                    C28227x3 m60899A22 = m60899A2(i16, i16, getTempDimension());
                    this.f57371T = m60899A22.f131648a;
                    int i17 = m60899A22.f131649b;
                    i13 += i17 - i17;
                    this.f57377U = i17;
                }
                boolean z12 = !this.f57263B.m95032V6();
                if (!mo60981K()) {
                    int m60956D2 = m60956D2(z12, this.f57377U);
                    this.f57311J = m60956D2;
                    max += m60956D2;
                } else {
                    this.f57311J = 0;
                }
                if (!mo60976J()) {
                    C28227x3 mo60949B2 = mo60949B2(z12, this.f57377U, getTempDimension());
                    int i18 = mo60949B2.f131648a;
                    this.f57317K = i18;
                    this.f57323L = mo60949B2.f131649b;
                    max += i18;
                } else {
                    this.f57317K = 0;
                }
                c28227x3.f131648a = max;
                c28227x3.f131649b = i13;
                return c28227x3;
            }
        } else {
            this.f57341O = 0;
            this.f57347P = 0;
        }
        z11 = false;
        if (!this.f57522s4) {
        }
        if (!mo60971I()) {
        }
        if (z11) {
        }
        boolean z122 = !this.f57263B.m95032V6();
        if (!mo60981K()) {
        }
        if (!mo60976J()) {
        }
        c28227x3.f131648a = max;
        c28227x3.f131649b = i13;
        return c28227x3;
    }

    /* renamed from: H3 */
    public void m60970H3(List list, int i11) {
        if (list != null && list.size() != 0) {
            this.f57405Z0 = i11;
            this.f57439e5.clear();
            this.f57439e5.addAll(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                String mo2478b = contactProfile.mo2478b();
                if (this.f57400Y0.size() > 0 && !this.f57400Y0.contains(mo2478b)) {
                    this.f57445f5 = true;
                } else if (this.f57400Y0.contains(mo2478b)) {
                    Drawable drawable = (Drawable) this.f57378U0.get(contactProfile.mo2478b());
                    if (drawable == null) {
                        drawable = this.f57411a1;
                    }
                    this.f57384V0.put(mo2478b, drawable);
                }
                arrayList.add(mo2478b);
            }
            this.f57400Y0.clear();
            this.f57400Y0.addAll(arrayList);
            for (int i12 = 0; i12 < this.f57400Y0.size(); i12++) {
                if (!this.f57378U0.containsKey(this.f57400Y0.get(i12))) {
                    this.f57378U0.put((String) this.f57400Y0.get(i12), this.f57411a1);
                    this.f57390W0.put((String) this.f57400Y0.get(i12), new C3977j(getContext()));
                }
            }
            m61105q2(list);
            m60929r3();
            return;
        }
        m60926f0();
    }

    /* renamed from: I */
    protected boolean mo60971I() {
        return true;
    }

    /* renamed from: I0 */
    protected void m60972I0(Canvas canvas) {
        if (AbstractC11531v0.m62197S1() != null) {
            Drawable m62197S1 = AbstractC11531v0.m62197S1();
            int i11 = this.f57542w1;
            int i12 = this.f57547x1;
            int i13 = f57232g6;
            m62197S1.setBounds(i11, i12, i11 + i13, i13 + i12);
            AbstractC11531v0.m62197S1().draw(canvas);
        }
    }

    /* renamed from: I1 */
    public boolean m60973I1() {
        return getDelegate().mo62075b();
    }

    /* renamed from: I2 */
    public int mo60974I2() {
        int i11;
        if (this.f57261A3) {
            if (this.f57279D3 == null) {
                this.f57279D3 = new C29384b(getContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_marker_unread));
            }
            i11 = this.f57279D3.m146531h();
            int mo62032A4 = this.f57549x3.mo62032A4();
            this.f57273C3 = mo62032A4;
            this.f57279D3.m146533j(mo62032A4);
        } else {
            i11 = 0;
        }
        if (this.f57267B3) {
            if (this.f57285E3 == null) {
                this.f57285E3 = new C29384b(getContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_marker_where_left));
            }
            i11 += this.f57285E3.m146531h();
            int mo62032A42 = this.f57549x3.mo62032A4();
            this.f57273C3 = mo62032A42;
            this.f57285E3.m146533j(mo62032A42);
        }
        if (this.f57508q2) {
            C29385c c29385c = this.f57514r2;
            if (c29385c == null) {
                this.f57514r2 = new C29385c(this.f57520s2);
            } else {
                c29385c.m146547i(this.f57520s2);
            }
            this.f57514r2.m146546h(i11);
            i11 += this.f57514r2.m146543e();
        }
        if (this.f57291F3) {
            if (this.f57297G3 == null) {
                this.f57297G3 = new C29383a(this);
            }
            return i11 + this.f57297G3.m146523b();
        }
        return i11;
    }

    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        if (this.f57406Z1 && !TextUtils.isEmpty(this.f57385V1) && this.f57401Y1 == 0) {
            this.f57401Y1 = AbstractC23136l9.m118764y0(f57245t6, this.f57385V1);
        }
        if (this.f57328L4) {
            m60924b0(c17945a0);
            return;
        }
        C21197a c21197a = this.f57376T4;
        if (c21197a != null) {
            c21197a.m109768k();
        }
    }

    /* renamed from: J */
    protected boolean mo60976J() {
        if (getBubbleStyle() != 1 && getDelegate().mo62101s4() != 3 && !this.f57549x3.mo62086i0()) {
            return true;
        }
        return false;
    }

    /* renamed from: J0 */
    protected void m60977J0(Canvas canvas, boolean z11) {
        if (this.f57489n1 == null) {
            return;
        }
        if (z11) {
            canvas.save();
            canvas.translate(this.f57513r1, this.f57519s1);
            this.f57489n1.draw(canvas);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(this.f57513r1, this.f57519s1);
        RectF rectF = this.f57525t1;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f57525t1.height() / 2.0f, f57253y5);
        canvas.translate(f57231f6, this.f57531u1);
        this.f57489n1.draw(canvas);
        canvas.restore();
    }

    /* renamed from: J1 */
    boolean m60978J1() {
        return this.f57425c3 && this.f57343O1 && !this.f57419b3;
    }

    /* renamed from: J2 */
    protected int m60979J2(int i11, int i12, int i13) {
        C22405g c22405g = this.f57528t4;
        if (c22405g != null) {
            return c22405g.m115831f();
        }
        return 0;
    }

    /* renamed from: J3 */
    protected void m60980J3() {
        C13574c3 c13574c3 = new C13574c3(getContext(), new C11328c());
        this.f57331M1 = c13574c3;
        c13574c3.m76042A(this.f57263B);
    }

    /* renamed from: K */
    protected boolean mo60981K() {
        if (getBubbleStyle() != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: K1 */
    public boolean m60982K1() {
        return this.f57424c2;
    }

    /* renamed from: K3 */
    public boolean mo60983K3() {
        return this.f57534u4 || this.f57360R0 || this.f57354Q0 || this.f57330M0 || this.f57336N0 || this.f57342O0;
    }

    /* renamed from: L */
    public int mo60984L(int i11, C13646i c13646i) {
        if (!mo61112t1()) {
            return i11 + getBubblePaddingLeft();
        }
        return i11;
    }

    /* renamed from: L0 */
    protected boolean mo60985L0() {
        return true;
    }

    /* renamed from: L1 */
    public boolean m60986L1() {
        return this.f57418b2;
    }

    /* renamed from: L2 */
    public boolean mo60987L2() {
        return true;
    }

    /* renamed from: L3 */
    public boolean m60988L3() {
        return getDelegate().mo62069W3();
    }

    /* renamed from: M */
    public boolean mo60989M(C17945a0 c17945a0, C28769a c28769a) {
        if (getBubbleStyle() != 0) {
            return false;
        }
        if (getDelegate().mo62101s4() == 2) {
            if (c17945a0.m95032V6()) {
                return false;
            }
            return true;
        }
        return c28769a.f133321q;
    }

    /* renamed from: M0 */
    Paint m60990M0(boolean z11) {
        if (this.f57529t5 == null) {
            this.f57529t5 = new DashPathEffect(new float[]{AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f)}, f57179A5);
        }
        if (z11) {
            if (this.f57505p5 == null) {
                this.f57505p5 = m61029W0(z11);
            }
            return this.f57505p5;
        }
        if (this.f57511q5 == null) {
            this.f57511q5 = m61029W0(z11);
        }
        return this.f57511q5;
    }

    /* renamed from: M1 */
    public boolean mo60991M1() {
        return false;
    }

    /* renamed from: M3 */
    boolean m60992M3() {
        if (!TextUtils.isEmpty(this.f57423c1) && (this.f57447g1 || this.f57471k1)) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public boolean mo60993N() {
        if (!this.f57259A1 && !this.f57419b3 && !m61118v1() && !this.f57382U4) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    protected String m60994N0(int i11, int i12, int i13, int i14) {
        return "[" + i11 + "," + i12 + "][" + i13 + "," + i14 + "]";
    }

    /* renamed from: N2 */
    protected void mo60995N2() {
        getDelegate().mo62098q4(this);
    }

    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return false;
    }

    /* renamed from: O */
    public boolean mo60997O() {
        return false;
    }

    /* renamed from: O0 */
    public int mo60998O0(boolean z11, boolean z12, boolean z13, boolean z14) {
        int i11;
        int i12 = 4;
        int i13 = 0;
        if (getBubbleStyle() == 1) {
            if (z12) {
                return 4;
            }
            return 0;
        }
        if (z13) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        if (!z12) {
            i12 = 0;
        }
        int i14 = (!z11 ? 1 : 0) | i11 | i12;
        if (z14) {
            i13 = 16;
        }
        return i14 | i13;
    }

    /* renamed from: O1 */
    public boolean m60999O1() {
        if (mo60951C1() && this.f57415a5.m95642l() && !this.f57415a5.m95644n()) {
            return false;
        }
        return true;
    }

    /* renamed from: O2 */
    protected void m61000O2() {
        if (!(this instanceof ChatRowMultiPhotos)) {
            this.f57549x3.mo62053L4(this);
        }
    }

    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return true;
    }

    /* renamed from: P */
    public boolean mo61002P() {
        C17945a0 c17945a0;
        if (getDelegate().mo62086i0() && (c17945a0 = this.f57263B) != null && c17945a0.m94990R0() && m61004P1(this.f57263B)) {
            return true;
        }
        return false;
    }

    /* renamed from: P0 */
    public String m61003P0(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m95051X3() != null) {
            return c17945a0.m95051X3().f91063f;
        }
        return "";
    }

    /* renamed from: P1 */
    public boolean m61004P1(C17945a0 c17945a0) {
        if (getDelegate().mo62045J0() && (c17945a0 == null || !c17945a0.m95000S0())) {
            return false;
        }
        return true;
    }

    /* renamed from: P2 */
    public void mo61005P2() {
    }

    /* renamed from: P3 */
    protected boolean m61006P3() {
        if (m61016S() && (m60928r1() || getDelegate().mo62101s4() == 3 || getDelegate().mo62101s4() == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public boolean mo61007Q(boolean z11, boolean z12) {
        if (getDelegate().mo62101s4() == 2) {
            return true;
        }
        if (getDelegate().mo62101s4() == 3) {
            return false;
        }
        if (z11 || z12 || this.f57337N1) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    public int m61008Q0(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m95051X3() != null) {
            return c17945a0.m95051X3().f91062e;
        }
        return -1;
    }

    /* renamed from: Q2 */
    public void mo61009Q2() {
        C28769a c28769a;
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && (c28769a = this.f57269C) != null) {
            mo61036Y2(c17945a0, c28769a);
        }
    }

    /* renamed from: Q3 */
    protected void m61010Q3(C17945a0 c17945a0) {
        ArrayList m94861C3;
        String str;
        String m40383Q;
        try {
            if (AbstractC23309i.m121490Ud()) {
                if (!c17945a0.m95219o8()) {
                    if (!c17945a0.m95091b6()) {
                        if (c17945a0.m95032V6()) {
                            if (getDelegate().mo62101s4() == 1) {
                                if (c17945a0.m95089b4() == 4) {
                                    if (!this.f57419b3) {
                                        if (!this.f57425c3) {
                                            if (this.f57337N1) {
                                            }
                                        }
                                        if (getDelegate().mo62106x4()) {
                                            if (!c17945a0.m94847A6()) {
                                                m94861C3 = new ArrayList();
                                                m94861C3.add(Long.valueOf(Long.parseLong(c17945a0.mo95039W2())));
                                            } else {
                                                m94861C3 = c17945a0.m94861C3();
                                            }
                                            if (m94861C3 != null) {
                                                this.f57487m5 = m94861C3.size();
                                                if (m94861C3.size() > 0) {
                                                    ArrayList arrayList = new ArrayList();
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (int i11 = 0; i11 < m94861C3.size(); i11++) {
                                                        String str2 = m94861C3.get(i11) + "";
                                                        if (TextUtils.equals(str2, CoreUtility.f89233i)) {
                                                            ContactProfile contactProfile = AbstractC23304d.f113368c0;
                                                            str = contactProfile.f42446v;
                                                            m40383Q = contactProfile.f42437s;
                                                        } else {
                                                            ContactProfile m141811g = C28203u6.f131407a.m141811g(str2);
                                                            if (m141811g == null) {
                                                                arrayList2.add(str2);
                                                                m40383Q = "";
                                                                str = m40383Q;
                                                            } else {
                                                                str = m141811g.f42446v;
                                                                m40383Q = m141811g.m40383Q(true, false);
                                                                if (c17945a0.m94847A6()) {
                                                                    m40383Q = AbstractC23184q2.m119453k(str2, m40383Q, c17945a0.mo95039W2());
                                                                }
                                                            }
                                                        }
                                                        arrayList.add(new InviteContactProfile(str2, str, m40383Q));
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        new C11336k(this, arrayList2, 1051, this.f57263B).m141750b();
                                                    }
                                                    m60970H3(arrayList, arrayList.size());
                                                    this.f57493n5 = true;
                                                    return;
                                                }
                                                return;
                                            }
                                            this.f57487m5 = 0;
                                            m60970H3(null, 0);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            m60970H3(null, 0);
            this.f57487m5 = 0;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: R */
    protected boolean mo61011R() {
        return true;
    }

    /* renamed from: R0 */
    protected int mo61012R0(int i11, int i12, int i13, int i14, boolean z11) {
        return 0;
    }

    /* renamed from: R1 */
    public boolean m61013R1() {
        return this.f57319K1;
    }

    /* renamed from: R2 */
    public boolean m61014R2(Canvas canvas) {
        this.f57427c5 = true;
        this.f57433d5 = false;
        if (this.f57299H > 0) {
            float top = getTop() + getTranslationY();
            canvas.translate(f57179A5, top);
            mo61126y0(canvas);
            canvas.translate(f57179A5, -top);
        }
        if (this.f57305I > 0) {
            float top2 = getTop() + getTranslationY();
            canvas.translate(f57179A5, top2);
            m61120w0(canvas);
            canvas.translate(f57179A5, -top2);
        }
        if (this.f57522s4) {
            float left = getLeft() + getTranslationX();
            float top3 = getTop() + getTranslationY();
            canvas.translate(left, top3);
            m60954D0(canvas);
            canvas.translate(-left, -top3);
        }
        m60964G0(canvas);
        this.f57427c5 = false;
        return this.f57433d5;
    }

    /* renamed from: R3 */
    public final void m61015R3(C17945a0 c17945a0, C28769a c28769a) {
        mo61122w3();
        mo60953C3(c17945a0, c28769a, !c17945a0.equals(this.f57263B));
        m61041a3(c17945a0, c28769a);
        m60905D3();
        requestLayout();
    }

    /* renamed from: S */
    protected boolean m61016S() {
        return this.f57454h2;
    }

    /* renamed from: S0 */
    public int mo61017S0(int i11, int i12, int i13, boolean z11) {
        int i14;
        if (this.f57311J == 0) {
            i14 = getBubbleSpacingDefault();
        } else {
            i14 = 0;
        }
        if (z11) {
            return i11 + i14;
        }
        return (i12 - i13) - i14;
    }

    /* renamed from: S1 */
    public boolean mo61018S1(C17945a0 c17945a0, C28769a c28769a) {
        if (getBubbleStyle() == 0 && !c17945a0.m95032V6()) {
            return true;
        }
        return false;
    }

    /* renamed from: S2 */
    protected void m61019S2() {
        getDelegate().mo62036D4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x0014, B:13:0x001c, B:15:0x0022, B:19:0x002f, B:21:0x0038, B:25:0x0041, B:27:0x0047, B:30:0x004f, B:32:0x01ae, B:34:0x01b4, B:35:0x01b8, B:37:0x01be, B:41:0x01ca, B:43:0x01d2, B:44:0x01e2, B:47:0x0064, B:48:0x0078, B:53:0x0084, B:55:0x008a, B:57:0x0092, B:59:0x00a6, B:60:0x00ba, B:61:0x00cd, B:62:0x00e0, B:68:0x00ee, B:69:0x00fb, B:71:0x0101, B:73:0x0109, B:74:0x011c, B:75:0x0131, B:76:0x0144, B:77:0x0157, B:79:0x0161, B:80:0x0174, B:81:0x0188, B:84:0x01a9), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ae A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x0014, B:13:0x001c, B:15:0x0022, B:19:0x002f, B:21:0x0038, B:25:0x0041, B:27:0x0047, B:30:0x004f, B:32:0x01ae, B:34:0x01b4, B:35:0x01b8, B:37:0x01be, B:41:0x01ca, B:43:0x01d2, B:44:0x01e2, B:47:0x0064, B:48:0x0078, B:53:0x0084, B:55:0x008a, B:57:0x0092, B:59:0x00a6, B:60:0x00ba, B:61:0x00cd, B:62:0x00e0, B:68:0x00ee, B:69:0x00fb, B:71:0x0101, B:73:0x0109, B:74:0x011c, B:75:0x0131, B:76:0x0144, B:77:0x0157, B:79:0x0161, B:80:0x0174, B:81:0x0188, B:84:0x01a9), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x0014, B:13:0x001c, B:15:0x0022, B:19:0x002f, B:21:0x0038, B:25:0x0041, B:27:0x0047, B:30:0x004f, B:32:0x01ae, B:34:0x01b4, B:35:0x01b8, B:37:0x01be, B:41:0x01ca, B:43:0x01d2, B:44:0x01e2, B:47:0x0064, B:48:0x0078, B:53:0x0084, B:55:0x008a, B:57:0x0092, B:59:0x00a6, B:60:0x00ba, B:61:0x00cd, B:62:0x00e0, B:68:0x00ee, B:69:0x00fb, B:71:0x0101, B:73:0x0109, B:74:0x011c, B:75:0x0131, B:76:0x0144, B:77:0x0157, B:79:0x0161, B:80:0x0174, B:81:0x0188, B:84:0x01a9), top: B:1:0x0000 }] */
    /* renamed from: S3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo61020S3(C17945a0 c17945a0, boolean z11) {
        boolean z12;
        boolean z13;
        try {
            if (c17945a0.m95032V6() && !c17945a0.m95219o8() && !c17945a0.m95091b6()) {
                boolean z14 = false;
                if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95316z8()) {
                    z12 = false;
                    if (!c17945a0.m95180k8()) {
                        int m95107d3 = c17945a0.m95107d3();
                        if (z12 && m95107d3 != 5 && !c17945a0.m95022U7() && !c17945a0.m94959N6()) {
                            if (m95107d3 == 3) {
                                this.f57419b3 = true;
                                setRetryVisible(true);
                                this.f57461i3 = AbstractC23136l9.m118743r0(AbstractC8020f0.sync_failed_message_state);
                                this.f57491n3 = AbstractC11531v0.m62255f2();
                            } else {
                                this.f57461i3 = getContext().getString(AbstractC8020f0.syncing_message_state);
                                this.f57491n3 = AbstractC11531v0.m62128D3();
                            }
                        } else {
                            int m95089b4 = c17945a0.m95089b4();
                            if (m95089b4 != 2) {
                                if (m95089b4 != 3) {
                                    if (m95089b4 == 4) {
                                        if (AbstractC23309i.m121490Ud() && this.f57549x3.mo62106x4()) {
                                            this.f57461i3 = getContext().getString(AbstractC8020f0.seen_message_state);
                                            this.f57491n3 = AbstractC11531v0.m62316r3();
                                        } else {
                                            this.f57461i3 = getContext().getString(AbstractC8020f0.receive_message_state);
                                            this.f57491n3 = AbstractC11531v0.m62321s3();
                                        }
                                    }
                                } else {
                                    this.f57461i3 = getContext().getString(AbstractC8020f0.receive_message_state);
                                    this.f57491n3 = AbstractC11531v0.m62321s3();
                                }
                            } else {
                                this.f57461i3 = getContext().getString(AbstractC8020f0.deliveried_message_state);
                                this.f57491n3 = AbstractC11531v0.m62133E3();
                            }
                            z14 = true;
                        }
                        if (z12) {
                            if (c17945a0.m94959N6()) {
                                setRetryVisible(true);
                            } else if (!c17945a0.m95022U7() && !this.f57268B4.m143920m() && z11 && z14 && !this.f57268B4.m143918k()) {
                                this.f57419b3 = true;
                                this.f57491n3 = AbstractC11531v0.m62255f2();
                                this.f57461i3 = AbstractC23136l9.m118743r0(AbstractC8020f0.retry_message_state);
                            }
                        }
                        this.f57425c3 = mo61007Q(this.f57419b3, this.f57413a3);
                        return;
                    }
                    int m95089b42 = c17945a0.m95089b4();
                    if (m95089b42 != 0) {
                        if (m95089b42 != 1) {
                            if (m95089b42 != 2) {
                                if (m95089b42 != 3) {
                                    if (m95089b42 != 4) {
                                        this.f57491n3 = null;
                                        this.f57461i3 = AbstractC23136l9.m118743r0(AbstractC8020f0.retry_message_state);
                                    } else if (AbstractC23309i.m121490Ud() && this.f57549x3.mo62106x4()) {
                                        this.f57461i3 = getContext().getString(AbstractC8020f0.seen_message_state);
                                        this.f57491n3 = AbstractC11531v0.m62316r3();
                                    } else {
                                        this.f57461i3 = getContext().getString(AbstractC8020f0.receive_message_state);
                                        this.f57491n3 = AbstractC11531v0.m62321s3();
                                    }
                                } else {
                                    this.f57461i3 = getContext().getString(AbstractC8020f0.receive_message_state);
                                    this.f57491n3 = AbstractC11531v0.m62321s3();
                                }
                            } else {
                                this.f57461i3 = getContext().getString(AbstractC8020f0.deliveried_message_state);
                                this.f57491n3 = AbstractC11531v0.m62133E3();
                            }
                            z14 = true;
                        } else if (C0814e0.m2059e(c17945a0.m95029V3())) {
                            this.f57461i3 = getContext().getString(AbstractC8020f0.sending_message_state);
                            this.f57491n3 = AbstractC11531v0.m62128D3();
                        } else {
                            this.f57419b3 = true;
                            setRetryVisible(true);
                            this.f57461i3 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message_state);
                            this.f57491n3 = AbstractC11531v0.m62255f2();
                        }
                    } else {
                        this.f57461i3 = getContext().getString(AbstractC8020f0.error_message_state);
                        this.f57491n3 = AbstractC11531v0.m62255f2();
                        this.f57419b3 = true;
                        if (getDelegate().mo62101s4() == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        setRetryVisible(z13);
                    }
                    if (z12) {
                    }
                    this.f57425c3 = mo61007Q(this.f57419b3, this.f57413a3);
                    return;
                }
                z12 = true;
                if (!c17945a0.m95180k8()) {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: T */
    public boolean mo61021T(C28769a c28769a) {
        if (!c28769a.f133310f && !this.f57419b3 && getDelegate().mo62101s4() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: T0 */
    protected int mo61022T0(int i11, int i12, int i13) {
        return ((i11 + i12) - i13) / 2;
    }

    /* renamed from: T2 */
    public void m61023T2() {
    }

    /* renamed from: U */
    public boolean m61024U() {
        return this.f57388V4;
    }

    /* renamed from: U2 */
    void m61025U2() {
        try {
            AbstractC23118k2.m118601n(getContext(), this.f57263B.m94912I2().f147323q);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    protected void m61026V(Canvas canvas) {
        if (!mo60951C1()) {
            return;
        }
        C17985n1 c17985n1 = this.f57415a5;
        if (c17985n1 != null) {
            c17985n1.m95634a();
        }
        if (this.f57404Y4 != null && mo60951C1()) {
            C24865v m95636c = this.f57415a5.m95636c();
            this.f57404Y4.m88401e(((Integer) m95636c.m129232d()).intValue());
            this.f57404Y4.m88399c(((Integer) m95636c.m129233e()).intValue());
            mo60950C0(canvas);
            if (((Boolean) m95636c.m129234f()).booleanValue()) {
                invalidate();
            }
        }
    }

    /* renamed from: V2 */
    void m61027V2() {
        try {
            C24548c c24548c = new C24548c();
            c24548c.m127905f(this.f57263B.m95029V3().m41045i());
            c24548c.m127907h(Integer.parseInt(this.f57263B.m94862C4()));
            c24548c.m127906g((byte) 2);
            int m40666e = TrackingSource.m40666e();
            String m40669h = TrackingSource.m40669h(m40666e);
            int i11 = this.f57263B.m94912I2().f147326t;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        String m118595h = AbstractC23118k2.m118595h(this.f57263B.m94912I2().f147325s);
                        if (!TextUtils.isEmpty(m118595h)) {
                            AbstractC23118k2.m118590c(getContext(), m118595h, this.f57263B.m94912I2().f147323q, c24548c, AbstractC23118k2.m118594g(this.f57263B.m94912I2().f147325s), 81, this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4(), m40666e, m40669h);
                        } else if (this.f57263B.m94912I2().f147323q > 0) {
                            AbstractC23118k2.m118600m(getContext(), this.f57263B.m94912I2().f147323q, m40666e, m40669h);
                            C28905e.m144373n().m144396r(2, 81, this.f57263B.m94912I2().f147323q + "", this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4());
                        }
                    }
                } else {
                    AbstractC23118k2.m118602o(getContext(), this.f57263B.m94912I2().f147325s, m40666e, m40669h);
                    C28905e.m144373n().m144396r(0, 81, this.f57263B.m94912I2().f147323q + "", this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4());
                }
            } else {
                AbstractC23118k2.m118600m(getContext(), this.f57263B.m94912I2().f147323q, m40666e, m40669h);
                C28905e.m144373n().m144396r(2, 81, this.f57263B.m94912I2().f147323q + "", this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public boolean mo61028W(C28771c c28771c, C17945a0 c17945a0) {
        boolean z11;
        if (!C24265l.m126676s().m126680B() || c28771c == null) {
            return false;
        }
        if (c28771c.m143962v()) {
            if (c28771c.m143952l() != 1 || !C24265l.m126676s().m126681C() || getDelegate().mo62101s4() != 1) {
                return false;
            }
            if ((getDelegate().mo62102t4() != EnumC18030a.GROUP && getDelegate().mo62102t4() != EnumC18030a.SINGLE_USER) || c28771c.m143956p() == null || c28771c.m143956p().size() <= 0) {
                return false;
            }
            if ((c28771c.m143958r() != 3 && c28771c.m143958r() != 2) || c28771c.m143949i() <= 0) {
                return false;
            }
        } else {
            if (getDelegate().mo62101s4() == 1 && c17945a0.m95144g8()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (c17945a0.m95208n8() || c17945a0.m95316z8())) {
                C24751d m126650x = C24261h.m126630v().m126650x(c17945a0.m95029V3());
                if (!this.f57549x3.mo62079c4(c17945a0.m95029V3()).f133325u && (m126650x == null || !m126650x.m128575s())) {
                    return false;
                }
            } else {
                return z11;
            }
        }
        return true;
    }

    /* renamed from: W0 */
    Paint m61029W0(boolean z11) {
        int[] m115162v;
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f57517r5);
        paint.setAlpha(255);
        paint.setStrokeWidth(f57220U6);
        if (z11) {
            m115162v = AbstractC22055v0.m115163w(getContext());
        } else {
            m115162v = AbstractC22055v0.m115162v(getContext());
        }
        paint.setShader(new LinearGradient(f57179A5, f57179A5, f57179A5, f57230e6 + (r2 * 2) + 1, m115162v[0], m115162v[1], Shader.TileMode.MIRROR));
        return paint;
    }

    /* renamed from: W2 */
    protected void m61030W2() {
        getDelegate().mo62094n4(this);
        int m95041W4 = this.f57263B.m95041W4();
        if (m95041W4 != 10) {
            if (m95041W4 != 19) {
                if (m95041W4 == 23) {
                    AbstractC23647d.m123897g("900111");
                    return;
                }
                return;
            }
            AbstractC23647d.m123897g("900121");
            return;
        }
        AbstractC23647d.m123897g("900131");
    }

    /* renamed from: X */
    public void mo61031X(C17945a0 c17945a0) {
        int mo61076k0 = mo61076k0(c17945a0);
        if (mo61076k0 != 0) {
            this.f57268B4.m143924q(c17945a0, mo61076k0, this);
        }
    }

    /* renamed from: X0 */
    void m61032X0() {
        Context context = getContext();
        C13704p1 c13704p1 = new C13704p1(1);
        f57251x5 = c13704p1;
        Typeface typeface = Typeface.DEFAULT;
        c13704p1.setTypeface(typeface);
        f57251x5.setTextSize(AbstractC23136l9.m118742r(15.0f));
        f57251x5.linkColor = AbstractC11531v0.m62222Y2();
        f57251x5.setColor(AbstractC11531v0.m62226Z2());
        C13704p1 c13704p12 = new C13704p1(1);
        f57243r6 = c13704p12;
        c13704p12.setTypeface(typeface);
        TextPaint textPaint = f57243r6;
        int i11 = f57242q6;
        textPaint.setTextSize(i11);
        f57243r6.setColor(AbstractC11531v0.m62246d3());
        f57241p6 = AbstractC23136l9.m118761x0(f57243r6, "0");
        Paint paint = new Paint(1);
        f57253y5 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        if (AbstractC23309i.m120887E2() == 1) {
            f57253y5.setColor(C23212s8.m119607o(context, AbstractC16781w.ReceiverBubbleChatNormal));
            f57253y5.setAlpha(178);
        } else {
            f57253y5.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatStateBackgroundColor1));
        }
        Paint paint2 = new Paint(1);
        f57255z5 = paint2;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        f57255z5.setStrokeWidth(1.0f);
        f57255z5.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatSeparator));
        Paint paint3 = new Paint(1);
        f57190F6 = paint3;
        paint3.setStyle(style);
        f57190F6.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatStateBackgroundColor2));
        f57228c6 = f57190F6.getAlpha();
        Paint paint4 = new Paint(1);
        f57188E6 = paint4;
        paint4.setStyle(style);
        f57188E6.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatStateBackgroundColor1));
        f57227b6 = f57188E6.getAlpha();
        C13704p1 c13704p13 = new C13704p1(1);
        f57184C6 = c13704p13;
        c13704p13.setTypeface(typeface);
        f57184C6.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatStateTextColor));
        f57184C6.setTextSize(AbstractC23136l9.m118759w1(11));
        f57226a6 = f57184C6.getAlpha();
        Paint.FontMetricsInt fontMetricsInt = f57184C6.getFontMetricsInt();
        f57186D6 = fontMetricsInt;
        f57192G6 = fontMetricsInt.descent - fontMetricsInt.ascent;
        Paint paint5 = new Paint(1);
        f57244s6 = paint5;
        paint5.setStyle(style);
        f57244s6.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatStateBackgroundColor1));
        C13704p1 c13704p14 = new C13704p1(1);
        f57245t6 = c13704p14;
        c13704p14.setTypeface(typeface);
        f57245t6.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatStateTextColor));
        f57245t6.setTextSize(i11);
        f57246u6 = f57245t6.getFontMetricsInt();
        Paint paint6 = new Paint(1);
        f57229d6 = paint6;
        paint6.setColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        f57229d6.setStyle(style2);
        f57229d6.setStrokeWidth(1.0f);
        C13704p1 c13704p15 = new C13704p1(1);
        f57256z6 = c13704p15;
        c13704p15.m76613c();
        C13704p1 c13704p16 = new C13704p1(1);
        f57180A6 = c13704p16;
        c13704p16.setTypeface(typeface);
        Paint paint7 = new Paint(1);
        f57182B6 = paint7;
        paint7.setColor(AbstractC11531v0.m62326t3());
        f57256z6.setTextSize(AbstractC23136l9.m118759w1(14));
        f57256z6.setColor(AbstractC11531v0.m62226Z2());
        f57180A6.setTextSize(AbstractC23136l9.m118759w1(13));
        f57180A6.setColor(AbstractC11531v0.m62143G3());
        C13704p1 c13704p17 = new C13704p1(1);
        f57194H6 = c13704p17;
        c13704p17.setTypeface(typeface);
        f57194H6.setColor(AbstractC11531v0.m62143G3());
        f57194H6.setTextSize(AbstractC23136l9.m118759w1(14));
        Paint paint8 = new Paint(1);
        f57218T6 = paint8;
        paint8.setColor(C23212s8.m119606n(AbstractC16781w.BubbleChatBackgroundSearchHighlight));
        Paint paint9 = new Paint(1);
        f57216S6 = paint9;
        paint9.setColor(C23212s8.m119606n(AbstractC2807a.button_tertiary_neutral_background_pressed));
    }

    /* renamed from: X2 */
    public void mo61033X2(float f11, float f12) {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && this.f57257A != null && this.f57269C != null && c17945a0.m94990R0() && m61004P1(this.f57263B)) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z11 = !this.f57269C.f133329y;
                if (z11 && !this.f57549x3.mo62045J0() && this.f57549x3.mo62078c3() <= 0) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_select_max_messages_prompt, Integer.valueOf(AbstractC23309i.m120819C8())));
                    return;
                }
                if (z11 && this.f57549x3.mo62045J0() && this.f57549x3.mo62035D1() <= 0) {
                    this.f57549x3.mo62060Q1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_attachment_msg_reach_limit, Integer.valueOf(C24585b.m128025m().m128037o())));
                    return;
                }
                if (z11) {
                    this.f57549x3.mo62099r3(this.f57263B);
                } else {
                    this.f57549x3.mo62050K3(this.f57263B);
                }
                C28769a c28769a = this.f57269C;
                c28769a.f133329y = z11;
                c28769a.f133330z = currentTimeMillis;
                if (getParent() instanceof View) {
                    ((View) getParent()).invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: Y */
    public boolean mo61034Y(boolean z11, int i11) {
        if (i11 != 1 || this.f57263B.m95296x6()) {
            return true;
        }
        if (z11 && this.f57263B.m95315z7()) {
            return true;
        }
        if (!z11 && this.f57263B.m95305y7()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y0 */
    public void mo61035Y0() {
        if (this.f57404Y4 == null) {
            this.f57404Y4 = new C16625n(getContext(), new C17024o0.a() { // from class: com.zing.zalo.ui.chat.chatrow.m
                public /* synthetic */ C11498m() {
                }

                @Override // com.zing.zalo.zdesign.component.C17024o0.a
                /* renamed from: a */
                public final void mo61929a() {
                    ChatRow.this.m60918W1();
                }
            });
        }
    }

    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        C13574c3 c13574c3;
        C17945a0 c17945a02;
        C22405g c22405g;
        if (!this.f57281E) {
            if (getDelegate().mo62096o4()) {
                this.f57263B.m95035Va(false);
            } else {
                this.f57263B.m95024Ua(false);
            }
        }
        if (!this.f57357Q3) {
            m61108r2();
        }
        if (!this.f57429d1) {
            mo61100p2();
            m61105q2(this.f57439e5);
        }
        if (this.f57526t2 && this.f57320K2) {
            m60931s2(this.f57532u2);
        }
        if (this.f57522s4 && (c22405g = this.f57528t4) != null) {
            c22405g.m115816A();
        }
        if (this.f57549x3.mo62089j3() && (c17945a02 = this.f57263B) != null) {
            c17945a02.m94884F1();
            this.f57263B.m95310z1();
        }
        if (this.f57319K1 && (c13574c3 = this.f57331M1) != null) {
            c13574c3.m76043a(m60988L3(), this.f57275D);
        }
    }

    /* renamed from: Z */
    protected void m61037Z() {
        boolean z11;
        C17997r1 m95275v4 = this.f57263B.m95275v4();
        this.f57532u2 = m95275v4;
        boolean z12 = false;
        if (m95275v4 != null && this.f57263B.m95251s7()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57526t2 = z11;
        if (z11) {
            this.f57326L2 = this.f57532u2.m95689f();
            int m95687d = this.f57532u2.m95687d();
            this.f57538v2 = m95687d;
            if (m95687d != -1 && m95687d != 1 && m95687d != 41) {
                if (m95687d != 49) {
                    if (m95687d != 52 && m95687d != 56 && m95687d != 59) {
                        if (m95687d != 31 && m95687d != 32 && m95687d != 36 && m95687d != 37) {
                            switch (m95687d) {
                                case 43:
                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                case 46:
                                    break;
                                case 45:
                                    break;
                                default:
                                    if (this.f57532u2.m95690g() != null && !TextUtils.isEmpty(this.f57532u2.m95690g().f91013r)) {
                                        z12 = true;
                                    }
                                    this.f57320K2 = z12;
                                    return;
                            }
                        }
                    }
                }
                this.f57320K2 = true;
                return;
            }
            this.f57320K2 = false;
        }
    }

    /* renamed from: Z0 */
    protected boolean m61038Z0(float f11, float f12) {
        if (f11 >= this.f57435e1) {
            int i11 = f57230e6;
            if (f11 <= r0 + i11) {
                if (f12 >= this.f57441f1 && f12 <= r3 + i11) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Z2 */
    protected void m61039Z2(Canvas canvas) {
        m61026V(canvas);
    }

    /* renamed from: a1 */
    protected boolean m61040a1(float f11, float f12) {
        return f11 >= ((float) this.f57530u0) && f11 <= ((float) this.f57536v0) && f12 >= ((float) this.f57524t0) && f12 <= ((float) this.f57541w0);
    }

    /* renamed from: a3 */
    protected void m61041a3(C17945a0 c17945a0, C28769a c28769a) {
        boolean z11;
        boolean mo61021T = mo61021T(c28769a);
        this.f57406Z1 = mo61021T;
        if (mo61021T) {
            String currentTimeText = getCurrentTimeText();
            this.f57385V1 = currentTimeText;
            boolean z12 = true;
            boolean z13 = !TextUtils.isEmpty(currentTimeText);
            this.f57412a2 = z13;
            if (z13 && mo60996N3() && !this.f57533u3 && !this.f57292F4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f57418b2 = z11;
            if (!this.f57412a2 || z11) {
                z12 = false;
            }
            this.f57424c2 = z12;
        }
    }

    /* renamed from: b1 */
    public boolean m61042b1(float f11, float f12) {
        int m118742r = AbstractC23136l9.m118742r(5.0f);
        int i11 = this.f57361R1;
        if (f11 >= i11 - m118742r && f11 <= i11 + AbstractC11531v0.m62250e2().getIntrinsicWidth() + m118742r) {
            int i12 = this.f57367S1;
            if (f12 >= i12 - m118742r && f12 <= i12 + AbstractC11531v0.m62250e2().getIntrinsicHeight() + m118742r) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b2 */
    protected int mo61043b2(int i11, int i12, int i13, int i14, boolean z11) {
        if (this.f57501p1 && !mo61001O3()) {
            this.f57513r1 = i11;
            int height = ((f57230e6 - ((int) this.f57525t1.height())) / 2) + i12;
            this.f57519s1 = height;
            i12 += height + ((int) this.f57525t1.height()) + f57195I5;
            if (this.f57537v1) {
                this.f57542w1 = this.f57513r1 + f57231f6 + this.f57483m1 + f57191G5;
                this.f57547x1 = ((this.f57519s1 + this.f57531u1) + (this.f57477l1 / 2)) - (f57232g6 / 2);
            }
        }
        if (this.f57333M3) {
            this.f57450g4 = i11;
            this.f57456h4 = i12;
            int i15 = i11 + f57203M5;
            this.f57426c4 = i15;
            int i16 = f57201L5 + i12;
            this.f57432d4 = i16;
            this.f57266B2.set(i15, i16, i15 + this.f57363R3, i16 + this.f57369S3);
            this.f57474k4.m76339r(this.f57426c4 + this.f57363R3 + this.f57462i4, this.f57432d4);
            int m76327d = this.f57474k4.m76327d() + this.f57369S3 + this.f57462i4;
            this.f57387V3 = m76327d;
            int i17 = this.f57432d4;
            this.f57393W3 = i17;
            this.f57408Z3 = m76327d;
            this.f57414a4 = i17 + this.f57381U3.getHeight() + AbstractC23136l9.m118742r(6.0f);
            this.f57492n4 = this.f57474k4.m76327d() + ((this.f57369S3 - this.f57486m4.m77064c()) / 2);
            this.f57498o4 = this.f57474k4.m76328e() + ((this.f57369S3 - this.f57486m4.m77063b()) / 2);
            if (this.f57504p4) {
                this.f57510q4 = this.f57474k4.m76327d() + AbstractC23136l9.m118742r(4.0f);
                this.f57516r4 = ((this.f57474k4.m76328e() + this.f57369S3) - AbstractC23136l9.m118742r(4.0f)) - AbstractC11531v0.m62152I2().getIntrinsicWidth();
            }
            return i12 + this.f57444f4 + f57195I5;
        }
        return i12;
    }

    /* renamed from: b3 */
    public void mo61044b3(C17945a0 c17945a0, C28769a c28769a) {
        boolean z11;
        this.f57281E = false;
        this.f57268B4.m143922o(c17945a0);
        m60902B3(c17945a0, c28769a);
        if (getDelegate().mo62101s4() != 1) {
            this.f57281E = true;
        }
        if (!C24265l.m126676s().m126680B()) {
            c17945a0.m95111d9();
            this.f57281E = true;
        }
        if (c17945a0.m95032V6() && (c28769a.f133312h || m60930s1(c17945a0))) {
            AbstractC23306f.m120635Y0().m101501b(new C2784i.a(c17945a0.mo95039W2(), c17945a0), new C11330e());
        }
        C28771c c28771c = this.f57257A;
        if (c28771c != null && c28771c.m143950j().size() > 1) {
            int size = this.f57257A.m143950j().size();
            for (int i11 = 0; i11 < size; i11++) {
                C17945a0 m143953m = this.f57257A.m143953m(i11);
                if (i11 == size - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m60925d0(m143953m, z11);
            }
            return;
        }
        m60925d0(this.f57263B, true);
    }

    @Override // dj.C17985n1.c
    /* renamed from: c */
    public void mo61045c() {
    }

    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        boolean z11;
        if (this.f57397X2 != c17945a0.m95041W4() || this.f57402Y2 != c17945a0.m95089b4() || this.f57407Z2 != c17945a0.m95107d3()) {
            return true;
        }
        if (mo60981K()) {
            if (getBubbleStyle() == 0 && this.f57447g1 != c28769a.f133321q) {
                return true;
            }
            if (this.f57447g1 && !TextUtils.equals(this.f57423c1, c28769a.f133320p)) {
                return true;
            }
        }
        if (this.f57413a3 != c28769a.f133312h || this.f57406Z1 != mo61021T(c28769a)) {
            return true;
        }
        if ((this.f57412a2 && !TextUtils.equals(this.f57385V1, getCurrentTimeText())) || (z11 = this.f57508q2) != c28769a.f133309e) {
            return true;
        }
        if (z11 && !TextUtils.equals(this.f57520s2, c17945a0.m94965O2())) {
            return true;
        }
        if (this.f57526t2 && c17945a0.m95275v4() != null) {
            C17997r1 m95275v4 = c17945a0.m95275v4();
            if (this.f57538v2 != m95275v4.m95687d()) {
                return true;
            }
            if (TextUtils.isEmpty(m95275v4.m95693j()) && !TextUtils.isEmpty(m95275v4.m95691h())) {
                return true;
            }
        }
        if (this.f57262A4 != c28769a.f133311g) {
            return true;
        }
        if ((this.f57501p1 && !TextUtils.equals(this.f57495o1, c28769a.f133305a)) || this.f57261A3 != c28769a.f133316l || this.f57267B3 != c28769a.f133317m || this.f57273C3 != c28769a.f133308d || this.f57291F3 != c28769a.f133318n || this.f57274C4 != c17945a0.m95071Z3() || this.f57537v1 != c28769a.f133306b.booleanValue()) {
            return true;
        }
        if (mo60971I()) {
            if (this.f57337N1 != m60928r1()) {
                return true;
            }
            if (this.f57425c3 && this.f57343O1 != m60901B1()) {
                return true;
            }
            if (this.f57425c3 && c17945a0.m94861C3() != null && this.f57487m5 != c17945a0.m94861C3().size()) {
                return true;
            }
            return m60922a0();
        }
        if (this.f57394W4 != c17945a0.m95178k6()) {
            return true;
        }
        return false;
    }

    /* renamed from: c1 */
    boolean m61047c1(float f11, float f12) {
        try {
            int m118742r = AbstractC23136l9.m118742r(8.0f);
            int i11 = this.f57327L3;
            if (f11 < i11 - m118742r || f11 >= i11 + AbstractC11531v0.m62340w2().getIntrinsicWidth() + m118742r) {
                return false;
            }
            int i12 = this.f57321K3;
            if (f12 < i12 - m118742r) {
                return false;
            }
            if (f12 > i12 + AbstractC11531v0.m62340w2().getIntrinsicHeight() + m118742r) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: c2 */
    public void mo61048c2(int i11, int i12, int i13, int i14, boolean z11) {
        RectF rectF;
        List list;
        if (this.f57298G4 && (list = this.f57286E4) != null && list.size() > 0) {
            if (!((C13646i) this.f57286E4.get(0)).m76256a()) {
                i12 += f57189F5;
            }
            this.f57310I4 = i12;
            for (C13646i c13646i : this.f57286E4) {
                c13646i.m76262n(mo60984L(i11, c13646i), i12);
                i12 += c13646i.m76259g();
            }
        }
        if (m60982K1()) {
            this.f57430d2 = i11;
            int i15 = f57205N5;
            this.f57436e2 = i12 + i15;
            if (m61016S()) {
                int i16 = this.f57430d2;
                int i17 = f57195I5;
                this.f57478l2 = i16 + i17;
                int i18 = this.f57436e2;
                int height = (int) this.f57442f2.height();
                int i19 = f57221V5;
                this.f57484m2 = i18 + ((height - i19) / 2);
                this.f57391W1 = this.f57478l2 + i19 + i17;
            } else {
                this.f57391W1 = this.f57430d2 + f57189F5;
            }
            int i21 = this.f57436e2;
            int height2 = (int) this.f57442f2.height();
            int i22 = f57241p6;
            this.f57396X1 = i21 + ((height2 - i22) / 2) + i22;
            i12 = (int) (i12 + i15 + this.f57442f2.height());
        }
        if (m61006P3() && (rectF = this.f57490n2) != null && rectF.height() > f57179A5) {
            this.f57496o2 = i11;
            int i23 = f57205N5;
            int i24 = i12 + i23;
            this.f57502p2 = i24;
            Paint.FontMetricsInt fontMetricsInt = f57246u6;
            int i25 = fontMetricsInt.descent - fontMetricsInt.ascent;
            this.f57466j2 = i11 + f57189F5;
            this.f57472k2 = (i24 + ((((int) this.f57490n2.height()) - i25) / 2)) - f57246u6.ascent;
            i12 = (int) (i12 + i23 + this.f57490n2.height());
        }
        if (this.f57425c3) {
            if (this.f57431d3) {
                this.f57497o3 = i12 + f57205N5;
                this.f57467j3 = i13 - ((int) getStateRect().width());
                this.f57473k3 = this.f57497o3;
                return;
            }
            int width = i13 - ((int) getStateRect().width());
            this.f57467j3 = width;
            int i26 = i12 + f57205N5;
            this.f57473k3 = i26;
            int i27 = f57209P5;
            int i28 = width + i27;
            this.f57479l3 = i28;
            this.f57485m3 = i26 + i27;
            this.f57443f3 = i28 + f57207O5 + i27;
            this.f57449g3 = (i26 + ((((int) getStateRect().height()) - f57192G6) / 2)) - f57186D6.ascent;
            this.f57437e3.height();
        }
    }

    /* renamed from: c3 */
    public void mo61049c3(Canvas canvas) {
    }

    /* renamed from: d1 */
    boolean m61050d1(float f11, float f12) {
        try {
            if (this.f57303H3 != null) {
                int m118742r = AbstractC23136l9.m118742r(8.0f);
                if (f11 < this.f57309I3 || f11 >= r2 + this.f57527t3) {
                    return false;
                }
                int i11 = this.f57521s3;
                if (f12 < i11 - m118742r) {
                    return false;
                }
                if (f12 > i11 + f57201L5 + this.f57303H3.getHeight() + m118742r) {
                    return false;
                }
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: d2 */
    public int mo61051d2(int i11, int i12, int i13, int i14, boolean z11) {
        boolean z12;
        List list;
        StaticLayout staticLayout;
        int bubblePaddingLeft = getBubblePaddingLeft();
        int bubblePaddingRight = getBubblePaddingRight();
        boolean z13 = true;
        if (this.f57533u3 && (staticLayout = this.f57303H3) != null) {
            int i15 = f57189F5;
            int i16 = i12 + i15;
            int height = staticLayout.getHeight();
            int i17 = i11 + bubblePaddingLeft;
            this.f57509q3 = i17;
            int i18 = i13 - bubblePaddingRight;
            this.f57515r3 = i18;
            this.f57521s3 = i16;
            int i19 = i16 + i15;
            this.f57309I3 = i17;
            this.f57315J3 = i19;
            this.f57327L3 = i18 - AbstractC11531v0.m62340w2().getIntrinsicWidth();
            this.f57321K3 = this.f57315J3 + ((height - AbstractC11531v0.m62340w2().getIntrinsicHeight()) / 2);
            i12 = i19 + height;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f57292F4 && (list = this.f57280D4) != null && list.size() > 0) {
            if (mo60987L2() || !((C13646i) this.f57280D4.get(0)).m76256a()) {
                i12 += f57189F5;
            }
            this.f57304H4 = i12;
            for (C13646i c13646i : this.f57280D4) {
                c13646i.m76262n(i11, i12);
                i12 += c13646i.m76259g();
            }
            z12 = true;
        }
        if (m60986L1()) {
            if (m61016S()) {
                int i21 = i11 + bubblePaddingLeft;
                this.f57478l2 = i21;
                int i22 = f57189F5;
                int i23 = i12 + i22;
                this.f57484m2 = i23;
                int i24 = f57221V5;
                this.f57391W1 = i21 + i24 + f57195I5;
                int i25 = f57241p6;
                this.f57396X1 = i23 + ((i24 - i25) / 2) + i25;
                i12 += i22 + Math.max(i24, i25);
            } else {
                this.f57391W1 = i11 + bubblePaddingLeft;
                i12 += f57189F5 + f57241p6;
                this.f57396X1 = i12;
            }
        } else {
            z13 = z12;
        }
        if (z13) {
            return i12 + f57189F5;
        }
        return i12;
    }

    /* renamed from: d3 */
    void m61052d3() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m95239r4() != null && this.f57263B.m95239r4().f91139a == 1) {
            getDelegate().mo62057N4(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (mo61115u1()) {
            mo61107r0(canvas);
        }
    }

    /* renamed from: e0 */
    protected boolean mo61053e0() {
        return false;
    }

    /* renamed from: e1 */
    protected boolean m61054e1(float f11, float f12) {
        if (f11 >= this.f57283E1 && f11 <= r0 + AbstractC11531v0.m62280k2().getIntrinsicWidth()) {
            if (f12 >= this.f57289F1 && f12 <= r3 + AbstractC11531v0.m62280k2().getIntrinsicHeight()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e2 */
    public void mo61055e2(int i11, int i12, int i13, int i14, boolean z11) {
        mo61071i2(i11, i12, i13, i12 + this.f57389W, z11);
        int i15 = i12 + this.f57389W;
        this.f57288F0 = i15;
        int i16 = this.f57428d0;
        this.f57294G0 = i15 + i16;
        mo61063g2(i11, i15, i13, i15 + i16, z11);
        int i17 = this.f57294G0;
        this.f57300H0 = i17;
        mo61051d2(i11, i17, i13, i17 + this.f57416b0, z11);
    }

    /* renamed from: e3 */
    protected void mo61056e3() {
        getDelegate().mo62034C4(this);
    }

    /* renamed from: f1 */
    protected boolean m61057f1(float f11, float f12) {
        RectF rectF = this.f57437e3;
        if (rectF != null) {
            int i11 = this.f57467j3;
            if (f11 >= i11 && f11 <= i11 + rectF.width()) {
                int i12 = this.f57473k3;
                if (f12 >= i12 && f12 <= i12 + this.f57437e3.height()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f2 */
    public int mo61058f2(int i11, int i12, int i13, int i14, boolean z11) {
        int intrinsicWidth;
        int intrinsicWidth2;
        int intrinsicWidth3;
        int intrinsicWidth4;
        int i15;
        if (this.f57346O4) {
            int i16 = f57203M5 / 2;
            if (z11) {
                i15 = i16 + i11;
            } else {
                i15 = (i13 - i16) - f57222W5;
            }
            this.f57358Q4 = i15;
            int i17 = f57203M5;
            int i18 = (i17 / 2) + i12;
            this.f57364R4 = i18;
            C17024o0 c17024o0 = this.f57370S4;
            if (c17024o0 != null) {
                int i19 = f57222W5;
                c17024o0.m91138B(i15 + (i19 / 4), i18 + (i19 / 4));
            }
            C21197a c21197a = this.f57376T4;
            if (c21197a != null) {
                c21197a.m109764g(this.f57358Q4, this.f57364R4);
            }
            i12 += f57222W5 + i17;
        }
        if (m60968H1()) {
            int i21 = f57203M5 / 2;
            if (z11) {
                intrinsicWidth4 = i21 + i11;
            } else {
                intrinsicWidth4 = (i13 - i21) - AbstractC11531v0.m62123C3().getIntrinsicWidth();
            }
            this.f57301H1 = intrinsicWidth4;
            int i22 = f57203M5;
            this.f57307I1 = (i22 / 2) + i12;
            i12 += AbstractC11531v0.m62123C3().getIntrinsicHeight() + i22;
        }
        if (m61121w1()) {
            int i23 = f57203M5 / 2;
            if (z11) {
                intrinsicWidth3 = i23 + i11;
            } else {
                intrinsicWidth3 = (i13 - i23) - AbstractC11531v0.m62280k2().getIntrinsicWidth();
            }
            this.f57283E1 = intrinsicWidth3;
            int i24 = f57203M5;
            this.f57289F1 = (i24 / 2) + i12;
            i12 += AbstractC11531v0.m62280k2().getIntrinsicHeight() + i24;
        }
        if (m60965G1() && !mo60962F1()) {
            int i25 = f57203M5 / 2;
            if (z11) {
                intrinsicWidth2 = i25 + i11;
            } else {
                intrinsicWidth2 = (i13 - i25) - AbstractC11531v0.m62346x3().getIntrinsicWidth();
            }
            this.f57552y1 = intrinsicWidth2;
            int i26 = f57203M5;
            this.f57557z1 = (i26 / 2) + i12;
            i12 += AbstractC11531v0.m62346x3().getIntrinsicHeight() + i26;
        }
        if (m61118v1()) {
            if (z11) {
                intrinsicWidth = i11 + (f57203M5 / 2);
            } else {
                intrinsicWidth = (i13 - (f57203M5 / 2)) - AbstractC11531v0.m62250e2().getIntrinsicWidth();
            }
            this.f57361R1 = intrinsicWidth;
            int i27 = f57203M5;
            this.f57367S1 = (i27 / 2) + i12;
            return i12 + AbstractC11531v0.m62250e2().getIntrinsicHeight() + i27;
        }
        return i12;
    }

    /* renamed from: f3 */
    public void m61059f3() {
        getDelegate().mo62067U3(this);
    }

    @Override // dj.C17985n1.c
    /* renamed from: g */
    public void mo61060g() {
        if (AbstractC19444a.m101693a()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    /* renamed from: g0 */
    protected Point mo61061g0() {
        int i11 = this.f57530u0;
        int i12 = this.f57371T;
        int i13 = f57223X5;
        return new Point(i11 + ((i12 - i13) / 2), this.f57524t0 + ((this.f57377U - i13) / 2));
    }

    /* renamed from: g1 */
    public boolean m61062g1(float f11, float f12) {
        if (getDelegate().mo62046J3() && !this.f57528t4.m115846u()) {
            int i11 = AbstractC26682c.f126381a;
            int m115835j = this.f57528t4.m115835j() + (i11 / 2);
            int m115839n = this.f57528t4.m115839n() + (i11 / 2);
            int i12 = ((int) (i11 * 2.5f)) / 2;
            int i13 = m115835j - i12;
            int i14 = m115839n - i12;
            C22405g c22405g = this.f57528t4;
            if (c22405g == null || !c22405g.m115836k() || f11 < i13 || f11 > i13 + r3 || f12 < i14 || f12 > i14 + r3) {
                return false;
            }
            return true;
        }
        C22405g c22405g2 = this.f57528t4;
        if (c22405g2 == null || !c22405g2.m115836k() || f11 < this.f57528t4.m115835j() || f11 > this.f57528t4.m115832g() + this.f57528t4.m115841p() || f12 < this.f57528t4.m115839n() || f12 > this.f57528t4.m115839n() + this.f57528t4.m115831f()) {
            return false;
        }
        return true;
    }

    /* renamed from: g2 */
    protected abstract void mo61063g2(int i11, int i12, int i13, int i14, boolean z11);

    /* renamed from: g3 */
    protected void m61064g3() {
        this.f57549x3.mo62095o();
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return getPhotoCoords();
    }

    protected int getBackgroundTopRegionHeight() {
        return 0;
    }

    protected int getBubbleBackgroundType() {
        C28769a c28769a;
        if (getBubbleStyle() == 1 || mo61124x1() || (c28769a = this.f57269C) == null || c28769a.f133319o == 0) {
            return 1;
        }
        return 0;
    }

    public int getBubbleMarginBottom() {
        if (this.f57413a3) {
            if (this.f57549x3.mo62101s4() == 3) {
                return f57201L5;
            }
            return f57211Q5;
        }
        return f57213R5;
    }

    public int getBubbleMarginTop() {
        if (!this.f57262A4 && getBubbleStyle() != 1) {
            return f57195I5;
        }
        return f57193H5;
    }

    public int getBubbleMaxWidth() {
        int i11;
        int m118722k0;
        int widthMeasurement = getWidthMeasurement();
        if (getDelegate().mo62083g4() && widthMeasurement < (m118722k0 = AbstractC23136l9.m118722k0()) && m118722k0 - widthMeasurement <= AbstractC23136l9.m118742r(40.0f)) {
            widthMeasurement = m118722k0;
        }
        if (getBubbleStyle() == 1) {
            i11 = f57197J5 * 2;
        } else {
            i11 = f57196I6;
        }
        return Math.max(widthMeasurement - i11, AbstractC11531v0.m62231a3());
    }

    public int getBubbleMinWidth() {
        if (this.f57501p1 && mo61001O3()) {
            return f57234i6;
        }
        if (!this.f57292F4 && !this.f57298G4) {
            if (this.f57319K1) {
                return f57240o6;
            }
            return f57233h6;
        }
        return f57214R6;
    }

    public int getBubblePaddingLeft() {
        return f57203M5;
    }

    public int getBubblePaddingRight() {
        return f57203M5;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getBubbleRect() {
        return new Rect(this.f57530u0, this.f57524t0, this.f57536v0, this.f57541w0);
    }

    public int getBubbleSpacingDefault() {
        if (getBubbleStyle() == 1) {
            return f57197J5;
        }
        return f57239n6;
    }

    protected int getBubbleStyle() {
        return 0;
    }

    public int getBubbleTop() {
        return this.f57524t0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public View getChatRowView() {
        return this;
    }

    public int getDefaultBubblePaddingBottom() {
        if (mo60987L2()) {
            return f57201L5;
        }
        return getMarginBorder();
    }

    public int getDefaultBubblePaddingTop() {
        return f57201L5;
    }

    public InterfaceC11530v getDelegate() {
        return this.f57549x3;
    }

    protected JSONArray getJsonAutomationTestDefault() {
        int[] iArr = new int[2];
        this.f57560z4.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int m118737p0 = iArr[1] + AbstractC23136l9.m118737p0() + this.f57560z4.getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
        JSONArray jSONArray = new JSONArray();
        try {
            if (this.f57447g1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "avt");
                int i12 = this.f57435e1;
                int i13 = this.f57441f1;
                int i14 = f57230e6;
                jSONObject.put("bounds", m60994N0(i11 + i12, m118737p0 + i13, i12 + i11 + i14, i13 + m118737p0 + i14));
                jSONArray.put(jSONObject);
            }
            if (this.f57271C1 && getBubbleStyle() == 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", "btn_forward");
                int i15 = this.f57283E1;
                jSONObject2.put("bounds", m60994N0(i11 + i15, this.f57289F1 + m118737p0, i11 + i15 + AbstractC11531v0.m62285l2().getIntrinsicWidth(), m118737p0 + this.f57289F1 + AbstractC11531v0.m62285l2().getIntrinsicHeight()));
                jSONArray.put(jSONObject2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONArray;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getJumpTargetY() {
        return 0;
    }

    public int getMarginBorder() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C17945a0 getMessage() {
        return this.f57263B;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C17945a0 getMessageForReply() {
        return this.f57263B;
    }

    public String getMsgContentTalkText() {
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getMyReactionCount() {
        C22405g c22405g;
        if (this.f57522s4 && (c22405g = this.f57528t4) != null) {
            return c22405g.m115833h();
        }
        return 0;
    }

    @Override // android.view.View
    @Deprecated
    public int getPaddingBottom() {
        return super.getPaddingBottom();
    }

    @Override // android.view.View
    @Deprecated
    public int getPaddingLeft() {
        return super.getPaddingLeft();
    }

    @Override // android.view.View
    @Deprecated
    public int getPaddingRight() {
        return super.getPaddingRight();
    }

    @Override // android.view.View
    @Deprecated
    public int getPaddingTop() {
        return super.getPaddingTop();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C22405g getReactionBar() {
        return this.f57528t4;
    }

    public Point getReactionCoords() {
        int m115835j;
        int i11;
        if (!this.f57522s4 || this.f57263B == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.f57560z4.getLocationOnScreen(iArr);
        int i12 = 0;
        if (m60958E1()) {
            try {
                m115835j = iArr[0] + this.f57528t4.m115835j();
                int m115839n = iArr[1] + this.f57528t4.m115839n();
                if (getReactionPickerDirection()) {
                    i12 = this.f57528t4.m115831f();
                }
                i11 = m115839n + i12;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        } else {
            m115835j = iArr[0] + this.f57530u0 + (this.f57371T / 2);
            i11 = this.f57524t0 + iArr[1];
        }
        return new Point(m115835j, i11);
    }

    public C24751d getReactionMsgInfo() {
        C22405g c22405g = this.f57528t4;
        if (c22405g != null) {
            return c22405g.m115837l();
        }
        return null;
    }

    public boolean getReactionPickerDirection() {
        try {
            if (m60958E1()) {
                if ((this.f57560z4.getBottom() - this.f57528t4.m115831f()) - ReactionPickerView.f71134f0 < 0) {
                    return true;
                }
                return false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getReactionRect() {
        C22405g c22405g;
        if (this.f57263B != null && this.f57522s4 && (c22405g = this.f57528t4) != null && c22405g.m115836k()) {
            return new Rect(this.f57528t4.m115835j(), this.f57528t4.m115839n(), this.f57528t4.m115832g() + this.f57528t4.m115841p(), this.f57528t4.m115839n() + this.f57528t4.m115831f());
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getReferenceThumbPosition() {
        C13658k c13658k;
        if (this.f57333M3 && (c13658k = this.f57474k4) != null) {
            int m76327d = c13658k.m76327d();
            int m76328e = this.f57474k4.m76328e();
            return new Rect(m76327d, m76328e, this.f57474k4.m76329f() + m76327d, this.f57474k4.m76326c() + m76328e);
        }
        return null;
    }

    public int getSelectionCheckBoxLeft() {
        return getLeft() + AbstractC23136l9.m118742r(8.0f);
    }

    public int getSelectionCheckBoxTop() {
        int i11;
        int top = getTop();
        if (this.f57447g1) {
            i11 = this.f57441f1;
        } else {
            i11 = this.f57524t0;
        }
        return top + i11;
    }

    public long getSelectionCheckedChangeAnimTime() {
        C28769a c28769a = this.f57269C;
        if (c28769a != null) {
            return c28769a.f133304B;
        }
        return 0L;
    }

    protected TextPaint getSenderTextPaint() {
        int i11;
        C28769a c28769a;
        if (this.f57287F == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            this.f57287F = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
        }
        this.f57287F.setTextSize(AbstractC23136l9.m118759w1(12));
        if (AbstractC23309i.m120887E2() == 1 && this.f57263B != null && (c28769a = this.f57269C) != null) {
            this.f57287F.setColor(c28769a.f133307c);
        } else {
            TextPaint textPaint = this.f57287F;
            if (mo61001O3()) {
                i11 = -8355712;
            } else {
                i11 = -1;
            }
            textPaint.setColor(i11);
        }
        return this.f57287F;
    }

    RectF getStateRect() {
        RectF rectF = this.f57437e3;
        if (rectF == null) {
            RectF rectF2 = new RectF();
            this.f57437e3 = rectF2;
            return rectF2;
        }
        return rectF;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C3979l getThumbImageInfo() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getTopAbs() {
        return getTop();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getTotalReaction() {
        C22405g c22405g;
        if (this.f57522s4 && (c22405g = this.f57528t4) != null) {
            return c22405g.m115840o();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public float getTranslationXAbs() {
        return getTranslationX();
    }

    public int getWidthMeasurement() {
        int i11 = this.f57446g0;
        if (i11 <= 0) {
            return AbstractC23136l9.m118728m0(getContext(), getDelegate().mo62071Y3());
        }
        return i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    /* renamed from: h */
    public void mo61065h(MotionEvent motionEvent) {
        dispatchTouchEvent(motionEvent);
    }

    /* renamed from: h0 */
    void m61066h0(int i11) {
        int i12;
        try {
            if (f57204M6 == null) {
                C13704p1 c13704p1 = new C13704p1(1);
                f57204M6 = c13704p1;
                c13704p1.m76613c();
                C13704p1 c13704p12 = new C13704p1(1);
                f57206N6 = c13704p12;
                c13704p12.setTypeface(Typeface.DEFAULT);
                f57208O6 = new Paint(1);
            }
            f57208O6.setColor(AbstractC11531v0.m62326t3());
            f57204M6.setTextSize(AbstractC23136l9.m118759w1(14));
            f57204M6.setColor(AbstractC11531v0.m62153I3());
            f57206N6.setTextSize(AbstractC23136l9.m118759w1(11));
            f57206N6.setColor(AbstractC11531v0.m62143G3());
            int bubblePaddingLeft = (i11 - getBubblePaddingLeft()) - this.f57363R3;
            int i13 = this.f57462i4;
            int bubblePaddingRight = (((bubblePaddingLeft - i13) - this.f57369S3) - i13) - getBubblePaddingRight();
            StaticLayout m119624k = AbstractC23214t.m119624k(this.f57339N3, f57204M6, bubblePaddingRight);
            this.f57381U3 = m119624k;
            if (m119624k.getLineCount() > 0) {
                int i14 = this.f57363R3;
                int i15 = this.f57462i4;
                this.f57398X3 = i14 + i15 + this.f57369S3 + i15 + ((int) Math.ceil(this.f57381U3.getWidth()));
                i12 = this.f57381U3.getHeight() + AbstractC23136l9.m118742r(6.0f);
            } else {
                i12 = 0;
            }
            StaticLayout m119624k2 = AbstractC23214t.m119624k(this.f57345O3, f57206N6, bubblePaddingRight);
            this.f57403Y3 = m119624k2;
            if (m119624k2.getLineCount() > 0) {
                int i16 = this.f57363R3;
                int i17 = this.f57462i4;
                this.f57420b4 = i16 + i17 + this.f57369S3 + i17 + ((int) Math.ceil(this.f57403Y3.getWidth()));
                i12 += this.f57403Y3.getHeight();
            }
            this.f57444f4 = Math.max(i12, this.f57369S3) + (f57201L5 * 2);
            this.f57438e4 = getBubblePaddingLeft() + Math.max(this.f57398X3, this.f57420b4) + getBubblePaddingRight();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h1 */
    public boolean m61067h1(float f11, float f12) {
        C22405g c22405g = this.f57528t4;
        if (c22405g != null && c22405g.m115846u() && f11 >= this.f57528t4.m115832g() && f11 <= this.f57528t4.m115832g() + this.f57528t4.m115841p() && f12 >= this.f57528t4.m115839n() && f12 <= this.f57528t4.m115839n() + this.f57528t4.m115831f()) {
            return true;
        }
        return false;
    }

    /* renamed from: h2 */
    protected void m61068h2(int i11, int i12, int i13, int i14, boolean z11) {
        if (this.f57447g1) {
            this.f57435e1 = z11 ? (i13 - f57236k6) - f57230e6 : f57236k6 + i11;
            this.f57441f1 = i12;
        }
    }

    /* renamed from: h3 */
    protected boolean mo61069h3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 != 1 || !this.f57480l4 || !m61073j1(f11, f12)) {
                return false;
            }
            m61052d3();
            return true;
        }
        if (!this.f57333M3 || !m61073j1(f11, f12)) {
            z11 = false;
        }
        this.f57480l4 = z11;
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0058, code lost:            if (r0 == false) goto L82;     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0018, B:9:0x0028, B:10:0x0033, B:12:0x0039, B:14:0x0041, B:16:0x004b, B:19:0x005a, B:20:0x006f, B:22:0x0088, B:23:0x008f, B:25:0x0099, B:27:0x009d, B:29:0x00a3, B:31:0x00c3, B:32:0x00cc, B:34:0x00ed, B:35:0x0106, B:37:0x010c, B:39:0x0123, B:40:0x013b, B:42:0x0148, B:43:0x014a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0018, B:9:0x0028, B:10:0x0033, B:12:0x0039, B:14:0x0041, B:16:0x004b, B:19:0x005a, B:20:0x006f, B:22:0x0088, B:23:0x008f, B:25:0x0099, B:27:0x009d, B:29:0x00a3, B:31:0x00c3, B:32:0x00cc, B:34:0x00ed, B:35:0x0106, B:37:0x010c, B:39:0x0123, B:40:0x013b, B:42:0x0148, B:43:0x014a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0018, B:9:0x0028, B:10:0x0033, B:12:0x0039, B:14:0x0041, B:16:0x004b, B:19:0x005a, B:20:0x006f, B:22:0x0088, B:23:0x008f, B:25:0x0099, B:27:0x009d, B:29:0x00a3, B:31:0x00c3, B:32:0x00cc, B:34:0x00ed, B:35:0x0106, B:37:0x010c, B:39:0x0123, B:40:0x013b, B:42:0x0148, B:43:0x014a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0018, B:9:0x0028, B:10:0x0033, B:12:0x0039, B:14:0x0041, B:16:0x004b, B:19:0x005a, B:20:0x006f, B:22:0x0088, B:23:0x008f, B:25:0x0099, B:27:0x009d, B:29:0x00a3, B:31:0x00c3, B:32:0x00cc, B:34:0x00ed, B:35:0x0106, B:37:0x010c, B:39:0x0123, B:40:0x013b, B:42:0x0148, B:43:0x014a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void m61070i0(C17997r1 c17997r1, int i11) {
        boolean z11;
        String m103092b;
        String m103091a;
        int i12;
        int i13;
        int i14;
        if (c17997r1 != null) {
            try {
                int i15 = 0;
                if (TextUtils.isEmpty(c17997r1.m95693j()) && !TextUtils.isEmpty(c17997r1.m95691h())) {
                    String m153507i = C31943h5.f146766a.m153507i(c17997r1.m95691h(), true);
                    if (!TextUtils.isEmpty(m153507i)) {
                        this.f57532u2.m95705v(m153507i);
                        z11 = true;
                        if (c17997r1.m95690g() != null) {
                            if (c17997r1.m95690g().f91018w != null && c17997r1.m95690g().f91018w.f42789b && c17997r1.m95690g().f91018w.m40853c()) {
                                C23288a.f113033a.mo13474a(new C18427b(this.f57263B.mo95039W2(), new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.l
                                    public /* synthetic */ RunnableC11494l() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ChatRow.this.m60917V1();
                                    }
                                }));
                                C19660u0 m102704x = AbstractC19620d0.m102704x(c17997r1, this.f57263B.mo95039W2());
                                m103092b = m102704x.m103092b();
                                m103091a = m102704x.m103091a();
                                int i16 = f57252x6;
                                int i17 = i11 - i16;
                                if (!this.f57320K2) {
                                    i12 = f57250w6 + f57219U5;
                                } else {
                                    i12 = 0;
                                }
                                int i18 = i17 - i12;
                                int i19 = f57219U5;
                                int i21 = i18 - i19;
                                if (!TextUtils.isEmpty(m103092b)) {
                                    C17945a0 c17945a0 = this.f57263B;
                                    if (c17945a0 != null && c17945a0.m94847A6() && AbstractC30201b.m148949b(C0943w.m4462l().m4473g(this.f57263B.mo95039W2()), C28203u6.f131407a.m141811g(this.f57532u2.m95693j()))) {
                                        this.f57543w2 = true;
                                        i14 = f57232g6 + f57191G5;
                                    } else {
                                        i14 = 0;
                                    }
                                    int i22 = i21 - i14;
                                    StaticLayout m119624k = AbstractC23214t.m119624k(TextUtils.ellipsize(m103092b.replace('\n', ' '), f57256z6, i22, TextUtils.TruncateAt.END), f57256z6, i22);
                                    this.f57548x2 = m119624k;
                                    if (m119624k.getLineCount() > 0) {
                                        this.f57284E2 = ((int) this.f57548x2.getLineWidth(0)) + i14;
                                        i13 = this.f57548x2.getHeight() + AbstractC23136l9.m118742r(10.0f);
                                        if (!TextUtils.isEmpty(m103091a)) {
                                            StaticLayout m119624k2 = AbstractC23214t.m119624k(TextUtils.ellipsize(m103091a, f57180A6, i21, TextUtils.TruncateAt.END), f57180A6, i21);
                                            this.f57553y2 = m119624k2;
                                            if (m119624k2.getLineCount() > 0) {
                                                this.f57290F2 = (int) this.f57553y2.getLineWidth(0);
                                                this.f57296G2 = this.f57553y2.getLineLeft(0);
                                                i13 += this.f57553y2.getHeight();
                                            }
                                        }
                                        int i23 = f57250w6;
                                        this.f57272C2 = Math.max(i23, i13);
                                        int i24 = i16 + i19;
                                        if (this.f57320K2) {
                                            i15 = i23 + i19;
                                        }
                                        this.f57278D2 = i24 + i15 + Math.max(this.f57284E2, this.f57290F2);
                                    }
                                }
                                i13 = 0;
                                if (!TextUtils.isEmpty(m103091a)) {
                                }
                                int i232 = f57250w6;
                                this.f57272C2 = Math.max(i232, i13);
                                int i242 = i16 + i19;
                                if (this.f57320K2) {
                                }
                                this.f57278D2 = i242 + i15 + Math.max(this.f57284E2, this.f57290F2);
                            }
                        }
                    }
                }
                z11 = false;
                if (c17997r1.m95690g() != null && c17997r1.m95690g().f91018w != null) {
                    C23288a.f113033a.mo13474a(new C18427b(this.f57263B.mo95039W2(), new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.l
                        public /* synthetic */ RunnableC11494l() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatRow.this.m60917V1();
                        }
                    }));
                    C19660u0 m102704x2 = AbstractC19620d0.m102704x(c17997r1, this.f57263B.mo95039W2());
                    m103092b = m102704x2.m103092b();
                    m103091a = m102704x2.m103091a();
                    int i162 = f57252x6;
                    int i172 = i11 - i162;
                    if (!this.f57320K2) {
                    }
                    int i182 = i172 - i12;
                    int i192 = f57219U5;
                    int i212 = i182 - i192;
                    if (!TextUtils.isEmpty(m103092b)) {
                    }
                    i13 = 0;
                    if (!TextUtils.isEmpty(m103091a)) {
                    }
                    int i2322 = f57250w6;
                    this.f57272C2 = Math.max(i2322, i13);
                    int i2422 = i162 + i192;
                    if (this.f57320K2) {
                    }
                    this.f57278D2 = i2422 + i15 + Math.max(this.f57284E2, this.f57290F2);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: i2 */
    public int mo61071i2(int i11, int i12, int i13, int i14, boolean z11) {
        int defaultBubblePaddingTop;
        C13574c3 c13574c3;
        int i15;
        if (this.f57501p1 && mo61001O3()) {
            int i16 = (f57230e6 - this.f57477l1) / 2;
            int bubblePaddingLeft = getBubblePaddingLeft() + i11;
            this.f57513r1 = bubblePaddingLeft;
            int i17 = i12 + i16;
            this.f57519s1 = i17;
            if (this.f57537v1) {
                this.f57542w1 = bubblePaddingLeft + this.f57483m1 + f57191G5;
                this.f57547x1 = (i17 + (this.f57477l1 / 2)) - (f57232g6 / 2);
            }
            defaultBubblePaddingTop = i16 + this.f57477l1 + AbstractC23136l9.m118742r(8.0f);
        } else {
            defaultBubblePaddingTop = getDefaultBubblePaddingTop();
        }
        int i18 = defaultBubblePaddingTop + i12;
        if (this.f57526t2) {
            int bubblePaddingLeft2 = getBubblePaddingLeft() + i11;
            this.f57558z2 = bubblePaddingLeft2;
            this.f57260A2 = i18;
            StaticLayout staticLayout = this.f57548x2;
            if (staticLayout != null) {
                int i19 = bubblePaddingLeft2 + f57252x6;
                int i21 = f57219U5;
                int i22 = i19 + i21;
                if (this.f57320K2) {
                    i15 = f57250w6 + i21;
                } else {
                    i15 = 0;
                }
                int i23 = i22 + i15;
                this.f57332M2 = i23;
                this.f57338N2 = i18;
                if (this.f57543w2) {
                    this.f57344O2 = i23 + ((int) staticLayout.getLineWidth(0)) + f57191G5;
                    this.f57350P2 = (this.f57338N2 + (this.f57548x2.getHeight() / 2)) - (f57232g6 / 2);
                }
            }
            this.f57356Q2 = this.f57558z2 + f57252x6 + AbstractC23136l9.m118742r(10.0f);
            this.f57362R2 = this.f57260A2;
            i18 += this.f57272C2;
        }
        if (this.f57319K1 && (c13574c3 = this.f57331M1) != null) {
            return i18 + c13574c3.m76059t(i18, i11, i12);
        }
        return i18;
    }

    /* renamed from: i3 */
    public boolean mo61072i3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3 && this.f57322K4) {
                    m61116u3(motionEvent);
                }
            } else {
                if (this.f57503p3 && m61057f1(f11, f12)) {
                    getDelegate().mo62085h4(this.f57257A.m143954n());
                    return true;
                }
                if (this.f57322K4 && m61116u3(motionEvent)) {
                    return true;
                }
            }
            return false;
        }
        if (this.f57425c3 && !m60978J1() && m61057f1(f11, f12)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57503p3 = z11;
        if (!this.f57298G4 || !m61116u3(motionEvent)) {
            z12 = false;
        }
        this.f57322K4 = z12;
        return z12 | z11;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (this.f57427c5) {
            this.f57433d5 = true;
        }
    }

    /* renamed from: j1 */
    boolean m61073j1(float f11, float f12) {
        if (f11 >= this.f57450g4 && f11 <= r0 + this.f57438e4) {
            if (f12 >= this.f57456h4 && f12 <= r3 + this.f57444f4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j2 */
    protected void m61074j2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f57452h0 = i11;
        this.f57458i0 = i12;
        this.f57464j0 = i13;
        int i15 = i12 + this.f57299H;
        this.f57470k0 = i15;
        mo61086m2(i11, i12, i13, i15, z11);
        this.f57476l0 = mo61017S0(i11, i13, this.f57329M, z11);
        int bubbleMarginTop = this.f57470k0 + getBubbleMarginTop();
        this.f57482m0 = bubbleMarginTop;
        int i16 = this.f57476l0;
        int i17 = i16 + this.f57329M;
        this.f57488n0 = i17;
        int i18 = bubbleMarginTop + this.f57335N;
        this.f57494o0 = i18;
        m61082l2(i16, bubbleMarginTop, i17, i18, z11);
        this.f57500p0 = i11;
        int bubbleMarginBottom = this.f57494o0 + getBubbleMarginBottom();
        this.f57506q0 = bubbleMarginBottom;
        this.f57512r0 = i13;
        int i19 = bubbleMarginBottom + this.f57305I;
        this.f57518s0 = i19;
        m61078k2(this.f57500p0, bubbleMarginBottom, i13, i19, z11);
    }

    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3 && this.f57316J4) {
                    m61113t3(motionEvent);
                }
            } else {
                if (this.f57392W2 && m61077k1(f11, f12)) {
                    m61000O2();
                    return true;
                }
                if (this.f57539v3 && m61050d1(f11, f12)) {
                    m61027V2();
                    return true;
                }
                if (this.f57544w3 && m61047c1(f11, f12)) {
                    m61025U2();
                    return true;
                }
                if (this.f57316J4 && m61113t3(motionEvent)) {
                    return true;
                }
                if (this.f57325L1 && m61094o1(f11, f12)) {
                    m61106q3();
                    return true;
                }
            }
            return false;
        }
        if (this.f57526t2 && m61077k1(f11, f12)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57392W2 = z11;
        if (this.f57533u3 && m61050d1(f11, f12)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57539v3 = z12;
        boolean z16 = z11 | z12;
        if (this.f57533u3 && m61047c1(f11, f12)) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f57544w3 = z13;
        boolean z17 = z16 | z13;
        if (this.f57292F4 && m61113t3(motionEvent)) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f57316J4 = z14;
        boolean z18 = z14 | z17;
        if (!this.f57319K1 || !m61094o1(f11, f12)) {
            z15 = false;
        }
        this.f57325L1 = z15;
        return z15 | z18;
    }

    /* renamed from: k0 */
    public int mo61076k0(C17945a0 c17945a0) {
        if (m60973I1()) {
            return 0;
        }
        return AbstractC19656s0.m103071n(c17945a0);
    }

    /* renamed from: k1 */
    public boolean m61077k1(float f11, float f12) {
        return f11 >= ((float) this.f57530u0) && f11 <= ((float) this.f57536v0) && f12 >= ((float) this.f57524t0) && f12 <= ((float) (this.f57260A2 + this.f57272C2));
    }

    /* renamed from: k2 */
    protected void m61078k2(int i11, int i12, int i13, int i14, boolean z11) {
    }

    /* renamed from: k3 */
    public boolean mo61079k3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                if (this.f57277D1 && m61054e1(f11, f12)) {
                    m61030W2();
                    return true;
                }
                if (this.f57313J1 && m61085m1(f11, f12)) {
                    m61059f3();
                    return true;
                }
                if (this.f57265B1 && m61081l1(f11, f12)) {
                    mo61056e3();
                    return true;
                }
                if (this.f57379U1 && m61042b1(f11, f12)) {
                    m61019S2();
                    return true;
                }
                if (this.f57325L1 && m61094o1(f11, f12)) {
                    m61106q3();
                    return true;
                }
                if (this.f57352P4 && m61090n1(f11, f12) && this.f57340N4) {
                    m61064g3();
                    return true;
                }
            }
            return false;
        }
        if (m61121w1() && m61054e1(f11, f12)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57277D1 = z11;
        if (m60968H1() && m61085m1(f11, f12)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57313J1 = z12;
        boolean z17 = z11 | z12;
        if (m60965G1() && m61081l1(f11, f12)) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f57265B1 = z13;
        boolean z18 = z17 | z13;
        if (m61024U() && m61042b1(f11, f12)) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f57379U1 = z14;
        boolean z19 = z18 | z14;
        if (this.f57319K1 && m61094o1(f11, f12)) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f57325L1 = z15;
        boolean z21 = z19 | z15;
        if (!this.f57346O4 || !m61090n1(f11, f12) || !this.f57340N4) {
            z16 = false;
        }
        this.f57352P4 = z16;
        return z16 | z21;
    }

    /* renamed from: l0 */
    void m61080l0(Canvas canvas) {
        int i11;
        Drawable drawable = this.f57372T0;
        if (drawable != null) {
            int i12 = this.f57435e1;
            int i13 = this.f57441f1;
            int i14 = f57230e6;
            drawable.setBounds(i12, i13, i12 + i14, i14 + i13);
            this.f57372T0.draw(canvas);
        }
        m61084m0(canvas);
        C28769a c28769a = this.f57269C;
        if (c28769a != null) {
            i11 = c28769a.f133319o;
        } else {
            i11 = 0;
        }
        if (i11 == 1) {
            Drawable m62251e3 = AbstractC11531v0.m62251e3();
            int i15 = this.f57435e1;
            int i16 = f57230e6;
            int i17 = f57199K5;
            int i18 = this.f57441f1;
            m62251e3.setBounds((i15 + i16) - i17, (i18 + i16) - i17, i15 + i16, i18 + i16);
            m62251e3.draw(canvas);
            return;
        }
        if (i11 == 2) {
            Drawable m62136F1 = AbstractC11531v0.m62136F1();
            int i19 = this.f57435e1;
            int i21 = f57230e6;
            int i22 = f57199K5;
            int i23 = this.f57441f1;
            m62136F1.setBounds((i19 + i21) - i22, (i23 + i21) - i22, i19 + i21, i23 + i21);
            m62136F1.draw(canvas);
        }
    }

    /* renamed from: l1 */
    public boolean m61081l1(float f11, float f12) {
        int m118742r = AbstractC23136l9.m118742r(5.0f);
        int i11 = this.f57552y1;
        if (f11 >= i11 - m118742r && f11 <= i11 + AbstractC11531v0.m62346x3().getIntrinsicWidth() + m118742r) {
            int i12 = this.f57557z1;
            if (f12 >= i12 - m118742r && f12 <= i12 + AbstractC11531v0.m62346x3().getIntrinsicHeight() + m118742r) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l2 */
    protected void m61082l2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int bubbleMaxWidth;
        if (!z11) {
            i11 = i13 - this.f57311J;
        }
        this.f57556z0 = i11;
        int i21 = this.f57311J;
        this.f57258A0 = i11 + i21;
        this.f57546x0 = i12;
        this.f57551y0 = this.f57347P + i12;
        int mo61012R0 = mo61012R0(this.f57329M, this.f57371T, i21, this.f57317K, z11);
        if (z11) {
            i15 = this.f57258A0 + mo61012R0;
        } else {
            i15 = (this.f57556z0 - this.f57371T) - mo61012R0;
        }
        this.f57530u0 = i15;
        this.f57536v0 = i15 + this.f57371T;
        int i22 = this.f57551y0;
        this.f57524t0 = i22;
        int i23 = i22 + this.f57377U;
        this.f57541w0 = i23;
        this.f57276D0 = i23;
        if (mo61104q1()) {
            if (z11) {
                bubbleMaxWidth = this.f57530u0 + getBubbleMaxWidth();
            } else {
                bubbleMaxWidth = (this.f57536v0 - getBubbleMaxWidth()) - this.f57317K;
            }
            this.f57264B0 = bubbleMaxWidth;
        } else {
            if (z11) {
                i16 = this.f57536v0;
            } else {
                i16 = this.f57530u0 - this.f57317K;
            }
            this.f57264B0 = i16;
        }
        this.f57270C0 = this.f57264B0 + this.f57317K;
        if (this.f57522s4 && (i19 = this.f57359R) > 0) {
            int i24 = this.f57541w0 - (i19 / 2);
            int i25 = AbstractC26682c.f126383c;
            int i26 = i24 + i25;
            if (!m60982K1()) {
                this.f57276D0 += AbstractC26682c.f126381a / 2;
            }
            this.f57276D0 += i25;
            i17 = i26;
        } else {
            i17 = 0;
        }
        this.f57282E0 = this.f57276D0 + this.f57365S;
        if (this.f57371T > 0 && this.f57377U > 0) {
            mo61055e2(this.f57530u0, this.f57524t0, this.f57536v0, this.f57541w0, z11);
        }
        if (mo60961F() && this.f57347P > 0) {
            mo61043b2(this.f57530u0, this.f57546x0, this.f57536v0, this.f57551y0, z11);
        }
        if (mo60981K() && this.f57311J > 0) {
            m61068h2(this.f57556z0, i12, this.f57258A0, i14, z11);
        }
        if (mo60976J() && this.f57317K > 0) {
            int mo61022T0 = mo61022T0(this.f57524t0, this.f57541w0, this.f57323L);
            mo61058f2(this.f57264B0, mo61022T0, this.f57270C0, mo61022T0 + this.f57323L, z11);
        }
        if (mo60971I() && this.f57365S > 0) {
            mo61048c2(this.f57530u0, this.f57276D0, this.f57536v0, this.f57282E0, z11);
        }
        if (this.f57522s4 && (i18 = this.f57359R) > 0) {
            m61095o2(this.f57530u0, i17, this.f57536v0, i17 + i18, z11);
        }
        if (mo60951C1()) {
            m61091n2();
        }
    }

    /* renamed from: l3 */
    protected boolean m61083l3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 != 1 || !this.f57465j1 || !m61038Z0(f11, f12)) {
                return false;
            }
            m60909M2();
            return true;
        }
        if (!this.f57447g1 || !m61038Z0(f11, f12)) {
            z11 = false;
        }
        this.f57465j1 = z11;
        return z11;
    }

    /* renamed from: m0 */
    void m61084m0(Canvas canvas) {
        C28769a c28769a;
        try {
            float f11 = f57230e6 / 2.0f;
            canvas.save();
            canvas.translate(this.f57435e1, this.f57441f1);
            canvas.drawCircle(f11, f11, f11, f57255z5);
            if (this.f57453h1) {
                this.f57499o5 = m60990M0(AbstractC22055v0.m115115E(this.f57263B.m94862C4(), getDelegate().mo62071Y3()));
                setStateLoadingStory(AbstractC22055v0.m115112B(this.f57263B.m94862C4()));
                if (this.f57499o5 != null && (c28769a = this.f57269C) != null) {
                    if (this.f57523s5) {
                        float f12 = (c28769a.f133326v + 2.0f) % 360.0f;
                        c28769a.f133326v = f12;
                        canvas.rotate(f12, f11, f11);
                    }
                    canvas.drawCircle(f11, f11, f57220U6 + f11 + 1.0f, this.f57499o5);
                    if (this.f57523s5) {
                        postInvalidateDelayed(100L);
                    }
                }
            }
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m1 */
    protected boolean m61085m1(float f11, float f12) {
        try {
            if (f11 < this.f57301H1 || f11 > r1 + AbstractC11531v0.m62123C3().getIntrinsicWidth()) {
                return false;
            }
            if (f12 < this.f57307I1) {
                return false;
            }
            if (f12 > r4 + AbstractC11531v0.m62123C3().getIntrinsicHeight()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: m2 */
    public void mo61086m2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        C29385c c29385c;
        C29384b c29384b;
        C29384b c29384b2;
        C29383a c29383a;
        if (this.f57291F3 && (c29383a = this.f57297G3) != null) {
            i15 = c29383a.m146523b() + i12;
        } else {
            i15 = i12;
        }
        if (this.f57261A3 && (c29384b2 = this.f57279D3) != null) {
            c29384b2.m146532i(this.f57560z4.getPaddingLeft() + i11, i12, i13 - this.f57560z4.getPaddingRight(), i14, i15);
            i15 += this.f57279D3.m146531h();
        }
        if (this.f57267B3 && (c29384b = this.f57285E3) != null) {
            c29384b.m146532i(this.f57560z4.getPaddingLeft() + i11, i12, i13 - this.f57560z4.getPaddingRight(), i14, i15);
            i15 += this.f57285E3.m146531h();
        }
        int i16 = i15;
        if (this.f57508q2 && (c29385c = this.f57514r2) != null) {
            c29385c.m146545g(i11, i12, i13, i14, i16);
            this.f57514r2.m146543e();
        }
    }

    /* renamed from: m3 */
    protected boolean m61087m3(MotionEvent motionEvent, int i11, float f11, float f12) {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowBase
    /* renamed from: n */
    public void mo61088n() {
        if (this.f57534u4) {
            if (!this.f57263B.m95075Z7()) {
                ToastUtils.showMess(true, getContext().getString(AbstractC8020f0.str_can_not_react));
                return;
            } else {
                this.f57549x3.mo62097p4(this.f57263B, getReactionCoords(), getReactionPickerDirection());
                return;
            }
        }
        if (this.f57465j1) {
            this.f57549x3.mo62070X3(this);
        } else {
            this.f57549x3.mo62090j4(this, null);
        }
    }

    /* renamed from: n0 */
    protected void mo61089n0(Canvas canvas) {
        if (this.f57501p1 && !mo61001O3()) {
            m60977J0(canvas, false);
            if (this.f57537v1) {
                m60972I0(canvas);
            }
        }
        if (this.f57333M3) {
            Drawable refBackgroundDrawable = getRefBackgroundDrawable();
            int i11 = this.f57450g4;
            int i12 = this.f57456h4;
            refBackgroundDrawable.setBounds(i11, i12, this.f57438e4 + i11, this.f57444f4 + i12);
            refBackgroundDrawable.draw(canvas);
            RectF rectF = this.f57266B2;
            float f11 = this.f57375T3;
            canvas.drawRoundRect(rectF, f11, f11, f57208O6);
            this.f57474k4.m76325a(canvas);
            if (this.f57504p4) {
                Drawable m62152I2 = AbstractC11531v0.m62152I2();
                int i13 = this.f57510q4;
                m62152I2.setBounds(i13, this.f57516r4, AbstractC11531v0.m62152I2().getIntrinsicWidth() + i13, this.f57516r4 + AbstractC11531v0.m62152I2().getIntrinsicHeight());
                AbstractC11531v0.m62152I2().draw(canvas);
            }
            if (this.f57263B.mo17221h()) {
                this.f57486m4.m77067f(this.f57492n4, this.f57498o4);
                this.f57486m4.m77062a(canvas);
            }
            if (this.f57381U3 != null) {
                canvas.save();
                canvas.translate(this.f57387V3, this.f57393W3);
                this.f57381U3.draw(canvas);
                canvas.restore();
            }
            if (this.f57403Y3 != null) {
                canvas.save();
                canvas.translate(this.f57408Z3, this.f57414a4);
                this.f57403Y3.draw(canvas);
                canvas.restore();
            }
        }
    }

    /* renamed from: n1 */
    public boolean m61090n1(float f11, float f12) {
        int m118742r = AbstractC23136l9.m118742r(5.0f);
        int i11 = this.f57358Q4;
        if (f11 >= i11 - m118742r) {
            int i12 = f57222W5;
            if (f11 <= i11 + i12 + m118742r) {
                int i13 = this.f57364R4;
                if (f12 >= i13 - m118742r && f12 <= i13 + i12 + m118742r) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n2 */
    public void m61091n2() {
        if (this.f57404Y4 != null) {
            Point mo61061g0 = mo61061g0();
            this.f57409Z4 = mo61061g0;
            this.f57404Y4.m88400d(mo61061g0.x, mo61061g0.y);
        }
    }

    /* renamed from: n3 */
    protected boolean m61092n3(MotionEvent motionEvent, int i11, float f11, float f12) {
        return false;
    }

    /* renamed from: o0 */
    public void mo61093o0(Canvas canvas, int i11, int i12, int i13, int i14) {
        C30799a m62193R1 = AbstractC11531v0.m62193R1();
        m62193R1.m149863a(getBubbleBackgroundType(), mo60998O0(this.f57263B.m94987Q7(), m61099p1(), mo61124x1(), m61016S()));
        int backgroundTopRegionHeight = getBackgroundTopRegionHeight();
        if (mo61124x1()) {
            int i15 = f57215S5;
            m62193R1.m149865u(i11 - i15, i12 - i15, i13 + i15, i14 + i15, backgroundTopRegionHeight);
        } else {
            m62193R1.m149865u(i11, i12, i13, i14, backgroundTopRegionHeight);
        }
        m62193R1.draw(canvas);
        this.f57399X4 = m62193R1.m149864c();
    }

    /* renamed from: o1 */
    protected boolean m61094o1(float f11, float f12) {
        if (this.f57331M1 != null && f11 >= r0.m76049i() && f11 <= this.f57331M1.m76054n() && f12 >= this.f57331M1.m76056p() && f12 <= this.f57331M1.m76045e()) {
            return true;
        }
        return false;
    }

    /* renamed from: o2 */
    public void m61095o2(int i11, int i12, int i13, int i14, boolean z11) {
        C22405g c22405g = this.f57528t4;
        if (c22405g != null) {
            c22405g.m115824I(i13 - c22405g.m115841p(), i12);
        }
    }

    /* renamed from: o3 */
    public boolean mo61096o3(MotionEvent motionEvent, int i11, float f11, float f12) {
        if (i11 == 0) {
            return m61040a1(f11, f12);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTranslationX(f57179A5);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f57263B == null) {
            AbstractC23350e.m122774d("ChatRow", "onDraw: message is null");
        } else {
            if (this.f57293G <= 0) {
                return;
            }
            if (this.f57329M > 0 && this.f57335N > 0) {
                m61123x0(canvas);
            }
            m60944z0(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        try {
            accessibilityNodeInfo.setCheckable(false);
            String str = getMsgHeaderTalkText() + "\n" + getMsgContentTalkText() + "\n" + getMsgFooterTalkText();
            if (!TextUtils.isEmpty(str)) {
                accessibilityNodeInfo.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (getDelegate().mo62101s4() == 3) {
            this.f57306I0 = mo61096o3(motionEvent, action, x11, y11);
        } else {
            this.f57312J0 = mo61101p3(motionEvent, x11, y11, action);
        }
        if (!this.f57306I0 && !this.f57312J0 && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowBase, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11 || this.f57434e0) {
            this.f57434e0 = false;
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            C17945a0 c17945a0 = this.f57263B;
            if (c17945a0 != null && c17945a0.m94987Q7()) {
                z12 = true;
            } else {
                z12 = false;
            }
            m61074j2(0, 0, i15, i16, z12);
            mo61005P2();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int i13 = this.f57446g0;
        int size = View.MeasureSpec.getSize(i11);
        this.f57446g0 = size;
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && (!this.f57440f0 || i13 != size)) {
            mo60975I3(c17945a0, this.f57269C, getBubbleMaxWidth());
            m60908F2(this.f57263B);
            mo61009Q2();
            this.f57440f0 = true;
        }
        setMeasuredDimension(this.f57446g0, this.f57293G);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x012c A[Catch: Exception -> 0x009f, TRY_LEAVE, TryCatch #0 {Exception -> 0x009f, blocks: (B:7:0x000e, B:19:0x012c, B:24:0x0121, B:60:0x007f, B:62:0x0093, B:64:0x0097, B:67:0x00a4, B:69:0x00ad, B:71:0x00b1, B:74:0x00ba, B:76:0x00c3, B:78:0x00c7, B:81:0x00d0, B:83:0x00d9, B:85:0x00dd, B:88:0x00e4, B:90:0x00e9, B:92:0x00ef, B:108:0x0111, B:110:0x0115), top: B:6:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        boolean z16 = true;
        if (!this.f57312J0 && !this.f57306I0) {
            z11 = false;
        } else {
            z11 = true;
        }
        try {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (getDelegate().mo62101s4() != 3) {
                if (action != 0) {
                    if (action != 1 && action != 2 && action != 3) {
                        z15 = z11;
                    } else {
                        try {
                            if (this.f57312J0) {
                                mo61101p3(motionEvent, x11, y11, action);
                            } else if (this.f57318K0) {
                                m61092n3(motionEvent, action, x11, y11);
                            } else if (this.f57324L0) {
                                m61087m3(motionEvent, action, x11, y11);
                            } else if (this.f57330M0) {
                                mo61069h3(motionEvent, action, x11, y11);
                            } else if (this.f57336N0) {
                                mo61072i3(motionEvent, action, x11, y11);
                            } else if (this.f57342O0) {
                                m61083l3(motionEvent, action, x11, y11);
                            } else if (this.f57348P0) {
                                mo61079k3(motionEvent, action, x11, y11);
                            } else if (this.f57354Q0) {
                                mo61075j3(motionEvent, action, x11, y11);
                            }
                            if (this.f57360R0) {
                                if (action == 1) {
                                    mo60995N2();
                                }
                                z15 = true;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    }
                } else {
                    boolean m61092n3 = m61092n3(motionEvent, action, x11, y11);
                    this.f57318K0 = m61092n3;
                    boolean z17 = z11 | m61092n3;
                    boolean m61087m3 = m61087m3(motionEvent, action, x11, y11);
                    this.f57324L0 = m61087m3;
                    boolean z18 = z17 | m61087m3;
                    if (mo60961F() && this.f57347P > 0 && mo61069h3(motionEvent, action, x11, y11)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f57330M0 = z12;
                    boolean z19 = z18 | z12;
                    if (mo60971I() && this.f57365S > 0 && mo61072i3(motionEvent, action, x11, y11)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f57336N0 = z13;
                    boolean z21 = z19 | z13;
                    if (mo60981K() && this.f57311J > 0 && m61083l3(motionEvent, action, x11, y11)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f57342O0 = z14;
                    boolean z22 = z21 | z14;
                    if (mo60976J() && this.f57317K > 0 && mo61079k3(motionEvent, action, x11, y11)) {
                        z15 = true;
                    }
                    this.f57348P0 = z15;
                    boolean z23 = z22 | z15;
                    if (!z23 && m61040a1(x11, y11)) {
                        boolean mo61075j3 = mo61075j3(motionEvent, action, x11, y11);
                        this.f57354Q0 = mo61075j3;
                        this.f57360R0 = !mo61075j3;
                        z15 = true;
                    } else {
                        z15 = z23;
                    }
                    try {
                        if (mo60983K3()) {
                            m61181r();
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z16 = z15;
                    }
                }
                z11 = z15;
                if (action != 3 || action == 1) {
                    mo60947A3();
                    m61180l();
                    invalidate();
                }
                if (!z11) {
                    invalidate();
                    return z11;
                }
                return z11;
            }
            if (action == 1 || action == 2 || action == 3) {
                if (this.f57306I0 && mo61096o3(motionEvent, action, x11, y11)) {
                    z15 = true;
                }
                z11 = z15;
            }
            if (action != 3) {
            }
            mo60947A3();
            m61180l();
            invalidate();
            if (!z11) {
            }
        } catch (Exception e13) {
            e = e13;
            z16 = z11;
        }
        e = e13;
        z16 = z11;
        e.printStackTrace();
        return z16;
    }

    @Override // w50.C28770b.a
    /* renamed from: p */
    public void mo61097p(C17945a0 c17945a0, boolean z11) {
        if (this.f57263B == c17945a0 && z11) {
            c17945a0.m95045W9(this.f57268B4);
            ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.o
                public /* synthetic */ RunnableC11506o() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRow.this.m60919X1();
                }
            });
        }
    }

    /* renamed from: p0 */
    public void mo61098p0(Canvas canvas) {
        Paint paint;
        RectF rectF;
        List list;
        if (this.f57298G4 && (list = this.f57286E4) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C13646i) it.next()).m76258d(canvas);
            }
        }
        if (m60982K1()) {
            m60967H0(canvas, false);
        }
        if (m61006P3() && (rectF = this.f57490n2) != null && rectF.height() > f57179A5) {
            long m95260t4 = this.f57263B.m95260t4();
            if (m95260t4 > 0) {
                m60913T3(m95260t4);
                canvas.save();
                canvas.translate(this.f57496o2, this.f57502p2);
                RectF rectF2 = this.f57490n2;
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f57490n2.height() / 2.0f, f57244s6);
                canvas.restore();
                canvas.drawText(this.f57448g2, this.f57466j2, this.f57472k2, f57245t6);
                if (m95260t4 < 60000) {
                    postInvalidateDelayed(m95260t4 % 1000);
                } else {
                    postInvalidateDelayed(m95260t4 % 60000);
                }
            }
        }
        if (this.f57425c3 && !m60978J1()) {
            if (this.f57431d3) {
                m60907F0(canvas);
                return;
            }
            canvas.save();
            canvas.translate(this.f57467j3, this.f57473k3);
            f57190F6.setAlpha((int) (f57228c6 * 1.0f * this.f57355Q1));
            f57188E6.setAlpha((int) (f57227b6 * 1.0f * this.f57355Q1));
            RectF rectF3 = this.f57437e3;
            float height = rectF3.height() / 2.0f;
            float height2 = this.f57437e3.height() / 2.0f;
            if (this.f57419b3) {
                paint = f57190F6;
            } else {
                paint = f57188E6;
            }
            canvas.drawRoundRect(rectF3, height, height2, paint);
            canvas.restore();
            Drawable drawable = this.f57491n3;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f57355Q1 * 255.0f));
                AbstractC28236y3.m142204o(this.f57491n3, this.f57479l3, this.f57485m3).draw(canvas);
            }
            f57184C6.setAlpha((int) (f57226a6 * 1.0f * this.f57355Q1));
            canvas.drawText(this.f57461i3, this.f57443f3, this.f57449g3, f57184C6);
        }
    }

    /* renamed from: p1 */
    public boolean m61099p1() {
        return this.f57360R0;
    }

    /* renamed from: p2 */
    void mo61100p2() {
        try {
            AbstractC3972e.m18781f0(this.f57559z3);
            this.f57372T0 = this.f57411a1;
            if (!m60992M3()) {
                return;
            }
            if (this.f57263B.m94987Q7() && C23302b.f113247a.m120523d(this.f57423c1)) {
                int m12307a = C2343e.m12307a(this.f57263B.m94862C4(), false);
                C16640q2 mo88412f = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(this.f57495o1), m12307a);
                this.f57417b1 = mo88412f;
                this.f57372T0 = mo88412f;
                this.f57429d1 = true;
            } else if (m60988L3() || C23999j.m125696L2(this.f57423c1, C23278z2.m120143n())) {
                ((C23528a) this.f57275D.m123612r(this.f57559z3)).m123579C(this.f57423c1, C23278z2.m120143n(), new C11337l());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p3 */
    public boolean mo61101p3(MotionEvent motionEvent, float f11, float f12, int i11) {
        boolean z11;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                if (this.f57534u4 && m61062g1(f11, f12)) {
                    getDelegate().mo62040G4(this);
                    return true;
                }
                if (this.f57540v4 && m61067h1(f11, f12)) {
                    getDelegate().mo62047J4(this.f57263B, getReactionMsgInfo());
                    return true;
                }
            }
            return false;
        }
        if (this.f57522s4 && m61062g1(f11, f12)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57534u4 = z11;
        if (!this.f57522s4 || !m61067h1(f11, f12)) {
            z12 = false;
        }
        this.f57540v4 = z12;
        return z12 | z11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowBase
    /* renamed from: q */
    protected void mo61102q() {
        getDelegate().mo62107y4(this);
    }

    /* renamed from: q0 */
    public void mo61103q0(Canvas canvas) {
        List list;
        if (this.f57533u3) {
            m60945A0(canvas);
        }
        if (this.f57292F4 && (list = this.f57280D4) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C13646i) it.next()).m76258d(canvas);
            }
        }
        if (m60986L1()) {
            m60967H0(canvas, true);
        }
    }

    /* renamed from: q1 */
    protected boolean mo61104q1() {
        return false;
    }

    /* renamed from: q2 */
    void m61105q2(List list) {
        int m12307a;
        if (list != null && list.size() != 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                try {
                    ContactProfile contactProfile = (ContactProfile) list.get(i11);
                    String str = contactProfile.f42446v;
                    if (str != null && !str.isEmpty()) {
                        C3977j c3977j = (C3977j) this.f57390W0.get(str);
                        if (c3977j == null) {
                            c3977j = new C3977j(getContext());
                            this.f57390W0.remove(str);
                            this.f57390W0.put(str, c3977j);
                        }
                        AbstractC3972e.m18781f0(c3977j);
                        if (C23302b.f113247a.m120523d(str)) {
                            String m40418n0 = contactProfile.m40418n0();
                            if (m40418n0.isEmpty()) {
                                m12307a = C23212s8.m119607o(getContext(), AbstractC16781w.AvatarPlaceHolderColor);
                            } else {
                                m12307a = C2343e.m12307a(contactProfile.f42434r, false);
                            }
                            this.f57378U0.remove(contactProfile.mo2478b());
                            this.f57378U0.put(contactProfile.mo2478b(), C16640q2.m88404a().mo88412f(m40418n0, m12307a));
                        } else if (m60988L3() || C23999j.m125696L2(str, C23278z2.m120081L0())) {
                            ((C23528a) this.f57275D.m123612r(c3977j)).m123579C(str, C23278z2.m120081L0(), new C11338m(str, contactProfile));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: q3 */
    protected void m61106q3() {
        this.f57549x3.mo62037E4(this);
    }

    /* renamed from: r0 */
    public void mo61107r0(Canvas canvas) {
        if (this.f57371T <= 0 && this.f57377U <= 0) {
            return;
        }
        mo61049c3(canvas);
        if (this.f57383V > 0 && this.f57389W > 0) {
            mo61117v0(canvas);
        }
        if (this.f57422c0 > 0 && this.f57428d0 > 0) {
            mo61111t0(canvas);
        }
        if (this.f57410a0 > 0 && this.f57416b0 > 0) {
            mo61103q0(canvas);
        }
        m61039Z2(canvas);
    }

    /* renamed from: r2 */
    void m61108r2() {
        try {
            if (this.f57333M3) {
                if (!TextUtils.isEmpty(this.f57351P3)) {
                    C24003n m120068F = C23278z2.m120068F();
                    if (C23999j.m125696L2(this.f57351P3, m120068F)) {
                        C3979l m123606l = this.f57275D.m123606l(this.f57351P3, m120068F.f116260a, m120068F.f116263d, m120068F.f116266g);
                        if (m123606l != null) {
                            this.f57357Q3 = true;
                            C3977j c3977j = this.f57468j4;
                            if (c3977j != null) {
                                c3977j.setImageInfo(m123606l, false);
                            }
                            this.f57474k4.m76334m(m123606l.m18839c(), false);
                            invalidate();
                            return;
                        }
                        return;
                    }
                    this.f57474k4.m76331h();
                    if (!m60973I1()) {
                        ((C23528a) this.f57275D.m123612r(this.f57468j4)).m123579C(this.f57351P3, m120068F, new C11326a());
                        return;
                    }
                    return;
                }
                this.f57474k4.m76331h();
                invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s0 */
    public void mo61109s0(Canvas canvas) {
        Drawable m62123C3;
        C21197a c21197a;
        Paint paint;
        if (this.f57346O4) {
            float f11 = this.f57358Q4;
            int i11 = f57222W5;
            float f12 = f11 + (i11 / 2.0f);
            float f13 = this.f57364R4 + (i11 / 2.0f);
            float f14 = i11 / 2.0f;
            if (this.f57334M4 && this.f57370S4 != null && (paint = f57216S6) != null) {
                canvas.drawCircle(f12, f13, f14, paint);
                this.f57370S4.m91153i(canvas);
            } else if (this.f57340N4 && (c21197a = this.f57376T4) != null) {
                c21197a.m109760b(canvas);
            }
        }
        if (m60965G1() && !mo60962F1()) {
            if (this.f57265B1) {
                AbstractC28236y3.m142204o(AbstractC11531v0.m62351y3(), this.f57552y1, this.f57557z1).draw(canvas);
            } else {
                AbstractC28236y3.m142204o(AbstractC11531v0.m62346x3(), this.f57552y1, this.f57557z1).draw(canvas);
            }
        }
        if (m60968H1()) {
            if (this.f57313J1) {
                m62123C3 = AbstractC11531v0.m62306p3();
            } else {
                m62123C3 = AbstractC11531v0.m62123C3();
            }
            if (m62123C3 != null) {
                AbstractC28236y3.m142204o(m62123C3, this.f57301H1, this.f57307I1);
                m62123C3.draw(canvas);
            }
        }
        if (m61121w1()) {
            if (this.f57277D1) {
                AbstractC28236y3.m142204o(AbstractC11531v0.m62285l2(), this.f57283E1, this.f57289F1).draw(canvas);
                AbstractC11531v0.m62285l2().draw(canvas);
            } else {
                AbstractC28236y3.m142204o(AbstractC11531v0.m62280k2(), this.f57283E1, this.f57289F1).draw(canvas);
            }
        }
        if (m61118v1()) {
            AbstractC28236y3.m142204o(AbstractC11531v0.m62250e2(), this.f57361R1, this.f57367S1).draw(canvas);
        }
    }

    /* renamed from: s3 */
    public boolean m61110s3() {
        C22405g c22405g;
        if (this.f57522s4 && (c22405g = this.f57528t4) != null) {
            c22405g.m115817B();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    public void setDelegate(InterfaceC11530v interfaceC11530v) {
        this.f57549x3 = interfaceC11530v;
    }

    public void setMessage(C28771c c28771c) {
        this.f57257A = c28771c;
        setMessage(c28771c.m143951k());
    }

    public void setRetryVisible(boolean z11) {
        C17945a0 c17945a0;
        this.f57259A1 = z11;
        if (z11 && (c17945a0 = this.f57263B) != null) {
            if (c17945a0.m95139g1() || (this.f57263B.m95043W6() && !m60916V0())) {
                this.f57259A1 = false;
                this.f57388V4 = true;
            }
        }
    }

    public void setSourceAction(String str) {
        f57200K6 = str;
    }

    public void setStateLoadingStory(boolean z11) {
        this.f57523s5 = z11;
        Paint paint = this.f57499o5;
        if (paint != null) {
            if (z11) {
                paint.setPathEffect(this.f57529t5);
            } else {
                paint.setPathEffect(null);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public void setTranslationXAbs(float f11) {
        setTranslationX(f11);
    }

    public void setVoiceDelegate(InterfaceC11339n interfaceC11339n) {
        this.f57554y3 = interfaceC11339n;
    }

    protected void setupReaction(C17945a0 c17945a0) {
        try {
            boolean mo61028W = mo61028W(this.f57257A, c17945a0);
            this.f57522s4 = mo61028W;
            if (mo61028W) {
                if (this.f57528t4 == null) {
                    this.f57528t4 = new C22405g(getContext(), new C11327b());
                }
                mo60957E(this.f57528t4, c17945a0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t0 */
    protected abstract void mo61111t0(Canvas canvas);

    /* renamed from: t1 */
    protected boolean mo61112t1() {
        return true;
    }

    /* renamed from: t3 */
    protected boolean m61113t3(MotionEvent motionEvent) {
        List list = this.f57280D4;
        boolean z11 = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext() && !(z11 = ((C13646i) it.next()).m76260k(motionEvent))) {
            }
        }
        return z11;
    }

    /* renamed from: u0 */
    protected void m61114u0(Canvas canvas) {
        if (this.f57447g1) {
            m61080l0(canvas);
        }
    }

    /* renamed from: u1 */
    protected boolean mo61115u1() {
        return false;
    }

    /* renamed from: u3 */
    protected boolean m61116u3(MotionEvent motionEvent) {
        List list = this.f57286E4;
        boolean z11 = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext() && !(z11 = ((C13646i) it.next()).m76260k(motionEvent))) {
            }
        }
        return z11;
    }

    /* renamed from: v0 */
    public void mo61117v0(Canvas canvas) {
        C13574c3 c13574c3;
        if (this.f57501p1 && mo61001O3()) {
            m60977J0(canvas, true);
            if (this.f57537v1) {
                m60972I0(canvas);
            }
        }
        if (this.f57526t2) {
            RectF rectF = this.f57266B2;
            int i11 = this.f57558z2;
            int i12 = this.f57260A2;
            int i13 = f57252x6;
            int i14 = f57250w6;
            rectF.set(i11, i12, i11 + i13, i12 + i14);
            RectF rectF2 = this.f57266B2;
            float f11 = f57254y6;
            canvas.drawRoundRect(rectF2, f11, f11, f57182B6);
            int i15 = 0;
            if (this.f57320K2 && this.f57308I2 != null) {
                canvas.save();
                canvas.translate(this.f57356Q2, this.f57362R2);
                canvas.clipRect(0, 0, i14, i14);
                this.f57308I2.setAlpha(255);
                Drawable drawable = this.f57308I2;
                int i16 = this.f57368S2;
                int i17 = this.f57374T2;
                drawable.setBounds(i16, i17, this.f57380U2 + i16, this.f57386V2 + i17);
                this.f57308I2.draw(canvas);
                canvas.restore();
            }
            if (this.f57548x2 != null) {
                canvas.save();
                canvas.translate(this.f57332M2, this.f57338N2);
                this.f57548x2.draw(canvas);
                canvas.restore();
                if (this.f57543w2 && AbstractC11531v0.m62197S1() != null) {
                    Drawable m62197S1 = AbstractC11531v0.m62197S1();
                    int i18 = this.f57344O2;
                    int i19 = this.f57350P2;
                    int i21 = f57232g6;
                    m62197S1.setBounds(i18, i19, i18 + i21, i21 + i19);
                    AbstractC11531v0.m62197S1().draw(canvas);
                }
            }
            if (this.f57553y2 != null) {
                canvas.save();
                float f12 = (this.f57558z2 - this.f57296G2) + i13;
                int i22 = f57219U5;
                float f13 = f12 + i22;
                if (this.f57320K2) {
                    i15 = i14 + i22;
                }
                canvas.translate(f13 + i15, this.f57260A2 + AbstractC23136l9.m118742r(19.0f));
                this.f57553y2.draw(canvas);
                canvas.restore();
            }
        }
        if (m61013R1() && (c13574c3 = this.f57331M1) != null) {
            c13574c3.m76044d(canvas);
        }
    }

    /* renamed from: v1 */
    public boolean m61118v1() {
        return this.f57373T1 || this.f57388V4;
    }

    /* renamed from: v3 */
    public void m61119v3(boolean z11) {
        boolean z12;
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null) {
            C28769a mo62079c4 = this.f57549x3.mo62079c4(c17945a0.m95029V3());
            if (!z11) {
                mo61044b3(this.f57263B, mo62079c4);
            }
            m61015R3(this.f57263B, mo62079c4);
            mo61036Y2(this.f57263B, mo62079c4);
            if (this.f57446g0 > 0) {
                mo60975I3(this.f57263B, mo62079c4, getBubbleMaxWidth());
                m60908F2(this.f57263B);
                mo61009Q2();
                int i11 = this.f57446g0;
                int i12 = this.f57293G;
                C17945a0 c17945a02 = this.f57263B;
                if (c17945a02 != null && c17945a02.m94987Q7()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m61074j2(0, 0, i11, i12, z12);
                mo61005P2();
                this.f57434e0 = false;
                invalidate();
            }
        }
    }

    /* renamed from: w0 */
    protected void m61120w0(Canvas canvas) {
    }

    /* renamed from: w1 */
    public boolean m61121w1() {
        if (getBubbleStyle() == 1 || getDelegate().mo62101s4() == 3 || this.f57549x3.mo62086i0() || !mo60993N()) {
            return false;
        }
        return this.f57271C1;
    }

    /* renamed from: w3 */
    public void mo61122w3() {
        this.f57440f0 = false;
        this.f57434e0 = true;
        this.f57419b3 = false;
        this.f57425c3 = false;
        this.f57431d3 = false;
        this.f57487m5 = 0;
        this.f57491n3 = null;
        setRetryVisible(false);
        this.f57373T1 = false;
        this.f57533u3 = false;
        this.f57527t3 = 0;
        this.f57271C1 = false;
        this.f57283E1 = -1;
        this.f57289F1 = -1;
        this.f57295G1 = false;
        this.f57301H1 = -1;
        this.f57307I1 = -1;
        this.f57526t2 = false;
        this.f57543w2 = false;
        this.f57320K2 = false;
        this.f57548x2 = null;
        this.f57553y2 = null;
        this.f57284E2 = 0;
        this.f57290F2 = 0;
        this.f57278D2 = 0;
        this.f57272C2 = 0;
        this.f57326L2 = null;
        this.f57303H3 = null;
        this.f57333M3 = false;
        this.f57438e4 = 0;
        this.f57444f4 = 0;
        this.f57398X3 = 0;
        this.f57420b4 = 0;
        this.f57351P3 = "";
        this.f57339N3 = "";
        this.f57345O3 = "";
        this.f57504p4 = false;
        this.f57522s4 = false;
        this.f57489n1 = null;
        this.f57292F4 = false;
        this.f57298G4 = false;
        this.f57280D4 = null;
        this.f57286E4 = null;
        this.f57382U4 = false;
        C22405g c22405g = this.f57528t4;
        if (c22405g != null) {
            c22405g.m115818C();
        }
        this.f57532u2 = null;
        this.f57429d1 = false;
        this.f57357Q3 = false;
        this.f57274C4 = null;
        this.f57412a2 = false;
        this.f57418b2 = false;
        this.f57424c2 = false;
        this.f57385V1 = "";
        this.f57401Y1 = 0;
        this.f57495o1 = "";
        this.f57501p1 = false;
        this.f57453h1 = false;
        this.f57388V4 = false;
        this.f57454h2 = false;
        this.f57448g2 = "";
        this.f57394W4 = false;
        this.f57319K1 = false;
        C13574c3 c13574c3 = this.f57331M1;
        if (c13574c3 != null) {
            c13574c3.m76061x();
        }
        this.f57537v1 = false;
        this.f57328L4 = false;
        this.f57334M4 = false;
        this.f57340N4 = false;
        this.f57346O4 = false;
        this.f57358Q4 = 0;
        this.f57364R4 = 0;
        C17024o0 c17024o0 = this.f57370S4;
        if (c17024o0 != null) {
            c17024o0.m91159x();
        }
        this.f57415a5 = null;
        C16625n c16625n = this.f57404Y4;
        if (c16625n != null) {
            c16625n.m88398b();
        }
    }

    /* renamed from: x0 */
    protected void m61123x0(Canvas canvas) {
        if (mo60961F() && this.f57347P > 0 && this.f57341O > 0) {
            mo61089n0(canvas);
        }
        if (this.f57371T > 0 && this.f57377U > 0) {
            if (mo61112t1()) {
                mo61093o0(canvas, this.f57530u0, this.f57524t0, this.f57536v0, this.f57541w0);
            }
            if (!mo61115u1()) {
                mo61107r0(canvas);
            }
            if (mo60981K() && this.f57311J > 0) {
                m61114u0(canvas);
            }
            if (mo60976J() && this.f57317K > 0 && !m60910N1()) {
                mo61109s0(canvas);
            }
        }
        if (mo60971I() && this.f57353Q > 0 && this.f57365S > 0) {
            mo61098p0(canvas);
        }
    }

    /* renamed from: x1 */
    public boolean mo61124x1() {
        C28769a c28769a = this.f57269C;
        if (c28769a != null && (c28769a.f133313i || c28769a.f133314j)) {
            return true;
        }
        return false;
    }

    /* renamed from: x2 */
    protected C28227x3 mo61125x2(int i11, int i12, int i13, C28227x3 c28227x3) {
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (this.f57501p1 && !mo61001O3()) {
            if (this.f57537v1) {
                i15 = f57191G5 + f57232g6;
            } else {
                i15 = 0;
            }
            int max = Math.max((i11 - (f57231f6 * 2)) - i15, f57234i6);
            this.f57483m1 = max;
            StaticLayout m60927j0 = m60927j0(this.f57495o1, max);
            this.f57489n1 = m60927j0;
            this.f57483m1 = (int) m60927j0.getLineWidth(0);
            int height = this.f57489n1.getHeight();
            this.f57477l1 = height;
            if (this.f57537v1 && (i16 = f57232g6) > height) {
                this.f57531u1 = AbstractC23136l9.m118745s(getContext(), 3.0f) + ((i16 - this.f57477l1) / 2);
            }
            RectF rectF = new RectF(f57179A5, f57179A5, this.f57483m1 + (r1 * 2) + i15, this.f57477l1 + (this.f57531u1 * 2));
            this.f57525t1 = rectF;
            i17 = Math.max(0, (int) rectF.width());
            i14 = ((f57230e6 - ((int) this.f57525t1.height())) / 2) + ((int) this.f57525t1.height()) + f57195I5;
        } else {
            i14 = 0;
        }
        if (this.f57333M3) {
            m61066h0((i13 - getBubblePaddingLeft()) - getBubblePaddingRight());
            i17 = Math.max(i17, this.f57438e4);
            i14 += this.f57444f4 + f57195I5;
        }
        c28227x3.f131648a = i17;
        c28227x3.f131649b = i14;
        return c28227x3;
    }

    /* renamed from: y0 */
    public void mo61126y0(Canvas canvas) {
        C29383a c29383a;
        C29385c c29385c;
        C29384b c29384b;
        C29384b c29384b2;
        if (this.f57261A3 && (c29384b2 = this.f57279D3) != null) {
            c29384b2.m146530c(canvas);
        }
        if (this.f57267B3 && (c29384b = this.f57285E3) != null) {
            c29384b.m146530c(canvas);
        }
        if (this.f57508q2 && (c29385c = this.f57514r2) != null) {
            c29385c.m146542a(canvas);
        }
        if (this.f57291F3 && (c29383a = this.f57297G3) != null) {
            c29383a.m146522a(canvas);
            invalidate();
        }
    }

    /* renamed from: y1 */
    protected boolean m61127y1() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && this.f57549x3.mo62079c4(c17945a0.m95029V3()).f133315k) {
            return true;
        }
        return false;
    }

    /* renamed from: y2 */
    public C28227x3 mo61128y2(int i11, int i12, int i13, C28227x3 c28227x3) {
        int i14;
        C17945a0 c17945a0;
        List<C13646i> list;
        int i15;
        int i16 = 0;
        if (this.f57298G4 && (list = this.f57286E4) != null) {
            int i17 = f57189F5;
            for (C13646i c13646i : list) {
                if (!mo61112t1()) {
                    i15 = this.f57422c0;
                } else {
                    i15 = i11;
                }
                c13646i.m76263o(i15);
                i17 += c13646i.m76259g();
            }
            i14 = Math.max(0, i11);
            i16 = i17;
        } else {
            i14 = 0;
        }
        if (m60982K1()) {
            if (this.f57442f2 == null) {
                this.f57442f2 = new RectF();
            }
            if (m61016S()) {
                RectF rectF = this.f57442f2;
                int i18 = f57195I5;
                int i19 = f57221V5;
                rectF.set(f57179A5, f57179A5, i18 + i19 + i18 + this.f57401Y1 + f57189F5, Math.max(f57241p6, i19) + (i18 * 2));
            } else {
                RectF rectF2 = this.f57442f2;
                int i21 = f57189F5;
                rectF2.set(f57179A5, f57179A5, this.f57401Y1 + i21 + i21, f57241p6 + (f57195I5 * 2));
            }
            i16 = (int) (i16 + f57205N5 + this.f57442f2.height());
            i14 = Math.max(i14, (int) this.f57442f2.width());
        }
        if (this.f57425c3) {
            if (this.f57431d3) {
                int i22 = f57225Z5;
                getStateRect().set(f57179A5, f57179A5, (i22 + 2) * Math.min(this.f57400Y0.size(), 9), (f57205N5 * 2) + i22);
                i16 = (int) (i16 + getStateRect().height());
                i14 = Math.max(i14, (int) getStateRect().width());
            } else {
                this.f57455h3 = AbstractC23136l9.m118764y0(f57184C6, this.f57461i3);
                RectF stateRect = getStateRect();
                int i23 = f57209P5;
                int i24 = i23 + f57207O5 + i23 + this.f57455h3;
                int i25 = f57189F5;
                stateRect.set(f57179A5, f57179A5, i24 + i25, (i23 * 2) + r2);
                i16 = (int) (i16 + i25 + getStateRect().height());
                i14 = Math.max(i14, (int) getStateRect().width());
            }
        }
        if (m61006P3() && (c17945a0 = this.f57263B) != null) {
            m60913T3(c17945a0.m95260t4());
            RectF rectF3 = this.f57490n2;
            if (rectF3 != null && rectF3.height() > f57179A5) {
                i16 = (int) (i16 + f57205N5 + this.f57490n2.height());
                i14 = Math.max(i14, (int) this.f57490n2.width());
            }
        }
        c28227x3.f131648a = i14;
        c28227x3.f131649b = i16;
        return c28227x3;
    }

    /* renamed from: z1 */
    public boolean mo61129z1() {
        C28769a c28769a = this.f57269C;
        if (c28769a != null && c28769a.f133329y) {
            return true;
        }
        return false;
    }

    /* renamed from: z2 */
    public C28227x3 mo61130z2(int i11, int i12, int i13, C28227x3 c28227x3) {
        boolean z11;
        int i14;
        List list;
        int bubblePaddingLeft = getBubblePaddingLeft();
        int bubblePaddingRight = getBubblePaddingRight();
        boolean z12 = true;
        if (this.f57533u3) {
            this.f57527t3 = (((i11 - bubblePaddingLeft) - bubblePaddingRight) - AbstractC11531v0.m62340w2().getIntrinsicWidth()) - AbstractC23136l9.m118742r(8.0f);
            StaticLayout m119625l = AbstractC23214t.m119625l(this.f57263B.m94921J2(), f57194H6, this.f57527t3, 1);
            this.f57303H3 = m119625l;
            i14 = (f57189F5 * 2) + m119625l.getHeight();
            z11 = true;
        } else {
            z11 = false;
            i14 = 0;
        }
        if (this.f57292F4 && (list = this.f57280D4) != null && list.size() > 0) {
            if (mo60987L2() || !((C13646i) this.f57280D4.get(0)).m76256a()) {
                i14 += f57189F5;
            }
            for (C13646i c13646i : this.f57280D4) {
                c13646i.m76263o(i11);
                i14 += c13646i.m76259g();
            }
        }
        if (m60986L1()) {
            if (m61016S()) {
                int i15 = f57221V5;
                i11 = Math.max(i11, f57195I5 + i15 + this.f57401Y1 + getBubblePaddingLeft() + getBubblePaddingRight());
                i14 += f57189F5 + Math.max(f57241p6, i15);
            } else {
                i11 = Math.max(i11, this.f57401Y1 + getBubblePaddingLeft() + getBubblePaddingRight());
                i14 += f57189F5 + f57241p6;
            }
        } else {
            z12 = z11;
        }
        if (z12) {
            i14 += f57189F5;
        }
        c28227x3.f131648a = i11;
        c28227x3.f131649b = i14;
        return c28227x3;
    }

    /* renamed from: z3 */
    public void mo61131z3() {
        C28769a c28769a = this.f57269C;
        if (c28769a != null) {
            c28769a.f133304B = 0L;
        }
    }

    public ChatRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57281E = false;
        this.f57293G = 0;
        this.f57366S0 = false;
        this.f57378U0 = new HashMap();
        this.f57384V0 = new HashMap();
        this.f57390W0 = new HashMap();
        this.f57395X0 = new ArrayList();
        this.f57400Y0 = new ArrayList();
        this.f57405Z0 = 0;
        this.f57423c1 = "";
        this.f57447g1 = false;
        this.f57453h1 = false;
        this.f57459i1 = false;
        this.f57471k1 = false;
        this.f57495o1 = "";
        this.f57501p1 = false;
        this.f57507q1 = true;
        this.f57531u1 = AbstractC23136l9.m118742r(3.0f);
        this.f57537v1 = false;
        this.f57259A1 = false;
        this.f57271C1 = false;
        this.f57277D1 = false;
        this.f57319K1 = false;
        this.f57325L1 = false;
        this.f57343O1 = false;
        this.f57349P1 = 0L;
        this.f57355Q1 = f57179A5;
        this.f57373T1 = false;
        this.f57379U1 = false;
        this.f57406Z1 = false;
        this.f57412a2 = false;
        this.f57418b2 = false;
        this.f57424c2 = false;
        this.f57508q2 = false;
        this.f57526t2 = false;
        this.f57543w2 = false;
        this.f57266B2 = new RectF();
        this.f57272C2 = 0;
        this.f57278D2 = 0;
        this.f57461i3 = "";
        this.f57503p3 = false;
        this.f57559z3 = new C3977j(getContext());
        this.f57273C3 = C29384b.m146529g();
        this.f57363R3 = AbstractC23136l9.m118742r(3.0f);
        this.f57369S3 = AbstractC23136l9.m118742r(70.0f);
        this.f57375T3 = this.f57363R3 / 2.0f;
        this.f57462i4 = AbstractC23136l9.m118742r(8.0f);
        this.f57468j4 = new C3977j(getContext());
        this.f57545w4 = -1;
        this.f57550x4 = -1;
        this.f57555y4 = new RectF();
        this.f57560z4 = this;
        this.f57268B4 = new C28770b();
        this.f57328L4 = false;
        this.f57334M4 = false;
        this.f57340N4 = false;
        this.f57346O4 = false;
        this.f57352P4 = false;
        this.f57358Q4 = 0;
        this.f57364R4 = 0;
        this.f57382U4 = false;
        this.f57388V4 = false;
        this.f57394W4 = false;
        this.f57399X4 = 0;
        this.f57421b5 = new C28227x3(0, 0);
        this.f57427c5 = false;
        this.f57433d5 = false;
        this.f57439e5 = new ArrayList();
        this.f57445f5 = false;
        this.f57451g5 = -1.0f;
        this.f57457h5 = -1.0f;
        this.f57475k5 = 250L;
        this.f57481l5 = 130L;
        this.f57487m5 = 0;
        this.f57493n5 = false;
        this.f57523s5 = false;
        this.f57535u5 = new C11329d();
        setWillNotDraw(false);
        if (!f57247v5 || f57249w5) {
            m61032X0();
            f57247v5 = true;
            f57249w5 = false;
        }
        this.f57275D = new C23528a(getContext());
        this.f57411a1 = C23278z2.m120143n().f116261b;
        C13658k c13658k = new C13658k(this);
        this.f57474k4 = c13658k;
        c13658k.m76343v(false);
        C13658k c13658k2 = this.f57474k4;
        int i11 = this.f57369S3;
        c13658k2.m76337p(i11, i11);
        this.f57486m4 = new C13804v0(this);
    }

    public final void setMessage(C17945a0 c17945a0) {
        C28769a mo62079c4 = this.f57549x3.mo62079c4(c17945a0.m95029V3());
        mo61044b3(c17945a0, mo62079c4);
        if (this.f57263B != c17945a0 || mo61034Y(getDelegate().mo62096o4(), getDelegate().mo62101s4()) || mo61046c0(c17945a0, mo62079c4) || (c17945a0.m94930K3() != null && !c17945a0.m94930K3().equals(this.f57268B4))) {
            this.f57268B4.m143917j(c17945a0.m94930K3());
            m61015R3(c17945a0, mo62079c4);
        }
        mo61031X(c17945a0);
        if (this.f57440f0) {
            mo61036Y2(c17945a0, mo62079c4);
        }
    }
}
