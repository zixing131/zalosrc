package p232i8;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p153f8.C18821f;

/* renamed from: i8.u */
/* loaded from: classes.dex */
public abstract class AbstractC20420u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.u$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f100573a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f100574b;

        /* renamed from: i8.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C32841a extends AbstractRunnableC20385c {

            /* renamed from: p */
            final /* synthetic */ Runnable f100575p;

            C32841a(Runnable runnable) {
                this.f100575p = runnable;
            }

            @Override // p232i8.AbstractRunnableC20385c
            /* renamed from: a */
            public void mo106177a() {
                this.f100575p.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f100573a = str;
            this.f100574b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C32841a(runnable));
            newThread.setName(this.f100573a + this.f100574b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.u$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC20385c {

        /* renamed from: p */
        final /* synthetic */ String f100577p;

        /* renamed from: q */
        final /* synthetic */ ExecutorService f100578q;

        /* renamed from: r */
        final /* synthetic */ long f100579r;

        /* renamed from: s */
        final /* synthetic */ TimeUnit f100580s;

        b(String str, ExecutorService executorService, long j11, TimeUnit timeUnit) {
            this.f100577p = str;
            this.f100578q = executorService;
            this.f100579r = j11;
            this.f100580s = timeUnit;
        }

        @Override // p232i8.AbstractRunnableC20385c
        /* renamed from: a */
        public void mo106177a() {
            try {
                C18821f.m98795f().m98796b("Executing shutdown hook for " + this.f100577p);
                this.f100578q.shutdown();
                if (!this.f100578q.awaitTermination(this.f100579r, this.f100580s)) {
                    C18821f.m98795f().m98796b(this.f100577p + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f100578q.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C18821f.m98795f().m98796b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f100577p));
                this.f100578q.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m106414a(String str, ExecutorService executorService) {
        m106415b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m106415b(String str, ExecutorService executorService, long j11, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j11, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m106416c(String str) {
        ExecutorService m106418e = m106418e(m106417d(str), new ThreadPoolExecutor.DiscardPolicy());
        m106414a(str, m106418e);
        return m106418e;
    }

    /* renamed from: d */
    public static ThreadFactory m106417d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    /* renamed from: e */
    private static ExecutorService m106418e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
