package com.zing.zalo.p077ui.widget.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.zing.zalo.MainApplication;
import p175g0.AbstractC19181d;

/* loaded from: classes6.dex */
public class VerticalCoordinationLayout extends RelativeLayout {

    /* renamed from: p */
    private final float f70612p;

    /* renamed from: q */
    int f70613q;

    /* renamed from: r */
    float f70614r;

    /* renamed from: s */
    float f70615s;

    /* renamed from: t */
    float f70616t;

    /* renamed from: u */
    boolean f70617u;

    /* renamed from: v */
    float f70618v;

    /* renamed from: w */
    int f70619w;

    /* renamed from: x */
    int f70620x;

    /* renamed from: y */
    ValueAnimator f70621y;

    /* renamed from: z */
    float f70622z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.layout.VerticalCoordinationLayout$a */
    /* loaded from: classes6.dex */
    public class C13669a extends AnimatorListenerAdapter {
        C13669a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VerticalCoordinationLayout.this.f70621y.setDuration(300L);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.layout.VerticalCoordinationLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13670b {
    }

    public VerticalCoordinationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70612p = ViewConfiguration.get(MainApplication.getAppContext()).getScaledTouchSlop();
        this.f70613q = getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_default_height_material);
        this.f70616t = 0.0f;
        this.f70620x = 1;
        m76388e(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m76384f(ValueAnimator valueAnimator) {
        setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: b */
    void m76385b() {
        this.f70621y.setFloatValues(getTranslationY(), -this.f70613q);
        this.f70621y.start();
    }

    /* renamed from: c */
    void m76386c() {
        this.f70621y.setFloatValues(getTranslationY(), 0.0f);
        this.f70621y.start();
    }

    /* renamed from: d */
    void m76387d() {
        ValueAnimator valueAnimator = this.f70621y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: e */
    void m76388e(Context context, AttributeSet attributeSet) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f70621y = valueAnimator;
        valueAnimator.setDuration(300L);
        this.f70621y.setInterpolator(new DecelerateInterpolator());
        this.f70621y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.layout.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VerticalCoordinationLayout.this.m76384f(valueAnimator2);
            }
        });
        this.f70621y.addListener(new C13669a());
    }

    /* renamed from: g */
    public void m76389g() {
        m76387d();
        if (getTranslationY() < (-this.f70613q) / 2) {
            if (getTranslationY() > (-this.f70613q)) {
                m76385b();
            }
        } else if (getTranslationY() < 0.0f) {
            m76386c();
        }
    }

    public int getScrolllDirection() {
        return this.f70620x;
    }

    public int getVerticalTranslationExtent() {
        return this.f70613q;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2) {
            if (this.f70616t != 0.0f && motionEvent.getRawY() < this.f70616t) {
                this.f70620x = 1;
            } else if (this.f70616t != 0.0f && motionEvent.getRawY() > this.f70616t) {
                this.f70620x = -1;
            }
        }
        this.f70616t = motionEvent.getRawY();
        if (action == 0) {
            this.f70619w = motionEvent.getPointerId(0);
            this.f70614r = motionEvent.getRawX();
            this.f70615s = motionEvent.getRawY();
            this.f70617u = false;
            this.f70618v = motionEvent.getRawY();
            m76387d();
        } else if (action == 2 && this.f70619w == motionEvent.getPointerId(0)) {
            float rawX = motionEvent.getRawX() - this.f70614r;
            float rawY = motionEvent.getRawY() - this.f70615s;
            if (this.f70617u || (Math.abs(rawY) > Math.abs(rawX) && Math.abs(rawY) > this.f70612p)) {
                this.f70617u = true;
                setTranslationY((int) ((getTranslationY() + motionEvent.getRawY()) - this.f70618v));
            }
            this.f70618v = motionEvent.getRawY();
        } else if (this.f70619w == motionEvent.getPointerId(0) && (action == 1 || action == 3)) {
            m76389g();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) + ((int) this.f70622z), Integer.MIN_VALUE));
    }

    public void setStateController(InterfaceC13670b interfaceC13670b) {
    }

    @Override // android.view.View
    public void setTranslationY(float f11) {
        float max = Math.max(-this.f70613q, Math.min(0.0f, f11));
        super.setTranslationY(max);
        this.f70622z = -max;
        requestLayout();
    }

    public void setVerticalTranslationExtent(int i11) {
        this.f70613q = i11;
        requestLayout();
    }
}
