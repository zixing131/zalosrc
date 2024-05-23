package p001a.p005d;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.d.e */
/* loaded from: classes2.dex */
abstract class AbstractC0010e {

    /* renamed from: a */
    static final ThreadFactory f19a = new a();

    /* renamed from: b */
    static final ThreadFactory f20b = new b();

    /* renamed from: a.d.e$a */
    /* loaded from: classes2.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f21a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new d(runnable), "TaskScheduler  #" + this.f21a.getAndIncrement());
        }
    }

    /* renamed from: a.d.e$b */
    /* loaded from: classes2.dex */
    class b implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f22a = new AtomicInteger(1);

        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new d(runnable), "TaskScheduler timeoutThread #" + this.f22a.getAndIncrement());
        }
    }

    /* renamed from: a.d.e$c */
    /* loaded from: classes2.dex */
    class c implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f23a = new AtomicInteger(1);

        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new d(runnable), "TaskScheduler scheduler #" + this.f23a.getAndIncrement());
        }
    }

    /* renamed from: a.d.e$d */
    /* loaded from: classes2.dex */
    static final class d implements Runnable {

        /* renamed from: p */
        private Runnable f24p;

        d(Runnable runnable) {
            this.f24p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            this.f24p.run();
        }
    }

    static {
        new c();
    }
}
