package com.zing.zalo.p077ui.picker.landingpage;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.RecyclerView;
import b40.C2526d;
import cg.AbstractC3460h;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7219t7;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.picker.AbstractC12670d;
import com.zing.zalo.p077ui.picker.landingpage.LandingPageView;
import com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView;
import com.zing.zalo.p077ui.picker.landingpage.LandingVideoView;
import com.zing.zalo.p077ui.picker.landingpage.custom.LandingViewPager;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.layout.FixUsableHeightFrameLayout;
import com.zing.zalo.p077ui.widget.textview.DescriptionInputTextView;
import com.zing.zalo.p077ui.widget.textview.RoundedRobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.photoview.PhotoView;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import com.zing.zalo.uicomponents.imageview.ActiveImageColorButton;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zdesign.component.CheckCircle;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dg0.AbstractC17927b;
import ef0.AbstractC18423a;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import j90.RunnableC21107e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m90.EnumC22962a;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23171p0;
import me0.AbstractC23222t7;
import me0.AbstractC23237v1;
import me0.AbstractC23238v2;
import me0.AbstractC23258x2;
import me0.AbstractC23280z4;
import me0.C23046d7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p270jk.EnumC21281b;
import p322lf.AbstractC22463d;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p407ox.AbstractC24579d;
import p524te.ViewOnClickListenerC26642c;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import th.AbstractC26681b;
import th.AbstractC26689j;
import vg.C28139n5;
import zh0.AbstractC32212c;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class LandingPageView extends BaseZaloView implements View.OnClickListener, C23744a.c, InterfaceC0733x {

    /* renamed from: u2 */
    public static boolean f66110u2 = false;

    /* renamed from: v2 */
    private static C24003n f66111v2;

    /* renamed from: A1 */
    private RoundedRobotoTextView f66112A1;

    /* renamed from: B1 */
    Snackbar f66113B1;

    /* renamed from: F1 */
    private SparseIntArray f66117F1;

    /* renamed from: J1 */
    private int f66121J1;

    /* renamed from: O0 */
    private InterfaceC27218a f66128O0;

    /* renamed from: P0 */
    private C23528a f66130P0;

    /* renamed from: Q0 */
    private ViewGroup f66132Q0;

    /* renamed from: R0 */
    private LandingViewPager f66134R0;

    /* renamed from: S0 */
    private C12715n f66136S0;

    /* renamed from: T0 */
    private View f66138T0;

    /* renamed from: U0 */
    private ActiveImageColorButton f66140U0;

    /* renamed from: V0 */
    private ActiveImageColorButton f66142V0;

    /* renamed from: W0 */
    private ActiveImageColorButton f66144W0;

    /* renamed from: X0 */
    private ActiveImageColorButton f66146X0;

    /* renamed from: Y0 */
    private ActiveImageColorButton f66148Y0;

    /* renamed from: Z0 */
    private ActiveImageColorButton f66150Z0;

    /* renamed from: a1 */
    private ActiveImageColorButton f66152a1;

    /* renamed from: a2 */
    private boolean f66153a2;

    /* renamed from: b1 */
    private ActiveImageColorButton f66154b1;

    /* renamed from: c1 */
    private ActiveImageColorButton f66156c1;

    /* renamed from: d1 */
    private ActiveImageColorButton f66158d1;

    /* renamed from: e1 */
    private View f66160e1;

    /* renamed from: f1 */
    private ActiveImageButton f66162f1;

    /* renamed from: g1 */
    private ActiveImageButton f66164g1;

    /* renamed from: h1 */
    private ActiveImageColorButton f66166h1;

    /* renamed from: i1 */
    private View f66168i1;

    /* renamed from: i2 */
    private InterfaceC12717p f66169i2;

    /* renamed from: j1 */
    private View f66170j1;

    /* renamed from: j2 */
    private InterfaceC12718q f66171j2;

    /* renamed from: k1 */
    private FrameLayout f66172k1;

    /* renamed from: k2 */
    private InterfaceC12719r f66173k2;

    /* renamed from: l1 */
    private RecyclerView f66174l1;

    /* renamed from: l2 */
    private InterfaceC12720s f66175l2;

    /* renamed from: m1 */
    private SmoothScrollLinearLayoutManager f66176m1;

    /* renamed from: m2 */
    private C3977j f66177m2;

    /* renamed from: n1 */
    private C7219t7 f66178n1;

    /* renamed from: n2 */
    private HandlerThread f66179n2;

    /* renamed from: o1 */
    private DescriptionInputTextView f66180o1;

    /* renamed from: p1 */
    private View f66182p1;

    /* renamed from: q1 */
    private ViewGroup f66184q1;

    /* renamed from: r1 */
    private TextView f66186r1;

    /* renamed from: s1 */
    private View f66188s1;

    /* renamed from: t1 */
    private CheckCircle f66190t1;

    /* renamed from: u1 */
    private RelativeLayout f66192u1;

    /* renamed from: v1 */
    private CheckCircle f66193v1;

    /* renamed from: w1 */
    private RobotoTextView f66194w1;

    /* renamed from: x1 */
    private RecyclingImageView f66195x1;

    /* renamed from: y1 */
    private FrameLayout f66196y1;

    /* renamed from: z1 */
    private RecyclingImageView f66197z1;

    /* renamed from: M0 */
    private final int f66124M0 = AbstractC23136l9.m118742r(66.0f);

    /* renamed from: N0 */
    private final int f66126N0 = AbstractC23136l9.m118742r(132.0f);

    /* renamed from: C1 */
    private ArrayList f66114C1 = new ArrayList();

    /* renamed from: D1 */
    private final ArrayList f66115D1 = new ArrayList();

    /* renamed from: E1 */
    private ArrayList f66116E1 = new ArrayList();

    /* renamed from: G1 */
    private int f66118G1 = -1;

    /* renamed from: H1 */
    private EnumC22962a f66119H1 = EnumC22962a.f111694r;

    /* renamed from: I1 */
    private int f66120I1 = 0;

    /* renamed from: K1 */
    private int f66122K1 = -1;

    /* renamed from: L1 */
    private int f66123L1 = -1;

    /* renamed from: M1 */
    private int f66125M1 = 0;

    /* renamed from: N1 */
    private int f66127N1 = 0;

    /* renamed from: O1 */
    private String f66129O1 = "";

    /* renamed from: P1 */
    private String f66131P1 = "";

    /* renamed from: Q1 */
    private String f66133Q1 = "";

    /* renamed from: R1 */
    private MediaItem f66135R1 = null;

    /* renamed from: S1 */
    private boolean f66137S1 = false;

    /* renamed from: T1 */
    private boolean f66139T1 = false;

    /* renamed from: U1 */
    private boolean f66141U1 = false;

    /* renamed from: V1 */
    private boolean f66143V1 = true;

    /* renamed from: W1 */
    private boolean f66145W1 = false;

    /* renamed from: X1 */
    private boolean f66147X1 = true;

    /* renamed from: Y1 */
    private boolean f66149Y1 = false;

    /* renamed from: Z1 */
    private boolean f66151Z1 = false;

    /* renamed from: b2 */
    private boolean f66155b2 = false;

    /* renamed from: c2 */
    private boolean f66157c2 = false;

    /* renamed from: d2 */
    private boolean f66159d2 = false;

    /* renamed from: e2 */
    private int f66161e2 = 0;

    /* renamed from: f2 */
    private String f66163f2 = "";

    /* renamed from: g2 */
    private String f66165g2 = "";

    /* renamed from: h2 */
    private String f66167h2 = "";

    /* renamed from: o2 */
    private AnimatorSet f66181o2 = null;

    /* renamed from: p2 */
    private AnimatorSet f66183p2 = null;

    /* renamed from: q2 */
    private AnimatorSet f66185q2 = null;

    /* renamed from: r2 */
    private final Handler f66187r2 = new HandlerC12706e(Looper.getMainLooper());

    /* renamed from: s2 */
    private final ViewPager.C6879n f66189s2 = new C12707f();

    /* renamed from: t2 */
    private final Runnable f66191t2 = new Runnable() { // from class: j90.m
        public /* synthetic */ RunnableC21123m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LandingPageView.this.m71633iO();
        }
    };

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$a */
    /* loaded from: classes6.dex */
    public class C12702a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ PhotoView f66198l1;

        /* renamed from: m1 */
        final /* synthetic */ MediaItem f66199m1;

        C12702a(PhotoView photoView, MediaItem mediaItem) {
            this.f66198l1 = photoView;
            this.f66199m1 = mediaItem;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                    try {
                        this.f66198l1.setImageInfo(c3979l);
                        LandingPageView.this.m71553IP(this.f66199m1, m18839c);
                    } catch (Exception e11) {
                        AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$b */
    /* loaded from: classes6.dex */
    public class C12703b extends AnimatorListenerAdapter {

        /* renamed from: p */
        boolean f66201p = false;

        /* renamed from: q */
        final /* synthetic */ boolean f66202q;

        C12703b(boolean z11) {
            this.f66202q = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f66201p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f66201p) {
                return;
            }
            this.f66201p = false;
            if (!this.f66202q) {
                LandingPageView.this.m71600YN();
            } else if (!LandingPageView.this.f66145W1) {
                LandingPageView.this.f66187r2.sendEmptyMessageDelayed(2, 300L);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$c */
    /* loaded from: classes6.dex */
    public class C12704c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f66204p;

        /* renamed from: q */
        final /* synthetic */ boolean f66205q;

        C12704c(boolean z11, boolean z12) {
            this.f66204p = z11;
            this.f66205q = z12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f66204p) {
                LandingPageView.this.m71664qP(false, this.f66205q);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$d */
    /* loaded from: classes6.dex */
    public class C12705d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f66207p;

        C12705d(boolean z11) {
            this.f66207p = z11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z11) {
            int i11;
            ActiveImageButton activeImageButton = LandingPageView.this.f66162f1;
            int i12 = 8;
            if (!this.f66207p) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(activeImageButton, i11);
            ActiveImageButton activeImageButton2 = LandingPageView.this.f66164g1;
            if (this.f66207p) {
                i12 = 0;
            }
            AbstractC23136l9.m118744r1(activeImageButton2, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$e */
    /* loaded from: classes6.dex */
    public class HandlerC12706e extends Handler {
        HandlerC12706e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    LandingPageView.this.m71624fP();
                    return;
                } else {
                    if (i11 == 3) {
                        LandingPageView.this.m71656oP();
                        return;
                    }
                    return;
                }
            }
            try {
                if (!LandingPageView.this.m92672lJ()) {
                    return;
                }
                if (LandingPageView.this.f66128O0 != null && LandingPageView.this.m92687sJ()) {
                    if (LandingPageView.this.f66128O0.isFinishing()) {
                        return;
                    }
                    if (LandingPageView.this.f66153a2) {
                        LandingPageView.this.m71582SN();
                    } else {
                        LandingPageView.this.m71656oP();
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$f */
    /* loaded from: classes6.dex */
    public class C12707f extends ViewPager.C6879n {
        C12707f() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            if (!LandingPageView.this.f66147X1) {
                LandingPageView.this.f66147X1 = true;
            }
            LandingPageView.this.f66127N1 = i11;
            if (i11 == 0) {
                LandingPageView.this.m71561KP();
                LandingPageView landingPageView = LandingPageView.this;
                landingPageView.m71690xP("editor_viewfull_swipe", landingPageView.m71555JN(landingPageView.f66122K1));
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            try {
                LandingPageView.this.m71566MO(i11);
                if (LandingPageView.this.f66145W1) {
                    LandingPageView.this.f66187r2.sendEmptyMessage(2);
                }
                if (!LandingPageView.this.f66147X1) {
                    LandingPageView.this.m71561KP();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$g */
    /* loaded from: classes6.dex */
    public class C12708g implements LandingPhotoView.InterfaceC12724b0 {
        C12708g() {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: a */
        public void mo71709a() {
            AbstractC23237v1.m119713a("LandingPhotoView SavePicture onItemUnSelect");
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: b */
        public void mo71710b() {
            LandingPageView.this.f66134R0.setEnableSwipe(false);
            AbstractC23237v1.m119715c("LandingPhotoView SavePicture onItemUnSelect");
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: c */
        public void mo71711c() {
            LandingPageView.this.f66134R0.setEnableSwipe(true);
            AbstractC23237v1.m119714b("LandingPhotoView SavePicture onItemUnSelect", "onCompleteGenBitmap");
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$h */
    /* loaded from: classes6.dex */
    public class C12709h implements C7219t7.b {
        C12709h() {
        }

        @Override // com.zing.zalo.adapters.C7219t7.b
        /* renamed from: a */
        public boolean mo36731a(MediaItem mediaItem) {
            MediaItem m71543GN = LandingPageView.this.m71543GN();
            if (m71543GN != null && mediaItem != null && ((m71543GN.mo41090x() != 0 && m71543GN.mo41090x() == mediaItem.mo41090x()) || m71543GN.mo41081Q().equals(mediaItem.mo41081Q()))) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.adapters.C7219t7.b
        /* renamed from: b */
        public void mo36732b(MediaItem mediaItem) {
            AbstractC23647d.m123897g("918000");
            int m120299K = AbstractC23280z4.m120299K(LandingPageView.this.f66114C1, mediaItem);
            if (m120299K != -1) {
                LandingPageView.this.f66147X1 = false;
                LandingPageView.this.f66134R0.setCurrentItem(m120299K, false);
                return;
            }
            String m41127V = mediaItem.m41127V();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43865xc5f317be);
            if (mediaItem instanceof VideoItem) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43866xc647ee07);
            } else if (mediaItem.m41163p0()) {
                m118743r0 = "GIF";
            }
            if (!TextUtils.isEmpty(m41127V)) {
                ToastUtils.m89266n(AbstractC8020f0.str_quick_landing_page_selected_item_not_in_right_album, m41127V, m118743r0);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.f43867x7cc41b1, m118743r0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$i */
    /* loaded from: classes6.dex */
    public class C12710i extends C1914g {
        C12710i() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1933z
        /* renamed from: N */
        public void mo10686N(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            int m120299K = AbstractC23280z4.m120299K(LandingPageView.this.f66116E1, LandingPageView.this.m71543GN());
            if (m120299K != -1) {
                LandingPageView.this.f66174l1.mo9854S1(m120299K);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$j */
    /* loaded from: classes6.dex */
    public class C12711j extends RecyclerView.AbstractC1892s {
        C12711j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    LandingPageView.this.f66178n1.m36730T(false);
                    LandingPageView.this.f66178n1.m10008p();
                } else {
                    LandingPageView.this.f66178n1.m36730T(true);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$k */
    /* loaded from: classes6.dex */
    public class C12712k implements LandingPhotoView.InterfaceC12724b0 {
        C12712k() {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: a */
        public void mo71709a() {
            LandingPageView.this.f72421L0.mo78960q3();
            LandingPageView.this.m71548HO();
            AbstractC23237v1.m119713a("LandingPhotoView SavePicture handleDone");
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: b */
        public void mo71710b() {
            AbstractC23237v1.m119715c("LandingPhotoView SavePicture handleDone");
            BaseZaloView baseZaloView = LandingPageView.this.f72421L0;
            baseZaloView.mo78950cq(baseZaloView.m92652XI(AbstractC8020f0.str_save_photo_edit));
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: c */
        public void mo71711c() {
            AbstractC23237v1.m119714b("LandingPhotoView SavePicture handleDone", "onCompleteGenBitmap");
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$l */
    /* loaded from: classes6.dex */
    public class C12713l implements LandingPhotoView.InterfaceC12724b0 {
        C12713l() {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: a */
        public void mo71709a() {
            LandingPageView.this.f72421L0.mo78960q3();
            LandingPageView.this.m71640kP(AbstractC23304d.f113392h2);
            AbstractC23237v1.m119713a("LandingPhotoView SavePicture handleBack");
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: b */
        public void mo71710b() {
            BaseZaloView baseZaloView = LandingPageView.this.f72421L0;
            baseZaloView.mo78950cq(baseZaloView.m92652XI(AbstractC8020f0.str_save_photo_edit));
            AbstractC23237v1.m119715c("LandingPhotoView SavePicture handleBack");
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12724b0
        /* renamed from: c */
        public void mo71711c() {
            AbstractC23237v1.m119714b("LandingPhotoView SavePicture handleBack", "onCompleteGenBitmap");
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$m */
    /* loaded from: classes6.dex */
    public class C12714m implements AbstractC23258x2.a {

        /* renamed from: a */
        final /* synthetic */ MediaItem f66217a;

        /* renamed from: b */
        final /* synthetic */ Runnable f66218b;

        C12714m(MediaItem mediaItem, Runnable runnable) {
            this.f66217a = mediaItem;
            this.f66218b = runnable;
        }

        /* renamed from: c */
        public /* synthetic */ void m71713c(boolean z11, MediaItem mediaItem, boolean z12, Runnable runnable) {
            LandingPageView.this.f66149Y1 = false;
            if (m71714d()) {
                return;
            }
            if (!z11) {
                ToastUtils.m89266n(AbstractC8020f0.media_picker_image_full_dont_exist, new Object[0]);
                LandingPageView.this.f66193v1.setChecked(false);
            } else {
                mediaItem.m41133Y0(new AtomicBoolean(z12));
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        @Override // me0.AbstractC23258x2.a
        /* renamed from: a */
        public void mo39096a(boolean z11, boolean z12) {
            LandingPageView.this.f66187r2.post(new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.b

                /* renamed from: q */
                public final /* synthetic */ boolean f66356q;

                /* renamed from: r */
                public final /* synthetic */ MediaItem f66357r;

                /* renamed from: s */
                public final /* synthetic */ boolean f66358s;

                /* renamed from: t */
                public final /* synthetic */ Runnable f66359t;

                public /* synthetic */ RunnableC12753b(boolean z112, MediaItem mediaItem, boolean z122, Runnable runnable) {
                    r2 = z112;
                    r3 = mediaItem;
                    r4 = z122;
                    r5 = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LandingPageView.C12714m.this.m71713c(r2, r3, r4, r5);
                }
            });
        }

        /* renamed from: d */
        public boolean m71714d() {
            return !LandingPageView.this.m92674mJ();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$n */
    /* loaded from: classes6.dex */
    public class C12715n extends AbstractC6881a {

        /* renamed from: r */
        List f66220r = new ArrayList();

        /* renamed from: s */
        InterfaceC12716o f66221s;

        /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$n$a */
        /* loaded from: classes6.dex */
        public class a implements LandingPhotoView.InterfaceC12748z {
            a() {
            }

            /* renamed from: j */
            public /* synthetic */ void m71739j(MediaItem mediaItem) {
                LandingPageView.this.m71553IP(mediaItem, null);
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: a */
            public void mo71740a(int i11) {
                boolean z11;
                LandingPageView landingPageView = LandingPageView.this;
                boolean z12 = false;
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                landingPageView.f66155b2 = z11;
                LandingPageView landingPageView2 = LandingPageView.this;
                if (i11 == 6) {
                    z12 = true;
                }
                landingPageView2.f66159d2 = z12;
                LandingPageView.this.f66134R0.setEnableSwipe(!LandingPageView.this.f66155b2);
                if (!LandingPageView.this.f66155b2) {
                    LandingPageView.this.m71616dP(true);
                }
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: b */
            public void mo71741b(boolean z11) {
                if (z11) {
                    LandingPageView.this.m71656oP();
                } else {
                    LandingPageView.this.m71582SN();
                }
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: c */
            public void mo71742c(boolean z11) {
                if (LandingPageView.this.f66166h1 != null) {
                    LandingPageView.this.f66166h1.setSelected(z11);
                }
                LandingPageView.this.m71537EP(z11);
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: d */
            public void mo71743d(boolean z11) {
                LandingPageView.this.m71701ON(z11);
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: e */
            public void mo71744e() {
                LandingPageView.this.removeDialog(2);
                LandingPageView.this.showDialog(2);
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: f */
            public void mo71745f(MediaItem mediaItem) {
                LandingPageView.this.f66187r2.post(new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.j

                    /* renamed from: q */
                    public final /* synthetic */ MediaItem f66373q;

                    public /* synthetic */ RunnableC12761j(MediaItem mediaItem2) {
                        r2 = mediaItem2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LandingPageView.C12715n.a.this.m71739j(r2);
                    }
                });
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: g */
            public void mo71746g() {
                LandingPageView.this.f66187r2.sendEmptyMessage(1);
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12748z
            /* renamed from: h */
            public void mo71747h() {
                LandingPageView.this.removeDialog(1);
                LandingPageView.this.showDialog(1);
            }
        }

        /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$n$b */
        /* loaded from: classes6.dex */
        public class b implements ViewOnTouchListenerC9043a.i {
            b() {
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: a */
            public void mo48410a(float f11) {
                RelativeLayout relativeLayout;
                try {
                    if (LandingPageView.this.f66138T0 != null) {
                        LandingPageView.this.f66138T0.setAlpha(f11);
                    }
                    if (LandingPageView.this.f66132Q0 != null && (relativeLayout = (RelativeLayout) LandingPageView.this.f66132Q0.findViewById(AbstractC6918a0.landing_page_oversize_video_popup)) != null) {
                        relativeLayout.setAlpha(f11);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: b */
            public void mo48411b() {
                LandingPageView.this.f66141U1 = true;
                LandingPageView.this.m71582SN();
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: c */
            public void mo48412c() {
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: d */
            public void mo48413d() {
                LandingPageView.this.m71579RN();
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: e */
            public void mo48414e() {
                LandingPageView.this.f66141U1 = false;
                if (LandingPageView.this.f66138T0 != null) {
                    LandingPageView.this.f66138T0.setAlpha(1.0f);
                }
                LandingPageView.this.m71656oP();
            }
        }

        C12715n() {
        }

        /* renamed from: D */
        private void m71718D(ViewGroup viewGroup, MediaItem mediaItem) {
            ImageButton imageButton = new ImageButton(LandingPageView.this.f66128O0.getContext());
            imageButton.setId(AbstractC6918a0.landing_page_video_indicator);
            imageButton.setBackgroundResource(AbstractC16801x.transparent);
            imageButton.setImageResource(AbstractC18423a.play_video);
            imageButton.setOnClickListener(LandingPageView.this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            viewGroup.addView(imageButton, layoutParams);
            if (AbstractC26689j.f126436b) {
                RelativeLayout relativeLayout = new RelativeLayout(LandingPageView.this.f66128O0.getContext());
                relativeLayout.setId(AbstractC6918a0.landing_page_oversize_video_popup);
                relativeLayout.setBackgroundColor(AbstractC23136l9.m118641B(relativeLayout.getContext(), AbstractC16801x.white_e6));
                AbstractC23136l9.m118744r1(relativeLayout, 4);
                relativeLayout.setOnClickListener(LandingPageView.this);
                RobotoTextView robotoTextView = new RobotoTextView(LandingPageView.this.f66128O0.getContext());
                robotoTextView.setId(AbstractC6918a0.landing_page_oversize_video_text);
                robotoTextView.setTextSize(1, 14.0f);
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_landing_page_oversize_video));
                robotoTextView.setTextColor(AbstractC23136l9.m118641B(robotoTextView.getContext(), AbstractC16801x.co_mtxt2));
                robotoTextView.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112556e, 0, AbstractC23222t7.f112562h);
                ImageView imageView = new ImageView(LandingPageView.this.f66128O0.getContext());
                imageView.setId(AbstractC6918a0.landing_page_oversize_video_icon_crop);
                imageView.setImageDrawable(AbstractC23136l9.m118665N(LandingPageView.this.f66128O0.getContext(), AbstractC23322a.zds_ic_scissor_solid_24));
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(11);
                layoutParams2.addRule(15);
                layoutParams2.topMargin = AbstractC23222t7.f112580q;
                int i11 = AbstractC23222t7.f112586t;
                layoutParams2.leftMargin = i11;
                layoutParams2.rightMargin = i11;
                relativeLayout.addView(imageView, layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(0, AbstractC6918a0.landing_page_oversize_video_icon_crop);
                layoutParams3.addRule(15);
                relativeLayout.addView(robotoTextView, layoutParams3);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.topMargin = AbstractC32226c.m155411j(LandingPageView.this.m92676n2()).top + AbstractC23222t7.f112539R;
                viewGroup.addView(relativeLayout, layoutParams4);
                VideoItem videoItem = (VideoItem) mediaItem;
                C27373c c27373c = (C27373c) videoItem.m41217x1();
                if (videoItem.m41205A1()) {
                    AbstractC23136l9.m118744r1(relativeLayout, 0);
                    LandingPageView.this.m71545GP(c27373c, robotoTextView);
                } else {
                    AbstractC23136l9.m118744r1(relativeLayout, 8);
                }
            }
        }

        /* renamed from: E */
        private LandingPhotoView.InterfaceC12748z m71719E() {
            return new a();
        }

        /* renamed from: F */
        private ViewOnTouchListenerC9043a.i m71720F() {
            return new b();
        }

        /* renamed from: G */
        public /* synthetic */ void m71721G(View view) {
            InterfaceC12716o interfaceC12716o = this.f66221s;
            if (interfaceC12716o != null) {
                interfaceC12716o.mo71748a();
            }
        }

        /* renamed from: H */
        public /* synthetic */ void m71722H(View view, float f11, float f12) {
            InterfaceC12716o interfaceC12716o = this.f66221s;
            if (interfaceC12716o != null) {
                interfaceC12716o.mo71748a();
            }
        }

        /* renamed from: I */
        public /* synthetic */ void m71723I(MediaItem mediaItem, Bitmap bitmap) {
            LandingPageView.this.m71553IP(mediaItem, bitmap);
        }

        /* renamed from: J */
        public /* synthetic */ void m71724J(MediaItem mediaItem, Bitmap bitmap) {
            LandingPageView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.i

                /* renamed from: q */
                public final /* synthetic */ MediaItem f66370q;

                /* renamed from: r */
                public final /* synthetic */ Bitmap f66371r;

                public /* synthetic */ RunnableC12760i(MediaItem mediaItem2, Bitmap bitmap2) {
                    r2 = mediaItem2;
                    r3 = bitmap2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LandingPageView.C12715n.this.m71723I(r2, r3);
                }
            });
        }

        /* renamed from: K */
        public /* synthetic */ void m71725K(View view) {
            InterfaceC12716o interfaceC12716o = this.f66221s;
            if (interfaceC12716o != null) {
                interfaceC12716o.mo71748a();
            }
        }

        /* renamed from: L */
        public /* synthetic */ void m71726L(View view, float f11, float f12) {
            InterfaceC12716o interfaceC12716o = this.f66221s;
            if (interfaceC12716o != null) {
                interfaceC12716o.mo71748a();
            }
        }

        /* renamed from: M */
        public /* synthetic */ void m71727M(MediaItem mediaItem, Bitmap bitmap) {
            LandingPageView.this.m71553IP(mediaItem, bitmap);
        }

        /* renamed from: N */
        private View m71728N(boolean z11) {
            int i11;
            Context context = LandingPageView.this.f66128O0.getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setLayoutParams(layoutParams);
            RecyclingImageView recyclingImageView = new RecyclingImageView(context);
            recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            recyclingImageView.setImageResource(AbstractC16803z.icn_viewfull_broken_image);
            linearLayout.addView(recyclingImageView, -2, -2);
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setTextSize(1, 16.0f);
            robotoTextView.setFontStyle(5);
            if (z11) {
                i11 = AbstractC8020f0.str_media_grid_error_video;
            } else {
                i11 = AbstractC8020f0.str_media_grid_error_photo_gif;
            }
            robotoTextView.setText(AbstractC23136l9.m118743r0(i11));
            robotoTextView.setTextColor(-1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = AbstractC23222t7.f112566j;
            linearLayout.addView(robotoTextView, layoutParams2);
            return linearLayout;
        }

        /* renamed from: O */
        private View m71729O(MediaItem mediaItem, int i11) {
            LandingGifView landingGifView = new LandingGifView(LandingPageView.this.getContext());
            ZSimpleGIFView simpleGIFView = landingGifView.getSimpleGIFView();
            simpleGIFView.m88227l(new ZSimpleGIFView.C16554f(mediaItem.mo41081Q(), mediaItem.mo41083a0(), mediaItem.m41144g0(), mediaItem.m41137b0(), "LandingPageView"), i11, null);
            simpleGIFView.m88224g(100L);
            landingGifView.setTag(mediaItem);
            landingGifView.setScrollingAwayListener(m71720F());
            return landingGifView;
        }

        /* renamed from: P */
        View m71734P(MediaItem mediaItem) {
            Context context = LandingPageView.this.f66128O0.getContext();
            int i11 = LandingPageView.this.f66118G1;
            LandingPageView landingPageView = LandingPageView.this;
            LandingPhotoView landingPhotoView = new LandingPhotoView(context, i11, landingPageView.f72421L0, landingPageView.f66179n2);
            landingPhotoView.setTag(mediaItem);
            try {
                landingPhotoView.setLandingPhotoViewListener(m71719E());
                landingPhotoView.setOnScrollingAwayListener(m71720F());
                landingPhotoView.setMediaItem(mediaItem);
                PhotoView photoView = landingPhotoView.getPhotoView();
                photoView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.picker.landingpage.f
                    public /* synthetic */ ViewOnClickListenerC12757f() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LandingPageView.C12715n.this.m71721G(view);
                    }
                });
                photoView.setOnPhotoTapListener(new ViewOnTouchListenerC9043a.g() { // from class: com.zing.zalo.ui.picker.landingpage.g
                    public /* synthetic */ C12758g() {
                    }

                    @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.g
                    /* renamed from: a */
                    public final void mo48408a(View view, float f11, float f12) {
                        LandingPageView.C12715n.this.m71722H(view, f11, f12);
                    }
                });
                landingPhotoView.m71896C1(mediaItem, LandingPageView.f66111v2, new LandingPhotoView.InterfaceC12722a0() { // from class: com.zing.zalo.ui.picker.landingpage.h

                    /* renamed from: b */
                    public final /* synthetic */ MediaItem f66368b;

                    public /* synthetic */ C12759h(MediaItem mediaItem2) {
                        r2 = mediaItem2;
                    }

                    @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12722a0
                    /* renamed from: a */
                    public final void mo71909a(Bitmap bitmap) {
                        LandingPageView.C12715n.this.m71724J(r2, bitmap);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            return landingPhotoView;
        }

        /* renamed from: Q */
        View m71735Q(MediaItem mediaItem) {
            LandingVideoView landingVideoView = new LandingVideoView(LandingPageView.this.m92689tK());
            landingVideoView.setTag(mediaItem);
            try {
                PhotoView photoView = landingVideoView.getPhotoView();
                photoView.setId(AbstractC6918a0.landing_page_photo_view);
                ViewOnTouchListenerC9043a photoViewAttacher = photoView.getPhotoViewAttacher();
                if (photoViewAttacher != null) {
                    photoViewAttacher.m48370b0(m71720F());
                }
                photoView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.picker.landingpage.c
                    public /* synthetic */ ViewOnClickListenerC12754c() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LandingPageView.C12715n.this.m71725K(view);
                    }
                });
                photoView.setOnPhotoTapListener(new ViewOnTouchListenerC9043a.g() { // from class: com.zing.zalo.ui.picker.landingpage.d
                    public /* synthetic */ C12755d() {
                    }

                    @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.g
                    /* renamed from: a */
                    public final void mo48408a(View view, float f11, float f12) {
                        LandingPageView.C12715n.this.m71726L(view, f11, f12);
                    }
                });
                landingVideoView.m71920c(mediaItem, LandingPageView.f66111v2, new LandingVideoView.InterfaceC12751c() { // from class: com.zing.zalo.ui.picker.landingpage.e

                    /* renamed from: b */
                    public final /* synthetic */ MediaItem f66364b;

                    public /* synthetic */ C12756e(MediaItem mediaItem2) {
                        r2 = mediaItem2;
                    }

                    @Override // com.zing.zalo.p077ui.picker.landingpage.LandingVideoView.InterfaceC12751c
                    /* renamed from: a */
                    public final void mo71921a(Bitmap bitmap) {
                        LandingPageView.C12715n.this.m71727M(r2, bitmap);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            m71718D(landingVideoView, mediaItem2);
            return landingVideoView;
        }

        /* renamed from: R */
        void m71736R(InterfaceC12716o interfaceC12716o) {
            this.f66221s = interfaceC12716o;
        }

        /* renamed from: S */
        void m71737S(List list) {
            this.f66220r = new ArrayList(list);
            mo35341m();
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: d */
        public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
            try {
                viewGroup.removeView((View) obj);
                if (i11 == LandingPageView.this.f66123L1) {
                    ((CommonZaloview) LandingPageView.this).f72827B0.removeCallbacks(LandingPageView.this.f66191t2);
                    ((CommonZaloview) LandingPageView.this).f72827B0.postDelayed(LandingPageView.this.f66191t2, 100L);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: g */
        public int mo35335g() {
            List list = this.f66220r;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: h */
        public int mo35336h(Object obj) {
            int indexOf = this.f66220r.indexOf((MediaItem) ((View) obj).getTag());
            if (indexOf < 0) {
                return -2;
            }
            return indexOf;
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: k */
        public Object mo35339k(ViewGroup viewGroup, int i11) {
            View m71734P;
            MediaItem mediaItem = (MediaItem) this.f66220r.get(i11);
            if (mediaItem.m41168r0() != null && !mediaItem.m41168r0().get()) {
                m71734P = m71728N(mediaItem instanceof VideoItem);
            } else if (mediaItem.m41163p0()) {
                m71734P = m71729O(mediaItem, i11);
            } else if (mediaItem instanceof VideoItem) {
                m71734P = m71735Q(mediaItem);
            } else {
                m71734P = m71734P(mediaItem);
            }
            viewGroup.addView(m71734P, 0);
            return m71734P;
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: l */
        public boolean mo35340l(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$o */
    /* loaded from: classes6.dex */
    public interface InterfaceC12716o {
        /* renamed from: a */
        void mo71748a();
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$p */
    /* loaded from: classes6.dex */
    public interface InterfaceC12717p {
        /* renamed from: a */
        void mo71313a(C3979l c3979l);

        /* renamed from: b */
        void mo71314b(SparseIntArray sparseIntArray);

        /* renamed from: c */
        void mo71315c(int i11);

        /* renamed from: d */
        void mo71316d(int i11);

        /* renamed from: e */
        void mo71317e();
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$q */
    /* loaded from: classes6.dex */
    public interface InterfaceC12718q {
        /* renamed from: a */
        void mo71513a(int i11, boolean z11, List list, List list2);
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$r */
    /* loaded from: classes6.dex */
    public interface InterfaceC12719r {
        /* renamed from: a */
        void mo71514a(boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPageView$s */
    /* loaded from: classes6.dex */
    public interface InterfaceC12720s {
        /* renamed from: a */
        void mo71515a(List list, List list2);
    }

    public LandingPageView() {
    }

    /* renamed from: AN */
    private void m71520AN() {
        String str;
        for (int i11 = 0; i11 < this.f66114C1.size(); i11++) {
            try {
                MediaItem mediaItem = (MediaItem) this.f66114C1.get(i11);
                if (!mediaItem.m41173u0() && m71612cO(mediaItem)) {
                    this.f66115D1.add(mediaItem);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        if (this.f66118G1 == 11) {
            return;
        }
        Iterator it = this.f66116E1.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem2 = (MediaItem) it.next();
            if (!mediaItem2.m41174v0()) {
                File m123603i = this.f66130P0.m123603i(mediaItem2.mo41083a0());
                if (m123603i != null) {
                    str = m123603i.getAbsolutePath();
                } else {
                    str = "";
                }
                mediaItem2.m41153k1(str);
                if (!mediaItem2.m41159n0()) {
                    this.f66116E1.remove(mediaItem2);
                }
            }
            mediaItem2.f42962h0 = 0;
        }
    }

    /* renamed from: AO */
    private void m71521AO(boolean z11) {
        if (z11) {
            m71660pP();
        } else {
            m71585TN();
        }
        this.f72827B0.postDelayed(new Runnable() { // from class: j90.d
            public /* synthetic */ RunnableC21105d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71636jO();
            }
        }, 150L);
    }

    /* renamed from: AP */
    private void m71522AP() {
    }

    /* renamed from: BN */
    private View m71524BN(MediaItem mediaItem) {
        return this.f66134R0.findViewWithTag(mediaItem);
    }

    /* renamed from: BO */
    private void m71525BO() {
        m71580RO(3);
    }

    /* renamed from: BP */
    private void m71526BP(String str) {
        if (this.f88760a0 != null) {
            if (TextUtils.isEmpty(str)) {
                this.f88760a0.setSubtitle(null);
            } else {
                this.f88760a0.setSubtitle(str);
            }
        }
    }

    /* renamed from: CN */
    private PhotoView m71528CN(MediaItem mediaItem) {
        try {
            return (PhotoView) this.f66134R0.findViewWithTag(mediaItem).findViewById(AbstractC6918a0.landing_page_photo_view);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: CO */
    private void m71529CO() {
        m71580RO(2);
    }

    /* renamed from: CP */
    private void m71530CP() {
        boolean z11;
        try {
            int m71559KN = m71559KN();
            if (m71559KN > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && AbstractC23280z4.m120327g(this.f66118G1, 15, 4, 11)) {
                this.f66197z1.setEnabled(false);
                this.f66195x1.setEnabled(false);
                RecyclingImageView recyclingImageView = this.f66195x1;
                recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.ic_fab_editor_done_disable));
                this.f66197z1.setAlpha(0.5f);
            } else {
                this.f66197z1.setEnabled(true);
                this.f66195x1.setEnabled(true);
                RecyclingImageView recyclingImageView2 = this.f66195x1;
                recyclingImageView2.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView2.getContext(), AbstractC16803z.ic_fab_editor_done));
                this.f66197z1.setAlpha(1.0f);
            }
            this.f66194w1.setText(m92652XI(AbstractC8020f0.landing_page_text_selected));
            if (z11) {
                AbstractC23136l9.m118744r1(this.f66112A1, 0);
                this.f66112A1.setText(String.valueOf(m71559KN));
            } else {
                AbstractC23136l9.m118744r1(this.f66112A1, 8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: DN */
    private C3979l m71532DN(MediaItem mediaItem) {
        return this.f66130P0.m123606l(AbstractC23280z4.m120364z(mediaItem), f66111v2.f116260a, true, C23278z2.m120110a());
    }

    /* renamed from: DO */
    private void m71533DO() {
        if (m71615dO()) {
            AbstractC23647d.m123897g("122003");
        }
        m71568NN();
        m71690xP("editor_viewfull_close", m71543GN());
    }

    /* renamed from: DP */
    private void m71534DP() {
        Iterator it = this.f66116E1.iterator();
        while (it.hasNext()) {
            ((MediaItem) it.next()).m41116O0(this.f66137S1);
        }
        InterfaceC12719r interfaceC12719r = this.f66173k2;
        if (interfaceC12719r != null) {
            interfaceC12719r.mo71514a(this.f66137S1);
        }
    }

    /* renamed from: EO */
    private void m71536EO() {
        m71568NN();
        m71690xP("filter_back_notclear", null);
    }

    /* renamed from: EP */
    public void m71537EP(boolean z11) {
        try {
            AnimatorSet animatorSet = this.f66185q2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f66185q2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.f66162f1, "alpha", 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f66164g1, "alpha", 0.0f, 1.0f));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.f66162f1, "alpha", 0.0f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f66164g1, "alpha", 1.0f, 0.0f));
            }
            animatorSet2.playTogether(arrayList);
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(new LinearInterpolator());
            animatorSet2.addListener(new C12705d(z11));
            this.f66185q2 = animatorSet2;
            animatorSet2.start();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: FN */
    private C3979l m71539FN() {
        String m41113N;
        String mo41083a0;
        MediaItem m71543GN = m71543GN();
        C3979l c3979l = null;
        if (m71543GN == null || AbstractC23171p0.m119371c() || AbstractC23136l9.m118654H0(m92648SI())) {
            return null;
        }
        if (TextUtils.isEmpty(m71543GN.m41113N())) {
            m41113N = m71543GN.mo41081Q();
        } else {
            m41113N = m71543GN.m41113N();
        }
        if (!TextUtils.isEmpty(m41113N)) {
            c3979l = C23999j.m125676A2(m41113N, AbstractC23006a0.m117875E(), C23278z2.m120110a());
        }
        if (c3979l == null && !TextUtils.isEmpty(m71543GN.mo41083a0())) {
            c3979l = m71532DN(m71543GN);
        }
        if (c3979l == null) {
            if (!TextUtils.isEmpty(m71543GN.m41113N())) {
                mo41083a0 = m71543GN.m41113N();
            } else {
                mo41083a0 = m71543GN.mo41083a0();
            }
            return AbstractC20826v0.m108841w(mo41083a0, Integer.valueOf(AbstractC23006a0.m117875E()), Integer.valueOf(C23278z2.m120136k0().f116260a), Integer.valueOf(AbstractC23006a0.m117871A()), Integer.valueOf(AbstractC23006a0.m117873C()), Integer.valueOf(AbstractC23006a0.m117928x()));
        }
        return c3979l;
    }

    /* renamed from: FO */
    private void m71540FO() {
        if (this.f66190t1.isChecked()) {
            AbstractC23280z4.m120317b(this);
            m71696zN();
        } else {
            m71601YO();
        }
        m71690xP("editor_viewfull_hd", null);
    }

    /* renamed from: FP */
    private void m71541FP(int i11, boolean z11) {
        MediaItem mediaItem;
        boolean z12;
        try {
            RelativeLayout relativeLayout = (RelativeLayout) this.f66134R0.getChildAt(i11).findViewById(AbstractC6918a0.landing_page_oversize_video_popup);
            ArrayList arrayList = this.f66114C1;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                mediaItem = (MediaItem) this.f66114C1.get(i11);
            } else {
                mediaItem = null;
            }
            if ((mediaItem instanceof VideoItem) && relativeLayout != null) {
                VideoItem videoItem = (VideoItem) mediaItem;
                if (videoItem.m41218y1()) {
                    int i12 = 0;
                    if (!videoItem.m41219z1() && !videoItem.m41205A1()) {
                        z12 = false;
                        if (z11 || !z12) {
                            i12 = 4;
                        }
                        AbstractC23136l9.m118744r1(relativeLayout, i12);
                    }
                    z12 = true;
                    if (z11) {
                    }
                    i12 = 4;
                    AbstractC23136l9.m118744r1(relativeLayout, i12);
                }
                if (videoItem.m41205A1()) {
                    m71545GP((C27373c) videoItem.m41217x1(), (RobotoTextView) relativeLayout.findViewById(AbstractC6918a0.landing_page_oversize_video_text));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    /* renamed from: GN */
    public MediaItem m71543GN() {
        int i11;
        ArrayList arrayList = this.f66114C1;
        if (arrayList != null && (i11 = this.f66121J1) >= 0 && i11 < arrayList.size()) {
            return (MediaItem) this.f66114C1.get(this.f66121J1);
        }
        return null;
    }

    /* renamed from: GO */
    private void m71544GO() {
        MediaItem m71543GN = m71543GN();
        if (!m92672lJ() || m71543GN == null) {
            return;
        }
        if (m71543GN.m41163p0() && (this.f66119H1 != EnumC22962a.f111694r || this.f66118G1 == 19)) {
            ToastUtils.m89273u();
            this.f66193v1.setChecked(false);
        } else {
            m71586TO(m71543GN, new Runnable() { // from class: j90.t
                public /* synthetic */ RunnableC21137t() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LandingPageView.this.m71569NO();
                }
            }, true);
        }
    }

    /* renamed from: GP */
    public void m71545GP(C27373c c27373c, RobotoTextView robotoTextView) {
        if (c27373c != null && robotoTextView != null) {
            try {
                double floor = Math.floor(c27373c.f128947T.f48264P / 1000.0f);
                VideoBlendingParam videoBlendingParam = c27373c.f128947T;
                robotoTextView.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_landing_page_trimmed_video), AbstractC23160o0.m119258i0(floor), AbstractC23160o0.m119258i0(Math.floor((videoBlendingParam.f48264P + videoBlendingParam.f48265Q) / 1000.0f))));
            } catch (Exception e11) {
                AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
            }
        }
    }

    /* renamed from: HN */
    private void m71547HN() {
        int i11;
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f66120I1 = m92642L3.getInt("extra_initialize_index", 0);
                this.f66118G1 = m92642L3.getInt("extra_photo_type", -1);
                EnumC22962a enumC22962a = (EnumC22962a) m92642L3.get("extra_media_picker_source");
                this.f66119H1 = enumC22962a;
                if (enumC22962a == null) {
                    this.f66119H1 = EnumC22962a.f111694r;
                }
                this.f66137S1 = m92642L3.getBoolean("extra_is_hd", false);
                this.f66129O1 = m92642L3.getString("extra_chat_name_to", "");
                this.f66131P1 = m92642L3.getString("extra_chat_uid_to", "");
                this.f66125M1 = m92642L3.getInt("extra_num_external_photos", 0);
                this.f66133Q1 = m92642L3.getString("extra_current_bucket_name", "");
                ArrayList arrayList = this.f66114C1;
                if (arrayList == null || (i11 = this.f66120I1) < 0 || i11 >= arrayList.size()) {
                    this.f66120I1 = 0;
                }
                this.f66161e2 = m92642L3.getInt("extra_view_mode", 0);
                this.f66163f2 = m92642L3.getString("extra_msg_show_snack_bar", "");
                this.f66165g2 = m92642L3.getString("extra_param_log_video_over_size", "");
                this.f66167h2 = m92642L3.getString("source_start_view", "");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: HO */
    public void m71548HO() {
        try {
            if (m71559KN() == 0) {
                m71574PO();
            } else {
                m71571OO();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: HP */
    private void m71549HP() {
        int i11;
        if (this.f66118G1 == 24) {
            int size = this.f66114C1.size();
            if (size > 0 && (i11 = this.f66121J1) >= 0 && i11 < size) {
                m71526BP((i11 + 1) + "/" + size);
                return;
            }
            m71526BP("");
            return;
        }
        m71526BP("");
    }

    /* renamed from: IN */
    private CharSequence m71551IN() {
        if (this.f66118G1 == 19) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.f43864xc9a48aa9);
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_landing_page_description_input_text_hint);
        int indexOf = m118743r0.indexOf("%s");
        if (indexOf >= 0) {
            SpannableString spannableString = new SpannableString(String.format(m118743r0, this.f66129O1));
            spannableString.setSpan(new StyleSpan(1), indexOf, this.f66129O1.length() + indexOf, 33);
            return spannableString;
        }
        return m118743r0;
    }

    /* renamed from: IO */
    private void m71552IO(int i11) {
        MediaItem m71543GN = m71543GN();
        if (m71543GN == null) {
            return;
        }
        m71586TO(m71543GN, new Runnable() { // from class: j90.r

            /* renamed from: q */
            public final /* synthetic */ int f103205q;

            public /* synthetic */ RunnableC21133r(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71651nO(r2);
            }
        }, false);
    }

    /* renamed from: IP */
    public void m71553IP(MediaItem mediaItem, Bitmap bitmap) {
        int m120299K;
        if (bitmap != null) {
            try {
                mediaItem.m41155l1(bitmap.getWidth());
                mediaItem.m41151j1(bitmap.getHeight());
            } catch (Exception e11) {
                AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
                return;
            }
        }
        if (this.f66178n1 != null && (m120299K = AbstractC23280z4.m120299K(this.f66116E1, mediaItem)) >= 0) {
            if (!this.f66174l1.m9861V0() && this.f66174l1.getScrollState() == 0) {
                this.f66178n1.m10009q(m120299K);
                return;
            }
            this.f66174l1.post(new Runnable() { // from class: j90.g

                /* renamed from: q */
                public final /* synthetic */ int f103175q;

                public /* synthetic */ RunnableC21111g(int m120299K2) {
                    r2 = m120299K2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LandingPageView.this.m71693yO(r2);
                }
            });
        }
    }

    /* renamed from: JN */
    public MediaItem m71555JN(int i11) {
        ArrayList arrayList = this.f66114C1;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (MediaItem) this.f66114C1.get(i11);
        }
        return null;
    }

    /* renamed from: JO */
    private void m71556JO() {
        int i11;
        if (!this.f66159d2) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        m71580RO(i11);
    }

    /* renamed from: JP */
    private void m71557JP(MediaItem mediaItem, Runnable runnable) {
        if (this.f66149Y1 || mediaItem == null) {
            return;
        }
        this.f66149Y1 = true;
        if (!TextUtils.isEmpty(mediaItem.mo41081Q()) && (mediaItem.mo41081Q().startsWith("http") || mediaItem.mo41081Q().startsWith("https"))) {
            mediaItem.m41133Y0(new AtomicBoolean(true));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AbstractC23258x2.m119964w(mediaItem.mo41081Q(), new C12714m(mediaItem, runnable));
    }

    /* renamed from: KN */
    private int m71559KN() {
        int i11 = this.f66125M1;
        Iterator it = this.f66116E1.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (m71619eO(mediaItem) && mediaItem.m41173u0()) {
                i11++;
            }
        }
        Iterator it2 = this.f66114C1.iterator();
        while (it2.hasNext()) {
            if (((MediaItem) it2.next()).m41173u0()) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: KO */
    private void m71560KO() {
        m71580RO(4);
    }

    /* renamed from: KP */
    public void m71561KP() {
        int i11;
        try {
            m71656oP();
            int i12 = this.f66121J1;
            int i13 = this.f66123L1;
            if (i12 != i13) {
                this.f66122K1 = i13;
                this.f66123L1 = i12;
                View m71524BN = m71524BN(m71543GN());
                if (m71524BN instanceof LandingPhotoView) {
                    ((LandingPhotoView) m71524BN).m71897D1();
                }
                ArrayList arrayList = this.f66114C1;
                if (arrayList != null && (i11 = this.f66122K1) >= 0 && i11 < arrayList.size()) {
                    View m71524BN2 = m71524BN((MediaItem) this.f66114C1.get(this.f66122K1));
                    if (m71524BN2 instanceof LandingPhotoView) {
                        ((LandingPhotoView) m71524BN2).m71898E1(new C12708g());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: LN */
    private MediaItem m71563LN(String str) {
        try {
            Iterator it = this.f66114C1.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (mediaItem != null && mediaItem.mo41081Q().equals(str)) {
                    return mediaItem;
                }
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: MN */
    private int m71565MN() {
        View view = this.f66170j1;
        if (view != null && view.getHeight() > 0) {
            return this.f66170j1.getHeight();
        }
        return this.f66124M0;
    }

    /* renamed from: MO */
    public void m71566MO(int i11) {
        try {
            this.f66121J1 = i11;
            m71680vN();
            m71549HP();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: NN */
    private void m71568NN() {
        if (m71606aO()) {
            m71580RO(0);
        } else {
            m71688xN(new C12713l());
        }
    }

    /* renamed from: NO */
    public void m71569NO() {
        int m3769e3;
        int m120299K;
        int i11;
        try {
            AbstractC23647d.m123897g("9171301");
            MediaItem m71543GN = m71543GN();
            if (m71543GN != null) {
                int m71559KN = m71559KN();
                int i12 = this.f66118G1;
                if (i12 == 19) {
                    m3769e3 = AbstractC0924m0.m4306w3();
                } else if (i12 == 11) {
                    m3769e3 = 20;
                } else if (AbstractC23280z4.m120327g(i12, 3, 18, 16, 24)) {
                    m3769e3 = AbstractC0924m0.m4306w3();
                } else {
                    m3769e3 = AbstractC0924m0.m3769e3();
                }
                if (m71559KN >= m3769e3 && !m71543GN.m41173u0()) {
                    if (this.f66118G1 == 16) {
                        i11 = AbstractC8020f0.str_upload_photo_video_reach_limit;
                    } else {
                        i11 = AbstractC8020f0.str_uploadphoto_reachlimit;
                    }
                    ToastUtils.showMess(String.format(m92652XI(i11), Integer.valueOf(m3769e3)));
                    CheckCircle checkCircle = this.f66193v1;
                    if (checkCircle != null) {
                        checkCircle.setChecked(false);
                        return;
                    }
                    return;
                }
                m71543GN.m41140d1(!m71543GN.m41173u0());
                if (m71543GN.m41173u0()) {
                    m71543GN.m41139c1(EnumC21281b.f103713t);
                }
                m71680vN();
                m71549HP();
                boolean m41173u0 = m71543GN.m41173u0();
                if (m41173u0) {
                    m71543GN.m41116O0(this.f66137S1);
                    m71543GN.m41142e1(this.f66133Q1);
                    this.f66116E1.add(m71543GN);
                    SparseIntArray sparseIntArray = this.f66117F1;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(this.f66121J1, this.f66116E1.size() - 1);
                    }
                    m120299K = -1;
                } else {
                    if (!m71615dO()) {
                        m71543GN.m41116O0(false);
                    }
                    m71543GN.m41142e1("");
                    m120299K = AbstractC23280z4.m120299K(this.f66116E1, m71543GN);
                    Iterator it = this.f66116E1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((MediaItem) it.next()).mo41081Q().equals(m71543GN.mo41081Q())) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!this.f66147X1) {
                        AbstractC23647d.m123897g("918001");
                    }
                    SparseIntArray sparseIntArray2 = this.f66117F1;
                    if (sparseIntArray2 != null) {
                        int i13 = sparseIntArray2.get(this.f66121J1);
                        for (int i14 = 0; i14 < this.f66117F1.size(); i14++) {
                            int valueAt = this.f66117F1.valueAt(i14);
                            if (valueAt > i13) {
                                this.f66117F1.put(i14, valueAt - 1);
                            }
                        }
                        this.f66117F1.put(this.f66121J1, -1);
                    }
                }
                m71530CP();
                if (m71603ZN()) {
                    m71594WN();
                }
                m71682vP();
                if (this.f66174l1 != null) {
                    if (m41173u0) {
                        this.f66178n1.m36725M(m71543GN);
                        if (this.f66174l1.isShown() && this.f66116E1.size() > 1) {
                            this.f66187r2.sendEmptyMessage(2);
                        }
                    } else {
                        this.f66178n1.m36728R(m71543GN);
                        if (this.f66174l1.isShown() && m120299K != -1) {
                            this.f66178n1.m10017y(m120299K);
                        }
                    }
                }
                if ((m71543GN instanceof VideoItem) && ((VideoItem) m71543GN).m41217x1() == null) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j90.f
                        public /* synthetic */ RunnableC21109f() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LandingPageView.m71667rO(MediaItem.this);
                        }
                    });
                }
                m71690xP("editor_viewfull_select", null);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: OO */
    private void m71571OO() {
        boolean z11 = false;
        if (this.f66161e2 != 1 && (!this.f66137S1 || !AbstractC23309i.m121048If())) {
            this.f66137S1 = false;
        }
        m71640kP(-1);
        if (this.f66119H1 == EnumC22962a.f111694r) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f66116E1.size(); i11++) {
                Object obj = this.f66116E1.get(i11);
                if (obj instanceof VideoItem) {
                    VideoItem videoItem = (VideoItem) obj;
                    if (videoItem.m41205A1()) {
                        arrayList.add(C2526d.m12656d((C27373c) videoItem.m41217x1(), this.f66137S1 ? 1 : 0));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                String str = this.f66131P1;
                if (this.f66161e2 == 1) {
                    z11 = true;
                }
                C2526d.m12650C(str, arrayList, z11, this.f66167h2);
            }
        }
    }

    /* renamed from: PN */
    private void m71573PN() {
        if (m71606aO()) {
            m71580RO(0);
        } else {
            m71688xN(new C12712k());
        }
    }

    /* renamed from: PO */
    private void m71574PO() {
        MediaItem m71543GN;
        if (!AbstractC23280z4.m120327g(this.f66118G1, 3, 16, 10, 19, 24) || (m71543GN = m71543GN()) == null) {
            return;
        }
        m71586TO(m71543GN, new Runnable() { // from class: j90.h

            /* renamed from: q */
            public final /* synthetic */ MediaItem f103178q;

            public /* synthetic */ RunnableC21113h(MediaItem m71543GN2) {
                r2 = m71543GN2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71670sO(r2);
            }
        }, true);
    }

    /* renamed from: QN */
    private void m71576QN(int i11, int i12, Intent intent) {
        boolean z11;
        View m71524BN;
        boolean z12 = true;
        try {
            this.f66143V1 = true;
            String str = null;
            this.f66135R1 = null;
            if (i12 == -1 && intent != null) {
                if (i11 == 2001) {
                    String stringExtra = intent.getStringExtra("extra_result_output_path");
                    if (intent.hasExtra("extra_result_original_path")) {
                        str = intent.getStringExtra("extra_result_original_path");
                    }
                    boolean z13 = !TextUtils.isEmpty(stringExtra);
                    MediaItem m71563LN = m71563LN(str);
                    if (m71563LN != null) {
                        m71563LN.m41099E0(intent.getStringExtra("extra_result_camera_log"));
                        m71563LN.m41101G0(intent.getStringExtra("extra_result_decor_data"));
                        if (z13) {
                            if (!TextUtils.equals(stringExtra, m71563LN.m41113N())) {
                                m71692yN(m71563LN);
                                m71563LN.m41124T0(stringExtra);
                                if (m71615dO()) {
                                    if (this.f66177m2 == null) {
                                        this.f66177m2 = new C3977j(getContext());
                                    }
                                    ((C23528a) this.f66130P0.m123612r(this.f66177m2)).m123618x(stringExtra, C23278z2.m120065D0());
                                }
                                InterfaceC12717p interfaceC12717p = this.f66169i2;
                                if (interfaceC12717p != null) {
                                    interfaceC12717p.mo71316d(this.f66121J1);
                                }
                            }
                        } else {
                            m71692yN(m71563LN);
                        }
                        m71589UO();
                        m71680vN();
                        m71549HP();
                        PhotoView m71528CN = m71528CN(m71563LN);
                        if (m71528CN != null) {
                            m71697zO(m71528CN, m71563LN);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i11 == 2002) {
                    C27373c c27373c = (C27373c) intent.getSerializableExtra("EXTRA_VIDEO_INFO");
                    if (intent.hasExtra("extra_result_original_path")) {
                        str = intent.getStringExtra("extra_result_original_path");
                    }
                    if (c27373c != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    MediaItem m71563LN2 = m71563LN(str);
                    if (m71563LN2 instanceof VideoItem) {
                        VideoItem videoItem = (VideoItem) m71563LN2;
                        videoItem.m41099E0(intent.getStringExtra("extra_result_video_log"));
                        videoItem.m41211G1(c27373c);
                        videoItem.m41101G0(intent.getStringExtra("extra_result_decor_data"));
                        if (AbstractC26689j.f126436b && c27373c != null) {
                            VideoBlendingParam videoBlendingParam = c27373c.f128947T;
                            if (videoBlendingParam.f48264P == 0 && videoBlendingParam.f48265Q == 0) {
                                z12 = false;
                            }
                            videoItem.m41210F1(z12);
                            if (videoItem.m41205A1() && (m71524BN = m71524BN(m71563LN2)) != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) m71524BN.findViewById(AbstractC6918a0.landing_page_oversize_video_popup);
                                RobotoTextView robotoTextView = (RobotoTextView) m71524BN.findViewById(AbstractC6918a0.landing_page_oversize_video_text);
                                if (relativeLayout != null) {
                                    AbstractC23136l9.m118744r1(relativeLayout, 0);
                                }
                                m71545GP(c27373c, robotoTextView);
                            }
                        }
                        if (z11) {
                            if (!TextUtils.equals(c27373c.m140268v(), videoItem.m41214u1())) {
                                m71692yN(m71563LN2);
                                videoItem.m41208D1(c27373c.m140268v());
                                InterfaceC12717p interfaceC12717p2 = this.f66169i2;
                                if (interfaceC12717p2 != null) {
                                    interfaceC12717p2.mo71316d(this.f66121J1);
                                }
                                if (this.f66175l2 != null) {
                                    ArrayList arrayList = new ArrayList(this.f66116E1);
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(videoItem);
                                    this.f66175l2.mo71515a(arrayList, arrayList2);
                                }
                            }
                        } else {
                            m71692yN(m71563LN2);
                        }
                        m71589UO();
                        m71680vN();
                        m71549HP();
                        PhotoView m71528CN2 = m71528CN(m71563LN2);
                        if (m71528CN2 != null) {
                            m71697zO(m71528CN2, m71563LN2);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: QO */
    private void m71577QO() {
        m71580RO(1);
    }

    /* renamed from: RN */
    public void m71579RN() {
        this.f66141U1 = false;
        this.f66139T1 = true;
        m71568NN();
        m71690xP("editor_viewfull_scrolldown", m71543GN());
    }

    /* renamed from: RO */
    private void m71580RO(int i11) {
        MediaItem m71543GN;
        if (f66110u2) {
            ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
        } else {
            if (this.f66127N1 != 0 || (m71543GN = m71543GN()) == null) {
                return;
            }
            AbstractC17927b.m94533b().mo94527a("ON_CLICK_OPEN_EDITOR_MODE", new Runnable() { // from class: j90.p

                /* renamed from: q */
                public final /* synthetic */ MediaItem f103199q;

                /* renamed from: r */
                public final /* synthetic */ int f103200r;

                public /* synthetic */ RunnableC21129p(MediaItem m71543GN2, int i112) {
                    r2 = m71543GN2;
                    r3 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LandingPageView.this.m71678uO(r2, r3);
                }
            }, 500L);
        }
    }

    /* renamed from: SN */
    public void m71582SN() {
        if (this.f66153a2) {
            this.f66153a2 = false;
            AbstractC23136l9.m118744r1(this.f88760a0, 8);
            m71521AO(this.f66153a2);
        }
    }

    /* renamed from: SO */
    public void m71651nO(int i11) {
        C27373c c27373c;
        VideoBlendingParam videoBlendingParam;
        try {
            MediaItem m71543GN = m71543GN();
            if ((m71543GN instanceof VideoItem) && !TextUtils.isEmpty(m71543GN.mo41081Q()) && !f66110u2) {
                CameraInputParams cameraInputParams = new CameraInputParams();
                cameraInputParams.f41106Y = this.f66121J1;
                cameraInputParams.f41129s = 5;
                if (AbstractC23280z4.m120327g(this.f66118G1, 18, 16)) {
                    cameraInputParams.f41105X = "2";
                    if (AbstractC23280z4.m120327g(this.f66118G1, 16)) {
                        cameraInputParams.f41108a0 = false;
                    }
                    cameraInputParams.f41133u = this.f66137S1 ? 1 : 0;
                } else {
                    cameraInputParams.f41133u = 2;
                }
                if (AbstractC23280z4.m120327g(this.f66118G1, 18, 21)) {
                    cameraInputParams.f41108a0 = false;
                }
                cameraInputParams.f41139x = m71543GN.mo41081Q();
                cameraInputParams.f41141y = m71543GN.mo41083a0();
                cameraInputParams.f41119l0 = new SendInputParams(2);
                cameraInputParams.f41083B = m71543GN.m41177y();
                if (((VideoItem) m71543GN).m41217x1() != null && (videoBlendingParam = (c27373c = (C27373c) ((VideoItem) m71543GN).m41217x1()).f128947T) != null && (videoBlendingParam.f48264P != 0 || videoBlendingParam.f48265Q != 0)) {
                    cameraInputParams.f41082A = c27373c;
                }
                cameraInputParams.f41094M = i11;
                cameraInputParams.f41130s0 = C2526d.f10270a.m12733y(this.f66131P1);
                cameraInputParams.f41128r0 = this.f66167h2;
                if (i11 == 0 && ((VideoItem) m71543GN).m41219z1()) {
                    cameraInputParams.f41094M = 1;
                }
                ZaloCameraView m116167s = AbstractC22470k.m116167s(m92676n2(), ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, 0, cameraInputParams);
                if (m116167s != null) {
                    m116167s.f40833A1 = true;
                    this.f66135R1 = m71543GN;
                    this.f66143V1 = false;
                    return;
                }
                return;
            }
            if (f66110u2) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    /* renamed from: TN */
    private void m71585TN() {
        try {
            if (!this.f66141U1) {
                m71677uN(false);
            } else {
                m71600YN();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    /* renamed from: TO */
    private void m71586TO(MediaItem mediaItem, Runnable runnable, boolean z11) {
        boolean z12 = mediaItem instanceof VideoItem;
        RunnableC21107e runnableC21107e = new Runnable() { // from class: j90.e

            /* renamed from: q */
            public final /* synthetic */ boolean f103167q;

            /* renamed from: r */
            public final /* synthetic */ MediaItem f103168r;

            /* renamed from: s */
            public final /* synthetic */ boolean f103169s;

            /* renamed from: t */
            public final /* synthetic */ Runnable f103170t;

            public /* synthetic */ RunnableC21107e(boolean z122, MediaItem mediaItem2, boolean z112, Runnable runnable2) {
                r2 = z122;
                r3 = mediaItem2;
                r4 = z112;
                r5 = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71681vO(r2, r3, r4, r5);
            }
        };
        if (!z122 && mediaItem2.m41168r0() == null) {
            m71557JP(mediaItem2, runnableC21107e);
        } else {
            runnableC21107e.run();
        }
    }

    /* renamed from: UN */
    private void m71588UN() {
        if (AbstractC23280z4.m120327g(this.f66118G1, 3, 10, 19, 16, 24)) {
            ((ViewGroup) this.f66195x1.getParent()).removeView(this.f66195x1);
        } else {
            ((ViewGroup) this.f66197z1.getParent()).removeView(this.f66197z1);
        }
    }

    /* renamed from: UO */
    private void m71589UO() {
        this.f66136S0.m71737S(new ArrayList(this.f66114C1));
        m71684wN();
    }

    /* renamed from: VN */
    private void m71591VN(List list, List list2) {
        if (list != null) {
            this.f66114C1 = new ArrayList(list);
        } else {
            this.f66114C1 = new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        this.f66116E1 = arrayList;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        SparseIntArray sparseIntArray = this.f66117F1;
        if (sparseIntArray == null) {
            this.f66117F1 = new SparseIntArray();
        } else {
            sparseIntArray.clear();
        }
        for (int i11 = 0; i11 < this.f66114C1.size(); i11++) {
            this.f66117F1.put(i11, i11);
        }
    }

    /* renamed from: VO */
    private void m71592VO() {
    }

    /* renamed from: WN */
    private void m71594WN() {
        if (this.f66174l1 == null) {
            C12709h c12709h = new C12709h();
            FrameLayout frameLayout = (FrameLayout) ((ViewStub) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_stub_slider_preview_photo)).inflate();
            this.f66172k1 = frameLayout;
            this.f66174l1 = (RecyclerView) frameLayout.findViewById(AbstractC6918a0.slider_preview_photos);
            this.f66176m1 = new SmoothScrollLinearLayoutManager(getContext(), 0, false);
            this.f66178n1 = new C7219t7(this.f66130P0, c12709h);
            this.f66176m1.m88005N2(200.0f);
            this.f66176m1.m88006O2(true);
            this.f66174l1.setLayoutManager(this.f66176m1);
            this.f66174l1.setAdapter(this.f66178n1);
            this.f66174l1.setClipToPadding(false);
            C12710i c12710i = new C12710i();
            c12710i.m10694V(false);
            this.f66174l1.setItemAnimator(c12710i);
            this.f66174l1.m9826E(new C12711j());
        }
    }

    /* renamed from: WO */
    private void m71595WO() {
        if (AbstractC26681b.f126358c && m92676n2() != null && !m92676n2().mo35576n3()) {
            AbstractC32226c.b bVar = new AbstractC32226c.b(this.f66170j1);
            bVar.f148631c = true;
            m92682pK(bVar);
        }
    }

    /* renamed from: XN */
    private void m71597XN() {
        boolean z11;
        this.f66138T0 = this.f66132Q0.findViewWithTag(AbstractC23136l9.m118743r0(AbstractC24579d.photo_gallery_background_tag));
        this.f66134R0 = (LandingViewPager) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_pager);
        C12715n c12715n = new C12715n();
        this.f66136S0 = c12715n;
        c12715n.m71736R(new InterfaceC12716o() { // from class: com.zing.zalo.ui.picker.landingpage.a
            public /* synthetic */ C12752a() {
            }

            @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12716o
            /* renamed from: a */
            public final void mo71748a() {
                LandingPageView.this.m71627gO();
            }
        });
        this.f66134R0.setPageMargin(AbstractC23222t7.f112576o);
        this.f66134R0.setAdapter(this.f66136S0);
        this.f66134R0.addOnPageChangeListener(this.f66189s2);
        this.f66170j1 = this.f66132Q0.findViewById(AbstractC6918a0.landing_page_top_panel);
        m71595WO();
        ActiveImageButton activeImageButton = (ActiveImageButton) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_close);
        this.f66162f1 = activeImageButton;
        activeImageButton.setOnClickListener(this);
        ActiveImageButton activeImageButton2 = (ActiveImageButton) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_close_filter);
        this.f66164g1 = activeImageButton2;
        activeImageButton2.setOnClickListener(this);
        this.f66160e1 = this.f66132Q0.findViewById(AbstractC6918a0.landing_page_edit_photo);
        this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_crop).setOnClickListener(this);
        this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_brush).setOnClickListener(this);
        this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_caption).setOnClickListener(this);
        ActiveImageColorButton activeImageColorButton = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_video_crop);
        this.f66150Z0 = activeImageColorButton;
        activeImageColorButton.setCircleColor(Color.parseColor("#EE7F1A"));
        this.f66150Z0.setOnClickListener(this);
        ActiveImageColorButton activeImageColorButton2 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_video_timing);
        this.f66148Y0 = activeImageColorButton2;
        activeImageColorButton2.setCircleColor(Color.parseColor("#FFAA71E7"));
        this.f66154b1 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_document_scanner);
        this.f66156c1 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_photo_crop);
        ActiveImageColorButton activeImageColorButton3 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_doodle);
        this.f66144W0 = activeImageColorButton3;
        activeImageColorButton3.setCircleColor(-1);
        this.f66144W0.setOnClickListener(this);
        ActiveImageColorButton activeImageColorButton4 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_caption);
        this.f66142V0 = activeImageColorButton4;
        activeImageColorButton4.setOnClickListener(this);
        ActiveImageColorButton activeImageColorButton5 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_filter);
        this.f66152a1 = activeImageColorButton5;
        activeImageColorButton5.setCircleColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.Dark_AppPrimaryColor));
        this.f66152a1.setOnClickListener(this);
        ActiveImageColorButton activeImageColorButton6 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_sticker);
        this.f66140U0 = activeImageColorButton6;
        activeImageColorButton6.setOnClickListener(this);
        this.f66146X0 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_location);
        this.f66158d1 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.btn_editor_more);
        this.f66160e1 = this.f66132Q0.findViewById(AbstractC6918a0.landing_page_edit_photo);
        ActiveImageColorButton activeImageColorButton7 = (ActiveImageColorButton) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_filter);
        this.f66166h1 = activeImageColorButton7;
        activeImageColorButton7.setCircleColor(AbstractC23136l9.m118641B(activeImageColorButton7.getContext(), AbstractC16801x.Dark_AppPrimaryColor));
        this.f66166h1.setOnClickListener(this);
        this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_sticker).setOnClickListener(this);
        this.f66182p1 = this.f66132Q0.findViewById(AbstractC6918a0.landing_page_edit_bottom);
        this.f66168i1 = this.f66132Q0.findViewById(AbstractC6918a0.landing_page_photo_gradient_bottom);
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_send);
        this.f66197z1 = recyclingImageView;
        recyclingImageView.setOnClickListener(this);
        RoundedRobotoTextView roundedRobotoTextView = (RoundedRobotoTextView) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_rbt_number_selected_item);
        this.f66112A1 = roundedRobotoTextView;
        roundedRobotoTextView.setRadius(AbstractC23222t7.f112570l);
        RoundedRobotoTextView roundedRobotoTextView2 = this.f66112A1;
        roundedRobotoTextView2.setBackgroundColor(C23212s8.m119607o(roundedRobotoTextView2.getContext(), AbstractC16781w.AppPrimaryColor));
        RecyclingImageView recyclingImageView2 = (RecyclingImageView) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_btn_done);
        this.f66195x1 = recyclingImageView2;
        recyclingImageView2.setOnClickListener(this);
        m71588UN();
        this.f66184q1 = (ViewGroup) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_video_duration_bar);
        this.f66186r1 = (TextView) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_video_duration);
        this.f66188s1 = this.f66132Q0.findViewById(AbstractC6918a0.landing_page_hq_bar);
        CheckCircle checkCircle = (CheckCircle) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_checkbox_hq);
        this.f66190t1 = checkCircle;
        if (AbstractC23309i.m122504vg() && AbstractC23309i.m121048If()) {
            z11 = true;
        } else {
            z11 = false;
        }
        checkCircle.setChecked(z11);
        this.f66190t1.setOnClickListener(this);
        this.f66132Q0.findViewById(AbstractC6918a0.landing_page_tv_hd).setOnClickListener(this);
        this.f66192u1 = (RelativeLayout) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_selection_bar);
        RobotoTextView robotoTextView = (RobotoTextView) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_tv_select);
        this.f66194w1 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        CheckCircle checkCircle2 = (CheckCircle) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_checkbox_select);
        this.f66193v1 = checkCircle2;
        checkCircle2.setOnClickListener(this);
        this.f66193v1.setVisibility(0);
        this.f66196y1 = (FrameLayout) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_layout_send);
        DescriptionInputTextView descriptionInputTextView = (DescriptionInputTextView) this.f66132Q0.findViewById(AbstractC6918a0.landing_page_description_input_bar_text);
        this.f66180o1 = descriptionInputTextView;
        descriptionInputTextView.setDisplayHint(m71551IN());
        this.f66180o1.setDescriptionChangedListener(new DescriptionInputTextView.InterfaceC13796a() { // from class: j90.j
            public /* synthetic */ C21117j() {
            }

            @Override // com.zing.zalo.p077ui.widget.textview.DescriptionInputTextView.InterfaceC13796a
            /* renamed from: a */
            public final void mo77046a(String str) {
                LandingPageView.this.m71630hO(str);
            }
        });
        m71566MO(0);
        m71530CP();
        if (m71603ZN()) {
            m71594WN();
        }
        this.f66153a2 = false;
        this.f66123L1 = -1;
        this.f66122K1 = -1;
        m71600YN();
        this.f66187r2.postDelayed(new Runnable() { // from class: j90.l
            public /* synthetic */ RunnableC21121l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71561KP();
            }
        }, 100L);
    }

    /* renamed from: XO */
    private int m71598XO() {
        int i11 = 0;
        try {
            Iterator it = this.f66116E1.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (mediaItem != null && AbstractC23280z4.m120313Y(mediaItem)) {
                    it.remove();
                    i11++;
                    if (m71609bO(mediaItem)) {
                        m71604ZO(mediaItem);
                    }
                    m71607aP(mediaItem);
                    m71610bP(mediaItem);
                    C7219t7 c7219t7 = this.f66178n1;
                    if (c7219t7 != null) {
                        c7219t7.m36728R(mediaItem);
                    }
                }
            }
            MediaItem m71543GN = m71543GN();
            if (m71543GN != null && AbstractC23280z4.m120313Y(m71543GN)) {
                i11++;
                if (m71609bO(m71543GN)) {
                    m71604ZO(m71543GN);
                }
                m71610bP(m71543GN);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return i11;
    }

    /* renamed from: YN */
    public void m71600YN() {
        try {
            AbstractC23136l9.m118744r1(this.f66170j1, 4);
            AbstractC23136l9.m118744r1(this.f66182p1, 4);
            AbstractC23136l9.m118744r1(this.f66168i1, 4);
            AbstractC23136l9.m118744r1(this.f66196y1, 4);
            AbstractC23136l9.m118744r1(this.f66180o1, 4);
            AbstractC23136l9.m118744r1(this.f66172k1, 4);
            AbstractC23136l9.m118744r1(this.f66174l1, 4);
            m71686wP(false);
            m71708uP(false);
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    /* renamed from: YO */
    private void m71601YO() {
        this.f66137S1 = false;
        this.f66190t1.setChecked(false);
        m71534DP();
    }

    /* renamed from: ZN */
    private boolean m71603ZN() {
        return AbstractC23280z4.m120354t0(this.f66118G1, 11, 24);
    }

    /* renamed from: ZO */
    private void m71604ZO(MediaItem mediaItem) {
        this.f66115D1.remove(mediaItem);
    }

    /* renamed from: aO */
    private boolean m71606aO() {
        View m71524BN = m71524BN(m71543GN());
        if (!(m71524BN instanceof LandingPhotoView)) {
            return false;
        }
        LandingPhotoView landingPhotoView = (LandingPhotoView) m71524BN;
        if (landingPhotoView.getRestoreAllDataComplete() && !landingPhotoView.m71903g1()) {
            return false;
        }
        return true;
    }

    /* renamed from: aP */
    private void m71607aP(MediaItem mediaItem) {
        ArrayList arrayList = this.f66116E1;
        if (arrayList != null) {
            arrayList.remove(mediaItem);
        }
    }

    /* renamed from: bO */
    private boolean m71609bO(MediaItem mediaItem) {
        try {
            Iterator it = this.f66115D1.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem2 = (MediaItem) it.next();
                if (mediaItem2.mo41081Q().equals(mediaItem.mo41081Q())) {
                    mediaItem2.m41124T0(mediaItem.m41113N());
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: bP */
    private void m71610bP(MediaItem mediaItem) {
        ArrayList arrayList = this.f66114C1;
        if (arrayList != null) {
            arrayList.remove(mediaItem);
        }
    }

    /* renamed from: cO */
    private boolean m71612cO(MediaItem mediaItem) {
        if (mediaItem instanceof VideoItem) {
            VideoItem videoItem = (VideoItem) mediaItem;
            if (!TextUtils.isEmpty(videoItem.m41214u1()) && !TextUtils.isEmpty(videoItem.m41177y())) {
                return true;
            }
            return false;
        }
        return !TextUtils.isEmpty(mediaItem.m41113N());
    }

    /* renamed from: dO */
    private boolean m71615dO() {
        return this.f66118G1 == 24;
    }

    /* renamed from: dP */
    public void m71616dP(boolean z11) {
        m71702cP(z11, false, false);
    }

    /* renamed from: eO */
    private boolean m71619eO(MediaItem mediaItem) {
        Iterator it = this.f66114C1.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem2 = (MediaItem) it.next();
            if (mediaItem2 != null && mediaItem2.mo41081Q().equals(mediaItem.mo41081Q())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: eP */
    private void m71620eP(int i11) {
        RecyclerView recyclerView = this.f66174l1;
        if (recyclerView != null) {
            recyclerView.m9866X1();
            View mo9732P = this.f66176m1.mo9732P(i11);
            if (mo9732P != null) {
                int width = (this.f66174l1.getWidth() - mo9732P.getWidth()) / 2;
                this.f66174l1.m9845O1(mo9732P.getLeft() - width, 0);
                return;
            }
            this.f66174l1.mo9854S1(i11);
        }
    }

    /* renamed from: fO */
    private boolean m71623fO(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: fP */
    public void m71624fP() {
        try {
            if (this.f66174l1 != null && this.f66116E1.size() > 0) {
                int m120299K = AbstractC23280z4.m120299K(this.f66116E1, m71543GN());
                if (m120299K != -1) {
                    if (!this.f66145W1) {
                        this.f66145W1 = true;
                        m71620eP(m120299K);
                    } else {
                        this.f66174l1.mo9854S1(m120299K);
                    }
                } else {
                    this.f66145W1 = true;
                }
                this.f66178n1.m10008p();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    /* renamed from: gO */
    public /* synthetic */ void m71627gO() {
        this.f66187r2.sendEmptyMessage(1);
    }

    /* renamed from: hO */
    public /* synthetic */ void m71630hO(String str) {
        MediaItem m71543GN;
        if (str != null && (m71543GN = m71543GN()) != null) {
            m71543GN.m41110L0(str);
        }
    }

    /* renamed from: iO */
    public /* synthetic */ void m71633iO() {
        try {
            m71656oP();
            View m71524BN = m71524BN(m71543GN());
            if (m71524BN instanceof LandingPhotoView) {
                ((LandingPhotoView) m71524BN).m71897D1();
            }
            this.f66134R0.setEnableSwipe(true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: jO */
    public /* synthetic */ void m71636jO() {
        if (m92656bJ() != null) {
            m92656bJ().requestLayout();
        }
    }

    /* renamed from: kO */
    public /* synthetic */ void m71639kO(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        this.f66151Z1 = true;
        m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* renamed from: kP */
    public void m71640kP(int i11) {
        if (this.f66157c2) {
            return;
        }
        this.f66157c2 = true;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j90.s

            /* renamed from: q */
            public final /* synthetic */ int f103208q;

            public /* synthetic */ RunnableC21135s(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71689xO(r2);
            }
        });
    }

    /* renamed from: lO */
    public /* synthetic */ void m71643lO(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        this.f66151Z1 = false;
    }

    /* renamed from: lP */
    public static Bundle m71644lP(int i11, EnumC22962a enumC22962a, int i12, int i13, boolean z11, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_initialize_index", i12);
        bundle.putInt("extra_photo_type", i11);
        bundle.putSerializable("extra_media_picker_source", enumC22962a);
        bundle.putBoolean("extra_is_hd", z11);
        bundle.putString("extra_chat_name_to", str);
        bundle.putString("extra_chat_uid_to", str2);
        bundle.putInt("extra_num_external_photos", i13);
        bundle.putString("extra_current_bucket_name", str3);
        bundle.putString("source_start_view", str4);
        return bundle;
    }

    /* renamed from: mO */
    public /* synthetic */ void m71647mO(MotionEvent motionEvent) {
        AbstractC12670d.m71366a(this.f66113B1);
    }

    /* renamed from: mP */
    private boolean m71648mP() {
        if (this.f66118G1 == 4 && this.f66119H1 == EnumC22962a.f111693q) {
            return true;
        }
        return false;
    }

    /* renamed from: nP */
    private boolean m71652nP() {
        if (this.f66118G1 == 4 && this.f66119H1 == EnumC22962a.f111693q) {
            return true;
        }
        return false;
    }

    /* renamed from: oO */
    public /* synthetic */ void m71655oO() {
        if (this.f66114C1.isEmpty()) {
            m71640kP(0);
            return;
        }
        m71589UO();
        m71682vP();
        if (this.f66116E1.size() > 1) {
            this.f66187r2.sendEmptyMessage(2);
        }
        m71530CP();
    }

    /* renamed from: oP */
    public void m71656oP() {
        if (!this.f66153a2) {
            this.f66153a2 = true;
            AbstractC23136l9.m118744r1(this.f88760a0, 0);
            m71521AO(this.f66153a2);
        }
    }

    /* renamed from: pO */
    public /* synthetic */ void m71659pO() {
        if (m71598XO() > 0) {
            this.f66187r2.post(new Runnable() { // from class: j90.c
                public /* synthetic */ RunnableC21103c() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LandingPageView.this.m71655oO();
                }
            });
        }
    }

    /* renamed from: pP */
    private void m71660pP() {
        try {
            m71600YN();
            this.f66170j1.setTranslationY(-m71565MN());
            this.f66182p1.setTranslationY(this.f66126N0);
            this.f66168i1.setTranslationY(this.f66126N0);
            this.f66196y1.setTranslationY(this.f66126N0);
            this.f66180o1.setTranslationY(this.f66126N0);
            m71530CP();
            this.f66170j1.setVisibility(0);
            AbstractC23136l9.m118744r1(this.f66182p1, 0);
            AbstractC23136l9.m118744r1(this.f66168i1, 0);
            AbstractC23136l9.m118744r1(this.f66196y1, 0);
            m71682vP();
            if (this.f66118G1 == 11) {
                m71708uP(false);
                m71675tP(false);
            } else {
                m71708uP(true);
                m71675tP(true);
            }
            m71686wP(true);
            m71677uN(true);
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    /* renamed from: qO */
    public static /* synthetic */ void m71663qO() {
        f66110u2 = !AbstractC23238v2.m119726k();
    }

    /* renamed from: qP */
    public void m71664qP(boolean z11, boolean z12) {
        int i11;
        int i12;
        int i13;
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.f66196y1;
        int i14 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(frameLayout2, i11);
        View view = this.f66182p1;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        AbstractC23136l9.m118744r1(view, i12);
        View view2 = this.f66168i1;
        if (z11) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        AbstractC23136l9.m118744r1(view2, i13);
        if (m71603ZN() && m71559KN() > 1 && (frameLayout = this.f66172k1) != null) {
            if (z11) {
                i14 = 0;
            }
            AbstractC23136l9.m118744r1(frameLayout, i14);
        } else if (z12) {
            DescriptionInputTextView descriptionInputTextView = this.f66180o1;
            if (z11) {
                i14 = 0;
            }
            AbstractC23136l9.m118744r1(descriptionInputTextView, i14);
        }
    }

    /* renamed from: rO */
    public static /* synthetic */ void m71667rO(MediaItem mediaItem) {
        AbstractC23280z4.m120356u0((VideoItem) mediaItem);
    }

    /* renamed from: sO */
    public /* synthetic */ void m71670sO(MediaItem mediaItem) {
        mediaItem.m41140d1(true);
        if (this.f66137S1) {
            mediaItem.m41116O0(true);
        }
        this.f66116E1.add(mediaItem);
        m71571OO();
    }

    /* renamed from: sP */
    private void m71671sP(boolean z11) {
        try {
            boolean m116126a = AbstractC22463d.m116126a(getContext(), AbstractC32212c.m155331a(m92689tK()));
            if (z11 && !m116126a) {
                AbstractC23136l9.m118744r1(this.f66152a1, 0);
            } else {
                AbstractC23136l9.m118744r1(this.f66152a1, 8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LandingPageViewTag", e11);
        }
    }

    /* renamed from: tO */
    public /* synthetic */ void m71674tO(MediaItem mediaItem, int i11) {
        boolean z11;
        View m71524BN = m71524BN(mediaItem);
        if (m71524BN instanceof LandingPhotoView) {
            ((LandingPhotoView) m71524BN).m71899J1(i11);
            if (AbstractC23309i.m121928g2() && AbstractC32226c.m155412k(m92656bJ())) {
                z11 = true;
            } else {
                z11 = false;
            }
            m71702cP(true, z11, true);
        }
    }

    /* renamed from: tP */
    private void m71675tP(boolean z11) {
        int i11;
        View view = this.f66160e1;
        if (m71694yP() && z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
    }

    /* renamed from: uN */
    private void m71677uN(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add(ObjectAnimator.ofFloat(this.f66170j1, "translationY", -m71565MN(), 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f66182p1, "translationY", this.f66126N0, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f66168i1, "translationY", this.f66126N0, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f66196y1, "translationY", this.f66126N0, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f66180o1, "translationY", this.f66126N0, 0.0f));
            FrameLayout frameLayout = this.f66172k1;
            if (frameLayout != null) {
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, "translationY", this.f66126N0, 0.0f));
            }
            AnimatorSet animatorSet2 = this.f66183p2;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                this.f66183p2.cancel();
            }
            AnimatorSet animatorSet3 = this.f66181o2;
            if (animatorSet3 != null && animatorSet3.isRunning()) {
                this.f66181o2.cancel();
            }
            this.f66181o2 = animatorSet;
        } else {
            arrayList.add(ObjectAnimator.ofFloat(this.f66170j1, "translationY", 0.0f, -m71565MN()));
            arrayList.add(ObjectAnimator.ofFloat(this.f66182p1, "translationY", 0.0f, this.f66126N0));
            arrayList.add(ObjectAnimator.ofFloat(this.f66168i1, "translationY", 0.0f, this.f66126N0));
            arrayList.add(ObjectAnimator.ofFloat(this.f66196y1, "translationY", 0.0f, this.f66126N0));
            arrayList.add(ObjectAnimator.ofFloat(this.f66180o1, "translationY", 0.0f, this.f66126N0));
            FrameLayout frameLayout2 = this.f66172k1;
            if (frameLayout2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(frameLayout2, "translationY", 0.0f, this.f66126N0));
            }
            AnimatorSet animatorSet4 = this.f66183p2;
            if (animatorSet4 != null && animatorSet4.isRunning()) {
                this.f66183p2.cancel();
            }
            AnimatorSet animatorSet5 = this.f66181o2;
            if (animatorSet5 != null && animatorSet5.isRunning()) {
                this.f66181o2.cancel();
            }
            this.f66183p2 = animatorSet;
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new C12703b(z11));
        animatorSet.start();
    }

    /* renamed from: uO */
    public /* synthetic */ void m71678uO(MediaItem mediaItem, int i11) {
        m71586TO(mediaItem, new Runnable() { // from class: j90.b

            /* renamed from: q */
            public final /* synthetic */ MediaItem f103148q;

            /* renamed from: r */
            public final /* synthetic */ int f103149r;

            public /* synthetic */ RunnableC21101b(MediaItem mediaItem2, int i112) {
                r2 = mediaItem2;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71674tO(r2, r3);
            }
        }, false);
    }

    /* renamed from: vN */
    private void m71680vN() {
        int i11;
        MediaItem m71543GN = m71543GN();
        if (m71543GN != null) {
            if (!TextUtils.isEmpty(m71543GN.m41100F())) {
                this.f66180o1.setDescription(m71543GN.m41100F());
            } else {
                this.f66180o1.setDescription("");
            }
            CheckCircle checkCircle = this.f66193v1;
            if (checkCircle != null) {
                checkCircle.setChecked(m71543GN.m41173u0());
            }
            if (m71543GN instanceof VideoItem) {
                if (AbstractC26689j.m137085L()) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                AbstractC23136l9.m118744r1(this.f66188s1, i11);
                AbstractC23136l9.m118744r1(this.f66184q1, 8);
                this.f66186r1.setText(AbstractC3460h.m17440h(((VideoItem) m71543GN).m41213t1()));
                this.f66180o1.setDialogInputHint(AbstractC23136l9.m118743r0(AbstractC8020f0.description_input_text_popup_title_for_video));
                m71708uP(true);
                m71675tP(false);
                return;
            }
            if (AbstractC23280z4.m120327g(this.f66118G1, 15, 4, 11)) {
                AbstractC23136l9.m118744r1(this.f66188s1, 8);
            } else {
                AbstractC23136l9.m118744r1(this.f66188s1, 0);
            }
            AbstractC23136l9.m118744r1(this.f66184q1, 8);
            this.f66186r1.setText("");
            this.f66180o1.setDialogInputHint(AbstractC23136l9.m118743r0(AbstractC8020f0.description_input_text_popup_title_for_photo));
            m71708uP(false);
            m71675tP(true);
            return;
        }
        this.f66180o1.setDescription("");
        CheckCircle checkCircle2 = this.f66193v1;
        if (checkCircle2 != null) {
            checkCircle2.setChecked(false);
        }
    }

    /* renamed from: vO */
    public /* synthetic */ void m71681vO(boolean z11, MediaItem mediaItem, boolean z12, Runnable runnable) {
        long j11;
        int i11;
        try {
            if (!m92672lJ()) {
                return;
            }
            if (z11) {
                VideoItem videoItem = (VideoItem) mediaItem;
                if (this.f66119H1 == EnumC22962a.f111693q) {
                    i11 = 2;
                    j11 = AbstractC26689j.m137084K(2);
                } else {
                    j11 = Long.MAX_VALUE;
                    i11 = 0;
                }
                if (!m71623fO(i11) && AbstractC23280z4.m120344o0(videoItem.m41130X(), j11)) {
                    AbstractC23280z4.m120360w0(getContext(), j11, i11);
                    this.f66193v1.setChecked(false);
                    if (z12 && !videoItem.m41129W()) {
                        C2526d.f10270a.m12706c(videoItem.m41130X(), 1);
                        videoItem.m41143f1(true);
                        return;
                    }
                    return;
                }
                if (AbstractC23280z4.m120340m0(videoItem.m41213t1()) || !AbstractC23280z4.m120346p0(videoItem.m41213t1()) || (videoItem.m41168r0() != null && !videoItem.m41168r0().get())) {
                    ToastUtils.m89266n(AbstractC8020f0.str_gallery_picker_video_invalid, new Object[0]);
                    this.f66193v1.setChecked(false);
                    return;
                }
            } else if (mediaItem.m41168r0() != null && !mediaItem.m41168r0().get()) {
                ToastUtils.m89266n(AbstractC8020f0.str_gallery_picker_photo_invalid, new Object[0]);
                this.f66193v1.setChecked(false);
                return;
            }
            runnable.run();
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    /* renamed from: vP */
    private void m71682vP() {
        boolean z11 = true;
        int i11 = 8;
        if (m71603ZN() && m71559KN() > 1) {
            AbstractC23136l9.m118744r1(this.f66174l1, 0);
            AbstractC23136l9.m118744r1(this.f66172k1, 0);
            AbstractC23136l9.m118744r1(this.f66180o1, 8);
            return;
        }
        AbstractC23136l9.m118744r1(this.f66174l1, 8);
        AbstractC23136l9.m118744r1(this.f66172k1, 8);
        if (this.f66119H1 != EnumC22962a.f111694r) {
            z11 = false;
        }
        DescriptionInputTextView descriptionInputTextView = this.f66180o1;
        if (z11) {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(descriptionInputTextView, i11);
    }

    /* renamed from: wN */
    private void m71684wN() {
        MediaItem m71543GN = m71543GN();
        if (m71543GN == null) {
            return;
        }
        boolean z11 = m71543GN instanceof VideoItem;
        if (AbstractC23280z4.m120327g(this.f66118G1, 19, 10, 3, 16, 24)) {
            m71682vP();
            this.f66190t1.setChecked(this.f66137S1);
            this.f66193v1.setChecked(m71543GN.m41173u0());
            DescriptionInputTextView descriptionInputTextView = this.f66180o1;
            if (descriptionInputTextView != null && descriptionInputTextView.getVisibility() == 0) {
                if (!TextUtils.isEmpty(m71543GN.m41100F())) {
                    this.f66180o1.setDescription(m71543GN.m41100F());
                } else {
                    this.f66180o1.setDescription("");
                }
            }
            if (z11) {
                this.f66186r1.setText(AbstractC3460h.m17440h(((VideoItem) m71543GN).m41213t1()));
                AbstractC23136l9.m118744r1(this.f66184q1, 8);
                AbstractC23136l9.m118744r1(this.f66188s1, 8);
            } else {
                this.f66186r1.setText("");
                AbstractC23136l9.m118744r1(this.f66184q1, 8);
                AbstractC23136l9.m118744r1(this.f66188s1, 0);
            }
            this.f66192u1.setGravity(17);
        } else {
            this.f66137S1 = false;
            this.f66193v1.setChecked(m71543GN.m41173u0());
            AbstractC23136l9.m118744r1(this.f66180o1, 8);
            AbstractC23136l9.m118744r1(this.f66184q1, 8);
            AbstractC23136l9.m118744r1(this.f66188s1, 8);
            this.f66192u1.setGravity(3);
        }
        m71708uP(true);
    }

    /* renamed from: wO */
    public /* synthetic */ void m71685wO(C3979l c3979l, int i11) {
        InterfaceC12717p interfaceC12717p = this.f66169i2;
        if (interfaceC12717p != null) {
            interfaceC12717p.mo71315c(this.f66121J1);
            this.f66169i2.mo71314b(this.f66117F1);
            if (c3979l != null) {
                this.f66169i2.mo71313a(c3979l);
            }
        }
        if (this.f66143V1) {
            m71616dP(false);
        }
        if (this.f66169i2 != null && m71648mP() && !this.f66139T1) {
            this.f66169i2.mo71317e();
        }
        InterfaceC12718q interfaceC12718q = this.f66171j2;
        if (interfaceC12718q != null) {
            interfaceC12718q.mo71513a(i11, this.f66137S1, this.f66116E1, this.f66115D1);
        }
        this.f66139T1 = false;
        this.f66157c2 = false;
    }

    /* renamed from: wP */
    private void m71686wP(boolean z11) {
        int i11;
        for (int i12 = 0; i12 < this.f66134R0.getChildCount(); i12++) {
            try {
                View findViewById = this.f66134R0.getChildAt(i12).findViewById(AbstractC6918a0.landing_page_video_indicator);
                if (findViewById != null) {
                    if (z11) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    AbstractC23136l9.m118744r1(findViewById, i11);
                }
                if (AbstractC26689j.f126436b) {
                    m71541FP(i12, z11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
                return;
            }
        }
    }

    /* renamed from: xN */
    private void m71688xN(LandingPhotoView.InterfaceC12724b0 interfaceC12724b0) {
        try {
            View m71524BN = m71524BN(m71543GN());
            if ((!(m71524BN instanceof LandingPhotoView) || !((LandingPhotoView) m71524BN).m71904x0(interfaceC12724b0)) && interfaceC12724b0 != null) {
                interfaceC12724b0.mo71709a();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xO */
    public /* synthetic */ void m71689xO(int i11) {
        C3979l m71539FN = m71539FN();
        if (m71539FN != null) {
            m71539FN.m18852p(true);
        }
        m71520AN();
        this.f66187r2.post(new Runnable() { // from class: j90.i

            /* renamed from: q */
            public final /* synthetic */ C3979l f103182q;

            /* renamed from: r */
            public final /* synthetic */ int f103183r;

            public /* synthetic */ RunnableC21115i(C3979l m71539FN2, int i112) {
                r2 = m71539FN2;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71685wO(r2, r3);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:            if (me0.AbstractC23280z4.m120312X(r10) != false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:            r0 = "1";     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:            if (r8.f66137S1 != false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:            if (r8.f66193v1.isChecked() != false) goto L42;     */
    /* renamed from: xP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m71690xP(String str, MediaItem mediaItem) {
        String str2;
        if (mediaItem instanceof VideoItem) {
            return;
        }
        if (this.f66119H1 == EnumC22962a.f111694r) {
            str2 = "chat_gallery";
        } else {
            str2 = "social_galleryupload";
        }
        String str3 = str2;
        String str4 = "0";
        if (mediaItem == null) {
            if (!str.equals("editor_viewfull_hd")) {
                if (!str.equals("editor_viewfull_select")) {
                    str4 = "";
                }
                C0815e1.m2075D().m2100V(new C23648e(34, str3, 0, str, str4), false);
            }
        }
    }

    /* renamed from: yN */
    public static void m71692yN(MediaItem mediaItem) {
        if (mediaItem instanceof VideoItem) {
            VideoItem videoItem = (VideoItem) mediaItem;
            if (!TextUtils.isEmpty(videoItem.m41214u1())) {
                AbstractC23041d2.m118208g(videoItem.m41214u1());
            }
            videoItem.m41208D1("");
            return;
        }
        String m41113N = mediaItem.m41113N();
        if (!TextUtils.isEmpty(m41113N) && !m41113N.equals(mediaItem.mo41081Q())) {
            AbstractC23041d2.m118208g(m41113N);
        }
        mediaItem.m41124T0("");
    }

    /* renamed from: yO */
    public /* synthetic */ void m71693yO(int i11) {
        this.f66178n1.m10009q(i11);
    }

    /* renamed from: yP */
    private boolean m71694yP() {
        MediaItem m71543GN;
        if (this.f66118G1 == 11 || (m71543GN = m71543GN()) == null || (m71543GN instanceof VideoItem) || m71543GN.m41163p0() || m71543GN.m41174v0()) {
            return false;
        }
        return true;
    }

    /* renamed from: zN */
    private void m71696zN() {
        this.f66137S1 = true;
        this.f66190t1.setChecked(true);
        m71534DP();
    }

    /* renamed from: zO */
    private void m71697zO(PhotoView photoView, MediaItem mediaItem) {
        String m120361x = AbstractC23280z4.m120361x(mediaItem);
        C3979l m71532DN = m71532DN(mediaItem);
        if (m71532DN != null && m71532DN.m18839c() != null) {
            photoView.setImageInfo(m71532DN);
        }
        C12702a c12702a = new C12702a(photoView, mediaItem);
        c12702a.m125773e3(true);
        ((C23528a) this.f66130P0.m123612r(photoView)).m123586J(m120361x, true, true, AbstractC23006a0.m117875E(), 0, c12702a, false, C23278z2.m120110a(), true);
    }

    /* renamed from: zP */
    private boolean m71698zP() {
        if (this.f66118G1 == 11) {
            return false;
        }
        return m71543GN() instanceof VideoItem;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        InterfaceC27218a m92676n2 = m92676n2();
        this.f66128O0 = m92676n2;
        this.f66130P0 = new C23528a(m92676n2.getContext());
        HandlerThread handlerThread = new HandlerThread("Z:LandingPage", 10);
        this.f66179n2 = handlerThread;
        handlerThread.start();
        C24003n c24003n = new C24003n();
        f66111v2 = c24003n;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116260a = AbstractC23006a0.m117883M();
        m71547HN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            ViewOnClickListenerC26642c viewOnClickListenerC26642c = new ViewOnClickListenerC26642c(this.f72421L0.m92648SI(), new InterfaceC17463d.d() { // from class: j90.a
                public /* synthetic */ C21099a() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    LandingPageView.this.m71639kO(interfaceC17463d, i12);
                }
            }, new InterfaceC17463d.d() { // from class: j90.k
                public /* synthetic */ C21119k() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    LandingPageView.this.m71643lO(interfaceC17463d, i12);
                }
            });
            viewOnClickListenerC26642c.m92874z(false);
            return viewOnClickListenerC26642c;
        }
        if (i11 == 2) {
            return C23046d7.m118240c(m92689tK());
        }
        return super.mo39014DJ(i11);
    }

    /* renamed from: EN */
    int m71699EN(int i11) {
        if (i11 == AbstractC6918a0.btn_editor_video_crop || i11 == AbstractC6918a0.landing_page_oversize_video_popup) {
            return 1;
        }
        if (i11 == AbstractC6918a0.btn_editor_doodle) {
            return 2;
        }
        if (i11 == AbstractC6918a0.btn_editor_caption) {
            return 3;
        }
        if (i11 == AbstractC6918a0.btn_editor_filter) {
            return 4;
        }
        return i11 == AbstractC6918a0.btn_editor_sticker ? 5 : 0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        try {
            actionBarMenu.m92750r();
            AbstractC23136l9.m118744r1((PhotoToggleButton) actionBarMenu.m92744k(AbstractC6918a0.menu_photo_select_checkbox, AbstractC7409c0.action_bar_menu_item_checkbox), 8);
            m71530CP();
            m71680vN();
            m71549HP();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FixUsableHeightFrameLayout fixUsableHeightFrameLayout = (FixUsableHeightFrameLayout) layoutInflater.inflate(AbstractC7409c0.landing_page_view, viewGroup, false);
        fixUsableHeightFrameLayout.setOnTouchEventListener(new FixUsableHeightFrameLayout.InterfaceC13668a() { // from class: j90.q
            public /* synthetic */ C21131q() {
            }

            @Override // com.zing.zalo.p077ui.widget.layout.FixUsableHeightFrameLayout.InterfaceC13668a
            /* renamed from: a */
            public final void mo76373a(MotionEvent motionEvent) {
                LandingPageView.this.m71647mO(motionEvent);
            }
        });
        this.f66132Q0 = fixUsableHeightFrameLayout;
        m71597XN();
        return this.f66132Q0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f66134R0.removeOnPageChangeListener(this.f66189s2);
        RecyclerView recyclerView = this.f66174l1;
        if (recyclerView != null) {
            recyclerView.m9841N();
        }
        HandlerThread handlerThread = this.f66179n2;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f66179n2 = null;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
    }

    /* renamed from: LO */
    void m71700LO() {
        m71580RO(5);
    }

    /* renamed from: ON */
    public void m71701ON(boolean z11) {
        boolean z12;
        boolean z13;
        FrameLayout frameLayout;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (this.f66119H1 == EnumC22962a.f111694r) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m71603ZN() && m71559KN() > 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11) {
            m71664qP(true, z12);
            arrayList.add(ObjectAnimator.ofFloat(this.f66182p1, "translationY", this.f66126N0, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f66168i1, "translationY", this.f66126N0, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f66196y1, "translationY", this.f66126N0, 0.0f));
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(this.f66180o1, "translationY", this.f66126N0, 0.0f));
            }
            if (z13 && (frameLayout = this.f66172k1) != null) {
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, "translationY", this.f66126N0, 0.0f));
            } else if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(this.f66180o1, "translationY", this.f66126N0, 0.0f));
            }
        } else {
            arrayList.add(ObjectAnimator.ofFloat(this.f66182p1, "translationY", 0.0f, this.f66126N0));
            arrayList.add(ObjectAnimator.ofFloat(this.f66168i1, "translationY", 0.0f, this.f66126N0));
            arrayList.add(ObjectAnimator.ofFloat(this.f66196y1, "translationY", 0.0f, this.f66126N0));
            if (z12 && this.f66172k1 != null) {
                arrayList.add(ObjectAnimator.ofFloat(this.f66180o1, "translationY", 0.0f, this.f66126N0));
            }
            if (z13) {
                arrayList.add(ObjectAnimator.ofFloat(this.f66172k1, "translationY", 0.0f, this.f66126N0));
            } else if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(this.f66180o1, "translationY", 0.0f, this.f66126N0));
            }
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new C12704c(z11, z12));
        animatorSet.start();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == 16908332) {
                m71568NN();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_select_checkbox) {
                m71569NO();
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        if (this.f66143V1) {
            m71616dP(false);
        }
        try {
            DescriptionInputTextView descriptionInputTextView = this.f66180o1;
            if (descriptionInputTextView != null && descriptionInputTextView.m77041k()) {
                this.f66180o1.m77044p();
            }
            AbstractC12670d.m71366a(this.f66113B1);
        } catch (Exception e11) {
            AbstractC20110a.m104543l("LandingPageViewTag").mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            MediaItem m71543GN = m71543GN();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int i11 = 0;
            if (this.f66114C1 != null) {
                int i12 = 0;
                while (i11 < this.f66114C1.size()) {
                    MediaItem mediaItem = (MediaItem) this.f66114C1.get(i11);
                    if (!m71652nP()) {
                        if (!mediaItem.m41173u0()) {
                            if (!m71612cO(mediaItem)) {
                                MediaItem mediaItem2 = this.f66135R1;
                                if (mediaItem != mediaItem2) {
                                    if (mediaItem2 != null && mediaItem.mo41090x() == this.f66135R1.mo41090x()) {
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    arrayList.add(mediaItem);
                    if (m71543GN != null && mediaItem == m71543GN) {
                        i12 = arrayList.size() - 1;
                    }
                    i11++;
                }
                i11 = i12;
            }
            bundle.putParcelableArrayList("view_items", arrayList);
            bundle.putParcelableArrayList("selected_items", this.f66116E1);
            MediaItem mediaItem3 = this.f66135R1;
            if (mediaItem3 != null) {
                bundle.putParcelable("editing_item", mediaItem3);
            }
            bundle.putInt("current_photo_index", i11);
            bundle.putInt("photo_type", this.f66118G1);
            bundle.putSerializable("media_picker_source", this.f66119H1);
            bundle.putBoolean("is_hd", this.f66137S1);
            bundle.putString("name_chat_to", this.f66129O1);
            bundle.putString("chat_uid_to", this.f66131P1);
            bundle.putInt("num_external_photos", this.f66125M1);
            bundle.putString("current_bucket_name", this.f66133Q1);
            super.mo37118SJ(bundle);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16801x.black_80);
            this.f88760a0.setTitle(m92652XI(AbstractC8020f0.media_picker_preview));
            this.f88760a0.setSubtitle(null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m71592VO();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m71522AP();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && this.f66119H1 == EnumC22962a.f111694r) {
            C2526d.m12648B(this.f66131P1, this.f66165g2, this.f66167h2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(-16777216);
        m89412p.m89426U(Boolean.FALSE);
    }

    /* renamed from: cP */
    public void m71702cP(boolean z11, boolean z12, boolean z13) {
        InterfaceC27218a m92676n2;
        Window window;
        if ((z13 && !this.f72421L0.m92672lJ()) || (m92676n2 = this.f72421L0.m92676n2()) == null || (window = m92676n2.getWindow()) == null) {
            return;
        }
        if (!m92676n2.mo35576n3()) {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            if (z11) {
                window.setFlags(1024, 1024);
                if (z12) {
                    viewGroup.setSystemUiVisibility(5894);
                    return;
                } else {
                    viewGroup.setSystemUiVisibility(0);
                    return;
                }
            }
            window.clearFlags(1024);
            viewGroup.setSystemUiVisibility(0);
            return;
        }
        AbstractC23136l9.m118686X0(window, z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (this.f66143V1) {
            m71616dP(false);
        }
        super.finish();
    }

    /* renamed from: gP */
    public void m71703gP(InterfaceC12717p interfaceC12717p) {
        this.f66169i2 = interfaceC12717p;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LandingPageView";
    }

    /* renamed from: hP */
    public void m71704hP(InterfaceC12718q interfaceC12718q) {
        this.f66171j2 = interfaceC12718q;
    }

    /* renamed from: iP */
    public void m71705iP(InterfaceC12719r interfaceC12719r) {
        this.f66173k2 = interfaceC12719r;
    }

    /* renamed from: jP */
    public void m71706jP(InterfaceC12720s interfaceC12720s) {
        this.f66175l2 = interfaceC12720s;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 2001 || i11 == 2002) {
            try {
                m71576QN(i11, i12, intent);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.landing_page_btn_send) {
            if (m71615dO()) {
                AbstractC23647d.m123897g("122002");
            }
            m71573PN();
            return;
        }
        if (id2 == AbstractC6918a0.landing_page_btn_done) {
            m71573PN();
            return;
        }
        if (id2 != AbstractC6918a0.landing_page_oversize_video_popup && id2 != AbstractC6918a0.landing_page_video_indicator && id2 != AbstractC6918a0.btn_editor_video_crop && id2 != AbstractC6918a0.btn_editor_doodle && id2 != AbstractC6918a0.btn_editor_caption && id2 != AbstractC6918a0.btn_editor_filter && id2 != AbstractC6918a0.btn_editor_sticker) {
            if (id2 == AbstractC6918a0.landing_page_tv_hd) {
                this.f66190t1.setChecked(!r3.isChecked());
                m71540FO();
                return;
            }
            if (id2 == AbstractC6918a0.landing_page_checkbox_hq) {
                m71540FO();
                return;
            }
            if (id2 == AbstractC6918a0.landing_page_btn_close) {
                m71533DO();
                return;
            }
            if (id2 != AbstractC6918a0.landing_page_tv_select && id2 != AbstractC6918a0.landing_page_checkbox_select) {
                if (id2 == AbstractC6918a0.landing_page_btn_crop) {
                    m71700LO();
                    return;
                }
                if (id2 == AbstractC6918a0.landing_page_btn_brush) {
                    m71525BO();
                    return;
                }
                if (id2 == AbstractC6918a0.landing_page_btn_caption) {
                    m71529CO();
                    return;
                }
                if (id2 == AbstractC6918a0.landing_page_btn_filter) {
                    m71556JO();
                    return;
                } else if (id2 == AbstractC6918a0.landing_page_btn_sticker) {
                    m71577QO();
                    return;
                } else {
                    if (id2 == AbstractC6918a0.landing_page_btn_close_filter) {
                        m71536EO();
                        return;
                    }
                    return;
                }
            }
            m71544GO();
            return;
        }
        m71552IO(m71699EN(id2));
        if (id2 == AbstractC6918a0.btn_editor_video_crop) {
            C2526d.m12672x(this.f66131P1, "", this.f66167h2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                m71568NN();
                return true;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return false;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 110 && AbstractC23034c6.m118167n(this.f72421L0.getContext(), strArr) == 0) {
            m71560KO();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        int i11;
        boolean z11;
        super.onResume();
        if (this.f66155b2) {
            if (AbstractC23309i.m121928g2() && AbstractC32226c.m155412k(m92656bJ())) {
                z11 = true;
            } else {
                z11 = false;
            }
            m71702cP(true, z11, false);
        } else {
            m71616dP(true);
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j90.n
            public /* synthetic */ RunnableC21125n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.this.m71659pO();
            }
        });
        if (this.f66151Z1 && C28139n5.m141621w(this.f72421L0.m92648SI())) {
            m71560KO();
        }
        this.f66151Z1 = false;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j90.o
            @Override // java.lang.Runnable
            public final void run() {
                LandingPageView.m71663qO();
            }
        });
        if (this.f66141U1) {
            m71579RN();
        }
        if (!this.f66163f2.isEmpty() && this.f66161e2 == 1) {
            String str = this.f66163f2;
            if (this.f66116E1.size() > 1) {
                i11 = AbstractC23222t7.f112517C0;
            } else {
                i11 = AbstractC23222t7.f112591v0;
            }
            this.f66113B1 = AbstractC12670d.m71367b(this, str, i11);
            this.f66163f2 = "";
        }
    }

    /* renamed from: rP */
    public void m71707rP(boolean z11) {
        int i11;
        int i12;
        int i13;
        ActiveImageColorButton activeImageColorButton = this.f66144W0;
        int i14 = 0;
        if (activeImageColorButton != null) {
            if (z11) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            activeImageColorButton.setVisibility(i13);
            this.f66144W0.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton2 = this.f66142V0;
        if (activeImageColorButton2 != null) {
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            activeImageColorButton2.setVisibility(i12);
            this.f66142V0.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton3 = this.f66140U0;
        if (activeImageColorButton3 != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            activeImageColorButton3.setVisibility(i11);
            this.f66140U0.setEnabled(z11);
        }
        ActiveImageColorButton activeImageColorButton4 = this.f66150Z0;
        if (activeImageColorButton4 != null) {
            if (!z11) {
                i14 = 8;
            }
            activeImageColorButton4.setVisibility(i14);
            this.f66150Z0.setEnabled(z11);
        }
        m71671sP(z11);
        ActiveImageColorButton activeImageColorButton5 = this.f66148Y0;
        if (activeImageColorButton5 != null) {
            activeImageColorButton5.setEnabled(z11);
            this.f66148Y0.setVisibility(8);
        }
    }

    /* renamed from: uP */
    public void m71708uP(boolean z11) {
        boolean z12;
        if (m71698zP() && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        m71707rP(z12);
        ActiveImageColorButton activeImageColorButton = this.f66146X0;
        if (activeImageColorButton != null) {
            activeImageColorButton.setVisibility(8);
            this.f66146X0.setEnabled(false);
        }
        ActiveImageColorButton activeImageColorButton2 = this.f66156c1;
        if (activeImageColorButton2 != null) {
            activeImageColorButton2.setVisibility(8);
            this.f66156c1.setEnabled(false);
        }
        ActiveImageColorButton activeImageColorButton3 = this.f66154b1;
        if (activeImageColorButton3 != null) {
            activeImageColorButton3.setVisibility(8);
            this.f66154b1.setEnabled(false);
        }
        ActiveImageColorButton activeImageColorButton4 = this.f66158d1;
        if (activeImageColorButton4 != null) {
            activeImageColorButton4.setVisibility(8);
            this.f66158d1.setEnabled(false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("view_items");
                this.f66114C1 = parcelableArrayList;
                if (parcelableArrayList == null) {
                    this.f66114C1 = new ArrayList();
                }
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("selected_items");
                this.f66116E1 = parcelableArrayList2;
                if (parcelableArrayList2 == null) {
                    this.f66116E1 = new ArrayList();
                }
                this.f66135R1 = (MediaItem) bundle.getParcelable("editing_item");
                this.f66121J1 = bundle.getInt("current_photo_index", 0);
                this.f66118G1 = bundle.getInt("photo_type", 15);
                this.f66119H1 = (EnumC22962a) bundle.get("media_picker_source");
                this.f66137S1 = bundle.getBoolean("is_hd");
                this.f66129O1 = bundle.getString("name_chat_to", "");
                this.f66131P1 = bundle.getString("chat_uid_to", "");
                this.f66125M1 = bundle.getInt("num_external_photos");
                this.f66133Q1 = bundle.getString("current_bucket_name", "");
                if (this.f66114C1.isEmpty()) {
                    m71640kP(0);
                }
            } else {
                this.f66121J1 = this.f66120I1;
            }
            m71589UO();
            C7219t7 c7219t7 = this.f66178n1;
            if (c7219t7 != null) {
                c7219t7.m36729S(new ArrayList(this.f66116E1));
            }
            int i11 = this.f66121J1;
            if (i11 == 0) {
                m71566MO(i11);
            } else {
                this.f66134R0.setCurrentItem(i11);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
    }

    public LandingPageView(Bundle bundle, List list, List list2) {
        mo60305zK(bundle);
        m71591VN(list, list2);
    }
}
