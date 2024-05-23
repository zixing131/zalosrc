package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMTimingFunctionCubicBezier {
    public float mX1;
    public float mX2;
    public float mY1;
    public float mY2;

    public ZOMTimingFunctionCubicBezier(float f11, float f12, float f13, float f14) {
        this.mX1 = 0.0f;
        this.mY1 = 0.0f;
        this.mX2 = 0.0f;
        this.mY2 = 0.0f;
        this.mX1 = Math.min(Math.max(f11, 0.0f), 1.0f);
        this.mY1 = f12;
        this.mX2 = Math.min(Math.max(f13, 0.0f), 1.0f);
        this.mY2 = f14;
    }

    public static ZOMTimingFunctionCubicBezier createObject() {
        return new ZOMTimingFunctionCubicBezier(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
