package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;

/* renamed from: com.google.android.gms.common.internal.f1 */
/* loaded from: classes2.dex */
public final class C4180f1 extends AbstractC4215r0 {

    /* renamed from: g */
    public final IBinder f16608g;

    /* renamed from: h */
    final /* synthetic */ AbstractC4172d f16609h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4180f1(AbstractC4172d abstractC4172d, int i11, IBinder iBinder, Bundle bundle) {
        super(abstractC4172d, i11, bundle);
        this.f16609h = abstractC4172d;
        this.f16608g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4215r0
    /* renamed from: f */
    protected final void mo19675f(ConnectionResult connectionResult) {
        if (this.f16609h.zzx != null) {
            this.f16609h.zzx.mo19643Q(connectionResult);
        }
        this.f16609h.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4215r0
    /* renamed from: g */
    protected final boolean mo19676g() {
        AbstractC4172d.a aVar;
        AbstractC4172d.a aVar2;
        try {
            IBinder iBinder = this.f16608g;
            AbstractC4205o.m19722k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f16609h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f16609h.getServiceDescriptor();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("service descriptor mismatch: ");
                sb2.append(serviceDescriptor);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = this.f16609h.createServiceInterface(this.f16608g);
            if (createServiceInterface == null) {
                return false;
            }
            if (!AbstractC4172d.zzn(this.f16609h, 2, 4, createServiceInterface) && !AbstractC4172d.zzn(this.f16609h, 3, 4, createServiceInterface)) {
                return false;
            }
            this.f16609h.zzB = null;
            Bundle connectionHint = this.f16609h.getConnectionHint();
            AbstractC4172d abstractC4172d = this.f16609h;
            aVar = abstractC4172d.zzw;
            if (aVar != null) {
                aVar2 = abstractC4172d.zzw;
                aVar2.mo19635E(connectionHint);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
