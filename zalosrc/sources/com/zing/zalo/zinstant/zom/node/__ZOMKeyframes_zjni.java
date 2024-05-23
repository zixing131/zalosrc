package com.zing.zalo.zinstant.zom.node;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMKeyframes_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMKeyframes _$create(byte[] bArr, Object[] objArr) {
        return new ZOMKeyframes(bArr, objArr);
    }

    private static ZOMKeyframes[] _$create_array(int i11) {
        return new ZOMKeyframes[i11];
    }

    private static void _$set_element(ZOMKeyframes[] zOMKeyframesArr, ZOMKeyframes zOMKeyframes, int i11) {
        zOMKeyframesArr[i11] = zOMKeyframes;
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

    public static ZOMKeyframes[] convertPointerArrayToZOMKeyframesArray(long[] jArr) {
        ZOMKeyframes[] zOMKeyframesArr = new ZOMKeyframes[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMKeyframesArr[i11] = (ZOMKeyframes) getObjectFromPointer(jArr[i11]);
        }
        return zOMKeyframesArr;
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
