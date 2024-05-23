package mm0;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.zing.zalocore.CoreUtility;
import fm0.InterfaceC19024a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* renamed from: mm0.d */
/* loaded from: classes.dex */
public abstract class AbstractC23349d {

    /* renamed from: a */
    public static final String f113570a = "CoreUtils";

    /* renamed from: b */
    public static final SimpleDateFormat f113571b = new SimpleDateFormat("dd/MM/yyyy, H:mmaass");

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:            if (r1.getClassName().trim().equals("com.zing.zalo.ui.RetryMsgPopupActivity") == false) goto L29;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int m122763a() {
        ComponentName componentName;
        int i11;
        ComponentName componentName2;
        ComponentName componentName3;
        ComponentName componentName4;
        ComponentName componentName5;
        ComponentName componentName6;
        synchronized (AbstractC23349d.class) {
            InterfaceC19024a m93148a = CoreUtility.m93148a();
            if (m93148a != null) {
                return m93148a.mo100081i();
            }
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) CoreUtility.getAppContext().getSystemService("activity")).getRunningTasks(1024);
            if (!runningTasks.isEmpty()) {
                String packageName = CoreUtility.getAppContext().getPackageName();
                int size = runningTasks.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(i12);
                    componentName = runningTaskInfo.baseActivity;
                    if (packageName.equals(componentName.getPackageName())) {
                        i11 = runningTaskInfo.numActivities;
                        if (i11 == 0) {
                            return 0;
                        }
                        if (i11 == 1) {
                            componentName3 = runningTaskInfo.topActivity;
                            if (!componentName3.getClassName().trim().equals("com.zing.zalo.ui.MessagePopupActivity")) {
                                componentName4 = runningTaskInfo.topActivity;
                                if (!componentName4.getClassName().trim().equals("com.zing.zalo.ui.ZaloUserPopupActivity")) {
                                    componentName5 = runningTaskInfo.topActivity;
                                }
                            }
                            return 1;
                        }
                        componentName2 = runningTaskInfo.topActivity;
                        if (!componentName2.getClassName().trim().equals("com.zing.zalo.ui.MessageHintSuggestActivity")) {
                            return 2;
                        }
                        return 1;
                    }
                    if (i12 == 0) {
                        componentName6 = runningTaskInfo.topActivity;
                        if (!componentName6.getPackageName().equals(CoreUtility.getAppContext().getPackageName())) {
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: b */
    public static String m122764b() {
        try {
            String deviceId = ((TelephonyManager) CoreUtility.getAppContext().getSystemService("phone")).getDeviceId();
            if (deviceId == null) {
                return "000000";
            }
            return deviceId;
        } catch (Exception unused) {
            return "000000";
        }
    }

    /* renamed from: c */
    public static String m122765c(long j11) {
        return f113571b.format(new Date(j11)).toString();
    }

    /* renamed from: d */
    public static int m122766d() {
        try {
            String networkOperator = ((TelephonyManager) CoreUtility.getAppContext().getSystemService("phone")).getNetworkOperator();
            if (networkOperator == null || networkOperator.length() <= 0) {
                return -1;
            }
            return Integer.parseInt(networkOperator);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public static String m122767e() {
        try {
            return Build.MANUFACTURER + "_" + Build.MODEL + "_" + Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:            if (m122770h() != false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:            return 2;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m122768f() {
        try {
            int m122763a = m122763a();
            if (m122763a == 0 && m122770h()) {
                return 2;
            }
            if (m122763a == 0) {
                if (!m122770h()) {
                    return 3;
                }
            }
            if (m122763a <= 0) {
                return 3;
            }
            return 1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 3;
        }
    }

    /* renamed from: g */
    public static boolean m122769g() {
        int i11;
        try {
            i11 = Calendar.getInstance().get(11);
        } catch (Exception unused) {
        }
        if (i11 >= 2 && i11 <= 6) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m122770h() {
        try {
            return ((PowerManager) CoreUtility.getAppContext().getSystemService("power")).isScreenOn();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f113570a, e11);
            return false;
        }
    }
}
