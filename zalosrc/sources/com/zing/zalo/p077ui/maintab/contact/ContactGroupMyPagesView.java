package com.zing.zalo.p077ui.maintab.contact;

import ag0.C0815e1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.contact.ContactGroupMyPagesView;
import com.zing.zalo.p077ui.maintab.group.GroupTabView;
import com.zing.zalo.p077ui.maintab.widget.MainTabChildView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.zviews.MyPagesView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import gw.C19637j;
import i40.AbstractAnimationAnimationListenerC20277g;
import java.util.Arrays;
import java.util.Iterator;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import o70.C24099q0;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p594w1.C28685a;
import r30.AbstractC25636f;
import sa0.C26203c;
import vg.AbstractC28025b8;
import vg.AbstractC28045d8;
import vg.C28212v6;

/* loaded from: classes5.dex */
public class ContactGroupMyPagesView extends MainTabChildView implements ViewPager.InterfaceC6875j, C23744a.c, MainTabView.InterfaceC12111i {

    /* renamed from: a1 */
    public static final String f63278a1 = "com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView";

    /* renamed from: M0 */
    C23528a f63279M0;

    /* renamed from: N0 */
    ViewPagerCustomSwipeable f63280N0;

    /* renamed from: O0 */
    C12119a f63281O0;

    /* renamed from: P0 */
    View f63282P0;

    /* renamed from: S0 */
    ShowcaseView f63285S0;

    /* renamed from: U0 */
    Animation f63287U0;

    /* renamed from: V0 */
    Animation f63288V0;

    /* renamed from: W0 */
    Animation f63289W0;

    /* renamed from: X0 */
    private AbstractAnimationAnimationListenerC20277g f63290X0;

    /* renamed from: Q0 */
    View[] f63283Q0 = new View[C12118e.f63299c];

    /* renamed from: R0 */
    Handler f63284R0 = new Handler(Looper.getMainLooper(), new C12114a());

    /* renamed from: T0 */
    BroadcastReceiver f63286T0 = new C12115b();

    /* renamed from: Y0 */
    final Animation.AnimationListener f63291Y0 = new C12116c();

    /* renamed from: Z0 */
    final Animation.AnimationListener f63292Z0 = new C12117d();

