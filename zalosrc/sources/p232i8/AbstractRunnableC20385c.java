package p232i8;

import android.os.Process;

/* renamed from: i8.c */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC20385c implements Runnable {
    /* renamed from: a */
    protected abstract void mo106177a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo106177a();
    }
}
