package p670y5;

/* renamed from: y5.p */
/* loaded from: classes.dex */
public abstract class AbstractC30582p {
    /* renamed from: a */
    public static int m149598a(int i11, int i12, String str) {
        String m149610a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m149610a = AbstractC30601q.m149610a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m149610a = AbstractC30601q.m149610a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m149610a);
    }

    /* renamed from: b */
    public static int m149599b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m149602e(i11, i12, "index"));
    }

    /* renamed from: c */
    public static void m149600c(int i11, int i12, int i13) {
        String m149602e;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m149602e = AbstractC30601q.m149610a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m149602e = m149602e(i12, i13, "end index");
            }
        } else {
            m149602e = m149602e(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m149602e);
    }

    /* renamed from: d */
    public static void m149601d(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: e */
    private static String m149602e(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC30601q.m149610a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC30601q.m149610a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
