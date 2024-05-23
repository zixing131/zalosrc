package p442qb;

import am.AbstractC0908e0;
import android.content.Context;
import android.content.SharedPreferences;
import p361nb.AbstractC23660q;

/* renamed from: qb.a */
/* loaded from: classes.dex */
public abstract class AbstractC25211a {
    /* renamed from: a */
    public static long m130466a(Context context) {
        try {
            long m2813g = AbstractC0908e0.m2813g("LAST_UPLOAD_TIME", -1L, true);
            if (m2813g == -1) {
                m2813g = m130471f(context, "ActionLog", "LAST_UPLOAD_TIME", -1L);
                if (m2813g == -1) {
                    return 0L;
                }
                m130475j(m2813g);
                m130474i(context, "ActionLog", "LAST_UPLOAD_TIME");
            }
            return m2813g;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* renamed from: b */
    public static int m130467b(Context context) {
        try {
            int m2810d = AbstractC0908e0.m2810d("LOG_ACTION", -1, true);
            if (m2810d == -1) {
                m2810d = m130470e(context, "ActionLog", "LOG_ACTION", -1);
                if (m2810d == -1) {
                    return 2;
                }
                m130476k(m2810d);
                m130474i(context, "ActionLog", "LOG_ACTION");
            }
            return m2810d;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* renamed from: c */
    public static long m130468c(Context context) {
        try {
            long m2813g = AbstractC0908e0.m2813g("LOG_ACTION_INTERVAL_TIME", -1L, true);
            if (m2813g == -1) {
                m2813g = m130471f(context, "ActionLog", "LOG_ACTION_INTERVAL_TIME", -1L);
                if (m2813g == -1) {
                    return AbstractC23660q.f114616b;
                }
                m130477l(m2813g);
                m130474i(context, "ActionLog", "LOG_ACTION_INTERVAL_TIME");
            }
            return m2813g;
        } catch (Exception unused) {
            return AbstractC23660q.f114616b;
        }
    }

    /* renamed from: d */
    public static String m130469d(Context context) {
        try {
            String m2815i = AbstractC0908e0.m2815i("LOG_ACTION_FILE_REPORT_PATH", null, true);
            if (m2815i == null) {
                m2815i = m130472g(context, "ActionLog", "LOG_ACTION_FILE_REPORT_PATH", null);
                if (m2815i == null) {
                    return "";
                }
                m130478m(m2815i);
                m130474i(context, "ActionLog", "LOG_ACTION_FILE_REPORT_PATH");
            }
            return m2815i;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m130470e(Context context, String str, String str2, int i11) {
        return context.getSharedPreferences(str, 0).getInt(str2, i11);
    }

    /* renamed from: f */
    public static long m130471f(Context context, String str, String str2, long j11) {
        return context.getSharedPreferences(str, 0).getLong(str2, j11);
    }

    /* renamed from: g */
    public static String m130472g(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    /* renamed from: h */
    public static int m130473h(Context context) {
        try {
            int m2810d = AbstractC0908e0.m2810d("RETRY_COUNT", -1, true);
            if (m2810d == -1) {
                m2810d = m130470e(context, "ActionLog", "RETRY_COUNT", -1);
                if (m2810d == -1) {
                    m2810d = 0;
                } else {
                    m130474i(context, "ActionLog", "RETRY_COUNT");
                }
            }
            int i11 = m2810d + 1;
            m130479n(i11);
            return i11;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    private static void m130474i(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.remove(str2);
        edit.apply();
    }

    /* renamed from: j */
    public static void m130475j(long j11) {
        AbstractC0908e0.m2823q("LAST_UPLOAD_TIME", j11, true);
    }

    /* renamed from: k */
    public static void m130476k(int i11) {
        AbstractC0908e0.m2820n("LOG_ACTION", i11, true);
    }

    /* renamed from: l */
    public static void m130477l(long j11) {
        AbstractC0908e0.m2823q("LOG_ACTION_INTERVAL_TIME", j11, true);
    }

    /* renamed from: m */
    public static void m130478m(String str) {
        AbstractC0908e0.m2825s("LOG_ACTION_FILE_REPORT_PATH", str, true);
    }

    /* renamed from: n */
    public static void m130479n(int i11) {
        AbstractC0908e0.m2820n("RETRY_COUNT", i11, true);
    }
}
