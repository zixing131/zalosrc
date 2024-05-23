package me.zalo.startuphelper;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.BuildConfig;
import gh0.C19447a;
import hh0.AbstractC20066d;
import java.util.List;
import java.util.Map;
import jh0.AbstractC21254a;
import p327lm.C22523c;

/* renamed from: me.zalo.startuphelper.d */
/* loaded from: classes7.dex */
public abstract class AbstractC23000d {

    /* renamed from: b */
    private static C22999c f111849b;

    /* renamed from: c */
    private static StartupHelperReceiver f111850c;

    /* renamed from: a */
    private static final String[] f111848a = {"com.vng.zing.zdice", BuildConfig.APPLICATION_ID, "com.epi", "com.zing.mp3", "com.zing.tv3", "com.vng.inputmethod.labankey"};

    /* renamed from: d */
    private static final Object f111851d = new Object();

    /* renamed from: e */
    private static long f111852e = 0;

    /* renamed from: f */
    public static b f111853f = b.INSTALL_SUBMIT_TOKEN;

    /* renamed from: me.zalo.startuphelper.d$a */
    /* loaded from: classes7.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Context f111854p;

        /* renamed from: me.zalo.startuphelper.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        class C32893a implements C22523c.a {
            C32893a() {
            }

            @Override // p327lm.C22523c.a
            /* renamed from: a */
            public void mo99243a(String str) {
                long unused = AbstractC23000d.f111852e = System.currentTimeMillis();
                C19447a.m101720d().m101734o(a.this.f111854p, AbstractC23000d.f111852e);
                AbstractC23000d.m117861s(a.this.f111854p);
            }
        }

        a(Context context) {
            this.f111854p = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long unused = AbstractC23000d.f111852e = C19447a.m101720d().m101724e(this.f111854p);
                long m101728i = C19447a.m101720d().m101728i(this.f111854p);
                if (!AbstractC22998b.m117802a(this.f111854p) && (m101728i <= 0 || AbstractC23000d.f111852e + m101728i >= System.currentTimeMillis())) {
                    return;
                }
                C22523c.m116498g().m116504e(new C32893a());
            } catch (Exception e11) {
                AbstractC21254a.m110062d("wakeuplib", e11);
            }
        }
    }

    /* renamed from: me.zalo.startuphelper.d$b */
    /* loaded from: classes7.dex */
    public enum b {
        INSTALL_SUBMIT_TOKEN,
        OPEN_APP_SUBMIT_TOKEN,
        WAKEUP_APP_SUBMIT_TOKEN
    }

    /* renamed from: d */
    private static String m117846d() {
        String m116503d = C22523c.m116498g().m116503d();
        if (TextUtils.isEmpty(m116503d)) {
            return "";
        }
        return ("&z_deviceid=" + m116503d) + "&z_deviceid_expiredTime=" + String.valueOf(C22523c.m116498g().m116505f());
    }

    /* renamed from: e */
    public static Intent m117847e(Context context, Map map, boolean z11) {
        if (map == null) {
            return null;
        }
        return m117848f(context).m117833m(context, map, Boolean.valueOf(z11));
    }

    /* renamed from: f */
    private static synchronized C22999c m117848f(Context context) {
        C22999c c22999c;
        synchronized (AbstractC23000d.class) {
            try {
                if (f111849b == null) {
                    f111849b = new C22999c(context);
                }
                c22999c = f111849b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22999c;
    }

    /* renamed from: g */
    public static boolean m117849g(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return AbstractC20066d.m104298q(context, "android.permission.POST_NOTIFICATIONS");
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m117850h(Context context) {
        boolean isBackgroundRestricted;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                isBackgroundRestricted = ((ActivityManager) context.getSystemService("activity")).isBackgroundRestricted();
                return isBackgroundRestricted;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m117851i(Context context, Map map) {
        if (map == null) {
            return false;
        }
        return m117848f(context).m117837t(map);
    }

    /* renamed from: j */
    public static boolean m117852j(Context context, Intent intent) {
        return m117848f(context).m117838u(intent);
    }

    /* renamed from: k */
    private static boolean m117853k(String str) {
        for (String str2 : f111848a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static void m117854l(Context context) {
        try {
            m117848f(context);
            if (context == null) {
                return;
            }
            AbstractC23004h.m117868a(new a(context));
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (Build.VERSION.SDK_INT >= 26 && applicationInfo.targetSdkVersion >= 26) {
                synchronized (f111851d) {
                    try {
                        if (f111850c != null) {
                            return;
                        }
                        f111850c = new StartupHelperReceiver();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        context.registerReceiver(f111850c, intentFilter);
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC21254a.m110062d("onApplicationCreate", e11);
        }
    }

    /* renamed from: m */
    public static void m117855m(Context context) {
        try {
            m117848f(context).m117841z();
            if (context == null) {
                return;
            }
            synchronized (f111851d) {
                try {
                    StartupHelperReceiver startupHelperReceiver = f111850c;
                    if (startupHelperReceiver != null) {
                        context.unregisterReceiver(startupHelperReceiver);
                        f111850c = null;
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC21254a.m110062d("onApplicationTerminate", e11);
        }
    }

    /* renamed from: n */
    public static void m117856n(Context context, Map map) {
        m117848f(context).m117839x(map);
    }

    /* renamed from: o */
    public static void m117857o(Context context, String str) {
        m117848f(context).m117832E(str);
    }

    /* renamed from: p */
    public static void m117858p(Context context, Intent intent) {
        m117848f(context).m117840y(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static void m117859q(Context context, int i11) {
        try {
            String nameForUid = context.getPackageManager().getNameForUid(i11);
            if (nameForUid == null) {
                return;
            }
            int indexOf = nameForUid.indexOf(58);
            if (indexOf > 0) {
                nameForUid = nameForUid.substring(0, indexOf);
            }
            if (m117853k(nameForUid)) {
                m117860r(context, nameForUid);
            }
        } catch (Exception e11) {
            AbstractC21254a.m110062d("startHelperProvider", e11);
        }
    }

    /* renamed from: r */
    private static void m117860r(Context context, String str) {
        try {
            List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("me.zalo.startuphelper.intent.action.STARTUP_HELPER_PROVIDER"), 0);
            if (queryIntentContentProviders == null || queryIntentContentProviders.size() == 0) {
                return;
            }
            for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                try {
                    String str2 = resolveInfo.providerInfo.packageName;
                    if (!str2.equals(context.getPackageName()) && str2.equals(str)) {
                        Uri parse = Uri.parse("content://" + resolveInfo.providerInfo.authority + "?z_startFrom=" + context.getPackageName() + "&z_startType=install_event" + m117846d());
                        if (parse != null) {
                            Cursor query = context.getContentResolver().query(parse, null, null, null, null);
                            if (query != null) {
                                query.close();
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC21254a.m110062d("startHelperProvider", e11);
                }
            }
        } catch (Exception e12) {
            AbstractC21254a.m110062d("startHelperProvider", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static void m117861s(Context context) {
        Cursor query;
        try {
            List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("me.zalo.startuphelper.intent.action.STARTUP_HELPER_PROVIDER"), 0);
            if (queryIntentContentProviders == null || queryIntentContentProviders.size() == 0) {
                return;
            }
            for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                try {
                    String str = resolveInfo.providerInfo.packageName;
                    if (m117853k(context.getPackageName()) && !str.equals(context.getPackageName())) {
                        Uri parse = Uri.parse("content://" + resolveInfo.providerInfo.authority + "?z_startFrom=" + context.getPackageName() + "&z_startType=startup" + m117846d());
                        if (parse != null && (query = context.getContentResolver().query(parse, null, null, null, null)) != null) {
                            query.close();
                        }
                    }
                } catch (Exception e11) {
                    AbstractC21254a.m110062d("startHelperProviders", e11);
                }
            }
        } catch (Exception e12) {
            AbstractC21254a.m110062d("startHelperProviders", e12);
        }
    }

    /* renamed from: t */
    public static void m117862t(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        m117848f(context);
        String query = uri.getQuery();
        if (TextUtils.isEmpty(query)) {
            return;
        }
        C22999c m117848f = m117848f(context);
        String queryParameter = uri.getQueryParameter("z_startFrom");
        if (!query.contains("callback_event")) {
            if (query.contains("z_deviceid")) {
                str3 = uri.getQueryParameter("z_deviceid");
            } else {
                str3 = null;
            }
            m117848f.m117830A(queryParameter, str3);
        }
    }
}
