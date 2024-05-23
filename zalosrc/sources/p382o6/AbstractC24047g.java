package p382o6;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: o6.g */
/* loaded from: classes3.dex */
public abstract class AbstractC24047g implements TypeEvaluator {

    /* renamed from: a */
    private final float[] f116368a = new float[9];

    /* renamed from: b */
    private final float[] f116369b = new float[9];

    /* renamed from: c */
    private final Matrix f116370c = new Matrix();

    /* renamed from: a */
    public Matrix mo32436a(float f11, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f116368a);
        matrix2.getValues(this.f116369b);
        for (int i11 = 0; i11 < 9; i11++) {
            float[] fArr = this.f116369b;
            float f12 = fArr[i11];
            float f13 = this.f116368a[i11];
            fArr[i11] = f13 + ((f12 - f13) * f11);
        }
        this.f116370c.setValues(this.f116369b);
        return this.f116370c;
    }
}
