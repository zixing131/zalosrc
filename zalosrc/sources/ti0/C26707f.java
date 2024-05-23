package ti0;

import android.content.Context;
import bi0.AbstractC2809c;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13699o1;
import com.zing.zalo.p077ui.widget.InterfaceC13722r1;
import fn0.AbstractC19074t;
import kd0.C21697g;
import ln0.AbstractC22543l;

/* renamed from: ti0.f */
/* loaded from: classes7.dex */
public final class C26707f extends AbstractC26704c {

    /* renamed from: a */
    private final C21697g f126642a;

    public C26707f(C21697g c21697g) {
        AbstractC19074t.m100208f(c21697g, "textModule");
        this.f126642a = c21697g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m137318a(C26703b c26703b) {
        float f11;
        float f12;
        float f13;
        float f14;
        float m116583f;
        boolean z11;
        AbstractC19074t.m100208f(c26703b, "textAppearance");
        C21697g c21697g = this.f126642a;
        C13694n1 m137282i = c26703b.m137282i();
        boolean z12 = c21697g instanceof InterfaceC13722r1;
        if (z12) {
            InterfaceC13722r1 interfaceC13722r1 = (InterfaceC13722r1) c21697g;
            if (m137282i != null) {
                z11 = m137282i.m76439a();
            } else {
                z11 = false;
            }
            interfaceC13722r1.mo75850g(z11);
        }
        if (m137282i != null) {
            if (z12) {
                InterfaceC13722r1 interfaceC13722r12 = (InterfaceC13722r1) c21697g;
                interfaceC13722r12.setTextClass(m137282i.m76445g());
                interfaceC13722r12.setMinScaledTextSize(m137282i.m76444f());
                interfaceC13722r12.setMinScaledTextRatioIndex(m137282i.m76443e());
                interfaceC13722r12.setMaxScaledTextSize(m137282i.m76442d());
                interfaceC13722r12.setMaxScaledTextRatioIndex(m137282i.m76441c());
            }
            C13699o1 c13699o1 = C13699o1.f70798a;
            Context context = c21697g.getContext();
            AbstractC19074t.m100207e(context, "context");
            c21697g.mo111966N1(c13699o1.m76486a(context, m137282i.m76440b(), Integer.valueOf(m137282i.m76446h())));
        }
        if (c26703b.m137276c() != null) {
            c21697g.m111983y1(c26703b.m137276c().floatValue());
        }
        if (c26703b.m137275b() != null) {
            c21697g.m111982x1(c26703b.m137275b().booleanValue());
        }
        if (c26703b.m137288o() != null) {
            c21697g.m111979u1(c26703b.m137288o().booleanValue());
        }
        if (c26703b.m137292s() != null) {
            float floatValue = c26703b.m137292s().floatValue();
            if (m137282i != null) {
                f14 = m137282i.m76442d();
            } else {
                f14 = Float.MAX_VALUE;
            }
            m116583f = AbstractC22543l.m116583f(floatValue, f14);
            c21697g.mo111964L1(m116583f);
        } else {
            c21697g.mo111964L1(c21697g.getContext().getResources().getDimension(AbstractC2809c.default_text_size));
        }
        float f15 = 1.0f;
        float f16 = 0.0f;
        if (c26703b.m137277d() != null) {
            float m111976p1 = this.f126642a.m111976p1();
            if (!AbstractC19074t.m100203a(c26703b.m137277d(), m111976p1)) {
                float floatValue2 = c26703b.m137277d().floatValue() - m111976p1;
                Float m137279f = c26703b.m137279f();
                if (m137279f != null) {
                    f15 = m137279f.floatValue();
                }
                c21697g.m111984z1(floatValue2, f15);
            }
        } else {
            Float m137278e = c26703b.m137278e();
            if (m137278e != null) {
                f11 = m137278e.floatValue();
            } else {
                f11 = 0.0f;
            }
            Float m137279f2 = c26703b.m137279f();
            if (m137279f2 != null) {
                f15 = m137279f2.floatValue();
            }
            c21697g.m111984z1(f11, f15);
        }
        if (c26703b.m137281h() != null) {
            c21697g.m111954B1(c26703b.m137281h().intValue());
        }
        if (c26703b.m137280g() != null) {
            c21697g.m111953A1(c26703b.m137280g().intValue());
        }
        if (c26703b.m137280g() == null && c26703b.m137287n() != null) {
            c21697g.m111957E1(c26703b.m137287n().booleanValue());
        }
        if (c26703b.m137274a() != null) {
            c21697g.m111980v1(c26703b.m137274a());
        }
        if (c26703b.m137289p() != null) {
            c21697g.m111963K1(c26703b.m137289p());
        } else {
            c21697g.m111962J1(-16777216);
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
                c21697g.m111956D1(f12, f13, f16, c26703b.m137283j().intValue());
            }
        }
    }
}
