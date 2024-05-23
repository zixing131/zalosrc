package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMSkeletonBackdropConfig {
    public int mBackgroundColor;
    public ZOMBorder mBorder;
    public boolean[] mCornersToggle;
    public ZOMRect mDimen;
    public int mHeight;
    public float mRadius;
    public int mWidth;

    ZOMSkeletonBackdropConfig() {
        this.mBackgroundColor = 0;
    }

    public static ZOMSkeletonBackdropConfig createObject() {
        return new ZOMSkeletonBackdropConfig();
    }

    public ZOMSkeletonBackdropConfig(ZOMRect zOMRect, int i11, int i12, float f11, boolean[] zArr, ZOMBorder zOMBorder, int i13) {
        this.mDimen = zOMRect;
        this.mWidth = i11;
        this.mHeight = i12;
        this.mRadius = f11;
        this.mCornersToggle = zArr;
        this.mBorder = zOMBorder;
        this.mBackgroundColor = i13;
    }
}
