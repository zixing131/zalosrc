package com.zing.zalo.p077ui.widget;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.o */
/* loaded from: classes6.dex */
public class C13697o {

    /* renamed from: S */
    private static final DashPathEffect f70752S = new DashPathEffect(new float[]{AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(3.0f)}, 0.0f);

    /* renamed from: A */
    int f70753A;

    /* renamed from: B */
    int f70754B;

    /* renamed from: D */
    int f70756D;

    /* renamed from: E */
    Paint f70757E;

    /* renamed from: I */
    long f70761I;

    /* renamed from: J */
    boolean f70762J;

    /* renamed from: P */
    private Rect f70768P;

    /* renamed from: Q */
    ValueAnimator f70769Q;

    /* renamed from: R */
    a f70770R;

    /* renamed from: a */
    int f70771a;

    /* renamed from: b */
    int f70772b;

    /* renamed from: c */
    int f70773c;

    /* renamed from: d */
    int f70774d;

    /* renamed from: e */
    protected int f70775e;

    /* renamed from: f */
    protected int f70776f;

    /* renamed from: g */
    View f70777g;

    /* renamed from: j */
    Bitmap f70780j;

    /* renamed from: k */
    BitmapShader f70781k;

    /* renamed from: m */
    Matrix f70783m;

    /* renamed from: n */
    Matrix f70784n;

    /* renamed from: o */
    Paint f70785o;

    /* renamed from: q */
    Paint f70787q;

    /* renamed from: s */
    int f70789s;

    /* renamed from: t */
    int f70790t;

    /* renamed from: w */
    int f70793w;

    /* renamed from: h */
    Bitmap f70778h = null;

    /* renamed from: i */
    boolean f70779i = false;

    /* renamed from: l */
    boolean f70782l = false;

    /* renamed from: u */
    int f70791u = 0;

    /* renamed from: x */
    final RectF f70794x = new RectF();

    /* renamed from: y */
    final Path f70795y = new Path();

    /* renamed from: z */
    boolean f70796z = false;

    /* renamed from: C */
    float[] f70755C = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: F */
    int f70758F = -1999054632;

    /* renamed from: G */
    float f70759G = 1.0f;

    /* renamed from: H */
    float f70760H = 0.0f;

    /* renamed from: K */
    boolean f70763K = false;

    /* renamed from: L */
    boolean f70764L = false;

    /* renamed from: M */
    boolean f70765M = false;

    /* renamed from: N */
    boolean f70766N = true;

    /* renamed from: O */
    boolean f70767O = false;

    /* renamed from: v */
    int f70792v = AbstractC11531v0.m62256f3();

    /* renamed from: p */
    Paint f70786p = new Paint(1);

    /* renamed from: r */
    Paint f70788r = new Paint(1);

    /* renamed from: com.zing.zalo.ui.widget.o$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        void mo61944a(float f11);
    }

    public C13697o(View view) {
        this.f70777g = view;
        m76456D(AbstractC11531v0.m62266h3());
        Paint paint = new Paint(1);
        this.f70757E = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f70757E.setColor(this.f70758F);
        this.f70785o = new Paint(1);
        this.f70783m = new Matrix();
        this.f70787q = new Paint();
        m76462J(0, AbstractC11531v0.m62210V2(view.getContext()) - AbstractC23136l9.m118742r(1.0f));
    }

    /* renamed from: L */
    private void m76447L() {
        float round;
        float f11;
        if (this.f70779i) {
            return;
        }
        this.f70779i = true;
        this.f70786p.setAlpha(255);
        Bitmap bitmap = this.f70778h;
        if (bitmap != null && bitmap.getWidth() > 0 && this.f70778h.getHeight() > 0) {
            float width = this.f70778h.getWidth();
            float height = this.f70778h.getHeight();
            float round2 = Math.round(this.f70789s - (this.f70756D * 2.0f));
            float round3 = Math.round(this.f70790t - (this.f70756D * 2.0f));
            float f12 = 0.0f;
            if (width * round3 > round2 * height) {
                f11 = round3 / height;
                f12 = Math.round(((round2 / f11) - width) / 2.0f);
                round = 0.0f;
            } else {
                float f13 = round2 / width;
                round = Math.round(((round3 / f13) - height) / 2.0f);
                f11 = f13;
            }
            Matrix matrix = this.f70784n;
            if (matrix == null) {
                this.f70784n = new Matrix();
            } else {
                matrix.reset();
            }
            this.f70784n.setScale(f11, f11);
            this.f70784n.preTranslate(f12, round);
            Matrix matrix2 = this.f70784n;
            int i11 = this.f70756D;
            matrix2.postTranslate(i11, i11);
            Shader shader = this.f70786p.getShader();
            if (shader == null) {
                Bitmap bitmap2 = this.f70778h;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                shader = new BitmapShader(bitmap2, tileMode, tileMode);
                this.f70786p.setShader(shader);
            }
            shader.setLocalMatrix(this.f70784n);
            return;
        }
        this.f70786p.setShader(null);
        this.f70786p.setColor(this.f70792v);
    }

