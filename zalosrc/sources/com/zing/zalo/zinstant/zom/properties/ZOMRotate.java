package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMRotate extends ZOMTransformElement {
    public float mAngle;

    /* renamed from: mX */
    public int f88004mX;

    /* renamed from: mY */
    public int f88005mY;

    /* renamed from: mZ */
    public int f88006mZ;

    public ZOMRotate(int i11, int i12, int i13, float f11) {
        this.f88004mX = i11;
        this.f88005mY = i12;
        this.f88006mZ = i13;
        this.mAngle = f11;
    }

    public static ZOMRotate createObject() {
        return new ZOMRotate(0, 0, 0, 0.0f);
    }

    public static ZOMRotate identity() {
        return new ZOMRotate(0, 0, 1, 0.0f);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMTransformElement cloneTransform() {
        return new ZOMRotate(this.f88004mX, this.f88005mY, this.f88006mZ, this.mAngle);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void combine(ZOMTransformElement zOMTransformElement, ZOMTransformElement zOMTransformElement2, float f11, float f12) {
        if ((zOMTransformElement instanceof ZOMRotate) && (zOMTransformElement2 instanceof ZOMRotate)) {
            this.mAngle = (((ZOMRotate) zOMTransformElement).mAngle * f11) + (((ZOMRotate) zOMTransformElement2).mAngle * f12);
        }
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public int getType() {
        return 2;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public boolean isIdentity() {
        return this.mAngle == 0.0f;
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public void postMatrix(ZOMMatrix2D zOMMatrix2D) {
        float cos = (float) Math.cos(Math.toRadians(this.mAngle));
        float sin = (float) Math.sin(Math.toRadians(this.mAngle));
        float[] fArr = zOMMatrix2D.matrix;
        float f11 = fArr[0];
        float f12 = fArr[3];
        float f13 = fArr[2];
        float f14 = fArr[1];
        fArr[0] = (f11 * cos) + (f13 * sin);
        fArr[2] = ((-f11) * sin) + (f13 * cos);
        fArr[1] = (f14 * cos) + (f12 * sin);
        fArr[3] = ((-f14) * sin) + (f12 * cos);
    }

    @Override // com.zing.zalo.zinstant.zom.properties.ZOMTransformElement
    public ZOMMatrix2D toMatrix2d() {
        float cos = (float) Math.cos(Math.toRadians(this.mAngle));
        float sin = (float) Math.sin(Math.toRadians(this.mAngle));
        return new ZOMMatrix2D(new float[]{cos, sin, -sin, cos, 0.0f, 0.0f});
    }
}
