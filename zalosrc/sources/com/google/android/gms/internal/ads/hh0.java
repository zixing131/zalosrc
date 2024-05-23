package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes2.dex */
public final class hh0 extends ah0 {

    /* renamed from: p */
    private final RewardedAdLoadCallback f21747p;

    /* renamed from: q */
    private final RewardedAd f21748q;

    public hh0(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.f21747p = rewardedAdLoadCallback;
        this.f21748q = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zze(int i11) {
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zzf(zze zzeVar) {
        if (this.f21747p != null) {
            this.f21747p.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f21747p;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.f21748q);
        }
    }
}
