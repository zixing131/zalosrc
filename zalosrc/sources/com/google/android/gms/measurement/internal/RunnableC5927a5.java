package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* loaded from: classes2.dex */
final class RunnableC5927a5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f33766p;

    /* renamed from: q */
    final /* synthetic */ BinderC6040k5 f33767q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5927a5(BinderC6040k5 binderC6040k5, zzq zzqVar) {
        this.f33767q = binderC6040k5;
        this.f33766p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f33767q.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f33767q.f34135p;
        c6055l92.m31103u(this.f33766p);
    }
}
