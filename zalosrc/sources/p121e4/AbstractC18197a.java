package p121e4;

import android.os.Build;
import android.util.Log;

/* renamed from: e4.a */
/* loaded from: classes.dex */
public abstract class AbstractC18197a {
    /* renamed from: a */
    private static String m96963a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    /* renamed from: b */
    public static void m96964b(String str, String str2, Object obj) {
        if (Log.isLoggable(m96967e(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: c */
    public static void m96965c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m96967e(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m96966d(String str, String str2, Throwable th2) {
        m96967e(str);
    }

    /* renamed from: e */
    private static String m96967e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m96963a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m96968f(String str, String str2, Object obj) {
        if (Log.isLoggable(m96967e(str), 4)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: g */
    public static void m96969g(String str, String str2, Object obj) {
        if (Log.isLoggable(m96967e(str), 5)) {
            String.format(str2, obj);
        }
    }
}
