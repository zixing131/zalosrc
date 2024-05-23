package com.google.common.collect;

/* renamed from: com.google.common.collect.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6524h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m33440a(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m33441b(Object... objArr) {
        return m33442c(objArr, objArr.length);
    }

    /* renamed from: c */
    static Object[] m33442c(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            m33440a(objArr[i12], i12);
        }
        return objArr;
    }

    /* renamed from: d */
    public static Object[] m33443d(Object[] objArr, int i11) {
        return AbstractC6525i.m33445b(objArr, i11);
    }
}
