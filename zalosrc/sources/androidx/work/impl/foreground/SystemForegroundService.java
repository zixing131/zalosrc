package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.AbstractC2253u;
import androidx.work.impl.foreground.C2197b;

/* loaded from: classes2.dex */
public class SystemForegroundService extends LifecycleService implements C2197b.b {

    /* renamed from: u */
    private static final String f9251u = AbstractC2253u.m11897i("SystemFgService");

    /* renamed from: v */
    private static SystemForegroundService f9252v = null;

    /* renamed from: q */
    private Handler f9253q;

    /* renamed from: r */
    private boolean f9254r;

    /* renamed from: s */
    C2197b f9255s;

    /* renamed from: t */
    NotificationManager f9256t;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    /* loaded from: classes2.dex */
    class RunnableC2191a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f9257p;

        /* renamed from: q */
        final /* synthetic */ Notification f9258q;

        /* renamed from: r */
        final /* synthetic */ int f9259r;

        RunnableC2191a(int i11, Notification notification, int i12) {
            this.f9257p = i11;
            this.f9258q = notification;
            this.f9259r = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                C2195e.m11700a(SystemForegroundService.this, this.f9257p, this.f9258q, this.f9259r);
            } else if (i11 >= 29) {
                C2194d.m11699a(SystemForegroundService.this, this.f9257p, this.f9258q, this.f9259r);
            } else {
                SystemForegroundService.this.startForeground(this.f9257p, this.f9258q);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    /* loaded from: classes2.dex */
    class RunnableC2192b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f9261p;

        /* renamed from: q */
        final /* synthetic */ Notification f9262q;

        RunnableC2192b(int i11, Notification notification) {
            this.f9261p = i11;
            this.f9262q = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f9256t.notify(this.f9261p, this.f9262q);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    /* loaded from: classes2.dex */
    class RunnableC2193c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f9264p;

        RunnableC2193c(int i11) {
            this.f9264p = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f9256t.cancel(this.f9264p);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$d */
    /* loaded from: classes2.dex */
    static class C2194d {
        /* renamed from: a */
        static void m11699a(Service service, int i11, Notification notification, int i12) {
            service.startForeground(i11, notification, i12);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$e */
    /* loaded from: classes2.dex */
    static class C2195e {
        /* renamed from: a */
        static void m11700a(Service service, int i11, Notification notification, int i12) {
            try {
                service.startForeground(i11, notification, i12);
            } catch (ForegroundServiceStartNotAllowedException e11) {
                AbstractC2253u.m11895e().mo11906l(SystemForegroundService.f9251u, "Unable to start foreground service", e11);
            }
        }
    }

    /* renamed from: f */
    private void m11695f() {
        this.f9253q = new Handler(Looper.getMainLooper());
        this.f9256t = (NotificationManager) getApplicationContext().getSystemService("notification");
        C2197b c2197b = new C2197b(getApplicationContext());
        this.f9255s = c2197b;
        c2197b.m11713n(this);
    }

    @Override // androidx.work.impl.foreground.C2197b.b
    /* renamed from: a */
    public void mo11696a(int i11, Notification notification) {
        this.f9253q.post(new RunnableC2192b(i11, notification));
    }

    @Override // androidx.work.impl.foreground.C2197b.b
    /* renamed from: c */
    public void mo11697c(int i11, int i12, Notification notification) {
        this.f9253q.post(new RunnableC2191a(i11, notification, i12));
    }

    @Override // androidx.work.impl.foreground.C2197b.b
    /* renamed from: d */
    public void mo11698d(int i11) {
        this.f9253q.post(new RunnableC2193c(i11));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f9252v = this;
        m11695f();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f9255s.m11711l();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f9254r) {
            AbstractC2253u.m11895e().mo11902f(f9251u, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f9255s.m11711l();
            m11695f();
            this.f9254r = false;
        }
        if (intent != null) {
            this.f9255s.m11712m(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.C2197b.b
    public void stop() {
        this.f9254r = true;
        AbstractC2253u.m11895e().mo11898a(f9251u, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f9252v = null;
        stopSelf();
    }
}
