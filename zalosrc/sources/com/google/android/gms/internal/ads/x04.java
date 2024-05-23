package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class x04 {

    /* renamed from: a */
    private static String f30296a;

    /* renamed from: a */
    public static String m27799a(Context context) {
        String str;
        String str2 = f30296a;
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
            f30296a = null;
        } else if (arrayList.size() == 1) {
            f30296a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
                if (arrayList.contains(str)) {
                    f30296a = str;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f30296a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f30296a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f30296a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f30296a = "com.google.android.apps.chrome";
            }
        }
        return f30296a;
    }
}
