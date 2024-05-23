package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2811e;
import bo.C3034s;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.EnumC13569b3;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zdesign.component.list.ListMessageSingle;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import com.zing.zalo.zinstant.AbstractC17148f0;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;

/* loaded from: classes6.dex */
public class SettingFontSizeView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    View f77436P0;

    /* renamed from: Q0 */
    RobotoTextView f77437Q0;

    /* renamed from: R0 */
    RobotoTextView f77438R0;

    /* renamed from: S0 */
    RobotoTextView f77439S0;

    /* renamed from: T0 */
    ListMessageSingle f77440T0;

    /* renamed from: U0 */
    ZdsSlider f77441U0;

    /* renamed from: com.zing.zalo.ui.zviews.SettingFontSizeView$a */
    /* loaded from: classes6.dex */
    class C15023a implements ZdsSlider.InterfaceC17047c {
        C15023a() {
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: a */
        public void mo45797a() {
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: b */
        public void mo45798b(float f11) {
            float f12;
            int i11 = (int) f11;
            AbstractC23309i.m120939Fh(EnumC13569b3.TEXT.m76020c(i11));
            C13778s1.m76970k(Integer.valueOf(i11));
            if (C13778s1.m76966g()) {
                f12 = C13778s1.m76962c();
            } else {
                f12 = 1.0f;
            }
            AbstractC17148f0.m91696o(f12);
            AbstractC19646n0.m102940V1();
            C23744a.m124114c().m124116d(6079, new C3034s());
            SettingFontSizeView.this.m92676n2().mo35579p().mo57056b0(true);
            SettingFontSizeView.this.f77441U0.setValueText("");
            SettingFontSizeView.this.f77437Q0.setTextSize(1, 15.0f);
            SettingFontSizeView.this.f77437Q0.setMinWidth(ChatRow.f57233h6);
            RobotoTextView robotoTextView = SettingFontSizeView.this.f77437Q0;
            int m62206U2 = AbstractC11531v0.m62206U2();
            int i12 = ChatRow.f57203M5;
            robotoTextView.setMaxWidth(m62206U2 - (i12 * 2));
            SettingFontSizeView.this.f77438R0.setTextSize(1, 15.0f);
            SettingFontSizeView.this.f77438R0.setMinWidth(ChatRow.f57233h6);
            SettingFontSizeView.this.f77438R0.setMaxWidth(AbstractC11531v0.m62206U2() - (i12 * 2));
            SettingFontSizeView.this.f77439S0.setTextSize(1, 11.0f);
            SettingFontSizeView.this.f77440T0.getNameTextView().setTextSize(1, 16.0f);
            SettingFontSizeView.this.f77440T0.getCustomMsgTextView().setTextSize(1, 14.0f);
            SettingFontSizeView.this.f77440T0.getTimeTextView().setTextSize(1, 12.0f);
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: c */
        public void mo45799c() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingFontSizeView$b */
    /* loaded from: classes6.dex */
    class C15024b extends ZdsActionBar.AbstractC16987c {
        C15024b() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            SettingFontSizeView.this.m84085hM();
            SettingFontSizeView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public void m84085hM() {
        try {
            AbstractC23647d.m123897g("110101");
            int sliderValue = (int) this.f77441U0.getSliderValue();
            if (sliderValue == 0) {
                AbstractC23647d.m123897g("110201");
            } else if (sliderValue == 1) {
                AbstractC23647d.m123897g("110202");
            } else if (sliderValue == 2) {
                AbstractC23647d.m123897g("110203");
            } else if (sliderValue == 3) {
                AbstractC23647d.m123897g("110204");
            } else if (sliderValue == 4) {
                AbstractC23647d.m123897g("110205");
            } else if (sliderValue == 5) {
                AbstractC23647d.m123897g("110206");
            } else if (sliderValue == 6) {
                AbstractC23647d.m123897g("110207");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_font_size_view, viewGroup, false);
        this.f77436P0 = inflate;
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_font_size_view_title_new));
                m87077NK.setLeadingFunctionCallback(new C15024b());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f77437Q0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_chat_content_send);
        this.f77438R0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_chat_content_receive);
        this.f77439S0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_time_chat_content_send);
        ListMessageSingle listMessageSingle = (ListMessageSingle) view.findViewById(AbstractC6918a0.message_item_scale);
        this.f77440T0 = listMessageSingle;
        listMessageSingle.setEnabled(false);
        if (C13778s1.m76960a()) {
            this.f77437Q0.setTypeface(C13718q1.m76694c(getContext(), 5));
            this.f77438R0.setTypeface(C13718q1.m76694c(getContext(), 5));
            this.f77439S0.setTypeface(C13718q1.m76694c(getContext(), 5));
        }
        int m76968i = C13778s1.m76968i(AbstractC23309i.m122635z());
        ZdsSlider zdsSlider = (ZdsSlider) view.findViewById(AbstractC6918a0.slider_font_size);
        this.f77441U0 = zdsSlider;
        RobotoTextView robotoTextView = (RobotoTextView) zdsSlider.findViewById(AbstractC2811e.prefix_text);
        robotoTextView.setFontStyle(7);
        robotoTextView.setTextSize(1, 14.0f);
        RobotoTextView robotoTextView2 = (RobotoTextView) this.f77441U0.findViewById(AbstractC2811e.suffix_text);
        robotoTextView2.setFontStyle(7);
        robotoTextView2.setTextSize(1, 18.0f);
        ((RobotoTextView) this.f77441U0.findViewById(AbstractC2811e.txtLabel)).setTextSize(1, 16.0f);
        ((RobotoTextView) this.f77441U0.findViewById(AbstractC2811e.txtValue)).setTextSize(1, 14.0f);
        this.f77441U0.setValueText("");
        this.f77441U0.setSliderValue(m76968i);
        this.f77441U0.m91244h(true);
        this.f77441U0.setListener(new C15023a());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingFontSizeView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m84085hM();
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
