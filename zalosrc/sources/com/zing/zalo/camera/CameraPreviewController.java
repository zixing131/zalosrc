package com.zing.zalo.camera;

import ag0.AbstractC0837p0;
import ag0.C0820h;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.AbstractC2379w;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.camera.CameraPreviewController;
import com.zing.zalo.camera.common.customviews.FocusCircleView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.videomodepicker.VideoModePicker;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.feed.components.FeedBackgroundView;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p077ui.camera.documentscanner.custom.DocumentScanGuidelineView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.ChangeableHeightRelativeLayout;
import com.zing.zalo.p077ui.widget.DragCameraLayout;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RedDotRoundedImageView;
import com.zing.zalo.p077ui.zviews.RotatableZaloView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.uicomponents.imageview.ActiveImageColorButton;
import com.zing.zalo.uicomponents.view.CameraRecordButton;
import com.zing.zalo.uicomponents.view.RecordButton;
import com.zing.zalo.uicomponents.view.VideoRecordButton;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import f90.C18826a;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import i40.AbstractC20276f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.C22052u;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23059e9;
import me0.AbstractC23121k5;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23171p0;
import me0.AbstractC23202r9;
import me0.AbstractC23222t7;
import me0.AbstractC23237v1;
import me0.AbstractC23238v2;
import me0.AbstractC23244v8;
import me0.AbstractC23280z4;
import me0.C23046d7;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p207he.C20024r;
import p248iy.AbstractC20887g;
import p295kb.C21643a;
import p322lf.AbstractC22462c;
import p322lf.AbstractC22463d;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p493rt.C25977a;
import p500s1.C26087b;
import p588vw.C28652r;
import p646xi.C29669a;
import p714zf.AbstractC31817h;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C32123ta;
import rc0.InterfaceC25728a;
import sa0.C26203c;
import th.AbstractC26681b;
import th.AbstractC26689j;
import th.C26694o;
import ve.AbstractC27985d;
import ve.C27989h;
import vg.AbstractC28025b8;
import vg.AbstractC28045d8;
import vg.C28212v6;
import xh0.C29667y;
import xh0.InterfaceC29634a;
import xh0.InterfaceC29636b;
import xh0.InterfaceC29653k;
import zh0.AbstractC32212c;
import zl0.AbstractC32226c;
import zl0.AbstractC32229f;
import zl0.AbstractC32232i;

