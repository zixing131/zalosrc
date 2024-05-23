package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMSkew extends ZOMTransformElement {
    public float mAngleX;
    public float mAngleY;

    public ZOMSkew(float f11, float f12) {
        this.mAngleX = f11;
        this.mAngleY = f12;
    }

    public static ZOMSkew createObject() {
        return new ZOMSkew(0.0f, 0.0f);
    }

    public static ZOMSkew identity() {
        return new ZOMSkew(0.0f, 0.0f);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMTransformElement cloneTransform() {
        return new ZOMSkew(this.mAngleX, this.mAngleY);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void combine(ZOMTransformElement zOMTransformElement, ZOMTransformElement zOMTransformElement2, float f11, float f12) {
        if ((zOMTransformElement instanceof ZOMSkew) && (zOMTransformElement2 instanceof ZOMSkew)) {
            ZOMSkew zOMSkew = (ZOMSkew) zOMTransformElement;
            ZOMSkew zOMSkew2 = (ZOMSkew) zOMTransformElement2;
            this.mAngleX = (zOMSkew.mAngleX * f11) + (zOMSkew2.mAngleX * f12);
            this.mAngleY = (zOMSkew.mAngleY * f11) + (zOMSkew2.mAngleY * f12);
        }
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public int getType() {
        return 3;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public boolean isIdentity() {
        return this.mAngleX == 0.0f && this.mAngleY == 0.0f;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void postMatrix(ZOMMatrix2D zOMMatrix2D) {
        float tan = (float) Math.tan(Math.toRadians(this.mAngleX));
        float tan2 = (float) Math.tan(Math.toRadians(this.mAngleY));
        float[] fArr = zOMMatrix2D.matrix;
        float f11 = fArr[0];
        float f12 = fArr[3];
        float f13 = fArr[2];
        float f14 = fArr[1];
        fArr[0] = (f13 * tan2) + f11;
        fArr[2] = f13 + (f11 * tan);
        fArr[1] = (tan2 * f12) + f14;
        fArr[3] = f12 + (f14 * tan);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMMatrix2D toMatrix2d() {
        return new ZOMMatrix2D(new float[]{1.0f, (float) Math.tan(Math.toRadians(this.mAngleY)), (float) Math.tan(Math.toRadians(this.mAngleX)), 1.0f, 0.0f, 0.0f});
    }
}
