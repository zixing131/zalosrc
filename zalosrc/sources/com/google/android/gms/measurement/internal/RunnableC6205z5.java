package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* loaded from: classes2.dex */
public final class RunnableC6205z5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ long f34650p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34651q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6205z5(C6129s6 c6129s6, long j11) {
        this.f34651q = c6129s6;
        this.f34650p = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34651q.m31445z(this.f34650p, true);
        this.f34651q.f34158a.m31379L().m30876S(new AtomicReference());
    }
}
