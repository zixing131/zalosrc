package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7199r9;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import p055ce.C3432a;
import p142ey.C18631a;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21927m;
import p304ks.C21937w;
import p325lj.C22499f;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import vg.AbstractC28025b8;

/* loaded from: classes6.dex */
public class UserInfoView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    InterfaceC15317c f79131P0;

    /* renamed from: Q0 */
    C7199r9 f79132Q0;

    /* renamed from: R0 */
    ListView f79133R0;

    /* renamed from: S0 */
    ContactProfile f79134S0;

    /* renamed from: U0 */
    boolean f79136U0;

    /* renamed from: V0 */
    String f79137V0;

    /* renamed from: W0 */
    View f79138W0;

    /* renamed from: X0 */
    HightLightSettingView f79139X0;

    /* renamed from: Y0 */
    private C23528a f79140Y0;

    /* renamed from: T0 */
    Handler f79135T0 = new Handler(Looper.getMainLooper());

    /* renamed from: Z0 */
    private final Runnable f79141Z0 = new RunnableC15315a();

    /* renamed from: a1 */
    boolean f79142a1 = false;

    /* renamed from: b1 */
    boolean f79143b1 = false;

    /* renamed from: c1 */
    boolean f79144c1 = false;

    /* renamed from: d1 */
    boolean f79145d1 = false;

    /* renamed from: e1 */
    boolean f79146e1 = false;

    /* renamed from: f1 */
    boolean f79147f1 = false;

    /* renamed from: g1 */
    boolean f79148g1 = false;

    /* renamed from: h1 */
    boolean f79149h1 = false;

    /* renamed from: i1 */
    boolean f79150i1 = false;

    /* renamed from: j1 */
    boolean f79151j1 = false;

    /* renamed from: k1 */
    boolean f79152k1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoView$a */
    /* loaded from: classes6.dex */
    class RunnableC15315a implements Runnable {
        RunnableC15315a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserInfoView userInfoView = UserInfoView.this;
                if (userInfoView.f79134S0 != null) {
                    userInfoView.m86369oM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoView$b */
    /* loaded from: classes6.dex */
    class C15316b implements C7199r9.c {
        C15316b() {
        }

        @Override // com.zing.zalo.adapters.C7199r9.c
        /* renamed from: b2 */
        public void mo36612b2(int i11, boolean z11) {
            InterfaceC15317c interfaceC15317c = UserInfoView.this.f79131P0;
            if (interfaceC15317c != null) {
                interfaceC15317c.mo82209b2(i11, z11);
            }
        }

        @Override // com.zing.zalo.adapters.C7199r9.c
        /* renamed from: c2 */
        public void mo36613c2(int i11, boolean z11) {
            InterfaceC15317c interfaceC15317c = UserInfoView.this.f79131P0;
            if (interfaceC15317c != null && z11) {
                interfaceC15317c.mo82195V(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC15317c {
        /* renamed from: V */
        void mo82195V(int i11);

        /* renamed from: V1 */
        void mo82196V1();

        /* renamed from: b2 */
        void mo82209b2(int i11, boolean z11);
    }

    /* renamed from: jM */
    private View m86361jM(int i11) {
        int firstVisiblePosition = this.f79133R0.getFirstVisiblePosition();
        int childCount = (this.f79133R0.getChildCount() + firstVisiblePosition) - 1;
        if (i11 >= firstVisiblePosition && i11 <= childCount) {
            return this.f79133R0.getChildAt(i11 - firstVisiblePosition);
        }
        return this.f79133R0.getAdapter().getView(i11, null, this.f79133R0);
    }

    /* renamed from: lM */
    private boolean m86362lM() {
        if (this.f79134S0 != null && C3432a.f14402a.m17234c() && this.f79134S0.m40357A0()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m86363mM(int i11) {
        View m86361jM = m86361jM(i11);
        if (m86361jM != null) {
            this.f79139X0.m75744f(m86361jM, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m86364nM(int i11) {
        final int m36610e;
        try {
            if (this.f79134S0 != null && i11 != -1 && (m36610e = this.f79132Q0.m36610e(i11)) != -1) {
                this.f79133R0.smoothScrollToPosition(m36610e);
                this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.s11
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserInfoView.this.m86363mM(m36610e);
                    }
                }, 400L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f79140Y0 = new C23528a(this.f72421L0.m92648SI());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.user_info_fragment, viewGroup, false);
        this.f79138W0 = inflate;
        this.f79133R0 = (ListView) inflate.findViewById(AbstractC6918a0.user_info_list_view);
        this.f79139X0 = (HightLightSettingView) this.f79138W0.findViewById(AbstractC6918a0.highlight_view);
        return this.f79138W0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        this.f79131P0 = null;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11) {
            this.f88756W = 0;
            this.f72421L0.finish();
        }
        this.f77813M0 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Ps */
    public void mo62806Ps() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 != 16908332) {
            return super.mo37491QJ(i11);
        }
        this.f72421L0.finish();
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            m86378xM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Tf */
    public View mo62809Tf() {
        if (this.f72421L0.m92650VI() != null && this.f72421L0.m92650VI().m92656bJ() != null) {
            return this.f72421L0.m92650VI().m92656bJ();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
    }

    /* renamed from: d0 */
    public void m86365d0() {
        try {
            this.f79135T0.post(this.f79141Z0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UserInfoView";
    }

    /* renamed from: iM */
    public View m86366iM(int i11) {
        C7199r9.b bVar;
        C7199r9.f fVar;
        if (this.f79133R0 != null) {
            for (int i12 = 0; i12 < this.f79133R0.getChildCount(); i12++) {
                View childAt = this.f79133R0.getChildAt(i12);
                if (childAt != null && childAt.getTag() != null && (childAt.getTag() instanceof C7199r9.b) && (bVar = (C7199r9.b) childAt.getTag()) != null && (fVar = bVar.f39440f) != null && fVar.m36616b() == i11) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: js */
    public void m86367js(boolean z11) {
        this.f79152k1 = z11;
    }

    /* renamed from: kM */
    public void m86368kM(final int i11) {
        this.f79135T0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.r11
            @Override // java.lang.Runnable
            public final void run() {
                UserInfoView.this.m86364nM(i11);
            }
        }, 200L);
    }

    /* renamed from: oM */
    void m86369oM() {
        int i11;
        C7199r9.f fVar;
        C7199r9.f fVar2;
        C7199r9.f fVar3;
        C7199r9.f fVar4;
        boolean z11;
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f79134S0 != null) {
                C7199r9.f fVar5 = new C7199r9.f(14, AbstractC8020f0.str_user_info_menu_option_info);
                arrayList.add(fVar5);
                if (this.f79134S0.m40387S0()) {
                    arrayList.remove(fVar5);
                    if (!this.f79134S0.m40438z0()) {
                        if (!this.f79143b1 && !this.f79144c1) {
                            arrayList.add(new C7199r9.f(3, AbstractC8020f0.str_optionM_shareVipAcc));
                            arrayList.add(new C7199r9.f(4, AbstractC8020f0.str_optionM_shareVipAccOnTimeLine));
                            arrayList.add(new C7199r9.f(33, AbstractC8020f0.str_chat_setting_viewqr_label));
                        }
                        if (!AbstractC25495a.m132086k(this.f79134S0.f42434r)) {
                            if (!C21927m.m114302u().m114318P(this.f79134S0.f42434r)) {
                                if (!this.f79145d1) {
                                    arrayList.add(new C7199r9.f(10, AbstractC8020f0.btn_vip_follow));
                                }
                            } else if (!this.f79146e1) {
                                arrayList.add(new C7199r9.f(11, AbstractC8020f0.btn_vip_unfollow));
                            }
                        }
                    }
                    arrayList.add(new C7199r9.f(1, AbstractC8020f0.str_reportabuse));
                } else if (!this.f79134S0.f42434r.equals(CoreUtility.f89233i)) {
                    boolean m114558y = AbstractC21935u.m114558y(this.f79134S0.f42434r);
                    if (C18631a.m98447m(this.f79134S0.f42434r)) {
                        C7199r9.f fVar6 = new C7199r9.f(19, AbstractC8020f0.str_change_alias_name_title);
                        ArrayList m141459o = AbstractC28025b8.m141459o("tip.profile.rightmenu.setalias");
                        if (m141459o != null && m141459o.size() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fVar6.f39448f = z11;
                        arrayList.add(fVar6);
                    }
                    if (m114558y) {
                        if (C21927m.m114302u().m114351p() != null) {
                            if (C21927m.m114302u().m114351p().contains(this.f79134S0.f42434r)) {
                                fVar4 = new C7199r9.f(9, AbstractC8020f0.markfavorite_zalouser);
                                fVar4.m36624j(true, true);
                            } else {
                                fVar4 = new C7199r9.f(8, AbstractC8020f0.markfavorite_zalouser);
                                fVar4.m36624j(true, false);
                            }
                            arrayList.add(fVar4);
                        }
                        arrayList.add(new C7199r9.f(13, AbstractC8020f0.str_share_to_friend));
                        arrayList.add(new C7199r9.d(2));
                        arrayList.add(new C7199r9.e(AbstractC8020f0.str_profile_setting_topic_notification));
                        if (this.f79152k1) {
                            fVar = new C7199r9.f(20, AbstractC8020f0.str_setting_notification_profile_option_receive_new_feed);
                            fVar.m36624j(true, true);
                        } else {
                            fVar = new C7199r9.f(21, AbstractC8020f0.str_setting_notification_profile_option_receive_new_feed);
                            fVar.m36624j(true, false);
                        }
                        arrayList.add(fVar);
                        arrayList.add(new C7199r9.d(2));
                        arrayList.add(new C7199r9.e(AbstractC8020f0.str_bottom_sheet_quick_setting_title));
                        if (!this.f79147f1 && !C21912a.m114159g().m114169j(this.f79134S0.f42434r)) {
                            fVar2 = new C7199r9.f(15, AbstractC8020f0.str_bottom_sheet_quick_setting_ban);
                            fVar2.m36624j(true, false);
                            fVar2.m36622h(this.f79149h1);
                            arrayList.add(fVar2);
                            if (!this.f79148g1 && !C21937w.f108027a.m114574m(this.f79134S0.f42434r)) {
                                fVar3 = new C7199r9.f(17, AbstractC8020f0.str_bottom_sheet_quick_setting_hide);
                                fVar3.m36624j(true, false);
                                fVar3.m36622h(this.f79149h1);
                                arrayList.add(fVar3);
                                arrayList.add(new C7199r9.d(2));
                                arrayList.add(new C7199r9.f(1, AbstractC8020f0.str_reportabuse));
                                arrayList.add(new C7199r9.f(7, AbstractC8020f0.str_option_remove_friend));
                            }
                            fVar3 = new C7199r9.f(18, AbstractC8020f0.str_bottom_sheet_quick_setting_hide);
                            fVar3.m36624j(true, true);
                            fVar3.m36622h(this.f79149h1);
                            arrayList.add(fVar3);
                            arrayList.add(new C7199r9.d(2));
                            arrayList.add(new C7199r9.f(1, AbstractC8020f0.str_reportabuse));
                            arrayList.add(new C7199r9.f(7, AbstractC8020f0.str_option_remove_friend));
                        }
                        fVar2 = new C7199r9.f(16, AbstractC8020f0.str_bottom_sheet_quick_setting_ban);
                        fVar2.m36624j(true, true);
                        fVar2.m36622h(this.f79149h1);
                        arrayList.add(fVar2);
                        if (!this.f79148g1) {
                            fVar3 = new C7199r9.f(17, AbstractC8020f0.str_bottom_sheet_quick_setting_hide);
                            fVar3.m36624j(true, false);
                            fVar3.m36622h(this.f79149h1);
                            arrayList.add(fVar3);
                            arrayList.add(new C7199r9.d(2));
                            arrayList.add(new C7199r9.f(1, AbstractC8020f0.str_reportabuse));
                            arrayList.add(new C7199r9.f(7, AbstractC8020f0.str_option_remove_friend));
                        }
                        fVar3 = new C7199r9.f(18, AbstractC8020f0.str_bottom_sheet_quick_setting_hide);
                        fVar3.m36624j(true, true);
                        fVar3.m36622h(this.f79149h1);
                        arrayList.add(fVar3);
                        arrayList.add(new C7199r9.d(2));
                        arrayList.add(new C7199r9.f(1, AbstractC8020f0.str_reportabuse));
                        arrayList.add(new C7199r9.f(7, AbstractC8020f0.str_option_remove_friend));
                    } else {
                        if (!C21927m.m114302u().m114312J().m153137g(this.f79134S0.f42434r) && !this.f79142a1) {
                            if (AbstractC23063f2.m118359k(this.f79134S0.f42434r)) {
                                arrayList.add(new C7199r9.f(12, AbstractC8020f0.str_tv_sendmes));
                            } else {
                                arrayList.add(new C7199r9.f(12, AbstractC8020f0.str_tv_addfriend));
                            }
                        }
                        arrayList.add(new C7199r9.f(1, AbstractC8020f0.str_reportabuse));
                        arrayList.add(new C7199r9.f(5, AbstractC8020f0.str_block_manager));
                    }
                } else {
                    arrayList.add(new C7199r9.f(32, AbstractC8020f0.profile_changeavt));
                    arrayList.add(new C7199r9.f(31, AbstractC8020f0.profile_changecover));
                    if (m86362lM()) {
                        i11 = AbstractC8020f0.str_btn_update_business_description;
                    } else {
                        i11 = AbstractC8020f0.str_profile_update_bio;
                    }
                    C7199r9.f fVar7 = new C7199r9.f(38, i11);
                    arrayList.add(fVar7);
                    C22499f m110205h = AbstractC23306f.m120583H().m110205h();
                    if (m110205h != null && m110205h.m116337m()) {
                        fVar7 = new C7199r9.f(37, AbstractC8020f0.str_my_zalo_pay);
                        arrayList.add(fVar7);
                    }
                    fVar7.m36623i(false);
                    arrayList.add(new C7199r9.d(2));
                    arrayList.add(new C7199r9.e(AbstractC8020f0.profile_info_header_setting));
                    arrayList.add(new C7199r9.f(33, AbstractC8020f0.qrcode_my_code));
                    arrayList.add(new C7199r9.f(34, AbstractC8020f0.str_title_setting_private));
                    arrayList.add(new C7199r9.f(36, AbstractC8020f0.menuframe_manage_acc));
                    C7199r9.f fVar8 = new C7199r9.f(35, AbstractC8020f0.str_setting_app);
                    arrayList.add(fVar8);
                    fVar8.m36623i(false);
                }
            }
            this.f79132Q0.m36611h(arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
    }

    /* renamed from: pM */
    public void m86370pM(boolean z11) {
        this.f79147f1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: qG */
    public View mo62819qG() {
        return this.f79138W0;
    }

    /* renamed from: qM */
    public void m86371qM(boolean z11) {
        this.f79143b1 = z11;
    }

    /* renamed from: rM */
    public void m86372rM(boolean z11) {
        this.f79145d1 = z11;
    }

    /* renamed from: sM */
    public void m86373sM(boolean z11) {
        this.f79146e1 = z11;
    }

    /* renamed from: tM */
    public void m86374tM(boolean z11) {
        this.f79149h1 = z11;
    }

    /* renamed from: uM */
    public void m86375uM(boolean z11) {
        this.f79148g1 = z11;
    }

    /* renamed from: vM */
    public void m86376vM(boolean z11) {
        this.f79144c1 = z11;
    }

    /* renamed from: wM */
    public void m86377wM(ContactProfile contactProfile, boolean z11, boolean z12, String str, boolean z13) {
        try {
            this.f79134S0 = contactProfile;
            this.f79136U0 = z12;
            this.f79142a1 = z13;
            this.f79137V0 = str;
            m86378xM();
            if (z11) {
                this.f79135T0.postDelayed(this.f79141Z0, 400L);
            } else {
                this.f79135T0.post(this.f79141Z0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f79132Q0 = new C7199r9(this.f72421L0.m92648SI(), new C15316b());
        this.f79133R0.setClickable(false);
        this.f79133R0.setAdapter((ListAdapter) this.f79132Q0);
        InterfaceC15317c interfaceC15317c = this.f79131P0;
        if (interfaceC15317c != null) {
            interfaceC15317c.mo82196V1();
        }
    }

    /* renamed from: xM */
    void m86378xM() {
        String m118743r0;
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            ContactProfile contactProfile = this.f79134S0;
            if (contactProfile != null) {
                m118743r0 = contactProfile.m40383Q(true, false);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_title_right_menu);
            }
            actionBar.setTitle(m118743r0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        if ((this.f72421L0.m92650VI() instanceof InterfaceC15317c) && this.f72421L0.m92650VI() != null) {
            this.f79131P0 = (InterfaceC15317c) this.f72421L0.m92650VI();
        }
    }
}
