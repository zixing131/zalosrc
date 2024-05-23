package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class hq2 {

    /* renamed from: a */
    private final InterfaceC20285f f21878a;

    /* renamed from: b */
    private final Object f21879b = new Object();

    /* renamed from: d */
    private volatile int f21881d = 1;

    /* renamed from: c */
    private volatile long f21880c = 0;

    public hq2(InterfaceC20285f interfaceC20285f) {
        this.f21878a = interfaceC20285f;
    }

    /* renamed from: e */
    private final void m22995e() {
        long mo105913a = this.f21878a.mo105913a();
        synchronized (this.f21879b) {
            try {
                if (this.f21881d == 3) {
                    if (this.f21880c + ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21192a5)).longValue() <= mo105913a) {
                        this.f21881d = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    private final void m22996f(int i11, int i12) {
        m22995e();
        long mo105913a = this.f21878a.mo105913a();
        synchronized (this.f21879b) {
            try {
                if (this.f21881d != i11) {
                    return;
                }
                this.f21881d = i12;
                if (this.f21881d == 3) {
                    this.f21880c = mo105913a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final void m22997a() {
        m22996f(2, 3);
    }

    /* renamed from: b */
    public final void m22998b(boolean z11) {
        if (z11) {
            m22996f(1, 2);
        } else {
            m22996f(2, 1);
        }
    }

    /* renamed from: c */
    public final boolean m22999c() {
        boolean z11;
        synchronized (this.f21879b) {
            m22995e();
            if (this.f21881d == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: d */
    public final boolean m23000d() {
        boolean z11;
        synchronized (this.f21879b) {
            m22995e();
            if (this.f21881d == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }
}
