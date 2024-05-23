package com.zing.zalo.p077ui.chat;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import b40.C2526d;
import c30.C3255n;
import c60.InterfaceC3299a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.C3980m;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7173p5;
import com.zing.zalo.adapters.C7240v6;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.location.AbstractC8971q;
import com.zing.zalo.location.C8956b;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.LiveLocationBar;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.Cocos2dxAnimationActivity;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.chat.C11621p0;
import com.zing.zalo.p077ui.chat.ChatFrameLayout;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.transfer.ChatWindowReference;
import com.zing.zalo.p077ui.chat.widget.BackToLastChatView;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.p077ui.chat.widget.banners.MediaDownloadStatusView;
import com.zing.zalo.p077ui.chat.widget.banners.UserSafetyWarningBannerModulesView;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatBottomOverlayContainerView;
import com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView;
import com.zing.zalo.p077ui.chat.widget.quickreply.QuickReplySuggestionContainer;
import com.zing.zalo.p077ui.chat.widget.searchinline.C11815a;
import com.zing.zalo.p077ui.chat.widget.theme.StickyChatThemesView;
import com.zing.zalo.p077ui.moduleview.csc.FloatingPromoteTrendingStickerModulesView;
import com.zing.zalo.p077ui.moduleview.csc.SuggestLinkModulesView;
import com.zing.zalo.p077ui.mycloud.EmbeddedMyCloudPagesLayout;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.showcase.C13309e;
import com.zing.zalo.p077ui.showcase.WalkThroughOnboardView;
import com.zing.zalo.p077ui.widget.ChatComposePanelNew;
import com.zing.zalo.p077ui.widget.CustomTypefaceSpan;
import com.zing.zalo.p077ui.widget.FileDownloadBannerView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.MaterialProgressBar;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.QuickActionViewType5;
import com.zing.zalo.p077ui.widget.ReturnCallScreenView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StickyMusicPlayer;
import com.zing.zalo.p077ui.widget.StickyNotiLiveStreamingBar;
import com.zing.zalo.p077ui.widget.recyclerview.CustomRecyclerView;
import com.zing.zalo.p077ui.widget.recyclerview.SwipeItemListView;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;
import com.zing.zalo.p077ui.zviews.Cocos2dxLoadingView;
import com.zing.zalo.p077ui.zviews.Cocos2dxView;
import com.zing.zalo.p077ui.zviews.ProfilePickerView;
import com.zing.zalo.p077ui.zviews.ReplyStickerPopupView;
import com.zing.zalo.p077ui.zviews.RequestLocationView;
import com.zing.zalo.p077ui.zviews.ShareContactView;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.SendProductSource;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout;
import com.zing.zalo.uicontrol.zinstant.ZinstantQuickMenu;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17172p;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import cy.C17584c;
import dj.C17945a0;
import dj.C17988o1;
import dj.C17990p0;
import dj.C18013y0;
import g30.AbstractC19215a;
import gd0.InterfaceC19397b;
import gg0.AbstractC19444a;
import gi.EnumC19449b;
import gi.EnumC19450c;
import gw.AbstractC19656s0;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import i40.AbstractAnimationAnimationListenerC20277g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k60.InterfaceC21485c;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23202r9;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.AbstractC23265y;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23250w4;
import me0.C23278z2;
import mm0.AbstractC23350e;
import n60.AbstractC23596i;
import p037bk.C2827a;
import p056cj.C3535c;
import p056cj.C3538f;
import p105dn.EnumC18030a;
import p207he.C20024r;
import p211hi.C20067a;
import p239ih.C20556f;
import p240ii.C20559a;
import p262jb.AbstractC21196a;
import p279jw.C21373a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24002m;
import p379o3.C24003n;
import p461qu.AbstractC25495a;
import p494rv.C25979a;
import p542ub.InterfaceC27218a;
import p588vw.C28646l;
import p611wj.C29059g;
import p716zh.C31862c;
import p716zh.C31902e9;
import p716zh.C31922g;
import p716zh.C31948ha;
import p716zh.C31959i6;
import p716zh.C31973j5;
import p716zh.C31983k0;
import p716zh.C32050o7;
import p716zh.C32090r5;
import p716zh.C32098s;
import p716zh.C32190y7;
import sa0.C26209i;
import t00.C26446c;
import tg.C26657h;
import tg.C26664o;
import tg.C26674y;
import th.AbstractC26681b;
import u60.C27043b;
import u80.AbstractC27162p2;
import v50.AbstractC27660gd;
import v50.C27675hd;
import v50.ViewOnLayoutChangeListenerC27674hc;
import vg.C28020b3;
import vg.C28203u6;
import x50.C29384b;
import zl0.AbstractC32226c;

/* renamed from: com.zing.zalo.ui.chat.p0 */
/* loaded from: classes5.dex */
public class C11621p0 {

    /* renamed from: A0 */
    public static int f60372A0 = 1;

    /* renamed from: B0 */
    public static int f60373B0 = 2;

    /* renamed from: C0 */
    static C3977j f60374C0 = new C3977j(MainApplication.getAppContext());

    /* renamed from: z0 */
    static final String f60375z0 = "p0";

    /* renamed from: A */
    private Animator.AnimatorListener f60376A;

    /* renamed from: C */
    private Animator.AnimatorListener f60378C;

    /* renamed from: G */
    private C31959i6 f60382G;

    /* renamed from: P */
    C26674y.b f60391P;

    /* renamed from: Q */
    public boolean f60392Q;

    /* renamed from: R */
    public ReturnCallScreenView f60393R;

    /* renamed from: S */
    public StickyMusicPlayer f60394S;

    /* renamed from: T */
    public LiveLocationBar f60395T;

    /* renamed from: U */
    public StickyNotiLiveStreamingBar f60396U;

    /* renamed from: V */
    public StickyChatThemesView f60397V;

    /* renamed from: W */
    public QuickActionViewLayout f60398W;

    /* renamed from: X */
    public QuickActionViewLayout f60399X;

    /* renamed from: Y */
    RequestLocationView f60400Y;

    /* renamed from: Z */
    ViewGroup f60401Z;

    /* renamed from: a */
    private View f60402a;

    /* renamed from: a0 */
    private MaterialProgressBar f60403a0;

    /* renamed from: b */
    private ZaloDrawerLayout f60404b;

    /* renamed from: c */
    private FrameLayout f60406c;

    /* renamed from: d */
    public ChatFrameLayout f60408d;

    /* renamed from: d0 */
    private Animation f60409d0;

    /* renamed from: e */
    private SwipeItemListView f60410e;

    /* renamed from: e0 */
    public ActionBar f60411e0;

    /* renamed from: f */
    private RecyclingImageView f60412f;

    /* renamed from: g */
    private RecyclingImageView f60414g;

    /* renamed from: g0 */
    RobotoButton f60415g0;

    /* renamed from: h */
    ZinstantQuickMenu f60416h;

    /* renamed from: i */
    private Animation f60418i;

    /* renamed from: j */
    private Animation f60420j;

    /* renamed from: j0 */
    MediaDownloadStatusView f60421j0;

    /* renamed from: k */
    private final ChatView f60422k;

    /* renamed from: k0 */
    NewMultiPhotoSuggestView f60423k0;

    /* renamed from: l0 */
    Runnable f60425l0;

    /* renamed from: m */
    private final C23528a f60426m;

    /* renamed from: m0 */
    boolean f60427m0;

    /* renamed from: o */
    private int f60430o;

    /* renamed from: o0 */
    private SuggestLinkModulesView f60431o0;

    /* renamed from: p */
    private LinearLayoutManager f60432p;

    /* renamed from: p0 */
    private Runnable f60433p0;

    /* renamed from: q */
    private FrameLayout f60434q;

    /* renamed from: q0 */
    public FloatingPromoteTrendingStickerModulesView f60435q0;

    /* renamed from: r */
    private CustomRecyclerView f60436r;

    /* renamed from: r0 */
    View.OnLayoutChangeListener f60437r0;

    /* renamed from: s */
    public QuickReplySuggestionContainer f60438s;

    /* renamed from: t */
    public C11815a f60440t;

    /* renamed from: u */
    private C7240v6 f60442u;

    /* renamed from: v */
    public RecyclerView f60444v;

    /* renamed from: v0 */
    private EmbeddedMyCloudPagesLayout f60445v0;

    /* renamed from: w */
    public RobotoTextView f60446w;

    /* renamed from: w0 */
    private BackToLastChatView f60447w0;

    /* renamed from: x */
    public C27043b f60448x;

    /* renamed from: y */
    private LinearLayoutManager f60450y;

    /* renamed from: z */
    private ViewTreeObserver.OnGlobalLayoutListener f60452z;

    /* renamed from: B */
    private boolean f60377B = false;

    /* renamed from: D */
    private boolean f60379D = false;

