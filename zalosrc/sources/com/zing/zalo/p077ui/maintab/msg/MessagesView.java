package com.zing.zalo.p077ui.maintab.msg;

import ac.InterfaceC0733x;
import ae.C0757b;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0855y0;
import ag0.C0856z;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.util.C1483e;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ap0.C2279a;
import au.AbstractC2364o0;
import au.C2343e;
import b40.C2526d;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bn.C2852a1;
import bn.C2864d1;
import bn.C2895n1;
import bn.ViewOnClickListenerC2868e1;
import bp0.AbstractC3102n;
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
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.common.chat.label.SelectMultiItemAddChatLabelView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetBlockView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chattag.C11837a;
import com.zing.zalo.p077ui.chattag.ChatTagFilterBottomSheet;
import com.zing.zalo.p077ui.custom.ActionTitleDialog;
import com.zing.zalo.p077ui.group.invitation.box.GroupInvitationListView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.msg.AbstractC12211a;
import com.zing.zalo.p077ui.maintab.msg.C12259i;
import com.zing.zalo.p077ui.maintab.msg.MessagesView;
import com.zing.zalo.p077ui.maintab.msg.fixedbanner.FixedBannerView;
import com.zing.zalo.p077ui.maintab.widget.MainTabChildView;
import com.zing.zalo.p077ui.moduleview.message.E2eeDefault11Banner;
import com.zing.zalo.p077ui.moduleview.message.InterfaceC12435f;
import com.zing.zalo.p077ui.moduleview.message.NormalMsgModuleView;
import com.zing.zalo.p077ui.searchglobal.SearchGlobalView;
import com.zing.zalo.p077ui.settings.SettingMessageV2View;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.FileDownloadBannerView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.QuickActionViewType5;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ZinstantAdItemView;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import com.zing.zalo.p077ui.zviews.CodeLockMessageView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.FindFriendByPhoneNumberView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.GroupNotificationSettingView;
import com.zing.zalo.p077ui.zviews.HistoryLoginView;
import com.zing.zalo.p077ui.zviews.ListContactNativeView;
import com.zing.zalo.p077ui.zviews.MyCalendarView;
import com.zing.zalo.p077ui.zviews.NearbyZView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.StrangerMessagesView;
import com.zing.zalo.p077ui.zviews.SuggestFriendDetailView;
import com.zing.zalo.p077ui.zviews.VipMessagesView;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EmptyState;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zdesign.component.popover.C17033b;
import com.zing.zalo.zdesign.component.popover.C17035d;
import com.zing.zalo.zdesign.component.popover.C17036e;
import com.zing.zalo.zdesign.component.popover.InterfaceC17034c;
import com.zing.zalo.zdesign.component.popover.PopoverView;
import com.zing.zalo.zdesign.component.tab.ZdsTabBar;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import cu.AbstractC17574a;
import d60.C17793b;
import dg0.AbstractC17927b;
import dg0.AbstractC17930e;
import dj.C17945a0;
import dj.C17990p0;
import ee.C18415w;
import eg0.C18427b;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22021e0;
import l30.C22033k0;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23089h6;
import me0.AbstractC23116k0;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23161o1;
import me0.AbstractC23165o5;
import me0.AbstractC23181q;
import me0.AbstractC23192r;
import me0.AbstractC23195r2;
import me0.AbstractC23202r9;
import me0.AbstractC23211s7;
import me0.AbstractC23216t1;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import mg.C23288a;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mx.C23475l;
import nh0.C23793c;
import o70.C24099q0;
import org.json.JSONObject;
import p056cj.C3533a;
import p130eh.C18431b;
import p131ei.C18434b;
import p132ej.C18440b;
import p132ej.C18443e;
import p132ej.C18450l;
import p132ej.C18451m;
import p132ej.C18452n;
import p142ey.C18631a;
import p142ey.C18644n;
import p161fg.C18922m;
import p162fh.C18932a;
import p162fh.C18935d;
import p207he.C20024r;
import p210hh.C20058a;
import p210hh.C20060c;
import p241ij.C20566c;
import p266jg.AbstractC21244b;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p320ld.C22432d;
import p320ld.C22434f;
import p320ld.C22438j;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.C23744a;
import p394oj.C24275a;
import p394oj.C24277c;
import p405ov.C24559a;
import p420pb.C24709a;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p604wb.C28905e;
import p716zh.C31862c;
import p716zh.C31874cb;
import p716zh.C31877d;
import p716zh.C31931g8;
import p716zh.C31965ic;
import p716zh.C31973j5;
import p716zh.C31980jc;
import p716zh.C31986k3;
import p716zh.C32002l4;
import p716zh.C32026md;
import p716zh.C32041nd;
import p716zh.C32044o1;
import p716zh.C32132u5;
import pi0.C24773h;
import qi0.C25297f;
import qi0.EnumC25293b;
import sa0.C26203c;
import si.C26263i;
import sy.AbstractC26412d;
import th.AbstractC26681b;
import th.AbstractC26683d;
import u00.C26939u;
import v20.C27473a;
import v50.C27870vb;
import v60.AbstractC27938j;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28023b6;
import vg.C28203u6;
import vg.C28212v6;
import vl0.AbstractC28291a;
import wd0.C28926f;
import wd0.C28927g;
import wd0.C28928h;
import wd0.C28929i;
import zc0.C31784b;
import zm.voip.p721ui.views.CreateGroupCallZView;

/* loaded from: classes5.dex */
public class MessagesView extends MainTabChildView implements C23744a.c, AbstractC12211a.b, MainTabView.InterfaceC12111i, InterfaceC17463d.d, AbstractC12211a.a, NormalMsgModuleView.InterfaceC12426b, View.OnClickListener, C0856z.b, C2852a1.d, ActionTitleDialog.InterfaceC11842b, InterfaceC13567b1.a, ZinstantAdItemView.InterfaceC13555d, InterfaceC0733x {

    /* renamed from: k3 */
    public static final String f63530k3 = "MessagesView";

    /* renamed from: l3 */
    public static String f63531l3 = "EXTRA_NEW_HIDDEN_MSG";

    /* renamed from: m3 */
    public static boolean f63532m3 = false;

    /* renamed from: A1 */
    TextView f63533A1;

    /* renamed from: A2 */
    TextView f63534A2;

    /* renamed from: B1 */
    TextView f63535B1;

    /* renamed from: B2 */
    TextView f63536B2;

    /* renamed from: C1 */
    TextView f63537C1;

    /* renamed from: C2 */
    TextView f63538C2;

    /* renamed from: D1 */
    Button f63539D1;

    /* renamed from: D2 */
    TextView f63540D2;

    /* renamed from: E2 */
    TextView f63542E2;

    /* renamed from: F1 */
    RecyclerView f63543F1;

    /* renamed from: F2 */
    public RedDotImageButton f63544F2;

    /* renamed from: G1 */
    ViewGroup f63545G1;

    /* renamed from: G2 */
    ShowcaseView f63546G2;

    /* renamed from: H1 */
    QuickActionViewLayout f63547H1;

    /* renamed from: H2 */
    C13306b f63548H2;

    /* renamed from: I2 */
    FrameLayout f63550I2;

    /* renamed from: K1 */
    Snackbar f63553K1;

    /* renamed from: L1 */
    boolean f63555L1;

    /* renamed from: O1 */
    C18451m f63564O1;

    /* renamed from: P1 */
    C18451m f63567P1;

    /* renamed from: R0 */
    C12259i f63572R0;

    /* renamed from: S0 */
    android.widget.Button f63575S0;

    /* renamed from: S1 */
    C23528a f63576S1;

    /* renamed from: T0 */
    ActionBarMenuItem f63578T0;

    /* renamed from: T1 */
    C12260j f63579T1;

    /* renamed from: U0 */
    android.widget.Button f63581U0;

    /* renamed from: U1 */
    C8009j f63582U1;

    /* renamed from: V1 */
    AbstractC22055v0.l f63585V1;

    /* renamed from: X1 */
    LinearLayoutManager f63591X1;

    /* renamed from: Y1 */
    FrameLayout f63594Y1;

    /* renamed from: Z0 */
    LinearLayout f63596Z0;

    /* renamed from: a1 */
    ZdsTabBar f63599a1;

    /* renamed from: b1 */
    C24773h[] f63602b1;

    /* renamed from: c1 */
    View f63605c1;

    /* renamed from: c3 */
    FileDownloadBannerView f63607c3;

    /* renamed from: f1 */
    private HashMap f63614f1;

    /* renamed from: f2 */
    private C28927g f63615f2;

    /* renamed from: g1 */
    View f63617g1;

    /* renamed from: g2 */
    private C28926f f63618g2;

    /* renamed from: h1 */
    View f63620h1;

    /* renamed from: i1 */
    View f63623i1;

    /* renamed from: j1 */
    View f63626j1;

    /* renamed from: j2 */
    String f63627j2;

    /* renamed from: k1 */
    View f63629k1;

    /* renamed from: k2 */
    ContactProfile f63630k2;

    /* renamed from: l1 */
    AppCompatImageView f63631l1;

    /* renamed from: l2 */
    ContactProfile f63632l2;

    /* renamed from: m1 */
    RobotoTextView f63633m1;

    /* renamed from: m2 */
    ContactProfile f63634m2;

    /* renamed from: n1 */
    AppCompatImageView f63635n1;

    /* renamed from: o1 */
    View f63637o1;

    /* renamed from: p1 */
    View f63639p1;

    /* renamed from: q1 */
    PopoverView f63641q1;

    /* renamed from: r2 */
    C32132u5 f63644r2;

    /* renamed from: t1 */
    FixedBannerView f63647t1;

    /* renamed from: u1 */
    ViewGroup f63649u1;

    /* renamed from: u2 */
    AnimChat f63650u2;

    /* renamed from: v1 */
    ProgressBar f63651v1;

    /* renamed from: v2 */
    public TextView f63652v2;

    /* renamed from: w1 */
    ScrollView f63653w1;

    /* renamed from: w2 */
    ActionBarMenuItem f63654w2;

    /* renamed from: x1 */
    ScrollView f63655x1;

    /* renamed from: x2 */
    ActionBarMenuItem f63656x2;

    /* renamed from: y1 */
    LinearLayout f63657y1;

    /* renamed from: y2 */
    TextView f63658y2;

    /* renamed from: z1 */
    TextView f63659z1;

    /* renamed from: z2 */
    TextView f63660z2;

    /* renamed from: M0 */
    private final int f63557M0 = 11;

    /* renamed from: N0 */
    private final int f63560N0 = 12;

    /* renamed from: O0 */
    private final int f63563O0 = 13;

    /* renamed from: P0 */
    private final int f63566P0 = 14;

    /* renamed from: Q0 */
    private final int f63569Q0 = 15;

    /* renamed from: V0 */
    private int f63584V0 = 0;

    /* renamed from: W0 */
    int f63587W0 = 0;

    /* renamed from: X0 */
    int f63590X0 = 0;

    /* renamed from: Y0 */
    boolean f63593Y0 = false;

    /* renamed from: d1 */
    C24773h f63608d1 = new C24773h();

    /* renamed from: e1 */
    C24773h f63611e1 = new C24773h();

    /* renamed from: r1 */
    private AbstractC27938j f63643r1 = null;

    /* renamed from: s1 */
    private C20058a f63645s1 = C20058a.Companion.m104191a(C18932a.f94442a.m99179c());

    /* renamed from: E1 */
    CircleImage[] f63541E1 = new CircleImage[3];

    /* renamed from: I1 */
    boolean f63549I1 = false;

    /* renamed from: J1 */
    CountDownTimer f63551J1 = null;

    /* renamed from: M1 */
    int f63558M1 = 0;

    /* renamed from: N1 */
    int f63561N1 = 0;

    /* renamed from: Q1 */
    boolean f63570Q1 = true;

    /* renamed from: R1 */
    boolean f63573R1 = false;

    /* renamed from: W1 */
    String f63588W1 = "";

    /* renamed from: Z1 */
    boolean f63597Z1 = false;

    /* renamed from: a2 */
    String f63600a2 = "";

    /* renamed from: b2 */
    public int f63603b2 = 0;

    /* renamed from: c2 */
    public long f63606c2 = 0;

    /* renamed from: d2 */
    boolean f63609d2 = false;

    /* renamed from: e2 */
    boolean f63612e2 = false;

    /* renamed from: h2 */
    private final Handler f63621h2 = new Handler(Looper.getMainLooper(), new C12195k());

    /* renamed from: i2 */
    ViewTreeObserver.OnGlobalLayoutListener f63624i2 = new ViewTreeObserverOnGlobalLayoutListenerC12206v();

    /* renamed from: n2 */
    boolean f63636n2 = false;

    /* renamed from: o2 */
    boolean f63638o2 = false;

    /* renamed from: p2 */
    InterfaceC0765j f63640p2 = new C0766k();

    /* renamed from: q2 */
    InterfaceC20094a f63642q2 = new C12181b0();

    /* renamed from: s2 */
    final Runnable f63646s2 = new Runnable() { // from class: t70.o
        @Override // java.lang.Runnable
        public final void run() {
            MessagesView.this.m68292xP();
        }
    };

    /* renamed from: t2 */
    final Runnable f63648t2 = new Runnable() { // from class: t70.z
        @Override // java.lang.Runnable
        public final void run() {
            MessagesView.m68297yP();
        }
    };

    /* renamed from: J2 */
    int f63552J2 = 250;

    /* renamed from: K2 */
    ObjectAnimator f63554K2 = null;

    /* renamed from: L2 */
    ObjectAnimator f63556L2 = null;

    /* renamed from: M2 */
    Animator.AnimatorListener f63559M2 = new C12186e();

    /* renamed from: N2 */
    Animator.AnimatorListener f63562N2 = new C12188f();

    /* renamed from: O2 */
    boolean f63565O2 = false;

    /* renamed from: P2 */
    boolean f63568P2 = false;

    /* renamed from: Q2 */
    boolean f63571Q2 = false;

    /* renamed from: R2 */
    boolean f63574R2 = false;

    /* renamed from: S2 */
    volatile boolean f63577S2 = false;

    /* renamed from: T2 */
    boolean f63580T2 = false;

    /* renamed from: U2 */
    boolean f63583U2 = false;

    /* renamed from: V2 */
    Runnable f63586V2 = new RunnableC12208x();

    /* renamed from: W2 */
    C0855y0 f63589W2 = new C0855y0();

    /* renamed from: X2 */
    boolean f63592X2 = false;

    /* renamed from: Y2 */
    Bundle f63595Y2 = null;

    /* renamed from: Z2 */
    C31862c f63598Z2 = null;

    /* renamed from: a3 */
    boolean f63601a3 = false;

    /* renamed from: b3 */
    C18434b.e f63604b3 = new C18434b.e() { // from class: t70.k0
        @Override // p131ei.C18434b.e
        /* renamed from: a */
        public final void mo64321a(int i11, C31862c c31862c) {
            MessagesView.this.m68286wP(i11, c31862c);
        }
    };

    /* renamed from: d3 */
    boolean f63610d3 = false;

    /* renamed from: e3 */
    final AtomicBoolean f63613e3 = new AtomicBoolean(false);

    /* renamed from: f3 */
    boolean f63616f3 = false;

    /* renamed from: g3 */
    final AtomicBoolean f63619g3 = new AtomicBoolean(false);

    /* renamed from: h3 */
    boolean f63622h3 = false;

    /* renamed from: i3 */
    float f63625i3 = 0.0f;

