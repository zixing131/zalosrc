package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k8 */
/* loaded from: classes.dex */
public final class RunnableC6043k8 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C6055l9 f34143p;

    /* renamed from: q */
    final /* synthetic */ Runnable f34144q;

    public RunnableC6043k8(C6054l8 c6054l8, C6055l9 c6055l9, Runnable runnable) {
        this.f34143p = c6055l9;
        this.f34144q = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34143p.m31080d();
        this.f34143p.m31094l0(this.f34144q);
        this.f34143p.m31066C();
    }
}
