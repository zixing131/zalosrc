package i40;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: i40.d */
/* loaded from: classes5.dex */
public class C20274d extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: p */
    private ImageView f100173p;

    /* renamed from: q */
    private ImageView.ScaleType f100174q;

    /* renamed from: r */
    private ImageView.ScaleType f100175r;

    /* renamed from: u */
    public int f100178u;

    /* renamed from: v */
    public int f100179v;

    /* renamed from: s */
    private final float[] f100176s = new float[4];

    /* renamed from: t */
    private final float[] f100177t = new float[4];

    /* renamed from: w */
    public boolean f100180w = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i40.d$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f100181a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f100181a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100181a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100181a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100181a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100181a[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100181a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f100181a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private C20274d() {
        addUpdateListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:            if ((r4 * r1) > (r0 * r2)) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:            r6 = r1 / r2;        r9 = (r0 - (r4 * r6)) * 0.5f;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:            r6 = r0 / r4;        r9 = (r1 - (r2 * r6)) * 0.5f;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:            if ((r4 * r1) > (r0 * r2)) goto L31;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0038. Please report as an issue. */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m105848a(ImageView.ScaleType scaleType, float[] fArr) {
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        if (fArr != null && fArr.length >= 4) {
            int m105850c = m105850c();
            int m105849b = m105849b();
            Drawable drawable = this.f100173p.getDrawable();
            if (drawable != null) {
                i11 = drawable.getIntrinsicWidth();
            } else {
                i11 = 0;
            }
            if (drawable != null) {
                i12 = drawable.getIntrinsicHeight();
            } else {
                i12 = 0;
            }
            if (i11 == 0 || i12 == 0) {
                i11 = m105850c;
                i12 = m105849b;
            }
            float f15 = 0.0f;
            float f16 = 1.0f;
            switch (a.f100181a[scaleType.ordinal()]) {
                case 1:
                    f16 = m105850c / i11;
                    f11 = m105849b / i12;
                    f14 = 0.0f;
                    break;
                case 2:
                    if (i11 * m105849b > m105850c * i12) {
                        f12 = m105850c;
                        f13 = i11;
                    } else {
                        f12 = m105849b;
                        f13 = i12;
                    }
                    f16 = f12 / f13;
                    f11 = f16;
                    f14 = 0.0f;
                    break;
                case 3:
                    break;
                case 4:
                    if (i11 * m105849b > m105850c * i12) {
                        f16 = m105850c / i11;
                        f14 = m105849b - (i12 * f16);
                        f11 = f16;
                        break;
                    } else {
                        f16 = m105849b / i12;
                        float f17 = m105850c - (i11 * f16);
                        f15 = f17;
                        f11 = f16;
                        f14 = 0.0f;
                        break;
                    }
                case 5:
                    f15 = Math.round((m105850c - i11) * 0.5f);
                    f14 = Math.round((m105849b - i12) * 0.5f);
                    f11 = 1.0f;
                    break;
                case 6:
                    break;
                case 7:
                    if (i11 > m105850c || i12 > m105849b) {
                        f16 = Math.min(m105850c / i11, m105849b / i12);
                    }
                    f15 = Math.round((m105850c - (i11 * f16)) * 0.5f);
                    f14 = Math.round((m105849b - (i12 * f16)) * 0.5f);
                    f11 = f16;
                    break;
                default:
                    f14 = 0.0f;
                    f11 = 1.0f;
                    break;
            }
            fArr[0] = f16;
            fArr[1] = f11;
            fArr[2] = f15;
            fArr[3] = f14;
            return;
        }
        throw new IllegalArgumentException("Value array is null or has insufficient length, required 4");
    }

    /* renamed from: b */
    private int m105849b() {
        int i11;
        if (this.f100180w) {
            return this.f100179v;
        }
        if (this.f100173p.getHeight() > 0) {
            i11 = this.f100173p.getHeight();
        } else {
            i11 = this.f100179v;
        }
        return (i11 - this.f100173p.getPaddingTop()) - this.f100173p.getPaddingBottom();
    }

    /* renamed from: c */
    private int m105850c() {
        int i11;
        if (this.f100180w) {
            return this.f100178u;
        }
        if (this.f100173p.getWidth() > 0) {
            i11 = this.f100173p.getWidth();
        } else {
            i11 = this.f100178u;
        }
        return (i11 - this.f100173p.getPaddingLeft()) - this.f100173p.getPaddingRight();
    }

    /* renamed from: e */
    public static C20274d m105851e(ImageView imageView, ImageView.ScaleType scaleType, ImageView.ScaleType scaleType2) {
        if (imageView != null) {
            if (scaleType != null && scaleType2 != null) {
                C20274d c20274d = new C20274d();
                c20274d.f100174q = scaleType;
                c20274d.f100175r = scaleType2;
                c20274d.f100173p = imageView;
                c20274d.setFloatValues(0.0f, 1.0f);
                return c20274d;
            }
            throw new IllegalArgumentException("Scale types must not be null");
        }
        throw new IllegalArgumentException("targetView must not be null");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m105848a(this.f100174q, this.f100176s);
        m105848a(this.f100175r, this.f100177t);
        float[] fArr = this.f100176s;
        float f11 = fArr[0];
        float[] fArr2 = this.f100177t;
        float f12 = f11 + ((fArr2[0] - f11) * animatedFraction);
        float f13 = fArr[1];
        float f14 = f13 + ((fArr2[1] - f13) * animatedFraction);
        float f15 = fArr[2];
        float f16 = f15 + ((fArr2[2] - f15) * animatedFraction);
        float f17 = fArr[3];
        float f18 = f17 + ((fArr2[3] - f17) * animatedFraction);
        Matrix imageMatrix = this.f100173p.getImageMatrix();
        imageMatrix.setScale(f12, f14);
        imageMatrix.postTranslate(f16, f18);
        this.f100173p.setScaleType(ImageView.ScaleType.MATRIX);
        this.f100173p.invalidate();
    }
}
