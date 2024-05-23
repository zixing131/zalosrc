package com.zing.zalo.p077ui.settings.subsettings;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.settings.BaseSettingView;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import la0.C22229g7;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import p055ce.C3432a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p649xl.C30121xb;

/* loaded from: classes6.dex */
public final class SettingManageSourceFriendView extends BaseSettingView {
    public static final C13263a Companion = new C13263a(null);

    /* renamed from: T0 */
    public C30121xb f68242T0;

    /* renamed from: U0 */
    private int f68243U0 = -1;

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingManageSourceFriendView$a */
    /* loaded from: classes6.dex */
    public static final class C13263a {
        private C13263a() {
        }

        public /* synthetic */ C13263a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m74540EM(SettingManageSourceFriendView settingManageSourceFriendView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageSourceFriendView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageSourceFriendView.m74546KM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m74541FM(SettingManageSourceFriendView settingManageSourceFriendView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageSourceFriendView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageSourceFriendView.m74546KM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m74542GM(SettingManageSourceFriendView settingManageSourceFriendView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageSourceFriendView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageSourceFriendView.m74546KM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m74543HM(SettingManageSourceFriendView settingManageSourceFriendView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageSourceFriendView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageSourceFriendView.m74546KM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m74544IM(SettingManageSourceFriendView settingManageSourceFriendView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageSourceFriendView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageSourceFriendView.m74546KM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m74545JM(SettingManageSourceFriendView settingManageSourceFriendView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingManageSourceFriendView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingManageSourceFriendView.m74546KM(listItemSetting, z11);
    }

    /* renamed from: KM */
    private final void m74546KM(ListItemSetting listItemSetting, boolean z11) {
        if (AbstractC19074t.m100204b(listItemSetting, m74550DM().f139942q)) {
            m73556pM().mo74371Ie(17, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74550DM().f139947v)) {
            m73556pM().mo74371Ie(18, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74550DM().f139945t)) {
            m73556pM().mo74371Ie(19, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74550DM().f139944s)) {
            m73556pM().mo74371Ie(22, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74550DM().f139943r)) {
            m73556pM().mo74371Ie(20, z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74550DM().f139946u)) {
            m73556pM().mo74371Ie(24, z11 ? 1 : 0);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f68243U0 = m92642L3.getInt("EXTRA_INT_SOURCE_VIEW", -1);
        }
    }

    /* renamed from: DM */
    public final C30121xb m74550DM() {
        C30121xb c30121xb = this.f68242T0;
        if (c30121xb != null) {
            return c30121xb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: LM */
    public final void m74551LM(C30121xb c30121xb) {
        AbstractC19074t.m100208f(c30121xb, "<set-?>");
        this.f68242T0 = c30121xb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_manage_friend_request_src);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FriendRequestSourceView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 49;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m74550DM().f139942q;
        AbstractC19074t.m100207e(listItemSetting, "itemAllowFriendSearchPhone");
        ListItemSetting listItemSetting2 = m74550DM().f139947v;
        AbstractC19074t.m100207e(listItemSetting2, "itemUsername");
        ListItemSetting listItemSetting3 = m74550DM().f139945t;
        AbstractC19074t.m100207e(listItemSetting3, "itemQRCode");
        ListItemSetting listItemSetting4 = m74550DM().f139944s;
        AbstractC19074t.m100207e(listItemSetting4, "itemGroup");
        ListItemSetting listItemSetting5 = m74550DM().f139943r;
        AbstractC19074t.m100207e(listItemSetting5, "itemContact");
        ListItemSetting listItemSetting6 = m74550DM().f139946u;
        AbstractC19074t.m100207e(listItemSetting6, "itemSuggest");
        LinearLayout linearLayout = m74550DM().f139948w;
        AbstractC19074t.m100207e(linearLayout, "layoutAllowStrangerAddFriend");
        return new C22229g7[]{new C22229g7(listItemSetting, 0), new C22229g7(listItemSetting2, 1), new C22229g7(listItemSetting3, 2), new C22229g7(listItemSetting4, 3), new C22229g7(listItemSetting5, 4), new C22229g7(listItemSetting6, 27), new C22229g7(linearLayout, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:            if (r3 != false) goto L6;     */
    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo73524qM() {
        boolean m127126v;
        final ListItemSetting listItemSetting = m74550DM().f139942q;
        listItemSetting.setIdTracking("receive_friend_phone");
        listItemSetting.m90592m(false);
        String m118282h = AbstractC23056e6.m118282h(AbstractC23304d.f113368c0.f42455y, AbstractC23309i.m121704a5(), false);
        if (!TextUtils.isEmpty(m118282h)) {
            m127126v = AbstractC24341v.m127126v(m118282h, AbstractC23056e6.f112062a, true);
        }
        m118282h = AbstractC23304d.f113368c0.f42455y;
        AbstractC19074t.m100205c(m118282h);
        listItemSetting.setSubtitle(m118282h);
        listItemSetting.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.e0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageSourceFriendView.m74542GM(SettingManageSourceFriendView.this, listItemSetting, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting2 = m74550DM().f139947v;
        listItemSetting2.setIdTracking("receive_friend_uname");
        listItemSetting2.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.f0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageSourceFriendView.m74543HM(SettingManageSourceFriendView.this, listItemSetting2, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting3 = m74550DM().f139945t;
        listItemSetting3.setIdTracking("receive_friend_qr");
        listItemSetting3.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.g0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageSourceFriendView.m74544IM(SettingManageSourceFriendView.this, listItemSetting3, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting4 = m74550DM().f139944s;
        listItemSetting4.setIdTracking("receive_friend_group");
        listItemSetting4.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.h0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageSourceFriendView.m74545JM(SettingManageSourceFriendView.this, listItemSetting4, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting5 = m74550DM().f139943r;
        listItemSetting5.setIdTracking("receive_friend_ecard");
        listItemSetting5.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.i0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageSourceFriendView.m74540EM(SettingManageSourceFriendView.this, listItemSetting5, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting6 = m74550DM().f139946u;
        listItemSetting6.setIdTracking("display_recommend_friend");
        listItemSetting6.m90592m(false);
        listItemSetting6.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.j0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingManageSourceFriendView.m74541FM(SettingManageSourceFriendView.this, listItemSetting6, compoundButton, z11);
            }
        });
        mo73526uM();
        m73556pM().mo74380Vx();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30121xb m148702b = C30121xb.m148702b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148702b, "inflate(...)");
        m74551LM(m148702b);
        View root = m74550DM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        int i11;
        String str;
        ContactProfile contactProfile;
        ListItemSetting listItemSetting = m74550DM().f139947v;
        if (C3432a.f14402a.m17234c() && (contactProfile = AbstractC23304d.f113368c0) != null && contactProfile.m40357A0()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItemSetting.setVisibility(i11);
        ContactProfile contactProfile2 = AbstractC23304d.f113368c0;
        if (contactProfile2 != null) {
            str = contactProfile2.f42460z1;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            m74550DM().f139947v.setSubtitle("@" + AbstractC23304d.f113368c0.f42460z1);
        }
        m74550DM().f139942q.setSwitch(AbstractC23309i.m122461ua());
        m74550DM().f139947v.setCheckBox(AbstractC23309i.m122535wa());
        m74550DM().f139945t.setCheckBox(AbstractC23309i.m122498va());
        m74550DM().f139944s.setCheckBox(AbstractC23309i.m122424ta());
        m74550DM().f139943r.setCheckBox(AbstractC23309i.m122387sa());
        m74550DM().f139946u.setCheckBox(AbstractC23309i.m122572xa());
    }
}
