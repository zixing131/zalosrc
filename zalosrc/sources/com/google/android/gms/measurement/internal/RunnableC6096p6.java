package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* loaded from: classes2.dex */
final class RunnableC6096p6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ boolean f34329p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34330q;

    public RunnableC6096p6(C6129s6 c6129s6, boolean z11) {
        this.f34330q = c6129s6;
        this.f34329p = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m31394n = this.f34330q.f34158a.m31394n();
        boolean m31393m = this.f34330q.f34158a.m31393m();
        this.f34330q.f34158a.m31390j(this.f34329p);
        if (m31393m == this.f34329p) {
            this.f34330q.f34158a.mo31033c().m31201u().m31109b("Default data collection state already set to", Boolean.valueOf(this.f34329p));
        }
        if (this.f34330q.f34158a.m31394n() == m31394n || this.f34330q.f34158a.m31394n() != this.f34330q.f34158a.m31393m()) {
            this.f34330q.f34158a.mo31033c().m31203x().m31110c("Default data collection is different than actual status", Boolean.valueOf(this.f34329p), Boolean.valueOf(m31394n));
        }
        this.f34330q.m31403P();
    }
}
