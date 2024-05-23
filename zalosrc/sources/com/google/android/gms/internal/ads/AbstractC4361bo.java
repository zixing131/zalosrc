package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.bo */
/* loaded from: classes2.dex */
public abstract class AbstractC4361bo {
    /* renamed from: a */
    public static int m20609a(int i11, int i12, int i13) {
        if (i11 >= 0 && i11 < i13) {
            return 0;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static String m20610b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static void m20611c(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m20612d(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: e */
    public static void m20613e(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static void m20614f(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }
}
