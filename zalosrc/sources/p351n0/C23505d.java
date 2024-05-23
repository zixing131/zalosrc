package p351n0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n0.d */
/* loaded from: classes.dex */
public class C23505d extends AbstractC23506e {

    /* renamed from: a */
    private final Object f114146a = new Object();

    /* renamed from: b */
    private final ExecutorService f114147b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    private volatile Handler f114148c;

    /* renamed from: n0.d$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f114149a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f114149a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0.d$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Handler m123380a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: e */
    private static Handler m123379e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m123380a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p351n0.AbstractC23506e
    /* renamed from: a */
    public void mo123376a(Runnable runnable) {
        this.f114147b.execute(runnable);
    }

    @Override // p351n0.AbstractC23506e
    /* renamed from: c */
    public boolean mo123377c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // p351n0.AbstractC23506e
    /* renamed from: d */
    public void mo123378d(Runnable runnable) {
        if (this.f114148c == null) {
            synchronized (this.f114146a) {
                try {
                    if (this.f114148c == null) {
                        this.f114148c = m123379e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f114148c.post(runnable);
    }
}
