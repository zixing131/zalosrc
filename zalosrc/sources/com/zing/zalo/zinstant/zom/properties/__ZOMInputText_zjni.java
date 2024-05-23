package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.node.ZOMText;
import com.zing.zalo.zinstant.zom.node.__ZOM_zjni;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMInputText_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMInputText _$create(long j11) {
        ZOMInputText zOMInputText = new ZOMInputText();
        synchronized (__LOCK) {
            _privateStorage.put(zOMInputText, Long.valueOf(j11));
            _privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMInputText));
        }
        return zOMInputText;
    }

    private static native void __afterTextChanged(long j11, String str);

    private static native byte[] __maskedInput(long j11, String str, String str2, int i11);

    private static native void __onFocusChange(long j11, boolean z11);

    private static native void __onTextChanged(long j11, String str);

    private static native byte[] __unMaskInput(long j11, String str, String str2);

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

    public static void afterTextChanged(ZOMInputText zOMInputText, String str) {
        long pointerFromObject = getPointerFromObject(zOMInputText);
        if (pointerFromObject != 0) {
            __afterTextChanged(pointerFromObject, str);
        }
    }

    public static ZOMInputText[] convertPointerArrayToZOMInputTextArray(long[] jArr) {
        ZOMInputText[] zOMInputTextArr = new ZOMInputText[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMInputTextArr[i11] = (ZOMInputText) getObjectFromPointer(jArr[i11]);
        }
        return zOMInputTextArr;
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

    public static byte[] maskedInput(ZOMInputText zOMInputText, String str, String str2, int i11) {
        long pointerFromObject = getPointerFromObject(zOMInputText);
        if (pointerFromObject != 0) {
            return __maskedInput(pointerFromObject, str, str2, i11);
        }
        return null;
    }

    public static void onFocusChange(ZOMInputText zOMInputText, boolean z11) {
        long pointerFromObject = getPointerFromObject(zOMInputText);
        if (pointerFromObject != 0) {
            __onFocusChange(pointerFromObject, z11);
        }
    }

    public static void onTextChanged(ZOMInputText zOMInputText, String str) {
        long pointerFromObject = getPointerFromObject(zOMInputText);
        if (pointerFromObject != 0) {
            __onTextChanged(pointerFromObject, str);
        }
    }

    private static void setData(long j11, long j12, long j13, byte[] bArr, boolean z11, int i11) {
        ZOMInputText zOMInputText = (ZOMInputText) getObjectFromPointer(j11);
        if (zOMInputText != null) {
            zOMInputText.setData((ZOMText) __ZOM_zjni.getObjectFromPointer(j12), (ZOMText) __ZOM_zjni.getObjectFromPointer(j13), bArr, z11, i11);
        }
    }

    public static byte[] unMaskInput(ZOMInputText zOMInputText, String str, String str2) {
        long pointerFromObject = getPointerFromObject(zOMInputText);
        if (pointerFromObject != 0) {
            return __unMaskInput(pointerFromObject, str, str2);
        }
        return null;
    }
}
