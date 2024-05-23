package p001a.p005d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.adtima.Adtima;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001a.p005d.AbstractRunnableC0008c;

/* renamed from: a.d.d */
/* loaded from: classes2.dex */
public class C0009d {

    /* renamed from: d */
    private static volatile C0009d f10d;

    /* renamed from: e */
    private static final int f11e;

    /* renamed from: f */
    private static final int f12f;

    /* renamed from: g */
    private static final int f13g;

    /* renamed from: h */
    private static final BlockingQueue f14h;

    /* renamed from: a */
    private ExecutorService f15a;

    /* renamed from: b */
    private Handler f16b;

    /* renamed from: c */
    private HandlerC0006a f17c = new HandlerC0006a(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.d.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18a;

        static {
            int[] iArr = new int[AbstractRunnableC0008c.d.values().length];
            f18a = iArr;
            try {
                iArr[AbstractRunnableC0008c.d.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18a[AbstractRunnableC0008c.d.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f11e = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        f12f = max;
        f13g = (max * 2) + 1;
        f14h = new LinkedBlockingQueue(128);
    }

    private C0009d() {
        int i11 = f12f;
        int i12 = f13g;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f15a = new ThreadPoolExecutor(i11, i12, 60L, timeUnit, (BlockingQueue<Runnable>) f14h, AbstractC0010e.f19a);
        new ThreadPoolExecutor(0, i12, 60L, timeUnit, new SynchronousQueue(), AbstractC0010e.f20b);
        this.f16b = m6b("IoHandler");
    }

    /* renamed from: a */
    private static C0009d m5a() {
        if (f10d == null) {
            synchronized (C0009d.class) {
                try {
                    if (f10d == null) {
                        f10d = new C0009d();
                    }
                } finally {
                }
            }
        }
        return f10d;
    }

    /* renamed from: b */
    public static Handler m6b(String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str, 10);
            handlerThread.start();
            return new HandlerC0006a(handlerThread.getLooper());
        } catch (Exception e11) {
            Adtima.m18329e("TaskScheduler", "provideHandler", e11);
            return null;
        }
    }

    /* renamed from: c */
    public static void m7c(AbstractRunnableC0008c abstractRunnableC0008c) {
        if (abstractRunnableC0008c != null) {
            try {
                abstractRunnableC0008c.cancel();
            } catch (Exception e11) {
                Adtima.m18329e("TaskScheduler", "cancelTask", e11);
            }
        }
    }

    /* renamed from: d */
    public static void m8d(Runnable runnable) {
        m5a().f17c.post(runnable);
    }

    /* renamed from: e */
    public static void m9e(Runnable runnable, long j11) {
        try {
            m10f().postDelayed(runnable, j11);
        } catch (Exception e11) {
            Adtima.m18329e("TaskScheduler", "runOnUIThread", e11);
        }
    }

    /* renamed from: f */
    public static Handler m10f() {
        return m5a().f16b;
    }

    /* renamed from: g */
    public static void m11g(AbstractRunnableC0008c abstractRunnableC0008c) {
        if (abstractRunnableC0008c != null) {
            try {
                AbstractRunnableC0008c.d status = abstractRunnableC0008c.getStatus();
                if (status != AbstractRunnableC0008c.d.PENDING) {
                    int i11 = a.f18a[status.ordinal()];
                    if (i11 == 1) {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    }
                    if (i11 == 2) {
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                }
                abstractRunnableC0008c.setStatus(AbstractRunnableC0008c.d.RUNNING);
                abstractRunnableC0008c.onPreExecute();
                m5a().f15a.execute(abstractRunnableC0008c);
            } catch (Exception e11) {
                Adtima.m18329e("TaskScheduler", "execute", e11);
            }
        }
    }
}
