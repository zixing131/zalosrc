package com.zing.zalo.zinstant.zom.properties;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMTransition_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMTransition _$create(long j11) {
        ZOMTransition zOMTransition = new ZOMTransition();
        synchronized (__LOCK) {
            _privateStorage.put(zOMTransition, Long.valueOf(j11));
            _privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMTransition));
        }
        return zOMTransition;
    }

    private static native void __onAnimationCancel(long j11, int i11);

    private static native void __onAnimationEnd(long j11, int i11);

    private static native void __onAnimationRun(long j11, int i11);

    private static native void __onAnimationStart(long j11, int i11);

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

    public static ZOMTransition[] convertPointerArrayToZOMTransitionArray(long[] jArr) {
        ZOMTransition[] zOMTransitionArr = new ZOMTransition[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMTransitionArr[i11] = (ZOMTransition) getObjectFromPointer(jArr[i11]);
        }
        return zOMTransitionArr;
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

    public static void onAnimationCancel(ZOMTransition zOMTransition, int i11) {
        long pointerFromObject = getPointerFromObject(zOMTransition);
        if (pointerFromObject != 0) {
            __onAnimationCancel(pointerFromObject, i11);
        }
    }

    public static void onAnimationEnd(ZOMTransition zOMTransition, int i11) {
        long pointerFromObject = getPointerFromObject(zOMTransition);
        if (pointerFromObject != 0) {
            __onAnimationEnd(pointerFromObject, i11);
        }
    }

    public static void onAnimationRun(ZOMTransition zOMTransition, int i11) {
        long pointerFromObject = getPointerFromObject(zOMTransition);
        if (pointerFromObject != 0) {
            __onAnimationRun(pointerFromObject, i11);
        }
    }

    public static void onAnimationStart(ZOMTransition zOMTransition, int i11) {
        long pointerFromObject = getPointerFromObject(zOMTransition);
        if (pointerFromObject != 0) {
            __onAnimationStart(pointerFromObject, i11);
        }
    }

    private static void setData(long j11, Object[] objArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        ZOMTransition zOMTransition = (ZOMTransition) getObjectFromPointer(j11);
        if (zOMTransition != null) {
            zOMTransition.setData(objArr, z11, z12, z13, z14, z15);
        }
    }
}
