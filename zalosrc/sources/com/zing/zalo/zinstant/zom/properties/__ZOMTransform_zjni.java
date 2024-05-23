package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMTransform_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMTransform _$create(long j11) {
        ZOMTransform zOMTransform = new ZOMTransform();
        synchronized (__LOCK) {
            _privateStorage.put(zOMTransform, Long.valueOf(j11));
            _privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMTransform));
        }
        return zOMTransform;
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

    public static ZOMTransform[] convertPointerArrayToZOMTransformArray(long[] jArr) {
        ZOMTransform[] zOMTransformArr = new ZOMTransform[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMTransformArr[i11] = (ZOMTransform) getObjectFromPointer(jArr[i11]);
        }
        return zOMTransformArr;
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

    private static void setData(long j11, Object[] objArr, ZOM3DValue zOM3DValue, boolean z11) {
        ZOMTransform zOMTransform = (ZOMTransform) getObjectFromPointer(j11);
        if (zOMTransform != null) {
            zOMTransform.setData(objArr, zOM3DValue, z11);
        }
    }
}
