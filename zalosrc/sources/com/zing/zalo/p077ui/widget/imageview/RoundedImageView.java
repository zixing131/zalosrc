package com.zing.zalo.p077ui.widget.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.zing.zalo.AbstractC8923h0;

/* loaded from: classes6.dex */
public class RoundedImageView extends RecyclingImageView {

    /* renamed from: E */
    private static final ImageView.ScaleType[] f70457E = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: A */
    private float[] f70458A;

    /* renamed from: B */
    private float f70459B;

    /* renamed from: C */
    boolean f70460C;

    /* renamed from: D */
    private boolean f70461D;

    /* renamed from: p */
    private int f70462p;

    /* renamed from: q */
    private ImageView.ScaleType f70463q;

    /* renamed from: r */
    private float f70464r;

    /* renamed from: s */
    private float f70465s;

    /* renamed from: t */
    private float f70466t;

    /* renamed from: u */
    private float f70467u;

    /* renamed from: v */
    private float f70468v;

    /* renamed from: w */
    private ColorStateList f70469w;

    /* renamed from: x */
    private boolean f70470x;

    /* renamed from: y */
    private boolean f70471y;

    /* renamed from: z */
    private Drawable f70472z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.imageview.RoundedImageView$a */
    /* loaded from: classes6.dex */
    public static class C13652a extends Drawable {

        /* renamed from: a */
        private final RectF f70473a = new RectF();

        /* renamed from: b */
        private final RectF f70474b = new RectF();

        /* renamed from: c */
        private int f70475c;

        /* renamed from: d */
        private int f70476d;

        /* renamed from: e */
        private final RectF f70477e;

        /* renamed from: f */
        private final int f70478f;

        /* renamed from: g */
        private final int f70479g;

        /* renamed from: h */
        private final Paint f70480h;

        /* renamed from: i */
        private final Paint f70481i;

        /* renamed from: j */
        private final BitmapShader f70482j;

        /* renamed from: k */
        private final float[] f70483k;

        /* renamed from: l */
        private final float[] f70484l;

        /* renamed from: m */
        private boolean f70485m;

        /* renamed from: n */
        private boolean f70486n;

        /* renamed from: o */
        private float f70487o;

        /* renamed from: p */
        private ColorStateList f70488p;

        /* renamed from: q */
        private ImageView.ScaleType f70489q;

        /* renamed from: r */
        private final Path f70490r;

        /* renamed from: s */
        private final Bitmap f70491s;

        /* renamed from: t */
        private boolean f70492t;

        /* renamed from: u */
        boolean f70493u;

        public C13652a(Bitmap bitmap) {
            RectF rectF = new RectF();
            this.f70477e = rectF;
            this.f70483k = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.f70484l = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.f70485m = false;
            this.f70486n = false;
            this.f70487o = 0.0f;
            this.f70488p = ColorStateList.valueOf(-16777216);
            this.f70489q = ImageView.ScaleType.FIT_CENTER;
            this.f70490r = new Path();
            this.f70492t = false;
            this.f70493u = false;
            this.f70491s = bitmap;
            if (bitmap != null) {
                this.f70478f = bitmap.getWidth();
                this.f70479g = bitmap.getHeight();
            } else {
                this.f70479g = -1;
                this.f70478f = -1;
            }
            if (this.f70478f == 1 && this.f70479g == 1) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f70482j = new BitmapShader(bitmap, tileMode, tileMode);
            } else {
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                this.f70482j = new BitmapShader(bitmap, tileMode2, tileMode2);
            }
            rectF.set(0.0f, 0.0f, this.f70478f, this.f70479g);
            Paint paint = new Paint(1);
            this.f70480h = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setShader(this.f70482j);
            Paint paint2 = new Paint(1);
            this.f70481i = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(this.f70488p.getColorForState(getState(), -16777216));
            paint2.setStrokeWidth(this.f70487o);
        }

