package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMAnchor;
import com.zing.zalo.zinstant.zom.properties.ZOMAnimation;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMBorder;
import com.zing.zalo.zinstant.zom.properties.ZOMBoxShadow;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMGlowingAnimation;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransition;
import com.zing.zalo.zinstant.zom.properties.__ZOMBackground_zjni;
import com.zing.zalo.zinstant.zom.properties.__ZOMTransform_zjni;
import com.zing.zalo.zinstant.zom.properties.__ZOMTransition_zjni;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOM_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOM _$create(long j11) {
        ZOM zom = new ZOM();
        synchronized (__LOCK) {
            _privateStorage.put(zom, Long.valueOf(j11));
            _privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zom));
        }
        return zom;
    }

    private static ZOM[] _$create_array(int i11) {
        return new ZOM[i11];
    }

    private static void _$set_element(ZOM[] zomArr, long j11, int i11) {
        zomArr[i11] = (ZOM) getObjectFromPointer(j11);
    }

    private static native void __nativeCallbackIntersectClientView(long j11, int i11, int[] iArr);

    private static native void __onClick(long j11);

    private static native void __onScrollStateChanged(long j11, int i11);

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

    public static ZOM[] convertPointerArrayToZOMArray(long[] jArr) {
        ZOM[] zomArr = new ZOM[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zomArr[i11] = (ZOM) getObjectFromPointer(jArr[i11]);
        }
        return zomArr;
    }

    private static void getIntersectClientView(long j11, int i11) {
        ZOM zom = (ZOM) getObjectFromPointer(j11);
        if (zom != null) {
            zom.getIntersectClientView(i11);
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void nativeCallbackIntersectClientView(ZOM zom, int i11, int[] iArr) {
        long pointerFromObject = getPointerFromObject(zom);
        if (pointerFromObject != 0) {
            __nativeCallbackIntersectClientView(pointerFromObject, i11, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onClick(ZOM zom) {
        long pointerFromObject = getPointerFromObject(zom);
        if (pointerFromObject != 0) {
            __onClick(pointerFromObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onScrollStateChanged(ZOM zom, int i11) {
        long pointerFromObject = getPointerFromObject(zom);
        if (pointerFromObject != 0) {
            __onScrollStateChanged(pointerFromObject, i11);
        }
    }

    private static void requestFocus(long j11) {
        ZOM zom = (ZOM) getObjectFromPointer(j11);
        if (zom != null) {
            zom.requestFocus();
        }
    }

    private static void setBaseData(long j11, int i11, byte[] bArr, ZOMBorder zOMBorder, long j12, ZOMClick zOMClick, ZOMClick zOMClick2, int i12, int i13, Object[] objArr, byte[] bArr2, ZOMInsight zOMInsight, boolean z11, ZOMBoxShadow zOMBoxShadow, ZOMGlowingAnimation zOMGlowingAnimation, byte[] bArr3, ZOMAnchor zOMAnchor, int i14, float f11, long j13, long j14, ZOMAnimation zOMAnimation) {
        ZOM zom = (ZOM) getObjectFromPointer(j11);
        if (zom != null) {
            zom.setBaseData(i11, bArr, zOMBorder, (ZOMBackground) __ZOMBackground_zjni.getObjectFromPointer(j12), zOMClick, zOMClick2, i12, i13, objArr, bArr2, zOMInsight, z11, zOMBoxShadow, zOMGlowingAnimation, bArr3, zOMAnchor, i14, f11, (ZOMTransform) __ZOMTransform_zjni.getObjectFromPointer(j13), (ZOMTransition) __ZOMTransition_zjni.getObjectFromPointer(j14), zOMAnimation);
        }
    }

    private static void updateBaseData(long j11, int i11, int i12, int i13, ZOMRect zOMRect, int i14, ZOMRect zOMRect2, ZOMRect zOMRect3, ZOMRect zOMRect4) {
        ZOM zom = (ZOM) getObjectFromPointer(j11);
        if (zom != null) {
            zom.updateBaseData(i11, i12, i13, zOMRect, i14, zOMRect2, zOMRect3, zOMRect4);
        }
    }

    private static void updateRelativeVisibility(long j11, int i11) {
        ZOM zom = (ZOM) getObjectFromPointer(j11);
        if (zom != null) {
            zom.updateRelativeVisibility(i11);
        }
    }
}
