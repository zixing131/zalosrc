package com.zing.zalo.shortvideo.p072ui.widget.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.crop.ZoomableImageView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class CropView extends FrameLayout {

    /* renamed from: p */
    private final RectF f54231p;

    /* renamed from: q */
    private int f54232q;

    /* renamed from: r */
    private int f54233r;

    /* renamed from: s */
    private int f54234s;

    /* renamed from: t */
    private int f54235t;

    /* renamed from: u */
    private int f54236u;

    /* renamed from: v */
    private Bitmap f54237v;

    /* renamed from: w */
    private ZoomableImageView f54238w;

    /* renamed from: x */
    private OverlayView f54239x;

    /* loaded from: classes5.dex */
    public static final class SavedState extends View.BaseSavedState {
        public static final C10724a CREATOR = new C10724a(null);

        /* renamed from: p */
        private int f54240p;

        /* renamed from: q */
        private int f54241q;

        /* renamed from: r */
        private int f54242r;

        /* renamed from: s */
        private int f54243s;

        /* renamed from: t */
        private int f54244t;

        /* renamed from: u */
        private final Parcelable f54245u;

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.CropView$SavedState$a */
        /* loaded from: classes5.dex */
        public static final class C10724a implements Parcelable.Creator {
            private C10724a() {
            }

            public /* synthetic */ C10724a(AbstractC19060k abstractC19060k) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, int i11, int i12, int i13, int i14, int i15, Parcelable parcelable2) {
            super(parcelable);
            AbstractC19074t.m100208f(parcelable, "superState");
            AbstractC19074t.m100208f(parcelable2, "imageViewState");
            this.f54240p = i11;
            this.f54241q = i12;
            this.f54242r = i13;
            this.f54243s = i14;
            this.f54244t = i15;
            this.f54245u = parcelable2;
        }

        /* renamed from: a */
        public final int m55832a() {
            return this.f54241q;
        }

        /* renamed from: b */
        public final int m55833b() {
            return this.f54242r;
        }

        /* renamed from: c */
        public final Parcelable m55834c() {
            return this.f54245u;
        }

        /* renamed from: d */
        public final int m55835d() {
            return this.f54240p;
        }

        /* renamed from: e */
        public final int m55836e() {
            return this.f54243s;
        }

        /* renamed from: f */
        public final int m55837f() {
            return this.f54244t;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f54240p);
            parcel.writeInt(this.f54241q);
            parcel.writeInt(this.f54242r);
            parcel.writeInt(this.f54243s);
            parcel.writeInt(this.f54244t);
            parcel.writeParcelable(this.f54245u, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel) {
            super(parcel);
            AbstractC19074t.m100208f(parcel, "source");
            this.f54240p = parcel.readInt();
            this.f54241q = parcel.readInt();
            this.f54242r = parcel.readInt();
            this.f54243s = parcel.readInt();
            this.f54244t = parcel.readInt();
            this.f54245u = parcel.readParcelable(SavedState.class.getClassLoader());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.CropView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10725a {
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.CropView$b */
    /* loaded from: classes5.dex */
    public static final class C10726b implements ZoomableImageView.InterfaceC10735e {
        C10726b() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.crop.ZoomableImageView.InterfaceC10735e
        /* renamed from: a */
        public void mo55840a() {
            CropView.this.getCropListener();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f54231p = new RectF();
        this.f54233r = 1;
        this.f54234s = 1;
        m55829e(attributeSet);
        m55828d(context);
    }

    /* renamed from: c */
    private final RectF m55827c(RectF rectF, int i11, int i12, int i13, int i14, int i15) {
        float f11;
        float f12;
        float f13 = i11;
        float f14 = f13 * 0.5f;
        float f15 = i12;
        float f16 = 0.5f * f15;
        float f17 = i13 * 2.0f;
        float f18 = f13 - f17;
        float f19 = f15 - f17;
        if (f18 < f19) {
            f12 = (i15 * f18) / i14;
            f11 = f18;
        } else {
            if (f18 > f19) {
                f11 = (i14 * f19) / i15;
            } else {
                f11 = f18;
            }
            f12 = f19;
        }
        float f21 = (f18 * f12) / f11;
        if (f21 > f19) {
            f18 = (f11 * f19) / f12;
        } else {
            f19 = f21;
        }
        float f22 = 2;
        float f23 = f18 / f22;
        rectF.left = f14 - f23;
        float f24 = f19 / f22;
        rectF.top = f16 - f24;
        rectF.right = f14 + f23;
        rectF.bottom = f16 + f24;
        return rectF;
    }

    /* renamed from: d */
    private final void m55828d(Context context) {
        ZoomableImageView zoomableImageView = new ZoomableImageView(context);
        this.f54238w = zoomableImageView;
        zoomableImageView.setImageMoveListener(new C10726b());
        ZoomableImageView zoomableImageView2 = this.f54238w;
        OverlayView overlayView = null;
        if (zoomableImageView2 == null) {
            AbstractC19074t.m100223u("imageView");
            zoomableImageView2 = null;
        }
        addView(zoomableImageView2);
        OverlayView overlayView2 = new OverlayView(context, this.f54236u);
        this.f54239x = overlayView2;
        overlayView2.setOverlayColor(this.f54235t);
        OverlayView overlayView3 = this.f54239x;
        if (overlayView3 == null) {
            AbstractC19074t.m100223u("overlayView");
        } else {
            overlayView = overlayView3;
        }
        addView(overlayView);
    }

    /* renamed from: e */
    private final void m55829e(AttributeSet attributeSet) {
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AbstractC27414i.ZchCropView);
            this.f54232q = typedArray.getDimensionPixelOffset(AbstractC27414i.ZchCropView_zchCropOffset, this.f54232q);
            this.f54233r = typedArray.getInteger(AbstractC27414i.ZchCropView_zchCropAspectX, this.f54233r);
            this.f54234s = typedArray.getInteger(AbstractC27414i.ZchCropView_zchCropAspectY, this.f54234s);
            this.f54236u = typedArray.getInteger(AbstractC27414i.ZchCropView_zchCropShape, this.f54236u);
            this.f54235t = typedArray.getColor(AbstractC27414i.ZchCropView_zchCropOverlay, this.f54235t);
            typedArray.recycle();
        } catch (Throwable th2) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th2;
        }
    }

    private final RectF getCropRect() {
        RectF rectF = new RectF();
        if (this.f54237v == null) {
            return rectF;
        }
        ZoomableImageView zoomableImageView = this.f54238w;
        if (zoomableImageView == null) {
            AbstractC19074t.m100223u("imageView");
            zoomableImageView = null;
        }
        RectF imageBounds = zoomableImageView.getImageBounds();
        float width = imageBounds.width() / r1.getWidth();
        rectF.left = (-imageBounds.left) / width;
        rectF.top = (-imageBounds.top) / width;
        rectF.right = ((-imageBounds.left) + this.f54231p.width()) / width;
        rectF.bottom = ((-imageBounds.top) + this.f54231p.height()) / width;
        return rectF;
    }

    /* renamed from: a */
    public final void m55830a(int i11, int i12) {
        this.f54233r = i11;
        this.f54234s = i12;
        ZoomableImageView zoomableImageView = this.f54238w;
        ZoomableImageView zoomableImageView2 = null;
        if (zoomableImageView == null) {
            AbstractC19074t.m100223u("imageView");
            zoomableImageView = null;
        }
        zoomableImageView.requestLayout();
        ZoomableImageView zoomableImageView3 = this.f54238w;
        if (zoomableImageView3 == null) {
            AbstractC19074t.m100223u("imageView");
        } else {
            zoomableImageView2 = zoomableImageView3;
        }
        zoomableImageView2.m55887G();
        invalidate();
    }

    /* renamed from: b */
    public final void m55831b(int i11) {
        this.f54235t = i11;
        OverlayView overlayView = this.f54239x;
        if (overlayView == null) {
            AbstractC19074t.m100223u("overlayView");
            overlayView = null;
        }
        overlayView.setOverlayColor(this.f54235t);
        invalidate();
    }

    public final InterfaceC10725a getCropListener() {
        return null;
    }

    public final Bitmap getCroppedBitmap() {
        int width;
        int height;
        Bitmap bitmap = this.f54237v;
        if (bitmap != null) {
            RectF cropRect = getCropRect();
            int i11 = (int) cropRect.left;
            int i12 = (int) cropRect.top;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            int width2 = ((int) cropRect.width()) + i11;
            Bitmap bitmap2 = this.f54237v;
            AbstractC19074t.m100205c(bitmap2);
            if (width2 <= bitmap2.getWidth()) {
                width = (int) cropRect.width();
            } else {
                Bitmap bitmap3 = this.f54237v;
                AbstractC19074t.m100205c(bitmap3);
                width = bitmap3.getWidth() - i11;
            }
            int height2 = ((int) cropRect.height()) + i12;
            Bitmap bitmap4 = this.f54237v;
            AbstractC19074t.m100205c(bitmap4);
            if (height2 <= bitmap4.getHeight()) {
                height = (int) cropRect.height();
            } else {
                Bitmap bitmap5 = this.f54237v;
                AbstractC19074t.m100205c(bitmap5);
                height = bitmap5.getHeight() - i12;
            }
            Bitmap bitmap6 = this.f54237v;
            AbstractC19074t.m100205c(bitmap6);
            return Bitmap.createBitmap(bitmap6, i11, i12, width, height);
        }
        return bitmap;
    }

    public final Transformation getTransformation() {
        Transformation transformation = new Transformation(null, null, 3, null);
        if (this.f54237v == null) {
            return transformation;
        }
        transformation.m55851b(new SizeF(r1.getWidth(), r1.getHeight()));
        transformation.m55850a(getCropRect());
        return transformation;
    }

    @Override // android.view.View
    public void invalidate() {
        ZoomableImageView zoomableImageView = this.f54238w;
        OverlayView overlayView = null;
        if (zoomableImageView == null) {
            AbstractC19074t.m100223u("imageView");
            zoomableImageView = null;
        }
        zoomableImageView.invalidate();
        OverlayView overlayView2 = this.f54239x;
        if (overlayView2 == null) {
            AbstractC19074t.m100223u("overlayView");
        } else {
            overlayView = overlayView2;
        }
        overlayView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        m55827c(this.f54231p, View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12), this.f54232q, this.f54233r, this.f54234s);
        ZoomableImageView zoomableImageView = this.f54238w;
        OverlayView overlayView = null;
        if (zoomableImageView == null) {
            AbstractC19074t.m100223u("imageView");
            zoomableImageView = null;
        }
        zoomableImageView.setViewport(this.f54231p);
        OverlayView overlayView2 = this.f54239x;
        if (overlayView2 == null) {
            AbstractC19074t.m100223u("overlayView");
        } else {
            overlayView = overlayView2;
        }
        overlayView.setViewport(this.f54231p);
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        AbstractC19074t.m100208f(parcelable, "state");
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f54232q = savedState.m55835d();
            this.f54233r = savedState.m55832a();
            this.f54234s = savedState.m55833b();
            this.f54235t = savedState.m55836e();
            this.f54236u = savedState.m55837f();
            OverlayView overlayView = null;
            if (savedState.m55834c() != null) {
                ZoomableImageView zoomableImageView = this.f54238w;
                if (zoomableImageView == null) {
                    AbstractC19074t.m100223u("imageView");
                    zoomableImageView = null;
                }
                zoomableImageView.onRestoreInstanceState(savedState.m55834c());
            }
            OverlayView overlayView2 = this.f54239x;
            if (overlayView2 == null) {
                AbstractC19074t.m100223u("overlayView");
            } else {
                overlayView = overlayView2;
            }
            overlayView.setOverlayColor(this.f54235t);
            overlayView.setOverlayShape(this.f54236u);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            int i11 = this.f54232q;
            int i12 = this.f54233r;
            int i13 = this.f54234s;
            int i14 = this.f54235t;
            int i15 = this.f54236u;
            ZoomableImageView zoomableImageView = this.f54238w;
            if (zoomableImageView == null) {
                AbstractC19074t.m100223u("imageView");
                zoomableImageView = null;
            }
            return new SavedState(onSaveInstanceState, i11, i12, i13, i14, i15, zoomableImageView.onSaveInstanceState());
        }
        return onSaveInstanceState;
    }

    public final void setBitmap(Bitmap bitmap) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        this.f54237v = bitmap;
        ZoomableImageView zoomableImageView = this.f54238w;
        if (zoomableImageView == null) {
            AbstractC19074t.m100223u("imageView");
            zoomableImageView = null;
        }
        zoomableImageView.setImageBitmap(bitmap);
    }

    public final void setCropListener(InterfaceC10725a interfaceC10725a) {
    }

    public final void setZoom(float f11) {
        ZoomableImageView zoomableImageView = this.f54238w;
        if (zoomableImageView == null) {
            AbstractC19074t.m100223u("imageView");
            zoomableImageView = null;
        }
        ZoomableImageView.m55862L(zoomableImageView, f11, 0.0f, 0.0f, null, 14, null);
    }
}
