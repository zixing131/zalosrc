package p008a2;

import fn0.AbstractC19074t;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import pm0.C24848g0;

/* renamed from: a2.i0 */
/* loaded from: classes.dex */
public final class ExecutorC0072i0 implements Executor {

    /* renamed from: p */
    private final Executor f305p;

    /* renamed from: q */
    private final ArrayDeque f306q;

    /* renamed from: r */
    private Runnable f307r;

    /* renamed from: s */
    private final Object f308s;

    public ExecutorC0072i0(Executor executor) {
        AbstractC19074t.m100208f(executor, "executor");
        this.f305p = executor;
        this.f306q = new ArrayDeque();
        this.f308s = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m257b(Runnable runnable, ExecutorC0072i0 executorC0072i0) {
        AbstractC19074t.m100208f(runnable, "$command");
        AbstractC19074t.m100208f(executorC0072i0, "this$0");
        try {
            runnable.run();
        } finally {
            executorC0072i0.m258c();
        }
    }

    /* renamed from: c */
    public final void m258c() {
        synchronized (this.f308s) {
            try {
                Object poll = this.f306q.poll();
                Runnable runnable = (Runnable) poll;
                this.f307r = runnable;
                if (poll != null) {
                    this.f305p.execute(runnable);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "command");
        synchronized (this.f308s) {
            try {
                this.f306q.offer(new Runnable() { // from class: a2.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorC0072i0.m257b(runnable, this);
                    }
                });
                if (this.f307r == null) {
                    m258c();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
