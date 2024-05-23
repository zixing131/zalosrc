package zm.voip.widgets;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import bp0.AbstractC3104p;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;
import me0.C23212s8;
import zm.voip.widgets.CircularProgressIndicator;

/* loaded from: classes7.dex */
public class CircularProgressIndicator extends View {

    /* renamed from: A */
    private double f149962A;

    /* renamed from: B */
    public double f149963B;

    /* renamed from: C */
    private int f149964C;

    /* renamed from: D */
    private boolean f149965D;

    /* renamed from: E */
    private boolean f149966E;

    /* renamed from: F */
    private boolean f149967F;

    /* renamed from: G */
    private int f149968G;

    /* renamed from: H */
    private final Interpolator f149969H;

    /* renamed from: I */
    private final Runnable f149970I;

    /* renamed from: p */
    private Handler f149971p;

    /* renamed from: q */
    private ValueAnimator f149972q;

    /* renamed from: r */
    private InterfaceC32485c f149973r;

    /* renamed from: s */
    private Paint f149974s;

    /* renamed from: t */
    private Paint f149975t;

    /* renamed from: u */
    private RectF f149976u;

    /* renamed from: v */
    private TextPaint f149977v;

    /* renamed from: w */
    private String f149978w;

    /* renamed from: x */
    private StaticLayout f149979x;

    /* renamed from: y */
    private final int f149980y;

