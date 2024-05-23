package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.u8 */
/* loaded from: classes2.dex */
public abstract class AbstractC5048u8 {

    /* renamed from: a */
    public static final boolean f28785a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    private static final String f28786b = AbstractC5048u8.class.getName();

    /* renamed from: a */
    public static void m26866a(String str, Object... objArr) {
        m26870e(str, objArr);
    }

    /* renamed from: b */
    public static void m26867b(String str, Object... objArr) {
        m26870e(str, objArr);
    }

    /* renamed from: c */
    public static void m26868c(Throwable th2, String str, Object... objArr) {
        m26870e(str, objArr);
    }

    /* renamed from: d */
    public static void m26869d(String str, Object... objArr) {
        if (f28785a) {
            m26870e(str, objArr);
        }
    }

    /* renamed from: e */
    private static String m26870e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i11 = 2;
        while (true) {
            if (i11 < stackTrace.length) {
                if (!stackTrace[i11].getClassName().equals(f28786b)) {
                    String className = stackTrace[i11].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i11].getMethodName();
                    break;
                }
                i11++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
