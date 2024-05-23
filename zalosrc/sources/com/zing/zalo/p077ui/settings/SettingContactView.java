package com.zing.zalo.p077ui.settings;

import ag0.AbstractC0852x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.settings.SettingContactView;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import java.util.Arrays;
import la0.C22229g7;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p649xl.C30019rb;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class SettingContactView extends BaseSettingView implements C23744a.c {

    /* renamed from: T0 */
    public C30019rb f67683T0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m73849CM(SettingContactView settingContactView) {
        AbstractC19074t.m100208f(settingContactView, "this$0");
        settingContactView.mo73526uM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m73850EM(SettingContactView settingContactView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingContactView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingContactView.m73854IM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m73851FM(SettingContactView settingContactView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingContactView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingContactView.m73854IM(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m73852GM(SettingContactView settingContactView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingContactView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingContactView.m73854IM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m73853HM(SettingContactView settingContactView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingContactView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingContactView.m73854IM(listItemSetting, false);
    }

    /* renamed from: IM */
    private final void m73854IM(ListItemSetting listItemSetting, boolean z11) {
        C17487o0 m92662fJ;
        if (AbstractC19074t.m100204b(listItemSetting, m73858DM().f139234t)) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SETTING_ID", ZAbstractBase.ZVU_PROCESS_FLUSH);
            bundle.putBoolean("EXTRA_BOL_PRIVACY", false);
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(BottomSheetSettingView.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73858DM().f139232r)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("EXTRA_SETTING_ID", 10);
            bundle2.putBoolean("EXTRA_BOL_PRIVACY", false);
            C17487o0 m92662fJ3 = m92662fJ();
            if (m92662fJ3 != null) {
                m92662fJ3.m93069k2(BottomSheetSettingView.class, bundle2, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73858DM().f139231q)) {
            m73556pM().mo74371Ie(23, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73858DM().f139233s) && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93069k2(SettingManageSourceFriendView.class, null, 1, true);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: DM */
    public final C30019rb m73858DM() {
        C30019rb c30019rb = this.f67683T0;
        if (c30019rb != null) {
            return c30019rb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.Companion.m124119a().m124117e(this, 6060);
    }

    /* renamed from: JM */
    public final void m73859JM(C30019rb c30019rb) {
        AbstractC19074t.m100208f(c30019rb, "<set-?>");
        this.f67683T0 = c30019rb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_index_setting_contact);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingContactView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 44;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73858DM().f139234t;
        AbstractC19074t.m100207e(listItemSetting, "itemUpdateContact");
        ListItemSetting listItemSetting2 = m73858DM().f139232r;
        AbstractC19074t.m100207e(listItemSetting2, "itemShowContact");
        ListItemSetting listItemSetting3 = m73858DM().f139231q;
        AbstractC19074t.m100207e(listItemSetting3, "itemAutoFriend");
        ListItemSetting listItemSetting4 = m73858DM().f139233s;
        AbstractC19074t.m100207e(listItemSetting4, "itemSourceFriend");
        return new C22229g7[]{new C22229g7(listItemSetting, 102), new C22229g7(listItemSetting2, 77), new C22229g7(listItemSetting3, 24), new C22229g7(listItemSetting4, 49)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        final ListItemSetting listItemSetting = m73858DM().f139234t;
        listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingContactView.m73850EM(SettingContactView.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m73858DM().f139232r;
        listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting2.m90592m(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingContactView.m73851FM(SettingContactView.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m73858DM().f139231q;
        listItemSetting3.setIdTracking("allow_auto_friend_click");
        listItemSetting3.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.m2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingContactView.m73852GM(SettingContactView.this, listItemSetting3, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting4 = m73858DM().f139233s;
        listItemSetting4.setIdTracking("SETTING_PRIVACY_SOURCE_FRIEND");
        listItemSetting4.getIconChevronRight().setImageDrawable(C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC2810d.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        listItemSetting4.getIconChevronRight().setVisibility(0);
        listItemSetting4.m90592m(false);
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: la0.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingContactView.m73853HM(SettingContactView.this, listItemSetting4, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30019rb m148456b = C30019rb.m148456b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148456b, "inflate(...)");
        m73859JM(m148456b);
        C23744a.Companion.m124119a().m124115b(this, 6060);
        View root = m73858DM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        int i11;
        int i12;
        String m118746s0;
        ListItemSetting listItemSetting = m73858DM().f139232r;
        if (AbstractC23309i.m122127lb() == 1) {
            i11 = AbstractC8020f0.setting_state_contact_use_zalo;
        } else {
            i11 = AbstractC8020f0.setting_state_all_contact;
        }
        listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(i11));
        ListItemSetting listItemSetting2 = m73858DM().f139234t;
        if (AbstractC23057e7.m118297d()) {
            i12 = AbstractC8020f0.setting_state_auto;
        } else {
            i12 = AbstractC8020f0.setting_state_manual;
        }
        listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(i12));
        if (AbstractC23309i.m122353rd() == 0) {
            if (!AbstractC0852x.m2365v() && !AbstractC0852x.m2364u()) {
                if (AbstractC23309i.m121261O6() == 0) {
                    m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdatePhoneBookStateNone);
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_last_time_submit_contact, AbstractC23160o0.m119185C(AbstractC23309i.m121261O6()));
                }
            } else {
                m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating);
            }
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_last_time_submit_contact, AbstractC23160o0.m119185C(AbstractC23309i.m122353rd()));
        }
        AbstractC19074t.m100205c(m118746s0);
        if (AbstractC23309i.m121083Jd() != 1 && AbstractC23309i.m121083Jd() != 4) {
            m73858DM().f139234t.setSubtitle(m118746s0);
        } else {
            ListItemSetting listItemSetting3 = m73858DM().f139234t;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_phone_book_status_unknown_exception);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            listItemSetting3.setSubtitle(m118743r0);
        }
        m73858DM().f139231q.setSwitch(AbstractC23309i.m122313qa());
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 6060) {
            mo70710wy(new Runnable() { // from class: la0.j2
                @Override // java.lang.Runnable
                public final void run() {
                    SettingContactView.m73849CM(SettingContactView.this);
                }
            });
        }
    }
}
