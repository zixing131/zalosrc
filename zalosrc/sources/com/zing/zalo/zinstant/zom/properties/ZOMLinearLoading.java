package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMLinearLoading {
    public float mAnimBarWidth;
    public int mAnimType;
    public int mHighlightColor;

    public ZOMLinearLoading() {
        this.mAnimType = 0;
    }

    public static ZOMLinearLoading createObject() {
        return new ZOMLinearLoading();
    }

    public ZOMLinearLoading(int i11, float f11, int i12) {
        this.mAnimType = i11;
        this.mAnimBarWidth = f11;
        this.mHighlightColor = i12;
    }
}
