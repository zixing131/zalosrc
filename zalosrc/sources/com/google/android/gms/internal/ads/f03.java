package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class f03 implements AbstractC4172d.a, AbstractC4172d.b {

    /* renamed from: p */
    protected final d13 f19914p;

    /* renamed from: q */
    private final String f19915q;

    /* renamed from: r */
    private final String f19916r;

    /* renamed from: s */
    private final LinkedBlockingQueue f19917s;

    /* renamed from: t */
    private final HandlerThread f19918t;

    public f03(Context context, String str, String str2) {
        this.f19915q = str;
        this.f19916r = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f19918t = handlerThread;
        handlerThread.start();
        d13 d13Var = new d13(context, handlerThread.getLooper(), this, this, 9200000);
        this.f19914p = d13Var;
        this.f19917s = new LinkedBlockingQueue();
        d13Var.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    static C4606ib m21857a() {
        C4939ra m23199g0 = C4606ib.m23199g0();
        m23199g0.m26044u(32768L);
        return (C4606ib) m23199g0.m25898n();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        g13 m21860d = m21860d();
        if (m21860d != null) {
            try {
                try {
                    this.f19917s.put(m21860d.m22264E(new zzfof(this.f19915q, this.f19916r)).m28813t());
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    m21859c();
                    this.f19918t.quit();
                    throw th2;
                }
            } catch (Throwable unused2) {
                this.f19917s.put(m21857a());
            }
            m21859c();
            this.f19918t.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
        try {
            this.f19917s.put(m21857a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
        try {
            this.f19917s.put(m21857a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final C4606ib m21858b(int i11) {
        C4606ib c4606ib;
        try {
            c4606ib = (C4606ib) this.f19917s.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c4606ib = null;
        }
        if (c4606ib == null) {
            return m21857a();
        }
        return c4606ib;
    }

    /* renamed from: c */
    public final void m21859c() {
        d13 d13Var = this.f19914p;
        if (d13Var != null) {
            if (d13Var.isConnected() || this.f19914p.isConnecting()) {
                this.f19914p.disconnect();
            }
        }
    }

    /* renamed from: d */
    protected final g13 m21860d() {
        try {
            return this.f19914p.m21248g();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
