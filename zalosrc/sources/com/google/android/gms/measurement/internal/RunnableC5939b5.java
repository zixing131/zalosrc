package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* loaded from: classes2.dex */
final class RunnableC5939b5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f33789p;

    /* renamed from: q */
    final /* synthetic */ BinderC6040k5 f33790q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5939b5(BinderC6040k5 binderC6040k5, zzq zzqVar) {
        this.f33790q = binderC6040k5;
        this.f33789p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f33790q.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f33790q.f34135p;
        zzq zzqVar = this.f33789p;
        c6055l92.mo31037v().mo31036g();
        c6055l92.m31082e();
        AbstractC4205o.m19718g(zzqVar.f34702p);
        c6055l92.m31070S(zzqVar);
    }
}
