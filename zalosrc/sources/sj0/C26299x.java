package sj0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.zinstant.utils.C17189a;
import com.zing.zalo.zinstant.utils.C17206r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;

/* renamed from: sj0.x */
/* loaded from: classes7.dex */
public final class C26299x {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final b f124910a;

    /* renamed from: b */
    private Rect f124911b;

    /* renamed from: c */
    private final Paint f124912c;

    /* renamed from: d */
    private int f124913d;

    /* renamed from: e */
    private int f124914e;

    /* renamed from: f */
    private int f124915f;

    /* renamed from: g */
    private float f124916g;

    /* renamed from: h */
    private float f124917h;

    /* renamed from: i */
    private float f124918i;

    /* renamed from: j */
    private ValueAnimator f124919j;

    /* renamed from: k */
    private ValueAnimator f124920k;

    /* renamed from: l */
    private ValueAnimator f124921l;

    /* renamed from: m */
    private float f124922m;

    /* renamed from: n */
    private float f124923n;

    /* renamed from: o */
    private boolean f124924o;

    /* renamed from: sj0.x$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: sj0.x$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        void mo135267a(C26299x c26299x);

        /* renamed from: b */
        void mo135268b(C26299x c26299x);
    }

    /* renamed from: sj0.x$c */
    /* loaded from: classes7.dex */
    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C26299x.this.m135382h().mo135268b(C26299x.this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C26299x.this.m135382h().mo135268b(C26299x.this);
        }
    }

    /* renamed from: sj0.x$d */
    /* loaded from: classes7.dex */
    public static final class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (!C26299x.this.f124924o) {
                C26299x.this.m135377o(true);
            }
            C26299x.this.m135382h().mo135267a(C26299x.this);
        }
    }

    public C26299x(b bVar) {
        AbstractC19074t.m100208f(bVar, "callback");
        this.f124910a = bVar;
        this.f124911b = new Rect();
        this.f124912c = new Paint(1);
        this.f124915f = 255;
    }

    /* renamed from: f */
    private final boolean m135374f(Canvas canvas) {
        ValueAnimator valueAnimator = this.f124921l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            Float f11 = (Float) valueAnimator.getAnimatedValue("opacity");
            if (f11 != null) {
                this.f124912c.setColor(C17189a.f87752a.m91796b(f11.floatValue(), this.f124914e));
            }
            canvas.drawCircle(this.f124922m, this.f124923n, this.f124916g, this.f124912c);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m135375g(Canvas canvas) {
        Object obj;
        ValueAnimator valueAnimator = this.f124919j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f124920k;
            if (valueAnimator2 != null) {
                obj = valueAnimator2.getAnimatedValue("opacity");
            } else {
                obj = null;
            }
            Float f11 = (Float) obj;
            if (f11 != null) {
                this.f124912c.setColor(C17189a.f87752a.m91796b(f11.floatValue(), this.f124914e));
            }
            float f12 = this.f124917h;
            float f13 = this.f124918i;
            Object animatedValue = valueAnimator.getAnimatedValue("radius");
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            canvas.drawCircle(this.f124922m, this.f124923n, f12 + (f13 * ((Float) animatedValue).floatValue()), this.f124912c);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final void m135376j() {
        float m116579b;
        float m116579b2;
        int width = this.f124911b.width();
        int height = this.f124911b.height();
        if (width != 0 && height != 0) {
            float f11 = this.f124922m;
            m116579b = AbstractC22543l.m116579b(f11, width - f11);
            float f12 = this.f124923n;
            m116579b2 = AbstractC22543l.m116579b(f12, height - f12);
            float sqrt = (float) Math.sqrt((m116579b * m116579b) + (m116579b2 * m116579b2));
            this.f124916g = sqrt;
            float f13 = 0.3f * sqrt;
            this.f124917h = f13;
            this.f124918i = sqrt - f13;
            return;
        }
        this.f124916g = 0.0f;
        this.f124917h = 0.0f;
        this.f124918i = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m135377o(boolean z11) {
        ValueAnimator valueAnimator = this.f124919j;
        if (valueAnimator != null && valueAnimator.isRunning() && !z11) {
            return;
        }
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setValues(PropertyValuesHolder.ofFloat("opacity", 1.0f, 0.0f));
        valueAnimator2.setInterpolator(new LinearInterpolator());
        valueAnimator2.setDuration(150L);
        valueAnimator2.setStartDelay(0L);
        valueAnimator2.setRepeatCount(0);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sj0.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                C26299x.m135379q(C26299x.this, valueAnimator3);
            }
        });
        valueAnimator2.addListener(new c());
        this.f124921l = valueAnimator2;
        valueAnimator2.start();
    }

    /* renamed from: p */
    static /* synthetic */ void m135378p(C26299x c26299x, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c26299x.m135377o(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m135379q(C26299x c26299x, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c26299x, "this$0");
        c26299x.f124910a.mo135267a(c26299x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m135380s(C26299x c26299x, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c26299x, "this$0");
        c26299x.f124910a.mo135267a(c26299x);
    }

    /* renamed from: e */
    public final void m135381e(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (m135375g(canvas) || m135374f(canvas)) {
            return;
        }
        canvas.drawCircle(this.f124922m, this.f124923n, this.f124916g, this.f124912c);
    }

    /* renamed from: h */
    public final b m135382h() {
        return this.f124910a;
    }

    /* renamed from: i */
    public final void m135383i(boolean z11) {
        this.f124924o = z11;
        if (!z11) {
            m135378p(this, false, 1, null);
        }
    }

    /* renamed from: k */
    public final void m135384k(int i11) {
        this.f124915f = i11;
        int m91795a = C17189a.f87752a.m91795a(i11, this.f124913d);
        this.f124914e = m91795a;
        this.f124912c.setColor(m91795a);
    }

    /* renamed from: l */
    public final void m135385l(Rect rect) {
        AbstractC19074t.m100208f(rect, "bounds");
        if (AbstractC19074t.m100204b(rect, this.f124911b)) {
            return;
        }
        this.f124911b.set(rect);
        m135376j();
    }

    /* renamed from: m */
    public final void m135386m(int i11) {
        this.f124913d = i11;
        int m91795a = C17189a.f87752a.m91795a(this.f124915f, i11);
        this.f124914e = m91795a;
        this.f124912c.setColor(m91795a);
    }

    /* renamed from: n */
    public final void m135387n(float f11, float f12) {
        if (C17206r.m91844b(this.f124922m, f11, 0.0d, 4, null) && C17206r.m91844b(this.f124923n, f12, 0.0d, 4, null)) {
            return;
        }
        this.f124922m = f11;
        this.f124923n = f12;
        m135376j();
    }

    /* renamed from: r */
    public final void m135388r() {
        if (this.f124919j != null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(PropertyValuesHolder.ofFloat("radius", 0.0f, 1.0f));
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(225L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.setRepeatCount(0);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sj0.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C26299x.m135380s(C26299x.this, valueAnimator2);
            }
        });
        valueAnimator.addListener(new d());
        this.f124919j = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setValues(PropertyValuesHolder.ofFloat("opacity", 0.0f, 1.0f));
        valueAnimator2.setInterpolator(new DecelerateInterpolator());
        valueAnimator2.setDuration(75L);
        valueAnimator2.setStartDelay(0L);
        valueAnimator2.setRepeatCount(0);
        this.f124920k = valueAnimator2;
        ValueAnimator valueAnimator3 = this.f124919j;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        ValueAnimator valueAnimator4 = this.f124920k;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }
}
