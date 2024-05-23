package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.internal.AbstractC6359z;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23587l;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28774c;

/* loaded from: classes3.dex */
public class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout {

    /* renamed from: u */
    private static final View.OnTouchListener f35863u = new ViewOnTouchListenerC6401a();

    /* renamed from: p */
    private int f35864p;

    /* renamed from: q */
    private final float f35865q;

    /* renamed from: r */
    private final float f35866r;

    /* renamed from: s */
    private ColorStateList f35867s;

    /* renamed from: t */
    private PorterDuff.Mode f35868t;

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
    /* loaded from: classes3.dex */
    static class ViewOnTouchListenerC6401a implements View.OnTouchListener {
        ViewOnTouchListenerC6401a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0638a.m909c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC23587l.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(AbstractC23587l.SnackbarLayout_elevation)) {
            AbstractC1579n0.m7817I0(this, obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.SnackbarLayout_elevation, 0));
        }
        this.f35864p = obtainStyledAttributes.getInt(AbstractC23587l.SnackbarLayout_animationMode, 0);
        this.f35865q = obtainStyledAttributes.getFloat(AbstractC23587l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(AbstractC28774c.m143973a(context2, obtainStyledAttributes, AbstractC23587l.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(AbstractC6359z.m32654i(obtainStyledAttributes.getInt(AbstractC23587l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.f35866r = obtainStyledAttributes.getFloat(AbstractC23587l.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f35863u);
        setFocusable(true);
        if (getBackground() == null) {
            AbstractC1579n0.m7807D0(this, m32929a());
        }
    }

    /* renamed from: a */
    private Drawable m32929a() {
        float dimension = getResources().getDimension(AbstractC23579d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(AbstractC25136a.m130298h(this, AbstractC23577b.colorSurface, AbstractC23577b.colorOnSurface, getBackgroundOverlayColorAlpha()));
        if (this.f35867s != null) {
            Drawable m7200r = AbstractC1414a.m7200r(gradientDrawable);
            AbstractC1414a.m7197o(m7200r, this.f35867s);
            return m7200r;
        }
        return AbstractC1414a.m7200r(gradientDrawable);
    }

    float getActionTextColorAlpha() {
        return this.f35866r;
    }

    int getAnimationMode() {
        return this.f35864p;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.f35865q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1579n0.m7910x0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    void setAnimationMode(int i11) {
        this.f35864p = i11;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f35867s != null) {
            drawable = AbstractC1414a.m7200r(drawable.mutate());
            AbstractC1414a.m7197o(drawable, this.f35867s);
            AbstractC1414a.m7198p(drawable, this.f35868t);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f35867s = colorStateList;
        if (getBackground() != null) {
            Drawable m7200r = AbstractC1414a.m7200r(getBackground().mutate());
            AbstractC1414a.m7197o(m7200r, colorStateList);
            AbstractC1414a.m7198p(m7200r, this.f35868t);
            if (m7200r != getBackground()) {
                super.setBackgroundDrawable(m7200r);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f35868t = mode;
        if (getBackground() != null) {
            Drawable m7200r = AbstractC1414a.m7200r(getBackground().mutate());
            AbstractC1414a.m7198p(m7200r, mode);
            if (m7200r != getBackground()) {
                super.setBackgroundDrawable(m7200r);
            }
        }
    }

    void setOnAttachStateChangeListener(InterfaceC6403b interfaceC6403b) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = f35863u;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(InterfaceC6404c interfaceC6404c) {
    }
}
