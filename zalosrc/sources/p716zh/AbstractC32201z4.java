package p716zh;

import android.os.Build;
import android.text.TextUtils;
import hu.C20131e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import me0.AbstractC23041d2;
import p348mi.AbstractC23306f;

/* renamed from: zh.z4 */
/* loaded from: classes3.dex */
public abstract class AbstractC32201z4 {

    /* renamed from: a */
    private static final String f148503a = String.format(Locale.US, "(^[^\\d\\W]+)_([0-9]{8})_([0-9]{6})_([A-Za-z0-9]{%d})", 5);

    /* renamed from: b */
    private static Pattern f148504b = null;

    /* renamed from: c */
    private static Set f148505c;

    /* renamed from: d */
    private static HashMap f148506d;

    /* renamed from: a */
    private static boolean m155240a(String str) {
        if (Build.VERSION.SDK_INT >= 29 && !str.startsWith(C20131e.f99303a.m104973t())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m155241b(long j11, String str) {
        String m155244e;
        if (!TextUtils.isEmpty(str) && m155240a(str)) {
            synchronized (AbstractC32201z4.class) {
                try {
                    m155244e = m155244e(j11);
                    if (m155244e.isEmpty()) {
                        m155244e = m155242c(str);
                        m155249j(j11, m155244e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m155244e;
        }
        return str;
    }

    /* renamed from: c */
    private static synchronized String m155242c(String str) {
        String str2;
        String str3;
        String str4;
        synchronized (AbstractC32201z4.class) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (m155247h(str)) {
                    return str;
                }
                int lastIndexOf = str.lastIndexOf("/") + 1;
                String substring = str.substring(lastIndexOf);
                int lastIndexOf2 = substring.lastIndexOf(".");
                if (lastIndexOf2 >= 0) {
                    str2 = substring.substring(0, lastIndexOf2);
                } else {
                    str2 = substring;
                }
                if (lastIndexOf2 >= 0) {
                    str3 = substring.substring(lastIndexOf2);
                } else {
                    str3 = "";
                }
                String substring2 = str.substring(0, lastIndexOf + str2.length());
                int i11 = 0;
                do {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(substring2);
                    if (i11 > 0) {
                        str4 = String.format(Locale.US, " (%d)", Integer.valueOf(i11));
                    } else {
                        str4 = "";
                    }
                    sb2.append(str4);
                    sb2.append(str3);
                    str = sb2.toString();
                    i11++;
                    if (m155247h(str)) {
                        break;
                    }
                } while (i11 < 100);
                return str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static String m155243d(long j11) {
        Locale locale = Locale.US;
        return String.format(locale, "VOICE_%s_%s", new SimpleDateFormat("yyyyMMdd_HHmmss", locale).format(new Date(j11)), C32042o.f147549a.m154586a(5));
    }

    /* renamed from: e */
    private static String m155244e(long j11) {
        HashMap hashMap;
        String str;
        if (j11 == 0 || (hashMap = f148506d) == null || (str = (String) hashMap.get(Long.valueOf(j11))) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    public static String m155245f() {
        Locale locale = Locale.US;
        return String.format(locale, "FILE_%s_%s", new SimpleDateFormat("yyyyMMdd_HHmmss", locale).format(new Date(AbstractC23306f.m120579F1().mo124314i())), C32042o.f147549a.m154586a(5));
    }

    /* renamed from: g */
    public static boolean m155246g(String str) {
        if (f148504b == null) {
            f148504b = Pattern.compile(f148503a);
        }
        return f148504b.matcher(str).find();
    }

    /* renamed from: h */
    private static boolean m155247h(String str) {
        if (!m155248i(str) && !AbstractC23041d2.m118194A(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m155248i(String str) {
        Set set;
        if (!m155240a(str) || (set = f148505c) == null || !set.contains(str.toLowerCase())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static void m155249j(long j11, String str) {
        if (!TextUtils.isEmpty(str) && j11 != 0 && m155240a(str)) {
            if (f148505c == null) {
                f148506d = new LinkedHashMap();
                f148505c = new LinkedHashSet();
            }
            f148506d.put(Long.valueOf(j11), str);
            f148505c.add(str.toLowerCase());
        }
    }

    /* renamed from: k */
    public static void m155250k(long j11) {
        String str;
        if (j11 == 0) {
            return;
        }
        synchronized (AbstractC32201z4.class) {
            try {
                if (f148505c != null && (str = (String) f148506d.get(Long.valueOf(j11))) != null && m155240a(str)) {
                    f148506d.remove(Long.valueOf(j11));
                    f148505c.remove(str.toLowerCase());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
