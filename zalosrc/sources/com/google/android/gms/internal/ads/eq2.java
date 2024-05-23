package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class eq2 extends rz2 {

    /* renamed from: p */
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbw f19753p;

    /* renamed from: q */
    final /* synthetic */ fq2 f19754q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eq2(fq2 fq2Var, com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        this.f19754q = fq2Var;
        this.f19753p = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.rz2
    /* renamed from: j */
    public final void mo21779j() {
        np1 np1Var;
        np1Var = this.f19754q.f20250s;
        if (np1Var != null) {
            try {
                this.f19753p.zze();
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
    }
}
