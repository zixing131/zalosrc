package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMLoading_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMLoading _$create() {
        return new ZOMLoading();
    }

    protected static final void _cleanInternalResource(long j11) {
        synchronized (__LOCK) {
            _privateStorage.remove(getObjectFromPointer(j11));
            _privateStorageInverse.remove(Long.valueOf(j11));
        }
    }

    private static final Object _getJavaObject(long j11) {
        Object objectFromPointer;
        synchronized (__LOCK) {
            objectFromPointer = getObjectFromPointer(j11);
        }
        return objectFromPointer;
    }

    public static ZOMLoading[] convertPointerArrayToZOMLoadingArray(long[] jArr) {
        ZOMLoading[] zOMLoadingArr = new ZOMLoading[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMLoadingArr[i11] = (ZOMLoading) getObjectFromPointer(jArr[i11]);
        }
        return zOMLoadingArr;
    }

    public static final <T> T getObjectFromPointer(long j11) {
        T t7 = null;
        if (j11 == 0) {
            return null;
        }
        synchronized (__LOCK) {
            try {
                WeakReference<Object> weakReference = _privateStorageInverse.get(Long.valueOf(j11));
                if (weakReference != null) {
                    t7 = (T) weakReference.get();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t7;
    }

    public static final long getPointerFromObject(Object obj) {
        long j11;
        synchronized (__LOCK) {
            try {
                Long l11 = _privateStorage.get(obj);
                if (l11 != null) {
                    j11 = l11.longValue();
                } else {
                    j11 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    private static void updateData(ZOMLoading zOMLoading, int i11, float f11, float f12, int i12, int i13, int i14, ZOMTimingFunction zOMTimingFunction, ZOMLinearLoading zOMLinearLoading, ZOMCircularLoading zOMCircularLoading, ZOMSkeletonLoading zOMSkeletonLoading, ZOMDotLoading zOMDotLoading) {
        if (zOMLoading != null) {
            zOMLoading.updateData(i11, f11, f12, i12, i13, i14, zOMTimingFunction, zOMLinearLoading, zOMCircularLoading, zOMSkeletonLoading, zOMDotLoading);
        }
    }
}
