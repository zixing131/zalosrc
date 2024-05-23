package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class RobotoCompoundButton extends CompoundButton implements InterfaceC13722r1 {

    /* renamed from: p */
    private int f69545p;

    /* renamed from: q */
    private String f69546q;

    /* renamed from: r */
    private boolean f69547r;

    /* renamed from: s */
    private float f69548s;

    /* renamed from: t */
    private float f69549t;

    /* renamed from: u */
    private int f69550u;

    /* renamed from: v */
    private int f69551v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoCompoundButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f69545p = EnumC13569b3.NONE.m76022e();
        this.f69548s = Float.MAX_VALUE;
        this.f69549t = Float.MIN_VALUE;
        this.f69551v = C13778s1.m76961b().length;
        m75855a(context, attributeSet, 0);
        m75856b(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    private final void m75855a(Context context, AttributeSet attributeSet, int i11) {
        if (isInEditMode() || !C13778s1.m76960a()) {
            return;
        }
        C13699o1 c13699o1 = C13699o1.f70798a;
        C13694n1 m76488c = c13699o1.m76488c(context, attributeSet, i11, 0);
        int m76446h = m76488c.m76446h();
        this.f69545p = m76488c.m76445g();
        this.f69546q = m76488c.m76440b();
        this.f69547r = m76488c.m76439a();
        this.f69548s = m76488c.m76442d();
        this.f69549t = m76488c.m76444f();
        this.f69551v = m76488c.m76441c();
        this.f69550u = m76488c.m76443e();
        c13699o1.m76487b(this, this.f69546q, Integer.valueOf(m76446h));
    }

    /* renamed from: b */
    private final void m75856b(int i11, float f11) {
        if (C13778s1.m76966g() && !this.f69547r) {
            super.setTextSize(i11, f11 * C13778s1.m76964e(this.f69545p, Math.min(Math.max(C13778s1.m76965f(), this.f69550u), this.f69551v)));
            float textSize = getTextSize();
            float f12 = this.f69548s;
            if (textSize > f12) {
                super.setTextSize(0, f12);
            }
            float textSize2 = getTextSize();
            float f13 = this.f69549t;
            if (textSize2 < f13) {
                super.setTextSize(0, f13);
                return;
            }
            return;
        }
        super.setTextSize(i11, f11);
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    /* renamed from: g */
    public void mo75850g(boolean z11) {
        this.f69547r = z11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextRatioIndex(int i11) {
        this.f69551v = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextSize(float f11) {
        this.f69548s = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextRatioIndex(int i11) {
        this.f69550u = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextSize(float f11) {
        this.f69549t = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setTextClass(int i11) {
        this.f69545p = i11;
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        m75856b(i11, f11);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (isInEditMode()) {
            return;
        }
        if (!C13778s1.m76960a()) {
            super.setTypeface(typeface);
            return;
        }
        if (AbstractC19074t.m100204b(Typeface.DEFAULT, typeface)) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            super.setTypeface(C13718q1.m76694c(context, 5));
        } else {
            if (AbstractC19074t.m100204b(Typeface.DEFAULT_BOLD, typeface)) {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                super.setTypeface(C13718q1.m76694c(context2, 9));
                return;
            }
            super.setTypeface(typeface);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoCompoundButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f69545p = EnumC13569b3.NONE.m76022e();
        this.f69548s = Float.MAX_VALUE;
        this.f69549t = Float.MIN_VALUE;
        this.f69551v = C13778s1.m76961b().length;
        m75855a(context, attributeSet, i11);
        m75856b(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        if (isInEditMode()) {
            return;
        }
        if (!C13778s1.m76960a()) {
            super.setTypeface(typeface, i11);
            return;
        }
        if (i11 == 1) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            super.setTypeface(C13718q1.m76694c(context, 9));
        } else if (i11 != 2) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            super.setTypeface(C13718q1.m76694c(context2, 5));
        } else {
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            super.setTypeface(C13718q1.m76694c(context3, 6));
        }
    }
}
