package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
/* loaded from: classes.dex */
public abstract class AbstractC5372f7 {
    /* renamed from: a */
    public static int m29135a(int i11, int i12, String str) {
        String m29185a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m29185a = AbstractC5406h7.m29185a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m29185a = AbstractC5406h7.m29185a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m29185a);
    }

    /* renamed from: b */
    public static int m29136b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m29138d(i11, i12, "index"));
    }

    /* renamed from: c */
    public static void m29137c(int i11, int i12, int i13) {
        String m29138d;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m29138d = AbstractC5406h7.m29185a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m29138d = m29138d(i12, i13, "end index");
            }
        } else {
            m29138d = m29138d(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m29138d);
    }

    /* renamed from: d */
    private static String m29138d(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC5406h7.m29185a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC5406h7.m29185a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
