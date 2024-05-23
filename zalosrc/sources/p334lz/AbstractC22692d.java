package p334lz;

import android.app.ActivityManager;
import android.content.Context;
import bn0.AbstractC2933b;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: lz.d */
/* loaded from: classes4.dex */
public abstract class AbstractC22692d {
    /* renamed from: a */
    public static final String m117370a(Context context, int i11) {
        Object systemService;
        AbstractC19074t.m100208f(context, "context");
        try {
            systemService = context.getSystemService("activity");
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
        if (systemService != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i11) {
                    String str = runningAppProcessInfo.processName;
                    AbstractC19074t.m100207e(str, "info.processName");
                    return str;
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
                            AbstractC19074t.m100207e(sb3, "processName.toString()");
                            AbstractC2933b.m13890a(bufferedReader, null);
                            return sb3;
                        }
                    }
                } finally {
                }
            } catch (Throwable th3) {
                AbstractC20110a.f98889a.mo104552e(th3);
                return "";
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }
}
