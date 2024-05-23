package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import java.util.List;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* loaded from: classes2.dex */
public final class RunnableC5987f7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f33996p;

    /* renamed from: q */
    final /* synthetic */ String f33997q;

    /* renamed from: r */
    final /* synthetic */ zzq f33998r;

    /* renamed from: s */
    final /* synthetic */ boolean f33999s;

    /* renamed from: t */
    final /* synthetic */ InterfaceC5434j1 f34000t;

    /* renamed from: u */
    final /* synthetic */ C5977e8 f34001u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5987f7(C5977e8 c5977e8, String str, String str2, zzq zzqVar, boolean z11, InterfaceC5434j1 interfaceC5434j1) {
        this.f34001u = c5977e8;
        this.f33996p = str;
        this.f33997q = str2;
        this.f33998r = zzqVar;
        this.f33999s = z11;
        this.f34000t = interfaceC5434j1;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:156), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e11;
        Bundle bundle2;
        InterfaceC20314f interfaceC20314f;
        Bundle bundle3 = new Bundle();
        try {
            try {
                C5977e8 c5977e8 = this.f34001u;
                interfaceC20314f = c5977e8.f33980d;
                if (interfaceC20314f == null) {
                    c5977e8.f34158a.mo31033c().m31197q().m31110c("Failed to get user properties; not connected to service", this.f33996p, this.f33997q);
                    this.f34001u.f34158a.m31381N().m31321G(this.f34000t, bundle3);
                    return;
                }
                AbstractC4205o.m19722k(this.f33998r);
                List<zzli> mo30898N1 = interfaceC20314f.mo30898N1(this.f33996p, this.f33997q, this.f33999s, this.f33998r);
                bundle = new Bundle();
                if (mo30898N1 != null) {
                    for (zzli zzliVar : mo30898N1) {
                        String str = zzliVar.f34684t;
                        if (str != null) {
                            bundle.putString(zzliVar.f34681q, str);
                        } else {
                            Long l11 = zzliVar.f34683s;
                            if (l11 != null) {
                                bundle.putLong(zzliVar.f34681q, l11.longValue());
                            } else {
                                Double d11 = zzliVar.f34686v;
                                if (d11 != null) {
                                    bundle.putDouble(zzliVar.f34681q, d11.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f34001u.m30860E();
                    this.f34001u.f34158a.m31381N().m31321G(this.f34000t, bundle);
                } catch (RemoteException e12) {
                    e11 = e12;
                    this.f34001u.f34158a.mo31033c().m31197q().m31110c("Failed to get user properties; remote exception", this.f33996p, e11);
                    this.f34001u.f34158a.m31381N().m31321G(this.f34000t, bundle);
                }
            } catch (RemoteException e13) {
                bundle = bundle3;
                e11 = e13;
            } catch (Throwable th2) {
                th = th2;
                this.f34001u.f34158a.m31381N().m31321G(this.f34000t, bundle3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bundle3 = bundle2;
            this.f34001u.f34158a.m31381N().m31321G(this.f34000t, bundle3);
            throw th;
        }
    }
}
