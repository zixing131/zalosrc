package am;

import com.zing.zalo.preferences.C9049a;
import com.zing.zalo.preferences.C9052d;
import com.zing.zalo.preferences.IPreferences;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.Objects;
import p561ux.C27381e;

/* renamed from: am.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC0908e0 {

    /* renamed from: a */
    private static IPreferences f3397a;

    /* renamed from: b */
    private static IPreferences f3398b;

    /* renamed from: c */
    private static IPreferences f3399c;

    /* renamed from: d */
    private static IPreferences f3400d;

    /* renamed from: am.e0$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: a */
    public static IPreferences m2807a() {
        return f3399c;
    }

    /* renamed from: b */
    public static boolean m2808b(String str, boolean z11, boolean z12) {
        return m2809c(str, z11, z12, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:            if (r6 != null) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:            r6.mo48448i(r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c2, code lost:            if (r6 != null) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2809c(String str, boolean z11, boolean z12, boolean z13) {
        IPreferences iPreferences;
        IPreferences iPreferences2;
        IPreferences iPreferences3;
        IPreferences iPreferences4;
        IPreferences iPreferences5;
        IPreferences iPreferences6;
        if (z12 && (iPreferences6 = f3399c) != null && iPreferences6.mo48445f(str)) {
            IPreferences iPreferences7 = f3399c;
            if (iPreferences7 instanceof C9049a) {
                Object m48449j = ((C9049a) iPreferences7).m48449j(str);
                if (m48449j == C9049a.f48491b) {
                    return z11;
                }
                if (m48449j instanceof Boolean) {
                    return ((Boolean) m48449j).booleanValue();
                }
            }
            return f3399c.mo48446g(str);
        }
        if (!z13) {
            try {
                AbstractC20110a.m104545n("get XML preference -> force to db, need clean code: %s", str);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof IPreferences.PreferencesExceptionNotFound) {
                        AbstractC20110a.m104545n("preference not found: %s", str);
                    } else {
                        AbstractC20110a.m104539h(th2);
                    }
                    if (z12) {
                        iPreferences2 = f3399c;
                    }
                    return z11;
                } catch (Throwable th3) {
                    if (z12 && (iPreferences = f3399c) != null) {
                        iPreferences.mo48448i(str, z11);
                    }
                    throw th3;
                }
            }
        }
        try {
            z11 = f3397a.mo48446g(str);
            if (z12 && (iPreferences5 = f3399c) != null) {
                iPreferences5.mo48448i(str, z11);
            }
            return z11;
        } catch (Throwable th4) {
            IPreferences iPreferences8 = f3398b;
            if (iPreferences8 != null) {
                try {
                    z11 = iPreferences8.mo48446g(str);
                    if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                        f3397a.mo48448i(str, z11);
                    }
                    if (z12 && (iPreferences3 = f3399c) != null) {
                        iPreferences3.mo48448i(str, z11);
                    }
                    return z11;
                } catch (Throwable unused) {
                    if (!z13 && f3400d != null) {
                        AbstractC20110a.m104545n("get XML preference -> read: %s", str);
                        z11 = f3400d.mo48446g(str);
                        if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                            f3397a.mo48448i(str, z11);
                        }
                    }
                    if (z12) {
                    }
                    return z11;
                }
            }
            if (!z13 && (iPreferences4 = f3400d) != null) {
                z11 = iPreferences4.mo48446g(str);
                if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                    f3397a.mo48448i(str, z11);
                }
            }
            if (z12) {
                iPreferences2 = f3399c;
            }
            return z11;
        }
    }

    /* renamed from: d */
    public static int m2810d(String str, int i11, boolean z11) {
        return m2811e(str, i11, z11, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:            if (r6 != null) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:            r6.mo48443d(r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c2, code lost:            if (r6 != null) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2811e(String str, int i11, boolean z11, boolean z12) {
        IPreferences iPreferences;
        IPreferences iPreferences2;
        IPreferences iPreferences3;
        IPreferences iPreferences4;
        IPreferences iPreferences5;
        IPreferences iPreferences6;
        if (z11 && (iPreferences6 = f3399c) != null && iPreferences6.mo48445f(str)) {
            IPreferences iPreferences7 = f3399c;
            if (iPreferences7 instanceof C9049a) {
                Object m48449j = ((C9049a) iPreferences7).m48449j(str);
                if (m48449j == C9049a.f48491b) {
                    return i11;
                }
                if (m48449j instanceof Integer) {
                    return ((Integer) m48449j).intValue();
                }
            }
            return f3399c.mo48441b(str);
        }
        if (!z12) {
            try {
                AbstractC20110a.m104545n("get XML preference -> force to db, need clean code: %s", str);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof IPreferences.PreferencesExceptionNotFound) {
                        AbstractC20110a.m104545n("preference not found: %s", str);
                    } else {
                        AbstractC20110a.m104539h(th2);
                    }
                    if (z11) {
                        iPreferences2 = f3399c;
                    }
                    return i11;
                } catch (Throwable th3) {
                    if (z11 && (iPreferences = f3399c) != null) {
                        iPreferences.mo48443d(str, i11);
                    }
                    throw th3;
                }
            }
        }
        try {
            i11 = f3397a.mo48441b(str);
            if (z11 && (iPreferences5 = f3399c) != null) {
                iPreferences5.mo48443d(str, i11);
            }
            return i11;
        } catch (Throwable th4) {
            IPreferences iPreferences8 = f3398b;
            if (iPreferences8 != null) {
                try {
                    i11 = iPreferences8.mo48441b(str);
                    if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                        f3397a.mo48443d(str, i11);
                    }
                    if (z11 && (iPreferences3 = f3399c) != null) {
                        iPreferences3.mo48443d(str, i11);
                    }
                    return i11;
                } catch (Throwable unused) {
                    if (!z12 && f3400d != null) {
                        AbstractC20110a.m104545n("get XML preference -> read: %s", str);
                        i11 = f3400d.mo48441b(str);
                        if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                            f3397a.mo48443d(str, i11);
                        }
                    }
                    if (z11) {
                    }
                    return i11;
                }
            }
            if (!z12 && (iPreferences4 = f3400d) != null) {
                i11 = iPreferences4.mo48441b(str);
                if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                    f3397a.mo48443d(str, i11);
                }
            }
            if (z11) {
                iPreferences2 = f3399c;
            }
            return i11;
        }
    }

    /* renamed from: f */
    public static long m2812f(String str, long j11) {
        return m2813g(str, j11, true);
    }

    /* renamed from: g */
    public static long m2813g(String str, long j11, boolean z11) {
        return m2814h(str, j11, z11, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:            if (r7 != null) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:            r7.mo48447h(r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c2, code lost:            if (r7 != null) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m2814h(String str, long j11, boolean z11, boolean z12) {
        IPreferences iPreferences;
        IPreferences iPreferences2;
        IPreferences iPreferences3;
        IPreferences iPreferences4;
        IPreferences iPreferences5;
        IPreferences iPreferences6;
        if (z11 && (iPreferences6 = f3399c) != null && iPreferences6.mo48445f(str)) {
            IPreferences iPreferences7 = f3399c;
            if (iPreferences7 instanceof C9049a) {
                Object m48449j = ((C9049a) iPreferences7).m48449j(str);
                if (m48449j == C9049a.f48491b) {
                    return j11;
                }
                if (m48449j instanceof Long) {
                    return ((Long) m48449j).longValue();
                }
            }
            return f3399c.mo48440a(str);
        }
        if (!z12) {
            try {
                AbstractC20110a.m104545n("get XML preference -> force to db, need clean code: %s", str);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof IPreferences.PreferencesExceptionNotFound) {
                        AbstractC20110a.m104545n("preference not found: %s", str);
                    } else {
                        AbstractC20110a.m104539h(th2);
                    }
                    if (z11) {
                        iPreferences2 = f3399c;
                    }
                    return j11;
                } catch (Throwable th3) {
                    if (z11 && (iPreferences = f3399c) != null) {
                        iPreferences.mo48447h(str, j11);
                    }
                    throw th3;
                }
            }
        }
        try {
            j11 = f3397a.mo48440a(str);
            if (z11 && (iPreferences5 = f3399c) != null) {
                iPreferences5.mo48447h(str, j11);
            }
            return j11;
        } catch (Throwable th4) {
            IPreferences iPreferences8 = f3398b;
            if (iPreferences8 != null) {
                try {
                    j11 = iPreferences8.mo48440a(str);
                    if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                        f3397a.mo48447h(str, j11);
                    }
                    if (z11 && (iPreferences3 = f3399c) != null) {
                        iPreferences3.mo48447h(str, j11);
                    }
                    return j11;
                } catch (Throwable unused) {
                    if (!z12 && f3400d != null) {
                        AbstractC20110a.m104545n("get XML preference -> read: %s", str);
                        j11 = f3400d.mo48440a(str);
                        if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                            f3397a.mo48447h(str, j11);
                        }
                    }
                    if (z11) {
                    }
                    return j11;
                }
            }
            if (!z12 && (iPreferences4 = f3400d) != null) {
                j11 = iPreferences4.mo48440a(str);
                if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                    f3397a.mo48447h(str, j11);
                }
            }
            if (z11) {
                iPreferences2 = f3399c;
            }
            return j11;
        }
    }

    /* renamed from: i */
    public static String m2815i(String str, String str2, boolean z11) {
        return m2816j(str, str2, z11, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:            if (r6 != null) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:            r6.mo48442c(r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:            if (r6 != null) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2816j(String str, String str2, boolean z11, boolean z12) {
        IPreferences iPreferences;
        IPreferences iPreferences2;
        IPreferences iPreferences3;
        IPreferences iPreferences4;
        IPreferences iPreferences5;
        IPreferences iPreferences6;
        if (z11 && (iPreferences6 = f3399c) != null && iPreferences6.mo48445f(str)) {
            IPreferences iPreferences7 = f3399c;
            if (iPreferences7 instanceof C9049a) {
                Object m48449j = ((C9049a) iPreferences7).m48449j(str);
                if (m48449j == C9049a.f48491b) {
                    return str2;
                }
                if (m48449j instanceof String) {
                    return (String) m48449j;
                }
            }
            return f3399c.mo48444e(str);
        }
        if (!z12) {
            try {
                AbstractC20110a.m104545n("get XML preference -> force to db, need clean code: %s", str);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof IPreferences.PreferencesExceptionNotFound) {
                        AbstractC20110a.m104545n("preference not found: %s", str);
                    } else {
                        AbstractC20110a.m104539h(th2);
                    }
                    if (z11) {
                        iPreferences2 = f3399c;
                    }
                    return str2;
                } catch (Throwable th3) {
                    if (z11 && (iPreferences5 = f3399c) != null) {
                        iPreferences5.mo48442c(str, str2);
                    }
                    throw th3;
                }
            }
        }
        try {
            str2 = f3397a.mo48444e(str);
            if (z11 && (iPreferences4 = f3399c) != null) {
                iPreferences4.mo48442c(str, str2);
            }
            return str2;
        } catch (Throwable th4) {
            IPreferences iPreferences8 = f3398b;
            if (iPreferences8 != null) {
                try {
                    str2 = iPreferences8.mo48444e(str);
                    if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                        f3397a.mo48442c(str, str2);
                    }
                    if (z11 && (iPreferences = f3399c) != null) {
                        iPreferences.mo48442c(str, str2);
                    }
                    return str2;
                } catch (Throwable unused) {
                    if (!z12 && f3400d != null) {
                        AbstractC20110a.m104545n("get XML preference -> read: %s", str);
                        str2 = f3400d.mo48444e(str);
                        if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                            f3397a.mo48442c(str, str2);
                        }
                    }
                    if (z11) {
                    }
                    return str2;
                }
            }
            if (!z12 && (iPreferences3 = f3400d) != null) {
                str2 = iPreferences3.mo48444e(str);
                if (th4 instanceof IPreferences.PreferencesExceptionNotFound) {
                    f3397a.mo48442c(str, str2);
                }
            }
            if (z11) {
                iPreferences2 = f3399c;
            }
            return str2;
        }
    }

    /* renamed from: k */
    public static boolean m2817k(String str) {
        try {
            if (f3397a.mo48445f(str)) {
                return true;
            }
            IPreferences iPreferences = f3398b;
            if (iPreferences != null && iPreferences.mo48445f(str)) {
                return true;
            }
            IPreferences iPreferences2 = f3400d;
            if (iPreferences2 != null) {
                return iPreferences2.mo48445f(str);
            }
            return false;
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            return false;
        }
    }

    /* renamed from: l */
    public static void m2818l(String str, boolean z11, boolean z12) {
        m2819m(str, z11, z12, true);
    }

    /* renamed from: m */
    public static void m2819m(String str, boolean z11, boolean z12, boolean z13) {
        if (z12) {
            try {
                IPreferences iPreferences = f3399c;
                if ((iPreferences instanceof C9049a) && iPreferences.mo48445f(str) && ((C9049a) f3399c).m48449j(str) != C9049a.f48491b && f3399c.mo48446g(str) == z11) {
                    return;
                }
            } catch (Throwable th2) {
                AbstractC20110a.m104539h(th2);
                return;
            }
        }
        f3397a.mo48448i(str, z11);
        IPreferences iPreferences2 = f3398b;
        if (iPreferences2 != null) {
            iPreferences2.mo48448i(str, z11);
        }
        IPreferences iPreferences3 = f3399c;
        if (iPreferences3 != null && z12) {
            iPreferences3.mo48448i(str, z11);
        }
        if (!z13) {
            AbstractC20110a.m104545n("get XML preference -> force to db, need clean code: %s", str);
        }
    }

    /* renamed from: n */
    public static void m2820n(String str, int i11, boolean z11) {
        m2821o(str, i11, z11, true);
    }

    /* renamed from: o */
    public static void m2821o(String str, int i11, boolean z11, boolean z12) {
        if (z11) {
            try {
                IPreferences iPreferences = f3399c;
                if ((iPreferences instanceof C9049a) && iPreferences.mo48445f(str) && ((C9049a) f3399c).m48449j(str) != C9049a.f48491b && f3399c.mo48441b(str) == i11) {
                    return;
                }
            } catch (Throwable th2) {
                AbstractC20110a.m104539h(th2);
                return;
            }
        }
        f3397a.mo48443d(str, i11);
        IPreferences iPreferences2 = f3398b;
        if (iPreferences2 != null) {
            iPreferences2.mo48443d(str, i11);
        }
        IPreferences iPreferences3 = f3399c;
        if (iPreferences3 != null && z11) {
            iPreferences3.mo48443d(str, i11);
        }
        if (!z12) {
            AbstractC20110a.m104545n("get XML preference -> force to db, need clean code: %s", str);
        }
    }

    /* renamed from: p */
    public static void m2822p(String str, long j11) {
        m2823q(str, j11, true);
    }

    /* renamed from: q */
    public static void m2823q(String str, long j11, boolean z11) {
        m2824r(str, j11, z11, true);
    }

    /* renamed from: r */
    public static void m2824r(String str, long j11, boolean z11, boolean z12) {
        if (z11) {
            try {
                IPreferences iPreferences = f3399c;
                if ((iPreferences instanceof C9049a) && iPreferences.mo48445f(str) && ((C9049a) f3399c).m48449j(str) != C9049a.f48491b && f3399c.mo48440a(str) == j11) {
                    return;
                }
            } catch (Throwable th2) {
                AbstractC20110a.m104539h(th2);
                return;
            }
        }
        f3397a.mo48447h(str, j11);
        IPreferences iPreferences2 = f3398b;
        if (iPreferences2 != null) {
            iPreferences2.mo48447h(str, j11);
        }
        IPreferences iPreferences3 = f3399c;
        if (iPreferences3 != null && z11) {
            iPreferences3.mo48447h(str, j11);
        }
        if (!z12) {
            AbstractC20110a.m104545n("get XML preference -> force to db, need clean code: %s", str);
        }
    }

    /* renamed from: s */
    public static void m2825s(String str, String str2, boolean z11) {
        m2826t(str, str2, z11, true);
    }

    /* renamed from: t */
    public static void m2826t(String str, String str2, boolean z11, boolean z12) {
        if (z11) {
            try {
                IPreferences iPreferences = f3399c;
                if ((iPreferences instanceof C9049a) && iPreferences.mo48445f(str) && ((C9049a) f3399c).m48449j(str) != C9049a.f48491b && Objects.equals(f3399c.mo48444e(str), str2)) {
                    return;
                }
            } catch (Throwable th2) {
                AbstractC20110a.m104539h(th2);
                return;
            }
        }
        f3397a.mo48442c(str, str2);
        IPreferences iPreferences2 = f3398b;
        if (iPreferences2 != null) {
            iPreferences2.mo48442c(str, str2);
        }
        IPreferences iPreferences3 = f3399c;
        if (iPreferences3 != null && z11) {
            iPreferences3.mo48442c(str, str2);
        }
        if (!z12) {
            AbstractC20110a.m104545n("set XML preference -> force to db, need clean code: %s", str);
        }
    }

    /* renamed from: u */
    public static void m2827u(IPreferences iPreferences, IPreferences iPreferences2, IPreferences iPreferences3) {
        synchronized (AbstractC0908e0.class) {
            f3397a = iPreferences;
            f3398b = iPreferences2;
            f3399c = iPreferences3;
            f3400d = new C9052d(CoreUtility.getAppContext(), "Zalo");
        }
    }

    /* renamed from: v */
    public static void m2828v(IPreferences iPreferences, boolean z11) {
        IPreferences iPreferences2;
        try {
            if (z11) {
                iPreferences2 = new C27381e(f3397a);
            } else {
                iPreferences2 = f3397a;
            }
            f3398b = iPreferences2;
            if (z11) {
                iPreferences = new C27381e(iPreferences);
            }
            f3397a = iPreferences;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: w */
    public static void m2829w() {
        if (!(f3397a instanceof C27381e)) {
            AbstractC20110a.m104535d("wrapPrimaryAsyncOnWrite", new Object[0]);
            f3397a = new C27381e(f3397a);
        }
    }
}
