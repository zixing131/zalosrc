package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.g1 */
/* loaded from: classes2.dex */
public final class C4183g1 extends AbstractC4215r0 {

    /* renamed from: g */
    final /* synthetic */ AbstractC4172d f16617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4183g1(AbstractC4172d abstractC4172d, int i11, Bundle bundle) {
        super(abstractC4172d, i11, null);
        this.f16617g = abstractC4172d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4215r0
    /* renamed from: f */
    protected final void mo19675f(ConnectionResult connectionResult) {
        if (this.f16617g.enableLocalFallback() && AbstractC4172d.zzo(this.f16617g)) {
            AbstractC4172d.zzk(this.f16617g, 16);
        } else {
            this.f16617g.zzc.mo19548a(connectionResult);
            this.f16617g.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4215r0
    /* renamed from: g */
    protected final boolean mo19676g() {
        this.f16617g.zzc.mo19548a(ConnectionResult.f16136t);
        return true;
    }
}
