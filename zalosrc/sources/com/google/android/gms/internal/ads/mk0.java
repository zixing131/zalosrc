package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class mk0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f24628a = new AtomicInteger(1);

    /* renamed from: b */
    final /* synthetic */ String f24629b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mk0(String str) {
        this.f24629b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f24629b + ") #" + this.f24628a.getAndIncrement());
    }
}
