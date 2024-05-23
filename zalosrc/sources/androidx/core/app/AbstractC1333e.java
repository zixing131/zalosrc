package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.e */
/* loaded from: classes2.dex */
public abstract class AbstractC1333e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.e$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static <T> T m6683a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m6684b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m6685c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m6686d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.e$b */
    /* loaded from: classes2.dex */
    static class b {
        /* renamed from: a */
        static int m6687a(AppOpsManager appOpsManager, String str, int i11, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i11, str2);
        }

        /* renamed from: b */
        static String m6688b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m6689c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m6680a(Context context, int i11, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m6689c = b.m6689c(context);
            int m6687a = b.m6687a(m6689c, str, Binder.getCallingUid(), str2);
            if (m6687a != 0) {
                return m6687a;
            }
            return b.m6687a(m6689c, str, i11, b.m6688b(context));
        }
        return m6681b(context, str, str2);
    }

    /* renamed from: b */
    public static int m6681b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m6685c((AppOpsManager) a.m6683a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: c */
    public static String m6682c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m6686d(str);
        }
        return null;
    }
}
