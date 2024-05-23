package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C1167f;
import androidx.appcompat.widget.C1173h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.util.AbstractC1487i;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.AbstractC6323d;
import com.google.android.material.internal.AbstractC6336c;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.C24048h;
import p382o6.InterfaceC24051k;
import p519t6.C26492b;
import p519t6.InterfaceC26491a;
import p599w6.AbstractC28774c;
import p671y6.InterfaceC30798b;
import p706z6.C31694m;
import p706z6.InterfaceC31697p;

/* loaded from: classes3.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements InterfaceC26491a, InterfaceC31697p, CoordinatorLayout.InterfaceC1303b {

    /* renamed from: G */
    private static final int f35304G = AbstractC23586k.Widget_Design_FloatingActionButton;

    /* renamed from: A */
    boolean f35305A;

    /* renamed from: B */
    final Rect f35306B;

    /* renamed from: C */
    private final Rect f35307C;

    /* renamed from: D */
    private final C1173h f35308D;

    /* renamed from: E */
    private final C26492b f35309E;

    /* renamed from: F */
    private AbstractC6323d f35310F;

    /* renamed from: q */
    private ColorStateList f35311q;

    /* renamed from: r */
    private PorterDuff.Mode f35312r;

    /* renamed from: s */
    private ColorStateList f35313s;

    /* renamed from: t */
    private PorterDuff.Mode f35314t;

    /* renamed from: u */
    private ColorStateList f35315u;

    /* renamed from: v */
    private int f35316v;

    /* renamed from: w */
    private int f35317w;

    /* renamed from: x */
    private int f35318x;

    /* renamed from: y */
    private int f35319y;

    /* renamed from: z */
    private int f35320z;

    /* loaded from: classes3.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f35321a;

        /* renamed from: b */
        private AbstractC6317b f35322b;

        /* renamed from: c */
        private boolean f35323c;

        public BaseBehavior() {
            this.f35323c = true;
        }

        /* renamed from: F */
        private static boolean m32345F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1306e) {
                return ((CoordinatorLayout.C1306e) layoutParams).m6580f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m32346G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i11;
            Rect rect = floatingActionButton.f35306B;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C1306e c1306e = (CoordinatorLayout.C1306e) floatingActionButton.getLayoutParams();
                int i12 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c1306e).rightMargin) {
                    i11 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c1306e).leftMargin) {
                    i11 = -rect.left;
                } else {
                    i11 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c1306e).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    AbstractC1579n0.m7886l0(floatingActionButton, i12);
                }
                if (i11 != 0) {
                    AbstractC1579n0.m7883k0(floatingActionButton, i11);
                }
            }
        }

        /* renamed from: J */
        private boolean m32347J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C1306e c1306e = (CoordinatorLayout.C1306e) floatingActionButton.getLayoutParams();
            if (!this.f35323c || c1306e.m6579e() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: K */
        private boolean m32348K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m32347J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f35321a == null) {
                this.f35321a = new Rect();
            }
            Rect rect = this.f35321a;
            AbstractC6336c.m32555a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m32340m(this.f35322b, false);
                return true;
            }
            floatingActionButton.m32344v(this.f35322b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m32349L(View view, FloatingActionButton floatingActionButton) {
            if (!m32347J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1306e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m32340m(this.f35322b, false);
                return true;
            }
            floatingActionButton.m32344v(this.f35322b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean mo6544b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f35306B;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean mo6550h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m32348K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (m32345F(view)) {
                m32349L(view, floatingActionButton);
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo6554l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i11) {
            List m6536x = coordinatorLayout.m6536x(floatingActionButton);
            int size = m6536x.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) m6536x.get(i12);
                if (view instanceof AppBarLayout) {
                    if (m32348K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m32345F(view) && m32349L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m6524O(floatingActionButton, i11);
            m32346G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: g */
        public void mo6549g(CoordinatorLayout.C1306e c1306e) {
            if (c1306e.f5820h == 0) {
                c1306e.f5820h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.FloatingActionButton_Behavior_Layout);
            this.f35323c = obtainStyledAttributes.getBoolean(AbstractC23587l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo6544b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo6544b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo6550h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo6550h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo6554l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i11) {
            return super.mo6554l(coordinatorLayout, floatingActionButton, i11);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo6549g(CoordinatorLayout.C1306e c1306e) {
            super.mo6549g(c1306e);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes3.dex */
    public class C6316a implements AbstractC6323d.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC6317b f35324a;

        C6316a(AbstractC6317b abstractC6317b) {
            this.f35324a = abstractC6317b;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.j
        /* renamed from: a */
        public void mo32353a() {
            this.f35324a.mo31805b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.j
        /* renamed from: b */
        public void mo32354b() {
            this.f35324a.mo31804a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6317b {
        /* renamed from: a */
        public void mo31804a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo31805b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes3.dex */
    public class C6318c implements InterfaceC30798b {
        C6318c() {
        }

        @Override // p671y6.InterfaceC30798b
        /* renamed from: a */
        public void mo32355a(int i11, int i12, int i13, int i14) {
            FloatingActionButton.this.f35306B.set(i11, i12, i13, i14);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i11 + floatingActionButton.f35319y, i12 + FloatingActionButton.this.f35319y, i13 + FloatingActionButton.this.f35319y, i14 + FloatingActionButton.this.f35319y);
        }

        @Override // p671y6.InterfaceC30798b
        /* renamed from: b */
        public boolean mo32356b() {
            return FloatingActionButton.this.f35305A;
        }

        @Override // p671y6.InterfaceC30798b
        /* renamed from: c */
        public void mo32357c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes3.dex */
    class C6319d implements AbstractC6323d.i {

        /* renamed from: a */
        private final InterfaceC24051k f35327a;

        C6319d(InterfaceC24051k interfaceC24051k) {
            this.f35327a = interfaceC24051k;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.i
        /* renamed from: a */
        public void mo32358a() {
            this.f35327a.mo31800b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.i
        /* renamed from: b */
        public void mo32359b() {
            this.f35327a.mo31799a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof C6319d) && ((C6319d) obj).f35327a.equals(this.f35327a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35327a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.floatingActionButtonStyle);
    }

    private AbstractC6323d getImpl() {
        if (this.f35310F == null) {
            this.f35310F = m32327h();
        }
        return this.f35310F;
    }

    /* renamed from: h */
    private AbstractC6323d m32327h() {
        return new C6324e(this, new C6318c());
    }

    /* renamed from: k */
    private int m32328k(int i11) {
        int i12 = this.f35318x;
        if (i12 != 0) {
            return i12;
        }
        Resources resources = getResources();
        if (i11 != -1) {
            if (i11 != 1) {
                return resources.getDimensionPixelSize(AbstractC23579d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(AbstractC23579d.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m32328k(1);
        }
        return m32328k(0);
    }

    /* renamed from: q */
    private void m32329q(Rect rect) {
        int i11 = rect.left;
        Rect rect2 = this.f35306B;
        rect.left = i11 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: r */
    private void m32330r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f35313s;
        if (colorStateList == null) {
            AbstractC1414a.m7185c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f35314t;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1167f.m5529e(colorForState, mode));
    }

    /* renamed from: s */
    private static int m32331s(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i11;
        }
        return Math.min(i11, size);
    }

    /* renamed from: w */
    private AbstractC6323d.j m32332w(AbstractC6317b abstractC6317b) {
        if (abstractC6317b == null) {
            return null;
        }
        return new C6316a(abstractC6317b);
    }

    @Override // p519t6.InterfaceC26491a
    /* renamed from: a */
    public boolean mo32333a() {
        return this.f35309E.m136460c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo32391D(getDrawableState());
    }

    /* renamed from: e */
    public void m32334e(Animator.AnimatorListener animatorListener) {
        getImpl().m32416d(animatorListener);
    }

    /* renamed from: f */
    public void m32335f(Animator.AnimatorListener animatorListener) {
        getImpl().m32418e(animatorListener);
    }

    /* renamed from: g */
    public void m32336g(InterfaceC24051k interfaceC24051k) {
        getImpl().m32420f(new C6319d(interfaceC24051k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f35311q;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f35312r;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1303b
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo32423m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m32426p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m32428s();
    }

    public Drawable getContentBackground() {
        return getImpl().m32422j();
    }

    public int getCustomSize() {
        return this.f35318x;
    }

    public int getExpandedComponentIdHint() {
        return this.f35309E.m136459b();
    }

    public C24048h getHideMotionSpec() {
        return getImpl().m32425o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f35315u;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f35315u;
    }

    public C31694m getShapeAppearanceModel() {
        return (C31694m) AbstractC1487i.m7492g(getImpl().m32429t());
    }

    public C24048h getShowMotionSpec() {
        return getImpl().m32430u();
    }

    public int getSize() {
        return this.f35317w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m32328k(this.f35317w);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f35313s;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f35314t;
    }

    public boolean getUseCompatPadding() {
        return this.f35305A;
    }

    /* renamed from: i */
    public boolean m32337i(Rect rect) {
        if (!AbstractC1579n0.m7865e0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m32329q(rect);
        return true;
    }

    /* renamed from: j */
    public void m32338j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m32329q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo32435z();
    }

    /* renamed from: l */
    public void m32339l(AbstractC6317b abstractC6317b) {
        m32340m(abstractC6317b, true);
    }

    /* renamed from: m */
    void m32340m(AbstractC6317b abstractC6317b, boolean z11) {
        getImpl().m32431v(m32332w(abstractC6317b), z11);
    }

    /* renamed from: n */
    public boolean m32341n() {
        return getImpl().m32433x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m32388A();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m32390C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int sizeDimension = getSizeDimension();
        this.f35319y = (sizeDimension - this.f35320z) / 2;
        getImpl().m32419e0();
        int min = Math.min(m32331s(sizeDimension, i11), m32331s(sizeDimension, i12));
        Rect rect = this.f35306B;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m8457a());
        this.f35309E.m136461d((Bundle) AbstractC1487i.m7492g(extendableSavedState.f35877r.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f35877r.put("expandableWidgetHelper", this.f35309E.m136462e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m32337i(this.f35307C) && !this.f35307C.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public boolean m32342p() {
        return getImpl().m32434y();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f35311q != colorStateList) {
            this.f35311q = colorStateList;
            getImpl().m32398K(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f35312r != mode) {
            this.f35312r = mode;
            getImpl().m32399L(mode);
        }
    }

    public void setCompatElevation(float f11) {
        getImpl().m32400M(f11);
    }

    public void setCompatElevationResource(int i11) {
        setCompatElevation(getResources().getDimension(i11));
    }

    public void setCompatHoveredFocusedTranslationZ(float f11) {
        getImpl().m32403P(f11);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i11) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i11));
    }

    public void setCompatPressedTranslationZ(float f11) {
        getImpl().m32407T(f11);
    }

    public void setCompatPressedTranslationZResource(int i11) {
        setCompatPressedTranslationZ(getResources().getDimension(i11));
    }

    public void setCustomSize(int i11) {
        if (i11 >= 0) {
            if (i11 != this.f35318x) {
                this.f35318x = i11;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        getImpl().m32421f0(f11);
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        if (z11 != getImpl().m32424n()) {
            getImpl().m32401N(z11);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i11) {
        this.f35309E.m136463f(i11);
    }

    public void setHideMotionSpec(C24048h c24048h) {
        getImpl().m32402O(c24048h);
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(C24048h.m125925d(getContext(), i11));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m32417d0();
            if (this.f35313s != null) {
                m32330r();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.f35308D.m5559g(i11);
        m32330r();
    }

    public void setRippleColor(int i11) {
        setRippleColor(ColorStateList.valueOf(i11));
    }

    @Override // android.view.View
    public void setScaleX(float f11) {
        super.setScaleX(f11);
        getImpl().m32395H();
    }

    @Override // android.view.View
    public void setScaleY(float f11) {
        super.setScaleY(f11);
        getImpl().m32395H();
    }

    public void setShadowPaddingEnabled(boolean z11) {
        getImpl().m32409V(z11);
    }

    @Override // p706z6.InterfaceC31697p
    public void setShapeAppearanceModel(C31694m c31694m) {
        getImpl().m32410W(c31694m);
    }

    public void setShowMotionSpec(C24048h c24048h) {
        getImpl().m32411X(c24048h);
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(C24048h.m125925d(getContext(), i11));
    }

    public void setSize(int i11) {
        this.f35318x = 0;
        if (i11 != this.f35317w) {
            this.f35317w = i11;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f35313s != colorStateList) {
            this.f35313s = colorStateList;
            m32330r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f35314t != mode) {
            this.f35314t = mode;
            m32330r();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f11) {
        super.setTranslationX(f11);
        getImpl().m32396I();
    }

    @Override // android.view.View
    public void setTranslationY(float f11) {
        super.setTranslationY(f11);
        getImpl().m32396I();
    }

    @Override // android.view.View
    public void setTranslationZ(float f11) {
        super.setTranslationZ(f11);
        getImpl().m32396I();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f35305A != z11) {
            this.f35305A = z11;
            getImpl().mo32389B();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    /* renamed from: u */
    public void m32343u(AbstractC6317b abstractC6317b) {
        m32344v(abstractC6317b, true);
    }

    /* renamed from: v */
    void m32344v(AbstractC6317b abstractC6317b, boolean z11) {
        getImpl().m32414b0(m32332w(abstractC6317b), z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r6), attributeSet, i11);
        int i12 = f35304G;
        this.f35306B = new Rect();
        this.f35307C = new Rect();
        Context context2 = getContext();
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.FloatingActionButton, i11, i12, new int[0]);
        this.f35311q = AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.FloatingActionButton_backgroundTint);
        this.f35312r = AbstractC6359z.m32654i(m32639h.getInt(AbstractC23587l.FloatingActionButton_backgroundTintMode, -1), null);
        this.f35315u = AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.FloatingActionButton_rippleColor);
        this.f35317w = m32639h.getInt(AbstractC23587l.FloatingActionButton_fabSize, -1);
        this.f35318x = m32639h.getDimensionPixelSize(AbstractC23587l.FloatingActionButton_fabCustomSize, 0);
        this.f35316v = m32639h.getDimensionPixelSize(AbstractC23587l.FloatingActionButton_borderWidth, 0);
        float dimension = m32639h.getDimension(AbstractC23587l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = m32639h.getDimension(AbstractC23587l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = m32639h.getDimension(AbstractC23587l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f35305A = m32639h.getBoolean(AbstractC23587l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC23579d.mtrl_fab_min_touch_target);
        this.f35320z = m32639h.getDimensionPixelSize(AbstractC23587l.FloatingActionButton_maxImageSize, 0);
        C24048h m125924c = C24048h.m125924c(context2, m32639h, AbstractC23587l.FloatingActionButton_showMotionSpec);
        C24048h m125924c2 = C24048h.m125924c(context2, m32639h, AbstractC23587l.FloatingActionButton_hideMotionSpec);
        C31694m m152519m = C31694m.m152477g(context2, attributeSet, i11, i12, C31694m.f145586m).m152519m();
        boolean z11 = m32639h.getBoolean(AbstractC23587l.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(m32639h.getBoolean(AbstractC23587l.FloatingActionButton_android_enabled, true));
        m32639h.recycle();
        C1173h c1173h = new C1173h(this);
        this.f35308D = c1173h;
        c1173h.m5558f(attributeSet, i11);
        this.f35309E = new C26492b(this);
        getImpl().m32410W(m152519m);
        getImpl().mo32432w(this.f35311q, this.f35312r, this.f35315u, this.f35316v);
        getImpl().m32406S(dimensionPixelSize);
        getImpl().m32400M(dimension);
        getImpl().m32403P(dimension2);
        getImpl().m32407T(dimension3);
        getImpl().m32405R(this.f35320z);
        getImpl().m32411X(m125924c);
        getImpl().m32402O(m125924c2);
        getImpl().m32401N(z11);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f35315u != colorStateList) {
            this.f35315u = colorStateList;
            getImpl().mo32408U(this.f35315u);
        }
    }
}
