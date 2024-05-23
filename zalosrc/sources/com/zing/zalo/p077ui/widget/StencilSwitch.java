package com.zing.zalo.p077ui.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
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
import androidx.core.view.AbstractC1622z;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8923h0;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class StencilSwitch extends RobotoCompoundButton {

    /* renamed from: e0 */
    static final int[] f69658e0 = {R.attr.state_checked};

    /* renamed from: A */
    int f69659A;

    /* renamed from: B */
    int f69660B;

    /* renamed from: C */
    int f69661C;

    /* renamed from: D */
    int f69662D;

    /* renamed from: E */
    int f69663E;

    /* renamed from: F */
    int f69664F;

    /* renamed from: G */
    int f69665G;

    /* renamed from: H */
    final Rect f69666H;

    /* renamed from: I */
    TextPaint f69667I;

    /* renamed from: J */
    Drawable f69668J;

    /* renamed from: K */
    float f69669K;

    /* renamed from: L */
    int f69670L;

    /* renamed from: M */
    int f69671M;

    /* renamed from: N */
    int f69672N;

    /* renamed from: O */
    boolean f69673O;

    /* renamed from: P */
    int f69674P;

    /* renamed from: Q */
    int f69675Q;

    /* renamed from: R */
    float f69676R;

    /* renamed from: S */
    float f69677S;

    /* renamed from: T */
    Drawable f69678T;

    /* renamed from: U */
    Drawable f69679U;

    /* renamed from: V */
    Drawable f69680V;

    /* renamed from: W */
    Drawable f69681W;

    /* renamed from: a0 */
    VelocityTracker f69682a0;

    /* renamed from: b0 */
    int f69683b0;

    /* renamed from: c0 */
    boolean f69684c0;

    /* renamed from: d0 */
    private View.OnClickListener f69685d0;

    /* renamed from: w */
    int f69686w;

    /* renamed from: x */
    int f69687x;

    /* renamed from: y */
    int f69688y;

    /* renamed from: z */
    int f69689z;

    public StencilSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC16781w.switchStyleZalo);
    }

    /* renamed from: c */
    private void m75903c(boolean z11) {
        setChecked(z11);
    }

    /* renamed from: d */
    private void m75904d(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: e */
    private void m75905e(MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = false;
        this.f69674P = 0;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m75904d(motionEvent);
        if (z11) {
            this.f69682a0.computeCurrentVelocity(1000);
            float xVelocity = this.f69682a0.getXVelocity();
            if (Math.abs(xVelocity) > this.f69686w) {
                if (xVelocity > 0.0f) {
                    z12 = true;
                }
            } else {
                z12 = getTargetCheckedState();
            }
            View.OnClickListener onClickListener = this.f69685d0;
            if (onClickListener != null) {
                onClickListener.onClick(this);
            }
            m75903c(z12);
            return;
        }
        m75903c(isChecked());
    }

    private boolean getTargetCheckedState() {
        if (this.f69669K >= getThumbScrollRange() / 2) {
            return true;
        }
        return false;
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f69678T;
        if (drawable == null) {
            return 0;
        }
        drawable.getPadding(this.f69666H);
        int i11 = this.f69664F - this.f69672N;
        Rect rect = this.f69666H;
        return (i11 - rect.left) - rect.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f69668J;
        if (drawable != null) {
            drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f69678T;
        if (drawable2 != null) {
            drawable2.setState(drawableState);
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f69664F;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f69661C;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        try {
            Drawable drawable = this.f69668J;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
            Drawable drawable2 = this.f69678T;
            if (drawable2 != null) {
                drawable2.jumpToCurrentState();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f69658e0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            int i11 = this.f69689z;
            int i12 = this.f69663E;
            int i13 = this.f69662D;
            int i14 = this.f69687x;
            int i15 = (int) this.f69669K;
            if (getTargetCheckedState()) {
                Drawable drawable = this.f69679U;
                if (drawable != null) {
                    int i16 = this.f69661C;
                    drawable.setBounds(i11 + i16, i12 + i16, i13 - i16, i14 - i16);
                    this.f69679U.draw(canvas);
                }
                Drawable drawable2 = this.f69680V;
                if (drawable2 != null) {
                    drawable2.setBounds(i15, i12 + this.f69683b0, this.f69672N + i15, i14);
                    this.f69680V.draw(canvas);
                    return;
                }
                return;
            }
            Drawable drawable3 = this.f69678T;
            if (drawable3 != null) {
                int i17 = this.f69661C;
                drawable3.setBounds(i11 + i17, i12 + i17, i13 - i17, i14 - i17);
                this.f69678T.draw(canvas);
            }
            Drawable drawable4 = this.f69681W;
            if (drawable4 != null) {
                drawable4.setBounds(i15, i12 + this.f69683b0, this.f69672N + i15, i14);
                this.f69681W.draw(canvas);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
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
        this.f69669K = f11;
        int width = getWidth() - getPaddingRight();
        int i18 = width - this.f69664F;
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i16 = getPaddingTop();
                i15 = this.f69688y;
            } else {
                i17 = getHeight() - getPaddingBottom();
                i16 = i17 - this.f69688y;
                this.f69689z = i18;
                this.f69663E = i16;
                this.f69687x = i17;
                this.f69662D = width;
            }
        } else {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i15 = this.f69688y;
            i16 = paddingTop - (i15 / 2);
        }
        i17 = i15 + i16;
        this.f69689z = i18;
        this.f69663E = i16;
        this.f69687x = i17;
        this.f69662D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        try {
            i14 = this.f69659A;
            try {
                i15 = this.f69660B;
            } catch (Exception e11) {
                e = e11;
                i16 = i14;
                i13 = 0;
                AbstractC20110a.m104539h(e);
                int i17 = i13;
                i14 = i16;
                i15 = i17;
                this.f69664F = i14;
                this.f69688y = i15;
                setMeasuredDimension(i14, i15 + this.f69683b0);
            }
        } catch (Exception e12) {
            e = e12;
        }
        try {
            this.f69672N = (i15 * 45) / 45;
        } catch (Exception e13) {
            e = e13;
            i13 = i15;
            i16 = i14;
            AbstractC20110a.m104539h(e);
            int i172 = i13;
            i14 = i16;
            i15 = i172;
            this.f69664F = i14;
            this.f69688y = i15;
            setMeasuredDimension(i14, i15 + this.f69683b0);
        }
        this.f69664F = i14;
        this.f69688y = i15;
        setMeasuredDimension(i14, i15 + this.f69683b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:            if (r0 != 3) goto L43;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f69684c0) {
            return super.onTouchEvent(motionEvent);
        }
        this.f69682a0.addMovement(motionEvent);
        int m8275c = AbstractC1622z.m8275c(motionEvent);
        if (m8275c != 0) {
            if (m8275c != 1) {
                if (m8275c == 2) {
                    int i11 = this.f69674P;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            float x11 = motionEvent.getX();
                            float max = Math.max(0.0f, Math.min(this.f69669K + (x11 - this.f69676R), getThumbScrollRange()));
                            if (max != this.f69669K) {
                                this.f69669K = max;
                                this.f69676R = x11;
                                invalidate();
                            }
                            return true;
                        }
                    } else {
                        float x12 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        if (Math.abs(x12 - this.f69676R) > this.f69675Q || Math.abs(y11 - this.f69677S) > this.f69675Q) {
                            this.f69674P = 2;
                            this.f69676R = x12;
                            this.f69677S = y11;
                            return true;
                        }
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
            if (this.f69674P == 1 && this.f69673O) {
                View.OnClickListener onClickListener = this.f69685d0;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                } else {
                    toggle();
                }
                m75904d(motionEvent);
                this.f69674P = 0;
                this.f69682a0.clear();
                getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
            if (this.f69674P == 2) {
                m75905e(motionEvent);
                return true;
            }
            this.f69674P = 0;
            this.f69682a0.clear();
            getParent().requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(motionEvent);
        }
        float x13 = motionEvent.getX();
        float y12 = motionEvent.getY();
        if (isEnabled()) {
            this.f69674P = 1;
            this.f69676R = x13;
            this.f69677S = y12;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        float f11;
        if (z11) {
            f11 = getThumbScrollRange();
        } else {
            f11 = 0.0f;
        }
        this.f69669K = f11;
        super.setChecked(z11);
        invalidate();
    }

    public void setEnableTouch(boolean z11) {
        this.f69684c0 = z11;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f69685d0 = onClickListener;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f69668J && drawable != this.f69678T) {
            return false;
        }
        return true;
    }

    public StencilSwitch(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69666H = new Rect();
        this.f69682a0 = VelocityTracker.obtain();
        this.f69683b0 = 0;
        this.f69684c0 = true;
        this.f69667I = new TextPaint(1);
        Resources resources = getResources();
        this.f69667I.density = resources.getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.StencilSwitchZalo, i11, 0);
        this.f69668J = AbstractC23136l9.m118665N(context, AbstractC16803z.switch_thumb);
        this.f69678T = obtainStyledAttributes.getDrawable(AbstractC8923h0.StencilSwitchZalo_trackZalo);
        this.f69679U = AbstractC23136l9.m118665N(context, AbstractC16803z.switch_track_on);
        this.f69680V = AbstractC23136l9.m118665N(context, AbstractC16803z.btn_switchknob_on);
        this.f69681W = AbstractC23136l9.m118665N(context, AbstractC16803z.btn_switchknob_off);
        this.f69670L = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.StencilSwitchZalo_thumbTextPaddingZalo, 0);
        this.f69659A = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.StencilSwitchZalo_switchMinWidthZalo, 0);
        this.f69660B = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.StencilSwitchZalo_switchMinHeightZalo, 0);
        this.f69661C = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.StencilSwitchZalo_switchPaddingZalo, 0);
        this.f69673O = obtainStyledAttributes.getBoolean(AbstractC8923h0.StencilSwitchZalo_toggleWhenClickZalo, true);
        this.f69671M = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.StencilSwitchZalo_thumbMinWidth, 0);
        this.f69665G = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.StencilSwitchZalo_exactlyWidth, 0);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f69675Q = viewConfiguration.getScaledTouchSlop();
        this.f69686w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
