package p705z5;

/* renamed from: z5.f4 */
/* loaded from: classes.dex */
public abstract class AbstractC31370f4 {
    /* renamed from: a */
    public static int m152224a(int i11, int i12, String str) {
        String m152238a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m152238a = AbstractC31385g5.m152238a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m152238a = AbstractC31385g5.m152238a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m152238a);
    }

    /* renamed from: b */
    public static int m152225b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m152227d(i11, i12, "index"));
    }

    /* renamed from: c */
    public static void m152226c(int i11, int i12, int i13) {
        String m152227d;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m152227d = AbstractC31385g5.m152238a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m152227d = m152227d(i12, i13, "end index");
            }
        } else {
            m152227d = m152227d(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m152227d);
    }

    /* renamed from: d */
    private static String m152227d(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC31385g5.m152238a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC31385g5.m152238a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
