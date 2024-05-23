package com.zing.zalo.p077ui.maintab.group;

import ac.InterfaceC0733x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.group.GroupTabParentView;
import com.zing.zalo.p077ui.maintab.widget.MainTabChildView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19637j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import o70.C24099q0;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p594w1.C28685a;
import qm0.AbstractC25368s;
import rc0.InterfaceC25728a;
import sa0.C26203c;
import vg.AbstractC28025b8;
import vg.AbstractC28045d8;
import vg.C28212v6;

/* loaded from: classes5.dex */
public final class GroupTabParentView extends MainTabChildView implements ViewPager.InterfaceC6875j, MainTabView.InterfaceC12111i, C23744a.c, InterfaceC0733x {
    public static final C12120a Companion = new C12120a(null);

    /* renamed from: X0 */
    private static final String f63306X0;

    /* renamed from: M0 */
    private C23528a f63307M0;

    /* renamed from: N0 */
    private ViewPagerCustomSwipeable f63308N0;

    /* renamed from: O0 */
    private C12134a f63309O0;

    /* renamed from: P0 */
    private View f63310P0;

    /* renamed from: Q0 */
    private View[] f63311Q0;

    /* renamed from: R0 */
    private View[] f63312R0;

    /* renamed from: S0 */
    private View[] f63313S0;

    /* renamed from: T0 */
    private View[] f63314T0;

