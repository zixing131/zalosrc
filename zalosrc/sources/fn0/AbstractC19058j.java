package fn0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: fn0.j */
/* loaded from: classes7.dex */
public abstract class AbstractC19058j {

    /* renamed from: a */
    private static final Object[] f94940a = new Object[0];

    /* renamed from: a */
    public static final Object[] m100166a(Collection collection) {
        AbstractC19074t.m100208f(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    objArr[i11] = it.next();
                    if (i12 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i13 = ((i12 * 3) + 1) >>> 1;
                        if (i13 <= i12) {
                            i13 = 2147483645;
                            if (i12 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i13);
                        AbstractC19074t.m100207e(objArr, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i12);
                        AbstractC19074t.m100207e(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i11 = i12;
                }
            }
        }
        return f94940a;
    }

    /* renamed from: b */
    public static final Object[] m100167b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        AbstractC19074t.m100208f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i11 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC19074t.m100206d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i12 = i11 + 1;
            objArr2[i11] = it.next();
            if (i12 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i13 = ((i12 * 3) + 1) >>> 1;
                if (i13 <= i12) {
                    i13 = 2147483645;
                    if (i12 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i13);
                AbstractC19074t.m100207e(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i12] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i12);
                AbstractC19074t.m100207e(copyOf, "copyOf(...)");
                return copyOf;
            }
            i11 = i12;
        }
    }
}
