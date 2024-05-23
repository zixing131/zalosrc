package hh0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.net.URLEncoder;
import jh0.AbstractC21254a;

/* renamed from: hh0.a */
/* loaded from: classes.dex */
public class C20063a {

    /* renamed from: n */
    private static String f98652n;

    /* renamed from: o */
    private static C20063a f98653o;

    /* renamed from: a */
    private String f98654a;

    /* renamed from: b */
    private String f98655b;

    /* renamed from: c */
    String f98656c;

    /* renamed from: d */
    int f98657d;

    /* renamed from: e */
    String f98658e;

    /* renamed from: f */
    String f98659f;

    /* renamed from: g */
    String f98660g;

    /* renamed from: h */
    String f98661h;

    /* renamed from: i */
    String f98662i;

    /* renamed from: k */
    String f98664k;

    /* renamed from: m */
    private boolean f98666m;

    /* renamed from: j */
    long f98663j = 0;

    /* renamed from: l */
    String f98665l = "";

    private C20063a(Context context) {
        m104232a(context);
    }

    /* renamed from: a */
    private void m104232a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            this.f98658e = packageName;
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 4096);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f98658e, 128);
            this.f98656c = packageInfo.versionName;
            this.f98657d = packageInfo.versionCode;
            this.f98659f = URLEncoder.encode(String.valueOf(packageInfo.applicationInfo.loadLabel(packageManager)), "UTF-8");
            this.f98664k = packageManager.getInstallerPackageName(this.f98658e);
            this.f98661h = String.valueOf(packageInfo.firstInstallTime);
            this.f98660g = String.valueOf(packageInfo.firstInstallTime);
            this.f98662i = String.valueOf(packageInfo.lastUpdateTime);
            Bundle bundle = applicationInfo.metaData;
            String m104246o = m104246o(bundle, "com.zing.zalo.zalosdk.appID");
            this.f98654a = m104246o;
            if (m104246o != null) {
                if (m104246o.trim().length() == 0) {
                }
                this.f98666m = m104235d(bundle, "com.zing.zalosdk.configAutoTrackingActivity");
                this.f98665l = m104246o(bundle, "com.zalo.sdk.preloadChannel");
                this.f98655b = m104246o(bundle, "com.facebook.sdk.ApplicationId");
            }
            this.f98654a = m104246o(bundle, "appID");
            this.f98666m = m104235d(bundle, "com.zing.zalosdk.configAutoTrackingActivity");
            this.f98665l = m104246o(bundle, "com.zalo.sdk.preloadChannel");
            this.f98655b = m104246o(bundle, "com.facebook.sdk.ApplicationId");
        } catch (Exception e11) {
            AbstractC21254a.m110062d("extractBasicAppInfo", e11);
        }
    }

    /* renamed from: b */
    public static String m104233b(Context context) {
        return m104241j(context).f98654a;
    }

    /* renamed from: c */
    public static String m104234c(Context context) {
        return m104241j(context).f98659f;
    }

    /* renamed from: d */
    private boolean m104235d(Bundle bundle, String str) {
        try {
            if (bundle.containsKey(str)) {
                return bundle.getBoolean(str);
            }
            return false;
        } catch (Exception e11) {
            AbstractC21254a.m110068j(e11.toString());
            return false;
        }
    }

    /* renamed from: e */
    public static String m104236e(Context context) {
        return m104241j(context).f98660g;
    }

    /* renamed from: f */
    public static String m104237f(Context context) {
        String str = f98652n;
        if (str != null) {
            return str;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("zacPref", 0);
        String string = sharedPreferences.getString("first_run_date", null);
        f98652n = string;
        if (string == null) {
            f98652n = String.valueOf(System.currentTimeMillis());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("first_run_date", f98652n);
            edit.apply();
        }
        return f98652n;
    }

    /* renamed from: g */
    public static long m104238g(Context context) {
        if (m104241j(context).f98663j == 0) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("zacPref", 0);
            m104241j(context).f98663j = sharedPreferences.getLong("first_time_open_app", 0L);
        }
        return m104241j(context).f98663j;
    }

    /* renamed from: h */
    public static String m104239h(Context context) {
        return m104241j(context).f98661h;
    }

    /* renamed from: i */
    public static String m104240i(Context context) {
        return m104241j(context).f98664k;
    }

    /* renamed from: j */
    public static synchronized C20063a m104241j(Context context) {
        C20063a c20063a;
        synchronized (C20063a.class) {
            try {
                if (f98653o == null) {
                    f98653o = new C20063a(context);
                }
                c20063a = f98653o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20063a;
    }

    /* renamed from: k */
    public static String m104242k(Context context) {
        return m104241j(context).f98662i;
    }

    /* renamed from: l */
    public static String m104243l(Context context) {
        return m104241j(context).f98658e;
    }

    /* renamed from: m */
    public static String m104244m(Context context) {
        return m104241j(context).f98665l;
    }

    /* renamed from: n */
    public static String m104245n(Context context) {
        try {
            return context.getSharedPreferences("zacCookie", 0).getString("referrer", "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: o */
    private String m104246o(Bundle bundle, String str) {
        String str2 = null;
        try {
            if (bundle.containsKey(str)) {
                str2 = bundle.getString(str);
            }
        } catch (Exception e11) {
            AbstractC21254a.m110068j(e11.toString());
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: p */
    public static int m104247p(Context context) {
        return m104241j(context).f98657d;
    }

    /* renamed from: q */
    public static String m104248q(Context context) {
        return m104241j(context).f98656c;
    }

    /* renamed from: r */
    public static boolean m104249r(Context context) {
        return m104241j(context).f98666m;
    }

    /* renamed from: s */
    public static void m104250s(Context context, long j11) {
        if (m104241j(context).f98663j != j11) {
            m104241j(context).f98663j = j11;
            SharedPreferences.Editor edit = context.getSharedPreferences("zacPref", 0).edit();
            edit.putLong("first_time_open_app", j11);
            edit.apply();
        }
    }
}
