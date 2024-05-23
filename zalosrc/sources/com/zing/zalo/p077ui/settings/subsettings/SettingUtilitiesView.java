package com.zing.zalo.p077ui.settings.subsettings;

import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import b40.C2526d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.BaseSettingView;
import com.zing.zalo.p077ui.settings.subsettings.SettingUtilitiesView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import la0.C22229g7;
import me0.AbstractC23136l9;
import p649xl.C29894kc;
import s00.AbstractC26084s;
import th.C26680a;

/* loaded from: classes6.dex */
public final class SettingUtilitiesView extends BaseSettingView {
    public static final C13268a Companion = new C13268a(null);

    /* renamed from: T0 */
    public C29894kc f68253T0;

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingUtilitiesView$a */
    /* loaded from: classes6.dex */
    public static final class C13268a {
        private C13268a() {
        }

        public /* synthetic */ C13268a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m74579CM(SettingUtilitiesView settingUtilitiesView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingUtilitiesView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingUtilitiesView.m74583GM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m74580DM(SettingUtilitiesView settingUtilitiesView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingUtilitiesView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingUtilitiesView.m74583GM(listItemSetting, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m74581EM(SettingUtilitiesView settingUtilitiesView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingUtilitiesView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingUtilitiesView.m74583GM(listItemSetting, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m74582FM(SettingUtilitiesView settingUtilitiesView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingUtilitiesView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingUtilitiesView.m74583GM(listItemSetting, z11);
    }

    /* renamed from: GM */
    private final void m74583GM(ListItemSetting listItemSetting, boolean z11) {
        if (AbstractC19074t.m100204b(listItemSetting, m74587BM().f138497r)) {
            AbstractC0924m0.m3604Yg(z11);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74587BM().f138499t)) {
            AbstractC0924m0.m4292vi(1);
            mo73526uM();
            C2526d.f10270a.m12731w0("0", "setting_privacy", 1);
            AbstractC26084s.m134269q(0, 136);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74587BM().f138498s)) {
            AbstractC0924m0.m4292vi(0);
            mo73526uM();
            C2526d.f10270a.m12731w0("0", "setting_privacy", 0);
            AbstractC26084s.m134269q(0, 136);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74587BM().f138496q)) {
            m73556pM().mo74387o3(48, z11 ? 1 : 0);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: BM */
    public final C29894kc m74587BM() {
        C29894kc c29894kc = this.f68253T0;
        if (c29894kc != null) {
            return c29894kc;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: HM */
    public final void m74588HM(C29894kc c29894kc) {
        AbstractC19074t.m100208f(c29894kc, "<set-?>");
        this.f68253T0 = c29894kc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_utility);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UtilityView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 134;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m74587BM().f138497r;
        AbstractC19074t.m100207e(listItemSetting, "itemAutoQRPhoto");
        LinearLayout linearLayout = m74587BM().f138500u;
        AbstractC19074t.m100207e(linearLayout, "layoutSessionJumpLink");
        ListItemSetting listItemSetting2 = m74587BM().f138496q;
        AbstractC19074t.m100207e(listItemSetting2, "itemAutoParseBankCardCSC");
        return new C22229g7[]{new C22229g7(listItemSetting, 120), new C22229g7(linearLayout, 136), new C22229g7(listItemSetting2, 143)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        final ListItemSetting listItemSetting = m74587BM().f138497r;
        listItemSetting.setIdTracking("autodetect_qr");
        listItemSetting.m90592m(false);
        m74587BM().f138497r.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.r0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingUtilitiesView.m74579CM(SettingUtilitiesView.this, listItemSetting, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting2 = m74587BM().f138499t;
        listItemSetting2.setIdTracking("jump_link_with_zalo");
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: oa0.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingUtilitiesView.m74580DM(SettingUtilitiesView.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m74587BM().f138498s;
        listItemSetting3.setIdTracking("jump_link_with_web");
        listItemSetting3.m90592m(false);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: oa0.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingUtilitiesView.m74581EM(SettingUtilitiesView.this, listItemSetting3, view);
            }
        });
        final ListItemSetting listItemSetting4 = m74587BM().f138496q;
        listItemSetting4.setIdTracking("auto_parse_bank_card_csc");
        listItemSetting4.m90592m(false);
        listItemSetting4.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.u0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingUtilitiesView.m74582FM(SettingUtilitiesView.this, listItemSetting4, compoundButton, z11);
            }
        });
        if (C26680a.m137023g() != 1) {
            listItemSetting4.setVisibility(8);
            m74587BM().f138497r.m90592m(false);
        } else {
            m74587BM().f138497r.m90592m(true);
            listItemSetting4.setVisibility(0);
        }
        m73556pM().mo74380Vx();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29894kc m148173b = C29894kc.m148173b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148173b, "inflate(...)");
        m74588HM(m148173b);
        View root = m74587BM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        boolean z11;
        boolean z12;
        m74587BM().f138497r.setSwitch(AbstractC0924m0.m3776ea());
        int m2893A1 = AbstractC0924m0.m2893A1();
        ListItemSetting listItemSetting = m74587BM().f138499t;
        boolean z13 = false;
        if (m2893A1 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItemSetting.setTick(z11);
        ListItemSetting listItemSetting2 = m74587BM().f138498s;
        if (m2893A1 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        listItemSetting2.setTick(z12);
        int m4337x5 = AbstractC0924m0.m4337x5();
        ListItemSetting listItemSetting3 = m74587BM().f138496q;
        if (m4337x5 == 2 || m4337x5 == 1) {
            z13 = true;
        }
        listItemSetting3.setSwitch(z13);
    }
}