    /* renamed from: e */
    private void m76449e(Canvas canvas, float f11) {
        m76464M();
        m76447L();
        if (this.f70786p.getShader() != null) {
            this.f70786p.setAlpha((int) (f11 * 255.0f));
        } else {
            this.f70786p.setAlpha((int) (Color.alpha(this.f70792v) * f11));
        }
        canvas.drawPath(this.f70795y, this.f70786p);
    }

    /* renamed from: f */
    private void m76450f(Canvas canvas, Paint paint, float f11) {
        m76464M();
        paint.setAlpha((int) (f11 * 255.0f));
        canvas.drawPath(this.f70795y, paint);
    }

    /* renamed from: n */
    public /* synthetic */ void m76451n(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f70760H = floatValue;
        a aVar = this.f70770R;
        if (aVar != null) {
            aVar.mo61944a(floatValue);
        }
        View view = this.f70777g;
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: q */
    private void m76452q() {
        this.f70796z = false;
        this.f70779i = false;
        this.f70782l = false;
    }

    /* renamed from: A */
    public void m76453A(int i11) {
        if (this.f70792v != i11) {
            this.f70778h = null;
            this.f70792v = i11;
            this.f70779i = false;
        }
    }

    /* renamed from: B */
    public void m76454B(float f11) {
        if (this.f70760H != f11) {
            this.f70760H = f11;
            a aVar = this.f70770R;
            if (aVar != null) {
                aVar.mo61944a(f11);
            }
            View view = this.f70777g;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: C */
    public void m76455C(a aVar) {
        this.f70770R = aVar;
    }

    /* renamed from: D */
    public void m76456D(int i11) {
        if (this.f70793w != i11) {
            this.f70793w = i11;
            this.f70788r.setShader(null);
            this.f70788r.setColor(i11);
        }
    }

    /* renamed from: E */
    public void m76457E(boolean z11) {
        this.f70766N = z11;
    }

    /* renamed from: F */
    public void m76458F(boolean z11, boolean z12) {
        this.f70763K = z11;
        this.f70764L = z12;
    }

    /* renamed from: G */
    public void m76459G(Rect rect) {
        this.f70768P = rect;
    }

    /* renamed from: H */
    public void m76460H(int i11, int i12) {
        this.f70753A = i11;
        this.f70754B = i12;
    }

    /* renamed from: I */
    public void m76461I(float[] fArr) {
        if (this.f70755C == fArr) {
            return;
        }
        if (fArr != null && fArr.length == 8) {
            this.f70755C = fArr;
        } else {
            this.f70755C = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        this.f70796z = false;
    }

    /* renamed from: J */
    public void m76462J(int i11, int i12) {
        m76463K(i11, i12, i12);
    }

    /* renamed from: K */
    public void m76463K(int i11, int i12, int i13) {
        int i14;
        int i15;
        if (i12 == i13) {
            i14 = i12;
        } else {
            i14 = 0;
        }
        switch (i11) {
            case 1:
                double d11 = i14;
                int i16 = (int) (0.25d * d11);
                i15 = (int) (d11 * 1.600000023841858d);
                i12 = i14;
                i13 = i16;
                break;
            case 2:
                i13 = (int) (i14 * 0.6399999856948853d);
                i15 = i13;
                i12 = i14;
                break;
            case 3:
            case 6:
                i12 = i14;
                i13 = i12;
                i15 = i13;
                break;
            case 4:
                double d12 = i14;
                int i17 = (int) (d12 / 0.25d);
                i12 = (int) (d12 / 1.5d);
                i13 = i14;
                i14 = i17;
                i15 = i13;
                break;
            case 5:
                i14 = i12;
                i15 = i13;
                break;
            default:
                double d13 = i14;
                int i18 = (int) (0.25d * d13);
                i15 = (int) (d13 * 1.600000023841858d);
                i12 = (int) (d13 / 1.5d);
                i13 = i18;
                break;
        }
        if (this.f70791u != i11 || this.f70773c != i12 || this.f70774d != i13 || this.f70771a != i14 || this.f70772b != i15) {
            this.f70791u = i11;
            this.f70773c = i12;
            this.f70771a = i14;
            this.f70774d = i13;
            this.f70772b = i15;
            m76478s();
        }
    }

    /* renamed from: M */
    void m76464M() {
        if (!this.f70796z) {
            this.f70796z = true;
            RectF rectF = this.f70794x;
            int i11 = this.f70756D;
            rectF.set(i11, i11, this.f70789s - i11, this.f70790t - i11);
            this.f70795y.reset();
            this.f70795y.addRoundRect(this.f70794x, this.f70755C, Path.Direction.CW);
        }
    }

    /* renamed from: b */
    boolean m76465b() {
        if (this.f70759G != 1.0f) {
            float min = this.f70759G + (((float) Math.min(System.currentTimeMillis() - this.f70761I, 18L)) / 100.0f);
            this.f70759G = min;
            this.f70759G = Math.min(min, 1.0f);
            this.f70761I = System.currentTimeMillis();
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m76466c() {
        float round;
        float f11;
        if (this.f70782l) {
            return;
        }
        this.f70782l = true;
        Bitmap bitmap = this.f70780j;
        if (bitmap != null && bitmap.getWidth() > 0 && this.f70780j.getHeight() > 0) {
            int width = this.f70780j.getWidth();
            int height = this.f70780j.getHeight();
            float round2 = Math.round(this.f70789s - (this.f70756D * 2.0f));
            float round3 = Math.round(this.f70790t - (this.f70756D * 2.0f));
            float f12 = width;
            float f13 = height;
            float f14 = 0.0f;
            if (f12 * round3 > round2 * f13) {
                f11 = round3 / f13;
                f14 = Math.round(((round2 / f11) - f12) / 2.0f);
                round = 0.0f;
            } else {
                float f15 = round2 / f12;
                round = Math.round(((round3 / f15) - f13) / 2.0f);
                f11 = f15;
            }
            this.f70783m.reset();
            this.f70783m.setScale(f11, f11);
            this.f70783m.preTranslate(f14, round);
            Matrix matrix = this.f70783m;
            int i11 = this.f70756D;
            matrix.postTranslate(i11, i11);
            Bitmap bitmap2 = this.f70780j;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f70781k = bitmapShader;
            bitmapShader.setLocalMatrix(this.f70783m);
            this.f70785o.setShader(this.f70781k);
        }
    }

    /* renamed from: d */
    public void m76467d(Canvas canvas) {
        View view;
        if (this.f70789s > 0 && this.f70790t > 0) {
            try {
                m76464M();
                canvas.save();
                canvas.translate(this.f70753A, this.f70754B);
                Rect rect = this.f70768P;
                if (rect == null) {
                    canvas.clipRect(0, 0, this.f70789s, this.f70790t);
                } else {
                    canvas.clipRect(rect);
                }
                if (this.f70756D > 0 && this.f70766N) {
                    canvas.drawPath(this.f70795y, this.f70757E);
                }
                if (this.f70780j == null) {
                    m76449e(canvas, 1.0f);
                } else {
                    m76466c();
                    if (this.f70762J && this.f70759G < 1.0f) {
                        if (this.f70763K && this.f70787q.getShader() != null) {
                            if (this.f70764L) {
                                m76449e(canvas, 1.0f);
                                m76450f(canvas, this.f70787q, 1.0f - this.f70759G);
                            } else {
                                m76450f(canvas, this.f70787q, 1.0f);
                            }
                        } else {
                            m76449e(canvas, 1.0f - this.f70759G);
                        }
                        m76450f(canvas, this.f70785o, this.f70759G);
                        if (m76465b() && (view = this.f70777g) != null) {
                            view.invalidate();
                        }
                    } else {
                        m76450f(canvas, this.f70785o, 1.0f);
                    }
                }
                float f11 = this.f70760H;
                if (f11 > 0.0f) {
                    this.f70788r.setAlpha((int) (f11 * Color.alpha(this.f70793w)));
                    canvas.drawPath(this.f70795y, this.f70788r);
                }
                canvas.restore();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public Bitmap m76468g() {
        return this.f70780j;
    }

    /* renamed from: h */
    public int m76469h() {
        return this.f70753A;
    }

    /* renamed from: i */
    public float[] m76470i() {
        return this.f70755C;
    }

    /* renamed from: j */
    public int m76471j() {
        return this.f70754B;
    }

    /* renamed from: k */
    public int m76472k() {
        return this.f70790t;
    }

    /* renamed from: l */
    public int m76473l() {
        return this.f70789s;
    }

    /* renamed from: m */
    public boolean m76474m() {
        return this.f70780j != null;
    }

    /* renamed from: o */
    public void m76475o(float f11) {
        this.f70760H = f11;
        if (this.f70769Q == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f70769Q = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f70769Q.setDuration(f11 * 500.0f);
            this.f70769Q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.n
                public /* synthetic */ C13692n() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C13697o.this.m76451n(valueAnimator);
                }
            });
        }
        this.f70769Q.start();
    }

    /* renamed from: p */
    public void m76476p() {
        m76452q();
        this.f70780j = null;
        this.f70781k = null;
        this.f70785o.setShader(null);
        this.f70783m.reset();
        this.f70759G = 0.0f;
        m76478s();
        ValueAnimator valueAnimator = this.f70769Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f70769Q = null;
        }
        this.f70760H = 0.0f;
        this.f70761I = 0L;
        this.f70762J = false;
    }

    /* renamed from: r */
    public void m76477r() {
        this.f70759G = 0.0f;
        this.f70761I = 0L;
        this.f70762J = false;
        this.f70780j = null;
    }

    /* renamed from: s */
    public void m76478s() {
        m76452q();
        int i11 = this.f70771a;
        this.f70789s = i11;
        int i12 = this.f70791u;
        if (i12 == 2) {
            this.f70790t = (int) (i11 * 0.6399999856948853d);
        } else if (i12 == 4) {
            this.f70790t = this.f70772b;
        } else if (i12 == 5) {
            this.f70790t = this.f70772b;
        } else {
            this.f70790t = i11;
        }
        this.f70775e = i11;
        this.f70776f = this.f70790t;
    }

    /* renamed from: t */
    protected void m76479t() {
        m76452q();
        int i11 = this.f70776f;
        int i12 = this.f70775e;
        double d11 = i11 / i12;
        int i13 = this.f70791u;
        if (i13 == 3) {
            int i14 = this.f70771a;
            this.f70789s = i14;
            int i15 = (i11 * i14) / i12;
            this.f70790t = i15;
            this.f70775e = i14;
            this.f70776f = i15;
            return;
        }
        if (i13 == 2) {
            if (d11 > 0.6399999856948853d) {
                int i16 = this.f70771a;
                this.f70789s = i16;
                this.f70790t = (int) (i16 * 0.6399999856948853d);
                double d12 = i16 / i12;
                this.f70775e = (int) (i12 * d12);
                this.f70776f = (int) (i11 * d12);
                return;
            }
            int i17 = this.f70772b;
            this.f70790t = i17;
            double d13 = i17 / i11;
            this.f70776f = (int) (i11 * d13);
            this.f70775e = (int) (i12 * d13);
            return;
        }
        if (i13 == 5) {
            int i18 = this.f70771a;
            this.f70789s = i18;
            int i19 = this.f70772b;
            this.f70790t = i19;
            this.f70776f = i19;
            this.f70775e = (i18 * i19) / i19;
            return;
        }
        if (i13 == 4) {
            if (0.25d <= d11 && d11 <= 1.5d) {
                int i21 = this.f70772b;
                this.f70790t = i21;
                int i22 = (i12 * i21) / i11;
                this.f70789s = i22;
                this.f70775e = i22;
                this.f70776f = i21;
                int i23 = this.f70771a;
                if (i22 > i23) {
                    this.f70789s = i23;
                    return;
                }
                return;
            }
            if (d11 < 0.25d) {
                int i24 = this.f70774d;
                this.f70790t = i24;
                double d14 = i24 / i11;
                this.f70776f = (int) (i11 * d14);
                int i25 = (int) (i12 * d14);
                this.f70775e = i25;
                this.f70789s = Math.min(this.f70771a, i25);
                return;
            }
            int i26 = this.f70773c;
            this.f70789s = i26;
            double d15 = i26 / i12;
            this.f70775e = (int) (i12 * d15);
            this.f70776f = (int) (i11 * d15);
            this.f70790t = this.f70772b;
            return;
        }
        if (0.25d <= d11 && d11 <= 1.5d) {
            int i27 = this.f70771a;
            this.f70789s = i27;
            int i28 = (i11 * i27) / i12;
            this.f70790t = i28;
            this.f70775e = i27;
            this.f70776f = i28;
            return;
        }
        if (d11 < 0.25d) {
            int i29 = this.f70774d;
            this.f70790t = i29;
            double d16 = i29 / i11;
            int i31 = (int) (i11 * d16);
            this.f70776f = i31;
            int i32 = (int) (i12 * d16);
            this.f70775e = i32;
            this.f70789s = Math.min(this.f70771a, (i29 * i32) / i31);
            return;
        }
        int i33 = this.f70773c;
        this.f70789s = i33;
        double d17 = i33 / i12;
        int i34 = (int) (i12 * d17);
        this.f70775e = i34;
        int i35 = (int) (i11 * d17);
        this.f70776f = i35;
        this.f70790t = Math.min(this.f70772b, (i33 * i35) / i34);
    }

    /* renamed from: u */
    public void m76480u(Bitmap bitmap, boolean z11) {
        try {
            Bitmap bitmap2 = this.f70780j;
            if (bitmap2 != bitmap) {
                if (this.f70763K) {
                    if (bitmap2 != null && this.f70782l) {
                        this.f70787q.set(this.f70785o);
                    } else {
                        this.f70787q.setShader(null);
                    }
                }
                this.f70780j = bitmap;
                this.f70782l = false;
                this.f70762J = z11;
                if (z11) {
                    this.f70759G = 0.0f;
                    this.f70761I = 0L;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public void m76481v(int i11, int i12) {
        this.f70775e = i11;
        this.f70776f = i12;
        m76479t();
    }

    /* renamed from: w */
    public void m76482w(int i11) {
        this.f70758F = i11;
        this.f70757E.setColor(i11);
    }

    /* renamed from: x */
    public void m76483x(boolean z11) {
        this.f70767O = z11;
        if (z11) {
            this.f70757E.setPathEffect(f70752S);
        } else {
            this.f70757E.setPathEffect(null);
        }
    }

    /* renamed from: y */
    public void m76484y(int i11) {
        if (this.f70756D != i11) {
            this.f70756D = i11;
            this.f70757E.setStrokeWidth(i11 * 2);
            m76452q();
        }
    }

    /* renamed from: z */
    public void m76485z(Bitmap bitmap) {
        if (this.f70778h != bitmap) {
            this.f70778h = bitmap;
            this.f70792v = 0;
            this.f70779i = false;
        }
    }
}
