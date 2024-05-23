package com.zing.zalo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.zing.zalo.adapters.C7166o9;

/* loaded from: classes4.dex */
public class SyncService extends Service {

    /* renamed from: p */
    private static final Object f49557p = new Object();

    /* renamed from: q */
    private static C7166o9 f49558q;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f49558q.getSyncAdapterBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        synchronized (f49557p) {
            try {
                if (f49558q == null) {
                    f49558q = new C7166o9(getApplicationContext(), true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