        /* renamed from: b */
        private void m76291b(Canvas canvas) {
            float f11;
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float width = this.f70473a.width() * fArr[0];
            float width2 = this.f70487o * this.f70473a.width();
            if (this.f70486n) {
                f11 = 0.0f;
            } else {
                f11 = this.f70487o * 2.0f;
            }
            float f12 = width2 / (width - f11);
            this.f70487o = f12;
            this.f70481i.setStrokeWidth(f12);
            this.f70474b.set(this.f70473a);
            if (!this.f70486n) {
                RectF rectF = this.f70474b;
                float f13 = this.f70487o;
                rectF.inset((-f13) / 2.0f, (-f13) / 2.0f);
            } else {
                RectF rectF2 = this.f70474b;
                float f14 = this.f70487o;
                rectF2.inset(f14 / 2.0f, f14 / 2.0f);
            }
        }

        /* renamed from: c */
        private void m76292c(Canvas canvas) {
            if (this.f70486n) {
                return;
            }
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float f11 = fArr[0];
            float f12 = fArr[4];
            float f13 = fArr[2];
            float f14 = fArr[5];
            float width = this.f70473a.width();
            float width2 = this.f70473a.width();
            float f15 = this.f70487o;
            float f16 = width / ((width2 + f15) + f15);
            float height = this.f70473a.height();
            float height2 = this.f70473a.height();
            float f17 = this.f70487o;
            float f18 = height / ((height2 + f17) + f17);
            canvas.scale(f16, f18);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_START;
            ImageView.ScaleType scaleType2 = this.f70489q;
            if (scaleType != scaleType2 && ImageView.ScaleType.FIT_END != scaleType2 && ImageView.ScaleType.FIT_XY != scaleType2 && ImageView.ScaleType.FIT_CENTER != scaleType2 && ImageView.ScaleType.CENTER_INSIDE != scaleType2 && ImageView.ScaleType.MATRIX != scaleType2) {
                if (ImageView.ScaleType.CENTER == scaleType2) {
                    canvas.translate((-f13) / (f16 * f11), (-f14) / (f18 * f12));
                    RectF rectF = this.f70473a;
                    float f19 = rectF.left;
                    float f21 = this.f70487o;
                    canvas.translate(-(f19 - f21), -(rectF.top - f21));
                    return;
                }
                if (ImageView.ScaleType.CENTER_CROP == scaleType2) {
                    float f22 = this.f70487o;
                    canvas.translate(f22, f22);
                    return;
                }
                return;
            }
            float f23 = this.f70487o;
            canvas.translate(f23, f23);
        }

