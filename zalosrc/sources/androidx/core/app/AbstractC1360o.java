package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: androidx.core.app.o */
/* loaded from: classes2.dex */
public abstract class AbstractC1360o {

    /* renamed from: androidx.core.app.o$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static Intent m6793a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        static boolean m6794b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        static boolean m6795c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m6787a(Activity activity) {
        Intent m6793a = a.m6793a(activity);
        if (m6793a != null) {
            return m6793a;
        }
        String m6789c = m6789c(activity);
        if (m6789c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m6789c);
        try {
            if (m6790d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getParentActivityIntent: bad parentActivityName '");
            sb2.append(m6789c);
            sb2.append("' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m6788b(Context context, ComponentName componentName) {
        String m6790d = m6790d(context, componentName);
        if (m6790d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m6790d);
        if (m6790d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m6789c(Activity activity) {
        try {
            return m6790d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* renamed from: d */
    public static String m6790d(Context context, ComponentName componentName) {
        int i11;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            i11 = 269222528;
        } else if (i12 >= 24) {
            i11 = 787072;
        } else {
            i11 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i11);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* renamed from: e */
    public static void m6791e(Activity activity, Intent intent) {
        a.m6794b(activity, intent);
    }

    /* renamed from: f */
    public static boolean m6792f(Activity activity, Intent intent) {
        return a.m6795c(activity, intent);
    }
}
