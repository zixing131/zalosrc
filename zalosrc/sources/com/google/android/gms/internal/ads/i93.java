package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class i93 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m23144a(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m23145b(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            m23144a(objArr[i12], i12);
        }
        return objArr;
    }
}
