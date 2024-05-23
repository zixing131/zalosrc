package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.po */
/* loaded from: classes2.dex */
final class ThreadFactoryC4879po implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f26264a = "Loader:ExtractorMediaPeriod";

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC4879po(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f26264a);
    }
}
