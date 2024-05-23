package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p198h5.C19879b;
import p229i5.AbstractC20295p;

/* renamed from: com.google.android.gms.common.internal.o1 */
/* loaded from: classes2.dex */
final class ServiceConnectionC4207o1 implements ServiceConnection, InterfaceC4219s1 {

    /* renamed from: p */
    private final Map f16636p = new HashMap();

    /* renamed from: q */
    private int f16637q = 2;

    /* renamed from: r */
    private boolean f16638r;

    /* renamed from: s */
    private IBinder f16639s;

    /* renamed from: t */
    private final C4201m1 f16640t;

    /* renamed from: u */
    private ComponentName f16641u;

    /* renamed from: v */
    final /* synthetic */ C4216r1 f16642v;

    public ServiceConnectionC4207o1(C4216r1 c4216r1, C4201m1 c4201m1) {
        this.f16642v = c4216r1;
        this.f16640t = c4201m1;
    }

    /* renamed from: a */
    public final int m19729a() {
        return this.f16637q;
    }

    /* renamed from: b */
    public final ComponentName m19730b() {
        return this.f16641u;
    }

    /* renamed from: c */
    public final IBinder m19731c() {
        return this.f16639s;
    }

    /* renamed from: d */
    public final void m19732d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f16636p.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m19733e(String str, Executor executor) {
        C19879b c19879b;
        Context context;
        Context context2;
        C19879b c19879b2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j11;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f16637q = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (AbstractC20295p.m105959m()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C4216r1 c4216r1 = this.f16642v;
            c19879b = c4216r1.f16657j;
            context = c4216r1.f16654g;
            C4201m1 c4201m1 = this.f16640t;
            context2 = c4216r1.f16654g;
            boolean m103565d = c19879b.m103565d(context, str, c4201m1.m19707c(context2), this, this.f16640t.m19705a(), executor);
            this.f16638r = m103565d;
            if (m103565d) {
                handler = this.f16642v.f16655h;
                Message obtainMessage = handler.obtainMessage(1, this.f16640t);
                handler2 = this.f16642v.f16655h;
                j11 = this.f16642v.f16659l;
                handler2.sendMessageDelayed(obtainMessage, j11);
            } else {
                this.f16637q = 2;
                try {
                    C4216r1 c4216r12 = this.f16642v;
                    c19879b2 = c4216r12.f16657j;
                    context3 = c4216r12.f16654g;
                    c19879b2.m103564c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th2;
        }
    }

    /* renamed from: f */
    public final void m19734f(ServiceConnection serviceConnection, String str) {
        this.f16636p.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m19735g(String str) {
        Handler handler;
        C19879b c19879b;
        Context context;
        handler = this.f16642v.f16655h;
        handler.removeMessages(1, this.f16640t);
        C4216r1 c4216r1 = this.f16642v;
        c19879b = c4216r1.f16657j;
        context = c4216r1.f16654g;
        c19879b.m103564c(context, this);
        this.f16638r = false;
        this.f16637q = 2;
    }

    /* renamed from: h */
    public final boolean m19736h(ServiceConnection serviceConnection) {
        return this.f16636p.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m19737i() {
        return this.f16636p.isEmpty();
    }

    /* renamed from: j */
    public final boolean m19738j() {
        return this.f16638r;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f16642v.f16653f;
        synchronized (hashMap) {
            try {
                handler = this.f16642v.f16655h;
                handler.removeMessages(1, this.f16640t);
                this.f16639s = iBinder;
                this.f16641u = componentName;
                Iterator it = this.f16636p.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f16637q = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f16642v.f16653f;
        synchronized (hashMap) {
            try {
                handler = this.f16642v.f16655h;
                handler.removeMessages(1, this.f16640t);
                this.f16639s = null;
                this.f16641u = componentName;
                Iterator it = this.f16636p.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f16637q = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
