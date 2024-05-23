package com.zing.zalo.zinstant.zom.node;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMText_zjni extends __ZOM_zjni {
    private static ZOMText _$create(long j11) {
        ZOMText zOMText = new ZOMText();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMText, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMText));
        }
        return zOMText;
    }

    private static native void __onClickTextSpan(long j11, long j12);

    public static ZOMText[] convertPointerArrayToZOMTextArray(long[] jArr) {
        ZOMText[] zOMTextArr = new ZOMText[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMTextArr[i11] = (ZOMText) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMTextArr;
    }

    public static void onClickTextSpan(ZOMText zOMText, long j11) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMText);
        if (pointerFromObject != 0) {
            __onClickTextSpan(pointerFromObject, j11);
        }
    }

    private static void setData(long j11, Object[] objArr, int i11, float f11, float f12, int i12, boolean z11) {
        ZOMText zOMText = (ZOMText) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMText != null) {
            zOMText.setData(objArr, i11, f11, f12, i12, z11);
        }
    }
}
