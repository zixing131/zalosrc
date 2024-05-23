package com.zing.zalo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import mm0.AbstractC23350e;
import q00.C24963a;

/* loaded from: classes4.dex */
public class AuthenticationService extends Service {

    /* renamed from: q */
    private static final String f49529q = "AuthenticationService";

    /* renamed from: p */
    private C24963a f49530p;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (AbstractC23350e.m122781k(f49529q, 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getBinder()...  returning the AccountAuthenticator binder for intent ");
            sb2.append(intent);
        }
        return this.f49530p.getIBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f49530p = new C24963a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
    }
}
