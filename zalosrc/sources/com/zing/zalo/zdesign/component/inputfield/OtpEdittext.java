package com.zing.zalo.zdesign.component.inputfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.LinearInterpolator;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.EnumC16975f0;
import fn0.AbstractC19074t;
import fn0.C19055h0;
import qm0.AbstractC25356m;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class OtpEdittext extends EditText {

    /* renamed from: H */
    private final String f86921H;

    /* renamed from: I */
    private int f86922I;

    /* renamed from: J */
    private int f86923J;

    /* renamed from: K */
    private int f86924K;

    /* renamed from: L */
    private int f86925L;

    /* renamed from: M */
    private int f86926M;

    /* renamed from: N */
    private Paint f86927N;

    /* renamed from: O */
    private ValueAnimator f86928O;

    /* renamed from: P */
    private Drawable f86929P;

    /* renamed from: Q */
    private Drawable f86930Q;

    /* renamed from: R */
    private Drawable f86931R;

    /* renamed from: S */
    private View.OnClickListener f86932S;

    /* renamed from: T */
    private Rect f86933T;

    /* renamed from: U */
    public float[] f86934U;

    /* renamed from: V */
    private EnumC16975f0 f86935V;

    /* renamed from: W */
    private float f86936W;

    /* renamed from: a0 */
    private boolean f86937a0;

    /* renamed from: b0 */
    private int f86938b0;

    /* renamed from: c0 */
    private long f86939c0;

    /* renamed from: d0 */
    private final Runnable f86940d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpEdittext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f86921H = "http://schemas.android.com/apk/res/android";
        this.f86923J = 4;
        this.f86933T = new Rect();
        this.f86935V = EnumC16975f0.NORMAL;
        this.f86939c0 = 1500L;
        this.f86940d0 = new Runnable() { // from class: com.zing.zalo.zdesign.component.inputfield.j
            @Override // java.lang.Runnable
            public final void run() {
                OtpEdittext.m91057M(OtpEdittext.this);
            }
        };
        m91054J(attributeSet);
    }

    /* renamed from: H */
    private final void m91052H() {
        Object[] m131333p;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        this.f86922I = C27276c.m139649b(context, 8);
        InputFilter[] filters = getFilters();
        AbstractC19074t.m100207e(filters, "filters");
        m131333p = AbstractC25356m.m131333p(filters, new InputFilter.LengthFilter(this.f86923J));
        setFilters((InputFilter[]) m131333p);
        setTextWidths(new float[this.f86923J]);
        int i11 = this.f86923J;
        if (i11 > 4) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            this.f86925L = C27276c.m139649b(context2, 40);
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            this.f86924K = C27276c.m139649b(context3, 48);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            this.f86926M = C27276c.m139649b(context4, 30);
            C26708g c26708g = new C26708g(this);
            Context context5 = getContext();
            AbstractC19074t.m100207e(context5, "context");
            c26708g.m137319a(C26705d.m137293a(context5, AbstractC2814h.f1000m));
            AbstractC19074t.m100207e(getContext(), "context");
            this.f86936W = C27276c.m139649b(r0, 5);
        } else if (i11 <= 4) {
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "context");
            this.f86925L = C27276c.m139649b(context6, 48);
            Context context7 = getContext();
            AbstractC19074t.m100207e(context7, "context");
            this.f86924K = C27276c.m139649b(context7, 56);
            Context context8 = getContext();
            AbstractC19074t.m100207e(context8, "context");
            this.f86926M = C27276c.m139649b(context8, 34);
            C26708g c26708g2 = new C26708g(this);
            Context context9 = getContext();
            AbstractC19074t.m100207e(context9, "context");
            c26708g2.m137319a(C26705d.m137293a(context9, AbstractC2814h.f1100m));
            AbstractC19074t.m100207e(getContext(), "context");
            this.f86936W = C27276c.m139648a(r0, 5.5f);
        }
        Drawable drawable = this.f86929P;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.f86925L, this.f86924K);
        }
        Drawable drawable2 = this.f86930Q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.f86925L, this.f86924K);
        }
        Drawable drawable3 = this.f86931R;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, this.f86925L, this.f86924K);
        }
    }

    /* renamed from: I */
    private final void m91053I(Canvas canvas, float f11) {
        int i11 = this.f86924K;
        int i12 = this.f86926M;
        float f12 = (i11 - i12) / 2.0f;
        float f13 = (i11 + i12) / 2.0f;
        Paint paint = this.f86927N;
        if (paint == null) {
            AbstractC19074t.m100223u("mCursorPaint");
            paint = null;
        }
        canvas.drawLine(f11, f12, f11, f13, paint);
        m91058N();
    }

    /* renamed from: J */
    private final void m91054J(AttributeSet attributeSet) {
        int i11 = 4;
        if (attributeSet != null) {
            i11 = attributeSet.getAttributeIntValue(this.f86921H, "maxLength", 4);
        }
        this.f86923J = i11;
        setInputType(130);
        setCursorVisible(false);
        setBackgroundResource(0);
        m91056L();
        m91052H();
        super.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zdesign.component.inputfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpEdittext.m91055K(OtpEdittext.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m91055K(OtpEdittext otpEdittext, View view) {
        AbstractC19074t.m100208f(otpEdittext, "this$0");
        otpEdittext.setSelection(String.valueOf(otpEdittext.getText()).length());
        View.OnClickListener onClickListener = otpEdittext.f86932S;
        if (onClickListener != null) {
            AbstractC19074t.m100205c(onClickListener);
            onClickListener.onClick(view);
        }
    }

    /* renamed from: L */
    private final void m91056L() {
        Paint paint = new Paint(1);
        this.f86927N = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.f86927N;
        Paint paint3 = null;
        if (paint2 == null) {
            AbstractC19074t.m100223u("mCursorPaint");
            paint2 = null;
        }
        AbstractC19074t.m100207e(getContext(), "context");
        paint2.setStrokeWidth(C27276c.m139649b(r4, 1));
        Paint paint4 = this.f86927N;
        if (paint4 == null) {
            AbstractC19074t.m100223u("mCursorPaint");
        } else {
            paint3 = paint4;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        paint3.setColor(aVar.m13592a(context, AbstractC2807a.input_field_border_focused));
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        this.f86929P = C27280g.m139658a(context2, AbstractC2810d.bg_form_otp_p);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        this.f86930Q = C27280g.m139658a(context3, AbstractC2810d.bg_form_otp_n);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        this.f86931R = C27280g.m139658a(context4, AbstractC2810d.bg_form_otp_d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m91057M(OtpEdittext otpEdittext) {
        AbstractC19074t.m100208f(otpEdittext, "this$0");
        otpEdittext.f86937a0 = true;
        otpEdittext.invalidate();
    }

    /* renamed from: N */
    private final void m91058N() {
        final C19055h0 c19055h0 = new C19055h0();
        if (this.f86928O == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(10, 0);
            this.f86928O = ofInt;
            AbstractC19074t.m100205c(ofInt);
            ofInt.setDuration(1000L);
            ValueAnimator valueAnimator = this.f86928O;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f86928O;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator3 = this.f86928O;
            AbstractC19074t.m100205c(valueAnimator3);
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.inputfield.k
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    OtpEdittext.m91059O(OtpEdittext.this, c19055h0, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f86928O;
        if (valueAnimator4 != null) {
            AbstractC19074t.m100205c(valueAnimator4);
            if (!valueAnimator4.isStarted()) {
                ValueAnimator valueAnimator5 = this.f86928O;
                AbstractC19074t.m100205c(valueAnimator5);
                valueAnimator5.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m91059O(OtpEdittext otpEdittext, C19055h0 c19055h0, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(otpEdittext, "this$0");
        AbstractC19074t.m100208f(c19055h0, "$stateVisible");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        Paint paint = null;
        if (((Integer) animatedValue).intValue() < 5) {
            Paint paint2 = otpEdittext.f86927N;
            if (paint2 == null) {
                AbstractC19074t.m100223u("mCursorPaint");
            } else {
                paint = paint2;
            }
            paint.setAlpha(0);
            if (c19055h0.f94931p == 1 && String.valueOf(otpEdittext.getText()).length() != otpEdittext.f86923J) {
                c19055h0.f94931p = 0;
                otpEdittext.invalidate();
                return;
            }
            return;
        }
        Paint paint3 = otpEdittext.f86927N;
        if (paint3 == null) {
            AbstractC19074t.m100223u("mCursorPaint");
        } else {
            paint = paint3;
        }
        paint.setAlpha(255);
        if (c19055h0.f94931p == 0 && String.valueOf(otpEdittext.getText()).length() != otpEdittext.f86923J) {
            c19055h0.f94931p = 1;
            otpEdittext.invalidate();
        }
    }

    public final int getMaxLength() {
        return this.f86923J;
    }

    public final Rect getTextRect() {
        return this.f86933T;
    }

    public final float[] getTextWidths() {
        float[] fArr = this.f86934U;
        if (fArr != null) {
            return fArr;
        }
        AbstractC19074t.m100223u("textWidths");
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPadding(0, 0, 0, 0);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(canvas, "canvas");
        String valueOf = String.valueOf(getText());
        int length = valueOf.length();
        if (this.f86938b0 != length) {
            getHandler().removeCallbacks(this.f86940d0);
            if (length < this.f86938b0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f86937a0 = z11;
            this.f86938b0 = length;
        }
        getPaint().getTextWidths(valueOf, 0, length, getTextWidths());
        getPaint().getTextBounds(valueOf, 0, length, this.f86933T);
        TextPaint paint = getPaint();
        if (isEnabled()) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            paint.setColor(aVar.m13592a(context, AbstractC2807a.input_field_text_primary_activated));
        } else {
            AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            paint.setColor(aVar2.m13592a(context2, AbstractC2807a.input_field_text_primary_disabled));
        }
        int i12 = 0;
        float f11 = 0.0f;
        while (i12 < this.f86923J) {
            float f12 = this.f86925L / 2.0f;
            canvas.save();
            canvas.translate(f11, 0.0f);
            if (isEnabled()) {
                if (length == i12) {
                    if (isFocused()) {
                        Drawable drawable = this.f86929P;
                        if (drawable != null) {
                            drawable.draw(canvas);
                        }
                        m91053I(canvas, f12);
                    } else {
                        Drawable drawable2 = this.f86930Q;
                        if (drawable2 != null) {
                            drawable2.draw(canvas);
                        }
                    }
                } else {
                    Drawable drawable3 = this.f86930Q;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                    }
                }
            } else {
                Drawable drawable4 = this.f86931R;
                if (drawable4 != null) {
                    drawable4.draw(canvas);
                }
            }
            EnumC16975f0 enumC16975f0 = this.f86935V;
            if (enumC16975f0 == EnumC16975f0.NORMAL) {
                if (length > i12) {
                    int i13 = i12;
                    canvas.drawText(valueOf, i13, i12 + 1, f12 - (getTextWidths()[i12] / 2), (getHeight() + this.f86933T.height()) / 2.0f, (Paint) paint);
                }
            } else if (enumC16975f0 == EnumC16975f0.AUTO_HIDDEN) {
                int i14 = i12 + 1;
                if (length > i14) {
                    canvas.drawCircle(f12, getHeight() / 2.0f, this.f86936W, paint);
                } else if (length == i14) {
                    if (this.f86938b0 != length) {
                        this.f86938b0 = length;
                    }
                    if (!this.f86937a0) {
                        canvas.drawText(valueOf, i12, i14, f12 - (getTextWidths()[i12] / 2), (getHeight() + this.f86933T.height()) / 2.0f, (Paint) paint);
                        getHandler().postDelayed(this.f86940d0, this.f86939c0);
                    } else {
                        canvas.drawCircle(f12, getHeight() / 2.0f, this.f86936W, paint);
                    }
                }
            } else if (length > i12) {
                canvas.drawCircle(f12, getHeight() / 2.0f, this.f86936W, paint);
            }
            int i15 = this.f86922I;
            if (i15 < 0) {
                i11 = this.f86925L * 2;
            } else {
                i11 = i15 + this.f86925L;
            }
            f11 += i11;
            i12++;
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14 = this.f86923J;
        if (i14 >= 1) {
            int i15 = this.f86925L * i14;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            i13 = i15 + ((i14 - 1) * C27276c.m139649b(context, 8)) + getPaddingLeft() + getPaddingRight();
        } else {
            i13 = 0;
        }
        setMeasuredDimension(i13, this.f86924K);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    public final void setMaxLength(int i11) {
        Object[] m131334q;
        Object[] m131333p;
        this.f86923J = i11;
        Object[] objArr = new InputFilter[0];
        InputFilter[] filters = getFilters();
        AbstractC19074t.m100207e(filters, "filters");
        for (InputFilter inputFilter : filters) {
            if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                AbstractC19074t.m100207e(inputFilter, "it");
                objArr = AbstractC25356m.m131333p(objArr, inputFilter);
            }
        }
        setFilters(new InputFilter[0]);
        InputFilter[] filters2 = getFilters();
        AbstractC19074t.m100207e(filters2, "filters");
        m131334q = AbstractC25356m.m131334q(filters2, objArr);
        setFilters((InputFilter[]) m131334q);
        InputFilter[] filters3 = getFilters();
        AbstractC19074t.m100207e(filters3, "filters");
        m131333p = AbstractC25356m.m131333p(filters3, new InputFilter.LengthFilter(this.f86923J));
        setFilters((InputFilter[]) m131333p);
        m91052H();
        requestLayout();
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.EditText, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f86932S = onClickListener;
    }

    public final void setShowingMode(EnumC16975f0 enumC16975f0) {
        AbstractC19074t.m100208f(enumC16975f0, "mode");
        this.f86935V = enumC16975f0;
    }

    public final void setTextRect(Rect rect) {
        AbstractC19074t.m100208f(rect, "<set-?>");
        this.f86933T = rect;
    }

    public final void setTextWidths(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "<set-?>");
        this.f86934U = fArr;
    }

    public final void setTimeAnimAutoHidden(long j11) {
        this.f86939c0 = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpEdittext(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86921H = "http://schemas.android.com/apk/res/android";
        this.f86923J = 4;
        this.f86933T = new Rect();
        this.f86935V = EnumC16975f0.NORMAL;
        this.f86939c0 = 1500L;
        this.f86940d0 = new Runnable() { // from class: com.zing.zalo.zdesign.component.inputfield.j
            @Override // java.lang.Runnable
            public final void run() {
                OtpEdittext.m91057M(OtpEdittext.this);
            }
        };
        m91054J(attributeSet);
    }
}
