package com.zing.zalo.zalocloud.onboarding;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingForegroundService;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import tg0.C26676b;

/* loaded from: classes7.dex */
public final class ZaloCloudOnboardingForegroundService extends LifecycleService {
    public static final C16875a Companion = new C16875a(null);

    /* renamed from: t */
    private static ZaloCloudOnboardingForegroundService f85874t;

    /* renamed from: q */
    private boolean f85875q;

    /* renamed from: r */
    private Handler f85876r;

    /* renamed from: s */
    private NotificationManager f85877s;

    /* renamed from: com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingForegroundService$a */
    /* loaded from: classes7.dex */
    public static final class C16875a {
        private C16875a() {
        }

        public /* synthetic */ C16875a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: g */
    private final void m90154g(Intent intent) {
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        if (notification != null) {
            if (!this.f85875q) {
                this.f85875q = true;
                m90158k(intExtra, notification);
            } else {
                m90156i(intExtra, notification);
            }
        }
    }

    /* renamed from: h */
    private final void m90155h(Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f85874t = null;
        stopSelf();
    }

    /* renamed from: i */
    private final void m90156i(final int i11, final Notification notification) {
        Handler handler = this.f85876r;
        if (handler == null) {
            AbstractC19074t.m100223u("handler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: wg0.i
            @Override // java.lang.Runnable
            public final void run() {
                ZaloCloudOnboardingForegroundService.m90157j(ZaloCloudOnboardingForegroundService.this, i11, notification);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m90157j(ZaloCloudOnboardingForegroundService zaloCloudOnboardingForegroundService, int i11, Notification notification) {
        AbstractC19074t.m100208f(zaloCloudOnboardingForegroundService, "this$0");
        AbstractC19074t.m100208f(notification, "$notification");
        NotificationManager notificationManager = zaloCloudOnboardingForegroundService.f85877s;
        if (notificationManager == null) {
            AbstractC19074t.m100223u("notificationManager");
            notificationManager = null;
        }
        notificationManager.notify(i11, notification);
    }

    /* renamed from: k */
    private final void m90158k(final int i11, final Notification notification) {
        Handler handler = this.f85876r;
        if (handler == null) {
            AbstractC19074t.m100223u("handler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: wg0.h
            @Override // java.lang.Runnable
            public final void run() {
                ZaloCloudOnboardingForegroundService.m90159l(ZaloCloudOnboardingForegroundService.this, i11, notification);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m90159l(ZaloCloudOnboardingForegroundService zaloCloudOnboardingForegroundService, int i11, Notification notification) {
        AbstractC19074t.m100208f(zaloCloudOnboardingForegroundService, "this$0");
        AbstractC19074t.m100208f(notification, "$notification");
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            try {
                zaloCloudOnboardingForegroundService.startForeground(i11, notification, 1);
                return;
            } catch (ForegroundServiceStartNotAllowedException e11) {
                C26676b.m136954d("SMLZCloudOnboardingForegroundService", e11);
                return;
            }
        }
        if (i12 >= 29) {
            zaloCloudOnboardingForegroundService.startForeground(i11, notification, 1);
        } else {
            zaloCloudOnboardingForegroundService.startForeground(i11, notification);
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f85874t = this;
        this.f85876r = new Handler(Looper.getMainLooper());
        Object systemService = getApplicationContext().getSystemService("notification");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f85877s = (NotificationManager) systemService;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (intent != null) {
            String action = intent.getAction();
            if (AbstractC19074t.m100204b(action, "com.zing.zalo.zcloud.intent.action.ACTION_START_FOREGROUND")) {
                m90154g(intent);
                return 3;
            }
            if (AbstractC19074t.m100204b(action, "com.zing.zalo.zcloud.intent.action.ACTION_STOP_FOREGROUND")) {
                m90155h(intent);
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
