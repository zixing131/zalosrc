package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdb;

/* loaded from: classes2.dex */
final class wp2 extends rz2 {

    /* renamed from: p */
    final /* synthetic */ zzdb f30061p;

    /* renamed from: q */
    final /* synthetic */ zp2 f30062q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wp2(zp2 zp2Var, zzdb zzdbVar) {
        this.f30062q = zp2Var;
        this.f30061p = zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.rz2
    /* renamed from: j */
    public final void mo21779j() {
        np1 np1Var;
        np1Var = this.f30062q.f31672v;
        if (np1Var != null) {
            try {
                this.f30061p.zze();
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
    }
}
