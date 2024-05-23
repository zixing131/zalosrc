package com.zing.zalo.p077ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p500s1.C26087b;

/* loaded from: classes5.dex */
public class FastScrollerViewBubble extends FastScrollerView {

    /* renamed from: S */
    RobotoTextView f61665S;

    /* renamed from: T */
    private float f61666T;

    /* renamed from: U */
    private float f61667U;

    /* renamed from: V */
    private boolean f61668V;

    /* renamed from: W */
    private boolean f61669W;

    /* renamed from: a0 */
    ValueAnimator f61670a0;

    /* renamed from: b0 */
    ValueAnimator f61671b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.custom.FastScrollerViewBubble$a */
    /* loaded from: classes5.dex */
    public class C11843a extends AnimatorListenerAdapter {
        C11843a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FastScrollerViewBubble.this.f61665S.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.custom.FastScrollerViewBubble$b */
    /* loaded from: classes5.dex */
    public class C11844b implements ValueAnimator.AnimatorUpdateListener {
        C11844b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            RobotoTextView robotoTextView = FastScrollerViewBubble.this.f61665S;
            robotoTextView.setTextColor(robotoTextView.getTextColors().withAlpha(floatValue));
            FastScrollerViewBubble.this.f61665S.getBackground().setAlpha(floatValue);
        }
    }

    /* renamed from: r */
    private boolean m65832r() {
        return this.f61665S != null;
    }

    /* renamed from: s */
    private void m65833s() {
        ValueAnimator valueAnimator = this.f61671b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f61670a0 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f61670a0 = ofFloat;
            ofFloat.setDuration(500L);
            this.f61670a0.setInterpolator(new DecelerateInterpolator());
            this.f61670a0.addListener(new C11843a());
            this.f61670a0.addUpdateListener(new C11844b());
        }
        if (!this.f61670a0.isRunning()) {
            this.f61670a0.start();
        }
    }

    /* renamed from: x */
    private void m65834x() {
        ValueAnimator valueAnimator = this.f61670a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f61665S.setVisibility(0);
        if (this.f61671b0 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f61671b0 = ofFloat;
            ofFloat.setDuration(500L);
            this.f61671b0.setInterpolator(new C26087b());
            this.f61671b0.addUpdateListener(new C11844b());
        }
        if (!this.f61671b0.isRunning()) {
            this.f61671b0.start();
        }
    }

    /* renamed from: y */
    private void m65835y() {
        if (m65824e() && this.f61665S.getVisibility() == 4 && !TextUtils.isEmpty(this.f61665S.getText())) {
            m65834x();
        } else if (!m65824e() && this.f61665S.getVisibility() == 0) {
            m65833s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.custom.FastScrollerView
    /* renamed from: j */
    public void mo65827j(Canvas canvas, int i11, int i12) {
        super.mo65827j(canvas, i11, i12);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (m65824e()) {
            m65837u();
        }
        return onInterceptTouchEvent;
    }

    @Override // com.zing.zalo.p077ui.custom.FastScrollerView, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean m65824e = m65824e();
        boolean onTouch = super.onTouch(view, motionEvent);
        if (m65832r()) {
            m65835y();
        }
        if (m65824e && !m65824e()) {
            m65839w();
        }
        m65836q(motionEvent);
        return onTouch;
    }

    /* renamed from: q */
    void m65836q(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    float y11 = motionEvent.getY();
                    if (this.f61667U == 0.0f) {
                        this.f61667U = y11;
                    }
                    if (this.f61666T == 0.0f) {
                        this.f61666T = y11;
                    }
                    if (!this.f61668V && !this.f61669W) {
                        float f11 = this.f61667U;
                        if (y11 > f11) {
                            this.f61669W = false;
                            this.f61668V = true;
                        } else if (y11 < f11) {
                            this.f61669W = true;
                            this.f61668V = false;
                        }
                    }
                    float f12 = this.f61667U;
                    if (y11 > f12) {
                        if (this.f61669W && !this.f61668V) {
                            this.f61666T = y11;
                            this.f61669W = false;
                            this.f61668V = true;
                        }
                    } else if (y11 < f12 && this.f61668V && !this.f61669W) {
                        this.f61666T = y11;
                        this.f61669W = true;
                        this.f61668V = false;
                    }
                    float f13 = y11 - this.f61666T;
                    if (f13 > 3.0f) {
                        this.f61666T = y11;
                        this.f61669W = false;
                        this.f61668V = false;
                        m65838v(2);
                    } else if (f13 < -3.0f) {
                        this.f61666T = y11;
                        this.f61669W = false;
                        this.f61668V = false;
                        m65838v(1);
                    }
                    this.f61667U = y11;
                    return;
                }
            }
            this.f61666T = 0.0f;
            this.f61667U = 0.0f;
            this.f61668V = false;
            this.f61669W = false;
            m65838v(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setBubbleView(RobotoTextView robotoTextView) {
        this.f61665S = robotoTextView;
        robotoTextView.setVisibility(4);
    }

    /* renamed from: u */
    protected void m65837u() {
    }

    /* renamed from: v */
    protected void m65838v(int i11) {
    }

    /* renamed from: w */
    protected void m65839w() {
    }
}
