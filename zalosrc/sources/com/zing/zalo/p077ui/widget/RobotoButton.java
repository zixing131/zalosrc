package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public class RobotoButton extends AppCompatButton implements InterfaceC13722r1 {

    /* renamed from: r */
    private int f69524r;

    /* renamed from: s */
    private String f69525s;

    /* renamed from: t */
    private boolean f69526t;

    /* renamed from: u */
    private float f69527u;

    /* renamed from: v */
    private float f69528v;

    /* renamed from: w */
    private int f69529w;

    /* renamed from: x */
    private int f69530x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoButton(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f69524r = EnumC13569b3.NONE.m76022e();
        this.f69527u = Float.MAX_VALUE;
        this.f69528v = Float.MIN_VALUE;
        this.f69530x = C13778s1.m76961b().length;
        mo75848a(context, null, AbstractC13655j1.buttonStyle);
        m75849b(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    protected void mo75848a(Context context, AttributeSet attributeSet, int i11) {
        AbstractC19074t.m100208f(context, "context");
        if (isInEditMode() || !C13778s1.m76960a()) {
            return;
        }
        C13699o1 c13699o1 = C13699o1.f70798a;
        C13694n1 m76488c = c13699o1.m76488c(context, attributeSet, i11, 0);
        int m76446h = m76488c.m76446h();
        this.f69524r = m76488c.m76445g();
        String m76440b = m76488c.m76440b();
        if (m76440b == null) {
            m76440b = "medium";
        }
        this.f69525s = m76440b;
        this.f69526t = m76488c.m76439a();
        this.f69527u = m76488c.m76442d();
        this.f69528v = m76488c.m76444f();
        this.f69530x = m76488c.m76441c();
        this.f69529w = m76488c.m76443e();
        c13699o1.m76487b(this, this.f69525s, Integer.valueOf(m76446h));
    }

    /* renamed from: b */
    public final void m75849b(int i11, float f11) {
        if (C13778s1.m76966g() && !this.f69526t) {
            super.setTextSize(i11, f11 * C13778s1.m76964e(this.f69524r, Math.min(Math.max(C13778s1.m76965f(), this.f69529w), this.f69530x)));
            float textSize = getTextSize();
            float f12 = this.f69527u;
            if (textSize > f12) {
                super.setTextSize(0, f12);
            }
            float textSize2 = getTextSize();
            float f13 = this.f69528v;
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
        this.f69526t = z11;
    }

    public final void setCustomTypeface(int i11) {
        if (i11 == 1000) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            setTypeface(C13718q1.m76694c(context, 7));
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextRatioIndex(int i11) {
        this.f69530x = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextSize(float f11) {
        this.f69527u = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextRatioIndex(int i11) {
        this.f69529w = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextSize(float f11) {
        this.f69528v = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setTextClass(int i11) {
        this.f69524r = i11;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextSize(int i11, float f11) {
        m75849b(i11, f11);
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
    public RobotoButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f69524r = EnumC13569b3.NONE.m76022e();
        this.f69527u = Float.MAX_VALUE;
        this.f69528v = Float.MIN_VALUE;
        this.f69530x = C13778s1.m76961b().length;
        mo75848a(context, attributeSet, AbstractC13655j1.buttonStyle);
        m75849b(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f69524r = EnumC13569b3.NONE.m76022e();
        this.f69527u = Float.MAX_VALUE;
        this.f69528v = Float.MIN_VALUE;
        this.f69530x = C13778s1.m76961b().length;
        mo75848a(context, attributeSet, i11);
        m75849b(1, getTextSize() / getResources().getDisplayMetrics().density);
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
        setGravity(17);
    }
}
