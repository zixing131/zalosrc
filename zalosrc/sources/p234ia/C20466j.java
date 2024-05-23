package p234ia;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p633x5.AbstractExecutorServiceC29335b0;

/* renamed from: ia.j */
/* loaded from: classes.dex */
public class C20466j extends AbstractExecutorServiceC29335b0 {

    /* renamed from: q */
    private static final ThreadLocal f100670q = new ThreadLocal();

    /* renamed from: p */
    private final ThreadPoolExecutor f100671p;

    public C20466j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ia.v
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: ia.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20466j.m106499d(runnable);
                    }
                });
            }
        });
        this.f100671p = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m106499d(Runnable runnable) {
        f100670q.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m106500e(Deque deque, Runnable runnable) {
        AbstractC4205o.m19722k(deque);
        deque.add(runnable);
        if (deque.size() > 1) {
            return;
        }
        do {
            runnable.run();
            deque.removeFirst();
            runnable = (Runnable) deque.peekFirst();
        } while (runnable != null);
    }

    @Override // p633x5.AbstractC29344g
    /* renamed from: a */
    protected final /* synthetic */ Object mo106501a() {
        return this.f100671p;
    }

    @Override // p633x5.AbstractExecutorServiceC29335b0
    /* renamed from: b */
    protected final ExecutorService mo106502b() {
        return this.f100671p;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f100670q.get();
        if (deque != null && deque.size() <= 1) {
            m106500e(deque, runnable);
        } else {
            this.f100671p.execute(new Runnable() { // from class: ia.w
                @Override // java.lang.Runnable
                public final void run() {
                    C20466j.m106500e((Deque) C20466j.f100670q.get(), runnable);
                }
            });
        }
    }
}