    /* renamed from: U0 */
    private Handler f63315U0 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: q70.c
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m67755qM;
            m67755qM = GroupTabParentView.m67755qM(GroupTabParentView.this, message);
            return m67755qM;
        }
    });

    /* renamed from: V0 */
    private GroupTabParentView$mLocalReceiver$1 f63316V0 = new BroadcastReceiver() { // from class: com.zing.zalo.ui.maintab.group.GroupTabParentView$mLocalReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra;
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(intent, "intent");
            try {
                if (GroupTabParentView.this.f72421L0.m92674mJ() && !GroupTabParentView.this.f72421L0.m92677nJ()) {
                    String action = intent.getAction();
                    if (AbstractC19074t.m100204b(action, "com.zing.zalo.ACTION_SHOW_GROUP_SUBTAB")) {
                        int intExtra2 = intent.getIntExtra("tabIndex", 0);
                        if (intExtra2 < GroupTabParentView.C12121b.f63319b) {
                            GroupTabParentView.this.m67757iM(intExtra2);
                        }
                    } else if (AbstractC19074t.m100204b(action, "com.zing.zalo.ACTION_SHOW_NEW_GROUP_NOTI") && (intExtra = intent.getIntExtra("tabIndex", 0)) < GroupTabParentView.C12121b.f63319b && intExtra == 0 && AbstractC23309i.m122608y9() > 0) {
                        GroupTabParentView.this.m67763uM(intExtra, true);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GroupTabParentView.Companion.m67765a(), e11);
            }
        }
    };

    /* renamed from: W0 */
    private ShowcaseView f63317W0;

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabParentView$a */
    /* loaded from: classes5.dex */
    public static final class C12120a {
        private C12120a() {
        }

        public /* synthetic */ C12120a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m67765a() {
            return GroupTabParentView.f63306X0;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabParentView$b */
    /* loaded from: classes5.dex */
    public static final class C12121b {

        /* renamed from: a */
        public static final C12121b f63318a = new C12121b();

        /* renamed from: b */
        public static int f63319b = 1;

        private C12121b() {
        }
    }

    static {
        String name = GroupTabParentView.class.getName();
        AbstractC19074t.m100207e(name, "getName(...)");
        f63306X0 = name;
    }

    /* renamed from: jM */
    private final void m67751jM(int i11) {
        if (i11 < C12121b.f63319b) {
            if (AbstractC23309i.m122608y9() > 0) {
                ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63308N0;
                if (viewPagerCustomSwipeable == null) {
                    AbstractC19074t.m100223u("mViewPager");
                    viewPagerCustomSwipeable = null;
                }
                if (viewPagerCustomSwipeable.getCurrentItem() == i11) {
                    m67762tM(i11);
                } else {
                    m67763uM(i11, true);
                }
            }
            AbstractC23304d.f113292J2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m67752mM(GroupTabParentView groupTabParentView, C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(groupTabParentView, "this$0");
        if (showcaseView == groupTabParentView.f63317W0) {
            groupTabParentView.f63317W0 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* renamed from: nM */
    private final ZaloView m67753nM(int i11) {
        C12134a c12134a = null;
        if (i11 < 0) {
            return null;
        }
        C12134a c12134a2 = this.f63309O0;
        if (c12134a2 == null) {
            AbstractC19074t.m100223u("mTabAdapter");
            c12134a2 = null;
        }
        if (i11 >= c12134a2.mo35335g()) {
            return null;
        }
        C12134a c12134a3 = this.f63309O0;
        if (c12134a3 == null) {
            AbstractC19074t.m100223u("mTabAdapter");
        } else {
            c12134a = c12134a3;
        }
        return c12134a.m93128x(i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* renamed from: oM */
    private final View m67754oM(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2092605591:
                    if (str.equals("tip.message.compose.addfriend")) {
                        if (MainTabView.m67645lM() != null) {
                            return MainTabView.m67645lM().f63203A1;
                        }
                        return null;
                    }
                    break;
                case 1026464109:
                    if (str.equals("tip.message.compose.creategroup")) {
                        if (MainTabView.m67645lM() != null) {
                            return MainTabView.m67645lM().f63265z1;
                        }
                        return null;
                    }
                    break;
                case 1399233812:
                    if (str.equals("tip.message.compose.calendar")) {
                        if (MainTabView.m67645lM() != null) {
                            return MainTabView.m67645lM().f63211E1;
                        }
                        return null;
                    }
                    break;
                case 1676691636:
                    if (str.equals("tip.message.compose.scanqr")) {
                        if (MainTabView.m67645lM() != null) {
                            return MainTabView.m67645lM().f63205B1;
                        }
                        return null;
                    }
                    break;
                case 1875577267:
                    if (str.equals("tip.message.compose.zalopc")) {
                        if (MainTabView.m67645lM() != null) {
                            return MainTabView.m67645lM().f63207C1;
                        }
                        return null;
                    }
                    break;
            }
        }
        return m67760pM(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final boolean m67755qM(GroupTabParentView groupTabParentView, Message message) {
        AbstractC19074t.m100208f(groupTabParentView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        try {
            if (message.what == 0) {
                Object obj = message.obj;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                ShowcaseView showcaseView = groupTabParentView.f63317W0;
                if (showcaseView != null) {
                    AbstractC19074t.m100205c(showcaseView);
                    if (showcaseView.getParent() != null) {
                        ShowcaseView showcaseView2 = groupTabParentView.f63317W0;
                        AbstractC19074t.m100205c(showcaseView2);
                        if (AbstractC19074t.m100204b(str, showcaseView2.getShowcaseId())) {
                            ShowcaseView showcaseView3 = groupTabParentView.f63317W0;
                            AbstractC19074t.m100205c(showcaseView3);
                            showcaseView3.m74626d();
                            groupTabParentView.f63317W0 = null;
                        }
                    }
                }
                groupTabParentView.m67759lM(str, -1);
                groupTabParentView.m67758kM(str);
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m67756rM(int i11, GroupTabParentView groupTabParentView, View view) {
        AbstractC19074t.m100208f(groupTabParentView, "this$0");
        if (i11 == 0) {
            AbstractC23647d.m123897g("8011002");
        }
        C23744a.Companion.m124119a().m124116d(6074, new Object[0]);
        groupTabParentView.m67764vM(i11);
        groupTabParentView.m67751jM(i11);
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

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        try {
            super.mo37111CJ(bundle);
            this.f72830E0 = C24099q0.Companion.m125984a().m125967h();
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f72830E0 = m92642L3.getInt("position");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.grouptab_parent_view, viewGroup, false);
        View findViewById = inflate.findViewById(AbstractC6918a0.pager);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = (ViewPagerCustomSwipeable) findViewById;
        this.f63308N0 = viewPagerCustomSwipeable;
        if (viewPagerCustomSwipeable == null) {
            AbstractC19074t.m100223u("mViewPager");
            viewPagerCustomSwipeable = null;
        }
        viewPagerCustomSwipeable.addOnPageChangeListener(this);
        ViewPagerCustomSwipeable viewPagerCustomSwipeable2 = this.f63308N0;
        if (viewPagerCustomSwipeable2 == null) {
            AbstractC19074t.m100223u("mViewPager");
            viewPagerCustomSwipeable2 = null;
        }
        viewPagerCustomSwipeable2.setPageMarginDrawable(AbstractC23136l9.m118665N(inflate.getContext(), AbstractC16803z.slide_viewpager_seperate_line));
        ViewPagerCustomSwipeable viewPagerCustomSwipeable3 = this.f63308N0;
        if (viewPagerCustomSwipeable3 == null) {
            AbstractC19074t.m100223u("mViewPager");
            viewPagerCustomSwipeable3 = null;
        }
        viewPagerCustomSwipeable3.setPageMargin(m92651WI().getDimensionPixelSize(AbstractC16802y.page_margin_width));
        ViewPagerCustomSwipeable viewPagerCustomSwipeable4 = this.f63308N0;
        if (viewPagerCustomSwipeable4 == null) {
            AbstractC19074t.m100223u("mViewPager");
            viewPagerCustomSwipeable4 = null;
        }
        viewPagerCustomSwipeable4.setSwipeEnabled(false);
        ViewPagerCustomSwipeable viewPagerCustomSwipeable5 = this.f63308N0;
        if (viewPagerCustomSwipeable5 == null) {
            AbstractC19074t.m100223u("mViewPager");
            viewPagerCustomSwipeable5 = null;
        }
        viewPagerCustomSwipeable5.setOffscreenPageLimit(2);
        View findViewById2 = inflate.findViewById(AbstractC6918a0.layoutTab);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f63310P0 = findViewById2;
        C12121b.f63319b = 1;
        this.f63311Q0 = new View[1];
        this.f63312R0 = new View[1];
        this.f63313S0 = new View[1];
        this.f63314T0 = new View[1];
        if (findViewById2 == null) {
            AbstractC19074t.m100223u("mTabBar");
            findViewById2 = null;
        }
        findViewById2.setVisibility(8);
        View[] viewArr = this.f63312R0;
        if (viewArr == null) {
            AbstractC19074t.m100223u("mTabViewLayout");
            viewArr = null;
        }
        viewArr[0] = inflate.findViewById(AbstractC6918a0.mygroup_bar);
        View[] viewArr2 = this.f63311Q0;
        if (viewArr2 == null) {
            AbstractC19074t.m100223u("mTabViewArr");
            viewArr2 = null;
        }
        viewArr2[0] = inflate.findViewById(AbstractC6918a0.tv_groups);
        View[] viewArr3 = this.f63313S0;
        if (viewArr3 == null) {
            AbstractC19074t.m100223u("newGroupNumberView");
            viewArr3 = null;
        }
        viewArr3[0] = inflate.findViewById(AbstractC6918a0.mygroup_number_view);
        View[] viewArr4 = this.f63314T0;
        if (viewArr4 == null) {
            AbstractC19074t.m100223u("mLineArr");
            viewArr4 = null;
        }
        viewArr4[0] = inflate.findViewById(AbstractC6918a0.line_group);
        int i11 = C12121b.f63319b;
        for (final int i12 = 0; i12 < i11; i12++) {
            View[] viewArr5 = this.f63312R0;
            if (viewArr5 == null) {
                AbstractC19074t.m100223u("mTabViewLayout");
                viewArr5 = null;
            }
            View view = viewArr5[i12];
            if (view != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: q70.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        GroupTabParentView.m67756rM(i12, this, view2);
                    }
                });
            }
        }
        this.f63307M0 = new C23528a(this.f72421L0.m92648SI());
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        try {
            C28685a m143693b = C28685a.m143693b(this.f72421L0.m92686rK());
            AbstractC19074t.m100207e(m143693b, "getInstance(...)");
            m143693b.m143697e(this.f63316V0);
            C23744a.Companion.m124119a().m124117e(this, 44);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63306X0, e11);
        }
        super.mo40200KJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        try {
            super.mo37118SJ(bundle);
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63308N0;
            if (viewPagerCustomSwipeable == null) {
                AbstractC19074t.m100223u("mViewPager");
                viewPagerCustomSwipeable = null;
            }
            bundle.putInt("tab", viewPagerCustomSwipeable.getCurrentItem());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63306X0, e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupTabParentView";
    }

    /* renamed from: iM */
    public final void m67757iM(int i11) {
        try {
            if (i11 < C12121b.f63319b) {
                m67764vM(i11);
                m67751jM(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0087  */
    /* renamed from: kM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m67758kM(String str) {
        boolean z11;
        int i11;
        C23528a c23528a;
        AbstractC19074t.m100208f(str, "requestedTipCat");
        int length = AbstractC28025b8.f130865v.length;
        for (int i12 = 0; i12 < length; i12++) {
            String str2 = AbstractC28025b8.f130865v[i12];
            if (AbstractC19074t.m100204b(str, "tip.any") || AbstractC19074t.m100204b(str, str2)) {
                C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                boolean z12 = true;
                if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                KeyEvent.Callback m67754oM = m67754oM(str2);
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2092605591:
                            if (!str2.equals("tip.message.compose.addfriend")) {
                                break;
                            }
                            if (m67754oM instanceof InterfaceC25728a) {
                                ((InterfaceC25728a) m67754oM).setEnableNoti(z11);
                                break;
                            } else {
                                break;
                            }
                        case -1300720808:
                            if (!str2.equals("tip.message.compose")) {
                                break;
                            }
                            if (!AbstractC19074t.m100204b(str2, "tip.message.compose")) {
                                i11 = AbstractC16803z.icn_header_plus;
                            } else {
                                i11 = AbstractC16803z.ic_head_newchat;
                            }
                            if (m67754oM != null && (m67754oM instanceof ActionBarMenuItem)) {
                                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) m67754oM;
                                ImageView iconView = actionBarMenuItem.getIconView();
                                c23528a = this.f63307M0;
                                if (c23528a == null) {
                                    AbstractC19074t.m100223u("mAQ");
                                    c23528a = null;
                                }
                                AbstractC28045d8.m141481b(iconView, m141453i, c23528a, i11);
                                if (!AbstractC19074t.m100204b(str2, "tip.message.newchat")) {
                                    actionBarMenuItem.setNotiRedotMarginTop(AbstractC23136l9.m118742r(12.0f));
                                    actionBarMenuItem.setNotiRedotMarginRight(AbstractC23136l9.m118742r(4.0f));
                                } else {
                                    actionBarMenuItem.setNotiRedotMarginTop(AbstractC23136l9.m118742r(16.0f));
                                }
                                if (AbstractC19074t.m100204b(str2, "tip.message.compose") && !z11) {
                                    for (String str3 : AbstractC28025b8.f130850g) {
                                        C28212v6 m141453i2 = AbstractC28025b8.m141453i(str3);
                                        if (m141453i2 != null && m141453i2.m142167f() && m141453i2.f131580f) {
                                            actionBarMenuItem.setEnableNoti(z12);
                                            break;
                                        }
                                    }
                                }
                                z12 = z11;
                                actionBarMenuItem.setEnableNoti(z12);
                            }
                            break;
                        case -405565762:
                            if (!str2.equals("tip.message.newchat")) {
                                break;
                            }
                            if (!AbstractC19074t.m100204b(str2, "tip.message.compose")) {
                            }
                            if (m67754oM != null) {
                                ActionBarMenuItem actionBarMenuItem2 = (ActionBarMenuItem) m67754oM;
                                ImageView iconView2 = actionBarMenuItem2.getIconView();
                                c23528a = this.f63307M0;
                                if (c23528a == null) {
                                }
                                AbstractC28045d8.m141481b(iconView2, m141453i, c23528a, i11);
                                if (!AbstractC19074t.m100204b(str2, "tip.message.newchat")) {
                                }
                                if (AbstractC19074t.m100204b(str2, "tip.message.compose")) {
                                    while (r4 < r3.length) {
                                    }
                                }
                                z12 = z11;
                                actionBarMenuItem2.setEnableNoti(z12);
                                break;
                            }
                            break;
                        case 1026464109:
                            if (!str2.equals("tip.message.compose.creategroup")) {
                                break;
                            }
                            if (m67754oM instanceof InterfaceC25728a) {
                            }
                            break;
                        case 1399233812:
                            if (!str2.equals("tip.message.compose.calendar")) {
                                break;
                            }
                            if (m67754oM instanceof InterfaceC25728a) {
                            }
                            break;
                        case 1676691636:
                            if (!str2.equals("tip.message.compose.scanqr")) {
                                break;
                            }
                            if (m67754oM instanceof InterfaceC25728a) {
                            }
                            break;
                        case 1875577267:
                            if (!str2.equals("tip.message.compose.zalopc")) {
                                break;
                            }
                            if (m67754oM instanceof InterfaceC25728a) {
                            }
                            break;
                    }
                }
            }
        }
    }

    /* renamed from: lM */
    public final void m67759lM(String str, int i11) {
        AbstractC19074t.m100208f(str, "requestedTipCat");
        try {
            if (!this.f72421L0.m92674mJ() || this.f72421L0.mo60294yp() || MainTabView.m67645lM() == null || MainTabView.m67645lM().m67696kM() != C24099q0.Companion.m125984a().m125967h() || MainTabView.m67645lM().f63219I1.m74707p()) {
                return;
            }
            Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130865v).iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                final C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (AbstractC19074t.m100204b(str, "tip.any") || AbstractC19074t.m100204b(str, c28212v6.f131577c))) {
                    if (i11 == -1 || c28212v6.f131575a == i11) {
                        View m67760pM = m67760pM(c28212v6.f131577c);
                        if (m67760pM != null && !z11 && m67760pM.isShown()) {
                            this.f63317W0 = new ShowcaseView(m67760pM.getContext());
                            C26203c m134769a = C26203c.m134769a(m67760pM.getContext());
                            m134769a.m134770b(c28212v6, m67760pM.getContext());
                            m134769a.f124524o = m67760pM;
                            String str2 = c28212v6.f131577c;
                            if (AbstractC19074t.m100204b(str2, "tip.grouptab.leavegroup")) {
                                m134769a.f124513d = -AbstractC23136l9.m118742r(4.0f);
                            } else if (AbstractC19074t.m100204b(str2, "tip.message.newchat")) {
                                m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                            }
                            ShowcaseView showcaseView = this.f63317W0;
                            AbstractC19074t.m100205c(showcaseView);
                            showcaseView.setConfigs(m134769a);
                            ShowcaseView showcaseView2 = this.f63317W0;
                            AbstractC19074t.m100205c(showcaseView2);
                            showcaseView2.setShowcaseId(c28212v6.f131577c);
                            ShowcaseView showcaseView3 = this.f63317W0;
                            AbstractC19074t.m100205c(showcaseView3);
                            showcaseView3.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: q70.d
                                @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                                /* renamed from: a */
                                public final void mo39159a(ShowcaseView showcaseView4, int i12, int i13, boolean z12) {
                                    GroupTabParentView.m67752mM(GroupTabParentView.this, c28212v6, showcaseView4, i12, i13, z12);
                                }
                            });
                            ShowcaseView showcaseView4 = this.f63317W0;
                            AbstractC19074t.m100205c(showcaseView4);
                            showcaseView4.setShowcaseManager(MainTabView.m67645lM().f63219I1);
                            ShowcaseView showcaseView5 = this.f63317W0;
                            AbstractC19074t.m100205c(showcaseView5);
                            showcaseView5.m74637r();
                            if (AbstractC19074t.m100204b(c28212v6.f131577c, "tip.grouptab.leavegroup")) {
                                AbstractC28025b8.f130835L = false;
                            }
                            z11 = true;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            super.onActivityResult(i11, i12, intent);
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63308N0;
            if (viewPagerCustomSwipeable == null) {
                AbstractC19074t.m100223u("mViewPager");
                viewPagerCustomSwipeable = null;
            }
            ZaloView m67753nM = m67753nM(viewPagerCustomSwipeable.getCurrentItem());
            if (m67753nM != null) {
                m67753nM.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        if (i11 == 0) {
            C12134a c12134a = this.f63309O0;
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = null;
            if (c12134a == null) {
                AbstractC19074t.m100223u("mTabAdapter");
                c12134a = null;
            }
            ViewPagerCustomSwipeable viewPagerCustomSwipeable2 = this.f63308N0;
            if (viewPagerCustomSwipeable2 == null) {
                AbstractC19074t.m100223u("mViewPager");
            } else {
                viewPagerCustomSwipeable = viewPagerCustomSwipeable2;
            }
            c12134a.m67831C(viewPagerCustomSwipeable.getCurrentItem());
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(int i11, float f11, int i12) {
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        C12134a c12134a = this.f63309O0;
        if (c12134a == null) {
            AbstractC19074t.m100223u("mTabAdapter");
            c12134a = null;
        }
        c12134a.m67831C(i11);
        if (i11 == 0) {
            C19637j.f97466a.m102850i(0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (AbstractC23304d.f113296K2) {
            AbstractC23304d.f113296K2 = false;
            m67764vM(0);
        } else if (AbstractC23304d.f113292J2) {
            m67757iM(0);
        } else if (AbstractC23309i.m122608y9() > 0) {
            m67751jM(0);
        }
        m67763uM(0, false);
    }

    /* renamed from: pM */
    public final View m67760pM(String str) {
        ZaloView m67753nM;
        if (str != null) {
            switch (str.hashCode()) {
                case -2092605591:
                    if (!str.equals("tip.message.compose.addfriend")) {
                        return null;
                    }
                    break;
                case -1300720808:
                    if (!str.equals("tip.message.compose")) {
                        return null;
                    }
                    break;
                case -405565762:
                    if (str.equals("tip.message.newchat")) {
                        int m122418t4 = AbstractC23309i.m122418t4();
                        if (!this.f72421L0.m92666hJ() && MainTabView.m67645lM() != null) {
                            if (m122418t4 == 1 || m122418t4 == 2) {
                                return MainTabView.m67645lM().f63259u1;
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                case 17602701:
                    if (str.equals("tip.grouptab.leavegroup") && (m67753nM = m67753nM(0)) != null && (m67753nM instanceof GroupTabView)) {
                        return ((GroupTabView) m67753nM).m67823wM();
                    }
                    return null;
                case 1026464109:
                    if (!str.equals("tip.message.compose.creategroup")) {
                        return null;
                    }
                    break;
                case 1399233812:
                    if (!str.equals("tip.message.compose.calendar")) {
                        return null;
                    }
                    break;
                case 1676691636:
                    if (!str.equals("tip.message.compose.scanqr")) {
                        return null;
                    }
                    break;
                case 1875577267:
                    if (!str.equals("tip.message.compose.zalopc")) {
                        return null;
                    }
                    break;
                default:
                    return null;
            }
            if (MainTabView.m67645lM() != null) {
                return MainTabView.m67645lM().f63261w1;
            }
            return null;
        }
        return null;
    }

    /* renamed from: sM */
    public void m67761sM(boolean z11) {
        if (z11) {
            C23744a.Companion.m124119a().m124116d(59, new Object[0]);
            m67763uM(0, false);
        }
    }

    /* renamed from: tM */
    public final void m67762tM(int i11) {
        m67763uM(i11, false);
        AbstractC23309i.m122184mu(0);
        AbstractC23309i.m121171Lr(0L);
        C19637j.f97466a.m102850i(1);
        C23744a.Companion.m124119a().m124116d(6074, new Object[0]);
    }

    /* renamed from: uM */
    public final void m67763uM(int i11, boolean z11) {
        int i12;
        View[] viewArr = this.f63313S0;
        if (viewArr == null) {
            AbstractC19074t.m100223u("newGroupNumberView");
            viewArr = null;
        }
        View view = viewArr[i11];
        AbstractC19074t.m100205c(view);
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        view.setVisibility(i12);
    }

    /* renamed from: vM */
    public final void m67764vM(int i11) {
        boolean z11;
        try {
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63308N0;
            if (viewPagerCustomSwipeable == null) {
                AbstractC19074t.m100223u("mViewPager");
                viewPagerCustomSwipeable = null;
            }
            if (viewPagerCustomSwipeable.getCurrentItem() != i11) {
                ViewPagerCustomSwipeable viewPagerCustomSwipeable2 = this.f63308N0;
                if (viewPagerCustomSwipeable2 == null) {
                    AbstractC19074t.m100223u("mViewPager");
                    viewPagerCustomSwipeable2 = null;
                }
                viewPagerCustomSwipeable2.setCurrentItem(i11);
                int i12 = C12121b.f63319b;
                for (int i13 = 0; i13 < i12; i13++) {
                    View[] viewArr = this.f63311Q0;
                    if (viewArr == null) {
                        AbstractC19074t.m100223u("mTabViewArr");
                        viewArr = null;
                    }
                    View view = viewArr[i13];
                    AbstractC19074t.m100205c(view);
                    if (i13 == i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    view.setSelected(z11);
                    if (i13 == i11) {
                        View[] viewArr2 = this.f63314T0;
                        if (viewArr2 == null) {
                            AbstractC19074t.m100223u("mLineArr");
                            viewArr2 = null;
                        }
                        View view2 = viewArr2[i13];
                        AbstractC19074t.m100205c(view2);
                        view2.setVisibility(0);
                    } else {
                        View[] viewArr3 = this.f63314T0;
                        if (viewArr3 == null) {
                            AbstractC19074t.m100223u("mLineArr");
                            viewArr3 = null;
                        }
                        View view3 = viewArr3[i13];
                        AbstractC19074t.m100205c(view3);
                        view3.setVisibility(8);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63306X0, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        List m131505m;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 44) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.Companion.m125984a().m125967h()) {
                String[] strArr = AbstractC28025b8.f130865v;
                AbstractC19074t.m100207e(strArr, "ARR_GROUP_TAB_VIEW_TIPS");
                m131505m = AbstractC25368s.m131505m(Arrays.copyOf(strArr, strArr.length));
                if (m131505m.contains(str)) {
                    Message obtainMessage = this.f63315U0.obtainMessage(0, str);
                    AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
                    this.f63315U0.sendMessage(obtainMessage);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            this.f63309O0 = new C12134a(this.f72421L0.m92649TI());
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63308N0;
            View[] viewArr = null;
            if (viewPagerCustomSwipeable == null) {
                AbstractC19074t.m100223u("mViewPager");
                viewPagerCustomSwipeable = null;
            }
            C12134a c12134a = this.f63309O0;
            if (c12134a == null) {
                AbstractC19074t.m100223u("mTabAdapter");
                c12134a = null;
            }
            viewPagerCustomSwipeable.setAdapter(c12134a);
            if (bundle != null) {
                try {
                    int i11 = bundle.getInt("tab");
                    ViewPagerCustomSwipeable viewPagerCustomSwipeable2 = this.f63308N0;
                    if (viewPagerCustomSwipeable2 == null) {
                        AbstractC19074t.m100223u("mViewPager");
                        viewPagerCustomSwipeable2 = null;
                    }
                    viewPagerCustomSwipeable2.setCurrentItem(i11, false);
                    View[] viewArr2 = this.f63311Q0;
                    if (viewArr2 == null) {
                        AbstractC19074t.m100223u("mTabViewArr");
                        viewArr2 = null;
                    }
                    View view = viewArr2[i11];
                    AbstractC19074t.m100205c(view);
                    view.setSelected(true);
                    View[] viewArr3 = this.f63314T0;
                    if (viewArr3 == null) {
                        AbstractC19074t.m100223u("mLineArr");
                    } else {
                        viewArr = viewArr3;
                    }
                    View view2 = viewArr[i11];
                    AbstractC19074t.m100205c(view2);
                    view2.setVisibility(0);
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(f63306X0, e11);
                    return;
                }
            }
            View[] viewArr4 = this.f63311Q0;
            if (viewArr4 == null) {
                AbstractC19074t.m100223u("mTabViewArr");
                viewArr4 = null;
            }
            View view3 = viewArr4[0];
            AbstractC19074t.m100205c(view3);
            view3.setSelected(true);
            View[] viewArr5 = this.f63314T0;
            if (viewArr5 == null) {
                AbstractC19074t.m100223u("mLineArr");
            } else {
                viewArr = viewArr5;
            }
            View view4 = viewArr[0];
            AbstractC19074t.m100205c(view4);
            view4.setVisibility(0);
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f63306X0, e12);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.zing.zalo.ACTION_SHOW_GROUP_SUBTAB");
        intentFilter.addAction("com.zing.zalo.ACTION_SHOW_NEW_GROUP_NOTI");
        C28685a m143693b = C28685a.m143693b(this.f72421L0.m92686rK());
        AbstractC19074t.m100207e(m143693b, "getInstance(...)");
        m143693b.m143695c(this.f63316V0, intentFilter);
        C23744a.Companion.m124119a().m124115b(this, 44);
    }
}
