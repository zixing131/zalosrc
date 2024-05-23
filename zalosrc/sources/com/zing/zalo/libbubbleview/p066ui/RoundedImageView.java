package com.zing.zalo.libbubbleview.p066ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes4.dex */
public class RoundedImageView extends RecyclingImageView {

    /* renamed from: E */
    private static final ImageView.ScaleType[] f47847E = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: A */
    private float[] f47848A;

    /* renamed from: B */
    private float f47849B;

    /* renamed from: C */
    boolean f47850C;

    /* renamed from: D */
    private boolean f47851D;

    /* renamed from: p */
    private int f47852p;

    /* renamed from: q */
    private ImageView.ScaleType f47853q;

    /* renamed from: r */
    private float f47854r;

    /* renamed from: s */
    private float f47855s;

    /* renamed from: t */
    private float f47856t;

    /* renamed from: u */
    private float f47857u;

    /* renamed from: v */
    private float f47858v;

    /* renamed from: w */
    private ColorStateList f47859w;

    /* renamed from: x */
    private boolean f47860x;

    /* renamed from: y */
    private boolean f47861y;

    /* renamed from: z */
    private Drawable f47862z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.libbubbleview.ui.RoundedImageView$a */
    /* loaded from: classes4.dex */
    public static class C8951a extends Drawable {

        /* renamed from: a */
        private final RectF f47863a = new RectF();

        /* renamed from: b */
        private final RectF f47864b = new RectF();

        /* renamed from: c */
        private int f47865c;

        /* renamed from: d */
        private int f47866d;

        /* renamed from: e */
        private final RectF f47867e;

        /* renamed from: f */
        private final int f47868f;

        /* renamed from: g */
        private final int f47869g;

        /* renamed from: h */
        private final Paint f47870h;

        /* renamed from: i */
        private final Paint f47871i;

        /* renamed from: j */
        private final BitmapShader f47872j;

        /* renamed from: k */
        private final float[] f47873k;

        /* renamed from: l */
        private final float[] f47874l;

        /* renamed from: m */
        private boolean f47875m;

        /* renamed from: n */
        private boolean f47876n;

        /* renamed from: o */
        private float f47877o;

        /* renamed from: p */
        private ColorStateList f47878p;

        /* renamed from: q */
        private ImageView.ScaleType f47879q;

        /* renamed from: r */
        private final Path f47880r;

        /* renamed from: s */
        private final Bitmap f47881s;

        /* renamed from: t */
        private boolean f47882t;

        /* renamed from: u */
        boolean f47883u;

        public C8951a(Bitmap bitmap, Resources resources) {
            RectF rectF = new RectF();
            this.f47867e = rectF;
            this.f47873k = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.f47874l = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.f47875m = false;
            this.f47876n = false;
            this.f47877o = 0.0f;
            this.f47878p = ColorStateList.valueOf(-16777216);
            this.f47879q = ImageView.ScaleType.FIT_CENTER;
            this.f47880r = new Path();
            this.f47882t = false;
            this.f47883u = false;
            this.f47881s = bitmap;
            if (bitmap != null) {
                this.f47868f = bitmap.getScaledWidth(resources.getDisplayMetrics());
                this.f47869g = bitmap.getScaledHeight(resources.getDisplayMetrics());
            } else {
                this.f47869g = -1;
                this.f47868f = -1;
            }
            if (this.f47868f == 1 && this.f47869g == 1) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f47872j = new BitmapShader(bitmap, tileMode, tileMode);
            } else {
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                this.f47872j = new BitmapShader(bitmap, tileMode2, tileMode2);
            }
            rectF.set(0.0f, 0.0f, this.f47868f, this.f47869g);
            Paint paint = new Paint(1);
            this.f47870h = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setShader(this.f47872j);
            Paint paint2 = new Paint(1);
            this.f47871i = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(this.f47878p.getColorForState(getState(), -16777216));
            paint2.setStrokeWidth(this.f47877o);
        }

