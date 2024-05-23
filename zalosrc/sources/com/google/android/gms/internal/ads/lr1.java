package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public abstract class lr1 {

    /* renamed from: a */
    private static final Object f24026a = new Object();

    /* renamed from: b */
    private static final lq1 f24027b = lq1.f24012a;

    /* renamed from: a */
    public static void m24352a(String str, String str2) {
        synchronized (f24026a) {
        }
    }

    /* renamed from: b */
    public static void m24353b(String str, String str2) {
        synchronized (f24026a) {
        }
    }

    /* renamed from: c */
    public static void m24354c(String str, String str2, Throwable th2) {
        m24353b(str, m24358g(str2, th2));
    }

    /* renamed from: d */
    public static void m24355d(String str, String str2) {
        synchronized (f24026a) {
        }
    }

    /* renamed from: e */
    public static void m24356e(String str, String str2) {
        synchronized (f24026a) {
        }
    }

    /* renamed from: f */
    public static void m24357f(String str, String str2, Throwable th2) {
        m24356e(str, m24358g(str2, th2));
    }

    /* renamed from: g */
    private static String m24358g(String str, Throwable th2) {
        String replace;
        synchronized (f24026a) {
            try {
                if (th2 == null) {
                    replace = null;
                } else {
                    Throwable th3 = th2;
                    while (true) {
                        if (th3 != null) {
                            if (th3 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th3 = th3.getCause();
                            }
                        } else {
                            replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
        }
        return str;
    }
}
