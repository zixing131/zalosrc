package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes.dex */
public final class C6083o4 extends FutureTask implements Comparable {

    /* renamed from: p */
    private final long f34266p;

    /* renamed from: q */
    final boolean f34267q;

    /* renamed from: r */
    private final String f34268r;

    /* renamed from: s */
    final /* synthetic */ C6105q4 f34269s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6083o4(C6105q4 c6105q4, Runnable runnable, boolean z11, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f34269s = c6105q4;
        AbstractC4205o.m19722k(str);
        atomicLong = C6105q4.f34357l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f34266p = andIncrement;
        this.f34268r = str;
        this.f34267q = z11;
        if (andIncrement == Long.MAX_VALUE) {
            c6105q4.f34158a.mo31033c().m31197q().m31108a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C6083o4 c6083o4 = (C6083o4) obj;
        boolean z11 = this.f34267q;
        if (z11 != c6083o4.f34267q) {
            if (z11) {
                return -1;
            }
        } else {
            long j11 = this.f34266p;
            long j12 = c6083o4.f34266p;
            if (j11 < j12) {
                return -1;
            }
            if (j11 <= j12) {
                this.f34269s.f34158a.mo31033c().m31199s().m31109b("Two tasks share the same index. index", Long.valueOf(this.f34266p));
                return 0;
            }
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        this.f34269s.f34158a.mo31033c().m31197q().m31109b(this.f34268r, th2);
        super.setException(th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6083o4(C6105q4 c6105q4, Callable callable, boolean z11, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f34269s = c6105q4;
        AbstractC4205o.m19722k("Task exception on worker thread");
        atomicLong = C6105q4.f34357l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f34266p = andIncrement;
        this.f34268r = "Task exception on worker thread";
        this.f34267q = z11;
        if (andIncrement == Long.MAX_VALUE) {
            c6105q4.f34158a.mo31033c().m31197q().m31108a("Tasks index overflow");
        }
    }
}