@SuppressLint({"DefaultLocale", "StringFormatInTimber", "ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public class CameraPreviewController extends RelativeLayout implements View.OnClickListener, InterfaceC29636b {

    /* renamed from: b1 */
    private static final int f40713b1;

    /* renamed from: A */
    public ImageButton f40714A;

    /* renamed from: A0 */
    private boolean f40715A0;

    /* renamed from: B */
    private CameraRecordButton f40716B;

    /* renamed from: B0 */
    private boolean f40717B0;

    /* renamed from: C */
    private VideoRecordButton f40718C;

    /* renamed from: C0 */
    private boolean f40719C0;

    /* renamed from: D */
    private RobotoButton f40720D;

    /* renamed from: D0 */
    private boolean f40721D0;

    /* renamed from: E */
    public ChangeableHeightRelativeLayout f40722E;

    /* renamed from: E0 */
    private SensitiveData f40723E0;

    /* renamed from: F */
    private TextView f40724F;

    /* renamed from: F0 */
    private InterfaceC7513q f40725F0;

    /* renamed from: G */
    private TextView f40726G;

    /* renamed from: G0 */
    private int f40727G0;

    /* renamed from: H */
    private C13306b f40728H;

    /* renamed from: H0 */
    private C16572d1 f40729H0;

    /* renamed from: I */
    public ShowcaseView f40730I;

    /* renamed from: I0 */
    private Editable f40731I0;

    /* renamed from: J */
    public View f40732J;

    /* renamed from: J0 */
    private final Runnable f40733J0;

    /* renamed from: K */
    public FeedBackgroundView f40734K;

    /* renamed from: K0 */
    private String f40735K0;

    /* renamed from: L */
    private List f40736L;

    /* renamed from: L0 */
    private boolean f40737L0;

    /* renamed from: M */
    public C31890dc f40738M;

    /* renamed from: M0 */
    public boolean f40739M0;

    /* renamed from: N */
    private StatusComposeEditText f40740N;

    /* renamed from: N0 */
    public C0820h.a f40741N0;

    /* renamed from: O */
    private UpdateStatusView.EnumC15265l0 f40742O;

    /* renamed from: O0 */
    public final Handler f40743O0;

    /* renamed from: P */
    private C23528a f40744P;

    /* renamed from: P0 */
    private final View.OnTouchListener f40745P0;

    /* renamed from: Q */
    private CameraInputParams f40746Q;

    /* renamed from: Q0 */
    private final View.OnTouchListener f40747Q0;

    /* renamed from: R */
    private ZaloCameraView f40748R;

    /* renamed from: R0 */
    private AbstractC32226c.b f40749R0;

    /* renamed from: S */
    private ImageDecorView f40750S;

    /* renamed from: S0 */
    private AbstractC32226c.b f40751S0;

    /* renamed from: T */
    public InterfaceC29634a f40752T;

    /* renamed from: T0 */
    private AbstractC32226c.b f40753T0;

    /* renamed from: U */
    private C29669a f40754U;

    /* renamed from: U0 */
    private AbstractC32226c.b f40755U0;

    /* renamed from: V */
    private long f40756V;

    /* renamed from: V0 */
    private FrameLayout f40757V0;

    /* renamed from: W */
    private long f40758W;

    /* renamed from: W0 */
    private final InterfaceC29653k.a f40759W0;

    /* renamed from: X0 */
    private final InterfaceC29634a.a f40760X0;

    /* renamed from: Y0 */
    private boolean f40761Y0;

    /* renamed from: Z0 */
    public long f40762Z0;

    /* renamed from: a0 */
    public int f40763a0;

    /* renamed from: a1 */
    private final AbstractC31817h.b f40764a1;

    /* renamed from: b0 */
    private int f40765b0;

    /* renamed from: c0 */
    private int f40766c0;

    /* renamed from: d0 */
    public C25977a f40767d0;

    /* renamed from: e0 */
    private MotionEvent f40768e0;

    /* renamed from: f0 */
    public boolean f40769f0;

    /* renamed from: g0 */
    public String f40770g0;

    /* renamed from: h0 */
    private String f40771h0;

    /* renamed from: i0 */
    private boolean f40772i0;

    /* renamed from: j0 */
    private boolean f40773j0;

    /* renamed from: k0 */
    private int f40774k0;

    /* renamed from: l0 */
    public int f40775l0;

    /* renamed from: m0 */
    public boolean f40776m0;

    /* renamed from: n0 */
    private boolean f40777n0;

    /* renamed from: o0 */
    private boolean f40778o0;

    /* renamed from: p */
    public View f40779p;

    /* renamed from: p0 */
    public boolean f40780p0;

    /* renamed from: q */
    public VideoModePicker f40781q;

    /* renamed from: q0 */
    public boolean f40782q0;

    /* renamed from: r */
    public FocusCircleView f40783r;

    /* renamed from: r0 */
    public boolean f40784r0;

    /* renamed from: s */
    private final Rect f40785s;

    /* renamed from: s0 */
    public boolean f40786s0;

    /* renamed from: t */
    public ImageButton f40787t;

    /* renamed from: t0 */
    private int f40788t0;

    /* renamed from: u */
    public ImageButton f40789u;

    /* renamed from: u0 */
    private int f40790u0;

    /* renamed from: v */
    public ImageButton f40791v;

    /* renamed from: v0 */
    private int f40792v0;

    /* renamed from: w */
    public RedDotRoundedImageView f40793w;

    /* renamed from: w0 */
    private boolean f40794w0;

    /* renamed from: x */
    public ActiveImageColorButton f40795x;

    /* renamed from: x0 */
    private Runnable f40796x0;

    /* renamed from: y */
    public ActiveImageColorButton f40797y;

    /* renamed from: y0 */
    private boolean f40798y0;

    /* renamed from: z */
    public RedDotRoundedImageView f40799z;

    /* renamed from: z0 */
    private boolean f40800z0;

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$a */
    /* loaded from: classes3.dex */
    public class ViewTreeObserverOnPreDrawListenerC7497a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        final /* synthetic */ View f40801p;

        ViewTreeObserverOnPreDrawListenerC7497a(View view) {
            this.f40801p = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f40801p.getViewTreeObserver().removeOnPreDrawListener(this);
            ViewGroup.LayoutParams layoutParams = this.f40801p.getLayoutParams();
            layoutParams.height = AbstractC32229f.m155440l(this.f40801p).top;
            this.f40801p.setLayoutParams(layoutParams);
            return false;
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$b */
    /* loaded from: classes3.dex */
    public class RunnableC7498b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ boolean f40803p;

        /* renamed from: com.zing.zalo.camera.CameraPreviewController$b$a */
        /* loaded from: classes3.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                try {
                    super.onAnimationEnd(animator);
                    if (CameraPreviewController.this.f40796x0 != null) {
                        CameraPreviewController.this.f40796x0.run();
                        CameraPreviewController.this.f40796x0 = null;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("CameraPreviewController", e11);
                }
            }
        }

        RunnableC7498b(boolean z11) {
            this.f40803p = z11;
        }

        /* renamed from: b */
        public /* synthetic */ void m38601b(int i11) {
            try {
                CameraPreviewController.this.m38540w2();
                CameraPreviewController.this.setFlashMode(i11);
                if (CameraPreviewController.this.f40725F0 != null) {
                    if (!TextUtils.isEmpty(CameraPreviewController.this.f40771h0)) {
                        CameraPreviewController.this.f40725F0.mo38647g(CameraPreviewController.this.f40771h0, CameraPreviewController.this.f40772i0, CameraPreviewController.this.f40778o0);
                    } else {
                        CameraPreviewController.this.f40725F0.mo38650j(CameraPreviewController.this.f40778o0);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.camera.f2.<init>(com.zing.zalo.camera.CameraPreviewController$b, int):void, class status: GENERATED_AND_UNLOADED
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
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r5 = this;
                com.zing.zalo.camera.CameraPreviewController r0 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.ZaloCameraView r0 = com.zing.zalo.camera.CameraPreviewController.m38456W(r0)     // Catch: java.lang.Exception -> L2e
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L2e
                r1 = 0
                me0.AbstractC23059e9.m118319H(r0, r1)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r0 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                r0.f40784r0 = r1     // Catch: java.lang.Exception -> L2e
                r0.f40786s0 = r1     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController.m38534v0(r0)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r0 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                int r0 = com.zing.zalo.camera.CameraPreviewController.m38397C(r0)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r2 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                xh0.a r3 = r2.f40752T     // Catch: java.lang.Exception -> L2e
                if (r3 == 0) goto L31
                com.zing.zalo.camera.CameraPreviewController.m38549z0(r2, r1)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r2 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                xh0.a r2 = r2.f40752T     // Catch: java.lang.Exception -> L2e
                r2.mo147381l(r1)     // Catch: java.lang.Exception -> L2e
                goto L31
            L2e:
                r0 = move-exception
                goto Lb8
            L31:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
                r2.<init>()     // Catch: java.lang.Exception -> L2e
                java.lang.String r3 = "stopVideoRecording: really stop video recording, isCancelled= "
                r2.append(r3)     // Catch: java.lang.Exception -> L2e
                boolean r3 = r5.f40803p     // Catch: java.lang.Exception -> L2e
                r2.append(r3)     // Catch: java.lang.Exception -> L2e
                java.lang.String r3 = ", isRecordingVideo= "
                r2.append(r3)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r3 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                boolean r3 = r3.f40769f0     // Catch: java.lang.Exception -> L2e
                r2.append(r3)     // Catch: java.lang.Exception -> L2e
                java.lang.String r3 = ", videoRecordStarted= "
                r2.append(r3)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r3 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                boolean r3 = com.zing.zalo.camera.CameraPreviewController.m38449T(r3)     // Catch: java.lang.Exception -> L2e
                r2.append(r3)     // Catch: java.lang.Exception -> L2e
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2e
                java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2e
                ho0.AbstractC20110a.m104535d(r2, r3)     // Catch: java.lang.Exception -> L2e
                java.lang.String r2 = "record"
                me0.AbstractC23237v1.m119713a(r2)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r2 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.uicomponents.view.RecordButton r2 = r2.getRecordButton()     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r3 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                boolean r4 = r5.f40803p     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController.m38476c0(r3, r4)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r3 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.cameradecor.view.ImageDecorView r3 = com.zing.zalo.camera.CameraPreviewController.m38400D(r3)     // Catch: java.lang.Exception -> L2e
                r3.m39746B0()     // Catch: java.lang.Exception -> L2e
                r3 = 1
                r2.f83014w = r3     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r3 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController.m38538w0(r3)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r3 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                boolean r3 = com.zing.zalo.camera.CameraPreviewController.m38449T(r3)     // Catch: java.lang.Exception -> L2e
                if (r3 != 0) goto L9a
                com.zing.zalo.camera.CameraPreviewController r0 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                r0.f40769f0 = r1     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController.m38545y0(r0)     // Catch: java.lang.Exception -> L2e
                r0 = 0
                r2.mo87629i(r0)     // Catch: java.lang.Exception -> L2e
                return
            L9a:
                com.zing.zalo.camera.CameraPreviewController r3 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController.m38505l0(r3, r1)     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController r1 = com.zing.zalo.camera.CameraPreviewController.this     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.f2 r3 = new com.zing.zalo.camera.f2     // Catch: java.lang.Exception -> L2e
                r3.<init>()     // Catch: java.lang.Exception -> L2e
                com.zing.zalo.camera.CameraPreviewController.m38494h0(r1, r3)     // Catch: java.lang.Exception -> L2e
                android.view.ViewParent r0 = r2.getParent()     // Catch: java.lang.Exception -> L2e
                if (r0 == 0) goto Lbd
                com.zing.zalo.camera.CameraPreviewController$b$a r0 = new com.zing.zalo.camera.CameraPreviewController$b$a     // Catch: java.lang.Exception -> L2e
                r0.<init>()     // Catch: java.lang.Exception -> L2e
                r2.mo87629i(r0)     // Catch: java.lang.Exception -> L2e
                goto Lbd
            Lb8:
                java.lang.String r1 = "CameraPreviewController"
                mm0.AbstractC23350e.m122776f(r1, r0)
            Lbd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.camera.CameraPreviewController.RunnableC7498b.run():void");
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$c */
    /* loaded from: classes3.dex */
    public class C7499c extends AnimatorListenerAdapter {
        C7499c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC23136l9.m118744r1(CameraPreviewController.this.f40757V0, 8);
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$d */
    /* loaded from: classes3.dex */
    public class C7500d implements InterfaceC29653k.a {
        C7500d() {
        }

        /* renamed from: g */
        public /* synthetic */ void m38604g() {
            CameraPreviewController.this.f40748R.m39042YT(false);
        }

        /* renamed from: h */
        public /* synthetic */ void m38605h() {
            try {
                if (CameraPreviewController.this.f40725F0 != null) {
                    CameraPreviewController.this.f40725F0.mo38641a(true);
                }
                CameraPreviewController.this.m38547y2();
                if (CameraPreviewController.this.f40750S != null) {
                    CameraPreviewController.this.f40750S.mo39680s();
                }
                CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                int i11 = 0;
                cameraPreviewController.f40780p0 = false;
                cameraPreviewController.m38465Z2();
                CameraPreviewController cameraPreviewController2 = CameraPreviewController.this;
                if (cameraPreviewController2.f40783r != null) {
                    cameraPreviewController2.m38568S0();
                    CameraPreviewController.this.m38572V0(true);
                }
                CameraPreviewController cameraPreviewController3 = CameraPreviewController.this;
                ImageButton imageButton = cameraPreviewController3.f40787t;
                if (!cameraPreviewController3.m38513n1()) {
                    i11 = 4;
                }
                AbstractC23136l9.m118744r1(imageButton, i11);
                if (CameraPreviewController.this.f40774k0 != 1 && CameraPreviewController.this.f40748R != null && CameraPreviewController.this.f40748R.f40897l1 == 1 && CameraPreviewController.this.f40748R.m39087zR()) {
                    CameraPreviewController.this.f40743O0.post(new Runnable() { // from class: com.zing.zalo.camera.h2
                        public /* synthetic */ RunnableC7644h2() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraPreviewController.C7500d.this.m38604g();
                        }
                    });
                }
                if (CameraPreviewController.this.f40748R != null) {
                    CameraPreviewController.this.f40748R.m39023HT(true);
                    CameraPreviewController.this.f40748R.m39069oT();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: a */
        public void mo38606a(boolean z11) {
            if (z11 && CameraPreviewController.this.f40748R != null && CameraPreviewController.this.f40748R.m92676n2() != null) {
                CameraPreviewController.this.m38536v2("120N000");
                CameraPreviewController.this.f40748R.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.g2
                    public /* synthetic */ RunnableC7629g2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreviewController.C7500d.this.m38605h();
                    }
                });
            }
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: b */
        public void mo38607b(boolean z11, Exception exc) {
            if (!z11) {
                AbstractC20887g.m109233k(CoreUtility.f89233i, 21001, "" + exc, 0L, 21000, CoreUtility.f89236l);
                if (CameraPreviewController.this.f40748R.m92672lJ()) {
                    if (exc instanceof SensitiveDataException) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_camera_block_title));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_msg_camera_framework_bug));
                    }
                    CameraPreviewController.this.f40748R.finish();
                }
            } else {
                CameraPreviewController.this.f40780p0 = false;
            }
            if (exc != null) {
                AbstractC23350e.m122776f("CameraPreviewController", exc);
            }
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: c */
        public void mo38608c(byte[] bArr, boolean z11) {
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: d */
        public void mo38609d(boolean z11, Exception exc) {
            if (!z11) {
                CameraPreviewController.this.f40748R.finish();
            }
            if (exc != null) {
                AbstractC23350e.m122776f("CameraPreviewController", exc);
            }
        }

        @Override // xh0.InterfaceC29653k.a
        public void onError(int i11) {
            if (CameraPreviewController.this.f40748R != null && CameraPreviewController.this.f40748R.m92687sJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_msg_camera_framework_bug) + " " + i11);
                AbstractC20887g.m109233k(CoreUtility.f89233i, 21002, "Error code: " + i11, 0L, 21000, CoreUtility.f89236l);
                CameraPreviewController.this.f40748R.finish();
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$e */
    /* loaded from: classes3.dex */
    public class C7501e implements InterfaceC29634a.a {
        C7501e() {
        }

        /* renamed from: h */
        public /* synthetic */ void m38614h() {
            try {
                CameraPreviewController.this.m38568S0();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m38615i(String str) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case 3551:
                    if (str.equals("on")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 109935:
                    if (str.equals("off")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    CameraPreviewController.this.f40790u0 = 1;
                    CameraPreviewController.this.f40787t.setImageResource(AbstractC16803z.ic_secret_flash_on);
                    return;
                case 1:
                    CameraPreviewController.this.f40790u0 = 0;
                    CameraPreviewController.this.f40787t.setImageResource(AbstractC16803z.ic_secret_flash_off);
                    return;
                case 2:
                    CameraPreviewController.this.f40790u0 = 2;
                    CameraPreviewController.this.f40787t.setImageResource(AbstractC16803z.ic_secret_flash_auto);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m38616j() {
            CameraPreviewController.this.f40784r0 = false;
        }

        /* renamed from: k */
        public /* synthetic */ void m38617k(byte[] bArr, int i11) {
            try {
                CameraPreviewController.this.m38427K2(0);
                CameraPreviewController.this.m38559L2(0);
                CameraPreviewController.this.m38554F2(0);
                CameraPreviewController.this.m38556G2(0);
                CameraPreviewController.this.m38562N2(false);
                CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                cameraPreviewController.f40780p0 = false;
                cameraPreviewController.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.l2
                    public /* synthetic */ RunnableC7668l2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreviewController.C7501e.this.m38616j();
                    }
                }, 500L);
                CameraPreviewController cameraPreviewController2 = CameraPreviewController.this;
                cameraPreviewController2.f40770g0 = null;
                if (cameraPreviewController2.f40725F0 != null) {
                    CameraPreviewController.this.f40725F0.mo38643c(bArr, i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }

        @Override // xh0.InterfaceC29634a.a
        /* renamed from: a */
        public void mo38618a(boolean z11) {
            CameraPreviewController.this.f40748R.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.i2
                public /* synthetic */ RunnableC7650i2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.C7501e.this.m38614h();
                }
            });
        }

        @Override // xh0.InterfaceC29634a.a
        /* renamed from: b */
        public void mo38619b(String str) {
            CameraPreviewController.this.f40748R.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.k2

                /* renamed from: q */
                public final /* synthetic */ String f41317q;

                public /* synthetic */ RunnableC7662k2(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.C7501e.this.m38615i(r2);
                }
            });
        }

        @Override // xh0.InterfaceC29634a.a
        /* renamed from: c */
        public void mo38620c(byte[] bArr, int i11) {
            AbstractC23237v1.m119714b("capture", "end onPictureTaken");
            if (CameraPreviewController.this.f40748R != null && CameraPreviewController.this.f40748R.m92676n2() != null) {
                CameraPreviewController.this.f40748R.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.j2

                    /* renamed from: q */
                    public final /* synthetic */ byte[] f41306q;

                    /* renamed from: r */
                    public final /* synthetic */ int f41307r;

                    public /* synthetic */ RunnableC7656j2(byte[] bArr2, int i112) {
                        r2 = bArr2;
                        r3 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreviewController.C7501e.this.m38617k(r2, r3);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$f */
    /* loaded from: classes3.dex */
    public class C7502f implements AbstractC31817h.b {
        C7502f() {
        }

        /* renamed from: h */
        public /* synthetic */ void m38625h(int i11) {
            if (i11 == 601) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            }
            CameraPreviewController.this.m38566Q2(true);
        }

        /* renamed from: i */
        public /* synthetic */ void m38626i() {
            CameraPreviewController.this.getRecordButton().mo87626a(null);
            CameraPreviewController.this.m38540w2();
        }

        /* renamed from: j */
        public /* synthetic */ void m38627j() {
            CameraPreviewController.this.f40769f0 = false;
        }

        /* renamed from: k */
        public /* synthetic */ void m38628k(String str, boolean z11) {
            try {
                if (CameraPreviewController.this.f40796x0 == null && CameraPreviewController.this.f40725F0 != null) {
                    CameraPreviewController.this.f40725F0.mo38647g(str, z11, CameraPreviewController.this.f40778o0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }

        @Override // p714zf.AbstractC31817h.b
        /* renamed from: a */
        public void mo38629a(String str) {
            AbstractC20110a.m104535d("onStartRecording: outputPath= " + str + ", isRecordingVideo= " + CameraPreviewController.this.f40769f0, new Object[0]);
            if (str != null) {
                CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                if (cameraPreviewController.f40769f0) {
                    cameraPreviewController.f40761Y0 = true;
                    CameraPreviewController.this.f40758W = System.currentTimeMillis();
                    return;
                }
            }
            CameraPreviewController.this.m38514n2();
            if (str == null) {
                AbstractC20110a.m104535d("onStartRecording: outputPath is not available", new Object[0]);
            } else {
                AbstractC23041d2.m118208g(str);
            }
            if (CameraPreviewController.this.f40725F0 != null) {
                CameraPreviewController.this.f40725F0.mo38650j(true);
            }
            CameraPreviewController.this.f40778o0 = true;
            CameraPreviewController.this.f40750S.m39746B0();
            CameraPreviewController.this.f40743O0.post(new Runnable() { // from class: com.zing.zalo.camera.m2
                public /* synthetic */ RunnableC7678m2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.C7502f.this.m38626i();
                }
            });
        }

        @Override // p714zf.AbstractC31817h.b
        /* renamed from: b */
        public void mo38630b(int i11) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.camera.p2

                /* renamed from: q */
                public final /* synthetic */ int f41419q;

                public /* synthetic */ RunnableC7708p2(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.C7502f.this.m38625h(r2);
                }
            });
        }

        @Override // p714zf.AbstractC31817h.b
        /* renamed from: c */
        public void mo38631c(String str, boolean z11) {
            AbstractC20110a.m104535d("onStopRecording: outputPath= " + str + ", isRecordingVideo= " + CameraPreviewController.this.f40769f0 + ", isVideoRecordCancelled= " + CameraPreviewController.this.f40778o0, new Object[0]);
            CameraPreviewController cameraPreviewController = CameraPreviewController.this;
            if (!cameraPreviewController.f40769f0) {
                return;
            }
            cameraPreviewController.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.n2
                public /* synthetic */ RunnableC7696n2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.C7502f.this.m38627j();
                }
            }, CameraPreviewController.this.f40762Z0);
            CameraPreviewController.this.f40771h0 = str;
            CameraPreviewController.this.f40772i0 = z11;
            CameraPreviewController.this.f40743O0.post(new Runnable() { // from class: com.zing.zalo.camera.o2

                /* renamed from: q */
                public final /* synthetic */ String f41407q;

                /* renamed from: r */
                public final /* synthetic */ boolean f41408r;

                public /* synthetic */ RunnableC7702o2(String str2, boolean z112) {
                    r2 = str2;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.C7502f.this.m38628k(r2, r3);
                }
            });
            AbstractC23237v1.m119713a("record");
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$g */
    /* loaded from: classes3.dex */
    public class C7503g extends C23999j {
        C7503g() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                if (m18839c.getWidth() == 1 && m18839c.getHeight() == 1) {
                    CameraPreviewController.this.f40793w.setScaleType(ImageView.ScaleType.CENTER);
                }
                CameraPreviewController.this.f40793w.setImageInfo(c3979l, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$h */
    /* loaded from: classes3.dex */
    public class C7504h implements KeyboardFrameLayout.InterfaceC13508a {
        C7504h() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            if (CameraPreviewController.this.f40719C0) {
                CameraPreviewController.this.f40719C0 = false;
                if (!CameraPreviewController.this.f40748R.m39065nR() && !CameraPreviewController.this.f40748R.m39068oR()) {
                    CameraPreviewController.this.f40748R.m39017EP(0L);
                    CameraPreviewController.this.f40748R.m39067oQ().setPickerMiniY(0);
                }
                if (CameraPreviewController.this.f40748R.m39065nR()) {
                    CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                    cameraPreviewController.f40799z.setBorderColor(AbstractC23136l9.m118641B(cameraPreviewController.getContext(), AbstractC16801x.camera_background_picker_selected));
                }
                if (CameraPreviewController.this.f40748R.m39068oR() && !CameraPreviewController.this.f40721D0) {
                    CameraPreviewController.this.f40714A.setImageResource(AbstractC16803z.icn_social_story_emoji_active);
                }
                if (CameraPreviewController.this.f40721D0) {
                    CameraPreviewController.this.f40721D0 = false;
                }
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            boolean z11;
            boolean z12;
            int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
            if (CameraPreviewController.this.f40727G0 != i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m122007i5 != i11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!CameraPreviewController.this.f40719C0 || z11) {
                CameraPreviewController.this.f40727G0 = i11;
                CameraPreviewController.this.f40719C0 = true;
                if (z11) {
                    CameraPreviewController.this.f40748R.m39054jR(i11);
                    CameraPreviewController.this.f40748R.m39056kR(i11);
                }
                if ((z11 || (!CameraPreviewController.this.f40748R.m39065nR() && !CameraPreviewController.this.f40748R.m39068oR())) && !CameraPreviewController.this.f40748R.m39068oR()) {
                    CameraPreviewController.this.f40748R.m39025IP(i11);
                }
                if (CameraPreviewController.this.f40748R.m39065nR()) {
                    if (z12) {
                        CameraPreviewController.this.f40748R.m39025IP(i11);
                    }
                    CameraPreviewController.this.m38407E2(false, z12, new boolean[0]);
                }
                if (CameraPreviewController.this.f40748R.m39068oR()) {
                    CameraPreviewController.this.f40714A.setImageResource(AbstractC16803z.icn_social_story_emoji);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$i */
    /* loaded from: classes3.dex */
    public class C7505i extends WindowInsetsAnimation.Callback {

        /* renamed from: a */
        final /* synthetic */ KeyboardFrameLayout f40812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7505i(int i11, KeyboardFrameLayout keyboardFrameLayout) {
            super(i11);
            this.f40812a = keyboardFrameLayout;
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public WindowInsets onProgress(WindowInsets windowInsets, List list) {
            return windowInsets;
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
            this.f40812a.requestLayout();
            return super.onStart(windowInsetsAnimation, bounds);
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$j */
    /* loaded from: classes3.dex */
    public class C7506j extends AbstractC18391a {

        /* renamed from: p */
        CharSequence f40814p = "";

        C7506j() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CameraPreviewController.this.m38472b1(editable, this.f40814p);
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f40814p = new SpannableStringBuilder(charSequence);
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            CameraPreviewController.this.m38463Y2();
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$k */
    /* loaded from: classes3.dex */
    class RunnableC7507k implements Runnable {
        RunnableC7507k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (CameraPreviewController.this.f40731I0 == null) {
                    return;
                }
                float currentSizeDecor = CameraPreviewController.this.getCurrentSizeDecor();
                CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                if (cameraPreviewController.f40739M0) {
                    cameraPreviewController.f40739M0 = false;
                } else {
                    C28652r.m143349v().m143362X(CameraPreviewController.this.f40731I0, currentSizeDecor);
                    C0820h.f2880z = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$l */
    /* loaded from: classes3.dex */
    public class C7508l implements C0820h.a {
        C7508l() {
        }

        /* renamed from: c */
        public /* synthetic */ void m38633c(Editable editable, int i11, int i12) {
            try {
                if (CameraPreviewController.this.f40740N != null) {
                    CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                    int i13 = 1;
                    cameraPreviewController.f40739M0 = true;
                    cameraPreviewController.f40740N.setText(editable);
                    if (i11 != CameraPreviewController.this.getStatus().length() || AbstractC23309i.m121379Rd() != 1) {
                        i13 = 0;
                    }
                    CameraPreviewController.this.f40740N.setSelection(i12 + i13);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }

        @Override // ag0.C0820h.a
        /* renamed from: a */
        public void mo2144a(Editable editable, int i11, int i12) {
            CameraPreviewController.this.f40743O0.post(new Runnable() { // from class: com.zing.zalo.camera.q2

                /* renamed from: q */
                public final /* synthetic */ Editable f41512q;

                /* renamed from: r */
                public final /* synthetic */ int f41513r;

                /* renamed from: s */
                public final /* synthetic */ int f41514s;

                public /* synthetic */ RunnableC7720q2(Editable editable2, int i112, int i122) {
                    r2 = editable2;
                    r3 = i112;
                    r4 = i122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.C7508l.this.m38633c(r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$m */
    /* loaded from: classes3.dex */
    public class C7509m implements VideoModePicker.InterfaceC7755a {
        C7509m() {
        }

        @Override // com.zing.zalo.camera.videomodepicker.VideoModePicker.InterfaceC7755a
        /* renamed from: a */
        public void mo38634a(int i11) {
            try {
                if (CameraPreviewController.this.f40746Q.f41129s == 7) {
                    String str = "";
                    if (i11 == 1) {
                        str = "49150061";
                    } else if (i11 == 2) {
                        str = "49150068";
                    } else if (i11 == 3) {
                        str = "49150069";
                    } else if (i11 == 4) {
                        str = "49150070";
                    }
                    AbstractC23647d.m123897g(str);
                }
                CameraPreviewController.this.m38563O0(i11, true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraPreviewController", e11);
            }
        }

        @Override // com.zing.zalo.camera.videomodepicker.VideoModePicker.InterfaceC7755a
        /* renamed from: b */
        public boolean mo38635b() {
            if (CameraPreviewController.this.f40748R != null && CameraPreviewController.this.f40748R.f40897l1 == 2) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.camera.videomodepicker.VideoModePicker.InterfaceC7755a
        /* renamed from: c */
        public boolean mo38636c() {
            if (CameraPreviewController.this.f40748R != null && CameraPreviewController.this.f40748R.m39009BR()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.camera.videomodepicker.VideoModePicker.InterfaceC7755a
        /* renamed from: d */
        public boolean mo38637d() {
            return CameraPreviewController.this.f40769f0;
        }

        @Override // com.zing.zalo.camera.videomodepicker.VideoModePicker.InterfaceC7755a
        /* renamed from: e */
        public int mo38638e() {
            return CameraPreviewController.this.f40748R.m83785iM();
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$n */
    /* loaded from: classes3.dex */
    class HandlerC7510n extends Handler {
        HandlerC7510n(Looper looper) {
            super(looper);
        }

        /* renamed from: b */
        public static /* synthetic */ void m38640b(AnimationDrawable animationDrawable) {
            if (animationDrawable != null) {
                animationDrawable.start();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11;
            RecordButton recordButton = CameraPreviewController.this.getRecordButton();
            int i12 = message.what;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 3) {
                        if (i12 == 7) {
                            try {
                                if (message.arg1 == 1) {
                                    if (CameraPreviewController.this.f40726G == null) {
                                        CameraPreviewController.this.f40726G = new RobotoTextView(CameraPreviewController.this.getContext());
                                        CameraPreviewController.this.f40726G.setBackgroundColor(0);
                                        CameraPreviewController.this.f40726G.setCompoundDrawablesWithIntrinsicBounds(0, AbstractC16803z.ic_camera_facedetect, 0, 0);
                                        CameraPreviewController.this.f40726G.setCompoundDrawablePadding(AbstractC23222t7.f112572m);
                                        CameraPreviewController.this.f40726G.setGravity(17);
                                        CameraPreviewController.this.f40726G.setTextColor(AbstractC23136l9.m118641B(CameraPreviewController.this.getContext(), AbstractC16801x.white));
                                        CameraPreviewController.this.f40726G.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.SmallTextSize));
                                        CameraPreviewController.this.f40726G.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_camera_face_detect_text));
                                        CameraPreviewController.this.f40726G.setShadowLayer(2.0f, 0.0f, 1.0f, AbstractC23136l9.m118641B(CameraPreviewController.this.getContext(), AbstractC16801x.black_a7));
                                        CameraPreviewController.this.f40726G.setVisibility(8);
                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                        layoutParams.addRule(14);
                                        layoutParams.addRule(15);
                                        CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                                        cameraPreviewController.addView(cameraPreviewController.f40726G, layoutParams);
                                    }
                                    if (CameraPreviewController.this.f40726G != null) {
                                        CameraPreviewController.this.f40726G.setVisibility(0);
                                        CameraPreviewController.this.f40726G.startAnimation(AnimationUtils.loadAnimation(CameraPreviewController.this.getContext(), AbstractC10919t.fadein));
                                        CameraPreviewController.this.f40743O0.post(new Runnable() { // from class: com.zing.zalo.camera.r2

                                            /* renamed from: p */
                                            public final /* synthetic */ AnimationDrawable f41526p;

                                            public /* synthetic */ RunnableC7726r2(AnimationDrawable animationDrawable) {
                                                r1 = animationDrawable;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                CameraPreviewController.HandlerC7510n.m38640b(r1);
                                            }
                                        });
                                    }
                                } else if (CameraPreviewController.this.f40726G != null) {
                                    if (CameraPreviewController.this.f40726G.getVisibility() == 8) {
                                        return;
                                    }
                                    AnimationDrawable animationDrawable = (AnimationDrawable) CameraPreviewController.this.f40726G.getCompoundDrawables()[0];
                                    if (animationDrawable != null) {
                                        animationDrawable.stop();
                                        animationDrawable.selectDrawable(0);
                                    }
                                    CameraPreviewController.this.f40726G.setVisibility(8);
                                }
                            } catch (Exception e11) {
                                AbstractC23350e.m122776f("CameraPreviewController", e11);
                            }
                            CameraPreviewController.this.f40773j0 = true;
                            return;
                        }
                        return;
                    }
                    if (!CameraPreviewController.this.f40769f0) {
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis() - CameraPreviewController.this.f40756V;
                    if (CameraPreviewController.this.f40724F != null) {
                        CameraPreviewController.this.f40724F.setText(AbstractC23160o0.m119184B0(currentTimeMillis));
                    }
                    if (currentTimeMillis >= CameraPreviewController.this.m38577Y0(false)) {
                        CameraPreviewController.this.f40743O0.sendEmptyMessage(1);
                        return;
                    } else {
                        CameraPreviewController.this.f40743O0.sendEmptyMessageDelayed(3, 100L);
                        return;
                    }
                }
                if (AbstractC22470k.m116158j(CameraPreviewController.this.f40746Q.f41129s, 2)) {
                    CameraPreviewController.this.m38566Q2(false);
                    return;
                } else {
                    if (!CameraPreviewController.this.f40794w0) {
                        CameraPreviewController.this.m38516o2();
                        recordButton.setEnabled(false);
                        CameraPreviewController.this.m38566Q2(false);
                        return;
                    }
                    recordButton.dispatchTouchEvent(CameraPreviewController.this.f40768e0);
                    return;
                }
            }
            if (!C20024r.m103941j()) {
                CameraPreviewController.this.f40756V = 0L;
                CameraPreviewController.this.f40758W = 0L;
                AbstractC23237v1.m119714b("capture", "long press recording");
                if (message.what == 0) {
                    if (CameraPreviewController.this.f40774k0 == 4) {
                        recordButton.f83008q = 1500;
                        recordButton.f83009r = 0;
                    } else {
                        if (CameraPreviewController.this.f40774k0 != 2) {
                            i11 = CameraPreviewController.this.f40765b0;
                        } else {
                            i11 = CameraPreviewController.this.f40763a0;
                        }
                        recordButton.f83008q = i11;
                        recordButton.f83009r = CameraPreviewController.this.f40766c0;
                    }
                }
                CameraPreviewController.this.m38440P2();
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_can_not_record_video_in_call));
            CameraPreviewController.this.m38572V0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraPreviewController$o */
    /* loaded from: classes3.dex */
    public class ViewOnTouchListenerC7511o implements View.OnTouchListener {

        /* renamed from: com.zing.zalo.camera.CameraPreviewController$o$a */
        /* loaded from: classes3.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CameraPreviewController.this.m38433N0();
            }
        }

        /* renamed from: com.zing.zalo.camera.CameraPreviewController$o$b */
        /* loaded from: classes3.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CameraPreviewController.this.m38574W0();
                CameraPreviewController.this.m38433N0();
            }
        }

        ViewOnTouchListenerC7511o() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:            if (r1 != 6) goto L151;     */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (CameraPreviewController.this.f40748R != null && (CameraPreviewController.this.f40748R.f40837C1 || !CameraPreviewController.this.f40748R.f40833A1)) {
                return false;
            }
            RecordButton recordButton = CameraPreviewController.this.getRecordButton();
            int action = motionEvent.getAction();
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            if (CameraPreviewController.this.f40794w0 && CameraPreviewController.this.f40792v0 == motionEvent.getPointerId(0)) {
                                recordButton.m87638g(false);
                                CameraPreviewController.this.m38516o2();
                                if (recordButton.f83010s) {
                                    CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                                    if (cameraPreviewController.f40769f0) {
                                        cameraPreviewController.m38566Q2(true);
                                    }
                                }
                                recordButton.mo87626a(null);
                                CameraPreviewController.this.f40792v0 = -1;
                                CameraPreviewController.this.f40794w0 = false;
                                CameraPreviewController cameraPreviewController2 = CameraPreviewController.this;
                                cameraPreviewController2.f40784r0 = false;
                                cameraPreviewController2.m38574W0();
                                return true;
                            }
                        }
                    } else if (CameraPreviewController.this.f40750S.getEventListener() != null && y11 <= recordButton.getY()) {
                        CameraPreviewController.this.f40750S.getEventListener().mo39117d(y11, false);
                    }
                }
                if (CameraPreviewController.this.f40794w0 && CameraPreviewController.this.f40792v0 == motionEvent.getPointerId(0)) {
                    if (!recordButton.f83010s) {
                        CameraPreviewController.this.m38516o2();
                        recordButton.mo87626a(new b());
                    } else {
                        CameraPreviewController cameraPreviewController3 = CameraPreviewController.this;
                        if (cameraPreviewController3.f40769f0) {
                            cameraPreviewController3.m38516o2();
                            recordButton.setEnabled(false);
                            CameraPreviewController.this.m38566Q2(false);
                        } else if (!cameraPreviewController3.m38546y1()) {
                            CameraPreviewController.this.m38516o2();
                            CameraPreviewController.this.m38574W0();
                            recordButton.mo87626a(new a());
                        }
                    }
                    CameraPreviewController.this.f40792v0 = -1;
                    CameraPreviewController.this.f40794w0 = false;
                    return true;
                }
            } else {
                AbstractC23237v1.m119715c("capture");
                if (recordButton.m87636e(x11, y11)) {
                    CameraPreviewController cameraPreviewController4 = CameraPreviewController.this;
                    if (!cameraPreviewController4.f40769f0 && !cameraPreviewController4.f40794w0 && !recordButton.m87637f()) {
                        CameraPreviewController cameraPreviewController5 = CameraPreviewController.this;
                        if (!cameraPreviewController5.f40780p0 && cameraPreviewController5.m38543x1()) {
                            CameraPreviewController cameraPreviewController6 = CameraPreviewController.this;
                            if (!cameraPreviewController6.f40784r0) {
                                cameraPreviewController6.f40792v0 = motionEvent.getPointerId(0);
                                CameraPreviewController.this.f40794w0 = true;
                                CameraPreviewController cameraPreviewController7 = CameraPreviewController.this;
                                cameraPreviewController7.f40784r0 = true;
                                cameraPreviewController7.f40725F0.mo38645e(true, false);
                                CameraPreviewController.this.m38569T0();
                                if (CameraPreviewController.this.m38492g1() && recordButton.f83010s) {
                                    CameraPreviewController.this.f40768e0 = MotionEvent.obtain(motionEvent);
                                    CameraPreviewController.this.f40768e0.setAction(1);
                                    recordButton.mo87627b(true);
                                    CameraPreviewController.this.f40743O0.removeCallbacksAndMessages(null);
                                    CameraPreviewController.this.f40743O0.sendEmptyMessageDelayed(0, 300L);
                                } else {
                                    recordButton.mo87627b(false);
                                }
                                if (CameraPreviewController.this.f40750S.getEventListener() != null) {
                                    CameraPreviewController.this.f40750S.getEventListener().mo39117d(-1.0f, true);
                                }
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$p */
    /* loaded from: classes3.dex */
    class ViewOnTouchListenerC7512p implements View.OnTouchListener {
        ViewOnTouchListenerC7512p() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:            if (r1 != 6) goto L117;     */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (CameraPreviewController.this.f40748R != null && (CameraPreviewController.this.f40748R.f40837C1 || !CameraPreviewController.this.f40748R.f40833A1)) {
                return false;
            }
            RecordButton recordButton = CameraPreviewController.this.getRecordButton();
            int action = motionEvent.getAction();
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        if (CameraPreviewController.this.f40794w0 && CameraPreviewController.this.f40792v0 == motionEvent.getPointerId(0)) {
                            recordButton.m87638g(false);
                            CameraPreviewController.this.m38516o2();
                            if (recordButton.f83010s) {
                                CameraPreviewController cameraPreviewController = CameraPreviewController.this;
                                if (cameraPreviewController.f40769f0) {
                                    cameraPreviewController.m38566Q2(true);
                                }
                            }
                            recordButton.mo87626a(null);
                            CameraPreviewController.this.f40792v0 = -1;
                            CameraPreviewController.this.f40794w0 = false;
                            CameraPreviewController cameraPreviewController2 = CameraPreviewController.this;
                            cameraPreviewController2.f40786s0 = false;
                            cameraPreviewController2.m38574W0();
                            return true;
                        }
                    }
                }
                if (CameraPreviewController.this.f40794w0 && CameraPreviewController.this.f40792v0 == motionEvent.getPointerId(0)) {
                    recordButton.m87638g(false);
                    if (!recordButton.f83010s) {
                        CameraPreviewController.this.m38516o2();
                        recordButton.mo87626a(null);
                    } else {
                        CameraPreviewController cameraPreviewController3 = CameraPreviewController.this;
                        if (cameraPreviewController3.f40769f0) {
                            cameraPreviewController3.m38516o2();
                            recordButton.setEnabled(false);
                            CameraPreviewController.this.m38566Q2(false);
                        } else {
                            cameraPreviewController3.f40768e0 = MotionEvent.obtain(motionEvent);
                            CameraPreviewController.this.f40768e0.setAction(1);
                            recordButton.mo87627b(true);
                            CameraPreviewController.this.f40743O0.removeCallbacksAndMessages(null);
                            CameraPreviewController.this.f40743O0.sendEmptyMessage(0);
                        }
                    }
                    CameraPreviewController.this.f40792v0 = -1;
                    CameraPreviewController.this.f40794w0 = false;
                    CameraPreviewController.this.f40786s0 = false;
                    return true;
                }
            } else {
                AbstractC23237v1.m119715c("capture");
                if (recordButton.m87636e(x11, y11) && !CameraPreviewController.this.f40794w0 && !recordButton.m87637f()) {
                    CameraPreviewController cameraPreviewController4 = CameraPreviewController.this;
                    if (!cameraPreviewController4.f40780p0 && cameraPreviewController4.m38543x1()) {
                        CameraPreviewController cameraPreviewController5 = CameraPreviewController.this;
                        if (!cameraPreviewController5.f40786s0 || cameraPreviewController5.f40769f0) {
                            cameraPreviewController5.f40792v0 = motionEvent.getPointerId(0);
                            CameraPreviewController.this.f40794w0 = true;
                            CameraPreviewController cameraPreviewController6 = CameraPreviewController.this;
                            cameraPreviewController6.f40786s0 = true;
                            cameraPreviewController6.f40725F0.mo38645e(true, false);
                            CameraPreviewController.this.m38569T0();
                            recordButton.m87638g(true);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraPreviewController$q */
    /* loaded from: classes3.dex */
    public interface InterfaceC7513q {
        /* renamed from: a */
        void mo38641a(boolean z11);

        /* renamed from: b */
        void mo38642b(C32123ta c32123ta);

        /* renamed from: c */
        void mo38643c(byte[] bArr, int i11);

        /* renamed from: d */
        void mo38644d(View view);

        /* renamed from: e */
        void mo38645e(boolean z11, boolean z12);

        /* renamed from: f */
        void mo38646f();

        /* renamed from: g */
        void mo38647g(String str, boolean z11, boolean z12);

        /* renamed from: h */
        void mo38648h(boolean z11, boolean z12);

        /* renamed from: i */
        void mo38649i(boolean z11);

        /* renamed from: j */
        void mo38650j(boolean z11);
    }

    static {
        int i11;
        if (AbstractC23136l9.m118654H0(MainApplication.getAppContext())) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        f40713b1 = i11;
    }

    public CameraPreviewController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40785s = new Rect(0, 0, 0, 0);
        this.f40732J = null;
        this.f40738M = null;
        this.f40742O = UpdateStatusView.EnumC15265l0.STATE_MAX_SIZE;
        this.f40746Q = CameraInputParams.m39203m();
        this.f40756V = 0L;
        this.f40758W = 0L;
        this.f40763a0 = 10000;
        this.f40765b0 = 10000;
        this.f40766c0 = 3000;
        this.f40769f0 = false;
        this.f40771h0 = null;
        this.f40772i0 = false;
        this.f40773j0 = true;
        this.f40774k0 = 2;
        this.f40776m0 = false;
        this.f40777n0 = true;
        this.f40778o0 = false;
        this.f40780p0 = false;
        this.f40782q0 = false;
        this.f40784r0 = false;
        this.f40786s0 = false;
        this.f40788t0 = 0;
        this.f40790u0 = 0;
        this.f40792v0 = -1;
        this.f40794w0 = false;
        this.f40796x0 = null;
        this.f40798y0 = false;
        this.f40800z0 = false;
        this.f40715A0 = false;
        this.f40717B0 = false;
        this.f40719C0 = false;
        this.f40721D0 = false;
        this.f40727G0 = 0;
        this.f40733J0 = new RunnableC7507k();
        this.f40741N0 = new C7508l();
        this.f40743O0 = new HandlerC7510n(Looper.getMainLooper());
        this.f40745P0 = new ViewOnTouchListenerC7511o();
        this.f40747Q0 = new ViewOnTouchListenerC7512p();
        this.f40759W0 = new C7500d();
        this.f40760X0 = new C7501e();
        this.f40761Y0 = false;
        this.f40762Z0 = 500L;
        this.f40764a1 = new C7502f();
    }

    /* renamed from: A1 */
    public /* synthetic */ void m38393A1(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f40730I) {
            this.f40730I = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: B1 */
    public /* synthetic */ void m38396B1() {
        this.f40736L = C31845ac.m152996J().m153073y(C31845ac.m152996J().m153032K());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(1:3)(2:32|(1:34)(8:35|5|6|7|(3:14|15|(2:17|(1:19)(1:21)))|(1:10)|11|12))|4|5|6|7|(0)|(0)|11|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:            r10 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:            mm0.AbstractC23350e.m122776f("CameraPreviewController", r10);     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d2 A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #2 {all -> 0x00ce, blocks: (B:7:0x0077, B:10:0x00d2, B:25:0x00cd, B:28:0x00ca, B:15:0x008a, B:17:0x0090, B:19:0x00ad, B:24:0x00c5), top: B:6:0x0077, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: C1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m38399C1(int i11) {
        String str;
        String str2;
        Cursor m120358v0;
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String str3 = "(media_type = 3 AND  (LOWER(_display_name) LIKE '%.mp4' OR LOWER(_display_name) LIKE '%.3gp') AND " + ("duration >= " + C18826a.f94116b) + ")";
        String str4 = null;
        if (i11 == 7) {
            str2 = "(((media_type = 1 AND mime_type not in ('image/gif')) OR " + str3 + ") AND _size >= 0)";
        } else if (i11 == 9) {
            str2 = "(" + str3 + " AND _size >= 0)";
        } else {
            str = null;
            m120358v0 = AbstractC23280z4.m120358v0(contentUri, null, str, null, "date_added DESC ", 1, new SensitiveData("gallery_get_last_media_thumb", "camera"));
            if (m120358v0 != null) {
                try {
                    if (m120358v0.moveToFirst()) {
                        int columnIndex = m120358v0.getColumnIndex("_id");
                        int columnIndex2 = m120358v0.getColumnIndex("media_type");
                        String m120357v = AbstractC23280z4.m120357v(m120358v0, contentUri, columnIndex, m120358v0.getColumnIndex("_data"));
                        if (m120358v0.getInt(columnIndex2) == 3) {
                            VideoItem videoItem = new VideoItem();
                            videoItem.mo41080F0(m120358v0.getLong(columnIndex));
                            videoItem.mo41082W0(m120357v);
                            str4 = AbstractC23280z4.m120364z(videoItem);
                        } else {
                            str4 = m120357v;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        m120358v0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (m120358v0 != null) {
                m120358v0.close();
            }
            m38482d2(str4);
        }
        str = str2;
        m120358v0 = AbstractC23280z4.m120358v0(contentUri, null, str, null, "date_added DESC ", 1, new SensitiveData("gallery_get_last_media_thumb", "camera"));
        if (m120358v0 != null) {
        }
        if (m120358v0 != null) {
        }
        m38482d2(str4);
    }

    /* renamed from: D1 */
    public /* synthetic */ WindowInsets m38402D1(KeyboardFrameLayout keyboardFrameLayout, View view, WindowInsets windowInsets) {
        WindowInsets rootWindowInsets;
        int ime;
        boolean isVisible;
        rootWindowInsets = getRootWindowInsets();
        if (rootWindowInsets != null) {
            ime = WindowInsets.Type.ime();
            isVisible = rootWindowInsets.isVisible(ime);
            if (isVisible != this.f40719C0) {
                keyboardFrameLayout.requestLayout();
            }
        }
        return windowInsets;
    }

    /* renamed from: D2 */
    private void m38403D2() {
        float f11;
        if (this.f40757V0 == null) {
            this.f40757V0 = (FrameLayout) ((ViewStub) findViewById(AbstractC6918a0.bg_guideline_scanner)).inflate();
        }
        this.f40757V0.setVisibility(0);
        RobotoTextView robotoTextView = (RobotoTextView) this.f40757V0.findViewById(AbstractC6918a0.text_guideline_document_scan);
        if (robotoTextView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) robotoTextView.getLayoutParams();
            if (m38502k1()) {
                f11 = 40.0f;
            } else {
                f11 = 140.0f;
            }
            layoutParams.bottomMargin = AbstractC23136l9.m118742r(f11);
        }
        DocumentScanGuidelineView documentScanGuidelineView = (DocumentScanGuidelineView) this.f40757V0.findViewById(AbstractC6918a0.guide_crop_polygon);
        if (documentScanGuidelineView != null) {
            documentScanGuidelineView.invalidate();
        }
        AbstractC23202r9.m119539g(this.f40757V0, 200L, null);
    }

    /* renamed from: E1 */
    public /* synthetic */ void m38406E1(int i11) {
        if (this.f40781q.isShown()) {
            this.f40781q.setDefaultMode(i11);
        }
    }

    /* renamed from: E2 */
    public void m38407E2(boolean z11, boolean z12, boolean... zArr) {
        this.f40748R.m39036TT(z11, z12, zArr);
    }

    /* renamed from: F1 */
    public /* synthetic */ void m38410F1() {
        this.f40715A0 = false;
    }

    /* renamed from: G1 */
    public /* synthetic */ void m38412G1() {
        this.f40717B0 = false;
    }

    /* renamed from: H0 */
    private void m38414H0() {
        if (this.f40793w == null) {
            return;
        }
        int m155331a = AbstractC32212c.m155331a(this.f40748R.m92648SI());
        boolean m116126a = AbstractC22463d.m116126a(getContext(), m155331a);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40793w.getLayoutParams();
        int i11 = AbstractC23222t7.f112586t;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        if (!m116126a) {
            i11 = AbstractC23222t7.f112543V;
        }
        layoutParams.bottomMargin = i11;
        int i12 = 11;
        layoutParams.addRule(11, 0);
        layoutParams.addRule(9, 0);
        if (m116126a && m155331a != 90) {
            i12 = 9;
        }
        layoutParams.addRule(i12, 1);
        this.f40793w.setLayoutParams(layoutParams);
    }

    /* renamed from: H1 */
    public /* synthetic */ void m38415H1() {
        this.f40800z0 = false;
    }

    /* renamed from: H2 */
    private void m38416H2(boolean z11, boolean z12, boolean... zArr) {
        this.f40748R.m39037UT(z11, z12, zArr);
    }

    /* renamed from: I0 */
    private void m38418I0() {
        int i11;
        int i12;
        int m155331a = AbstractC32212c.m155331a(this.f40748R.m92648SI());
        if (AbstractC22463d.m116126a(getContext(), m155331a)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f40716B.getLayoutParams();
            int i13 = 3;
            if (m155331a == 90) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            layoutParams.gravity = i12;
            layoutParams.bottomMargin = 0;
            this.f40716B.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f40718C.getLayoutParams();
            if (m155331a == 90) {
                i13 = 5;
            }
            layoutParams2.gravity = i13;
            layoutParams2.bottomMargin = 0;
            this.f40718C.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f40779p.getLayoutParams();
            layoutParams3.addRule(12, 0);
            layoutParams3.addRule(13);
            this.f40779p.setLayoutParams(layoutParams3);
            return;
        }
        if (m38495h1()) {
            i11 = AbstractC23136l9.m118742r(-10.0f);
        } else {
            i11 = AbstractC23222t7.f112576o;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f40716B.getLayoutParams();
        layoutParams4.gravity = 17;
        layoutParams4.bottomMargin = i11;
        this.f40716B.setLayoutParams(layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f40718C.getLayoutParams();
        layoutParams5.gravity = 17;
        layoutParams5.bottomMargin = i11;
        this.f40718C.setLayoutParams(layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f40779p.getLayoutParams();
        layoutParams6.addRule(13, 0);
        layoutParams6.addRule(12);
        this.f40779p.setLayoutParams(layoutParams6);
    }

    /* renamed from: I1 */
    public /* synthetic */ void m38419I1() {
        int i11;
        ImageButton imageButton = this.f40787t;
        if (m38513n1()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(imageButton, i11);
        InterfaceC7513q interfaceC7513q = this.f40725F0;
        if (interfaceC7513q != null) {
            interfaceC7513q.mo38646f();
        }
    }

    /* renamed from: I2 */
    private void m38420I2(boolean z11) {
        this.f40748R.m39038VT(z11, new int[0]);
    }

    /* renamed from: J0 */
    private void m38422J0(int i11) {
        TextView textView = this.f40726G;
        if (textView != null && textView.getVisibility() == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40726G.getLayoutParams();
            if (i11 == 2) {
                layoutParams.addRule(12, 0);
                layoutParams.bottomMargin = 0;
                layoutParams.addRule(15);
            } else {
                layoutParams.addRule(15, 0);
                layoutParams.addRule(12);
                if (this.f40748R.m39074sQ() != null) {
                    layoutParams.addRule(12);
                    layoutParams.bottomMargin = (int) ((AbstractC23136l9.m118713h0() - this.f40748R.m39074sQ().getY()) + AbstractC23222t7.f112572m);
                } else {
                    layoutParams.addRule(15);
                }
            }
            this.f40726G.setLayoutParams(layoutParams);
        }
        if (this.f40726G != null) {
            m38552B2(false);
            AbstractC23136l9.m118744r1(this.f40726G, 8);
        }
    }

    /* renamed from: J1 */
    public /* synthetic */ void m38423J1(String str) {
        ((C23528a) this.f40744P.m123612r(this.f40793w)).m123579C(str, C23278z2.m120143n(), new C7503g().m125773e3(true));
    }

    /* renamed from: J2 */
    private void m38424J2(boolean z11) {
        this.f40748R.m39041XT(z11, new int[0]);
    }

    /* renamed from: K1 */
    public /* synthetic */ void m38426K1() {
        this.f40800z0 = false;
    }

    /* renamed from: K2 */
    public void m38427K2(int i11) {
        AbstractC23136l9.m118744r1(this.f40791v, i11);
    }

    /* renamed from: L1 */
    public /* synthetic */ void m38429L1(JSONObject jSONObject) {
        try {
            VideoModePicker videoModePicker = this.f40781q;
            if (videoModePicker != null) {
                videoModePicker.m39504m(this.f40774k0);
                String optString = jSONObject.optString("bg_status_text");
                String optString2 = jSONObject.optString("bg_status_selected_typo");
                if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2)) {
                    return;
                }
                this.f40738M = new C31890dc(new JSONObject(optString2));
                if (this.f40740N == null) {
                    m38485e1();
                }
                this.f40740N.setText(optString);
                this.f40740N.setSelection(optString.length());
                if (!m38594s1()) {
                    this.f40748R.m39042YT(false);
                    this.f40748R.m39013CT(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black));
                    AbstractC23136l9.m118744r1(this.f40720D, 8);
                    FeedBackgroundView feedBackgroundView = this.f40734K;
                    if (feedBackgroundView != null && feedBackgroundView.getVisibility() == 0) {
                        m38407E2(false, true, true);
                    }
                    AbstractC23136l9.m118744r1(this.f40734K, 8);
                    AbstractC23136l9.m118744r1(this.f40714A, 8);
                    AbstractC23136l9.m118744r1(this.f40799z, 8);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: M1 */
    public /* synthetic */ void m38431M1(Rect rect) {
        try {
            if (this.f40752T.mo147370a() == 0) {
                this.f40783r.m39193d(true, rect);
                this.f40752T.mo147371b(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N0 */
    public void m38433N0() {
        try {
            if (this.f40746Q.f41091J || !this.f40716B.isEnabled()) {
                return;
            }
            m38420I2(false);
            m38424J2(false);
            m38572V0(false);
            if (this.f40752T != null) {
                boolean m39769a0 = this.f40750S.m39769a0();
                if (this.f40752T.mo147377h()) {
                    if (m39769a0) {
                        m38536v2("120N042");
                    } else {
                        m38536v2("120N041");
                    }
                } else if (m39769a0) {
                    m38536v2("120N044");
                } else {
                    m38536v2("120N043");
                }
                this.f40752T.mo147373d(C26694o.f126496e);
            }
            m38568S0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: N1 */
    public /* synthetic */ void m38434N1(Rect rect) {
        if (this.f40748R.m92676n2() != null && this.f40752T != null) {
            this.f40748R.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.w1

                /* renamed from: q */
                public final /* synthetic */ Rect f41781q;

                public /* synthetic */ RunnableC7790w1(Rect rect2) {
                    r2 = rect2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.this.m38431M1(r2);
                }
            });
        }
    }

    /* renamed from: O1 */
    public /* synthetic */ void m38436O1(int i11, int i12, String str, C31890dc c31890dc) {
        try {
            if (i12 == 0 && c31890dc != null) {
                if (i11 == -2) {
                    C31890dc c31890dc2 = new C31890dc(new JSONObject(c31890dc.m153253y()));
                    c31890dc2.f146509o = i11;
                    c31890dc = c31890dc2;
                }
                m38591p2(c31890dc);
                return;
            }
            m38591p2(C31845ac.m152996J().m153020A());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: O2 */
    private void m38437O2(Runnable runnable) {
        ZaloCameraView zaloCameraView = this.f40748R;
        if (zaloCameraView != null) {
            zaloCameraView.m39044aU(runnable);
        }
    }

    /* renamed from: P1 */
    public /* synthetic */ void m38439P1(InterfaceC17463d interfaceC17463d, int i11) {
        C22052u.m115085y().m115093W();
        m38479c3();
        interfaceC17463d.dismiss();
    }

    /* renamed from: P2 */
    public void m38440P2() {
        try {
            if (this.f40724F == null) {
                RobotoTextView robotoTextView = new RobotoTextView(getContext());
                this.f40724F = robotoTextView;
                robotoTextView.setBackgroundResource(AbstractC16803z.bg_video_record_duration);
                this.f40724F.setCompoundDrawablesWithIntrinsicBounds(AbstractC16803z.recording_icon_animation, 0, 0, 0);
                this.f40724F.setCompoundDrawablePadding(AbstractC23222t7.f112558f);
                this.f40724F.setGravity(17);
                this.f40724F.setPadding(AbstractC23222t7.f112572m, AbstractC23222t7.f112554d, AbstractC23222t7.f112572m, AbstractC23222t7.f112554d);
                this.f40724F.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
                this.f40724F.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.LargeTextSize));
                this.f40724F.setText("00:00");
                this.f40724F.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(14);
                layoutParams.topMargin = AbstractC23222t7.f112572m;
                if (this.f40746Q.f41129s == 7 && this.f40777n0) {
                    layoutParams.addRule(3, AbstractC6918a0.top_insets_anchor);
                }
                m38560M0();
                addView(this.f40724F, layoutParams);
            }
            this.f40748R.m39082wS();
            if (!this.f40769f0) {
                AbstractC23237v1.m119715c("record");
                AbstractC23059e9.m118319H(this.f40748R.m92676n2(), true);
                InterfaceC29634a interfaceC29634a = this.f40752T;
                if (interfaceC29634a != null) {
                    if (interfaceC29634a.mo147376g() && this.f40790u0 != 0) {
                        this.f40752T.mo147372c(3);
                    }
                    this.f40752T.mo147381l(true);
                }
                this.f40769f0 = true;
                this.f40778o0 = false;
                this.f40771h0 = null;
                this.f40772i0 = false;
                InterfaceC7513q interfaceC7513q = this.f40725F0;
                if (interfaceC7513q != null) {
                    interfaceC7513q.mo38645e(true, true);
                    this.f40767d0 = this.f40750S.m39745A0(getVideoRecordOutputPathTemp(), this.f40748R.f40899m1, C23046d7.m118248k(m38455V1(), "micro"));
                    RecordButton recordButton = getRecordButton();
                    if (recordButton != null && recordButton.getParent() != null) {
                        recordButton.mo87628h(null);
                    }
                    TextView textView = this.f40724F;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.f40724F.startAnimation(AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fadein));
                        this.f40743O0.post(new Runnable() { // from class: com.zing.zalo.camera.o1

                            /* renamed from: p */
                            public final /* synthetic */ AnimationDrawable f41405p;

                            public /* synthetic */ RunnableC7701o1(AnimationDrawable animationDrawable) {
                                r1 = animationDrawable;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraPreviewController.m38444R1(r1);
                            }
                        });
                        AbstractC32226c.b bVar = this.f40755U0;
                        if (bVar != null) {
                            this.f40748R.m92684qK(bVar, false);
                        }
                    }
                    m38427K2(8);
                    m38559L2(8);
                    m38554F2(8);
                    m38556G2(8);
                    m38420I2(false);
                    m38424J2(false);
                    m38562N2(true);
                    this.f40756V = System.currentTimeMillis();
                    this.f40743O0.sendEmptyMessageDelayed(3, 100L);
                }
            }
        } catch (Resources.NotFoundException e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        } catch (SensitiveDataException unused) {
            m38516o2();
            m38566Q2(true);
            C23046d7.m118241d(getContext()).mo13822K();
        }
    }

    /* renamed from: R1 */
    public static /* synthetic */ void m38444R1(AnimationDrawable animationDrawable) {
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    /* renamed from: R2 */
    private void m38445R2() {
        AbstractC23237v1.m119715c("switchCamera");
        int m147475Q = C29667y.m147458p().m147475Q();
        AbstractC23237v1.m119714b("switchCamera", "end switchCameraId");
        if (m147475Q == -1) {
            AbstractC23237v1.m119713a("switchCamera");
            return;
        }
        C29667y.m147458p().m147474O();
        if (this.f40783r != null) {
            m38572V0(false);
            m38568S0();
        }
        ZaloCameraView zaloCameraView = this.f40748R;
        if (zaloCameraView != null) {
            zaloCameraView.m39023HT(false);
        }
        AbstractC27985d.m140989f(this.f40750S, new C27989h.a() { // from class: com.zing.zalo.camera.y1

            /* renamed from: b */
            public final /* synthetic */ int f41804b;

            public /* synthetic */ C7802y1(int m147475Q2) {
                r2 = m147475Q2;
            }

            @Override // ve.C27989h.a
            /* renamed from: a */
            public final void mo39367a(Bitmap bitmap) {
                CameraPreviewController.this.m38450T1(r2, bitmap);
            }
        });
    }

    /* renamed from: S1 */
    public /* synthetic */ void m38447S1(int i11) {
        int i12;
        this.f40788t0 = i11;
        this.f40750S.m39789w0(i11, this, this.f40759W0, this.f40723E0);
        this.f40780p0 = true;
        this.f40754U.m147508v(this.f40788t0);
        AbstractC23237v1.m119714b("switchCamera", "end setLastCameraIdOnCameraView");
        ImageButton imageButton = this.f40787t;
        if (m38513n1()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        AbstractC23136l9.m118744r1(imageButton, i12);
    }

    /* renamed from: S2 */
    private void m38448S2(String str, CharSequence charSequence) {
        String property;
        try {
            boolean m38535v1 = m38535v1(str);
            boolean m38539w1 = m38539w1(str);
            this.f40737L0 = true;
            if (!m38535v1) {
                m38506l2(charSequence);
            } else if (!m38539w1 && (property = System.getProperty("line.separator")) != null) {
                m38506l2(str.substring(0, str.lastIndexOf(property)));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: T1 */
    public /* synthetic */ void m38450T1(int i11, Bitmap bitmap) {
        AbstractC23237v1.m119714b("switchCamera", "end getScreenBitmapAsync");
        if (bitmap != null) {
            this.f40748R.m39079vS("", "", bitmap);
        }
        AbstractC23237v1.m119714b("switchCamera", "end loadImageOverlayPlaceHolder");
        m38437O2(new Runnable() { // from class: com.zing.zalo.camera.u1

            /* renamed from: q */
            public final /* synthetic */ int f41580q;

            public /* synthetic */ RunnableC7745u1(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraPreviewController.this.m38447S1(r2);
            }
        });
    }

    /* renamed from: T2 */
    public void m38451T2() {
        if (this.f40748R != null && !AbstractC22470k.m116158j(this.f40746Q.f41129s, 7)) {
            this.f40748R.m39076tU();
        }
    }

    /* renamed from: U2 */
    private void m38453U2() {
        if (!AbstractC22470k.m116158j(this.f40746Q.f41129s, 7)) {
            this.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.s1
                public /* synthetic */ RunnableC7731s1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.this.m38451T2();
                }
            }, 300L);
        }
    }

    /* renamed from: V1 */
    private SensitiveData m38455V1() {
        SensitiveData sensitiveData = this.f40723E0;
        if (sensitiveData == null) {
            return null;
        }
        String m35528c = sensitiveData.m35528c();
        m35528c.hashCode();
        char c11 = 65535;
        switch (m35528c.hashCode()) {
            case -2104138829:
                if (m35528c.equals("profile_story_archived_post_story")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1503075934:
                if (m35528c.equals("action_open_post_story")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1252630923:
                if (m35528c.equals("csc_attachment_camera")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1040519185:
                if (m35528c.equals("action_pick_media")) {
                    c11 = 3;
                    break;
                }
                break;
            case -528987669:
                if (m35528c.equals("timeline_post_story_from_story")) {
                    c11 = 4;
                    break;
                }
                break;
            case -286352545:
                if (m35528c.equals("timeline_post_feed")) {
                    c11 = 5;
                    break;
                }
                break;
            case -274531500:
                if (m35528c.equals("timeline_post_story")) {
                    c11 = 6;
                    break;
                }
                break;
            case -103038760:
                if (m35528c.equals("channel_post_video")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1745318035:
                if (m35528c.equals("csc_input_gallery_camera")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 2005498703:
                if (m35528c.equals("channel_post_video_from_upload")) {
                    c11 = '\t';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new SensitiveData("micro_profile_story_archived_post_story", "social_story");
            case 1:
                return new SensitiveData("micro_action_open_post_story", "action_common");
            case 2:
                return new SensitiveData("micro_csc_attachment_video", "comm_csc");
            case 3:
                return new SensitiveData("micro_action_pick_media", "action_common");
            case 4:
                return new SensitiveData("micro_timeline_post_story_from_story", "social_timeline");
            case 5:
                return new SensitiveData("micro_timeline_post_feed", "social_timeline");
            case 6:
                return new SensitiveData("micro_timeline_post_story", "social_timeline");
            case 7:
                return new SensitiveData("micro_channel_post_video", "channel");
            case '\b':
                return new SensitiveData("micro_csc_input_gallery_video", "comm_csc");
            case '\t':
                return new SensitiveData("micro_channel_post_video_from_upload", "channel");
            default:
                return null;
        }
    }

    /* renamed from: W2 */
    private void m38457W2(String str) {
        C31890dc m153020A;
        int i11;
        try {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40740N.getLayoutParams();
            if (this.f40738M != null && !TextUtils.isEmpty(getStatus())) {
                m153020A = this.f40738M;
            } else {
                m153020A = C31845ac.m152996J().m153020A();
            }
            int m152997W = C31845ac.m152997W(m153020A.f146515u);
            if (m152997W == 4 && TextUtils.isEmpty(str)) {
                m152997W = 2;
                i11 = -2;
            } else {
                i11 = -1;
            }
            layoutParams.width = i11;
            this.f40740N.setTextAlignment(m152997W);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: X0 */
    private void m38459X0() {
        FrameLayout frameLayout = this.f40757V0;
        if (frameLayout != null) {
            AbstractC23202r9.m119541i(frameLayout, 200L, new C7499c());
        }
    }

    /* renamed from: X1 */
    private void m38460X1() {
        boolean z11;
        boolean z12;
        boolean z13;
        StatusComposeEditText statusComposeEditText;
        String str;
        if (!m38594s1() || this.f40715A0) {
            return;
        }
        this.f40715A0 = true;
        ZaloCameraView zaloCameraView = this.f40748R;
        if (zaloCameraView != null && zaloCameraView.m39065nR()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40746Q.f41129s == 7) {
            if (z11) {
                str = "49150064";
            } else {
                str = "49150062";
            }
            AbstractC23647d.m123897g(str);
        }
        if (this.f40719C0 && (statusComposeEditText = this.f40740N) != null) {
            AbstractC2379w.m12430d(statusComposeEditText);
        }
        if (this.f40727G0 != AbstractC23309i.m122007i5(MainApplication.getAppContext())) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z14 = !z11;
        if (this.f40719C0 && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        m38407E2(z14, z13, true);
        AbstractC28025b8.m141442M("tip.camera.status.story.thumb");
        m38564P0("tip.camera.status.story.thumb");
        this.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.a2
            public /* synthetic */ RunnableC7557a2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraPreviewController.this.m38410F1();
            }
        }, 500L);
    }

    /* renamed from: Y1 */
    private void m38462Y1() {
        StatusComposeEditText statusComposeEditText = this.f40740N;
        if (statusComposeEditText != null && this.f40719C0) {
            this.f40721D0 = true;
            AbstractC2379w.m12430d(statusComposeEditText);
        }
        if (this.f40748R.m39065nR()) {
            m38407E2(false, true, true);
        }
        if (this.f40748R.m39068oR()) {
            m38416H2(false, true, true);
        }
    }

    /* renamed from: Y2 */
    public void m38463Y2() {
        boolean z11;
        int i11;
        if (this.f40740N == null) {
            return;
        }
        if (getStatus().length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        RobotoButton robotoButton = this.f40720D;
        if (z11) {
            i11 = AbstractC16803z.camera_preview_bg_post_status_background_disable;
        } else {
            i11 = AbstractC16803z.camera_preview_bg_post_status_background_enable;
        }
        AbstractC23136l9.m118693a1(robotoButton, i11);
    }

    /* renamed from: Z1 */
    private void m38464Z1() {
        boolean z11;
        boolean z12;
        if (!m38594s1() || this.f40717B0) {
            return;
        }
        this.f40717B0 = true;
        ZaloCameraView zaloCameraView = this.f40748R;
        if (zaloCameraView != null && zaloCameraView.m39068oR()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40746Q.f41129s == 7 && !z11) {
            AbstractC23647d.m123897g("49150066");
        }
        if (!z11) {
            int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
            if (this.f40719C0 && this.f40727G0 == m122007i5) {
                z12 = false;
            } else {
                z12 = true;
            }
            m38416H2(true, z12, new boolean[0]);
        }
        StatusComposeEditText statusComposeEditText = this.f40740N;
        if (statusComposeEditText != null) {
            if (this.f40719C0) {
                this.f40714A.setImageResource(AbstractC16803z.icn_social_story_emoji_active);
                AbstractC2379w.m12430d(this.f40740N);
            } else if (z11) {
                AbstractC2379w.m12434h(statusComposeEditText);
            }
        }
        this.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.c2
            public /* synthetic */ RunnableC7571c2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraPreviewController.this.m38412G1();
            }
        }, 500L);
    }

    /* renamed from: Z2 */
    public void m38465Z2() {
        if (this.f40774k0 != 1 && m38521q1()) {
            AbstractC23136l9.m118744r1(this.f40789u, 0);
        } else {
            AbstractC23136l9.m118744r1(this.f40789u, 4);
        }
    }

    /* renamed from: a1 */
    private View m38468a1(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1690884106:
                if (str.equals("tip.camera.capture.filter")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1042795145:
                if (str.equals("tip.camera.status.story.thumb")) {
                    c11 = 1;
                    break;
                }
                break;
            case -95695281:
                if (str.equals("tip.camera.status.story")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1981570898:
                if (str.equals("tip.camera.beauty")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return this.f40795x;
            case 1:
                return this.f40799z;
            case 2:
                VideoModePicker videoModePicker = this.f40781q;
                if (videoModePicker == null) {
                    return null;
                }
                return videoModePicker.getFirstChildView();
            case 3:
                return this.f40797y;
            default:
                return null;
        }
    }

    /* renamed from: a2 */
    private void m38469a2() {
        boolean z11;
        if (this.f40800z0) {
            return;
        }
        this.f40800z0 = true;
        ZaloCameraView zaloCameraView = this.f40748R;
        if (zaloCameraView != null && zaloCameraView.m39071qR()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40746Q.f41129s == 7 && !z11) {
            AbstractC23647d.m123897g("49150074");
        }
        m38420I2(true ^ z11);
        AbstractC28025b8.m141442M("tip.camera.capture.filter");
        m38564P0("tip.camera.capture.filter");
        this.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.z1
            public /* synthetic */ RunnableC7808z1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraPreviewController.this.m38415H1();
            }
        }, 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:6:0x0007, B:10:0x0019, B:12:0x0035, B:13:0x003c, B:15:0x0040, B:16:0x006f, B:17:0x0085, B:19:0x0089, B:23:0x0048, B:25:0x004c, B:27:0x0058, B:28:0x005f, B:29:0x0066, B:30:0x003a, B:31:0x0072, B:33:0x0079, B:34:0x007e, B:35:0x007c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38472b1(Editable editable, CharSequence charSequence) {
        int i11;
        ZaloCameraView zaloCameraView;
        UpdateStatusView.EnumC15265l0 enumC15265l0;
        try {
            if (!AbstractC23309i.m121491Ue()) {
                return;
            }
            String obj = editable.toString();
            boolean m38535v1 = m38535v1(obj);
            boolean m38539w1 = m38539w1(obj);
            if (m38535v1 && m38539w1) {
                this.f40731I0 = editable;
                m38457W2(editable.toString());
                this.f40743O0.removeCallbacks(this.f40733J0);
                if (getStatus().length() <= C31845ac.f146168A) {
                    enumC15265l0 = UpdateStatusView.EnumC15265l0.STATE_MAX_SIZE;
                } else {
                    enumC15265l0 = UpdateStatusView.EnumC15265l0.STATE_MIN_SIZE;
                }
                if (enumC15265l0 != this.f40742O) {
                    this.f40742O = enumC15265l0;
                    m38591p2(this.f40738M);
                } else if (this.f40737L0) {
                    float currentSizeDecor = getCurrentSizeDecor();
                    if (!TextUtils.equals(this.f40735K0, editable)) {
                        C28652r.m143349v().m143362X(editable, currentSizeDecor);
                    }
                    this.f40735K0 = editable.toString();
                } else {
                    this.f40743O0.postDelayed(this.f40733J0, 150L);
                }
                this.f40737L0 = false;
                zaloCameraView = this.f40748R;
                if (zaloCameraView == null) {
                    zaloCameraView.m39040XS();
                    return;
                }
                return;
            }
            this.f40739M0 = false;
            m38448S2(obj, charSequence);
            if (!m38535v1) {
                i11 = AbstractC8020f0.str_limit_applied_bg_feed;
            } else {
                i11 = AbstractC8020f0.str_over_limit_enter_compose_story_status;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
            zaloCameraView = this.f40748R;
            if (zaloCameraView == null) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: b2 */
    private void m38473b2() {
        if (this.f40752T != null) {
            int i11 = this.f40790u0 + 1;
            int i12 = i11 % 3;
            if (i12 == 0) {
                m38536v2("120N021");
            } else if (i12 == 1) {
                m38536v2("120N020");
            } else if (i12 == 2) {
                m38536v2("120N022");
            }
            setFlashMode(i11);
        }
    }

    /* renamed from: b3 */
    private void m38474b3() {
        try {
            if (this.f40781q != null) {
                m38562N2(false);
                this.f40781q.setTranslationY(0.0f);
                this.f40781q.setAlpha(1.0f);
                this.f40781q.setAllowInteract(true);
                this.f40781q.m39504m(this.f40774k0);
                m38563O0(this.f40774k0, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: c1 */
    private void m38477c1(View view, boolean z11) {
        int i11;
        if (z11) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(view, i11);
    }

    /* renamed from: c2 */
    private void m38478c2() {
        String str;
        boolean z11 = false;
        if (!AbstractC23238v2.m119727l()) {
            ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            return;
        }
        if (!AbstractC23034c6.m118128N()) {
            ZaloCameraView zaloCameraView = this.f40748R;
            if (zaloCameraView != null) {
                zaloCameraView.m39035ST();
                return;
            }
            return;
        }
        ZaloCameraView zaloCameraView2 = this.f40748R;
        if (!zaloCameraView2.f40835B1) {
            if (zaloCameraView2 != null && zaloCameraView2.m39073rR()) {
                z11 = true;
            }
            AbstractC23647d.m123897g("4915105");
            if (this.f40746Q.f41129s == 7) {
                if (z11) {
                    str = "49150072";
                } else {
                    str = "49150071";
                }
                AbstractC23647d.m123897g(str);
            }
            if (this.f40746Q.f41129s != 9) {
                m38424J2(!z11);
                return;
            }
            ZaloCameraView zaloCameraView3 = this.f40748R;
            if (zaloCameraView3 != null) {
                zaloCameraView3.m39035ST();
                return;
            }
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_camera_mini_gallery_no_media));
    }

    /* renamed from: c3 */
    private void m38479c3() {
        AbstractC20276f.m105891d(this.f40720D, 0.8f, 50L, false);
        String status = getStatus();
        if (TextUtils.isEmpty(status)) {
            return;
        }
        C32123ta m155062r = C32123ta.m155062r(status, this.f40738M, null, new PrivacyInfo(), null);
        InterfaceC7513q interfaceC7513q = this.f40725F0;
        if (interfaceC7513q != null) {
            interfaceC7513q.mo38642b(m155062r);
        }
        if (this.f40738M != null) {
            C31845ac.m152996J().m153052j(this.f40738M.f146495a);
        }
    }

    /* renamed from: d2 */
    private void m38482d2(String str) {
        if (!TextUtils.isEmpty(str) && this.f40793w != null) {
            this.f40743O0.post(new Runnable() { // from class: com.zing.zalo.camera.x1

                /* renamed from: q */
                public final /* synthetic */ String f41794q;

                public /* synthetic */ RunnableC7796x1(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.this.m38423J1(r2);
                }
            });
        }
    }

    /* renamed from: e1 */
    private void m38485e1() {
        if (this.f40734K != null) {
            return;
        }
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) ((ViewStub) findViewById(AbstractC6918a0.stub_status_background_view)).inflate();
        FeedBackgroundView feedBackgroundView = (FeedBackgroundView) keyboardFrameLayout.findViewById(AbstractC6918a0.bg_feed_view);
        this.f40734K = feedBackgroundView;
        feedBackgroundView.setModeUse(1);
        this.f40734K.setModeView(1);
        this.f40734K.setOnClickListener(this);
        StatusComposeEditText statusComposeEditText = (StatusComposeEditText) this.f40734K.getViewRender();
        this.f40740N = statusComposeEditText;
        statusComposeEditText.requestFocus();
        keyboardFrameLayout.setOnKeyboardListener(new C7504h());
        if (Build.VERSION.SDK_INT >= 30) {
            this.f40748R.m92691vK().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.camera.n1

                /* renamed from: b */
                public final /* synthetic */ KeyboardFrameLayout f41394b;

                public /* synthetic */ ViewOnApplyWindowInsetsListenerC7695n1(KeyboardFrameLayout keyboardFrameLayout2) {
                    r2 = keyboardFrameLayout2;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets m38402D1;
                    m38402D1 = CameraPreviewController.this.m38402D1(r2, view, windowInsets);
                    return m38402D1;
                }
            });
            this.f40748R.m92691vK().setWindowInsetsAnimationCallback(new C7505i(0, keyboardFrameLayout2));
        }
        this.f40729H0 = new C16572d1(this.f40740N, false, null);
        this.f40740N.addTextChangedListener(new C7506j());
        this.f40748R.m39047eR();
        C31890dc c31890dc = this.f40738M;
        if (c31890dc == null) {
            m38529t2();
        } else {
            m38591p2(c31890dc);
            this.f40748R.m39019FT(this.f40738M);
        }
    }

    /* renamed from: e2 */
    private void m38486e2() {
        try {
            if (C22052u.m115085y().m115088C()) {
                m38553C2();
            } else {
                m38479c3();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: f2 */
    private void m38489f2() {
        ZaloCameraView zaloCameraView = this.f40748R;
        zaloCameraView.f40894j2 = true;
        zaloCameraView.f40896k2 = true ^ this.f40798y0;
        zaloCameraView.m39012CQ();
        AbstractC28025b8.m141442M("tip.camera.beauty");
        m38564P0("tip.camera.beauty");
        this.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.m1
            public /* synthetic */ RunnableC7677m1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraPreviewController.this.m38426K1();
            }
        }, 500L);
    }

    /* renamed from: g1 */
    public boolean m38492g1() {
        return this.f40774k0 != 5;
    }

    private void getDecorGraphyRowsAsync() {
        if (this.f40736L == null) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.e2
                public /* synthetic */ RunnableC7593e2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.this.m38396B1();
                }
            });
        }
    }

    private int getMinVideoRecordDuration() {
        if (this.f40774k0 == 4) {
            return 1500;
        }
        return getRecordButton().f83009r;
    }

    public String getStatus() {
        StatusComposeEditText statusComposeEditText = this.f40740N;
        if (statusComposeEditText != null && statusComposeEditText.getText() != null) {
            return this.f40740N.getText().toString().trim();
        }
        return "";
    }

    private String getVideoRecordOutputPathTemp() {
        return AbstractC20130d.m104832G0().getAbsolutePath() + File.separator + System.currentTimeMillis() + ".mp4";
    }

    /* renamed from: h1 */
    private boolean m38495h1() {
        CameraInputParams cameraInputParams = this.f40746Q;
        int i11 = cameraInputParams.f41129s;
        if ((i11 == 0 && (cameraInputParams.f41101T || cameraInputParams.f41103V || cameraInputParams.f41104W)) || AbstractC22470k.m116158j(i11, ZaloCameraView.f40829O2)) {
            return true;
        }
        return false;
    }

    /* renamed from: k1 */
    private boolean m38502k1() {
        if (this.f40748R.m92651WI().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k2 */
    private void m38503k2(CameraInputParams cameraInputParams) {
        int i11;
        if (!AbstractC22470k.m116157i(cameraInputParams)) {
            AbstractC23136l9.m118684W0(this.f40793w);
        }
        int i12 = cameraInputParams.f41109b0;
        if (i12 > 0) {
            this.f40763a0 = i12;
        } else {
            this.f40763a0 = AbstractC26689j.m137076C(this.f40748R.f40899m1) * 1000;
        }
        this.f40765b0 = AbstractC26689j.m137074A(this.f40748R.f40899m1) * 1000;
        if (AbstractC22462c.m116125a(cameraInputParams)) {
            CameraRecordButton cameraRecordButton = this.f40716B;
            cameraRecordButton.f83008q = this.f40763a0;
            cameraRecordButton.f83010s = true;
        } else {
            this.f40716B.f83010s = false;
        }
        VideoRecordButton videoRecordButton = this.f40718C;
        videoRecordButton.f83008q = this.f40765b0;
        videoRecordButton.f83009r = this.f40766c0;
        if (this.f40748R.f40899m1 == 4) {
            setPreviewRecordMode(3);
        }
        if (cameraInputParams.f41091J) {
            AbstractC23136l9.m118684W0(this.f40716B);
            AbstractC23136l9.m118744r1(this.f40718C, 0);
        }
        if (m38509m1()) {
            RecordButton recordButton = getRecordButton();
            if (m38495h1()) {
                i11 = AbstractC23136l9.m118742r(-10.0f);
            } else {
                i11 = AbstractC23222t7.f112576o;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) recordButton.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = i11;
            recordButton.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l2 */
    private void m38506l2(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        try {
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            int selectionStart = this.f40740N.getSelectionStart();
            int selectionEnd = this.f40740N.getSelectionEnd();
            this.f40740N.setText(spannableStringBuilder);
            this.f40740N.setSelection(selectionStart, selectionEnd);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m1 */
    private boolean m38509m1() {
        if (this.f40748R.m92651WI().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m2 */
    private void m38510m2() {
        View view = this.f40732J;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.f40732J.getParent()).removeView(this.f40732J);
            InterfaceC7513q interfaceC7513q = this.f40725F0;
            if (interfaceC7513q != null) {
                interfaceC7513q.mo38648h(true, false);
            }
            this.f40732J = null;
        }
    }

    /* renamed from: n1 */
    public boolean m38513n1() {
        InterfaceC29634a interfaceC29634a;
        if (!this.f40746Q.f41100S && !m38594s1() && (interfaceC29634a = this.f40752T) != null && interfaceC29634a.mo147376g()) {
            return true;
        }
        return false;
    }

    /* renamed from: n2 */
    public void m38514n2() {
        this.f40743O0.removeMessages(3);
    }

    /* renamed from: o2 */
    public void m38516o2() {
        this.f40743O0.removeMessages(0);
        this.f40743O0.removeMessages(1);
    }

    /* renamed from: q1 */
    private boolean m38521q1() {
        if (!this.f40746Q.f41100S && AbstractC32212c.m155332b()) {
            return true;
        }
        return false;
    }

    /* renamed from: q2 */
    private void m38522q2(C31890dc c31890dc) {
        if (c31890dc != null) {
            C31845ac.m152996J().m153057o0(c31890dc.f146495a, new C31845ac.e() { // from class: com.zing.zalo.camera.t1

                /* renamed from: b */
                public final /* synthetic */ int f41568b;

                public /* synthetic */ C7739t1(int i11) {
                    r2 = i11;
                }

                @Override // p716zh.C31845ac.e
                /* renamed from: a */
                public final void mo39491a(int i11, String str, C31890dc c31890dc2) {
                    CameraPreviewController.this.m38436O1(r2, i11, str, c31890dc2);
                }
            });
        }
    }

    /* renamed from: r1 */
    private boolean m38525r1() {
        VideoModePicker videoModePicker = this.f40781q;
        if (videoModePicker != null && videoModePicker.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private void setBgSelected(C31890dc c31890dc) {
        this.f40738M = c31890dc;
        AbstractC23309i.m121206Mp(c31890dc.f146495a + "_" + c31890dc.f146509o);
    }

    public void setFlashMode(int i11) {
        InterfaceC29634a interfaceC29634a = this.f40752T;
        if (interfaceC29634a != null && interfaceC29634a.mo147376g()) {
            int i12 = i11 % 3;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        this.f40752T.mo147372c(1);
                        return;
                    }
                    return;
                }
                this.f40752T.mo147372c(2);
                return;
            }
            this.f40752T.mo147372c(0);
        }
    }

    /* renamed from: t2 */
    private void m38529t2() {
        this.f40748R.m39057kT();
    }

    /* renamed from: u2 */
    private void m38532u2() {
        try {
            float currentSizeDecor = getCurrentSizeDecor();
            String status = getStatus();
            if (!TextUtils.isEmpty(status)) {
                C28652r.m143349v().m143362X(this.f40740N.getText(), currentSizeDecor);
            } else {
                m38457W2(status);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: v1 */
    private boolean m38535v1(String str) {
        if (str != null && str.length() <= C31845ac.f146169B) {
            return true;
        }
        return false;
    }

    /* renamed from: v2 */
    public void m38536v2(String str) {
        ZaloCameraView zaloCameraView = this.f40748R;
        if (zaloCameraView != null) {
            zaloCameraView.m39061lU(str);
        }
    }

    /* renamed from: w1 */
    private boolean m38539w1(String str) {
        if (str == null || AbstractC23244v8.m119758v(str, System.getProperty("line.separator")) > f40713b1) {
            return false;
        }
        return true;
    }

    /* renamed from: w2 */
    public void m38540w2() {
        try {
            m38572V0(true);
            m38427K2(0);
            m38559L2(0);
            m38554F2(0);
            m38556G2(0);
            m38474b3();
            TextView textView = this.f40724F;
            if (textView != null) {
                AnimationDrawable animationDrawable = (AnimationDrawable) textView.getCompoundDrawables()[0];
                if (animationDrawable != null) {
                    animationDrawable.stop();
                    animationDrawable.selectDrawable(0);
                }
                AbstractC23136l9.m118744r1(this.f40724F, 8);
                this.f40724F.setText(AbstractC23160o0.m119184B0(0L));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: x1 */
    public boolean m38543x1() {
        VideoModePicker videoModePicker = this.f40781q;
        if (videoModePicker != null && videoModePicker.m39503l()) {
            return false;
        }
        return true;
    }

    /* renamed from: y1 */
    public boolean m38546y1() {
        return this.f40774k0 == 4;
    }

    /* renamed from: y2 */
    public void m38547y2() {
        InterfaceC29634a interfaceC29634a = this.f40752T;
        if (interfaceC29634a == null) {
            return;
        }
        C21643a mo147378i = interfaceC29634a.mo147378i();
        if (mo147378i.m111567c(6)) {
            this.f40752T.mo147383n(6);
        } else if (mo147378i.m111567c(5)) {
            this.f40752T.mo147383n(5);
        } else if (mo147378i.m111567c(0)) {
            this.f40752T.mo147383n(0);
        }
    }

    /* renamed from: z1 */
    public /* synthetic */ void m38550z1() {
        AbstractC23136l9.m118744r1(this.f40734K, 8);
    }

    /* renamed from: A2 */
    public void m38551A2() {
        AbstractC23136l9.m118744r1(getRecordButton(), 0);
        AbstractC23136l9.m118744r1(this.f40732J, 0);
    }

    /* renamed from: B2 */
    public void m38552B2(boolean z11) {
        long j11;
        TextView textView;
        if (z11 && (textView = this.f40726G) != null && textView.getVisibility() == 0) {
            return;
        }
        TextView textView2 = this.f40726G;
        if ((textView2 == null && !z11) || (textView2 != null && textView2.getVisibility() == 8 && !z11)) {
            this.f40743O0.removeMessages(7);
            this.f40773j0 = true;
            return;
        }
        if (!z11 && !this.f40773j0) {
            this.f40773j0 = true;
        }
        if (this.f40773j0) {
            this.f40773j0 = false;
            Message obtainMessage = this.f40743O0.obtainMessage();
            obtainMessage.what = 7;
            obtainMessage.arg1 = z11 ? 1 : 0;
            this.f40743O0.removeMessages(7);
            Handler handler = this.f40743O0;
            if (z11) {
                j11 = 1000;
            } else {
                j11 = 0;
            }
            handler.sendMessageDelayed(obtainMessage, j11);
        }
    }

    /* renamed from: C2 */
    protected void m38553C2() {
        new C16972e0.a(getContext()).m90949z(AbstractC23136l9.m118746s0(AbstractC8020f0.str_notif_max_async_story_new, Integer.valueOf(C22052u.m115085y().m115090T()))).m90932i(C16972e0.b.DIALOG_INFORMATION).m90942s(AbstractC8020f0.str_max_async_story_continue_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.j1
            public /* synthetic */ C7655j1() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CameraPreviewController.this.m38439P1(interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_max_async_story_no_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.k1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                interfaceC17463d.dismiss();
            }
        }).m90931h("limit_story_popup").m90947x("limit_story_popup_proceed").m90937n("limit_story_popup_cancel").m90927d().mo13822K();
    }

    /* renamed from: F2 */
    public void m38554F2(int i11) {
        if (!this.f40746Q.f41100S && !m38594s1() && !this.f40748R.m39078vR()) {
            AbstractC23136l9.m118744r1(this.f40795x, i11);
            if (m38565Q0()) {
                AbstractC23136l9.m118744r1(this.f40797y, i11);
            }
        }
        if (m38594s1()) {
            AbstractC23136l9.m118744r1(this.f40799z, i11);
        }
    }

    /* renamed from: G0 */
    public void m38555G0() {
        m38567R0("tip.any");
        m38564P0("tip.any");
    }

    /* renamed from: G2 */
    public void m38556G2(int i11) {
        if (!m38594s1()) {
            AbstractC23136l9.m118744r1(this.f40793w, i11);
        }
        if (m38594s1()) {
            AbstractC23136l9.m118744r1(this.f40714A, i11);
        }
    }

    /* renamed from: K0 */
    public void m38557K0() {
        int i11 = getResources().getConfiguration().orientation;
        m38418I0();
        m38414H0();
        m38422J0(i11);
        VideoModePicker videoModePicker = this.f40781q;
        if (videoModePicker != null) {
            videoModePicker.m39504m(this.f40774k0);
        }
    }

    /* renamed from: L0 */
    public void m38558L0() {
        try {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f40791v, "alpha", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f40787t, "alpha", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f40789u, "alpha", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f40793w, "alpha", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f40779p, "alpha", 1.0f));
            ActiveImageColorButton activeImageColorButton = this.f40795x;
            if (activeImageColorButton != null) {
                arrayList.add(ObjectAnimator.ofFloat(activeImageColorButton, "alpha", 1.0f));
            }
            ActiveImageColorButton activeImageColorButton2 = this.f40797y;
            if (activeImageColorButton2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(activeImageColorButton2, "alpha", 1.0f));
            }
            TextView textView = this.f40726G;
            if (textView != null) {
                arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", 0.5f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(new C26087b());
            animatorSet.start();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: L2 */
    public void m38559L2(int i11) {
        int i12;
        ImageButton imageButton = this.f40787t;
        if (m38513n1()) {
            i12 = i11;
        } else {
            i12 = 8;
        }
        AbstractC23136l9.m118744r1(imageButton, i12);
        ImageButton imageButton2 = this.f40789u;
        if (!m38521q1()) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(imageButton2, i11);
    }

    /* renamed from: M0 */
    public void m38560M0() {
        ZaloCameraView zaloCameraView;
        if (!AbstractC26681b.f126358c || (zaloCameraView = this.f40748R) == null) {
            return;
        }
        if (zaloCameraView.m92676n2() != null && this.f40748R.m92676n2().mo35567d1()) {
            return;
        }
        if (this.f40746Q.f41129s == 7 && this.f40777n0) {
            View findViewById = findViewById(AbstractC6918a0.top_insets_anchor);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC7497a(findViewById));
                return;
            }
            return;
        }
        int m155453a = AbstractC32232i.m155453a(10.0f);
        ImageButton imageButton = this.f40791v;
        if (imageButton != null && this.f40749R0 == null) {
            AbstractC32226c.b bVar = new AbstractC32226c.b(imageButton);
            this.f40749R0 = bVar;
            bVar.f148631c = true;
            bVar.f148639k = false;
            bVar.f148635g = m155453a;
            this.f40748R.m92682pK(bVar);
        }
        ImageButton imageButton2 = this.f40787t;
        if (imageButton2 != null && this.f40751S0 == null) {
            AbstractC32226c.b bVar2 = new AbstractC32226c.b(imageButton2);
            this.f40751S0 = bVar2;
            bVar2.f148631c = true;
            bVar2.f148639k = false;
            bVar2.f148635g = m155453a;
            this.f40748R.m92682pK(bVar2);
        }
        ImageButton imageButton3 = this.f40789u;
        if (imageButton3 != null && this.f40753T0 == null) {
            AbstractC32226c.b bVar3 = new AbstractC32226c.b(imageButton3);
            this.f40753T0 = bVar3;
            bVar3.f148631c = true;
            bVar3.f148639k = false;
            bVar3.f148635g = m155453a;
            this.f40748R.m92682pK(bVar3);
        }
        TextView textView = this.f40724F;
        if (textView != null && this.f40755U0 == null) {
            AbstractC32226c.b bVar4 = new AbstractC32226c.b(textView);
            this.f40755U0 = bVar4;
            bVar4.f148631c = true;
            bVar4.f148639k = false;
            bVar4.m155416a(0, AbstractC23222t7.f112572m, 0, 0);
            this.f40748R.m92682pK(this.f40755U0);
        }
    }

    /* renamed from: M2 */
    public void m38561M2(int i11) {
        AbstractC23136l9.m118744r1(this.f40781q, i11);
    }

    /* renamed from: N2 */
    public void m38562N2(boolean z11) {
        int i11;
        boolean m38502k1 = m38502k1();
        VideoModePicker videoModePicker = this.f40781q;
        if (m38502k1) {
            i11 = 8;
        } else if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(videoModePicker, i11);
    }

    /* renamed from: O0 */
    public void m38563O0(int i11, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        InterfaceC29634a interfaceC29634a;
        if (i11 == 4) {
            m38536v2("120N060");
            if (z11) {
                this.f40750S.m39757O(getVideoRecordOutputPathTemp(), 0L, this.f40764a1, this.f40750S.m39767Y(this.f40748R.f40899m1), this.f40750S.getRender());
            }
        }
        setPreviewRecordMode(i11);
        RecordButton recordButton = getRecordButton();
        if (i11 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean m39078vR = this.f40748R.m39078vR();
        if (this.f40776m0 && this.f40746Q.f41129s == 7) {
            ImageButton imageButton = this.f40787t;
            if (!z12 && ((interfaceC29634a = this.f40752T) == null || interfaceC29634a.mo147376g())) {
                z15 = false;
            } else {
                z15 = true;
            }
            m38477c1(imageButton, z15);
            ImageButton imageButton2 = this.f40789u;
            if (!z12 && AbstractC32212c.m155332b()) {
                z16 = false;
            } else {
                z16 = true;
            }
            m38477c1(imageButton2, z16);
            ActiveImageColorButton activeImageColorButton = this.f40795x;
            if (!z12 && !m39078vR) {
                z17 = false;
            } else {
                z17 = true;
            }
            m38477c1(activeImageColorButton, z17);
            ActiveImageColorButton activeImageColorButton2 = this.f40797y;
            if (m38565Q0() && !z12 && !m39078vR) {
                z18 = false;
            } else {
                z18 = true;
            }
            m38477c1(activeImageColorButton2, z18);
            m38477c1(this.f40793w, z12);
            m38477c1(this.f40799z, !z12);
            m38477c1(this.f40714A, !z12);
            m38477c1(this.f40722E, !z12);
            if (z12) {
                AbstractC28025b8.m141442M("tip.camera.status.story");
                m38564P0("tip.camera.status.story");
                if (this.f40775l0 != 1) {
                    this.f40750S.m39778l0();
                }
                this.f40775l0 = i11;
                this.f40748R.m39042YT(true);
                C31890dc c31890dc = this.f40738M;
                if (c31890dc != null) {
                    this.f40748R.m39013CT(c31890dc.f146516v);
                }
                this.f40748R.m39067oQ().setPickerMiniY(0);
                if (this.f40748R.mo39053jM() == RotatableZaloView.EnumC14966b.Auto) {
                    this.f40748R.m39082wS();
                }
                getDecorGraphyRowsAsync();
                InterfaceC7513q interfaceC7513q = this.f40725F0;
                if (interfaceC7513q != null) {
                    interfaceC7513q.mo38645e(true, false);
                }
                m38485e1();
                m38420I2(false);
                m38424J2(false);
                this.f40716B.setVisibility(8);
                this.f40718C.setVisibility(8);
                this.f40734K.setVisibility(0);
                this.f40734K.setAlpha(0.0f);
                this.f40734K.animate().alpha(1.0f).setDuration(200L).setInterpolator(new C26087b()).start();
                this.f40720D.setVisibility(0);
                this.f40720D.setAlpha(0.0f);
                this.f40720D.setScaleX(0.25f);
                this.f40720D.setScaleY(0.25f);
                this.f40720D.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(350L).setInterpolator(new C26087b()).start();
                this.f40748R.m39039WQ();
                return;
            }
            if (this.f40775l0 == 1) {
                m38599z2();
            }
            this.f40775l0 = i11;
            this.f40748R.m39042YT(false);
            this.f40748R.m39013CT(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black));
            this.f40748R.m39067oQ().setPickerMiniY(DragCameraLayout.f69179I);
            RedDotRoundedImageView redDotRoundedImageView = this.f40793w;
            if (redDotRoundedImageView != null && redDotRoundedImageView.getImageInfo() == null) {
                m38578Z0(this.f40746Q.f41129s);
            }
            FeedBackgroundView feedBackgroundView = this.f40734K;
            if (feedBackgroundView != null && feedBackgroundView.getVisibility() == 0) {
                m38451T2();
                InterfaceC7513q interfaceC7513q2 = this.f40725F0;
                if (interfaceC7513q2 != null) {
                    interfaceC7513q2.mo38645e(false, true);
                }
                AbstractC23136l9.m118744r1(this.f40720D, 8);
                m38407E2(false, true, true);
                this.f40734K.setAlpha(1.0f);
                this.f40734K.animate().alpha(0.0f).setDuration(200L).setInterpolator(new C26087b()).withEndAction(new Runnable() { // from class: com.zing.zalo.camera.p1
                    public /* synthetic */ RunnableC7707p1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreviewController.this.m38550z1();
                    }
                }).start();
            }
        }
        ActiveImageColorButton activeImageColorButton3 = this.f40795x;
        if (!z12 && !m39078vR) {
            z13 = false;
        } else {
            z13 = true;
        }
        m38477c1(activeImageColorButton3, z13);
        ActiveImageColorButton activeImageColorButton4 = this.f40797y;
        if (m38565Q0() && !z12 && !m39078vR) {
            z14 = false;
        } else {
            z14 = true;
        }
        m38477c1(activeImageColorButton4, z14);
        if (i11 != 3 && (!AbstractC22470k.m116158j(this.f40746Q.f41129s, 2, 9) || i11 != 2)) {
            m38453U2();
            this.f40716B.setVisibility(0);
            this.f40716B.setEnabled(true);
            this.f40718C.setVisibility(8);
            this.f40718C.setEnabled(false);
            if (i11 == 4) {
                recordButton.setBoomerangMode(true);
                recordButton.f83008q = 1500;
                recordButton.f83009r = 0;
            } else {
                recordButton.setBoomerangMode(false);
                recordButton.f83008q = this.f40763a0;
                recordButton.f83009r = this.f40766c0;
            }
        } else {
            m38453U2();
            this.f40716B.setVisibility(8);
            this.f40716B.setEnabled(false);
            this.f40718C.setVisibility(0);
            this.f40718C.setDrawGradientCircle(true);
            this.f40718C.setEnabled(true);
            this.f40718C.f83008q = this.f40765b0;
        }
        if (AbstractC22470k.m116156h(this.f40746Q)) {
            if (i11 == 5) {
                m38403D2();
            } else {
                m38459X0();
            }
        }
        if (this.f40794w0) {
            this.f40794w0 = false;
        }
        if (this.f40784r0) {
            this.f40784r0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38564P0(String str) {
        boolean z11;
        boolean z12;
        boolean equals;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        int i12 = 0;
        while (true) {
            String[] strArr = AbstractC28025b8.f130854k;
            if (i12 < strArr.length) {
                String str2 = strArr[i12];
                if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                    try {
                        C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                        View m38468a1 = m38468a1(str2);
                        boolean equals2 = TextUtils.equals(str2, "tip.camera.status.story");
                        int i13 = this.f40774k0;
                        boolean z16 = true;
                        if (i13 != 2 && i13 != 3 && i13 != 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!equals2 || (this.f40776m0 && this.f40746Q.f41129s == 7 && !z11)) {
                            z12 = false;
                            equals = TextUtils.equals(str2, "tip.camera.status.story.thumb");
                            if (!equals && (!this.f40776m0 || this.f40746Q.f41129s != 7 || this.f40774k0 != 1)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean equals3 = TextUtils.equals(str2, "tip.camera.beauty");
                            if (m38468a1 != 0) {
                                if (m141453i != null && m141453i.m142167f() && m141453i.f131580f && ((!z12 && equals2) || ((!z13 && equals) || equals3))) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (TextUtils.equals(str2, "tip.camera.capture.filter")) {
                                    i11 = AbstractC16803z.ic_camera_filter_2;
                                    z15 = true;
                                } else {
                                    i11 = 0;
                                    z15 = false;
                                }
                                if (TextUtils.equals(str2, "tip.camera.beauty")) {
                                    i11 = AbstractC16803z.ic_camera_facefilter_2;
                                } else {
                                    z16 = z15;
                                }
                                if (m38468a1.isShown()) {
                                    if (m38468a1 instanceof ActiveImageColorButton) {
                                        ActiveImageColorButton activeImageColorButton = (ActiveImageColorButton) m38468a1;
                                        activeImageColorButton.setShowRedDot(z14);
                                        if (z16) {
                                            AbstractC28045d8.m141480a(activeImageColorButton, m141453i, this.f40744P, i11);
                                        }
                                    } else if (m38468a1 instanceof InterfaceC25728a) {
                                        InterfaceC25728a interfaceC25728a = (InterfaceC25728a) m38468a1;
                                        if (equals2) {
                                            interfaceC25728a.setRedDotMargin(AbstractC23222t7.f112572m);
                                        } else if (equals) {
                                            interfaceC25728a.setRadiusNoti(AbstractC23222t7.f112558f);
                                            interfaceC25728a.setRedDotMargin(AbstractC23222t7.f112558f);
                                        }
                                        interfaceC25728a.setEnableNoti(z14);
                                    }
                                }
                            }
                        }
                        z12 = true;
                        equals = TextUtils.equals(str2, "tip.camera.status.story.thumb");
                        if (!equals) {
                        }
                        z13 = false;
                        boolean equals32 = TextUtils.equals(str2, "tip.camera.beauty");
                        if (m38468a1 != 0) {
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("CameraPreviewController", e11);
                    }
                }
                i12++;
            } else {
                return;
            }
        }
    }

    /* renamed from: Q0 */
    public boolean m38565Q0() {
        int m121117Ka = AbstractC23309i.m121117Ka();
        if (this.f40748R.m39046cU() && (m121117Ka == 0 || m121117Ka == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: Q2 */
    public void m38566Q2(boolean z11) {
        RunnableC7498b runnableC7498b = new RunnableC7498b(z11);
        try {
            if (z11) {
                m38516o2();
                m38514n2();
                InterfaceC7513q interfaceC7513q = this.f40725F0;
                if (interfaceC7513q != null) {
                    interfaceC7513q.mo38645e(false, true);
                }
                runnableC7498b.run();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f40756V;
            int minVideoRecordDuration = getMinVideoRecordDuration();
            AbstractC20110a.m104535d("stopVideoRecording: FLAG_FORCE_MIN_VIDEO_DURATION= true, recordingTime= " + currentTimeMillis + ", MIN_DURATION= " + minVideoRecordDuration, new Object[0]);
            if (currentTimeMillis > 0) {
                RecordButton recordButton = getRecordButton();
                if (minVideoRecordDuration > 0 && minVideoRecordDuration <= recordButton.f83008q) {
                    long j11 = minVideoRecordDuration;
                    if (currentTimeMillis < j11) {
                        long j12 = j11 - currentTimeMillis;
                        AbstractC20110a.m104535d("stopVideoRecording: supplementRecordTime= %s", Long.valueOf(j12));
                        this.f40743O0.postDelayed(runnableC7498b, j12);
                        return;
                    }
                }
                runnableC7498b.run();
                return;
            }
            AbstractC20110a.m104535d("stopVideoRecording: Stop recording before it even starts", new Object[0]);
            runnableC7498b.run();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: R0 */
    public void m38567R0(String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        View m38468a1;
        try {
            Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130854k).iterator();
            boolean z16 = false;
            while (it.hasNext()) {
                C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e) {
                    if (!TextUtils.equals(str, "tip.any") && !TextUtils.equals(str, c28212v6.f131577c)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean equals = TextUtils.equals(c28212v6.f131577c, "tip.camera.capture.filter");
                    boolean equals2 = TextUtils.equals(c28212v6.f131577c, "tip.camera.status.story");
                    boolean equals3 = TextUtils.equals(c28212v6.f131577c, "tip.camera.status.story.thumb");
                    boolean equals4 = TextUtils.equals(c28212v6.f131577c, "tip.camera.beauty");
                    if (equals && this.f40748R.m39071qR()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (equals2 && (!this.f40776m0 || this.f40746Q.f41129s != 7)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (equals3 && (!this.f40776m0 || this.f40746Q.f41129s != 7 || this.f40774k0 != 1)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (equals4 && !m38565Q0()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z11 && !z12 && !z13 && !z14 && !z15 && (m38468a1 = m38468a1(c28212v6.f131577c)) != null && !z16 && m38468a1.isShown()) {
                        int i11 = -AbstractC23222t7.f112562h;
                        if (equals3) {
                            i11 = AbstractC23222t7.f112566j;
                        }
                        this.f40730I = new ShowcaseView(m38468a1.getContext());
                        C26203c m134769a = C26203c.m134769a(m38468a1.getContext());
                        m134769a.m134770b(c28212v6, m38468a1.getContext());
                        m134769a.f124524o = m38468a1;
                        m134769a.f124525p = i11;
                        this.f40730I.setConfigs(m134769a);
                        this.f40730I.setShowcaseId(c28212v6.f131577c);
                        this.f40730I.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: com.zing.zalo.camera.b2

                            /* renamed from: b */
                            public final /* synthetic */ C28212v6 f41010b;

                            public /* synthetic */ C7564b2(C28212v6 c28212v62) {
                                r2 = c28212v62;
                            }

                            @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                            /* renamed from: a */
                            public final void mo39159a(ShowcaseView showcaseView, int i12, int i13, boolean z17) {
                                CameraPreviewController.this.m38393A1(r2, showcaseView, i12, i13, z17);
                            }
                        });
                        this.f40730I.setShowcaseManager(this.f40728H);
                        this.f40730I.m74637r();
                        if (equals2) {
                            m38424J2(false);
                        }
                        z16 = true;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: S0 */
    public void m38568S0() {
        this.f40783r.m39193d(false, this.f40785s);
    }

    /* renamed from: T0 */
    public void m38569T0() {
        if (m38525r1()) {
            this.f40781q.setAllowInteract(false);
        }
    }

    /* renamed from: U0 */
    public void m38570U0() {
        ShowcaseView showcaseView = this.f40730I;
        if (showcaseView != null && showcaseView.getParent() != null) {
            this.f40730I.m74626d();
        }
    }

    /* renamed from: U1 */
    public void m38571U1() {
        if (this.f40769f0 || m38546y1()) {
            return;
        }
        m38516o2();
        MotionEvent motionEvent = this.f40768e0;
        if (motionEvent != null && this.f40716B != null) {
            motionEvent.setAction(3);
            this.f40716B.dispatchTouchEvent(this.f40768e0);
        }
        AbstractC23237v1.m119715c("capture");
        m38433N0();
    }

    /* renamed from: V0 */
    public void m38572V0(boolean z11) {
        this.f40787t.setEnabled(z11);
        this.f40789u.setEnabled(z11);
        getRecordButton().setEnabled(z11);
        this.f40793w.setEnabled(z11);
    }

    /* renamed from: V2 */
    public void m38573V2(boolean z11) {
        ActiveImageColorButton activeImageColorButton = this.f40795x;
        if (activeImageColorButton != null) {
            activeImageColorButton.setSelected(z11);
        }
    }

    /* renamed from: W0 */
    public void m38574W0() {
        if (m38525r1()) {
            this.f40781q.setAllowInteract(true);
        }
    }

    /* renamed from: W1 */
    public boolean m38575W1() {
        StatusComposeEditText statusComposeEditText;
        if (this.f40769f0) {
            m38566Q2(true);
            return true;
        }
        View view = this.f40732J;
        if (view != null && view.getVisibility() == 0) {
            m38510m2();
            return true;
        }
        ZaloCameraView zaloCameraView = this.f40748R;
        if (zaloCameraView != null && zaloCameraView.m39073rR()) {
            m38424J2(false);
            return true;
        }
        ShowcaseView showcaseView = this.f40730I;
        if (showcaseView != null && showcaseView.getParent() != null) {
            this.f40730I.m74626d();
            return true;
        }
        if (m38594s1()) {
            if (this.f40719C0 && (statusComposeEditText = this.f40740N) != null) {
                AbstractC2379w.m12430d(statusComposeEditText);
                return true;
            }
            ZaloCameraView zaloCameraView2 = this.f40748R;
            if (zaloCameraView2 != null) {
                if (zaloCameraView2.m39065nR()) {
                    m38407E2(false, true, true);
                    return true;
                }
                if (this.f40748R.m39068oR()) {
                    m38416H2(false, true, true);
                    return true;
                }
            }
            if (this.f40740N != null && !TextUtils.isEmpty(getStatus())) {
                this.f40748R.showDialog(4);
                return true;
            }
        }
        return false;
    }

    /* renamed from: X2 */
    public void m38576X2() {
        InterfaceC29634a interfaceC29634a = this.f40752T;
        if (interfaceC29634a != null) {
            interfaceC29634a.mo147382m(this.f40760X0);
        }
        this.f40750S.setOnRecordListener(this.f40764a1);
    }

    /* renamed from: Y0 */
    public int m38577Y0(boolean z11) {
        int i11 = this.f40774k0;
        if (i11 != 4 || z11) {
            return i11 == 2 ? this.f40763a0 : this.f40765b0;
        }
        return 1500;
    }

    /* renamed from: Z0 */
    public void m38578Z0(int i11) {
        if (!AbstractC23034c6.m118128N()) {
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.v1

            /* renamed from: q */
            public final /* synthetic */ int f41590q;

            public /* synthetic */ RunnableC7751v1(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraPreviewController.this.m38399C1(r2);
            }
        });
    }

    /* renamed from: a3 */
    public void m38579a3(int i11) {
        VideoModePicker videoModePicker = this.f40781q;
        if (videoModePicker != null) {
            videoModePicker.m39504m(i11);
        }
    }

    /* renamed from: d1 */
    public void m38580d1(ZaloCameraView zaloCameraView, ImageDecorView imageDecorView, CameraInputParams cameraInputParams) {
        this.f40790u0 = 0;
        this.f40748R = zaloCameraView;
        this.f40750S = imageDecorView;
        this.f40746Q = cameraInputParams;
        m38503k2(cameraInputParams);
        this.f40750S.setOnRecordListener(this.f40764a1);
        this.f40766c0 = AbstractC23309i.m121476U() + ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        if (zaloCameraView.f40899m1 == 4) {
            this.f40766c0 = (AbstractC26689j.m137075B(4) * 1000) + ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        }
        this.f40782q0 = false;
        this.f40767d0 = null;
        this.f40776m0 = AbstractC23309i.m121196Mf();
        this.f40777n0 = AbstractC0924m0.m2902Aa();
        this.f40775l0 = cameraInputParams.f41107Z;
        this.f40723E0 = zaloCameraView.f40912s2;
        m38560M0();
    }

    /* renamed from: f1 */
    public void m38581f1(int i11) {
        try {
            if (this.f40781q == null && m38495h1()) {
                this.f40775l0 = i11;
                this.f40781q = new VideoModePicker(this.f40748R.m92648SI(), this.f40746Q, this.f40776m0, new C7509m());
                ((FrameLayout) this.f40779p.findViewById(AbstractC6918a0.fl_camera_video_mode_picker)).addView(this.f40781q);
                this.f40781q.setVisibility(0);
                this.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.l1

                    /* renamed from: q */
                    public final /* synthetic */ int f41325q;

                    public /* synthetic */ RunnableC7667l1(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreviewController.this.m38406E1(r2);
                    }
                }, 300L);
                m38563O0(i112, false);
                this.f40781q.m39504m(i112);
                if (this.f40776m0 && i112 == 1) {
                    m38485e1();
                    this.f40748R.m39082wS();
                    getDecorGraphyRowsAsync();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: g2 */
    public void m38582g2(JSONObject jSONObject) {
        try {
            setPreviewRecordMode(jSONObject.optInt("record_mode", 2));
            this.f40775l0 = jSONObject.optInt("last_record_mode", 2);
            this.f40748R.m39011BT(this.f40774k0);
            m38563O0(this.f40774k0, true);
            this.f40743O0.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.d2

                /* renamed from: q */
                public final /* synthetic */ JSONObject f41157q;

                public /* synthetic */ RunnableC7587d2(JSONObject jSONObject2) {
                    r2 = jSONObject2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreviewController.this.m38429L1(r2);
                }
            }, 300L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    public float getCurrentSizeDecor() {
        int i11;
        C31890dc c31890dc = this.f40738M;
        if (c31890dc != null) {
            i11 = c31890dc.m153244m(getStatus(), 8);
        } else {
            i11 = 20;
        }
        return AbstractC23136l9.m118742r(i11);
    }

    public StatusComposeEditText getEditStatus() {
        return this.f40740N;
    }

    public int getPreviewRecordMode() {
        return this.f40774k0;
    }

    public RecordButton getRecordButton() {
        if (this.f40746Q.f41091J) {
            return this.f40718C;
        }
        if (this.f40774k0 != 3) {
            return this.f40716B;
        }
        return this.f40718C;
    }

    public C13306b getShowcaseManager() {
        return this.f40728H;
    }

    /* renamed from: h2 */
    public void m38583h2(JSONObject jSONObject) {
        String str;
        jSONObject.put("record_mode", this.f40774k0);
        jSONObject.put("last_record_mode", this.f40775l0);
        jSONObject.put("bg_status_text", getStatus());
        C31890dc c31890dc = this.f40738M;
        if (c31890dc != null) {
            str = c31890dc.m153253y();
        } else {
            str = "";
        }
        jSONObject.put("bg_status_selected_typo", str);
    }

    /* renamed from: i1 */
    public boolean m38584i1() {
        return this.f40774k0 == 5;
    }

    /* renamed from: i2 */
    public void m38585i2(MotionEvent motionEvent) {
        InterfaceC29634a interfaceC29634a;
        FocusCircleView focusCircleView;
        if (this.f40750S != null && this.f40748R.f40897l1 == 1 && (interfaceC29634a = this.f40752T) != null && !interfaceC29634a.mo147377h() && !AbstractC23171p0.m119371c() && (focusCircleView = this.f40783r) != null && !focusCircleView.f41073s && !m38597u1(motionEvent) && !m38596t1(motionEvent)) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.f40752T.mo147375f(AbstractC32212c.m155331a(getContext()), motionEvent.getRawX() - (getWidth() / 2.0f), motionEvent.getRawY() - (getHeight() / 2.0f), getWidth(), getHeight(), new InterfaceC29634a.b() { // from class: com.zing.zalo.camera.r1

                /* renamed from: b */
                public final /* synthetic */ Rect f41525b;

                public /* synthetic */ C7725r1(Rect rect) {
                    r2 = rect;
                }

                @Override // xh0.InterfaceC29634a.b
                /* renamed from: a */
                public final void mo39486a() {
                    CameraPreviewController.this.m38434N1(r2);
                }
            });
        }
    }

    /* renamed from: j1 */
    public boolean m38586j1() {
        RedDotRoundedImageView redDotRoundedImageView = this.f40793w;
        if (redDotRoundedImageView != null && redDotRoundedImageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j2 */
    public void m38587j2() {
        try {
            InterfaceC29634a interfaceC29634a = this.f40752T;
            if (interfaceC29634a != null) {
                if (interfaceC29634a.mo147377h()) {
                    InterfaceC7513q interfaceC7513q = this.f40725F0;
                    if (interfaceC7513q != null) {
                        interfaceC7513q.mo38649i(false);
                    }
                    m38536v2("120N011");
                } else {
                    InterfaceC7513q interfaceC7513q2 = this.f40725F0;
                    if (interfaceC7513q2 != null) {
                        interfaceC7513q2.mo38649i(true);
                    }
                    m38536v2("120N010");
                }
                m38445R2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    /* renamed from: l1 */
    public boolean m38588l1() {
        return this.f40774k0 == 2;
    }

    /* renamed from: o1 */
    public boolean m38589o1() {
        View view = this.f40732J;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f40780p0) {
            return;
        }
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_switch) {
            m38587j2();
            return;
        }
        if (id2 == AbstractC6918a0.btn_flash) {
            m38473b2();
            return;
        }
        if (id2 == AbstractC6918a0.btn_back_cam) {
            InterfaceC7513q interfaceC7513q = this.f40725F0;
            if (interfaceC7513q != null) {
                interfaceC7513q.mo38644d(view);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_cam_gallery) {
            m38478c2();
            return;
        }
        if (id2 == AbstractC6918a0.btn_cam_filter) {
            m38469a2();
            return;
        }
        if (id2 == AbstractC6918a0.btn_quick_filter) {
            m38489f2();
            return;
        }
        if (id2 == AbstractC6918a0.btn_background) {
            m38460X1();
            return;
        }
        if (id2 == AbstractC6918a0.btn_emoji) {
            m38464Z1();
        } else if (id2 == AbstractC6918a0.btn_post_status_background) {
            m38486e2();
        } else if (id2 == AbstractC6918a0.bg_feed_view) {
            m38462Y1();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (m38584i1()) {
            m38403D2();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f40744P = new C23528a(getContext());
        this.f40754U = AbstractC23306f.m120715u();
        FocusCircleView focusCircleView = new FocusCircleView(getContext());
        this.f40783r = focusCircleView;
        AbstractC23136l9.m118744r1(focusCircleView, 8);
        addView(this.f40783r, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f40779p = findViewById(AbstractC6918a0.camera_preview_capture_controls);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC6918a0.btn_flash);
        this.f40787t = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) findViewById(AbstractC6918a0.btn_switch);
        this.f40789u = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) findViewById(AbstractC6918a0.btn_back_cam);
        this.f40791v = imageButton3;
        imageButton3.setOnClickListener(this);
        RedDotRoundedImageView redDotRoundedImageView = (RedDotRoundedImageView) findViewById(AbstractC6918a0.btn_cam_gallery);
        this.f40793w = redDotRoundedImageView;
        redDotRoundedImageView.setOnClickListener(this);
        CameraRecordButton cameraRecordButton = (CameraRecordButton) findViewById(AbstractC6918a0.btn_capture);
        this.f40716B = cameraRecordButton;
        cameraRecordButton.setOnTouchListener(this.f40745P0);
        VideoRecordButton videoRecordButton = (VideoRecordButton) findViewById(AbstractC6918a0.btn_free_hand_video_record);
        this.f40718C = videoRecordButton;
        videoRecordButton.setOnTouchListener(this.f40747Q0);
        RobotoButton robotoButton = (RobotoButton) findViewById(AbstractC6918a0.btn_post_status_background);
        this.f40720D = robotoButton;
        robotoButton.setOnClickListener(this);
        this.f40722E = (ChangeableHeightRelativeLayout) findViewById(AbstractC6918a0.preview_bottom_background);
        ActiveImageColorButton activeImageColorButton = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_cam_filter);
        this.f40795x = activeImageColorButton;
        activeImageColorButton.setOnClickListener(this);
        this.f40795x.setCircleColor(Color.parseColor("#FF0085ff"));
        this.f40795x.setVisibility(8);
        this.f40795x.setMaxIconSize(AbstractC23136l9.m118742r(36.0f));
        ActiveImageColorButton activeImageColorButton2 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_quick_filter);
        this.f40797y = activeImageColorButton2;
        activeImageColorButton2.setOnClickListener(this);
        this.f40797y.setCircleColor(Color.parseColor("#FF0085ff"));
        this.f40797y.setVisibility(8);
        this.f40797y.setMaxIconSize(AbstractC23136l9.m118742r(36.0f));
        RedDotRoundedImageView redDotRoundedImageView2 = (RedDotRoundedImageView) findViewById(AbstractC6918a0.btn_background);
        this.f40799z = redDotRoundedImageView2;
        redDotRoundedImageView2.setIgnoreAdjustBoundsForBorder(true);
        this.f40799z.setOnClickListener(this);
        ImageButton imageButton4 = (ImageButton) findViewById(AbstractC6918a0.btn_emoji);
        this.f40714A = imageButton4;
        imageButton4.setOnClickListener(this);
        C13306b c13306b = new C13306b(getContext());
        this.f40728H = c13306b;
        c13306b.m74687C(this);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            m38564P0("tip.any");
            ZaloCameraView zaloCameraView = this.f40748R;
            if (zaloCameraView != null) {
                zaloCameraView.m39048fT();
                if (this.f40797y != null) {
                    setSelectedQuickAccessFilter(this.f40748R.f40896k2);
                }
            }
        }
    }

    /* renamed from: p1 */
    public boolean m38590p1() {
        return this.f40719C0;
    }

    /* renamed from: p2 */
    public void m38591p2(C31890dc c31890dc) {
        boolean z11;
        float f11;
        try {
            if (AbstractC23309i.m121491Ue() && this.f40734K != null) {
                ZaloCameraView zaloCameraView = this.f40748R;
                if (zaloCameraView != null && zaloCameraView.m39078vR()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int width = this.f40734K.getWidth();
                int height = this.f40734K.getHeight();
                int m118722k0 = AbstractC23136l9.m118722k0();
                int m118713h0 = AbstractC23136l9.m118713h0();
                if (z11) {
                    int m118608f = AbstractC23121k5.m118608f(width, height);
                    int m118608f2 = AbstractC23121k5.m118608f(m118722k0, m118713h0);
                    m118722k0 = m118713h0;
                    m118713h0 = m118608f2;
                    width = height;
                    height = m118608f;
                }
                if (height != 0 && width != 0) {
                    f11 = (height * 1.0f) / width;
                } else {
                    f11 = (m118713h0 * 1.0f) / m118722k0;
                }
                float f12 = f11;
                this.f40734K.setTypeRender(1);
                this.f40734K.m43644q(AbstractC6918a0.tag_visibility, 0);
                this.f40734K.m43641m(c31890dc, true, false, getStatus(), f12, 8);
                setBgSelected(c31890dc);
                m38532u2();
                this.f40748R.m39013CT(this.f40738M.f146516v);
                if (c31890dc.m153247r()) {
                    this.f40799z.setImageResource(AbstractC16803z.bg_default_thumb);
                } else if (!TextUtils.isEmpty(c31890dc.f146496b)) {
                    ((C23528a) this.f40744P.m123612r(this.f40799z)).m123579C(c31890dc.f146496b, C23278z2.m120060A(), new C23999j().m125764I1(250));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraPreviewController", e11);
        }
    }

    @Override // xh0.InterfaceC29636b
    /* renamed from: qC */
    public void mo38592qC(InterfaceC29634a interfaceC29634a) {
        this.f40752T = interfaceC29634a;
        if (interfaceC29634a != null) {
            this.f40780p0 = false;
            interfaceC29634a.mo147386q(0);
            this.f40748R.m39027JT(0);
            this.f40752T.mo147382m(this.f40760X0);
            this.f40750S.setCameraController(this.f40752T);
            setFlashMode(this.f40790u0);
            ZaloCameraView zaloCameraView = this.f40748R;
            if (zaloCameraView != null && zaloCameraView.m92676n2() != null) {
                this.f40748R.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.q1
                    public /* synthetic */ RunnableC7719q1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreviewController.this.m38419I1();
                    }
                });
            }
        }
    }

    /* renamed from: r2 */
    public void m38593r2() {
        List list;
        if (this.f40738M != null && (list = this.f40736L) != null && !list.isEmpty()) {
            m38522q2(C31845ac.m152996J().m153037P(this.f40736L, this.f40738M));
        }
    }

    /* renamed from: s1 */
    public boolean m38594s1() {
        if (this.f40746Q.f41129s == 7 && this.f40776m0 && this.f40774k0 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: s2 */
    public void m38595s2() {
        List list;
        if (this.f40738M != null && (list = this.f40736L) != null && !list.isEmpty()) {
            m38522q2(C31845ac.m152996J().m153040S(this.f40736L, this.f40738M));
        }
    }

    public void setCameraIndex(int i11) {
        this.f40788t0 = i11;
    }

    public void setEventListener(InterfaceC7513q interfaceC7513q) {
        this.f40725F0 = interfaceC7513q;
    }

    public void setPreviewRecordMode(int i11) {
        this.f40774k0 = i11;
    }

    public void setSelectedQuickAccessFilter(boolean z11) {
        this.f40798y0 = z11;
        this.f40797y.setSelected(z11);
    }

    /* renamed from: t1 */
    public boolean m38596t1(MotionEvent motionEvent) {
        if (!this.f40748R.m39078vR()) {
            return false;
        }
        int m118713h0 = AbstractC23136l9.m118713h0();
        int height = getRecordButton().getHeight();
        if (motionEvent.getX() <= AbstractC23136l9.m118722k0() - this.f40779p.getHeight()) {
            return false;
        }
        float f11 = m118713h0 / 2.0f;
        float f12 = height / 2.0f;
        if (motionEvent.getY() <= f11 - f12 || motionEvent.getY() >= f11 + f12) {
            return false;
        }
        return true;
    }

    /* renamed from: u1 */
    public boolean m38597u1(MotionEvent motionEvent) {
        int m118722k0 = AbstractC23136l9.m118722k0();
        int width = getRecordButton().getWidth();
        if (motionEvent.getY() > AbstractC23136l9.m118713h0() - this.f40779p.getHeight()) {
            float f11 = m118722k0 / 2.0f;
            float f12 = width / 2.0f;
            if (motionEvent.getX() > f11 - f12 && motionEvent.getX() < f11 + f12) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x2 */
    public void m38598x2(int i11) {
        if (m38525r1()) {
            this.f40781q.setVideoMode(i11);
        }
    }

    /* renamed from: z2 */
    public void m38599z2() {
        if (this.f40750S != null) {
            if (this.f40788t0 >= C29667y.m147458p().m147480q()) {
                this.f40788t0 = 0;
            }
            AbstractC22470k.m116160l();
            this.f40750S.m39789w0(this.f40788t0, this, this.f40759W0, this.f40723E0);
        }
        if (this.f40794w0) {
            this.f40794w0 = false;
        }
    }
}
