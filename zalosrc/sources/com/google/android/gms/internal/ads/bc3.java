package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class bc3 extends ac3 {

    /* renamed from: w */
    private final tc3 f17697w;

    public bc3(tc3 tc3Var) {
        tc3Var.getClass();
        this.f17697w = tc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3, java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f17697w.cancel(z11);
    }

    @Override // com.google.android.gms.internal.ads.ma3, java.util.concurrent.Future
    public final Object get() {
        return this.f17697w.get();
    }

    @Override // com.google.android.gms.internal.ads.ma3, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f17697w.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.ma3, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17697w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final String toString() {
        return this.f17697w.toString();
    }

    @Override // com.google.android.gms.internal.ads.ma3, com.google.android.gms.internal.ads.tc3
    public final void zzc(Runnable runnable, Executor executor) {
        this.f17697w.zzc(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.ma3, java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return this.f17697w.get(j11, timeUnit);
    }
}
