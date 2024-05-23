package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMGlowingAnimation {
    public int mColor;
    public int mDuration;
    public int mIterationCount;
    public float mRadius;
    public int mTimingFunction;
    public int mWaveCount;
    public int mWaveDelay;

    public ZOMGlowingAnimation() {
    }

    public ZOMGlowingAnimation(float f11, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.mRadius = f11;
        this.mColor = i11;
        this.mDuration = i12;
        this.mIterationCount = i13;
        this.mTimingFunction = i14;
        this.mWaveCount = i15;
        this.mWaveDelay = i16;
    }

    public static ZOMGlowingAnimation createObject() {
        return new ZOMGlowingAnimation();
    }
}
