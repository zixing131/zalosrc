package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMContainer_zjni extends __ZOM_zjni {
    private static ZOMContainer _$create(long j11) {
        ZOMContainer zOMContainer = new ZOMContainer();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMContainer, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMContainer));
        }
        return zOMContainer;
    }

    public static ZOMContainer[] convertPointerArrayToZOMContainerArray(long[] jArr) {
        ZOMContainer[] zOMContainerArr = new ZOMContainer[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMContainerArr[i11] = (ZOMContainer) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMContainerArr;
    }

    private static void setData(long j11, Object[] objArr) {
        ZOMContainer zOMContainer = (ZOMContainer) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMContainer != null) {
            zOMContainer.setData(objArr);
        }
    }

    private static void setLoading(long j11, ZOMLoading zOMLoading) {
        ZOMContainer zOMContainer = (ZOMContainer) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMContainer != null) {
            zOMContainer.setLoading(zOMLoading);
        }
    }
}
