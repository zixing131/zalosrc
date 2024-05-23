package zl0;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: zl0.e */
/* loaded from: classes7.dex */
public abstract class AbstractC32228e {
    /* renamed from: a */
    public static String m155420a() {
        try {
            return C32224a.m155398c().m155399a("ro.miui.ui.version.name");
        } catch (IOException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m155421b(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOp", cls2, cls2, String.class);
            if (method == null) {
                return false;
            }
            if (((Integer) method.invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m155422c() {
        try {
            C32224a m155398c = C32224a.m155398c();
            if (m155398c.m155400b("ro.miui.ui.version.code", null) == null && m155398c.m155400b("ro.miui.ui.version.name", null) == null) {
                if (m155398c.m155400b("ro.miui.internal.storage", null) == null) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m155423d() {
        return m155420a().equals("V5");
    }

    /* renamed from: e */
    public static boolean m155424e() {
        return Build.MANUFACTURER.toLowerCase().contains("oppo");
    }

    /* renamed from: f */
    public static Intent m155425f(Context context, String str) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + str));
        intent.addCategory("android.intent.category.DEFAULT");
        if (m155423d()) {
            return intent;
        }
        Intent m155427h = m155427h(context, str);
        if (m155427h != null && m155427h.resolveActivity(context.getPackageManager()) != null) {
            return m155427h;
        }
        return intent;
    }

    /* renamed from: g */
    public static Intent m155426g(Context context, String str) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + str));
        intent.addCategory("android.intent.category.DEFAULT");
        if (m155423d()) {
            return intent;
        }
        Intent m155428i = m155428i(context, str);
        if (m155428i != null) {
            if (m155428i.resolveActivity(context.getPackageManager()) != null) {
                return m155428i;
            }
            return intent;
        }
        throw new IllegalArgumentException("Illegal Argument");
    }

    /* renamed from: h */
    public static Intent m155427h(Context context, String str) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        if ("V5".equals(m155420a())) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                intent.setClassName("com.android.settings", "com.miui.securitycenter.permission.AppPermissionsEditor");
                intent.putExtra("extra_package_uid", packageInfo.applicationInfo.uid);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } else {
            try {
                context.getPackageManager().getPackageInfo("com.miui.securitycenter", 1);
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                intent.putExtra("extra_pkgname", str);
            } catch (PackageManager.NameNotFoundException unused2) {
                return null;
            }
        }
        return intent;
    }

    /* renamed from: i */
    public static Intent m155428i(Context context, String str) {
        if (!"V8".equals(m155420a())) {
            return null;
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        try {
            context.getPackageManager().getPackageInfo("com.miui.securitycenter", 1);
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            intent.putExtra("extra_pkgname", str);
            return intent;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
