package qm0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: qm0.m */
/* loaded from: classes.dex */
public abstract class AbstractC25356m extends AbstractC25354l {
    /* renamed from: c */
    public static List m131320c(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        List m131396a = AbstractC25360o.m131396a(objArr);
        AbstractC19074t.m100207e(m131396a, "asList(...)");
        return m131396a;
    }

    /* renamed from: d */
    public static byte[] m131321d(byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(bArr, "<this>");
        AbstractC19074t.m100208f(bArr2, "destination");
        System.arraycopy(bArr, i12, bArr2, i11, i13 - i12);
        return bArr2;
    }

    /* renamed from: e */
    public static final float[] m131322e(float[] fArr, float[] fArr2, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(fArr, "<this>");
        AbstractC19074t.m100208f(fArr2, "destination");
        System.arraycopy(fArr, i12, fArr2, i11, i13 - i12);
        return fArr2;
    }

    /* renamed from: f */
    public static Object[] m131323f(Object[] objArr, Object[] objArr2, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(objArr2, "destination");
        System.arraycopy(objArr, i12, objArr2, i11, i13 - i12);
        return objArr2;
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m131324g(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        byte[] m131321d;
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = bArr.length;
        }
        m131321d = m131321d(bArr, bArr2, i11, i12, i13);
        return m131321d;
    }

    /* renamed from: h */
    public static /* synthetic */ float[] m131325h(float[] fArr, float[] fArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = fArr.length;
        }
        return m131322e(fArr, fArr2, i11, i12, i13);
    }

    /* renamed from: i */
    public static /* synthetic */ Object[] m131326i(Object[] objArr, Object[] objArr2, int i11, int i12, int i13, int i14, Object obj) {
        Object[] m131323f;
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = objArr.length;
        }
        m131323f = m131323f(objArr, objArr2, i11, i12, i13);
        return m131323f;
    }

    /* renamed from: j */
    public static byte[] m131327j(byte[] bArr, int i11, int i12) {
        AbstractC19074t.m100208f(bArr, "<this>");
        AbstractC25352k.m131318b(i12, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        AbstractC19074t.m100207e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* renamed from: k */
    public static Object[] m131328k(Object[] objArr, int i11, int i12) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC25352k.m131318b(i12, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i11, i12);
        AbstractC19074t.m100207e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* renamed from: l */
    public static void m131329l(int[] iArr, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(iArr, "<this>");
        Arrays.fill(iArr, i12, i13, i11);
    }

    /* renamed from: m */
    public static final void m131330m(Object[] objArr, Object obj, int i11, int i12) {
        AbstractC19074t.m100208f(objArr, "<this>");
        Arrays.fill(objArr, i11, i12, obj);
    }

    /* renamed from: n */
    public static /* synthetic */ void m131331n(Object[] objArr, Object obj, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = objArr.length;
        }
        m131330m(objArr, obj, i11, i12);
    }

    /* renamed from: o */
    public static byte[] m131332o(byte[] bArr, byte[] bArr2) {
        AbstractC19074t.m100208f(bArr, "<this>");
        AbstractC19074t.m100208f(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        AbstractC19074t.m100205c(copyOf);
        return copyOf;
    }

    /* renamed from: p */
    public static Object[] m131333p(Object[] objArr, Object obj) {
        AbstractC19074t.m100208f(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        AbstractC19074t.m100205c(copyOf);
        return copyOf;
    }

    /* renamed from: q */
    public static Object[] m131334q(Object[] objArr, Object[] objArr2) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        AbstractC19074t.m100205c(copyOf);
        return copyOf;
    }

    /* renamed from: r */
    public static final void m131335r(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* renamed from: s */
    public static void m131336s(Object[] objArr, Comparator comparator) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
