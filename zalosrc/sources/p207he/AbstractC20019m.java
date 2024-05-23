package p207he;

import android.content.Context;
import android.os.Build;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import com.android.internal.telephony.ITelephony;
import com.android.internal.telephony.msim.ITelephonyMSim;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.lang.reflect.Method;
import me0.AbstractC23057e7;
import mm0.AbstractC23350e;

/* renamed from: he.m */
/* loaded from: classes3.dex */
public abstract class AbstractC20019m {

    /* renamed from: a */
    private static final String f98403a = "m";

    /* renamed from: a */
    public static String[] m103893a() {
        int phoneCount;
        String deviceId;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) CoreUtility.getAppContext().getSystemService("phone");
            AbstractC20110a.m104541j("Default device ID: " + telephonyManager.getDeviceId(), new Object[0]);
            if (Build.VERSION.SDK_INT >= 23) {
                phoneCount = telephonyManager.getPhoneCount();
                AbstractC20110a.m104541j("Sim count: " + phoneCount, new Object[0]);
                if (phoneCount == 0) {
                    return null;
                }
                String[] strArr = new String[phoneCount];
                for (int i11 = 0; i11 < phoneCount; i11++) {
                    deviceId = telephonyManager.getDeviceId(i11);
                    strArr[i11] = deviceId;
                    AbstractC20110a.m104541j("Sim %d: %s", Integer.valueOf(i11), strArr[i11]);
                }
                return strArr;
            }
            return new String[]{telephonyManager.getDeviceId()};
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static int m103894b(Context context) {
        int i11;
        int i12 = 1;
        try {
            if (AbstractC23057e7.m118298e()) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", new Class[0]);
                declaredMethod.setAccessible(true);
                ITelephony iTelephony = (ITelephony) declaredMethod.invoke(telephonyManager, new Object[0]);
                int callState = iTelephony.getCallState();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("state:");
                sb2.append(callState);
                i11 = iTelephony.endCall();
            } else {
                i11 = 0;
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122776f(f98403a, th2);
            i11 = 2;
        }
        if (i11 != 0 && i11 != 2) {
            return i11;
        }
        try {
            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
            Method declaredMethod2 = Class.forName(telephonyManager2.getClass().getName()).getDeclaredMethod("getITelephonyMSim", new Class[0]);
            declaredMethod2.setAccessible(true);
            if (!((ITelephonyMSim) declaredMethod2.invoke(telephonyManager2, new Object[0])).endCall(0)) {
                i12 = i11;
            }
            return i12;
        } catch (Throwable th3) {
            th3.printStackTrace();
            return 2;
        }
    }

    /* renamed from: c */
    public static int m103895c(Context context) {
        boolean endCall;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
                if (telecomManager != null) {
                    endCall = telecomManager.endCall();
                    if (endCall) {
                        return 1;
                    }
                }
                return 0;
            } catch (Throwable th2) {
                AbstractC23350e.m122776f(f98403a, th2);
                th2.printStackTrace();
                return 2;
            }
        }
        return m103894b(context);
    }
}
