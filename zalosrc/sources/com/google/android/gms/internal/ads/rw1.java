package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class rw1 extends RewardedAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f27394a;

    /* renamed from: b */
    final /* synthetic */ String f27395b;

    /* renamed from: c */
    final /* synthetic */ xw1 f27396c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rw1(xw1 xw1Var, String str, String str2) {
        this.f27396c = xw1Var;
        this.f27394a = str;
        this.f27395b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m28045i;
        xw1 xw1Var = this.f27396c;
        m28045i = xw1.m28045i(loadAdError);
        xw1Var.m28046j(m28045i, this.f27395b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.f27396c.m28049e(this.f27394a, rewardedAd, this.f27395b);
    }
}
