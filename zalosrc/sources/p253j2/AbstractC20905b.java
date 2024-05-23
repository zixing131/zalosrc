package p253j2;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: j2.b */
/* loaded from: classes.dex */
public abstract class AbstractC20905b {

    /* renamed from: a */
    private static long f102729a;

    /* renamed from: b */
    private static Method f102730b;

    /* renamed from: a */
    public static void m109371a(String str) {
        AbstractC20906c.m109376a(str);
    }

    /* renamed from: b */
    public static void m109372b() {
        AbstractC20906c.m109377b();
    }

    /* renamed from: c */
    private static void m109373c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to call ");
        sb2.append(str);
        sb2.append(" via reflection");
    }

    /* renamed from: d */
    public static boolean m109374d() {
        boolean isEnabled;
        try {
            if (f102730b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m109375e();
    }

    /* renamed from: e */
    private static boolean m109375e() {
        try {
            if (f102730b == null) {
                f102729a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f102730b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f102730b.invoke(null, Long.valueOf(f102729a))).booleanValue();
        } catch (Exception e11) {
            m109373c("isTagEnabled", e11);
            return false;
        }
    }
}
