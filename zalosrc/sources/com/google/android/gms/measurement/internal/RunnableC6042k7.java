package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import p230i6.EnumC20305a;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* loaded from: classes2.dex */
public final class RunnableC6042k7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzq f34140p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC5434j1 f34141q;

    /* renamed from: r */
    final /* synthetic */ C5977e8 f34142r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6042k7(C5977e8 c5977e8, zzq zzqVar, InterfaceC5434j1 interfaceC5434j1) {
        this.f34142r = c5977e8;
        this.f34140p = zzqVar;
        this.f34141q = interfaceC5434j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6127s4 c6127s4;
        InterfaceC20314f interfaceC20314f;
        String str = null;
        try {
            try {
                if (!this.f34142r.f34158a.m31374F().m30819p().m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                    this.f34142r.f34158a.mo31033c().m31203x().m31108a("Analytics storage consent denied; will not get app instance id");
                    this.f34142r.f34158a.m31376I().m31410C(null);
                    this.f34142r.f34158a.m31374F().f33811g.m30804b(null);
                    c6127s4 = this.f34142r.f34158a;
                } else {
                    C5977e8 c5977e8 = this.f34142r;
                    interfaceC20314f = c5977e8.f33980d;
                    if (interfaceC20314f == null) {
                        c5977e8.f34158a.mo31033c().m31197q().m31108a("Failed to get app instance id");
                        c6127s4 = this.f34142r.f34158a;
                    } else {
                        AbstractC4205o.m19722k(this.f34140p);
                        str = interfaceC20314f.mo30902a3(this.f34140p);
                        if (str != null) {
                            this.f34142r.f34158a.m31376I().m31410C(str);
                            this.f34142r.f34158a.m31374F().f33811g.m30804b(str);
                        }
                        this.f34142r.m30860E();
                        c6127s4 = this.f34142r.f34158a;
                    }
                }
            } catch (RemoteException e11) {
                this.f34142r.f34158a.mo31033c().m31197q().m31109b("Failed to get app instance id", e11);
                c6127s4 = this.f34142r.f34158a;
            }
            c6127s4.m31381N().m31325K(this.f34141q, str);
        } catch (Throwable th2) {
            this.f34142r.f34158a.m31381N().m31325K(this.f34141q, null);
            throw th2;
        }
    }
}
