package p476r9;

import android.content.Context;
import android.content.pm.PackageManager;
import p319l9.C22152a;
import xn0.C30173c;

/* renamed from: r9.n */
/* loaded from: classes3.dex */
public abstract class AbstractC25706n {

    /* renamed from: a */
    private static Boolean f122729a;

    /* renamed from: a */
    public static void m132620a(boolean z11, String str) {
        if (z11) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m132621b(Context context) {
        Boolean bool = f122729a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f122729a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
            C22152a.m115524e().m115525a("No perf logcat meta data found " + e11.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static int m132622c(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    /* renamed from: d */
    public static String m132623d(String str) {
        C30173c m148818n = C30173c.m148818n(str);
        if (m148818n != null) {
            return m148818n.m148832m().m148850r("").m148848j("").m148849n(null).m148846e(null).toString();
        }
        return str;
    }

    /* renamed from: e */
    public static String m132624e(String str, int i11) {
        int lastIndexOf;
        if (str.length() <= i11) {
            return str;
        }
        if (str.charAt(i11) == '/') {
            return str.substring(0, i11);
        }
        C30173c m148818n = C30173c.m148818n(str);
        if (m148818n == null) {
            return str.substring(0, i11);
        }
        if (m148818n.m148828g().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, i11 - 1)) >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return str.substring(0, i11);
    }
}
