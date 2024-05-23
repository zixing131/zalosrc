package t80;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import p500s1.C26087b;

/* renamed from: t80.c */
/* loaded from: classes6.dex */
public class C26590c extends C16716d {

    /* renamed from: M0 */
    int[] f125869M0;

    /* renamed from: N0 */
    int f125870N0;

    /* renamed from: O0 */
    int f125871O0;

    /* renamed from: P0 */
    int f125872P0;

    /* renamed from: Q0 */
    Paint f125873Q0;

    /* renamed from: R0 */
    LinearGradient f125874R0;

    /* renamed from: S0 */
    LinearGradient f125875S0;

    /* renamed from: T0 */
    PathEffect f125876T0;

    /* renamed from: U0 */
    float f125877U0;

    /* renamed from: V0 */
    RectF f125878V0;

    /* renamed from: W0 */
    int f125879W0;

    /* renamed from: X0 */
    Paint f125880X0;

    /* renamed from: Y0 */
    int f125881Y0;

    /* renamed from: Z0 */
    Paint f125882Z0;

    /* renamed from: a1 */
    Drawable f125883a1;

    /* renamed from: b1 */
    int f125884b1;

    /* renamed from: c1 */
    float f125885c1;

    /* renamed from: d1 */
    boolean f125886d1;

    /* renamed from: e1 */
    boolean f125887e1;

    /* renamed from: f1 */
    boolean f125888f1;

    /* renamed from: g1 */
    float f125889g1;

    /* renamed from: h1 */
    int f125890h1;

    /* renamed from: i1 */
    Animator f125891i1;

    /* renamed from: t80.c$a */
    /* loaded from: classes6.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C26590c.this.m136527w1(100);
        }
    }

    public C26590c(Context context) {
        super(context);
        this.f125869M0 = new int[]{-16731905, -15828737, -4168705};
        this.f125870N0 = AbstractC23136l9.m118742r(2.0f);
        this.f125871O0 = AbstractC23136l9.m118742r(2.0f);
        this.f125872P0 = Color.parseColor("#ff9ff0ff");
        this.f125877U0 = 0.0f;
        this.f125881Y0 = -1;
        this.f125884b1 = 0;
        this.f125885c1 = 0.0f;
        this.f125888f1 = true;
        this.f125889g1 = 100.0f;
        this.f125890h1 = IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
        m136525t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m136518u1(ValueAnimator valueAnimator) {
        m136527w1(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ void m136519v1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f125885c1 = floatValue;
        this.f125884b1 = (int) (floatValue * 255.0f);
        invalidate();
    }

    /* renamed from: A1 */
    public void m136520A1(int i11) {
        this.f125870N0 = i11;
        m89106L().m89041Y(this.f125871O0 + this.f125870N0);
        invalidate();
    }

