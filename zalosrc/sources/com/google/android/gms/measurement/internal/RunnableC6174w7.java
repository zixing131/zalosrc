package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import java.util.ArrayList;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes2.dex */
public final class RunnableC6174w7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f34559p;

    /* renamed from: q */
    final /* synthetic */ String f34560q;

    /* renamed from: r */
    final /* synthetic */ zzq f34561r;

    /* renamed from: s */
    final /* synthetic */ InterfaceC5434j1 f34562s;

    /* renamed from: t */
    final /* synthetic */ C5977e8 f34563t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6174w7(C5977e8 c5977e8, String str, String str2, zzq zzqVar, InterfaceC5434j1 interfaceC5434j1) {
        this.f34563t = c5977e8;
        this.f34559p = str;
        this.f34560q = str2;
        this.f34561r = zzqVar;
        this.f34562s = interfaceC5434j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6127s4 c6127s4;
        InterfaceC20314f interfaceC20314f;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C5977e8 c5977e8 = this.f34563t;
                interfaceC20314f = c5977e8.f33980d;
                if (interfaceC20314f == null) {
                    c5977e8.f34158a.mo31033c().m31197q().m31110c("Failed to get conditional properties; not connected to service", this.f34559p, this.f34560q);
                    c6127s4 = this.f34563t.f34158a;
                } else {
                    AbstractC4205o.m19722k(this.f34561r);
                    arrayList = C6121r9.m31313u(interfaceC20314f.mo30897M3(this.f34559p, this.f34560q, this.f34561r));
                    this.f34563t.m30860E();
                    c6127s4 = this.f34563t.f34158a;
                }
            } catch (RemoteException e11) {
                this.f34563t.f34158a.mo31033c().m31197q().m31111d("Failed to get conditional properties; remote exception", this.f34559p, this.f34560q, e11);
                c6127s4 = this.f34563t.f34158a;
            }
            c6127s4.m31381N().m31320F(this.f34562s, arrayList);
        } catch (Throwable th2) {
            this.f34563t.f34158a.m31381N().m31320F(this.f34562s, arrayList);
            throw th2;
        }
    }
}
