package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.e1 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4177e1 implements ServiceConnection {

    /* renamed from: p */
    private final int f16594p;

    /* renamed from: q */
    final /* synthetic */ AbstractC4172d f16595q;

    public ServiceConnectionC4177e1(AbstractC4172d abstractC4172d, int i11) {
        this.f16595q = abstractC4172d;
        this.f16594p = i11;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC4193k c4221t0;
        AbstractC4172d abstractC4172d = this.f16595q;
        if (iBinder == null) {
            AbstractC4172d.zzk(abstractC4172d, 16);
            return;
        }
        obj = abstractC4172d.zzq;
        synchronized (obj) {
            try {
                AbstractC4172d abstractC4172d2 = this.f16595q;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC4193k)) {
                    c4221t0 = (InterfaceC4193k) queryLocalInterface;
                } else {
                    c4221t0 = new C4221t0(iBinder);
                }
                abstractC4172d2.zzr = c4221t0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16595q.zzl(0, null, this.f16594p);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f16595q.zzq;
        synchronized (obj) {
            this.f16595q.zzr = null;
        }
        Handler handler = this.f16595q.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f16594p, 1));
    }
}
