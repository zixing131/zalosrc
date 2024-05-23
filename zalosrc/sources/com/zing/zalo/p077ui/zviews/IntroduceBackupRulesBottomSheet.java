package com.zing.zalo.p077ui.zviews;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p348mi.AbstractC23306f;
import p649xl.C29958o4;

/* loaded from: classes6.dex */
public final class IntroduceBackupRulesBottomSheet extends BottomSheetZaloViewWithAnim {

    /* renamed from: W0 */
    private C29958o4 f74425W0;

    /* renamed from: mM */
    private final C29958o4 m80900mM() {
        C29958o4 c29958o4 = this.f74425W0;
        AbstractC19074t.m100205c(c29958o4);
        return c29958o4;
    }

    /* renamed from: nM */
    private final void m80901nM() {
        int m127173b0;
        String m127116F;
        int m127173b02;
        String m127114D;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_rules_desc);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#x#", 0, false, 6, null);
        m127116F = AbstractC24341v.m127116F(m118743r0, "#x#", "", false, 4, null);
        m127173b02 = AbstractC24342w.m127173b0(m127116F, "#x#", 0, false, 6, null);
        m127114D = AbstractC24341v.m127114D(m127116F, "#x#", "", false, 4, null);
        if (m127173b0 >= 0 && m127173b02 >= 0) {
            SpannableString spannableString = new SpannableString(m127114D);
            spannableString.setSpan(new StyleSpan(1), m127173b0, m127173b02, 33);
            m80900mM().f138857r.setText(spannableString);
        } else {
            m80900mM().f138857r.setText(m127114D);
        }
        int m128446e = AbstractC23306f.m120676j().m128426v().m128446e();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_rules_desc_2);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        String format = String.format(m118743r02, Arrays.copyOf(new Object[]{Integer.valueOf(m128446e)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        m80900mM().f138858s.setText(format);
    }

    /* renamed from: oM */
    private final void m80902oM() {
        AbstractC23136l9.m118744r1(this.f72456O0, 8);
        ViewGroup.LayoutParams layoutParams = this.f72455N0.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            this.f72455N0.setLayoutParams(layoutParams);
        }
        m78539iM(true);
        this.f72454M0.setCanOverTranslateMaxY(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return (this.f72454M0.getMeasuredHeight() - m80900mM().f138856q.getBottom()) - AbstractC23136l9.m118737p0();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        this.f74425W0 = C29958o4.m148311c(LayoutInflater.from(getContext()), linearLayout, true);
        m80902oM();
        m80901nM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMinTranslationY(mo37128eM());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "IntroduceBackupRulesBottomSheet";
    }
}
