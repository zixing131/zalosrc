package wf0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wf0.c */
/* loaded from: classes5.dex */
public abstract class AbstractC28958c {

    /* renamed from: a */
    private static String f134043a;

    /* renamed from: a */
    public static String m144626a(Context context) {
        String str;
        String str2 = f134043a;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            str = resolveActivity.activityInfo.packageName;
        } else {
            str = null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f134043a = null;
        } else if (arrayList.size() == 1) {
            f134043a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str) && !m144627b(context, intent) && arrayList.contains(str)) {
            f134043a = str;
        } else if (arrayList.contains("com.android.chrome")) {
            f134043a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f134043a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f134043a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f134043a = "com.google.android.apps.chrome";
        }
        return f134043a;
    }

    /* renamed from: b */
    private static boolean m144627b(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            AbstractC20110a.m104538g("Runtime exception while getting specialized handlers", new Object[0]);
        }
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
