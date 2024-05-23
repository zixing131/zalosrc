package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import me0.AbstractC23136l9;
import p348mi.AbstractC23304d;

/* loaded from: classes6.dex */
public class ChangePhoneNumberIntroView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    private View f72671P0;

    /* renamed from: Q0 */
    private View f72672Q0;

    /* renamed from: R0 */
    boolean f72673R0 = false;

    /* renamed from: S0 */
    boolean f72674S0 = false;

    /* renamed from: T0 */
    int f72675T0 = 1;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z11;
        boolean z12;
        int i11;
        View inflate = layoutInflater.inflate(AbstractC7409c0.change_phone_number_intro_view, viewGroup, false);
        this.f72672Q0 = inflate;
        try {
            View findViewById = inflate.findViewById(AbstractC6918a0.btn_next);
            this.f72671P0 = findViewById;
            findViewById.setOnClickListener(this);
            if (m92642L3() != null && m92642L3().getBoolean("is_unmap_profile", false)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f72673R0 = z11;
            if (m92642L3() != null && m92642L3().getBoolean("is_bypass_password", false)) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f72674S0 = z12;
            if (m92642L3() != null) {
                i11 = m92642L3().getInt("source_type_change_phone", 1);
            } else {
                i11 = 1;
            }
            this.f72675T0 = i11;
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42437s)) {
                ((TextView) this.f72672Q0.findViewById(AbstractC6918a0.tv_title_change_phone)).setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_intro_hint, AbstractC23304d.f113368c0.f42437s));
                TextView textView = (TextView) this.f72672Q0.findViewById(AbstractC6918a0.tv_hint_1);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_intro_detail_1);
                int indexOf = m118743r0.indexOf("%s");
                SpannableString spannableString = new SpannableString(String.format(m118743r0, AbstractC23304d.f113368c0.f42437s));
                spannableString.setSpan(new StyleSpan(1), indexOf, AbstractC23304d.f113368c0.f42437s.length() + indexOf, 33);
                textView.setText(spannableString);
            }
            TextView textView2 = (TextView) this.f72672Q0.findViewById(AbstractC6918a0.tv_hint_3);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_intro_detail_3_note);
            SpannableString spannableString2 = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_intro_detail_3, m118743r02));
            spannableString2.setSpan(new StyleSpan(1), 0, m118743r02.length(), 33);
            textView2.setText(spannableString2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f72672Q0;
    }

    /* renamed from: gM */
    public Bundle m78767gM() {
        Bundle bundle = new Bundle();
        bundle.putInt("source_type_change_phone", this.f72675T0);
        return bundle;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChangePhoneNumberIntroView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_next && this.f72421L0.m92650VI() != null && this.f72421L0.m92650VI().m92649TI() != null) {
            this.f72421L0.m92650VI().m92649TI().m93062f2(AbstractC6918a0.deactivate_container, ChangePhoneNumberInputView.class, m78767gM(), 0, true);
        }
    }
}
