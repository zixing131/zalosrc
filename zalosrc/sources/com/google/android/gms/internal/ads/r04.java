package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class r04 {
    /* renamed from: a */
    public static Object m25934a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    public static Object m25935b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static void m25936c(Object obj, Class cls) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
