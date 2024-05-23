package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* loaded from: classes.dex */
public final class RunnableC6009h7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34061p;

    /* renamed from: q */
    final /* synthetic */ boolean f34062q;

    /* renamed from: r */
    final /* synthetic */ zzli f34063r;

    /* renamed from: s */
    final /* synthetic */ C5977e8 f34064s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6009h7(C5977e8 c5977e8, zzq zzqVar, boolean z11, zzli zzliVar) {
        this.f34064s = c5977e8;
        this.f34061p = zzqVar;
        this.f34062q = z11;
        this.f34063r = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        zzli zzliVar;
        C5977e8 c5977e8 = this.f34064s;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC4205o.m19722k(this.f34061p);
        C5977e8 c5977e82 = this.f34064s;
        if (this.f34062q) {
            zzliVar = null;
        } else {
            zzliVar = this.f34063r;
        }
        c5977e82.m30884q(interfaceC20314f, zzliVar, this.f34061p);
        this.f34064s.m30860E();
    }
}
