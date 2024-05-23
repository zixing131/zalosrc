package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* loaded from: classes2.dex */
final class RunnableC5974e5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzaw f33961p;

    /* renamed from: q */
    final /* synthetic */ String f33962q;

    /* renamed from: r */
    final /* synthetic */ BinderC6040k5 f33963r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5974e5(BinderC6040k5 binderC6040k5, zzaw zzawVar, String str) {
        this.f33963r = binderC6040k5;
        this.f33961p = zzawVar;
        this.f33962q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f33963r.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f33963r.f34135p;
        c6055l92.m31090j(this.f33961p, this.f33962q);
    }
}
