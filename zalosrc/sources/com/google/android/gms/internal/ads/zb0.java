package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* loaded from: classes2.dex */
final class zb0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ mb0 f31430a;

    /* renamed from: b */
    final /* synthetic */ ba0 f31431b;

    /* renamed from: c */
    final /* synthetic */ ac0 f31432c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zb0(ac0 ac0Var, mb0 mb0Var, ba0 ba0Var) {
        this.f31432c = ac0Var;
        this.f31430a = mb0Var;
        this.f31431b = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.f31430a.zzf(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                this.f31432c.f16991r = mediationRewardedAd;
                this.f31430a.zzg();
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
            }
            return new bc0(this.f31431b);
        }
        yk0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f31430a.mo23581c("Adapter returned null.");
            return null;
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
