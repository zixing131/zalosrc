package com.zing.zalo.zinstant.zom.node;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMDocument_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMDocument _$create(long j11) {
        ZOMDocument zOMDocument = new ZOMDocument();
        synchronized (__LOCK) {
            _privateStorage.put(zOMDocument, Long.valueOf(j11));
            _privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMDocument));
        }
        return zOMDocument;
    }

    private static native void __onAlertFinish(long j11, int i11, int i12);

    private static native void __onAttach(long j11);

    private static native void __onDetach(long j11);

    private static native void __onFirstViewDrawn(long j11);

    private static native void __onNetworkError(long j11, int i11, int i12, String str);

    private static native void __onNetworkSuccess(long j11, int i11, String str);

    private static native void __onPerformExternalAction(long j11, String str, String str2);

    private static native void __onPlatformReady(long j11);

    private static native void __onProcessActionComplete(long j11, int i11, String str);

    private static native boolean __onRequestResourcesCompleted(long j11);

    private static native void __onScrollStateChanged(long j11, int i11);

    private static native void __performScriptAction(long j11, long j12, long j13, int i11, long j14);

    private static native void __resetNativeObject(long j11);

    private static native void __triggerScriptTimer(long j11);

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

    private static void addPermission(Object obj, int i11, byte[] bArr) {
        ZOMDocument.addPermission(obj, i11, bArr);
    }

    public static ZOMDocument[] convertPointerArrayToZOMDocumentArray(long[] jArr) {
        ZOMDocument[] zOMDocumentArr = new ZOMDocument[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMDocumentArr[i11] = (ZOMDocument) getObjectFromPointer(jArr[i11]);
        }
        return zOMDocumentArr;
    }

    private static Object createPermissions() {
        return ZOMDocument.createPermissions();
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
    public static void onAlertFinish(ZOMDocument zOMDocument, int i11, int i12) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onAlertFinish(pointerFromObject, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onAttach(ZOMDocument zOMDocument) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onAttach(pointerFromObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onDetach(ZOMDocument zOMDocument) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onDetach(pointerFromObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onFirstViewDrawn(ZOMDocument zOMDocument) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onFirstViewDrawn(pointerFromObject);
        }
    }

    private static void onHideLoading(long j11) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.onHideLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onNetworkError(ZOMDocument zOMDocument, int i11, int i12, String str) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onNetworkError(pointerFromObject, i11, i12, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onNetworkSuccess(ZOMDocument zOMDocument, int i11, String str) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onNetworkSuccess(pointerFromObject, i11, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onPerformExternalAction(ZOMDocument zOMDocument, String str, String str2) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onPerformExternalAction(pointerFromObject, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onPlatformReady(ZOMDocument zOMDocument) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onPlatformReady(pointerFromObject);
        }
    }

    private static void onProcessAction(long j11, byte[] bArr, byte[] bArr2, boolean z11, int i11) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.onProcessAction(bArr, bArr2, z11, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onProcessActionComplete(ZOMDocument zOMDocument, int i11, String str) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onProcessActionComplete(pointerFromObject, i11, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean onRequestResourcesCompleted(ZOMDocument zOMDocument) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            return __onRequestResourcesCompleted(pointerFromObject);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onScrollStateChanged(ZOMDocument zOMDocument, int i11) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __onScrollStateChanged(pointerFromObject, i11);
        }
    }

    private static void onShowAlert(long j11, byte[] bArr, byte[] bArr2, Object obj, int i11) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.onShowAlert(bArr, bArr2, obj, i11);
        }
    }

    private static void onShowLoading(long j11) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.onShowLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void performScriptAction(ZOMDocument zOMDocument, long j11, long j12, int i11, long j13) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __performScriptAction(pointerFromObject, j11, j12, i11, j13);
        }
    }

    private static void performScriptActionDelegate(long j11, long j12, long j13, int i11, long j14) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.performScriptActionDelegate(j12, j13, i11, j14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void resetNativeObject(long j11) {
        __resetNativeObject(j11);
    }

    private static void sendDelayedTriggerScriptMessage(long j11, long j12) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.sendDelayedTriggerScriptMessage(j12);
        }
    }

    private static void setData(long j11, byte[] bArr, int i11, long j12, int i12, byte[] bArr2, byte[] bArr3, byte[] bArr4, ZOMGlobalConfig zOMGlobalConfig, Object[] objArr, long j13, boolean z11, Object[] objArr2, Object[] objArr3, boolean z12, int i13, int i14, Object obj, int i15, float f11, float f12, int i16, int i17, float f13, int i18, byte[] bArr5, byte[] bArr6) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.setData(bArr, i11, (ZOM) __ZOM_zjni.getObjectFromPointer(j12), i12, bArr2, bArr3, bArr4, zOMGlobalConfig, objArr, (ZOMFontFace) __ZOMFontFace_zjni.getObjectFromPointer(j13), z11, objArr2, objArr3, z12, i13, i14, obj, i15, f11, f12, i16, i17, f13, i18, bArr5, bArr6);
        }
    }

    private static void setNativePointer(long j11, long j12) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.setNativePointer(j12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void triggerScriptTimer(ZOMDocument zOMDocument) {
        long pointerFromObject = getPointerFromObject(zOMDocument);
        if (pointerFromObject != 0) {
            __triggerScriptTimer(pointerFromObject);
        }
    }

    private static void updateData(long j11, byte[] bArr, ZOMGlobalConfig zOMGlobalConfig, int i11, boolean z11, int i12, float f11, float f12, int i13, int i14, float f13, int i15, byte[] bArr2) {
        ZOMDocument zOMDocument = (ZOMDocument) getObjectFromPointer(j11);
        if (zOMDocument != null) {
            zOMDocument.updateData(bArr, zOMGlobalConfig, i11, z11, i12, f11, f12, i13, i14, f13, i15, bArr2);
        }
    }
}
