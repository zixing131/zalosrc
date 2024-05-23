package me0;

import android.os.Build;

/* renamed from: me0.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC23171p0 {

    /* renamed from: a */
    private static final String f112358a = Build.BRAND.toLowerCase();

    /* renamed from: a */
    public static boolean m119369a() {
        return f112358a.contains("google");
    }

    /* renamed from: b */
    public static boolean m119370b() {
        String str = f112358a;
        if (!str.contains("huawei") && !str.contains("honor")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m119371c() {
        String str = Build.MODEL;
        if (!str.contains("GT-S5360") && !str.contains("GT-S5830M") && !str.contains("GT-S5830i") && !str.contains("GT-S5830C") && !str.contains("GT-S5570I") && !str.contains("GT-S5363") && !str.contains("GT-S5367") && !str.contains("GT-S6102") && !str.contains("GT-S6102B") && !str.contains("GT-S5300") && !str.contains("GT-S5839i") && !str.contains("GT-S6802B") && !str.contains("Vodafone Smart II") && !str.contains("ZTE V768") && !str.contains("GT-S5369") && !str.contains("GT-S6802") && !str.contains("Wildfire S") && !str.contains("HTC Wildfire") && !str.contains("Y210") && !str.contains("MB200") && !str.contains("A3333")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m119372d() {
        return f112358a.contains("oppo");
    }

    /* renamed from: e */
    public static boolean m119373e() {
        String str = Build.MANUFACTURER;
        if (!"samsung".equalsIgnoreCase(str) && !str.toLowerCase().contains("samsung")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m119374f() {
        String str = f112358a;
        if (!str.contains("vivo") && !str.contains("bbk")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m119375g() {
        return Build.MANUFACTURER.toLowerCase().equals("xiaomi");
    }
}
