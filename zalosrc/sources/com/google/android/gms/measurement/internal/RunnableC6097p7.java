package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* loaded from: classes2.dex */
public final class RunnableC6097p7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzaw f34331p;

    /* renamed from: q */
    final /* synthetic */ String f34332q;

    /* renamed from: r */
    final /* synthetic */ InterfaceC5434j1 f34333r;

    /* renamed from: s */
    final /* synthetic */ C5977e8 f34334s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6097p7(C5977e8 c5977e8, zzaw zzawVar, String str, InterfaceC5434j1 interfaceC5434j1) {
        this.f34334s = c5977e8;
        this.f34331p = zzawVar;
        this.f34332q = str;
        this.f34333r = interfaceC5434j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6127s4 c6127s4;
        InterfaceC20314f interfaceC20314f;
        byte[] bArr = null;
        try {
            try {
                C5977e8 c5977e8 = this.f34334s;
                interfaceC20314f = c5977e8.f33980d;
                if (interfaceC20314f == null) {
                    c5977e8.f34158a.mo31033c().m31197q().m31108a("Discarding data. Failed to send event to service to bundle");
                    c6127s4 = this.f34334s.f34158a;
                } else {
                    bArr = interfaceC20314f.mo30899U2(this.f34331p, this.f34332q);
                    this.f34334s.m30860E();
                    c6127s4 = this.f34334s.f34158a;
                }
            } catch (RemoteException e11) {
                this.f34334s.f34158a.mo31033c().m31197q().m31109b("Failed to send event to the service to bundle", e11);
                c6127s4 = this.f34334s.f34158a;
            }
            c6127s4.m31381N().m31322H(this.f34333r, bArr);
        } catch (Throwable th2) {
            this.f34334s.f34158a.m31381N().m31322H(this.f34333r, bArr);
            throw th2;
        }
    }
}
