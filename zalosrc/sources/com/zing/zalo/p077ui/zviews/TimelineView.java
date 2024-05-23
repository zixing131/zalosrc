package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.C0708i;
import ac.C0732w;
import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2264f;
import ao.InterfaceC2265g;
import as.InterfaceC2333h;
import au.AbstractC2364o0;
import bf0.C2793a;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bn.C2913t1;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import bo.EnumC2963d3;
import bo.InterfaceC2946a1;
import bo.InterfaceC3058y;
import bp0.AbstractC3102n;
import cd0.C3426e;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.FeedItemGroupHorizontal;
import com.zing.zalo.feed.components.FeedItemMusicModuleView;
import com.zing.zalo.feed.components.FeedItemSuggestBanner;
import com.zing.zalo.feed.components.FeedItemSuggestFriends;
import com.zing.zalo.feed.components.FeedItemSuggestMultiItems;
import com.zing.zalo.feed.components.FeedItemSuggestOA;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.components.FeedItemZInstantAds;
import com.zing.zalo.feed.components.FeedItemZaloVideoContainerView;
import com.zing.zalo.feed.components.InterfaceC8343n5;
import com.zing.zalo.feed.components.InterfaceC8403u6;
import com.zing.zalo.feed.components.InterfaceC8438y1;
import com.zing.zalo.feed.formpostfeed.data.PromotePostItem;
import com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView;
import com.zing.zalo.feed.mvp.feed.view.component.BottomSheetOnboardingMoveTab;
import com.zing.zalo.feed.mvp.feed.view.component.TabsControlLayout;
import com.zing.zalo.feed.mvp.music.controller.InterruptMusicController;
import com.zing.zalo.feed.mvp.music.transfer.MusicDetailResult;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.imageviewer.FeedImageViewer;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.TimelineView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.story.component.StoryBarBtnAdd;
import com.zing.zalo.story.component.StoryHighlightView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.Snackbar;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zdesign.component.tab.TabItemView;
import com.zing.zalo.zdesign.component.tab.ZdsTabBar;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import db0.AbstractC17865a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import gg0.AbstractC19444a;
import hf0.C20040b;
import hf0.C20043e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractAnimationAnimationListenerC20277g;
import i40.C20275e;
import io.C20637a;
import is.AbstractC20826v0;
import is.C20785b;
import is.C20803k;
import is.C20832y0;
import is.C20834z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import l30.AbstractC22055v0;
import l30.C22021e0;
import l30.C22033k0;
import l30.C22052u;
import me0.AbstractC23034c6;
import me0.AbstractC23047d8;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.AbstractC23222t7;
import me0.C23019b2;
import me0.C23030c2;
import me0.C23055e5;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import nk0.C23855s0;
import np.InterfaceC23922a;
import np.InterfaceC23923b;
import o70.C24099q0;
import o70.InterfaceC24103s0;
import org.json.JSONObject;
import p022ap.C2273d;
import p022ap.C2275f;
import p039bp.C3073g;
import p082cp.AbstractC17542o;
import p082cp.C17537j;
import p082cp.C17541n;
import p082cp.C17543p;
import p082cp.C17544q;
import p082cp.C17545r;
import p082cp.InterfaceC17539l;
import p082cp.InterfaceC17540m;
import p082cp.InterfaceC17546s;
import p082cp.InterfaceC17547t;
import p142ey.C18644n;
import p167fs.C19140e;
import p205hc.C19964c;
import p205hc.C19965d;
import p215hp.C20111a;
import p302ko.C21785g;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p398oo.C24355e0;
import p399op.C24390b;
import p455qo.C25430q0;
import p458qr.C25485r;
import p489rn.AbstractC25848a2;
import p489rn.AbstractC25881j;
import p490rp.AbstractC25950a;
import p494rv.C25979a;
import p509sp.C26356e;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p554up.AbstractC27354b;
import p554up.C27353a;
import p559uv.C27373c;
import p604wb.C28905e;
import p616wo.C29116a;
import p645xh.C29630g;
import p651xn.C30169a;
import p688yo.EnumC31036b;
import p716zh.C31874cb;
import p716zh.C31877d;
import p716zh.C31965ic;
import p716zh.C31980jc;
import p716zh.C31987k4;
import p716zh.C32002l4;
import p716zh.C32123ta;
import p716zh.C32145v4;
import pi0.C24773h;
import pm0.C24848g0;
import pm0.C24860q;
import qi0.C25292a;
import qi0.C25297f;
import qi0.EnumC25293b;
import qi0.EnumC25294c;
import qi0.EnumC25295d;
import sa0.C26203c;
import sa0.C26209i;
import sa0.EnumC26202b;
import sn.C26333b;
import tn.C26747f0;
import tn.C26761p;
import tr.C26878b;
import tr.C26883g;
import tv.AbstractC26897a;
import ui0.C27280g;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.AbstractC28045d8;
import vg.AbstractC28207v1;
import vg.C28100j3;
import vg.C28203u6;
import vg.C28212v6;

/* loaded from: classes6.dex */
public class TimelineView extends FeedCallbackZaloView implements C23744a.c, MainTabView.InterfaceC12111i, InterfaceC0733x, InterfaceC24103s0, AbstractC25881j.b, InterfaceC23923b {

    /* renamed from: f2 */
    static final String f78359f2 = "TimelineView";

    /* renamed from: E1 */
    private int f78364E1;

    /* renamed from: I1 */
    FeedActionZUtils.InterfaceC8913k f78368I1;

    /* renamed from: J1 */
    MenuListPopupView f78369J1;

    /* renamed from: N1 */
    InterfaceC0765j f78373N1;

    /* renamed from: O1 */
    InterfaceC20094a f78374O1;

    /* renamed from: S0 */
    File f78379S0;

    /* renamed from: S1 */
    KeyEventCallbackC17462c f78380S1;

    /* renamed from: U1 */
    String f78384U1;

    /* renamed from: V1 */
    C31874cb f78386V1;

    /* renamed from: Y0 */
    AbstractC25848a2 f78391Y0;

    /* renamed from: a1 */
    View f78395a1;

    /* renamed from: b1 */
    RecyclerView f78397b1;

    /* renamed from: c1 */
    LinearLayoutManager f78399c1;

    /* renamed from: d1 */
    SwipeRefreshListView f78401d1;

    /* renamed from: d2 */
    private C15186b0 f78402d2;

    /* renamed from: e1 */
    View f78403e1;

    /* renamed from: e2 */
    private C15186b0 f78404e2;

    /* renamed from: f1 */
    RobotoTextView f78405f1;

    /* renamed from: g1 */
    Animation f78406g1;

    /* renamed from: h1 */
    MultiStateView f78407h1;

    /* renamed from: i1 */
    ZdsTabBar f78408i1;

    /* renamed from: j1 */
    TabsControlLayout f78409j1;

    /* renamed from: l1 */
    C23528a f78411l1;

    /* renamed from: m1 */
    C15190d0 f78412m1;

    /* renamed from: n1 */
    Animation f78413n1;

    /* renamed from: o1 */
    Animation f78414o1;

    /* renamed from: p1 */
    Animation f78415p1;

    /* renamed from: t1 */
    float f78419t1;

    /* renamed from: v1 */
    C3073g f78421v1;

    /* renamed from: w1 */
    C27353a f78422w1;

    /* renamed from: x1 */
    C20111a f78423x1;

    /* renamed from: z1 */
    ShowcaseView f78425z1;

    /* renamed from: R0 */
    boolean f78377R0 = false;

    /* renamed from: T0 */
    boolean f78381T0 = false;

    /* renamed from: U0 */
    String f78383U0 = "";

    /* renamed from: V0 */
    C24773h f78385V0 = new C24773h();

    /* renamed from: W0 */
    C24773h f78387W0 = new C24773h();

    /* renamed from: X0 */
    boolean f78389X0 = true;

    /* renamed from: Z0 */
    RecyclerView.AbstractC1882i f78393Z0 = new C15197k();

    /* renamed from: k1 */
    int f78410k1 = 0;

    /* renamed from: q1 */
    int f78416q1 = 0;

    /* renamed from: r1 */
    boolean f78417r1 = true;

    /* renamed from: s1 */
    private boolean f78418s1 = true;

    /* renamed from: u1 */
    boolean f78420u1 = false;

    /* renamed from: y1 */
    private final RecyclerView.AbstractC1892s f78424y1 = new C15206t();

    /* renamed from: A1 */
    C13306b.c f78360A1 = new C15207u();

    /* renamed from: B1 */
    TooltipView f78361B1 = null;

    /* renamed from: C1 */
    boolean f78362C1 = false;

    /* renamed from: D1 */
    private boolean f78363D1 = false;

    /* renamed from: F1 */
    final Runnable f78365F1 = new RunnableC15189d();

    /* renamed from: G1 */
    final Runnable f78366G1 = new RunnableC15191e();

    /* renamed from: H1 */
    private boolean f78367H1 = false;

    /* renamed from: K1 */
    private Map f78370K1 = Collections.synchronizedMap(new HashMap());

    /* renamed from: L1 */
    final Animation.AnimationListener f78371L1 = new C15194h();

    /* renamed from: M1 */
    final Animation.AnimationListener f78372M1 = new C15195i();

    /* renamed from: P1 */
    private final Handler f78375P1 = new Handler(C2793a.f11144a.m13457b());

    /* renamed from: Q1 */
    private final Handler f78376Q1 = new HandlerC15199m(Looper.getMainLooper());

    /* renamed from: R1 */
    Bundle f78378R1 = null;

    /* renamed from: T1 */
    boolean f78382T1 = false;

    /* renamed from: W1 */
    int f78388W1 = -1;

    /* renamed from: X1 */
    boolean f78390X1 = false;

    /* renamed from: Y1 */
    InterfaceC20094a f78392Y1 = new C15201o();

    /* renamed from: Z1 */
    boolean f78394Z1 = false;

    /* renamed from: a2 */
    InterfaceC0765j f78396a2 = new C0766k();

    /* renamed from: b2 */
    InterfaceC20094a f78398b2 = new C15203q();

    /* renamed from: c2 */
    String f78400c2 = "";

    /* loaded from: classes6.dex */
    public static class TimelineDialogView extends DialogView {

        /* renamed from: H0 */
        TimelineView f78426H0;

        public TimelineDialogView(TimelineView timelineView) {
            this.f78426H0 = timelineView;
        }

        /* renamed from: XK */
        public static TimelineDialogView m85421XK(int i11, TimelineView timelineView) {
            TimelineDialogView timelineDialogView = new TimelineDialogView(timelineView);
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            timelineDialogView.mo60305zK(bundle);
            return timelineDialogView;
        }