    /* renamed from: j3 */
    int f63628j3 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$a */
    /* loaded from: classes5.dex */
    public class C12178a extends AbstractC0939u {
        C12178a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - AbstractC0924m0.m3271N2() >= 86400000) {
                    C2526d.f10270a.m12726s0("null", AbstractC23309i.m121048If());
                    AbstractC0924m0.m3230Lj(elapsedRealtime);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$a0 */
    /* loaded from: classes5.dex */
    public class C12179a0 implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$a0$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f63663a;

            a(ContactProfile contactProfile) {
                this.f63663a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f63663a.f42434r);
            }
        }

        C12179a0() {
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
                    AbstractC23350e.m122776f(MessagesView.f63530k3, e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$b */
    /* loaded from: classes5.dex */
    public class C12180b extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$b$a */
        /* loaded from: classes5.dex */
        class a implements AbstractC22055v0.g {
            a() {
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: O */
            public void mo46561O() {
                MessagesView.this.m68326KQ();
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: a */
            public void mo46562a(String str, C22033k0.g gVar) {
                if (MessagesView.this.f72421L0.m92672lJ()) {
                    ToastUtils.showMess(str);
                    mo46561O();
                }
            }
        }

        C12180b() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: a */
        public void mo48298a(AbstractC22055v0.j jVar) {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                c31980jc.m153811A(true);
                AbstractC22055v0.m115123M(c31980jc, MessagesView.this, 1011, i11, null, new a());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$b0 */
    /* loaded from: classes5.dex */
    class C12181b0 implements InterfaceC20094a {
        C12181b0() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Resources.NotFoundException e11) {
                    e11.printStackTrace();
                }
            } finally {
                MessagesView messagesView = MessagesView.this;
                messagesView.f63638o2 = false;
                messagesView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (!jSONObject2.isNull("code")) {
                            int i11 = jSONObject2.getInt("code");
                            if (i11 == 0) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                                AbstractC23059e9.m118317F(MessagesView.this.f63627j2);
                                AbstractC23074g2.m118375a(0, MessagesView.this.f63627j2, "", 1);
                                AbstractC23063f2.m118349a(MessagesView.this.f63632l2);
                            } else {
                                AbstractC23063f2.m118357i(i11, MessagesView.this.f63632l2.f42434r);
                                if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                    if (!AbstractC23216t1.m119641f(MessagesView.this.f72421L0, i11, false)) {
                                        ToastUtils.m89259g(i11);
                                    }
                                }
                                MessagesView.this.f63600a2 = AbstractC23161o1.m119317b(i11);
                                AbstractC2364o0.m12373p(MessagesView.this, 100);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MessagesView messagesView = MessagesView.this;
                messagesView.f63638o2 = false;
                messagesView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                MessagesView messagesView2 = MessagesView.this;
                messagesView2.f63638o2 = false;
                messagesView2.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$c */
    /* loaded from: classes5.dex */
    class C12182c extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        int f63668a = 0;

        /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$c$a */
        /* loaded from: classes5.dex */
        class a extends CountDownTimer {
            a(long j11, long j12) {
                super(j11, j12);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (MessagesView.this.f63545G1.getVisibility() == 8) {
                    MessagesView.this.m68314FQ(true);
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
            }
        }

        /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$c$b */
        /* loaded from: classes5.dex */
        class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f63671a;

            /* renamed from: b */
            final /* synthetic */ int f63672b;

            /* renamed from: c */
            final /* synthetic */ List f63673c;

            b(int i11, int i12, List list) {
                this.f63671a = i11;
                this.f63672b = i12;
                this.f63673c = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                MessagesView.this.m68337PN(this.f63671a, this.f63672b, this.f63673c);
            }
        }

        C12182c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            CountDownTimer countDownTimer;
            if (i11 == 0) {
                if (MessagesView.this.f63614f1 != null) {
                    MessagesView messagesView = MessagesView.this;
                    if (messagesView.f63591X1 != null) {
                        messagesView.f63614f1.put(Integer.valueOf(MessagesView.this.f63561N1), MessagesView.this.f63591X1.mo9743b1());
                    }
                }
                MessagesView messagesView2 = MessagesView.this;
                if (messagesView2.f63549I1) {
                    this.f63668a = 0;
                    if (messagesView2.f63551J1 == null) {
                        messagesView2.f63551J1 = new a(500L, 200L);
                    }
                    MessagesView.this.f63551J1.start();
                    return;
                }
                return;
            }
            MessagesView messagesView3 = MessagesView.this;
            if (messagesView3.f63549I1 && (countDownTimer = messagesView3.f63551J1) != null) {
                countDownTimer.cancel();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            boolean z11;
            super.mo10176d(recyclerView, i11, i12);
            MessagesView messagesView = MessagesView.this;
            if (messagesView.f63596Z0 != null) {
                int m68291xO = messagesView.m68291xO();
                if (recyclerView.computeVerticalScrollOffset() <= m68291xO) {
                    MessagesView messagesView2 = MessagesView.this;
                    if (!messagesView2.f63622h3) {
                        messagesView2.m68170WN(true);
                    }
                }
                if (Math.abs(i12) < m68291xO) {
                    if (i12 < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        MessagesView.this.f63625i3 = 0.0f;
                    } else {
                        MessagesView.this.f63625i3 += i12;
                    }
                    if (z11) {
                        MessagesView messagesView3 = MessagesView.this;
                        if (!messagesView3.f63622h3) {
                            messagesView3.m68170WN(true);
                            return;
                        }
                    }
                    if (!z11) {
                        MessagesView messagesView4 = MessagesView.this;
                        if (messagesView4.f63622h3 && messagesView4.f63625i3 >= m68291xO * 2) {
                            messagesView4.m68170WN(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            MessagesView.this.m68339QN();
            try {
                MessagesView messagesView5 = MessagesView.this;
                LinearLayoutManager linearLayoutManager = messagesView5.f63591X1;
                if (linearLayoutManager != null && messagesView5.f63579T1 != null) {
                    C0809c1.m2050b(new b(linearLayoutManager.m9740Y1(), MessagesView.this.f63591X1.m9745c2(), MessagesView.this.f63579T1.m68696P()));
                }
            } catch (Exception unused) {
            }
            MessagesView messagesView6 = MessagesView.this;
            if (messagesView6.f63549I1) {
                int i13 = this.f63668a;
                if ((i13 == 0 || i13 * i12 < 0) && i12 < 0) {
                    messagesView6.m68314FQ(true);
                } else if (i13 * i12 <= 0 && i12 > 0) {
                    messagesView6.m68314FQ(false);
                }
                this.f63668a = i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$c0 */
    /* loaded from: classes5.dex */
    public class C12183c0 extends AbstractC28207v1.g0 {

        /* renamed from: a */
        final /* synthetic */ String f63675a;

        /* renamed from: b */
        final /* synthetic */ String f63676b;

        /* renamed from: c */
        final /* synthetic */ C31862c f63677c;

        C12183c0(String str, String str2, C31862c c31862c) {
            this.f63675a = str;
            this.f63676b = str2;
            this.f63677c = c31862c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m68394v() {
            MessagesView.this.m68353ZN("tip.message.filter.banner");
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: h */
        public void mo40743h() {
            MessagesView.this.m78964sL();
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: j */
        public void mo40745j(String str) {
            MessagesView.this.m78968wL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: m */
        public void mo40748m(String str) {
            MessagesView.this.m78962rL(str, false);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: q */
        public void mo40752q(String str) {
            MessagesView.this.m78961qL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: r */
        public void mo40753r(String str, String str2, String str3) {
            MessagesView.this.m78965tL(str2, str, 3, this.f63675a, this.f63676b, str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0014, B:10:0x0026, B:12:0x002c, B:13:0x0035, B:15:0x003d, B:17:0x0041, B:19:0x0045, B:20:0x0058, B:22:0x0060, B:27:0x001f), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0014, B:10:0x0026, B:12:0x002c, B:13:0x0035, B:15:0x003d, B:17:0x0041, B:19:0x0045, B:20:0x0058, B:22:0x0060, B:27:0x001f), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: s */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo40754s(String str) {
            C31862c c31862c;
            try {
                MessagesView.this.m78962rL(str, true);
                if (!TextUtils.isEmpty(str)) {
                    if (!str.equals("action.confirm.phonenum")) {
                        if (str.equals("open.change.phonenumber")) {
                        }
                        if (str.equals("action.confirm.phonenum")) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_using_acc_stick_with_sim));
                        }
                        if (str.equals("action.open.deactive.account") && (c31862c = AbstractC23304d.f113280G2) != null && c31862c == this.f63677c) {
                            C18434b.m97679l().m97688t(AbstractC23304d.f113280G2);
                            AbstractC23304d.f113280G2 = null;
                            C19669z.m103146Y().m103198O0();
                        }
                        if (!str.equals("action.workmode.enable")) {
                            AbstractC0924m0.m3091Gp(false);
                            AbstractC0924m0.m4207sl(true);
                            C23744a.m124114c().m124116d(36, new Object[0]);
                            MessagesView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MessagesView.C12183c0.this.m68394v();
                                }
                            });
                            return;
                        }
                        return;
                    }
                    MessagesView.this.m68363iO(AbstractC23304d.f113284H2);
                    if (str.equals("action.confirm.phonenum")) {
                    }
                    if (str.equals("action.open.deactive.account")) {
                        C18434b.m97679l().m97688t(AbstractC23304d.f113280G2);
                        AbstractC23304d.f113280G2 = null;
                        C19669z.m103146Y().m103198O0();
                    }
                    if (!str.equals("action.workmode.enable")) {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$d */
    /* loaded from: classes5.dex */
    class C12184d extends RecyclerView.AbstractC1890q {
        C12184d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            boolean z11;
            boolean z12;
            if (MessagesView.this.f63596Z0 != null && C18932a.f94442a.m99183g() && MessagesView.this.f63543F1.computeVerticalScrollOffset() >= MessagesView.this.m68291xO()) {
                if (i12 < 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i12 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((!z11 || !MessagesView.this.f63622h3) && (!z12 || MessagesView.this.f63622h3)) {
                    MessagesView messagesView = MessagesView.this;
                    messagesView.m68170WN(true ^ messagesView.f63622h3);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$d0 */
    /* loaded from: classes5.dex */
    public class C12185d0 implements InterfaceC12435f {

        /* renamed from: a */
        final /* synthetic */ E2eeDefault11Banner f63680a;

        C12185d0(E2eeDefault11Banner e2eeDefault11Banner) {
            this.f63680a = e2eeDefault11Banner;
        }

        @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12435f
        /* renamed from: a */
        public void mo68395a() {
            MessagesView.this.m68356bR();
            AbstractC0924m0.m2992Dd(true);
        }

        @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12435f
        /* renamed from: b */
        public void mo68396b() {
            this.f63680a.setVisibility(8);
            AbstractC0924m0.m3341Pe(AbstractC0924m0.m3766e0() + 1);
            AbstractC0924m0.m3971kp(AbstractC23306f.m120579F1().mo124314i());
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$e */
    /* loaded from: classes5.dex */
    class C12186e extends AnimatorListenerAdapter {
        C12186e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MessagesView messagesView = MessagesView.this;
            messagesView.f63625i3 = 0.0f;
            messagesView.f63619g3.compareAndSet(true, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            MessagesView.this.f63622h3 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$e0 */
    /* loaded from: classes5.dex */
    public class C12187e0 extends AbstractC27938j {
        C12187e0(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$f */
    /* loaded from: classes5.dex */
    class C12188f extends AnimatorListenerAdapter {
        C12188f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            MessagesView messagesView = MessagesView.this;
            messagesView.f63616f3 = false;
            messagesView.f63622h3 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                MessagesView messagesView = MessagesView.this;
                messagesView.f63616f3 = false;
                messagesView.f63622h3 = false;
                if (messagesView.f63543F1.computeVerticalScrollOffset() <= MessagesView.this.m68291xO()) {
                    MessagesView.this.m68170WN(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            MessagesView messagesView = MessagesView.this;
            messagesView.f63616f3 = true;
            messagesView.f63622h3 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$f0 */
    /* loaded from: classes5.dex */
    public class C12189f0 implements AbstractC27938j.a {
        C12189f0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m68399e() {
            MessagesView.this.m68304zQ(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m68400f() {
            MessagesView.this.f63572R0.m68682b0();
            MessagesView.this.m68261qQ();
        }

        @Override // v60.AbstractC27938j.a
        /* renamed from: a */
        public void mo68401a() {
            MessagesView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.g
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.C12189f0.this.m68400f();
                }
            });
        }

        @Override // v60.AbstractC27938j.a
        /* renamed from: b */
        public void mo68402b() {
            MessagesView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.h
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.C12189f0.this.m68399e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$g */
    /* loaded from: classes5.dex */
    public class C12190g implements C28929i.a {

        /* renamed from: a */
        final /* synthetic */ List f63686a;

        C12190g(List list) {
            this.f63686a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m68404d() {
            MainTabView m67645lM;
            if (!MessagesView.this.m68385uO() && (m67645lM = MainTabView.m67645lM()) != null) {
                m67645lM.m67693gM();
            }
        }

        @Override // wd0.C28929i.a
        /* renamed from: a */
        public void mo68405a() {
            MessagesView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.b
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.C12190g.this.m68404d();
                }
            });
            MessagesView.this.f63572R0.m68684e0(this.f63686a);
            MessagesView.this.f72421L0.mo78960q3();
            C19669z.m103146Y().m103198O0();
        }

        @Override // wd0.C28929i.a
        /* renamed from: b */
        public void mo68406b(C20096c c20096c) {
            if (c20096c != null && c20096c.m104491c() == -1003) {
                ToastUtils.showMess(AbstractC23136l9.m118749t0(MessagesView.this.m92686rK(), AbstractC8020f0.str_you_can_only_mark_50_conversations_as_unread));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118749t0(MessagesView.this.m92686rK(), AbstractC8020f0.error_unknown));
            }
            MessagesView.this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$g0 */
    /* loaded from: classes5.dex */
    public static class C12191g0 {

        /* renamed from: a */
        public String f63688a;

        /* renamed from: b */
        public boolean f63689b;

        /* renamed from: c */
        public boolean f63690c;

        public C12191g0(String str, boolean z11, boolean z12) {
            this.f63688a = str;
            this.f63689b = z11;
            this.f63690c = z12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$h */
    /* loaded from: classes5.dex */
    public class C12192h implements C7860a.c {
        C12192h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m68408f() {
            C19669z.m103146Y().m103198O0();
            MessagesView.this.m68274tR();
            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_toast_label_as_read_later, C7860a.Companion.m40303b().m40273Q(1)));
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: a */
        public void mo40215a(C20096c c20096c) {
            if (c20096c != null) {
                ToastUtils.m89268p(c20096c.m104492d());
            }
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: b */
        public void mo40216b(Object obj) {
            MessagesView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.c
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.C12192h.this.m68408f();
                }
            });
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: c */
        public void mo40217c() {
            MessagesView.this.f72421L0.mo46829Y();
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: d */
        public void mo40218d() {
            MessagesView.this.f72421L0.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$i */
    /* loaded from: classes5.dex */
    public class C12193i implements C7860a.c {
        C12193i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m68410f() {
            C19669z.m103146Y().m103198O0();
            MessagesView.this.m68274tR();
            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_toast_label_as_focused, C7860a.Companion.m40303b().m40273Q(0)));
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: a */
        public void mo40215a(C20096c c20096c) {
            if (c20096c != null) {
                ToastUtils.m89268p(c20096c.m104492d());
            }
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: b */
        public void mo40216b(Object obj) {
            MessagesView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.d
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.C12193i.this.m68410f();
                }
            });
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: c */
        public void mo40217c() {
            MessagesView.this.f72421L0.mo46829Y();
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: d */
        public void mo40218d() {
            MessagesView.this.f72421L0.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$j */
    /* loaded from: classes5.dex */
    public class C12194j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f63693a;

        /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$j$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42343ac(C12194j.this.f63693a);
                C7960e.m41971c6().m42376e4(C12194j.this.f63693a);
            }
        }

        C12194j(String str) {
            this.f63693a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MessagesView messagesView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    messagesView = MessagesView.this;
                    messagesView.f63565O2 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MessagesView.this.f63565O2 = false;
                    messagesView = MessagesView.this;
                }
                messagesView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                MessagesView messagesView2 = MessagesView.this;
                messagesView2.f63565O2 = false;
                messagesView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        int optInt = jSONObject.optInt("error_code", -1000);
                        if (optInt == 0) {
                            C21927m.m114302u().m114342k0(this.f63693a);
                            MessagesView.this.m68097AO().m101508a(new C28927g.b(this.f63693a));
                            C0824j.m2153b(new a());
                            Map map = AbstractC23304d.f113405l;
                            C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                            if (c31965ic != null) {
                                int m153681a = c31965ic.m153681a();
                                if (m153681a > 0) {
                                    m153681a--;
                                }
                                ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(m153681a);
                            }
                            if (!TextUtils.isEmpty(this.f63693a)) {
                                AbstractC23181q.m119431d(this.f63693a, false);
                            }
                            C19669z.m103146Y().m103198O0();
                        } else {
                            ToastUtils.m89264l(new C20096c(optInt, AbstractC23161o1.m119318c(optInt, "")));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MessagesView messagesView = MessagesView.this;
                messagesView.f63565O2 = false;
                messagesView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                MessagesView messagesView2 = MessagesView.this;
                messagesView2.f63565O2 = false;
                messagesView2.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$k */
    /* loaded from: classes5.dex */
    class C12195k implements Handler.Callback {
        C12195k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                if (message.what == 0) {
                    String str = (String) message.obj;
                    ShowcaseView showcaseView = MessagesView.this.f63546G2;
                    if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(str, MessagesView.this.f63546G2.getShowcaseId())) {
                        MessagesView.this.f63546G2.m74626d();
                        MessagesView.this.f63546G2 = null;
                    }
                    MessagesView.this.m68353ZN(str);
                    MessagesView.this.m68352YN(str);
                    return false;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$l */
    /* loaded from: classes5.dex */
    public class C12196l implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f63697a;

        /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$l$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f63699a;

            a(ContactProfile contactProfile) {
                this.f63699a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f63699a);
            }
        }

        C12196l(String str) {
            this.f63697a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MessagesView messagesView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    messagesView = MessagesView.this;
                    messagesView.f63568P2 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MessagesView.this.f63568P2 = false;
                    messagesView = MessagesView.this;
                }
                messagesView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                MessagesView messagesView2 = MessagesView.this;
                messagesView2.f63568P2 = false;
                messagesView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        if (!jSONObject.has("data") || jSONObject.isNull("data") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            str = "";
                            str2 = str;
                            i11 = 0;
                        } else {
                            i11 = optJSONObject.optInt("action", 0);
                            str2 = optJSONObject.optString("alias");
                            str = optJSONObject.optString("desc");
                        }
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(this.f63697a);
                        if (m141809c == null) {
                            MessagesView messagesView = MessagesView.this;
                            messagesView.f63568P2 = false;
                            messagesView.f72421L0.mo78960q3();
                            return;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(this.f63697a)) {
                            m141809c.f42438s0 = ((C31965ic) map.get(this.f63697a)).m153681a();
                        }
                        m141809c.f42441t0 = true;
                        m141809c.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str2)) {
                            m141809c.f42442t1 = str2;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            m141809c.f42436r1 = new SpannableStringBuilder(str);
                        }
                        if (C21927m.m114302u().m114357s() != null) {
                            if (!C21927m.m114302u().m114357s().m153137g(this.f63697a)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(this.f63697a) != null) {
                                m141809c = C21927m.m114302u().m114357s().m153138j(this.f63697a);
                                m141809c.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str2)) {
                                    m141809c.f42442t1 = str2;
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    m141809c.f42436r1 = new SpannableStringBuilder(str);
                                }
                            }
                        }
                        AbstractC23074g2.m118375a(0, this.f63697a, "", 1);
                        C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic != null) {
                            ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                        }
                        c28203u6.m141806D(this.f63697a, false);
                        if (!TextUtils.isEmpty(m141809c.f42434r)) {
                            AbstractC23181q.m119431d(m141809c.f42434r, true);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MessagesView messagesView2 = MessagesView.this;
                messagesView2.f63568P2 = false;
                messagesView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                MessagesView messagesView3 = MessagesView.this;
                messagesView3.f63568P2 = false;
                messagesView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$m */
    /* loaded from: classes5.dex */
    public class C12197m implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f63701a;

        /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$m$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f63703a;

            a(ContactProfile contactProfile) {
                this.f63703a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42131G7(this.f63703a, true);
                C7960e.m41971c6().m42234Pb(C12197m.this.f63701a.f42434r);
            }
        }

        C12197m(ContactProfile contactProfile) {
            this.f63701a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                try {
                    i11 = c20096c.m104491c();
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                        i11 = -1000;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                ToastUtils.m89259g(i11);
            } finally {
                MessagesView.this.f72421L0.mo78960q3();
                MessagesView.this.f63571Q2 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            ToastUtils.m89259g(i11);
                            MessagesView.this.f63571Q2 = false;
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                            C19669z.m103146Y().m103198O0();
                            AbstractC23088h5.m118426g();
                            C18644n.m98524E();
                            MessagesView.this.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    AbstractC21935u.m114558y(this.f63701a.f42434r);
                    if (!TextUtils.isEmpty(this.f63701a.f42434r)) {
                        contactProfile = C18644n.m98531l().m98552o(this.f63701a.f42434r);
                        if (contactProfile == null) {
                            contactProfile = C28203u6.f131407a.m141809c(this.f63701a.f42434r);
                        }
                    } else {
                        contactProfile = null;
                    }
                    if (contactProfile == null) {
                        contactProfile = this.f63701a;
                    }
                    contactProfile.f42403c1 = false;
                    C28203u6.f131407a.m141824w(contactProfile);
                    C21927m.m114302u().m114350o0(this.f63701a.f42434r);
                    if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f63701a.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f63701a.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    C0824j.m2153b(new a(contactProfile));
                    MessagesView messagesView = MessagesView.this;
                    messagesView.f72421L0.mo70710wy(messagesView.f63586V2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MessagesView.this.f63571Q2 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                MessagesView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                MessagesView.this.f63571Q2 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                MessagesView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$n */
    /* loaded from: classes5.dex */
    public class C12198n implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f63705a;

        C12198n(ContactProfile contactProfile) {
            this.f63705a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89259g(c20096c.m104491c());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MessagesView.this.f72421L0.mo78960q3();
                MessagesView.this.f63574R2 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            ToastUtils.m89259g(i11);
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                            C19669z.m103146Y().m103198O0();
                            C18644n.m98524E();
                            MessagesView messagesView = MessagesView.this;
                            messagesView.f63574R2 = false;
                            messagesView.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    ContactProfile contactProfile = this.f63705a;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    MessagesView messagesView2 = MessagesView.this;
                    messagesView2.f72421L0.mo70710wy(messagesView2.f63586V2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                C19669z.m103146Y().m103198O0();
                C18644n.m98524E();
                MessagesView messagesView3 = MessagesView.this;
                messagesView3.f63574R2 = false;
                messagesView3.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                C19669z.m103146Y().m103198O0();
                C18644n.m98524E();
                MessagesView messagesView4 = MessagesView.this;
                messagesView4.f63574R2 = false;
                messagesView4.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$o */
    /* loaded from: classes5.dex */
    class C12199o extends AbstractC23116k0.a {
        C12199o() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            C17487o0 c17487o0;
            interfaceC17463d.dismiss();
            try {
                if (i11 == 4) {
                    if (MessagesView.this.f72421L0.m92676n2() != null) {
                        c17487o0 = MessagesView.this.f72421L0.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    C17487o0 c17487o02 = c17487o0;
                    if (c17487o02 != null) {
                        c17487o02.m93060e2(AbstractC6918a0.zalo_view_container, GroupNotificationSettingView.m80298mM(MessagesView.this.f63564O1.mo97719a(), ((C18440b) MessagesView.this.f63564O1).m97729o(), 1), "ManageGroupView", 1, true);
                        return;
                    }
                    return;
                }
                MessagesView.this.m68129KN(AbstractC19646n0.m103040w0(i11, MessagesView.this.f63564O1.mo97719a(), MessagesView.this.f63564O1.mo97724g(), 3));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$p */
    /* loaded from: classes5.dex */
    class C12200p extends InterfaceC17463d.b {
        C12200p() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.b, com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            super.mo605K8(interfaceC17463d, i11);
            AbstractC23152n3.m119082z0();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$q */
    /* loaded from: classes5.dex */
    class C12201q extends InterfaceC17463d.b {
        C12201q() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.b, com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            super.mo605K8(interfaceC17463d, i11);
            if (!AbstractC23088h5.m118421b()) {
                AbstractC23088h5.m118424e(MainApplication.getAppContext());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$r */
    /* loaded from: classes5.dex */
    public class C12202r implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f63710a;

        C12202r(C24275a c24275a) {
            this.f63710a = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    ((CommonZaloview) MessagesView.this).f72827B0.post(MessagesView.this.f63586V2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MessagesView.this.f63577S2 = false;
                MessagesView.this.f72421L0.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C7860a.Companion.m40303b().m40260C0();
                    C0804b.m2025g().m2029b(this.f63710a);
                    ((CommonZaloview) MessagesView.this).f72827B0.post(MessagesView.this.f63586V2);
                    MessagesView.this.f63577S2 = false;
                    MessagesView.this.f72421L0.mo49315c4();
                    if (!MessagesView.this.f72421L0.m92672lJ()) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MessagesView.this.f63577S2 = false;
                    MessagesView.this.f72421L0.mo49315c4();
                    if (!MessagesView.this.f72421L0.m92672lJ()) {
                        return;
                    }
                }
                MessagesView.this.m68198dO();
            } catch (Throwable th2) {
                MessagesView.this.f63577S2 = false;
                MessagesView.this.f72421L0.mo49315c4();
                if (MessagesView.this.f72421L0.m92672lJ()) {
                    MessagesView.this.m68198dO();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$s */
    /* loaded from: classes5.dex */
    public class C12203s implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f63712a;

        C12203s(String str) {
            this.f63712a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    ((CommonZaloview) MessagesView.this).f72827B0.post(MessagesView.this.f63586V2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MessagesView.this.f63577S2 = false;
                MessagesView.this.f72421L0.mo49315c4();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v6, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    C0804b.m2025g().m2035l(this.f63712a, true);
                    ((CommonZaloview) MessagesView.this).f72827B0.post(MessagesView.this.f63586V2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MessagesView.this.f63577S2 = z11;
                MessagesView.this.f72421L0.mo49315c4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$t */
    /* loaded from: classes5.dex */
    public class C12204t extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f63714a;

        C12204t(String str) {
            this.f63714a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            HashMap m2384b;
            try {
                C0855y0 c0855y0 = MessagesView.this.f63589W2;
                if (c0855y0 == null) {
                    m2384b = new HashMap();
                } else {
                    m2384b = c0855y0.m2384b();
                }
                if (m2384b.containsKey("mediabox")) {
                    C23669z c23669z = (C23669z) m2384b.get("mediabox");
                    if (c23669z instanceof C23651h) {
                        C23651h c23651h = (C23651h) c23669z;
                        if (c23651h.f114659f != null && c23651h.m123964l()) {
                            if (c23651h.f114659f[2].equals(this.f63714a)) {
                                String str = c23651h.f114659f[0];
                                if (str == null || str.isEmpty()) {
                                    str = "1";
                                }
                                c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                            } else {
                                c23669z.f114656c = System.currentTimeMillis();
                                c23651h.f114659f[0] = String.valueOf(1);
                                c23651h.f114659f[2] = this.f63714a;
                            }
                        }
                    }
                } else {
                    C23651h m123961i = C23651h.m123961i(6, String.valueOf(1), "mediabox", this.f63714a);
                    if (m123961i != null) {
                        m123961i.f114654a = 3;
                        m123961i.f114655b = 2;
                        m123961i.f114657d = 6;
                        m2384b.put("mediabox", m123961i);
                    }
                }
                C23669z c23669z2 = (C23669z) m2384b.get("mediabox");
                if (c23669z2 != null) {
                    C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z2);
                }
                MessagesView messagesView = MessagesView.this;
                if (messagesView.f63589W2 == null) {
                    messagesView.f63589W2 = new C0855y0();
                }
                MessagesView.this.f63589W2.m2387e(m2384b);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$u */
    /* loaded from: classes5.dex */
    public class C12205u implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f63716a;

        C12205u(long j11) {
            this.f63716a = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MessagesView messagesView = MessagesView.this;
            messagesView.f63580T2 = false;
            messagesView.f72421L0.mo78960q3();
            ToastUtils.showMess(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            MessagesView messagesView = MessagesView.this;
            messagesView.f63580T2 = false;
            try {
                messagesView.f72421L0.mo78960q3();
                C7960e.m41971c6().m42461m4(this.f63716a);
                C19669z.f97566N.set(false);
                C19669z.f97567O.set(false);
                C19669z.m103146Y().m103198O0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$v */
    /* loaded from: classes5.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC12206v implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC12206v() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (MessagesView.this.f63543F1.getAdapter().mo10003k() > 0) {
                MessagesView.this.f63543F1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C17793b.m93923d().m93933m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$w */
    /* loaded from: classes5.dex */
    public class C12207w implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31874cb f63719a;

        C12207w(C31874cb c31874cb) {
            this.f63719a = c31874cb;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MessagesView messagesView = MessagesView.this;
                messagesView.f63583U2 = false;
                messagesView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C31874cb c31874cb = this.f63719a;
                    if (c31874cb.f146399o == 2) {
                        AbstractC23059e9.m118317F(c31874cb.f146385a);
                    }
                    AbstractC23063f2.m118364p(this.f63719a.f146385a);
                    AbstractC23074g2.m118375a(1, this.f63719a.f146385a, "", 1);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MessagesView messagesView = MessagesView.this;
                messagesView.f63583U2 = false;
                messagesView.f72421L0.mo78960q3();
                C21933s.m114404I().m114493u();
            } catch (Throwable th2) {
                MessagesView messagesView2 = MessagesView.this;
                messagesView2.f63583U2 = false;
                messagesView2.f72421L0.mo78960q3();
                C21933s.m114404I().m114493u();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$x */
    /* loaded from: classes5.dex */
    class RunnableC12208x implements Runnable {
        RunnableC12208x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C12260j c12260j = MessagesView.this.f63579T1;
                if (c12260j != null) {
                    c12260j.m10008p();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$y */
    /* loaded from: classes5.dex */
    public class C12209y extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f63722p;

        C12209y(boolean z11) {
            this.f63722p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            MessagesView.this.f63610d3 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MessagesView messagesView = MessagesView.this;
            messagesView.f63610d3 = false;
            if (!this.f63722p) {
                messagesView.f63545G1.setVisibility(8);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            MessagesView messagesView = MessagesView.this;
            messagesView.f63610d3 = true;
            if (this.f63722p) {
                messagesView.f63545G1.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.MessagesView$z */
    /* loaded from: classes5.dex */
    public class C12210z implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f63724a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f63725b;

        C12210z(int i11, ContactProfile contactProfile) {
            this.f63724a = i11;
            this.f63725b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m68412d(ContactProfile contactProfile) {
            Bundle bundle = new Bundle();
            bundle.putString("uid", contactProfile.f42434r);
            bundle.putString("dpn", contactProfile.f42437s);
            bundle.putString("phone", contactProfile.f42455y);
            bundle.putString("avatar", contactProfile.f42446v);
            if (MessagesView.this.m92676n2() != null) {
                MessagesView.this.m92676n2().mo35581q(WriteInvitationView.class, bundle, 1085, 1, true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MessagesView messagesView = MessagesView.this;
                messagesView.f63636n2 = z11;
                messagesView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            MessagesView messagesView;
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
                                    if (!C18644n.m98531l().m98558u(MessagesView.this.f63627j2)) {
                                        TrackingSource trackingSource = new TrackingSource(this.f63724a);
                                        trackingSource.m40677a("sourceView", 1);
                                        C21927m.m114302u().m114330e0(this.f63725b.f42434r, trackingSource);
                                        if (AbstractC21935u.m114553t(1)) {
                                            MessagesView messagesView2 = MessagesView.this;
                                            final ContactProfile contactProfile = this.f63725b;
                                            messagesView2.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.e
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    MessagesView.C12210z.this.m68412d(contactProfile);
                                                }
                                            });
                                        } else {
                                            MessagesView.this.m68340RQ(this.f63725b, this.f63724a);
                                            z11 = false;
                                        }
                                    } else {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(MessagesView.this.f63627j2);
                                        AbstractC23074g2.m118375a(0, MessagesView.this.f63627j2, "", 1);
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(MessagesView.this.f63627j2);
                                    AbstractC23074g2.m118375a(0, MessagesView.this.f63627j2, "", 1);
                                    if (!AbstractC21935u.m114558y(MessagesView.this.f63627j2)) {
                                        MessagesView messagesView3 = MessagesView.this;
                                        messagesView3.m68392zR(messagesView3.f63627j2);
                                    }
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(MessagesView.this.f63627j2);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(MessagesView.this.f63627j2, optInt2);
                                AbstractC2364o0.m12373p(MessagesView.this, 22);
                            } else {
                                AbstractC23063f2.m118349a(this.f63725b);
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(MessagesView.this.f63627j2);
                                AbstractC23074g2.m118375a(0, MessagesView.this.f63627j2, "", 1);
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(MessagesView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            MessagesView.this.f63600a2 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(MessagesView.this, 100);
                        }
                    }
                    messagesView = MessagesView.this;
                    messagesView.f63636n2 = false;
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    messagesView = MessagesView.this;
                    messagesView.f63636n2 = false;
                }
                messagesView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                MessagesView messagesView4 = MessagesView.this;
                messagesView4.f63636n2 = false;
                messagesView4.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AO */
    public C28927g m68097AO() {
        if (this.f63615f2 == null) {
            this.f63615f2 = AbstractC23306f.m120616S();
        }
        return this.f63615f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AP */
    public /* synthetic */ void m68098AP(Integer num) {
        m68265rQ();
    }

    /* renamed from: AQ */
    private void m68099AQ() {
        try {
            this.f72421L0.showDialog(31);
            C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(20).m123925r("chats_list").m123924q(1).m123923p("chat_label_menu"), true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63530k3, e11);
        }
    }

    /* renamed from: BO */
    private int m68102BO() {
        return this.f63572R0.m68675Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BP */
    public static /* synthetic */ Void m68103BP() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CP */
    public /* synthetic */ void m68106CP(RecyclerView recyclerView, int i11, View view) {
        int i12;
        C12260j c12260j = this.f63579T1;
        if (c12260j != null && c12260j.mo10003k() > i11 && i11 >= 0) {
            C18451m m68698R = this.f63579T1.m68698R(i11);
            if (m68698R != null && ((i12 = m68698R.f92990a) == 2 || i12 == 25 || i12 == 40 || i12 == 42 || i12 == 5 || i12 == 6)) {
                return;
            }
            m68319HQ(i11);
        }
    }

    /* renamed from: CQ */
    private void m68107CQ() {
        try {
            C32044o1.m154612r().m154617L("chats_list", false);
            m68358dR(false);
            C32044o1.m154612r().m154626j();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:            if (r0 != 40) goto L33;     */
    /* renamed from: DP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ boolean m68110DP(RecyclerView recyclerView, int i11, View view) {
        AbstractC23647d.m123907q("2600", "");
        AbstractC23647d.m123893c();
        C12260j c12260j = this.f63579T1;
        if (c12260j != null && i11 >= 0 && i11 < c12260j.mo10003k()) {
            C18451m m68698R = this.f63579T1.m68698R(i11);
            this.f63567P1 = m68698R;
            if (m68698R != null) {
                int i12 = m68698R.f92990a;
                if (i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5 && i12 != 6 && i12 != 8) {
                    if (i12 != 22) {
                        if (i12 != 25) {
                            if (i12 != 35) {
                            }
                        }
                    } else {
                        this.f72421L0.showDialog(28);
                        return true;
                    }
                }
                return false;
            }
            if (m68698R != null) {
                if (this.f63584V0 != 0) {
                    return m68384tQ(m68698R.mo97719a());
                }
                if (m68698R instanceof C18452n) {
                    if (((C18452n) m68698R).m97769o().m153485f() != 1) {
                        return false;
                    }
                    m68361fR();
                    return true;
                }
                m68328LO();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EP */
    public /* synthetic */ void m68113EP() {
        if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().mo35576n3() && this.f72421L0.m92672lJ() && MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125971o()) {
            m68278uQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FP */
    public /* synthetic */ void m68116FP(InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        try {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                C22438j.m115930D(c17487o0, 4, C26263i.m135058w());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GP */
    public /* synthetic */ void m68119GP(KeyEventCallbackC17462c keyEventCallbackC17462c, AdapterView adapterView, View view, int i11, long j11) {
        if (keyEventCallbackC17462c != null) {
            try {
                keyEventCallbackC17462c.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122774d(f63530k3, e11.toString());
                return;
            }
        }
        boolean z11 = false;
        if (i11 == 0) {
            AbstractC23647d.m123907q("2103", "");
            C7960e.m41971c6().m42461m4(((C18452n) this.f63567P1).m97771q().m137372b());
            C19669z.f97566N.set(false);
            C19669z.f97567O.set(false);
            AbstractC23647d.m123893c();
            C19669z.m103146Y().m103198O0();
            return;
        }
        if (i11 == 2) {
            z11 = true;
        }
        m68377qO(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HP */
    public /* synthetic */ void m68122HP(InterfaceC17463d interfaceC17463d) {
        this.f63593Y0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IP */
    public /* synthetic */ void m68125IP(InterfaceC17463d interfaceC17463d) {
        this.f63593Y0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JP */
    public /* synthetic */ void m68127JP(InterfaceC17463d interfaceC17463d) {
        this.f63593Y0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public void m68129KN(C24275a c24275a) {
        if (c24275a == null || this.f63577S2) {
            return;
        }
        this.f63577S2 = true;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12202r(c24275a));
        c0766k.mo1652h7(c24275a, new MuteTrackingSource(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KP */
    public static /* synthetic */ void m68130KP(InterfaceC17463d interfaceC17463d) {
        try {
            AbstractC23647d.m123906p("22001303");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LP */
    public /* synthetic */ void m68132LP(InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        try {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
                c17487o02.m93066i2(SettingMessageV2View.class, bundle, 1035, 1, true);
                C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(20).m123925r("chat_label_menu").m123924q(0).m123923p("chat_label_setting"), true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: LQ */
    private void m68133LQ(C18451m c18451m) {
        int i11;
        if (c18451m == null || this.f63577S2) {
            return;
        }
        this.f63577S2 = true;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        if (c18451m.mo97724g()) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        String mo97719a = c18451m.mo97719a();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12203s(mo97719a));
        c0766k.mo1413D8(i11, mo97719a, new MuteTrackingSource(1));
    }

    /* renamed from: MO */
    private void m68135MO(C31931g8 c31931g8) {
        if (c31931g8 == null) {
            return;
        }
        try {
            ContactProfile m118435c = AbstractC23089h6.m118435c(c31931g8);
            if (m118435c != null) {
                Spanned m119746j = AbstractC23244v8.m119746j(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_msg_success), AbstractC23089h6.m118437e(m118435c.f42434r)));
                if (!TextUtils.isEmpty(m119746j)) {
                    ToastUtils.showMess(false, (CharSequence) m119746j);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MP */
    public static /* synthetic */ void m68136MP() {
        try {
            AbstractC28025b8.m141442M("tip.message.compose");
            AbstractC23647d.m123897g("200003");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NO, reason: merged with bridge method [inline-methods] */
    public void m68303zP(C12259i.a aVar) {
        if (aVar instanceof C12259i.a.b) {
            m68180YQ(((C12259i.a.b) aVar).m68690a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NP */
    public /* synthetic */ void m68139NP() {
        C13306b m68316GO;
        if (MainTabView.m67645lM() != null && (m68316GO = m68316GO()) != null && m68316GO.m74707p()) {
            m68316GO.m74704l(AbstractC28025b8.f130850g);
            this.f63621h2.sendMessageDelayed(this.f63621h2.obtainMessage(0, "tip.message.compose"), 500L);
        }
    }

    /* renamed from: NQ */
    private void m68140NQ(Parcelable parcelable) {
        LinearLayoutManager linearLayoutManager = this.f63591X1;
        if (linearLayoutManager != null && parcelable != null) {
            linearLayoutManager.mo9742a1(parcelable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OP */
    public /* synthetic */ void m68142OP() {
        this.f72421L0.showDialog(101);
    }

    /* renamed from: PO */
    private void m68144PO(View view) {
        E2eeDefault11Banner e2eeDefault11Banner = (E2eeDefault11Banner) view.findViewById(AbstractC6918a0.e2ee_default_11_banner);
        e2eeDefault11Banner.setDelegate(new C12185d0(e2eeDefault11Banner));
        C31986k3 c31986k3 = C31986k3.f147083a;
        if (c31986k3.m154110T1() && c31986k3.m154106Q1() && AbstractC0924m0.m4312w9() && (AbstractC0924m0.m3766e0() == 0 || (AbstractC0924m0.m3766e0() <= AbstractC0924m0.m3215L4() && !AbstractC0924m0.m3103H8() && AbstractC0924m0.m4007m1() > 0 && AbstractC23306f.m120579F1().mo124314i() - AbstractC0924m0.m4338x6() > AbstractC0924m0.m4007m1() * 86400000))) {
            e2eeDefault11Banner.setVisibility(0);
        } else {
            e2eeDefault11Banner.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PP */
    public /* synthetic */ void m68145PP() {
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
    }

    /* renamed from: QO */
    private void m68147QO(int i11) {
        String format;
        int i12;
        int i13;
        if (C32044o1.m154612r().m154620O()) {
            int m103223i0 = C19669z.m103146Y().m103223i0();
            if (m103223i0 == 1) {
                i13 = AbstractC8020f0.str_deleting_single_conversation_with_quantity;
            } else {
                i13 = AbstractC8020f0.str_deleting_multi_conversations;
            }
            format = AbstractC23136l9.m118746s0(i13, Integer.valueOf(m103223i0));
        } else if (C32044o1.m154612r().m154621P()) {
            int m103222h0 = C19669z.m103146Y().m103222h0();
            if (m103222h0 == 1) {
                i12 = AbstractC8020f0.str_deleting_single_conversation_with_quantity;
            } else {
                i12 = AbstractC8020f0.str_deleting_multi_conversations;
            }
            format = AbstractC23136l9.m118746s0(i12, Integer.valueOf(m103222h0));
        } else if (i11 == 1) {
            if (this.f63555L1) {
                format = AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_delete_conversation_photo_video);
            } else {
                format = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleting_single_conversation);
            }
        } else if (this.f63555L1) {
            format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_delete_list_conversation_photo_video), Integer.valueOf(i11));
        } else {
            format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleting_multi_conversations), Integer.valueOf(i11));
        }
        Snackbar m90634w = Snackbar.m90634w(m92691vK(), format, (int) AbstractC0924m0.m3653a7());
        this.f63553K1 = m90634w;
        m90634w.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: t70.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagesView.this.m68245nP(view);
            }
        });
        this.f63553K1.m90641G(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QP */
    public /* synthetic */ void m68148QP(boolean z11, C31931g8 c31931g8) {
        if (z11) {
            m68135MO(c31931g8);
        }
        C2852a1.m13746d();
    }

    /* renamed from: QQ */
    private void m68149QQ(C18431b c18431b) {
        C18451m m40269M;
        C3533a m2606G;
        if (c18431b != null && c18431b.m97663a() && !C18935d.m99214s().m99232y() && (m40269M = C7860a.Companion.m40303b().m40269M(c18431b.m97666d())) != null && (m2606G = AbstractC23306f.m120584H0().m2606G(m40269M.mo97719a())) != null) {
            new C0757b().m1350q(c18431b.m97665c(), m2606G.m17912g());
        }
    }

    /* renamed from: RN */
    private void m68151RN() {
        try {
            if (C32026md.f147453a.m154442n().size() > 0 && this.f63543F1 != null) {
                boolean z11 = false;
                for (int i11 = 0; i11 < this.f63543F1.getChildCount(); i11++) {
                    View childAt = this.f63543F1.getChildAt(i11);
                    if (childAt instanceof ZinstantAdItemView) {
                        ZinstantAdItemView zinstantAdItemView = (ZinstantAdItemView) childAt;
                        if (m92672lJ() && mo68310EF()) {
                            z11 = true;
                        }
                        zinstantAdItemView.m75988c(z11);
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RO */
    private void m68152RO() {
        if (this.f63605c1 == null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            if (m92656bJ == null) {
                C24559a.m127933c("[ConversationLabel]", "initViewStubConversationLabelTab rootView = null");
                return;
            }
            C24559a.m127933c("[ConversationLabel]", "initViewStubConversationLabelTab");
            ViewStub viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.stub_conversation_label_tab);
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                this.f63605c1 = inflate;
                this.f63602b1 = new C24773h[2];
                this.f63596Z0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.tab_container);
                this.f63599a1 = (ZdsTabBar) this.f63605c1.findViewById(AbstractC6918a0.tab_bar);
                this.f63617g1 = this.f63605c1.findViewById(AbstractC6918a0.iv_filter);
                this.f63620h1 = this.f63605c1.findViewById(AbstractC6918a0.iv_filter_badge);
                this.f63626j1 = this.f63605c1.findViewById(AbstractC6918a0.tv_title_all);
                this.f63623i1 = this.f63605c1.findViewById(AbstractC6918a0.title_all_container);
                this.f63629k1 = this.f63605c1.findViewById(AbstractC6918a0.tag_filter_container);
                this.f63631l1 = (AppCompatImageView) this.f63605c1.findViewById(AbstractC6918a0.iv_tag_filter);
                this.f63633m1 = (RobotoTextView) this.f63605c1.findViewById(AbstractC6918a0.tv_tag_filter);
                this.f63637o1 = this.f63605c1.findViewById(AbstractC6918a0.tab_container_left);
                this.f63639p1 = this.f63605c1.findViewById(AbstractC6918a0.tab_container_right);
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.f63605c1.findViewById(AbstractC6918a0.ic_reset_tag_filter);
                this.f63635n1 = appCompatImageView;
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: t70.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MessagesView.this.m68249oP(view);
                    }
                });
                this.f63626j1.setOnLongClickListener(new View.OnLongClickListener() { // from class: t70.u
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m68255pP;
                        m68255pP = MessagesView.this.m68255pP(view);
                        return m68255pP;
                    }
                });
                this.f63599a1.setTabType(ZdsTabBar.EnumC17062h.SCROLLABLE.m91314c());
                this.f63608d1.m128755s(m68285wO());
                this.f63611e1.m128755s(m68285wO());
                C24773h[] c24773hArr = this.f63602b1;
                C24773h c24773h = this.f63608d1;
                c24773hArr[0] = c24773h;
                c24773hArr[1] = this.f63611e1;
                this.f63599a1.m91303M(c24773h);
                this.f63599a1.m91303M(this.f63611e1);
                this.f63599a1.setOnItemClickListener(new ZdsTabBar.InterfaceC17059e() { // from class: t70.v
                    @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.InterfaceC17059e
                    /* renamed from: i0 */
                    public final void mo87275i0(RecyclerView recyclerView, int i11, View view) {
                        MessagesView.this.m68260qP(recyclerView, i11, view);
                    }
                });
                this.f63599a1.setOnItemLongClickListener(new ZdsTabBar.InterfaceC17060f() { // from class: t70.w
                    @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.InterfaceC17060f
                    /* renamed from: T3 */
                    public final boolean mo91310T3(RecyclerView recyclerView, int i11, View view) {
                        boolean m68264rP;
                        m68264rP = MessagesView.this.m68264rP(recyclerView, i11, view);
                        return m68264rP;
                    }
                });
                this.f63617g1.setOnClickListener(new View.OnClickListener() { // from class: t70.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MessagesView.this.m68268sP(view);
                    }
                });
                this.f63617g1.setOnLongClickListener(new View.OnLongClickListener() { // from class: t70.y
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m68273tP;
                        m68273tP = MessagesView.this.m68273tP(view);
                        return m68273tP;
                    }
                });
                this.f63629k1.setOnClickListener(new View.OnClickListener() { // from class: t70.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MessagesView.this.m68277uP(view);
                    }
                });
                this.f63605c1.bringToFront();
                this.f63614f1 = new HashMap();
                C24559a.m127933c("[ConversationLabel]", "updateTabUI -> initViewStubConversationLabel -> success");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RP */
    public /* synthetic */ void m68153RP() {
        try {
            C31862c c31862c = AbstractC23304d.f113284H2;
            if (c31862c != null && c31862c.m153155h() && c31862c.m153149a() && !c31862c.f146332y) {
                m68355aR(c31862c);
            } else {
                m68335OO();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SN */
    private void m68155SN(boolean z11, int i11, boolean z12) {
        String m118743r0;
        RecyclerView recyclerView;
        if (z11) {
            try {
                m68152RO();
                if (this.f63605c1 == null) {
                    C24559a.m127933c("[ConversationLabel]", "updateTabUI mViewStubConversationLabelTabLayout=null");
                    return;
                }
                m68298yQ();
                m68251oR();
                this.f63561N1 = i11;
                for (int i12 = 0; i12 < 2; i12++) {
                    if (i12 == 0) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_focused_tab);
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_others_tab);
                    }
                    this.f63602b1[i12].m128758v(m118743r0);
                }
                this.f63599a1.m91301J(this.f63561N1, false);
                this.f63599a1.m91305S();
                if (C19669z.m103146Y().m103226p0()) {
                    m68274tR();
                }
                int i13 = this.f63584V0;
                if (i13 != 0) {
                    m68348WQ(i13);
                }
                if (this.f63614f1 != null && this.f63543F1.getScrollState() == 0) {
                    m68140NQ((Parcelable) this.f63614f1.get(Integer.valueOf(i11)));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f63530k3, e11);
                C24559a.m127933c("[ConversationLabel]", "updateTabUI -> exception");
            }
        } else {
            m68269sQ();
        }
        if (z12 && (recyclerView = this.f63543F1) != null) {
            recyclerView.m9837K1(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SP */
    public /* synthetic */ void m68156SP(boolean z11, boolean z12) {
        int i11;
        if (z12) {
            i11 = 0;
        } else {
            i11 = this.f63561N1;
        }
        m68155SN(z11, i11, z12);
        C19669z.m103146Y().m103198O0();
    }

    /* renamed from: TN */
    private void m68158TN() {
        if (m68102BO() == 3 && C18935d.m99214s().m99230r().isEmpty()) {
            this.f63572R0.m68673N(0);
        }
    }

    /* renamed from: TO */
    private boolean m68159TO() {
        C18451m c18451m = (C18451m) new ArrayList(this.f63579T1.m68701U().values()).get(0);
        if (c18451m == null) {
            return false;
        }
        return c18451m.mo97726j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TP */
    public /* synthetic */ void m68160TP(List list, C32041nd c32041nd, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        int intValue = ((Integer) ((C1483e) list.get(i11)).f6374a).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                C32026md.f147453a.m154443o(this, c32041nd.m154574c(), 1, false);
                return;
            }
            return;
        }
        C32026md.f147453a.m154443o(this, c32041nd.m154574c(), 0, false);
    }

    /* renamed from: UN */
    private void m68162UN(int i11, final boolean z11) {
        AbstractC17930e.m94545d().mo94531e(new Runnable() { // from class: t70.w1
            @Override // java.lang.Runnable
            public final void run() {
                MessagesView.m68163UO(z11);
            }
        }, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UO */
    public static /* synthetic */ void m68163UO(boolean z11) {
        if (C21933s.m114404I().m114470i() && z11) {
            C19669z.f97571S.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UP */
    public /* synthetic */ void m68164UP() {
        boolean z11 = false;
        AbstractC23195r2.f112443e = false;
        if (AbstractC23195r2.f112444f == AbstractC23195r2.f112439a) {
            z11 = true;
        }
        m68383tO(z11);
    }

    /* renamed from: VN */
    private void m68166VN() {
        try {
            if (FileDownloadBannerView.f69220v == null) {
                FileDownloadBannerView fileDownloadBannerView = this.f63607c3;
                if (fileDownloadBannerView != null && fileDownloadBannerView.m75720m()) {
                    this.f63607c3.m75717i(false);
                }
            } else {
                FileDownloadBannerView fileDownloadBannerView2 = this.f63607c3;
                if (fileDownloadBannerView2 == null || fileDownloadBannerView2.getTag() == null || !this.f63607c3.getTag().equals(FileDownloadBannerView.f69220v)) {
                    m68354ZQ();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VO */
    public /* synthetic */ void m68167VO() {
        showDialog(30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VP */
    public /* synthetic */ void m68168VP(RecyclerView recyclerView, int i11, View view) {
        m68304zQ(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WN */
    public synchronized void m68170WN(boolean z11) {
        try {
            if (this.f63596Z0 != null && C18932a.f94442a.m99183g()) {
                if (this.f63619g3.get()) {
                    return;
                }
                if (z11) {
                    ObjectAnimator objectAnimator = this.f63556L2;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    m68331NN(this.f63552J2);
                } else if (!this.f63616f3) {
                    m68329MN(this.f63552J2);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WO */
    public /* synthetic */ void m68171WO() {
        try {
            if (C22434f.f109754a.m115888d()) {
                mo70710wy(new Runnable() { // from class: t70.s1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagesView.this.m68167VO();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WP */
    public /* synthetic */ boolean m68172WP(RecyclerView recyclerView, int i11, View view) {
        m68099AQ();
        return true;
    }

    /* renamed from: XN */
    private void m68174XN() {
        if (!AbstractC23306f.m120691m2().m2461l() && AbstractC23304d.f113295K1) {
            AbstractC23304d.f113295K1 = false;
            C22432d.f109743a.m115877a(new Runnable() { // from class: t70.m1
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.this.m68171WO();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XO */
    public /* synthetic */ void m68175XO(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f63546G2) {
            this.f63546G2 = null;
        }
        FrameLayout frameLayout = this.f63550I2;
        if (frameLayout != null && frameLayout.getParent() != null) {
            ((ViewGroup) this.f63550I2.getParent()).removeView(this.f63550I2);
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XP */
    public /* synthetic */ boolean m68176XP(View view) {
        m68099AQ();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YO */
    public /* synthetic */ void m68178YO() {
        ViewGroup viewGroup;
        if (this.f72421L0.m92650VI() == null || (viewGroup = (ViewGroup) this.f72421L0.m92650VI().m92656bJ()) == null) {
            return;
        }
        C12187e0 c12187e0 = new C12187e0(viewGroup);
        this.f63643r1 = c12187e0;
        c12187e0.m140792r(new C12189f0());
        this.f63643r1.mo136489h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YP */
    public /* synthetic */ void m68179YP(View view) {
        this.f63572R0.m68682b0();
        m68261qQ();
    }

    /* renamed from: YQ */
    private void m68180YQ(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_ENTRY_POINT", str);
        m92692wK().mo35581q(ChatTagFilterBottomSheet.class, bundle, 1086, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZO */
    public /* synthetic */ void m68182ZO() {
        if (AbstractC0924m0.m3957kb() && AbstractC0924m0.m3443T0() == 1 && !C18932a.f94442a.m99182f() && !AbstractC0924m0.m3136Ic()) {
            String m3886i0 = AbstractC0924m0.m3886i0();
            if (!TextUtils.isEmpty(m3886i0)) {
                AbstractC28207v1.m141984g3("action.open.zinstantview", 3, this.f72421L0.m92676n2(), this.f72421L0, m3886i0, null, null);
                AbstractC0924m0.m3265Mp(true);
                C7860a.Companion.m40303b().m40260C0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZP */
    public /* synthetic */ void m68183ZP(View view) {
        if (m68102BO() == 3) {
            m68180YQ("filter_chip");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public void m68185aO() {
        try {
            if (!mo67726A2() && this.f72421L0.m92650VI() != null && this.f72421L0.m92650VI().m92656bJ() != null && C18932a.f94442a.m99189m()) {
                AbstractC19444a.m101695c(new Runnable() { // from class: t70.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagesView.this.m68178YO();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aP */
    public /* synthetic */ void m68186aP(InterfaceC17463d interfaceC17463d, int i11) {
        m68254pO(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aQ */
    public /* synthetic */ void m68187aQ(int i11, C12191g0 c12191g0) {
        ColorStateList colorStateList;
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null) {
            return;
        }
        if (actionBar.getActionMode() == null || this.f63590X0 != i11) {
            ActionBarMenu m92709d = this.f88760a0.m92709d();
            m92709d.m92750r();
            m92709d.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar_white);
            View m92744k = m92709d.m92744k(10, AbstractC7409c0.action_mode_back);
            if (m92744k instanceof ImageView) {
                ((ImageView) m92744k).setImageResource(AbstractC16803z.stencils_ic_head_back);
            }
            if (i11 == 2) {
                ActionBarMenuItem m92749q = m92709d.m92749q(12, AbstractC16803z.picker_checkmark_normal, AbstractC23136l9.m118742r(24.0f));
                this.f63578T0 = m92749q;
                m92749q.getIconView().setPadding(0, 0, 0, 0);
                this.f63578T0.getIconView().setScaleType(ImageView.ScaleType.FIT_CENTER);
                View m92744k2 = m92709d.m92744k(12, AbstractC7409c0.action_bar_menu_item_select_all);
                if (m92744k2 instanceof android.widget.Button) {
                    android.widget.Button button = (android.widget.Button) m92744k2;
                    this.f63581U0 = button;
                    button.setPadding(AbstractC23136l9.m118742r(6.0f), 0, 0, 0);
                }
                colorStateList = AbstractC23136l9.m118645D(getContext(), AbstractC16803z.action_menu_text_selector_mark_as_read);
            } else if (i11 == 3) {
                colorStateList = AbstractC23136l9.m118645D(getContext(), AbstractC16803z.action_menu_text_selector_mark_as_read);
            } else if (i11 == 1) {
                colorStateList = AbstractC23136l9.m118645D(getContext(), AbstractC16803z.action_menu_text_selector_delete);
            } else {
                colorStateList = null;
            }
            View m92745l = m92709d.m92745l(11, AbstractC7409c0.action_mode_title, 1);
            if (m92745l instanceof TextView) {
                ((TextView) m92745l).setText("");
            }
            android.widget.Button button2 = (android.widget.Button) m92709d.m92744k(13, AbstractC7409c0.action_bar_menu_item_add);
            this.f63575S0 = button2;
            if (button2 != null && colorStateList != null) {
                button2.setTextColor(colorStateList);
            }
        }
        this.f88760a0.m92725w();
        this.f88760a0.setVisibility(0);
        m68342SQ(c12191g0);
        this.f63590X0 = i11;
    }

    /* renamed from: bO */
    private void m68189bO() {
        C0824j.m2153b(new C12178a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bP */
    public /* synthetic */ void m68190bP(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        HashMap m68701U = this.f63579T1.m68701U();
        if (m68701U != null && !m68701U.isEmpty()) {
            C32044o1.m154612r().m154616K("chats_list", AbstractC17574a.m93602i(m68701U), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bQ */
    public /* synthetic */ void m68191bQ(View view, C17036e c17036e) {
        this.f63641q1.m91179I();
        this.f63572R0.m68685f0(c17036e);
    }

    /* renamed from: cO */
    private void m68193cO() {
        int m103207V = C19669z.m103146Y().m103207V();
        if (m68102BO() != m103207V) {
            this.f63572R0.m68673N(m103207V);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cP */
    public /* synthetic */ void m68194cP(float f11) {
        this.f63543F1.setTranslationY(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cQ */
    public static /* synthetic */ void m68195cQ() {
        C11837a.Companion.m65784a().m65782m();
    }

    /* renamed from: cR */
    private void m68196cR() {
        if (this.f63641q1 == null) {
            ArrayList arrayList = new ArrayList();
            C17036e c17036e = new C17036e();
            c17036e.m91219h(1);
            c17036e.m91218g(AbstractC23136l9.m118663M(AbstractC23322a.zds_ic_unread_message_line_24));
            c17036e.m91220i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unread));
            C17036e c17036e2 = new C17036e();
            c17036e2.m91219h(2);
            c17036e2.m91218g(AbstractC23136l9.m118663M(AbstractC23322a.zds_ic_mentioned_message_line_24));
            c17036e2.m91220i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mentions_me));
            C17036e c17036e3 = new C17036e();
            c17036e3.m91219h(3);
            c17036e3.m91218g(AbstractC23136l9.m118663M(AbstractC23322a.zds_ic_multi_tag_horizontal_line_24));
            c17036e3.m91220i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tag_filter));
            arrayList.add(c17036e);
            arrayList.add(c17036e2);
            arrayList.add(c17036e3);
            this.f63641q1 = new PopoverView(m92689tK());
            C17035d m91215a = new C17035d.a().m91216b(this.f63617g1).m91215a();
            C17033b c17033b = new C17033b(arrayList);
            c17033b.m91192R(new C17033b.b() { // from class: t70.j1
                @Override // com.zing.zalo.zdesign.component.popover.C17033b.b
                /* renamed from: a */
                public final void mo91196a(View view, InterfaceC17034c interfaceC17034c) {
                    MessagesView.this.m68191bQ(view, (C17036e) interfaceC17034c);
                }
            });
            this.f63641q1.m91178H(m91215a, c17033b);
            this.f63641q1.setOnShownListener(new PopoverView.InterfaceC17028b() { // from class: t70.k1
                @Override // com.zing.zalo.zdesign.component.popover.PopoverView.InterfaceC17028b
                /* renamed from: a */
                public final void mo91185a() {
                    MessagesView.m68195cQ();
                }
            });
        }
        if (this.f63641q1.isShown()) {
            this.f63641q1.m91179I();
            return;
        }
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
            if (this.f63550I2 == null) {
                this.f63550I2 = new FrameLayout(this.f72421L0.m92689tK());
            }
            if (this.f63550I2.getParent() != null) {
                ((ViewGroup) this.f63550I2.getParent()).removeView(this.f63550I2);
            }
            View m92656bJ = this.f72421L0.m92656bJ();
            if (m92656bJ instanceof FrameLayout) {
                ((FrameLayout) m92656bJ).addView(this.f63550I2, new FrameLayout.LayoutParams(-1, -1));
            }
            this.f63641q1.m91182R(this.f63550I2);
            return;
        }
        this.f63641q1.m91181Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dO */
    public void m68198dO() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: t70.s
            @Override // java.lang.Runnable
            public final void run() {
                MessagesView.this.m68182ZO();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dP */
    public /* synthetic */ void m68199dP(float f11) {
        this.f63543F1.setTranslationY(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dQ */
    public static /* synthetic */ void m68200dQ(List list, Conversation conversation, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((C1483e) list.get(i11)).f6374a).intValue() == 0) {
            C25489b.m132042t(conversation.f42893q);
            C19669z.m103146Y().m103198O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eP */
    public /* synthetic */ void m68203eP(String str, boolean z11, boolean z12) {
        try {
            try {
                m68302zO().m101508a(new C28926f.b(str, null, 0L, z11));
                if (!z12) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (!z12) {
                    return;
                }
            }
            this.f72421L0.mo78960q3();
        } catch (Throwable th2) {
            if (z12) {
                this.f72421L0.mo78960q3();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eQ */
    public /* synthetic */ void m68204eQ(View view) {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            c17487o0.m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
        }
    }

    /* renamed from: eR */
    private void m68205eR(C28212v6 c28212v6, View view, C13306b c13306b) {
        if (this.f72421L0.getContext() != null) {
            C25297f m130959a = C25297f.Companion.m130959a(this.f72421L0.getContext());
            m130959a.m130907M(c28212v6, this.f72421L0.getContext());
            m130959a.m130925c0(view);
            m130959a.m130920Z(true);
            m130959a.m130911Q(m92689tK().getString(AbstractC8020f0.str_got_it));
            m130959a.m130943l0(3);
            m130959a.m130923b0(AbstractC23222t7.f112566j);
            m130959a.m130912R(EnumC25293b.RECTANGLE);
            TooltipView tooltipView = new TooltipView(this.f72421L0.getContext());
            tooltipView.setConfigs(m130959a);
            tooltipView.m90734d0();
            tooltipView.setTooltipId(c28212v6.f131577c);
            tooltipView.setTooltipManager(c13306b);
            tooltipView.m90733c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fP */
    public /* synthetic */ void m68208fP(String str, C24277c c24277c, ContactProfile contactProfile) {
        if (this.f63650u2 == null) {
            this.f63650u2 = new AnimChat(this.f72421L0.getContext());
        }
        if (this.f63650u2.getParent() == null && this.f63594Y1 != null) {
            this.f63650u2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f63594Y1.addView(this.f63650u2);
            this.f63650u2.m76125x0();
            this.f63650u2.m76101A0(true, false);
            this.f63650u2.setVisibility(0);
        }
        m68317GQ(str, c24277c, contactProfile);
        mo68346Uv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fQ */
    public /* synthetic */ void m68209fQ(int i11, View view) {
        m68312EQ(i11);
    }

    /* renamed from: gO */
    private KeyEventCallbackC17462c m68212gO(int i11) {
        String str;
        String str2;
        String str3;
        String str4 = "";
        switch (i11) {
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                if (this.f63579T1.m68700T() == 1) {
                    C18451m c18451m = (C18451m) new ArrayList(this.f63579T1.m68701U().values()).get(0);
                    if (c18451m instanceof C18440b) {
                        if (c18451m.m97768l()) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_stranger_folder_confirm);
                        } else if (c18451m.m97766i()) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_oa_folder_confirm);
                        } else {
                            String m40999b = ((C18440b) c18451m).m97729o().m40999b(true, false);
                            if (!c18451m.mo97724g() && !AbstractC21935u.m114518H(c18451m.mo97719a())) {
                                str = m92653YI(AbstractC8020f0.str_confirm_delete_dialog_single_contact_title, m40999b);
                            } else {
                                str = m92653YI(AbstractC8020f0.str_confirm_delete_dialog_single_conversation_title, m40999b);
                            }
                        }
                        str2 = "";
                        str4 = m92652XI(AbstractC8020f0.str_delete);
                        str3 = str2;
                        break;
                    }
                }
                str = "";
                str2 = "";
                str4 = m92652XI(AbstractC8020f0.str_delete);
                str3 = str2;
                break;
            case 33:
                str2 = "";
                str4 = m92652XI(AbstractC8020f0.str_delete);
                str = m92652XI(AbstractC8020f0.str_delete_my_cloud_thread_title);
                str3 = str2;
                break;
            case 34:
                str4 = m92652XI(AbstractC8020f0.str_delete);
                str = m92653YI(AbstractC8020f0.str_confirm_delete_dialog_multi_conversation_title, Integer.valueOf(this.f63579T1.m68700T()));
                str3 = m92652XI(AbstractC8020f0.str_confirm_delete_multi_conversation_msg_2);
                break;
            default:
                str = "";
                str3 = str;
                break;
        }
        try {
            C16972e0.a aVar = new C16972e0.a(m92689tK());
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("popup_single_delete").m90947x("popup_single_delete_delete").m90937n("popup_single_delete_cancel").m90921E(true).m90943t(str4, new InterfaceC17463d.d() { // from class: t70.n1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    MessagesView.this.m68186aP(interfaceC17463d, i12);
                }
            }).m90934k(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: t70.o1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    MessagesView.this.m68190bP(interfaceC17463d, i12);
                }
            }).m90918B(str).m90949z(str3);
            return aVar.m90927d();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63530k3, e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gP */
    public /* synthetic */ void m68213gP() {
        m68158TN();
        m68155SN(C18932a.f94442a.m99183g(), this.f63561N1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gQ */
    public /* synthetic */ void m68214gQ(View view) {
        C17487o0 c17487o0;
        Bundle bundle = new Bundle();
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            c17487o0.m93069k2(QuickCreateGroupView.class, bundle, 1, true);
        }
    }

    /* renamed from: hO */
    private void m68217hO(Bundle bundle) {
        if (bundle != null) {
            ZaloView m92996E0 = m92649TI().m92996E0("FIXED_BANNER_VIEW");
            if (m92996E0 instanceof FixedBannerView) {
                FixedBannerView fixedBannerView = (FixedBannerView) m92996E0;
                this.f63647t1 = fixedBannerView;
                fixedBannerView.m68617BP(new FixedBannerView.InterfaceC12219b() { // from class: t70.z0
                    @Override // com.zing.zalo.p077ui.maintab.msg.fixedbanner.FixedBannerView.InterfaceC12219b
                    /* renamed from: a */
                    public final void mo68622a(float f11) {
                        MessagesView.this.m68199dP(f11);
                    }
                });
            }
        }
        if (this.f63647t1 == null) {
            FixedBannerView fixedBannerView2 = new FixedBannerView();
            this.f63647t1 = fixedBannerView2;
            fixedBannerView2.m68617BP(new FixedBannerView.InterfaceC12219b() { // from class: t70.a1
                @Override // com.zing.zalo.p077ui.maintab.msg.fixedbanner.FixedBannerView.InterfaceC12219b
                /* renamed from: a */
                public final void mo68622a(float f11) {
                    MessagesView.this.m68194cP(f11);
                }
            });
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && !m92676n2.isFinishing() && !mo60294yp()) {
                m92649TI().m93058d2(AbstractC6918a0.fixed_banner_container, this.f63647t1, 0, "FIXED_BANNER_VIEW", 0, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hP */
    public /* synthetic */ void m68218hP() {
        try {
            if (!C32044o1.m154612r().m154614G()) {
                m68358dR(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hQ */
    public /* synthetic */ void m68219hQ(View view) {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            c17487o0.m93069k2(ListContactNativeView.class, null, 1, true);
            AbstractC23647d.m123897g("3000224");
        }
    }

    /* renamed from: hR */
    private void m68220hR(C28212v6 c28212v6, View view, C13306b c13306b) {
        if (this.f72421L0.getContext() != null) {
            C25297f m130959a = C25297f.Companion.m130959a(this.f72421L0.getContext());
            m130959a.m130907M(c28212v6, this.f72421L0.getContext());
            m130959a.m130925c0(view);
            TooltipView tooltipView = new TooltipView(this.f72421L0.getContext());
            tooltipView.setConfigs(m130959a);
            tooltipView.setTooltipId(c28212v6.f131577c);
            tooltipView.setTooltipManager(c13306b);
            tooltipView.m90733c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iP */
    public /* synthetic */ void m68223iP() {
        C8009j c8009j = this.f63582U1;
        if (c8009j != null) {
            c8009j.dismiss();
        }
        m68155SN(C18932a.f94442a.m99183g(), this.f63561N1, true);
        C19669z.m103146Y().m103198O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iQ */
    public /* synthetic */ void m68224iQ(View view) {
        mo68332Nd();
    }

    /* renamed from: iR */
    private void m68225iR(C28212v6 c28212v6, View view, C13306b c13306b) {
        if (this.f72421L0.getContext() != null) {
            C25297f m130959a = C25297f.Companion.m130959a(this.f72421L0.getContext());
            m130959a.m130907M(c28212v6, this.f72421L0.getContext());
            m130959a.m130925c0(view);
            m130959a.m130920Z(false);
            m130959a.m130943l0(0);
            TooltipView tooltipView = new TooltipView(this.f72421L0.getContext());
            tooltipView.setConfigs(m130959a);
            tooltipView.m90734d0();
            tooltipView.setTooltipId(c28212v6.f131577c);
            tooltipView.setTooltipManager(c13306b);
            tooltipView.m90733c0();
        }
    }

    /* renamed from: jO */
    private void m68228jO(HashMap hashMap, boolean z11) {
        MainTabView m67645lM;
        if (!hashMap.isEmpty()) {
            this.f63555L1 = z11;
            LinkedList linkedList = new LinkedList();
            for (C18451m c18451m : hashMap.values()) {
                if (c18451m != null) {
                    Conversation m103202S = C19669z.m103146Y().m103202S(c18451m.mo97719a());
                    if (m103202S != null) {
                        linkedList.add(new C20566c(m103202S.f42893q, m103202S.m41005i(), m103202S.m41008l(), z11));
                    } else if (c18451m.m97768l() || c18451m.m97766i()) {
                        linkedList.add(new C20566c(c18451m.mo97719a(), null, 0L, false));
                    }
                }
            }
            if (!linkedList.isEmpty()) {
                C32044o1.m154612r().m154622Q(linkedList);
                m68358dR(true);
                C19669z.m103146Y().m103198O0();
                C32044o1.m154612r().m154625T("chats_list", AbstractC17574a.m93602i(hashMap), z11);
            }
            if (!m68385uO() && (m67645lM = MainTabView.m67645lM()) != null) {
                m67645lM.m67693gM();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jP */
    public /* synthetic */ void m68229jP() {
        int i11;
        if (this.f63543F1 != null) {
            if (this.f63584V0 == 0) {
                i11 = 0;
            } else {
                i11 = this.f63561N1;
            }
            m68155SN(C18932a.f94442a.m99183g(), i11, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jQ */
    public /* synthetic */ void m68230jQ() {
        TextView textView = this.f63542E2;
        if (textView != null) {
            textView.setText(C21373a.f104231a.m110805u());
        }
    }

    /* renamed from: jR */
    private void m68231jR() {
        try {
            this.f63597Z1 = false;
            AbstractC23309i.m122545wk(true);
            C18451m c18451m = this.f63564O1;
            if (!(c18451m instanceof C18440b)) {
                return;
            }
            Conversation m97729o = ((C18440b) c18451m).m97729o();
            Bundle m140776b = new C27870vb(m97729o.f42893q).m140777c(m97729o).m140776b();
            if (C18922m.m99140n(new ContactProfile())) {
                AbstractC23304d.f113379e1 = C21927m.m114293T(new ContactProfile(m97729o.f42893q));
                C18922m.m99141t().m99149S(m140776b, m97729o);
                if (this.f72421L0.m92676n2() instanceof Activity) {
                    AbstractC23647d.m123897g("22001401");
                    AbstractC23136l9.m118680U0((Activity) this.f72421L0.m92676n2(), false);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: kO */
    private void m68234kO(boolean z11) {
        HashMap hashMap = new HashMap();
        C12260j c12260j = this.f63579T1;
        if (c12260j != null) {
            hashMap.putAll(c12260j.m68701U());
        }
        m68367lO(hashMap, z11);
        C32044o1.m154612r().m154625T("chats_list", AbstractC17574a.m93602i(hashMap), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kP */
    public /* synthetic */ void m68235kP() {
        C12260j c12260j = this.f63579T1;
        if (c12260j != null) {
            c12260j.m10008p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lP */
    public /* synthetic */ void m68238lP() {
        this.f63599a1.m91305S();
    }

    /* renamed from: mO */
    private void m68241mO(String str, boolean z11) {
        MainTabView m67645lM;
        this.f63555L1 = z11;
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C20566c(str, null, 0L, z11));
        C32044o1.m154612r().m154622Q(linkedList);
        m68358dR(true);
        C19669z.m103146Y().m103198O0();
        C32044o1.m154612r().m154625T("chats_list", Collections.singletonList(str), z11);
        if (!m68385uO() && (m67645lM = MainTabView.m67645lM()) != null) {
            m67645lM.m67693gM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mP */
    public /* synthetic */ void m68242mP(List list, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m68325KO((C1483e) list.get(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nP */
    public /* synthetic */ void m68245nP(View view) {
        this.f63553K1.m90655n();
        m68107CQ();
    }

    /* renamed from: nR */
    private void m68246nR() {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f63656x2;
        if (actionBarMenuItem == null) {
            return;
        }
        if (AbstractC23309i.m122418t4() == 7) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        actionBarMenuItem.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oP */
    public /* synthetic */ void m68249oP(View view) {
        this.f63572R0.m68673N(0);
    }

    /* renamed from: oQ */
    private void m68250oQ() {
        this.f63572R0.m68676R().m9219j(m92657cJ(), new InterfaceC1764d0() { // from class: t70.b0
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MessagesView.this.m68303zP((C12259i.a) obj);
            }
        });
        this.f63572R0.m68678T().m9219j(m92657cJ(), new InterfaceC1764d0() { // from class: t70.c0
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MessagesView.this.m68098AP((Integer) obj);
            }
        });
    }

    /* renamed from: oR */
    private void m68251oR() {
        int i11;
        int i12;
        int i13;
        int i14;
        C18932a c18932a = C18932a.f94442a;
        if (c18932a.m99184h() && !c18932a.m99182f()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        if (!c18932a.m99182f()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        if (c18932a.m99184h() && m68102BO() == 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        if (m68102BO() != 0) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        this.f63623i1.setVisibility(i11);
        this.f63599a1.setVisibility(i12);
        this.f63617g1.setVisibility(i13);
        this.f63629k1.setVisibility(i14);
        int m68102BO = m68102BO();
        if (m68102BO != 1) {
            if (m68102BO != 2) {
                if (m68102BO == 3) {
                    m68288wR();
                }
            } else {
                m68299yR();
            }
        } else {
            m68294xR();
        }
        if (!c18932a.m99182f() && !c18932a.m99184h()) {
            m68269sQ();
        }
        if (i13 == 0 && !AbstractC0924m0.m3078Gc()) {
            this.f63620h1.setVisibility(0);
        } else {
            this.f63620h1.setVisibility(8);
        }
    }

    /* renamed from: pO */
    private void m68254pO(boolean z11) {
        if (C32044o1.m154612r().m154619N()) {
            HashMap m68701U = this.f63579T1.m68701U();
            if (m68701U != null && !m68701U.isEmpty()) {
                m68228jO(m68701U, z11);
                return;
            }
            return;
        }
        m68234kO(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pP */
    public /* synthetic */ boolean m68255pP(View view) {
        m68099AQ();
        return true;
    }

    /* renamed from: pQ */
    private void m68256pQ(ContactProfile contactProfile) {
        TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
        trackingSource.m40677a("sourceView", 1);
        C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
        AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(14)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: t70.r1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m68103BP;
                m68103BP = MessagesView.m68103BP();
                return m68103BP;
            }
        });
    }

    /* renamed from: pR */
    private void m68257pR() {
        EmptyState emptyState = new EmptyState(m92689tK());
        emptyState.setIllustration(C23212s8.m119608p(AbstractC16781w.zds_il_conversation_empty_spot_1_1));
        if (m68102BO() == 3) {
            emptyState.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_filter_chat_tag_empty_title));
            emptyState.setDesc(AbstractC23136l9.m118743r0(AbstractC8020f0.str_filter_chat_tag_empty_desc));
        } else {
            emptyState.setDesc(AbstractC23136l9.m118743r0(AbstractC8020f0.str_filter_chat_tag_empty_title));
        }
        ScrollView scrollView = new ScrollView(m92686rK());
        scrollView.setBackgroundColor(C23212s8.m119607o(m92689tK(), AbstractC28291a.layer_background));
        scrollView.addView(emptyState, -1, -1);
        this.f63649u1.removeAllViews();
        this.f63649u1.addView(scrollView, -1, -1);
        this.f63649u1.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qP */
    public /* synthetic */ void m68260qP(RecyclerView recyclerView, int i11, View view) {
        if (i11 < 0) {
            m68304zQ(0);
            C24559a.m127933c("[ConversationLabel]", "tabBar.OnItemClick position = " + i11);
        }
        m68304zQ(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qQ */
    public void m68261qQ() {
        this.f63620h1.setVisibility(8);
        m68196cR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rP */
    public /* synthetic */ boolean m68264rP(RecyclerView recyclerView, int i11, View view) {
        m68099AQ();
        return true;
    }

    /* renamed from: rQ */
    private void m68265rQ() {
        C23744a.m124114c().m124116d(36, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sP */
    public /* synthetic */ void m68268sP(View view) {
        this.f63572R0.m68682b0();
        m68261qQ();
    }

    /* renamed from: sQ */
    private void m68269sQ() {
        boolean z11;
        LinearLayout linearLayout = this.f63596Z0;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() != 8) {
                this.f63596Z0.setVisibility(8);
            }
            if (Math.abs(this.f63596Z0.getTranslationY()) < m68291xO()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f63622h3 = z11;
            RecyclerView recyclerView = this.f63543F1;
            if (recyclerView != null) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, this.f63543F1.getPaddingRight(), this.f63543F1.getPaddingBottom());
            }
        }
    }

    /* renamed from: sR */
    private void m68270sR(int i11) {
        if (C18932a.f94442a.m99182f()) {
            for (int i12 = 0; i12 < 2; i12++) {
                C7860a.b bVar = C7860a.Companion;
                C18431b m40271O = bVar.m40303b().m40271O(i12);
                if (m40271O != null) {
                    if (m40271O.m97666d() == i11 && !C18935d.m99214s().m99232y()) {
                        bVar.m40303b().m40300z(m40271O.m97666d());
                    }
                    if (this.f63602b1[m40271O.m97666d()] != null) {
                        if (C18935d.m99214s().m99232y()) {
                            this.f63602b1[m40271O.m97666d()].m128757u(false);
                        } else {
                            this.f63602b1[m40271O.m97666d()].m128757u(m40271O.m97663a());
                        }
                    }
                    if (m40271O.m97666d() == 1 && m40271O.m97663a() && !AbstractC0924m0.m4228tc()) {
                        this.f63621h2.sendMessageDelayed(this.f63621h2.obtainMessage(0, "tip.any"), 500L);
                    }
                }
            }
            this.f63599a1.m91305S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tP */
    public /* synthetic */ boolean m68273tP(View view) {
        PopoverView popoverView = this.f63641q1;
        if (popoverView != null && popoverView.isShown()) {
            this.f63641q1.m91179I();
        }
        m68099AQ();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tR */
    public void m68274tR() {
        try {
            if (this.f63579T1 != null) {
                this.f63579T1.m68714h0(C19669z.m103146Y().m103218d0(this.f63572R0.m68677S()));
                this.f63579T1.m68718l0(C21933s.m114404I().m114427L());
                this.f63572R0.m68686g0();
            }
            m68347VQ(false);
            m68270sR(this.f63561N1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uP */
    public /* synthetic */ void m68277uP(View view) {
        if (m68102BO() == 3) {
            m68180YQ("filter_chip");
        }
    }

    /* renamed from: uQ */
    private void m68278uQ() {
        try {
            if (!C19669z.m103146Y().m103226p0()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f63606c2 > 1000) {
                this.f63603b2 = 0;
                mo70710wy(new Runnable() { // from class: t70.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagesView.this.m68274tR();
                    }
                });
            } else {
                int i11 = this.f63603b2 + 1;
                this.f63603b2 = i11;
                if (i11 > 10) {
                    if (i11 % 10 != 0) {
                        AbstractC17927b.m94533b().mo94530d("REFRESH_TAB_MSG_ITEM", new Runnable() { // from class: t70.l1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MessagesView.this.m68274tR();
                            }
                        }, 500L);
                    } else {
                        mo70710wy(new Runnable() { // from class: t70.l1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MessagesView.this.m68274tR();
                            }
                        });
                    }
                } else {
                    mo70710wy(new Runnable() { // from class: t70.l1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesView.this.m68274tR();
                        }
                    });
                }
            }
            this.f63606c2 = currentTimeMillis;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63530k3, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vP */
    public /* synthetic */ void m68281vP(int i11, C31862c c31862c) {
        MessagesView messagesView;
        try {
            if (i11 != 1) {
                if (i11 != 6) {
                    if (i11 == 29) {
                        if (!TextUtils.isEmpty(c31862c.f146327t) && !TextUtils.isEmpty(c31862c.f146326s)) {
                            this.f63598Z2 = c31862c;
                            if (m92650VI() != null) {
                                messagesView = m92650VI();
                            } else {
                                messagesView = this;
                            }
                            AbstractC28207v1.m141994i3(c31862c.f146327t, 4, this.f72421L0.m92676n2(), messagesView, c31862c.f146326s, null);
                        }
                        C18434b.m97679l().m97691w(c31862c);
                        return;
                    }
                    return;
                }
                if (C19669z.m103146Y().m103220e1(c31862c)) {
                    m68389vQ();
                    return;
                }
                return;
            }
            if (C19669z.m103146Y().m103221f1(c31862c)) {
                C19669z.m103146Y().m103198O0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: vR */
    private void m68282vR() {
        AbstractC19444a.m101695c(new Runnable() { // from class: t70.p1
            @Override // java.lang.Runnable
            public final void run() {
                MessagesView.this.m68230jQ();
            }
        });
    }

    /* renamed from: wO */
    private C16974f m68285wO() {
        C16974f c16974f = new C16974f(this.f72421L0.m92689tK());
        c16974f.m90974x(EnumC16991i.CUSTOM);
        c16974f.m90965o(C23212s8.m119607o(this.f72421L0.m92689tK(), AbstractC2807a.badge_background_red));
        c16974f.m90971u(EnumC16980h.SIZE_8);
        return c16974f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wP */
    public /* synthetic */ void m68286wP(final int i11, final C31862c c31862c) {
        if (c31862c != null && this.f72421L0.m92676n2() != null && this.f72421L0.m92674mJ()) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: t70.c1
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.this.m68281vP(i11, c31862c);
                }
            });
        }
    }

    /* renamed from: wQ */
    private void m68287wQ(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C7860a.b bVar = C7860a.Companion;
        C18431b m40271O = bVar.m40303b().m40271O(1);
        if (m40271O != null) {
            bVar.m40303b().m40288j0(m40271O.m97665c(), arrayList, new C12193i(), str2);
        }
    }

    /* renamed from: wR */
    private void m68288wR() {
        boolean z11;
        int i11;
        int i12;
        List m99230r = C18935d.m99214s().m99230r();
        int size = m99230r.size();
        if (size > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        View view = this.f63629k1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        if (z11) {
            this.f63631l1.setVisibility(0);
            Context context = getContext();
            if (size == 1) {
                i12 = AbstractC23322a.zds_ic_tag_horizontal_solid_16;
            } else {
                i12 = AbstractC23322a.zds_ic_multi_tag_horizontal_solid_16;
            }
            Drawable m118665N = AbstractC23136l9.m118665N(context, i12);
            if (m118665N != null) {
                AbstractC1414a.m7196n(m118665N, Color.parseColor(((C20060c) m99230r.get(0)).m104212a()));
                this.f63631l1.setImageDrawable(m118665N);
            }
            if (size == 1) {
                this.f63633m1.setText(((C20060c) m99230r.get(0)).m104217f(12));
            } else {
                this.f63633m1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_tag_filter_info, Integer.valueOf(size)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xO */
    public int m68291xO() {
        LinearLayout linearLayout;
        if (this.f63628j3 == 0 && (linearLayout = this.f63596Z0) != null) {
            this.f63628j3 = linearLayout.getHeight();
            C24559a.m127933c("[ConversationLabel]", "getChatLabelTabHeight = " + this.f63628j3 + " tabBar.getHeight()=" + this.f63599a1.getHeight() + " titleAllContainer.getHeight()=" + this.f63623i1.getHeight() + " tabContainerLeft.getHeight()=" + this.f63637o1.getHeight());
        }
        int i11 = this.f63628j3;
        if (i11 == 0) {
            return AbstractC23222t7.f112536O;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xP */
    public /* synthetic */ void m68292xP() {
        if (AbstractC23195r2.f112444f == AbstractC23195r2.f112441c) {
            AbstractC23195r2.f112444f = AbstractC23195r2.f112440b;
            m68338PQ(false);
        } else if (AbstractC23195r2.f112444f == AbstractC23195r2.f112440b) {
            m68383tO(false);
        } else if (!AbstractC23195r2.f112443e) {
            m68383tO(true);
        }
    }

    /* renamed from: xQ */
    private void m68293xQ(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            C7860a.b bVar = C7860a.Companion;
            C18431b m40271O = bVar.m40303b().m40271O(1);
            if (m40271O != null) {
                bVar.m40303b().m40295v(m40271O.m97665c(), arrayList, new C12192h(), str2);
            }
        }
    }

    /* renamed from: xR */
    private void m68294xR() {
        this.f63631l1.setVisibility(8);
        this.f63633m1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unread));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yP */
    public static /* synthetic */ void m68297yP() {
        C19669z.m103146Y().m103198O0();
    }

    /* renamed from: yQ */
    private void m68298yQ() {
        boolean z11;
        LinearLayout linearLayout = this.f63596Z0;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() != 0) {
                this.f63596Z0.setVisibility(0);
            }
            int m68291xO = m68291xO();
            if (Math.abs(this.f63596Z0.getTranslationY()) < m68291xO) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f63622h3 = z11;
            if (C18932a.f94442a.m99189m() && this.f63613e3.compareAndSet(false, true)) {
                mo78955kl(new Runnable() { // from class: t70.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagesView.this.m68185aO();
                    }
                }, 250L);
            }
            RecyclerView recyclerView = this.f63543F1;
            if (recyclerView != null && recyclerView.getPaddingTop() != m68291xO) {
                RecyclerView recyclerView2 = this.f63543F1;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), m68291xO, this.f63543F1.getPaddingRight(), this.f63543F1.getPaddingBottom());
            }
        }
    }

    /* renamed from: yR */
    private void m68299yR() {
        this.f63631l1.setVisibility(8);
        this.f63633m1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mentions_me));
    }

    /* renamed from: zO */
    private C28926f m68302zO() {
        if (this.f63618g2 == null) {
            this.f63618g2 = AbstractC23306f.m120613R();
        }
        return this.f63618g2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zQ */
    public void m68304zQ(int i11) {
        boolean z11;
        int size;
        try {
            C7860a.b bVar = C7860a.Companion;
            C18431b m40271O = bVar.m40303b().m40271O(i11);
            m68149QQ(m40271O);
            boolean m99183g = C18932a.f94442a.m99183g();
            if (this.f63561N1 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            m68155SN(m99183g, i11, z11);
            if (i11 != 0 && m40271O != null) {
                int size2 = C19669z.m103146Y().m103216b0(m40271O).size();
                C23648e.a aVar = C23648e.Companion;
                C0815e1.m2075D().m2100V(aVar.m123929a().m123927t(20).m123925r("chats_list").m123924q(0).m123923p("chat_open_label").m123926s(m40271O.m97665c() + "", size2 + ""), true);
                if (i11 == 1 && (size = bVar.m40303b().m40275S().size() - 2) > 0) {
                    C0815e1.m2075D().m2100V(aVar.m123929a().m123927t(20).m123925r("").m123924q(1).m123923p("chat_label_suggest").m123926s(m40271O.m97665c() + "", size + ""), false);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63530k3, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.MainTabView.InterfaceC12111i
    /* renamed from: A2 */
    public boolean mo67726A2() {
        C13306b m68316GO = m68316GO();
        if (m68316GO != null && m68316GO.m74707p()) {
            return true;
        }
        return false;
    }

    /* renamed from: AR */
    void m68305AR(boolean z11) {
        C17487o0 c17487o0;
        try {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            C18451m c18451m = this.f63564O1;
            if (c18451m.f92990a == 3) {
                C18450l c18450l = (C18450l) c18451m;
                if (z11) {
                    AbstractC23074g2.m118380f(c18450l.f92982e, c17487o02, 0, 1, 0, 1, 290);
                } else {
                    AbstractC23074g2.m118379e(c18450l.f92982e, c17487o02, 0, 1, 0, 1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:            if (r10.equals("action.open.postfeed") == false) goto L17;     */
    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
    /* renamed from: B5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
        boolean z11;
        char c11 = 0;
        if (c31862c != null && c31862c.m153153e()) {
            m68363iO(c31862c);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("action.window.close")) {
                if (!z11) {
                    C0815e1.m2075D().m2092K(c31862c, str, 3);
                    m68363iO(c31862c);
                    return;
                }
                return;
            }
            String m68758dM = m68758dM(str, str2, 4004);
            switch (str.hashCode()) {
                case -987623510:
                    break;
                case -697594688:
                    if (str.equals("action.open.createchat")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -539094935:
                    if (str.equals("action.open.poststory")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -146593257:
                    if (str.equals("action.open.creategroup")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    AbstractC23647d.m123897g("210602");
                    break;
                case 1:
                    AbstractC23647d.m123897g("210601");
                    break;
                case 2:
                    AbstractC23647d.m123897g("210603");
                    break;
                case 3:
                    AbstractC23647d.m123897g("210604");
                    break;
                default:
                    AbstractC23647d.m123897g("210600");
                    break;
            }
            C12183c0 c12183c0 = new C12183c0(str, m68758dM, c31862c);
            C0815e1.m2075D().m2092K(c31862c, str, i11);
            C31877d c31877d = new C31877d();
            if ("action.open.memorylist".equals(str)) {
                c31877d.m153184c(C32002l4.m154265h(50001, 1));
            } else {
                c31877d.m153187f(new TrackingSource((short) 1000));
            }
            AbstractC28207v1.m141984g3(str, 4, this.f72421L0.m92676n2(), this, m68758dM, c12183c0, c31877d);
        }
    }

    /* renamed from: BQ */
    public void m68306BQ(boolean z11) {
        int i11;
        this.f63570Q1 = z11;
        if (z11) {
            if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().mo35576n3() && C22013a0.m114928g() && C22013a0.m114924c().m114932h(5)) {
                m68326KQ();
            }
            if (!AbstractC23309i.m120752Af()) {
                m68162UN(300, true);
            }
            m68166VN();
            if (this.f63584V0 == 0) {
                i11 = 0;
            } else {
                i11 = this.f63561N1;
            }
            m68155SN(C18932a.f94442a.m99183g(), i11, false);
            m68198dO();
        } else {
            m68345UQ(false);
            if (C32044o1.m154612r().m154614G()) {
                C32044o1.m154612r().m154628n();
            }
            m68358dR(false);
        }
        AnimChat animChat = this.f63650u2;
        if (animChat != null) {
            animChat.m76101A0(z11, false);
        }
        m68151RN();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C23475l.m123241e((byte) 2, "onCreate");
        try {
            super.mo37111CJ(bundle);
            this.f72830E0 = C24099q0.m125958k().m125971o();
            if (this.f72421L0.m92642L3() != null) {
                this.f72830E0 = this.f72421L0.m92642L3().getInt("position");
            }
            this.f63592X2 = true;
            this.f63595Y2 = bundle;
            if (bundle != null) {
                this.f63561N1 = bundle.getInt("CURRENT_LABEL_INDEX", 0);
                this.f63645s1 = C20058a.Companion.m104192b(this.f63595Y2.getString("PREV_CHAT_TAG_SETTING_CONFIG", ""));
                C24559a.m127933c("[ConversationLabel]", "MessagesView#onCreate#restoreFromBundle mCurrentLabelIndex = " + this.f63561N1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C23475l.m123240d().m123242a("onCreate");
        C23475l.m123240d().m123243b();
    }

    /* renamed from: CO */
    MainTabView m68307CO() {
        MainTabView mainTabView;
        Exception e11;
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM == null) {
            try {
                if (this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof MainTabView)) {
                    mainTabView = (MainTabView) this.f72421L0.m92650VI();
                    try {
                        MainTabView.m67662xN(mainTabView);
                        m67645lM = mainTabView;
                    } catch (Exception e12) {
                        e11 = e12;
                        AbstractC20110a.m104539h(e11);
                        return mainTabView;
                    }
                }
            } catch (Exception e13) {
                mainTabView = m67645lM;
                e11 = e13;
            }
        }
        return m67645lM;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0023. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String m118743r0;
        String m118743r02;
        ViewOnClickListenerC2868e1 viewOnClickListenerC2868e1;
        C8009j c8009j = null;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
            return c8009j;
        }
        if (i11 != 3) {
            if (i11 != 4 && i11 != 7 && i11 != 8 && i11 != 9) {
                String str = "";
                switch (i11) {
                    case 12:
                        if (!(this.f63567P1 instanceof C18452n)) {
                            return null;
                        }
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_feed_ad);
                        String m153490k = ((C18452n) this.f63567P1).m97769o().m153490k();
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_all_feed_ads);
                        Object[] objArr = new Object[1];
                        if (TextUtils.isEmpty(m153490k)) {
                            m153490k = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unknow_owner_sticky);
                        }
                        objArr[0] = m153490k;
                        String format = String.format(m118743r04, objArr);
                        C27473a.a aVar = new C27473a.a(0, AbstractC23136l9.m118743r0(AbstractC8020f0.delete));
                        C27473a.a aVar2 = new C27473a.a(1, m118743r03);
                        C27473a.a aVar3 = new C27473a.a(2, format);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar);
                        if (C28905e.f133812l == 1) {
                            arrayList.add(aVar2);
                            arrayList.add(aVar3);
                        }
                        C27473a c27473a = new C27473a(m92686rK());
                        c27473a.m140530b(arrayList);
                        C2864d1.a aVar4 = new C2864d1.a(this.f72421L0.m92648SI());
                        aVar4.m13797f(AbstractC8915g0.TimelineMenuTheme);
                        aVar4.m13795d(c27473a);
                        final C2864d1 m13794b = aVar4.m13794b();
                        aVar4.m13796e(new AdapterView.OnItemClickListener() { // from class: t70.i0
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView adapterView, View view, int i12, long j11) {
                                MessagesView.this.m68119GP(m13794b, adapterView, view, i12, j11);
                            }
                        });
                        return m13794b;
                    case 13:
                        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_this_conversation_title);
                        if (this.f63564O1.m97768l()) {
                            m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_stranger_folder_confirm);
                        } else if (this.f63564O1.m97766i()) {
                            m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_oa_folder_confirm);
                        } else {
                            str = this.f63564O1.mo97724g() ? AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_this_conversation_desc_2) : AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_this_conversation_desc);
                        }
                        C16972e0.a aVar5 = new C16972e0.a(m92689tK());
                        aVar5.m90932i(C16972e0.b.DIALOG_INFORMATION).m90921E(true).m90918B(m118743r05).m90949z(str).m90943t(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), this).m90934k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel_delete), this);
                        return aVar5.m90927d();
                    case 14:
                        C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar6.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_unfollow_oa)).m43173v(2).m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unfollow_vip_acc)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_no_unfollow), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_yes_unfollow), this);
                        C8009j m43152a = aVar6.m43152a();
                        m43152a.m92873y(true);
                        return m43152a;
                    case 15:
                        C8009j.a aVar7 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar7.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_follow_vip_acc)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                        C8009j m43152a2 = aVar7.m43152a();
                        m43152a2.m92873y(true);
                        return m43152a2;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        return AbstractC23116k0.m118580h(m92686rK(), this.f63564O1.mo97724g(), new C12199o());
                    case 17:
                        C8009j.a aVar8 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar8.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_ignore_zalo_user)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_popup), this);
                        return aVar8.m43152a();
                    case 18:
                        C8009j.a aVar9 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar9.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unlock_friend)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                        return aVar9.m43152a();
                    default:
                        switch (i11) {
                            case 20:
                                C8009j.a aVar10 = new C8009j.a(this.f72421L0.m92648SI());
                                aVar10.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_new_hidden_chat)).m43173v(2).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_hint_hidden_chat)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_setpin), this);
                                return aVar10.m43152a();
                            case 21:
                                C8009j.a aVar11 = new C8009j.a(this.f72421L0.m92648SI());
                                ImageView imageView = new ImageView(this.f72421L0.m92648SI());
                                imageView.setImageDrawable(C23212s8.m119609q(this.f72421L0.m92648SI(), AbstractC16781w.banner_hiddenchat_lock));
                                imageView.setPadding(0, AbstractC23136l9.m118742r(16.0f), 0, 0);
                                aVar11.m43177z(imageView);
                                aVar11.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_setup_hiddenchat_success)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_setup_hiddenchat_success)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.close), this);
                                C8009j m43152a3 = aVar11.m43152a();
                                m43152a3.m92855F(new InterfaceC17463d.e() { // from class: t70.n0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                                    /* renamed from: Tv */
                                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                                        MessagesView.m68130KP(interfaceC17463d);
                                    }
                                });
                                return m43152a3;
                            case 22:
                                C8009j.a aVar12 = new C8009j.a(this.f72421L0.m92648SI());
                                aVar12.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), this);
                                return aVar12.m43152a();
                            case 23:
                                viewOnClickListenerC2868e1 = new ViewOnClickListenerC2868e1(this.f72421L0.m92648SI(), this.f63558M1);
                                return viewOnClickListenerC2868e1;
                            case 24:
                                try {
                                    C8009j.a aVar13 = new C8009j.a(this.f72421L0.m92648SI());
                                    aVar13.m43159h(4);
                                    aVar13.m43155d(true);
                                    if (AbstractC26683d.f126391B) {
                                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_announce_unable_bubble_chat_when_use_passcode);
                                    } else {
                                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_announce_unable_chat_head_when_use_passcode);
                                    }
                                    aVar13.m43162k(m118743r02);
                                    aVar13.m43169r(AbstractC8020f0.ls_ok, new InterfaceC17463d.b());
                                    c8009j = aVar13.m43152a();
                                    return c8009j;
                                } catch (Exception e12) {
                                    AbstractC23350e.m122778h(e12);
                                    return null;
                                }
                            default:
                                switch (i11) {
                                    case 26:
                                        this.f63593Y0 = true;
                                        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_delete_multi_msg);
                                        C12260j c12260j = this.f63579T1;
                                        if (c12260j != null) {
                                            int m68700T = c12260j.m68700T();
                                            if (m68700T == 1) {
                                                C18451m c18451m = (C18451m) this.f63579T1.m68701U().get(AbstractC17574a.m93602i(this.f63579T1.m68701U()).get(0));
                                                int i12 = AbstractC8020f0.str_confirm_delete_dialog_single_conversation_title;
                                                Object[] objArr2 = new Object[1];
                                                if (c18451m instanceof C18440b) {
                                                    str = ((C18440b) c18451m).m97729o().m40999b(true, false);
                                                }
                                                objArr2[0] = str;
                                                str = AbstractC23136l9.m118746s0(i12, objArr2);
                                                m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_this_conversation_desc_2);
                                            } else if (m68700T > 1) {
                                                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_confirm_delete_dialog_multi_conversation_title, Integer.valueOf(m68700T));
                                                m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_multi_conversation_msg_2);
                                            }
                                        }
                                        C8009j.a aVar14 = new C8009j.a(this.f72421L0.m92648SI());
                                        aVar14.m43159h(7).m43172u(str).m43173v(2).m43162k(m118743r06).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel_delete), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), this);
                                        aVar14.m43167p(new InterfaceC17463d.c() { // from class: t70.j0
                                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                                            /* renamed from: p7 */
                                            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                                                MessagesView.this.m68122HP(interfaceC17463d);
                                            }
                                        });
                                        return aVar14.m43152a();
                                    case 27:
                                        this.f63593Y0 = true;
                                        String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_mark_as_read);
                                        C12260j c12260j2 = this.f63579T1;
                                        if (c12260j2 != null) {
                                            if (c12260j2.m68700T() == 1) {
                                                m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_mark_single_as_read);
                                            } else {
                                                m118743r07 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_ask_to_mark_as_read, Integer.valueOf(this.f63579T1.m68700T()));
                                            }
                                        }
                                        C8009j.a aVar15 = new C8009j.a(this.f72421L0.m92648SI());
                                        aVar15.m43159h(4).m43162k(m118743r07).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_mark_as_read_yes), this);
                                        aVar15.m43167p(new InterfaceC17463d.c() { // from class: t70.l0
                                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                                            /* renamed from: p7 */
                                            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                                                MessagesView.this.m68125IP(interfaceC17463d);
                                            }
                                        });
                                        return aVar15.m43152a();
                                    case 28:
                                        return C18415w.m97593f(this.f72421L0.m92648SI());
                                    default:
                                        switch (i11) {
                                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                                C2895n1 c2895n1 = new C2895n1(m92686rK());
                                                c2895n1.m13852T(new InterfaceC17463d.d() { // from class: t70.h0
                                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                                    /* renamed from: K8 */
                                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                                        MessagesView.this.m68116FP(interfaceC17463d, i13);
                                                    }
                                                });
                                                viewOnClickListenerC2868e1 = c2895n1;
                                                return viewOnClickListenerC2868e1;
                                            case 31:
                                                try {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    HashMap hashMap = new HashMap();
                                                    hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_go_to_chat_label_setting_item));
                                                    hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_dialog_go_to_chat_label_setting_item));
                                                    arrayList2.add(hashMap);
                                                    SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList2, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                                                    C8009j.a aVar16 = new C8009j.a(this.f72421L0.m92648SI());
                                                    aVar16.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_go_to_chat_label_setting_title));
                                                    aVar16.m43155d(true);
                                                    aVar16.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: t70.o0
                                                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                                        /* renamed from: K8 */
                                                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                                            MessagesView.this.m68132LP(interfaceC17463d, i13);
                                                        }
                                                    });
                                                    c8009j = aVar16.m43152a();
                                                    return c8009j;
                                                } catch (Exception e13) {
                                                    AbstractC23350e.m122778h(e13);
                                                    return null;
                                                }
                                            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                            case 33:
                                            case 34:
                                                return m68212gO(i11);
                                            case 35:
                                                this.f63593Y0 = true;
                                                String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_d_conversations_as_unread);
                                                C12260j c12260j3 = this.f63579T1;
                                                if (c12260j3 != null) {
                                                    if (c12260j3.m68700T() == 1) {
                                                        m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_one_conversation_as_unread);
                                                    } else {
                                                        m118743r08 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_mark_d_conversations_as_unread, Integer.valueOf(this.f63579T1.m68700T()));
                                                    }
                                                }
                                                C8009j.a aVar17 = new C8009j.a(this.f72421L0.m92648SI());
                                                aVar17.m43159h(4).m43162k(m118743r08).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_mark_as_read_yes), this);
                                                aVar17.m43167p(new InterfaceC17463d.c() { // from class: t70.m0
                                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                                                    /* renamed from: p7 */
                                                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                                                        MessagesView.this.m68127JP(interfaceC17463d);
                                                    }
                                                });
                                                return aVar17.m43152a();
                                            default:
                                                switch (i11) {
                                                    case 100:
                                                        C8009j.a aVar18 = new C8009j.a(this.f72421L0.m92648SI());
                                                        aVar18.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f63600a2).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
                                                        return aVar18.m43152a();
                                                    case 101:
                                                        C2852a1.a aVar19 = new C2852a1.a();
                                                        aVar19.f11361a = C31931g8.m153431c(this.f63564O1.mo97719a());
                                                        aVar19.f11362b = AbstractC23089h6.m118437e(this.f63564O1.mo97719a());
                                                        return new C2852a1(m92686rK(), aVar19, this).m13747c();
                                                    case 102:
                                                        try {
                                                            if (Build.VERSION.SDK_INT <= 29) {
                                                                return null;
                                                            }
                                                            C8009j.a aVar20 = new C8009j.a(this.f72421L0.m92648SI());
                                                            aVar20.m43159h(4);
                                                            aVar20.m43155d(true);
                                                            aVar20.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_notice_bubble_chat));
                                                            aVar20.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_bubble_chat_global_setting));
                                                            aVar20.m43169r(AbstractC8020f0.ls_ok, new C12200p());
                                                            aVar20.m43164m(AbstractC8020f0.cancel, new InterfaceC17463d.b());
                                                            c8009j = aVar20.m43152a();
                                                            return c8009j;
                                                        } catch (Exception e14) {
                                                            AbstractC23350e.m122778h(e14);
                                                            return null;
                                                        }
                                                    case 103:
                                                        try {
                                                            C8009j.a aVar21 = new C8009j.a(this.f72421L0.m92648SI());
                                                            aVar21.m43159h(4);
                                                            aVar21.m43155d(true);
                                                            aVar21.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_notice_bubble_chat));
                                                            aVar21.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_bubble_chat_notification_off));
                                                            aVar21.m43169r(AbstractC8020f0.str_hint_on_notification_action, new C12201q());
                                                            aVar21.m43164m(AbstractC8020f0.cancel, new InterfaceC17463d.b());
                                                            c8009j = aVar21.m43152a();
                                                            return c8009j;
                                                        } catch (Exception e15) {
                                                            AbstractC23350e.m122778h(e15);
                                                            return null;
                                                        }
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
                e11.printStackTrace();
                return c8009j;
            }
            if (i11 == 4) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_share);
            } else if (i11 == 9) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_share_group);
            } else if (i11 == 7) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_forward);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_forward_group);
            }
            C8009j.a aVar22 = new C8009j.a(this.f72421L0.m92648SI());
            aVar22.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(m118743r0).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
            return aVar22.m43152a();
        }
        C8009j.a aVar23 = new C8009j.a(this.f72421L0.m92648SI());
        aVar23.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_use_usernearby)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar23.m43152a();
    }

    /* renamed from: DO */
    public void m68308DO(int i11) {
        try {
            C18434b.m97679l().m97684m(i11, null, new C18434b.c(-1, -1, AbstractC23160o0.m119306z(), -1, -1, AbstractC23160o0.m119234a0()), null, this.f63604b3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DQ */
    void m68309DQ(Bundle bundle, Conversation conversation) {
        AbstractC23211s7.m119584q(this.f72421L0.m92676n2(), bundle, conversation);
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: EF */
    public boolean mo68310EF() {
        if (m92672lJ() && this.f63570Q1) {
            return true;
        }
        return false;
    }

    /* renamed from: EO */
    View m68311EO(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2092605591:
                if (str.equals("tip.message.compose.addfriend")) {
                    c11 = 0;
                    break;
                }
                break;
            case 1026464109:
                if (str.equals("tip.message.compose.creategroup")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1399233812:
                if (str.equals("tip.message.compose.calendar")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1676691636:
                if (str.equals("tip.message.compose.scanqr")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1875577267:
                if (str.equals("tip.message.compose.zalopc")) {
                    c11 = 4;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                if (this.f72421L0.m92666hJ()) {
                    return this.f63660z2;
                }
                if (MainTabView.m67645lM() != null) {
                    return MainTabView.m67645lM().f63203A1;
                }
                return null;
            case 1:
                if (this.f72421L0.m92666hJ()) {
                    return this.f63658y2;
                }
                if (MainTabView.m67645lM() != null) {
                    return MainTabView.m67645lM().f63265z1;
                }
                return null;
            case 2:
                if (!this.f72421L0.m92666hJ() && MainTabView.m67645lM() != null) {
                    return MainTabView.m67645lM().f63211E1;
                }
                return null;
            case 3:
                if (this.f72421L0.m92666hJ()) {
                    return this.f63534A2;
                }
                if (MainTabView.m67645lM() != null) {
                    return MainTabView.m67645lM().f63205B1;
                }
                return null;
            case 4:
                if (this.f72421L0.m92666hJ()) {
                    return this.f63536B2;
                }
                if (MainTabView.m67645lM() != null) {
                    return MainTabView.m67645lM().f63207C1;
                }
                return null;
            default:
                return m68320IO(str);
        }
    }

    /* renamed from: EQ */
    void m68312EQ(int i11) {
        try {
            String str = (String) C19669z.f97575W.get(i11);
            ContactProfile m98552o = C18644n.m98531l().m98552o(str);
            if (m98552o == null && (m98552o = C21927m.m114302u().m114312J().m153138j(str)) == null) {
                m98552o = C28203u6.f131407a.m141809c(str);
            }
            if (m98552o != null && !TextUtils.isEmpty(m98552o.f42434r)) {
                Bundle m140776b = new C27870vb(m98552o.mo2478b()).m140780g(m98552o).m140776b();
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        int i11;
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        try {
            if (AbstractC23309i.m122418t4() == 7) {
                this.f63656x2 = actionBarMenu.m92742i(14, AbstractC23136l9.m118665N(actionBarMenu.getContext(), AbstractC16803z.icn_groupcall));
                m68246nR();
            }
            ActionBarMenuItem m92742i = actionBarMenu.m92742i(1, AbstractC23136l9.m118665N(actionBarMenu.getContext(), AbstractC16803z.icn_header_plus));
            this.f63654w2 = m92742i;
            this.f63660z2 = (TextView) m92742i.m92774j(AbstractC23136l9.m118727m(m92689tK(), 3, AbstractC8020f0.addfriend, AbstractC16803z.ic_adduser_line_24));
            this.f63658y2 = (TextView) this.f63654w2.m92774j(AbstractC23136l9.m118727m(m92689tK(), 2, AbstractC8020f0.str_btn_createGroup, AbstractC16803z.ic_add_member_line_24));
            this.f63534A2 = (TextView) this.f63654w2.m92774j(AbstractC23136l9.m118727m(m92689tK(), 4, AbstractC8020f0.qrcode_scan_qrcode, AbstractC16803z.ic_qr_line_24));
            C21373a c21373a = C21373a.f104231a;
            if (c21373a.m110802n()) {
                i11 = AbstractC16803z.ic_saved_message_line_24;
            } else {
                i11 = AbstractC16803z.ic_truyenfile_line_24;
            }
            this.f63542E2 = (TextView) this.f63654w2.m92774j(AbstractC23136l9.m118730n(m92689tK(), 7, c21373a.m110805u(), i11));
            this.f63538C2 = (TextView) this.f63654w2.m92774j(AbstractC23136l9.m118727m(m92689tK(), 6, AbstractC8020f0.str_calendar_titlebar, AbstractC16803z.ic_calendar_line_24));
            m68327LN();
            this.f63536B2 = (TextView) this.f63654w2.m92774j(AbstractC23136l9.m118727m(m92689tK(), 5, AbstractC8020f0.str_account_security_item_history_login_title, AbstractC16803z.ic_pc_line_24));
            this.f63654w2.setMenuItemListener(new ActionBarMenuItem.InterfaceC17434c() { // from class: t70.v0
                @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.InterfaceC17434c
                /* renamed from: a */
                public final void mo87298a() {
                    MessagesView.m68136MP();
                }
            });
            this.f63654w2.setSubMenuDismissListener(new PopupWindow.OnDismissListener() { // from class: t70.g1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    MessagesView.this.m68139NP();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FO */
    public void m68313FO(ContactProfile contactProfile, int i11) {
        try {
            if (this.f63636n2) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f63636n2 = true;
            this.f63627j2 = contactProfile.f42434r;
            this.f63630k2 = contactProfile;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12210z(i11, contactProfile));
            c0766k.mo1615ca(contactProfile.f42434r);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f63636n2 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: FQ */
    void m68314FQ(boolean z11) {
        QuickActionViewLayout quickActionViewLayout;
        int height;
        if (this.f63545G1 != null && this.f63549I1 && (quickActionViewLayout = this.f63547H1) != null && !this.f63610d3) {
            if (z11) {
                height = 0;
            } else {
                height = quickActionViewLayout.getHeight();
            }
            AbstractC23202r9.m119547o(this.f63545G1, height, new C12209y(z11));
        }
    }

    @Override // com.zing.zalo.p077ui.widget.ZinstantAdItemView.InterfaceC13555d
    /* renamed from: Fi */
    public void mo68315Fi(C32041nd c32041nd, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !str.equals("action.window.close")) {
                AbstractC28207v1.m141984g3(str, 4, this.f72421L0.m92676n2(), this, str2, null, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C23475l.m123241e((byte) 2, "onCreateView");
        C12259i c12259i = (C12259i) new C1802w0(this, new C12259i.c(this, null)).m9378a(C12259i.class);
        this.f63572R0 = c12259i;
        c12259i.m68689j0(new WeakReference(this));
        View inflate = layoutInflater.inflate(AbstractC7409c0.messageslist, viewGroup, false);
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
            m92637BK(true);
            inflate.setBackgroundColor(C23212s8.m119606n(AbstractC28291a.page_background_01));
        }
        this.f63576S1 = new C23528a(this.f72421L0.m92648SI());
        m68217hO(bundle);
        m68144PO(inflate);
        this.f63545G1 = (ViewGroup) inflate.findViewById(AbstractC6918a0.bottom_banner);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(AbstractC6918a0.recycler_view_msgList);
        this.f63543F1 = recyclerView;
        recyclerView.setDescendantFocusability(131072);
        this.f63543F1.setPreserveFocusAfterLayout(false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(AbstractC6918a0.empty_view);
        this.f63649u1 = viewGroup2;
        this.f63651v1 = (ProgressBar) viewGroup2.findViewById(AbstractC6918a0.pb_loading);
        this.f63594Y1 = (FrameLayout) inflate.findViewById(AbstractC6918a0.layout_container);
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3() && C19669z.m103146Y().m103226p0()) {
            this.f63649u1.setVisibility(8);
        } else {
            m68347VQ(true);
            C17793b.m93923d().m93936q();
        }
        AbstractC23126l.m118627a(f63530k3);
        C23475l.m123240d().m123242a("onCreateView");
        C23475l.m123240d().m123243b();
        return inflate;
    }

    /* renamed from: GO */
    public C13306b m68316GO() {
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
            if (this.f63548H2 == null) {
                this.f63548H2 = new C13306b(this.f72421L0.getContext());
            }
            return this.f63548H2;
        }
        if (MainTabView.m67645lM() != null) {
            return MainTabView.m67645lM().f63219I1;
        }
        return null;
    }

    /* renamed from: GQ */
    void m68317GQ(String str, C24277c c24277c, ContactProfile contactProfile) {
        String str2;
        boolean z11;
        try {
            if (!TextUtils.isEmpty(str) && !AbstractC21935u.m114550q(str)) {
                if (AbstractC25495a.m132079d(str) && contactProfile != null && !TextUtils.isEmpty(contactProfile.f42446v)) {
                    str2 = contactProfile.f42446v;
                } else {
                    str2 = null;
                }
                String str3 = str2;
                AnimChat animChat = this.f63650u2;
                String str4 = c24277c.f117241b;
                float f11 = c24277c.f117243d;
                if (c24277c.f117240a == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                animChat.m76106O(str4, f11, str3, z11, this.f63543F1, this.f63591X1, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HO */
    int m68318HO(int i11) {
        int i12 = AbstractC16803z.ava01;
        try {
            int[] iArr = {i12, AbstractC16803z.ava02, AbstractC16803z.ava03};
            if (i11 < 3) {
                return iArr[i11];
            }
            return i12;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return i12;
        }
    }

    /* renamed from: HQ */
    void m68319HQ(int i11) {
        C18451m c18451m;
        String str;
        C17487o0 c17487o0;
        C17487o0 c17487o02;
        C17487o0 c17487o03;
        try {
            AbstractC23059e9.m118318G(3);
            C17487o0 c17487o04 = null;
            if (i11 >= 0 && i11 < this.f63579T1.mo10003k()) {
                c18451m = this.f63579T1.m68698R(i11);
            } else {
                c18451m = null;
            }
            this.f63564O1 = c18451m;
            if (c18451m == null) {
                return;
            }
            int i12 = c18451m.f92990a;
            boolean z11 = false;
            if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 != 8) {
                        if (i12 != 35) {
                            if (i12 != 41) {
                                switch (i12) {
                                    case 22:
                                        AbstractC23647d.m123897g("77700002");
                                        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35579p() != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 1);
                                            this.f72421L0.m92676n2().mo35579p().m93069k2(MyCalendarView.class, bundle, 1, true);
                                            return;
                                        }
                                        return;
                                    case 23:
                                        if (this.f63584V0 != 0) {
                                            m68384tQ(c18451m.mo97719a());
                                            return;
                                        }
                                        AbstractC23647d.m123907q("2601", "");
                                        AbstractC23647d.m123893c();
                                        if (this.f72421L0.m92676n2() != null) {
                                            c17487o02 = this.f72421L0.m92676n2().mo35579p();
                                        } else {
                                            c17487o02 = null;
                                        }
                                        if (c17487o02 != null) {
                                            c17487o02.m93069k2(StrangerMessagesView.class, null, 1, true);
                                        }
                                        C11837a.Companion.m65784a().m65781l(m68102BO(), this.f63561N1, c18451m.mo97719a());
                                        return;
                                    case 24:
                                        if (this.f63584V0 != 0) {
                                            m68384tQ(c18451m.mo97719a());
                                            return;
                                        }
                                        AbstractC23647d.m123907q("2602", "");
                                        AbstractC23647d.m123893c();
                                        if (this.f72421L0.m92676n2() != null) {
                                            c17487o03 = this.f72421L0.m92676n2().mo35579p();
                                        } else {
                                            c17487o03 = null;
                                        }
                                        if (c17487o03 != null) {
                                            c17487o03.m93069k2(VipMessagesView.class, null, 1, true);
                                        }
                                        if (AbstractC23309i.m120962G3(3) == 1) {
                                            C0809c1.m2050b(new C12204t(String.valueOf(i11)));
                                            return;
                                        }
                                        return;
                                    default:
                                        String mo97719a = c18451m.mo97719a();
                                        if (this.f63584V0 != 0) {
                                            m68384tQ(mo97719a);
                                            return;
                                        }
                                        if (c18451m instanceof C18440b) {
                                            Conversation m97729o = ((C18440b) c18451m).m97729o();
                                            if (m97729o.m41013q()) {
                                                String m132088m = AbstractC25495a.m132088m(mo97719a);
                                                if (!m132088m.isEmpty()) {
                                                    Bundle m140776b = new C27870vb(m97729o.f42893q).m140777c(m97729o).m140776b();
                                                    m140776b.putString("groupId", m132088m);
                                                    m140776b.putString("groupName", m97729o.f42894r);
                                                    m68309DQ(m140776b, m97729o);
                                                }
                                            } else {
                                                Bundle m140776b2 = new C27870vb(m97729o.f42893q).m140777c(m97729o).m140776b();
                                                m140776b2.putString("STR_SOURCE_START_VIEW", "chats_list");
                                                m68309DQ(m140776b2, m97729o);
                                            }
                                            C11837a.Companion.m65784a().m65781l(m68102BO(), this.f63561N1, c18451m.mo97719a());
                                            return;
                                        }
                                        if (c18451m instanceof C18450l) {
                                            if (((C18450l) c18451m).f92992c.f42352K0 > 0) {
                                                z11 = true;
                                            }
                                            m68305AR(z11);
                                            return;
                                        }
                                        m68321IQ(i11);
                                        return;
                                }
                            }
                            mo68332Nd();
                            return;
                        }
                        if (this.f72421L0.m92676n2() != null) {
                            c17487o0 = this.f72421L0.m92676n2().mo35579p();
                        } else {
                            c17487o0 = null;
                        }
                        if (c17487o0 != null) {
                            c17487o0.m93069k2(GroupInvitationListView.class, null, 1, true);
                            return;
                        }
                        return;
                    }
                    C21933s.m114404I().m114440R0(false);
                    C19669z.m103146Y().m103198O0();
                    return;
                }
                if (this.f63584V0 != 0) {
                    return;
                }
                if (this.f72421L0.m92676n2() != null) {
                    c17487o04 = this.f72421L0.m92676n2().mo35579p();
                }
                if (c17487o04 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("extra_mode", 1);
                    bundle2.putInt("extra_init_page", C21933s.m114404I().f107900a.f107994k + 1);
                    bundle2.putString("extra_title_action_bar", AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_title));
                    c17487o04.m93069k2(SuggestFriendDetailView.class, bundle2, 1, true);
                }
                C0815e1.m2075D().m2099U(3, 2, 11, String.valueOf(1), "0", String.valueOf(i11), "0", "0");
                return;
            }
            if (this.f63584V0 != 0) {
                return;
            }
            m68385uO();
            MainTabView m67645lM = MainTabView.m67645lM();
            if (m67645lM != null) {
                m67645lM.m67693gM();
            }
            C31874cb c31874cb = ((C18450l) c18451m).f92982e;
            if (c31874cb != null) {
                if (c31874cb.f146390f <= 0) {
                    m68305AR(false);
                } else {
                    C21927m.m114302u().m114330e0(c31874cb.f146385a, new TrackingSource(290));
                    if (C21927m.m114302u().m114357s().m153137g(c31874cb.f146385a)) {
                        Conversation conversation = new Conversation(c31874cb.f146385a, c31874cb.f146387c, c31874cb.f146393i);
                        conversation.m40998a().f42352K0 = c31874cb.f146390f;
                        m68309DQ(new C27870vb(conversation.f42893q).m140777c(conversation).m140776b(), conversation);
                    } else {
                        m68305AR(true);
                    }
                }
                C28905e.m144373n().m144400v(c31874cb.f146385a, 20, 91, i11, "");
                C0815e1 m2075D = C0815e1.m2075D();
                String[] strArr = new String[5];
                strArr[0] = String.valueOf(1);
                strArr[1] = c31874cb.f146385a;
                strArr[2] = String.valueOf(i11);
                if (c31874cb.f146399o == 2) {
                    str = "1";
                } else {
                    str = "2";
                }
                strArr[3] = str;
                strArr[4] = String.valueOf(c31874cb.f146389e);
                m2075D.m2099U(3, 2, 11, strArr);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.custom.ActionTitleDialog.InterfaceC11842b
    /* renamed from: I9 */
    public void mo65816I9(int i11) {
        if (i11 == 1 && (this.f63564O1 instanceof C18440b)) {
            SensitiveData sensitiveData = new SensitiveData("phonebook_update_alias_in_message_tab", "phonebook_update");
            Conversation m97729o = ((C18440b) this.f63564O1).m97729o();
            m92692wK().mo35573l4(FrameLayoutKeepBtmSheetZaloView.class, ChangeAliasBottomSheetView.m37078GM(m97729o.f42893q, m97729o.f42894r, 705, sensitiveData), 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C0855y0 c0855y0 = this.f63589W2;
        if (c0855y0 != null) {
            c0855y0.m2383a();
        }
        C12260j.m68693N();
        C22021e0.m114963p().m114983f();
    }

    /* renamed from: IO */
    public View m68320IO(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2092605591:
                if (str.equals("tip.message.compose.addfriend")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1892203953:
                if (str.equals("tip.intro.chatlabel.feature")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1300720808:
                if (str.equals("tip.message.compose")) {
                    c11 = 2;
                    break;
                }
                break;
            case -872249364:
                if (str.equals("tip.open.readlater.tab")) {
                    c11 = 3;
                    break;
                }
                break;
            case -504249850:
                if (str.equals("tip.message.updateprofile")) {
                    c11 = 4;
                    break;
                }
                break;
            case -405565762:
                if (str.equals("tip.message.newchat")) {
                    c11 = 5;
                    break;
                }
                break;
            case 361129209:
                if (str.equals("tip.message.filter.v3")) {
                    c11 = 6;
                    break;
                }
                break;
            case 406516514:
                if (str.equals("tip.message.search")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1026464109:
                if (str.equals("tip.message.compose.creategroup")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1355137304:
                if (str.equals("tip.groupcall.maintab")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1376008104:
                if (str.equals("tip.message.filter.banner")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 1399233812:
                if (str.equals("tip.message.compose.calendar")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1676691636:
                if (str.equals("tip.message.compose.scanqr")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 1875577267:
                if (str.equals("tip.message.compose.zalopc")) {
                    c11 = '\r';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 2:
            case '\b':
            case 11:
            case '\f':
            case '\r':
                if (this.f72421L0.m92666hJ()) {
                    return this.f63654w2;
                }
                if (MainTabView.m67645lM() == null) {
                    return null;
                }
                return MainTabView.m67645lM().f63261w1;
            case 1:
            case 3:
                ZdsTabBar zdsTabBar = this.f63599a1;
                if (zdsTabBar == null) {
                    return null;
                }
                return zdsTabBar.m91304O(1);
            case 4:
                FixedBannerView fixedBannerView = this.f63647t1;
                if (fixedBannerView == null) {
                    return null;
                }
                return fixedBannerView.m68621uO();
            case 5:
                int m122418t4 = AbstractC23309i.m122418t4();
                if (this.f72421L0.m92666hJ() || MainTabView.m67645lM() == null) {
                    return null;
                }
                if (m122418t4 != 1 && m122418t4 != 2) {
                    return null;
                }
                return MainTabView.m67645lM().f63259u1;
            case 6:
            case '\n':
                return this.f63617g1;
            case 7:
                if (MainTabView.m67645lM() == null) {
                    return null;
                }
                return MainTabView.m67645lM().f63217H1;
            case '\t':
                return this.f63656x2;
            default:
                return null;
        }
    }

    /* renamed from: IQ */
    void m68321IQ(int i11) {
        try {
            if (this.f72421L0.m92676n2() != null) {
                C18451m c18451m = this.f63564O1;
                if (c18451m instanceof C18452n) {
                    AbstractC28207v1.m141999j3(((C18452n) c18451m).f92995f, (C18452n) c18451m, this.f72421L0.m92676n2().mo35579p(), i11, this.f72421L0.m92676n2());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f63547H1 = null;
        this.f63553K1 = null;
        this.f63605c1 = null;
        this.f63641q1 = null;
        this.f63572R0.m68681a0();
    }

    /* renamed from: JN */
    void m68322JN(ContactProfile contactProfile) {
        if (this.f63571Q2) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12197m(contactProfile));
        this.f63571Q2 = true;
        c0766k.mo1479L9(contactProfile.f42434r, 12);
    }

    /* renamed from: JO */
    void m68323JO() {
        try {
            C18451m c18451m = this.f63564O1;
            if (c18451m != null) {
                if (c18451m.mo97724g()) {
                    String[] split = this.f63564O1.mo97719a().split("_");
                    if (split.length > 0) {
                        C31973j5 m4472f = C0943w.m4462l().m4472f(split[split.length - 1]);
                        if (m4472f != null) {
                            Bundle m140776b = new C27870vb(this.f63564O1.mo97719a()).m140777c(((C18440b) this.f63564O1).m97729o()).m140776b();
                            m140776b.putString("groupId", m4472f.m153781r());
                            m140776b.putString("groupName", m4472f.m153793y());
                            if (this.f72421L0.m92676n2() != null) {
                                this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                            }
                        } else {
                            m68097AO().m101508a(new C28927g.b(this.f63564O1.mo97719a()));
                            C19669z.m103146Y().m103198O0();
                            ToastUtils.m89260h(17002, false);
                        }
                    }
                } else {
                    Bundle m140776b2 = new C27870vb(this.f63564O1.mo97719a()).m140777c(((C18440b) this.f63564O1).m97729o()).m140776b();
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b2, 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JQ */
    void m68324JQ() {
        C12260j c12260j;
        boolean z11;
        if (this.f63584V0 != 0 && (c12260j = this.f63579T1) != null) {
            if (c12260j.m68706Z() == this.f63579T1.m68699S(null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            m68386uR(z11);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        List emptyList;
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 3) {
            if (mo92862f != 4 && mo92862f != 7 && mo92862f != 8 && mo92862f != 9) {
                if (mo92862f != 17) {
                    if (mo92862f != 18) {
                        if (mo92862f != 26) {
                            if (mo92862f != 27 && mo92862f != 35) {
                                if (mo92862f != 100) {
                                    switch (mo92862f) {
                                        case 13:
                                            if (i11 == -1) {
                                                try {
                                                    interfaceC17463d.dismiss();
                                                    m68241mO(this.f63564O1.mo97719a(), false);
                                                    return;
                                                } catch (Exception e11) {
                                                    e11.printStackTrace();
                                                    return;
                                                }
                                            }
                                            if (i11 == -2) {
                                                try {
                                                    interfaceC17463d.dismiss();
                                                    C32044o1.m154612r().m154616K("chats_list", Collections.singletonList(this.f63564O1.mo97719a()), false);
                                                    return;
                                                } catch (Exception e12) {
                                                    AbstractC20110a.m104539h(e12);
                                                    return;
                                                }
                                            }
                                            return;
                                        case 14:
                                            if (i11 == -1) {
                                                interfaceC17463d.dismiss();
                                                m68369lR(this.f63564O1.mo97719a());
                                                return;
                                            }
                                            return;
                                        case 15:
                                            if (i11 == -1) {
                                                interfaceC17463d.dismiss();
                                                m68388vO(this.f63564O1.mo97719a(), null);
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (mo92862f) {
                                                case 20:
                                                    if (i11 == -1) {
                                                        interfaceC17463d.dismiss();
                                                        try {
                                                            Bundle bundle = new Bundle();
                                                            bundle.putInt("case_passcode_process", 0);
                                                            bundle.putString("uid_set_hidden_chat", this.f63564O1.mo97719a());
                                                            m92692wK().mo35579p().m93066i2(CodeLockMessageView.class, bundle, 8654, 1, true);
                                                            this.f72421L0.removeDialog(20);
                                                            AbstractC23647d.m123906p("22001301");
                                                            AbstractC23647d.m123893c();
                                                            return;
                                                        } catch (Exception e13) {
                                                            e13.printStackTrace();
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                case 21:
                                                    if (i11 == -1) {
                                                        try {
                                                            interfaceC17463d.dismiss();
                                                            m68338PQ(true);
                                                            if (!TextUtils.isEmpty(this.f63588W1)) {
                                                                ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_hidden_setup_with_friend_done), this.f63588W1));
                                                            }
                                                            if (Build.VERSION.SDK_INT >= 25) {
                                                                C26939u.m138770q().m138779h(this.f63564O1.mo97719a());
                                                                return;
                                                            }
                                                            return;
                                                        } catch (Exception e14) {
                                                            e14.printStackTrace();
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                case 22:
                                                    if (i11 == -1) {
                                                        interfaceC17463d.dismiss();
                                                        m68256pQ(this.f63630k2);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    return;
                                            }
                                    }
                                }
                                if (i11 == -2) {
                                    interfaceC17463d.dismiss();
                                    try {
                                        C18450l c18450l = (C18450l) this.f63564O1;
                                        C31874cb c31874cb = c18450l.f92982e;
                                        if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
                                            ContactProfile contactProfile = new ContactProfile(c18450l.f92982e.f146385a);
                                            C31874cb c31874cb2 = c18450l.f92982e;
                                            contactProfile.f42446v = c31874cb2.f146393i;
                                            contactProfile.f42455y = c31874cb2.f146394j;
                                            contactProfile.f42437s = c31874cb2.f146387c;
                                            contactProfile.f42437s = contactProfile.m40383Q(true, false);
                                            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                                            if (this.f72421L0.m92676n2() != null) {
                                                this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } catch (Exception e15) {
                                        e15.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            }
                            if (i11 == -2) {
                                this.f63593Y0 = false;
                                interfaceC17463d.dismiss();
                                return;
                            }
                            if (i11 == -1) {
                                try {
                                    this.f63593Y0 = false;
                                    interfaceC17463d.dismiss();
                                    C12260j c12260j = this.f63579T1;
                                    if (c12260j != null) {
                                        emptyList = AbstractC17574a.m93602i(c12260j.m68701U());
                                    } else {
                                        emptyList = Collections.emptyList();
                                    }
                                    if (interfaceC17463d.mo92862f() == 27) {
                                        m68370mQ(emptyList);
                                        return;
                                    } else {
                                        m68375nQ(emptyList);
                                        return;
                                    }
                                } catch (Exception e16) {
                                    e16.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        }
                        if (i11 == -2) {
                            this.f63593Y0 = false;
                            interfaceC17463d.dismiss();
                            HashMap hashMap = new HashMap();
                            C12260j c12260j2 = this.f63579T1;
                            if (c12260j2 != null) {
                                hashMap.putAll(c12260j2.m68701U());
                            }
                            C32044o1.m154612r().m154616K("chats_list", AbstractC17574a.m93602i(hashMap), false);
                            return;
                        }
                        if (i11 == -1) {
                            try {
                                this.f63593Y0 = false;
                                interfaceC17463d.dismiss();
                                m68234kO(false);
                                return;
                            } catch (Exception e17) {
                                e17.printStackTrace();
                                return;
                            }
                        }
                        return;
                    }
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        m68366kR(((C18440b) this.f63564O1).m97729o().m40996I());
                        return;
                    }
                    return;
                }
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    m68322JN(((C18440b) this.f63564O1).m97729o().m40996I());
                    return;
                }
                return;
            }
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                m68323JO();
                return;
            }
            return;
        }
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            AbstractC23309i.m121177Lx(true);
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                c17487o0.m93069k2(NearbyZView.class, null, 1, true);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 108);
        C23744a.m124114c().m124117e(this, 121);
        C23744a.m124114c().m124117e(this, 91);
        C23744a.m124114c().m124117e(this, 135);
        C23744a.m124114c().m124117e(this, 136);
        C23744a.m124114c().m124117e(this, 92);
        C23744a.m124114c().m124117e(this, 8101);
        C23744a.m124114c().m124117e(this, 8150);
    }

    /* renamed from: KO */
    void m68325KO(C1483e c1483e) {
        String str = "";
        switch (((Integer) c1483e.f6374a).intValue()) {
            case 0:
                C0856z.m2393m().m2397g(true, new C31931g8(this.f63564O1), this, true, 5);
                return;
            case 1:
                C0856z.m2393m().m2397g(false, new C31931g8(this.f63564O1), this, true, 2);
                return;
            case 2:
                C7860a.b bVar = C7860a.Companion;
                C18431b m40271O = bVar.m40303b().m40271O(1);
                Conversation m97729o = ((C18440b) this.f63564O1).m97729o();
                if (m40271O != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(m97729o);
                    str = bVar.m40303b().m40261E(C23648e.Companion.m123930b(), "chats_list", "chat_unlabel", 0, arrayList);
                }
                m68287wQ(m97729o.f42893q, str);
                return;
            case 3:
                C7860a.b bVar2 = C7860a.Companion;
                if (bVar2.m40303b().m40271O(1) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(((C18440b) this.f63564O1).m97729o());
                    str = bVar2.m40303b().m40261E(C23648e.Companion.m123930b(), "chats_list", "chat_label", 0, arrayList2);
                }
                m68293xQ(this.f63564O1.mo97719a(), str);
                return;
            case 4:
                m68344TQ(this.f63564O1.mo97719a());
                return;
            case 5:
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_CONTACT_PROFILE", ((C18440b) this.f63564O1).m97729o().m40998a().m40373K());
                bundle.putInt("EXTRA_ENTRY_SCREEN", BottomSheetBlockView.EnumC11169b.f56205t.m58496c());
                m92692wK().mo35573l4(BottomSheetBlockView.class, bundle, 1, true);
                return;
            case 6:
                this.f72421L0.showDialog(13);
                AbstractC23647d.m123906p("220012");
                AbstractC23647d.m123893c();
                return;
            case 7:
                m68348WQ(1);
                C18451m c18451m = this.f63564O1;
                if (c18451m != null) {
                    str = c18451m.mo97719a();
                }
                m68384tQ(str);
                C12260j c12260j = this.f63579T1;
                if (c12260j != null) {
                    c12260j.m68713g0(false);
                    this.f63579T1.m68712f0(false);
                    this.f63579T1.m68711e0(true);
                }
                AbstractC23647d.m123906p("220012");
                AbstractC23647d.m123893c();
                return;
            case 8:
                m68348WQ(2);
                C18451m c18451m2 = this.f63564O1;
                if (c18451m2 != null) {
                    str = c18451m2.mo97719a();
                }
                m68384tQ(str);
                C12260j c12260j2 = this.f63579T1;
                if (c12260j2 != null) {
                    c12260j2.m68713g0(true);
                    this.f63579T1.m68712f0(true);
                    this.f63579T1.m68711e0(true);
                    return;
                }
                return;
            case 9:
                this.f72421L0.showDialog(15);
                return;
            case 10:
                this.f72421L0.showDialog(14);
                return;
            case 11:
                if (AbstractC23165o5.m119333b()) {
                    this.f72421L0.removeDialog(24);
                    this.f72421L0.showDialog(24);
                } else if (AbstractC26683d.f126391B) {
                    if (!AbstractC23088h5.m118421b()) {
                        AbstractC23350e.m122772b("System Setting not allow to create Bubbles on Screen", new Object[0]);
                        this.f72421L0.removeDialog(103);
                        this.f72421L0.showDialog(103);
                    } else if (!AbstractC23192r.m119490a()) {
                        AbstractC23350e.m122772b("System Setting not allow to create Bubbles on Screen", new Object[0]);
                        this.f72421L0.removeDialog(102);
                        this.f72421L0.showDialog(102);
                    } else if (AbstractC23192r.m119491b(((C18440b) this.f63564O1).m97729o().m40996I())) {
                        AbstractC23350e.m122772b("ChatView: Open Bubble Chat " + this.f63564O1.mo97719a(), new Object[0]);
                    } else if (this.f72421L0.m92676n2() != null) {
                        AbstractC23034c6.m118178s0(this.f72421L0.m92676n2().mo35579p(), 1016);
                    }
                } else if (AbstractC26681b.f126356a) {
                    if (AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                        m68231jR();
                    } else if (this.f72421L0.m92676n2() != null) {
                        AbstractC23034c6.m118182u0(this.f72421L0.m92676n2().mo35579p(), 1015);
                    }
                }
                AbstractC23647d.m123906p("220013");
                AbstractC23647d.m123893c();
                return;
            case 12:
                m68133LQ(this.f63564O1);
                return;
            case 13:
                this.f72421L0.removeDialog(16);
                this.f72421L0.showDialog(16);
                return;
            case 14:
                m68348WQ(3);
                C18451m c18451m3 = this.f63564O1;
                if (c18451m3 != null) {
                    str = c18451m3.mo97719a();
                }
                m68384tQ(str);
                C12260j c12260j3 = this.f63579T1;
                if (c12260j3 != null) {
                    c12260j3.m68713g0(false);
                    this.f63579T1.m68712f0(false);
                    this.f63579T1.m68711e0(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: KQ */
    public void m68326KQ() {
        try {
            C12260j c12260j = this.f63579T1;
            if (c12260j != null) {
                c12260j.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: LN */
    void m68327LN() {
        if (AbstractC23309i.m120776B2()) {
            TextView textView = (TextView) this.f63654w2.m92774j(AbstractC23136l9.m118727m(m92689tK(), 15, AbstractC8020f0.str_call_create_groupcall_entrypoint, AbstractC16803z.icn_menu_groupcall));
            this.f63540D2 = textView;
            textView.setPadding(AbstractC23222t7.f112590v, 0, 0, 0);
        }
    }

    /* renamed from: LO */
    public boolean m68328LO() {
        try {
            C18451m c18451m = this.f63567P1;
            this.f63564O1 = c18451m;
            if (c18451m.f92990a == 43) {
                m68362gR(c18451m);
                return true;
            }
            if (TextUtils.isEmpty(c18451m.mo97719a())) {
                return false;
            }
            final List m68391yO = m68391yO(this.f63564O1);
            ArrayList arrayList = new ArrayList();
            Iterator it = m68391yO.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((C1483e) it.next()).f6375b);
            }
            if (!m68391yO.isEmpty()) {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                String str = "";
                if (this.f63564O1.m97766i()) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title);
                } else if (this.f63564O1.m97768l()) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg);
                } else if (this.f63564O1.m97765e()) {
                    str = ((C18440b) this.f63564O1).m97729o().m40999b(true, false);
                }
                String str2 = str;
                if (C18631a.m98447m(this.f63564O1.mo97719a())) {
                    aVar.m43158g(new ActionTitleDialog.C11841a(m92648SI(), 1, str2, AbstractC16803z.ic_icn_userprofile_alias_edit, this).m65815b());
                } else {
                    aVar.m43172u(str2);
                }
                aVar.m43173v(100);
                aVar.m43155d(true);
                aVar.m43160i((CharSequence[]) arrayList.toArray(new String[0]), new InterfaceC17463d.d() { // from class: t70.d1
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        MessagesView.this.m68242mP(m68391yO, interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f63582U1 = m43152a;
                if (!m43152a.m92868m()) {
                    this.f63582U1.mo13822K();
                }
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: MN */
    void m68329MN(int i11) {
        if (this.f63596Z0 == null) {
            return;
        }
        int m68291xO = m68291xO();
        ObjectAnimator objectAnimator = this.f63556L2;
        if (objectAnimator == null) {
            this.f63556L2 = ObjectAnimator.ofFloat(this.f63596Z0, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, -m68291xO);
        } else {
            objectAnimator.setFloatValues(0.0f, -m68291xO);
        }
        this.f63556L2.setDuration(i11);
        this.f63556L2.removeListener(this.f63562N2);
        this.f63556L2.addListener(this.f63562N2);
        this.f63556L2.start();
    }

    /* renamed from: MQ */
    public void m68330MQ() {
        this.f63587W0 = 0;
        m68348WQ(0);
        this.f63592X2 = false;
        this.f63579T1.m68707a0();
    }

    /* renamed from: NN */
    void m68331NN(int i11) {
        if (this.f63596Z0 != null && this.f63619g3.compareAndSet(false, true)) {
            int m68291xO = m68291xO();
            ObjectAnimator objectAnimator = this.f63554K2;
            if (objectAnimator == null) {
                this.f63554K2 = ObjectAnimator.ofFloat(this.f63596Z0, (Property<LinearLayout, Float>) View.TRANSLATION_Y, -m68291xO, 0.0f);
            } else {
                objectAnimator.setFloatValues(-m68291xO, 0.0f);
            }
            this.f63554K2.setDuration(i11);
            this.f63554K2.removeListener(this.f63559M2);
            this.f63554K2.addListener(this.f63559M2);
            this.f63554K2.start();
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: Nd */
    public void mo68332Nd() {
        C17487o0 mo35579p;
        if (this.f72421L0.m92676n2() != null && (mo35579p = this.f72421L0.m92676n2().mo35579p()) != null) {
            mo35579p.m93069k2(SelectMultiItemAddChatLabelView.class, null, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: Nq */
    public void mo68333Nq(int i11) {
        String str;
        try {
            if (this.f63584V0 == 0 && i11 >= 0 && i11 < this.f63579T1.mo10003k()) {
                C18451m m68698R = this.f63579T1.m68698R(i11);
                if (m68698R.f92990a == 3) {
                    this.f63564O1 = m68698R;
                    C18450l c18450l = (C18450l) m68698R;
                    C31874cb c31874cb = c18450l.f92982e;
                    if (c31874cb != null) {
                        if (c31874cb.f146400p == 3) {
                            Conversation conversation = new Conversation(c31874cb.f146385a, c31874cb.f146387c, c31874cb.f146393i);
                            conversation.m40998a().f42352K0 = c31874cb.f146390f;
                            m68309DQ(new C27870vb(conversation.f42893q).m140777c(conversation).m140776b(), conversation);
                        } else if (c31874cb.f146390f <= 0) {
                            if (c31874cb.f146399o == 2) {
                                this.f63627j2 = c31874cb.f146385a;
                                m68256pQ(c31874cb.m153177a());
                            } else {
                                this.f63627j2 = c31874cb.f146385a;
                                m68313FO(c31874cb.m153177a(), c31874cb.f146389e);
                            }
                        } else if (C21927m.m114302u().m114357s().m153137g(c31874cb.f146385a)) {
                            Conversation conversation2 = new Conversation(c31874cb.f146385a, c31874cb.f146387c, c31874cb.f146393i);
                            conversation2.m40998a().f42352K0 = c31874cb.f146390f;
                            m68309DQ(new C27870vb(conversation2.f42893q).m140777c(conversation2).m140776b(), conversation2);
                            C21933s.m114404I().m114407A0(c31874cb.f146385a);
                        } else {
                            String str2 = c31874cb.f146385a;
                            this.f63627j2 = str2;
                            m68388vO(str2, new TrackingSource(290));
                        }
                        C0815e1 m2075D = C0815e1.m2075D();
                        String[] strArr = new String[5];
                        strArr[0] = String.valueOf(1);
                        strArr[1] = c18450l.f92982e.f146385a;
                        strArr[2] = String.valueOf(i11);
                        C31874cb c31874cb2 = c18450l.f92982e;
                        if (c31874cb2.f146399o == 2) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        strArr[3] = str;
                        strArr[4] = String.valueOf(c31874cb2.f146389e);
                        m2075D.m2099U(3, 3, 11, strArr);
                        C28905e.m144373n().m144400v(c31874cb.f146385a, 21, 91, i11, "");
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ON */
    boolean m68334ON(String str) {
        int m68695O;
        C18451m m68698R;
        C12260j c12260j = this.f63579T1;
        if (c12260j == null || (m68695O = c12260j.m68695O(str)) < 0 || (m68698R = this.f63579T1.m68698R(m68695O)) == null) {
            return false;
        }
        if (!TextUtils.isEmpty(m68698R.mo97719a()) && !this.f63579T1.m68694M(m68698R.mo97719a())) {
            return false;
        }
        return true;
    }

    /* renamed from: OO */
    void m68335OO() {
        if (this.f63549I1) {
            this.f63549I1 = false;
            this.f63545G1.removeAllViews();
            this.f63545G1.setVisibility(8);
            this.f63547H1 = null;
        }
    }

    /* renamed from: OQ */
    void m68336OQ(Bundle bundle) {
        try {
            m68348WQ(bundle.getInt("MODE_SELECTED", 0));
            if (this.f63584V0 == 0) {
                return;
            }
            this.f63587W0 = bundle.getInt("TYPE_SELECTED", 0);
            this.f63593Y0 = bundle.getBoolean("HAS_DIALOG_SHOWING", false);
            this.f63590X0 = bundle.getInt("LAST_ACTION_MODE_CREATED", 0);
            C12260j c12260j = this.f63579T1;
            if (c12260j != null) {
                c12260j.m68708b0(bundle);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
    /* renamed from: P1 */
    public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x016e A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:3:0x0005, B:11:0x001b, B:13:0x001f, B:16:0x0031, B:18:0x0037, B:20:0x0042, B:21:0x0049, B:30:0x0067, B:34:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x0095, B:43:0x009b, B:46:0x00a0, B:48:0x00b0, B:50:0x00b6, B:54:0x00bf, B:55:0x00cf, B:57:0x0164, B:59:0x016e, B:61:0x0197, B:64:0x00e8, B:66:0x00f1, B:71:0x010d, B:73:0x011f, B:75:0x0138, B:78:0x0141, B:81:0x0155, B:87:0x017e, B:89:0x0186, B:95:0x0053, B:99:0x019e, B:101:0x01a2, B:102:0x01a9, B:105:0x0028, B:106:0x0014), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197 A[SYNTHETIC] */
    /* renamed from: PN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m68337PN(int i11, int i12, List list) {
        boolean z11;
        int size;
        HashMap m2385c;
        boolean z12;
        C31874cb c31874cb;
        C23669z c23669z;
        try {
            boolean z13 = true;
            if (AbstractC23309i.m120962G3(3) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (size == 0) {
                return;
            }
            C0855y0 c0855y0 = this.f63589W2;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                m2385c = c0855y0.m2385c();
            }
            int i13 = 0;
            while (i13 < size) {
                if (list.get(i13) != null) {
                    C18451m c18451m = (C18451m) list.get(i13);
                    ContactProfile contactProfile = null;
                    if (c18451m instanceof C18450l) {
                        c31874cb = ((C18450l) c18451m).f92982e;
                    } else {
                        c31874cb = null;
                    }
                    ContactProfile contactProfile2 = c18451m.f92992c;
                    if (contactProfile2 != null) {
                        contactProfile = contactProfile2;
                    } else if (c31874cb != null) {
                        contactProfile = c31874cb.m153177a();
                    }
                    if (i13 < i11 || i13 > i12) {
                        z12 = z11;
                        if (contactProfile != null && z12 && m2385c.containsKey(contactProfile.f42434r)) {
                            ((C23669z) m2385c.get(contactProfile.f42434r)).f114660g = false;
                        }
                    } else if (z11) {
                        if (contactProfile != null) {
                            if (!AbstractC25495a.m132081f(contactProfile.f42434r)) {
                                if (c31874cb != null) {
                                }
                            }
                            String str = "1";
                            if (m2385c.containsKey(contactProfile.f42434r)) {
                                C23669z c23669z2 = (C23669z) m2385c.get(contactProfile.f42434r);
                                if (c23669z2 instanceof C23651h) {
                                    C23651h c23651h = (C23651h) c23669z2;
                                    if (c23651h.f114659f != null && c23651h.m123964l() && !c23669z2.f114660g) {
                                        c23669z2.f114660g = z13;
                                        String valueOf = String.valueOf(i13);
                                        if (c23651h.f114659f[2].equals(valueOf)) {
                                            String str2 = c23651h.f114659f[0];
                                            if (str2 != null && !str2.isEmpty()) {
                                                str = str2;
                                            }
                                            c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                                        } else {
                                            z12 = z11;
                                            c23669z2.f114656c = System.currentTimeMillis();
                                            c23651h.f114659f[0] = String.valueOf(1);
                                            c23651h.f114659f[2] = valueOf;
                                        }
                                    }
                                }
                                z12 = z11;
                            } else {
                                z12 = z11;
                                if (AbstractC25495a.m132081f(contactProfile.f42434r)) {
                                    C23651h m123961i = C23651h.m123961i(6, String.valueOf(1), "mediabox", String.valueOf(i13));
                                    if (m123961i != null) {
                                        m123961i.f114654a = 3;
                                        m123961i.f114655b = 1;
                                        m123961i.f114657d = 6;
                                        m123961i.f114660g = true;
                                        m2385c.put(contactProfile.f42434r, m123961i);
                                    }
                                } else if (c31874cb != null) {
                                    String[] strArr = new String[5];
                                    strArr[0] = String.valueOf(1);
                                    strArr[1] = contactProfile.f42434r;
                                    strArr[2] = String.valueOf(i13);
                                    if (c18451m.f92992c != null || c31874cb.f146399o != 2) {
                                        str = "2";
                                    }
                                    strArr[3] = str;
                                    strArr[4] = String.valueOf(contactProfile.f42373R0);
                                    C23651h m123961i2 = C23651h.m123961i(11, strArr);
                                    if (m123961i2 != null) {
                                        m123961i2.f114654a = 3;
                                        m123961i2.f114655b = 1;
                                        m123961i2.f114657d = 11;
                                        m123961i2.f114660g = true;
                                        m2385c.put(contactProfile.f42434r, m123961i2);
                                        c23669z = (C23669z) m2385c.get(contactProfile.f42434r);
                                        if (c23669z == null) {
                                            C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z);
                                        }
                                    }
                                }
                            }
                            c23669z = (C23669z) m2385c.get(contactProfile.f42434r);
                            if (c23669z == null) {
                            }
                        }
                    }
                    i13++;
                    z11 = z12;
                    z13 = true;
                }
                z12 = z11;
                i13++;
                z11 = z12;
                z13 = true;
            }
            if (this.f63589W2 == null) {
                this.f63589W2 = new C0855y0();
            }
            this.f63589W2.m2386d(m2385c);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: PQ */
    void m68338PQ(boolean z11) {
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
            if (this.f63644r2 == null) {
                RedDotImageButton redDotImageButton = this.f63544F2;
                this.f63644r2 = new C32132u5(redDotImageButton, C23212s8.m119607o(redDotImageButton.getContext(), AbstractC16781w.NotificationReddot));
            }
            if (this.f63544F2 != null) {
                C32132u5 c32132u5 = this.f63644r2;
                if (!c32132u5.f148211h) {
                    AbstractC23195r2.f112443e = true;
                    c32132u5.m155101b(z11, new Runnable() { // from class: t70.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesView.this.m68164UP();
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (m68307CO() != null) {
            m68307CO().m67709sN(z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (super.mo37491QJ(i11)) {
            return true;
        }
        if (i11 == AbstractC16803z.icon_header_qrcode) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_src", 1);
            AbstractC26412d.m136219h(m92676n2(), bundle, 0);
            AbstractC23647d.m123897g("20000302");
        } else {
            C17487o0 c17487o0 = null;
            if (i11 == 2) {
                Bundle bundle2 = new Bundle();
                bundle2.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 7);
                if (this.f72421L0.m92676n2() != null) {
                    c17487o0 = this.f72421L0.m92676n2().mo35579p();
                }
                if (c17487o0 != null) {
                    c17487o0.m93069k2(QuickCreateGroupView.class, bundle2, 1, true);
                }
                AbstractC23647d.m123897g("27403");
                AbstractC28025b8.m141442M("tip.message.compose.creategroup");
                m68352YN("tip.message.compose.creategroup");
                m68352YN("tip.message.compose");
            } else if (i11 == 3) {
                m92693xK().m93066i2(FindFriendByPhoneNumberView.class, null, 0, 1, true);
                AbstractC23647d.m123897g("20000301");
                AbstractC28025b8.m141442M("tip.message.compose.addfriend");
                m68352YN("tip.message.compose.addfriend");
                m68352YN("tip.message.compose");
            } else if (i11 == 4) {
                Bundle bundle3 = new Bundle();
                bundle3.putInt("extra_src", 1);
                AbstractC26412d.m136219h(m92676n2(), bundle3, 0);
                AbstractC23647d.m123897g("20000302");
                AbstractC28025b8.m141442M("tip.message.compose.scanqr");
                m68352YN("tip.message.compose.scanqr");
                m68352YN("tip.message.compose");
            } else if (i11 == 5) {
                if (AbstractC23057e7.m118299f()) {
                    AbstractC23057e7.m118306m(m92676n2());
                } else {
                    m92693xK().m93069k2(HistoryLoginView.class, null, 1, true);
                }
                AbstractC23647d.m123897g("20000303");
                AbstractC28025b8.m141442M("tip.message.compose.zalopc");
                m68352YN("tip.message.compose.zalopc");
                m68352YN("tip.message.compose");
            } else if (i11 == 6) {
                AbstractC23647d.m123897g("77700001");
                Bundle bundle4 = new Bundle();
                bundle4.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 0);
                m92693xK().m93069k2(MyCalendarView.class, bundle4, 1, true);
            } else if (i11 == 7) {
                ContactProfile m141811g = C28203u6.f131407a.m141811g("204278670");
                if (m141811g == null) {
                    m141811g = new ContactProfile("204278670");
                }
                Bundle m140776b = new C27870vb("204278670").m140780g(m141811g).m140776b();
                m140776b.putString("STR_SOURCE_START_VIEW", "chats_list_button_plus");
                m92693xK().m93069k2(ChatView.class, m140776b, 1, true);
            } else if (i11 == 10) {
                m68385uO();
                MainTabView m67645lM = MainTabView.m67645lM();
                if (m67645lM != null) {
                    m67645lM.m67693gM();
                }
            } else if (i11 == 13) {
                m68381sO();
            } else if (i11 == 12) {
                m68371mR(m68379rO(false, false));
            } else if (i11 == 14) {
                Bundle bundle5 = new Bundle();
                bundle5.putInt("extra_source_call", 4);
                m92693xK().m93069k2(CreateGroupCallZView.class, bundle5, 1, true);
                AbstractC28025b8.m141442M("tip.groupcall.maintab");
                m68352YN("tip.groupcall.maintab");
                C0815e1.m2075D().m2100V(new C23648e(24, "chats_list_header", 0, "gr_call_create", "0"), false);
            } else if (i11 == 15) {
                Bundle bundle6 = new Bundle();
                bundle6.putInt("extra_source_call", 5);
                m92693xK().m93069k2(CreateGroupCallZView.class, bundle6, 1, true);
                C0815e1.m2075D().m2100V(new C23648e(24, "chats_list_button_plus", 0, "gr_call_create", "0"), false);
            }
        }
        return true;
    }

    /* renamed from: QN */
    void m68339QN() {
        try {
            int m9745c2 = this.f63591X1.m9745c2();
            for (int m9740Y1 = this.f63591X1.m9740Y1(); m9740Y1 <= m9745c2; m9740Y1++) {
                C18451m m68698R = this.f63579T1.m68698R(m9740Y1);
                if ((m68698R instanceof C18450l) && ((C18450l) m68698R).f92982e != null) {
                    this.f63543F1.m9823C0(this.f63591X1.mo9732P(m9740Y1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m68345UQ(false);
        C23744a.m124114c().m124117e(this, 29);
        C23744a.m124114c().m124117e(this, 36);
        C23744a.m124114c().m124117e(this, 44);
        C23744a.m124114c().m124117e(this, 53);
        C23744a.m124114c().m124117e(this, 63);
        C23744a.m124114c().m124117e(this, 89);
        C23744a.m124114c().m124117e(this, 50);
        C23744a.m124114c().m124117e(this, 137);
        C23744a.m124114c().m124117e(this, 5200);
        this.f63573R1 = false;
        f63532m3 = false;
        m68151RN();
        if (C32044o1.m154612r().m154614G()) {
            C32044o1.m154612r().m154628n();
        }
        m68358dR(false);
        this.f63645s1 = C20058a.Companion.m104191a(C18932a.f94442a.m99179c());
    }

    /* renamed from: RQ */
    public void m68340RQ(ContactProfile contactProfile, int i11) {
        String str;
        if (this.f63638o2) {
            return;
        }
        this.f63632l2 = contactProfile;
        TrackingSource m114310H = C21927m.m114302u().m114310H(contactProfile.f42434r);
        if (m114310H == null) {
            str = "";
        } else {
            str = m114310H.m40682o();
        }
        this.f63638o2 = true;
        this.f63640p2.mo1704o8(this.f63642q2);
        this.f63640p2.mo1620d7(contactProfile.f42434r, "", i11, str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        bundle.putInt("CURRENT_LABEL_INDEX", this.f63561N1);
        C24559a.m127933c("[ConversationLabel]", "MessagesView#onSaveInstanceState mCurrentLabelIndex = " + this.f63561N1);
        bundle.putString("PREV_CHAT_TAG_SETTING_CONFIG", C20058a.Companion.m104193c(this.f63645s1).toString());
        super.mo37118SJ(bundle);
        int i11 = this.f63584V0;
        if (i11 != 0) {
            bundle.putInt("MODE_SELECTED", i11);
            bundle.putInt("TYPE_SELECTED", this.f63587W0);
            bundle.putBoolean("HAS_DIALOG_SHOWING", this.f63593Y0);
            bundle.putInt("LAST_ACTION_MODE_CREATED", this.f63590X0);
            C12260j c12260j = this.f63579T1;
            if (c12260j != null) {
                c12260j.m68709c0(bundle);
            }
        }
    }

    /* renamed from: SO */
    boolean m68341SO() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && (actionBar.getActionMode() == null || !this.f88760a0.m92720p())) {
            return true;
        }
        return false;
    }

    /* renamed from: SQ */
    boolean m68342SQ(C12191g0 c12191g0) {
        int i11;
        android.widget.Button button;
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null && actionBar.getActionMode() != null && c12191g0 != null) {
                if (!TextUtils.isEmpty(c12191g0.f63688a) && (button = this.f63575S0) != null) {
                    button.setText(c12191g0.f63688a);
                    this.f63575S0.setEnabled(c12191g0.f63690c);
                }
                if (c12191g0.f63689b) {
                    ActionBarMenuItem actionBarMenuItem = this.f63578T0;
                    if (actionBarMenuItem != null && actionBarMenuItem.getIconView() != null) {
                        this.f63578T0.getIconView().setImageResource(AbstractC2810d.cb_medium_checked);
                    }
                    if (this.f63581U0 != null) {
                        if (AbstractC23136l9.m118660K0(MainApplication.getAppContext())) {
                            i11 = AbstractC8020f0.str_menu_uncheck_all_short;
                        } else {
                            i11 = AbstractC8020f0.str_menu_uncheck_all;
                        }
                        this.f63581U0.setText(AbstractC23136l9.m118743r0(i11));
                        return true;
                    }
                    return true;
                }
                ActionBarMenuItem actionBarMenuItem2 = this.f63578T0;
                if (actionBarMenuItem2 != null && actionBarMenuItem2.getIconView() != null) {
                    this.f63578T0.getIconView().setImageResource(AbstractC2810d.cb_medium_normal);
                }
                android.widget.Button button2 = this.f63581U0;
                if (button2 != null) {
                    button2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_mark_as_read_select_all));
                    return true;
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.NormalMsgModuleView.InterfaceC12426b
    /* renamed from: Sh */
    public boolean mo68343Sh(String str) {
        try {
            if (AbstractC22055v0.m115143d(str) && AbstractC22055v0.m115114D(str, AbstractC21244b.m110054d(getContext()))) {
                C31980jc m115161u = AbstractC22055v0.m115161u(str);
                if (this.f63585V1 != null && m115161u != null) {
                    m115161u.m153811A(true);
                    this.f63585V1.mo47172c(m115161u, null, 344);
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            if (this.f88760a0 != null) {
                if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
                    this.f88760a0.setTitle("");
                    this.f88760a0.setBackButtonImage(0);
                    this.f88760a0.setVisibility(0);
                    LinearLayout linearLayout = new LinearLayout(m92648SI());
                    linearLayout.setOrientation(0);
                    RedDotImageButton redDotImageButton = new RedDotImageButton(m92648SI());
                    this.f63544F2 = redDotImageButton;
                    redDotImageButton.setScaleType(ImageView.ScaleType.CENTER);
                    this.f63544F2.setImageResource(AbstractC16803z.icon_header_search);
                    this.f63544F2.setBackgroundResource(AbstractC7356u0.item_actionbar_background_ripple);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(54.0f), AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height));
                    layoutParams.setMargins(AbstractC23136l9.m118742r(2.0f), 0, AbstractC23136l9.m118742r(6.0f), 0);
                    this.f63544F2.setLayoutParams(layoutParams);
                    linearLayout.addView(this.f63544F2);
                    this.f63544F2.setOnClickListener(this);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                    layoutParams2.weight = 1.0f;
                    RobotoTextView robotoTextView = new RobotoTextView(m92686rK());
                    this.f63652v2 = robotoTextView;
                    robotoTextView.setText(AbstractC8020f0.str_search_global_pre_state_main_search_hint);
                    this.f63652v2.setTextColor(AbstractC23136l9.m118645D(getContext(), AbstractC16801x.search_tab_text_colors));
                    this.f63652v2.setTextSize(1, 16.0f);
                    this.f63652v2.setGravity(16);
                    this.f63652v2.setLayoutParams(layoutParams2);
                    linearLayout.addView(this.f63652v2);
                    this.f63652v2.setOnClickListener(this);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.gravity = 16;
                    this.f88760a0.addView(linearLayout, layoutParams3);
                } else {
                    this.f88760a0.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TQ */
    void m68344TQ(String str) {
        try {
            if (TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                this.f72421L0.showDialog(20);
                AbstractC23647d.m123906p("22001300");
                AbstractC23647d.m123893c();
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("uid_set_hidden_chat", str);
                bundle.putInt("case_passcode_process", 2);
                m92692wK().mo35579p().m93066i2(CodeLockMessageView.class, bundle, 8654, 1, true);
                AbstractC23647d.m123906p("22001304");
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            m68360fO();
            C23744a.m124114c().m124115b(this, 106);
            C23744a.m124114c().m124115b(this, 3002);
            C23744a.m124114c().m124115b(this, 6072);
            C23744a.m124114c().m124115b(this, 6076);
            C23744a.m124114c().m124115b(this, 6077);
            C23744a.m124114c().m124115b(this, 6075);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: UQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m68345UQ(boolean z11) {
        boolean z12;
        QuickActionViewType5 quickActionViewType5;
        try {
            C31862c c31862c = AbstractC23304d.f113280G2;
            int i11 = 0;
            if (c31862c != null) {
                if (c31862c.f146309b == 4) {
                    if (!c31862c.m153149a()) {
                    }
                    z12 = true;
                    if (this.f63543F1 != null && z12) {
                        while (true) {
                            if (i11 < this.f63543F1.getChildCount()) {
                                View childAt = this.f63543F1.getChildAt(i11);
                                if ((childAt instanceof QuickActionViewLayout) && (((QuickActionViewLayout) childAt).f69453s instanceof QuickActionViewType5)) {
                                    quickActionViewType5 = (QuickActionViewType5) ((QuickActionViewLayout) childAt).f69453s;
                                    break;
                                }
                                i11++;
                            } else {
                                quickActionViewType5 = null;
                                break;
                            }
                        }
                        if (quickActionViewType5 != null) {
                            quickActionViewType5.setEnableAutoSliding(z11);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C31862c c31862c2 = AbstractC23304d.f113284H2;
            if (c31862c2 == null || c31862c2.f146309b != 4 || !c31862c2.m153149a()) {
                z12 = false;
                if (this.f63543F1 != null) {
                    return;
                } else {
                    return;
                }
            }
            z12 = true;
            if (this.f63543F1 != null) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: Uv */
    public void mo68346Uv() {
        AnimChat animChat = this.f63650u2;
        if (animChat != null && animChat.getParent() != null) {
            this.f63650u2.m76121r0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f63573R1 = false;
        AnimChat animChat = this.f63650u2;
        if (animChat != null && animChat.getParent() != null) {
            this.f63650u2.m76101A0(false, false);
            FrameLayout frameLayout = this.f63594Y1;
            if (frameLayout != null) {
                frameLayout.removeView(this.f63650u2);
            }
        }
        C8009j c8009j = this.f63582U1;
        if (c8009j != null && c8009j.m92868m()) {
            this.f63582U1.dismiss();
        }
        C23744a.m124114c().m124117e(this, 106);
        C23744a.m124114c().m124117e(this, 3002);
        C23744a.m124114c().m124117e(this, 6072);
        C23744a.m124114c().m124117e(this, 6076);
        C23744a.m124114c().m124117e(this, 6077);
        C23744a.m124114c().m124117e(this, 6075);
    }

    /* renamed from: VQ */
    void m68347VQ(boolean z11) {
        try {
            if (z11) {
                this.f63651v1.setVisibility(0);
                this.f63649u1.setVisibility(0);
                for (int childCount = this.f63649u1.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = this.f63649u1.getChildAt(childCount);
                    if (!(childAt instanceof ScrollView) || (childAt.getId() != AbstractC6918a0.list_empty_withcontent_scrollview && childAt.getId() != AbstractC6918a0.list_empty_tab_read_later)) {
                    }
                    this.f63649u1.removeViewAt(childCount);
                    return;
                }
                return;
            }
            if (this.f63579T1.mo10003k() > 0) {
                this.f63649u1.setVisibility(8);
                return;
            }
            if (m68102BO() != 0) {
                m68257pR();
            } else if (this.f63561N1 == 1) {
                m68380rR();
            } else {
                m68378qR();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WQ */
    public void m68348WQ(int i11) {
        C18932a c18932a = C18932a.f94442a;
        boolean z11 = false;
        if (c18932a.m99182f() || c18932a.m99184h()) {
            if (i11 == 0) {
                for (int i12 = 0; i12 < 2; i12++) {
                    View m91304O = this.f63599a1.m91304O(i12);
                    if (m91304O != null) {
                        m91304O.setEnabled(true);
                    }
                }
                this.f63599a1.setOnItemClickListener(new ZdsTabBar.InterfaceC17059e() { // from class: t70.f
                    @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.InterfaceC17059e
                    /* renamed from: i0 */
                    public final void mo87275i0(RecyclerView recyclerView, int i13, View view) {
                        MessagesView.this.m68168VP(recyclerView, i13, view);
                    }
                });
                this.f63599a1.setOnItemLongClickListener(new ZdsTabBar.InterfaceC17060f() { // from class: t70.g
                    @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.InterfaceC17060f
                    /* renamed from: T3 */
                    public final boolean mo91310T3(RecyclerView recyclerView, int i13, View view) {
                        boolean m68172WP;
                        m68172WP = MessagesView.this.m68172WP(recyclerView, i13, view);
                        return m68172WP;
                    }
                });
                this.f63626j1.setEnabled(true);
                this.f63629k1.setEnabled(true);
                this.f63617g1.setEnabled(true);
                this.f63631l1.setEnabled(true);
                this.f63635n1.setEnabled(true);
                this.f63626j1.setOnLongClickListener(new View.OnLongClickListener() { // from class: t70.h
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m68176XP;
                        m68176XP = MessagesView.this.m68176XP(view);
                        return m68176XP;
                    }
                });
                this.f63617g1.setOnClickListener(new View.OnClickListener() { // from class: t70.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MessagesView.this.m68179YP(view);
                    }
                });
                this.f63629k1.setOnClickListener(new View.OnClickListener() { // from class: t70.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MessagesView.this.m68183ZP(view);
                    }
                });
            } else {
                for (int i13 = 0; i13 < 2; i13++) {
                    View m91304O2 = this.f63599a1.m91304O(i13);
                    if (m91304O2 != null) {
                        m91304O2.setEnabled(false);
                    }
                }
                this.f63626j1.setEnabled(false);
                this.f63629k1.setEnabled(false);
                this.f63617g1.setEnabled(false);
                this.f63631l1.setEnabled(false);
                this.f63635n1.setEnabled(false);
            }
        }
        this.f63584V0 = i11;
        FixedBannerView fixedBannerView = this.f63647t1;
        if (fixedBannerView != null) {
            if (i11 == 1) {
                z11 = true;
            }
            fixedBannerView.m68618EP(z11);
        }
        this.f63579T1.m68715i0(i11);
    }

    /* renamed from: XQ */
    boolean m68349XQ(final int i11, final C12191g0 c12191g0) {
        if (this.f88760a0 != null && this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
            this.f63621h2.postDelayed(new Runnable() { // from class: t70.i1
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.this.m68187aQ(i11, c12191g0);
                }
            }, 100L);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.ZinstantAdItemView.InterfaceC13555d
    /* renamed from: Xn */
    public int mo68350Xn() {
        return this.f63584V0;
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.a
    /* renamed from: YC */
    public void mo68351YC() {
        Bundle bundle;
        if (this.f63592X2 && (bundle = this.f63595Y2) != null) {
            this.f63592X2 = false;
            m68336OQ(bundle);
            this.f63595Y2 = null;
        }
        if (this.f63584V0 != 0) {
            m68324JQ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:            switch(r10) {            case 0: goto L93;            case 1: goto L65;            case 2: goto L65;            case 3: goto L62;            case 4: goto L93;            case 5: goto L59;            case 6: goto L93;            case 7: goto L93;            case 8: goto L93;            default: goto L108;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:            if ((r6 instanceof com.zing.zalo.zview.actionbar.ActionBarMenuItem) == false) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:            ((com.zing.zalo.zview.actionbar.ActionBarMenuItem) r6).setEnableNoti(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:            if ((r6 instanceof com.zing.zalo.uicomponents.reddot.RedDotImageButton) == false) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:            r6 = (com.zing.zalo.uicomponents.reddot.RedDotImageButton) r6;        vg.AbstractC28045d8.m141480a(r6, r3, r12.f63576S1, com.zing.zalo.AbstractC16803z.icon_header_search);        r6.setEnableNoti(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:            if (android.text.TextUtils.equals("tip.message.compose", r2) == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:            r7 = com.zing.zalo.AbstractC16803z.icn_header_plus;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d9, code lost:            if ((r6 instanceof com.zing.zalo.zview.actionbar.ActionBarMenuItem) == false) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:            r6 = (com.zing.zalo.zview.actionbar.ActionBarMenuItem) r6;        vg.AbstractC28045d8.m141481b(r6.getIconView(), r3, r12.f63576S1, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:            if (android.text.TextUtils.equals(r2, "tip.message.newchat") == false) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ec, code lost:            r6.setNotiRedotMarginTop(me0.AbstractC23136l9.m118742r(12.0f));        r6.setNotiRedotMarginRight(me0.AbstractC23136l9.m118742r(4.0f));     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:            if (android.text.TextUtils.equals("tip.message.compose", r2) == false) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010e, code lost:            if (r5 != false) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0110, code lost:            r2 = vg.AbstractC28025b8.f130850g;        r3 = r2.length;        r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:            if (r7 >= r3) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:            r8 = vg.AbstractC28025b8.m141453i(r2[r7]);     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011c, code lost:            if (r8 == null) goto L111;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:            if (r8.m142167f() == false) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0126, code lost:            if (r8.f131580f == false) goto L113;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012d, code lost:            r6.setEnableNoti(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0129, code lost:            r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012c, code lost:            r4 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ff, code lost:            r6.setNotiRedotMarginTop(me0.AbstractC23136l9.m118742r(16.0f));     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d1, code lost:            if (android.text.TextUtils.equals("tip.message.newchat", r2) == false) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d3, code lost:            r7 = com.zing.zalo.AbstractC16803z.ic_head_newchat;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d6, code lost:            r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0133, code lost:            if ((r6 instanceof rc0.InterfaceC25728a) == false) goto L106;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0135, code lost:            ((rc0.InterfaceC25728a) r6).setEnableNoti(r5);     */
    /* renamed from: YN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m68352YN(String str) {
        boolean z11;
        int i11 = 0;
        while (true) {
            String[] strArr = AbstractC28025b8.f130849f;
            if (i11 < strArr.length) {
                String str2 = strArr[i11];
                if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                    C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                    boolean z12 = true;
                    if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    KeyEvent.Callback m68311EO = m68311EO(str2);
                    str2.hashCode();
                    char c11 = 65535;
                    switch (str2.hashCode()) {
                        case -2092605591:
                            if (str2.equals("tip.message.compose.addfriend")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case -1300720808:
                            if (str2.equals("tip.message.compose")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case -405565762:
                            if (str2.equals("tip.message.newchat")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case 406516514:
                            if (str2.equals("tip.message.search")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case 1026464109:
                            if (str2.equals("tip.message.compose.creategroup")) {
                                c11 = 4;
                                break;
                            }
                            break;
                        case 1355137304:
                            if (str2.equals("tip.groupcall.maintab")) {
                                c11 = 5;
                                break;
                            }
                            break;
                        case 1399233812:
                            if (str2.equals("tip.message.compose.calendar")) {
                                c11 = 6;
                                break;
                            }
                            break;
                        case 1676691636:
                            if (str2.equals("tip.message.compose.scanqr")) {
                                c11 = 7;
                                break;
                            }
                            break;
                        case 1875577267:
                            if (str2.equals("tip.message.compose.zalopc")) {
                                c11 = '\b';
                                break;
                            }
                            break;
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67669FN(C24099q0.m125958k().m125971o());
            MainTabView.m67645lM().m67668CN(C24099q0.m125958k().m125971o());
        }
        m68250oQ();
        m68189bO();
    }

    /* renamed from: ZN */
    public void m68353ZN(String str) {
        C13306b m68316GO;
        char c11;
        try {
            if ((this.f72421L0.m92676n2() == null || this.f72421L0.m92676n2().mo35576n3() || (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125971o())) && (m68316GO = m68316GO()) != null && !m68316GO.m74707p()) {
                Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130849f).iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    final C28212v6 c28212v6 = (C28212v6) it.next();
                    if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c))) {
                        View m68320IO = m68320IO(c28212v6.f131577c);
                        if (m68320IO != null && !z11 && m68320IO.isShown()) {
                            this.f63546G2 = new ShowcaseView(m68320IO.getContext());
                            C26203c m134769a = C26203c.m134769a(m68320IO.getContext());
                            m134769a.m134770b(c28212v6, m68320IO.getContext());
                            m134769a.f124524o = m68320IO;
                            String str2 = c28212v6.f131577c;
                            char c12 = 65535;
                            switch (str2.hashCode()) {
                                case -2092605591:
                                    if (str2.equals("tip.message.compose.addfriend")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                                case -1300720808:
                                    if (str2.equals("tip.message.compose")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                                case -405565762:
                                    if (str2.equals("tip.message.newchat")) {
                                        c11 = 7;
                                        break;
                                    }
                                    break;
                                case 406516514:
                                    if (str2.equals("tip.message.search")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case 1026464109:
                                    if (str2.equals("tip.message.compose.creategroup")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 1355137304:
                                    if (str2.equals("tip.groupcall.maintab")) {
                                        c11 = '\b';
                                        break;
                                    }
                                    break;
                                case 1399233812:
                                    if (str2.equals("tip.message.compose.calendar")) {
                                        c11 = 6;
                                        break;
                                    }
                                    break;
                                case 1676691636:
                                    if (str2.equals("tip.message.compose.scanqr")) {
                                        c11 = 4;
                                        break;
                                    }
                                    break;
                                case 1875577267:
                                    if (str2.equals("tip.message.compose.zalopc")) {
                                        c11 = 5;
                                        break;
                                    }
                                    break;
                            }
                            c11 = 65535;
                            switch (c11) {
                                case 0:
                                    m134769a.f124513d = AbstractC23136l9.m118742r(4.0f);
                                    break;
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case '\b':
                                    m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                                    break;
                                default:
                                    if (!TextUtils.equals(c28212v6.f131577c, "tip.message.updateprofile")) {
                                        m134769a.f124513d = -AbstractC23136l9.m118742r(6.0f);
                                        break;
                                    }
                                    break;
                            }
                            this.f63546G2.setConfigs(m134769a);
                            this.f63546G2.setShowcaseId(c28212v6.f131577c);
                            this.f63546G2.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: t70.d
                                @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                                /* renamed from: a */
                                public final void mo39159a(ShowcaseView showcaseView, int i11, int i12, boolean z12) {
                                    MessagesView.this.m68175XO(c28212v6, showcaseView, i11, i12, z12);
                                }
                            });
                            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
                                if (this.f63550I2 == null) {
                                    this.f63550I2 = new FrameLayout(this.f72421L0.getContext());
                                }
                                View m92656bJ = this.f72421L0.m92656bJ();
                                if (m92656bJ instanceof FrameLayout) {
                                    ((FrameLayout) m92656bJ).addView(this.f63550I2, new FrameLayout.LayoutParams(-1, -1));
                                }
                                m68316GO.m74687C(this.f63550I2);
                            }
                            String str3 = c28212v6.f131577c;
                            switch (str3.hashCode()) {
                                case -1892203953:
                                    if (str3.equals("tip.intro.chatlabel.feature")) {
                                        c12 = 1;
                                        break;
                                    }
                                    break;
                                case -872249364:
                                    if (str3.equals("tip.open.readlater.tab")) {
                                        c12 = 0;
                                        break;
                                    }
                                    break;
                                case 361129209:
                                    if (str3.equals("tip.message.filter.v3")) {
                                        c12 = 2;
                                        break;
                                    }
                                    break;
                                case 1376008104:
                                    if (str3.equals("tip.message.filter.banner")) {
                                        c12 = 3;
                                        break;
                                    }
                                    break;
                            }
                            if (c12 != 0) {
                                if (c12 != 1) {
                                    if (c12 != 2) {
                                        if (c12 != 3) {
                                            this.f63546G2.setShowcaseManager(m68316GO);
                                            this.f63546G2.m74637r();
                                        } else {
                                            m68220hR(c28212v6, m68320IO, m68316GO);
                                        }
                                    } else {
                                        m68205eR(c28212v6, m68320IO, m68316GO);
                                    }
                                } else if (!AbstractC0924m0.m4198sc()) {
                                    AbstractC0924m0.m3970ko(true);
                                    m68225iR(c28212v6, m68320IO, m68316GO);
                                }
                            } else if (!AbstractC0924m0.m4228tc()) {
                                AbstractC0924m0.m4000lo(true);
                                m68225iR(c28212v6, m68320IO, m68316GO);
                            }
                            this.f63572R0.m68687h0(c28212v6);
                            z11 = true;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ZQ */
    public void m68354ZQ() {
        try {
            C17945a0 c17945a0 = FileDownloadBannerView.f69220v;
            if (c17945a0 != null && (c17945a0.m94929K2() instanceof C17990p0)) {
                ViewGroup viewGroup = (ViewGroup) this.f72421L0.m92656bJ();
                FileDownloadBannerView fileDownloadBannerView = (FileDownloadBannerView) viewGroup.findViewById(AbstractC6918a0.layout_banner_file_downloaded);
                this.f63607c3 = fileDownloadBannerView;
                if (fileDownloadBannerView == null) {
                    this.f63607c3 = FileDownloadBannerView.m75714u(m92689tK());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    this.f63607c3.setLayoutParams(layoutParams);
                    this.f63607c3.setId(AbstractC6918a0.layout_banner_file_downloaded);
                    viewGroup.addView(this.f63607c3);
                }
                this.f63607c3.setVisibility(0);
                this.f63607c3.setTag(FileDownloadBannerView.f69220v);
                this.f63607c3.setContent(FileDownloadBannerView.f69220v);
                this.f63607c3.m75715g();
                this.f63607c3.m75716h();
                this.f63607c3.m75719k(true, 10000L);
                return;
            }
            FileDownloadBannerView fileDownloadBannerView2 = this.f63607c3;
            if (fileDownloadBannerView2 != null) {
                fileDownloadBannerView2.m75717i(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: aR */
    void m68355aR(C31862c c31862c) {
        QuickActionViewLayout quickActionViewLayout;
        if (this.f63549I1 && (quickActionViewLayout = this.f63547H1) != null && c31862c == quickActionViewLayout.getActionItemInfo()) {
            this.f63547H1.m75818b(c31862c, this);
            return;
        }
        this.f63545G1.removeAllViews();
        this.f63545G1.setVisibility(0);
        QuickActionViewLayout quickActionViewLayout2 = new QuickActionViewLayout(m92689tK(), c31862c.f146309b);
        this.f63547H1 = quickActionViewLayout2;
        quickActionViewLayout2.m75818b(c31862c, this);
        this.f63549I1 = true;
        this.f63545G1.addView(this.f63547H1, -1, -2);
    }

    /* renamed from: bR */
    public void m68356bR() {
        AbstractC28207v1.m141994i3("action.open.e2ee.intro", 4, m92676n2(), this, null, null);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.NormalMsgModuleView.InterfaceC12426b
    /* renamed from: c2 */
    public void mo68357c2(String str, int i11) {
        try {
            if (TextUtils.isEmpty(str)) {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
                return;
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            this.f63634m2 = m141809c;
            if (m141809c == null) {
                this.f63634m2 = new ContactProfile(str);
            }
            if (i11 != 0) {
                if (i11 == 1) {
                    m68368lQ();
                    return;
                }
                return;
            }
            m68365kQ();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dR */
    public void m68358dR(boolean z11) {
        boolean z12;
        try {
            Snackbar snackbar = this.f63553K1;
            if (snackbar != null && snackbar.m90661t()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && !z12) {
                return;
            }
            if (z11) {
                long max = C32044o1.f147550j - Math.max(0L, C23793c.m124316k().mo124319c() - C32044o1.m154612r().m154630q());
                int m154634w = C32044o1.m154612r().m154634w();
                if (max >= 0 && m154634w > 0) {
                    m68147QO(m154634w);
                    this.f63553K1.m90648N();
                    C32044o1.m154612r().m154618M("chats_list", false);
                    return;
                }
                return;
            }
            Snackbar snackbar2 = this.f63553K1;
            if (snackbar2 != null) {
                snackbar2.m90655n();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eO */
    public void m68359eO() {
        FixedBannerView fixedBannerView = this.f63647t1;
        if (fixedBannerView != null) {
            fixedBannerView.m68619KN();
        }
    }

    @Override // ag0.C0856z.b
    /* renamed from: eg */
    public void mo2420eg(int i11, final C31931g8 c31931g8, final boolean z11) {
        if (i11 == -1) {
            m92692wK().runOnUiThread(new Runnable() { // from class: t70.e1
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.this.m68142OP();
                }
            });
            return;
        }
        if (i11 == 1) {
            m92692wK().runOnUiThread(new Runnable() { // from class: t70.f1
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.this.m68145PP();
                }
            });
        } else if (i11 == 3) {
            this.f72421L0.mo78960q3();
        } else if (i11 == 2) {
            m92692wK().runOnUiThread(new Runnable() { // from class: t70.h1
                @Override // java.lang.Runnable
                public final void run() {
                    MessagesView.this.m68148QP(z11, c31931g8);
                }
            });
        }
    }

    /* renamed from: fO */
    void m68360fO() {
        C31862c c31862c = AbstractC23304d.f113280G2;
        if (c31862c == null || c31862c.m153154f()) {
            m68308DO(1);
        }
        C31862c c31862c2 = AbstractC23304d.f113284H2;
        if (c31862c2 != null && !c31862c2.m153154f()) {
            m68389vQ();
        } else {
            m68308DO(6);
        }
        if (!this.f63601a3) {
            C31862c c31862c3 = this.f63598Z2;
            if (c31862c3 == null || c31862c3.m153154f()) {
                m68308DO(29);
                this.f63601a3 = true;
            }
        }
    }

    /* renamed from: fR */
    void m68361fR() {
        this.f72421L0.removeDialog(12);
        this.f72421L0.showDialog(12);
    }

    /* renamed from: gR */
    void m68362gR(C18451m c18451m) {
        try {
            final Conversation m97729o = ((C18443e) c18451m).m97729o();
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new C1483e(0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_conversation)));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((C1483e) it.next()).f6375b);
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(m97729o.m40999b(true, false));
            aVar.m43173v(100);
            aVar.m43155d(true);
            aVar.m43160i((CharSequence[]) arrayList2.toArray(new String[0]), new InterfaceC17463d.d() { // from class: t70.t1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    MessagesView.m68200dQ(arrayList, m97729o, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f63582U1 = m43152a;
            m43152a.mo13822K();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f63530k3;
    }

    /* renamed from: iO */
    void m68363iO(C31862c c31862c) {
        if (AbstractC23304d.f113280G2 == c31862c) {
            C18434b.m97679l().m97691w(c31862c);
            AbstractC23304d.f113280G2 = null;
            C19669z.m103146Y().m103198O0();
        } else if (AbstractC23304d.f113284H2 == c31862c) {
            C18434b.m97679l().m97691w(c31862c);
            AbstractC23304d.f113284H2 = null;
            m68389vQ();
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: ic */
    public void mo68364ic(Conversation conversation) {
        String str;
        if (conversation == null) {
            return;
        }
        C7860a.b bVar = C7860a.Companion;
        if (bVar.m40303b().m40271O(1) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(conversation);
            str = bVar.m40303b().m40261E(C23648e.Companion.m123930b(), "label_suggest", "chat_label", 0, arrayList);
        } else {
            str = "";
        }
        m68293xQ(conversation.f42893q, str);
    }

    /* renamed from: kQ */
    void m68365kQ() {
        try {
            if (!AbstractC23057e7.m118300g(this.f72421L0.m92648SI())) {
                if (C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f63634m2.f42434r)) {
                            C20024r.m103949w();
                        } else {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        }
                    } else if (AbstractC23034c6.m118167n(m92686rK(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                        AbstractC23034c6.m118184v0(this, new String[]{"android.permission.RECORD_AUDIO"}, 128);
                    } else {
                        C2279a m120722w0 = AbstractC23306f.m120722w0();
                        ContactProfile contactProfile = this.f63634m2;
                        m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f63634m2.f42446v, false, 49));
                        this.f63634m2 = null;
                    }
                }
            } else {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kR */
    void m68366kR(ContactProfile contactProfile) {
        if (this.f63574R2) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12198n(contactProfile));
        this.f63574R2 = true;
        c0766k.mo1448Ha(contactProfile.f42434r, 12);
    }

    /* renamed from: lO */
    public void m68367lO(HashMap hashMap, boolean z11) {
        MainTabView m67645lM;
        boolean z12;
        try {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            Object[] array = new HashMap(hashMap).keySet().toArray();
            int length = array.length;
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = array[i11];
                if (obj != null && (obj instanceof String)) {
                    String str = (String) obj;
                    if (!TextUtils.isEmpty(str)) {
                        if (i11 == length - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m68374nO(str, false, z12, z11);
                    }
                }
            }
        } catch (Exception e11) {
            this.f72421L0.mo78960q3();
            e11.printStackTrace();
        }
        if (!m68385uO() && (m67645lM = MainTabView.m67645lM()) != null) {
            m67645lM.m67693gM();
        }
    }

    /* renamed from: lQ */
    void m68368lQ() {
        try {
            if (AbstractC23057e7.m118300g(this.f72421L0.m92648SI())) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
                return;
            }
            if (C23055e5.m118272g(true)) {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f63634m2.f42434r)) {
                        C20024r.m103949w();
                        return;
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        return;
                    }
                }
                Context m92686rK = m92686rK();
                String[] strArr = AbstractC23034c6.f112033j;
                if (AbstractC23034c6.m118167n(m92686rK, strArr) != 0) {
                    AbstractC23034c6.m118184v0(this, strArr, 129);
                    return;
                }
                C2279a m120722w0 = AbstractC23306f.m120722w0();
                ContactProfile contactProfile = this.f63634m2;
                m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f63634m2.f42446v, true, 50));
                this.f63634m2 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lR */
    void m68369lR(String str) {
        try {
            if (this.f63565O2) {
                return;
            }
            int parseInt = Integer.parseInt(str);
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12194j(str));
            this.f63565O2 = true;
            c0766k.mo1766w6(parseInt, new TrackingSource(-1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mQ */
    public void m68370mQ(List list) {
        MainTabView m67645lM;
        try {
            try {
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                AbstractC23306f.m120728y0().m101508a(new C28928h.b(list));
                if (!m68385uO() && (m67645lM = MainTabView.m67645lM()) != null) {
                    m67645lM.m67693gM();
                }
                this.f63572R0.m68683c0(list);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f72421L0.mo78960q3();
        } catch (Throwable th2) {
            this.f72421L0.mo78960q3();
            throw th2;
        }
    }

    /* renamed from: mR */
    boolean m68371mR(C12191g0 c12191g0) {
        if (m68341SO()) {
            return m68349XQ(this.f63584V0, c12191g0);
        }
        return m68342SQ(c12191g0);
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: n0 */
    public void mo68372n0(int i11) {
        try {
            this.f63564O1 = this.f63579T1.m68698R(i11);
            m68321IQ(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: nG */
    public void mo68373nG(int i11) {
        String str;
        try {
            if (this.f63584V0 == 0 && i11 >= 0 && i11 < this.f63579T1.mo10003k()) {
                C18451m m68698R = this.f63579T1.m68698R(i11);
                if (m68698R.f92990a == 3) {
                    C18450l c18450l = (C18450l) m68698R;
                    m68376oO(c18450l.f92982e);
                    if (c18450l.f92982e != null) {
                        C28905e.m144373n().m144400v(c18450l.f92982e.f146385a, 22, 91, i11, "");
                        C0815e1 m2075D = C0815e1.m2075D();
                        String[] strArr = new String[5];
                        strArr[0] = String.valueOf(1);
                        strArr[1] = c18450l.f92982e.f146385a;
                        strArr[2] = String.valueOf(i11);
                        C31874cb c31874cb = c18450l.f92982e;
                        if (c31874cb.f146399o == 2) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        strArr[3] = str;
                        strArr[4] = String.valueOf(c31874cb.f146389e);
                        m2075D.m2099U(3, 4, 11, strArr);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nO */
    public void m68374nO(final String str, boolean z11, final boolean z12, final boolean z13) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z11) {
            try {
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            } catch (Exception e11) {
                e11.printStackTrace();
                if (z12) {
                    this.f72421L0.mo78960q3();
                    return;
                }
                return;
            }
        }
        C23288a.f113033a.mo13474a(new C18427b(str, new Runnable() { // from class: t70.l
            @Override // java.lang.Runnable
            public final void run() {
                MessagesView.this.m68203eP(str, z13, z12);
            }
        }));
        C19669z.m103146Y().m103198O0();
    }

    /* renamed from: nQ */
    public void m68375nQ(List list) {
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        AbstractC23306f.m120731z0().m101508a(new C28929i.c(list, new C12190g(list)));
    }

    /* renamed from: oO */
    void m68376oO(C31874cb c31874cb) {
        try {
            if (!this.f63583U2 && c31874cb != null) {
                this.f63583U2 = true;
                if (c31874cb.f146400p == 3) {
                    AbstractC23074g2.m118375a(1, c31874cb.f146385a, "", 1);
                    this.f63583U2 = false;
                    C21933s.m114404I().m114493u();
                } else {
                    this.f72421L0.mo46829Y();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C12207w(c31874cb));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c31874cb);
                    c0766k.mo1453I7(arrayList, TrackingSource.m40665d(1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        C20060c[] c20060cArr;
        String str;
        int i13 = -1;
        try {
            if (i12 == -1 && i11 == 8654) {
                if (intent != null) {
                    if (intent.hasExtra("uid_set_hidden_chat")) {
                        str = intent.getStringExtra("uid_set_hidden_chat");
                    } else {
                        str = "";
                    }
                    if (intent.hasExtra("case_passcode_process")) {
                        i13 = intent.getIntExtra("case_passcode_process", -1);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ContactProfile contactProfile = new ContactProfile(str);
                        C18922m.m99141t().m99145O(str);
                        C28023b6.m141250h0().m141310R(str, true, false, false);
                        C21927m.m114302u().m114331f(str, contactProfile, true);
                        C19669z.m103146Y().m103198O0();
                        if (i13 == 0) {
                            C18451m c18451m = this.f63564O1;
                            if (c18451m != null && !TextUtils.isEmpty(c18451m.mo97719a()) && str.equals(this.f63564O1.mo97719a())) {
                                this.f63588W1 = ((C18440b) this.f63564O1).m97729o().m40999b(true, false);
                            }
                            this.f72421L0.showDialog(21);
                            AbstractC23647d.m123906p("22001302");
                            AbstractC23647d.m123893c();
                        } else {
                            m68338PQ(true);
                            AbstractC23647d.m123906p("22001305");
                            AbstractC23647d.m123893c();
                            C18451m c18451m2 = this.f63564O1;
                            if (c18451m2 != null && c18451m2.m97765e() && str.equals(this.f63564O1.mo97719a())) {
                                ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_hidden_setup_with_friend_done), ((C18440b) this.f63564O1).m97729o().m40999b(true, false)));
                            }
                            if (this.f63564O1 != null && Build.VERSION.SDK_INT >= 25) {
                                C26939u.m138770q().m138779h(this.f63564O1.mo97719a());
                            }
                        }
                    }
                }
            } else if (i11 == 1011) {
                if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().mo35576n3()) {
                    this.f63621h2.postDelayed(new Runnable() { // from class: t70.d0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesView.this.m68113EP();
                        }
                    }, 200L);
                }
            } else if (i11 == 1015) {
                if (AbstractC26681b.f126356a) {
                    this.f63597Z1 = true;
                    if (this.f63573R1) {
                        m68231jR();
                    }
                }
            } else if (i11 == 1016) {
                AbstractC23192r.m119491b(((C18440b) this.f63564O1).m97729o().m40996I());
            } else if (i11 == 10099) {
                if (i12 == -1) {
                    m68326KQ();
                }
            } else if (i11 == 1085) {
                C19669z.m103146Y().m103198O0();
            }
            if (i11 == 1086) {
                if (intent != null && (c20060cArr = (C20060c[]) intent.getSerializableExtra("EXTRA_LIST_TAG_SELECTED")) != null) {
                    AbstractC20110a.m104535d("vvv list = %s", c20060cArr);
                    this.f63572R0.m68688i0(Arrays.asList(c20060cArr));
                }
            } else {
                super.onActivityResult(i11, i12, intent);
            }
            FixedBannerView fixedBannerView = this.f63647t1;
            if (fixedBannerView != null) {
                fixedBannerView.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        if (view == this.f63652v2 || view == this.f63544F2) {
            RedDotImageButton redDotImageButton = this.f63544F2;
            if (view == redDotImageButton && redDotImageButton != null) {
                redDotImageButton.clearColorFilter();
                AbstractC23195r2.f112444f = AbstractC23195r2.f112439a;
                AbstractC23309i.m121390Ro(false);
                str = "1";
            } else {
                str = "2";
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_OPEN_SOURCE_POSITION", "7");
            bundle.putString("EXTRA_OPEN_SOURCE_ACTION", str);
            SearchGlobalView.m73151oO(m92693xK(), bundle, 0, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m68385uO()) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 != 128) {
            if (i11 == 129) {
                if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(m92689tK(), AbstractC23034c6.f112033j) == 0) {
                    this.f63609d2 = true;
                } else {
                    AbstractC23034c6.m118166m0(this, 129);
                }
            }
        } else if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118165m(m92689tK(), "android.permission.RECORD_AUDIO") == 0) {
            this.f63612e2 = true;
        } else {
            AbstractC23034c6.m118162k0(this, 128);
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        final boolean z11;
        super.onResume();
        this.f63573R1 = true;
        if (AbstractC26681b.f126356a && this.f63597Z1) {
            m68231jR();
        }
        C23744a.m124114c().m124115b(this, 29);
        C23744a.m124114c().m124115b(this, 36);
        C23744a.m124114c().m124115b(this, 44);
        C23744a.m124114c().m124115b(this, 53);
        C23744a.m124114c().m124115b(this, 63);
        C23744a.m124114c().m124115b(this, 89);
        C23744a.m124114c().m124115b(this, 50);
        C23744a.m124114c().m124115b(this, 137);
        C23744a.m124114c().m124115b(this, 5200);
        C18932a c18932a = C18932a.f94442a;
        final boolean m99183g = c18932a.m99183g();
        if (m99183g && c18932a.m99179c().m104184d(this.f63645s1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        mo70710wy(new Runnable() { // from class: t70.k
            @Override // java.lang.Runnable
            public final void run() {
                MessagesView.this.m68156SP(m99183g, z11);
            }
        });
        if (C19669z.m103146Y().m103226p0()) {
            m68274tR();
        }
        m68162UN(3000, true);
        try {
            this.f63646s2.run();
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0()) && AbstractC23304d.f113258B0) {
                m68338PQ(true);
            }
            AbstractC23304d.f113258B0 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C28023b6.m141250h0().m141277D();
        if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125971o()) {
            m68198dO();
        }
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
            this.f63621h2.sendMessageDelayed(this.f63621h2.obtainMessage(0, "tip.any"), 200L);
            f63532m3 = true;
        }
        int i11 = this.f63584V0;
        if (i11 != 0 && this.f63593Y0) {
            if (i11 == 1) {
                this.f72421L0.showDialog(26);
            } else if (i11 == 2) {
                this.f72421L0.showDialog(27);
            } else if (i11 == 3) {
                this.f72421L0.showDialog(35);
            }
        }
        if (this.f63609d2 && AbstractC23309i.m120999H3() && AbstractC3102n.m15588g(this.f63634m2)) {
            m68368lQ();
            this.f63634m2 = null;
        }
        this.f63609d2 = false;
        if (this.f63612e2 && AbstractC3102n.m15588g(this.f63634m2)) {
            m68365kQ();
            this.f63634m2 = null;
        }
        m68166VN();
        this.f63612e2 = false;
        C32026md.f147453a.m154440j();
        m68151RN();
        m68174XN();
        m68193cO();
    }

    /* renamed from: qO */
    public void m68377qO(boolean z11) {
        if (this.f63580T2) {
            return;
        }
        C18451m c18451m = this.f63567P1;
        if (!(c18451m instanceof C18452n)) {
            return;
        }
        long m137372b = ((C18452n) c18451m).m97771q().m137372b();
        C0766k c0766k = new C0766k();
        C12205u c12205u = new C12205u(m137372b);
        this.f63580T2 = true;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        c0766k.mo1704o8(c12205u);
        c0766k.mo1415Da(1, m137372b, z11);
    }

    /* renamed from: qR */
    void m68378qR() {
        try {
            boolean z11 = false;
            for (int childCount = this.f63649u1.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f63649u1.getChildAt(childCount);
                if (childAt instanceof ScrollView) {
                    if (childAt.getId() == AbstractC6918a0.list_empty_withcontent_scrollview) {
                        z11 = true;
                    } else {
                        this.f63649u1.removeView(childAt);
                    }
                }
            }
            if (z11) {
                this.f63653w1 = (ScrollView) this.f63649u1.findViewById(AbstractC6918a0.list_empty_withcontent_scrollview);
            } else {
                this.f63653w1 = (ScrollView) LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.layout_empty_msg_with_content, this.f63649u1, false);
            }
            ScrollView scrollView = this.f63653w1;
            if (scrollView != null) {
                this.f63657y1 = (LinearLayout) scrollView.findViewById(AbstractC6918a0.list_empty_withcontent);
                this.f63537C1 = (TextView) this.f63653w1.findViewById(AbstractC6918a0.list_empty_text_withcontent_desc);
                this.f63659z1 = (TextView) this.f63653w1.findViewById(AbstractC6918a0.btn_chatandpickcontact);
                this.f63535B1 = (TextView) this.f63653w1.findViewById(AbstractC6918a0.btn_google_plus);
                this.f63533A1 = (TextView) this.f63653w1.findViewById(AbstractC6918a0.btn_phonebook);
                this.f63541E1[0] = (CircleImage) this.f63653w1.findViewById(AbstractC6918a0.item_func_first);
                this.f63541E1[1] = (CircleImage) this.f63653w1.findViewById(AbstractC6918a0.item_func_second);
                this.f63541E1[2] = (CircleImage) this.f63653w1.findViewById(AbstractC6918a0.item_func_third);
                for (CircleImage circleImage : this.f63541E1) {
                    circleImage.m87723j(this.f72421L0.m92651WI().getColor(AbstractC16801x.white), 255);
                }
                this.f63657y1.setVisibility(0);
                this.f63653w1.setVisibility(0);
                this.f63649u1.setVisibility(0);
                this.f63651v1.setVisibility(8);
                this.f63537C1.setVisibility(0);
                this.f63537C1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.msg_tab_empty_has_zalo_friend));
                if (C19669z.f97575W.size() < 3) {
                    for (int i11 = 0; i11 < 3; i11++) {
                        CircleImage[] circleImageArr = this.f63541E1;
                        if (i11 >= circleImageArr.length) {
                            break;
                        }
                        ((C23528a) this.f63576S1.m123612r(circleImageArr[i11])).m123613s(m68318HO(i11));
                        this.f63541E1[i11].setVisibility(0);
                        this.f63541E1[i11].setEnabled(true);
                        this.f63541E1[i11].setOnClickListener(new View.OnClickListener() { // from class: t70.m
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MessagesView.this.m68204eQ(view);
                            }
                        });
                    }
                } else {
                    int size = C19669z.f97575W.size();
                    for (final int i12 = 0; i12 < size && i12 < this.f63541E1.length; i12++) {
                        String str = (String) C19669z.f97575W.get(i12);
                        ContactProfile m98552o = C18644n.m98531l().m98552o(str);
                        if (m98552o == null && (m98552o = C21927m.m114302u().m114312J().m153138j(str)) == null) {
                            m98552o = C28203u6.f131407a.m141809c(str);
                        }
                        if (m98552o != null) {
                            if (!TextUtils.isEmpty(m98552o.f42446v)) {
                                if (C23302b.f113247a.m120523d(m98552o.f42446v) && !CoreUtility.f89233i.equals(m98552o.f42434r)) {
                                    this.f63541E1[i12].setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m98552o.m40383Q(true, false)), C2343e.m12307a(m98552o.f42434r, false)));
                                } else {
                                    ((C23528a) this.f63576S1.m123612r(this.f63541E1[i12])).m123618x(m98552o.f42446v, C23278z2.m120143n());
                                }
                            }
                            this.f63541E1[i12].setOnClickListener(new View.OnClickListener() { // from class: t70.n
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    MessagesView.this.m68209fQ(i12, view);
                                }
                            });
                            this.f63541E1[i12].setVisibility(0);
                            this.f63541E1[i12].setEnabled(true);
                        } else {
                            ((C23528a) this.f63576S1.m123612r(this.f63541E1[i12])).m123613s(m68318HO(i12));
                            this.f63541E1[i12].setVisibility(0);
                            this.f63541E1[i12].setEnabled(false);
                        }
                    }
                }
                if (C18644n.m98531l().m98555r() > 3) {
                    TextView textView = this.f63659z1;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.f63659z1.setOnClickListener(new View.OnClickListener() { // from class: t70.p
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MessagesView.this.m68214gQ(view);
                            }
                        });
                    }
                    TextView textView2 = this.f63535B1;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    TextView textView3 = this.f63533A1;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                } else {
                    TextView textView4 = this.f63659z1;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    this.f63533A1.setVisibility(0);
                    this.f63533A1.setOnClickListener(new View.OnClickListener() { // from class: t70.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MessagesView.this.m68219hQ(view);
                        }
                    });
                }
                if (!z11) {
                    this.f63649u1.addView(this.f63653w1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rO */
    public C12191g0 m68379rO(boolean z11, boolean z12) {
        String str;
        String str2;
        int i11;
        boolean z13;
        int i12 = this.f63584V0;
        if (i12 == 2) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_mark_as_read);
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_multi_mark_as_read_disable);
        } else if (i12 == 3) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_unread_d);
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_unread);
        } else {
            str = null;
            str2 = null;
        }
        C12260j c12260j = this.f63579T1;
        boolean z14 = false;
        if (c12260j != null) {
            if (z11 && this.f63587W0 == 1) {
                i11 = c12260j.m68723r0(true);
            } else if (this.f63587W0 == 1) {
                i11 = c12260j.m68723r0(false);
                this.f63587W0 = 0;
            } else {
                i11 = c12260j.m68723r0(true);
                this.f63587W0 = 1;
            }
        } else {
            i11 = -1;
        }
        if (this.f63587W0 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12) {
            m68386uR(z13);
        }
        if (str != null) {
            if (i11 > 0) {
                str2 = String.format(str, Integer.valueOf(i11));
            }
        } else {
            str2 = "";
        }
        if (i11 > 0) {
            z14 = true;
        }
        return new C12191g0(str2, z13, z14);
    }

    /* renamed from: rR */
    void m68380rR() {
        try {
            boolean z11 = false;
            for (int childCount = this.f63649u1.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f63649u1.getChildAt(childCount);
                if (childAt instanceof ScrollView) {
                    if (childAt.getId() == AbstractC6918a0.list_empty_tab_read_later) {
                        z11 = true;
                    } else {
                        this.f63649u1.removeView(childAt);
                    }
                }
            }
            if (z11) {
                this.f63655x1 = (ScrollView) this.f63649u1.findViewById(AbstractC6918a0.list_empty_tab_read_later);
            } else {
                this.f63655x1 = (ScrollView) LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.layout_empty_msg_tab_read_later, this.f63649u1, false);
            }
            ScrollView scrollView = this.f63655x1;
            if (scrollView != null) {
                Button button = (Button) scrollView.findViewById(AbstractC6918a0.btn_start_add_multi_label);
                this.f63539D1 = button;
                if (button != null) {
                    button.setIdTracking("btn_footer_add_multi_conversation_label");
                    this.f63539D1.setOnClickListener(new View.OnClickListener() { // from class: t70.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MessagesView.this.m68224iQ(view);
                        }
                    });
                }
            }
            this.f63649u1.setVisibility(0);
            this.f63651v1.setVisibility(8);
            if (!z11) {
                this.f63649u1.addView(this.f63655x1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sO */
    public void m68381sO() {
        try {
            int i11 = this.f63584V0;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        this.f72421L0.showDialog(35);
                    }
                } else {
                    this.f72421L0.showDialog(27);
                }
            } else if (this.f63579T1.m68700T() > 1) {
                showDialog(34);
            } else if (m68159TO()) {
                showDialog(33);
            } else {
                showDialog(32);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.ZinstantAdItemView.InterfaceC13555d
    /* renamed from: sb */
    public void mo68382sb(final C32041nd c32041nd) {
        if (c32041nd != null) {
            C8009j c8009j = this.f63582U1;
            if (c8009j != null && c8009j.m92868m()) {
                this.f63582U1.dismiss();
            }
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new C1483e(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_this_ad)));
            arrayList.add(new C1483e(2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_this_ad)));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((C1483e) it.next()).f6375b);
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(c32041nd.m154581j());
            aVar.m43173v(100);
            aVar.m43155d(true);
            aVar.m43160i((CharSequence[]) arrayList2.toArray(new String[0]), new InterfaceC17463d.d() { // from class: t70.q1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    MessagesView.this.m68160TP(arrayList, c32041nd, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f63582U1 = m43152a;
            m43152a.mo13822K();
        }
    }

    @Override // bn.C2852a1.d
    /* renamed from: tA */
    public void mo13059tA(int i11, C31931g8 c31931g8) {
        try {
            if (i11 == 2) {
                C0856z.m2393m().m2397g(true, c31931g8, this, true, 4);
            } else if (i11 == 1) {
                C0856z.m2393m().m2397g(false, c31931g8, this, true, 1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tO */
    void m68383tO(boolean z11) {
        try {
            if (z11) {
                if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
                    RedDotImageButton redDotImageButton = this.f63544F2;
                    if (redDotImageButton != null) {
                        redDotImageButton.clearColorFilter();
                    }
                } else if (m68307CO() != null) {
                    m68307CO().m67691eM(true);
                }
            } else if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
                RedDotImageButton redDotImageButton2 = this.f63544F2;
                if (redDotImageButton2 != null) {
                    redDotImageButton2.setColorFilter(C23212s8.m119607o(redDotImageButton2.getContext(), AbstractC16781w.NotificationReddot));
                }
            } else if (m68307CO() != null) {
                m68307CO().m67691eM(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:9:0x0013, B:14:0x002e, B:17:0x0038, B:20:0x0041, B:23:0x0047, B:25:0x009f, B:27:0x00aa, B:29:0x00b0, B:31:0x00b6, B:34:0x00cc, B:38:0x00d2, B:41:0x00d6, B:43:0x00dc, B:44:0x005b, B:47:0x0066, B:48:0x0079, B:52:0x0085, B:53:0x0098), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:9:0x0013, B:14:0x002e, B:17:0x0038, B:20:0x0041, B:23:0x0047, B:25:0x009f, B:27:0x00aa, B:29:0x00b0, B:31:0x00b6, B:34:0x00cc, B:38:0x00d2, B:41:0x00d6, B:43:0x00dc, B:44:0x005b, B:47:0x0066, B:48:0x0079, B:52:0x0085, B:53:0x0098), top: B:2:0x0001 }] */
    /* renamed from: tQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m68384tQ(String str) {
        int m68695O;
        boolean z11;
        int i11;
        boolean z12;
        String m118743r0;
        C12191g0 c12191g0;
        String str2;
        try {
            if (this.f63579T1 == null || !m68334ON(str) || (m68695O = this.f63579T1.m68695O(str)) < 0) {
                return false;
            }
            this.f63579T1.m68722q0(m68695O);
            int m68700T = this.f63579T1.m68700T();
            if (m68700T == this.f63579T1.m68699S(null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f63584V0 == 2) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f63587W0 = i11;
            String str3 = "";
            if (m68700T > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i12 = this.f63584V0;
            if (i12 == 1) {
                if (z12) {
                    m118743r0 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_delete_multi_msg), Integer.valueOf(m68700T));
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_multi_delete_msg_disable);
                }
            } else if (i12 == 2) {
                if (z12) {
                    m118743r0 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_mark_as_read), Integer.valueOf(m68700T));
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_multi_mark_as_read_disable);
                }
            } else {
                if (i12 == 3) {
                    if (z12) {
                        m118743r0 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_unread_d), Integer.valueOf(m68700T));
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_unread);
                    }
                }
                c12191g0 = new C12191g0(str3, z11, z12);
                if (m68371mR(c12191g0)) {
                    MainTabView m67645lM = MainTabView.m67645lM();
                    if (m67645lM != null) {
                        if (m67645lM.m67704qM()) {
                            m67645lM.m67690dM(false);
                            m67645lM.m67718yN(this.f63584V0, c12191g0);
                            int i13 = this.f63584V0;
                            if (i13 == 1) {
                                str2 = "1";
                            } else if (i13 == 2) {
                                str2 = "2";
                            } else {
                                str2 = "0";
                            }
                            C2526d.f10270a.m12727u(str2);
                        } else {
                            m67645lM.m67713uN(c12191g0);
                        }
                    }
                } else {
                    MainTabView m67645lM2 = MainTabView.m67645lM();
                    if (m67645lM2 != null) {
                        m67645lM2.m67693gM();
                    }
                }
                return true;
            }
            str3 = m118743r0;
            c12191g0 = new C12191g0(str3, z11, z12);
            if (m68371mR(c12191g0)) {
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: uO */
    public boolean m68385uO() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && actionBar.getActionMode() != null && this.f88760a0.m92718m()) {
            this.f88760a0.m92716k();
            m68330MQ();
            return true;
        }
        return false;
    }

    /* renamed from: uR */
    void m68386uR(boolean z11) {
        int m68700T;
        boolean z12;
        String str;
        C12260j c12260j = this.f63579T1;
        if (c12260j == null) {
            m68700T = 0;
        } else {
            m68700T = c12260j.m68700T();
        }
        if (m68700T > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i11 = this.f63584V0;
        if (i11 == 1) {
            if (z12) {
                str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_delete_multi_msg), Integer.valueOf(m68700T));
            } else {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_multi_delete_msg_disable);
            }
        } else if (i11 == 2) {
            if (z12) {
                str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_mark_as_read), Integer.valueOf(m68700T));
            } else {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_multi_mark_as_read_disable);
            }
        } else if (i11 == 3) {
            if (z12) {
                str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_unread_d), Integer.valueOf(m68700T));
            } else {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_unread);
            }
        } else {
            str = "";
        }
        C12191g0 c12191g0 = new C12191g0(str, z11, z12);
        if (!m68371mR(c12191g0)) {
            MainTabView m67645lM = MainTabView.m67645lM();
            if (m67645lM != null) {
                if (m67645lM.m67704qM()) {
                    m67645lM.m67690dM(false);
                    m67645lM.m67718yN(this.f63584V0, c12191g0);
                    return;
                } else {
                    m67645lM.m67713uN(c12191g0);
                    return;
                }
            }
            return;
        }
        MainTabView m67645lM2 = MainTabView.m67645lM();
        if (m67645lM2 != null) {
            m67645lM2.m67693gM();
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: uw */
    public void mo68387uw(ContactProfile contactProfile) {
        C7860a.Companion.m40303b().m40279W(contactProfile.mo2478b());
    }

    /* renamed from: vO */
    void m68388vO(String str, TrackingSource trackingSource) {
        try {
            if (this.f63568P2) {
                return;
            }
            int parseInt = Integer.parseInt(str);
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12196l(str));
            this.f63568P2 = true;
            if (trackingSource == null) {
                trackingSource = C21927m.m114302u().m114310H(String.valueOf(parseInt));
            }
            if (trackingSource == null) {
                trackingSource = new TrackingSource(-1);
            }
            c0766k.mo1578Y4(parseInt, trackingSource);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vQ */
    public void m68389vQ() {
        m92692wK().runOnUiThread(new Runnable() { // from class: t70.v1
            @Override // java.lang.Runnable
            public final void run() {
                MessagesView.this.m68153RP();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C18451m c18451m;
        try {
            switch (i11) {
                case 29:
                    this.f72421L0.mo70710wy(this.f63586V2);
                    return;
                case 36:
                    mo70710wy(new Runnable() { // from class: t70.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesView.this.m68213gP();
                        }
                    });
                    m68278uQ();
                    return;
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    String str = (String) objArr[0];
                    if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125971o() && Arrays.asList(AbstractC28025b8.f130849f).contains(str)) {
                        this.f63621h2.sendMessage(this.f63621h2.obtainMessage(0, str));
                        if (Arrays.asList(AbstractC28025b8.f130850g).contains(str)) {
                            this.f63621h2.sendMessage(this.f63621h2.obtainMessage(0, "tip.message.compose"));
                            return;
                        }
                        return;
                    }
                    return;
                case 53:
                    m68162UN(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, false);
                    return;
                case 63:
                    if (AbstractC19646n0.m103025s(this) && objArr.length == 3) {
                        final String str2 = (String) objArr[0];
                        if (AbstractC23309i.m121220N2()) {
                            final C24277c c24277c = (C24277c) objArr[1];
                            final ContactProfile contactProfile = (ContactProfile) objArr[2];
                            int i12 = c24277c.f117240a;
                            if (i12 != 3 && i12 != 4) {
                                AnimChat animChat = this.f63650u2;
                                if (animChat != null && animChat.getParent() != null) {
                                    m68317GQ(str2, c24277c, contactProfile);
                                    return;
                                }
                                mo70710wy(new Runnable() { // from class: t70.q0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MessagesView.this.m68208fP(str2, c24277c, contactProfile);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 89:
                    if (!this.f72421L0.mo60294yp()) {
                        if (this.f72421L0.m92676n2().mo35576n3() || MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125971o()) {
                            this.f63621h2.post(new Runnable() { // from class: t70.s0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MessagesView.this.m68354ZQ();
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                case 91:
                    if (objArr.length == 3) {
                        onRequestPermissionsResult(((Integer) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                        return;
                    }
                    return;
                case 92:
                    String str3 = (String) objArr[0];
                    if (!TextUtils.isEmpty(str3)) {
                        C7860a.b bVar = C7860a.Companion;
                        bVar.m40303b().m40289k0(str3);
                        bVar.m40303b().m40259B0(str3);
                        return;
                    }
                    return;
                case 106:
                    m68389vQ();
                    return;
                case 108:
                    if (objArr.length < 1) {
                        return;
                    }
                    String str4 = (String) objArr[0];
                    int m9745c2 = this.f63591X1.m9745c2();
                    for (int m9740Y1 = this.f63591X1.m9740Y1(); m9740Y1 <= m9745c2 && m9740Y1 != -1; m9740Y1++) {
                        C18451m m68698R = this.f63579T1.m68698R(m9740Y1);
                        if ((m68698R instanceof C18440b) && ((C18440b) m68698R).m97729o().f42893q.equals(str4)) {
                            this.f63621h2.post(new Runnable() { // from class: t70.p0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MessagesView.this.m68326KQ();
                                }
                            });
                            return;
                        }
                    }
                    return;
                case 121:
                case 3002:
                    this.f63621h2.post(new Runnable() { // from class: t70.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesView.this.m68326KQ();
                        }
                    });
                    return;
                case 135:
                case 136:
                    if (!this.f72421L0.mo60294yp()) {
                        mo70710wy(new Runnable() { // from class: t70.t0
                            @Override // java.lang.Runnable
                            public final void run() {
                                MessagesView.this.m68218hP();
                            }
                        });
                        return;
                    }
                    return;
                case 137:
                    if (objArr.length > 0) {
                        String str5 = (String) objArr[0];
                        C8009j c8009j = this.f63582U1;
                        if (c8009j != null && c8009j.m92868m() && (c18451m = this.f63564O1) != null && c18451m.mo97719a().equals(str5)) {
                            this.f63564O1 = null;
                            this.f63582U1.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                case 5200:
                    m68282vR();
                    return;
                case 6072:
                    C19669z.f97569Q.set(false);
                    C19669z.m103146Y().m103198O0();
                    return;
                case 6075:
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: t70.x0
                            @Override // java.lang.Runnable
                            public final void run() {
                                MessagesView.this.m68235kP();
                            }
                        });
                        return;
                    }
                    return;
                case 6076:
                    mo70710wy(new Runnable() { // from class: t70.w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesView.this.m68229jP();
                        }
                    });
                    return;
                case 6077:
                    if (m68307CO() != null && MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125971o() && this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().runOnUiThread(this.f63646s2);
                        return;
                    }
                    return;
                case 8101:
                    this.f63572R0.m68680X();
                    mo70710wy(new Runnable() { // from class: t70.u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesView.this.m68223iP();
                        }
                    });
                    C24559a.m127933c("[ConversationLabel]", "MessagesView->didReceivedEvent NOTIFY_SETTING_CHAT_LABEL_CHANGED -> refreshData()");
                    return;
                case 8150:
                    C24773h c24773h = this.f63602b1[((Integer) objArr[0]).intValue()];
                    if (c24773h != null) {
                        c24773h.m128757u(false);
                        mo70710wy(new Runnable() { // from class: t70.y0
                            @Override // java.lang.Runnable
                            public final void run() {
                                MessagesView.this.m68238lP();
                            }
                        });
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.msg.AbstractC12211a.b
    /* renamed from: xA */
    public void mo68390xA(int i11) {
        C17487o0 mo35579p;
        C17487o0 c17487o0;
        C17487o0 c17487o02 = null;
        try {
            if (i11 == 0) {
                if (this.f72421L0.m92676n2() != null) {
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o0 = this.f72421L0.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    if (c17487o0 != null) {
                        c17487o0.m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (this.f72421L0.m92676n2() != null) {
                    Bundle bundle = new Bundle();
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o02 = this.f72421L0.m92676n2().mo35579p();
                    }
                    if (c17487o02 != null) {
                        c17487o02.m93069k2(QuickCreateGroupView.class, bundle, 1, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 2) {
                AbstractC23309i.m121874en(1);
            } else if (i11 == 3 && this.f72421L0.m92676n2() != null && (mo35579p = this.f72421L0.m92676n2().mo35579p()) != null) {
                mo35579p.m93069k2(ListContactNativeView.class, null, 1, true);
                AbstractC23647d.m123897g("1591200");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        C23475l.m123241e((byte) 2, "onActivityCreated");
        super.mo37135xJ(bundle);
        this.f63585V1 = new C12180b();
        C12260j c12260j = new C12260j(this.f63585V1);
        this.f63579T1 = c12260j;
        c12260j.m68717k0(this);
        this.f63579T1.m68716j0(this);
        this.f63579T1.m68719m0(this);
        this.f63579T1.m68720o0(this);
        this.f63579T1.m68721p0(this);
        this.f63579T1.m68710d0(this.f63576S1);
        this.f63543F1.setAdapter(this.f63579T1);
        this.f63543F1.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
        this.f63591X1 = linearLayoutManager;
        this.f63543F1.setLayoutManager(linearLayoutManager);
        this.f63543F1.getViewTreeObserver().addOnGlobalLayoutListener(this.f63624i2);
        C31784b.m152808a(this.f63543F1).m152809b(new C31784b.d() { // from class: t70.f0
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                MessagesView.this.m68106CP(recyclerView, i11, view);
            }
        });
        C31784b.m152808a(this.f63543F1).m152810c(new C31784b.e() { // from class: t70.g0
            @Override // zc0.C31784b.e
            /* renamed from: T3 */
            public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
                boolean m68110DP;
                m68110DP = MessagesView.this.m68110DP(recyclerView, i11, view);
                return m68110DP;
            }
        });
        this.f63543F1.m9826E(new C12182c());
        this.f63543F1.setOnFlingListener(new C12184d());
        C19669z.m103146Y().m103198O0();
        C23475l.m123240d().m123242a("onActivityCreated");
        C23475l.m123240d().m123243b();
    }

    /* renamed from: yO */
    List m68391yO(C18451m c18451m) {
        boolean z11;
        int i11;
        ArrayList arrayList = new ArrayList();
        C18932a c18932a = C18932a.f94442a;
        if (c18932a.m99182f() && this.f63561N1 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!c18451m.m97766i() && !c18451m.m97768l() && !c18451m.mo97727m() && !AbstractC21935u.m114515E(c18451m.mo97719a()) && !z11) {
            boolean m118442j = AbstractC23089h6.m118442j(AbstractC23089h6.m118443k(c18451m.mo97719a()));
            if (m118442j) {
                i11 = AbstractC8020f0.str_option_unpin_conversation_tab_msg;
            } else {
                i11 = AbstractC8020f0.str_option_pin_conversation_tab_msg;
            }
            arrayList.add(new C1483e(Integer.valueOf(m118442j ? 1 : 0), AbstractC23136l9.m118743r0(i11)));
        }
        if ((this.f63567P1 instanceof C18440b) && c18932a.m99182f()) {
            int i12 = this.f63561N1;
            if (i12 == 0) {
                arrayList.add(new C1483e(3, AbstractC23136l9.m118746s0(AbstractC8020f0.str_option_label_as_read_later, C7860a.Companion.m40303b().m40273Q(1))));
            } else if (i12 == 1) {
                arrayList.add(new C1483e(2, AbstractC23136l9.m118746s0(AbstractC8020f0.str_option_label_as_focused, C7860a.Companion.m40303b().m40273Q(0))));
            }
        }
        if (!c18451m.mo97726j() && !c18451m.mo97728n() && !c18451m.m97766i() && !c18451m.m97768l() && !c18451m.mo97727m()) {
            if (!m92692wK().mo35576n3()) {
                arrayList.add(new C1483e(4, AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_message)));
            }
            if (!c18451m.mo97724g() && !AbstractC21935u.m114558y(c18451m.mo97719a())) {
                arrayList.add(new C1483e(5, AbstractC23136l9.m118743r0(AbstractC8020f0.str_block_manager)));
            }
        }
        if (!c18451m.m97766i() && !c18451m.m97768l()) {
            if (!c18451m.mo97726j()) {
                arrayList.add(new C1483e(7, AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_conversation)));
            }
        } else {
            arrayList.add(new C1483e(6, AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_conversation)));
        }
        if (c18451m.mo97721c()) {
            arrayList.add(new C1483e(8, AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_read_title)));
        } else if (!c18451m.m97766i() && !c18451m.m97768l() && !c18451m.mo97726j() && !c18451m.mo97727m()) {
            arrayList.add(new C1483e(14, AbstractC23136l9.m118743r0(AbstractC8020f0.str_mark_as_unread)));
        }
        if (AbstractC21935u.m114518H(c18451m.mo97719a()) && !c18451m.mo97728n()) {
            if (C21927m.m114302u().m114318P(c18451m.mo97719a())) {
                arrayList.add(new C1483e(10, AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_unfollow)));
            } else {
                arrayList.add(new C1483e(9, AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_follow)));
            }
        }
        if (!c18451m.m97766i() && !c18451m.m97768l() && !c18451m.mo97728n()) {
            if (AbstractC26683d.f126391B) {
                arrayList.add(new C1483e(11, AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_bubble_chat)));
            } else if (!m92692wK().mo35576n3() && AbstractC23309i.m122004i2() && AbstractC26681b.f126356a) {
                arrayList.add(new C1483e(11, AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_chat_head)));
            }
        }
        if (c18451m.m97765e() && !c18451m.mo97728n() && !c18451m.mo97726j()) {
            if (C0804b.m2025g().m2033i(c18451m.mo97719a())) {
                arrayList.add(new C1483e(12, AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_on_notif_newmsg)));
            } else {
                arrayList.add(new C1483e(13, AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_off_notif_newmsg)));
            }
        }
        return arrayList;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 108);
        C23744a.m124114c().m124115b(this, 121);
        C23744a.m124114c().m124115b(this, 91);
        C23744a.m124114c().m124115b(this, 135);
        C23744a.m124114c().m124115b(this, 136);
        C23744a.m124114c().m124115b(this, 92);
        C23744a.m124114c().m124115b(this, 8101);
        C23744a.m124114c().m124115b(this, 8150);
    }

    /* renamed from: zR */
    public void m68392zR(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12179a0());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1033));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
