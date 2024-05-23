package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.d1 */
/* loaded from: classes2.dex */
public final class BinderC4174d1 extends AbstractBinderC4218s0 {

    /* renamed from: p */
    private AbstractC4172d f16577p;

    /* renamed from: q */
    private final int f16578q;

    public BinderC4174d1(AbstractC4172d abstractC4172d, int i11) {
        this.f16577p = abstractC4172d;
        this.f16578q = i11;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4190j
    /* renamed from: I */
    public final void mo19644I(int i11, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4190j
    /* renamed from: Y3 */
    public final void mo19645Y3(int i11, IBinder iBinder, zzj zzjVar) {
        AbstractC4172d abstractC4172d = this.f16577p;
        AbstractC4205o.m19723l(abstractC4172d, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC4205o.m19722k(zzjVar);
        AbstractC4172d.zzj(abstractC4172d, zzjVar);
        mo19646j1(i11, iBinder, zzjVar.f16693p);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4190j
    /* renamed from: j1 */
    public final void mo19646j1(int i11, IBinder iBinder, Bundle bundle) {
        AbstractC4205o.m19723l(this.f16577p, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f16577p.onPostInitHandler(i11, iBinder, bundle, this.f16578q);
        this.f16577p = null;
    }
}
