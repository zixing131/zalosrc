package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* loaded from: classes2.dex */
public final class RunnableC5941b7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ long f33793p;

    /* renamed from: q */
    final /* synthetic */ C5976e7 f33794q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5941b7(C5976e7 c5976e7, long j11) {
        this.f33794q = c5976e7;
        this.f33793p = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33794q.f34158a.m31400y().m31483m(this.f33793p);
        this.f33794q.f33971e = null;
    }
}
