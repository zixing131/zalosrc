package p012a6;

/* renamed from: a6.b */
/* loaded from: classes.dex */
public abstract class AbstractC0163b {
    /* renamed from: a */
    public static int m617a(int i11, int i12, String str) {
        String m624a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m624a = AbstractC0182c.m624a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m624a = AbstractC0182c.m624a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m624a);
    }

    /* renamed from: b */
    public static int m618b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m621e(i11, i12, "index"));
    }

    /* renamed from: c */
    public static void m619c(int i11, int i12, int i13) {
        String m621e;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m621e = AbstractC0182c.m624a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m621e = m621e(i12, i13, "end index");
            }
        } else {
            m621e = m621e(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m621e);
    }

    /* renamed from: d */
    public static void m620d(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: e */
    private static String m621e(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC0182c.m624a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC0182c.m624a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
