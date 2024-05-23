package zm.voip.p721ui.incall;

import ac.C0697c0;
import ac.C0722p;
import ac.InterfaceC0724q;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Rational;
import android.view.Display;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.AbstractC1388a;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1623z0;
import androidx.core.view.C1580n1;
import androidx.core.view.C1593q2;
import androidx.core.view.C1598s;
import androidx.core.view.InterfaceC1551g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import bi0.AbstractC2808b;
import bp0.AbstractC3082b0;
import bp0.AbstractC3085d;
import bp0.AbstractC3087e;
import bp0.AbstractC3096i0;
import bp0.AbstractC3098j0;
import bp0.AbstractC3103o;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import bp0.AbstractC3106r;
import bp0.AbstractC3108t;
import ck0.C3568b;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC10923u;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.chat.widget.photosuggest.NewPhotoSuggestView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.C13700o2;
import com.zing.zalo.p077ui.widget.RobotoChronometer;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.p077ui.widget.liveemoji.C13686a;
import com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton;
import com.zing.zalo.startup.StartupApplication;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17927b;
import dg0.AbstractC17930e;
import dp0.AbstractC18044d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import ep0.C18556p;
import gp0.C19548i;
import gp0.C19561o0;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;
import jo0.C21326d;
import jo0.C21336n;
import kg.AbstractC21705b;
import kg.C21709f;
import kg.C21715l;
import ko0.C21788c;
import lk0.InterfaceC22508f;
import lo0.C22598f;
import lo0.C22626t;
import me0.AbstractC23034c6;
import me0.AbstractC23067f6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23222t7;
import me0.AbstractC23280z4;
import me0.C23212s8;
import me0.C23269y3;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mo0.EnumC23411b;
import nh0.C23793c;
import nj0.AbstractC23803b;
import no0.ViewOnClickListenerC23921f;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import oo0.AbstractViewOnTouchListenerC24388c;
import org.json.JSONObject;
import org.webrtc.EglRenderer;
import org.webrtc.ICallbackSurfaceViewCreated;
import org.webrtc.OnNextRenderCallback;
import org.webrtc.TextureViewRenderer;
import org.webrtc.ViewRenderListener;
import p019aj.C0874h;
import p097db.C17843b;
import p097db.EnumC17859r;
import p133ek.AbstractC18458a;
import p173fz.C19172a;
import p262jb.AbstractC21196a;
import p266jg.AbstractC21245c;
import p306ku.AbstractC21943a;
import p308kx.C21965i;
import p321le.C22456g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p354n3.C23528a;
import p361nb.C23648e;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p394oj.C24277c;
import p471r3.C25630b;
import p588vw.C28644j;
import p659xv.C30209h;
import p716zh.C32150v9;
import pj0.AbstractC24788n;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24785k;
import pm0.C24848g0;
import qi0.C25297f;
import qi0.EnumC25294c;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25739e;
import ro0.C25937a;
import ro0.C25948l;
import sa0.C26203c;
import so0.C26350a;
import to0.InterfaceC26862g;
import to0.InterfaceC26863h;
import ui0.C27280g;
import uo0.AbstractC27351a;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.C28020b3;
import vg.C28181s2;
import vg.C28212v6;
import vo0.AbstractC28386c;
import vo0.AbstractC28394d;
import wo0.C29161o1;
import zm.voip.dialog.KeyboardDTMFView;
import zm.voip.dialog.NotRecordAlertView;
import zm.voip.dialog.SpeakerChooserDialog;
import zm.voip.p721ui.StickerPanelView;
import zm.voip.p721ui.incall.BottomCallView;
import zm.voip.p721ui.incall.C32457b;
import zm.voip.p721ui.incall.ZmInCallActivity;
import zm.voip.p721ui.views.callconfig.CallConfigView;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32252b;
import zm.voip.service.C32257b4;
import zm.voip.service.C32318n3;
import zm.voip.service.C32319o;
import zm.voip.service.HeadsetButtonReceiver;
import zm.voip.service.VoipAudioHelper;
import zm.voip.widgets.CallStickerView;
import zm.voip.widgets.CircleBackgroundAnswer;
import zm.voip.widgets.CircleBackgroundImageView;
import zm.voip.widgets.CircleBackgroundView;
import zm.voip.widgets.CircleIconLoadingView;
import zm.voip.widgets.CircularProgressIndicator;
import zm.voip.widgets.GestureBottomLayout;
import zm.voip.widgets.MarqueeTextView;
import zm.voip.widgets.RingBackTonePreviewView;
import zm.voip.widgets.SpringCallView;
import zm.voip.widgets.VoIPButtonWithText;
import zm.voip.widgets.moduleviews.ToastCountdownCustomView;
import zo0.EnumC32540i;

@SuppressLint({"ClickableViewAccessibility", "DefaultLocale", "RtlHardcoded"})
/* loaded from: classes7.dex */
public class ZmInCallActivity extends ZaloActivity implements InterfaceC26863h, C32457b.a, C23744a.c, ICallbackSurfaceViewCreated, C28644j.p, InterfaceC0724q {

    /* renamed from: A0 */
    LinearLayoutManager f149523A0;

    /* renamed from: A1 */
    CircleBackgroundView f149524A1;

    /* renamed from: A2 */
    Runnable f149525A2;

    /* renamed from: A3 */
    private C21709f f149526A3;

    /* renamed from: B0 */
    StickerPanelView f149527B0;

    /* renamed from: B1 */
    RelativeLayout f149528B1;

    /* renamed from: B2 */
    ViewOnClickListenerC23921f f149529B2;

    /* renamed from: B3 */
    private C21709f f149530B3;

    /* renamed from: C0 */
    ProgressBar f149531C0;

    /* renamed from: C1 */
    RecyclingImageView f149532C1;

    /* renamed from: C2 */
    OrientationEventListener f149533C2;

    /* renamed from: C3 */
    private C21709f f149534C3;

    /* renamed from: D0 */
    LinearLayout f149535D0;

    /* renamed from: D1 */
    AppCompatImageView f149536D1;

    /* renamed from: D2 */
    AnimatorSet f149537D2;

    /* renamed from: D3 */
    private C21709f f149538D3;

    /* renamed from: E0 */
    RobotoTextView f149539E0;

    /* renamed from: E1 */
    CircularProgressIndicator f149540E1;

    /* renamed from: E3 */
    private C21709f f149542E3;

    /* renamed from: F0 */
    RobotoTextView f149543F0;

    /* renamed from: F1 */
    CircleBackgroundView f149544F1;

    /* renamed from: F3 */
    private C21709f f149546F3;

    /* renamed from: G0 */
    LinearLayout f149547G0;

    /* renamed from: G1 */
    RelativeLayout f149548G1;

    /* renamed from: G3 */
    private C21709f f149550G3;

    /* renamed from: H0 */
    RecyclerView f149551H0;

    /* renamed from: H1 */
    RecyclingImageView f149552H1;

    /* renamed from: H3 */
    private C21709f f149554H3;

    /* renamed from: I0 */
    ViewPager f149555I0;

    /* renamed from: I1 */
    AppCompatImageView f149556I1;

    /* renamed from: I3 */
    ValueAnimator f149558I3;

    /* renamed from: J0 */
    C21788c f149559J0;

    /* renamed from: J1 */
    CircularProgressIndicator f149560J1;

    /* renamed from: K0 */
    C21336n f149563K0;

    /* renamed from: K1 */
    AppCompatImageView f149564K1;

    /* renamed from: L0 */
    CallStickerView f149567L0;

    /* renamed from: L1 */
    AppCompatImageView f149568L1;

    /* renamed from: M0 */
    RecyclingImageView f149570M0;

    /* renamed from: M1 */
    MarqueeTextView f149571M1;

    /* renamed from: N0 */
    AppCompatImageView f149573N0;

    /* renamed from: N1 */
    MarqueeTextView f149574N1;

    /* renamed from: O0 */
    AppCompatImageView f149576O0;

    /* renamed from: O1 */
    RobotoTextView f149577O1;

    /* renamed from: O2 */
    private int f149578O2;

    /* renamed from: P0 */
    AppCompatImageView f149579P0;

    /* renamed from: P1 */
    LinearLayout f149580P1;

    /* renamed from: Q0 */
    MarqueeTextView f149582Q0;

    /* renamed from: Q1 */
    CircleBackgroundImageView f149583Q1;

    /* renamed from: R0 */
    AppCompatImageView f149585R0;

    /* renamed from: R1 */
    CircleBackgroundImageView f149586R1;

    /* renamed from: S */
    FrameLayout f149588S;

    /* renamed from: S0 */
    LinearLayout f149589S0;

    /* renamed from: S1 */
    TextView f149590S1;

    /* renamed from: T */
    View.OnLayoutChangeListener f149592T;

    /* renamed from: T0 */
    ViewSwitcher f149593T0;

    /* renamed from: T1 */
    RecyclingImageView f149594T1;

    /* renamed from: U */
    FrameLayout f149596U;

    /* renamed from: U0 */
    LinearLayout f149597U0;

    /* renamed from: U1 */
    RecyclingImageView f149598U1;

    /* renamed from: V */
    FrameLayout f149600V;

    /* renamed from: V0 */
    MarqueeTextView f149601V0;

    /* renamed from: V1 */
    KeyboardDTMFView f149602V1;

    /* renamed from: W */
    FrameLayout f149604W;

    /* renamed from: W0 */
    TextView f149605W0;

    /* renamed from: W1 */
    private BottomCallView f149606W1;

    /* renamed from: X */
    TextureViewRenderer f149608X;

    /* renamed from: X0 */
    Chronometer f149609X0;

    /* renamed from: X1 */
    private GestureBottomLayout f149610X1;

    /* renamed from: Y */
    RecyclingImageView f149612Y;

    /* renamed from: Y0 */
    CircleBackgroundImageView f149613Y0;

    /* renamed from: Y1 */
    private LinearLayout f149614Y1;

    /* renamed from: Y2 */
    boolean f149615Y2;

    /* renamed from: Z */
    LinearLayout f149616Z;

    /* renamed from: Z0 */
    LinearLayout f149617Z0;

    /* renamed from: Z1 */
    private AppCompatImageView f149618Z1;

    /* renamed from: Z2 */
    boolean f149619Z2;

    /* renamed from: a0 */
    ProgressBar f149620a0;

    /* renamed from: a1 */
    RecyclingImageView f149621a1;

    /* renamed from: a2 */
    private RobotoTextView f149622a2;

    /* renamed from: b0 */
    CircleIconLoadingView f149624b0;

    /* renamed from: b1 */
    RobotoTextView f149625b1;

    /* renamed from: b2 */
    private RobotoTextView f149626b2;

    /* renamed from: c0 */
    AppCompatImageView f149628c0;

    /* renamed from: c1 */
    RingBackTonePreviewView f149629c1;

    /* renamed from: c2 */
    private RobotoTextView f149630c2;

    /* renamed from: d0 */
    RobotoTextView f149632d0;

    /* renamed from: d1 */
    LinearLayout f149633d1;

    /* renamed from: d2 */
    ZmInCallDebug f149634d2;

    /* renamed from: e0 */
    Button f149636e0;

    /* renamed from: e1 */
    RobotoTextView f149637e1;

    /* renamed from: e2 */
    TextView f149638e2;

    /* renamed from: f0 */
    LinearLayout f149640f0;

    /* renamed from: f1 */
    View f149641f1;

    /* renamed from: g0 */
    AppCompatImageView f149644g0;

    /* renamed from: g1 */
    RobotoTextView f149645g1;

    /* renamed from: h0 */
    AppCompatImageView f149648h0;

    /* renamed from: h1 */
    View f149649h1;

    /* renamed from: i0 */
    RobotoTextView f149652i0;

    /* renamed from: i1 */
    CircleBackgroundAnswer f149653i1;

    /* renamed from: j0 */
    SpringCallView f149656j0;

    /* renamed from: j1 */
    CircleBackgroundAnswer f149657j1;

    /* renamed from: k0 */
    AppCompatImageView f149660k0;

    /* renamed from: k1 */
    ToastCountdownCustomView f149661k1;

    /* renamed from: k2 */
    C23528a f149662k2;

    /* renamed from: l0 */
    TextureViewRenderer f149664l0;

    /* renamed from: l1 */
    SpeakerChooserDialog f149665l1;

    /* renamed from: l2 */
    C17487o0 f149666l2;

    /* renamed from: m0 */
    RoundedImageView f149668m0;

    /* renamed from: m1 */
    ZaloZinstantLayout f149669m1;

    /* renamed from: m2 */
    C24003n f149670m2;

    /* renamed from: n0 */
    LinearLayout f149672n0;

    /* renamed from: n2 */
    C24003n f149674n2;

    /* renamed from: o0 */
    AppCompatImageView f149676o0;

    /* renamed from: o1 */
    LinearLayout f149677o1;

    /* renamed from: o2 */
    C32457b f149678o2;

    /* renamed from: p0 */
    AppCompatImageView f149680p0;

    /* renamed from: p1 */
    CircleBackgroundImageView f149681p1;

    /* renamed from: p2 */
    AbstractC18044d f149682p2;

    /* renamed from: q0 */
    RobotoTextView f149684q0;

    /* renamed from: q1 */
    VoIPButtonWithText f149685q1;

    /* renamed from: q2 */
    C22626t f149686q2;

    /* renamed from: r0 */
    LinearLayout f149688r0;

    /* renamed from: r1 */
    VoIPButtonWithText f149689r1;

    /* renamed from: r2 */
    C22598f f149690r2;

    /* renamed from: r3 */
    private InterfaceC26862g f149691r3;

    /* renamed from: s0 */
    AppCompatImageView f149692s0;

    /* renamed from: s1 */
    VoIPButtonWithText f149693s1;

    /* renamed from: s2 */
    Drawable f149694s2;

    /* renamed from: s3 */
    private Configuration f149695s3;

    /* renamed from: t0 */
    Chronometer f149696t0;

    /* renamed from: t1 */
    VoIPButtonWithText f149697t1;

    /* renamed from: t2 */
    FrameLayout f149698t2;

    /* renamed from: u0 */
    LinearLayout f149700u0;

    /* renamed from: u1 */
    VoIPButtonWithText f149701u1;

    /* renamed from: v0 */
    MarqueeTextView f149704v0;

    /* renamed from: v1 */
    VoIPButtonWithText f149705v1;

    /* renamed from: v2 */
    private C13306b f149706v2;

    /* renamed from: w0 */
    MarqueeTextView f149708w0;

    /* renamed from: w1 */
    VoIPButtonWithText f149709w1;

    /* renamed from: w2 */
    private ShowcaseView f149710w2;

    /* renamed from: x0 */
    AnimChat f149712x0;

    /* renamed from: x1 */
    VoIPButtonWithText f149713x1;

    /* renamed from: x2 */
    private TooltipView f149714x2;

    /* renamed from: y0 */
    LiveEmojiButton f149716y0;

    /* renamed from: y1 */
    VoIPButtonWithText f149717y1;

    /* renamed from: y2 */
    C13686a f149718y2;

    /* renamed from: z0 */
    CircleBackgroundImageView f149720z0;

    /* renamed from: z1 */
    RobotoTextView f149721z1;

    /* renamed from: z2 */
    private C1598s f149722z2;

    /* renamed from: z3 */
    private C21709f f149723z3;

    /* renamed from: n1 */
    private final C17170o f149673n1 = new C32428k();

    /* renamed from: f2 */
    private final HandlerC32431l0 f149642f2 = new HandlerC32431l0(this);

    /* renamed from: g2 */
    private final AbstractC21705b f149646g2 = C21715l.m112062k();

    /* renamed from: h2 */
    int f149650h2 = 1000;

    /* renamed from: i2 */
    long f149654i2 = System.currentTimeMillis();

    /* renamed from: j2 */
    int f149658j2 = 60;

    /* renamed from: u2 */
    NewPhotoSuggestView f149702u2 = null;

    /* renamed from: E2 */
    volatile boolean f149541E2 = false;

    /* renamed from: F2 */
    volatile boolean f149545F2 = false;

    /* renamed from: G2 */
    volatile boolean f149549G2 = false;

    /* renamed from: H2 */
    volatile boolean f149553H2 = false;

    /* renamed from: I2 */
    boolean f149557I2 = true;

    /* renamed from: J2 */
    private int f149561J2 = -1;

    /* renamed from: K2 */
    private boolean f149565K2 = false;

    /* renamed from: L2 */
    private int f149569L2 = 0;

    /* renamed from: M2 */
    private int f149572M2 = 2;

    /* renamed from: N2 */
    private long f149575N2 = 0;

    /* renamed from: P2 */
    volatile boolean f149581P2 = false;

    /* renamed from: Q2 */
    volatile boolean f149584Q2 = false;

    /* renamed from: R2 */
    volatile boolean f149587R2 = false;

    /* renamed from: S2 */
    volatile boolean f149591S2 = false;

    /* renamed from: T2 */
    volatile boolean f149595T2 = false;

    /* renamed from: U2 */
    volatile boolean f149599U2 = false;

    /* renamed from: V2 */
    boolean f149603V2 = false;

    /* renamed from: W2 */
    boolean f149607W2 = false;

    /* renamed from: X2 */
    boolean f149611X2 = false;

    /* renamed from: a3 */
    boolean f149623a3 = false;

    /* renamed from: b3 */
    boolean f149627b3 = false;

    /* renamed from: c3 */
    boolean f149631c3 = false;

    /* renamed from: d3 */
    boolean f149635d3 = false;

    /* renamed from: e3 */
    boolean f149639e3 = false;

    /* renamed from: f3 */
    private boolean f149643f3 = false;

    /* renamed from: g3 */
    private boolean f149647g3 = false;

    /* renamed from: h3 */
    private boolean f149651h3 = false;

    /* renamed from: i3 */
    private boolean f149655i3 = false;

    /* renamed from: j3 */
    int f149659j3 = 0;

    /* renamed from: k3 */
    int f149663k3 = 0;

    /* renamed from: l3 */
    int f149667l3 = 1;

    /* renamed from: m3 */
    int f149671m3 = 0;

    /* renamed from: n3 */
    int f149675n3 = 0;

    /* renamed from: o3 */
    int f149679o3 = Integer.MIN_VALUE;

    /* renamed from: p3 */
    int f149683p3 = 0;

    /* renamed from: q3 */
    private long f149687q3 = 0;

    /* renamed from: t3 */
    Runnable f149699t3 = new Runnable() { // from class: vo0.y2
        @Override // java.lang.Runnable
        public final void run() {
            ZmInCallActivity.this.m156991ns();
        }
    };

    /* renamed from: u3 */
    Runnable f149703u3 = new Runnable() { // from class: vo0.z2
        @Override // java.lang.Runnable
        public final void run() {
            ZmInCallActivity.this.m156947gs();
        }
    };

    /* renamed from: v3 */
    boolean f149707v3 = false;

    /* renamed from: w3 */
    volatile boolean f149711w3 = false;

    /* renamed from: x3 */
    volatile boolean f149715x3 = false;

    /* renamed from: y3 */
    volatile boolean f149719y3 = false;

    /* renamed from: J3 */
    ValueAnimator f149562J3 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(0L);

    /* renamed from: K3 */
    RunnableC32429k0 f149566K3 = new RunnableC32429k0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$a */
    /* loaded from: classes7.dex */
    public class C32408a implements ViewPager.InterfaceC2061i {
        C32408a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageSelected(int i11) {
            ZmInCallActivity.this.m157103Ns(i11);
            ZmInCallActivity.this.f149559J0.m112446M(i11);
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$a0 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C32409a0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f149725a;

        static {
            int[] iArr = new int[EnumC23411b.values().length];
            f149725a = iArr;
            try {
                iArr[EnumC23411b.f113755q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f149725a[EnumC23411b.f113756r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f149725a[EnumC23411b.f113757s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$b */
    /* loaded from: classes7.dex */
    public class C32410b implements CircularProgressIndicator.InterfaceC32485c {
        C32410b() {
        }

        @Override // zm.voip.widgets.CircularProgressIndicator.InterfaceC32485c
        /* renamed from: a */
        public void mo157146a() {
        }

        @Override // zm.voip.widgets.CircularProgressIndicator.InterfaceC32485c
        /* renamed from: b */
        public void mo157147b() {
            ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
            zmInCallActivity.f149540E1.setProgressColor(AbstractC23136l9.m118641B(zmInCallActivity.getContext(), AbstractC16801x.call_background_avatar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$b0 */
    /* loaded from: classes7.dex */
    public class C32411b0 extends AbstractViewOnTouchListenerC24388c {
        C32411b0(Context context) {
            super(context);
        }

        @Override // oo0.AbstractViewOnTouchListenerC24388c
        /* renamed from: a */
        public void mo127544a() {
            ZmInCallActivity.this.f149691r3.mo138307tf(10);
        }

        @Override // oo0.AbstractViewOnTouchListenerC24388c
        /* renamed from: b */
        public void mo127545b() {
            ZmInCallActivity.this.f149691r3.mo138267Pl(7000L);
            ZmInCallActivity.this.f149603V2 = false;
        }

        @Override // oo0.AbstractViewOnTouchListenerC24388c
        /* renamed from: c */
        public void mo127546c() {
            ZmInCallActivity.this.f149603V2 = true;
        }

        @Override // oo0.AbstractViewOnTouchListenerC24388c
        /* renamed from: d */
        public void mo127547d() {
            ZmInCallActivity.this.f149691r3.mo138307tf(19);
        }

        @Override // oo0.AbstractViewOnTouchListenerC24388c
        /* renamed from: e */
        public void mo127548e() {
        }

        @Override // oo0.AbstractViewOnTouchListenerC24388c
        /* renamed from: f */
        public void mo127549f() {
        }

        @Override // oo0.AbstractViewOnTouchListenerC24388c
        /* renamed from: g */
        public void mo127550g() {
            ZmInCallActivity.this.f149691r3.mo138307tf(18);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$c */
    /* loaded from: classes7.dex */
    public class C32412c implements CircularProgressIndicator.InterfaceC32485c {
        C32412c() {
        }

        @Override // zm.voip.widgets.CircularProgressIndicator.InterfaceC32485c
        /* renamed from: a */
        public void mo157146a() {
        }

        @Override // zm.voip.widgets.CircularProgressIndicator.InterfaceC32485c
        /* renamed from: b */
        public void mo157147b() {
            ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
            zmInCallActivity.f149560J1.setProgressColor(AbstractC23136l9.m118641B(zmInCallActivity.getContext(), AbstractC16801x.call_background_avatar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$c0 */
    /* loaded from: classes7.dex */
    public class C32413c0 implements LiveEmojiButton.InterfaceC13682e {
        C32413c0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m157150g(C24277c c24277c) {
            try {
                AbstractC23309i.m122483uw(c24277c.f117241b);
                C0874h.f3217a.m2590g(c24277c);
                ZmInCallActivity.this.f149716y0.setEmoji(c24277c);
                ZmInCallActivity.this.f149718y2.dismiss();
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m157151h(InterfaceC17463d interfaceC17463d) {
            ZmInCallActivity.this.f149691r3.mo138277T4(false, 0L);
            ZmInCallActivity.this.f149691r3.mo138267Pl(7000L);
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: b */
        public void mo60450b() {
            ZmInCallActivity.this.f149691r3.mo138277T4(true, 0L);
            ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
            zmInCallActivity.f149718y2 = new C13686a(zmInCallActivity.getContext(), AbstractC8915g0.ContentPickerPopup);
            ZmInCallActivity.this.f149718y2.m76407M(new C13686a.b() { // from class: zm.voip.ui.incall.e
                @Override // com.zing.zalo.p077ui.widget.liveemoji.C13686a.b
                /* renamed from: a */
                public final void mo13058a(C24277c c24277c) {
                    ZmInCallActivity.C32413c0.this.m157150g(c24277c);
                }
            });
            ZmInCallActivity.this.f149718y2.m92855F(new InterfaceC17463d.e() { // from class: zm.voip.ui.incall.f
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    ZmInCallActivity.C32413c0.this.m157151h(interfaceC17463d);
                }
            });
            C13686a c13686a = ZmInCallActivity.this.f149718y2;
            if (c13686a != null) {
                c13686a.dismiss();
                ZmInCallActivity.this.f149718y2.m92873y(true);
                ZmInCallActivity.this.f149718y2.mo13822K();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: c */
        public void mo60451c() {
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: d */
        public int mo60452d() {
            return 0;
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: e */
        public void mo60453e(float f11) {
            ZmInCallActivity.this.f149691r3.mo138277T4(true, 1000L);
            ZmInCallActivity.this.mo138426vw(false);
            long mo124311f = C23793c.m124316k().mo124311f();
            int i11 = (int) (f11 * 100.0f);
            AbstractC32273e3.m155748Q().mo155843R1(mo124311f, String.valueOf(ZmInCallActivity.this.f149686q2.m117013C()), 1, ZmInCallActivity.this.f149716y0.getEmoji().f117241b, i11, AbstractC23304d.f113432r2);
            C24277c c24277c = new C24277c();
            c24277c.f117240a = 1;
            c24277c.f117241b = ZmInCallActivity.this.f149716y0.getEmoji().f117241b;
            c24277c.f117243d = i11;
            c24277c.f117245f = "" + mo124311f;
            int[] m157121cg = ZmInCallActivity.this.m157121cg();
            AnimChat animChat = ZmInCallActivity.this.f149712x0;
            if (animChat != null) {
                animChat.m76103L(c24277c.f117241b, c24277c.f117243d, null, false, m157121cg[0], m157121cg[1], c24277c.f117245f, c24277c.f117247h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$d */
    /* loaded from: classes7.dex */
    public class C32414d implements ViewRenderListener {
        C32414d() {
        }

        @Override // org.webrtc.ViewRenderListener
        public void onRenderFail() {
        }

        @Override // org.webrtc.ViewRenderListener
        public void onVideoFrameChange(int i11, int i12, int i13, int i14) {
            ZmInCallActivity.this.m157019sb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$d0 */
    /* loaded from: classes7.dex */
    public class C32415d0 extends VoIPButtonWithText {
        C32415d0(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            try {
                ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
                if (zmInCallActivity.f149677o1 != null && zmInCallActivity.f149653i1 != null) {
                    float x11 = zmInCallActivity.f149689r1.getX() + (ZmInCallActivity.this.f149689r1.getWidth() >> 1);
                    ZmInCallActivity zmInCallActivity2 = ZmInCallActivity.this;
                    ZmInCallActivity.this.f149653i1.m157287f(x11, zmInCallActivity2.m157021sg(zmInCallActivity2.f149689r1.getButton()) + (ZmInCallActivity.this.f149689r1.getButton().getWidth() >> 1));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$e */
    /* loaded from: classes7.dex */
    public class C32416e implements SpringCallView.InterfaceC32503a {
        C32416e() {
        }

        @Override // zm.voip.widgets.SpringCallView.InterfaceC32503a
        /* renamed from: a */
        public void mo157152a() {
            ZmInCallActivity.this.f149691r3.mo138307tf(11);
        }

        @Override // zm.voip.widgets.SpringCallView.InterfaceC32503a
        /* renamed from: b */
        public void mo157153b() {
            ZmInCallActivity.this.f149691r3.mo138272Rb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$e0 */
    /* loaded from: classes7.dex */
    public class C32417e0 extends VoIPButtonWithText {
        C32417e0(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            try {
                ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
                if (zmInCallActivity.f149677o1 != null && zmInCallActivity.f149657j1 != null) {
                    float x11 = zmInCallActivity.f149713x1.getX() + (ZmInCallActivity.this.f149713x1.getWidth() >> 1);
                    ZmInCallActivity zmInCallActivity2 = ZmInCallActivity.this;
                    ZmInCallActivity.this.f149657j1.m157287f(x11, zmInCallActivity2.m157021sg(zmInCallActivity2.f149713x1.getButton()) + (ZmInCallActivity.this.f149713x1.getButton().getWidth() >> 1));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$f */
    /* loaded from: classes7.dex */
    public class ViewTreeObserverOnPreDrawListenerC32418f implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC32418f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
            zmInCallActivity.m156763Hr(zmInCallActivity.f149572M2);
            ZmInCallActivity.this.f149610X1.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$f0 */
    /* loaded from: classes7.dex */
    public class C32419f0 extends AbstractC23803b {
        C32419f0() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: d */
        public void mo101521d(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            super.mo101521d(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            ZmInCallActivity.this.m156837Rg(str3, str4);
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            ZmInCallActivity.this.m156837Rg(str3, str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$g */
    /* loaded from: classes7.dex */
    public class C32420g implements GestureBottomLayout.InterfaceC32491b {
        C32420g() {
        }

        @Override // zm.voip.widgets.GestureBottomLayout.InterfaceC32491b
        /* renamed from: a */
        public void mo156641a() {
        }

        @Override // zm.voip.widgets.GestureBottomLayout.InterfaceC32491b
        /* renamed from: b */
        public void mo156642b() {
            ZmInCallActivity.this.m157130lh();
        }

        @Override // zm.voip.widgets.GestureBottomLayout.InterfaceC32491b
        /* renamed from: c */
        public void mo156643c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$g0 */
    /* loaded from: classes7.dex */
    public class C32421g0 extends AbstractC24788n {
        C32421g0() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            super.mo61862a(str, str2, z11, interfaceC24785k);
            ZmInCallActivity.this.m156837Rg(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$h */
    /* loaded from: classes7.dex */
    public class C32422h implements AbstractC3085d.m {

        /* renamed from: a */
        final /* synthetic */ boolean f149738a;

        C32422h(boolean z11) {
            this.f149738a = z11;
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
            TextureViewRenderer textureViewRenderer;
            if (this.f149738a && ZmInCallActivity.this.f149686q2.m117126k0() && (textureViewRenderer = ZmInCallActivity.this.f149664l0) != null) {
                textureViewRenderer.setVisibility(8);
            }
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            TextureViewRenderer textureViewRenderer;
            if (!this.f149738a && ZmInCallActivity.this.f149686q2.m117126k0() && (textureViewRenderer = ZmInCallActivity.this.f149664l0) != null) {
                textureViewRenderer.setVisibility(0);
            }
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$h0 */
    /* loaded from: classes7.dex */
    public class C32423h0 implements KeyboardDTMFView.InterfaceC32242b {
        C32423h0() {
        }

        @Override // zm.voip.dialog.KeyboardDTMFView.InterfaceC32242b
        /* renamed from: a */
        public void mo155505a(boolean z11) {
            if (!z11) {
                ZmInCallActivity.this.f149691r3.mo138285Y6(false);
            }
        }

        @Override // zm.voip.dialog.KeyboardDTMFView.InterfaceC32242b
        /* renamed from: b */
        public void mo155506b(String str) {
            ZmInCallActivity.this.f149691r3.mo138282W6(str);
        }

        @Override // zm.voip.dialog.KeyboardDTMFView.InterfaceC32242b
        /* renamed from: c */
        public void mo155507c(boolean z11) {
            ZmInCallActivity.this.f149691r3.mo138292jd();
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$i */
    /* loaded from: classes7.dex */
    class C32424i extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149741l1;

        C32424i(String str) {
            this.f149741l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f149741l1.equals(str)) {
                        interfaceC3968a.setImageInfo(c3979l);
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("ZmInCallActivity_Log", "loadLocalBlurAva : " + e11.getMessage(), e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$i0 */
    /* loaded from: classes7.dex */
    public class ViewOnTouchListenerC32425i0 implements View.OnTouchListener {

        /* renamed from: p */
        private Rect f149743p;

        /* renamed from: q */
        private final int f149744q;

        /* renamed from: r */
        private final Runnable f149745r;

        /* renamed from: s */
        private final C21709f f149746s;

        /* renamed from: t */
        private final int f149747t;

        /* renamed from: u */
        private boolean f149748u;

        ViewOnTouchListenerC32425i0(ZmInCallActivity zmInCallActivity, int i11, C21709f c21709f) {
            this(i11, null, c21709f);
        }

        /* renamed from: a */
        void m157154a(View view) {
            this.f149748u = false;
            view.setPressed(false);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!view.isEnabled()) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        this.f149746s.m112046s(0.0d);
                        if (this.f149748u) {
                            m157154a(view);
                        }
                    }
                } else if (this.f149748u) {
                    m157154a(view);
                    this.f149746s.m112046s(0.0d);
                    if (this.f149743p.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY())) && !ZmInCallActivity.this.f149691r3.mo138307tf(this.f149744q)) {
                        ZmInCallActivity.this.m157102Nr(this.f149744q);
                    }
                }
            } else {
                this.f149748u = true;
                view.performHapticFeedback(0);
                this.f149743p = new Rect(view.getLeft() - this.f149747t, view.getTop() - this.f149747t, view.getRight() + this.f149747t, view.getBottom() + this.f149747t);
                this.f149746s.m112046s(1.0d);
            }
            if (this.f149745r != null) {
                if (action == 0) {
                    ZmInCallActivity.this.f149642f2.postDelayed(this.f149745r, ViewConfiguration.getLongPressTimeout());
                } else if (action == 2) {
                    Rect rect = this.f149743p;
                    if (rect != null && !rect.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()))) {
                        ZmInCallActivity.this.f149642f2.removeCallbacks(this.f149745r);
                    }
                } else if (action == 1) {
                    ZmInCallActivity.this.f149642f2.removeCallbacks(this.f149745r);
                }
            }
            return true;
        }

        ViewOnTouchListenerC32425i0(int i11, Runnable runnable, C21709f c21709f) {
            this.f149747t = AbstractC3104p.m15650a(10.0f);
            this.f149744q = i11;
            this.f149745r = runnable;
            this.f149746s = c21709f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$j */
    /* loaded from: classes7.dex */
    public class C32426j extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149750l1;

        C32426j(String str) {
            this.f149750l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f149750l1.equals(str)) {
                        ZmInCallActivity.this.f149612Y.setImageInfo(c3979l);
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("ZmInCallActivity_Log", "loadPartnerBlurAva : " + e11.getMessage(), e11);
                }
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$j0 */
    /* loaded from: classes7.dex */
    class C32427j0 extends GestureDetector.SimpleOnGestureListener {
        C32427j0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            ZmInCallActivity zmInCallActivity;
            C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_video_snapshot", new String[0]).m123926s(String.valueOf(!ZmInCallActivity.this.f149691r3.mo138312wg() ? 1 : 0)), false);
            if (AbstractC23034c6.m118121G()) {
                ZmInCallActivity.this.m157102Nr(20);
            } else if (!ZmInCallActivity.this.f149619Z2) {
                synchronized (this) {
                    zmInCallActivity = ZmInCallActivity.this;
                    zmInCallActivity.f149619Z2 = true;
                }
                AbstractC23034c6.m118186w0(zmInCallActivity, AbstractC23034c6.f112029f, 201);
            }
            return true;
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$k */
    /* loaded from: classes7.dex */
    class C32428k extends C17170o {
        C32428k() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return String.valueOf(C19561o0.m102161L().m102190B());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$k0 */
    /* loaded from: classes7.dex */
    public class RunnableC32429k0 implements Runnable {
        RunnableC32429k0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ZmInCallActivity.this.m157142xh(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$l */
    /* loaded from: classes7.dex */
    public class C32430l implements Animator.AnimatorListener {
        C32430l() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ZmInCallActivity.this.m156926ec();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ZmInCallActivity.this.f149664l0.setVisibility(0);
            ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
            zmInCallActivity.mo138411q6(zmInCallActivity.f149686q2.m117114h0());
            ZmInCallActivity.this.m156926ec();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ZmInCallActivity.this.f149664l0.setVisibility(4);
            ZmInCallActivity.this.mo138411q6(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$l0 */
    /* loaded from: classes7.dex */
    public static class HandlerC32431l0 extends Handler {

        /* renamed from: a */
        private final WeakReference f149756a;

        HandlerC32431l0(ZmInCallActivity zmInCallActivity) {
            this.f149756a = new WeakReference(zmInCallActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ViewOnClickListenerC23921f viewOnClickListenerC23921f;
            ZmInCallActivity zmInCallActivity = (ZmInCallActivity) this.f149756a.get();
            if (zmInCallActivity != null) {
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3 && (viewOnClickListenerC23921f = zmInCallActivity.f149529B2) != null && viewOnClickListenerC23921f.m92868m()) {
                        zmInCallActivity.f149529B2.dismiss();
                        return;
                    }
                    return;
                }
                if (zmInCallActivity.f149549G2 || zmInCallActivity.f149686q2.m117086a0()) {
                    zmInCallActivity.m157085Cb();
                    sendEmptyMessageDelayed(2, 1000L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$m */
    /* loaded from: classes7.dex */
    public class C32432m implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f149757a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zm.voip.ui.incall.ZmInCallActivity$m$a */
        /* loaded from: classes7.dex */
        public class a implements InterfaceC24775a {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m157156b() {
                ZmInCallActivity.this.f149669m1.setVisibility(0);
                ZmInCallActivity.this.f149669m1.onStart();
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: c */
            public void mo15338c(Exception exc) {
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r22) {
                ZmInCallActivity.this.runOnUiThread(new Runnable() { // from class: zm.voip.ui.incall.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZmInCallActivity.C32432m.a.this.m157156b();
                    }
                });
            }
        }

        C32432m(InterfaceC22508f interfaceC22508f) {
            this.f149757a = interfaceC22508f;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            AbstractC20110a.m104539h(exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            try {
                ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
                if (zmInCallActivity.f149669m1 != null && zmInCallActivity.f149686q2.m117138n0()) {
                    ZmInCallActivity.this.f149669m1.m91447b1(this.f149757a, null);
                    ZmInCallActivity zmInCallActivity2 = ZmInCallActivity.this;
                    zmInCallActivity2.f149669m1.m91445Y0(zmInCallActivity2.f149673n1, new a());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$n */
    /* loaded from: classes7.dex */
    public class C32433n implements AbstractC3085d.m {

        /* renamed from: a */
        final /* synthetic */ boolean f149760a;

        C32433n(boolean z11) {
            this.f149760a = z11;
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
            CircleBackgroundImageView circleBackgroundImageView;
            ZmInCallActivity.this.f149643f3 = false;
            ZmInCallActivity.this.f149651h3 = false;
            ZmInCallActivity.this.f149606W1.setVisibility(8);
            if (!this.f149760a && ZmInCallActivity.this.m156936fi() && (circleBackgroundImageView = ZmInCallActivity.this.f149613Y0) != null) {
                circleBackgroundImageView.setEnabled(true);
                ZmInCallActivity.this.f149613Y0.setSelected(false);
            }
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public /* synthetic */ void mo15466b() {
            AbstractC3087e.m15469b(this);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public void mo15467c() {
            CircleBackgroundImageView circleBackgroundImageView;
            ZmInCallActivity.this.f149643f3 = false;
            ZmInCallActivity.this.f149651h3 = false;
            ZmInCallActivity.this.f149606W1.setVisibility(8);
            if (!this.f149760a && ZmInCallActivity.this.m156936fi() && (circleBackgroundImageView = ZmInCallActivity.this.f149613Y0) != null) {
                circleBackgroundImageView.setEnabled(true);
                ZmInCallActivity.this.f149613Y0.setSelected(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$o */
    /* loaded from: classes7.dex */
    public class C32434o implements InterfaceC24232j {
        C32434o() {
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            ZmInCallActivity.this.m156820Pg(bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$p */
    /* loaded from: classes7.dex */
    public class C32435p extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ MediaItem f149763l1;

        C32435p(MediaItem mediaItem) {
            this.f149763l1 = mediaItem;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (!TextUtils.isEmpty(this.f149763l1.mo41081Q()) && str.equals(this.f149763l1.mo41081Q())) {
                    RecyclingImageView recyclingImageView = ZmInCallActivity.this.f149570M0;
                    if (recyclingImageView != null) {
                        recyclingImageView.setBackground(null);
                        if (c3979l != null) {
                            ZmInCallActivity.this.f149570M0.setImageBitmap(c3979l.m18839c());
                        } else {
                            ZmInCallActivity.this.f149570M0.setVisibility(8);
                            return;
                        }
                    }
                    ZmInCallActivity.this.f149681p1.setEnabled(false);
                    ZmInCallActivity.this.m156904as();
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("ZmInCallActivity_Log", "onTrigger : " + e11.getMessage(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$q */
    /* loaded from: classes7.dex */
    public class C32436q implements NewPhotoSuggestView.InterfaceC11773c {

        /* renamed from: a */
        final /* synthetic */ File f149765a;

        C32436q(File file) {
            this.f149765a = file;
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewPhotoSuggestView.InterfaceC11773c
        /* renamed from: a */
        public void mo65527a(boolean z11) {
            if (!z11) {
                ZmInCallActivity.this.mo138342JH();
                AbstractC32273e3.m155748Q().m155846S1(ZmInCallActivity.this.f149686q2.m117013C(), this.f149765a);
                String string = ZmInCallActivity.this.getString(AbstractC8020f0.incall_info_snapshot);
                ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
                ZmInCallActivity.this.m156817Ot(AbstractC8020f0.incall_info_screenshot_render_view, String.format(string, zmInCallActivity.f149686q2.m117049O(zmInCallActivity.getContext(), 10)));
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewPhotoSuggestView.InterfaceC11773c
        public void onDismiss() {
            ZmInCallActivity.this.mo138342JH();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$r */
    /* loaded from: classes7.dex */
    public class C32437r implements Animator.AnimatorListener {
        C32437r() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
            zmInCallActivity.f149588S.removeView(zmInCallActivity.f149594T1);
            ZmInCallActivity zmInCallActivity2 = ZmInCallActivity.this;
            RecyclingImageView recyclingImageView = zmInCallActivity2.f149598U1;
            zmInCallActivity2.f149594T1 = recyclingImageView;
            recyclingImageView.setAlpha(1.0f);
            ZmInCallActivity.this.f149598U1 = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
            zmInCallActivity.f149588S.removeView(zmInCallActivity.f149594T1);
            ZmInCallActivity zmInCallActivity2 = ZmInCallActivity.this;
            zmInCallActivity2.f149594T1 = zmInCallActivity2.f149598U1;
            zmInCallActivity2.f149598U1 = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$s */
    /* loaded from: classes7.dex */
    public class C32438s extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f149768p;

        C32438s(boolean z11) {
            this.f149768p = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m157159b() {
            ZmInCallActivity.this.f149664l0.setAnim(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i11;
            if (!this.f149768p) {
                if (ZmInCallActivity.this.f149686q2.m117126k0() && !ZmInCallActivity.this.f149691r3.mo138256He()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                float f11 = i11;
                ZmInCallActivity.this.f149668m0.m76289j(f11, f11, f11, f11);
                ZmInCallActivity zmInCallActivity = ZmInCallActivity.this;
                if (!zmInCallActivity.f149635d3) {
                    zmInCallActivity.m157106Pt(true);
                }
            }
            ZmInCallActivity.this.f149664l0.postDelayed(new Runnable() { // from class: zm.voip.ui.incall.d
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.C32438s.this.m157159b();
                }
            }, 50L);
            ZmInCallActivity.this.f149691r3.mo138279Uf();
            ZmInCallActivity.this.f149707v3 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ZmInCallActivity.this.f149664l0.setAnim(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$t */
    /* loaded from: classes7.dex */
    public class C32439t extends C28020b3.b {
        C32439t() {
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                if (!str.equals(c25630b.m132446x())) {
                    return;
                }
                CallStickerView callStickerView = (CallStickerView) interfaceC3968a;
                String str2 = System.currentTimeMillis() + "";
                if (c3979l.m18839c() != null) {
                    callStickerView.setImageInfo(c3979l, false);
                }
                callStickerView.m157272i(c25630b, str2, false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$u */
    /* loaded from: classes7.dex */
    public class C32440u implements AbstractC3085d.m {

        /* renamed from: a */
        final /* synthetic */ boolean f149771a;

        C32440u(boolean z11) {
            this.f149771a = z11;
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            if (this.f149771a) {
                ZmInCallActivity.this.f149709w1.setVisibility(0);
            }
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$v */
    /* loaded from: classes7.dex */
    public class C32441v extends OrientationEventListener {
        C32441v(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            ZmInCallActivity.this.f149691r3.mo138290h2(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$w */
    /* loaded from: classes7.dex */
    public class C32442w implements AbstractC3085d.m {
        C32442w() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            ZmInCallActivity.this.f149677o1.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public void mo15467c() {
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$x */
    /* loaded from: classes7.dex */
    class C32443x implements AbstractC3085d.m {
        C32443x() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            ZmInCallActivity.this.f149580P1.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$y */
    /* loaded from: classes7.dex */
    class C32444y implements AbstractC3085d.m {
        C32444y() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            ZmInCallActivity.this.f149688r0.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallActivity$z */
    /* loaded from: classes7.dex */
    public class C32445z implements AbstractC3085d.m {
        C32445z() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            ZmInCallActivity.this.f149583Q1.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* renamed from: Ab */
    private void m156707Ab(C25937a c25937a) {
        if (c25937a != null && c25937a.m133637b() != null) {
            RecyclingImageView recyclingImageView = this.f149598U1;
            if (recyclingImageView != null) {
                recyclingImageView.clearAnimation();
            }
            RecyclingImageView m156927ef = m156927ef();
            this.f149598U1 = m156927ef;
            m156927ef.setTag(c25937a.m133639d());
            this.f149598U1.setImageBitmap(c25937a.m133637b());
            this.f149598U1.animate().alpha(1.0f).setDuration(500L).setInterpolator(new DecelerateInterpolator()).setListener(new C32437r());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Aj */
    public /* synthetic */ void m156708Aj() {
        runOnUiThread(new Runnable() { // from class: vo0.m2
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157074yj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ak */
    public /* synthetic */ void m156709Ak(View view) {
        m157102Nr(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Al */
    public /* synthetic */ void m156710Al(View view) {
        m157102Nr(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ao */
    public /* synthetic */ void m156711Ao() {
        if (this.f149691r3.mo138314xj()) {
            this.f149696t0.stop();
        } else {
            this.f149609X0.stop();
        }
    }

    /* renamed from: Bg */
    private int m156714Bg() {
        return (AbstractC3104p.m15674m() * 2) + (AbstractC3104p.m15637N() * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bn */
    public /* synthetic */ void m156715Bn() {
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_speaker", new String[0]).m123926s(String.valueOf(this.f149549G2 ? 1 : 0)), false);
        if (VoipAudioHelper.m155574U0()) {
            mo138361QD();
        } else {
            boolean isSelected = this.f149693s1.isSelected();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Set speaker: ");
            sb2.append(!isSelected);
            AbstractC3082b0.m15421c("ZmInCallActivity_Log", sb2.toString());
            if (!this.f149549G2) {
                this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_speaker_not_bluetooth_selector));
            }
            this.f149693s1.setSelected(!isSelected);
            if (isSelected) {
                VoipAudioHelper.m155538B0(0);
                AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40011));
            } else {
                if (this.f149549G2) {
                    m157125et(8);
                }
                VoipAudioHelper.m155538B0(1);
                AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40010));
            }
        }
        this.f149691r3.mo138259In();
    }

    /* renamed from: Bu */
    private void m156716Bu(final C28212v6 c28212v6, View view) {
        C28212v6.a aVar;
        if (c28212v6.f131579e) {
            if ((c28212v6.m142166e() || ((aVar = c28212v6.f131584j) != null && aVar.m142172a())) && view != null) {
                C26203c m134769a = C26203c.m134769a(view.getContext());
                m134769a.m134770b(c28212v6, view.getContext());
                m134769a.f124524o = view;
                m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                m134769a.f124508E = 350;
                ShowcaseView showcaseView = new ShowcaseView(getContext());
                this.f149710w2 = showcaseView;
                showcaseView.setConfigs(m134769a);
                this.f149710w2.setShowcaseId(c28212v6.f131577c);
                this.f149710w2.setShowcaseManager(this.f149706v2);
                this.f149710w2.m74637r();
                this.f149710w2.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: vo0.k4
                    @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                    /* renamed from: a */
                    public final void mo39159a(ShowcaseView showcaseView2, int i11, int i12, boolean z11) {
                        ZmInCallActivity.this.m157024so(c28212v6, showcaseView2, i11, i12, z11);
                    }
                });
            }
        }
    }

    /* renamed from: Cg */
    private int m156717Cg() {
        return AbstractC3104p.m15674m() + AbstractC3104p.m15637N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cm */
    public /* synthetic */ void m156718Cm() {
        if (this.f149549G2) {
            m157113Uv();
            this.f149544F1.m157299g();
        } else {
            m157111Tv();
            this.f149524A1.m157299g();
            if (this.f149613Y0 != null && this.f149686q2.m117090b0() && m156936fi()) {
                this.f149613Y0.setVisibility(0);
                this.f149613Y0.setEnabled(false);
            }
        }
        m156793Lb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Co */
    public /* synthetic */ void m156719Co() {
        if (this.f149691r3.mo138314xj()) {
            m157113Uv();
        } else {
            m157111Tv();
        }
    }

    /* renamed from: Cs */
    private void m156720Cs() {
        if (this.f149549G2) {
            return;
        }
        if (!mo138358P0()) {
            mo138422u2(138);
            return;
        }
        if (this.f149613Y0 != null && m156936fi()) {
            this.f149613Y0.setSelected(true);
            this.f149613Y0.setEnabled(false);
        }
        AbstractC32273e3.m155748Q().mo155933w2();
    }

    /* renamed from: Ct */
    private void m156721Ct(View view, View view2) {
        int i11 = AbstractC3104p.f13186c / 2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 51;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.setMargins(0, 0, 0, i11);
        view.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        layoutParams2.gravity = 51;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.setMargins(0, i11, 0, 0);
        view2.setLayoutParams(layoutParams2);
    }

    /* renamed from: Cu */
    private void m156722Cu(final C28212v6 c28212v6, View view) {
        try {
            TooltipView tooltipView = new TooltipView(getContext());
            this.f149714x2 = tooltipView;
            tooltipView.setTooltipId(c28212v6.f131577c);
            this.f149714x2.setConfigs(m156971kf(c28212v6, view));
            this.f149714x2.m90734d0();
            this.f149714x2.setTooltipManager(this.f149706v2);
            this.f149714x2.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: vo0.d5
                @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
                /* renamed from: a */
                public final void mo66113a(TooltipView tooltipView2, int i11, int i12, boolean z11) {
                    ZmInCallActivity.this.m157039uo(c28212v6, tooltipView2, i11, i12, z11);
                }
            });
            this.f149714x2.m90733c0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Dg */
    private int m156724Dg() {
        StickerPanelView stickerPanelView = this.f149527B0;
        if (stickerPanelView == null) {
            return AbstractC3104p.m15650a(165.0f);
        }
        return stickerPanelView.getHeight() + ((FrameLayout.LayoutParams) this.f149527B0.getLayoutParams()).bottomMargin;
    }

    /* renamed from: Dr */
    private void m156725Dr(boolean z11) {
        try {
            if (this.f149669m1 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", z11 ? 1 : 0);
                m156894Zv("js.action.call.flip_camera", jSONObject);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Ef */
    private int m156730Ef() {
        if (mo138335F2()) {
            return AbstractC3104p.m15650a(5.0f);
        }
        if (this.f149691r3.mo138268Po()) {
            return AbstractC3104p.m15678o();
        }
        return AbstractC3104p.m15625B() + AbstractC3104p.m15674m() + AbstractC3104p.m15650a(16.0f);
    }

    /* renamed from: Eg */
    private int m156731Eg() {
        int m15650a;
        int m156830Qf;
        int m15639P;
        if (this.f149691r3.mo138268Po()) {
            if (this.f149691r3.mo138264Lj()) {
                if (this.f149691r3.mo138309v4()) {
                    m15650a = m156724Dg();
                } else {
                    m156830Qf = m156976lg() + AbstractC3104p.m15627D();
                    m15639P = AbstractC3104p.m15639P();
                }
            } else {
                m156830Qf = m156830Qf() + m156976lg();
                m15639P = AbstractC3104p.m15639P() * 2;
            }
            m15650a = m156830Qf + m15639P;
        } else if (this.f149691r3.mo138264Lj()) {
            m15650a = AbstractC3104p.m15650a(76.0f);
        } else {
            m15650a = AbstractC3104p.m15650a(120.0f);
        }
        return ((AbstractC3104p.f13186c - m156776Jf()) - AbstractC3104p.m15680p(this.f149691r3.mo138268Po())[1]) - m15650a;
    }

    /* renamed from: Eh */
    private void m156732Eh() {
        RobotoTextView robotoTextView = this.f149625b1;
        if (robotoTextView != null) {
            robotoTextView.setSelected(false);
        }
        RecyclingImageView recyclingImageView = this.f149621a1;
        if (recyclingImageView != null) {
            recyclingImageView.clearAnimation();
        }
        this.f149719y3 = false;
        LinearLayout linearLayout = this.f149617Z0;
        if (linearLayout != null) {
            AbstractC3085d.m15442d(linearLayout, false);
        }
        RingBackTonePreviewView ringBackTonePreviewView = this.f149629c1;
        if (ringBackTonePreviewView != null) {
            AbstractC3085d.m15442d(ringBackTonePreviewView, false);
            this.f149629c1.m157391i();
        }
    }

    /* renamed from: Er */
    private C1580n1 m156734Er(C1421e c1421e) {
        if (c1421e.equals(AbstractC3104p.f13192i)) {
            return C1580n1.f6524b;
        }
        AbstractC3104p.f13192i = c1421e;
        CircleBackgroundImageView circleBackgroundImageView = this.f149583Q1;
        if (circleBackgroundImageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) circleBackgroundImageView.getLayoutParams();
            marginLayoutParams.topMargin = AbstractC3104p.m15626C();
            marginLayoutParams.leftMargin = AbstractC3104p.m15624A();
            this.f149583Q1.setLayoutParams(marginLayoutParams);
        }
        LinearLayout linearLayout = this.f149580P1;
        if (linearLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams2.topMargin = AbstractC3104p.m15626C();
            marginLayoutParams2.rightMargin = AbstractC3104p.m15625B();
            this.f149580P1.setLayoutParams(marginLayoutParams2);
        }
        LinearLayout linearLayout2 = this.f149688r0;
        if (linearLayout2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
            marginLayoutParams3.topMargin = AbstractC3104p.m15626C();
            this.f149688r0.setLayoutParams(marginLayoutParams3);
        }
        LinearLayout linearLayout3 = this.f149589S0;
        if (linearLayout3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) linearLayout3.getLayoutParams();
            marginLayoutParams4.topMargin = AbstractC3104p.m15626C() + AbstractC3104p.m15649Z();
            this.f149589S0.setLayoutParams(marginLayoutParams4);
        }
        m157025ss();
        this.f149691r3.mo138304q6();
        return C1580n1.f6524b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Eu, reason: merged with bridge method [inline-methods] */
    public boolean m156883Xn(int i11) {
        View mo9732P = this.f149523A0.mo9732P(i11);
        if (mo9732P == null || this.f149551H0.getWidth() <= 0) {
            return false;
        }
        int width = (this.f149551H0.getWidth() - mo9732P.getWidth()) / 2;
        this.f149551H0.m9845O1(mo9732P.getLeft() - width, 0);
        return true;
    }

    /* renamed from: Fd */
    private void m156740Fd() {
        CircleBackgroundImageView circleBackgroundImageView = new CircleBackgroundImageView(getContext());
        this.f149681p1 = circleBackgroundImageView;
        circleBackgroundImageView.setId(AbstractC6918a0.call_snapshotBtn);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15674m(), AbstractC3104p.m15674m());
        m15700c.gravity = 85;
        m15700c.bottomMargin = m156892Zf() + m156714Bg();
        m15700c.rightMargin = AbstractC3104p.m15625B();
        this.f149681p1.setLayoutParams(m15700c);
        this.f149681p1.setClickable(true);
        this.f149681p1.m157292f(C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_snapshot_solid_24), AbstractC23136l9.m118645D(getContext(), AbstractC16801x.call_icon_color_selector));
        this.f149681p1.setVisibility(8);
        this.f149681p1.setOnTouchListener(new View.OnTouchListener() { // from class: vo0.s4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m157075yk;
                m157075yk = ZmInCallActivity.this.m157075yk(view, motionEvent);
                return m157075yk;
            }
        });
        this.f149588S.addView(this.f149681p1);
    }

    /* renamed from: Fg */
    private int m156741Fg() {
        int m15624A;
        int i11 = AbstractC3104p.m15680p(this.f149691r3.mo138268Po())[0];
        if (this.f149691r3.mo138268Po()) {
            m15624A = m156730Ef();
        } else {
            m15624A = AbstractC3104p.m15624A();
        }
        return -(((AbstractC3104p.f13187d - m156730Ef()) - i11) - m15624A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fi */
    public /* synthetic */ C24848g0 m156742Fi() {
        this.f149629c1.m157390h();
        this.f149686q2.m117063S1(-1);
        if (this.f149686q2.m117025G() != null) {
            C22456g.Companion.m116103a(this.f149686q2.m117025G(), 2, new InterfaceC18505l() { // from class: vo0.g2
                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    C24848g0 m157044vi;
                    m157044vi = ZmInCallActivity.this.m157044vi((Boolean) obj);
                    return m157044vi;
                }
            });
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fj */
    public /* synthetic */ void m156743Fj(String str) {
        if (this.f149716y0 == null) {
            return;
        }
        this.f149691r3.mo138277T4(true, 1000L);
        AbstractC32273e3.m155748Q().mo155843R1(Long.parseLong(str), String.valueOf(this.f149686q2.m117013C()), 3, this.f149716y0.getEmoji().f117241b, 100, AbstractC23304d.f113432r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fo */
    public /* synthetic */ void m156744Fo() {
        this.f149691r3.mo138311wf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fq */
    public /* synthetic */ void m156745Fq(boolean z11) {
        LinearLayout linearLayout = this.f149640f0;
        if (linearLayout != null && this.f149677o1 != null) {
            AbstractC3085d.m15447i(linearLayout, z11, 0.0f, m156928eg(), 200L);
        }
    }

    /* renamed from: Fs */
    private void m156746Fs() {
        try {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149600V.getLayoutParams();
            if (this.f149686q2.m117082Z()) {
                layoutParams.height = AbstractC3104p.m15657d0() / 2;
                this.f149600V.setBackgroundResource(AbstractC16803z.bg_mask_video_layout);
            } else {
                layoutParams.height = AbstractC3104p.m15657d0() / 7;
                this.f149600V.setBackgroundResource(AbstractC16803z.bg_mask_video_11_layout);
            }
            this.f149600V.setLayoutParams(layoutParams);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ft */
    private void m156747Ft() {
        ViewOnClickListenerC23921f viewOnClickListenerC23921f = this.f149529B2;
        if (viewOnClickListenerC23921f != null && viewOnClickListenerC23921f.m92868m()) {
            return;
        }
        ViewOnClickListenerC23921f viewOnClickListenerC23921f2 = new ViewOnClickListenerC23921f(getContext());
        this.f149529B2 = viewOnClickListenerC23921f2;
        viewOnClickListenerC23921f2.m125043L(new InterfaceC17463d.d() { // from class: vo0.l5
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ZmInCallActivity.this.m156931eo(interfaceC17463d, i11);
            }
        });
        this.f149529B2.m125044M(new InterfaceC17463d.d() { // from class: vo0.w5
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ZmInCallActivity.this.m156939fo(interfaceC17463d, i11);
            }
        });
        this.f149642f2.removeMessages(3);
        this.f149642f2.sendEmptyMessageDelayed(3, 30000L);
        this.f149529B2.mo13822K();
    }

    /* renamed from: Gg */
    private int m156752Gg() {
        if (!mo138335F2() && this.f149691r3.mo138312wg()) {
            return AbstractC3104p.m15674m() + AbstractC3104p.m15650a(12.0f);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gj */
    public /* synthetic */ boolean m156753Gj(int i11, View view, MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            float f11 = this.f149657j1.getmXCenterCir();
            float f12 = this.f149657j1.getmYCenterCir();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f149657j1.m157288h();
                        }
                    } else {
                        float sqrt = (float) Math.sqrt(Math.pow(Math.abs(motionEvent.getRawX() - f11), 2.0d) + Math.pow(Math.abs(motionEvent.getRawY() - f12), 2.0d));
                        if (sqrt >= (i11 >> 1) - 10) {
                            this.f149657j1.m157291k(sqrt);
                            if (this.f149657j1.getRadiusBackgroundSwipe() - sqrt <= 0.0f && !this.f149627b3) {
                                this.f149627b3 = true;
                                m157102Nr(32);
                            }
                        }
                    }
                } else if (!this.f149627b3) {
                    m157102Nr(32);
                }
            } else {
                this.f149627b3 = false;
                this.f149657j1.m157289i();
                this.f149657j1.m157291k(0.0f);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "answerBtn.setOnTouchListener " + e11.getMessage(), e11);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gm */
    public /* synthetic */ void m156755Gm() {
        this.f149524A1.m157299g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gn */
    public /* synthetic */ void m156756Gn() {
        if (this.f149608X == null) {
            return;
        }
        try {
            final File m114581e = AbstractC21943a.m114581e();
            C17843b.m94137o().m94157T(m114581e.getPath());
            try {
                AbstractC23280z4.m120303O(m114581e.getAbsolutePath(), Environment.DIRECTORY_DCIM, m114581e.getName(), false, false, false, new SensitiveData("gallery_save_photo_when_call_video", "comm_call"));
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("ZmInCallActivity_Log", "onTrigger : " + e11.getMessage(), e11);
            }
            final MediaItem mediaItem = new MediaItem();
            mediaItem.mo41082W0(m114581e.getAbsolutePath());
            C23307g m118367a = AbstractC23067f6.m118367a(mediaItem.mo41081Q());
            mediaItem.m41164p1(m118367a.f113474a);
            mediaItem.m41118Q0(m118367a.f113475b);
            runOnUiThread(new Runnable() { // from class: vo0.x5
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.this.m156733En(m114581e, mediaItem);
                }
            });
        } catch (Exception e12) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "onTrigger : " + e12.getMessage(), e12);
        }
    }

    /* renamed from: Gq */
    private void m156757Gq() {
        int m15656d;
        int m15628E;
        if (!this.f149686q2.m117086a0() && this.f149691r3.mo138268Po()) {
            m15656d = AbstractC3104p.m15658e();
        } else {
            m15656d = AbstractC3104p.m15656d();
        }
        int m15656d2 = AbstractC3104p.m15656d();
        int m15645V = AbstractC3104p.m15645V() + m15656d;
        if (!this.f149686q2.m117086a0() && this.f149691r3.mo138268Po()) {
            m15628E = AbstractC3104p.m15654c();
        } else {
            m15628E = AbstractC3104p.m15628E();
        }
        if (this.f149528B1 != null) {
            int m15660f = m15628E - AbstractC3104p.m15660f();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149528B1.getLayoutParams();
            layoutParams.setMargins(AbstractC3104p.m15650a(10.0f), m15660f, AbstractC3104p.m15650a(10.0f), 0);
            this.f149528B1.setLayoutParams(layoutParams);
        }
        CircularProgressIndicator circularProgressIndicator = this.f149540E1;
        if (circularProgressIndicator != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) circularProgressIndicator.getLayoutParams();
            layoutParams2.width = m15645V;
            layoutParams2.height = m15645V;
            this.f149540E1.setLayoutParams(layoutParams2);
        }
        RecyclingImageView recyclingImageView = this.f149532C1;
        if (recyclingImageView != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) recyclingImageView.getLayoutParams();
            layoutParams3.width = m15656d;
            layoutParams3.height = m15656d;
            this.f149532C1.setLayoutParams(layoutParams3);
        }
        AppCompatImageView appCompatImageView = this.f149536D1;
        if (appCompatImageView != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) appCompatImageView.getLayoutParams();
            layoutParams4.width = m15656d;
            layoutParams4.height = m15656d;
            this.f149536D1.setLayoutParams(layoutParams4);
        }
        CircleBackgroundView circleBackgroundView = this.f149524A1;
        if (circleBackgroundView != null) {
            circleBackgroundView.f149939u = m15656d / 2.0f;
            circleBackgroundView.m157298e(AbstractC3104p.f13187d >> 1, m15628E + (m15656d >> 1));
            CircleBackgroundView circleBackgroundView2 = this.f149524A1;
            circleBackgroundView2.setLayoutParams(circleBackgroundView2.getLayoutParams());
        }
        RelativeLayout relativeLayout = this.f149548G1;
        if (relativeLayout != null) {
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams5.setMargins(AbstractC3104p.m15650a(40.0f), AbstractC3104p.m15628E(), AbstractC3104p.m15650a(40.0f), 0);
            this.f149548G1.setLayoutParams(layoutParams5);
        }
        RecyclingImageView recyclingImageView2 = this.f149552H1;
        if (recyclingImageView2 != null) {
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) recyclingImageView2.getLayoutParams();
            layoutParams6.width = m15656d2;
            layoutParams6.height = m15656d2;
            this.f149552H1.setLayoutParams(layoutParams6);
        }
        AppCompatImageView appCompatImageView2 = this.f149556I1;
        if (appCompatImageView2 != null) {
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) appCompatImageView2.getLayoutParams();
            layoutParams7.width = m15656d2;
            layoutParams7.height = m15656d2;
            this.f149556I1.setLayoutParams(layoutParams7);
        }
        CircularProgressIndicator circularProgressIndicator2 = this.f149560J1;
        if (circularProgressIndicator2 != null) {
            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) circularProgressIndicator2.getLayoutParams();
            layoutParams8.width = AbstractC3104p.m15645V() + m15656d2;
            layoutParams8.height = AbstractC3104p.m15645V() + m15656d2;
            this.f149560J1.setLayoutParams(layoutParams8);
        }
        if (this.f149544F1 != null) {
            int m15645V2 = AbstractC3104p.m15645V() + m15656d2;
            CircleBackgroundView circleBackgroundView3 = this.f149544F1;
            circleBackgroundView3.f149939u = m15656d2 / 2.0f;
            circleBackgroundView3.m157298e(AbstractC3104p.f13187d >> 1, AbstractC3104p.m15628E() + (m15645V2 >> 1));
            this.f149544F1.setMaxRadius(m15645V2 * 1.5f);
        }
    }

    /* renamed from: Gw */
    private void m156758Gw() {
        mo138423vj(this.f149691r3.mo138260Kd(), false);
        mo138352Me(this.f149691r3.mo138265Pd(), false);
        mo138416s9(this.f149691r3.mo138306rp(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Hi */
    public /* synthetic */ void m156761Hi(View view) {
        m157102Nr(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ho */
    public /* synthetic */ void m156762Ho() {
        m157019sb();
        mo138341Iu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Hr */
    public void m156763Hr(int i11) {
        this.f149610X1.setMinPosition(m156873Wf());
        this.f149610X1.setMaxPosition(m156873Wf());
        this.f149610X1.setMinimized(2);
        m157092Kt(i11);
    }

    /* renamed from: Hw */
    private void m156764Hw() {
        int m15670k = AbstractC3104p.m15670k();
        m157000ow();
        CircleBackgroundAnswer circleBackgroundAnswer = this.f149653i1;
        if (circleBackgroundAnswer != null) {
            circleBackgroundAnswer.setDiameter(m15670k);
        }
        VoIPButtonWithText voIPButtonWithText = this.f149685q1;
        if (voIPButtonWithText != null) {
            voIPButtonWithText.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        }
        VoIPButtonWithText voIPButtonWithText2 = this.f149689r1;
        if (voIPButtonWithText2 != null) {
            voIPButtonWithText2.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        }
        VoIPButtonWithText voIPButtonWithText3 = this.f149705v1;
        if (voIPButtonWithText3 != null) {
            voIPButtonWithText3.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        }
        VoIPButtonWithText voIPButtonWithText4 = this.f149697t1;
        if (voIPButtonWithText4 != null) {
            voIPButtonWithText4.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        }
        if (this.f149693s1 != null && !this.f149549G2) {
            this.f149693s1.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        }
        if (this.f149549G2) {
            CircleBackgroundAnswer circleBackgroundAnswer2 = this.f149657j1;
            if (circleBackgroundAnswer2 != null) {
                circleBackgroundAnswer2.setDiameter(m15670k);
            }
            VoIPButtonWithText voIPButtonWithText5 = this.f149713x1;
            if (voIPButtonWithText5 != null) {
                voIPButtonWithText5.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            }
            VoIPButtonWithText voIPButtonWithText6 = this.f149717y1;
            if (voIPButtonWithText6 != null) {
                voIPButtonWithText6.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            }
            VoIPButtonWithText voIPButtonWithText7 = this.f149701u1;
            if (voIPButtonWithText7 != null) {
                voIPButtonWithText7.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            }
        }
    }

    /* renamed from: Ic */
    private void m156767Ic() {
        BottomCallView bottomCallView = new BottomCallView(getContext());
        this.f149606W1 = bottomCallView;
        bottomCallView.setId(AbstractC6918a0.call_bottomView);
        this.f149606W1.setOnClickListener(new View.OnClickListener() { // from class: vo0.g6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156857Ui(view);
            }
        });
        if (this.f149606W1.getParent() == null) {
            this.f149606W1.setVisibility(4);
            this.f149588S.addView(this.f149606W1, AbstractC3105q.m15698a(-1, -1));
        }
        this.f149606W1.setBottomCallViewPresenter(new BottomCallView.InterfaceC32380a() { // from class: vo0.q1
            @Override // zm.voip.p721ui.incall.BottomCallView.InterfaceC32380a
            /* renamed from: a */
            public final void mo142927a() {
                ZmInCallActivity.this.m156880Xi();
            }
        });
        RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(-1, -1);
        GestureBottomLayout gestureBottomLayout = new GestureBottomLayout(getContext());
        this.f149610X1 = gestureBottomLayout;
        gestureBottomLayout.setBackgroundResource(AbstractC16803z.call_bg_bottom_view);
        this.f149610X1.setLayoutParams(m15705h);
        this.f149610X1.setPadding(AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15650a(20.0f));
        this.f149610X1.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC32418f());
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149614Y1 = linearLayout;
        linearLayout.setLayoutParams(m15698a);
        this.f149614Y1.setOrientation(1);
        this.f149614Y1.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: vo0.r1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                ZmInCallActivity.this.m156929ej(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f(AbstractC3104p.m15650a(24.0f), AbstractC3104p.m15650a(24.0f));
        m15703f.gravity = 5;
        appCompatImageView.setLayoutParams(m15703f);
        appCompatImageView.setImageResource(AbstractC16803z.ic_call_switch_video_close);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: vo0.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156937fj(view);
            }
        });
        this.f149618Z1 = new AppCompatImageView(getContext());
        LinearLayout.LayoutParams m15703f2 = AbstractC3105q.m15703f(AbstractC3104p.m15650a(228.0f), AbstractC3104p.m15650a(143.0f));
        m15703f2.gravity = 1;
        m15703f2.bottomMargin = AbstractC3104p.m15650a(10.0f);
        m15703f2.topMargin = AbstractC3104p.m15650a(4.0f);
        this.f149618Z1.setLayoutParams(m15703f2);
        this.f149618Z1.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f149622a2 = new RobotoTextView(getContext());
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
        m15701d.gravity = 1;
        m15701d.setMargins(AbstractC3104p.m15650a(10.0f), AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15650a(10.0f), 4);
        this.f149622a2.setLayoutParams(m15701d);
        this.f149622a2.mo75850g(true);
        this.f149622a2.setGravity(1);
        this.f149622a2.setTextSize(1, 20.0f);
        this.f149622a2.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        this.f149626b2 = new RobotoTextView(getContext());
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
        m15701d2.gravity = 1;
        m15701d2.setMargins(AbstractC3104p.m15650a(40.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(40.0f), 20);
        this.f149626b2.setLayoutParams(m15701d2);
        this.f149626b2.mo75850g(true);
        this.f149626b2.setGravity(1);
        this.f149626b2.setTextSize(1, 14.0f);
        this.f149626b2.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
        this.f149630c2 = new RobotoTextView(getContext());
        LinearLayout.LayoutParams m15703f3 = AbstractC3105q.m15703f(AbstractC3104p.m15650a(250.0f), AbstractC3104p.m15650a(38.0f));
        m15703f3.gravity = 1;
        m15703f3.setMargins(AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15650a(50.0f));
        this.f149630c2.setLayoutParams(m15703f3);
        this.f149630c2.mo75850g(true);
        this.f149630c2.setGravity(17);
        this.f149630c2.setTextSize(1, 15.0f);
        this.f149630c2.setTextColor(AbstractC1388a.m6961c(getContext(), AbstractC16801x.white));
        this.f149630c2.setBackgroundResource(AbstractC16803z.bg_btn_type1_medium);
        this.f149630c2.setOnClickListener(new View.OnClickListener() { // from class: vo0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156996oj(view);
            }
        });
        this.f149614Y1.addView(appCompatImageView);
        this.f149614Y1.addView(this.f149618Z1);
        this.f149614Y1.addView(this.f149622a2);
        this.f149614Y1.addView(this.f149626b2);
        this.f149614Y1.addView(this.f149630c2);
        this.f149610X1.addView(this.f149614Y1);
        this.f149606W1.addView(this.f149610X1);
        this.f149647g3 = true;
    }

    /* renamed from: Ie */
    private void m156768Ie() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f149721z1 = robotoTextView;
        robotoTextView.setId(AbstractC6918a0.call_newMenuSeparator);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC3104p.m15650a(0.5f));
        layoutParams.leftMargin = AbstractC3104p.m15650a(28.0f) + AbstractC3104p.m15676n();
        this.f149721z1.setLayoutParams(layoutParams);
        this.f149721z1.setBackgroundColor(AbstractC23136l9.m118641B(this, AbstractC16801x.call_divider_color));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Il */
    public /* synthetic */ void m156769Il() {
        AbstractC3085d.m15442d(this.f149567L0, false);
    }

    /* renamed from: Ir */
    private void m156770Ir() {
        try {
            m157109Sh();
            m157025ss();
            this.f149691r3.mo138304q6();
            if (this.f149691r3.mo138256He()) {
                this.f149691r3.mo138310vb(true, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Jf */
    private int m156776Jf() {
        if (mo138335F2()) {
            return AbstractC3104p.m15650a(5.0f);
        }
        return AbstractC3104p.m15626C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jh, reason: merged with bridge method [inline-methods] */
    public void m156733En(File file, MediaItem mediaItem) {
        try {
            this.f149642f2.removeCallbacks(this.f149525A2);
            if (this.f149702u2 == null) {
                NewPhotoSuggestView newPhotoSuggestView = new NewPhotoSuggestView(getContext(), getString(AbstractC8020f0.str_send));
                this.f149702u2 = newPhotoSuggestView;
                newPhotoSuggestView.setId(AbstractC6918a0.new_photo_suggest_id);
                FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
                if (this.f149691r3.mo138268Po()) {
                    m15698a.gravity = 19;
                } else {
                    m15698a.gravity = 51;
                    m15698a.topMargin = AbstractC3104p.m15626C() + AbstractC3104p.m15674m() + AbstractC3104p.m15650a(8.0f);
                }
                m15698a.leftMargin = AbstractC3104p.m15624A();
                this.f149698t2.addView(this.f149702u2, m15698a);
                this.f149702u2.setLayoutParams(m15698a);
            }
            if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                this.f149702u2.setData(mediaItem);
                this.f149570M0.setVisibility(0);
                RecyclingImageView recyclingImageView = this.f149570M0;
                recyclingImageView.setBackgroundColor(AbstractC23136l9.m118641B(recyclingImageView.getContext(), AbstractC16801x.white_50));
                ((C23528a) this.f149662k2.m123612r(this.f149570M0)).m123579C(mediaItem.mo41081Q(), C23278z2.m120120d0(), new C32435p(mediaItem));
            }
            this.f149702u2.setVisibility(4);
            if (this.f149686q2.m117176y0()) {
                mo138425vt(this.f149691r3.mo138281Vd());
                return;
            }
            this.f149702u2.setListener(new C32436q(file));
            if (this.f149525A2 == null) {
                this.f149525A2 = new Runnable() { // from class: vo0.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZmInCallActivity.this.mo138342JH();
                    }
                };
            }
            this.f149642f2.postDelayed(this.f149525A2, 10000L);
            AbstractC3082b0.m15421c("ZmInCallActivity_Log", "FilePath = " + file.getPath());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jk */
    public /* synthetic */ void m156778Jk(View view) {
        m157102Nr(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jn */
    public /* synthetic */ void m156779Jn() {
        try {
            this.f149570M0.setVisibility(8);
            this.f149570M0.setScaleX(1.0f);
            this.f149570M0.setScaleY(1.0f);
            this.f149570M0.setX(0.0f);
            this.f149570M0.setY(0.0f);
            mo138425vt(this.f149691r3.mo138281Vd());
            NewPhotoSuggestView newPhotoSuggestView = this.f149702u2;
            if (newPhotoSuggestView != null) {
                newPhotoSuggestView.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jo */
    public /* synthetic */ void m156780Jo(C25937a c25937a, boolean z11) {
        try {
            AbstractC3082b0.m15424f("CallBg", "use bg " + c25937a);
            RecyclingImageView recyclingImageView = this.f149594T1;
            if (recyclingImageView == null) {
                return;
            }
            long j11 = 0;
            if (c25937a == null) {
                if (recyclingImageView.getVisibility() == 0) {
                    RecyclingImageView recyclingImageView2 = this.f149594T1;
                    if (z11) {
                        j11 = 300;
                    }
                    AbstractC3085d.m15443e(recyclingImageView2, false, j11);
                }
            } else {
                if (c25937a.m133637b() == null) {
                    return;
                }
                if (this.f149594T1.getVisibility() == 0) {
                    if (this.f149594T1.getTag() != c25937a.m133639d()) {
                        if (z11) {
                            m156707Ab(c25937a);
                        } else {
                            this.f149594T1.setTag(c25937a.m133639d());
                            this.f149594T1.setImageBitmap(c25937a.m133637b());
                        }
                    }
                } else {
                    this.f149594T1.setTag(c25937a.m133639d());
                    this.f149594T1.setImageBitmap(c25937a.m133637b());
                    RecyclingImageView recyclingImageView3 = this.f149594T1;
                    if (z11) {
                        j11 = 300;
                    }
                    AbstractC3085d.m15443e(recyclingImageView3, true, j11);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Ju */
    private void m156781Ju() {
        AbstractC17930e.m94545d().mo94527a("snapshotSelfView", new Runnable() { // from class: vo0.f4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157051wo();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Kj */
    public /* synthetic */ void m156786Kj(View view) {
        m157102Nr(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Kl */
    public /* synthetic */ void m156787Kl() {
        this.f149642f2.post(new Runnable() { // from class: vo0.z1
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156769Il();
            }
        });
    }

    /* renamed from: Kr */
    private void m156788Kr(Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("success", intValue);
                    if (intValue == 1) {
                        jSONObject.put("extraData", objArr[1]);
                    }
                    m156894Zv("js.action.call.self_snapshot", jSONObject);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: Kw */
    private void m156789Kw() {
        boolean z11;
        VoIPButtonWithText voIPButtonWithText = this.f149693s1;
        if (!this.f149549G2 && !this.f149557I2) {
            z11 = false;
        } else {
            z11 = true;
        }
        voIPButtonWithText.m157425j(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Lb */
    public void m156793Lb() {
        if (!AbstractC32273e3.m155748Q().mo155888i2()) {
            return;
        }
        int i11 = this.f149569L2;
        if (i11 == 2) {
            RingBackTonePreviewView ringBackTonePreviewView = this.f149629c1;
            if (ringBackTonePreviewView != null) {
                AbstractC3085d.m15442d(ringBackTonePreviewView, true);
                this.f149629c1.m157387d(this.f149686q2.m117025G());
                this.f149629c1.setOnBtnClick(new InterfaceC18494a() { // from class: vo0.i5
                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        C24848g0 m156742Fi;
                        m156742Fi = ZmInCallActivity.this.m156742Fi();
                        return m156742Fi;
                    }
                });
                return;
            }
            return;
        }
        if (i11 == 1) {
            LinearLayout linearLayout = this.f149617Z0;
            if (linearLayout != null) {
                AbstractC3085d.m15442d(linearLayout, true);
            }
            RobotoTextView robotoTextView = this.f149625b1;
            if (robotoTextView != null && TextUtils.isEmpty(robotoTextView.getText())) {
                this.f149625b1.setText(String.format("%s - %s", this.f149686q2.m117025G().m110004d(), this.f149686q2.m117025G().m110001a()));
            }
            m156970kb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Li */
    public /* synthetic */ void m156794Li(View view) {
        if (AbstractC32273e3.m155748Q().m155815J0() && this.f149686q2.m117126k0() && !this.f149549G2) {
            this.f149634d2.m157184y();
            this.f149634d2.bringToFront();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Lj */
    public /* synthetic */ boolean m156795Lj(int i11, View view, MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            float f11 = this.f149653i1.getmXCenterCir();
            float f12 = this.f149653i1.getmYCenterCir();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f149653i1.m157288h();
                        }
                    } else {
                        float sqrt = (float) Math.sqrt(Math.pow(Math.abs(motionEvent.getRawX() - f11), 2.0d) + Math.pow(Math.abs(motionEvent.getRawY() - f12), 2.0d));
                        if (sqrt >= (i11 >> 1) - 10) {
                            this.f149653i1.m157291k(sqrt);
                            if (this.f149653i1.getRadiusBackgroundSwipe() - sqrt <= 0.0f && !this.f149627b3) {
                                this.f149627b3 = true;
                                m157102Nr(4);
                            }
                        }
                    }
                } else if (!this.f149627b3) {
                    m157102Nr(4);
                }
            } else {
                this.f149627b3 = false;
                this.f149653i1.m157289i();
                this.f149653i1.m157291k(0.0f);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "answerBtn.setOnTouchListener " + e11.getMessage(), e11);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Lk */
    public /* synthetic */ void m156796Lk(View view) {
        m157102Nr(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Lo */
    public /* synthetic */ void m156797Lo(boolean z11) {
        AbstractC3085d.m15443e(this.f149616Z, z11, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Lp */
    public /* synthetic */ void m156798Lp(String str, boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_unstable_connecting_partner), str));
        if (this.f149565K2) {
            m156947gs();
        }
        m156825Ps(true, false, true, false);
        mo138353N6(z11);
    }

    /* renamed from: Mh */
    private void m156802Mh(int i11) {
        try {
            this.f149572M2 = i11;
            if (this.f149606W1 == null) {
                m156767Ic();
            } else {
                m157092Kt(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Mk */
    public /* synthetic */ void m156803Mk(View view) {
        this.f149691r3.mo138307tf(22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ml */
    public /* synthetic */ void m156804Ml(Object[] objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof JSONObject) {
                        m157003pr(new C17244x0(41, (JSONObject) obj).m92064b());
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: Mr */
    private void m156805Mr() {
        if (this.f149643f3) {
            m157130lh();
        }
        this.f149691r3.mo138297l5(new Object[0]);
        this.f149691r3.mo138275Sb(true);
        m157064xu();
    }

    /* renamed from: Mt */
    private void m156806Mt(int i11) {
        m156817Ot(i11, null);
    }

    /* renamed from: Ng */
    private void m156809Ng(final Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            runOnUiThread(new Runnable() { // from class: vo0.a5
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.this.m156997om(intent);
                }
            });
        }
    }

    /* renamed from: Nq */
    private void m156810Nq() {
        LinearLayout linearLayout;
        if (this.f149606W1 != null && (linearLayout = this.f149614Y1) != null) {
            this.f149683p3 = linearLayout.getMeasuredHeight();
            GestureBottomLayout gestureBottomLayout = this.f149610X1;
            if (gestureBottomLayout != null) {
                gestureBottomLayout.setMinPosition(m156873Wf());
                this.f149610X1.setMaxPosition(m156873Wf());
            }
            if (this.f149643f3) {
                m157092Kt(this.f149572M2);
            }
        }
    }

    /* renamed from: Of */
    private int m156814Of() {
        if (m156874Wh()) {
            if (this.f149691r3.mo138268Po()) {
                return AbstractC3104p.m15686s();
            }
            return AbstractC3104p.m15684r();
        }
        return AbstractC3104p.m15682q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Oj */
    public /* synthetic */ void m156815Oj(View view) {
        this.f149691r3.mo138307tf(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ok */
    public /* synthetic */ void m156816Ok(View view) {
        this.f149691r3.mo138269Q5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ot */
    public void m156817Ot(int i11, String str) {
        int m155566Q = VoipAudioHelper.m155566Q();
        if (i11 == AbstractC8020f0.call_popup_speaker_bluetooth) {
            C22626t c22626t = this.f149686q2;
            if (c22626t != null && c22626t.m117160t() != i11) {
                if ((this.f149679o3 == m155566Q && System.currentTimeMillis() - this.f149687q3 < 3000) || this.f149659j3 == 0 || !this.f149549G2) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f149679o3 = m155566Q;
        this.f149687q3 = System.currentTimeMillis();
        this.f149642f2.removeCallbacks(this.f149566K3);
        AbstractC3085d.m15443e(this.f149590S1, true, 500L);
        if (TextUtils.isEmpty(str)) {
            this.f149590S1.setText(i11);
        } else {
            this.f149590S1.setText(str);
        }
        this.f149642f2.postDelayed(this.f149566K3, 4000L);
        this.f149686q2.m117009A1(i11);
    }

    /* renamed from: Ow */
    private void m156818Ow(int i11, String str) {
        switch (i11) {
            case 1:
                m156908bw();
                break;
            case 2:
            case 5:
                CircleBackgroundImageView circleBackgroundImageView = this.f149613Y0;
                if (circleBackgroundImageView != null) {
                    circleBackgroundImageView.setSelected(false);
                    this.f149613Y0.setEnabled(true);
                }
                m157054wu(AbstractC16803z.ic_call_switch_video_error, getString(AbstractC8020f0.str_call_switch_vi_fail_noti), 10000);
                break;
            case 3:
                CircleBackgroundImageView circleBackgroundImageView2 = this.f149613Y0;
                if (circleBackgroundImageView2 != null) {
                    circleBackgroundImageView2.setSelected(false);
                    this.f149613Y0.setEnabled(true);
                }
                m157054wu(AbstractC16803z.ic_call_switch_video_error, str, 10000);
                break;
            case 4:
                CircleBackgroundImageView circleBackgroundImageView3 = this.f149613Y0;
                if (circleBackgroundImageView3 != null) {
                    circleBackgroundImageView3.setSelected(false);
                    this.f149613Y0.setEnabled(true);
                }
                m156868Vt(AbstractC16803z.ic_call_switch_video_error, Html.fromHtml(String.format(getString(AbstractC8020f0.str_call_switch_vi_unsupport_noti), this.f149686q2.m117049O(getContext(), 10))), 10000);
                break;
            case 6:
                m156805Mr();
                break;
            case 7:
                m156981mb(false);
                break;
            case 8:
                if (mo138358P0()) {
                    if (this.f149686q2.m117038K0()) {
                        m157054wu(AbstractC16803z.ic_call_switch_video_success, getString(AbstractC8020f0.str_call_switch_vi_success_noti), 10000);
                        AbstractC32273e3.m155748Q().mo155919t(true);
                        m156981mb(true);
                        break;
                    }
                } else {
                    mo138422u2(139);
                    break;
                }
                break;
        }
        BottomCallView bottomCallView = this.f149606W1;
        if (bottomCallView != null && this.f149610X1 != null && this.f149614Y1 != null) {
            this.f149588S.removeView(bottomCallView);
            this.f149588S.addView(this.f149606W1, AbstractC3105q.m15698a(-1, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pg */
    public void m156820Pg(AbstractC25751q abstractC25751q) {
        if (abstractC25751q instanceof C25739e) {
            AbstractC32273e3.m155748Q().mo155930v2(((C25739e) abstractC25751q).m132861h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pj */
    public /* synthetic */ void m156821Pj(View view) {
        m157102Nr(31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pk */
    public /* synthetic */ void m156822Pk(View view) {
        this.f149691r3.mo138295jj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pl */
    public /* synthetic */ void m156823Pl() {
        AbstractC23034c6.m118186w0(this, AbstractC23034c6.f112036m, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pm */
    public /* synthetic */ C1580n1 m156824Pm(View view, C1580n1 c1580n1) {
        return m156734Er(c1580n1.m8055g(C1580n1.m.m8118f() | C1580n1.m.m8113a()));
    }

    /* renamed from: Ps */
    private void m156825Ps(boolean z11, boolean z12, boolean z13, boolean z14) {
        m156842Rs(z11, z12, z13, z14, false);
    }

    /* renamed from: Pw */
    private void m156826Pw(View view, boolean z11, boolean z12) {
        int i11;
        if (view == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        view.setEnabled(z12);
    }

    /* renamed from: Qf */
    private int m156830Qf() {
        return m156814Of() + ((AbstractC3104p.m15670k() * 8) / 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qk */
    public /* synthetic */ void m156831Qk(View view) {
        m157102Nr(31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qo */
    public /* synthetic */ void m156832Qo() {
        int m117089b = this.f149686q2.m117089b();
        if (m117089b != -1) {
            if (m117089b != 0) {
                if (m117089b == 1) {
                    this.f149573N0.setVisibility(0);
                    this.f149573N0.setSelected(true);
                    return;
                }
                return;
            }
            this.f149573N0.setVisibility(0);
            this.f149573N0.setSelected(false);
            return;
        }
        this.f149573N0.setVisibility(8);
    }

    /* renamed from: Rf */
    private int m156836Rf() {
        return Math.max((AbstractC3104p.f13187d - (AbstractC3104p.m15670k() * 5)) / 2, AbstractC3104p.m15650a(0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rg */
    public void m156837Rg(String str, String str2) {
        char c11;
        try {
            switch (str.hashCode()) {
                case -2110699425:
                    if (str.equals("action.call.flip_camera")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -875024323:
                    if (str.equals("action.call.show_toast")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -276729729:
                    if (str.equals("action.call.self_snapshot")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1614341938:
                    if (str.equals("action.window.close")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            if (c11 != 0) {
                if (c11 != 1) {
                    if (c11 != 2) {
                        if (c11 == 3) {
                            if (this.f149691r3.mo138252G9()) {
                                m157102Nr(9);
                                m156725Dr(true);
                                return;
                            } else {
                                m156725Dr(false);
                                return;
                            }
                        }
                        return;
                    }
                    String optString = new JSONObject(str2).optString("message");
                    if (!TextUtils.isEmpty(optString)) {
                        AbstractC3096i0.m15518U0(optString);
                        return;
                    }
                    return;
                }
                if (this.f149691r3.mo138302n5()) {
                    m157102Nr(39);
                    return;
                } else {
                    m156788Kr(0);
                    return;
                }
            }
            mo138364Sv(false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rn */
    public /* synthetic */ void m156838Rn(int i11, int i12, int i13, boolean z11) {
        try {
            CallStickerView callStickerView = this.f149567L0;
            if (callStickerView == null) {
                return;
            }
            callStickerView.m157273j();
            C25630b c25630b = new C25630b();
            c25630b.m132405O(i11);
            c25630b.m132414X(i12);
            c25630b.m132410T(i13);
            C25630b m143282P0 = C28644j.m143233Y().m143282P0(c25630b);
            String str = System.currentTimeMillis() + "";
            if (m143282P0.m132448z()) {
                if (z11) {
                    if (C28181s2.f131306a.m141728p(m143282P0, this.f149567L0.getForceUsePNGList())) {
                    }
                }
                CallStickerView callStickerView2 = this.f149567L0;
                if (callStickerView2 != null) {
                    callStickerView2.m157272i(m143282P0, str, false);
                }
            } else if (!z11 || AbstractC24006q.m125853Z1(m143282P0.m132446x())) {
                C28020b3.f130648a.m141182F(this.f149567L0, this.f149662k2, m143282P0, null, false, new C32439t());
            }
            AbstractC3085d.m15442d(this.f149567L0, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ro */
    public /* synthetic */ void m156839Ro(boolean z11) {
        AbstractC3085d.m15442d(this.f149633d1, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rp */
    public /* synthetic */ void m156840Rp(String str, boolean z11) {
        if (this.f149632d0 == null) {
            return;
        }
        this.f149632d0.setText(String.format("%s\n%s", String.format(getString(AbstractC8020f0.call_remote_poor_signal), str), AbstractC23136l9.m118743r0(AbstractC8020f0.str_reconnecting)));
        m156825Ps(true, true, false, false);
        mo138353N6(z11);
    }

    /* renamed from: Rq */
    private void m156841Rq() {
        if (this.f149590S1 != null) {
            int m15682q = AbstractC3104p.m15682q() + AbstractC3104p.m15668j() + AbstractC3104p.m15675m0() + AbstractC3104p.m15650a(20.0f);
            if (this.f149557I2) {
                m15682q += AbstractC3104p.m15650a(20.0f);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149590S1.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, m15682q);
            this.f149590S1.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: Rs */
    private void m156842Rs(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        int i11;
        int i12;
        int i13;
        ProgressBar progressBar = this.f149620a0;
        if (progressBar != null && this.f149624b0 != null && this.f149628c0 != null && this.f149636e0 != null) {
            int i14 = 0;
            if (!this.f149565K2 && z11) {
                progressBar.setVisibility(8);
                this.f149624b0.setVisibility(8);
            } else {
                if (z13) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                progressBar.setVisibility(i11);
                CircleIconLoadingView circleIconLoadingView = this.f149624b0;
                if (z12) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                circleIconLoadingView.setVisibility(i12);
            }
            AppCompatImageView appCompatImageView = this.f149628c0;
            if (z14) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            appCompatImageView.setVisibility(i13);
            Button button = this.f149636e0;
            if (!z15) {
                i14 = 8;
            }
            button.setVisibility(i14);
        }
    }

    /* renamed from: Sc */
    private void m156844Sc(final int i11) {
        CircleBackgroundAnswer circleBackgroundAnswer = new CircleBackgroundAnswer(getContext());
        this.f149657j1 = circleBackgroundAnswer;
        circleBackgroundAnswer.setDiameter(i11);
        this.f149657j1.setVisibility(8);
        this.f149588S.addView(this.f149657j1);
        this.f149713x1 = new C32417e0(getContext(), 3);
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        m15701d.leftMargin = Math.min(AbstractC3104p.m15659e0(), AbstractC3104p.m15657d0()) / 4;
        this.f149713x1.m157424i(m15702e).m157425j(this.f149557I2).m157421f(getString(AbstractC8020f0.str_call_incom_switch_vi_acbtn)).m157418c(AbstractC3105q.m15703f(i11, i11)).m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_answer_video_selector));
        this.f149713x1.setId(AbstractC6918a0.call_acceptSwitchVideoBtn);
        this.f149713x1.getButton().setContentDescription("Accept switch video call");
        this.f149713x1.setLayoutParams(m15701d);
        this.f149713x1.setAlignmentTextView(4);
        this.f149713x1.setVisibility(8);
        this.f149713x1.getButton().setOnTouchListener(new View.OnTouchListener() { // from class: vo0.q3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m156753Gj;
                m156753Gj = ZmInCallActivity.this.m156753Gj(i11, view, motionEvent);
                return m156753Gj;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sj */
    public /* synthetic */ void m156845Sj(View view) {
        if (this.f149553H2) {
            m157102Nr(8);
        }
        this.f149691r3.mo138307tf(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sl */
    public /* synthetic */ void m156846Sl(int i11) {
        try {
            if (i11 != EnumC17859r.STOP_CAPTURE.ordinal() && i11 != EnumC17859r.START_CAPTURE.ordinal() && i11 != EnumC17859r.AUTO_STOP_CAPTURE.ordinal()) {
                if (i11 == EnumC17859r.SWITCH_CAMERA.ordinal()) {
                    AbstractC3082b0.m15421c("ZmInCallActivity_Log", "SWITCH CAMERA DONE:  = " + this.f149686q2.m117110g0());
                    this.f149631c3 = false;
                    m156926ec();
                    TextureViewRenderer textureViewRenderer = this.f149664l0;
                    if (textureViewRenderer != null) {
                        textureViewRenderer.setMirror(!this.f149686q2.m117110g0());
                        return;
                    }
                    return;
                }
                if ((i11 == EnumC17859r.PARTNER_AUTO_START_CAPTURE.ordinal() || i11 == EnumC17859r.PARTNER_AUTO_STOP_CAPTURE.ordinal() || i11 == EnumC17859r.PARTNER_MANUAL_START_CAPTURE.ordinal() || i11 == EnumC17859r.PARTNER_MANUAL_STOP_CAPTURE.ordinal() || i11 == EnumC17859r.DETECT_LOSS_VIDEO.ordinal() || i11 == EnumC17859r.DETECT_RECEIVE_VIDEO.ordinal()) && this.f149686q2.m117113h() == 5 && this.f149686q2.m117047N0()) {
                    AbstractC3082b0.m15421c("ZmInCallActivity_Log", "PARTNER CAMERA STATE: partner = " + this.f149686q2.m117175y() + " ; detect loss video = " + this.f149686q2.m117130l0());
                    this.f149691r3.mo138298l9();
                    this.f149691r3.mo138304q6();
                    mo138425vt(this.f149691r3.mo138281Vd());
                    return;
                }
                return;
            }
            if (!this.f149686q2.m117067U()) {
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "CAPTURE CAMERA STATE:  = " + this.f149686q2.m117114h0());
                this.f149635d3 = this.f149686q2.m117114h0();
                this.f149691r3.mo138279Uf();
                if (this.f149686q2.m117126k0()) {
                    m156926ec();
                }
                TextureViewRenderer textureViewRenderer2 = this.f149664l0;
                if (textureViewRenderer2 != null) {
                    textureViewRenderer2.setMirror(!this.f149686q2.m117110g0());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sn */
    public /* synthetic */ void m156847Sn() {
        m157019sb();
        mo138341Iu();
    }

    /* renamed from: Tf */
    private int m156851Tf() {
        return AbstractC3104p.m15657d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Tl */
    public /* synthetic */ void m156852Tl(int i11, Object[] objArr) {
        try {
            m157104Og(i11, objArr);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "handleNotificationCall failed", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: To */
    public /* synthetic */ void m156853To(View view) {
        if (!this.f149686q2.m117114h0()) {
            this.f149691r3.mo138307tf(12);
        }
    }

    /* renamed from: Tu */
    private void m156854Tu() {
        if (this.f149572M2 == 13) {
            C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 1, "call_audio_switch_video_dialog", new String[0]).m123926s(String.valueOf(System.currentTimeMillis() - this.f149575N2)), false);
        }
    }

    /* renamed from: Uc */
    private void m156856Uc(boolean z11) {
        final int m15668j = AbstractC3104p.m15668j();
        CircleBackgroundAnswer circleBackgroundAnswer = new CircleBackgroundAnswer(getContext());
        this.f149653i1 = circleBackgroundAnswer;
        circleBackgroundAnswer.setId(AbstractC6918a0.call_answerBackground);
        this.f149653i1.setDiameter(m15668j);
        this.f149653i1.setVisibility(8);
        this.f149689r1 = new C32415d0(getContext(), 3);
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        m15701d.leftMargin = Math.min(AbstractC3104p.m15659e0(), AbstractC3104p.m15657d0()) / 4;
        this.f149689r1.m157424i(m15702e).m157425j(this.f149557I2).m157421f(getString(AbstractC8020f0.str_call_accept_button_text)).m157418c(AbstractC3105q.m15703f(m15668j, m15668j)).m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_answer_audio_selector));
        this.f149689r1.setId(AbstractC6918a0.call_answerBtn);
        this.f149689r1.getButton().setContentDescription("Accept call");
        this.f149689r1.setLayoutParams(m15701d);
        this.f149689r1.setAlignmentTextView(4);
        if (z11) {
            this.f149689r1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.b5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156786Kj(view);
                }
            });
        } else {
            this.f149689r1.getButton().setOnTouchListener(new View.OnTouchListener() { // from class: vo0.c5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m156795Lj;
                    m156795Lj = ZmInCallActivity.this.m156795Lj(m15668j, view, motionEvent);
                    return m156795Lj;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ui */
    public /* synthetic */ void m156857Ui(View view) {
        m156854Tu();
        m157130lh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Uj */
    public /* synthetic */ boolean m156858Uj(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f149691r3.mo138249Cb();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Uo */
    public /* synthetic */ void m156859Uo(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView != null && this.f149636e0 != null) {
            robotoTextView.setText(AbstractC8020f0.str_call_cam_error_local);
            this.f149636e0.setText(AbstractC8020f0.str_call_cam_error_local_cta);
            this.f149636e0.setOnClickListener(new View.OnClickListener() { // from class: vo0.u1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156853To(view);
                }
            });
            m156842Rs(false, false, false, true, true);
            mo138353N6(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Up */
    public /* synthetic */ void m156860Up(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(getString(AbstractC8020f0.str_call_speaker_error_partner, this.f149686q2.m117049O(getContext(), 10)));
        m156825Ps(false, true, false, false);
        mo138353N6(z11);
    }

    /* renamed from: Uq */
    private void m156861Uq() {
        LiveEmojiButton liveEmojiButton = this.f149716y0;
        if (liveEmojiButton != null && (liveEmojiButton.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149716y0.getLayoutParams();
            layoutParams.bottomMargin = m156892Zf() - AbstractC3104p.m15650a(4.0f);
            layoutParams.rightMargin = AbstractC3104p.m15625B() - AbstractC3104p.m15650a(5.0f);
            this.f149716y0.setLayoutParams(layoutParams);
        }
        CircleBackgroundImageView circleBackgroundImageView = this.f149720z0;
        if (circleBackgroundImageView != null && (circleBackgroundImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f149720z0.getLayoutParams();
            layoutParams2.bottomMargin = m156892Zf() + m156717Cg();
            layoutParams2.rightMargin = AbstractC3104p.m15625B();
            this.f149720z0.setLayoutParams(layoutParams2);
        }
        CircleBackgroundImageView circleBackgroundImageView2 = this.f149681p1;
        if (circleBackgroundImageView2 != null && (circleBackgroundImageView2.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f149681p1.getLayoutParams();
            layoutParams3.bottomMargin = m156892Zf() + m156714Bg();
            layoutParams3.rightMargin = AbstractC3104p.m15625B();
            this.f149681p1.setLayoutParams(layoutParams3);
        }
    }

    /* renamed from: Ve */
    private void m156866Ve(boolean z11) {
        int i11 = this.f149569L2;
        if (i11 == 1) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f149617Z0 = linearLayout;
            linearLayout.setId(AbstractC6918a0.call_ring_back_tone_container);
            this.f149617Z0.setBackgroundResource(AbstractC16803z.bg_rbt_in_call);
            RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(-2, -2);
            m15705h.topMargin = AbstractC3104p.m15650a(6.0f);
            if (z11) {
                m15705h.addRule(3, AbstractC6918a0.call_vidCallStatus);
            } else {
                m15705h.addRule(3, AbstractC6918a0.call_switcherInCallStatus);
            }
            m15705h.addRule(14);
            this.f149617Z0.setLayoutParams(m15705h);
            this.f149617Z0.setGravity(17);
            this.f149617Z0.setOrientation(0);
            this.f149617Z0.setVisibility(8);
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            this.f149625b1 = robotoTextView;
            robotoTextView.setId(AbstractC6918a0.call_ring_back_tone_info);
            LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
            m15701d.setMargins(AbstractC3104p.m15650a(7.0f), AbstractC3104p.m15650a(5.0f), AbstractC3104p.m15650a(14.0f), AbstractC3104p.m15650a(5.0f));
            this.f149625b1.setLayoutParams(m15701d);
            this.f149625b1.setGravity(17);
            this.f149625b1.setMaxWidth(AbstractC3104p.m15650a(180.0f));
            this.f149625b1.mo75850g(true);
            this.f149625b1.setTextSize(1, 14.0f);
            this.f149625b1.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.call_text_partner_off_mic));
            this.f149625b1.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.f149625b1.setMarqueeRepeatLimit(-1);
            this.f149625b1.setSingleLine();
            this.f149625b1.setFocusable(true);
            this.f149625b1.setSelected(true);
            RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
            this.f149621a1 = recyclingImageView;
            recyclingImageView.setId(AbstractC6918a0.call_ring_back_tone_icon);
            this.f149621a1.setImageResource(AbstractC16803z.ic_call_rbt);
            LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(20, 20);
            m15701d2.setMargins(AbstractC3104p.m15650a(5.0f), AbstractC3104p.m15650a(5.0f), 0, AbstractC3104p.m15650a(5.0f));
            this.f149621a1.setLayoutParams(m15701d2);
            this.f149617Z0.addView(this.f149621a1);
            this.f149617Z0.addView(this.f149625b1);
            return;
        }
        if (i11 == 2) {
            RingBackTonePreviewView ringBackTonePreviewView = new RingBackTonePreviewView(getContext());
            this.f149629c1 = ringBackTonePreviewView;
            ringBackTonePreviewView.setId(AbstractC6918a0.call_ring_back_tone_quick_set_container);
            this.f149629c1.setBackgroundResource(AbstractC16803z.bg_rbt_in_call);
            RelativeLayout.LayoutParams m15705h2 = AbstractC3105q.m15705h(-2, -2);
            m15705h2.setMargins(AbstractC3104p.m15650a(15.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(15.0f), 0);
            if (z11) {
                m15705h2.addRule(3, AbstractC6918a0.call_vidCallStatus);
            } else {
                m15705h2.addRule(3, AbstractC6918a0.call_switcherInCallStatus);
            }
            m15705h2.addRule(14);
            this.f149629c1.setLayoutParams(m15705h2);
            this.f149629c1.setGravity(17);
            this.f149629c1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Vp */
    public /* synthetic */ void m156867Vp(boolean z11) {
        if (this.f149632d0 == null) {
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_unstable_change_network);
        if (!this.f149565K2) {
            m118743r0 = m118743r0 + "\n" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_reconnecting);
        }
        this.f149632d0.setText(m118743r0);
        if (this.f149565K2) {
            m156991ns();
        }
        m156825Ps(true, false, true, false);
        mo138353N6(z11);
    }

    /* renamed from: Vt */
    private void m156868Vt(int i11, Spanned spanned, int i12) {
        if (mo138335F2()) {
            return;
        }
        if (this.f149661k1 == null) {
            m156888Yd();
        }
        ToastCountdownCustomView toastCountdownCustomView = this.f149661k1;
        if (toastCountdownCustomView != null) {
            toastCountdownCustomView.bringToFront();
            this.f149661k1.m157458g(i11, spanned, i12);
        }
    }

    /* renamed from: Vw */
    private void m156869Vw(boolean z11) {
        int i11;
        VoIPButtonWithText voIPButtonWithText = this.f149685q1;
        if (voIPButtonWithText == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        voIPButtonWithText.setVisibility(i11);
    }

    /* renamed from: Wf */
    private int m156873Wf() {
        return m156851Tf() - this.f149683p3;
    }

    /* renamed from: Wh */
    private boolean m156874Wh() {
        if (this.f149549G2 && ((this.f149691r3.mo138287c1() || this.f149686q2.m117126k0()) && !this.f149691r3.mo138271Qd() && !mo138347L4())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wn */
    public /* synthetic */ void m156875Wn() {
        this.f149656j0.m157410g(SpringCallView.EnumC32504b.SCALE_TO_NORMAL, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xi */
    public /* synthetic */ void m156880Xi() {
        this.f149658j2 = 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xl */
    public /* synthetic */ void m156881Xl(Object[] objArr) {
        try {
            int intValue = ((Integer) objArr[0]).intValue();
            String str = "";
            if (objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof String) {
                    str = (String) obj;
                }
            }
            m156818Ow(intValue, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xm */
    public /* synthetic */ void m156882Xm(String[] strArr, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23034c6.m118186w0(this, strArr, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xo */
    public /* synthetic */ void m156884Xo(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(AbstractC8020f0.str_call_mic_error_local);
        m156825Ps(false, false, false, true);
        mo138353N6(z11);
    }

    /* renamed from: Yd */
    private synchronized void m156888Yd() {
        if (this.f149661k1 != null) {
            return;
        }
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        m15698a.leftMargin = AbstractC3104p.m15650a(16.0f);
        m15698a.rightMargin = AbstractC3104p.m15650a(16.0f);
        m15698a.topMargin = AbstractC3104p.m15650a(40.0f);
        ToastCountdownCustomView toastCountdownCustomView = new ToastCountdownCustomView(getContext());
        this.f149661k1 = toastCountdownCustomView;
        toastCountdownCustomView.setLayoutParams(m15698a);
        this.f149661k1.setVisibility(8);
        this.f149588S.addView(this.f149661k1);
    }

    /* renamed from: Ye */
    private void m156889Ye() {
        CircleBackgroundImageView circleBackgroundImageView = new CircleBackgroundImageView(getContext());
        this.f149720z0 = circleBackgroundImageView;
        circleBackgroundImageView.setId(AbstractC6918a0.call_stickerBtn);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15674m(), AbstractC3104p.m15674m());
        m15700c.gravity = 85;
        m15700c.bottomMargin = m156892Zf() + m156717Cg();
        m15700c.rightMargin = AbstractC3104p.m15625B();
        this.f149720z0.setLayoutParams(m15700c);
        this.f149720z0.setVisibility(4);
        this.f149720z0.m157292f(C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_sticker_solid_24), AbstractC23136l9.m118645D(getContext(), AbstractC16801x.call_icon_color_selector));
        this.f149720z0.setRightRedDot(true);
        this.f149720z0.setRedDotMarginLeft(0);
        this.f149720z0.setOnClickListener(new View.OnClickListener() { // from class: vo0.h4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156944gl(view);
            }
        });
        this.f149588S.addView(this.f149720z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Yk */
    public /* synthetic */ void m156890Yk(View view) {
        m157102Nr(9);
    }

    /* renamed from: Ys */
    private void m156891Ys(boolean z11) {
        C21709f c21709f = this.f149534C3;
        if (c21709f != null) {
            c21709f.m112046s(0.0d);
        }
        C21709f c21709f2 = this.f149546F3;
        if (c21709f2 != null) {
            c21709f2.m112046s(0.0d);
        }
        CircleBackgroundImageView circleBackgroundImageView = this.f149586R1;
        if (circleBackgroundImageView != null) {
            circleBackgroundImageView.setEnabled(z11);
            if (!z11) {
                this.f149586R1.setClickable(true);
            }
        }
    }

    /* renamed from: Zf */
    private int m156892Zf() {
        return AbstractC3104p.m15638O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zn */
    public /* synthetic */ void m156893Zn(boolean z11) {
        int i11;
        AppCompatImageView appCompatImageView = this.f149576O0;
        if (appCompatImageView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            appCompatImageView.setVisibility(i11);
        }
    }

    /* renamed from: Zv */
    private void m156894Zv(String str, JSONObject jSONObject) {
        String str2;
        ZaloZinstantLayout zaloZinstantLayout = this.f149669m1;
        if (zaloZinstantLayout != null) {
            if (jSONObject != null) {
                str2 = jSONObject.toString();
            } else {
                str2 = null;
            }
            zaloZinstantLayout.m91999q0(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ak */
    public /* synthetic */ void m156900ak(View view) {
        m157102Nr(30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: al */
    public /* synthetic */ void m156901al(View view) {
        this.f149691r3.mo138307tf(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aq */
    public /* synthetic */ void m156902aq(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(AbstractC8020f0.str_call_switch_state);
        m156825Ps(false, true, false, false);
        mo138353N6(z11);
    }

    /* renamed from: ar */
    private void m156903ar() {
        if (this.f149709w1 != null && this.f149686q2.m117026G0()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149709w1.getLayoutParams();
            layoutParams.bottomMargin = m156830Qf();
            this.f149709w1.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: as */
    public void m156904as() {
        float x11 = this.f149702u2.getX() + (this.f149702u2.getWidth() / 2.0f);
        AbstractC3085d.m15453o(this.f149570M0, (x11 - (this.f149570M0.getWidth() / 2.0f)) - this.f149570M0.getX(), ((this.f149702u2.getY() + (this.f149702u2.getHeight() / 2.0f)) - (this.f149570M0.getHeight() / 2.0f)) - this.f149570M0.getY(), this.f149702u2.f61259y / this.f149570M0.getWidth(), this.f149702u2.f61260z / this.f149570M0.getHeight(), new AbstractC3085d.m() { // from class: vo0.p2
            @Override // bp0.AbstractC3085d.m
            /* renamed from: a */
            public final void mo15465a() {
                ZmInCallActivity.this.m156779Jn();
            }

            @Override // bp0.AbstractC3085d.m
            /* renamed from: b */
            public /* synthetic */ void mo15466b() {
                AbstractC3087e.m15469b(this);
            }

            @Override // bp0.AbstractC3085d.m
            /* renamed from: c */
            public /* synthetic */ void mo15467c() {
                AbstractC3087e.m15468a(this);
            }
        });
    }

    /* renamed from: bb */
    private boolean m156907bb(int i11) {
        String[] m157049wg = m157049wg(this.f149686q2.m117047N0());
        if (AbstractC3108t.m15712a(getBaseContext(), m157049wg) != 0) {
            AbstractC23034c6.m118186w0(this, m157049wg, 200);
            return false;
        }
        AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40001));
        AbstractC32273e3.m155748Q().mo116931c(i11);
        return true;
    }

    /* renamed from: bw */
    private void m156908bw() {
        this.f149691r3.mo138297l5(new Object[0]);
        this.f149691r3.mo138245A8();
        this.f149691r3.mo138275Sb(true);
        m157054wu(AbstractC16803z.ic_call_switch_video_success, getString(AbstractC8020f0.str_call_switch_vi_success_noti), 10000);
    }

    /* renamed from: bx */
    private void m156909bx(boolean z11) {
        int i11;
        LinearLayout linearLayout = this.f149672n0;
        if (linearLayout == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cm */
    public /* synthetic */ void m156912cm() {
        setRequestedOrientation(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cp */
    public /* synthetic */ void m156913cp(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(AbstractC8020f0.str_call_unstable_connecting_user);
        if (this.f149565K2) {
            m156947gs();
        }
        m156825Ps(true, false, true, false);
        mo138353N6(z11);
    }

    /* renamed from: cx */
    private void m156914cx(boolean z11) {
        int i11;
        CircleBackgroundImageView circleBackgroundImageView = this.f149586R1;
        if (circleBackgroundImageView == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        circleBackgroundImageView.setVisibility(i11);
    }

    /* renamed from: dg */
    private String m156918dg(String str, String str2) {
        return str + str2 + ".jpg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dl */
    public /* synthetic */ void m156919dl(View view) {
        AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40014));
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_minimize", new String[0]).m123926s(String.valueOf(this.f149549G2 ? 1 : 0)), false);
        this.f149691r3.mo138293jf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dp */
    public /* synthetic */ void m156920dp(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(String.format("%s\n%s", AbstractC23136l9.m118743r0(AbstractC8020f0.call_local_poor_signal), AbstractC23136l9.m118743r0(AbstractC8020f0.str_please_check_your_network)));
        m156825Ps(true, true, false, false);
        mo138353N6(z11);
    }

    /* renamed from: dr */
    private void m156921dr() {
        KeyboardDTMFView keyboardDTMFView = this.f149602V1;
        if (keyboardDTMFView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) keyboardDTMFView.getLayoutParams();
            layoutParams.bottomMargin = AbstractC3104p.m15682q() + AbstractC3104p.m15668j() + ((AbstractC3104p.m15682q() * 3) / 4);
            this.f149602V1.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: dx */
    private void m156922dx(boolean z11) {
        int i11;
        VoIPButtonWithText voIPButtonWithText = this.f149701u1;
        if (voIPButtonWithText == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        voIPButtonWithText.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ec */
    public void m156926ec() {
        C22626t c22626t = this.f149686q2;
        if (c22626t != null && c22626t.m117047N0()) {
            if (this.f149686q2.m117098d0() || this.f149686q2.m117126k0()) {
                VoIPButtonWithText voIPButtonWithText = this.f149705v1;
                if (voIPButtonWithText != null && voIPButtonWithText.isSelected() != this.f149686q2.m117114h0()) {
                    this.f149705v1.setSelected(this.f149686q2.m117114h0());
                }
                if (!this.f149631c3) {
                    AnimatorSet animatorSet = this.f149537D2;
                    if (animatorSet == null || !animatorSet.isRunning()) {
                        m156891Ys(m156965ji());
                        mo138382Zh(m156988ni());
                    }
                }
            }
        }
    }

    /* renamed from: ef */
    private RecyclingImageView m156927ef() {
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        recyclingImageView.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        recyclingImageView.setVisibility(0);
        recyclingImageView.setAlpha(0.0f);
        FrameLayout frameLayout = this.f149588S;
        frameLayout.addView(recyclingImageView, frameLayout.indexOfChild(this.f149594T1) + 1);
        return recyclingImageView;
    }

    /* renamed from: eg */
    private int m156928eg() {
        if (!this.f149691r3.mo138312wg() && !this.f149691r3.mo138255Gi() && this.f149691r3.mo138268Po()) {
            return (m156830Qf() + AbstractC3104p.m15639P()) - AbstractC3104p.m15627D();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ej */
    public /* synthetic */ void m156929ej(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i18 != i14 || i16 != i12) {
            m156810Nq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: el */
    public /* synthetic */ void m156930el() {
        this.f149691r3.mo138298l9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eo */
    public /* synthetic */ void m156931eo(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f149642f2.removeMessages(3);
    }

    /* renamed from: fh */
    private void m156935fh() {
        LinearLayout linearLayout = this.f149589S0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        CircleBackgroundImageView circleBackgroundImageView = this.f149613Y0;
        if (circleBackgroundImageView != null) {
            circleBackgroundImageView.setVisibility(8);
        }
        this.f149677o1.removeAllViews();
        this.f149528B1.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi */
    public boolean m156936fi() {
        C22626t c22626t = this.f149686q2;
        if (c22626t != null && !c22626t.m117047N0() && (!this.f149686q2.m117086a0() || this.f149686q2.m117142o0())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fj */
    public /* synthetic */ void m156937fj(View view) {
        CircleBackgroundImageView circleBackgroundImageView;
        if (m156936fi() && (circleBackgroundImageView = this.f149613Y0) != null) {
            circleBackgroundImageView.setSelected(false);
            this.f149613Y0.setEnabled(true);
        }
        m156854Tu();
        m157130lh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fl */
    public /* synthetic */ void m156938fl() {
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "RenderLayout setPivot = " + this.f149604W.getBottom());
        FrameLayout frameLayout = this.f149604W;
        frameLayout.setPivotY((float) frameLayout.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fo */
    public /* synthetic */ void m156939fo(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        C17843b.m94137o().m94161X(25);
        m156806Mt(AbstractC8020f0.str_call_boost_success_text);
        this.f149642f2.removeMessages(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gj */
    public /* synthetic */ void m156943gj() {
        if (this.f149572M2 == 13) {
            m156720Cs();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gl */
    public /* synthetic */ void m156944gl(View view) {
        this.f149691r3.mo138307tf(37);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gn */
    public /* synthetic */ void m156945gn(InterfaceC17463d interfaceC17463d, int i11) {
        C22626t c22626t = this.f149686q2;
        if (c22626t != null && c22626t.m117090b0() && this.f149686q2.m117079Y()) {
            m157112Ug();
        }
    }

    /* renamed from: gr */
    private void m156946gr() {
        int i11;
        int i12;
        if (this.f149656j0 == null || this.f149691r3.mo138256He()) {
            return;
        }
        int[] m15680p = AbstractC3104p.m15680p(this.f149691r3.mo138268Po());
        if (mo138335F2()) {
            i11 = AbstractC3104p.m15679o0();
        } else {
            i11 = m15680p[0];
        }
        if (mo138335F2()) {
            i12 = AbstractC3104p.m15631H();
        } else {
            i12 = m15680p[1];
        }
        if (!this.f149686q2.m117067U()) {
            if (this.f149686q2.m117126k0()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149656j0.getLayoutParams();
                layoutParams.width = i11;
                layoutParams.height = i12;
                layoutParams.rightMargin = m156730Ef();
                layoutParams.topMargin = m156776Jf();
                this.f149656j0.setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = this.f149660k0.getLayoutParams();
            layoutParams2.width = i11;
            layoutParams2.height = i12;
            this.f149660k0.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gs */
    public void m156947gs() {
        int mo138308ue = this.f149691r3.mo138308ue();
        if (this.f149620a0 != null && this.f149584Q2 && mo138308ue >= 0 && mo138308ue != this.f149620a0.getProgress()) {
            this.f149620a0.setProgress(mo138308ue);
            this.f149642f2.removeCallbacks(this.f149703u3);
            this.f149642f2.postDelayed(this.f149703u3, 200L);
        }
    }

    /* renamed from: hc */
    private boolean m156950hc() {
        if (AbstractC0924m0.m3569Xa() && Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ho */
    public /* synthetic */ void m156951ho(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f149691r3.mo138269Q5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hp */
    public /* synthetic */ void m156952hp(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(AbstractC8020f0.str_call_speaker_error_local);
        m156825Ps(false, false, false, true);
        mo138353N6(z11);
    }

    /* renamed from: ie */
    private void m156957ie() {
        if (this.f149691r3.mo138273S4()) {
            m157036ue();
        }
        m156889Ye();
        m156740Fd();
    }

    /* renamed from: ig */
    private int m156958ig() {
        FrameLayout frameLayout;
        if (!this.f149691r3.mo138268Po() && (frameLayout = this.f149604W) != null) {
            if ((((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity & 3) == 3) {
                return 83;
            }
            return 85;
        }
        return 81;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: in */
    public /* synthetic */ void m156959in(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23034c6.m118186w0(this, AbstractC3108t.f13194b, 200);
    }

    /* renamed from: ir */
    private void m156960ir() {
        LinearLayout linearLayout = this.f149640f0;
        if (linearLayout == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.gravity = m156958ig();
        layoutParams.setMargins(AbstractC3104p.m15624A(), 0, AbstractC3104p.m15625B(), m157007qg());
        this.f149640f0.setLayoutParams(layoutParams);
    }

    /* renamed from: jb */
    private void m156963jb() {
        View button;
        try {
            this.f149723z3.m112030a(new C18556p(this.f149697t1.getButton()));
            C21709f c21709f = this.f149526A3;
            if (this.f149549G2) {
                button = this.f149693s1;
            } else {
                button = this.f149693s1.getButton();
            }
            c21709f.m112030a(new C18556p(button));
            this.f149542E3.m112030a(new C18556p(this.f149656j0));
            this.f149550G3.m112030a(new C18556p(this.f149709w1));
            this.f149530B3.m112030a(new C18556p(this.f149705v1.getButton()));
            if (this.f149549G2) {
                this.f149538D3.m112030a(new C18556p(this.f149681p1));
                this.f149546F3.m112030a(new C18556p(this.f149586R1));
                this.f149554H3.m112030a(new C18556p(this.f149701u1.getButton()));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: jd */
    private void m156964jd(boolean z11) {
        this.f149705v1 = new VoIPButtonWithText(getContext(), 3);
        boolean z12 = false;
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        this.f149705v1.setLayoutParams(m15701d);
        this.f149705v1.setClickable(true);
        this.f149705v1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_cam_selector));
        int m15670k = AbstractC3104p.m15670k();
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 16.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        this.f149705v1.m157424i(m15702e).m157421f(getString(AbstractC8020f0.str_call_camera_button_text)).m157425j(this.f149557I2).m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        this.f149705v1.setId(AbstractC6918a0.call_offCameraBtn);
        this.f149705v1.getButton().setContentDescription("On off camera");
        this.f149705v1.setAlignmentTextView(4);
        VoIPButtonWithText voIPButtonWithText = this.f149705v1;
        C22626t c22626t = this.f149686q2;
        if (c22626t != null && c22626t.m117126k0()) {
            z12 = true;
        }
        voIPButtonWithText.setEnabled(z12);
        if (this.f149549G2) {
            if (z11) {
                this.f149705v1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.r5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZmInCallActivity.this.m156815Oj(view);
                    }
                });
                return;
            } else {
                this.f149705v1.getButton().setOnTouchListener(new ViewOnTouchListenerC32425i0(this, 12, this.f149530B3));
                return;
            }
        }
        if (z11) {
            this.f149705v1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.s5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156821Pj(view);
                }
            });
        } else {
            this.f149705v1.getButton().setOnTouchListener(new ViewOnTouchListenerC32425i0(this, 31, this.f149530B3));
        }
    }

    /* renamed from: ji */
    private boolean m156965ji() {
        if (this.f149549G2 && !this.f149686q2.m117114h0() && ((this.f149686q2.m117126k0() || this.f149686q2.m117098d0()) && (!this.f149686q2.m117086a0() || this.f149686q2.m117146p0()))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jl */
    public /* synthetic */ void m156966jl() {
        this.f149691r3.mo138307tf(38);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jo */
    public static /* synthetic */ void m156967jo(InterfaceC17463d interfaceC17463d) {
    }

    /* renamed from: jr */
    private void m156968jr() {
        if (this.f149702u2 != null) {
            FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
            if (this.f149691r3.mo138268Po()) {
                m15698a.gravity = 19;
            } else {
                m15698a.gravity = 51;
                m15698a.topMargin = AbstractC3104p.m15626C() + AbstractC3104p.m15674m() + AbstractC3104p.m15650a(8.0f);
            }
            m15698a.leftMargin = AbstractC3104p.m15624A();
            this.f149702u2.setLayoutParams(m15698a);
        }
    }

    /* renamed from: kb */
    private void m156970kb() {
        if (!this.f149719y3 && this.f149621a1 != null) {
            this.f149719y3 = true;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(2000L);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            this.f149621a1.startAnimation(rotateAnimation);
        }
    }

    /* renamed from: kf */
    private C25297f m156971kf(C28212v6 c28212v6, View view) {
        C25297f m130959a = C25297f.Companion.m130959a(MainApplication.getAppContext());
        m130959a.m130907M(c28212v6, view.getContext());
        m130959a.m130925c0(view);
        m130959a.m130920Z(false);
        m130959a.m130918X(EnumC25294c.TOP);
        m130959a.m130923b0(AbstractC23222t7.f112566j);
        if (TextUtils.equals(c28212v6.f131577c, "tip.videocall.filter_skin")) {
            m130959a.m130916V(true);
        }
        return m130959a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kk */
    public /* synthetic */ void m156972kk(View view) {
        m157102Nr(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kq */
    public /* synthetic */ void m156973kq(boolean z11, boolean z12, String str, boolean z13) {
        AppCompatImageView appCompatImageView;
        int i11;
        int i12;
        if (this.f149652i0 != null && this.f149644g0 != null && (appCompatImageView = this.f149648h0) != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            appCompatImageView.setVisibility(i11);
            AppCompatImageView appCompatImageView2 = this.f149644g0;
            if (z12) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            appCompatImageView2.setVisibility(i12);
            if (str == null) {
                this.f149652i0.setVisibility(8);
            } else {
                this.f149652i0.setText(str);
                this.f149652i0.setVisibility(0);
            }
            mo138398iE(z13);
        }
    }

    /* renamed from: lg */
    private int m156976lg() {
        int i11;
        int m15650a = AbstractC3104p.m15650a(24.0f);
        LinearLayout linearLayout = this.f149640f0;
        if (linearLayout != null) {
            i11 = linearLayout.getHeight();
        } else {
            i11 = 0;
        }
        return Math.max(m15650a, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lk */
    public /* synthetic */ void m156977lk() {
        try {
            if (AbstractC32273e3.m155748Q().mo155783B0() && this.f149686q2.m117126k0()) {
                if (AbstractC32273e3.m155748Q().mo155855W().f123740e) {
                    C17843b.m94137o().m94185k0(false, "");
                    AbstractC32273e3.m155748Q().mo155855W().f123740e = false;
                } else {
                    File m15489G = AbstractC3096i0.m15489G(getContext());
                    C17843b.m94137o().m94185k0(true, m15489G.getPath() + File.separator + AbstractC3096i0.m15566u("wav"));
                    AbstractC32273e3.m155748Q().mo155855W().f123740e = true;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: lw */
    private void m156978lw(int i11) {
        switch (i11) {
            case 1:
            case 3:
            case 4:
            case 6:
                m157087Ev();
                this.f149689r1.clearAnimation();
                this.f149653i1.m157289i();
                this.f149653i1.setVisibility(8);
                if (i11 == 4) {
                    this.f149689r1.setEnabled(false);
                    return;
                } else {
                    this.f149689r1.setVisibility(8);
                    return;
                }
            case 2:
                boolean m117170w0 = this.f149686q2.m117170w0();
                this.f149689r1.setVisibility(0);
                this.f149689r1.setEnabled(m117170w0);
                if (m117170w0) {
                    this.f149653i1.m157288h();
                    this.f149653i1.setVisibility(0);
                    m157105Ou();
                    return;
                }
                return;
            case 5:
                m157087Ev();
                this.f149689r1.clearAnimation();
                this.f149653i1.m157289i();
                return;
            default:
                return;
        }
    }

    /* renamed from: mb */
    private void m156981mb(boolean z11) {
        this.f149611X2 = false;
        m157095Lc();
        m157119af();
        m157117We();
        this.f149691r3.mo138245A8();
        m157132nw(3);
        m156963jb();
        mo138396gu(this.f149691r3.mo138247C8(), false);
        mo138350Lm(this.f149691r3.mo138300mg());
        m156758Gw();
        m156960ir();
        this.f149544F1.m157300h();
        this.f149544F1.setVisibility(8);
        this.f149696t0.start();
        this.f149696t0.setBase(this.f149686q2.m117121j());
        if (!z11) {
            this.f149691r3.mo138267Pl(7000L);
            m157054wu(AbstractC16803z.ic_call_switch_video_error, getString(AbstractC8020f0.str_call_switch_vi_cam_off), 10000);
        }
    }

    /* renamed from: mf */
    private void m156982mf() {
        int i11;
        if (this.f149686q2.m117047N0() && !this.f149591S2) {
            this.f149591S2 = true;
            int m15656d = AbstractC3104p.m15656d();
            int m15645V = AbstractC3104p.m15645V() + m15656d;
            CircleBackgroundView circleBackgroundView = new CircleBackgroundView(getContext(), 10, 3);
            this.f149544F1 = circleBackgroundView;
            circleBackgroundView.setId(AbstractC6918a0.call_vidAvatarCircleAnim);
            this.f149544F1.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
            CircleBackgroundView circleBackgroundView2 = this.f149544F1;
            circleBackgroundView2.f149939u = m15656d / 2.0f;
            circleBackgroundView2.m157298e(AbstractC3104p.f13187d >> 1, AbstractC3104p.m15628E() + (m15645V >> 1));
            this.f149544F1.setMaxRadius(m15645V * 1.5f);
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.f149548G1 = relativeLayout;
            relativeLayout.setId(AbstractC6918a0.call_vidInfoContainer);
            FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -2);
            m15700c.setMargins(AbstractC3104p.m15650a(20.0f), AbstractC3104p.m15628E(), AbstractC3104p.m15650a(20.0f), 0);
            this.f149548G1.setLayoutParams(m15700c);
            this.f149548G1.setVisibility(8);
            CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(getContext(), AbstractC3104p.m15645V() / 2.0f);
            this.f149560J1 = circularProgressIndicator;
            circularProgressIndicator.setId(AbstractC6918a0.call_vidBackgroundAvatar);
            RelativeLayout.LayoutParams m15706i = AbstractC3105q.m15706i(m15645V, m15645V);
            m15706i.addRule(14);
            this.f149560J1.setLayoutParams(m15706i);
            this.f149560J1.m157329x(0.0d, 0);
            this.f149560J1.setFillBackgroundEnabled(true);
            this.f149560J1.setListener(new C32412c());
            RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
            this.f149552H1 = recyclingImageView;
            recyclingImageView.setId(AbstractC6918a0.call_vidAvatarView);
            RelativeLayout.LayoutParams m15706i2 = AbstractC3105q.m15706i(m15656d, m15656d);
            m15706i2.topMargin = AbstractC3104p.m15645V() / 2;
            m15706i2.addRule(14);
            this.f149552H1.setLayoutParams(m15706i2);
            this.f149552H1.setScaleType(ImageView.ScaleType.FIT_CENTER);
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f149556I1 = appCompatImageView;
            appCompatImageView.setId(AbstractC6918a0.call_bgVidAvatarView);
            RelativeLayout.LayoutParams m15706i3 = AbstractC3105q.m15706i(m15656d, m15656d);
            m15706i3.topMargin = AbstractC3104p.m15645V() / 2;
            m15706i3.addRule(14);
            this.f149556I1.setLayoutParams(m15706i3);
            this.f149556I1.setBackgroundResource(AbstractC16803z.bg_avatar_placeholder);
            this.f149568L1 = new AppCompatImageView(getContext());
            RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(16, 16);
            m15705h.addRule(8, AbstractC6918a0.call_vidAvatarView);
            m15705h.addRule(7, AbstractC6918a0.call_vidAvatarView);
            this.f149568L1.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_oa_verify));
            this.f149568L1.setLayoutParams(m15705h);
            this.f149568L1.setVisibility(8);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams m15705h2 = AbstractC3105q.m15705h(-2, -2);
            m15705h2.addRule(3, AbstractC6918a0.call_vidBackgroundAvatar);
            m15705h2.addRule(14);
            m15705h2.topMargin = AbstractC3104p.m15646W();
            linearLayout.setGravity(17);
            linearLayout.setId(AbstractC6918a0.call_groupRemoteName);
            linearLayout.setLayoutParams(m15705h2);
            linearLayout.setOrientation(0);
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
            this.f149564K1 = appCompatImageView2;
            appCompatImageView2.setId(AbstractC6918a0.call_vidBadgeStranger);
            LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
            m15701d.rightMargin = AbstractC3104p.m15650a(6.0f);
            m15701d.gravity = 17;
            this.f149564K1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.badge_nguoila));
            this.f149564K1.setLayoutParams(m15701d);
            this.f149564K1.setVisibility(8);
            MarqueeTextView marqueeTextView = new MarqueeTextView(getContext());
            this.f149571M1 = marqueeTextView;
            marqueeTextView.setId(AbstractC6918a0.call_vidRemoteName);
            LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
            m15701d2.gravity = 17;
            this.f149571M1.setLayoutParams(m15701d2);
            this.f149571M1.setSingleLine();
            this.f149571M1.setTextColor(-1);
            this.f149571M1.setTextStyleBold(true);
            this.f149571M1.setTextSize(1, 24.0f);
            if (!this.f149686q2.m117086a0()) {
                this.f149571M1.setEllipsize(TextUtils.TruncateAt.END);
            }
            if (this.f149686q2.m117086a0()) {
                this.f149574N1 = new MarqueeTextView(getContext());
                RelativeLayout.LayoutParams m15705h3 = AbstractC3105q.m15705h(-2, -2);
                m15705h3.addRule(3, AbstractC6918a0.call_groupRemoteName);
                m15705h3.addRule(14);
                m15705h3.setMargins(0, AbstractC3104p.m15650a(6.0f), 0, 0);
                this.f149574N1.setLayoutParams(m15705h3);
                this.f149574N1.setId(AbstractC6918a0.call_oa_reason);
                this.f149574N1.setTextSize(1, 16.0f);
                this.f149574N1.setTextColor(-1);
                this.f149574N1.setSingleLine();
                this.f149574N1.setVisibility(8);
            }
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            this.f149577O1 = robotoTextView;
            robotoTextView.setId(AbstractC6918a0.call_vidCallStatus);
            RelativeLayout.LayoutParams m15705h4 = AbstractC3105q.m15705h(-2, -2);
            m15705h4.addRule(14);
            if (this.f149686q2.m117086a0()) {
                i11 = AbstractC6918a0.call_oa_reason;
            } else {
                i11 = AbstractC6918a0.call_groupRemoteName;
            }
            m15705h4.addRule(3, i11);
            m15705h4.topMargin = AbstractC3104p.m15650a(6.0f);
            m15705h4.leftMargin = AbstractC3104p.m15650a(30.0f);
            m15705h4.rightMargin = AbstractC3104p.m15650a(30.0f);
            this.f149577O1.setLayoutParams(m15705h4);
            this.f149577O1.setSingleLine();
            this.f149577O1.setTextAlignment(4);
            this.f149577O1.setEllipsize(TextUtils.TruncateAt.END);
            m157136pt(this.f149577O1);
            linearLayout.addView(this.f149564K1);
            linearLayout.addView(this.f149571M1);
            m156866Ve(true);
            this.f149548G1.addView(this.f149560J1);
            this.f149548G1.addView(this.f149556I1);
            this.f149548G1.addView(this.f149552H1);
            this.f149548G1.addView(this.f149568L1);
            this.f149548G1.addView(linearLayout);
            if (this.f149686q2.m117086a0()) {
                this.f149548G1.addView(this.f149574N1);
            }
            this.f149548G1.addView(this.f149577O1);
            int i12 = this.f149569L2;
            if (i12 == 1) {
                this.f149548G1.addView(this.f149617Z0);
            } else if (i12 == 2) {
                this.f149548G1.addView(this.f149629c1);
            }
            this.f149588S.addView(this.f149544F1);
            this.f149588S.addView(this.f149548G1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mp */
    public /* synthetic */ void m156983mp(String str, boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(str);
        m156825Ps(true, false, false, false);
        mo138353N6(z11);
    }

    /* renamed from: mr */
    private void m156984mr() {
        int max;
        StickerPanelView stickerPanelView = this.f149527B0;
        if (stickerPanelView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) stickerPanelView.getLayoutParams();
            if (this.f149691r3.mo138268Po()) {
                max = AbstractC3104p.m15650a(20.0f);
            } else {
                max = Math.max(AbstractC3104p.m15624A(), AbstractC3104p.m15625B()) + AbstractC3104p.m15650a(50.0f);
            }
            layoutParams.leftMargin = max;
            layoutParams.rightMargin = max;
            layoutParams.bottomMargin = AbstractC3104p.m15667i0();
            this.f149527B0.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: nb */
    private void m156987nb(View view) {
        this.f149596U.removeView(this.f149600V);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < this.f149596U.getChildCount()) {
                View childAt = this.f149596U.getChildAt(i12);
                if (childAt != null && childAt.equals(view)) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.f149596U.addView(this.f149600V, i11 + 1);
    }

    /* renamed from: ni */
    private boolean m156988ni() {
        if (this.f149549G2 && this.f149686q2.m117126k0() && (!this.f149686q2.m117086a0() || this.f149686q2.m117150q0())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nl */
    public /* synthetic */ void m156989nl(View view) {
        this.f149691r3.mo138284Xo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nn */
    public /* synthetic */ void m156990nn(InterfaceC17463d interfaceC17463d, int i11) {
        C22626t c22626t = this.f149686q2;
        if (c22626t != null && c22626t.m117090b0() && this.f149686q2.m117079Y()) {
            m157112Ug();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ns */
    public void m156991ns() {
        int mo138258Hm = this.f149691r3.mo138258Hm();
        ProgressBar progressBar = this.f149620a0;
        if (progressBar != null && mo138258Hm >= 0 && this.f149565K2) {
            progressBar.setProgress(mo138258Hm);
            this.f149642f2.removeCallbacks(this.f149699t3);
            this.f149642f2.postDelayed(this.f149699t3, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj */
    public /* synthetic */ void m156996oj(View view) {
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_audio_switch_video_confirm", new String[0]), false);
        m156854Tu();
        m157134oh(true);
        this.f149642f2.postDelayed(new Runnable() { // from class: vo0.x1
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156943gj();
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: om */
    public /* synthetic */ void m156997om(Intent intent) {
        if (intent.getExtras().getBoolean("EXTRA_DATA_ACCEPT_CALL_FROM_NOTI")) {
            AbstractC3096i0.m15552n();
            if (AbstractC3103o.m15619h(29)) {
                C32318n3.m156214E().m156262u();
            } else {
                C32318n3.m156214E().m156254M(false);
            }
            if (this.f149686q2.m117082Z() && !this.f149686q2.m117090b0()) {
                m156907bb(3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: op */
    public /* synthetic */ void m156998op(boolean z11) {
        if (this.f149632d0 == null) {
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_unstable_change_network);
        if (!this.f149565K2) {
            m118743r0 = m118743r0 + "\n" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_reconnecting);
        }
        this.f149632d0.setText(m118743r0);
        m156825Ps(true, true, false, false);
        mo138353N6(z11);
    }

    /* renamed from: or */
    private void m156999or() {
        ZaloZinstantLayout zaloZinstantLayout = this.f149669m1;
        if (zaloZinstantLayout != null && (zaloZinstantLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149669m1.getLayoutParams();
            layoutParams.bottomMargin = m156830Qf();
            layoutParams.topMargin = AbstractC3104p.m15691u0();
            this.f149669m1.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: ow */
    private void m157000ow() {
        if (this.f149677o1 != null) {
            if (m156874Wh()) {
                this.f149677o1.setBackgroundResource(AbstractC16803z.res_call_bg_video_control_layout);
            } else {
                this.f149677o1.setBackgroundResource(0);
            }
            int m156836Rf = m156836Rf();
            this.f149677o1.setPadding(m156836Rf, 0, m156836Rf, m156814Of());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: po */
    public /* synthetic */ void m157002po() {
        AbstractC3085d.m15442d(this.f149602V1, true);
    }

    /* renamed from: pr */
    private void m157003pr(InterfaceC22508f interfaceC22508f) {
        try {
            C3568b.m18124b().m18127d(new C32432m(interfaceC22508f));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qg */
    private int m157007qg() {
        if (this.f149691r3.mo138268Po()) {
            return m156830Qf();
        }
        return AbstractC23222t7.f112534M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qk */
    public /* synthetic */ void m157008qk(View view) {
        m157102Nr(33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qn */
    public /* synthetic */ void m157009qn(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23034c6.m118186w0(this, AbstractC3108t.f13193a, 200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qq */
    public /* synthetic */ void m157010qq(C25630b c25630b) {
        this.f149691r3.mo138253Gf(c25630b);
    }

    /* renamed from: rd */
    private void m157015rd() {
        int m156814Of = m156814Of();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149677o1 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_controlLayouts);
        int m156836Rf = m156836Rf();
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        m15698a.gravity = 81;
        this.f149677o1.setLayoutParams(m15698a);
        this.f149677o1.setPadding(m156836Rf, 0, m156836Rf, m156814Of);
        this.f149677o1.setOrientation(0);
        this.f149677o1.setBackgroundColor(0);
        this.f149677o1.setGravity(49);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rq */
    public /* synthetic */ void m157016rq(AbstractC27351a abstractC27351a) {
        String m118743r0;
        try {
            if (abstractC27351a instanceof AbstractC27351a.b) {
                this.f149531C0.setVisibility(0);
                this.f149535D0.setVisibility(8);
                return;
            }
            if (abstractC27351a instanceof AbstractC27351a.a) {
                this.f149531C0.setVisibility(8);
                this.f149535D0.setVisibility(0);
                this.f149543F0.setVisibility(0);
                if (((AbstractC27351a.a) abstractC27351a).m139960a() == 50001) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_loading_timeout_retry_msg);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_sticker_panel_empty);
                }
                this.f149539E0.setText(m118743r0);
                return;
            }
            if (abstractC27351a instanceof AbstractC27351a.c) {
                this.f149531C0.setVisibility(8);
                C21336n c21336n = this.f149563K0;
                if (c21336n != null) {
                    c21336n.m11226j();
                } else {
                    C21336n c21336n2 = new C21336n(getContext(), new C21326d.b() { // from class: vo0.w1
                        @Override // jo0.C21326d.b
                        /* renamed from: a */
                        public final void mo110432a(C25630b c25630b) {
                            ZmInCallActivity.this.m157010qq(c25630b);
                        }
                    });
                    this.f149563K0 = c21336n2;
                    this.f149555I0.setAdapter(c21336n2);
                }
                List m139961a = ((AbstractC27351a.c) abstractC27351a).m139961a();
                if (m139961a.size() > 1) {
                    this.f149559J0.m112449Q(m139961a);
                    this.f149551H0.setVisibility(0);
                    this.f149535D0.setVisibility(8);
                    return;
                }
                if (m139961a.size() == 0) {
                    this.f149535D0.setVisibility(0);
                    this.f149539E0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_sticker_panel_empty));
                    this.f149543F0.setVisibility(8);
                } else {
                    this.f149535D0.setVisibility(8);
                    this.f149543F0.setVisibility(0);
                }
                this.f149551H0.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sb */
    public void m157019sb() {
        if (this.f149608X == null) {
            return;
        }
        if (this.f149691r3.mo138246C4() != C29161o1.b.f135109p && this.f149691r3.mo138256He()) {
            this.f149686q2.f110922f = EglRenderer.RenderMode.AspectScaleToFill;
        } else if (this.f149608X.getWidth() < this.f149608X.getHeight()) {
            if (this.f149608X.getRotatedFrameWidth() < this.f149608X.getRotatedFrameHeight()) {
                this.f149686q2.f110922f = EglRenderer.RenderMode.AspectScaleToFill;
            } else {
                this.f149686q2.f110922f = EglRenderer.RenderMode.AspectScaleToFit;
            }
        } else if (this.f149608X.getRotatedFrameWidth() < this.f149608X.getRotatedFrameHeight()) {
            this.f149686q2.f110922f = EglRenderer.RenderMode.AspectScaleToFit;
        } else {
            this.f149686q2.f110922f = EglRenderer.RenderMode.AspectScaleToFill;
        }
        this.f149608X.setVideoRenderMode(this.f149686q2.f110922f);
    }

    /* renamed from: sd */
    private void m157020sd() {
        int i11;
        int m15670k = AbstractC3104p.m15670k();
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        VoIPButtonWithText m157425j = new VoIPButtonWithText(getContext(), 3).m157424i(m15702e).m157425j(this.f149557I2);
        C22626t c22626t = this.f149686q2;
        if (c22626t != null && c22626t.m117090b0()) {
            i11 = AbstractC8020f0.str_call_hangup_button_text;
        } else {
            i11 = AbstractC8020f0.str_call_decline_button_text;
        }
        VoIPButtonWithText m157419d = m157425j.m157421f(getString(i11)).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_end_selector));
        this.f149685q1 = m157419d;
        m157419d.setId(AbstractC6918a0.call_endBtn);
        this.f149685q1.getButton().setContentDescription("End call");
        this.f149685q1.setLayoutParams(m15701d);
        this.f149685q1.setAlignmentTextView(4);
        this.f149685q1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.e5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156845Sj(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sg */
    public int m157021sg(View view) {
        if (view.getParent() == view.getRootView()) {
            return view.getTop();
        }
        return view.getTop() + m157021sg((View) view.getParent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sj */
    public /* synthetic */ void m157022sj(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i18 != i14 || !this.f149623a3) {
            if (i14 != i18) {
                m157109Sh();
            }
            this.f149623a3 = true;
            mo138327CH(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sn */
    public /* synthetic */ void m157023sn(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC32273e3.m155748Q().mo155919t(false);
        m156981mb(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: so */
    public /* synthetic */ void m157024so(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f149710w2) {
            this.f149710w2 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: ss */
    private void m157025ss() {
        this.f149588S.post(new Runnable() { // from class: vo0.x2
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156847Sn();
            }
        });
        m156960ir();
        m156921dr();
        m156968jr();
        m156841Rq();
        m156984mr();
        m156810Nq();
        m156757Gq();
        m156946gr();
        m156764Hw();
        m156861Uq();
        m156746Fs();
    }

    /* renamed from: st */
    private void m157026st(View view, View view2) {
        int i11 = AbstractC3104p.f13187d / 2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 51;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.setMargins(0, 0, i11, 0);
        view.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 53;
        layoutParams2.setMargins(i11, 0, 0, 0);
        view2.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ti */
    public /* synthetic */ void m157030ti(Boolean bool) {
        if (bool.booleanValue()) {
            if (this.f149686q2.m117082Z()) {
                this.f149629c1.m157389g();
            }
            ToastUtils.showMess(getString(AbstractC8020f0.str_call_rbt_quick_setting_success_toast));
            this.f149686q2.m117063S1(1);
            return;
        }
        if (this.f149686q2.m117082Z()) {
            this.f149629c1.m157388f();
        }
        ToastUtils.showMess(getString(AbstractC8020f0.str_call_rbt_quick_setting_fail));
        this.f149686q2.m117063S1(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tl */
    public /* synthetic */ void m157031tl(int i11) {
        boolean z11 = true;
        if (Math.abs(i11 - this.f149555I0.getCurrentItem()) != 1) {
            z11 = false;
        }
        this.f149555I0.m11189T(i11, z11);
        m157103Ns(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tq */
    public /* synthetic */ void m157032tq(boolean z11, boolean z12) {
        long j11;
        if (this.f149709w1 == null) {
            return;
        }
        if (this.f149691r3.mo138264Lj()) {
            AbstractC3085d.m15447i(this.f149709w1, z11, 0.0f, 200.0f, 300L);
            return;
        }
        VoIPButtonWithText voIPButtonWithText = this.f149709w1;
        if (z12) {
            j11 = 300;
        } else {
            j11 = 0;
        }
        AbstractC3085d.m15448j(voIPButtonWithText, z11, 0.0f, 0.0f, j11, new C32440u(z12));
    }

    /* renamed from: ue */
    private void m157036ue() {
        LiveEmojiButton liveEmojiButton = new LiveEmojiButton(getContext(), C0874h.f3217a.m2589d(), AbstractC3104p.m15674m(), LiveEmojiButton.f70637i0);
        this.f149716y0 = liveEmojiButton;
        liveEmojiButton.setId(AbstractC6918a0.call_liveEmojiButton);
        this.f149716y0.setAllowFlyingAnim(false);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(LiveEmojiButton.f70632d0, -2);
        m15700c.gravity = 85;
        m15700c.bottomMargin = m156892Zf() - AbstractC3104p.m15650a(4.0f);
        m15700c.rightMargin = AbstractC3104p.m15625B() - AbstractC3104p.m15650a(5.0f);
        this.f149716y0.m76401l(AbstractC1401h.m7080d(getResources(), AbstractC2808b.blk_a40, null), AbstractC1401h.m7080d(getResources(), AbstractC2808b.wht_a10, null));
        mo138426vw(true);
        this.f149716y0.setLayoutParams(m15700c);
        this.f149716y0.setVisibility(4);
        this.f149716y0.setListener(new C32413c0());
        this.f149588S.addView(this.f149716y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: um */
    public /* synthetic */ void m157037um(boolean z11) {
        KeyboardDTMFView keyboardDTMFView = this.f149602V1;
        if (keyboardDTMFView != null) {
            if (z11) {
                AbstractC3085d.m15443e(keyboardDTMFView, false, 0L);
            } else {
                AbstractC3085d.m15442d(keyboardDTMFView, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: un */
    public /* synthetic */ void m157038un(InterfaceC17463d interfaceC17463d) {
        AbstractC32273e3.m155748Q().mo155919t(false);
        m156981mb(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uo */
    public /* synthetic */ void m157039uo(C28212v6 c28212v6, TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f149714x2) {
            this.f149714x2 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
        this.f149691r3.mo138267Pl(7000L);
    }

    /* renamed from: vd */
    private void m157043vd(boolean z11) {
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.leftMargin = AbstractC3104p.m15650a(4.0f);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.bottomMargin = m156830Qf();
        m15698a.gravity = 81;
        if (this.f149686q2.m117026G0()) {
            this.f149588S.setOnTouchListener(new View.OnTouchListener() { // from class: vo0.y5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m156858Uj;
                    m156858Uj = ZmInCallActivity.this.m156858Uj(view, motionEvent);
                    return m156858Uj;
                }
            });
        }
        VoIPButtonWithText m157419d = new VoIPButtonWithText(getContext(), 1).m157424i(m15702e).m157425j(this.f149557I2).m157421f(getString(AbstractC8020f0.str_call_keyboard_button_text)).m157418c(AbstractC3105q.m15703f(AbstractC3104p.m15650a(24.0f), AbstractC3104p.m15650a(24.0f))).m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_numpad_selector));
        this.f149709w1 = m157419d;
        m157419d.setBackgroundResource(AbstractC16803z.bg_call_numpad_btn);
        this.f149709w1.setId(AbstractC6918a0.call_keyboardBtn);
        this.f149709w1.setLayoutParams(m15698a);
        this.f149709w1.setPadding(AbstractC3104p.m15650a(16.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(16.0f), AbstractC3104p.m15650a(8.0f));
        this.f149709w1.getButton().setContentDescription("Open Keyboard");
        this.f149709w1.setSelected(false);
        this.f149709w1.setVisibility(8);
        if (z11) {
            this.f149709w1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.z5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156900ak(view);
                }
            });
        } else {
            this.f149709w1.setOnTouchListener(new ViewOnTouchListenerC32425i0(this, 30, this.f149550G3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vi */
    public /* synthetic */ C24848g0 m157044vi(final Boolean bool) {
        String str;
        runOnUiThread(new Runnable() { // from class: vo0.o2
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157030ti(bool);
            }
        });
        C0815e1 m2075D = C0815e1.m2075D();
        String[] strArr = new String[1];
        if (bool.booleanValue()) {
            str = "0";
        } else {
            str = "1";
        }
        strArr[0] = str;
        m2075D.m2100V(new C23648e(45, "in_call", 0, "call_set_rbt_handshake", strArr), false);
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vp */
    public /* synthetic */ void m157045vp(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(getString(AbstractC8020f0.str_call_cam_error_partner, this.f149686q2.m117049O(getContext(), 10)));
        m156825Ps(false, true, false, false);
        mo138353N6(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vq */
    public /* synthetic */ void m157046vq(boolean z11) {
        RecyclingImageView recyclingImageView = this.f149612Y;
        if (recyclingImageView == null) {
            return;
        }
        AbstractC3085d.m15442d(recyclingImageView, z11);
    }

    /* renamed from: wb */
    private boolean m157048wb() {
        if (!this.f149691r3.mo138256He() && this.f149549G2 && this.f149686q2.m117126k0() && !mo138325Ap()) {
            return true;
        }
        return false;
    }

    /* renamed from: wg */
    private String[] m157049wg(boolean z11) {
        if (z11) {
            return AbstractC3108t.f13194b;
        }
        return AbstractC3108t.f13193a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wm */
    public /* synthetic */ void m157050wm() {
        boolean z11;
        int i11;
        int i12;
        boolean z12 = true;
        this.f149693s1.setEnabled(!this.f149686q2.m117067U());
        this.f149693s1.m157421f(getString(AbstractC8020f0.str_call_speaker_button_text));
        VoIPButtonWithText voIPButtonWithText = this.f149693s1;
        if (!this.f149549G2 && !this.f149557I2) {
            z11 = false;
        } else {
            z11 = true;
        }
        voIPButtonWithText.m157425j(z11);
        VoIPButtonWithText voIPButtonWithText2 = this.f149693s1;
        if (this.f149549G2 || (!VoipAudioHelper.m155579X() && !VoipAudioHelper.m155575V())) {
            z12 = false;
        }
        voIPButtonWithText2.setSelected(z12);
        if (VoipAudioHelper.m155575V()) {
            m156806Mt(AbstractC8020f0.call_popup_speaker_bluetooth);
            VoIPButtonWithText voIPButtonWithText3 = this.f149693s1;
            Context context = getContext();
            if (this.f149549G2) {
                i12 = AbstractC16803z.ic_call_video_new_menu_bluetooth;
            } else {
                i12 = AbstractC16803z.ic_call_bluetooth_selector;
            }
            voIPButtonWithText3.m157419d(AbstractC23136l9.m118665N(context, i12));
        } else {
            m157058xb(AbstractC8020f0.call_popup_speaker_bluetooth);
            VoIPButtonWithText voIPButtonWithText4 = this.f149693s1;
            Context context2 = getContext();
            if (this.f149549G2) {
                i11 = AbstractC16803z.ic_call_video_new_menu_speaker;
            } else {
                i11 = AbstractC16803z.ic_call_speaker_not_bluetooth_selector;
            }
            voIPButtonWithText4.m157419d(AbstractC23136l9.m118665N(context2, i11));
        }
        this.f149691r3.mo138259In();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wo */
    public /* synthetic */ void m157051wo() {
        try {
            File m114581e = AbstractC21943a.m114581e();
            if (!C17843b.m94137o().m94156S(m114581e.getPath())) {
                return;
            }
            int nextInt = new Random().nextInt(Integer.MAX_VALUE);
            C24230h m126396R = C24226d.m126396R(nextInt, EnumC24229g.f116983q, m114581e.getPath(), m156918dg(AbstractC20130d.m104894s0(), String.valueOf(nextInt)), 3600000L, false);
            m126396R.m126505h(new C32434o());
            m126396R.m126482B0(CoreUtility.f89233i);
            C24226d.m126402Z(m126396R);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wp */
    public /* synthetic */ void m157052wp(boolean z11) {
        RobotoTextView robotoTextView = this.f149632d0;
        if (robotoTextView == null) {
            return;
        }
        robotoTextView.setText(getString(AbstractC8020f0.str_call_mic_error_partner, this.f149686q2.m117049O(getContext(), 10)));
        m156825Ps(false, true, false, false);
        mo138353N6(z11);
    }

    /* renamed from: ws */
    private void m157053ws() {
        FrameLayout frameLayout = this.f149588S;
        if (frameLayout != null) {
            frameLayout.removeOnLayoutChangeListener(this.f149592T);
        }
    }

    /* renamed from: wu */
    private void m157054wu(int i11, String str, int i12) {
        if (mo138335F2()) {
            return;
        }
        if (this.f149661k1 == null) {
            m156888Yd();
        }
        ToastCountdownCustomView toastCountdownCustomView = this.f149661k1;
        if (toastCountdownCustomView != null) {
            toastCountdownCustomView.bringToFront();
            this.f149661k1.m157459h(i11, str, i12);
        }
    }

    /* renamed from: xb */
    private void m157058xb(int i11) {
        if (this.f149686q2.m117160t() == i11) {
            this.f149642f2.removeCallbacks(this.f149566K3);
            m157142xh(true);
        }
    }

    /* renamed from: xc */
    private void m157059xc() {
        int m15656d;
        int m15628E;
        int i11;
        if (this.f149587R2) {
            return;
        }
        this.f149587R2 = true;
        if (!this.f149686q2.m117086a0() && this.f149691r3.mo138268Po()) {
            m15656d = AbstractC3104p.m15658e();
        } else {
            m15656d = AbstractC3104p.m15656d();
        }
        if (!this.f149686q2.m117086a0() && this.f149691r3.mo138268Po()) {
            m15628E = AbstractC3104p.m15654c();
        } else {
            m15628E = AbstractC3104p.m15628E();
        }
        int m15660f = (AbstractC3104p.m15660f() * 2) + m15656d;
        int m15660f2 = m15628E - AbstractC3104p.m15660f();
        CircleBackgroundView circleBackgroundView = new CircleBackgroundView(getContext(), 50, 3);
        this.f149524A1 = circleBackgroundView;
        circleBackgroundView.setId(AbstractC6918a0.call_avatarCircleAnim);
        this.f149524A1.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        CircleBackgroundView circleBackgroundView2 = this.f149524A1;
        circleBackgroundView2.f149939u = m15656d / 2.0f;
        circleBackgroundView2.m157298e(AbstractC3104p.f13187d >> 1, m15628E + (m15656d >> 1));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f149528B1 = relativeLayout;
        relativeLayout.setId(AbstractC6918a0.call_bigInformationContainer);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        m15698a.setMargins(AbstractC3104p.m15650a(10.0f), m15660f2, AbstractC3104p.m15650a(10.0f), 0);
        this.f149528B1.setLayoutParams(m15698a);
        this.f149528B1.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(-2, -2);
        m15705h.addRule(14);
        frameLayout.setId(AbstractC6918a0.call_avatarContainer);
        frameLayout.setLayoutParams(m15705h);
        CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(getContext(), AbstractC3104p.m15660f());
        this.f149540E1 = circularProgressIndicator;
        circularProgressIndicator.setId(AbstractC6918a0.call_backgroundAvatar);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(m15660f, m15660f);
        m15700c.gravity = 1;
        this.f149540E1.setLayoutParams(m15700c);
        this.f149540E1.m157329x(0.0d, 0);
        this.f149540E1.setFillBackgroundEnabled(true);
        this.f149540E1.setListener(new C32410b());
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        this.f149532C1 = recyclingImageView;
        recyclingImageView.setId(AbstractC6918a0.call_avatarView);
        FrameLayout.LayoutParams m15700c2 = AbstractC3105q.m15700c(m15656d, m15656d);
        m15700c2.gravity = 1;
        m15700c2.topMargin = AbstractC3104p.m15660f();
        this.f149532C1.setLayoutParams(m15700c2);
        this.f149532C1.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f149532C1.setOnClickListener(new View.OnClickListener() { // from class: vo0.i4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156794Li(view);
            }
        });
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f149536D1 = appCompatImageView;
        appCompatImageView.setId(AbstractC6918a0.call_bgAvatarView);
        FrameLayout.LayoutParams m15700c3 = AbstractC3105q.m15700c(m15656d, m15656d);
        m15700c3.gravity = 1;
        m15700c3.topMargin = AbstractC3104p.m15660f();
        this.f149536D1.setLayoutParams(m15700c3);
        this.f149536D1.setBackgroundResource(AbstractC16803z.bg_avatar_placeholder);
        this.f149579P0 = new AppCompatImageView(getContext());
        if (this.f149686q2.m117086a0()) {
            i11 = 16;
        } else {
            i11 = 24;
        }
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(i11, i11);
        m15698a2.gravity = 85;
        m15698a2.bottomMargin = AbstractC3104p.m15660f();
        m15698a2.rightMargin = AbstractC3104p.m15660f();
        this.f149579P0.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_oa_verify));
        this.f149579P0.setLayoutParams(m15698a2);
        this.f149579P0.setVisibility(8);
        frameLayout.addView(this.f149540E1);
        frameLayout.addView(this.f149536D1);
        frameLayout.addView(this.f149532C1);
        frameLayout.addView(this.f149579P0);
        this.f149528B1.addView(frameLayout);
        m157129ic();
        this.f149588S.addView(this.f149524A1);
        this.f149588S.addView(this.f149528B1);
    }

    /* renamed from: xd */
    private void m157060xd(boolean z11) {
        int i11;
        this.f149697t1 = new VoIPButtonWithText(getContext(), 3);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        int m15670k = AbstractC3104p.m15670k();
        VoIPButtonWithText voIPButtonWithText = this.f149697t1;
        Context context = getContext();
        if (this.f149549G2) {
            i11 = AbstractC16803z.ic_call_mic_selector;
        } else {
            i11 = AbstractC16803z.ic_audio_call_mic_selector;
        }
        voIPButtonWithText.m157419d(AbstractC23136l9.m118665N(context, i11));
        this.f149697t1.setLayoutParams(m15701d);
        this.f149697t1.m157424i(m15702e).m157421f(getString(AbstractC8020f0.str_call_mic_button_text)).m157425j(this.f149557I2).m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        this.f149697t1.setId(AbstractC6918a0.call_muteBtn);
        this.f149697t1.getButton().setContentDescription("Mute record");
        this.f149697t1.setAlignmentTextView(4);
        if (z11) {
            this.f149697t1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.v4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156972kk(view);
                }
            });
        } else {
            this.f149697t1.getButton().setOnTouchListener(new ViewOnTouchListenerC32425i0(5, new Runnable() { // from class: vo0.w4
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.this.m156977lk();
                }
            }, this.f149723z3));
        }
    }

    /* renamed from: xf */
    private void m157061xf() {
        int i11;
        LinearLayout linearLayout = this.f149616Z;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            RelativeLayout relativeLayout = this.f149528B1;
            if (relativeLayout != null) {
                relativeLayout.removeView(this.f149616Z);
            }
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f149616Z = linearLayout2;
        linearLayout2.setId(AbstractC6918a0.call_renderTextLayout);
        this.f149616Z.setPadding(AbstractC3104p.m15650a(15.0f), AbstractC3104p.m15650a(15.0f), AbstractC3104p.m15650a(15.0f), AbstractC3104p.m15650a(15.0f));
        this.f149616Z.setMinimumWidth(AbstractC3104p.m15650a(250.0f));
        this.f149616Z.setGravity(1);
        this.f149616Z.setOrientation(1);
        LinearLayout linearLayout3 = this.f149616Z;
        if (this.f149549G2) {
            i11 = AbstractC16803z.call_status_video_network_bg;
        } else {
            i11 = AbstractC16803z.call_status_network_bg;
        }
        linearLayout3.setBackgroundResource(i11);
        this.f149616Z.setVisibility(8);
        if (this.f149549G2) {
            FrameLayout.LayoutParams m15699b = AbstractC3105q.m15699b(-2, -2, 17);
            m15699b.leftMargin = AbstractC3104p.m15650a(10.0f);
            m15699b.rightMargin = AbstractC3104p.m15650a(10.0f);
            this.f149616Z.setLayoutParams(m15699b);
        } else {
            RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(-2, -2);
            m15705h.addRule(14);
            m15705h.addRule(3, AbstractC6918a0.call_switcherInCallStatus);
            m15705h.topMargin = AbstractC3104p.m15650a(6.0f);
            this.f149616Z.setLayoutParams(m15705h);
        }
        this.f149620a0 = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
        LinearLayout.LayoutParams m15704g = AbstractC3105q.m15704g(AbstractC3104p.m15650a(14.0f), AbstractC3104p.m15650a(14.0f), 17);
        m15704g.setMargins(AbstractC3104p.m15650a(4.0f), AbstractC3104p.m15650a(0.0f), AbstractC3104p.m15650a(4.0f), AbstractC3104p.m15650a(4.0f));
        this.f149620a0.setLayoutParams(m15704g);
        this.f149620a0.setIndeterminate(false);
        this.f149620a0.setMax(100);
        this.f149620a0.setProgressDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.call_reconnecting_progress));
        this.f149620a0.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.call_reconnecting_progress_bg));
        this.f149620a0.setVisibility(8);
        this.f149624b0 = new CircleIconLoadingView(getContext());
        LinearLayout.LayoutParams m15704g2 = AbstractC3105q.m15704g(AbstractC3104p.m15650a(14.0f), AbstractC3104p.m15650a(14.0f), 17);
        m15704g2.setMargins(AbstractC3104p.m15650a(4.0f), AbstractC3104p.m15650a(0.0f), AbstractC3104p.m15650a(4.0f), AbstractC3104p.m15650a(4.0f));
        this.f149624b0.setLayoutParams(m15704g2);
        LinearLayout.LayoutParams m15704g3 = AbstractC3105q.m15704g(-2, -2, 17);
        m15704g3.setMargins(0, 0, 0, AbstractC3104p.m15650a(12.0f));
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f149628c0 = appCompatImageView;
        appCompatImageView.setId(AbstractC6918a0.call_icNotification);
        this.f149628c0.setLayoutParams(m15704g3);
        this.f149628c0.setImageDrawable(C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_warning_solid_24, AbstractC2808b.f150839y60));
        this.f149628c0.setVisibility(8);
        int m6961c = AbstractC1388a.m6961c(getContext(), AbstractC16801x.white);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f149632d0 = robotoTextView;
        robotoTextView.setId(AbstractC6918a0.call_vidMsgText);
        this.f149632d0.mo75850g(true);
        LinearLayout.LayoutParams m15704g4 = AbstractC3105q.m15704g(-2, -2, 17);
        m15704g4.setMargins(AbstractC3104p.m15647X() / 2, 0, AbstractC3104p.m15647X() / 2, 0);
        this.f149632d0.setLayoutParams(m15704g4);
        this.f149632d0.setTextSize(1, 14.0f);
        this.f149632d0.setTextColor(m6961c);
        this.f149632d0.setGravity(17);
        Button button = new Button(getContext());
        this.f149636e0 = button;
        button.setId(AbstractC6918a0.call_bigToast_cta);
        LinearLayout.LayoutParams m15704g5 = AbstractC3105q.m15704g(-2, -2, 1);
        m15704g5.setMargins(AbstractC3104p.m15647X() / 2, AbstractC3104p.m15650a(12.0f), AbstractC3104p.m15647X() / 2, 0);
        this.f149636e0.setLayoutParams(m15704g5);
        this.f149636e0.setVisibility(8);
        this.f149636e0.m90539c(AbstractC8915g0.ButtonMedium_Tertiary_NoDarkMode);
        this.f149616Z.addView(this.f149620a0);
        this.f149616Z.addView(this.f149624b0);
        this.f149616Z.addView(this.f149628c0);
        this.f149616Z.addView(this.f149632d0);
        this.f149616Z.addView(this.f149636e0);
        if (this.f149549G2) {
            this.f149588S.addView(this.f149616Z);
        } else {
            this.f149528B1.addView(this.f149616Z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xn */
    public /* synthetic */ void m157062xn() {
        AbstractC20110a.m104535d("Call fireMainUILoadedEvent() from %s", this);
        StartupApplication.Companion.m56558a().m56553l(null);
    }

    /* renamed from: xr */
    private void m157063xr() {
        runOnUiThread(new Runnable() { // from class: vo0.g3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157050wm();
            }
        });
    }

    /* renamed from: xu */
    private void m157064xu() {
        RobotoTextView robotoTextView;
        this.f149611X2 = true;
        m156982mf();
        RelativeLayout relativeLayout = this.f149548G1;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.f149544F1.m157299g();
        MarqueeTextView marqueeTextView = this.f149571M1;
        if (marqueeTextView != null) {
            marqueeTextView.setText(this.f149686q2.m117049O(getContext(), 20));
        }
        if (this.f149549G2 && (robotoTextView = this.f149577O1) != null) {
            robotoTextView.setSingleLine(false);
            this.f149577O1.setTextSize(1, 14.0f);
            this.f149577O1.setText(AbstractC8020f0.str_call_incom_switch_vi_callstatus);
        }
        mo138396gu(this.f149691r3.mo138247C8(), false);
        m156758Gw();
        m157096Le();
        m157132nw(6);
        m157000ow();
        m156960ir();
    }

    /* renamed from: xw */
    private void m157065xw() {
        C22626t c22626t = this.f149686q2;
        if (c22626t != null && this.f149573N0 != null && c22626t.m117126k0() && !this.f149686q2.m117086a0()) {
            this.f149573N0.post(new Runnable() { // from class: vo0.l4
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.this.m156832Qo();
                }
            });
        }
    }

    /* renamed from: yd */
    private void m157071yd(int i11) {
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        VoIPButtonWithText m157419d = new VoIPButtonWithText(getContext(), 3).m157424i(m15702e).m157425j(this.f149557I2).m157421f(getString(AbstractC8020f0.str_call_incom_switch_vi_debtn)).m157418c(AbstractC3105q.m15703f(i11, i11)).m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_switch_video_reject));
        this.f149717y1 = m157419d;
        m157419d.setId(AbstractC6918a0.call_rejectSwitchVideoBtn);
        this.f149717y1.getButton().setContentDescription("Từ chối");
        this.f149717y1.setLayoutParams(m15701d);
        this.f149717y1.setAlignmentTextView(4);
        this.f149717y1.setVisibility(8);
        this.f149717y1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.n5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m157008qk(view);
            }
        });
    }

    /* renamed from: ye */
    private void m157072ye(boolean z11) {
        int m15674m = AbstractC3104p.m15674m() + AbstractC3104p.m15650a(2.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149580P1 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_groupMiniButton);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-2, -2);
        m15700c.topMargin = AbstractC3104p.m15626C();
        m15700c.rightMargin = AbstractC3104p.m15625B();
        m15700c.gravity = 53;
        this.f149580P1.setOrientation(0);
        this.f149580P1.setLayoutParams(m15700c);
        CircleBackgroundImageView circleBackgroundImageView = new CircleBackgroundImageView(getContext());
        this.f149586R1 = circleBackgroundImageView;
        circleBackgroundImageView.setId(AbstractC6918a0.call_miniFlipCamBtn);
        LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f(AbstractC3104p.m15674m(), AbstractC3104p.m15674m());
        m15703f.leftMargin = AbstractC3104p.m15650a(5.0f);
        m15703f.gravity = 5;
        this.f149586R1.setLayoutParams(m15703f);
        this.f149586R1.m157292f(C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_flip_cam_2_solid_24), AbstractC23136l9.m118645D(getContext(), AbstractC16801x.call_icon_color_selector));
        this.f149586R1.setEnabled(false);
        this.f149586R1.setVisibility(8);
        if (!this.f149549G2) {
            CircleBackgroundImageView circleBackgroundImageView2 = new CircleBackgroundImageView(getContext());
            this.f149613Y0 = circleBackgroundImageView2;
            circleBackgroundImageView2.setId(AbstractC6918a0.call_switchVideoBtn);
            LinearLayout.LayoutParams m15703f2 = AbstractC3105q.m15703f(m15674m, m15674m);
            m15703f2.gravity = 5;
            this.f149613Y0.setLayoutParams(m15703f2);
            this.f149613Y0.m157292f(C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_video_solid_24), AbstractC23136l9.m118645D(getContext(), AbstractC16801x.call_icon_color_selector));
            this.f149613Y0.setHasBorder(false);
            this.f149613Y0.setBackgroundColor(AbstractC1401h.m7080d(getResources(), AbstractC2808b.blk_a20, null));
            this.f149613Y0.setOnClickListener(new View.OnClickListener() { // from class: vo0.c6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156831Qk(view);
                }
            });
            this.f149613Y0.setVisibility(8);
            this.f149613Y0.setEnabled(false);
            this.f149580P1.addView(this.f149613Y0);
        }
        this.f149580P1.addView(this.f149586R1);
        this.f149588S.addView(this.f149580P1);
        if (z11) {
            if (this.f149549G2) {
                this.f149586R1.setOnClickListener(new View.OnClickListener() { // from class: vo0.d6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZmInCallActivity.this.m156890Yk(view);
                    }
                });
            }
        } else if (this.f149549G2) {
            this.f149586R1.setOnTouchListener(new ViewOnTouchListenerC32425i0(this, 9, this.f149546F3));
        }
    }

    /* renamed from: yf */
    private void m157073yf() {
        if (this.f149669m1 != null) {
            return;
        }
        this.f149669m1 = new ZaloZinstantLayout(getContext());
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
        m15698a.topMargin = AbstractC3104p.m15691u0();
        m15698a.bottomMargin = m156830Qf();
        m15698a.gravity = 80;
        this.f149669m1.setLayoutParams(m15698a);
        this.f149669m1.setVisibility(4);
        this.f149669m1.setOnZinstantClickListener(new C32419f0());
        this.f149669m1.setExternalScriptListener(new C32421g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yj */
    public /* synthetic */ void m157074yj() {
        this.f149691r3.mo138279Uf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yk */
    public /* synthetic */ boolean m157075yk(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f149538D3.m112046s(0.0d);
            }
        } else {
            this.f149538D3.m112046s(1.0d);
        }
        return this.f149722z2.m8175a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yo */
    public /* synthetic */ void m157076yo(ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() < 0.7d) {
            m157098Lu();
        } else {
            m157144xv();
        }
    }

    /* renamed from: yr */
    private void m157077yr(int i11) {
        if (this.f149686q2 == null) {
            return;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC3082b0.m15421c("ZmInCallActivity_Log", "SpeakerChooserDialog.BLUETOOTH");
                    if (this.f149549G2) {
                        this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_video_new_menu_bluetooth));
                    } else {
                        this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_bluetooth_selector));
                    }
                    this.f149693s1.setEnabled(false);
                    VoipAudioHelper.m155538B0(2);
                }
            } else {
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "SpeakerChooserDialog.EXTERNAL");
                if (this.f149549G2) {
                    this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_video_new_menu_speaker));
                } else {
                    this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_speaker_not_bluetooth_selector));
                }
                this.f149693s1.setSelected(true);
                VoipAudioHelper.m155538B0(1);
            }
        } else {
            AbstractC3082b0.m15421c("ZmInCallActivity_Log", "SpeakerChooserDialog.INTERNAL");
            if (this.f149549G2) {
                this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_video_new_menu_speaker));
            } else {
                this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_speaker_not_bluetooth_selector));
            }
            this.f149693s1.setSelected(false);
            this.f149693s1.setEnabled(false);
            VoipAudioHelper.m155538B0(0);
        }
        this.f149691r3.mo138259In();
    }

    /* renamed from: ze */
    private void m157080ze(boolean z11) {
        this.f149701u1 = new VoIPButtonWithText(getContext(), 3);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        int m15670k = AbstractC3104p.m15670k();
        this.f149701u1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_more_menu_selector));
        this.f149701u1.setLayoutParams(m15701d);
        this.f149701u1.m157424i(m15702e).m157421f(getString(AbstractC8020f0.str_call_menu_button_text)).m157425j(this.f149557I2).m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        this.f149701u1.setId(AbstractC6918a0.call_optionBtn);
        this.f149701u1.getButton().setContentDescription("More Button");
        this.f149701u1.setAlignmentTextView(4);
        if (this.f149549G2) {
            if (z11) {
                this.f149701u1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.z4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZmInCallActivity.this.m156901al(view);
                    }
                });
            } else {
                this.f149701u1.getButton().setOnTouchListener(new ViewOnTouchListenerC32425i0(this, 35, this.f149554H3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zl */
    public /* synthetic */ void m157081zl(View view) {
        m157102Nr(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zo */
    public /* synthetic */ void m157082zo(boolean z11, int i11, float f11, boolean z12, int i12, int i13, ValueAnimator valueAnimator) {
        if (z11) {
            C29161o1.b mo138246C4 = this.f149691r3.mo138246C4();
            if (mo138246C4 == C29161o1.b.f135109p) {
                int i14 = AbstractC3104p.f13187d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149608X.getLayoutParams();
                int i15 = (int) (i11 * (-1) * 0.5d);
                layoutParams.setMargins(0, i15, 0, i15);
                this.f149608X.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f149664l0.getLayoutParams();
                layoutParams2.setMargins(0, 0, 0, 0);
                float f12 = i14;
                float f13 = i11;
                if (f11 > f12 / f13) {
                    int i16 = (i14 - ((int) (f13 * f11))) / 2;
                    layoutParams2.leftMargin = i16;
                    layoutParams2.rightMargin = i16;
                } else {
                    int i17 = (i11 - ((int) (f12 / f11))) / 2;
                    layoutParams2.topMargin = i17;
                    layoutParams2.bottomMargin = i17;
                }
                this.f149664l0.setLayoutParams(layoutParams2);
                m156721Ct(this.f149656j0, this.f149604W);
                return;
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f149608X.getLayoutParams();
            layoutParams3.setMargins(0, 0, 0, 0);
            this.f149608X.setLayoutParams(layoutParams3);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f149664l0.getLayoutParams();
            layoutParams4.setMargins(0, 0, 0, 0);
            this.f149664l0.setLayoutParams(layoutParams4);
            if (z12) {
                if (mo138246C4 == C29161o1.b.f135111r) {
                    m157026st(this.f149604W, this.f149656j0);
                    return;
                } else {
                    m157026st(this.f149656j0, this.f149604W);
                    return;
                }
            }
            SpringCallView springCallView = this.f149656j0;
            int i18 = springCallView.f150118v;
            if (i18 != 1 && i18 != 3) {
                m157026st(springCallView, this.f149604W);
                return;
            } else {
                m157026st(this.f149604W, springCallView);
                return;
            }
        }
        int i19 = AbstractC3104p.f13187d;
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f149604W.getLayoutParams();
        float f14 = i11;
        int animatedFraction = (int) ((1.0f - valueAnimator.getAnimatedFraction()) * f14);
        layoutParams5.setMargins(0, animatedFraction, 0, 0);
        layoutParams5.gravity = 3;
        this.f149604W.setLayoutParams(layoutParams5);
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f149608X.getLayoutParams();
        layoutParams6.topMargin = (-animatedFraction) / 2;
        layoutParams6.bottomMargin = (animatedFraction / 2) - animatedFraction;
        this.f149608X.setLayoutParams(layoutParams6);
        int animatedFraction2 = (int) (i19 - ((i19 - i12) * valueAnimator.getAnimatedFraction()));
        int animatedFraction3 = (int) (f14 - ((i11 - i13) * valueAnimator.getAnimatedFraction()));
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) this.f149656j0.getLayoutParams();
        layoutParams7.gravity = 53;
        layoutParams7.width = animatedFraction2;
        layoutParams7.height = animatedFraction3;
        layoutParams7.topMargin = (int) (m156776Jf() * valueAnimator.getAnimatedFraction());
        layoutParams7.rightMargin = (int) (m156730Ef() * valueAnimator.getAnimatedFraction());
        this.f149656j0.setLayoutParams(layoutParams7);
        int m15662g = AbstractC3104p.m15662g();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) this.f149664l0.getLayoutParams();
        layoutParams8.setMargins(0, 0, 0, 0);
        float f15 = animatedFraction2;
        float f16 = animatedFraction3;
        if ((f11 / (f15 / f16)) - 1.0f > 0.0f) {
            layoutParams8.topMargin = m15662g;
            layoutParams8.bottomMargin = m15662g;
            int i21 = ((animatedFraction2 - ((int) (f16 * f11))) / 2) + m15662g;
            layoutParams8.leftMargin = i21;
            layoutParams8.rightMargin = i21;
        } else {
            int i22 = ((animatedFraction3 - ((int) (f15 / f11))) / 2) + m15662g;
            layoutParams8.topMargin = i22;
            layoutParams8.bottomMargin = i22;
            layoutParams8.leftMargin = m15662g;
            layoutParams8.rightMargin = m15662g;
        }
        this.f149664l0.setLayoutParams(layoutParams8);
        if (this.f149686q2.m117114h0()) {
            this.f149664l0.renderBlackFrame();
        }
    }

    /* renamed from: zs */
    private void m157083zs() {
        try {
            this.f149550G3.m112041n();
            this.f149723z3.m112041n();
            this.f149526A3.m112041n();
            this.f149542E3.m112041n();
            this.f149554H3.m112041n();
            if (this.f149549G2) {
                this.f149530B3.m112041n();
                this.f149534C3.m112041n();
                this.f149546F3.m112041n();
                this.f149538D3.m112041n();
            }
        } catch (Exception unused) {
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: A5 */
    public void mo138322A5(boolean z11) {
        AppCompatImageView appCompatImageView;
        int i11;
        AppCompatImageView appCompatImageView2 = this.f149579P0;
        int i12 = 8;
        if (appCompatImageView2 != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            appCompatImageView2.setVisibility(i11);
        }
        if (this.f149691r3.mo138314xj() && (appCompatImageView = this.f149568L1) != null) {
            if (z11) {
                i12 = 0;
            }
            appCompatImageView.setVisibility(i12);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: AF */
    public void mo138323AF(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.u3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156902aq(z11);
            }
        });
    }

    /* renamed from: Af */
    public void m157084Af() {
        AbstractC32273e3.m155748Q().mo155855W().f123736a = true;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Am */
    public void mo138324Am() {
        CircleBackgroundImageView circleBackgroundImageView;
        if (this.f149549G2 && (circleBackgroundImageView = this.f149720z0) != null && this.f149527B0 != null) {
            circleBackgroundImageView.setSelected(true);
            mo138384Zo(this.f149691r3.mo138309v4());
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Ap */
    public boolean mo138325Ap() {
        SpringCallView springCallView = this.f149656j0;
        if (springCallView != null && springCallView.f150110D) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Bq */
    public void mo138326Bq(String str) {
        LinearLayout linearLayout = this.f149597U0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        MarqueeTextView marqueeTextView = this.f149601V0;
        if (marqueeTextView != null) {
            if (marqueeTextView.getText() == str) {
                return;
            }
            this.f149601V0.setVisibility(0);
            this.f149601V0.setText(str);
        }
        if (this.f149691r3.mo138314xj()) {
            MarqueeTextView marqueeTextView2 = this.f149574N1;
            if (marqueeTextView2 != null) {
                marqueeTextView2.setVisibility(0);
                this.f149574N1.setText(str);
            }
            MarqueeTextView marqueeTextView3 = this.f149708w0;
            if (marqueeTextView3 != null) {
                marqueeTextView3.setVisibility(0);
                this.f149708w0.setText(str);
            }
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: CH */
    public void mo138327CH(boolean z11) {
        int i11;
        if (this.f149656j0 == null || !m157048wb()) {
            return;
        }
        int i12 = this.f149656j0.f150118v;
        if (mo138335F2()) {
            z11 = false;
            i12 = 1;
        }
        if (this.f149691r3.mo138266Pj()) {
            i11 = 3;
        } else {
            i11 = 1;
        }
        mo138368UE(3, i11);
        this.f149656j0.m157413j(m156741Fg(), m156752Gg(), 0, m156731Eg());
        this.f149656j0.m157408b(i12, !z11, false, true);
    }

    /* renamed from: Cb */
    public void m157085Cb() {
        if (this.f149606W1 == null) {
            return;
        }
        int i11 = this.f149658j2;
        if (i11 > 0) {
            this.f149658j2 = i11 - 1;
        } else if (this.f149643f3) {
            m156854Tu();
            m157130lh();
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: DB */
    public void mo138328DB(boolean z11, boolean z12) {
        long j11;
        if (this.f149580P1 == null) {
            return;
        }
        if (!this.f149691r3.mo138312wg()) {
            AbstractC3085d.m15447i(this.f149580P1, z11, 0.0f, -200.0f, 300L);
            return;
        }
        LinearLayout linearLayout = this.f149580P1;
        if (z12) {
            j11 = 300;
        } else {
            j11 = 0;
        }
        AbstractC3085d.m15448j(linearLayout, z11, 0.0f, 0.0f, j11, new C32443x());
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: DF */
    public boolean mo138329DF() {
        ZaloZinstantLayout zaloZinstantLayout = this.f149669m1;
        if (zaloZinstantLayout != null && zaloZinstantLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Db */
    public void mo138330Db() {
        SpeakerChooserDialog speakerChooserDialog = this.f149665l1;
        if (speakerChooserDialog != null && speakerChooserDialog.m92595KK()) {
            if (!this.f149545F2 || mo138335F2()) {
                this.f149665l1.dismiss();
            }
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Dy */
    public void mo138331Dy(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.c4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156952hp(z11);
            }
        });
    }

    /* renamed from: Ee */
    void m157086Ee() {
        int i11;
        CircleBackgroundImageView circleBackgroundImageView = this.f149583Q1;
        if (circleBackgroundImageView != null) {
            this.f149588S.removeView(circleBackgroundImageView);
        }
        CircleBackgroundImageView circleBackgroundImageView2 = new CircleBackgroundImageView(getContext());
        this.f149583Q1 = circleBackgroundImageView2;
        circleBackgroundImageView2.setId(AbstractC6918a0.call_minimizeBtn);
        this.f149583Q1.m157292f(C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_chevron_left_line_24), AbstractC23136l9.m118645D(getContext(), AbstractC16801x.call_icon_color_selector));
        this.f149583Q1.setHasBorder(this.f149549G2);
        CircleBackgroundImageView circleBackgroundImageView3 = this.f149583Q1;
        Resources resources = getResources();
        if (this.f149549G2) {
            i11 = AbstractC2808b.blk_a40;
        } else {
            i11 = AbstractC2808b.blk_a20;
        }
        circleBackgroundImageView3.setBackgroundColor(AbstractC1401h.m7080d(resources, i11, null));
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15674m(), AbstractC3104p.m15674m());
        m15700c.topMargin = AbstractC3104p.m15626C();
        m15700c.leftMargin = AbstractC3104p.m15624A();
        this.f149583Q1.setLayoutParams(m15700c);
        this.f149583Q1.setEnabled(false);
        this.f149583Q1.setVisibility(4);
        this.f149583Q1.setOnClickListener(new View.OnClickListener() { // from class: vo0.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156919dl(view);
            }
        });
        this.f149588S.addView(this.f149583Q1);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Eo */
    public void mo138332Eo() {
        C13686a c13686a = this.f149718y2;
        if (c13686a != null && c13686a.m92868m()) {
            this.f149718y2.dismiss();
        }
    }

    /* renamed from: Ev */
    void m157087Ev() {
        ValueAnimator valueAnimator = this.f149558I3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f149558I3 = null;
        }
        m157144xv();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Ew */
    public void mo138333Ew(boolean z11) {
        try {
            if (this.f149688r0 == null) {
                return;
            }
            if (this.f149691r3.mo138247C8()) {
                AbstractC3085d.m15449k(this.f149688r0, z11, 0.0f, 0.0f, new C32444y());
            } else {
                AbstractC3085d.m15446h(this.f149688r0, z11, 0.0f, -200.0f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Ey */
    public boolean mo138334Ey() {
        if (mo35579p().m92993D0(CallConfigView.class) != null) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: F2 */
    public boolean mo138335F2() {
        boolean isInPictureInPictureMode;
        if (Build.VERSION.SDK_INT >= 26) {
            isInPictureInPictureMode = isInPictureInPictureMode();
            if (isInPictureInPictureMode) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: FA */
    public String mo138336FA(String str) {
        return String.format(getString(AbstractC8020f0.str_call_other_pause_cam_off_mic_status), str);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: FG */
    public String mo138337FG(String str) {
        return String.format(getString(AbstractC8020f0.str_call_other_off_mic_status), str);
    }

    /* renamed from: Gd */
    void m157088Gd(boolean z11) {
        int m15670k;
        if (this.f149693s1 == null) {
            LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
            if (this.f149549G2) {
                m15701d.leftMargin = AbstractC3104p.m15650a(14.0f);
                m15701d.gravity = 16;
                VoIPButtonWithText voIPButtonWithText = new VoIPButtonWithText(getContext(), 1);
                this.f149693s1 = voIPButtonWithText;
                voIPButtonWithText.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_video_new_menu_speaker));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f));
                this.f149693s1.setLayoutParams(layoutParams);
                this.f149693s1.m157425j(true);
                this.f149693s1.m157422g(AbstractC23136l9.m118645D(getContext(), AbstractC16801x.color_call_text_more_menu));
                this.f149693s1.setPadding(AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f));
                this.f149693s1.m157423h(1, 15.0f);
                m15670k = AbstractC3104p.m15676n();
            } else {
                m15701d.topMargin = AbstractC3104p.m15675m0();
                m15701d.gravity = 17;
                this.f149693s1 = new VoIPButtonWithText(getContext(), 3);
                LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(0, -2);
                m15701d2.weight = 1.0f;
                this.f149693s1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_speaker_not_bluetooth_selector));
                this.f149693s1.setLayoutParams(m15701d2);
                this.f149693s1.m157425j(this.f149557I2);
                m15670k = AbstractC3104p.m15670k();
            }
            this.f149693s1.m157424i(m15701d).m157421f(getString(AbstractC8020f0.str_call_speaker_button_text)).m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            this.f149693s1.setId(AbstractC6918a0.call_speakerBtn);
            this.f149693s1.getButton().setContentDescription("Change speaker");
            this.f149693s1.setAlignmentTextView(4);
        }
        if (this.f149549G2) {
            if (z11) {
                this.f149693s1.setOnClickListener(new View.OnClickListener() { // from class: vo0.m4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZmInCallActivity.this.m156709Ak(view);
                    }
                });
            } else {
                this.f149693s1.setOnTouchListener(new ViewOnTouchListenerC32425i0(this, 6, this.f149526A3));
            }
        } else if (z11) {
            this.f149693s1.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.n4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156778Jk(view);
                }
            });
        } else {
            this.f149693s1.getButton().setOnTouchListener(new ViewOnTouchListenerC32425i0(this, 6, this.f149526A3));
        }
        m156789Kw();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: H9 */
    public boolean mo138338H9() {
        TooltipView tooltipView;
        ShowcaseView showcaseView = this.f149710w2;
        if ((showcaseView != null && showcaseView.getVisibility() == 0) || ((tooltipView = this.f149714x2) != null && tooltipView.getVisibility() == 0)) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Hb */
    public void mo138339Hb(boolean z11) {
        LinearLayout linearLayout = this.f149677o1;
        if (linearLayout == null) {
            return;
        }
        if (z11) {
            AbstractC3085d.m15449k(linearLayout, true, 0.0f, 0.0f, new C32442w());
        } else {
            AbstractC3085d.m15446h(linearLayout, false, 0.0f, 200.0f);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Hc */
    public void mo138340Hc(boolean z11, boolean z12, String str) {
        String str2;
        int i11 = 0;
        if (z11 && z12) {
            str2 = String.format(getString(AbstractC8020f0.str_call_both_off_mic_status), str);
        } else if (z11) {
            str2 = String.format(getString(AbstractC8020f0.str_call_other_off_mic_status), str);
        } else if (z12) {
            str2 = getString(AbstractC8020f0.str_call_off_mic_status);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f149637e1.setText(str2);
        }
        RobotoTextView robotoTextView = this.f149637e1;
        if (!z11 && !z12) {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        m157091Kb();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Iu */
    public void mo138341Iu() {
        if (this.f149561J2 == 1) {
            C17843b.m94137o().m94171d0();
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: JH */
    public void mo138342JH() {
        try {
            Runnable runnable = this.f149525A2;
            if (runnable != null) {
                this.f149642f2.removeCallbacks(runnable);
            }
            NewPhotoSuggestView newPhotoSuggestView = this.f149702u2;
            if (newPhotoSuggestView != null) {
                newPhotoSuggestView.setVisibility(8);
                this.f149588S.removeView(this.f149702u2);
                this.f149702u2 = null;
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "hidePhotoSuggestView : " + e11.getMessage(), e11);
        }
    }

    /* renamed from: Jc */
    void m157089Jc() {
        TextView textView = new TextView(getContext());
        this.f149590S1 = textView;
        textView.setId(AbstractC6918a0.call_tvBubbleToastInfo);
        if (AbstractC3103o.m15619h(17)) {
            this.f149590S1.setTextAlignment(4);
        }
        int m15682q = AbstractC3104p.m15682q() + AbstractC3104p.m15668j() + AbstractC3104p.m15675m0() + AbstractC3104p.m15650a(20.0f);
        if (this.f149557I2) {
            m15682q += AbstractC3104p.m15650a(20.0f);
        }
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.gravity = 81;
        m15698a.setMargins(0, 0, 0, m15682q);
        this.f149590S1.setLayoutParams(m15698a);
        this.f149590S1.setPadding(AbstractC3104p.m15650a(16.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(16.0f), AbstractC3104p.m15650a(8.0f));
        this.f149590S1.setTextColor(-1);
        this.f149590S1.setBackgroundResource(AbstractC16803z.call_time_text_bg);
        this.f149590S1.setVisibility(8);
        this.f149590S1.setMaxWidth(AbstractC3104p.m15650a(300.0f));
        this.f149588S.addView(this.f149590S1);
    }

    /* renamed from: Jd */
    void m157090Jd() {
        TextView textView = new TextView(getContext());
        this.f149638e2 = textView;
        this.f149588S.addView(textView, AbstractC3105q.m15699b(-2, -2, 80));
        this.f149638e2.setVisibility(8);
        this.f149638e2.setBackgroundColor(-16777216);
        this.f149638e2.setTextColor(-1);
        if (this.f149686q2 != null && AbstractC32273e3.m155748Q().m155818K0()) {
            this.f149638e2.setVisibility(0);
            this.f149638e2.setText("Call Id: " + this.f149686q2.m117055Q());
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Jx */
    public void mo138343Jx() {
        String string;
        int i11;
        try {
            this.f149553H2 = true;
            m157120aw(false);
            AbstractC3085d.m15443e(this.f149649h1, true, 0L);
            m156732Eh();
            this.f149524A1.m157300h();
            this.f149524A1.setVisibility(8);
            if (this.f149549G2) {
                this.f149544F1.m157300h();
                this.f149544F1.setVisibility(8);
                this.f149548G1.setVisibility(8);
            }
            this.f149528B1.setVisibility(0);
            if (this.f149549G2) {
                m157113Uv();
                m156826Pw(this.f149701u1, true, false);
                mo138429wr();
            } else {
                m157111Tv();
            }
            boolean m117156r2 = this.f149686q2.m117156r2();
            TextView textView = this.f149605W0;
            if (m117156r2) {
                string = getString(AbstractC8020f0.str_call_timeout_ring_call_status);
            } else {
                string = getString(AbstractC8020f0.str_call_timeout_not_ring_call_status);
            }
            textView.setText(string);
            if (!m117156r2) {
                i11 = 6000;
            } else {
                i11 = 1000;
            }
            this.f149650h2 = i11;
            if (this.f149549G2) {
                VoIPButtonWithText voIPButtonWithText = this.f149701u1;
                if (voIPButtonWithText != null) {
                    voIPButtonWithText.setEnabled(false);
                }
                this.f149586R1.setEnabled(false);
            } else {
                this.f149709w1.setEnabled(false);
                this.f149697t1.setEnabled(false);
                this.f149693s1.setEnabled(false);
            }
            if (!this.f149545F2) {
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Not in front -> FINISH!!!");
                AbstractC3096i0.f13172p = true;
                this.f149650h2 = 0;
            }
            if (!this.f149686q2.m117076X() || AbstractC3096i0.f13167k != 3) {
                this.f149691r3.mo138257Hl();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: KF */
    public void mo138344KF(final boolean z11, final boolean z12, final boolean z13, final String str) {
        runOnUiThread(new Runnable() { // from class: vo0.t4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156973kq(z12, z13, str, z11);
            }
        });
    }

    /* renamed from: Kb */
    void m157091Kb() {
        if (this.f149645g1.getVisibility() == 0 && this.f149637e1.getVisibility() == 0) {
            this.f149641f1.setVisibility(0);
        } else {
            this.f149641f1.setVisibility(8);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Kf */
    public void mo138345Kf(String str) {
        RecyclingImageView recyclingImageView;
        ((C23528a) this.f149662k2.m123612r(this.f149532C1)).m123618x(str, C23278z2.m120143n());
        if (this.f149691r3.mo138314xj() && (recyclingImageView = this.f149552H1) != null) {
            ((C23528a) this.f149662k2.m123612r(recyclingImageView)).m123619y(str, this.f149670m2, 1);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Ks */
    public void mo138346Ks(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.q2
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156893Zn(z11);
            }
        });
    }

    /* renamed from: Kt */
    public void m157092Kt(int i11) {
        this.f149572M2 = i11;
        if (this.f149606W1 != null) {
            if (i11 == 13) {
                this.f149575N2 = System.currentTimeMillis();
                this.f149618Z1.setImageDrawable(C23212s8.m119609q(this, AbstractC16781w.img_switch_video_illustration));
                this.f149622a2.setText(AbstractC8020f0.str_call_switch_vi_confirm);
                this.f149626b2.setText(AbstractC8020f0.str_call_switch_vi_confirm_note);
                this.f149630c2.setText(AbstractC8020f0.str_call_switch_vi_confirm_btn);
            }
            this.f149643f3 = true;
            this.f149606W1.setAlpha(0.0f);
            this.f149606W1.setVisibility(0);
            AbstractC3085d.m15443e(this.f149606W1, true, 250L);
            this.f149610X1.setMaxPosition(m156873Wf());
            this.f149610X1.setMinimizedWithAnimation(1);
            this.f149610X1.setListener(new C32420g());
            this.f149658j2 = 60;
        }
    }

    /* renamed from: Ku */
    void m157093Ku() {
        if (this.f149715x3) {
            return;
        }
        this.f149713x1.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.shake);
        this.f149715x3 = true;
        this.f149713x1.setAnimation(loadAnimation);
    }

    @Override // zm.voip.p721ui.incall.C32457b.a
    /* renamed from: L */
    public void mo157094L(boolean z11) {
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: L4 */
    public boolean mo138347L4() {
        return this.f149611X2;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: LC */
    public void mo138348LC(String str) {
        C13306b c13306b = this.f149706v2;
        if (c13306b != null) {
            c13306b.m74702j(str);
        }
    }

    /* renamed from: Lc */
    public void m157095Lc() {
        boolean z11;
        int i11;
        float f11;
        int i12;
        int i13;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createCaptureLayout ");
        if (this.f149656j0 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", sb2.toString());
        int m15662g = AbstractC3104p.m15662g();
        RelativeLayout relativeLayout = this.f149548G1;
        int i14 = 8;
        if (relativeLayout != null) {
            if (this.f149686q2.m117082Z()) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            relativeLayout.setVisibility(i13);
        }
        if (this.f149656j0 == null && !this.f149686q2.m117067U()) {
            int[] m15680p = AbstractC3104p.m15680p(this.f149691r3.mo138268Po());
            int m15626C = AbstractC3104p.m15626C();
            int m15683q0 = AbstractC3104p.m15683q0();
            FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
            FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -1);
            FrameLayout.LayoutParams m15700c2 = AbstractC3105q.m15700c(-1, -1);
            if (this.f149686q2.m117126k0()) {
                m15698a = AbstractC3105q.m15700c(m15680p[0], m15680p[1]);
                m15698a.gravity = 53;
                m15698a.topMargin = m15626C;
                m15698a.rightMargin = m156730Ef();
                m15700c = AbstractC3105q.m15698a(-1, -1);
                m15700c.setMargins(m15662g, m15662g, m15662g, m15662g);
                m15700c2 = AbstractC3105q.m15698a(-1, -1);
                m15700c2.setMargins(m15683q0, m15683q0, m15683q0, m15683q0);
            }
            SpringCallView springCallView = new SpringCallView(getContext());
            this.f149656j0 = springCallView;
            springCallView.setId(AbstractC6918a0.call_selfContainer);
            this.f149656j0.f150120x = m157048wb();
            this.f149656j0.setLayoutParams(m15698a);
            this.f149656j0.setOnTouchListener(new C32416e());
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: vo0.y3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23) {
                    ZmInCallActivity.this.m157022sj(view, i15, i16, i17, i18, i19, i21, i22, i23);
                }
            };
            this.f149592T = onLayoutChangeListener;
            this.f149588S.addOnLayoutChangeListener(onLayoutChangeListener);
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f149660k0 = appCompatImageView;
            appCompatImageView.setId(AbstractC6918a0.call_captureViewBackground);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(AbstractC1388a.m6961c(getContext(), AbstractC16801x.mini_call_background_color));
            gradientDrawable.setCornerRadius(AbstractC3104p.m15688t());
            gradientDrawable.setStroke(1, 0);
            this.f149660k0.setImageDrawable(gradientDrawable);
            FrameLayout.LayoutParams m15700c3 = AbstractC3105q.m15700c(m15680p[0], m15680p[1]);
            m15700c3.gravity = 17;
            this.f149660k0.setBackgroundResource(AbstractC16803z.bg_call_self_layout);
            this.f149660k0.setPadding(m15662g, m15662g, m15662g, m15662g);
            this.f149660k0.setLayoutParams(m15700c3);
            AppCompatImageView appCompatImageView2 = this.f149660k0;
            if (this.f149686q2.m117126k0()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            appCompatImageView2.setVisibility(i11);
            TextureViewRenderer m15578a = AbstractC3098j0.m15578a(getContext(), true, "selfView");
            this.f149664l0 = m15578a;
            m15578a.setId(AbstractC6918a0.call_selfView);
            AbstractC32273e3.m155748Q().mo155880f2(this.f149664l0, true);
            this.f149664l0.setLayoutParams(m15700c);
            this.f149664l0.registerActionOnNextRender(new OnNextRenderCallback() { // from class: vo0.z3
                @Override // org.webrtc.OnNextRenderCallback
                public final void onNextRender() {
                    ZmInCallActivity.this.m156708Aj();
                }
            });
            TextureViewRenderer textureViewRenderer = this.f149664l0;
            if (this.f149686q2.m117126k0()) {
                f11 = AbstractC3104p.m15688t();
            } else {
                f11 = 0.0f;
            }
            textureViewRenderer.setCorner(f11);
            RoundedImageView roundedImageView = new RoundedImageView(getContext());
            this.f149668m0 = roundedImageView;
            roundedImageView.setId(AbstractC6918a0.call_selfMaskView);
            this.f149668m0.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f149668m0.setImageBitmap(BitmapFactory.decodeResource(getResources(), AbstractC16803z.avatar_blur_default));
            this.f149668m0.setVisibility(0);
            this.f149668m0.setLayoutParams(m15700c2);
            if (this.f149686q2.m117126k0() && !this.f149691r3.mo138256He()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            float f12 = i12;
            this.f149668m0.m76289j(f12, f12, f12, f12);
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f149672n0 = linearLayout;
            linearLayout.setId(AbstractC6918a0.call_captureTextLayout);
            FrameLayout.LayoutParams m15699b = AbstractC3105q.m15699b(-2, -2, 17);
            m15699b.gravity = 81;
            m15699b.bottomMargin = AbstractC3104p.m15650a(10.0f);
            this.f149672n0.setLayoutParams(m15699b);
            this.f149672n0.setOrientation(0);
            this.f149672n0.setVisibility(8);
            this.f149672n0.setGravity(17);
            this.f149672n0.setPadding(AbstractC3104p.m15647X(), AbstractC3104p.m15647X(), AbstractC3104p.m15647X(), AbstractC3104p.m15647X());
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(getContext());
            this.f149676o0 = appCompatImageView3;
            appCompatImageView3.setId(AbstractC6918a0.call_ivCaptureStateCamera);
            AppCompatImageView appCompatImageView4 = this.f149676o0;
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            appCompatImageView4.setScaleType(scaleType);
            this.f149676o0.setImageDrawable(C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_off_cam_solid_24, AbstractC2808b.wht_a100));
            LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f(AbstractC3104p.m15661f0(), AbstractC3104p.m15661f0());
            m15703f.gravity = 16;
            m15703f.setMargins(AbstractC3104p.m15647X() / 2, 0, AbstractC3104p.m15647X() / 2, 0);
            this.f149676o0.setLayoutParams(m15703f);
            this.f149676o0.setVisibility(8);
            AppCompatImageView appCompatImageView5 = new AppCompatImageView(getContext());
            this.f149680p0 = appCompatImageView5;
            appCompatImageView5.setId(AbstractC6918a0.call_ivCaptureStateMic);
            this.f149680p0.setScaleType(scaleType);
            this.f149680p0.setImageDrawable(C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_off_mic_solid_24, AbstractC2808b.wht_a100));
            LinearLayout.LayoutParams m15703f2 = AbstractC3105q.m15703f(AbstractC3104p.m15661f0(), AbstractC3104p.m15661f0());
            m15703f2.gravity = 16;
            m15703f2.setMargins(AbstractC3104p.m15647X() / 2, 0, AbstractC3104p.m15647X() / 2, 0);
            this.f149680p0.setLayoutParams(m15703f2);
            this.f149680p0.setVisibility(8);
            int m6961c = AbstractC1388a.m6961c(getContext(), AbstractC16801x.call_toast_state_text);
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            this.f149684q0 = robotoTextView;
            robotoTextView.setId(AbstractC6918a0.call_captureStateText);
            this.f149684q0.mo75850g(true);
            this.f149684q0.setTextSize(1, 13.0f);
            this.f149684q0.setTextColor(m6961c);
            this.f149684q0.setText(getString(AbstractC8020f0.incall_info_video_local_off_camera));
            this.f149684q0.setVisibility(8);
            LinearLayout.LayoutParams m15704g = AbstractC3105q.m15704g(-2, -2, 17);
            m15704g.setMargins(AbstractC3104p.m15647X() / 2, 0, AbstractC3104p.m15647X() / 2, 0);
            this.f149684q0.setLayoutParams(m15704g);
            AnimChat animChat = new AnimChat(getContext());
            this.f149712x0 = animChat;
            animChat.setId(AbstractC6918a0.call_mAnimChat);
            AnimChat animChat2 = this.f149712x0;
            animChat2.f69990e0 = true;
            animChat2.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
            this.f149712x0.setListener(new AnimChat.InterfaceC13579e() { // from class: vo0.a4
                @Override // com.zing.zalo.p077ui.widget.chat.AnimChat.InterfaceC13579e
                /* renamed from: a */
                public final void mo76134a(String str) {
                    ZmInCallActivity.this.m156743Fj(str);
                }
            });
            this.f149712x0.m76125x0();
            this.f149672n0.addView(this.f149676o0);
            this.f149672n0.addView(this.f149680p0);
            this.f149672n0.addView(this.f149684q0);
            this.f149656j0.addView(this.f149660k0);
            this.f149656j0.addView(this.f149664l0);
            this.f149656j0.addView(this.f149668m0);
            this.f149656j0.addView(this.f149672n0);
            this.f149596U.addView(this.f149656j0);
            this.f149596U.addView(this.f149688r0);
            AnimChat animChat3 = this.f149712x0;
            if (animChat3 != null) {
                this.f149596U.addView(animChat3);
            }
            m156987nb(this.f149656j0);
        } else if (this.f149656j0 != null && this.f149686q2.m117126k0()) {
            this.f149660k0.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149664l0.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.setMargins(m15662g, m15662g, m15662g, m15662g);
            this.f149664l0.setLayoutParams(layoutParams);
            this.f149664l0.setCorner(AbstractC3104p.m15688t());
            this.f149664l0.renderBlackFrame();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f149668m0.getLayoutParams();
            layoutParams2.setMargins(m15662g, m15662g, m15662g, m15662g);
            layoutParams2.height = -1;
            this.f149668m0.setLayoutParams(layoutParams2);
            if (!this.f149686q2.m117126k0() || this.f149691r3.mo138256He()) {
                i14 = 0;
            }
            float f13 = i14;
            this.f149668m0.m76289j(f13, f13, f13, f13);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f149656j0.getLayoutParams();
            int[] m15680p2 = AbstractC3104p.m15680p(this.f149691r3.mo138268Po());
            layoutParams3.width = m15680p2[0];
            layoutParams3.height = m15680p2[1];
            layoutParams3.gravity = 53;
            layoutParams3.topMargin = m156776Jf();
            layoutParams3.rightMargin = m156730Ef();
            this.f149656j0.setLayoutParams(layoutParams3);
            this.f149656j0.clearAnimation();
        }
        if (!this.f149686q2.m117079Y()) {
            m157107Qh();
        }
    }

    /* renamed from: Le */
    public void m157096Le() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createRenderLayout ");
        if (this.f149604W == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", sb2.toString());
        if (this.f149604W == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.f149604W = frameLayout;
            frameLayout.setId(AbstractC6918a0.call_renderLayout);
            FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
            m15698a.gravity = 3;
            this.f149604W.setLayoutParams(m15698a);
            TextureViewRenderer m15578a = AbstractC3098j0.m15578a(getContext(), false, "partnerView");
            this.f149608X = m15578a;
            if (this.f149671m3 == 1) {
                m15578a.setVideoRenderMode(this.f149686q2.f110922f);
                this.f149608X.setRenderListener(new C32414d());
            }
            this.f149608X.setId(AbstractC6918a0.call_partnerView);
            this.f149608X.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
            this.f149608X.setTimeoutAwait(AbstractC32273e3.m155758Y());
            AbstractC3098j0.m15580c(this.f149608X);
            if (!AbstractC3096i0.m15538g() || !AbstractC3096i0.f13170n) {
                AbstractC32273e3.m155748Q().mo155880f2(this.f149608X, false);
            }
            this.f149608X.registerActionOnNextRender(new OnNextRenderCallback() { // from class: vo0.v3
                @Override // org.webrtc.OnNextRenderCallback
                public final void onNextRender() {
                    ZmInCallActivity.this.m156930el();
                }
            });
            RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
            this.f149612Y = recyclingImageView;
            recyclingImageView.setId(AbstractC6918a0.call_partnerMaskView);
            this.f149612Y.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f149612Y.setImageResource(AbstractC16803z.avatar_blur_default);
            this.f149612Y.setVisibility(0);
            this.f149612Y.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
            mo138388bp(this.f149686q2.m117007A());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f149640f0 = linearLayout;
            linearLayout.setId(AbstractC6918a0.call_renderStateContainer);
            this.f149640f0.setOrientation(0);
            FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-2, -2);
            m15698a2.gravity = m156958ig();
            m15698a2.setMargins(AbstractC3104p.m15624A(), 0, AbstractC3104p.m15625B(), m157007qg());
            this.f149640f0.setBackgroundResource(AbstractC16803z.bg_render_state_container_call);
            this.f149640f0.setLayoutParams(m15698a2);
            this.f149640f0.setGravity(17);
            this.f149640f0.setPadding(AbstractC3104p.m15647X(), AbstractC3104p.m15647X(), AbstractC3104p.m15647X(), AbstractC3104p.m15647X());
            this.f149640f0.setVisibility(4);
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f149644g0 = appCompatImageView;
            appCompatImageView.setId(AbstractC6918a0.call_ivRenderStateCamera);
            AppCompatImageView appCompatImageView2 = this.f149644g0;
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            appCompatImageView2.setScaleType(scaleType);
            this.f149644g0.setImageDrawable(C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_off_cam_solid_24, AbstractC2808b.wht_a100));
            LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f(AbstractC3104p.m15661f0(), AbstractC3104p.m15661f0());
            m15703f.gravity = 16;
            m15703f.setMargins(AbstractC3104p.m15647X() / 2, 0, AbstractC3104p.m15647X() / 2, 0);
            this.f149644g0.setLayoutParams(m15703f);
            this.f149644g0.setVisibility(8);
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(getContext());
            this.f149648h0 = appCompatImageView3;
            appCompatImageView3.setId(AbstractC6918a0.call_ivRenderStateMic);
            this.f149648h0.setScaleType(scaleType);
            this.f149648h0.setImageDrawable(C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_off_mic_solid_24, AbstractC2808b.wht_a100));
            LinearLayout.LayoutParams m15703f2 = AbstractC3105q.m15703f(AbstractC3104p.m15661f0(), AbstractC3104p.m15661f0());
            m15703f2.gravity = 16;
            m15703f2.setMargins(AbstractC3104p.m15647X() / 2, 0, AbstractC3104p.m15647X() / 2, 0);
            this.f149648h0.setLayoutParams(m15703f2);
            this.f149648h0.setVisibility(8);
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            this.f149652i0 = robotoTextView;
            robotoTextView.setId(AbstractC6918a0.call_renderStateText);
            this.f149652i0.mo75850g(true);
            LinearLayout.LayoutParams m15704g = AbstractC3105q.m15704g(-2, -2, 17);
            m15704g.setMargins(AbstractC3104p.m15647X() / 2, 0, AbstractC3104p.m15647X(), 0);
            this.f149652i0.setLayoutParams(m15704g);
            this.f149652i0.setTextSize(1, 13.0f);
            this.f149652i0.setTextColor(AbstractC1388a.m6961c(getContext(), AbstractC16801x.call_toast_state_text));
            this.f149652i0.setGravity(17);
            this.f149640f0.addView(this.f149644g0);
            this.f149640f0.addView(this.f149648h0);
            this.f149640f0.addView(this.f149652i0);
            this.f149604W.addView(this.f149608X);
            this.f149604W.addView(this.f149612Y);
            this.f149604W.addView(this.f149640f0);
            m157061xf();
            this.f149596U.addView(this.f149604W, 0);
            this.f149604W.post(new Runnable() { // from class: vo0.w3
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.this.m156938fl();
                }
            });
            m156746Fs();
            m156987nb(this.f149604W);
        }
        this.f149608X.registerSurfaceViewCallback(this);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Lf */
    public void mo138349Lf(boolean z11) {
        TextureViewRenderer textureViewRenderer = this.f149608X;
        if (textureViewRenderer != null) {
            textureViewRenderer.setAnim(z11);
        }
    }

    /* renamed from: Lh */
    void m157097Lh() {
        m157109Sh();
        this.f149662k2 = new C23528a((Activity) this);
        this.f149694s2 = C23212s8.m119609q(this, AbstractC16781w.default_avatar);
        C24003n c24003n = new C24003n();
        this.f149670m2 = c24003n;
        c24003n.f116264e = 1000;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116271l = AbstractC16803z.default_avatar;
        c24003n.f116261b = this.f149694s2;
        c24003n.f116265f = true;
        C24003n c24003n2 = new C24003n();
        this.f149674n2 = c24003n2;
        c24003n2.f116264e = 1006;
        c24003n2.f116275p = true;
        c24003n2.f116276q = true;
        c24003n2.f116271l = AbstractC16803z.avatar_blur_default;
        c24003n2.f116261b = AbstractC1388a.m6964f(getContext(), AbstractC16803z.avatar_blur_default);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Lm */
    public void mo138350Lm(boolean z11) {
        int i11;
        SpringCallView springCallView = this.f149656j0;
        if (springCallView == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        springCallView.setVisibility(i11);
    }

    /* renamed from: Lu */
    void m157098Lu() {
        if (this.f149711w3) {
            return;
        }
        this.f149689r1.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.shake);
        this.f149711w3 = true;
        this.f149689r1.setAnimation(loadAnimation);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: MG */
    public void mo138351MG(int i11, int i12) {
        PictureInPictureParams.Builder aspectRatio;
        PictureInPictureParams build;
        boolean enterPictureInPictureMode;
        try {
            Rational rational = new Rational(i11, i12);
            AbstractC28394d.m142928a();
            PictureInPictureParams.Builder m142926a = AbstractC28386c.m142926a();
            aspectRatio = m142926a.setAspectRatio(rational);
            aspectRatio.build();
            build = m142926a.build();
            enterPictureInPictureMode = enterPictureInPictureMode(build);
            if (enterPictureInPictureMode) {
                mo138349Lf(true);
            }
            this.f149603V2 = false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Mc */
    void m157099Mc() {
        m157135pc();
        m157101Nd();
        m157086Ee();
        m157100Md();
        m157090Jd();
    }

    /* renamed from: Md */
    void m157100Md() {
        ZmInCallDebug zmInCallDebug = new ZmInCallDebug(this);
        this.f149634d2 = zmInCallDebug;
        zmInCallDebug.setId(AbstractC6918a0.call_debug_layout);
        this.f149634d2.setVisibility(8);
        this.f149588S.addView(this.f149634d2, AbstractC3105q.m15698a(-1, -1));
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Me */
    public void mo138352Me(boolean z11, boolean z12) {
        long j11;
        CircleBackgroundImageView circleBackgroundImageView = this.f149681p1;
        if (circleBackgroundImageView == null) {
            return;
        }
        if (z12) {
            j11 = 300;
        } else {
            j11 = 0;
        }
        AbstractC3085d.m15443e(circleBackgroundImageView, z11, j11);
        mo138398iE(this.f149691r3.mo138263Lh());
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: N6 */
    public void mo138353N6(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.l3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156797Lo(z11);
            }
        });
    }

    /* renamed from: Nd */
    void m157101Nd() {
        m157140vf();
        if (this.f149691r3.mo138314xj() && this.f149691r3.mo138287c1() && !this.f149686q2.m117038K0()) {
            m157095Lc();
        }
        m157145zc();
        m157108Rd();
        m157118Zd();
        m157141wd();
        m157138re();
        m157089Jc();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: No */
    public void mo138354No(final C25937a c25937a, final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.y1
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156780Jo(c25937a, z11);
            }
        });
    }

    /* renamed from: Nr */
    public void m157102Nr(int i11) {
        try {
            if (this.f149691r3.mo138312wg() && this.f149691r3.mo138314xj()) {
                this.f149691r3.mo138267Pl(7000L);
            }
            if (i11 != 16) {
                if (i11 != 17) {
                    int i12 = 1;
                    if (i11 != 20) {
                        if (i11 != 39) {
                            switch (i11) {
                                case 3:
                                case 4:
                                    break;
                                case 5:
                                    if (this.f149686q2.m117126k0()) {
                                        AbstractC32273e3.m155748Q().mo116932d(!this.f149697t1.isSelected());
                                    }
                                    if (this.f149697t1.isSelected()) {
                                        AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40009));
                                        C32319o.m156293t().m156321j0(false);
                                        this.f149686q2.f110947r0 = false;
                                    } else {
                                        AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40008));
                                        C32319o.m156293t().m156321j0(true);
                                        this.f149686q2.f110947r0 = true;
                                    }
                                    if (this.f149549G2) {
                                        if (5 == this.f149686q2.m117113h()) {
                                            this.f149691r3.mo138279Uf();
                                        }
                                    } else {
                                        this.f149691r3.mo138276Sk();
                                    }
                                    this.f149697t1.m157425j(this.f149557I2);
                                    this.f149697t1.setSelected(!r10.isSelected());
                                    return;
                                case 6:
                                    AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SPEAKER_BTN", new Runnable() { // from class: vo0.h6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ZmInCallActivity.this.m156715Bn();
                                        }
                                    }, 500L);
                                    return;
                                case 7:
                                    if (this.f149686q2.m117167v0()) {
                                        AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40007));
                                        AbstractC32273e3.m155748Q().mo155789C2();
                                        return;
                                    } else {
                                        AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40006));
                                        AbstractC32273e3.m155748Q().mo155931w0();
                                        return;
                                    }
                                case 8:
                                    AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40005));
                                    C32319o.m156293t().m156317f0();
                                    this.f149691r3.mo138257Hl();
                                    break;
                                case 9:
                                    if (!this.f149691r3.mo138252G9()) {
                                        return;
                                    }
                                    AbstractC32273e3.m155748Q().m155937x2();
                                    m156891Ys(false);
                                    mo138382Zh(false);
                                    this.f149631c3 = true;
                                    if (this.f149656j0 != null && !this.f149691r3.mo138256He() && !this.f149686q2.m117082Z()) {
                                        this.f149656j0.clearAnimation();
                                        if (this.f149537D2 == null) {
                                            this.f149537D2 = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), AbstractC10923u.card_flip_left_out);
                                        }
                                        this.f149537D2.setTarget(this.f149656j0);
                                        this.f149537D2.addListener(new C32430l());
                                        this.f149537D2.start();
                                    }
                                    this.f149686q2.m117012B1(System.currentTimeMillis());
                                    return;
                                default:
                                    switch (i11) {
                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                            this.f149691r3.mo138248Ca();
                                            return;
                                        case 31:
                                            CircleBackgroundImageView circleBackgroundImageView = this.f149613Y0;
                                            if (circleBackgroundImageView != null) {
                                                circleBackgroundImageView.setSelected(true);
                                            }
                                            if (AbstractC0924m0.m4402zc()) {
                                                C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_audio_switch_video", new String[0]), false);
                                                m156802Mh(13);
                                                return;
                                            } else {
                                                m156720Cs();
                                                return;
                                            }
                                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                            if (!this.f149691r3.mo138280Ul()) {
                                                m157102Nr(33);
                                                mo138402kB();
                                                return;
                                            } else {
                                                if (mo138358P0()) {
                                                    if (this.f149686q2.m117038K0()) {
                                                        AbstractC32273e3.m155748Q().mo155919t(true);
                                                        m156981mb(true);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                CircleBackgroundView circleBackgroundView = this.f149544F1;
                                                if (circleBackgroundView != null) {
                                                    circleBackgroundView.m157300h();
                                                }
                                                mo138422u2(139);
                                                return;
                                            }
                                        case 33:
                                            if (this.f149686q2.m117038K0()) {
                                                AbstractC32273e3.m155748Q().mo155919t(false);
                                                m156981mb(false);
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                            }
                            if (i11 != 3) {
                                i12 = 2;
                            }
                            if (m156907bb(i12)) {
                                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Answer call ");
                                this.f149689r1.clearAnimation();
                                return;
                            }
                            return;
                        }
                        m156781Ju();
                        return;
                    }
                    if (this.f149686q2.m117176y0()) {
                        mo138425vt(this.f149691r3.mo138281Vd());
                        return;
                    } else {
                        if (this.f149608X != null) {
                            this.f149691r3.mo138277T4(true, 1000L);
                            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vo0.a2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZmInCallActivity.this.m156756Gn();
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                if (!this.f149686q2.m117086a0()) {
                    return;
                }
            }
            if (AbstractC32273e3.m155748Q().m155815J0()) {
                this.f149634d2.m157184y();
                this.f149634d2.bringToFront();
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "Was not able to call service method", e11);
        }
    }

    /* renamed from: Ns */
    public void m157103Ns(final int i11) {
        RecyclerView recyclerView = this.f149551H0;
        if (recyclerView != null) {
            recyclerView.m9866X1();
            if (!m156883Xn(i11)) {
                this.f149551H0.m9837K1(i11);
                this.f149551H0.post(new Runnable() { // from class: vo0.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZmInCallActivity.this.m156883Xn(i11);
                    }
                });
            }
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: O7 */
    public void mo138355O7(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.o5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156998op(z11);
            }
        });
    }

    /* renamed from: Og */
    void m157104Og(int i11, Object... objArr) {
        ZmInCallDebug zmInCallDebug;
        C22626t c22626t;
        if (i11 != 1003) {
            AbstractC3082b0.m15421c("ZmInCallActivity_Log", "callStateReceiver: action = " + i11 + ", isQuitting = " + this.f149541E2);
        }
        switch (i11) {
            case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                C22598f m156334u = C32319o.m156293t().m156334u();
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Media update ....");
                if (!m156334u.equals(this.f149690r2)) {
                    this.f149690r2 = m156334u;
                    m157139uw();
                    this.f149691r3.mo138259In();
                    return;
                }
                return;
            case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                if (objArr != null && objArr.length >= 1) {
                    String str = (String) objArr[0];
                    if (AbstractC32273e3.m155748Q().m155815J0() && (zmInCallDebug = this.f149634d2) != null) {
                        zmInCallDebug.m157178A(str, this.f149686q2);
                        return;
                    }
                    return;
                }
                return;
            case 1004:
                if (this.f149545F2 && (c22626t = this.f149686q2) != null && c22626t.m117126k0() && this.f149549G2) {
                    AbstractC3096i0.m15516T0(AbstractC8020f0.incall_info_local_camera_auto_turn_off);
                    return;
                }
                return;
            case 1005:
                if (objArr != null && objArr.length >= 1) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int intValue2 = ((Integer) objArr[1]).intValue();
                    if (intValue == 1 || intValue == 2) {
                        m156806Mt(intValue2);
                        return;
                    }
                    return;
                }
                return;
            case 1006:
                if (objArr != null && objArr.length >= 1) {
                    m157077yr(((Integer) objArr[1]).intValue());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: On */
    public void mo138356On() {
        CircleBackgroundImageView circleBackgroundImageView;
        if (this.f149549G2 && (circleBackgroundImageView = this.f149720z0) != null && this.f149527B0 != null) {
            circleBackgroundImageView.setSelected(false);
            mo138384Zo(this.f149691r3.mo138309v4());
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Oo */
    public void mo138357Oo(boolean z11, boolean z12) {
        AnimChat animChat = this.f149712x0;
        if (animChat != null) {
            if (z11) {
                animChat.m76125x0();
            }
            this.f149712x0.m76101A0(z11, z12);
        }
    }

    /* renamed from: Ou */
    void m157105Ou() {
        if (this.f149558I3 != null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f149558I3 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vo0.u4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZmInCallActivity.this.m157076yo(valueAnimator);
            }
        });
        this.f149558I3.setDuration(1000L);
        this.f149558I3.setInterpolator(new LinearInterpolator());
        this.f149558I3.setRepeatCount(-1);
        this.f149558I3.setRepeatMode(1);
        this.f149558I3.start();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: P0 */
    public boolean mo138358P0() {
        if (AbstractC23034c6.m118167n(this, AbstractC23034c6.f112033j) == 0) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: PF */
    public void mo138359PF(boolean z11, boolean z12) {
        String str;
        int i11;
        if (this.f149549G2) {
            return;
        }
        if (z11) {
            this.f149645g1.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_white_bluetooth_button), (Drawable) null, (Drawable) null, (Drawable) null);
            str = getString(AbstractC8020f0.str_call_blu_speaker_status);
        } else if (z12) {
            this.f149645g1.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_white_speaker_button), (Drawable) null, (Drawable) null, (Drawable) null);
            str = getString(AbstractC8020f0.str_call_ex_speaker_status);
        } else {
            str = "";
        }
        this.f149691r3.mo138303pl();
        this.f149645g1.setText(str);
        RobotoTextView robotoTextView = this.f149645g1;
        if (!z11 && !z12) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
        m157091Kb();
        this.f149691r3.mo138316z8();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: PH */
    public void mo138360PH(boolean z11, boolean z12, boolean z13, String str) {
        AppCompatImageView appCompatImageView;
        int i11;
        int i12;
        if (this.f149676o0 != null && (appCompatImageView = this.f149680p0) != null) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            appCompatImageView.setVisibility(i11);
            AppCompatImageView appCompatImageView2 = this.f149676o0;
            if (z13) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            appCompatImageView2.setVisibility(i12);
            if (str == null) {
                this.f149684q0.setVisibility(8);
            } else {
                this.f149684q0.setVisibility(0);
                this.f149684q0.setText(str);
            }
            m156909bx(z11);
        }
    }

    /* renamed from: Pt */
    public void m157106Pt(boolean z11) {
        int i11;
        TextureViewRenderer textureViewRenderer = this.f149664l0;
        if (textureViewRenderer != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textureViewRenderer.setVisibility(i11);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: QD */
    public void mo138361QD() {
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Bluetooth Headset Available");
        SpeakerChooserDialog speakerChooserDialog = new SpeakerChooserDialog(this.f149686q2.m117047N0() ? 1 : 0);
        this.f149665l1 = speakerChooserDialog;
        speakerChooserDialog.m92602UK(this.f149666l2, "SpeakerChooserDialog");
    }

    /* renamed from: Qh */
    void m157107Qh() {
        if (this.f149664l0 != null && !this.f149595T2) {
            AbstractC3098j0.m15580c(this.f149664l0);
            this.f149595T2 = true;
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Qi */
    public void mo138362Qi() {
        if (this.f149656j0 != null && !this.f149691r3.mo138256He() && this.f149686q2.m117126k0()) {
            this.f149656j0.m157410g(SpringCallView.EnumC32504b.SCALE_UP, true);
            mo138412rF(2000L);
        }
    }

    /* renamed from: Rd */
    void m157108Rd() {
        if (this.f149549G2) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149589S0 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-2, -2);
        m15700c.gravity = 49;
        m15700c.topMargin = AbstractC3104p.m15626C() + AbstractC3104p.m15649Z();
        this.f149589S0.setLayoutParams(m15700c);
        if (!this.f149686q2.m117086a0()) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f149585R0 = appCompatImageView;
            appCompatImageView.setId(AbstractC6918a0.call_waterMaskZalo);
            LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
            m15701d.gravity = 17;
            this.f149585R0.setLayoutParams(m15701d);
            this.f149585R0.setImageResource(AbstractC16803z.watermark_zalo);
            this.f149585R0.setOnClickListener(new View.OnClickListener() { // from class: vo0.a6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156796Lk(view);
                }
            });
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
            this.f149573N0 = appCompatImageView2;
            appCompatImageView2.setId(AbstractC6918a0.call_hd_label);
            LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
            m15701d2.gravity = 17;
            m15701d2.topMargin = AbstractC3104p.m15650a(4.0f);
            m15701d2.bottomMargin = AbstractC3104p.m15650a(9.0f);
            this.f149573N0.setPadding(AbstractC3104p.m15648Y(), AbstractC3104p.m15648Y(), AbstractC3104p.m15648Y(), AbstractC3104p.m15648Y());
            this.f149573N0.setLayoutParams(m15701d2);
            this.f149573N0.setVisibility(8);
            this.f149573N0.setImageResource(AbstractC16803z.res_call_hd_label_selector);
            this.f149573N0.setOnClickListener(new View.OnClickListener() { // from class: vo0.b6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156803Mk(view);
                }
            });
            this.f149589S0.addView(this.f149585R0);
            this.f149589S0.addView(this.f149573N0);
        }
        this.f149588S.addView(this.f149589S0);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Rr */
    public void mo138363Rr(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.v5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156860Up(z11);
            }
        });
    }

    /* renamed from: Sh */
    void m157109Sh() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i11;
        int i12;
        Rect bounds2;
        int i13;
        int i14;
        Rect bounds3;
        Rect bounds4;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
                bounds = currentWindowMetrics.getBounds();
                int width = bounds.width();
                i11 = insetsIgnoringVisibility.left;
                int i15 = width - i11;
                i12 = insetsIgnoringVisibility.right;
                AbstractC3104p.f13184a = i15 - i12;
                bounds2 = currentWindowMetrics.getBounds();
                int height = bounds2.height();
                i13 = insetsIgnoringVisibility.top;
                i14 = insetsIgnoringVisibility.bottom;
                AbstractC3104p.f13185b = (height - i13) - i14;
                bounds3 = currentWindowMetrics.getBounds();
                AbstractC3104p.f13186c = bounds3.height();
                bounds4 = currentWindowMetrics.getBounds();
                AbstractC3104p.f13187d = bounds4.width();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
                defaultDisplay.getMetrics(displayMetrics);
                AbstractC3104p.f13184a = displayMetrics.widthPixels;
                AbstractC3104p.f13185b = displayMetrics.heightPixels;
                if (!mo138421th()) {
                    defaultDisplay.getRealMetrics(displayMetrics);
                }
                AbstractC3104p.f13186c = displayMetrics.heightPixels;
                AbstractC3104p.f13187d = displayMetrics.widthPixels;
            }
            AbstractC3104p.f13188e = AbstractC17484n.Companion.m92931b();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Sv */
    public void mo138364Sv(boolean z11) {
        int i11;
        ZaloZinstantLayout zaloZinstantLayout = this.f149669m1;
        if (zaloZinstantLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            zaloZinstantLayout.setVisibility(i11);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: TA */
    public void mo138365TA(boolean z11) {
        LiveEmojiButton liveEmojiButton = this.f149716y0;
        if (liveEmojiButton == null) {
            return;
        }
        liveEmojiButton.setEnabled(z11);
        if (z11) {
            this.f149716y0.m76397f();
        } else {
            this.f149716y0.m76396e(-1);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Tq */
    public void mo138366Tq(String str) {
        if (this.f149668m0 != null && !TextUtils.isEmpty(str)) {
            ((C23528a) this.f149662k2.m123612r(this.f149668m0)).m123577A(str, this.f149674n2, 1, new C32424i(str));
        }
    }

    /* renamed from: Tt */
    public void m157110Tt() {
        try {
            if (this.f149666l2.m92996E0("SHOW_ALERT_NO_RECORD") == null) {
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "showNotRecordView");
                this.f149666l2.mo89693h2(new NotRecordAlertView(), "SHOW_ALERT_NO_RECORD", 0, false);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "showNotRecordAlertView : " + e11.getMessage(), e11);
        }
    }

    /* renamed from: Tv */
    void m157111Tv() {
        CircularProgressIndicator circularProgressIndicator = this.f149540E1;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.m157327v();
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: U4 */
    public void mo138367U4(EnumC32540i enumC32540i, EnumC32540i enumC32540i2) {
        if (!this.f149686q2.m117047N0()) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_more", String.valueOf(1)), false);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        bundle.putInt("CALL_IS_SPLIT_MODE", enumC32540i.ordinal());
        bundle.putInt("CALL_IS_FILTER_ON", enumC32540i2.ordinal());
        mo35581q(CallConfigView.class, bundle, 0, 2, true);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: UE */
    public void mo138368UE(int i11, int i12) {
        SpringCallView springCallView = this.f149656j0;
        if (springCallView == null) {
            return;
        }
        springCallView.m157409f(i11, i12);
    }

    /* renamed from: Ug */
    public void m157112Ug() {
        AbstractC32273e3.m155748Q().mo116929a(-15, 10);
    }

    /* renamed from: Uv */
    void m157113Uv() {
        CircularProgressIndicator circularProgressIndicator = this.f149560J1;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.m157327v();
        }
    }

    /* renamed from: Uw */
    public void m157114Uw(boolean z11) {
        int i11;
        VoIPButtonWithText voIPButtonWithText = this.f149705v1;
        if (voIPButtonWithText == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        voIPButtonWithText.setVisibility(i11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Ux */
    public void mo138369Ux(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.x4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156884Xo(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: VC */
    public String mo138370VC() {
        return getString(AbstractC8020f0.unknown_user);
    }

    /* renamed from: Vh */
    void m157115Vh() {
        C32441v c32441v = new C32441v(getApplicationContext());
        this.f149533C2 = c32441v;
        if (c32441v.canDetectOrientation()) {
            this.f149533C2.enable();
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Vo */
    public void mo138371Vo(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.u5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156839Ro(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Vs */
    public void mo138372Vs(final String str, final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.p3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156798Lp(str, z11);
            }
        });
    }

    /* renamed from: Vu */
    void m157116Vu(int i11) {
        CircularProgressIndicator circularProgressIndicator = this.f149540E1;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.m157327v();
            this.f149540E1.m157326q(0, i11);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Vy */
    public void mo138373Vy(int i11) {
        CircleBackgroundImageView circleBackgroundImageView;
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Update ui from call state " + this.f149686q2.m117043M(getContext()));
        boolean mo138314xj = this.f149691r3.mo138314xj();
        boolean mo138287c1 = this.f149691r3.mo138287c1();
        if (this.f149549G2 != mo138314xj) {
            this.f149549G2 = mo138314xj;
            this.f149581P2 = false;
            if (this.f149549G2 && this.f149686q2.m117082Z() && this.f149686q2.m117090b0() && !this.f149591S2) {
                m156982mf();
            }
            if (this.f149549G2) {
                m156935fh();
                this.f149693s1 = null;
                m157086Ee();
                m157141wd();
                m157138re();
                m156963jb();
                if (this.f149686q2 != null) {
                    m157063xr();
                }
                this.f149642f2.removeMessages(2);
                this.f149642f2.sendEmptyMessageDelayed(2, 1000L);
            }
        }
        if (!this.f149581P2) {
            m157120aw(this.f149549G2);
            boolean m117106f0 = this.f149686q2.m117106f0();
            this.f149581P2 = true;
            this.f149584Q2 = false;
            if (m117106f0) {
                this.f149528B1.setVisibility(8);
                RelativeLayout relativeLayout = this.f149548G1;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                this.f149594T1.setVisibility(8);
            }
        }
        m157139uw();
        switch (i11) {
            case 1:
            case 2:
            case 3:
                mo138396gu(this.f149691r3.mo138247C8(), false);
                if (this.f149686q2.m117090b0() && this.f149686q2.m117029H0()) {
                    this.f149588S.post(new Runnable() { // from class: vo0.f5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZmInCallActivity.this.m156718Cm();
                        }
                    });
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                m157111Tv();
                VoIPButtonWithText voIPButtonWithText = this.f149685q1;
                if (voIPButtonWithText != null) {
                    voIPButtonWithText.m157421f(getString(AbstractC8020f0.str_call_hangup_button_text));
                }
                m156732Eh();
                if (!this.f149584Q2) {
                    if (this.f149549G2) {
                        if (this.f149686q2.m117038K0()) {
                            m157064xu();
                        } else {
                            m157095Lc();
                            m157096Le();
                            m157119af();
                            m157117We();
                        }
                        this.f149691r3.mo138245A8();
                        mo138350Lm(this.f149691r3.mo138300mg());
                        this.f149691r3.mo138304q6();
                        this.f149691r3.mo138267Pl(7000L);
                    } else {
                        this.f149691r3.mo138276Sk();
                        this.f149691r3.mo138259In();
                    }
                    if (!this.f149686q2.m117038K0()) {
                        m157132nw(3);
                    }
                    this.f149524A1.m157300h();
                    this.f149524A1.setVisibility(8);
                    mo138396gu(this.f149691r3.mo138247C8(), false);
                    this.f149583Q1.setEnabled(true);
                    if (this.f149549G2) {
                        if (mo138287c1 && !this.f149686q2.m117038K0()) {
                            CircleBackgroundView circleBackgroundView = this.f149544F1;
                            if ((circleBackgroundView != null) & (this.f149548G1 != null)) {
                                circleBackgroundView.m157300h();
                                this.f149548G1.setVisibility(8);
                            }
                        }
                        this.f149691r3.mo138279Uf();
                        m156926ec();
                        SpringCallView springCallView = this.f149656j0;
                        if (springCallView != null) {
                            springCallView.f150120x = m157048wb();
                            mo138368UE(3, this.f149691r3.mo138266Pj() ? 3 : 1);
                            mo138327CH(false);
                        }
                        TextureViewRenderer textureViewRenderer = this.f149664l0;
                        if (textureViewRenderer != null && this.f149668m0 != null) {
                            textureViewRenderer.setMirror(!this.f149686q2.m117110g0());
                            this.f149664l0.setCorner(!this.f149691r3.mo138256He() ? AbstractC3104p.m15688t() : 0.0f);
                            float f11 = (!this.f149686q2.m117126k0() || this.f149691r3.mo138256He()) ? 0 : 8;
                            this.f149668m0.m76289j(f11, f11, f11, f11);
                        }
                        this.f149696t0.start();
                        this.f149696t0.setBase(this.f149686q2.m117121j());
                        FrameLayout frameLayout = this.f149588S;
                        frameLayout.setBackgroundColor(AbstractC23136l9.m118641B(frameLayout.getContext(), AbstractC16801x.black));
                        this.f149528B1.setVisibility(8);
                        this.f149688r0.setVisibility(0);
                        this.f149588S.post(new Runnable() { // from class: vo0.h5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ZmInCallActivity.this.m157019sb();
                            }
                        });
                    } else {
                        this.f149609X0.start();
                        this.f149609X0.setBase(this.f149686q2.m117121j());
                        this.f149528B1.setVisibility(0);
                        this.f149688r0.setVisibility(8);
                        if (m156936fi() && (circleBackgroundImageView = this.f149613Y0) != null) {
                            circleBackgroundImageView.setVisibility(0);
                            this.f149613Y0.setEnabled(!this.f149686q2.m117041L0());
                            this.f149613Y0.setSelected(this.f149686q2.m117041L0());
                        }
                    }
                    this.f149650h2 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                    this.f149584Q2 = true;
                    m157088Gd(false);
                }
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "NOTIFY CALL STATE CHANGE CONFIRM: quality = " + this.f149686q2.m117125k() + " " + this.f149686q2.m117093c());
                int m117016D = this.f149686q2.m117016D();
                if (this.f149549G2) {
                    this.f149696t0.setTextColor(m117016D);
                    AbstractC32273e3.m155748Q().mo155792D1();
                } else {
                    if (this.f149573N0 != null) {
                        m157065xw();
                    }
                    this.f149609X0.setTextColor(m117016D);
                    AbstractC32273e3.m155748Q().mo155792D1();
                }
                AbstractC32273e3.m155748Q().mo155868b2((this.f149549G2 ? this.f149696t0 : this.f149609X0).getBase());
                this.f149605W0.setVisibility(8);
                if (!this.f149686q2.m117118i0() || AbstractC32273e3.m155748Q().mo155855W().f123736a) {
                    return;
                }
                m157110Tt();
                return;
            case 6:
                m156732Eh();
                m157111Tv();
                m157113Uv();
                if (mo138392ep()) {
                    this.f149691r3.mo138285Y6(true);
                }
                if (!mo138287c1 && !this.f149686q2.f110925g0 && !this.f149655i3) {
                    m157132nw(2);
                }
                m157132nw(5);
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Update disconnected state!");
                if (this.f149549G2) {
                    this.f149586R1.setEnabled(false);
                    this.f149600V.setVisibility(8);
                    this.f149696t0.stop();
                    CircleBackgroundView circleBackgroundView2 = this.f149544F1;
                    if (circleBackgroundView2 != null) {
                        circleBackgroundView2.m157300h();
                        this.f149544F1.setVisibility(8);
                    }
                    mo138356On();
                } else {
                    this.f149709w1.setEnabled(false);
                    ShowcaseView showcaseView = this.f149710w2;
                    if (showcaseView != null) {
                        showcaseView.m74626d();
                    }
                    AppCompatImageView appCompatImageView = this.f149573N0;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                    this.f149609X0.stop();
                }
                if (this.f149689r1 != null && this.f149686q2.m117090b0()) {
                    this.f149689r1.setVisibility(8);
                }
                CircleBackgroundView circleBackgroundView3 = this.f149524A1;
                if (circleBackgroundView3 != null) {
                    circleBackgroundView3.m157300h();
                    this.f149524A1.setVisibility(8);
                }
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (this.f149686q2.m117157s() != -3) {
                    if (this.f149686q2.m117157s() == -4) {
                    }
                    mo138364Sv(false);
                    if (!this.f149565K2 && this.f149686q2.m117076X() && AbstractC3096i0.f13167k == 3 && !mo138335F2()) {
                        this.f149691r3.mo138286bm(EnumC23411b.f113755q);
                    } else {
                        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Active call session is disconnected or null wait for quit...");
                        this.f149691r3.mo138257Hl();
                    }
                    if (this.f149686q2.f110960y != 0 || mo138335F2()) {
                        return;
                    }
                    this.f149691r3.mo138286bm(this.f149686q2.f110960y == 1 ? EnumC23411b.f113756r : EnumC23411b.f113757s);
                    return;
                }
                this.f149528B1.setVisibility(0);
                if (this.f149549G2) {
                    this.f149548G1.setVisibility(8);
                    SpringCallView springCallView2 = this.f149656j0;
                    if (springCallView2 != null) {
                        springCallView2.setVisibility(8);
                    }
                    VoIPButtonWithText voIPButtonWithText2 = this.f149701u1;
                    if (voIPButtonWithText2 != null) {
                        voIPButtonWithText2.setEnabled(false);
                    }
                }
                AbstractC3085d.m15443e(this.f149649h1, true, 0L);
                mo138364Sv(false);
                if (!this.f149565K2) {
                }
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Active call session is disconnected or null wait for quit...");
                this.f149691r3.mo138257Hl();
                if (this.f149686q2.f110960y != 0) {
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
        if (this.f149549G2 && this.f149686q2.m117090b0()) {
            if (!this.f149686q2.m117079Y()) {
                m157107Qh();
            }
            this.f149600V.setVisibility(0);
            if (this.f149686q2.m117079Y()) {
                mo138411q6(true);
            }
            TextureViewRenderer textureViewRenderer2 = this.f149664l0;
            if (textureViewRenderer2 != null) {
                textureViewRenderer2.setMirror(!this.f149686q2.m117110g0());
            }
        }
        if (this.f149613Y0 != null && this.f149686q2.m117090b0() && m156936fi()) {
            this.f149613Y0.setVisibility(0);
            this.f149613Y0.setEnabled(false);
        }
        if (i11 == 4) {
            m157132nw(4);
        } else if (i11 != 1 && (!mo138287c1 || i11 != 3)) {
            m157132nw(2);
        } else {
            m157132nw(1);
        }
        if (this.f149686q2.m117090b0()) {
            return;
        }
        this.f149588S.post(new Runnable() { // from class: vo0.g5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156755Gm();
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: W6 */
    public void mo138374W6(final String str, final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.p5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156840Rp(str, z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: W8 */
    public boolean mo138375W8() {
        if (AbstractC23034c6.m118167n(this, AbstractC23034c6.f112030g) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: We */
    void m157117We() {
        if (this.f149698t2 == null) {
            this.f149698t2 = new FrameLayout(getContext());
            this.f149698t2.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
            this.f149588S.addView(this.f149698t2);
        }
        if (this.f149570M0 == null) {
            RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
            this.f149570M0 = recyclingImageView;
            recyclingImageView.setId(AbstractC6918a0.call_fullScreenSnapShot);
            this.f149570M0.setLayoutParams(AbstractC3105q.m15700c(-1, -1));
            this.f149570M0.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f149570M0.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white_50));
            this.f149570M0.setVisibility(8);
            this.f149588S.addView(this.f149570M0);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Wp */
    public void mo138376Wp() {
        runOnUiThread(new Runnable() { // from class: vo0.j5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156719Co();
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Xb */
    public void mo138377Xb(boolean z11) {
        C1593q2 m7840U = AbstractC1579n0.m7840U(mo35585v());
        if (m7840U == null) {
            return;
        }
        if (z11) {
            m7840U.m8144a(C1580n1.m.m8118f());
            m7840U.m8145b(1);
        } else {
            m7840U.m8146c(C1580n1.m.m8118f());
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Xe */
    public void mo138378Xe(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.h3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156913cp(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Yw */
    public void mo138379Yw(ContactProfile contactProfile) {
        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
        m140776b.putString("uidNotif", contactProfile.f42434r);
        m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
        m140776b.putString("avtNotif", contactProfile.f42446v);
        AbstractC3096i0.m15574y().startActivity(AbstractC23152n3.m119004K(m140776b, true));
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Z2 */
    public void mo138380Z2() {
        runOnUiThread(new Runnable() { // from class: vo0.b4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156711Ao();
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Z7 */
    public void mo138381Z7() {
        setRequestedOrientation(14);
    }

    /* renamed from: Zd */
    void m157118Zd() {
        m157059xc();
        m156982mf();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Zh */
    public void mo138382Zh(boolean z11) {
        if (this.f149705v1 == null) {
            return;
        }
        C21709f c21709f = this.f149530B3;
        if (c21709f != null) {
            c21709f.m112046s(0.0d);
        }
        this.f149705v1.setEnabled(z11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Zj */
    public boolean mo138383Zj() {
        try {
            PowerManager powerManager = (PowerManager) getSystemService("power");
            if (powerManager != null) {
                return powerManager.isInteractive();
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: Zo */
    public void mo138384Zo(boolean z11) {
        AbstractC3085d.m15442d(this.f149527B0, z11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: a9 */
    public String mo138385a9(String str) {
        return String.format(getString(AbstractC8020f0.str_call_other_off_cam_mic_status), str);
    }

    /* renamed from: af */
    void m157119af() {
        int max;
        this.f149527B0 = (StickerPanelView) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(AbstractC7409c0.call_layout_sticker_panel, (ViewGroup) null, false);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -2);
        m15700c.gravity = 81;
        if (this.f149691r3.mo138268Po()) {
            max = AbstractC3104p.m15650a(20.0f);
        } else {
            max = Math.max(AbstractC3104p.m15624A(), AbstractC3104p.m15625B()) + AbstractC3104p.m15650a(80.0f);
        }
        m15700c.leftMargin = max;
        m15700c.rightMargin = max;
        m15700c.bottomMargin = AbstractC3104p.m15667i0();
        this.f149527B0.setLayoutParams(m15700c);
        this.f149527B0.setMinimumHeight(AbstractC3104p.m15650a(120.0f));
        this.f149527B0.setVisibility(8);
        this.f149527B0.setStickerPanelListener(new StickerPanelView.InterfaceC32379a() { // from class: vo0.o4
            @Override // zm.voip.p721ui.StickerPanelView.InterfaceC32379a
            /* renamed from: a */
            public final void mo142943a() {
                ZmInCallActivity.this.m156966jl();
            }
        });
        this.f149531C0 = (ProgressBar) this.f149527B0.findViewById(AbstractC6918a0.ic_loading);
        this.f149547G0 = (LinearLayout) this.f149527B0.findViewById(AbstractC6918a0.main_sticker_view);
        this.f149535D0 = (LinearLayout) this.f149527B0.findViewById(AbstractC6918a0.groupStickerError);
        this.f149539E0 = (RobotoTextView) this.f149527B0.findViewById(AbstractC6918a0.content);
        RobotoTextView robotoTextView = (RobotoTextView) this.f149527B0.findViewById(AbstractC6918a0.btn_refresh);
        this.f149543F0 = robotoTextView;
        robotoTextView.mo75850g(true);
        this.f149543F0.setOnClickListener(new View.OnClickListener() { // from class: vo0.q4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156989nl(view);
            }
        });
        this.f149523A0 = new LinearLayoutManager(this, 0, false);
        this.f149559J0 = new C21788c(new C21788c.a() { // from class: vo0.r4
            @Override // ko0.C21788c.a
            /* renamed from: a */
            public final void mo112450a(int i11) {
                ZmInCallActivity.this.m157031tl(i11);
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.f149527B0.findViewById(AbstractC6918a0.f37905rv);
        this.f149551H0 = recyclerView;
        recyclerView.setLayoutManager(this.f149523A0);
        this.f149551H0.setAdapter(this.f149559J0);
        ViewPager viewPager = (ViewPager) this.f149527B0.findViewById(AbstractC6918a0.view_pager);
        this.f149555I0 = viewPager;
        viewPager.m11198c(new C32408a());
        this.f149588S.addView(this.f149527B0);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        Context m120036c = C23269y3.m120036c(context, AbstractC18458a.f93019a);
        if (m120036c != null) {
            context = m120036c;
        }
        super.attachBaseContext(context);
    }

    /* renamed from: aw */
    void m157120aw(boolean z11) {
        int i11;
        int i12;
        this.f149697t1.setVisibility(0);
        this.f149697t1.post(new Runnable() { // from class: vo0.j2
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156744Fo();
            }
        });
        if (!z11) {
            this.f149691r3.mo138262L9(C29161o1.c.f135114p);
            this.f149596U.setVisibility(8);
            this.f149689r1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_answer_audio_selector));
            VoIPButtonWithText voIPButtonWithText = this.f149697t1;
            Context context = getContext();
            if (this.f149686q2.m117047N0()) {
                i12 = AbstractC16803z.ic_call_mic_selector;
            } else {
                i12 = AbstractC16803z.ic_audio_call_mic_selector;
            }
            voIPButtonWithText.m157419d(AbstractC23136l9.m118665N(context, i12));
            this.f149524A1.setVisibility(0);
            this.f149600V.setVisibility(8);
            return;
        }
        this.f149596U.setVisibility(0);
        this.f149689r1.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_answer_video_selector));
        VoIPButtonWithText voIPButtonWithText2 = this.f149697t1;
        Context context2 = getContext();
        if (this.f149686q2.m117047N0()) {
            i11 = AbstractC16803z.ic_call_mic_selector;
        } else {
            i11 = AbstractC16803z.ic_audio_call_mic_selector;
        }
        voIPButtonWithText2.m157419d(AbstractC23136l9.m118665N(context2, i11));
        m157114Uw(true);
        m156758Gw();
        if (this.f149686q2.m117090b0()) {
            this.f149524A1.setVisibility(8);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: ax */
    public String mo138386ax(String str) {
        return String.format(getString(AbstractC8020f0.str_call_other_pause_cam_status), str);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: be */
    public void mo138387be(EnumC23411b enumC23411b) {
        m157000ow();
        AbstractC3085d.m15443e(this.f149649h1, true, 0L);
        mo138356On();
        mo138414rx();
        mo138416s9(this.f149691r3.mo138306rp(), false);
        m156869Vw(this.f149691r3.mo138294ji());
        mo138339Hb(this.f149691r3.mo138250Dl());
        m156732Eh();
        ToastCountdownCustomView toastCountdownCustomView = this.f149661k1;
        if (toastCountdownCustomView != null) {
            toastCountdownCustomView.m157456b();
        }
        this.f149689r1.setVisibility(8);
        this.f149593T0.setVisibility(8);
        this.f149693s1.setVisibility(8);
        this.f149697t1.setVisibility(8);
        this.f149588S.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.call_drop_bg));
        if (this.f149691r3.mo138314xj()) {
            m156922dx(this.f149691r3.mo138315z7());
            mo138352Me(this.f149691r3.mo138265Pd(), true);
            mo138423vj(this.f149691r3.mo138260Kd(), false);
            m156914cx(this.f149691r3.mo138288c8());
            mo138398iE(this.f149691r3.mo138263Lh());
            mo138416s9(this.f149691r3.mo138306rp(), false);
            m157114Uw(this.f149691r3.mo138313xg());
            RelativeLayout relativeLayout = this.f149548G1;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            CircleBackgroundView circleBackgroundView = this.f149524A1;
            if (circleBackgroundView != null) {
                circleBackgroundView.m157300h();
                this.f149524A1.setVisibility(8);
            }
            CircleBackgroundView circleBackgroundView2 = this.f149544F1;
            if (circleBackgroundView2 != null) {
                circleBackgroundView2.m157300h();
                this.f149544F1.setVisibility(8);
            }
            FrameLayout frameLayout = this.f149596U;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            SpringCallView springCallView = this.f149656j0;
            if (springCallView != null) {
                springCallView.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.f149604W;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            this.f149528B1.setVisibility(0);
            LinearLayout linearLayout = this.f149633d1;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            this.f149633d1.setVisibility(8);
            AppCompatImageView appCompatImageView = this.f149585R0;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
        }
        LinearLayout linearLayout2 = this.f149616Z;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        this.f149583Q1.setVisibility(8);
        CircleBackgroundImageView circleBackgroundImageView = this.f149613Y0;
        if (circleBackgroundImageView != null) {
            circleBackgroundImageView.setVisibility(8);
        }
        if (this.f149643f3) {
            m157130lh();
        }
        int i11 = C32409a0.f149725a[enumC23411b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    String format = String.format(getString(AbstractC8020f0.hold_dialog_receive_message), this.f149691r3.mo138296ka(10));
                    C8009j.a aVar = new C8009j.a(getContext());
                    aVar.m43172u(getString(AbstractC8020f0.hold_dialog_receive_title)).m43155d(false).m43162k(format).m43170s(getString(AbstractC8020f0.hold_dialog_receive_confirm_btn), new InterfaceC17463d.d() { // from class: vo0.i3
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            ZmInCallActivity.this.m156951ho(interfaceC17463d, i12);
                        }
                    });
                    C8009j m43152a = aVar.m43152a();
                    m43152a.mo88280H(new InterfaceC17463d.g() { // from class: vo0.j3
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
                        /* renamed from: a */
                        public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                            ZmInCallActivity.m156967jo(interfaceC17463d);
                        }
                    });
                    m43152a.mo13822K();
                    return;
                }
                return;
            }
            m157131ne(String.format(getString(AbstractC8020f0.hold_dialog_title), this.f149691r3.mo138296ka(10)));
            return;
        }
        m157131ne(getString(AbstractC8020f0.str_call_incall_timeout_status));
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: bp */
    public void mo138388bp(String str) {
        try {
            if (this.f149612Y != null && !TextUtils.isEmpty(str)) {
                ((C23528a) this.f149662k2.m123612r(this.f149612Y)).m123577A(str, this.f149674n2, 1, new C32426j(str));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: bs */
    public void mo138389bs(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.e6
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156867Vp(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: c5 */
    public void mo138390c5() {
        RecyclingImageView recyclingImageView;
        ((C23528a) this.f149662k2.m123612r(this.f149532C1)).m123615u(this.f149694s2);
        if (this.f149549G2 && (recyclingImageView = this.f149552H1) != null) {
            ((C23528a) this.f149662k2.m123612r(recyclingImageView)).m123615u(this.f149694s2);
        }
    }

    /* renamed from: cg */
    public int[] m157121cg() {
        int[] iArr = new int[2];
        LiveEmojiButton liveEmojiButton = this.f149716y0;
        if (liveEmojiButton != null) {
            liveEmojiButton.getLocationOnScreen(r1);
            int[] iArr2 = {((iArr2[0] + this.f149716y0.getWidth()) - LiveEmojiButton.f70634f0) - (LiveEmojiButton.f70635g0 / 2), iArr2[1] + (this.f149716y0.getHeight() / 2)};
            return iArr2;
        }
        return iArr;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: cy */
    public void mo138391cy(String str, int i11) {
        RecyclingImageView recyclingImageView;
        C16640q2 mo88412f = C16640q2.m88404a().mo88412f(str, i11);
        this.f149532C1.setImageDrawable(mo88412f);
        if (this.f149691r3.mo138314xj() && (recyclingImageView = this.f149552H1) != null) {
            ((C23528a) this.f149662k2.m123612r(recyclingImageView)).m123615u(mo88412f);
        }
    }

    /* renamed from: ds */
    public void m157122ds(String str, C24277c c24277c, int i11, int i12) {
        AnimChat animChat;
        boolean z11;
        try {
            if (!TextUtils.isEmpty(str) && !mo138335F2() && (animChat = this.f149712x0) != null) {
                String str2 = c24277c.f117241b;
                float f11 = c24277c.f117243d;
                if (c24277c.f117240a == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                animChat.m76103L(str2, f11, null, z11, i11, i12, c24277c.f117245f, c24277c.f117247h);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "playLiveEmoji : " + e11.getMessage(), e11);
        }
    }

    /* renamed from: dv */
    void m157123dv(int i11) {
        CircularProgressIndicator circularProgressIndicator = this.f149560J1;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.m157327v();
            this.f149560J1.m157326q(0, i11);
        }
    }

    @Override // zm.voip.p721ui.incall.C32457b.a
    /* renamed from: e */
    public boolean mo157124e() {
        return this.f149691r3.mo138305r4();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: ep */
    public boolean mo138392ep() {
        KeyboardDTMFView keyboardDTMFView = this.f149602V1;
        if (keyboardDTMFView != null && keyboardDTMFView.getVisibility() == 0 && this.f149602V1.getAlpha() != 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: et */
    void m157125et(int i11) {
        if (this.f149549G2) {
            return;
        }
        this.f149693s1.setTag(Integer.valueOf(i11));
        this.f149693s1.setVisibility(i11);
    }

    /* renamed from: ew */
    void m157126ew() {
        try {
            C23744a.m124114c().m124117e(this, 1001);
            C23744a.m124114c().m124117e(this, ZAbstractBase.ZVU_BLEND_PERCENTAGE);
            C23744a.m124114c().m124117e(this, ZAbstractBase.ZVU_BLEND_GEN_THUMB);
            C23744a.m124114c().m124117e(this, 1004);
            C23744a.m124114c().m124117e(this, 64);
            C23744a.m124114c().m124117e(this, 1005);
            C23744a.m124114c().m124117e(this, 1006);
            C23744a.m124114c().m124117e(this, 1007);
            C23744a.m124114c().m124117e(this, 1000);
            C23744a.m124114c().m124117e(this, 10014);
            C23744a.m124114c().m124117e(this, 10015);
            C23744a.m124114c().m124117e(this, 40014);
            C23744a.m124114c().m124117e(this, IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM);
            C23744a.m124114c().m124117e(this, 10027);
            C23744a.m124114c().m124117e(this, 10028);
            C23744a.m124114c().m124117e(this, 10029);
            C23744a.m124114c().m124117e(this, 10030);
            C23744a.m124114c().m124117e(this, 10033);
            C23744a.m124114c().m124117e(this, 10035);
            C23744a.m124114c().m124117e(this, 10038);
            C23744a.m124114c().m124117e(this, 10039);
            C23744a.m124114c().m124117e(this, 40018);
            C23744a.m124114c().m124117e(this, 10040);
            C23744a.m124114c().m124117e(this, 40019);
            C23744a.m124114c().m124117e(this, 10041);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZmInCallActivity_Log", "unregisterBroadcast " + e11.getMessage(), e11);
        }
    }

    @Override // p588vw.C28644j.o
    /* renamed from: f1 */
    public void mo16628f1(List list, List list2) {
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: fn */
    public void mo138393fn(boolean z11) {
        CircleBackgroundImageView circleBackgroundImageView = this.f149720z0;
        if (circleBackgroundImageView == null) {
            return;
        }
        circleBackgroundImageView.setEnabled(z11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: fs */
    public void mo138394fs(boolean z11, boolean z12) {
        C22626t c22626t;
        int m15683q0;
        if (this.f149656j0 != null && this.f149604W != null && (c22626t = this.f149686q2) != null && c22626t.m117126k0()) {
            this.f149656j0.f150120x = m157048wb();
            float f11 = 0.0f;
            int i11 = 0;
            if (z11) {
                SpringCallView springCallView = this.f149656j0;
                if (springCallView != null) {
                    springCallView.m157413j(0, 0, 0, 0);
                    this.f149656j0.m157411h(0.0f, 0.0f, true, false);
                    SpringCallView springCallView2 = this.f149656j0;
                    springCallView2.f150109C = true;
                    springCallView2.m157410g(SpringCallView.EnumC32504b.SCALE_TO_NORMAL, false);
                }
            } else {
                if (!this.f149691r3.mo138268Po() && !z12) {
                    if ((((FrameLayout.LayoutParams) this.f149656j0.getLayoutParams()).gravity & 3) == 3) {
                        SpringCallView springCallView3 = this.f149656j0;
                        int i12 = springCallView3.f150118v;
                        if (i12 == 3) {
                            springCallView3.f150118v = 2;
                        } else if (i12 == 1) {
                            springCallView3.f150118v = 0;
                        }
                    } else {
                        SpringCallView springCallView4 = this.f149656j0;
                        int i13 = springCallView4.f150118v;
                        if (i13 == 2) {
                            springCallView4.f150118v = 3;
                        } else if (i13 == 0) {
                            springCallView4.f150118v = 1;
                        }
                    }
                }
                mo138327CH(false);
            }
            if (this.f149693s1.isShown()) {
                AbstractC3085d.m15442d(this.f149693s1, true);
            }
            if (z11) {
                this.f149672n0.setBackgroundResource(AbstractC16803z.bg_render_state_container_call);
                m156987nb(this.f149656j0);
                this.f149684q0.setVisibility(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149616Z.getLayoutParams();
                if (this.f149691r3.mo138268Po()) {
                    layoutParams.gravity = 49;
                    layoutParams.topMargin = (AbstractC3104p.f13186c / 2) + AbstractC3104p.m15650a(35.0f);
                } else {
                    layoutParams.gravity = 17;
                    layoutParams.topMargin = 0;
                }
                this.f149616Z.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f149672n0.getLayoutParams();
                layoutParams2.setMargins(AbstractC3104p.m15650a(10.0f), 0, AbstractC3104p.m15650a(10.0f), AbstractC3104p.m15627D());
                this.f149672n0.setLayoutParams(layoutParams2);
            } else {
                this.f149672n0.setBackgroundResource(0);
                m156987nb(this.f149604W);
                this.f149684q0.setVisibility(8);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f149616Z.getLayoutParams();
                layoutParams3.gravity = 17;
                layoutParams3.topMargin = 0;
                this.f149616Z.setLayoutParams(layoutParams3);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f149672n0.getLayoutParams();
                layoutParams4.setMargins(0, 0, 0, AbstractC3104p.m15650a(10.0f));
                this.f149672n0.setLayoutParams(layoutParams4);
            }
            if (z11) {
                m15683q0 = 0;
            } else {
                m15683q0 = AbstractC3104p.m15683q0();
            }
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f149668m0.getLayoutParams();
            layoutParams5.setMargins(m15683q0, m15683q0, m15683q0, m15683q0);
            this.f149668m0.setLayoutParams(layoutParams5);
            TextureViewRenderer textureViewRenderer = this.f149664l0;
            if (!z11) {
                f11 = AbstractC3104p.m15688t();
            }
            textureViewRenderer.setCorner(f11);
            if (this.f149686q2.m117126k0() && !this.f149691r3.mo138256He()) {
                i11 = 8;
            }
            float f12 = i11;
            this.f149668m0.m76289j(f12, f12, f12, f12);
            m157127fv(z11, z12);
            if (this.f149686q2.m117114h0()) {
                this.f149664l0.renderBlackFrame();
            }
            m156960ir();
            this.f149656j0.post(new Runnable() { // from class: vo0.t5
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.this.m156762Ho();
                }
            });
        }
    }

    /* renamed from: fv */
    void m157127fv(final boolean z11, final boolean z12) {
        this.f149562J3.cancel();
        AnimatorSet animatorSet = this.f149537D2;
        if (animatorSet != null) {
            animatorSet.end();
        }
        int[] m15680p = AbstractC3104p.m15680p(this.f149691r3.mo138268Po());
        final int i11 = m15680p[0];
        final int i12 = m15680p[1];
        final float f11 = i11 / i12;
        final int m15632I = AbstractC3104p.m15632I();
        this.f149562J3.removeAllUpdateListeners();
        this.f149562J3.removeAllListeners();
        this.f149562J3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vo0.k2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZmInCallActivity.this.m157082zo(z11, m15632I, f11, z12, i11, i12, valueAnimator);
            }
        });
        this.f149562J3.addListener(new C32438s(z11));
        this.f149562J3.start();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: g3 */
    public void mo138395g3() {
        runOnUiThread(new Runnable() { // from class: vo0.y4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.finish();
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: gu */
    public void mo138396gu(boolean z11, boolean z12) {
        long j11;
        long j12;
        CircleBackgroundImageView circleBackgroundImageView = this.f149583Q1;
        if (circleBackgroundImageView == null) {
            return;
        }
        if (z11) {
            if (z12) {
                j12 = 300;
            } else {
                j12 = 0;
            }
            AbstractC3085d.m15448j(circleBackgroundImageView, true, 0.0f, 0.0f, j12, new C32445z());
            return;
        }
        if (z12) {
            j11 = 300;
        } else {
            j11 = 0;
        }
        AbstractC3085d.m15447i(circleBackgroundImageView, false, 0.0f, -200.0f, j11);
    }

    /* renamed from: gv */
    void m157128gv() {
        if (this.f149715x3) {
            this.f149713x1.clearAnimation();
        }
        this.f149715x3 = false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: hC */
    public String mo138397hC() {
        return getString(AbstractC8020f0.str_you);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: iE */
    public void mo138398iE(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.e4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156745Fq(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: ib */
    public boolean mo138399ib(int i11) {
        if (AbstractC3104p.m15657d0() > i11) {
            return true;
        }
        return false;
    }

    /* renamed from: ic */
    void m157129ic() {
        int i11;
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(-1, -2);
        m15705h.addRule(3, AbstractC6918a0.call_avatarContainer);
        m15705h.addRule(14);
        m15705h.setMargins(AbstractC3104p.m15650a(30.0f), AbstractC3104p.m15650a(12.0f), AbstractC3104p.m15650a(30.0f), 0);
        linearLayout2.setGravity(17);
        linearLayout2.setId(AbstractC6918a0.call_groupRemoteName);
        linearLayout2.setLayoutParams(m15705h);
        linearLayout2.setOrientation(0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f149576O0 = appCompatImageView;
        appCompatImageView.setId(AbstractC6918a0.call_audBadgeStranger);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
        m15701d.rightMargin = AbstractC3104p.m15650a(6.0f);
        m15701d.gravity = 17;
        this.f149576O0.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.badge_nguoila));
        this.f149576O0.setLayoutParams(m15701d);
        this.f149576O0.setVisibility(8);
        MarqueeTextView marqueeTextView = new MarqueeTextView(getContext());
        this.f149582Q0 = marqueeTextView;
        marqueeTextView.setId(AbstractC6918a0.call_remoteName);
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
        m15701d2.gravity = 17;
        this.f149582Q0.setLayoutParams(m15701d2);
        this.f149582Q0.setSingleLine();
        this.f149582Q0.setTextColor(-1);
        this.f149582Q0.setGravity(17);
        this.f149582Q0.setTextStyleBold(true);
        this.f149582Q0.setTextSize(1, 24.0f);
        this.f149582Q0.setOnClickListener(new View.OnClickListener() { // from class: vo0.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallActivity.this.m156761Hi(view);
            }
        });
        if (!this.f149686q2.m117086a0()) {
            this.f149582Q0.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (this.f149686q2.m117086a0()) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f149597U0 = linearLayout3;
            linearLayout3.setId(AbstractC6918a0.call_oa_reason_container);
            RelativeLayout.LayoutParams m15705h2 = AbstractC3105q.m15705h(-2, -2);
            m15705h2.addRule(3, AbstractC6918a0.call_groupRemoteName);
            m15705h2.addRule(14);
            m15705h2.setMargins(AbstractC3104p.m15650a(30.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(30.0f), 0);
            this.f149597U0.setLayoutParams(m15705h2);
            this.f149597U0.setVisibility(8);
            this.f149601V0 = new MarqueeTextView(getContext());
            this.f149601V0.setLayoutParams(AbstractC3105q.m15701d(-2, -2));
            this.f149601V0.setTextSize(1, 16.0f);
            this.f149601V0.setTextColor(-1);
            this.f149601V0.setSingleLine();
            this.f149597U0.addView(this.f149601V0);
        }
        ViewSwitcher viewSwitcher = new ViewSwitcher(getContext());
        this.f149593T0 = viewSwitcher;
        viewSwitcher.setId(AbstractC6918a0.call_switcherInCallStatus);
        RelativeLayout.LayoutParams m15705h3 = AbstractC3105q.m15705h(-1, -2);
        m15705h3.addRule(14);
        if (this.f149686q2.m117086a0()) {
            i11 = AbstractC6918a0.call_oa_reason_container;
        } else {
            i11 = AbstractC6918a0.call_groupRemoteName;
        }
        m15705h3.addRule(3, i11);
        m15705h3.topMargin = AbstractC3104p.m15650a(6.0f);
        this.f149593T0.setLayoutParams(m15705h3);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f149605W0 = robotoTextView;
        robotoTextView.setId(AbstractC6918a0.call_statusText);
        this.f149605W0.setLayoutParams(AbstractC3105q.m15699b(-1, -2, 17));
        this.f149605W0.setGravity(17);
        m157136pt(this.f149605W0);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.gravity = 1;
        RobotoChronometer robotoChronometer = new RobotoChronometer(getContext());
        this.f149609X0 = robotoChronometer;
        robotoChronometer.setId(AbstractC6918a0.call_audio_elapsed_time);
        this.f149609X0.setLayoutParams(m15698a);
        this.f149609X0.setGravity(17);
        this.f149609X0.setTextSize(1, 16.0f);
        this.f149609X0.setTextColor(-12397172);
        this.f149593T0.addView(this.f149605W0);
        this.f149593T0.addView(this.f149609X0);
        m156866Ve(false);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        this.f149633d1 = linearLayout4;
        linearLayout4.setId(AbstractC6918a0.call_audioGroupStateLayout);
        this.f149633d1.setBackgroundResource(AbstractC16803z.call_status_border_circle_bg);
        RelativeLayout.LayoutParams m15705h4 = AbstractC3105q.m15705h(-2, -2);
        m15705h4.topMargin = AbstractC3104p.m15650a(6.0f);
        int i12 = this.f149569L2;
        if (i12 == 0) {
            if (this.f149549G2) {
                m15705h4.addRule(3, AbstractC6918a0.call_vidCallStatus);
            } else {
                m15705h4.addRule(3, AbstractC6918a0.call_switcherInCallStatus);
            }
        } else if (i12 == 1) {
            m15705h4.addRule(3, AbstractC6918a0.call_ring_back_tone_container);
        } else if (i12 == 2) {
            m15705h4.addRule(3, AbstractC6918a0.call_ring_back_tone_quick_set_container);
        }
        m15705h4.addRule(14);
        this.f149633d1.setLayoutParams(m15705h4);
        this.f149633d1.setGravity(17);
        this.f149633d1.setOrientation(1);
        this.f149633d1.setVisibility(8);
        this.f149633d1.setAlpha(0.0f);
        RobotoTextView robotoTextView2 = new RobotoTextView(getContext());
        this.f149637e1 = robotoTextView2;
        robotoTextView2.setId(AbstractC6918a0.call_textAudioMicState);
        LinearLayout.LayoutParams m15701d3 = AbstractC3105q.m15701d(-2, -2);
        m15701d3.gravity = 17;
        m15701d3.setMargins(AbstractC3104p.m15650a(14.0f), AbstractC3104p.m15650a(7.0f), AbstractC3104p.m15650a(14.0f), AbstractC3104p.m15650a(7.0f));
        this.f149637e1.setLayoutParams(m15701d3);
        this.f149637e1.setGravity(17);
        this.f149637e1.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_mini_off_mic), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f149637e1.setCompoundDrawablePadding(AbstractC3104p.m15650a(5.0f));
        this.f149637e1.setText(String.format(getString(AbstractC8020f0.str_call_other_off_mic_status), this.f149686q2.m117049O(getContext(), 10)));
        this.f149637e1.mo75850g(true);
        this.f149637e1.setTextSize(1, 13.0f);
        this.f149637e1.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.call_text_partner_off_mic));
        this.f149637e1.setVisibility(8);
        RobotoTextView robotoTextView3 = new RobotoTextView(getContext());
        this.f149645g1 = robotoTextView3;
        robotoTextView3.setId(AbstractC6918a0.call_textAudioSpeakerState);
        LinearLayout.LayoutParams m15701d4 = AbstractC3105q.m15701d(-2, -2);
        m15701d4.gravity = 17;
        m15701d4.setMargins(AbstractC3104p.m15650a(14.0f), AbstractC3104p.m15650a(7.0f), AbstractC3104p.m15650a(14.0f), AbstractC3104p.m15650a(7.0f));
        this.f149645g1.setLayoutParams(m15701d4);
        this.f149645g1.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_white_speaker_button), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f149645g1.setCompoundDrawablePadding(AbstractC3104p.m15650a(5.0f));
        this.f149645g1.setGravity(17);
        this.f149645g1.mo75850g(true);
        this.f149645g1.setTextSize(1, 13.0f);
        this.f149645g1.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.call_text_partner_off_mic));
        this.f149645g1.setVisibility(8);
        View view = new View(getContext());
        this.f149641f1 = view;
        view.setId(AbstractC6918a0.call_audioDivideGroupStateLayout);
        this.f149641f1.setLayoutParams(AbstractC3105q.m15703f(-1, AbstractC3104p.m15650a(1.0f)));
        this.f149641f1.setBackgroundColor(Color.parseColor("#19FFFFFF"));
        this.f149641f1.setVisibility(8);
        this.f149633d1.addView(this.f149637e1);
        this.f149633d1.addView(this.f149641f1);
        this.f149633d1.addView(this.f149645g1);
        if (!this.f149549G2) {
            m157061xf();
        }
        linearLayout2.addView(this.f149576O0);
        linearLayout2.addView(this.f149582Q0);
        this.f149528B1.addView(linearLayout2);
        if (this.f149686q2.m117086a0() && (linearLayout = this.f149597U0) != null) {
            this.f149528B1.addView(linearLayout);
        }
        this.f149528B1.addView(this.f149593T0);
        int i13 = this.f149569L2;
        if (i13 == 1) {
            this.f149528B1.addView(this.f149617Z0);
        } else if (i13 == 2) {
            this.f149528B1.addView(this.f149629c1);
        }
        this.f149528B1.addView(this.f149633d1);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: j7 */
    public String mo138400j7(String str) {
        return String.format(getString(AbstractC8020f0.str_call_other_off_cam_status), str);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: jn */
    public void mo138401jn(String str, boolean z11) {
        CircleBackgroundImageView circleBackgroundImageView;
        str.hashCode();
        if (str.equals("tip.videocall.sticker") && (circleBackgroundImageView = this.f149720z0) != null) {
            circleBackgroundImageView.setEnableNoti(z11);
        }
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: jx */
    public void mo59032jx(int i11) {
        AbstractC3096i0.m15518U0(getString(i11));
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: kB */
    public void mo138402kB() {
        ToastUtils.m89266n(AbstractC8020f0.str_call_sensitive_camera_blocked_warning, new Object[0]);
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: kl */
    public void mo78955kl(Runnable runnable, long j11) {
        this.f149642f2.postDelayed(runnable, j11);
    }

    @Override // ac.InterfaceC0724q
    /* renamed from: l0 */
    public C0722p.b mo1166l0() {
        return C0722p.b.CALL;
    }

    /* renamed from: lh */
    public void m157130lh() {
        m157134oh(false);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: lm */
    public void mo138403lm(int i11) {
        AbstractC23034c6.m118186w0(this, AbstractC23034c6.f112030g, i11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: lt */
    public void mo138404lt(final AbstractC27351a abstractC27351a) {
        mo70710wy(new Runnable() { // from class: vo0.q5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157016rq(abstractC27351a);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: lx */
    public void mo138405lx(boolean z11) {
        AbstractC3085d.m15442d(this.f149600V, z11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: m1 */
    public boolean mo138406m1() {
        return this.f149603V2;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: mG */
    public void mo138407mG(boolean z11, String str, boolean z12) {
        RobotoTextView robotoTextView;
        if (z11) {
            if (this.f149593T0.getCurrentView() != this.f149609X0) {
                this.f149593T0.setDisplayedChild(1);
                return;
            }
            return;
        }
        if (this.f149593T0.getCurrentView() != this.f149605W0) {
            this.f149593T0.setDisplayedChild(0);
        }
        TextView textView = this.f149605W0;
        if (textView != null) {
            textView.setText(str);
        }
        if (z12 && (robotoTextView = this.f149577O1) != null) {
            robotoTextView.setText(str);
        }
    }

    @Override // p588vw.C28644j.p
    /* renamed from: n0 */
    public void mo36242n0(List list) {
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: nF */
    public void mo138408nF(String str) {
        if (this.f149582Q0.getText() == null || this.f149582Q0.getText() != str) {
            this.f149582Q0.setText(str);
            MarqueeTextView marqueeTextView = this.f149571M1;
            if (marqueeTextView != null) {
                marqueeTextView.setText(str);
            }
            MarqueeTextView marqueeTextView2 = this.f149704v0;
            if (marqueeTextView2 != null) {
                marqueeTextView2.setText(str);
            }
        }
    }

    /* renamed from: ne */
    void m157131ne(String str) {
        try {
            int m15668j = AbstractC3104p.m15668j();
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(-2, -2);
            m15705h.setMargins(AbstractC3104p.m15650a(10.0f), AbstractC3104p.m15650a(5.0f), AbstractC3104p.m15650a(10.0f), AbstractC3104p.m15650a(10.0f));
            m15705h.addRule(3, AbstractC6918a0.call_audioGroupStateLayout);
            m15705h.addRule(14);
            robotoTextView.setLayoutParams(m15705h);
            robotoTextView.setId(AbstractC6918a0.call_txtHoldCall);
            robotoTextView.setGravity(17);
            robotoTextView.setText(str);
            robotoTextView.setTextColor(Color.parseColor("#FFFFFF"));
            robotoTextView.setTextSize(1, 14.0f);
            LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
            m15702e.topMargin = AbstractC3104p.m15675m0();
            LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
            m15701d.weight = 1.0f;
            VoIPButtonWithText m157419d = new VoIPButtonWithText(getContext(), 3).m157424i(m15702e).m157425j(this.f149557I2).m157421f(getString(AbstractC8020f0.str_call_dropcall_button_left)).m157418c(AbstractC3105q.m15703f(m15668j, m15668j)).m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_cancel_selector));
            m157419d.setId(AbstractC6918a0.call_cancelHoldCallBtn);
            m157419d.setPaddingBackgroundButton(AbstractC3104p.m15662g());
            m157419d.getButton().setContentDescription("Left button");
            m157419d.setLayoutParams(m15701d);
            m157419d.setAlignmentTextView(4);
            LinearLayout.LayoutParams m15702e2 = AbstractC3105q.m15702e(-2, -2, 1.0f);
            m15702e2.topMargin = AbstractC3104p.m15675m0();
            LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(0, -2);
            m15701d2.weight = 1.0f;
            VoIPButtonWithText m157419d2 = new VoIPButtonWithText(getContext(), 3).m157424i(m15702e2).m157425j(this.f149557I2).m157421f(getString(AbstractC8020f0.str_call_dropcall_button_right)).m157418c(AbstractC3105q.m15703f(m15668j, m15668j)).m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_answer_audio_selector));
            m157419d2.setId(AbstractC6918a0.call_callbackHoldCallBtn);
            m157419d2.setPaddingBackgroundButton(AbstractC3104p.m15662g());
            m157419d2.getButton().setContentDescription("Callback button");
            m157419d2.setLayoutParams(m15701d2);
            m157419d2.setAlignmentTextView(4);
            if (this.f149549G2) {
                m157419d2.m157419d(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_call_answer_video_selector));
            }
            m157419d.setOnClickListener(new View.OnClickListener() { // from class: vo0.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156816Ok(view);
                }
            });
            m157419d2.setOnClickListener(new View.OnClickListener() { // from class: vo0.f2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156822Pk(view);
                }
            });
            this.f149605W0.setVisibility(8);
            this.f149677o1.removeAllViews();
            this.f149677o1.addView(m157419d);
            this.f149677o1.addView(m157419d2);
            this.f149528B1.addView(robotoTextView);
            AbstractC3096i0.f13168l = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nw */
    void m157132nw(int i11) {
        VoIPButtonWithText voIPButtonWithText;
        C22626t c22626t = this.f149686q2;
        c22626t.f110925g0 = true;
        boolean m117047N0 = c22626t.m117047N0();
        if (i11 != 6) {
            VoIPButtonWithText voIPButtonWithText2 = this.f149713x1;
            if (voIPButtonWithText2 != null) {
                voIPButtonWithText2.setVisibility(8);
            }
            VoIPButtonWithText voIPButtonWithText3 = this.f149717y1;
            if (voIPButtonWithText3 != null) {
                voIPButtonWithText3.setVisibility(8);
            }
            CircleBackgroundAnswer circleBackgroundAnswer = this.f149657j1;
            if (circleBackgroundAnswer != null) {
                circleBackgroundAnswer.m157289i();
                this.f149657j1.setVisibility(8);
            }
            m157128gv();
        }
        m156914cx(this.f149691r3.mo138288c8());
        switch (i11) {
            case 1:
                m156826Pw(this.f149697t1, true, false);
                m156826Pw(this.f149705v1, m117047N0, false);
                m156826Pw(this.f149693s1, true, true);
                m156826Pw(this.f149685q1, true, true);
                m156826Pw(this.f149689r1, false, false);
                m156826Pw(this.f149701u1, m117047N0, true);
                m156826Pw(this.f149580P1, true, true);
                m157000ow();
                m156903ar();
                m156999or();
                this.f149600V.setVisibility(0);
                if (this.f149686q2.m117026G0()) {
                    this.f149709w1.setEnabled(false);
                    mo138427wA(this.f149691r3.mo138301mn(), false);
                    break;
                }
                break;
            case 2:
                mo138427wA(this.f149691r3.mo138301mn(), false);
                m156826Pw(this.f149697t1, false, false);
                m156826Pw(this.f149705v1, false, false);
                m156826Pw(this.f149693s1, false, false);
                m156826Pw(this.f149685q1, true, true);
                m156922dx(this.f149691r3.mo138315z7());
                if (this.f149686q2.m117026G0()) {
                    this.f149709w1.setEnabled(false);
                    break;
                }
                break;
            case 3:
                m156826Pw(this.f149697t1, true, true);
                m156826Pw(this.f149705v1, m117047N0, true);
                m156826Pw(this.f149693s1, true, true);
                m156826Pw(this.f149685q1, true, true);
                m156826Pw(this.f149689r1, false, false);
                m156826Pw(this.f149701u1, m117047N0, true);
                m156826Pw(this.f149580P1, true, true);
                m157000ow();
                m156903ar();
                m156999or();
                m156922dx(this.f149691r3.mo138315z7());
                this.f149600V.setVisibility(0);
                if (this.f149709w1 != null && this.f149686q2.m117026G0()) {
                    this.f149709w1.setEnabled(true);
                }
                mo138427wA(this.f149691r3.mo138301mn(), false);
                break;
            case 4:
                if (!this.f149686q2.m117090b0()) {
                    if (this.f149549G2) {
                        m156922dx(this.f149691r3.mo138315z7());
                        mo138352Me(this.f149691r3.mo138265Pd(), true);
                        break;
                    } else {
                        this.f149697t1.setVisibility(8);
                        this.f149693s1.setVisibility(8);
                        break;
                    }
                } else if (this.f149686q2.m117026G0()) {
                    this.f149709w1.setEnabled(false);
                    mo138427wA(this.f149691r3.mo138301mn(), false);
                    break;
                }
                break;
            case 5:
                this.f149705v1.setEnabled(false);
                this.f149586R1.setEnabled(false);
                VoIPButtonWithText voIPButtonWithText4 = this.f149701u1;
                if (voIPButtonWithText4 != null) {
                    voIPButtonWithText4.setEnabled(false);
                }
                mo138429wr();
                if (this.f149686q2.m117026G0() && (voIPButtonWithText = this.f149709w1) != null) {
                    voIPButtonWithText.setEnabled(false);
                }
                this.f149580P1.setEnabled(false);
                break;
            case 6:
                if (m117047N0) {
                    m156922dx(this.f149691r3.mo138315z7());
                    mo138352Me(this.f149691r3.mo138265Pd(), true);
                    m156914cx(this.f149691r3.mo138288c8());
                    m156869Vw(this.f149691r3.mo138294ji());
                    this.f149600V.setVisibility(0);
                    this.f149697t1.setVisibility(8);
                    m157114Uw(false);
                    this.f149713x1.setVisibility(0);
                    this.f149717y1.setVisibility(0);
                    this.f149657j1.setVisibility(0);
                    this.f149657j1.m157288h();
                    m157093Ku();
                    break;
                }
                break;
        }
        m156978lw(i11);
    }

    /* renamed from: of */
    void m157133of() {
        int m15626C = AbstractC3104p.m15626C();
        int m15678o = AbstractC3104p.m15678o() + AbstractC3104p.m15674m() + AbstractC3104p.m15650a(16.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149688r0 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_vidInfoLayout);
        this.f149688r0.setOrientation(1);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        m15698a.gravity = 49;
        m15698a.setMargins(m15678o, m15626C, m15678o, 0);
        this.f149688r0.setMinimumHeight(AbstractC3104p.m15650a(32.0f));
        this.f149688r0.setLayoutParams(m15698a);
        this.f149688r0.setVisibility(8);
        if (!this.f149686q2.m117086a0()) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f149692s0 = appCompatImageView;
            appCompatImageView.setId(AbstractC6918a0.call_waterMaskZalo);
            LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
            m15701d.gravity = 17;
            this.f149692s0.setLayoutParams(m15701d);
            this.f149692s0.setImageResource(AbstractC16803z.watermark_zalo);
            this.f149692s0.setOnClickListener(new View.OnClickListener() { // from class: vo0.c2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m157081zl(view);
                }
            });
            this.f149688r0.addView(this.f149692s0);
        }
        if (this.f149686q2.m117086a0()) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f149700u0 = linearLayout2;
            linearLayout2.setOrientation(0);
            LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-1, -2);
            m15701d2.gravity = 17;
            m15701d2.topMargin = AbstractC3104p.m15650a(2.0f);
            this.f149700u0.setGravity(17);
            this.f149700u0.setLayoutParams(m15701d2);
            this.f149704v0 = new MarqueeTextView(getContext());
            LinearLayout.LayoutParams m15701d3 = AbstractC3105q.m15701d(-2, -2);
            m15701d3.gravity = 17;
            this.f149704v0.setLayoutParams(m15701d3);
            this.f149704v0.setSingleLine();
            this.f149704v0.setTextColor(-1);
            this.f149704v0.setTextStyleBold(true);
            this.f149704v0.setTextSize(1, 18.0f);
            this.f149704v0.setSingleLine();
            this.f149704v0.setOnClickListener(new View.OnClickListener() { // from class: vo0.d2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZmInCallActivity.this.m156710Al(view);
                }
            });
            this.f149700u0.addView(this.f149704v0);
            this.f149688r0.addView(this.f149700u0);
            this.f149708w0 = new MarqueeTextView(getContext());
            LinearLayout.LayoutParams m15701d4 = AbstractC3105q.m15701d(-2, -2);
            m15701d4.gravity = 17;
            m15701d4.topMargin = AbstractC3104p.m15650a(2.0f);
            m15701d4.bottomMargin = AbstractC3104p.m15650a(2.0f);
            this.f149708w0.setLayoutParams(m15701d4);
            this.f149708w0.setTextSize(1, 16.0f);
            this.f149708w0.setTextColor(-1);
            this.f149708w0.setSingleLine();
            this.f149708w0.setVisibility(8);
            this.f149688r0.addView(this.f149708w0);
        }
        RobotoChronometer robotoChronometer = new RobotoChronometer(this);
        this.f149696t0 = robotoChronometer;
        robotoChronometer.setId(AbstractC6918a0.call_vidElapsedTime);
        LinearLayout.LayoutParams m15701d5 = AbstractC3105q.m15701d(-2, -2);
        m15701d5.gravity = 17;
        m15701d5.topMargin = AbstractC3104p.m15650a(2.0f);
        m15701d5.bottomMargin = AbstractC3104p.m15650a(2.0f);
        this.f149696t0.setLayoutParams(m15701d5);
        this.f149696t0.setGravity(17);
        this.f149696t0.setTextSize(1, 16.0f);
        this.f149696t0.setTextColor(-12397172);
        this.f149688r0.addView(this.f149696t0);
    }

    /* renamed from: oh */
    public void m157134oh(boolean z11) {
        try {
            if (!this.f149651h3 && this.f149647g3) {
                this.f149651h3 = true;
                AbstractC3085d.m15454p(this.f149610X1, m156851Tf(), 250L);
                AbstractC3085d.m15444f(this.f149606W1, false, 250L, new C32433n(z11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C17487o0 c17487o0 = this.f149666l2;
        if (c17487o0 != null) {
            ZaloView m92996E0 = c17487o0.m92996E0("SHOW_SETTING_PERMISSION_TAG");
            if (m92996E0 != null) {
                this.f149666l2.mo92702G1(m92996E0, 0);
                m157112Ug();
            }
            ZaloView m92996E02 = this.f149666l2.m92996E0("SHOW_ALERT_TAG");
            if (m92996E02 != null) {
                this.f149666l2.mo92702G1(m92996E02, 0);
            }
        }
        this.f149691r3.mo138293jf();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "Configuration changed");
        Configuration configuration2 = this.f149695s3;
        boolean z11 = false;
        if (configuration2 != null) {
            int diff = configuration.diff(configuration2);
            if ((diff & 1024) != 0 || (diff & 128) != 0) {
                InterfaceC26862g interfaceC26862g = this.f149691r3;
                if (configuration.orientation == 1) {
                    z11 = true;
                }
                interfaceC26862g.mo138270Q6(z11);
                m156770Ir();
            }
        } else {
            InterfaceC26862g interfaceC26862g2 = this.f149691r3;
            if (configuration.orientation == 1) {
                z11 = true;
            }
            interfaceC26862g2.mo138270Q6(z11);
            m156770Ir();
        }
        this.f149695s3 = new Configuration(configuration);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z11;
        boolean z12;
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "onCreate");
        if (C32150v9.f148254a.m155132g()) {
            super.onCreate(bundle);
            startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
            finish();
            return;
        }
        AbstractC3096i0.f13166j = true;
        AbstractC3096i0.f13173q = false;
        this.f149678o2 = new C32457b(this, this);
        C21965i c21965i = new C21965i(805306378, "zalo:zm.voip.onIncomingCall");
        c21965i.m114699Q(false);
        C29161o1 c29161o1 = new C29161o1(this, AbstractC32273e3.m155748Q(), C32257b4.m155726m(), C32318n3.m156214E(), VoipAudioHelper.f148751a, C32252b.m155705e(), this.f149678o2, c21965i);
        this.f149691r3 = c29161o1;
        c29161o1.mo995Nd(C26350a.m135670a(getIntent().getExtras()), null);
        AbstractC32273e3.m155748Q().mo155932w1();
        C23212s8.m119595b(this);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            this.f149655i3 = intent.getExtras().getBoolean("EXTRA_DATA_IS_SHOW_FROM_NOTI", false);
        }
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "onCreate " + System.identityHashCode(this));
        AbstractC3096i0.f13159c = true;
        AbstractC3096i0.f13168l = false;
        AbstractC3096i0.f13167k = 1;
        requestWindowFeature(1);
        m157097Lh();
        this.f149682p2 = AbstractC18044d.m95912a(this);
        this.f149686q2 = C32257b4.m155726m().m155737l();
        this.f149706v2 = new C13306b(this);
        m156809Ng(getIntent());
        m157137qs();
        this.f149578O2 = this.f149686q2.m117055Q();
        this.f149549G2 = this.f149686q2.m117047N0();
        this.f149659j3 = AbstractC23309i.m121941ge();
        if (AbstractC23309i.m121814d2() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f149557I2 = z11;
        this.f149671m3 = AbstractC23309i.m121967h3();
        this.f149663k3 = AbstractC23309i.m121073J3();
        this.f149667l3 = AbstractC23309i.m121109K2();
        this.f149675n3 = AbstractC23309i.m121663Z1();
        this.f149565K2 = this.f149686q2.m117035J0();
        this.f149569L2 = AbstractC32273e3.m155748Q().mo155819K1();
        m157143xt();
        FrameLayout frameLayout = new FrameLayout(this);
        this.f149588S = frameLayout;
        frameLayout.setId(AbstractC6918a0.call_main_frame);
        this.f149588S.setBackgroundResource(AbstractC16803z.incall_actvitiy_background);
        AbstractC1579n0.m7833Q0(this.f149588S, new InterfaceC1551g0() { // from class: vo0.p4
            @Override // androidx.core.view.InterfaceC1551g0
            /* renamed from: c */
            public final C1580n1 mo4846c(View view, C1580n1 c1580n1) {
                C1580n1 m156824Pm;
                m156824Pm = ZmInCallActivity.this.m156824Pm(view, c1580n1);
                return m156824Pm;
            }
        });
        AbstractC1623z0.m8281b(getWindow(), false);
        super.onCreate(bundle);
        InterfaceC26862g interfaceC26862g = this.f149691r3;
        if (getResources().getConfiguration().orientation == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        interfaceC26862g.mo138270Q6(z12);
        this.f149686q2.m117124j2(System.currentTimeMillis());
        m157099Mc();
        setContentView(this.f149588S);
        m35584t2(true);
        this.f149666l2 = mo35579p();
        takeKeyEvents(true);
        this.f149690r2 = C32319o.m156293t().m156334u();
        this.f149691r3.mo138297l5(new Object[0]);
        sendBroadcast(new Intent("zm.voip.api.action.IN_CALL_START"));
        AbstractC3096i0.f13165i = true;
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(AbstractC23136l9.m118641B(this, AbstractC16801x.call_bg_navigation_color));
        getWindow().getDecorView().setKeepScreenOn(true);
        m157115Vh();
        this.f149642f2.sendEmptyMessageDelayed(2, 1000L);
        this.f149722z2 = new C1598s(this, new C32427j0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        C22626t c22626t;
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "onDestroy " + System.identityHashCode(this));
        boolean z11 = true;
        if (C32257b4.m155726m().m155737l().m117055Q() == 0 || this.f149578O2 == C32257b4.m155726m().m155737l().m117055Q()) {
            AbstractC3096i0.f13159c = false;
            AbstractC3096i0.f13168l = false;
            AbstractC3096i0.f13169m = true;
            AbstractC3096i0.f13166j = false;
        }
        this.f149639e3 = false;
        this.f149691r3.mo994F2();
        try {
            if (this.f149664l0 != null) {
                if (AbstractC3096i0.m15538g()) {
                    if (!AbstractC3096i0.f13170n) {
                    }
                    this.f149664l0.release();
                }
                AbstractC32273e3.m155748Q().mo155880f2(null, true);
                this.f149664l0.release();
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("ZmInCallActivity_Log", "selfView release failed " + e11);
        }
        try {
            TextureViewRenderer textureViewRenderer = this.f149608X;
            if (textureViewRenderer != null) {
                textureViewRenderer.registerSurfaceViewCallback(null);
                if (AbstractC3096i0.m15538g()) {
                    if (!AbstractC3096i0.f13170n) {
                    }
                    this.f149608X.release();
                }
                AbstractC32273e3.m155748Q().mo155880f2(null, false);
                this.f149608X.release();
            }
        } catch (Exception e12) {
            AbstractC3082b0.m15422d("ZmInCallActivity_Log", "partnerView release failed " + e12);
        }
        m157053ws();
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "onDestroy: isPlayingMp3 = " + this.f149553H2);
        this.f149642f2.removeCallbacksAndMessages(null);
        AbstractC3096i0.f13165i = false;
        if (!AbstractC3096i0.m15513S()) {
            C19561o0.m102161L().m102285z1();
        }
        m157126ew();
        this.f149541E2 = false;
        if (C32257b4.m155726m().m155737l().m117055Q() == 0 || this.f149578O2 == C32257b4.m155726m().m155737l().m117055Q()) {
            AbstractC3096i0.f13167k = 6;
        }
        ShowcaseView showcaseView = this.f149710w2;
        if (showcaseView != null) {
            showcaseView.m74626d();
        }
        C22626t c22626t2 = this.f149686q2;
        if (c22626t2 == null || c22626t2.f110960y == 0 || AbstractC3096i0.f13173q) {
            z11 = false;
        }
        if (!AbstractC3096i0.f13165i && !z11 && (c22626t = this.f149686q2) != null && c22626t.m117067U()) {
            C23744a.m124114c().m124116d(41, new Object[0]);
        }
        OrientationEventListener orientationEventListener = this.f149533C2;
        if (orientationEventListener != null && orientationEventListener.canDetectOrientation()) {
            this.f149533C2.disable();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:            if (r7 != 84) goto L36;     */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Key down : " + i11);
        if (i11 != 5 && i11 != 6) {
            if (i11 != 24 && i11 != 25) {
                if (i11 == 79) {
                    HeadsetButtonReceiver.m155534a(this);
                    return true;
                }
            } else {
                AbstractC3082b0.m15421c("ZmInCallActivity_Log", "onKeyDown: Volume button pressed");
                int i12 = -1;
                if (i11 == 24 && this.f149675n3 == 1 && VoipAudioHelper.m155570S() >= VoipAudioHelper.m155572T() && this.f149686q2 != null && C17843b.m94137o().m94180i() == -1 && this.f149686q2.m117126k0()) {
                    m156747Ft();
                }
                if (i11 != 25) {
                    i12 = 1;
                }
                if (this.f149686q2 != null || !AbstractC3096i0.f13165i) {
                    try {
                        AbstractC32273e3.m155748Q().mo155915s(this.f149686q2, i12, 1);
                    } catch (Exception e11) {
                        AbstractC3082b0.m15423e("ZmInCallActivity_Log", "Can't adjust volume", e11);
                    }
                }
            }
            return super.onKeyDown(i11, keyEvent);
        }
        return true;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Key up : " + i11);
        if (i11 != 5) {
            if (i11 != 6) {
                if (i11 == 24 || i11 == 25 || i11 == 84) {
                    return true;
                }
                return super.onKeyUp(i11, keyEvent);
            }
            this.f149691r3.mo138307tf(2);
            return true;
        }
        m157102Nr(3);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z11) {
        super.onMultiWindowModeChanged(z11);
        if (!this.f149549G2) {
            return;
        }
        this.f149603V2 = false;
        m156758Gw();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        setIntent(intent);
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "New intent is launched");
        super.onNewIntent(intent);
        m156809Ng(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C0697c0.Companion.m1048b().m1035h("CallView");
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "onPause");
        this.f149691r3.onPause();
        if (this.f149549G2 && this.f149656j0 != null && this.f149686q2.m117126k0()) {
            this.f149686q2.m117030H1(this.f149656j0.f150118v);
        }
        m157083zs();
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Pause in call " + System.identityHashCode(this));
        boolean z11 = false;
        this.f149545F2 = false;
        mo138330Db();
        C25948l mo155855W = AbstractC32273e3.m155748Q().mo155855W();
        if (!this.f149686q2.m117114h0() && !this.f149686q2.m117038K0()) {
            z11 = true;
        }
        mo155855W.f123737b = z11;
        if (m156950hc()) {
            this.f149682p2.mo95910c();
        }
        AbstractC3096i0.f13167k = 4;
        C13306b c13306b = this.f149706v2;
        if (c13306b != null) {
            c13306b.m74709u();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11, Configuration configuration) {
        super.onPictureInPictureModeChanged(z11, configuration);
        this.f149691r3.mo138274S5(z11);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, final String[] strArr, int[] iArr) {
        String[] strArr2;
        CircleBackgroundImageView circleBackgroundImageView;
        CircleBackgroundImageView circleBackgroundImageView2;
        if (this.f149549G2) {
            strArr2 = AbstractC3108t.f13194b;
        } else {
            strArr2 = AbstractC3108t.f13193a;
        }
        if (i11 == 200) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC3108t.m15712a(this, strArr2) == 0) {
                C22626t c22626t = this.f149686q2;
                if (c22626t != null && c22626t.m117079Y() && this.f149686q2.m117090b0()) {
                    C30209h.m148989d().m131794a();
                    C19561o0.m102161L().m102204H0(new C19548i(401, 0, this.f149549G2 ? 1 : 0));
                    return;
                } else {
                    m157102Nr(3);
                    return;
                }
            }
            if (this.f149549G2) {
                AbstractC23034c6.m118168n0(this, new InterfaceC17463d.d() { // from class: vo0.l2
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ZmInCallActivity.this.m156945gn(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.d() { // from class: vo0.r2
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ZmInCallActivity.this.m156959in(interfaceC17463d, i12);
                    }
                });
                return;
            } else {
                AbstractC23034c6.m118164l0(this, new InterfaceC17463d.d() { // from class: vo0.s2
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ZmInCallActivity.this.m156990nn(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.d() { // from class: vo0.t2
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ZmInCallActivity.this.m157009qn(interfaceC17463d, i12);
                    }
                }, null);
                return;
            }
        }
        if (i11 == 201) {
            this.f149619Z2 = false;
            if (AbstractC23034c6.m118121G()) {
                m157102Nr(20);
                return;
            } else {
                AbstractC3096i0.m15516T0(AbstractC8020f0.str_call_no_permission_snapshot_access_toast);
                return;
            }
        }
        if (i11 == 138) {
            if (mo138358P0()) {
                this.f149584Q2 = false;
                AbstractC32273e3.m155748Q().mo155933w2();
                if (m156936fi() && (circleBackgroundImageView2 = this.f149613Y0) != null) {
                    circleBackgroundImageView2.setSelected(true);
                    this.f149613Y0.setEnabled(false);
                    return;
                }
                return;
            }
            if (m156936fi() && (circleBackgroundImageView = this.f149613Y0) != null) {
                circleBackgroundImageView.setSelected(false);
                this.f149613Y0.setEnabled(true);
            }
            AbstractC23034c6.m118172p0(this);
            return;
        }
        if (i11 == 139) {
            if (this.f149686q2.m117038K0()) {
                if (mo138358P0()) {
                    AbstractC32273e3.m155748Q().mo155919t(true);
                    m156981mb(true);
                    return;
                } else {
                    AbstractC23034c6.m118158i0(this, 139, new InterfaceC17463d.d() { // from class: vo0.u2
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            ZmInCallActivity.this.m157023sn(interfaceC17463d, i12);
                        }
                    }, new InterfaceC17463d.c() { // from class: vo0.v2
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                        /* renamed from: p7 */
                        public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                            ZmInCallActivity.this.m157038un(interfaceC17463d);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (i11 == 140) {
            if (mo138358P0()) {
                this.f149691r3.mo138261L4("Manual", 7);
                return;
            } else {
                AbstractC23034c6.m118158i0(this, 140, null, null);
                mo138382Zh(true);
                return;
            }
        }
        if (i11 == 144) {
            if (AbstractC3108t.m15712a(this, strArr2) == 0) {
                this.f149691r3.mo138254Gg(this.f149686q2.m117117i());
            } else if (this.f149549G2) {
                AbstractC23034c6.m118168n0(this, null, new InterfaceC17463d.d() { // from class: vo0.w2
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ZmInCallActivity.this.m156882Xm(strArr, interfaceC17463d, i12);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        String[] strArr;
        super.onResume();
        this.f149691r3.onResume();
        C0697c0.Companion.m1048b().m1043u("CallView");
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "onResume");
        AbstractC3096i0.f13166j = true;
        this.f149635d3 = this.f149686q2.m117114h0();
        AbstractC3096i0.f13167k = 3;
        if (this.f149549G2) {
            strArr = AbstractC3108t.f13194b;
        } else {
            strArr = AbstractC3108t.f13193a;
        }
        if (AbstractC3108t.m15712a(getBaseContext(), strArr) != 0 && this.f149686q2.m117090b0() && this.f149686q2.m117079Y() && !this.f149615Y2) {
            synchronized (this) {
                this.f149615Y2 = true;
            }
            AbstractC23034c6.m118186w0(this, strArr, 200);
        }
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Resume in call " + System.identityHashCode(this));
        this.f149545F2 = true;
        if (m156950hc()) {
            this.f149682p2.mo95911d();
        }
        mo138357Oo(true, false);
        m156963jb();
        KeyboardDTMFView keyboardDTMFView = this.f149602V1;
        if (keyboardDTMFView != null) {
            keyboardDTMFView.m155502e();
        }
        C13306b c13306b = this.f149706v2;
        if (c13306b != null) {
            c13306b.m74710v();
        }
        m156946gr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStart() {
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Start in call " + System.identityHashCode(this));
        if (!C23269y3.m120038e(getResources().getConfiguration()).equals(AbstractC18458a.f93019a)) {
            recreate();
        }
        super.onStart();
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "onStart");
        AbstractC23775p0.m124219x(true);
        AbstractC3096i0.f13166j = true;
        this.f149691r3.onStart();
        if (this.f149691r3.mo138283W8()) {
            C32318n3.m156214E().m156256Q();
        }
        if (AbstractC3096i0.m15513S()) {
            C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
            if (!this.f149691r3.mo138314xj()) {
                C0815e1.m2075D().m2096R(3, System.currentTimeMillis());
            } else if (this.f149691r3.mo138314xj()) {
                C0815e1.m2075D().m2096R(0, System.currentTimeMillis());
            }
        }
        AbstractC3096i0.f13171o = false;
        AbstractC32273e3.m155748Q().m155941y2(true, this, this.f149654i2);
        AbstractC3096i0.f13167k = 2;
        AbstractC3096i0.m15542i(getString(AbstractC8020f0.str_call_no_miniview_toast));
        m157063xr();
        AbstractC17927b.m94533b().mo94531e(new Runnable() { // from class: vo0.t3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157062xn();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "Stop in call " + System.identityHashCode(this));
        super.onStop();
        C0697c0.Companion.m1048b().m1035h("CallView");
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "onStop");
        AbstractC23775p0.m124219x(false);
        this.f149691r3.onStop();
        this.f149642f2.sendEmptyMessage(3);
        ShowcaseView showcaseView = this.f149710w2;
        if (showcaseView != null) {
            showcaseView.m74626d();
            this.f149710w2 = null;
        }
        mo138357Oo(false, false);
        C13686a c13686a = this.f149718y2;
        if (c13686a != null) {
            c13686a.dismiss();
        }
        if (this.f149691r3.mo138271Qd() && !AbstractC3106r.m15710c(getContext())) {
            C32319o.m156293t().m156330r0();
            this.f149686q2.f110960y = 0;
            this.f149691r3.mo138299lh(0);
        }
        this.f149639e3 = false;
        if (C32257b4.m155726m().m155737l().m117055Q() == 0 || this.f149578O2 == C32257b4.m155726m().m155737l().m117055Q()) {
            AbstractC3096i0.f13166j = false;
            AbstractC3096i0.f13167k = 5;
        }
        AbstractC32273e3.m155748Q().m155941y2(false, this, this.f149654i2);
        m157130lh();
        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
        if (AbstractC3096i0.m15513S()) {
            if (!AbstractC3096i0.f13170n) {
                C0815e1.m2075D().m2096R(4, System.currentTimeMillis());
            } else {
                C0815e1.m2075D().m2096R(2, System.currentTimeMillis());
            }
        }
        ToastCountdownCustomView toastCountdownCustomView = this.f149661k1;
        if (toastCountdownCustomView != null) {
            toastCountdownCustomView.m157456b();
        }
        if (this.f149643f3) {
            m157130lh();
        }
        AbstractC32273e3.m155748Q().f148908v = false;
        if (this.f149549G2) {
            AbstractC32273e3.m155748Q().m155793D2();
        }
    }

    @Override // org.webrtc.ICallbackSurfaceViewCreated
    public void onSurfaceViewCreated(int i11) {
        synchronized (this) {
            if (i11 >= 0) {
                try {
                    this.f149561J2 = i11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C22626t c22626t = this.f149686q2;
        if (c22626t != null) {
            if (c22626t.m117176y0() || (this.f149686q2.m117130l0() && !this.f149607W2)) {
                mo138341Iu();
            }
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        if (z11) {
            C0697c0.Companion.m1048b().m1043u("CallView");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        this.f149691r3.mo138289dk();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: ox */
    public void mo138409ox(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.j4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156859Uo(z11);
            }
        });
    }

    /* renamed from: pc */
    void m157135pc() {
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        this.f149594T1 = recyclingImageView;
        recyclingImageView.setId(AbstractC6918a0.call_backgroundTheme);
        this.f149594T1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f149594T1.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        this.f149594T1.setVisibility(8);
        this.f149691r3.mo138291ja(false);
        this.f149588S.addView(this.f149594T1);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: pd */
    public void mo138410pd() {
        super.onBackPressed();
    }

    /* renamed from: pt */
    void m157136pt(TextView textView) {
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(-1);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: q6 */
    public void mo138411q6(boolean z11) {
        this.f149599U2 = z11;
        RoundedImageView roundedImageView = this.f149668m0;
        if (roundedImageView != null) {
            AbstractC3085d.m15445g(roundedImageView, z11, new C32422h(z11));
        }
    }

    /* renamed from: qs */
    void m157137qs() {
        C23744a.m124114c().m124115b(this, 40014);
        C23744a.m124114c().m124115b(this, 1001);
        C23744a.m124114c().m124115b(this, ZAbstractBase.ZVU_BLEND_PERCENTAGE);
        C23744a.m124114c().m124115b(this, ZAbstractBase.ZVU_BLEND_GEN_THUMB);
        C23744a.m124114c().m124115b(this, 1004);
        C23744a.m124114c().m124115b(this, 64);
        C23744a.m124114c().m124115b(this, 1005);
        C23744a.m124114c().m124115b(this, 1006);
        C23744a.m124114c().m124115b(this, 1007);
        C23744a.m124114c().m124115b(this, 1000);
        C23744a.m124114c().m124115b(this, 10014);
        C23744a.m124114c().m124115b(this, 10015);
        C23744a.m124114c().m124115b(this, IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM);
        C23744a.m124114c().m124115b(this, 10027);
        C23744a.m124114c().m124115b(this, 10028);
        C23744a.m124114c().m124115b(this, 10029);
        C23744a.m124114c().m124115b(this, 10030);
        C23744a.m124114c().m124115b(this, 10033);
        C23744a.m124114c().m124115b(this, 10035);
        C23744a.m124114c().m124115b(this, 10038);
        C23744a.m124114c().m124115b(this, 10039);
        C23744a.m124114c().m124115b(this, 40018);
        C23744a.m124114c().m124115b(this, 10040);
        C23744a.m124114c().m124115b(this, 40019);
        C23744a.m124114c().m124115b(this, 10041);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: rF */
    public void mo138412rF(long j11) {
        AbstractC17927b.m94533b().mo94530d("resetScaleSelfView", new Runnable() { // from class: vo0.s3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156875Wn();
            }
        }, j11);
    }

    /* renamed from: re */
    void m157138re() {
        int m15682q = AbstractC3104p.m15682q() + AbstractC3104p.m15668j() + ((AbstractC3104p.m15682q() * 3) / 4);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.gravity = 81;
        m15698a.bottomMargin = m15682q;
        KeyboardDTMFView keyboardDTMFView = this.f149602V1;
        if (keyboardDTMFView != null) {
            this.f149588S.removeView(keyboardDTMFView);
        }
        KeyboardDTMFView keyboardDTMFView2 = new KeyboardDTMFView(getContext(), this.f149686q2.m117047N0());
        this.f149602V1 = keyboardDTMFView2;
        keyboardDTMFView2.setLayoutParams(m15698a);
        this.f149602V1.setVisibility(8);
        this.f149602V1.setListener(new C32423h0());
        this.f149588S.addView(this.f149602V1);
    }

    @Override // p205hc.InterfaceC19967f
    public boolean removeCallbacks(Runnable runnable) {
        this.f149642f2.removeCallbacks(runnable);
        return true;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: ri */
    public void mo138413ri() {
        this.f149642f2.postDelayed(new Runnable() { // from class: vo0.h2
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156912cm();
            }
        }, 300L);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: rx */
    public void mo138414rx() {
        CallStickerView callStickerView = this.f149567L0;
        if (callStickerView == null) {
            return;
        }
        callStickerView.m157273j();
        this.f149567L0.setVisibility(8);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: s6 */
    public void mo138415s6(C28212v6 c28212v6) {
        ShowcaseView showcaseView = this.f149710w2;
        if (showcaseView != null && showcaseView.getParent() != null) {
            this.f149710w2.m74626d();
            this.f149710w2 = null;
        }
        String str = c28212v6.f131577c;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1852302571:
                if (str.equals("tip.videocall.sticker")) {
                    c11 = 0;
                    break;
                }
                break;
            case -731161345:
                if (str.equals("tip.call.hd.label")) {
                    c11 = 1;
                    break;
                }
                break;
            case -282418244:
                if (str.equals("tip.videocall.filter_skin")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                m156716Bu(c28212v6, this.f149720z0);
                return;
            case 1:
                m156716Bu(c28212v6, this.f149573N0);
                return;
            case 2:
                m156722Cu(c28212v6, this.f149701u1);
                return;
            default:
                return;
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: s9 */
    public void mo138416s9(boolean z11, boolean z12) {
        long j11;
        CircleBackgroundImageView circleBackgroundImageView = this.f149720z0;
        if (circleBackgroundImageView == null) {
            return;
        }
        if (z12) {
            j11 = 300;
        } else {
            j11 = 0;
        }
        AbstractC3085d.m15443e(circleBackgroundImageView, z11, j11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: sh */
    public boolean mo138417sh() {
        return this.f149562J3.isRunning();
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: sk */
    public boolean mo138418sk() {
        CircleBackgroundImageView circleBackgroundImageView = this.f149720z0;
        if (circleBackgroundImageView != null && circleBackgroundImageView.getVisibility() == 0 && this.f149720z0.isSelected()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: sr */
    public void mo138419sr() {
        if (this.f149664l0 != null) {
            AbstractC32273e3.m155748Q().mo155880f2(this.f149664l0, true);
        }
        if (this.f149608X != null) {
            AbstractC32273e3.m155748Q().mo155880f2(this.f149608X, false);
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: t8 */
    public void mo138420t8(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.x3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157052wp(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: th */
    public boolean mo138421th() {
        boolean isInMultiWindowMode;
        if (Build.VERSION.SDK_INT > 23) {
            isInMultiWindowMode = isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        return false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: u2 */
    public void mo138422u2(int i11) {
        AbstractC23034c6.m118186w0(this, AbstractC23034c6.f112033j, i11);
    }

    /* renamed from: uw */
    void m157139uw() {
        boolean z11;
        boolean m117126k0 = this.f149686q2.m117126k0();
        if (m117126k0 && this.f149690r2.f110659a) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC3082b0.m15421c("ZmInCallActivity_Log", "muteBtn setSelected: " + m117126k0 + ", focused: " + z11 + " videoCall: " + this.f149686q2.m117047N0());
        this.f149697t1.setEnabled(m117126k0);
        this.f149697t1.setSelected(z11);
        this.f149693s1.setEnabled(true ^ this.f149686q2.m117067U());
        if (this.f149549G2) {
            VoIPButtonWithText voIPButtonWithText = this.f149705v1;
            if (voIPButtonWithText != null) {
                voIPButtonWithText.m157425j(this.f149557I2);
            }
            m156926ec();
        }
    }

    /* renamed from: vf */
    void m157140vf() {
        int i11;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f149596U = frameLayout;
        frameLayout.setId(AbstractC6918a0.call_videoCallLayout);
        this.f149596U.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        FrameLayout frameLayout2 = this.f149596U;
        if (this.f149549G2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        frameLayout2.setVisibility(i11);
        this.f149596U.setOnTouchListener(new C32411b0(getContext()));
        m157133of();
        this.f149588S.addView(this.f149596U);
        FrameLayout frameLayout3 = new FrameLayout(getContext());
        this.f149600V = frameLayout3;
        frameLayout3.setId(AbstractC6918a0.call_bgMaskVideoLayoutTop);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
        m15698a.height = AbstractC3104p.m15657d0() / 2;
        m15698a.gravity = 48;
        this.f149600V.setLayoutParams(m15698a);
        this.f149600V.setVisibility(8);
        this.f149600V.setBackgroundResource(AbstractC16803z.bg_mask_video_layout);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15659e0() / 2, AbstractC3104p.m15659e0() / 2);
        m15700c.gravity = 17;
        m15700c.bottomMargin = AbstractC3104p.m15650a(100.0f);
        CallStickerView callStickerView = new CallStickerView(getContext());
        this.f149567L0 = callStickerView;
        callStickerView.setLayoutParams(m15700c);
        this.f149567L0.m157274k(AbstractC3104p.m15659e0() / 2, AbstractC3104p.m15659e0() / 2);
        this.f149567L0.setVisibility(8);
        this.f149567L0.setOnClickListener(new View.OnClickListener() { // from class: vo0.m3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3085d.m15442d(view, false);
            }
        });
        this.f149567L0.setPlayStickerDone(new C13700o2.b() { // from class: vo0.n3
            @Override // com.zing.zalo.p077ui.widget.C13700o2.b
            /* renamed from: l */
            public final void mo76550l() {
                ZmInCallActivity.this.m156787Kl();
            }
        });
        this.f149588S.addView(this.f149567L0);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: vj */
    public void mo138423vj(boolean z11, boolean z12) {
        long j11;
        LiveEmojiButton liveEmojiButton = this.f149716y0;
        if (liveEmojiButton == null) {
            return;
        }
        if (z12) {
            j11 = 300;
        } else {
            j11 = 0;
        }
        AbstractC3085d.m15443e(liveEmojiButton, z11, j11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: vn */
    public void mo138424vn(final int i11, final int i12, final int i13, final boolean z11) {
        mo70710wy(new Runnable() { // from class: vo0.k5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156838Rn(i11, i12, i13, z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: vt */
    public void mo138425vt(boolean z11) {
        CircleBackgroundImageView circleBackgroundImageView = this.f149681p1;
        if (circleBackgroundImageView == null) {
            return;
        }
        circleBackgroundImageView.setEnabled(z11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: vw */
    public void mo138426vw(boolean z11) {
        if (this.f149716y0 == null || C19172a.m100600k("features@voip@enable_grayscale_emoji", 1) != 1) {
            return;
        }
        this.f149716y0.setEmojiGrayscale(z11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: wA */
    public void mo138427wA(final boolean z11, final boolean z12) {
        mo70710wy(new Runnable() { // from class: vo0.m5
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157032tq(z11, z12);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: wa */
    public void mo138428wa(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.r3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157045vp(z11);
            }
        });
    }

    /* renamed from: wd */
    void m157141wd() {
        boolean z11;
        ZaloZinstantLayout zaloZinstantLayout;
        int m15668j = AbstractC3104p.m15668j();
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC3082b0.m15424f("ZmInCallActivity_Log", "isClickEventEnable " + z11);
        LinearLayout linearLayout = this.f149677o1;
        if (linearLayout != null) {
            this.f149693s1 = null;
            linearLayout.removeAllViewsInLayout();
            this.f149588S.removeViewInLayout(this.f149677o1);
            this.f149588S.removeViewInLayout(this.f149709w1);
            ZaloZinstantLayout zaloZinstantLayout2 = this.f149669m1;
            if (zaloZinstantLayout2 != null) {
                this.f149588S.removeViewInLayout(zaloZinstantLayout2);
            }
        }
        m157015rd();
        m157020sd();
        m156856Uc(z11);
        m157088Gd(z11);
        m157060xd(z11);
        m157080ze(z11);
        m156964jd(z11);
        m156844Sc(m15668j);
        m157071yd(m15668j);
        if (this.f149686q2.m117138n0()) {
            m157073yf();
        }
        m157043vd(z11);
        m156768Ie();
        m157072ye(z11);
        if (this.f149549G2) {
            m156957ie();
            this.f149677o1.addView(this.f149705v1);
            this.f149677o1.addView(this.f149697t1);
            this.f149677o1.addView(this.f149685q1);
            this.f149677o1.addView(this.f149701u1);
            this.f149677o1.addView(this.f149689r1);
            this.f149677o1.addView(this.f149717y1);
            this.f149677o1.addView(this.f149713x1);
        } else {
            this.f149677o1.addView(this.f149693s1);
            this.f149677o1.addView(this.f149685q1);
            this.f149677o1.addView(this.f149697t1);
            this.f149677o1.addView(this.f149689r1);
        }
        this.f149588S.addView(this.f149709w1);
        this.f149588S.addView(this.f149653i1);
        if (this.f149686q2.m117138n0() && (zaloZinstantLayout = this.f149669m1) != null) {
            this.f149588S.addView(zaloZinstantLayout);
        }
        this.f149588S.addView(this.f149677o1);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: wr */
    public void mo138429wr() {
        C23744a.m124114c().m124116d(10042, new Object[0]);
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: wy */
    public void mo70710wy(Runnable runnable) {
        this.f149642f2.post(runnable);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: wz */
    public void mo138430wz(final String str, final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.d4
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156983mp(str, z11);
            }
        });
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, final Object... objArr) {
        this.f149691r3.mo138278U(i11, objArr);
        if (i11 != 64) {
            if (i11 != 10027) {
                if (i11 != 10035) {
                    if (i11 != 40014) {
                        if (i11 != 40019) {
                            if (i11 != 10014) {
                                if (i11 != 10015) {
                                    switch (i11) {
                                        case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                                        case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                                        case 1004:
                                        case 1005:
                                        case 1006:
                                        case 1007:
                                            if (!this.f149541E2 && this.f149686q2 != null) {
                                                runOnUiThread(new Runnable() { // from class: vo0.b3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ZmInCallActivity.this.m156852Tl(i11, objArr);
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (i11) {
                                                case 10038:
                                                    runOnUiThread(new Runnable() { // from class: vo0.d3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            ZmInCallActivity.this.m156793Lb();
                                                        }
                                                    });
                                                    break;
                                                case 10039:
                                                    break;
                                                case 10040:
                                                    m156788Kr(objArr);
                                                    return;
                                                default:
                                                    return;
                                            }
                                            runOnUiThread(new Runnable() { // from class: vo0.e3
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ZmInCallActivity.this.m156804Ml(objArr);
                                                }
                                            });
                                            return;
                                    }
                                }
                                m157065xw();
                                return;
                            }
                            final int intValue = ((Integer) objArr[0]).intValue();
                            runOnUiThread(new Runnable() { // from class: vo0.a3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZmInCallActivity.this.m156846Sl(intValue);
                                }
                            });
                            return;
                        }
                        runOnUiThread(new Runnable() { // from class: vo0.f3
                            @Override // java.lang.Runnable
                            public final void run() {
                                ZmInCallActivity.this.m156823Pl();
                            }
                        });
                        return;
                    }
                    m157063xr();
                    return;
                }
                if (objArr != null) {
                    AbstractC3082b0.m15424f("ZmInCallActivity_Log", "ACTION_CLOSE_CALL_SCREEN");
                    this.f149691r3.mo138251E4();
                    return;
                }
                return;
            }
            runOnUiThread(new Runnable() { // from class: vo0.c3
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallActivity.this.m156881Xl(objArr);
                }
            });
            return;
        }
        if (this.f149716y0 != null && objArr != null && objArr.length == 3) {
            String str = (String) objArr[0];
            C24277c c24277c = (C24277c) objArr[1];
            if (c24277c.f117240a == 3) {
                AnimChat animChat = this.f149712x0;
                if (animChat != null) {
                    animChat.m76116a0(c24277c.f117245f);
                    return;
                }
                return;
            }
            C22626t c22626t = this.f149686q2;
            if (c22626t != null && String.valueOf(c22626t.m117013C()).equals(str)) {
                int[] m157121cg = m157121cg();
                m157122ds(str, c24277c, m157121cg[0], m157121cg[1]);
            }
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: xg */
    public void mo138431xg() {
        runOnUiThread(new Runnable() { // from class: vo0.o3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157002po();
            }
        });
    }

    /* renamed from: xh */
    void m157142xh(boolean z11) {
        long j11;
        TextView textView = this.f149590S1;
        if (z11) {
            j11 = 0;
        } else {
            j11 = 100;
        }
        AbstractC3085d.m15443e(textView, false, j11);
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: xp */
    public void mo138432xp(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.f6
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m156920dp(z11);
            }
        });
    }

    /* renamed from: xt */
    void m157143xt() {
        this.f149550G3 = this.f149646g2.m112019d();
        this.f149723z3 = this.f149646g2.m112019d();
        this.f149526A3 = this.f149646g2.m112019d();
        this.f149530B3 = this.f149646g2.m112019d();
        this.f149534C3 = this.f149646g2.m112019d();
        this.f149538D3 = this.f149646g2.m112019d();
        this.f149542E3 = this.f149646g2.m112019d();
        this.f149546F3 = this.f149646g2.m112019d();
        this.f149554H3 = this.f149646g2.m112019d();
        this.f149550G3.m112048u(AbstractC21245c.f103555b);
        this.f149723z3.m112048u(AbstractC21245c.f103555b);
        this.f149526A3.m112048u(AbstractC21245c.f103555b);
        this.f149530B3.m112048u(AbstractC21245c.f103555b);
        this.f149534C3.m112048u(AbstractC21245c.f103555b);
        this.f149546F3.m112048u(AbstractC21245c.f103555b);
        this.f149538D3.m112048u(AbstractC21245c.f103555b);
        this.f149542E3.m112048u(AbstractC21245c.f103555b);
        this.f149554H3.m112048u(AbstractC21245c.f103555b);
    }

    /* renamed from: xv */
    void m157144xv() {
        if (this.f149711w3) {
            this.f149689r1.clearAnimation();
        }
        this.f149711w3 = false;
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: yE */
    public void mo138433yE() {
        ToastCountdownCustomView toastCountdownCustomView = this.f149661k1;
        if (toastCountdownCustomView != null) {
            toastCountdownCustomView.m157456b();
        }
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: yH */
    public void mo138434yH(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.k3
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157046vq(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: yI */
    public void mo138435yI(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: vo0.n2
            @Override // java.lang.Runnable
            public final void run() {
                ZmInCallActivity.this.m157037um(z11);
            }
        });
    }

    @Override // to0.InterfaceC26863h
    /* renamed from: zE */
    public void mo138436zE(int i11) {
        if (this.f149691r3.mo138314xj()) {
            m157113Uv();
            m157123dv(i11);
        } else {
            m157111Tv();
            m157116Vu(i11);
        }
    }

    /* renamed from: zc */
    void m157145zc() {
        View view = new View(getContext());
        this.f149649h1 = view;
        view.setId(AbstractC6918a0.call_blurBackground);
        this.f149649h1.setBackgroundColor(AbstractC23136l9.m118641B(this, AbstractC16801x.call_background_blur_video));
        this.f149649h1.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        this.f149649h1.setVisibility(8);
        this.f149588S.addView(this.f149649h1);
    }
}
