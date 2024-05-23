package com.zing.zalo.zinstant.zom.properties;

import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMAnimationElement {
    public int mDelay;
    public int mDirection;
    public int mDuration;
    public int mFillMode;
    public float mIterationCount;
    public String mName;
    public int mPlayState;
    public int mProperty;
    public ZOMTimingFunction mTimingFunction;

    public ZOMAnimationElement() {
    }

    public ZOMAnimationElement(byte[] bArr, int i11, int i12, float f11, int i13, ZOMTimingFunction zOMTimingFunction, int i14, int i15) {
        this.mName = AbstractC28268b.m142407b(bArr);
        this.mDuration = i11;
        this.mDelay = i12;
        this.mIterationCount = f11;
        this.mDirection = i13;
        this.mTimingFunction = zOMTimingFunction;
        this.mFillMode = i14;
        this.mPlayState = i15;
    }

    public static ZOMAnimationElement createObject() {
        return new ZOMAnimationElement();
    }
}
