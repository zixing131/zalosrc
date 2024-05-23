package com.zing.zalo.zdesign.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import androidx.core.widget.AbstractC1640l;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.C17024o0;
import fn0.AbstractC19074t;
import mi0.C23313a;
import mi0.C23314b;
import p500s1.C26087b;
import ti0.C26702a;
import ui0.C27276c;
import ui0.C27280g;

/* renamed from: com.zing.zalo.zdesign.component.o0 */
/* loaded from: classes7.dex */
public final class C17024o0 {

    /* renamed from: A */
    private final float f87088A;

    /* renamed from: B */
    private final Rect f87089B;

    /* renamed from: C */
    private Context f87090C;

    /* renamed from: D */
    private a f87091D;

    /* renamed from: E */
    private Drawable f87092E;

    /* renamed from: F */
    private int f87093F;

    /* renamed from: G */
    private int f87094G;

    /* renamed from: H */
    private int f87095H;

    /* renamed from: I */
    private int f87096I;

    /* renamed from: J */
    private ValueAnimator f87097J;

    /* renamed from: K */
    private ValueAnimator f87098K;

    /* renamed from: L */
    private float f87099L;

    /* renamed from: M */
    private int f87100M;

    /* renamed from: N */
    private boolean f87101N;

    /* renamed from: a */
    private final RectF f87102a;

    /* renamed from: b */
    private final RectF f87103b;

    /* renamed from: c */
    private final Path f87104c;

    /* renamed from: d */
    private final Path f87105d;

    /* renamed from: e */
    private int f87106e;

    /* renamed from: f */
    private boolean f87107f;

    /* renamed from: g */
    private boolean f87108g;

    /* renamed from: h */
    private boolean f87109h;

    /* renamed from: i */
    private int f87110i;

    /* renamed from: j */
    private int f87111j;

    /* renamed from: k */
    private int f87112k;

    /* renamed from: l */
    private C26702a f87113l;

    /* renamed from: m */
    private Paint f87114m;

    /* renamed from: n */
    private ValueAnimator f87115n;

    /* renamed from: o */
    private ValueAnimator f87116o;

    /* renamed from: p */
    private float f87117p;

    /* renamed from: q */
    private float f87118q;

    /* renamed from: r */
    private float[] f87119r;

    /* renamed from: s */
    private boolean f87120s;

    /* renamed from: t */
    private float f87121t;

    /* renamed from: u */
    private float f87122u;

    /* renamed from: v */
    private int f87123v;

    /* renamed from: w */
    private float f87124w;

    /* renamed from: x */
    private long f87125x;

    /* renamed from: y */
    private final float f87126y;

    /* renamed from: z */
    private final float f87127z;

    /* renamed from: com.zing.zalo.zdesign.component.o0$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo61929a();
    }

    public C17024o0(Context context, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "delegate");
        this.f87102a = new RectF();
        this.f87103b = new RectF();
        this.f87104c = new Path();
        this.f87105d = new Path();
        this.f87109h = true;
        this.f87113l = new C26702a(context, 1);
        this.f87114m = new Paint(1);
        this.f87126y = -90.0f;
        this.f87127z = 360.0f;
        this.f87088A = 100.0f;
        this.f87089B = new Rect();
        this.f87090C = context;
        this.f87091D = aVar;
        this.f87097J = new ValueAnimator();
        this.f87098K = new ValueAnimator();
        this.f87100M = 255;
        this.f87101N = true;
        this.f87091D = aVar;
        m91152e(C23314b.m122698a(context, AbstractC2814h.ProgressBar_Size24_Blue));
        this.f87097J.setInterpolator(new C26087b());
        this.f87097J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.l0

            /* renamed from: q */
            public final /* synthetic */ C17024o0.a f86968q;

