package p315l5;

import android.os.Process;

/* renamed from: l5.c */
/* loaded from: classes2.dex */
final class C22075c extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C22075c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
