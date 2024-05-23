package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMGradient {
    public int mAngle;
    public float mCenterX;
    public float mCenterY;
    public int[] mColors;
    public float[] mPositions;
    public float mRadius;
    public float mScaleX;
    public float mScaleY;
    public int mType;

    public static ZOMGradient createObject() {
        return new ZOMGradient();
    }

    public void setData(int i11, int[] iArr, float[] fArr, int i12, float f11, float f12, float f13, float f14, float f15) {
        this.mType = i11;
        this.mAngle = i12;
        this.mColors = iArr;
        this.mPositions = fArr;
        this.mRadius = f11;
        this.mCenterX = f12;
        this.mCenterY = f13;
        this.mScaleX = f14;
        this.mScaleY = f15;
    }
}
