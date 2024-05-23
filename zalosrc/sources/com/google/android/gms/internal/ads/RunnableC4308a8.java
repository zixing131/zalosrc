package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.a8 */
/* loaded from: classes2.dex */
public final class RunnableC4308a8 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC4788n8 f16968p;

    /* renamed from: q */
    final /* synthetic */ C4345b8 f16969q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4308a8(C4345b8 c4345b8, AbstractC4788n8 abstractC4788n8) {
        this.f16969q = c4345b8;
        this.f16968p = abstractC4788n8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f16969q.f17658q;
            blockingQueue.put(this.f16968p);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
