package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import p229i5.AbstractC20303x;

/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes.dex */
public abstract class AbstractC4205o {
    /* renamed from: a */
    public static void m19712a(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m19713b(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m19714c(boolean z11, String str, Object... objArr) {
        if (z11) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m19715d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    /* renamed from: e */
    public static void m19716e(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static void m19717f(String str) {
        if (AbstractC20303x.m105969a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    public static String m19718g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: h */
    public static String m19719h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m19720i() {
        m19721j("Must not be called on the main application thread");
    }

    /* renamed from: j */
    public static void m19721j(String str) {
        if (!AbstractC20303x.m105969a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: k */
    public static Object m19722k(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: l */
    public static Object m19723l(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: m */
    public static int m19724m(int i11) {
        if (i11 != 0) {
            return i11;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: n */
    public static long m19725n(long j11) {
        if (j11 != 0) {
            return j11;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    /* renamed from: o */
    public static void m19726o(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m19727p(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: q */
    public static void m19728q(boolean z11, String str, Object... objArr) {
        if (z11) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
