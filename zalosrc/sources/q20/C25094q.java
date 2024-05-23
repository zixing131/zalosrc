package q20;

import android.os.SystemClock;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.locks.ReentrantLock;
import pm0.C24848g0;

/* renamed from: q20.q */
/* loaded from: classes5.dex */
public final class C25094q {

    /* renamed from: c */
    private final ReentrantLock f120553c = new ReentrantLock();

    /* renamed from: a */
    private long f120551a = Calendar.getInstance(TimeZone.getTimeZone("UTC+7")).getTimeInMillis();

    /* renamed from: b */
    private long f120552b = SystemClock.elapsedRealtime();

    /* renamed from: d */
    private boolean f120554d = false;

    /* renamed from: a */
    public final long m130131a() {
        ReentrantLock reentrantLock = this.f120553c;
        reentrantLock.lock();
        try {
            return this.f120551a + (SystemClock.elapsedRealtime() - this.f120552b);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final void m130132b(long j11) {
        ReentrantLock reentrantLock = this.f120553c;
        reentrantLock.lock();
        try {
            boolean z11 = this.f120554d;
            if (z11) {
                if (j11 > this.f120551a) {
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                reentrantLock.unlock();
            }
            if (!z11) {
                this.f120554d = true;
            }
            this.f120551a = j11;
            this.f120552b = SystemClock.elapsedRealtime();
            C24848g0 c24848g02 = C24848g0.f119245a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
