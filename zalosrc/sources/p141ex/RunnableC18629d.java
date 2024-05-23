package p141ex;

import android.os.SystemClock;
import me0.AbstractC23122k6;

/* renamed from: ex.d */
/* loaded from: classes4.dex */
public class RunnableC18629d implements Runnable {

    /* renamed from: p */
    private Runnable f93732p;

    /* renamed from: q */
    private long f93733q = SystemClock.elapsedRealtime();

    /* renamed from: r */
    private String f93734r;

    public RunnableC18629d(Runnable runnable, String str) {
        this.f93732p = (Runnable) AbstractC23122k6.m118609a(runnable);
        this.f93734r = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - this.f93733q;
        this.f93732p.run();
        AbstractC18630e.m98439b(-1, Thread.currentThread().getName(), j11, SystemClock.elapsedRealtime() - elapsedRealtime, this.f93734r, false, "-");
    }
}
