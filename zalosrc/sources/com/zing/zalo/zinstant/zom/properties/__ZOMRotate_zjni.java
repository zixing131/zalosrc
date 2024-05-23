package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes.dex */
public class __ZOMRotate_zjni extends __ZOMTransformElement_zjni {
    private static ZOMRotate _$create(int i11, int i12, int i13, float f11) {
        return new ZOMRotate(i11, i12, i13, f11);
    }

    public static ZOMRotate[] convertPointerArrayToZOMRotateArray(long[] jArr) {
        ZOMRotate[] zOMRotateArr = new ZOMRotate[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMRotateArr[i11] = (ZOMRotate) __ZOMTransformElement_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMRotateArr;
    }
}
