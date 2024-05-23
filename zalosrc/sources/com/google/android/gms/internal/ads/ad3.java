package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class ad3 {
    /* renamed from: a */
    public static uc3 m20087a(ExecutorService executorService) {
        uc3 wc3Var;
        if (executorService instanceof uc3) {
            return (uc3) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            wc3Var = new zc3((ScheduledExecutorService) executorService);
        } else {
            wc3Var = new wc3(executorService);
        }
        return wc3Var;
    }

    /* renamed from: b */
    public static Executor m20088b() {
        return xb3.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Executor m20089c(Executor executor, ma3 ma3Var) {
        executor.getClass();
        if (executor == xb3.INSTANCE) {
            return executor;
        }
        return new vc3(executor, ma3Var);
    }
}
