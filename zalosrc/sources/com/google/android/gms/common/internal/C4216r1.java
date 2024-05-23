package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p198h5.C19879b;
import p538u5.HandlerC27038e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.r1 */
/* loaded from: classes2.dex */
public final class C4216r1 extends AbstractC4181g {

    /* renamed from: f */
    private final HashMap f16653f = new HashMap();

    /* renamed from: g */
    private final Context f16654g;

    /* renamed from: h */
    private volatile Handler f16655h;

    /* renamed from: i */
    private final C4213q1 f16656i;

    /* renamed from: j */
    private final C19879b f16657j;

    /* renamed from: k */
    private final long f16658k;

    /* renamed from: l */
    private final long f16659l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4216r1(Context context, Looper looper) {
        C4213q1 c4213q1 = new C4213q1(this, null);
        this.f16656i = c4213q1;
        this.f16654g = context.getApplicationContext();
        this.f16655h = new HandlerC27038e(looper, c4213q1);
        this.f16657j = C19879b.m103558b();
        this.f16658k = 5000L;
        this.f16659l = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4181g
    /* renamed from: f */
    protected final void mo19682f(C4201m1 c4201m1, ServiceConnection serviceConnection, String str) {
        AbstractC4205o.m19723l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f16653f) {
            try {
                ServiceConnectionC4207o1 serviceConnectionC4207o1 = (ServiceConnectionC4207o1) this.f16653f.get(c4201m1);
                if (serviceConnectionC4207o1 != null) {
                    if (serviceConnectionC4207o1.m19736h(serviceConnection)) {
                        serviceConnectionC4207o1.m19734f(serviceConnection, str);
                        if (serviceConnectionC4207o1.m19737i()) {
                            this.f16655h.sendMessageDelayed(this.f16655h.obtainMessage(0, c4201m1), this.f16658k);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c4201m1.toString());
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + c4201m1.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4181g
    /* renamed from: h */
    public final boolean mo19684h(C4201m1 c4201m1, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m19738j;
        AbstractC4205o.m19723l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f16653f) {
            try {
                ServiceConnectionC4207o1 serviceConnectionC4207o1 = (ServiceConnectionC4207o1) this.f16653f.get(c4201m1);
                if (serviceConnectionC4207o1 == null) {
                    serviceConnectionC4207o1 = new ServiceConnectionC4207o1(this, c4201m1);
                    serviceConnectionC4207o1.m19732d(serviceConnection, serviceConnection, str);
                    serviceConnectionC4207o1.m19733e(str, executor);
                    this.f16653f.put(c4201m1, serviceConnectionC4207o1);
                } else {
                    this.f16655h.removeMessages(0, c4201m1);
                    if (!serviceConnectionC4207o1.m19736h(serviceConnection)) {
                        serviceConnectionC4207o1.m19732d(serviceConnection, serviceConnection, str);
                        int m19729a = serviceConnectionC4207o1.m19729a();
                        if (m19729a != 1) {
                            if (m19729a == 2) {
                                serviceConnectionC4207o1.m19733e(str, executor);
                            }
                        } else {
                            serviceConnection.onServiceConnected(serviceConnectionC4207o1.m19730b(), serviceConnectionC4207o1.m19731c());
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c4201m1.toString());
                    }
                }
                m19738j = serviceConnectionC4207o1.m19738j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m19738j;
    }
}
