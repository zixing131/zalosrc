package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.atomic.AtomicReference;
import p230i6.EnumC20305a;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* loaded from: classes.dex */
public final class RunnableC6031j7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f34109p;

    /* renamed from: q */
    final /* synthetic */ zzq f34110q;

    /* renamed from: r */
    final /* synthetic */ C5977e8 f34111r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6031j7(C5977e8 c5977e8, AtomicReference atomicReference, zzq zzqVar) {
        this.f34111r = c5977e8;
        this.f34109p = atomicReference;
        this.f34110q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC20314f interfaceC20314f;
        synchronized (this.f34109p) {
            try {
                try {
                } catch (RemoteException e11) {
                    this.f34111r.f34158a.mo31033c().m31197q().m31109b("Failed to get app instance id", e11);
                    atomicReference = this.f34109p;
                }
                if (!this.f34111r.f34158a.m31374F().m30819p().m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                    this.f34111r.f34158a.mo31033c().m31203x().m31108a("Analytics storage consent denied; will not get app instance id");
                    this.f34111r.f34158a.m31376I().m31410C(null);
                    this.f34111r.f34158a.m31374F().f33811g.m30804b(null);
                    this.f34109p.set(null);
                    return;
                }
                C5977e8 c5977e8 = this.f34111r;
                interfaceC20314f = c5977e8.f33980d;
                if (interfaceC20314f == null) {
                    c5977e8.f34158a.mo31033c().m31197q().m31108a("Failed to get app instance id");
                    return;
                }
                AbstractC4205o.m19722k(this.f34110q);
                this.f34109p.set(interfaceC20314f.mo30902a3(this.f34110q));
                String str = (String) this.f34109p.get();
                if (str != null) {
                    this.f34111r.f34158a.m31376I().m31410C(str);
                    this.f34111r.f34158a.m31374F().f33811g.m30804b(str);
                }
                this.f34111r.m30860E();
                atomicReference = this.f34109p;
                atomicReference.notify();
            } finally {
                this.f34109p.notify();
            }
        }
    }
}
