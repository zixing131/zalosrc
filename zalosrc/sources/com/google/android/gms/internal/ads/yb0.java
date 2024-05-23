package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* loaded from: classes2.dex */
final class yb0 implements SignalCallbacks {

    /* renamed from: a */
    final /* synthetic */ sb0 f30875a;

    public yb0(ac0 ac0Var, sb0 sb0Var) {
        this.f30875a = sb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.f30875a.mo24500W(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.f30875a.mo24501c(str);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.f30875a.mo24502j(str);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }
}
