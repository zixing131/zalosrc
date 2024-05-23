package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n7 */
/* loaded from: classes.dex */
public final class RunnableC6075n7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34241p;

    /* renamed from: q */
    final /* synthetic */ Bundle f34242q;

    /* renamed from: r */
    final /* synthetic */ C5977e8 f34243r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6075n7(C5977e8 c5977e8, zzq zzqVar, Bundle bundle) {
        this.f34243r = c5977e8;
        this.f34241p = zzqVar;
        this.f34242q = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        C5977e8 c5977e8 = this.f34243r;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC4205o.m19722k(this.f34241p);
            interfaceC20314f.mo30895I2(this.f34242q, this.f34241p);
        } catch (RemoteException e11) {
            this.f34243r.f34158a.mo31033c().m31197q().m31109b("Failed to send default event parameters to service", e11);
        }
    }
}
