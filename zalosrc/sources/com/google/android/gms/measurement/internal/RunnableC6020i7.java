package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* loaded from: classes2.dex */
public final class RunnableC6020i7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34087p;

    /* renamed from: q */
    final /* synthetic */ C5977e8 f34088q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6020i7(C5977e8 c5977e8, zzq zzqVar) {
        this.f34088q = c5977e8;
        this.f34087p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        C5977e8 c5977e8 = this.f34088q;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            AbstractC4205o.m19722k(this.f34087p);
            interfaceC20314f.mo30901Y1(this.f34087p);
        } catch (RemoteException e11) {
            this.f34088q.f34158a.mo31033c().m31197q().m31109b("Failed to reset data on the service: remote exception", e11);
        }
        this.f34088q.m30860E();
    }
}
