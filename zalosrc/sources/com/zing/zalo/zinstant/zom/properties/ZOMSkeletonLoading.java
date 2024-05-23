package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMSkeletonLoading {
    public int mBaseColor;
    public int mDirection;
    public float mDropOff;
    public float mIntensity;
    public int mRepeatDelay;
    public float mTilt;

    public ZOMSkeletonLoading() {
    }

    public static ZOMSkeletonLoading createObject() {
        return new ZOMSkeletonLoading();
    }

    public ZOMSkeletonLoading(int i11, float f11, int i12, int i13, float f12, float f13) {
        this.mBaseColor = i11;
        this.mTilt = f11;
        this.mIntensity = f12;
        this.mRepeatDelay = i12;
        this.mDirection = i13;
        this.mDropOff = f13;
    }
}
