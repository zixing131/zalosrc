package p231i7;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: i7.f */
/* loaded from: classes.dex */
public abstract class AbstractC20362f {

    /* renamed from: a */
    private static ThreadPoolExecutor f100376a;

    /* renamed from: a */
    public static Executor m106124a() {
        if (f100376a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20361e());
            f100376a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f100376a;
    }
}
