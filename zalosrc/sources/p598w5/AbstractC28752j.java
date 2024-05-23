package p598w5;

/* renamed from: w5.j */
/* loaded from: classes2.dex */
public abstract class AbstractC28752j {
    /* renamed from: a */
    public static int m143882a(int i11, int i12, String str) {
        String m143886a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m143886a = AbstractC28753k.m143886a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m143886a = AbstractC28753k.m143886a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m143886a);
    }

    /* renamed from: b */
    public static int m143883b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m143885d(i11, i12, "index"));
    }

    /* renamed from: c */
    public static void m143884c(int i11, int i12, int i13) {
        String m143885d;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m143885d = AbstractC28753k.m143886a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m143885d = m143885d(i12, i13, "end index");
            }
        } else {
            m143885d = m143885d(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m143885d);
    }

    /* renamed from: d */
    private static String m143885d(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC28753k.m143886a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC28753k.m143886a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
