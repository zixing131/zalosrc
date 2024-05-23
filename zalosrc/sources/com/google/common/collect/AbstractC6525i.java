package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.common.collect.i */
/* loaded from: classes3.dex */
abstract class AbstractC6525i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object[] m33444a(Object[] objArr, int i11, int i12, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i11, i12, objArr2.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m33445b(Object[] objArr, int i11) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11);
    }
}
