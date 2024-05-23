package mm0;

import android.util.Log;
import ho0.AbstractC20110a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* renamed from: mm0.e */
/* loaded from: classes.dex */
public abstract class AbstractC23350e {

    /* renamed from: a */
    public static int f113572a = 1;

    /* renamed from: b */
    public static final Pattern f113573b = Pattern.compile("(\\$\\d+)+$");

    /* renamed from: a */
    public static String m122771a() {
        return "NO-TAG";
    }

    /* renamed from: b */
    public static void m122772b(String str, Object... objArr) {
        AbstractC20110a.m104543l(m122771a());
        AbstractC20110a.m104535d(str, objArr);
    }

    /* renamed from: c */
    public static void m122773c(Throwable th2) {
        AbstractC20110a.m104543l(m122771a());
        AbstractC20110a.m104536e(th2);
    }

    /* renamed from: d */
    public static int m122774d(String str, String str2) {
        if (f113572a == 1) {
            AbstractC20110a.m104543l(str);
            AbstractC20110a.m104538g(str2, new Object[0]);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m122775e(String str, String str2, Throwable th2) {
        if (f113572a == 1) {
            AbstractC20110a.m104543l(str);
            AbstractC20110a.m104540i(th2, str2, new Object[0]);
        }
        return 0;
    }

    /* renamed from: f */
    public static int m122776f(String str, Throwable th2) {
        if (f113572a == 1) {
            AbstractC20110a.m104543l(str);
            AbstractC20110a.m104539h(th2);
            return 0;
        }
        return 0;
    }

    /* renamed from: g */
    public static void m122777g(String str, Object... objArr) {
        AbstractC20110a.m104543l(m122771a());
        AbstractC20110a.m104538g(str, objArr);
    }

    /* renamed from: h */
    public static void m122778h(Throwable th2) {
        AbstractC20110a.m104543l(m122771a());
        AbstractC20110a.m104539h(th2);
    }

    /* renamed from: i */
    public static String m122779i(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: j */
    public static void m122780j(String str, Object... objArr) {
        AbstractC20110a.m104543l(m122771a());
        AbstractC20110a.m104541j(str, objArr);
    }

    /* renamed from: k */
    public static boolean m122781k(String str, int i11) {
        return Log.isLoggable(str, i11);
    }

    /* renamed from: l */
    public static void m122782l(String str, Object... objArr) {
        AbstractC20110a.m104543l(m122771a());
        AbstractC20110a.m104545n(str, objArr);
    }

    /* renamed from: m */
    public static void m122783m(Throwable th2) {
        AbstractC20110a.m104543l(m122771a());
        AbstractC20110a.m104546o(th2);
    }
}
