package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class xc3 extends ec3 implements ScheduledFuture, tc3 {

    /* renamed from: q */
    private final ScheduledFuture f30424q;

    public xc3(tc3 tc3Var, ScheduledFuture scheduledFuture) {
        super(tc3Var);
        this.f30424q = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean cancel = mo20860d().cancel(z11);
        if (cancel) {
            this.f30424q.cancel(z11);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f30424q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f30424q.getDelay(timeUnit);
    }
}
