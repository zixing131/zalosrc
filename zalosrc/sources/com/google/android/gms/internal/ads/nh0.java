package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* loaded from: classes2.dex */
public final class nh0 extends ah0 {

    /* renamed from: p */
    private final RewardedInterstitialAdLoadCallback f25182p;

    /* renamed from: q */
    private final oh0 f25183q;

    public nh0(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, oh0 oh0Var) {
        this.f25182p = rewardedInterstitialAdLoadCallback;
        this.f25183q = oh0Var;
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zze(int i11) {
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zzf(zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f25182p;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zzg() {
        oh0 oh0Var;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f25182p;
        if (rewardedInterstitialAdLoadCallback != null && (oh0Var = this.f25183q) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(oh0Var);
        }
    }
}
