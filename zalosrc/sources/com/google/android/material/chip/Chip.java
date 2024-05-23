package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import com.google.android.material.chip.C6284b;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p013a7.AbstractC0638a;
import p337m1.AbstractC22710a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23585j;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.C24048h;
import p599w6.AbstractC28774c;
import p599w6.AbstractC28777f;
import p599w6.C28775d;
import p634x6.AbstractC29387b;
import p706z6.AbstractC31690i;
import p706z6.C31694m;
import p706z6.InterfaceC31697p;

/* loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements C6284b.a, InterfaceC31697p {

    /* renamed from: I */
    private static final int f35117I = AbstractC23586k.Widget_MaterialComponents_Chip_Action;

    /* renamed from: J */
    private static final Rect f35118J = new Rect();

    /* renamed from: K */
    private static final int[] f35119K = {R.attr.state_selected};

    /* renamed from: L */
    private static final int[] f35120L = {R.attr.state_checkable};

    /* renamed from: A */
    private boolean f35121A;

    /* renamed from: B */
    private boolean f35122B;

    /* renamed from: C */
    private int f35123C;

    /* renamed from: D */
    private int f35124D;

    /* renamed from: E */
    private final C6278c f35125E;

    /* renamed from: F */
    private final Rect f35126F;

    /* renamed from: G */
    private final RectF f35127G;

    /* renamed from: H */
    private final AbstractC28777f f35128H;

    /* renamed from: s */
    private C6284b f35129s;

    /* renamed from: t */
    private InsetDrawable f35130t;

    /* renamed from: u */
    private RippleDrawable f35131u;

    /* renamed from: v */
    private View.OnClickListener f35132v;

    /* renamed from: w */
    private CompoundButton.OnCheckedChangeListener f35133w;

    /* renamed from: x */
    private boolean f35134x;

    /* renamed from: y */
    private boolean f35135y;

    /* renamed from: z */
    private boolean f35136z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes3.dex */
    class C6276a extends AbstractC28777f {
        C6276a() {
        }

        @Override // p599w6.AbstractC28777f
        /* renamed from: a */
        public void mo32057a(int i11) {
        }

        @Override // p599w6.AbstractC28777f
        /* renamed from: b */
        public void mo32058b(Typeface typeface, boolean z11) {
            CharSequence text;
            Chip chip = Chip.this;
            if (chip.f35129s.m32158S2()) {
                text = Chip.this.f35129s.m32198o1();
            } else {
                text = Chip.this.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes3.dex */
    public class C6277b extends ViewOutlineProvider {
        C6277b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f35129s != null) {
                Chip.this.f35129s.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes3.dex */
    public class C6278c extends AbstractC22710a {
        C6278c(Chip chip) {
            super(chip);
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: B */
        protected int mo32059B(float f11, float f12) {
            if (Chip.this.m32044n() && Chip.this.getCloseIconTouchBounds().contains(f11, f12)) {
                return 1;
            }
            return 0;
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: C */
        protected void mo32060C(List list) {
            list.add(0);
            if (Chip.this.m32044n() && Chip.this.m32054u() && Chip.this.f35132v != null) {
                list.add(1);
            }
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: L */
        protected boolean mo32061L(int i11, int i12, Bundle bundle) {
            if (i12 == 16) {
                if (i11 == 0) {
                    return Chip.this.performClick();
                }
                if (i11 == 1) {
                    return Chip.this.m32055v();
                }
                return false;
            }
            return false;
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: O */
        protected void mo32062O(C1507g0 c1507g0) {
            String str;
            c1507g0.m7615b0(Chip.this.m32053s());
            c1507g0.m7620e0(Chip.this.isClickable());
            if (!Chip.this.m32053s() && !Chip.this.isClickable()) {
                c1507g0.m7619d0("android.view.View");
            } else {
                if (Chip.this.m32053s()) {
                    str = "android.widget.CompoundButton";
                } else {
                    str = "android.widget.Button";
                }
                c1507g0.m7619d0(str);
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c1507g0.m7592E0(text);
            } else {
                c1507g0.m7624h0(text);
            }
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: P */
        protected void mo32063P(int i11, C1507g0 c1507g0) {
            CharSequence charSequence = "";
            if (i11 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    c1507g0.m7624h0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i12 = AbstractC23585j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    c1507g0.m7624h0(context.getString(i12, objArr).trim());
                }
                c1507g0.m7610Y(Chip.this.getCloseIconTouchBoundsInt());
                c1507g0.m7614b(C1507g0.a.f6447i);
                c1507g0.m7626i0(Chip.this.isEnabled());
                return;
            }
            c1507g0.m7624h0("");
            c1507g0.m7610Y(Chip.f35118J);
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: Q */
        protected void mo32064Q(int i11, boolean z11) {
            if (i11 == 1) {
                Chip.this.f35121A = z11;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.chipStyle);
    }

    /* renamed from: A */
    private void m32028A() {
        if (AbstractC29387b.f135923a) {
            m32029B();
            return;
        }
        this.f35129s.m32155R2(true);
        AbstractC1579n0.m7807D0(this, getBackgroundDrawable());
        m32030C();
        m32042l();
    }

    /* renamed from: B */
    private void m32029B() {
        this.f35131u = new RippleDrawable(AbstractC29387b.m146554d(this.f35129s.m32194m1()), getBackgroundDrawable(), null);
        this.f35129s.m32155R2(false);
        AbstractC1579n0.m7807D0(this, this.f35131u);
        m32030C();
    }

    /* renamed from: C */
    private void m32030C() {
        C6284b c6284b;
        if (!TextUtils.isEmpty(getText()) && (c6284b = this.f35129s) != null) {
            int m32150Q0 = (int) (c6284b.m32150Q0() + this.f35129s.m32202q1() + this.f35129s.m32215x0());
            int m32163V0 = (int) (this.f35129s.m32163V0() + this.f35129s.m32204r1() + this.f35129s.m32207t0());
            if (this.f35130t != null) {
                Rect rect = new Rect();
                this.f35130t.getPadding(rect);
                m32163V0 += rect.left;
                m32150Q0 += rect.right;
            }
            AbstractC1579n0.m7837S0(this, m32163V0, getPaddingTop(), m32150Q0, getPaddingBottom());
        }
    }

    /* renamed from: D */
    private void m32031D() {
        TextPaint paint = getPaint();
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            paint.drawableState = c6284b.getState();
        }
        C28775d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m143990j(getContext(), paint, this.f35128H);
        }
    }

    /* renamed from: E */
    private void m32032E(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f35127G.setEmpty();
        if (m32044n() && this.f35132v != null) {
            this.f35129s.m32183f1(this.f35127G);
        }
        return this.f35127G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f35126F.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f35126F;
    }

    private C28775d getTextAppearance() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32200p1();
        }
        return null;
    }

    /* renamed from: i */
    private void m32040i(C6284b c6284b) {
        c6284b.m32214w2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: j */
    private int[] m32041j() {
        ?? isEnabled = isEnabled();
        int i11 = isEnabled;
        if (this.f35121A) {
            i11 = isEnabled + 1;
        }
        int i12 = i11;
        if (this.f35136z) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (this.f35135y) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (isChecked()) {
            i14 = i13 + 1;
        }
        int[] iArr = new int[i14];
        int i15 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i15 = 1;
        }
        if (this.f35121A) {
            iArr[i15] = 16842908;
            i15++;
        }
        if (this.f35136z) {
            iArr[i15] = 16843623;
            i15++;
        }
        if (this.f35135y) {
            iArr[i15] = 16842919;
            i15++;
        }
        if (isChecked()) {
            iArr[i15] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m32042l() {
        if (getBackgroundDrawable() == this.f35130t && this.f35129s.getCallback() == null) {
            this.f35129s.setCallback(this.f35130t);
        }
    }

    /* renamed from: m */
    private boolean m32043m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC22710a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f35125E)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC22710a.class.getDeclaredMethod("X", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f35125E, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m32044n() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null && c6284b.m32169Y0() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m32045p(Context context, AttributeSet attributeSet, int i11) {
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.Chip, i11, f35117I, new int[0]);
        this.f35122B = m32639h.getBoolean(AbstractC23587l.Chip_ensureMinTouchTargetSize, false);
        this.f35124D = (int) Math.ceil(m32639h.getDimension(AbstractC23587l.Chip_chipMinTouchTargetSize, (float) Math.ceil(AbstractC6359z.m32648c(getContext(), 48))));
        m32639h.recycle();
    }

    /* renamed from: q */
    private void m32046q() {
        setOutlineProvider(new C6277b());
    }

    /* renamed from: r */
    private void m32047r(int i11, int i12, int i13, int i14) {
        this.f35130t = new InsetDrawable((Drawable) this.f35129s, i11, i12, i13, i14);
    }

    private void setCloseIconHovered(boolean z11) {
        if (this.f35136z != z11) {
            this.f35136z = z11;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z11) {
        if (this.f35135y != z11) {
            this.f35135y = z11;
            refreshDrawableState();
        }
    }

    /* renamed from: w */
    private void m32048w() {
        if (this.f35130t != null) {
            this.f35130t = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m32028A();
        }
    }

    /* renamed from: y */
    private void m32049y(C6284b c6284b) {
        if (c6284b != null) {
            c6284b.m32214w2(null);
        }
    }

    /* renamed from: z */
    private void m32050z() {
        if (m32044n() && m32054u() && this.f35132v != null) {
            AbstractC1579n0.m7801A0(this, this.f35125E);
        } else {
            AbstractC1579n0.m7801A0(this, null);
        }
    }

    @Override // com.google.android.material.chip.C6284b.a
    /* renamed from: a */
    public void mo32051a() {
        m32052k(this.f35124D);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!m32043m(motionEvent) && !this.f35125E.m117456v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f35125E.m117457w(keyEvent) && this.f35125E.m117445A() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C6284b c6284b = this.f35129s;
        if (c6284b != null && c6284b.m32213w1() && this.f35129s.m32206s2(m32041j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f35130t;
        return insetDrawable == null ? this.f35129s : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32138M0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32141N0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32144O0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C6284b c6284b = this.f35129s;
        if (c6284b == null) {
            return 0.0f;
        }
        return Math.max(0.0f, c6284b.m32147P0());
    }

    public Drawable getChipDrawable() {
        return this.f35129s;
    }

    public float getChipEndPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32150Q0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32153R0();
        }
        return null;
    }

    public float getChipIconSize() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32156S0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32159T0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32161U0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32163V0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32165W0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32167X0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32169Y0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32171Z0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32173a1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32175b1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32177c1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32181e1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32187i1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f35125E.m117445A() != 1 && this.f35125E.m117458x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public C24048h getHideMotionSpec() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32188j1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32190k1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32192l1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32194m1();
        }
        return null;
    }

    public C31694m getShapeAppearanceModel() {
        return this.f35129s.m152427F();
    }

    public C24048h getShowMotionSpec() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32196n1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32202q1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            return c6284b.m32204r1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean m32052k(int i11) {
        int i12;
        this.f35124D = i11;
        int i13 = 0;
        if (!m32056x()) {
            if (this.f35130t != null) {
                m32048w();
            } else {
                m32028A();
            }
            return false;
        }
        int max = Math.max(0, i11 - this.f35129s.getIntrinsicHeight());
        int max2 = Math.max(0, i11 - this.f35129s.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f35130t != null) {
                m32048w();
            } else {
                m32028A();
            }
            return false;
        }
        if (max2 > 0) {
            i12 = max2 / 2;
        } else {
            i12 = 0;
        }
        if (max > 0) {
            i13 = max / 2;
        }
        if (this.f35130t != null) {
            Rect rect = new Rect();
            this.f35130t.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                m32028A();
                return true;
            }
        }
        if (getMinHeight() != i11) {
            setMinHeight(i11);
        }
        if (getMinWidth() != i11) {
            setMinWidth(i11);
        }
        m32047r(i12, i13, i12, i13);
        m32028A();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152470f(this, this.f35129s);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f35119K);
        }
        if (m32053s()) {
            View.mergeDrawableStates(onCreateDrawableState, f35120L);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        this.f35125E.m117449K(z11, i11, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!m32053s() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            if (m32053s()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            accessibilityNodeInfo.setClassName(str);
        }
        accessibilityNodeInfo.setCheckable(m32053s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C1507g0 m7571I0 = C1507g0.m7571I0(accessibilityNodeInfo);
            if (chipGroup.mo32075c()) {
                i11 = chipGroup.m32078p(this);
            } else {
                i11 = -1;
            }
            m7571I0.m7623g0(C1507g0.c.m7662a(chipGroup.m32457b(this), 1, i11, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i11) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), ZAbstractBase.ZVU_BLEND_PERCENTAGE);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        if (this.f35123C != i11) {
            this.f35123C = i11;
            m32030C();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:            if (r0 != 3) goto L23;     */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f35135y) {
                        if (contains) {
                            return true;
                        }
                        setCloseIconPressed(false);
                        return true;
                    }
                }
            } else if (this.f35135y) {
                m32055v();
                z11 = true;
                setCloseIconPressed(false);
                if (z11) {
                    return true;
                }
            }
            z11 = false;
            setCloseIconPressed(false);
            if (z11) {
            }
        } else if (contains) {
            setCloseIconPressed(true);
            return true;
        }
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean m32053s() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null && c6284b.m32211v1()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35131u) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35131u) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i11) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32122E1(z11);
        }
    }

    public void setCheckableResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32124F1(i11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C6284b c6284b = this.f35129s;
        if (c6284b == null) {
            this.f35134x = z11;
            return;
        }
        if (c6284b.m32211v1()) {
            boolean isChecked = isChecked();
            super.setChecked(z11);
            if (isChecked != z11 && (onCheckedChangeListener = this.f35133w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z11);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32126G1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z11) {
        setCheckedIconVisible(z11);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i11) {
        setCheckedIconVisible(i11);
    }

    public void setCheckedIconResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32128H1(i11);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32130I1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32132J1(i11);
        }
    }

    public void setCheckedIconVisible(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32134K1(i11);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32139M1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32142N1(i11);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32145O1(f11);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32148P1(i11);
        }
    }

    public void setChipDrawable(C6284b c6284b) {
        C6284b c6284b2 = this.f35129s;
        if (c6284b2 != c6284b) {
            m32049y(c6284b2);
            this.f35129s = c6284b;
            c6284b.m32129H2(false);
            m32040i(this.f35129s);
            m32052k(this.f35124D);
        }
    }

    public void setChipEndPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32151Q1(f11);
        }
    }

    public void setChipEndPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32154R1(i11);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32157S1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z11) {
        setChipIconVisible(z11);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i11) {
        setChipIconVisible(i11);
    }

    public void setChipIconResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32160T1(i11);
        }
    }

    public void setChipIconSize(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32162U1(f11);
        }
    }

    public void setChipIconSizeResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32164V1(i11);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32166W1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32168X1(i11);
        }
    }

    public void setChipIconVisible(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32170Y1(i11);
        }
    }

    public void setChipMinHeight(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32174a2(f11);
        }
    }

    public void setChipMinHeightResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32176b2(i11);
        }
    }

    public void setChipStartPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32178c2(f11);
        }
    }

    public void setChipStartPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32180d2(i11);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32182e2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32184f2(i11);
        }
    }

    public void setChipStrokeWidth(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32185g2(f11);
        }
    }

    public void setChipStrokeWidthResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32186h2(i11);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i11) {
        setText(getResources().getString(i11));
    }

    public void setCloseIcon(Drawable drawable) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32189j2(drawable);
        }
        m32050z();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32191k2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z11) {
        setCloseIconVisible(z11);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i11) {
        setCloseIconVisible(i11);
    }

    public void setCloseIconEndPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32193l2(f11);
        }
    }

    public void setCloseIconEndPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32195m2(i11);
        }
    }

    public void setCloseIconResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32197n2(i11);
        }
        m32050z();
    }

    public void setCloseIconSize(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32199o2(f11);
        }
    }

    public void setCloseIconSizeResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32201p2(i11);
        }
    }

    public void setCloseIconStartPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32203q2(f11);
        }
    }

    public void setCloseIconStartPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32205r2(i11);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32209t2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32210u2(i11);
        }
    }

    public void setCloseIconVisible(int i11) {
        setCloseIconVisible(getResources().getBoolean(i11));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m152441b0(f11);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f35129s == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C6284b c6284b = this.f35129s;
            if (c6284b != null) {
                c6284b.m32217x2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        this.f35122B = z11;
        m32052k(this.f35124D);
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        if (i11 == 8388627) {
            super.setGravity(i11);
        }
    }

    public void setHideMotionSpec(C24048h c24048h) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32218y2(c24048h);
        }
    }

    public void setHideMotionSpecResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32219z2(i11);
        }
    }

    public void setIconEndPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32117A2(f11);
        }
    }

    public void setIconEndPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32118B2(i11);
        }
    }

    public void setIconStartPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32120C2(f11);
        }
    }

    public void setIconStartPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32121D2(i11);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        if (this.f35129s == null) {
            return;
        }
        super.setLayoutDirection(i11);
    }

    @Override // android.widget.TextView
    public void setLines(int i11) {
        if (i11 <= 1) {
            super.setLines(i11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        if (i11 <= 1) {
            super.setMaxLines(i11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i11) {
        super.setMaxWidth(i11);
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32123E2(i11);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i11) {
        if (i11 <= 1) {
            super.setMinLines(i11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f35133w = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f35132v = onClickListener;
        m32050z();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32125F2(colorStateList);
        }
        if (!this.f35129s.m32208t1()) {
            m32029B();
        }
    }

    public void setRippleColorResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32127G2(i11);
            if (!this.f35129s.m32208t1()) {
                m32029B();
            }
        }
    }

    @Override // p706z6.InterfaceC31697p
    public void setShapeAppearanceModel(C31694m c31694m) {
        this.f35129s.setShapeAppearanceModel(c31694m);
    }

    public void setShowMotionSpec(C24048h c24048h) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32131I2(c24048h);
        }
    }

    public void setShowMotionSpecResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32133J2(i11);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z11) {
        if (z11) {
            super.setSingleLine(z11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C6284b c6284b = this.f35129s;
        if (c6284b == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c6284b.m32158S2()) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C6284b c6284b2 = this.f35129s;
        if (c6284b2 != null) {
            c6284b2.m32135K2(charSequence);
        }
    }

    public void setTextAppearance(C28775d c28775d) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32137L2(c28775d);
        }
        m32031D();
    }

    public void setTextAppearanceResource(int i11) {
        setTextAppearance(getContext(), i11);
    }

    public void setTextEndPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32143N2(f11);
        }
    }

    public void setTextEndPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32146O2(i11);
        }
    }

    public void setTextStartPadding(float f11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32149P2(f11);
        }
    }

    public void setTextStartPaddingResource(int i11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32152Q2(i11);
        }
    }

    /* renamed from: u */
    public boolean m32054u() {
        C6284b c6284b = this.f35129s;
        if (c6284b != null && c6284b.m32216x1()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean m32055v() {
        boolean z11 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f35132v;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z11 = true;
        }
        this.f35125E.m117454W(1, 1);
        return z11;
    }

    /* renamed from: x */
    public boolean m32056x() {
        return this.f35122B;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f35117I;
        this.f35126F = new Rect();
        this.f35127G = new RectF();
        this.f35128H = new C6276a();
        Context context2 = getContext();
        m32032E(attributeSet);
        C6284b m32085C0 = C6284b.m32085C0(context2, attributeSet, i11, i12);
        m32045p(context2, attributeSet, i11);
        setChipDrawable(m32085C0);
        m32085C0.m152441b0(AbstractC1579n0.m7800A(this));
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.Chip, i11, i12, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.Chip_android_textColor));
        }
        boolean hasValue = m32639h.hasValue(AbstractC23587l.Chip_shapeAppearance);
        m32639h.recycle();
        this.f35125E = new C6278c(this);
        m32050z();
        if (!hasValue) {
            m32046q();
        }
        setChecked(this.f35134x);
        setText(m32085C0.m32198o1());
        setEllipsize(m32085C0.m32187i1());
        m32031D();
        if (!this.f35129s.m32158S2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m32030C();
        if (m32056x()) {
            setMinHeight(this.f35124D);
        }
        this.f35123C = AbstractC1579n0.m7812G(this);
    }

    public void setCheckedIconVisible(boolean z11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32136L1(z11);
        }
    }

    public void setChipIconVisible(boolean z11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32172Z1(z11);
        }
    }

    public void setCloseIconVisible(boolean z11) {
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32212v2(z11);
        }
        m32050z();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32140M2(i11);
        }
        m32031D();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i11) {
        super.setTextAppearance(i11);
        C6284b c6284b = this.f35129s;
        if (c6284b != null) {
            c6284b.m32140M2(i11);
        }
        m32031D();
    }
}
