package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class j53 {
    /* renamed from: a */
    public static int m23531a(int i11, int i12, String str) {
        String m28436b;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 >= 0) {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            m28436b = z53.m28436b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            m28436b = z53.m28436b("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m28436b);
    }

    /* renamed from: b */
    public static int m23532b(int i11, int i12, String str) {
        if (i11 >= 0 && i11 <= i12) {
            return i11;
        }
        throw new IndexOutOfBoundsException(m23540j(i11, i12, "index"));
    }

    /* renamed from: c */
    public static Object m23533c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static Object m23534d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(z53.m28436b(str, obj2));
    }

    /* renamed from: e */
    public static void m23535e(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m23536f(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: g */
    public static void m23537g(int i11, int i12, int i13) {
        String m23540j;
        if (i11 >= 0 && i12 >= i11 && i12 <= i13) {
            return;
        }
        if (i11 >= 0 && i11 <= i13) {
            if (i12 >= 0 && i12 <= i13) {
                m23540j = z53.m28436b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                m23540j = m23540j(i12, i13, "end index");
            }
        } else {
            m23540j = m23540j(i11, i13, "start index");
        }
        throw new IndexOutOfBoundsException(m23540j);
    }

    /* renamed from: h */
    public static void m23538h(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: i */
    public static void m23539i(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: j */
    private static String m23540j(int i11, int i12, String str) {
        if (i11 < 0) {
            return z53.m28436b("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return z53.m28436b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
