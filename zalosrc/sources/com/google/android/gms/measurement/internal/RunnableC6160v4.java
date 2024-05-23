package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* loaded from: classes2.dex */
final class RunnableC6160v4 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzac f34533p;

    /* renamed from: q */
    final /* synthetic */ BinderC6040k5 f34534q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6160v4(BinderC6040k5 binderC6040k5, zzac zzacVar) {
        this.f34534q = binderC6040k5;
        this.f34533p = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        C6055l9 c6055l93;
        c6055l9 = this.f34534q.f34135p;
        c6055l9.m31080d();
        if (this.f34533p.f34666r.m31514t() == null) {
            c6055l93 = this.f34534q.f34135p;
            c6055l93.m31100r(this.f34533p);
        } else {
            c6055l92 = this.f34534q.f34135p;
            c6055l92.m31106y(this.f34533p);
        }
    }
}
