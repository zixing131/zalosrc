package u20;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p500s1.C26087b;

/* renamed from: u20.b */
/* loaded from: classes5.dex */
public class C26981b extends Drawable implements Animatable {

    /* renamed from: v */
    private static final Interpolator f127579v = new LinearInterpolator();

    /* renamed from: w */
    private static final Interpolator f127580w = new C26087b();

    /* renamed from: x */
    private static final int[] f127581x = {-16777216};

    /* renamed from: p */
    private final c f127582p;

    /* renamed from: q */
    private float f127583q;

    /* renamed from: r */
    private Resources f127584r;

    /* renamed from: s */
    private Animator f127585s;

    /* renamed from: t */
    float f127586t;

    /* renamed from: u */
    boolean f127587u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u20.b$a */
    /* loaded from: classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: p */
        final /* synthetic */ c f127588p;

        a(c cVar) {
            this.f127588p = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C26981b.this.m139054s(floatValue, this.f127588p);
            C26981b.this.m139042c(floatValue, this.f127588p, false);
            C26981b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u20.b$b */
    /* loaded from: classes5.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ c f127590p;

        b(c cVar) {
            this.f127590p = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C26981b.this.m139042c(1.0f, this.f127590p, true);
            this.f127590p.m139057C();
            this.f127590p.m139071n();
            C26981b c26981b = C26981b.this;
            if (c26981b.f127587u) {
                c26981b.f127587u = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f127590p.m139083z(false);
                return;
            }
            c26981b.f127586t += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C26981b.this.f127586t = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u20.b$c */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a */
        final RectF f127592a = new RectF();

        /* renamed from: b */
        final Paint f127593b;

        /* renamed from: c */
        final Paint f127594c;

        /* renamed from: d */
        final Paint f127595d;

        /* renamed from: e */
        float f127596e;

        /* renamed from: f */
        float f127597f;

        /* renamed from: g */
        float f127598g;

        /* renamed from: h */
        float f127599h;

        /* renamed from: i */
        int[] f127600i;

        /* renamed from: j */
        int f127601j;

        /* renamed from: k */
        float f127602k;

        /* renamed from: l */
        float f127603l;

        /* renamed from: m */
        float f127604m;

        /* renamed from: n */
        boolean f127605n;

        /* renamed from: o */
        Path f127606o;

        /* renamed from: p */
        float f127607p;

        /* renamed from: q */
        float f127608q;

        /* renamed from: r */
        int f127609r;

        /* renamed from: s */
        int f127610s;

        /* renamed from: t */
        int f127611t;

        /* renamed from: u */
        int f127612u;

        c() {
            Paint paint = new Paint();
            this.f127593b = paint;
            Paint paint2 = new Paint();
            this.f127594c = paint2;
            Paint paint3 = new Paint();
            this.f127595d = paint3;
            this.f127596e = 0.0f;
            this.f127597f = 0.0f;
            this.f127598g = 0.0f;
            this.f127599h = 5.0f;
            this.f127607p = 1.0f;
            this.f127611t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m139055A(float f11) {
            this.f127596e = f11;
        }

        /* renamed from: B */
        void m139056B(float f11) {
            this.f127599h = f11;
            this.f127593b.setStrokeWidth(f11);
        }

        /* renamed from: C */
        void m139057C() {
            this.f127602k = this.f127596e;
            this.f127603l = this.f127597f;
            this.f127604m = this.f127598g;
        }

        /* renamed from: a */
        void m139058a(Canvas canvas, Rect rect) {
            RectF rectF = this.f127592a;
            float f11 = this.f127608q;
            float f12 = (this.f127599h / 2.0f) + f11;
            if (f11 <= 0.0f) {
                f12 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f127609r * this.f127607p) / 2.0f, this.f127599h / 2.0f);
            }
            rectF.set(rect.centerX() - f12, rect.centerY() - f12, rect.centerX() + f12, rect.centerY() + f12);
            float f13 = this.f127596e;
            float f14 = this.f127598g;
            float f15 = (f13 + f14) * 360.0f;
            float f16 = ((this.f127597f + f14) * 360.0f) - f15;
            this.f127593b.setColor(this.f127612u);
            this.f127593b.setAlpha(this.f127611t);
            float f17 = this.f127599h / 2.0f;
            rectF.inset(f17, f17);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f127595d);
            float f18 = -f17;
            rectF.inset(f18, f18);
            canvas.drawArc(rectF, f15, f16, false, this.f127593b);
            m139059b(canvas, f15, f16, rectF);
        }

        /* renamed from: b */
        void m139059b(Canvas canvas, float f11, float f12, RectF rectF) {
            if (this.f127605n) {
                Path path = this.f127606o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f127606o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f13 = (this.f127609r * this.f127607p) / 2.0f;
                this.f127606o.moveTo(0.0f, 0.0f);
                this.f127606o.lineTo(this.f127609r * this.f127607p, 0.0f);
                Path path3 = this.f127606o;
                float f14 = this.f127609r;
                float f15 = this.f127607p;
                path3.lineTo((f14 * f15) / 2.0f, this.f127610s * f15);
                this.f127606o.offset((min + rectF.centerX()) - f13, rectF.centerY() + (this.f127599h / 2.0f));
                this.f127606o.close();
                this.f127594c.setColor(this.f127612u);
                this.f127594c.setAlpha(this.f127611t);
                canvas.save();
                canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f127606o, this.f127594c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m139060c() {
            return this.f127611t;
        }

        /* renamed from: d */
        float m139061d() {
            return this.f127597f;
        }

        /* renamed from: e */
        int m139062e() {
            return this.f127600i[m139063f()];
        }

        /* renamed from: f */
        int m139063f() {
            return (this.f127601j + 1) % this.f127600i.length;
        }

        /* renamed from: g */
        float m139064g() {
            return this.f127598g;
        }

        /* renamed from: h */
        boolean m139065h() {
            return this.f127605n;
        }

        /* renamed from: i */
        float m139066i() {
            return this.f127596e;
        }

        /* renamed from: j */
        int m139067j() {
            return this.f127600i[this.f127601j];
        }

        /* renamed from: k */
        float m139068k() {
            return this.f127603l;
        }

        /* renamed from: l */
        float m139069l() {
            return this.f127604m;
        }

        /* renamed from: m */
        float m139070m() {
            return this.f127602k;
        }

        /* renamed from: n */
        void m139071n() {
            m139079v(m139063f());
        }

        /* renamed from: o */
        void m139072o() {
            this.f127602k = 0.0f;
            this.f127603l = 0.0f;
            this.f127604m = 0.0f;
            m139055A(0.0f);
            m139081x(0.0f);
            m139082y(0.0f);
        }

        /* renamed from: p */
        void m139073p(int i11) {
            this.f127611t = i11;
        }

        /* renamed from: q */
        void m139074q(float f11, float f12) {
            this.f127609r = (int) f11;
            this.f127610s = (int) f12;
        }

        /* renamed from: r */
        void m139075r(float f11) {
            if (f11 != this.f127607p) {
                this.f127607p = f11;
            }
        }

        /* renamed from: s */
        void m139076s(float f11) {
            this.f127608q = f11;
        }

        /* renamed from: t */
        void m139077t(int i11) {
            this.f127612u = i11;
        }

        /* renamed from: u */
        void m139078u(ColorFilter colorFilter) {
            this.f127593b.setColorFilter(colorFilter);
        }

        /* renamed from: v */
        void m139079v(int i11) {
            this.f127601j = i11;
            this.f127612u = this.f127600i[i11];
        }

        /* renamed from: w */
        void m139080w(int[] iArr) {
            this.f127600i = iArr;
            m139079v(0);
        }

        /* renamed from: x */
        void m139081x(float f11) {
            this.f127597f = f11;
        }

        /* renamed from: y */
        void m139082y(float f11) {
            this.f127598g = f11;
        }

        /* renamed from: z */
        void m139083z(boolean z11) {
            if (this.f127605n != z11) {
                this.f127605n = z11;
            }
        }
    }

    public C26981b(Context context) {
        this.f127584r = context.getResources();
        c cVar = new c();
        this.f127582p = cVar;
        cVar.m139080w(f127581x);
        m139052p(2.5f);
        m139041r();
    }

    /* renamed from: b */
    private void m139037b(float f11, c cVar) {
        m139054s(f11, cVar);
        float floor = (float) (Math.floor(cVar.m139069l() / 0.8f) + 1.0d);
        cVar.m139055A(cVar.m139070m() + (((cVar.m139068k() - 0.01f) - cVar.m139070m()) * f11));
        cVar.m139081x(cVar.m139068k());
        cVar.m139082y(cVar.m139069l() + ((floor - cVar.m139069l()) * f11));
    }

    /* renamed from: d */
    private int m139038d(float f11, int i11, int i12) {
        return ((((i11 >> 24) & 255) + ((int) ((((i12 >> 24) & 255) - r0) * f11))) << 24) | ((((i11 >> 16) & 255) + ((int) ((((i12 >> 16) & 255) - r1) * f11))) << 16) | ((((i11 >> 8) & 255) + ((int) ((((i12 >> 8) & 255) - r2) * f11))) << 8) | ((i11 & 255) + ((int) (f11 * ((i12 & 255) - r8))));
    }

    /* renamed from: m */
    private void m139039m(float f11) {
        this.f127583q = f11;
    }

    /* renamed from: n */
    private void m139040n(float f11, float f12, float f13, float f14) {
        c cVar = this.f127582p;
        float f15 = this.f127584r.getDisplayMetrics().density;
        cVar.m139056B(f12 * f15);
        cVar.m139076s(f11 * f15);
        cVar.m139079v(0);
        cVar.m139074q(f13 * f15, f14 * f15);
    }

    /* renamed from: r */
    private void m139041r() {
        c cVar = this.f127582p;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f127579v);
        ofFloat.addListener(new b(cVar));
        this.f127585s = ofFloat;
    }

    /* renamed from: c */
    void m139042c(float f11, c cVar, boolean z11) {
        float interpolation;
        float f12;
        if (this.f127587u) {
            m139037b(f11, cVar);
            return;
        }
        if (f11 != 1.0f || z11) {
            float m139069l = cVar.m139069l();
            if (f11 < 0.5f) {
                interpolation = cVar.m139070m();
                f12 = (f127580w.getInterpolation(f11 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m139070m = cVar.m139070m() + 0.79f;
                interpolation = m139070m - (((1.0f - f127580w.getInterpolation((f11 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = m139070m;
            }
            float f13 = m139069l + (0.20999998f * f11);
            float f14 = (f11 + this.f127586t) * 216.0f;
            cVar.m139055A(interpolation);
            cVar.m139081x(f12);
            cVar.m139082y(f13);
            m139039m(f14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f127583q, bounds.exactCenterX(), bounds.exactCenterY());
        this.f127582p.m139058a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public boolean m139043e() {
        return this.f127582p.m139065h();
    }

    /* renamed from: f */
    public float m139044f() {
        return this.f127582p.m139061d();
    }

    /* renamed from: g */
    public float m139045g() {
        return this.f127582p.m139064g();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f127582p.m139060c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float m139046h() {
        return this.f127582p.m139066i();
    }

    /* renamed from: i */
    public void m139047i(boolean z11) {
        this.f127582p.m139083z(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f127585s.isRunning();
    }

    /* renamed from: j */
    public void m139048j(float f11) {
        this.f127582p.m139075r(f11);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m139049k(int... iArr) {
        this.f127582p.m139080w(iArr);
        this.f127582p.m139079v(0);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m139050l(float f11) {
        this.f127582p.m139082y(f11);
        invalidateSelf();
    }

    /* renamed from: o */
    public void m139051o(float f11, float f12) {
        this.f127582p.m139055A(f11);
        this.f127582p.m139081x(f12);
        invalidateSelf();
    }

    /* renamed from: p */
    public void m139052p(float f11) {
        this.f127582p.m139056B(f11);
        invalidateSelf();
    }

    /* renamed from: q */
    public void m139053q(int i11) {
        if (i11 == 0) {
            m139040n(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m139040n(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: s */
    void m139054s(float f11, c cVar) {
        if (f11 > 0.75f) {
            cVar.m139077t(m139038d((f11 - 0.75f) / 0.25f, cVar.m139067j(), cVar.m139062e()));
        } else {
            cVar.m139077t(cVar.m139067j());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f127582p.m139073p(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f127582p.m139078u(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f127585s.cancel();
        this.f127582p.m139057C();
        if (this.f127582p.m139061d() != this.f127582p.m139066i()) {
            this.f127587u = true;
            this.f127585s.setDuration(666L);
            this.f127585s.start();
        } else {
            this.f127582p.m139079v(0);
            this.f127582p.m139072o();
            this.f127585s.setDuration(1332L);
            this.f127585s.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f127585s.cancel();
        m139039m(0.0f);
        this.f127582p.m139083z(false);
        this.f127582p.m139079v(0);
        this.f127582p.m139072o();
        invalidateSelf();
    }
}
