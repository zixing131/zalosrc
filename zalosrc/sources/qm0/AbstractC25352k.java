package qm0;

import fn0.AbstractC19074t;
import java.lang.reflect.Array;

/* renamed from: qm0.k */
/* loaded from: classes.dex */
abstract class AbstractC25352k {
    /* renamed from: a */
    public static final Object[] m131317a(Object[] objArr, int i11) {
        AbstractC19074t.m100208f(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i11);
        AbstractC19074t.m100206d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    /* renamed from: b */
    public static final void m131318b(int i11, int i12) {
        if (i11 <= i12) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + i12 + ").");
    }
}
