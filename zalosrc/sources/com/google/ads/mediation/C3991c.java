package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: com.google.ads.mediation.c */
/* loaded from: classes2.dex */
final class C3991c extends InterstitialAdLoadCallback {

    /* renamed from: a */
    final AbstractAdViewAdapter f15785a;

    /* renamed from: b */
    final MediationInterstitialListener f15786b;

    public C3991c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f15785a = abstractAdViewAdapter;
        this.f15786b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f15786b.onAdFailedToLoad(this.f15785a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f15785a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        interstitialAd2.setFullScreenContentCallback(new C3992d(abstractAdViewAdapter, this.f15786b));
        this.f15786b.onAdLoaded(this.f15785a);
    }
}
