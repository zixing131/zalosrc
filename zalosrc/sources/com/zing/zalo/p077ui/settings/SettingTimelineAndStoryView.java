package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.music.view.SettingAutoDownloadMusicView;
import com.zing.zalo.p077ui.settings.SettingTimelineAndStoryView;
import com.zing.zalo.p077ui.settings.subsettings.SettingVideoView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.BlackListView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.HiddenListView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.StoryBlockedListView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import me0.AbstractC23217t2;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;

/* loaded from: classes6.dex */
public class SettingTimelineAndStoryView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f67965P0;

    /* renamed from: Q0 */
    LinearLayout f67966Q0;

    /* renamed from: R0 */
    LinearLayout f67967R0;

    /* renamed from: S0 */
    LinearLayout f67968S0;

    /* renamed from: T0 */
    LinearLayout f67969T0;

    /* renamed from: U0 */
    LinearLayout f67970U0;

    /* renamed from: V0 */
    View f67971V0;

    /* renamed from: W0 */
    View f67972W0;

    /* renamed from: X0 */
    View f67973X0;

    /* renamed from: Y0 */
    View f67974Y0;

    /* renamed from: Z0 */
    View f67975Z0;

    /* renamed from: a1 */
    StencilSwitch f67976a1;

    /* renamed from: b1 */
    ScrollViewVisibleChildViewDetector f67977b1;

    /* renamed from: c1 */
    HightLightSettingView f67978c1;

    /* renamed from: d1 */
    int f67979d1 = -1;

    /* renamed from: e1 */
    int f67980e1 = 0;

    /* renamed from: f1 */
    final sh0 f67981f1 = new sh0();

    /* renamed from: com.zing.zalo.ui.settings.SettingTimelineAndStoryView$a */
    /* loaded from: classes6.dex */
    class C13176a extends AbstractC0939u {
        C13176a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC23309i.m122338qz(SettingTimelineAndStoryView.this.f67976a1.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingTimelineAndStoryView$b */
    /* loaded from: classes6.dex */
    public class C13177b extends AbstractC0939u {
        C13177b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74156d(boolean z11, boolean z12, boolean z13) {
            int i11;
            SettingTimelineAndStoryView.this.f67976a1.setChecked(z11);
            LinearLayout linearLayout = SettingTimelineAndStoryView.this.f67970U0;
            int i12 = 8;
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
            View findViewById = SettingTimelineAndStoryView.this.f67977b1.findViewById(AbstractC6918a0.suggest_sticker_feed_sep);
            if (findViewById != null) {
                if (AbstractC23309i.m121234Ng() && z13) {
                    i12 = 0;
                }
                findViewById.setVisibility(i12);
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            final boolean m121305Pd = AbstractC23309i.m121305Pd();
            final boolean m121234Ng = AbstractC23309i.m121234Ng();
            final boolean m4105p9 = AbstractC0924m0.m4105p9();
            ((CommonZaloview) SettingTimelineAndStoryView.this).f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.settings.i0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingTimelineAndStoryView.C13177b.this.m74156d(m121305Pd, m121234Ng, m4105p9);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingTimelineAndStoryView$c */
    /* loaded from: classes6.dex */
    public class RunnableC13178c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f67984p;

        RunnableC13178c(View view) {
            this.f67984p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (SettingTimelineAndStoryView.this.f67981f1.m87411l(this.f67984p, this)) {
                return;
            }
            SettingTimelineAndStoryView settingTimelineAndStoryView = SettingTimelineAndStoryView.this;
            int i11 = settingTimelineAndStoryView.f67979d1;
            if (i11 != 16) {
                if (i11 != 103) {
                    if (i11 != 117) {
                        switch (i11) {
                            case 73:
                                linearLayout = settingTimelineAndStoryView.f67968S0;
                                break;
                            case 74:
                                if (settingTimelineAndStoryView.f67965P0.getVisibility() == 0) {
                                    linearLayout = SettingTimelineAndStoryView.this.f67965P0;
                                    break;
                                }
                                linearLayout = null;
                                break;
                            case 75:
                                if (settingTimelineAndStoryView.f67966Q0.getVisibility() == 0) {
                                    linearLayout = SettingTimelineAndStoryView.this.f67966Q0;
                                    break;
                                }
                                linearLayout = null;
                                break;
                            case 76:
                                if (settingTimelineAndStoryView.f67967R0.getVisibility() == 0) {
                                    linearLayout = SettingTimelineAndStoryView.this.f67967R0;
                                    break;
                                }
                                linearLayout = null;
                                break;
                            default:
                                linearLayout = null;
                                break;
                        }
                    } else {
                        linearLayout = settingTimelineAndStoryView.f67969T0;
                    }
                } else {
                    linearLayout = settingTimelineAndStoryView.f67970U0;
                }
                SettingTimelineAndStoryView settingTimelineAndStoryView2 = SettingTimelineAndStoryView.this;
                settingTimelineAndStoryView2.f67981f1.m87409j(linearLayout, settingTimelineAndStoryView2.f67978c1, settingTimelineAndStoryView2.f67980e1);
                SettingTimelineAndStoryView.this.m74145MA();
                return;
            }
            if (settingTimelineAndStoryView.f67970U0.getVisibility() == 0) {
                linearLayout = SettingTimelineAndStoryView.this.f67970U0;
                SettingTimelineAndStoryView settingTimelineAndStoryView22 = SettingTimelineAndStoryView.this;
                settingTimelineAndStoryView22.f67981f1.m87409j(linearLayout, settingTimelineAndStoryView22.f67978c1, settingTimelineAndStoryView22.f67980e1);
                SettingTimelineAndStoryView.this.m74145MA();
                return;
            }
            linearLayout = null;
            SettingTimelineAndStoryView settingTimelineAndStoryView222 = SettingTimelineAndStoryView.this;
            settingTimelineAndStoryView222.f67981f1.m87409j(linearLayout, settingTimelineAndStoryView222.f67978c1, settingTimelineAndStoryView222.f67980e1);
            SettingTimelineAndStoryView.this.m74145MA();
            return;
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m74145MA() {
        this.f67979d1 = -1;
        this.f67980e1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m74146Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f67979d1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f67980e1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public void m74150jM() {
        try {
            AbstractC26084s.m134251H(this.f67968S0, 73);
            AbstractC26084s.m134251H(this.f67969T0, 117);
            AbstractC26084s.m134251H(this.f67965P0, 74);
            AbstractC26084s.m134251H(this.f67966Q0, 75);
            AbstractC26084s.m134251H(this.f67967R0, 76);
            AbstractC26084s.m134251H(this.f67970U0, 103);
            this.f67981f1.m87405e(this, 43);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kM */
    private void m74151kM(View view) {
        if (this.f67979d1 >= 0) {
            view.postDelayed(new RunnableC13178c(view), 300L);
        }
    }

    /* renamed from: nM */
    private void m74152nM() {
        int i11;
        try {
            if (AbstractC0924m0.m4105p9()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            this.f67965P0.setVisibility(i11);
            this.f67973X0.setVisibility(i11);
            this.f67966Q0.setVisibility(i11);
            this.f67974Y0.setVisibility(i11);
            this.f67967R0.setVisibility(i11);
            if (!AbstractC0924m0.m4105p9() && !AbstractC23309i.m121234Ng()) {
                this.f67975Z0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            m74146Vp();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_timeline_and_story_view, viewGroup, false);
        m74153lM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67981f1.m87408i());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m74146Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m74151kM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67981f1.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m74150jM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f67977b1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_setting_video_auto_play) {
            return 73;
        }
        if (i11 == AbstractC6918a0.ll_block_timeline) {
            return 74;
        }
        if (i11 == AbstractC6918a0.ll_hidden_timeline_friend) {
            return 75;
        }
        if (i11 == AbstractC6918a0.ll_story_block) {
            return 76;
        }
        return i11 == AbstractC6918a0.ll_suggest_sticker_feed ? 103 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingTimelineAndStoryView";
    }

    /* renamed from: lM */
    void m74153lM(View view) {
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f67977b1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f67981f1.m87415u(this.f67977b1);
            this.f67978c1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f67965P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_block_timeline);
            this.f67966Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_hidden_timeline_friend);
            this.f67967R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_story_block);
            this.f67968S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_video_auto_play);
            this.f67969T0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_auto_download_music);
            this.f67970U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_suggest_sticker_feed);
            this.f67971V0 = view.findViewById(AbstractC6918a0.tv_video_section);
            this.f67972W0 = view.findViewById(AbstractC6918a0.separate_video_section);
            this.f67976a1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_suggest_sticker_feed);
            this.f67975Z0 = view.findViewById(AbstractC6918a0.timeline_block_title);
            this.f67974Y0 = view.findViewById(AbstractC6918a0.story_block_title);
            this.f67973X0 = view.findViewById(AbstractC6918a0.change_phone_number_sep);
            this.f67965P0.setOnClickListener(this);
            this.f67966Q0.setOnClickListener(this);
            this.f67967R0.setOnClickListener(this);
            this.f67968S0.setOnClickListener(this);
            this.f67969T0.setOnClickListener(this);
            this.f67970U0.setOnClickListener(this);
            this.f67976a1.setOnClickListener(this);
            if (AbstractC23309i.m121565We() && ZMediaPlayerSettings.getVideoConfig(1).getPlayInline() == 1) {
                this.f67968S0.setVisibility(0);
                this.f67971V0.setVisibility(0);
            } else {
                this.f67968S0.setVisibility(8);
                this.f67971V0.setVisibility(8);
            }
            m74154mM();
            m74152nM();
            m74151kM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m74154mM() {
        try {
            C0824j.m2153b(new C13177b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_block_timeline) {
                Bundle bundle = new Bundle();
                bundle.putInt("int_extra_source_open", 1);
                m92662fJ().m93069k2(BlackListView.class, bundle, 1, true);
                AbstractC26084s.m134269q(0, 74);
                C0815e1.m2079N(74, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_hidden_timeline_friend) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("int_extra_source_open", 1);
                m92662fJ().m93069k2(HiddenListView.class, bundle2, 1, true);
                AbstractC26084s.m134269q(0, 75);
                C0815e1.m2079N(75, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_story_block) {
                Bundle bundle3 = new Bundle();
                bundle3.putInt("int_extra_source_open", 1);
                m92662fJ().m93069k2(StoryBlockedListView.class, bundle3, 1, true);
                AbstractC26084s.m134269q(0, 76);
                C0815e1.m2079N(76, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_setting_video_auto_play) {
                m92662fJ().m93069k2(SettingVideoView.class, null, 1, true);
                AbstractC26084s.m134269q(0, 73);
                C0815e1.m2079N(73, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_setting_auto_download_music) {
                m92662fJ().m93069k2(SettingAutoDownloadMusicView.class, null, 1, true);
                AbstractC26084s.m134269q(0, 117);
                C0815e1.m2079N(117, 1, 0, 0, 0);
            } else if (id2 == AbstractC6918a0.ll_suggest_sticker_feed || id2 == AbstractC6918a0.sw_suggest_sticker_feed) {
                boolean z11 = !this.f67976a1.isChecked();
                this.f67976a1.setChecked(z11);
                C0824j.m2153b(new C13176a());
                AbstractC26084s.m134269q(0, 103);
                if (!z11) {
                    AbstractC23647d.m123906p("49180010");
                    AbstractC23647d.m123893c();
                }
                C0815e1.m2079N(103, 1, 0, 0, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f67981f1.m87413s();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.v5
                @Override // java.lang.Runnable
                public final void run() {
                    SettingTimelineAndStoryView.this.m74150jM();
                }
            });
        }
    }
}
