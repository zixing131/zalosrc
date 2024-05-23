package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class lu2 implements tc3 {

    /* renamed from: p */
    private final Object f24057p;

    /* renamed from: q */
    private final String f24058q;

    /* renamed from: r */
    private final tc3 f24059r;

    public lu2(Object obj, String str, tc3 tc3Var) {
        this.f24057p = obj;
        this.f24058q = str;
        this.f24059r = tc3Var;
    }

    /* renamed from: a */
    public final Object m24374a() {
        return this.f24057p;
    }

    /* renamed from: c */
    public final String m24375c() {
        return this.f24058q;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f24059r.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24059r.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24059r.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24059r.isDone();
    }

    public final String toString() {
        return this.f24058q + "@" + System.identityHashCode(this);
    }

    @Override // com.google.android.gms.internal.ads.tc3
    public final void zzc(Runnable runnable, Executor executor) {
        this.f24059r.zzc(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return this.f24059r.get(j11, timeUnit);
    }
}
