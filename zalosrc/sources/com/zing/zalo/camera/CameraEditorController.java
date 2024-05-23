package com.zing.zalo.camera;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import bf.AbstractC2790b;
import bi0.AbstractC2810d;
import bo.C3063z0;
import c30.C3255n;
import cf.C3450a;
import cf.C3451b;
import cg.AbstractC3460h;
import com.androidquery.util.AbstractC3974g;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.adapters.C7157o0;
import com.zing.zalo.camera.CameraEditorController;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import com.zing.zalo.camera.location.LocationFilterPager;
import com.zing.zalo.camera.music.p060ui.MusicView;
import com.zing.zalo.camera.photocrop.CropView;
import com.zing.zalo.camera.videos.videocrop.VideoCropLayout;
import com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import com.zing.zalo.config.VideoNativeCompressConfig;
import com.zing.zalo.expandableview.ExpandableActionView;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectParam;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetView;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView;
import com.zing.zalo.p077ui.imgdecor.caption.CaptionView;
import com.zing.zalo.p077ui.imgdecor.doodle.DoodleView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import com.zing.zalo.p077ui.widget.textview.DescriptionInputTextView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import com.zing.zalo.uicomponents.imageview.ActiveImageColorButton;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import dg0.AbstractC17927b;
import dj.C17961f1;
import gf.C19435a;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import ht.C20125e;
import im.C20612c;
import im.C20614e;
import im.C20620k;
import im.C20624o;
import im.C20625p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import l30.C22052u;
import m70.C22949b;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23204s0;
import me0.AbstractC23222t7;
import me0.AbstractC23227u1;
import me0.AbstractC23237v1;
import me0.AbstractC23238v2;
import me0.AbstractC23277z1;
import me0.AbstractC23280z4;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mn.InterfaceC23362e;
import n70.EnumC23613l;
import nh0.C23793c;
import org.json.JSONObject;
import p098dc.C17870d;
import p129ef.C18420a;
import p129ef.C18422c;
import p139eq.C18573i;
import p160ff.C18903a;
import p166fq.AbstractC19118o;
import p166fq.C19121r;
import p166fq.C19124u;
import p166fq.C19127x;
import p168ft.C19141a;
import p169fu.AbstractC19146a;
import p207he.C20024r;
import p208hf.AbstractC20038l;
import p208hf.C20028b;
import p237if.C20527a;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p275js.AbstractC21345a;
import p276jt.AbstractC21351f;
import p276jt.C21347b;
import p276jt.C21348c;
import p276jt.C21349d;
import p276jt.C21352g;
import p276jt.C21357l;
import p276jt.C21358m;
import p276jt.C21362q;
import p298kf.C21700a;
import p305kt.InterfaceC21941a;
import p306ku.AbstractC21943a;
import p322lf.AbstractC22463d;
import p322lf.AbstractC22466g;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p367nn.EnumC23888c;
import p370nt.C23934a;
import p397on.EnumC24313a;
import p401or.AbstractC24416f;
import p401or.C24417g;
import p446qf.EnumC25253a;
import p471r3.C25630b;
import p489rn.C25892l2;
import p490rp.AbstractC25951b;
import p493rt.C25977a;
import p500s1.C26086a;
import p500s1.C26087b;
import p500s1.C26088c;
import p559uv.C27373c;
import p588vw.C28644j;
import p588vw.C28652r;
import p642xe.C29605a;
import p643xf.C29617j;
import p646xi.C29669a;
import p679yf.C30922b;
import p679yf.C30923c;
import p679yf.InterfaceC30925e;
import p679yf.InterfaceC30926f;
import p716zh.C31972j4;
import p716zh.C31987k4;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32123ta;
import pm.AbstractC24833d;
import pt.C24908a;
import sa0.C26203c;
import t50.C26490b;
import te0.C26645c;
import th.AbstractC26681b;
import th.AbstractC26689j;
import tv.AbstractC26897a;
import ui0.C27280g;
import ve.AbstractC27985d;
import ve.C27989h;
import vg.AbstractC28025b8;
import vg.AbstractC28045d8;
import vg.C28020b3;
import vg.C28157p5;
import vg.C28193t5;
import vg.C28212v6;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zh0.AbstractC32212c;
import zl0.AbstractC32226c;

@SuppressLint({"DefaultLocale", "StringFormatInTimber"})
/* loaded from: classes3.dex */
public class CameraEditorController extends RelativeLayout implements View.OnClickListener, InterfaceC30926f, C29617j.a, InterfaceC21941a, InterfaceC23362e {

