package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.AbstractC1622z;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoCompoundButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import qm0.AbstractC25358n;
import ri0.C25808b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class Switch extends RobotoCompoundButton implements InterfaceC16976f1 {
    public static final C16933a Companion = new C16933a(null);

    /* renamed from: e0 */
    private static final int[] f86397e0 = {R.attr.state_checked};

    /* renamed from: A */
    private int f86398A;

    /* renamed from: B */
    private int f86399B;

    /* renamed from: C */
    private int f86400C;

    /* renamed from: D */
    private int f86401D;

    /* renamed from: E */
    private final Rect f86402E;

    /* renamed from: F */
    private Drawable f86403F;

    /* renamed from: G */
    private float f86404G;

    /* renamed from: H */
    private float f86405H;

    /* renamed from: I */
    private int f86406I;

    /* renamed from: J */
    private int f86407J;

    /* renamed from: K */
    private boolean f86408K;

    /* renamed from: L */
    private int f86409L;

    /* renamed from: M */
    private int f86410M;

    /* renamed from: N */
    private float f86411N;

    /* renamed from: O */
    private float f86412O;

    /* renamed from: P */
    private Drawable f86413P;

    /* renamed from: Q */
    private VelocityTracker f86414Q;

    /* renamed from: R */
    private int f86415R;

    /* renamed from: S */
    private int f86416S;

    /* renamed from: T */
    private ColorStateList f86417T;

    /* renamed from: U */
    private CharSequence f86418U;

    /* renamed from: V */
    private final RobotoTextView f86419V;

    /* renamed from: W */
    private ValueAnimator f86420W;

    /* renamed from: a0 */
    private ValueAnimator f86421a0;

    /* renamed from: b0 */
    private TextPaint f86422b0;

    /* renamed from: c0 */
    private C25808b f86423c0;

    /* renamed from: d0 */
    private boolean f86424d0;

    /* renamed from: w */
    private final Rect f86425w;

    /* renamed from: x */
    private int f86426x;

    /* renamed from: y */
    private int f86427y;

    /* renamed from: z */
    private int f86428z;

    /* renamed from: com.zing.zalo.zdesign.component.Switch$a */
    /* loaded from: classes7.dex */
    public static final class C16933a {
        private C16933a() {
        }

        public /* synthetic */ C16933a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Switch(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: f */
    private final void m90677f(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private final boolean getTargetCheckedState() {
        if (this.f86404G >= getThumbScrollRange() / 2) {
            return true;
        }
        return false;
    }

    private final int getThumbScrollRange() {
        Drawable drawable = this.f86413P;
        if (drawable == null) {
            return 0;
        }
        AbstractC19074t.m100205c(drawable);
        drawable.getPadding(this.f86402E);
        int i11 = this.f86401D - this.f86407J;
        Rect rect = this.f86402E;
        return ((i11 - rect.left) - rect.right) - (this.f86406I * 2);
    }

    /* renamed from: h */
    private final void m90678h(AttributeSet attributeSet, int i11) {
        int m131366N;
        float f11;
        setText("");
        int[] iArr = {R.attr.textAppearance, R.attr.textColor};
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.Switch, i11, 0);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…able.Switch, defStyle, 0)");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        this.f86403F = C27280g.m139658a(context, AbstractC2810d.toggle_thumb);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        this.f86413P = C27280g.m139658a(context2, AbstractC2810d.toggle_track);
        this.f86401D = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_switchWidth, 0);
        this.f86428z = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_switchHeight, 0);
        this.f86406I = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_thumbPadding, 0);
        this.f86408K = obtainStyledAttributes.getBoolean(AbstractC2815i.Switch_toggleWhenClick, true);
        this.f86407J = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_thumbWidth, 0);
        this.f86415R = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_textPadding, 0);
        this.f86418U = obtainStyledAttributes.getString(AbstractC2815i.Switch_switchText);
        this.f86416S = obtainStyledAttributes.getResourceId(AbstractC2815i.Switch_android_textAppearance, 0);
        String string = obtainStyledAttributes.getString(AbstractC2815i.Switch_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
        AbstractC19074t.m100207e(obtainStyledAttributes2, "context.obtainStyledAttributes(attrs, attributes)");
        m131366N = AbstractC25358n.m131366N(iArr, R.attr.textColor);
        this.f86417T = obtainStyledAttributes2.getColorStateList(m131366N);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f86410M = viewConfiguration.getScaledTouchSlop();
        this.f86426x = viewConfiguration.getScaledMinimumFlingVelocity();
        if (isChecked()) {
            f11 = getThumbScrollRange();
        } else {
            f11 = 0.0f;
        }
        this.f86405H = f11;
        refreshDrawableState();
        m90684p();
        setGravity(16);
    }

    /* renamed from: j */
    private final void m90679j() {
        if (this.f86421a0 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getThumbScrollRange(), 0.0f);
            this.f86421a0 = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimator = this.f86421a0;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setDuration(150L);
            ValueAnimator valueAnimator2 = this.f86421a0;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.w0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    Switch.m90680k(Switch.this, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.f86421a0;
        if (valueAnimator3 != null) {
            AbstractC19074t.m100205c(valueAnimator3);
            if (!valueAnimator3.isStarted()) {
                ValueAnimator valueAnimator4 = this.f86421a0;
                AbstractC19074t.m100205c(valueAnimator4);
                valueAnimator4.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m90680k(Switch r12, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(r12, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r12.f86405H = ((Float) animatedValue).floatValue();
        r12.invalidate();
    }

    /* renamed from: l */
    private final void m90681l() {
        if (this.f86420W == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, getThumbScrollRange());
            this.f86420W = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimator = this.f86420W;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setDuration(150L);
            ValueAnimator valueAnimator2 = this.f86420W;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.v0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    Switch.m90682m(Switch.this, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.f86420W;
        if (valueAnimator3 != null) {
            AbstractC19074t.m100205c(valueAnimator3);
            if (!valueAnimator3.isStarted()) {
                ValueAnimator valueAnimator4 = this.f86420W;
                AbstractC19074t.m100205c(valueAnimator4);
                valueAnimator4.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m90682m(Switch r12, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(r12, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r12.f86405H = ((Float) animatedValue).floatValue();
        r12.invalidate();
    }

    /* renamed from: n */
    private final void m90683n(MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = false;
        this.f86409L = 0;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m90677f(motionEvent);
        if (z11) {
            this.f86414Q.computeCurrentVelocity(1000);
            float xVelocity = this.f86414Q.getXVelocity();
            if (Math.abs(xVelocity) > this.f86426x) {
                if (xVelocity > 0.0f) {
                    z12 = true;
                }
            } else {
                z12 = getTargetCheckedState();
            }
            C25808b c25808b = this.f86423c0;
            if (c25808b != null) {
                c25808b.m133073a();
            }
            setChecked(z12);
            return;
        }
        m90686i(isChecked(), true);
    }

    /* renamed from: p */
    private final void m90684p() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        new C26708g(this.f86419V).m137319a(C26705d.m137293a(context, this.f86416S));
        TextPaint paint = this.f86419V.getPaint();
        AbstractC19074t.m100207e(paint, "textView.paint");
        this.f86422b0 = paint;
        if (!TextUtils.isEmpty(this.f86418U)) {
            TextPaint textPaint = this.f86422b0;
            TextPaint textPaint2 = null;
            if (textPaint == null) {
                AbstractC19074t.m100223u("mTextPaint");
                textPaint = null;
            }
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            textPaint.setTypeface(C13718q1.m76694c(context2, 5));
            TextPaint textPaint3 = this.f86422b0;
            if (textPaint3 == null) {
                AbstractC19074t.m100223u("mTextPaint");
                textPaint3 = null;
            }
            String valueOf = String.valueOf(this.f86418U);
            CharSequence charSequence = this.f86418U;
            AbstractC19074t.m100205c(charSequence);
            textPaint3.getTextBounds(valueOf, 0, charSequence.length(), this.f86425w);
            if (this.f86417T != null) {
                if (!isEnabled()) {
                    TextPaint textPaint4 = this.f86422b0;
                    if (textPaint4 == null) {
                        AbstractC19074t.m100223u("mTextPaint");
                    } else {
                        textPaint2 = textPaint4;
                    }
                    ColorStateList colorStateList = this.f86417T;
                    AbstractC19074t.m100205c(colorStateList);
                    textPaint2.setColor(colorStateList.getColorForState(new int[]{-16842910}, 0));
                    return;
                }
                TextPaint textPaint5 = this.f86422b0;
                if (textPaint5 == null) {
                    AbstractC19074t.m100223u("mTextPaint");
                } else {
                    textPaint2 = textPaint5;
                }
                ColorStateList colorStateList2 = this.f86417T;
                AbstractC19074t.m100205c(colorStateList2);
                textPaint2.setColor(colorStateList2.getColorForState(new int[]{R.attr.state_enabled}, 0));
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f86403F;
        if (drawable != null) {
            drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f86413P;
        if (drawable2 != null) {
            drawable2.setState(drawableState);
        }
        invalidate();
    }

    /* renamed from: e */
    public final void m90685e(int i11) {
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i11, AbstractC2815i.Switch);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyle, R.styleable.Switch)");
            this.f86401D = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_switchWidth, 0);
            this.f86401D = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_switchWidth, 0);
            this.f86428z = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_switchHeight, 0);
            this.f86406I = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_thumbPadding, 0);
            this.f86408K = obtainStyledAttributes.getBoolean(AbstractC2815i.Switch_toggleWhenClick, true);
            this.f86407J = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_thumbWidth, 0);
            this.f86415R = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.Switch_textPadding, 0);
            this.f86416S = obtainStyledAttributes.getResourceId(AbstractC2815i.Switch_android_textAppearance, 0);
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
            AbstractC20110a.m104545n("Apply switch style error", new Object[0]);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f86401D;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f86406I;
        }
        return compoundPaddingRight;
    }

    /* renamed from: i */
    public final void m90686i(boolean z11, boolean z12) {
        if (isChecked() == z11) {
            return;
        }
        setChecked(z11);
        this.f86424d0 = z12;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        try {
            Drawable drawable = this.f86403F;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
            Drawable drawable2 = this.f86413P;
            if (drawable2 != null) {
                drawable2.jumpToCurrentState();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f86397e0);
        }
        AbstractC19074t.m100207e(onCreateDrawableState, "drawableState");
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        int i11 = this.f86398A;
        int i12 = this.f86400C;
        int i13 = this.f86399B;
        int i14 = this.f86427y;
        Drawable drawable = this.f86413P;
        if (drawable != null) {
            drawable.setBounds(i11, i12, i13, i14);
            drawable.draw(canvas);
        }
        if (this.f86424d0) {
            float f11 = this.f86404G;
            if (f11 > 0.0f && this.f86405H < f11) {
                m90681l();
            } else if (f11 == 0.0f && this.f86405H > f11) {
                m90679j();
            }
        } else {
            this.f86405H = this.f86404G;
        }
        Drawable drawable2 = this.f86403F;
        if (drawable2 != null) {
            float f12 = this.f86405H;
            int i15 = this.f86406I;
            drawable2.setBounds((int) (i15 + f12), i12 + i15, (int) (f12 + this.f86407J + i15), i14 - i15);
            drawable2.draw(canvas);
        }
        String valueOf = String.valueOf(this.f86418U);
        float f13 = i13 + this.f86415R;
        float height = (getHeight() + this.f86425w.height()) / 2.0f;
        TextPaint textPaint = this.f86422b0;
        if (textPaint == null) {
            AbstractC19074t.m100223u("mTextPaint");
            textPaint = null;
        }
        canvas.drawText(valueOf, f13, height, textPaint);
        if (this.f86405H != this.f86404G) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        float f11;
        int i15;
        int i16;
        int i17;
        super.onLayout(z11, i11, i12, i13, i14);
        if (isChecked()) {
            f11 = getThumbScrollRange();
        } else {
            f11 = 0.0f;
        }
        this.f86404G = f11;
        int i18 = this.f86401D;
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 48) {
                if (gravity != 80) {
                    i16 = getPaddingTop();
                    i15 = this.f86428z;
                } else {
                    i17 = getHeight() - getPaddingBottom();
                    i16 = i17 - this.f86428z;
                    this.f86398A = 0;
                    this.f86400C = i16;
                    this.f86427y = i17;
                    this.f86399B = i18;
                }
            } else {
                i16 = getPaddingTop();
                i15 = this.f86428z;
            }
        } else {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i15 = this.f86428z;
            i16 = paddingTop - (i15 / 2);
        }
        i17 = i15 + i16;
        this.f86398A = 0;
        this.f86400C = i16;
        this.f86427y = i17;
        this.f86399B = i18;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (TextUtils.isEmpty(this.f86418U)) {
            setMeasuredDimension(this.f86401D, this.f86428z);
        } else {
            setMeasuredDimension(this.f86401D + this.f86425w.width() + 2 + this.f86415R, Math.max(this.f86428z, this.f86419V.getLineHeight()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        AbstractC19074t.m100208f(motionEvent, "ev");
        this.f86414Q.addMovement(motionEvent);
        int m8275c = AbstractC1622z.m8275c(motionEvent);
        if (m8275c != 0) {
            if (m8275c != 1) {
                if (m8275c != 2) {
                    if (m8275c == 3) {
                        if (this.f86409L == 2) {
                            m90683n(motionEvent);
                            return true;
                        }
                        this.f86409L = 0;
                        this.f86414Q.clear();
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    int i11 = this.f86409L;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            float x11 = motionEvent.getX();
                            float max = Math.max(0.0f, Math.min(this.f86404G + (x11 - this.f86411N), getThumbScrollRange()));
                            if (max != this.f86404G) {
                                this.f86404G = max;
                                this.f86411N = x11;
                                invalidate();
                            }
                            return true;
                        }
                    } else {
                        float x12 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        if (Math.abs(x12 - this.f86411N) > this.f86410M || Math.abs(y11 - this.f86412O) > this.f86410M) {
                            this.f86409L = 2;
                            this.f86411N = x12;
                            this.f86412O = y11;
                            return true;
                        }
                    }
                }
            } else {
                int i12 = this.f86409L;
                if (i12 == 1 && this.f86408K) {
                    C25808b c25808b = this.f86423c0;
                    if (c25808b != null) {
                        onClickListener = c25808b.m133074b();
                    } else {
                        onClickListener = null;
                    }
                    if (onClickListener != null) {
                        boolean isChecked = isChecked();
                        C25808b c25808b2 = this.f86423c0;
                        if (c25808b2 != null) {
                            c25808b2.m133073a();
                        }
                        if (isChecked() == isChecked) {
                            setChecked(!isChecked());
                        }
                    } else {
                        toggle();
                    }
                    m90677f(motionEvent);
                    this.f86409L = 0;
                    this.f86414Q.clear();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return true;
                }
                if (i12 == 2) {
                    m90683n(motionEvent);
                    return true;
                }
                this.f86409L = 0;
                this.f86414Q.clear();
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        float x13 = motionEvent.getX();
        float y12 = motionEvent.getY();
        if (!isEnabled()) {
            return false;
        }
        this.f86409L = 1;
        this.f86411N = x13;
        this.f86412O = y12;
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        float f11;
        if (isChecked() == z11) {
            return;
        }
        this.f86424d0 = true;
        if (z11) {
            f11 = getThumbScrollRange();
        } else {
            f11 = 0.0f;
        }
        this.f86404G = f11;
        super.setChecked(z11);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (this.f86417T != null) {
            TextPaint textPaint = null;
            if (!isEnabled()) {
                TextPaint textPaint2 = this.f86422b0;
                if (textPaint2 == null) {
                    AbstractC19074t.m100223u("mTextPaint");
                } else {
                    textPaint = textPaint2;
                }
                ColorStateList colorStateList = this.f86417T;
                AbstractC19074t.m100205c(colorStateList);
                textPaint.setColor(colorStateList.getColorForState(new int[]{-16842910}, 0));
                return;
            }
            TextPaint textPaint3 = this.f86422b0;
            if (textPaint3 == null) {
                AbstractC19074t.m100223u("mTextPaint");
            } else {
                textPaint = textPaint3;
            }
            ColorStateList colorStateList2 = this.f86417T;
            AbstractC19074t.m100205c(colorStateList2);
            textPaint.setColor(colorStateList2.getColorForState(new int[]{R.attr.state_enabled}, 0));
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86423c0;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86423c0;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setTextSwitch(String str) {
        this.f86418U = str;
        m90684p();
        invalidate();
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86423c0;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "who");
        if (!super.verifyDrawable(drawable) && drawable != this.f86403F && drawable != this.f86413P) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Switch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.switchDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Switch(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86425w = new Rect();
        this.f86402E = new Rect();
        this.f86408K = true;
        this.f86414Q = VelocityTracker.obtain();
        this.f86418U = "";
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        this.f86419V = new RobotoTextView(context2);
        this.f86424d0 = true;
        this.f86423c0 = new C25808b(new WeakReference(this));
        m90678h(attributeSet, i11);
    }
}
