package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMInputText;
import com.zing.zalo.zinstant.zom.properties.__ZOMInputText_zjni;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMInput_zjni extends __ZOM_zjni {
    private static ZOMInput _$create(long j11) {
        ZOMInput zOMInput = new ZOMInput();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMInput, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMInput));
        }
        return zOMInput;
    }

    public static ZOMInput[] convertPointerArrayToZOMInputArray(long[] jArr) {
        ZOMInput[] zOMInputArr = new ZOMInput[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMInputArr[i11] = (ZOMInput) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMInputArr;
    }

    private static void setData(long j11, long j12, int i11, boolean z11) {
        ZOMInput zOMInput = (ZOMInput) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMInput != null) {
            zOMInput.setData((ZOMInputText) __ZOMInputText_zjni.getObjectFromPointer(j12), i11, z11);
        }
    }
}