            public /* synthetic */ C17016l0(C17024o0.a aVar2) {
                r2 = aVar2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C17024o0.m91124d(C17024o0.this, r2, valueAnimator);
            }
        });
        m91157v();
    }

    /* renamed from: P */
    private final void m91116P() {
        if (this.f87115n == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
            this.f87115n = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setDuration(900L);
            ValueAnimator valueAnimator = this.f87115n;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f87115n;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator3 = this.f87115n;
            AbstractC19074t.m100205c(valueAnimator3);
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.n0
                public /* synthetic */ C17021n0() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    C17024o0.m91117Q(C17024o0.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f87115n;
        if (valueAnimator4 != null) {
            AbstractC19074t.m100205c(valueAnimator4);
            if (!valueAnimator4.isStarted()) {
                ValueAnimator valueAnimator5 = this.f87115n;
                AbstractC19074t.m100205c(valueAnimator5);
                valueAnimator5.start();
            }
        }
    }

    /* renamed from: Q */
    public static final void m91117Q(C17024o0 c17024o0, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c17024o0, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c17024o0.f87117p = ((Float) animatedValue).floatValue();
    }

    /* renamed from: R */
    private final void m91118R() {
        if (this.f87116o == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat((-r1) / 2.0f, this.f87093F);
            this.f87116o = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setDuration(1100L);
            ValueAnimator valueAnimator = this.f87116o;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f87116o;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator3 = this.f87116o;
            AbstractC19074t.m100205c(valueAnimator3);
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.m0
                public /* synthetic */ C17018m0() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    C17024o0.m91119S(C17024o0.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f87116o;
        if (valueAnimator4 != null) {
            AbstractC19074t.m100205c(valueAnimator4);
            if (!valueAnimator4.isStarted()) {
                ValueAnimator valueAnimator5 = this.f87116o;
                AbstractC19074t.m100205c(valueAnimator5);
                valueAnimator5.start();
            }
        }
    }

    /* renamed from: S */
    public static final void m91119S(C17024o0 c17024o0, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c17024o0, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c17024o0.f87118q = ((Float) animatedValue).floatValue();
    }

    /* renamed from: T */
    private final void m91120T() {
        boolean z11;
        float[] fArr;
        if (this.f87106e == EnumC17026p0.HORIZONTAL.m91165c() && this.f87093F == this.f87090C.getResources().getDisplayMetrics().widthPixels) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f87120s = z11;
        m91127h();
        if (this.f87106e == EnumC17026p0.CIRCLE.m91165c()) {
            float m91135q = m91135q(this.f87090C);
            this.f87114m.setStrokeWidth(m91135q);
            RectF rectF = this.f87102a;
            float f11 = m91135q / 2;
            int i11 = this.f87093F;
            rectF.set(f11, f11, i11 - f11, i11 - f11);
            return;
        }
        this.f87114m.setStrokeWidth(C27276c.m139649b(this.f87090C, 4));
        this.f87114m.setStyle(Paint.Style.FILL);
        float dimension = this.f87090C.getResources().getDimension(AbstractC2809c.corner_100);
        if (this.f87120s && !this.f87109h) {
            fArr = new float[]{0.0f, 0.0f, dimension, dimension, dimension, dimension, 0.0f, 0.0f};
        } else {
            fArr = new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
        }
        this.f87119r = fArr;
        this.f87103b.set(0.0f, 0.0f, this.f87093F / 2.0f, this.f87094G);
        Path path = this.f87104c;
        RectF rectF2 = this.f87103b;
        float[] fArr2 = this.f87119r;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("corners");
            fArr2 = null;
        }
        path.addRoundRect(rectF2, fArr2, Path.Direction.CW);
    }

    /* renamed from: d */
    public static final void m91124d(C17024o0 c17024o0, a aVar, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c17024o0, "this$0");
        AbstractC19074t.m100208f(aVar, "$delegate");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        c17024o0.f87099L = floatValue;
        c17024o0.f87124w = floatValue;
        c17024o0.f87123v = (int) floatValue;
        if (c17024o0.f87101N) {
            aVar.mo61929a();
        }
    }

    /* renamed from: f */
    private final float m91125f(float f11) {
        float f12 = this.f87088A;
        if (f11 == f12) {
            return this.f87127z;
        }
        return this.f87127z * ((f11 / f12) - (this.f87114m.getStrokeWidth() / ((float) ((this.f87093F * 6.283185307179586d) / 2))));
    }

    /* renamed from: g */
    private final float m91126g(float f11) {
        return this.f87093F * (f11 / this.f87088A);
    }

    /* renamed from: h */
    private final void m91127h() {
        float f11;
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (this.f87106e == EnumC17026p0.CIRCLE.m91165c()) {
            gradientDrawable.setShape(1);
            gradientDrawable.setStroke(m91135q(this.f87090C), this.f87111j);
        } else {
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(this.f87111j);
            if (!this.f87120s) {
                f11 = this.f87090C.getResources().getDimension(AbstractC2809c.corner_100);
            } else {
                f11 = 0.0f;
            }
            gradientDrawable.setCornerRadii(new float[]{f11, f11, f11, f11, f11, f11, f11, f11});
        }
        this.f87092E = gradientDrawable;
    }

    /* renamed from: j */
    private final void m91128j(float f11, Canvas canvas, Paint paint) {
        if (canvas != null) {
            canvas.drawArc(this.f87102a, this.f87126y, f11, false, paint);
        }
    }

    /* renamed from: k */
    private final void m91129k(Canvas canvas) {
        if (this.f87093F >= C27276c.m139649b(this.f87090C, 24) && this.f87108g) {
            Drawable m139658a = C27280g.m139658a(this.f87090C, AbstractC2810d.zds_ic_close_line_16);
            if (m139658a != null) {
                m139658a.setTint(this.f87112k);
            } else {
                m139658a = null;
            }
            if (m139658a != null) {
                int minimumWidth = (this.f87093F - m139658a.getMinimumWidth()) / 2;
                m139658a.setBounds(minimumWidth, minimumWidth, m139658a.getMinimumWidth() + minimumWidth, m139658a.getMinimumWidth() + minimumWidth);
                m139658a.draw(canvas);
            }
        }
    }

    /* renamed from: l */
    private final void m91130l(Canvas canvas) {
        m91116P();
        canvas.save();
        float f11 = this.f87117p;
        int i11 = this.f87093F;
        canvas.rotate(f11, i11 / 2.0f, i11 / 2.0f);
        canvas.drawArc(this.f87102a, -90.0f, 90.0f, false, this.f87114m);
        canvas.restore();
        if (this.f87101N) {
            this.f87091D.mo61929a();
        }
    }

    /* renamed from: m */
    private final void m91131m(Canvas canvas) {
        m91118R();
        canvas.save();
        canvas.translate(this.f87118q, 0.0f);
        canvas.drawPath(this.f87104c, this.f87114m);
        canvas.restore();
        if (this.f87101N) {
            this.f87091D.mo61929a();
        }
    }

    /* renamed from: n */
    private final void m91132n(Canvas canvas) {
        float m91125f = m91125f(this.f87124w);
        this.f87121t = m91125f;
        if (this.f87107f) {
            m91134p(canvas);
            m91128j(-this.f87121t, canvas, this.f87114m);
        } else {
            m91128j(m91125f, canvas, this.f87114m);
        }
    }

    /* renamed from: o */
    private final void m91133o(Canvas canvas) {
        float m91126g = m91126g(this.f87124w);
        this.f87122u = m91126g;
        this.f87103b.set(0.0f, 0.0f, m91126g, this.f87094G);
        this.f87105d.reset();
        Path path = this.f87105d;
        RectF rectF = this.f87103b;
        float[] fArr = this.f87119r;
        if (fArr == null) {
            AbstractC19074t.m100223u("corners");
            fArr = null;
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f87105d, this.f87114m);
    }

    /* renamed from: p */
    private final void m91134p(Canvas canvas) {
        if (!this.f87109h && this.f87107f) {
            String valueOf = String.valueOf(this.f87125x);
            this.f87113l.getTextBounds(valueOf, 0, valueOf.length(), this.f87089B);
            int centerX = (this.f87093F / 2) - this.f87089B.centerX();
            int centerY = (this.f87094G / 2) - this.f87089B.centerY();
            AbstractC19074t.m100205c(canvas);
            canvas.drawText(valueOf, centerX, centerY, this.f87113l);
        }
    }

    /* renamed from: q */
    private final int m91135q(Context context) {
        if (this.f87106e != EnumC17026p0.CIRCLE.m91165c()) {
            return 0;
        }
        int i11 = this.f87093F;
        if (i11 == C27276c.m139649b(context, 16)) {
            return C27276c.m139649b(context, 2);
        }
        if (i11 == C27276c.m139649b(context, 24)) {
            return C27276c.m139648a(context, 2.5f);
        }
        if (i11 == C27276c.m139649b(context, 32)) {
            return C27276c.m139649b(context, 3);
        }
        return C27276c.m139649b(context, 3);
    }

    /* renamed from: u */
    private final float m91136u(Context context) {
        if (this.f87106e != EnumC17026p0.CIRCLE.m91165c()) {
            return 0.0f;
        }
        RobotoTextView robotoTextView = new RobotoTextView(context);
        int i11 = this.f87110i;
        if (i11 == C27276c.m139649b(context, 16)) {
            return 0.0f;
        }
        if (i11 == C27276c.m139649b(context, 24)) {
            AbstractC1640l.m8424o(robotoTextView, AbstractC2814h.t_xxsmall_m);
            return robotoTextView.getTextSize();
        }
        AbstractC1640l.m8424o(robotoTextView, AbstractC2814h.t_small_m);
        return robotoTextView.getTextSize();
    }

    /* renamed from: A */
    public final void m91137A(boolean z11) {
        this.f87109h = z11;
    }

    /* renamed from: B */
    public final void m91138B(int i11, int i12) {
        this.f87095H = i11;
        this.f87096I = i12;
    }

    /* renamed from: C */
    public final void m91139C(float f11, boolean z11) {
        if (this.f87124w != f11) {
            this.f87124w = Math.max(f11, 0.0f);
            float min = Math.min(f11, 100.0f);
            this.f87124w = min;
            if (z11) {
                this.f87097J.cancel();
                this.f87097J.setDuration(800L);
                this.f87097J.setFloatValues(this.f87099L, this.f87124w);
                this.f87097J.start();
            } else {
                this.f87123v = (int) min;
                this.f87099L = min;
            }
            if (this.f87101N) {
                this.f87091D.mo61929a();
            }
        }
    }

    /* renamed from: D */
    public final void m91140D(int i11, boolean z11) {
        m91139C(i11, z11);
    }

    /* renamed from: E */
    public final void m91141E(int i11) {
        this.f87111j = i11;
        m91127h();
        if (this.f87101N) {
            this.f87091D.mo61929a();
        }
    }

    /* renamed from: F */
    public final void m91142F(int i11) {
        this.f87110i = i11;
    }

    /* renamed from: G */
    public final void m91143G(int i11) {
        this.f87112k = i11;
        if (this.f87101N) {
            this.f87091D.mo61929a();
        }
    }

    /* renamed from: H */
    public final void m91144H(int i11) {
        this.f87114m.setColor(i11);
        if (this.f87101N) {
            this.f87091D.mo61929a();
        }
    }

    /* renamed from: I */
    public final void m91145I(int i11) {
        this.f87113l.setColor(i11);
        if (this.f87101N) {
            this.f87091D.mo61929a();
        }
    }

    /* renamed from: J */
    public final void m91146J(int i11) {
        this.f87106e = i11;
    }

    /* renamed from: K */
    public final void m91147K(boolean z11) {
        this.f87101N = z11;
    }

    /* renamed from: L */
    public final void m91148L(boolean z11) {
        this.f87108g = z11;
    }

    /* renamed from: M */
    public final void m91149M(int i11, int i12) {
        this.f87093F = i11;
        this.f87094G = i12;
        m91120T();
    }

    /* renamed from: N */
    public final void m91150N(long j11) {
        this.f87125x = j11;
    }

    /* renamed from: O */
    public final void m91151O(boolean z11) {
        this.f87108g = z11;
        if (this.f87101N) {
            this.f87091D.mo61929a();
        }
    }

    /* renamed from: e */
    public final void m91152e(C23313a c23313a) {
        AbstractC19074t.m100208f(c23313a, "progressBarStyle");
        this.f87110i = c23313a.m122694e();
        this.f87107f = c23313a.m122697h();
        this.f87106e = c23313a.m122695f();
        this.f87109h = c23313a.m122692c();
        this.f87111j = c23313a.m122690a();
        this.f87112k = c23313a.m122691b();
        this.f87114m.setColor(c23313a.m122693d());
        this.f87113l.setColor(c23313a.m122696g());
        if (this.f87106e == EnumC17026p0.CIRCLE.m91165c()) {
            int i11 = this.f87110i;
            m91149M(i11, i11);
        } else {
            m91149M(this.f87093F, this.f87110i);
        }
        m91157v();
    }

    /* renamed from: i */
    public final void m91153i(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!this.f87101N) {
            return;
        }
        canvas.save();
        canvas.translate(this.f87095H, this.f87096I);
        Drawable drawable = this.f87092E;
        if (drawable != null) {
            drawable.setAlpha(this.f87100M);
        }
        this.f87113l.setAlpha(this.f87100M);
        this.f87114m.setAlpha(this.f87100M);
        Drawable drawable2 = this.f87092E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.f87093F, this.f87094G);
        }
        Drawable drawable3 = this.f87092E;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        if (this.f87109h) {
            if (this.f87106e == EnumC17026p0.CIRCLE.m91165c()) {
                m91130l(canvas);
            } else {
                m91131m(canvas);
            }
        } else if (this.f87106e == EnumC17026p0.CIRCLE.m91165c()) {
            m91129k(canvas);
            m91132n(canvas);
        } else {
            m91133o(canvas);
        }
        canvas.restore();
    }

    /* renamed from: r */
    public final int m91154r() {
        return this.f87123v;
    }

    /* renamed from: s */
    public final int m91155s() {
        return this.f87110i;
    }

    /* renamed from: t */
    public final int m91156t() {
        return this.f87106e;
    }

    /* renamed from: v */
    public final void m91157v() {
        this.f87113l.m137272b();
        this.f87113l.m137273c(m91136u(this.f87090C), false);
        this.f87114m.setStyle(Paint.Style.STROKE);
        this.f87114m.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: w */
    public final boolean m91158w() {
        return this.f87109h;
    }

    /* renamed from: x */
    public final void m91159x() {
        this.f87123v = 0;
        this.f87124w = 0.0f;
        this.f87099L = 0.0f;
        this.f87097J.cancel();
        this.f87098K.cancel();
        ValueAnimator valueAnimator = this.f87115n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f87116o;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* renamed from: y */
    public final void m91160y(boolean z11) {
        this.f87107f = z11;
    }

    /* renamed from: z */
    public final void m91161z(int i11) {
        this.f87100M = i11;
    }
}
