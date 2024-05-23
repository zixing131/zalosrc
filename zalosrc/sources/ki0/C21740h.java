package ki0;

import android.content.Context;
import android.graphics.Typeface;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.EnumC13569b3;
import com.zing.zalo.p077ui.widget.InterfaceC13722r1;
import kd0.C21697g;

/* renamed from: ki0.h */
/* loaded from: classes7.dex */
public class C21740h extends C21697g implements InterfaceC13722r1 {

    /* renamed from: f1 */
    private int f105577f1;

    /* renamed from: g1 */
    private boolean f105578g1;

    /* renamed from: h1 */
    private boolean f105579h1;

    /* renamed from: i1 */
    private boolean f105580i1;

    /* renamed from: j1 */
    private final Context f105581j1;

    /* renamed from: k1 */
    private float f105582k1;

    /* renamed from: l1 */
    private int f105583l1;

    /* renamed from: m1 */
    private float f105584m1;

    /* renamed from: n1 */
    private float f105585n1;

    /* renamed from: o1 */
    private int f105586o1;

    /* renamed from: p1 */
    private int f105587p1;

    public C21740h(Context context) {
        super(context);
        this.f105578g1 = false;
        this.f105579h1 = false;
        this.f105580i1 = false;
        this.f105583l1 = EnumC13569b3.NONE.m76022e();
        this.f105584m1 = Float.MAX_VALUE;
        this.f105585n1 = Float.MIN_VALUE;
        this.f105586o1 = 0;
        this.f105587p1 = C13778s1.m76961b().length;
        this.f105581j1 = context;
        mo111964L1(m111977q1());
        m112185Q1(0, true);
    }

    /* renamed from: Q1 */
    private void m112185Q1(int i11, boolean z11) {
        if (this.f105577f1 != i11 || z11) {
            this.f105577f1 = i11;
            if (C13778s1.m76960a()) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            super.mo111965M1(i11);
                            return;
                        } else {
                            super.mo111965M1(0);
                            super.mo111966N1(C13718q1.m76695d(this.f105581j1, 6));
                            return;
                        }
                    }
                    super.mo111965M1(0);
                    if (this.f105579h1) {
                        super.mo111966N1(C13718q1.m76695d(this.f105581j1, 9));
                        return;
                    } else {
                        super.mo111966N1(C13718q1.m76695d(this.f105581j1, 7));
                        return;
                    }
                }
                super.mo111965M1(0);
                if (this.f105580i1) {
                    super.mo111966N1(C13718q1.m76695d(this.f105581j1, 3));
                    return;
                } else {
                    super.mo111966N1(C13718q1.m76695d(this.f105581j1, 5));
                    return;
                }
            }
            super.mo111965M1(i11);
        }
    }

    @Override // kd0.C21697g
    /* renamed from: L1 */
    public void mo111964L1(float f11) {
        this.f105582k1 = f11;
        if (C13778s1.m76966g() && !this.f105578g1) {
            super.mo111964L1(this.f105582k1 * C13778s1.m76964e(this.f105583l1, Math.max(Math.min(C13778s1.m76965f(), this.f105587p1), this.f105586o1)));
        } else {
            super.mo111964L1(this.f105582k1);
        }
        float m111977q1 = m111977q1();
        float f12 = this.f105584m1;
        if (m111977q1 > f12) {
            super.mo111964L1(f12);
        }
        float m111977q12 = m111977q1();
        float f13 = this.f105585n1;
        if (m111977q12 < f13) {
            super.mo111964L1(f13);
        }
    }

    @Override // kd0.C21697g
    /* renamed from: M1 */
    public void mo111965M1(int i11) {
        m112185Q1(i11, false);
    }

    @Override // kd0.C21697g
    /* renamed from: N1 */
    public void mo111966N1(Typeface typeface) {
        if (!C13778s1.m76960a()) {
            super.mo111966N1(typeface);
            return;
        }
        if (Typeface.DEFAULT.equals(typeface)) {
            super.mo111966N1(C13718q1.m76695d(getContext(), 5));
        } else if (Typeface.DEFAULT_BOLD.equals(typeface)) {
            super.mo111966N1(C13718q1.m76695d(getContext(), 9));
        } else {
            super.mo111966N1(typeface);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    /* renamed from: g */
    public void mo75850g(boolean z11) {
        this.f105578g1 = z11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextRatioIndex(int i11) {
        this.f105587p1 = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextSize(float f11) {
        this.f105584m1 = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextRatioIndex(int i11) {
        this.f105586o1 = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextSize(float f11) {
        this.f105585n1 = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setTextClass(int i11) {
        this.f105583l1 = i11;
    }

    public C21740h(Context context, float f11, int i11, boolean z11) {
        super(context);
        this.f105578g1 = false;
        this.f105579h1 = false;
        this.f105580i1 = false;
        this.f105583l1 = EnumC13569b3.NONE.m76022e();
        this.f105584m1 = Float.MAX_VALUE;
        this.f105585n1 = Float.MIN_VALUE;
        this.f105586o1 = 0;
        this.f105587p1 = C13778s1.m76961b().length;
        this.f105581j1 = context;
        m111962J1(i11);
        mo111964L1(f11);
        m112185Q1(z11 ? 1 : 0, true);
    }
}
