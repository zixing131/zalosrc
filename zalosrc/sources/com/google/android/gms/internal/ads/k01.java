package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class k01 implements InterfaceC4657jq {

    /* renamed from: a */
    private final ScheduledExecutorService f23037a;

    /* renamed from: b */
    private final InterfaceC20285f f23038b;

    /* renamed from: c */
    private ScheduledFuture f23039c;

    /* renamed from: d */
    private long f23040d = -1;

    /* renamed from: e */
    private long f23041e = -1;

    /* renamed from: f */
    private Runnable f23042f = null;

    /* renamed from: g */
    private boolean f23043g = false;

    public k01(ScheduledExecutorService scheduledExecutorService, InterfaceC20285f interfaceC20285f) {
        this.f23037a = scheduledExecutorService;
        this.f23038b = interfaceC20285f;
        zzt.zzb().m24016c(this);
    }

    /* renamed from: a */
    final synchronized void m23787a() {
        try {
            if (!this.f23043g) {
                ScheduledFuture scheduledFuture = this.f23039c;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    this.f23039c.cancel(true);
                    this.f23041e = this.f23040d - this.f23038b.mo105914b();
                } else {
                    this.f23041e = -1L;
                }
                this.f23043g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    final synchronized void m23788b() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f23043g) {
                if (this.f23041e > 0 && (scheduledFuture = this.f23039c) != null && scheduledFuture.isCancelled()) {
                    this.f23039c = this.f23037a.schedule(this.f23042f, this.f23041e, TimeUnit.MILLISECONDS);
                }
                this.f23043g = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final synchronized void m23789c(int i11, Runnable runnable) {
        this.f23042f = runnable;
        long j11 = i11;
        this.f23040d = this.f23038b.mo105914b() + j11;
        this.f23039c = this.f23037a.schedule(runnable, j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4657jq
    public final void zza(boolean z11) {
        if (z11) {
            m23788b();
        } else {
            m23787a();
        }
    }
}
