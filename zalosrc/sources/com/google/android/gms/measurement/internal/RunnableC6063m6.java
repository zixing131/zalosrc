package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes2.dex */
public final class RunnableC6063m6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ Boolean f34217p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f34218q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6063m6(C6129s6 c6129s6, Boolean bool) {
        this.f34218q = c6129s6;
        this.f34217p = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34218q.m31402O(this.f34217p, true);
    }
}
