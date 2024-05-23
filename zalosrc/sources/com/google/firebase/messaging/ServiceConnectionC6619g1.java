package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.ServiceConnectionC6619g1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p198h5.C19879b;
import p256j5.ThreadFactoryC20918b;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p342m6.InterfaceC22878e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.g1 */
/* loaded from: classes3.dex */
public class ServiceConnectionC6619g1 implements ServiceConnection {

    /* renamed from: p */
    private final Context f36652p;

    /* renamed from: q */
    private final Intent f36653q;

    /* renamed from: r */
    private final ScheduledExecutorService f36654r;

    /* renamed from: s */
    private final Queue f36655s;

    /* renamed from: t */
    private BinderC6610d1 f36656t;

    /* renamed from: u */
    private boolean f36657u;

    /* renamed from: com.google.firebase.messaging.g1$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        final Intent f36658a;

        /* renamed from: b */
        private final C22890k f36659b = new C22890k();

        a(Intent intent) {
            this.f36658a = intent;
        }

        /* renamed from: f */
        public /* synthetic */ void m33888f() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Service took too long to process intent: ");
            sb2.append(this.f36658a.getAction());
            sb2.append(" Releasing WakeLock.");
            m33891d();
        }

        /* renamed from: c */
        void m33890c(ScheduledExecutorService scheduledExecutorService) {
            boolean z11;
            long j11;
            if ((this.f36658a.getFlags() & 268435456) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            RunnableC6613e1 runnableC6613e1 = new Runnable() { // from class: com.google.firebase.messaging.e1
                public /* synthetic */ RunnableC6613e1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC6619g1.a.this.m33888f();
                }
            };
            if (z11) {
                j11 = AbstractC6604b1.f36626a;
            } else {
                j11 = 9000;
            }
            m33892e().mo117573b(scheduledExecutorService, new InterfaceC22878e() { // from class: com.google.firebase.messaging.f1

                /* renamed from: a */
                public final /* synthetic */ ScheduledFuture f36648a;

                public /* synthetic */ C6616f1(ScheduledFuture scheduledFuture) {
                    r1 = scheduledFuture;
                }

                @Override // p342m6.InterfaceC22878e
                /* renamed from: a */
                public final void mo16804a(AbstractC22888j abstractC22888j) {
                    r1.cancel(false);
                }
            });
        }

        /* renamed from: d */
        public void m33891d() {
            this.f36659b.m117598e(null);
        }

        /* renamed from: e */
        AbstractC22888j m33892e() {
            return this.f36659b.m117594a();
        }
    }

    public ServiceConnectionC6619g1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC20918b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m33882a() {
        while (!this.f36655s.isEmpty()) {
            ((a) this.f36655s.poll()).m33891d();
        }
    }

    /* renamed from: b */
    private synchronized void m33883b() {
        while (!this.f36655s.isEmpty()) {
            try {
                BinderC6610d1 binderC6610d1 = this.f36656t;
                if (binderC6610d1 != null && binderC6610d1.isBinderAlive()) {
                    this.f36656t.m33813c((a) this.f36655s.poll());
                } else {
                    m33884d();
                    return;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    private void m33884d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f36657u);
        }
        if (this.f36657u) {
            return;
        }
        this.f36657u = true;
        try {
            if (C19879b.m103558b().m103563a(this.f36652p, this.f36653q, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.f36657u = false;
        m33882a();
    }

    /* renamed from: c */
    public synchronized AbstractC22888j m33885c(Intent intent) {
        a aVar;
        aVar = new a(intent);
        aVar.m33890c(this.f36654r);
        this.f36655s.add(aVar);
        m33883b();
        return aVar.m33892e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onServiceConnected: ");
                sb2.append(componentName);
            }
            this.f36657u = false;
            if (!(iBinder instanceof BinderC6610d1)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Invalid service connection: ");
                sb3.append(iBinder);
                m33882a();
                return;
            }
            this.f36656t = (BinderC6610d1) iBinder;
            m33883b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onServiceDisconnected: ");
            sb2.append(componentName);
        }
        m33883b();
    }

    ServiceConnectionC6619g1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f36655s = new ArrayDeque();
        this.f36657u = false;
        Context applicationContext = context.getApplicationContext();
        this.f36652p = applicationContext;
        this.f36653q = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f36654r = scheduledExecutorService;
    }
}
