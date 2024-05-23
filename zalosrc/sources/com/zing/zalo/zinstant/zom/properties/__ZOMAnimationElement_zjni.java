package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMAnimationElement_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMAnimationElement _$create(byte[] bArr, int i11, int i12, float f11, int i13, ZOMTimingFunction zOMTimingFunction, int i14, int i15) {
        return new ZOMAnimationElement(bArr, i11, i12, f11, i13, zOMTimingFunction, i14, i15);
    }

    private static ZOMAnimationElement[] _$create_array(int i11) {
        return new ZOMAnimationElement[i11];
    }

    private static void _$set_element(ZOMAnimationElement[] zOMAnimationElementArr, ZOMAnimationElement zOMAnimationElement, int i11) {
        zOMAnimationElementArr[i11] = zOMAnimationElement;
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

    public static ZOMAnimationElement[] convertPointerArrayToZOMAnimationElementArray(long[] jArr) {
        ZOMAnimationElement[] zOMAnimationElementArr = new ZOMAnimationElement[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMAnimationElementArr[i11] = (ZOMAnimationElement) getObjectFromPointer(jArr[i11]);
        }
        return zOMAnimationElementArr;
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
