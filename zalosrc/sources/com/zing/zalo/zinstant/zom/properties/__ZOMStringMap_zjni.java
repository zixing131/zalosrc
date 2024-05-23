package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMStringMap_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMStringMap _$create() {
        return new ZOMStringMap();
    }

    private static ZOMStringMap[] _$create_array(int i11) {
        return new ZOMStringMap[i11];
    }

    private static void _$set_element(ZOMStringMap[] zOMStringMapArr, ZOMStringMap zOMStringMap, int i11) {
        zOMStringMapArr[i11] = zOMStringMap;
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

    public static ZOMStringMap[] convertPointerArrayToZOMStringMapArray(long[] jArr) {
        ZOMStringMap[] zOMStringMapArr = new ZOMStringMap[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMStringMapArr[i11] = (ZOMStringMap) getObjectFromPointer(jArr[i11]);
        }
        return zOMStringMapArr;
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

    private static ZOMStringMap _$create(byte[] bArr, byte[] bArr2) {
        return new ZOMStringMap(bArr, bArr2);
    }
}
