package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
/* loaded from: classes2.dex */
public final class RunnableC6098p8 implements Runnable {

    /* renamed from: p */
    final long f34335p;

    /* renamed from: q */
    final long f34336q;

    /* renamed from: r */
    final /* synthetic */ C6109q8 f34337r;

    public RunnableC6098p8(C6109q8 c6109q8, long j11, long j12) {
        this.f34337r = c6109q8;
        this.f34335p = j11;
        this.f34336q = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34337r.f34384b.f34158a.mo31037v().m31296z(new Runnable() { // from class: com.google.android.gms.measurement.internal.o8
            public /* synthetic */ RunnableC6087o8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC6098p8 runnableC6098p8 = RunnableC6098p8.this;
                C6109q8 c6109q8 = runnableC6098p8.f34337r;
                long j11 = runnableC6098p8.f34335p;
                long j12 = runnableC6098p8.f34336q;
                c6109q8.f34384b.mo31036g();
                c6109q8.f34384b.f34158a.mo31033c().m31196p().m31108a("Application going to the background");
                c6109q8.f34384b.f34158a.m31374F().f33822r.m31484a(true);
                Bundle bundle = new Bundle();
                if (!c6109q8.f34384b.f34158a.m31401z().m30915D()) {
                    c6109q8.f34384b.f34521e.m31447b(j12);
                    c6109q8.f34384b.f34521e.m31449d(false, false, j12);
                }
                c6109q8.f34384b.f34158a.m31376I().m31441u("auto", "_ab", j11, bundle);
            }
        });
    }
}
