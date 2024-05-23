package sj0;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.zinstant.zom.properties.ZOMGlowingAnimation;
import nk0.AbstractC23825g0;
import p500s1.C26087b;

/* renamed from: sj0.b */
/* loaded from: classes7.dex */
public class C26277b extends Drawable {

    /* renamed from: a */
    private float f124736a;

    /* renamed from: b */
    private int f124737b;

    /* renamed from: c */
    private int f124738c;

    /* renamed from: d */
    private int f124739d;

    /* renamed from: e */
    private int f124740e;

    /* renamed from: f */
    private int f124741f;

    /* renamed from: g */
    private int f124742g;

    /* renamed from: h */
    private float f124743h;

    /* renamed from: i */
    private int f124744i;

    /* renamed from: j */
    protected int f124745j;

    /* renamed from: k */
    private RectF[] f124746k;

    /* renamed from: l */
    private int[] f124747l;

    /* renamed from: m */
    private String[] f124748m;

    /* renamed from: n */
    private int f124749n;

    /* renamed from: o */
    private final ValueAnimator f124750o;

    /* renamed from: p */
    private Paint f124751p;

    /* renamed from: q */
    private final Paint f124752q;

    /* renamed from: r */
    Path f124753r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sj0.b$a */
    /* loaded from: classes7.dex */
    public class a implements TypeEvaluator {

        /* renamed from: a */
        private final float f124754a;

        /* renamed from: b */
        private final float f124755b;

        /* renamed from: c */
        private final float f124756c;

        /* renamed from: d */
        private final Pair f124757d = new Pair(new RectF(0.0f, 0.0f, 0.0f, 0.0f), new b(1));

        a(long j11, int i11, int i12, int i13) {
            float f11 = (float) j11;
            float f12 = (i13 * i12) / f11;
            this.f124754a = f12;
            float f13 = i11;
            this.f124755b = f12 + (f13 / f11);
            this.f124756c = (C26277b.this.f124749n * f11) / f13;
        }

        @Override // android.animation.TypeEvaluator
        public Object evaluate(float f11, Object obj, Object obj2) {
            float f12 = this.f124754a;
            if (f11 > f12 && f11 < this.f124755b) {
                int min = Math.min((int) ((f11 - f12) * this.f124756c), Math.min(C26277b.this.f124746k.length - 1, C26277b.this.f124747l.length - 1));
                ((RectF) this.f124757d.first).set(C26277b.this.f124746k[min]);
                ((b) this.f124757d.second).m135214b(C26277b.this.f124747l[min]);
                return this.f124757d;
            }
            ((RectF) this.f124757d.first).set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.f124757d.second).m135214b(1);
            return this.f124757d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sj0.b$b */
    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a */
        private int f124759a;

        public b(int i11) {
            this.f124759a = i11;
        }

        /* renamed from: a */
        public int m135213a() {
            return this.f124759a;
        }

        /* renamed from: b */
        public void m135214b(int i11) {
            this.f124759a = i11;
        }
    }

    public C26277b(float f11, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f12) {
        this.f124739d = -1;
        this.f124744i = 255;
        this.f124745j = 0;
        this.f124750o = new ValueAnimator();
        this.f124752q = new Paint(1);
        this.f124753r = new Path();
        setBounds(rect);
        m135208B(f11, i11, i12, i13, i14, i15, i16, f12);
    }

