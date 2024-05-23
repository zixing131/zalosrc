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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p256j5.ThreadFactoryC20918b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: classes.dex */
public class RunnableC6647u0 implements Runnable {

    /* renamed from: p */
    private final long f36708p;

    /* renamed from: q */
    private final PowerManager.WakeLock f36709q;

    /* renamed from: r */
    private final FirebaseMessaging f36710r;

    /* renamed from: s */
    ExecutorService f36711s = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20918b("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.u0$a */
    /* loaded from: classes3.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC6647u0 f36712a;

        public a(RunnableC6647u0 runnableC6647u0) {
            this.f36712a = runnableC6647u0;
        }

        /* renamed from: a */
        public void m33962a() {
            RunnableC6647u0.m33958c();
            this.f36712a.m33959b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC6647u0 runnableC6647u0 = this.f36712a;
            if (runnableC6647u0 == null || !runnableC6647u0.m33960d()) {
                return;
            }
            RunnableC6647u0.m33958c();
            this.f36712a.f36710r.m33729l(this.f36712a, 0L);
            this.f36712a.m33959b().unregisterReceiver(this);
            this.f36712a = null;
        }
    }

    public RunnableC6647u0(FirebaseMessaging firebaseMessaging, long j11) {
        this.f36710r = firebaseMessaging;
        this.f36708p = j11;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m33959b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f36709q = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m33958c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    Context m33959b() {
        return this.f36710r.m33730m();
    }

    /* renamed from: d */
    boolean m33960d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m33959b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    boolean m33961e() {
        try {
            if (this.f36710r.m33727j() == null) {
                return false;
            }
            return true;
        } catch (IOException e11) {
            if (C6600a0.m33765h(e11.getMessage())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Token retrieval failed: ");
                sb2.append(e11.getMessage());
                sb2.append(". Will retry token retrieval");
                return false;
            }
            if (e11.getMessage() == null) {
                return false;
            }
            throw e11;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C6639q0.m33932b().m33936e(m33959b())) {
            this.f36709q.acquire();
        }
        try {
            try {
                this.f36710r.m33724D(true);
            } catch (IOException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(e11.getMessage());
                sb2.append(". Won't retry the operation.");
                this.f36710r.m33724D(false);
                if (!C6639q0.m33932b().m33936e(m33959b())) {
                    return;
                }
            }
            if (!this.f36710r.m33734v()) {
                this.f36710r.m33724D(false);
                if (C6639q0.m33932b().m33936e(m33959b())) {
                    this.f36709q.release();
                    return;
                }
                return;
            }
            if (C6639q0.m33932b().m33935d(m33959b()) && !m33960d()) {
                new a(this).m33962a();
                if (C6639q0.m33932b().m33936e(m33959b())) {
                    this.f36709q.release();
                    return;
                }
                return;
            }
            if (m33961e()) {
                this.f36710r.m33724D(false);
            } else {
                this.f36710r.m33725G(this.f36708p);
            }
            if (!C6639q0.m33932b().m33936e(m33959b())) {
                return;
            }
            this.f36709q.release();
        } catch (Throwable th2) {
            if (C6639q0.m33932b().m33936e(m33959b())) {
                this.f36709q.release();
            }
            throw th2;
        }
    }
}
