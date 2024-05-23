package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
final class ub0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ cb0 f28809a;

    /* renamed from: b */
    final /* synthetic */ ba0 f28810b;

    public ub0(ac0 ac0Var, cb0 cb0Var, ba0 ba0Var) {
        this.f28809a = cb0Var;
        this.f28810b = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.f28809a.zzf(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd == null) {
            yk0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f28809a.mo20046c("Adapter returned null.");
                return null;
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
                return null;
            }
        }
        try {
            this.f28809a.mo20045E3(BinderC4273d.m19913I3(mediationBannerAd.getView()));
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
        }
        return new bc0(this.f28810b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
