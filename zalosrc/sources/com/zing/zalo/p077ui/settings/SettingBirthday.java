package com.zing.zalo.p077ui.settings;

import ac.C0708i;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.SettingBirthday;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import la0.C22229g7;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p649xl.C29893kb;
import pm0.C24860q;
import sd.C26231b;

/* loaded from: classes6.dex */
public final class SettingBirthday extends BaseSettingView {

    /* renamed from: T0 */
    public C29893kb f67671T0;

    /* renamed from: U0 */
    private final int f67672U0 = 1;

    /* renamed from: V0 */
    private final int f67673V0 = 2;

    /* renamed from: W0 */
    private final int f67674W0 = 3;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m73771CM(SettingBirthday settingBirthday, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingBirthday, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingBirthday.m73775GM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m73772DM(SettingBirthday settingBirthday, View view) {
        AbstractC19074t.m100208f(settingBirthday, "this$0");
        settingBirthday.m73776IM(settingBirthday.f67672U0);
        if (C26231b.m134867m() && AbstractC0924m0.m4395z5() != 2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C24860q(7, Integer.valueOf(settingBirthday.f67672U0 - 1)));
            arrayList.add(new C24860q(31, Integer.valueOf(settingBirthday.f67672U0 - 1)));
            settingBirthday.m73556pM().mo74386lI(arrayList);
            return;
        }
        settingBirthday.m73556pM().mo74371Ie(7, settingBirthday.f67672U0 - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m73773EM(SettingBirthday settingBirthday, View view) {
        AbstractC19074t.m100208f(settingBirthday, "this$0");
        settingBirthday.m73776IM(settingBirthday.f67673V0);
        settingBirthday.m73556pM().mo74371Ie(7, settingBirthday.f67673V0 - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m73774FM(SettingBirthday settingBirthday, View view) {
        AbstractC19074t.m100208f(settingBirthday, "this$0");
        settingBirthday.m73776IM(settingBirthday.f67674W0);
        settingBirthday.m73556pM().mo74371Ie(7, settingBirthday.f67674W0 - 1);
    }

    /* renamed from: GM */
    private final void m73775GM(ListItemSetting listItemSetting, boolean z11) {
        if (AbstractC19074t.m100204b(listItemSetting, m73780BM().f138490r)) {
            m73556pM().mo74371Ie(31, z11 ? 1 : 0);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: IM */
    private final void m73776IM(int i11) {
        boolean z11;
        boolean z12;
        ListItemSetting listItemSetting = m73780BM().f138489q;
        boolean z13 = false;
        if (i11 == this.f67672U0) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItemSetting.setTick(z11);
        ListItemSetting listItemSetting2 = m73780BM().f138491s;
        if (i11 == this.f67673V0) {
            z12 = true;
        } else {
            z12 = false;
        }
        listItemSetting2.setTick(z12);
        ListItemSetting listItemSetting3 = m73780BM().f138492t;
        if (i11 == this.f67674W0) {
            z13 = true;
        }
        listItemSetting3.setTick(z13);
    }

    /* renamed from: BM */
    public final C29893kb m73780BM() {
        C29893kb c29893kb = this.f67671T0;
        if (c29893kb != null) {
            return c29893kb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: HM */
    public final void m73781HM(C29893kb c29893kb) {
        AbstractC19074t.m100208f(c29893kb, "<set-?>");
        this.f67671T0 = c29893kb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_birthday_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m87077NK.setMiddleTitle(m118743r0);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingBirthdayView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 9;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73780BM().f138490r;
        AbstractC19074t.m100207e(listItemSetting, "itemNotifyFriendAboutMyBirthday");
        LinearLayout linearLayout = m73780BM().f138493u;
        AbstractC19074t.m100207e(linearLayout, "layoutSettingBirthday");
        return new C22229g7[]{new C22229g7(listItemSetting, 147), new C22229g7(linearLayout, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_dob_mode);
        AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
        ListItemSetting listItemSetting = m73780BM().f138489q;
        listItemSetting.setIdTracking("view_birthday_click");
        C0708i c0708i = new C0708i();
        c0708i.m1072c("status", 0);
        listItemSetting.setTrackingExtraData(c0708i);
        String str = m118755v0[0];
        AbstractC19074t.m100207e(str, "get(...)");
        listItemSetting.setTitle(str);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBirthday.m73772DM(SettingBirthday.this, view);
            }
        });
        ListItemSetting listItemSetting2 = m73780BM().f138491s;
        listItemSetting2.setIdTracking("view_birthday_click");
        C0708i c0708i2 = new C0708i();
        c0708i2.m1072c("status", 1);
        listItemSetting2.setTrackingExtraData(c0708i2);
        String str2 = m118755v0[1];
        AbstractC19074t.m100207e(str2, "get(...)");
        listItemSetting2.setTitle(str2);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBirthday.m73773EM(SettingBirthday.this, view);
            }
        });
        ListItemSetting listItemSetting3 = m73780BM().f138492t;
        listItemSetting3.setIdTracking("view_birthday_click");
        C0708i c0708i3 = new C0708i();
        c0708i3.m1072c("status", 2);
        listItemSetting3.setTrackingExtraData(c0708i3);
        String str3 = m118755v0[2];
        AbstractC19074t.m100207e(str3, "get(...)");
        listItemSetting3.setTitle(str3);
        listItemSetting3.m90592m(false);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: la0.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBirthday.m73774FM(SettingBirthday.this, view);
            }
        });
        final ListItemSetting listItemSetting4 = m73780BM().f138490r;
        listItemSetting4.setIdTracking("privacy_notify_friend_about_my_birthday");
        listItemSetting4.setSwitch(true);
        listItemSetting4.m90592m(false);
        listItemSetting4.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.l1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingBirthday.m73771CM(SettingBirthday.this, listItemSetting4, compoundButton, z11);
            }
        });
        if (C26231b.m134867m()) {
            listItemSetting4.setVisibility(0);
            m73780BM().f138494v.setVisibility(0);
        } else {
            listItemSetting4.setVisibility(8);
            m73780BM().f138494v.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29893kb m148171b = C29893kb.m148171b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148171b, "inflate(...)");
        m73781HM(m148171b);
        View root = m73780BM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        boolean z11;
        int m122646za = AbstractC23309i.m122646za();
        m73776IM(m122646za + 1);
        if (C26231b.m134867m()) {
            ListItemSetting listItemSetting = m73780BM().f138490r;
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
    }
}
