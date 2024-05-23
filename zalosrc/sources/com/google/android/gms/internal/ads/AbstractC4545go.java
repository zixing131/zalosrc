package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.go */
/* loaded from: classes2.dex */
public abstract class AbstractC4545go {
    /* renamed from: a */
    public static boolean m22493a(String str) {
        return "audio".equals(m22495c(str));
    }

    /* renamed from: b */
    public static boolean m22494b(String str) {
        return "video".equals(m22495c(str));
    }

    /* renamed from: c */
    private static String m22495c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }
}
