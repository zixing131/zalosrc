package bp0;

import android.os.Build;
import me0.AbstractC23136l9;
import me0.AbstractC23193r0;

/* renamed from: bp0.o */
/* loaded from: classes7.dex */
public abstract class AbstractC3103o {
    /* renamed from: a */
    public static int m15612a() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:            if (r3.equalsIgnoreCase("mips") != false) goto L15;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m15613b() {
        String str = "mips";
        try {
            String str2 = Build.CPU_ABI;
            if (str2.equalsIgnoreCase("armeabi-v7a")) {
                str = "armeabi-v7a";
            } else {
                if (!str2.equalsIgnoreCase("armeabi")) {
                    if (str2.equalsIgnoreCase("x86")) {
                        str = "x86";
                    }
                }
                str = "armeabi";
            }
            String property = System.getProperty("os.arch");
            if (property != null) {
                if (property.contains("686")) {
                    return "x86";
                }
            }
            return str;
        } catch (Exception unused) {
            return "armeabi";
        }
    }

    /* renamed from: c */
    public static String m15614c() {
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            str = "";
        }
        return String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s|%s", m15617f(), m15618g(), Integer.valueOf(m15612a()), str, m15613b(), m15615d(), Long.valueOf(AbstractC23193r0.m119505n()), Integer.valueOf(AbstractC23193r0.m119500i()), Integer.valueOf(AbstractC23136l9.m118722k0()), Integer.valueOf(AbstractC23136l9.m118713h0()));
    }

    /* renamed from: d */
    public static String m15615d() {
        String str = Build.HARDWARE;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    public static int m15616e() {
        return 0;
    }

    /* renamed from: f */
    public static String m15617f() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: g */
    public static String m15618g() {
        String str = Build.MODEL;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: h */
    public static boolean m15619h(int i11) {
        return Build.VERSION.SDK_INT >= i11;
    }

    /* renamed from: i */
    public static boolean m15620i() {
        return m15619h(21);
    }

    /* renamed from: j */
    public static boolean m15621j(String str, int i11, int i12) {
        long m119505n = AbstractC23193r0.m119505n();
        int m119500i = AbstractC23193r0.m119500i();
        if (m119505n <= 0 || m119505n >= i11 || m119500i <= 0 || m119500i >= i12 || str == null) {
            return false;
        }
        for (String str2 : str.split("\\|")) {
            if (m15615d().toLowerCase().contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m15622k() {
        if (Build.VERSION.SDK_INT < 23 && m15617f().equalsIgnoreCase("oppo")) {
            return false;
        }
        return m15619h(21);
    }

    /* renamed from: l */
    public static boolean m15623l() {
        return m15619h(21);
    }
}
