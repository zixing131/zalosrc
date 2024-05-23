package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMSkeleton_zjni extends __ZOM_zjni {
    private static ZOMSkeleton _$create(long j11) {
        ZOMSkeleton zOMSkeleton = new ZOMSkeleton();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMSkeleton, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMSkeleton));
        }
        return zOMSkeleton;
    }

    public static ZOMSkeleton[] convertPointerArrayToZOMSkeletonArray(long[] jArr) {
        ZOMSkeleton[] zOMSkeletonArr = new ZOMSkeleton[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMSkeletonArr[i11] = (ZOMSkeleton) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMSkeletonArr;
    }

    private static void setChildren(long j11, Object[] objArr) {
        ZOMSkeleton zOMSkeleton = (ZOMSkeleton) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMSkeleton != null) {
            zOMSkeleton.setChildren(objArr);
        }
    }

    private static void setData(long j11, int i11, int i12, int i13) {
        ZOMSkeleton zOMSkeleton = (ZOMSkeleton) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMSkeleton != null) {
            zOMSkeleton.setData(i11, i12, i13);
        }
    }

    private static void updateData(long j11, ZOMRect zOMRect, int i11, int i12, int i13, ZOMRect zOMRect2) {
        ZOMSkeleton zOMSkeleton = (ZOMSkeleton) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMSkeleton != null) {
            zOMSkeleton.updateData(zOMRect, i11, i12, i13, zOMRect2);
        }
    }
}
