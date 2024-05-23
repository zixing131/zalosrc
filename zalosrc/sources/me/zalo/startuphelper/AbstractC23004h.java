package me.zalo.startuphelper;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: me.zalo.startuphelper.h */
/* loaded from: classes7.dex */
abstract class AbstractC23004h {

    /* renamed from: a */
    private static ThreadPoolExecutor f111879a;

    /* renamed from: me.zalo.startuphelper.h$a */
    /* loaded from: classes7.dex */
    static class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f111880a = new AtomicInteger(1);

        /* renamed from: b */
        private final String f111881b;

        public a(String str) {
            this.f111881b = "pool-" + str + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f111881b + this.f111880a.getAndIncrement());
            thread.setPriority(10);
            return thread;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
        f111879a = threadPoolExecutor;
        threadPoolExecutor.setThreadFactory(new a("TaskExecutor"));
        f111879a.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static void m117868a(Runnable runnable) {
        f111879a.execute(runnable);
    }
}
