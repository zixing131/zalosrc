package androidx.transition;

import android.animation.TypeEvaluator;

/* renamed from: androidx.transition.c */
/* loaded from: classes2.dex */
class C2005c implements TypeEvaluator {

    /* renamed from: a */
    private float[] f8546a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2005c(float[] fArr) {
        this.f8546a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f11, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f8546a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i11 = 0; i11 < fArr3.length; i11++) {
            float f12 = fArr[i11];
            fArr3[i11] = f12 + ((fArr2[i11] - f12) * f11);
        }
        return fArr3;
    }
}
