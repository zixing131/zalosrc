package com.zing.zalo.zmedia.view;

import fg0.ThreadFactoryC18928a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zing.zalo.zmedia.view.f */
/* loaded from: classes7.dex */
public abstract class AbstractC17356f {

    /* renamed from: a */
    private static final ThreadPoolExecutor f88504a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("ReleaseResource"));
        f88504a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static void m92487a(Runnable runnable) {
        f88504a.execute(runnable);
    }
}
