package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMClick_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMClick _$create(boolean z11, byte[] bArr, byte[] bArr2) {
        return new ZOMClick(z11, bArr, bArr2);
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

    public static ZOMClick[] convertPointerArrayToZOMClickArray(long[] jArr) {
        ZOMClick[] zOMClickArr = new ZOMClick[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMClickArr[i11] = (ZOMClick) getObjectFromPointer(jArr[i11]);
        }
        return zOMClickArr;
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
