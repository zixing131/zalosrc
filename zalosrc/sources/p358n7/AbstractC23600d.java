package p358n7;

/* renamed from: n7.d */
/* loaded from: classes3.dex */
public abstract class AbstractC23600d {
    /* renamed from: a */
    private static String m123730a(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC23601e.m123742a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC23601e.m123742a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    /* renamed from: b */
    private static String m123731b(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC23601e.m123742a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC23601e.m123742a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    /* renamed from: c */
    private static String m123732c(int i11, int i12, int i13) {
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                return AbstractC23601e.m123742a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            return m123731b(i12, i13, "end index");
        }
        return m123731b(i11, i13, "start index");
    }

    /* renamed from: d */
    public static void m123733d(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: e */
    public static int m123734e(int i11, int i12) {
        return m123735f(i11, i12, "index");
    }

    /* renamed from: f */
    public static int m123735f(int i11, int i12, String str) {
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m123730a(i11, i12, str));
    }

    /* renamed from: g */
    public static Object m123736g(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: h */
    public static int m123737h(int i11, int i12) {
        return m123738i(i11, i12, "index");
    }

    /* renamed from: i */
    public static int m123738i(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m123731b(i11, i12, str));
    }

    /* renamed from: j */
    public static void m123739j(int i11, int i12, int i13) {
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
        } else {
            throw new IndexOutOfBoundsException(m123732c(i11, i12, i13));
        }
    }

    /* renamed from: k */
    public static void m123740k(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: l */
    public static void m123741l(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
