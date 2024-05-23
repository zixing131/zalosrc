package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class aj0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f17093a = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public aj0(dj0 dj0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f17093a.getAndIncrement());
    }
}