        /* renamed from: b */
        private void m47827b(Canvas canvas) {
            float f11;
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float width = this.f47863a.width() * fArr[0];
            float width2 = this.f47877o * this.f47863a.width();
            if (this.f47876n) {
                f11 = 0.0f;
            } else {
                f11 = this.f47877o * 2.0f;
            }
            float f12 = width2 / (width - f11);
            this.f47877o = f12;
            this.f47871i.setStrokeWidth(f12);
            this.f47864b.set(this.f47863a);
            if (!this.f47876n) {
                RectF rectF = this.f47864b;
                float f13 = this.f47877o;
                rectF.inset((-f13) / 2.0f, (-f13) / 2.0f);
            } else {
                RectF rectF2 = this.f47864b;
                float f14 = this.f47877o;
                rectF2.inset(f14 / 2.0f, f14 / 2.0f);
            }
        }

        /* renamed from: c */
        private void m47828c(Canvas canvas) {
            if (this.f47876n) {
                return;
            }
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float f11 = fArr[0];
            float f12 = fArr[4];
            float f13 = fArr[2];
            float f14 = fArr[5];
            float width = this.f47863a.width();
            float width2 = this.f47863a.width();
            float f15 = this.f47877o;
            float f16 = width / ((width2 + f15) + f15);
            float height = this.f47863a.height();
            float height2 = this.f47863a.height();
            float f17 = this.f47877o;
            float f18 = height / ((height2 + f17) + f17);
            canvas.scale(f16, f18);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_START;
            ImageView.ScaleType scaleType2 = this.f47879q;
            if (scaleType != scaleType2 && ImageView.ScaleType.FIT_END != scaleType2 && ImageView.ScaleType.FIT_XY != scaleType2 && ImageView.ScaleType.FIT_CENTER != scaleType2 && ImageView.ScaleType.CENTER_INSIDE != scaleType2 && ImageView.ScaleType.MATRIX != scaleType2) {
                if (ImageView.ScaleType.CENTER == scaleType2) {
                    canvas.translate((-f13) / (f16 * f11), (-f14) / (f18 * f12));
                    RectF rectF = this.f47863a;
                    float f19 = rectF.left;
                    float f21 = this.f47877o;
                    canvas.translate(-(f19 - f21), -(rectF.top - f21));
                    return;
                }
                if (ImageView.ScaleType.CENTER_CROP == scaleType2) {
                    float f22 = this.f47877o;
                    canvas.translate(f22, f22);
                    return;
                }
                return;
            }
            float f23 = this.f47877o;
            canvas.translate(f23, f23);
        }

