package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class qw1 extends InterstitialAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f26979a;

    /* renamed from: b */
    final /* synthetic */ String f26980b;

    /* renamed from: c */
    final /* synthetic */ xw1 f26981c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qw1(xw1 xw1Var, String str, String str2) {
        this.f26981c = xw1Var;
        this.f26979a = str;
        this.f26980b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m28045i;
        xw1 xw1Var = this.f26981c;
        m28045i = xw1.m28045i(loadAdError);
        xw1Var.m28046j(m28045i, this.f26980b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        this.f26981c.m28049e(this.f26979a, interstitialAd, this.f26980b);
    }
}
