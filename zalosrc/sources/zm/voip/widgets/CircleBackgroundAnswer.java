package zm.voip.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import bp0.AbstractC3082b0;
import zm.voip.widgets.CircleBackgroundAnswer;

/* loaded from: classes7.dex */
public class CircleBackgroundAnswer extends View {

    /* renamed from: A */
    private float f149902A;

    /* renamed from: B */
    private float f149903B;

    /* renamed from: C */
    private float f149904C;

    /* renamed from: D */
    private float f149905D;

    /* renamed from: E */
    private float f149906E;

    /* renamed from: F */
    private float f149907F;

    /* renamed from: p */
    private float f149908p;

    /* renamed from: q */
    private float f149909q;

    /* renamed from: r */
    private float f149910r;

    /* renamed from: s */
    private float f149911s;

    /* renamed from: t */
    private Paint f149912t;

    /* renamed from: u */
    private Paint f149913u;

    /* renamed from: v */
    private ValueAnimator f149914v;

    /* renamed from: w */
    private boolean f149915w;

    /* renamed from: x */
    private boolean f149916x;

    /* renamed from: y */
    private boolean f149917y;

    /* renamed from: z */
    private float f149918z;

    public CircleBackgroundAnswer(Context context) {
        super(context);
        this.f149908p = -1.0f;
        this.f149909q = -1.0f;
        this.f149910r = -1.0f;
        this.f149911s = -1.0f;
        this.f149915w = false;
        this.f149916x = false;
        this.f149917y = false;
        this.f149902A = 0.0f;
        this.f149903B = 0.0f;
        this.f149904C = 0.0f;
        this.f149905D = 0.0f;
        this.f149906E = -1.0f;
        this.f149907F = -1.0f;
        m157286d();
    }

    /* renamed from: b */
    private void m157282b(Canvas canvas, float f11) {
        int i11;
        if (f11 < getRadius()) {
            return;
        }
        float f12 = this.f149902A;
        if (f11 > f12) {
            return;
        }
        float f13 = this.f149905D;
        if (f12 > f13 && f11 <= f12) {
            i11 = (int) (((f12 - f11) * 50.0f) / (f12 - f13));
        } else {
            i11 = -1;
        }
        if (i11 >= 0) {
            this.f149912t.setAlpha(i11);
            canvas.drawCircle(this.f149910r, this.f149911s, f11, this.f149912t);
        }
    }

    /* renamed from: c */
    private void m157283c(Canvas canvas) {
        canvas.drawCircle(this.f149910r, this.f149911s, this.f149907F, this.f149913u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m157284e(ValueAnimator valueAnimator) {
        setAnimationProgress(valueAnimator.getAnimatedFraction());
    }

    /* renamed from: g */
    private void m157285g() {
        this.f149902A = getRadius() * 2.0f;
        float radius = getRadius() * 0.5f;
        this.f149903B = radius;
        this.f149904C = this.f149902A + (radius * 2.0f);
        this.f149905D = getRadius();
    }

    private float getRadius() {
        return getDiameter() / 2.0f;
    }

    /* renamed from: d */
    void m157286d() {
        this.f149916x = false;
        this.f149915w = false;
        Paint paint = new Paint(1);
        this.f149912t = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f149912t.setColor(Color.parseColor("#000000"));
        this.f149912t.setAlpha(50);
        Paint paint2 = new Paint(1);
        this.f149913u = paint2;
        paint2.setColor(Color.parseColor("#FFFFFF"));
        this.f149913u.setStyle(Paint.Style.STROKE);
        this.f149913u.setAlpha(50);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f149914v = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ep0.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircleBackgroundAnswer.this.m157284e(valueAnimator);
            }
        });
        this.f149914v.setDuration(1000L);
        this.f149914v.setInterpolator(new LinearInterpolator());
        this.f149914v.setRepeatCount(-1);
        this.f149914v.setRepeatMode(1);
    }

    /* renamed from: f */
    public void m157287f(float f11, float f12) {
        this.f149910r = f11;
        this.f149911s = f12;
    }

    public float getDiameter() {
        return this.f149908p;
    }

    public float getDiameterBackgroundSwipe() {
        return this.f149909q;
    }

    public float getRadiusBackgroundSwipe() {
        return getDiameterBackgroundSwipe() / 2.0f;
    }

    public float getmXCenterCir() {
        return this.f149910r;
    }

    public float getmYCenterCir() {
        return this.f149911s;
    }

    /* renamed from: h */
    public void m157288h() {
        this.f149917y = false;
        m157290j();
        ValueAnimator valueAnimator = this.f149914v;
        if (valueAnimator != null && !this.f149915w && !valueAnimator.isRunning()) {
            AbstractC3082b0.m15421c("CircleBackgroundView", "startAnimation");
            this.f149915w = true;
            this.f149916x = false;
            this.f149914v.start();
        }
    }

    /* renamed from: i */
    public void m157289i() {
        ValueAnimator valueAnimator = this.f149914v;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            m157290j();
            AbstractC3082b0.m15421c("CircleBackgroundView", "stopAnimation");
            this.f149915w = false;
            this.f149914v.cancel();
            this.f149918z = 0.0f;
            invalidate();
        }
    }

    /* renamed from: j */
    public void m157290j() {
        this.f149907F = 0.0f;
        this.f149913u.setStrokeWidth(0.0f);
    }

    /* renamed from: k */
    public void m157291k(float f11) {
        this.f149907F = (this.f149909q / 4.0f) + (f11 / 2.0f);
        this.f149913u.setStrokeWidth(this.f149906E - f11);
        if (getRadiusBackgroundSwipe() - f11 <= 0.0f) {
            m157290j();
        }
        this.f149917y = true;
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        m157289i();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f149908p < 0.0f || this.f149910r < 0.0f || this.f149911s < 0.0f || getRadius() <= 0.0f) {
            return;
        }
        if (!this.f149916x) {
            this.f149916x = true;
            m157285g();
        }
        if (this.f149915w) {
            float f11 = this.f149904C;
            float f12 = this.f149905D;
            float f13 = ((f11 - f12) * this.f149918z) + f12;
            for (int i11 = 0; i11 <= 2; i11++) {
                m157282b(canvas, f13 - (i11 * this.f149903B));
            }
        }
        if (this.f149917y) {
            m157283c(canvas);
        }
    }

    public void setAnimationProgress(float f11) {
        this.f149918z = f11;
        invalidate();
    }

    public void setDiameter(float f11) {
        this.f149908p = f11;
        float f12 = f11 * 3.0f;
        this.f149909q = f12;
        float f13 = f12 / 2.0f;
        this.f149906E = f13;
        this.f149907F = f12 / 4.0f;
        this.f149913u.setStrokeWidth(f13);
    }

    public CircleBackgroundAnswer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149908p = -1.0f;
        this.f149909q = -1.0f;
        this.f149910r = -1.0f;
        this.f149911s = -1.0f;
        this.f149915w = false;
        this.f149916x = false;
        this.f149917y = false;
        this.f149902A = 0.0f;
        this.f149903B = 0.0f;
        this.f149904C = 0.0f;
        this.f149905D = 0.0f;
        this.f149906E = -1.0f;
        this.f149907F = -1.0f;
        m157286d();
    }
}
