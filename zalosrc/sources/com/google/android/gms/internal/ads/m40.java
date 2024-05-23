package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m40 {
    /* renamed from: a */
    public static final Intent m24459a(Uri uri, Context context, C4830od c4830od, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* renamed from: b */
    public static final Intent m24460b(Intent intent, ResolveInfo resolveInfo, Context context, C4830od c4830od, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    /* renamed from: c */
    public static final ResolveInfo m24461c(Intent intent, Context context, C4830od c4830od, View view) {
        return m24462d(intent, new ArrayList(), context, c4830od, view);
    }

    /* renamed from: d */
    public static final ResolveInfo m24462d(Intent intent, ArrayList arrayList, Context context, C4830od c4830od, View view) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th2) {
            zzt.zzo().m22945t(th2, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= queryIntentActivities.size()) {
                    break;
                }
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i11).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i11++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}
