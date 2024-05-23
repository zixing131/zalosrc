package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.widget.AbstractC1640l;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.RobotoButton;
import fi0.C18954a;
import fi0.C18955b;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import mm0.AbstractC23350e;
import ri0.C25808b;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes.dex */
public class Button extends RobotoButton implements InterfaceC16976f1 {

    /* renamed from: A */
    private Drawable f86225A;

    /* renamed from: B */
    private ColorStateList f86226B;

    /* renamed from: C */
    private int f86227C;

    /* renamed from: D */
    private int f86228D;

    /* renamed from: E */
    private int f86229E;

    /* renamed from: F */
    private int f86230F;

    /* renamed from: G */
    private int f86231G;

    /* renamed from: H */
    private int f86232H;

    /* renamed from: I */
    private int f86233I;

    /* renamed from: y */
    private C25808b f86234y;

    /* renamed from: z */
    private int f86235z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Button(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: d */
    private final void m90534d() {
        int m91163c;
        int i11 = this.f86235z;
        if (i11 == ((int) getResources().getDimension(AbstractC2809c.btn_large_height))) {
            m91163c = EnumC17025p.BUTTON_SIZE_LARGE.m91163c();
        } else if (i11 == ((int) getResources().getDimension(AbstractC2809c.btn_medium_height))) {
            m91163c = EnumC17025p.BUTTON_SIZE_MEDIUM.m91163c();
        } else if (i11 == ((int) getResources().getDimension(AbstractC2809c.btn_small_height))) {
            m91163c = EnumC17025p.BUTTON_SIZE_SMALL.m91163c();
        } else {
            m91163c = EnumC17025p.BUTTON_SIZE_LARGE.m91163c();
        }
        this.f86233I = m91163c;
    }

    /* renamed from: e */
    private final void m90535e(int i11) {
        int i12;
        int i13;
        Drawable newDrawable;
        if (this.f86225A != null && i11 != 0) {
            CharSequence text = getText();
            AbstractC19074t.m100207e(text, "text");
            if (text.length() == 0) {
                i12 = 0;
            } else {
                i12 = this.f86228D;
            }
            CharSequence text2 = getText();
            AbstractC19074t.m100207e(text2, "text");
            if (text2.length() == 0) {
                i13 = this.f86230F;
            } else {
                i13 = this.f86231G;
            }
            int i14 = this.f86227C;
            if (i14 <= 0) {
                Drawable drawable = this.f86225A;
                if (drawable != null) {
                    i14 = drawable.getIntrinsicWidth();
                } else {
                    i14 = 0;
                }
            }
            if (i14 == 0) {
                return;
            }
            int textWidth = (((((i11 - getTextWidth()) - i13) - i14) - i12) - i13) / 2;
            Drawable drawable2 = this.f86225A;
            AbstractC19074t.m100205c(drawable2);
            Drawable.ConstantState constantState = AbstractC1414a.m7200r(drawable2).getConstantState();
            if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
                ColorStateList colorStateList = this.f86226B;
                if (colorStateList != null) {
                    newDrawable.setTintList(colorStateList);
                }
                int i15 = this.f86227C;
                if (i15 <= 0) {
                    Drawable drawable3 = this.f86225A;
                    AbstractC19074t.m100205c(drawable3);
                    i15 = drawable3.getIntrinsicWidth();
                }
                int i16 = this.f86227C;
                if (i16 <= 0) {
                    Drawable drawable4 = this.f86225A;
                    AbstractC19074t.m100205c(drawable4);
                    i16 = drawable4.getIntrinsicHeight();
                }
                if (this.f86229E == EnumC17020n.TRAILING.m91100c()) {
                    int i17 = -textWidth;
                    newDrawable.setBounds(i17, 0, i15 + i17, i16);
                    AbstractC1640l.m8419j(this, null, null, newDrawable, null);
                } else if (this.f86229E == EnumC17020n.LEADING.m91100c()) {
                    newDrawable.setBounds(textWidth, 0, i15 + textWidth, i16);
                    AbstractC1640l.m8419j(this, newDrawable, null, null, null);
                }
                this.f86225A = newDrawable;
            }
        }
    }

