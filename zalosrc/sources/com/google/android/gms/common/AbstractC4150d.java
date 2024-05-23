package com.google.android.gms.common;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.AbstractC4233x0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p229i5.AbstractC20289j;
import p229i5.AbstractC20295p;
import p229i5.AbstractC20300u;
import p229i5.AbstractC20302w;
import p289k5.C21472e;
import p632x4.AbstractC29321g;
import p667y2.C30268e;

/* renamed from: com.google.android.gms.common.d */
/* loaded from: classes.dex */
public abstract class AbstractC4150d {

    /* renamed from: a */
    public static final int f16480a = 12451000;

    /* renamed from: c */
    private static boolean f16482c = false;

    /* renamed from: d */
    static boolean f16483d = false;

    /* renamed from: b */
    static final AtomicBoolean f16481b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f16484e = new AtomicBoolean();

    /* renamed from: a */
    public static void m19577a(Context context) {
        if (f16481b.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: b */
    public static void m19578b(Context context, int i11) {
        int mo19201j = C4148b.m19567h().mo19201j(context, i11);
        if (mo19201j != 0) {
            Intent mo19197d = C4148b.m19567h().mo19197d(context, mo19201j, C30268e.f140632a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(mo19201j);
            if (mo19197d == null) {
                throw new GooglePlayServicesNotAvailableException(mo19201j);
            }
            throw new GooglePlayServicesRepairableException(mo19201j, "Google Play Services not available", mo19197d);
        }
    }

    /* renamed from: c */
    public static int m19579c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static String m19580d(int i11) {
        return ConnectionResult.m19183Q(i11);
    }

    /* renamed from: e */
    public static Context m19581e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Resources m19582f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m19583g(Context context) {
        if (!f16483d) {
            try {
                PackageInfo m111064f = C21472e.m111067a(context).m111064f("com.google.android.gms", 64);
                C4155e.m19594a(context);
                if (m111064f != null && !C4155e.m19596e(m111064f, false) && C4155e.m19596e(m111064f, true)) {
                    f16482c = true;
                } else {
                    f16482c = false;
                }
                f16483d = true;
            } catch (PackageManager.NameNotFoundException unused) {
                f16483d = true;
            } catch (Throwable th2) {
                f16483d = true;
                throw th2;
            }
        }
        if (!f16482c && AbstractC20289j.m105931e()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static int m19584h(Context context, int i11) {
        boolean z11;
        boolean z12;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(AbstractC29321g.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f16484e.get()) {
            int m19809a = AbstractC4233x0.m19809a(context);
            if (m19809a != 0) {
                if (m19809a != f16480a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(m19809a);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!AbstractC20289j.m105933g(context) && !AbstractC20289j.m105935i(context)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4205o.m19712a(z12);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z11) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C4155e.m19594a(context);
            if (!C4155e.m19596e(packageInfo2, true)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else {
                if (z11) {
                    AbstractC4205o.m19722k(packageInfo);
                    if (!C4155e.m19596e(packageInfo, true)) {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                    }
                }
                if (z11 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                } else {
                    if (AbstractC20302w.m105968a(packageInfo2.versionCode) < AbstractC20302w.m105968a(i11)) {
                        int i12 = packageInfo2.versionCode;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i11);
                        sb2.append(" but found ");
                        sb2.append(i12);
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e11) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                            return 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }

    /* renamed from: i */
    public static boolean m19585i(Context context, int i11) {
        if (i11 == 18) {
            return true;
        }
        if (i11 == 1) {
            return m19589m(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m19586j(Context context) {
        if (AbstractC20295p.m105949c()) {
            Object systemService = context.getSystemService("user");
            AbstractC4205o.m19722k(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m19587k(int i11) {
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 9;
    }

    /* renamed from: l */
    public static boolean m19588l(Context context, int i11, String str) {
        return AbstractC20300u.m105964b(context, i11, str);
    }

    /* renamed from: m */
    public static boolean m19589m(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (AbstractC20295p.m105952f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled && !m19586j(context)) {
            return true;
        }
        return false;
    }
}