        /* renamed from: YK */
        public static /* synthetic */ void m85422YK(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            try {
                if (this.f78426H0 == null || bundle != null) {
                    dismiss();
                    return super.mo13885LK(bundle);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            int i11 = m92642L3().getInt("id");
            m92651WI();
            if (i11 != 1011) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ou0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    TimelineView.TimelineDialogView.m85422YK(interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
        /* renamed from: xJ */
        public void mo37135xJ(Bundle bundle) {
            try {
                super.mo37135xJ(bundle);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        public TimelineDialogView() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$a */
    /* loaded from: classes6.dex */
    class C15183a implements InterfaceC2264f {
        C15183a() {
        }

        @Override // ao.InterfaceC2264f
        /* renamed from: b */
        public void mo11982b() {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15172g4();
            }
        }

        @Override // ao.InterfaceC2264f
        /* renamed from: c */
        public void mo11983c(String str, int i11, C23855s0 c23855s0) {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15155W3(str, i11, c23855s0);
            }
        }

        @Override // ao.InterfaceC2264f
        /* renamed from: d */
        public void mo11984d(String str, String str2) {
            InterfaceC27218a m92676n2 = TimelineView.this.m92676n2();
            if (m92676n2 != null) {
                AbstractC28207v1.m141994i3(str, 0, m92676n2, null, str2, null);
            }
        }

        @Override // ao.InterfaceC2264f
        /* renamed from: e */
        public void mo11985e(String str) {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15153V3(str);
            }
        }

        @Override // ao.InterfaceC2264f
        /* renamed from: f */
        public void mo11986f() {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15163a4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$a0 */
    /* loaded from: classes6.dex */
    class C15184a0 implements InterfaceC23922a {
        C15184a0() {
        }

        @Override // np.InterfaceC23922a
        /* renamed from: a */
        public void mo85423a() {
            TimelineView.this.f78422w1.m139981S();
        }

        @Override // np.InterfaceC23922a
        /* renamed from: b */
        public void mo85424b(String str, String str2) {
            TimelineView.this.m85356vO(str, str2);
        }

        @Override // np.InterfaceC23922a
        /* renamed from: c */
        public void mo85425c(String str, String str2) {
            TimelineView.this.m85361wO(str, str2);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$b */
    /* loaded from: classes6.dex */
    class C15185b implements InterfaceC2265g {
        C15185b() {
        }

        @Override // ao.InterfaceC2265g
        /* renamed from: a */
        public void mo11987a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    AbstractC28207v1.m141875H0(new JSONObject(str), TimelineView.this.m92692wK(), null, null, null, 0, new C15658gd());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // ao.InterfaceC2265g
        /* renamed from: b */
        public void mo11988b(String str) {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15164a5(str);
            }
        }

        @Override // ao.InterfaceC2265g
        /* renamed from: c */
        public void mo11989c(String str) {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15184r3(str);
            }
        }

        @Override // ao.InterfaceC2265g
        /* renamed from: d */
        public void mo11990d(String str) {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15150U3(str);
            }
        }

        @Override // ao.InterfaceC2265g
        /* renamed from: e */
        public void mo11991e(int i11, String str) {
            C3073g c3073g = TimelineView.this.f78421v1;
            if (c3073g != null) {
                c3073g.m15142K3(i11, str);
            }
        }

        @Override // ao.InterfaceC2265g
        /* renamed from: f */
        public void mo11992f(C3000l0 c3000l0, C3020p0 c3020p0) {
            TimelineView.this.mo11942Ys(c3000l0, c3020p0.f12057p, false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$b0 */
    /* loaded from: classes6.dex */
    public static class C15186b0 extends ContentObserver {

        /* renamed from: a */
        int f78430a;

        C15186b0(Handler handler, int i11) {
            super(handler);
            this.f78430a = i11;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            super.onChange(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$c */
    /* loaded from: classes6.dex */
    class C15187c extends RecyclerView.AbstractC1892s {
        C15187c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    TimelineView.this.f78391Y0.m133539Y(false);
                    TimelineView.this.m85187HQ(0L);
                    TimelineView.this.f78376Q1.sendMessage(TimelineView.this.f78376Q1.obtainMessage(1, -1, 0, "tip.any"));
                    TimelineView.this.m85370yQ();
                } else {
                    TimelineView.this.f78391Y0.m133539Y(true);
                }
                C15190d0 c15190d0 = TimelineView.this.f78412m1;
                if (c15190d0 != null) {
                    c15190d0.m94390e(recyclerView, i11);
                }
                if (i11 != 0) {
                    TimelineView.this.f78401d1.m88202K();
                }
                if (TimelineView.this.m92672lJ()) {
                    TimelineView.this.f78391Y0.m133390A1(recyclerView, i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            C20040b.b bVar;
            super.mo10176d(recyclerView, i11, i12);
            try {
                if (TimelineView.this.f78401d1.m35364k() && TimelineView.this.f78403e1.getVisibility() == 0) {
                    TimelineView.this.f78403e1.setVisibility(8);
                }
                int m9740Y1 = TimelineView.this.f78399c1.m9740Y1();
                int m9737T1 = TimelineView.this.f78399c1.m9737T1();
                int m10110a = TimelineView.this.f78399c1.m10110a();
                int m10127i = TimelineView.this.f78399c1.m10127i();
                TimelineView timelineView = TimelineView.this;
                if (timelineView.f78389X0) {
                    if (m9740Y1 >= 2) {
                        timelineView.f78409j1.m45685b(timelineView.f78408i1, -i12);
                    } else if (m9737T1 == 0) {
                        timelineView.f78409j1.m45684a();
                    }
                }
                TimelineView.this.f78421v1.m15196x4(m9740Y1, m10110a, m10127i, i12);
                if (i12 == 0 && recyclerView.getScrollState() == 0) {
                    TimelineView.this.m85370yQ();
                }
                TimelineView.this.mo11966po();
                TimelineView.this.m85393YN();
                if (TimelineView.this.m92672lJ()) {
                    AbstractC25848a2 abstractC25848a2 = TimelineView.this.f78391Y0;
                    if (i12 >= 0) {
                        bVar = C20040b.b.f98514q;
                    } else {
                        bVar = C20040b.b.f98513p;
                    }
                    abstractC25848a2.m133422z1(recyclerView, m9740Y1, m10110a, bVar);
                }
                if (i12 != 0) {
                    TimelineView.this.removeDialog(1200);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$c0 */
    /* loaded from: classes6.dex */
    public static class C15188c0 extends C1923p {

        /* renamed from: q */
        int f78432q;

        public C15188c0(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: B */
        protected int mo10618B() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: u */
        public int mo10622u(View view, int i11) {
            return super.mo10622u(view, i11) + this.f78432q;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            return 20.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$d */
    /* loaded from: classes6.dex */
    public class RunnableC15189d implements Runnable {
        RunnableC15189d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TimelineView timelineView;
            RecyclerView recyclerView;
            TimelineView timelineView2 = TimelineView.this;
            if (!timelineView2.m85185HO(timelineView2.f78364E1)) {
                TimelineView timelineView3 = TimelineView.this;
                timelineView3.m85242TQ(timelineView3.f78364E1);
                TimelineView timelineView4 = TimelineView.this;
                if (!timelineView4.m85185HO(timelineView4.f78364E1) && (recyclerView = (timelineView = TimelineView.this).f78397b1) != null) {
                    recyclerView.removeCallbacks(timelineView.f78366G1);
                    TimelineView timelineView5 = TimelineView.this;
                    timelineView5.f78397b1.postDelayed(timelineView5.f78366G1, 200L);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$d0 */
    /* loaded from: classes6.dex */
    public class C15190d0 extends AbstractC17865a {
        public C15190d0(ViewGroup viewGroup, RecyclerView recyclerView) {
        }

        @Override // db0.AbstractC17865a
        /* renamed from: d */
        protected void mo80863d(int i11, float f11) {
            try {
                TimelineView.this.mo11966po();
                TimelineView.this.m85393YN();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$e */
    /* loaded from: classes6.dex */
    public class RunnableC15191e implements Runnable {
        RunnableC15191e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TimelineView timelineView = TimelineView.this;
            if (!timelineView.m85185HO(timelineView.f78364E1)) {
                TimelineView timelineView2 = TimelineView.this;
                timelineView2.m85242TQ(timelineView2.f78364E1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$f */
    /* loaded from: classes6.dex */
    public class C15192f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f78436a;

        /* renamed from: b */
        final /* synthetic */ boolean f78437b;

        C15192f(ContactProfile contactProfile, boolean z11) {
            this.f78436a = contactProfile;
            this.f78437b = z11;
        }

        /* renamed from: g */
        public /* synthetic */ void m85430g() {
            TimelineView.this.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
        }

        /* renamed from: h */
        public /* synthetic */ void m85431h(C20096c c20096c) {
            TimelineView.this.mo49315c4();
            ToastUtils.m89259g(c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            TimelineView.this.m85239TN(new Runnable() { // from class: com.zing.zalo.ui.zviews.fu0

                /* renamed from: q */
                public final /* synthetic */ C20096c f80399q;

                public /* synthetic */ fu0(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.C15192f.this.m85431h(r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                TimelineView.this.mo49315c4();
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data")) {
                    int parseInt = Integer.parseInt(new JSONObject(jSONObject.getString("data")).getString("code"));
                    if (parseInt != 0) {
                        TimelineView.this.m85239TN(new Runnable() { // from class: com.zing.zalo.ui.zviews.gu0

                            /* renamed from: p */
                            public final /* synthetic */ int f80499p;

                            public /* synthetic */ gu0(int parseInt2) {
                                r1 = parseInt2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ToastUtils.m89259g(r1);
                            }
                        });
                        return;
                    }
                    AbstractC23047d8.m118259k(this.f78436a, this.f78437b, new SensitiveData("phonebook_delete_in_social_timeline", "phonebook_delete"));
                    TimelineView.this.m85239TN(new Runnable() { // from class: com.zing.zalo.ui.zviews.hu0
                        public /* synthetic */ hu0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            TimelineView.C15192f.this.m85430g();
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$g */
    /* loaded from: classes6.dex */
    public class C15193g implements FeedActionZUtils.InterfaceC8913k {
        C15193g() {
        }

        /* renamed from: b */
        public /* synthetic */ void m85433b(C3020p0 c3020p0) {
            TimelineView timelineView = TimelineView.this;
            timelineView.f78369J1 = FeedActionZUtils.m47538Z(timelineView.m92689tK(), c3020p0, TimelineView.this.f72421L0.m92676n2(), TimelineView.this.f78368I1);
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: o2 */
        public void mo47577o2(String str, PrivacyInfo privacyInfo) {
            new C25430q0().m101508a(new C25430q0.a(str, privacyInfo, false));
            AbstractC2364o0.m12369l(TimelineView.this.m92676n2(), TimelineView.this.f78391Y0);
            TimelineView.this.mo49315c4();
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: p2 */
        public void mo47578p2() {
            TimelineView.this.mo49315c4();
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: q2 */
        public void mo47579q2(int i11, C3020p0 c3020p0) {
            ArrayList arrayList;
            try {
                InterfaceC27218a m92676n2 = TimelineView.this.f72421L0.m92676n2();
                if (m92676n2 == null) {
                    return;
                }
                FeedActionZUtils.m47519G(TimelineView.this.f78369J1, m92676n2);
                if (i11 == 70) {
                    List list = PrivacyInfo.f45971u;
                    if (list != null && list.size() == 2) {
                        AbstractC23647d.m123906p("13441");
                    } else {
                        AbstractC23647d.m123906p("13440");
                    }
                    AbstractC23647d.m123893c();
                    m92676n2.mo35579p().m93066i2(ProfilePickerView.class, ProfilePickerView.m83055pM(new ArrayList(), 100, m92676n2.getString(AbstractC8020f0.str_privacy_select_title)), 1017, 1, true);
                    return;
                }
                if (i11 == 80) {
                    List list2 = PrivacyInfo.f45971u;
                    if (list2 != null && list2.size() == 2) {
                        AbstractC23647d.m123906p("13451");
                    } else {
                        AbstractC23647d.m123906p("13450");
                    }
                    AbstractC23647d.m123893c();
                    m92676n2.mo35579p().m93066i2(PrivacyPickGroupView.class, null, 1017, 1, true);
                    return;
                }
                if (i11 == 90) {
                    ArrayList arrayList2 = new ArrayList();
                    PrivacyInfo privacyInfo = c3020p0.f12042V;
                    if (privacyInfo != null && (arrayList = privacyInfo.f45974q) != null && privacyInfo.f45977t == i11) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            LikeContactItem likeContactItem = (LikeContactItem) it.next();
                            arrayList2.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                        }
                    }
                    Bundle m83055pM = ProfilePickerView.m83055pM(arrayList2, 100, TimelineView.this.f72421L0.m92652XI(AbstractC8020f0.str_privacy_except_friends));
                    m83055pM.putBoolean("extra_show_text_instead_icon", true);
                    m83055pM.putBoolean("extra_type_exclude_friends", true);
                    m92676n2.mo35579p().m93066i2(ProfilePickerView.class, m83055pM, 1020, 1, true);
                    return;
                }
                if (c3020p0.f12042V.f45977t != i11) {
                    FeedActionZUtils.m47553k(c3020p0.f12057p, i11, TimelineView.this.f78368I1);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: r2 */
        public void mo47580r2() {
            TimelineView.this.mo46829Y();
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: s2 */
        public void mo47581s2(int i11, C3020p0 c3020p0) {
            ZaloActivity zaloActivity;
            ArrayList arrayList;
            try {
                if (TimelineView.this.f72421L0.m92650VI() == null || (zaloActivity = (ZaloActivity) TimelineView.this.f72421L0.m92648SI()) == null) {
                    return;
                }
                FeedActionZUtils.m47519G(TimelineView.this.f78369J1, zaloActivity);
                if (i11 == 1000) {
                    arrayList = (ArrayList) c3020p0.f12042V.m45138e();
                } else {
                    arrayList = (ArrayList) PrivacyInfo.m45134q(i11).m45138e();
                }
                zaloActivity.mo35579p().m93066i2(ProfilePickerView.class, ProfilePickerView.m83055pM(arrayList, 100, zaloActivity.getString(AbstractC8020f0.str_privacy_select_title)), 1017, 1, true);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: t2 */
        public void mo47582t2(C3020p0 c3020p0) {
            TimelineView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.iu0

                /* renamed from: q */
                public final /* synthetic */ C3020p0 f80720q;

                public /* synthetic */ iu0(C3020p0 c3020p02) {
                    r2 = c3020p02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.C15193g.this.m85433b(r2);
                }
            });
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: z1 */
        public void mo47583z1(C20096c c20096c) {
            ToastUtils.showMess(c20096c.m104492d());
            TimelineView.this.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$h */
    /* loaded from: classes6.dex */
    public class C15194h extends AbstractAnimationAnimationListenerC20277g {
        C15194h() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            TimelineView.this.f78415p1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$i */
    /* loaded from: classes6.dex */
    public class C15195i extends AbstractAnimationAnimationListenerC20277g {
        C15195i() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            TimelineView.this.f78415p1 = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$j */
    /* loaded from: classes6.dex */
    public class C15196j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f78442a;

        C15196j(C3020p0 c3020p0) {
            this.f78442a = c3020p0;
        }

        /* renamed from: d */
        public /* synthetic */ void m85435d() {
            try {
                TimelineView.this.m79519gM();
                TimelineView.this.mo49315c4();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                TimelineView.this.mo49315c4();
                if (c20096c != null && !TextUtils.isEmpty(c20096c.m104492d())) {
                    TimelineView.this.m85399dR(c20096c.m104492d());
                } else {
                    TimelineView timelineView = TimelineView.this;
                    timelineView.m85399dR(timelineView.f72421L0.m92652XI(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject.optInt("flag") == 1) {
                    String optString = optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                    if (!TextUtils.isEmpty(optString)) {
                        ZaloWebView.m87103hS(TimelineView.this.m92676n2(), optString);
                    }
                }
                if (C26883g.m138517f(0).m138524b(this.f78442a.f12057p) || C26883g.m138517f(1).m138524b(this.f78442a.f12057p)) {
                    C20834z0.f102412a.m108927f(true);
                }
                TimelineView.this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ju0
                    public /* synthetic */ ju0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.C15196j.this.m85435d();
                    }
                }, 500L);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$k */
    /* loaded from: classes6.dex */
    public class C15197k extends RecyclerView.AbstractC1882i {
        C15197k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            super.mo10026a();
            TimelineView.this.f78376Q1.removeMessages(5);
            TimelineView.this.f78376Q1.sendEmptyMessageDelayed(5, 200L);
            TimelineView.this.f78376Q1.removeMessages(6);
            TimelineView.this.f78376Q1.sendEmptyMessageDelayed(6, 200L);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$l */
    /* loaded from: classes6.dex */
    public class C15198l implements InterfaceC20094a {
        C15198l() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                TimelineView.this.m85399dR(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                TimelineView.this.mo49315c4();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                TimelineView.this.m85399dR(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_success));
                TimelineView.this.mo49315c4();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$m */
    /* loaded from: classes6.dex */
    public class HandlerC15199m extends Handler {
        HandlerC15199m(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC25848a2 abstractC25848a2;
            AbstractC25848a2 abstractC25848a22;
            try {
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 != 5) {
                        if (i11 == 6) {
                            TimelineView timelineView = TimelineView.this;
                            if (timelineView.f78381T0 && timelineView.m85190IO() && (abstractC25848a22 = TimelineView.this.f78391Y0) != null && abstractC25848a22.m133397G0() != null) {
                                TimelineView timelineView2 = TimelineView.this;
                                if (timelineView2.f78397b1 != null) {
                                    timelineView2.f78391Y0.m133397G0().m104096y(TimelineView.this.f78397b1);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    try {
                        TimelineView timelineView3 = TimelineView.this;
                        if (timelineView3.f78381T0 && timelineView3.m85190IO() && (abstractC25848a2 = TimelineView.this.f78391Y0) != null && abstractC25848a2.m133397G0() != null) {
                            TimelineView timelineView4 = TimelineView.this;
                            if (timelineView4.f78397b1 != null) {
                                timelineView4.f78391Y0.m133397G0().m104096y(TimelineView.this.f78397b1);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        return;
                    }
                }
                String str = (String) message.obj;
                ShowcaseView showcaseView = TimelineView.this.f78425z1;
                if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(str, TimelineView.this.f78425z1.getShowcaseId())) {
                    TimelineView.this.f78425z1.m74626d();
                    TimelineView.this.f78425z1 = null;
                }
                TimelineView.this.m85391XN(str, message.arg1);
                TimelineView.this.m85389WN(str);
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$n */
    /* loaded from: classes6.dex */
    public class C15200n implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f78447a;

        /* renamed from: b */
        final /* synthetic */ int f78448b;

        /* renamed from: c */
        final /* synthetic */ ContactProfile f78449c;

        /* renamed from: com.zing.zalo.ui.zviews.TimelineView$n$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f78451a;

            a(ContactProfile contactProfile) {
                this.f78451a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f78451a);
            }
        }

        C15200n(C3020p0 c3020p0, int i11, ContactProfile contactProfile) {
            this.f78447a = c3020p0;
            this.f78448b = i11;
            this.f78449c = contactProfile;
        }

        /* renamed from: d */
        public /* synthetic */ void m85437d(C3020p0 c3020p0, ContactProfile contactProfile) {
            try {
                TimelineView.this.mo49315c4();
                if (c3020p0 != null) {
                    TimelineView.this.f78391Y0.m10008p();
                    if (contactProfile != null) {
                        TimelineView.this.m79523lM(contactProfile);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ToastUtils.m89264l(c20096c);
                TimelineView timelineView = TimelineView.this;
                timelineView.f78382T1 = false;
                timelineView.mo49315c4();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            String str;
            String str2;
            int i11;
            C3047v0 c3047v0;
            JSONObject optJSONObject;
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("error_code") && jSONObject.has("data") && Integer.parseInt(jSONObject.getString("error_code")) == 0) {
                    if (!jSONObject.has("data") || jSONObject.isNull("data") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                        str = "";
                        str2 = str;
                        i11 = 0;
                    } else {
                        i11 = optJSONObject.optInt("action", 0);
                        str2 = optJSONObject.optString("alias");
                        str = optJSONObject.optString("desc");
                    }
                    C3020p0 c3020p0 = this.f78447a;
                    if (c3020p0 != null && (c3047v0 = c3020p0.f12022B) != null && c3047v0.f12289k != null) {
                        contactProfile = new ContactProfile();
                        C3047v0 c3047v02 = this.f78447a.f12022B;
                        contactProfile.f42434r = c3047v02.f12280b;
                        contactProfile.f42446v = c3047v02.f12283e;
                        contactProfile.f42437s = c3047v02.f12282d;
                        int i12 = c3047v02.f12279a;
                        contactProfile.f42447v0 = i12;
                        contactProfile.f42352K0 = i12;
                        contactProfile.f42453x0 = c3047v02.f12289k.intValue();
                    } else {
                        contactProfile = C28203u6.f131407a.m141809c(String.valueOf(this.f78448b));
                        if (contactProfile == null) {
                            contactProfile = this.f78449c;
                        }
                    }
                    if (contactProfile == null) {
                        return;
                    }
                    contactProfile.f42447v0 = contactProfile.f42352K0;
                    contactProfile.f42456y0 = i11;
                    if (!TextUtils.isEmpty(str2)) {
                        contactProfile.f42442t1 = str2;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        contactProfile.f42436r1 = new SpannableStringBuilder(str);
                    }
                    Map map = AbstractC23304d.f113405l;
                    if (map.containsKey(contactProfile.f42434r)) {
                        contactProfile.f42438s0 = ((C31965ic) map.get(contactProfile.f42434r)).m153681a();
                    }
                    contactProfile.f42441t0 = true;
                    if (C21927m.m114302u().m114357s() != null) {
                        if (!C21927m.m114302u().m114357s().m153137g(contactProfile.f42434r)) {
                            C21927m.m114302u().m114357s().add(contactProfile);
                            C0824j.m2153b(new a(contactProfile));
                        } else if (C21927m.m114302u().m114357s().m153138j(contactProfile.f42434r) != null) {
                            contactProfile = C21927m.m114302u().m114357s().m153138j(contactProfile.f42434r);
                            contactProfile.f42456y0 = i11;
                            if (!TextUtils.isEmpty(str2)) {
                                contactProfile.f42442t1 = str2;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                contactProfile.f42436r1 = new SpannableStringBuilder(str);
                            }
                        }
                    }
                    C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                    if (c31965ic != null) {
                        ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                    }
                    AbstractC23074g2.m118375a(0, String.valueOf(this.f78448b), "", 7);
                    if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                        AbstractC23181q.m119431d(contactProfile.f42434r, true);
                    }
                } else {
                    contactProfile = null;
                }
                TimelineView timelineView = TimelineView.this;
                timelineView.f78382T1 = false;
                timelineView.f78376Q1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ku0

                    /* renamed from: q */
                    public final /* synthetic */ C3020p0 f80942q;

                    /* renamed from: r */
                    public final /* synthetic */ ContactProfile f80943r;

                    public /* synthetic */ ku0(C3020p0 c3020p02, ContactProfile contactProfile2) {
                        r2 = c3020p02;
                        r3 = contactProfile2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.C15200n.this.m85437d(r2, r3);
                    }
                });
            } catch (Exception e11) {
                TimelineView.this.f78382T1 = false;
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$o */
    /* loaded from: classes6.dex */
    public class C15201o implements InterfaceC20094a {
        C15201o() {
        }

        /* renamed from: e */
        public /* synthetic */ void m85440e() {
            Bundle bundle = new Bundle();
            bundle.putString("uid", TimelineView.this.f78386V1.f146385a);
            bundle.putString("dpn", TimelineView.this.f78386V1.f146387c);
            bundle.putString("phone", TimelineView.this.f78386V1.f146394j);
            bundle.putString("avatar", TimelineView.this.f78386V1.f146393i);
            if (TimelineView.this.m92676n2() != null) {
                TimelineView.this.m92676n2().mo35581q(WriteInvitationView.class, bundle, 1085, 1, true);
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m85441f() {
            try {
                TimelineDialogView m85421XK = TimelineDialogView.m85421XK(1011, TimelineView.this);
                if (m85421XK != null) {
                    if (m85421XK.m92687sJ()) {
                        m85421XK.dismiss();
                    }
                    m85421XK.m92602UK(TimelineView.this.f72421L0.m92649TI(), "ask_accept_dialog");
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                TimelineView timelineView = TimelineView.this;
                timelineView.f78390X1 = false;
                timelineView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            TimelineView timelineView;
            int i11;
            int i12;
            int i13;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    boolean z11 = true;
                    if (jSONObject != null && !jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2.isNull("isRequested")) {
                            i11 = 0;
                        } else {
                            i11 = jSONObject2.getInt("isRequested");
                        }
                        if (jSONObject2.isNull("isFriend")) {
                            i12 = 0;
                        } else {
                            i12 = jSONObject2.getInt("isFriend");
                        }
                        if (jSONObject2.isNull("isRequesting")) {
                            i13 = 0;
                        } else {
                            i13 = jSONObject2.getInt("isRequesting");
                        }
                        int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                        int optInt2 = jSONObject2.optInt("ranking", 0);
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 == 0) {
                                    if (!C18644n.m98531l().m98558u(TimelineView.this.f78384U1)) {
                                        TrackingSource trackingSource = new TrackingSource(TimelineView.this.f78388W1);
                                        trackingSource.m40677a("sourceView", 3);
                                        C21927m.m114302u().m114330e0(TimelineView.this.f78386V1.f146385a, trackingSource);
                                        if (AbstractC21935u.m114553t(2)) {
                                            TimelineView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.lu0
                                                public /* synthetic */ lu0() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TimelineView.C15201o.this.m85440e();
                                                }
                                            });
                                        } else {
                                            TimelineView timelineView2 = TimelineView.this;
                                            C31874cb c31874cb = timelineView2.f78386V1;
                                            timelineView2.m85387UQ(c31874cb.f146385a, c31874cb.f146389e);
                                            z11 = false;
                                        }
                                    } else {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(TimelineView.this.f78384U1);
                                        AbstractC23074g2.m118375a(0, TimelineView.this.f78384U1, "", 7);
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(TimelineView.this.f78384U1);
                                    AbstractC23074g2.m118375a(0, TimelineView.this.f78384U1, "", 7);
                                    if (!AbstractC21935u.m114558y(TimelineView.this.f78384U1)) {
                                        TimelineView timelineView3 = TimelineView.this;
                                        timelineView3.m85414tR(timelineView3.f78384U1);
                                    }
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(TimelineView.this.f78384U1);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(TimelineView.this.f78384U1, optInt2);
                                if (TimelineView.this.m92676n2() != null) {
                                    TimelineView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.mu0
                                        public /* synthetic */ mu0() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            TimelineView.C15201o.this.m85441f();
                                        }
                                    });
                                }
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(C28203u6.f131407a.m141809c(TimelineView.this.f78384U1));
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(TimelineView.this.f78384U1);
                                AbstractC23074g2.m118375a(0, TimelineView.this.f78384U1, "", 7);
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(TimelineView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            TimelineView.this.f78383U0 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(TimelineView.this, 100);
                        }
                    }
                    timelineView = TimelineView.this;
                    timelineView.f78390X1 = false;
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    timelineView = TimelineView.this;
                    timelineView.f78390X1 = false;
                }
                timelineView.mo78960q3();
            } catch (Throwable th2) {
                TimelineView timelineView4 = TimelineView.this;
                timelineView4.f78390X1 = false;
                timelineView4.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$p */
    /* loaded from: classes6.dex */
    public class C15202p implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.TimelineView$p$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f78455a;

            a(ContactProfile contactProfile) {
                this.f78455a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f78455a.f42434r);
            }
        }

        C15202p() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(TimelineView.f78359f2, e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$q */
    /* loaded from: classes6.dex */
    public class C15203q implements InterfaceC20094a {
        C15203q() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Resources.NotFoundException e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                TimelineView timelineView = TimelineView.this;
                timelineView.f78394Z1 = false;
                timelineView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            String str = TimelineView.this.f78384U1;
                            C21933s.f107870s0 = str;
                            AbstractC23059e9.m118317F(str);
                            AbstractC23074g2.m118375a(0, TimelineView.this.f78384U1, "", 7);
                            AbstractC23063f2.m118349a(TimelineView.this.f78386V1.m153177a());
                        } else {
                            AbstractC23063f2.m118357i(i11, TimelineView.this.f78384U1);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(TimelineView.this.f72421L0, i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            TimelineView.this.f78383U0 = AbstractC23161o1.m119317b(i11);
                            AbstractC2364o0.m12373p(TimelineView.this, 100);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                TimelineView timelineView = TimelineView.this;
                timelineView.f78394Z1 = false;
                timelineView.mo78960q3();
            } catch (Throwable th2) {
                TimelineView timelineView2 = TimelineView.this;
                timelineView2.f78394Z1 = false;
                timelineView2.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$r */
    /* loaded from: classes6.dex */
    public class C15204r implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f78458a;

        C15204r(String str) {
            this.f78458a = str;
        }

        /* renamed from: d */
        public /* synthetic */ void m85443d() {
            try {
                TimelineView.this.mo49315c4();
                TimelineView.this.m79519gM();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ToastUtils.showMess(TimelineView.this.f72421L0.m92648SI().getString(AbstractC8020f0.error_message));
                TimelineView.this.mo49315c4();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C26747f0.m137582I().m137617f0(this.f78458a);
                TimelineView.this.f78376Q1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.nu0
                    public /* synthetic */ nu0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.C15204r.this.m85443d();
                    }
                });
                ToastUtils.showMess(TimelineView.this.f72421L0.m92648SI().getString(AbstractC8020f0.profile_hidefeedsuccess));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$s */
    /* loaded from: classes6.dex */
    public class C15205s extends TooltipView.AbstractC16939c {
        C15205s() {
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.AbstractC16939c
        /* renamed from: b */
        public void mo60331b() {
            TimelineView.this.f78421v1.m15138B4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$t */
    /* loaded from: classes6.dex */
    public class C15206t extends RecyclerView.AbstractC1892s {
        C15206t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                TimelineView.this.f78376Q1.sendMessageDelayed(TimelineView.this.f78376Q1.obtainMessage(1, -1, 0, "tip.timeline.footerzaloconnect"), 300L);
                recyclerView.m9821B1(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$u */
    /* loaded from: classes6.dex */
    public class C15207u extends C13306b.c {
        C15207u() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: c */
        public void mo74715c(String str, C28212v6 c28212v6, C25297f c25297f) {
            if (TextUtils.equals(str, "tip.timeline.footerzaloconnect")) {
                c25297f.m130945m0(EnumC25295d.EXTENDED);
                c25297f.m130943l0(3);
                c25297f.m130911Q(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_onboard_gotit));
                c25297f.m130920Z(true);
                c25297f.m130912R(EnumC25293b.RECTANGLE);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return (String[]) TimelineView.this.m85341sO().toArray(new String[0]);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: g */
        public Rect mo74717g(String str) {
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            View m85413tO = TimelineView.this.m85413tO(str);
            if (m85413tO != null) {
                return new C26209i(m85413tO);
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: l */
        public void mo74720l(TooltipView tooltipView, C28212v6 c28212v6, int i11, boolean z11) {
            super.mo74720l(tooltipView, c28212v6, i11, z11);
            if (c28212v6 != null && TextUtils.equals(c28212v6.f131577c, "tip.timeline.footerzaloconnect")) {
                AbstractC0924m0.m3665aj(c28212v6.f131576b);
                C13306b.m74676L("tip.timeline.footerzaloconnect");
                ArrayList<C3000l0> m133529O = TimelineView.this.f78391Y0.m133529O();
                if (m133529O != null && !m133529O.isEmpty()) {
                    for (C3000l0 c3000l0 : m133529O) {
                        if (c3000l0 != null && c3000l0.m14322a0() != null) {
                            c3000l0.m14322a0().m14532w0();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$v */
    /* loaded from: classes6.dex */
    public class C15208v extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.zviews.TimelineView$v$a */
        /* loaded from: classes6.dex */
        class a implements AbstractC22055v0.g {

            /* renamed from: a */
            final /* synthetic */ C3426e f78464a;

            a(C3426e c3426e) {
                this.f78464a = c3426e;
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: O */
            public void mo46561O() {
                try {
                    if (this.f78464a != null && TimelineView.this.m92676n2() != null && !TimelineView.this.m92676n2().isFinishing() && TimelineView.this.m92674mJ()) {
                        this.f78464a.m17203v(C22021e0.f108429m);
                    }
                    TimelineView.this.f78391Y0.m10008p();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: a */
            public void mo46562a(String str, C22033k0.g gVar) {
                if (TimelineView.this.m92672lJ()) {
                    TimelineView.this.m85399dR(str);
                }
                mo46561O();
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.TimelineView$v$b */
        /* loaded from: classes6.dex */
        class b implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.i f78466a;

            /* renamed from: b */
            final /* synthetic */ C32123ta f78467b;

            b(AbstractC22055v0.i iVar, C32123ta c32123ta) {
                this.f78466a = iVar;
                this.f78467b = c32123ta;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    this.f78466a.mo17225n(this.f78467b, TimelineView.this.f78411l1);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (TimelineView.this.m92672lJ() && TimelineView.this.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                if (MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125977u() && TimelineView.this.m92672lJ() && TimelineView.this.m92687sJ() && hVar != null) {
                    bundle.putInt("srcType", 335);
                    AbstractC22055v0.m115127Q(hVar, this.f78466a, TimelineView.this.m92676n2(), bundle, 1010);
                }
            }
        }

        C15208v() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: a */
        public void mo48298a(AbstractC22055v0.j jVar) {
            if (jVar != null && jVar.getPopulatePosition() == 0) {
                AbstractC23647d.m123906p("4915000");
                AbstractC23647d.m123893c();
            }
            TimelineView timelineView = TimelineView.this;
            AbstractC22055v0.m115134X(timelineView.f72421L0, timelineView.m85409pO(), null, new TrackingSource(1));
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: b */
        public void mo82050b(C32123ta c32123ta, C22033k0.h hVar, AbstractC22055v0.i iVar) {
            try {
                C22033k0.m115006h().m115017q(1, hVar, new b(iVar, c32123ta));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            String str;
            String str2;
            try {
                C3426e m85408oO = TimelineView.this.m85408oO();
                if (m85408oO != null) {
                    m85408oO.m17190o(m85408oO.m17200s(c31980jc));
                }
                boolean equals = c31980jc.f147023p.equals(CoreUtility.f89233i);
                if (c31980jc.f147026s) {
                    if (equals) {
                        str2 = "4915003";
                    } else {
                        str2 = "49150041";
                    }
                    AbstractC23647d.m123906p(str2);
                } else {
                    if (equals) {
                        str = "4915002";
                    } else {
                        str = "49150042";
                    }
                    AbstractC23647d.m123906p(str);
                }
                AbstractC23647d.m123893c();
                c31980jc.m153811A(true);
                AbstractC22055v0.m115123M(c31980jc, TimelineView.this, 1010, i11, m85408oO, new a(m85408oO));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$w */
    /* loaded from: classes6.dex */
    class C15209w extends AbstractC7220t8 {
        C15209w() {
        }

        @Override // com.zing.zalo.adapters.AbstractC7220t8
        /* renamed from: a */
        public void mo36733a(boolean z11) {
            TimelineView.this.f78421v1.m15145M4(z11);
        }

        @Override // com.zing.zalo.adapters.AbstractC7220t8
        /* renamed from: b */
        public void mo36734b() {
            C3426e m85408oO;
            TimelineView timelineView = TimelineView.this;
            if (timelineView.f78417r1 && (m85408oO = timelineView.m85408oO()) != null) {
                m85408oO.m17202u(10002);
                TimelineView.this.f78421v1.m15145M4(false);
            }
        }

        @Override // com.zing.zalo.adapters.AbstractC7220t8
        /* renamed from: c */
        public void mo36735c(MediaItem mediaItem) {
            InterfaceC27218a m92676n2 = TimelineView.this.m92676n2();
            if (m92676n2 != null && mediaItem != null) {
                AbstractC22055v0.m115149i(m92676n2, mediaItem);
            }
        }

        @Override // com.zing.zalo.adapters.AbstractC7220t8
        /* renamed from: d */
        public void mo36736d() {
            TimelineView.this.m85391XN("tip.timeline.createstory", -1);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$x */
    /* loaded from: classes6.dex */
    class C15210x extends AbstractC25848a2 {
        C15210x(Context context, AbstractC22055v0.l lVar, AbstractC7220t8 abstractC7220t8) {
            super(context, lVar, abstractC7220t8);
        }

        @Override // p489rn.AbstractC25848a2
        /* renamed from: p1 */
        protected void mo85444p1(C3000l0 c3000l0) {
            AbstractC27354b.m140049a(TimelineView.this.f78422w1, c3000l0);
        }

        @Override // p489rn.AbstractC25848a2
        /* renamed from: s1 */
        protected void mo85445s1(C3000l0 c3000l0) {
            TimelineView.this.f78423x1.m104576R(c3000l0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$y */
    /* loaded from: classes6.dex */
    class C15211y implements InterfaceC8438y1 {
        C15211y() {
        }

        @Override // com.zing.zalo.feed.components.InterfaceC8438y1
        /* renamed from: a */
        public AbstractC1785o mo44963a() {
            return TimelineView.this.getLifecycle();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineView$z */
    /* loaded from: classes6.dex */
    class C15212z implements InterfaceC8343n5 {
        C15212z() {
        }

        @Override // com.zing.zalo.feed.components.InterfaceC8343n5
        /* renamed from: a */
        public boolean mo44786a() {
            return TimelineView.this.f78420u1;
        }
    }

    /* renamed from: AO */
    private void m85157AO() {
        if (this.f78362C1) {
            return;
        }
        this.f78376Q1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.gt0
            public /* synthetic */ gt0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85235SO();
            }
        }, 400L);
    }

    /* renamed from: AP */
    public /* synthetic */ void m85158AP(EnumC31036b enumC31036b) {
        if (this.f78389X0) {
            this.f78408i1.m91301J(m85310lO(enumC31036b), false);
        }
    }

    /* renamed from: BP */
    public /* synthetic */ void m85161BP(EnumC31036b enumC31036b) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.bt0

            /* renamed from: q */
            public final /* synthetic */ EnumC31036b f79958q;

            public /* synthetic */ bt0(EnumC31036b enumC31036b2) {
                r2 = enumC31036b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85158AP(r2);
            }
        });
    }

    /* renamed from: CO */
    private void m85164CO(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15204r(str));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        c0766k.mo1649h4(arrayList, 0);
    }

    /* renamed from: CP */
    public /* synthetic */ void m85165CP(C19964c c19964c) {
        C20111a.a aVar = (C20111a.a) c19964c.m103749a();
        if (aVar instanceof C20111a.c) {
            String m104577a = ((C20111a.c) aVar).m104577a();
            AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
            if (abstractC25848a2 != null) {
                abstractC25848a2.m133409N1(m104577a);
                this.f78376Q1.removeMessages(5);
                this.f78376Q1.sendEmptyMessageDelayed(5, 300L);
            }
        }
    }

    /* renamed from: DP */
    public /* synthetic */ void m85168DP(C19964c c19964c) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.xs0

            /* renamed from: q */
            public final /* synthetic */ C19964c f82663q;

            public /* synthetic */ xs0(C19964c c19964c2) {
                r2 = c19964c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85165CP(r2);
            }
        });
    }

    /* renamed from: DQ */
    private void m85169DQ() {
        if (this.f72421L0.m92676n2() == null) {
            return;
        }
        this.f72421L0.m92676n2().mo35579p().m93066i2(BottomSheetOnboardingMoveTab.class, new Bundle(), 1018, 1, true);
    }

    /* renamed from: EP */
    public /* synthetic */ void m85172EP() {
        this.f78421v1.m15193w4();
    }

    /* renamed from: EQ */
    private void m85173EQ() {
        C17487o0 c17487o0;
        try {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                c17487o0.m93069k2(ListContactNativeView.class, null, 1, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: FP */
    public /* synthetic */ void m85176FP(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        C31874cb c31874cb = this.f78386V1;
        if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
            ContactProfile contactProfile = new ContactProfile(this.f78386V1.f146385a);
            C31874cb c31874cb2 = this.f78386V1;
            contactProfile.f42446v = c31874cb2.f146393i;
            contactProfile.f42455y = c31874cb2.f146394j;
            contactProfile.f42437s = c31874cb2.f146387c;
            contactProfile.f42437s = contactProfile.m40383Q(true, false);
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            if (m92676n2() != null) {
                m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
            }
        }
    }

    /* renamed from: FQ */
    private void m85177FQ() {
        this.f72421L0.m92676n2().mo35579p().m93066i2(MoveTabUserManageView.class, new Bundle(), 1017, 1, true);
    }

    /* renamed from: GO */
    private void m85180GO() {
        if (this.f78421v1 == null) {
            this.f78421v1 = (C3073g) new C1802w0(this, new C3073g.j(this, null)).m9378a(C3073g.class);
        }
        InterfaceC27218a m92676n2 = m92676n2();
        if ((m92676n2 instanceof ZaloActivity) && this.f78422w1 == null) {
            this.f78422w1 = (C27353a) new C1802w0((ZaloActivity) m92676n2, new C27353a.e(this, null)).m9378a(C27353a.class);
        }
        if (this.f78423x1 == null) {
            this.f78423x1 = (C20111a) new C1802w0(this, new C20111a.b(this, null)).m9378a(C20111a.class);
        }
    }

    /* renamed from: GP */
    public /* synthetic */ C24848g0 m85181GP() {
        this.f78421v1.m15171f4();
        return C24848g0.f119245a;
    }

    /* renamed from: GQ */
    private void m85182GQ(String str, String str2) {
        if (this.f72421L0.m92676n2() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 10);
        bundle.putString("extra_song_id", str2);
        bundle.putString("extra_feed_id", str);
        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", str);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1016, 1, true);
    }

    /* renamed from: HO */
    public boolean m85185HO(int i11) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.f78397b1;
        if (recyclerView != null && recyclerView.getHeight() != 0 && (linearLayoutManager = this.f78399c1) != null && linearLayoutManager.m9737T1() == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: HP */
    public static /* synthetic */ void m85186HP(String str, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            if (!TextUtils.isEmpty(str)) {
                AbstractC20826v0.m108803d(str);
                C26761p.m137741q().m137764l(str);
                C23744a.m124114c().m124116d(5100, new Bundle());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: HQ */
    public void m85187HQ(long j11) {
        this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.nt0
            public /* synthetic */ nt0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85191IP();
            }
        }, j11);
    }

    /* renamed from: IO */
    public boolean m85190IO() {
        if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125977u()) {
            return true;
        }
        return false;
    }

    /* renamed from: IP */
    public /* synthetic */ void m85191IP() {
        try {
            AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
            if (abstractC25848a2 != null) {
                abstractC25848a2.m10008p();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: IQ */
    private void m85192IQ() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xr0
            public /* synthetic */ xr0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85200KP();
            }
        });
    }

    /* renamed from: JO */
    public /* synthetic */ void m85195JO(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f78425z1) {
            this.f78425z1 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: JP */
    public static /* synthetic */ Void m85196JP() {
        return null;
    }

    /* renamed from: KO */
    public /* synthetic */ void m85199KO() {
        C3426e m85408oO = m85408oO();
        if (m85408oO != null) {
            m85408oO.m17205x();
            m85408oO.m17189n(0);
        }
    }

    /* renamed from: KP */
    public /* synthetic */ void m85200KP() {
        try {
            AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
            if (abstractC25848a2 != null) {
                abstractC25848a2.m133414o1();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: LO */
    public /* synthetic */ void m85203LO(boolean z11, C3020p0 c3020p0, boolean z12, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            if (C23055e5.m118272g(true)) {
                if (z11) {
                    this.f78421v1.m15157Y1(c3020p0);
                } else if (z12) {
                    this.f78421v1.m15192w3(c3020p0);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: LP */
    public /* synthetic */ void m85204LP() {
        try {
            if (!C23055e5.m118271f()) {
                this.f78401d1.setRefreshing(false);
                this.f78401d1.m88209V();
            } else {
                this.f78401d1.m88202K();
                if (m85403kO() != null) {
                    m85403kO().m67687YL();
                }
                C26747f0.m137582I().m137677p0(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: MO */
    public /* synthetic */ void m85207MO(boolean z11, C3020p0 c3020p0, C3000l0 c3000l0, InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        try {
            if (z11) {
                if (c3020p0.m14494Y() && AbstractC23309i.m122305q2()) {
                    C26878b.m138449b().m138453e(c3000l0, c3020p0);
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    C17487o0 c17487o02 = c17487o0;
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_FEED_ID", c3020p0.f12057p);
                    bundle.putString("EXTRA_FEED_CONTENT_JSON", AbstractC20826v0.m108827p(c3000l0).toString());
                    bundle.putString("EXTRA_ENTRY_POINT_CHAIN", C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_HAVE_SUBTITLE_STREAM).m154277l());
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(EditFeedView.class, bundle, 0, 1, true);
                    }
                    AbstractC23647d.m123897g("4446");
                    return;
                }
                return;
            }
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: MP */
    public /* synthetic */ void m85208MP() {
        this.f78421v1.m15191v4();
    }

    /* renamed from: MQ */
    private void m85209MQ(ContactProfile contactProfile, boolean z11) {
        mo46829Y();
        C21785g.m112430F0().mo112349B0(contactProfile.f42434r, 31, new C15192f(contactProfile, z11));
    }

    /* renamed from: NP */
    public /* synthetic */ void m85213NP(InterfaceC17463d interfaceC17463d) {
        if (this.f78380S1 == interfaceC17463d) {
            this.f78380S1 = null;
        }
    }

    /* renamed from: OP */
    public /* synthetic */ void m85217OP(C3020p0 c3020p0, boolean z11, TrackingSource trackingSource, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            this.f78421v1.m15141J1(c3020p0, z11, trackingSource);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: OQ */
    private void m85218OQ(Parcelable parcelable) {
        LinearLayoutManager linearLayoutManager = this.f78399c1;
        if (linearLayoutManager != null) {
            linearLayoutManager.mo9742a1(parcelable);
        }
    }

    /* renamed from: PO */
    public /* synthetic */ void m85221PO(C3020p0 c3020p0, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreUtility.f89233i);
        this.f78421v1.m15166c2(c3020p0, arrayList);
    }

    /* renamed from: PP */
    public /* synthetic */ void m85222PP(C3073g.z zVar, InterfaceC17463d interfaceC17463d, int i11) {
        this.f78421v1.m15186rG(zVar.m15393d());
        interfaceC17463d.dismiss();
    }

    /* renamed from: QO */
    public /* synthetic */ void m85225QO(BottomSheetMenuResult bottomSheetMenuResult, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            if (C23055e5.m118272g(true)) {
                m85164CO(bottomSheetMenuResult.m45570f());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: QP */
    public /* synthetic */ void m85226QP(C3073g.z zVar, InterfaceC17463d interfaceC17463d, int i11) {
        this.f78421v1.m15186rG(zVar.m15391b());
        interfaceC17463d.dismiss();
    }

    /* renamed from: QQ */
    private void m85227QQ() {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null && abstractC25848a2.m133405K0() != null) {
            this.f78391Y0.m133405K0().m130834l();
        }
        if (this.f78417r1) {
            AbstractC22055v0.m115133W(m85408oO());
        }
    }

    /* renamed from: RO */
    public /* synthetic */ void m85230RO(C3000l0 c3000l0, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            this.f78421v1.m15175j4(c3000l0.f11895q);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: RP */
    public /* synthetic */ void m85231RP(C3073g.a0 a0Var, InterfaceC17463d interfaceC17463d, int i11) {
        this.f78421v1.m15186rG(new C3073g.a0.c(a0Var.m15234b(), a0Var.m15235c(), a0Var.m15240h()));
        interfaceC17463d.dismiss();
    }

    /* renamed from: RQ */
    private void m85232RQ(int i11) {
        RecyclerView recyclerView = this.f78397b1;
        if (recyclerView != null) {
            this.f78364E1 = i11;
            recyclerView.removeCallbacks(this.f78365F1);
            this.f78397b1.removeCallbacks(this.f78366G1);
            this.f78397b1.post(this.f78365F1);
        }
    }

    /* renamed from: SO */
    public /* synthetic */ void m85235SO() {
        SwipeRefreshListView swipeRefreshListView;
        try {
            if (!this.f78362C1 && (swipeRefreshListView = this.f78401d1) != null && swipeRefreshListView.m35364k()) {
                this.f78401d1.setRefreshing(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: SP */
    public /* synthetic */ void m85236SP(C3073g.a0 a0Var, InterfaceC17463d interfaceC17463d, int i11) {
        this.f78421v1.m15186rG(new C3073g.a0.b(a0Var.m15234b(), a0Var.m15235c(), a0Var.m15240h()));
        interfaceC17463d.dismiss();
    }

    /* renamed from: SQ */
    private void m85237SQ(int i11) {
        AbstractC25848a2 abstractC25848a2;
        if (i11 != -1 && (abstractC25848a2 = this.f78391Y0) != null && abstractC25848a2.mo10003k() >= i11) {
            C15188c0 c15188c0 = new C15188c0(this.f78397b1.getContext());
            c15188c0.f78432q = (int) ((AbstractC23136l9.m118713h0() / 3.0f) * 2.0f);
            c15188c0.m10244p(i11);
            this.f78397b1.m9821B1(this.f78424y1);
            this.f78397b1.m9826E(this.f78424y1);
            this.f78399c1.m10090H1(c15188c0);
        }
    }

    /* renamed from: TN */
    public void m85239TN(Runnable runnable) {
        try {
            if (mo45894h0()) {
                mo70710wy(runnable);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: TO */
    public /* synthetic */ void m85240TO() {
        boolean z11 = !this.f78363D1;
        this.f78363D1 = false;
        this.f78421v1.m15190u4(z11);
    }

    /* renamed from: TP */
    public /* synthetic */ void m85241TP(InterfaceC17463d interfaceC17463d, int i11) {
        this.f78421v1.m15186rG(C3073g.a0.a.f12737a);
        interfaceC17463d.dismiss();
    }

    /* renamed from: TQ */
    public void m85242TQ(int i11) {
        boolean z11;
        TabsControlLayout tabsControlLayout;
        boolean z12 = true;
        int i12 = 0;
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
            if (abstractC25848a2 == null || abstractC25848a2.mo10003k() < i11) {
                z12 = false;
            }
            if (z11 && z12 && !m85185HO(i11)) {
                LinearLayoutManager linearLayoutManager = this.f78399c1;
                if (this.f78389X0 && this.f78408i1 != null && (tabsControlLayout = this.f78409j1) != null && tabsControlLayout.getTranslationY() == 0.0f) {
                    i12 = this.f78408i1.getHeight();
                }
                linearLayoutManager.m9721B2(i11, i12);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: UO */
    public /* synthetic */ void m85244UO(RecyclerView recyclerView, int i11, View view) {
        EnumC31036b enumC31036b;
        C24773h c24773h;
        TabItemView tabItemView = (TabItemView) view;
        if (tabItemView != null) {
            C0708i c0708i = new C0708i();
            if (i11 == 0) {
                c24773h = this.f78385V0;
            } else {
                c24773h = this.f78387W0;
            }
            c0708i.m1072c("reddot", c24773h.m128749m() ? 1 : 0);
            tabItemView.setTrackingExtraData(c0708i);
        }
        C3073g c3073g = this.f78421v1;
        if (i11 == 0) {
            enumC31036b = EnumC31036b.f143137p;
        } else {
            enumC31036b = EnumC31036b.f143138q;
        }
        c3073g.m15186rG(new C2273d(enumC31036b));
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null && abstractC25848a2.m133397G0() != null) {
            this.f78391Y0.m133397G0().m104090U(false);
        }
    }

    /* renamed from: UP */
    public /* synthetic */ void m85245UP() {
        C25297f m130959a = C25297f.Companion.m130959a(this.f78401d1.getContext());
        m130959a.m130918X(EnumC25294c.TOP);
        m130959a.m130920Z(true);
        m130959a.m130912R(EnumC25293b.RECTANGLE);
        m130959a.m130923b0(AbstractC23222t7.f112566j);
        m130959a.m130925c0(this.f78401d1);
        m130959a.m130921a0(m85285fO());
        m130959a.m130943l0(0);
        m130959a.m130941k0(true);
        m130959a.m130919Y(false);
        m130959a.m130909O(new ColorDrawable(0));
        StoryHighlightView storyHighlightView = new StoryHighlightView(this.f78401d1.getContext(), m85278dQ(), AbstractC23222t7.f112566j);
        storyHighlightView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TooltipView tooltipView = new TooltipView(this.f78401d1.getContext());
        tooltipView.addView(storyHighlightView);
        tooltipView.setConfigs(m130959a);
        tooltipView.m90734d0();
        tooltipView.setTooltipManager(MainTabView.m67645lM().f63219I1);
        tooltipView.m90733c0();
    }

    /* renamed from: VO */
    public /* synthetic */ void m85247VO(int i11) {
        boolean z11;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            m85419zQ(z11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: VP */
    public /* synthetic */ void m85248VP(TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f78361B1) {
            this.f78361B1 = null;
        }
    }

    /* renamed from: VQ */
    private void m85249VQ(KeyEventCallbackC17462c keyEventCallbackC17462c) {
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.ps0
                public /* synthetic */ ps0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    TimelineView.this.m85213NP(interfaceC17463d);
                }
            });
        }
    }

    /* renamed from: WO */
    public /* synthetic */ boolean m85251WO(View view, MotionEvent motionEvent) {
        try {
            return this.f78412m1.m94389c(this.f78397b1, motionEvent);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: WP */
    public /* synthetic */ void m85252WP(C3073g.i0 i0Var, TooltipView tooltipView, int i11, int i12, boolean z11) {
        this.f78421v1.m15186rG(new C2275f(i0Var.m15303d()));
    }

    /* renamed from: XO */
    public /* synthetic */ void m85254XO(C24860q c24860q) {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m133395E1((List) c24860q.m129215c(), (List) c24860q.m129216d());
            this.f78391Y0.m10008p();
        }
    }

    /* renamed from: XP */
    public /* synthetic */ void m85255XP(C3073g.i0 i0Var) {
        C25297f m130959a = C25297f.Companion.m130959a(this.f78401d1.getContext());
        m130959a.m130933g0(i0Var.m15305f());
        m130959a.m130927d0(i0Var.m15301b());
        m130959a.m130911Q(i0Var.m15300a());
        m130959a.m130918X(EnumC25294c.TOP);
        m130959a.m130920Z(i0Var.m15306g());
        m130959a.m130912R(EnumC25293b.RECTANGLE);
        m130959a.m130923b0(AbstractC23222t7.f112566j);
        m130959a.m130925c0(this.f78409j1);
        m130959a.m130921a0(m85276dO(i0Var.m15304e()));
        if (i0Var.m15307h()) {
            m130959a.m130943l0(4);
            m130959a.m130941k0(true);
        }
        TooltipView tooltipView = new TooltipView(this.f78401d1.getContext());
        tooltipView.setConfigs(m130959a);
        tooltipView.m90734d0();
        tooltipView.setTooltipId(i0Var.m15303d());
        tooltipView.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: com.zing.zalo.ui.zviews.au0

            /* renamed from: b */
            public final /* synthetic */ C3073g.i0 f79850b;

            public /* synthetic */ au0(C3073g.i0 i0Var2) {
                r2 = i0Var2;
            }

            @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
            /* renamed from: a */
            public final void mo66113a(TooltipView tooltipView2, int i11, int i12, boolean z11) {
                TimelineView.this.m85252WP(r2, tooltipView2, i11, i12, z11);
            }
        });
        tooltipView.setTooltipManager(MainTabView.m67645lM().f63219I1);
        tooltipView.m90733c0();
    }

    /* renamed from: YO */
    public /* synthetic */ void m85257YO(C24860q c24860q) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dt0

            /* renamed from: q */
            public final /* synthetic */ C24860q f80171q;

            public /* synthetic */ dt0(C24860q c24860q2) {
                r2 = c24860q2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85254XO(r2);
            }
        });
    }

    /* renamed from: YP */
    public /* synthetic */ void m85258YP(boolean z11) {
        this.f78367H1 = z11;
    }

    /* renamed from: ZN */
    private void m85260ZN() {
        TooltipView tooltipView = this.f78361B1;
        if (tooltipView != null) {
            tooltipView.m90727Q();
        }
        ShowcaseView showcaseView = this.f78425z1;
        if (showcaseView != null) {
            showcaseView.m74626d();
        }
    }

    /* renamed from: ZO */
    public /* synthetic */ void m85261ZO(Boolean bool) {
        this.f78389X0 = bool.booleanValue();
        if (bool.booleanValue()) {
            this.f78408i1.setVisibility(0);
            m85338rR();
        } else {
            this.f78408i1.setVisibility(8);
        }
    }

    /* renamed from: ZP */
    public /* synthetic */ void m85262ZP(ContactProfile contactProfile, InterfaceC17463d interfaceC17463d, int i11) {
        m85209MQ(contactProfile, this.f78367H1);
        interfaceC17463d.dismiss();
    }

    /* renamed from: aP */
    public /* synthetic */ void m85264aP(Boolean bool) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.it0

            /* renamed from: q */
            public final /* synthetic */ Boolean f80717q;

            public /* synthetic */ it0(Boolean bool2) {
                r2 = bool2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85261ZO(r2);
            }
        });
    }

    /* renamed from: aQ */
    public /* synthetic */ void m85265aQ(C28212v6 c28212v6, TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f78361B1) {
            this.f78361B1 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: aR */
    private void m85266aR(C3073g.z zVar) {
        new C16972e0.a(this.f72421L0.getContext()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(zVar.m15395f()).m90949z(zVar.m15390a()).m90922F(false).m90931h("popup_confirm_hide_feed_user").m90947x("popup_confirm_hide_feed_user_accept").m90943t(zVar.m15394e(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.xt0

            /* renamed from: q */
            public final /* synthetic */ C3073g.z f82666q;

            public /* synthetic */ xt0(C3073g.z zVar2) {
                r2 = zVar2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                TimelineView.this.m85222PP(r2, interfaceC17463d, i11);
            }
        }).m90937n("popup_confirm_hide_feed_user_cancel").m90934k(zVar2.m15392c(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.yt0

            /* renamed from: q */
            public final /* synthetic */ C3073g.z f82774q;

            public /* synthetic */ yt0(C3073g.z zVar2) {
                r2 = zVar2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                TimelineView.this.m85226QP(r2, interfaceC17463d, i11);
            }
        }).m90927d().mo13822K();
    }

    /* renamed from: bP */
    public /* synthetic */ void m85268bP(InterfaceC17539l interfaceC17539l, View view) {
        if (interfaceC17539l instanceof C17541n) {
            this.f78421v1.m15169d4();
        } else if (interfaceC17539l instanceof C17543p) {
            this.f78421v1.m15170e4();
        }
    }

    /* renamed from: bQ */
    private void m85269bQ(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108465o(c3020p0.m14465A(), "feed_avt_cover");
            } else if (c3020p0.m14512j0()) {
                C20785b.f102138a.m108466p(c3020p0.m14465A(), "feed_avt_cover");
            }
        }
    }

    /* renamed from: bR */
    private void m85270bR(C3073g.a0 a0Var) {
        new C16972e0.a(this.f72421L0.getContext()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(a0Var.m15239g()).m90949z(a0Var.m15233a()).m90922F(true).m90931h("popup_confirm_hide_feed_user").m90947x("popup_confirm_hide_feed_user_accept").m90943t(a0Var.m15238f(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.rt0

            /* renamed from: q */
            public final /* synthetic */ C3073g.a0 f81856q;

            public /* synthetic */ rt0(C3073g.a0 a0Var2) {
                r2 = a0Var2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                TimelineView.this.m85231RP(r2, interfaceC17463d, i11);
            }
        }).m90941r("popup_confirm_hide_feed_user_move_tab_user").m90939p(a0Var2.m15237e(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.st0

            /* renamed from: q */
            public final /* synthetic */ C3073g.a0 f82130q;

            public /* synthetic */ st0(C3073g.a0 a0Var2) {
                r2 = a0Var2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                TimelineView.this.m85236SP(r2, interfaceC17463d, i11);
            }
        }).m90937n("popup_confirm_hide_feed_user_cancel").m90934k(a0Var2.m15236d(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.tt0
            public /* synthetic */ tt0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                TimelineView.this.m85241TP(interfaceC17463d, i11);
            }
        }).m90927d().mo13822K();
    }

    /* renamed from: cP */
    public /* synthetic */ void m85272cP(InterfaceC17539l interfaceC17539l) {
        View view = this.f78403e1;
        if (view != null) {
            if (interfaceC17539l instanceof AbstractC17542o) {
                this.f78405f1.setText(((AbstractC17542o) interfaceC17539l).m93470a());
                if (this.f78403e1.getVisibility() == 8) {
                    this.f78403e1.setVisibility(0);
                    this.f78403e1.startAnimation(this.f78406g1);
                }
                this.f78403e1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ot0

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC17539l f81510q;

                    public /* synthetic */ ot0(InterfaceC17539l interfaceC17539l2) {
                        r2 = interfaceC17539l2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        TimelineView.this.m85268bP(r2, view2);
                    }
                });
                return;
            }
            view.setVisibility(8);
            this.f78403e1.clearAnimation();
        }
    }

    /* renamed from: cQ */
    private Snackbar m85273cQ(String str, int i11) {
        Typeface m76694c;
        Snackbar m88031t = Snackbar.m88017q(this.f78395a1.findViewById(AbstractC6918a0.main_comment_view), str, 0).m88035x(AbstractC23136l9.m118742r(24.0f)).m88036y(AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(24.0f) * 2)).m88037z(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f)).m88034w(1).m88031t(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        View m88025i = m88031t.m88025i();
        m88025i.setBackgroundResource(AbstractC16803z.bg_restricted_user_snack_bar);
        TextView textView = (TextView) m88025i.findViewById(AbstractC6918a0.snackbar_text);
        textView.setTextColor(Color.parseColor("#FFF2F3F5"));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        RecyclingImageView recyclingImageView = (RecyclingImageView) m88025i.findViewById(AbstractC6918a0.snackbar_icon);
        if (i11 != 0 && this.f72421L0.getContext() != null) {
            recyclingImageView.setImageDrawable(C27280g.m139660c(this.f72421L0.getContext(), i11, AbstractC2807a.icon_02));
            recyclingImageView.setVisibility(0);
        } else {
            recyclingImageView.setVisibility(8);
        }
        m88031t.m88033v(0);
        if (this.f72421L0.getContext() != null && AbstractC23309i.m122089kb() == 0 && (m76694c = C13718q1.m76694c(this.f72421L0.getContext(), 5)) != null) {
            textView.setTypeface(m76694c);
        }
        return m88031t;
    }

    /* renamed from: cR */
    private void m85274cR() {
        if (MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125977u() && this.f78409j1.isShown()) {
            this.f78409j1.m45684a();
            mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.wt0
                public /* synthetic */ wt0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.this.m85245UP();
                }
            }, 800L);
        }
    }

    /* renamed from: dO */
    private Rect m85276dO(EnumC31036b enumC31036b) {
        Rect rect = new Rect();
        View m91304O = this.f78408i1.m91304O(m85310lO(enumC31036b));
        if (m91304O != null) {
            int left = m91304O.getLeft();
            int width = m91304O.getWidth() + left;
            int top = m91304O.getTop();
            rect.set(left, top, width, m91304O.getHeight() + top);
        }
        return rect;
    }

    /* renamed from: dP */
    public /* synthetic */ void m85277dP(InterfaceC17539l interfaceC17539l) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.at0

            /* renamed from: q */
            public final /* synthetic */ InterfaceC17539l f79847q;

            public /* synthetic */ at0(InterfaceC17539l interfaceC17539l2) {
                r2 = interfaceC17539l2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85272cP(r2);
            }
        });
    }

    /* renamed from: dQ */
    private Rect m85278dQ() {
        Rect rect = new Rect();
        StoryBarBtnAdd m85406nO = m85406nO();
        if (m85406nO != null && this.f78409j1 != null) {
            int[] iArr = new int[2];
            m85406nO.getLocationInWindow(iArr);
            int m118742r = iArr[1] + AbstractC23136l9.m118742r(2.0f);
            int height = (m85406nO.getHeight() + m118742r) - AbstractC23136l9.m118742r(4.0f);
            int left = m85406nO.getLeft() + m85406nO.getWidth() + AbstractC23136l9.m118742r(9.0f);
            rect.set(left, m118742r, (m85406nO.getWidth() + left) - AbstractC23136l9.m118742r(1.0f), height);
        }
        return rect;
    }

    /* renamed from: eO */
    private View m85280eO(String str) {
        C15190d0 c15190d0;
        int i11;
        C3000l0 c3000l0;
        try {
            if (this.f78391Y0 != null && (c15190d0 = this.f78412m1) != null && c15190d0.m94387a() != 2) {
                int m9737T1 = this.f78399c1.m9737T1();
                int m9741Z1 = this.f78399c1.m9741Z1();
                if (m9737T1 >= 0 && m9737T1 <= m9741Z1) {
                    while (m9737T1 < m9741Z1) {
                        C2966e1 m133530P = this.f78391Y0.m133530P(m9737T1);
                        if (m133530P != null && (((i11 = m133530P.f11705c) == 40 || i11 == 80) && (c3000l0 = m133530P.f11703a) != null && c3000l0.f11895q.equals(str))) {
                            return this.f78399c1.mo9732P(m9737T1);
                        }
                        m9737T1++;
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: eP */
    public /* synthetic */ void m85281eP(Map map) {
        boolean z11;
        if (this.f78389X0) {
            C24773h c24773h = this.f78385V0;
            EnumC31036b enumC31036b = EnumC31036b.f143137p;
            boolean z12 = false;
            if (map.containsKey(enumC31036b)) {
                z11 = ((Boolean) map.get(enumC31036b)).booleanValue();
            } else {
                z11 = false;
            }
            c24773h.m128757u(z11);
            C24773h c24773h2 = this.f78387W0;
            EnumC31036b enumC31036b2 = EnumC31036b.f143138q;
            if (map.containsKey(enumC31036b2)) {
                z12 = ((Boolean) map.get(enumC31036b2)).booleanValue();
            }
            c24773h2.m128757u(z12);
            this.f78408i1.m91305S();
        }
    }

    /* renamed from: eQ */
    private void m85282eQ() {
        ZdsTabBar zdsTabBar = this.f78408i1;
        if (zdsTabBar != null && this.f78421v1 != null) {
            zdsTabBar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = this.f78408i1.getMeasuredHeight();
            this.f78410k1 = measuredHeight;
            this.f78421v1.m15182q4(measuredHeight);
        }
    }

    /* renamed from: eR */
    private void m85283eR() {
        showDialog(1100);
    }

    /* renamed from: fO */
    private Rect m85285fO() {
        TabsControlLayout tabsControlLayout;
        Rect rect = new Rect();
        StoryBarBtnAdd m85406nO = m85406nO();
        if (m85406nO != null && (tabsControlLayout = this.f78409j1) != null) {
            int[] iArr = new int[2];
            tabsControlLayout.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            m85406nO.getLocationInWindow(iArr2);
            int i11 = (iArr2[1] - iArr[1]) + AbstractC23222t7.f112552c;
            int height = (m85406nO.getHeight() + i11) - AbstractC23222t7.f112556e;
            int left = m85406nO.getLeft() + m85406nO.getWidth() + AbstractC23222t7.f112566j;
            rect.set(left, i11, m85406nO.getWidth() + left, height);
        }
        return rect;
    }

    /* renamed from: fP */
    public /* synthetic */ void m85286fP(Map map) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ct0

            /* renamed from: q */
            public final /* synthetic */ Map f80054q;

            public /* synthetic */ ct0(Map map2) {
                r2 = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85281eP(r2);
            }
        });
    }

    /* renamed from: fQ */
    private void m85287fQ(boolean z11) {
        try {
            if (this.f78397b1 != null) {
                for (int i11 = 0; i11 < this.f78397b1.getChildCount(); i11++) {
                    KeyEvent.Callback childAt = this.f78397b1.getChildAt(i11);
                    if (childAt instanceof InterfaceC8403u6) {
                        if (z11) {
                            ((InterfaceC8403u6) childAt).onResume();
                        } else {
                            ((InterfaceC8403u6) childAt).onPause();
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: gO */
    private void m85289gO() {
        SwipeRefreshListView swipeRefreshListView = this.f78401d1;
        if (swipeRefreshListView != null) {
            this.f78363D1 = true;
            swipeRefreshListView.m88199H(100L);
        }
    }

    /* renamed from: gP */
    public /* synthetic */ void m85290gP(boolean z11, boolean z12) {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m133404J1(z11);
            this.f78391Y0.m133402I1(z12);
        }
    }

    /* renamed from: gQ */
    private void m85291gQ() {
        if (this.f78421v1 != null) {
            m85353uQ();
            m85333qQ();
            m85296hQ();
            m85343sQ();
            m85348tQ();
            m85305jQ();
            m85308kQ();
            m85316mQ();
            m85337rQ();
            m85300iQ();
            m85320nQ();
        }
        if (this.f78422w1 != null) {
            m85327pQ();
            m85312lQ();
            m85323oQ();
        }
        if (this.f78423x1 != null) {
            m85358vQ();
        }
    }

    /* renamed from: gR */
    private void m85292gR(String str) {
        boolean z11;
        C13306b m85303jO = m85303jO();
        View m85280eO = m85280eO(str);
        TooltipView tooltipView = this.f78361B1;
        if (tooltipView != null && tooltipView.isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m85303jO != null && m85280eO != null && !z11) {
            Context context = m85280eO.getContext();
            C25297f m130959a = C25297f.Companion.m130959a(context);
            m130959a.m130925c0(m85280eO);
            m130959a.m130933g0(context.getString(AbstractC8020f0.str_feed_reaction_tip_onboarding_title));
            m130959a.m130927d0(context.getString(AbstractC8020f0.str_feed_reaction_tip_onboarding_description));
            m130959a.m130911Q(context.getString(AbstractC8020f0.str_tip_banner_got_it));
            m130959a.m130914T(C25292a.f121281a);
            C25292a m130940k = m130959a.m130940k();
            if (m130940k != null) {
                C25292a.a aVar = new C25292a.a();
                aVar.m130888m(0);
                aVar.m130886k("zds_il_reaction_onboarding_hero_21_9");
                aVar.m130890o(238);
                aVar.m130885j(102);
                m130940k.m130875h(aVar);
            }
            m130959a.m130918X(EnumC25294c.TOP);
            m130959a.m130912R(EnumC25293b.RECTANGLE);
            m130959a.m130920Z(true);
            m130959a.m130943l0(0);
            m130959a.m130937i0(true);
            TooltipView tooltipView2 = new TooltipView(m85280eO.getContext());
            this.f78361B1 = tooltipView2;
            tooltipView2.setConfigs(m130959a);
            this.f78361B1.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: com.zing.zalo.ui.zviews.vt0
                public /* synthetic */ vt0() {
                }

                @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
                /* renamed from: a */
                public final void mo66113a(TooltipView tooltipView3, int i11, int i12, boolean z12) {
                    TimelineView.this.m85248VP(tooltipView3, i11, i12, z12);
                }
            });
            this.f78361B1.setOnTooltipShowHideListener(new C15205s());
            this.f78361B1.setTooltipManager(m85303jO);
            this.f78361B1.m90733c0();
        }
    }

    /* renamed from: hO */
    private String m85294hO() {
        C27353a c27353a = this.f78422w1;
        if (c27353a != null) {
            return c27353a.m139982U();
        }
        return "";
    }

    /* renamed from: hP */
    public /* synthetic */ void m85295hP(C3073g.b0 b0Var, int i11) {
        this.f78421v1.m15137A4(b0Var.m15250b(), i11, b0Var.m15249a());
    }

    /* renamed from: hQ */
    private void m85296hQ() {
        this.f78421v1.m15187s2().m9223p(this);
        this.f78421v1.m15187s2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.fs0
            public /* synthetic */ fs0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85257YO((C24860q) obj);
            }
        });
    }

    /* renamed from: hR */
    private void m85297hR(C3073g.i0 i0Var) {
        if (MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125977u() && this.f78409j1.isShown()) {
            this.f78409j1.m45684a();
            mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.ut0

                /* renamed from: q */
                public final /* synthetic */ C3073g.i0 f82339q;

                public /* synthetic */ ut0(C3073g.i0 i0Var2) {
                    r2 = i0Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.this.m85255XP(r2);
                }
            }, i0Var2.m15302c());
        }
    }

    /* renamed from: iP */
    public /* synthetic */ void m85299iP(C19964c c19964c) {
        C3073g c3073g;
        AbstractC25848a2 abstractC25848a2;
        AbstractC25848a2 abstractC25848a22;
        C3426e m85408oO;
        C3073g.g gVar = (C3073g.g) c19964c.m103749a();
        if ((gVar instanceof C3073g.y) && (m85408oO = m85408oO()) != null) {
            m85408oO.m17188m(0);
        }
        if (gVar instanceof C3073g.x) {
            m85411r4();
        }
        if (gVar instanceof C3073g.u) {
            m85232RQ(((C3073g.u) gVar).m15368a());
        }
        if (gVar instanceof C3073g.v) {
            m85237SQ(((C3073g.v) gVar).m15372a());
        }
        if (gVar instanceof C3073g.w) {
            m85218OQ(((C3073g.w) gVar).m15375a());
        }
        if (gVar instanceof C3073g.l) {
            m85289gO();
        }
        if (gVar instanceof C3073g.s) {
            m85381JQ();
        }
        if (gVar instanceof C3073g.k0) {
            m85410qR();
        }
        if (gVar instanceof C3073g.e0) {
            m85399dR(((C3073g.e0) gVar).m15276a());
        }
        if (gVar instanceof C3073g.d0) {
            mo46829Y();
        }
        if (gVar instanceof C3073g.e) {
            mo49315c4();
        }
        if (gVar instanceof C3073g.f) {
            this.f78401d1.setSwipeRefreshEnable(true);
        }
        if (gVar instanceof C3073g.d) {
            this.f78401d1.setSwipeRefreshEnable(false);
        }
        if (gVar instanceof C3073g.h0) {
            C3073g.h0 h0Var = (C3073g.h0) gVar;
            m85404kR(h0Var.m15295a(), h0Var.m15296b());
        }
        if (gVar instanceof C3073g.g0) {
            C3073g.g0 g0Var = (C3073g.g0) gVar;
            m85402jR(g0Var.m15288b(), g0Var.m15287a());
        }
        if (gVar instanceof C3073g.p) {
            m85177FQ();
        }
        if (gVar instanceof C3073g.m) {
            m85173EQ();
        }
        if (gVar instanceof C3073g.a0) {
            m85270bR((C3073g.a0) gVar);
        }
        if (gVar instanceof C3073g.z) {
            m85266aR((C3073g.z) gVar);
        }
        if (gVar instanceof C3073g.o) {
            m85169DQ();
        }
        if (gVar instanceof C3073g.i0) {
            m85297hR((C3073g.i0) gVar);
        }
        if (gVar instanceof C3073g.n) {
            m85292gR(((C3073g.n) gVar).m15333a());
        }
        if ((gVar instanceof C3073g.j0) && this.f78391Y0 != null) {
            Iterator it = ((C3073g.j0) gVar).m15312a().iterator();
            while (it.hasNext()) {
                this.f78391Y0.m133406K1((C3000l0) it.next());
            }
        }
        if ((gVar instanceof C3073g.i) && (abstractC25848a22 = this.f78391Y0) != null) {
            abstractC25848a22.m133408M1(((C3073g.i) gVar).m15299a());
        }
        if (gVar instanceof C3073g.k) {
            C3073g.k kVar = (C3073g.k) gVar;
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lt0

                /* renamed from: q */
                public final /* synthetic */ boolean f81049q;

                /* renamed from: r */
                public final /* synthetic */ boolean f81050r;

                public /* synthetic */ lt0(boolean z11, boolean z12) {
                    r2 = z11;
                    r3 = z12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.this.m85290gP(r2, r3);
                }
            });
        }
        if (gVar instanceof C3073g.t) {
            Message obtainMessage = this.f78376Q1.obtainMessage(1, -1, 0, "tip.any");
            this.f78376Q1.removeMessages(1);
            this.f78376Q1.sendMessageDelayed(obtainMessage, 500L);
        }
        if (gVar instanceof C3073g.c0) {
            m85274cR();
        }
        if (gVar instanceof C3073g.r) {
            C3073g.r rVar = (C3073g.r) gVar;
            mo11973vq(rVar.m15352a(), rVar.m15353b(), rVar.m15354c());
        }
        if (gVar instanceof C3073g.b0) {
            C3073g.b0 b0Var = (C3073g.b0) gVar;
            m85400fR(b0Var.m15253e(), b0Var.m15254f(), b0Var.m15252d(), b0Var.m15251c(), new InterfaceC2333h() { // from class: com.zing.zalo.ui.zviews.mt0

                /* renamed from: b */
                public final /* synthetic */ C3073g.b0 f81181b;

                public /* synthetic */ mt0(C3073g.b0 b0Var2) {
                    r2 = b0Var2;
                }

                @Override // as.InterfaceC2333h
                /* renamed from: b */
                public final void mo12288b(int i11) {
                    TimelineView.this.m85295hP(r2, i11);
                }
            });
        }
        if ((gVar instanceof C3073g.h) && (abstractC25848a2 = this.f78391Y0) != null) {
            C3073g.h hVar = (C3073g.h) gVar;
            abstractC25848a2.m133412S1(hVar.m15292a(), hVar.m15293b(), hVar.m15294c());
        }
        if (gVar instanceof C3073g.f0) {
            m85399dR(C19140e.m100450e(m92689tK()));
        }
        if ((gVar instanceof C3073g.q) && (c3073g = this.f78421v1) != null) {
            c3073g.m15140E4(((C3073g.q) gVar).m15346a(), AbstractC23136l9.m118725l0(m92689tK()));
        }
    }

    /* renamed from: iQ */
    private void m85300iQ() {
        this.f78421v1.m15183r2().m9223p(this);
        this.f78421v1.m15183r2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ks0
            public /* synthetic */ ks0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85264aP((Boolean) obj);
            }
        });
    }

    /* renamed from: iR */
    private void m85301iR(C3020p0 c3020p0) {
        View m132023c;
        if (c3020p0 != null) {
            C21785g m112430F0 = C21785g.m112430F0();
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c3020p0.m14465A());
            if (m141809c != null) {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(7);
                aVar.m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_delete_contact_dialog), m141809c.m40420o0()));
                this.f78367H1 = false;
                if (m112430F0.mo112415n0() && !TextUtils.isEmpty(m141809c.f42455y) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_in_social_timeline") && (m132023c = C25485r.f122083a.m132023c(this.f72421L0.getContext(), m141809c, new C25485r.a() { // from class: com.zing.zalo.ui.zviews.qs0
                    public /* synthetic */ qs0() {
                    }

                    @Override // p458qr.C25485r.a
                    /* renamed from: a */
                    public final void mo87261a(boolean z11) {
                        TimelineView.this.m85258YP(z11);
                    }
                })) != null) {
                    aVar.m43177z(m132023c);
                }
                aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_delete_contact_dialog), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.rs0

                    /* renamed from: q */
                    public final /* synthetic */ ContactProfile f81853q;

                    public /* synthetic */ rs0(ContactProfile m141809c2) {
                        r2 = m141809c2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        TimelineView.this.m85262ZP(r2, interfaceC17463d, i11);
                    }
                });
                aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b());
                C8009j m43152a = aVar.m43152a();
                this.f78380S1 = m43152a;
                m85249VQ(m43152a);
                this.f78380S1.mo13822K();
            }
        }
    }

    /* renamed from: jO */
    private C13306b m85303jO() {
        if (MainTabView.m67645lM() != null) {
            return MainTabView.m67645lM().f63219I1;
        }
        return null;
    }

    /* renamed from: jP */
    public /* synthetic */ void m85304jP(C19964c c19964c) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ht0

            /* renamed from: q */
            public final /* synthetic */ C19964c f80617q;

            public /* synthetic */ ht0(C19964c c19964c2) {
                r2 = c19964c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85299iP(r2);
            }
        });
    }

    /* renamed from: jQ */
    private void m85305jQ() {
        bu0 bu0Var = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.bu0
            public /* synthetic */ bu0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85277dP((InterfaceC17539l) obj);
            }
        };
        this.f78421v1.m15144M2().m9223p(this);
        this.f78421v1.m15144M2().m9219j(this, bu0Var);
        this.f78421v1.m15146N2().m9223p(this);
        this.f78421v1.m15146N2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.cu0
            public /* synthetic */ cu0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85286fP((Map) obj);
            }
        });
    }

    /* renamed from: kP */
    public /* synthetic */ C24848g0 m85307kP(C27353a.b bVar) {
        AbstractC25848a2 abstractC25848a2;
        if (bVar instanceof C27353a.g) {
            C27353a.g gVar = (C27353a.g) bVar;
            m85182GQ(gVar.m140010a(), gVar.m140011b());
            return null;
        }
        if (bVar instanceof C27353a.d) {
            mo78936E(((C27353a.d) bVar).m140007a());
            return null;
        }
        if ((bVar instanceof C27353a.c) && (abstractC25848a2 = this.f78391Y0) != null && abstractC25848a2.m133397G0() != null) {
            this.f78391Y0.m133397G0().m104090U(false);
            return null;
        }
        return null;
    }

    /* renamed from: kQ */
    private void m85308kQ() {
        this.f78421v1.m15167c3().m9223p(this);
        this.f78421v1.m15167c3().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.gs0
            public /* synthetic */ gs0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85304jP((C19964c) obj);
            }
        });
    }

    /* renamed from: lO */
    private int m85310lO(EnumC31036b enumC31036b) {
        if (enumC31036b == EnumC31036b.f143137p) {
            return 0;
        }
        return 1;
    }

    /* renamed from: lP */
    public /* synthetic */ void m85311lP(InterfaceC17540m interfaceC17540m) {
        this.f78401d1.setRefreshing(interfaceC17540m instanceof C17544q);
    }

    /* renamed from: lQ */
    private void m85312lQ() {
        this.f78422w1.m139988b0().m9223p(this);
        this.f78422w1.m139988b0().m9219j(this, new C19965d(new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.ls0
            public /* synthetic */ ls0() {
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m85307kP;
                m85307kP = TimelineView.this.m85307kP((C27353a.b) obj);
                return m85307kP;
            }
        }));
    }

    /* renamed from: lR */
    private void m85313lR(C28212v6 c28212v6, View view, Rect rect) {
        C13306b m85303jO = m85303jO();
        if (m85303jO != null) {
            C25297f m130959a = C25297f.Companion.m130959a(view.getContext());
            C13306b.m74680h(c28212v6.f131577c);
            m130959a.m130907M(c28212v6, view.getContext());
            m130959a.m130925c0(view);
            m130959a.m130916V(c28212v6.f131591q);
            if (rect != null) {
                m130959a.m130921a0(rect);
            }
            TooltipView tooltipView = new TooltipView(view.getContext());
            this.f78361B1 = tooltipView;
            tooltipView.setConfigs(m130959a);
            this.f78361B1.m90734d0();
            this.f78361B1.setTooltipId(c28212v6.f131577c);
            this.f78361B1.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: com.zing.zalo.ui.zviews.ts0

                /* renamed from: b */
                public final /* synthetic */ C28212v6 f82234b;

                public /* synthetic */ ts0(C28212v6 c28212v62) {
                    r2 = c28212v62;
                }

                @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
                /* renamed from: a */
                public final void mo66113a(TooltipView tooltipView2, int i11, int i12, boolean z11) {
                    TimelineView.this.m85265aQ(r2, tooltipView2, i11, i12, z11);
                }
            });
            this.f78361B1.setTooltipManager(m85303jO);
            this.f78361B1.m90733c0();
        }
    }

    /* renamed from: mP */
    public /* synthetic */ void m85315mP(InterfaceC17540m interfaceC17540m) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.et0

            /* renamed from: q */
            public final /* synthetic */ InterfaceC17540m f80278q;

            public /* synthetic */ et0(InterfaceC17540m interfaceC17540m2) {
                r2 = interfaceC17540m2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85311lP(r2);
            }
        });
    }

    /* renamed from: mQ */
    private void m85316mQ() {
        this.f78421v1.m15149T2().m9223p(this);
        this.f78421v1.m15149T2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.wr0
            public /* synthetic */ wr0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85315mP((InterfaceC17540m) obj);
            }
        });
    }

    /* renamed from: mR */
    private void m85317mR() {
        boolean z11;
        C29116a c29116a = C29116a.f134962a;
        if (c29116a.mo117210a() && C26356e.f125201a.mo117210a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C26356e.f125201a.m135683j(z11);
        c29116a.mo117211b(z11);
        C24390b.f117764a.m127575f(z11);
    }

    /* renamed from: nP */
    public /* synthetic */ void m85319nP(C24848g0 c24848g0) {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m133413T1();
        }
    }

    /* renamed from: nQ */
    private void m85320nQ() {
        this.f78421v1.m15147P2().m9223p(this);
        this.f78421v1.m15147P2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.eu0
            public /* synthetic */ eu0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85319nP((C24848g0) obj);
            }
        });
    }

    /* renamed from: oP */
    public /* synthetic */ void m85322oP(InterfaceC2946a1 interfaceC2946a1) {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m133410Q1(interfaceC2946a1.mo13947I(), interfaceC2946a1);
        }
    }

    /* renamed from: oQ */
    private void m85323oQ() {
        zr0 zr0Var = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.zr0
            public /* synthetic */ zr0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85326pP((InterfaceC2946a1) obj);
            }
        };
        this.f78422w1.m139983W().m9223p(this);
        this.f78422w1.m139983W().m9219j(this, zr0Var);
    }

    /* renamed from: oR */
    private void m85324oR() {
        String str;
        C0697c0.b bVar = C0697c0.Companion;
        if (MainTabView.m67645lM().m67712uM(C24099q0.m125958k().m125977u())) {
            str = "1";
        } else {
            str = "0";
        }
        bVar.m1052f(this, "reddot_maintab", str);
        bVar.m1052f(this, "tab", String.valueOf(this.f78421v1.m15177l2().m150864c()));
    }

    /* renamed from: pP */
    public /* synthetic */ void m85326pP(InterfaceC2946a1 interfaceC2946a1) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ss0

            /* renamed from: q */
            public final /* synthetic */ InterfaceC2946a1 f82127q;

            public /* synthetic */ ss0(InterfaceC2946a1 interfaceC2946a12) {
                r2 = interfaceC2946a12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85322oP(r2);
            }
        });
    }

    /* renamed from: pQ */
    private void m85327pQ() {
        ms0 ms0Var = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ms0
            public /* synthetic */ ms0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85336rP((Boolean) obj);
            }
        };
        this.f78422w1.m139989c0().m9223p(this);
        this.f78422w1.m139989c0().m9219j(this, ms0Var);
    }

    /* renamed from: pR */
    private void m85328pR(C3020p0 c3020p0, Bundle bundle) {
        String str;
        if (c3020p0 != null && bundle != null) {
            bundle.putBoolean("EXTRA_BOL_ALLOW_DISABLE_BACK_ANIM", true);
            if (mo46542d1().equals(c3020p0.f12057p)) {
                str = c3020p0.f12057p;
            } else {
                str = "";
            }
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", str);
        }
    }

    /* renamed from: qO */
    private C32002l4 m85331qO() {
        int i11;
        if (this.f78421v1.m15177l2() == EnumC31036b.f143137p) {
            i11 = 10002;
        } else {
            i11 = 10031;
        }
        return C32002l4.m154264g(i11);
    }

    /* renamed from: qP */
    public /* synthetic */ void m85332qP(Boolean bool) {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m133411R1(bool.booleanValue());
        }
    }

    /* renamed from: qQ */
    private void m85333qQ() {
        nr0 nr0Var = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.nr0
            public /* synthetic */ nr0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85347tP((InterfaceC17547t) obj);
            }
        };
        this.f78421v1.m15158Y2().m9223p(this);
        this.f78421v1.m15158Y2().m9219j(this, nr0Var);
    }

    /* renamed from: rP */
    public /* synthetic */ void m85336rP(Boolean bool) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ws0

            /* renamed from: q */
            public final /* synthetic */ Boolean f82555q;

            public /* synthetic */ ws0(Boolean bool2) {
                r2 = bool2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85332qP(r2);
            }
        });
    }

    /* renamed from: rQ */
    private void m85337rQ() {
        this.f78421v1.m15156X2().m9223p(this);
        this.f78421v1.m15156X2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.hs0
            public /* synthetic */ hs0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85357vP((InterfaceC17546s) obj);
            }
        });
    }

    /* renamed from: rR */
    private void m85338rR() {
        SwipeRefreshListView swipeRefreshListView = this.f78401d1;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.m35371s(false, 0, AbstractC23136l9.m118742r(64.0f));
        }
    }

    /* renamed from: sO */
    public List m85341sO() {
        HashSet hashSet = new HashSet();
        List asList = Arrays.asList(AbstractC28025b8.f130852i);
        ArrayList arrayList = new ArrayList();
        for (PromotePostItem promotePostItem : C30169a.f140177a.m148801a().m44994b().getPromotePost()) {
            if (!TextUtils.isEmpty(promotePostItem.getTipCat())) {
                arrayList.add(promotePostItem.getTipCat());
            }
        }
        hashSet.addAll(asList);
        hashSet.addAll(arrayList);
        return new ArrayList(hashSet);
    }

    /* renamed from: sP */
    public /* synthetic */ void m85342sP(InterfaceC17547t interfaceC17547t) {
        if (this.f78397b1 == null) {
            return;
        }
        if (interfaceC17547t instanceof C17537j) {
            this.f78407h1.setVisibility(0);
            this.f78397b1.setVisibility(8);
        } else {
            this.f78407h1.setVisibility(8);
            this.f78397b1.setVisibility(0);
        }
    }

    /* renamed from: sQ */
    private void m85343sQ() {
        this.f78421v1.m15197y2().m9223p(this);
        this.f78421v1.m15197y2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.is0
            public /* synthetic */ is0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85365xP((Integer) obj);
            }
        });
    }

    /* renamed from: sR */
    private void m85344sR(C3000l0 c3000l0, Bundle bundle) {
        String str;
        if (c3000l0 != null) {
            if (mo46542d1().equals(c3000l0.f11895q)) {
                str = c3000l0.f11895q;
            } else {
                str = "";
            }
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", str);
        }
    }

    /* renamed from: tP */
    public /* synthetic */ void m85347tP(InterfaceC17547t interfaceC17547t) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ys0

            /* renamed from: q */
            public final /* synthetic */ InterfaceC17547t f82771q;

            public /* synthetic */ ys0(InterfaceC17547t interfaceC17547t2) {
                r2 = interfaceC17547t2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85342sP(r2);
            }
        });
    }

    /* renamed from: tQ */
    private void m85348tQ() {
        this.f78421v1.m15160Z2().m9223p(this);
        this.f78421v1.m15160Z2().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ft0
            public /* synthetic */ ft0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85373zP((List) obj);
            }
        });
    }

    /* renamed from: uO */
    private String m85351uO(C3020p0 c3020p0) {
        try {
            C3047v0 c3047v0 = c3020p0.f12022B;
            return AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: uP */
    public /* synthetic */ void m85352uP(InterfaceC17546s interfaceC17546s) {
        if (interfaceC17546s instanceof C17545r) {
            this.f78401d1.m88209V();
        } else {
            this.f78401d1.m88202K();
        }
    }

    /* renamed from: uQ */
    private void m85353uQ() {
        qt0 qt0Var = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.qt0
            public /* synthetic */ qt0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85161BP((EnumC31036b) obj);
            }
        };
        this.f78421v1.m15162a3().m9223p(this);
        this.f78421v1.m15162a3().m9219j(this, qt0Var);
    }

    /* renamed from: vO */
    public void m85356vO(String str, String str2) {
        this.f78422w1.m139994m0(str);
    }

    /* renamed from: vP */
    public /* synthetic */ void m85357vP(InterfaceC17546s interfaceC17546s) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.kt0

            /* renamed from: q */
            public final /* synthetic */ InterfaceC17546s f80939q;

            public /* synthetic */ kt0(InterfaceC17546s interfaceC17546s2) {
                r2 = interfaceC17546s2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85352uP(r2);
            }
        });
    }

    /* renamed from: vQ */
    private void m85358vQ() {
        this.f78423x1.m104575Q().m9223p(this);
        this.f78423x1.m104575Q().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.vr0
            public /* synthetic */ vr0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                TimelineView.this.m85168DP((C19964c) obj);
            }
        });
    }

    /* renamed from: wO */
    public void m85361wO(String str, String str2) {
        this.f78422w1.m139995n0(str);
    }

    /* renamed from: wP */
    public /* synthetic */ void m85362wP(Integer num) {
        C3426e m85408oO = m85408oO();
        if (m85408oO != null) {
            m85408oO.m17202u(num.intValue());
        }
    }

    /* renamed from: xP */
    public /* synthetic */ void m85365xP(Integer num) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.vs0

            /* renamed from: q */
            public final /* synthetic */ Integer f82445q;

            public /* synthetic */ vs0(Integer num2) {
                r2 = num2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85362wP(r2);
            }
        });
    }

