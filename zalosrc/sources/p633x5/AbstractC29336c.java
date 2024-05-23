package p633x5;

/* renamed from: x5.c */
/* loaded from: classes.dex */
public abstract class AbstractC29336c {
    /* renamed from: a */
    public static int m146471a(int i11, int i12, String str) {
        String m146476a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m146476a = AbstractC29338d.m146476a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m146476a = AbstractC29338d.m146476a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m146476a);
    }

    /* renamed from: b */
    public static int m146472b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m146474d(i11, i12, "index"));
    }

    /* renamed from: c */
    public static void m146473c(int i11, int i12, int i13) {
        String m146474d;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m146474d = AbstractC29338d.m146476a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m146474d = m146474d(i12, i13, "end index");
            }
        } else {
            m146474d = m146474d(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m146474d);
    }

    /* renamed from: d */
    private static String m146474d(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC29338d.m146476a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC29338d.m146476a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
