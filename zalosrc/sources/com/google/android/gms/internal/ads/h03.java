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
final class h03 implements AbstractC4172d.a, AbstractC4172d.b {

    /* renamed from: p */
    protected final d13 f21490p;

    /* renamed from: q */
    private final String f21491q;

    /* renamed from: r */
    private final String f21492r;

    /* renamed from: s */
    private final LinkedBlockingQueue f21493s;

    /* renamed from: t */
    private final HandlerThread f21494t;

    /* renamed from: u */
    private final xz2 f21495u;

    /* renamed from: v */
    private final long f21496v;

    /* renamed from: w */
    private final int f21497w;

    public h03(Context context, int i11, int i12, String str, String str2, String str3, xz2 xz2Var) {
        this.f21491q = str;
        this.f21497w = i12;
        this.f21492r = str2;
        this.f21495u = xz2Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f21494t = handlerThread;
        handlerThread.start();
        this.f21496v = System.currentTimeMillis();
        d13 d13Var = new d13(context, handlerThread.getLooper(), this, this, 19621000);
        this.f21490p = d13Var;
        this.f21493s = new LinkedBlockingQueue();
        d13Var.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    static zzfoq m22668a() {
        return new zzfoq(null, 1);
    }

    /* renamed from: e */
    private final void m22669e(int i11, long j11, Exception exc) {
        this.f21495u.m28094c(i11, System.currentTimeMillis() - j11, exc);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        g13 m22672d = m22672d();
        if (m22672d != null) {
            try {
                zzfoq m22265N = m22672d.m22265N(new zzfoo(1, this.f21497w, this.f21491q, this.f21492r));
                m22669e(5011, this.f21496v, null);
                this.f21493s.put(m22265N);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
        try {
            m22669e(4011, this.f21496v, null);
            this.f21493s.put(m22668a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
        try {
            m22669e(4012, this.f21496v, null);
            this.f21493s.put(m22668a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final zzfoq m22670b(int i11) {
        zzfoq zzfoqVar;
        try {
            zzfoqVar = (zzfoq) this.f21493s.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            m22669e(2009, this.f21496v, e11);
            zzfoqVar = null;
        }
        m22669e(3004, this.f21496v, null);
        if (zzfoqVar != null) {
            if (zzfoqVar.f32128r == 7) {
                xz2.m28091g(3);
            } else {
                xz2.m28091g(2);
            }
        }
        if (zzfoqVar == null) {
            return m22668a();
        }
        return zzfoqVar;
    }

    /* renamed from: c */
    public final void m22671c() {
        d13 d13Var = this.f21490p;
        if (d13Var != null) {
            if (d13Var.isConnected() || this.f21490p.isConnecting()) {
                this.f21490p.disconnect();
            }
        }
    }

    /* renamed from: d */
    protected final g13 m22672d() {
        try {
            return this.f21490p.m21248g();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
