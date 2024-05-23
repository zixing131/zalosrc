package com.zing.zalo.service;

import ag0.C0843s0;
import android.app.ActivityManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.receiver.ZaloBroadcastReceiver;
import com.zing.zalo.startup.NonBlockingService;
import ho0.AbstractC20110a;
import java.util.Iterator;
import li.AbstractC22490a;
import me0.AbstractC23059e9;
import mm0.AbstractC23350e;
import p161fg.C18922m;
import p207he.C20024r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p609wh.C29018k;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p645xh.C29630g;
import p645xh.C29632i;
import th.AbstractC26684e;
import vg.C28023b6;

/* loaded from: classes4.dex */
public class ZaloBackgroundService extends NonBlockingService {

    /* renamed from: s */
    public static final String f49568s = "ZaloBackgroundService";

    /* renamed from: t */
    public static boolean f49569t = false;

    /* renamed from: u */
    public static Service f49570u;

    /* renamed from: r */
    BroadcastReceiver f49571r;

    /* loaded from: classes4.dex */
    public static class ScreenStateBroadcastReceiver extends ZaloBroadcastReceiver {
        /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:3:0x0002, B:5:0x000c, B:8:0x0017, B:10:0x001b, B:12:0x0021, B:15:0x002a, B:16:0x0031, B:18:0x003c, B:19:0x0043, B:22:0x002e, B:23:0x004c, B:25:0x0054, B:27:0x0063, B:28:0x006e), top: B:2:0x0002 }] */
        @Override // com.zing.zalo.receiver.ZaloBroadcastReceiver
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo49670c(Context context, Intent intent) {
            if (intent != null) {
                try {
                    String action = intent.getAction();
                    if (!TextUtils.isEmpty(action)) {
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            if (!AbstractC23304d.f113330T0 || (!AbstractC23309i.m120864Dg() && Build.VERSION.SDK_INT < 29)) {
                                AbstractC23059e9.m118320I();
                                C29630g.m147299E0().m147321X0(context);
                                if (AbstractC26684e.f126408a) {
                                    C29632i.m147326E0().m147348X0(context);
                                }
                                AbstractC22490a.m116283f("screen_on", Boolean.toString(false));
                                return;
                            }
                            AbstractC23309i.m122298pw(true);
                            C29630g.m147299E0().m147321X0(context);
                            if (AbstractC26684e.f126408a) {
                            }
                            AbstractC22490a.m116283f("screen_on", Boolean.toString(false));
                            return;
                        }
                        if ("android.intent.action.SCREEN_ON".equals(action)) {
                            C29630g.m147299E0().m147322Y0(MainApplication.getAppContext());
                            if (AbstractC26684e.f126408a) {
                                C29632i.m147326E0().m147349Y0(MainApplication.getAppContext());
                            }
                            AbstractC22490a.m116283f("screen_on", Boolean.toString(true));
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    public ZaloBackgroundService() {
        super(f49568s);
    }

    /* renamed from: i */
    public static boolean m50458i(Context context) {
        if (!f49569t) {
            return false;
        }
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (ZaloBackgroundService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.startup.NonBlockingService
    /* renamed from: g */
    protected void mo50459g(Intent intent) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("handleIntent:");
            sb2.append(intent);
            f49570u = this;
            f49569t = true;
            C29628e.m147249E0();
            C0843s0.m2286r();
            AbstractC29633j.m147365n();
            if (this.f49571r == null) {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                ScreenStateBroadcastReceiver screenStateBroadcastReceiver = new ScreenStateBroadcastReceiver();
                this.f49571r = screenStateBroadcastReceiver;
                registerReceiver(screenStateBroadcastReceiver, intentFilter);
            }
            if (!C20024r.m103941j()) {
                stopForeground(true);
            } else if (intent != null && intent.getBooleanExtra("EXTRA_START_FOREGROUND_CALL", false)) {
                C20024r.m103948t();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f49568s, e11);
        }
    }

    @Override // com.zing.zalo.startup.NonBlockingService, android.app.Service
    public void onDestroy() {
        try {
            C29018k.f134339c.set(false);
            BroadcastReceiver broadcastReceiver = this.f49571r;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.f49571r = null;
            }
            f49570u = null;
            f49569t = false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        super.onDestroy();
    }

    @Override // com.zing.zalo.startup.NonBlockingService, android.app.Service
    public void onStart(Intent intent, int i11) {
        try {
            super.onStart(intent, i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            MainApplication.Companion.m35498a(this);
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        if (!C18922m.m99141t().m99164y()) {
            C28023b6.m141250h0().m141359m();
        }
    }
}
