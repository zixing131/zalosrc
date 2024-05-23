package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class k23 implements i23 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k23(j23 j23Var) {
    }

    @Override // com.google.android.gms.internal.ads.i23
    /* renamed from: a */
    public final ExecutorService mo23115a(int i11) {
        return mo23117c(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.i23
    /* renamed from: b */
    public final ExecutorService mo23116b(ThreadFactory threadFactory, int i11) {
        return mo23117c(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.i23
    /* renamed from: c */
    public final ExecutorService mo23117c(int i11, ThreadFactory threadFactory, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
