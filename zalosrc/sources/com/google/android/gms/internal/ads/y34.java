package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class y34 {

    /* renamed from: a */
    private final x34 f30733a;

    /* renamed from: b */
    private final w34 f30734b;

    /* renamed from: c */
    private final w81 f30735c;

    /* renamed from: d */
    private final mr0 f30736d;

    /* renamed from: e */
    private int f30737e;

    /* renamed from: f */
    private Object f30738f;

    /* renamed from: g */
    private final Looper f30739g;

    /* renamed from: h */
    private final int f30740h;

    /* renamed from: i */
    private boolean f30741i;

    /* renamed from: j */
    private boolean f30742j;

    /* renamed from: k */
    private boolean f30743k;

    public y34(w34 w34Var, x34 x34Var, mr0 mr0Var, int i11, w81 w81Var, Looper looper) {
        this.f30734b = w34Var;
        this.f30733a = x34Var;
        this.f30736d = mr0Var;
        this.f30739g = looper;
        this.f30735c = w81Var;
        this.f30740h = i11;
    }

    /* renamed from: a */
    public final int m28108a() {
        return this.f30737e;
    }

    /* renamed from: b */
    public final Looper m28109b() {
        return this.f30739g;
    }

    /* renamed from: c */
    public final x34 m28110c() {
        return this.f30733a;
    }

    /* renamed from: d */
    public final y34 m28111d() {
        v71.m27175f(!this.f30741i);
        this.f30741i = true;
        this.f30734b.mo21936b(this);
        return this;
    }

    /* renamed from: e */
    public final y34 m28112e(Object obj) {
        v71.m27175f(!this.f30741i);
        this.f30738f = obj;
        return this;
    }

    /* renamed from: f */
    public final y34 m28113f(int i11) {
        v71.m27175f(!this.f30741i);
        this.f30737e = i11;
        return this;
    }

    /* renamed from: g */
    public final Object m28114g() {
        return this.f30738f;
    }

    /* renamed from: h */
    public final synchronized void m28115h(boolean z11) {
        this.f30742j = z11 | this.f30742j;
        this.f30743k = true;
        notifyAll();
    }

    /* renamed from: i */
    public final synchronized boolean m28116i(long j11) {
        boolean z11;
        try {
            v71.m27175f(this.f30741i);
            if (this.f30739g.getThread() != Thread.currentThread()) {
                z11 = true;
            } else {
                z11 = false;
            }
            v71.m27175f(z11);
            long elapsedRealtime = SystemClock.elapsedRealtime() + j11;
            while (!this.f30743k) {
                if (j11 > 0) {
                    wait(j11);
                    j11 = elapsedRealtime - SystemClock.elapsedRealtime();
                } else {
                    throw new TimeoutException("Message delivery timed out.");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f30742j;
    }

    /* renamed from: j */
    public final synchronized boolean m28117j() {
        return false;
    }
}
