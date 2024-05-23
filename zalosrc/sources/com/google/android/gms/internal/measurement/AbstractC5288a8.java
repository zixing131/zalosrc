package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a8 */
/* loaded from: classes.dex */
public abstract class AbstractC5288a8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m28880a(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m28881b(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            m28880a(objArr[i12], i12);
        }
        return objArr;
    }
}
