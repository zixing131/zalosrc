package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class v71 {
    /* renamed from: a */
    public static int m27170a(int i11, int i12, int i13) {
        if (i11 >= 0 && i11 < i13) {
            return i11;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static Object m27171b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public static String m27172c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static void m27173d(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m27174e(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: f */
    public static void m27175f(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalStateException();
        }
    }
}
