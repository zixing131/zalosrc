package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.business_account.business_tools.BusinessAccountDetailBottomSheet;
import com.zing.zalo.dialog.InviteContactListView;
import com.zing.zalo.feed.mvp.album.AlbumListBottomSheet;
import com.zing.zalo.feed.mvp.album.OptionAlbumBottomSheet;
import com.zing.zalo.feed.mvp.bottomsheetmenu.BottomSheetMenuView;
import com.zing.zalo.feed.mvp.music.view.MusicDetailBottomSheet;
import com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet;
import com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet;
import com.zing.zalo.feed.mvp.quickcomment.QuickCommentView;
import com.zing.zalo.feed.mvp.storymusic.view.StoryMusicDetailBottomSheet;
import com.zing.zalo.feed.mvp.visibletimelimit.FeedVisibleTimeLimitOptionsBottomSheetView;
import com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet;
import com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet;
import com.zing.zalo.p077ui.group.bottomsheet.invitees.BottomSheetInviteesView;
import com.zing.zalo.p077ui.picker.mycloud.AttachmentMyCloudQuickPickerView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.productcatalog.p068ui.zview.CatalogContextMenuBottomSheet;
import com.zing.zalo.productcatalog.p068ui.zview.CatalogPickerBottomSheetView;
import com.zing.zalo.productcatalog.p068ui.zview.ProductCatalogBottomSheetView;
import com.zing.zalo.productcatalog.p068ui.zview.ProductContextMenuBottomSheet;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import np.InterfaceC23923b;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p494rv.C25979a;
import p500s1.C26086a;
import p500s1.C26088c;
import p509sp.C26361j;

/* loaded from: classes6.dex */
public class FrameLayoutKeepBtmSheetZaloView extends CommonZaloview implements ZaloView.InterfaceC17421f, InterfaceC23923b, InterfaceC0733x {

    /* renamed from: L0 */
    View f73423L0;

    /* renamed from: M0 */
    public FrameLayout f73424M0;

    /* renamed from: N0 */
    BottomSheetZaloViewWithAnim f73425N0;

    /* renamed from: P0 */
    private int f73427P0;

    /* renamed from: R0 */
    private String f73429R0;

    /* renamed from: S0 */
    AnimatorSet f73430S0;

    /* renamed from: O0 */
    boolean f73426O0 = false;

    /* renamed from: Q0 */
    private boolean f73428Q0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.FrameLayoutKeepBtmSheetZaloView$a */
    /* loaded from: classes6.dex */
    class C14287a implements BottomSheetZaloViewWithAnim.InterfaceC14117c {
        C14287a() {
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim.InterfaceC14117c
        /* renamed from: a */
        public void mo78543a() {
            BottomSheetZaloViewWithAnim bottomSheetZaloViewWithAnim = FrameLayoutKeepBtmSheetZaloView.this.f73425N0;
            if (bottomSheetZaloViewWithAnim != null) {
                bottomSheetZaloViewWithAnim.mo37567hM();
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim.InterfaceC14117c
        /* renamed from: b */
        public void mo78544b() {
            FrameLayoutKeepBtmSheetZaloView.this.close();
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim.InterfaceC14117c
        /* renamed from: c */
        public C17487o0 mo78545c() {
            return FrameLayoutKeepBtmSheetZaloView.this.m92662fJ();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FrameLayoutKeepBtmSheetZaloView$b */
    /* loaded from: classes6.dex */
    public class C14288b extends AnimatorListenerAdapter {
        C14288b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            FrameLayoutKeepBtmSheetZaloView frameLayoutKeepBtmSheetZaloView = FrameLayoutKeepBtmSheetZaloView.this;
            frameLayoutKeepBtmSheetZaloView.f73426O0 = false;
            frameLayoutKeepBtmSheetZaloView.f73423L0.setVisibility(8);
            FrameLayoutKeepBtmSheetZaloView.this.finish();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FrameLayoutKeepBtmSheetZaloView frameLayoutKeepBtmSheetZaloView = FrameLayoutKeepBtmSheetZaloView.this;
            frameLayoutKeepBtmSheetZaloView.f73426O0 = false;
            frameLayoutKeepBtmSheetZaloView.f73423L0.setVisibility(8);
            FrameLayoutKeepBtmSheetZaloView.this.finish();
        }
    }

    /* renamed from: gM */
    public /* synthetic */ void m79788gM(View view) {
        if (this.f73427P0 == 2) {
            AbstractC23647d.m123897g("4915801");
        }
        m79789eM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.frame_layout_keep_btm_sheet_zalo_view, viewGroup, false);
        this.f73423L0 = inflate;
        this.f73424M0 = (FrameLayout) inflate.findViewById(AbstractC6918a0.fl_bottom_container);
        this.f73423L0.setBackgroundColor(-1728053248);
        this.f73423L0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qf
            public /* synthetic */ ViewOnClickListenerC16054qf() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FrameLayoutKeepBtmSheetZaloView.this.m79788gM(view);
            }
        });
        this.f73423L0.setVisibility(4);
        return this.f73423L0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        if (this.f73429R0 != null) {
            C23744a.m124114c().m124117e(this, 92);
        }
    }