    /* renamed from: A */
    private void m135184A(int i11, int i12, int i13) {
        long j11 = i11 + ((i12 - 1) * i13);
        this.f124750o.setDuration(j11);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            propertyValuesHolderArr[i14] = m135194j(i14, j11, i11, i13);
        }
        this.f124750o.setValues(propertyValuesHolderArr);
        if (i12 == 0) {
            this.f124750o.cancel();
        }
    }

    /* renamed from: d */
    private static int[] m135188d(int i11, int i12) {
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = (int) (i11 * (1.0f - (i13 / i12)));
        }
        return iArr;
    }

    /* renamed from: e */
    private static RectF[] m135189e(Rect rect, float f11, int i11) {
        RectF[] rectFArr = new RectF[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            float f12 = (i12 / i11) * f11;
            rectFArr[i12] = new RectF(rect.left - f12, rect.top - f12, rect.right + f12, rect.bottom + f12);
        }
        return rectFArr;
    }

    /* renamed from: f */
    private boolean m135190f(float f11, int i11) {
        return f11 > 0.0f && i11 != 0;
    }

    /* renamed from: g */
    private boolean m135191g(ValueAnimator valueAnimator) {
        if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0 && !valueAnimator.isStarted() && m135196l(this.f124736a, this.f124737b, this.f124738c, this.f124741f, this.f124742g)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m135192h(Canvas canvas, Rect rect) {
        Paint m135193i;
        canvas.save();
        canvas.clipPath(this.f124753r, Region.Op.DIFFERENCE);
        for (int i11 = 0; i11 < this.f124741f; i11++) {
            Pair pair = (Pair) this.f124750o.getAnimatedValue(this.f124748m[i11]);
            if (pair != null) {
                this.f124752q.setAlpha(((b) pair.second).m135213a());
                RectF rectF = (RectF) pair.first;
                float f11 = this.f124743h;
                canvas.drawRoundRect(rectF, f11, f11, this.f124752q);
            }
        }
        canvas.restore();
        if (AbstractC23825g0.f115102E && (m135193i = m135193i()) != null) {
            float f12 = rect.left;
            float f13 = this.f124736a;
            canvas.drawRect(f12 - f13, rect.top - f13, rect.right + f13, rect.bottom + f13, m135193i);
        }
    }

    /* renamed from: i */
    private Paint m135193i() {
        if (AbstractC23825g0.f115102E) {
            if (this.f124751p == null) {
                Paint paint = new Paint(1);
                this.f124751p = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.f124751p.setColor(-16776961);
            }
            return this.f124751p;
        }
        return null;
    }

    /* renamed from: j */
    private PropertyValuesHolder m135194j(int i11, long j11, int i12, int i13) {
        return PropertyValuesHolder.ofObject(this.f124748m[i11], new a(j11, i12, i13, i11), Float.valueOf(0.0f), Float.valueOf(1.0f));
    }

    /* renamed from: k */
    private static Interpolator m135195k(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return new LinearInterpolator();
                    }
                    return new C26087b();
                }
                return new DecelerateInterpolator();
            }
            return new AccelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
    }

    /* renamed from: l */
    private boolean m135196l(float f11, int i11, long j11, int i12, long j12) {
        if (!m135190f(f11, i11) || j11 <= 0 || i12 <= 0 || j12 <= 0) {
            return false;
        }
        if (i12 != 1 && j11 <= j12 * i12) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private void m135197n() {
        if (m135210m(256) || m135210m(128)) {
            this.f124753r.reset();
            Path path = this.f124753r;
            RectF rectF = new RectF(getBounds());
            float f11 = this.f124743h;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        }
        if (m135210m(2) || m135210m(512)) {
            this.f124747l = m135188d((this.f124744i * Color.alpha(this.f124737b)) / 255, this.f124749n);
        }
        if (m135210m(4) || m135210m(1) || m135210m(256)) {
            this.f124749n = Math.min((int) (this.f124738c * 0.04f), 300);
            this.f124746k = m135189e(getBounds(), this.f124736a, this.f124749n);
            this.f124747l = m135188d((this.f124744i * Color.alpha(this.f124737b)) / 255, this.f124749n);
        }
        if (m135210m(4) || m135210m(32) || m135210m(64)) {
            m135184A(this.f124738c, this.f124741f, this.f124742g);
        }
        this.f124745j = 0;
    }

    /* renamed from: o */
    private void m135198o(int i11) {
        if (this.f124737b == i11) {
            return;
        }
        this.f124737b = i11;
        this.f124745j |= 2;
        this.f124752q.setColor(i11);
    }

    /* renamed from: p */
    private void m135199p(float f11) {
        if (this.f124743h == f11) {
            return;
        }
        if (f11 == 0.0f) {
            f11 = 10.0f;
        }
        this.f124743h = f11;
        this.f124745j |= 128;
    }

    /* renamed from: q */
    private void m135200q(int i11) {
        if (this.f124738c == i11) {
            return;
        }
        this.f124738c = i11;
        this.f124745j |= 4;
    }

    /* renamed from: r */
    private void m135201r(int i11) {
        int i12;
        if (this.f124739d == i11) {
            return;
        }
        this.f124739d = i11;
        this.f124745j |= 8;
        ValueAnimator valueAnimator = this.f124750o;
        if (i11 > 0) {
            i12 = i11 - 1;
        } else {
            i12 = -1;
        }
        valueAnimator.setRepeatCount(i12);
    }

    /* renamed from: s */
    private void m135202s(float f11) {
        if (this.f124736a == f11) {
            return;
        }
        this.f124736a = f11;
        this.f124745j |= 1;
    }

    /* renamed from: t */
    private void m135203t(int i11) {
        if (this.f124740e == i11) {
            return;
        }
        this.f124740e = i11;
        this.f124745j |= 16;
        this.f124750o.setInterpolator(m135195k(i11));
    }

    /* renamed from: u */
    private void m135204u(int i11) {
        if (this.f124741f == i11) {
            return;
        }
        this.f124741f = i11;
        this.f124745j |= 32;
        this.f124748m = new String[i11];
        for (int i12 = 0; i12 < this.f124741f; i12++) {
            this.f124748m[i12] = String.valueOf(i12);
        }
    }

    /* renamed from: v */
    private void m135205v(int i11) {
        if (this.f124742g == i11) {
            return;
        }
        this.f124742g = i11;
        this.f124745j |= 64;
    }

    /* renamed from: w */
    private void m135206w() {
        if (m135191g(this.f124750o)) {
            this.f124750o.start();
            invalidateSelf();
        }
    }

    /* renamed from: y */
    private void m135207y() {
        if (this.f124750o.isStarted()) {
            this.f124750o.end();
        }
    }

    /* renamed from: B */
    void m135208B(float f11, int i11, int i12, int i13, int i14, int i15, int i16, float f12) {
        m135202s(f11);
        m135198o(i11);
        m135200q(i12);
        m135201r(i13);
        m135203t(i14);
        m135204u(i15);
        m135205v(i16);
        m135199p(f12);
        m135197n();
    }

    /* renamed from: C */
    public void m135209C(ZOMGlowingAnimation zOMGlowingAnimation, float f11) {
        m135208B(zOMGlowingAnimation.mRadius, zOMGlowingAnimation.mColor, zOMGlowingAnimation.mDuration, zOMGlowingAnimation.mIterationCount, zOMGlowingAnimation.mTimingFunction, zOMGlowingAnimation.mWaveCount, zOMGlowingAnimation.mWaveDelay, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f124750o.isRunning()) {
            invalidateSelf();
            m135192h(canvas, getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: m */
    protected boolean m135210m(int i11) {
        return (i11 & this.f124745j) != 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f124745j |= 256;
        m135197n();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 == this.f124744i) {
            return;
        }
        this.f124745j |= 512;
        this.f124744i = i11;
        m135197n();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: x */
    public void m135211x() {
        m135206w();
    }

    /* renamed from: z */
    public void m135212z() {
        m135207y();
    }

    public C26277b() {
        this.f124739d = -1;
        this.f124744i = 255;
        this.f124745j = 0;
        this.f124750o = new ValueAnimator();
        Paint paint = new Paint(1);
        this.f124752q = paint;
        this.f124753r = new Path();
        paint.setStyle(Paint.Style.FILL);
    }
}