    /* renamed from: yO */
    private void m85368yO(int i11, Intent intent) {
        C17487o0 c17487o0;
        if (i11 == -1 && intent != null) {
            try {
                MusicDetailResult m133686a = AbstractC25950a.m133686a(intent);
                if (m133686a != null) {
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    C17487o0 c17487o02 = c17487o0;
                    TrackingSource trackingSource = new TrackingSource(41);
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_SONG_ID", m133686a.m45741a());
                    bundle.putString("extra_tracking_source", trackingSource.m40686z());
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(UpdateStatusView.class, bundle, 0, 1, true);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: yP */
    public /* synthetic */ void m85369yP(List list) {
        C3426e m85408oO = m85408oO();
        if (m85408oO != null) {
            m85408oO.m17203v(list);
            m85408oO.mo17187l();
        }
    }

    /* renamed from: yQ */
    public void m85370yQ() {
        LinearLayoutManager linearLayoutManager;
        C3073g c3073g = this.f78421v1;
        if (c3073g != null && (linearLayoutManager = this.f78399c1) != null) {
            c3073g.m15199z4(linearLayoutManager.mo9743b1());
        }
    }

    /* renamed from: zP */
    public /* synthetic */ void m85373zP(List list) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jt0

            /* renamed from: q */
            public final /* synthetic */ List f80820q;

            public /* synthetic */ jt0(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85369yP(r2);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.maintab.MainTabView.InterfaceC12111i
    /* renamed from: A2 */
    public boolean mo67726A2() {
        C13306b c13306b;
        if (MainTabView.m67645lM() != null) {
            c13306b = MainTabView.m67645lM().f63219I1;
        } else {
            c13306b = null;
        }
        if (c13306b != null && c13306b.m74707p()) {
            return true;
        }
        return false;
    }

    /* renamed from: AQ */
    public void m85374AQ(boolean z11) {
        View loadingView = this.f78407h1.getLoadingView();
        if (loadingView instanceof TimelineSkeletonView) {
            TimelineSkeletonView timelineSkeletonView = (TimelineSkeletonView) loadingView;
            if (!z11) {
                if (timelineSkeletonView != null) {
                    timelineSkeletonView.m85154j();
                }
            } else if (this.f78407h1.getState() == MultiStateView.EnumC15914e.LOADING && timelineSkeletonView != null) {
                timelineSkeletonView.m85153i();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Ak */
    public void mo11916Ak(int i11, String str) {
        if (C24355e0.f117560a.m127362p()) {
            m85283eR();
            return;
        }
        for (PromotePostItem promotePostItem : new ArrayList(C30169a.f140177a.m148801a().m44994b().getPromotePost())) {
            if (promotePostItem.getId() == i11) {
                try {
                    C31877d c31877d = new C31877d();
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC23647d.m123897g("490342");
                            }
                        } else {
                            AbstractC23647d.m123897g("490341");
                        }
                    } else {
                        AbstractC23647d.m123897g("490340");
                    }
                    C0708i c0708i = new C0708i();
                    c0708i.m1075f("srcTracking", str);
                    C0732w.Companion.m1189a().m1187q("click_button_fpf_promote", "", c0708i, null);
                    AbstractC28025b8.m141442M(promotePostItem.getTipCat());
                    TrackingSource trackingSource = new TrackingSource(40);
                    trackingSource.m40677a("srcTracking", str);
                    c31877d.f146415a = trackingSource;
                    c31877d.m153184c(C32002l4.m154265h(10002, 31));
                    AbstractC28207v1.m141994i3(promotePostItem.getActionType(), 4, m92676n2(), this, promotePostItem.getActionData(), c31877d);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    /* renamed from: BO */
    void m85375BO(int i11, Intent intent) {
        try {
            if (i11 == -1) {
                if (intent != null) {
                    if (intent.hasExtra("EXTRA_VIDEO_INFO")) {
                        C27373c c27373c = (C27373c) intent.getSerializableExtra("EXTRA_VIDEO_INFO");
                        intent.getStringExtra("extra_result_video_log");
                        if (this.f78378R1 != null && c27373c != null) {
                            AbstractC26897a.m138618d(c27373c);
                            this.f78378R1.putInt("media_type", 2);
                            this.f78378R1.putSerializable("extra_video_info", c27373c);
                            ((ZaloActivity) getContext()).mo35579p().m93069k2(UpdateStatusView.class, this.f78378R1, 1, true);
                        }
                    }
                }
            } else {
                this.f78378R1 = null;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: BQ */
    public void m85376BQ(boolean z11) {
        boolean z12;
        if (z11 && AbstractC23136l9.m118666N0(this.f78407h1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        m85374AQ(z12);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: CB */
    public void mo11918CB(int i11) {
        boolean z11;
        SwipeRefreshListView swipeRefreshListView = this.f78401d1;
        if (swipeRefreshListView != null) {
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            swipeRefreshListView.setEnabled(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            this.f78411l1 = new C23528a(this.f72421L0.m92648SI());
            this.f78416q1 = m92651WI().getDimensionPixelSize(AbstractC16802y.abs__action_bar_default_height);
            this.f78419t1 = AbstractC23309i.m121892f4() / 100.0f;
            this.f72830E0 = C24099q0.m125958k().m125977u();
            if (m92642L3() != null) {
                this.f72830E0 = m92642L3().getInt("position");
            }
            m85383LQ();
            if (MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125977u()) {
                this.f78420u1 = true;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: CQ */
    public void m85377CQ(boolean z11) {
        this.f78420u1 = z11;
        if (z11) {
            if (this.f78417r1) {
                AbstractC22055v0.m115142c0(m85408oO(), true);
            }
            if (this.f78417r1) {
                C3426e m85408oO = m85408oO();
                if (m85408oO != null) {
                    m85408oO.m17203v(C22021e0.f108429m);
                    m85408oO.m17201t();
                }
                AbstractC22055v0.m115133W(m85408oO);
            }
            AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
            if (abstractC25848a2 != null && abstractC25848a2.m133405K0() != null) {
                this.f78391Y0.m133405K0().m130834l();
                this.f78391Y0.m133417t1(this.f78397b1);
            }
            mo11966po();
            this.f78421v1.m15161Z3();
        } else {
            if (this.f78417r1) {
                AbstractC22055v0.m115142c0(m85408oO(), false);
            }
            ZMediaPlayer.setStopAllUrlCaching(ZMediaPlayerSettings.getVideoConfig(2));
            ZMediaPlayer.releaseUrlBySection(ZMediaPlayerSettings.getVideoConfig(2));
            C26333b.f125013a.m135515e();
            C28905e.m144373n().m144391j(C23793c.m124316k().mo124311f());
            InterruptMusicController.f46298p.m45699e();
        }
        m85287fQ(z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 100) {
            if (i11 != 1014) {
                if (i11 != 1100) {
                    return null;
                }
                return C24355e0.f117560a.m127360h(m92689tK(), new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.us0
                    public /* synthetic */ us0() {
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        C24848g0 m85181GP;
                        m85181GP = TimelineView.this.m85181GP();
                        return m85181GP;
                    }
                });
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(4).m43162k(Html.fromHtml(AbstractC23136l9.m118746s0(AbstractC8020f0.str_alert_feed_album_privacy, this.f78400c2))).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_feed_album_privacy_confirm), new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f78383U0).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.js0
            public /* synthetic */ js0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                TimelineView.this.m85176FP(interfaceC17463d, i12);
            }
        }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
        return aVar2.m43152a();
    }

    /* renamed from: DO */
    public void m85378DO() {
        this.f78402d2 = new C15186b0(this.f78375P1, 0);
        this.f78404e2 = new C15186b0(this.f78375P1, 1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 1200 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                return new C8848a(m92692wK(), (C8848a.a) obj);
            }
        }
        return null;
    }

    /* renamed from: EO */
    void m85379EO() {
        RecyclerView recyclerView = this.f78397b1;
        if (recyclerView != null && recyclerView.getParent() != null) {
            AbstractC1579n0.m7831P0((View) this.f78397b1.getParent(), true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Eu */
    public void mo11919Eu(C3020p0 c3020p0, C3000l0 c3000l0, String str, Bundle bundle) {
        String str2;
        String str3;
        C31987k4 c31987k4;
        C26878b.m138449b().m138453e(c3000l0, c3020p0);
        String str4 = "";
        if (c3020p0 == null) {
            str2 = "";
        } else {
            str2 = c3020p0.f12057p;
        }
        if (c3020p0 == null) {
            str3 = "";
        } else {
            str3 = c3020p0.m14465A();
        }
        C17487o0 mo35579p = m92676n2().mo35579p();
        if (m92676n2() != null && mo35579p != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putInt("EXTRA_BOTTOM_SHEET_TYPE", 2);
            bundle2.putString("EXTRA_FEED_ID", str2);
            bundle2.putString("EXTRA_PHOTO_ID", str);
            bundle2.putString("EXTRA_OWNER_ID", str3);
            if (bundle2.getBoolean("EXTRA_OPEN_WITH_SUGGEST_COMMENT", false)) {
                c31987k4 = new C31987k4(10002, 45);
            } else {
                c31987k4 = new C31987k4(10002);
            }
            bundle2.putString("EXTRA_ENTRY_POINT_FLOW", C32002l4.m154266i(c31987k4).m154277l());
            bundle2.putInt("fromTimelineTab", c3000l0.f11896q0);
            if (mo46542d1().equals(str2)) {
                str4 = mo46542d1();
            }
            bundle2.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", str4);
            mo35579p.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle2, 1013, 1, true);
        }
    }

    /* renamed from: FO */
    void m85380FO(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(AbstractC6918a0.main_comment_view);
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) view.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f78401d1 = swipeRefreshListView;
        swipeRefreshListView.setContainerViewSnackBar(viewGroup);
        this.f78395a1 = viewGroup;
        this.f78401d1.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.as0
            public /* synthetic */ as0() {
            }

            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                TimelineView.this.m85240TO();
            }
        });
        this.f78401d1.f83579m0.setVisibility(8);
        this.f78397b1 = this.f78401d1.f83582p0;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        this.f78399c1 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        this.f78397b1.setLayoutManager(this.f78399c1);
        this.f78397b1.setOverScrollMode(2);
        this.f78397b1.setVisibility(0);
        this.f78397b1.setBackgroundResource(AbstractC17466e.transparent);
        this.f78397b1.setItemAnimator(null);
        this.f78397b1.setDescendantFocusability(131072);
        this.f78403e1 = view.findViewById(AbstractC6918a0.layoutNewFeedNotify);
        this.f78405f1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_new_feed_notify);
        this.f78409j1 = (TabsControlLayout) view.findViewById(AbstractC6918a0.tab_control_layout);
        this.f78408i1 = (ZdsTabBar) view.findViewById(AbstractC6918a0.tab_control);
        this.f78385V0.m128758v(AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeline_tab_main_title));
        this.f78385V0.m128741i("timeline_tab_main_click");
        this.f78387W0.m128758v(AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeline_tab_other_title));
        this.f78387W0.m128741i("timeline_tab_other_click");
        this.f78408i1.m91302L(this.f78385V0);
        this.f78408i1.m91302L(this.f78387W0);
        this.f78408i1.m91301J(0, false);
        this.f78408i1.m91305S();
        this.f78408i1.setOnItemClickListener(new ZdsTabBar.InterfaceC17059e() { // from class: com.zing.zalo.ui.zviews.bs0
            public /* synthetic */ bs0() {
            }

            @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.InterfaceC17059e
            /* renamed from: i0 */
            public final void mo87275i0(RecyclerView recyclerView, int i11, View view2) {
                TimelineView.this.m85244UO(recyclerView, i11, view2);
            }
        });
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f78407h1 = multiStateView;
        multiStateView.setEnableSwapStateAnim(false);
        this.f78407h1.setEnableRecommend(true);
        this.f78407h1.setEnableBtnFullEmpty(false);
        this.f78407h1.setEnableImageFullEmpty(false);
        this.f78407h1.setEnableBtnEmpty(true);
        this.f78407h1.setCallbackVisibilityChange(new MultiStateView.InterfaceC15917h() { // from class: com.zing.zalo.ui.zviews.cs0
            public /* synthetic */ cs0() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15917h
            /* renamed from: a */
            public final void mo87280a(int i11) {
                TimelineView.this.m85247VO(i11);
            }
        });
        this.f78407h1.setLoadingLayoutResourceId(AbstractC7409c0.layout_time_line_loading_state);
        TimelineSkeletonView timelineSkeletonView = (TimelineSkeletonView) this.f78407h1.getLoadingView();
        if (timelineSkeletonView != null) {
            timelineSkeletonView.setSkeletonLayoutType(1);
        }
        this.f78406g1 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.slide_in_from_top);
        this.f78412m1 = new C15190d0(viewGroup, this.f78397b1);
        this.f78397b1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.ds0
            public /* synthetic */ ds0() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m85251WO;
                m85251WO = TimelineView.this.m85251WO(view2, motionEvent);
                return m85251WO;
            }
        });
        FeedActionZUtils.m47519G(this.f78369J1, m92676n2());
        if (this.f78417r1) {
            m85379EO();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: GI */
    public void mo11920GI(C3000l0 c3000l0) {
        if (c3000l0 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C20637a c20637a = new C20637a();
        c20637a.m107548l(c3000l0);
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(9);
        bottomSheetMenuBundleData.m45507h(c20637a);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1014, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.home_timeline, viewGroup, false);
        m85380FO(inflate);
        m85180GO();
        m85291gQ();
        m85282eQ();
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: HA */
    public void mo11921HA(C3000l0 c3000l0, int i11) {
        C0815e1.m2075D().m2100V(new C23648e(22, "", 0, "social_hidecard_unsubcribe", new String[0]), false);
        this.f78421v1.m15179o4(c3000l0, c3000l0.m14324b0(i11), new TrackingSource(105));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
            if (abstractC25848a2 != null) {
                abstractC25848a2.m133394E0();
                this.f78391Y0.m133419v1();
                try {
                    this.f78391Y0.m10000K(this.f78393Z0);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            if (this.f78397b1 != null) {
                this.f78401d1.setRefreshing(false);
            }
            C22021e0.m114963p().m114983f();
            m85407nR();
            this.f78376Q1.removeCallbacksAndMessages(null);
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        try {
            if (this.f78397b1 != null) {
                this.f78401d1.setRefreshing(false);
            }
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67703pN(this);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: JQ */
    public void m85381JQ() {
        SwipeRefreshListView swipeRefreshListView = this.f78401d1;
        if (swipeRefreshListView == null) {
            return;
        }
        this.f78363D1 = true;
        swipeRefreshListView.m88200I(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.zt0
            public /* synthetic */ zt0() {
            }

            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                TimelineView.this.m85204LP();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: KG */
    public void mo11924KG() {
        if (C24355e0.f117560a.m127362p()) {
            m85283eR();
            return;
        }
        C17487o0 c17487o0 = null;
        C0732w.Companion.m1189a().m1187q("click_fpf_greeting", "", null, null);
        if (m92676n2() != null) {
            c17487o0 = m92676n2().mo35579p();
        }
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_ACTION", "4902");
            bundle.putBoolean("extra_from_feed_remind", true);
            bundle.putBoolean("EXTRA_ALLOW_RESTORE_LAST_COMPOSE", true);
            bundle.putString("extra_tracking_source", new TrackingSource(1).m40686z());
            c17487o0.m93069k2(UpdateStatusView.class, bundle, 1, true);
            C29630g.m147299E0().m147319V0();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 22);
        C23744a.m124114c().m124117e(this, 28);
        C23744a.m124114c().m124117e(this, 44);
        C23744a.m124114c().m124117e(this, 88);
        C23744a.m124114c().m124117e(this, 116);
        C23744a.m124114c().m124117e(this, 50);
        C23744a.m124114c().m124117e(this, 54);
        C23744a.m124114c().m124117e(this, 5100);
        C23744a.m124114c().m124117e(this, 5110);
        C23744a.m124114c().m124117e(this, 5111);
        C23744a.m124114c().m124117e(this, 5113);
        C23744a.m124114c().m124117e(this, 3005);
        C23744a.m124114c().m124117e(this, 6006);
        C23744a.m124114c().m124117e(this, 6014);
        C23744a.m124114c().m124117e(this, 6043);
        C23744a.m124114c().m124117e(this, 6061);
        C23744a.m124114c().m124117e(this, 115);
        C23744a.m124114c().m124117e(this, 5118);
        C23744a.m124114c().m124117e(this, 10036);
        C23744a.m124114c().m124117e(this, 6079);
        C23744a.m124114c().m124117e(this, 6082);
        C23744a.m124114c().m124117e(this, 6083);
        C23744a.m124114c().m124117e(this, 6092);
        C23744a.m124114c().m124117e(this, 6097);
        C23744a.m124114c().m124117e(this, 6101);
    }

    /* renamed from: KQ */
    void m85382KQ(int i11) {
        this.f78376Q1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.es0
            public /* synthetic */ es0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.m85208MP();
            }
        }, i11);
    }

    /* renamed from: LQ */
    public void m85383LQ() {
        if (this.f72421L0.getContext() == null) {
            return;
        }
        if (this.f78402d2 != null) {
            this.f72421L0.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f78402d2);
        }
        if (this.f78404e2 != null) {
            this.f72421L0.getContext().getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.f78404e2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2263e
    /* renamed from: N4 */
    public void mo11979N4(String str) {
        this.f78422w1.m140000s0(str, C32002l4.m154264g(10002));
    }

    /* renamed from: NQ */
    public void m85216OO(C3020p0 c3020p0, int i11, String str) {
        String str2;
        String str3;
        if (c3020p0 != null) {
            try {
                if (c3020p0.f12057p != null && (str2 = c3020p0.f12022B.f12280b) != null && !str2.equals(CoreUtility.f89233i) && C23055e5.m118272g(true)) {
                    if (c3020p0.m14518m0()) {
                        str3 = "6";
                    } else {
                        str3 = "7";
                    }
                    String str4 = str3;
                    mo46829Y();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15198l());
                    c0766k.mo1787ya(c3020p0.f12022B.f12280b, str4, c3020p0.f12057p, "", i11, str);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: O */
    public void mo11927O() {
        m85382KQ(300);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Ou */
    public void mo11928Ou(String str, String str2, TrackingSource trackingSource, C32002l4 c32002l4) {
        C31877d c31877d = new C31877d(trackingSource);
        c31877d.m153184c(c32002l4);
        m78959pL(str, str2, 0, c31877d);
    }

    /* renamed from: PQ */
    public void m85385PQ() {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m133421y1();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Q2 */
    public void mo11930Q2(C3020p0 c3020p0, C32002l4 c32002l4) {
        this.f78421v1.m15168c4(c3020p0, c32002l4);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: R5 */
    public void mo11931R5(C3020p0 c3020p0) {
        String str;
        C3025q0 c3025q0;
        try {
            InterfaceC27218a m92676n2 = m92676n2();
            String str2 = "";
            if (c3020p0 == null || (c3025q0 = c3020p0.f12023C) == null) {
                str = "";
            } else {
                str = c3025q0.f12101J;
            }
            if (c3020p0 != null) {
                str2 = c3020p0.m14465A();
            }
            if (m92676n2 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Bundle bundle = new Bundle();
                bundle.putString("fid", str);
                bundle.putString("ownerId", str2);
                bundle.putString("extra_entry_point_flow", C32002l4.m154265h(10002, 12).m154277l());
                m92676n2.mo35579p().m93069k2(FeedDetailsView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f78381T0 = false;
        this.f78391Y0.m133420x1();
        try {
            C23744a.m124114c().m124117e(this, 6073);
            if (this.f78417r1) {
                AbstractC22055v0.m115142c0(m85408oO(), false);
            }
            C26333b.f125013a.m135515e();
            C28905e.m144373n().m144391j(C23793c.m124316k().mo124311f());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            File file = this.f78379S0;
            if (file != null) {
                bundle.putString("cameraImageUri", file.toString());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: T7 */
    public void mo11935T7(C3000l0 c3000l0, int i11) {
        this.f78421v1.m15178n4(c3000l0, c3000l0.m14324b0(i11), new TrackingSource(5));
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Tt */
    public void mo11936Tt(C16719g c16719g, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
        if (m92676n2() != null && m92676n2().mo35579p() != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            m85344sR(c3000l0, bundle2);
            FeedActionZUtils.m47525M(c16719g, c3000l0, i11, m92676n2().mo35579p(), bundle2, 68, 12, z11, C32002l4.m154264g(10002));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m85227QQ();
        if (!CoreUtility.f89239o) {
            m85317mR();
            C23744a.m124114c().m124116d(5118, new Object[0]);
        }
        C13306b m85303jO = m85303jO();
        if (m85303jO != null) {
            m85303jO.m74697c(this.f78360A1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: UL */
    public void mo78939UL(String str) {
        if ("action.follow.oa".equals(str) || "action.unfollow.oa".equals(str)) {
            m85382KQ(300);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: UN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m85386UN(C3000l0 c3000l0, View view) {
        FeedItemSuggestOA feedItemSuggestOA;
        FeedItemZInstantAds feedItemZInstantAds;
        C3025q0.c cVar;
        C3025q0.d dVar;
        Exception e11;
        if (view == null) {
            return;
        }
        FeedItemGroupHorizontal feedItemGroupHorizontal = null;
        r3 = null;
        r3 = null;
        C3025q0.d dVar2 = null;
        r3 = null;
        r3 = null;
        FeedItemSuggestMultiItems feedItemSuggestMultiItems = null;
        feedItemGroupHorizontal = null;
        feedItemGroupHorizontal = null;
        if (c3000l0.m14295G0()) {
            int i11 = c3000l0.f11893p;
            if (i11 == 16) {
                C3020p0 m14324b0 = c3000l0.m14324b0(0);
                if ((view instanceof FeedItemSuggestOA) && (this.f78397b1.m9823C0(view) instanceof AbstractC25881j.a) && ((AbstractC25881j.a) this.f78397b1.m9823C0(view)).f123440A0.equals(c3000l0.f11895q)) {
                    feedItemSuggestOA = (FeedItemSuggestOA) view;
                } else {
                    feedItemSuggestOA = null;
                }
                if ((view instanceof FeedItemZInstantAds) && (this.f78397b1.m9823C0(view) instanceof AbstractC25881j.a) && ((AbstractC25881j.a) this.f78397b1.m9823C0(view)).f123440A0.equals(c3000l0.f11895q)) {
                    feedItemZInstantAds = (FeedItemZInstantAds) view;
                } else {
                    feedItemZInstantAds = null;
                }
                if (feedItemSuggestOA != null) {
                    try {
                    } catch (Exception e12) {
                        e11 = e12;
                        AbstractC23350e.m122778h(e11);
                        if (dVar2 == null) {
                        }
                    }
                    if (feedItemSuggestOA.getPager() != null && (cVar = m14324b0.f12023C.f12135z) != null) {
                        dVar = (C3025q0.d) cVar.f12156g.get(feedItemSuggestOA.getPager().getCurrentItem());
                        dVar2 = dVar;
                        if (dVar2 == null) {
                            if ((view.getTop() + view.getBottom() > view.getHeight() && this.f78397b1.getHeight() - view.getTop() > view.getHeight()) || (view.getTop() < 0 && view.getBottom() > this.f78397b1.getHeight())) {
                                FeedActionZUtils.m47521I(m14324b0, dVar2, 10);
                            }
                            if (view.getTop() + view.getBottom() > view.getHeight() * 0.5f && this.f78397b1.getHeight() - view.getTop() > view.getHeight() * 0.5f) {
                                FeedActionZUtils.m47521I(m14324b0, dVar2, 50);
                            } else {
                                FeedActionZUtils.m47555m(m14324b0, dVar2);
                            }
                            if (view.getBottom() > 0 || view.getTop() < this.f78397b1.getHeight()) {
                                FeedActionZUtils.m47521I(m14324b0, dVar2, 40);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (feedItemZInstantAds != null && feedItemZInstantAds.m44281j()) {
                    dVar = new C3025q0.d();
                    try {
                        dVar.f12174e = m14324b0.f12039S;
                        dVar2 = dVar;
                    } catch (Exception e13) {
                        dVar2 = dVar;
                        e11 = e13;
                        AbstractC23350e.m122778h(e11);
                        if (dVar2 == null) {
                        }
                    }
                }
                if (dVar2 == null) {
                }
            } else {
                if (i11 != 14 && i11 != 13) {
                    C3020p0 m14324b02 = c3000l0.m14324b0(0);
                    if (m14324b02 != null && (this.f78397b1.m9823C0(view) instanceof AbstractC25881j.a)) {
                        boolean z11 = view instanceof FeedItemSuggestBanner;
                        if (((AbstractC25881j.a) this.f78397b1.m9823C0(view)).f123440A0.equals(c3000l0.f11895q) && z11) {
                            if (view.getTop() + view.getBottom() > view.getHeight() * 0.8f && this.f78397b1.getHeight() - view.getTop() > view.getHeight() * 0.8f) {
                                FeedActionZUtils.m47520H(m14324b02, 10);
                            }
                            if (view.getTop() + view.getBottom() > view.getHeight() * 0.5f && this.f78397b1.getHeight() - view.getTop() > view.getHeight() * 0.5f) {
                                FeedActionZUtils.m47520H(m14324b02, 50);
                            } else {
                                FeedActionZUtils.m47554l(m14324b02);
                            }
                            if (view.getBottom() > 0 || view.getTop() < this.f78397b1.getHeight()) {
                                FeedActionZUtils.m47520H(m14324b02, 40);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                C3020p0 m14324b03 = c3000l0.m14324b0(0);
                if ((view instanceof FeedItemSuggestMultiItems) && (this.f78397b1.m9823C0(view) instanceof AbstractC25881j.a) && ((AbstractC25881j.a) this.f78397b1.m9823C0(view)).f123440A0.equals(c3000l0.f11895q)) {
                    feedItemSuggestMultiItems = (FeedItemSuggestMultiItems) view;
                }
                if (feedItemSuggestMultiItems != null && ((feedItemSuggestMultiItems.getTop() + feedItemSuggestMultiItems.getBottom() > feedItemSuggestMultiItems.getHeight() && this.f78397b1.getHeight() - feedItemSuggestMultiItems.getTop() > feedItemSuggestMultiItems.getHeight()) || (feedItemSuggestMultiItems.getTop() < 0 && feedItemSuggestMultiItems.getBottom() > this.f78397b1.getHeight()))) {
                    FeedActionZUtils.m47521I(m14324b03, (C3025q0.d) m14324b03.f12023C.f12135z.f12156g.get(feedItemSuggestMultiItems.getPager().getCurrentItem()), 10);
                }
                if (feedItemSuggestMultiItems != null) {
                    C3025q0.d dVar3 = (C3025q0.d) m14324b03.f12023C.f12135z.f12156g.get(feedItemSuggestMultiItems.getPager().getCurrentItem());
                    if (feedItemSuggestMultiItems.getTop() + feedItemSuggestMultiItems.getBottom() > feedItemSuggestMultiItems.getHeight() * 0.5f && this.f78397b1.getHeight() - feedItemSuggestMultiItems.getTop() > feedItemSuggestMultiItems.getHeight() * 0.5f) {
                        FeedActionZUtils.m47521I(m14324b03, dVar3, 50);
                    } else {
                        FeedActionZUtils.m47555m(m14324b03, dVar3);
                    }
                }
                if (feedItemSuggestMultiItems != null) {
                    if (feedItemSuggestMultiItems.getBottom() > 0 || feedItemSuggestMultiItems.getTop() < this.f78397b1.getHeight()) {
                        FeedActionZUtils.m47521I(m14324b03, (C3025q0.d) m14324b03.f12023C.f12135z.f12156g.get(feedItemSuggestMultiItems.getPager().getCurrentItem()), 40);
                    }
                }
            }
        } else if (c3000l0.m14283B0()) {
            if ((view instanceof FeedItemGroupHorizontal) && (this.f78397b1.m9823C0(view) instanceof AbstractC25881j.a) && ((AbstractC25881j.a) this.f78397b1.m9823C0(view)).f123440A0.equals(c3000l0.f11895q)) {
                feedItemGroupHorizontal = (FeedItemGroupHorizontal) view;
            }
            if (feedItemGroupHorizontal != null && feedItemGroupHorizontal.getTop() + feedItemGroupHorizontal.getBottom() > feedItemGroupHorizontal.getHeight() * 0.8f && this.f78397b1.getHeight() - feedItemGroupHorizontal.getTop() > feedItemGroupHorizontal.getHeight() * 0.8f) {
                FeedActionZUtils.m47520H(c3000l0.m14324b0(feedItemGroupHorizontal.getPager().getCurrentItem()), 10);
            }
        }
    }

    /* renamed from: UQ */
    public void m85387UQ(String str, int i11) {
        String str2;
        if (this.f78394Z1) {
            return;
        }
        TrackingSource m114310H = C21927m.m114302u().m114310H(str);
        if (m114310H == null) {
            str2 = "";
        } else {
            str2 = m114310H.m40682o();
        }
        this.f78394Z1 = true;
        this.f78396a2.mo1704o8(this.f78398b2);
        this.f78396a2.mo1620d7(str, "", i11, str2);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f78380S1;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f78380S1.dismiss();
        }
        this.f78391Y0.m133391B1();
        this.f78381T0 = false;
        ZaloView m93012K0 = m92676n2().mo35579p().m93012K0();
        if (m93012K0 == null || !(m93012K0 instanceof StoryDetailsView)) {
            ZMediaPlayer.setStopAllUrlCaching(ZMediaPlayerSettings.getVideoConfig(2));
        }
        C13306b m85303jO = m85303jO();
        if (m85303jO != null) {
            m85303jO.m74701i();
        }
    }

    /* renamed from: VN */
    void m85388VN() {
        C15190d0 c15190d0;
        C3000l0 c3000l0;
        try {
            if (this.f78391Y0 != null && (c15190d0 = this.f78412m1) != null && c15190d0.m94387a() == 0) {
                int m9740Y1 = this.f78399c1.m9740Y1();
                int m9745c2 = this.f78399c1.m9745c2();
                if (m9740Y1 >= 0 && m9740Y1 < m9745c2) {
                    while (m9740Y1 <= m9745c2) {
                        C2966e1 m133530P = this.f78391Y0.m133530P(m9740Y1);
                        if (m133530P != null && (c3000l0 = m133530P.f11703a) != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().f12058q == 6) {
                            this.f78391Y0.m10008p();
                        }
                        m9740Y1++;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x006d, code lost:            if (r3.equals("tip.timeline.compose") == false) goto L106;     */
    /* renamed from: WN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m85389WN(String str) {
        View view;
        boolean z11;
        C3426e m85408oO;
        List m85341sO = m85341sO();
        for (int i11 = 0; i11 < m85341sO.size(); i11++) {
            String str2 = (String) m85341sO.get(i11);
            if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                if (m141453i != null && m141453i.m142167f()) {
                    view = m85413tO(str2);
                } else {
                    view = null;
                }
                char c11 = 1;
                if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1883904404:
                        if (str2.equals("tip.pushfeed.album")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -818769448:
                        break;
                    case -27876251:
                        if (str2.equals("tip.timeline.notification")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 58991295:
                        if (str2.equals("tip.timeline.createstory")) {
                            c11 = 3;
                            break;
                        }
                        break;
                }
                c11 = 65535;
                switch (c11) {
                    case 0:
                        m85192IQ();
                        break;
                    case 1:
                        if (view != null && (view instanceof ActionBarMenuItem)) {
                            ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) view;
                            AbstractC28045d8.m141481b(actionBarMenuItem.getIconView(), m141453i, this.f78411l1, AbstractC16803z.icon_header_newpost);
                            actionBarMenuItem.setEnableNoti(z11);
                            break;
                        }
                        break;
                    case 2:
                        if (view != null && (view instanceof RedDotImageButton)) {
                            RedDotImageButton redDotImageButton = (RedDotImageButton) view;
                            AbstractC28045d8.m141481b(redDotImageButton, m141453i, this.f78411l1, AbstractC16803z.icon_header_notification);
                            redDotImageButton.setEnableNoti(z11);
                            break;
                        }
                        break;
                    case 3:
                        if (m141453i != null && m141453i.m142167f() && m141453i.f131579e && (m85408oO = m85408oO()) != null) {
                            m85408oO.m17188m(0);
                        }
                        if (view != null && (view instanceof StoryBarBtnAdd)) {
                            ((StoryBarBtnAdd) view).setVisibilityRedDot(z11);
                            break;
                        }
                        break;
                }
            }
        }
    }

    /* renamed from: WQ */
    public void m85390WQ(AbstractC25848a2 abstractC25848a2) {
        this.f78391Y0 = abstractC25848a2;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: X */
    public void mo11940X(C3000l0 c3000l0) {
        boolean z11;
        String m118743r0;
        String m118743r02;
        int i11;
        String str;
        if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().m14488S()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_remove_local_edit_feed_v2);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_failed_feed);
        }
        if (z11) {
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_local_edit_feed);
        } else {
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete);
        }
        if (z11) {
            i11 = AbstractC8020f0.str_uncancel;
        } else {
            i11 = AbstractC8020f0.str_cancel;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(i11);
        if (c3000l0 != null) {
            str = c3000l0.f11895q;
        } else {
            str = "";
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(7).m43162k(m118743r0).m43165n(m118743r03, new InterfaceC17463d.b()).m43170s(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.os0

            /* renamed from: p */
            public final /* synthetic */ String f81506p;

            public /* synthetic */ os0(String str2) {
                r1 = str2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                TimelineView.m85186HP(r1, interfaceC17463d, i12);
            }
        });
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f78380S1;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
        C8009j m43152a = aVar.m43152a();
        this.f78380S1 = m43152a;
        m85249VQ(m43152a);
        this.f78380S1.mo13822K();
    }

    /* renamed from: XN */
    public void m85391XN(String str, int i11) {
        boolean z11;
        try {
            if (!m92672lJ() || this.f72421L0.mo60294yp() || MainTabView.m67645lM() == null || MainTabView.m67645lM().m67696kM() != C24099q0.m125958k().m125977u() || MainTabView.m67645lM().f63219I1.m74707p()) {
                return;
            }
            Iterator it = AbstractC28025b8.m141457m((String[]) m85341sO().toArray(new String[0])).iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c))) {
                    if (i11 == -1 || c28212v6.f131575a == i11) {
                        View m85413tO = m85413tO(c28212v6.f131577c);
                        if (m85413tO != null) {
                            if (TextUtils.equals(c28212v6.f131577c, "tip.timeline.footerzaloconnect")) {
                                C13306b m85303jO = m85303jO();
                                if (TextUtils.equals(str, "tip.timeline.footerzaloconnect") && m85303jO != null) {
                                    C13306b.m74680h("tip.timeline.footerzaloconnect");
                                    m85303jO.m74700f(str, Boolean.TRUE);
                                }
                            } else if (!c28212v6.f131594t && !z12 && m85413tO.isShown()) {
                                this.f78425z1 = new ShowcaseView(m85413tO.getContext());
                                C26203c m134769a = C26203c.m134769a(m85413tO.getContext());
                                m134769a.m134770b(c28212v6, m85413tO.getContext());
                                m134769a.f124524o = m85413tO;
                                if (m85401iO() != null && m85401iO().m45029g(c28212v6.f131577c)) {
                                    m134769a.f124507D = EnumC26202b.TOP;
                                } else {
                                    String str2 = c28212v6.f131577c;
                                    if (str2.hashCode() == 58991295 && str2.equals("tip.timeline.createstory")) {
                                        m134769a.f124513d = -AbstractC23136l9.m118742r(6.0f);
                                        m134769a.f124519j = 19;
                                    }
                                    m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                                }
                                if (m85401iO() != null && m85401iO().m45029g(c28212v6.f131577c)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                m85260ZN();
                                if (z11) {
                                    m85313lR(c28212v6, m85413tO, null);
                                } else {
                                    this.f78425z1.setConfigs(m134769a);
                                    this.f78425z1.setShowcaseId(c28212v6.f131577c);
                                    this.f78425z1.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: com.zing.zalo.ui.zviews.ns0

                                        /* renamed from: b */
                                        public final /* synthetic */ C28212v6 f81384b;

                                        public /* synthetic */ ns0(C28212v6 c28212v62) {
                                            r2 = c28212v62;
                                        }

                                        @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                                        /* renamed from: a */
                                        public final void mo39159a(ShowcaseView showcaseView, int i12, int i13, boolean z13) {
                                            TimelineView.this.m85195JO(r2, showcaseView, i12, i13, z13);
                                        }
                                    });
                                    this.f78425z1.setShowcaseManager(MainTabView.m67645lM().f63219I1);
                                    this.f78425z1.m74637r();
                                }
                                z12 = true;
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: XQ */
    public void m85392XQ(RecyclerView recyclerView) {
        this.f78397b1 = recyclerView;
    }

    /* renamed from: YN */
    public void m85393YN() {
        C15190d0 c15190d0;
        C3000l0 c3000l0;
        try {
            if (this.f78391Y0 != null && (c15190d0 = this.f78412m1) != null && c15190d0.m94387a() != 2) {
                int m9740Y1 = this.f78399c1.m9740Y1();
                int m9745c2 = this.f78399c1.m9745c2();
                Map synchronizedMap = Collections.synchronizedMap(new HashMap());
                if (m9740Y1 >= 0 && m9740Y1 <= m9745c2) {
                    while (m9740Y1 < m9745c2) {
                        C2966e1 m133530P = this.f78391Y0.m133530P(m9740Y1);
                        if (m133530P != null && m133530P.f11705c == 69 && (c3000l0 = m133530P.f11703a) != null) {
                            C3020p0 m14322a0 = c3000l0.m14322a0();
                            View mo9732P = this.f78399c1.mo9732P(m9740Y1);
                            if (m14322a0 != null && (mo9732P instanceof SuggestCommentView) && ((SuggestCommentView) mo9732P).m47445f()) {
                                synchronizedMap.put(Integer.valueOf(m9740Y1), m14322a0);
                                synchronized (this.f78370K1) {
                                    try {
                                        if (!this.f78370K1.containsKey(Integer.valueOf(m9740Y1))) {
                                            this.f78370K1.put(Integer.valueOf(m9740Y1), m14322a0);
                                            C26333b.f125013a.m135520p(m14322a0, 2, m85331qO(), Integer.valueOf(((SuggestCommentView) mo9732P).getContentType()), Integer.valueOf(m14322a0.f12058q), new C20803k(-1, m14322a0.f12057p));
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                        m9740Y1++;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this.f78370K1.entrySet()) {
                    int intValue = ((Integer) entry.getKey()).intValue();
                    C3020p0 c3020p0 = (C3020p0) entry.getValue();
                    if (!synchronizedMap.containsKey(Integer.valueOf(intValue))) {
                        arrayList.add(Integer.valueOf(intValue));
                        if (c3020p0 != null) {
                            C26333b.f125013a.m135518n(c3020p0.f12057p, 2);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f78370K1.remove(Integer.valueOf(((Integer) it.next()).intValue()));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: YQ */
    public void m85394YQ(boolean z11) {
        if (z11 != C29116a.f134962a.mo117210a()) {
            mo11950cx();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Yk */
    public void mo11941Yk(AnimationTarget animationTarget, String str, Bundle bundle, C20275e c20275e, C3020p0 c3020p0, TrackingSource trackingSource, boolean z11) {
        FeedActionZUtils.m47533U(animationTarget, this.f78411l1, str, bundle, c20275e, 10000, this, c3020p0, m92676n2(), trackingSource, z11, 12, C32002l4.m154264g(10002));
        m85269bQ(c3020p0);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Ys */
    public void mo11942Ys(C3000l0 c3000l0, String str, boolean z11) {
        Bundle bundle = new Bundle();
        C20637a c20637a = new C20637a();
        c20637a.m107550n(str);
        c20637a.m107548l(c3000l0);
        c20637a.m107552p(z11);
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(1);
        bottomSheetMenuBundleData.m45507h(c20637a);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", str);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1014, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67669FN(C24099q0.m125958k().m125977u());
            MainTabView.m67645lM().m67668CN(C24099q0.m125958k().m125977u());
            MainTabView.m67645lM().m67672IL(this);
        }
        this.f78421v1.m15161Z3();
    }

    /* renamed from: ZQ */
    void m85395ZQ(C3020p0 c3020p0, boolean z11, TrackingSource trackingSource) {
        if (c3020p0 != null) {
            KeyEventCallbackC17462c m118458k = AbstractC23093i.m118458k(this.f72421L0.m92648SI(), m85351uO(c3020p0), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zs0

                /* renamed from: q */
                public final /* synthetic */ C3020p0 f82873q;

                /* renamed from: r */
                public final /* synthetic */ boolean f82874r;

                /* renamed from: s */
                public final /* synthetic */ TrackingSource f82875s;

                public /* synthetic */ zs0(C3020p0 c3020p02, boolean z112, TrackingSource trackingSource2) {
                    r2 = c3020p02;
                    r3 = z112;
                    r4 = trackingSource2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    TimelineView.this.m85217OP(r2, r3, r4, interfaceC17463d, i11);
                }
            });
            this.f78380S1 = m118458k;
            m85249VQ(m118458k);
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f78380S1;
            if (keyEventCallbackC17462c != null) {
                keyEventCallbackC17462c.mo13822K();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Zf */
    public void mo11944Zf(C3000l0 c3000l0) {
        this.f78423x1.m104573O(c3000l0);
    }

    /* renamed from: aO */
    public void m85396aO(C3020p0 c3020p0, int i11) {
        m85397bO(c3020p0, false, i11);
    }

    /* renamed from: bO */
    void m85397bO(C3020p0 c3020p0, boolean z11, int i11) {
        if (c3020p0 == null) {
            return;
        }
        mo46829Y();
        int m14515l = c3020p0.m14515l();
        long m14517m = c3020p0.m14517m();
        int m14513k = c3020p0.m14513k();
        this.f78374O1 = new C15196j(c3020p0);
        if (this.f78373N1 == null) {
            this.f78373N1 = new C0766k();
        }
        this.f78373N1.mo1704o8(this.f78374O1);
        this.f78373N1.mo1464Ja(m14515l, m14517m, z11 ? 1 : 0, m14517m, 0, m14513k);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: bw */
    public void mo11947bw(C3000l0 c3000l0) {
        this.f78423x1.m104574P(c3000l0);
    }

    /* renamed from: cO */
    public void m85398cO(C3020p0 c3020p0, int i11) {
        m85397bO(c3020p0, true, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: cx */
    public void mo11950cx() {
        C29116a c29116a = C29116a.f134962a;
        c29116a.mo117211b(!c29116a.mo117210a());
        boolean mo117210a = c29116a.mo117210a();
        C26356e.f125201a.m135683j(mo117210a);
        C24390b.f117764a.m127575f(mo117210a);
        C23744a.m124114c().m124116d(5118, new Object[0]);
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return m85294hO();
    }

    /* renamed from: dR */
    public void m85399dR(String str) {
        if (m92676n2() != null && !m92676n2().isFinishing() && m92687sJ()) {
            ToastUtils.showMess(str);
        }
    }

    /* renamed from: fR */
    public void m85400fR(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        m92639EK(1200, new C8848a.a(new C8848a.b(i11, i12, i13), new C8848a.c(list), interfaceC2333h));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f78359f2;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: gn */
    public void mo11955gn(C3020p0 c3020p0) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        if (c3020p0 != null) {
            bundle.putString("EXTRA_FEED_ID", c3020p0.f12057p);
            bundle.putInt("EXTRA_MODE", 0);
            bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 355);
            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", C32002l4.m154264g(10002).m154277l());
            bundle.putString("EXTRA_FEED_OWNER_ID", c3020p0.m14465A());
        }
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(FeedReactionBottomSheet.class, bundle, 0, 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: iM */
    public int mo46047iM() {
        return 1;
    }

    /* renamed from: iO */
    TimelineFpfEntry m85401iO() {
        if (this.f78397b1 != null) {
            for (int i11 = 0; i11 < this.f78397b1.getChildCount(); i11++) {
                View childAt = this.f78397b1.getChildAt(i11);
                if (childAt != null && (childAt instanceof TimelineFpfEntry)) {
                    return (TimelineFpfEntry) childAt;
                }
            }
            return null;
        }
        return null;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
        if (c3000l0 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_INT_REQUEST_CODE", 10014);
        bundle.putInt("fromTimelineTab", c3000l0.f11896q0);
        C20043e.m104032w(m92676n2(), c3000l0.m14324b0(i11), c17391z, i12, bundle, C32002l4.m154264g(10002));
        AbstractC23647d.m123897g("136100");
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: jM */
    public int mo79521jM(Class cls) {
        if (ProfileAlbumDetailView.class.isAssignableFrom(cls)) {
            return 1015;
        }
        return super.mo79521jM(cls);
    }

    /* renamed from: jR */
    void m85402jR(String str, int i11) {
        try {
            m85273cQ(str, i11).m88019B();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: ji */
    public void mo11958ji(String str) {
        Bundle bundle = new Bundle();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(2);
        bottomSheetMenuBundleData.m45512m(str);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1014, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: kM */
    public FeedActionZUtils.InterfaceC8913k mo79522kM() {
        if (this.f78368I1 == null) {
            this.f78368I1 = new C15193g();
        }
        return this.f78368I1;
    }

    /* renamed from: kO */
    MainTabView m85403kO() {
        return MainTabView.m67645lM();
    }

    /* renamed from: kR */
    void m85404kR(String str, String str2) {
        Snackbar m85273cQ = m85273cQ(str, 0);
        TextView textView = (TextView) m85273cQ.m88025i().findViewById(AbstractC6918a0.snackbar_text);
        textView.setMaxLines(3);
        m85273cQ.m88018A(C20832y0.f102396a.m108877e(new C20832y0.a(str, textView.getTextSize(), null), str2, ((AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(24.0f) * 2)) - (AbstractC23136l9.m118742r(12.0f) * 2)) - (AbstractC23136l9.m118742r(12.0f) * 2), 3, C20832y0.b.f102402q));
        m85273cQ.m88019B();
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2263e
    /* renamed from: kb */
    public void mo11980kb(String str, String str2) {
        this.f78422w1.m140001t0(str, str2);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: kf */
    public void mo11960kf(View view, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
        if (m92676n2() != null && m92676n2().mo35579p() != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            m85344sR(c3000l0, bundle2);
            FeedActionZUtils.m47524L(view, c3000l0, i11, m92676n2().mo35579p(), bundle2, 68, 12, z11, C32002l4.m154264g(10002));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: kq */
    public void mo11961kq(C3000l0 c3000l0, int i11) {
        if (c3000l0 == null) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(22, "", 0, "social_hidecard_close", new String[0]), false);
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 != null && this.f78391Y0 != null && this.f72827B0 != null) {
            this.f78421v1.m15174i4(m14324b0);
            this.f78391Y0.m133407L1(c3000l0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: lw */
    public void mo11962lw(int i11) {
        C15190d0 c15190d0;
        boolean z11;
        int i12;
        C3000l0 c3000l0;
        boolean z12;
        String str;
        View view;
        FeedItemSuggestFriends feedItemSuggestFriends;
        try {
            if (this.f78391Y0 != null && (c15190d0 = this.f78412m1) != null && c15190d0.m94387a() != 2) {
                int m9740Y1 = this.f78399c1.m9740Y1();
                int m9745c2 = this.f78399c1.m9745c2();
                if (m9740Y1 >= 0 && m9740Y1 <= m9745c2) {
                    if (this.f78391Y0.m133530P(m9740Y1) != null && this.f78391Y0.m133530P(m9740Y1).f11703a != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    String str2 = "";
                    C3000l0 c3000l02 = null;
                    int i13 = 0;
                    int i14 = 0;
                    boolean z13 = false;
                    int i15 = 0;
                    while (m9740Y1 <= m9745c2) {
                        C2966e1 m133530P = this.f78391Y0.m133530P(m9740Y1);
                        if (m133530P != null && (c3000l0 = m133530P.f11703a) != null) {
                            if (c3000l0.m14297H0()) {
                                m85386UN(c3000l0, this.f78399c1.mo9732P(m9740Y1));
                            } else if (c3000l0.f11893p == 1000) {
                                View mo9732P = this.f78399c1.mo9732P(m9740Y1);
                                if (mo9732P != null) {
                                    if ((mo9732P instanceof FeedItemSuggestFriends) && (this.f78397b1.m9823C0(mo9732P) instanceof AbstractC25881j.a) && ((AbstractC25881j.a) this.f78397b1.m9823C0(mo9732P)).f123440A0.equals(c3000l0.f11895q)) {
                                        feedItemSuggestFriends = (FeedItemSuggestFriends) mo9732P;
                                    } else {
                                        feedItemSuggestFriends = null;
                                    }
                                    if (feedItemSuggestFriends != null && feedItemSuggestFriends.getTop() + feedItemSuggestFriends.getBottom() > feedItemSuggestFriends.getHeight() * 0.8f && this.f78397b1.getHeight() - feedItemSuggestFriends.getTop() > feedItemSuggestFriends.getHeight() * 0.8f) {
                                        feedItemSuggestFriends.m44130d();
                                    }
                                }
                            } else {
                                if (m9740Y1 == m9745c2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (c3000l0.m14322a0() == null) {
                                    str = "";
                                } else {
                                    str = c3000l0.m14322a0().f12057p;
                                }
                                View mo9732P2 = this.f78399c1.mo9732P(m9740Y1);
                                if (mo9732P2 instanceof FeedItemGroupHorizontal) {
                                    i13 = c3000l0.f11886i0;
                                }
                                int i16 = i13;
                                if (TextUtils.equals(str, str2)) {
                                    if (mo9732P2 != null) {
                                        i14 += Math.min(mo9732P2.getBottom(), this.f78397b1.getHeight()) - Math.max(0, mo9732P2.getTop());
                                        i15 += mo9732P2.getBottom() - mo9732P2.getTop();
                                    }
                                    z13 = z12;
                                } else {
                                    if (!TextUtils.isEmpty(str2) && c3000l02 != null) {
                                        if (z11) {
                                            if (c3000l02.f11859H == 0.0f) {
                                                c3000l02.m14298H1();
                                            }
                                            float f11 = c3000l02.f11859H;
                                            if (f11 > 0.0f) {
                                                i15 = (int) f11;
                                            }
                                        }
                                        view = mo9732P2;
                                        AbstractC20826v0.m108809g(c3000l02, i16, i14, i15, this.f78419t1, m85331qO(), -1);
                                    } else {
                                        view = mo9732P2;
                                    }
                                    if (view != null) {
                                        i14 = Math.min(view.getBottom(), this.f78397b1.getHeight()) - Math.max(0, view.getTop());
                                        i15 = view.getBottom() - view.getTop();
                                        z13 = z12;
                                        str2 = str;
                                        c3000l02 = c3000l0;
                                    } else {
                                        z13 = z12;
                                        str2 = str;
                                        c3000l02 = c3000l0;
                                        i13 = i16;
                                        i14 = 0;
                                        i15 = 0;
                                    }
                                }
                                i13 = i16;
                            }
                        }
                        m9740Y1++;
                    }
                    if (c3000l02 != null) {
                        if (z13) {
                            if (c3000l02.f11859H == 0.0f) {
                                c3000l02.m14298H1();
                            }
                            float f12 = c3000l02.f11859H;
                            if (f12 > 0.0f) {
                                i12 = (int) f12;
                                AbstractC20826v0.m108809g(c3000l02, i13, i14, i12, this.f78419t1, m85331qO(), -1);
                            }
                        }
                        i12 = i15;
                        AbstractC20826v0.m108809g(c3000l02, i13, i14, i12, this.f78419t1, m85331qO(), -1);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: mE */
    public void mo11963mE(AnimationTarget animationTarget, C23528a c23528a, String str, C20275e c20275e, Bundle bundle, int i11, C3020p0 c3020p0) {
        try {
            m85328pR(c3020p0, bundle);
            if ((m92648SI() instanceof BaseZaloActivity) && m92650VI() != null) {
                c20275e.m105868N(m92650VI());
                ((BaseZaloActivity) m92648SI()).mo35551H2(animationTarget, str, bundle, c20275e, i11);
            } else {
                m92662fJ().m93066i2(FeedImageViewer.class, bundle, i11, 1, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: mO */
    public void m85405mO(String str) {
        try {
            if (this.f78390X1) {
                return;
            }
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f78390X1 = true;
            this.f78384U1 = str;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f78392Y1);
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f78390X1 = false;
            mo78960q3();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: nM */
    public void mo79525nM(Bundle bundle) {
        m92676n2().mo35579p().m93069k2(TagsListView.class, bundle, 0, true);
    }

    /* renamed from: nO */
    StoryBarBtnAdd m85406nO() {
        C3426e m85408oO = m85408oO();
        if (m85408oO != null) {
            return m85408oO.m17199r();
        }
        return null;
    }

    /* renamed from: nR */
    public void m85407nR() {
        if (this.f72421L0.getContext() == null) {
            return;
        }
        if (this.f78402d2 != null) {
            this.f72421L0.getContext().getContentResolver().unregisterContentObserver(this.f78402d2);
        }
        if (this.f78404e2 != null) {
            this.f72421L0.getContext().getContentResolver().unregisterContentObserver(this.f78404e2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: o5 */
    public void mo11964o5() {
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m133393D1();
        }
    }

    /* renamed from: oO */
    C3426e m85408oO() {
        if (this.f78397b1 != null) {
            for (int i11 = 0; i11 < this.f78397b1.getChildCount(); i11++) {
                RecyclerView.AbstractC1876c0 m9823C0 = this.f78397b1.m9823C0(this.f78397b1.getChildAt(i11));
                if ((m9823C0 instanceof AbstractC25881j.a) && m9823C0.m9931C() == 57) {
                    return ((AbstractC25881j.a) m9823C0).f123465f0;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            this.f78381T0 = true;
            this.f78418s1 = true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (i11 != 1017 && i11 != 1018) {
            if (i11 == 1019) {
                FeedActionZUtils.m47515C(i12, intent, mo79522kM());
            } else if (i11 == 1010) {
                if (this.f78417r1) {
                    C3426e m85408oO = m85408oO();
                    if (m85408oO != null) {
                        m85408oO.m17184h();
                        m85408oO.m17204w(null);
                    }
                    this.f78391Y0.m10008p();
                }
            } else if (i11 == 11116) {
                if (i12 == -1) {
                    C22052u.f108594e = true;
                    C3426e m85408oO2 = m85408oO();
                    if (m85408oO2 != null) {
                        m85408oO2.m17201t();
                    }
                }
                m85391XN("tip.any", -1);
            } else if (i11 == 1012) {
                m85375BO(i12, intent);
            } else if (i11 == 1020) {
                FeedActionZUtils.m47516D(i12, intent, mo79522kM(), this);
            } else if (i11 == 1014 && i12 == -1) {
                m85416xO(intent);
            } else if (i11 == 1085) {
                if (i12 == -1) {
                    C21933s.f107870s0 = this.f78384U1;
                    AbstractC23074g2.m118378d();
                }
            } else if (i11 == 1016) {
                m85368yO(i12, intent);
            }
            this.f78421v1.onActivityResult(i11, i12, intent);
        }
        FeedActionZUtils.m47517E(i12, intent, mo79522kM());
        this.f78421v1.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null) {
            abstractC25848a2.m10008p();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:            m85394YQ(true);     */
    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        LinearLayoutManager linearLayoutManager;
        try {
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (C25979a.m133814e(this, i11, keyEvent)) {
            return true;
        }
        if (i11 == 24 && this.f78422w1 != null && this.f78397b1 != null && (linearLayoutManager = this.f78399c1) != null) {
            int m10110a = linearLayoutManager.m10110a() - 1;
            while (true) {
                if (m10110a < 0) {
                    break;
                }
                View childAt = this.f78397b1.getChildAt(m10110a);
                if (childAt instanceof FeedItemMusicModuleView) {
                    FeedItemMusicModuleView feedItemMusicModuleView = (FeedItemMusicModuleView) this.f78397b1.getChildAt(m10110a);
                    if (feedItemMusicModuleView.getFeedMusicData() != null && !feedItemMusicModuleView.getFeedMusicData().mo13948J()) {
                        this.f78422w1.m139993i0(C32002l4.m154264g(10002));
                        break;
                    }
                } else if ((childAt instanceof FeedItemVideo) || (childAt instanceof FeedItemZaloVideoContainerView)) {
                    break;
                }
                m10110a--;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 != 115) {
            if (i11 == 125) {
                if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112030g) == 0) {
                    AbstractC3102n.m15597p(this.f72421L0);
                    return;
                } else {
                    AbstractC23034c6.m118162k0(this, 125);
                    return;
                }
            }
            return;
        }
        for (int i12 : iArr) {
            if (i12 != 0) {
                return;
            }
        }
        AbstractC22055v0.m115126P(this.f72421L0, m85409pO(), null, new TrackingSource(1));
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f78381T0 = true;
        try {
            if (this.f78418s1) {
                this.f78391Y0.m133421y1();
            }
            this.f78418s1 = true;
            C23744a.m124114c().m124115b(this, 6073);
            this.f78421v1.onResume();
            if (this.f78417r1) {
                AbstractC22055v0.m115142c0(m85408oO(), true);
            }
            mo11966po();
            m85393YN();
            m85388VN();
            FeedActionZUtils.m47541b(this, AbstractC23304d.f113304M2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: op */
    public void mo11965op() {
        this.f78421v1.m15165b4();
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: pM */
    public void mo79526pM(C3020p0 c3020p0) {
        String str;
        if (c3020p0 != null) {
            str = c3020p0.m14469C();
        } else {
            str = "";
        }
        this.f78400c2 = str;
        showDialog(1014);
    }

    /* renamed from: pO */
    Point m85409pO() {
        C3426e m85408oO = m85408oO();
        if (m85408oO != null) {
            return m85408oO.m17185i();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: po */
    public void mo11966po() {
        mo11962lw(0);
    }

    /* renamed from: qR */
    public void m85410qR() {
        try {
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67683RN(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2263e
    /* renamed from: qg */
    public void mo11981qg(String str, String str2, EnumC2963d3 enumC2963d3) {
        if (enumC2963d3 == EnumC2963d3.f11684s) {
            com.zing.zalo.zdesign.component.Snackbar.m90634w(this.f78395a1.findViewById(AbstractC6918a0.main_comment_view), AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description), -1).m90644J(C27280g.m139659b(m92689tK(), AbstractC23322a.zds_ic_info_circle_solid_24, AbstractC2808b.ng60)).m90648N();
        } else {
            this.f78422w1.m140002u0(str, str2, enumC2963d3);
        }
    }

    /* renamed from: r4 */
    public void m85411r4() {
        AbstractC25848a2 abstractC25848a2;
        LinearLayoutManager linearLayoutManager;
        try {
            RecyclerView recyclerView = this.f78397b1;
            if (recyclerView != null && recyclerView.getHeight() != 0 && (abstractC25848a2 = this.f78391Y0) != null && abstractC25848a2.mo10003k() != 0 && (linearLayoutManager = this.f78399c1) != null) {
                linearLayoutManager.mo9756v1(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // bo.InterfaceC3045u2
    /* renamed from: rG */
    public void mo14631rG(InterfaceC3058y interfaceC3058y) {
        this.f78421v1.m15186rG(interfaceC3058y);
    }

    /* renamed from: rO */
    public AbstractC25848a2 m85412rO() {
        return this.f78391Y0;
    }

    /* renamed from: tO */
    public View m85413tO(String str) {
        View view;
        View findViewById;
        FeedItemSuggestBanner feedItemSuggestBanner;
        C3000l0 c3000l0;
        View m45028f;
        str.hashCode();
        int i11 = 0;
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1911547125:
                if (str.equals("tip.timeline.footerzaloconnect")) {
                    c11 = 0;
                    break;
                }
                break;
            case -818769448:
                if (str.equals("tip.timeline.compose")) {
                    c11 = 1;
                    break;
                }
                break;
            case -632995920:
                if (str.equals("tip.timeline.banner.actionbutton")) {
                    c11 = 2;
                    break;
                }
                break;
            case -424999707:
                if (str.equals("tip.timeline.msgfeed")) {
                    c11 = 3;
                    break;
                }
                break;
            case -27876251:
                if (str.equals("tip.timeline.notification")) {
                    c11 = 4;
                    break;
                }
                break;
            case 58991295:
                if (str.equals("tip.timeline.createstory")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                int m9745c2 = this.f78399c1.m9745c2();
                for (int m9740Y1 = this.f78399c1.m9740Y1(); m9740Y1 <= m9745c2; m9740Y1++) {
                    C2966e1 m133530P = this.f78391Y0.m133530P(m9740Y1);
                    if (m133530P != null && m133530P.f11705c == 61 && (c3000l0 = m133530P.f11703a) != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().m14490U()) {
                        return this.f78399c1.mo9732P(m9740Y1);
                    }
                }
                return null;
            case 1:
                if (MainTabView.m67645lM() == null) {
                    return null;
                }
                return MainTabView.m67645lM().f63257s1;
            case 2:
                try {
                    int m9745c22 = this.f78399c1.m9745c2();
                    for (int m9740Y12 = this.f78399c1.m9740Y1(); m9740Y12 <= m9745c22; m9740Y12++) {
                        RecyclerView.AbstractC1876c0 m9900t0 = this.f78397b1.m9900t0(m9740Y12);
                        if (m9900t0 != null && (m9900t0 instanceof AbstractC25881j.a) && (feedItemSuggestBanner = ((AbstractC25881j.a) m9900t0).f123452S) != null) {
                            return feedItemSuggestBanner.f44712U0;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                return null;
            case 3:
                try {
                    int m9745c23 = this.f78399c1.m9745c2();
                    if (MainTabView.m67645lM() != null && MainTabView.m67645lM().f88760a0 != null) {
                        int[] iArr = new int[2];
                        MainTabView.m67645lM().f88760a0.getLocationOnScreen(iArr);
                        i11 = MainTabView.m67645lM().f88760a0.getHeight() + iArr[1];
                    }
                    for (int m9740Y13 = this.f78399c1.m9740Y1(); m9740Y13 <= m9745c23; m9740Y13++) {
                        RecyclerView.AbstractC1876c0 m9900t02 = this.f78397b1.m9900t0(m9740Y13);
                        if (m9900t02 != null && (view = m9900t02.f7784p) != null && (findViewById = view.findViewById(AbstractC6918a0.icon_msg_feed)) != null && findViewById.getVisibility() == 0 && AbstractC28025b8.m141449e(findViewById, i11)) {
                            return findViewById;
                        }
                    }
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
                return null;
            case 4:
                if (MainTabView.m67645lM() == null || MainTabView.m67645lM().f63263y1 == null) {
                    return null;
                }
                return MainTabView.m67645lM().f63263y1;
            case 5:
                return m85406nO();
            default:
                TimelineFpfEntry m85401iO = m85401iO();
                if (m85401iO != null && m85401iO.m45029g(str) && (m45028f = m85401iO.m45028f(str)) != null) {
                    if (m85401iO.getBottom() > this.f78410k1 + m45028f.getHeight()) {
                        return m45028f;
                    }
                }
                return null;
        }
    }

    /* renamed from: tR */
    public void m85414tR(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15202p());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1044));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: v3 */
    public void mo11972v3(C3020p0 c3020p0, C32002l4 c32002l4, int i11, int i12, int i13) {
        if (c3020p0 != null) {
            this.f78421v1.m15181p4(c3020p0, i11, i12, i13, AbstractC23136l9.m118725l0(m92689tK()), c32002l4);
        }
    }

    /* renamed from: wQ */
    public void m85415wQ() {
        try {
            this.f78421v1.m15159Y3();
            m85324oR();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.social.controls.InterfaceC10867f
    /* renamed from: wo */
    public void mo43565wo(C10866e c10866e, String str) {
        super.mo43565wo(c10866e, str);
        AbstractC25848a2 abstractC25848a2 = this.f78391Y0;
        if (abstractC25848a2 != null && abstractC25848a2.m133397G0() != null) {
            this.f78391Y0.m133397G0().m104091W(false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC25848a2 abstractC25848a2;
        try {
            if (i11 == 44) {
                String str = (String) objArr[0];
                if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125977u() && m85341sO().contains(str)) {
                    this.f78376Q1.sendMessage(this.f78376Q1.obtainMessage(1, -1, 0, str));
                }
            } else if (i11 == 50) {
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.yr0
                    public /* synthetic */ yr0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.this.m85199KO();
                    }
                });
            } else if (i11 == 54) {
                if (m92672lJ() && (abstractC25848a2 = this.f78391Y0) != null && abstractC25848a2.m133397G0() != null) {
                    this.f78391Y0.m133397G0().m104096y(this.f78397b1);
                }
            } else if (i11 == 5111) {
                m85157AO();
            } else if (i11 == 6006) {
                m85192IQ();
            } else if (i11 == 6061) {
                C27353a c27353a = this.f78422w1;
                if (c27353a != null) {
                    c27353a.m140006y0();
                }
            } else if (i11 == 10036) {
                C23744a.m124114c().m124116d(5118, new Object[0]);
            }
            C3073g c3073g = this.f78421v1;
            if (c3073g != null) {
                c3073g.m15194x(i11, objArr);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, p489rn.C25927x0.a
    /* renamed from: x2 */
    public void mo36956x2(C31874cb c31874cb, int i11, int i12) {
        C17487o0 c17487o0;
        int i13;
        if (c31874cb == null) {
            return;
        }
        try {
            this.f78386V1 = c31874cb;
            if (m92676n2() != null) {
                c17487o0 = m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 == 6) {
                                AbstractC23152n3.m119032a0(c31874cb.m153177a(), m92676n2());
                            }
                        } else if (c31874cb.f146399o == 2) {
                            this.f78384U1 = c31874cb.f146385a;
                            ContactProfile m153177a = c31874cb.m153177a();
                            TrackingSource trackingSource = new TrackingSource(m153177a.f42373R0);
                            trackingSource.m40677a("sourceView", 3);
                            C21927m.m114302u().m114328d0(this.f78384U1, trackingSource);
                            AbstractC21935u.m114522L(m153177a, 0, new C26365a.b(this.f78384U1, C32002l4.m154264g(10002)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.pt0
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Void m85196JP;
                                    m85196JP = TimelineView.m85196JP();
                                    return m85196JP;
                                }
                            });
                        }
                    } else if (c31874cb.f146390f > 0) {
                        String str = c31874cb.f146385a;
                        this.f78384U1 = str;
                        this.f78388W1 = 290;
                        mo79527za(Integer.parseInt(str), null, this.f78386V1.m153177a());
                        this.f78388W1 = -1;
                    } else {
                        String str2 = c31874cb.f146385a;
                        this.f78384U1 = str2;
                        m85405mO(str2);
                    }
                } else if (c31874cb.f146390f > 0) {
                    if (C21927m.m114302u().m114357s().m153137g(c31874cb.f146385a)) {
                        AbstractC23152n3.m119032a0(c31874cb.m153177a(), m92676n2());
                    } else {
                        AbstractC23074g2.m118380f(c31874cb, c17487o0, 0, 2, 0, 0, 290);
                    }
                } else {
                    AbstractC23074g2.m118379e(c31874cb, c17487o0, 0, 2, 0, 0);
                }
            } else {
                this.f78421v1.m15176k4(c31874cb);
            }
            C28905e.m144373n().m144400v(c31874cb.f146385a, 20, 94, i12, "");
            if (i11 != 2) {
                if (i11 != 4 && i11 != 5 && i11 != 6) {
                    i13 = 2;
                } else {
                    i13 = 3;
                }
            } else {
                i13 = 4;
            }
            C0815e1.m2075D().m2099U(3, i13, 4, String.valueOf(1), c31874cb.f146385a, String.valueOf(i12), String.valueOf(c31874cb.f146399o), String.valueOf(c31874cb.f146389e));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            this.f78413n1 = AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_in_from_bottom_timeline);
            this.f78414o1 = AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_out_to_bottom_timeline);
            if (bundle != null && bundle.containsKey("cameraImageUri")) {
                this.f78379S0 = new File(bundle.getString("cameraImageUri"));
            }
            C23019b2.m118017a();
            C23030c2.m118099e();
            this.f78391Y0 = new C15210x(this.f72421L0.m92648SI(), new C15208v(), new C15209w());
            if (this.f78417r1) {
                C22021e0.m114963p().m114974F(this.f72421L0.m92648SI());
            }
            this.f78391Y0.m133396F1(new C15211y());
            this.f78391Y0.m133400H1(new C15212z());
            this.f78391Y0.m133398G1(new C15184a0());
            this.f78391Y0.m133534T(this);
            this.f78391Y0.m133533S(this);
            this.f78391Y0.m133535U(this);
            this.f78391Y0.m133536V(new C15183a());
            this.f78391Y0.m133538X(new C15185b());
            this.f78391Y0.m9999J(true);
            try {
                this.f78391Y0.m9998I(this.f78393Z0);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            this.f78397b1.setAdapter(this.f78391Y0);
            if (!this.f78417r1) {
                this.f78399c1.mo9756v1(0);
            }
            this.f78397b1.m9826E(new C15187c());
            this.f78407h1.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.du0
                public /* synthetic */ du0() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    TimelineView.this.m85172EP();
                }
            });
            this.f78403e1.setVisibility(8);
            this.f78401d1.setRefreshing(false);
            this.f78362C1 = false;
            this.f78407h1.setVisibility(8);
            m85324oR();
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0218 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:4:0x0008, B:6:0x000e, B:9:0x0026, B:11:0x002c, B:13:0x0032, B:15:0x0038, B:17:0x003e, B:19:0x0049, B:21:0x0055, B:23:0x005d, B:27:0x0063, B:38:0x007d, B:40:0x0083, B:42:0x03cc, B:46:0x03d6, B:50:0x00ba, B:53:0x00d0, B:55:0x00db, B:57:0x00e1, B:58:0x00f9, B:60:0x00ff, B:61:0x011a, B:64:0x0122, B:66:0x012b, B:68:0x0134, B:71:0x0145, B:73:0x014b, B:75:0x0151, B:77:0x0186, B:79:0x0193, B:80:0x019b, B:84:0x01a5, B:87:0x01b0, B:89:0x01be, B:90:0x01c5, B:92:0x01d1, B:95:0x01da, B:98:0x01ec, B:100:0x0201, B:103:0x0206, B:104:0x0214, B:106:0x0218, B:108:0x0224, B:110:0x0271, B:112:0x029b, B:115:0x02a0, B:117:0x02aa, B:118:0x02cd, B:119:0x02b9, B:121:0x02bf, B:122:0x02c5, B:124:0x020d, B:126:0x023b, B:128:0x0247, B:129:0x0258, B:137:0x02e2, B:139:0x02ec, B:141:0x02f3, B:143:0x02f9, B:145:0x0301, B:147:0x034a, B:149:0x0350, B:151:0x0356, B:153:0x035c, B:155:0x0362, B:157:0x036a, B:160:0x0373, B:167:0x0382, B:168:0x038d, B:169:0x0391, B:170:0x03a2, B:172:0x03a6, B:174:0x03ac, B:175:0x03b1), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0236  */
    /* renamed from: xO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m85416xO(Intent intent) {
        C3000l0 c3000l0;
        C3020p0 c3020p0;
        boolean z11;
        C3000l0 c3000l02;
        C3020p0 c3020p02;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str;
        C17487o0 c17487o0;
        if (intent != null) {
            try {
                if (intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT")) {
                    BottomSheetMenuResult bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT");
                    int i11 = 9;
                    if (bottomSheetMenuResult != null && bottomSheetMenuResult.m45565a() != null && bottomSheetMenuResult.m45569e() == 1 && bottomSheetMenuResult.m45571g() != 0) {
                        C20637a m45565a = bottomSheetMenuResult.m45565a();
                        if (m45565a != null) {
                            c3000l02 = m45565a.m107540b();
                        } else {
                            c3000l02 = null;
                        }
                        if (c3000l02 != null) {
                            c3020p02 = c3000l02.m14325c0(m45565a.m107542d());
                        } else {
                            c3020p02 = null;
                        }
                        if (c3020p02 == null) {
                            if (bottomSheetMenuResult.m45571g() == 44) {
                                this.f78421v1.m15139C4();
                                return;
                            }
                            return;
                        }
                        int m45571g = bottomSheetMenuResult.m45571g();
                        if (m45571g == 8) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (m45571g == 12) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i12 = 3;
                        if (!z12 && !z13) {
                            if (m45571g == 9 && !c3020p02.m14494Y()) {
                                AbstractC23647d.m123907q("4440", "");
                                KeyEventCallbackC17462c m118464q = AbstractC23093i.m118464q(this.f72421L0.m92648SI(), new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.rr0

                                    /* renamed from: b */
                                    public final /* synthetic */ C3020p0 f81850b;

                                    public /* synthetic */ rr0(C3020p0 c3020p022) {
                                        r2 = c3020p022;
                                    }

                                    @Override // bn.C2913t1.b
                                    /* renamed from: a */
                                    public final void mo13056a(int i13, String str2) {
                                        TimelineView.this.m85216OO(r2, i13, str2);
                                    }
                                }, AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_dialog_msg), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no));
                                this.f78380S1 = m118464q;
                                m85249VQ(m118464q);
                                this.f78380S1.mo13822K();
                                AbstractC23647d.m123893c();
                            } else if (m45571g == 13) {
                                AbstractC23647d.m123907q("4430", "");
                                this.f78421v1.m15188s4(c3000l02, c3020p022, new TrackingSource(101));
                                AbstractC23647d.m123893c();
                            } else if (m45571g == 10) {
                                AbstractC23647d.m123906p("4442");
                                if (c3020p022.m14482K()) {
                                    if (c3020p022.m14494Y()) {
                                        mo79525nM(TagsListView.m84986jM(c3020p022.f12057p, c3020p022.f12058q, c3020p022.f12022B.f12280b, c3020p022.f12059r.f11956a, false).getExtras());
                                    } else if (c3020p022.m14502d0()) {
                                        KeyEventCallbackC17462c m118469v = AbstractC23093i.m118469v(this.f72421L0.m92648SI(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.sr0

                                            /* renamed from: q */
                                            public final /* synthetic */ C3020p0 f82124q;

                                            public /* synthetic */ sr0(C3020p0 c3020p022) {
                                                r2 = c3020p022;
                                            }

                                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                            /* renamed from: K8 */
                                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                                TimelineView.this.m85221PO(r2, interfaceC17463d, i13);
                                            }
                                        }, AbstractC8020f0.str_feed_untag_confirm_msg);
                                        this.f78380S1 = m118469v;
                                        m85249VQ(m118469v);
                                        this.f78380S1.mo13822K();
                                    }
                                }
                                AbstractC23647d.m123893c();
                            } else if (m45571g == 6) {
                                m85396aO(c3020p022, c3000l02.f11897r);
                            } else if (m45571g == 7) {
                                m85398cO(c3020p022, c3000l02.f11897r);
                            } else if (m45571g == 3) {
                                AbstractC23647d.m123906p("4444");
                                mo11948c1(c3020p022);
                                AbstractC23647d.m123893c();
                            } else if (m45571g == 11) {
                                if (c3020p022.m14494Y() && AbstractC23309i.m122305q2()) {
                                    C26878b.m138449b().m138453e(c3000l02, c3020p022);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("EXTRA_FEED_ID", c3020p022.f12057p);
                                    bundle.putString("EXTRA_FEED_CONTENT_JSON", AbstractC20826v0.m108827p(c3000l02).toString());
                                    bundle.putString("EXTRA_ENTRY_POINT_CHAIN", C32002l4.m154264g(10002).m154277l());
                                    if (m92676n2() != null) {
                                        c17487o0 = m92676n2().mo35579p();
                                    } else {
                                        c17487o0 = null;
                                    }
                                    if (c17487o0 != null) {
                                        c17487o0.m93066i2(EditFeedView.class, bundle, 0, 1, true);
                                    }
                                    AbstractC23647d.m123897g("4446");
                                }
                            } else if (m45571g == 5) {
                                this.f78421v1.m15189t4(c3020p022);
                            } else if (m45571g == 34) {
                                if (C21912a.m114159g().m114169j(c3020p022.f12022B.f12280b)) {
                                    this.f78421v1.m15143K4(c3020p022);
                                } else {
                                    m85395ZQ(c3020p022, false, new TrackingSource(101));
                                }
                            } else if (m45571g == 41) {
                                m85301iR(c3020p022);
                            } else if (m45571g == 42) {
                                this.f78421v1.m15185r4(c3000l02, c3020p022, new TrackingSource(0));
                            }
                        }
                        if (z12) {
                            charSequence = AbstractC20826v0.m108759G(c3020p022);
                            AbstractC23136l9.m118743r0(AbstractC8020f0.profile_deletefeedsuccess);
                            charSequence3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_delete);
                            if (c3020p022.m14485P() && c3020p022.f12058q != 23) {
                                charSequence4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_edit);
                                if (c3020p022.f12058q != 23) {
                                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_item_option_item_delete_title);
                                    if (!TextUtils.isEmpty(m118743r0)) {
                                        m118743r0 = m118743r0 + "?";
                                    }
                                    charSequence2 = m118743r0;
                                    i12 = i11;
                                } else {
                                    i12 = i11;
                                    charSequence2 = "";
                                }
                            }
                            charSequence4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_cancel);
                            i11 = 1;
                            if (c3020p022.f12058q != 23) {
                            }
                        } else if (!z13) {
                            charSequence = "";
                            charSequence2 = charSequence;
                            charSequence3 = charSequence2;
                            charSequence4 = charSequence3;
                        } else {
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_item_option_item_delete_title);
                            if (!TextUtils.isEmpty(m118743r02)) {
                                str = ((Object) m118743r02) + "?";
                            } else {
                                str = m118743r02;
                            }
                            AbstractC23136l9.m118743r0(AbstractC8020f0.profile_hide_user_activity_success);
                            charSequence3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_delete);
                            charSequence4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                            charSequence = str;
                            charSequence2 = "";
                            i12 = 7;
                        }
                        AbstractC23647d.m123907q("4420", "");
                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                        aVar.m43159h(i12).m43172u(charSequence2).m43162k(charSequence).m43170s(charSequence3, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.or0

                            /* renamed from: q */
                            public final /* synthetic */ boolean f81502q;

                            /* renamed from: r */
                            public final /* synthetic */ C3020p0 f81503r;

                            /* renamed from: s */
                            public final /* synthetic */ boolean f81504s;

                            public /* synthetic */ or0(boolean z122, C3020p0 c3020p022, boolean z132) {
                                r2 = z122;
                                r3 = c3020p022;
                                r4 = z132;
                            }

                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                TimelineView.this.m85203LO(r2, r3, r4, interfaceC17463d, i13);
                            }
                        });
                        if (c3020p022.m14485P() && c3020p022.f12058q != 23) {
                            aVar.m43168q(charSequence4, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.pr0

                                /* renamed from: q */
                                public final /* synthetic */ boolean f81624q;

                                /* renamed from: r */
                                public final /* synthetic */ C3020p0 f81625r;

                                /* renamed from: s */
                                public final /* synthetic */ C3000l0 f81626s;

                                public /* synthetic */ pr0(boolean z122, C3020p0 c3020p022, C3000l0 c3000l022) {
                                    r2 = z122;
                                    r3 = c3020p022;
                                    r4 = c3000l022;
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                    TimelineView.this.m85207MO(r2, r3, r4, interfaceC17463d, i13);
                                }
                            });
                            if (z122) {
                                aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.qr0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                        interfaceC17463d.dismiss();
                                    }
                                });
                            }
                            C8009j m43152a = aVar.m43152a();
                            this.f78380S1 = m43152a;
                            m85249VQ(m43152a);
                            this.f78380S1.mo13822K();
                            AbstractC23647d.m123893c();
                        }
                        if (TextUtils.isEmpty(charSequence4)) {
                            charSequence4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                        }
                        aVar.m43165n(charSequence4, new InterfaceC17463d.b());
                        C8009j m43152a2 = aVar.m43152a();
                        this.f78380S1 = m43152a2;
                        m85249VQ(m43152a2);
                        this.f78380S1.mo13822K();
                        AbstractC23647d.m123893c();
                    } else if (bottomSheetMenuResult != null && !TextUtils.isEmpty(bottomSheetMenuResult.m45570f()) && bottomSheetMenuResult.m45569e() == 2 && bottomSheetMenuResult.m45571g() != 0) {
                        if (bottomSheetMenuResult.m45571g() == 14) {
                            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                            aVar2.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_hide_memory_popup_title_v2)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.tr0

                                /* renamed from: q */
                                public final /* synthetic */ BottomSheetMenuResult f82231q;

                                public /* synthetic */ tr0(BottomSheetMenuResult bottomSheetMenuResult2) {
                                    r2 = bottomSheetMenuResult2;
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                    TimelineView.this.m85225QO(r2, interfaceC17463d, i13);
                                }
                            });
                            C8009j m43152a3 = aVar2.m43152a();
                            this.f78380S1 = m43152a3;
                            m85249VQ(m43152a3);
                            this.f78380S1.mo13822K();
                        }
                    } else if (bottomSheetMenuResult2 != null && bottomSheetMenuResult2.m45565a() != null && bottomSheetMenuResult2.m45569e() == 9 && bottomSheetMenuResult2.m45571g() != 0) {
                        C20637a m45565a2 = bottomSheetMenuResult2.m45565a();
                        if (m45565a2 != null) {
                            c3000l0 = m45565a2.m107540b();
                        } else {
                            c3000l0 = null;
                        }
                        if (c3000l0 != null) {
                            c3020p0 = c3000l0.m14322a0();
                        } else {
                            c3020p0 = null;
                        }
                        if (c3020p0 == null) {
                            return;
                        }
                        int m45571g2 = bottomSheetMenuResult2.m45571g();
                        if (m45571g2 != 8) {
                            if (m45571g2 != 13) {
                                if (m45571g2 != 41) {
                                    if (m45571g2 == 42) {
                                        this.f78421v1.m15185r4(c3000l0, c3020p0, new TrackingSource(0));
                                    }
                                } else {
                                    m85301iR(c3020p0);
                                }
                            } else {
                                AbstractC23647d.m123907q("4430", "");
                                this.f78421v1.m15188s4(c3000l0, c3020p0, new TrackingSource(101));
                                AbstractC23647d.m123893c();
                            }
                        } else {
                            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f78380S1;
                            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                                this.f78380S1.dismiss();
                            }
                            KeyEventCallbackC17462c m118463p = AbstractC23093i.m118463p(this.f72421L0.m92648SI(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ur0

                                /* renamed from: q */
                                public final /* synthetic */ C3000l0 f82336q;

                                public /* synthetic */ ur0(C3000l0 c3000l03) {
                                    r2 = c3000l03;
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                    TimelineView.this.m85230RO(r2, interfaceC17463d, i13);
                                }
                            });
                            this.f78380S1 = m118463p;
                            m85249VQ(m118463p);
                            this.f78380S1.mo13822K();
                        }
                    }
                    if (bottomSheetMenuResult2 != null && bottomSheetMenuResult2.m45571g() != 0) {
                        z11 = false;
                        this.f78418s1 = z11;
                    }
                    z11 = true;
                    this.f78418s1 = z11;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: xQ */
    public void m85417xQ(boolean z11, boolean z12) {
        if (z11) {
            m85227QQ();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: xt */
    public void mo11975xt(String str, String str2, TrackingSource trackingSource) {
        if (str.equals("action.open.mp")) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("sourceOpen", 4002);
                str2 = jSONObject.toString();
            } catch (Exception unused) {
            }
        }
        m78959pL(str, str2, 4, new C31877d(trackingSource));
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: xz */
    public void mo11976xz(C3000l0 c3000l0, int i11) {
        C0815e1.m2075D().m2100V(new C23648e(22, "", 0, "social_hidecard_block", new String[0]), false);
        m85395ZQ(c3000l0.m14324b0(i11), true, new TrackingSource(105));
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.social.controls.InterfaceC10861a
    /* renamed from: yf */
    public void mo43566yf(C28100j3 c28100j3) {
        if (c28100j3 == null) {
            return;
        }
        try {
            if (c28100j3.f131060a == 1) {
                String str = c28100j3.f131061b;
                String str2 = c28100j3.f131062c;
                if (!TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("fid", str);
                    bundle.putString("ownerId", str2);
                    bundle.putString("extra_entry_point_flow", C32002l4.m154264g(10002).m154277l());
                    bundle.putBoolean("extra_from_timeline", true);
                    C26878b.m138449b().m138454f(str);
                    C17487o0 mo35579p = this.f72421L0.m92676n2().mo35579p();
                    if (mo35579p != null) {
                        mo35579p.m93066i2(FeedDetailsView.class, bundle, 68, 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 22);
        C23744a.m124114c().m124115b(this, 28);
        C23744a.m124114c().m124115b(this, 44);
        C23744a.m124114c().m124115b(this, 88);
        C23744a.m124114c().m124115b(this, 116);
        C23744a.m124114c().m124115b(this, 50);
        C23744a.m124114c().m124115b(this, 54);
        C23744a.m124114c().m124115b(this, 5100);
        C23744a.m124114c().m124115b(this, 5110);
        C23744a.m124114c().m124115b(this, 5111);
        C23744a.m124114c().m124115b(this, 5113);
        C23744a.m124114c().m124115b(this, 3005);
        C23744a.m124114c().m124115b(this, 6006);
        C23744a.m124114c().m124115b(this, 6014);
        C23744a.m124114c().m124115b(this, 6043);
        C23744a.m124114c().m124115b(this, 6061);
        C23744a.m124114c().m124115b(this, 115);
        C23744a.m124114c().m124115b(this, 5118);
        C23744a.m124114c().m124115b(this, 10036);
        C23744a.m124114c().m124115b(this, 6079);
        C23744a.m124114c().m124115b(this, 6082);
        C23744a.m124114c().m124115b(this, 6083);
        C23744a.m124114c().m124115b(this, 6092);
        C23744a.m124114c().m124115b(this, 6097);
        C23744a.m124114c().m124115b(this, 6101);
        m85378DO();
    }

    /* renamed from: zO */
    public boolean m85418zO(int i11, KeyEvent keyEvent) {
        return this.f72421L0.m78934CL(i11, keyEvent);
    }

    /* renamed from: zQ */
    public void m85419zQ(boolean z11) {
        m85374AQ(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: za */
    public void mo79527za(int i11, C3020p0 c3020p0, ContactProfile contactProfile) {
        TrackingSource m114310H;
        try {
            if (this.f78382T1) {
                return;
            }
            mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15200n(c3020p0, i11, contactProfile));
            this.f78382T1 = true;
            if (this.f78388W1 != -1) {
                m114310H = new TrackingSource(this.f78388W1);
            } else if (c3020p0 != null) {
                TrackingSource trackingSource = new TrackingSource(221);
                try {
                    C32145v4 c32145v4 = c3020p0.f12039S;
                    if (c32145v4 != null && !TextUtils.isEmpty(c32145v4.f148248a)) {
                        trackingSource.m40677a("campaignId", c3020p0.f12039S.f148248a);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                m114310H = trackingSource;
            } else {
                m114310H = C21927m.m114302u().m114310H(String.valueOf(i11));
                if (m114310H == null) {
                    m114310H = new TrackingSource(-1);
                }
            }
            c0766k.mo1578Y4(i11, m114310H);
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }
}
