package com.zing.p058v4.widget;

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
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;
import le0.AbstractC22459a;
import p262jb.AbstractC21196a;
import p500s1.C26087b;

/* renamed from: com.zing.v4.widget.b */
/* loaded from: classes3.dex */
class C6894b extends Drawable implements Animatable {

    /* renamed from: B */
    static final Interpolator f37802B = new LinearInterpolator();

    /* renamed from: C */
    static final Interpolator f37803C = new C26087b();

    /* renamed from: A */
    final Drawable.Callback f37804A;

    /* renamed from: p */
    int[] f37805p;

    /* renamed from: q */
    final ArrayList f37806q = new ArrayList();

    /* renamed from: r */
    final d f37807r;

    /* renamed from: s */
    float f37808s;

    /* renamed from: t */
    Resources f37809t;

    /* renamed from: u */
    View f37810u;

    /* renamed from: v */
    Animation f37811v;

    /* renamed from: w */
    float f37812w;

    /* renamed from: x */
    double f37813x;

    /* renamed from: y */
    double f37814y;

    /* renamed from: z */
    boolean f37815z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.v4.widget.b$a */
    /* loaded from: classes3.dex */
    public class a extends Animation {

        /* renamed from: p */
        final /* synthetic */ d f37816p;

        a(d dVar) {
            this.f37816p = dVar;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            C6894b c6894b = C6894b.this;
            if (c6894b.f37815z) {
                c6894b.m35380b(f11, this.f37816p);
                return;
            }
            float m35382d = c6894b.m35382d(this.f37816p);
            float m35409j = this.f37816p.m35409j();
            float m35411l = this.f37816p.m35411l();
            float m35410k = this.f37816p.m35410k();
            C6894b.this.m35392n(f11, this.f37816p);
            if (f11 <= 0.5f) {
                this.f37816p.m35397D(m35411l + ((0.8f - m35382d) * C6894b.f37803C.getInterpolation(f11 / 0.5f)));
            }
            if (f11 > 0.5f) {
                this.f37816p.m35425z(m35409j + ((0.8f - m35382d) * C6894b.f37803C.getInterpolation((f11 - 0.5f) / 0.5f)));
            }
            this.f37816p.m35395B(m35410k + (0.25f * f11));
            C6894b c6894b2 = C6894b.this;
            c6894b2.m35387i((f11 * 216.0f) + ((c6894b2.f37812w / 5.0f) * 1080.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.v4.widget.b$b */
    /* loaded from: classes3.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ d f37818a;

        b(d dVar) {
            this.f37818a = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            this.f37818a.m35399F();
            this.f37818a.m35413n();
            d dVar = this.f37818a;
            dVar.m35397D(dVar.m35404e());
            C6894b c6894b = C6894b.this;
            if (c6894b.f37815z) {
                c6894b.f37815z = false;
                animation.setDuration(1332L);
                this.f37818a.m35396C(false);
                return;
            }
            c6894b.f37812w = (c6894b.f37812w + 1.0f) % 5.0f;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C6894b.this.f37812w = 0.0f;
        }
    }

    /* renamed from: com.zing.v4.widget.b$c */
    /* loaded from: classes3.dex */
    class c implements Drawable.Callback {
        c() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C6894b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            C6894b.this.scheduleSelf(runnable, j11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C6894b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.v4.widget.b$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        final RectF f37821a = new RectF();

        /* renamed from: b */
        final Paint f37822b;

        /* renamed from: c */
        final Paint f37823c;

        /* renamed from: d */
        final Drawable.Callback f37824d;

        /* renamed from: e */
        float f37825e;

        /* renamed from: f */
        float f37826f;

        /* renamed from: g */
        float f37827g;

        /* renamed from: h */
        float f37828h;

        /* renamed from: i */
        float f37829i;

        /* renamed from: j */
        int[] f37830j;

        /* renamed from: k */
        int f37831k;

        /* renamed from: l */
        float f37832l;

        /* renamed from: m */
        float f37833m;

        /* renamed from: n */
        float f37834n;

        /* renamed from: o */
        boolean f37835o;

        /* renamed from: p */
        Path f37836p;

        /* renamed from: q */
        float f37837q;

        /* renamed from: r */
        double f37838r;

        /* renamed from: s */
        int f37839s;

        /* renamed from: t */
        int f37840t;

        /* renamed from: u */
        int f37841u;

        /* renamed from: v */
        final Paint f37842v;

        /* renamed from: w */
        int f37843w;

        /* renamed from: x */
        int f37844x;

        public d(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f37822b = paint;
            Paint paint2 = new Paint();
            this.f37823c = paint2;
            this.f37825e = 0.0f;
            this.f37826f = 0.0f;
            this.f37827g = 0.0f;
            this.f37828h = 5.0f;
            this.f37829i = 2.5f;
            this.f37842v = new Paint(1);
            this.f37824d = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        /* renamed from: A */
        public void m35394A(int i11, int i12) {
            double ceil;
            float min = Math.min(i11, i12);
            double d11 = this.f37838r;
            if (d11 > 0.0d && min >= 0.0f) {
                ceil = (min / 2.0f) - d11;
            } else {
                ceil = Math.ceil(this.f37828h / 2.0f);
            }
            this.f37829i = (float) ceil;
        }

        /* renamed from: B */
        public void m35395B(float f11) {
            this.f37827g = f11;
            m35414o();
        }

        /* renamed from: C */
        public void m35396C(boolean z11) {
            if (this.f37835o != z11) {
                this.f37835o = z11;
                m35414o();
            }
        }

        /* renamed from: D */
        public void m35397D(float f11) {
            this.f37825e = f11;
            m35414o();
        }

        /* renamed from: E */
        public void m35398E(float f11) {
            this.f37828h = f11;
            this.f37822b.setStrokeWidth(f11);
            m35414o();
        }

        /* renamed from: F */
        public void m35399F() {
            this.f37832l = this.f37825e;
            this.f37833m = this.f37826f;
            this.f37834n = this.f37827g;
        }

        /* renamed from: a */
        public void m35400a(Canvas canvas, Rect rect) {
            RectF rectF = this.f37821a;
            rectF.set(rect);
            float f11 = this.f37829i;
            rectF.inset(f11, f11);
            float f12 = this.f37825e;
            float f13 = this.f37827g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f37826f + f13) * 360.0f) - f14;
            this.f37822b.setColor(this.f37844x);
            canvas.drawArc(rectF, f14, f15, false, this.f37822b);
            m35401b(canvas, f14, f15, rect);
            if (this.f37841u < 255) {
                this.f37842v.setColor(this.f37843w);
                this.f37842v.setAlpha(255 - this.f37841u);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, this.f37842v);
            }
        }

        /* renamed from: b */
        void m35401b(Canvas canvas, float f11, float f12, Rect rect) {
            if (this.f37835o) {
                Path path = this.f37836p;
                if (path == null) {
                    Path path2 = new Path();
                    this.f37836p = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f13 = (this.f37829i / 2.0f) * this.f37837q;
                float cos = (float) ((this.f37838r * Math.cos(0.0d)) + rect.exactCenterX());
                float sin = (float) ((this.f37838r * Math.sin(0.0d)) + rect.exactCenterY());
                this.f37836p.moveTo(0.0f, 0.0f);
                this.f37836p.lineTo(this.f37839s * this.f37837q, 0.0f);
                Path path3 = this.f37836p;
                float f14 = this.f37839s;
                float f15 = this.f37837q;
                path3.lineTo((f14 * f15) / 2.0f, this.f37840t * f15);
                this.f37836p.offset(cos - f13, sin);
                this.f37836p.close();
                this.f37823c.setColor(this.f37844x);
                canvas.rotate((f11 + f12) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f37836p, this.f37823c);
            }
        }

        /* renamed from: c */
        public int m35402c() {
            return this.f37841u;
        }

        /* renamed from: d */
        public double m35403d() {
            return this.f37838r;
        }

        /* renamed from: e */
        public float m35404e() {
            return this.f37826f;
        }

        /* renamed from: f */
        public int m35405f() {
            return this.f37830j[m35406g()];
        }

        /* renamed from: g */
        int m35406g() {
            return (this.f37831k + 1) % this.f37830j.length;
        }

        /* renamed from: h */
        public float m35407h() {
            return this.f37825e;
        }

        /* renamed from: i */
        public int m35408i() {
            return this.f37830j[this.f37831k];
        }

        /* renamed from: j */
        public float m35409j() {
            return this.f37833m;
        }

        /* renamed from: k */
        public float m35410k() {
            return this.f37834n;
        }

        /* renamed from: l */
        public float m35411l() {
            return this.f37832l;
        }

        /* renamed from: m */
        public float m35412m() {
            return this.f37828h;
        }

        /* renamed from: n */
        public void m35413n() {
            m35423x(m35406g());
        }

        /* renamed from: o */
        void m35414o() {
            this.f37824d.invalidateDrawable(null);
        }

        /* renamed from: p */
        public void m35415p() {
            this.f37832l = 0.0f;
            this.f37833m = 0.0f;
            this.f37834n = 0.0f;
            m35397D(0.0f);
            m35425z(0.0f);
            m35395B(0.0f);
        }

        /* renamed from: q */
        public void m35416q(int i11) {
            this.f37841u = i11;
        }

        /* renamed from: r */
        public void m35417r(float f11, float f12) {
            this.f37839s = (int) f11;
            this.f37840t = (int) f12;
        }

        /* renamed from: s */
        public void m35418s(float f11) {
            if (f11 != this.f37837q) {
                this.f37837q = f11;
                m35414o();
            }
        }

        /* renamed from: t */
        public void m35419t(int i11) {
            this.f37843w = i11;
        }

        /* renamed from: u */
        public void m35420u(double d11) {
            this.f37838r = d11;
        }

        /* renamed from: v */
        public void m35421v(int i11) {
            this.f37844x = i11;
        }

        /* renamed from: w */
        public void m35422w(ColorFilter colorFilter) {
            this.f37822b.setColorFilter(colorFilter);
            m35414o();
        }

        /* renamed from: x */
        public void m35423x(int i11) {
            this.f37831k = i11;
            this.f37844x = this.f37830j[i11];
        }

        /* renamed from: y */
        public void m35424y(int[] iArr) {
            this.f37830j = iArr;
            m35423x(0);
        }

        /* renamed from: z */
        public void m35425z(float f11) {
            this.f37826f = f11;
            m35414o();
        }
    }

    public C6894b(Context context, View view) {
        this.f37805p = new int[]{-16777216};
        c cVar = new c();
        this.f37804A = cVar;
        this.f37810u = view;
        this.f37809t = context.getResources();
        d dVar = new d(cVar);
        this.f37807r = dVar;
        int[] iArr = {AbstractC22459a.m116119a(context, AbstractC21196a.AppPrimaryColor)};
        this.f37805p = iArr;
        dVar.m35424y(iArr);
        m35393o(1);
        m35390l();
    }

    /* renamed from: b */
    void m35380b(float f11, d dVar) {
        m35392n(f11, dVar);
        float floor = (float) (Math.floor(dVar.m35410k() / 0.8f) + 1.0d);
        dVar.m35397D(dVar.m35411l() + (((dVar.m35409j() - m35382d(dVar)) - dVar.m35411l()) * f11));
        dVar.m35425z(dVar.m35409j());
        dVar.m35395B(dVar.m35410k() + ((floor - dVar.m35410k()) * f11));
    }

    /* renamed from: c */
    int m35381c(float f11, int i11, int i12) {
        int intValue = Integer.valueOf(i11).intValue();
        int i13 = (intValue >> 24) & 255;
        int i14 = (intValue >> 16) & 255;
        int i15 = (intValue >> 8) & 255;
        int i16 = intValue & 255;
        int intValue2 = Integer.valueOf(i12).intValue();
        return ((i13 + ((int) ((((intValue2 >> 24) & 255) - i13) * f11))) << 24) | ((i14 + ((int) ((((intValue2 >> 16) & 255) - i14) * f11))) << 16) | ((i15 + ((int) ((((intValue2 >> 8) & 255) - i15) * f11))) << 8) | (i16 + ((int) (f11 * ((intValue2 & 255) - i16))));
    }

    /* renamed from: d */
    float m35382d(d dVar) {
        return (float) Math.toRadians(dVar.m35412m() / (dVar.m35403d() * 6.283185307179586d));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f37808s, bounds.exactCenterX(), bounds.exactCenterY());
        this.f37807r.m35400a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public void m35383e(float f11) {
        this.f37807r.m35418s(f11);
    }

    /* renamed from: f */
    public void m35384f(int i11) {
        this.f37807r.m35419t(i11);
    }

    /* renamed from: g */
    public void m35385g(int... iArr) {
        this.f37807r.m35424y(iArr);
        this.f37807r.m35423x(0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37807r.m35402c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f37814y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f37813x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m35386h(float f11) {
        this.f37807r.m35395B(f11);
    }

    /* renamed from: i */
    void m35387i(float f11) {
        this.f37808s = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ArrayList arrayList = this.f37806q;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Animation animation = (Animation) arrayList.get(i11);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    void m35388j(double d11, double d12, double d13, double d14, float f11, float f12) {
        d dVar = this.f37807r;
        float f13 = this.f37809t.getDisplayMetrics().density;
        double d15 = f13;
        this.f37813x = d11 * d15;
        this.f37814y = d12 * d15;
        dVar.m35398E(((float) d14) * f13);
        dVar.m35420u(d13 * d15);
        dVar.m35423x(0);
        dVar.m35417r(f11 * f13, f12 * f13);
        dVar.m35394A((int) this.f37813x, (int) this.f37814y);
    }

    /* renamed from: k */
    public void m35389k(float f11, float f12) {
        this.f37807r.m35397D(f11);
        this.f37807r.m35425z(f12);
    }

    /* renamed from: l */
    void m35390l() {
        d dVar = this.f37807r;
        a aVar = new a(dVar);
        aVar.setRepeatCount(-1);
        aVar.setRepeatMode(1);
        aVar.setInterpolator(f37802B);
        aVar.setAnimationListener(new b(dVar));
        this.f37811v = aVar;
    }

    /* renamed from: m */
    public void m35391m(boolean z11) {
        this.f37807r.m35396C(z11);
    }

    /* renamed from: n */
    void m35392n(float f11, d dVar) {
        if (f11 > 0.75f) {
            dVar.m35421v(m35381c((f11 - 0.75f) / 0.25f, dVar.m35408i(), dVar.m35405f()));
        }
    }

    /* renamed from: o */
    public void m35393o(int i11) {
        if (i11 == 0) {
            m35388j(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m35388j(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f37807r.m35416q(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37807r.m35422w(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f37811v.reset();
        this.f37807r.m35399F();
        if (this.f37807r.m35404e() != this.f37807r.m35407h()) {
            this.f37815z = true;
            this.f37811v.setDuration(666L);
            this.f37810u.startAnimation(this.f37811v);
        } else {
            this.f37807r.m35423x(0);
            this.f37807r.m35415p();
            this.f37811v.setDuration(1332L);
            this.f37810u.startAnimation(this.f37811v);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f37810u.clearAnimation();
        m35387i(0.0f);
        this.f37807r.m35396C(false);
        this.f37807r.m35423x(0);
        this.f37807r.m35415p();
    }
}
