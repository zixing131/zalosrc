package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class ns3 {
    /* renamed from: a */
    public static int m25004a() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m25005b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
