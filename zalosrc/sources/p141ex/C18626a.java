package p141ex;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ex.a */
/* loaded from: classes4.dex */
public class C18626a extends ThreadPoolExecutor {
    public C18626a(int i11, int i12, long j11, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(i11, i12, j11, timeUnit, blockingQueue);
    }

    /* renamed from: a */
    public void m98433a(Runnable runnable, Map map) {
        String uuid = UUID.randomUUID().toString();
        RunnableC18629d runnableC18629d = new RunnableC18629d(runnable, uuid);
        map.put(runnable, runnableC18629d);
        super.execute(runnableC18629d);
        AbstractC18630e.m98439b(getQueue().size(), new Exception(), -1L, -1L, uuid, false, "-");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        String uuid = UUID.randomUUID().toString();
        super.execute(new RunnableC18629d(runnable, uuid));
        AbstractC18630e.m98439b(getQueue().size(), new Exception(), -1L, -1L, uuid, false, "-");
    }
}
