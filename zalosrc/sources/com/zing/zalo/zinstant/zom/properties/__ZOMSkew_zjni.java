package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes.dex */
public class __ZOMSkew_zjni extends __ZOMTransformElement_zjni {
    private static ZOMSkew _$create(float f11, float f12) {
        return new ZOMSkew(f11, f12);
    }

    public static ZOMSkew[] convertPointerArrayToZOMSkewArray(long[] jArr) {
        ZOMSkew[] zOMSkewArr = new ZOMSkew[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMSkewArr[i11] = (ZOMSkew) __ZOMTransformElement_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMSkewArr;
    }
}
