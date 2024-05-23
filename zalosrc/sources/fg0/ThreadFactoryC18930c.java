package fg0;

import fn0.AbstractC19074t;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fg0.c */
/* loaded from: classes.dex */
public class ThreadFactoryC18930c implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f94438a;

    /* renamed from: b */
    private final AtomicInteger f94439b;

    /* renamed from: c */
    private final String f94440c;

    /* renamed from: d */
    private final String f94441d;

    public ThreadFactoryC18930c(String str) {
        AbstractC19074t.m100208f(str, "poolName");
        this.f94441d = str;
        this.f94438a = m99174a();
        this.f94439b = new AtomicInteger(1);
        this.f94440c = "Z:" + str + '-';
    }

    /* renamed from: a */
    private final ThreadGroup m99174a() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            return securityManager.getThreadGroup();
        }
        Thread currentThread = Thread.currentThread();
        AbstractC19074t.m100207e(currentThread, "Thread.currentThread()");
        return currentThread.getThreadGroup();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "r");
        Thread thread = new Thread(this.f94438a, runnable, this.f94440c + this.f94439b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        thread.setPriority(1);
        return thread;
    }

    public String toString() {
        return "MinPriorityGroupThreadFactory[Z:" + this.f94441d + ']';
    }
}
