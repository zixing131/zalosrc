package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bi0.AbstractC2807a;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.RobotoRadioButton;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;

/* loaded from: classes7.dex */
public final class RadioButton extends RobotoRadioButton implements InterfaceC16976f1 {

    /* renamed from: A */
    private int f86348A;

    /* renamed from: B */
    private boolean f86349B;

    /* renamed from: w */
    private C25808b f86350w;

    /* renamed from: x */
    private Drawable f86351x;

    /* renamed from: y */
    private Drawable f86352y;

    /* renamed from: z */
    private Drawable f86353z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioButton(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    private final void m90612c(boolean z11) {
        if (this.f86349B && isEnabled()) {
            if (z11) {
                setButtonDrawable(this.f86352y);
                Drawable drawable = this.f86352y;
                if (drawable instanceof AnimatedVectorDrawable) {
                    AbstractC19074t.m100206d(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
                    ((AnimatedVectorDrawable) drawable).start();
                }
            } else {
                setButtonDrawable(this.f86353z);
                Drawable drawable2 = this.f86353z;
                if (drawable2 instanceof AnimatedVectorDrawable) {
                    AbstractC19074t.m100206d(drawable2, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
                    ((AnimatedVectorDrawable) drawable2).start();
                }
            }
        } else {
            setButtonDrawable(this.f86351x);
        }
        this.f86349B = true;
    }

    /* renamed from: d */
    private final void m90613d(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.RadioButton, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…defStyleRes\n            )");
        this.f86351x = obtainStyledAttributes.getDrawable(AbstractC2815i.RadioButton_rbNormalDrawable);
        this.f86352y = obtainStyledAttributes.getDrawable(AbstractC2815i.RadioButton_rbCheckedDrawable);
        this.f86353z = obtainStyledAttributes.getDrawable(AbstractC2815i.RadioButton_rbUnCheckedDrawable);
        this.f86348A = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.RadioButton_android_paddingLeft, this.f86348A);
        setText(getText());
        this.f86349B = false;
        m90612c(isChecked());
        String string = obtainStyledAttributes.getString(AbstractC2815i.RadioButton_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    static /* synthetic */ void m90614e(RadioButton radioButton, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        radioButton.m90613d(attributeSet, i11, i12);
    }

    /* renamed from: f */
    public final void m90615f(boolean z11, boolean z12) {
        if (isChecked() == z11) {
            return;
        }
        this.f86349B = z12;
        setChecked(z11);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        if (isChecked() == z11) {
            return;
        }
        m90612c(z11);
        super.setChecked(z11);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86350w;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86350w;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (charSequence != null && charSequence.length() != 0) {
            setPadding(this.f86348A, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } else {
            setPadding(0, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86350w;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.radiobtnDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86349B = true;
        this.f86350w = new C25808b(new WeakReference(this));
        m90614e(this, attributeSet, i11, 0, 4, null);
    }
}
