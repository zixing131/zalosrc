package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.a5 */
/* loaded from: classes2.dex */
public abstract class AbstractC5727a5 {
    /* renamed from: a */
    public static int m30166a(int i11, int i12, String str) {
        String m30181a;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m30181a = AbstractC5734b5.m30181a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m30181a = AbstractC5734b5.m30181a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m30181a);
    }

    /* renamed from: b */
    public static int m30167b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m30170e(i11, i12, "index"));
    }

    /* renamed from: c */
    public static Object m30168c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static void m30169d(int i11, int i12, int i13) {
        String m30170e;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m30170e = AbstractC5734b5.m30181a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m30170e = m30170e(i12, i13, "end index");
            }
        } else {
            m30170e = m30170e(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m30170e);
    }

    /* renamed from: e */
    private static String m30170e(int i11, int i12, String str) {
        if (i11 < 0) {
            return AbstractC5734b5.m30181a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return AbstractC5734b5.m30181a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
