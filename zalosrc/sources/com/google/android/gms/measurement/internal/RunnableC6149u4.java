package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* loaded from: classes2.dex */
final class RunnableC6149u4 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzac f34506p;

    /* renamed from: q */
    final /* synthetic */ zzq f34507q;

    /* renamed from: r */
    final /* synthetic */ BinderC6040k5 f34508r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6149u4(BinderC6040k5 binderC6040k5, zzac zzacVar, zzq zzqVar) {
        this.f34508r = binderC6040k5;
        this.f34506p = zzacVar;
        this.f34507q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        C6055l9 c6055l93;
        c6055l9 = this.f34508r.f34135p;
        c6055l9.m31080d();
        if (this.f34506p.f34666r.m31514t() == null) {
            c6055l93 = this.f34508r.f34135p;
            c6055l93.m31101s(this.f34506p, this.f34507q);
        } else {
            c6055l92 = this.f34508r.f34135p;
            c6055l92.m31107z(this.f34506p, this.f34507q);
        }
    }
}
