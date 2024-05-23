package p631x3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: x3.d */
/* loaded from: classes2.dex */
public class InterpolatorC29303d implements Interpolator {

    /* renamed from: a */
    private final float[] f135739a;

    /* renamed from: b */
    private final float[] f135740b;

    public InterpolatorC29303d(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f11, f12, f13, f14, 1.0f, 1.0f);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i11 = (int) (length / 0.03f);
        int i12 = i11 + 1;
        this.f135739a = new float[i12];
        this.f135740b = new float[i12];
        float[] fArr = new float[2];
        for (int i13 = 0; i13 < i12; i13++) {
            pathMeasure.getPosTan((i13 * length) / i11, fArr, null);
            this.f135739a[i13] = fArr[0];
            this.f135740b[i13] = fArr[1];
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f135739a.length - 1;
        int i11 = 0;
        while (length - i11 > 1) {
            int i12 = (i11 + length) / 2;
            if (f11 < this.f135739a[i12]) {
                length = i12;
            } else {
                i11 = i12;
            }
        }
        float[] fArr = this.f135739a;
        float f12 = fArr[length];
        float f13 = fArr[i11];
        float f14 = f12 - f13;
        if (f14 == 0.0f) {
            return this.f135740b[i11];
        }
        float f15 = (f11 - f13) / f14;
        float[] fArr2 = this.f135740b;
        float f16 = fArr2[i11];
        return f16 + (f15 * (fArr2[length] - f16));
    }
}
