package com.zing.zalo.photoview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.photoview.PhotoView;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import th.AbstractC26689j;

/* loaded from: classes4.dex */
public class PhotoView extends RecyclingImageView {

    /* renamed from: p */
    private EnumC9042a f48403p;

    /* renamed from: q */
    private final ViewOnTouchListenerC9043a f48404q;

    /* renamed from: r */
    private ImageView.ScaleType f48405r;

    /* renamed from: com.zing.zalo.photoview.PhotoView$a */
    /* loaded from: classes4.dex */
    public enum EnumC9042a {
        NORMAL,
        SQUARE
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: l */
    private Bitmap m48332l(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: m */
    public static synchronized BitmapFactory.Options m48333m(int i11, int i12, int i13) {
        BitmapFactory.Options options;
        float f11;
        float f12;
        synchronized (PhotoView.class) {
            options = new BitmapFactory.Options();
            if (i11 > i12 || i12 <= i11) {
                f11 = i13;
                f12 = i11;
            } else {
                f11 = i13;
                f12 = i12;
            }
            float f13 = f11 / f12;
            options.outWidth = (int) ((i11 * f13) + 0.5f);
            options.outHeight = (int) ((i12 * f13) + 0.5f);
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m48334n() {
        ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f48404q;
        if (viewOnTouchListenerC9043a != null && viewOnTouchListenerC9043a.f48414C) {
            viewOnTouchListenerC9043a.m48376f();
        }
    }

    public Matrix getDisplayMatrix() {
        return this.f48404q.m48393o();
    }

    public RectF getDisplayRect() {
        return this.f48404q.m48394p();
    }

    @Deprecated
    public float getMaxScale() {
        return getMaximumScale();
    }

    public float getMaximumScale() {
        return this.f48404q.m48400v();
    }

    public float getMediumScale() {
        return this.f48404q.m48401w();
    }

    @Deprecated
    public float getMidScale() {
        return getMediumScale();
    }

    @Deprecated
    public float getMinScale() {
        return getMinimumScale();
    }

    public float getMinimumScale() {
        return this.f48404q.m48402x();
    }

    public ViewOnTouchListenerC9043a getPhotoViewAttacher() {
        return this.f48404q;
    }

    public float getScale() {
        return this.f48404q.m48403y();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f48404q.m48404z();
    }

    /* renamed from: j */
    public void m48335j() {
        post(new Runnable() { // from class: ox.b
            @Override // java.lang.Runnable
            public final void run() {
                PhotoView.this.m48334n();
            }
        });
    }

    /* renamed from: k */
    public boolean m48336k(String str, Rect rect, int i11) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap m48332l = m48332l(drawable);
            int width = m48332l.getWidth();
            int height = m48332l.getHeight();
            RectF displayRect = getDisplayRect();
            if (rect != null) {
                float f11 = displayRect.left;
                int i12 = rect.left;
                float f12 = displayRect.top;
                int i13 = rect.top;
                displayRect.set(f11 - i12, f12 - i13, displayRect.right - i12, displayRect.bottom - i13);
            }
            float width2 = displayRect.width() / width;
            float height2 = displayRect.height() / height;
            int abs = (int) (Math.abs(displayRect.left) / width2);
            int abs2 = (int) (Math.abs(displayRect.top) / height2);
            int width3 = getWidth();
            int height3 = getHeight();
            if (rect != null) {
                width3 = rect.width();
                height3 = rect.height();
            }
            int round = Math.round(width3 / width2);
            int round2 = Math.round(height3 / height2);
            File file = new File(str);
            if (i11 > 0 && (round > i11 || round2 > i11)) {
                try {
                    BitmapFactory.Options m48333m = m48333m(round, round2, i11);
                    round = m48333m.outWidth;
                    round2 = m48333m.outHeight;
                } catch (FileNotFoundException e11) {
                    e11.printStackTrace();
                } catch (IOException e12) {
                    e12.printStackTrace();
                    if (file.exists()) {
                        file.delete();
                    }
                    return false;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap createBitmap = Bitmap.createBitmap(m48332l, abs, abs2, round, round2);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, AbstractC26689j.m137103l(), fileOutputStream);
            fileOutputStream.close();
            createBitmap.recycle();
            if (!(drawable instanceof BitmapDrawable)) {
                m48332l.recycle();
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.ZAppCompatImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.f48404q.m48387l();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        EnumC9042a enumC9042a = this.f48403p;
        if (enumC9042a == EnumC9042a.NORMAL) {
            super.onMeasure(i11, i12);
        } else if (enumC9042a == EnumC9042a.SQUARE) {
            super.onMeasure(i11, i11);
        }
    }

    /* renamed from: p */
    public boolean m48337p(Matrix matrix) {
        return this.f48404q.m48356N(matrix);
    }

    /* renamed from: q */
    public void m48338q(float f11, float f12, float f13) {
        this.f48404q.m48385j0(f11, f12, f13);
    }

    public void setAllowDraggingImageView(boolean z11) {
        this.f48404q.m48352J(z11);
    }

    public void setAllowParentInterceptOnEdge(boolean z11) {
        this.f48404q.m48353K(z11);
    }

    public void setAllowScale(boolean z11) {
        this.f48404q.m48354L(z11);
    }

    public void setAllowScrollingAway(boolean z11) {
        this.f48404q.m48355M(z11);
    }

    public void setEnableZoomPhotoFitWidth(boolean z11) {
        ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f48404q;
        if (viewOnTouchListenerC9043a != null) {
            viewOnTouchListenerC9043a.m48357O(z11);
        }
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f48404q;
        if (viewOnTouchListenerC9043a != null) {
            viewOnTouchListenerC9043a.m48390m0();
        }
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
        ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f48404q;
        if (viewOnTouchListenerC9043a != null) {
            viewOnTouchListenerC9043a.m48390m0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f48404q;
        if (viewOnTouchListenerC9043a != null) {
            viewOnTouchListenerC9043a.m48390m0();
        }
    }

    public void setKeepMatrix(boolean z11) {
        ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f48404q;
        if (viewOnTouchListenerC9043a != null) {
            viewOnTouchListenerC9043a.m48360S(z11);
        }
    }

    @Deprecated
    public void setMaxScale(float f11) {
        setMaximumScale(f11);
    }

    public void setMaximumScale(float f11) {
        this.f48404q.m48361T(f11);
    }

    public void setMediumScale(float f11) {
        this.f48404q.m48362U(f11);
    }

    @Deprecated
    public void setMidScale(float f11) {
        setMediumScale(f11);
    }

    @Deprecated
    public void setMinScale(float f11) {
        setMinimumScale(f11);
    }

    public void setMinimumScale(float f11) {
        this.f48404q.m48363V(f11);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f48404q.m48364W(onLongClickListener);
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC9043a.f fVar) {
        this.f48404q.m48365X(fVar);
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC9043a.g gVar) {
        this.f48404q.m48366Y(gVar);
    }

    public void setOnViewTapListener(ViewOnTouchListenerC9043a.j jVar) {
        this.f48404q.m48372c0(jVar);
    }

    public void setPhotoViewRotation(float f11) {
        this.f48404q.m48374d0(f11);
    }

    public void setRotationBy(float f11) {
        this.f48404q.m48375e0(f11);
    }

    public void setRotationTo(float f11) {
        this.f48404q.m48377f0(f11);
    }

    public void setScale(float f11) {
        this.f48404q.m48379g0(f11);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f48404q;
        if (viewOnTouchListenerC9043a != null) {
            viewOnTouchListenerC9043a.m48386k0(scaleType);
        } else {
            this.f48405r = scaleType;
        }
    }

    public void setShapeType(EnumC9042a enumC9042a) {
        this.f48403p = enumC9042a;
    }

    public void setZoomable(boolean z11) {
        this.f48404q.m48388l0(z11);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f48403p = EnumC9042a.NORMAL;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        this.f48404q = new ViewOnTouchListenerC9043a(this);
        ImageView.ScaleType scaleType = this.f48405r;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f48405r = null;
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (Build.VERSION.SDK_INT < 29 || (context instanceof Activity)) {
            return;
        }
        setBackgroundColor(Color.argb(1, 0, 0, 0));
    }
}
