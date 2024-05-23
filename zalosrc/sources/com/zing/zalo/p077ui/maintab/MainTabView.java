package com.zing.zalo.p077ui.maintab;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0832n;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import androidx.window.layout.AbstractC2128z;
import androidx.window.layout.ExecutorC2100e0;
import androidx.window.layout.InterfaceC2113l;
import au.AbstractC2379w;
import b50.AbstractC2557e;
import b50.C2556d;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import ck0.C3568b;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.mvp.notificationview.NotificationView;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p062db.PreferencesProvider;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.p077ui.RetryMsgPopupActivity;
import com.zing.zalo.p077ui.backuprestore.remind.RemindBackupView;
import com.zing.zalo.p077ui.backuprestore.restore.RestoreMessageStartupView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.contact.ContactGroupMyPagesView;
import com.zing.zalo.p077ui.maintab.group.GroupTabParentView;
import com.zing.zalo.p077ui.maintab.me.TabMeView;
import com.zing.zalo.p077ui.maintab.more.MoreTabView;
import com.zing.zalo.p077ui.maintab.msg.MessagesView;
import com.zing.zalo.p077ui.maintab.widget.CustomMainTab;
import com.zing.zalo.p077ui.searchglobal.C13027c;
import com.zing.zalo.p077ui.settings.SettingV2View;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.p077ui.zviews.AddFriendView;
import com.zing.zalo.p077ui.zviews.AuthorizationAppView;
import com.zing.zalo.p077ui.zviews.ComposeNewChatView;
import com.zing.zalo.p077ui.zviews.FindFriendByPhoneNumberView;
import com.zing.zalo.p077ui.zviews.HistoryLoginView;
import com.zing.zalo.p077ui.zviews.IOErrorInfoView;
import com.zing.zalo.p077ui.zviews.ListContactNativeView;
import com.zing.zalo.p077ui.zviews.MyCalendarView;
import com.zing.zalo.p077ui.zviews.PopupZView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.TimelineView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.WebAuthorizationView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.C16648s;
import com.zing.zalo.uicontrol.MainTabFrameLayout;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.utils.systemui.SystemUIUtils;
import com.zing.zalo.zalocloud.recover.C16888a;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17927b;
import dk0.C18020c;
import en0.InterfaceC18509p;
import gg0.AbstractC19444a;
import gw.C19636i1;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20833z;
import is.C20793f;
import is.C20795g;
import is.C20830x0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jm.AbstractC21289a;
import km.C21765a;
import kz.AbstractC21970a;
import l30.C22013a0;
import l30.C22021e0;
import li.AbstractC22490a;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23165o5;
import me0.AbstractC23181q;
import me0.AbstractC23195r2;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23177p6;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mx.C23475l;
import nh0.C23793c;
import o70.C24070c;
import o70.C24099q0;
import o70.C24101r0;
import o70.C24105t0;
import o70.InterfaceC24103s0;
import org.json.JSONException;
import org.json.JSONObject;
import p055ce.AbstractC3439h;
import p055ce.C3432a;
import p055ce.C3433b;
import p128ed.C18389d;
import p142ey.C18644n;
import p173fz.C19172a;
import p175g0.AbstractC19178a;
import p193h0.AbstractC19694b;
import p248iy.AbstractC20887g;
import p248iy.C20882b;
import p267jh.C21253b;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p320ld.C22432d;
import p320ld.C22436h;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p398oo.C24355e0;
import p413p2.C24609a;
import p422pd.C24726a;
import p479rc.C25727d;
import p494rv.C25979a;
import p558uu.InterfaceC27367c;
import p594w1.C28685a;
import p645xh.C29628e;
import p645xh.C29630g;
import p716zh.C31849b1;
import p716zh.C31877d;
import p716zh.C31994kb;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32035n7;
import p716zh.C32044o1;
import p716zh.C32132u5;
import p716zh.C32206z9;
import pd0.C24730d;
import pm0.C24848g0;
import qi0.C25297f;
import r00.AbstractC25598c;
import r30.AbstractC25636f;
import r30.C25637g;
import r30.C25641k;
import s00.AbstractC26080o;
import s00.AbstractC26084s;
import sa0.C26203c;
import sc.C26219a;
import sd.C26231b;
import si.C26263i;
import sy.AbstractC26412d;
import tb0.C26626l;
import th.AbstractC26681b;
import th.AbstractC26683d;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.AbstractC28105j8;
import vg.AbstractC28207v1;
import vg.C28020b3;
import vg.C28023b6;
import vg.C28035c8;
import vg.C28203u6;
import vg.C28212v6;
import wg0.C28989l;
import xl0.AbstractC30163d;
import zl0.AbstractC32228e;
import zm.voip.p721ui.views.CreateGroupCallZView;

/* loaded from: classes5.dex */
public class MainTabView extends ZaloViewNewActionBar implements ZaloView.InterfaceC17424i, ViewPager.InterfaceC6875j, C23744a.c, View.OnClickListener {

    /* renamed from: L1 */
    public static final String f63200L1 = "MainTabView";

    /* renamed from: M1 */
    private static WeakReference f63201M1;

    /* renamed from: A0 */
    View f63202A0;

    /* renamed from: A1 */
    public TextView f63203A1;

    /* renamed from: B0 */
    ViewPagerCustomSwipeable f63204B0;

    /* renamed from: B1 */
    public TextView f63205B1;

    /* renamed from: C0 */
    C24105t0 f63206C0;

    /* renamed from: C1 */
    public TextView f63207C1;

    /* renamed from: D0 */
    CustomMainTab f63208D0;

    /* renamed from: D1 */
    public TextView f63209D1;

    /* renamed from: E0 */
    C24101r0 f63210E0;

    /* renamed from: E1 */
    public TextView f63211E1;

    /* renamed from: F0 */
    C16648s f63212F0;

    /* renamed from: F1 */
    public TextView f63213F1;

    /* renamed from: G1 */
    private int f63215G1;

    /* renamed from: H0 */
    Button f63216H0;

    /* renamed from: H1 */
    public RedDotImageButton f63217H1;

    /* renamed from: I0 */
    ActionBarMenuItem f63218I0;

    /* renamed from: I1 */
    public C13306b f63219I1;

    /* renamed from: J0 */
    public TextView f63220J0;

    /* renamed from: M0 */
    C23528a f63225M0;

    /* renamed from: N0 */
    C8009j f63226N0;

    /* renamed from: O0 */
    Snackbar f63227O0;

    /* renamed from: f1 */
    C28685a f63244f1;

    /* renamed from: h1 */
    private C24609a f63246h1;

    /* renamed from: k1 */
    Button f63249k1;

    /* renamed from: m1 */
    public int f63251m1;

    /* renamed from: n1 */
    public int f63252n1;

    /* renamed from: p1 */
    C32132u5 f63254p1;

    /* renamed from: q1 */
    public View f63255q1;

    /* renamed from: r1 */
    public View f63256r1;

    /* renamed from: s1 */
    public View f63257s1;

    /* renamed from: t1 */
    public View f63258t1;

    /* renamed from: u1 */
    public View f63259u1;

    /* renamed from: v1 */
    public ActionBarMenuItem f63260v1;

    /* renamed from: w1 */
    public ActionBarMenuItem f63261w1;

    /* renamed from: x1 */
    public TextView f63262x1;

    /* renamed from: y1 */
    public RedDotImageButton f63263y1;

    /* renamed from: z1 */
    public TextView f63265z1;

    /* renamed from: z0 */
    private boolean f63264z0 = false;

    /* renamed from: G0 */
    C21253b f63214G0 = new C21253b();

    /* renamed from: K0 */
    long f63222K0 = 0;

    /* renamed from: L0 */
    long f63224L0 = 0;

    /* renamed from: P0 */
    private final Handler f63228P0 = new Handler(Looper.getMainLooper(), new C12103a());

    /* renamed from: Q0 */
    private final Handler f63229Q0 = new Handler(Looper.getMainLooper());

    /* renamed from: R0 */
    private final Runnable f63230R0 = new RunnableC12104b();

    /* renamed from: S0 */
    boolean f63231S0 = false;

    /* renamed from: T0 */
    boolean f63232T0 = false;

    /* renamed from: U0 */
    boolean f63233U0 = false;

    /* renamed from: V0 */
    boolean f63234V0 = false;

    /* renamed from: W0 */
    boolean f63235W0 = false;

    /* renamed from: X0 */
    int f63236X0 = -1;

    /* renamed from: Y0 */
    boolean f63237Y0 = true;

    /* renamed from: Z0 */
    boolean f63238Z0 = true;

    /* renamed from: a1 */
    boolean f63239a1 = true;

    /* renamed from: b1 */
    boolean f63240b1 = true;

    /* renamed from: c1 */
    boolean f63241c1 = true;

    /* renamed from: d1 */
    boolean f63242d1 = false;

    /* renamed from: e1 */
    SlidingTabLayout.InterfaceC13529b f63243e1 = new C12105c();

    /* renamed from: g1 */
    BroadcastReceiver f63245g1 = new C12106d();

    /* renamed from: i1 */
    private final AbstractC30163d f63247i1 = new C12107e();

    /* renamed from: j1 */
    int f63248j1 = 0;

    /* renamed from: l1 */
    boolean f63250l1 = false;

    /* renamed from: o1 */
    public boolean f63253o1 = false;

    /* renamed from: J1 */
    ShowcaseView f63221J1 = null;

