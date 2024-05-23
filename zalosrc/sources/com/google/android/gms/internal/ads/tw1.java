package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tw1 extends RewardedInterstitialAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f28643a;

    /* renamed from: b */
    final /* synthetic */ String f28644b;

    /* renamed from: c */
    final /* synthetic */ xw1 f28645c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tw1(xw1 xw1Var, String str, String str2) {
        this.f28645c = xw1Var;
        this.f28643a = str;
        this.f28644b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m28045i;
        xw1 xw1Var = this.f28645c;
        m28045i = xw1.m28045i(loadAdError);
        xw1Var.m28046j(m28045i, this.f28644b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.f28645c.m28049e(this.f28643a, rewardedInterstitialAd, this.f28644b);
    }
}
