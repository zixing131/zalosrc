package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMConditional_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMConditional[] _$create_array(int i11) {
        return new ZOMConditional[i11];
    }

    private static void _$set_element(ZOMConditional[] zOMConditionalArr, ZOMConditional zOMConditional, int i11) {
        zOMConditionalArr[i11] = zOMConditional;
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

    public static ZOMConditional[] convertPointerArrayToZOMConditionalArray(long[] jArr) {
        ZOMConditional[] zOMConditionalArr = new ZOMConditional[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMConditionalArr[i11] = (ZOMConditional) getObjectFromPointer(jArr[i11]);
        }
        return zOMConditionalArr;
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
}