    /* renamed from: K1 */
    TooltipView f63223K1 = null;

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$a */
    /* loaded from: classes5.dex */
    class C12103a implements Handler.Callback {
        C12103a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            MainTabView.this.m67610VN(C24099q0.m125958k().m125970n());
                            return false;
                        }
                        return false;
                    }
                    String str = (String) message.obj;
                    ShowcaseView showcaseView = MainTabView.this.f63221J1;
                    if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(str, MainTabView.this.f63221J1.getShowcaseId())) {
                        MainTabView.this.f63221J1.m74626d();
                        MainTabView.this.f63221J1 = null;
                    }
                    TooltipView tooltipView = MainTabView.this.f63223K1;
                    if (tooltipView != null && tooltipView.getParent() != null && TextUtils.equals(str, MainTabView.this.f63223K1.getTooltipId())) {
                        MainTabView.this.f63223K1.m90727Q();
                        MainTabView.this.f63223K1 = null;
                    }
                    MainTabView.this.m67682RL(str);
                    MainTabView.this.m67680PL(str);
                    return false;
                }
                try {
                    MainTabView.this.m67677MN();
                    MainTabView mainTabView = MainTabView.this;
                    ZaloView m67692fM = mainTabView.m67692fM(mainTabView.m67696kM());
                    if (m67692fM instanceof MoreTabView) {
                        ((MoreTabView) m67692fM).m68043UM();
                        return false;
                    }
                    return false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return false;
                }
            }
            MainTabView mainTabView2 = MainTabView.this;
            mainTabView2.m67669FN(mainTabView2.f63251m1);
            MainTabView mainTabView3 = MainTabView.this;
            mainTabView3.m67668CN(mainTabView3.f63251m1);
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$b */
    /* loaded from: classes5.dex */
    class RunnableC12104b implements Runnable {
        RunnableC12104b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((MainTabView.this.m92662fJ().m93012K0() instanceof MainTabView) && MainTabView.this.f63251m1 == C24099q0.m125958k().m125971o()) {
                C22432d.f109743a.m115878f(MainTabView.this.f88762c0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$c */
    /* loaded from: classes5.dex */
    class C12105c implements SlidingTabLayout.InterfaceC13529b {
        C12105c() {
        }

        @Override // com.zing.zalo.p077ui.widget.SlidingTabLayout.InterfaceC13529b
        /* renamed from: a */
        public void mo67720a(View view, int i11) {
            try {
                if (MainTabView.this.m67696kM() == C24099q0.m125958k().m125977u() && view == MainTabView.this.f63208D0.m68753k(C24099q0.m125958k().m125977u())) {
                    C23744a.m124114c().m124116d(6092, new Object[0]);
                    if (C20830x0.m108856h() > 0) {
                        AbstractC23647d.m123906p("400003");
                    } else {
                        C20830x0 c20830x0 = C20830x0.f102390a;
                        if (c20830x0.m108858a() > 0) {
                            AbstractC23647d.m123906p("400002");
                        } else if (c20830x0.m108863f() > 0) {
                            AbstractC23647d.m123906p("400004");
                        } else {
                            AbstractC23647d.m123906p("400001");
                        }
                    }
                    AbstractC23647d.m123893c();
                    return;
                }
                if (MainTabView.this.m67696kM() == C24099q0.m125958k().m125971o() && view == MainTabView.this.f63208D0.m68753k(C24099q0.m125958k().m125971o())) {
                    C23744a.m124114c().m124116d(6076, new Object[0]);
                    return;
                }
                if (MainTabView.this.m67696kM() == C24099q0.m125958k().m125967h() && view == MainTabView.this.f63208D0.m68753k(C24099q0.m125958k().m125967h())) {
                    C23744a.m124114c().m124116d(6074, new Object[0]);
                    return;
                }
                if (MainTabView.this.m67696kM() == C24099q0.m125958k().m125972p() && view == MainTabView.this.f63208D0.m68753k(C24099q0.m125958k().m125972p())) {
                    TextView textView = (TextView) MainTabView.this.f63208D0.m68753k(C24099q0.m125958k().m125972p()).findViewById(AbstractC6918a0.numnotification);
                    View m68752g = MainTabView.this.f63208D0.m68752g(C24099q0.m125958k().m125972p());
                    if ((textView != null && textView.getVisibility() == 0) || (m68752g != null && m68752g.getVisibility() == 0)) {
                        C23744a.m124114c().m124116d(6085, new Object[0]);
                        AbstractC23181q.m119430c();
                    } else {
                        ZaloView m67692fM = MainTabView.this.m67692fM(C24099q0.m125958k().m125972p());
                        if (m67692fM != null && (m67692fM instanceof ContactGroupMyPagesView)) {
                            int m67736kM = ((ContactGroupMyPagesView) m67692fM).m67736kM();
                            if (m67736kM == 0) {
                                C23744a.m124114c().m124116d(6085, new Object[0]);
                            } else if (m67736kM == ContactGroupMyPagesView.C12118e.f63298b) {
                                Intent intent = new Intent();
                                intent.setAction("com.zing.zalo.ACTION_SCROLL_TO_TOP_PAGES_LIST");
                                C28685a.m143693b(MainApplication.getAppContext()).m143696d(intent);
                            } else if (m67736kM == ContactGroupMyPagesView.C12118e.f63297a) {
                                C23744a.m124114c().m124116d(6074, new Object[0]);
                            }
                        }
                    }
                    AbstractC23181q.m119429b();
                    return;
                }
                if ((MainTabView.this.m67696kM() == C24099q0.m125958k().m125970n() && view == MainTabView.this.f63208D0.m68753k(C24099q0.m125958k().m125970n())) || (MainTabView.this.m67696kM() == C24099q0.m125958k().m125966g() && view == MainTabView.this.f63208D0.m68753k(C24099q0.m125958k().m125966g()))) {
                    Intent intent2 = new Intent();
                    intent2.setAction("com.zing.zalo.ACTION_SCROLL_TO_LAYOUT_MYPROFILE");
                    C28685a.m143693b(MainApplication.getAppContext()).m143696d(intent2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$d */
    /* loaded from: classes5.dex */
    class C12106d extends BroadcastReceiver {
        C12106d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (MainTabView.this.mo60294yp()) {
                    return;
                }
                String action = intent.getAction();
                String str = MainTabView.f63200L1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Receive broadcast action: ");
                sb2.append(action);
                if (!"com.zing.zalo.action.ACTION_CHECK_REFRESH_STICKY_ADS_NOTIFY".equals(action) && !"com.zing.zalo.ACTION_UPDATE_FEATURE_HTML".equals(action)) {
                    if ("com.zing.zalo.ACTION_NEW_NOTIFY_REDDOT".equals(action)) {
                        MainTabView.this.m67697kN();
                        MainTabView.this.m67677MN();
                        if (MainTabView.this.m67710tM()) {
                            AtomicInteger atomicInteger = AbstractC23304d.f113357a;
                        }
                    }
                }
                MainTabView.this.m67677MN();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(MainTabView.f63200L1, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$e */
    /* loaded from: classes5.dex */
    class C12107e extends AbstractC30163d {
        C12107e() {
        }

        @Override // xl0.AbstractC30163d
        /* renamed from: b */
        public void mo67721b(InterfaceC2113l interfaceC2113l) {
            MainTabView.this.m67599SN();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$f */
    /* loaded from: classes5.dex */
    class C12108f implements C3568b.b {
        C12108f() {
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            C18020c.m95817m().m95838t();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$g */
    /* loaded from: classes5.dex */
    public class C12109g implements InterfaceC20094a {
        C12109g() {
        }

        /* renamed from: d */
        public /* synthetic */ void m67723d() {
            MainTabView.this.removeDialog(5);
            MainTabView.this.showDialog(5);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    String string = ((JSONObject) obj).getJSONObject("data").getString("force_ver");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        if (split.length > 0) {
                            for (String str : split) {
                                try {
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                if (CoreUtility.f89236l == Integer.parseInt(str)) {
                                    AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.maintab.a
                                        public /* synthetic */ RunnableC12112a() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MainTabView.C12109g.this.m67723d();
                                        }
                                    });
                                    return;
                                }
                                continue;
                            }
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$h */
    /* loaded from: classes5.dex */
    public class C12110h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ boolean f63273a;

        C12110h(boolean z11) {
            this.f63273a = z11;
        }

        /* renamed from: d */
        public /* synthetic */ void m67725d(boolean z11) {
            try {
                if (AbstractC23309i.m121603Xf()) {
                    MainTabView.this.m67582KN();
                } else {
                    MainTabView.this.m67591PN();
                }
                if (z11 && (MainTabView.this.m67692fM(C24099q0.m125958k().m125977u()) instanceof TimelineView)) {
                    MainTabView.this.m67681QN(C20830x0.m108856h());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C20830x0.m108857p(C7960e.m41971c6().m42571w6());
                if (MainTabView.this.f63228P0 != null) {
                    MainTabView.this.f63228P0.post(new Runnable() { // from class: com.zing.zalo.ui.maintab.b

                        /* renamed from: q */
                        public final /* synthetic */ boolean f63277q;

                        public /* synthetic */ RunnableC12113b(boolean z11) {
                            r2 = z11;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MainTabView.C12110h.this.m67725d(r2);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // am.AbstractC0939u
        /* renamed from: b */
        public boolean mo4459b() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.MainTabView$i */
    /* loaded from: classes5.dex */
    public interface InterfaceC12111i {
        /* renamed from: A2 */
        boolean mo67726A2();
    }

    /* renamed from: AM */
    public static /* synthetic */ void m67559AM() {
        try {
            if (AbstractC23309i.m122319qg()) {
                C22021e0.m114963p().m114973E();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: AN */
    private void m67560AN(TextView textView, View view, View view2) {
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: BM */
    public /* synthetic */ void m67562BM(C28212v6 c28212v6, TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f63223K1) {
            this.f63223K1 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: CM */
    public /* synthetic */ void m67564CM(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f63221J1) {
            this.f63221J1 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: DM */
    public /* synthetic */ C24848g0 m67566DM(Boolean bool, Long l11) {
        if (bool.booleanValue()) {
            C26626l.m136687v().m136700V(m92662fJ(), m92676n2(), l11.longValue(), false, false, true);
        }
        return C24848g0.f119245a;
    }

    /* renamed from: DN */
    private void m67567DN(boolean z11) {
        if (z11) {
            Snackbar m90634w = Snackbar.m90634w(m92691vK(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleting_single_conversation), (int) AbstractC0924m0.m3653a7());
            this.f63227O0 = m90634w;
            m90634w.m90639E(this.f63208D0);
            this.f63227O0.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: o70.o
                public /* synthetic */ ViewOnClickListenerC24094o() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainTabView.this.m67622aN(view);
                }
            });
            this.f63227O0.m90641G(true);
            this.f63227O0.m90648N();
            C32044o1.m154612r().m154618M("rmenu", false);
            return;
        }
        Snackbar snackbar = this.f63227O0;
        if (snackbar != null) {
            snackbar.m90655n();
        }
    }

    /* renamed from: EM */
    public /* synthetic */ void m67569EM() {
        try {
            if (m92676n2().mo35579p().m93012K0() instanceof MainTabView) {
                m67588OL();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EN */
    private void m67570EN() {
        showDialog(12);
    }

    /* renamed from: FM */
    public /* synthetic */ void m67572FM() {
        AbstractC20110a.m104535d("EventBus: ACTION_UPDATE_APP_THEME\nReceived", new Object[0]);
        CustomMainTab customMainTab = this.f63208D0;
        if (customMainTab != null) {
            customMainTab.m68757w();
        }
    }

    /* renamed from: GM */
    public /* synthetic */ void m67574GM() {
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
        if (viewPagerCustomSwipeable != null) {
            viewPagerCustomSwipeable.setCurrentItem(this.f63236X0, false);
        }
    }

    /* renamed from: HL */
    private void m67575HL(String str) {
        if (this.f63223K1 != null && str.equals("tip.discoverytab")) {
            this.f63223K1.setIdTracking("discovery_tip_tabbar");
        }
    }

    /* renamed from: HM */
    public static /* synthetic */ void m67576HM(Bundle bundle) {
        try {
            bundle.remove(MessagesView.f63531l3);
            AbstractC23647d.m123906p("22001310");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IM */
    public /* synthetic */ void m67577IM() {
    }

    /* renamed from: IN */
    private void m67578IN(C28212v6 c28212v6, View view) {
        C25297f m130959a = C25297f.Companion.m130959a(view.getContext());
        m130959a.m130907M(c28212v6, view.getContext());
        m130959a.m130925c0(view);
        m130959a.m130916V(c28212v6.f131591q);
        TooltipView tooltipView = new TooltipView(view.getContext());
        this.f63223K1 = tooltipView;
        tooltipView.setConfigs(m130959a);
        this.f63223K1.m90734d0();
        this.f63223K1.setTooltipId(c28212v6.f131577c);
        this.f63223K1.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: o70.h0

            /* renamed from: b */
            public final /* synthetic */ C28212v6 f116417b;

            public /* synthetic */ C24081h0(C28212v6 c28212v62) {
                r2 = c28212v62;
            }

            @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
            /* renamed from: a */
            public final void mo66113a(TooltipView tooltipView2, int i11, int i12, boolean z11) {
                MainTabView.this.m67629dN(r2, tooltipView2, i11, i12, z11);
            }
        });
        this.f63223K1.setTooltipManager(this.f63219I1);
        m67575HL(c28212v62.f131577c);
        this.f63223K1.m90733c0();
    }

    /* renamed from: JM */
    public static /* synthetic */ void m67579JM() {
        ContactProfile contactProfile;
        C3433b m40364F;
        AbstractC23195r2.m119519f();
        try {
            if (C3432a.f14402a.m17234c() && (contactProfile = AbstractC23304d.f113368c0) != null && contactProfile.m40357A0() && (m40364F = AbstractC23304d.f113368c0.m40364F()) != null && m40364F.m17254g() > 0 && C23793c.m124316k().mo124314i() > m40364F.m17254g()) {
                AbstractC23309i.m121541Vr(0L);
            }
            String m3299O1 = AbstractC0924m0.m3299O1();
            if (!TextUtils.isEmpty(m3299O1) && !m3299O1.equals(AbstractC23309i.m121704a5())) {
                AbstractC23309i.m122587xp(m3299O1);
                AbstractC20887g.m109229g(125030, 125035, m3299O1);
            }
            AbstractC0924m0.m3287Ni("");
        } catch (Exception unused) {
        }
    }

    /* renamed from: KL */
    private void m67580KL() {
        int i11;
        String m92652XI;
        boolean m114514D = AbstractC21935u.m114514D();
        if (m114514D) {
            C21373a c21373a = C21373a.f104231a;
            if (c21373a.m110802n()) {
                i11 = AbstractC16803z.ic_saved_message_line_24;
            } else {
                i11 = AbstractC16803z.ic_truyenfile_line_24;
            }
            m92652XI = c21373a.m110805u();
        } else {
            i11 = AbstractC16803z.ic_truyenfile_line_24;
            m92652XI = m92652XI(AbstractC8020f0.str_file_transfer);
        }
        ActionBarMenuItem actionBarMenuItem = this.f63261w1;
        this.f63213F1 = (TextView) actionBarMenuItem.m92774j(AbstractC23136l9.m118730n(actionBarMenuItem.getContext(), 18, m92652XI, i11));
        if (!m114514D) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.f0
                public /* synthetic */ RunnableC24077f0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainTabView.this.m67664yM();
                }
            });
        }
    }

    /* renamed from: KM */
    public /* synthetic */ void m67581KM() {
        this.f63242d1 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:            r6.setVisibility(0);     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:5:0x000b, B:8:0x0016, B:10:0x001c, B:12:0x0022, B:15:0x002d, B:18:0x0035, B:20:0x0071, B:27:0x007f, B:29:0x008a, B:35:0x0085), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: KN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m67582KN() {
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            boolean z14 = true;
            if (C20830x0.m108856h() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C20830x0 c20830x0 = C20830x0.f102390a;
            if (c20830x0.m108865i() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c20830x0.m108863f() > 0 && C22013a0.m114928g() && C22013a0.m114930j()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c20830x0.m108858a() <= 0) {
                z14 = false;
            }
            TextView textView = (TextView) this.f63208D0.m68753k(C24099q0.m125958k().m125977u()).findViewById(AbstractC6918a0.numnotification);
            View m68752g = this.f63208D0.m68752g(C24099q0.m125958k().m125977u());
            View findViewById = this.f63208D0.m68753k(C24099q0.m125958k().m125977u()).findViewById(AbstractC6918a0.noti_new_post_in_feed);
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (!z11 && !z13 && !z14 && !z12) {
                if (m68752g != null) {
                    m68752g.setVisibility(8);
                }
                if (findViewById == null) {
                    findViewById.setVisibility(8);
                    return;
                }
                return;
            }
            if (findViewById == null) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LL */
    public static void m67583LL(Context context, ViewGroup viewGroup) {
        if (context == null) {
            return;
        }
        try {
            if (viewGroup instanceof FrameLayout) {
                ImageView imageView = new ImageView(context);
                imageView.setId(AbstractC6918a0.icon_setting_reminder);
                imageView.setVisibility(8);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 53;
                int i11 = AbstractC23222t7.f112558f;
                layoutParams.topMargin = i11;
                layoutParams.rightMargin = i11;
                viewGroup.addView(imageView, layoutParams);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63200L1, e11);
        }
    }

    /* renamed from: LM */
    public /* synthetic */ void m67584LM(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            AbstractC23309i.m121139Kw(5);
            if (!AbstractC23057e7.m118297d()) {
                AbstractC23057e7.m118305l(false);
            }
            AbstractC23309i.m121209Ms(false);
            AbstractC23309i.m121235Nh(false);
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
                this.f63264z0 = false;
            }
            m67714vN(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MM */
    public /* synthetic */ void m67585MM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f63264z0 = false;
        Context appContext = MainApplication.getAppContext();
        String[] strArr = AbstractC23034c6.f112032i;
        if (AbstractC23034c6.m118167n(appContext, strArr) != 0) {
            AbstractC23034c6.m118184v0(this, strArr, 127);
            interfaceC17463d.dismiss();
        } else {
            m67676ML();
        }
    }

    /* renamed from: NL */
    private void m67586NL() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.e0
            public /* synthetic */ RunnableC24075e0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.this.m67666zM();
            }
        });
    }

    /* renamed from: NM */
    public /* synthetic */ void m67587NM(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            try {
                Bundle bundle = new Bundle();
                ZaloWebView.m87105iS(m92676n2(), "market://details?id=" + m92648SI().getPackageName(), bundle);
            } catch (ActivityNotFoundException unused) {
                ZaloWebView.m87105iS(m92676n2(), "https://play.google.com/store/apps/details?id=" + m92648SI().getPackageName() + "&feature=search_result", new Bundle());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m67714vN(false);
    }

    /* renamed from: OL */
    private void m67588OL() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.c0
            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.m67559AM();
            }
        });
    }

    /* renamed from: OM */
    public /* synthetic */ void m67589OM(InterfaceC17463d interfaceC17463d, int i11) {
        int m125972p;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC28025b8.f130835L = true;
        if (C24099q0.m125958k().m125962c()) {
            m125972p = C24099q0.m125958k().m125967h();
        } else {
            m125972p = C24099q0.m125958k().m125972p();
        }
        if (this.f63204B0.getCurrentItem() != m125972p) {
            AbstractC23304d.f113292J2 = true;
            this.f63204B0.setCurrentItem(m125972p);
        } else {
            m67669FN(m125972p);
        }
    }

    /* renamed from: PM */
    public static /* synthetic */ void m67590PM(CheckBox checkBox, InterfaceC17463d interfaceC17463d, int i11) {
        if (checkBox.isChecked()) {
            AbstractC23309i.m121954gr(-1L);
            AbstractC23309i.m121733ax(false);
        } else {
            int m121672Za = AbstractC23309i.m121672Za() + 1;
            if (m121672Za >= AbstractC23309i.m121635Ya()) {
                AbstractC23309i.m121733ax(false);
            } else {
                AbstractC23309i.m121508Uv(m121672Za);
            }
        }
        interfaceC17463d.dismiss();
    }

    /* renamed from: PN */
    public void m67591PN() {
        boolean z11;
        try {
            if (C22013a0.m114928g() && C22013a0.m114930j()) {
                z11 = true;
            } else {
                z11 = false;
            }
            TextView textView = (TextView) this.f63208D0.m68753k(C24099q0.m125958k().m125977u()).findViewById(AbstractC6918a0.numnotification);
            View m68752g = this.f63208D0.m68752g(C24099q0.m125958k().m125977u());
            View findViewById = this.f63208D0.m68753k(C24099q0.m125958k().m125977u()).findViewById(AbstractC6918a0.noti_new_post_in_feed);
            if (C20830x0.m108856h() <= 0) {
                C20830x0 c20830x0 = C20830x0.f102390a;
                if (c20830x0.m108863f() <= 0 || !z11) {
                    if (c20830x0.m108858a() > 0) {
                        if (findViewById != null) {
                            findViewById.setVisibility(0);
                        }
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        if (m68752g != null) {
                            m68752g.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    if (c20830x0.m108865i() > 0) {
                        m67560AN(textView, m68752g, findViewById);
                        return;
                    }
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    if (m68752g != null) {
                        m68752g.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            m67560AN(textView, m68752g, findViewById);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: QL */
    private void m67593QL(ActionBarMenuItem actionBarMenuItem) {
        AbstractC25598c.m132227a(actionBarMenuItem, AbstractC6918a0.icon_setting_reminder);
        if (AbstractC26084s.m134251H(actionBarMenuItem, 36) == null && C22447s.m116040j(actionBarMenuItem, AbstractC6918a0.icon_setting_reminder) < 0 && !C22436h.f109760a.m115922r() && C22447s.m116036h(actionBarMenuItem, AbstractC6918a0.icon_setting_reminder) < 0 && !C18389d.m97401a()) {
            AbstractC2557e.m13010b(actionBarMenuItem, AbstractC6918a0.icon_setting_reminder);
        }
    }

    /* renamed from: QM */
    public /* synthetic */ void m67594QM(CheckBox checkBox, InterfaceC17463d interfaceC17463d, int i11) {
        boolean canDrawOverlays;
        if (checkBox.isChecked()) {
            AbstractC23309i.m121733ax(false);
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            canDrawOverlays = Settings.canDrawOverlays(m92648SI());
            if (!canDrawOverlays) {
                this.f88762c0.m92641HK(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + MainApplication.getAppContext().getPackageName())));
                interfaceC17463d.dismiss();
            }
        }
        if (AbstractC32228e.m155422c() && !AbstractC32228e.m155421b(m92648SI())) {
            try {
                try {
                    this.f88762c0.m92641HK(AbstractC32228e.m155426g(m92648SI(), MainApplication.getAppContext().getPackageName()));
                } catch (Exception unused) {
                    this.f88762c0.m92641HK(AbstractC32228e.m155425f(m92648SI(), MainApplication.getAppContext().getPackageName()));
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
            }
            interfaceC17463d.dismiss();
        }
        if (AbstractC32228e.m155424e() && !AbstractC32228e.m155421b(m92648SI())) {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setComponent(new ComponentName("com.oppo.safe", "com.oppo.safe.permission.floatwindow.FloatWindowListActivity"));
                this.f88762c0.m92641HK(intent);
            } catch (Exception e13) {
                e13.printStackTrace();
                try {
                    Intent intent2 = new Intent("action.coloros.safecenter.FloatWindowListActivity");
                    intent2.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.floatwindow.FloatWindowListActivity"));
                    this.f88762c0.m92641HK(intent2);
                } catch (Exception e14) {
                    e14.printStackTrace();
                    try {
                        Intent intent3 = new Intent("com.coloros.safecenter");
                        intent3.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"));
                        this.f88762c0.m92641HK(intent3);
                    } catch (Exception e15) {
                        e15.printStackTrace();
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                    }
                }
            }
        }
        interfaceC17463d.dismiss();
    }

    /* renamed from: RM */
    public /* synthetic */ C24848g0 m67596RM() {
        C31877d c31877d = new C31877d();
        c31877d.m153184c(C32002l4.m154265h(49, 91));
        AbstractC28207v1.m141994i3("action.open.kyc", 0, this.f88762c0.m92676n2(), null, "", c31877d);
        return C24848g0.f119245a;
    }

    /* renamed from: SM */
    public /* synthetic */ void m67598SM() {
        try {
            AbstractC28025b8.m141442M("tip.message.compose");
            m67668CN(this.f63251m1);
            AbstractC23647d.m123897g("200003");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SN */
    public void m67599SN() {
        if (this.f63217H1 == null) {
            return;
        }
        int m118655I = AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f63217H1.getLayoutParams();
        if (layoutParams != null && layoutParams.height != m118655I) {
            layoutParams.height = m118655I;
            this.f63217H1.setLayoutParams(layoutParams);
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setActionBarHeight(m118655I);
                this.f88760a0.requestLayout();
            }
        }
    }

    /* renamed from: TL */
    public void m67601TL() {
        try {
            C21765a.m112264h();
            C21765a.m112262f();
            new C26219a().m134808i();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63200L1, e11);
        }
    }

    /* renamed from: TM */
    public /* synthetic */ void m67602TM() {
        C13306b c13306b = this.f63219I1;
        if (c13306b != null && c13306b.m74707p()) {
            this.f63219I1.m74704l(AbstractC28025b8.f130850g);
            this.f63228P0.sendEmptyMessageDelayed(1, 500L);
        }
    }

    /* renamed from: TN */
    private void m67603TN() {
        AbstractC19444a.m101695c(new Runnable() { // from class: o70.a0
            public /* synthetic */ RunnableC24067a0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.this.m67635gN();
            }
        });
    }

    /* renamed from: UN */
    private void m67606UN() {
        this.f63228P0.post(new Runnable() { // from class: o70.d0
            public /* synthetic */ RunnableC24073d0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.this.m67638hN();
            }
        });
    }

    /* renamed from: VL */
    private void m67608VL() {
        C26626l.m136687v().m136707r(false, new InterfaceC18509p() { // from class: o70.b0
            public /* synthetic */ C24069b0() {
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public final Object mo240pC(Object obj, Object obj2) {
                C24848g0 m67566DM;
                m67566DM = MainTabView.this.m67566DM((Boolean) obj, (Long) obj2);
                return m67566DM;
            }
        });
    }

    /* renamed from: VM */
    public static /* synthetic */ void m67609VM() {
        JSONObject jSONObject;
        try {
            AbstractC23309i.m121464To();
            String m121449T9 = AbstractC23309i.m121449T9();
            AbstractC23309i.m122209nh("");
            if (!TextUtils.isEmpty(m121449T9)) {
                try {
                    jSONObject = new JSONObject(m121449T9);
                } catch (JSONException e11) {
                    AbstractC20110a.m104539h(e11);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    AbstractC23306f.m120585H1().m16686s(jSONObject, true);
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: VN */
    public boolean m67610VN(int i11) {
        View m68753k;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        try {
            m68753k = this.f63208D0.m68753k(i11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63200L1, e11);
        }
        if (m68753k == null) {
            return true;
        }
        ImageView m68745j = CustomMainTab.m68745j(m68753k);
        View m68743h = CustomMainTab.m68743h(m68753k);
        if (m68745j != null && m68743h != null) {
            List singletonList = Collections.singletonList(CustomMainTab.m68744i(m68753k));
            AbstractC25598c.m132228b(m68745j, singletonList);
            int i12 = AbstractC26080o.a.f124275b;
            C24070c c24070c = C24070c.f116404a;
            int m134274v = AbstractC26084s.m134274v(i12, m68745j, singletonList, c24070c.m125954i());
            if (m134274v == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c24070c.m125953e(m68753k, i11, "SOURCE_UNREAD_REMIND_SETTING", z11);
            if (m134274v >= 0) {
                return true;
            }
            int m116014P = C22447s.m116014P(m68745j, singletonList);
            if (m116014P == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            c24070c.m125953e(m68753k, i11, "SOURCE_UNREAD_REMIND_RESTORE", z12);
            if (m116014P >= 0) {
                return true;
            }
            if (C22436h.f109760a.m115922r()) {
                return false;
            }
            int m116013O = C22447s.m116013O(m68745j, singletonList);
            if (m116013O == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            c24070c.m125953e(m68753k, i11, "SOURCE_UNREAD_REMIND_AUTHEN_GOOGLE", z13);
            if (m116013O >= 0) {
                return true;
            }
            if (C18389d.m97401a()) {
                return false;
            }
            int m13011c = AbstractC2557e.m13011c(m68745j, singletonList);
            if (m13011c == 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            c24070c.m125953e(m68753k, i11, "SOURCE_UNREAD_REMIND_BACKUP_PASSWORD", z14);
            if (m13011c >= 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: WL */
    private void m67612WL() {
        this.f63229Q0.postDelayed(this.f63230R0, 100L);
    }

    /* renamed from: WM */
    public /* synthetic */ void m67613WM(MainTabFrameLayout mainTabFrameLayout, int i11, C1421e c1421e) {
        if (mainTabFrameLayout != null) {
            mainTabFrameLayout.setBottomSpacing(c1421e.f6233d);
        }
        ViewGroup.LayoutParams layoutParams = this.f63208D0.getLayoutParams();
        layoutParams.height = i11 + c1421e.f6233d;
        this.f63208D0.setLayoutParams(layoutParams);
    }

    /* renamed from: XM */
    public /* synthetic */ void m67615XM() {
        boolean z11 = false;
        AbstractC23195r2.f112443e = false;
        if (AbstractC23195r2.f112444f == AbstractC23195r2.f112439a) {
            z11 = true;
        }
        m67691eM(z11);
    }

    /* renamed from: YM */
    public /* synthetic */ void m67617YM(int i11, MessagesView.C12191g0 c12191g0) {
        ColorStateList colorStateList;
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null) {
            return;
        }
        if (actionBar.getActionMode() == null || this.f63248j1 != i11) {
            ActionBarMenu m92709d = this.f88760a0.m92709d();
            m92709d.m92750r();
            m92709d.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar_white);
            View m92744k = m92709d.m92744k(20, AbstractC7409c0.action_mode_back);
            if (m92744k != null && (m92744k instanceof ImageView)) {
                ((ImageView) m92744k).setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.stencils_ic_head_back));
            }
            if (i11 == 2) {
                ActionBarMenuItem m92749q = m92709d.m92749q(22, AbstractC16803z.icn_form_checkbox_unchecked, AbstractC23136l9.m118742r(24.0f));
                this.f63218I0 = m92749q;
                m92749q.getIconView().setPadding(0, 0, 0, 0);
                this.f63218I0.getIconView().setScaleType(ImageView.ScaleType.FIT_CENTER);
                View m92744k2 = m92709d.m92744k(22, AbstractC7409c0.action_bar_menu_item_select_all);
                if (m92744k2 instanceof Button) {
                    Button button = (Button) m92744k2;
                    this.f63249k1 = button;
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
            View m92745l = m92709d.m92745l(21, AbstractC7409c0.action_mode_title, 1);
            if (m92745l instanceof TextView) {
                ((TextView) m92745l).setText("");
            }
            Button button2 = (Button) m92709d.m92744k(23, AbstractC7409c0.action_bar_menu_item_add);
            this.f63216H0 = button2;
            if (button2 != null && colorStateList != null) {
                button2.setTextColor(colorStateList);
            }
        }
        this.f88760a0.m92725w();
        this.f88760a0.setVisibility(0);
        m67713uN(c12191g0);
        this.f63248j1 = i11;
    }

    /* renamed from: ZM */
    public /* synthetic */ void m67619ZM() {
        try {
            if (!mo60294yp()) {
                removeDialog(6);
                showDialog(6);
                this.f63264z0 = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aM */
    private void m67621aM() {
        int i11;
        String str;
        int m67696kM = m67696kM();
        Bundle bundle = new Bundle();
        if (m67696kM == C24099q0.m125958k().m125971o()) {
            i11 = 1;
        } else if (m67696kM == C24099q0.m125958k().m125966g()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        bundle.putInt("extra_src", i11);
        AbstractC26412d.m136219h(m92676n2(), bundle, 0);
        if (m67696kM == C24099q0.m125958k().m125971o()) {
            str = "20000302";
        } else if (m67696kM == C24099q0.m125958k().m125972p()) {
            str = "300002";
        } else {
            str = "500002";
        }
        C32017m4.m154326S().m154359e0(str);
        if (m67696kM == C24099q0.m125958k().m125971o()) {
            AbstractC28025b8.m141442M("tip.message.compose.scanqr");
            m67668CN(C24099q0.m125958k().m125971o());
        } else if (m67696kM == C24099q0.m125958k().m125970n()) {
            AbstractC28025b8.m141442M("tip.more.qr_code");
            m67668CN(C24099q0.m125958k().m125970n());
        }
        if (m67696kM() == C24099q0.m125958k().m125966g()) {
            C0815e1.m2075D().m2100V(new C23648e(21, "social_tab_discovery", 0, "tab_discovery_open_scan_qr", new String[0]), false);
        }
    }

    /* renamed from: aN */
    public /* synthetic */ void m67622aN(View view) {
        this.f63227O0.m90655n();
        m67650nN();
    }

    /* renamed from: bM */
    public void m67624bM() {
        ActionBarMenuItem m92752u;
        try {
            ActionBarMenu actionBarMenu = this.f88763d0;
            if (actionBarMenu != null && (m92752u = actionBarMenu.m92752u(5)) != null) {
                m67593QL(m92752u);
            }
            if (C24099q0.m125958k().m125963d()) {
                m67679ON();
            }
            if (C24099q0.m125958k().m125964e() && !m67610VN(C24099q0.m125958k().m125970n())) {
                m67677MN();
                m67680PL("tip.moretab");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[SettingReminder]", e11);
        }
    }

    /* renamed from: bN */
    public /* synthetic */ void m67625bN(InterfaceC17463d interfaceC17463d, int i11) {
        m67711tN(this.f63226N0);
        AbstractC23057e7.m118307n(m92648SI());
    }

    /* renamed from: cN */
    public /* synthetic */ void m67627cN(InterfaceC17463d interfaceC17463d, int i11) {
        m67711tN(this.f63226N0);
        m67695jN();
    }

    /* renamed from: dN */
    public /* synthetic */ void m67629dN(C28212v6 c28212v6, TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f63223K1) {
            this.f63223K1 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: eN */
    public /* synthetic */ void m67631eN() {
        boolean z11;
        int m67642jM = m67642jM();
        CustomMainTab customMainTab = this.f63208D0;
        if (customMainTab != null && customMainTab.m68753k(C24099q0.m125958k().m125972p()) != null) {
            View m68753k = this.f63208D0.m68753k(C24099q0.m125958k().m125972p());
            C24070c c24070c = C24070c.f116404a;
            int m125972p = C24099q0.m125958k().m125972p();
            if (m67642jM > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c24070c.m125953e(m68753k, m125972p, "SOURCE_UNREAD_TAB_CONTACT", z11);
        }
    }

    /* renamed from: fN */
    public /* synthetic */ void m67633fN() {
        try {
            if (!m67610VN(C24099q0.m125958k().m125969m())) {
                View m68753k = this.f63208D0.m68753k(C24099q0.m125958k().m125969m());
                TextView textView = (TextView) m68753k.findViewById(AbstractC6918a0.numnotification);
                ImageView imageView = (ImageView) m68753k.findViewById(AbstractC6918a0.badge_warning);
                View m68752g = this.f63208D0.m68752g(C24099q0.m125958k().m125969m());
                imageView.setVisibility(8);
                textView.setVisibility(8);
                boolean z11 = false;
                boolean z12 = false;
                for (C28212v6 c28212v6 : C20795g.f102172a.m108501e()) {
                    C28035c8 c28035c8 = (C28035c8) c28212v6.f131589o;
                    if (c28035c8 != null) {
                        if (c28212v6.f131577c.indexOf("tip.tabme.new_feature") >= 0) {
                            z12 |= c28035c8.m141476e();
                        } else if (c28212v6.f131577c.indexOf("tip.tabme.critical_issue") >= 0) {
                            z11 |= c28035c8.m141476e();
                        }
                    }
                }
                if (z11) {
                    imageView.setImageResource(AbstractC16803z.ic_icn_reddot_warning);
                    imageView.setVisibility(0);
                    if (m68752g != null) {
                        m68752g.setVisibility(8);
                        return;
                    }
                    return;
                }
                C24070c.f116404a.m125953e(m68753k, C24099q0.m125958k().m125969m(), "tip.tabme.new_feature", z12);
                if (!z12 && C16888a.m90216h().m90244o()) {
                    m67680PL("tip.tabme.graceperiod.zcloud");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gN */
    public /* synthetic */ void m67635gN() {
        int i11;
        try {
            if (this.f63213F1 != null) {
                C21373a c21373a = C21373a.f104231a;
                if (c21373a.m110802n()) {
                    i11 = AbstractC16803z.ic_saved_message_line_24;
                } else {
                    i11 = AbstractC16803z.ic_truyenfile_line_24;
                }
                Drawable m103336d = AbstractC19694b.m103336d(this.f63213F1.getContext(), i11);
                this.f63213F1.setCompoundDrawablePadding(AbstractC23222t7.f112576o);
                this.f63213F1.setCompoundDrawablesWithIntrinsicBounds(m103336d, (Drawable) null, (Drawable) null, (Drawable) null);
                this.f63213F1.setText(c21373a.m110805u());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: hM */
    private void m67637hM() {
        if (C32044o1.m154612r().m154614G()) {
            C32044o1.m154612r().m154628n();
        }
        m67567DN(false);
    }

    /* renamed from: hN */
    public /* synthetic */ void m67638hN() {
        View m68753k;
        String valueOf;
        try {
            CustomMainTab customMainTab = this.f63208D0;
            if (customMainTab == null || (m68753k = customMainTab.m68753k(C24099q0.m125958k().m125971o())) == null) {
                return;
            }
            int m102745D = C19636i1.m102737w().m102745D();
            TextView textView = (TextView) m68753k.findViewById(AbstractC6918a0.numnotification);
            if (textView != null) {
                if (m102745D > 0) {
                    if (m102745D > 5) {
                        valueOf = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_over_5);
                    } else {
                        valueOf = String.valueOf(m102745D);
                    }
                    textView.setText(valueOf);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            C24070c.f116404a.m125953e(m68753k, C24099q0.m125958k().m125971o(), "SOURCE_UNREAD_TAB_MESSAGES_MARK_AS_UNREAD", false);
            if (C24099q0.m125958k().m125962c() && this.f63208D0.m68752g(C24099q0.m125958k().m125967h()) != null) {
                m67680PL("tip.any");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63200L1, e11);
        }
    }

    /* renamed from: iM */
    private int m67640iM() {
        int i11;
        C24726a c24726a;
        List m134866j;
        if (AbstractC0924m0.m4106pa()) {
            C24726a c24726a2 = C24726a.f118764a;
            if (c24726a2.m128461c() && c24726a2.m128459a()) {
                i11 = 1;
                c24726a = C24726a.f118764a;
                if (!c24726a.m128460b() && c24726a.m128459a() && (m134866j = C26231b.m134866j()) != null && !m134866j.isEmpty()) {
                    return i11 + 1;
                }
                return i11;
            }
        }
        i11 = 0;
        c24726a = C24726a.f118764a;
        return !c24726a.m128460b() ? i11 : i11;
    }

    /* renamed from: jM */
    private int m67642jM() {
        int i11 = 0;
        if (AbstractC23309i.m121081Jb() == 1 && AbstractC23304d.f113341W > 0) {
            if (ZaloListView.m86977gN() && this.f63251m1 == C24099q0.m125958k().m125972p()) {
                AbstractC23304d.f113341W = 0;
                AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
                AbstractC23309i.m120913Es("");
            } else {
                i11 = AbstractC23304d.f113341W;
            }
        }
        return i11 + C25641k.m132506o().m132525u() + C25637g.m132489q().m132463g() + AbstractC23304d.f113353Z + m67640iM();
    }

    /* renamed from: lM */
    public static MainTabView m67645lM() {
        WeakReference weakReference = f63201M1;
        if (weakReference == null) {
            return null;
        }
        return (MainTabView) weakReference.get();
    }

    /* renamed from: lN */
    private void m67646lN() {
        C17487o0 c17487o0;
        try {
            if (C24355e0.f117560a.m127362p()) {
                m67570EN();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_ACTION", "4902");
            bundle.putBoolean("EXTRA_ALLOW_RESTORE_LAST_COMPOSE", true);
            bundle.putString("extra_tracking_source", new TrackingSource(5).m40686z());
            if (m92676n2() != null) {
                c17487o0 = m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                c17487o0.m93069k2(UpdateStatusView.class, bundle, 1, true);
            }
            C29630g.m147299E0().m147319V0();
            AbstractC28025b8.m141442M("tip.timeline.compose");
            m67668CN(C24099q0.m125958k().m125977u());
            AbstractC23647d.m123897g("491001");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: nM */
    private int m67649nM(View view) {
        if (view == null) {
            return -1;
        }
        if (view == this.f63208D0.m68753k(C24099q0.m125958k().m125971o())) {
            return C24099q0.m125958k().m125971o();
        }
        if (view == this.f63208D0.m68753k(C24099q0.m125958k().m125972p())) {
            return C24099q0.m125958k().m125972p();
        }
        if (view == this.f63208D0.m68753k(C24099q0.m125958k().m125967h())) {
            return C24099q0.m125958k().m125967h();
        }
        if (view == this.f63208D0.m68753k(C24099q0.m125958k().m125966g())) {
            return C24099q0.m125958k().m125966g();
        }
        if (view == this.f63208D0.m68753k(C24099q0.m125958k().m125977u())) {
            return C24099q0.m125958k().m125977u();
        }
        if (view == this.f63208D0.m68753k(C24099q0.m125958k().m125970n())) {
            return C24099q0.m125958k().m125970n();
        }
        if (view != this.f63208D0.m68753k(C24099q0.m125958k().m125969m())) {
            return -1;
        }
        return C24099q0.m125958k().m125969m();
    }

    /* renamed from: nN */
    private void m67650nN() {
        List m154635x = C32044o1.m154612r().m154635x();
        C32044o1.m154612r().m154626j();
        C32044o1.m154612r().m154617L("rmenu", false);
        if (!m154635x.isEmpty()) {
            if (C19669z.m103146Y().m103202S((String) m154635x.get(0)) == null) {
                ToastUtils.m89266n(AbstractC8020f0.str_unable_perform_action, new Object[0]);
            }
        }
    }

    /* renamed from: vM */
    private boolean m67659vM() {
        TooltipView tooltipView = this.f63223K1;
        String str = "";
        if (tooltipView != null && tooltipView.getTooltipId() != null) {
            str = tooltipView.getTooltipId();
        }
        if (!TextUtils.isEmpty(str) && str.equals("tip.discoverytab")) {
            return true;
        }
        return false;
    }

    /* renamed from: xN */
    public static void m67662xN(MainTabView mainTabView) {
        f63201M1 = new WeakReference(mainTabView);
    }

    /* renamed from: yM */
    public /* synthetic */ void m67664yM() {
        C21373a c21373a = C21373a.f104231a;
        c21373a.m110802n();
        c21373a.m110805u();
        m67603TN();
    }

    /* renamed from: zM */
    public /* synthetic */ void m67666zM() {
        try {
            if (System.currentTimeMillis() - AbstractC23309i.m122236o7() > 86400000) {
                AbstractC23309i.m121208Mr(System.currentTimeMillis());
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C12109g());
                c0766k.mo1631ea();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0011, B:13:0x0027, B:15:0x002e, B:17:0x0034, B:28:0x004f, B:30:0x008a, B:32:0x0090, B:35:0x009d, B:37:0x00a3, B:39:0x00a9, B:40:0x00b0, B:42:0x00ad, B:44:0x0057, B:46:0x005e, B:48:0x0066, B:50:0x0076, B:52:0x0081), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0011, B:13:0x0027, B:15:0x002e, B:17:0x0034, B:28:0x004f, B:30:0x008a, B:32:0x0090, B:35:0x009d, B:37:0x00a3, B:39:0x00a9, B:40:0x00b0, B:42:0x00ad, B:44:0x0057, B:46:0x005e, B:48:0x0066, B:50:0x0076, B:52:0x0081), top: B:2:0x0001 }] */
    /* renamed from: BN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m67667BN() {
        boolean z11;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f63264z0) {
            removeDialog(6);
            showDialog(6);
            return true;
        }
        boolean m118116D = AbstractC23034c6.m118116D(m92648SI(), AbstractC23034c6.f112032i);
        boolean m118297d = AbstractC23057e7.m118297d();
        if (m118116D && m118297d) {
            z11 = false;
            if (AbstractC23309i.m122206ne()) {
                if (AbstractC23309i.m120995H()) {
                    AbstractC23309i.m121235Nh(false);
                    int m120923F1 = AbstractC23309i.m120923F1();
                    if ((m120923F1 == 3 || ((m120923F1 == 2 && z11) || ((m120923F1 == -1 && z11) || (m120923F1 == 1 && !m118116D && m118297d)))) && z11) {
                        AbstractC23309i.m121363Qy(m67698mM(false));
                    }
                }
            } else {
                int m122377s0 = AbstractC23309i.m122377s0();
                if (m122377s0 != -2) {
                    AbstractC23309i.m121709aA(false);
                    AbstractC23309i.m121209Ms(false);
                    if (m122377s0 == -1) {
                        AbstractC23309i.m121209Ms(true);
                        AbstractC23309i.m121363Qy(System.currentTimeMillis() + 20000);
                    } else if (m122377s0 == 0) {
                        AbstractC23309i.m121209Ms(true);
                        AbstractC23309i.m121363Qy(0L);
                    } else if (m122377s0 == 1) {
                        AbstractC23309i.m121363Qy(m67698mM(false));
                    }
                }
            }
            if (z11 || AbstractC23309i.m122206ne() || System.currentTimeMillis() < AbstractC23309i.m122427td()) {
                return false;
            }
            if (AbstractC0924m0.m3385R0() == 1) {
                if (AbstractC23309i.m122123l8()) {
                    AbstractC23309i.m121209Ms(false);
                }
            } else {
                AbstractC0924m0.m4261ug(1);
            }
            AbstractC23309i.m121363Qy(m67698mM(true));
            this.f63228P0.postDelayed(new Runnable() { // from class: o70.g0
                public /* synthetic */ RunnableC24079g0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainTabView.this.m67619ZM();
                }
            }, 200L);
            return true;
        }
        z11 = true;
        if (AbstractC23309i.m122206ne()) {
        }
        if (z11) {
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        boolean z12;
        C23475l.m123241e((byte) 4, "onCreate");
        C24099q0.m125958k().m125981z();
        if (AbstractC23309i.m122089kb() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C13778s1.m76971l(z11);
        C13778s1.m76970k(Integer.valueOf(C13778s1.m76968i(AbstractC23309i.m122635z())));
        C13778s1.m76969j(AbstractC23309i.m122376s());
        super.mo37111CJ(bundle);
        this.f63219I1 = new C13306b(m92648SI());
        this.f63215G1 = AbstractC23309i.m122418t4();
        this.f63246h1 = new C24609a(AbstractC2128z.m11435a(m92686rK()));
        if (!AbstractC23138m0.m118770b()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
            m92662fJ().m93069k2(StartUpNewView.class, bundle2, 2, true);
            return;
        }
        if (C7967l.m42727z().m42733H()) {
            C7967l.m42727z().m42730E();
            if (C7967l.m42727z().m42734K()) {
                C7967l.m42727z().m42735T(m92676n2());
                return;
            }
        }
        if (C29628e.m147249E0().m147263O0() && !C7967l.m42727z().m42733H()) {
            ZaloView m93012K0 = m92662fJ().m93012K0();
            if (!(m93012K0 instanceof RestoreMessageStartupView) && !(m93012K0 instanceof RemindBackupView) && !AbstractC23306f.m120679j2().m124792S0() && C22438j.m115939f(m92662fJ())) {
                return;
            }
        }
        if (bundle == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f63240b1 = z12;
        C29628e.m147249E0().m147291t1();
        AbstractC23309i.m121747bA(false);
        AbstractC23304d.f113431r1.set(false);
        this.f63225M0 = new C23528a(getContext());
        if (AbstractC23304d.f113338V0) {
            try {
                try {
                    AuthorizationAppView.m78145lM(m92648SI());
                    if (System.currentTimeMillis() - AbstractC23304d.f113342W0 < 300000) {
                        AbstractC23059e9.m118334m(m92676n2());
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(f63200L1, e11);
                }
            } finally {
                AbstractC23304d.f113342W0 = 0L;
                AbstractC23304d.f113338V0 = false;
            }
        } else if ((AbstractC23304d.m120553x() || (m92642L3() != null && m92642L3().getBoolean("EXTRA_REQUEST_OPEN_WEB_AUTHORIZATION", false) && m92642L3().containsKey("uri"))) && m92676n2() != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("SHOW_WITH_FLAGS", 67108864);
            if (m92642L3() != null && m92642L3().getBoolean("EXTRA_REQUEST_OPEN_WEB_AUTHORIZATION")) {
                bundle3.putAll(m92642L3());
                m92642L3().remove("EXTRA_REQUEST_OPEN_WEB_AUTHORIZATION");
                m92642L3().remove("uri");
            } else {
                bundle3.putAll(AbstractC23304d.f113272E2);
            }
            m92662fJ().m93069k2(WebAuthorizationView.class, bundle3, 2, true);
            AbstractC23304d.f113268D2.set(false);
            AbstractC23304d.f113272E2 = null;
            this.f63237Y0 = false;
            return;
        }
        if (m92642L3() != null && m92642L3().getBoolean("EXTRA_START_FROM_WEB_AUTHORIZATION", false)) {
            m92642L3().remove("EXTRA_START_FROM_WEB_AUTHORIZATION");
            AbstractC23136l9.m118678T0((ZaloActivity) m92676n2());
        }
        try {
            try {
                if (MessagePopupActivity.m56886u4() != null) {
                    MessagePopupActivity.m56884o5(false);
                    MessagePopupActivity.m56886u4().finish();
                }
                if (RetryMsgPopupActivity.m56950X3() != null) {
                    RetryMsgPopupActivity.m56954u4(false);
                    RetryMsgPopupActivity.m56950X3().finish();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            f63201M1 = new WeakReference(this);
        } catch (Exception e13) {
            AbstractC23350e.m122776f(f63200L1, e13);
        }
        C26263i.m135055u().m135080m();
        if (AbstractC3489d.m17509q()) {
            C28989l.m144746p().m144755E();
        }
        AbstractC23126l.m118627a(f63200L1);
        AbstractC22490a.m116281d("create MainTabView");
        C23475l.m123240d().m123242a("onCreate");
        C23475l.m123240d().m123243b();
    }

    /* renamed from: CN */
    public void m67668CN(int i11) {
        try {
            ZaloView m67692fM = m67692fM(i11);
            if (i11 == C24099q0.m125958k().m125971o()) {
                if (m67692fM != null && (m67692fM instanceof MessagesView)) {
                    ((MessagesView) m67692fM).m68352YN("tip.any");
                }
                return;
            }
            if (i11 == C24099q0.m125958k().m125972p()) {
                if (m67692fM != null && (m67692fM instanceof ContactGroupMyPagesView)) {
                    ((ContactGroupMyPagesView) m67692fM).m67733hM("tip.any");
                }
                return;
            } else if (i11 == C24099q0.m125958k().m125977u()) {
                if (m67692fM != null && (m67692fM instanceof TimelineView)) {
                    ((TimelineView) m67692fM).m85389WN("tip.any");
                }
                return;
            } else if (i11 == C24099q0.m125958k().m125970n()) {
                if (m67692fM != null && (m67692fM instanceof MoreTabView)) {
                    ((MoreTabView) m67692fM).m68054qM("tip.any");
                }
                return;
            } else if (i11 == C24099q0.m125958k().m125967h()) {
                if (m67692fM != null && (m67692fM instanceof GroupTabParentView)) {
                    ((GroupTabParentView) m67692fM).m67758kM("tip.any");
                }
                return;
            }
            m67680PL("tip.any");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: o70.h.<init>(android.widget.CheckBox):void, class status: GENERATED_AND_UNLOADED
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
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
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
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public com.zing.zalo.zview.dialog.KeyEventCallbackC17462c mo39014DJ(int r7) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.maintab.MainTabView.mo39014DJ(int):com.zing.zalo.zview.dialog.c");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        ActionBarMenuItem m92747n = actionBarMenu.m92747n(8, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icon_header_newpost);
        this.f63257s1 = m92747n;
        m92747n.setId(AbstractC6918a0.action_bar_new_post_btn);
        this.f63257s1.setVisibility(8);
        int i11 = this.f63215G1;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 == 7) {
                            ActionBarMenuItem m92747n2 = actionBarMenu.m92747n(19, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icn_groupcall);
                            this.f63259u1 = m92747n2;
                            m92747n2.setId(AbstractC6918a0.action_bar_group_call_btn);
                            this.f63259u1.setVisibility(0);
                        }
                    } else {
                        ActionBarMenuItem m92747n3 = actionBarMenu.m92747n(19, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icon_header_qrcode);
                        this.f63259u1 = m92747n3;
                        m92747n3.setId(AbstractC6918a0.action_bar_qrcode);
                        this.f63259u1.setVisibility(0);
                    }
                } else {
                    ActionBarMenuItem m92747n4 = actionBarMenu.m92747n(19, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icn_header_addfriend);
                    this.f63259u1 = m92747n4;
                    m92747n4.setId(AbstractC6918a0.action_bar_add_friend_btn);
                    this.f63259u1.setVisibility(0);
                }
            } else {
                ActionBarMenuItem m92747n5 = actionBarMenu.m92747n(19, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icn_header_phonebook);
                this.f63259u1 = m92747n5;
                m92747n5.setId(AbstractC6918a0.action_bar_contact_native_btn);
                this.f63259u1.setVisibility(0);
            }
        } else {
            ActionBarMenuItem m92747n6 = actionBarMenu.m92747n(19, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.ic_head_newchat);
            this.f63259u1 = m92747n6;
            m92747n6.setId(AbstractC6918a0.action_bar_new_chat_btn);
            this.f63259u1.setVisibility(0);
        }
        ActionBarMenuItem m92748p = actionBarMenu.m92748p(12, AbstractC7409c0.action_menu_item_layout, AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_header_plus));
        this.f63261w1 = m92748p;
        m92748p.setId(AbstractC6918a0.action_bar_plus_btn);
        this.f63203A1 = (TextView) this.f63261w1.m92774j(AbstractC23136l9.m118727m(getContext(), 10, AbstractC8020f0.addfriend, AbstractC16803z.ic_adduser_line_24));
        this.f63265z1 = (TextView) this.f63261w1.m92774j(AbstractC23136l9.m118727m(getContext(), 9, AbstractC8020f0.str_btn_createGroup, AbstractC16803z.ic_add_member_line_24));
        if (this.f63215G1 != 6) {
            this.f63205B1 = (TextView) this.f63261w1.m92774j(AbstractC23136l9.m118727m(getContext(), 11, AbstractC8020f0.qrcode_scan_qrcode, AbstractC16803z.ic_qr_line_24));
        }
        this.f63261w1.setMenuItemListener(new ActionBarMenuItem.InterfaceC17434c() { // from class: o70.t
            public /* synthetic */ C24104t() {
            }

            @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.InterfaceC17434c
            /* renamed from: a */
            public final void mo87298a() {
                MainTabView.this.m67598SM();
            }
        });
        this.f63261w1.setSubMenuDismissListener(new PopupWindow.OnDismissListener() { // from class: o70.u
            public /* synthetic */ C24106u() {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                MainTabView.this.m67602TM();
            }
        });
        m67580KL();
        ActionBarMenuItem actionBarMenuItem = this.f63261w1;
        this.f63211E1 = (TextView) actionBarMenuItem.m92774j(AbstractC23136l9.m118727m(actionBarMenuItem.getContext(), 17, AbstractC8020f0.str_calendar_titlebar, AbstractC16803z.ic_calendar_line_24));
        m67673JL();
        ActionBarMenuItem actionBarMenuItem2 = this.f63261w1;
        this.f63207C1 = (TextView) actionBarMenuItem2.m92774j(AbstractC23136l9.m118727m(actionBarMenuItem2.getContext(), 15, AbstractC8020f0.str_account_security_item_history_login_title, AbstractC16803z.ic_pc_line_24));
        ActionBarMenuItem m92747n7 = actionBarMenu.m92747n(3, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icon_header_add_friend);
        this.f63256r1 = m92747n7;
        m92747n7.setId(AbstractC6918a0.action_bar_add_friend_btn);
        this.f63256r1.setVisibility(8);
        View m92745l = actionBarMenu.m92745l(4, AbstractC7409c0.action_bar_menu_notification_item, 1);
        this.f63255q1 = m92745l;
        RedDotImageButton redDotImageButton = (RedDotImageButton) m92745l.findViewById(AbstractC6918a0.imgButtonNewNotificationList);
        this.f63263y1 = redDotImageButton;
        redDotImageButton.setLeftRedDot(true);
        this.f63263y1.setRedDotMarginLeft(AbstractC23136l9.m118742r(12.0f));
        this.f63263y1.setRedDotMarginTop(AbstractC23136l9.m118742r(12.0f));
        this.f63262x1 = (TextView) this.f63255q1.findViewById(AbstractC6918a0.ic_newNotifyFeed);
        this.f63255q1.setVisibility(8);
        ActionBarMenuItem m92747n8 = actionBarMenu.m92747n(16, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icon_header_qrcode);
        this.f63258t1 = m92747n8;
        m92747n8.setVisibility(8);
        ActionBarMenuItem m92747n9 = actionBarMenu.m92747n(5, AbstractC7409c0.action_menu_item_layout, AbstractC16803z.icon_header_settings);
        this.f63260v1 = m92747n9;
        m92747n9.setId(AbstractC6918a0.action_bar_setting_btn);
        m67583LL(getContext(), this.f63260v1);
        this.f63260v1.setMenuItemListener(new ActionBarMenuItem.InterfaceC17434c() { // from class: o70.v
            @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.InterfaceC17434c
            /* renamed from: a */
            public final void mo87298a() {
                AbstractC23647d.m123897g("500003");
            }
        });
        this.f63260v1.setVisibility(8);
    }

    /* renamed from: FN */
    public void m67669FN(int i11) {
        try {
            if (!m92687sJ()) {
                return;
            }
            ZaloView m67692fM = m67692fM(i11);
            if (i11 == C24099q0.m125958k().m125971o()) {
                if (m67692fM != null && (m67692fM instanceof MessagesView)) {
                    ((MessagesView) m67692fM).m68353ZN("tip.any");
                }
                return;
            }
            if (i11 == C24099q0.m125958k().m125972p()) {
                if (m67692fM != null && (m67692fM instanceof ContactGroupMyPagesView)) {
                    ((ContactGroupMyPagesView) m67692fM).m67734iM("tip.any");
                }
                return;
            }
            if (i11 == C24099q0.m125958k().m125977u()) {
                if (m67692fM != null && (m67692fM instanceof TimelineView)) {
                    ((TimelineView) m67692fM).m85391XN("tip.any", -1);
                }
                return;
            } else if (i11 == C24099q0.m125958k().m125970n()) {
                if (m67692fM != null && (m67692fM instanceof MoreTabView)) {
                    ((MoreTabView) m67692fM).m68055rM("tip.any", -1);
                }
                return;
            } else if (i11 == C24099q0.m125958k().m125967h()) {
                if (m67692fM != null && (m67692fM instanceof GroupTabParentView)) {
                    ((GroupTabParentView) m67692fM).m67759lM("tip.any", -1);
                }
                return;
            } else if (i11 == C24099q0.m125958k().m125969m()) {
                if (m67692fM != null && (m67692fM instanceof TabMeView)) {
                    ((TabMeView) m67692fM).m67958UM("tip.any");
                }
                return;
            }
            m67682RL("tip.any");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C23475l.m123241e((byte) 4, "onCreateView");
        this.f63202A0 = layoutInflater.inflate(AbstractC7409c0.maintab_zview, viewGroup, false);
        m92637BK(true);
        m67719zN(bundle);
        this.f63219I1.m74687C((ViewGroup) this.f63202A0.findViewById(AbstractC6918a0.maintab_tip_container));
        C23475l.m123240d().m123242a("onCreateView");
        C23475l.m123240d().m123243b();
        return this.f63202A0;
    }

    /* renamed from: GN */
    boolean m67670GN() {
        int m121079J9;
        int i11;
        try {
            m121079J9 = AbstractC23309i.m121079J9();
            i11 = CoreUtility.f89236l;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 > m121079J9) {
            AbstractC23309i.m122592xu(i11);
            m67667BN();
            AbstractC23309i.m122111kx(0);
            AbstractC23309i.m122166mc();
            if (C22013a0.m114928g()) {
                C22021e0.m114963p().m114977J(m92648SI());
                AbstractC23304d.f113359a1 = true;
            }
            return false;
        }
        return m67667BN();
    }

    /* renamed from: HN */
    void m67671HN() {
        try {
            if (mo60294yp()) {
                return;
            }
            if (AbstractC23057e7.m118304k(m92648SI()) && AbstractC23309i.m122280pe() < 3) {
                m67711tN(this.f63226N0);
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43171t(AbstractC8020f0.wifi_sleep_policy_title);
                aVar.m43161j(AbstractC8020f0.wifi_sleep_policy_message);
                aVar.m43169r(AbstractC8020f0.wifi_sleep_policy_go_setting, new InterfaceC17463d.d() { // from class: o70.p
                    public /* synthetic */ C24096p() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        MainTabView.this.m67625bN(interfaceC17463d, i11);
                    }
                });
                aVar.m43164m(AbstractC8020f0.wifi_sleep_policy_not_now, new InterfaceC17463d.d() { // from class: o70.q
                    public /* synthetic */ C24098q() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        MainTabView.this.m67627cN(interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f63226N0 = m43152a;
                m43152a.m92873y(false);
                this.f63226N0.mo13822K();
                AbstractC23309i.m121784cA();
                return;
            }
            m67695jN();
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
            if (viewPagerCustomSwipeable != null) {
                viewPagerCustomSwipeable.setSwipeEnabled(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m67711tN(this.f63226N0);
            if (!mo60294yp()) {
                m67695jN();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            AbstractC23304d.f113439t1.set(false);
            if (this.f63264z0) {
                AbstractC23309i.m121139Kw(5);
                AbstractC23057e7.m118305l(false);
            }
            this.f63222K0 = 0L;
            if (this == m67645lM()) {
                f63201M1 = null;
            }
            C24730d.m128465h().m128472f();
            ZaloView m67692fM = m67692fM(C24099q0.m125958k().m125977u());
            if (m67692fM != null && (m67692fM instanceof TimelineView)) {
                ((TimelineView) m67692fM).m85392XQ(null);
                ((TimelineView) m67692fM).m85390WQ(null);
            }
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
            if (viewPagerCustomSwipeable != null) {
                viewPagerCustomSwipeable.removeAllViews();
            }
            CustomMainTab customMainTab = this.f63208D0;
            if (customMainTab != null) {
                customMainTab.removeAllViews();
            }
            BroadcastReceiver broadcastReceiver = this.f63245g1;
            if (broadcastReceiver != null) {
                this.f63244f1.m143697e(broadcastReceiver);
            }
            C23744a.m124114c().m124117e(this, 12003);
            this.f63246h1.m128105e(this.f63247i1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63200L1, e11);
        }
        super.mo39024IJ();
        AbstractC22490a.m116281d("destroy MainTabView");
    }

    /* renamed from: IL */
    public void m67672IL(InterfaceC24103s0 interfaceC24103s0) {
        this.f63214G0.add(interfaceC24103s0);
    }

    /* renamed from: JL */
    void m67673JL() {
        if (AbstractC23309i.m120776B2()) {
            ActionBarMenuItem actionBarMenuItem = this.f63261w1;
            TextView textView = (TextView) actionBarMenuItem.m92774j(AbstractC23136l9.m118727m(actionBarMenuItem.getContext(), 25, AbstractC8020f0.str_call_create_groupcall_entrypoint, AbstractC16803z.icn_menu_groupcall));
            this.f63209D1 = textView;
            textView.setPadding(AbstractC23222t7.f112590v, 0, 0, 0);
        }
    }

    /* renamed from: JN */
    public void m67674JN(int i11) {
        ViewPagerCustomSwipeable viewPagerCustomSwipeable;
        if (i11 >= 0) {
            try {
                if (i11 < C24099q0.m125958k().m125975s() && (viewPagerCustomSwipeable = this.f63204B0) != null) {
                    viewPagerCustomSwipeable.setCurrentItem(i11, false);
                    if (i11 != C24099q0.m125958k().m125971o()) {
                        m67693gM();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: LN */
    public void m67675LN() {
        try {
            boolean z11 = false;
            boolean z12 = false;
            for (int size = C21927m.m114302u().m114367y().size() - 1; size >= 0; size--) {
                try {
                    C32035n7 c32035n7 = (C32035n7) C21927m.m114302u().m114367y().get(size);
                    String m154511b = c32035n7.m154511b();
                    long m154510a = c32035n7.m154510a();
                    ContactProfile m98552o = C18644n.m98531l().m98552o(m154511b);
                    if (m98552o != null) {
                        if (m154510a <= 0) {
                            if (m154510a == 0) {
                                ((C32035n7) C21927m.m114302u().m114367y().get(size)).m154512c(System.currentTimeMillis());
                                z12 = true;
                            }
                        } else {
                            long currentTimeMillis = System.currentTimeMillis() - m154510a;
                            if (currentTimeMillis < 0) {
                                currentTimeMillis = 0;
                            }
                            long m121489Uc = AbstractC23309i.m121489Uc();
                            if (m121489Uc == 0) {
                                m121489Uc = 259200000;
                            }
                            if (currentTimeMillis >= m121489Uc) {
                                C21927m.m114302u().m114367y().remove(size);
                                String m121820d8 = AbstractC23309i.m121820d8();
                                new ArrayList();
                                if (!TextUtils.isEmpty(m121820d8)) {
                                    ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(m121820d8, ",")));
                                    if (arrayList.contains(m154511b)) {
                                        arrayList.remove(m154511b);
                                        int i11 = AbstractC23304d.f113341W;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            AbstractC23304d.f113341W = i12;
                                            if (i12 == 0) {
                                                AbstractC23304d.f113337V = false;
                                                AbstractC0924m0.m3693bh(false);
                                            }
                                        }
                                        AbstractC23309i.m120913Es(TextUtils.join(",", arrayList));
                                        AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
                                    }
                                }
                                m98552o.f42403c1 = false;
                                z11 = true;
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (z11 || z12) {
                C21927m.m114302u().m114370z0();
                if (z11) {
                    C18644n.m98524E();
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: ML */
    void m67676ML() {
        try {
            AbstractC23309i.m121139Kw(5);
            AbstractC23057e7.m118305l(true);
            AbstractC23309i.m121209Ms(false);
            AbstractC23309i.m121235Nh(false);
            AbstractC23309i.m121326Py(0L);
            AbstractC0852x.f3061f.set(0);
            AbstractC0852x.m2338O(new SensitiveData("phonebook_sync_scan_in_main_tab", "phonebook_sync"));
            AbstractC20887g.m109232j(CoreUtility.f89233i, 80003, "", 0L, 80000, CoreUtility.f89236l);
            C20882b.m109134j();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m67714vN(false);
    }

    /* renamed from: MN */
    public void m67677MN() {
        try {
            boolean m95836r = C18020c.m95817m().m95836r();
            if (C24099q0.m125958k().m125964e()) {
                C24070c.f116404a.m125953e(this.f63208D0.m68753k(C24099q0.m125958k().m125970n()), C24099q0.m125958k().m125970n(), "SOURCE_UNREAD_NOTIFY_MORE_TAB", m95836r);
                this.f63228P0.removeMessages(5);
                this.f63228P0.sendEmptyMessageDelayed(5, 100L);
            }
            if (C24099q0.m125958k().m125961b()) {
                C24070c.f116404a.m125953e(this.f63208D0.m68753k(C24099q0.m125958k().m125966g()), C24099q0.m125958k().m125966g(), "SOURCE_UNREAD_NOTIFY_DISCOVERY_TAB", m95836r);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NN */
    public void m67678NN() {
        try {
            AbstractC17927b.m94533b().mo94529c("THROTTLE_LAST_UPDATE_NEW_ITEM_COUNT_TAB_CONTACT", new Runnable() { // from class: o70.m0
                public /* synthetic */ RunnableC24091m0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainTabView.this.m67631eN();
                }
            }, 100L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ON */
    public void m67679ON() {
        this.f63228P0.postDelayed(new Runnable() { // from class: o70.l0
            public /* synthetic */ RunnableC24089l0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.this.m67633fN();
            }
        }, 200L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        AbstractC23309i.m121747bA(false);
        this.f63237Y0 = true;
        if (m92642L3() != null) {
            m67702pM(m92642L3());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0074, code lost:            if (r2.equals("tip.discoverytab") == false) goto L98;     */
    /* renamed from: PL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m67680PL(String str) {
        boolean z11;
        int i11 = 0;
        while (true) {
            String[] strArr = AbstractC28025b8.f130864u;
            if (i11 < strArr.length) {
                String str2 = strArr[i11];
                if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                    C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                    char c11 = 1;
                    if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    View m67700oM = m67700oM(str2);
                    if (m67700oM != null) {
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case -1877392726:
                                if (str2.equals("tip.tabmessage.qr")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 65772120:
                                break;
                            case 539910052:
                                if (str2.equals("tip.tabme.graceperiod.zcloud")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case 820540585:
                                if (str2.equals("tip.grouptab")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 1355137304:
                                if (str2.equals("tip.groupcall.maintab")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                            case 2081312205:
                                if (str2.equals("tip.moretab")) {
                                    c11 = 5;
                                    break;
                                }
                                break;
                        }
                        c11 = 65535;
                        switch (c11) {
                            case 0:
                                if (this.f63215G1 == 6 && (m67700oM instanceof ActionBarMenuItem)) {
                                    ((ActionBarMenuItem) m67700oM).setEnableNoti(z11);
                                    break;
                                }
                                break;
                            case 1:
                            case 2:
                            case 3:
                                C24070c.f116404a.m125953e(m67700oM, m67649nM(m67700oM), str2, z11);
                                break;
                            case 4:
                                if (this.f63215G1 == 7 && (m67700oM instanceof ActionBarMenuItem)) {
                                    ((ActionBarMenuItem) m67700oM).setEnableNoti(z11);
                                    break;
                                }
                                break;
                            case 5:
                                C24070c.f116404a.m125953e(m67700oM, m67649nM(m67700oM), str2, z11);
                                m67610VN(C24099q0.m125958k().m125970n());
                                break;
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        String str;
        int i12;
        boolean z11;
        String str2;
        C17487o0 c17487o0;
        if (super.mo37491QJ(i11)) {
            return true;
        }
        if (i11 == 19) {
            int i13 = this.f63215G1;
            if (i13 != 1 && i13 != 2) {
                if (i13 != 4) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            if (i13 == 7) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("extra_source_call", 4);
                                m92662fJ().m93069k2(CreateGroupCallZView.class, bundle, 1, true);
                                AbstractC28025b8.m141442M("tip.groupcall.maintab");
                                C0815e1.m2075D().m2100V(new C23648e(24, "chats_list_header", 0, "gr_call_create", "0"), false);
                                m67668CN(C24099q0.m125958k().m125971o());
                            }
                        } else {
                            m67621aM();
                            AbstractC28025b8.m141442M("tip.tabmessage.qr");
                        }
                    } else {
                        AbstractC23647d.m123897g("3903");
                        if (C19172a.m100600k("friend_new_finding_ui@enable", 0) == 1) {
                            m92662fJ().m93069k2(AddFriendView.class, null, 1, true);
                        } else {
                            m92662fJ().m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
                        }
                    }
                } else {
                    AbstractC23647d.m123897g("3902");
                    m92662fJ().m93069k2(ListContactNativeView.class, null, 1, true);
                }
            } else {
                Bundle bundle2 = new Bundle();
                if (this.f63215G1 == 1) {
                    AbstractC23647d.m123897g("27426");
                    m92662fJ().m93069k2(ComposeNewChatView.class, bundle2, 1, true);
                } else {
                    AbstractC23647d.m123897g("27432");
                    bundle2.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 6);
                    m92662fJ().m93069k2(QuickCreateGroupView.class, bundle2, 1, true);
                }
                AbstractC28025b8.m141442M("tip.message.newchat");
            }
        } else if (i11 != 11 && i11 != 16) {
            short s7 = 8;
            if (i11 == 9) {
                if (C19637j.f97466a.m102834Q()) {
                    Bundle bundle3 = new Bundle();
                    if (m67696kM() == C24099q0.m125958k().m125971o()) {
                        s7 = 7;
                    }
                    bundle3.putShort("SHORT_EXTRA_CREATE_SOURCE", s7);
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    if (c17487o0 != null) {
                        c17487o0.m93069k2(QuickCreateGroupView.class, bundle3, 1, true);
                    }
                    AbstractC23647d.m123897g("27403");
                    AbstractC28025b8.m141442M("tip.message.compose.creategroup");
                } else {
                    showDialog(10);
                }
                m67668CN(C24099q0.m125958k().m125971o());
            } else if (i11 != 3 && i11 != 10) {
                if (i11 == 4) {
                    m92662fJ().m93066i2(NotificationView.class, null, 0, 1, true);
                    AbstractC28025b8.m141442M("tip.timeline.notification");
                    m67668CN(C24099q0.m125958k().m125977u());
                    if (C20830x0.m108856h() > 0) {
                        str2 = "4914001";
                    } else {
                        str2 = "4914002";
                    }
                    AbstractC23647d.m123897g(str2);
                } else if (i11 == 5) {
                    m92662fJ().m93066i2(SettingV2View.class, null, 0, 1, true);
                    C32017m4.m154326S().m154359e0("50006");
                    AbstractC26084s.m134269q(0, 36);
                    C2556d.m12981o().m12991P("8");
                    C0815e1.m2079N(36, 1, 0, 0, 0);
                    if (this.f63251m1 == C24099q0.m125958k().m125969m()) {
                        Boolean bool = Boolean.FALSE;
                        ActionBarMenuItem m92752u = this.f88763d0.m92752u(5);
                        if (m92752u != null) {
                            View findViewById = m92752u.findViewById(AbstractC6918a0.icon_setting_reminder);
                            if (findViewById != null && findViewById.getVisibility() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            bool = Boolean.valueOf(z11);
                        }
                        C0815e1.m2075D().m2100V(new C23648e(18, "social_tab_me", 0, "tab_me_open_setting", new String[0]).m123926s(bool.toString()), false);
                    }
                } else if (i11 == 8) {
                    m67646lN();
                } else if (i11 == 15) {
                    if (AbstractC23057e7.m118299f()) {
                        AbstractC23057e7.m118306m(m92676n2());
                    } else {
                        m92662fJ().m93069k2(HistoryLoginView.class, null, 1, true);
                    }
                    AbstractC23647d.m123897g("20000303");
                    AbstractC28025b8.m141442M("tip.message.compose.zalopc");
                    m67668CN(C24099q0.m125958k().m125971o());
                } else if (i11 == 20) {
                    m67693gM();
                } else if (i11 == 23) {
                    m67689cM();
                } else if (i11 == 22) {
                    m67688ZL();
                } else if (i11 == 17) {
                    AbstractC23647d.m123897g("77700001");
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 0);
                    m92662fJ().m93069k2(MyCalendarView.class, bundle4, 1, true);
                    AbstractC28025b8.m141442M("tip.message.compose.calendar");
                    m67668CN(C24099q0.m125958k().m125971o());
                } else if (i11 == 18) {
                    ContactProfile m141811g = C28203u6.f131407a.m141811g("204278670");
                    if (m141811g == null) {
                        m141811g = new ContactProfile("204278670");
                    }
                    Bundle m140776b = new C27870vb("204278670").m140780g(m141811g).m140776b();
                    m140776b.putString("STR_SOURCE_START_VIEW", "chats_list_button_plus");
                    m92662fJ().m93069k2(ChatView.class, m140776b, 1, true);
                } else if (i11 == 25) {
                    Bundle bundle5 = new Bundle();
                    if (this.f63251m1 == C24099q0.m125958k().m125967h()) {
                        i12 = 6;
                    } else {
                        C0815e1.m2075D().m2100V(new C23648e(24, "chats_list_button_plus", 0, "gr_call_create", "0"), false);
                        i12 = 5;
                    }
                    bundle5.putInt("extra_source_call", i12);
                    m92662fJ().m93069k2(CreateGroupCallZView.class, bundle5, 1, true);
                }
            } else {
                if (C19172a.m100600k("friend_new_finding_ui@enable", 0) == 1) {
                    m92662fJ().m93069k2(AddFriendView.class, null, 1, true);
                } else {
                    m92662fJ().m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
                }
                AbstractC28025b8.m141442M("tip.contact.addfriend");
                m67668CN(C24099q0.m125958k().m125972p());
                if (m67696kM() == C24099q0.m125958k().m125972p()) {
                    AbstractC23647d.m123897g("5801174");
                    C0815e1.m2075D().m2095O(String.valueOf(1), "42", "", "");
                } else {
                    if (m67696kM() == C24099q0.m125958k().m125971o()) {
                        str = "20000301";
                    } else {
                        str = "3600";
                    }
                    AbstractC23647d.m123897g(str);
                }
                AbstractC28025b8.m141442M("tip.message.compose.addfriend");
                m67668CN(C24099q0.m125958k().m125971o());
            }
        } else {
            m67621aM();
        }
        return true;
    }

    /* renamed from: QN */
    public void m67681QN(int i11) {
        TextView textView = this.f63262x1;
        if (textView == null) {
            return;
        }
        AbstractC23088h5.m118432m(textView, i11, false, null);
        if (i11 > 0 && this.f63251m1 == C24099q0.m125958k().m125977u()) {
            this.f63228P0.sendEmptyMessageDelayed(1, 500L);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        AbstractC23304d.f113254A0 = false;
        super.mo13886RJ();
        this.f63219I1.m74709u();
        m67637hM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a0, code lost:            if (m67642jM() > 0) goto L150;     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:2:0x0000, B:6:0x0007, B:8:0x000b, B:12:0x0013, B:14:0x001d, B:16:0x0021, B:20:0x0031, B:22:0x0036, B:24:0x0040, B:29:0x0048, B:33:0x0054, B:40:0x00ab, B:43:0x00b3, B:45:0x00b9, B:47:0x00bd, B:49:0x00c5, B:52:0x010b, B:54:0x0113, B:55:0x0117, B:57:0x013d, B:58:0x0145, B:66:0x005e, B:68:0x0066, B:70:0x0070, B:72:0x0074, B:76:0x007f, B:78:0x0083, B:82:0x0092, B:84:0x009c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:2:0x0000, B:6:0x0007, B:8:0x000b, B:12:0x0013, B:14:0x001d, B:16:0x0021, B:20:0x0031, B:22:0x0036, B:24:0x0040, B:29:0x0048, B:33:0x0054, B:40:0x00ab, B:43:0x00b3, B:45:0x00b9, B:47:0x00bd, B:49:0x00c5, B:52:0x010b, B:54:0x0113, B:55:0x0117, B:57:0x013d, B:58:0x0145, B:66:0x005e, B:68:0x0066, B:70:0x0070, B:72:0x0074, B:76:0x007f, B:78:0x0083, B:82:0x0092, B:84:0x009c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: RL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m67682RL(String str) {
        C13306b c13306b;
        boolean z11;
        boolean z12;
        try {
            if (m92687sJ() && (c13306b = this.f63219I1) != null && !c13306b.m74707p()) {
                InterfaceC1801w m67692fM = m67692fM(this.f63251m1);
                if (m67692fM != null && (m67692fM instanceof InterfaceC12111i) && ((InterfaceC12111i) m67692fM).mo67726A2()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    String[] strArr = AbstractC28025b8.f130864u;
                    if (i11 < strArr.length) {
                        String str2 = strArr[i11];
                        if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                            C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                            View m67700oM = m67700oM(str2);
                            if (m67700oM != null) {
                                if (str2.hashCode() == 820540585 && str2.equals("tip.grouptab")) {
                                    if (C24099q0.m125958k().m125962c()) {
                                        int i12 = this.f63251m1;
                                        if (i12 >= 0 && i12 != C24099q0.m125958k().m125967h()) {
                                        }
                                    } else {
                                        int i13 = this.f63251m1;
                                        if (i13 >= 0 && i13 != C24099q0.m125958k().m125972p()) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            if (!C24099q0.m125958k().m125962c()) {
                                            }
                                        }
                                        if (z11 && z12 && !z13 && m67700oM.isShown() && m141453i != null && m141453i.m142167f() && m141453i.f131579e) {
                                            if (!"tip.tabme.ba.onboard".equals(str2)) {
                                                AbstractC0924m0.m4143qh(false);
                                                C25297f m130959a = C25297f.Companion.m130959a(m67700oM.getContext());
                                                m130959a.m130907M(m141453i, m67700oM.getContext());
                                                m130959a.m130925c0(m67700oM);
                                                TooltipView tooltipView = new TooltipView(m67700oM.getContext());
                                                this.f63223K1 = tooltipView;
                                                tooltipView.setConfigs(m130959a);
                                                this.f63223K1.m90734d0();
                                                this.f63223K1.setTooltipId(str2);
                                                this.f63223K1.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: o70.w

                                                    /* renamed from: b */
                                                    public final /* synthetic */ C28212v6 f116490b;

                                                    public /* synthetic */ C24108w(C28212v6 m141453i2) {
                                                        r2 = m141453i2;
                                                    }

                                                    @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
                                                    /* renamed from: a */
                                                    public final void mo66113a(TooltipView tooltipView2, int i14, int i15, boolean z14) {
                                                        MainTabView.this.m67562BM(r2, tooltipView2, i14, i15, z14);
                                                    }
                                                });
                                                this.f63223K1.setTooltipManager(this.f63219I1);
                                                this.f63223K1.m90733c0();
                                            } else if ("tip.discoverytab".equals(str2)) {
                                                m67578IN(m141453i2, m67700oM);
                                            } else {
                                                this.f63221J1 = new ShowcaseView(m67700oM.getContext());
                                                C26203c m134769a = C26203c.m134769a(m67700oM.getContext());
                                                m134769a.m134770b(m141453i2, m67700oM.getContext());
                                                m134769a.f124524o = m67700oM;
                                                if (TextUtils.equals(m141453i2.f131577c, "tip.groupcall.maintab")) {
                                                    m134769a.f124513d = AbstractC23136l9.m118742r(-7.0f);
                                                }
                                                this.f63221J1.setConfigs(m134769a);
                                                this.f63221J1.setShowcaseId(m141453i2.f131577c);
                                                this.f63221J1.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: o70.x

                                                    /* renamed from: b */
                                                    public final /* synthetic */ C28212v6 f116492b;

                                                    public /* synthetic */ C24109x(C28212v6 m141453i2) {
                                                        r2 = m141453i2;
                                                    }

                                                    @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                                                    /* renamed from: a */
                                                    public final void mo39159a(ShowcaseView showcaseView, int i14, int i15, boolean z14) {
                                                        MainTabView.this.m67564CM(r2, showcaseView, i14, i15, z14);
                                                    }
                                                });
                                                this.f63221J1.setShowcaseManager(this.f63219I1);
                                                this.f63221J1.m74637r();
                                            }
                                            z13 = true;
                                        }
                                    }
                                    z12 = false;
                                    if (z11) {
                                        if (!"tip.tabme.ba.onboard".equals(str2)) {
                                        }
                                        z13 = true;
                                    }
                                }
                                z12 = true;
                                if (z11) {
                                }
                            }
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RN */
    public void m67683RN(boolean z11) {
        try {
            C0824j.m2153b(new C12110h(z11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            super.mo37118SJ(bundle);
            bundle.putInt("tab", this.f63204B0.getCurrentItem());
            bundle.putBoolean("isIgnoreUpdatePassword", this.f63231S0);
            bundle.putBoolean("requestPermissionFirstView", this.f63238Z0);
            bundle.putBoolean("needCheckAppPermission", this.f63237Y0);
            bundle.putBoolean("isDialogUpdatePhonebookShow", this.f63264z0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SL */
    void m67684SL() {
        ZaloView m67692fM;
        ZaloView m67692fM2;
        try {
            if (this.f63251m1 == C24099q0.m125958k().m125970n() && (m67692fM2 = m67692fM(C24099q0.m125958k().m125970n())) != null && (m67692fM2 instanceof MoreTabView)) {
                ((MoreTabView) m67692fM2).m68053pM();
            }
            if (this.f63251m1 == C24099q0.m125958k().m125966g() && (m67692fM = m67692fM(C24099q0.m125958k().m125966g())) != null && (m67692fM instanceof MoreTabView)) {
                ((MoreTabView) m67692fM).m68053pM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle("");
                this.f88760a0.setBackButtonImage(0);
                this.f88760a0.setVisibility(0);
                LinearLayout linearLayout = new LinearLayout(m92648SI());
                linearLayout.setOrientation(0);
                RedDotImageButton redDotImageButton = new RedDotImageButton(m92648SI(), null, AbstractC19178a.actionButtonStyle);
                this.f63217H1 = redDotImageButton;
                redDotImageButton.setId(AbstractC6918a0.action_bar_search_btn);
                this.f63217H1.setScaleType(ImageView.ScaleType.CENTER);
                this.f63217H1.setImageResource(AbstractC16803z.icon_header_search);
                this.f63217H1.setBackgroundResource(AbstractC7356u0.item_actionbar_background_ripple);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(54.0f), AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height));
                layoutParams.setMargins(AbstractC23136l9.m118742r(2.0f), 0, AbstractC23136l9.m118742r(6.0f), 0);
                this.f63217H1.setLayoutParams(layoutParams);
                linearLayout.addView(this.f63217H1);
                this.f63217H1.setOnClickListener(this);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams2.weight = 1.0f;
                RobotoTextView robotoTextView = new RobotoTextView(this.f88760a0.getContext());
                this.f63220J0 = robotoTextView;
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_pre_state_main_search_hint));
                this.f63220J0.setTextColor(AbstractC23136l9.m118645D(this.f88760a0.getContext(), AbstractC16801x.search_tab_text_colors));
                this.f63220J0.setTextSize(1, 16.0f);
                this.f63220J0.setGravity(16);
                this.f63220J0.setMaxLines(1);
                this.f63220J0.setEllipsize(TextUtils.TruncateAt.END);
                this.f63220J0.setLayoutParams(layoutParams2);
                linearLayout.addView(this.f63220J0);
                this.f63220J0.setOnClickListener(this);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams3.gravity = 16;
                this.f88760a0.addView(linearLayout, layoutParams3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        C24609a c24609a;
        super.mo37584UJ();
        C23744a.m124114c().m124115b(this, 36);
        C23744a.m124114c().m124115b(this, 45);
        C23744a.m124114c().m124115b(this, 44);
        C23744a.m124114c().m124115b(this, 60);
        C23744a.m124114c().m124115b(this, 3003);
        C23744a.m124114c().m124115b(this, 6003);
        C23744a.m124114c().m124115b(this, 5200);
        C23744a.m124114c().m124115b(this, 6024);
        C23744a.m124114c().m124115b(this, 6025);
        C23744a.m124114c().m124115b(this, 6026);
        C23744a.m124114c().m124115b(this, 8101);
        C23744a.m124114c().m124115b(this, 6099);
        C23744a.m124114c().m124115b(this, 65);
        m67624bM();
        AbstractC26084s.m134256d(this);
        AbstractC21289a.Companion.m110248b().set(true);
        if (!m92692wK().mo35576n3() && (c24609a = this.f63246h1) != null) {
            c24609a.m128104c(m92692wK().mo35575n1(), new ExecutorC2100e0(), this.f63247i1);
        }
    }

    /* renamed from: UL */
    protected void m67685UL() {
        AbstractC23647d.m123907q("20000", "");
        if (AbstractC23309i.m122613ye()) {
            m67671HN();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f63224L0 >= 1000) {
                if (currentTimeMillis - this.f63222K0 <= 2000) {
                    m67671HN();
                    this.f63222K0 = 0L;
                } else {
                    this.f63222K0 = System.currentTimeMillis();
                }
            }
        }
        AbstractC23647d.m123893c();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m67711tN(this.f63226N0);
        C23744a.m124114c().m124117e(this, 36);
        C23744a.m124114c().m124117e(this, 45);
        C23744a.m124114c().m124117e(this, 44);
        C23744a.m124114c().m124117e(this, 60);
        C23744a.m124114c().m124117e(this, 3003);
        C23744a.m124114c().m124117e(this, 6003);
        C23744a.m124114c().m124117e(this, 5200);
        C23744a.m124114c().m124117e(this, 6024);
        C23744a.m124114c().m124117e(this, 6025);
        C23744a.m124114c().m124117e(this, 6026);
        C23744a.m124114c().m124117e(this, 8101);
        C23744a.m124114c().m124117e(this, 6099);
        C23744a.m124114c().m124117e(this, 65);
        AbstractC26084s.m134247D(this);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        m92676n2().mo35554O(32);
        try {
            ZaloView m67692fM = m67692fM(m67696kM());
            if (m67692fM != null && (m67692fM instanceof TimelineView)) {
                ((TimelineView) m67692fM).m85417xQ(z11, z12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XL */
    void m67686XL() {
        if (C21927m.m114302u().m114367y() != null && C21927m.m114302u().m114367y().size() > 0) {
            Iterator it = C21927m.m114302u().m114367y().iterator();
            while (it.hasNext()) {
                C28023b6.m141250h0().m141398z(((C32035n7) it.next()).m154511b());
            }
        }
    }

    /* renamed from: YL */
    public void m67687YL() {
        C20830x0.f102390a.m108872q(0);
        AbstractC20833z.m108895J();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("UPDATE_NAVIGATION_BAR_FLAGSUPDATE_NAVIGATION_BAR_FLAGS", false)) {
            SystemUIUtils.m89445j(this, SystemUIUtils.m89443f(), SystemUIUtils.m89443f());
        }
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(0);
        m89412p.m89426U(Boolean.valueOf(C23212s8.m119603k()));
        m89412p.m89430n(new InterfaceC27367c() { // from class: o70.y

            /* renamed from: q */
            public final /* synthetic */ MainTabFrameLayout f116494q;

            /* renamed from: r */
            public final /* synthetic */ int f116495r;

            public /* synthetic */ C24110y(MainTabFrameLayout mainTabFrameLayout, int i11) {
                r2 = mainTabFrameLayout;
                r3 = i11;
            }

            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                MainTabView.this.m67613WM(r2, r3, c1421e);
            }
        });
    }

    /* renamed from: ZL */
    public void m67688ZL() {
        ZaloView m67692fM;
        int m125971o = C24099q0.m125958k().m125971o();
        if (this.f63251m1 == m125971o && (m67692fM = m67692fM(m125971o)) != null && (m67692fM instanceof MessagesView)) {
            m67713uN(((MessagesView) m67692fM).m68379rO(false, false));
        }
    }

    /* renamed from: cM */
    public void m67689cM() {
        ZaloView m67692fM;
        if (this.f63251m1 == C24099q0.m125958k().m125971o() && (m67692fM = m67692fM(C24099q0.m125958k().m125971o())) != null && (m67692fM instanceof MessagesView)) {
            ((MessagesView) m67692fM).m68381sO();
        }
    }

    /* renamed from: dM */
    public void m67690dM(boolean z11) {
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
        if (viewPagerCustomSwipeable != null) {
            viewPagerCustomSwipeable.setSwipeEnabled(z11);
        }
    }

    /* renamed from: eM */
    public void m67691eM(boolean z11) {
        RedDotImageButton redDotImageButton = this.f63217H1;
        if (redDotImageButton != null) {
            if (z11) {
                redDotImageButton.clearColorFilter();
            } else {
                redDotImageButton.setColorFilter(C23212s8.m119607o(redDotImageButton.getContext(), AbstractC16781w.NotificationReddot));
            }
        }
    }

    /* renamed from: fM */
    public ZaloView m67692fM(int i11) {
        C24105t0 c24105t0 = this.f63206C0;
        if (c24105t0 != null && i11 >= 0 && i11 < c24105t0.mo35335g()) {
            return this.f63206C0.m93128x(i11);
        }
        return null;
    }

    /* renamed from: gM */
    public boolean m67693gM() {
        ZaloView zaloView;
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null || actionBar.getActionMode() == null || !this.f88760a0.m92718m()) {
            return false;
        }
        this.f88760a0.m92716k();
        if (!this.f63232T0 && !this.f63233U0) {
            AbstractC23647d.m123907q("2630", "");
            AbstractC23647d.m123893c();
        }
        this.f63232T0 = false;
        this.f63233U0 = false;
        if (this.f63251m1 == C24099q0.m125958k().m125971o()) {
            zaloView = m67692fM(C24099q0.m125958k().m125971o());
        } else {
            zaloView = null;
        }
        if (zaloView != null && (zaloView instanceof MessagesView)) {
            this.f63204B0.setSwipeEnabled(true);
            if (!this.f63250l1) {
                ((MessagesView) zaloView).m68330MQ();
            }
            this.f63250l1 = false;
        }
        return true;
    }

    /* renamed from: iN */
    boolean m67694iN() {
        C32206z9 c32206z9;
        int i11;
        int i12;
        try {
            if (AbstractC23304d.f113408l2 && (c32206z9 = AbstractC23304d.f113412m2) != null) {
                long mo124311f = C23793c.m124316k().mo124311f();
                long j11 = c32206z9.f148559e;
                if (j11 > 0) {
                    long j12 = c32206z9.f148560f;
                    if (j12 > 0 && j11 <= j12 && j11 <= mo124311f && mo124311f <= j12) {
                        if (c32206z9.f148561g != -1) {
                            if (C23793c.m124316k().mo124311f() - AbstractC23309i.m121002H6() < c32206z9.f148561g) {
                            }
                        }
                        if (c32206z9.f148562h != -1 && c32206z9.f148563i != -1) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            int i13 = calendar.get(11);
                            if (i13 >= c32206z9.f148562h) {
                                if (i13 >= c32206z9.f148563i) {
                                }
                            }
                        }
                        int i14 = c32206z9.f148564j;
                        if (i14 == -1 || (i11 = c32206z9.f148565k) == -1 || ((i12 = CoreUtility.f89236l) >= i14 && i12 <= i11)) {
                            int m118267a = C23055e5.m118267a(MainApplication.getAppContext());
                            int i15 = c32206z9.f148566l;
                            if ((i15 != 1 || m118267a == 1) && (i15 != 2 || m118267a == 2 || m118267a == 3 || m118267a == 4)) {
                                Intent m82773lR = PopupZView.m82773lR(MainApplication.getAppContext(), 0, c32206z9.f148558d, null);
                                AbstractC23309i.m121916fr(C23793c.m124316k().mo124311f());
                                m92662fJ().m93069k2(PopupZView.class, m82773lR.getExtras(), 2, true);
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: jN */
    void m67695jN() {
        try {
            m67707rN();
            AbstractC23136l9.m118678T0((ZaloActivity) m92676n2());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63200L1, e11);
            finish();
        }
    }

    /* renamed from: kM */
    public int m67696kM() {
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
        if (viewPagerCustomSwipeable != null) {
            return viewPagerCustomSwipeable.getCurrentItem();
        }
        return -1;
    }

    /* renamed from: kN */
    public void m67697kN() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.l
            public /* synthetic */ RunnableC24088l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.this.m67577IM();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* renamed from: mM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    long m67698mM(boolean z11) {
        long j11;
        int m122463uc;
        long j12 = 28800;
        long j13 = 604800;
        int i11 = 3;
        int i12 = 4;
        try {
            String m121524Va = AbstractC23309i.m121524Va();
            if (!TextUtils.isEmpty(m121524Va)) {
                JSONObject jSONObject = new JSONObject(m121524Va);
                j11 = jSONObject.optLong("schedule_short_interval", 28800L);
                try {
                    j13 = jSONObject.optLong("schedule_long_interval", 604800L);
                    i11 = jSONObject.optInt("max_short_time", 3);
                    i12 = jSONObject.optInt("max_long_time", 4);
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    m122463uc = AbstractC23309i.m122463uc();
                    int i13 = 1;
                    int m122016id = AbstractC23309i.m122016id() + 1;
                    if (m122463uc != 0) {
                    }
                    if (z11) {
                    }
                    return System.currentTimeMillis() + (j12 * 1000);
                }
            } else {
                j11 = 28800;
            }
        } catch (Exception e12) {
            e = e12;
            j11 = 28800;
        }
        m122463uc = AbstractC23309i.m122463uc();
        int i132 = 1;
        int m122016id2 = AbstractC23309i.m122016id() + 1;
        if (m122463uc != 0) {
            if (m122016id2 > i11) {
                j12 = j13;
                m122463uc = 1;
            } else {
                i132 = m122016id2;
                j12 = j11;
            }
        } else {
            if (m122463uc == 1) {
                if (m122016id2 > i12) {
                    m122463uc = 0;
                    j12 = j11;
                } else {
                    j12 = j13;
                }
            }
            i132 = m122016id2;
        }
        if (z11) {
            AbstractC23309i.m120956Fy(i132);
            AbstractC23309i.m121103Jx(m122463uc);
        }
        return System.currentTimeMillis() + (j12 * 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x025f A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0675 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0363 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05d8 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05e9 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05f8 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05ff A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0606 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x060d A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0614 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x061b A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0622 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0180 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0186 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0231 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x0028, B:10:0x0034, B:11:0x003c, B:13:0x0048, B:15:0x004e, B:16:0x005b, B:18:0x006a, B:20:0x006e, B:23:0x0080, B:25:0x0083, B:27:0x0091, B:29:0x0095, B:32:0x00a6, B:34:0x00a9, B:36:0x00b3, B:38:0x00c1, B:40:0x00c5, B:43:0x00d6, B:45:0x00d9, B:47:0x00e3, B:49:0x00f1, B:51:0x00f5, B:54:0x0106, B:56:0x0109, B:58:0x0113, B:60:0x011f, B:61:0x0126, B:62:0x0129, B:65:0x013d, B:67:0x0149, B:69:0x0152, B:70:0x016a, B:71:0x0197, B:73:0x01a5, B:75:0x01a9, B:77:0x01b5, B:78:0x01bb, B:79:0x01c5, B:81:0x01d3, B:83:0x01d7, B:86:0x01e9, B:88:0x01ec, B:90:0x01fa, B:92:0x01fe, B:95:0x020f, B:97:0x0212, B:99:0x0231, B:100:0x0234, B:103:0x0245, B:106:0x0253, B:108:0x025f, B:110:0x0274, B:111:0x027a, B:113:0x02a0, B:115:0x02ae, B:116:0x02bc, B:118:0x02c6, B:120:0x02cf, B:122:0x02eb, B:123:0x02d3, B:124:0x02f4, B:126:0x030c, B:127:0x030f, B:129:0x0313, B:130:0x0316, B:132:0x031a, B:133:0x031d, B:135:0x0321, B:136:0x0324, B:138:0x0328, B:139:0x032b, B:141:0x032f, B:142:0x0332, B:144:0x0336, B:145:0x0339, B:147:0x033d, B:148:0x0340, B:150:0x0344, B:151:0x0347, B:155:0x035e, B:156:0x0671, B:158:0x0675, B:160:0x0681, B:162:0x068e, B:163:0x069c, B:165:0x06a9, B:166:0x06b6, B:172:0x02a8, B:174:0x0278, B:175:0x0363, B:177:0x036f, B:179:0x037f, B:180:0x0390, B:182:0x0396, B:183:0x03bb, B:185:0x03bf, B:186:0x03c2, B:188:0x03c6, B:189:0x03c9, B:191:0x03cd, B:192:0x03d0, B:194:0x03d4, B:195:0x03d7, B:197:0x03db, B:198:0x03de, B:200:0x03e2, B:201:0x03e5, B:203:0x03e9, B:204:0x03ec, B:205:0x039c, B:207:0x03a4, B:208:0x03aa, B:210:0x03b0, B:211:0x03b6, B:212:0x03f6, B:214:0x0402, B:216:0x0408, B:219:0x0413, B:221:0x041b, B:222:0x041e, B:224:0x0422, B:225:0x0425, B:227:0x0429, B:228:0x042c, B:230:0x0430, B:233:0x043c, B:235:0x043f, B:237:0x0443, B:238:0x0446, B:240:0x044a, B:241:0x044d, B:243:0x0451, B:244:0x0454, B:246:0x0458, B:254:0x0471, B:256:0x046e, B:258:0x04a5, B:261:0x04b3, B:263:0x04b7, B:264:0x04ba, B:266:0x04be, B:267:0x04c1, B:269:0x04c5, B:270:0x04c8, B:272:0x04cc, B:273:0x04cf, B:275:0x04d3, B:276:0x04d6, B:278:0x04da, B:279:0x04dd, B:281:0x04e1, B:289:0x04fa, B:291:0x04f7, B:292:0x050c, B:294:0x0516, B:296:0x0522, B:298:0x0529, B:299:0x052c, B:301:0x0530, B:302:0x0533, B:304:0x0537, B:305:0x053a, B:307:0x053e, B:308:0x0541, B:310:0x0545, B:311:0x0548, B:313:0x054c, B:314:0x054f, B:316:0x0553, B:317:0x0556, B:318:0x058a, B:319:0x0592, B:321:0x05b9, B:323:0x05c3, B:324:0x05ce, B:326:0x05d8, B:327:0x05df, B:329:0x05e9, B:330:0x05f4, B:332:0x05f8, B:333:0x05fb, B:335:0x05ff, B:336:0x0602, B:338:0x0606, B:339:0x0609, B:341:0x060d, B:342:0x0610, B:344:0x0614, B:345:0x0617, B:347:0x061b, B:348:0x061e, B:350:0x0622, B:361:0x0634, B:362:0x0638, B:365:0x0645, B:366:0x0649, B:369:0x0656, B:370:0x065a, B:373:0x0667, B:374:0x066b, B:375:0x066e, B:376:0x0174, B:378:0x0180, B:379:0x0186, B:381:0x0192, B:382:0x0024, B:248:0x045b, B:250:0x0460, B:252:0x0464, B:283:0x04e4, B:285:0x04e9, B:287:0x04ed), top: B:2:0x0002, inners: #0, #1 }] */
    /* renamed from: mN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m67699mN() {
        int currentItem;
        ZaloView m67692fM;
        ZaloView m67692fM2;
        ZaloView m67692fM3;
        ZaloView m67692fM4;
        ZaloView m67692fM5;
        ActionBar actionBar;
        View view;
        ActionBarMenuItem actionBarMenuItem;
        View view2;
        View view3;
        ActionBarMenuItem actionBarMenuItem2;
        View view4;
        View view5;
        boolean z11;
        int i11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        ZaloView m67692fM6;
        boolean z15;
        boolean z16;
        boolean z17;
        try {
            m67693gM();
            this.f63229Q0.removeCallbacks(this.f63230R0);
            this.f63234V0 = false;
            if (this.f63252n1 == -1) {
                if (this.f63251m1 != C24099q0.m125958k().m125971o()) {
                }
                currentItem = this.f63204B0.getCurrentItem();
                this.f63251m1 = currentItem;
                if (currentItem != this.f63252n1) {
                    this.f63219I1.m74694J();
                    m67637hM();
                }
                if (this.f63252n1 == C24099q0.m125958k().m125972p() && this.f63252n1 != this.f63251m1) {
                    AbstractC25636f.m132476f();
                    C21933s.m114404I().m114477l0();
                    AbstractC23088h5.m118431l();
                }
                m67692fM = m67692fM(C24099q0.m125958k().m125977u());
                if (m67692fM != null && (m67692fM instanceof TimelineView)) {
                    TimelineView timelineView = (TimelineView) m67692fM;
                    if (this.f63251m1 != C24099q0.m125958k().m125977u()) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    timelineView.m85377CQ(z17);
                }
                m67692fM2 = m67692fM(C24099q0.m125958k().m125971o());
                if (m67692fM2 != null && (m67692fM2 instanceof MessagesView)) {
                    MessagesView messagesView = (MessagesView) m67692fM2;
                    if (this.f63251m1 != C24099q0.m125958k().m125971o()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    messagesView.m68306BQ(z16);
                }
                if (C24099q0.m125958k().m125962c() && (m67692fM6 = m67692fM(C24099q0.m125958k().m125967h())) != null && (m67692fM6 instanceof GroupTabParentView)) {
                    GroupTabParentView groupTabParentView = (GroupTabParentView) m67692fM6;
                    if (this.f63251m1 != C24099q0.m125958k().m125967h()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    groupTabParentView.m67761sM(z15);
                }
                if (C24099q0.m125958k().m125963d()) {
                    ZaloView m67692fM7 = m67692fM(C24099q0.m125958k().m125969m());
                    if (m67692fM7 != null && (m67692fM7 instanceof TabMeView)) {
                        TabMeView tabMeView = (TabMeView) m67692fM7;
                        if (this.f63251m1 == C24099q0.m125958k().m125969m()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        tabMeView.m67963sN(z14);
                    }
                    if (C16888a.m90216h().m90244o() && this.f63251m1 == C24099q0.m125958k().m125969m()) {
                        C16888a.m90216h().m90220C(true);
                    }
                    m67679ON();
                }
                if (!C24099q0.m125958k().m125962c() && this.f63251m1 == C24099q0.m125958k().m125967h()) {
                    AbstractC23647d.m123897g("8011001");
                    if (AbstractC28025b8.m141465u("tip.grouptab")) {
                        AbstractC23304d.f113292J2 = true;
                        Intent intent = new Intent();
                        intent.setAction("com.zing.zalo.ACTION_SHOW_GROUP_SUBTAB");
                        intent.putExtra("tabIndex", 0);
                        C28685a.m143693b(MainApplication.getAppContext()).m143696d(intent);
                    }
                    AbstractC28025b8.m141442M("tip.grouptab");
                    m67682RL("tip.any");
                    m67680PL("tip.any");
                } else if (this.f63251m1 != C24099q0.m125958k().m125970n()) {
                    AbstractC28025b8.m141442M("tip.moretab");
                } else if (this.f63251m1 == C24099q0.m125958k().m125966g()) {
                    AbstractC28025b8.m141442M("tip.discoverytab");
                }
                m67692fM3 = m67692fM(C24099q0.m125958k().m125972p());
                if (m67692fM3 != null && (m67692fM3 instanceof ContactGroupMyPagesView)) {
                    if (this.f63251m1 == C24099q0.m125958k().m125972p()) {
                        ((ContactGroupMyPagesView) m67692fM3).m67738oM(false);
                    } else {
                        ((ContactGroupMyPagesView) m67692fM3).m67738oM(true);
                        AbstractC23647d.m123897g("5801086");
                    }
                }
                m67692fM4 = m67692fM(C24099q0.m125958k().m125970n());
                if (m67692fM4 != null && (m67692fM4 instanceof MoreTabView)) {
                    MoreTabView moreTabView = (MoreTabView) m67692fM4;
                    if (this.f63251m1 != C24099q0.m125958k().m125970n()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    moreTabView.m68039PM(z13);
                }
                m67692fM5 = m67692fM(C24099q0.m125958k().m125966g());
                if (m67692fM5 != null && (m67692fM5 instanceof MoreTabView)) {
                    MoreTabView moreTabView2 = (MoreTabView) m67692fM5;
                    if (this.f63251m1 != C24099q0.m125958k().m125966g()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    moreTabView2.m68039PM(z12);
                }
                m67684SL();
                m67705qN();
                C23744a.m124114c().m124116d(12000, Integer.valueOf(m67696kM()));
                actionBar = this.f88760a0;
                if (actionBar != null) {
                    actionBar.setVisibility(0);
                }
                int i12 = 8;
                if (this.f63251m1 != C24099q0.m125958k().m125971o() && this.f63251m1 != C24099q0.m125958k().m125967h()) {
                    if (this.f63251m1 != C24099q0.m125958k().m125972p()) {
                        AbstractC23647d.m123907q("3000", "");
                        if (m67692fM(C24099q0.m125958k().m125972p()) instanceof ContactGroupMyPagesView) {
                            m67675LN();
                        } else {
                            this.f63234V0 = true;
                        }
                        TextView textView = (TextView) this.f63208D0.m68753k(C24099q0.m125958k().m125972p()).findViewById(AbstractC6918a0.numnotification);
                        View m68752g = this.f63208D0.m68752g(C24099q0.m125958k().m125972p());
                        if ((textView != null && textView.getVisibility() == 0) || (m68752g != null && m68752g.getVisibility() == 0)) {
                            C23744a.m124114c().m124116d(6085, new Object[0]);
                            AbstractC23181q.m119430c();
                        }
                        if (!C24099q0.m125958k().m125962c()) {
                            AbstractC23647d.m123897g("8011001");
                            if (AbstractC28025b8.m141465u("tip.grouptab") || AbstractC23304d.f113292J2) {
                                AbstractC23304d.f113292J2 = true;
                                Intent intent2 = new Intent();
                                intent2.setAction("com.zing.zalo.ACTION_SHOW_GROUP_SUBTAB");
                                intent2.putExtra("tabIndex", 0);
                                C28685a.m143693b(MainApplication.getAppContext()).m143696d(intent2);
                            }
                            AbstractC28025b8.m141442M("tip.grouptab");
                            m67682RL("tip.any");
                            m67680PL("tip.any");
                        }
                        AbstractC23181q.m119429b();
                        C28023b6.m141250h0().m141274C();
                        C21927m.m114302u().m114356r0();
                        m67686XL();
                        ActionBarMenuItem actionBarMenuItem3 = this.f63261w1;
                        if (actionBarMenuItem3 != null) {
                            actionBarMenuItem3.setVisibility(8);
                        }
                        View view6 = this.f63256r1;
                        if (view6 != null) {
                            view6.setVisibility(0);
                        }
                        View view7 = this.f63255q1;
                        if (view7 != null) {
                            view7.setVisibility(8);
                        }
                        ActionBarMenuItem actionBarMenuItem4 = this.f63260v1;
                        if (actionBarMenuItem4 != null) {
                            actionBarMenuItem4.setVisibility(8);
                        }
                        View view8 = this.f63258t1;
                        if (view8 != null) {
                            view8.setVisibility(8);
                        }
                        View view9 = this.f63257s1;
                        if (view9 != null) {
                            view9.setVisibility(8);
                        }
                        ActionBarMenuItem actionBarMenuItem5 = this.f63260v1;
                        if (actionBarMenuItem5 != null) {
                            actionBarMenuItem5.setVisibility(8);
                        }
                        View view10 = this.f63257s1;
                        if (view10 != null) {
                            view10.setVisibility(8);
                        }
                        View view11 = this.f63259u1;
                        if (view11 != null) {
                            view11.setVisibility(8);
                        }
                        AbstractC23647d.m123893c();
                        C0815e1 m2075D = C0815e1.m2075D();
                        String valueOf = String.valueOf(1);
                        if (m67642jM() > 0) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        m2075D.m2095O(valueOf, "1", str, "");
                    } else if (this.f63251m1 == C24099q0.m125958k().m125977u()) {
                        if (m67692fM(C24099q0.m125958k().m125977u()) instanceof TimelineView) {
                            ((TimelineView) m67692fM(C24099q0.m125958k().m125977u())).m85415wQ();
                        }
                        if (C20830x0.m108856h() > 0) {
                            AbstractC23647d.m123906p("400003");
                        } else {
                            C20830x0 c20830x0 = C20830x0.f102390a;
                            if (c20830x0.m108858a() > 0) {
                                AbstractC23647d.m123906p("400002");
                            } else if (c20830x0.m108863f() > 0) {
                                AbstractC23647d.m123906p("400004");
                            } else {
                                AbstractC23647d.m123906p("400001");
                            }
                        }
                        ActionBarMenuItem actionBarMenuItem6 = this.f63261w1;
                        if (actionBarMenuItem6 != null) {
                            actionBarMenuItem6.setVisibility(8);
                        }
                        View view12 = this.f63256r1;
                        if (view12 != null) {
                            view12.setVisibility(8);
                        }
                        View view13 = this.f63255q1;
                        if (view13 != null) {
                            view13.setVisibility(0);
                        }
                        ActionBarMenuItem actionBarMenuItem7 = this.f63260v1;
                        if (actionBarMenuItem7 != null) {
                            actionBarMenuItem7.setVisibility(8);
                        }
                        View view14 = this.f63258t1;
                        if (view14 != null) {
                            view14.setVisibility(8);
                        }
                        View view15 = this.f63257s1;
                        if (view15 != null) {
                            view15.setVisibility(0);
                        }
                        View view16 = this.f63259u1;
                        if (view16 != null) {
                            view16.setVisibility(8);
                        }
                        AbstractC23647d.m123893c();
                        AbstractC23647d.m123897g("4000");
                    } else if (this.f63251m1 == C24099q0.m125958k().m125966g()) {
                        MainTabView m67645lM = m67645lM();
                        if (m67645lM != null && m67645lM.m67712uM(this.f63251m1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean m67659vM = m67659vM();
                        ActionBarMenuItem actionBarMenuItem8 = this.f63261w1;
                        if (actionBarMenuItem8 != null) {
                            actionBarMenuItem8.setVisibility(8);
                        }
                        View view17 = this.f63256r1;
                        if (view17 != null) {
                            view17.setVisibility(8);
                        }
                        View view18 = this.f63255q1;
                        if (view18 != null) {
                            view18.setVisibility(8);
                        }
                        ActionBar actionBar2 = this.f88760a0;
                        if (actionBar2 != null) {
                            if (C20793f.f102166a.m108492b()) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            actionBar2.setVisibility(i11);
                        }
                        ActionBarMenuItem actionBarMenuItem9 = this.f63260v1;
                        if (actionBarMenuItem9 != null) {
                            actionBarMenuItem9.setVisibility(8);
                        }
                        View view19 = this.f63258t1;
                        if (view19 != null) {
                            view19.setVisibility(0);
                        }
                        View view20 = this.f63257s1;
                        if (view20 != null) {
                            view20.setVisibility(8);
                        }
                        View view21 = this.f63259u1;
                        if (view21 != null) {
                            view21.setVisibility(8);
                        }
                        try {
                            m67705qN();
                            if (m67692fM4 != null && (m67692fM4 instanceof MoreTabView)) {
                                ((MoreTabView) m67692fM4).m68043UM();
                                m67705qN();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        C0815e1.m2075D().m2100V(new C23648e(21, "social_tab_discovery", 0, "tab_discovery_open", new String[0]).m123926s(Boolean.toString(z11), Boolean.toString(m67659vM), Boolean.toString(z11)), false);
                    } else if (this.f63251m1 == C24099q0.m125958k().m125970n()) {
                        ActionBarMenuItem actionBarMenuItem10 = this.f63261w1;
                        if (actionBarMenuItem10 != null) {
                            actionBarMenuItem10.setVisibility(8);
                        }
                        View view22 = this.f63256r1;
                        if (view22 != null) {
                            view22.setVisibility(8);
                        }
                        View view23 = this.f63255q1;
                        if (view23 != null) {
                            view23.setVisibility(8);
                        }
                        ActionBarMenuItem actionBarMenuItem11 = this.f63260v1;
                        if (actionBarMenuItem11 != null) {
                            actionBarMenuItem11.setVisibility(0);
                        }
                        View view24 = this.f63258t1;
                        if (view24 != null) {
                            view24.setVisibility(0);
                        }
                        View view25 = this.f63257s1;
                        if (view25 != null) {
                            view25.setVisibility(8);
                        }
                        View view26 = this.f63259u1;
                        if (view26 != null) {
                            view26.setVisibility(8);
                        }
                        try {
                            m67705qN();
                            if (m67692fM4 != null && (m67692fM4 instanceof MoreTabView)) {
                                ((MoreTabView) m67692fM4).m68043UM();
                                m67705qN();
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        C32017m4.m154326S().m154359e0("5000");
                        C2556d.m12981o().m12991P("7");
                    } else if (C24099q0.m125958k().m125963d() && this.f63251m1 == C24099q0.m125958k().m125969m()) {
                        m67679ON();
                        ActionBarMenuItem actionBarMenuItem12 = this.f63261w1;
                        if (actionBarMenuItem12 != null) {
                            actionBarMenuItem12.setVisibility(8);
                        }
                        View view27 = this.f63256r1;
                        if (view27 != null) {
                            view27.setVisibility(8);
                        }
                        View view28 = this.f63255q1;
                        if (view28 != null) {
                            view28.setVisibility(8);
                        }
                        ActionBarMenuItem actionBarMenuItem13 = this.f63260v1;
                        if (actionBarMenuItem13 != null) {
                            actionBarMenuItem13.setVisibility(0);
                        }
                        View view29 = this.f63258t1;
                        if (view29 != null) {
                            view29.setVisibility(8);
                        }
                        View view30 = this.f63257s1;
                        if (view30 != null) {
                            view30.setVisibility(8);
                        }
                        View view31 = this.f63259u1;
                        if (view31 != null) {
                            view31.setVisibility(8);
                        }
                        C0815e1.m2075D().m2100V(new C23648e(18, "social_tab_me", 0, "tab_me_open", new String[0]).m123926s(Boolean.toString(m67645lM().m67712uM(C24099q0.m125958k().m125969m()))), false);
                    } else {
                        AbstractC23647d.m123907q("5000", "");
                        AbstractC23647d.m123893c();
                    }
                    if (m67692fM instanceof TimelineView) {
                        if (this.f63251m1 == C24099q0.m125958k().m125977u()) {
                            if (((TimelineView) m67692fM).m85412rO().m133397G0() != null) {
                                ((TimelineView) m67692fM).m85412rO().m133397G0().m104088S(true);
                            }
                        } else if (((TimelineView) m67692fM).m85412rO().m133397G0() != null) {
                            ((TimelineView) m67692fM).m85412rO().m133397G0().m104088S(false);
                        }
                    }
                    this.f63228P0.removeMessages(1);
                    this.f63228P0.sendEmptyMessageDelayed(1, 500L);
                    C11891a.m66070p0(this.f63251m1);
                }
                AbstractC23647d.m123907q("2000", "");
                C28023b6.m141250h0().m141277D();
                C28023b6.m141250h0().m141280E();
                AbstractC23647d.m123893c();
                C23744a.m124114c().m124116d(10, new Object[0]);
                if (AbstractC23195r2.f112444f != AbstractC23195r2.f112439a && !TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                    C23744a.m124114c().m124116d(6077, new Object[0]);
                }
                if (C19669z.m103146Y().m103191E()) {
                    C19669z.m103146Y().m103198O0();
                }
                if (C19669z.m103146Y().m103190D()) {
                    C23744a.m124114c().m124116d(106, new Object[0]);
                }
                view = this.f63258t1;
                if (view != null) {
                    view.setVisibility(8);
                }
                actionBarMenuItem = this.f63261w1;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(0);
                }
                view2 = this.f63256r1;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                view3 = this.f63255q1;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                actionBarMenuItem2 = this.f63260v1;
                if (actionBarMenuItem2 != null) {
                    actionBarMenuItem2.setVisibility(8);
                }
                view4 = this.f63257s1;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                view5 = this.f63259u1;
                if (view5 != null) {
                    int i13 = this.f63215G1;
                    if (i13 != 1 && i13 != 2) {
                        if (i13 != 4 && i13 != 5) {
                            if (i13 != 6) {
                                if (i13 != 7) {
                                    view5.setVisibility(8);
                                } else {
                                    if (this.f63251m1 == C24099q0.m125958k().m125971o()) {
                                        i12 = 0;
                                    }
                                    view5.setVisibility(i12);
                                }
                            } else {
                                if (this.f63251m1 == C24099q0.m125958k().m125971o()) {
                                    i12 = 0;
                                }
                                view5.setVisibility(i12);
                            }
                        } else {
                            if (this.f63251m1 == C24099q0.m125958k().m125971o()) {
                                i12 = 0;
                            }
                            view5.setVisibility(i12);
                        }
                    } else {
                        view5.setVisibility(0);
                    }
                }
                m67612WL();
                if (m67692fM instanceof TimelineView) {
                }
                this.f63228P0.removeMessages(1);
                this.f63228P0.sendEmptyMessageDelayed(1, 500L);
                C11891a.m66070p0(this.f63251m1);
            }
            this.f63252n1 = this.f63251m1;
            currentItem = this.f63204B0.getCurrentItem();
            this.f63251m1 = currentItem;
            if (currentItem != this.f63252n1) {
            }
            if (this.f63252n1 == C24099q0.m125958k().m125972p()) {
                AbstractC25636f.m132476f();
                C21933s.m114404I().m114477l0();
                AbstractC23088h5.m118431l();
            }
            m67692fM = m67692fM(C24099q0.m125958k().m125977u());
            if (m67692fM != null) {
                TimelineView timelineView2 = (TimelineView) m67692fM;
                if (this.f63251m1 != C24099q0.m125958k().m125977u()) {
                }
                timelineView2.m85377CQ(z17);
            }
            m67692fM2 = m67692fM(C24099q0.m125958k().m125971o());
            if (m67692fM2 != null) {
                MessagesView messagesView2 = (MessagesView) m67692fM2;
                if (this.f63251m1 != C24099q0.m125958k().m125971o()) {
                }
                messagesView2.m68306BQ(z16);
            }
            if (C24099q0.m125958k().m125962c()) {
                GroupTabParentView groupTabParentView2 = (GroupTabParentView) m67692fM6;
                if (this.f63251m1 != C24099q0.m125958k().m125967h()) {
                }
                groupTabParentView2.m67761sM(z15);
            }
            if (C24099q0.m125958k().m125963d()) {
            }
            if (!C24099q0.m125958k().m125962c()) {
            }
            if (this.f63251m1 != C24099q0.m125958k().m125970n()) {
            }
            m67692fM3 = m67692fM(C24099q0.m125958k().m125972p());
            if (m67692fM3 != null) {
                if (this.f63251m1 == C24099q0.m125958k().m125972p()) {
                }
            }
            m67692fM4 = m67692fM(C24099q0.m125958k().m125970n());
            if (m67692fM4 != null) {
                MoreTabView moreTabView3 = (MoreTabView) m67692fM4;
                if (this.f63251m1 != C24099q0.m125958k().m125970n()) {
                }
                moreTabView3.m68039PM(z13);
            }
            m67692fM5 = m67692fM(C24099q0.m125958k().m125966g());
            if (m67692fM5 != null) {
                MoreTabView moreTabView22 = (MoreTabView) m67692fM5;
                if (this.f63251m1 != C24099q0.m125958k().m125966g()) {
                }
                moreTabView22.m68039PM(z12);
            }
            m67684SL();
            m67705qN();
            C23744a.m124114c().m124116d(12000, Integer.valueOf(m67696kM()));
            actionBar = this.f88760a0;
            if (actionBar != null) {
            }
            int i122 = 8;
            if (this.f63251m1 != C24099q0.m125958k().m125971o()) {
                if (this.f63251m1 != C24099q0.m125958k().m125972p()) {
                }
                if (m67692fM instanceof TimelineView) {
                }
                this.f63228P0.removeMessages(1);
                this.f63228P0.sendEmptyMessageDelayed(1, 500L);
                C11891a.m66070p0(this.f63251m1);
            }
            AbstractC23647d.m123907q("2000", "");
            C28023b6.m141250h0().m141277D();
            C28023b6.m141250h0().m141280E();
            AbstractC23647d.m123893c();
            C23744a.m124114c().m124116d(10, new Object[0]);
            if (AbstractC23195r2.f112444f != AbstractC23195r2.f112439a) {
                C23744a.m124114c().m124116d(6077, new Object[0]);
            }
            if (C19669z.m103146Y().m103191E()) {
            }
            if (C19669z.m103146Y().m103190D()) {
            }
            view = this.f63258t1;
            if (view != null) {
            }
            actionBarMenuItem = this.f63261w1;
            if (actionBarMenuItem != null) {
            }
            view2 = this.f63256r1;
            if (view2 != null) {
            }
            view3 = this.f63255q1;
            if (view3 != null) {
            }
            actionBarMenuItem2 = this.f63260v1;
            if (actionBarMenuItem2 != null) {
            }
            view4 = this.f63257s1;
            if (view4 != null) {
            }
            view5 = this.f63259u1;
            if (view5 != null) {
            }
            m67612WL();
            if (m67692fM instanceof TimelineView) {
            }
            this.f63228P0.removeMessages(1);
            this.f63228P0.sendEmptyMessageDelayed(1, 500L);
            C11891a.m66070p0(this.f63251m1);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: oM */
    View m67700oM(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1877392726:
                if (str.equals("tip.tabmessage.qr")) {
                    c11 = 0;
                    break;
                }
                break;
            case -313636020:
                if (str.equals("tip.tabme.ba.onboard")) {
                    c11 = 1;
                    break;
                }
                break;
            case 65772120:
                if (str.equals("tip.discoverytab")) {
                    c11 = 2;
                    break;
                }
                break;
            case 539910052:
                if (str.equals("tip.tabme.graceperiod.zcloud")) {
                    c11 = 3;
                    break;
                }
                break;
            case 820540585:
                if (str.equals("tip.grouptab")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1355137304:
                if (str.equals("tip.groupcall.maintab")) {
                    c11 = 5;
                    break;
                }
                break;
            case 2081312205:
                if (str.equals("tip.moretab")) {
                    c11 = 6;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                if (this.f63215G1 == 6) {
                    return this.f63259u1;
                }
                return null;
            case 1:
                if (C24099q0.m125958k().m125963d() && this.f63251m1 != C24099q0.m125958k().m125969m() && C24099q0.m125958k().m125969m() >= 0) {
                    return this.f63208D0.m68753k(C24099q0.m125958k().m125969m());
                }
                return null;
            case 2:
                if (C24099q0.m125958k().m125966g() >= 0 && this.f63208D0.m68753k(C24099q0.m125958k().m125966g()) != null) {
                    return this.f63208D0.m68753k(C24099q0.m125958k().m125966g());
                }
                return null;
            case 3:
                if (C24099q0.m125958k().m125963d() && C24099q0.m125958k().m125969m() >= 0 && this.f63208D0.m68753k(C24099q0.m125958k().m125969m()) != null) {
                    return this.f63208D0.m68753k(C24099q0.m125958k().m125969m());
                }
                return null;
            case 4:
                if (C24099q0.m125958k().m125962c()) {
                    return this.f63208D0.m68753k(C24099q0.m125958k().m125967h());
                }
                return this.f63208D0.m68753k(C24099q0.m125958k().m125972p());
            case 5:
                if (this.f63215G1 == 7) {
                    return this.f63259u1;
                }
                return null;
            case 6:
                if (C24099q0.m125958k().m125970n() >= 0 && this.f63208D0.m68753k(C24099q0.m125958k().m125970n()) != null) {
                    return this.f63208D0.m68753k(C24099q0.m125958k().m125970n());
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: oN */
    public void m67701oN() {
        try {
            C23744a.m124114c().m124116d(29, new Object[0]);
            ZaloView m67692fM = m67692fM(C24099q0.m125958k().m125971o());
            if (m67692fM != null && (m67692fM instanceof MessagesView)) {
                ((MessagesView) m67692fM).m68359eO();
                ((MessagesView) m67692fM).m68326KQ();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        ZaloView m67692fM;
        try {
            super.onActivityResult(i11, i12, intent);
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
            if (viewPagerCustomSwipeable != null && (m67692fM = m67692fM(viewPagerCustomSwipeable.getCurrentItem())) != null) {
                m67692fM.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        try {
            if (view.equals(this.f63217H1) || view.equals(this.f63220J0)) {
                try {
                    this.f63242d1 = true;
                    this.f63228P0.postDelayed(new Runnable() { // from class: o70.k
                        public /* synthetic */ RunnableC24086k() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MainTabView.this.m67581KM();
                        }
                    }, 500L);
                    String str3 = "1";
                    if (!view.equals(this.f63217H1)) {
                        str = "2";
                    } else {
                        this.f63217H1.clearColorFilter();
                        AbstractC23195r2.f112444f = AbstractC23195r2.f112439a;
                        AbstractC23309i.m121390Ro(false);
                        str = "1";
                    }
                    int m67696kM = m67696kM();
                    if (m67696kM != C24099q0.m125958k().m125971o()) {
                        if (m67696kM == C24099q0.m125958k().m125972p()) {
                            str3 = "2";
                        } else if (m67696kM == C24099q0.m125958k().m125967h()) {
                            str3 = "4";
                        } else if (m67696kM == C24099q0.m125958k().m125977u()) {
                            str3 = "3";
                        } else if (m67696kM == C24099q0.m125958k().m125970n()) {
                            str3 = "5";
                        } else if (m67696kM == C24099q0.m125958k().m125969m()) {
                            str3 = "9";
                        } else if (m67696kM == C24099q0.m125958k().m125966g()) {
                            str3 = "10";
                        } else {
                            str3 = "0";
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_OPEN_SOURCE_POSITION", str3);
                    bundle.putString("EXTRA_OPEN_SOURCE_ACTION", str);
                    C13027c.m73213a(m92693xK(), bundle, str3);
                    AbstractC28025b8.m141442M("tip.contact.search");
                    m67668CN(C24099q0.m125958k().m125972p());
                    AbstractC28025b8.m141442M("tip.message.search");
                    m67668CN(C24099q0.m125958k().m125971o());
                    C13306b c13306b = this.f63219I1;
                    if (c13306b != null) {
                        ShowcaseView m74705n = c13306b.m74705n("tip.contact.search");
                        if (m74705n != null) {
                            m74705n.m74627e(1);
                        }
                        ShowcaseView m74705n2 = this.f63219I1.m74705n("tip.message.search");
                        if (m74705n2 != null) {
                            m74705n2.m74627e(1);
                        }
                    }
                    if (m67696kM() == C24099q0.m125958k().m125977u()) {
                        str2 = "400005";
                    } else if (m67696kM() == C24099q0.m125958k().m125971o()) {
                        str2 = "200001";
                    } else if (m67696kM() == C24099q0.m125958k().m125972p()) {
                        str2 = "300001";
                    } else {
                        str2 = "500001";
                    }
                    AbstractC23647d.m123897g(str2);
                    if (m67696kM() == C24099q0.m125958k().m125972p()) {
                        C0815e1.m2075D().m2095O(String.valueOf(1), "43", "", "");
                    }
                    if (m67696kM() == C24099q0.m125958k().m125969m()) {
                        C0815e1.m2075D().m2100V(new C23648e(18, "social_tab_me", 0, "tab_me_open_search", new String[0]), false);
                    }
                    if (m67696kM() == C24099q0.m125958k().m125966g()) {
                        C0815e1.m2075D().m2100V(new C23648e(21, "social_tab_discovery", 0, "tab_discovery_open_search", new String[0]), false);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent)) {
            return true;
        }
        boolean mo35576n3 = m92676n2().mo35576n3();
        if (m67696kM() == C24099q0.m125958k().m125977u()) {
            ZaloView m67692fM = m67692fM(C24099q0.m125958k().m125977u());
            if (m67692fM instanceof TimelineView) {
                TimelineView timelineView = (TimelineView) m67692fM;
                if (i11 == 4 && timelineView.m85418zO(i11, keyEvent)) {
                    return !mo35576n3;
                }
                if (timelineView.m85412rO() != null && timelineView.m85412rO().m133397G0() != null && timelineView.m85412rO().m133397G0().m104082M(i11, keyEvent)) {
                    return !mo35576n3;
                }
            }
        } else if (m67696kM() == C24099q0.m125958k().m125971o()) {
            ZaloView m67692fM2 = m67692fM(C24099q0.m125958k().m125971o());
            if (m67692fM2 instanceof MessagesView) {
                MessagesView messagesView = (MessagesView) m67692fM2;
                if (i11 == 4 && (messagesView.m68385uO() | m67693gM())) {
                    return !mo35576n3;
                }
            }
        }
        Iterator it = this.f63214G0.iterator();
        while (it.hasNext()) {
            InterfaceC24103s0 interfaceC24103s0 = (InterfaceC24103s0) it.next();
            if (interfaceC24103s0 != null && interfaceC24103s0.onKeyUp(i11, keyEvent)) {
                return true;
            }
        }
        if (i11 == 4) {
            m67685UL();
            return !mo35576n3;
        }
        return false;
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        C24105t0 c24105t0;
        boolean z11 = true;
        if (i11 != 0) {
            if (!this.f63253o1) {
                this.f63219I1.m74694J();
            }
        } else {
            this.f63228P0.sendEmptyMessageDelayed(1, 1000L);
        }
        if (i11 == 0) {
            z11 = false;
        }
        this.f63253o1 = z11;
        if (i11 == 0 && (c24105t0 = this.f63206C0) != null) {
            c24105t0.m125991C(this.f63204B0.getCurrentItem());
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(int i11, float f11, int i12) {
        int i13;
        try {
            C24105t0 c24105t0 = this.f63206C0;
            if (c24105t0 != null) {
                if (f11 == 0.0f) {
                    c24105t0.m125991C(i11);
                } else if (f11 > 0.0f && (i13 = this.f63236X0) >= 0) {
                    c24105t0.m125991C(i13);
                    this.f63236X0 = -1;
                }
            }
            if (AbstractC26683d.f126399r && m67696kM() == C24099q0.m125958k().m125971o()) {
                C23744a.m124114c().m124116d(4002, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        m67699mN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (AbstractC23034c6.m118167n(m92648SI(), AbstractC23034c6.f112032i) == 0) {
            if (i11 == 127) {
                m67676ML();
            } else if (!this.f63241c1) {
                this.f63241c1 = true;
                AbstractC0852x.m2338O(new SensitiveData("phonebook_sync_scan_in_main_tab", "phonebook_sync"));
                C31849b1.m153097n().m153106h(true);
            }
        }
        if (i11 == 100 && !AbstractC23309i.m120973Ge() && AbstractC23034c6.m118121G()) {
            C28020b3.f130648a.m141203t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01fc A[Catch: all -> 0x0049, Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0004, B:5:0x0023, B:7:0x0031, B:9:0x0037, B:11:0x003d, B:15:0x0052, B:17:0x005a, B:19:0x0092, B:21:0x0098, B:98:0x0109, B:25:0x011a, B:27:0x0120, B:29:0x0128, B:31:0x012c, B:33:0x0132, B:35:0x0138, B:37:0x0142, B:39:0x0148, B:41:0x014c, B:43:0x015e, B:44:0x0168, B:46:0x016e, B:48:0x0178, B:49:0x017b, B:50:0x0196, B:52:0x019e, B:54:0x01a3, B:56:0x01a9, B:57:0x01b5, B:59:0x01bb, B:60:0x0183, B:62:0x0193, B:101:0x0060, B:103:0x0067, B:105:0x006d, B:107:0x0073, B:109:0x007d, B:111:0x0085, B:112:0x008f, B:115:0x01c2, B:117:0x01d6, B:119:0x01dc, B:120:0x01df, B:122:0x01e6, B:124:0x01ea, B:126:0x01ee, B:127:0x01f5, B:129:0x01fc, B:132:0x020d, B:135:0x021b, B:137:0x0221, B:139:0x022d, B:141:0x023d, B:142:0x0254, B:144:0x0257, B:146:0x0261, B:147:0x029a, B:149:0x02a6, B:151:0x02ac, B:152:0x0265, B:154:0x0273, B:155:0x028a, B:157:0x028d, B:159:0x0297, B:161:0x02af, B:163:0x02c1, B:165:0x02cb, B:166:0x02d8, B:168:0x02f5, B:169:0x030b, B:171:0x0317, B:172:0x031a), top: B:2:0x0004, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f5 A[Catch: all -> 0x0049, Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0004, B:5:0x0023, B:7:0x0031, B:9:0x0037, B:11:0x003d, B:15:0x0052, B:17:0x005a, B:19:0x0092, B:21:0x0098, B:98:0x0109, B:25:0x011a, B:27:0x0120, B:29:0x0128, B:31:0x012c, B:33:0x0132, B:35:0x0138, B:37:0x0142, B:39:0x0148, B:41:0x014c, B:43:0x015e, B:44:0x0168, B:46:0x016e, B:48:0x0178, B:49:0x017b, B:50:0x0196, B:52:0x019e, B:54:0x01a3, B:56:0x01a9, B:57:0x01b5, B:59:0x01bb, B:60:0x0183, B:62:0x0193, B:101:0x0060, B:103:0x0067, B:105:0x006d, B:107:0x0073, B:109:0x007d, B:111:0x0085, B:112:0x008f, B:115:0x01c2, B:117:0x01d6, B:119:0x01dc, B:120:0x01df, B:122:0x01e6, B:124:0x01ea, B:126:0x01ee, B:127:0x01f5, B:129:0x01fc, B:132:0x020d, B:135:0x021b, B:137:0x0221, B:139:0x022d, B:141:0x023d, B:142:0x0254, B:144:0x0257, B:146:0x0261, B:147:0x029a, B:149:0x02a6, B:151:0x02ac, B:152:0x0265, B:154:0x0273, B:155:0x028a, B:157:0x028d, B:159:0x0297, B:161:0x02af, B:163:0x02c1, B:165:0x02cb, B:166:0x02d8, B:168:0x02f5, B:169:0x030b, B:171:0x0317, B:172:0x031a), top: B:2:0x0004, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0317 A[Catch: all -> 0x0049, Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0004, B:5:0x0023, B:7:0x0031, B:9:0x0037, B:11:0x003d, B:15:0x0052, B:17:0x005a, B:19:0x0092, B:21:0x0098, B:98:0x0109, B:25:0x011a, B:27:0x0120, B:29:0x0128, B:31:0x012c, B:33:0x0132, B:35:0x0138, B:37:0x0142, B:39:0x0148, B:41:0x014c, B:43:0x015e, B:44:0x0168, B:46:0x016e, B:48:0x0178, B:49:0x017b, B:50:0x0196, B:52:0x019e, B:54:0x01a3, B:56:0x01a9, B:57:0x01b5, B:59:0x01bb, B:60:0x0183, B:62:0x0193, B:101:0x0060, B:103:0x0067, B:105:0x006d, B:107:0x0073, B:109:0x007d, B:111:0x0085, B:112:0x008f, B:115:0x01c2, B:117:0x01d6, B:119:0x01dc, B:120:0x01df, B:122:0x01e6, B:124:0x01ea, B:126:0x01ee, B:127:0x01f5, B:129:0x01fc, B:132:0x020d, B:135:0x021b, B:137:0x0221, B:139:0x022d, B:141:0x023d, B:142:0x0254, B:144:0x0257, B:146:0x0261, B:147:0x029a, B:149:0x02a6, B:151:0x02ac, B:152:0x0265, B:154:0x0273, B:155:0x028a, B:157:0x028d, B:159:0x0297, B:161:0x02af, B:163:0x02c1, B:165:0x02cb, B:166:0x02d8, B:168:0x02f5, B:169:0x030b, B:171:0x0317, B:172:0x031a), top: B:2:0x0004, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0324 A[Catch: Exception -> 0x0328, TryCatch #4 {Exception -> 0x0328, blocks: (B:173:0x0320, B:175:0x0324, B:176:0x032a, B:183:0x0347, B:185:0x034b, B:186:0x034e, B:3:0x0004, B:5:0x0023, B:7:0x0031, B:9:0x0037, B:11:0x003d, B:15:0x0052, B:17:0x005a, B:19:0x0092, B:21:0x0098, B:98:0x0109, B:25:0x011a, B:27:0x0120, B:29:0x0128, B:31:0x012c, B:33:0x0132, B:35:0x0138, B:37:0x0142, B:39:0x0148, B:41:0x014c, B:43:0x015e, B:44:0x0168, B:46:0x016e, B:48:0x0178, B:49:0x017b, B:50:0x0196, B:52:0x019e, B:54:0x01a3, B:56:0x01a9, B:57:0x01b5, B:59:0x01bb, B:60:0x0183, B:62:0x0193, B:101:0x0060, B:103:0x0067, B:105:0x006d, B:107:0x0073, B:109:0x007d, B:111:0x0085, B:112:0x008f, B:115:0x01c2, B:117:0x01d6, B:119:0x01dc, B:120:0x01df, B:122:0x01e6, B:124:0x01ea, B:126:0x01ee, B:127:0x01f5, B:129:0x01fc, B:132:0x020d, B:135:0x021b, B:137:0x0221, B:139:0x022d, B:141:0x023d, B:142:0x0254, B:144:0x0257, B:146:0x0261, B:147:0x029a, B:149:0x02a6, B:151:0x02ac, B:152:0x0265, B:154:0x0273, B:155:0x028a, B:157:0x028d, B:159:0x0297, B:161:0x02af, B:163:0x02c1, B:165:0x02cb, B:166:0x02d8, B:168:0x02f5, B:169:0x030b, B:171:0x0317, B:172:0x031a), top: B:2:0x0004, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019e A[Catch: all -> 0x0049, Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0004, B:5:0x0023, B:7:0x0031, B:9:0x0037, B:11:0x003d, B:15:0x0052, B:17:0x005a, B:19:0x0092, B:21:0x0098, B:98:0x0109, B:25:0x011a, B:27:0x0120, B:29:0x0128, B:31:0x012c, B:33:0x0132, B:35:0x0138, B:37:0x0142, B:39:0x0148, B:41:0x014c, B:43:0x015e, B:44:0x0168, B:46:0x016e, B:48:0x0178, B:49:0x017b, B:50:0x0196, B:52:0x019e, B:54:0x01a3, B:56:0x01a9, B:57:0x01b5, B:59:0x01bb, B:60:0x0183, B:62:0x0193, B:101:0x0060, B:103:0x0067, B:105:0x006d, B:107:0x0073, B:109:0x007d, B:111:0x0085, B:112:0x008f, B:115:0x01c2, B:117:0x01d6, B:119:0x01dc, B:120:0x01df, B:122:0x01e6, B:124:0x01ea, B:126:0x01ee, B:127:0x01f5, B:129:0x01fc, B:132:0x020d, B:135:0x021b, B:137:0x0221, B:139:0x022d, B:141:0x023d, B:142:0x0254, B:144:0x0257, B:146:0x0261, B:147:0x029a, B:149:0x02a6, B:151:0x02ac, B:152:0x0265, B:154:0x0273, B:155:0x028a, B:157:0x028d, B:159:0x0297, B:161:0x02af, B:163:0x02c1, B:165:0x02cb, B:166:0x02d8, B:168:0x02f5, B:169:0x030b, B:171:0x0317, B:172:0x031a), top: B:2:0x0004, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb A[Catch: all -> 0x0049, Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0004, B:5:0x0023, B:7:0x0031, B:9:0x0037, B:11:0x003d, B:15:0x0052, B:17:0x005a, B:19:0x0092, B:21:0x0098, B:98:0x0109, B:25:0x011a, B:27:0x0120, B:29:0x0128, B:31:0x012c, B:33:0x0132, B:35:0x0138, B:37:0x0142, B:39:0x0148, B:41:0x014c, B:43:0x015e, B:44:0x0168, B:46:0x016e, B:48:0x0178, B:49:0x017b, B:50:0x0196, B:52:0x019e, B:54:0x01a3, B:56:0x01a9, B:57:0x01b5, B:59:0x01bb, B:60:0x0183, B:62:0x0193, B:101:0x0060, B:103:0x0067, B:105:0x006d, B:107:0x0073, B:109:0x007d, B:111:0x0085, B:112:0x008f, B:115:0x01c2, B:117:0x01d6, B:119:0x01dc, B:120:0x01df, B:122:0x01e6, B:124:0x01ea, B:126:0x01ee, B:127:0x01f5, B:129:0x01fc, B:132:0x020d, B:135:0x021b, B:137:0x0221, B:139:0x022d, B:141:0x023d, B:142:0x0254, B:144:0x0257, B:146:0x0261, B:147:0x029a, B:149:0x02a6, B:151:0x02ac, B:152:0x0265, B:154:0x0273, B:155:0x028a, B:157:0x028d, B:159:0x0297, B:161:0x02af, B:163:0x02c1, B:165:0x02cb, B:166:0x02d8, B:168:0x02f5, B:169:0x030b, B:171:0x0317, B:172:0x031a), top: B:2:0x0004, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183 A[Catch: all -> 0x0049, Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0004, B:5:0x0023, B:7:0x0031, B:9:0x0037, B:11:0x003d, B:15:0x0052, B:17:0x005a, B:19:0x0092, B:21:0x0098, B:98:0x0109, B:25:0x011a, B:27:0x0120, B:29:0x0128, B:31:0x012c, B:33:0x0132, B:35:0x0138, B:37:0x0142, B:39:0x0148, B:41:0x014c, B:43:0x015e, B:44:0x0168, B:46:0x016e, B:48:0x0178, B:49:0x017b, B:50:0x0196, B:52:0x019e, B:54:0x01a3, B:56:0x01a9, B:57:0x01b5, B:59:0x01bb, B:60:0x0183, B:62:0x0193, B:101:0x0060, B:103:0x0067, B:105:0x006d, B:107:0x0073, B:109:0x007d, B:111:0x0085, B:112:0x008f, B:115:0x01c2, B:117:0x01d6, B:119:0x01dc, B:120:0x01df, B:122:0x01e6, B:124:0x01ea, B:126:0x01ee, B:127:0x01f5, B:129:0x01fc, B:132:0x020d, B:135:0x021b, B:137:0x0221, B:139:0x022d, B:141:0x023d, B:142:0x0254, B:144:0x0257, B:146:0x0261, B:147:0x029a, B:149:0x02a6, B:151:0x02ac, B:152:0x0265, B:154:0x0273, B:155:0x028a, B:157:0x028d, B:159:0x0297, B:161:0x02af, B:163:0x02c1, B:165:0x02cb, B:166:0x02d8, B:168:0x02f5, B:169:0x030b, B:171:0x0317, B:172:0x031a), top: B:2:0x0004, outer: #4 }] */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        CustomMainTab customMainTab;
        boolean z11;
        boolean z12;
        boolean z13;
        ContactProfile contactProfile;
        super.onResume();
        try {
            try {
                try {
                    AbstractC23304d.f113406l0 = "";
                    AbstractC23304d.f113254A0 = true;
                    f63201M1 = new WeakReference(this);
                    AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
                    ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
                    if (viewPagerCustomSwipeable != null) {
                        if (viewPagerCustomSwipeable.getCurrentItem() == C24099q0.m125958k().m125971o() && m92648SI() != null && m92662fJ() != null && m92662fJ().m93012K0() == this) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (CoreUtility.f89236l > AbstractC23309i.m121079J9() || AbstractC23309i.m121973h9()) {
                                AbstractC23309i.m121395Rt(false);
                                if (AbstractC26681b.f126356a && AbstractC23309i.m122004i2() && AbstractC23309i.m121966h2() && !AbstractC23034c6.m118126L(MainApplication.getAppContext()) && AbstractC23309i.m121039I6() >= 0) {
                                    AbstractC23309i.m121733ax(true);
                                    AbstractC23309i.m121508Uv(0);
                                    AbstractC23309i.m121954gr(0L);
                                } else {
                                    AbstractC23309i.m121733ax(false);
                                }
                            }
                            z13 = m67670GN();
                            if (!z13) {
                                z13 = m67694iN();
                            }
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            try {
                            } catch (Exception e11) {
                                e = e11;
                            }
                            try {
                                if (AbstractC0924m0.m3928jc()) {
                                    if (C3432a.f14402a.m17234c()) {
                                        ContactProfile contactProfile2 = AbstractC23304d.f113368c0;
                                        if (contactProfile2 != null) {
                                            if (contactProfile2.m40357A0()) {
                                                C3433b m40364F = AbstractC23304d.f113368c0.m40364F();
                                                if (m40364F != null) {
                                                    if (TextUtils.isEmpty(m40364F.m17251d())) {
                                                    }
                                                }
                                                if (m92676n2() != null) {
                                                    AbstractC3439h.m17261A(m92676n2());
                                                    z13 = true;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    String m3500V = AbstractC0924m0.m3500V();
                                    if (!TextUtils.isEmpty(m3500V) && C3432a.f14402a.m17234c() && (contactProfile = AbstractC23304d.f113368c0) != null && contactProfile.m40357A0() && m92676n2() != null) {
                                        AbstractC3439h.m17287u(m92676n2(), m3500V);
                                        z13 = true;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                z13 = true;
                                AbstractC20110a.m104538g("Exception: %s", e.toString());
                                if (!z12) {
                                }
                                AbstractC23304d.f113408l2 = false;
                                if (m67710tM()) {
                                }
                                if (!z13) {
                                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.o0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MainTabView.m67609VM();
                                        }
                                    });
                                }
                                if (AbstractC3489d.m17510r()) {
                                }
                                m67697kN();
                                m67606UN();
                                m67678NN();
                                m67677MN();
                                if (AbstractC23309i.m122353rd() == 0) {
                                    AbstractC0852x.m2352i();
                                }
                                m67684SL();
                                if (PreferencesProvider.f43165t) {
                                    IOErrorInfoView.m80767fM(m92662fJ());
                                }
                                AbstractC26683d.m137045e();
                                if (this.f63237Y0) {
                                }
                                C8967m.m47867E().m47912O();
                                this.f63228P0.sendEmptyMessageDelayed(1, 200L);
                                if (AbstractC23304d.f113296K2) {
                                    this.f63204B0.setCurrentItem(C24099q0.m125958k().m125967h());
                                }
                                C3568b.m18124b().m18127d(new C12108f());
                                C31994kb.m154233h().m154248q(m92689tK());
                                if (!AbstractC23138m0.m118770b()) {
                                }
                                if (this.f63251m1 == C24099q0.m125958k().m125971o()) {
                                }
                                m67599SN();
                                m67608VL();
                                customMainTab = this.f63208D0;
                                if (customMainTab != null) {
                                }
                                this.f63239a1 = false;
                                this.f63224L0 = System.currentTimeMillis();
                                this.f63219I1.m74710v();
                                AbstractC23304d.f113439t1.set(false);
                                m67588OL();
                            }
                        }
                        if (!z12) {
                            if (!z13) {
                                if (AbstractC23309i.m122049jA() && AbstractC23309i.m121039I6() >= 0 && AbstractC26681b.f126356a && AbstractC23309i.m122004i2() && AbstractC23309i.m121966h2() && !AbstractC23034c6.m118126L(MainApplication.getAppContext()) && !AbstractC23165o5.m119333b() && !AbstractC26683d.f126391B) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (currentTimeMillis - AbstractC23309i.m121039I6() > AbstractC23309i.m121598Xa()) {
                                        showDialog(11);
                                        AbstractC23309i.m121954gr(currentTimeMillis);
                                        z13 = true;
                                    }
                                } else if (AbstractC23309i.m122049jA() && AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                                    AbstractC23309i.m121733ax(false);
                                }
                            }
                            C28023b6.m141250h0().m141280E();
                        } else if (this.f63204B0.getCurrentItem() == C24099q0.m125958k().m125972p()) {
                            m67686XL();
                        }
                        AbstractC23304d.f113408l2 = false;
                        if (m67710tM()) {
                            C23177p6.m119388k();
                        }
                        if (!z13 && AbstractC23309i.m122539we()) {
                            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.o0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MainTabView.m67609VM();
                                }
                            });
                        }
                        if (AbstractC3489d.m17510r()) {
                            C26626l.m136687v().m136706q();
                        }
                    }
                    m67697kN();
                    m67606UN();
                    m67678NN();
                    m67677MN();
                    if (AbstractC23309i.m122353rd() == 0 && AbstractC23057e7.m118297d()) {
                        AbstractC0852x.m2352i();
                    }
                    m67684SL();
                    if (PreferencesProvider.f43165t && this.f63239a1 && this.f63240b1) {
                        IOErrorInfoView.m80767fM(m92662fJ());
                    }
                    AbstractC26683d.m137045e();
                    if (this.f63237Y0) {
                        this.f63237Y0 = false;
                        Context m92648SI = m92648SI();
                        String[] strArr = AbstractC23034c6.f112032i;
                        if (AbstractC23034c6.m118167n(m92648SI, strArr) == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f63241c1 = z11;
                        if (this.f63238Z0 && m92642L3() != null && m92642L3().getBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW")) {
                            this.f63238Z0 = false;
                            String[] m118171p = AbstractC23034c6.m118171p();
                            if (m92642L3().getBoolean("EXTRA_REQUESTED_CONTACT_PERMISSION_REGISTER")) {
                                ArrayList arrayList = new ArrayList(Arrays.asList(m118171p));
                                arrayList.remove("android.permission.READ_CONTACTS");
                                arrayList.remove("android.permission.WRITE_CONTACTS");
                                m118171p = (String[]) arrayList.toArray(new String[0]);
                            }
                            if (m118171p.length > 0 && AbstractC23034c6.m118167n(m92648SI(), m118171p) != 0) {
                                AbstractC23034c6.m118184v0(this, m118171p, 100);
                            }
                        } else {
                            String[] m118173q = AbstractC23034c6.m118173q();
                            if (m92642L3().getBoolean("EXTRA_REQUESTED_CONTACT_PERMISSION_REGISTER")) {
                                ArrayList arrayList2 = new ArrayList(Arrays.asList(m118173q));
                                arrayList2.remove("android.permission.READ_CONTACTS");
                                arrayList2.remove("android.permission.WRITE_CONTACTS");
                                m118173q = (String[]) arrayList2.toArray(new String[0]);
                            }
                            if (m118173q.length > 0 && AbstractC23034c6.m118167n(m92648SI(), m118173q) != 0) {
                                AbstractC23034c6.m118184v0(this, m118173q, 100);
                            }
                        }
                        if (AbstractC23034c6.m118167n(this.f88762c0.m92648SI(), strArr) != 0 || !AbstractC23057e7.m118297d()) {
                            AbstractC23309i.m121771bx(true);
                        }
                    }
                    C8967m.m47867E().m47912O();
                    this.f63228P0.sendEmptyMessageDelayed(1, 200L);
                    if (AbstractC23304d.f113296K2 && C24099q0.m125958k().m125962c()) {
                        this.f63204B0.setCurrentItem(C24099q0.m125958k().m125967h());
                    }
                    C3568b.m18124b().m18127d(new C12108f());
                    C31994kb.m154233h().m154248q(m92689tK());
                    if (!AbstractC23138m0.m118770b()) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                        m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
                    }
                    if (this.f63251m1 == C24099q0.m125958k().m125971o()) {
                        m67612WL();
                    }
                    m67599SN();
                    m67608VL();
                    customMainTab = this.f63208D0;
                    if (customMainTab != null) {
                        customMainTab.m68756v();
                    }
                    this.f63239a1 = false;
                    this.f63224L0 = System.currentTimeMillis();
                    this.f63219I1.m74710v();
                    AbstractC23304d.f113439t1.set(false);
                    m67588OL();
                } catch (Throwable th2) {
                    try {
                        CustomMainTab customMainTab2 = this.f63208D0;
                        if (customMainTab2 != null) {
                            customMainTab2.m68756v();
                        }
                        this.f63239a1 = false;
                        this.f63224L0 = System.currentTimeMillis();
                        this.f63219I1.m74710v();
                        AbstractC23304d.f113439t1.set(false);
                        m67588OL();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e14) {
                e14.printStackTrace();
            }
        } catch (Exception e15) {
            e15.printStackTrace();
            CustomMainTab customMainTab3 = this.f63208D0;
            if (customMainTab3 != null) {
                customMainTab3.m68756v();
            }
            this.f63239a1 = false;
            this.f63224L0 = System.currentTimeMillis();
            this.f63219I1.m74710v();
            AbstractC23304d.f113439t1.set(false);
            m67588OL();
        }
    }

    /* renamed from: pM */
    public void m67702pM(Bundle bundle) {
        Handler handler;
        if (bundle != null) {
            try {
                if (bundle.containsKey("TAB_ID")) {
                    this.f63236X0 = bundle.getInt("TAB_ID");
                    bundle.remove("TAB_ID");
                    if (this.f63236X0 >= 0) {
                        this.f63228P0.post(new Runnable() { // from class: o70.m
                            public /* synthetic */ RunnableC24090m() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MainTabView.this.m67574GM();
                            }
                        });
                    }
                }
                if (bundle.getBoolean(MessagesView.f63531l3, false) && (handler = this.f63228P0) != null) {
                    handler.postDelayed(new Runnable() { // from class: o70.n

                        /* renamed from: p */
                        public final /* synthetic */ Bundle f116431p;

                        public /* synthetic */ RunnableC24092n(Bundle bundle2) {
                            r1 = bundle2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MainTabView.m67576HM(r1);
                        }
                    }, 400L);
                }
                if (bundle2.containsKey("EXTRA_SHOW_DIALOG_COMPLETE_RESET_PASS") && bundle2.getInt("EXTRA_SHOW_DIALOG_COMPLETE_RESET_PASS") == 1) {
                    showDialog(9);
                    bundle2.remove("EXTRA_SHOW_DIALOG_COMPLETE_RESET_PASS");
                }
                if (bundle2.containsKey("EXTRA_NOTIFICATION_ZINSTANT")) {
                    String string = bundle2.getString("EXTRA_NOTIFICATION_ZINSTANT");
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        String optString = jSONObject.optString("actionName");
                        if (!TextUtils.isEmpty(optString)) {
                            AbstractC28207v1.m141994i3(optString, 5, m92676n2(), null, jSONObject.optString("actionData", ""), null);
                        }
                    }
                    bundle2.remove("EXTRA_NOTIFICATION_ZINSTANT");
                }
                if (bundle2.containsKey("EXTRA_SHOW_SNACKBAR_UNDO_DELETING_CONVERSATION_FROM_RM")) {
                    if (bundle2.getBoolean("EXTRA_SHOW_SNACKBAR_UNDO_DELETING_CONVERSATION_FROM_RM")) {
                        m67567DN(true);
                    }
                    bundle2.remove("EXTRA_SHOW_SNACKBAR_UNDO_DELETING_CONVERSATION_FROM_RM");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: pN */
    public void m67703pN(InterfaceC24103s0 interfaceC24103s0) {
        this.f63214G0.remove(interfaceC24103s0);
    }

    /* renamed from: qM */
    public boolean m67704qM() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && (actionBar.getActionMode() == null || !this.f88760a0.m92720p())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:            if (r5.f63251m1 == o70.C24099q0.m125958k().m125972p()) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:            if (r3 == false) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:            return;     */
    /* renamed from: qN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m67705qN() {
        boolean z11;
        int i11;
        int i12;
        try {
            int i13 = this.f63252n1;
            if (i13 != -1) {
                if (i13 == C24099q0.m125958k().m125972p()) {
                    if (this.f63251m1 == C24099q0.m125958k().m125972p()) {
                    }
                    if (AbstractC23304d.f113341W != 0) {
                        AbstractC23304d.f113341W = 0;
                        AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
                        AbstractC23309i.m120913Es("");
                        m67678NN();
                    }
                    if (C21927m.m114302u().f107791K == 2) {
                        AbstractC23304d.f113337V = false;
                        AbstractC0924m0.m3693bh(false);
                    }
                }
                if (this.f63252n1 != C24099q0.m125958k().m125972p()) {
                }
            }
            boolean z12 = true;
            if (C24099q0.m125958k().m125964e() && (i12 = this.f63252n1) != -1 && ((i12 == C24099q0.m125958k().m125970n() && this.f63251m1 != C24099q0.m125958k().m125970n()) || (this.f63252n1 != C24099q0.m125958k().m125970n() && this.f63251m1 == C24099q0.m125958k().m125970n()))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!C24099q0.m125958k().m125961b() || (i11 = this.f63252n1) == -1 || ((i11 != C24099q0.m125958k().m125966g() || this.f63251m1 == C24099q0.m125958k().m125966g()) && (this.f63252n1 == C24099q0.m125958k().m125966g() || this.f63251m1 != C24099q0.m125958k().m125966g()))) {
                z12 = false;
            }
            if (AbstractC23309i.m121525Vb()) {
                AbstractC23309i.m121960gx(false);
            }
            m67677MN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    public boolean m67706rM() {
        return this.f63234V0;
    }

    /* renamed from: rN */
    void m67707rN() {
        try {
            this.f63237Y0 = true;
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
            if (viewPagerCustomSwipeable != null) {
                viewPagerCustomSwipeable.setCurrentItem(C24099q0.m125958k().m125971o(), false);
            }
            C23744a.m124114c().m124116d(6076, new Object[0]);
            C23744a.m124114c().m124116d(6074, new Object[0]);
            C23744a.m124114c().m124116d(6085, new Object[0]);
            C23744a.m124114c().m124116d(6092, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    public boolean m67708sM() {
        return this.f63264z0;
    }

    /* renamed from: sN */
    public void m67709sN(boolean z11) {
        if (this.f63254p1 == null) {
            RedDotImageButton redDotImageButton = this.f63217H1;
            this.f63254p1 = new C32132u5(redDotImageButton, C23212s8.m119607o(redDotImageButton.getContext(), AbstractC16781w.NotificationReddot));
        }
        if (this.f63217H1 != null) {
            C32132u5 c32132u5 = this.f63254p1;
            if (!c32132u5.f148211h) {
                AbstractC23195r2.f112443e = true;
                c32132u5.m155101b(z11, new Runnable() { // from class: o70.n0
                    public /* synthetic */ RunnableC24093n0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MainTabView.this.m67615XM();
                    }
                });
            }
        }
    }

    /* renamed from: tM */
    public boolean m67710tM() {
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63204B0;
        if (viewPagerCustomSwipeable != null && viewPagerCustomSwipeable.getCurrentItem() != -1) {
            return m67717xM(this.f63204B0.getCurrentItem());
        }
        return false;
    }

    /* renamed from: tN */
    protected void m67711tN(KeyEventCallbackC17462c keyEventCallbackC17462c) {
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            keyEventCallbackC17462c.dismiss();
        }
    }

    /* renamed from: uM */
    public boolean m67712uM(int i11) {
        View m68753k = this.f63208D0.m68753k(i11);
        if (m68753k == null) {
            return false;
        }
        TextView m68744i = CustomMainTab.m68744i(m68753k);
        ImageView m68745j = CustomMainTab.m68745j(m68753k);
        View m68743h = CustomMainTab.m68743h(m68753k);
        if ((m68744i == null || m68744i.getVisibility() != 0) && ((m68745j == null || m68745j.getVisibility() != 0) && (m68743h == null || m68743h.getVisibility() != 0))) {
            return false;
        }
        return true;
    }

    /* renamed from: uN */
    public void m67713uN(MessagesView.C12191g0 c12191g0) {
        int i11;
        Button button;
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null && actionBar.getActionMode() != null && c12191g0 != null) {
                if (!TextUtils.isEmpty(c12191g0.f63688a) && (button = this.f63216H0) != null) {
                    button.setText(c12191g0.f63688a);
                    this.f63216H0.setEnabled(c12191g0.f63690c);
                }
                if (c12191g0.f63689b) {
                    ActionBarMenuItem actionBarMenuItem = this.f63218I0;
                    if (actionBarMenuItem != null && actionBarMenuItem.getIconView() != null) {
                        this.f63218I0.getIconView().setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC2810d.cb_medium_checked));
                    }
                    if (this.f63249k1 != null) {
                        if (AbstractC23136l9.m118660K0(getContext())) {
                            i11 = AbstractC8020f0.str_menu_uncheck_all_short;
                        } else {
                            i11 = AbstractC8020f0.str_menu_uncheck_all;
                        }
                        this.f63249k1.setText(AbstractC23136l9.m118743r0(i11));
                        return;
                    }
                    return;
                }
                ActionBarMenuItem actionBarMenuItem2 = this.f63218I0;
                if (actionBarMenuItem2 != null && actionBarMenuItem2.getIconView() != null) {
                    this.f63218I0.getIconView().setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC2810d.cb_medium_normal));
                }
                Button button2 = this.f63249k1;
                if (button2 != null) {
                    button2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_mark_as_read_select_all));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vN */
    public void m67714vN(boolean z11) {
        this.f63235W0 = z11;
    }

    /* renamed from: wM */
    public boolean m67715wM() {
        if (AbstractC23304d.f113254A0 && this.f63251m1 == C24099q0.m125958k().m125971o()) {
            return true;
        }
        return false;
    }

    /* renamed from: wN */
    public void m67716wN(boolean z11) {
        this.f63234V0 = z11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0031. Please report as an issue. */
    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 36) {
                if (i11 != 60) {
                    if (i11 != 65) {
                        if (i11 != 3003) {
                            if (i11 != 5200) {
                                if (i11 != 6000 && i11 != 6003) {
                                    if (i11 != 6099) {
                                        if (i11 != 8101) {
                                            if (i11 != 12003) {
                                                if (i11 != 44) {
                                                    if (i11 == 45) {
                                                        AbstractC23304d.f113408l2 = true;
                                                        m67694iN();
                                                        AbstractC23304d.f113408l2 = false;
                                                    } else {
                                                        switch (i11) {
                                                            case 6024:
                                                            case 6025:
                                                            case 6026:
                                                                break;
                                                            default:
                                                                return;
                                                        }
                                                    }
                                                } else {
                                                    String str = (String) objArr[0];
                                                    if (Arrays.asList(AbstractC28025b8.f130864u).contains(str)) {
                                                        this.f63228P0.sendMessage(this.f63228P0.obtainMessage(4, str));
                                                    }
                                                }
                                            } else {
                                                AbstractC19444a.m101695c(new Runnable() { // from class: o70.k0
                                                    public /* synthetic */ RunnableC24087k0() {
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        MainTabView.this.m67572FM();
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                                this.f63228P0.post(new Runnable() { // from class: o70.j0
                                    public /* synthetic */ RunnableC24085j0() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MainTabView.this.m67624bM();
                                    }
                                });
                            } else {
                                m67603TN();
                            }
                        } else {
                            this.f63228P0.post(new Runnable() { // from class: o70.z
                                public /* synthetic */ RunnableC24111z() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    MainTabView.this.m67569EM();
                                }
                            });
                        }
                    }
                    m67678NN();
                } else {
                    showDialog(10);
                }
            }
            m67606UN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        BroadcastReceiver broadcastReceiver;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        m67586NL();
        C21927m.m114302u().m114356r0();
        int m121079J9 = AbstractC23309i.m121079J9();
        if (CoreUtility.f89236l > m121079J9) {
            AbstractC23309i.m120911Eq(0L);
            AbstractC23309i.m122552wr(0L);
            AbstractC21970a.m114741j(0L);
            C0832n.m2179i().m2189h();
            C28020b3.f130648a.m141195j(m121079J9);
            C22447s.m116016R();
            C22447s.m116008K(m121079J9);
            AbstractC28025b8.m141464t(CoreUtility.f89236l, m121079J9);
            AbstractC23309i.m121541Vr(0L);
        }
        C28020b3.f130648a.m141193g();
        m67683RN(false);
        m67679ON();
        if (m92642L3 != null) {
            m67702pM(m92642L3);
        }
        try {
            C28685a c28685a = this.f63244f1;
            if (c28685a != null && (broadcastReceiver = this.f63245g1) != null) {
                c28685a.m143697e(broadcastReceiver);
            }
            this.f63244f1 = C28685a.m143693b(m92648SI());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.action.ACTION_CHECK_REFRESH_STICKY_ADS_NOTIFY");
            intentFilter.addAction("com.zing.zalo.ACTION_NEW_NOTIFY_REDDOT");
            intentFilter.addAction("com.zing.zalo.ACTION_UPDATE_FEATURE_HTML");
            this.f63244f1.m143695c(this.f63245g1, intentFilter);
            C23744a.m124114c().m124115b(this, 12003);
            AbstractC28105j8.m141581c();
            if (bundle != null) {
                this.f63238Z0 = bundle.getBoolean("requestPermissionFirstView");
                this.f63237Y0 = bundle.getBoolean("needCheckAppPermission");
                this.f63264z0 = bundle.getBoolean("isDialogUpdatePhonebookShow", false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.r
            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.m67579JM();
            }
        });
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o70.s
            public /* synthetic */ RunnableC24102s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.this.m67601TL();
            }
        });
        C25727d.m132757l0();
    }

    /* renamed from: xM */
    public boolean m67717xM(int i11) {
        if (i11 != C24099q0.m125958k().m125970n() && i11 != C24099q0.m125958k().m125966g()) {
            return false;
        }
        return true;
    }

    /* renamed from: yN */
    public void m67718yN(int i11, MessagesView.C12191g0 c12191g0) {
        this.f63228P0.postDelayed(new Runnable() { // from class: o70.i0

            /* renamed from: q */
            public final /* synthetic */ int f116421q;

            /* renamed from: r */
            public final /* synthetic */ MessagesView.C12191g0 f116422r;

            public /* synthetic */ RunnableC24083i0(int i112, MessagesView.C12191g0 c12191g02) {
                r2 = i112;
                r3 = c12191g02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MainTabView.this.m67617YM(r2, r3);
            }
        }, 100L);
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yp */
    public boolean mo60294yp() {
        if (!m92677nJ() && !m92681pJ()) {
            return false;
        }
        return true;
    }

    /* renamed from: zN */
    void m67719zN(Bundle bundle) {
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = (ViewPagerCustomSwipeable) this.f63202A0.findViewById(AbstractC6918a0.pager);
        this.f63204B0 = viewPagerCustomSwipeable;
        viewPagerCustomSwipeable.addOnPageChangeListener(this);
        this.f63204B0.setPageMarginDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.slide_viewpager_seperate_line));
        this.f63204B0.setPageMargin(m92651WI().getDimensionPixelSize(AbstractC16802y.page_margin_width));
        this.f63204B0.setOffscreenPageLimit(5);
        this.f63204B0.setDrawingCacheEnabled(true);
        this.f63204B0.setAlwaysDrawnWithCacheEnabled(true);
        this.f63204B0.setDrawingCacheQuality(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("sInterpolator");
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField("mScroller");
            declaredField2.setAccessible(true);
            C16648s c16648s = new C16648s(this.f63204B0.getContext(), (Interpolator) declaredField.get(null));
            this.f63212F0 = c16648s;
            declaredField2.set(this.f63204B0, c16648s);
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        } catch (IllegalArgumentException e12) {
            e12.printStackTrace();
        } catch (NoSuchFieldException e13) {
            e13.printStackTrace();
        } catch (Exception e14) {
            e14.printStackTrace();
        }
        C24105t0 c24105t0 = new C24105t0(m92649TI());
        this.f63206C0 = c24105t0;
        this.f63204B0.setAdapter(c24105t0);
        CustomMainTab customMainTab = (CustomMainTab) this.f63202A0.findViewById(AbstractC6918a0.sliding_tabs);
        this.f63208D0 = customMainTab;
        customMainTab.setViewPager(this.f63204B0);
        this.f63208D0.setAllowTabChangeLateralAnim(false);
        C24101r0 c24101r0 = new C24101r0(this.f63204B0, this.f63206C0, this.f63208D0);
        this.f63210E0 = c24101r0;
        this.f63204B0.setOnPageSelectedDireclyListener(c24101r0);
        this.f63208D0.setOnTabClickListener(this.f63243e1);
    }
}
