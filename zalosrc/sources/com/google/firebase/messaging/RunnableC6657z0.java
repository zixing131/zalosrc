package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.z0 */
/* loaded from: classes3.dex */
public class RunnableC6657z0 implements Runnable {

    /* renamed from: u */
    private static final Object f36742u = new Object();

    /* renamed from: v */
    private static Boolean f36743v;

    /* renamed from: w */
    private static Boolean f36744w;

    /* renamed from: p */
    private final Context f36745p;

    /* renamed from: q */
    private final C6615f0 f36746q;

    /* renamed from: r */
    private final PowerManager.WakeLock f36747r;

    /* renamed from: s */
    private final C6655y0 f36748s;

    /* renamed from: t */
    private final long f36749t;

    /* renamed from: com.google.firebase.messaging.z0$a */
    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC6657z0 f36750a;

        public a(RunnableC6657z0 runnableC6657z0) {
            this.f36750a = runnableC6657z0;
        }

        /* renamed from: a */
        public void m34000a() {
            RunnableC6657z0.m33991b();
            RunnableC6657z0.this.f36745p.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC6657z0 runnableC6657z0 = this.f36750a;
            if (runnableC6657z0 == null) {
                return;
            }
            if (!runnableC6657z0.m33998i()) {
                return;
            }
            RunnableC6657z0.m33991b();
            this.f36750a.f36748s.m33985l(this.f36750a, 0L);
            context.unregisterReceiver(this);
            this.f36750a = null;
        }
    }

    public RunnableC6657z0(C6655y0 c6655y0, Context context, C6615f0 c6615f0, long j11) {
        this.f36748s = c6655y0;
        this.f36745p = context;
        this.f36749t = j11;
        this.f36746q = c6615f0;
        this.f36747r = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: b */
    static /* synthetic */ boolean m33991b() {
        return m33999j();
    }

    /* renamed from: e */
    private static String m33994e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m33995f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f36742u) {
            try {
                Boolean bool = f36744w;
                if (bool == null) {
                    booleanValue = m33996g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f36744w = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    /* renamed from: g */
    private static boolean m33996g(Context context, String str, Boolean bool) {
        boolean z11;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && Log.isLoggable("FirebaseMessaging", 3)) {
            m33994e(str);
        }
        return z11;
    }

    /* renamed from: h */
    private static boolean m33997h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f36742u) {
            try {
                Boolean bool = f36743v;
                if (bool == null) {
                    booleanValue = m33996g(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f36743v = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    /* renamed from: i */
    public synchronized boolean m33998i() {
        NetworkInfo networkInfo;
        boolean z11;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f36745p.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z11 = true;
                }
            }
            z11 = false;
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    /* renamed from: j */
    private static boolean m33999j() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m33997h(this.f36745p)) {
            this.f36747r.acquire(AbstractC6611e.f36638a);
        }
        try {
            try {
                this.f36748s.m33986m(true);
            } catch (IOException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to sync topics. Won't retry sync. ");
                sb2.append(e11.getMessage());
                this.f36748s.m33986m(false);
                if (!m33997h(this.f36745p)) {
                    return;
                }
            }
            if (!this.f36746q.m33855g()) {
                this.f36748s.m33986m(false);
                if (m33997h(this.f36745p)) {
                    try {
                        this.f36747r.release();
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                }
                return;
            }
            if (m33995f(this.f36745p) && !m33998i()) {
                new a(this).m34000a();
                if (m33997h(this.f36745p)) {
                    try {
                        this.f36747r.release();
                        return;
                    } catch (RuntimeException unused2) {
                        return;
                    }
                }
                return;
            }
            if (this.f36748s.m33988p()) {
                this.f36748s.m33986m(false);
            } else {
                this.f36748s.m33989q(this.f36749t);
            }
            if (!m33997h(this.f36745p)) {
                return;
            }
            try {
                this.f36747r.release();
            } catch (RuntimeException unused3) {
            }
        } catch (Throwable th2) {
            if (m33997h(this.f36745p)) {
                try {
                    this.f36747r.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}
