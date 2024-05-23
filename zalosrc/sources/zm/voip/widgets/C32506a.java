package zm.voip.widgets;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;

/* renamed from: zm.voip.widgets.a */
/* loaded from: classes7.dex */
public class C32506a extends Drawable {

    /* renamed from: a */
    private final RectF f150148a = new RectF();

    /* renamed from: b */
    private final RectF f150149b = new RectF();

    /* renamed from: c */
    private final RectF f150150c;

    /* renamed from: d */
    private final RectF f150151d;

    /* renamed from: e */
    private final Matrix f150152e;

    /* renamed from: f */
    private final Bitmap f150153f;

    /* renamed from: g */
    private final Paint f150154g;

    /* renamed from: h */
    private ImageView.ScaleType f150155h;

    /* renamed from: i */
    private final int f150156i;

    /* renamed from: j */
    private final int f150157j;

    /* renamed from: k */
    private float f150158k;

    /* renamed from: l */
    private boolean f150159l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.a$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f150160a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f150160a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f150160a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f150160a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f150160a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f150160a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f150160a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f150160a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private C32506a(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f150150c = rectF;
        this.f150151d = new RectF();
        this.f150152e = new Matrix();
        this.f150155h = ImageView.ScaleType.FIT_CENTER;
        this.f150158k = 0.0f;
        this.f150159l = true;
        this.f150153f = bitmap;
        int width = bitmap.getWidth();
        this.f150156i = width;
        int height = bitmap.getHeight();
        this.f150157j = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f150154g = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    private static Bitmap m157429a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C32506a m157430b(Bitmap bitmap) {
        if (bitmap != null) {
            return new C32506a(bitmap);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Drawable m157431c(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof C32506a) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i11), m157431c(layerDrawable.getDrawable(i11)));
                }
                return layerDrawable;
            }
            Bitmap m157429a = m157429a(drawable);
            if (m157429a != null) {
                return new C32506a(m157429a);
            }
            return drawable;
        }
        return drawable;
    }

    /* renamed from: f */
    private void m157432f() {
        float width;
        float height;
        float min;
        int i11 = a.f150160a[this.f150155h.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                this.f150151d.set(this.f150150c);
                                this.f150152e.setRectToRect(this.f150150c, this.f150148a, Matrix.ScaleToFit.CENTER);
                                this.f150152e.mapRect(this.f150151d);
                                this.f150152e.setRectToRect(this.f150150c, this.f150151d, Matrix.ScaleToFit.FILL);
                            } else {
                                this.f150151d.set(this.f150148a);
                                this.f150152e.reset();
                                this.f150152e.setRectToRect(this.f150150c, this.f150151d, Matrix.ScaleToFit.FILL);
                            }
                        } else {
                            this.f150151d.set(this.f150150c);
                            this.f150152e.setRectToRect(this.f150150c, this.f150148a, Matrix.ScaleToFit.START);
                            this.f150152e.mapRect(this.f150151d);
                            this.f150152e.setRectToRect(this.f150150c, this.f150151d, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        this.f150151d.set(this.f150150c);
                        this.f150152e.setRectToRect(this.f150150c, this.f150148a, Matrix.ScaleToFit.END);
                        this.f150152e.mapRect(this.f150151d);
                        this.f150152e.setRectToRect(this.f150150c, this.f150151d, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    this.f150152e.reset();
                    if (this.f150156i <= this.f150148a.width() && this.f150157j <= this.f150148a.height()) {
                        min = 1.0f;
                    } else {
                        min = Math.min(this.f150148a.width() / this.f150156i, this.f150148a.height() / this.f150157j);
                    }
                    float width2 = (int) (((this.f150148a.width() - (this.f150156i * min)) * 0.5f) + 0.5f);
                    float height2 = (int) (((this.f150148a.height() - (this.f150157j * min)) * 0.5f) + 0.5f);
                    this.f150152e.setScale(min, min);
                    this.f150152e.postTranslate(width2, height2);
                    this.f150151d.set(this.f150150c);
                    this.f150152e.mapRect(this.f150151d);
                    this.f150152e.setRectToRect(this.f150150c, this.f150151d, Matrix.ScaleToFit.FILL);
                }
            } else {
                this.f150151d.set(this.f150148a);
                this.f150152e.reset();
                float f11 = 0.0f;
                if (this.f150156i * this.f150151d.height() > this.f150151d.width() * this.f150157j) {
                    width = this.f150151d.height() / this.f150157j;
                    f11 = (this.f150151d.width() - (this.f150156i * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = this.f150151d.width() / this.f150156i;
                    height = (this.f150151d.height() - (this.f150157j * width)) * 0.5f;
                }
                this.f150152e.setScale(width, width);
                this.f150152e.postTranslate((int) (f11 + 0.5f), (int) (height + 0.5f));
            }
        } else {
            this.f150151d.set(this.f150148a);
            this.f150152e.reset();
            this.f150152e.setTranslate((int) (((this.f150151d.width() - this.f150156i) * 0.5f) + 0.5f), (int) (((this.f150151d.height() - this.f150157j) * 0.5f) + 0.5f));
        }
        this.f150149b.set(this.f150151d);
        this.f150159l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m157433d(float f11) {
        this.f150158k = f11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f150159l) {
            Bitmap bitmap = this.f150153f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(this.f150152e);
            this.f150154g.setShader(bitmapShader);
            this.f150159l = false;
        }
        float f11 = this.f150158k;
        canvas.drawRoundRect(this.f150149b, f11, f11, this.f150154g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m157434e(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f150155h != scaleType) {
            this.f150155h = scaleType;
            m157432f();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f150157j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f150156i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f150148a.set(rect);
        m157432f();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f150154g.setDither(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f150154g.setFilterBitmap(z11);
        invalidateSelf();
    }
}
