package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.InterfaceC1479a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
/* loaded from: classes2.dex */
abstract class AbstractC1461h {

    /* renamed from: androidx.core.provider.h$a */
    /* loaded from: classes2.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a */
        private String f6324a;

        /* renamed from: b */
        private int f6325b;

        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C32626a extends Thread {

            /* renamed from: p */
            private final int f6326p;

            C32626a(Runnable runnable, String str, int i11) {
                super(runnable, str);
                this.f6326p = i11;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f6326p);
                super.run();
            }
        }

        a(String str, int i11) {
            this.f6324a = str;
            this.f6325b = i11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C32626a(runnable, this.f6324a, this.f6325b);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    /* loaded from: classes2.dex */
    private static class b implements Runnable {

        /* renamed from: p */
        private Callable f6327p;

        /* renamed from: q */
        private InterfaceC1479a f6328q;

        /* renamed from: r */
        private Handler f6329r;

        /* renamed from: androidx.core.provider.h$b$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1479a f6330p;

            /* renamed from: q */
            final /* synthetic */ Object f6331q;

            a(InterfaceC1479a interfaceC1479a, Object obj) {
                this.f6330p = interfaceC1479a;
                this.f6331q = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6330p.accept(this.f6331q);
            }
        }

        b(Handler handler, Callable callable, InterfaceC1479a interfaceC1479a) {
            this.f6327p = callable;
            this.f6328q = interfaceC1479a;
            this.f6329r = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f6327p.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f6329r.post(new a(this.f6328q, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m7414a(String str, int i11, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i12, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i11));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m7415b(Executor executor, Callable callable, InterfaceC1479a interfaceC1479a) {
        executor.execute(new b(AbstractC1455b.m7375a(), callable, interfaceC1479a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Object m7416c(ExecutorService executorService, Callable callable, int i11) {
        try {
            return executorService.submit(callable).get(i11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (ExecutionException e12) {
            throw new RuntimeException(e12);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
