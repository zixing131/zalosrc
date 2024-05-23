package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* loaded from: classes2.dex */
public final class RunnableC6130s7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34470p;

    /* renamed from: q */
    final /* synthetic */ C5977e8 f34471q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6130s7(C5977e8 c5977e8, zzq zzqVar) {
        this.f34471q = c5977e8;
        this.f34470p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        C5977e8 c5977e8 = this.f34471q;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC4205o.m19722k(this.f34470p);
            interfaceC20314f.mo30894H1(this.f34470p);
            this.f34471q.m30860E();
        } catch (RemoteException e11) {
            this.f34471q.f34158a.mo31033c().m31197q().m31109b("Failed to send consent settings to the service", e11);
        }
    }
}
