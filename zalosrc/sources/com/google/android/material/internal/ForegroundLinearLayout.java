package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: E */
    private Drawable f35443E;

    /* renamed from: F */
    private final Rect f35444F;

    /* renamed from: G */
    private final Rect f35445G;

    /* renamed from: H */
    private int f35446H;

    /* renamed from: I */
    protected boolean f35447I;

    /* renamed from: J */
    boolean f35448J;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f35443E;
        if (drawable != null) {
            if (this.f35448J) {
                this.f35448J = false;
                Rect rect = this.f35444F;
                Rect rect2 = this.f35445G;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f35447I) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f35446H, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f35443E;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f35443E;
        if (drawable != null && drawable.isStateful()) {
            this.f35443E.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f35443E;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f35446H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f35443E;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f35448J = z11 | this.f35448J;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f35448J = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f35443E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f35443E);
            }
            this.f35443E = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f35446H == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i11) {
        if (this.f35446H != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f35446H = i11;
            if (i11 == 119 && this.f35443E != null) {
                this.f35443E.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f35443E) {
            return false;
        }
        return true;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f35444F = new Rect();
        this.f35445G = new Rect();
        this.f35446H = 119;
        this.f35447I = true;
        this.f35448J = false;
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.ForegroundLinearLayout, i11, 0, new int[0]);
        this.f35446H = m32639h.getInt(AbstractC23587l.ForegroundLinearLayout_android_foregroundGravity, this.f35446H);
        Drawable drawable = m32639h.getDrawable(AbstractC23587l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f35447I = m32639h.getBoolean(AbstractC23587l.ForegroundLinearLayout_foregroundInsidePadding, true);
        m32639h.recycle();
    }
}
