package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class pl0 implements tc3 {
    private final cd3 zza = cd3.m20862D();

    /* renamed from: a */
    private static final boolean m25478a(boolean z11) {
        if (!z11) {
            zzt.zzo().m22944s(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z11;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.zza.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.tc3
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    public final boolean zzd(Object obj) {
        boolean mo20863g = this.zza.mo20863g(obj);
        m25478a(mo20863g);
        return mo20863g;
    }

    public final boolean zze(Throwable th2) {
        boolean mo20864h = this.zza.mo20864h(th2);
        m25478a(mo20864h);
        return mo20864h;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j11, timeUnit);
    }
}
