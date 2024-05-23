package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p175g0.AbstractC19178a;
import p193h0.AbstractC19694b;

/* loaded from: classes2.dex */
public class AppCompatRadioButton extends RadioButton {

    /* renamed from: p */
    private final C1164e f4272p;

    /* renamed from: q */
    private final C1161d f4273q;

    /* renamed from: r */
    private final C1154b0 f4274r;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1161d c1161d = this.f4273q;
        if (c1161d != null) {
            c1161d.m5506b();
        }
        C1154b0 c1154b0 = this.f4274r;
        if (c1154b0 != null) {
            c1154b0.m5467b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1164e c1164e = this.f4272p;
        if (c1164e != null) {
            return c1164e.m5518b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1161d c1161d = this.f4273q;
        if (c1161d != null) {
            return c1161d.m5507c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1161d c1161d = this.f4273q;
        if (c1161d != null) {
            return c1161d.m5508d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1164e c1164e = this.f4272p;
        if (c1164e != null) {
            return c1164e.m5519c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1164e c1164e = this.f4272p;
        if (c1164e != null) {
            return c1164e.m5520d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1161d c1161d = this.f4273q;
        if (c1161d != null) {
            c1161d.m5510f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C1161d c1161d = this.f4273q;
        if (c1161d != null) {
            c1161d.m5511g(i11);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1164e c1164e = this.f4272p;
        if (c1164e != null) {
            c1164e.m5522f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1161d c1161d = this.f4273q;
        if (c1161d != null) {
            c1161d.m5513i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1161d c1161d = this.f4273q;
        if (c1161d != null) {
            c1161d.m5514j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1164e c1164e = this.f4272p;
        if (c1164e != null) {
            c1164e.m5523g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1164e c1164e = this.f4272p;
        if (c1164e != null) {
            c1164e.m5524h(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i11) {
        super(C1202q1.m5687b(context), attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1164e c1164e = new C1164e(this);
        this.f4272p = c1164e;
        c1164e.m5521e(attributeSet, i11);
        C1161d c1161d = new C1161d(this);
        this.f4273q = c1161d;
        c1161d.m5509e(attributeSet, i11);
        C1154b0 c1154b0 = new C1154b0(this);
        this.f4274r = c1154b0;
        c1154b0.m5477m(attributeSet, i11);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(AbstractC19694b.m103336d(getContext(), i11));
    }
}
