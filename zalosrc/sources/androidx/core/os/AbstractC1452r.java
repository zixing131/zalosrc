package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* renamed from: androidx.core.os.r */
/* loaded from: classes2.dex */
public abstract class AbstractC1452r {

    /* renamed from: a */
    private static long f6281a;

    /* renamed from: b */
    private static Method f6282b;

    /* renamed from: c */
    private static Method f6283c;

    /* renamed from: d */
    private static Method f6284d;

    /* renamed from: e */
    private static Method f6285e;

    /* renamed from: androidx.core.os.r$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static void m7368a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m7369b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f6281a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f6282b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f6283c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f6284d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f6285e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m7366a(String str) {
        a.m7368a(str);
    }

    /* renamed from: b */
    public static void m7367b() {
        a.m7369b();
    }
}
