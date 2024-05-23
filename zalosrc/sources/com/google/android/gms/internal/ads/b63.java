package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class b63 {

    /* renamed from: a */
    private static final Object f17630a;

    /* renamed from: b */
    private static final Method f17631b;

    /* renamed from: c */
    private static final Method f17632c;

    static {
        Method m20415c;
        Object m20414b = m20414b();
        f17630a = m20414b;
        Method method = null;
        if (m20414b == null) {
            m20415c = null;
        } else {
            m20415c = m20415c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f17631b = m20415c;
        if (m20414b != null) {
            method = m20416d(m20414b);
        }
        f17632c = method;
    }

    /* renamed from: a */
    public static String m20413a(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    private static Object m20414b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m20415c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m20416d(Object obj) {
        try {
            Method m20415c = m20415c("getStackTraceDepth", Throwable.class);
            if (m20415c == null) {
                return null;
            }
            m20415c.invoke(obj, new Throwable());
            return m20415c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
