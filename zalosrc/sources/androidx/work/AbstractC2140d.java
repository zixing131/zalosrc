package androidx.work;

import fn0.AbstractC19074t;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.d */
/* loaded from: classes.dex */
public abstract class AbstractC2140d {

    /* renamed from: a */
    private static final int f9090a = 8;

    /* renamed from: androidx.work.d$a */
    /* loaded from: classes.dex */
    public static final class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f9091a = new AtomicInteger(0);

        /* renamed from: b */
        final /* synthetic */ boolean f9092b;

        a(boolean z11) {
            this.f9092b = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str;
            AbstractC19074t.m100208f(runnable, "runnable");
            if (this.f9092b) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f9091a.incrementAndGet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final Executor m11500b(boolean z11) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z11));
        AbstractC19074t.m100207e(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    /* renamed from: c */
    public static final int m11501c() {
        return f9090a;
    }
}
