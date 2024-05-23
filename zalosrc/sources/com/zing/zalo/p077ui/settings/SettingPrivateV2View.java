package com.zing.zalo.p077ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bp0.C3080a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.settings.SettingPrivateV2View;
import com.zing.zalo.p077ui.settings.subsettings.SettingBlockAndHideView;
import com.zing.zalo.p077ui.settings.subsettings.SettingFeedPrivacyView;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.settings.subsettings.SettingUtilitiesView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.AuthorisedAppsView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import la0.C22229g7;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import p348mi.AbstractC23309i;
import p649xl.C29750cc;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class SettingPrivateV2View extends BaseSettingView {
    public static final C13168a Companion = new C13168a(null);

    /* renamed from: T0 */
    public C29750cc f67881T0;

    /* renamed from: U0 */
    private boolean f67882U0;

    /* renamed from: com.zing.zalo.ui.settings.SettingPrivateV2View$a */
    /* loaded from: classes6.dex */
    public static final class C13168a {
        private C13168a() {
        }

        public /* synthetic */ C13168a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: JM */
    private final void m74062JM(Bundle bundle) {
        if (bundle != null) {
            this.f67882U0 = bundle.getBoolean("EXTRA_CURRENT_SEEN_SETTING");
        } else {
            this.f67882U0 = AbstractC23309i.m121490Ud();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m74063KM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m74064LM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m74065MM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m74066NM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m74067OM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m74068PM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m74069QM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m74070RM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public static final void m74071SM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m74072TM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m74073UM(SettingPrivateV2View settingPrivateV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingPrivateV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingPrivateV2View.m74074VM(listItemSetting, false);
    }

    /* renamed from: VM */
    private final void m74074VM(ListItemSetting listItemSetting, boolean z11) {
        C17487o0 m92662fJ;
        if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137438v)) {
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(SettingBirthday.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137442z)) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SETTING_ID", 27);
            C17487o0 m92662fJ3 = m92662fJ();
            if (m92662fJ3 != null) {
                m92662fJ3.m93069k2(BottomSheetSettingView.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137440x)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("EXTRA_SETTING_ID", 11);
            C17487o0 m92662fJ4 = m92662fJ();
            if (m92662fJ4 != null) {
                m92662fJ4.m93069k2(BottomSheetSettingView.class, bundle2, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137435s)) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("EXTRA_SETTING_ID", 1);
            C17487o0 m92662fJ5 = m92662fJ();
            if (m92662fJ5 != null) {
                m92662fJ5.m93069k2(BottomSheetSettingView.class, bundle3, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137433q)) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("EXTRA_SETTING_ID", 25);
            C17487o0 m92662fJ6 = m92662fJ();
            if (m92662fJ6 != null) {
                m92662fJ6.m93069k2(BottomSheetSettingView.class, bundle4, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137434r)) {
            C17487o0 m92662fJ7 = m92662fJ();
            if (m92662fJ7 != null) {
                m92662fJ7.m93069k2(SettingFeedPrivacyView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137437u)) {
            m73556pM().mo74371Ie(23, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137441y)) {
            C17487o0 m92662fJ8 = m92662fJ();
            if (m92662fJ8 != null) {
                m92662fJ8.m93069k2(SettingManageSourceFriendView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137431A)) {
            C17487o0 m92662fJ9 = m92662fJ();
            if (m92662fJ9 != null) {
                m92662fJ9.m93069k2(SettingUtilitiesView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137436t)) {
            C17487o0 m92662fJ10 = m92662fJ();
            if (m92662fJ10 != null) {
                m92662fJ10.m93069k2(AuthorisedAppsView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74078IM().f137439w) && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93069k2(SettingBlockAndHideView.class, null, 1, true);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: IM */
    public final C29750cc m74078IM() {
        C29750cc c29750cc = this.f67881T0;
        if (c29750cc != null) {
            return c29750cc;
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
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_setting_private);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        try {
            bundle.putBoolean("EXTRA_CURRENT_SEEN_SETTING", this.f67882U0);
            super.mo37118SJ(bundle);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: WM */
    public final void m74079WM(C29750cc c29750cc) {
        AbstractC19074t.m100208f(c29750cc, "<set-?>");
        this.f67881T0 = c29750cc;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (this.f67882U0 != AbstractC23309i.m121490Ud()) {
            Intent intent = new Intent();
            intent.putExtra("RESULT_SEEN_SETTING_CHANGE", true);
            mo50035CK(-1, intent);
        }
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PrivacySettingView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 37;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m74078IM().f137438v;
        AbstractC19074t.m100207e(listItemSetting, "itemBirthday");
        ListItemSetting listItemSetting2 = m74078IM().f137442z;
        AbstractC19074t.m100207e(listItemSetting2, "itemStatus");
        ListItemSetting listItemSetting3 = m74078IM().f137440x;
        AbstractC19074t.m100207e(listItemSetting3, "itemSeenMsg");
        ListItemSetting listItemSetting4 = m74078IM().f137435s;
        AbstractC19074t.m100207e(listItemSetting4, "itemAllowMsg");
        ListItemSetting listItemSetting5 = m74078IM().f137433q;
        AbstractC19074t.m100207e(listItemSetting5, "itemAllowCall");
        ListItemSetting listItemSetting6 = m74078IM().f137434r;
        AbstractC19074t.m100207e(listItemSetting6, "itemAllowComment");
        ListItemSetting listItemSetting7 = m74078IM().f137437u;
        AbstractC19074t.m100207e(listItemSetting7, "itemAutoFriend");
        ListItemSetting listItemSetting8 = m74078IM().f137441y;
        AbstractC19074t.m100207e(listItemSetting8, "itemSourceFriend");
        ListItemSetting listItemSetting9 = m74078IM().f137431A;
        AbstractC19074t.m100207e(listItemSetting9, "itemUtilities");
        ListItemSetting listItemSetting10 = m74078IM().f137436t;
        AbstractC19074t.m100207e(listItemSetting10, "itemApp");
        ListItemSetting listItemSetting11 = m74078IM().f137439w;
        AbstractC19074t.m100207e(listItemSetting11, "itemBlockAndHide");
        return new C22229g7[]{new C22229g7(listItemSetting, 9), new C22229g7(listItemSetting2, 108), new C22229g7(listItemSetting3, 5), new C22229g7(listItemSetting4, 23), new C22229g7(listItemSetting5, 25), new C22229g7(listItemSetting6, 133), new C22229g7(listItemSetting7, 24), new C22229g7(listItemSetting8, 49), new C22229g7(listItemSetting9, 134), new C22229g7(listItemSetting10, 90), new C22229g7(listItemSetting11, 135)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        final ListItemSetting listItemSetting = m74078IM().f137438v;
        listItemSetting.setIdTracking("view_birthday");
        AbstractC19074t.m100205c(listItemSetting);
        ListItemSetting.m74603F(listItemSetting, AbstractC23322a.zds_ic_calendar_line_24, null, 0, 6, null);
        ImageView iconChevronRight = listItemSetting.getIconChevronRight();
        MainApplication.C6895a c6895a = MainApplication.Companion;
        iconChevronRight.setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC2810d.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        listItemSetting.getIconChevronRight().setVisibility(0);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.t4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74063KM(SettingPrivateV2View.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m74078IM().f137442z;
        listItemSetting2.setIdTracking("recently_online_status");
        AbstractC19074t.m100205c(listItemSetting2);
        ListItemSetting.m74603F(listItemSetting2, AbstractC23322a.zds_ic_user_status_line_24, null, 0, 6, null);
        listItemSetting2.m90592m(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.w4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74070RM(SettingPrivateV2View.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m74078IM().f137440x;
        listItemSetting3.setIdTracking("display_seen_status");
        AbstractC19074t.m100205c(listItemSetting3);
        ListItemSetting.m74603F(listItemSetting3, AbstractC23322a.zds_ic_bubble_multiselect_line_24, null, 0, 6, null);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: la0.x4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74071SM(SettingPrivateV2View.this, listItemSetting3, view);
            }
        });
        final ListItemSetting listItemSetting4 = m74078IM().f137435s;
        listItemSetting4.setIdTracking("receive_message");
        AbstractC19074t.m100205c(listItemSetting4);
        ListItemSetting.m74603F(listItemSetting4, AbstractC23322a.zds_ic_chat_line_24, null, 0, 6, null);
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: la0.y4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74072TM(SettingPrivateV2View.this, listItemSetting4, view);
            }
        });
        final ListItemSetting listItemSetting5 = m74078IM().f137433q;
        listItemSetting5.setIdTracking("accept_stranger_call");
        AbstractC19074t.m100205c(listItemSetting5);
        ListItemSetting.m74603F(listItemSetting5, AbstractC23322a.zds_ic_call_line_24, null, 0, 6, null);
        listItemSetting5.m90592m(false);
        listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: la0.z4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74073UM(SettingPrivateV2View.this, listItemSetting5, view);
            }
        });
        final ListItemSetting listItemSetting6 = m74078IM().f137434r;
        listItemSetting6.setIdTracking("SETTING_PRIVACY_FEED");
        AbstractC19074t.m100205c(listItemSetting6);
        ListItemSetting.m74603F(listItemSetting6, AbstractC23322a.zds_ic_post_line_24, null, 0, 6, null);
        listItemSetting6.getIconChevronRight().setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        listItemSetting6.getIconChevronRight().setVisibility(0);
        listItemSetting6.m90592m(false);
        listItemSetting6.setOnClickListener(new View.OnClickListener() { // from class: la0.a5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74064LM(SettingPrivateV2View.this, listItemSetting6, view);
            }
        });
        final ListItemSetting listItemSetting7 = m74078IM().f137439w;
        listItemSetting7.setIdTracking("SETTING_PRIVACY_BLOCK");
        AbstractC19074t.m100205c(listItemSetting7);
        ListItemSetting.m74603F(listItemSetting7, AbstractC23322a.zds_ic_ban_line_24, null, 0, 6, null);
        listItemSetting7.getIconChevronRight().setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        listItemSetting7.getIconChevronRight().setVisibility(0);
        listItemSetting7.m90592m(false);
        listItemSetting7.setOnClickListener(new View.OnClickListener() { // from class: la0.b5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74065MM(SettingPrivateV2View.this, listItemSetting7, view);
            }
        });
        final ListItemSetting listItemSetting8 = m74078IM().f137437u;
        listItemSetting8.setIdTracking("allow_auto_friend_click");
        AbstractC19074t.m100205c(listItemSetting8);
        ListItemSetting.m74603F(listItemSetting8, AbstractC23322a.zds_ic_contact_list_line_24, null, 0, 6, null);
        listItemSetting8.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.c5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingPrivateV2View.m74066NM(SettingPrivateV2View.this, listItemSetting8, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting9 = m74078IM().f137441y;
        listItemSetting9.setIdTracking("SETTING_PRIVACY_SOURCE_FRIEND");
        AbstractC19074t.m100205c(listItemSetting9);
        ListItemSetting.m74603F(listItemSetting9, AbstractC23322a.zds_ic_switch_users_line_24, null, 0, 6, null);
        listItemSetting9.getIconChevronRight().setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        listItemSetting9.getIconChevronRight().setVisibility(0);
        listItemSetting9.m90592m(false);
        listItemSetting9.setOnClickListener(new View.OnClickListener() { // from class: la0.d5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74067OM(SettingPrivateV2View.this, listItemSetting9, view);
            }
        });
        final ListItemSetting listItemSetting10 = m74078IM().f137431A;
        listItemSetting10.setIdTracking("SETTING_PRIVACY_UTILITY");
        AbstractC19074t.m100205c(listItemSetting10);
        ListItemSetting.m74603F(listItemSetting10, AbstractC23322a.zds_ic_utility_line_24, null, 0, 6, null);
        listItemSetting10.getIconChevronRight().setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        listItemSetting10.getIconChevronRight().setVisibility(0);
        listItemSetting10.setOnClickListener(new View.OnClickListener() { // from class: la0.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74068PM(SettingPrivateV2View.this, listItemSetting10, view);
            }
        });
        final ListItemSetting listItemSetting11 = m74078IM().f137436t;
        listItemSetting11.setIdTracking("SETTING_PRIVACY_APP");
        AbstractC19074t.m100205c(listItemSetting11);
        ListItemSetting.m74603F(listItemSetting11, AbstractC23322a.zds_ic_more_grid_line_24, null, 0, 6, null);
        listItemSetting11.getIconChevronRight().setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        listItemSetting11.getIconChevronRight().setVisibility(0);
        listItemSetting11.m90592m(false);
        listItemSetting11.setOnClickListener(new View.OnClickListener() { // from class: la0.v4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPrivateV2View.m74069QM(SettingPrivateV2View.this, listItemSetting11, view);
            }
        });
        m73556pM().mo74380Vx();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29750cc m147820b = C29750cc.m147820b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m147820b, "inflate(...)");
        m74079WM(m147820b);
        m74062JM(bundle);
        View root = m74078IM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        int i11;
        int i12;
        int i13;
        ListItemSetting listItemSetting = m74078IM().f137442z;
        if (AbstractC23309i.m121308Pg()) {
            i11 = AbstractC8020f0.setting_value_on;
        } else {
            i11 = AbstractC8020f0.setting_value_off;
        }
        listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(i11));
        ListItemSetting listItemSetting2 = m74078IM().f137440x;
        if (AbstractC23309i.m121490Ud()) {
            i12 = AbstractC8020f0.setting_value_on;
        } else {
            i12 = AbstractC8020f0.setting_value_off;
        }
        listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(i12));
        ListItemSetting listItemSetting3 = m74078IM().f137435s;
        if (AbstractC23309i.m122609ya() == 1) {
            i13 = AbstractC8020f0.setting_value_all;
        } else {
            i13 = AbstractC8020f0.setting_value_friend;
        }
        listItemSetting3.setStateSetting(AbstractC23136l9.m118743r0(i13));
        m74078IM().f137433q.setStateSetting(C3080a0.f13112a.m15416g());
        m74078IM().f137437u.setSwitch(AbstractC23309i.m122313qa());
    }
}
