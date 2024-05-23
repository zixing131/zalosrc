package p234ia;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ia.n */
/* loaded from: classes3.dex */
public class C20471n {

    /* renamed from: b */
    private boolean f100703b;

    /* renamed from: a */
    private final Object f100702a = new Object();

    /* renamed from: c */
    private final Queue f100704c = new ArrayDeque();

    /* renamed from: d */
    private final AtomicReference f100705d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m106519d() {
        synchronized (this.f100702a) {
            try {
                if (this.f100704c.isEmpty()) {
                    this.f100703b = false;
                } else {
                    C20463h0 c20463h0 = (C20463h0) this.f100704c.remove();
                    m106520e(c20463h0.f100665a, c20463h0.f100666b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    private final void m106520e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: ia.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C20471n c20471n = C20471n.this;
                    Runnable runnable2 = runnable;
                    C20467j0 c20467j0 = new C20467j0(c20471n, null);
                    try {
                        runnable2.run();
                        c20467j0.close();
                    } catch (Throwable th2) {
                        try {
                            c20467j0.close();
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            m106519d();
        }
    }

    /* renamed from: a */
    public void m106521a(Executor executor, Runnable runnable) {
        synchronized (this.f100702a) {
            try {
                if (this.f100703b) {
                    this.f100704c.add(new C20463h0(executor, runnable, null));
                } else {
                    this.f100703b = true;
                    m106520e(executor, runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
