package tj0;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.view.animation.Interpolator;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import sj0.C26280e;
import sk0.C26315i;

/* renamed from: tj0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC26719d extends C26280e implements Animatable {

    /* renamed from: Q */
    private int f126714Q;

    /* renamed from: R */
    private int f126715R;

    /* renamed from: S */
    private float f126716S;

    /* renamed from: T */
    private float f126717T;

    /* renamed from: U */
    private float f126718U;

    /* renamed from: V */
    private float f126719V;

    /* renamed from: W */
    private int f126720W;

    /* renamed from: X */
    private int f126721X = 1500;

    /* renamed from: Y */
    private Interpolator f126722Y = C26315i.f124969a.m135444b();

    /* renamed from: Z */
    private int f126723Z = 1;

    /* renamed from: a0 */
    private Paint f126724a0;

    /* renamed from: b0 */
    private final ValueAnimator f126725b0;

    /* renamed from: c0 */
    private final Paint f126726c0;

    public AbstractC26719d() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f126724a0 = paint;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(this.f126721X);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setInterpolator(this.f126722Y);
        this.f126725b0 = valueAnimator;
        Paint paint2 = new Paint();
        paint2.setColor(-65536);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(2.0f);
        this.f126726c0 = paint2;
    }

    /* renamed from: M */
    private final void m137405M() {
        start();
    }

    /* renamed from: N */
    private final void m137406N() {
        stop();
    }

    /* renamed from: O */
    private final void m137407O(int i11) {
        if (this.f126721X == i11) {
            return;
        }
        this.f126721X = i11;
        this.f126725b0.setDuration(i11);
        this.f126714Q |= 32;
    }

    /* renamed from: P */
    private final void m137408P(float f11) {
        float m116583f;
        m116583f = AbstractC22543l.m116583f(f11, getBounds().height());
        if (this.f126719V == m116583f) {
            return;
        }
        this.f126719V = m116583f;
        this.f126714Q |= 8;
    }

    /* renamed from: Q */
    private final void m137409Q(Interpolator interpolator) {
        if (AbstractC19074t.m100204b(this.f126722Y, interpolator)) {
            return;
        }
        this.f126722Y = interpolator;
        this.f126725b0.setInterpolator(interpolator);
        this.f126714Q |= 64;
    }

    /* renamed from: R */
    private final void m137410R(int i11) {
        if (this.f126720W == i11) {
            return;
        }
        this.f126720W = i11;
        this.f126724a0.setColor(i11);
        this.f126714Q |= 16;
    }

    /* renamed from: U */
    private final void m137411U(int i11) {
        if (this.f126715R == i11) {
            return;
        }
        this.f126715R = i11;
        this.f126714Q |= 8388608;
    }

    /* renamed from: V */
    private final void m137412V(float f11) {
        float m116583f;
        m116583f = AbstractC22543l.m116583f(f11, getBounds().width());
        if (this.f126718U == m116583f) {
            return;
        }
        this.f126718U = m116583f;
        this.f126714Q |= 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final float m137413A() {
        return this.f126719V;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final Interpolator m137414B() {
        return this.f126722Y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final Paint m137415C() {
        return this.f126724a0;
    }

    /* renamed from: D */
    public final int m137416D() {
        return this.f126723Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final float m137417E() {
        return this.f126718U;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean m137418F(int i11) {
        return (i11 & this.f126714Q) != 0;
    }

    /* renamed from: G */
    public final boolean m137419G() {
        return this.f126715R == 1;
    }

    /* renamed from: H */
    protected abstract void mo137386H();

    /* renamed from: I */
    public abstract void mo137387I(Canvas canvas);

    /* renamed from: J */
    public final void m137420J() {
        m137406N();
    }

    /* renamed from: K */
    public final void m137421K() {
        if (m137419G()) {
            m137405M();
        } else {
            m137406N();
        }
    }

    /* renamed from: L */
    protected abstract void mo137388L(ZOMLoading zOMLoading);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public final void m137422S(int i11) {
        this.f126714Q = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public final void m137423T(int i11) {
        this.f126723Z = i11;
    }

    /* renamed from: W */
    public final void m137424W(ZOMLoading zOMLoading) {
        AbstractC19074t.m100208f(zOMLoading, "loading");
        m137411U(zOMLoading.mState);
        float f11 = zOMLoading.mWidth;
        this.f126716S = f11;
        this.f126717T = zOMLoading.mHeight;
        m137412V(f11);
        m137408P(this.f126717T);
        m137410R(zOMLoading.mColor);
        m137407O(zOMLoading.mDuration);
        m137409Q(C26315i.f124969a.m135443a(zOMLoading.mTimingFunction));
        mo137388L(zOMLoading);
        mo137386H();
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (isRunning() && mo137389u()) {
            canvas.save();
            m135229f(canvas);
            mo137387I(canvas);
            canvas.restore();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f126725b0.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        AbstractC19074t.m100208f(rect, "bounds");
        super.onBoundsChange(rect);
        m137412V(this.f126716S);
        m137408P(this.f126717T);
        this.f126714Q |= 1;
        mo137386H();
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        int alpha = (int) ((Color.alpha(this.f126720W) * i11) / 255.0f);
        if (alpha == this.f126724a0.getAlpha()) {
            return;
        }
        this.f126714Q |= 2;
        this.f126724a0.setAlpha(alpha);
        mo137386H();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        boolean z11;
        if (!this.f126725b0.isStarted() && this.f126715R == 1 && this.f126725b0.getValues() != null) {
            PropertyValuesHolder[] values = this.f126725b0.getValues();
            AbstractC19074t.m100207e(values, "mAnimator.values");
            if (values.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                this.f126725b0.start();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f126725b0.isStarted()) {
            this.f126725b0.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo137389u() {
        return this.f126718U > 0.0f && this.f126719V > 0.0f && this.f126721X > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final ValueAnimator m137425v() {
        return this.f126725b0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final int m137426w() {
        return this.f126714Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final int m137427x() {
        return this.f126720W;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final Paint m137428y() {
        return this.f126726c0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final int m137429z() {
        return this.f126721X;
    }
}
