package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import androidx.profileinstaller.ExecutorC1852h;
import java.util.concurrent.Executor;
import p229i5.AbstractC20295p;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC6629l0 {
    /* renamed from: b */
    private static boolean m33907b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m33908c(Context context) {
        if (AbstractC6631m0.m33920b(context)) {
            return;
        }
        m33910e(new ExecutorC1852h(), context, m33911f(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m33909d(Context context, boolean z11, C22890k c22890k) {
        Object systemService;
        String notificationDelegate;
        try {
            if (!m33907b(context)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error configuring notification delegate for package ");
                sb2.append(context.getPackageName());
                return;
            }
            AbstractC6631m0.m33921c(context, true);
            systemService = context.getSystemService((Class<Object>) NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (z11) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            c22890k.m117598e(null);
        }
    }

    /* renamed from: e */
    static AbstractC22888j m33910e(Executor executor, final Context context, final boolean z11) {
        if (!AbstractC20295p.m105957k()) {
            return AbstractC22894m.m117604f(null);
        }
        final C22890k c22890k = new C22890k();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.k0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6629l0.m33909d(context, z11, c22890k);
            }
        });
        return c22890k.m117594a();
    }

    /* renamed from: f */
    private static boolean m33911f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
