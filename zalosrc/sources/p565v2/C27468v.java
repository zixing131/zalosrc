package p565v2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p595w2.InterfaceExecutorC28694a;

/* renamed from: v2.v */
/* loaded from: classes.dex */
public class C27468v implements InterfaceExecutorC28694a {

    /* renamed from: q */
    private final Executor f129202q;

    /* renamed from: r */
    private Runnable f129203r;

    /* renamed from: p */
    private final ArrayDeque f129201p = new ArrayDeque();

    /* renamed from: s */
    final Object f129204s = new Object();

    /* renamed from: v2.v$a */
    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: p */
        final C27468v f129205p;

        /* renamed from: q */
        final Runnable f129206q;

        a(C27468v c27468v, Runnable runnable) {
            this.f129205p = c27468v;
            this.f129206q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f129206q.run();
                synchronized (this.f129205p.f129204s) {
                    this.f129205p.m140523a();
                }
            } catch (Throwable th2) {
                synchronized (this.f129205p.f129204s) {
                    this.f129205p.m140523a();
                    throw th2;
                }
            }
        }
    }

    public C27468v(Executor executor) {
        this.f129202q = executor;
    }

    /* renamed from: a */
    void m140523a() {
        Runnable runnable = (Runnable) this.f129201p.poll();
        this.f129203r = runnable;
        if (runnable != null) {
            this.f129202q.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f129204s) {
            try {
                this.f129201p.add(new a(this, runnable));
                if (this.f129203r == null) {
                    m140523a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p595w2.InterfaceExecutorC28694a
    /* renamed from: o0 */
    public boolean mo140524o0() {
        boolean z11;
        synchronized (this.f129204s) {
            z11 = !this.f129201p.isEmpty();
        }
        return z11;
    }
}
