package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p198h5.C19879b;
import p518t5.HandlerC26488f;
import p597w4.AbstractC28728f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.cloudmessaging.h */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4064h implements ServiceConnection {

    /* renamed from: r */
    C4065i f16120r;

    /* renamed from: u */
    final /* synthetic */ C4069m f16123u;

    /* renamed from: p */
    int f16118p = 0;

    /* renamed from: q */
    final Messenger f16119q = new Messenger(new HandlerC26488f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.b
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC4064h serviceConnectionC4064h = ServiceConnectionC4064h.this;
            int i11 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i11);
            }
            synchronized (serviceConnectionC4064h) {
                try {
                    AbstractC4067k abstractC4067k = (AbstractC4067k) serviceConnectionC4064h.f16122t.get(i11);
                    if (abstractC4067k == null) {
                        StringBuilder sb3 = new StringBuilder(50);
                        sb3.append("Received response for unknown request: ");
                        sb3.append(i11);
                        return true;
                    }
                    serviceConnectionC4064h.f16122t.remove(i11);
                    serviceConnectionC4064h.m19167f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC4067k.m19172c(new zzq(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC4067k.mo19170a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: s */
    final Queue f16121s = new ArrayDeque();

    /* renamed from: t */
    final SparseArray f16122t = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC4064h(C4069m c4069m, AbstractC28728f abstractC28728f) {
        this.f16123u = c4069m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m19162a(int i11, String str) {
        m19163b(i11, str, null);
    }

    /* renamed from: b */
    final synchronized void m19163b(int i11, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Disconnected: ".concat(valueOf);
                }
            }
            int i12 = this.f16118p;
            if (i12 != 0) {
                if (i12 != 1 && i12 != 2) {
                    if (i12 != 3) {
                        return;
                    }
                    this.f16118p = 4;
                    return;
                }
                this.f16118p = 4;
                C19879b.m103558b().m103564c(C4069m.m19174a(this.f16123u), this);
                zzq zzqVar = new zzq(i11, str, th2);
                Iterator it = this.f16121s.iterator();
                while (it.hasNext()) {
                    ((AbstractC4067k) it.next()).m19172c(zzqVar);
                }
                this.f16121s.clear();
                for (int i13 = 0; i13 < this.f16122t.size(); i13++) {
                    ((AbstractC4067k) this.f16122t.valueAt(i13)).m19172c(zzqVar);
                }
                this.f16122t.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m19164c() {
        C4069m.m19176e(this.f16123u).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.d
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC4067k abstractC4067k;
                final ServiceConnectionC4064h serviceConnectionC4064h = ServiceConnectionC4064h.this;
                while (true) {
                    synchronized (serviceConnectionC4064h) {
                        try {
                            if (serviceConnectionC4064h.f16118p != 2) {
                                return;
                            }
                            if (serviceConnectionC4064h.f16121s.isEmpty()) {
                                serviceConnectionC4064h.m19167f();
                                return;
                            } else {
                                abstractC4067k = (AbstractC4067k) serviceConnectionC4064h.f16121s.poll();
                                serviceConnectionC4064h.f16122t.put(abstractC4067k.f16126a, abstractC4067k);
                                C4069m.m19176e(serviceConnectionC4064h.f16123u).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ServiceConnectionC4064h.this.m19166e(abstractC4067k.f16126a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(abstractC4067k);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                    }
                    Context m19174a = C4069m.m19174a(serviceConnectionC4064h.f16123u);
                    Messenger messenger = serviceConnectionC4064h.f16119q;
                    Message obtain = Message.obtain();
                    obtain.what = abstractC4067k.f16128c;
                    obtain.arg1 = abstractC4067k.f16126a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC4067k.mo19171b());
                    bundle.putString("pkg", m19174a.getPackageName());
                    bundle.putBundle("data", abstractC4067k.f16129d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC4064h.f16120r.m19169a(obtain);
                    } catch (RemoteException e11) {
                        serviceConnectionC4064h.m19162a(2, e11.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void m19165d() {
        if (this.f16118p == 1) {
            m19162a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m19166e(int i11) {
        AbstractC4067k abstractC4067k = (AbstractC4067k) this.f16122t.get(i11);
        if (abstractC4067k != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i11);
            this.f16122t.remove(i11);
            abstractC4067k.m19172c(new zzq(3, "Timed out waiting for response", null));
            m19167f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void m19167f() {
        if (this.f16118p == 2 && this.f16121s.isEmpty() && this.f16122t.size() == 0) {
            this.f16118p = 3;
            C19879b.m103558b().m103564c(C4069m.m19174a(this.f16123u), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean m19168g(AbstractC4067k abstractC4067k) {
        boolean z11;
        int i11 = this.f16118p;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return false;
                }
                this.f16121s.add(abstractC4067k);
                m19164c();
                return true;
            }
            this.f16121s.add(abstractC4067k);
            return true;
        }
        this.f16121s.add(abstractC4067k);
        if (this.f16118p == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19726o(z11);
        this.f16118p = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!C19879b.m103558b().m103563a(C4069m.m19174a(this.f16123u), intent, this, 1)) {
                m19162a(0, "Unable to bind to service");
            } else {
                C4069m.m19176e(this.f16123u).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC4064h.this.m19165d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e11) {
            m19163b(0, "Unable to bind to service", e11);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        C4069m.m19176e(this.f16123u).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.f
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4064h serviceConnectionC4064h = ServiceConnectionC4064h.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC4064h) {
                    if (iBinder2 == null) {
                        serviceConnectionC4064h.m19162a(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC4064h.f16120r = new C4065i(iBinder2);
                        serviceConnectionC4064h.f16118p = 2;
                        serviceConnectionC4064h.m19164c();
                    } catch (RemoteException e11) {
                        serviceConnectionC4064h.m19162a(0, e11.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4069m.m19176e(this.f16123u).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.c
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4064h.this.m19162a(2, "Service disconnected");
            }
        });
    }
}
