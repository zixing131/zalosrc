package androidx.swiperefreshlayout.widget;

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
import androidx.core.util.AbstractC1487i;
import p500s1.C26087b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes2.dex */
public class C1957b extends Drawable implements Animatable {

    /* renamed from: v */
    private static final Interpolator f8334v = new LinearInterpolator();

    /* renamed from: w */
    private static final Interpolator f8335w = new C26087b();

    /* renamed from: x */
    private static final int[] f8336x = {-16777216};

    /* renamed from: p */
    private final c f8337p;

    /* renamed from: q */
    private float f8338q;

    /* renamed from: r */
    private Resources f8339r;

    /* renamed from: s */
    private Animator f8340s;

    /* renamed from: t */
    float f8341t;

    /* renamed from: u */
    boolean f8342u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: p */
        final /* synthetic */ c f8343p;

        a(c cVar) {
            this.f8343p = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1957b.this.m10781o(floatValue, this.f8343p);
            C1957b.this.m10773c(floatValue, this.f8343p, false);
            C1957b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* loaded from: classes2.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ c f8345p;

        b(c cVar) {
            this.f8345p = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C1957b.this.m10773c(1.0f, this.f8345p, true);
            this.f8345p.m10782A();
            this.f8345p.m10794l();
            C1957b c1957b = C1957b.this;
            if (c1957b.f8342u) {
                c1957b.f8342u = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f8345p.m10806x(false);
                return;
            }
            c1957b.f8341t += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1957b.this.f8341t = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        final RectF f8347a = new RectF();

        /* renamed from: b */
        final Paint f8348b;

        /* renamed from: c */
        final Paint f8349c;

        /* renamed from: d */
        final Paint f8350d;

        /* renamed from: e */
        float f8351e;

        /* renamed from: f */
        float f8352f;

        /* renamed from: g */
        float f8353g;

        /* renamed from: h */
        float f8354h;

        /* renamed from: i */
        int[] f8355i;

        /* renamed from: j */
        int f8356j;

        /* renamed from: k */
        float f8357k;

        /* renamed from: l */
        float f8358l;

        /* renamed from: m */
        float f8359m;

        /* renamed from: n */
        boolean f8360n;

        /* renamed from: o */
        Path f8361o;

        /* renamed from: p */
        float f8362p;

        /* renamed from: q */
        float f8363q;

        /* renamed from: r */
        int f8364r;

        /* renamed from: s */
        int f8365s;

        /* renamed from: t */
        int f8366t;

        /* renamed from: u */
        int f8367u;

        c() {
            Paint paint = new Paint();
            this.f8348b = paint;
            Paint paint2 = new Paint();
            this.f8349c = paint2;
            Paint paint3 = new Paint();
            this.f8350d = paint3;
            this.f8351e = 0.0f;
            this.f8352f = 0.0f;
            this.f8353g = 0.0f;
            this.f8354h = 5.0f;
            this.f8362p = 1.0f;
            this.f8366t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m10782A() {
            this.f8357k = this.f8351e;
            this.f8358l = this.f8352f;
            this.f8359m = this.f8353g;
        }

        /* renamed from: a */
        void m10783a(Canvas canvas, Rect rect) {
            RectF rectF = this.f8347a;
            float f11 = this.f8363q;
            float f12 = (this.f8354h / 2.0f) + f11;
            if (f11 <= 0.0f) {
                f12 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f8364r * this.f8362p) / 2.0f, this.f8354h / 2.0f);
            }
            rectF.set(rect.centerX() - f12, rect.centerY() - f12, rect.centerX() + f12, rect.centerY() + f12);
            float f13 = this.f8351e;
            float f14 = this.f8353g;
            float f15 = (f13 + f14) * 360.0f;
            float f16 = ((this.f8352f + f14) * 360.0f) - f15;
            this.f8348b.setColor(this.f8367u);
            this.f8348b.setAlpha(this.f8366t);
            float f17 = this.f8354h / 2.0f;
            rectF.inset(f17, f17);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f8350d);
            float f18 = -f17;
            rectF.inset(f18, f18);
            canvas.drawArc(rectF, f15, f16, false, this.f8348b);
            m10784b(canvas, f15, f16, rectF);
        }

