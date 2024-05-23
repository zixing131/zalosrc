package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class oc3 implements tc3 {

    /* renamed from: q */
    static final tc3 f25596q = new oc3(null);

    /* renamed from: r */
    private static final Logger f25597r = Logger.getLogger(oc3.class.getName());

    /* renamed from: p */
    private final Object f25598p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public oc3(Object obj) {
        this.f25598p = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f25598p;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f25598p + "]]";
    }

    @Override // com.google.android.gms.internal.ads.tc3
    public final void zzc(Runnable runnable, Executor executor) {
        j53.m23533c(runnable, "Runnable was null.");
        j53.m23533c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f25597r.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f25598p;
    }
}
