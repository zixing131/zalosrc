package p232i8;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p342m6.InterfaceC22874c;

/* renamed from: i8.s0 */
/* loaded from: classes.dex */
public abstract class AbstractC20418s0 {

    /* renamed from: a */
    private static final ExecutorService f100566a = AbstractC20420u.m106416c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: f */
    public static Object m106402f(AbstractC22888j abstractC22888j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC22888j.mo117579h(f100566a, new InterfaceC22874c() { // from class: i8.n0

            /* renamed from: a */
            public final /* synthetic */ CountDownLatch f100539a;

            public /* synthetic */ C20408n0(CountDownLatch countDownLatch2) {
                r1 = countDownLatch2;
            }

            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j2) {
                Object m106405i;
                m106405i = AbstractC20418s0.m106405i(r1, abstractC22888j2);
                return m106405i;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch2.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch2.await(4L, TimeUnit.SECONDS);
        }
        if (abstractC22888j.mo117588q()) {
            return abstractC22888j.mo117584m();
        }
        if (!abstractC22888j.mo117586o()) {
            if (abstractC22888j.mo117587p()) {
                throw new IllegalStateException(abstractC22888j.mo117583l());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    /* renamed from: g */
    public static boolean m106403g(CountDownLatch countDownLatch, long j11, TimeUnit timeUnit) {
        boolean z11 = false;
        try {
            long nanos = timeUnit.toNanos(j11);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: h */
    public static AbstractC22888j m106404h(Executor executor, Callable callable) {
        C22890k c22890k = new C22890k();
        executor.execute(new Runnable() { // from class: i8.p0

            /* renamed from: p */
            public final /* synthetic */ Callable f100548p;

            /* renamed from: q */
            public final /* synthetic */ Executor f100549q;

            /* renamed from: r */
            public final /* synthetic */ C22890k f100550r;

            public /* synthetic */ RunnableC20412p0(Callable callable2, Executor executor2, C22890k c22890k2) {
                r1 = callable2;
                r2 = executor2;
                r3 = c22890k2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20418s0.m106407k(r1, r2, r3);
            }
        });
        return c22890k2.m117594a();
    }

    /* renamed from: i */
    public static /* synthetic */ Object m106405i(CountDownLatch countDownLatch, AbstractC22888j abstractC22888j) {
        countDownLatch.countDown();
        return null;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m106406j(C22890k c22890k, AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            c22890k.m117596c(abstractC22888j.mo117584m());
            return null;
        }
        if (abstractC22888j.mo117583l() != null) {
            c22890k.m117595b(abstractC22888j.mo117583l());
            return null;
        }
        return null;
    }

    /* renamed from: k */
    public static /* synthetic */ void m106407k(Callable callable, Executor executor, C22890k c22890k) {
        try {
            ((AbstractC22888j) callable.call()).mo117579h(executor, new InterfaceC22874c() { // from class: i8.q0
                public /* synthetic */ C20414q0() {
                }

                @Override // p342m6.InterfaceC22874c
                /* renamed from: a */
                public final Object mo27439a(AbstractC22888j abstractC22888j) {
                    Object m106406j;
                    m106406j = AbstractC20418s0.m106406j(C22890k.this, abstractC22888j);
                    return m106406j;
                }
            });
        } catch (Exception e11) {
            c22890k.m117595b(e11);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ Void m106408l(C22890k c22890k, AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            c22890k.m117598e(abstractC22888j.mo117584m());
            return null;
        }
        if (abstractC22888j.mo117583l() != null) {
            c22890k.m117597d(abstractC22888j.mo117583l());
            return null;
        }
        return null;
    }

    /* renamed from: m */
    public static /* synthetic */ Void m106409m(C22890k c22890k, AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            c22890k.m117598e(abstractC22888j.mo117584m());
            return null;
        }
        if (abstractC22888j.mo117583l() != null) {
            c22890k.m117597d(abstractC22888j.mo117583l());
            return null;
        }
        return null;
    }

    /* renamed from: n */
    public static AbstractC22888j m106410n(Executor executor, AbstractC22888j abstractC22888j, AbstractC22888j abstractC22888j2) {
        C22890k c22890k = new C22890k();
        C20410o0 c20410o0 = new InterfaceC22874c() { // from class: i8.o0
            public /* synthetic */ C20410o0() {
            }

            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j3) {
                Void m106409m;
                m106409m = AbstractC20418s0.m106409m(C22890k.this, abstractC22888j3);
                return m106409m;
            }
        };
        abstractC22888j.mo117579h(executor, c20410o0);
        abstractC22888j2.mo117579h(executor, c20410o0);
        return c22890k.m117594a();
    }

    /* renamed from: o */
    public static AbstractC22888j m106411o(AbstractC22888j abstractC22888j, AbstractC22888j abstractC22888j2) {
        C22890k c22890k = new C22890k();
        C20416r0 c20416r0 = new InterfaceC22874c() { // from class: i8.r0
            public /* synthetic */ C20416r0() {
            }

            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j3) {
                Void m106408l;
                m106408l = AbstractC20418s0.m106408l(C22890k.this, abstractC22888j3);
                return m106408l;
            }
        };
        abstractC22888j.mo117580i(c20416r0);
        abstractC22888j2.mo117580i(c20416r0);
        return c22890k.m117594a();
    }
}
