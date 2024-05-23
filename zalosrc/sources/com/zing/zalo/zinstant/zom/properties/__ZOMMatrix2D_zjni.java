package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes.dex */
public class __ZOMMatrix2D_zjni extends __ZOMTransformElement_zjni {
    private static ZOMMatrix2D _$create(float[] fArr) {
        return new ZOMMatrix2D(fArr);
    }

    public static ZOMMatrix2D[] convertPointerArrayToZOMMatrix2DArray(long[] jArr) {
        ZOMMatrix2D[] zOMMatrix2DArr = new ZOMMatrix2D[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMMatrix2DArr[i11] = (ZOMMatrix2D) __ZOMTransformElement_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMMatrix2DArr;
    }

    private static ZOMMatrix2D _$create() {
        return new ZOMMatrix2D();
    }
}
