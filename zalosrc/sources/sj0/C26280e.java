package sj0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: sj0.e */
/* loaded from: classes7.dex */
public class C26280e extends Drawable {

    /* renamed from: C */
    Shader.TileMode f124771C;

    /* renamed from: D */
    Shader.TileMode f124772D;

    /* renamed from: E */
    int f124773E;

    /* renamed from: F */
    int f124774F;

    /* renamed from: G */
    boolean[] f124775G;

    /* renamed from: H */
    boolean f124776H;

    /* renamed from: I */
    int f124777I;

    /* renamed from: J */
    ColorStateList f124778J;

    /* renamed from: K */
    PorterDuffColorFilter f124779K;

    /* renamed from: L */
    PorterDuff.Mode f124780L;

    /* renamed from: M */
    private int f124781M;

    /* renamed from: N */
    private int f124782N;

    /* renamed from: O */
    protected int f124783O;

    /* renamed from: P */
    protected boolean f124784P;

    /* renamed from: t */
    int f124789t;

    /* renamed from: u */
    int f124790u;

    /* renamed from: p */
    final RectF f124785p = new RectF();

    /* renamed from: q */
    final RectF f124786q = new RectF();

    /* renamed from: r */
    final RectF f124787r = new RectF();

    /* renamed from: s */
    final Paint f124788s = new Paint(1);

    /* renamed from: v */
    final RectF f124791v = new RectF();

    /* renamed from: w */
    final RectF f124792w = new RectF();

    /* renamed from: x */
    final Paint f124793x = new Paint(1);

    /* renamed from: y */
    final Paint f124794y = new Paint(1);

    /* renamed from: z */
    final Matrix f124795z = new Matrix();

    /* renamed from: A */
    final Path f124769A = new Path();

    /* renamed from: B */
    protected final Path f124770B = new Path();

    public C26280e() {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f124771C = tileMode;
        this.f124772D = tileMode;
        this.f124773E = 0;
        this.f124774F = 0;
        this.f124775G = new boolean[]{false, false, false, false};
        this.f124776H = true;
        this.f124777I = 0;
        this.f124778J = ColorStateList.valueOf(0);
        this.f124781M = 255;
        this.f124782N = -1;
        this.f124783O = 0;
        this.f124784P = false;
        m135228s();
    }

