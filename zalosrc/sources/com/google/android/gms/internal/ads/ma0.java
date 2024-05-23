package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public final class ma0 implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback {

    /* renamed from: a */
    private final ba0 f24448a;

    public ma0(ba0 ba0Var) {
        this.f24448a = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdClosed.");
        try {
            this.f24448a.zzf();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToShow.");
        yk0.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.f24448a.mo20455z(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f24448a.zzn();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdOpened.");
        try {
            this.f24448a.zzp();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onVideoComplete.");
        try {
            this.f24448a.mo20447a();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onVideoPause.");
        try {
            this.f24448a.mo20449g();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onVideoPlay.");
        try {
            this.f24448a.zzx();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called reportAdClicked.");
        try {
            this.f24448a.zze();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called reportAdImpression.");
        try {
            this.f24448a.zzm();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToShow.");
        yk0.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f24448a.mo20454x(str);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
