package p565v2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.AbstractC2151i0;
import androidx.work.AbstractC2253u;
import androidx.work.C2138c;
import fn0.AbstractC19074t;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: v2.u */
/* loaded from: classes.dex */
public abstract class AbstractC27467u {

    /* renamed from: a */
    private static final String f129200a;

    static {
        String m11897i = AbstractC2253u.m11897i("ProcessUtils");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"ProcessUtils\")");
        f129200a = m11897i;
    }

    /* renamed from: a */
    private static final String m140521a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return C27440a.f129137a.m140463a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC2151i0.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            AbstractC19074t.m100205c(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            AbstractC2253u.m11895e().mo11899b(f129200a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo == null) {
            return null;
        }
        return runningAppProcessInfo.processName;
    }

    /* renamed from: b */
    public static final boolean m140522b(Context context, C2138c c2138c) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c2138c, "configuration");
        String m140521a = m140521a(context);
        String m11472c = c2138c.m11472c();
        if (m11472c != null && m11472c.length() != 0) {
            return AbstractC19074t.m100204b(m140521a, c2138c.m11472c());
        }
        return AbstractC19074t.m100204b(m140521a, context.getApplicationInfo().processName);
    }
}
