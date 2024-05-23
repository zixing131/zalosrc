package ik0;

import fg0.ThreadFactoryC18928a;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ik0.w */
/* loaded from: classes.dex */
public class C20600w extends ThreadPoolExecutor {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ik0.w$b */
    /* loaded from: classes7.dex */
    public static class b implements RunnableFuture {

        /* renamed from: p */
        private RunnableFuture f101337p;

        /* renamed from: q */
        private int f101338q;

        public b(RunnableFuture runnableFuture, int i11) {
            this.f101337p = runnableFuture;
            this.f101338q = i11;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            return this.f101337p.cancel(z11);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f101337p.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f101337p.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f101337p.isDone();
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.f101337p.run();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j11, TimeUnit timeUnit) {
            return this.f101337p.get();
        }
    }

    /* renamed from: ik0.w$c */
    /* loaded from: classes.dex */
    private static class c implements Comparator {
        private c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            int i11;
            int i12;
            if (runnable == null && runnable2 == null) {
                return 0;
            }
            if (runnable == null) {
                return -1;
            }
            if (runnable2 == null || (i11 = ((b) runnable).f101338q) > (i12 = ((b) runnable2).f101338q)) {
                return 1;
            }
            if (i11 == i12) {
                return 0;
            }
            return -1;
        }
    }

    /* renamed from: ik0.w$d */
    /* loaded from: classes7.dex */
    public static abstract class d implements Runnable {

        /* renamed from: p */
        private int f101339p;

        public d(int i11) {
            this.f101339p = i11;
        }
    }

    public C20600w() {
        super(2, 2, 30L, TimeUnit.SECONDS, new PriorityBlockingQueue(128, new c()), new ThreadFactoryC18928a("ZinstantPriorityExecutor"));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        if (runnable instanceof d) {
            return new b(super.newTaskFor(runnable, obj), ((d) runnable).f101339p);
        }
        return new b(super.newTaskFor(runnable, obj), 0);
    }
}
