package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMTransitionElement_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMTransitionElement _$create(int i11, int i12, int i13, ZOMTimingFunction zOMTimingFunction) {
        return new ZOMTransitionElement(i11, i12, i13, zOMTimingFunction);
    }

    private static ZOMTransitionElement[] _$create_array(int i11) {
        return new ZOMTransitionElement[i11];
    }

    private static void _$set_element(ZOMTransitionElement[] zOMTransitionElementArr, ZOMTransitionElement zOMTransitionElement, int i11) {
        zOMTransitionElementArr[i11] = zOMTransitionElement;
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

    public static ZOMTransitionElement[] convertPointerArrayToZOMTransitionElementArray(long[] jArr) {
        ZOMTransitionElement[] zOMTransitionElementArr = new ZOMTransitionElement[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMTransitionElementArr[i11] = (ZOMTransitionElement) getObjectFromPointer(jArr[i11]);
        }
        return zOMTransitionElementArr;
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
