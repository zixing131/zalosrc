package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMMatrix2D extends ZOMTransformElement {
    public static final float[] IDENTITY_MATRIX = {1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final int SCALE_X = 0;
    public static final int SCALE_Y = 3;
    public static final int SKEW_X = 2;
    public static final int SKEW_Y = 1;
    public static final int TRANS_X = 4;
    public static final int TRANS_Y = 5;
    public float[] matrix;

    public ZOMMatrix2D(float[] fArr) {
        if (fArr == null || fArr.length != 6) {
            this.matrix = identityValue();
        } else {
            this.matrix = fArr;
        }
    }

    public static ZOMMatrix2D createObject() {
        return new ZOMMatrix2D();
    }

    public static ZOMMatrix2D identity() {
        return new ZOMMatrix2D();
    }

    public static float[] identityValue() {
        float[] fArr = new float[6];
        fArr[0] = 1.0f;
        fArr[3] = 1.0f;
        return fArr;
    }

    public void clear() {
        float[] fArr = this.matrix;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 1.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void combine(ZOMTransformElement zOMTransformElement, ZOMTransformElement zOMTransformElement2, float f11, float f12) {
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public int getType() {
        return 4;
    }

    public boolean inverse(ZOMMatrix2D zOMMatrix2D) {
        float[] fArr = this.matrix;
        float f11 = fArr[0];
        float f12 = fArr[3];
        float f13 = fArr[1];
        float f14 = fArr[2];
        float f15 = (f11 * f12) - (f13 * f14);
        if (f15 == 0.0f) {
            return false;
        }
        float[] fArr2 = zOMMatrix2D.matrix;
        fArr2[0] = f12 / f15;
        fArr2[1] = (-f13) / f15;
        fArr2[2] = (-f14) / f15;
        float f16 = fArr[0];
        fArr2[3] = f16 / f15;
        float f17 = fArr[2];
        float f18 = fArr[5];
        fArr2[4] = ((f17 * f18) - (fArr[3] * fArr[4])) / f15;
        fArr2[5] = (((-f16) * f18) + (fArr[1] * fArr[4])) / f15;
        return true;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public boolean isIdentity() {
        float[] fArr = this.matrix;
        float f11 = fArr[0];
        float[] fArr2 = IDENTITY_MATRIX;
        if (f11 != fArr2[0] || fArr[1] != fArr2[1] || fArr[2] != fArr2[2] || fArr[3] != fArr2[3] || fArr[4] != fArr2[4] || fArr[5] != fArr2[5]) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void postMatrix(ZOMMatrix2D zOMMatrix2D) {
        float[] fArr = this.matrix;
        float f11 = fArr[0];
        float f12 = fArr[3];
        float f13 = fArr[2];
        float f14 = fArr[1];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float[] fArr2 = zOMMatrix2D.matrix;
        float f17 = fArr2[0];
        float f18 = fArr2[3];
        float f19 = fArr2[2];
        float f21 = fArr2[1];
        float f22 = fArr2[4];
        float f23 = fArr2[5];
        fArr2[0] = (f17 * f11) + (f19 * f14);
        fArr2[2] = (f17 * f13) + (f19 * f12);
        fArr2[4] = (f17 * f15) + (f19 * f16) + f22;
        fArr2[1] = (f11 * f21) + (f14 * f18);
        fArr2[3] = (f13 * f21) + (f12 * f18);
        fArr2[5] = (f21 * f15) + (f18 * f16) + f23;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMMatrix2D toMatrix2d() {
        return cloneTransform();
    }

    public String toString() {
        return "[" + this.matrix[0] + "," + this.matrix[1] + "," + this.matrix[2] + "," + this.matrix[3] + "," + this.matrix[4] + "," + this.matrix[5] + "]";
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMMatrix2D cloneTransform() {
        float[] fArr = this.matrix;
        return new ZOMMatrix2D(new float[]{fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]});
    }

    public ZOMMatrix2D() {
        this.matrix = identityValue();
    }
}
