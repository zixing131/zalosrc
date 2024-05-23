package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public final class kh0 implements MediationRewardedAdCallback {

    /* renamed from: a */
    private final ba0 f23321a;

    public kh0(ba0 ba0Var) {
        this.f23321a = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdClosed.");
        try {
            this.f23321a.zzf();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToShow.");
        yk0.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.f23321a.mo20455z(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdOpened.");
        try {
            this.f23321a.zzp();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onUserEarnedReward.");
        try {
            this.f23321a.mo20446N3(new lh0(rewardItem));
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onVideoComplete.");
        try {
            this.f23321a.mo20447a();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onVideoStart.");
        try {
            this.f23321a.mo20451k();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called reportAdClicked.");
        try {
            this.f23321a.zze();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called reportAdImpression.");
        try {
            this.f23321a.zzm();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToShow.");
        yk0.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f23321a.mo20454x(str);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
