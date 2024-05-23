package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMBackground_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMBackground _$create(long j11) {
        ZOMBackground zOMBackground = new ZOMBackground();
        synchronized (__LOCK) {
            _privateStorage.put(zOMBackground, Long.valueOf(j11));
            _privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMBackground));
        }
        return zOMBackground;
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

    public static ZOMBackground[] convertPointerArrayToZOMBackgroundArray(long[] jArr) {
        ZOMBackground[] zOMBackgroundArr = new ZOMBackground[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMBackgroundArr[i11] = (ZOMBackground) getObjectFromPointer(jArr[i11]);
        }
        return zOMBackgroundArr;
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

    private static void updateData(long j11, int i11, int i12, byte[] bArr, byte[] bArr2, int i13, int i14, boolean z11, int i15, long j12, ZOMValue zOMValue, ZOMValue zOMValue2, ZOMValue zOMValue3, ZOMValue zOMValue4, Object[] objArr, ZOMClickEffect zOMClickEffect) {
        ZOMBackground zOMBackground = (ZOMBackground) getObjectFromPointer(j11);
        if (zOMBackground != null) {
            zOMBackground.updateData(i11, i12, bArr, bArr2, i13, i14, z11, i15, (ZOMGradient) __ZOMGradient_zjni.getObjectFromPointer(j12), zOMValue, zOMValue2, zOMValue3, zOMValue4, objArr, zOMClickEffect);
        }
    }
}
