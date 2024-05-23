package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMTimingFunction {
    public ZOMTimingFunctionCubicBezier mCubicBezier;
    public ZOMTimingFunctionSteps mStepsFunction;

    public ZOMTimingFunction(ZOMTimingFunctionSteps zOMTimingFunctionSteps, ZOMTimingFunctionCubicBezier zOMTimingFunctionCubicBezier) {
        this.mStepsFunction = zOMTimingFunctionSteps;
        this.mCubicBezier = zOMTimingFunctionCubicBezier;
    }

    public static ZOMTimingFunction createObject() {
        return new ZOMTimingFunction(null, null);
    }
}
