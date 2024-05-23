package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.q0 */
/* loaded from: classes.dex */
public class C6639q0 {

    /* renamed from: e */
    private static C6639q0 f36684e;

    /* renamed from: a */
    private String f36685a = null;

    /* renamed from: b */
    private Boolean f36686b = null;

    /* renamed from: c */
    private Boolean f36687c = null;

    /* renamed from: d */
    private final Queue f36688d = new ArrayDeque();

    private C6639q0() {
    }

    /* renamed from: a */
    private int m33931a(Context context, Intent intent) {
        ComponentName startService;
        String m33933f = m33933f(context, intent);
        if (m33933f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Restricting intent to a specific service: ");
                sb2.append(m33933f);
            }
            intent.setClassName(context.getPackageName(), m33933f);
        }
        try {
            if (m33936e(context)) {
                startService = AbstractC6604b1.m33785h(context, intent);
            } else {
                startService = context.startService(intent);
            }
            if (startService == null) {
                return 404;
            }
            return -1;
        } catch (IllegalStateException e11) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to start service while in background: ");
            sb3.append(e11);
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized C6639q0 m33932b() {
        C6639q0 c6639q0;
        synchronized (C6639q0.class) {
            try {
                if (f36684e == null) {
                    f36684e = new C6639q0();
                }
                c6639q0 = f36684e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6639q0;
    }

    /* renamed from: f */
    private synchronized String m33933f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f36685a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f36685a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f36685a = serviceInfo.name;
                    }
                    return this.f36685a;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb2.append(serviceInfo.packageName);
                sb2.append("/");
                sb2.append(serviceInfo.name);
                return null;
            }
            return null;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent m33934c() {
        return (Intent) this.f36688d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m33935d(Context context) {
        boolean z11;
        if (this.f36687c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f36687c = Boolean.valueOf(z11);
        }
        this.f36686b.booleanValue();
        return this.f36687c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m33936e(Context context) {
        boolean z11;
        if (this.f36686b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f36686b = Boolean.valueOf(z11);
        }
        this.f36686b.booleanValue();
        return this.f36686b.booleanValue();
    }

    /* renamed from: g */
    public int m33937g(Context context, Intent intent) {
        this.f36688d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m33931a(context, intent2);
    }
}
