package zm.voip.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import ep0.C18552l;
import java.util.ArrayList;
import zm.voip.widgets.CircleBackgroundView;

/* loaded from: classes7.dex */
public class CircleBackgroundView extends View {

    /* renamed from: A */
    private boolean f149931A;

    /* renamed from: B */
    private boolean f149932B;

    /* renamed from: C */
    private boolean f149933C;

    /* renamed from: p */
    ArrayList f149934p;

    /* renamed from: q */
    public ValueAnimator f149935q;

    /* renamed from: r */
    private float f149936r;

    /* renamed from: s */
    private float f149937s;

    /* renamed from: t */
    private float f149938t;

    /* renamed from: u */
    public float f149939u;

    /* renamed from: v */
    private final int f149940v;

    /* renamed from: w */
    private final int f149941w;

    /* renamed from: x */
    private final int f149942x;

    /* renamed from: y */
    private float f149943y;

    /* renamed from: z */
    boolean f149944z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.CircleBackgroundView$a */
    /* loaded from: classes7.dex */
    public class C32481a extends AnimatorListenerAdapter {
        C32481a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            CircleBackgroundView circleBackgroundView = CircleBackgroundView.this;
            if (!circleBackgroundView.f149944z) {
                circleBackgroundView.f149944z = true;
            }
        }
    }

    public CircleBackgroundView(Context context, int i11, int i12) {
        super(context);
        this.f149934p = new ArrayList();
        this.f149936r = -1.0f;
        this.f149937s = -1.0f;
        this.f149938t = 0.0f;
        this.f149939u = 0.0f;
        this.f149941w = ZAbstractBase.ZVU_PROCESS_FLUSH;
        this.f149931A = false;
        this.f149932B = false;
        this.f149933C = true;
        this.f149940v = i11;
        this.f149942x = i12;
        this.f149944z = false;
        m157297c();
    }

    /* renamed from: b */
    private void m157294b(Canvas canvas) {
        float f11;
        for (int i11 = 0; i11 < this.f149934p.size(); i11++) {
            C18552l c18552l = (C18552l) this.f149934p.get(i11);
            float f12 = c18552l.f93264b * this.f149938t;
            float f13 = 0.0f;
            if (f12 != 0.0f) {
                f11 = f12 / 2.0f;
            } else {
                f11 = 0.0f;
            }
            c18552l.f93263a.setStrokeWidth(f11);
            float f14 = f12 / this.f149938t;
            int i12 = this.f149940v;
            c18552l.f93263a.setAlpha((int) (i12 - (f14 * i12)));
            if (f11 != 0.0f) {
                f13 = f11 / 2.0f;
            }
            canvas.drawCircle(this.f149936r, this.f149937s, f13 + this.f149939u, c18552l.f93263a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m157295d(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        for (int i11 = 0; i11 < this.f149934p.size(); i11++) {
            C18552l c18552l = (C18552l) this.f149934p.get(i11);
            float f11 = animatedFraction - (i11 * this.f149943y);
            if (f11 < 0.0f) {
                if (!this.f149944z) {
                    c18552l.f93264b = 0.0f;
                } else {
                    f11 += 1.0f;
                }
            }
            c18552l.f93264b = f11;
        }
        invalidate();
    }

    /* renamed from: f */
    private void m157296f() {
        if (!this.f149933C) {
            return;
        }
        float f11 = this.f149936r;
        if (f11 <= 0.0f) {
            f11 = -f11;
        }
        float f12 = this.f149937s;
        if (f12 <= 0.0f) {
            f12 = -f12;
        }
        this.f149938t = Math.max(f11, f12) * 1.5f;
    }

    /* renamed from: c */
    public void m157297c() {
        int i11;
        int i12 = 0;
        this.f149931A = false;
        this.f149932B = false;
        this.f149944z = false;
        while (true) {
            i11 = this.f149942x;
            if (i12 >= i11) {
                break;
            }
            this.f149934p.add(new C18552l(this.f149940v));
            i12++;
        }
        this.f149943y = 1.0f / i11;
        if (!this.f149934p.isEmpty()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f149935q = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f149935q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ep0.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircleBackgroundView.this.m157295d(valueAnimator);
                }
            });
            this.f149935q.addListener(new C32481a());
            this.f149935q.setDuration(2000L);
            this.f149935q.setRepeatCount(-1);
            this.f149935q.setRepeatMode(1);
        }
    }

    /* renamed from: e */
    public void m157298e(float f11, float f12) {
        this.f149936r = f11;
        this.f149937s = f12;
    }

    /* renamed from: g */
    public void m157299g() {
        if (!this.f149932B) {
            this.f149932B = true;
            this.f149931A = false;
            this.f149944z = false;
            try {
                this.f149935q.start();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public void m157300h() {
        this.f149932B = false;
        this.f149935q.cancel();
        this.f149944z = false;
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        m157300h();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f149936r < 0.0f) {
            this.f149936r = getWidth() / 2.0f;
        }
        if (this.f149937s < 0.0f) {
            this.f149937s = getHeight() / 2.0f;
        }
        if (this.f149936r >= 0.0f && this.f149937s >= 0.0f) {
            if (!this.f149931A) {
                this.f149931A = true;
                m157296f();
            }
            if (this.f149932B) {
                m157294b(canvas);
                return;
            }
            for (int i11 = 0; i11 < this.f149934p.size(); i11++) {
                canvas.drawCircle(this.f149936r, this.f149937s, 0.0f, ((C18552l) this.f149934p.get(i11)).f93263a);
            }
        }
    }

    public void setMaxRadius(float f11) {
        this.f149938t = f11;
        this.f149933C = false;
    }
}
