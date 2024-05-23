package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMScale extends ZOMTransformElement {

    /* renamed from: mX */
    public float f88007mX;

    /* renamed from: mY */
    public float f88008mY;

    /* renamed from: mZ */
    public float f88009mZ;

    public ZOMScale(float f11, float f12, float f13) {
        this.f88007mX = f11;
        this.f88008mY = f12;
        this.f88009mZ = f13;
    }

    public static ZOMScale createObject() {
        return new ZOMScale(0.0f, 0.0f, 0.0f);
    }

    public static ZOMScale identity() {
        return new ZOMScale(1.0f, 1.0f, 1.0f);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMTransformElement cloneTransform() {
        return new ZOMScale(this.f88007mX, this.f88008mY, this.f88009mZ);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void combine(ZOMTransformElement zOMTransformElement, ZOMTransformElement zOMTransformElement2, float f11, float f12) {
        if ((zOMTransformElement instanceof ZOMScale) && (zOMTransformElement2 instanceof ZOMScale)) {
            ZOMScale zOMScale = (ZOMScale) zOMTransformElement;
            ZOMScale zOMScale2 = (ZOMScale) zOMTransformElement2;
            this.f88007mX = (zOMScale.f88007mX * f11) + (zOMScale2.f88007mX * f12);
            this.f88008mY = (zOMScale.f88008mY * f11) + (zOMScale2.f88008mY * f12);
            this.f88009mZ = (zOMScale.f88009mZ * f11) + (zOMScale2.f88009mZ * f12);
        }
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public int getType() {
        return 1;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public boolean isIdentity() {
        return this.f88007mX == 1.0f && this.f88008mY == 1.0f && this.f88009mZ == 1.0f;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void postMatrix(ZOMMatrix2D zOMMatrix2D) {
        float[] fArr = zOMMatrix2D.matrix;
        float f11 = fArr[0];
        float f12 = this.f88007mX;
        fArr[0] = f11 * f12;
        float f13 = fArr[2];
        float f14 = this.f88008mY;
        fArr[2] = f13 * f14;
        fArr[1] = fArr[1] * f12;
        fArr[3] = fArr[3] * f14;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMMatrix2D toMatrix2d() {
        return new ZOMMatrix2D(new float[]{this.f88007mX, 0.0f, 0.0f, this.f88008mY, 0.0f, 0.0f});
    }
}
