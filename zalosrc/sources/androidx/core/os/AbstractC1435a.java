package androidx.core.os;

import android.os.Build;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
/* loaded from: classes.dex */
public abstract class AbstractC1435a {
    /* renamed from: a */
    protected static boolean m7334a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m7335b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m7336c() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 33 && (i11 < 32 || !m7334a("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }
}
