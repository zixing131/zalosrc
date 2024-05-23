package com.zing.zalo.zinstant.utils;

import com.zing.zalo.zinstant.zom.model.ExternalScriptData;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import com.zing.zalo.zinstant.zom.node.__ZOMDocument_zjni;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ScriptHelperImpl_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

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

    public static ScriptHelperImpl[] convertPointerArrayToScriptHelperImplArray(long[] jArr) {
        ScriptHelperImpl[] scriptHelperImplArr = new ScriptHelperImpl[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            scriptHelperImplArr[i11] = (ScriptHelperImpl) getObjectFromPointer(jArr[i11]);
        }
        return scriptHelperImplArr;
    }

    private static void deleteScriptCacheFile(ExternalScriptData externalScriptData) {
        ScriptHelperImpl.deleteScriptCacheFile(externalScriptData);
    }

    private static void deleteValueForKey(Object obj) {
        ScriptHelperImpl.deleteValueForKey(obj);
    }

    private static void downloadScripts(Object obj) {
        ScriptHelperImpl.downloadScripts(obj);
    }

    private static void get(long j11, Object obj, Object obj2, Object obj3, int i11) {
        ScriptHelperImpl.get((ZOMDocument) __ZOMDocument_zjni.getObjectFromPointer(j11), obj, obj2, obj3, i11);
    }

    private static int getAndroidVersionCode() {
        return ScriptHelperImpl.getAndroidVersionCode();
    }

    private static boolean getBoolean(Object obj, boolean z11) {
        return ScriptHelperImpl.getBoolean(obj, z11);
    }

    private static int getDeviceHeight() {
        return ScriptHelperImpl.getDeviceHeight();
    }

    private static int getDeviceWidth() {
        return ScriptHelperImpl.getDeviceWidth();
    }

    private static Object getEncryptedScriptContent(Object obj) {
        return ScriptHelperImpl.getEncryptedScriptContent(obj);
    }

    private static long getLong(Object obj, long j11) {
        return ScriptHelperImpl.getLong(obj, j11);
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

    private static String getScriptContent(Object obj) {
        return ScriptHelperImpl.getScriptContent(obj);
    }

    private static String getString(Object obj, Object obj2) {
        return ScriptHelperImpl.getString(obj, obj2);
    }

    private static boolean objectExistsForKey(Object obj) {
        return ScriptHelperImpl.objectExistsForKey(obj);
    }

    private static void onScriptError(Object obj) {
        ScriptHelperImpl.onScriptError(obj);
    }

    private static void post(long j11, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        ScriptHelperImpl.post((ZOMDocument) __ZOMDocument_zjni.getObjectFromPointer(j11), obj, obj2, obj3, obj4, i11);
    }

    private static void requestSocket(long j11, int i11, int i12, int i13, Object obj, int i14) {
        ScriptHelperImpl.requestSocket((ZOMDocument) __ZOMDocument_zjni.getObjectFromPointer(j11), i11, i12, i13, obj, i14);
    }

    private static void setBoolean(Object obj, boolean z11) {
        ScriptHelperImpl.setBoolean(obj, z11);
    }

    private static void setLong(Object obj, long j11) {
        ScriptHelperImpl.setLong(obj, j11);
    }

    private static void setString(Object obj, Object obj2) {
        ScriptHelperImpl.setString(obj, obj2);
    }

    private static void showToast(Object obj) {
        ScriptHelperImpl.showToast(obj);
    }
}
