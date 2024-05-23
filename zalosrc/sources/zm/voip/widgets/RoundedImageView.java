package zm.voip.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes7.dex */
public class RoundedImageView extends RecyclingImageView {

    /* renamed from: p */
    private float f150095p;

    /* renamed from: q */
    private int f150096q;

    /* renamed from: r */
    private Drawable f150097r;

    /* renamed from: s */
    private ImageView.ScaleType f150098s;

    /* renamed from: zm.voip.widgets.RoundedImageView$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C32500a {

        /* renamed from: a */
        static final /* synthetic */ int[] f150099a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f150099a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f150099a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f150099a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f150099a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f150099a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f150099a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f150099a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
    }

    /* renamed from: i */
    private Drawable m157394i() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i11 = this.f150096q;
        if (i11 != 0) {
            try {
                drawable = resources.getDrawable(i11);
            } catch (Exception unused) {
                this.f150096q = 0;
            }
        }
        return C32506a.m157431c(drawable);
    }

    /* renamed from: j */
    private void m157395j(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof C32506a) {
            C32506a c32506a = (C32506a) drawable;
            c32506a.m157434e(scaleType);
            c32506a.m157433d(this.f150095p);
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                m157395j(layerDrawable.getDrawable(i11), scaleType);
            }
        }
    }

    /* renamed from: k */
    private void m157396k() {
        m157395j(this.f150097r, this.f150098s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f150098s;
    }

    public void setCornerRadius(float f11) {
        this.f150095p = f11;
        m157396k();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f150096q = 0;
        this.f150097r = C32506a.m157430b(bitmap);
        m157396k();
        super.setImageDrawable(this.f150097r);
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f150096q = 0;
        this.f150097r = C32506a.m157431c(drawable);
        m157396k();
        super.setImageDrawable(this.f150097r);
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        if (this.f150096q != i11) {
            this.f150096q = i11;
            this.f150097r = m157394i();
            m157396k();
            super.setImageDrawable(this.f150097r);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f150098s != scaleType) {
            this.f150098s = scaleType;
            switch (C32500a.f150099a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m157396k();
            invalidate();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
