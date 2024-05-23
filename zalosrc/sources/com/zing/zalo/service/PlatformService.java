package com.zing.zalo.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import q00.HandlerC24966d;

/* loaded from: classes4.dex */
public class PlatformService extends Service {

    /* renamed from: p */
    private volatile Looper f49532p;

    /* renamed from: q */
    private volatile Handler f49533q;

    /* renamed from: r */
    private volatile Messenger f49534r;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.f49534r == null) {
            return null;
        }
        return this.f49534r.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("Z:PlatformService");
        handlerThread.start();
        this.f49532p = handlerThread.getLooper();
        this.f49533q = new HandlerC24966d(this.f49532p);
        this.f49534r = new Messenger(this.f49533q);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f49532p.quit();
    }
}
