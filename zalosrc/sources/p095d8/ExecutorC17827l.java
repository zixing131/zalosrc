package p095d8;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d8.l */
/* loaded from: classes.dex */
public final class ExecutorC17827l implements Executor {

    /* renamed from: u */
    private static final Logger f90073u = Logger.getLogger(ExecutorC17827l.class.getName());

    /* renamed from: p */
    private final Executor f90074p;

    /* renamed from: q */
    private final Deque f90075q = new ArrayDeque();

    /* renamed from: r */
    private c f90076r = c.IDLE;

    /* renamed from: s */
    private long f90077s = 0;

    /* renamed from: t */
    private final b f90078t = new b(this, null);

    /* renamed from: d8.l$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Runnable f90079p;

        a(Runnable runnable) {
            this.f90079p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f90079p.run();
        }

        public String toString() {
            return this.f90079p.toString();
        }
    }

    /* renamed from: d8.l$b */
    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: p */
        Runnable f90081p;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:            r1 = r1 | java.lang.Thread.interrupted();        r2 = null;     */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:            r8.f90081p.run();     */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:            r8.f90081p = null;     */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:            throw r0;     */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:            r3 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:            p095d8.ExecutorC17827l.f90073u.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f90081p, (java.lang.Throwable) r3);     */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:            return;     */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void m94069a() {
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                try {
                    synchronized (ExecutorC17827l.this.f90075q) {
                        if (!z11) {
                            c cVar = ExecutorC17827l.this.f90076r;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                ExecutorC17827l.m94067d(ExecutorC17827l.this);
                                ExecutorC17827l.this.f90076r = cVar2;
                                z11 = true;
                            }
                        }
                        Runnable runnable = (Runnable) ExecutorC17827l.this.f90075q.poll();
                        this.f90081p = runnable;
                        if (runnable == null) {
                            ExecutorC17827l.this.f90076r = c.IDLE;
                        }
                    }
                    if (z12) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } finally {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m94069a();
            } catch (Error e11) {
                synchronized (ExecutorC17827l.this.f90075q) {
                    ExecutorC17827l.this.f90076r = c.IDLE;
                    throw e11;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f90081p;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC17827l.this.f90076r + "}";
        }

        /* synthetic */ b(ExecutorC17827l executorC17827l, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d8.l$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC17827l(Executor executor) {
        this.f90074p = (Executor) AbstractC4205o.m19722k(executor);
    }

    /* renamed from: d */
    static /* synthetic */ long m94067d(ExecutorC17827l executorC17827l) {
        long j11 = executorC17827l.f90077s;
        executorC17827l.f90077s = 1 + j11;
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z11;
        AbstractC4205o.m19722k(runnable);
        synchronized (this.f90075q) {
            c cVar2 = this.f90076r;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j11 = this.f90077s;
                a aVar = new a(runnable);
                this.f90075q.add(aVar);
                c cVar3 = c.QUEUING;
                this.f90076r = cVar3;
                try {
                    this.f90074p.execute(this.f90078t);
                    if (this.f90076r != cVar3) {
                        return;
                    }
                    synchronized (this.f90075q) {
                        try {
                            if (this.f90077s == j11 && this.f90076r == cVar3) {
                                this.f90076r = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e11) {
                    synchronized (this.f90075q) {
                        try {
                            c cVar4 = this.f90076r;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z11 = false;
                                if ((e11 instanceof RejectedExecutionException) || z11) {
                                    throw e11;
                                }
                            }
                            if (this.f90075q.removeLastOccurrence(aVar)) {
                                z11 = true;
                                if (e11 instanceof RejectedExecutionException) {
                                }
                                throw e11;
                            }
                            z11 = false;
                            if (e11 instanceof RejectedExecutionException) {
                            }
                            throw e11;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f90075q.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f90074p + "}";
    }
}
