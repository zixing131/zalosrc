package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class fl0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f20183a = new AtomicInteger(1);

    /* renamed from: b */
    final /* synthetic */ String f20184b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fl0(String str) {
        this.f20184b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f20184b + ") #" + this.f20183a.getAndIncrement());
    }
}
