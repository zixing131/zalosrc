package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMCircularLoading {
    public float mThickness;
    public int mType;

    public ZOMCircularLoading() {
        this.mType = 0;
    }

    public static ZOMCircularLoading createObject() {
        return new ZOMCircularLoading();
    }

    public ZOMCircularLoading(int i11, float f11) {
        this.mType = i11;
        this.mThickness = f11;
    }
}
