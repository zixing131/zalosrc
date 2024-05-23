package ti0;

import android.widget.TextView;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13699o1;
import com.zing.zalo.p077ui.widget.InterfaceC13722r1;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;

/* renamed from: ti0.g */
/* loaded from: classes7.dex */
public final class C26708g extends AbstractC26704c {

    /* renamed from: a */
    private final TextView f126643a;

    public C26708g(TextView textView) {
        AbstractC19074t.m100208f(textView, "textView");
        this.f126643a = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m137319a(C26703b c26703b) {
        float f11;
        float f12;
        float f13;
        float f14;
        float m116583f;
        boolean z11;
        AbstractC19074t.m100208f(c26703b, "textAppearance");
        TextView textView = this.f126643a;
        C13694n1 m137282i = c26703b.m137282i();
        boolean z12 = textView instanceof InterfaceC13722r1;
        if (z12) {
            InterfaceC13722r1 interfaceC13722r1 = (InterfaceC13722r1) textView;
            if (m137282i != null) {
                z11 = m137282i.m76439a();
            } else {
                z11 = false;
            }
            interfaceC13722r1.mo75850g(z11);
        }
        if (m137282i != null) {
            if (z12) {
                InterfaceC13722r1 interfaceC13722r12 = (InterfaceC13722r1) textView;
                interfaceC13722r12.setTextClass(m137282i.m76445g());
                interfaceC13722r12.setMinScaledTextSize(m137282i.m76444f());
                interfaceC13722r12.setMinScaledTextRatioIndex(m137282i.m76443e());
                interfaceC13722r12.setMaxScaledTextSize(m137282i.m76442d());
                interfaceC13722r12.setMaxScaledTextRatioIndex(m137282i.m76441c());
            }
            C13699o1.f70798a.m76487b(textView, m137282i.m76440b(), Integer.valueOf(m137282i.m76446h()));
        }
        if (c26703b.m137276c() != null) {
            textView.setLetterSpacing(c26703b.m137276c().floatValue());
        }
        if (c26703b.m137275b() != null) {
            textView.setIncludeFontPadding(c26703b.m137275b().booleanValue());
        }
        if (c26703b.m137288o() != null) {
            textView.setAllCaps(c26703b.m137288o().booleanValue());
        }
        if (c26703b.m137292s() != null) {
            float floatValue = c26703b.m137292s().floatValue();
            if (m137282i != null) {
                f14 = m137282i.m76442d();
            } else {
                f14 = Float.MAX_VALUE;
            }
            m116583f = AbstractC22543l.m116583f(floatValue, f14);
            textView.setTextSize(0, m116583f);
        } else {
            textView.setTextSize(1, 15.0f);
        }
        float f15 = 1.0f;
        float f16 = 0.0f;
        if (c26703b.m137277d() != null) {
            float fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (!AbstractC19074t.m100203a(c26703b.m137277d(), fontMetricsInt)) {
                textView.setLineSpacing(c26703b.m137277d().floatValue() - fontMetricsInt, 1.0f);
            }
        } else {
            Float m137278e = c26703b.m137278e();
            if (m137278e != null) {
                f11 = m137278e.floatValue();
            } else {
                f11 = 0.0f;
            }
            Float m137279f = c26703b.m137279f();
            if (m137279f != null) {
                f15 = m137279f.floatValue();
            }
            textView.setLineSpacing(f11, f15);
        }
        if (c26703b.m137281h() != null) {
            textView.setMinLines(c26703b.m137281h().intValue());
        }
        if (c26703b.m137280g() != null) {
            textView.setMaxLines(c26703b.m137280g().intValue());
        }
        if (c26703b.m137280g() == null && c26703b.m137287n() != null) {
            textView.setSingleLine(c26703b.m137287n().booleanValue());
        }
        if (c26703b.m137274a() != null) {
            textView.setEllipsize(c26703b.m137274a());
        }
        if (c26703b.m137289p() != null) {
            textView.setTextColor(c26703b.m137289p());
        } else {
            textView.setTextColor(-16777216);
        }
        if (c26703b.m137290q() != null) {
            textView.setHintTextColor(c26703b.m137290q());
        } else {
            textView.setHintTextColor(-16777216);
        }
        if (c26703b.m137291r() != null) {
            textView.setLinkTextColor(c26703b.m137291r());
        } else {
            textView.setLinkTextColor(-16777216);
        }
        if (c26703b.m137283j() != null) {
            Integer m137283j = c26703b.m137283j();
            if (m137283j == null || m137283j.intValue() != 0) {
                Float m137286m = c26703b.m137286m();
                if (m137286m != null) {
                    f12 = m137286m.floatValue();
                } else {
                    f12 = 0.0f;
                }
                Float m137284k = c26703b.m137284k();
                if (m137284k != null) {
                    f13 = m137284k.floatValue();
                } else {
                    f13 = 0.0f;
                }
                Float m137285l = c26703b.m137285l();
                if (m137285l != null) {
                    f16 = m137285l.floatValue();
                }
                textView.setShadowLayer(f12, f13, f16, c26703b.m137283j().intValue());
            }
        }
    }
}
