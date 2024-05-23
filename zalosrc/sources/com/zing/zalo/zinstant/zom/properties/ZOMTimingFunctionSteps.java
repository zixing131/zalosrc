package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMTimingFunctionSteps {
    public int mJumpTerm;
    public int mNumOfIntervals;

    public ZOMTimingFunctionSteps(int i11, int i12) {
        this.mNumOfIntervals = i11;
        this.mJumpTerm = i12;
    }

    public static ZOMTimingFunctionSteps createObject() {
        return new ZOMTimingFunctionSteps(0, 0);
    }
}