        /* renamed from: b */
        void m10784b(Canvas canvas, float f11, float f12, RectF rectF) {
            if (this.f8360n) {
                Path path = this.f8361o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f8361o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f13 = (this.f8364r * this.f8362p) / 2.0f;
                this.f8361o.moveTo(0.0f, 0.0f);
                this.f8361o.lineTo(this.f8364r * this.f8362p, 0.0f);
                Path path3 = this.f8361o;
                float f14 = this.f8364r;
                float f15 = this.f8362p;
                path3.lineTo((f14 * f15) / 2.0f, this.f8365s * f15);
                this.f8361o.offset((min + rectF.centerX()) - f13, rectF.centerY() + (this.f8354h / 2.0f));
                this.f8361o.close();
                this.f8349c.setColor(this.f8367u);
                this.f8349c.setAlpha(this.f8366t);
                canvas.save();
                canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f8361o, this.f8349c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m10785c() {
            return this.f8366t;
        }

        /* renamed from: d */
        float m10786d() {
            return this.f8352f;
        }

        /* renamed from: e */
        int m10787e() {
            return this.f8355i[m10788f()];
        }

        /* renamed from: f */
        int m10788f() {
            return (this.f8356j + 1) % this.f8355i.length;
        }

        /* renamed from: g */
        float m10789g() {
            return this.f8351e;
        }

        /* renamed from: h */
        int m10790h() {
            return this.f8355i[this.f8356j];
        }

        /* renamed from: i */
        float m10791i() {
            return this.f8358l;
        }

        /* renamed from: j */
        float m10792j() {
            return this.f8359m;
        }

        /* renamed from: k */
        float m10793k() {
            return this.f8357k;
        }

        /* renamed from: l */
        void m10794l() {
            m10802t(m10788f());
        }

        /* renamed from: m */
        void m10795m() {
            this.f8357k = 0.0f;
            this.f8358l = 0.0f;
            this.f8359m = 0.0f;
            m10807y(0.0f);
            m10804v(0.0f);
            m10805w(0.0f);
        }

        /* renamed from: n */
        void m10796n(int i11) {
            this.f8366t = i11;
        }

        /* renamed from: o */
        void m10797o(float f11, float f12) {
            this.f8364r = (int) f11;
            this.f8365s = (int) f12;
        }

        /* renamed from: p */
        void m10798p(float f11) {
            if (f11 != this.f8362p) {
                this.f8362p = f11;
            }
        }

        /* renamed from: q */
        void m10799q(float f11) {
            this.f8363q = f11;
        }

        /* renamed from: r */
        void m10800r(int i11) {
            this.f8367u = i11;
        }

        /* renamed from: s */
        void m10801s(ColorFilter colorFilter) {
            this.f8348b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m10802t(int i11) {
            this.f8356j = i11;
            this.f8367u = this.f8355i[i11];
        }

        /* renamed from: u */
        void m10803u(int[] iArr) {
            this.f8355i = iArr;
            m10802t(0);
        }

        /* renamed from: v */
        void m10804v(float f11) {
            this.f8352f = f11;
        }

        /* renamed from: w */
        void m10805w(float f11) {
            this.f8353g = f11;
        }

        /* renamed from: x */
        void m10806x(boolean z11) {
            if (this.f8360n != z11) {
                this.f8360n = z11;
            }
        }

        /* renamed from: y */
        void m10807y(float f11) {
            this.f8351e = f11;
        }

        /* renamed from: z */
        void m10808z(float f11) {
            this.f8354h = f11;
            this.f8348b.setStrokeWidth(f11);
        }
    }

    public C1957b(Context context) {
        this.f8339r = ((Context) AbstractC1487i.m7492g(context)).getResources();
        c cVar = new c();
        this.f8337p = cVar;
        cVar.m10803u(f8336x);
        m10779l(2.5f);
        m10772n();
    }

    /* renamed from: b */
    private void m10768b(float f11, c cVar) {
        m10781o(f11, cVar);
        float floor = (float) (Math.floor(cVar.m10792j() / 0.8f) + 1.0d);
        cVar.m10807y(cVar.m10793k() + (((cVar.m10791i() - 0.01f) - cVar.m10793k()) * f11));
        cVar.m10804v(cVar.m10791i());
        cVar.m10805w(cVar.m10792j() + ((floor - cVar.m10792j()) * f11));
    }

    /* renamed from: d */
    private int m10769d(float f11, int i11, int i12) {
        return ((((i11 >> 24) & 255) + ((int) ((((i12 >> 24) & 255) - r0) * f11))) << 24) | ((((i11 >> 16) & 255) + ((int) ((((i12 >> 16) & 255) - r1) * f11))) << 16) | ((((i11 >> 8) & 255) + ((int) ((((i12 >> 8) & 255) - r2) * f11))) << 8) | ((i11 & 255) + ((int) (f11 * ((i12 & 255) - r8))));
    }

    /* renamed from: i */
    private void m10770i(float f11) {
        this.f8338q = f11;
    }

    /* renamed from: j */
    private void m10771j(float f11, float f12, float f13, float f14) {
        c cVar = this.f8337p;
        float f15 = this.f8339r.getDisplayMetrics().density;
        cVar.m10808z(f12 * f15);
        cVar.m10799q(f11 * f15);
        cVar.m10802t(0);
        cVar.m10797o(f13 * f15, f14 * f15);
    }

    /* renamed from: n */
    private void m10772n() {
        c cVar = this.f8337p;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f8334v);
        ofFloat.addListener(new b(cVar));
        this.f8340s = ofFloat;
    }

    /* renamed from: c */
    void m10773c(float f11, c cVar, boolean z11) {
        float interpolation;
        float f12;
        if (this.f8342u) {
            m10768b(f11, cVar);
            return;
        }
        if (f11 != 1.0f || z11) {
            float m10792j = cVar.m10792j();
            if (f11 < 0.5f) {
                interpolation = cVar.m10793k();
                f12 = (f8335w.getInterpolation(f11 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m10793k = cVar.m10793k() + 0.79f;
                interpolation = m10793k - (((1.0f - f8335w.getInterpolation((f11 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = m10793k;
            }
            float f13 = m10792j + (0.20999998f * f11);
            float f14 = (f11 + this.f8341t) * 216.0f;
            cVar.m10807y(interpolation);
            cVar.m10804v(f12);
            cVar.m10805w(f13);
            m10770i(f14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f8338q, bounds.exactCenterX(), bounds.exactCenterY());
        this.f8337p.m10783a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m10774e(boolean z11) {
        this.f8337p.m10806x(z11);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m10775f(float f11) {
        this.f8337p.m10798p(f11);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m10776g(int... iArr) {
        this.f8337p.m10803u(iArr);
        this.f8337p.m10802t(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8337p.m10785c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m10777h(float f11) {
        this.f8337p.m10805w(f11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f8340s.isRunning();
    }

    /* renamed from: k */
    public void m10778k(float f11, float f12) {
        this.f8337p.m10807y(f11);
        this.f8337p.m10804v(f12);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m10779l(float f11) {
        this.f8337p.m10808z(f11);
        invalidateSelf();
    }

    /* renamed from: m */
    public void m10780m(int i11) {
        if (i11 == 0) {
            m10771j(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m10771j(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: o */
    void m10781o(float f11, c cVar) {
        if (f11 > 0.75f) {
            cVar.m10800r(m10769d((f11 - 0.75f) / 0.25f, cVar.m10790h(), cVar.m10787e()));
        } else {
            cVar.m10800r(cVar.m10790h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f8337p.m10796n(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8337p.m10801s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f8340s.cancel();
        this.f8337p.m10782A();
        if (this.f8337p.m10786d() != this.f8337p.m10789g()) {
            this.f8342u = true;
            this.f8340s.setDuration(666L);
            this.f8340s.start();
        } else {
            this.f8337p.m10802t(0);
            this.f8337p.m10795m();
            this.f8340s.setDuration(1332L);
            this.f8340s.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f8340s.cancel();
        m10770i(0.0f);
        this.f8337p.m10806x(false);
        this.f8337p.m10802t(0);
        this.f8337p.m10795m();
        invalidateSelf();
    }
}
