package com.zing.zalo.p077ui.settings;

import ac.C0708i;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.settings.SettingTimelineV2View;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.BlackListView;
import com.zing.zalo.p077ui.zviews.HiddenListView;
import com.zing.zalo.p077ui.zviews.StoryBlockedListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hf0.C20048j;
import la0.C22229g7;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p398oo.C24380u;
import p509sp.C26354c;
import p649xl.C29858ic;

/* loaded from: classes6.dex */
public final class SettingTimelineV2View extends BaseSettingView {
    public static final C13179a Companion = new C13179a(null);

    /* renamed from: T0 */
    public C29858ic f67986T0;

    /* renamed from: U0 */
    private int f67987U0;

    /* renamed from: com.zing.zalo.ui.settings.SettingTimelineV2View$a */
    /* loaded from: classes6.dex */
    public static final class C13179a {
        private C13179a() {
        }

        public /* synthetic */ C13179a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: FM */
    private final void m74162FM() {
        Integer num;
        long j11;
        Bundle m92642L3 = m92642L3();
        Integer num2 = null;
        if (m92642L3 != null) {
            num = Integer.valueOf(m92642L3.getInt("EXTRA_OPEN_SETTING", -1));
        } else {
            num = null;
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            num2 = Integer.valueOf(m92642L32.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1));
        }
        if (num != null && num.intValue() == 47) {
            if (num2 != null && num2.intValue() == 141) {
                j11 = 500;
            } else {
                j11 = 200;
            }
            mo78955kl(new Runnable() { // from class: la0.d6
                @Override // java.lang.Runnable
                public final void run() {
                    SettingTimelineV2View.m74163GM(SettingTimelineV2View.this);
                }
            }, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m74163GM(SettingTimelineV2View settingTimelineV2View) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        settingTimelineV2View.m74173RM();
    }

    /* renamed from: IM */
    private final int m74164IM() {
        int i11 = this.f67987U0;
        if (i11 != 8) {
            return i11 != 43 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m74165JM(SettingTimelineV2View settingTimelineV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingTimelineV2View.m74172QM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m74166KM(SettingTimelineV2View settingTimelineV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingTimelineV2View.m74172QM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m74167LM(SettingTimelineV2View settingTimelineV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingTimelineV2View.m74172QM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m74168MM(SettingTimelineV2View settingTimelineV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingTimelineV2View.m74172QM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m74169NM(SettingTimelineV2View settingTimelineV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingTimelineV2View.m74172QM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m74170OM(SettingTimelineV2View settingTimelineV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingTimelineV2View.m74172QM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m74171PM(SettingTimelineV2View settingTimelineV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingTimelineV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingTimelineV2View.m74172QM(listItemSetting, z11);
    }

    /* renamed from: QM */
    private final void m74172QM(ListItemSetting listItemSetting, boolean z11) {
        if (AbstractC19074t.m100204b(listItemSetting, m74178HM().f138193s)) {
            m74173RM();
        } else if (AbstractC19074t.m100204b(listItemSetting, m74178HM().f138192r)) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SETTING_ID", 17);
            bundle.putBoolean("EXTRA_BOL_PRIVACY", false);
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(BottomSheetSettingView.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74178HM().f138191q)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("EXTRA_SETTING_ID", 41);
            bundle2.putBoolean("EXTRA_BOL_PRIVACY", false);
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(BottomSheetSettingView.class, bundle2, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74178HM().f138196v)) {
            AbstractC23309i.m122338qz(z11);
            if (!z11) {
                AbstractC23647d.m123906p("49180010");
                AbstractC23647d.m123893c();
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74178HM().f138197w)) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("int_extra_source_open", 1);
            C17487o0 m92662fJ3 = m92662fJ();
            if (m92662fJ3 != null) {
                m92662fJ3.m93069k2(BlackListView.class, bundle3, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74178HM().f138195u)) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("int_extra_source_open", 1);
            C17487o0 m92662fJ4 = m92662fJ();
            if (m92662fJ4 != null) {
                m92662fJ4.m93069k2(StoryBlockedListView.class, bundle4, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74178HM().f138194t)) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("int_extra_source_open", 1);
            C17487o0 m92662fJ5 = m92662fJ();
            if (m92662fJ5 != null) {
                m92662fJ5.m93069k2(HiddenListView.class, bundle5, 1, true);
            }
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: RM */
    private final void m74173RM() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SETTING_ID", 47);
        bundle.putBoolean("EXTRA_BOL_PRIVACY", false);
        bundle.putInt("EXTRA_SOURCE_FROM", m74164IM());
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(BottomSheetSettingView.class, bundle, 1, true);
        }
    }

    /* renamed from: TM */
    private final void m74174TM() {
        int i11;
        C24380u c24380u = C24380u.f117739a;
        if (c24380u.m127512e()) {
            m74178HM().f138193s.setVisibility(0);
            m74178HM().f138198x.setVisibility(0);
            m74178HM().f138199y.setVisibility(0);
            ListItemSetting listItemSetting = m74178HM().f138193s;
            if (c24380u.mo127507a()) {
                i11 = AbstractC8020f0.setting_value_on;
            } else {
                i11 = AbstractC8020f0.setting_value_off;
            }
            listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(i11));
            return;
        }
        m74178HM().f138193s.setVisibility(8);
        m74178HM().f138198x.setVisibility(8);
        m74178HM().f138199y.setVisibility(8);
    }

    /* renamed from: HM */
    public final C29858ic m74178HM() {
        C29858ic c29858ic = this.f67986T0;
        if (c29858ic != null) {
            return c29858ic;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_section_timeline);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    public final void m74179SM(C29858ic c29858ic) {
        AbstractC19074t.m100208f(c29858ic, "<set-?>");
        this.f67986T0 = c29858ic;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (bundle != null) {
            mo73526uM();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingTimelineAndStoryView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 43;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m74178HM().f138192r;
        AbstractC19074t.m100207e(listItemSetting, "itemAutoPlayVideo");
        ListItemSetting listItemSetting2 = m74178HM().f138191q;
        AbstractC19074t.m100207e(listItemSetting2, "itemAutoPlayMusic");
        ListItemSetting listItemSetting3 = m74178HM().f138196v;
        AbstractC19074t.m100207e(listItemSetting3, "itemSuggestStickerComment");
        ListItemSetting listItemSetting4 = m74178HM().f138197w;
        AbstractC19074t.m100207e(listItemSetting4, "itemTimelineBlock");
        ListItemSetting listItemSetting5 = m74178HM().f138195u;
        AbstractC19074t.m100207e(listItemSetting5, "itemStoryBlock");
        ListItemSetting listItemSetting6 = m74178HM().f138194t;
        AbstractC19074t.m100207e(listItemSetting6, "itemHideFeed");
        ListItemSetting listItemSetting7 = m74178HM().f138193s;
        AbstractC19074t.m100207e(listItemSetting7, "itemFilterTimeline");
        return new C22229g7[]{new C22229g7(listItemSetting, 73), new C22229g7(listItemSetting2, 117), new C22229g7(listItemSetting3, 103), new C22229g7(listItemSetting4, 74), new C22229g7(listItemSetting5, 76), new C22229g7(listItemSetting6, 75), new C22229g7(listItemSetting7, 141)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        int i11;
        Bundle m92642L3 = m92642L3();
        int i12 = 0;
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("EXTRA_SOURCE_FROM", 0);
        } else {
            i11 = 0;
        }
        this.f67987U0 = i11;
        final ListItemSetting listItemSetting = m74178HM().f138193s;
        listItemSetting.setIdTracking("setting_item_filter_timeline");
        C0708i c0708i = new C0708i();
        c0708i.m1072c("src", m74164IM());
        listItemSetting.setTrackingExtraData(c0708i);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.w5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingTimelineV2View.m74168MM(SettingTimelineV2View.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m74178HM().f138192r;
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.x5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingTimelineV2View.m74169NM(SettingTimelineV2View.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m74178HM().f138191q;
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: la0.y5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingTimelineV2View.m74170OM(SettingTimelineV2View.this, listItemSetting3, view);
            }
        });
        final ListItemSetting listItemSetting4 = m74178HM().f138196v;
        if (AbstractC23309i.m121234Ng()) {
            listItemSetting4.setSwitch(true);
            listItemSetting4.m90592m(false);
            listItemSetting4.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.z5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    SettingTimelineV2View.m74171PM(SettingTimelineV2View.this, listItemSetting4, compoundButton, z11);
                }
            });
        } else {
            listItemSetting4.setVisibility(8);
            m74178HM().f138191q.m90592m(false);
        }
        final ListItemSetting listItemSetting5 = m74178HM().f138197w;
        listItemSetting5.setShowChevronRight(true);
        listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: la0.a6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingTimelineV2View.m74165JM(SettingTimelineV2View.this, listItemSetting5, view);
            }
        });
        final ListItemSetting listItemSetting6 = m74178HM().f138195u;
        listItemSetting6.setShowChevronRight(true);
        listItemSetting6.setOnClickListener(new View.OnClickListener() { // from class: la0.b6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingTimelineV2View.m74166KM(SettingTimelineV2View.this, listItemSetting6, view);
            }
        });
        final ListItemSetting listItemSetting7 = m74178HM().f138194t;
        listItemSetting7.setShowChevronRight(true);
        listItemSetting7.m90592m(false);
        listItemSetting7.setOnClickListener(new View.OnClickListener() { // from class: la0.c6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingTimelineV2View.m74167LM(SettingTimelineV2View.this, listItemSetting7, view);
            }
        });
        if (AbstractC23309i.m121565We() && ZMediaPlayerSettings.getVideoConfig(1).getPlayInline() == 1) {
            m74178HM().f138192r.setVisibility(0);
        } else {
            m74178HM().f138192r.setVisibility(8);
        }
        if (!AbstractC0924m0.m4105p9()) {
            i12 = 8;
        }
        m74178HM().f138197w.setVisibility(i12);
        m74178HM().f138195u.setVisibility(i12);
        m74178HM().f138194t.setVisibility(i12);
        m74178HM().f138200z.setVisibility(i12);
        m74162FM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29858ic m148086b = C29858ic.m148086b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148086b, "inflate(...)");
        m74179SM(m148086b);
        View root = m74178HM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        int i11;
        int i12;
        ListItemSetting listItemSetting = m74178HM().f138192r;
        int m104104c = C20048j.f98580a.m104104c();
        if (m104104c != 0) {
            if (m104104c != 2) {
                i11 = AbstractC8020f0.str_setting_video_mode_auto_play_always;
            } else {
                i11 = AbstractC8020f0.str_setting_video_mode_auto_play_with_wifi;
            }
        } else {
            i11 = AbstractC8020f0.str_setting_video_mode_auto_play_off;
        }
        listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(i11));
        ListItemSetting listItemSetting2 = m74178HM().f138191q;
        int m135672c = C26354c.f125196a.m135672c();
        if (m135672c != 0) {
            if (m135672c != 2) {
                i12 = AbstractC8020f0.str_setting_video_mode_auto_play_always;
            } else {
                i12 = AbstractC8020f0.str_setting_video_mode_auto_play_with_wifi;
            }
        } else {
            i12 = AbstractC8020f0.str_setting_video_mode_auto_play_off;
        }
        listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(i12));
        m74178HM().f138196v.setSwitch(AbstractC23309i.m121305Pd());
        m74174TM();
    }
}
