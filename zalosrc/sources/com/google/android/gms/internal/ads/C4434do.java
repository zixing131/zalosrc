package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.do */
/* loaded from: classes2.dex */
public final class C4434do {

    /* renamed from: a */
    private boolean f19369a;

    /* renamed from: a */
    public final synchronized void m21512a() {
        while (!this.f19369a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean m21513b() {
        boolean z11;
        z11 = this.f19369a;
        this.f19369a = false;
        return z11;
    }

    /* renamed from: c */
    public final synchronized boolean m21514c() {
        if (this.f19369a) {
            return false;
        }
        this.f19369a = true;
        notifyAll();
        return true;
    }
}
