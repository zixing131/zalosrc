package com.zing.zalo.zinstant.zom.node;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class __ZOMButton_zjni extends __ZOMText_zjni {
    private static ZOMButton _$create(long j11) {
        ZOMButton zOMButton = new ZOMButton();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMButton, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMButton));
        }
        return zOMButton;
    }

    public static ZOMButton[] convertPointerArrayToZOMButtonArray(long[] jArr) {
        ZOMButton[] zOMButtonArr = new ZOMButton[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMButtonArr[i11] = (ZOMButton) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMButtonArr;
    }
}