        /* renamed from: d */
        private void m47829d(Matrix matrix) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.f47873k;
                if (i11 < fArr2.length) {
                    fArr2[i11] = fArr2[i11] / fArr[0];
                    i11++;
                } else {
                    m47835e();
                    return;
                }
            }
        }

        /* renamed from: f */
        private void m47830f(Canvas canvas) {
            float f11;
            float f12;
            float f13;
            Rect clipBounds = canvas.getClipBounds();
            Matrix matrix = canvas.getMatrix();
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            ImageView.ScaleType scaleType2 = this.f47879q;
            if (scaleType == scaleType2) {
                this.f47863a.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.CENTER_CROP == scaleType2) {
                m47829d(matrix);
                Rect bounds = getBounds();
                if (bounds.width() > 0 && bounds.height() > 0 && this.f47865c > 0 && this.f47866d > 0) {
                    int width = bounds.width();
                    int height = bounds.height();
                    int i11 = this.f47866d;
                    int i12 = width * i11;
                    int i13 = this.f47865c;
                    float f14 = 0.0f;
                    if (i12 > i13 * height) {
                        float f15 = height / i11;
                        f11 = i13 * f15;
                        f12 = i11 * f15;
                        f14 = (width - f11) * 0.5f;
                        f13 = 0.0f;
                    } else {
                        float f16 = width / i13;
                        f11 = i13 * f16;
                        f12 = i11 * f16;
                        f13 = (height - f12) * 0.5f;
                    }
                    bounds.left = (int) f14;
                    bounds.top = (int) f13;
                    bounds.right = Math.round(f14 + f11);
                    bounds.bottom = Math.round(f13 + f12);
                    this.f47863a.set(bounds);
                    return;
                }
                this.f47863a.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.FIT_XY == scaleType2) {
                Matrix matrix2 = new Matrix();
                matrix2.setRectToRect(this.f47867e, new RectF(clipBounds), Matrix.ScaleToFit.FILL);
                this.f47872j.setLocalMatrix(matrix2);
                this.f47863a.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.FIT_START != scaleType2 && ImageView.ScaleType.FIT_END != scaleType2 && ImageView.ScaleType.FIT_CENTER != scaleType2 && ImageView.ScaleType.CENTER_INSIDE != scaleType2) {
                if (ImageView.ScaleType.MATRIX == scaleType2) {
                    m47829d(matrix);
                    this.f47863a.set(this.f47867e);
                    return;
                }
                return;
            }
            m47829d(matrix);
            this.f47863a.set(this.f47867e);
        }

        /* renamed from: g */
        public static Bitmap m47831g(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(Math.max(drawable.getBounds().width(), drawable.getIntrinsicWidth()), 2), Math.max(Math.max(drawable.getBounds().height(), drawable.getIntrinsicHeight()), 2), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return createBitmap;
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
                return null;
            }
        }

        /* renamed from: h */
        public static C8951a m47832h(Bitmap bitmap, Resources resources) {
            if (bitmap != null) {
                return new C8951a(bitmap, resources);
            }
            return null;
        }

        /* renamed from: i */
        public static Drawable m47833i(Drawable drawable, Resources resources) {
            if (drawable != null) {
                if (drawable instanceof C8951a) {
                    return drawable;
                }
                if (drawable instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    int numberOfLayers = layerDrawable.getNumberOfLayers();
                    for (int i11 = 0; i11 < numberOfLayers; i11++) {
                        layerDrawable.setId(i11, i11);
                        layerDrawable.setDrawableByLayerId(layerDrawable.getId(i11), m47833i(layerDrawable.getDrawable(i11), resources));
                    }
                    return layerDrawable;
                }
                Bitmap m47831g = m47831g(drawable);
                if (m47831g != null) {
                    return new C8951a(m47831g, resources);
                }
                return drawable;
            }
            return drawable;
        }

        /* renamed from: k */
        private void m47834k() {
            int i11 = 0;
            while (true) {
                float[] fArr = this.f47873k;
                if (i11 < fArr.length) {
                    float f11 = fArr[i11];
                    if (f11 > 0.0f) {
                        this.f47874l[i11] = f11;
                        fArr[i11] = fArr[i11] - this.f47877o;
                    }
                    i11++;
                } else {
                    m47835e();
                    return;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.save();
            if (!this.f47882t) {
                m47830f(canvas);
                if (this.f47877o > 0.0f) {
                    m47827b(canvas);
                    m47834k();
                }
                this.f47882t = true;
            }
            this.f47880r.reset();
            if (this.f47875m) {
                if (this.f47877o > 0.0f) {
                    m47828c(canvas);
                    Path path = this.f47880r;
                    RectF rectF = this.f47863a;
                    Path.Direction direction = Path.Direction.CW;
                    path.addOval(rectF, direction);
                    canvas.drawPath(this.f47880r, this.f47870h);
                    this.f47880r.reset();
                    this.f47880r.addOval(this.f47864b, direction);
                    canvas.drawPath(this.f47880r, this.f47871i);
                } else {
                    this.f47880r.addOval(this.f47863a, Path.Direction.CW);
                    canvas.drawPath(this.f47880r, this.f47870h);
                }
            } else if (this.f47877o > 0.0f) {
                m47828c(canvas);
                if (this.f47883u) {
                    this.f47880r.addRoundRect(this.f47863a, this.f47873k, Path.Direction.CW);
                } else {
                    this.f47880r.addRect(this.f47863a, Path.Direction.CW);
                }
                canvas.drawPath(this.f47880r, this.f47870h);
                this.f47880r.reset();
                if (this.f47883u) {
                    this.f47880r.addRoundRect(this.f47864b, this.f47874l, Path.Direction.CW);
                } else {
                    this.f47880r.addRect(this.f47864b, Path.Direction.CW);
                }
                canvas.drawPath(this.f47880r, this.f47871i);
            } else {
                if (this.f47883u) {
                    this.f47880r.addRoundRect(this.f47863a, this.f47873k, Path.Direction.CW);
                } else {
                    this.f47880r.addRect(this.f47863a, Path.Direction.CW);
                }
                canvas.drawPath(this.f47880r, this.f47870h);
            }
            canvas.restore();
        }

        /* renamed from: e */
        void m47835e() {
            int i11 = 0;
            while (true) {
                float[] fArr = this.f47873k;
                if (i11 < fArr.length) {
                    if (fArr[i11] > 0.0f) {
                        this.f47883u = true;
                        return;
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f47869g;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f47868f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            Bitmap bitmap = this.f47881s;
            if (bitmap != null && !bitmap.hasAlpha() && this.f47870h.getAlpha() >= 255) {
                return -1;
            }
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.f47878p.isStateful();
        }

        /* renamed from: j */
        public void m47836j(ColorStateList colorStateList) {
            if (colorStateList == null) {
                this.f47877o = 0.0f;
                this.f47878p = ColorStateList.valueOf(0);
                this.f47871i.setColor(0);
            } else {
                this.f47878p = colorStateList;
                this.f47871i.setColor(colorStateList.getColorForState(getState(), -16777216));
            }
        }

        /* renamed from: l */
        public void m47837l(float f11) {
            this.f47877o = f11;
            this.f47871i.setStrokeWidth(f11);
        }

        /* renamed from: m */
        public void m47838m(float[] fArr) {
            if (fArr == null) {
                return;
            }
            if (fArr.length == 8) {
                System.arraycopy(fArr, 0, this.f47873k, 0, fArr.length);
                m47835e();
                return;
            }
            throw new ArrayIndexOutOfBoundsException("radii[] needs 8 values");
        }

        /* renamed from: n */
        public void m47839n(boolean z11) {
            this.f47876n = z11;
        }

        /* renamed from: o */
        public void m47840o(boolean z11) {
            this.f47875m = z11;
        }

        @Override // android.graphics.drawable.Drawable
        protected boolean onStateChange(int[] iArr) {
            int colorForState = this.f47878p.getColorForState(iArr, 0);
            if (this.f47871i.getColor() != colorForState) {
                this.f47871i.setColor(colorForState);
                return true;
            }
            return super.onStateChange(iArr);
        }

        /* renamed from: p */
        public void m47841p(ImageView.ScaleType scaleType) {
            if (scaleType == null) {
                return;
            }
            this.f47879q = scaleType;
        }

        /* renamed from: q */
        public void m47842q(int i11, int i12) {
            this.f47865c = i11;
            this.f47866d = i12;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i11) {
            this.f47870h.setAlpha(i11);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f47870h.setColorFilter(colorFilter);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z11) {
            this.f47870h.setDither(z11);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z11) {
            this.f47870h.setFilterBitmap(z11);
            invalidateSelf();
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f47852p = 0;
        this.f47853q = ImageView.ScaleType.FIT_CENTER;
        this.f47854r = 0.0f;
        this.f47855s = 0.0f;
        this.f47856t = 0.0f;
        this.f47857u = 0.0f;
        this.f47858v = 0.0f;
        this.f47859w = ColorStateList.valueOf(-16777216);
        this.f47860x = false;
        this.f47861y = false;
        this.f47848A = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f47849B = -1.0f;
        this.f47850C = false;
        this.f47851D = false;
    }

    /* renamed from: i */
    private Drawable m47823i() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i11 = this.f47852p;
        if (i11 != 0) {
            try {
                drawable = resources.getDrawable(i11);
            } catch (Resources.NotFoundException unused) {
                this.f47852p = 0;
            }
        }
        return C8951a.m47833i(drawable, getResources());
    }

    /* renamed from: k */
    private void m47824k() {
        Drawable drawable = this.f47862z;
        if (drawable == null) {
            return;
        }
        if (drawable instanceof C8951a) {
            ((C8951a) drawable).f47882t = false;
            ((C8951a) this.f47862z).m47841p(this.f47853q);
            ((C8951a) this.f47862z).m47838m(this.f47848A);
            ((C8951a) this.f47862z).m47837l(this.f47858v);
            ((C8951a) this.f47862z).m47836j(this.f47859w);
            ((C8951a) this.f47862z).m47840o(this.f47861y);
            ((C8951a) this.f47862z).m47839n(this.f47860x);
            ((C8951a) this.f47862z).m47842q((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                Drawable drawable2 = layerDrawable.getDrawable(i11);
                if (drawable2 instanceof C8951a) {
                    C8951a c8951a = (C8951a) drawable2;
                    c8951a.f47882t = false;
                    c8951a.m47841p(this.f47853q);
                    c8951a.m47838m(this.f47848A);
                    c8951a.m47837l(this.f47858v);
                    c8951a.m47836j(this.f47859w);
                    c8951a.m47840o(this.f47861y);
                    c8951a.m47839n(this.f47860x);
                    c8951a.m47842q((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f47859w.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f47859w;
    }

    public float getBorderWidth() {
        return this.f47858v;
    }

    public float getCornerRadius() {
        return this.f47854r;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f47853q;
    }

    /* renamed from: j */
    public void m47825j(float f11, float f12, float f13, float f14) {
        float f15 = getResources().getDisplayMetrics().density;
        float f16 = f11 * f15;
        float f17 = f12 * f15;
        float f18 = f13 * f15;
        float f19 = f14 * f15;
        this.f47848A = new float[]{f16, f16, f17, f17, f19, f19, f18, f18};
        this.f47850C = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f47862z != null && !this.f47850C) {
            this.f47850C = true;
            m47824k();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f47849B > 0.0f && getDrawable() != null) {
            int size = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size, (int) (size * this.f47849B));
            return;
        }
        super.onMeasure(i11, i12);
        if (this.f47851D && getDrawable() != null) {
            setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), getMeasuredWidth()), Math.max(getSuggestedMinimumHeight(), getMeasuredHeight()));
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13 || i12 != i14) {
            this.f47850C = false;
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z11) {
        super.setAdjustViewBounds(z11);
        if (!z11) {
            this.f47851D = false;
        }
    }

    public void setApplyMinWidthWitAdjustViewBounds(boolean z11) {
        this.f47851D = z11;
    }

    public void setBorderColor(int i11) {
        setBorderColor(ColorStateList.valueOf(i11));
    }

    public void setBorderWidthDP(float f11) {
        float f12 = getResources().getDisplayMetrics().density * f11;
        if (this.f47858v == f12) {
            return;
        }
        this.f47858v = f12;
        this.f47850C = false;
        invalidate();
    }

    public void setIgnoreAdjustBoundsForBorder(boolean z11) {
        this.f47860x = z11;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f47852p = 0;
        C8951a m47832h = C8951a.m47832h(bitmap, getResources());
        this.f47862z = m47832h;
        super.setImageDrawable(m47832h);
        this.f47850C = false;
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f47852p = 0;
        Drawable m47833i = C8951a.m47833i(drawable, getResources());
        this.f47862z = m47833i;
        super.setImageDrawable(m47833i);
        this.f47850C = false;
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        this.f47852p = i11;
        Drawable m47823i = m47823i();
        this.f47862z = m47823i;
        super.setImageDrawable(m47823i);
        this.f47850C = false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z11) {
        this.f47861y = z11;
        this.f47850C = false;
        invalidate();
    }

    public void setRatio(float f11) {
        this.f47849B = f11;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        this.f47853q = scaleType;
        this.f47850C = false;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f47859w.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f47859w = colorStateList;
        this.f47850C = false;
        if (this.f47858v > 0.0f) {
            invalidate();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47852p = 0;
        this.f47853q = ImageView.ScaleType.FIT_CENTER;
        this.f47854r = 0.0f;
        this.f47855s = 0.0f;
        this.f47856t = 0.0f;
        this.f47857u = 0.0f;
        this.f47858v = 0.0f;
        this.f47859w = ColorStateList.valueOf(-16777216);
        this.f47860x = false;
        this.f47861y = false;
        this.f47848A = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f47849B = -1.0f;
        this.f47850C = false;
        this.f47851D = false;
    }
}