    /* renamed from: com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView$a */
    /* loaded from: classes5.dex */
    class C12114a implements Handler.Callback {
        C12114a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                if (message.what == 0) {
                    String str = (String) message.obj;
                    ShowcaseView showcaseView = ContactGroupMyPagesView.this.f63285S0;
                    if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(str, ContactGroupMyPagesView.this.f63285S0.getShowcaseId())) {
                        ContactGroupMyPagesView.this.f63285S0.m74626d();
                        ContactGroupMyPagesView.this.f63285S0 = null;
                    }
                    ContactGroupMyPagesView.this.m67734iM(str);
                    ContactGroupMyPagesView.this.m67733hM(str);
                    return false;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView$b */
    /* loaded from: classes5.dex */
    class C12115b extends BroadcastReceiver {
        C12115b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (ContactGroupMyPagesView.this.f72421L0.m92674mJ() && !ContactGroupMyPagesView.this.f72421L0.m92677nJ()) {
                    String action = intent.getAction();
                    if ("com.zing.zalo.ACTION_SWITCH_TO_TAB_DEFAULT".equals(action)) {
                        ContactGroupMyPagesView.this.m67742sM();
                    } else if ("com.zing.zalo.ACTION_SHOW_SUBTAB".equals(action)) {
                        ContactGroupMyPagesView.this.m67741rM(true);
                    } else if ("com.zing.zalo.ACTION_SHOW_GROUP_SUBTAB".equals(action) && !C24099q0.m125958k().m125962c()) {
                        ContactGroupMyPagesView.this.m67739pM();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView$c */
    /* loaded from: classes5.dex */
    class C12116c extends AbstractAnimationAnimationListenerC20277g {
        C12116c() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ContactGroupMyPagesView contactGroupMyPagesView = ContactGroupMyPagesView.this;
            contactGroupMyPagesView.f63289W0 = null;
            if (contactGroupMyPagesView.f63290X0 != null) {
                ContactGroupMyPagesView.this.f63290X0.onAnimationEnd(animation);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView$d */
    /* loaded from: classes5.dex */
    class C12117d extends AbstractAnimationAnimationListenerC20277g {
        C12117d() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ContactGroupMyPagesView.this.f63282P0.setVisibility(8);
            ContactGroupMyPagesView.this.f63289W0 = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView$e */
    /* loaded from: classes5.dex */
    public static class C12118e {

        /* renamed from: a */
        public static int f63297a = 1;

        /* renamed from: b */
        public static int f63298b = 1 + 1;

        /* renamed from: c */
        public static int f63299c = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m67730mM(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f63285S0) {
            this.f63285S0 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m67731nM(int i11, View view) {
        if (this.f63280N0.getCurrentItem() != i11) {
            m67743uM(i11);
        }
    }

    /* renamed from: tM */
    private void m67732tM(int i11) {
        String str;
        if (i11 == 0) {
            str = "2";
        } else if (i11 == C12118e.f63298b) {
            str = "3";
        } else if (i11 != C12118e.f63297a) {
            str = "";
        } else {
            str = "4";
        }
        if (!TextUtils.isEmpty(str)) {
            C0815e1.m2075D().m2095O(String.valueOf(1), str, "", "");
        }
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
            this.f72830E0 = C24099q0.m125958k().m125972p();
            if (this.f72421L0.m92642L3() != null) {
                this.f72830E0 = this.f72421L0.m92642L3().getInt("position");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.maincontacttab_zview, viewGroup, false);
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = (ViewPagerCustomSwipeable) inflate.findViewById(AbstractC6918a0.pager);
        this.f63280N0 = viewPagerCustomSwipeable;
        viewPagerCustomSwipeable.addOnPageChangeListener(this);
        this.f63280N0.setPageMarginDrawable(AbstractC23136l9.m118665N(inflate.getContext(), AbstractC16803z.slide_viewpager_seperate_line));
        this.f63280N0.setPageMargin(this.f72421L0.m92651WI().getDimensionPixelSize(AbstractC16802y.page_margin_width));
        this.f63280N0.setDrawingCacheEnabled(true);
        this.f63280N0.setAlwaysDrawnWithCacheEnabled(true);
        this.f63280N0.setDrawingCacheQuality(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
        this.f63280N0.setSwipeEnabled(false);
        this.f63280N0.setOffscreenPageLimit(2);
        this.f63287U0 = AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_in_subtab_from_top);
        this.f63288V0 = AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_out_subtab_to_top);
        this.f63282P0 = inflate.findViewById(AbstractC6918a0.layoutTab);
        if (!C24099q0.m125958k().m125962c()) {
            C12118e.f63299c = 3;
            C12118e.f63297a = 1;
            C12118e.f63298b = 1 + 1;
            View[] viewArr = new View[C12118e.f63299c];
            this.f63283Q0 = viewArr;
            viewArr[C12118e.f63297a] = inflate.findViewById(AbstractC6918a0.tv_groups);
            AbstractC23136l9.m118693a1(this.f63283Q0[C12118e.f63297a], AbstractC16803z.subztab_indicator_bg_blue);
        } else {
            C12118e.f63299c = 2;
            C12118e.f63298b = 1;
            C12118e.f63297a = -1;
            this.f63283Q0 = new View[C12118e.f63299c];
            View findViewById = inflate.findViewById(AbstractC6918a0.tab_groups);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        this.f63283Q0[0] = inflate.findViewById(AbstractC6918a0.tv_friends);
        this.f63283Q0[C12118e.f63298b] = inflate.findViewById(AbstractC6918a0.tv_pages);
        AbstractC23136l9.m118693a1(this.f63283Q0[0], AbstractC16803z.subztab_indicator_bg_blue);
        AbstractC23136l9.m118693a1(this.f63283Q0[C12118e.f63298b], AbstractC16803z.subztab_indicator_bg_blue);
        for (final int i11 = 0; i11 < C12118e.f63299c; i11++) {
            this.f63283Q0[i11].setOnClickListener(new View.OnClickListener() { // from class: p70.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactGroupMyPagesView.this.m67731nM(i11, view);
                }
            });
        }
        this.f63279M0 = new C23528a(this.f72421L0.m92648SI());
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        try {
            C28685a.m143693b(this.f72421L0.m92648SI()).m143697e(this.f63286T0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63278a1, e11);
        }
        super.mo40200KJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 44);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            super.mo37118SJ(bundle);
            bundle.putInt("tab", this.f63280N0.getCurrentItem());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63278a1, e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    /* renamed from: hM */
    public void m67733hM(String str) {
        boolean z11;
        int i11 = 0;
        while (true) {
            String[] strArr = AbstractC28025b8.f130851h;
            if (i11 < strArr.length) {
                String str2 = strArr[i11];
                if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                    C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                    if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    View m67737lM = m67737lM(str2);
                    str2.hashCode();
                    if (!str2.equals("tip.contact.search")) {
                        if (str2.equals("tip.contact.addfriend") && m67737lM != null && (m67737lM instanceof ActionBarMenuItem)) {
                            ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) m67737lM;
                            AbstractC28045d8.m141481b(actionBarMenuItem.getIconView(), m141453i, this.f63279M0, AbstractC16803z.icon_header_add_friend);
                            actionBarMenuItem.setEnableNoti(z11);
                        }
                    } else if (m67737lM instanceof RedDotImageButton) {
                        RedDotImageButton redDotImageButton = (RedDotImageButton) m67737lM;
                        AbstractC28045d8.m141480a(redDotImageButton, m141453i, this.f63279M0, AbstractC16803z.icon_header_search);
                        redDotImageButton.setEnableNoti(z11);
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    /* renamed from: iM */
    public void m67734iM(String str) {
        try {
            if (!this.f72421L0.m92674mJ() || this.f72421L0.mo60294yp() || MainTabView.m67645lM() == null || MainTabView.m67645lM().m67696kM() != C24099q0.m125958k().m125972p() || MainTabView.m67645lM().f63219I1.m74707p()) {
                return;
            }
            Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130851h).iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                final C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c))) {
                    View m67737lM = m67737lM(c28212v6.f131577c);
                    if (m67737lM != null && !z11 && m67737lM.isShown()) {
                        this.f63285S0 = new ShowcaseView(m67737lM.getContext());
                        C26203c m134769a = C26203c.m134769a(m67737lM.getContext());
                        m134769a.m134770b(c28212v6, m67737lM.getContext());
                        m134769a.f124524o = m67737lM;
                        if (TextUtils.equals(c28212v6.f131577c, "tip.contact.search")) {
                            m134769a.f124513d = AbstractC23136l9.m118742r(4.0f);
                        } else if (TextUtils.equals(c28212v6.f131577c, "tip.contact.addfriend")) {
                            m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                        } else if (TextUtils.equals(c28212v6.f131577c, "tip.grouptab.leavegroup")) {
                            m134769a.f124513d = -AbstractC23136l9.m118742r(4.0f);
                        } else {
                            m134769a.f124513d = -AbstractC23136l9.m118742r(6.0f);
                        }
                        this.f63285S0.setConfigs(m134769a);
                        this.f63285S0.setShowcaseId(c28212v6.f131577c);
                        this.f63285S0.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: p70.b
                            @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                            /* renamed from: a */
                            public final void mo39159a(ShowcaseView showcaseView, int i11, int i12, boolean z12) {
                                ContactGroupMyPagesView.this.m67730mM(c28212v6, showcaseView, i11, i12, z12);
                            }
                        });
                        this.f63285S0.setShowcaseManager(MainTabView.m67645lM().f63219I1);
                        this.f63285S0.m74637r();
                        if (TextUtils.equals("tip.grouptab.leavegroup", c28212v6.f131577c)) {
                            AbstractC28025b8.f130835L = false;
                        }
                        z11 = true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jM */
    public ZaloView m67735jM(int i11) {
        C12119a c12119a = this.f63281O0;
        if (c12119a != null && i11 >= 0 && i11 < c12119a.mo35335g()) {
            return this.f63281O0.m93128x(i11);
        }
        return null;
    }

    /* renamed from: kM */
    public int m67736kM() {
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63280N0;
        if (viewPagerCustomSwipeable != null) {
            return viewPagerCustomSwipeable.getCurrentItem();
        }
        return -1;
    }

    /* renamed from: lM */
    public View m67737lM(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -902057751:
                if (str.equals("tip.contact.search")) {
                    c11 = 0;
                    break;
                }
                break;
            case -827512930:
                if (str.equals("tip.contact.addfriend")) {
                    c11 = 1;
                    break;
                }
                break;
            case 17602701:
                if (str.equals("tip.grouptab.leavegroup")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                if (MainTabView.m67645lM() == null) {
                    return null;
                }
                return MainTabView.m67645lM().f63217H1;
            case 1:
                if (MainTabView.m67645lM() == null) {
                    return null;
                }
                return MainTabView.m67645lM().f63256r1;
            case 2:
                ZaloView m67735jM = m67735jM(C12118e.f63297a);
                if (m67735jM == null || !(m67735jM instanceof GroupTabView)) {
                    return null;
                }
                return ((GroupTabView) m67735jM).m67823wM();
            default:
                return null;
        }
    }

    /* renamed from: oM */
    public void m67738oM(boolean z11) {
        try {
            if (z11) {
                for (int i11 = 0; i11 < C12118e.f63299c; i11++) {
                    ZaloView m67735jM = m67735jM(i11);
                    if (m67735jM != null) {
                        if (m67735jM instanceof ZaloListView) {
                            AbstractC25636f.f122589d = true;
                            ((ZaloListView) m67735jM).m87040ZN();
                        } else if (m67735jM instanceof MyPagesView) {
                            AbstractC25636f.f122589d = false;
                            ((MyPagesView) m67735jM).m82289KM();
                        }
                    }
                }
                return;
            }
            AbstractC25636f.f122589d = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        ZaloView m67735jM;
        try {
            super.onActivityResult(i11, i12, intent);
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63280N0;
            if (viewPagerCustomSwipeable != null && (m67735jM = m67735jM(viewPagerCustomSwipeable.getCurrentItem())) != null) {
                m67735jM.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        C12119a c12119a;
        if (i11 == 0 && (c12119a = this.f63281O0) != null) {
            c12119a.m67746C(this.f63280N0.getCurrentItem());
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(int i11, float f11, int i12) {
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        boolean z11;
        if (i11 != 0) {
            AbstractC25636f.m132474d();
        }
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC25636f.f122589d = z11;
        C12119a c12119a = this.f63281O0;
        if (c12119a != null) {
            c12119a.m67746C(i11);
        }
        m67732tM(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            C23744a.m124114c().m124115b(this, 44);
            if (AbstractC23304d.f113292J2) {
                AbstractC23304d.f113292J2 = false;
                if (!C24099q0.m125958k().m125962c()) {
                    m67739pM();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    void m67739pM() {
        AbstractC23304d.f113292J2 = false;
        m67743uM(C12118e.f63297a);
        AbstractC23309i.m121171Lr(0L);
        C19637j.f97466a.m102850i(1);
        C23744a.m124114c().m124116d(6074, new Object[0]);
    }

    /* renamed from: qM */
    public void m67740qM(AbstractAnimationAnimationListenerC20277g abstractAnimationAnimationListenerC20277g) {
        this.f63290X0 = abstractAnimationAnimationListenerC20277g;
    }

    /* renamed from: rM */
    public synchronized boolean m67741rM(boolean z11) {
        try {
            if (z11) {
                if (this.f63282P0.getVisibility() == 0) {
                    return false;
                }
                if (this.f63289W0 != null) {
                    return false;
                }
                this.f63282P0.setVisibility(0);
                this.f63287U0.setAnimationListener(this.f63291Y0);
                Animation animation = this.f63287U0;
                this.f63289W0 = animation;
                this.f63282P0.startAnimation(animation);
                return true;
            }
            if (this.f63282P0.getVisibility() == 8) {
                return false;
            }
            if (this.f63289W0 != null) {
                return false;
            }
            this.f63288V0.setAnimationListener(this.f63292Z0);
            Animation animation2 = this.f63288V0;
            this.f63289W0 = animation2;
            this.f63282P0.startAnimation(animation2);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: sM */
    public void m67742sM() {
        try {
            ViewPagerCustomSwipeable viewPagerCustomSwipeable = this.f63280N0;
            if (viewPagerCustomSwipeable != null && viewPagerCustomSwipeable.getCurrentItem() != 0) {
                m67743uM(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    void m67743uM(int i11) {
        boolean z11;
        try {
            this.f63280N0.setCurrentItem(i11);
            for (int i12 = 0; i12 < C12118e.f63299c; i12++) {
                View view = this.f63283Q0[i12];
                if (i12 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setSelected(z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63278a1, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 44) {
            try {
                String str = (String) objArr[0];
                if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125972p() && Arrays.asList(AbstractC28025b8.f130851h).contains(str)) {
                    this.f63284R0.sendMessage(this.f63284R0.obtainMessage(0, str));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            C12119a c12119a = new C12119a(this.f72421L0.m92649TI());
            this.f63281O0 = c12119a;
            this.f63280N0.setAdapter(c12119a);
            if (bundle != null) {
                try {
                    int i11 = bundle.getInt("tab");
                    this.f63280N0.setCurrentItem(i11, false);
                    this.f63283Q0[i11].setSelected(true);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(f63278a1, e11);
                }
            } else {
                this.f63283Q0[0].setSelected(true);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.ACTION_SWITCH_TO_TAB_DEFAULT");
            intentFilter.addAction("com.zing.zalo.ACTION_SHOW_SUBTAB");
            intentFilter.addAction("com.zing.zalo.ACTION_SHOW_GROUP_SUBTAB");
            C28685a.m143693b(this.f72421L0.m92648SI()).m143695c(this.f63286T0, intentFilter);
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f63278a1, e12);
        }
    }
}
