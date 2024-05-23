package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* loaded from: classes2.dex */
public final class RunnableC5953c7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C6184x6 f33835p;

    /* renamed from: q */
    final /* synthetic */ long f33836q;

    /* renamed from: r */
    final /* synthetic */ C5976e7 f33837r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5953c7(C5976e7 c5976e7, C6184x6 c6184x6, long j11) {
        this.f33837r = c5976e7;
        this.f33835p = c6184x6;
        this.f33836q = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33837r.m30841o(this.f33835p, false, this.f33836q);
        C5976e7 c5976e7 = this.f33837r;
        c5976e7.f33971e = null;
        c5976e7.f34158a.m31379L().m30887t(null);
    }
}
