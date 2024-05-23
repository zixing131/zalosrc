package com.zing.zalo.p077ui.settings;

import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.settings.SettingManageBirthday;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import la0.C22229g7;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p649xl.C30087vb;
import sd.C26231b;

/* loaded from: classes6.dex */
public final class SettingManageBirthday extends BaseSettingView {

    /* renamed from: T0 */
    public C30087vb f67711T0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m73888BM(SettingManageBirthday settingManageBirthday, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingManageBirthday, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageBirthday.m73891EM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m73889CM(SettingManageBirthday settingManageBirthday, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageBirthday, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageBirthday.m73891EM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m73890DM(SettingManageBirthday settingManageBirthday, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageBirthday, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageBirthday.m73891EM(listItemSetting, z11);
    }

    /* renamed from: EM */
    private final void m73891EM(ListItemSetting listItemSetting, boolean z11) {
        if (AbstractC19074t.m100204b(listItemSetting, m73895AM().f139700q)) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SETTING_ID", 7);
            bundle.putBoolean("EXTRA_IS_SHOW_HINT_TEXT", false);
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(BottomSheetSettingView.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73895AM().f139702s)) {
            m73556pM().mo74371Ie(14, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73895AM().f139701r)) {
            m73556pM().mo74371Ie(31, z11 ? 1 : 0);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: AM */
    public final C30087vb m73895AM() {
        C30087vb c30087vb = this.f67711T0;
        if (c30087vb != null) {
            return c30087vb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: FM */
    public final void m73896FM(C30087vb c30087vb) {
        AbstractC19074t.m100208f(c30087vb, "<set-?>");
        this.f67711T0 = c30087vb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_manage_birthday_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingManageBirthdayView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 36;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73895AM().f139700q;
        AbstractC19074t.m100207e(listItemSetting, "itemBirthday");
        ListItemSetting listItemSetting2 = m73895AM().f139701r;
        AbstractC19074t.m100207e(listItemSetting2, "itemNotifyFriendMyBirthday");
        ListItemSetting listItemSetting3 = m73895AM().f139702s;
        AbstractC19074t.m100207e(listItemSetting3, "itemNotifyMeAboutFriendBirthday");
        return new C22229g7[]{new C22229g7(listItemSetting, 9), new C22229g7(listItemSetting2, 146), new C22229g7(listItemSetting3, 12)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        final ListItemSetting listItemSetting = m73895AM().f139700q;
        listItemSetting.setIdTracking("BIRTHDAY_HUB_SETTING_VIEW_BIRTHDAY");
        listItemSetting.m90592m(true);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingManageBirthday.m73888BM(SettingManageBirthday.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m73895AM().f139701r;
        listItemSetting2.setIdTracking("BIRTHDAY_HUB_SETTING_NOTIFY_FRIEND_MY_BIRTHDAY");
        listItemSetting2.setSwitch(true);
        listItemSetting2.m90592m(false);
        listItemSetting2.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.v2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageBirthday.m73889CM(SettingManageBirthday.this, listItemSetting2, compoundButton, z11);
            }
        });
        if (C26231b.m134867m()) {
            listItemSetting2.setVisibility(0);
            m73895AM().f139700q.m90592m(true);
        } else {
            listItemSetting2.setVisibility(8);
            m73895AM().f139700q.m90592m(false);
        }
        final ListItemSetting listItemSetting3 = m73895AM().f139702s;
        listItemSetting3.setIdTracking("BIRTHDAY_HUB_SETTING_NOTIFY_ME_FRIEND_BIRTHDAY");
        listItemSetting3.setSwitch(true);
        listItemSetting3.m90592m(false);
        listItemSetting3.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.w2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageBirthday.m73890DM(SettingManageBirthday.this, listItemSetting3, compoundButton, z11);
            }
        });
        m73556pM().mo74380Vx();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30087vb m148625b = C30087vb.m148625b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148625b, "inflate(...)");
        m73896FM(m148625b);
        View root = m73895AM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        boolean z11;
        String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_dob_mode);
        AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
        int m122646za = AbstractC23309i.m122646za();
        m73895AM().f139700q.setStateSetting(m118755v0[m122646za]);
        if (C26231b.m134867m()) {
            ListItemSetting listItemSetting = m73895AM().f139701r;
            boolean z12 = false;
            if (m122646za != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            listItemSetting.m90590k(z11, true, false);
            int m4395z5 = AbstractC0924m0.m4395z5();
            if (m4395z5 == 2) {
                if (m122646za != 0) {
                    z12 = true;
                }
                listItemSetting.setSwitch(z12);
            } else {
                if (m4395z5 == 1) {
                    z12 = true;
                }
                listItemSetting.setSwitch(z12);
            }
        }
        m73895AM().f139702s.setSwitch(AbstractC23309i.m121777c3());
    }
}
