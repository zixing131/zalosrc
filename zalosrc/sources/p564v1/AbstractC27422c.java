package p564v1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: v1.c */
/* loaded from: classes2.dex */
abstract class AbstractC27422c {

    /* renamed from: u */
    private static final ThreadFactory f129086u;

    /* renamed from: v */
    private static final BlockingQueue f129087v;

    /* renamed from: w */
    public static final Executor f129088w;

    /* renamed from: x */
    private static f f129089x;

    /* renamed from: y */
    private static volatile Executor f129090y;

    /* renamed from: p */
    private final h f129091p;

    /* renamed from: q */
    private final FutureTask f129092q;

    /* renamed from: r */
    private volatile g f129093r = g.PENDING;

    /* renamed from: s */
    final AtomicBoolean f129094s = new AtomicBoolean();

    /* renamed from: t */
    final AtomicBoolean f129095t = new AtomicBoolean();

    /* renamed from: v1.c$a */
    /* loaded from: classes2.dex */
    static class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f129096a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f129096a.getAndIncrement());
        }
    }

    /* renamed from: v1.c$b */
    /* loaded from: classes2.dex */
    class b extends h {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC27422c.this.f129095t.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = AbstractC27422c.this.mo140432b(this.f129106a);
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    /* renamed from: v1.c$c */
    /* loaded from: classes2.dex */
    class c extends FutureTask {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC27422c.this.m140462l(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                AbstractC27422c.this.m140462l(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: v1.c$d */
    /* loaded from: classes2.dex */
    static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f129099a;

        static {
            int[] iArr = new int[g.values().length];
            f129099a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129099a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1.c$e */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a */
        final AbstractC27422c f129100a;

        /* renamed from: b */
        final Object[] f129101b;

        e(AbstractC27422c abstractC27422c, Object... objArr) {
            this.f129100a = abstractC27422c;
            this.f129101b = objArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1.c$f */
    /* loaded from: classes2.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    eVar.f129100a.m140460j(eVar.f129101b);
                    return;
                }
                return;
            }
            eVar.f129100a.m140457d(eVar.f129101b[0]);
        }
    }

    /* renamed from: v1.c$g */
    /* loaded from: classes2.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: v1.c$h */
    /* loaded from: classes2.dex */
    private static abstract class h implements Callable {

        /* renamed from: a */
        Object[] f129106a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f129086u = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f129087v = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f129088w = threadPoolExecutor;
        f129090y = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC27422c() {
        b bVar = new b();
        this.f129091p = bVar;
        this.f129092q = new c(bVar);
    }

    /* renamed from: e */
    private static Handler m140454e() {
        f fVar;
        synchronized (AbstractC27422c.class) {
            try {
                if (f129089x == null) {
                    f129089x = new f();
                }
                fVar = f129089x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean m140455a(boolean z11) {
        this.f129094s.set(true);
        return this.f129092q.cancel(z11);
    }

    /* renamed from: b */
    protected abstract Object mo140432b(Object... objArr);

    /* renamed from: c */
    public final AbstractC27422c m140456c(Executor executor, Object... objArr) {
        if (this.f129093r != g.PENDING) {
            int i11 = d.f129099a[this.f129093r.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f129093r = g.RUNNING;
        m140459i();
        this.f129091p.f129106a = objArr;
        executor.execute(this.f129092q);
        return this;
    }

    /* renamed from: d */
    void m140457d(Object obj) {
        if (m140458f()) {
            mo140433g(obj);
        } else {
            mo140434h(obj);
        }
        this.f129093r = g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m140458f() {
        return this.f129094s.get();
    }

    /* renamed from: g */
    protected abstract void mo140433g(Object obj);

    /* renamed from: h */
    protected abstract void mo140434h(Object obj);

    /* renamed from: i */
    protected void m140459i() {
    }

    /* renamed from: j */
    protected void m140460j(Object... objArr) {
    }

    /* renamed from: k */
    Object m140461k(Object obj) {
        m140454e().obtainMessage(1, new e(this, obj)).sendToTarget();
        return obj;
    }

    /* renamed from: l */
    void m140462l(Object obj) {
        if (!this.f129095t.get()) {
            m140461k(obj);
        }
    }
}
