package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* loaded from: classes.dex */
public final class RunnableC6064m7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C6184x6 f34219p;

    /* renamed from: q */
    final /* synthetic */ C5977e8 f34220q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6064m7(C5977e8 c5977e8, C6184x6 c6184x6) {
        this.f34220q = c5977e8;
        this.f34219p = c6184x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20314f interfaceC20314f;
        C5977e8 c5977e8 = this.f34220q;
        interfaceC20314f = c5977e8.f33980d;
        if (interfaceC20314f == null) {
            c5977e8.f34158a.mo31033c().m31197q().m31108a("Failed to send current screen to service");
            return;
        }
        try {
            C6184x6 c6184x6 = this.f34219p;
            if (c6184x6 == null) {
                interfaceC20314f.mo30906l1(0L, null, null, c5977e8.f34158a.mo31032b().getPackageName());
            } else {
                interfaceC20314f.mo30906l1(c6184x6.f34591c, c6184x6.f34589a, c6184x6.f34590b, c5977e8.f34158a.mo31032b().getPackageName());
            }
            this.f34220q.m30860E();
        } catch (RemoteException e11) {
            this.f34220q.f34158a.mo31033c().m31197q().m31109b("Failed to send current screen to the service", e11);
        }
    }
}
