package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;

/* loaded from: classes2.dex */
final class wb0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ fb0 f29869a;

    /* renamed from: b */
    final /* synthetic */ ba0 f29870b;

    /* renamed from: c */
    final /* synthetic */ ac0 f29871c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wb0(ac0 ac0Var, fb0 fb0Var, ba0 ba0Var) {
        this.f29871c = ac0Var;
        this.f29869a = fb0Var;
        this.f29870b = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.f29869a.zzf(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd != null) {
            try {
                this.f29871c.f16990q = mediationInterstitialAd;
                this.f29869a.zzg();
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
            }
            return new bc0(this.f29870b);
        }
        yk0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f29869a.mo21337c("Adapter returned null.");
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
