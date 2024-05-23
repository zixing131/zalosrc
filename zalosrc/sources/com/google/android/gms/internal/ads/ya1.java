package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ya1 {

    /* renamed from: a */
    private final w81 f30856a;

    /* renamed from: b */
    private boolean f30857b;

    public ya1(w81 w81Var) {
        this.f30856a = w81Var;
    }

    /* renamed from: a */
    public final synchronized void m28163a() {
        while (!this.f30857b) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void m28164b() {
        boolean z11 = false;
        while (!this.f30857b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m28165c() {
        boolean z11;
        z11 = this.f30857b;
        this.f30857b = false;
        return z11;
    }

    /* renamed from: d */
    public final synchronized boolean m28166d() {
        return this.f30857b;
    }

    /* renamed from: e */
    public final synchronized boolean m28167e() {
        if (this.f30857b) {
            return false;
        }
        this.f30857b = true;
        notifyAll();
        return true;
    }
}