    /* renamed from: z */
    private int f149981z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.CircularProgressIndicator$a */
    /* loaded from: classes7.dex */
    public class C32483a implements Animator.AnimatorListener {
        C32483a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (CircularProgressIndicator.this.f149973r != null && CircularProgressIndicator.this.f149981z == 360) {
                CircularProgressIndicator.this.f149973r.mo157147b();
            }
            CircularProgressIndicator.this.m157330z();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (CircularProgressIndicator.this.f149973r != null) {
                CircularProgressIndicator.this.f149973r.mo157146a();
            }
        }
    }

    /* renamed from: zm.voip.widgets.CircularProgressIndicator$b */
    /* loaded from: classes7.dex */
    class RunnableC32484b implements Runnable {
        RunnableC32484b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CircularProgressIndicator.this.f149964C > 0 && CircularProgressIndicator.this.f149967F) {
                CircularProgressIndicator circularProgressIndicator = CircularProgressIndicator.this;
                circularProgressIndicator.f149964C--;
                CircularProgressIndicator circularProgressIndicator2 = CircularProgressIndicator.this;
                circularProgressIndicator2.m157318l(String.valueOf(circularProgressIndicator2.f149964C));
                CircularProgressIndicator.this.f149971p.postDelayed(CircularProgressIndicator.this.f149970I, 1000L);
            }
        }
    }

    /* renamed from: zm.voip.widgets.CircularProgressIndicator$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC32485c {
        /* renamed from: a */
        void mo157146a();

        /* renamed from: b */
        void mo157147b();
    }

    public CircularProgressIndicator(Context context, float f11) {
        super(context);
        this.f149978w = null;
        this.f149980y = 270;
        this.f149981z = 0;
        this.f149962A = 0.0d;
        this.f149963B = 100.0d;
        this.f149964C = 5;
        this.f149968G = 1;
        this.f149969H = new LinearInterpolator();
        this.f149970I = new RunnableC32484b();
        m157322r(f11, context);
    }

    /* renamed from: k */
    private void m157317k(int i11, int i12) {
        float max = Math.max(this.f149974s.getStrokeWidth(), this.f149975t.getStrokeWidth()) / 2.0f;
        RectF rectF = this.f149976u;
        rectF.left = max;
        rectF.top = max;
        rectF.right = i11 - max;
        rectF.bottom = i12 - max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m157318l(String str) {
        if (!TextUtils.equals(str, this.f149978w)) {
            this.f149978w = str;
            if (TextUtils.isEmpty(str)) {
                this.f149979x = null;
            } else {
                this.f149979x = new StaticLayout(this.f149978w, this.f149977v, (int) this.f149977v.measureText(this.f149978w), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        }
    }

    /* renamed from: m */
    private void m157319m(Canvas canvas) {
        canvas.drawArc(this.f149976u, 270.0f, this.f149981z, false, this.f149974s);
    }

    /* renamed from: n */
    private void m157320n(Canvas canvas) {
        canvas.drawArc(this.f149976u, 0.0f, 360.0f, false, this.f149975t);
    }

    /* renamed from: p */
    private void m157321p(Canvas canvas) {
        if (this.f149979x != null) {
            canvas.save();
            canvas.translate((canvas.getWidth() - this.f149979x.getWidth()) / 2.0f, (canvas.getHeight() - this.f149979x.getHeight()) / 2.0f);
            this.f149979x.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: r */
    private void m157322r(float f11, Context context) {
        int color = context.getResources().getColor(AbstractC16801x.call_background_progress_avatar);
        int color2 = context.getResources().getColor(AbstractC16801x.call_background_avatar);
        this.f149971p = new Handler();
        this.f149968G = 0;
        this.f149965D = true;
        this.f149966E = false;
        this.f149967F = false;
        Paint paint = new Paint();
        this.f149974s = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f149974s.setStrokeWidth(f11);
        Paint paint2 = this.f149974s;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f149974s.setColor(color);
        this.f149974s.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f149975t = paint3;
        paint3.setStyle(style);
        this.f149975t.setStrokeWidth(f11);
        this.f149975t.setColor(color2);
        this.f149975t.setAntiAlias(true);
        C13704p1 c13704p1 = new C13704p1(1);
        this.f149977v = c13704p1;
        c13704p1.setColor(C23212s8.m119607o(context, AbstractC16781w.CreateGroupCallToastTextColor1));
        this.f149977v.setTextSize(AbstractC23136l9.m118742r(13.0f));
        this.f149976u = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ Double m157323s(float f11, Double d11, Double d12) {
        return Double.valueOf(d11.doubleValue() + ((d12.doubleValue() - d11.doubleValue()) * f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m157324u(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("angle")).intValue();
        if (this.f149981z != intValue) {
            this.f149981z = intValue;
            invalidate();
        }
    }

    /* renamed from: y */
    private void m157325y(double d11, double d12, int i11) {
        if (i11 >= 0 && d11 >= 0.0d && d12 >= 0.0d && d11 <= d12) {
            this.f149974s.setColor(getResources().getColor(AbstractC16801x.call_background_progress_avatar));
            PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("angle", (int) d11, (int) d12);
            ValueAnimator ofObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: ep0.e
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f11, Object obj, Object obj2) {
                    Double m157323s;
                    m157323s = CircularProgressIndicator.m157323s(f11, (Double) obj, (Double) obj2);
                    return m157323s;
                }
            }, Double.valueOf((d11 * 100.0d) / 360.0d), Double.valueOf(this.f149962A));
            this.f149972q = ofObject;
            ofObject.setDuration(i11);
            this.f149972q.setValues(ofInt);
            this.f149972q.setInterpolator(this.f149969H);
            this.f149972q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ep0.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressIndicator.this.m157324u(valueAnimator);
                }
            });
            this.f149972q.addListener(new C32483a());
            this.f149972q.start();
            if (this.f149967F) {
                m157318l(String.valueOf(this.f149964C));
                this.f149971p.postDelayed(this.f149970I, 1000L);
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f149972q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m157320n(canvas);
        m157319m(canvas);
        m157321p(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        m157317k(i11, i12);
    }

    /* renamed from: q */
    public void m157326q(int i11, int i12) {
        m157328w(i11, this.f149963B, i12);
    }

    public void setFillBackgroundEnabled(boolean z11) {
        Paint.Style style;
        if (z11 == this.f149966E) {
            return;
        }
        this.f149966E = z11;
        if (z11) {
            style = Paint.Style.FILL_AND_STROKE;
        } else {
            style = Paint.Style.STROKE;
        }
        this.f149975t.setStyle(style);
        invalidate();
    }

    public void setListener(InterfaceC32485c interfaceC32485c) {
        this.f149973r = interfaceC32485c;
    }

    public void setProgressBackgroundColor(int i11) {
        this.f149975t.setColor(i11);
        invalidate();
    }

    public void setProgressColor(int i11) {
        this.f149974s.setColor(i11);
        invalidate();
    }

    public void setStrokeWidth(float f11) {
        this.f149974s.setStrokeWidth(f11);
        this.f149975t.setStrokeWidth(f11);
    }

    /* renamed from: v */
    public void m157327v() {
        m157328w(0.0d, 0.0d, 0);
    }

    /* renamed from: w */
    public void m157328w(double d11, double d12, int i11) {
        double d13;
        double d14;
        this.f149964C = i11 / 1000;
        if (this.f149968G == 1) {
            double d15 = this.f149963B;
            d13 = -((d12 / d15) * 360.0d);
            d14 = -((d11 / d15) * 360.0d);
        } else {
            double d16 = this.f149963B;
            d13 = (d12 / d16) * 360.0d;
            d14 = (d11 / d16) * 360.0d;
        }
        this.f149962A = Math.min(d12, this.f149963B);
        m157330z();
        if (this.f149965D) {
            m157325y(d14, d13, i11);
        } else {
            this.f149981z = (int) d13;
            invalidate();
        }
    }

    /* renamed from: x */
    public void m157329x(double d11, int i11) {
        m157328w(0.0d, d11, i11);
    }

    /* renamed from: z */
    public void m157330z() {
        ValueAnimator valueAnimator = this.f149972q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f149971p.removeCallbacksAndMessages(null);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149978w = null;
        this.f149980y = 270;
        this.f149981z = 0;
        this.f149962A = 0.0d;
        this.f149963B = 100.0d;
        this.f149964C = 5;
        this.f149968G = 1;
        this.f149969H = new LinearInterpolator();
        this.f149970I = new RunnableC32484b();
        m157322r(AbstractC3104p.m15650a(8.0f), context);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f149978w = null;
        this.f149980y = 270;
        this.f149981z = 0;
        this.f149962A = 0.0d;
        this.f149963B = 100.0d;
        this.f149964C = 5;
        this.f149968G = 1;
        this.f149969H = new LinearInterpolator();
        this.f149970I = new RunnableC32484b();
        m157322r(AbstractC3104p.m15650a(8.0f), context);
    }
}
