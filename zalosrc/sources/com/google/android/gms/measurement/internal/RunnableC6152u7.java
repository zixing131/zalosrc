package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes2.dex */
public final class RunnableC6152u7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34514p;

    /* renamed from: q */
    final /* synthetic */ boolean f34515q;

    /* renamed from: r */
    final /* synthetic */ zzac f34516r;

    /* renamed from: s */
    final /* synthetic */ zzac f34517s;

    /* renamed from: t */
    final /* synthetic */ C5977e8 f34518t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6152u7(C5977e8 c5977e8, boolean z11, zzq zzqVar, boolean z12, zzac zzacVar, zzac zzacVar2) {
        this.f34518t = c5977e8;
        this.f34514p = zzqVar;
        this.f34515q = z12;
        this.f34516r = zzacVar;
        this.f34517s = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        zzac zzacVar;
        C5977e8 c5977e8 = this.f34518t;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        AbstractC4205o.m19722k(this.f34514p);
        C5977e8 c5977e82 = this.f34518t;
        if (this.f34515q) {
            zzacVar = null;
        } else {
            zzacVar = this.f34516r;
        }
        c5977e82.m30884q(interfaceC20314f, zzacVar, this.f34514p);
        this.f34518t.m30860E();
    }
}
