package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.AbstractC1298f;
import p193h0.AbstractC19694b;

/* loaded from: classes2.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: A */
    private boolean f5334A;

    /* renamed from: B */
    private Drawable f5335B;

    /* renamed from: C */
    private Drawable f5336C;

    /* renamed from: D */
    private float f5337D;

    /* renamed from: E */
    private float f5338E;

    /* renamed from: F */
    private float f5339F;

    /* renamed from: G */
    private float f5340G;

    /* renamed from: r */
    private ImageFilterView.C1285c f5341r;

    /* renamed from: s */
    private float f5342s;

    /* renamed from: t */
    private float f5343t;

    /* renamed from: u */
    private float f5344u;

    /* renamed from: v */
    private Path f5345v;

    /* renamed from: w */
    ViewOutlineProvider f5346w;

    /* renamed from: x */
    RectF f5347x;

    /* renamed from: y */
    Drawable[] f5348y;

    /* renamed from: z */
    LayerDrawable f5349z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    /* loaded from: classes2.dex */
    public class C1281a extends ViewOutlineProvider {
        C1281a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f5343t) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    /* loaded from: classes2.dex */
    public class C1282b extends ViewOutlineProvider {
        C1282b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f5344u);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5341r = new ImageFilterView.C1285c();
        this.f5342s = 0.0f;
        this.f5343t = 0.0f;
        this.f5344u = Float.NaN;
        this.f5348y = new Drawable[2];
        this.f5334A = true;
        this.f5335B = null;
        this.f5336C = null;
        this.f5337D = Float.NaN;
        this.f5338E = Float.NaN;
        this.f5339F = Float.NaN;
        this.f5340G = Float.NaN;
        m6328c(context, attributeSet);
    }

    /* renamed from: c */
    private void m6328c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f5335B = obtainStyledAttributes.getDrawable(AbstractC1298f.ImageFilterView_altSrc);
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ImageFilterView_crossfade) {
                    this.f5342s = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == AbstractC1298f.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f5334A));
                } else if (index == AbstractC1298f.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f5337D));
                } else if (index == AbstractC1298f.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f5338E));
                } else if (index == AbstractC1298f.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f5340G));
                } else if (index == AbstractC1298f.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f5339F));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f5336C = drawable;
            if (this.f5335B != null && drawable != null) {
                Drawable[] drawableArr = this.f5348y;
                Drawable mutate = getDrawable().mutate();
                this.f5336C = mutate;
                drawableArr[0] = mutate;
                this.f5348y[1] = this.f5335B.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f5348y);
                this.f5349z = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f5342s * 255.0f));
                if (!this.f5334A) {
                    this.f5349z.getDrawable(0).setAlpha((int) ((1.0f - this.f5342s) * 255.0f));
                }
                super.setImageDrawable(this.f5349z);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f5336C = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f5348y;
                Drawable mutate2 = drawable2.mutate();
                this.f5336C = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    /* renamed from: d */
    private void m6329d() {
        float f11;
        float f12;
        float f13;
        float f14;
        if (Float.isNaN(this.f5337D) && Float.isNaN(this.f5338E) && Float.isNaN(this.f5339F) && Float.isNaN(this.f5340G)) {
            return;
        }
        float f15 = 0.0f;
        if (Float.isNaN(this.f5337D)) {
            f11 = 0.0f;
        } else {
            f11 = this.f5337D;
        }
        if (Float.isNaN(this.f5338E)) {
            f12 = 0.0f;
        } else {
            f12 = this.f5338E;
        }
        if (Float.isNaN(this.f5339F)) {
            f13 = 1.0f;
        } else {
            f13 = this.f5339F;
        }
        if (!Float.isNaN(this.f5340G)) {
            f15 = this.f5340G;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        if (intrinsicWidth * height < intrinsicHeight * width) {
            f14 = width / intrinsicWidth;
        } else {
            f14 = height / intrinsicHeight;
        }
        float f16 = f13 * f14;
        matrix.postScale(f16, f16);
        float f17 = intrinsicWidth * f16;
        float f18 = f16 * intrinsicHeight;
        matrix.postTranslate((((f11 * (width - f17)) + width) - f17) * 0.5f, (((f12 * (height - f18)) + height) - f18) * 0.5f);
        matrix.postRotate(f15, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: e */
    private void m6330e() {
        if (Float.isNaN(this.f5337D) && Float.isNaN(this.f5338E) && Float.isNaN(this.f5339F) && Float.isNaN(this.f5340G)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m6329d();
        }
    }

    private void setOverlay(boolean z11) {
        this.f5334A = z11;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f5341r.f5375f;
    }

    public float getCrossfade() {
        return this.f5342s;
    }

    public float getImagePanX() {
        return this.f5337D;
    }

    public float getImagePanY() {
        return this.f5338E;
    }

    public float getImageRotate() {
        return this.f5340G;
    }

    public float getImageZoom() {
        return this.f5339F;
    }

    public float getRound() {
        return this.f5344u;
    }

    public float getRoundPercent() {
        return this.f5343t;
    }

    public float getSaturation() {
        return this.f5341r.f5374e;
    }

    public float getWarmth() {
        return this.f5341r.f5376g;
    }

    @Override // android.view.View
    public void layout(int i11, int i12, int i13, int i14) {
        super.layout(i11, i12, i13, i14);
        m6329d();
    }

    public void setAltImageResource(int i11) {
        Drawable mutate = AbstractC19694b.m103336d(getContext(), i11).mutate();
        this.f5335B = mutate;
        Drawable[] drawableArr = this.f5348y;
        drawableArr[0] = this.f5336C;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f5348y);
        this.f5349z = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f5342s);
    }

    public void setBrightness(float f11) {
        ImageFilterView.C1285c c1285c = this.f5341r;
        c1285c.f5373d = f11;
        c1285c.m6339c(this);
    }

    public void setContrast(float f11) {
        ImageFilterView.C1285c c1285c = this.f5341r;
        c1285c.f5375f = f11;
        c1285c.m6339c(this);
    }

    public void setCrossfade(float f11) {
        this.f5342s = f11;
        if (this.f5348y != null) {
            if (!this.f5334A) {
                this.f5349z.getDrawable(0).setAlpha((int) ((1.0f - this.f5342s) * 255.0f));
            }
            this.f5349z.getDrawable(1).setAlpha((int) (this.f5342s * 255.0f));
            super.setImageDrawable(this.f5349z);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f5335B != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f5336C = mutate;
            Drawable[] drawableArr = this.f5348y;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f5335B;
            LayerDrawable layerDrawable = new LayerDrawable(this.f5348y);
            this.f5349z = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f5342s);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f11) {
        this.f5337D = f11;
        m6330e();
    }

    public void setImagePanY(float f11) {
        this.f5338E = f11;
        m6330e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i11) {
        if (this.f5335B != null) {
            Drawable mutate = AbstractC19694b.m103336d(getContext(), i11).mutate();
            this.f5336C = mutate;
            Drawable[] drawableArr = this.f5348y;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f5335B;
            LayerDrawable layerDrawable = new LayerDrawable(this.f5348y);
            this.f5349z = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f5342s);
            return;
        }
        super.setImageResource(i11);
    }

    public void setImageRotate(float f11) {
        this.f5340G = f11;
        m6330e();
    }

    public void setImageZoom(float f11) {
        this.f5339F = f11;
        m6330e();
    }

    public void setRound(float f11) {
        boolean z11;
        if (Float.isNaN(f11)) {
            this.f5344u = f11;
            float f12 = this.f5343t;
            this.f5343t = -1.0f;
            setRoundPercent(f12);
            return;
        }
        if (this.f5344u != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5344u = f11;
        if (f11 != 0.0f) {
            if (this.f5345v == null) {
                this.f5345v = new Path();
            }
            if (this.f5347x == null) {
                this.f5347x = new RectF();
            }
            if (this.f5346w == null) {
                C1282b c1282b = new C1282b();
                this.f5346w = c1282b;
                setOutlineProvider(c1282b);
            }
            setClipToOutline(true);
            this.f5347x.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f5345v.reset();
            Path path = this.f5345v;
            RectF rectF = this.f5347x;
            float f13 = this.f5344u;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f11) {
        boolean z11;
        if (this.f5343t != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5343t = f11;
        if (f11 != 0.0f) {
            if (this.f5345v == null) {
                this.f5345v = new Path();
            }
            if (this.f5347x == null) {
                this.f5347x = new RectF();
            }
            if (this.f5346w == null) {
                C1281a c1281a = new C1281a();
                this.f5346w = c1281a;
                setOutlineProvider(c1281a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f5343t) / 2.0f;
            this.f5347x.set(0.0f, 0.0f, width, height);
            this.f5345v.reset();
            this.f5345v.addRoundRect(this.f5347x, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f11) {
        ImageFilterView.C1285c c1285c = this.f5341r;
        c1285c.f5374e = f11;
        c1285c.m6339c(this);
    }

    public void setWarmth(float f11) {
        ImageFilterView.C1285c c1285c = this.f5341r;
        c1285c.f5376g = f11;
        c1285c.m6339c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5341r = new ImageFilterView.C1285c();
        this.f5342s = 0.0f;
        this.f5343t = 0.0f;
        this.f5344u = Float.NaN;
        this.f5348y = new Drawable[2];
        this.f5334A = true;
        this.f5335B = null;
        this.f5336C = null;
        this.f5337D = Float.NaN;
        this.f5338E = Float.NaN;
        this.f5339F = Float.NaN;
        this.f5340G = Float.NaN;
        m6328c(context, attributeSet);
    }
}
