package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class gl0 implements Executor {

    /* renamed from: p */
    private final Handler f20726p = new zzf(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th2) {
                zzt.zzp();
                zzs.zzI(zzt.zzo().m22932c(), th2);
                throw th2;
            }
        }
        this.f20726p.post(runnable);
    }
}
