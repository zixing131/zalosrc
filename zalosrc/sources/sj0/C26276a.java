package sj0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;

/* renamed from: sj0.a */
/* loaded from: classes7.dex */
public class C26276a extends C26280e {

    /* renamed from: Q */
    Bitmap f124733Q;

    /* renamed from: R */
    ImageView.ScaleType f124734R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sj0.a$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124735a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f124735a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124735a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124735a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124735a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124735a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124735a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124735a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C26276a(Bitmap bitmap) {
        super(bitmap.getWidth(), bitmap.getHeight());
        this.f124734R = ImageView.ScaleType.FIT_CENTER;
        m135181x(bitmap);
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f124776H) {
            m135179v();
        }
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sj0.C26280e
    /* renamed from: g */
    public void mo135177g(Canvas canvas) {
        Bitmap bitmap = this.f124733Q;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (this.f124788s.getShader() == null) {
                canvas.drawBitmap(this.f124733Q, (Rect) null, this.f124786q, this.f124788s);
            } else {
                super.mo135177g(canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m135183z();
        this.f124776H = true;
        m135179v();
    }

    /* renamed from: u */
    public Bitmap m135178u() {
        return this.f124733Q;
    }

    /* renamed from: v */
    void m135179v() {
        if (this.f124776H) {
            Bitmap bitmap = this.f124733Q;
            if (bitmap != null && !bitmap.isRecycled()) {
                BitmapShader bitmapShader = new BitmapShader(this.f124733Q, this.f124771C, this.f124772D);
                Shader.TileMode tileMode = this.f124771C;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                if (tileMode == tileMode2 && this.f124772D == tileMode2) {
                    bitmapShader.setLocalMatrix(this.f124795z);
                }
                this.f124788s.setShader(bitmapShader);
            } else {
                this.f124788s.setShader(null);
            }
            this.f124776H = false;
        }
    }

    /* renamed from: w */
    public void m135180w() {
        Bitmap bitmap = this.f124733Q;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: x */
    public void m135181x(Bitmap bitmap) {
        this.f124733Q = bitmap;
        this.f124789t = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f124790u = height;
        this.f124787r.set(0.0f, 0.0f, this.f124789t, height);
        m135183z();
        this.f124776H = true;
        m135179v();
    }

    /* renamed from: y */
    public C26276a m135182y(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f124734R != scaleType) {
            this.f124734R = scaleType;
            m135183z();
            this.f124776H = true;
            m135179v();
        }
        return this;
    }

    /* renamed from: z */
    void m135183z() {
        float width;
        float height;
        float min;
        int i11 = a.f124735a[this.f124734R.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                this.f124791v.set(this.f124787r);
                                this.f124795z.setRectToRect(this.f124787r, this.f124785p, Matrix.ScaleToFit.CENTER);
                                this.f124795z.mapRect(this.f124791v);
                                RectF rectF = this.f124791v;
                                int i12 = this.f124777I;
                                rectF.inset(i12 / 2, i12 / 2);
                                this.f124795z.setRectToRect(this.f124787r, this.f124791v, Matrix.ScaleToFit.FILL);
                            } else {
                                this.f124791v.set(this.f124785p);
                                RectF rectF2 = this.f124791v;
                                int i13 = this.f124777I;
                                rectF2.inset(i13 / 2, i13 / 2);
                                this.f124795z.reset();
                                this.f124795z.setRectToRect(this.f124787r, this.f124791v, Matrix.ScaleToFit.FILL);
                            }
                        } else {
                            this.f124791v.set(this.f124787r);
                            this.f124795z.setRectToRect(this.f124787r, this.f124785p, Matrix.ScaleToFit.START);
                            this.f124795z.mapRect(this.f124791v);
                            RectF rectF3 = this.f124791v;
                            int i14 = this.f124777I;
                            rectF3.inset(i14 / 2, i14 / 2);
                            this.f124795z.setRectToRect(this.f124787r, this.f124791v, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        this.f124791v.set(this.f124787r);
                        this.f124795z.setRectToRect(this.f124787r, this.f124785p, Matrix.ScaleToFit.END);
                        this.f124795z.mapRect(this.f124791v);
                        RectF rectF4 = this.f124791v;
                        int i15 = this.f124777I;
                        rectF4.inset(i15 / 2, i15 / 2);
                        this.f124795z.setRectToRect(this.f124787r, this.f124791v, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    this.f124795z.reset();
                    if (this.f124789t <= this.f124785p.width() && this.f124790u <= this.f124785p.height()) {
                        min = 1.0f;
                    } else {
                        min = Math.min(this.f124785p.width() / this.f124789t, this.f124785p.height() / this.f124790u);
                    }
                    float width2 = (int) (((this.f124785p.width() - (this.f124789t * min)) * 0.5f) + 0.5f);
                    float height2 = (int) (((this.f124785p.height() - (this.f124790u * min)) * 0.5f) + 0.5f);
                    this.f124795z.setScale(min, min);
                    this.f124795z.postTranslate(width2, height2);
                    this.f124791v.set(this.f124787r);
                    this.f124795z.mapRect(this.f124791v);
                    RectF rectF5 = this.f124791v;
                    int i16 = this.f124777I;
                    rectF5.inset(i16 / 2, i16 / 2);
                    this.f124795z.setRectToRect(this.f124787r, this.f124791v, Matrix.ScaleToFit.FILL);
                }
            } else {
                this.f124791v.set(this.f124785p);
                RectF rectF6 = this.f124791v;
                int i17 = this.f124777I;
                rectF6.inset(i17 / 2, i17 / 2);
                this.f124795z.reset();
                float f11 = 0.0f;
                if (this.f124789t * this.f124791v.height() > this.f124791v.width() * this.f124790u) {
                    width = this.f124791v.height() / this.f124790u;
                    f11 = (this.f124791v.width() - (this.f124789t * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = this.f124791v.width() / this.f124789t;
                    height = (this.f124791v.height() - (this.f124790u * width)) * 0.5f;
                }
                this.f124795z.setScale(width, width);
                Matrix matrix = this.f124795z;
                int i18 = this.f124777I;
                matrix.postTranslate(((int) (f11 + 0.5f)) + (i18 / 2), ((int) (height + 0.5f)) + (i18 / 2));
            }
        } else {
            this.f124791v.set(this.f124785p);
            RectF rectF7 = this.f124791v;
            int i19 = this.f124777I;
            rectF7.inset(i19 / 2, i19 / 2);
            this.f124795z.reset();
            this.f124795z.setTranslate((int) (((this.f124791v.width() - this.f124789t) * 0.5f) + 0.5f), (int) (((this.f124791v.height() - this.f124790u) * 0.5f) + 0.5f));
        }
        this.f124786q.set(this.f124791v);
    }
}
