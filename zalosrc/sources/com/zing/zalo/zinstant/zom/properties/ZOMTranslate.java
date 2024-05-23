package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMTranslate extends ZOMTransformElement {

    /* renamed from: mX */
    public float f88010mX;

    /* renamed from: mY */
    public float f88011mY;

    /* renamed from: mZ */
    public float f88012mZ;

    public ZOMTranslate(float f11, float f12, float f13) {
        this.f88010mX = f11;
        this.f88011mY = f12;
        this.f88012mZ = f13;
    }

    public static ZOMTranslate createObject() {
        return new ZOMTranslate();
    }

    public static ZOMTranslate identity() {
        return new ZOMTranslate(0.0f, 0.0f, 0.0f);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMTransformElement cloneTransform() {
        return new ZOMTranslate(this.f88010mX, this.f88011mY, this.f88012mZ);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void combine(ZOMTransformElement zOMTransformElement, ZOMTransformElement zOMTransformElement2, float f11, float f12) {
        if ((zOMTransformElement instanceof ZOMTranslate) && (zOMTransformElement2 instanceof ZOMTranslate)) {
            ZOMTranslate zOMTranslate = (ZOMTranslate) zOMTransformElement;
            ZOMTranslate zOMTranslate2 = (ZOMTranslate) zOMTransformElement2;
            this.f88010mX = (zOMTranslate.f88010mX * f11) + (zOMTranslate2.f88010mX * f12);
            this.f88011mY = (zOMTranslate.f88011mY * f11) + (zOMTranslate2.f88011mY * f12);
            this.f88012mZ = (zOMTranslate.f88012mZ * f11) + (zOMTranslate2.f88012mZ * f12);
        }
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public int getType() {
        return 0;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public boolean isIdentity() {
        return this.f88010mX == 0.0f && this.f88011mY == 0.0f && this.f88012mZ == 0.0f;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void postMatrix(ZOMMatrix2D zOMMatrix2D) {
        float[] fArr = zOMMatrix2D.matrix;
        float f11 = fArr[4];
        float f12 = fArr[0];
        float f13 = this.f88010mX;
        float f14 = fArr[2];
        float f15 = this.f88011mY;
        fArr[4] = f11 + (f12 * f13) + (f14 * f15);
        fArr[5] = fArr[5] + (fArr[1] * f13) + (fArr[3] * f15);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMMatrix2D toMatrix2d() {
        return new ZOMMatrix2D(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f88010mX, this.f88011mY});
    }

    public ZOMTranslate() {
        this.f88010mX = 0.0f;
        this.f88011mY = 0.0f;
        this.f88012mZ = 0.0f;
    }
}
