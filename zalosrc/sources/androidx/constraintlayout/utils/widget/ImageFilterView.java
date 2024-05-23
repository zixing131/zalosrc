package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.AbstractC1298f;
import p193h0.AbstractC19694b;

/* loaded from: classes2.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: A */
    LayerDrawable f5352A;

    /* renamed from: B */
    float f5353B;

    /* renamed from: C */
    float f5354C;

    /* renamed from: D */
    float f5355D;

    /* renamed from: E */
    float f5356E;

    /* renamed from: p */
    private C1285c f5357p;

    /* renamed from: q */
    private boolean f5358q;

    /* renamed from: r */
    private Drawable f5359r;

    /* renamed from: s */
    private Drawable f5360s;

    /* renamed from: t */
    private float f5361t;

    /* renamed from: u */
    private float f5362u;

    /* renamed from: v */
    private float f5363v;

    /* renamed from: w */
    private Path f5364w;

    /* renamed from: x */
    ViewOutlineProvider f5365x;

    /* renamed from: y */
    RectF f5366y;

    /* renamed from: z */
    Drawable[] f5367z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    /* loaded from: classes2.dex */
    public class C1283a extends ViewOutlineProvider {
        C1283a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f5362u) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    /* loaded from: classes2.dex */
    public class C1284b extends ViewOutlineProvider {
        C1284b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f5363v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    /* loaded from: classes2.dex */
    public static class C1285c {

        /* renamed from: a */
        float[] f5370a = new float[20];

        /* renamed from: b */
        ColorMatrix f5371b = new ColorMatrix();

        /* renamed from: c */
        ColorMatrix f5372c = new ColorMatrix();

        /* renamed from: d */
        float f5373d = 1.0f;

        /* renamed from: e */
        float f5374e = 1.0f;

        /* renamed from: f */
        float f5375f = 1.0f;

        /* renamed from: g */
        float f5376g = 1.0f;

        /* renamed from: a */
        private void m6336a(float f11) {
            float[] fArr = this.f5370a;
            fArr[0] = f11;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f11;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f11;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        private void m6337b(float f11) {
            float f12 = 1.0f - f11;
            float f13 = 0.2999f * f12;
            float f14 = 0.587f * f12;
            float f15 = f12 * 0.114f;
            float[] fArr = this.f5370a;
            fArr[0] = f13 + f11;
            fArr[1] = f14;
            fArr[2] = f15;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f13;
            fArr[6] = f14 + f11;
            fArr[7] = f15;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f13;
            fArr[11] = f14;
            fArr[12] = f15 + f11;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: d */
        private void m6338d(float f11) {
            float log;
            float f12;
            float f13;
            if (f11 <= 0.0f) {
                f11 = 0.01f;
            }
            float f14 = (5000.0f / f11) / 100.0f;
            if (f14 > 66.0f) {
                double d11 = f14 - 60.0f;
                f12 = ((float) Math.pow(d11, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d11, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f14)) * 99.4708f) - 161.11957f;
                f12 = 255.0f;
            }
            if (f14 < 66.0f) {
                if (f14 > 19.0f) {
                    f13 = (((float) Math.log(f14 - 10.0f)) * 138.51773f) - 305.0448f;
                } else {
                    f13 = 0.0f;
                }
            } else {
                f13 = 255.0f;
            }
            float min = Math.min(255.0f, Math.max(f12, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f13, 0.0f));
            float log2 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float log3 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log2, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log3, 0.0f));
            float[] fArr = this.f5370a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m6339c(ImageView imageView) {
            boolean z11;
            this.f5371b.reset();
            float f11 = this.f5374e;
            boolean z12 = true;
            if (f11 != 1.0f) {
                m6337b(f11);
                this.f5371b.set(this.f5370a);
                z11 = true;
            } else {
                z11 = false;
            }
            float f12 = this.f5375f;
            if (f12 != 1.0f) {
                this.f5372c.setScale(f12, f12, f12, 1.0f);
                this.f5371b.postConcat(this.f5372c);
                z11 = true;
            }
            float f13 = this.f5376g;
            if (f13 != 1.0f) {
                m6338d(f13);
                this.f5372c.set(this.f5370a);
                this.f5371b.postConcat(this.f5372c);
            } else {
                z12 = z11;
            }
            float f14 = this.f5373d;
            if (f14 != 1.0f) {
                m6336a(f14);
                this.f5372c.set(this.f5370a);
                this.f5371b.postConcat(this.f5372c);
            } else if (!z12) {
                imageView.clearColorFilter();
                return;
            }
            imageView.setColorFilter(new ColorMatrixColorFilter(this.f5371b));
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5357p = new C1285c();
        this.f5358q = true;
        this.f5359r = null;
        this.f5360s = null;
        this.f5361t = 0.0f;
        this.f5362u = 0.0f;
        this.f5363v = Float.NaN;
        this.f5367z = new Drawable[2];
        this.f5353B = Float.NaN;
        this.f5354C = Float.NaN;
        this.f5355D = Float.NaN;
        this.f5356E = Float.NaN;
        m6333h(context, attributeSet);
    }

    /* renamed from: h */
    private void m6333h(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f5359r = obtainStyledAttributes.getDrawable(AbstractC1298f.ImageFilterView_altSrc);
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ImageFilterView_crossfade) {
                    this.f5361t = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == AbstractC1298f.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f5358q));
                } else if (index == AbstractC1298f.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f5353B));
                } else if (index == AbstractC1298f.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f5354C));
                } else if (index == AbstractC1298f.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f5356E));
                } else if (index == AbstractC1298f.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f5355D));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f5360s = drawable;
            if (this.f5359r != null && drawable != null) {
                Drawable[] drawableArr = this.f5367z;
                Drawable mutate = getDrawable().mutate();
                this.f5360s = mutate;
                drawableArr[0] = mutate;
                this.f5367z[1] = this.f5359r.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f5367z);
                this.f5352A = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f5361t * 255.0f));
                if (!this.f5358q) {
                    this.f5352A.getDrawable(0).setAlpha((int) ((1.0f - this.f5361t) * 255.0f));
                }
                super.setImageDrawable(this.f5352A);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f5360s = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f5367z;
                Drawable mutate2 = drawable2.mutate();
                this.f5360s = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    /* renamed from: i */
    private void m6334i() {
        float f11;
        float f12;
        float f13;
        float f14;
        if (Float.isNaN(this.f5353B) && Float.isNaN(this.f5354C) && Float.isNaN(this.f5355D) && Float.isNaN(this.f5356E)) {
            return;
        }
        float f15 = 0.0f;
        if (Float.isNaN(this.f5353B)) {
            f11 = 0.0f;
        } else {
            f11 = this.f5353B;
        }
        if (Float.isNaN(this.f5354C)) {
            f12 = 0.0f;
        } else {
            f12 = this.f5354C;
        }
        if (Float.isNaN(this.f5355D)) {
            f13 = 1.0f;
        } else {
            f13 = this.f5355D;
        }
        if (!Float.isNaN(this.f5356E)) {
            f15 = this.f5356E;
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

    /* renamed from: j */
    private void m6335j() {
        if (Float.isNaN(this.f5353B) && Float.isNaN(this.f5354C) && Float.isNaN(this.f5355D) && Float.isNaN(this.f5356E)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m6334i();
        }
    }

    private void setOverlay(boolean z11) {
        this.f5358q = z11;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f5357p.f5373d;
    }

    public float getContrast() {
        return this.f5357p.f5375f;
    }

    public float getCrossfade() {
        return this.f5361t;
    }

    public float getImagePanX() {
        return this.f5353B;
    }

    public float getImagePanY() {
        return this.f5354C;
    }

    public float getImageRotate() {
        return this.f5356E;
    }

    public float getImageZoom() {
        return this.f5355D;
    }

    public float getRound() {
        return this.f5363v;
    }

    public float getRoundPercent() {
        return this.f5362u;
    }

    public float getSaturation() {
        return this.f5357p.f5374e;
    }

    public float getWarmth() {
        return this.f5357p.f5376g;
    }

    @Override // android.view.View
    public void layout(int i11, int i12, int i13, int i14) {
        super.layout(i11, i12, i13, i14);
        m6334i();
    }

    public void setAltImageResource(int i11) {
        Drawable mutate = AbstractC19694b.m103336d(getContext(), i11).mutate();
        this.f5359r = mutate;
        Drawable[] drawableArr = this.f5367z;
        drawableArr[0] = this.f5360s;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f5367z);
        this.f5352A = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f5361t);
    }

    public void setBrightness(float f11) {
        C1285c c1285c = this.f5357p;
        c1285c.f5373d = f11;
        c1285c.m6339c(this);
    }

    public void setContrast(float f11) {
        C1285c c1285c = this.f5357p;
        c1285c.f5375f = f11;
        c1285c.m6339c(this);
    }

    public void setCrossfade(float f11) {
        this.f5361t = f11;
        if (this.f5367z != null) {
            if (!this.f5358q) {
                this.f5352A.getDrawable(0).setAlpha((int) ((1.0f - this.f5361t) * 255.0f));
            }
            this.f5352A.getDrawable(1).setAlpha((int) (this.f5361t * 255.0f));
            super.setImageDrawable(this.f5352A);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f5359r != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f5360s = mutate;
            Drawable[] drawableArr = this.f5367z;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f5359r;
            LayerDrawable layerDrawable = new LayerDrawable(this.f5367z);
            this.f5352A = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f5361t);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f11) {
        this.f5353B = f11;
        m6335j();
    }

    public void setImagePanY(float f11) {
        this.f5354C = f11;
        m6335j();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        if (this.f5359r != null) {
            Drawable mutate = AbstractC19694b.m103336d(getContext(), i11).mutate();
            this.f5360s = mutate;
            Drawable[] drawableArr = this.f5367z;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f5359r;
            LayerDrawable layerDrawable = new LayerDrawable(this.f5367z);
            this.f5352A = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f5361t);
            return;
        }
        super.setImageResource(i11);
    }

    public void setImageRotate(float f11) {
        this.f5356E = f11;
        m6335j();
    }

    public void setImageZoom(float f11) {
        this.f5355D = f11;
        m6335j();
    }

    public void setRound(float f11) {
        boolean z11;
        if (Float.isNaN(f11)) {
            this.f5363v = f11;
            float f12 = this.f5362u;
            this.f5362u = -1.0f;
            setRoundPercent(f12);
            return;
        }
        if (this.f5363v != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5363v = f11;
        if (f11 != 0.0f) {
            if (this.f5364w == null) {
                this.f5364w = new Path();
            }
            if (this.f5366y == null) {
                this.f5366y = new RectF();
            }
            if (this.f5365x == null) {
                C1284b c1284b = new C1284b();
                this.f5365x = c1284b;
                setOutlineProvider(c1284b);
            }
            setClipToOutline(true);
            this.f5366y.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f5364w.reset();
            Path path = this.f5364w;
            RectF rectF = this.f5366y;
            float f13 = this.f5363v;
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
        if (this.f5362u != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5362u = f11;
        if (f11 != 0.0f) {
            if (this.f5364w == null) {
                this.f5364w = new Path();
            }
            if (this.f5366y == null) {
                this.f5366y = new RectF();
            }
            if (this.f5365x == null) {
                C1283a c1283a = new C1283a();
                this.f5365x = c1283a;
                setOutlineProvider(c1283a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f5362u) / 2.0f;
            this.f5366y.set(0.0f, 0.0f, width, height);
            this.f5364w.reset();
            this.f5364w.addRoundRect(this.f5366y, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f11) {
        C1285c c1285c = this.f5357p;
        c1285c.f5374e = f11;
        c1285c.m6339c(this);
    }

    public void setWarmth(float f11) {
        C1285c c1285c = this.f5357p;
        c1285c.f5376g = f11;
        c1285c.m6339c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5357p = new C1285c();
        this.f5358q = true;
        this.f5359r = null;
        this.f5360s = null;
        this.f5361t = 0.0f;
        this.f5362u = 0.0f;
        this.f5363v = Float.NaN;
        this.f5367z = new Drawable[2];
        this.f5353B = Float.NaN;
        this.f5354C = Float.NaN;
        this.f5355D = Float.NaN;
        this.f5356E = Float.NaN;
        m6333h(context, attributeSet);
    }
}
