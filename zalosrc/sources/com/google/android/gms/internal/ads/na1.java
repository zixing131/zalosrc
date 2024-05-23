package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class na1 extends kd1 {

    /* renamed from: q */
    private final ScheduledExecutorService f25105q;

    /* renamed from: r */
    private final InterfaceC20285f f25106r;

    /* renamed from: s */
    private long f25107s;

    /* renamed from: t */
    private long f25108t;

    /* renamed from: u */
    private boolean f25109u;

    /* renamed from: v */
    private ScheduledFuture f25110v;

    public na1(ScheduledExecutorService scheduledExecutorService, InterfaceC20285f interfaceC20285f) {
        super(Collections.emptySet());
        this.f25107s = -1L;
        this.f25108t = -1L;
        this.f25109u = false;
        this.f25105q = scheduledExecutorService;
        this.f25106r = interfaceC20285f;
    }

    /* renamed from: C0 */
    private final synchronized void m24865C0(long j11) {
        try {
            ScheduledFuture scheduledFuture = this.f25110v;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f25110v.cancel(true);
            }
            this.f25107s = this.f25106r.mo105914b() + j11;
            this.f25110v = this.f25105q.schedule(new ma1(this, null), j11, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: B0 */
    public final synchronized void m24866B0(int i11) {
        if (i11 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i11);
        if (this.f25109u) {
            long j11 = this.f25108t;
            if (j11 <= 0 || millis >= j11) {
                millis = j11;
            }
            this.f25108t = millis;
            return;
        }
        long mo105914b = this.f25106r.mo105914b();
        long j12 = this.f25107s;
        if (mo105914b <= j12 && j12 - this.f25106r.mo105914b() <= millis) {
            return;
        }
        m24865C0(millis);
    }

    public final synchronized void zza() {
        this.f25109u = false;
        m24865C0(0L);
    }

    public final synchronized void zzb() {
        try {
            if (!this.f25109u) {
                ScheduledFuture scheduledFuture = this.f25110v;
                if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                    this.f25110v.cancel(true);
                    this.f25108t = this.f25107s - this.f25106r.mo105914b();
                } else {
                    this.f25108t = -1L;
                }
                this.f25109u = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.f25109u) {
                if (this.f25108t > 0 && this.f25110v.isCancelled()) {
                    m24865C0(this.f25108t);
                }
                this.f25109u = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
