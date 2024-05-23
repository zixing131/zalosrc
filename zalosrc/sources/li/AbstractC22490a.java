package li;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.C6576e;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.zing.zalo.AbstractC7306b;
import java.util.Locale;
import mm0.AbstractC23350e;
import pe0.AbstractC24743a;

/* renamed from: li.a */
/* loaded from: classes.dex */
public abstract class AbstractC22490a {

    /* renamed from: a */
    public static boolean f110023a = false;

    /* renamed from: a */
    public static void m116278a() {
        String m128500b = AbstractC24743a.m128500b();
        if (!TextUtils.isEmpty(m128500b)) {
            FirebaseCrashlytics.getInstance().setUserId(m128500b);
        }
        FirebaseCrashlytics.getInstance().setCustomKey("BUILDER", AbstractC7306b.f40035e);
        FirebaseCrashlytics.getInstance().setCustomKey("BUILD_ID", AbstractC7306b.f40031a);
        FirebaseCrashlytics.getInstance().setCustomKey("BUILD_TIME", AbstractC7306b.f40032b);
        FirebaseCrashlytics.getInstance().setCustomKey("GIT_COMMIT", AbstractC7306b.f40034d);
        FirebaseCrashlytics.getInstance().setCustomKey("CI_PIPELINE_ID", AbstractC7306b.f40036f);
    }

    /* renamed from: b */
    public static void m116279b(Context context) {
        C6576e.m33603p(context);
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
    }

    /* renamed from: c */
    public static void m116280c(int i11, String str, String str2) {
        try {
            if (f110023a && !TextUtils.isEmpty(str2)) {
                FirebaseCrashlytics.getInstance().log(String.format(Locale.US, "%d/%s: %s", Integer.valueOf(i11), str, str2));
                AbstractC23350e.m122772b("log crashlytics - %1$s: %2$s", str, str2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m116281d(String str) {
        try {
            if (f110023a && !TextUtils.isEmpty(str)) {
                FirebaseCrashlytics.getInstance().log(str);
                AbstractC23350e.m122772b("log crashlytics - " + str, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static void m116282e(Throwable th2) {
        try {
            if (f110023a && th2 != null) {
                FirebaseCrashlytics.getInstance().recordException(th2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static void m116283f(String str, String str2) {
        try {
            if (f110023a && !TextUtils.isEmpty(str)) {
                FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
                AbstractC23350e.m122772b("set crashlytics key: %1$s - value: %2$s", str, str2);
            }
        } catch (Exception unused) {
        }
    }
}
