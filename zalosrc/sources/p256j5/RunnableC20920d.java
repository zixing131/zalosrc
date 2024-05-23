package p256j5;

import android.os.Process;

/* renamed from: j5.d */
/* loaded from: classes.dex */
final class RunnableC20920d implements Runnable {

    /* renamed from: p */
    private final Runnable f102782p;

    public RunnableC20920d(Runnable runnable, int i11) {
        this.f102782p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f102782p.run();
    }
}