    /* renamed from: E */
    private final Runnable f60380E = new Runnable() { // from class: v50.ad
        public /* synthetic */ RunnableC27570ad() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C11621p0.this.m64702y1();
        }
    };

    /* renamed from: F */
    private final Runnable f60381F = new Runnable() { // from class: v50.bd
        public /* synthetic */ RunnableC27585bd() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C11621p0.this.m64704z1();
        }
    };

    /* renamed from: H */
    private String f60383H = "";

    /* renamed from: I */
    public String f60384I = "";

    /* renamed from: J */
    public String f60385J = "";

    /* renamed from: K */
    public boolean f60386K = false;

    /* renamed from: L */
    float f60387L = 1.0f;

    /* renamed from: M */
    int f60388M = 0;

    /* renamed from: N */
    float f60389N = 1.0f;

    /* renamed from: O */
    boolean f60390O = false;

    /* renamed from: b0 */
    final Animation.AnimationListener f60405b0 = new d();

    /* renamed from: c0 */
    final Animation.AnimationListener f60407c0 = new e();

    /* renamed from: f0 */
    public C3538f f60413f0 = null;

    /* renamed from: h0 */
    public boolean f60417h0 = false;

    /* renamed from: i0 */
    C20559a.h f60419i0 = new h();

    /* renamed from: n0 */
    int f60429n0 = 40;

    /* renamed from: s0 */
    private InterfaceC19397b f60439s0 = null;

    /* renamed from: t0 */
    private int f60441t0 = 1;

    /* renamed from: u0 */
    private int f60443u0 = 1;

    /* renamed from: x0 */
    private AbstractC23596i f60449x0 = null;

    /* renamed from: y0 */
    private View f60451y0 = null;

    /* renamed from: l */
    private final Handler f60424l = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final C20559a f60428n = new C20559a();

    /* renamed from: com.zing.zalo.ui.chat.p0$a */
    /* loaded from: classes5.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f60453a;

        /* renamed from: b */
        final /* synthetic */ C24003n f60454b;

        /* renamed from: c */
        final /* synthetic */ boolean f60455c;

        /* renamed from: d */
        final /* synthetic */ boolean f60456d;

        /* renamed from: e */
        final /* synthetic */ boolean f60457e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC3299a f60458f;

        /* renamed from: com.zing.zalo.ui.chat.p0$a$a */
        /* loaded from: classes5.dex */
        class C32753a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ C3538f f60460l1;

            C32753a(C3538f c3538f) {
                this.f60460l1 = c3538f;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                C3538f c3538f;
                String str2;
                boolean z11;
                try {
                    if (!C11621p0.this.f60422k.mo60294yp() && C11621p0.this.f60422k.m92676n2() != null) {
                        a aVar = a.this;
                        if (aVar.f60455c) {
                            c3538f = this.f60460l1;
                        } else {
                            c3538f = C11621p0.this.f60413f0;
                        }
                        if (c3538f != null) {
                            str2 = c3538f.f14931g;
                        } else {
                            str2 = "";
                        }
                        boolean z12 = true;
                        if (!TextUtils.isEmpty(str2) && TextUtils.equals(str2, str)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c3979l == null || c3979l.m18839c() == null || c3979l.m18839c().getWidth() <= 0 || c3979l.m18839c().getHeight() <= 0) {
                            z12 = false;
                        }
                        if (z11) {
                            if (z12) {
                                a aVar2 = a.this;
                                if (aVar2.f60455c && C11621p0.this.f60414g.getImageInfo() != null) {
                                    C3979l imageInfo = C11621p0.this.f60414g.getImageInfo();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(imageInfo);
                                    arrayList.add(c3979l);
                                    C11621p0.this.f60414g.setImageInfo(new C3980m(arrayList), false);
                                } else {
                                    C11621p0.this.f60414g.setImageInfo(c3979l, false);
                                }
                                C11621p0 c11621p0 = C11621p0.this;
                                ChatFrameLayout chatFrameLayout = c11621p0.f60408d;
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(C11621p0.this.f60422k.m92651WI(), c3979l.m18839c());
                                a aVar3 = a.this;
                                c11621p0.m64719F2(chatFrameLayout, bitmapDrawable, true, aVar3.f60456d, aVar3.f60457e);
                                a.this.f60458f.mo16746a();
                                return;
                            }
                            try {
                                AbstractC20130d.m104858T0(new File(str));
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                            a.this.f60458f.mo16747b();
                        }
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e12);
                    a.this.f60458f.mo16747b();
                }
            }
        }

        a(String str, C24003n c24003n, boolean z11, boolean z12, boolean z13, InterfaceC3299a interfaceC3299a) {
            this.f60453a = str;
            this.f60454b = c24003n;
            this.f60455c = z11;
            this.f60456d = z12;
            this.f60457e = z13;
            this.f60458f = interfaceC3299a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ((C23528a) C11621p0.this.f60422k.f56738C1.m123612r(C11621p0.this.f60414g)).m123579C(this.f60453a, this.f60454b, (C23999j) new C32753a(C7960e.m41971c6().m42175K5(C11621p0.this.f60422k.f56789Q1.m153888F().m17944I0())).m125601Y0(10));
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$b */
    /* loaded from: classes5.dex */
    public class b implements InterfaceC3299a {

        /* renamed from: a */
        final /* synthetic */ C3538f f60462a;

        b(C3538f c3538f) {
            this.f60462a = c3538f;
        }

        @Override // c60.InterfaceC3299a
        /* renamed from: a */
        public void mo16746a() {
            C11621p0.this.m64725H3(false, this.f60462a);
        }

        @Override // c60.InterfaceC3299a
        /* renamed from: b */
        public void mo16747b() {
            C11621p0 c11621p0 = C11621p0.this;
            c11621p0.m64724H2(c11621p0.f60408d);
            C11621p0.this.m64725H3(true, this.f60462a);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$c */
    /* loaded from: classes5.dex */
    public class c implements LiveLocationBar.InterfaceC8979b {

        /* renamed from: a */
        final /* synthetic */ C8969o f60464a;

        /* renamed from: b */
        final /* synthetic */ List f60465b;

        c(C8969o c8969o, List list) {
            this.f60464a = c8969o;
            this.f60465b = list;
        }

        @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
        /* renamed from: a */
        public void mo48007a() {
            C8969o c8969o = this.f60464a;
            if (c8969o == null) {
                if (!this.f60465b.isEmpty()) {
                    c8969o = (C8969o) this.f60465b.get(0);
                } else {
                    c8969o = null;
                }
            }
            if (c8969o != null) {
                C8967m.m47888f0(C11621p0.this.f60422k.m92676n2(), null, c8969o.f47981b, c8969o.f47980a, c8969o.f47984e, c8969o.f47985f, 6);
            }
        }

        @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
        /* renamed from: b */
        public void mo48008b() {
            if (this.f60464a != null) {
                C8967m.m47867E().m47938t(this.f60464a);
            }
        }

        @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
        /* renamed from: c */
        public void mo48009c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.p0$d */
    /* loaded from: classes5.dex */
    public class d extends AbstractAnimationAnimationListenerC20277g {
        d() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C11621p0.this.f60409d0 = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$e */
    /* loaded from: classes5.dex */
    public class e extends AbstractAnimationAnimationListenerC20277g {
        e() {
        }

        /* renamed from: b */
        public /* synthetic */ void m64839b() {
            try {
                C11621p0.this.f60397V.setVisibility(8);
                C11621p0.this.f60409d0 = null;
                C11621p0 c11621p0 = C11621p0.this;
                c11621p0.f60408d.removeView(c11621p0.f60397V);
                C11621p0 c11621p02 = C11621p0.this;
                c11621p02.f60408d.f56694f0 = null;
                c11621p02.f60397V = null;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C11621p0.this.f60424l.post(new Runnable() { // from class: com.zing.zalo.ui.chat.q0
                public /* synthetic */ RunnableC11682q0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.e.this.m64839b();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$f */
    /* loaded from: classes5.dex */
    public class f implements StickyChatThemesView.InterfaceC11825e {

        /* renamed from: com.zing.zalo.ui.chat.p0$f$a */
        /* loaded from: classes5.dex */
        class a implements InterfaceC3299a {

            /* renamed from: a */
            final /* synthetic */ C3538f f60470a;

            a(C3538f c3538f) {
                this.f60470a = c3538f;
            }

            @Override // c60.InterfaceC3299a
            /* renamed from: a */
            public void mo16746a() {
                try {
                    if (C11621p0.this.f60422k.m92672lJ()) {
                        C11621p0.this.m64627P3(this.f60470a);
                        C11621p0.this.m64728I3(this.f60470a);
                        C11621p0.this.m64748T2(this.f60470a);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                }
            }

            @Override // c60.InterfaceC3299a
            /* renamed from: b */
            public void mo16747b() {
                if (C11621p0.this.f60422k.m92672lJ()) {
                    ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.chat.p0$f$b */
        /* loaded from: classes5.dex */
        class b implements InterfaceC3299a {

            /* renamed from: a */
            final /* synthetic */ C3538f f60472a;

            b(C3538f c3538f) {
                this.f60472a = c3538f;
            }

            @Override // c60.InterfaceC3299a
            /* renamed from: a */
            public void mo16746a() {
                try {
                    if (C11621p0.this.f60422k.m92672lJ()) {
                        C11621p0.this.m64627P3(this.f60472a);
                        C11621p0.this.m64728I3(this.f60472a);
                        C11621p0.this.m64748T2(this.f60472a);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                }
            }

            @Override // c60.InterfaceC3299a
            /* renamed from: b */
            public void mo16747b() {
                if (C11621p0.this.f60422k.m92672lJ()) {
                    ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.chat.p0$f$c */
        /* loaded from: classes5.dex */
        public class c extends C24002m {

            /* renamed from: A0 */
            final /* synthetic */ InterfaceC3299a f60474A0;

            /* renamed from: y0 */
            final /* synthetic */ String f60476y0;

            /* renamed from: z0 */
            final /* synthetic */ C3538f f60477z0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(int i11, String str, C3538f c3538f, InterfaceC3299a interfaceC3299a) {
                super(i11);
                this.f60476y0 = str;
                this.f60477z0 = c3538f;
                this.f60474A0 = interfaceC3299a;
            }

            /* renamed from: S1 */
            public /* synthetic */ void m64850S1(C3538f c3538f, String str, InterfaceC3299a interfaceC3299a) {
                C3538f m64835z0;
                try {
                    if (C11621p0.this.f60422k.m92672lJ() && (m64835z0 = C11621p0.this.m64835z0()) != null && m64835z0.f14925a.equals(c3538f.f14925a)) {
                        if (AbstractC23041d2.m118194A(str)) {
                            c3538f.f14931g = str;
                            C11621p0.this.f60428n.m106864j(c3538f);
                            C11621p0.this.m64711C2(str, false, interfaceC3299a, false, true);
                        } else {
                            ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
                        }
                        C11621p0.this.m64747S2(null);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                }
            }

            /* renamed from: T1 */
            public /* synthetic */ void m64851T1(C3538f c3538f) {
                C3538f m64835z0;
                try {
                    if (C11621p0.this.f60422k.m92672lJ() && (m64835z0 = C11621p0.this.m64835z0()) != null && m64835z0.f14925a.equals(c3538f.f14925a)) {
                        if (C23055e5.m118272g(true)) {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.unknown_error));
                        }
                        C11621p0.this.m64747S2(null);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                }
            }

            @Override // p379o3.C24002m
            /* renamed from: E1 */
            protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
                if (file != null) {
                    try {
                        if (file.exists() && c23995f.m125657h() == 200) {
                            try {
                                if (AbstractC23009a3.m117961l(this.f60476y0) == null) {
                                    AbstractC20130d.m104858T0(new File(this.f60476y0));
                                }
                            } catch (Exception e11) {
                                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                            }
                            C11621p0.this.f60424l.post(new Runnable() { // from class: com.zing.zalo.ui.chat.t0

                                /* renamed from: q */
                                public final /* synthetic */ C3538f f60917q;

                                /* renamed from: r */
                                public final /* synthetic */ String f60918r;

                                /* renamed from: s */
                                public final /* synthetic */ InterfaceC3299a f60919s;

                                public /* synthetic */ RunnableC11715t0(C3538f c3538f, String str2, InterfaceC3299a interfaceC3299a) {
                                    r2 = c3538f;
                                    r3 = str2;
                                    r4 = interfaceC3299a;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C11621p0.f.c.this.m64850S1(r2, r3, r4);
                                }
                            });
                            return;
                        }
                    } catch (Exception e12) {
                        AbstractC23350e.m122776f(C11621p0.f60375z0, e12);
                        return;
                    }
                }
                C11621p0.this.f60424l.post(new Runnable() { // from class: com.zing.zalo.ui.chat.u0

                    /* renamed from: q */
                    public final /* synthetic */ C3538f f60936q;

                    public /* synthetic */ RunnableC11721u0(C3538f c3538f) {
                        r2 = c3538f;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C11621p0.f.c.this.m64851T1(r2);
                    }
                });
            }
        }

        f() {
        }

        /* renamed from: g */
        public /* synthetic */ void m64842g(boolean z11) {
            try {
                if (z11) {
                    C3538f m64705A0 = C11621p0.this.m64705A0();
                    C3538f m64835z0 = C11621p0.this.m64835z0();
                    String str = "";
                    if (C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17971y0().m41013q()) {
                        str = C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17944I0();
                    }
                    C11621p0.this.m64730J3(m64705A0, m64835z0, str);
                    return;
                }
                C11621p0.this.f60428n.m106859e(true, C11621p0.this.f60419i0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }

        /* renamed from: h */
        public /* synthetic */ void m64843h(boolean z11) {
            C11621p0.this.f60424l.post(new Runnable() { // from class: com.zing.zalo.ui.chat.s0

                /* renamed from: q */
                public final /* synthetic */ boolean f60914q;

                public /* synthetic */ RunnableC11713s0(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.f.this.m64842g(r2);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.chat.widget.theme.StickyChatThemesView.InterfaceC11825e
        /* renamed from: a */
        public void mo64844a() {
            C11621p0.this.f60428n.m106859e(true, C11621p0.this.f60419i0);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.theme.StickyChatThemesView.InterfaceC11825e
        /* renamed from: b */
        public void mo64845b() {
            C11621p0.this.f60428n.m106856b(new C20559a.f() { // from class: com.zing.zalo.ui.chat.r0
                public /* synthetic */ C11684r0() {
                }

                @Override // p240ii.C20559a.f
                /* renamed from: a */
                public final void mo65084a(boolean z11) {
                    C11621p0.f.this.m64843h(z11);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.chat.widget.theme.StickyChatThemesView.InterfaceC11825e
        /* renamed from: c */
        public void mo64846c(C3538f c3538f) {
            boolean z11;
            if (c3538f != null) {
                try {
                    C11621p0 c11621p0 = C11621p0.this;
                    c11621p0.f60413f0 = c3538f;
                    if (c11621p0.m64835z0() != null && C11621p0.this.m64835z0().f14925a.equals(c3538f.f14925a)) {
                        return;
                    }
                    C11621p0.this.m64743Q2(c3538f);
                    C3538f c3538f2 = null;
                    C11621p0.this.m64747S2(null);
                    if (c3538f.m17983b()) {
                        ColorDrawable colorDrawable = new ColorDrawable(ChatView.f56727K4);
                        C11621p0 c11621p02 = C11621p0.this;
                        c11621p02.m64719F2(c11621p02.f60408d, colorDrawable, true, true, false);
                        C11621p0.this.m64627P3(c3538f);
                        C11621p0.this.m64728I3(c3538f);
                        C11621p0.this.m64748T2(c3538f);
                    } else if (TextUtils.isEmpty(c3538f.f14927c)) {
                        C11621p0.this.m64711C2(c3538f.f14931g, false, new a(c3538f), false, true);
                    } else {
                        b bVar = new b(c3538f);
                        String str = C20131e.f99303a.m104953g() + c3538f.m17982a();
                        File file = new File(str);
                        if (file.exists() && !C24002m.m125822K1(c3538f.f14927c)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        C11621p0 c11621p03 = C11621p0.this;
                        if (!z11) {
                            c3538f2 = c3538f;
                        }
                        c11621p03.m64747S2(c3538f2);
                        ((C23528a) C11621p0.this.f60426m.m123612r(C11621p0.f60374C0)).m123601f(c3538f.f14927c, file, new c(3, str, c3538f, bVar));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                    return;
                }
            }
            AbstractC23647d.m123906p("924001");
            AbstractC23647d.m123893c();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.theme.StickyChatThemesView.InterfaceC11825e
        /* renamed from: d */
        public void mo64847d() {
            if (C11621p0.this.f60422k.m92676n2() != null && C11621p0.this.f60422k.m92662fJ() != null) {
                C11621p0.this.m64747S2(null);
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_csc_change_background", "comm_csc"));
                AbstractC23211s7.m119589v(C11621p0.this.f60422k.m92676n2(), 1027, 5, true, bundle);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$g */
    /* loaded from: classes5.dex */
    public class g extends ActionBar.C17431a {

        /* renamed from: com.zing.zalo.ui.chat.p0$g$a */
        /* loaded from: classes5.dex */
        public class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C3538f f60479a;

            a(C3538f c3538f) {
                this.f60479a = c3538f;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                try {
                    C7960e.m41971c6().m42201M7(this.f60479a, C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17944I0());
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                }
            }
        }

        g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:            r6 = "9240062";     */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m64854e(C3538f c3538f, C3535c c3535c, EnumC18030a enumC18030a) {
            boolean z11;
            String str;
            String str2;
            String str3;
            try {
                C3538f m64835z0 = C11621p0.this.m64835z0();
                if (new File(C20131e.f99303a.m104953g() + m64835z0.m17982a()).exists() && !C24002m.m125822K1(m64835z0.f14927c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c3538f == null) {
                    String m122040j1 = AbstractC23309i.m122040j1();
                    C3538f c3538f2 = new C3538f();
                    if (TextUtils.isEmpty(m122040j1)) {
                        m122040j1 = "0";
                    }
                    c3538f2.f14925a = m122040j1;
                    c3538f = c3538f2;
                }
                if (!m64835z0.m17983b() && !TextUtils.isEmpty(m64835z0.f14927c) && !z11 && !m64835z0.f14925a.equals(c3538f.f14925a)) {
                    ToastUtils.m89266n(AbstractC8020f0.str_chat_theme_not_allow_done_when_loading, new Object[0]);
                    return;
                }
                boolean m64821u0 = C11621p0.this.m64821u0();
                if (!m64835z0.f14925a.equals(c3538f.f14925a) || m64821u0) {
                    C0824j.m2153b(new a(m64835z0));
                    boolean isEmpty = TextUtils.isEmpty(m64835z0.f14927c);
                    if (m64821u0) {
                        C31983k0 c31983k0 = C11621p0.this.f60422k.f56789Q1;
                        if (isEmpty) {
                            str3 = m64835z0.f14931g;
                        } else {
                            str3 = "";
                        }
                        c31983k0.m153889F0(c3535c, enumC18030a, str3, m64835z0);
                    } else {
                        AbstractC19656s0.m103076s(c3535c.m17944I0(), m64835z0);
                    }
                    if (!m64835z0.m17983b() && TextUtils.isEmpty(m64835z0.f14927c)) {
                        str = "924003";
                        AbstractC23647d.m123906p(str);
                        AbstractC23647d.m123893c();
                        if (!m64835z0.m17983b() && TextUtils.isEmpty(m64835z0.f14927c)) {
                            if (!m64821u0) {
                                str2 = "9240064";
                            } else {
                                str2 = "9240063";
                            }
                            AbstractC23647d.m123906p(str2);
                            AbstractC23647d.m123893c();
                        }
                        str2 = "9240061";
                        AbstractC23647d.m123906p(str2);
                        AbstractC23647d.m123893c();
                    }
                    str = "924002";
                    AbstractC23647d.m123906p(str);
                    AbstractC23647d.m123893c();
                    if (!m64835z0.m17983b()) {
                        if (!m64821u0) {
                        }
                        AbstractC23647d.m123906p(str2);
                        AbstractC23647d.m123893c();
                    }
                    str2 = "9240061";
                    AbstractC23647d.m123906p(str2);
                    AbstractC23647d.m123893c();
                }
                C11621p0.this.m64794m0();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m64855f(C3535c c3535c, EnumC18030a enumC18030a, C3538f c3538f) {
            C11621p0.this.f60424l.post(new Runnable() { // from class: com.zing.zalo.ui.chat.w0

                /* renamed from: q */
                public final /* synthetic */ C3538f f60945q;

                /* renamed from: r */
                public final /* synthetic */ C3535c f60946r;

                /* renamed from: s */
                public final /* synthetic */ EnumC18030a f60947s;

                public /* synthetic */ RunnableC11725w0(C3538f c3538f2, C3535c c3535c2, EnumC18030a enumC18030a2) {
                    r2 = c3538f2;
                    r3 = c3535c2;
                    r4 = enumC18030a2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.g.this.m64854e(r2, r3, r4);
                }
            });
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            try {
                if (i11 == AbstractC6918a0.menu_done) {
                    if (C11621p0.this.f60422k.m59962cU()) {
                        ToastUtils.m89266n(AbstractC8020f0.str_feature_not_available_for_stranger, new Object[0]);
                        C11621p0.this.m64794m0();
                        return;
                    } else {
                        C11621p0.this.f60428n.m106858d(C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17944I0(), new C20559a.g() { // from class: com.zing.zalo.ui.chat.v0

                            /* renamed from: b */
                            public final /* synthetic */ C3535c f60940b;

                            /* renamed from: c */
                            public final /* synthetic */ EnumC18030a f60941c;

                            public /* synthetic */ C11723v0(C3535c c3535c, EnumC18030a enumC18030a) {
                                r2 = c3535c;
                                r3 = enumC18030a;
                            }

                            @Override // p240ii.C20559a.g
                            /* renamed from: a */
                            public final void mo65307a(C3538f c3538f) {
                                C11621p0.g.this.m64855f(r2, r3, c3538f);
                            }
                        });
                        return;
                    }
                }
                if (i11 == 16908332) {
                    C11621p0.this.m64794m0();
                    AbstractC23647d.m123906p("924004");
                    AbstractC23647d.m123893c();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$h */
    /* loaded from: classes5.dex */
    public class h implements C20559a.h {
        h() {
        }

        /* renamed from: f */
        public /* synthetic */ void m64858f() {
            try {
                if (C11621p0.this.f60422k.m92672lJ()) {
                    C11621p0.this.f60428n.f100944b = false;
                    C11621p0.this.m64780h3(false, false);
                    if (C11621p0.this.f60428n.m106862h()) {
                        C11621p0.this.m64745R2(true);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }

        /* renamed from: g */
        public /* synthetic */ void m64859g() {
            try {
                if (C11621p0.this.f60422k.m92672lJ()) {
                    C11621p0.this.m64780h3(false, false);
                    C3538f m64705A0 = C11621p0.this.m64705A0();
                    C3538f m64835z0 = C11621p0.this.m64835z0();
                    String str = "";
                    if (C11621p0.this.f60422k.m60020gQ().mo60624Q7()) {
                        str = C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17944I0();
                    }
                    C11621p0.this.m64730J3(m64705A0, m64835z0, str);
                    C11621p0.this.f60428n.f100945c++;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                C11621p0.this.f60428n.f100944b = false;
            }
        }

        @Override // p240ii.C20559a.h
        /* renamed from: a */
        public void mo64860a() {
            C11621p0.this.f60424l.post(new Runnable() { // from class: com.zing.zalo.ui.chat.x0
                public /* synthetic */ RunnableC11828x0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.h.this.m64859g();
                }
            });
        }

        @Override // p240ii.C20559a.h
        /* renamed from: b */
        public void mo64861b() {
            C11621p0.this.f60424l.post(new Runnable() { // from class: com.zing.zalo.ui.chat.y0
                public /* synthetic */ RunnableC11830y0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.h.this.m64858f();
                }
            });
        }

        @Override // p240ii.C20559a.h
        /* renamed from: c */
        public void mo64862c(boolean z11, boolean z12) {
            C11621p0.this.m64780h3(z11, z12);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$i */
    /* loaded from: classes5.dex */
    public class i implements NewMultiPhotoSuggestView.InterfaceC11770h {
        i() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView.InterfaceC11770h
        /* renamed from: a */
        public void mo64863a(int i11) {
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = C11621p0.this.f60423k0;
            if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0) {
                AbstractC23647d.m123897g("122001");
                C11621p0 c11621p0 = C11621p0.this;
                if (c11621p0.f60425l0 != null) {
                    c11621p0.f60424l.removeCallbacks(C11621p0.this.f60425l0);
                }
                C11621p0.this.f60422k.m60192rT(C11621p0.this.f60423k0.getCurrentItemList(), C11621p0.this.f60423k0.getCurrentSelectedItemList(), i11, C11621p0.this.f60423k0);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView.InterfaceC11770h
        /* renamed from: b */
        public void mo64864b(int i11) {
            C11621p0 c11621p0 = C11621p0.this;
            if (c11621p0.f60425l0 != null) {
                c11621p0.f60424l.removeCallbacks(C11621p0.this.f60425l0);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView.InterfaceC11770h
        /* renamed from: c */
        public void mo64865c(int i11) {
            if (C11621p0.this.f60422k.m60020gQ().mo60615Oc().m136068l0() - C11621p0.this.f60430o > 0) {
                if (i11 == 2) {
                    AbstractC23647d.m123897g("122115");
                } else if (i11 == 3) {
                    AbstractC23647d.m123897g("122116");
                } else if (i11 == 1) {
                    AbstractC23647d.m123897g("122117");
                }
            }
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = C11621p0.this.f60423k0;
            if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0) {
                C11621p0.this.m64721G0();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView.InterfaceC11770h
        /* renamed from: d */
        public void mo64866d() {
            C11621p0 c11621p0 = C11621p0.this;
            if (c11621p0.f60425l0 != null) {
                c11621p0.f60424l.removeCallbacks(C11621p0.this.f60425l0);
            }
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = C11621p0.this.f60423k0;
            if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getMode() == 1) {
                C11621p0.this.f60422k.m60020gQ().mo60691bd();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView.InterfaceC11770h
        /* renamed from: e */
        public void mo64867e() {
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = C11621p0.this.f60423k0;
            if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0) {
                C11621p0.this.f60422k.f56789Q1.m153923u0(C11621p0.this.f60423k0.getCurrentItemList(), 14, 15, null);
                C11621p0.this.m64721G0();
                if (C11621p0.this.f60423k0.getCurrentItemList().size() > 1) {
                    C11621p0 c11621p0 = C11621p0.this;
                    c11621p0.m64717E3(c11621p0.f60423k0.getCurrentItemList());
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView.InterfaceC11770h
        /* renamed from: f */
        public void mo64868f(MediaItem mediaItem) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaItem);
            C11621p0.this.f60422k.f56789Q1.m153923u0(arrayList, 14, 15, null);
            AbstractC23647d.m123897g("122004");
            C11621p0.this.m64717E3(arrayList);
            C11621p0 c11621p0 = C11621p0.this;
            if (c11621p0.f60425l0 != null) {
                c11621p0.f60424l.removeCallbacks(C11621p0.this.f60425l0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$j */
    /* loaded from: classes5.dex */
    public class j extends AnimatorListenerAdapter {
        j() {
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$k */
    /* loaded from: classes5.dex */
    public class k implements ChatFrameLayout.InterfaceC11268a {
        k() {
        }

        @Override // com.zing.zalo.p077ui.chat.ChatFrameLayout.InterfaceC11268a
        /* renamed from: y1 */
        public void mo59220y1(int i11) {
            C11621p0.this.f60422k.m60035hT();
        }

        @Override // com.zing.zalo.p077ui.chat.ChatFrameLayout.InterfaceC11268a
        /* renamed from: z3 */
        public void mo59221z3(int i11) {
            C11621p0.this.f60422k.m60298z3(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$l */
    /* loaded from: classes5.dex */
    public class l extends AnimatorListenerAdapter {
        l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = C11621p0.this.f60423k0;
            if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0) {
                C11621p0.this.f60423k0.setVisibility(8);
                C11621p0 c11621p0 = C11621p0.this;
                c11621p0.f60408d.removeView(c11621p0.f60423k0);
                C11621p0 c11621p02 = C11621p0.this;
                c11621p02.f60408d.f56697i0 = null;
                c11621p02.f60423k0 = null;
                c11621p02.f60422k.m60020gQ().mo60838y5();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$m */
    /* loaded from: classes5.dex */
    public class m extends AnimatorListenerAdapter {
        m() {
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$n */
    /* loaded from: classes5.dex */
    public class n implements SuggestLinkModulesView.InterfaceC12415c {

        /* renamed from: a */
        final /* synthetic */ ChatAttachmentContainer.C11728c f60487a;

        n(ChatAttachmentContainer.C11728c c11728c) {
            this.f60487a = c11728c;
        }

        @Override // com.zing.zalo.p077ui.moduleview.csc.SuggestLinkModulesView.InterfaceC12415c
        /* renamed from: a */
        public void mo64869a(SuggestLinkModulesView suggestLinkModulesView, ChatAttachmentContainer.C11728c c11728c) {
            C32098s c32098s;
            C32098s.a aVar;
            AbstractC2379w.m12430d(C11621p0.this.f60402a);
            C11621p0.this.m64715E0();
            if (this.f60487a.m65328f() != null) {
                C18013y0 m65328f = this.f60487a.m65328f();
                C32098s c32098s2 = m65328f.f91251B;
                if (c32098s2 != null && c32098s2.m154940j() && (aVar = (c32098s = m65328f.f91251B).f147975y) != null) {
                    AbstractC9183a.m49006n(m65328f.f91014s, new C17584c(SendProductSource.ChatSuggestCopiedLink.f48780q, c32098s.f147956f, aVar));
                }
                C11621p0.this.f60422k.f56789Q1.m153917o0(this.f60487a.m65328f(), null, null);
            }
        }

        @Override // com.zing.zalo.p077ui.moduleview.csc.SuggestLinkModulesView.InterfaceC12415c
        /* renamed from: b */
        public void mo64870b(SuggestLinkModulesView suggestLinkModulesView) {
            C11621p0.this.m64715E0();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$o */
    /* loaded from: classes5.dex */
    public class o extends AnimatorListenerAdapter {
        o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (C11621p0.this.f60431o0 != null) {
                    C11621p0 c11621p0 = C11621p0.this;
                    if (c11621p0.f60408d != null) {
                        c11621p0.f60431o0.setVisibility(8);
                        C11621p0 c11621p02 = C11621p0.this;
                        c11621p02.f60408d.removeView(c11621p02.f60431o0);
                        C11621p0 c11621p03 = C11621p0.this;
                        c11621p03.f60408d.f56701m0 = null;
                        c11621p03.f60431o0 = null;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$p */
    /* loaded from: classes5.dex */
    public class p implements Runnable {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.p0$p$a */
        /* loaded from: classes5.dex */
        public class a implements Runnable {

            /* renamed from: com.zing.zalo.ui.chat.p0$p$a$a */
            /* loaded from: classes5.dex */
            class C32754a extends AbstractC27162p2 {
                C32754a(ViewGroup viewGroup, C11621p0 c11621p0) {
                    super(viewGroup, c11621p0);
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!C11621p0.this.f60422k.m92674mJ()) {
                        return;
                    }
                    AbstractC23306f.m120602N0().m109071S1(true);
                    C11621p0 c11621p0 = C11621p0.this;
                    c11621p0.f60449x0 = new C32754a(c11621p0.f60408d, c11621p0);
                    C11621p0.this.f60449x0.mo123719k();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
                }
            }
        }

        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21373a.f104231a.m110782A()) {
                AbstractC19444a.m101695c(new a());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$q */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class q {

        /* renamed from: a */
        static final /* synthetic */ int[] f60493a;

        static {
            int[] iArr = new int[EnumC18030a.values().length];
            f60493a = iArr;
            try {
                iArr[EnumC18030a.SINGLE_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$r */
    /* loaded from: classes5.dex */
    public class r implements QuickReplySuggestionContainer.InterfaceC11786a {
        r() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.quickreply.QuickReplySuggestionContainer.InterfaceC11786a
        /* renamed from: a */
        public void mo64871a() {
            C11621p0.this.m64723H0();
            QuickReplySuggestionContainer quickReplySuggestionContainer = C11621p0.this.f60438s;
            if (quickReplySuggestionContainer != null) {
                C2526d.f10270a.m12730w(C17988o1.a.f91106q, quickReplySuggestionContainer.getQuickReplyGlobalMsgId());
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.quickreply.QuickReplySuggestionContainer.InterfaceC11786a
        /* renamed from: b */
        public void mo64872b(String str, String str2) {
            QuickReplySuggestionContainer quickReplySuggestionContainer = C11621p0.this.f60438s;
            if (quickReplySuggestionContainer != null) {
                C2526d.f10270a.m12730w(C17988o1.a.f91107r, quickReplySuggestionContainer.getQuickReplyGlobalMsgId());
            }
            C11621p0.this.f60422k.mo60271wv(str, str2, null, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$s */
    /* loaded from: classes5.dex */
    public class s extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ CustomRecyclerView f60495a;

        s(CustomRecyclerView customRecyclerView) {
            this.f60495a = customRecyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                C11621p0.this.f60422k.m60020gQ().mo60669Xe();
                if (C3255n.m16555f()) {
                    C11621p0.this.f60440t.m65704v0(false);
                    try {
                        int m10127i = C11621p0.this.f60432p.m10127i();
                        for (int i12 = 0; i12 < m10127i; i12++) {
                            RecyclerView.AbstractC1876c0 m9902v0 = this.f60495a.m9902v0(i12);
                            if (m9902v0 instanceof C11815a.e) {
                                AbstractC23350e.m122772b(i12 + " initSuggestBannerListView - itemCountInLayout - " + m9902v0.f7784p.getClass(), new Object[0]);
                                ((C11815a.e) m9902v0).m65707i0();
                            }
                        }
                        return;
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        return;
                    }
                }
                return;
            }
            if (C3255n.m16555f()) {
                C11621p0.this.f60440t.m65704v0(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$t */
    /* loaded from: classes5.dex */
    public class t implements C11815a.g {
        t() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: I2 */
        public void mo56865I2(C31902e9 c31902e9) {
            C11621p0.this.f60422k.m60020gQ().mo60576I2(c31902e9);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: a */
        public boolean mo56866a() {
            return C11621p0.this.f60422k.m60020gQ().mo60833x5(1);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: b */
        public void mo56867b() {
            C11621p0.this.f60422k.m60020gQ().mo60717ep(C11621p0.this.f60422k);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: c */
        public void mo56868c() {
            C11621p0.this.f60422k.m60020gQ().mo60544Bo();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: d */
        public void mo56869d(C31902e9 c31902e9, int i11, int i12, int i13) {
            C11621p0.this.f60422k.m60020gQ().mo60744i6(C11621p0.this.f60422k, C11621p0.this.f60422k.mo59970cv(), c31902e9, i11, i12, i13);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: e */
        public void mo56870e() {
            C11621p0.this.f60422k.m60020gQ().mo60671Yh();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: f */
        public void mo56871f(C31902e9 c31902e9, int i11, int i12, int i13, AbstractC19215a abstractC19215a) {
            C11621p0.this.f60436r.requestDisallowInterceptTouchEvent(true);
            C11621p0.this.f60422k.m60020gQ().mo60679Zh(C11621p0.this.f60422k.mo59970cv(), c31902e9, i11, i12, i13, abstractC19215a);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: i3 */
        public void mo56872i3(C31902e9 c31902e9) {
            C11621p0.this.f60422k.m60020gQ().mo60742i3(c31902e9);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$u */
    /* loaded from: classes5.dex */
    public class u implements Animator.AnimatorListener {
        u() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C11621p0.this.f60377B = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11621p0.this.f60377B = true;
            C11621p0.this.f60434q.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$v */
    /* loaded from: classes5.dex */
    public class v implements Animator.AnimatorListener {
        v() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!C11621p0.this.f60422k.m92677nJ() && !C11621p0.this.f60422k.m92681pJ()) {
                C11621p0.this.f60379D = false;
                C11621p0.this.f60422k.m60020gQ().mo60629Qn();
                C11621p0.this.m64608J0();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11621p0.this.f60379D = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$w */
    /* loaded from: classes5.dex */
    public class w implements C7173p5.g {
        w() {
        }

        @Override // com.zing.zalo.adapters.C7173p5.g
        /* renamed from: a */
        public void mo36470a() {
            C11621p0.this.f60422k.m60020gQ().mo60826wd();
        }

        @Override // com.zing.zalo.adapters.C7173p5.g
        /* renamed from: b */
        public void mo36471b(C31902e9 c31902e9, int i11, int i12, int i13) {
            C11621p0.this.f60422k.m60020gQ().mo60760lj(C11621p0.this.f60422k.mo59970cv(), c31902e9, i11, i12, i13);
        }

        @Override // com.zing.zalo.adapters.C7173p5.g
        /* renamed from: c */
        public void mo36472c(C31902e9 c31902e9) {
            C11621p0.this.f60422k.m60020gQ().mo60703dc(c31902e9);
        }

        @Override // com.zing.zalo.adapters.C7173p5.g
        /* renamed from: d */
        public void mo36473d(C31902e9 c31902e9, int i11, int i12, int i13) {
            C11621p0.this.f60422k.m60020gQ().mo60809u9(C11621p0.this.f60422k.mo59970cv(), c31902e9, i11, i12, i13);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$x */
    /* loaded from: classes5.dex */
    public class x implements InterfaceC3299a {

        /* renamed from: a */
        final /* synthetic */ C3538f f60501a;

        x(C3538f c3538f) {
            this.f60501a = c3538f;
        }

        @Override // c60.InterfaceC3299a
        /* renamed from: a */
        public void mo16746a() {
            C11621p0.this.m64725H3(false, this.f60501a);
        }

        @Override // c60.InterfaceC3299a
        /* renamed from: b */
        public void mo16747b() {
            C11621p0 c11621p0 = C11621p0.this;
            c11621p0.m64724H2(c11621p0.f60408d);
            C11621p0.this.m64725H3(true, this.f60501a);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$y */
    /* loaded from: classes5.dex */
    public class y extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ boolean f60503l1;

        y(boolean z11) {
            this.f60503l1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            boolean z11;
            ContactProfile m141809c;
            try {
                if (!C11621p0.this.f60422k.mo60294yp() && C11621p0.this.f60422k.m92676n2() != null && C11621p0.this.f60422k.m60020gQ().mo60837xo()) {
                    C3535c mo60615Oc = C11621p0.this.f60422k.m60020gQ().mo60615Oc();
                    String str2 = mo60615Oc.m17971y0().f42900x;
                    if (TextUtils.isEmpty(str2) && (m141809c = C28203u6.f131407a.m141809c(mo60615Oc.m17944I0())) != null && !TextUtils.isEmpty(m141809c.f42351K)) {
                        str2 = m141809c.f42351K;
                    }
                    boolean z12 = true;
                    if (!TextUtils.isEmpty(str2) && TextUtils.equals(str2, str)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c3979l == null || c3979l.m18839c() == null || c3979l.m18839c().getWidth() <= 0 || c3979l.m18839c().getHeight() <= 0) {
                        z12 = false;
                    }
                    if (z11 && z12) {
                        if (C11621p0.this.f60412f.getImageInfo() != null) {
                            C3979l imageInfo = C11621p0.this.f60412f.getImageInfo();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(imageInfo);
                            arrayList.add(c3979l);
                            C11621p0.this.f60412f.setImageInfo(new C3980m(arrayList), false);
                        } else {
                            C11621p0.this.f60412f.setImageInfo(c3979l, false);
                        }
                        C11621p0 c11621p0 = C11621p0.this;
                        c11621p0.m64719F2(c11621p0.f60408d, new BitmapDrawable(C11621p0.this.f60422k.m92651WI(), c3979l.m18839c()), true, true, this.f60503l1);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.p0$z */
    /* loaded from: classes5.dex */
    public class z implements C26674y.b {

        /* renamed from: a */
        ContactProfile f60505a;

        /* renamed from: b */
        boolean f60506b;

        /* synthetic */ z(C11621p0 c11621p0, AbstractC27660gd abstractC27660gd) {
            this();
        }

        /* renamed from: c */
        public /* synthetic */ void m64874c(String str, int i11, String str2, C26657h c26657h) {
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            boolean z14;
            boolean z15;
            boolean z16;
            int i13;
            try {
                if (!TextUtils.isEmpty(C11621p0.this.f60384I) && TextUtils.equals(C11621p0.this.f60384I, str)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (C11621p0.this.f60422k.m92674mJ() && !C11621p0.this.f60422k.m92681pJ() && C11621p0.this.f60422k.m92672lJ() && C11621p0.this.f60422k.m92676n2() != null && C11621p0.this.f60422k.mo59787QH() && z11) {
                    if (C11621p0.this.f60422k.f56819X3 != null && (C11621p0.this.f60422k.f56819X3.m75574B() || C11621p0.this.f60422k.f56819X3.m75575C())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!C11621p0.this.f60422k.mo60244v2() && ZaloBubbleActivity.m57017B5()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !C11621p0.this.f60422k.mo59727Ly() && !C11621p0.this.f60422k.mo60120mu() && !C11621p0.this.f60422k.mo59886Wb() && !C11621p0.this.f60422k.mo60249vF() && !C11621p0.this.f60417h0 && !z13 && i11 == 0 && str2 != null && c26657h != null && (i12 = c26657h.f126157b) > 0) {
                        if (i12 == 14) {
                            if (c26657h.f126162g != null) {
                                C23744a.m124114c().m124116d(4, new Object[0]);
                                C25979a.m133815f(C11621p0.this.f60422k, str, str2, c26657h.f126162g);
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("extra_asset_path", str2);
                            bundle.putString("extra_metadata_name", "metadata");
                            bundle.putInt("extra_effect_type", c26657h.f126157b);
                            if (!TextUtils.isEmpty(C11621p0.this.f60385J) && TextUtils.equals(C11621p0.this.f60385J, CoreUtility.f89233i)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            Conversation m17971y0 = C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17971y0();
                            C11621p0 c11621p0 = C11621p0.this;
                            if (!c11621p0.f60390O) {
                                if (z14) {
                                    i13 = 1;
                                } else {
                                    i13 = 2;
                                }
                                bundle.putString("extra_play_params", Cocos2dxView.m78846iM(i13, z15, m17971y0, this.f60505a));
                            } else {
                                c11621p0.f60390O = false;
                                bundle.putString("extra_play_params", Cocos2dxView.m78847jM(c11621p0.f60387L, c11621p0.f60388M, c11621p0.f60389N));
                            }
                            C11621p0 c11621p02 = C11621p0.this;
                            if (c11621p02.f60386K) {
                                c11621p02.f60422k.mo60094l7(0, false);
                                bundle.putBoolean("extra_keyboard_showing", false);
                            } else if (c11621p02.f60422k.m59835TQ()) {
                                bundle.putBoolean("extra_keyboard_showing", true);
                            }
                            if (C11621p0.this.f60422k.f56832b1 != null) {
                                bundle.putString("extra_input_text", C11621p0.this.f60422k.mo59611Dd());
                                bundle.putInt("extra_input_selection", C11621p0.this.f60422k.f56832b1.getSelectionEnd());
                            }
                            bundle.putString("extra_effect_id", str);
                            bundle.putBoolean("extra_is_play_active", this.f60506b);
                            C26664o.m136836a().m136844i(C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17944I0());
                            C11621p0.this.f60422k.m60020gQ().mo60832x4(false);
                            if (AbstractC23306f.m120562A().m2531Z()) {
                                C11621p0.this.f60422k.mo59714LA();
                            }
                            if (Math.abs(AbstractC23309i.m122378s1() - System.currentTimeMillis()) > 86400000 && Math.abs(AbstractC23309i.m121186M5() - System.currentTimeMillis()) > 86400000) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (!C11621p0.this.f60422k.mo60184qx() && !z16) {
                                Intent intent = new Intent(C11621p0.this.f60422k.m92648SI(), (Class<?>) Cocos2dxAnimationActivity.class);
                                intent.putExtras(bundle);
                                C11621p0.this.f60422k.m92641HK(intent);
                            }
                            AbstractC23309i.m120756Aj(System.currentTimeMillis());
                            C11621p0.this.f60422k.m92693xK().m93069k2(Cocos2dxLoadingView.class, bundle, 0, true);
                        }
                        AbstractC23306f.m120726x1().mo150728A().remove(C11621p0.this.f60422k.m60020gQ().mo60615Oc().m17944I0());
                        return;
                    }
                    C11621p0.this.m64781i0();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }

        @Override // tg.C26674y.b
        /* renamed from: a */
        public void mo15759a(int i11, String str, String str2, C26657h c26657h) {
            try {
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.z0

                    /* renamed from: q */
                    public final /* synthetic */ String f61578q;

                    /* renamed from: r */
                    public final /* synthetic */ int f61579r;

                    /* renamed from: s */
                    public final /* synthetic */ String f61580s;

                    /* renamed from: t */
                    public final /* synthetic */ C26657h f61581t;

                    public /* synthetic */ RunnableC11832z0(String str3, int i112, String str22, C26657h c26657h2) {
                        r2 = str3;
                        r3 = i112;
                        r4 = str22;
                        r5 = c26657h2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C11621p0.z.this.m64874c(r2, r3, r4, r5);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11621p0.f60375z0, e11);
            }
        }

        private z() {
        }
    }

    public C11621p0(ChatView chatView) {
        this.f60422k = chatView;
        this.f60426m = new C23528a(chatView.m92648SI());
    }

    /* renamed from: A1 */
    public /* synthetic */ void m64587A1(boolean z11, boolean z12, boolean z13) {
        try {
            if (q.f60493a[this.f60422k.f56789Q1.m153886E().ordinal()] != 1) {
                if (!z12) {
                    m64751W2(z11, z13);
                }
            } else {
                m64742P2(z11);
            }
        } catch (Exception e11) {
            m64724H2(this.f60408d);
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: A2 */
    private void m64588A2() {
        this.f60432p.mo9756v1(0);
        this.f60436r.setLayoutManager(this.f60432p);
    }

    /* renamed from: B1 */
    public /* synthetic */ void m64590B1(String str, boolean z11, boolean z12, InterfaceC3299a interfaceC3299a, boolean z13) {
        boolean z14;
        boolean z15;
        try {
            C24003n m120062C = C23278z2.m120062C();
            C3979l m125676A2 = C23999j.m125676A2(str, m120062C.f116260a, m120062C.f116266g);
            if (m125676A2 != null && m125676A2.m18839c() != null && m125676A2.m18839c().getWidth() > 0 && m125676A2.m18839c().getHeight() > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.f60414g == null) {
                this.f60414g = new RecyclingImageView(this.f60408d.getContext());
            }
            if (z14) {
                this.f60414g.setImageInfo(m125676A2, false);
                if (!z11 && z12) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                m64719F2(this.f60408d, new BitmapDrawable(this.f60422k.m92651WI(), m125676A2.m18839c()), true, z15, z11);
                interfaceC3299a.mo16746a();
                return;
            }
            C0824j.m2153b(new a(str, m120062C, z13, z12, z11, interfaceC3299a));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
            interfaceC3299a.mo16747b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.drawable.TransitionDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.zing.zalo.ui.chat.ChatFrameLayout] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.widget.ImageView] */
    /* renamed from: C1 */
    public /* synthetic */ void m64592C1(boolean z11, Drawable drawable, boolean z12, View view, boolean z13) {
        Drawable colorDrawable;
        int i11;
        int i12;
        try {
            if (z11) {
                if (C23212s8.m119602i()) {
                    drawable.setColorFilter(new PorterDuffColorFilter(855638016, PorterDuff.Mode.SRC_OVER));
                } else {
                    drawable.setColorFilter(null);
                }
                if (z12) {
                    if (view instanceof ChatFrameLayout) {
                        colorDrawable = ((ChatFrameLayout) view).getImageBackground();
                        if (colorDrawable instanceof TransitionDrawable) {
                            int numberOfLayers = ((TransitionDrawable) colorDrawable).getNumberOfLayers();
                            TransitionDrawable transitionDrawable = (TransitionDrawable) colorDrawable;
                            if (numberOfLayers > 1) {
                                i12 = numberOfLayers - 1;
                            } else {
                                i12 = 0;
                            }
                            colorDrawable = transitionDrawable.getDrawable(i12);
                        }
                    } else {
                        colorDrawable = new ColorDrawable(ChatView.f56727K4);
                    }
                    if (colorDrawable == null || ((colorDrawable instanceof BitmapDrawable) && ((BitmapDrawable) colorDrawable).getBitmap().isRecycled())) {
                        colorDrawable = new ColorDrawable(ChatView.f56727K4);
                    }
                    drawable = new TransitionDrawable(new Drawable[]{colorDrawable, drawable});
                    drawable.setCallback(this.f60408d);
                    drawable.setCrossFadeEnabled(true);
                    if (z13) {
                        i11 = 100;
                    } else {
                        i11 = 400;
                    }
                    drawable.startTransition(i11);
                }
                if (view instanceof ImageView) {
                    ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
                    AbstractC23136l9.m118696b1(view, null);
                    ((ImageView) view).setImageDrawable(drawable);
                    return;
                } else if (view instanceof ChatFrameLayout) {
                    ((ChatFrameLayout) view).setImageBackground(drawable);
                    return;
                } else {
                    AbstractC23136l9.m118696b1(view, drawable);
                    return;
                }
            }
            if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(null);
            }
            if (view instanceof ChatFrameLayout) {
                ((ChatFrameLayout) view).setImageBackground(new ColorDrawable(ChatView.f56727K4));
            } else {
                AbstractC23136l9.m118696b1(view, new ColorDrawable(ChatView.f56727K4));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: C3 */
    private void m64593C3(EnumC19450c enumC19450c, List list, AbstractC19215a abstractC19215a) {
        try {
            m64721G0();
            EnumC19450c enumC19450c2 = EnumC19450c.f96554q;
            if (enumC19450c != enumC19450c2) {
                m64715E0();
                C32190y7.m155216t().m155232z();
            }
            if ((enumC19450c == enumC19450c2 || enumC19450c == EnumC19450c.f96557t || enumC19450c == EnumC19450c.f96562y) && this.f60434q.getVisibility() != 0) {
                this.f60434q.getViewTreeObserver().addOnGlobalLayoutListener(this.f60452z);
            } else {
                this.f60434q.getViewTreeObserver().removeOnGlobalLayoutListener(this.f60452z);
                EnumC19450c mo59970cv = this.f60422k.mo59970cv();
                if (mo59970cv != EnumC19450c.f96557t && mo59970cv != EnumC19450c.f96562y && mo59970cv != enumC19450c2) {
                    m64790k2();
                }
                this.f60434q.setTranslationY(0.0f);
                this.f60434q.animate().cancel();
                this.f60434q.animate().setListener(null);
            }
            C11815a c11815a = this.f60440t;
            if (c11815a != null) {
                c11815a.m65705w0(list);
                this.f60440t.m65706x0(abstractC19215a);
                this.f60440t.m10008p();
            }
            this.f60434q.removeCallbacks(this.f60381F);
            this.f60434q.post(this.f60381F);
            this.f60422k.m60020gQ().mo60749jg(enumC19450c);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: D1 */
    public /* synthetic */ void m64595D1(View view) {
        try {
            if (this.f60422k.m92674mJ() && !this.f60422k.m92677nJ()) {
                ColorDrawable colorDrawable = new ColorDrawable(ChatView.f56727K4);
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageDrawable(null);
                }
                if (view instanceof ChatFrameLayout) {
                    ((ChatFrameLayout) view).setImageBackground(colorDrawable);
                } else {
                    AbstractC23136l9.m118696b1(view, colorDrawable);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: E1 */
    public /* synthetic */ void m64597E1(String str, C24003n c24003n, boolean z11) {
        try {
            ((C23528a) this.f60422k.f56738C1.m123612r(this.f60412f)).m123579C(str, c24003n, new y(z11));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: F1 */
    public /* synthetic */ void m64599F1(C29059g c29059g) {
        this.f60422k.m60020gQ().mo60690ba(c29059g);
    }

    /* renamed from: G1 */
    public /* synthetic */ void m64601G1(ChatWindowReference chatWindowReference, View view) {
        this.f60422k.m60020gQ().mo60731h3(chatWindowReference);
    }

    /* renamed from: G2 */
    private boolean m64602G2(boolean z11, boolean z12) {
        try {
            C3538f m2555q = AbstractC23306f.m120562A().m2555q(this.f60422k.f56789Q1.m153888F().m17944I0());
            if (m2555q != null && !TextUtils.isEmpty(m2555q.f14931g) && AbstractC23041d2.m118194A(m2555q.f14931g)) {
                this.f60422k.m59719LU(false, m2555q);
                m64711C2(m2555q.f14931g, true, new x(m2555q), z11, z12);
                return true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
        return false;
    }

    /* renamed from: H1 */
    public /* synthetic */ void m64604H1() {
        m64797n0(0L);
    }

    /* renamed from: I1 */
    public /* synthetic */ void m64606I1(C3538f c3538f, String str, boolean z11) {
        String str2;
        try {
            ChatComposePanelNew chatComposePanelNew = this.f60422k.f56819X3;
            if (chatComposePanelNew != null) {
                chatComposePanelNew.m75607v(0);
            }
            C2827a m2516G = AbstractC23306f.m120562A().m2516G();
            if (m2516G.m13669f() && m2516G.m13668e()) {
                m2516G.m13670g(false);
                AbstractC23306f.m120562A().m2560s0(m2516G);
            }
            this.f60422k.m59565AT();
            ChatView chatView = this.f60422k;
            chatView.mo59840Tj(chatView.m59760OQ());
            this.f60422k.m60020gQ().mo60653Vc();
            this.f60422k.m60020gQ().mo60543Bm();
            f fVar = new f();
            String str3 = "0";
            if (c3538f == null) {
                String m122040j1 = AbstractC23309i.m122040j1();
                C3538f c3538f2 = new C3538f();
                if (!TextUtils.isEmpty(m122040j1)) {
                    str3 = m122040j1;
                }
                c3538f2.f14925a = str3;
                c3538f2.f14930f = C3538f.f14924j;
                c3538f = c3538f2;
            } else if (!c3538f.m17983b() && !TextUtils.isEmpty(c3538f.f14931g) && !AbstractC23041d2.m118194A(c3538f.f14931g)) {
                c3538f = new C3538f();
                c3538f.f14925a = "0";
                c3538f.f14930f = C3538f.f14924j;
            }
            if (!this.f60422k.m60020gQ().mo60624Q7()) {
                str2 = "";
            } else {
                str2 = this.f60422k.m60020gQ().mo60615Oc().m17944I0();
            }
            m64800n3(fVar, c3538f, c3538f, true, str2);
            this.f60417h0 = true;
            if (this.f60411e0 == null) {
                ActionBar actionBar = new ActionBar(this.f60422k.m92686rK());
                this.f60411e0 = actionBar;
                actionBar.setBackButtonDrawable(AbstractC23136l9.m118665N(actionBar.getContext(), AbstractC7356u0.icn_header_close));
                this.f60411e0.setTitle(MainApplication.getAppContext().getString(AbstractC8020f0.str_optionM_bg));
                this.f60415g0 = (RobotoButton) this.f60411e0.m92712g().m92744k(AbstractC6918a0.menu_done, AbstractC7409c0.action_bar_menu_item_blue_text_only);
                Typeface createFromAsset = Typeface.createFromAsset(this.f60422k.m92692wK().getAssets(), "fonts/Roboto-Medium.ttf");
                SpannableString spannableString = new SpannableString(MainApplication.getAppContext().getString(AbstractC8020f0.str_menu_item_finished));
                spannableString.setSpan(new CustomTypefaceSpan("", createFromAsset), 0, spannableString.length(), 33);
                this.f60415g0.setText(spannableString);
                this.f60415g0.setCompoundDrawablesWithIntrinsicBounds(AbstractC16803z.action_menu_blue_done_icon_selector, 0, 0, 0);
                this.f60415g0.setCompoundDrawablePadding(AbstractC23136l9.m118742r(3.0f));
                this.f60415g0.setVisibility(0);
                this.f60411e0.setActionBarMenuOnItemClick(new g());
                this.f60408d.addView(this.f60411e0);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f60411e0.setTitle(str);
            } else {
                this.f60411e0.setTitle(this.f60422k.m92652XI(AbstractC8020f0.str_optionM_bg));
            }
            m64728I3(c3538f);
            this.f60411e0.setVisibility(0);
            this.f60422k.mo78970wq(false);
            long currentTimeMillis = System.currentTimeMillis();
            long m121517V3 = AbstractC23309i.m121517V3();
            if (!z11 || currentTimeMillis - AbstractC23309i.m122121l6() > m121517V3) {
                AbstractC23309i.m121096Jq(System.currentTimeMillis());
                boolean m106862h = this.f60428n.m106862h();
                this.f60428n.m106863i();
                this.f60428n.m106859e(m106862h, this.f60419i0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: J0 */
    public void m64608J0() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.f60380E);
            this.f60434q.post(this.f60380E);
        }
    }

    /* renamed from: J1 */
    public /* synthetic */ void m64609J1(boolean z11, C3538f c3538f, String str) {
        this.f60424l.post(new Runnable() { // from class: v50.cc
            public /* synthetic */ RunnableC27599cc() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64604H1();
            }
        });
        this.f60424l.postDelayed(new Runnable() { // from class: v50.dc

            /* renamed from: q */
            public final /* synthetic */ C3538f f129608q;

            /* renamed from: r */
            public final /* synthetic */ String f129609r;

            /* renamed from: s */
            public final /* synthetic */ boolean f129610s;

            public /* synthetic */ RunnableC27614dc(C3538f c3538f2, String str2, boolean z112) {
                r2 = c3538f2;
                r3 = str2;
                r4 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64606I1(r2, r3, r4);
            }
        }, 250L);
    }

    /* renamed from: K1 */
    public /* synthetic */ void m64611K1() {
        this.f60410e.requestLayout();
    }

    /* renamed from: L0 */
    private void m64613L0() {
        RobotoTextView robotoTextView = this.f60446w;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(8);
        }
    }

    /* renamed from: L1 */
    public /* synthetic */ void m64614L1(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int max;
        SwipeItemListView swipeItemListView = this.f60410e;
        if (swipeItemListView != null && (max = Math.max(swipeItemListView.getBottom() - this.f60435q0.getTop(), 0)) != this.f60410e.getPaddingBottom()) {
            SwipeItemListView swipeItemListView2 = this.f60410e;
            swipeItemListView2.setPadding(swipeItemListView2.getPaddingLeft(), this.f60410e.getPaddingTop(), this.f60410e.getPaddingRight(), max);
            this.f60410e.post(new Runnable() { // from class: v50.vc
                public /* synthetic */ RunnableC27871vc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.this.m64611K1();
                }
            });
        }
    }

    /* renamed from: M0 */
    private void m64616M0() {
        m64677l0();
        RecyclerView recyclerView = this.f60444v;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* renamed from: M1 */
    public /* synthetic */ void m64617M1() {
        if (!this.f60422k.m92677nJ() && this.f60422k.m92674mJ()) {
            m64715E0();
        }
    }

    /* renamed from: N0 */
    private void m64619N0(List list, String str) {
        this.f60422k.m92649TI().m93060e2(0, ReplyStickerPopupView.m83630rL(str, list, new w()), ReplyStickerPopupView.f76956f1, 0, false);
    }

    /* renamed from: N1 */
    public /* synthetic */ void m64620N1() {
        if (!this.f60422k.m92677nJ() && this.f60422k.m92674mJ() && this.f60423k0 != null && !m64756a1()) {
            m64721G0();
        }
    }

    /* renamed from: O0 */
    private void m64622O0(C17988o1 c17988o1) {
        try {
            if (this.f60438s == null) {
                QuickReplySuggestionContainer quickReplySuggestionContainer = new QuickReplySuggestionContainer(this.f60402a.getContext());
                this.f60438s = quickReplySuggestionContainer;
                quickReplySuggestionContainer.setId(AbstractC6918a0.chat_quick_reply_suggestion);
                this.f60438s.setVisibility(0);
                this.f60438s.setupQuickSuggestionContainer(c17988o1);
                this.f60438s.setReplySuggestionListener(new r());
                ChatFrameLayout chatFrameLayout = this.f60408d;
                QuickReplySuggestionContainer quickReplySuggestionContainer2 = this.f60438s;
                chatFrameLayout.f56663D = quickReplySuggestionContainer2;
                chatFrameLayout.addView(quickReplySuggestionContainer2, new FrameLayout.LayoutParams(-1, -2));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: P0 */
    private C11815a.g m64625P0() {
        return new t();
    }

    /* renamed from: P1 */
    public /* synthetic */ void m64626P1(int i11, WalkThroughOnboardView.InterfaceC13300b interfaceC13300b) {
        ChatComposePanelNew chatComposePanelNew;
        QuickPickerView quickPickerView;
        View m71263cM;
        String m118743r0;
        C13309e c13309e = new C13309e(this.f60408d);
        try {
            ChatView chatView = this.f60422k;
            if (chatView == null || (chatComposePanelNew = chatView.f56819X3) == null || (quickPickerView = chatComposePanelNew.getQuickPickerView()) == null || this.f60422k.f56819X3.getMode() != 4 || quickPickerView.m71254ZL() != 107 || (m71263cM = quickPickerView.m71263cM(i11)) == null) {
                return;
            }
            View findViewById = m71263cM.findViewById(AbstractC6918a0.imvFunctionImg);
            if (findViewById != null) {
                m71263cM = findViewById;
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: v50.xc

                /* renamed from: q */
                public final /* synthetic */ int f130176q;

                public /* synthetic */ RunnableC27899xc(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QuickPickerView.this.m71221NN(r2);
                }
            });
            C26209i c26209i = new C26209i(m71263cM);
            c26209i.f124547b = m71263cM.getClipBounds();
            c26209i.f124548c = AbstractC23222t7.f112562h;
            if (i112 != 25) {
                m118743r0 = "";
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_message_icon_attachment);
            }
            WalkThroughOnboardView.C13302d c13302d = new WalkThroughOnboardView.C13302d("", m118743r0, c26209i, "");
            c13302d.m74674n(4);
            c13302d.m74670j(m71263cM.getWidth() * 1.0f);
            c13302d.m74671k(false);
            c13309e.m74724b(c13302d);
            if (interfaceC13300b != null) {
                c13309e.m74728g(interfaceC13300b);
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: v50.yc
                public /* synthetic */ RunnableC27913yc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C13309e.this.m74729h();
                }
            });
        } catch (Exception e11) {
            c13309e.m74726d();
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: P3 */
    public void m64627P3(C3538f c3538f) {
        if (c3538f.m17983b()) {
            this.f60422k.f56896r1 = C29384b.m146529g();
        } else {
            this.f60422k.f56896r1 = C29384b.m146528f();
        }
        this.f60422k.mo60171q5();
    }

    /* renamed from: Q0 */
    private void m64629Q0() {
        try {
            if (this.f60434q == null) {
                Context context = this.f60402a.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                this.f60434q = frameLayout;
                frameLayout.setId(AbstractC6918a0.search_inline_listview);
                this.f60434q.setVisibility(8);
                this.f60436r = m64635S0();
                View view = new View(this.f60402a.getContext());
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, 1));
                view.setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
                this.f60434q.addView(this.f60436r);
                this.f60434q.addView(view);
                ChatFrameLayout chatFrameLayout = this.f60408d;
                FrameLayout frameLayout2 = this.f60434q;
                chatFrameLayout.f56657A = frameLayout2;
                chatFrameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -2));
                m64638T0();
                m64632R0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: Q1 */
    public static /* synthetic */ void m64630Q1(InterfaceC21485c interfaceC21485c, View view) {
        if (interfaceC21485c != null) {
            try {
                interfaceC21485c.mo64422f();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f60375z0, e11);
            }
        }
    }

    /* renamed from: R0 */
    private void m64632R0() {
        this.f60452z = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: v50.ec
            public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC27629ec() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C11621p0.this.m64698w1();
            }
        };
    }

    /* renamed from: R1 */
    public static /* synthetic */ void m64633R1(InterfaceC21485c interfaceC21485c, View view) {
        if (interfaceC21485c != null) {
            try {
                interfaceC21485c.mo64420d();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f60375z0, e11);
            }
        }
    }

    /* renamed from: S0 */
    private CustomRecyclerView m64635S0() {
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f60402a.getContext());
        this.f60432p = noPredictiveItemAnimLinearLayoutMngr;
        boolean z11 = false;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        CustomRecyclerView customRecyclerView = new CustomRecyclerView(this.f60402a.getContext());
        customRecyclerView.setItemAnimator(null);
        customRecyclerView.setLayoutAnimation(null);
        customRecyclerView.setLayoutManager(this.f60432p);
        customRecyclerView.setOverScrollMode(2);
        customRecyclerView.setMotionEventSplittingEnabled(false);
        customRecyclerView.setVisibility(0);
        this.f60383H = C28020b3.f130648a.m141208y("SUGGEST_VIEW_", this.f60422k.m92676n2());
        this.f60440t = new C11815a(this.f60402a.getContext(), 0, m64625P0(), this.f60383H);
        if (this.f60422k.m60020gQ().mo60615Oc().m17971y0().m41013q()) {
            String m17944I0 = this.f60422k.m60020gQ().mo60615Oc().m17944I0();
            if (!m17944I0.isEmpty()) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(m17944I0);
                if (m4472f != null) {
                    z11 = m4472f.m153747Y();
                }
                this.f60440t.m65703u0(z11);
            }
        }
        customRecyclerView.setAdapter(this.f60440t);
        customRecyclerView.m9826E(new s(customRecyclerView));
        m64641U0(customRecyclerView);
        return customRecyclerView;
    }

    /* renamed from: S1 */
    public static /* synthetic */ void m64636S1(InterfaceC21485c interfaceC21485c, View view) {
        if (interfaceC21485c != null) {
            interfaceC21485c.mo64421e();
        }
    }

    /* renamed from: T0 */
    private void m64638T0() {
        this.f60376A = new u();
        this.f60378C = new v();
    }

    /* renamed from: T1 */
    public /* synthetic */ void m64639T1(boolean z11, C3538f c3538f) {
        try {
            if (!this.f60422k.mo60294yp() && this.f60422k.m92676n2() != null) {
                this.f60422k.m59719LU(z11, c3538f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: U0 */
    private void m64641U0(RecyclerView recyclerView) {
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: v50.fc
            public /* synthetic */ ViewOnTouchListenerC27644fc() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m64700x1;
                m64700x1 = C11621p0.this.m64700x1(view, motionEvent);
                return m64700x1;
            }
        });
    }

    /* renamed from: U1 */
    public /* synthetic */ void m64642U1(List list, C8956b c8956b, C8969o c8969o, String str) {
        if ((!list.isEmpty() && !AbstractC8971q.m47974f(list)) || c8956b != null) {
            if (this.f60395T == null) {
                LiveLocationBar liveLocationBar = (LiveLocationBar) this.f60408d.m59159C();
                this.f60395T = liveLocationBar;
                liveLocationBar.setMode(2);
                this.f60395T.setHandleClickListener(true);
            }
            if (c8956b != null && c8969o == null) {
                this.f60395T.m48006e(c8956b, str);
            } else {
                this.f60395T.m48002a(list, str);
            }
            this.f60395T.setListener(new c(c8969o, list));
            return;
        }
        m64813r2();
    }

    /* renamed from: V0 */
    private void m64644V0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            RobotoTextView robotoTextView = this.f60446w;
            if (robotoTextView == null) {
                Context context = this.f60402a.getContext();
                RobotoTextView robotoTextView2 = new RobotoTextView(context);
                this.f60446w = robotoTextView2;
                robotoTextView2.setId(AbstractC6918a0.suggest_header_view);
                this.f60446w.setTextSize(1, 14.0f);
                this.f60446w.setGravity(1);
                this.f60446w.setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.suggest_sticker_bg_color));
                this.f60446w.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                this.f60446w.setTextStyleBold(true);
                this.f60446w.setText(str);
                ChatFrameLayout chatFrameLayout = this.f60408d;
                RobotoTextView robotoTextView3 = this.f60446w;
                chatFrameLayout.f56661C = robotoTextView3;
                chatFrameLayout.addView(robotoTextView3, new FrameLayout.LayoutParams(-1, -2));
            } else {
                robotoTextView.setText(str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: V1 */
    public /* synthetic */ void m64645V1() {
        try {
            C3535c mo60615Oc = this.f60422k.m60020gQ().mo60615Oc();
            AbstractC19444a.m101695c(new Runnable() { // from class: v50.jc

                /* renamed from: q */
                public final /* synthetic */ List f129774q;

                /* renamed from: r */
                public final /* synthetic */ C8956b f129775r;

                /* renamed from: s */
                public final /* synthetic */ C8969o f129776s;

                /* renamed from: t */
                public final /* synthetic */ String f129777t;

                public /* synthetic */ RunnableC27703jc(List list, C8956b c8956b, C8969o c8969o, String str) {
                    r2 = list;
                    r3 = c8956b;
                    r4 = c8969o;
                    r5 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.this.m64642U1(r2, r3, r4, r5);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: W0 */
    private void m64647W0() {
        ZinstantQuickMenu zinstantQuickMenu = this.f60416h;
        if (zinstantQuickMenu != null) {
            zinstantQuickMenu.setInteractionTracker(new C17172p());
            InterfaceC19397b interfaceC19397b = this.f60439s0;
            if (interfaceC19397b != null) {
                this.f60416h.setZinstantOAListener(interfaceC19397b);
            }
        }
    }

    /* renamed from: W1 */
    public static /* synthetic */ void m64648W1(View view) {
        try {
            if (C20024r.m103943l()) {
                C20024r.m103949w();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: X1 */
    public /* synthetic */ void m64650X1(boolean z11) {
        try {
            if (z11) {
                if (this.f60393R == null) {
                    this.f60393R = (ReturnCallScreenView) this.f60408d.m59177Q();
                }
                this.f60393R.setVisibility(0);
                this.f60393R.setOnClickListener(new View.OnClickListener() { // from class: v50.kc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C11621p0.m64648W1(view);
                    }
                });
                return;
            }
            ReturnCallScreenView returnCallScreenView = this.f60393R;
            if (returnCallScreenView != null) {
                returnCallScreenView.setVisibility(8);
                this.f60408d.removeView(this.f60393R);
                this.f60408d.f56691c0 = null;
                this.f60393R = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: X2 */
    private void m64651X2(EnumC19450c enumC19450c) {
        int m119607o;
        if (enumC19450c == EnumC19450c.f96559v) {
            m119607o = C23212s8.m119607o(this.f60436r.getContext(), AbstractC16781w.suggest_typo_bg);
        } else {
            m119607o = C23212s8.m119607o(this.f60436r.getContext(), AbstractC16781w.suggest_sticker_bg_color);
        }
        this.f60436r.setBackgroundColor(m119607o);
    }

    /* renamed from: Y1 */
    public /* synthetic */ void m64653Y1(C17945a0 c17945a0, View view) {
        this.f60422k.m60208sT(c17945a0);
    }

    /* renamed from: Y2 */
    private void m64654Y2(EnumC19450c enumC19450c, List list, String str) {
        EnumC19450c enumC19450c2 = EnumC19450c.f96558u;
        if (enumC19450c == enumC19450c2) {
            if (this.f60422k.m60020gQ().mo60594K8()) {
                m64665c3();
            } else {
                m64677l0();
            }
        } else if (enumC19450c == EnumC19450c.f96555r) {
            m64644V0(str);
        }
        if (enumC19450c != enumC19450c2 || !C20067a.m104310c(list, 6)) {
            this.f60422k.mo59989ek();
        }
    }

    /* renamed from: Z2 */
    private void m64656Z2(EnumC19450c enumC19450c, List list, EnumC19449b enumC19449b) {
        C7240v6 c7240v6 = this.f60442u;
        if (c7240v6 != null) {
            this.f60436r.m9907x1(c7240v6);
        }
        if (enumC19449b != EnumC19449b.f96544s && enumC19449b != EnumC19449b.f96543r) {
            if (this.f60442u == null) {
                this.f60442u = new C7240v6();
            }
            this.f60442u.m36957l(C20067a.m104308a(enumC19450c, list));
            this.f60436r.m9816A(this.f60442u);
        }
    }

    /* renamed from: a3 */
    private void m64659a3(EnumC19449b enumC19449b) {
        if (enumC19449b == EnumC19449b.f96543r) {
            this.f60432p.m9723C2(1);
            this.f60436r.setMaxHeight((int) (C11815a.f61479C * 3.5f));
            this.f60436r.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return;
        }
        this.f60432p.m9723C2(0);
        this.f60436r.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: b3 */
    private void m64662b3(EnumC19450c enumC19450c, List list, EnumC19449b enumC19449b) {
        m64659a3(enumC19449b);
        m64656Z2(enumC19450c, list, enumC19449b);
        m64651X2(enumC19450c);
        m64588A2();
        this.f60436r.requestLayout();
    }

    /* renamed from: c3 */
    private void m64665c3() {
        try {
            if (this.f60444v == null) {
                Context context = this.f60402a.getContext();
                NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(context);
                this.f60450y = noPredictiveItemAnimLinearLayoutMngr;
                noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
                CustomRecyclerView customRecyclerView = new CustomRecyclerView(this.f60402a.getContext());
                this.f60444v = customRecyclerView;
                customRecyclerView.setId(AbstractC6918a0.trending_search_view);
                this.f60444v.setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.suggest_sticker_bg_color));
                this.f60444v.setItemAnimator(null);
                this.f60444v.setLayoutAnimation(null);
                this.f60444v.setLayoutManager(this.f60450y);
                this.f60444v.setOverScrollMode(2);
                this.f60444v.setPadding(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                C27043b c27043b = new C27043b();
                this.f60448x = c27043b;
                c27043b.m139206Q(new C27043b.b() { // from class: v50.zb
                    public /* synthetic */ C27926zb() {
                    }

                    @Override // u60.C27043b.b
                    /* renamed from: a */
                    public final void mo139208a(C29059g c29059g) {
                        C11621p0.this.m64599F1(c29059g);
                    }
                });
                this.f60444v.setAdapter(this.f60448x);
                this.f60408d.f56659B = this.f60444v;
                this.f60408d.addView(this.f60444v, new FrameLayout.LayoutParams(-1, -2));
            }
            this.f60422k.m60020gQ().mo60666X8(this.f60448x.m139203M());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: g0 */
    private boolean m64670g0() {
        EnumC19450c mo59970cv = this.f60422k.mo59970cv();
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            if (mo59970cv == EnumC19450c.f96554q || mo59970cv == EnumC19450c.f96557t || mo59970cv == EnumC19450c.f96562y) {
                m64790k2();
                if (!this.f60379D) {
                    this.f60434q.animate().translationY(this.f60434q.getHeight()).setListener(this.f60378C).setDuration(300L).start();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k0 */
    private void m64675k0() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null && this.f60452z != null) {
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f60452z);
        }
    }

    /* renamed from: l0 */
    private void m64677l0() {
        try {
            if (this.f60448x != null) {
                this.f60450y.mo9756v1(0);
                this.f60448x.m139207R(-1);
                this.f60448x.m139205P(new ArrayList());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: l2 */
    private void m64678l2() {
        C31959i6 c31959i6 = this.f60382G;
        if (c31959i6 != null) {
            c31959i6.m153662e(-this.f60434q.getHeight());
        }
    }

    /* renamed from: m3 */
    private void m64680m3(boolean z11) {
        try {
            if (z11) {
                if (this.f60397V.getVisibility() == 0) {
                    return;
                }
                Animation animation = this.f60409d0;
                if (animation != null) {
                    animation.cancel();
                }
                if (this.f60418i == null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f60397V.getContext(), AbstractC10919t.slide_in_from_top_chat_theme);
                    this.f60418i = loadAnimation;
                    loadAnimation.setDuration(300L);
                }
                this.f60397V.setVisibility(0);
                this.f60418i.setAnimationListener(this.f60405b0);
                Animation animation2 = this.f60418i;
                this.f60409d0 = animation2;
                this.f60397V.startAnimation(animation2);
                return;
            }
            if (this.f60397V.getVisibility() == 8) {
                return;
            }
            Animation animation3 = this.f60409d0;
            if (animation3 != null) {
                animation3.cancel();
            }
            if (this.f60420j == null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f60397V.getContext(), AbstractC10919t.slide_out_to_top_chat_theme);
                this.f60420j = loadAnimation2;
                loadAnimation2.setDuration(300L);
            }
            this.f60420j.setAnimationListener(this.f60407c0);
            Animation animation4 = this.f60420j;
            this.f60409d0 = animation4;
            this.f60397V.startAnimation(animation4);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: q1 */
    public /* synthetic */ void m64685q1(C3538f c3538f) {
        String str;
        boolean z11;
        try {
            AbstractC23306f.m120562A().m2533c0(this.f60422k.m60020gQ().mo60615Oc().m17944I0(), c3538f);
            String str2 = "";
            if (!this.f60422k.m60020gQ().mo60624Q7()) {
                str = "";
            } else {
                str = this.f60422k.m60020gQ().mo60615Oc().m17944I0();
            }
            if (m64705A0() != null) {
                String str3 = m64705A0().f14925a;
                if (c3538f != null) {
                    str2 = c3538f.f14925a;
                }
                if (!str3.equals(str2)) {
                    z11 = true;
                    m64743Q2(null);
                    m64747S2(null);
                    m64800n3(null, null, null, false, str);
                    this.f60417h0 = false;
                    this.f60428n.m106863i();
                    this.f60411e0.setVisibility(8);
                    this.f60422k.mo78970wq(true);
                    C23744a.m124114c().m124116d(38, this.f60422k.m60020gQ().mo60615Oc().m17944I0(), Boolean.valueOf(z11));
                }
            }
            z11 = false;
            m64743Q2(null);
            m64747S2(null);
            m64800n3(null, null, null, false, str);
            this.f60417h0 = false;
            this.f60428n.m106863i();
            this.f60411e0.setVisibility(8);
            this.f60422k.mo78970wq(true);
            C23744a.m124114c().m124116d(38, this.f60422k.m60020gQ().mo60615Oc().m17944I0(), Boolean.valueOf(z11));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: r1 */
    public /* synthetic */ void m64687r1(C3538f c3538f) {
        this.f60424l.post(new Runnable() { // from class: v50.dd

            /* renamed from: q */
            public final /* synthetic */ C3538f f129612q;

            public /* synthetic */ RunnableC27615dd(C3538f c3538f2) {
                r2 = c3538f2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64685q1(r2);
            }
        });
    }

    /* renamed from: s1 */
    public /* synthetic */ void m64689s1() {
        try {
            this.f60404b.m88338d(this.f60406c);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: t1 */
    public /* synthetic */ void m64691t1(String str, C17945a0 c17945a0, z zVar) {
        try {
            if (TextUtils.equals(str, this.f60384I)) {
                C26674y.m136865t().m136877n(str, c17945a0.m95029V3().m41044h(), zVar, (byte) 6);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: u1 */
    public /* synthetic */ void m64693u1(String str, boolean z11, int i11, String str2, C26657h c26657h, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        try {
            if (!TextUtils.isEmpty(this.f60384I) && TextUtils.equals(this.f60384I, str)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f60422k.m92674mJ() && !this.f60422k.m92681pJ() && this.f60422k.m92676n2() != null && this.f60422k.m92672lJ() && this.f60422k.mo59787QH() && z13 && (this.f60392Q || z11)) {
                ChatComposePanelNew chatComposePanelNew = this.f60422k.f56819X3;
                if (chatComposePanelNew != null && (chatComposePanelNew.m75574B() || this.f60422k.f56819X3.m75575C())) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!this.f60422k.mo60244v2() && ZaloBubbleActivity.m57017B5()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z14 && !this.f60422k.mo59727Ly() && !this.f60422k.mo60120mu() && !this.f60422k.mo59886Wb() && !this.f60417h0 && !z15 && i11 == 0 && str2 != null && c26657h != null && c26657h.f126157b > 0) {
                    Bundle bundle = new Bundle();
                    if (c26657h.f126157b == 14) {
                        if (c26657h.f126162g != null) {
                            C23744a.m124114c().m124116d(4, new Object[0]);
                            C25979a.m133815f(this.f60422k, str, str2, c26657h.f126162g);
                        }
                    } else {
                        bundle.putString("extra_asset_path", str2);
                        bundle.putString("extra_metadata_name", "metadata");
                        bundle.putInt("extra_effect_type", c26657h.f126157b);
                        bundle.putString("extra_play_params", "{}");
                        bundle.putBoolean("extra_preview", true);
                        bundle.putString("extra_effect_id", str);
                        bundle.putBoolean("extra_is_play_active", z12);
                        if (Math.abs(AbstractC23309i.m122378s1() - System.currentTimeMillis()) > 86400000 && Math.abs(AbstractC23309i.m121186M5() - System.currentTimeMillis()) > 86400000) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (!this.f60422k.mo60184qx() && !z16) {
                            Intent intent = new Intent(this.f60422k.m92648SI(), (Class<?>) Cocos2dxAnimationActivity.class);
                            intent.putExtras(bundle);
                            this.f60422k.m92641HK(intent);
                        }
                        AbstractC23309i.m120756Aj(System.currentTimeMillis());
                        this.f60422k.m92693xK().m93069k2(Cocos2dxLoadingView.class, bundle, 0, true);
                    }
                } else {
                    m64781i0();
                }
            } else {
                m64781i0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
        this.f60422k.mo49315c4();
    }

    /* renamed from: v1 */
    public /* synthetic */ void m64695v1(boolean z11, boolean z12, int i11, String str, String str2, C26657h c26657h) {
        AbstractC19444a.m101695c(new Runnable() { // from class: v50.uc

            /* renamed from: q */
            public final /* synthetic */ String f130083q;

            /* renamed from: r */
            public final /* synthetic */ boolean f130084r;

            /* renamed from: s */
            public final /* synthetic */ int f130085s;

            /* renamed from: t */
            public final /* synthetic */ String f130086t;

            /* renamed from: u */
            public final /* synthetic */ C26657h f130087u;

            /* renamed from: v */
            public final /* synthetic */ boolean f130088v;

            public /* synthetic */ RunnableC27857uc(String str3, boolean z112, int i112, String str22, C26657h c26657h2, boolean z122) {
                r2 = str3;
                r3 = z112;
                r4 = i112;
                r5 = str22;
                r6 = c26657h2;
                r7 = z122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64693u1(r2, r3, r4, r5, r6, r7);
            }
        });
    }

    /* renamed from: w0 */
    private View m64697w0() {
        if (this.f60451y0 == null) {
            RobotoTextView robotoTextView = new RobotoTextView(this.f60402a.getContext());
            robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            robotoTextView.setBackgroundColor(AbstractC23136l9.m118641B(this.f60402a.getContext(), AbstractC16801x.black_60));
            robotoTextView.setGravity(17);
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_drop_here_to_send));
            robotoTextView.setTextColor(AbstractC23136l9.m118641B(this.f60402a.getContext(), AbstractC16801x.white));
            robotoTextView.setTextSize(1, AbstractC23222t7.f112562h);
            this.f60451y0 = robotoTextView;
        }
        return this.f60451y0;
    }

    /* renamed from: w1 */
    public /* synthetic */ void m64698w1() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null && frameLayout.getVisibility() == 0 && this.f60434q.getHeight() > 0) {
            m64678l2();
            if (!this.f60377B) {
                this.f60434q.setTranslationY(r0.getHeight());
                this.f60434q.animate().translationY(0.0f).setDuration(200L).setListener(this.f60376A).start();
            }
            this.f60434q.getViewTreeObserver().removeOnGlobalLayoutListener(this.f60452z);
        }
    }

    /* renamed from: x1 */
    public /* synthetic */ boolean m64700x1(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            this.f60422k.m60020gQ().mo60759ld();
            return false;
        }
        this.f60422k.m60020gQ().mo60699cl();
        return false;
    }

    /* renamed from: y1 */
    public /* synthetic */ void m64702y1() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: z1 */
    public /* synthetic */ void m64704z1() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* renamed from: A0 */
    public C3538f m64705A0() {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            return stickyChatThemesView.getCurrentThemeSelected();
        }
        return null;
    }

    /* renamed from: A3 */
    public void m64706A3(C17988o1 c17988o1) {
        if (m64778h1()) {
            C2526d.f10270a.m12730w(C17988o1.a.f91106q, this.f60438s.getQuickReplyGlobalMsgId());
        }
        m64622O0(c17988o1);
        this.f60438s.m65580g(c17988o1);
        this.f60438s.setVisibility(0);
    }

    /* renamed from: B0 */
    public void m64707B0(boolean z11) {
        int i11;
        if ((z11 || ((i11 = this.f60443u0) != 2 && i11 != 3)) && m64818t0() != null) {
            m64818t0().m65361m(false);
        }
    }

    /* renamed from: B2 */
    public void m64708B2(String str, String str2) {
        if (str != null) {
            try {
                if (this.f60422k.m60020gQ().mo60718f4(str)) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    m64709B3(str2);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f60375z0, e11);
            }
        }
    }

    /* renamed from: B3 */
    public void m64709B3(String str) {
        try {
            this.f60422k.mo59702KH("request_location_fragment");
            ViewGroup viewGroup = this.f60401Z;
            if (viewGroup == null) {
                this.f60401Z = this.f60408d.m59176P();
            } else {
                viewGroup.bringToFront();
            }
            this.f60422k.mo59714LA();
            this.f60400Y = RequestLocationView.m83767jM(str);
            this.f60422k.m92649TI().m93058d2(AbstractC6918a0.chat_request_location_fragment_container, this.f60400Y, 0, "request_location_fragment", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: C0 */
    public void m64710C0() {
        View m64697w0 = m64697w0();
        if (this.f60422k.m92662fJ() != null) {
            this.f60422k.m92662fJ().m93000F1(m64697w0);
        }
    }

    /* renamed from: C2 */
    public void m64711C2(String str, boolean z11, InterfaceC3299a interfaceC3299a, boolean z12, boolean z13) {
        AbstractC19444a.m101697e(new Runnable() { // from class: v50.zc

            /* renamed from: q */
            public final /* synthetic */ String f130223q;

            /* renamed from: r */
            public final /* synthetic */ boolean f130224r;

            /* renamed from: s */
            public final /* synthetic */ boolean f130225s;

            /* renamed from: t */
            public final /* synthetic */ InterfaceC3299a f130226t;

            /* renamed from: u */
            public final /* synthetic */ boolean f130227u;

            public /* synthetic */ RunnableC27927zc(String str2, boolean z122, boolean z132, InterfaceC3299a interfaceC3299a2, boolean z112) {
                r2 = str2;
                r3 = z122;
                r4 = z132;
                r5 = interfaceC3299a2;
                r6 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64590B1(r2, r3, r4, r5, r6);
            }
        });
    }

    /* renamed from: D0 */
    public void m64712D0() {
        ChatFrameLayout chatFrameLayout = this.f60408d;
        if (chatFrameLayout != null) {
            chatFrameLayout.setPaddingBottom(0);
        }
    }

    /* renamed from: D2 */
    public void m64713D2(InterfaceC19397b interfaceC19397b) {
        this.f60439s0 = interfaceC19397b;
        ZinstantQuickMenu zinstantQuickMenu = this.f60416h;
        if (zinstantQuickMenu != null) {
            zinstantQuickMenu.setZinstantOAListener(interfaceC19397b);
        }
    }

    /* renamed from: D3 */
    public void m64714D3(EnumC19450c enumC19450c, List list, EnumC19449b enumC19449b, String str, AbstractC19215a abstractC19215a) {
        try {
            m64629Q0();
            m64662b3(enumC19450c, list, enumC19449b);
            m64654Y2(enumC19450c, list, str);
            m64593C3(enumC19450c, list, abstractC19215a);
            if (enumC19450c == EnumC19450c.f96555r && !list.isEmpty() && ((C31902e9) list.get(0)).m153321m() != null) {
                C2526d.f10270a.m12724p0("csc_msg_footer", enumC19449b.m101746d(), ((C31902e9) list.get(0)).m153321m().m132398F());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: E0 */
    public void m64715E0() {
        try {
            Runnable runnable = this.f60433p0;
            if (runnable != null) {
                this.f60424l.removeCallbacks(runnable);
            }
            SuggestLinkModulesView suggestLinkModulesView = this.f60431o0;
            if (suggestLinkModulesView != null) {
                if (suggestLinkModulesView.getAlpha() == 1.0f) {
                    AbstractC23202r9.m119542j(this.f60431o0, new o());
                } else {
                    SuggestLinkModulesView suggestLinkModulesView2 = this.f60431o0;
                    if (suggestLinkModulesView2 != null && this.f60408d != null) {
                        suggestLinkModulesView2.setVisibility(8);
                        this.f60408d.removeView(this.f60431o0);
                        this.f60408d.f56701m0 = null;
                        this.f60431o0 = null;
                    }
                }
                C32190y7.m155216t().m155220B(false);
                C32190y7.m155216t().m155232z();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: E2 */
    public void m64716E2(int i11) {
        this.f60443u0 = i11;
        if (i11 == 2) {
            this.f60441t0 = 0;
        } else if (i11 != 3) {
            this.f60441t0 = i11;
        } else {
            this.f60441t0 = 1;
        }
    }

    /* renamed from: E3 */
    public void m64717E3(List list) {
        if (list.size() > 1) {
            ToastUtils.showMess(true, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_multi_photos_toast_plural_send), Integer.valueOf(list.size())), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
        } else if (list.size() == 1) {
            ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_multi_photos_toast_singular_send), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
        }
    }

    /* renamed from: F0 */
    public void m64718F0() {
        MaterialProgressBar materialProgressBar = this.f60403a0;
        if (materialProgressBar != null) {
            materialProgressBar.setVisibility(8);
        }
    }

    /* renamed from: F2 */
    public void m64719F2(View view, Drawable drawable, boolean z11, boolean z12, boolean z13) {
        if (this.f60422k.m92676n2() == null) {
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: v50.xb

            /* renamed from: q */
            public final /* synthetic */ boolean f130170q;

            /* renamed from: r */
            public final /* synthetic */ Drawable f130171r;

            /* renamed from: s */
            public final /* synthetic */ boolean f130172s;

            /* renamed from: t */
            public final /* synthetic */ View f130173t;

            /* renamed from: u */
            public final /* synthetic */ boolean f130174u;

            public /* synthetic */ RunnableC27898xb(boolean z112, Drawable drawable2, boolean z122, View view2, boolean z132) {
                r2 = z112;
                r3 = drawable2;
                r4 = z122;
                r5 = view2;
                r6 = z132;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64592C1(r2, r3, r4, r5, r6);
            }
        });
    }

    /* renamed from: F3 */
    public View m64720F3() {
        View m59181U = this.f60408d.m59181U();
        if (AbstractC32226c.m155415n(this.f60422k.m92692wK())) {
            m59181U.setPadding(0, AbstractC32226c.m155411j(this.f60422k.m92676n2()).top, 0, 0);
        }
        return m59181U;
    }

    /* renamed from: G0 */
    public void m64721G0() {
        try {
            if (this.f60423k0 == null) {
                return;
            }
            Runnable runnable = this.f60425l0;
            if (runnable != null) {
                this.f60424l.removeCallbacks(runnable);
            }
            AbstractC23202r9.m119542j(this.f60423k0, new l());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: G3 */
    public void m64722G3() {
        FrameLayout frameLayout;
        try {
            ZaloDrawerLayout zaloDrawerLayout = this.f60404b;
            if (zaloDrawerLayout != null && (frameLayout = this.f60406c) != null) {
                zaloDrawerLayout.m88332J(0, frameLayout);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: H0 */
    public void m64723H0() {
        QuickReplySuggestionContainer quickReplySuggestionContainer = this.f60438s;
        if (quickReplySuggestionContainer != null) {
            quickReplySuggestionContainer.setVisibility(8);
        }
    }

    /* renamed from: H2 */
    public void m64724H2(View view) {
        AbstractC19444a.m101695c(new Runnable() { // from class: v50.pc

            /* renamed from: q */
            public final /* synthetic */ View f129920q;

            public /* synthetic */ RunnableC27787pc(View view2) {
                r2 = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64595D1(r2);
            }
        });
    }

    /* renamed from: H3 */
    void m64725H3(boolean z11, C3538f c3538f) {
        AbstractC19444a.m101695c(new Runnable() { // from class: v50.qc

            /* renamed from: q */
            public final /* synthetic */ boolean f129944q;

            /* renamed from: r */
            public final /* synthetic */ C3538f f129945r;

            public /* synthetic */ RunnableC27801qc(boolean z112, C3538f c3538f2) {
                r2 = z112;
                r3 = c3538f2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64639T1(r2, r3);
            }
        });
    }

    /* renamed from: I0 */
    public void m64726I0() {
        try {
            this.f60422k.mo59702KH("request_location_fragment");
            ViewGroup viewGroup = this.f60401Z;
            if (viewGroup != null) {
                this.f60408d.removeView(viewGroup);
                this.f60401Z = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: I2 */
    public void m64727I2(ZaloDrawerLayout.InterfaceC16579e interfaceC16579e) {
        ZaloDrawerLayout zaloDrawerLayout = this.f60404b;
        if (zaloDrawerLayout != null) {
            zaloDrawerLayout.setDrawerListener(interfaceC16579e);
        }
    }

    /* renamed from: I3 */
    public void m64728I3(C3538f c3538f) {
        try {
            if (this.f60411e0 != null && c3538f != null) {
                if (c3538f.m17983b()) {
                    this.f60411e0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                } else {
                    int i11 = c3538f.f14930f;
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AbstractC23265y.m120022i(i11, 204), AbstractC23265y.m120022i(i11, 13)});
                    gradientDrawable.setCornerRadius(0.0f);
                    AbstractC23136l9.m118696b1(this.f60411e0, gradientDrawable);
                    this.f60411e0.getTitleTextView().setTextColor(-1);
                    this.f60411e0.setBackButtonImage(AbstractC16803z.icn_header_close_white);
                    this.f60415g0.setTextColor(AbstractC23136l9.m118645D(this.f60422k.m92648SI(), AbstractC16801x.action_menu_white_text_selector));
                    this.f60415g0.setCompoundDrawablesWithIntrinsicBounds(AbstractC16803z.action_menu_white_done_icon_selector, 0, 0, 0);
                }
                if (this.f60411e0.getTitleTextView() != null) {
                    this.f60411e0.getTitleTextView().setTextColor(-1);
                }
                this.f60411e0.setBackButtonImage(AbstractC16803z.icn_header_close_white);
                this.f60415g0.setTextColor(AbstractC23136l9.m118645D(this.f60422k.m92686rK(), AbstractC16801x.action_menu_white_text_selector));
                this.f60415g0.setCompoundDrawablesWithIntrinsicBounds(AbstractC16803z.action_menu_white_done_icon_selector, 0, 0, 0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: J2 */
    public void m64729J2(boolean z11) {
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = this.f60445v0;
        if (embeddedMyCloudPagesLayout != null) {
            embeddedMyCloudPagesLayout.setEnableTab(z11);
        }
    }

    /* renamed from: J3 */
    public void m64730J3(C3538f c3538f, C3538f c3538f2, String str) {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            stickyChatThemesView.m65722e(C20559a.f100942e, c3538f, c3538f2, str);
        }
    }

    /* renamed from: K0 */
    public void m64731K0() {
        try {
            C11815a c11815a = this.f60440t;
            if (c11815a != null) {
                AbstractC19215a m65702h0 = c11815a.m65702h0();
                this.f60440t.m65699d0();
                this.f60422k.m60020gQ().mo60589Jl(m65702h0);
            }
            boolean m64670g0 = m64670g0();
            m64785j0();
            if (!m64670g0) {
                this.f60422k.m60020gQ().mo60684ad();
                m64608J0();
            }
            this.f60422k.mo59983dz(EnumC19450c.f96553p);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: K2 */
    public void m64732K2(boolean z11, float f11, int i11, float f12) {
        this.f60390O = z11;
        this.f60387L = f11;
        this.f60388M = i11;
        this.f60389N = f12;
    }

    /* renamed from: K3 */
    public void m64733K3() {
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: v50.bc
            public /* synthetic */ RunnableC27584bc() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64645V1();
            }
        });
    }

    /* renamed from: L2 */
    public void m64734L2(boolean z11) {
        this.f60427m0 = z11;
    }

    /* renamed from: L3 */
    public void m64735L3(boolean z11) {
        try {
            if (C32090r5.m154810i().m154824o() && this.f60422k.m60020gQ().mo60615Oc().m17944I0().equals(C32090r5.m154810i().m154821l())) {
                if (this.f60421j0 == null) {
                    this.f60421j0 = (MediaDownloadStatusView) this.f60408d.m59161D();
                }
                this.f60421j0.m65344h(z11);
                return;
            }
            MediaDownloadStatusView mediaDownloadStatusView = this.f60421j0;
            if (mediaDownloadStatusView != null) {
                mediaDownloadStatusView.setVisibility(8);
                this.f60408d.removeView(this.f60421j0);
                this.f60408d.f56695g0 = null;
                this.f60421j0 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: M2 */
    public void m64736M2(boolean z11) {
        if (z11) {
            ActionEditText actionEditText = this.f60422k.f56832b1;
            actionEditText.setPaintFlags(actionEditText.getPaintFlags() | 32);
        } else {
            ActionEditText actionEditText2 = this.f60422k.f56832b1;
            actionEditText2.setPaintFlags(actionEditText2.getPaintFlags() & (-33));
        }
    }

    /* renamed from: M3 */
    public void m64737M3() {
        NewMultiPhotoSuggestView newMultiPhotoSuggestView = this.f60423k0;
        if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0) {
            this.f60423k0.m65512e0(false);
        }
    }

    /* renamed from: N2 */
    public void m64738N2(boolean z11) {
        float f11;
        if (z11) {
            f11 = -0.25f;
        } else {
            f11 = 0.0f;
        }
        TextPaint paint = this.f60422k.f56832b1.getPaint();
        if (paint.getTextSkewX() != f11) {
            paint.setTextSkewX(f11);
            int paintFlags = this.f60422k.f56832b1.getPaintFlags();
            this.f60422k.f56832b1.setPaintFlags(paintFlags + 1);
            this.f60422k.f56832b1.setPaintFlags(paintFlags);
        }
    }

    /* renamed from: N3 */
    public void m64739N3(List list) {
        NewMultiPhotoSuggestView newMultiPhotoSuggestView = this.f60423k0;
        if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0) {
            this.f60423k0.getCurrentItemList().removeAll(list);
            if (this.f60423k0.getCurrentItemList().size() != 0) {
                this.f60423k0.m65512e0(false);
            } else {
                m64721G0();
            }
            m64717E3(list);
        }
    }

    /* renamed from: O2 */
    public void m64740O2(boolean z11) {
        if (z11) {
            ActionEditText actionEditText = this.f60422k.f56832b1;
            actionEditText.setPaintFlags(actionEditText.getPaintFlags() | 8);
        } else {
            ActionEditText actionEditText2 = this.f60422k.f56832b1;
            actionEditText2.setPaintFlags(actionEditText2.getPaintFlags() & (-9));
        }
    }

    /* renamed from: O3 */
    public void m64741O3(boolean z11) {
        if (this.f60422k.m92676n2() != null) {
            this.f60422k.m92676n2().runOnUiThread(new Runnable() { // from class: v50.yb

                /* renamed from: q */
                public final /* synthetic */ boolean f130202q;

                public /* synthetic */ RunnableC27912yb(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11621p0.this.m64650X1(r2);
                }
            });
        }
    }

    /* renamed from: P2 */
    void m64742P2(boolean z11) {
        boolean z12;
        ContactProfile m141809c;
        try {
            String str = this.f60422k.m60020gQ().mo60615Oc().m17971y0().f42900x;
            if (TextUtils.isEmpty(str) && (m141809c = C28203u6.f131407a.m141809c(this.f60422k.m60020gQ().mo60615Oc().m17944I0())) != null && !TextUtils.isEmpty(m141809c.f42351K)) {
                str = m141809c.f42351K;
            }
            if (TextUtils.isEmpty(str)) {
                m64750V2(z11);
                return;
            }
            C24003n m120062C = C23278z2.m120062C();
            C3979l m125676A2 = C23999j.m125676A2(str, m120062C.f116260a, m120062C.f116266g);
            if (m125676A2 != null && m125676A2.m18839c() != null && m125676A2.m18839c().getWidth() > 0 && m125676A2.m18839c().getHeight() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f60412f == null) {
                this.f60412f = new RecyclingImageView(this.f60408d.getContext());
            }
            if (z12) {
                this.f60412f.setImageInfo(m125676A2, false);
                m64719F2(this.f60408d, new BitmapDrawable(this.f60422k.m92651WI(), m125676A2.m18839c()), true, !z11, z11);
            } else {
                m64750V2(z11);
                AbstractC19444a.m101695c(new Runnable() { // from class: v50.ic

                    /* renamed from: q */
                    public final /* synthetic */ String f129748q;

                    /* renamed from: r */
                    public final /* synthetic */ C24003n f129749r;

                    /* renamed from: s */
                    public final /* synthetic */ boolean f129750s;

                    public /* synthetic */ RunnableC27689ic(String str2, C24003n m120062C2, boolean z112) {
                        r2 = str2;
                        r3 = m120062C2;
                        r4 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C11621p0.this.m64597E1(r2, r3, r4);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
            m64750V2(z112);
        }
    }

    /* renamed from: Q2 */
    public void m64743Q2(C3538f c3538f) {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            stickyChatThemesView.setThemeClick(c3538f);
        }
    }

    /* renamed from: Q3 */
    public void m64744Q3() {
        try {
            if (AbstractC26681b.f126380y) {
                if (C31948ha.m153587d().m153591e() != null) {
                    if (this.f60394S == null) {
                        this.f60394S = (StickyMusicPlayer) this.f60408d.m59179S();
                    }
                    this.f60394S.setVisibility(0);
                    this.f60394S.m75932c();
                    return;
                }
                StickyMusicPlayer stickyMusicPlayer = this.f60394S;
                if (stickyMusicPlayer != null) {
                    stickyMusicPlayer.setVisibility(8);
                    this.f60408d.removeView(this.f60394S);
                    this.f60408d.f56690b0 = null;
                    this.f60394S = null;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: R2 */
    public void m64745R2(boolean z11) {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            stickyChatThemesView.setLayoutFooterVisible(z11);
        }
    }

    /* renamed from: R3 */
    public void m64746R3(C3535c c3535c, boolean z11) {
        try {
            C17945a0 c17945a0 = (C17945a0) AbstractC23304d.f113448v2.get(c3535c.m17944I0());
            int i11 = 8;
            if (AbstractC26681b.f126379x && c17945a0 != null && !c17945a0.m94862C4().equals(CoreUtility.f89233i)) {
                if (this.f60396U == null) {
                    this.f60396U = (StickyNotiLiveStreamingBar) this.f60408d.m59180T();
                }
                StickyNotiLiveStreamingBar stickyNotiLiveStreamingBar = this.f60396U;
                if (z11) {
                    i11 = 0;
                }
                stickyNotiLiveStreamingBar.setVisibility(i11);
                this.f60396U.m75934a(c17945a0, new View.OnClickListener() { // from class: v50.ed

                    /* renamed from: q */
                    public final /* synthetic */ C17945a0 f129634q;

                    public /* synthetic */ ViewOnClickListenerC27630ed(C17945a0 c17945a02) {
                        r2 = c17945a02;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C11621p0.this.m64653Y1(r2, view);
                    }
                });
                return;
            }
            StickyNotiLiveStreamingBar stickyNotiLiveStreamingBar2 = this.f60396U;
            if (stickyNotiLiveStreamingBar2 != null) {
                stickyNotiLiveStreamingBar2.setVisibility(8);
                this.f60408d.removeView(this.f60396U);
            }
            this.f60408d.f56693e0 = null;
            this.f60396U = null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: S2 */
    public void m64747S2(C3538f c3538f) {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            stickyChatThemesView.setThemeLoading(c3538f);
        }
    }

    /* renamed from: T2 */
    public void m64748T2(C3538f c3538f) {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            stickyChatThemesView.setCurrentThemeSelected(c3538f);
        }
    }

    /* renamed from: U2 */
    public void m64749U2() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null) {
            this.f60422k.m59911YT(frameLayout);
        }
    }

    /* renamed from: V2 */
    void m64750V2(boolean z11) {
        try {
            String m42117F5 = C7960e.m41971c6().m42117F5(this.f60422k.f56789Q1.m153888F().m17944I0());
            if (!TextUtils.isEmpty(m42117F5)) {
                Drawable m143322c = C28646l.m143316d().m143322c(this.f60422k.getContext(), m42117F5);
                boolean m143323f = C28646l.m143316d().m143323f(m42117F5);
                if (m143322c != null) {
                    m64719F2(this.f60408d, m143322c, m143323f, m143323f, z11);
                } else {
                    m64724H2(this.f60408d);
                }
            } else if (AbstractC23309i.m122040j1().length() > 0) {
                String m122040j1 = AbstractC23309i.m122040j1();
                Drawable m143322c2 = C28646l.m143316d().m143322c(this.f60422k.getContext(), m122040j1);
                boolean m143323f2 = C28646l.m143316d().m143323f(m122040j1);
                if (m143322c2 != null) {
                    m64719F2(this.f60408d, m143322c2, m143323f2, m143323f2, z11);
                } else {
                    m64724H2(this.f60408d);
                }
            } else {
                m64724H2(this.f60408d);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
            m64724H2(this.f60408d);
        }
    }

    /* renamed from: W2 */
    void m64751W2(boolean z11, boolean z12) {
        C3538f m42175K5;
        try {
            String m17944I0 = this.f60422k.f56789Q1.m153888F().m17944I0();
            if (AbstractC25495a.m132078c(m17944I0)) {
                m42175K5 = null;
            } else {
                m42175K5 = C7960e.m41971c6().m42175K5(m17944I0);
            }
            AbstractC23306f.m120562A().m2533c0(m17944I0, m42175K5);
            if (m42175K5 != null) {
                if (TextUtils.isEmpty(m42175K5.f14931g)) {
                    m64750V2(z11);
                    m64725H3(true, m42175K5);
                    return;
                } else if (AbstractC23041d2.m118194A(m42175K5.f14931g)) {
                    m64711C2(m42175K5.f14931g, true, new b(m42175K5), z11, z12);
                    return;
                } else {
                    m64724H2(this.f60408d);
                    m64725H3(true, m42175K5);
                    return;
                }
            }
            m64750V2(z11);
            m64725H3(true, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
            m64724H2(this.f60408d);
            m64725H3(true, null);
        }
    }

    /* renamed from: X0 */
    public boolean m64752X0() {
        ZaloDrawerLayout zaloDrawerLayout = this.f60404b;
        if (zaloDrawerLayout == null) {
            return true;
        }
        return zaloDrawerLayout.m88328E();
    }

    /* renamed from: Y0 */
    public boolean m64753Y0() {
        FrameLayout frameLayout;
        if (this.f60422k.m92676n2() != null && this.f60422k.m92676n2().mo35576n3()) {
            return this.f60422k.m59669HQ();
        }
        ZaloDrawerLayout zaloDrawerLayout = this.f60404b;
        if (zaloDrawerLayout != null && (frameLayout = this.f60406c) != null && zaloDrawerLayout.m88324A(frameLayout)) {
            return true;
        }
        return false;
    }

    /* renamed from: Z0 */
    boolean m64754Z0() {
        if (this.f60422k.m92676n2() != null && this.f60422k.m92676n2().mo35576n3()) {
            return true;
        }
        return false;
    }

    /* renamed from: Z1 */
    public void m64755Z1() {
        FrameLayout frameLayout;
        try {
            ZaloDrawerLayout zaloDrawerLayout = this.f60404b;
            if (zaloDrawerLayout != null && (frameLayout = this.f60406c) != null) {
                zaloDrawerLayout.m88332J(1, frameLayout);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: a1 */
    public boolean m64756a1() {
        NewMultiPhotoSuggestView newMultiPhotoSuggestView = this.f60423k0;
        if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0 && this.f60423k0.getMode() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a2 */
    public void m64757a2() {
        FrameLayout frameLayout;
        C11815a c11815a;
        if (C3255n.m16555f() && (frameLayout = this.f60434q) != null && frameLayout.getVisibility() == 0 && (c11815a = this.f60440t) != null) {
            c11815a.m10008p();
        }
    }

    /* renamed from: b1 */
    public boolean m64758b1() {
        NewMultiPhotoSuggestView newMultiPhotoSuggestView = this.f60423k0;
        if (newMultiPhotoSuggestView != null && newMultiPhotoSuggestView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b2 */
    public void m64759b2() {
        try {
            RecyclingImageView recyclingImageView = this.f60414g;
            if (recyclingImageView != null) {
                recyclingImageView.setImageInfo(null);
            }
            RecyclingImageView recyclingImageView2 = this.f60412f;
            if (recyclingImageView2 != null) {
                recyclingImageView2.setImageInfo(null);
            }
            m64675k0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: c1 */
    public boolean m64760c1() {
        if (m64802o1() && (this.f60422k.mo59948ba(EnumC19450c.f96557t) || this.f60422k.mo59948ba(EnumC19450c.f96562y))) {
            return true;
        }
        return false;
    }

    /* renamed from: c2 */
    public void m64761c2(int i11) {
        ChatFrameLayout chatFrameLayout = this.f60408d;
        if (chatFrameLayout != null) {
            chatFrameLayout.setPaddingBottom(i11);
            this.f60408d.requestLayout();
        }
    }

    /* renamed from: d0 */
    public View m64762d0() {
        return this.f60408d.m59175O();
    }

    /* renamed from: d1 */
    public boolean m64763d1() {
        try {
            ZaloView m92996E0 = this.f60422k.m92649TI().m92996E0("request_location_fragment");
            if (m92996E0 == null) {
                return false;
            }
            if (!m92996E0.m92687sJ()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
            return false;
        }
    }

    /* renamed from: d2 */
    public void m64764d2() {
        try {
            QuickActionViewLayout quickActionViewLayout = this.f60398W;
            if (quickActionViewLayout != null) {
                InterfaceC13567b1 interfaceC13567b1 = quickActionViewLayout.f69453s;
                if (interfaceC13567b1 instanceof QuickActionViewType5) {
                    ((QuickActionViewType5) interfaceC13567b1).setEnableAutoSliding(false);
                }
            }
            if (!this.f60422k.mo59787QH()) {
                m64726I0();
            }
            if (!this.f60427m0) {
                m64721G0();
            }
            m64715E0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: d3 */
    public void m64765d3(ChatWindowReference chatWindowReference) {
        if (chatWindowReference != null && chatWindowReference.m65297b()) {
            if (this.f60447w0 != null) {
                return;
            }
            BackToLastChatView m59190f = this.f60408d.m59190f();
            this.f60447w0 = m59190f;
            if (m59190f == null) {
                return;
            }
            m59190f.m65308V(chatWindowReference);
            this.f60447w0.setOnClickListener(new View.OnClickListener() { // from class: v50.fd

                /* renamed from: q */
                public final /* synthetic */ ChatWindowReference f129653q;

                public /* synthetic */ ViewOnClickListenerC27645fd(ChatWindowReference chatWindowReference2) {
                    r2 = chatWindowReference2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11621p0.this.m64601G1(r2, view);
                }
            });
            return;
        }
        m64803o2();
    }

    /* renamed from: e0 */
    public void m64766e0(boolean z11) {
        try {
            ChatFrameLayout chatFrameLayout = this.f60408d;
            if (chatFrameLayout != null) {
                chatFrameLayout.m59183W(z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: e1 */
    public boolean m64767e1() {
        C11815a c11815a = this.f60440t;
        if (c11815a != null && c11815a.mo10003k() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e2 */
    public void m64768e2() {
        try {
            QuickActionViewLayout quickActionViewLayout = this.f60398W;
            if (quickActionViewLayout != null) {
                InterfaceC13567b1 interfaceC13567b1 = quickActionViewLayout.f69453s;
                if (interfaceC13567b1 instanceof QuickActionViewType5) {
                    ((QuickActionViewType5) interfaceC13567b1).setEnableAutoSliding(true);
                }
            }
            m64781i0();
            m64741O3(C20024r.m103943l());
            m64757a2();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: e3 */
    public void m64769e3(C17945a0 c17945a0) {
        if (c17945a0 != null) {
            try {
                if (c17945a0.m94929K2() instanceof C17990p0) {
                    FileDownloadBannerView fileDownloadBannerView = (FileDownloadBannerView) this.f60408d.m59216y();
                    fileDownloadBannerView.setVisibility(0);
                    fileDownloadBannerView.setTag(c17945a0);
                    fileDownloadBannerView.setContent(c17945a0);
                    fileDownloadBannerView.m75715g();
                    fileDownloadBannerView.m75716h();
                    fileDownloadBannerView.m75719k(true, 3000L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: f0 */
    public boolean m64770f0() {
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = this.f60445v0;
        if (embeddedMyCloudPagesLayout != null && embeddedMyCloudPagesLayout.m70168Y0()) {
            return true;
        }
        return false;
    }

    /* renamed from: f1 */
    public boolean m64771f1() {
        if (m64818t0() != null && m64818t0().m65357h()) {
            return true;
        }
        return false;
    }

    /* renamed from: f2 */
    public void m64772f2(C27675hd c27675hd) {
        try {
            RequestLocationView requestLocationView = this.f60400Y;
            if (requestLocationView != null && requestLocationView.m92674mJ() && !TextUtils.isEmpty(this.f60422k.m60020gQ().mo60615Oc().m17944I0())) {
                c27675hd.f129711e = this.f60422k.m60020gQ().mo60615Oc().m17944I0();
                c27675hd.f129712f = this.f60400Y.m83769gM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: f3 */
    public void m64773f3(List list, String str) {
        m64619N0(list, str);
        ChatView chatView = this.f60422k;
        if (chatView.f56846e3 != 0) {
            chatView.mo59706Ka(0);
        }
    }

    /* renamed from: g1 */
    public boolean m64774g1() {
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = this.f60445v0;
        if (embeddedMyCloudPagesLayout != null && embeddedMyCloudPagesLayout.m70161T0()) {
            return true;
        }
        return false;
    }

    /* renamed from: g2 */
    public void m64775g2(ArrayList arrayList, String str, String str2) {
        try {
            if (this.f60422k.m92676n2() != null) {
                Bundle m83056qM = ProfilePickerView.m83056qM(new ArrayList(), 9, this.f60422k.m92652XI(AbstractC8020f0.str_sharecontact_title));
                m83056qM.putBoolean("extra_show_selected_number", true);
                if (arrayList != null) {
                    m83056qM.putStringArrayList("extra_preselect_uids", arrayList);
                }
                m83056qM.putString("STR_SOURCE_START_VIEW", str);
                m83056qM.putString("STR_LOG_CHAT_TYPE", str2);
                this.f60422k.m92693xK().m93066i2(ShareContactView.class, m83056qM, 10001, 1, true);
                return;
            }
            Intent m83057rM = ProfilePickerView.m83057rM(this.f60422k.m92648SI(), new ArrayList(), 9, this.f60422k.m92652XI(AbstractC8020f0.str_sharecontact_title));
            m83057rM.putExtra("extra_show_selected_number", true);
            if (arrayList != null) {
                m83057rM.putStringArrayListExtra("extra_preselect_uids", arrayList);
            }
            Bundle extras = m83057rM.getExtras();
            if (extras != null) {
                extras.putString("STR_SOURCE_START_VIEW", str);
                extras.putString("STR_LOG_CHAT_TYPE", str2);
            }
            this.f60422k.startActivityForResult(AbstractC23152n3.m119012O(ShareContactView.class, extras), 10001);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: g3 */
    public void m64776g3() {
        if (this.f60416h == null) {
            return;
        }
        ChatBottomOverlayContainerView m64818t0 = m64818t0();
        if (m64818t0 == null) {
            m64818t0 = this.f60408d.m59192h();
        }
        m64818t0.m65360l(this.f60416h, this.f60441t0);
        m64818t0.m65361m(true);
    }

    /* renamed from: h0 */
    public void m64777h0() {
        if (!this.f60422k.m60020gQ().mo60615Oc().m17971y0().m41015u()) {
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new p());
    }

    /* renamed from: h1 */
    public boolean m64778h1() {
        QuickReplySuggestionContainer quickReplySuggestionContainer = this.f60438s;
        if (quickReplySuggestionContainer != null && quickReplySuggestionContainer.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h2 */
    public void m64779h2() {
        m64783i2(-1);
    }

    /* renamed from: h3 */
    public void m64780h3(boolean z11, boolean z12) {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            stickyChatThemesView.m65725j(z11, z12);
        }
    }

    /* renamed from: i0 */
    public void m64781i0() {
        try {
            this.f60384I = "";
            this.f60385J = "";
            this.f60386K = false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: i1 */
    public boolean m64782i1() {
        return C26664o.m136836a().m136837b(this.f60422k.m60020gQ().mo60615Oc().m17944I0());
    }

    /* renamed from: i2 */
    public void m64783i2(int i11) {
        FrameLayout frameLayout;
        try {
            if (this.f60422k.m92692wK().mo35576n3()) {
                this.f60422k.mo60057iy(false, false);
                this.f60422k.m60022gU(i11);
            } else {
                ZaloDrawerLayout zaloDrawerLayout = this.f60404b;
                if (zaloDrawerLayout != null && (frameLayout = this.f60406c) != null) {
                    zaloDrawerLayout.m88330G(frameLayout);
                }
            }
            this.f60422k.m60020gQ().mo60825wa();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: i3 */
    public void m64784i3() {
        try {
            if (this.f60417h0) {
                m64797n0(0L);
            } else if (this.f60422k.m59962cU()) {
                ToastUtils.m89266n(AbstractC8020f0.str_feature_not_available_for_stranger, new Object[0]);
            } else {
                this.f60428n.m106857c();
                this.f60428n.m106855a(this.f60422k.m60020gQ().mo60615Oc().m17944I0(), new C20559a.e() { // from class: v50.gc
                    public /* synthetic */ C27659gc() {
                    }

                    @Override // p240ii.C20559a.e
                    /* renamed from: a */
                    public final void mo106865a(boolean z11, C3538f c3538f, String str) {
                        C11621p0.this.m64609J1(z11, c3538f, str);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: j0 */
    public void m64785j0() {
        m64616M0();
        m64613L0();
        m64718F0();
    }

    /* renamed from: j1 */
    public boolean m64786j1() {
        C11815a c11815a = this.f60440t;
        if (c11815a != null && c11815a.mo10003k() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j2 */
    public void m64787j2(C17945a0 c17945a0) {
        try {
            AbstractC23152n3.m119036c0(this.f60422k.getContext(), new C20556f(c17945a0.m94983Q3()));
            ((C17990p0) c17945a0.m94929K2()).f91117F = true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: j3 */
    public void m64788j3() {
        View m64697w0 = m64697w0();
        if (this.f60422k.m92662fJ() != null) {
            this.f60422k.m92662fJ().m93086w(m64697w0, 998, null);
        }
    }

    /* renamed from: k1 */
    public boolean m64789k1() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k2 */
    public void m64790k2() {
        C31959i6 c31959i6 = this.f60382G;
        if (c31959i6 != null) {
            c31959i6.m153661d();
        }
    }

    /* renamed from: k3 */
    public void m64791k3(EmbeddedMyCloudPagesLayout.InterfaceC12480b interfaceC12480b) {
        if (this.f60445v0 != null) {
            return;
        }
        Conversation m17971y0 = this.f60422k.m60020gQ().mo60615Oc().m17971y0();
        if (this.f60422k.m60020gQ().mo60584Ja() && C23250w4.m119814r(m17971y0.f42893q)) {
            EmbeddedMyCloudPagesLayout m59214x = this.f60408d.m59214x();
            this.f60445v0 = m59214x;
            if (m59214x == null) {
                return;
            }
            m59214x.m70147I0(this.f60422k);
            InterfaceC27218a m92676n2 = this.f60422k.m92676n2();
            if (m92676n2 != null && AbstractC32226c.m155415n(m92676n2)) {
                this.f60445v0.setMultiSelectUITopOffset(AbstractC32226c.m155411j(m92676n2).top);
            }
            this.f60445v0.setEventListener(interfaceC12480b);
        }
    }

    /* renamed from: l1 */
    public boolean m64792l1() {
        if (m64802o1() && this.f60422k.mo59948ba(EnumC19450c.f96554q)) {
            return true;
        }
        return false;
    }

    /* renamed from: l3 */
    public void m64793l3(String str, View.OnClickListener onClickListener) {
        try {
            if (this.f60435q0 == null) {
                this.f60435q0 = this.f60408d.m59218z();
                ViewOnLayoutChangeListenerC27674hc viewOnLayoutChangeListenerC27674hc = new View.OnLayoutChangeListener() { // from class: v50.hc
                    public /* synthetic */ ViewOnLayoutChangeListenerC27674hc() {
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        C11621p0.this.m64614L1(view, i11, i12, i13, i14, i15, i16, i17, i18);
                    }
                };
                this.f60437r0 = viewOnLayoutChangeListenerC27674hc;
                this.f60435q0.addOnLayoutChangeListener(viewOnLayoutChangeListenerC27674hc);
                this.f60410e.addOnLayoutChangeListener(this.f60437r0);
            }
            this.f60435q0.m69742W(str, onClickListener);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: m0 */
    public void m64794m0() {
        try {
            this.f60428n.m106858d(this.f60422k.m60020gQ().mo60615Oc().m17944I0(), new C20559a.g() { // from class: v50.rc
                public /* synthetic */ C27815rc() {
                }

                @Override // p240ii.C20559a.g
                /* renamed from: a */
                public final void mo65307a(C3538f c3538f) {
                    C11621p0.this.m64687r1(c3538f);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: m1 */
    public boolean m64795m1() {
        if (m64802o1() && this.f60422k.mo59948ba(EnumC19450c.f96556s)) {
            return true;
        }
        return false;
    }

    /* renamed from: m2 */
    public void m64796m2(String str, int i11, int i12) {
        try {
            this.f60422k.mo59714LA();
            Bundle bundle = new Bundle();
            bundle.putString("emoji", str);
            bundle.putInt("x", i11);
            bundle.putInt("y", i12);
            this.f60422k.mo60056iu(169, bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: n0 */
    public void m64797n0(long j11) {
        FrameLayout frameLayout;
        try {
            if (this.f60422k.m92692wK().mo35576n3()) {
                ChatView chatView = this.f60422k;
                chatView.mo60057iy(chatView.m60019gP(), true);
                this.f60422k.m59731MP();
            } else {
                ZaloDrawerLayout zaloDrawerLayout = this.f60404b;
                if (zaloDrawerLayout != null && (frameLayout = this.f60406c) != null && zaloDrawerLayout.m88324A(frameLayout)) {
                    if (j11 > 0) {
                        this.f60424l.postDelayed(new Runnable() { // from class: v50.cd
                            public /* synthetic */ RunnableC27600cd() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C11621p0.this.m64689s1();
                            }
                        }, j11);
                    } else {
                        this.f60404b.m88338d(this.f60406c);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: n1 */
    public boolean m64798n1() {
        SuggestLinkModulesView suggestLinkModulesView = this.f60431o0;
        if (suggestLinkModulesView != null && suggestLinkModulesView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n2 */
    public void m64799n2(boolean z11, boolean z12) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.ac

            /* renamed from: q */
            public final /* synthetic */ boolean f129543q;

            /* renamed from: r */
            public final /* synthetic */ boolean f129544r;

            /* renamed from: s */
            public final /* synthetic */ boolean f129545s;

            public /* synthetic */ RunnableC27569ac(boolean z112, boolean z13, boolean z122) {
                r2 = z112;
                r3 = z13;
                r4 = z122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64587A1(r2, r3, r4);
            }
        });
    }

    /* renamed from: n3 */
    public void m64800n3(StickyChatThemesView.InterfaceC11825e interfaceC11825e, C3538f c3538f, C3538f c3538f2, boolean z11, String str) {
        try {
            if (this.f60397V == null) {
                this.f60397V = (StickyChatThemesView) this.f60408d.m59210v();
            }
            if (z11) {
                this.f60397V.m65722e(C20559a.f100942e, c3538f, c3538f2, str);
                this.f60397V.setChatThemeListener(interfaceC11825e);
                this.f60397V.setVisibility(4);
                m64680m3(true);
                return;
            }
            if (this.f60397V != null) {
                m64680m3(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: o0 */
    public View m64801o0(Context context) {
        ChatFrameLayout chatFrameLayout = new ChatFrameLayout(context);
        this.f60408d = chatFrameLayout;
        chatFrameLayout.setId(AbstractC6918a0.main_chat_view);
        SwipeItemListView swipeItemListView = new SwipeItemListView(context);
        this.f60410e = swipeItemListView;
        swipeItemListView.setId(AbstractC6918a0.chatlinelist);
        this.f60410e.setVerticalScrollBarEnabled(false);
        this.f60410e.setClipToPadding(false);
        this.f60410e.setItemAnimator(null);
        this.f60410e.setLayoutAnimation(null);
        SwipeItemListView swipeItemListView2 = this.f60410e;
        ChatView chatView = this.f60422k;
        Objects.requireNonNull(chatView);
        swipeItemListView2.setSwipeListViewListener(new SwipeItemListView.InterfaceC13766a() { // from class: v50.wb
            public /* synthetic */ C27884wb() {
            }

            @Override // com.zing.zalo.p077ui.widget.recyclerview.SwipeItemListView.InterfaceC13766a
            /* renamed from: a */
            public final void mo76922a(C17945a0 c17945a0) {
                ChatView.this.m60101lT(c17945a0);
            }
        });
        this.f60408d.m59208u(this.f60410e, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        ActionBar actionBar = new ActionBar(context);
        actionBar.setId(AbstractC6918a0.zalo_action_bar);
        actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        actionBar.setElevation(AbstractC23136l9.m118742r(3.0f));
        frameLayout.addView(actionBar, new ViewGroup.LayoutParams(-1, -2));
        this.f60408d.m59189e(frameLayout, actionBar, new ViewGroup.LayoutParams(-1, -1));
        this.f60408d.setOnKeyboardListener(new k());
        if (this.f60422k.m92676n2() != null && !this.f60422k.m92676n2().mo35576n3()) {
            ZaloDrawerLayout zaloDrawerLayout = new ZaloDrawerLayout(context);
            this.f60404b = zaloDrawerLayout;
            zaloDrawerLayout.setId(AbstractC6918a0.chat_drawer_layout);
            this.f60404b.setEnableQuickPeekMode(false);
            this.f60404b.addView(this.f60408d, new ViewGroup.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f60406c = frameLayout2;
            frameLayout2.setId(AbstractC6918a0.chat_right_drawer_layout);
            ZaloDrawerLayout.LayoutParams layoutParams = new ZaloDrawerLayout.LayoutParams(-1, -1);
            layoutParams.f83769a = 8388613;
            this.f60404b.addView(this.f60406c, layoutParams);
            this.f60402a = this.f60404b;
        } else {
            this.f60402a = this.f60408d;
        }
        this.f60402a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f60382G = new C31959i6(this.f60422k);
        return this.f60402a;
    }

    /* renamed from: o1 */
    public boolean m64802o1() {
        FrameLayout frameLayout = this.f60434q;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o2 */
    public void m64803o2() {
        this.f60408d.m59200p0();
        this.f60447w0 = null;
    }

    /* renamed from: o3 */
    public void m64804o3(boolean z11) {
        int i11;
        QuickActionViewLayout quickActionViewLayout = this.f60399X;
        if (quickActionViewLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            quickActionViewLayout.setVisibility(i11);
        }
    }

    /* renamed from: p0 */
    public boolean m64805p0() {
        View findViewWithTag = this.f60408d.findViewWithTag("WalkThroughOnboardView");
        if (findViewWithTag != null) {
            this.f60408d.removeView(findViewWithTag);
            return true;
        }
        return false;
    }

    /* renamed from: p1 */
    public boolean m64806p1() {
        if (m64802o1() && this.f60422k.mo59948ba(EnumC19450c.f96559v)) {
            return true;
        }
        return false;
    }

    /* renamed from: p2 */
    public void m64807p2() {
        ChatFrameLayout chatFrameLayout = this.f60408d;
        if (chatFrameLayout != null) {
            chatFrameLayout.m59202q0(true);
        }
    }

    /* renamed from: p3 */
    public void m64808p3(boolean z11) {
        int i11;
        QuickActionViewLayout quickActionViewLayout = this.f60398W;
        if (quickActionViewLayout != null) {
            if (z11 && !this.f60422k.m60020gQ().mo60741i0()) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            quickActionViewLayout.setVisibility(i11);
        }
    }

    /* renamed from: q0 */
    public void m64809q0() {
        this.f60408d.dispatchKeyEvent(new KeyEvent(0, 4));
        this.f60408d.dispatchKeyEvent(new KeyEvent(1, 4));
    }

    /* renamed from: q2 */
    public void m64810q2() {
        try {
            if (this.f60435q0 != null) {
                this.f60408d.m59204r0();
                View.OnLayoutChangeListener onLayoutChangeListener = this.f60437r0;
                if (onLayoutChangeListener != null) {
                    this.f60410e.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                SwipeItemListView swipeItemListView = this.f60410e;
                swipeItemListView.setPadding(swipeItemListView.getPaddingLeft(), this.f60410e.getPaddingTop(), this.f60410e.getPaddingRight(), 0);
                this.f60435q0 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: q3 */
    public void m64811q3(int i11) {
        ChatFrameLayout chatFrameLayout = this.f60408d;
        if (chatFrameLayout != null) {
            chatFrameLayout.setPaddingBottom(AbstractC23309i.m122007i5(this.f60422k.m92689tK()) + i11);
        }
    }

    /* renamed from: r0 */
    public synchronized void m64812r0(C17945a0 c17945a0, String str, boolean z11, boolean z12, boolean z13) {
        long j11;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        } finally {
        }
        if (AbstractC23309i.m122610yb() && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f60384I)) {
                if (TextUtils.equals(this.f60384I, str + "")) {
                }
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c17945a0.m94862C4());
            ChatComposePanelNew chatComposePanelNew = this.f60422k.f56819X3;
            if ((chatComposePanelNew == null || (!chatComposePanelNew.m75574B() && !this.f60422k.f56819X3.m75575C())) && !this.f60422k.mo59727Ly() && !this.f60422k.mo60120mu() && !this.f60422k.mo59886Wb() && !this.f60422k.mo60249vF() && !this.f60417h0 && !m64753Y0()) {
                if (!(!TextUtils.isEmpty(this.f60384I)) || z11) {
                    Map mo150728A = AbstractC23306f.m120726x1().mo150728A();
                    if (mo150728A.get(c17945a0.mo95039W2()) != null) {
                        ((Map) mo150728A.get(c17945a0.mo95039W2())).remove(Long.valueOf(c17945a0.m95029V3().m41045i()));
                    }
                    this.f60384I = str;
                    this.f60385J = c17945a0.m94862C4();
                    this.f60386K = z12;
                    if (this.f60422k.m59974dQ() != null) {
                        z zVar = new z();
                        zVar.f60505a = m141809c;
                        zVar.f60506b = z13;
                        TouchListView m59974dQ = this.f60422k.m59974dQ();
                        RunnableC11619o0 runnableC11619o0 = new Runnable() { // from class: com.zing.zalo.ui.chat.o0

                            /* renamed from: q */
                            public final /* synthetic */ String f60368q;

                            /* renamed from: r */
                            public final /* synthetic */ C17945a0 f60369r;

                            /* renamed from: s */
                            public final /* synthetic */ C11621p0.z f60370s;

                            public /* synthetic */ RunnableC11619o0(String str2, C17945a0 c17945a02, C11621p0.z zVar2) {
                                r2 = str2;
                                r3 = c17945a02;
                                r4 = zVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C11621p0.this.m64691t1(r2, r3, r4);
                            }
                        };
                        if (z11) {
                            j11 = 0;
                        } else {
                            j11 = 300;
                        }
                        m59974dQ.postDelayed(runnableC11619o0, j11);
                    }
                }
            }
        }
    }

    /* renamed from: r2 */
    void m64813r2() {
        LiveLocationBar liveLocationBar = this.f60395T;
        if (liveLocationBar != null) {
            this.f60408d.removeView(liveLocationBar);
            this.f60408d.f56700l0 = null;
            this.f60395T = null;
        }
    }

    /* renamed from: r3 */
    public boolean m64814r3(ChatAttachmentContainer.C11728c c11728c) {
        if (c11728c != null) {
            try {
                if (c11728c.m65330h() == 3) {
                    Runnable runnable = this.f60433p0;
                    if (runnable != null) {
                        this.f60424l.removeCallbacks(runnable);
                    } else {
                        this.f60433p0 = new Runnable() { // from class: v50.tc
                            public /* synthetic */ RunnableC27843tc() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C11621p0.this.m64617M1();
                            }
                        };
                    }
                    if (this.f60431o0 == null) {
                        this.f60431o0 = (SuggestLinkModulesView) this.f60408d.m59156A();
                    }
                    AbstractC23202r9.m119540h(this.f60431o0, new m());
                    C32190y7.m155216t().m155222D(false);
                    C32190y7.m155216t().m155220B(true);
                    this.f60431o0.m69744W(c11728c);
                    this.f60431o0.setSuggestLinkActionListener(new n(c11728c));
                    Runnable runnable2 = this.f60433p0;
                    if (runnable2 != null) {
                        this.f60424l.postDelayed(runnable2, AbstractC23306f.m120562A().m2566x().m155345c());
                    }
                    C32190y7.m155216t().m155219A(System.currentTimeMillis());
                    this.f60422k.m60020gQ().mo60792s6();
                    return true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f60375z0, e11);
            }
        }
        return false;
    }

    /* renamed from: s0 */
    public synchronized void m64815s0(String str, boolean z11, boolean z12) {
        boolean z13;
        try {
            if (AbstractC23309i.m122610yb() && !TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f60384I)) {
                    if (TextUtils.equals(this.f60384I, str + "")) {
                    }
                }
                ChatComposePanelNew chatComposePanelNew = this.f60422k.f56819X3;
                boolean z14 = false;
                if (chatComposePanelNew != null && (chatComposePanelNew.m75574B() || this.f60422k.f56819X3.m75575C())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!this.f60422k.mo60244v2() && ZaloBubbleActivity.m57017B5()) {
                    z14 = true;
                }
                if (!z13 && !this.f60422k.mo59727Ly() && !this.f60422k.mo60120mu() && !this.f60422k.mo59886Wb() && !this.f60417h0 && !z14) {
                    this.f60384I = str;
                    if (this.f60391P == null) {
                        this.f60391P = new C26674y.b() { // from class: v50.lc

                            /* renamed from: b */
                            public final /* synthetic */ boolean f129819b;

                            /* renamed from: c */
                            public final /* synthetic */ boolean f129820c;

                            public /* synthetic */ C27731lc(boolean z122, boolean z112) {
                                r2 = z122;
                                r3 = z112;
                            }

                            @Override // tg.C26674y.b
                            /* renamed from: a */
                            public final void mo15759a(int i11, String str2, String str3, C26657h c26657h) {
                                C11621p0.this.m64695v1(r2, r3, i11, str2, str3, c26657h);
                            }
                        };
                    }
                    this.f60422k.mo46829Y();
                    C26674y.m136865t().m136877n(str, "preview_" + str, this.f60391P, (byte) 6);
                }
            }
        } finally {
        }
    }

    /* renamed from: s2 */
    public void m64816s2() {
        this.f60408d.m59207t0();
    }

    /* renamed from: s3 */
    public void m64817s3() {
        try {
            if (this.f60403a0 == null) {
                MaterialProgressBar materialProgressBar = new MaterialProgressBar(this.f60402a.getContext());
                this.f60403a0 = materialProgressBar;
                materialProgressBar.setIndeterminate(true);
                this.f60408d.f56679N = this.f60403a0;
                this.f60408d.addView(this.f60403a0, new FrameLayout.LayoutParams(-1, AbstractC23136l9.m118742r(1.0f)));
            }
            this.f60403a0.setVisibility(0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60375z0, e11);
        }
    }

    /* renamed from: t0 */
    public ChatBottomOverlayContainerView m64818t0() {
        return this.f60408d.f56715u0;
    }

    /* renamed from: t2 */
    public void m64819t2() {
        this.f60408d.m59209u0();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:3:0x0002, B:8:0x000a, B:10:0x0018, B:11:0x0021, B:15:0x0033, B:20:0x005f, B:23:0x006f, B:25:0x0081, B:26:0x008b, B:29:0x00a3, B:33:0x00ad, B:35:0x00bf, B:38:0x00c6, B:40:0x00eb, B:41:0x00f2), top: B:2:0x0002 }] */
    /* renamed from: t3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m64820t3(List list, int i11) {
        String str;
        String str2;
        int i12;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    C32050o7.m154655h().m154663m(list);
                    m64715E0();
                    Runnable runnable = this.f60425l0;
                    if (runnable != null) {
                        this.f60424l.removeCallbacks(runnable);
                    }
                    String str3 = "1";
                    if (!this.f60422k.m60020gQ().mo60624Q7()) {
                        str = "1";
                    } else {
                        str = "2";
                    }
                    C32050o7.m154655h().m154665o("photo_suggest_show", list, this.f60422k.m60020gQ().mo60636Rn(), str);
                    C0815e1 m2075D = C0815e1.m2075D();
                    String[] strArr = new String[2];
                    if (this.f60422k.m60020gQ().mo60834x7()) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    boolean z11 = false;
                    strArr[0] = str2;
                    if (!this.f60422k.m60020gQ().mo60636Rn()) {
                        str3 = "0";
                    }
                    strArr[1] = str3;
                    m2075D.m2099U(3, 1, 16, strArr);
                    i iVar = new i();
                    if (this.f60423k0 == null) {
                        this.f60423k0 = (NewMultiPhotoSuggestView) this.f60408d.m59163E();
                    }
                    AbstractC23202r9.m119540h(this.f60423k0, new j());
                    this.f60423k0.setNewMultiPhotoSuggestListener(iVar);
                    this.f60423k0.setUIOption(i11);
                    if (i11 != 0 && (i11 != 1 || list.size() != 1)) {
                        i12 = 1;
                        this.f60423k0.setMode(i12);
                        this.f60423k0.setData(list);
                        NewMultiPhotoSuggestView newMultiPhotoSuggestView = this.f60423k0;
                        if (AbstractC23309i.m121048If() && AbstractC23309i.m122504vg()) {
                            z11 = true;
                        }
                        newMultiPhotoSuggestView.setListMediaItemHD(z11);
                        this.f60423k0.f61205V = this.f60422k.m60020gQ().mo60636Rn();
                        this.f60423k0.m65512e0(true);
                        this.f60423k0.f61206W = str;
                        AbstractC23309i.m121650Yp(System.currentTimeMillis());
                        if (this.f60425l0 == null) {
                            this.f60425l0 = new Runnable() { // from class: v50.sc
                                public /* synthetic */ RunnableC27829sc() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C11621p0.this.m64620N1();
                                }
                            };
                        }
                        this.f60424l.postDelayed(this.f60425l0, AbstractC23306f.m120562A().m2511B().m2712a() * 1000);
                        this.f60430o = this.f60422k.m60020gQ().mo60615Oc().m136068l0();
                    }
                    i12 = 0;
                    this.f60423k0.setMode(i12);
                    this.f60423k0.setData(list);
                    NewMultiPhotoSuggestView newMultiPhotoSuggestView2 = this.f60423k0;
                    if (AbstractC23309i.m121048If()) {
                        z11 = true;
                    }
                    newMultiPhotoSuggestView2.setListMediaItemHD(z11);
                    this.f60423k0.f61205V = this.f60422k.m60020gQ().mo60636Rn();
                    this.f60423k0.m65512e0(true);
                    this.f60423k0.f61206W = str;
                    AbstractC23309i.m121650Yp(System.currentTimeMillis());
                    if (this.f60425l0 == null) {
                    }
                    this.f60424l.postDelayed(this.f60425l0, AbstractC23306f.m120562A().m2511B().m2712a() * 1000);
                    this.f60430o = this.f60422k.m60020gQ().mo60615Oc().m136068l0();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f60375z0, e11);
            }
        }
    }

    /* renamed from: u0 */
    public boolean m64821u0() {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            return stickyChatThemesView.getCheckedSyncTheme();
        }
        return false;
    }

    /* renamed from: u2 */
    public void m64822u2() {
        this.f60408d.m59211v0();
    }

    /* renamed from: u3 */
    public View m64823u3() {
        return this.f60408d.m59165F();
    }

    /* renamed from: v0 */
    public ZaloDrawerLayout m64824v0() {
        return this.f60404b;
    }

    /* renamed from: v2 */
    public void m64825v2() {
        this.f60408d.m59213w0();
        this.f60399X = null;
    }

    /* renamed from: v3 */
    public void m64826v3(int i11, WalkThroughOnboardView.InterfaceC13300b interfaceC13300b) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.wc

            /* renamed from: q */
            public final /* synthetic */ int f130138q;

            /* renamed from: r */
            public final /* synthetic */ WalkThroughOnboardView.InterfaceC13300b f130139r;

            public /* synthetic */ RunnableC27885wc(int i112, WalkThroughOnboardView.InterfaceC13300b interfaceC13300b2) {
                r2 = i112;
                r3 = interfaceC13300b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11621p0.this.m64626P1(r2, r3);
            }
        });
    }

    /* renamed from: w2 */
    public void m64827w2() {
        this.f60408d.m59215x0();
        this.f60398W = null;
    }

    /* renamed from: w3 */
    public View m64828w3(ContactProfile contactProfile, boolean z11, C31922g c31922g, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC21485c interfaceC21485c) {
        m64822u2();
        UserSafetyWarningBannerModulesView m59164E0 = this.f60408d.m59164E0();
        if (m59164E0 != null) {
            m59164E0.m65347V(contactProfile, z11, c31922g, z12, z13, z14, z15);
            m59164E0.setListener(interfaceC21485c);
        }
        return m59164E0;
    }

    /* renamed from: x0 */
    public EmbeddedMyCloudPagesLayout m64829x0() {
        return this.f60445v0;
    }

    /* renamed from: x2 */
    public void m64830x2() {
        this.f60408d.m59217y0();
    }

    /* renamed from: x3 */
    public View m64831x3(boolean z11, boolean z12, boolean z13, InterfaceC21485c interfaceC21485c) {
        m64819t2();
        View m59166F0 = this.f60408d.m59166F0();
        if (m59166F0 != null) {
            Context context = m59166F0.getContext();
            TextView textView = (TextView) m59166F0.findViewById(AbstractC6918a0.tv_function_privacy);
            View findViewById = m59166F0.findViewById(AbstractC6918a0.layout_accept_friend_request);
            View findViewById2 = m59166F0.findViewById(AbstractC6918a0.layout_friend_blocked);
            View findViewById3 = m59166F0.findViewById(AbstractC6918a0.background_selector);
            RobotoTextView robotoTextView = (RobotoTextView) m59166F0.findViewById(AbstractC6918a0.add_friend_title_desc);
            textView.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            if (z11) {
                textView.setVisibility(0);
                findViewById.setVisibility(8);
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_done_action_friend_suggest_new));
                textView.setAlpha(0.5f);
                m59166F0.setEnabled(false);
            } else if (z12) {
                textView.setVisibility(8);
                findViewById.setVisibility(0);
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_request_desc));
                findViewById3.setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
                m59166F0.setOnClickListener(null);
                RobotoTextView robotoTextView2 = (RobotoTextView) m59166F0.findViewById(AbstractC6918a0.btn_accept_friend_request);
                if (robotoTextView2 != null) {
                    robotoTextView2.setText(C26446c.m136326b().m136327a());
                    robotoTextView2.setOnClickListener(new View.OnClickListener() { // from class: v50.nc
                        public /* synthetic */ ViewOnClickListenerC27759nc() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C11621p0.m64633R1(InterfaceC21485c.this, view);
                        }
                    });
                }
                RobotoTextView robotoTextView3 = (RobotoTextView) m59166F0.findViewById(AbstractC6918a0.btn_unblock_friend);
                if (robotoTextView3 != null) {
                    robotoTextView3.setOnClickListener(new View.OnClickListener() { // from class: v50.oc
                        public /* synthetic */ ViewOnClickListenerC27773oc() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C11621p0.m64636S1(InterfaceC21485c.this, view);
                        }
                    });
                }
                m59166F0.setVisibility(0);
            } else {
                textView.setVisibility(0);
                findViewById.setVisibility(8);
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_func_Add));
                textView.setAlpha(1.0f);
                m59166F0.setEnabled(true);
            }
            findViewById3.setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_bg_pressed));
            m59166F0.setOnClickListener(new View.OnClickListener() { // from class: v50.mc
                public /* synthetic */ ViewOnClickListenerC27745mc() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11621p0.m64630Q1(InterfaceC21485c.this, view);
                }
            });
            m59166F0.setVisibility(0);
        }
        return m59166F0;
    }

    /* renamed from: y0 */
    public NewMultiPhotoSuggestView m64832y0() {
        return this.f60423k0;
    }

    /* renamed from: y2 */
    public void m64833y2() {
        this.f60408d.m59219z0();
    }

    /* renamed from: y3 */
    public void m64834y3(C31862c c31862c, InterfaceC13567b1.a aVar) {
        if (m64754Z0()) {
            return;
        }
        QuickActionViewLayout quickActionViewLayout = this.f60399X;
        if (quickActionViewLayout != null && quickActionViewLayout.getVisibility() == 0 && this.f60399X.getActionItemInfo() != null && this.f60399X.getActionItemInfo().m153159l(c31862c)) {
            return;
        }
        QuickActionViewLayout quickActionViewLayout2 = this.f60399X;
        if (quickActionViewLayout2 == null || quickActionViewLayout2.getActionItemInfo() != c31862c) {
            this.f60399X = this.f60408d.m59173M(c31862c.f146309b);
        }
        QuickActionViewLayout quickActionViewLayout3 = this.f60399X;
        if (quickActionViewLayout3 == null) {
            return;
        }
        quickActionViewLayout3.m75819e(!c31862c.f146315h);
        this.f60399X.m75818b(c31862c, aVar);
    }

    /* renamed from: z0 */
    public C3538f m64835z0() {
        StickyChatThemesView stickyChatThemesView = this.f60397V;
        if (stickyChatThemesView != null) {
            return stickyChatThemesView.getThemeClick();
        }
        return null;
    }

    /* renamed from: z2 */
    public void m64836z2(C17244x0 c17244x0) {
        if (this.f60416h == null) {
            ZinstantQuickMenu zinstantQuickMenu = new ZinstantQuickMenu(this.f60402a.getContext());
            this.f60416h = zinstantQuickMenu;
            zinstantQuickMenu.setUseProgressLoading(false);
            m64647W0();
        }
        this.f60416h.m88968k1(c17244x0);
    }

    /* renamed from: z3 */
    public void m64837z3(C31862c c31862c, InterfaceC13567b1.a aVar) {
        if (!m64754Z0() && c31862c != null) {
            QuickActionViewLayout quickActionViewLayout = this.f60398W;
            if (quickActionViewLayout != null && quickActionViewLayout.getVisibility() == 0 && this.f60398W.getActionItemInfo() != null && this.f60398W.getActionItemInfo().m153159l(c31862c)) {
                return;
            }
            QuickActionViewLayout quickActionViewLayout2 = this.f60398W;
            if (quickActionViewLayout2 == null || quickActionViewLayout2.getActionItemInfo() != c31862c) {
                this.f60398W = this.f60408d.m59174N(c31862c.f146309b);
            }
            QuickActionViewLayout quickActionViewLayout3 = this.f60398W;
            if (quickActionViewLayout3 == null) {
                return;
            }
            quickActionViewLayout3.m75819e(!c31862c.f146315h);
            this.f60398W.m75818b(c31862c, aVar);
        }
    }
}
