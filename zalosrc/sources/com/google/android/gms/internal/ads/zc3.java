package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zc3 extends wc3 implements ScheduledExecutorService, uc3 {

    /* renamed from: q */
    final ScheduledExecutorService f31453q;

    public zc3(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f31453q = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
        ld3 m24230E = ld3.m24230E(runnable, null);
        return new xc3(m24230E, this.f31453q.schedule(m24230E, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        yc3 yc3Var = new yc3(runnable);
        return new xc3(yc3Var, this.f31453q.scheduleAtFixedRate(yc3Var, j11, j12, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        yc3 yc3Var = new yc3(runnable);
        return new xc3(yc3Var, this.f31453q.scheduleWithFixedDelay(yc3Var, j11, j12, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j11, TimeUnit timeUnit) {
        ld3 ld3Var = new ld3(callable);
        return new xc3(ld3Var, this.f31453q.schedule(ld3Var, j11, timeUnit));
    }
}
