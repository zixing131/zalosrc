package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v */
/* loaded from: classes2.dex */
public final class RunnableC6155v implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f34525p;

    /* renamed from: q */
    final /* synthetic */ long f34526q;

    /* renamed from: r */
    final /* synthetic */ C6179x1 f34527r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6155v(C6179x1 c6179x1, String str, long j11) {
        this.f34527r = c6179x1;
        this.f34525p = str;
        this.f34526q = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6179x1.m31476i(this.f34527r, this.f34525p, this.f34526q);
    }
}
