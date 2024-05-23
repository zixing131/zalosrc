package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMLoading {
    public ZOMCircularLoading mCircularLoading;
    public int mColor;
    public ZOMDotLoading mDotLoading;
    public int mDuration;
    public float mHeight;
    public ZOMLinearLoading mLinearLoading;
    public ZOMSkeletonLoading mSkeletonLoading;
    public int mState;
    public ZOMTimingFunction mTimingFunction;
    public int mVariant;
    public float mWidth;

    public static ZOMLoading createObject() {
        return new ZOMLoading();
    }

    public void updateData(int i11, float f11, float f12, int i12, int i13, int i14, ZOMTimingFunction zOMTimingFunction, ZOMLinearLoading zOMLinearLoading, ZOMCircularLoading zOMCircularLoading, ZOMSkeletonLoading zOMSkeletonLoading, ZOMDotLoading zOMDotLoading) {
        this.mState = i11;
        this.mWidth = f11;
        this.mHeight = f12;
        this.mColor = i12;
        this.mDuration = i13;
        this.mVariant = i14;
        this.mTimingFunction = zOMTimingFunction;
        this.mLinearLoading = zOMLinearLoading;
        this.mCircularLoading = zOMCircularLoading;
        this.mSkeletonLoading = zOMSkeletonLoading;
        this.mDotLoading = zOMDotLoading;
    }
}
