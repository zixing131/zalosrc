package com.zing.zalo.zinstant.zom.text;

import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import com.zing.zalo.zinstant.zom.properties.__ZOMBackground_zjni;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class __ZOMTextSpan_zjni {
    protected static WeakHashMap<Object, Long> _privateStorage = new WeakHashMap<>();
    protected static HashMap<Long, WeakReference<Object>> _privateStorageInverse = new HashMap<>();
    protected static final Object __LOCK = new Object();

    private static ZOMTextSpan _$create(long j11) {
        ZOMTextSpan zOMTextSpan = new ZOMTextSpan();
        synchronized (__LOCK) {
            _privateStorage.put(zOMTextSpan, Long.valueOf(j11));
            _privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMTextSpan));
        }
        return zOMTextSpan;
    }

    private static ZOMTextSpan[] _$create_array(int i11) {
        return new ZOMTextSpan[i11];
    }

    private static void _$set_element(ZOMTextSpan[] zOMTextSpanArr, long j11, int i11) {
        zOMTextSpanArr[i11] = (ZOMTextSpan) getObjectFromPointer(j11);
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

    public static ZOMTextSpan[] convertPointerArrayToZOMTextSpanArray(long[] jArr) {
        ZOMTextSpan[] zOMTextSpanArr = new ZOMTextSpan[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMTextSpanArr[i11] = (ZOMTextSpan) getObjectFromPointer(jArr[i11]);
        }
        return zOMTextSpanArr;
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

    private static void setData(long j11, byte[] bArr, byte[] bArr2, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, long j12, ZOMClick zOMClick, ZOMClick zOMClick2, ZOMConditionParam zOMConditionParam, boolean z14, boolean z15, boolean z16, float f11, byte[] bArr3, byte[] bArr4, long j13, float f12, float f13) {
        ZOMTextSpan zOMTextSpan = (ZOMTextSpan) getObjectFromPointer(j11);
        if (zOMTextSpan != null) {
            zOMTextSpan.setData(bArr, bArr2, i11, z11, z12, z13, i12, i13, (ZOMBackground) __ZOMBackground_zjni.getObjectFromPointer(j12), zOMClick, zOMClick2, zOMConditionParam, z14, z15, z16, f11, bArr3, bArr4, j13, f12, f13);
        }
    }

    private static void setDeleted(long j11) {
        ZOMTextSpan zOMTextSpan = (ZOMTextSpan) getObjectFromPointer(j11);
        if (zOMTextSpan != null) {
            zOMTextSpan.setDeleted();
        }
    }
}
