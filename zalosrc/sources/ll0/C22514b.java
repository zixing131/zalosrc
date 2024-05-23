package ll0;

import fg0.ThreadFactoryC18930c;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ll0.b */
/* loaded from: classes7.dex */
public final class C22514b {

    /* renamed from: b */
    private static final int f110185b;

    /* renamed from: c */
    public static final int f110186c;

    /* renamed from: d */
    public static final int f110187d;

    /* renamed from: a */
    private final ThreadPoolExecutor f110188a;

    /* renamed from: ll0.b$b */
    /* loaded from: classes7.dex */
    private static class b {

        /* renamed from: a */
        private static final C22514b f110189a = new C22514b();
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f110185b = availableProcessors;
        f110186c = Math.max(2, Math.min(availableProcessors - 1, 4));
        f110187d = (availableProcessors * 2) + 1;
    }

    /* renamed from: b */
    public static C22514b m116415b() {
        return b.f110189a;
    }

    /* renamed from: a */
    public void m116416a(Runnable runnable) {
        this.f110188a.execute(runnable);
    }

    private C22514b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f110186c, f110187d, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC18930c("ZinstantCommon"));
        this.f110188a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
