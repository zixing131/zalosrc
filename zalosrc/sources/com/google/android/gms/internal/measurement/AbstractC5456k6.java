package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.measurement.k6 */
/* loaded from: classes.dex */
public abstract class AbstractC5456k6 {

    /* renamed from: a */
    static volatile AbstractC5355e7 f32454a = AbstractC5355e7.m29081c();

    /* renamed from: b */
    private static final Object f32455b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:            if ("com.google.android.gms".equals(r0.packageName) != false) goto L29;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m29362a(Context context, Uri uri) {
        int i11;
        String authority = uri.getAuthority();
        boolean z11 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f32454a.mo28879b()) {
            return ((Boolean) f32454a.mo28878a()).booleanValue();
        }
        synchronized (f32455b) {
            try {
                if (f32454a.mo28879b()) {
                    return ((Boolean) f32454a.mo28878a()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    PackageManager packageManager = context.getPackageManager();
                    if (Build.VERSION.SDK_INT < 29) {
                        i11 = 0;
                    } else {
                        i11 = 268435456;
                    }
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.phenotype", i11);
                    if (resolveContentProvider != null) {
                    }
                    f32454a = AbstractC5355e7.m29082d(Boolean.valueOf(z11));
                    return ((Boolean) f32454a.mo28878a()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z11 = true;
                }
                f32454a = AbstractC5355e7.m29082d(Boolean.valueOf(z11));
                return ((Boolean) f32454a.mo28878a()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
