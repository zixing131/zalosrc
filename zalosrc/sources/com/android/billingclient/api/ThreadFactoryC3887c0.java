package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.c0 */
/* loaded from: classes2.dex */
public final class ThreadFactoryC3887c0 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f15481a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f15482b = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC3887c0(C3898f c3898f) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f15482b;
        Thread newThread = this.f15481a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
