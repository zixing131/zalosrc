package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class RobotoEditText extends AppCompatEditText implements InterfaceC13722r1 {

    /* renamed from: s */
    private int f69552s;

    /* renamed from: t */
    private String f69553t;

    /* renamed from: u */
    private boolean f69554u;

    /* renamed from: v */
    private float f69555v;

    /* renamed from: w */
    private float f69556w;

    /* renamed from: x */
    private int f69557x;

    /* renamed from: y */
    private int f69558y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoEditText(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f69552s = EnumC13569b3.NONE.m76022e();
        this.f69555v = Float.MAX_VALUE;
        this.f69556w = Float.MIN_VALUE;
        this.f69558y = C13778s1.m76961b().length;
        m75857h(context, null, 0);
        m75858i(1, getTextSize() / getResources().getDisplayMetrics().density);
        getInputType();
    }

    /* renamed from: h */
    private final void m75857h(Context context, AttributeSet attributeSet, int i11) {
        if (isInEditMode() || !C13778s1.m76960a()) {
            return;
        }
        C13699o1 c13699o1 = C13699o1.f70798a;
        C13694n1 m76488c = c13699o1.m76488c(context, attributeSet, i11, 0);
        int m76446h = m76488c.m76446h();
        this.f69552s = m76488c.m76445g();
        this.f69553t = m76488c.m76440b();
        this.f69554u = m76488c.m76439a();
        this.f69555v = m76488c.m76442d();
        this.f69556w = m76488c.m76444f();
        this.f69558y = m76488c.m76441c();
        this.f69557x = m76488c.m76443e();
        c13699o1.m76487b(this, this.f69553t, Integer.valueOf(m76446h));
    }

    /* renamed from: i */
    private final void m75858i(int i11, float f11) {
        if (C13778s1.m76966g() && !this.f69554u) {
            super.setTextSize(i11, f11 * C13778s1.m76964e(this.f69552s, Math.min(Math.max(C13778s1.m76965f(), this.f69557x), this.f69558y)));
            float textSize = getTextSize();
            float f12 = this.f69555v;
            if (textSize > f12) {
                super.setTextSize(0, f12);
            }
            float textSize2 = getTextSize();
            float f13 = this.f69556w;
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
        this.f69554u = z11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextRatioIndex(int i11) {
        this.f69558y = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextSize(float f11) {
        this.f69555v = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextRatioIndex(int i11) {
        this.f69557x = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextSize(float f11) {
        this.f69556w = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setTextClass(int i11) {
        this.f69552s = i11;
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        m75858i(i11, f11);
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
    public RobotoEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f69552s = EnumC13569b3.NONE.m76022e();
        this.f69555v = Float.MAX_VALUE;
        this.f69556w = Float.MIN_VALUE;
        this.f69558y = C13778s1.m76961b().length;
        m75857h(context, attributeSet, 0);
        m75858i(1, getTextSize() / getResources().getDisplayMetrics().density);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f69552s = EnumC13569b3.NONE.m76022e();
        this.f69555v = Float.MAX_VALUE;
        this.f69556w = Float.MIN_VALUE;
        this.f69558y = C13778s1.m76961b().length;
        m75857h(context, attributeSet, i11);
        m75858i(1, getTextSize() / getResources().getDisplayMetrics().density);
    }
}
