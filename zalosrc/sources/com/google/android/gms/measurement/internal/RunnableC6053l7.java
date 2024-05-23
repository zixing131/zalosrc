package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* loaded from: classes.dex */
public final class RunnableC6053l7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34161p;

    /* renamed from: q */
    final /* synthetic */ C5977e8 f34162q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6053l7(C5977e8 c5977e8, zzq zzqVar) {
        this.f34162q = c5977e8;
        this.f34161p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        C5977e8 c5977e8 = this.f34162q;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC4205o.m19722k(this.f34161p);
            interfaceC20314f.mo30904f1(this.f34161p);
            this.f34162q.f34158a.m31371C().m30956s();
            this.f34162q.m30884q(interfaceC20314f, null, this.f34161p);
            this.f34162q.m30860E();
        } catch (RemoteException e11) {
            this.f34162q.f34158a.mo31033c().m31197q().m31109b("Failed to send app launch to the service", e11);
        }
    }
}