    public void close() {
        AnimatorSet animatorSet = this.f73430S0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ObjectAnimator.ofFloat(this.f73423L0, "alpha", 0.0f));
        animatorSet2.setDuration(250L);
        animatorSet2.setInterpolator(new C26086a());
        animatorSet2.addListener(new C14288b());
        animatorSet2.start();
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return C26361j.f125215a.m135697c(this.f72828C0);
    }

    /* renamed from: eM */
    public void m79789eM() {
        if (!this.f73426O0) {
            this.f73426O0 = true;
            BottomSheetZaloViewWithAnim bottomSheetZaloViewWithAnim = this.f73425N0;
            if (bottomSheetZaloViewWithAnim != null) {
                bottomSheetZaloViewWithAnim.close();
            }
        }
    }

    /* renamed from: fM */
    public int m79790fM() {
        return this.f73427P0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        BottomSheetZaloViewWithAnim bottomSheetZaloViewWithAnim = this.f73425N0;
        if (bottomSheetZaloViewWithAnim != null) {
            bottomSheetZaloViewWithAnim.finish();
        }
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "frame_layout_keep_btm_sheet_zalo_view";
    }

    /* renamed from: hM */
    public void m79791hM() {
        this.f73423L0.setAlpha(0.0f);
        this.f73423L0.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f73430S0 = animatorSet;
        animatorSet.play(ObjectAnimator.ofFloat(this.f73423L0, "alpha", 1.0f));
        this.f73430S0.setDuration(250L);
        this.f73430S0.setInterpolator(new C26088c());
        this.f73430S0.start();
        BottomSheetZaloViewWithAnim bottomSheetZaloViewWithAnim = this.f73425N0;
        if (bottomSheetZaloViewWithAnim != null) {
            bottomSheetZaloViewWithAnim.m78542lM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m92643OI(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent)) {
            return true;
        }
        BottomSheetZaloViewWithAnim bottomSheetZaloViewWithAnim = this.f73425N0;
        if (bottomSheetZaloViewWithAnim != null && bottomSheetZaloViewWithAnim.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            m79789eM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f73428Q0) {
            if (m92656bJ() != null) {
                m92656bJ().bringToFront();
            }
            this.f73428Q0 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 92) {
            try {
                if (TextUtils.equals((String) objArr[0], this.f73429R0)) {
                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sf
                        public /* synthetic */ RunnableC16129sf() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            FrameLayoutKeepBtmSheetZaloView.this.close();
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        boolean z11;
        String str;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z12 = true;
        if (m92642L3 != null) {
            this.f73427P0 = m92642L3.getInt("EXTRA_BOTTOM_SHEET_TYPE");
            this.f73429R0 = m92642L3.getString("CONVERSATION_ID", null);
            switch (this.f73427P0) {
                case 1:
                    this.f73425N0 = new InviteContactListView();
                    z11 = true;
                    break;
                case 2:
                    this.f73425N0 = new QuickCommentView();
                    z11 = true;
                    break;
                case 3:
                    this.f73425N0 = new BottomSheetInviteesView();
                    z11 = true;
                    break;
                case 4:
                    this.f73425N0 = new AlbumListBottomSheet();
                    z11 = true;
                    break;
                case 5:
                    this.f73425N0 = new OptionAlbumBottomSheet();
                    z11 = true;
                    break;
                case 6:
                    this.f73425N0 = new BottomSheetMenuView();
                    z11 = true;
                    break;
                case 7:
                    this.f73425N0 = new FeedVisibleTimeLimitOptionsBottomSheetView();
                    z11 = true;
                    break;
                case 8:
                    this.f73425N0 = new ChangeAliasBottomSheetView();
                    z11 = true;
                    break;
                case 9:
                    this.f73425N0 = new MusicListBottomSheet();
                    z11 = true;
                    break;
                case 10:
                    this.f73425N0 = new MusicDetailBottomSheet();
                    z11 = true;
                    break;
                case 11:
                    this.f73425N0 = new SettingFeedNotificationBottomSheet();
                    z11 = true;
                    break;
                case 12:
                case 18:
                default:
                    z11 = false;
                    break;
                case 13:
                    this.f73425N0 = new StoryMusicDetailBottomSheet();
                    z11 = true;
                    break;
                case 14:
                    this.f73425N0 = new RingtoneBottomSheet();
                    z11 = true;
                    break;
                case 15:
                    this.f73425N0 = new BottomSheetE2eeView();
                    z11 = true;
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    this.f73425N0 = new AttachmentMyCloudQuickPickerView();
                    z11 = true;
                    break;
                case 17:
                    this.f73425N0 = new SystemRingtonesBottomSheet();
                    z11 = true;
                    break;
                case 19:
                    this.f73425N0 = new TimeRangePickerBottomSheetView();
                    z11 = true;
                    break;
                case 20:
                    this.f73425N0 = new ProductCatalogBottomSheetView();
                    z11 = true;
                    break;
                case 21:
                    this.f73425N0 = new ProductContextMenuBottomSheet();
                    z11 = true;
                    break;
                case 22:
                    this.f73425N0 = new CatalogContextMenuBottomSheet();
                    z11 = true;
                    break;
                case 23:
                    this.f73425N0 = new CatalogPickerBottomSheetView();
                    z11 = true;
                    break;
                case 24:
                    this.f73425N0 = new BusinessAccountDetailBottomSheet();
                    z11 = true;
                    break;
                case 25:
                    this.f73425N0 = new UnMuteCallBottomSheet();
                    z11 = true;
                    break;
                case 26:
                    this.f73425N0 = new DetailLoginBottomSheetView();
                    z11 = true;
                    break;
                case 27:
                    this.f73425N0 = new IntroduceBackupRulesBottomSheet();
                    z11 = true;
                    break;
                case 28:
                    this.f73425N0 = new ChangeOptionBackupE2EEBottomSheet();
                    z11 = true;
                    break;
            }
            if (this.f73425N0 instanceof AttachmentMyCloudQuickPickerView) {
                str = "MyCloudQuickPickerView";
            } else {
                str = "CommonZaloview";
            }
            String str2 = str;
            if (z11) {
                ZaloView m92996E0 = m92649TI().m92996E0(str2);
                if (m92996E0 != null) {
                    m92649TI().mo92702G1(m92996E0, 0);
                }
                m92649TI().mo93055b2(AbstractC6918a0.fl_bottom_container, this.f73425N0, m92642L3, 0, str2, 0, false);
                this.f73425N0.m78541kM(new C14287a());
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.rf
                    public /* synthetic */ RunnableC16091rf() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameLayoutKeepBtmSheetZaloView.this.m79791hM();
                    }
                });
                if (this.f73429R0 != null) {
                    C23744a.m124114c().m124115b(this, 92);
                }
            }
        }
        if (bundle == null) {
            z12 = false;
        }
        this.f73428Q0 = z12;
    }
}
