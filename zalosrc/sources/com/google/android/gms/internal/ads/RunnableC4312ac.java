package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.ac */
/* loaded from: classes2.dex */
final class RunnableC4312ac implements Runnable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC4312ac(AbstractC5237zb abstractC5237zb) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            AbstractC4349bc.m20473c(MessageDigest.getInstance("MD5"));
            countDownLatch = AbstractC4349bc.f17693e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = AbstractC4349bc.f17693e;
        } catch (Throwable th2) {
            AbstractC4349bc.f17693e.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
