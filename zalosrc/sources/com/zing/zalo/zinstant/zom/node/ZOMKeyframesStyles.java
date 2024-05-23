package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMFloat;
import com.zing.zalo.zinstant.zom.properties.ZOMInt;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;

/* loaded from: classes7.dex */
public class ZOMKeyframesStyles {
    public ZOMInt mBackgroundColor;
    public ZOMInt mHeight;
    public ZOMFloat mOpacity;
    public ZOMTransform mTransform;
    public ZOMInt mWidth;

    public static ZOMKeyframesStyles createObject() {
        return new ZOMKeyframesStyles();
    }

    public void setData(ZOMInt zOMInt, ZOMInt zOMInt2, ZOMInt zOMInt3, ZOMFloat zOMFloat, ZOMTransform zOMTransform) {
        this.mWidth = zOMInt;
        this.mHeight = zOMInt2;
        this.mBackgroundColor = zOMInt3;
        this.mOpacity = zOMFloat;
        this.mTransform = zOMTransform;
    }
}
