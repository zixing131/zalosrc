package p568v5;

/* renamed from: v5.o */
/* loaded from: classes2.dex */
public abstract class AbstractC27544o {
    /* renamed from: a */
    public static int m140747a(int i11, int i12, String str) {
        String m140751a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            m140751a = AbstractC27545p.m140751a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m140751a = AbstractC27545p.m140751a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m140751a);
    }

    /* renamed from: b */
    public static int m140748b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m140750d(i11, i12, "index"));
    }

    /* renamed from: c */
    public static void m140749c(int i11, int i12, int i13) {
        String m140750d;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m140750d = AbstractC27545p.m140751a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m140750d = m140750d(i12, i13, "end index");
            }
        } else {
            m140750d = m140750d(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m140750d);
    }

    /* renamed from: d */
    private static String m140750d(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC27545p.m140751a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC27545p.m140751a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }
}
