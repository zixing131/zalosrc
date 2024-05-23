package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2335a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7081h1;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import ml0.AbstractC23344a;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p716zh.C31973j5;

/* loaded from: classes6.dex */
public class GroupBoardView extends SlidableZaloView implements C23744a.c, InterfaceC0733x {

    /* renamed from: P0 */
    View f73598P0;

    /* renamed from: Q0 */
    ActionBarMenuItem f73599Q0;

    /* renamed from: R0 */
    ViewPager f73600R0;

    /* renamed from: S0 */
    C7081h1 f73601S0;

    /* renamed from: T0 */
    C23528a f73602T0;

    /* renamed from: U0 */
    String f73603U0;

    /* renamed from: X0 */
    C7904b f73606X0;

    /* renamed from: V0 */
    boolean f73604V0 = false;

    /* renamed from: W0 */
    boolean f73605W0 = false;

    /* renamed from: Y0 */
    InterfaceC17463d.d f73607Y0 = new C14328b();

    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardView$a */
    /* loaded from: classes6.dex */
    public class C14327a extends ViewPager.C6879n {
        C14327a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            GroupBoardView groupBoardView;
            C7081h1 c7081h1;
            if (i11 == 0 && (c7081h1 = (groupBoardView = GroupBoardView.this).f73601S0) != null) {
                c7081h1.m36133C(groupBoardView.f73600R0.getCurrentItem());
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            C7081h1 c7081h1 = GroupBoardView.this.f73601S0;
            if (c7081h1 != null) {
                c7081h1.m36133C(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardView$b */
    /* loaded from: classes6.dex */
    class C14328b implements InterfaceC17463d.d {
        C14328b() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            C17487o0 c17487o0;
            if (interfaceC17463d.mo92862f() == 3) {
                GroupBoardView groupBoardView = GroupBoardView.this;
                C7904b c7904b = groupBoardView.f73606X0;
                String str = groupBoardView.f73603U0;
                if (groupBoardView.m92676n2() != null) {
                    c17487o0 = GroupBoardView.this.m92676n2().mo35579p();
                } else {
                    c17487o0 = null;
                }
                AbstractC23184q2.m119466x(c7904b, str, c17487o0, false);
            }
        }
    }

    /* renamed from: jM */
    public /* synthetic */ void m79984jM(C7904b c7904b) {
        if (this.f73605W0) {
            this.f72421L0.finish();
            AbstractC23211s7.m119579l(this.f73603U0, this.f72421L0.m92676n2(), true, c7904b.f42747s);
        } else {
            Intent intent = new Intent();
            intent.putExtra("extra_msg_id", c7904b.f42747s);
            this.f72421L0.mo50035CK(AbstractC2335a.f9831a, intent);
            this.f72421L0.finish();
        }
    }

    /* renamed from: kM */
    public /* synthetic */ void m79985kM(C7904b c7904b) {
        if (c7904b.m40779q()) {
            this.f73606X0 = c7904b;
            showDialog(3);
        } else {
            ToastUtils.showMess(m92652XI(AbstractC8020f0.str_reply_msg_not_found));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_IS_COMMUNITY")) {
            this.f73604V0 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        C8009j c8009j = null;
        if (i11 != 1) {
            if (i11 != 3) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.getContext());
            C8009j.a m43172u = aVar.m43172u(m92652XI(AbstractC8020f0.str_reply_msg_not_found));
            if (this.f73604V0) {
                i12 = AbstractC8020f0.f43844xff7bcf46;
            } else {
                i12 = AbstractC8020f0.str_confirm_open_pin_msg_detail_from_not_found_pin_msg_title;
            }
            m43172u.m43162k(m92652XI(i12)).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_media_store_view_confirm), this.f73607Y0);
            C8009j m43152a = aVar.m43152a();
            m43152a.m92853D(3);
            m43152a.m92873y(false);
            return m43152a;
        }
        try {
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.getContext());
            aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.permission_guide_warning_title)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_message_tip)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
            c8009j = aVar2.m43152a();
            c8009j.m92873y(false);
            return c8009j;
        } catch (Exception e11) {
            e11.printStackTrace();
            return c8009j;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        ActionBarMenuItem m92742i = actionBarMenu.m92742i(1, AbstractC23136l9.m118665N(actionBarMenu.getContext(), AbstractC16803z.icn_header_plus));
        this.f73599Q0 = m92742i;
        m92742i.setId(AbstractC6918a0.icn_group_board_create);
        this.f73599Q0.m92774j(AbstractC23136l9.m118727m(actionBarMenu.getContext(), 2, AbstractC8020f0.str_group_post, AbstractC16803z.icn_menu_note));
        this.f73599Q0.m92774j(AbstractC23136l9.m118727m(actionBarMenu.getContext(), 3, AbstractC8020f0.str_poll_title, AbstractC16803z.icn_menu_poll));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73602T0 = new C23528a(this.f72421L0.getContext());
        m92637BK(true);
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_board_view, viewGroup, false);
        this.f73598P0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 27);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        ViewPager viewPager = this.f73600R0;
        if (viewPager != null && viewPager.getCurrentItem() == 0) {
            return super.mo37488Li();
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC23344a.home) {
            finish();
            return true;
        }
        if (i11 == 1) {
            AbstractC23647d.m123897g("1001652");
        } else if (i11 == 2) {
            AbstractC23647d.m123897g("1001653");
            m79988mM(false, false);
        } else if (i11 == 3) {
            AbstractC23647d.m123897g("10010006");
            m79987lM(2);
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            super.mo37118SJ(bundle);
            bundle.putInt("extra_tab", this.f73600R0.getCurrentItem());
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
                if (this.f73604V0) {
                    actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_bar_title_community_board));
                } else {
                    actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_board));
                }
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupBoardView";
    }

    /* renamed from: iM */
    public void m79986iM(C7904b c7904b) {
        if (c7904b != null && c7904b.f42747s != null) {
            AbstractC19646n0.m103042x(new Runnable() { // from class: com.zing.zalo.ui.zviews.ai

                /* renamed from: q */
                public final /* synthetic */ C7904b f79819q;

                public /* synthetic */ RunnableC15438ai(C7904b c7904b2) {
                    r2 = c7904b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupBoardView.this.m79984jM(r2);
                }
            }, new Runnable() { // from class: com.zing.zalo.ui.zviews.bi

                /* renamed from: q */
                public final /* synthetic */ C7904b f79930q;

                public /* synthetic */ RunnableC15475bi(C7904b c7904b2) {
                    r2 = c7904b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupBoardView.this.m79985kM(r2);
                }
            }, c7904b2.f42747s, "group_" + this.f73603U0);
        }
    }

    /* renamed from: lM */
    public void m79987lM(int i11) {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73603U0);
        if (m4472f == null) {
            return;
        }
        if (m4472f.m153757e0() && !m4472f.m153742T()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_admin_tool_lock_create_poll));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", this.f73603U0);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        if (m92662fJ() != null) {
            m92662fJ().m93069k2(GroupPollCreatingView.class, bundle, 1, true);
        }
    }

    /* renamed from: mM */
    public void m79988mM(boolean z11, boolean z12) {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73603U0);
        if (m4472f == null) {
            return;
        }
        if (m4472f.m153759f0() && !m4472f.m153742T()) {
            if (z12) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_no_right_create_time_reminder));
                return;
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_no_right_create_note));
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", this.f73603U0);
        bundle.putBoolean("extra_pin_post", z11);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 2);
        if (z12) {
            bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
            if (m92662fJ() != null) {
                m92662fJ().m93069k2(GroupReminderComposeView.class, bundle, 1, true);
                return;
            }
            return;
        }
        if (m92662fJ() != null) {
            m92662fJ().m93069k2(GroupPostComposeViewV2.class, bundle, 1, true);
        }
    }

    /* renamed from: nM */
    public void m79989nM(C7904b c7904b) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", "group_" + this.f73603U0);
        if (c7904b != null) {
            bundle.putString("extra_group_topic_info_json", c7904b.m40780r().toString());
        }
        if (m92662fJ() != null) {
            m92662fJ().m93069k2(UnpinTopicPinBoardView.class, bundle, 2, true);
        }
    }

    /* renamed from: oM */
    void m79990oM() {
        ViewPager viewPager = (ViewPager) this.f73598P0.findViewById(AbstractC6918a0.pager);
        this.f73600R0 = viewPager;
        viewPager.addOnPageChangeListener(new C14327a());
        this.f73600R0.setOffscreenPageLimit(3);
        C7081h1 c7081h1 = new C7081h1(this.f72421L0.m92649TI(), this.f72421L0.getContext(), this.f73603U0, this.f73604V0);
        this.f73601S0 = c7081h1;
        this.f73600R0.setAdapter(c7081h1);
        ((PagerSlidingTabStrip) this.f73598P0.findViewById(AbstractC6918a0.tabs)).setViewPager(this.f73600R0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 27 && objArr.length >= 3) {
            String str = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
            boolean contains = arrayList.contains(CoreUtility.f89233i);
            if (this.f73603U0.equals(str) && !arrayList.isEmpty() && intValue == 4 && contains) {
                finish();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int i11;
        C23648e c23648e;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                i11 = bundle.getInt("extra_tab");
            } catch (Exception e11) {
                AbstractC23350e.m122776f("GroupBoardView", e11);
                return;
            }
        } else {
            i11 = 0;
        }
        if (i11 >= 3) {
            i11 = 0;
        }
        Bundle m92642L3 = this.f72421L0.m92642L3();
        String str = "";
        if (m92642L3 != null) {
            this.f73603U0 = m92642L3.getString("extra_group_id");
            this.f73605W0 = m92642L3.getBoolean("BOL_EXTRA_FROM_GLOBAL");
            str = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            if (m92642L3.containsKey("extra_tab")) {
                i11 = m92642L3.getInt("extra_tab");
            }
        }
        String str2 = str;
        if (TextUtils.isEmpty(this.f73603U0)) {
            return;
        }
        m79990oM();
        this.f73600R0.setCurrentItem(i11, false);
        if (i11 != 0) {
            if (i11 != 1) {
                c23648e = null;
            } else {
                c23648e = new C23648e(6, str2, 1, "poll_list", "2");
            }
        } else {
            c23648e = new C23648e(3, str2, 1, "pinmsg_list", "2");
        }
        if (c23648e != null) {
            C0815e1.m2075D().m2100V(c23648e, false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 27);
    }
}
