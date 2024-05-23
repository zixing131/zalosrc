package com.zing.zalo.p077ui.maintab.more;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.animation.LayoutTransition;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2351i;
import au.AbstractC2364o0;
import au.C2343e;
import bn.C2864d1;
import bo.C2972f2;
import bo.C2973f3;
import ck0.C3568b;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.feed.mvp.profile.DiscoverySkeletonView;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.more.MoreTabView;
import com.zing.zalo.p077ui.maintab.widget.MainTabChildView;
import com.zing.zalo.p077ui.settings.SettingPrivateV2View;
import com.zing.zalo.p077ui.settings.SettingV2View;
import com.zing.zalo.p077ui.settings.SwitchAccountView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.FeatureHtmlItemView;
import com.zing.zalo.p077ui.zviews.NearbyZView;
import com.zing.zalo.p077ui.zviews.NotChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoZView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.C16792j;
import com.zing.zalo.zinstant.C17102b;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17172p;
import com.zing.zalo.zinstant.C17177r0;
import com.zing.zalo.zinstant.C17210v;
import com.zing.zalo.zinstant.C17248z0;
import com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17123a;
import com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewImpl;
import com.zing.zalo.zinstant.discovery.DiscoveryZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dk0.C18020c;
import fg0.ThreadFactoryC18928a;
import gu.AbstractC19601a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import ik0.C20592o;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jf0.C21238a;
import jf0.C21242e;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23179p8;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23055e5;
import me0.C23177p6;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import nj0.AbstractC23803b;
import o70.C24099q0;
import ok0.InterfaceC24289f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p132ej.C18452n;
import p140ev.C18613b;
import p140ev.C18618g;
import p140ev.C18620i;
import p172fy.C19171b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p594w1.C28685a;
import p604wb.C28905e;
import p716zh.C31877d;
import p716zh.C31937h;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pj0.AbstractC24788n;
import pj0.InterfaceC24785k;
import sa0.C26203c;
import sy.AbstractC26412d;
import tj.C26715g;
import v20.C27473a;
import vg.AbstractC28025b8;
import vg.AbstractC28045d8;
import vg.AbstractC28207v1;
import vg.C28212v6;

/* loaded from: classes5.dex */
public class MoreTabView extends MainTabChildView implements View.OnClickListener, C23744a.c, MainTabView.InterfaceC12111i, DiscoveryZinstantLayout.InterfaceC17143b, InterfaceC0733x {

    /* renamed from: O1 */
    public static final String f63451O1 = "MoreTabView";

    /* renamed from: A1 */
    LinearLayout f63452A1;

    /* renamed from: G1 */
    ShowcaseView f63458G1;

    /* renamed from: H1 */
    AbstractC23803b f63459H1;

    /* renamed from: I1 */
    AbstractC24788n f63460I1;

    /* renamed from: J1 */
    C17177r0 f63461J1;

    /* renamed from: K1 */
    InterfaceC24289f f63462K1;

    /* renamed from: N0 */
    AvatarImageView f63466N0;

    /* renamed from: O0 */
    View f63468O0;

    /* renamed from: P0 */
    TextView f63469P0;

    /* renamed from: Q0 */
    TextView f63470Q0;

    /* renamed from: R0 */
    GlowingReddot f63471R0;

    /* renamed from: S0 */
    ViewGroup f63472S0;

    /* renamed from: T0 */
    boolean f63473T0;

    /* renamed from: U0 */
    DiscoverySkeletonView f63474U0;

    /* renamed from: V0 */
    View f63475V0;

    /* renamed from: W0 */
    View f63476W0;

    /* renamed from: X0 */
    View f63477X0;

    /* renamed from: Y0 */
    View f63478Y0;

    /* renamed from: Z0 */
    GroupAvatarView f63479Z0;

    /* renamed from: a1 */
    GroupAvatarView f63480a1;

    /* renamed from: b1 */
    CircleImage f63481b1;

    /* renamed from: c1 */
    RobotoTextView f63482c1;

    /* renamed from: d1 */
    C23528a f63483d1;

    /* renamed from: e1 */
    View f63484e1;

    /* renamed from: f1 */
    RecyclingImageView f63485f1;

    /* renamed from: g1 */
    ImageView f63486g1;

    /* renamed from: h1 */
    RobotoTextView f63487h1;

    /* renamed from: i1 */
    RobotoTextView f63488i1;

    /* renamed from: l1 */
    AlarmManager f63491l1;

    /* renamed from: m1 */
    PendingIntent f63492m1;

    /* renamed from: q1 */
    long f63496q1;

    /* renamed from: t1 */
    ZinstantScrollViewImpl f63499t1;

    /* renamed from: u1 */
    LinearLayout f63500u1;

    /* renamed from: v1 */
    LinearLayout f63501v1;

    /* renamed from: w1 */
    LinearLayout f63502w1;

    /* renamed from: x1 */
    DiscoveryZinstantLayout f63503x1;

    /* renamed from: y1 */
    C18020c f63504y1;

    /* renamed from: z1 */
    ExecutorService f63505z1;

    /* renamed from: M0 */
    public boolean f63464M0 = false;

    /* renamed from: j1 */
    C26715g f63489j1 = null;

    /* renamed from: k1 */
    long f63490k1 = 0;

    /* renamed from: n1 */
    boolean f63493n1 = false;

    /* renamed from: o1 */
    UpdateListener f63494o1 = null;

    /* renamed from: p1 */
    Boolean f63495p1 = Boolean.FALSE;

    /* renamed from: r1 */
    boolean f63497r1 = false;

    /* renamed from: s1 */
    boolean f63498s1 = false;

    /* renamed from: B1 */
    C1761c0 f63453B1 = new C1761c0();

    /* renamed from: C1 */
    boolean f63454C1 = true;

    /* renamed from: D1 */
    private long f63455D1 = 0;

    /* renamed from: E1 */
    Handler f63456E1 = new Handler(Looper.getMainLooper(), new C12160a());

    /* renamed from: F1 */
    BroadcastReceiver f63457F1 = new C12161b();

    /* renamed from: L1 */
    boolean f63463L1 = false;

    /* renamed from: M1 */
    final Object f63465M1 = new Object();

    /* renamed from: N1 */
    boolean f63467N1 = false;

    /* loaded from: classes5.dex */
    public static class FindFriendDialogView extends DialogView implements InterfaceC17463d.d {

        /* renamed from: H0 */
        MoreTabView f63506H0;

        /* renamed from: I0 */
        String f63507I0;

