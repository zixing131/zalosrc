package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes.dex */
public class __ZOMTranslate_zjni extends __ZOMTransformElement_zjni {
    private static ZOMTranslate _$create(float f11, float f12, float f13) {
        return new ZOMTranslate(f11, f12, f13);
    }

    public static ZOMTranslate[] convertPointerArrayToZOMTranslateArray(long[] jArr) {
        ZOMTranslate[] zOMTranslateArr = new ZOMTranslate[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMTranslateArr[i11] = (ZOMTranslate) __ZOMTransformElement_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMTranslateArr;
    }
}
