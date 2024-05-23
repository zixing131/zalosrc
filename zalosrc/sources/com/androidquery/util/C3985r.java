package com.androidquery.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.androidquery.util.r */
/* loaded from: classes2.dex */
public class C3985r extends BitmapDrawable {

    /* renamed from: a */
    private final float f15775a;

    /* renamed from: b */
    private final WeakReference f15776b;

    /* renamed from: c */
    private boolean f15777c;

    /* renamed from: d */
    private Matrix f15778d;

    /* renamed from: e */
    private int f15779e;

    /* renamed from: f */
    private final float f15780f;

    public C3985r(Resources resources, Bitmap bitmap, ImageView imageView, float f11, float f12) {
        super(resources, bitmap);
        this.f15776b = new WeakReference(imageView);
        this.f15775a = f11;
        this.f15780f = f12;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(new Matrix());
        m18872a(imageView, bitmap, false);
    }

    /* renamed from: a */
    private void m18872a(ImageView imageView, Bitmap bitmap, boolean z11) {
        int m18875d = m18875d(imageView);
        if (m18875d <= 0) {
            return;
        }
        int m18877f = m18877f(bitmap.getWidth(), bitmap.getHeight(), m18875d) + imageView.getPaddingTop() + imageView.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (m18877f != layoutParams.height) {
            layoutParams.height = m18877f;
            imageView.setLayoutParams(layoutParams);
        }
        if (z11) {
            this.f15777c = true;
        }
    }

    /* renamed from: b */
    private void m18873b(Canvas canvas, ImageView imageView, Bitmap bitmap) {
        Matrix m18874c = m18874c(imageView, bitmap);
        if (m18874c != null) {
            int paddingTop = imageView.getPaddingTop() + imageView.getPaddingBottom();
            int paddingLeft = imageView.getPaddingLeft() + imageView.getPaddingRight();
            if (paddingTop > 0 || paddingLeft > 0) {
                canvas.clipRect(0, 0, imageView.getWidth() - paddingLeft, imageView.getHeight() - paddingTop);
            }
            canvas.drawBitmap(bitmap, m18874c, getPaint());
        }
        if (!this.f15777c) {
            m18872a(imageView, bitmap, true);
        }
    }

    /* renamed from: c */
    private Matrix m18874c(ImageView imageView, Bitmap bitmap) {
        float f11;
        float f12;
        int width = bitmap.getWidth();
        Matrix matrix = this.f15778d;
        if (matrix != null && width == this.f15779e) {
            return matrix;
        }
        int height = bitmap.getHeight();
        int m18875d = m18875d(imageView);
        int m18877f = m18877f(width, height, m18875d);
        if (width > 0 && height > 0 && m18875d > 0 && m18877f > 0) {
            if (this.f15778d == null || width != this.f15779e) {
                this.f15778d = new Matrix();
                float f13 = 0.0f;
                if (width * m18877f >= m18875d * height) {
                    f11 = m18877f / height;
                    f13 = (m18875d - (width * f11)) * 0.5f;
                    f12 = 0.0f;
                } else {
                    float f14 = m18875d / width;
                    float m18876e = (m18877f - (height * f14)) * m18876e(width, height);
                    f11 = f14;
                    f12 = m18876e;
                }
                this.f15778d.setScale(f11, f11);
                this.f15778d.postTranslate(f13, f12);
                this.f15779e = width;
            }
            return this.f15778d;
        }
        return null;
    }

    /* renamed from: d */
    private int m18875d(ImageView imageView) {
        int i11;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
        } else {
            i11 = 0;
        }
        if (i11 <= 0) {
            i11 = imageView.getWidth();
        }
        if (i11 > 0) {
            return (i11 - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        }
        return i11;
    }

    /* renamed from: e */
    private float m18876e(int i11, int i12) {
        float f11 = this.f15780f;
        if (f11 != Float.MAX_VALUE) {
            return (1.0f - f11) / 2.0f;
        }
        return ((1.5f - Math.max(1.0f, Math.min(1.5f, i12 / i11))) / 2.0f) + 0.25f;
    }

    /* renamed from: f */
    private int m18877f(int i11, int i12, int i13) {
        float f11 = this.f15775a;
        if (f11 == Float.MAX_VALUE) {
            f11 = i12 / i11;
        }
        return (int) (i13 * f11);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ImageView imageView;
        WeakReference weakReference = this.f15776b;
        if (weakReference != null) {
            imageView = (ImageView) weakReference.get();
        } else {
            imageView = null;
        }
        if (this.f15775a != 0.0f && imageView != null) {
            m18873b(canvas, imageView, getBitmap());
        } else {
            super.draw(canvas);
        }
    }
}
