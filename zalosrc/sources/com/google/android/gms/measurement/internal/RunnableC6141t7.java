package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* loaded from: classes.dex */
public final class RunnableC6141t7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34493p;

    /* renamed from: q */
    final /* synthetic */ boolean f34494q;

    /* renamed from: r */
    final /* synthetic */ zzaw f34495r;

    /* renamed from: s */
    final /* synthetic */ String f34496s;

    /* renamed from: t */
    final /* synthetic */ C5977e8 f34497t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6141t7(C5977e8 c5977e8, boolean z11, zzq zzqVar, boolean z12, zzaw zzawVar, String str) {
        this.f34497t = c5977e8;
        this.f34493p = zzqVar;
        this.f34494q = z12;
        this.f34495r = zzawVar;
        this.f34496s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        zzaw zzawVar;
        C5977e8 c5977e8 = this.f34497t;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Discarding data. Failed to send event to service");
            return;
        }
        AbstractC4205o.m19722k(this.f34493p);
        C5977e8 c5977e82 = this.f34497t;
        if (this.f34494q) {
            zzawVar = null;
        } else {
            zzawVar = this.f34495r;
        }
        c5977e82.m30884q(interfaceC20314f, zzawVar, this.f34493p);
        this.f34497t.m30860E();
    }
}