    /* renamed from: B1 */
    public void m136521B1() {
        Animator animator = this.f125891i1;
        if (animator != null && animator.isRunning()) {
            this.f125891i1.end();
        }
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        float f11 = i13;
        int[] m115162v = AbstractC22055v0.m115162v(getContext());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f125875S0 = new LinearGradient(0.0f, 0.0f, 0.0f, f11, m115162v, (float[]) null, tileMode);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f11, this.f125869M0, (float[]) null, tileMode);
        this.f125874R0 = linearGradient;
        Paint paint = this.f125873Q0;
        if (paint != null) {
            if (this.f125886d1) {
                paint.setShader(this.f125875S0);
            } else {
                paint.setShader(linearGradient);
            }
        }
        RectF rectF = this.f125878V0;
        if (rectF == null) {
            int i15 = this.f125870N0;
            this.f125878V0 = new RectF(i15 / 2.0f, i15 / 2.0f, m89114P() - (this.f125870N0 / 2.0f), m89112O() - (this.f125870N0 / 2.0f));
        } else {
            int i16 = this.f125870N0;
            rectF.set(i16 / 2.0f, i16 / 2.0f, m89114P() - (this.f125870N0 / 2.0f), m89112O() - (this.f125870N0 / 2.0f));
        }
    }

    /* renamed from: q1 */
    void m136522q1(Canvas canvas) {
        if (this.f125887e1) {
            float f11 = (this.f125877U0 + 1.0f) % 360.0f;
            this.f125877U0 = f11;
            canvas.rotate(f11, m89114P() / 2.0f, m89112O() / 2.0f);
        }
        canvas.drawArc(this.f125878V0, 270.0f, this.f125889g1 * 3.6f, false, this.f125873Q0);
    }

    /* renamed from: r1 */
    void m136523r1(Canvas canvas) {
        int i11 = this.f125879W0;
        if (i11 > 0 && i11 < 256) {
            canvas.drawCircle(m89114P() / 2.0f, m89112O() / 2.0f, (m89114P() - this.f125870N0) / 2.0f, this.f125880X0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: s */
    public void mo44179s(Canvas canvas) {
        m136526v(canvas);
        super.mo44179s(canvas);
        canvas.save();
        if (this.f125888f1) {
            m136522q1(canvas);
        }
        m136523r1(canvas);
        canvas.restore();
        int m89114P = m89114P();
        int m89112O = m89112O();
        if (this.f125883a1 != null) {
            float intrinsicWidth = r2.getIntrinsicWidth() * this.f125885c1;
            float intrinsicHeight = this.f125883a1.getIntrinsicHeight() * this.f125885c1;
            float f11 = m89114P;
            float f12 = m89112O;
            this.f125883a1.setBounds((int) ((f11 - intrinsicWidth) / 2.0f), (int) ((f12 - intrinsicHeight) / 2.0f), (int) ((f11 + intrinsicWidth) / 2.0f), (int) ((f12 + intrinsicHeight) / 2.0f));
            this.f125883a1.setAlpha(this.f125884b1);
            this.f125883a1.draw(canvas);
        }
        if (this.f125887e1) {
            invalidate();
        }
    }

    /* renamed from: s1 */
    public Animator m136524s1() {
        m136521B1();
        Animator animator = this.f125891i1;
        if (animator != null && animator.isRunning()) {
            this.f125891i1.end();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        ofInt.setDuration(this.f125890h1);
        ofInt.setInterpolator(new C26087b());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t80.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C26590c.this.m136518u1(valueAnimator);
            }
        });
        ofInt.addListener(new a());
        this.f125884b1 = 0;
        this.f125885c1 = 0.0f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: t80.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C26590c.this.m136519v1(valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setStartDelay(100L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setStartDelay(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofInt, ofFloat, ofFloat2);
        this.f125891i1 = animatorSet;
        return animatorSet;
    }

    /* renamed from: t1 */
    void m136525t1() {
        m89106L().m89041Y(this.f125871O0 + this.f125870N0);
        Paint paint = new Paint(1);
        this.f125873Q0 = paint;
        paint.setStrokeWidth(this.f125870N0);
        this.f125873Q0.setColor(this.f125872P0);
        this.f125873Q0.setStyle(Paint.Style.STROKE);
        this.f125876T0 = new DashPathEffect(new float[]{AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f)}, 0.0f);
        Paint paint2 = new Paint(1);
        this.f125880X0 = paint2;
        paint2.setColor(this.f125881Y0);
        this.f125880X0.setAlpha(this.f125879W0);
        Paint paint3 = this.f125880X0;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        Paint paint4 = new Paint(1);
        this.f125882Z0 = paint4;
        paint4.setStyle(style);
        this.f125882Z0.setColor(0);
        this.f125883a1 = AbstractC1388a.m6964f(getContext(), AbstractC16803z.icon_story_feed_success2);
    }

    /* renamed from: v */
    void m136526v(Canvas canvas) {
        canvas.drawCircle(m89114P() / 2.0f, m89112O() / 2.0f, (m89114P() / 2.0f) - this.f125870N0, this.f125882Z0);
    }

    /* renamed from: w1 */
    public void m136527w1(int i11) {
        float f11 = i11;
        if (f11 != this.f125889g1) {
            this.f125889g1 = f11;
            invalidate();
        }
    }

    /* renamed from: x1 */
    public void m136528x1(boolean z11) {
        this.f125886d1 = z11;
        if (z11) {
            this.f125873Q0.setShader(this.f125875S0);
        } else {
            this.f125873Q0.setShader(this.f125874R0);
        }
        invalidate();
    }

    /* renamed from: y1 */
    public void m136529y1(boolean z11) {
        float f11;
        this.f125888f1 = z11;
        if (z11) {
            f11 = 100.0f;
        } else {
            f11 = 0.0f;
        }
        this.f125889g1 = f11;
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: z0 */
    public void mo89161z0(int i11) {
        this.f125882Z0.setColor(i11);
        invalidate();
    }

    /* renamed from: z1 */
    public void m136530z1(boolean z11) {
        PathEffect pathEffect;
        if (z11 != this.f125887e1) {
            this.f125877U0 = 0.0f;
        }
        this.f125887e1 = z11;
        Paint paint = this.f125873Q0;
        if (z11) {
            pathEffect = this.f125876T0;
        } else {
            pathEffect = null;
        }
        paint.setPathEffect(pathEffect);
        invalidate();
    }
}
