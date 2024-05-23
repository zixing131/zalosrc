package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMFloat;
import com.zing.zalo.zinstant.zom.properties.ZOMInt;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.__ZOMTransform_zjni;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMKeyframesStyles_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMKeyframesStyles _$create() {
        return new ZOMKeyframesStyles();
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

    public static ZOMKeyframesStyles[] convertPointerArrayToZOMKeyframesStylesArray(long[] jArr) {
        ZOMKeyframesStyles[] zOMKeyframesStylesArr = new ZOMKeyframesStyles[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMKeyframesStylesArr[i11] = (ZOMKeyframesStyles) getObjectFromPointer(jArr[i11]);
        }
        return zOMKeyframesStylesArr;
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

    private static void setData(ZOMKeyframesStyles zOMKeyframesStyles, ZOMInt zOMInt, ZOMInt zOMInt2, ZOMInt zOMInt3, ZOMFloat zOMFloat, long j11) {
        if (zOMKeyframesStyles != null) {
            zOMKeyframesStyles.setData(zOMInt, zOMInt2, zOMInt3, zOMFloat, (ZOMTransform) __ZOMTransform_zjni.getObjectFromPointer(j11));
        }
    }
}
