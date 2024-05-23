package com.zing.zalo.zinstant.zom.properties;

import android.animation.TimeInterpolator;
import sk0.C26315i;

/* loaded from: classes7.dex */
public class ZOMTransitionElement {
    private TimeInterpolator interpolator;
    public int mDelay;
    public int mDuration;
    public int mProperty;
    public ZOMTimingFunction mTimingFunction;

    public ZOMTransitionElement(int i11, int i12, int i13, ZOMTimingFunction zOMTimingFunction) {
        this.mProperty = i11;
        this.mDuration = i12;
        this.mDelay = i13;
        this.mTimingFunction = zOMTimingFunction;
        this.interpolator = generateTimingFunction(zOMTimingFunction);
    }

    public static ZOMTransitionElement createObject() {
        return new ZOMTransitionElement(0, 0, 0, null);
    }

    private static TimeInterpolator generateTimingFunction(ZOMTimingFunction zOMTimingFunction) {
        return C26315i.f124969a.m135443a(zOMTimingFunction);
    }

    public TimeInterpolator getInterpolator() {
        if (this.interpolator == null) {
            this.interpolator = generateTimingFunction(this.mTimingFunction);
        }
        return this.interpolator;
    }
}
