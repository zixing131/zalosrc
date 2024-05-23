package me0;

import android.app.ActivityManager;
import android.content.Context;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/* renamed from: me0.l6 */
/* loaded from: classes.dex */
public abstract class AbstractC23133l6 {
    /* renamed from: a */
    public static String m118636a(Context context, int i11) {
        ActivityManager activityManager;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
        if (activityManager == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i11) {
                return runningAppProcessInfo.processName;
            }
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i11 + "/cmdline")));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb2.append((char) read);
                    } else {
                        String sb3 = sb2.toString();
                        bufferedReader.close();
                        return sb3;
                    }
                }
            } finally {
            }
        } catch (Throwable th3) {
            AbstractC20110a.m104539h(th3);
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m118637b(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String str2 = context.getPackageName() + str;
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (it.next().processName.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
