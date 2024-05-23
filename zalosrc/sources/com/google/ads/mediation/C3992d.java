package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: com.google.ads.mediation.d */
/* loaded from: classes2.dex */
final class C3992d extends FullScreenContentCallback {

    /* renamed from: a */
    final AbstractAdViewAdapter f15787a;

    /* renamed from: b */
    final MediationInterstitialListener f15788b;

    public C3992d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f15787a = abstractAdViewAdapter;
        this.f15788b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f15788b.onAdClosed(this.f15787a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f15788b.onAdOpened(this.f15787a);
    }
}
