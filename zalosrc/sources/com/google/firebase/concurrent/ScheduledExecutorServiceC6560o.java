package com.google.firebase.concurrent;

import com.google.firebase.concurrent.ScheduledFutureC6561p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.concurrent.o */
/* loaded from: classes.dex */
public class ScheduledExecutorServiceC6560o implements ScheduledExecutorService {

    /* renamed from: p */
    private final ExecutorService f36455p;

    /* renamed from: q */
    private final ScheduledExecutorService f36456q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledExecutorServiceC6560o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f36455p = executorService;
        this.f36456q = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m33507m(Runnable runnable, ScheduledFutureC6561p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e11) {
            bVar.mo33522a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m33508n(final Runnable runnable, final ScheduledFutureC6561p.b bVar) {
        this.f36455p.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6560o.m33507m(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ ScheduledFuture m33509o(final Runnable runnable, long j11, TimeUnit timeUnit, final ScheduledFutureC6561p.b bVar) {
        return this.f36456q.schedule(new Runnable() { // from class: com.google.firebase.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6560o.this.m33508n(runnable, bVar);
            }
        }, j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m33510p(Callable callable, ScheduledFutureC6561p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e11) {
            bVar.mo33522a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Future m33511q(final Callable callable, final ScheduledFutureC6561p.b bVar) {
        return this.f36455p.submit(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6560o.m33510p(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ ScheduledFuture m33512r(final Callable callable, long j11, TimeUnit timeUnit, final ScheduledFutureC6561p.b bVar) {
        return this.f36456q.schedule(new Callable() { // from class: com.google.firebase.concurrent.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future m33511q;
                m33511q = ScheduledExecutorServiceC6560o.this.m33511q(callable, bVar);
                return m33511q;
            }
        }, j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m33513s(Runnable runnable, ScheduledFutureC6561p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e11) {
            bVar.mo33522a(e11);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m33514t(final Runnable runnable, final ScheduledFutureC6561p.b bVar) {
        this.f36455p.execute(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6560o.m33513s(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ ScheduledFuture m33515u(final Runnable runnable, long j11, long j12, TimeUnit timeUnit, final ScheduledFutureC6561p.b bVar) {
        return this.f36456q.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6560o.this.m33514t(runnable, bVar);
            }
        }, j11, j12, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m33516v(final Runnable runnable, final ScheduledFutureC6561p.b bVar) {
        this.f36455p.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6560o.m33518x(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ ScheduledFuture m33517w(final Runnable runnable, long j11, long j12, TimeUnit timeUnit, final ScheduledFutureC6561p.b bVar) {
        return this.f36456q.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6560o.this.m33516v(runnable, bVar);
            }
        }, j11, j12, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ void m33518x(Runnable runnable, ScheduledFutureC6561p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e11) {
            bVar.mo33522a(e11);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) {
        return this.f36455p.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f36455p.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f36455p.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f36455p.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f36455p.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f36455p.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC6561p(new ScheduledFutureC6561p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.ScheduledFutureC6561p.c
            /* renamed from: a */
            public final ScheduledFuture mo33494a(ScheduledFutureC6561p.b bVar) {
                ScheduledFuture m33509o;
                m33509o = ScheduledExecutorServiceC6560o.this.m33509o(runnable, j11, timeUnit, bVar);
                return m33509o;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j11, final long j12, final TimeUnit timeUnit) {
        return new ScheduledFutureC6561p(new ScheduledFutureC6561p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.ScheduledFutureC6561p.c
            /* renamed from: a */
            public final ScheduledFuture mo33494a(ScheduledFutureC6561p.b bVar) {
                ScheduledFuture m33515u;
                m33515u = ScheduledExecutorServiceC6560o.this.m33515u(runnable, j11, j12, timeUnit, bVar);
                return m33515u;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j11, final long j12, final TimeUnit timeUnit) {
        return new ScheduledFutureC6561p(new ScheduledFutureC6561p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.ScheduledFutureC6561p.c
            /* renamed from: a */
            public final ScheduledFuture mo33494a(ScheduledFutureC6561p.b bVar) {
                ScheduledFuture m33517w;
                m33517w = ScheduledExecutorServiceC6560o.this.m33517w(runnable, j11, j12, timeUnit, bVar);
                return m33517w;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f36455p.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j11, TimeUnit timeUnit) {
        return this.f36455p.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j11, TimeUnit timeUnit) {
        return this.f36455p.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC6561p(new ScheduledFutureC6561p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.ScheduledFutureC6561p.c
            /* renamed from: a */
            public final ScheduledFuture mo33494a(ScheduledFutureC6561p.b bVar) {
                ScheduledFuture m33512r;
                m33512r = ScheduledExecutorServiceC6560o.this.m33512r(callable, j11, timeUnit, bVar);
                return m33512r;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f36455p.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f36455p.submit(runnable);
    }
}
