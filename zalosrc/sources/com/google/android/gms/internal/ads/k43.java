package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class k43 implements ServiceConnection {

    /* renamed from: p */
    final /* synthetic */ l43 f23144p;

    public /* synthetic */ k43(l43 l43Var, j43 j43Var) {
        this.f23144p = l43Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a43 a43Var;
        a43Var = this.f23144p.f23732b;
        a43Var.m19981d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f23144p.m24128c().post(new h43(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a43 a43Var;
        a43Var = this.f23144p.f23732b;
        a43Var.m19981d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f23144p.m24128c().post(new i43(this));
    }
}
