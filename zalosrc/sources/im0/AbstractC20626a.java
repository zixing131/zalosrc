package im0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.zing.zalocore.CoreUtility;

/* renamed from: im0.a */
/* loaded from: classes.dex */
public abstract class AbstractC20626a {

    /* renamed from: a */
    public static boolean f101451a = false;

    /* renamed from: b */
    public static int[] f101452b = {10000, 10000, 10000, 20000, 10000};

    /* renamed from: c */
    public static int[] f101453c = {4, 4, 4, 4, 4};

    /* renamed from: d */
    public static int[] f101454d = {15000, 15000, 15000, 20000, 15000};

    /* renamed from: e */
    public static int[] f101455e = {2, 2, 2, 2, 2};

    /* renamed from: f */
    public static int[] f101456f = {15000, 15000, 15000, 20000, 15000};

    /* renamed from: g */
    public static int[] f101457g = {2, 2, 2, 2, 2};

    /* renamed from: a */
    public static int m107385a(int i11) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) CoreUtility.getAppContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return f101454d[i11];
            }
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 1) {
                return f101452b[i11];
            }
            if (type == 0 && (subtype == 1 || subtype == 2)) {
                return f101456f[i11];
            }
            return f101454d[i11];
        } catch (Exception e11) {
            e11.printStackTrace();
            return f101454d[i11];
        }
    }

    /* renamed from: b */
    public static String m107386b() {
        try {
            return ((TelephonyManager) CoreUtility.getAppContext().getSystemService("phone")).getNetworkOperatorName().toUpperCase();
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public static int m107387c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) CoreUtility.getAppContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 5;
            }
            if (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 6) {
                return 0;
            }
            if (activeNetworkInfo.getType() != 0) {
                return 5;
            }
            return m107388d();
        } catch (Exception unused) {
            return 5;
        }
    }

    /* renamed from: d */
    public static int m107388d() {
        try {
            int networkType = ((TelephonyManager) CoreUtility.getAppContext().getSystemService("phone")).getNetworkType();
            if (networkType == 0) {
                return 5;
            }
            return networkType;
        } catch (Exception unused) {
            return 5;
        }
    }

    /* renamed from: e */
    public static String m107389e() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) CoreUtility.getAppContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return "UNKOWN";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "UNKNOWN";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 6) {
                return "WIMAX";
            }
            if (activeNetworkInfo.getType() != 0) {
                return "UNKNOWN";
            }
            return m107391g();
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: f */
    public static String m107390f() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) CoreUtility.getAppContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return "MA-NULL";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "AN-NULL";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 6) {
                return "WIMAX";
            }
            if (activeNetworkInfo.getType() == 0) {
                return m107391g();
            }
            return "UNKNOWN";
        } catch (Exception unused) {
            return "EXCEPTION";
        }
    }

    /* renamed from: g */
    public static String m107391g() {
        try {
            switch (((TelephonyManager) CoreUtility.getAppContext().getSystemService("phone")).getNetworkType()) {
                case 0:
                    return "MOBILE UNKNOWN";
                case 1:
                    return "GPRS";
                case 2:
                    return "EDGE";
                case 3:
                    return "UMTS";
                case 4:
                    return "CDMA";
                case 5:
                    return "EVDO rev. 0";
                case 6:
                    return "EVDO rev. A";
                case 7:
                    return "1xRTT";
                case 8:
                    return "HSDPA";
                case 9:
                    return "HSUPA";
                case 10:
                    return "HSPA";
                case 11:
                    return "iDen";
                case 12:
                    return "EVDO rev. B";
                case 13:
                    return "LTE";
                case 14:
                    return "eHRPD";
                case 15:
                    return "HSPA+";
                default:
                    return "MOBILE UNKNOWN";
            }
        } catch (Exception unused) {
            return "MOBILE UNKNOWN";
        }
    }

    /* renamed from: h */
    public static int m107392h() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) CoreUtility.getAppContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return 5;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return -2;
            }
            if (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 6) {
                return 0;
            }
            if (activeNetworkInfo.getType() != 0) {
                return 5;
            }
            return m107388d();
        } catch (Exception unused) {
            return 5;
        }
    }

    /* renamed from: i */
    public static boolean m107393i(Context context) {
        if (f101451a) {
            return m107394j(context);
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m107394j(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
        }
        if (activeNetworkInfo != null && (activeNetworkInfo.isConnected() || activeNetworkInfo.isAvailable())) {
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo2 != null) {
            if (networkInfo2.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static void m107395k(boolean z11) {
        f101451a = z11;
    }
}