    /* renamed from: a3 */
    private static final String[] f40483a3 = {"android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: A */
    private ActiveImageColorButton f40484A;

    /* renamed from: A0 */
    private C21362q f40485A0;

    /* renamed from: A1 */
    private Button f40486A1;

    /* renamed from: A2 */
    private AbstractC32226c.b f40487A2;

    /* renamed from: B */
    private ActiveImageColorButton f40488B;

    /* renamed from: B0 */
    private RectF f40489B0;

    /* renamed from: B1 */
    private DescriptionInputTextView f40490B1;

    /* renamed from: B2 */
    private AbstractC32226c.b f40491B2;

    /* renamed from: C */
    private View f40492C;

    /* renamed from: C0 */
    private Animator f40493C0;

    /* renamed from: C1 */
    private View f40494C1;

    /* renamed from: C2 */
    private AbstractC32226c.b f40495C2;

    /* renamed from: D */
    private DragToCloseLayout f40496D;

    /* renamed from: D0 */
    boolean f40497D0;

    /* renamed from: D1 */
    private InterfaceC30925e f40498D1;

    /* renamed from: D2 */
    private AbstractC32226c.b f40499D2;

    /* renamed from: E */
    private StickerPanelView f40500E;

    /* renamed from: E0 */
    private boolean f40501E0;

    /* renamed from: E1 */
    private boolean f40502E1;

    /* renamed from: E2 */
    private AbstractC32226c.b f40503E2;

    /* renamed from: F */
    private boolean f40504F;

    /* renamed from: F0 */
    private boolean f40505F0;

    /* renamed from: F1 */
    boolean f40506F1;

    /* renamed from: F2 */
    private AbstractC32226c.b f40507F2;

    /* renamed from: G */
    private boolean f40508G;

    /* renamed from: G0 */
    private boolean f40509G0;

    /* renamed from: G1 */
    private boolean f40510G1;

    /* renamed from: G2 */
    private AbstractC32226c.b f40511G2;

    /* renamed from: H */
    private ActiveImageColorButton f40512H;

    /* renamed from: H0 */
    private boolean f40513H0;

    /* renamed from: H1 */
    private boolean f40514H1;

    /* renamed from: H2 */
    private AbstractC32226c.b f40515H2;

    /* renamed from: I */
    private CaptionView f40516I;

    /* renamed from: I0 */
    private int f40517I0;

    /* renamed from: I1 */
    private boolean f40518I1;

    /* renamed from: I2 */
    private AbstractC32226c.b f40519I2;

    /* renamed from: J */
    private C22949b f40520J;

    /* renamed from: J0 */
    private LinearLayout f40521J0;

    /* renamed from: J1 */
    private boolean f40522J1;

    /* renamed from: J2 */
    private AbstractC32226c.b f40523J2;

    /* renamed from: K */
    private float f40524K;

    /* renamed from: K0 */
    private RobotoTextView f40525K0;

    /* renamed from: K1 */
    private ProgressBar f40526K1;

    /* renamed from: K2 */
    private AbstractC32226c.b f40527K2;

    /* renamed from: L */
    private float f40528L;

    /* renamed from: L0 */
    private ActiveImageColorButton f40529L0;

    /* renamed from: L1 */
    private boolean f40530L1;

    /* renamed from: L2 */
    private AbstractC32226c.b f40531L2;

    /* renamed from: M */
    private float f40532M;

    /* renamed from: M0 */
    private RobotoTextView f40533M0;

    /* renamed from: M1 */
    private CameraInputParams f40534M1;

    /* renamed from: M2 */
    private final C17870d f40535M2;

    /* renamed from: N */
    private float f40536N;

    /* renamed from: N0 */
    private boolean f40537N0;

    /* renamed from: N1 */
    private ZaloCameraView f40538N1;

    /* renamed from: N2 */
    private final MutableStateFlow f40539N2;

    /* renamed from: O */
    private boolean f40540O;

    /* renamed from: O0 */
    private DocumentScanView f40541O0;

    /* renamed from: O1 */
    private ImageDecorView f40542O1;

    /* renamed from: O2 */
    private int f40543O2;

    /* renamed from: P */
    private boolean f40544P;

    /* renamed from: P0 */
    private C20125e f40545P0;

    /* renamed from: P1 */
    private int f40546P1;

    /* renamed from: P2 */
    private C3450a f40547P2;

    /* renamed from: Q */
    private ActiveImageColorButton f40548Q;

    /* renamed from: Q0 */
    private Bitmap f40549Q0;

    /* renamed from: Q1 */
    private boolean f40550Q1;

    /* renamed from: Q2 */
    private final AbstractC22466g.b f40551Q2;

    /* renamed from: R */
    private DoodleView f40552R;

    /* renamed from: R0 */
    private Bitmap f40553R0;

    /* renamed from: R1 */
    public int f40554R1;

    /* renamed from: R2 */
    private final C21362q f40555R2;

    /* renamed from: S */
    private C21358m f40556S;

    /* renamed from: S0 */
    private boolean f40557S0;

    /* renamed from: S1 */
    private InterfaceC7480j0 f40558S1;

    /* renamed from: S2 */
    private C22949b f40559S2;

    /* renamed from: T */
    private C21347b[] f40560T;

    /* renamed from: T0 */
    private ActiveImageColorButton f40561T0;

    /* renamed from: T1 */
    ShowcaseView f40562T1;

    /* renamed from: T2 */
    private final C22949b.b f40563T2;

    /* renamed from: U */
    private C23934a[] f40564U;

    /* renamed from: U0 */
    private LinearLayout f40565U0;

    /* renamed from: U1 */
    private C13306b f40566U1;

    /* renamed from: U2 */
    private final C22949b.b f40567U2;

    /* renamed from: V */
    private ActiveImageColorButton f40568V;

    /* renamed from: V0 */
    private PrivacyInfo f40569V0;

    /* renamed from: V1 */
    private int f40570V1;

    /* renamed from: V2 */
    private final C22949b.b f40571V2;

    /* renamed from: W */
    private LocationFilterPager f40572W;

    /* renamed from: W0 */
    private AbstractC24416f f40573W0;

    /* renamed from: W1 */
    private String f40574W1;

    /* renamed from: W2 */
    private final CaptionView.InterfaceC12092b f40575W2;

    /* renamed from: X0 */
    private View f40576X0;

    /* renamed from: X1 */
    private String f40577X1;

    /* renamed from: X2 */
    private final C22949b.b f40578X2;

    /* renamed from: Y0 */
    private RecyclingImageView f40579Y0;

    /* renamed from: Y1 */
    private String f40580Y1;

    /* renamed from: Y2 */
    private final C30922b.c f40581Y2;

    /* renamed from: Z0 */
    private ModulesView f40582Z0;

    /* renamed from: Z1 */
    String f40583Z1;

    /* renamed from: Z2 */
    public final Handler f40584Z2;

    /* renamed from: a0 */
    private AbstractC2790b f40585a0;

    /* renamed from: a1 */
    private C18573i f40586a1;

    /* renamed from: a2 */
    private C30923c f40587a2;

    /* renamed from: b0 */
    private List f40588b0;

    /* renamed from: b1 */
    private View f40589b1;

    /* renamed from: b2 */
    private int f40590b2;

    /* renamed from: c0 */
    private boolean f40591c0;

    /* renamed from: c1 */
    private GlowingReddot f40592c1;

    /* renamed from: c2 */
    private int f40593c2;

    /* renamed from: d0 */
    private boolean f40594d0;

    /* renamed from: d1 */
    private AbstractC20038l f40595d1;

    /* renamed from: d2 */
    private boolean f40596d2;

    /* renamed from: e0 */
    private ActiveImageColorButton f40597e0;

    /* renamed from: e1 */
    private AbstractC21351f f40598e1;

    /* renamed from: e2 */
    private boolean f40599e2;

    /* renamed from: f0 */
    private VideoSpeedLayout f40600f0;

    /* renamed from: f1 */
    private MusicView f40601f1;

    /* renamed from: f2 */
    private boolean f40602f2;

    /* renamed from: g0 */
    private int f40603g0;

    /* renamed from: g1 */
    StoryMusicAttachment f40604g1;

    /* renamed from: g2 */
    private boolean f40605g2;

    /* renamed from: h0 */
    private int f40606h0;

    /* renamed from: h1 */
    private int f40607h1;

    /* renamed from: h2 */
    private boolean f40608h2;

    /* renamed from: i0 */
    private int f40609i0;

    /* renamed from: i1 */
    private int f40610i1;

    /* renamed from: i2 */
    private boolean f40611i2;

    /* renamed from: j0 */
    private int f40612j0;

    /* renamed from: j1 */
    private AbstractC19118o f40613j1;

    /* renamed from: j2 */
    private final C7478i0 f40614j2;

    /* renamed from: k0 */
    private float f40615k0;

    /* renamed from: k1 */
    private C18420a f40616k1;

    /* renamed from: k2 */
    private String f40617k2;

    /* renamed from: l0 */
    private Object f40618l0;

    /* renamed from: l1 */
    private C18422c f40619l1;

    /* renamed from: l2 */
    private C20612c f40620l2;

    /* renamed from: m0 */
    private ActiveImageColorButton f40621m0;

    /* renamed from: m1 */
    private float f40622m1;

    /* renamed from: m2 */
    private C20620k f40623m2;

    /* renamed from: n0 */
    private VideoCropLayout f40624n0;

    /* renamed from: n1 */
    private float f40625n1;

    /* renamed from: n2 */
    private JSONObject f40626n2;

    /* renamed from: o0 */
    private int f40627o0;

    /* renamed from: o1 */
    private float f40628o1;

    /* renamed from: o2 */
    private String f40629o2;

    /* renamed from: p */
    private View f40630p;

    /* renamed from: p0 */
    private int f40631p0;

    /* renamed from: p1 */
    private float f40632p1;

    /* renamed from: p2 */
    private AnimatorSet f40633p2;

    /* renamed from: q */
    private View f40634q;

    /* renamed from: q0 */
    private int f40635q0;

    /* renamed from: q1 */
    private int f40636q1;

    /* renamed from: q2 */
    private AnimatorSet f40637q2;

    /* renamed from: r */
    FrameLayout f40638r;

    /* renamed from: r0 */
    private int f40639r0;

    /* renamed from: r1 */
    private boolean f40640r1;

    /* renamed from: r2 */
    private AnimatorSet f40641r2;

    /* renamed from: s */
    FrameLayout f40642s;

    /* renamed from: s0 */
    boolean f40643s0;

    /* renamed from: s1 */
    private boolean f40644s1;

    /* renamed from: s2 */
    private AnimatorSet f40645s2;

    /* renamed from: t */
    View f40646t;

    /* renamed from: t0 */
    private int f40647t0;

    /* renamed from: t1 */
    private ActiveImageColorButton f40648t1;

    /* renamed from: t2 */
    private AnimatorSet f40649t2;

    /* renamed from: u */
    ExpandableActionView f40650u;

    /* renamed from: u0 */
    private ActiveImageColorButton f40651u0;

    /* renamed from: u1 */
    private View f40652u1;

    /* renamed from: u2 */
    private Animator f40653u2;

    /* renamed from: v */
    private ActiveImageButton f40654v;

    /* renamed from: v0 */
    private boolean f40655v0;

    /* renamed from: v1 */
    private View f40656v1;

    /* renamed from: v2 */
    private Animator f40657v2;

    /* renamed from: w */
    private ActiveImageColorButton f40658w;

    /* renamed from: w0 */
    private int f40659w0;

    /* renamed from: w1 */
    private View f40660w1;

    /* renamed from: w2 */
    private Animator f40661w2;

    /* renamed from: x */
    private LinearLayout f40662x;

    /* renamed from: x0 */
    private ActiveImageColorButton f40663x0;

    /* renamed from: x1 */
    private View f40664x1;

    /* renamed from: x2 */
    private AnimatorSet f40665x2;

    /* renamed from: y */
    private View f40666y;

    /* renamed from: y0 */
    private ActiveImageColorButton f40667y0;

    /* renamed from: y1 */
    ImageButton f40668y1;

    /* renamed from: y2 */
    private Runnable f40669y2;

    /* renamed from: z */
    private ActiveImageColorButton f40670z;

    /* renamed from: z0 */
    private CropView f40671z0;

    /* renamed from: z1 */
    private ActiveImageButton f40672z1;

    /* renamed from: z2 */
    private Runnable f40673z2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$a */
    /* loaded from: classes3.dex */
    public class C7461a extends AnimatorListenerAdapter {
        C7461a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            try {
                if (CameraEditorController.this.f40641r2 != null && CameraEditorController.this.f40641r2.equals(animator)) {
                    CameraEditorController.this.f40641r2 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (CameraEditorController.this.f40641r2 != null && CameraEditorController.this.f40641r2.equals(animator)) {
                    CameraEditorController.this.f40641r2 = null;
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40638r, 8);
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40642s, 8);
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40650u, 8);
                    CameraEditorController.this.f40638r.setAlpha(1.0f);
                    CameraEditorController.this.f40642s.setAlpha(1.0f);
                    CameraEditorController.this.f40650u.setAlpha(1.0f);
                    if (!CameraEditorController.this.m38161u4()) {
                        CameraEditorController.this.setEditingMode(4);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$a0 */
    /* loaded from: classes3.dex */
    public class C7462a0 extends AbstractC31727b {
        C7462a0() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            C21349d c21349d = new C21349d((int) (((((i11 * 1.0f) / CameraEditorController.this.getWidth()) - 0.5f) * CameraEditorController.this.f40542O1.getNewWidth()) + (CameraEditorController.this.f40542O1.getWidth() >> 1)), (int) ((CameraEditorController.this.f40542O1.getHeight() >> 1) - ((((i12 * 1.0f) / CameraEditorController.this.getHeight()) - 0.5f) * CameraEditorController.this.f40542O1.getNewHeight())), (Math.min(CameraEditorController.this.f40542O1.getNewWidth(), CameraEditorController.this.f40542O1.getNewHeight()) / 10.0f) / 72.0f, 0.0f);
            C31972j4 m143377q = C28652r.m143349v().m143377q(str);
            if (m143377q != null) {
                c21349d.m110591z0(m143377q.m153699b(), m143377q.m153698a());
                c21349d.m110589x0(C28652r.m143348p());
                CameraEditorController.this.f40542O1.m39748F(c21349d);
            }
            if (CameraEditorController.this.f40496D.getVisibility() == 0) {
                CameraEditorController.this.setEditingMode(0);
                CameraEditorController.this.m38264c8(false, false);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: o */
        public void mo38307o(C25630b c25630b, int i11, int i12, int i13) {
            try {
                CameraEditorController.this.m37891L6("121N011");
                C28020b3 c28020b3 = C28020b3.f130648a;
                String m141207x = c28020b3.m141207x(c25630b);
                CameraEditorController.this.f40542O1.m39749G(c25630b, c28020b3.m141205v(c25630b, false), m141207x, CameraEditorController.this.getWidth(), CameraEditorController.this.getHeight());
                if (CameraEditorController.this.f40496D.getVisibility() == 0) {
                    CameraEditorController.this.setEditingMode(0);
                    CameraEditorController.this.m38264c8(false, false);
                }
                C3255n.m16562n().m16577u(c25630b);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: q */
        public void mo38308q(boolean z11, int i11) {
            boolean z12;
            if (z11) {
                DragToCloseLayout dragToCloseLayout = CameraEditorController.this.f40496D;
                if (i11 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dragToCloseLayout.setDisableTouch(z12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$b */
    /* loaded from: classes3.dex */
    public class C7463b extends AnimatorListenerAdapter {
        C7463b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (CameraEditorController.this.f40641r2 != null && CameraEditorController.this.f40641r2.equals(animator)) {
                    CameraEditorController.this.f40641r2 = null;
                    if ((!CameraEditorController.this.m38296v4()) & (!CameraEditorController.this.m38179w4())) {
                        CameraEditorController.this.f40630p.setAlpha(0.0f);
                    }
                    CameraEditorController.this.m38142r7();
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40572W, 8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$b0 */
    /* loaded from: classes3.dex */
    public class C7464b0 extends AnimatorListenerAdapter {
        C7464b0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC23136l9.m118744r1(CameraEditorController.this.f40671z0, 4);
            CameraEditorController.this.m38251U2("tip.any");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$c */
    /* loaded from: classes3.dex */
    public class C7465c implements LocationFilterPager.InterfaceC7674d {
        C7465c() {
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: j */
        public void mo38309j(String str) {
            CameraEditorController.this.m37891L6(str);
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: k */
        public void mo38310k(String str) {
            CameraEditorController.this.m38089l8(str);
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: l */
        public void mo38311l() {
            CameraEditorController.this.f40585a0 = null;
            if (CameraEditorController.this.f40542O1 != null) {
                CameraEditorController.this.f40542O1.setLocationFilter(null);
                CameraEditorController.this.f40542O1.mo39680s();
            }
            CameraEditorController.this.setEditingMode(0);
            CameraEditorController.this.m37944S7(false, true);
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: m */
        public void mo38312m() {
            CameraEditorController.this.f40538N1.m39010BS();
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: n */
        public void mo38313n(AbstractC2790b abstractC2790b) {
            try {
                CameraEditorController.this.f40585a0 = abstractC2790b;
                if (abstractC2790b == null) {
                    CameraEditorController.this.f40542O1.setLocationFilter(null);
                } else if (CameraEditorController.this.f40542O1 != null) {
                    CameraEditorController.this.f40542O1.setLocationFilter(abstractC2790b.m13446d(false));
                    CameraEditorController.this.f40542O1.mo39680s();
                }
                CameraEditorController.this.setEditingMode(0);
                CameraEditorController.this.m37944S7(false, true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$c0 */
    /* loaded from: classes3.dex */
    public class C7466c0 extends AnimatorListenerAdapter {
        C7466c0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            try {
                if (CameraEditorController.this.f40633p2 != null && CameraEditorController.this.f40633p2.equals(animator)) {
                    CameraEditorController.this.f40633p2 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (CameraEditorController.this.f40633p2 != null && CameraEditorController.this.f40633p2.equals(animator)) {
                    CameraEditorController.this.f40633p2 = null;
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40638r, 8);
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40642s, 8);
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40646t, 8);
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40650u, 8);
                    CameraEditorController.this.f40638r.setAlpha(1.0f);
                    CameraEditorController.this.f40642s.setAlpha(1.0f);
                    CameraEditorController.this.f40646t.setAlpha(1.0f);
                    CameraEditorController.this.f40650u.setAlpha(1.0f);
                    if (!CameraEditorController.this.m38290s4()) {
                        CameraEditorController.this.setEditingMode(3);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$d */
    /* loaded from: classes3.dex */
    public class C7467d extends AnimatorListenerAdapter {
        C7467d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            try {
                super.onAnimationCancel(animator);
                CameraEditorController.this.f40653u2 = null;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                super.onAnimationEnd(animator);
                if (animator == CameraEditorController.this.f40653u2) {
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40600f0, 8);
                    if (!C20024r.m103945n() && CameraEditorController.this.f40615k0 == 1.0f && !CameraEditorController.this.f40537N0 && CameraEditorController.this.f40498D1 != null) {
                        CameraEditorController.this.f40498D1.setVolume(100.0f, 100.0f);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$d0 */
    /* loaded from: classes3.dex */
    public class C7468d0 extends AnimatorListenerAdapter {
        C7468d0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            try {
                if (CameraEditorController.this.f40633p2 != null && CameraEditorController.this.f40633p2.equals(animator)) {
                    CameraEditorController.this.f40633p2 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (CameraEditorController.this.f40633p2 != null && CameraEditorController.this.f40633p2.equals(animator)) {
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40552R, 4);
                    CameraEditorController.this.f40633p2 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$e */
    /* loaded from: classes3.dex */
    public class C7469e implements VideoSpeedLayout.InterfaceC7781e {
        C7469e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m38315e() {
            try {
                if (CameraEditorController.this.f40538N1.f40897l1 == 2) {
                    CameraEditorController cameraEditorController = CameraEditorController.this;
                    cameraEditorController.f40577X1 = cameraEditorController.f40580Y1;
                    CameraEditorController.this.f40609i0 = 0;
                    CameraEditorController.this.f40612j0 = 0;
                    CameraEditorController cameraEditorController2 = CameraEditorController.this;
                    cameraEditorController2.f40635q0 = cameraEditorController2.f40609i0;
                    CameraEditorController cameraEditorController3 = CameraEditorController.this;
                    cameraEditorController3.f40639r0 = cameraEditorController3.f40612j0;
                    CameraEditorController.this.f40603g0 = 1;
                    CameraEditorController.this.setVideoSoundMode(true);
                    CameraEditorController.this.f40606h0 = 0;
                    if (CameraEditorController.this.f40669y2 != null) {
                        CameraEditorController.this.f40669y2.run();
                        CameraEditorController.this.f40669y2 = null;
                    } else if (CameraEditorController.this.f40538N1 != null && CameraEditorController.this.f40538N1.m92672lJ()) {
                        CameraEditorController.this.m38197y7();
                    }
                } else {
                    AbstractC23041d2.m118208g(CameraEditorController.this.f40580Y1);
                    CameraEditorController.this.f40580Y1 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout.InterfaceC7781e
        /* renamed from: a */
        public void mo38316a() {
            CameraEditorController.this.setEditingMode(0);
            CameraEditorController.this.m38272f8(false);
            if (CameraEditorController.this.m38113o4()) {
                C17870d c17870d = CameraEditorController.this.f40535M2;
                CameraEditorController cameraEditorController = CameraEditorController.this;
                c17870d.m94400a(cameraEditorController.f40638r, cameraEditorController.f40642s, cameraEditorController.f40650u);
            }
        }

        @Override // com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout.InterfaceC7781e
        /* renamed from: b */
        public void mo38317b(float f11) {
            int duration;
            CameraEditorController.this.f40615k0 = f11;
            if (f11 == 1.0f) {
                CameraEditorController.this.m37891L6("121N083");
            } else if (f11 == 2.0f) {
                CameraEditorController.this.m37891L6("121N082");
            } else if (f11 == 3.0f) {
                CameraEditorController.this.m37891L6("121N081");
            } else if (f11 == 0.5f) {
                CameraEditorController.this.m37891L6("121N085");
            } else if (f11 == 0.3f) {
                CameraEditorController.this.m37891L6("121N084");
            }
            if (CameraEditorController.this.f40510G1 && CameraEditorController.this.f40498D1 != null) {
                CameraEditorController.this.f40498D1.mo150225b(f11);
                CameraEditorController cameraEditorController = CameraEditorController.this;
                boolean z11 = true;
                if (cameraEditorController.f40615k0 == 1.0f && CameraEditorController.this.f40603g0 != 1) {
                    z11 = false;
                }
                cameraEditorController.setVideoSoundMode(z11);
                if (CameraEditorController.this.f40639r0 != 0) {
                    duration = CameraEditorController.this.f40639r0;
                } else {
                    duration = CameraEditorController.this.f40498D1.getDuration();
                }
                int m39081wQ = CameraEditorController.this.f40538N1.m39081wQ(CameraEditorController.this.f40599e2);
                if (f11 != 1.0f && f11 != 2.0f && f11 != 3.0f) {
                    if (f11 == 0.5f && duration * 2 > m39081wQ) {
                        CameraEditorController.this.f40498D1.mo150226c(m39081wQ / 2);
                    } else if (f11 == 0.3f && duration * 3 > m39081wQ) {
                        CameraEditorController.this.f40498D1.mo150226c(m39081wQ / 3);
                    }
                } else {
                    CameraEditorController.this.f40498D1.mo150226c(duration);
                }
                if (CameraEditorController.this.f40558S1 != null) {
                    CameraEditorController.this.f40558S1.mo38354l(CameraEditorController.this.f40577X1, f11);
                }
            }
        }

        @Override // com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout.InterfaceC7781e
        /* renamed from: c */
        public void mo38318c(boolean z11) {
            try {
                if (CameraEditorController.this.f40510G1 && CameraEditorController.this.f40498D1 != null) {
                    if (CameraEditorController.this.f40558S1 != null) {
                        CameraEditorController.this.f40558S1.mo38348f(CameraEditorController.this.f40577X1, z11);
                    }
                    if (z11) {
                        CameraEditorController.this.m37891L6("121N086");
                        if (CameraEditorController.this.f40639r0 > 10000) {
                            if (CameraEditorController.this.f40558S1 != null) {
                                CameraEditorController.this.f40558S1.mo38351i(CameraEditorController.this.f40577X1, ZAbstractBase.ZVU_PROCESS_FLUSH, 10000);
                                return;
                            }
                            return;
                        } else {
                            if (!TextUtils.isEmpty(CameraEditorController.this.f40580Y1)) {
                                CameraEditorController.this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.x0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CameraEditorController.C7469e.this.m38315e();
                                    }
                                });
                                return;
                            }
                            CameraEditorController cameraEditorController = CameraEditorController.this;
                            cameraEditorController.f40609i0 = cameraEditorController.f40635q0;
                            CameraEditorController cameraEditorController2 = CameraEditorController.this;
                            cameraEditorController2.f40612j0 = cameraEditorController2.f40639r0;
                            if (CameraEditorController.this.f40600f0 != null) {
                                CameraEditorController.this.f40600f0.setReverseButtonEnable(false);
                            }
                            CameraEditorController.this.m38006b3();
                            return;
                        }
                    }
                    CameraEditorController.this.m37903N2();
                    if (CameraEditorController.this.f40615k0 == 1.0f) {
                        CameraEditorController.this.setVideoSoundMode(false);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$e0 */
    /* loaded from: classes3.dex */
    public class C7470e0 implements DoodleView.InterfaceC12102c {
        C7470e0() {
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: a */
        public void mo38319a() {
            try {
                if (CameraEditorController.this.f40558S1 != null) {
                    CameraEditorController.this.f40558S1.mo38349g(false);
                }
                CameraEditorController.this.f40542O1.mo39680s();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: j */
        public void mo38320j(String str) {
            CameraEditorController.this.m37891L6(str);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: k */
        public void mo38321k(String str) {
            CameraEditorController.this.m38089l8(str);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: l */
        public void mo38322l() {
            CameraEditorController.this.m38239M7(false);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: m */
        public void mo38323m() {
            CameraEditorController.this.m38239M7(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$f */
    /* loaded from: classes3.dex */
    public class C7471f extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f40684p;

        C7471f(boolean z11) {
            this.f40684p = z11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z11) {
            int i11;
            ActiveImageButton activeImageButton = CameraEditorController.this.f40654v;
            int i12 = 8;
            if (!this.f40684p) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(activeImageButton, i11);
            ActiveImageColorButton activeImageColorButton = CameraEditorController.this.f40670z;
            if (this.f40684p) {
                i12 = 0;
            }
            AbstractC23136l9.m118744r1(activeImageColorButton, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$f0 */
    /* loaded from: classes3.dex */
    public class C7472f0 extends AnimatorListenerAdapter {
        C7472f0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            try {
                if (CameraEditorController.this.f40637q2 != null && CameraEditorController.this.f40637q2.equals(animator)) {
                    CameraEditorController.this.f40637q2 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (CameraEditorController.this.f40637q2 != null && CameraEditorController.this.f40637q2.equals(animator)) {
                    CameraEditorController.this.f40637q2 = null;
                    CameraEditorController.this.setVisibilityTopAndBottom(8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraEditorController$g */
    /* loaded from: classes3.dex */
    class C7473g implements C22949b.b {
        C7473g() {
        }

        @Override // m70.C22949b.b
        /* renamed from: a */
        public void mo38324a(AbstractC21351f abstractC21351f) {
            try {
                CameraEditorController.this.f40540O = false;
                CameraEditorController.this.m38252U6();
                CameraEditorController.this.m38253U7(true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // m70.C22949b.b
        /* renamed from: b */
        public void mo38325b() {
            CameraEditorController.this.m38213D2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$g0 */
    /* loaded from: classes3.dex */
    public class C7474g0 extends AnimatorListenerAdapter {
        C7474g0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            try {
                if (CameraEditorController.this.f40637q2 != null && CameraEditorController.this.f40637q2.equals(animator)) {
                    CameraEditorController.this.f40637q2 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (CameraEditorController.this.f40637q2 != null && CameraEditorController.this.f40637q2.equals(animator)) {
                    CameraEditorController.this.f40637q2 = null;
                    CameraEditorController.this.m37926Q3(8);
                    CameraEditorController.this.f40638r.setAlpha(1.0f);
                    CameraEditorController.this.f40646t.setAlpha(1.0f);
                    CameraEditorController.this.f40650u.setAlpha(1.0f);
                    if (!CameraEditorController.this.m38179w4() && !CameraEditorController.this.m38290s4()) {
                        CameraEditorController.this.f40642s.setAlpha(1.0f);
                    } else if (CameraEditorController.this.m38290s4()) {
                        CameraEditorController.this.f40672z1.setAlpha(1.0f);
                        CameraEditorController.this.f40668y1.setAlpha(1.0f);
                        CameraEditorController.this.f40664x1.setAlpha(1.0f);
                    }
                    if (!CameraEditorController.this.m38186x4() && !CameraEditorController.this.m38179w4()) {
                        CameraEditorController.this.f40630p.setAlpha(0.0f);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraEditorController$h */
    /* loaded from: classes3.dex */
    class C7475h implements C22949b.b {
        C7475h() {
        }

        @Override // m70.C22949b.b
        /* renamed from: a */
        public void mo38324a(AbstractC21351f abstractC21351f) {
            CameraEditorController.this.f40540O = false;
            CameraEditorController.this.m38252U6();
            CameraEditorController.this.m38253U7(false);
        }

        @Override // m70.C22949b.b
        /* renamed from: b */
        public void mo38325b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$h0 */
    /* loaded from: classes3.dex */
    public class C7476h0 implements DragToCloseLayout.InterfaceC16432a {
        C7476h0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m38327b(ValueAnimator valueAnimator) {
            try {
                CameraEditorController.this.f40496D.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: Dg */
        public void mo38328Dg(float f11) {
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: EC */
        public void mo38329EC(boolean z11) {
            try {
                CameraEditorController.this.f40496D.setForceInterceptTouch(true);
                if (!z11) {
                    CameraEditorController.this.m37891L6("122N012");
                    CameraEditorController.this.setEditingMode(0);
                    CameraEditorController.this.m38264c8(false, false);
                    CameraEditorController.this.f40496D.setTranslationY(0.0f);
                } else {
                    ValueAnimator ofInt = ValueAnimator.ofInt((int) CameraEditorController.this.f40496D.getTranslationY(), 0);
                    ofInt.setDuration(300L);
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.camera.e1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            CameraEditorController.C7476h0.this.m38327b(valueAnimator);
                        }
                    });
                    ofInt.start();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: f2 */
        public void mo38330f2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$i */
    /* loaded from: classes3.dex */
    public class C7477i implements MusicView.InterfaceC7682b {
        C7477i() {
        }

        @Override // com.zing.zalo.camera.music.p060ui.MusicView.InterfaceC7682b
        /* renamed from: l */
        public void mo38331l() {
            CameraEditorController cameraEditorController = CameraEditorController.this;
            cameraEditorController.m37964V6(cameraEditorController.getCurrentVisualDecor());
        }

        @Override // com.zing.zalo.camera.music.p060ui.MusicView.InterfaceC7682b
        /* renamed from: m */
        public void mo38332m(C20028b c20028b) {
            if (c20028b != null) {
                CameraEditorController.this.m37911O2(c20028b);
            }
        }

        @Override // com.zing.zalo.camera.music.p060ui.MusicView.InterfaceC7682b
        /* renamed from: n */
        public void mo38333n() {
            CameraEditorController.this.m38032e6();
        }

        @Override // com.zing.zalo.camera.music.p060ui.MusicView.InterfaceC7682b
        /* renamed from: o */
        public void mo38334o() {
            if (CameraEditorController.this.f40538N1 != null) {
                CameraEditorController.this.f40538N1.m39085yS();
            }
            CameraEditorController.this.m38256X2();
        }

        @Override // com.zing.zalo.camera.music.p060ui.MusicView.InterfaceC7682b
        /* renamed from: p */
        public void mo38335p(C25892l2.c cVar) {
            if (cVar != null) {
                CameraEditorController.this.m37955U3(cVar.m133553a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$i0 */
    /* loaded from: classes3.dex */
    public static class C7478i0 {

        /* renamed from: a */
        private boolean f40692a;

        /* renamed from: b */
        private boolean f40693b;

        /* renamed from: c */
        private List f40694c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m38343h() {
            this.f40692a = false;
            this.f40693b = false;
            this.f40694c = new ArrayList();
        }

        private C7478i0() {
            this.f40692a = false;
            this.f40693b = false;
            this.f40694c = new ArrayList();
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraEditorController$j */
    /* loaded from: classes3.dex */
    class C7479j implements C22949b.b {
        C7479j() {
        }

        @Override // m70.C22949b.b
        /* renamed from: a */
        public void mo38324a(AbstractC21351f abstractC21351f) {
            try {
                CameraEditorController.this.setEditingMode(2);
                CameraEditorController.this.m37879J3(2);
                if (abstractC21351f instanceof C21357l) {
                    CameraEditorController.this.f40516I.setEditingDecorText((C21357l) abstractC21351f);
                }
                CameraEditorController.this.f40542O1.m39760R(abstractC21351f);
                CameraEditorController.this.f40542O1.mo39680s();
                CameraEditorController.this.f40542O1.setTouchEnable(true);
                CameraEditorController.this.f40540O = false;
                CameraEditorController.this.f40538N1.m39082wS();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // m70.C22949b.b
        /* renamed from: b */
        public void mo38325b() {
            CameraEditorController.this.m38213D2();
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraEditorController$j0 */
    /* loaded from: classes3.dex */
    public interface InterfaceC7480j0 {
        /* renamed from: b */
        void mo38344b(C32123ta c32123ta);

        /* renamed from: c */
        void mo38345c(C27373c c27373c, String str);

        /* renamed from: d */
        void mo38346d();

        /* renamed from: e */
        void mo38347e(String str, String str2, C20612c c20612c);

        /* renamed from: f */
        void mo38348f(String str, boolean z11);

        /* renamed from: g */
        void mo38349g(boolean z11);

        /* renamed from: h */
        void mo38350h(int i11);

        /* renamed from: i */
        void mo38351i(String str, int i11, int i12);

        /* renamed from: j */
        void mo38352j();

        /* renamed from: k */
        void mo38353k(String str);

        /* renamed from: l */
        void mo38354l(String str, float f11);

        /* renamed from: m */
        void mo38355m(C27373c c27373c, String str);

        /* renamed from: n */
        void mo38356n(boolean z11, boolean z12);

        /* renamed from: o */
        void mo38357o(String str, String str2);
    }

    /* renamed from: com.zing.zalo.camera.CameraEditorController$k */
    /* loaded from: classes3.dex */
    class C7481k implements AbstractC22466g.b {
        C7481k() {
        }

        @Override // p322lf.AbstractC22466g.b
        /* renamed from: a */
        public void mo38358a(boolean z11) {
            if (z11) {
                if (!CameraEditorController.this.f40538N1.m78935DL()) {
                    CameraEditorController.this.f40538N1.mo49282B8(null, false);
                    return;
                }
                return;
            }
            CameraEditorController.this.f40538N1.mo49315c4();
        }

        @Override // p322lf.AbstractC22466g.b
        /* renamed from: b */
        public void mo38359b(boolean z11, C32123ta c32123ta) {
            CameraEditorController.this.f40538N1.mo49315c4();
            if (z11) {
                CameraEditorController.this.f40605g2 = true;
                if (CameraEditorController.this.f40558S1 != null) {
                    CameraEditorController.this.f40558S1.mo38344b(c32123ta);
                    return;
                }
                return;
            }
            CameraEditorController.this.m38076k3();
            ToastUtils.m89266n(AbstractC8020f0.str_process_video_recorded_error, new Object[0]);
        }

        @Override // p322lf.AbstractC22466g.b
        /* renamed from: c */
        public void mo38360c(int i11, String str) {
            int i12;
            CameraEditorController.this.m38046g6(true);
            CameraEditorController cameraEditorController = CameraEditorController.this;
            cameraEditorController.m37955U3(cameraEditorController.f40610i1);
            if (i11 == 0) {
                i12 = AbstractC8020f0.str_story_video_saved;
            } else {
                i12 = AbstractC8020f0.str_process_video_recorded_error;
            }
            ToastUtils.m89266n(i12, new Object[0]);
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraEditorController$l */
    /* loaded from: classes3.dex */
    class C7482l implements CaptionView.InterfaceC12092b {
        C7482l() {
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: a */
        public void mo38361a(AbstractC21351f abstractC21351f) {
            CameraEditorController.this.m37980X6(abstractC21351f);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: b */
        public void mo38362b(C21357l c21357l) {
            try {
                if (CameraEditorController.this.m38186x4()) {
                    CameraEditorController.this.setEditingMode(0);
                }
                if (c21357l != null) {
                    CameraEditorController.this.m37987Y6(c21357l);
                } else {
                    int textBottomMargin = ((CameraEditorController.this.f40516I.getTextBottomMargin() + (CameraEditorController.this.f40516I.getTextHeight() / 2)) - AbstractC23222t7.f112556e) - ((CameraEditorController.this.getHeight() - CameraEditorController.this.f40542O1.getHeight()) / 2);
                    if (CameraEditorController.this.f40544P) {
                        CameraEditorController.this.f40524K = r5.f40542O1.getWidth() >> 1;
                        CameraEditorController.this.f40528L = textBottomMargin;
                    }
                    CameraEditorController.this.f40544P = false;
                    CameraEditorController.this.f40542O1.setTouchEnable(true);
                    CameraEditorController.this.m38134q8();
                    CameraEditorController.this.m38217E2();
                }
                if (CameraEditorController.this.f40516I != null) {
                    CameraEditorController.this.f40516I.m67459i1();
                }
                AbstractC23136l9.m118744r1(CameraEditorController.this.f40516I, 8);
                CameraEditorController.this.f40584Z2.sendEmptyMessage(3);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: c */
        public void mo38363c(boolean z11) {
            if (CameraEditorController.this.m38226I4() && CameraEditorController.this.f40630p != null) {
                if (z11 && CameraEditorController.this.f40630p.getVisibility() == 8) {
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40630p, 0);
                } else if (!z11 && CameraEditorController.this.f40630p.getVisibility() == 0) {
                    AbstractC23136l9.m118744r1(CameraEditorController.this.f40630p, 8);
                }
            }
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: j */
        public void mo38364j(String str) {
            CameraEditorController.this.m37891L6(str);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: k */
        public void mo38365k(String str) {
            CameraEditorController.this.m38089l8(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$m */
    /* loaded from: classes3.dex */
    public class C7483m implements C22949b.b {
        C7483m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m38367d() {
            CameraEditorController.this.f40542O1.mo39680s();
        }

        @Override // m70.C22949b.b
        /* renamed from: a */
        public void mo38324a(AbstractC21351f abstractC21351f) {
            if (CameraEditorController.this.f40516I != null) {
                AbstractC23136l9.m118744r1(CameraEditorController.this.f40516I.getCaptionInputText(), 8);
            }
            if (CameraEditorController.this.f40558S1 != null) {
                CameraEditorController.this.f40558S1.mo38356n(true, true);
            }
            CameraEditorController.this.f40538N1.m39067oQ().setDisableTouch(false);
            CameraEditorController.this.f40542O1.setTouchEnable(true);
            if (abstractC21351f instanceof C21357l) {
                C21357l c21357l = (C21357l) abstractC21351f;
                if (c21357l.m110663N0()) {
                    c21357l.m110677z0(new C21357l.a() { // from class: com.zing.zalo.camera.y0
                        @Override // p276jt.C21357l.a
                        /* renamed from: a */
                        public final void mo39668a() {
                            CameraEditorController.C7483m.this.m38367d();
                        }
                    });
                }
            }
            CameraEditorController.this.f40540O = false;
            CameraEditorController.this.m38134q8();
            CameraEditorController.this.m38217E2();
        }

        @Override // m70.C22949b.b
        /* renamed from: b */
        public void mo38325b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$n */
    /* loaded from: classes3.dex */
    public class C7484n implements C30922b.c {
        C7484n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m38369d(long j11) {
            try {
                if (CameraEditorController.this.f40624n0 != null && CameraEditorController.this.f40498D1 != null && CameraEditorController.this.m38233K4()) {
                    if (j11 > CameraEditorController.this.f40624n0.getEndPoint()) {
                        CameraEditorController.this.f40498D1.pause();
                        int startPoint = CameraEditorController.this.f40624n0.getStartPoint();
                        CameraEditorController.this.m38080k7(startPoint, false, false);
                        CameraEditorController.this.f40624n0.setCurrentPosition(startPoint);
                        CameraEditorController.this.f40498D1.mo150227d();
                    } else {
                        CameraEditorController.this.f40624n0.setCurrentPosition(j11);
                    }
                }
                CameraEditorController.this.f40538N1.m39034RS(j11);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // p679yf.C30922b.c
        /* renamed from: a */
        public void mo38370a(final long j11) {
            if (CameraEditorController.this.m37859G4()) {
                CameraEditorController.this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraEditorController.C7484n.this.m38369d(j11);
                    }
                });
            }
        }

        @Override // p679yf.C30922b.c
        /* renamed from: b */
        public void mo38371b() {
            try {
                CameraEditorController.this.f40542O1.mo39680s();
                CameraEditorController.this.f40510G1 = true;
                if (CameraEditorController.this.f40669y2 != null) {
                    CameraEditorController cameraEditorController = CameraEditorController.this;
                    cameraEditorController.f40584Z2.post(cameraEditorController.f40669y2);
                    CameraEditorController.this.f40669y2 = null;
                }
                CameraEditorController.this.setIsWaitingForVideo(false);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$o */
    /* loaded from: classes3.dex */
    public class C7485o extends AnimatorListenerAdapter {
        C7485o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            CameraEditorController.this.f40661w2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (CameraEditorController.this.f40661w2 == animator) {
                AbstractC23136l9.m118744r1(CameraEditorController.this.f40533M0, 8);
                AbstractC23136l9.m118744r1(CameraEditorController.this.f40630p, 8);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.CameraEditorController$p */
    /* loaded from: classes3.dex */
    class HandlerC7486p extends Handler {
        HandlerC7486p(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        CameraEditorController.this.m37854F6((RectF) message.obj);
                    } else if (i11 != 3) {
                        if (i11 != 4) {
                            switch (i11) {
                                case 9:
                                    CameraEditorController.this.m38146s2(((Integer) message.obj).intValue());
                                    break;
                                case 10:
                                    CameraEditorController.this.m38160u3(((Integer) message.obj).intValue());
                                    break;
                                case 11:
                                    CameraEditorController.this.m38058i3();
                                    break;
                                case 12:
                                    if (!CameraEditorController.this.f40538N1.m78935DL()) {
                                        CameraEditorController.this.f40538N1.mo49282B8(null, false);
                                        break;
                                    }
                                    break;
                            }
                        } else if (CameraEditorController.this.f40538N1 != null && CameraEditorController.this.f40538N1.m92672lJ() && !CameraEditorController.this.f40594d0) {
                            CameraEditorController.this.f40538N1.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_loading), true);
                        }
                    } else {
                        CameraEditorController.this.f40538N1.m39060lT(true);
                    }
                } else {
                    CameraEditorController.this.f40572W.m39370b();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$q */
    /* loaded from: classes3.dex */
    public class C7487q implements AbstractC27985d.h {
        C7487q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m38373d(C27373c c27373c) {
            AbstractC23280z4.m120306R(c27373c.m140220E(), Environment.DIRECTORY_DCIM, AbstractC23041d2.m118212k(c27373c.m140220E()), 0L, false, false, new SensitiveData("gallery_save_video_csc_after_send", "comm_csc"));
        }

        @Override // ve.AbstractC27985d.h
        /* renamed from: a */
        public void mo38374a(boolean z11) {
            if (z11) {
                if (!CameraEditorController.this.f40538N1.m78935DL()) {
                    CameraEditorController.this.f40538N1.mo49282B8(null, false);
                    return;
                }
                return;
            }
            CameraEditorController.this.f40538N1.mo49315c4();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x001c, B:10:0x0027, B:12:0x002f, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:27:0x005b, B:29:0x005f, B:30:0x0061, B:32:0x0067, B:33:0x006b, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:46:0x00c5, B:47:0x00d2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x001c, B:10:0x0027, B:12:0x002f, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:27:0x005b, B:29:0x005f, B:30:0x0061, B:32:0x0067, B:33:0x006b, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:46:0x00c5, B:47:0x00d2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x001c, B:10:0x0027, B:12:0x002f, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:27:0x005b, B:29:0x005f, B:30:0x0061, B:32:0x0067, B:33:0x006b, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:46:0x00c5, B:47:0x00d2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x001c, B:10:0x0027, B:12:0x002f, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:27:0x005b, B:29:0x005f, B:30:0x0061, B:32:0x0067, B:33:0x006b, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:46:0x00c5, B:47:0x00d2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x001c, B:10:0x0027, B:12:0x002f, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:27:0x005b, B:29:0x005f, B:30:0x0061, B:32:0x0067, B:33:0x006b, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:46:0x00c5, B:47:0x00d2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x001c, B:10:0x0027, B:12:0x002f, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:27:0x005b, B:29:0x005f, B:30:0x0061, B:32:0x0067, B:33:0x006b, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:46:0x00c5, B:47:0x00d2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c5 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x001c, B:10:0x0027, B:12:0x002f, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:27:0x005b, B:29:0x005f, B:30:0x0061, B:32:0x0067, B:33:0x006b, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:46:0x00c5, B:47:0x00d2), top: B:1:0x0000 }] */
        @Override // ve.AbstractC27985d.h
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo38375b(boolean z11, final C27373c c27373c) {
            boolean z12;
            boolean z13;
            int i11;
            try {
                CameraEditorController.this.setBtnFinishEditEnabled(true);
                if (z11) {
                    CameraEditorController.this.f40605g2 = true;
                    c27373c.f128948U = CameraEditorController.this.f40659w0;
                    VideoBlendingParam videoBlendingParam = c27373c.f128947T;
                    boolean z14 = false;
                    if (videoBlendingParam.f48264P == 0 && videoBlendingParam.f48265Q == 0) {
                        z12 = false;
                        if (CameraEditorController.this.m38225I3() && CameraEditorController.this.f40554R1 != 4 && !z12) {
                            z13 = false;
                            if (CameraEditorController.this.m37844E4() && CameraEditorController.this.f40599e2 && CameraEditorController.this.m37913O4(c27373c)) {
                                z14 = true;
                            }
                            if (z13 != c27373c.f128943P) {
                                c27373c.f128943P = z13;
                            }
                            if (z14 != c27373c.f128942O) {
                                c27373c.f128942O = z14;
                            }
                            i11 = c27373c.f128947T.f48265Q;
                            if (i11 != 0) {
                                c27373c.m140226K(i11);
                            }
                            c27373c.f128946S = !CameraEditorController.this.f40599e2;
                            c27373c.f128947T.f48254F = AbstractC22470k.m116150b(CameraEditorController.this.f40599e2, CameraEditorController.this.f40534M1.f41129s, CameraEditorController.this.f40538N1.f40899m1);
                            if (c27373c.f128947T.f48254F && !c27373c.f128943P && !c27373c.f128942O) {
                                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.a1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CameraEditorController.C7487q.m38373d(C27373c.this);
                                    }
                                });
                            }
                            if (c27373c.f128942O && !c27373c.f128943P) {
                                CameraEditorController.this.f40620l2.m107272N(true);
                                if (CameraEditorController.this.f40617k2 != null) {
                                    CameraEditorController cameraEditorController = CameraEditorController.this;
                                    cameraEditorController.f40617k2 = C20614e.m107307e(cameraEditorController.f40617k2, true);
                                }
                            }
                            CameraEditorController.this.m38178w3(c27373c);
                        }
                        z13 = true;
                        if (CameraEditorController.this.m37844E4()) {
                            z14 = true;
                        }
                        if (z13 != c27373c.f128943P) {
                        }
                        if (z14 != c27373c.f128942O) {
                        }
                        i11 = c27373c.f128947T.f48265Q;
                        if (i11 != 0) {
                        }
                        c27373c.f128946S = !CameraEditorController.this.f40599e2;
                        c27373c.f128947T.f48254F = AbstractC22470k.m116150b(CameraEditorController.this.f40599e2, CameraEditorController.this.f40534M1.f41129s, CameraEditorController.this.f40538N1.f40899m1);
                        if (c27373c.f128947T.f48254F) {
                            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.a1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CameraEditorController.C7487q.m38373d(C27373c.this);
                                }
                            });
                        }
                        if (c27373c.f128942O) {
                            CameraEditorController.this.f40620l2.m107272N(true);
                            if (CameraEditorController.this.f40617k2 != null) {
                            }
                        }
                        CameraEditorController.this.m38178w3(c27373c);
                    }
                    z12 = true;
                    if (CameraEditorController.this.m38225I3()) {
                        z13 = false;
                        if (CameraEditorController.this.m37844E4()) {
                        }
                        if (z13 != c27373c.f128943P) {
                        }
                        if (z14 != c27373c.f128942O) {
                        }
                        i11 = c27373c.f128947T.f48265Q;
                        if (i11 != 0) {
                        }
                        c27373c.f128946S = !CameraEditorController.this.f40599e2;
                        c27373c.f128947T.f48254F = AbstractC22470k.m116150b(CameraEditorController.this.f40599e2, CameraEditorController.this.f40534M1.f41129s, CameraEditorController.this.f40538N1.f40899m1);
                        if (c27373c.f128947T.f48254F) {
                        }
                        if (c27373c.f128942O) {
                        }
                        CameraEditorController.this.m38178w3(c27373c);
                    }
                    z13 = true;
                    if (CameraEditorController.this.m37844E4()) {
                    }
                    if (z13 != c27373c.f128943P) {
                    }
                    if (z14 != c27373c.f128942O) {
                    }
                    i11 = c27373c.f128947T.f48265Q;
                    if (i11 != 0) {
                    }
                    c27373c.f128946S = !CameraEditorController.this.f40599e2;
                    c27373c.f128947T.f48254F = AbstractC22470k.m116150b(CameraEditorController.this.f40599e2, CameraEditorController.this.f40534M1.f41129s, CameraEditorController.this.f40538N1.f40899m1);
                    if (c27373c.f128947T.f48254F) {
                    }
                    if (c27373c.f128942O) {
                    }
                    CameraEditorController.this.m38178w3(c27373c);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$r */
    /* loaded from: classes3.dex */
    public class C7488r extends AbstractC24416f {
        C7488r(ViewGroup viewGroup) {
            super(viewGroup);
        }

        @Override // p401or.AbstractC24416f
        /* renamed from: b */
        public void mo38376b() {
            super.mo38376b();
            if (CameraEditorController.this.f40565U0 != null) {
                CameraEditorController.this.f40565U0.setBackgroundColor(0);
            }
            CameraEditorController.this.f40573W0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$s */
    /* loaded from: classes3.dex */
    public class C7489s extends AbstractC20038l {

        /* renamed from: c */
        final /* synthetic */ View f40704c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7489s(ViewGroup viewGroup, View view) {
            super(viewGroup);
            this.f40704c = view;
        }

        @Override // p208hf.AbstractC20038l
        /* renamed from: b */
        public void mo38377b() {
            super.mo38377b();
            this.f40704c.setBackground(null);
            CameraEditorController.this.f40595d1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$t */
    /* loaded from: classes3.dex */
    public class C7490t extends AnimatorListenerAdapter {
        C7490t() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                CameraEditorController.this.f40542O1.mo39680s();
                CameraEditorController.this.m37869H6();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$u */
    /* loaded from: classes3.dex */
    public class C7491u extends AnimatorListenerAdapter {
        C7491u() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CameraEditorController.this.setVisibilityTopAndBottom(4);
            AbstractC23136l9.m118744r1(CameraEditorController.this.f40671z0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$v */
    /* loaded from: classes3.dex */
    public class C7492v extends AnimatorListenerAdapter {
        C7492v() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CameraEditorController.this.f40542O1.mo39680s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$w */
    /* loaded from: classes3.dex */
    public class C7493w extends AnimatorListenerAdapter {
        C7493w() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CameraEditorController.this.m38281j3(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$x */
    /* loaded from: classes3.dex */
    public class C7494x implements DocumentScanView.InterfaceC11249b {
        C7494x() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m38380f() {
            CameraEditorController.this.m38240N3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m38381g() {
            CameraEditorController.this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.c1
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.C7494x.this.m38380f();
                }
            });
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: a */
        public void mo38382a(Bitmap bitmap, boolean z11) {
            if (!CameraEditorController.this.m38140r4()) {
                return;
            }
            if (!z11) {
                Bitmap m38153t3 = CameraEditorController.this.m38153t3(bitmap);
                CameraEditorController.this.f40553R0 = m38153t3;
                CameraEditorController.this.m38266d3();
                CameraEditorController.this.f40542O1.getRender().m98302l2();
                CameraEditorController.this.f40542O1.setSupportFadeInAnimation(false);
                CameraEditorController.this.f40542O1.m39786t0(m38153t3, String.valueOf(m38153t3.getGenerationId()), new C29617j.a() { // from class: com.zing.zalo.camera.b1
                    @Override // p643xf.C29617j.a
                    /* renamed from: j */
                    public final void mo38280j() {
                        CameraEditorController.C7494x.this.m38381g();
                    }
                });
                if (CameraEditorController.this.f40558S1 != null) {
                    CameraEditorController.this.f40558S1.mo38352j();
                }
                CameraEditorController.this.f40614j2.f40692a = true;
                return;
            }
            CameraEditorController.this.m38240N3();
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: b */
        public void mo38383b() {
            CameraEditorController.this.m38240N3();
            CameraEditorController.this.m37969W2();
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: c */
        public void mo38384c() {
            CameraEditorController.this.m38240N3();
            if (CameraEditorController.this.f40557S0 && !CameraEditorController.this.m37851F3()) {
                CameraEditorController.this.m37969W2();
                if (CameraEditorController.this.f40558S1 != null) {
                    CameraEditorController.this.f40558S1.mo38346d();
                }
            }
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: j */
        public void mo38385j(String str) {
            CameraEditorController.this.m37891L6(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$y */
    /* loaded from: classes3.dex */
    public class C7495y implements C28193t5.b {
        C7495y() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m38387e(AbstractC2790b abstractC2790b, List list) {
            try {
                CameraEditorController.this.f40584Z2.removeMessages(4);
                if (CameraEditorController.this.f40538N1 != null && !CameraEditorController.this.f40538N1.mo60294yp()) {
                    CameraEditorController.this.f40538N1.mo49315c4();
                }
                if (abstractC2790b != null) {
                    AbstractC23309i.m121687Zp(abstractC2790b.f11109a);
                    CameraEditorController.this.setLocationFilterIntro(abstractC2790b);
                }
                CameraEditorController.this.setLocationFilter(list);
                if (!CameraEditorController.this.f40594d0) {
                    CameraEditorController.this.m37944S7(true, true);
                } else {
                    CameraEditorController.this.f40594d0 = false;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // vg.C28193t5.b
        /* renamed from: a */
        public void mo38388a() {
            CameraEditorController.this.f40584Z2.removeMessages(4);
            CameraEditorController.this.f40591c0 = false;
            if (CameraEditorController.this.f40538N1 != null) {
                CameraEditorController.this.f40538N1.mo49315c4();
                CameraEditorController.this.f40538N1.removeDialog(6);
                CameraEditorController.this.f40538N1.showDialog(6);
            }
            CameraEditorController.this.setEditingMode(0);
            CameraEditorController.this.m37879J3(4);
        }

        @Override // vg.C28193t5.b
        /* renamed from: b */
        public void mo38389b() {
            try {
                CameraEditorController.this.f40584Z2.removeMessages(4);
                CameraEditorController.this.f40591c0 = false;
                if (CameraEditorController.this.f40538N1 != null) {
                    CameraEditorController.this.f40538N1.mo49315c4();
                    CameraEditorController.this.f40538N1.removeDialog(2);
                    CameraEditorController.this.f40538N1.showDialog(2);
                }
                CameraEditorController.this.setEditingMode(0);
                CameraEditorController.this.m37879J3(4);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }

        @Override // vg.C28193t5.b
        /* renamed from: c */
        public void mo38390c(final List list) {
            CameraEditorController.this.f40591c0 = false;
            final AbstractC2790b m141763g = C28193t5.m141757e().m141763g();
            CameraEditorController.this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.d1
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.C7495y.this.m38387e(m141763g, list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.CameraEditorController$z */
    /* loaded from: classes3.dex */
    public class C7496z extends AnimatorListenerAdapter {
        C7496z() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i11;
            super.onAnimationEnd(animator);
            CameraEditorController cameraEditorController = CameraEditorController.this;
            FrameLayout frameLayout = cameraEditorController.f40638r;
            int i12 = 8;
            if (cameraEditorController.f40546P1 == 10) {
                i11 = 4;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(frameLayout, i11);
            CameraEditorController cameraEditorController2 = CameraEditorController.this;
            ExpandableActionView expandableActionView = cameraEditorController2.f40650u;
            if (cameraEditorController2.f40546P1 == 10) {
                i12 = 4;
            }
            AbstractC23136l9.m118744r1(expandableActionView, i12);
        }
    }

    public CameraEditorController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40634q = null;
        this.f40504F = true;
        this.f40508G = false;
        this.f40532M = 0.0f;
        this.f40536N = 1.0f;
        this.f40540O = false;
        this.f40544P = false;
        this.f40591c0 = false;
        this.f40594d0 = false;
        this.f40603g0 = 0;
        this.f40606h0 = 0;
        this.f40609i0 = 0;
        this.f40612j0 = 0;
        this.f40615k0 = 1.0f;
        this.f40618l0 = null;
        this.f40627o0 = 0;
        this.f40631p0 = 0;
        this.f40635q0 = 0;
        this.f40639r0 = 0;
        this.f40643s0 = false;
        this.f40647t0 = 0;
        this.f40655v0 = false;
        this.f40659w0 = -1;
        this.f40671z0 = null;
        this.f40493C0 = null;
        this.f40497D0 = false;
        this.f40501E0 = false;
        this.f40505F0 = false;
        this.f40509G0 = false;
        this.f40513H0 = false;
        this.f40517I0 = 0;
        this.f40537N0 = false;
        this.f40545P0 = null;
        this.f40549Q0 = null;
        this.f40553R0 = null;
        this.f40557S0 = false;
        this.f40569V0 = new PrivacyInfo();
        this.f40573W0 = null;
        this.f40595d1 = null;
        this.f40607h1 = -1;
        this.f40610i1 = -1;
        this.f40622m1 = -1.0f;
        this.f40625n1 = -1.0f;
        this.f40628o1 = 0.0f;
        this.f40632p1 = 1.0f;
        this.f40636q1 = AbstractC23222t7.f112518D;
        this.f40640r1 = false;
        this.f40644s1 = false;
        this.f40502E1 = false;
        this.f40506F1 = false;
        this.f40510G1 = false;
        this.f40514H1 = true;
        this.f40518I1 = false;
        this.f40522J1 = false;
        this.f40530L1 = false;
        this.f40534M1 = CameraInputParams.m39203m();
        this.f40546P1 = 0;
        this.f40550Q1 = false;
        this.f40554R1 = 2;
        this.f40570V1 = -1;
        this.f40583Z1 = null;
        this.f40593c2 = -1;
        this.f40596d2 = false;
        this.f40599e2 = false;
        this.f40602f2 = false;
        this.f40605g2 = false;
        this.f40608h2 = false;
        this.f40611i2 = false;
        this.f40614j2 = new C7478i0();
        this.f40633p2 = null;
        this.f40637q2 = null;
        this.f40641r2 = null;
        this.f40653u2 = null;
        this.f40657v2 = null;
        this.f40661w2 = null;
        this.f40665x2 = null;
        this.f40669y2 = null;
        this.f40673z2 = null;
        this.f40535M2 = new C17870d();
        this.f40539N2 = AbstractC21345a.m110557a(null);
        this.f40543O2 = 0;
        this.f40547P2 = new C3450a();
        this.f40551Q2 = new C7481k();
        this.f40555R2 = new C21362q();
        this.f40563T2 = new C7473g();
        this.f40567U2 = new C7475h();
        this.f40571V2 = new C7479j();
        this.f40575W2 = new C7482l();
        this.f40578X2 = new C7483m();
        this.f40581Y2 = new C7484n();
        this.f40584Z2 = new HandlerC7486p(Looper.getMainLooper());
    }

    /* renamed from: A2 */
    private void m37815A2() {
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null && locationFilterPager.isShown()) {
            this.f40584Z2.sendEmptyMessage(1);
        }
    }

    /* renamed from: A3 */
    private View m37816A3(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2030073846:
                if (str.equals("tip.camera.story.privacy_setting")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1987426390:
                if (str.equals("tip.camera.preview.caption")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1363390709:
                if (str.equals("tip.camera.preview.speed")) {
                    c11 = 2;
                    break;
                }
                break;
            case -135284991:
                if (str.equals("tip.camera.preview.sticker")) {
                    c11 = 3;
                    break;
                }
                break;
            case 254497493:
                if (str.equals("tip.camera.preview.doodle")) {
                    c11 = 4;
                    break;
                }
                break;
            case 306140468:
                if (str.equals("tip.camera.preview.filter")) {
                    c11 = 5;
                    break;
                }
                break;
            case 470461041:
                if (str.equals("tip.camera.preview.location")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1241976534:
                if (str.equals("tip.camera.story.music")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1981570898:
                if (str.equals("tip.camera.beauty")) {
                    c11 = '\b';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return this.f40561T0;
            case 1:
                return this.f40512H;
            case 2:
                return this.f40597e0;
            case 3:
                return this.f40484A;
            case 4:
                return this.f40548Q;
            case 5:
                return this.f40651u0;
            case 6:
                return this.f40568V;
            case 7:
                return this.f40576X0;
            case '\b':
                return this.f40488B;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A5 */
    public /* synthetic */ void m37817A5(final String str, final boolean z11, final int i11, final boolean z12, final String str2) {
        final int m38015c3 = m38015c3(this.f40577X1, str);
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.camera.d0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38202z5(m38015c3, str, z11, i11, z12, str2);
            }
        });
    }

    /* renamed from: A8 */
    private void m37818A8(int i11, int i12) {
        try {
            if (!this.f40599e2) {
                this.f40554R1 = this.f40538N1.m39084yQ().getPreviewRecordMode();
            }
            if (this.f40554R1 == 4) {
                this.f40609i0 = i11;
                this.f40612j0 = i12;
                this.f40603g0 = 2;
                return;
            }
            this.f40606h0 = 0;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: B2 */
    private void m37822B2(boolean z11) {
        RectF rectF;
        try {
            if (z11) {
                if (!this.f40671z0.f41502v.m39464A()) {
                    this.f40671z0.f41502v.setAspectRatioX(1);
                    this.f40671z0.f41502v.setAspectRatioY(1);
                    this.f40671z0.f41502v.setFixedAspectRatio(true);
                    int newWidth = this.f40542O1.getNewWidth();
                    int newHeight = this.f40542O1.getNewHeight();
                    if (newWidth < newHeight) {
                        float f11 = (newHeight - newWidth) / 2.0f;
                        float f12 = newHeight;
                        rectF = new RectF(0.0f, f11 / f12, 1.0f, (f12 - f11) / f12);
                    } else {
                        float f13 = (newWidth - newHeight) / 2.0f;
                        float f14 = newWidth;
                        rectF = new RectF(f13 / f14, 0.0f, (f14 - f13) / f14, 1.0f);
                    }
                    m38173v8(this.f40542O1.getWidth(), this.f40542O1.getHeight(), rectF);
                }
                ((ImageView) findViewById(AbstractC6918a0.btn_square_crop)).setImageResource(AbstractC16803z.icn_crop_1_1_active);
                return;
            }
            this.f40671z0.f41502v.setFixedAspectRatio(false);
            m38173v8(this.f40542O1.getWidth(), this.f40542O1.getHeight(), new RectF(0.0f, 0.0f, 1.0f, 1.0f));
            ((ImageView) findViewById(AbstractC6918a0.btn_square_crop)).setImageResource(AbstractC16803z.icn_crop_1_1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: B3 */
    private void m37823B3(final boolean z11) {
        File file;
        if (!TextUtils.isEmpty(this.f40583Z1)) {
            if (z11) {
                file = AbstractC21943a.m114581e();
            } else {
                file = AbstractC23280z4.m120294F(this.f40583Z1);
            }
        } else {
            file = null;
        }
        if (this.f40534M1.m39213b()) {
            if (this.f40534M1.f41088G) {
                file = AbstractC23280z4.m120339m();
            }
            if (this.f40534M1.f41089H) {
                file = AbstractC23280z4.m120341n();
            }
            if (this.f40534M1.f41086E) {
                file = AbstractC23280z4.m120349r();
            }
        } else if (m37852F4() && this.f40534M1.f41129s == 4) {
            file = AbstractC23280z4.m120345p();
        }
        if (this.f40534M1.f41096O) {
            file = AbstractC23280z4.m120333j();
        }
        m38053h7(file, new AbstractC27985d.d() { // from class: com.zing.zalo.camera.q
            @Override // ve.AbstractC27985d.d
            /* renamed from: a */
            public final void mo39425a(int i11, String str) {
                CameraEditorController.this.m38024d5(z11, i11, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B5 */
    public /* synthetic */ void m37824B5(InterfaceC17463d interfaceC17463d, int i11) {
        C22052u.m115085y().m115093W();
        m38076k3();
        m38088l7();
        interfaceC17463d.dismiss();
    }

    /* renamed from: B6 */
    private void m37825B6() {
        boolean z11;
        if (this.f40540O) {
            return;
        }
        VideoSpeedLayout videoSpeedLayout = this.f40600f0;
        if (videoSpeedLayout != null && videoSpeedLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            m37891L6("121N080");
        }
        if (!z11) {
            AbstractC28025b8.m141442M("tip.camera.preview.speed");
            m38249T2("tip.camera.preview.speed");
        }
        if (!z11 && m38113o4()) {
            this.f40535M2.m94401b(this.f40638r, this.f40642s, this.f40650u);
        }
        m38272f8(!z11);
    }

    /* renamed from: B8 */
    private void m37826B8(final String str) {
        try {
            this.f40605g2 = true;
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.z
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37868H5(str);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: C2 */
    private void m37830C2(final boolean z11) {
        this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.w0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m37927Q4(z11);
            }
        });
    }

    /* renamed from: C3 */
    private void m37831C3(String str) {
        int i11;
        m38076k3();
        this.f40538N1.mo49315c4();
        if (!str.isEmpty()) {
            AbstractC20887g.m109229g(21000, 21008, str);
        }
        if (!AbstractC23238v2.m119726k()) {
            i11 = AbstractC8020f0.str_error_full_sdcard_more_descriptive;
        } else {
            i11 = AbstractC8020f0.error_general;
        }
        ToastUtils.m89266n(i11, new Object[0]);
    }

    /* renamed from: C7 */
    private void m37833C7(Bitmap bitmap) {
        m37879J3(11);
        setEditingMode(11);
        setVisibilityTopAndBottom(4);
        DocumentScanView documentScanView = this.f40541O0;
        if (documentScanView == null || documentScanView.getParent() == null) {
            this.f40541O0 = m37962V3();
            m37850F2();
        }
        AbstractC23136l9.m118744r1(this.f40541O0, 0);
        this.f40541O0.bringToFront();
        this.f40541O0.setViewArgs(C26490b.m136452a(bitmap));
        InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
        if (interfaceC7480j0 != null) {
            interfaceC7480j0.mo38349g(false);
        }
    }

    /* renamed from: C8 */
    private void m37834C8() {
        try {
            if (!TextUtils.isEmpty(this.f40617k2) && this.f40623m2 == null) {
                JSONObject m107304b = C20614e.m107304b(m38304z3(this.f40583Z1, false));
                JSONObject jSONObject = new JSONObject(this.f40617k2);
                jSONObject.put("ofs", m107304b);
                m38165u8(jSONObject.toString(), null);
                AbstractC20110a.m104544m(this.f40617k2, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: D3 */
    private void m37838D3(final boolean z11) {
        if (!TextUtils.isEmpty(this.f40574W1)) {
            setBtnFinishEditEnabled(true);
            m38170v3(this.f40574W1);
        } else {
            setBtnFinishEditEnabled(true);
            m38170v3(this.f40583Z1);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.u
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m38031e5(z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D5 */
    public /* synthetic */ void m37839D5(PrivacyInfo privacyInfo) {
        m38218E3(privacyInfo);
        m37941S2();
    }

    /* renamed from: D8 */
    private void m37840D8() {
        if (!m38161u4() && !m38179w4() && !m38290s4()) {
            AbstractC23136l9.m118744r1(this.f40642s, 0);
            AbstractC23136l9.m118744r1(this.f40642s, 0);
            AbstractC23136l9.m118744r1(this.f40646t, 0);
        } else if (m38290s4()) {
            AbstractC23136l9.m118744r1(this.f40668y1, 0);
            AbstractC23136l9.m118744r1(this.f40664x1, 0);
            AbstractC23136l9.m118744r1(this.f40672z1, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E4 */
    public boolean m37844E4() {
        if (!AbstractC22470k.m116158j(this.f40534M1.f41129s, ZaloCameraView.f40829O2) && !AbstractC22470k.m116158j(this.f40534M1.f41129s, 5) && ((!AbstractC22470k.m116158j(this.f40534M1.f41129s, 2) || this.f40554R1 != 2) && this.f40534M1.f41129s != 9)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E5 */
    public /* synthetic */ void m37845E5() {
        ArrayList arrayList;
        try {
            C24417g c24417g = C24417g.f117907a;
            int m127705g = c24417g.m127705g(true);
            final PrivacyInfo privacyInfo = new PrivacyInfo(m127705g);
            if (m127705g == 2 || m127705g == 3) {
                privacyInfo = c24417g.m127704f(m127705g, false);
            }
            if (c24417g.m127703e()) {
                if (privacyInfo.m45153y() && (arrayList = privacyInfo.f45974q) != null && arrayList.isEmpty()) {
                }
                post(new Runnable() { // from class: com.zing.zalo.camera.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraEditorController.this.m37839D5(privacyInfo);
                    }
                });
            }
            privacyInfo = new PrivacyInfo(0);
            post(new Runnable() { // from class: com.zing.zalo.camera.t
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37839D5(privacyInfo);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: E8 */
    private void m37846E8() {
        if (this.f40538N1.m92672lJ()) {
            this.f40669y2 = new Runnable() { // from class: com.zing.zalo.camera.n
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37874I5();
                }
            };
            if (!this.f40538N1.m78935DL()) {
                this.f40538N1.mo49282B8(null, true);
            }
        }
    }

    /* renamed from: F2 */
    private void m37850F2() {
        ZaloCameraView zaloCameraView;
        ExpandableActionView expandableActionView;
        if (!AbstractC26681b.f126358c || (zaloCameraView = this.f40538N1) == null || zaloCameraView.m92676n2().mo35567d1()) {
            return;
        }
        FrameLayout frameLayout = this.f40638r;
        if (frameLayout != null && this.f40487A2 == null) {
            AbstractC32226c.b bVar = new AbstractC32226c.b(frameLayout);
            this.f40487A2 = bVar;
            bVar.f148631c = true;
            this.f40538N1.m92682pK(bVar);
        }
        if (m38113o4() && (expandableActionView = this.f40650u) != null && this.f40531L2 == null) {
            AbstractC32226c.b bVar2 = new AbstractC32226c.b(expandableActionView.getActionContainerView());
            this.f40531L2 = bVar2;
            bVar2.f148631c = true;
            this.f40538N1.m92682pK(bVar2);
        }
        DragToCloseLayout dragToCloseLayout = this.f40496D;
        if (dragToCloseLayout != null && this.f40491B2 == null) {
            AbstractC32226c.b bVar3 = new AbstractC32226c.b(dragToCloseLayout);
            this.f40491B2 = bVar3;
            bVar3.f148631c = true;
            this.f40538N1.m92682pK(bVar3);
        }
        DoodleView doodleView = this.f40552R;
        if (doodleView != null && doodleView.getTopPanel() != null && this.f40495C2 == null) {
            AbstractC32226c.b bVar4 = new AbstractC32226c.b(this.f40552R.getTopPanel());
            this.f40495C2 = bVar4;
            bVar4.f148631c = true;
            this.f40538N1.m92682pK(bVar4);
        }
        CaptionView captionView = this.f40516I;
        if (captionView != null && this.f40499D2 == null) {
            AbstractC32226c.b bVar5 = new AbstractC32226c.b(captionView);
            this.f40499D2 = bVar5;
            bVar5.f148631c = true;
            bVar5.f148639k = false;
            this.f40538N1.m92682pK(bVar5);
        }
        MusicView musicView = this.f40601f1;
        if (musicView != null && musicView.getTopPanel() != null && this.f40503E2 == null) {
            AbstractC32226c.b bVar6 = new AbstractC32226c.b(this.f40601f1.getTopPanel());
            this.f40503E2 = bVar6;
            bVar6.f148631c = true;
            this.f40538N1.m92682pK(bVar6);
        }
        CropView cropView = this.f40671z0;
        if (cropView != null && cropView.getBtnBackCrop() != null && this.f40507F2 == null) {
            AbstractC32226c.b bVar7 = new AbstractC32226c.b(this.f40671z0.getBtnBackCrop());
            this.f40507F2 = bVar7;
            bVar7.f148631c = true;
            bVar7.f148639k = false;
            this.f40538N1.m92682pK(bVar7);
        }
        CropView cropView2 = this.f40671z0;
        if (cropView2 != null && cropView2.getBtnFinishCrop() != null && this.f40511G2 == null) {
            AbstractC32226c.b bVar8 = new AbstractC32226c.b(this.f40671z0.getBtnFinishCrop());
            this.f40511G2 = bVar8;
            bVar8.f148631c = true;
            bVar8.f148639k = false;
            this.f40538N1.m92682pK(bVar8);
        }
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null && locationFilterPager.getTopPanel() != null && this.f40515H2 == null) {
            AbstractC32226c.b bVar9 = new AbstractC32226c.b(this.f40572W.getTopPanel());
            this.f40515H2 = bVar9;
            bVar9.f148631c = true;
            this.f40538N1.m92682pK(bVar9);
        }
        LocationFilterPager locationFilterPager2 = this.f40572W;
        if (locationFilterPager2 != null && locationFilterPager2.getViewPager() != null && this.f40519I2 == null) {
            AbstractC32226c.b bVar10 = new AbstractC32226c.b(this.f40572W.getViewPager());
            this.f40519I2 = bVar10;
            bVar10.f148631c = true;
            bVar10.f148639k = false;
            bVar10.f148635g = AbstractC23222t7.f112579p0;
            this.f40538N1.m92682pK(bVar10);
        }
        VideoSpeedLayout videoSpeedLayout = this.f40600f0;
        if (videoSpeedLayout != null && videoSpeedLayout.getRightControlsLayout() != null && this.f40523J2 == null) {
            AbstractC32226c.b bVar11 = new AbstractC32226c.b(this.f40600f0.getRightControlsLayout());
            this.f40523J2 = bVar11;
            bVar11.f148631c = true;
            this.f40538N1.m92682pK(bVar11);
        }
        DocumentScanView documentScanView = this.f40541O0;
        if (documentScanView != null && documentScanView.getTopView() != null && this.f40527K2 == null) {
            AbstractC32226c.b bVar12 = new AbstractC32226c.b(this.f40541O0.getTopView());
            this.f40527K2 = bVar12;
            bVar12.f148631c = true;
            this.f40538N1.m92682pK(bVar12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F3 */
    public boolean m37851F3() {
        return this.f40553R0 != null;
    }

    /* renamed from: F4 */
    private boolean m37852F4() {
        int i11 = this.f40538N1.f40899m1;
        if (i11 == 0 || i11 == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F5 */
    public /* synthetic */ void m37853F5(String str) {
        boolean z11;
        if (this.f40599e2 && AbstractC23009a3.m117960k(str)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40623m2 = m38304z3(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F6 */
    public void m37854F6(RectF rectF) {
        this.f40671z0.m39483j(this.f40542O1.getNewWidth(), this.f40542O1.getNewHeight(), this.f40542O1.getWidth(), this.f40542O1.getHeight(), rectF, false, true);
    }

    /* renamed from: G3 */
    private boolean m37858G3() {
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null && locationFilterPager.getLocationFilter() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G4 */
    public boolean m37859G4() {
        InterfaceC30925e interfaceC30925e = this.f40498D1;
        if (interfaceC30925e != null && interfaceC30925e.isPlaying()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G5 */
    public /* synthetic */ void m37860G5(C32123ta c32123ta) {
        try {
            InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
            if (interfaceC7480j0 != null) {
                interfaceC7480j0.mo38344b(c32123ta);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: G6 */
    private void m37861G6() {
        this.f40671z0.m39483j(this.f40542O1.getNewWidth(), this.f40542O1.getNewHeight(), this.f40542O1.getWidth(), this.f40542O1.getHeight(), this.f40671z0.getCropOverlayRectInPercentage(), true, false);
    }

    /* renamed from: G7 */
    private void m37862G7() {
        boolean z11;
        VideoSpeedLayout videoSpeedLayout = this.f40600f0;
        if (videoSpeedLayout != null) {
            if (this.f40554R1 != 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            videoSpeedLayout.m39630i(z11);
        }
    }

    /* renamed from: H3 */
    private boolean m37866H3() {
        MusicView musicView = this.f40601f1;
        if (musicView != null && musicView.getSongData() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: H4 */
    private boolean m37867H4() {
        ActiveImageColorButton activeImageColorButton = this.f40658w;
        if (activeImageColorButton != null && activeImageColorButton.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H5 */
    public /* synthetic */ void m37868H5(String str) {
        try {
            final C32123ta m155061q = C32123ta.m155061q(str, getFeedLocation(), this.f40569V0, 86400, this.f40617k2, this.f40604g1);
            C20556f c20556f = new C20556f(str);
            File file = new File(AbstractC23204s0.m119557h(), m155061q.f148138h);
            if (!file.exists()) {
                file.mkdirs();
            }
            AbstractC23204s0.m119550a(file.getAbsolutePath());
            String str2 = file.getAbsolutePath() + File.separator + c20556f.m106835h();
            AbstractC23238v2.m119716a(c20556f, new C20556f(str2));
            m155061q.f148146l = str2;
            m155061q.f148147m = str2;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.camera.m0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37860G5(m155061q);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H6 */
    public void m37869H6() {
        RectF rectF;
        CropView cropView = this.f40671z0;
        int newWidth = this.f40542O1.getNewWidth();
        int newHeight = this.f40542O1.getNewHeight();
        int width = this.f40542O1.getWidth();
        int height = this.f40542O1.getHeight();
        C21362q c21362q = this.f40485A0;
        if (c21362q != null) {
            rectF = c21362q.m110706a();
        } else {
            rectF = null;
        }
        cropView.m39483j(newWidth, newHeight, width, height, rectF, false, false);
    }

    /* renamed from: H7 */
    private void m37870H7() {
        AbstractC23136l9.m118744r1(this.f40512H, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I5 */
    public /* synthetic */ void m37874I5() {
        try {
            m38018c6();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:            if (p322lf.AbstractC22470k.m116158j(r3.f40534M1.f41129s, 1) != false) goto L8;     */
    /* renamed from: I7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m37875I7() {
        boolean z11;
        if (m38214D4()) {
            z11 = true;
        }
        z11 = false;
        m37881J7(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3 */
    public void m37879J3(int i11) {
        DocumentScanView documentScanView;
        if (i11 != 1) {
            try {
                m38264c8(false, false);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
                return;
            }
        }
        if (i11 != 2) {
            m38232K3();
        }
        if (i11 != 3) {
            m38239M7(false);
        }
        if (i11 != 4) {
            m37944S7(false, false);
        }
        if (i11 != 7) {
            m37929Q7(false);
        }
        if (i11 != 6) {
            m38272f8(false);
        }
        if (AbstractC26689j.f126436b && i11 != 10) {
            m38267d8(false);
        }
        if (i11 != 11 && (documentScanView = this.f40541O0) != null) {
            AbstractC23136l9.m118744r1(documentScanView, 4);
        }
        if (i11 != 12) {
            AbstractC23136l9.m118744r1(this.f40601f1, 8);
        }
        m37981X7(false);
    }

    /* renamed from: J6 */
    private void m37880J6() {
        ZaloView m92996E0 = this.f40538N1.m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f40538N1.m92649TI().mo92702G1(m92996E0, 0);
        }
    }

    /* renamed from: J7 */
    private void m37881J7(boolean z11) {
        int i11;
        DescriptionInputTextView descriptionInputTextView = this.f40490B1;
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(descriptionInputTextView, i11);
        View view = this.f40494C1;
        if (z11) {
            i12 = 0;
        }
        AbstractC23136l9.m118744r1(view, i12);
    }

    /* renamed from: K5 */
    private void m37885K5() {
        RobotoTextView robotoTextView = this.f40533M0;
        if (robotoTextView != null && robotoTextView.getParent() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            addView(this.f40533M0, layoutParams);
            AbstractC23136l9.m118744r1(this.f40533M0, 4);
        }
    }

    /* renamed from: K6 */
    private void m37886K6() {
        this.f40584Z2.removeMessages(12);
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null && zaloCameraView.m78935DL()) {
            this.f40538N1.mo49315c4();
        }
    }

    /* renamed from: K7 */
    private void m37887K7() {
        int i11;
        ActiveImageColorButton activeImageColorButton = this.f40667y0;
        if (m38085l3() && !m38130q3()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L6 */
    public void m37891L6(String str) {
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null) {
            zaloCameraView.m39061lU(str);
        }
    }

    /* renamed from: L7 */
    private void m37892L7() {
        int i11;
        ActiveImageColorButton activeImageColorButton = this.f40548Q;
        if (m38094m3() && !m38130q3()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* renamed from: M2 */
    private String m37896M2(long j11) {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reshare_memory) + "\n" + AbstractC23160o0.m119299w(j11);
    }

    /* renamed from: M4 */
    private boolean m37897M4() {
        int i11 = this.f40534M1.f41133u;
        if (i11 == 0 || i11 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: M5 */
    private void m37898M5(final String str) {
        Runnable runnable = new Runnable() { // from class: com.zing.zalo.camera.r0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38060i5(str);
            }
        };
        m38237L5();
        AbstractC0837p0.m2224e().mo2040a(runnable);
    }

    /* renamed from: M6 */
    private void m37899M6() {
        DoodleView doodleView = this.f40552R;
        if (doodleView != null && doodleView.m67556v()) {
            m37891L6("121N038");
        } else {
            m37891L6("121N039");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N2 */
    public void m37903N2() {
        this.f40618l0 = null;
        if (this.f40538N1.f40897l1 == 2) {
            this.f40577X1 = this.f40574W1;
            this.f40606h0 = 0;
            this.f40603g0 = 0;
            this.f40609i0 = 0;
            this.f40612j0 = 0;
            this.f40635q0 = this.f40627o0;
            this.f40639r0 = this.f40631p0;
            this.f40584Z2.removeMessages(12);
            ZaloCameraView zaloCameraView = this.f40538N1;
            if (zaloCameraView != null && zaloCameraView.m92672lJ()) {
                m38197y7();
            }
        }
    }

    /* renamed from: N4 */
    private boolean m37904N4() {
        CameraInputParams cameraInputParams = this.f40534M1;
        if (cameraInputParams.f41133u == 2 && cameraInputParams.f41135v == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: N5 */
    private void m37905N5() {
        m38237L5();
        this.f40580Y1 = "";
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.l
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38078k5();
            }
        });
    }

    /* renamed from: N6 */
    private void m37906N6() {
        if (!AbstractC23034c6.m118114C(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            AbstractC23034c6.m118184v0(this.f40538N1, f40483a3, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
        } else if (C28193t5.m141757e().m141764h()) {
            getLocationFilter();
        } else {
            setLocationFilter(C28193t5.m141757e().m141762f());
            m37944S7(true, true);
        }
    }

    /* renamed from: N7 */
    private void m37907N7(boolean z11, EnumC23613l enumC23613l) {
        boolean z12;
        DoodleView doodleView;
        DoodleView doodleView2;
        if (!z11 || (doodleView2 = this.f40552R) == null || doodleView2.getVisibility() != 0) {
            if (!z11 && ((doodleView = this.f40552R) == null || doodleView.getVisibility() != 0)) {
                return;
            }
            try {
                if (z11) {
                    if (this.f40552R == null) {
                        m37977X3();
                    }
                    if (m38211C4() && !m38113o4() && AbstractC23309i.m122281pf()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f40552R.m67524A(enumC23613l, z12);
                    m37970W3(null);
                    this.f40542O1.m39776j0();
                    m37879J3(3);
                    AbstractC23136l9.m118744r1(this.f40552R, 0);
                    if (this.f40552R != null) {
                        AnimatorSet animatorSet = this.f40633p2;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f40633p2 = null;
                        }
                        this.f40633p2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f40552R.m67553s(this.f40506F1));
                        arrayList.add(ObjectAnimator.ofFloat(this.f40638r, "alpha", 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f40642s, "alpha", 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f40646t, "alpha", 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f40650u, "alpha", 0.0f));
                        this.f40633p2.playTogether(arrayList);
                        this.f40633p2.setInterpolator(new C26088c());
                        this.f40633p2.setDuration(250L);
                        setEditingMode(3);
                        this.f40633p2.addListener(new C7466c0());
                        this.f40633p2.start();
                        return;
                    }
                    return;
                }
                m37899M6();
                setEditingMode(0);
                this.f40542O1.m39755M();
                m37840D8();
                AbstractC23136l9.m118744r1(this.f40638r, 0);
                AbstractC23136l9.m118744r1(this.f40650u, 0);
                DoodleView doodleView3 = this.f40552R;
                if (doodleView3 != null) {
                    doodleView3.mo67546hs();
                    AnimatorSet animatorSet2 = this.f40633p2;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f40633p2 = null;
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.f40633p2 = animatorSet3;
                    animatorSet3.playTogether(this.f40552R.getCloseAnimator(), ObjectAnimator.ofFloat(this.f40638r, "alpha", 1.0f), ObjectAnimator.ofFloat(this.f40642s, "alpha", 1.0f), ObjectAnimator.ofFloat(this.f40646t, "alpha", 1.0f), ObjectAnimator.ofFloat(this.f40650u, "alpha", 1.0f));
                    this.f40633p2.setInterpolator(new C26088c());
                    this.f40633p2.setDuration(250L);
                    this.f40633p2.addListener(new C7468d0());
                    this.f40633p2.start();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O2 */
    public void m37911O2(C20028b c20028b) {
        C18420a c18420a = this.f40616k1;
        if (c18420a != null) {
            C21357l.b m110653D0 = c18420a.m110653D0();
            m110653D0.f104095b = c20028b.m103964b();
            this.f40616k1.m110672Y0(m110653D0);
        }
        AbstractC19118o abstractC19118o = this.f40613j1;
        if (abstractC19118o != null) {
            abstractC19118o.m100380i(C20527a.m106639a(c20028b.m103965c()));
        }
    }

    /* renamed from: O3 */
    private void m37912O3() {
        int i11;
        this.f40642s.setAlpha(0.0f);
        this.f40646t.setAlpha(0.0f);
        this.f40638r.setAlpha(0.0f);
        this.f40650u.setAlpha(0.0f);
        FrameLayout frameLayout = this.f40638r;
        int i12 = 8;
        if (this.f40546P1 == 10) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(frameLayout, i11);
        ExpandableActionView expandableActionView = this.f40650u;
        if (this.f40546P1 == 10) {
            i12 = 4;
        }
        AbstractC23136l9.m118744r1(expandableActionView, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4 */
    public boolean m37913O4(C27373c c27373c) {
        if (c27373c == null) {
            return true;
        }
        return AbstractC3460h.m17452t(this.f40538N1.f40899m1, c27373c.m140218C(), c27373c.m140217B(), c27373c.m140271y(), c27373c.m140269w(), c27373c.m140247d(), c27373c.m140270x(), c27373c.m140219D(), c27373c.m140216A(), c27373c.m140256j());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:27:0x007b, B:40:0x00a3, B:51:0x00f7, B:53:0x0110, B:55:0x0116, B:56:0x0127, B:58:0x015f, B:61:0x0168, B:64:0x016f, B:66:0x017b, B:67:0x0190, B:69:0x0199, B:72:0x01aa, B:74:0x01b3, B:77:0x01ba, B:79:0x01c0, B:80:0x01c8, B:82:0x01ce, B:83:0x01d1, B:85:0x01db, B:86:0x01e2, B:90:0x01a1, B:96:0x018b, B:97:0x0120, B:99:0x0124, B:107:0x00b0, B:110:0x00ba, B:113:0x00c2, B:116:0x00cc, B:119:0x00d6), top: B:26:0x007b }] */
    /* renamed from: O5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m37914O5() {
        char c11;
        int i11;
        int i12;
        String str;
        boolean z11;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z12 = false;
        try {
            m37891L6("121N100");
            if (this.f40542O1.getRender().m98320v1()) {
                str = "1";
            } else {
                str = "0";
            }
            CaptionView captionView = this.f40516I;
            if (captionView != null && !TextUtils.isEmpty(captionView.getText())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            DoodleView doodleView = this.f40552R;
            if (doodleView != null && doodleView.m67556v()) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            if (this.f40538N1.f40866V1) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            if (m37858G3()) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            m37891L6("121N1000" + str + str2 + str3 + str4 + str5 + "0");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
        try {
            String str6 = this.f40534M1.f41105X;
            int hashCode = str6.hashCode();
            int i13 = -1;
            int i14 = 2;
            if (hashCode != 49) {
                if (hashCode != 50) {
                    if (hashCode != 52) {
                        if (hashCode != 54) {
                            if (hashCode != 56) {
                                if (hashCode == 1567 && str6.equals("10")) {
                                    c11 = 5;
                                    if (c11 == 0 && c11 != 1) {
                                        if (c11 != 2) {
                                            if (c11 != 3) {
                                                if (c11 != 4) {
                                                    if (c11 == 5) {
                                                        i13 = 5;
                                                    }
                                                } else {
                                                    i13 = 4;
                                                }
                                            } else {
                                                i13 = 3;
                                            }
                                        } else {
                                            i13 = 1;
                                        }
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i13 < 0) {
                                        C20612c c20612c = new C20612c();
                                        this.f40542O1.getRender().m98261B2(c20612c);
                                        this.f40542O1.m39747C0(c20612c, this.f40599e2);
                                        LocationFilterPager locationFilterPager = this.f40572W;
                                        if (locationFilterPager != null && locationFilterPager.getLocationFilter() != null) {
                                            this.f40572W.getLocationFilter().m13449l(c20612c);
                                        } else {
                                            AbstractC2790b abstractC2790b = this.f40585a0;
                                            if (abstractC2790b != null) {
                                                abstractC2790b.m13449l(c20612c);
                                            }
                                        }
                                        c20612c.m107269K(this.f40614j2.f40693b);
                                        c20612c.m107295s().clear();
                                        c20612c.m107295s().addAll(this.f40614j2.f40694c);
                                        c20612c.m107271M(this.f40614j2.f40692a);
                                        c20612c.m107296t().clear();
                                        c20612c.m107264F(this.f40623m2);
                                        if (m38214D4()) {
                                            if (this.f40554R1 == 4) {
                                                i11 = 1;
                                            } else {
                                                i11 = 0;
                                            }
                                            if (this.f40603g0 == 1) {
                                                i12 = 1;
                                            } else {
                                                i12 = 0;
                                            }
                                            c20612c.m107274P(new C20624o(i11, i12, this.f40615k0));
                                            int i15 = this.f40639r0;
                                            if (i15 != 0) {
                                                int i16 = this.f40635q0;
                                                c20612c.m107275Q(new C20625p(i16 / 1000, (i16 + i15) / 1000));
                                            }
                                        } else {
                                            c20612c.m107265G(this.f40501E0);
                                        }
                                        c20612c.m107270L(i13);
                                        if (m38214D4()) {
                                            if (c20612c.m107297u() != null) {
                                                i14 = 3;
                                            }
                                        } else if (c20612c.m107297u() != null) {
                                            i14 = 1;
                                        } else {
                                            i14 = 0;
                                        }
                                        c20612c.m107302z(i14);
                                        if (m37852F4()) {
                                            if (this.f40538N1.f40899m1 == 1) {
                                                z12 = true;
                                            }
                                            if (m38214D4()) {
                                                c20612c.m107273O(C17961f1.m95440W(z12));
                                            } else if (m38211C4()) {
                                                c20612c.m107266H(z12);
                                            }
                                        }
                                        if (this.f40534M1.f41105X.equals("6")) {
                                            C28157p5.m141667d().m141678m(c20612c);
                                        }
                                        m38165u8(c20612c.m107280d(), c20612c);
                                        this.f40614j2.m38343h();
                                        return;
                                    }
                                    return;
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                                i13 = 0;
                                if (i13 < 0) {
                                }
                            } else {
                                if (str6.equals("8")) {
                                    c11 = 3;
                                    if (c11 == 0) {
                                    }
                                    i13 = 0;
                                    if (i13 < 0) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                                i13 = 0;
                                if (i13 < 0) {
                                }
                            }
                        } else {
                            if (str6.equals("6")) {
                                c11 = 4;
                                if (c11 == 0) {
                                }
                                i13 = 0;
                                if (i13 < 0) {
                                }
                            }
                            c11 = 65535;
                            if (c11 == 0) {
                            }
                            i13 = 0;
                            if (i13 < 0) {
                            }
                        }
                    } else {
                        if (str6.equals("4")) {
                            c11 = 2;
                            if (c11 == 0) {
                            }
                            i13 = 0;
                            if (i13 < 0) {
                            }
                        }
                        c11 = 65535;
                        if (c11 == 0) {
                        }
                        i13 = 0;
                        if (i13 < 0) {
                        }
                    }
                } else {
                    if (str6.equals("2")) {
                        c11 = 1;
                        if (c11 == 0) {
                        }
                        i13 = 0;
                        if (i13 < 0) {
                        }
                    }
                    c11 = 65535;
                    if (c11 == 0) {
                    }
                    i13 = 0;
                    if (i13 < 0) {
                    }
                }
            } else {
                if (str6.equals("1")) {
                    c11 = 0;
                    if (c11 == 0) {
                    }
                    i13 = 0;
                    if (i13 < 0) {
                    }
                }
                c11 = 65535;
                if (c11 == 0) {
                }
                i13 = 0;
                if (i13 < 0) {
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("CameraEditorController", e12);
        }
    }

    /* renamed from: O7 */
    private void m37915O7() {
        try {
            if (!AbstractC22463d.m116126a(getContext(), AbstractC32212c.m155331a(this.f40538N1.m92689tK())) && m38104n3() && !m38130q3()) {
                AbstractC23136l9.m118744r1(this.f40651u0, 0);
                AbstractC23136l9.m118744r1(this.f40492C, 0);
            } else {
                AbstractC23136l9.m118744r1(this.f40651u0, 8);
                AbstractC23136l9.m118744r1(this.f40492C, 8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: P2 */
    private void m37919P2() {
        try {
            if (!m38179w4() && !m38186x4() && !m38161u4()) {
                AbstractC23136l9.m118744r1(this.f40630p, 8);
                setAlphaAllButtons(1.0f);
                m38155t7();
                m38112o3();
            }
            this.f40630p.setAlpha(1.0f);
            AbstractC23136l9.m118744r1(this.f40630p, 0);
            setAlphaAllButtons(1.0f);
            m38155t7();
            m38112o3();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P4 */
    public /* synthetic */ void m37920P4() {
        m37891L6("121N052");
    }

    /* renamed from: P6 */
    private void m37921P6() {
        this.f40622m1 = -1.0f;
        this.f40625n1 = -1.0f;
        this.f40628o1 = 0.0f;
        this.f40632p1 = 1.0f;
    }

    /* renamed from: Q2 */
    private void m37925Q2(int i11) {
        if (i11 == 1) {
            VideoCropLayout videoCropLayout = this.f40624n0;
            if (videoCropLayout != null) {
                videoCropLayout.setVisibility(8);
            }
            m38203z6();
        } else if (i11 == 3) {
            CaptionView captionView = this.f40516I;
            if (captionView != null) {
                captionView.setVisibility(8);
            }
            m38163u6();
        } else if (i11 == 2) {
            DoodleView doodleView = this.f40552R;
            if (doodleView != null) {
                doodleView.setVisibility(8);
            }
            m38181w6();
        } else if (i11 == 4) {
            FrameLayout frameLayout = this.f40642s;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            m38188x6();
        } else if (i11 == 5) {
            DragToCloseLayout dragToCloseLayout = this.f40496D;
            if (dragToCloseLayout != null) {
                dragToCloseLayout.setVisibility(8);
            }
            m38196y6();
        }
        setOnClickListenerTopControls(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q3 */
    public void m37926Q3(int i11) {
        AbstractC23136l9.m118744r1(this.f40496D, i11);
        m38221F7(this.f40500E, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q4 */
    public /* synthetic */ void m37927Q4(boolean z11) {
        try {
            int height = getHeight();
            if (getFinishEditButton() != null) {
                height -= getFinishEditButton().getHeight();
            }
            VideoSpeedLayout videoSpeedLayout = this.f40600f0;
            if (videoSpeedLayout != null) {
                videoSpeedLayout.m39628g(z11, height);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: Q5 */
    private void m37928Q5() {
        try {
            if (this.f40516I == null) {
                m37948T3();
            }
            if (this.f40516I.getVisibility() != 0) {
                m37879J3(2);
                AbstractC23136l9.m118744r1(this.f40642s, 0);
                AbstractC23136l9.m118744r1(this.f40516I, 0);
                m38152t2();
                setEditingMode(2);
                return;
            }
            this.f40516I.m67453X0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: Q7 */
    private void m37929Q7(boolean z11) {
        this.f40538N1.m39038VT(z11, new int[0]);
        if (z11) {
            m37981X7(false);
        }
        m37891L6("121N041");
    }

    /* renamed from: R2 */
    private void m37933R2() {
        if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.h0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37943S4();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R4 */
    public /* synthetic */ void m37934R4() {
        try {
            MusicView musicView = this.f40601f1;
            if (musicView != null && musicView.getVisibility() == 0) {
                View musicOnBoardingTarget = this.f40601f1.getMusicOnBoardingTarget();
                if (this.f40595d1 == null) {
                    this.f40595d1 = new C7489s(this, musicOnBoardingTarget);
                    musicOnBoardingTarget.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white_15));
                    this.f40595d1.m103968d(musicOnBoardingTarget);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: R5 */
    private void m37935R5() {
        if (this.f40540O) {
            return;
        }
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null && zaloCameraView.m39071qR()) {
            this.f40538N1.m39038VT(false, 250);
            return;
        }
        InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
        if (interfaceC7480j0 != null) {
            interfaceC7480j0.mo38346d();
        }
    }

    /* renamed from: R6 */
    private void m37936R6() {
        if (TextUtils.isEmpty(this.f40629o2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f40629o2);
            this.f40524K = jSONObject.optInt("caption_x");
            this.f40528L = jSONObject.optInt("caption_y");
            this.f40532M = (float) jSONObject.optDouble("caption_angle");
            this.f40536N = (float) jSONObject.optDouble("caption_scale");
            this.f40544P = jSONObject.optBoolean("caption_is_adding", true);
            this.f40516I.m67455f1(jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: R7 */
    private void m37937R7() {
        boolean z11;
        int i11 = 0;
        if (m38120p3() && !m38130q3()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ActiveImageColorButton activeImageColorButton = this.f40568V;
        if (!z11) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* renamed from: S2 */
    private void m37941S2() {
        if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.j0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37956U4();
                }
            });
        }
    }

    /* renamed from: S3 */
    private void m37942S3(InterfaceC7732s2 interfaceC7732s2, InterfaceC1801w interfaceC1801w) {
        if (m38113o4()) {
            this.f40650u.m43191e(this, interfaceC1801w);
            interfaceC7732s2.mo39066nn().m9219j(interfaceC1801w, new InterfaceC1764d0() { // from class: com.zing.zalo.camera.g
                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    CameraEditorController.this.m38039f5((Long) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S4 */
    public /* synthetic */ void m37943S4() {
        if (!AbstractC0924m0.m4108pc()) {
            post(new Runnable() { // from class: com.zing.zalo.camera.k
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37934R4();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S7 */
    public void m37944S7(boolean z11, boolean z12) {
        LocationFilterPager locationFilterPager;
        LocationFilterPager locationFilterPager2;
        if (!z11 || (locationFilterPager2 = this.f40572W) == null || locationFilterPager2.getVisibility() != 0) {
            if (!z11 && ((locationFilterPager = this.f40572W) == null || locationFilterPager.getVisibility() != 0)) {
                return;
            }
            try {
                AnimatorSet animatorSet = this.f40641r2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f40641r2 = null;
                }
                if (z11) {
                    if (this.f40572W == null) {
                        m38007b4();
                    }
                    m37879J3(4);
                    setEditingMode(4);
                    AbstractC23136l9.m118744r1(this.f40572W, 0);
                    this.f40584Z2.sendEmptyMessage(1);
                    if (z12) {
                        this.f40641r2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(this.f40630p, "alpha", 1.0f));
                        arrayList.add(this.f40572W.getOpenAnim());
                        arrayList.add(ObjectAnimator.ofFloat(this.f40638r, "alpha", 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f40642s, "alpha", 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f40650u, "alpha", 0.0f));
                        this.f40641r2.playTogether(arrayList);
                        this.f40641r2.setInterpolator(new C26088c());
                        this.f40641r2.setDuration(250L);
                        this.f40641r2.addListener(new C7461a());
                        this.f40641r2.start();
                    } else {
                        this.f40630p.setAlpha(1.0f);
                        this.f40638r.setAlpha(0.0f);
                        this.f40642s.setAlpha(0.0f);
                        this.f40650u.setAlpha(0.0f);
                    }
                } else {
                    setEditingMode(0);
                    m37840D8();
                    AbstractC23136l9.m118744r1(this.f40638r, 0);
                    AbstractC23136l9.m118744r1(this.f40650u, 0);
                    if (z12) {
                        this.f40641r2 = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40630p, "alpha", 0.0f));
                        arrayList2.add(this.f40572W.getCloseAnim());
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40638r, "alpha", 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40642s, "alpha", 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40650u, "alpha", 1.0f));
                        this.f40641r2.playTogether(arrayList2);
                        this.f40641r2.setInterpolator(new C26088c());
                        this.f40641r2.setDuration(250L);
                        this.f40641r2.addListener(new C7463b());
                        this.f40641r2.start();
                    } else {
                        if (!m38186x4() && !m38179w4()) {
                            this.f40630p.setAlpha(0.0f);
                        }
                        m38142r7();
                        AbstractC23136l9.m118744r1(this.f40572W, 8);
                    }
                }
                ImageDecorView imageDecorView = this.f40542O1;
                if (imageDecorView != null) {
                    imageDecorView.mo39680s();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* renamed from: T3 */
    private void m37948T3() {
        try {
            if (this.f40516I == null) {
                CaptionView captionView = (CaptionView) ((ViewStub) findViewById(AbstractC6918a0.stub_camera_caption_layout)).inflate();
                this.f40516I = captionView;
                captionView.setEventListener(this.f40575W2);
                this.f40516I.m67447P(AbstractC22463d.m116126a(getContext(), AbstractC32212c.m155331a(getContext())));
                this.f40516I.m67458i0();
                m37850F2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T4 */
    public /* synthetic */ void m37949T4() {
        try {
            if (this.f40573W0 == null) {
                this.f40573W0 = new C7488r(this);
                LinearLayout linearLayout = this.f40565U0;
                if (linearLayout != null) {
                    linearLayout.setBackgroundColor(Color.parseColor("#FF3A3A3A"));
                }
                this.f40573W0.m127696d(this.f40565U0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: T6 */
    private void m37950T6() {
        AbstractC21351f currentVisualDecor = getCurrentVisualDecor();
        if (currentVisualDecor != null) {
            float f11 = this.f40622m1;
            if (f11 != -1.0f) {
                currentVisualDecor.mo110614r0(f11);
            }
            float f12 = this.f40625n1;
            if (f12 != -1.0f) {
                currentVisualDecor.m110615s0(f12);
                if (currentVisualDecor instanceof C18420a) {
                    ((C18420a) currentVisualDecor).mo97620d(this.f40625n1);
                }
            }
            currentVisualDecor.m110611n0(this.f40628o1);
            currentVisualDecor.mo97628p0(this.f40632p1);
            if (currentVisualDecor instanceof C18420a) {
                ((C18420a) currentVisualDecor).mo97622f(this.f40632p1);
            }
        }
    }

    /* renamed from: T7 */
    private void m37951T7() {
        int i11;
        View view = this.f40576X0;
        if (m38130q3()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U3 */
    public void m37955U3(int i11) {
        boolean z11;
        MusicView musicView;
        SongData songData;
        if (i11 != this.f40607h1 && !this.f40640r1) {
            m38241O6();
            this.f40607h1 = i11;
            C19435a.a m101601d = C19435a.f96406a.m101601d(i11);
            if (m101601d != null && (i11 == 1 || i11 == 2 || i11 == 3)) {
                this.f40616k1 = new C18420a("", MusicView.m39405w(m101601d.m101604b(), m101601d.m101605c()), m101601d.m101606d(), 0, 1, AbstractC23136l9.m118707f0());
                MusicView musicView2 = this.f40601f1;
                if (musicView2 != null) {
                    musicView2.m39412N(m101601d.m101603a());
                }
                this.f40636q1 = m101601d.m101605c();
            }
            C18420a c18420a = this.f40616k1;
            if (c18420a != null) {
                c18420a.m1954X(true);
                this.f40616k1.mo110614r0(this.f40542O1.getWidth() >> 1);
                this.f40616k1.m110615s0(this.f40542O1.getHeight() >> 1);
                this.f40616k1.mo97620d(this.f40542O1.getHeight() >> 1);
                if (this.f40622m1 == -1.0f) {
                    this.f40622m1 = this.f40616k1.m110606f0();
                }
                if (this.f40625n1 == -1.0f) {
                    this.f40625n1 = this.f40616k1.m97621d1();
                }
                this.f40616k1.mo97622f(1.0f);
                this.f40542O1.m39748F(this.f40616k1);
                this.f40616k1.m110613q0(false);
                this.f40616k1.m110616t0();
            }
            if (m101601d != null && C20527a.m106639a(m101601d.m101603a())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        this.f40613j1 = new C19127x(this.f40616k1, z11);
                        this.f40616k1.m97623g1(1.5f);
                    }
                } else {
                    this.f40613j1 = new C19124u(this.f40616k1, z11);
                    this.f40616k1.m97623g1(2.0f);
                }
            } else {
                this.f40613j1 = new C19121r(this.f40616k1, AbstractC23136l9.m118742r(20.0f), z11);
                this.f40616k1.m97623g1(2.0f);
            }
            if (i11 == 4 && (musicView = this.f40601f1) != null && (songData = musicView.getSongData()) != null) {
                C18422c m99090a = new C18903a(getContext(), songData.m45160e(), songData.m45163h(), songData.m45162g(), songData.m45158c()).m99090a();
                this.f40619l1 = m99090a;
                m99090a.mo110614r0(this.f40542O1.getWidth() >> 1);
                this.f40619l1.m110615s0(this.f40542O1.getHeight() >> 1);
                if (this.f40622m1 == -1.0f) {
                    this.f40622m1 = this.f40619l1.m110606f0();
                }
                if (this.f40625n1 == -1.0f) {
                    this.f40625n1 = this.f40619l1.m110607g0();
                }
                this.f40619l1.m110613q0(false);
                this.f40619l1.m110616t0();
                ImageDecorView imageDecorView = this.f40542O1;
                if (imageDecorView != null) {
                    imageDecorView.m39748F(this.f40619l1);
                    this.f40542O1.mo39680s();
                }
            }
            MusicView musicView3 = this.f40601f1;
            if (musicView3 != null && musicView3.getVisibility() != 0) {
                m37950T6();
            }
            MusicView musicView4 = this.f40601f1;
            if (musicView4 != null && musicView4.getVisibility() == 0) {
                if (i11 == 0) {
                    this.f40601f1.m39409K();
                } else {
                    this.f40601f1.m39414u();
                }
            }
            C23648e m154346U = C32017m4.m154326S().m154346U(C32002l4.m154264g(7).m154284u(86));
            m154346U.m123919l()[0] = String.valueOf(i11);
            C0815e1.m2075D().m2100V(m154346U, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U4 */
    public /* synthetic */ void m37956U4() {
        if (C24417g.f117907a.m127702d() && !AbstractC0924m0.m4138qc()) {
            postDelayed(new Runnable() { // from class: com.zing.zalo.camera.n0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37949T4();
                }
            }, 500L);
        }
    }

    /* renamed from: U5 */
    private void m37957U5(float f11, C21362q c21362q, C21362q c21362q2) {
        C21362q c21362q3 = this.f40555R2;
        double d11 = c21362q.f104140a;
        double d12 = f11;
        c21362q3.f104140a = d11 + ((c21362q2.f104140a - d11) * d12);
        double d13 = c21362q.f104141b;
        c21362q3.f104141b = d13 + ((c21362q2.f104141b - d13) * d12);
        double d14 = c21362q.f104142c;
        c21362q3.f104142c = d14 + ((c21362q2.f104142c - d14) * d12);
        double d15 = c21362q.f104143d;
        c21362q3.f104143d = d15 + ((c21362q2.f104143d - d15) * d12);
        this.f40542O1.getRender().m98269N0(this.f40555R2, 0, 0);
        this.f40542O1.mo39680s();
    }

    /* renamed from: V2 */
    private boolean m37961V2(boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && i11 < 29) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                if (AbstractC23034c6.m118167n(getContext(), strArr) != 0) {
                    if (z11) {
                        AbstractC23034c6.m118184v0(this.f40538N1, strArr, 156);
                        return false;
                    }
                    return false;
                }
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
                return true;
            }
        }
        return true;
    }

    /* renamed from: V3 */
    private DocumentScanView m37962V3() {
        DocumentScanView documentScanView = new DocumentScanView(getContext());
        documentScanView.setDocumentScanListener(new C7494x());
        addView(documentScanView, new ViewGroup.LayoutParams(-1, -1));
        return documentScanView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V4 */
    public /* synthetic */ void m37963V4(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f40562T1) {
            this.f40562T1 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V6 */
    public void m37964V6(AbstractC21351f abstractC21351f) {
        try {
            if (abstractC21351f != null) {
                m38282k8();
                this.f40540O = true;
                m38016c4();
                if (abstractC21351f instanceof C18420a) {
                    ((C18420a) abstractC21351f).mo97620d(this.f40625n1);
                    ((C18420a) abstractC21351f).mo97622f(this.f40632p1);
                }
                abstractC21351f.mo1953W(1.0f);
                this.f40542O1.setTouchEnable(false);
                this.f40559S2.m117670j(abstractC21351f);
                this.f40559S2.m117673m(this.f40567U2);
                this.f40559S2.m117674n(this.f40622m1, this.f40625n1);
                this.f40559S2.m117669i(this.f40628o1);
                this.f40559S2.m117675o(this.f40632p1);
                this.f40559S2.m117668h(1.0f);
                this.f40559S2.m117677q(true);
                return;
            }
            this.f40567U2.mo38324a(null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: V7 */
    private void m37965V7(boolean z11) {
        boolean z12;
        int i11 = 0;
        if (z11 && !m37866H3()) {
            z12 = true;
        } else {
            z12 = false;
        }
        LinearLayout linearLayout = this.f40521J0;
        if (!z12) {
            i11 = 4;
        }
        AbstractC23136l9.m118744r1(linearLayout, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W2 */
    public void m37969W2() {
        this.f40549Q0 = null;
        this.f40553R0 = null;
        this.f40557S0 = false;
    }

    /* renamed from: W3 */
    private void m37970W3(String str) {
        DoodleView doodleView;
        try {
            if (this.f40556S == null) {
                C21358m m37985Y3 = m37985Y3();
                this.f40556S = m37985Y3;
                DoodleView doodleView2 = this.f40552R;
                if (doodleView2 != null) {
                    doodleView2.setDecorRenderer(m37985Y3);
                }
                this.f40542O1.getRender().m98292g2(this.f40556S);
                if (!TextUtils.isEmpty(str) && (doodleView = this.f40552R) != null) {
                    doodleView.m67531H0(str);
                }
                this.f40542O1.mo39680s();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W4 */
    public /* synthetic */ void m37971W4(C21362q c21362q, C21362q c21362q2, ValueAnimator valueAnimator) {
        m37957U5(((Float) valueAnimator.getAnimatedValue()).floatValue(), c21362q, c21362q2);
    }

    /* renamed from: W6 */
    private void m37972W6(AbstractC21351f abstractC21351f) {
        try {
            if (abstractC21351f != null) {
                m38282k8();
                this.f40540O = true;
                m38016c4();
                this.f40542O1.setTouchEnable(false);
                this.f40542O1.setToFront(abstractC21351f);
                this.f40559S2.m117670j(abstractC21351f);
                int height = this.f40542O1.getHeight() >> 1;
                if (abstractC21351f instanceof C18420a) {
                    this.f40625n1 = ((C18420a) abstractC21351f).m97621d1();
                    this.f40632p1 = ((C18420a) abstractC21351f).m97619c1();
                    ((C18420a) abstractC21351f).mo97620d(height);
                    ((C18420a) abstractC21351f).mo97622f(1.0f);
                } else if (abstractC21351f instanceof C18422c) {
                    this.f40625n1 = abstractC21351f.m110607g0();
                    this.f40632p1 = abstractC21351f.m110605e0();
                }
                abstractC21351f.mo1953W(1.0f);
                this.f40622m1 = abstractC21351f.m110606f0();
                this.f40628o1 = abstractC21351f.m110604c0();
                this.f40559S2.m117674n(this.f40542O1.getWidth() >> 1, height);
                this.f40559S2.m117673m(this.f40563T2);
                if (abstractC21351f instanceof C21357l) {
                    this.f40559S2.m117676p(this.f40636q1);
                } else if (abstractC21351f instanceof C18422c) {
                    this.f40559S2.m117675o(1.0f);
                }
                this.f40559S2.m117669i(0.0f);
                this.f40559S2.m117668h(1.0f);
                this.f40559S2.m117677q(false);
                return;
            }
            this.f40563T2.mo38324a(null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: W7 */
    private void m37973W7() {
        int i11;
        ActiveImageColorButton activeImageColorButton = this.f40648t1;
        if (m38130q3()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* renamed from: X3 */
    private void m37977X3() {
        boolean z11;
        try {
            if (this.f40552R == null) {
                DoodleView doodleView = (DoodleView) ((ViewStub) findViewById(AbstractC6918a0.stub_camera_doodle_layout)).inflate();
                this.f40552R = doodleView;
                if (m38211C4() && !m38113o4() && AbstractC23309i.m122281pf()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                doodleView.m67527D(z11);
                this.f40552R.setDoodleLayoutListener(new C7470e0());
                JSONObject jSONObject = this.f40626n2;
                if (jSONObject != null && jSONObject.has("doodle_data")) {
                    m37970W3(this.f40626n2.optString("doodle_data"));
                }
                m37850F2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X4 */
    public /* synthetic */ void m37978X4(String str) {
        int i11;
        try {
            if (this.f40538N1.f40897l1 == 2) {
                if (TextUtils.isEmpty(this.f40580Y1) && !TextUtils.isEmpty(str)) {
                    this.f40580Y1 = str;
                }
                this.f40577X1 = this.f40580Y1;
                this.f40609i0 = 0;
                this.f40612j0 = 0;
                this.f40635q0 = 0;
                this.f40639r0 = 0;
                this.f40603g0 = this.f40606h0;
                this.f40606h0 = 0;
                m37886K6();
                if (this.f40603g0 == 2) {
                    setBtnFinishEditEnabled(true);
                    m38046g6(true);
                    setVideoSoundMode(false);
                } else {
                    setVideoSoundMode(true);
                }
                Runnable runnable = this.f40669y2;
                if (runnable != null) {
                    runnable.run();
                    this.f40669y2 = null;
                } else {
                    ZaloCameraView zaloCameraView = this.f40538N1;
                    if (zaloCameraView != null && zaloCameraView.m92672lJ() && ((i11 = this.f40554R1) == 2 || i11 == 3)) {
                        m38197y7();
                    }
                }
                InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
                if (interfaceC7480j0 != null) {
                    interfaceC7480j0.mo38350h(this.f40603g0);
                    return;
                }
                return;
            }
            AbstractC23041d2.m118208g(this.f40580Y1);
            this.f40580Y1 = null;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: X5 */
    private void m37979X5() {
        if (!this.f40506F1) {
            return;
        }
        Bitmap bitmap = this.f40549Q0;
        if (bitmap != null) {
            m37833C7(bitmap);
        } else {
            m38216D7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X6 */
    public void m37980X6(AbstractC21351f abstractC21351f) {
        try {
            this.f40540O = true;
            m38067j4();
            this.f40542O1.setTouchEnable(false);
            this.f40524K = abstractC21351f.m110606f0();
            this.f40528L = abstractC21351f.m110607g0();
            this.f40532M = abstractC21351f.m110604c0();
            this.f40536N = abstractC21351f.m110605e0();
            this.f40520J.m117670j(abstractC21351f);
            this.f40520J.m117674n(this.f40542O1.getWidth() >> 1, ((this.f40516I.getTextBottomMargin() + (this.f40516I.getTextHeight() / 2)) - AbstractC23222t7.f112556e) - ((getHeight() - this.f40542O1.getHeight()) / 2));
            this.f40520J.m117673m(this.f40571V2);
            this.f40520J.m117676p(this.f40516I.getTextSize());
            this.f40520J.m117669i(0.0f);
            this.f40520J.m117677q(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: X7 */
    private void m37981X7(boolean z11) {
        boolean z12;
        int i11;
        m38030e4();
        if (this.f40652u1.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((z11 && !z12) || (!z11 && z12)) {
            View view = this.f40652u1;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(view, i11);
            VideoSpeedLayout videoSpeedLayout = this.f40600f0;
            if (videoSpeedLayout != null && videoSpeedLayout.getVisibility() == 0) {
                m38272f8(false);
            }
        }
    }

    /* renamed from: Y3 */
    private C21358m m37985Y3() {
        C21348c c21348c = new C21348c();
        C21352g c21352g = new C21352g();
        C21358m c21358m = new C21358m(c21348c, c21352g);
        c21358m.m110701v0(this);
        if (this.f40560T == null) {
            this.f40560T = new C21347b[]{new C21347b(getResources(), 0), new C21347b(getResources(), 1), new C21347b(getResources(), 2), new C21347b(getResources(), 3)};
        }
        if (this.f40564U == null) {
            this.f40564U = new C23934a[]{new C23934a(0), new C23934a(1), new C23934a(2)};
        }
        c21348c.m110578m0(this.f40560T);
        c21352g.m110638u0(this.f40564U);
        return c21358m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y4 */
    public /* synthetic */ void m37986Y4() {
        try {
            m37903N2();
            ToastUtils.m89266n(AbstractC8020f0.str_process_video_recorded_error, new Object[0]);
            if (this.f40669y2 != null) {
                this.f40669y2 = null;
                m37886K6();
                setBtnFinishEditEnabled(true);
                m38046g6(true);
                setVideoSoundMode(false);
            }
        } catch (Resources.NotFoundException e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y6 */
    public void m37987Y6(C21357l c21357l) {
        if (c21357l != null) {
            try {
                m38067j4();
                c21357l.m110616t0();
                c21357l.m110674a1(this.f40516I.getInputTextWidth());
                c21357l.mo97628p0(this.f40516I.getTextSize() / c21357l.m110653D0().f104106m);
                c21357l.mo110614r0(this.f40542O1.getWidth() >> 1);
                c21357l.m110615s0(((this.f40516I.getTextBottomMargin() + (this.f40516I.getTextHeight() / 2)) - AbstractC23222t7.f112556e) - ((getHeight() - this.f40542O1.getHeight()) / 2));
                c21357l.m110611n0(0.0f);
                this.f40542O1.m39748F(c21357l);
                this.f40520J.m117670j(c21357l);
                this.f40520J.m117673m(this.f40578X2);
                if (this.f40544P) {
                    this.f40524K = this.f40542O1.getWidth() >> 1;
                    this.f40528L = this.f40542O1.getHeight() >> 1;
                }
                this.f40544P = false;
                this.f40520J.m117674n(this.f40524K, this.f40528L);
                this.f40520J.m117669i(this.f40532M);
                this.f40520J.m117675o(this.f40536N);
                this.f40520J.m117677q(true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* renamed from: Y7 */
    private void m37988Y7() {
        boolean z11;
        int i11 = 0;
        if (m38211C4() && !m38130q3()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ActiveImageColorButton activeImageColorButton = this.f40663x0;
        if (!z11) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* renamed from: Z2 */
    private void m37991Z2(boolean z11) {
        final C21362q c21362q;
        if (!z11 && !this.f40513H0 && this.f40534M1.m39213b()) {
            try {
                if (m38225I3()) {
                    m38300x3(false);
                    InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
                    if (interfaceC7480j0 != null) {
                        interfaceC7480j0.mo38346d();
                    }
                } else if (this.f40513H0) {
                    this.f40538N1.showDialog(3);
                } else {
                    m38300x3(false);
                    InterfaceC7480j0 interfaceC7480j02 = this.f40558S1;
                    if (interfaceC7480j02 != null) {
                        interfaceC7480j02.mo38346d();
                    }
                }
                return;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
                return;
            }
        }
        try {
            C21362q c21362q2 = this.f40485A0;
            m38300x3(z11);
            if (z11) {
                c21362q = new C21362q(this.f40671z0.getCropOverlayRectInPercentage());
            } else {
                c21362q = new C21362q(c21362q2);
            }
            final C21362q c21362q3 = new C21362q(this.f40542O1.getRender().m98306o1());
            if (z11) {
                this.f40513H0 = true;
            }
            AbstractC23136l9.m118744r1(this.f40671z0, 0);
            setVisibilityTopAndBottom(0);
            this.f40638r.setTranslationY(-AbstractC23222t7.f112539R);
            this.f40638r.setAlpha(0.0f);
            this.f40642s.setTranslationY(AbstractC23222t7.f112575n0);
            this.f40642s.setAlpha(0.0f);
            this.f40650u.setTranslationX(AbstractC23222t7.f112575n0);
            this.f40650u.setAlpha(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.camera.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CameraEditorController.this.m37971W4(c21362q3, c21362q, valueAnimator);
                }
            });
            ofFloat.addListener(new C7492v());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.f40671z0.m39480c(ofFloat), getEditorAnimatorSetForCrop());
            this.f40493C0 = animatorSet;
            animatorSet.start();
        } catch (Exception e12) {
            AbstractC23350e.m122776f("CameraEditorController", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z4 */
    public /* synthetic */ void m37992Z4(long j11, Object obj, boolean z11, final String str) {
        try {
            m38139r3();
            if (z11) {
                AbstractC20110a.m104544m("trimming by MediaCodec success, time: " + (System.currentTimeMillis() - j11) + " ms", new Object[0]);
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC20110a.m104544m("Trim Success called time= " + currentTimeMillis + ", elapsed= " + (currentTimeMillis - j11) + ", currentVideoToken= " + obj + ", convertIFrameVideoToken= " + this.f40618l0, new Object[0]);
                if (obj == this.f40618l0) {
                    this.f40618l0 = null;
                    this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraEditorController.this.m37978X4(str);
                        }
                    });
                } else {
                    AbstractC20110a.m104544m("Trim Error - Task has been canceled", new Object[0]);
                    m37886K6();
                    AbstractC23041d2.m118208g(this.f40580Y1);
                    this.f40580Y1 = null;
                    setVideoSoundMode(false);
                }
            } else {
                AbstractC20110a.m104544m("Trim Error - called time= %s", Long.valueOf(System.currentTimeMillis()));
                AbstractC23041d2.m118208g(this.f40580Y1);
                this.f40580Y1 = null;
                this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraEditorController.this.m37986Y4();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: Z5 */
    private void m37993Z5(Integer num, View view) {
        DescriptionInputTextView descriptionInputTextView;
        try {
            if (this.f40530L1) {
                return;
            }
            m38227I6();
            if (num.intValue() == AbstractC6918a0.btn_editor_back) {
                m37935R5();
            } else {
                if (num.intValue() != AbstractC6918a0.privacy_layout && num.intValue() != AbstractC6918a0.privacy_button) {
                    if (num.intValue() != AbstractC6918a0.save_button && num.intValue() != AbstractC6918a0.save_layout && num.intValue() != AbstractC6918a0.camera_more_save_layout) {
                        if (num.intValue() != AbstractC6918a0.btn_editor_photo_crop && num.intValue() != AbstractC6918a0.camera_more_photo_crop_layout) {
                            if (num.intValue() == AbstractC6918a0.btn_editor_document_scanner) {
                                m37979X5();
                            } else if (num.intValue() == AbstractC6918a0.btn_back_crop) {
                                if (this.f40506F1) {
                                    m37991Z2(false);
                                    m38089l8("crop_back_clear");
                                }
                            } else if (num.intValue() == AbstractC6918a0.btn_rotate_left_crop) {
                                m38123p6();
                            } else if (num.intValue() == AbstractC6918a0.btn_square_crop) {
                                m38172v6();
                            } else if (num.intValue() == AbstractC6918a0.btn_finish_crop_photo) {
                                m37991Z2(true);
                                m38089l8("crop_done_notclear");
                            } else {
                                if (num.intValue() != AbstractC6918a0.btn_editor_video_timing && num.intValue() != AbstractC6918a0.camera_more_video_speed_layout) {
                                    if (num.intValue() == AbstractC6918a0.btn_editor_video_crop) {
                                        m38203z6();
                                    } else {
                                        if (num.intValue() != AbstractC6918a0.btn_editor_doodle && num.intValue() != AbstractC6918a0.camera_more_doodle_layout) {
                                            if (num.intValue() == AbstractC6918a0.btn_editor_caption) {
                                                m38163u6();
                                            } else if (num.intValue() == AbstractC6918a0.btn_editor_back_filter) {
                                                m37929Q7(false);
                                                m38089l8("filter_back_notclear");
                                            } else {
                                                if (num.intValue() != AbstractC6918a0.btn_editor_filter && num.intValue() != AbstractC6918a0.camera_more_filter_layout) {
                                                    if (num.intValue() == AbstractC6918a0.btn_editor_music) {
                                                        m38032e6();
                                                    } else if (num.intValue() == AbstractC6918a0.btn_editor_more) {
                                                        m38125p8();
                                                    } else if (num.intValue() == AbstractC6918a0.camera_overflow_layout) {
                                                        m37981X7(false);
                                                    } else if (num.intValue() == AbstractC6918a0.btn_editor_filter_quick_access) {
                                                        m38079k6();
                                                    } else if (num.intValue() == AbstractC6918a0.btn_editor_sticker) {
                                                        m38196y6();
                                                    } else if (num.intValue() == AbstractC6918a0.btn_sticker_layout_back_cam) {
                                                        m38247S5();
                                                        m38089l8("sticker_back");
                                                    } else {
                                                        if (num.intValue() != AbstractC6918a0.btn_editor_location && num.intValue() != AbstractC6918a0.camera_more_location_layout) {
                                                            if (num.intValue() != AbstractC6918a0.mute_layout && num.intValue() != AbstractC6918a0.mute_button) {
                                                                if (num.intValue() != AbstractC6918a0.btn_post && num.intValue() != AbstractC6918a0.btn_send && num.intValue() != AbstractC6918a0.btn_done && num.intValue() != AbstractC6918a0.btn_next) {
                                                                    if (num.intValue() == AbstractC6918a0.tv_description_input && (descriptionInputTextView = this.f40490B1) != null && view != null) {
                                                                        descriptionInputTextView.onClick(view);
                                                                    }
                                                                }
                                                                AbstractC17927b.m94533b().mo94527a("EDITOR_CONTROLLER_ON_FINISH", new Runnable() { // from class: com.zing.zalo.camera.t0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        CameraEditorController.this.m38009b6();
                                                                    }
                                                                }, 1000L);
                                                            }
                                                            m38040f6();
                                                        }
                                                        m38025d6();
                                                    }
                                                }
                                                m38188x6();
                                            }
                                        }
                                        m38181w6();
                                    }
                                }
                                m37825B6();
                            }
                        }
                        m38052h6();
                    }
                    m38132q6();
                }
                m38069j6();
            }
            if (this.f40558S1 != null) {
                if (num.intValue() == AbstractC6918a0.btn_editor_doodle || num.intValue() == AbstractC6918a0.btn_editor_video_timing || num.intValue() == AbstractC6918a0.camera_more_video_speed_layout || num.intValue() == AbstractC6918a0.btn_editor_caption) {
                    this.f40558S1.mo38349g(m38296v4());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: Z6 */
    private void m37994Z6(JSONObject jSONObject) {
        try {
            if (this.f40516I != null && this.f40542O1.getRender().m98322w1()) {
                JSONObject jSONObject2 = new JSONObject();
                if (this.f40516I.getVisibility() == 0) {
                    this.f40516I.m67452W0(jSONObject);
                } else {
                    jSONObject2.put("caption_mode", 2);
                }
                jSONObject2.put("caption_x", this.f40524K);
                jSONObject2.put("caption_y", this.f40528L);
                jSONObject2.put("caption_angle", this.f40532M);
                jSONObject2.put("caption_scale", this.f40536N);
                jSONObject2.put("caption_is_adding", this.f40544P);
                jSONObject.put("decor_caption", jSONObject2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: Z7 */
    private void m37995Z7() {
        int i11;
        boolean m116158j = AbstractC22470k.m116158j(this.f40534M1.f41129s, 7);
        boolean m127702d = C24417g.f117907a.m127702d();
        LinearLayout linearLayout = this.f40565U0;
        if (m116158j && m127702d) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(linearLayout, i11);
        if (m116158j && m127702d) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.a
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37845E5();
                }
            });
        }
    }

    /* renamed from: a3 */
    private void m37999a3() {
        try {
            View findViewById = findViewById(AbstractC6918a0.editor_top_button_container);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(AbstractC6918a0.editor_top_action_container);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.f40576X0.getLayoutParams();
            ViewGroup.LayoutParams layoutParams3 = this.f40654v.getLayoutParams();
            if (m38113o4()) {
                this.f40638r.setMinimumHeight(AbstractC23222t7.f112555d0);
                this.f40638r.setBackgroundResource(AbstractC16803z.bg_transparent);
                this.f40654v.setImageResource(AbstractC16803z.ic_camera_header_back);
                this.f40654v.setPadding(0, 0, 0, 0);
                layoutParams3.height = -2;
                layoutParams3.width = -2;
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = AbstractC23222t7.f112576o;
                    this.f40654v.setLayoutParams(layoutParams3);
                }
                this.f40576X0.setBackgroundResource(AbstractC16803z.bg_black_50_radius_20);
                this.f40579Y0.setImageResource(AbstractC2810d.zds_ic_melody_solid_24);
                this.f40579Y0.setColorFilter(AbstractC1388a.m6961c(getContext(), AbstractC16801x.white));
                layoutParams2.height = AbstractC23222t7.f112530J;
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    int i11 = AbstractC23222t7.f112586t;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i11;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i11;
                }
                this.f40576X0.setLayoutParams(layoutParams2);
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
                    relativeLayout.setLayoutParams(layoutParams);
                }
                findViewById.setVisibility(8);
                this.f40646t.setBackgroundResource(AbstractC16803z.bg_gradient_bottom_black_30);
                this.f40561T0.setImageResource(AbstractC2810d.zds_ic_members_solid_32);
                this.f40658w.setImageResource(AbstractC2810d.zds_ic_download_solid_32);
                this.f40529L0.setImageResource(AbstractC2810d.zds_ic_speaker_solid_32);
                AbstractC23136l9.m118744r1(this.f40650u, 0);
                return;
            }
            this.f40638r.setMinimumHeight(AbstractC23222t7.f112539R);
            this.f40638r.setBackgroundResource(AbstractC16803z.photo_background);
            this.f40654v.setImageResource(AbstractC16803z.btn_camera_close);
            ActiveImageButton activeImageButton = this.f40654v;
            int i12 = AbstractC23222t7.f112582r;
            activeImageButton.setPadding(i12, i12, i12, i12);
            int i13 = AbstractC23222t7.f112539R;
            layoutParams3.height = i13;
            layoutParams3.width = i13;
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = 0;
                this.f40654v.setLayoutParams(layoutParams3);
            }
            this.f40576X0.setBackgroundResource(AbstractC16803z.bg_editor_pick_music);
            this.f40579Y0.setImageResource(AbstractC16803z.ic_post_story_music);
            layoutParams2.height = AbstractC23222t7.f112528I;
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            }
            this.f40576X0.setLayoutParams(layoutParams2);
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 8388629;
                relativeLayout.setLayoutParams(layoutParams);
            }
            findViewById.setVisibility(0);
            this.f40646t.setBackgroundResource(AbstractC16803z.photo_background);
            this.f40561T0.setImageResource(AbstractC16803z.ic_story_privacy_white_line_all);
            this.f40561T0.setMaxIconSize(AbstractC23222t7.f112532K);
            this.f40658w.setImageResource(AbstractC16803z.ic_camera_editor_download);
            this.f40529L0.setImageResource(AbstractC16803z.icn_sound);
            AbstractC23136l9.m118744r1(this.f40650u, 8);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a5 */
    public /* synthetic */ void m38000a5() {
        try {
            VideoSpeedLayout videoSpeedLayout = this.f40600f0;
            if (videoSpeedLayout != null) {
                videoSpeedLayout.setReverseButtonEnable(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: a7 */
    private void m38001a7(JSONObject jSONObject) {
        try {
            jSONObject.put("is_bitmap_cropped_or_rotated", this.f40513H0);
            jSONObject.put("is_cropping", this.f40497D0);
            jSONObject.put("is_cropped", this.f40501E0);
            if (this.f40501E0) {
                jSONObject.put("is_cropping", this.f40497D0);
                jSONObject.put("crop_angle", this.f40517I0);
                if (this.f40497D0) {
                    C21362q c21362q = this.f40485A0;
                    if (c21362q != null) {
                        jSONObject.put("rcl", c21362q.f104140a);
                        jSONObject.put("rct", this.f40485A0.f104141b);
                        jSONObject.put("rcr", this.f40485A0.f104142c);
                        jSONObject.put("rcb", this.f40485A0.f104143d);
                    }
                    RectF cropOverlayRectInPercentage = this.f40671z0.getCropOverlayRectInPercentage();
                    jSONObject.put("rcol", cropOverlayRectInPercentage.left);
                    jSONObject.put("rcot", cropOverlayRectInPercentage.top);
                    jSONObject.put("rcor", cropOverlayRectInPercentage.right);
                    jSONObject.put("rcob", cropOverlayRectInPercentage.bottom);
                    jSONObject.put("is_square", this.f40509G0);
                }
            }
            this.f40542O1.getRender().m98276S1(jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: a8 */
    private void m38002a8(boolean z11) {
        boolean z12;
        int i11 = 0;
        if (z11 && !AbstractC22470k.m116158j(this.f40534M1.f41129s, 5, 9)) {
            z12 = true;
        } else {
            z12 = false;
        }
        LinearLayout linearLayout = this.f40662x;
        if (!z12) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(linearLayout, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:2:0x0000, B:8:0x0039, B:11:0x004d, B:13:0x00ae, B:14:0x00b7), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* renamed from: b3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38006b3() {
        int i11;
        long j11;
        try {
            this.f40580Y1 = AbstractC23204s0.m119557h().getPath() + File.separator + "iframe_video_" + System.currentTimeMillis() + ".mp4";
            int i12 = this.f40554R1;
            if (i12 != 2 && i12 != 3) {
                i11 = 2;
                this.f40606h0 = i11;
                this.f40584Z2.removeMessages(12);
                Handler handler = this.f40584Z2;
                if (this.f40606h0 != 2) {
                    j11 = 500;
                } else {
                    j11 = 1500;
                }
                handler.sendEmptyMessageDelayed(12, j11);
                final Object obj = new Object();
                this.f40618l0 = obj;
                final long currentTimeMillis = System.currentTimeMillis();
                AbstractC20110a.m104544m("convertVideoToIFrames() called start time= %s", Long.valueOf(currentTimeMillis));
                AbstractC20110a.m104544m("convertVideoToIFrames() editingMediaPath= " + this.f40577X1 + ", iFrameVideoOutputPath= " + this.f40580Y1 + ", start= " + this.f40609i0 + ", duration= " + this.f40612j0 + ", convertIFrameVideoToken= " + this.f40618l0, new Object[0]);
                if (this.f40554R1 == 4) {
                    setBtnFinishEditEnabled(false);
                    m38046g6(false);
                }
                AbstractC27985d.m141006w(this.f40577X1, this.f40580Y1, this.f40609i0, this.f40612j0, this.f40538N1.f40899m1, new AbstractC27985d.j() { // from class: com.zing.zalo.camera.r
                    @Override // ve.AbstractC27985d.j
                    /* renamed from: a */
                    public final void mo39485a(boolean z11, String str) {
                        CameraEditorController.this.m37992Z4(currentTimeMillis, obj, z11, str);
                    }
                });
            }
            i11 = 1;
            this.f40606h0 = i11;
            this.f40584Z2.removeMessages(12);
            Handler handler2 = this.f40584Z2;
            if (this.f40606h0 != 2) {
            }
            handler2.sendEmptyMessageDelayed(12, j11);
            final Object obj2 = new Object();
            this.f40618l0 = obj2;
            final long currentTimeMillis2 = System.currentTimeMillis();
            AbstractC20110a.m104544m("convertVideoToIFrames() called start time= %s", Long.valueOf(currentTimeMillis2));
            AbstractC20110a.m104544m("convertVideoToIFrames() editingMediaPath= " + this.f40577X1 + ", iFrameVideoOutputPath= " + this.f40580Y1 + ", start= " + this.f40609i0 + ", duration= " + this.f40612j0 + ", convertIFrameVideoToken= " + this.f40618l0, new Object[0]);
            if (this.f40554R1 == 4) {
            }
            AbstractC27985d.m141006w(this.f40577X1, this.f40580Y1, this.f40609i0, this.f40612j0, this.f40538N1.f40899m1, new AbstractC27985d.j() { // from class: com.zing.zalo.camera.r
                @Override // ve.AbstractC27985d.j
                /* renamed from: a */
                public final void mo39485a(boolean z11, String str) {
                    CameraEditorController.this.m37992Z4(currentTimeMillis2, obj2, z11, str);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: b4 */
    private void m38007b4() {
        try {
            if (this.f40572W == null) {
                LocationFilterPager locationFilterPager = (LocationFilterPager) ((ViewStub) findViewById(AbstractC6918a0.stub_camera_location_filter_layout)).inflate();
                this.f40572W = locationFilterPager;
                locationFilterPager.setOnLocationFilterSelectedListener(new C7465c());
                this.f40572W.setImageDecorView(this.f40542O1);
                this.f40572W.m39371d(this.f40570V1);
                AbstractC2790b abstractC2790b = this.f40585a0;
                if (abstractC2790b != null) {
                    this.f40572W.setLocationFilterSelected(abstractC2790b);
                }
                List<AbstractC2790b> list = this.f40588b0;
                if (list != null) {
                    this.f40572W.setLocationFilters(list);
                }
                m37850F2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b5 */
    public /* synthetic */ void m38008b5() {
        try {
            if (this.f40591c0) {
                return;
            }
            this.f40591c0 = true;
            this.f40584Z2.removeMessages(4);
            this.f40584Z2.sendEmptyMessageDelayed(4, 500L);
            this.f40594d0 = false;
            C28193t5.m141757e().m141761d(new C7495y(), true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b6 */
    public void m38009b6() {
        if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7) && this.f40534M1.f41135v == 1) {
            AbstractC23647d.m123897g("49150052");
        }
        if ((m37904N4() || m37897M4()) && !m37961V2(true)) {
            this.f40543O2 = 2;
        } else {
            m38018c6();
        }
    }

    /* renamed from: b7 */
    private void m38010b7() {
        AbstractC21351f currentVisualDecor = getCurrentVisualDecor();
        if (currentVisualDecor != null) {
            this.f40622m1 = currentVisualDecor.m110606f0();
            this.f40625n1 = currentVisualDecor.m110607g0();
            this.f40628o1 = currentVisualDecor.m110604c0();
            this.f40632p1 = currentVisualDecor.m110605e0();
        }
    }

    /* renamed from: b8 */
    private void m38011b8() {
        int i11;
        ActiveImageColorButton activeImageColorButton = this.f40484A;
        if (m38147s3()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* renamed from: c3 */
    private int m38015c3(String str, String str2) {
        try {
            if (str.equals(str2)) {
                return 0;
            }
            AbstractC23238v2.m119717b(new File(str), new File(str2));
            AbstractC23041d2.m118208g(str);
            return 0;
        } catch (IOException e11) {
            AbstractC20110a.m104539h(e11);
            if (!AbstractC23227u1.m119701a(e11) && AbstractC23238v2.m119726k()) {
                return 502;
            }
            return 601;
        }
    }

    /* renamed from: c4 */
    private void m38016c4() {
        if (this.f40559S2 == null) {
            C22949b c22949b = new C22949b(this.f40542O1, null, 0, 0, 0.0f, 96);
            this.f40559S2 = c22949b;
            c22949b.m117671k(300);
            this.f40559S2.m117672l(new AccelerateDecelerateInterpolator());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c5 */
    public static /* synthetic */ void m38017c5(String str) {
        AbstractC23280z4.m120303O(str, Environment.DIRECTORY_DCIM, AbstractC23280z4.m120289A(str).getName(), false, false, false, new SensitiveData("gallery_save_edited_photo_sent_csc", "comm_csc"));
    }

    /* renamed from: c6 */
    private void m38018c6() {
        boolean z11;
        VideoBlendingParam videoBlendingParam;
        try {
            if (!this.f40544P && this.f40506F1) {
                boolean z12 = false;
                AbstractC20110a.m104544m("onFinishEdit start:", new Object[0]);
                if (m37897M4()) {
                    C27373c c27373c = this.f40534M1.f41082A;
                    if (c27373c != null && (videoBlendingParam = c27373c.f128947T) != null && videoBlendingParam.f48265Q > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z13 = this.f40550Q1;
                    if (z11 || this.f40546P1 == 10) {
                        z12 = true;
                    }
                    this.f40550Q1 = z13 | z12;
                }
                m38193y3();
                ZaloCameraView zaloCameraView = this.f40538N1;
                if (zaloCameraView != null) {
                    zaloCameraView.m39077uU();
                    this.f40538N1.m39055jT();
                }
                m37914O5();
                if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7)) {
                    if (C22052u.m115085y().m115088C()) {
                        m38208A7();
                        return;
                    } else {
                        m38088l7();
                        return;
                    }
                }
                this.f40538N1.f40904o2 = C23793c.m124316k().mo124319c();
                m38088l7();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
            m38076k3();
            this.f40538N1.mo49315c4();
        }
    }

    /* renamed from: c7 */
    private void m38019c7(JSONObject jSONObject) {
        DoodleView doodleView = this.f40552R;
        if (doodleView != null && doodleView.m67556v()) {
            JSONObject jSONObject2 = new JSONObject();
            this.f40552R.m67526C0(jSONObject2);
            jSONObject.put("doodle_data", jSONObject2);
        }
    }

    /* renamed from: d4 */
    private void m38023d4() {
        try {
            if (this.f40601f1 == null) {
                MusicView musicView = (MusicView) ((ViewStub) findViewById(AbstractC6918a0.stub_camera_music_layout)).inflate();
                this.f40601f1 = musicView;
                musicView.setMusicViewListener(new C7477i());
                this.f40601f1.m39416x();
                m37850F2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d5 */
    public /* synthetic */ void m38024d5(boolean z11, int i11, final String str) {
        try {
            AbstractC23237v1.m119713a("savePicture");
            setBtnFinishEditEnabled(true);
            if (i11 == 0) {
                m38170v3(str);
                if (z11) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraEditorController.m38017c5(str);
                        }
                    });
                }
            } else {
                m37831C3("");
                AbstractC23237v1.m119713a("sendPicture");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
            m37831C3(e11.toString());
        }
    }

    /* renamed from: d6 */
    private void m38025d6() {
        if (this.f40540O) {
            return;
        }
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null && locationFilterPager.getVisibility() == 0) {
            setEditingMode(0);
            m37944S7(false, true);
        } else {
            m37906N6();
            AbstractC28025b8.m141442M("tip.camera.preview.location");
            m38249T2("tip.camera.preview.location");
        }
        m37891L6("121N060");
    }

    /* renamed from: d7 */
    private void m38026d7(JSONObject jSONObject) {
        try {
            C29605a m39064nQ = this.f40538N1.m39064nQ();
            long m39018FQ = this.f40538N1.m39018FQ();
            ZaloCameraView zaloCameraView = this.f40538N1;
            if (zaloCameraView.f40897l1 == 1 && m39064nQ == null) {
                m39064nQ = zaloCameraView.m39007AQ();
                m39018FQ = this.f40538N1.m39008BQ();
            }
            if (m39064nQ != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cate_id", m39018FQ);
                JSONObject m147147x = m39064nQ.m147147x();
                if (m147147x != null) {
                    jSONObject2.put("filter_anim_list", m147147x);
                }
                jSONObject.put("filter_anim", jSONObject2.toString());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: e4 */
    private void m38030e4() {
        if (this.f40652u1 == null) {
            View inflate = ((ViewStub) findViewById(AbstractC6918a0.stub_camera_button_overflow_layout)).inflate();
            this.f40652u1 = inflate;
            inflate.setOnClickListener(this);
            int i11 = 8;
            AbstractC23136l9.m118744r1(this.f40652u1, 8);
            View findViewById = this.f40652u1.findViewById(AbstractC6918a0.camera_more_video_speed_layout);
            this.f40656v1 = findViewById;
            findViewById.setOnClickListener(this);
            View findViewById2 = this.f40652u1.findViewById(AbstractC6918a0.camera_more_photo_crop_layout);
            this.f40660w1 = findViewById2;
            findViewById2.setOnClickListener(this);
            View findViewById3 = this.f40652u1.findViewById(AbstractC6918a0.camera_more_doodle_layout);
            if (m38094m3()) {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(findViewById3, i11);
            findViewById3.setOnClickListener(this);
            View findViewById4 = this.f40652u1.findViewById(AbstractC6918a0.camera_more_filter_layout);
            AbstractC23136l9.m118744r1(findViewById4, 0);
            findViewById4.setOnClickListener(this);
            View findViewById5 = this.f40652u1.findViewById(AbstractC6918a0.camera_more_location_layout);
            AbstractC23136l9.m118744r1(findViewById5, 0);
            findViewById5.setOnClickListener(this);
            View findViewById6 = this.f40652u1.findViewById(AbstractC6918a0.camera_more_save_layout);
            this.f40666y = findViewById6;
            AbstractC23136l9.m118744r1(findViewById6, 0);
            this.f40666y.setOnClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public /* synthetic */ void m38031e5(boolean z11) {
        try {
            m37834C8();
            if (!new File(this.f40583Z1).exists()) {
                AbstractC20887g.m109229g(21000, 21007, this.f40583Z1);
            }
            if (z11) {
                AbstractC23280z4.m120303O(this.f40583Z1, Environment.DIRECTORY_DCIM, AbstractC23280z4.m120289A(this.f40583Z1).getName(), false, false, false, new SensitiveData("gallery_save_captured_photo_sent_csc", "comm_csc"));
            }
        } catch (Exception e11) {
            e = e11;
            AbstractC23350e.m122776f("CameraEditorController", e);
            m37831C3(e.toString());
        } catch (OutOfMemoryError e12) {
            e = e12;
            AbstractC23350e.m122776f("CameraEditorController", e);
            m37831C3(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e6 */
    public void m38032e6() {
        String str;
        m37981X7(false);
        try {
            C23648e m154346U = C32017m4.m154326S().m154346U(C32002l4.m154264g(7).m154284u(81));
            C28212v6 m141453i = AbstractC28025b8.m141453i("tip.camera.story.music");
            String str2 = "0";
            if (this.f40562T1 == null) {
                str = "0";
            } else {
                str = "1";
            }
            if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                str2 = "1";
            }
            m154346U.m123919l()[0] = str;
            m154346U.m123919l()[1] = str2;
            C0815e1.m2075D().m2100V(m154346U, false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        AbstractC28025b8.m141442M("tip.camera.story.music");
        m38249T2("tip.camera.story.music");
        if (m37866H3() && this.f40601f1.getVisibility() != 0) {
            this.f40538N1.m39075tT();
            m37972W6(getCurrentVisualDecor());
        } else if (!this.f40538N1.mo60294yp()) {
            this.f40538N1.m39015DS();
            Bundle bundle = new Bundle();
            AbstractC25951b.m133689b(bundle, new MusicSelectParam(C32002l4.m154266i(new C31987k4(7)), -1));
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 9);
            this.f40538N1.m92662fJ().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 11125, 0, true);
        }
    }

    /* renamed from: e7 */
    private void m38033e7(JSONObject jSONObject) {
        AbstractC2790b abstractC2790b = this.f40585a0;
        if (abstractC2790b != null) {
            jSONObject.put("location_filter_data", abstractC2790b.m13447g());
        }
    }

    /* renamed from: e8 */
    private void m38034e8(boolean z11) {
        int i11;
        ActiveImageColorButton activeImageColorButton = this.f40621m0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* renamed from: f4 */
    private void m38038f4() {
        if (this.f40488B == null) {
            ActiveImageColorButton activeImageColorButton = new ActiveImageColorButton(getContext());
            this.f40488B = activeImageColorButton;
            activeImageColorButton.setId(AbstractC6918a0.btn_editor_filter_quick_access);
            this.f40488B.setImageResource(AbstractC23322a.zds_ic_face_filter_solid_24);
            this.f40488B.setCircleColor(Color.parseColor("#FF0085ff"));
            this.f40488B.setOnClickListener(this);
            this.f40488B.setVisibility(0);
            setSelectedQuickAccessFilter(this.f40538N1.f40896k2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f5 */
    public /* synthetic */ void m38039f5(Long l11) {
        ExpandableActionView expandableActionView = this.f40650u;
        if (expandableActionView != null) {
            expandableActionView.setCameraSelectedFilterCateId(l11.longValue());
        }
    }

    /* renamed from: f6 */
    private void m38040f6() {
        String m118743r0;
        if (this.f40615k0 == 1.0f && this.f40603g0 != 1) {
            if (this.f40498D1 != null) {
                boolean z11 = !this.f40537N0;
                this.f40537N0 = z11;
                setVideoSoundMode(z11);
                if (this.f40537N0) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_sound_mode_off);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_sound_mode_on);
                }
                m38054h8(m118743r0);
                return;
            }
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.str_video_sound_mode_error, new Object[0]);
    }

    /* renamed from: g4 */
    private void m38044g4() {
        try {
            if (this.f40496D == null) {
                DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) ((ViewStub) findViewById(AbstractC6918a0.stub_camera_sticker_layout)).inflate();
                this.f40496D = dragToCloseLayout;
                dragToCloseLayout.setForceInterceptTouch(true);
                this.f40496D.setOnDragToCloseListener(getStickerDragToCloseListener());
                ((ActiveImageButton) findViewById(AbstractC6918a0.btn_sticker_layout_back_cam)).setOnClickListener(this);
                m37880J6();
                m38278h4();
                m37850F2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g5 */
    public /* synthetic */ void m38045g5() {
        try {
            this.f40624n0.m39614b(this.f40599e2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g6 */
    public void m38046g6(boolean z11) {
        ActiveImageColorButton activeImageColorButton = this.f40658w;
        if (activeImageColorButton != null) {
            activeImageColorButton.setEnabled(z11);
        }
        View view = this.f40666y;
        if (view != null) {
            view.setEnabled(z11);
        }
    }

    /* renamed from: g7 */
    private void m38047g7() {
        try {
            if (this.f40542O1.m39774d0()) {
                m38062i7();
            } else {
                AbstractC23136l9.m118744r1(this.f40526K1, 0);
                this.f40530L1 = true;
                final File m114577a = AbstractC21943a.m114577a();
                m38053h7(m114577a, new AbstractC27985d.d() { // from class: com.zing.zalo.camera.o
                    @Override // ve.AbstractC27985d.d
                    /* renamed from: a */
                    public final void mo39425a(int i11, String str) {
                        CameraEditorController.this.m38180w5(m114577a, i11, str);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    private C21362q getCropAnimRectEnd() {
        C21362q c21362q;
        int m155409h = AbstractC23222t7.f112517C0 + AbstractC32226c.m155409h(getRootView());
        double[] m98274R1 = this.f40542O1.getRender().m98274R1(getHeight() - m155409h, false);
        if (m98274R1 != null && m98274R1.length == 6) {
            c21362q = new C21362q(m98274R1[2], m98274R1[3], m98274R1[4], m98274R1[5]);
        } else {
            this.f40542O1.getRender().m98290f2(getHeight() - m155409h);
            m37869H6();
            c21362q = new C21362q(this.f40542O1.getRender().m98306o1());
        }
        return new C21362q(c21362q);
    }

    private C21362q getCurrentCropRect() {
        return new C21362q(this.f40542O1.getRender().m98288d1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC21351f getCurrentVisualDecor() {
        C18420a c18420a = this.f40616k1;
        if (c18420a != null) {
            return c18420a;
        }
        C18422c c18422c = this.f40619l1;
        if (c18422c != null) {
            return c18422c;
        }
        return null;
    }

    private AnimatorSet getEditorAnimatorSetForCrop() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40638r, "translationY", 0.0f), ObjectAnimator.ofFloat(this.f40638r, "alpha", 1.0f), ObjectAnimator.ofFloat(this.f40642s, "translationY", 0.0f), ObjectAnimator.ofFloat(this.f40642s, "alpha", 1.0f), ObjectAnimator.ofFloat(this.f40650u, "translationX", 0.0f), ObjectAnimator.ofFloat(this.f40650u, "alpha", 1.0f));
        animatorSet.addListener(new C7464b0());
        animatorSet.setInterpolator(new C26088c());
        animatorSet.setDuration(225L);
        return animatorSet;
    }

    private View getFinishEditButton() {
        if (this.f40668y1.getParent() != null) {
            return this.f40668y1;
        }
        if (this.f40664x1.getParent() != null) {
            return this.f40664x1;
        }
        return this.f40672z1;
    }

    private int getPhotoDimensionMaxBySource() {
        int m137112u = AbstractC26689j.m137112u(this.f40538N1.f40899m1);
        try {
            if (m37852F4()) {
                return Math.max(AbstractC23136l9.m118731n0(this.f40538N1.m92648SI()), AbstractC23136l9.m118719j0(this.f40538N1.m92648SI()));
            }
            return m137112u;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
            return m137112u;
        }
    }

    private DragToCloseLayout.InterfaceC16432a getStickerDragToCloseListener() {
        return new C7476h0();
    }

    private EnumC25253a getVideoSpeedLayoutType() {
        if (m38113o4()) {
            return EnumC25253a.f121116q;
        }
        return EnumC25253a.f121115p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h5 */
    public /* synthetic */ void m38051h5(BitmapFactory.Options options, String str) {
        InterfaceC7480j0 interfaceC7480j0;
        float f11;
        int i11;
        if (options.outWidth > 0 && options.outHeight > 0) {
            if (AbstractC32212c.m155334d(AbstractC23277z1.m120058b(str))) {
                f11 = options.outHeight;
                i11 = options.outWidth;
            } else {
                f11 = options.outWidth;
                i11 = options.outHeight;
            }
            float f12 = f11 / i11;
            boolean m39213b = this.f40534M1.m39213b();
            boolean z11 = true;
            if (this.f40608h2) {
                if (this.f40546P1 == 5) {
                    m38212C6(true, new int[0]);
                } else {
                    m38275g8(str);
                }
            } else {
                int[] m38205z8 = m38205z8(f12, true);
                m38275g8(str);
                if (!m39213b && this.f40546P1 != 5) {
                    z11 = false;
                }
                if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 4) && z11 && !this.f40501E0 && !this.f40497D0) {
                    m38212C6(false, m38205z8);
                    if (m39213b) {
                        this.f40538N1.m39080vU(new C21362q(this.f40671z0.getBoundingBox()));
                    }
                }
            }
            this.f40608h2 = false;
            return;
        }
        if (AbstractC23034c6.m118116D(getContext(), AbstractC23034c6.f112029f) && (interfaceC7480j0 = this.f40558S1) != null) {
            interfaceC7480j0.mo38353k(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        }
    }

    /* renamed from: h6 */
    private void m38052h6() {
        if (!this.f40506F1) {
            return;
        }
        m38212C6(true, new int[0]);
    }

    /* renamed from: h7 */
    private void m38053h7(final File file, final AbstractC27985d.d dVar) {
        AbstractC23237v1.m119715c("savePicture");
        AbstractC27985d.m140992i(this.f40542O1, new C27989h.a() { // from class: com.zing.zalo.camera.k0
            @Override // ve.C27989h.a
            /* renamed from: a */
            public final void mo39367a(Bitmap bitmap) {
                CameraEditorController.this.m38187x5(file, dVar, bitmap);
            }
        });
    }

    /* renamed from: h8 */
    private void m38054h8(String str) {
        if (this.f40533M0 == null) {
            return;
        }
        Animator animator = this.f40661w2;
        if (animator != null) {
            animator.cancel();
        }
        this.f40533M0.setText(str);
        if (!this.f40630p.isShown()) {
            this.f40533M0.setAlpha(0.0f);
            this.f40630p.setAlpha(0.0f);
        }
        AbstractC23136l9.m118744r1(this.f40533M0, 0);
        AbstractC23136l9.m118744r1(this.f40630p, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40533M0, "alpha", 0.5f), ObjectAnimator.ofFloat(this.f40630p, "alpha", 1.0f));
        animatorSet2.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f40533M0, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f40630p, "alpha", 0.0f));
        animatorSet3.setStartDelay(1500L);
        animatorSet3.setDuration(100L);
        animatorSet.playTogether(animatorSet2, animatorSet3);
        animatorSet.addListener(new C7485o());
        this.f40661w2 = animatorSet;
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i3 */
    public void m38058i3() {
        InterfaceC30925e interfaceC30925e = this.f40498D1;
        if (interfaceC30925e != null && !interfaceC30925e.isPlaying()) {
            this.f40498D1.mo150227d();
        }
    }

    /* renamed from: i4 */
    private void m38059i4() {
        this.f40500E.m72709oO(new C7462a0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i5 */
    public /* synthetic */ void m38060i5(final String str) {
        final BitmapFactory.Options m18820a = AbstractC3974g.f15714a.m18820a(str);
        this.f40538N1.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.p
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38051h5(m18820a, str);
            }
        });
    }

    /* renamed from: i6 */
    private void m38061i6(final boolean z11, final C27373c c27373c) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.camera.e0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38131q5(c27373c, z11);
            }
        });
    }

    /* renamed from: i7 */
    private void m38062i7() {
        String m140990g;
        VideoCropLayout videoCropLayout;
        if (!this.f40599e2 && m38225I3() && this.f40554R1 != 4) {
            AbstractC22470k.m116166r(this.f40577X1, this.f40551Q2, this.f40534M1.f41129s);
            return;
        }
        if (this.f40554R1 == 4 && TextUtils.isEmpty(this.f40580Y1)) {
            InterfaceC30925e interfaceC30925e = this.f40498D1;
            if (interfaceC30925e != null) {
                interfaceC30925e.pause();
            }
            m38006b3();
        }
        if (this.f40606h0 != 0) {
            if (this.f40538N1.m92672lJ()) {
                this.f40669y2 = new Runnable() { // from class: com.zing.zalo.camera.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraEditorController.this.m38195y5();
                    }
                };
                if (!this.f40538N1.m78935DL()) {
                    this.f40538N1.mo49282B8(null, true);
                    return;
                }
                return;
            }
            return;
        }
        VideoNativeCompressConfig m137106o = AbstractC26689j.m137106o(this.f40538N1.f40899m1);
        VideoBlendingParam videoBlendingParam = new VideoBlendingParam();
        videoBlendingParam.f48277q = this.f40577X1;
        if (m38113o4()) {
            m140990g = AbstractC22466g.m116129c();
        } else {
            m140990g = AbstractC27985d.m140990g();
        }
        videoBlendingParam.f48278r = m140990g;
        videoBlendingParam.f48282v = this.f40542O1.getWidth();
        videoBlendingParam.f48283w = this.f40542O1.getHeight();
        videoBlendingParam.f48285y = AbstractC26689j.m137083J(this.f40538N1.f40899m1);
        videoBlendingParam.f48286z = AbstractC26689j.m137107p(this.f40538N1.f40899m1);
        videoBlendingParam.f48284x = m137106o.m40329b();
        videoBlendingParam.f48249A = AbstractC26689j.m137077D(this.f40538N1.f40899m1);
        videoBlendingParam.f48281u = null;
        videoBlendingParam.f48280t = this.f40538N1.m39031OS();
        videoBlendingParam.f48251C = false;
        videoBlendingParam.f48252D = this.f40518I1;
        videoBlendingParam.f48262N = this.f40615k0;
        videoBlendingParam.f48270V = this.f40537N0;
        int i11 = this.f40603g0;
        if (i11 == 1) {
            videoBlendingParam.f48276p = 1;
        } else if (i11 == 0) {
            videoBlendingParam.f48276p = 0;
        }
        if (this.f40550Q1 && (videoCropLayout = this.f40624n0) != null) {
            videoBlendingParam.f48264P = videoCropLayout.getStartPoint();
            videoBlendingParam.f48265Q = this.f40639r0;
        }
        videoBlendingParam.f48259K = true;
        if (this.f40554R1 == 4) {
            videoBlendingParam.f48276p = 2;
            videoBlendingParam.f48269U = 3;
        }
        videoBlendingParam.f48271W = this.f40542O1.getDecorOnlyBitmap();
        m38169v2(videoBlendingParam);
        videoBlendingParam.f48274Z = m137106o;
        videoBlendingParam.f48275a0 = AbstractC26689j.m137088O(this.f40538N1.f40899m1);
        AbstractC22470k.m116165q(videoBlendingParam, this.f40617k2, this.f40604g1, this.f40551Q2, this.f40534M1.f41129s, Boolean.valueOf(this.f40599e2));
        this.f40614j2.f40693b = true;
    }

    /* renamed from: i8 */
    private void m38063i8() {
        AbstractC23136l9.m118744r1(this.f40496D, 0);
        m38221F7(this.f40500E, true);
    }

    /* renamed from: j4 */
    private void m38067j4() {
        if (this.f40520J == null) {
            C22949b c22949b = new C22949b(this.f40542O1, null, 0, 0, 0.0f, this.f40516I.getTextSize());
            this.f40520J = c22949b;
            c22949b.m117671k(300);
            this.f40520J.m117672l(new AccelerateDecelerateInterpolator());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j5 */
    public /* synthetic */ void m38068j5() {
        ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
        InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
        if (interfaceC7480j0 != null) {
            interfaceC7480j0.mo38346d();
        }
    }

    /* renamed from: j6 */
    private void m38069j6() {
        m37981X7(false);
        if (!this.f40538N1.mo60294yp()) {
            AbstractC28025b8.m141442M("tip.camera.story.privacy_setting");
            m38249T2("tip.camera.story.privacy_setting");
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_INITIAL_PRIVACY_TYPE", this.f40569V0);
            bundle.putString("EXTRA_ENTRY_POINT_SOURCE", "story_editor");
            this.f40538N1.m92662fJ().m93066i2(StoryPrivacyBottomSheetView.class, bundle, 11124, 0, true);
        }
    }

    /* renamed from: j7 */
    private void m38070j7(JSONObject jSONObject) {
        int i11;
        jSONObject.put("need_flipping_video", this.f40518I1);
        jSONObject.put("video_speed", this.f40615k0);
        jSONObject.put("video_reverse_mode", this.f40603g0);
        jSONObject.put("is_muted", this.f40537N0);
        jSONObject.put("original_video_start_pos", this.f40627o0);
        jSONObject.put("original_video_play_duration", this.f40631p0);
        jSONObject.put("current_video_start_pos", this.f40635q0);
        jSONObject.put("current_video_play_duration", this.f40639r0);
        VideoCropLayout videoCropLayout = this.f40624n0;
        if (videoCropLayout != null) {
            i11 = videoCropLayout.f41732v;
        } else {
            i11 = 0;
        }
        jSONObject.put("current_video_timeline_scroll_pos", i11);
        jSONObject.put("reverse_video_start_pos", this.f40609i0);
        jSONObject.put("reverse_video_play_duration", this.f40612j0);
        jSONObject.put("editing_video_record_mode", this.f40554R1);
        jSONObject.put("video_message_layout", this.f40659w0);
    }

    /* renamed from: j8 */
    private void m38071j8(VideoBlendingParam videoBlendingParam, String str) {
        try {
            if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7)) {
                m38124p7(videoBlendingParam);
            } else {
                m38115o7(videoBlendingParam, str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3 */
    public void m38076k3() {
        setBtnFinishEditEnabled(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:            if (r0 <= 0) goto L15;     */
    /* renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m38077k4() {
        int i11;
        int i12;
        if (this.f40624n0 == null) {
            ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_camera_video_crop);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewStub.getLayoutParams();
            layoutParams.width = Math.min(AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
            viewStub.setLayoutParams(layoutParams);
            VideoCropLayout videoCropLayout = (VideoCropLayout) viewStub.inflate();
            this.f40624n0 = videoCropLayout;
            videoCropLayout.setListener(new VideoCropLayout.InterfaceC7776c() { // from class: com.zing.zalo.camera.b
                @Override // com.zing.zalo.camera.videos.videocrop.VideoCropLayout.InterfaceC7776c
                /* renamed from: a */
                public final void mo39158a(boolean z11, boolean z12, boolean z13) {
                    CameraEditorController.this.m38149s6(z11, z12, z13);
                }
            });
            int i13 = 3000;
            if (m38105n4()) {
                C30923c c30923c = this.f40587a2;
                i11 = c30923c.f142622d;
                i12 = c30923c.f142632n;
            } else {
                C30923c c30923c2 = this.f40587a2;
                i11 = c30923c2.f142632n;
                if (i11 <= 0) {
                    i11 = c30923c2.f142622d;
                }
                if (this.f40534M1.f41129s == 9) {
                    i13 = AbstractC26689j.m137116y(4) * 1000;
                }
            }
            i12 = i11;
            this.f40624n0.m39616d(this.f40577X1, i11, m38105n4());
            this.f40624n0.m39615c(i11, i13, i12);
            if (m38105n4()) {
                float f11 = i11;
                this.f40624n0.setMinProgress((i13 * 1.0f) / f11);
                this.f40624n0.setMaxProgress(1.0f);
                this.f40624n0.setMaxDistanceLeftToRightProgress((Math.max(this.f40647t0, i12) * 1.0f) / f11);
                this.f40624n0.setLeftProgress((this.f40587a2.f142631m * 1.0f) / f11);
                this.f40624n0.setRightProgress(((this.f40587a2.f142631m + Math.min(this.f40639r0, i12)) * 1.0f) / f11);
            }
            this.f40584Z2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.c
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m38045g5();
                }
            }, 2000L);
            this.f40624n0.m39621i(this.f40587a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5 */
    public /* synthetic */ void m38078k5() {
        if (!AbstractC23238v2.m119726k()) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.camera.v
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m38068j5();
                }
            });
            return;
        }
        C27373c c27373c = new C27373c();
        c27373c.m140250e0(this.f40577X1);
        boolean m138620f = AbstractC26897a.m138620f(c27373c);
        if (m138620f && AbstractC32212c.m155334d(c27373c.m140265s())) {
            int m140221F = c27373c.m140221F();
            c27373c.m140252f0(c27373c.m140272z());
            c27373c.m140241Z(m140221F);
        }
        m38061i6(m138620f, c27373c);
    }

    /* renamed from: k6 */
    private void m38079k6() {
        if (this.f40655v0) {
            return;
        }
        this.f40655v0 = true;
        ZaloCameraView zaloCameraView = this.f40538N1;
        zaloCameraView.f40894j2 = true;
        zaloCameraView.f40896k2 = true ^ this.f40508G;
        zaloCameraView.m39012CQ();
        AbstractC28025b8.m141442M("tip.camera.beauty");
        m38249T2("tip.camera.beauty");
        this.f40584Z2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.j
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38141r5();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7 */
    public void m38080k7(int i11, boolean z11, boolean z12) {
        AbstractC20110a.m104544m(String.format("seekTo: ms: %d fastSeek: %b", Integer.valueOf(i11), Boolean.valueOf(z11)), new Object[0]);
        if (z11) {
            if (!z12) {
                Handler handler = this.f40584Z2;
                handler.sendMessageDelayed(handler.obtainMessage(10, Integer.valueOf(i11)), 250L);
            }
            if (this.f40502E1) {
                if (this.f40538N1 != null) {
                    m37912O3();
                    this.f40624n0.m39619g(true);
                }
                this.f40502E1 = false;
            }
        } else {
            this.f40584Z2.removeMessages(10);
            Handler handler2 = this.f40584Z2;
            handler2.sendMessageDelayed(handler2.obtainMessage(9, Integer.valueOf(i11)), 250L);
            this.f40584Z2.sendEmptyMessageDelayed(11, 250L);
            if (this.f40538N1 != null) {
                m38217E2();
                this.f40624n0.m39619g(false);
            }
            this.f40502E1 = false;
        }
        if (m38233K4()) {
            this.f40624n0.setCurrentPosition(i11);
        }
    }

    /* renamed from: l3 */
    private boolean m38085l3() {
        if (this.f40546P1 == 11 && AbstractC22470k.m116156h(this.f40534M1)) {
            return true;
        }
        return false;
    }

    /* renamed from: l4 */
    private void m38086l4() {
        try {
            if (this.f40600f0 == null) {
                VideoSpeedLayout videoSpeedLayout = (VideoSpeedLayout) ((ViewStub) findViewById(AbstractC6918a0.stub_camera_video_speed_layout)).inflate();
                this.f40600f0 = videoSpeedLayout;
                videoSpeedLayout.setLayoutType(getVideoSpeedLayoutType());
                this.f40600f0.setVideoSpeedChangeListener(new C7469e());
                m37830C2(AbstractC22463d.m116126a(getContext(), AbstractC32212c.m155331a(getContext())));
                m37850F2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l5 */
    public /* synthetic */ void m38087l5() {
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null && zaloCameraView.m39087zR()) {
            this.f40538N1.m39042YT(false);
        }
    }

    /* renamed from: l7 */
    private void m38088l7() {
        if (m38214D4()) {
            m38108n7();
        } else {
            m38098m7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l8 */
    public void m38089l8(String str) {
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null) {
            zaloCameraView.m39070pU(str);
        }
    }

    /* renamed from: m3 */
    private boolean m38094m3() {
        return true;
    }

    /* renamed from: m4 */
    private void m38095m4() {
        if (this.f40492C == null) {
            View view = new View(getContext());
            this.f40492C = view;
            view.setId(AbstractC6918a0.view_center);
            this.f40492C.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m5 */
    public /* synthetic */ void m38096m5() {
        ZaloCameraView zaloCameraView;
        DoodleView doodleView = this.f40552R;
        if ((doodleView == null || !doodleView.m67556v()) && (zaloCameraView = this.f40538N1) != null) {
            zaloCameraView.m39042YT(false);
        }
        m38134q8();
        ZaloCameraView zaloCameraView2 = this.f40538N1;
        if (zaloCameraView2 != null) {
            zaloCameraView2.m39069oT();
        }
        if (this.f40546P1 == 4 && !AbstractC23034c6.m118114C(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            m38025d6();
        }
    }

    /* renamed from: m6 */
    private void m38097m6(JSONObject jSONObject) {
        try {
            this.f40501E0 = jSONObject.optBoolean("is_cropped");
            this.f40542O1.getRender().m98284Y1(jSONObject);
            if (this.f40501E0) {
                this.f40497D0 = jSONObject.optBoolean("is_cropping");
                this.f40517I0 = jSONObject.optInt("crop_angle");
                if (this.f40497D0) {
                    C21362q c21362q = new C21362q();
                    this.f40485A0 = c21362q;
                    c21362q.f104140a = jSONObject.optDouble("rcl");
                    this.f40485A0.f104141b = jSONObject.optDouble("rct");
                    this.f40485A0.f104142c = jSONObject.optDouble("rcr");
                    this.f40485A0.f104143d = jSONObject.optDouble("rcb");
                    RectF rectF = new RectF();
                    this.f40489B0 = rectF;
                    rectF.left = (float) jSONObject.optDouble("rcol");
                    this.f40489B0.top = (float) jSONObject.optDouble("rcot");
                    this.f40489B0.right = (float) jSONObject.optDouble("rcor");
                    this.f40489B0.bottom = (float) jSONObject.optDouble("rcob");
                    this.f40509G0 = jSONObject.optBoolean("is_square");
                }
                if (this.f40497D0) {
                    this.f40505F0 = true;
                    if (!TextUtils.isEmpty(this.f40583Z1) || !TextUtils.isEmpty(this.f40574W1)) {
                        m38212C6(false, new int[0]);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: m7 */
    private void m38098m7() {
        AbstractC23237v1.m119715c("sendPicture");
        setBtnFinishEditEnabled(false);
        try {
            boolean m116150b = AbstractC22470k.m116150b(this.f40599e2, this.f40534M1.f41129s, this.f40538N1.f40899m1);
            if (m38225I3()) {
                if (!this.f40599e2 && TextUtils.isEmpty(this.f40583Z1)) {
                    this.f40602f2 = true;
                    m38076k3();
                } else {
                    m37838D3(m116150b);
                }
            } else {
                m37823B3(m116150b);
            }
        } catch (Exception e11) {
            e = e11;
            AbstractC23350e.m122776f("CameraEditorController", e);
            m37831C3(e.toString());
        } catch (OutOfMemoryError e12) {
            e = e12;
            AbstractC23350e.m122776f("CameraEditorController", e);
            m37831C3(e.toString());
        }
    }

    /* renamed from: m8 */
    private void m38099m8(String str, String str2) {
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null) {
            zaloCameraView.m39072qU(str, str2);
        }
    }

    /* renamed from: n3 */
    private boolean m38104n3() {
        return true;
    }

    /* renamed from: n4 */
    private boolean m38105n4() {
        return m37897M4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n5 */
    public /* synthetic */ void m38106n5() {
        C30923c c30923c;
        int i11;
        VideoCropLayout videoCropLayout;
        int i12;
        try {
            if (this.f40538N1 != null) {
                if (!m37866H3()) {
                    m38134q8();
                }
                this.f40538N1.m39069oT();
                this.f40538N1.m39042YT(false);
            }
            if (AbstractC26689j.f126436b) {
                int i13 = this.f40534M1.f41129s;
                int i14 = 1;
                if (i13 != 7 && (this.f40599e2 || (i12 = this.f40554R1) == 3 || ((i13 == 2 && i12 == 2) || i13 == 9))) {
                    m38034e8(true);
                }
                CameraInputParams cameraInputParams = this.f40534M1;
                int i15 = cameraInputParams.f41094M;
                if (i15 != 1 && (c30923c = this.f40587a2) != null) {
                    int i16 = c30923c.f142632n;
                    if (i16 <= 0) {
                        i16 = c30923c.f142622d;
                    }
                    if (cameraInputParams.f41129s == 9 && this.f40599e2) {
                        i11 = AbstractC26689j.m137116y(4) * 1000;
                    } else {
                        i11 = 3000;
                    }
                    if (!this.f40538N1.f40925z1 && (videoCropLayout = this.f40624n0) != null) {
                        videoCropLayout.m39618f(i16, this.f40577X1, m38105n4());
                        this.f40624n0.m39617e(i16, i11, i16);
                    }
                    if (this.f40643s0) {
                        m37925Q2(i14);
                    }
                }
                i14 = i15;
                m37925Q2(i14);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: n6 */
    private void m38107n6(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("filter_anim");
            if (optString.length() > 0) {
                JSONObject jSONObject2 = new JSONObject(optString);
                long optLong = jSONObject2.optLong("cate_id");
                JSONObject optJSONObject = jSONObject2.optJSONObject("filter_anim_list");
                if (optJSONObject != null) {
                    C29605a m147125b = C29605a.m147125b(optJSONObject);
                    this.f40538N1.m39083xT(m147125b);
                    ZaloCameraView zaloCameraView = this.f40538N1;
                    if (zaloCameraView.f40897l1 == 1) {
                        zaloCameraView.m39016DT(m147125b, optLong);
                    }
                }
                this.f40538N1.m39021GT(optLong);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: n7 */
    private void m38108n7() {
        try {
            if (this.f40554R1 == 4 && TextUtils.isEmpty(this.f40580Y1)) {
                m37846E8();
                if (this.f40554R1 == 4) {
                    InterfaceC30925e interfaceC30925e = this.f40498D1;
                    if (interfaceC30925e != null) {
                        interfaceC30925e.pause();
                    }
                    m38006b3();
                    return;
                }
                return;
            }
            if (AbstractC23041d2.m118194A(this.f40577X1) && this.f40510G1) {
                m38133q7();
            } else if (this.f40514H1) {
                m37846E8();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
            m38076k3();
        }
    }

    /* renamed from: o3 */
    private void m38112o3() {
        if (!m38296v4()) {
            setAlphaAllButtons(0.8f);
        }
        switch (this.f40546P1) {
            case 1:
                ActiveImageColorButton activeImageColorButton = this.f40484A;
                if (activeImageColorButton != null) {
                    activeImageColorButton.setAlpha(1.0f);
                    this.f40484A.setSelected(true);
                    return;
                }
                return;
            case 2:
                ActiveImageColorButton activeImageColorButton2 = this.f40512H;
                if (activeImageColorButton2 != null) {
                    activeImageColorButton2.setAlpha(1.0f);
                    this.f40512H.setSelected(true);
                    return;
                }
                return;
            case 3:
                ActiveImageColorButton activeImageColorButton3 = this.f40548Q;
                if (activeImageColorButton3 != null) {
                    activeImageColorButton3.setAlpha(1.0f);
                    this.f40548Q.setSelected(true);
                    return;
                }
                return;
            case 4:
                ActiveImageColorButton activeImageColorButton4 = this.f40568V;
                if (activeImageColorButton4 != null) {
                    activeImageColorButton4.setAlpha(1.0f);
                    this.f40568V.setSelected(true);
                    return;
                }
                return;
            case 5:
                ActiveImageColorButton activeImageColorButton5 = this.f40663x0;
                if (activeImageColorButton5 != null) {
                    activeImageColorButton5.setAlpha(1.0f);
                    this.f40663x0.setSelected(true);
                    return;
                }
                return;
            case 6:
                ActiveImageColorButton activeImageColorButton6 = this.f40597e0;
                if (activeImageColorButton6 != null) {
                    activeImageColorButton6.setAlpha(1.0f);
                    this.f40597e0.setSelected(true);
                    return;
                }
                return;
            case 7:
                ActiveImageColorButton activeImageColorButton7 = this.f40651u0;
                if (activeImageColorButton7 != null) {
                    activeImageColorButton7.setAlpha(1.0f);
                    this.f40651u0.setSelected(true);
                    return;
                }
                return;
            case 8:
            case 9:
            default:
                return;
            case 10:
                ActiveImageColorButton activeImageColorButton8 = this.f40621m0;
                if (activeImageColorButton8 != null) {
                    activeImageColorButton8.setAlpha(1.0f);
                    this.f40621m0.setSelected(true);
                    return;
                }
                return;
            case 11:
                ActiveImageColorButton activeImageColorButton9 = this.f40667y0;
                if (activeImageColorButton9 != null) {
                    activeImageColorButton9.setAlpha(1.0f);
                    this.f40667y0.setSelected(true);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o4 */
    public boolean m38113o4() {
        return AbstractC22470k.m116158j(this.f40534M1.f41129s, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o5 */
    public /* synthetic */ void m38114o5() {
        AbstractC24833d.m129127b(this, AbstractC6918a0.editor_controller_bottom, this.f40498D1);
    }

    /* renamed from: o7 */
    private void m38115o7(VideoBlendingParam videoBlendingParam, String str) {
        C27373c c27373c = new C27373c();
        c27373c.f128942O = videoBlendingParam.f48260L;
        c27373c.f128943P = videoBlendingParam.f48259K;
        c27373c.f128944Q = this.f40518I1;
        c27373c.f128945R = videoBlendingParam.f48261M;
        c27373c.f128947T = videoBlendingParam;
        c27373c.m140250e0(videoBlendingParam.f48277q);
        c27373c.m140252f0(videoBlendingParam.f48282v);
        c27373c.m140241Z(videoBlendingParam.f48283w);
        c27373c.m140225J(str);
        c27373c.m140226K(this.f40498D1.getDuration());
        AbstractC27985d.m141005v(c27373c, new C7487q());
    }

    /* renamed from: p3 */
    private boolean m38120p3() {
        return AbstractC22470k.m116158j(this.f40534M1.f41129s, 1);
    }

    /* renamed from: p4 */
    private boolean m38121p4() {
        SendInputParams sendInputParams = this.f40534M1.f41119l0;
        if (sendInputParams != null && sendInputParams.m39220b() != -1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p5 */
    public /* synthetic */ void m38122p5() {
        this.f40538N1.m39060lT(true);
    }

    /* renamed from: p6 */
    private void m38123p6() {
        if (!this.f40506F1) {
            return;
        }
        try {
            m37891L6("121N051");
            m38089l8("crop_rotate");
            this.f40542O1.getRender().m98285a2(getHeight() - AbstractC23222t7.f112517C0);
            this.f40542O1.mo39680s();
            m37861G6();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: p7 */
    private void m38124p7(VideoBlendingParam videoBlendingParam) {
        AbstractC22466g.m116133g(C32123ta.m155063s(videoBlendingParam, getFeedLocation(), this.f40569V0, 86400, this.f40617k2, this.f40604g1), this.f40551Q2);
    }

    /* renamed from: p8 */
    private void m38125p8() {
        boolean z11;
        View view = this.f40652u1;
        if (view != null && view.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m37981X7(!z11);
    }

    /* renamed from: q3 */
    private boolean m38130q3() {
        boolean m4226ta = AbstractC0924m0.m4226ta();
        boolean m3278N9 = AbstractC0924m0.m3278N9();
        if (m4226ta && m3278N9 && AbstractC22470k.m116158j(this.f40534M1.f41129s, 7) && this.f40554R1 != 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q5 */
    public /* synthetic */ void m38131q5(C27373c c27373c, boolean z11) {
        int m140221F = c27373c.m140221F();
        int m140272z = c27373c.m140272z();
        if (z11 && this.f40538N1.m92648SI() != null && m140221F > 0 && m140272z > 0) {
            m38205z8(m140221F / m140272z, false);
            m38204z7(c27373c);
        } else {
            InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
            if (interfaceC7480j0 != null) {
                interfaceC7480j0.mo38353k(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
        }
    }

    /* renamed from: q6 */
    private void m38132q6() {
        m37981X7(false);
        if (m38113o4()) {
            AbstractC23647d.m123906p("4915201");
            AbstractC23647d.m123893c();
        }
        if (m37866H3()) {
            ZaloCameraView zaloCameraView = this.f40538N1;
            if (zaloCameraView != null) {
                zaloCameraView.removeDialog(5);
                this.f40538N1.showDialog(5);
                return;
            }
            return;
        }
        this.f40543O2 = 1;
        if (m37961V2(true)) {
            m38271f7();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[Catch: OutOfMemoryError -> 0x000d, TryCatch #0 {OutOfMemoryError -> 0x000d, blocks: (B:3:0x0004, B:5:0x0008, B:8:0x0010, B:10:0x0014, B:12:0x001f, B:14:0x0026, B:18:0x002f, B:20:0x0035, B:23:0x003c, B:25:0x0042, B:27:0x0046, B:28:0x004a, B:30:0x0052, B:32:0x005a, B:34:0x005e, B:36:0x0062, B:37:0x0066, B:39:0x0076, B:41:0x007a, B:43:0x008f, B:45:0x0093, B:47:0x009d, B:49:0x00a7, B:54:0x0085, B:56:0x0089, B:57:0x008c, B:61:0x0018), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093 A[Catch: OutOfMemoryError -> 0x000d, TryCatch #0 {OutOfMemoryError -> 0x000d, blocks: (B:3:0x0004, B:5:0x0008, B:8:0x0010, B:10:0x0014, B:12:0x001f, B:14:0x0026, B:18:0x002f, B:20:0x0035, B:23:0x003c, B:25:0x0042, B:27:0x0046, B:28:0x004a, B:30:0x0052, B:32:0x005a, B:34:0x005e, B:36:0x0062, B:37:0x0066, B:39:0x0076, B:41:0x007a, B:43:0x008f, B:45:0x0093, B:47:0x009d, B:49:0x00a7, B:54:0x0085, B:56:0x0089, B:57:0x008c, B:61:0x0018), top: B:2:0x0004 }] */
    /* renamed from: q7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m38133q7() {
        String m39026IQ;
        final boolean z11;
        final boolean z12;
        int i11;
        final int i12;
        DescriptionInputTextView descriptionInputTextView;
        String str;
        InterfaceC30925e interfaceC30925e;
        float f11;
        int i13;
        C30923c c30923c;
        setBtnFinishEditEnabled(false);
        try {
            if (this.f40606h0 != 0) {
                m37846E8();
                return;
            }
            if (this.f40599e2) {
                m39026IQ = this.f40577X1;
            } else {
                m39026IQ = this.f40538N1.m39026IQ();
            }
            final String str2 = m39026IQ;
            if (m38225I3() && this.f40554R1 != 4) {
                z11 = false;
                if (!m37844E4() && this.f40599e2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (m37897M4() && (c30923c = this.f40587a2) != null) {
                    this.f40639r0 = c30923c.f142632n;
                }
                i11 = this.f40639r0;
                if (m38113o4() && this.f40615k0 != 1.0f && (interfaceC30925e = this.f40498D1) != null) {
                    if (this.f40639r0 == 0) {
                        i11 = interfaceC30925e.getDuration();
                    }
                    int m39081wQ = this.f40538N1.m39081wQ(this.f40599e2);
                    f11 = this.f40615k0;
                    if (f11 != 0.5f && i11 * 2 > m39081wQ) {
                        i13 = m39081wQ / 2;
                    } else if (f11 != 0.3f && i11 * 3 > m39081wQ) {
                        i13 = m39081wQ / 3;
                    } else {
                        i11 = this.f40639r0;
                    }
                    i12 = i13;
                    descriptionInputTextView = this.f40490B1;
                    if (descriptionInputTextView == null && !TextUtils.isEmpty(descriptionInputTextView.getDescription())) {
                        str = this.f40490B1.getDescription();
                    } else {
                        str = null;
                    }
                    final String str3 = str;
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraEditorController.this.m37817A5(str2, z11, i12, z12, str3);
                        }
                    });
                }
                i12 = i11;
                descriptionInputTextView = this.f40490B1;
                if (descriptionInputTextView == null) {
                }
                str = null;
                final String str32 = str;
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraEditorController.this.m37817A5(str2, z11, i12, z12, str32);
                    }
                });
            }
            z11 = true;
            if (!m37844E4()) {
            }
            z12 = false;
            if (m37897M4()) {
                this.f40639r0 = c30923c.f142632n;
            }
            i11 = this.f40639r0;
            if (m38113o4()) {
                if (this.f40639r0 == 0) {
                }
                int m39081wQ2 = this.f40538N1.m39081wQ(this.f40599e2);
                f11 = this.f40615k0;
                if (f11 != 0.5f) {
                }
                if (f11 != 0.3f) {
                }
                i11 = this.f40639r0;
            }
            i12 = i11;
            descriptionInputTextView = this.f40490B1;
            if (descriptionInputTextView == null) {
            }
            str = null;
            final String str322 = str;
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.x
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m37817A5(str2, z11, i12, z12, str322);
                }
            });
        } catch (OutOfMemoryError e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
            MainApplication.m35468b0();
            m38076k3();
            this.f40538N1.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8 */
    public void m38134q8() {
        if (this.f40538N1 != null && !m38113o4()) {
            this.f40538N1.m39076tU();
        }
    }

    /* renamed from: r3 */
    private void m38139r3() {
        this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.q0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38000a5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r4 */
    public boolean m38140r4() {
        return this.f40546P1 == 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r5 */
    public /* synthetic */ void m38141r5() {
        this.f40655v0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r7 */
    public void m38142r7() {
        if (!m38179w4() && !m38290s4()) {
            this.f40638r.setAlpha(1.0f);
            this.f40642s.setAlpha(1.0f);
            this.f40650u.setAlpha(1.0f);
        } else if (m38290s4()) {
            this.f40672z1.setAlpha(1.0f);
            this.f40668y1.setAlpha(1.0f);
            this.f40664x1.setAlpha(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public void m38146s2(int i11) {
        InterfaceC30925e interfaceC30925e = this.f40498D1;
        if (interfaceC30925e != null) {
            interfaceC30925e.seekTo(i11);
        }
    }

    /* renamed from: s3 */
    private boolean m38147s3() {
        return AbstractC22470k.m116158j(this.f40534M1.f41129s, 0, 7, 3, 2, 4, 5, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s5 */
    public /* synthetic */ void m38148s5() {
        this.f40655v0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s6 */
    public void m38149s6(boolean z11, boolean z12, boolean z13) {
        if (!this.f40510G1) {
            return;
        }
        if (m37859G4()) {
            this.f40498D1.pause();
        }
        int startPoint = this.f40624n0.getStartPoint();
        int endPoint = this.f40624n0.getEndPoint();
        this.f40639r0 = endPoint - startPoint;
        int currentPosition = (int) this.f40624n0.getCurrentPosition();
        this.f40635q0 = currentPosition;
        if (currentPosition > endPoint) {
            this.f40635q0 = endPoint;
        }
        if (this.f40635q0 < startPoint) {
            this.f40635q0 = startPoint;
        }
        int i11 = this.f40635q0;
        if (z11) {
            m38080k7(i11, z12, false);
            return;
        }
        if (!z13) {
            this.f40635q0 = startPoint;
        } else {
            startPoint = i11;
        }
        m38080k7(startPoint, z12, z13);
        this.f40624n0.m39621i(this.f40587a2);
        this.f40624n0.m39620h();
    }

    private void setAlphaAllButtons(float f11) {
        ActiveImageColorButton activeImageColorButton = this.f40484A;
        if (activeImageColorButton != null) {
            activeImageColorButton.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton2 = this.f40512H;
        if (activeImageColorButton2 != null) {
            activeImageColorButton2.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton3 = this.f40548Q;
        if (activeImageColorButton3 != null) {
            activeImageColorButton3.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton4 = this.f40568V;
        if (activeImageColorButton4 != null) {
            activeImageColorButton4.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton5 = this.f40597e0;
        if (activeImageColorButton5 != null) {
            activeImageColorButton5.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton6 = this.f40621m0;
        if (activeImageColorButton6 != null) {
            activeImageColorButton6.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton7 = this.f40651u0;
        if (activeImageColorButton7 != null) {
            activeImageColorButton7.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton8 = this.f40663x0;
        if (activeImageColorButton8 != null) {
            activeImageColorButton8.setAlpha(f11);
        }
        ActiveImageColorButton activeImageColorButton9 = this.f40667y0;
        if (activeImageColorButton9 != null) {
            activeImageColorButton9.setAlpha(f11);
        }
        if (m37867H4()) {
            this.f40658w.setAlpha(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnFinishEditEnabled(boolean z11) {
        try {
            ImageButton imageButton = this.f40668y1;
            if (imageButton != null) {
                imageButton.setEnabled(z11);
            }
            View view = this.f40664x1;
            if (view != null) {
                view.setEnabled(z11);
            }
            ActiveImageButton activeImageButton = this.f40672z1;
            if (activeImageButton != null) {
                activeImageButton.setEnabled(z11);
            }
            Button button = this.f40486A1;
            if (button != null) {
                button.setEnabled(z11);
            }
            DescriptionInputTextView descriptionInputTextView = this.f40490B1;
            if (descriptionInputTextView != null) {
                descriptionInputTextView.setEnabled(z11);
                if (!z11) {
                    this.f40490B1.m77044p();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    private void setOnClickListenerTopControls(View.OnClickListener onClickListener) {
        try {
            this.f40651u0.setOnClickListener(onClickListener);
            this.f40484A.setOnClickListener(onClickListener);
            this.f40568V.setOnClickListener(onClickListener);
            this.f40654v.setOnClickListener(onClickListener);
            this.f40512H.setOnClickListener(onClickListener);
            this.f40548Q.setOnClickListener(onClickListener);
            this.f40663x0.setOnClickListener(onClickListener);
            this.f40597e0.setOnClickListener(onClickListener);
            this.f40621m0.setOnClickListener(onClickListener);
            this.f40667y0.setOnClickListener(onClickListener);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSoundMode(boolean z11) {
        int i11;
        int i12;
        int i13;
        if (m37866H3()) {
            z11 = true;
        }
        if (this.f40529L0 != null && this.f40498D1 != null) {
            this.f40537N0 = z11;
            if (z11) {
                i11 = AbstractC16803z.icn_mute;
            } else {
                i11 = AbstractC16803z.icn_sound;
            }
            if (m38113o4()) {
                if (z11) {
                    i11 = AbstractC23322a.zds_ic_off_speaker_solid_32;
                } else {
                    i11 = AbstractC23322a.zds_ic_speaker_solid_32;
                }
            }
            this.f40529L0.setImageResource(i11);
            RobotoTextView robotoTextView = this.f40525K0;
            if (z11) {
                i12 = AbstractC8020f0.str_editor_video_unmute;
            } else {
                i12 = AbstractC8020f0.str_editor_video_mute;
            }
            robotoTextView.setText(AbstractC23136l9.m118743r0(i12));
            if (!z11 && !C20024r.m103945n()) {
                i13 = 100;
            } else {
                i13 = 0;
            }
            float f11 = i13;
            this.f40498D1.setVolume(f11, f11);
        }
    }

    /* renamed from: t2 */
    private void m38152t2() {
        this.f40544P = true;
        m37891L6("121N070");
        C21357l c21357l = new C21357l("", new C21357l.b(), 0, AbstractC0924m0.m3036F(), 1, AbstractC23136l9.m118707f0());
        C22949b c22949b = this.f40520J;
        if (c22949b != null && (c22949b.m117666f() instanceof C21357l)) {
            c21357l.f104082h0 = ((C21357l) this.f40520J.m117666f()).f104082h0;
        }
        m37980X6(c21357l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t3 */
    public Bitmap m38153t3(Bitmap bitmap) {
        if (this.f40545P0 == null) {
            this.f40545P0 = new C20125e(new C19141a());
        }
        return this.f40545P0.m104742b(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t5 */
    public /* synthetic */ void m38154t5(C21362q c21362q, C21362q c21362q2, ValueAnimator valueAnimator) {
        m37957U5(((Float) valueAnimator.getAnimatedValue()).floatValue(), c21362q, c21362q2);
    }

    /* renamed from: t7 */
    private void m38155t7() {
        ActiveImageColorButton activeImageColorButton = this.f40484A;
        if (activeImageColorButton != null) {
            activeImageColorButton.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton2 = this.f40512H;
        if (activeImageColorButton2 != null) {
            activeImageColorButton2.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton3 = this.f40548Q;
        if (activeImageColorButton3 != null) {
            activeImageColorButton3.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton4 = this.f40568V;
        if (activeImageColorButton4 != null) {
            activeImageColorButton4.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton5 = this.f40597e0;
        if (activeImageColorButton5 != null) {
            activeImageColorButton5.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton6 = this.f40621m0;
        if (activeImageColorButton6 != null) {
            activeImageColorButton6.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton7 = this.f40651u0;
        if (activeImageColorButton7 != null) {
            activeImageColorButton7.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton8 = this.f40663x0;
        if (activeImageColorButton8 != null) {
            activeImageColorButton8.setSelected(false);
        }
        ActiveImageColorButton activeImageColorButton9 = this.f40667y0;
        if (activeImageColorButton9 != null) {
            activeImageColorButton9.setSelected(false);
        }
        if (m37867H4()) {
            this.f40658w.setSelected(false);
        }
    }

    /* renamed from: u2 */
    private void m38159u2(int i11, int i12) {
        try {
            if (!this.f40644s1 && AbstractC22470k.m116158j(this.f40534M1.f41129s, 7)) {
                this.f40644s1 = true;
                List m147492e = C29669a.m147490m().m147492e();
                C21700a c21700a = null;
                int i13 = 0;
                for (int i14 = 0; i14 < m147492e.size(); i14++) {
                    C21700a c21700a2 = (C21700a) m147492e.get(i14);
                    if (c21700a2 != null && c21700a2.m111992c() == 8) {
                        i13 = i14;
                        c21700a = c21700a2;
                    }
                }
                if (c21700a != null) {
                    C21357l.b bVar = new C21357l.b();
                    bVar.f104094a = c21700a.m111992c();
                    bVar.f104095b = c21700a.m111991b();
                    bVar.f104096c = c21700a.m111993d();
                    bVar.f104106m = AbstractC23222t7.f112528I;
                    bVar.f104105l = "Pangolin";
                    bVar.f104103j = false;
                    bVar.f104109p = 1.0f;
                    bVar.f104097d = AbstractC23136l9.m118639A(AbstractC16801x.white);
                    int i15 = i11 / 2;
                    int height = ((this.f40542O1.getHeight() - i12) / 2) + (i12 / 4);
                    if (m38214D4()) {
                        height = i12 / 4;
                    }
                    C21357l c21357l = new C21357l(m37896M2(this.f40534M1.f41110c0), i15, height, bVar, AbstractC23136l9.m118722k0(), 0, 1, AbstractC23136l9.m118707f0());
                    c21357l.f104082h0 = i13;
                    c21357l.m110616t0();
                    ImageDecorView imageDecorView = this.f40542O1;
                    if (imageDecorView != null) {
                        imageDecorView.m39748F(c21357l);
                        this.f40542O1.mo39680s();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u3 */
    public void m38160u3(int i11) {
        InterfaceC30925e interfaceC30925e = this.f40498D1;
        if (interfaceC30925e != null) {
            interfaceC30925e.mo150224a(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u4 */
    public boolean m38161u4() {
        return this.f40546P1 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u5 */
    public /* synthetic */ void m38162u5() {
        if (!this.f40506F1) {
            m38275g8(this.f40577X1);
        }
    }

    /* renamed from: u6 */
    private void m38163u6() {
        if (this.f40540O) {
            return;
        }
        CaptionView captionView = this.f40516I;
        if (captionView == null || captionView.getVisibility() != 0) {
            m37891L6("121N020");
            AbstractC28025b8.m141442M("tip.camera.preview.caption");
            m38249T2("tip.camera.preview.caption");
        }
        m37928Q5();
        this.f40542O1.mo39680s();
    }

    /* renamed from: u7 */
    private void m38164u7() {
        if (this.f40586a1 == null) {
            C18573i c18573i = new C18573i(getContext());
            this.f40586a1 = c18573i;
            c18573i.m89106L().m89028L(-1, -2);
            this.f40586a1.m111957E1(true);
            this.f40586a1.m111980v1(TextUtils.TruncateAt.END);
            this.f40586a1.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f40586a1.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
            this.f40586a1.m111958F1(AbstractC8020f0.str_compose_feed_bar_add_song);
            this.f40582Z0.mo69681L(this.f40586a1);
        }
    }

    /* renamed from: u8 */
    private void m38165u8(String str, C20612c c20612c) {
        this.f40617k2 = str;
        this.f40620l2 = c20612c;
    }

    /* renamed from: v2 */
    private void m38169v2(VideoBlendingParam videoBlendingParam) {
        try {
            if (this.f40542O1.m39769a0()) {
                videoBlendingParam.f48273Y = this.f40542O1.getColorFilterConfig();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: v3 */
    private void m38170v3(String str) {
        this.f40605g2 = true;
        if (this.f40558S1 != null) {
            if (m38121p4()) {
                if (m38113o4()) {
                    if (this.f40538N1.m39020GQ() == 7 && !m38225I3()) {
                        AbstractC23041d2.m118208g(this.f40574W1);
                    }
                    m37826B8(str);
                } else {
                    this.f40558S1.mo38347e(str, this.f40617k2, this.f40620l2);
                }
            } else if (this.f40534M1.f41119l0.m39220b() == 1) {
                m38076k3();
                this.f40558S1.mo38357o(str, this.f40617k2);
            }
        }
        AbstractC23237v1.m119713a("sendPicture");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v5 */
    public /* synthetic */ void m38171v5(String str, File file) {
        if (this.f40599e2) {
            AbstractC23280z4.m120304P(str, AbstractC23041d2.m118212k(str), false, false, false, new SensitiveData("gallery_save_editor_photo_manual", "photo_download"));
        } else {
            AbstractC23280z4.m120303O(str, Environment.DIRECTORY_DCIM, AbstractC23041d2.m118212k(str), false, false, false, new SensitiveData("gallery_save_editor_photo_manual", "photo_download"));
        }
        if (file != null) {
            file.delete();
        }
    }

    /* renamed from: v6 */
    private void m38172v6() {
        String str;
        if (!this.f40506F1) {
            return;
        }
        try {
            boolean z11 = !this.f40509G0;
            this.f40509G0 = z11;
            if (z11) {
                m37891L6("121N053");
            }
            if (this.f40509G0) {
                str = "1";
            } else {
                str = "0";
            }
            m38099m8("crop_11", str);
            m37822B2(this.f40509G0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: v8 */
    private void m38173v8(int i11, int i12, RectF rectF) {
        this.f40671z0.m39483j(this.f40542O1.getNewWidth(), this.f40542O1.getNewHeight(), i11, i12, rectF, false, false);
    }

    /* renamed from: w2 */
    private void m38177w2() {
        try {
            CropView cropView = this.f40671z0;
            if (cropView != null && cropView.getParent() != null) {
                return;
            }
            int i11 = AbstractC7409c0.crop_view;
            if (this.f40671z0 == null) {
                CropView cropView2 = (CropView) this.f40538N1.m92676n2().getLayoutInflater().inflate(i11, (ViewGroup) getParent(), false);
                this.f40671z0 = cropView2;
                cropView2.findViewById(AbstractC6918a0.btn_back_crop).setOnClickListener(this);
                this.f40671z0.findViewById(AbstractC6918a0.btn_rotate_left_crop).setOnClickListener(this);
                this.f40671z0.findViewById(AbstractC6918a0.btn_square_crop).setOnClickListener(this);
                this.f40671z0.findViewById(AbstractC6918a0.btn_finish_crop_photo).setOnClickListener(this);
            }
            AbstractC23136l9.m118744r1(this.f40671z0, 4);
            addView(this.f40671z0);
            m37850F2();
            this.f40671z0.f41495E = new CropView.InterfaceC7716a() { // from class: com.zing.zalo.camera.s
                @Override // com.zing.zalo.camera.photocrop.CropView.InterfaceC7716a
                /* renamed from: a */
                public final void mo39484a() {
                    CameraEditorController.this.m37920P4();
                }
            };
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3 */
    public void m38178w3(C27373c c27373c) {
        if (this.f40558S1 != null) {
            if (m38121p4()) {
                InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
                String str = this.f40617k2;
                if (str == null) {
                    str = "";
                }
                interfaceC7480j0.mo38355m(c27373c, str);
                return;
            }
            if (this.f40534M1.f41119l0.m39220b() == 1) {
                m38076k3();
                this.f40558S1.mo38345c(c27373c, this.f40617k2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w4 */
    public boolean m38179w4() {
        return this.f40546P1 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w5 */
    public /* synthetic */ void m38180w5(final File file, int i11, final String str) {
        int i12;
        m38046g6(true);
        AbstractC23136l9.m118744r1(this.f40526K1, 8);
        this.f40530L1 = false;
        m37955U3(this.f40610i1);
        if (i11 == 0) {
            ToastUtils.m89266n(AbstractC8020f0.snap_saved_img_successful, new Object[0]);
        } else {
            if (i11 == 1) {
                i12 = AbstractC8020f0.str_error_full_sdcard_more_descriptive;
            } else {
                i12 = AbstractC8020f0.error_general;
            }
            ToastUtils.m89266n(i12, new Object[0]);
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.b0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38171v5(str, file);
            }
        });
        AbstractC23237v1.m119713a("savePicture");
    }

    /* renamed from: w6 */
    private void m38181w6() {
        boolean z11;
        if (this.f40540O) {
            return;
        }
        DoodleView doodleView = this.f40552R;
        if (doodleView != null && doodleView.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            AbstractC28025b8.m141442M("tip.camera.preview.doodle");
            m38249T2("tip.camera.preview.doodle");
        }
        m38239M7(!z11);
        m37891L6("121N030");
    }

    /* renamed from: w8 */
    private void m38182w8(boolean z11) {
        try {
            if (m38113o4()) {
                return;
            }
            AnimatorSet animatorSet = this.f40665x2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f40665x2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.f40654v, "alpha", 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40670z, "alpha", 0.0f, 1.0f));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.f40654v, "alpha", 0.0f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40670z, "alpha", 1.0f, 0.0f));
            }
            animatorSet2.playTogether(arrayList);
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(new LinearInterpolator());
            animatorSet2.addListener(new C7471f(z11));
            this.f40665x2 = animatorSet2;
            animatorSet2.start();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x4 */
    public boolean m38186x4() {
        return this.f40546P1 == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x5 */
    public /* synthetic */ void m38187x5(File file, AbstractC27985d.d dVar, Bitmap bitmap) {
        int i11;
        boolean z11;
        int m137092a;
        int i12;
        AbstractC23237v1.m119714b("savePicture", "end getScreenBitmapAsync");
        int m137103l = AbstractC26689j.m137103l();
        if (m37852F4()) {
            int m137100i = AbstractC26689j.m137100i();
            if (this.f40538N1.f40899m1 == 0) {
                m137092a = AbstractC26689j.m137093b();
            } else {
                m137092a = AbstractC26689j.m137092a();
            }
            boolean m136775b = C26645c.m136775b(bitmap);
            if (m137100i == 0 || ((m137100i == 1 && !m136775b) || (m137100i != 1 && m137100i != 2))) {
                i11 = m137092a;
            } else {
                if (m136775b) {
                    if (this.f40538N1.f40899m1 == 0) {
                        i12 = AbstractC26689j.m137095d();
                    } else {
                        i12 = AbstractC26689j.m137094c();
                    }
                } else {
                    i12 = m137092a;
                }
                i11 = i12;
                z11 = true;
                AbstractC27985d.m141003t(bitmap, file, getPhotoDimensionMaxBySource(), z11, i11, dVar);
                this.f40614j2.f40693b = true;
            }
        } else {
            i11 = m137103l;
        }
        z11 = false;
        AbstractC27985d.m141003t(bitmap, file, getPhotoDimensionMaxBySource(), z11, i11, dVar);
        this.f40614j2.f40693b = true;
    }

    /* renamed from: x6 */
    private void m38188x6() {
        boolean z11;
        if (this.f40655v0) {
            return;
        }
        this.f40655v0 = true;
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null && zaloCameraView.m39071qR()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m37929Q7(true ^ z11);
        AbstractC28025b8.m141442M("tip.camera.preview.filter");
        m38249T2("tip.camera.preview.filter");
        AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.camera.d
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38148s5();
            }
        }, 500L);
    }

    /* renamed from: y2 */
    private void m38192y2(boolean z11) {
        CaptionView captionView = this.f40516I;
        if (captionView != null) {
            captionView.m67447P(z11);
            if (this.f40516I.getVisibility() == 0) {
                this.f40544P = true;
            }
        }
    }

    /* renamed from: y3 */
    private void m38193y3() {
        StoryMusicAttachment storyMusicAttachment;
        this.f40640r1 = true;
        MusicView musicView = this.f40601f1;
        if (musicView != null) {
            storyMusicAttachment = musicView.getStoryMusicAttachmentInfo();
            if (this.f40616k1 != null) {
                storyMusicAttachment.m46934l(r1.m110606f0() / AbstractC23136l9.m118722k0());
                storyMusicAttachment.m46935m(((this.f40542O1.getTop() + this.f40542O1.getHeight()) - this.f40616k1.m97621d1()) / AbstractC23136l9.m118713h0());
                storyMusicAttachment.m46932j(360.0f - this.f40616k1.m110604c0());
                storyMusicAttachment.m46933k(this.f40616k1.m97619c1());
            }
            if (this.f40619l1 != null) {
                storyMusicAttachment.m46934l(r1.m110606f0() / AbstractC23136l9.m118722k0());
                storyMusicAttachment.m46935m(((this.f40542O1.getTop() + this.f40542O1.getHeight()) - this.f40619l1.m110607g0()) / AbstractC23136l9.m118713h0());
                storyMusicAttachment.m46932j(360.0f - this.f40619l1.m110604c0());
                storyMusicAttachment.m46933k(this.f40619l1.m110605e0());
            }
        } else {
            storyMusicAttachment = null;
        }
        if (this.f40604g1 == null) {
            this.f40604g1 = storyMusicAttachment;
        }
        C18420a c18420a = this.f40616k1;
        if (c18420a != null) {
            this.f40542O1.m39761S(c18420a);
        }
        C18422c c18422c = this.f40619l1;
        if (c18422c != null) {
            this.f40542O1.m39761S(c18422c);
        }
    }

    /* renamed from: y4 */
    private boolean m38194y4(long j11, long j12) {
        return j11 > j12 + 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y5 */
    public /* synthetic */ void m38195y5() {
        try {
            InterfaceC30925e interfaceC30925e = this.f40498D1;
            if (interfaceC30925e != null && !interfaceC30925e.isPlaying()) {
                this.f40498D1.mo150227d();
            }
            m38062i7();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: y6 */
    private void m38196y6() {
        boolean z11;
        if (this.f40540O) {
            return;
        }
        DragToCloseLayout dragToCloseLayout = this.f40496D;
        if (dragToCloseLayout != null && dragToCloseLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            m37891L6("121N010");
        }
        if (!z11) {
            AbstractC28025b8.m141442M("tip.camera.preview.sticker");
            m38249T2("tip.camera.preview.sticker");
        }
        m38264c8(!z11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7 */
    public void m38197y7() {
        m38204z7(null);
    }

    /* renamed from: y8 */
    private void m38198y8() {
        ActiveImageButton activeImageButton = (ActiveImageButton) findViewById(AbstractC6918a0.btn_square_crop);
        CropView cropView = this.f40671z0;
        if (cropView != null && cropView.f41502v != null && activeImageButton.getVisibility() == 0) {
            if (this.f40505F0) {
                if (this.f40509G0 && !this.f40671z0.f41502v.m39464A()) {
                    this.f40671z0.f41502v.setAspectRatioX(1);
                    this.f40671z0.f41502v.setAspectRatioY(1);
                    this.f40671z0.f41502v.setFixedAspectRatio(true);
                }
                if (this.f40509G0) {
                    activeImageButton.setImageResource(AbstractC16803z.icn_crop_1_1_active);
                    return;
                } else {
                    activeImageButton.setImageResource(AbstractC16803z.icn_crop_1_1);
                    return;
                }
            }
            this.f40509G0 = false;
            this.f40671z0.f41502v.setFixedAspectRatio(false);
            activeImageButton.setImageResource(AbstractC16803z.icn_crop_1_1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z5 */
    public /* synthetic */ void m38202z5(int i11, String str, boolean z11, int i12, boolean z12, String str2) {
        String m40328a;
        boolean z13;
        float f11;
        float f12;
        VideoCropLayout videoCropLayout;
        try {
            this.f40538N1.mo49315c4();
            int i13 = 0;
            if (i11 == 0) {
                this.f40577X1 = str;
                this.f40574W1 = str;
                VideoNativeCompressConfig m137106o = AbstractC26689j.m137106o(this.f40538N1.f40899m1);
                VideoBlendingParam videoBlendingParam = new VideoBlendingParam();
                videoBlendingParam.f48277q = str;
                videoBlendingParam.f48282v = this.f40542O1.getWidth();
                videoBlendingParam.f48283w = this.f40542O1.getHeight();
                videoBlendingParam.f48285y = AbstractC26689j.m137083J(this.f40538N1.f40899m1);
                videoBlendingParam.f48286z = AbstractC26689j.m137107p(this.f40538N1.f40899m1);
                if (z11) {
                    m40328a = m137106o.m40329b();
                } else {
                    m40328a = m137106o.m40328a();
                }
                videoBlendingParam.f48284x = m40328a;
                videoBlendingParam.f48249A = AbstractC26689j.m137077D(this.f40538N1.f40899m1);
                videoBlendingParam.f48281u = null;
                boolean z14 = true;
                if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7)) {
                    z13 = this.f40596d2;
                } else if (!this.f40599e2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                videoBlendingParam.f48251C = z13;
                videoBlendingParam.f48252D = this.f40518I1;
                videoBlendingParam.f48280t = this.f40538N1.m39031OS();
                videoBlendingParam.f48272X = this.f40542O1.getScreenBitmap();
                videoBlendingParam.f48262N = this.f40615k0;
                videoBlendingParam.f48270V = this.f40537N0;
                int i14 = this.f40603g0;
                if (i14 == 1) {
                    videoBlendingParam.f48276p = 1;
                } else if (i14 == 0) {
                    videoBlendingParam.f48276p = 0;
                }
                if (this.f40550Q1 && (videoCropLayout = this.f40624n0) != null) {
                    videoBlendingParam.f48264P = videoCropLayout.getStartPoint();
                    videoBlendingParam.f48265Q = i12;
                }
                VideoCropLayout videoCropLayout2 = this.f40624n0;
                if (videoCropLayout2 == null) {
                    z14 = false;
                }
                if (z14) {
                    i13 = videoCropLayout2.f41732v;
                }
                videoBlendingParam.f48266R = i13;
                if (z14) {
                    f11 = videoCropLayout2.f41733w;
                } else {
                    f11 = 0.0f;
                }
                videoBlendingParam.f48267S = f11;
                if (z14) {
                    f12 = videoCropLayout2.f41734x;
                } else {
                    f12 = 1.0f;
                }
                videoBlendingParam.f48268T = f12;
                if (this.f40554R1 == 4) {
                    videoBlendingParam.f48276p = 2;
                    videoBlendingParam.f48269U = 3;
                }
                m38169v2(videoBlendingParam);
                videoBlendingParam.f48274Z = m137106o;
                videoBlendingParam.f48275a0 = AbstractC26689j.m137088O(this.f40538N1.f40899m1);
                videoBlendingParam.f48259K = z11;
                videoBlendingParam.f48260L = z12;
                videoBlendingParam.f48261M = this.f40534M1.f41093L;
                if (z11) {
                    videoBlendingParam.f48271W = this.f40542O1.getDecorOnlyBitmap();
                }
                m38071j8(videoBlendingParam, str2);
                return;
            }
            m38076k3();
            if (i11 == 601) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            }
            this.f40538N1.mo49315c4();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: z6 */
    private void m38203z6() {
        boolean z11;
        if (!this.f40540O && AbstractC26689j.f126436b) {
            VideoCropLayout videoCropLayout = this.f40624n0;
            if (videoCropLayout != null && videoCropLayout.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m38267d8(!z11);
        }
    }

    /* renamed from: z7 */
    private void m38204z7(C27373c c27373c) {
        C27373c c27373c2;
        boolean z11;
        float f11;
        int i11;
        int i12;
        if (c27373c == null) {
            c27373c2 = new C27373c();
            c27373c2.m140250e0(this.f40577X1);
            AbstractC26897a.m138620f(c27373c2);
        } else {
            c27373c2 = c27373c;
        }
        C20556f c20556f = new C20556f(c27373c2.m140220E());
        String m106834f = c20556f.m106834f();
        String m106835h = c20556f.m106835h();
        if (m106835h != null) {
            m106835h = m106835h.replace("." + m106834f, "");
        }
        int i13 = this.f40534M1.f41106Y;
        if (i13 != -1) {
            this.f40593c2 = i13;
        }
        this.f40623m2 = C20620k.m107330a().m107354e(m106835h).m107353d(m106834f).m107362m(c27373c2.m140257k()).m107364o(c27373c2.m140255i() / 1000).m107370u(c27373c2.m140218C()).m107356g(c27373c2.m140217B()).m107366q(c27373c2.m140270x()).m107365p(c27373c2.m140269w()).m107367r(c27373c2.m140271y()).m107369t(c27373c2.m140219D()).m107368s(c27373c2.m140216A()).m107352c(c27373c2.m140251f()).m107358i(c27373c2.m140259m()).m107357h(c27373c2.m140258l()).m107359j(this.f40593c2).m107350a();
        this.f40510G1 = false;
        C30923c c30923c = new C30923c(this.f40542O1.getNewWidth(), this.f40542O1.getNewHeight(), c27373c2.m140265s(), this.f40518I1, 2, C20024r.m103945n());
        c30923c.f142622d = (int) c27373c2.m140255i();
        c30923c.f142623e = c27373c2.m140269w();
        c30923c.f142624f = c27373c2.m140247d();
        if (this.f40534M1.f41129s != 7 && this.f40554R1 != 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        c30923c.f142633o = z11;
        if (this.f40600f0 == null) {
            m38086l4();
        }
        if (this.f40554R1 == 4) {
            this.f40615k0 = 2.0f;
            c30923c.f142629k = 2.0f;
            VideoSpeedLayout videoSpeedLayout = this.f40600f0;
            if (videoSpeedLayout != null) {
                videoSpeedLayout.setCurrentSpeed(2.0f);
            }
            setVideoSoundMode(true);
        } else {
            VideoSpeedLayout videoSpeedLayout2 = this.f40600f0;
            if (videoSpeedLayout2 != null) {
                f11 = videoSpeedLayout2.getCurrentSpeed();
            } else {
                f11 = 1.0f;
            }
            c30923c.f142629k = f11;
        }
        c30923c.f142630l = this.f40603g0;
        AbstractC20110a.m104541j("showAndPlayPreviewVideoInternal: \neditingMediaPath= " + this.f40577X1 + "\nSpeed= " + c30923c.f142629k + ", reverseMode= " + c30923c.f142630l + "\nVideo position:\n    ORIGINAL: start= " + this.f40627o0 + ", duration= " + this.f40631p0 + "\n    REVERSE: start= " + this.f40609i0 + ", duration= " + this.f40612j0 + "\n    CURRENT: start= " + this.f40635q0 + ", duration= " + this.f40639r0, new Object[0]);
        int i14 = this.f40635q0;
        if (i14 >= 0 && (i12 = this.f40639r0) > 0) {
            c30923c.f142631m = i14;
            c30923c.f142632n = i12;
        }
        if (AbstractC26689j.f126436b && AbstractC22470k.m116164p(this.f40534M1.f41129s, 7, 9)) {
            int m140269w = c27373c2.m140269w();
            int m140247d = c27373c2.m140247d();
            long m140255i = c27373c2.m140255i();
            C25977a m133806c = C25977a.m133806c(c27373c2.m140218C(), c27373c2.m140217B(), AbstractC26689j.m137077D(this.f40538N1.f40899m1), AbstractC26689j.m137106o(this.f40538N1.f40899m1).m40328a());
            if (m140269w > 0) {
                m140269w = Math.min(m140269w, m133806c.f123942c);
            }
            c30923c.f142623e = m140269w;
            if (m38105n4()) {
                long m17435c = AbstractC3460h.m17435c(m140269w, m140247d, m140255i);
                long m137108q = AbstractC26689j.m137108q(this.f40538N1.f40899m1) * 8388608;
                this.f40647t0 = Math.min(c30923c.f142622d, AbstractC3460h.m17434b(m140269w, m140247d, m137108q));
                if (m38194y4(m17435c, m137108q)) {
                    int i15 = this.f40639r0;
                    if (i15 == 0) {
                        int i16 = this.f40647t0;
                        c30923c.f142632n = i16;
                        this.f40639r0 = i16;
                    } else {
                        int i17 = this.f40647t0;
                        if (i15 > i17) {
                            c30923c.f142632n = Math.min(i15, i17);
                            c30923c.f142631m = this.f40635q0;
                        } else {
                            c30923c.f142632n = Math.max(i15, i17);
                            c30923c.f142631m = this.f40635q0;
                        }
                    }
                } else {
                    int i18 = this.f40639r0;
                    if (i18 == 0) {
                        int i19 = this.f40647t0;
                        c30923c.f142632n = i19;
                        this.f40639r0 = i19;
                    } else {
                        c30923c.f142632n = i18;
                        c30923c.f142631m = this.f40635q0;
                    }
                }
            } else {
                long m137108q2 = AbstractC26689j.m137108q(this.f40538N1.f40899m1) * 8388608;
                if (m38194y4(AbstractC3460h.m17435c(m140269w, m140247d, m140255i), m137108q2)) {
                    int m17434b = AbstractC3460h.m17434b(m140269w, m140247d, m137108q2);
                    c30923c.f142632n = m17434b;
                    if (this.f40639r0 == 0) {
                        this.f40639r0 = m17434b;
                    }
                } else {
                    int i21 = this.f40639r0;
                    if (i21 == 0) {
                        c30923c.f142632n = i21;
                    } else {
                        c30923c.f142632n = (int) m140255i;
                    }
                }
            }
        }
        if (this.f40534M1.f41129s == 9) {
            int m140269w2 = c27373c2.m140269w();
            long m140255i2 = c27373c2.m140255i();
            C25977a m133806c2 = C25977a.m133806c(c27373c2.m140218C(), c27373c2.m140217B(), AbstractC26689j.m137077D(this.f40538N1.f40899m1), AbstractC26689j.m137106o(this.f40538N1.f40899m1).m40328a());
            if (m140269w2 > 0) {
                m140269w2 = Math.min(m140269w2, m133806c2.f123942c);
            }
            c30923c.f142623e = m140269w2;
            long m137114w = AbstractC26689j.m137114w(this.f40538N1.f40899m1) * 1000;
            if (m140255i2 > m137114w && this.f40639r0 == 0) {
                int i22 = (int) m137114w;
                c30923c.f142632n = i22;
                this.f40639r0 = i22;
            }
            if (this.f40639r0 != 0) {
                if (m140255i2 > m137114w) {
                    i11 = (int) m137114w;
                } else {
                    i11 = 0;
                }
                c30923c.f142632n = i11;
                this.f40639r0 = i11;
                c30923c.f142631m = 0;
                this.f40635q0 = 0;
            }
        }
        this.f40587a2 = c30923c;
        m38298w7();
        this.f40510G1 = false;
        m38230J5();
        setEditingMediaType(2);
        m38302x8();
    }

    /* renamed from: z8 */
    private int[] m38205z8(float f11, boolean z11) {
        int height;
        int height2;
        int i11;
        int i12;
        if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7) && !AbstractC23309i.m121969h5()) {
            i12 = this.f40542O1.getWidth();
            i11 = this.f40542O1.getHeight();
        } else {
            if (getWidth() / getHeight() < f11) {
                height = getWidth();
                height2 = (int) (getWidth() / f11);
            } else {
                height = (int) (getHeight() * f11);
                height2 = getHeight();
            }
            if (height % 2 == 1) {
                height++;
            }
            if (height2 % 2 == 1) {
                height2++;
            }
            int i13 = height;
            i11 = height2;
            i12 = i13;
        }
        ViewGroup.LayoutParams layoutParams = this.f40542O1.getLayoutParams();
        if (layoutParams.width == i12 && layoutParams.height == i11) {
            return new int[]{i12, i11};
        }
        if (z11) {
            CameraInputParams cameraInputParams = this.f40534M1;
            layoutParams.width = cameraInputParams.f41123p;
            layoutParams.height = cameraInputParams.f41125q;
        } else {
            layoutParams.width = i12;
            layoutParams.height = i11;
            this.f40542O1.getRender().m98265H1(i12, i11);
        }
        this.f40542O1.setLayoutParams(layoutParams);
        this.f40542O1.mo39680s();
        if (this.f40534M1.f41117j0) {
            m38159u2(i12, i11);
        }
        return new int[]{i12, i11};
    }

    /* renamed from: A4 */
    public boolean m38206A4() {
        if (!AbstractC23041d2.m118194A(this.f40574W1) && !AbstractC23041d2.m118194A(this.f40577X1) && !AbstractC23041d2.m118194A(this.f40583Z1)) {
            return false;
        }
        return true;
    }

    /* renamed from: A6 */
    public void m38207A6(String str, int i11, int i12) {
        AbstractC20110a.m104544m("onTrimReverseVideoResult() called with: trimmedVideoPath = [" + str + "], startPosition = [" + i11 + "], playDuration = [" + i12 + "]", new Object[0]);
        if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
            this.f40577X1 = str;
            this.f40609i0 = 0;
            this.f40612j0 = 0;
            this.f40635q0 = 0;
            this.f40639r0 = 0;
            m38197y7();
            m38006b3();
            return;
        }
        if (i11 >= 0 && i12 > 0) {
            this.f40609i0 = i11;
            this.f40612j0 = i12;
            this.f40635q0 = i11;
            this.f40639r0 = i12;
            m38197y7();
            m38006b3();
            return;
        }
        this.f40600f0.setReversed(false);
    }

    /* renamed from: A7 */
    protected void m38208A7() {
        new C16972e0.a(getContext()).m90949z(AbstractC23136l9.m118746s0(AbstractC8020f0.str_notif_max_async_story_new, Integer.valueOf(C22052u.m115085y().m115090T()))).m90932i(C16972e0.b.DIALOG_INFORMATION).m90942s(AbstractC8020f0.str_max_async_story_continue_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.h
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CameraEditorController.this.m37824B5(interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_max_async_story_no_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.i
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                interfaceC17463d.dismiss();
            }
        }).m90931h("limit_story_popup").m90947x("limit_story_popup_proceed").m90937n("limit_story_popup_cancel").m90927d().mo13822K();
    }

    /* renamed from: B4 */
    public boolean m38209B4() {
        return this.f40599e2;
    }

    /* renamed from: B7 */
    public void m38210B7(Bitmap bitmap) {
        Bitmap m100462a = AbstractC19146a.m100462a(bitmap);
        this.f40549Q0 = m100462a;
        this.f40557S0 = true;
        m37833C7(m100462a);
        m37887K7();
    }

    /* renamed from: C4 */
    public boolean m38211C4() {
        return this.f40590b2 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x017a A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x001b, B:8:0x001f, B:9:0x003e, B:11:0x0055, B:13:0x005e, B:15:0x0067, B:16:0x00b2, B:18:0x00ba, B:20:0x0174, B:22:0x017a, B:24:0x0190, B:26:0x0194, B:27:0x0225, B:30:0x01a1, B:31:0x0233, B:33:0x00e1, B:35:0x00f5, B:37:0x00f8, B:39:0x010e, B:40:0x0129, B:41:0x0148, B:43:0x016b, B:45:0x0072, B:47:0x0076, B:48:0x0081, B:50:0x0085, B:51:0x0094, B:53:0x0098, B:54:0x009e, B:56:0x00a2, B:57:0x005b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0233 A[Catch: Exception -> 0x0018, TRY_LEAVE, TryCatch #0 {Exception -> 0x0018, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x001b, B:8:0x001f, B:9:0x003e, B:11:0x0055, B:13:0x005e, B:15:0x0067, B:16:0x00b2, B:18:0x00ba, B:20:0x0174, B:22:0x017a, B:24:0x0190, B:26:0x0194, B:27:0x0225, B:30:0x01a1, B:31:0x0233, B:33:0x00e1, B:35:0x00f5, B:37:0x00f8, B:39:0x010e, B:40:0x0129, B:41:0x0148, B:43:0x016b, B:45:0x0072, B:47:0x0076, B:48:0x0081, B:50:0x0085, B:51:0x0094, B:53:0x0098, B:54:0x009e, B:56:0x00a2, B:57:0x005b), top: B:2:0x0008 }] */
    /* renamed from: C6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38212C6(boolean z11, int... iArr) {
        ValueAnimator valueAnimator;
        try {
            m37891L6("121N050");
            this.f40497D0 = true;
            Animator animator = this.f40493C0;
            if (animator != null) {
                animator.cancel();
            }
            CropView cropView = this.f40671z0;
            if (cropView != null) {
                cropView.findViewById(AbstractC6918a0.btn_back_crop).setEnabled(true);
                this.f40671z0.findViewById(AbstractC6918a0.btn_finish_crop_photo).setEnabled(true);
                this.f40671z0.findViewById(AbstractC6918a0.btn_rotate_left_crop).setEnabled(true);
            }
            m37879J3(5);
            setEditingMode(5);
            m38274g3();
            this.f40538N1.m39067oQ().setDisableTouch(true);
            CropView cropView2 = this.f40671z0;
            if (cropView2 == null || cropView2.getParent() == null) {
                m38177w2();
            }
            CameraInputParams cameraInputParams = this.f40534M1;
            if (cameraInputParams.f41084C) {
                this.f40671z0.setCropMode(2);
                this.f40671z0.m39482h(1, 1);
            } else if (cameraInputParams.f41086E) {
                this.f40671z0.setCropMode(4);
                this.f40671z0.m39482h(1, 1);
            } else if (cameraInputParams.f41088G) {
                this.f40671z0.setCropMode(1);
                this.f40671z0.m39482h(9, 16);
            } else if (cameraInputParams.f41089H) {
                this.f40671z0.setCropMode(3);
            } else if (cameraInputParams.f41097P) {
                this.f40671z0.setCropMode(5);
                CropView cropView3 = this.f40671z0;
                CameraInputParams cameraInputParams2 = this.f40534M1;
                cropView3.m39482h(cameraInputParams2.f41098Q, cameraInputParams2.f41099R);
            }
            m38198y8();
            if (this.f40505F0) {
                int m98295i1 = this.f40542O1.getRender().m98295i1();
                int m98293h1 = this.f40542O1.getRender().m98293h1();
                Handler handler = this.f40584Z2;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.f40489B0), 500L);
                m38173v8(m98295i1, m98293h1, this.f40489B0);
            } else {
                this.f40485A0 = getCurrentCropRect();
                this.f40517I0 = this.f40542O1.getRender().m98308p1();
                if (iArr != null && iArr.length > 1) {
                    int m155409h = AbstractC23222t7.f112517C0 + AbstractC32226c.m155409h(getRootView());
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (i12 > getHeight() - m155409h) {
                        this.f40542O1.getRender().f93548p0 = getHeight() - m155409h;
                        i11 = ((getHeight() - m155409h) * i11) / i12;
                        i12 = getHeight() - m155409h;
                    }
                    this.f40671z0.m39483j(i11, i12, this.f40542O1.getWidth(), this.f40542O1.getHeight(), this.f40485A0.m110706a(), false, false);
                } else {
                    final C21362q currentCropRect = getCurrentCropRect();
                    final C21362q cropAnimRectEnd = getCropAnimRectEnd();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.camera.v0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            CameraEditorController.this.m38154t5(currentCropRect, cropAnimRectEnd, valueAnimator2);
                        }
                    });
                    ofFloat.addListener(new C7490t());
                    if (!z11) {
                        m37957U5(1.0f, currentCropRect, cropAnimRectEnd);
                        m37869H6();
                    }
                    valueAnimator = ofFloat;
                    this.f40501E0 = true;
                    this.f40505F0 = false;
                    if (!z11) {
                        m38281j3(false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        Animator m39481d = this.f40671z0.m39481d(valueAnimator);
                        if (this.f40534M1.m39213b() && !this.f40513H0) {
                            setVisibilityTopAndBottom(4);
                            AbstractC23136l9.m118744r1(this.f40671z0, 0);
                            animatorSet.play(m39481d);
                        } else {
                            setVisibilityTopAndBottom(0);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40638r, "translationY", -r13.getHeight()), ObjectAnimator.ofFloat(this.f40638r, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f40642s, "translationY", AbstractC23222t7.f112575n0), ObjectAnimator.ofFloat(this.f40642s, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f40650u, "translationX", AbstractC23222t7.f112575n0), ObjectAnimator.ofFloat(this.f40650u, "alpha", 0.0f));
                            animatorSet2.addListener(new C7491u());
                            animatorSet2.setInterpolator(new C26086a());
                            animatorSet2.setDuration(200L);
                            animatorSet.playSequentially(animatorSet2, m39481d);
                        }
                        animatorSet.addListener(new C7493w());
                        this.f40493C0 = animatorSet;
                        animatorSet.start();
                        return;
                    }
                    setVisibilityTopAndBottom(4);
                    AbstractC23136l9.m118744r1(this.f40671z0, 0);
                    return;
                }
            }
            valueAnimator = null;
            this.f40501E0 = true;
            this.f40505F0 = false;
            if (!z11) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: D2 */
    public void m38213D2() {
        try {
            AnimatorSet animatorSet = this.f40645s2;
            if (animatorSet != null) {
                animatorSet.end();
            }
            if (this.f40649t2 == null) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.f40642s, "alpha", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40646t, "alpha", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40638r, "alpha", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40650u, "alpha", 0.0f));
                animatorSet2.playTogether(arrayList);
                animatorSet2.setDuration(250L);
                animatorSet2.setInterpolator(new C26087b());
                animatorSet2.addListener(new C7496z());
                this.f40649t2 = animatorSet2;
            }
            this.f40649t2.start();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: D4 */
    public boolean m38214D4() {
        return this.f40590b2 == 2;
    }

    /* renamed from: D6 */
    public void m38215D6() {
        InterfaceC30925e interfaceC30925e = this.f40498D1;
        if (interfaceC30925e != null && interfaceC30925e.isPlaying()) {
            this.f40498D1.pause();
        }
    }

    /* renamed from: D7 */
    public void m38216D7() {
        Bitmap m100462a = AbstractC19146a.m100462a(this.f40542O1.getCurrentLoadedImage());
        if (m100462a == null) {
            return;
        }
        this.f40549Q0 = m100462a;
        this.f40557S0 = false;
        m37833C7(m100462a);
    }

    /* renamed from: E2 */
    public void m38217E2() {
        try {
            AnimatorSet animatorSet = this.f40649t2;
            if (animatorSet != null) {
                animatorSet.end();
            }
            AbstractC23136l9.m118744r1(this.f40638r, 0);
            AbstractC23136l9.m118744r1(this.f40650u, 0);
            if (this.f40645s2 == null) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.f40642s, "alpha", 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40646t, "alpha", 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40638r, "alpha", 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40650u, "alpha", 1.0f));
                animatorSet2.playTogether(arrayList);
                animatorSet2.setDuration(250L);
                animatorSet2.setInterpolator(new C26087b());
                this.f40645s2 = animatorSet2;
            }
            this.f40645s2.start();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E3 */
    public void m38218E3(PrivacyInfo privacyInfo) {
        this.f40569V0 = privacyInfo;
        ActiveImageColorButton activeImageColorButton = this.f40561T0;
        if (activeImageColorButton != null && privacyInfo != null) {
            activeImageColorButton.setImageResource(privacyInfo.m45148p(Boolean.valueOf(m38113o4())));
        }
    }

    /* renamed from: E6 */
    public void m38219E6() {
        InterfaceC30925e interfaceC30925e = this.f40498D1;
        if (interfaceC30925e != null) {
            interfaceC30925e.mo150227d();
        }
    }

    /* renamed from: E7 */
    public void m38220E7() {
        DoodleView doodleView = this.f40552R;
        if (doodleView != null) {
            doodleView.mo67546hs();
        }
    }

    /* renamed from: F7 */
    protected void m38221F7(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = this.f40538N1.m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    /* renamed from: G2 */
    public void m38222G2(SongData songData) {
        if (this.f40619l1 != null && songData != null) {
            this.f40619l1.m97633E0(new C18903a(getContext(), songData.m45160e(), songData.m45163h(), songData.m45162g(), songData.m45158c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H2 */
    public void m38223H2(StoryMusicAttachment storyMusicAttachment) {
        C18422c c18422c;
        try {
            if (this.f40601f1 != null && storyMusicAttachment != null) {
                int m46924b = storyMusicAttachment.m46924b();
                this.f40601f1.setSelectedVisual(m46924b);
                this.f40622m1 = (float) (storyMusicAttachment.m46928f() * AbstractC23136l9.m118722k0());
                this.f40625n1 = (float) ((this.f40542O1.getTop() + this.f40542O1.getHeight()) - (storyMusicAttachment.m46929g() * AbstractC23136l9.m118713h0()));
                this.f40628o1 = 360.0f - ((float) storyMusicAttachment.m46926d());
                this.f40632p1 = (float) storyMusicAttachment.m46927e();
                if (C20527a.m106641c(m46924b)) {
                    C18420a c18420a = this.f40616k1;
                    if (c18420a != null) {
                        c18420a.mo110614r0(this.f40622m1);
                        this.f40616k1.m110615s0(this.f40625n1);
                        this.f40616k1.m110611n0(this.f40628o1);
                        this.f40616k1.mo97622f(this.f40632p1);
                    }
                } else if (C20527a.m106640b(m46924b) && (c18422c = this.f40619l1) != null) {
                    c18422c.mo110614r0(this.f40622m1);
                    this.f40619l1.m110615s0(this.f40625n1);
                    this.f40619l1.m110611n0(this.f40628o1);
                    this.f40619l1.mo97628p0(this.f40632p1);
                    this.f40542O1.mo39680s();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I2 */
    public void m38224I2(LyricRender lyricRender) {
        AbstractC19118o abstractC19118o;
        if (this.f40616k1 != null && (abstractC19118o = this.f40613j1) != null && !this.f40540O) {
            abstractC19118o.mo100372a(lyricRender);
        }
    }

    /* renamed from: I3 */
    public boolean m38225I3() {
        DoodleView doodleView = this.f40552R;
        if ((doodleView == null || !doodleView.m67556v()) && !this.f40542O1.m39769a0() && !this.f40542O1.getRender().m98320v1() && !this.f40542O1.getRender().m98322w1() && !this.f40542O1.getRender().m98318u1() && !this.f40513H0 && !m37858G3() && this.f40603g0 == 0 && this.f40606h0 == 0 && this.f40615k0 == 1.0f && !this.f40537N0 && !m37851F3()) {
            return true;
        }
        return false;
    }

    /* renamed from: I4 */
    public boolean m38226I4() {
        CaptionView captionView = this.f40516I;
        if (captionView != null && captionView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I6 */
    public void m38227I6() {
        View view = this.f40634q;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.f40634q.getParent()).removeView(this.f40634q);
            this.f40634q = null;
            if (m38296v4()) {
                m38251U2("tip.any");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J2 */
    public void m38228J2(SongData songData) {
        MusicView musicView = this.f40601f1;
        if (musicView != null) {
            musicView.m39413s(songData);
        }
    }

    /* renamed from: J4 */
    public boolean m38229J4() {
        DoodleView doodleView = this.f40552R;
        if (doodleView != null && doodleView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J5 */
    public void m38230J5() {
        m37870H7();
        m37892L7();
        m38011b8();
        m37937R7();
        m37915O7();
        m37988Y7();
        m37951T7();
        m37973W7();
        if (m37897M4()) {
            m38034e8(true);
        }
        if (this.f40534M1.f41129s == 9) {
            this.f40638r.setBackgroundColor(0);
            this.f40646t.setBackgroundColor(Color.parseColor("#d7000000"));
        }
        m38002a8(true);
        m37995Z7();
        m37885K5();
        m37875I7();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K2 */
    public void m38231K2(SongData songData) {
        int i11;
        int i12 = 8;
        if (songData != null) {
            C18573i c18573i = this.f40586a1;
            if (c18573i != null) {
                c18573i.m111959G1(songData.m45164i());
            }
            RecyclingImageView recyclingImageView = this.f40579Y0;
            if (songData.m45165j()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(recyclingImageView, i11);
            View view = this.f40589b1;
            if (songData.m45165j()) {
                i12 = 0;
            }
            AbstractC23136l9.m118744r1(view, i12);
            return;
        }
        C18573i c18573i2 = this.f40586a1;
        if (c18573i2 != null) {
            c18573i2.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_compose_feed_bar_add_song));
        }
        AbstractC23136l9.m118744r1(this.f40589b1, 8);
    }

    /* renamed from: K3 */
    public void m38232K3() {
        CaptionView captionView = this.f40516I;
        if (captionView != null && captionView.getVisibility() == 0) {
            this.f40516I.m67453X0();
        }
    }

    /* renamed from: K4 */
    public boolean m38233K4() {
        VideoCropLayout videoCropLayout = this.f40624n0;
        if (videoCropLayout != null && videoCropLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L2 */
    public void m38234L2(SongData songData) {
        int i11;
        if (songData != null) {
            RecyclingImageView recyclingImageView = this.f40579Y0;
            int i12 = 0;
            if (songData.m45165j()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(recyclingImageView, i11);
            View view = this.f40589b1;
            if (!songData.m45165j()) {
                i12 = 8;
            }
            AbstractC23136l9.m118744r1(view, i12);
        }
    }

    /* renamed from: L3 */
    public void m38235L3() {
        AbstractC23136l9.m118744r1(this.f40668y1, 8);
        AbstractC23136l9.m118744r1(this.f40664x1, 8);
    }

    /* renamed from: L4 */
    public boolean m38236L4() {
        VideoSpeedLayout videoSpeedLayout = this.f40600f0;
        if (videoSpeedLayout != null && videoSpeedLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L5 */
    public void m38237L5() {
        int i11 = this.f40546P1;
        if (i11 == 5) {
            setVisibilityTopAndBottom(4);
            return;
        }
        if (this.f40611i2) {
            return;
        }
        this.f40611i2 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 7) {
                            m38230J5();
                            if (this.f40534M1.m39213b()) {
                                setVisibilityTopAndBottom(4);
                                return;
                            }
                            return;
                        }
                        m38095m4();
                        m38038f4();
                        m37915O7();
                        m38188x6();
                        return;
                    }
                    if (AbstractC23034c6.m118114C(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                        m38025d6();
                        return;
                    }
                    return;
                }
                AbstractC23136l9.m118744r1(this.f40654v, 8);
                m38181w6();
                return;
            }
            m38163u6();
            return;
        }
        m38196y6();
    }

    /* renamed from: M3 */
    public void m38238M3() {
        DescriptionInputTextView descriptionInputTextView = this.f40490B1;
        if (descriptionInputTextView != null) {
            descriptionInputTextView.m77044p();
        }
    }

    /* renamed from: M7 */
    public void m38239M7(boolean z11) {
        EnumC23613l enumC23613l;
        if (m38113o4()) {
            enumC23613l = EnumC23613l.f114472r;
        } else {
            enumC23613l = EnumC23613l.f114470p;
        }
        m37907N7(z11, enumC23613l);
    }

    /* renamed from: N3 */
    public void m38240N3() {
        setEditingMode(0);
        setVisibilityTopAndBottom(0);
        AbstractC23136l9.m118744r1(this.f40541O0, 4);
        InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
        if (interfaceC7480j0 != null) {
            interfaceC7480j0.mo38349g(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O6 */
    public void m38241O6() {
        MusicView musicView = this.f40601f1;
        if (musicView != null && musicView.getVisibility() != 0) {
            m38010b7();
        }
        C18420a c18420a = this.f40616k1;
        if (c18420a != null) {
            this.f40542O1.m39760R(c18420a);
            this.f40542O1.m39761S(this.f40616k1);
        }
        this.f40616k1 = null;
        this.f40613j1 = null;
        C18422c c18422c = this.f40619l1;
        if (c18422c != null) {
            this.f40542O1.m39760R(c18422c);
            this.f40542O1.m39761S(this.f40619l1);
        }
        this.f40619l1 = null;
        this.f40607h1 = -1;
    }

    /* renamed from: P3 */
    public void m38242P3() {
        AbstractC23136l9.m118744r1(this.f40576X0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P5 */
    public void m38243P5(boolean z11) {
        if (m38214D4()) {
            if (z11) {
                if (this.f40498D1 != null) {
                    setVideoSoundMode(true);
                }
                AbstractC23136l9.m118744r1(this.f40521J0, 8);
            } else {
                if (this.f40498D1 != null) {
                    setVideoSoundMode(false);
                }
                AbstractC23136l9.m118744r1(this.f40521J0, 0);
            }
        }
    }

    /* renamed from: P7 */
    public void m38244P7(boolean z11) {
        boolean z12;
        int i11 = 0;
        if (z11 && !m38130q3()) {
            z12 = true;
        } else {
            z12 = false;
        }
        ActiveImageColorButton activeImageColorButton = this.f40651u0;
        if (!z12) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(activeImageColorButton, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q6 */
    public void m38245Q6() {
        this.f40640r1 = false;
    }

    /* renamed from: R3 */
    public void m38246R3(ZaloCameraView zaloCameraView, ImageDecorView imageDecorView, CameraInputParams cameraInputParams, InterfaceC7732s2 interfaceC7732s2, InterfaceC1801w interfaceC1801w) {
        this.f40538N1 = zaloCameraView;
        this.f40542O1 = imageDecorView;
        this.f40534M1 = cameraInputParams;
        this.f40550Q1 = !m37897M4();
        this.f40614j2.f40693b = false;
        m38292s8();
        m37850F2();
        this.f40542O1.getRender().m98298j2(AbstractC23309i.m122281pf());
        m37999a3();
        m37942S3(interfaceC7732s2, interfaceC1801w);
    }

    /* renamed from: S5 */
    public boolean m38247S5() {
        VideoCropLayout videoCropLayout;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
        if (this.f40650u.m43190d()) {
            return true;
        }
        if (this.f40497D0) {
            m37991Z2(false);
            return true;
        }
        DoodleView doodleView = this.f40552R;
        if (doodleView != null && doodleView.getVisibility() == 0) {
            setEditingMode(0);
            m38239M7(false);
            return true;
        }
        CaptionView captionView = this.f40516I;
        if (captionView != null && captionView.getVisibility() == 0) {
            setEditingMode(0);
            this.f40516I.m67453X0();
            return true;
        }
        MusicView musicView = this.f40601f1;
        if (musicView != null && musicView.getVisibility() == 0) {
            m37964V6(getCurrentVisualDecor());
            return true;
        }
        View view = this.f40652u1;
        if (view != null && view.getVisibility() == 0) {
            m37981X7(false);
            return true;
        }
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null && zaloCameraView.m39071qR()) {
            setEditingMode(0);
            return this.f40538N1.m39028KQ();
        }
        DragToCloseLayout dragToCloseLayout = this.f40496D;
        if (dragToCloseLayout != null && dragToCloseLayout.getVisibility() == 0) {
            setEditingMode(0);
            m38264c8(false, true);
            return true;
        }
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null && locationFilterPager.getVisibility() == 0) {
            setEditingMode(0);
            m37944S7(false, true);
            return true;
        }
        VideoSpeedLayout videoSpeedLayout = this.f40600f0;
        if (videoSpeedLayout != null && videoSpeedLayout.getVisibility() == 0) {
            setEditingMode(0);
            m38272f8(false);
            if (m38113o4()) {
                this.f40535M2.m94400a(this.f40638r, this.f40642s, this.f40650u);
            }
            return true;
        }
        if (AbstractC26689j.f126436b && (videoCropLayout = this.f40624n0) != null && videoCropLayout.getVisibility() == 0) {
            setEditingMode(0);
            m38267d8(false);
            return true;
        }
        if (m38287q4() && this.f40541O0.m59029h()) {
            return true;
        }
        AbstractC24416f abstractC24416f = this.f40573W0;
        if (abstractC24416f != null) {
            abstractC24416f.mo38376b();
        }
        AbstractC24833d.m129126a(this);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* renamed from: S6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38248S6() {
        InterfaceC7480j0 interfaceC7480j0;
        if (!TextUtils.isEmpty(this.f40583Z1)) {
            if (AbstractC23041d2.m118194A(this.f40583Z1)) {
                m38275g8(this.f40583Z1);
            }
            interfaceC7480j0 = this.f40558S1;
            if (interfaceC7480j0 != null) {
                interfaceC7480j0.mo38353k(AbstractC23136l9.m118743r0(AbstractC8020f0.error_file_notexist));
            }
        } else {
            if (!TextUtils.isEmpty(this.f40577X1) && AbstractC23041d2.m118194A(this.f40577X1)) {
                try {
                    if (m38211C4()) {
                        postDelayed(new Runnable() { // from class: com.zing.zalo.camera.l0
                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraEditorController.this.m38162u5();
                            }
                        }, 1000L);
                        m37898M5(this.f40577X1);
                    } else if (m38214D4()) {
                        m37905N5();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("CameraEditorController", e11);
                }
            }
            interfaceC7480j0 = this.f40558S1;
            if (interfaceC7480j0 != null) {
            }
        }
        m37936R6();
        this.f40542O1.mo39680s();
    }

    /* renamed from: T2 */
    public void m38249T2(String str) {
        char c11;
        Drawable m139659b;
        int i11 = 0;
        while (true) {
            String[] strArr = AbstractC28025b8.f130855l;
            if (i11 < strArr.length) {
                String str2 = strArr[i11];
                if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                    try {
                        C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                        boolean z11 = true;
                        switch (str2.hashCode()) {
                            case -2030073846:
                                if (str2.equals("tip.camera.story.privacy_setting")) {
                                    c11 = 6;
                                    break;
                                }
                                break;
                            case -1987426390:
                                if (str2.equals("tip.camera.preview.caption")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case -135284991:
                                if (str2.equals("tip.camera.preview.sticker")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 254497493:
                                if (str2.equals("tip.camera.preview.doodle")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 306140468:
                                if (str2.equals("tip.camera.preview.filter")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                            case 470461041:
                                if (str2.equals("tip.camera.preview.location")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 1241976534:
                                if (str2.equals("tip.camera.story.music")) {
                                    c11 = 7;
                                    break;
                                }
                                break;
                            case 1981570898:
                                if (str2.equals("tip.camera.beauty")) {
                                    c11 = 5;
                                    break;
                                }
                                break;
                        }
                        c11 = 65535;
                        ActiveImageColorButton activeImageColorButton = null;
                        switch (c11) {
                            case 0:
                                activeImageColorButton = this.f40568V;
                                m139659b = C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_location_solid_24, AbstractC16801x.white);
                                break;
                            case 1:
                                activeImageColorButton = this.f40484A;
                                m139659b = C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_sticker_solid_24, AbstractC16801x.white);
                                break;
                            case 2:
                                activeImageColorButton = this.f40512H;
                                m139659b = C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_aa_solid_24, AbstractC16801x.white);
                                break;
                            case 3:
                                activeImageColorButton = this.f40548Q;
                                m139659b = C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_brush_solid_24, AbstractC16801x.white);
                                break;
                            case 4:
                                activeImageColorButton = this.f40651u0;
                                m139659b = C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_face_filter_solid_24, AbstractC16801x.white);
                                break;
                            case 5:
                                activeImageColorButton = this.f40488B;
                                m139659b = C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_face_filter_solid_24, AbstractC16801x.white);
                                break;
                            case 6:
                                activeImageColorButton = this.f40561T0;
                                m139659b = null;
                                break;
                            case 7:
                                if (this.f40592c1 != null) {
                                    if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                                        this.f40592c1.setVisibility(0);
                                        this.f40592c1.m44425e();
                                        break;
                                    } else {
                                        this.f40592c1.setVisibility(8);
                                        this.f40592c1.m44427g();
                                        break;
                                    }
                                }
                                break;
                        }
                        m139659b = null;
                        if (activeImageColorButton != null) {
                            if (m141453i != null) {
                                if (m141453i.m142167f() && m141453i.f131580f) {
                                    C23528a c23528a = new C23528a(getContext());
                                    activeImageColorButton.setShowRedDot(z11);
                                    AbstractC28045d8.m141482c(activeImageColorButton, m141453i, c23528a, m139659b);
                                }
                            }
                            z11 = false;
                            C23528a c23528a2 = new C23528a(getContext());
                            activeImageColorButton.setShowRedDot(z11);
                            AbstractC28045d8.m141482c(activeImageColorButton, m141453i, c23528a2, m139659b);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("CameraEditorController", e11);
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    /* renamed from: T5 */
    public void m38250T5(int i11) {
        long j11;
        if (this.f40497D0) {
            RectF cropOverlayRectInPercentage = this.f40671z0.getCropOverlayRectInPercentage();
            Handler handler = this.f40584Z2;
            Message obtainMessage = handler.obtainMessage(2, cropOverlayRectInPercentage);
            if (this.f40506F1) {
                j11 = 150;
            } else {
                j11 = 500;
            }
            handler.sendMessageDelayed(obtainMessage, j11);
        }
        DocumentScanView documentScanView = this.f40541O0;
        if (documentScanView != null) {
            documentScanView.m59031i(i11);
        }
        AbstractC24416f abstractC24416f = this.f40573W0;
        if (abstractC24416f != null) {
            abstractC24416f.m127697e(this.f40565U0);
        }
    }

    /* renamed from: U2 */
    public void m38251U2(String str) {
        try {
            if (this.f40566U1 == null) {
                C13306b c13306b = new C13306b(getContext());
                this.f40566U1 = c13306b;
                c13306b.m74687C(this);
            }
            if (!this.f40566U1.m74707p()) {
                View view = this.f40634q;
                if ((view != null && view.isShown()) || this.f40497D0) {
                    return;
                }
                Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130855l).iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    final C28212v6 c28212v6 = (C28212v6) it.next();
                    if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c))) {
                        View m37816A3 = m37816A3(c28212v6.f131577c);
                        if (m37816A3 != null && !z11 && m37816A3.isShown()) {
                            this.f40562T1 = new ShowcaseView(m37816A3.getContext());
                            C26203c m134769a = C26203c.m134769a(m37816A3.getContext());
                            m134769a.m134770b(c28212v6, m37816A3.getContext());
                            m134769a.f124524o = m37816A3;
                            this.f40562T1.setConfigs(m134769a);
                            this.f40562T1.setShowcaseId(c28212v6.f131577c);
                            this.f40562T1.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: com.zing.zalo.camera.u0
                                @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                                /* renamed from: a */
                                public final void mo39159a(ShowcaseView showcaseView, int i11, int i12, boolean z12) {
                                    CameraEditorController.this.m37963V4(c28212v6, showcaseView, i11, i12, z12);
                                }
                            });
                            this.f40562T1.setShowcaseManager(this.f40566U1);
                            this.f40562T1.m74637r();
                            z11 = true;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U6 */
    public void m38252U6() {
        AbstractC19118o abstractC19118o = this.f40613j1;
        if (abstractC19118o != null) {
            abstractC19118o.m100379h();
        }
    }

    /* renamed from: U7 */
    public void m38253U7(boolean z11) {
        boolean z12;
        try {
            if (this.f40601f1 == null) {
                m38023d4();
            }
            float max = Math.max(AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0()) / 5.0f;
            int m118722k0 = AbstractC23136l9.m118722k0() >> 1;
            int m118713h0 = AbstractC23136l9.m118713h0() >> 1;
            AbstractC21351f abstractC21351f = this.f40598e1;
            if (abstractC21351f == null) {
                Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(-872415232);
                this.f40598e1 = new C24908a(m118722k0, m118713h0, max, 0.0f, createBitmap, null);
            } else {
                abstractC21351f.mo97628p0(max);
                this.f40598e1.mo110614r0(m118722k0);
                this.f40598e1.m110615s0(m118713h0);
            }
            MusicView musicView = this.f40601f1;
            if (musicView != null && musicView.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && !z12) {
                m37879J3(12);
                m38213D2();
                AbstractC23136l9.m118744r1(this.f40601f1, 0);
                this.f40601f1.m39415v();
                int i11 = this.f40607h1;
                if (i11 != -1 && (this.f40616k1 == null || this.f40613j1 == null || this.f40619l1 == null)) {
                    m37955U3(i11);
                }
                setEditingMode(12);
                this.f40542O1.setTouchEnable(false);
                this.f40542O1.m39750H(this.f40598e1);
                this.f40538N1.m39067oQ().setDisableTouch(true);
                m37933R2();
                return;
            }
            if (!z11 && z12) {
                setEditingMode(0);
                m38217E2();
                AbstractC23136l9.m118744r1(this.f40601f1, 8);
                this.f40542O1.setTouchEnable(true);
                AbstractC21351f abstractC21351f2 = this.f40598e1;
                if (abstractC21351f2 != null) {
                    this.f40542O1.m39760R(abstractC21351f2);
                }
                this.f40538N1.m39067oQ().setDisableTouch(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: V5 */
    public void m38254V5(AbstractC21351f abstractC21351f) {
        if (abstractC21351f == this.f40619l1) {
            m37972W6(abstractC21351f);
        }
    }

    /* renamed from: W5 */
    public void m38255W5(AbstractC21351f abstractC21351f) {
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null) {
            zaloCameraView.m39085yS();
        }
        if (abstractC21351f == getCurrentVisualDecor()) {
            m38256X2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X2 */
    public void m38256X2() {
        this.f40538N1.m39055jT();
        m38231K2(null);
        MusicView musicView = this.f40601f1;
        if (musicView != null) {
            musicView.setEditingSong(null);
        }
        m38282k8();
        m38241O6();
        m37921P6();
        m38253U7(false);
        MusicView musicView2 = this.f40601f1;
        if (musicView2 != null) {
            musicView2.m39408G();
        }
        m38134q8();
    }

    /* renamed from: Y2 */
    public void m38257Y2() {
        if (m38186x4()) {
            setEditingMode(0);
            m38232K3();
        }
    }

    /* renamed from: Y5 */
    public void m38258Y5() {
        if (this.f40506F1) {
            m37928Q5();
        }
    }

    /* renamed from: Z3 */
    public void m38259Z3(String str) {
        this.f40574W1 = str;
        this.f40599e2 = true;
        setEditingMediaType(1);
        m37898M5(this.f40574W1);
        m37891L6("121N000");
    }

    @Override // mn.InterfaceC23362e
    /* renamed from: a */
    public void mo38260a() {
        this.f40535M2.m94402c(this.f40638r, this.f40642s);
        InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
        if (interfaceC7480j0 != null) {
            interfaceC7480j0.mo38349g(false);
        }
        ZaloCameraView zaloCameraView = this.f40538N1;
        if (zaloCameraView != null && zaloCameraView.m39071qR()) {
            this.f40538N1.m39038VT(false, 250);
        }
    }

    /* renamed from: a4 */
    public void m38261a4(String str, int i11, int i12, boolean z11, boolean z12, boolean z13) {
        this.f40574W1 = str;
        if (TextUtils.isEmpty(this.f40577X1)) {
            this.f40577X1 = str;
        }
        this.f40627o0 = i11;
        this.f40631p0 = i12;
        this.f40635q0 = i11;
        this.f40639r0 = i12;
        this.f40518I1 = z11;
        this.f40599e2 = z12;
        this.f40596d2 = z13;
        setEditingMediaType(2);
        m37905N5();
        m37891L6("121N000");
    }

    /* renamed from: a6 */
    public void m38262a6() {
        setEditingMode(0);
        m37919P2();
        m37879J3(0);
        m38076k3();
        CropView cropView = this.f40671z0;
        if (cropView != null && cropView.isShown()) {
            m37991Z2(false);
        }
        DescriptionInputTextView descriptionInputTextView = this.f40490B1;
        if (descriptionInputTextView != null) {
            descriptionInputTextView.m77043n();
        }
        if (this.f40538N1.m78935DL()) {
            this.f40538N1.mo49315c4();
        }
        this.f40584Z2.removeMessages(12);
        setIsWaitingForVideo(false);
        this.f40615k0 = 1.0f;
        this.f40537N0 = false;
        setVideoSoundMode(false);
        this.f40603g0 = 0;
        this.f40606h0 = 0;
        VideoSpeedLayout videoSpeedLayout = this.f40600f0;
        if (videoSpeedLayout != null) {
            videoSpeedLayout.setCurrentSpeed(this.f40615k0);
            this.f40600f0.setReversed(false);
        }
        this.f40627o0 = 0;
        this.f40631p0 = 0;
        this.f40635q0 = 0;
        this.f40639r0 = 0;
        VideoCropLayout videoCropLayout = this.f40624n0;
        if (videoCropLayout != null) {
            videoCropLayout.f41732v = 0;
            videoCropLayout.f41733w = 0.0f;
            videoCropLayout.f41734x = 1.0f;
        }
        this.f40609i0 = 0;
        this.f40612j0 = 0;
        if (this.f40618l0 != null) {
            m37903N2();
        }
        this.f40554R1 = 2;
        this.f40659w0 = -1;
        this.f40599e2 = false;
        this.f40506F1 = false;
        this.f40643s0 = false;
        m37969W2();
        m38256X2();
        GlowingReddot glowingReddot = this.f40592c1;
        if (glowingReddot != null) {
            glowingReddot.m44427g();
        }
    }

    @Override // p305kt.InterfaceC21941a
    /* renamed from: c */
    public void mo38263c() {
        long j11;
        this.f40538N1.m39086yT(true);
        Handler handler = this.f40584Z2;
        Runnable runnable = new Runnable() { // from class: com.zing.zalo.camera.m
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38087l5();
            }
        };
        if (AbstractC19444a.m101693a()) {
            j11 = 0;
        } else {
            j11 = 500;
        }
        handler.postDelayed(runnable, j11);
    }

    /* renamed from: c8 */
    public void m38264c8(boolean z11, boolean z12) {
        DragToCloseLayout dragToCloseLayout;
        DragToCloseLayout dragToCloseLayout2;
        if (!z11 || (dragToCloseLayout2 = this.f40496D) == null || dragToCloseLayout2.getVisibility() != 0) {
            if (!z11 && ((dragToCloseLayout = this.f40496D) == null || dragToCloseLayout.getVisibility() != 0)) {
                return;
            }
            try {
                if (z11) {
                    if (this.f40496D == null) {
                        m38044g4();
                    }
                    m37879J3(1);
                    setEditingMode(1);
                    m38063i8();
                    if (this.f40496D != null) {
                        AnimatorSet animatorSet = this.f40637q2;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f40637q2 = null;
                        }
                        if (z12) {
                            if (this.f40504F) {
                                if (this.f40496D.getAlpha() == 1.0f) {
                                    this.f40496D.setAlpha(0.0f);
                                }
                                this.f40504F = false;
                            }
                            this.f40637q2 = new AnimatorSet();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ObjectAnimator.ofFloat(this.f40496D, "alpha", 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.f40630p, "alpha", 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.f40638r, "alpha", 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.f40642s, "alpha", 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.f40646t, "alpha", 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.f40650u, "alpha", 0.0f));
                            this.f40637q2.playTogether(arrayList);
                            this.f40637q2.setDuration(300L);
                            this.f40637q2.addListener(new C7472f0());
                            this.f40637q2.start();
                            return;
                        }
                        this.f40496D.setAlpha(1.0f);
                        this.f40630p.setAlpha(1.0f);
                        setVisibilityTopAndBottom(8);
                        return;
                    }
                    return;
                }
                setEditingMode(0);
                m37840D8();
                AbstractC23136l9.m118744r1(this.f40638r, 0);
                AbstractC23136l9.m118744r1(this.f40646t, 0);
                AbstractC23136l9.m118744r1(this.f40650u, 0);
                DragToCloseLayout dragToCloseLayout3 = this.f40496D;
                if (dragToCloseLayout3 != null) {
                    if (dragToCloseLayout3.getWidth() == 0) {
                        this.f40630p.setAlpha(0.0f);
                        m37926Q3(4);
                        return;
                    }
                    AnimatorSet animatorSet2 = this.f40637q2;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f40637q2 = null;
                    }
                    this.f40630p.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_50));
                    if (z12) {
                        this.f40637q2 = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40496D, "alpha", 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40630p, "alpha", 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40638r, "alpha", 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40642s, "alpha", 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40646t, "alpha", 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f40650u, "alpha", 1.0f));
                        this.f40637q2.playTogether(arrayList2);
                        this.f40637q2.setDuration(300L);
                        this.f40637q2.addListener(new C7474g0());
                        this.f40637q2.start();
                        return;
                    }
                    m37926Q3(8);
                    this.f40496D.setAlpha(0.0f);
                    this.f40638r.setAlpha(1.0f);
                    this.f40646t.setAlpha(1.0f);
                    this.f40650u.setAlpha(1.0f);
                    if (!m38161u4() && !m38290s4()) {
                        this.f40642s.setAlpha(1.0f);
                    } else if (m38290s4()) {
                        this.f40672z1.setAlpha(1.0f);
                        this.f40668y1.setAlpha(1.0f);
                        this.f40664x1.setAlpha(1.0f);
                    }
                    if (!m38186x4() && !m38161u4()) {
                        this.f40630p.setAlpha(0.0f);
                    }
                }
            } catch (Resources.NotFoundException e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    @Override // mn.InterfaceC23362e
    /* renamed from: d */
    public void mo38265d() {
        this.f40535M2.m94400a(this.f40638r, this.f40642s);
        InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
        if (interfaceC7480j0 != null) {
            interfaceC7480j0.mo38349g(true);
        }
    }

    /* renamed from: d3 */
    public void m38266d3() {
        this.f40542O1.m39779m0();
        this.f40542O1.m39758P();
        DoodleView doodleView = this.f40552R;
        if (doodleView != null) {
            doodleView.m67528D0();
            this.f40552R.setDecorRenderer(null);
        }
        this.f40556S = null;
        this.f40501E0 = false;
        this.f40517I0 = 0;
        this.f40485A0 = null;
    }

    /* renamed from: d8 */
    public void m38267d8(boolean z11) {
        VideoCropLayout videoCropLayout;
        VideoCropLayout videoCropLayout2;
        if (this.f40587a2 != null && this.f40506F1) {
            if (!z11 || (videoCropLayout2 = this.f40624n0) == null || videoCropLayout2.getVisibility() != 0) {
                if (!z11 && ((videoCropLayout = this.f40624n0) == null || videoCropLayout.getVisibility() != 0)) {
                    return;
                }
                try {
                    Animator animator = this.f40657v2;
                    if (animator != null) {
                        animator.cancel();
                        this.f40657v2 = null;
                    }
                    if (z11) {
                        if (this.f40624n0 == null) {
                            m38077k4();
                        }
                        m37879J3(10);
                        setEditingMode(10);
                        AbstractC23136l9.m118744r1(this.f40624n0, 0);
                        this.f40624n0.m39621i(this.f40587a2);
                        return;
                    }
                    setEditingMode(0);
                    AbstractC23136l9.m118744r1(this.f40624n0, 8);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("CameraEditorController", e11);
                }
            }
        }
    }

    @Override // p679yf.InterfaceC30926f
    /* renamed from: e */
    public void mo38268e(InterfaceC30925e interfaceC30925e) {
        this.f40498D1 = interfaceC30925e;
        setVideoSoundMode(this.f40537N0);
    }

    /* renamed from: e3 */
    public void m38269e3() {
        AbstractC20110a.m104544m("deleteEditingMedia: preserveEditingMedia= " + this.f40605g2 + "\nneedDeleteInputMedia= " + this.f40596d2 + "\noriginalMediaPath= " + this.f40574W1 + "\neditingMediaPath= " + this.f40577X1 + "\ntempPicturePath= " + this.f40583Z1, new Object[0]);
        if (m38214D4()) {
            if (this.f40605g2) {
                if (this.f40596d2 && !TextUtils.isEmpty(this.f40574W1) && !this.f40574W1.equals(this.f40577X1) && !this.f40574W1.equals(this.f40583Z1)) {
                    AbstractC23041d2.m118208g(this.f40574W1);
                    AbstractC20110a.m104544m("delete originalMediaPath", new Object[0]);
                }
            } else {
                if (this.f40596d2 && !TextUtils.isEmpty(this.f40574W1)) {
                    AbstractC23041d2.m118208g(this.f40574W1);
                    AbstractC20110a.m104544m("delete originalMediaPath", new Object[0]);
                }
                if (!TextUtils.isEmpty(this.f40577X1) && !this.f40577X1.equals(this.f40574W1)) {
                    AbstractC23041d2.m118208g(this.f40577X1);
                    AbstractC20110a.m104544m("delete editingMediaPath", new Object[0]);
                }
                if (!TextUtils.isEmpty(this.f40583Z1) && !this.f40583Z1.equals(this.f40574W1)) {
                    AbstractC23041d2.m118208g(this.f40583Z1);
                    AbstractC20110a.m104544m("delete tempPicturePath", new Object[0]);
                }
            }
        }
        this.f40596d2 = false;
        this.f40574W1 = null;
        this.f40577X1 = null;
        this.f40580Y1 = null;
        this.f40587a2 = null;
        this.f40583Z1 = null;
    }

    /* renamed from: f3 */
    public void m38270f3() {
        this.f40585a0 = null;
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null) {
            locationFilterPager.setLocationFilterSelected(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f7 */
    public void m38271f7() {
        m38046g6(false);
        this.f40610i1 = this.f40607h1;
        m38241O6();
        m38047g7();
    }

    /* renamed from: f8 */
    public void m38272f8(boolean z11) {
        VideoSpeedLayout videoSpeedLayout;
        VideoSpeedLayout videoSpeedLayout2;
        if (!z11 || (videoSpeedLayout2 = this.f40600f0) == null || videoSpeedLayout2.getVisibility() != 0) {
            if (!z11 && ((videoSpeedLayout = this.f40600f0) == null || videoSpeedLayout.getVisibility() != 0)) {
                return;
            }
            try {
                Animator animator = this.f40653u2;
                if (animator != null) {
                    animator.cancel();
                    this.f40653u2 = null;
                }
                if (z11) {
                    if (this.f40600f0 == null) {
                        m38086l4();
                    }
                    m37862G7();
                    this.f40542O1.m39777k0();
                    m37879J3(6);
                    setEditingMode(6);
                    AbstractC23136l9.m118744r1(this.f40600f0, 0);
                    Animator m39629h = this.f40600f0.m39629h(true);
                    this.f40653u2 = m39629h;
                    m39629h.start();
                    return;
                }
                this.f40542O1.m39756N();
                setEditingMode(0);
                Animator m39629h2 = this.f40600f0.m39629h(false);
                this.f40653u2 = m39629h2;
                m39629h2.addListener(new C7467d());
                this.f40653u2.start();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CameraEditorController", e11);
            }
        }
    }

    @Override // p367nn.InterfaceC23889d
    /* renamed from: g */
    public void mo38273g(EnumC23888c enumC23888c) {
        if (enumC23888c == EnumC23888c.f115483p) {
            m37993Z5(Integer.valueOf(AbstractC6918a0.btn_editor_caption), null);
            return;
        }
        if (enumC23888c == EnumC23888c.f115484q) {
            m37993Z5(Integer.valueOf(AbstractC6918a0.btn_editor_sticker), null);
            return;
        }
        if (enumC23888c == EnumC23888c.f115485r) {
            m37993Z5(Integer.valueOf(AbstractC6918a0.btn_editor_photo_crop), null);
            return;
        }
        if (enumC23888c == EnumC23888c.f115486s) {
            m37993Z5(Integer.valueOf(AbstractC6918a0.btn_editor_filter), null);
            return;
        }
        if (enumC23888c == EnumC23888c.f115488u) {
            m37993Z5(Integer.valueOf(AbstractC6918a0.btn_editor_doodle), null);
            return;
        }
        if (enumC23888c == EnumC23888c.f115489v) {
            m37993Z5(Integer.valueOf(AbstractC6918a0.btn_editor_location), null);
            return;
        }
        if (enumC23888c == EnumC23888c.f115490w) {
            m37993Z5(Integer.valueOf(AbstractC6918a0.btn_editor_video_timing), null);
        } else if (enumC23888c == EnumC23888c.f115487t) {
            m37907N7(true, EnumC23613l.f114471q);
            m37891L6("121N030");
        }
    }

    /* renamed from: g3 */
    public void m38274g3() {
        ShowcaseView showcaseView = this.f40562T1;
        if (showcaseView != null && showcaseView.getParent() != null) {
            this.f40562T1.m74626d();
        }
    }

    /* renamed from: g8 */
    public void m38275g8(final String str) {
        this.f40577X1 = str;
        this.f40574W1 = str;
        this.f40596d2 = !this.f40599e2;
        if (!TextUtils.isEmpty(str)) {
            int m118731n0 = AbstractC23136l9.m118731n0(this.f40538N1.m92648SI());
            int m118719j0 = AbstractC23136l9.m118719j0(this.f40538N1.m92648SI());
            if (this.f40623m2 == null) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraEditorController.this.m37853F5(str);
                    }
                });
            }
            this.f40542O1.m39787u0(new C20556f(str), Math.max(m118731n0, m118719j0), Math.min(m118731n0, m118719j0), this);
        }
        m38230J5();
        m38302x8();
        m38177w2();
        setOnClickListenerTopControls(this);
        m37891L6("121N000");
    }

    @Override // mn.InterfaceC23362e
    public StateFlow<EnumC24313a> getExpandableActionViewConfig() {
        return this.f40539N2;
    }

    public C3063z0 getFeedLocation() {
        AbstractC2790b abstractC2790b;
        try {
            LocationFilterPager locationFilterPager = this.f40572W;
            if (locationFilterPager != null) {
                abstractC2790b = locationFilterPager.getLocationFilter();
            } else {
                abstractC2790b = null;
            }
            if (abstractC2790b == null) {
                return null;
            }
            return abstractC2790b.m13445c();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
            return null;
        }
    }

    public void getLocationFilter() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.s0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38008b5();
            }
        });
    }

    public C3450a getMediaEditorLogInfo() {
        VideoCropLayout videoCropLayout = this.f40624n0;
        if (videoCropLayout != null) {
            C3451b videoTrimLogInfo = videoCropLayout.getVideoTrimLogInfo();
            videoTrimLogInfo.m17388r(this.f40550Q1);
            this.f40547P2.m17370f(videoTrimLogInfo);
        }
        return this.f40547P2;
    }

    public String getOriginalMediaPath() {
        return this.f40574W1;
    }

    @Override // p305kt.InterfaceC21941a
    /* renamed from: h */
    public void mo38276h() {
        this.f40542O1.getRender().m98321v2();
    }

    /* renamed from: h3 */
    public void m38277h3(int i11, int i12, Intent intent) {
        StickerPanelView stickerPanelView = this.f40500E;
        if (stickerPanelView != null) {
            stickerPanelView.onActivityResult(i11, i12, intent);
        }
    }

    /* renamed from: h4 */
    public void m38278h4() {
        if (this.f40500E != null) {
            return;
        }
        C28644j.m143233Y().m143298b0();
        StickerIndicatorView.C13538e c13538e = new StickerIndicatorView.C13538e(0.35f, 0, AbstractC23222t7.f112530J, 1);
        C7110j8.d dVar = new C7110j8.d();
        dVar.f38885p = 4;
        dVar.f38886q = AbstractC23222t7.f112557e0;
        dVar.f38887r = AbstractC23222t7.f112552c;
        C7157o0.f fVar = new C7157o0.f();
        fVar.f39183p = false;
        fVar.f39184q = 38;
        dVar.f38890u = fVar;
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142418q, 0, false, false, c13538e, dVar, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f40538N1.m92676n2()), true, 1, AbstractC16781w.indicator_camera_bg_color, false, -1, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f40500E = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!this.f40538N1.mo60294yp()) {
            this.f40538N1.m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f40500E, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m38059i4();
        }
    }

    @Override // p679yf.InterfaceC30926f
    /* renamed from: i */
    public void mo38279i() {
        long j11;
        this.f40506F1 = true;
        Handler handler = this.f40584Z2;
        Runnable runnable = new Runnable() { // from class: com.zing.zalo.camera.f0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38106n5();
            }
        };
        if (AbstractC19444a.m101693a()) {
            j11 = 0;
        } else {
            j11 = 500;
        }
        handler.postDelayed(runnable, j11);
        Runnable runnable2 = this.f40673z2;
        if (runnable2 != null) {
            this.f40584Z2.post(runnable2);
            this.f40673z2 = null;
        }
        this.f40584Z2.post(new Runnable() { // from class: com.zing.zalo.camera.g0
            @Override // java.lang.Runnable
            public final void run() {
                CameraEditorController.this.m38114o5();
            }
        });
    }

    @Override // p643xf.C29617j.a
    /* renamed from: j */
    public void mo38280j() {
        long j11;
        try {
            AbstractC23237v1.m119714b("capture", "onDrawFirstPhotoFrame");
            Runnable runnable = this.f40673z2;
            if (runnable != null) {
                this.f40584Z2.post(runnable);
                this.f40673z2 = null;
            }
            if (this.f40506F1) {
                return;
            }
            this.f40506F1 = true;
            Handler handler = this.f40584Z2;
            Runnable runnable2 = new Runnable() { // from class: com.zing.zalo.camera.y
                @Override // java.lang.Runnable
                public final void run() {
                    CameraEditorController.this.m38096m5();
                }
            };
            if (AbstractC19444a.m101693a()) {
                j11 = 0;
            } else {
                j11 = 500;
            }
            handler.postDelayed(runnable2, j11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: j3 */
    public void m38281j3(boolean z11) {
        ActiveImageColorButton activeImageColorButton = this.f40548Q;
        if (activeImageColorButton != null) {
            activeImageColorButton.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton2 = this.f40512H;
        if (activeImageColorButton2 != null) {
            activeImageColorButton2.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton3 = this.f40484A;
        if (activeImageColorButton3 != null) {
            activeImageColorButton3.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton4 = this.f40568V;
        if (activeImageColorButton4 != null) {
            activeImageColorButton4.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton5 = this.f40597e0;
        if (activeImageColorButton5 != null) {
            activeImageColorButton5.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton6 = this.f40621m0;
        if (activeImageColorButton6 != null) {
            activeImageColorButton6.setEnabled(z11);
        }
        setBtnFinishEditEnabled(z11);
        m38046g6(z11);
        ActiveImageColorButton activeImageColorButton7 = this.f40663x0;
        if (activeImageColorButton7 != null) {
            activeImageColorButton7.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton8 = this.f40667y0;
        if (activeImageColorButton8 != null) {
            activeImageColorButton8.setEnabled(z11);
        }
        ActiveImageButton activeImageButton = this.f40654v;
        if (activeImageButton != null) {
            activeImageButton.setEnabled(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8 */
    public void m38282k8() {
        AbstractC19118o abstractC19118o = this.f40613j1;
        if (abstractC19118o != null) {
            abstractC19118o.m100373b();
        }
    }

    /* renamed from: l6 */
    public void m38283l6(int i11, String[] strArr) {
        if (i11 == 110 && AbstractC23034c6.m118167n(getContext(), strArr) == 0) {
            getLocationFilter();
        }
        if (i11 == 156) {
            boolean m37961V2 = m37961V2(false);
            if (this.f40543O2 != 2) {
                if (m37961V2) {
                    this.f40673z2 = new Runnable() { // from class: com.zing.zalo.camera.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraEditorController.this.m38271f7();
                        }
                    };
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.photo_editor_cannot_save_image_or_photo, new Object[0]);
                }
            } else if (m37904N4() || m37897M4()) {
                if (!m37961V2) {
                    ToastUtils.m89266n(AbstractC8020f0.no_permission_general, new Object[0]);
                }
                m38018c6();
            }
            this.f40543O2 = 0;
        }
    }

    /* renamed from: n8 */
    public void m38284n8(int i11) {
        this.f40570V1 = i11;
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null) {
            locationFilterPager.m39371d(i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x014f A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0006, B:5:0x0016, B:7:0x001a, B:8:0x0027, B:10:0x0074, B:11:0x007f, B:13:0x0092, B:15:0x0096, B:16:0x0099, B:18:0x009f, B:20:0x00a3, B:21:0x00a7, B:22:0x00ae, B:24:0x00e4, B:26:0x0109, B:29:0x010e, B:30:0x012b, B:32:0x014f, B:33:0x016d, B:35:0x019a, B:40:0x0112, B:43:0x0125, B:55:0x00e1, B:46:0x00b4, B:48:0x00be, B:50:0x00c2, B:52:0x00da), top: B:2:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0006, B:5:0x0016, B:7:0x001a, B:8:0x0027, B:10:0x0074, B:11:0x007f, B:13:0x0092, B:15:0x0096, B:16:0x0099, B:18:0x009f, B:20:0x00a3, B:21:0x00a7, B:22:0x00ae, B:24:0x00e4, B:26:0x0109, B:29:0x010e, B:30:0x012b, B:32:0x014f, B:33:0x016d, B:35:0x019a, B:40:0x0112, B:43:0x0125, B:55:0x00e1, B:46:0x00b4, B:48:0x00be, B:50:0x00c2, B:52:0x00da), top: B:2:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: o6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38285o6(JSONObject jSONObject) {
        boolean z11;
        VideoCropLayout videoCropLayout;
        try {
            this.f40626n2 = jSONObject;
            String optString = jSONObject.optString("decor_caption");
            this.f40629o2 = optString;
            if (!TextUtils.isEmpty(optString) && this.f40516I == null) {
                m37948T3();
                AbstractC23136l9.m118744r1(this.f40516I, 4);
            }
            this.f40596d2 = jSONObject.optBoolean("need_delete_input_media", false);
            this.f40599e2 = jSONObject.optBoolean("is_gallery_media", false);
            this.f40518I1 = jSONObject.optBoolean("need_flipping_video", false);
            this.f40513H0 = jSONObject.optBoolean("is_bitmap_cropped_or_rotated", false);
            setEditingMediaType(jSONObject.optInt("editing_media_type", 1));
            m38237L5();
            m38302x8();
            this.f40577X1 = jSONObject.optString("editing_media_path");
            this.f40574W1 = jSONObject.optString("original_media_path");
            this.f40583Z1 = jSONObject.optString("temp_picture_path");
            if (this.f40490B1 != null) {
                this.f40490B1.setDescription(jSONObject.optString("description"));
            }
            this.f40497D0 = jSONObject.optBoolean("is_cropping", false);
            m38097m6(jSONObject);
            if (this.f40534M1.m39213b() && !this.f40497D0) {
                setVisibilityTopAndBottom(0);
            }
            if (jSONObject.has("doodle_data")) {
                if (this.f40552R == null) {
                    m37977X3();
                } else {
                    m37970W3(jSONObject.optString("doodle_data"));
                }
            }
            if (jSONObject.has("location_filter_data")) {
                try {
                    String optString2 = jSONObject.optString("location_filter_data");
                    if (!TextUtils.isEmpty(optString2) && this.f40542O1 != null) {
                        AbstractC2790b m13442e = AbstractC2790b.m13442e(new JSONObject(optString2));
                        this.f40585a0 = m13442e;
                        this.f40542O1.setLocationFilter(m13442e.m13446d(false));
                        LocationFilterPager locationFilterPager = this.f40572W;
                        if (locationFilterPager != null) {
                            locationFilterPager.setLocationFilterSelected(this.f40585a0);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("CameraEditorController", e11);
                }
            }
            this.f40608h2 = true;
            this.f40615k0 = (float) jSONObject.optDouble("video_speed", 1.0d);
            this.f40603g0 = jSONObject.optInt("video_reverse_mode", 0);
            this.f40537N0 = jSONObject.optBoolean("is_muted", false);
            if (this.f40615k0 == 1.0f && this.f40603g0 == 0) {
                setVideoSoundMode(false);
                this.f40627o0 = jSONObject.optInt("original_video_start_pos");
                this.f40631p0 = jSONObject.optInt("original_video_play_duration");
                this.f40635q0 = jSONObject.optInt("current_video_start_pos");
                this.f40639r0 = jSONObject.optInt("current_video_play_duration");
                videoCropLayout = this.f40624n0;
                if (videoCropLayout != null) {
                    videoCropLayout.f41732v = jSONObject.optInt("current_video_timeline_scroll_pos");
                    this.f40624n0.f41733w = jSONObject.optInt("current_video_seek_bar_left_progress", 0);
                    this.f40624n0.f41734x = jSONObject.optInt("current_video_seek_bar_right_progress", 1);
                }
                this.f40609i0 = jSONObject.optInt("reverse_video_start_pos");
                this.f40612j0 = jSONObject.optInt("reverse_video_play_duration");
                this.f40554R1 = jSONObject.optInt("editing_video_record_mode", 2);
                this.f40659w0 = jSONObject.optInt("video_message_layout", -1);
                m37862G7();
                if (!jSONObject.has("filter_anim")) {
                    m38107n6(jSONObject);
                    return;
                }
                return;
            }
            m38086l4();
            this.f40600f0.setCurrentSpeed(this.f40615k0);
            VideoSpeedLayout videoSpeedLayout = this.f40600f0;
            if (this.f40603g0 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            videoSpeedLayout.setReversed(z11);
            setVideoSoundMode(true);
            this.f40627o0 = jSONObject.optInt("original_video_start_pos");
            this.f40631p0 = jSONObject.optInt("original_video_play_duration");
            this.f40635q0 = jSONObject.optInt("current_video_start_pos");
            this.f40639r0 = jSONObject.optInt("current_video_play_duration");
            videoCropLayout = this.f40624n0;
            if (videoCropLayout != null) {
            }
            this.f40609i0 = jSONObject.optInt("reverse_video_start_pos");
            this.f40612j0 = jSONObject.optInt("reverse_video_play_duration");
            this.f40554R1 = jSONObject.optInt("editing_video_record_mode", 2);
            this.f40659w0 = jSONObject.optInt("video_message_layout", -1);
            m37862G7();
            if (!jSONObject.has("filter_anim")) {
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("CameraEditorController", e12);
        }
    }

    /* renamed from: o8 */
    public void m38286o8(String str) {
        this.f40583Z1 = str;
        if (this.f40602f2) {
            ImageButton imageButton = this.f40668y1;
            if (imageButton != null && imageButton.getParent() != null) {
                this.f40668y1.performClick();
            } else {
                ActiveImageButton activeImageButton = this.f40672z1;
                if (activeImageButton != null && activeImageButton.getParent() != null) {
                    this.f40672z1.performClick();
                }
            }
            View view = this.f40664x1;
            if (view != null && view.getParent() != null) {
                this.f40664x1.performClick();
            }
            this.f40602f2 = false;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m37993Z5(Integer.valueOf(view.getId()), view);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f40614j2.f40694c = new ArrayList();
        this.f40623m2 = null;
        this.f40638r = (FrameLayout) findViewById(AbstractC6918a0.editor_controller_top);
        ActiveImageColorButton activeImageColorButton = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_filter);
        this.f40651u0 = activeImageColorButton;
        activeImageColorButton.setCircleColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.Dark_AppPrimaryColor));
        this.f40484A = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_sticker);
        this.f40568V = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_location);
        this.f40654v = (ActiveImageButton) findViewById(AbstractC6918a0.btn_editor_back);
        this.f40512H = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_caption);
        ActiveImageColorButton activeImageColorButton2 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_doodle);
        this.f40548Q = activeImageColorButton2;
        activeImageColorButton2.setCircleColor(-1);
        this.f40663x0 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_photo_crop);
        ActiveImageColorButton activeImageColorButton3 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_video_timing);
        this.f40597e0 = activeImageColorButton3;
        activeImageColorButton3.setCircleColor(Color.parseColor("#FFAA71E7"));
        ActiveImageColorButton activeImageColorButton4 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_video_crop);
        this.f40621m0 = activeImageColorButton4;
        activeImageColorButton4.setCircleColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.Dark_AppPrimaryColor));
        this.f40667y0 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_document_scanner);
        setOnClickListenerTopControls(null);
        this.f40642s = (FrameLayout) findViewById(AbstractC6918a0.editor_controller_bottom);
        this.f40646t = findViewById(AbstractC6918a0.editor_bottom_background);
        DescriptionInputTextView descriptionInputTextView = (DescriptionInputTextView) findViewById(AbstractC6918a0.tv_description_input);
        this.f40490B1 = descriptionInputTextView;
        descriptionInputTextView.setDialogInputHint(AbstractC23136l9.m118743r0(AbstractC8020f0.description_input_text_popup_title_for_video));
        this.f40490B1.setOnClickListener(this);
        this.f40490B1.setDialogDismissListener(new DescriptionInputTextView.InterfaceC13797b() { // from class: com.zing.zalo.camera.f
            @Override // com.zing.zalo.p077ui.widget.textview.DescriptionInputTextView.InterfaceC13797b
            /* renamed from: a */
            public final void mo39224a() {
                CameraEditorController.this.m38122p5();
            }
        });
        this.f40494C1 = findViewById(AbstractC6918a0.separator);
        ActiveImageButton activeImageButton = (ActiveImageButton) findViewById(AbstractC6918a0.btn_done);
        this.f40672z1 = activeImageButton;
        activeImageButton.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC6918a0.btn_send);
        this.f40668y1 = imageButton;
        imageButton.setOnClickListener(this);
        View findViewById = findViewById(AbstractC6918a0.btn_post);
        this.f40664x1 = findViewById;
        findViewById.setOnClickListener(this);
        Button button = (Button) findViewById(AbstractC6918a0.btn_next);
        this.f40486A1 = button;
        button.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(AbstractC6918a0.privacy_layout);
        this.f40565U0 = linearLayout;
        linearLayout.setOnClickListener(this);
        ActiveImageColorButton activeImageColorButton5 = (ActiveImageColorButton) findViewById(AbstractC6918a0.privacy_button);
        this.f40561T0 = activeImageColorButton5;
        activeImageColorButton5.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(AbstractC6918a0.save_layout);
        this.f40662x = linearLayout2;
        linearLayout2.setOnClickListener(this);
        ((RobotoTextView) findViewById(AbstractC6918a0.save_text)).setTypeface(C13718q1.m76694c(getContext(), 5));
        ActiveImageColorButton activeImageColorButton6 = (ActiveImageColorButton) findViewById(AbstractC6918a0.save_button);
        this.f40658w = activeImageColorButton6;
        activeImageColorButton6.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(AbstractC6918a0.mute_layout);
        this.f40521J0 = linearLayout3;
        linearLayout3.setOnClickListener(this);
        RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.mute_text);
        this.f40525K0 = robotoTextView;
        robotoTextView.setTypeface(C13718q1.m76694c(getContext(), 5));
        ActiveImageColorButton activeImageColorButton7 = (ActiveImageColorButton) findViewById(AbstractC6918a0.mute_button);
        this.f40529L0 = activeImageColorButton7;
        activeImageColorButton7.setOnClickListener(this);
        this.f40650u = (ExpandableActionView) findViewById(AbstractC6918a0.editor_expandable_action_view);
        RobotoTextView robotoTextView2 = (RobotoTextView) findViewById(AbstractC6918a0.text_editor_mute_indicator);
        this.f40533M0 = robotoTextView2;
        robotoTextView2.setTypeface(C13718q1.m76694c(getContext(), 1));
        this.f40509G0 = false;
        this.f40526K1 = (ProgressBar) findViewById(AbstractC6918a0.loading_progress_bar);
        this.f40630p = findViewById(AbstractC6918a0.editor_black_overlay);
        ActiveImageColorButton activeImageColorButton8 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_back_filter);
        this.f40670z = activeImageColorButton8;
        activeImageColorButton8.setOnClickListener(this);
        View findViewById2 = findViewById(AbstractC6918a0.btn_editor_music);
        this.f40576X0 = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f40579Y0 = (RecyclingImageView) findViewById(AbstractC6918a0.image_music);
        this.f40582Z0 = (ModulesView) findViewById(AbstractC6918a0.tv_select_music);
        this.f40589b1 = findViewById(AbstractC6918a0.loading_music);
        GlowingReddot glowingReddot = (GlowingReddot) findViewById(AbstractC6918a0.glowing_reddot_music);
        this.f40592c1 = glowingReddot;
        if (glowingReddot != null) {
            glowingReddot.m44424c(AbstractC23136l9.m118742r(10.0f), Color.parseColor("#ff565d"), ZAbstractBase.ZVU_PROCESS_FLUSH, 0, 1, 3, 300);
            this.f40592c1.setTopLayerSize(AbstractC23136l9.m118742r(6.0f));
            this.f40592c1.setTopLayerColor(Color.parseColor("#ff565d"));
        }
        m38164u7();
        ActiveImageColorButton activeImageColorButton9 = (ActiveImageColorButton) findViewById(AbstractC6918a0.btn_editor_more);
        this.f40648t1 = activeImageColorButton9;
        activeImageColorButton9.setOnClickListener(this);
        m38030e4();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            m38249T2("tip.any");
            ZaloCameraView zaloCameraView = this.f40538N1;
            if (zaloCameraView != null) {
                zaloCameraView.m39048fT();
                if (this.f40488B != null) {
                    setSelectedQuickAccessFilter(this.f40538N1.f40896k2);
                }
            }
        }
    }

    /* renamed from: q4 */
    public boolean m38287q4() {
        DocumentScanView documentScanView = this.f40541O0;
        if (documentScanView != null && documentScanView.isShown()) {
            return true;
        }
        return false;
    }

    /* renamed from: r6 */
    public void m38288r6(JSONObject jSONObject) {
        try {
            jSONObject.put("need_delete_input_media", this.f40596d2);
            jSONObject.put("is_gallery_media", this.f40599e2);
            jSONObject.put("editing_media_type", this.f40590b2);
            jSONObject.put("editing_media_path", this.f40577X1);
            jSONObject.put("original_media_path", this.f40574W1);
            jSONObject.put("temp_picture_path", this.f40583Z1);
            DescriptionInputTextView descriptionInputTextView = this.f40490B1;
            if (descriptionInputTextView != null) {
                jSONObject.put("description", descriptionInputTextView.getText().toString());
            }
            m37994Z6(jSONObject);
            m38001a7(jSONObject);
            m38033e7(jSONObject);
            m38019c7(jSONObject);
            m38070j7(jSONObject);
            m38026d7(jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: r8 */
    public void m38289r8(boolean z11) {
        try {
            if (this.f40542O1.m39769a0()) {
                ColorFilterConfig colorFilterConfig = this.f40542O1.getColorFilterConfig();
                ZaloCameraView zaloCameraView = this.f40538N1;
                if (zaloCameraView != null && colorFilterConfig != null) {
                    this.f40614j2.f40694c.add(zaloCameraView.m39052iQ());
                    if (z11) {
                        this.f40659w0 = -1;
                    }
                }
            } else {
                this.f40614j2.f40694c.clear();
                if (z11) {
                    this.f40659w0 = -1;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: s4 */
    public boolean m38290s4() {
        return this.f40546P1 == 3;
    }

    /* renamed from: s7 */
    public void m38291s7(int i11, int i12, int i13, float f11, float f12) {
        this.f40635q0 = i11;
        this.f40639r0 = i12;
        VideoCropLayout videoCropLayout = this.f40624n0;
        if (videoCropLayout != null) {
            videoCropLayout.f41732v = i13;
            videoCropLayout.f41733w = f11;
            videoCropLayout.f41734x = f12;
        }
    }

    /* renamed from: s8 */
    public void m38292s8() {
        SendInputParams sendInputParams = this.f40534M1.f41119l0;
        if ((sendInputParams != null && sendInputParams.m39219a() == 2) || AbstractC22470k.m116158j(this.f40534M1.f41129s, 0)) {
            this.f40486A1.setVisibility(8);
            this.f40664x1.setVisibility(8);
            this.f40668y1.setVisibility(8);
            this.f40672z1.setVisibility(0);
            return;
        }
        if (this.f40534M1.f41129s == 9) {
            this.f40664x1.setVisibility(8);
            this.f40668y1.setVisibility(8);
            this.f40672z1.setVisibility(8);
            this.f40486A1.setVisibility(0);
            return;
        }
        if (m38113o4()) {
            this.f40486A1.setVisibility(8);
            this.f40668y1.setVisibility(8);
            this.f40672z1.setVisibility(8);
            this.f40664x1.setVisibility(0);
            return;
        }
        this.f40486A1.setVisibility(8);
        this.f40664x1.setVisibility(8);
        this.f40672z1.setVisibility(8);
        this.f40668y1.setVisibility(0);
    }

    public void setBitmapCroppedOrRotated(boolean z11) {
        this.f40513H0 = z11;
    }

    public void setEditingMediaType(int i11) {
        this.f40590b2 = i11;
        if (!m38113o4()) {
            return;
        }
        int i12 = this.f40554R1;
        if (i12 == 4) {
            this.f40539N2.setValue(EnumC24313a.m126962d(i12));
        } else {
            this.f40539N2.setValue(EnumC24313a.m126961c(i11));
        }
    }

    public void setEditingMode(int i11) {
        try {
            this.f40546P1 = i11;
            m37919P2();
            if (this.f40591c0 && !m38161u4()) {
                this.f40594d0 = true;
            } else if (m38161u4()) {
                this.f40594d0 = false;
            }
            ZaloCameraView zaloCameraView = this.f40538N1;
            if (zaloCameraView != null) {
                zaloCameraView.m92645PI();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    public void setEditorRecordMode(int i11) {
        this.f40554R1 = i11;
        if (m38113o4()) {
            this.f40539N2.setValue(EnumC24313a.m126962d(i11));
        }
    }

    public void setEventListener(InterfaceC7480j0 interfaceC7480j0) {
        this.f40558S1 = interfaceC7480j0;
    }

    public void setIsWaitingForVideo(boolean z11) {
        this.f40514H1 = z11;
        if (z11) {
            return;
        }
        this.f40669y2 = null;
    }

    public void setLocationFilter(List<AbstractC2790b> list) {
        this.f40588b0 = list;
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null) {
            locationFilterPager.setLocationFilters(list);
        }
    }

    public void setLocationFilterIntro(AbstractC2790b abstractC2790b) {
        if (abstractC2790b == null) {
            return;
        }
        if (this.f40572W == null) {
            m38007b4();
        }
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null) {
            locationFilterPager.setLocationFilterSelected(abstractC2790b);
            this.f40542O1.setLocationFilter(abstractC2790b.m13446d(false));
            this.f40585a0 = abstractC2790b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLyricState(boolean z11) {
        MusicView musicView = this.f40601f1;
        if (musicView != null) {
            musicView.m39410L(z11);
        }
    }

    public void setMediaPickedFromGallery(boolean z11) {
        this.f40599e2 = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMusicLayoutEditingSong(SongData songData) {
        MusicView musicView = this.f40601f1;
        if (musicView != null) {
            musicView.setEditingSong(songData);
        }
    }

    public void setOriginalFileContent(C20620k c20620k) {
        this.f40623m2 = c20620k;
    }

    public void setPositionInGallery(int i11) {
        this.f40593c2 = i11;
    }

    public void setSavedMediaContent(boolean z11) {
        this.f40614j2.f40693b = z11;
    }

    public void setSelectedQuickAccessFilter(boolean z11) {
        this.f40508G = z11;
        ActiveImageColorButton activeImageColorButton = this.f40488B;
        if (activeImageColorButton != null) {
            activeImageColorButton.setSelected(z11);
        }
    }

    public void setVideoInputPath(String str) {
        this.f40574W1 = str;
        if (TextUtils.isEmpty(this.f40577X1)) {
            this.f40577X1 = str;
        }
    }

    public void setVisibilityTopAndBottom(int i11) {
        AbstractC23136l9.m118744r1(this.f40638r, i11);
        AbstractC23136l9.m118744r1(this.f40642s, i11);
        AbstractC23136l9.m118744r1(this.f40646t, i11);
        AbstractC23136l9.m118744r1(this.f40650u, i11);
    }

    /* renamed from: t4 */
    public boolean m38293t4() {
        return this.f40546P1 == 7;
    }

    /* renamed from: t6 */
    public void m38294t6(AbstractC21351f abstractC21351f) {
        try {
            if (abstractC21351f == this.f40616k1) {
                m37972W6(abstractC21351f);
                return;
            }
            if (this.f40516I == null) {
                m37948T3();
            }
            InterfaceC7480j0 interfaceC7480j0 = this.f40558S1;
            if (interfaceC7480j0 != null) {
                interfaceC7480j0.mo38356n(false, true);
            }
            this.f40538N1.m39067oQ().setDisableTouch(true);
            m37980X6(abstractC21351f);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: t8 */
    public void m38295t8(boolean z11) {
        ActiveImageColorButton activeImageColorButton = this.f40651u0;
        if (activeImageColorButton != null) {
            activeImageColorButton.setSelected(z11);
        }
        m38182w8(z11);
    }

    /* renamed from: v4 */
    public boolean m38296v4() {
        return this.f40546P1 == 0;
    }

    /* renamed from: v7 */
    public void m38297v7() {
        String str;
        try {
            if (this.f40542O1 != null) {
                if (!TextUtils.isEmpty(this.f40577X1)) {
                    str = this.f40577X1;
                } else if (!TextUtils.isEmpty(this.f40574W1)) {
                    str = this.f40574W1;
                } else if (!TextUtils.isEmpty(this.f40583Z1)) {
                    str = this.f40583Z1;
                } else {
                    str = "";
                }
                ImageDecorView imageDecorView = this.f40542O1;
                imageDecorView.m39786t0(imageDecorView.getCurrentLoadedImage(), str, this);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: w7 */
    public void m38298w7() {
        try {
            ImageDecorView imageDecorView = this.f40542O1;
            if (imageDecorView != null) {
                C30923c c30923c = this.f40587a2;
                if (c30923c != null) {
                    imageDecorView.m39790x0(this.f40577X1, c30923c, this, this.f40581Y2);
                }
                this.f40542O1.getRender().m98260A2(new C21362q(0.0d, 0.0d, 1.0d, 1.0d));
                this.f40542O1.getRender().m98317t2(this.f40542O1.getNewWidth(), this.f40542O1.getNewHeight());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: x2 */
    public void m38299x2() {
        if (this.f40497D0) {
            return;
        }
        if (AbstractC22470k.m116158j(this.f40534M1.f41129s, 7) && !this.f40534M1.m39215d()) {
            m38251U2("tip.any");
        } else if (m38296v4()) {
            m38251U2("tip.any");
        }
    }

    /* renamed from: x3 */
    public void m38300x3(boolean z11) {
        this.f40538N1.m39067oQ().setDisableTouch(false);
        setEditingMode(0);
        Animator animator = this.f40493C0;
        if (animator != null) {
            animator.cancel();
        }
        CropView cropView = this.f40671z0;
        if (cropView != null) {
            cropView.findViewById(AbstractC6918a0.btn_back_crop).setEnabled(false);
            this.f40671z0.findViewById(AbstractC6918a0.btn_finish_crop_photo).setEnabled(false);
            this.f40671z0.findViewById(AbstractC6918a0.btn_rotate_left_crop).setEnabled(false);
        }
        if (!z11) {
            while (this.f40517I0 != this.f40542O1.getRender().m98308p1()) {
                this.f40542O1.getRender().m98285a2(getHeight() - AbstractC23222t7.f112517C0);
            }
        }
        this.f40485A0 = null;
        this.f40497D0 = false;
        if (!z11) {
            setVisibilityTopAndBottom(4);
            AbstractC23136l9.m118744r1(this.f40671z0, 4);
        }
    }

    /* renamed from: x7 */
    public void m38301x7(String str, int i11, int i12, boolean z11, boolean z12, boolean z13, C25977a c25977a) {
        int[] m38205z8;
        try {
            this.f40580Y1 = "";
            boolean z14 = true;
            m38289r8(true);
            if (!z12 && c25977a != null && (m38205z8 = m38205z8(c25977a.f123940a / c25977a.f123941b, false)) != null && m38205z8.length >= 2) {
                if (this.f40542O1.getWidth() == m38205z8[0] && this.f40542O1.getHeight() == m38205z8[1]) {
                    z14 = false;
                }
                this.f40522J1 = z14;
            }
            m38261a4(str, i11, i12, z11, z12, z13);
            this.f40577X1 = str;
            this.f40583Z1 = null;
            m37818A8(i11, i12);
            if (!this.f40522J1) {
                m38197y7();
            }
            m37891L6("121N000");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: x8 */
    public void m38302x8() {
        int i11;
        try {
            int i12 = 8;
            if (m38211C4()) {
                m37881J7(false);
                AbstractC23136l9.m118744r1(this.f40597e0, 8);
                AbstractC23136l9.m118744r1(this.f40656v1, 8);
                m37887K7();
                m37965V7(false);
                ActiveImageColorButton activeImageColorButton = this.f40663x0;
                if (!m38130q3()) {
                    i12 = 0;
                }
                AbstractC23136l9.m118744r1(activeImageColorButton, i12);
                AbstractC23136l9.m118744r1(this.f40660w1, 0);
                if (AbstractC26689j.f126436b) {
                    m38034e8(false);
                    return;
                }
                return;
            }
            if (m38214D4()) {
                m37875I7();
                int i13 = this.f40554R1;
                if (i13 == 4) {
                    AbstractC23136l9.m118744r1(this.f40597e0, 8);
                    AbstractC23136l9.m118744r1(this.f40656v1, 8);
                    m37965V7(false);
                    if (AbstractC26689j.f126436b) {
                        m38034e8(false);
                    }
                } else {
                    int i14 = this.f40534M1.f41129s;
                    if (i14 == 9) {
                        AbstractC23136l9.m118744r1(this.f40597e0, 8);
                        AbstractC23136l9.m118744r1(this.f40656v1, 8);
                        m37965V7(false);
                        if (AbstractC26689j.f126436b) {
                            m38034e8(false);
                        }
                    } else if (i14 != 7 && (this.f40599e2 || i13 == 3 || (i14 == 2 && i13 == 2))) {
                        AbstractC23136l9.m118744r1(this.f40597e0, 8);
                        AbstractC23136l9.m118744r1(this.f40656v1, 8);
                        m37965V7(true);
                        if (AbstractC26689j.f126436b) {
                            m38034e8(m37897M4());
                        }
                    } else if (ZMediaPlayerSettings.getVideoConfig(8).isZaloPlayer()) {
                        ActiveImageColorButton activeImageColorButton2 = this.f40597e0;
                        if (!m38130q3()) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        AbstractC23136l9.m118744r1(activeImageColorButton2, i11);
                        AbstractC23136l9.m118744r1(this.f40656v1, 0);
                        m37965V7(true);
                        if (AbstractC26689j.f126436b) {
                            m38034e8(false);
                        }
                    }
                }
                AbstractC23136l9.m118744r1(this.f40663x0, 8);
                AbstractC23136l9.m118744r1(this.f40660w1, 8);
                AbstractC23136l9.m118744r1(this.f40667y0, 8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CameraEditorController", e11);
        }
    }

    /* renamed from: z2 */
    public void m38303z2(boolean z11) {
        m37815A2();
        m38192y2(z11);
        m37830C2(z11);
    }

    /* renamed from: z3 */
    public C20620k m38304z3(String str, boolean z11) {
        int i11 = this.f40534M1.f41106Y;
        if (i11 != -1) {
            this.f40593c2 = i11;
        }
        C23307g m118367a = AbstractC23067f6.m118367a(str);
        return C20620k.m107330a().m107364o(0L).m107359j(this.f40593c2).m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(str).m107353d(AbstractC23041d2.m118216o(str)).m107355f(m118367a.f113481h).m107360k(z11).m107350a();
    }

    /* renamed from: z4 */
    public boolean m38305z4() {
        LocationFilterPager locationFilterPager = this.f40572W;
        if (locationFilterPager != null && locationFilterPager.getLocationFilter() != null) {
            return true;
        }
        return false;
    }
}