        /* renamed from: d */
        private void m76293d(Matrix matrix) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.f70483k;
                if (i11 < fArr2.length) {
                    fArr2[i11] = fArr2[i11] / fArr[0];
                    i11++;
                } else {
                    m76299e();
                    return;
                }
            }
        }

        /* renamed from: f */
        private void m76294f(Canvas canvas) {
            float f11;
            float f12;
            float f13;
            Rect clipBounds = canvas.getClipBounds();
            Matrix matrix = canvas.getMatrix();
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            ImageView.ScaleType scaleType2 = this.f70489q;
            if (scaleType == scaleType2) {
                this.f70473a.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.CENTER_CROP == scaleType2) {
                m76293d(matrix);
                Rect bounds = getBounds();
                if (bounds.width() > 0 && bounds.height() > 0 && this.f70475c > 0 && this.f70476d > 0) {
                    int width = bounds.width();
                    int height = bounds.height();
                    int i11 = this.f70476d;
                    int i12 = width * i11;
                    int i13 = this.f70475c;
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
                    this.f70473a.set(bounds);
                    return;
                }
                this.f70473a.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.FIT_XY == scaleType2) {
                Matrix matrix2 = new Matrix();
                matrix2.setRectToRect(this.f70477e, new RectF(clipBounds), Matrix.ScaleToFit.FILL);
                this.f70482j.setLocalMatrix(matrix2);
                this.f70473a.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.FIT_START != scaleType2 && ImageView.ScaleType.FIT_END != scaleType2 && ImageView.ScaleType.FIT_CENTER != scaleType2 && ImageView.ScaleType.CENTER_INSIDE != scaleType2) {
                if (ImageView.ScaleType.MATRIX == scaleType2) {
                    m76293d(matrix);
                    this.f70473a.set(this.f70477e);
                    return;
                }
                return;
            }
            m76293d(matrix);
            this.f70473a.set(this.f70477e);
        }

        /* renamed from: g */
        public static Bitmap m76295g(Drawable drawable) {
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
        public static C13652a m76296h(Bitmap bitmap) {
            if (bitmap != null) {
                return new C13652a(bitmap);
            }
            return null;
        }

        /* renamed from: i */
        public static Drawable m76297i(Drawable drawable) {
            if (drawable != null) {
                if (drawable instanceof C13652a) {
                    return drawable;
                }
                if (drawable instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    int numberOfLayers = layerDrawable.getNumberOfLayers();
                    for (int i11 = 0; i11 < numberOfLayers; i11++) {
                        layerDrawable.setId(i11, i11);
                        layerDrawable.setDrawableByLayerId(layerDrawable.getId(i11), m76297i(layerDrawable.getDrawable(i11)));
                    }
                    return layerDrawable;
                }
                Bitmap m76295g = m76295g(drawable);
                if (m76295g != null) {
                    return new C13652a(m76295g);
                }
                return drawable;
            }
            return drawable;
        }

        /* renamed from: k */
        private void m76298k() {
            int i11 = 0;
            while (true) {
                float[] fArr = this.f70483k;
                if (i11 < fArr.length) {
                    float f11 = fArr[i11];
                    if (f11 > 0.0f) {
                        this.f70484l[i11] = f11;
                        fArr[i11] = fArr[i11] - this.f70487o;
                    }
                    i11++;
                } else {
                    m76299e();
                    return;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.save();
            if (!this.f70492t) {
                m76294f(canvas);
                if (this.f70487o > 0.0f) {
                    m76291b(canvas);
                    m76298k();
                }
                this.f70492t = true;
            }
            this.f70490r.reset();
            if (this.f70485m) {
                if (this.f70487o > 0.0f) {
                    m76292c(canvas);
                    Path path = this.f70490r;
                    RectF rectF = this.f70473a;
                    Path.Direction direction = Path.Direction.CW;
                    path.addOval(rectF, direction);
                    canvas.drawPath(this.f70490r, this.f70480h);
                    this.f70490r.reset();
                    this.f70490r.addOval(this.f70474b, direction);
                    canvas.drawPath(this.f70490r, this.f70481i);
                } else {
                    this.f70490r.addOval(this.f70473a, Path.Direction.CW);
                    canvas.drawPath(this.f70490r, this.f70480h);
                }
            } else if (this.f70487o > 0.0f) {
                m76292c(canvas);
                if (this.f70493u) {
                    this.f70490r.addRoundRect(this.f70473a, this.f70483k, Path.Direction.CW);
                } else {
                    this.f70490r.addRect(this.f70473a, Path.Direction.CW);
                }
                canvas.drawPath(this.f70490r, this.f70480h);
                this.f70490r.reset();
                if (this.f70493u) {
                    this.f70490r.addRoundRect(this.f70474b, this.f70484l, Path.Direction.CW);
                } else {
                    this.f70490r.addRect(this.f70474b, Path.Direction.CW);
                }
                canvas.drawPath(this.f70490r, this.f70481i);
            } else {
                if (this.f70493u) {
                    this.f70490r.addRoundRect(this.f70473a, this.f70483k, Path.Direction.CW);
                } else {
                    this.f70490r.addRect(this.f70473a, Path.Direction.CW);
                }
                canvas.drawPath(this.f70490r, this.f70480h);
            }
            canvas.restore();
        }

        /* renamed from: e */
        void m76299e() {
            int i11 = 0;
            while (true) {
                float[] fArr = this.f70483k;
                if (i11 < fArr.length) {
                    if (fArr[i11] > 0.0f) {
                        this.f70493u = true;
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
            return this.f70479g;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f70478f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            Bitmap bitmap = this.f70491s;
            if (bitmap != null && !bitmap.hasAlpha() && this.f70480h.getAlpha() >= 255) {
                return -1;
            }
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.f70488p.isStateful();
        }

        /* renamed from: j */
        public void m76300j(ColorStateList colorStateList) {
            if (colorStateList == null) {
                this.f70487o = 0.0f;
                this.f70488p = ColorStateList.valueOf(0);
                this.f70481i.setColor(0);
            } else {
                this.f70488p = colorStateList;
                this.f70481i.setColor(colorStateList.getColorForState(getState(), -16777216));
            }
        }

        /* renamed from: l */
        public void m76301l(float f11) {
            this.f70487o = f11;
            this.f70481i.setStrokeWidth(f11);
        }

        /* renamed from: m */
        public void m76302m(float[] fArr) {
            if (fArr == null) {
                return;
            }
            if (fArr.length == 8) {
                System.arraycopy(fArr, 0, this.f70483k, 0, fArr.length);
                m76299e();
                return;
            }
            throw new ArrayIndexOutOfBoundsException("radii[] needs 8 values");
        }

        /* renamed from: n */
        public void m76303n(boolean z11) {
            this.f70486n = z11;
        }

        /* renamed from: o */
        public void m76304o(boolean z11) {
            this.f70485m = z11;
        }

        @Override // android.graphics.drawable.Drawable
        protected boolean onStateChange(int[] iArr) {
            int colorForState = this.f70488p.getColorForState(iArr, 0);
            if (this.f70481i.getColor() != colorForState) {
                this.f70481i.setColor(colorForState);
                return true;
            }
            return super.onStateChange(iArr);
        }

        /* renamed from: p */
        public void m76305p(ImageView.ScaleType scaleType) {
            if (scaleType == null) {
                return;
            }
            this.f70489q = scaleType;
        }

        /* renamed from: q */
        public void m76306q(int i11, int i12) {
            this.f70475c = i11;
            this.f70476d = i12;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i11) {
            this.f70480h.setAlpha(i11);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f70480h.setColorFilter(colorFilter);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z11) {
            this.f70480h.setDither(z11);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z11) {
            this.f70480h.setFilterBitmap(z11);
            invalidateSelf();
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f70462p = 0;
        this.f70463q = ImageView.ScaleType.FIT_CENTER;
        this.f70464r = 0.0f;
        this.f70465s = 0.0f;
        this.f70466t = 0.0f;
        this.f70467u = 0.0f;
        this.f70468v = 0.0f;
        this.f70469w = ColorStateList.valueOf(-16777216);
        this.f70470x = false;
        this.f70471y = false;
        this.f70458A = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f70459B = -1.0f;
        this.f70460C = false;
        this.f70461D = false;
    }

    /* renamed from: i */
    private Drawable m76287i() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i11 = this.f70462p;
        if (i11 != 0) {
            try {
                drawable = resources.getDrawable(i11);
            } catch (Resources.NotFoundException unused) {
                this.f70462p = 0;
            }
        }
        return C13652a.m76297i(drawable);
    }

    /* renamed from: k */
    private void m76288k() {
        Drawable drawable = this.f70472z;
        if (drawable == null) {
            return;
        }
        if (drawable instanceof C13652a) {
            ((C13652a) drawable).f70492t = false;
            ((C13652a) this.f70472z).m76305p(this.f70463q);
            ((C13652a) this.f70472z).m76302m(this.f70458A);
            ((C13652a) this.f70472z).m76301l(this.f70468v);
            ((C13652a) this.f70472z).m76300j(this.f70469w);
            ((C13652a) this.f70472z).m76304o(this.f70471y);
            ((C13652a) this.f70472z).m76303n(this.f70470x);
            ((C13652a) this.f70472z).m76306q((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                Drawable drawable2 = layerDrawable.getDrawable(i11);
                if (drawable2 instanceof C13652a) {
                    C13652a c13652a = (C13652a) drawable2;
                    c13652a.f70492t = false;
                    c13652a.m76305p(this.f70463q);
                    c13652a.m76302m(this.f70458A);
                    c13652a.m76301l(this.f70468v);
                    c13652a.m76300j(this.f70469w);
                    c13652a.m76304o(this.f70471y);
                    c13652a.m76303n(this.f70470x);
                    c13652a.m76306q((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
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
        return this.f70469w.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f70469w;
    }

    public float getBorderWidth() {
        return this.f70468v;
    }

    public float getCornerRadius() {
        return this.f70464r;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f70463q;
    }

    /* renamed from: j */
    public void m76289j(float f11, float f12, float f13, float f14) {
        float f15 = getResources().getDisplayMetrics().density;
        float f16 = f11 * f15;
        float f17 = f12 * f15;
        float f18 = f13 * f15;
        float f19 = f14 * f15;
        this.f70458A = new float[]{f16, f16, f17, f17, f19, f19, f18, f18};
        this.f70460C = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f70472z != null && !this.f70460C) {
            this.f70460C = true;
            m76288k();
        }
        super.onDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f70459B > 0.0f && getDrawable() != null) {
            int size = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size, (int) (size * this.f70459B));
            return;
        }
        super.onMeasure(i11, i12);
        if (this.f70461D && getDrawable() != null) {
            setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), getMeasuredWidth()), Math.max(getSuggestedMinimumHeight(), getMeasuredHeight()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13 || i12 != i14) {
            this.f70460C = false;
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z11) {
        super.setAdjustViewBounds(z11);
        if (!z11) {
            this.f70461D = false;
        }
    }

    public void setApplyMinWidthWitAdjustViewBounds(boolean z11) {
        this.f70461D = z11;
    }

    public void setBorderColor(int i11) {
        setBorderColor(ColorStateList.valueOf(i11));
    }

    public void setBorderWidthDP(float f11) {
        float f12 = getResources().getDisplayMetrics().density * f11;
        if (this.f70468v == f12) {
            return;
        }
        this.f70468v = f12;
        this.f70460C = false;
        invalidate();
    }

    public void setIgnoreAdjustBoundsForBorder(boolean z11) {
        this.f70470x = z11;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f70462p = 0;
        C13652a m76296h = C13652a.m76296h(bitmap);
        this.f70472z = m76296h;
        super.setImageDrawable(m76296h);
        this.f70460C = false;
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f70462p = 0;
        Drawable m76297i = C13652a.m76297i(drawable);
        this.f70472z = m76297i;
        super.setImageDrawable(m76297i);
        this.f70460C = false;
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        this.f70462p = i11;
        Drawable m76287i = m76287i();
        this.f70472z = m76287i;
        super.setImageDrawable(m76287i);
        this.f70460C = false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z11) {
        this.f70471y = z11;
        this.f70460C = false;
        invalidate();
    }

    public void setRatio(float f11) {
        this.f70459B = f11;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        this.f70463q = scaleType;
        this.f70460C = false;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f70469w.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f70469w = colorStateList;
        this.f70460C = false;
        if (this.f70468v > 0.0f) {
            invalidate();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70462p = 0;
        this.f70463q = ImageView.ScaleType.FIT_CENTER;
        this.f70464r = 0.0f;
        this.f70465s = 0.0f;
        this.f70466t = 0.0f;
        this.f70467u = 0.0f;
        this.f70468v = 0.0f;
        this.f70469w = ColorStateList.valueOf(-16777216);
        this.f70470x = false;
        this.f70471y = false;
        this.f70458A = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f70459B = -1.0f;
        this.f70460C = false;
        this.f70461D = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.RoundedImageView, 0, 0);
        int i11 = obtainStyledAttributes.getInt(AbstractC8923h0.RoundedImageView_android_scaleType, -1);
        if (i11 >= 0) {
            setScaleType(f70457E[i11]);
        }
        this.f70464r = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RoundedImageView_sriv_left_top_corner_radius, 0);
        this.f70465s = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RoundedImageView_sriv_right_top_corner_radius, 0);
        this.f70466t = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RoundedImageView_sriv_left_bottom_corner_radius, 0);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RoundedImageView_sriv_right_bottom_corner_radius, 0);
        this.f70467u = dimensionPixelSize;
        float f11 = this.f70464r;
        if (f11 >= 0.0f) {
            float f12 = this.f70465s;
            if (f12 >= 0.0f) {
                float f13 = this.f70466t;
                if (f13 >= 0.0f && dimensionPixelSize >= 0.0f) {
                    this.f70458A = new float[]{f11, f11, f12, f12, dimensionPixelSize, dimensionPixelSize, f13, f13};
                    float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RoundedImageView_sriv_border_width, 0);
                    this.f70468v = dimensionPixelSize2;
                    if (dimensionPixelSize2 >= 0.0f) {
                        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(AbstractC8923h0.RoundedImageView_sriv_border_color);
                        this.f70469w = colorStateList;
                        if (colorStateList == null) {
                            this.f70469w = ColorStateList.valueOf(-16777216);
                        }
                        this.f70471y = obtainStyledAttributes.getBoolean(AbstractC8923h0.RoundedImageView_sriv_oval, false);
                        obtainStyledAttributes.recycle();
                        this.f70459B = -1.0f;
                        return;
                    }
                    throw new IllegalArgumentException("border width cannot be negative.");
                }
            }
        }
        throw new IllegalArgumentException("radius values cannot be negative.");
    }
}
