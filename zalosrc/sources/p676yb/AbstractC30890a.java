package p676yb;

import android.content.Context;
import android.content.SharedPreferences;
import p604wb.C28905e;

/* renamed from: yb.a */
/* loaded from: classes.dex */
public abstract class AbstractC30890a {

    /* renamed from: a */
    private static String f142487a = "ADS_TRACKING_SUBMIT_INTERVAL";

    /* renamed from: b */
    private static String f142488b = "ADS_TRACKING_CLICK_INTERVAL";

    /* renamed from: c */
    private static String f142489c = "ADS_TRACKING_IMPRESSION_INTERVAL";

    /* renamed from: d */
    private static String f142490d = "ADS_TRACKING_INSTALL_EXPIRE_TIME";

    /* renamed from: e */
    private static String f142491e = "ADS_ITEM_EXPIRE_TIME";

    /* renamed from: f */
    private static String f142492f = "ADS_SUPPORT_CLOSE_MENU";

    /* renamed from: a */
    public static long m150104a(Context context) {
        try {
            return m150110g(context, "AdsTracking", f142491e, C28905e.f133811k);
        } catch (Exception unused) {
            return C28905e.f133811k;
        }
    }

    /* renamed from: b */
    public static int m150105b(Context context) {
        try {
            return m150109f(context, "AdsTracking", f142492f, 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static long m150106c(Context context) {
        try {
            return m150110g(context, "AdsTracking", f142488b, C28905e.f133807g);
        } catch (Exception unused) {
            return C28905e.f133807g;
        }
    }

    /* renamed from: d */
    public static long m150107d(Context context) {
        try {
            return m150110g(context, "AdsTracking", f142489c, C28905e.f133808h);
        } catch (Exception unused) {
            return C28905e.f133808h;
        }
    }

    /* renamed from: e */
    public static long m150108e(Context context) {
        try {
            return m150110g(context, "AdsTracking", f142490d, C28905e.f133810j);
        } catch (Exception unused) {
            return C28905e.f133810j;
        }
    }

    /* renamed from: f */
    public static int m150109f(Context context, String str, String str2, int i11) {
        return context.getSharedPreferences(str, 0).getInt(str2, i11);
    }

    /* renamed from: g */
    public static long m150110g(Context context, String str, String str2, long j11) {
        return context.getSharedPreferences(str, 0).getLong(str2, j11);
    }

    /* renamed from: h */
    public static long m150111h(Context context) {
        try {
            return m150110g(context, "AdsTracking", f142487a, C28905e.f133809i);
        } catch (Exception unused) {
            return C28905e.f133809i;
        }
    }

    /* renamed from: i */
    public static void m150112i(Context context, int i11) {
        try {
            m150116m(context, "AdsTracking", f142492f, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static void m150113j(Context context, long j11) {
        try {
            m150117n(context, "AdsTracking", f142488b, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static void m150114k(Context context, long j11) {
        try {
            m150117n(context, "AdsTracking", f142489c, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static void m150115l(Context context, long j11) {
        try {
            m150117n(context, "AdsTracking", f142490d, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m150116m(Context context, String str, String str2, int i11) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putInt(str2, i11);
        edit.commit();
    }

    /* renamed from: n */
    public static void m150117n(Context context, String str, String str2, long j11) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putLong(str2, j11);
        edit.commit();
    }

    /* renamed from: o */
    public static void m150118o(Context context, long j11) {
        try {
            m150117n(context, "AdsTracking", f142487a, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
