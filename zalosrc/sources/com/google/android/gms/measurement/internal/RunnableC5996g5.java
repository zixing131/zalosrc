package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
/* loaded from: classes.dex */
final class RunnableC5996g5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzli f34030p;

    /* renamed from: q */
    final /* synthetic */ zzq f34031q;

    /* renamed from: r */
    final /* synthetic */ BinderC6040k5 f34032r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5996g5(BinderC6040k5 binderC6040k5, zzli zzliVar, zzq zzqVar) {
        this.f34032r = binderC6040k5;
        this.f34030p = zzliVar;
        this.f34031q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        C6055l9 c6055l93;
        c6055l9 = this.f34032r.f34135p;
        c6055l9.m31080d();
        if (this.f34030p.m31514t() == null) {
            c6055l93 = this.f34032r.f34135p;
            c6055l93.m31102t(this.f34030p.f34681q, this.f34031q);
        } else {
            c6055l92 = this.f34032r.f34135p;
            c6055l92.m31065B(this.f34030p, this.f34031q);
        }
    }
}
