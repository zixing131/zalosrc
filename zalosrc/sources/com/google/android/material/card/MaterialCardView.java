package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.AbstractC6355v;
import p013a7.AbstractC0638a;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p706z6.AbstractC31690i;
import p706z6.C31694m;
import p706z6.InterfaceC31697p;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC31697p {

    /* renamed from: C */
    private static final int[] f35083C = {R.attr.state_checkable};

    /* renamed from: D */
    private static final int[] f35084D = {R.attr.state_checked};

    /* renamed from: E */
    private static final int[] f35085E = {AbstractC23577b.state_dragged};

    /* renamed from: F */
    private static final int f35086F = AbstractC23586k.Widget_MaterialComponents_CardView;

    /* renamed from: A */
    private boolean f35087A;

    /* renamed from: B */
    private boolean f35088B;

    /* renamed from: y */
    private final C6275b f35089y;

    /* renamed from: z */
    private boolean f35090z;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6273a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.materialCardViewStyle);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f35089y.m32014k().getBounds());
        return rectF;
    }

    /* renamed from: h */
    private void m31967h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f35089y.m32013j();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f35089y.m32015l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f35089y.m32016m();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f35089y.m32017n();
    }

    public int getCheckedIconMargin() {
        return this.f35089y.m32018o();
    }

    public int getCheckedIconSize() {
        return this.f35089y.m32019p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f35089y.m32020q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f35089y.m31988A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f35089y.m31988A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f35089y.m31988A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f35089y.m31988A().top;
    }

    public float getProgress() {
        return this.f35089y.m32022u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f35089y.m32021s();
    }

    public ColorStateList getRippleColor() {
        return this.f35089y.m32023v();
    }

    public C31694m getShapeAppearanceModel() {
        return this.f35089y.m32024w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f35089y.m32025x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f35089y.m32026y();
    }

    public int getStrokeWidth() {
        return this.f35089y.m32027z();
    }

    /* renamed from: i */
    public boolean m31968i() {
        C6275b c6275b = this.f35089y;
        if (c6275b != null && c6275b.m31990D()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f35087A;
    }

    /* renamed from: j */
    public boolean m31969j() {
        return this.f35088B;
    }

    /* renamed from: k */
    public void m31970k(int i11, int i12, int i13, int i14) {
        super.m5862f(i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152470f(this, this.f35089y.m32014k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 3);
        if (m31968i()) {
            View.mergeDrawableStates(onCreateDrawableState, f35083C);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f35084D);
        }
        if (m31969j()) {
            View.mergeDrawableStates(onCreateDrawableState, f35085E);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m31968i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f35089y.m31992F(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f35090z) {
            if (!this.f35089y.m31989C()) {
                this.f35089y.m31993G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i11) {
        this.f35089y.m31994H(ColorStateList.valueOf(i11));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f11) {
        super.setCardElevation(f11);
        this.f35089y.m32010Z();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f35089y.m31995I(colorStateList);
    }

    public void setCheckable(boolean z11) {
        this.f35089y.m31996J(z11);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.f35087A != z11) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f35089y.m31997K(drawable);
    }

    public void setCheckedIconMargin(int i11) {
        this.f35089y.m31998L(i11);
    }

    public void setCheckedIconMarginResource(int i11) {
        if (i11 != -1) {
            this.f35089y.m31998L(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconResource(int i11) {
        this.f35089y.m31997K(AbstractC19694b.m103336d(getContext(), i11));
    }

    public void setCheckedIconSize(int i11) {
        this.f35089y.m31999M(i11);
    }

    public void setCheckedIconSizeResource(int i11) {
        if (i11 != 0) {
            this.f35089y.m31999M(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f35089y.m32000N(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z11) {
        super.setClickable(z11);
        C6275b c6275b = this.f35089y;
        if (c6275b != null) {
            c6275b.m32008X();
        }
    }

    public void setDragged(boolean z11) {
        if (this.f35088B != z11) {
            this.f35088B = z11;
            refreshDrawableState();
            m31967h();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f11) {
        super.setMaxCardElevation(f11);
        this.f35089y.m32011b0();
    }

    public void setOnCheckedChangeListener(InterfaceC6273a interfaceC6273a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z11) {
        super.setPreventCornerOverlap(z11);
        this.f35089y.m32011b0();
        this.f35089y.m32009Y();
    }

    public void setProgress(float f11) {
        this.f35089y.m32002P(f11);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f11) {
        super.setRadius(f11);
        this.f35089y.m32001O(f11);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f35089y.m32003Q(colorStateList);
    }

    public void setRippleColorResource(int i11) {
        this.f35089y.m32003Q(AbstractC19694b.m103335c(getContext(), i11));
    }

    @Override // p706z6.InterfaceC31697p
    public void setShapeAppearanceModel(C31694m c31694m) {
        setClipToOutline(c31694m.m152491u(getBoundsAsRectF()));
        this.f35089y.m32004R(c31694m);
    }

    public void setStrokeColor(int i11) {
        this.f35089y.m32005S(ColorStateList.valueOf(i11));
    }

    public void setStrokeWidth(int i11) {
        this.f35089y.m32006T(i11);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z11) {
        super.setUseCompatPadding(z11);
        this.f35089y.m32011b0();
        this.f35089y.m32009Y();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m31968i() && isEnabled()) {
            this.f35087A = !this.f35087A;
            refreshDrawableState();
            m31967h();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r6), attributeSet, i11);
        int i12 = f35086F;
        this.f35087A = false;
        this.f35088B = false;
        this.f35090z = true;
        TypedArray m32639h = AbstractC6355v.m32639h(getContext(), attributeSet, AbstractC23587l.MaterialCardView, i11, i12, new int[0]);
        C6275b c6275b = new C6275b(this, attributeSet, i11, i12);
        this.f35089y = c6275b;
        c6275b.m31994H(super.getCardBackgroundColor());
        c6275b.m32007U(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c6275b.m31991E(m32639h);
        m32639h.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f35089y.m31994H(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f35089y.m32005S(colorStateList);
    }
}
