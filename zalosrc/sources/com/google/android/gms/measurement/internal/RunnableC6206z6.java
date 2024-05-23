package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* loaded from: classes.dex */
public final class RunnableC6206z6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C6184x6 f34652p;

    /* renamed from: q */
    final /* synthetic */ C6184x6 f34653q;

    /* renamed from: r */
    final /* synthetic */ long f34654r;

    /* renamed from: s */
    final /* synthetic */ boolean f34655s;

    /* renamed from: t */
    final /* synthetic */ C5976e7 f34656t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6206z6(C5976e7 c5976e7, C6184x6 c6184x6, C6184x6 c6184x62, long j11, boolean z11) {
        this.f34656t = c5976e7;
        this.f34652p = c6184x6;
        this.f34653q = c6184x62;
        this.f34654r = j11;
        this.f34655s = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34656t.m30840n(this.f34652p, this.f34653q, this.f34654r, this.f34655s, null);
    }
}
