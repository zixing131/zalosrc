package com.zing.zalo.p077ui.settings;

import ac.C0708i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.SettingLanguageView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import fn0.AbstractC19074t;
import la0.C22229g7;
import me0.AbstractC23136l9;
import p133ek.AbstractC18458a;
import p649xl.C30070ub;

/* loaded from: classes6.dex */
public final class SettingLanguageView extends BaseSettingView {

    /* renamed from: T0 */
    public C30070ub f67709T0;

    /* renamed from: U0 */
    private int f67710U0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m73881AM(SettingLanguageView settingLanguageView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingLanguageView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingLanguageView.m73883CM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m73882BM(SettingLanguageView settingLanguageView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingLanguageView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingLanguageView.m73883CM(listItemSetting);
    }

    /* renamed from: CM */
    private final void m73883CM(ListItemSetting listItemSetting) {
        if (AbstractC19074t.m100204b(listItemSetting, m73887zM().f139583r)) {
            if (this.f67710U0 != 0) {
                m73556pM().mo74387o3(11, 0);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73887zM().f139582q) && this.f67710U0 != 1) {
            m73556pM().mo74387o3(11, 1);
        }
    }

    /* renamed from: DM */
    public final void m73886DM(C30070ub c30070ub) {
        AbstractC19074t.m100208f(c30070ub, "<set-?>");
        this.f67709T0 = c30070ub;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting16);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingLanguageView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 79;
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
        String[] stringArray = m92651WI().getStringArray(AbstractC16775v.array_language);
        AbstractC19074t.m100207e(stringArray, "getStringArray(...)");
        final ListItemSetting listItemSetting = m73887zM().f139583r;
        listItemSetting.setIconSetting(new ZAppCompatImageView(listItemSetting.getContext()));
        ZAppCompatImageView iconSetting = listItemSetting.getIconSetting();
        if (iconSetting != null) {
            iconSetting.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_language_vn));
        }
        ZAppCompatImageView iconSetting2 = listItemSetting.getIconSetting();
        if (iconSetting2 != null) {
            iconSetting2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        }
        ZAppCompatImageView iconSetting3 = listItemSetting.getIconSetting();
        AbstractC19074t.m100205c(iconSetting3);
        listItemSetting.m90587c(iconSetting3);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        listItemSetting.setLeadingGravity(enumC16952b0);
        listItemSetting.m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
        C0708i c0708i = new C0708i();
        c0708i.m1072c("status", 0);
        listItemSetting.setTrackingExtraData(c0708i);
        String str = stringArray[0];
        AbstractC19074t.m100207e(str, "get(...)");
        listItemSetting.setTitle(str);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingLanguageView.m73881AM(SettingLanguageView.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m73887zM().f139582q;
        listItemSetting2.setIconSetting(new ZAppCompatImageView(listItemSetting2.getContext()));
        ZAppCompatImageView iconSetting4 = listItemSetting2.getIconSetting();
        if (iconSetting4 != null) {
            iconSetting4.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_language_en));
        }
        ZAppCompatImageView iconSetting5 = listItemSetting2.getIconSetting();
        if (iconSetting5 != null) {
            iconSetting5.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        }
        ZAppCompatImageView iconSetting6 = listItemSetting2.getIconSetting();
        AbstractC19074t.m100205c(iconSetting6);
        listItemSetting2.m90587c(iconSetting6);
        listItemSetting2.setLeadingGravity(enumC16952b0);
        C0708i c0708i2 = new C0708i();
        c0708i2.m1072c("status", 1);
        listItemSetting2.setTrackingExtraData(c0708i2);
        String str2 = stringArray[1];
        AbstractC19074t.m100207e(str2, "get(...)");
        listItemSetting2.setTitle(str2);
        listItemSetting2.m90592m(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingLanguageView.m73882BM(SettingLanguageView.this, listItemSetting2, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30070ub m148584b = C30070ub.m148584b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148584b, "inflate(...)");
        m73886DM(m148584b);
        View root = m73887zM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        boolean z11;
        String[] stringArray = m92651WI().getStringArray(AbstractC16775v.array_language_as_code);
        AbstractC19074t.m100207e(stringArray, "getStringArray(...)");
        int length = stringArray.length;
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (AbstractC18458a.f93019a.equals(stringArray[i11])) {
                this.f67710U0 = i11;
                break;
            }
            i11++;
        }
        ListItemSetting listItemSetting = m73887zM().f139583r;
        if (this.f67710U0 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItemSetting.setTick(z11);
        ListItemSetting listItemSetting2 = m73887zM().f139582q;
        if (this.f67710U0 == 1) {
            z12 = true;
        }
        listItemSetting2.setTick(z12);
    }

    /* renamed from: zM */
    public final C30070ub m73887zM() {
        C30070ub c30070ub = this.f67709T0;
        if (c30070ub != null) {
            return c30070ub;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }
}
