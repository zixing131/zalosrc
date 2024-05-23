package rm0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: rm0.c */
/* loaded from: classes.dex */
public abstract class AbstractC25837c {
    /* renamed from: d */
    public static final Object[] m133228d(int i11) {
        if (i11 >= 0) {
            return new Object[i11];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: e */
    public static final Object[] m133229e(Object[] objArr, int i11) {
        AbstractC19074t.m100208f(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i11);
        AbstractC19074t.m100207e(copyOf, "copyOf(...)");
        return copyOf;
    }

    /* renamed from: f */
    public static final void m133230f(Object[] objArr, int i11) {
        AbstractC19074t.m100208f(objArr, "<this>");
        objArr[i11] = null;
    }

    /* renamed from: g */
    public static final void m133231g(Object[] objArr, int i11, int i12) {
        AbstractC19074t.m100208f(objArr, "<this>");
        while (i11 < i12) {
            m133230f(objArr, i11);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m133232h(Object[] objArr, int i11, int i12, List list) {
        if (i12 != list.size()) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC19074t.m100204b(objArr[i11 + i13], list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final int m133233i(Object[] objArr, int i11, int i12) {
        int i13;
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            Object obj = objArr[i11 + i15];
            int i16 = i14 * 31;
            if (obj != null) {
                i13 = obj.hashCode();
            } else {
                i13 = 0;
            }
            i14 = i16 + i13;
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final String m133234j(Object[] objArr, int i11, int i12, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i11 + i13];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }
}
