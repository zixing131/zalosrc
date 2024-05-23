package ro0;

import bp0.AbstractC3082b0;
import java.util.concurrent.Semaphore;

/* renamed from: ro0.j */
/* loaded from: classes7.dex */
public abstract class AbstractRunnableC25946j implements Runnable {

    /* renamed from: p */
    private final Semaphore f123726p = new Semaphore(0);

    /* renamed from: q */
    private Object f123727q;

    /* renamed from: b */
    private void m133680b(Object obj) {
        this.f123727q = obj;
    }

    /* renamed from: a */
    protected abstract Object mo133681a();

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                m133680b(mo133681a());
            } catch (Throwable unused) {
                AbstractC3082b0.m15422d("ReturnRunnable", "Not done from same thread");
            }
        } finally {
            this.f123726p.release();
        }
    }
}
