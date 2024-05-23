package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* loaded from: classes.dex */
public final class RunnableC5955c9 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C6066m9 f33839p;

    /* renamed from: q */
    final /* synthetic */ C6055l9 f33840q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5955c9(C6055l9 c6055l9, C6066m9 c6066m9) {
        this.f33840q = c6055l9;
        this.f33839p = c6066m9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9.m31063k0(this.f33840q, this.f33839p);
        this.f33840q.m31105x();
    }
}
