package me0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: me0.o */
/* loaded from: classes4.dex */
public abstract class AbstractC23159o {
    /* renamed from: a */
    public static Object[] m119177a(Object[] objArr, Object[] objArr2) {
        Object[] m119178b = m119178b(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, m119178b, objArr.length, objArr2.length);
        return m119178b;
    }

    /* renamed from: b */
    public static Object[] m119178b(Object[] objArr, int i11) {
        return m119179c(objArr, i11, objArr.getClass());
    }

    /* renamed from: c */
    public static Object[] m119179c(Object[] objArr, int i11, Class cls) {
        Object[] objArr2;
        if (cls == Object[].class) {
            objArr2 = new Object[i11];
        } else {
            objArr2 = (Object[]) Array.newInstance(cls.getComponentType(), i11);
        }
        System.arraycopy(objArr, 0, objArr2, 0, Math.min(objArr.length, i11));
        return objArr2;
    }

    /* renamed from: d */
    public static List m119180d(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