    /* renamed from: b */
    private static boolean m135222b(boolean... zArr) {
        for (boolean z11 : zArr) {
            if (z11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m135223c(boolean... zArr) {
        for (boolean z11 : zArr) {
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private void m135224d() {
        if (this.f124777I <= 0) {
            return;
        }
        this.f124791v.set(this.f124785p);
        int i11 = this.f124773E;
        if ((i11 & 1) == 1) {
            i11++;
        }
        if (i11 < this.f124777I) {
            int i12 = i11 >> 1;
            this.f124774F = i12;
            this.f124791v.inset(i12, i12);
            this.f124793x.setStrokeWidth(i11);
            this.f124794y.setStrokeWidth((this.f124777I - i11) + 2);
            int i13 = (this.f124777I - i11) >> 1;
            this.f124792w.set(this.f124785p);
            float f11 = i13 + i11;
            this.f124792w.inset(f11, f11);
            return;
        }
        this.f124791v.inset(r1 >> 1, r1 >> 1);
        int i14 = this.f124777I;
        this.f124774F = ((i14 >> 1) + i11) - i14;
        this.f124793x.setStrokeWidth(i14);
        this.f124792w.setEmpty();
        this.f124794y.setStrokeWidth(0.0f);
    }

    /* renamed from: e */
    private void m135225e(Path path, RectF rectF, float f11) {
        float f12;
        float f13;
        float f14;
        float min = Math.min(f11, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
        path.reset();
        float[] fArr = new float[8];
        boolean[] zArr = this.f124775G;
        if (zArr[0]) {
            f12 = min;
        } else {
            f12 = 0.0f;
        }
        fArr[1] = f12;
        fArr[0] = f12;
        if (zArr[1]) {
            f13 = min;
        } else {
            f13 = 0.0f;
        }
        fArr[3] = f13;
        fArr[2] = f13;
        if (zArr[2]) {
            f14 = min;
        } else {
            f14 = 0.0f;
        }
        fArr[5] = f14;
        fArr[4] = f14;
        if (!zArr[3]) {
            min = 0.0f;
        }
        fArr[7] = min;
        fArr[6] = min;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    /* renamed from: i */
    private void m135226i(Canvas canvas) {
        if (this.f124777I <= 0) {
            return;
        }
        if (this.f124792w.width() > 0.0f) {
            canvas.drawRect(this.f124792w, this.f124794y);
        }
        if (m135223c(this.f124775G)) {
            RectF rectF = this.f124791v;
            int i11 = this.f124774F;
            canvas.drawRoundRect(rectF, i11, i11, this.f124793x);
        } else if (this.f124773E != 0 && !m135222b(this.f124775G)) {
            canvas.drawPath(this.f124770B, this.f124793x);
        } else {
            canvas.drawRect(this.f124791v, this.f124793x);
        }
    }

    /* renamed from: n */
    private void m135227n(int i11) {
        int argb = Color.argb((getAlpha() * Color.alpha(i11)) / 255, Color.red(i11), Color.green(i11), Color.blue(i11));
        if (argb != this.f124788s.getColor()) {
            this.f124788s.setColor(argb);
        }
    }

    /* renamed from: s */
    private void m135228s() {
        this.f124788s.setStyle(Paint.Style.FILL);
        this.f124788s.setAntiAlias(true);
        this.f124788s.setFilterBitmap(true);
        this.f124788s.setDither(true);
        this.f124788s.setColor(this.f124782N);
        Paint paint = this.f124793x;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f124793x.setAntiAlias(true);
        this.f124793x.setColor(this.f124778J.getColorForState(getState(), 0));
        this.f124794y.setStyle(style);
        this.f124794y.setAntiAlias(true);
        this.f124794y.setColor(this.f124778J.getColorForState(getState(), 0));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z11;
        if (this.f124779K != null && this.f124788s.getColorFilter() == null) {
            this.f124788s.setColorFilter(this.f124779K);
            z11 = true;
        } else {
            z11 = false;
        }
        mo135177g(canvas);
        if (z11) {
            this.f124788s.setColorFilter(null);
        }
        m135226i(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m135229f(Canvas canvas) {
        canvas.clipRect(getBounds());
        if (this.f124773E != 0 && !m135222b(this.f124775G)) {
            canvas.clipPath(this.f124769A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo135177g(Canvas canvas) {
        if (this.f124773E > 0 && !m135222b(this.f124775G)) {
            if (m135223c(this.f124775G)) {
                RectF rectF = this.f124786q;
                int i11 = this.f124773E;
                canvas.drawRoundRect(rectF, i11, i11, this.f124788s);
                return;
            }
            canvas.drawPath(this.f124769A, this.f124788s);
            return;
        }
        canvas.drawRect(this.f124786q, this.f124788s);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f124781M;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f124788s.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public void m135230h(int i11, int i12) {
        this.f124789t = i11;
        this.f124790u = i12;
        this.f124787r.set(0.0f, 0.0f, i11, i12);
        this.f124791v.set(this.f124787r);
        this.f124786q.set(this.f124791v);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!super.isStateful() && (((colorStateList = this.f124778J) == null || !colorStateList.isStateful()) && this.f124783O == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void m135231j(int i11) {
        if (this.f124782N != i11) {
            this.f124782N = i11;
            if (!this.f124784P) {
                m135227n(i11);
            }
        }
    }

    /* renamed from: k */
    public void m135232k(Paint paint) {
        this.f124788s.set(paint);
    }

    /* renamed from: l */
    public void m135233l(float f11) {
        m135234m(f11, true, true, true, true);
    }

    /* renamed from: m */
    public void m135234m(float f11, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean[] zArr = this.f124775G;
        if (zArr[0] != z11 || zArr[1] != z12 || zArr[2] != z13 || zArr[3] != z14 || this.f124773E != Math.max(0.0f, f11)) {
            boolean[] zArr2 = this.f124775G;
            zArr2[0] = z11;
            zArr2[1] = z12;
            zArr2[2] = z13;
            zArr2[3] = z14;
            this.f124773E = Math.max(0, (int) f11);
            m135224d();
            m135225e(this.f124770B, this.f124791v, this.f124774F);
            m135225e(this.f124769A, this.f124786q, this.f124773E);
        }
    }

    /* renamed from: o */
    public void mo135235o(int i11) {
        if (this.f124783O != i11) {
            this.f124783O = i11;
            if (this.f124784P) {
                m135227n(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f124785p.set(rect);
        this.f124786q.set(rect);
        m135224d();
        m135225e(this.f124770B, this.f124791v, this.f124774F);
        m135225e(this.f124769A, this.f124786q, this.f124773E);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int i11;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f124778J;
        if (colorStateList != null && (mode = this.f124780L) != null) {
            this.f124779K = m135239t(colorStateList, mode);
            return true;
        }
        int length = iArr.length;
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (iArr[i12] == 16842919) {
                z11 = true;
                break;
            }
            i12++;
        }
        if (this.f124784P != z11) {
            this.f124784P = z11;
            if (z11) {
                i11 = this.f124783O;
            } else {
                i11 = this.f124782N;
            }
            m135227n(i11);
            invalidateSelf();
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public void m135236p(int i11, int i12) {
        if (this.f124777I != i11) {
            this.f124777I = i11;
            if ((i11 & 1) == 1) {
                i11++;
            }
            this.f124777I = i11;
            m135224d();
            m135225e(this.f124770B, this.f124791v, this.f124774F);
        }
        if (i12 != this.f124793x.getColor()) {
            this.f124793x.setColor(i12);
            this.f124794y.setColor(i12);
        }
    }

    /* renamed from: q */
    public C26280e m135237q(Shader.TileMode tileMode) {
        if (this.f124771C != tileMode) {
            this.f124771C = tileMode;
            this.f124776H = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: r */
    public C26280e m135238r(Shader.TileMode tileMode) {
        if (this.f124772D != tileMode) {
            this.f124772D = tileMode;
            this.f124776H = true;
            invalidateSelf();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f124781M != i11) {
            this.f124781M = i11;
            if (this.f124784P) {
                m135227n(this.f124783O);
            } else {
                m135227n(this.f124782N);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f124788s.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f124778J = colorStateList;
        this.f124779K = m135239t(colorStateList, this.f124780L);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f124780L = mode;
        this.f124779K = m135239t(this.f124778J, mode);
        invalidateSelf();
    }

    /* renamed from: t */
    PorterDuffColorFilter m135239t(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public C26280e(int i11, int i12) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f124771C = tileMode;
        this.f124772D = tileMode;
        this.f124773E = 0;
        this.f124774F = 0;
        this.f124775G = new boolean[]{false, false, false, false};
        this.f124776H = true;
        this.f124777I = 0;
        this.f124778J = ColorStateList.valueOf(0);
        this.f124781M = 255;
        this.f124782N = -1;
        this.f124783O = 0;
        this.f124784P = false;
        m135228s();
        m135230h(i11, i12);
    }
}
