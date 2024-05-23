package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.C20307b;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* loaded from: classes2.dex */
final class RunnableC5951c5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f33829p;

    /* renamed from: q */
    final /* synthetic */ BinderC6040k5 f33830q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5951c5(BinderC6040k5 binderC6040k5, zzq zzqVar) {
        this.f33830q = binderC6040k5;
        this.f33829p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f33830q.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f33830q.f34135p;
        zzq zzqVar = this.f33829p;
        c6055l92.mo31037v().mo31036g();
        c6055l92.m31082e();
        AbstractC4205o.m19718g(zzqVar.f34702p);
        C20307b m106004b = C20307b.m106004b(zzqVar.f34697K);
        C20307b m31073V = c6055l92.m31073V(zzqVar.f34702p);
        c6055l92.mo31033c().m31201u().m31110c("Setting consent, package, consent", zzqVar.f34702p, m106004b);
        c6055l92.m31064A(zzqVar.f34702p, m106004b);
        if (m106004b.m106015k(m31073V)) {
            c6055l92.m31103u(zzqVar);
        }
    }
}
