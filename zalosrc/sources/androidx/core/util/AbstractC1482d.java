package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.d */
/* loaded from: classes.dex */
public abstract class AbstractC1482d {

    /* renamed from: androidx.core.util.d$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static boolean m7480a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m7481b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m7475a(Object obj, Object obj2) {
        return a.m7480a(obj, obj2);
    }

    /* renamed from: b */
    public static int m7476b(Object... objArr) {
        return a.m7481b(objArr);
    }

    /* renamed from: c */
    public static Object m7477c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: d */
    public static Object m7478d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static String m7479e(Object obj, String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }
}
