package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p504s5.HandlerC26145m;

/* renamed from: com.google.android.gms.common.internal.f0 */
/* loaded from: classes2.dex */
public final class C4179f0 implements Handler.Callback {

    /* renamed from: p */
    private final InterfaceC4176e0 f16599p;

    /* renamed from: w */
    private final Handler f16606w;

    /* renamed from: q */
    private final ArrayList f16600q = new ArrayList();

    /* renamed from: r */
    final ArrayList f16601r = new ArrayList();

    /* renamed from: s */
    private final ArrayList f16602s = new ArrayList();

    /* renamed from: t */
    private volatile boolean f16603t = false;

    /* renamed from: u */
    private final AtomicInteger f16604u = new AtomicInteger(0);

    /* renamed from: v */
    private boolean f16605v = false;

    /* renamed from: x */
    private final Object f16607x = new Object();

    public C4179f0(Looper looper, InterfaceC4176e0 interfaceC4176e0) {
        this.f16599p = interfaceC4176e0;
        this.f16606w = new HandlerC26145m(looper, this);
    }

    /* renamed from: a */
    public final void m19667a() {
        this.f16603t = false;
        this.f16604u.incrementAndGet();
    }

    /* renamed from: b */
    public final void m19668b() {
        this.f16603t = true;
    }

    /* renamed from: c */
    public final void m19669c(ConnectionResult connectionResult) {
        AbstractC4205o.m19716e(this.f16606w, "onConnectionFailure must only be called on the Handler thread");
        this.f16606w.removeMessages(1);
        synchronized (this.f16607x) {
            try {
                ArrayList arrayList = new ArrayList(this.f16602s);
                int i11 = this.f16604u.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4073c.c cVar = (AbstractC4073c.c) it.next();
                    if (this.f16603t && this.f16604u.get() == i11) {
                        if (this.f16602s.contains(cVar)) {
                            cVar.mo19443Q(connectionResult);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    /* renamed from: d */
    public final void m19670d(Bundle bundle) {
        AbstractC4205o.m19716e(this.f16606w, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f16607x) {
            try {
                AbstractC4205o.m19726o(!this.f16605v);
                this.f16606w.removeMessages(1);
                this.f16605v = true;
                AbstractC4205o.m19726o(this.f16601r.isEmpty());
                ArrayList arrayList = new ArrayList(this.f16600q);
                int i11 = this.f16604u.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4073c.b bVar = (AbstractC4073c.b) it.next();
                    if (!this.f16603t || !this.f16599p.isConnected() || this.f16604u.get() != i11) {
                        break;
                    } else if (!this.f16601r.contains(bVar)) {
                        bVar.mo19480E(bundle);
                    }
                }
                this.f16601r.clear();
                this.f16605v = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m19671e(int i11) {
        AbstractC4205o.m19716e(this.f16606w, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f16606w.removeMessages(1);
        synchronized (this.f16607x) {
            try {
                this.f16605v = true;
                ArrayList arrayList = new ArrayList(this.f16600q);
                int i12 = this.f16604u.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4073c.b bVar = (AbstractC4073c.b) it.next();
                    if (!this.f16603t || this.f16604u.get() != i12) {
                        break;
                    } else if (this.f16600q.contains(bVar)) {
                        bVar.mo19482N(i11);
                    }
                }
                this.f16601r.clear();
                this.f16605v = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final void m19672f(AbstractC4073c.b bVar) {
        AbstractC4205o.m19722k(bVar);
        synchronized (this.f16607x) {
            try {
                if (this.f16600q.contains(bVar)) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("registerConnectionCallbacks(): listener ");
                    sb2.append(valueOf);
                    sb2.append(" is already registered");
                } else {
                    this.f16600q.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f16599p.isConnected()) {
            Handler handler = this.f16606w;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void m19673g(AbstractC4073c.c cVar) {
        AbstractC4205o.m19722k(cVar);
        synchronized (this.f16607x) {
            try {
                if (this.f16602s.contains(cVar)) {
                    String valueOf = String.valueOf(cVar);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("registerConnectionFailedListener(): listener ");
                    sb2.append(valueOf);
                    sb2.append(" is already registered");
                } else {
                    this.f16602s.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final void m19674h(AbstractC4073c.c cVar) {
        AbstractC4205o.m19722k(cVar);
        synchronized (this.f16607x) {
            try {
                if (!this.f16602s.remove(cVar)) {
                    String valueOf = String.valueOf(cVar);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unregisterConnectionFailedListener(): listener ");
                    sb2.append(valueOf);
                    sb2.append(" not found");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            AbstractC4073c.b bVar = (AbstractC4073c.b) message.obj;
            synchronized (this.f16607x) {
                try {
                    if (this.f16603t && this.f16599p.isConnected() && this.f16600q.contains(bVar)) {
                        bVar.mo19480E(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i11, new Exception());
        return false;
    }
}
