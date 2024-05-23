package p178g3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.adtima.Adtima;

/* renamed from: g3.b */
/* loaded from: classes2.dex */
public abstract class AbstractC19207b {

    /* renamed from: a */
    private static final String f95649a = "b";

    /* renamed from: a */
    public static NetworkInfo m100795a(Context context) {
        try {
        } catch (Exception e11) {
            Adtima.m18329e(f95649a, "getNetworkInfo", e11);
        }
        if (AbstractC19210e.m100805a("android.permission.ACCESS_NETWORK_STATE")) {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static String m100796b(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.substring(0, 3);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f95649a, "parseMCCFromNetworkOperator", e11);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m100797c(Context context) {
        String str = null;
        try {
            if (!AbstractC19210e.m100805a("android.permission.READ_PHONE_STATE")) {
                return null;
            }
            str = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            Adtima.m18326d(f95649a, "getNetworkOperation: " + str);
            return str;
        } catch (Exception e11) {
            Adtima.m18329e(f95649a, "getNetworkOperation", e11);
            return str;
        }
    }

    /* renamed from: d */
    public static String m100798d(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.substring(3);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f95649a, "parseMNCFromNetworkOperator", e11);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m100799e(Context context) {
        try {
            NetworkInfo m100795a = m100795a(context);
            if (m100795a != null && m100795a.isConnected()) {
                if (m100795a.getType() == 0) {
                    return "mobile";
                }
                if (m100795a.getType() == 1) {
                    return "wifi";
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f95649a, "getNetworkType", e11);
        }
        return "other";
    }

    /* renamed from: f */
    public static boolean m100800f(Context context) {
        try {
            NetworkInfo m100795a = m100795a(context);
            if (m100795a == null || !m100795a.isConnected()) {
                return false;
            }
            return m100795a.getType() == 0;
        } catch (Exception e11) {
            Adtima.m18329e(f95649a, "isConnectedMobile", e11);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m100801g(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
