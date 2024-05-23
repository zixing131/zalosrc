package ll0;

import fg0.ThreadFactoryC18930c;
import ho0.AbstractC20110a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ll0.a */
/* loaded from: classes.dex */
public class C22513a {

    /* renamed from: a */
    private final ThreadPoolExecutor f110184a;

    public C22513a(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC18930c(str));
        this.f110184a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public void m116414a(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.f110184a;
        if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
            this.f110184a.execute(runnable);
        } else {
            AbstractC20110a.m104538g("ZinstantExecutor has been shutdown.", new Object[0]);
        }
    }
}
