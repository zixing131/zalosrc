package p229i5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import p289k5.C21472e;

/* renamed from: i5.v */
/* loaded from: classes2.dex */
public abstract class AbstractC20301v {

    /* renamed from: a */
    private static final int f100251a = Process.myUid();

    /* renamed from: b */
    private static final Method f100252b;

    /* renamed from: c */
    private static final Method f100253c;

    /* renamed from: d */
    private static final Method f100254d;

    /* renamed from: e */
    private static final Method f100255e;

    /* renamed from: f */
    private static final Method f100256f;

    /* renamed from: g */
    private static final Method f100257g;

    /* renamed from: h */
    private static final Method f100258h;

    /* renamed from: i */
    private static final Method f100259i;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|2|3|4|(21:47|48|7|8|9|10|11|12|13|(12:39|40|16|(9:35|36|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004e, code lost:            r0 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003e, code lost:            r0 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f100252b = method;
        if (AbstractC20295p.m105949c()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
            f100253c = method2;
            Method method7 = WorkSource.class.getMethod("size", new Class[0]);
            f100254d = method7;
            Method method8 = WorkSource.class.getMethod("get", Integer.TYPE);
            f100255e = method8;
            if (AbstractC20295p.m105949c()) {
                try {
                    method3 = WorkSource.class.getMethod("getName", Integer.TYPE);
                } catch (Exception unused3) {
                }
                f100256f = method3;
                if (AbstractC20295p.m105956j()) {
                    try {
                        method4 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
                    } catch (Exception unused4) {
                    }
                    f100257g = method4;
                    if (AbstractC20295p.m105956j()) {
                        try {
                            method5 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
                        } catch (Exception unused5) {
                        }
                        f100258h = method5;
                        if (AbstractC20295p.m105956j()) {
                            try {
                                method6 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                                method6.setAccessible(true);
                            } catch (Exception unused6) {
                            }
                        }
                        f100259i = method6;
                    }
                    method5 = null;
                    f100258h = method5;
                    if (AbstractC20295p.m105956j()) {
                    }
                    f100259i = method6;
                }
                method4 = null;
                f100257g = method4;
                if (AbstractC20295p.m105956j()) {
                }
                method5 = null;
                f100258h = method5;
                if (AbstractC20295p.m105956j()) {
                }
                f100259i = method6;
            }
            method3 = null;
            f100256f = method3;
            if (AbstractC20295p.m105956j()) {
            }
            method4 = null;
            f100257g = method4;
            if (AbstractC20295p.m105956j()) {
            }
            method5 = null;
            f100258h = method5;
            if (AbstractC20295p.m105956j()) {
            }
            f100259i = method6;
        }
        method2 = null;
        f100253c = method2;
        Method method72 = WorkSource.class.getMethod("size", new Class[0]);
        f100254d = method72;
        Method method82 = WorkSource.class.getMethod("get", Integer.TYPE);
        f100255e = method82;
        if (AbstractC20295p.m105949c()) {
        }
        method3 = null;
        f100256f = method3;
        if (AbstractC20295p.m105956j()) {
        }
        method4 = null;
        f100257g = method4;
        if (AbstractC20295p.m105956j()) {
        }
        method5 = null;
        f100258h = method5;
        if (AbstractC20295p.m105956j()) {
        }
        f100259i = method6;
    }

    /* renamed from: a */
    public static void m105965a(WorkSource workSource, int i11, String str) {
        Method method = f100253c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i11), str);
                return;
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                return;
            }
        }
        Method method2 = f100252b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i11));
            } catch (Exception e12) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e12);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m105966b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo m111061c = C21472e.m111067a(context).m111061c(str, 0);
                if (m111061c == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i11 = m111061c.uid;
                WorkSource workSource = new WorkSource();
                m105965a(workSource, i11, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m105967c(Context context) {
        if (context == null || context.getPackageManager() == null || C21472e.m111067a(context).m111060b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
