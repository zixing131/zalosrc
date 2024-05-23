package com.zing.zalo.p077ui.settings;

import ac.C0708i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.SettingFontView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import fn0.AbstractC19074t;
import la0.C22229g7;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p649xl.C30053tb;

/* loaded from: classes6.dex */
public final class SettingFontView extends BaseSettingView {

    /* renamed from: T0 */
    public C30053tb f67707T0;

    /* renamed from: U0 */
    private int f67708U0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m73874AM(SettingFontView settingFontView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingFontView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingFontView.m73876CM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m73875BM(SettingFontView settingFontView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingFontView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingFontView.m73876CM(listItemSetting);
    }

    /* renamed from: CM */
    private final void m73876CM(ListItemSetting listItemSetting) {
        if (AbstractC19074t.m100204b(listItemSetting, m73880zM().f139472r)) {
            if (this.f67708U0 != 0) {
                m73556pM().mo74387o3(12, 0);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73880zM().f139471q) && this.f67708U0 != 1) {
            m73556pM().mo74387o3(12, 1);
        }
    }

    /* renamed from: DM */
    public final void m73879DM(C30053tb c30053tb) {
        AbstractC19074t.m100208f(c30053tb, "<set-?>");
        this.f67707T0 = c30053tb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_font_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingFontView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 97;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        return new C22229g7[0];
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        String[] stringArray = m92651WI().getStringArray(AbstractC16775v.array_font_setting);
        AbstractC19074t.m100207e(stringArray, "getStringArray(...)");
        final ListItemSetting listItemSetting = m73880zM().f139472r;
        C0708i c0708i = new C0708i();
        c0708i.m1072c("status", 0);
        listItemSetting.setTrackingExtraData(c0708i);
        String str = stringArray[0];
        AbstractC19074t.m100207e(str, "get(...)");
        listItemSetting.setTitle(str);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingFontView.m73874AM(SettingFontView.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m73880zM().f139471q;
        C0708i c0708i2 = new C0708i();
        c0708i2.m1072c("status", 1);
        listItemSetting2.setTrackingExtraData(c0708i2);
        String str2 = stringArray[1];
        AbstractC19074t.m100207e(str2, "get(...)");
        listItemSetting2.setTitle(str2);
        listItemSetting2.m90592m(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingFontView.m73875BM(SettingFontView.this, listItemSetting2, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30053tb m148540b = C30053tb.m148540b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148540b, "inflate(...)");
        m73879DM(m148540b);
        View root = m73880zM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        boolean z11;
        int m122089kb = AbstractC23309i.m122089kb();
        this.f67708U0 = m122089kb;
        boolean z12 = false;
        if (m122089kb != 1) {
            this.f67708U0 = 0;
        }
        ListItemSetting listItemSetting = m73880zM().f139472r;
        if (this.f67708U0 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItemSetting.setTick(z11);
        ListItemSetting listItemSetting2 = m73880zM().f139471q;
        if (this.f67708U0 == 1) {
            z12 = true;
        }
        listItemSetting2.setTick(z12);
    }

    /* renamed from: zM */
    public final C30053tb m73880zM() {
        C30053tb c30053tb = this.f67707T0;
        if (c30053tb != null) {
            return c30053tb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }
}
