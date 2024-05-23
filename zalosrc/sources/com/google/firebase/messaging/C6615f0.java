package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.firebase.C6576e;
import java.util.List;
import p229i5.AbstractC20295p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.f0 */
/* loaded from: classes.dex */
public class C6615f0 {

    /* renamed from: a */
    private final Context f36643a;

    /* renamed from: b */
    private String f36644b;

    /* renamed from: c */
    private String f36645c;

    /* renamed from: d */
    private int f36646d;

    /* renamed from: e */
    private int f36647e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6615f0(Context context) {
        this.f36643a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m33848c(C6576e c6576e) {
        String m33681d = c6576e.m33614m().m33681d();
        if (m33681d != null) {
            return m33681d;
        }
        String m33680c = c6576e.m33614m().m33680c();
        if (!m33680c.startsWith("1:")) {
            return m33680c;
        }
        String[] split = m33680c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m33849f(String str) {
        try {
            return this.f36643a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to find package ");
            sb2.append(e11);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m33850h() {
        PackageInfo m33849f = m33849f(this.f36643a.getPackageName());
        if (m33849f != null) {
            this.f36644b = Integer.toString(m33849f.versionCode);
            this.f36645c = m33849f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m33851a() {
        try {
            if (this.f36644b == null) {
                m33850h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36644b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String m33852b() {
        try {
            if (this.f36645c == null) {
                m33850h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36645c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m33853d() {
        PackageInfo m33849f;
        try {
            if (this.f36646d == 0 && (m33849f = m33849f("com.google.android.gms")) != null) {
                this.f36646d = m33849f.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36646d;
    }

    /* renamed from: e */
    synchronized int m33854e() {
        int i11 = this.f36647e;
        if (i11 != 0) {
            return i11;
        }
        PackageManager packageManager = this.f36643a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!AbstractC20295p.m105955i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f36647e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f36647e = 2;
            return 2;
        }
        if (AbstractC20295p.m105955i()) {
            this.f36647e = 2;
        } else {
            this.f36647e = 1;
        }
        return this.f36647e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m33855g() {
        if (m33854e() != 0) {
            return true;
        }
        return false;
    }
}
