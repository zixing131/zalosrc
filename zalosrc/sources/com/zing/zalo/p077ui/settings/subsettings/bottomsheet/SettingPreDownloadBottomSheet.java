package com.zing.zalo.p077ui.settings.subsettings.bottomsheet;

import ac.C0708i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.subsettings.bottomsheet.SettingPreDownloadBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p348mi.AbstractC23306f;
import p423pi.C24759a;
import p649xl.C30127y0;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class SettingPreDownloadBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private C30127y0 f68270b1;

    /* renamed from: c1 */
    private final C24759a f68271c1 = AbstractC23306f.m120652d().m109886m0();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JL */
    public static final void m74597JL(SettingPreDownloadBottomSheet settingPreDownloadBottomSheet, View view) {
        AbstractC19074t.m100208f(settingPreDownloadBottomSheet, "this$0");
        settingPreDownloadBottomSheet.close();
    }

    /* renamed from: KL */
    private final void m74598KL(Bundle bundle) {
        String str;
        if (bundle != null && bundle.getBoolean("ARG_IS_FIRST_TIME", false)) {
            str = "first_time";
        } else {
            str = "info";
        }
        C0708i c0708i = new C0708i();
        c0708i.m1075f("position", str);
        setTrackingExtraData(c0708i);
        setIdTracking("settings_ad_onboarding");
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30127y0 m148714c = C30127y0.m148714c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148714c, "inflate(...)");
        this.f68270b1 = m148714c;
        m90533zL(EnumC17017m.HUG_CONTENT);
        C30127y0 c30127y0 = this.f68270b1;
        C30127y0 c30127y02 = null;
        if (c30127y0 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30127y0 = null;
        }
        c30127y0.f139986t.setText(this.f68271c1.m128657s());
        C30127y0 c30127y03 = this.f68270b1;
        if (c30127y03 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30127y03 = null;
        }
        c30127y03.f139983q.setOnClickListener(new View.OnClickListener() { // from class: qa0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPreDownloadBottomSheet.m74597JL(SettingPreDownloadBottomSheet.this, view);
            }
        });
        C30127y0 c30127y04 = this.f68270b1;
        if (c30127y04 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30127y04 = null;
        }
        ListItem listItem = c30127y04.f139984r;
        String m92652XI = m92652XI(AbstractC8020f0.str_pre_download_setting_avoid_losing_messages);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        listItem.setTitle(m92652XI);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_pre_download_setting_avoid_losing_messages_description);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        listItem.setSubtitle(m92652XI2);
        Context context = listItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Button button = new Button(context);
        button.m90539c(AbstractC2814h.ButtonMedium_SecondaryNeutral);
        Context context2 = button.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        button.setSupportiveIcon(C27280g.m139660c(context2, AbstractC23322a.zds_ic_chat_solid_16, AbstractC2807a.icon_01));
        listItem.m90587c(button);
        listItem.setTitleStyleBold(true);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        listItem.setLeadingGravity(enumC16952b0);
        listItem.setTitleMaxLine(Integer.MAX_VALUE);
        listItem.setSubtitleMaxLine(Integer.MAX_VALUE);
        listItem.setBackground(C23212s8.m119608p(AbstractC2807a.container));
        listItem.m90592m(false);
        listItem.setPadding(AbstractC23136l9.m118742r(36.0f), 0, AbstractC23136l9.m118742r(36.0f), 0);
        C30127y0 c30127y05 = this.f68270b1;
        if (c30127y05 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c30127y02 = c30127y05;
        }
        ListItem listItem2 = c30127y02.f139985s;
        String m92652XI3 = m92652XI(AbstractC8020f0.str_pre_download_setting_no_mobile_data_used);
        AbstractC19074t.m100207e(m92652XI3, "getString(...)");
        listItem2.setTitle(m92652XI3);
        String m92652XI4 = m92652XI(AbstractC8020f0.str_pre_download_setting_no_mobile_data_used_description);
        AbstractC19074t.m100207e(m92652XI4, "getString(...)");
        listItem2.setSubtitle(m92652XI4);
        Context context3 = listItem2.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        Button button2 = new Button(context3);
        button2.m90539c(AbstractC2814h.ButtonMedium_SecondaryNeutral);
        Context context4 = button2.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        button2.setSupportiveIcon(C27280g.m139660c(context4, AbstractC23322a.zds_ic_download_solid_16, AbstractC2807a.icon_01));
        listItem2.m90587c(button2);
        listItem2.setTitleStyleBold(true);
        listItem2.setLeadingGravity(enumC16952b0);
        listItem2.setTitleMaxLine(Integer.MAX_VALUE);
        listItem2.setSubtitleMaxLine(Integer.MAX_VALUE);
        listItem2.setBackground(C23212s8.m119608p(AbstractC2807a.container));
        listItem2.m90592m(false);
        listItem2.setPadding(AbstractC23136l9.m118742r(36.0f), 0, AbstractC23136l9.m118742r(36.0f), 0);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m74598KL(m92642L3());
    }
}
