package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

/* loaded from: classes2.dex */
public interface MediationInterstitialAdCallback extends MediationAdCallback {
    void onAdFailedToShow(AdError adError);

    @Deprecated
    void onAdFailedToShow(String str);

    void onAdLeftApplication();
}
