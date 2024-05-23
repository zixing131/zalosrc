package p500s1;

import android.view.animation.Interpolator;

/* renamed from: s1.d */
/* loaded from: classes2.dex */
abstract class AbstractInterpolatorC26089d implements Interpolator {

    /* renamed from: a */
    private final float[] f124290a;

    /* renamed from: b */
    private final float f124291b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInterpolatorC26089d(float[] fArr) {
        this.f124290a = fArr;
        this.f124291b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f124290a;
        int min = Math.min((int) ((fArr.length - 1) * f11), fArr.length - 2);
        float f12 = this.f124291b;
        float f13 = (f11 - (min * f12)) / f12;
        float[] fArr2 = this.f124290a;
        float f14 = fArr2[min];
        return f14 + (f13 * (fArr2[min + 1] - f14));
    }
}
