package androidx.core.content.res;

import java.lang.reflect.Array;

/* renamed from: androidx.core.content.res.g */
/* loaded from: classes2.dex */
abstract class AbstractC1400g {
    /* renamed from: a */
    public static int[] m7074a(int[] iArr, int i11, int i12) {
        if (i11 + 1 > iArr.length) {
            int[] iArr2 = new int[m7076c(i11)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            iArr = iArr2;
        }
        iArr[i11] = i12;
        return iArr;
    }

    /* renamed from: b */
    public static Object[] m7075b(Object[] objArr, int i11, Object obj) {
        if (i11 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m7076c(i11));
            System.arraycopy(objArr, 0, objArr2, 0, i11);
            objArr = objArr2;
        }
        objArr[i11] = obj;
        return objArr;
    }

    /* renamed from: c */
    public static int m7076c(int i11) {
        if (i11 <= 4) {
            return 8;
        }
        return i11 * 2;
    }
}
