package me0;

import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.zviews.C15519cq;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p173fz.C19172a;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import th.AbstractC26683d;
import vg.AbstractC28207v1;

/* renamed from: me0.e7 */
/* loaded from: classes.dex */
public abstract class AbstractC23057e7 {

    /* renamed from: a */
    static Boolean f112064a;

    /* renamed from: a */
    public static int m118294a() {
        Intent registerReceiver = MainApplication.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                return (intExtra * 100) / intExtra2;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m118295b() {
        int m3947k1 = AbstractC0924m0.m3947k1();
        if (m3947k1 < -1) {
            int m121143L = AbstractC23309i.m121143L();
            AbstractC0924m0.m3489Uh(m121143L);
            return m121143L;
        }
        return m3947k1;
    }

    /* renamed from: c */
    public static boolean m118296c() {
        if (m118295b() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m118297d() {
        if (m118295b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m118298e() {
        if (Build.VERSION.SDK_INT >= 31 && AbstractC1388a.m6959a(MainApplication.getAppContext(), "android.permission.READ_PHONE_STATE") != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m118299f() {
        if (C19172a.m100600k("safety@zinstant@loginHistory@deviceHistory@enableZinstant", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m118300g(Context context) {
        if (m118298e()) {
            int callState = ((TelephonyManager) context.getSystemService("phone")).getCallState();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isInGSMCall: callState = ");
            sb2.append(callState);
            if (callState == 1 || callState == 2) {
                return true;
            }
            return false;
        }
        return m118303j(context);
    }

    /* renamed from: h */
    public static boolean m118301h() {
        return AbstractC26683d.f126400s;
    }

    /* renamed from: i */
    public static boolean m118302i() {
        float f11;
        boolean z11;
        if (f112064a == null) {
            try {
                f11 = Settings.Global.getFloat(MainApplication.getAppContext().getContentResolver(), "animator_duration_scale", 0.0f);
            } catch (Exception e11) {
                e11.printStackTrace();
                f11 = 1.0f;
            }
            if (f11 > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            f112064a = Boolean.valueOf(z11);
        }
        return f112064a.booleanValue();
    }

    /* renamed from: j */
    public static boolean m118303j(Context context) {
        if (((AudioManager) context.getSystemService("audio")).getMode() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m118304k(Context context) {
        int i11 = Settings.System.getInt(context.getContentResolver(), "wifi_sleep_policy", 2);
        NetworkInfo.State state = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).getState();
        if (i11 != 2 && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static void m118305l(boolean z11) {
        AbstractC0924m0.m3489Uh(z11 ? 1 : 0);
    }

    /* renamed from: m */
    public static void m118306m(InterfaceC27218a interfaceC27218a) {
        try {
            JSONObject m100602m = C19172a.m100602m("safety@zinstant@loginHistory@deviceHistory@zinstantActionData");
            if (m100602m != null) {
                AbstractC28207v1.m141875H0(m100602m, interfaceC27218a, null, null, null, 0, new C15519cq());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public static void m118307n(Context context) {
        try {
            context.startActivity(new Intent("android.settings.WIFI_IP_SETTINGS").addFlags(268435456));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("", e11);
        }
    }
}