        /* renamed from: XK */
        public static FindFriendDialogView m68065XK(int i11) {
            FindFriendDialogView findFriendDialogView = new FindFriendDialogView();
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            findFriendDialogView.mo60305zK(bundle);
            return findFriendDialogView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: YK */
        public /* synthetic */ void m68066YK(C2864d1 c2864d1, AdapterView adapterView, View view, int i11, long j11) {
            if (c2864d1 != null) {
                try {
                    c2864d1.dismiss();
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(MoreTabView.f63451O1, e11.toString());
                    return;
                }
            }
            boolean z11 = false;
            if (i11 == 0) {
                C7960e.m41971c6().m42461m4(this.f63506H0.f63496q1);
                AbstractC23309i.m122149lx(false);
                AbstractC23309i.m121960gx(false);
                AbstractC23181q.m119434g();
                this.f63506H0.m68049aN(false);
                return;
            }
            MoreTabView moreTabView = this.f63506H0;
            if (moreTabView != null) {
                if (i11 == 2) {
                    z11 = true;
                }
                moreTabView.m68059vM(z11);
            }
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            C17487o0 c17487o0;
            try {
                if (interfaceC17463d.mo92862f() == 4) {
                    if (i11 == -1) {
                        AbstractC23647d.m123907q("5320", "");
                        interfaceC17463d.dismiss();
                        AbstractC23309i.m121177Lx(true);
                        if (this.f88762c0.m92676n2() != null) {
                            c17487o0 = this.f88762c0.m92676n2().mo35579p();
                        } else {
                            c17487o0 = null;
                        }
                        if (c17487o0 != null) {
                            c17487o0.m93069k2(NearbyZView.class, null, 1, true);
                        }
                        AbstractC23647d.m123893c();
                        return;
                    }
                    if (i11 == -2) {
                        AbstractC23647d.m123907q("5310", "");
                        interfaceC17463d.dismiss();
                        AbstractC23647d.m123893c();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            C8009j c8009j;
            if (bundle != null) {
                try {
                    dismiss();
                    return super.mo13885LK(bundle);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            int i11 = this.f88762c0.m92642L3().getInt("id");
            if (i11 != 4) {
                if (i11 != 5) {
                    c8009j = null;
                } else {
                    String m92652XI = this.f88762c0.m92652XI(AbstractC8020f0.str_hide_feed_ad);
                    String format = String.format(this.f88762c0.m92652XI(AbstractC8020f0.str_hide_all_feed_ads), this.f63507I0);
                    C27473a.a aVar = new C27473a.a(0, this.f88762c0.m92652XI(AbstractC8020f0.delete));
                    C27473a.a aVar2 = new C27473a.a(1, m92652XI);
                    C27473a.a aVar3 = new C27473a.a(2, format);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    if (C28905e.f133812l == 1) {
                        arrayList.add(aVar2);
                        arrayList.add(aVar3);
                    }
                    C27473a c27473a = new C27473a(this.f88762c0.m92648SI());
                    c27473a.m140530b(arrayList);
                    C2864d1.a aVar4 = new C2864d1.a(this.f88762c0.m92648SI());
                    aVar4.m13797f(AbstractC8915g0.TimelineMenuTheme);
                    aVar4.m13795d(c27473a);
                    final C2864d1 m13794b = aVar4.m13794b();
                    aVar4.m13796e(new AdapterView.OnItemClickListener() { // from class: s70.i
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view, int i12, long j11) {
                            MoreTabView.FindFriendDialogView.this.m68066YK(m13794b, adapterView, view, i12, j11);
                        }
                    });
                    c8009j = m13794b;
                }
            } else {
                C8009j.a aVar5 = new C8009j.a(this.f88762c0.m92648SI());
                aVar5.m43172u(this.f88762c0.m92652XI(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(this.f88762c0.m92652XI(AbstractC8020f0.str_ask_to_use_usernearby)).m43165n(this.f88762c0.m92652XI(AbstractC8020f0.str_no), this).m43170s(this.f88762c0.m92652XI(AbstractC8020f0.str_yes), this);
                c8009j = aVar5.m43152a();
            }
            if (c8009j != null) {
                c8009j.m92853D(i11);
                return c8009j;
            }
            super.m92600RK(false);
            return null;
        }

        /* renamed from: ZK */
        public void m68067ZK(MoreTabView moreTabView) {
            this.f63506H0 = moreTabView;
        }

        /* renamed from: aL */
        public void m68068aL(String str) {
            this.f63507I0 = str;
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
        /* renamed from: xJ */
        public void mo37135xJ(Bundle bundle) {
            try {
                super.mo37135xJ(bundle);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    protected class UpdateListener extends ZamReceiver {
        protected UpdateListener() {
        }

        @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
        /* renamed from: b */
        public void mo39547b(Context context, Intent intent) {
            super.mo39547b(context, intent);
            try {
                if ("com.zing.zalo.ACTION_CHECK_DELETE_EXPIRE_TIME_STICKY_ADS".equals(intent.getAction())) {
                    MoreTabView.this.m68034BM();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(MoreTabView.f63451O1, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$a */
    /* loaded from: classes5.dex */
    class C12160a implements Handler.Callback {
        C12160a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                int i11 = message.what;
                if (i11 != 0) {
                    if (i11 == 1 && MoreTabView.this.f63503x1 != null) {
                        AbstractC20110a.m104535d("refresh discovery after delayed time", new Object[0]);
                        MoreTabView.this.f63455D1 = System.currentTimeMillis();
                        MoreTabView.this.f63503x1.mo91437z0();
                    }
                } else {
                    String str = (String) message.obj;
                    ShowcaseView showcaseView = MoreTabView.this.f63458G1;
                    if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(str, MoreTabView.this.f63458G1.getShowcaseId())) {
                        MoreTabView.this.f63458G1.m74626d();
                        MoreTabView.this.f63458G1 = null;
                    }
                    MoreTabView.this.m68055rM(str, -1);
                    MoreTabView.this.m68054qM(str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$b */
    /* loaded from: classes5.dex */
    public class C12161b extends BroadcastReceiver {
        C12161b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m68070b() {
            MoreTabView.this.m68042TM(true);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (MoreTabView.this.f72421L0.m92674mJ() && !MoreTabView.this.f72421L0.m92677nJ()) {
                    String action = intent.getAction();
                    String str = MoreTabView.f63451O1;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mLocalReceiver:");
                    sb2.append(action);
                    if (!"com.zing.zalo.ACTION_NEW_NOTIFY_REDDOT".equals(action) && !"com.zing.zalo.ACTION_HAS_PRELOAD_INFO_UPDATED".equals(action)) {
                        if ("com.zing.zalo.ACTION_CHECK_REFRESH_STICKY_ADS".equals(action)) {
                            MoreTabView.this.m68034BM();
                        } else if ("com.zing.zalo.ACTION_SCROLL_TO_LAYOUT_MYPROFILE".equals(action)) {
                            MoreTabView.this.m68044WM();
                        } else if ("com.zing.zalo.ACTION_UPDATE_FEATURE_HTML".equals(action)) {
                            MoreTabView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.more.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MoreTabView.C12161b.this.m68070b();
                                }
                            });
                        }
                    }
                    MoreTabView moreTabView = MoreTabView.this;
                    moreTabView.f63498s1 = true;
                    if (moreTabView.f63454C1 && moreTabView.f72421L0.m92672lJ()) {
                        MoreTabView.this.m68043UM();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(MoreTabView.f63451O1, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$c */
    /* loaded from: classes5.dex */
    public class C12162c implements C3568b.b {
        C12162c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m68073e(InterfaceC17123a interfaceC17123a, boolean z11) {
            DiscoveryZinstantLayout discoveryZinstantLayout = MoreTabView.this.f63503x1;
            if (discoveryZinstantLayout != null && z11) {
                discoveryZinstantLayout.m91993g0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m68074f() {
            int i11;
            MoreTabView.this.f63503x1 = new DiscoveryZinstantLayout(MoreTabView.this.f72421L0.getContext());
            MoreTabView moreTabView = MoreTabView.this;
            moreTabView.f63504y1.m95828K(moreTabView.f72421L0.getContext());
            MoreTabView moreTabView2 = MoreTabView.this;
            moreTabView2.f63503x1.setUiImplementationSwitcher(moreTabView2);
            MoreTabView moreTabView3 = MoreTabView.this;
            DiscoveryZinstantLayout discoveryZinstantLayout = moreTabView3.f63503x1;
            if (moreTabView3.f63464M0) {
                i11 = 10;
            } else {
                i11 = 8;
            }
            discoveryZinstantLayout.setTimeOnScreenTracker(new C17102b(i11));
            MoreTabView.this.f63503x1.setContextProvider(new C17170o());
            MoreTabView.this.m68009DM();
            MoreTabView.this.f63499t1.setOnIdleListener(new InterfaceC17123a.a() { // from class: com.zing.zalo.ui.maintab.more.c
                @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17123a.a
                /* renamed from: a */
                public final void mo68087a(InterfaceC17123a interfaceC17123a, boolean z11) {
                    MoreTabView.C12162c.this.m68073e(interfaceC17123a, z11);
                }
            });
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            MoreTabView.this.mo68062yC();
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            MoreTabView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.maintab.more.b
                @Override // java.lang.Runnable
                public final void run() {
                    MoreTabView.C12162c.this.m68074f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$d */
    /* loaded from: classes5.dex */
    public class C12163d extends AbstractC0939u {
        C12163d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m68079g(View view) {
            MoreTabView moreTabView = MoreTabView.this;
            moreTabView.m68040RM(moreTabView.f63489j1);
            try {
                C31937h c31937h = new C31937h(new JSONObject(MoreTabView.this.f63489j1.m137371a()));
                if (c31937h.m153484e() == 1) {
                    MoreTabView moreTabView2 = MoreTabView.this;
                    moreTabView2.f63496q1 = moreTabView2.f63489j1.m137372b();
                    C7960e.m41971c6().m42461m4(MoreTabView.this.f63496q1);
                    AbstractC23309i.m122149lx(false);
                    AbstractC2364o0.m12372o(MoreTabView.this.f72421L0.m92676n2(), MoreTabView.this.f63484e1, 8);
                } else if (c31937h.m153484e() == 2 && MoreTabView.this.f63489j1.m137375e() == 0) {
                    C7960e.m41971c6().m42406ge(MoreTabView.this.f63489j1.m137372b(), System.currentTimeMillis());
                    AbstractC23181q.m119435h();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ boolean m68080h(View view) {
            try {
                if (new C31937h(new JSONObject(MoreTabView.this.f63489j1.m137371a())).m153485f() == 1) {
                    MoreTabView.this.m68047ZM();
                    return true;
                }
                return false;
            } catch (JSONException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m68081i() {
            MoreTabView.this.m68053pM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m68082j(List list) {
            long currentTimeMillis;
            long m153487h;
            if (list != null) {
                try {
                    if (!list.isEmpty() && list.get(0) != null) {
                        MoreTabView.this.f63489j1 = (C26715g) list.get(0);
                        MoreTabView moreTabView = MoreTabView.this;
                        moreTabView.f63496q1 = moreTabView.f63489j1.m137372b();
                        C31937h c31937h = new C31937h(new JSONObject(MoreTabView.this.f63489j1.m137371a()));
                        if (MoreTabView.this.f63489j1.m137375e() > 0) {
                            MoreTabView.this.f63489j1.m137375e();
                        } else {
                            MoreTabView.this.f63489j1.m137376f();
                        }
                        long m137375e = MoreTabView.this.f63489j1.m137375e();
                        if (m137375e > 0) {
                            currentTimeMillis = System.currentTimeMillis() - m137375e;
                            m153487h = c31937h.m153483d();
                        } else {
                            currentTimeMillis = System.currentTimeMillis() - MoreTabView.this.f63489j1.m137376f();
                            m153487h = c31937h.m153487h();
                        }
                        long j11 = m153487h * 60000;
                        if (currentTimeMillis < 0) {
                            currentTimeMillis = 0;
                        }
                        if (currentTimeMillis >= j11) {
                            C7960e.m41971c6().m42461m4(MoreTabView.this.f63496q1);
                            MoreTabView moreTabView2 = MoreTabView.this;
                            moreTabView2.f63490k1 = 0L;
                            moreTabView2.f63484e1.setVisibility(8);
                            AbstractC23309i.m122149lx(false);
                            AbstractC23309i.m121960gx(false);
                            AbstractC23181q.m119434g();
                            return;
                        }
                        long j12 = j11 - currentTimeMillis;
                        MoreTabView moreTabView3 = MoreTabView.this;
                        long j13 = moreTabView3.f63490k1;
                        if (j13 <= 0 || j13 > j12) {
                            moreTabView3.f63490k1 = j12;
                        }
                        moreTabView3.f63484e1.setVisibility(0);
                        MoreTabView.this.f63484e1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.more.e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MoreTabView.C12163d.this.m68079g(view);
                            }
                        });
                        MoreTabView.this.f63484e1.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.maintab.more.f
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                boolean m68080h;
                                m68080h = MoreTabView.C12163d.this.m68080h(view);
                                return m68080h;
                            }
                        });
                        MoreTabView.this.f63484e1.post(new Runnable() { // from class: com.zing.zalo.ui.maintab.more.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                MoreTabView.C12163d.this.m68081i();
                            }
                        });
                        MoreTabView.this.f63487h1.setText(c31937h.m153494o());
                        MoreTabView.this.f63488i1.setText(c31937h.m153486g());
                        MoreTabView moreTabView4 = MoreTabView.this;
                        ((C23528a) moreTabView4.f63483d1.m123612r(moreTabView4.f63485f1)).m123618x(c31937h.m153493n(), C23278z2.m120137l());
                        MoreTabView.this.m68050dN();
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            AbstractC23309i.m122149lx(false);
            AbstractC23309i.m121960gx(false);
            AbstractC23181q.m119434g();
            MoreTabView.this.f63484e1.setVisibility(8);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                final ArrayList m42302W6 = C7960e.m41971c6().m42302W6(51, 1);
                MoreTabView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.maintab.more.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        MoreTabView.C12163d.this.m68082j(m42302W6);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$e */
    /* loaded from: classes5.dex */
    public class C12164e implements InterfaceC20094a {
        C12164e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MoreTabView moreTabView = MoreTabView.this;
            moreTabView.f63497r1 = false;
            moreTabView.mo49315c4();
            ToastUtils.showMess(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            MoreTabView moreTabView = MoreTabView.this;
            moreTabView.f63497r1 = false;
            moreTabView.mo49315c4();
            try {
                C7960e.m41971c6().m42461m4(MoreTabView.this.f63496q1);
                AbstractC23309i.m122149lx(false);
                AbstractC23309i.m121960gx(false);
                AbstractC23181q.m119434g();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            AbstractC2364o0.m12372o(MoreTabView.this.f72421L0.m92676n2(), MoreTabView.this.f63484e1, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$f */
    /* loaded from: classes5.dex */
    public class C12165f extends AbstractC23803b {
        C12165f() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            MoreTabView.this.m68018QM(str3, str4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$g */
    /* loaded from: classes5.dex */
    public class C12166g extends AbstractC24788n {
        C12166g() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            MoreTabView.this.m68018QM(str, str2, interfaceC24785k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.more.MoreTabView$h */
    /* loaded from: classes5.dex */
    public class C12167h implements InterfaceC20094a {
        C12167h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m68085e(boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            try {
                if (!MoreTabView.this.f72421L0.m92677nJ() && !MoreTabView.this.f72421L0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        MoreTabView.this.f72421L0.m92676n2().mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    MoreTabView.this.f72421L0.m92662fJ().m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m68086f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (MoreTabView.this.f63465M1) {
                    MoreTabView moreTabView = MoreTabView.this;
                    moreTabView.f63467N1 = false;
                    moreTabView.f72421L0.mo49315c4();
                }
                if (MoreTabView.this.f72421L0.m92677nJ() || MoreTabView.this.f72421L0.m92681pJ() || AbstractC23216t1.m119643h(MoreTabView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.maintab.more.i
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        MoreTabView.C12167h.m68086f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final boolean z11;
            final boolean z12;
            final boolean z13;
            try {
                synchronized (MoreTabView.this.f63465M1) {
                    MoreTabView moreTabView = MoreTabView.this;
                    moreTabView.f63467N1 = false;
                    moreTabView.f72421L0.mo49315c4();
                }
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObject.optInt("error_code", -999) == 0 && optJSONObject != null) {
                        boolean optBoolean = optJSONObject.optBoolean("isset_pwd");
                        AbstractC23304d.f113346X0 = optBoolean ? 1 : 0;
                        AbstractC23309i.m122550wp(optBoolean ? 1 : 0);
                        if (optJSONObject.optInt("allow_change_phonenumber", 0) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (optJSONObject.optInt("unmap_profile", 0) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (optJSONObject.optInt("bypass_verify_pwd", 0) == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        final JSONArray optJSONArray = optJSONObject.optJSONArray("valid_error");
                        if (MoreTabView.this.f72421L0.m92676n2() != null) {
                            MoreTabView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.maintab.more.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MoreTabView.C12167h.this.m68085e(z11, z12, z13, optJSONArray);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: AM */
    private void m68008AM() {
        this.f63453B1.mo9224q(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public void m68009DM() {
        if (this.f63503x1 != null) {
            m68045XM();
            this.f63503x1.setOnClickListener(this.f63459H1);
            this.f63503x1.setExternalScriptListener(this.f63460I1);
            this.f63503x1.setImageLoader(this.f63462K1);
            this.f63504y1.f91276m.m124373d(this.f63461J1);
            this.f63503x1.setLayoutGateway(this.f63504y1.f91276m);
            this.f63503x1.setInteractionTracker(new C17172p());
            this.f63503x1.m91668Z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m68010HM(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f63458G1) {
            this.f63458G1 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:12:0x0019, B:14:0x001f, B:19:0x0027, B:21:0x002a, B:23:0x0030, B:24:0x0038, B:26:0x0042, B:28:0x0046, B:30:0x0051, B:31:0x0054, B:34:0x005a, B:38:0x0064, B:40:0x006a, B:42:0x0074, B:44:0x0086, B:46:0x0092), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* renamed from: IM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m68011IM(int i11, Object[] objArr) {
        int i12;
        try {
            if (i11 != 44) {
                if (i11 != 6006) {
                    if (i11 != 12000) {
                        if (i11 != 60060) {
                            if (i11 == 110118 && m68038GM()) {
                                m68041SM(false);
                                return;
                            }
                            return;
                        }
                    } else {
                        if (objArr.length > 0) {
                            Object obj = objArr[0];
                            if (obj instanceof Integer) {
                                i12 = ((Integer) obj).intValue();
                                if (!MainTabView.m67645lM().m67717xM(i12)) {
                                    if (!this.f63454C1) {
                                        AbstractC20110a.m104535d("EventBus: ACTION_SHOW_ZALO_TAB\nfirst or resume case", new Object[0]);
                                        if (this.f63498s1) {
                                            m68043UM();
                                        }
                                    }
                                    this.f63454C1 = true;
                                    return;
                                }
                                if (i12 >= 0) {
                                    AbstractC20110a.m104535d("EventBus: ACTION_SHOW_ZALO_TAB\npause case", new Object[0]);
                                    this.f63454C1 = false;
                                    return;
                                }
                                return;
                            }
                        }
                        i12 = -1;
                        if (!MainTabView.m67645lM().m67717xM(i12)) {
                        }
                    }
                }
                this.f63473T0 = false;
                m68051eN();
                return;
            }
            String str = (String) objArr[0];
            if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125970n() && Arrays.asList(AbstractC28025b8.f130853j).contains(str)) {
                this.f63456E1.sendMessage(this.f63456E1.obtainMessage(0, str));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m68012JM(Boolean bool) {
        int i11;
        DiscoverySkeletonView discoverySkeletonView = this.f63474U0;
        if (discoverySkeletonView != null) {
            if (bool.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            discoverySkeletonView.setVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public /* synthetic */ void m68013KM(List list) {
        try {
            if (list.size() > 1 && this.f63478Y0 != null) {
                if (list.size() == 2) {
                    this.f63479Z0.m75731c((ContactProfile) list.get(1));
                    this.f63479Z0.setVisibility(0);
                    this.f63480a1.setVisibility(8);
                    this.f63481b1.setVisibility(8);
                    this.f63482c1.setVisibility(8);
                } else if (list.size() == 3) {
                    this.f63480a1.m75731c((ContactProfile) list.get(1));
                    this.f63479Z0.m75731c((ContactProfile) list.get(2));
                    this.f63479Z0.setVisibility(0);
                    this.f63480a1.setVisibility(0);
                    this.f63481b1.setVisibility(0);
                    this.f63482c1.setVisibility(8);
                } else if (list.size() > 3) {
                    this.f63480a1.setVisibility(0);
                    this.f63481b1.setVisibility(0);
                    this.f63480a1.m75731c((ContactProfile) list.get(1));
                    this.f63482c1.setVisibility(0);
                    this.f63482c1.setText(String.format("+%d", Integer.valueOf(list.size() - 1)));
                    this.f63479Z0.setVisibility(8);
                }
                this.f63478Y0.setTag(Boolean.TRUE);
                return;
            }
            this.f63479Z0.setImageResource(AbstractC16803z.icn_tabmore_signout);
            this.f63478Y0.setTag(Boolean.FALSE);
            this.f63479Z0.setVisibility(0);
            this.f63480a1.setVisibility(8);
            this.f63481b1.setVisibility(8);
            this.f63482c1.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m68014LM() {
        try {
            final List m119419e = AbstractC23179p8.m119419e();
            if (m92676n2() != null) {
                m92676n2().runOnUiThread(new Runnable() { // from class: s70.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MoreTabView.this.m68013KM(m119419e);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:12:0x0046, B:14:0x004f, B:15:0x0054, B:19:0x002f, B:20:0x0038, B:21:0x0010, B:24:0x001c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:12:0x0046, B:14:0x004f, B:15:0x0054, B:19:0x002f, B:20:0x0038, B:21:0x0010, B:24:0x001c), top: B:1:0x0000 }] */
    /* renamed from: MM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m68015MM(String str, String str2, InterfaceC24785k interfaceC24785k) {
        char c11;
        String str3;
        C31877d c31877d;
        try {
            int hashCode = str2.hashCode();
            if (hashCode != 1617653775) {
                if (hashCode == 1986893040 && str2.equals("action.open.inapp")) {
                    c11 = 0;
                    C17248z0 c17248z0 = null;
                    if (c11 == 0) {
                        if (c11 == 1) {
                            str = C18620i.Companion.m98406a(str, C18620i.f93674Q);
                        }
                        str3 = str;
                        c31877d = null;
                    } else {
                        C31877d c31877d2 = new C31877d();
                        c31877d2.m153185d(m68061xM(str));
                        str3 = str;
                        c31877d = c31877d2;
                    }
                    InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                    if (interfaceC24785k != null) {
                        c17248z0 = new C17248z0(str2, interfaceC24785k);
                    }
                    AbstractC28207v1.m141989h3(str2, 2, m92676n2, this, str3, c17248z0, "", null, c31877d);
                    return;
                }
                c11 = 65535;
                C17248z0 c17248z02 = null;
                if (c11 == 0) {
                }
                InterfaceC27218a m92676n22 = this.f72421L0.m92676n2();
                if (interfaceC24785k != null) {
                }
                AbstractC28207v1.m141989h3(str2, 2, m92676n22, this, str3, c17248z02, "", null, c31877d);
                return;
            }
            if (str2.equals("action.open.mp")) {
                c11 = 1;
                C17248z0 c17248z022 = null;
                if (c11 == 0) {
                }
                InterfaceC27218a m92676n222 = this.f72421L0.m92676n2();
                if (interfaceC24785k != null) {
                }
                AbstractC28207v1.m141989h3(str2, 2, m92676n222, this, str3, c17248z022, "", null, c31877d);
                return;
            }
            c11 = 65535;
            C17248z0 c17248z0222 = null;
            if (c11 == 0) {
            }
            InterfaceC27218a m92676n2222 = this.f72421L0.m92676n2();
            if (interfaceC24785k != null) {
            }
            AbstractC28207v1.m141989h3(str2, 2, m92676n2222, this, str3, c17248z0222, "", null, c31877d);
            return;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        e11.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m68016NM() {
        try {
            this.f63499t1.m8323M(33);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m68017OM() {
        ZinstantScrollViewImpl zinstantScrollViewImpl = this.f63499t1;
        if (zinstantScrollViewImpl != null) {
            zinstantScrollViewImpl.postDelayed(new Runnable() { // from class: s70.g
                @Override // java.lang.Runnable
                public final void run() {
                    MoreTabView.this.m68016NM();
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public void m68018QM(final String str, final String str2, final InterfaceC24785k interfaceC24785k) {
        this.f63505z1.execute(new Runnable() { // from class: s70.h
            @Override // java.lang.Runnable
            public final void run() {
                MoreTabView.this.m68015MM(str2, str, interfaceC24785k);
            }
        });
    }

    /* renamed from: VM */
    private void m68019VM(String str) {
        if (C23302b.f113247a.m120523d(str)) {
            int m12307a = C2343e.m12307a(CoreUtility.f89233i, false);
            this.f63466N0.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(AbstractC23304d.f113368c0.f42437s), m12307a));
            return;
        }
        ((C23528a) this.f63483d1.m123612r(this.f63466N0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
    }

    /* renamed from: bN */
    private void m68020bN() {
        this.f63453B1.mo9224q(Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001c, code lost:            if (r0.m14071d() == false) goto L4;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* renamed from: cN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68021cN() {
        boolean z11;
        GlowingReddot glowingReddot;
        ViewGroup viewGroup;
        int m118742r;
        Object m108755E = AbstractC20826v0.m108755E();
        if (!(m108755E instanceof C2972f2)) {
            if (m108755E instanceof C2973f3) {
                C2973f3 c2973f3 = (C2973f3) m108755E;
                if (!c2973f3.m14070c()) {
                }
            }
            z11 = false;
            glowingReddot = this.f63471R0;
            if (glowingReddot != null) {
                if (z11) {
                    glowingReddot.setVisibility(0);
                    if (AbstractC20826v0.m108814i0() && !this.f63473T0 && m92687sJ()) {
                        this.f63471R0.m44426f(4000L);
                        this.f63473T0 = true;
                    }
                } else {
                    glowingReddot.m44427g();
                    this.f63471R0.setVisibility(8);
                }
            }
            viewGroup = this.f63472S0;
            if (viewGroup == null) {
                if (z11) {
                    m118742r = 0;
                } else {
                    m118742r = AbstractC23136l9.m118742r(7.0f);
                }
                viewGroup.setPadding(m118742r, 0, 0, 0);
                return;
            }
            return;
        }
        z11 = true;
        glowingReddot = this.f63471R0;
        if (glowingReddot != null) {
        }
        viewGroup = this.f63472S0;
        if (viewGroup == null) {
        }
    }

    /* renamed from: yM */
    private String m68033yM() {
        Object m108755E = AbstractC20826v0.m108755E();
        if (m108755E instanceof C2972f2) {
            String m108785T = AbstractC20826v0.m108785T();
            if (TextUtils.isEmpty(m108785T)) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_stt_default_when_empty);
            }
            return m108785T;
        }
        if (m108755E instanceof C2973f3) {
            if (!((C2973f3) m108755E).m14070c()) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_promote_profile);
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_stt_default_when_empty);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_stt_default_when_empty);
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

    /* renamed from: BM */
    void m68034BM() {
        C0824j.m2153b(new C12163d());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        try {
            super.mo37111CJ(bundle);
            this.f63498s1 = true;
            if (C24099q0.m125958k().m125961b()) {
                this.f72830E0 = C24099q0.m125958k().m125966g();
            }
            if (C24099q0.m125958k().m125964e()) {
                this.f72830E0 = C24099q0.m125958k().m125970n();
            }
            if (this.f72421L0.m92642L3() != null) {
                this.f72830E0 = this.f72421L0.m92642L3().getInt("position");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CM */
    void m68035CM(View view) {
        int i11;
        try {
            this.f63483d1 = new C23528a(this.f72421L0.m92648SI());
            this.f63468O0.setOnClickListener(this);
            view.findViewById(AbstractC6918a0.imgButtonSetting).setOnClickListener(this);
            view.findViewById(AbstractC6918a0.imgButtonPrivacy).setOnClickListener(this);
            view.findViewById(AbstractC6918a0.layout_qrcode_container).setOnClickListener(this);
            boolean m121849e = AbstractC23309i.m121849e();
            View view2 = this.f63475V0;
            if (m121849e) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view2.setVisibility(i11);
            this.f63475V0.setOnClickListener(this);
        } catch (Exception e11) {
            e11.printStackTrace();
            mo68062yC();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C8009j c8009j = null;
        if (i11 == 101) {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.content_dialog_unmap, (ViewGroup) null, false);
                aVar.m43177z(inflate);
                ((TextView) inflate.findViewById(AbstractC6918a0.tvContent)).setText(AbstractC8020f0.str_content_dialog_unmap_deactivate_account);
                inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(this);
                inflate.findViewById(AbstractC6918a0.btn_change_phone).setOnClickListener(this);
                inflate.findViewById(AbstractC6918a0.see_more).setOnClickListener(this);
                c8009j = aVar.m43152a();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (c8009j == null) {
            return super.mo39014DJ(i11);
        }
        return c8009j;
    }

    /* renamed from: EM */
    void m68036EM(View view) {
        this.f63499t1 = (ZinstantScrollViewImpl) view.findViewById(AbstractC6918a0.parentScrollView);
        this.f63466N0 = (AvatarImageView) view.findViewById(AbstractC6918a0.image_profile);
        this.f63468O0 = view.findViewById(AbstractC6918a0.rlayout_myInfo);
        this.f63469P0 = (TextView) view.findViewById(AbstractC6918a0.tv_dpn);
        this.f63470Q0 = (TextView) view.findViewById(AbstractC6918a0.tv_mystatus);
        GlowingReddot glowingReddot = (GlowingReddot) view.findViewById(AbstractC6918a0.glowing_reddot);
        this.f63471R0 = glowingReddot;
        glowingReddot.m44424c(AbstractC23136l9.m118742r(10.0f), Color.parseColor("#ff565d"), ZAbstractBase.ZVU_PROCESS_FLUSH, 0, 1, 3, 300);
        this.f63471R0.setTopLayerSize(AbstractC23136l9.m118742r(6.0f));
        this.f63471R0.setTopLayerColor(Color.parseColor("#ff565d"));
        this.f63471R0.setBottomLayerSize(AbstractC23136l9.m118742r(8.0f));
        GlowingReddot glowingReddot2 = this.f63471R0;
        glowingReddot2.setBottomLayerColor(C23212s8.m119607o(glowingReddot2.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        this.f63472S0 = (ViewGroup) view.findViewById(AbstractC6918a0.tv_status_container);
        this.f63474U0 = (DiscoverySkeletonView) view.findViewById(AbstractC6918a0.skeletonView);
        this.f63485f1 = (RecyclingImageView) view.findViewById(AbstractC6918a0.imvAdsAvatar);
        this.f63486g1 = (ImageView) view.findViewById(AbstractC6918a0.imvHideAdMenu);
        this.f63487h1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvAdsTitle);
        this.f63488i1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvAdsDesc);
        this.f63484e1 = view.findViewById(AbstractC6918a0.layoutAdsBanner);
        this.f63476W0 = view.findViewById(AbstractC6918a0.separate_line_nearby);
        this.f63475V0 = view.findViewById(AbstractC6918a0.layout_nearby_container);
        View findViewById = view.findViewById(AbstractC6918a0.btn_my_qr_code);
        this.f63477X0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f63501v1 = (LinearLayout) view.findViewById(AbstractC6918a0.layout_child_scrollView);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.elements_feature);
        this.f63502w1 = linearLayout;
        AbstractC23136l9.m118744r1(linearLayout, 8);
        this.f63478Y0 = view.findViewById(AbstractC6918a0.ll_switch_account);
        this.f63479Z0 = (GroupAvatarView) view.findViewById(AbstractC6918a0.switch_account);
        this.f63480a1 = (GroupAvatarView) view.findViewById(AbstractC6918a0.switch_account_2);
        this.f63482c1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_switch_account);
        CircleImage circleImage = (CircleImage) view.findViewById(AbstractC6918a0.bg_switch_account_2);
        this.f63481b1 = circleImage;
        circleImage.m87723j(C23212s8.m119607o(circleImage.getContext(), AbstractC16781w.PrimaryBackgroundColor), 255);
        this.f63478Y0.setOnClickListener(this);
        if (AbstractC23309i.m121529Vf()) {
            this.f63477X0.setVisibility(4);
            this.f63478Y0.setVisibility(0);
            this.f63479Z0.setImageResource(AbstractC16803z.icn_tabmore_signout);
            this.f63478Y0.setTag(Boolean.FALSE);
            this.f63479Z0.setVisibility(0);
            this.f63480a1.setVisibility(8);
            this.f63481b1.setVisibility(8);
            this.f63482c1.setVisibility(8);
            if (this.f63477X0.getLayoutParams() != null) {
                ((RelativeLayout.LayoutParams) this.f63477X0.getLayoutParams()).setMargins(AbstractC23136l9.m118742r(24.0f), 0, 0, 0);
            }
        } else {
            this.f63478Y0.setVisibility(8);
            this.f63477X0.setVisibility(0);
            if (this.f63477X0.getLayoutParams() != null) {
                ((RelativeLayout.LayoutParams) this.f63477X0.getLayoutParams()).setMargins(0, 0, 0, 0);
            }
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(AbstractC6918a0.layout_monitor_perf_container);
        this.f63452A1 = linearLayout2;
        linearLayout2.setOnClickListener(this);
        this.f63453B1.m9219j(this, new InterfaceC1764d0() { // from class: s70.a
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MoreTabView.this.m68012JM((Boolean) obj);
            }
        });
    }

    /* renamed from: FM */
    void m68037FM(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f63500u1 = (LinearLayout) view.findViewById(AbstractC6918a0.feature_html_container);
        this.f63500u1.setLayoutTransition(new LayoutTransition());
        int size = C21242e.m110039d().m110044e().size();
        for (int i11 = 0; i11 < size; i11++) {
            FeatureHtmlItemView featureHtmlItemView = (FeatureHtmlItemView) layoutInflater.inflate(AbstractC7409c0.more_tab_item_layout, viewGroup, false);
            featureHtmlItemView.m79492a(this.f72421L0.m92676n2(), (C21238a) C21242e.m110039d().m110044e().get(i11));
            this.f63500u1.addView(featureHtmlItemView);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.more_tab_layout, viewGroup, false);
        m68036EM(inflate);
        m68037FM(inflate, layoutInflater, viewGroup);
        m68035CM(inflate);
        this.f63504y1 = C18020c.m95817m();
        this.f63505z1 = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ClickZInstant"));
        DiscoveryZinstantLayout discoveryZinstantLayout = this.f63503x1;
        if (discoveryZinstantLayout != null) {
            discoveryZinstantLayout.onStop();
        }
        C3568b.m18124b().m18127d(new C12162c());
        return inflate;
    }

    /* renamed from: GM */
    boolean m68038GM() {
        C18020c c18020c;
        if (this.f63503x1 != null && (c18020c = this.f63504y1) != null && c18020c.m95839v()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        ExecutorService executorService = this.f63505z1;
        if (executorService != null) {
            executorService.shutdown();
        }
        C18020c c18020c = this.f63504y1;
        if (c18020c != null) {
            c18020c.m95828K(null);
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        try {
            C28685a.m143693b(this.f72421L0.m92648SI()).m143697e(this.f63457F1);
            C23744a.m124114c().m124117e(this, 6006);
            C23744a.m124114c().m124117e(this, 60060);
            C23744a.m124114c().m124117e(this, 12000);
            C23744a.m124114c().m124117e(this, 110118);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63451O1, e11);
        }
        super.mo40200KJ();
    }

    /* renamed from: PM */
    public void m68039PM(boolean z11) {
        if (m92687sJ()) {
            if (z11) {
                m68057tM();
                if (m68038GM() && C23055e5.m118271f()) {
                    m68041SM(false);
                    return;
                }
                return;
            }
            m68056sM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            if (this.f63495p1.booleanValue() && this.f63494o1 != null) {
                this.f72421L0.m92648SI().unregisterReceiver(this.f63494o1);
                this.f63495p1 = Boolean.FALSE;
            }
            C23744a.m124114c().m124117e(this, 44);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RM */
    void m68040RM(C26715g c26715g) {
        try {
            if (this.f72421L0.m92650VI() != null && c26715g != null && c26715g.m137377g() == 51) {
                C18452n c18452n = new C18452n(c26715g);
                if (this.f72421L0.m92676n2() != null) {
                    AbstractC28207v1.m141999j3(51, c18452n, this.f72421L0.m92676n2().mo35579p(), 0, this.f72421L0.m92676n2());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putBoolean("EXTRA_IS_DICOVERY_TAB", this.f63464M0);
    }

    /* renamed from: SM */
    void m68041SM(boolean z11) {
        if (z11) {
            this.f63456E1.removeMessages(1);
            this.f63456E1.sendEmptyMessage(1);
        } else {
            long max = Math.max(0L, (this.f63455D1 + 5000) - System.currentTimeMillis());
            this.f63456E1.removeMessages(1);
            this.f63456E1.sendEmptyMessageDelayed(1, max);
        }
    }

    /* renamed from: TM */
    public void m68042TM(boolean z11) {
        LinearLayout linearLayout = this.f63502w1;
        if (linearLayout != null && linearLayout.getVisibility() == 0 && this.f63500u1 != null) {
            if (C21242e.m110039d().f103530b.get() || z11) {
                this.f63500u1.removeAllViews();
                int size = C21242e.m110039d().m110044e().size();
                for (int i11 = 0; i11 < size; i11++) {
                    FeatureHtmlItemView featureHtmlItemView = (FeatureHtmlItemView) mo79283UI(this.f72421L0.m92642L3()).inflate(AbstractC7409c0.more_tab_item_layout, (ViewGroup) this.f72421L0.m92656bJ(), false);
                    featureHtmlItemView.m79492a(this.f72421L0.m92676n2(), (C21238a) C21242e.m110039d().m110044e().get(i11));
                    this.f63500u1.addView(featureHtmlItemView);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m68057tM();
    }

    /* renamed from: UM */
    public void m68043UM() {
        LinearLayout linearLayout;
        HashMap hashMap = new HashMap();
        if (m68038GM()) {
            this.f63503x1.m91974K();
        } else if (this.f63502w1.getVisibility() == 0 && (linearLayout = this.f63500u1) != null) {
            int childCount = linearLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (this.f63500u1.getChildAt(i11) instanceof FeatureHtmlItemView) {
                    FeatureHtmlItemView featureHtmlItemView = (FeatureHtmlItemView) this.f63500u1.getChildAt(i11);
                    featureHtmlItemView.m79504m();
                    C18618g m79498g = featureHtmlItemView.m79498g();
                    if (m79498g != null) {
                        hashMap.put(Integer.valueOf(featureHtmlItemView.getFeatureId().m98348a()), m79498g);
                    }
                }
            }
        }
        if (this.f63498s1 && AbstractC23309i.m122088ka() && C16792j.m89697d()) {
            AbstractC23350e.m122774d(f63451O1, "fetchPreloadInfoOnResume from more-tab");
            this.f63498s1 = false;
            C16792j.m89700i().m89706j(true, hashMap);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m68058uM();
    }

    /* renamed from: WM */
    public void m68044WM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: s70.e
                @Override // java.lang.Runnable
                public final void run() {
                    MoreTabView.this.m68017OM();
                }
            });
        }
    }

    /* renamed from: XM */
    void m68045XM() {
        if (this.f63462K1 == null) {
            this.f63462K1 = new C20592o(m92689tK(), C17210v.f87767a);
        }
        if (this.f63461J1 == null) {
            this.f63461J1 = new C17177r0();
        }
        if (this.f63459H1 == null) {
            this.f63459H1 = new C12165f();
        }
        if (this.f63460I1 == null) {
            this.f63460I1 = new C12166g();
        }
    }

    /* renamed from: YM */
    void m68046YM() {
        FindFriendDialogView m68065XK = FindFriendDialogView.m68065XK(4);
        if (m68065XK != null) {
            if (m68065XK.m92687sJ()) {
                m68065XK.dismiss();
            }
            m68065XK.m92602UK(this.f72421L0.m92649TI(), "dialog");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67669FN(C24099q0.m125958k().m125970n());
        }
        if (bundle != null) {
            this.f63464M0 = bundle.getBoolean("EXTRA_IS_DICOVERY_TAB", this.f63464M0);
        }
    }

    /* renamed from: ZM */
    void m68047ZM() {
        String str;
        try {
            str = new C31937h(new JSONObject(this.f63489j1.m137371a())).m153490k();
        } catch (Exception e11) {
            e11.printStackTrace();
            str = "";
        }
        FindFriendDialogView m68065XK = FindFriendDialogView.m68065XK(5);
        if (m68065XK != null) {
            if (m68065XK.m92687sJ()) {
                m68065XK.dismiss();
            }
            m68065XK.m68067ZK(this);
            if (TextUtils.isEmpty(str)) {
                str = this.f72421L0.m92652XI(AbstractC8020f0.str_unknow_owner_sticky);
            }
            m68065XK.m68068aL(str);
            m68065XK.m92602UK(this.f72421L0.m92649TI(), "dialog");
        }
    }

    /* renamed from: a7 */
    void m68048a7() {
        try {
            synchronized (this.f63465M1) {
                try {
                    if (this.f63467N1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    synchronized (this.f63465M1) {
                        this.f63467N1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C12167h());
                    c0766k.mo1743t7(1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aN */
    public void m68049aN(boolean z11) {
        int i11;
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        View view = this.f63484e1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC2364o0.m12372o(m92676n2, view, i11);
    }

    /* renamed from: dN */
    void m68050dN() {
        this.f63492m1 = PendingIntent.getBroadcast(this.f72421L0.m92648SI(), 0, new Intent("com.zing.zalo.ACTION_CHECK_DELETE_EXPIRE_TIME_STICKY_ADS"), AbstractC19601a.m102571a(0));
        AlarmManager alarmManager = (AlarmManager) this.f72421L0.m92648SI().getSystemService("alarm");
        this.f63491l1 = alarmManager;
        if (this.f63490k1 > 0 && this.f63492m1 != null && alarmManager != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) this.f63490k1);
            this.f63491l1.set(0, calendar.getTimeInMillis(), this.f63492m1);
        }
    }

    /* renamed from: eN */
    public void m68051eN() {
        try {
            if (this.f63464M0) {
                this.f63468O0.setVisibility(8);
                return;
            }
            this.f63468O0.setVisibility(0);
            if (AbstractC23304d.f113368c0 == null) {
                String m121675Zd = AbstractC23309i.m121675Zd();
                if (!TextUtils.isEmpty(m121675Zd)) {
                    AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
                }
            }
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                    m68019VM(AbstractC23304d.f113368c0.f42446v);
                }
                if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42437s)) {
                    this.f63469P0.setText(AbstractC23304d.f113368c0.f42437s);
                }
                this.f63470Q0.setText(m68033yM());
                this.f63470Q0.setVisibility(0);
                m68021cN();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zinstant.discovery.DiscoveryZinstantLayout.InterfaceC17143b
    /* renamed from: fB */
    public void mo68052fB() {
        m68008AM();
        this.f63502w1.setVisibility(8);
        if (this.f63503x1.getParent() == null) {
            this.f63501v1.addView(this.f63503x1, new RelativeLayout.LayoutParams(-1, -1));
        }
        this.f63503x1.setVisibility(0);
        if (this.f72421L0.m92672lJ() && m92687sJ()) {
            m68057tM();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f63451O1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        C17487o0 c17487o0;
        if (i11 != 11) {
            switch (i11) {
                case 202:
                    if (C16792j.m89700i().m89703c()) {
                        C23177p6 m119386c = C23177p6.m119386c();
                        C18613b c18613b = C18613b.f93600s;
                        if (m119386c.m119391d(c18613b) == null || !C23177p6.m119386c().m119391d(c18613b).m119398b()) {
                            this.f63498s1 = true;
                            return;
                        }
                        return;
                    }
                    return;
                case 203:
                    if (C16792j.m89700i().m89703c()) {
                        C23177p6 m119386c2 = C23177p6.m119386c();
                        C18613b c18613b2 = C18613b.f93601t;
                        if (m119386c2.m119391d(c18613b2) == null || !C23177p6.m119386c().m119391d(c18613b2).m119398b()) {
                            this.f63498s1 = true;
                            return;
                        }
                        return;
                    }
                    return;
                case 204:
                    if (C16792j.m89700i().m89703c()) {
                        C23177p6 m119386c3 = C23177p6.m119386c();
                        C18613b c18613b3 = C18613b.f93599r;
                        if (m119386c3.m119391d(c18613b3) == null || !C23177p6.m119386c().m119391d(c18613b3).m119398b()) {
                            this.f63498s1 = true;
                            return;
                        }
                        return;
                    }
                    return;
                case 205:
                    if (C16792j.m89700i().m89703c()) {
                        C23177p6 m119386c4 = C23177p6.m119386c();
                        C18613b c18613b4 = C18613b.f93602u;
                        if (m119386c4.m119391d(c18613b4) == null || !C23177p6.m119386c().m119391d(c18613b4).m119398b()) {
                            this.f63498s1 = true;
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        if (!AbstractC23059e9.m118316E()) {
            if (AbstractC23309i.m122500vc()) {
                if (this.f72421L0.m92676n2() != null) {
                    c17487o0 = this.f72421L0.m92676n2().mo35579p();
                } else {
                    c17487o0 = null;
                }
                if (c17487o0 != null) {
                    c17487o0.m93069k2(NearbyZView.class, null, 1, true);
                    return;
                }
                return;
            }
            m68046YM();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        C17487o0 c17487o0;
        Bundle bundle = new Bundle();
        try {
            int id2 = view.getId();
            boolean z11 = false;
            String str2 = "";
            C17487o0 c17487o02 = null;
            if (id2 == AbstractC6918a0.rlayout_myInfo) {
                C32017m4.m154326S().m154359e0("1100");
                if (this.f72421L0.m92676n2() != null) {
                    c17487o02 = this.f72421L0.m92676n2().mo35579p();
                }
                if (c17487o02 != null) {
                    C32002l4 m154264g = C32002l4.m154264g(30001);
                    Object m108755E = AbstractC20826v0.m108755E();
                    if (m108755E instanceof C2972f2) {
                        str2 = "action.open.memorylist";
                    } else if (m108755E instanceof C2973f3) {
                        str2 = "action.open.story_archive";
                    }
                    AbstractC20826v0.m108813i();
                    AbstractC20826v0.m108815j();
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, m154264g).m135739F("1100").m135737D(str2).m135743b(), 0, 1));
                }
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.imgButtonSetting) {
                AbstractC23647d.m123907q("1500", "");
                if (this.f72421L0.m92676n2() != null) {
                    c17487o02 = this.f72421L0.m92676n2().mo35579p();
                }
                if (c17487o02 != null) {
                    c17487o02.m93069k2(SettingV2View.class, bundle, 1, true);
                }
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.imgButtonPrivacy) {
                AbstractC23647d.m123907q("1400", "");
                if (this.f72421L0.m92676n2() != null) {
                    c17487o02 = this.f72421L0.m92676n2().mo35579p();
                }
                if (c17487o02 != null) {
                    c17487o02.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                }
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.layout_nearby_container) {
                AbstractC23647d.m123907q("5300", "");
                if (AbstractC23059e9.m118316E()) {
                    m68060wM();
                } else if (AbstractC23309i.m122500vc()) {
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o0 = this.f72421L0.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    if (c17487o0 != null) {
                        c17487o0.m93069k2(NearbyZView.class, null, 1, true);
                    }
                } else {
                    m68046YM();
                }
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.layout_qrcode_container) {
                AbstractC23647d.m123907q("5400", "");
                if (this.f72421L0.m92676n2() != null) {
                    c17487o02 = this.f72421L0.m92676n2().mo35579p();
                }
                if (c17487o02 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("extra_src", 2);
                    AbstractC26412d.m136219h(m92676n2(), bundle2, 0);
                }
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.btn_my_qr_code) {
                if (this.f72421L0.m92676n2() != null) {
                    c17487o02 = this.f72421L0.m92676n2().mo35579p();
                }
                if (c17487o02 != null) {
                    bundle.putString("extra_tracking_source", new TrackingSource(12).m40686z());
                    c17487o02.m93069k2(UpdateStatusView.class, bundle, 1, true);
                }
                AbstractC23647d.m123897g("50010");
                return;
            }
            if (id2 == AbstractC6918a0.ll_switch_account) {
                this.f72421L0.m92676n2().mo35573l4(SwitchAccountView.class, null, 1, true);
                View view2 = this.f63478Y0;
                if (view2 != null && ((Boolean) view2.getTag()).booleanValue()) {
                    z11 = true;
                }
                C32017m4 m154326S = C32017m4.m154326S();
                if (z11) {
                    str = "36004";
                } else {
                    str = "36003";
                }
                m154326S.m154359e0(str);
                return;
            }
            if (id2 == AbstractC6918a0.btn_change_phone) {
                this.f72421L0.removeDialog(101);
                m68048a7();
                AbstractC23647d.m123897g("199719");
                return;
            }
            if (id2 == AbstractC6918a0.btn_close) {
                this.f72421L0.removeDialog(101);
                AbstractC23647d.m123897g("199720");
                return;
            }
            if (id2 == AbstractC6918a0.see_more) {
                this.f72421L0.removeDialog(101);
                bundle.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
                ZaloWebView.m87105iS(this.f72421L0.m92676n2(), AbstractC23306f.m120583H().m110204g().f110080o, bundle);
                AbstractC23647d.m123897g("199718");
                return;
            }
            if (id2 == AbstractC6918a0.layout_monitor_perf_container) {
                try {
                    m92641HK(new Intent(m92648SI(), Class.forName("com.zing.zalo.zamtool.presentation.MainActivity")));
                } catch (ClassNotFoundException e11) {
                    AbstractC23350e.m122776f(f63451O1, e11);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m68038GM()) {
            m68041SM(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        long currentTimeMillis;
        long m153487h;
        super.onResume();
        m68057tM();
        try {
            if (!this.f63495p1.booleanValue() && this.f72421L0.m92648SI() != null) {
                AbstractC2351i.m12327a(this.f72421L0.m92648SI(), this.f63494o1, new IntentFilter("com.zing.zalo.ACTION_CHECK_DELETE_EXPIRE_TIME_STICKY_ADS"), true);
                this.f63495p1 = Boolean.TRUE;
            }
            this.f63452A1.setVisibility(8);
            m68051eN();
            View view = this.f63484e1;
            if (view != null && view.getVisibility() == 0) {
                C26715g c26715g = this.f63489j1;
                if (c26715g != null) {
                    this.f63496q1 = c26715g.m137372b();
                    C31937h c31937h = new C31937h(new JSONObject(this.f63489j1.m137371a()));
                    long m137375e = this.f63489j1.m137375e();
                    if (m137375e > 0) {
                        currentTimeMillis = System.currentTimeMillis() - m137375e;
                        m153487h = c31937h.m153483d();
                    } else {
                        currentTimeMillis = System.currentTimeMillis() - this.f63489j1.m137376f();
                        m153487h = c31937h.m153487h();
                    }
                    long j11 = m153487h * 60000;
                    if (currentTimeMillis < 0) {
                        currentTimeMillis = 0;
                    }
                    if (currentTimeMillis >= j11) {
                        C7960e.m41971c6().m42461m4(this.f63496q1);
                        this.f63490k1 = 0L;
                        this.f63484e1.setVisibility(8);
                        AbstractC23309i.m122149lx(false);
                        AbstractC23309i.m121960gx(false);
                        AbstractC23181q.m119434g();
                        return;
                    }
                    long j12 = j11 - currentTimeMillis;
                    long j13 = this.f63490k1;
                    if (j13 <= 0 || j13 > j12) {
                        this.f63490k1 = j12;
                    }
                } else {
                    this.f63484e1.setVisibility(8);
                    AbstractC23309i.m122149lx(false);
                    AbstractC23309i.m121960gx(false);
                    AbstractC23181q.m119434g();
                }
                View view2 = this.f63484e1;
                if (view2 != null && view2.getVisibility() == 0) {
                    m68050dN();
                }
            }
            if (m68038GM()) {
                if (C23055e5.m118271f() && this.f63454C1) {
                    m68041SM(false);
                }
            } else {
                C23177p6.m119386c().m119393f();
                m68042TM(false);
            }
            m68043UM();
            C23744a.m124114c().m124115b(this, 44);
            if (AbstractC23309i.m121529Vf()) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: s70.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        MoreTabView.this.m68014LM();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pM */
    public void m68053pM() {
        C26715g c26715g;
        try {
            View view = this.f63484e1;
            if (view != null && view.getVisibility() == 0 && (c26715g = this.f63489j1) != null && c26715g.m137377g() == 51) {
                C31937h c31937h = new C31937h(new JSONObject(this.f63489j1.m137371a()));
                C28905e.m144373n().m144402x(this.f63489j1.m137372b() + "", 10, 3, C23793c.m124316k().mo124311f(), c31937h.f146757t);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    public void m68054qM(String str) {
        boolean z11;
        int i11 = 0;
        while (true) {
            String[] strArr = AbstractC28025b8.f130853j;
            if (i11 < strArr.length) {
                String str2 = strArr[i11];
                if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                    C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                    if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    View m68063zM = m68063zM(str2);
                    str2.hashCode();
                    if (str2.equals("tip.more.qr_code") && m68063zM != null && (m68063zM instanceof ActionBarMenuItem)) {
                        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) m68063zM;
                        AbstractC28045d8.m141481b(actionBarMenuItem.getIconView(), m141453i, this.f63483d1, AbstractC16803z.icon_header_qrcode);
                        actionBarMenuItem.setEnableNoti(z11);
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    /* renamed from: rM */
    public void m68055rM(String str, int i11) {
        try {
            if (!this.f72421L0.m92674mJ() || mo60294yp() || MainTabView.m67645lM() == null || MainTabView.m67645lM().m67696kM() != C24099q0.m125958k().m125970n() || MainTabView.m67645lM().f63219I1.m74707p()) {
                return;
            }
            Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130853j).iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                final C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c))) {
                    if (i11 == -1 || c28212v6.f131575a == i11) {
                        View m68063zM = m68063zM(c28212v6.f131577c);
                        if (m68063zM != null && !z11 && m68063zM.isShown()) {
                            this.f63458G1 = new ShowcaseView(m68063zM.getContext());
                            C26203c m134769a = C26203c.m134769a(m68063zM.getContext());
                            m134769a.m134770b(c28212v6, m68063zM.getContext());
                            m134769a.f124524o = m68063zM;
                            if (TextUtils.equals(c28212v6.f131577c, "tip.more.qr_code")) {
                                m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                            }
                            this.f63458G1.setConfigs(m134769a);
                            this.f63458G1.setShowcaseId(c28212v6.f131577c);
                            this.f63458G1.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: s70.c
                                @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                                /* renamed from: a */
                                public final void mo39159a(ShowcaseView showcaseView, int i12, int i13, boolean z12) {
                                    MoreTabView.this.m68010HM(c28212v6, showcaseView, i12, i13, z12);
                                }
                            });
                            this.f63458G1.setShowcaseManager(MainTabView.m67645lM().f63219I1);
                            this.f63458G1.m74637r();
                            z11 = true;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    void m68056sM() {
        if (m68038GM()) {
            this.f63503x1.onPause();
        }
    }

    /* renamed from: tM */
    void m68057tM() {
        DiscoveryZinstantLayout discoveryZinstantLayout;
        if (m92687sJ() && MainTabView.m67645lM() != null && MainTabView.m67645lM().m67710tM() && m68038GM() && (discoveryZinstantLayout = this.f63503x1) != null && discoveryZinstantLayout.getVisibility() == 0) {
            this.f63503x1.onStart();
        }
    }

    /* renamed from: uM */
    void m68058uM() {
        if (m68038GM()) {
            this.f63503x1.onStop();
        }
    }

    /* renamed from: vM */
    public void m68059vM(boolean z11) {
        if (this.f63497r1) {
            return;
        }
        C0766k c0766k = new C0766k();
        C12164e c12164e = new C12164e();
        this.f63497r1 = true;
        mo46829Y();
        c0766k.mo1704o8(c12164e);
        c0766k.mo1415Da(3, this.f63496q1, z11);
    }

    /* renamed from: wM */
    public void m68060wM() {
        if (this.f72421L0.m92650VI() != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("showUpdateProfileHint", true);
            bundle.putBoolean("update", true);
            this.f72421L0.m92650VI().m92662fJ().m93066i2(UpdateUserInfoZView.class, bundle, 11, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, final Object... objArr) {
        this.f63456E1.post(new Runnable() { // from class: s70.b
            @Override // java.lang.Runnable
            public final void run() {
                MoreTabView.this.m68011IM(i11, objArr);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f63494o1 = new UpdateListener();
        boolean m121636Yb = AbstractC23309i.m121636Yb();
        this.f63493n1 = m121636Yb;
        if (m121636Yb) {
            m68034BM();
        }
        if (AbstractC23304d.f113368c0 != null) {
            m68051eN();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* renamed from: xM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Bundle m68061xM(String str) {
        JSONObject jSONObject;
        JSONException e11;
        String str2;
        int i11;
        int i12;
        int i13 = 0;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e12) {
            jSONObject = null;
            e11 = e12;
        }
        try {
            str2 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        } catch (JSONException e13) {
            e11 = e13;
            str2 = "";
            AbstractC20110a.m104539h(e11);
            i11 = 0;
            if (i11 != 2) {
            }
        }
        try {
            i11 = jSONObject.optInt("feature", 0);
        } catch (JSONException e14) {
            e11 = e14;
            AbstractC20110a.m104539h(e11);
            i11 = 0;
            if (i11 != 2) {
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("EXTRA_FEATURE_ID", new C18613b(i11));
                        bundle.putString("EXTRA_SOURCE_PARAM", "");
                        bundle.putInt("EXTRA_SOURCE_LINK", 262);
                        bundle.putString("EXTRA_WEB_URL", str2);
                        bundle.putBoolean("MORE_TAB_VIEW_CLASS", true);
                        return bundle;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("EXTRA_FEATURE_ID", C18613b.f93602u);
                    bundle2.putString("EXTRA_SOURCE_PARAM", "");
                    bundle2.putInt("EXTRA_SOURCE_LINK", 262);
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("EXTRA_WEB_URL", str2);
                    }
                    bundle2.putBoolean("MORE_TAB_VIEW_CLASS", true);
                    bundle2.putInt(C31877d.f146414i, 205);
                    return bundle2;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("EXTRA_FEATURE_ID", C18613b.f93601t);
                if (!TextUtils.isEmpty(str2)) {
                    bundle3.putString("EXTRA_WEB_URL", str2);
                    i12 = 254;
                } else {
                    i12 = 252;
                }
                bundle3.putInt("EXTRA_SOURCE_LINK", i12);
                bundle3.putBoolean("MORE_TAB_VIEW_CLASS", true);
                bundle3.putInt(C31877d.f146414i, 203);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (jSONObject != null) {
                        i13 = jSONObject.optInt("open_source", 0);
                    }
                    jSONObject2.put("open_source", i13);
                    bundle3.putString("extra_param_info", jSONObject2.toString());
                } catch (JSONException e15) {
                    AbstractC20110a.m104539h(e15);
                }
                return bundle3;
            }
            Bundle bundle4 = new Bundle();
            bundle4.putSerializable("EXTRA_FEATURE_ID", C18613b.f93600s);
            if (!TextUtils.isEmpty(str2)) {
                bundle4.putString("EXTRA_WEB_URL", str2);
            }
            bundle4.putInt("EXTRA_SOURCE_LINK", 130);
            bundle4.putBoolean("MORE_TAB_VIEW_CLASS", true);
            bundle4.putInt(C31877d.f146414i, 202);
            return bundle4;
        }
        Bundle bundle5 = new Bundle();
        bundle5.putSerializable("EXTRA_FEATURE_ID", C18613b.f93599r);
        bundle5.putInt("EXTRA_SOURCE_LINK", 262);
        if (!TextUtils.isEmpty(str2)) {
            bundle5.putString("EXTRA_WEB_URL", str2);
        }
        bundle5.putBoolean("MORE_TAB_VIEW_CLASS", true);
        bundle5.putInt(C31877d.f146414i, 204);
        return bundle5;
    }

    @Override // com.zing.zalo.zinstant.discovery.DiscoveryZinstantLayout.InterfaceC17143b
    /* renamed from: yC */
    public void mo68062yC() {
        m68020bN();
        this.f63502w1.setVisibility(8);
        this.f63503x1.setVisibility(8);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.ACTION_CHECK_REFRESH_STICKY_ADS");
            intentFilter.addAction("com.zing.zalo.ACTION_SCROLL_TO_LAYOUT_MYPROFILE");
            intentFilter.addAction("com.zing.zalo.ACTION_NEW_NOTIFY_REDDOT");
            intentFilter.addAction("com.zing.zalo.ACTION_HAS_PRELOAD_INFO_UPDATED");
            intentFilter.addAction("com.zing.zalo.ACTION_UPDATE_FEATURE_HTML");
            C28685a.m143693b(zaloActivity).m143695c(this.f63457F1, intentFilter);
            C23744a.m124114c().m124115b(this, 6006);
            C23744a.m124114c().m124115b(this, 60060);
            C23744a.m124114c().m124115b(this, 12000);
            C23744a.m124114c().m124115b(this, 110118);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63451O1, e11);
        }
    }

    /* renamed from: zM */
    public View m68063zM(String str) {
        if (!"tip.more.qr_code".equals(str) || MainTabView.m67645lM() == null || MainTabView.m67645lM().f63258t1 == null) {
            return null;
        }
        return MainTabView.m67645lM().f63258t1;
    }
}
