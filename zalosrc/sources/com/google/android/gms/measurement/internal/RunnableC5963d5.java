package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* loaded from: classes.dex */
final class RunnableC5963d5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzaw f33857p;

    /* renamed from: q */
    final /* synthetic */ zzq f33858q;

    /* renamed from: r */
    final /* synthetic */ BinderC6040k5 f33859r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5963d5(BinderC6040k5 binderC6040k5, zzaw zzawVar, zzq zzqVar) {
        this.f33859r = binderC6040k5;
        this.f33857p = zzawVar;
        this.f33858q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33859r.m31023W4(this.f33859r.m31022Q(this.f33857p, this.f33858q), this.f33858q);
    }
}
