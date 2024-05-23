package com.zing.zalo.chathead;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import d60.C17799h;
import gu.AbstractC19601a;
import h40.AbstractC19783c;
import ho0.AbstractC20110a;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p161fg.C18922m;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p363nh.C23746b;
import p363nh.C23750d;
import vg.C28023b6;
import vg.C28222w7;

/* loaded from: classes3.dex */
public class MiniChatService extends Service implements C23744a.c {

    /* renamed from: s */
    private static volatile boolean f42084s = false;

    /* renamed from: t */
    private static volatile boolean f42085t = false;

    /* renamed from: p */
    boolean f42086p = false;

    /* renamed from: q */
    BroadcastReceiver f42087q = new C7840a();

    /* renamed from: r */
    C23750d f42088r;

    /* renamed from: com.zing.zalo.chathead.MiniChatService$a */
    /* loaded from: classes3.dex */
    class C7840a extends BroadcastReceiver {
        C7840a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            try {
                if (!"android.intent.action.SCREEN_OFF".equals(action) && !"android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                    if ("com.zing.zalo.ACTION_MAXIMIZE_CHAT_HEAD".equalsIgnoreCase(action)) {
                        if (!C18922m.m99141t().m99162w()) {
                            if (!C18922m.m99141t().m99165z()) {
                                C17799h.m94029a().f90038m = 1;
                                C18922m.m99141t().m99147Q(true);
                            }
                            C18922m.m99141t().m99142K();
                            if (ZaloLauncherActivity.m57061E5() != null && !ZaloLauncherActivity.m57061E5().isFinishing() && !ZaloLauncherActivity.m57061E5().mo35559a()) {
                                AbstractC23136l9.m118680U0((Activity) ZaloLauncherActivity.m57061E5(), false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (action.equals("android.intent.action.CONFIGURATION_CHANGED")) {
                        C23212s8.m119595b(null);
                        return;
                    }
                    return;
                }
                C18922m.m99141t().m99143L();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m39859a(Service service) {
        synchronized (MiniChatService.class) {
            try {
                f42084s = false;
                if (f42085t) {
                    f42085t = false;
                    if (Build.VERSION.SDK_INT >= 24) {
                        service.stopForeground(1);
                    } else {
                        service.stopForeground(true);
                    }
                    service.stopSelf();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m39860c() {
        synchronized (MiniChatService.class) {
            f42084s = true;
            f42085t = false;
            AbstractC1388a.m6975q(MainApplication.getAppContext(), new Intent(MainApplication.getAppContext(), (Class<?>) MiniChatService.class));
        }
    }

    /* renamed from: d */
    public static synchronized void m39861d() {
        synchronized (MiniChatService.class) {
            try {
                if (f42084s) {
                    f42085t = true;
                } else {
                    MainApplication.getAppContext().stopService(new Intent(MainApplication.getAppContext(), (Class<?>) MiniChatService.class));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    void m39862b() {
        if (this.f42088r == null) {
            C23746b c23746b = new C23746b(this);
            this.f42088r = c23746b;
            c23746b.m124165v0("mini_chat");
            this.f42088r.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            this.f42088r.m6870W(getString(AbstractC8020f0.video_encode_notification_title));
            this.f42088r.m6862O(-2);
            this.f42088r.m6893u(PendingIntent.getBroadcast(this, 1990, new Intent("com.zing.zalo.ACTION_MAXIMIZE_CHAT_HEAD"), AbstractC19601a.m102572b(134217728)));
            this.f42088r.m6875a0(System.currentTimeMillis());
            this.f42088r.mo6860M(false);
            this.f42088r.mo6895w(getString(AbstractC8020f0.chat_head_notification_title));
            this.f42088r.mo6894v(String.format(getString(AbstractC8020f0.multiple_active_conversation), Integer.valueOf(C18922m.m99141t().m99158r())));
        } else {
            this.f42088r.mo6894v(String.format(getString(AbstractC8020f0.multiple_active_conversation), Integer.valueOf(C18922m.m99141t().m99158r())));
        }
        C28023b6.m141256k2(this.f42088r);
        startForeground(AbstractC23088h5.m118423d("mini_chat", ""), this.f42088r.mo6879e());
        C28023b6.m141262r2();
        AbstractC20110a.m104542k(9, "startForeground: %s", getClass().getName());
        AbstractC19783c.f97932a = true;
        if (C18922m.m99141t().m99158r() == 0) {
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
            stopSelf();
            AbstractC19783c.f97932a = false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        intentFilter.addAction("com.zing.zalo.ACTION_MAXIMIZE_CHAT_HEAD");
        registerReceiver(this.f42087q, intentFilter);
        this.f42086p = true;
        C23744a.m124114c().m124115b(this, 14000);
        m39862b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.f42086p) {
            unregisterReceiver(this.f42087q);
            this.f42086p = false;
        }
        AbstractC23775p0.m124197b("mini_chat");
        C28222w7.m142183a().m142184b(3);
        C18922m.m99141t().m99156p();
        AbstractC19783c.f97932a = false;
        C23744a.m124114c().m124117e(this, 14000);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        m39862b();
        m39859a(this);
        return 2;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 14000) {
            m39862b();
        }
    }
}
