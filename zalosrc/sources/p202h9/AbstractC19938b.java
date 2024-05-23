package p202h9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: h9.b */
/* loaded from: classes3.dex */
public abstract class AbstractC19938b {

    /* renamed from: a */
    private static final InterfaceC19937a f98216a;

    /* renamed from: b */
    private static volatile InterfaceC19937a f98217b;

    /* renamed from: h9.b$b */
    /* loaded from: classes3.dex */
    private static class b implements InterfaceC19937a {
        private b() {
        }

        @Override // p202h9.InterfaceC19937a
        /* renamed from: a */
        public ExecutorService mo103698a(ThreadFactory threadFactory, EnumC19939c enumC19939c) {
            return m103700b(1, threadFactory, enumC19939c);
        }

        /* renamed from: b */
        public ExecutorService m103700b(int i11, ThreadFactory threadFactory, EnumC19939c enumC19939c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f98216a = bVar;
        f98217b = bVar;
    }

    /* renamed from: a */
    public static InterfaceC19937a m103699a() {
        return f98217b;
    }
}
