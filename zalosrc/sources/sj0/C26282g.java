package sj0;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: sj0.g */
/* loaded from: classes7.dex */
public final class C26282g extends Drawable {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private Drawable f124797a;

    /* renamed from: b */
    private final Drawable f124798b;

    /* renamed from: c */
    private ValueAnimator f124799c;

    /* renamed from: d */
    private boolean f124800d;

    /* renamed from: e */
    private boolean f124801e;

    /* renamed from: f */
    private int f124802f;

    /* renamed from: sj0.g$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: sj0.g$b */
    /* loaded from: classes7.dex */
    public static final class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C26282g.this.f124800d = true;
            C26282g.this.f124801e = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C26282g.this.f124800d = true;
            C26282g.this.f124801e = true;
            C26282g.this.m135246i();
            C26282g.this.invalidateSelf();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C26282g.this.f124800d = true;
            C26282g.this.invalidateSelf();
        }
    }

    public C26282g(Drawable drawable, Drawable drawable2) {
        AbstractC19074t.m100208f(drawable2, "destination");
        this.f124797a = drawable;
        this.f124798b = drawable2;
        this.f124802f = 255;
        m135244g();
    }

    /* renamed from: g */
    private final void m135244g() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(ofFloat);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sj0.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C26282g.m135245h(C26282g.this, valueAnimator2);
            }
        });
        valueAnimator.addListener(new b());
        this.f124799c = valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m135245h(C26282g c26282g, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c26282g, "this$0");
        c26282g.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m135246i() {
        Drawable drawable = this.f124797a;
        if (drawable instanceof C26276a) {
            AbstractC19074t.m100206d(drawable, "null cannot be cast to non-null type com.zing.zalo.zinstant.component.drawable.BitmapRoundedDrawable");
            ((C26276a) drawable).m135180w();
        }
        this.f124797a = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        ValueAnimator valueAnimator = null;
        if (!this.f124800d) {
            ValueAnimator valueAnimator2 = this.f124799c;
            if (valueAnimator2 == null) {
                AbstractC19074t.m100223u("animator");
                valueAnimator2 = null;
            }
            valueAnimator2.start();
        }
        if (this.f124801e) {
            this.f124798b.setAlpha(this.f124802f);
            this.f124798b.draw(canvas);
            return;
        }
        ValueAnimator valueAnimator3 = this.f124799c;
        if (valueAnimator3 == null) {
            AbstractC19074t.m100223u("animator");
            valueAnimator3 = null;
        }
        if (valueAnimator3.isStarted()) {
            ValueAnimator valueAnimator4 = this.f124799c;
            if (valueAnimator4 == null) {
                AbstractC19074t.m100223u("animator");
            } else {
                valueAnimator = valueAnimator4;
            }
            Object animatedValue = valueAnimator.getAnimatedValue("alpha");
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Drawable drawable = this.f124797a;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f124802f * (1 - floatValue)));
                drawable.draw(canvas);
            }
            this.f124798b.setAlpha((int) (this.f124802f * floatValue));
            this.f124798b.draw(canvas);
        }
    }

    /* renamed from: e */
    public final Drawable m135247e() {
        return this.f124798b;
    }

    /* renamed from: f */
    public final Drawable m135248f() {
        return this.f124797a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f124802f = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        AbstractC19074t.m100208f(rect, "bounds");
        super.setBounds(rect);
        Drawable drawable = this.f124797a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.f124798b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f124797a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.f124798b.setColorFilter(colorFilter);
    }
}
