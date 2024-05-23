package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMDotLoading {
    public int mDotDelay;
    public int mNumDot;
    public float mRadius;
    public ZOMTransformElement[] mTransformElements;

    public ZOMDotLoading() {
    }

    public ZOMDotLoading(ZOMTransformElement[] zOMTransformElementArr, float f11, int i11, int i12) {
        this.mTransformElements = zOMTransformElementArr;
        this.mRadius = f11;
        this.mNumDot = i11;
        this.mDotDelay = i12;
    }

    public static ZOMDotLoading createObject() {
        return new ZOMDotLoading();
    }
}
