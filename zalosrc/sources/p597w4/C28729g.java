package p597w4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p229i5.AbstractC20295p;
import p289k5.C21472e;

/* renamed from: w4.g */
/* loaded from: classes.dex */
public final class C28729g {

    /* renamed from: a */
    private final Context f133259a;

    /* renamed from: b */
    private int f133260b;

    /* renamed from: c */
    private int f133261c = 0;

    public C28729g(Context context) {
        this.f133259a = context;
    }

    /* renamed from: a */
    public final synchronized int m143865a() {
        PackageInfo packageInfo;
        if (this.f133260b == 0) {
            try {
                packageInfo = C21472e.m111067a(this.f133259a).m111064f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e11) {
                String valueOf = String.valueOf(e11);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f133260b = packageInfo.versionCode;
            }
        }
        return this.f133260b;
    }

    /* renamed from: b */
    public final synchronized int m143866b() {
        int i11 = this.f133261c;
        if (i11 != 0) {
            return i11;
        }
        PackageManager packageManager = this.f133259a.getPackageManager();
        if (C21472e.m111067a(this.f133259a).m111060b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i12 = 1;
        if (!AbstractC20295p.m105955i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f133261c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f133261c = 2;
            return 2;
        }
        if (AbstractC20295p.m105955i()) {
            this.f133261c = 2;
            i12 = 2;
        } else {
            this.f133261c = 1;
        }
        return i12;
    }
}
