package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.AbstractC1640l;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p013a7.AbstractC0638a;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;
import p706z6.AbstractC31690i;
import p706z6.C31694m;
import p706z6.InterfaceC31697p;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC31697p {

    /* renamed from: E */
    private static final int[] f35026E = {R.attr.state_checkable};

    /* renamed from: F */
    private static final int[] f35027F = {R.attr.state_checked};

    /* renamed from: G */
    private static final int f35028G = AbstractC23586k.Widget_MaterialComponents_Button;

    /* renamed from: A */
    private int f35029A;

    /* renamed from: B */
    private boolean f35030B;

    /* renamed from: C */
    private boolean f35031C;

    /* renamed from: D */
    private int f35032D;

    /* renamed from: r */
    private final C6272a f35033r;

    /* renamed from: s */
    private final LinkedHashSet f35034s;

    /* renamed from: t */
    private InterfaceC6265b f35035t;

    /* renamed from: u */
    private PorterDuff.Mode f35036u;

    /* renamed from: v */
    private ColorStateList f35037v;

    /* renamed from: w */
    private Drawable f35038w;

    /* renamed from: x */
    private int f35039x;

    /* renamed from: y */
    private int f35040y;

    /* renamed from: z */
    private int f35041z;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6263a();

        /* renamed from: r */
        boolean f35042r;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6263a implements Parcelable.ClassLoaderCreator {
            C6263a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m31893b(Parcel parcel) {
            boolean z11 = true;
            if (parcel.readInt() != 1) {
                z11 = false;
            }
            this.f35042r = z11;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f35042r ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m31893b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6264a {
        /* renamed from: a */
        void mo31897a(MaterialButton materialButton, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC6265b {
        /* renamed from: a */
        void mo31898a(MaterialButton materialButton, boolean z11);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.materialButtonStyle);
    }

    /* renamed from: c */
    private boolean m31882c() {
        int i11 = this.f35032D;
        return i11 == 3 || i11 == 4;
    }

    /* renamed from: d */
    private boolean m31883d() {
        int i11 = this.f35032D;
        return i11 == 1 || i11 == 2;
    }

    /* renamed from: e */
    private boolean m31884e() {
        int i11 = this.f35032D;
        return i11 == 16 || i11 == 32;
    }

    /* renamed from: f */
    private boolean m31885f() {
        if (AbstractC1579n0.m7812G(this) == 1) {
            return true;
        }
        return false;
    }

    private String getA11yClassName() {
        Class cls;
        if (m31891b()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: h */
    private boolean m31886h() {
        C6272a c6272a = this.f35033r;
        if (c6272a != null && !c6272a.m31954o()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m31887j() {
        if (m31883d()) {
            AbstractC1640l.m8419j(this, this.f35038w, null, null, null);
        } else if (m31882c()) {
            AbstractC1640l.m8419j(this, null, null, this.f35038w, null);
        } else if (m31884e()) {
            AbstractC1640l.m8419j(this, null, this.f35038w, null, null);
        }
    }

    /* renamed from: k */
    private void m31888k(boolean z11) {
        Drawable drawable = this.f35038w;
        if (drawable != null) {
            Drawable mutate = AbstractC1414a.m7200r(drawable).mutate();
            this.f35038w = mutate;
            AbstractC1414a.m7197o(mutate, this.f35037v);
            PorterDuff.Mode mode = this.f35036u;
            if (mode != null) {
                AbstractC1414a.m7198p(this.f35038w, mode);
            }
            int i11 = this.f35039x;
            if (i11 == 0) {
                i11 = this.f35038w.getIntrinsicWidth();
            }
            int i12 = this.f35039x;
            if (i12 == 0) {
                i12 = this.f35038w.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f35038w;
            int i13 = this.f35040y;
            int i14 = this.f35041z;
            drawable2.setBounds(i13, i14, i11 + i13, i12 + i14);
        }
        if (z11) {
            m31887j();
            return;
        }
        Drawable[] m8410a = AbstractC1640l.m8410a(this);
        Drawable drawable3 = m8410a[0];
        Drawable drawable4 = m8410a[1];
        Drawable drawable5 = m8410a[2];
        if ((m31883d() && drawable3 != this.f35038w) || ((m31882c() && drawable5 != this.f35038w) || (m31884e() && drawable4 != this.f35038w))) {
            m31887j();
        }
    }

    /* renamed from: l */
    private void m31889l(int i11, int i12) {
        if (this.f35038w != null && getLayout() != null) {
            if (!m31883d() && !m31882c()) {
                if (m31884e()) {
                    this.f35040y = 0;
                    if (this.f35032D == 16) {
                        this.f35041z = 0;
                        m31888k(false);
                        return;
                    }
                    int i13 = this.f35039x;
                    if (i13 == 0) {
                        i13 = this.f35038w.getIntrinsicHeight();
                    }
                    int textHeight = (((((i12 - getTextHeight()) - getPaddingTop()) - i13) - this.f35029A) - getPaddingBottom()) / 2;
                    if (this.f35041z != textHeight) {
                        this.f35041z = textHeight;
                        m31888k(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f35041z = 0;
            int i14 = this.f35032D;
            boolean z11 = true;
            if (i14 != 1 && i14 != 3) {
                int i15 = this.f35039x;
                if (i15 == 0) {
                    i15 = this.f35038w.getIntrinsicWidth();
                }
                int textWidth = (((((i11 - getTextWidth()) - AbstractC1579n0.m7818J(this)) - i15) - this.f35029A) - AbstractC1579n0.m7820K(this)) / 2;
                boolean m31885f = m31885f();
                if (this.f35032D != 4) {
                    z11 = false;
                }
                if (m31885f != z11) {
                    textWidth = -textWidth;
                }
                if (this.f35040y != textWidth) {
                    this.f35040y = textWidth;
                    m31888k(false);
                    return;
                }
                return;
            }
            this.f35040y = 0;
            m31888k(false);
        }
    }

    /* renamed from: a */
    public void m31890a(InterfaceC6264a interfaceC6264a) {
        this.f35034s.add(interfaceC6264a);
    }

    /* renamed from: b */
    public boolean m31891b() {
        C6272a c6272a = this.f35033r;
        if (c6272a != null && c6272a.m31955p()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m31886h()) {
            return this.f35033r.m31943b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f35038w;
    }

    public int getIconGravity() {
        return this.f35032D;
    }

    public int getIconPadding() {
        return this.f35029A;
    }

    public int getIconSize() {
        return this.f35039x;
    }

    public ColorStateList getIconTint() {
        return this.f35037v;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f35036u;
    }

    public int getInsetBottom() {
        return this.f35033r.m31944c();
    }

    public int getInsetTop() {
        return this.f35033r.m31945d();
    }

    public ColorStateList getRippleColor() {
        if (m31886h()) {
            return this.f35033r.m31948h();
        }
        return null;
    }

    public C31694m getShapeAppearanceModel() {
        if (m31886h()) {
            return this.f35033r.m31949i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m31886h()) {
            return this.f35033r.m31950j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m31886h()) {
            return this.f35033r.m31951k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (m31886h()) {
            return this.f35033r.m31952l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m31886h()) {
            return this.f35033r.m31953m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: i */
    public void m31892i(InterfaceC6264a interfaceC6264a) {
        this.f35034s.remove(interfaceC6264a);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f35030B;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m31886h()) {
            AbstractC31690i.m152470f(this, this.f35033r.m31947f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (m31891b()) {
            View.mergeDrawableStates(onCreateDrawableState, f35026E);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f35027F);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m31891b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C6272a c6272a;
        super.onLayout(z11, i11, i12, i13, i14);
        if (Build.VERSION.SDK_INT == 21 && (c6272a = this.f35033r) != null) {
            c6272a.m31942H(i14 - i12, i13 - i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        setChecked(savedState.f35042r);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35042r = this.f35030B;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m31889l(i11, i12);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        m31889l(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (m31886h()) {
            this.f35033r.m31957r(i11);
        } else {
            super.setBackgroundColor(i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m31886h()) {
            if (drawable != getBackground()) {
                this.f35033r.m31958s();
                super.setBackgroundDrawable(drawable);
                return;
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = AbstractC19694b.m103336d(getContext(), i11);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z11) {
        if (m31886h()) {
            this.f35033r.m31959t(z11);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (m31891b() && isEnabled() && this.f35030B != z11) {
            this.f35030B = z11;
            refreshDrawableState();
            if (this.f35031C) {
                return;
            }
            this.f35031C = true;
            Iterator it = this.f35034s.iterator();
            while (it.hasNext()) {
                ((InterfaceC6264a) it.next()).mo31897a(this, this.f35030B);
            }
            this.f35031C = false;
        }
    }

    public void setCornerRadius(int i11) {
        if (m31886h()) {
            this.f35033r.m31960u(i11);
        }
    }

    public void setCornerRadiusResource(int i11) {
        if (m31886h()) {
            setCornerRadius(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        if (m31886h()) {
            this.f35033r.m31947f().m152441b0(f11);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f35038w != drawable) {
            this.f35038w = drawable;
            m31888k(true);
            m31889l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i11) {
        if (this.f35032D != i11) {
            this.f35032D = i11;
            m31889l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i11) {
        if (this.f35029A != i11) {
            this.f35029A = i11;
            setCompoundDrawablePadding(i11);
        }
    }

    public void setIconResource(int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = AbstractC19694b.m103336d(getContext(), i11);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i11) {
        if (i11 >= 0) {
            if (this.f35039x != i11) {
                this.f35039x = i11;
                m31888k(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f35037v != colorStateList) {
            this.f35037v = colorStateList;
            m31888k(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f35036u != mode) {
            this.f35036u = mode;
            m31888k(false);
        }
    }

    public void setIconTintResource(int i11) {
        setIconTint(AbstractC19694b.m103335c(getContext(), i11));
    }

    public void setInsetBottom(int i11) {
        this.f35033r.m31961v(i11);
    }

    public void setInsetTop(int i11) {
        this.f35033r.m31962w(i11);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC6265b interfaceC6265b) {
        this.f35035t = interfaceC6265b;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        InterfaceC6265b interfaceC6265b = this.f35035t;
        if (interfaceC6265b != null) {
            interfaceC6265b.mo31898a(this, z11);
        }
        super.setPressed(z11);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m31886h()) {
            this.f35033r.m31963x(colorStateList);
        }
    }

    public void setRippleColorResource(int i11) {
        if (m31886h()) {
            setRippleColor(AbstractC19694b.m103335c(getContext(), i11));
        }
    }

    @Override // p706z6.InterfaceC31697p
    public void setShapeAppearanceModel(C31694m c31694m) {
        if (m31886h()) {
            this.f35033r.m31964y(c31694m);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z11) {
        if (m31886h()) {
            this.f35033r.m31965z(z11);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m31886h()) {
            this.f35033r.m31938A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i11) {
        if (m31886h()) {
            setStrokeColor(AbstractC19694b.m103335c(getContext(), i11));
        }
    }

    public void setStrokeWidth(int i11) {
        if (m31886h()) {
            this.f35033r.m31939B(i11);
        }
    }

    public void setStrokeWidthResource(int i11) {
        if (m31886h()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m31886h()) {
            this.f35033r.m31940C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m31886h()) {
            this.f35033r.m31941D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f35030B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r6), attributeSet, i11);
        int i12 = f35028G;
        this.f35034s = new LinkedHashSet();
        this.f35030B = false;
        this.f35031C = false;
        Context context2 = getContext();
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.MaterialButton, i11, i12, new int[0]);
        this.f35029A = m32639h.getDimensionPixelSize(AbstractC23587l.MaterialButton_iconPadding, 0);
        this.f35036u = AbstractC6359z.m32654i(m32639h.getInt(AbstractC23587l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f35037v = AbstractC28774c.m143973a(getContext(), m32639h, AbstractC23587l.MaterialButton_iconTint);
        this.f35038w = AbstractC28774c.m143976d(getContext(), m32639h, AbstractC23587l.MaterialButton_icon);
        this.f35032D = m32639h.getInteger(AbstractC23587l.MaterialButton_iconGravity, 1);
        this.f35039x = m32639h.getDimensionPixelSize(AbstractC23587l.MaterialButton_iconSize, 0);
        C6272a c6272a = new C6272a(this, C31694m.m152475e(context2, attributeSet, i11, i12).m152519m());
        this.f35033r = c6272a;
        c6272a.m31956q(m32639h);
        m32639h.recycle();
        setCompoundDrawablePadding(this.f35029A);
        m31888k(this.f35038w != null);
    }
}
