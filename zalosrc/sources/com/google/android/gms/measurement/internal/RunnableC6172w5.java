package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* loaded from: classes2.dex */
final class RunnableC6172w5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ long f34557p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34558q;

    public RunnableC6172w5(C6129s6 c6129s6, long j11) {
        this.f34558q = c6129s6;
        this.f34557p = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34558q.f34158a.m31374F().f33815k.m31503b(this.f34557p);
        this.f34558q.f34158a.mo31033c().m31196p().m31109b("Session timeout duration set", Long.valueOf(this.f34557p));
    }
}
