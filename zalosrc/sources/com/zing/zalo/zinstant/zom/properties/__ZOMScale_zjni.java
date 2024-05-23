package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes.dex */
public class __ZOMScale_zjni extends __ZOMTransformElement_zjni {
    private static ZOMScale _$create(float f11, float f12, float f13) {
        return new ZOMScale(f11, f12, f13);
    }

    public static ZOMScale[] convertPointerArrayToZOMScaleArray(long[] jArr) {
        ZOMScale[] zOMScaleArr = new ZOMScale[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMScaleArr[i11] = (ZOMScale) __ZOMTransformElement_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMScaleArr;
    }
}