    /* renamed from: f */
    private final void m90536f(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.Button, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…defStyleRes\n            )");
        this.f86225A = obtainStyledAttributes.getDrawable(AbstractC2815i.Button_btnSupportiveIcon);
        this.f86226B = obtainStyledAttributes.getColorStateList(AbstractC2815i.Button_btnSupportiveIconTint);
        this.f86227C = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Button_btnSupportiveIconSize, getResources().getDimensionPixelSize(AbstractC2809c.btn_supportive_icon_size_medium));
        this.f86228D = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Button_btnSupportiveIconPadding, getResources().getDimensionPixelSize(AbstractC2809c.btn_supportive_icon_padding_medium));
        this.f86235z = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Button_btnFixHeight, getResources().getDimensionPixelSize(AbstractC2809c.btn_large_height));
        this.f86230F = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Button_btnSupportiveIconPaddingNoText, getResources().getDimensionPixelSize(AbstractC2809c.btn_padding_medium_no_text));
        this.f86229E = obtainStyledAttributes.getInt(AbstractC2815i.Button_btnSupportiveIconPosition, 0);
        this.f86232H = obtainStyledAttributes.getInt(AbstractC2815i.Button_btnType, EnumC17039q.BUTTON_TYPE_PRIMARY.m91223c());
        this.f86231G = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Button_android_paddingLeft, getResources().getDimensionPixelSize(AbstractC2809c.btn_large_padding_left));
        String string = obtainStyledAttributes.getString(AbstractC2815i.Button_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
        m90538i();
        m90534d();
    }

    private final int getTextWidth() {
        int measuredWidth;
        TextPaint paint = getPaint();
        AbstractC19074t.m100207e(paint, "paint");
        String obj = getText().toString();
        if (getTransformationMethod() != null) {
            obj = getTransformationMethod().getTransformation(obj, this).toString();
        }
        int measureText = (int) paint.measureText(obj);
        Layout layout = getLayout();
        if (layout != null) {
            measuredWidth = layout.getEllipsizedWidth();
        } else {
            measuredWidth = getMeasuredWidth();
        }
        return Math.min(measureText, measuredWidth);
    }

    /* renamed from: h */
    static /* synthetic */ void m90537h(Button button, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            button.m90536f(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: i */
    private final void m90538i() {
        Drawable drawable;
        Drawable mutate;
        Drawable.ConstantState constantState;
        Drawable drawable2 = this.f86225A;
        if (drawable2 != null && (mutate = drawable2.mutate()) != null && (constantState = mutate.getConstantState()) != null) {
            drawable = constantState.newDrawable();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            int i11 = this.f86227C;
            if (i11 > 0) {
                drawable.setBounds(0, 0, i11, i11);
            } else {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            ColorStateList colorStateList = this.f86226B;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        CharSequence text = getText();
        AbstractC19074t.m100207e(text, "text");
        if (text.length() == 0) {
            setCompoundDrawablePadding(0);
            int i12 = this.f86230F;
            setPadding(i12, 0, i12, 0);
        } else {
            setCompoundDrawablePadding(this.f86228D);
            int i13 = this.f86231G;
            setPadding(i13, 0, i13, 0);
        }
        if (this.f86229E == EnumC17020n.TRAILING.m91100c()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], drawable, getCompoundDrawables()[3]);
        } else if (this.f86229E == EnumC17020n.LEADING.m91100c()) {
            setCompoundDrawables(drawable, getCompoundDrawables()[1], getCompoundDrawables()[2], getCompoundDrawables()[3]);
        }
        m90535e(getMeasuredWidth());
    }

    /* renamed from: c */
    public final void m90539c(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        try {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            new C26708g(this).m137319a(C26705d.m137293a(context, i11));
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            C18954a m99467a = C18955b.m99467a(context2, i11);
            if (m99467a.m99454e() != null) {
                setWidth(m99467a.m99454e().intValue());
            }
            if (m99467a.m99453d() != null) {
                setHeight(m99467a.m99453d().intValue());
            }
            if (m99467a.m99455f() != null) {
                setMinHeight(m99467a.m99455f().intValue());
            }
            if (m99467a.m99456g() != null) {
                setMinWidth(m99467a.m99456g().intValue());
            }
            Integer m99458i = m99467a.m99458i();
            if (m99458i != null) {
                i12 = m99458i.intValue();
            } else {
                i12 = 0;
            }
            Integer m99460k = m99467a.m99460k();
            if (m99460k != null) {
                i13 = m99460k.intValue();
            } else {
                i13 = 0;
            }
            Integer m99459j = m99467a.m99459j();
            if (m99459j != null) {
                i14 = m99459j.intValue();
            } else {
                i14 = 0;
            }
            Integer m99457h = m99467a.m99457h();
            if (m99457h != null) {
                i15 = m99457h.intValue();
            } else {
                i15 = 0;
            }
            setPadding(i12, i13, i14, i15);
            Integer m99463n = m99467a.m99463n();
            if (m99463n != null) {
                i16 = m99463n.intValue();
            } else {
                i16 = this.f86230F;
            }
            this.f86230F = i16;
            Integer m99458i2 = m99467a.m99458i();
            if (m99458i2 != null) {
                i17 = m99458i2.intValue();
            } else {
                i17 = this.f86231G;
            }
            this.f86231G = i17;
            setBackground(m99467a.m99450a());
            Drawable drawable = this.f86225A;
            if (drawable == null) {
                drawable = m99467a.m99461l();
            }
            this.f86225A = drawable;
            this.f86226B = m99467a.m99466q();
            this.f86227C = m99467a.m99465p();
            this.f86228D = m99467a.m99462m();
            this.f86229E = m99467a.m99464o();
            this.f86232H = m99467a.m99452c();
            this.f86235z = m99467a.m99451b();
            m90538i();
            m90534d();
        } catch (Exception e11) {
            AbstractC23350e.m122777g("Apply style button error: " + e11, new Object[0]);
        }
    }

    public final int getBtnType() {
        return this.f86232H;
    }

    public final int getBtnTypeSize() {
        return this.f86233I;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(this.f86235z, 1073741824));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m90535e(i11);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        m90535e(getMeasuredWidth());
    }

    public final void setBtnType(int i11) {
        this.f86232H = i11;
    }

    public final void setBtnTypeSize(int i11) {
        this.f86233I = i11;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        m90538i();
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86234y;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86234y;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setSupportiveIcon(Drawable drawable) {
        this.f86225A = drawable;
        m90538i();
    }

    public final void setSupportiveIconPadding(int i11) {
        if (this.f86228D == i11) {
            return;
        }
        this.f86228D = i11;
        m90538i();
    }

    public final void setSupportiveIconPosition(EnumC17020n enumC17020n) {
        AbstractC19074t.m100208f(enumC17020n, "pos");
        if (this.f86229E == enumC17020n.m91100c()) {
            return;
        }
        this.f86229E = enumC17020n.m91100c();
    }

    public final void setSupportiveIconSize(int i11) {
        if (this.f86227C == i11) {
            return;
        }
        this.f86227C = i11;
        m90538i();
    }

    public final void setSupportiveIconTintColor(ColorStateList colorStateList) {
        this.f86226B = colorStateList;
        m90538i();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (charSequence != null && charSequence.length() != 0) {
            setCompoundDrawablePadding(this.f86228D);
            int i11 = this.f86231G;
            setPadding(i11, 0, i11, 0);
        } else {
            setCompoundDrawablePadding(0);
            int i12 = this.f86230F;
            setPadding(i12, 0, i12, 0);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86234y;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.buttonDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    public final void setSupportiveIcon(int i11) {
        setSupportiveIcon(AbstractC1401h.m7082f(getResources(), i11, getContext().getTheme()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86234y = new C25808b(new WeakReference(this));
        m90537h(this, attributeSet, i11, 0, 4, null);
    }
}
