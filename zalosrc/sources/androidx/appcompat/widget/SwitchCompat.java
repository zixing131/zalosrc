package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.AbstractC1640l;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;
import p284k0.C21423a;

/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: f0 */
    private static final Property f4478f0 = new C1140a(Float.class, "thumbPos");

    /* renamed from: g0 */
    private static final int[] f4479g0 = {R.attr.state_checked};

    /* renamed from: A */
    private int f4480A;

    /* renamed from: B */
    private int f4481B;

    /* renamed from: C */
    private boolean f4482C;

    /* renamed from: D */
    private CharSequence f4483D;

    /* renamed from: E */
    private CharSequence f4484E;

    /* renamed from: F */
    private boolean f4485F;

    /* renamed from: G */
    private int f4486G;

    /* renamed from: H */
    private int f4487H;

    /* renamed from: I */
    private float f4488I;

    /* renamed from: J */
    private float f4489J;

    /* renamed from: K */
    private VelocityTracker f4490K;

    /* renamed from: L */
    private int f4491L;

    /* renamed from: M */
    float f4492M;

    /* renamed from: N */
    private int f4493N;

    /* renamed from: O */
    private int f4494O;

    /* renamed from: P */
    private int f4495P;

    /* renamed from: Q */
    private int f4496Q;

    /* renamed from: R */
    private int f4497R;

    /* renamed from: S */
    private int f4498S;

    /* renamed from: T */
    private int f4499T;

    /* renamed from: U */
    private final TextPaint f4500U;

    /* renamed from: V */
    private ColorStateList f4501V;

    /* renamed from: W */
    private Layout f4502W;

    /* renamed from: a0 */
    private Layout f4503a0;

    /* renamed from: b0 */
    private TransformationMethod f4504b0;

    /* renamed from: c0 */
    ObjectAnimator f4505c0;

    /* renamed from: d0 */
    private final C1154b0 f4506d0;

    /* renamed from: e0 */
    private final Rect f4507e0;

    /* renamed from: p */
    private Drawable f4508p;

    /* renamed from: q */
    private ColorStateList f4509q;

    /* renamed from: r */
    private PorterDuff.Mode f4510r;

    /* renamed from: s */
    private boolean f4511s;

    /* renamed from: t */
    private boolean f4512t;

    /* renamed from: u */
    private Drawable f4513u;

    /* renamed from: v */
    private ColorStateList f4514v;

    /* renamed from: w */
    private PorterDuff.Mode f4515w;

    /* renamed from: x */
    private boolean f4516x;

    /* renamed from: y */
    private boolean f4517y;

    /* renamed from: z */
    private int f4518z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes2.dex */
    class C1140a extends Property {
        C1140a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f4492M);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f11) {
            switchCompat.setThumbPosition(f11.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.switchStyle);
    }

    /* renamed from: a */
    private void m5387a(boolean z11) {
        float f11;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f4478f0, f11);
        this.f4505c0 = ofFloat;
        ofFloat.setDuration(250L);
        this.f4505c0.setAutoCancel(true);
        this.f4505c0.start();
    }

    /* renamed from: b */
    private void m5388b() {
        Drawable drawable = this.f4508p;
        if (drawable != null) {
            if (this.f4511s || this.f4512t) {
                Drawable mutate = AbstractC1414a.m7200r(drawable).mutate();
                this.f4508p = mutate;
                if (this.f4511s) {
                    AbstractC1414a.m7197o(mutate, this.f4509q);
                }
                if (this.f4512t) {
                    AbstractC1414a.m7198p(this.f4508p, this.f4510r);
                }
                if (this.f4508p.isStateful()) {
                    this.f4508p.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    private void m5389c() {
        Drawable drawable = this.f4513u;
        if (drawable != null) {
            if (this.f4516x || this.f4517y) {
                Drawable mutate = AbstractC1414a.m7200r(drawable).mutate();
                this.f4513u = mutate;
                if (this.f4516x) {
                    AbstractC1414a.m7197o(mutate, this.f4514v);
                }
                if (this.f4517y) {
                    AbstractC1414a.m7198p(this.f4513u, this.f4515w);
                }
                if (this.f4513u.isStateful()) {
                    this.f4513u.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    private void m5390d() {
        ObjectAnimator objectAnimator = this.f4505c0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m5391e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m5392f(float f11, float f12, float f13) {
        return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
    }

    /* renamed from: g */
    private boolean m5393g(float f11, float f12) {
        if (this.f4508p == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f4508p.getPadding(this.f4507e0);
        int i11 = this.f4497R;
        int i12 = this.f4487H;
        int i13 = i11 - i12;
        int i14 = (this.f4496Q + thumbOffset) - i12;
        int i15 = this.f4495P + i14;
        Rect rect = this.f4507e0;
        int i16 = i15 + rect.left + rect.right + i12;
        int i17 = this.f4499T + i12;
        if (f11 <= i14 || f11 >= i16 || f12 <= i13 || f12 >= i17) {
            return false;
        }
        return true;
    }

    private boolean getTargetCheckedState() {
        return this.f4492M > 0.5f;
    }

    private int getThumbOffset() {
        float f11;
        if (AbstractC1152a2.m5459b(this)) {
            f11 = 1.0f - this.f4492M;
        } else {
            f11 = this.f4492M;
        }
        return (int) ((f11 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f4513u;
        if (drawable != null) {
            Rect rect2 = this.f4507e0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f4508p;
            if (drawable2 != null) {
                rect = AbstractC1225y0.m5772d(drawable2);
            } else {
                rect = AbstractC1225y0.f4762c;
            }
            return ((((this.f4493N - this.f4495P) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    /* renamed from: h */
    private Layout m5394h(CharSequence charSequence) {
        int i11;
        TransformationMethod transformationMethod = this.f4504b0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f4500U;
        if (charSequence2 != null) {
            i11 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
        } else {
            i11 = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m5395k(int i11, int i12) {
        Typeface typeface;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        m5398j(typeface, i12);
    }

    /* renamed from: l */
    private void m5396l(MotionEvent motionEvent) {
        boolean z11;
        this.f4486G = 0;
        boolean z12 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isChecked = isChecked();
        if (z11) {
            this.f4490K.computeCurrentVelocity(1000);
            float xVelocity = this.f4490K.getXVelocity();
            if (Math.abs(xVelocity) > this.f4491L) {
                if (!AbstractC1152a2.m5459b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z12 = false;
                }
            } else {
                z12 = getTargetCheckedState();
            }
        } else {
            z12 = isChecked;
        }
        if (z12 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z12);
        m5391e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i11;
        int i12;
        Rect rect2 = this.f4507e0;
        int i13 = this.f4496Q;
        int i14 = this.f4497R;
        int i15 = this.f4498S;
        int i16 = this.f4499T;
        int thumbOffset = getThumbOffset() + i13;
        Drawable drawable = this.f4508p;
        if (drawable != null) {
            rect = AbstractC1225y0.m5772d(drawable);
        } else {
            rect = AbstractC1225y0.f4762c;
        }
        Drawable drawable2 = this.f4513u;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i17 = rect2.left;
            thumbOffset += i17;
            if (rect != null) {
                int i18 = rect.left;
                if (i18 > i17) {
                    i13 += i18 - i17;
                }
                int i19 = rect.top;
                int i21 = rect2.top;
                if (i19 > i21) {
                    i11 = (i19 - i21) + i14;
                } else {
                    i11 = i14;
                }
                int i22 = rect.right;
                int i23 = rect2.right;
                if (i22 > i23) {
                    i15 -= i22 - i23;
                }
                int i24 = rect.bottom;
                int i25 = rect2.bottom;
                if (i24 > i25) {
                    i12 = i16 - (i24 - i25);
                    this.f4513u.setBounds(i13, i11, i15, i12);
                }
            } else {
                i11 = i14;
            }
            i12 = i16;
            this.f4513u.setBounds(i13, i11, i15, i12);
        }
        Drawable drawable3 = this.f4508p;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i26 = thumbOffset - rect2.left;
            int i27 = thumbOffset + this.f4495P + rect2.right;
            this.f4508p.setBounds(i26, i14, i27, i16);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC1414a.m7194l(background, i26, i14, i27, i16);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f4508p;
        if (drawable != null) {
            AbstractC1414a.m7193k(drawable, f11, f12);
        }
        Drawable drawable2 = this.f4513u;
        if (drawable2 != null) {
            AbstractC1414a.m7193k(drawable2, f11, f12);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean z11;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4508p;
        if (drawable != null && drawable.isStateful()) {
            z11 = drawable.setState(drawableState);
        } else {
            z11 = false;
        }
        Drawable drawable2 = this.f4513u;
        if (drawable2 != null && drawable2.isStateful()) {
            z11 |= drawable2.setState(drawableState);
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!AbstractC1152a2.m5459b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4493N;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f4481B;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (AbstractC1152a2.m5459b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4493N;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f4481B;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f4485F;
    }

    public boolean getSplitTrack() {
        return this.f4482C;
    }

    public int getSwitchMinWidth() {
        return this.f4480A;
    }

    public int getSwitchPadding() {
        return this.f4481B;
    }

    public CharSequence getTextOff() {
        return this.f4484E;
    }

    public CharSequence getTextOn() {
        return this.f4483D;
    }

    public Drawable getThumbDrawable() {
        return this.f4508p;
    }

    public int getThumbTextPadding() {
        return this.f4518z;
    }

    public ColorStateList getThumbTintList() {
        return this.f4509q;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4510r;
    }

    public Drawable getTrackDrawable() {
        return this.f4513u;
    }

    public ColorStateList getTrackTintList() {
        return this.f4514v;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4515w;
    }

    /* renamed from: i */
    public void m5397i(Context context, int i11) {
        C1211t1 m5714t = C1211t1.m5714t(context, i11, AbstractC19187j.TextAppearance);
        ColorStateList m5719c = m5714t.m5719c(AbstractC19187j.TextAppearance_android_textColor);
        if (m5719c != null) {
            this.f4501V = m5719c;
        } else {
            this.f4501V = getTextColors();
        }
        int m5722f = m5714t.m5722f(AbstractC19187j.TextAppearance_android_textSize, 0);
        if (m5722f != 0) {
            float f11 = m5722f;
            if (f11 != this.f4500U.getTextSize()) {
                this.f4500U.setTextSize(f11);
                requestLayout();
            }
        }
        m5395k(m5714t.m5727k(AbstractC19187j.TextAppearance_android_typeface, -1), m5714t.m5727k(AbstractC19187j.TextAppearance_android_textStyle, -1));
        if (m5714t.m5717a(AbstractC19187j.TextAppearance_textAllCaps, false)) {
            this.f4504b0 = new C21423a(getContext());
        } else {
            this.f4504b0 = null;
        }
        m5714t.m5736w();
    }

    /* renamed from: j */
    public void m5398j(Typeface typeface, int i11) {
        Typeface create;
        int i12;
        float f11 = 0.0f;
        boolean z11 = false;
        if (i11 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i11);
            } else {
                create = Typeface.create(typeface, i11);
            }
            setSwitchTypeface(create);
            if (create != null) {
                i12 = create.getStyle();
            } else {
                i12 = 0;
            }
            int i13 = (~i12) & i11;
            TextPaint textPaint = this.f4500U;
            if ((i13 & 1) != 0) {
                z11 = true;
            }
            textPaint.setFakeBoldText(z11);
            TextPaint textPaint2 = this.f4500U;
            if ((i13 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint2.setTextSkewX(f11);
            return;
        }
        this.f4500U.setFakeBoldText(false);
        this.f4500U.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4508p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4513u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4505c0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f4505c0.end();
            this.f4505c0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4479g0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f4507e0;
        Drawable drawable = this.f4513u;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.f4497R;
        int i12 = this.f4499T;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f4508p;
        if (drawable != null) {
            if (this.f4482C && drawable2 != null) {
                Rect m5772d = AbstractC1225y0.m5772d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m5772d.left;
                rect.right -= m5772d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f4502W;
        } else {
            layout = this.f4503a0;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f4501V;
            if (colorStateList != null) {
                this.f4500U.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f4500U.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i13 + i14) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.f4483D;
        } else {
            charSequence = this.f4484E;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int width;
        int i16;
        int i17;
        int i18;
        int i19;
        super.onLayout(z11, i11, i12, i13, i14);
        int i21 = 0;
        if (this.f4508p != null) {
            Rect rect = this.f4507e0;
            Drawable drawable = this.f4513u;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m5772d = AbstractC1225y0.m5772d(this.f4508p);
            i15 = Math.max(0, m5772d.left - rect.left);
            i21 = Math.max(0, m5772d.right - rect.right);
        } else {
            i15 = 0;
        }
        if (AbstractC1152a2.m5459b(this)) {
            i16 = getPaddingLeft() + i15;
            width = ((this.f4493N + i16) - i15) - i21;
        } else {
            width = (getWidth() - getPaddingRight()) - i21;
            i16 = (width - this.f4493N) + i15 + i21;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i18 = getPaddingTop();
                i17 = this.f4494O;
            } else {
                i19 = getHeight() - getPaddingBottom();
                i18 = i19 - this.f4494O;
                this.f4496Q = i16;
                this.f4497R = i18;
                this.f4499T = i19;
                this.f4498S = width;
            }
        } else {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i17 = this.f4494O;
            i18 = paddingTop - (i17 / 2);
        }
        i19 = i17 + i18;
        this.f4496Q = i16;
        this.f4497R = i18;
        this.f4499T = i19;
        this.f4498S = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        if (this.f4485F) {
            if (this.f4502W == null) {
                this.f4502W = m5394h(this.f4483D);
            }
            if (this.f4503a0 == null) {
                this.f4503a0 = m5394h(this.f4484E);
            }
        }
        Rect rect = this.f4507e0;
        Drawable drawable = this.f4508p;
        int i16 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f4508p.getIntrinsicWidth() - rect.left) - rect.right;
            i14 = this.f4508p.getIntrinsicHeight();
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (this.f4485F) {
            i15 = Math.max(this.f4502W.getWidth(), this.f4503a0.getWidth()) + (this.f4518z * 2);
        } else {
            i15 = 0;
        }
        this.f4495P = Math.max(i15, i13);
        Drawable drawable2 = this.f4513u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i16 = this.f4513u.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i17 = rect.left;
        int i18 = rect.right;
        Drawable drawable3 = this.f4508p;
        if (drawable3 != null) {
            Rect m5772d = AbstractC1225y0.m5772d(drawable3);
            i17 = Math.max(i17, m5772d.left);
            i18 = Math.max(i18, m5772d.right);
        }
        int max = Math.max(this.f4480A, (this.f4495P * 2) + i17 + i18);
        int max2 = Math.max(i16, i14);
        this.f4493N = max;
        this.f4494O = max2;
        super.onMeasure(i11, i12);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f4483D;
        } else {
            charSequence = this.f4484E;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:            if (r0 != 3) goto L44;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f11;
        this.f4490K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i11 = this.f4486G;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            float x11 = motionEvent.getX();
                            int thumbScrollRange = getThumbScrollRange();
                            float f12 = x11 - this.f4488I;
                            if (thumbScrollRange != 0) {
                                f11 = f12 / thumbScrollRange;
                            } else if (f12 > 0.0f) {
                                f11 = 1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (AbstractC1152a2.m5459b(this)) {
                                f11 = -f11;
                            }
                            float m5392f = m5392f(this.f4492M + f11, 0.0f, 1.0f);
                            if (m5392f != this.f4492M) {
                                this.f4488I = x11;
                                setThumbPosition(m5392f);
                            }
                            return true;
                        }
                    } else {
                        float x12 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        if (Math.abs(x12 - this.f4488I) > this.f4487H || Math.abs(y11 - this.f4489J) > this.f4487H) {
                            this.f4486G = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f4488I = x12;
                            this.f4489J = y11;
                            return true;
                        }
                    }
                }
            }
            if (this.f4486G == 2) {
                m5396l(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f4486G = 0;
            this.f4490K.clear();
        } else {
            float x13 = motionEvent.getX();
            float y12 = motionEvent.getY();
            if (isEnabled() && m5393g(x13, y12)) {
                this.f4486G = 1;
                this.f4488I = x13;
                this.f4489J = y12;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        float f11;
        super.setChecked(z11);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && AbstractC1579n0.m7865e0(this)) {
            m5387a(isChecked);
            return;
        }
        m5390d();
        if (isChecked) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        setThumbPosition(f11);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1640l.m8426q(this, callback));
    }

    public void setShowText(boolean z11) {
        if (this.f4485F != z11) {
            this.f4485F = z11;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z11) {
        this.f4482C = z11;
        invalidate();
    }

    public void setSwitchMinWidth(int i11) {
        this.f4480A = i11;
        requestLayout();
    }

    public void setSwitchPadding(int i11) {
        this.f4481B = i11;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f4500U.getTypeface() != null && !this.f4500U.getTypeface().equals(typeface)) || (this.f4500U.getTypeface() == null && typeface != null)) {
            this.f4500U.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f4484E = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f4483D = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4508p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4508p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f11) {
        this.f4492M = f11;
        invalidate();
    }

    public void setThumbResource(int i11) {
        setThumbDrawable(AbstractC19694b.m103336d(getContext(), i11));
    }

    public void setThumbTextPadding(int i11) {
        this.f4518z = i11;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4509q = colorStateList;
        this.f4511s = true;
        m5388b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4510r = mode;
        this.f4512t = true;
        m5388b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4513u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4513u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i11) {
        setTrackDrawable(AbstractC19694b.m103336d(getContext(), i11));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4514v = colorStateList;
        this.f4516x = true;
        m5389c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4515w = mode;
        this.f4517y = true;
        m5389c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f4508p && drawable != this.f4513u) {
            return false;
        }
        return true;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4509q = null;
        this.f4510r = null;
        this.f4511s = false;
        this.f4512t = false;
        this.f4514v = null;
        this.f4515w = null;
        this.f4516x = false;
        this.f4517y = false;
        this.f4490K = VelocityTracker.obtain();
        this.f4507e0 = new Rect();
        AbstractC1199p1.m5678a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f4500U = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC19187j.SwitchCompat, i11, 0);
        AbstractC1579n0.m7912y0(this, context, AbstractC19187j.SwitchCompat, attributeSet, m5716v.m5734r(), i11, 0);
        Drawable m5723g = m5716v.m5723g(AbstractC19187j.SwitchCompat_android_thumb);
        this.f4508p = m5723g;
        if (m5723g != null) {
            m5723g.setCallback(this);
        }
        Drawable m5723g2 = m5716v.m5723g(AbstractC19187j.SwitchCompat_track);
        this.f4513u = m5723g2;
        if (m5723g2 != null) {
            m5723g2.setCallback(this);
        }
        this.f4483D = m5716v.m5732p(AbstractC19187j.SwitchCompat_android_textOn);
        this.f4484E = m5716v.m5732p(AbstractC19187j.SwitchCompat_android_textOff);
        this.f4485F = m5716v.m5717a(AbstractC19187j.SwitchCompat_showText, true);
        this.f4518z = m5716v.m5722f(AbstractC19187j.SwitchCompat_thumbTextPadding, 0);
        this.f4480A = m5716v.m5722f(AbstractC19187j.SwitchCompat_switchMinWidth, 0);
        this.f4481B = m5716v.m5722f(AbstractC19187j.SwitchCompat_switchPadding, 0);
        this.f4482C = m5716v.m5717a(AbstractC19187j.SwitchCompat_splitTrack, false);
        ColorStateList m5719c = m5716v.m5719c(AbstractC19187j.SwitchCompat_thumbTint);
        if (m5719c != null) {
            this.f4509q = m5719c;
            this.f4511s = true;
        }
        PorterDuff.Mode m5773e = AbstractC1225y0.m5773e(m5716v.m5727k(AbstractC19187j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f4510r != m5773e) {
            this.f4510r = m5773e;
            this.f4512t = true;
        }
        if (this.f4511s || this.f4512t) {
            m5388b();
        }
        ColorStateList m5719c2 = m5716v.m5719c(AbstractC19187j.SwitchCompat_trackTint);
        if (m5719c2 != null) {
            this.f4514v = m5719c2;
            this.f4516x = true;
        }
        PorterDuff.Mode m5773e2 = AbstractC1225y0.m5773e(m5716v.m5727k(AbstractC19187j.SwitchCompat_trackTintMode, -1), null);
        if (this.f4515w != m5773e2) {
            this.f4515w = m5773e2;
            this.f4517y = true;
        }
        if (this.f4516x || this.f4517y) {
            m5389c();
        }
        int m5730n = m5716v.m5730n(AbstractC19187j.SwitchCompat_switchTextAppearance, 0);
        if (m5730n != 0) {
            m5397i(context, m5730n);
        }
        C1154b0 c1154b0 = new C1154b0(this);
        this.f4506d0 = c1154b0;
        c1154b0.m5477m(attributeSet, i11);
        m5716v.m5736w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4487H = viewConfiguration.getScaledTouchSlop();
        this.f4491L = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
