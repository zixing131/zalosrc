package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
/* loaded from: classes.dex */
final class RunnableC6018i5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34083p;

    /* renamed from: q */
    final /* synthetic */ BinderC6040k5 f34084q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6018i5(BinderC6040k5 binderC6040k5, zzq zzqVar) {
        this.f34084q = binderC6040k5;
        this.f34083p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f34084q.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f34084q.f34135p;
        c6055l92.m31098p(this.f34083p);
    }
}
