package me0;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.AbstractC1388a;
import androidx.core.net.AbstractC1434a;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import on0.AbstractC24341v;

/* renamed from: me0.e5 */
/* loaded from: classes.dex */
public final class C23055e5 {

    /* renamed from: a */
    public static final C23055e5 f112061a = new C23055e5();

    private C23055e5() {
    }

    /* renamed from: a */
    public static final int m118267a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        TelephonyManager telephonyManager = null;
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (Build.VERSION.SDK_INT < 23 || AbstractC1388a.m6959a(context, "android.permission.READ_PHONE_STATE") == 0) {
                Object systemService2 = context.getSystemService("phone");
                if (systemService2 instanceof TelephonyManager) {
                    telephonyManager = (TelephonyManager) systemService2;
                }
                if (telephonyManager == null) {
                    return 0;
                }
                int networkType = telephonyManager.getNetworkType();
                if (networkType != 1) {
                    if (networkType != 2) {
                        if (networkType != 4) {
                            if (networkType == 13 || networkType == 15) {
                                return 5;
                            }
                            switch (networkType) {
                                case 7:
                                    return 3;
                                case 8:
                                case 9:
                                case 10:
                                    return 2;
                            }
                        }
                    } else {
                        return 3;
                    }
                }
                return 4;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static final String m118268c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return f112061a.m118274b(context, "wlan0");
    }

    /* renamed from: d */
    public static final boolean m118269d() {
        try {
            Object systemService = CoreUtility.getAppContext().getSystemService("connectivity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            if (AbstractC1434a.m7332a(connectivityManager)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m118270e() {
        try {
            Object systemService = CoreUtility.getAppContext().getSystemService("connectivity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                return false;
            }
            if (!activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m118271f() {
        return m118273h(false, 1, null);
    }

    /* renamed from: g */
    public static final boolean m118272g(boolean z11) {
        try {
            if (AbstractC20626a.m107393i(CoreUtility.getAppContext())) {
                return true;
            }
            if (z11) {
                ToastUtils.m89262j();
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m118273h(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m118272g(z11);
    }

    /* renamed from: b */
    public final String m118274b(Context context, String str) {
        boolean m127126v;
        AbstractC19074t.m100208f(context, "context");
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            AbstractC19074t.m100207e(list, "list(...)");
            for (NetworkInterface networkInterface : list) {
                if (str != null) {
                    m127126v = AbstractC24341v.m127126v(networkInterface.getName(), str, true);
                    if (m127126v) {
                    }
                }
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    return "";
                }
                StringBuilder sb2 = new StringBuilder();
                for (byte b11 : hardwareAddress) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    sb2.append(format);
                }
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                String sb3 = sb2.toString();
                AbstractC19074t.m100207e(sb3, "toString(...)");
                return sb3;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("zacPref", 0);
        if (sharedPreferences.getString("gen_wifi_mac", null) == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("gen_wifi_mac", UUID.randomUUID().toString());
            edit.commit();
        }
        return "";
    }
}
