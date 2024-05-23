package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.he */
/* loaded from: classes2.dex */
final class ThreadFactoryC4572he implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f21646a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f21647b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f21646a.newThread(runnable);
        newThread.setName("gads-" + this.f21647b.getAndIncrement());
        return newThread;
    }
}
