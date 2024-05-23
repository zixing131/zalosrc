package com.zing.zalo.zinstant.zom.node;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMAudio_zjni extends __ZOMMedia_zjni {
    private static ZOMAudio _$create(long j11) {
        ZOMAudio zOMAudio = new ZOMAudio();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMAudio, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMAudio));
        }
        return zOMAudio;
    }

    public static ZOMAudio[] convertPointerArrayToZOMAudioArray(long[] jArr) {
        ZOMAudio[] zOMAudioArr = new ZOMAudio[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMAudioArr[i11] = (ZOMAudio) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMAudioArr;
    }
}
