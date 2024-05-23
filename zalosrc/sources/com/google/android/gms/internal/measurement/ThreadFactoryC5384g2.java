package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* loaded from: classes.dex */
public final class ThreadFactoryC5384g2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f32385a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC5384g2(C5656w2 c5656w2) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f32385a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
